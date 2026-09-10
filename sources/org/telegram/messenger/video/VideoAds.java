package org.telegram.messenger.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.n3;
import gg.a0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h41;
import qg.a1;
import w7.a6;
public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private pc bulletin;
    private wc bulletinFactory;
    private long bulletinShowTime;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private w70 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private a1 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 0);

    public static class AdLayout extends mb {
        public final ImageView buttonView;
        public final w9 imageView;
        private final LinearLayout linearLayout;
        public final m90 subtitleTextView;
        public final l5 titleTextView;

        public AdLayout(Context context, f6 f6Var) {
            super(context, f6Var);
            setBackground(getThemedColor(j6.Fi));
            w9 w9Var = new w9(context);
            this.imageView = w9Var;
            w9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(w9Var, a6.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(j6.Hi);
            int themedColor2 = getThemedColor(j6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, a6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            l5 l5Var = new l5(context);
            this.titleTextView = l5Var;
            l5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l5Var.setTextColor(themedColor);
            l5Var.setTextSize(14);
            l5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(l5Var);
            m90 m90Var = new m90(context, null);
            this.subtitleTextView = m90Var;
            m90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m90Var.setTextColor(themedColor);
            m90Var.setLinkTextColor(themedColor2);
            m90Var.setTypeface(Typeface.SANS_SERIF);
            m90Var.setTextSize(1, 13.0f);
            linearLayout.addView(m90Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(j6.f0(j6.l1(0.15f, getThemedColor(j6.Oh)), 7, -1));
            addView(imageView, a6.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(a6.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override
        public void onShow() {
            super.onShow();
        }
    }

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final d6 showCrossAnimated;
        private final d6 showTimerAnimated;
        private final long startTime;
        private final n6 timer;
        private final d6 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j3) {
            n6 n6Var = new n6(false, true, true, false);
            this.timer = n6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i10 * 1000;
            this.max_display_duration = i11 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            n6Var.setCallback(view);
            n6Var.f25425b = 17;
            n6Var.t(AndroidUtilities.dp(12.0f));
            n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            n6Var.G = AndroidUtilities.displaySize.x;
            n6Var.r(-1);
            wr wrVar = wr.h;
            this.showCrossAnimated = new d6(view, 0L, 420L, wrVar);
            this.showTimerAnimated = new d6(view, 0L, 420L, wrVar);
            this.timerScaleAnimated = new d6(view, 0L, 420L, wrVar);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z10;
            float f7;
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j3 = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j3);
            long j10 = this.min_display_duration;
            float f10 = ((float) max) / ((float) j10);
            boolean z11 = false;
            if (j3 < j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.showTimerAnimated.e(z10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            d6 d6Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f7 = 0.825f;
            } else if (str.length() >= 2) {
                f7 = 0.875f;
            } else {
                f7 = 1.0f;
            }
            float d = d6Var.d(f7, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.q(str, true, true);
            this.timer.l(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            n6 n6Var = this.timer;
            n6Var.f25442w = (int) (this.alpha * e);
            n6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, this.paint);
            d6 d6Var2 = this.showCrossAnimated;
            if ((1.0f - f10) * 360.0f > 75.0f) {
                z11 = true;
            }
            float e7 = d6Var2.e(z11);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e7) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e);
            this.paint.setAlpha((int) (this.alpha * e7));
            float f11 = lerp - lerp3;
            float f12 = lerp2 - lerp3;
            float f13 = lerp + lerp3;
            float f14 = lerp3 + lerp2;
            canvas.drawLine(f11, f12, f13, f14, this.paint);
            canvas.drawLine(f11, f14, f13, f12, this.paint);
            if (e > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public boolean isCrossAvailable() {
            long currentTimeMillis;
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis() - this.minusTime;
            }
            if (currentTimeMillis - this.startTime > this.min_display_duration) {
                return true;
            }
            return false;
        }

        @Override
        public void setAlpha(int i10) {
            this.alpha = i10;
        }

        public void setColor(int i10) {
            this.timer.r(i10);
            this.paint.setColor(i10);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setPaused(boolean z10) {
            if (this.paused == z10) {
                return;
            }
            this.paused = z10;
            if (z10) {
                this.pausedTime = System.currentTimeMillis();
                return;
            }
            this.minusTime += System.currentTimeMillis() - this.pausedTime;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i10, long j3) {
            this.currentAccount = i10;
            this.dialogId = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                VideoAdsLocation videoAdsLocation = (VideoAdsLocation) obj;
                if (this.currentAccount == videoAdsLocation.currentAccount && this.dialogId == videoAdsLocation.dialogId) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), Long.valueOf(this.dialogId));
        }
    }

    private VideoAds(int i10, long j3, int i11, wc wcVar) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j3;
        this.msg_id = i11;
        this.lastTime = System.currentTimeMillis();
        init(wcVar);
    }

    private void checkPopupShownCallback() {
        if (this.lastPopupShown != isPopupShown()) {
            this.lastPopupShown = isPopupShown();
            Runnable runnable = this.onPopupCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void dropCache() {
        cached.clear();
    }

    private void init(wc wcVar) {
        this.bulletinFactory = wcVar;
        if (this.currentBulletinPassedTime <= 0) {
            this.lastTime = System.currentTimeMillis();
            if (this.waitingPaused) {
                this.waitingTimeSince = System.currentTimeMillis();
            }
            this.first = true;
        }
        if (!this.loaded) {
            load();
        } else {
            schedule();
        }
    }

    public void lambda$load$0(TLObject tLObject) {
        if (!this.loading) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_sponsoredMessages) {
            TLRPC.TL_messages_sponsoredMessages tL_messages_sponsoredMessages = (TLRPC.TL_messages_sponsoredMessages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_sponsoredMessages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_sponsoredMessages.chats, false);
            this.ads.addAll(tL_messages_sponsoredMessages.messages);
            this.start_delay = tL_messages_sponsoredMessages.start_delay;
            this.between_delay = tL_messages_sponsoredMessages.between_delay;
        }
        this.loaded = true;
        this.loading = false;
        schedule();
    }

    public void lambda$load$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new w(12, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(w70 w70Var) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            w70Var.u();
            pc pcVar = this.bulletin;
            if (pcVar != null) {
                pcVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, w70 w70Var) {
        int i10 = this.currentAccount;
        long j3 = this.dialogId;
        wc wcVar = this.bulletinFactory;
        bq0 bq0Var = new bq0();
        d dVar = new d(this, 1);
        Objects.requireNonNull(w70Var);
        a aVar = new a(w70Var, 1);
        int i11 = h41.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new x70(context, bq0Var, j3, bArr, aVar, wcVar, dVar, i10));
    }

    public void lambda$show$15(w70 w70Var) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            w70Var.u();
            pc pcVar = this.bulletin;
            if (pcVar != null) {
                pcVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(Utilities.Callback callback) {
        callback.run(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(org.telegram.ui.Components.pc r20, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r21, android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, org.telegram.messenger.video.VideoAds.AdLayout r24, org.telegram.messenger.Utilities.Callback r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.pc, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.f6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.Utilities$Callback, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        nf.f.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            pc pcVar = this.bulletin;
            if (pcVar != null) {
                pcVar.b();
            }
        } else if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            pc pcVar2 = this.bulletin;
            if (pcVar2 != null) {
                pcVar2.b();
                this.bulletin = null;
            }
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(pc pcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        pc pcVar2 = this.bulletin;
        if (pcVar2 != null && pcVar2 == pcVar) {
            pcVar2.f26081j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            pcVar2.i(true);
        }
    }

    public void lambda$show$4(pc pcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        pc pcVar2 = this.bulletin;
        if (pcVar2 != null && pcVar2 == pcVar && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(runnable);
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j3) - jArr2[0];
            long j10 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j11 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j11 <= 0) {
                pc pcVar3 = this.bulletin;
                if (pcVar3 != null) {
                    pcVar3.b();
                    this.bulletin = null;
                }
            } else if (j10 <= 0) {
                pc pcVar4 = this.bulletin;
                pcVar4.f26081j = (int) j11;
                pcVar4.i(true);
            } else {
                AndroidUtilities.runOnUIThread(runnable, j10);
            }
        }
    }

    public void lambda$show$5(pc pcVar, boolean[] zArr) {
        pc pcVar2 = this.bulletin;
        if (pcVar2 != null && pcVar2 == pcVar && !zArr[0]) {
            zArr[0] = true;
            w70 w70Var = this.currentMenu;
            if (w70Var != null) {
                w70Var.u();
                this.currentMenu = null;
            }
            this.bulletin = null;
            this.currentBulletinPassedTime = 0L;
            this.lastTime = System.currentTimeMillis();
            if (this.waitingPaused) {
                this.waitingTimeSince = System.currentTimeMillis();
            }
            if (!this.ads.isEmpty()) {
                this.ads.remove(0);
            }
            this.first = false;
            schedule();
        }
    }

    public void lambda$show$7(w70 w70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        w70Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        nf.f.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(a1 a1Var) {
        if (a1Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() || !MessagesController.getInstance(this.currentAccount).isSponsoredDisabled()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
                tL_messages_getSponsoredMessages.msg_id = this.msg_id;
                this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        VideoAds.this.lambda$load$1(tLObject, tL_error);
                    }
                });
            }
        }
    }

    public static VideoAds make(int i10, long j3, int i11, wc wcVar) {
        wc wcVar2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j3);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds != null && ((videoAds.msg_id == i11 && System.currentTimeMillis() - videoAds.lastTime <= 180000) || !videoAds.ads.isEmpty())) {
            wcVar2 = wcVar;
        } else {
            HashMap<VideoAdsLocation, VideoAds> hashMap = cached;
            wcVar2 = wcVar;
            VideoAds videoAds2 = new VideoAds(i10, j3, i11, wcVar2);
            hashMap.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        }
        videoAds.init(wcVar2);
        return videoAds;
    }

    private void schedule() {
        int i10;
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i10 = this.start_delay;
            } else {
                i10 = this.between_delay;
            }
            AndroidUtilities.runOnUIThread(this.showRunnable, Math.max(0L, (i10 * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        pc pcVar = this.bulletin;
        if (pcVar != null) {
            pcVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        f6 f6Var = this.bulletinFactory.f28749c;
        AdLayout adLayout = new AdLayout(W, f6Var) {
            {
                VideoAds.this = this;
            }

            @Override
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        l5 l5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i10 = j6.Oh;
        l5Var.i(new AdOptionsDrawable(W2, j6.v0(i10, this.bulletinFactory.f28749c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.k(ImageLocation.getForDocument(tL_sponsoredMessage.media.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), tL_sponsoredMessage.media.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    adLayout.imageView.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_sponsoredMessage.media.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.media.photo.sizes, 48, true, closestPhotoSizeWithSize, false), tL_sponsoredMessage.media.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                adLayout.imageView.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tL_sponsoredMessage.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.photo.sizes, 48, true, closestPhotoSizeWithSize2, false), tL_sponsoredMessage.photo), "48_48", 0L, null, null, 0);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(j6.v0(i10, this.bulletinFactory.f28749c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new n3(11, this, closeDrawable));
        final pc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.f26092u = false;
        b10.i(false);
        final a0 a0Var = new a0(this, b10, tL_sponsoredMessage, 17);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, a0Var, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(a0Var, tL_sponsoredMessage.min_display_duration * 1000);
        pc pcVar2 = this.bulletin;
        pcVar2.f26089r = false;
        pcVar2.v = new a0(this, b10, new boolean[1], 18);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, f6Var, adLayout, callback, 0));
        pc pcVar3 = this.bulletin;
        n3 n3Var = new n3(12, this, tL_sponsoredMessage);
        tb tbVar = pcVar3.e;
        if (tbVar != null) {
            tbVar.setOnClickListener(n3Var);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        a1 a1Var = this.premiumSheet;
        if (a1Var != null) {
            a1Var.dismiss();
            this.premiumSheet = null;
        }
        a1 a1Var2 = new a1(new p2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.G1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                if (findActivity == null) {
                    return LaunchActivity.G1;
                }
                return findActivity;
            }
        }, 3, true);
        this.premiumSheet = a1Var2;
        a1Var2.setOnDismissListener(new w(11, this, a1Var2));
        a1Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        w70 w70Var = this.currentMenu;
        if (w70Var == null || !w70Var.D()) {
            a1 a1Var = this.premiumSheet;
            if (a1Var != null && a1Var.isShown()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage != null) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
            tL_messages_clickSponsoredMessage.media = false;
            tL_messages_clickSponsoredMessage.fullscreen = false;
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
            }
        }
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage != null) {
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
            }
        }
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused != z10) {
            this.waitingPaused = z10;
            AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
            if (z10) {
                this.waitingTimeSince = System.currentTimeMillis();
                return;
            }
            this.lastTime += System.currentTimeMillis() - this.waitingTimeSince;
            if (this.bulletin == null) {
                schedule();
            }
        }
    }

    public void stop() {
        if (this.bulletin != null) {
            this.currentBulletinPassedTime = System.currentTimeMillis() - this.bulletinShowTime;
            if (!this.ads.isEmpty() && this.currentBulletinPassedTime > this.ads.get(0).min_display_duration * 1000) {
                this.currentBulletinPassedTime = 0L;
                this.ads.remove(0);
                this.first = false;
            }
            this.bulletin.b();
            this.bulletin = null;
        } else {
            this.currentBulletinPassedTime = 0L;
        }
        w70 w70Var = this.currentMenu;
        if (w70Var != null) {
            w70Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final t01 text = new t01(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i10) {
            this.color = i10;
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            rectF.left += AndroidUtilities.dp(4.0f);
            this.backgroundPaint.setColor(j6.l1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + AndroidUtilities.dp(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - AndroidUtilities.dp(12.99f), getBounds().centerY() - AndroidUtilities.dp(5.665f), getBounds().right - AndroidUtilities.dp(1.66f), AndroidUtilities.dp(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.l() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(18.0f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i10) {
            this.alpha = i10 / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
