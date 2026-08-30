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
import eg.o1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import k7.b6;
import lh.p6;
import nh.i0;
import nh.n4;
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
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k31;
public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private ic bulletin;
    private qc bulletinFactory;
    private long bulletinShowTime;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private o70 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private o1 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 0);

    public static class AdLayout extends eb {
        public final ImageView buttonView;
        public final p9 imageView;
        private final LinearLayout linearLayout;
        public final e90 subtitleTextView;
        public final k5 titleTextView;

        public AdLayout(Context context, f6 f6Var) {
            super(context, f6Var);
            setBackground(getThemedColor(j6.Fi));
            p9 p9Var = new p9(context);
            this.imageView = p9Var;
            p9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(p9Var, b6.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(j6.Hi);
            int themedColor2 = getThemedColor(j6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            k5 k5Var = new k5(context);
            this.titleTextView = k5Var;
            k5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k5Var.setTextColor(themedColor);
            k5Var.setTextSize(14);
            k5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(k5Var);
            e90 e90Var = new e90(context, null);
            this.subtitleTextView = e90Var;
            e90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            e90Var.setTextColor(themedColor);
            e90Var.setLinkTextColor(themedColor2);
            e90Var.setTypeface(Typeface.SANS_SERIF);
            e90Var.setTextSize(1, 13.0f);
            linearLayout.addView(e90Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(j6.f0(j6.l1(0.15f, getThemedColor(j6.Oh)), 7, -1));
            addView(imageView, b6.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(b6.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        private final z5 showCrossAnimated;
        private final z5 showTimerAnimated;
        private final long startTime;
        private final org.telegram.ui.Components.j6 timer;
        private final z5 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j10) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
            this.timer = j6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = i10 * 1000;
            this.max_display_duration = i11 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            j6Var.setCallback(view);
            j6Var.f25884b = 17;
            j6Var.t(AndroidUtilities.dp(12.0f));
            j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            j6Var.G = AndroidUtilities.displaySize.x;
            j6Var.r(-1);
            nr nrVar = nr.h;
            this.showCrossAnimated = new z5(view, 0L, 420L, nrVar);
            this.showTimerAnimated = new z5(view, 0L, 420L, nrVar);
            this.timerScaleAnimated = new z5(view, 0L, 420L, nrVar);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z4;
            float f10;
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j10 = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j10);
            long j11 = this.min_display_duration;
            float f11 = ((float) max) / ((float) j11);
            boolean z10 = false;
            if (j10 < j11) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e = this.showTimerAnimated.e(z4);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            z5 z5Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f10 = 0.825f;
            } else if (str.length() >= 2) {
                f10 = 0.875f;
            } else {
                f10 = 1.0f;
            }
            float d = z5Var.d(f10, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.q(str, true, true);
            this.timer.l(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            org.telegram.ui.Components.j6 j6Var = this.timer;
            j6Var.f25901w = (int) (this.alpha * e);
            j6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, this.paint);
            z5 z5Var2 = this.showCrossAnimated;
            if ((1.0f - f11) * 360.0f > 75.0f) {
                z10 = true;
            }
            float e6 = z5Var2.e(z10);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e6) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e);
            this.paint.setAlpha((int) (this.alpha * e6));
            float f12 = lerp - lerp3;
            float f13 = lerp2 - lerp3;
            float f14 = lerp + lerp3;
            float f15 = lerp3 + lerp2;
            canvas.drawLine(f12, f13, f14, f15, this.paint);
            canvas.drawLine(f12, f15, f14, f13, this.paint);
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

        public void setPaused(boolean z4) {
            if (this.paused == z4) {
                return;
            }
            this.paused = z4;
            if (z4) {
                this.pausedTime = System.currentTimeMillis();
                return;
            }
            this.minusTime += System.currentTimeMillis() - this.pausedTime;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i10, long j10) {
            this.currentAccount = i10;
            this.dialogId = j10;
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

    private VideoAds(int i10, long j10, int i11, qc qcVar) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j10;
        this.msg_id = i11;
        this.lastTime = System.currentTimeMillis();
        init(qcVar);
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

    private void init(qc qcVar) {
        this.bulletinFactory = qcVar;
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
        AndroidUtilities.runOnUIThread(new n4(26, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(o70 o70Var) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            o70Var.u();
            ic icVar = this.bulletin;
            if (icVar != null) {
                icVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, o70 o70Var) {
        int i10 = this.currentAccount;
        long j10 = this.dialogId;
        qc qcVar = this.bulletinFactory;
        i0 i0Var = new i0();
        d dVar = new d(this, 1);
        Objects.requireNonNull(o70Var);
        a aVar = new a(o70Var, 1);
        int i11 = k31.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new p70(context, i0Var, j10, bArr, aVar, qcVar, dVar, i10));
    }

    public void lambda$show$15(o70 o70Var) {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            o70Var.u();
            ic icVar = this.bulletin;
            if (icVar != null) {
                icVar.i(true);
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

    public void lambda$show$17(org.telegram.ui.Components.ic r20, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r21, android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, org.telegram.messenger.video.VideoAds.AdLayout r24, org.telegram.messenger.Utilities.Callback r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.ic, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.f6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.Utilities$Callback, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        af.g.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            ic icVar = this.bulletin;
            if (icVar != null) {
                icVar.b();
            }
        } else if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            ic icVar2 = this.bulletin;
            if (icVar2 != null) {
                icVar2.b();
                this.bulletin = null;
            }
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(ic icVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        ic icVar2 = this.bulletin;
        if (icVar2 != null && icVar2 == icVar) {
            icVar2.f25672j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            icVar2.i(true);
        }
    }

    public void lambda$show$4(ic icVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        ic icVar2 = this.bulletin;
        if (icVar2 != null && icVar2 == icVar && bool.booleanValue() != zArr[0]) {
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
            long currentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
            long j11 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j12 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j12 <= 0) {
                ic icVar3 = this.bulletin;
                if (icVar3 != null) {
                    icVar3.b();
                    this.bulletin = null;
                }
            } else if (j11 <= 0) {
                ic icVar4 = this.bulletin;
                icVar4.f25672j = (int) j12;
                icVar4.i(true);
            } else {
                AndroidUtilities.runOnUIThread(runnable, j11);
            }
        }
    }

    public void lambda$show$5(ic icVar, boolean[] zArr) {
        ic icVar2 = this.bulletin;
        if (icVar2 != null && icVar2 == icVar && !zArr[0]) {
            zArr[0] = true;
            o70 o70Var = this.currentMenu;
            if (o70Var != null) {
                o70Var.u();
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

    public void lambda$show$7(o70 o70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        o70Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        af.g.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(o1 o1Var) {
        if (o1Var == this.premiumSheet) {
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

    public static VideoAds make(int i10, long j10, int i11, qc qcVar) {
        qc qcVar2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j10);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds != null && ((videoAds.msg_id == i11 && System.currentTimeMillis() - videoAds.lastTime <= 180000) || !videoAds.ads.isEmpty())) {
            qcVar2 = qcVar;
        } else {
            HashMap<VideoAdsLocation, VideoAds> hashMap = cached;
            qcVar2 = qcVar;
            VideoAds videoAds2 = new VideoAds(i10, j10, i11, qcVar2);
            hashMap.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        }
        videoAds.init(qcVar2);
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
        ic icVar = this.bulletin;
        if (icVar != null) {
            icVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        f6 f6Var = this.bulletinFactory.f28114c;
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
        k5 k5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i10 = j6.Oh;
        k5Var.i(new AdOptionsDrawable(W2, j6.v0(i10, this.bulletinFactory.f28114c)));
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
        closeDrawable.setColor(j6.v0(i10, this.bulletinFactory.f28114c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new cg.n(29, this, closeDrawable));
        final ic b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.f25683u = false;
        b10.i(false);
        final p6 p6Var = new p6(this, b10, tL_sponsoredMessage, 12);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, p6Var, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(p6Var, tL_sponsoredMessage.min_display_duration * 1000);
        ic icVar2 = this.bulletin;
        icVar2.f25680r = false;
        icVar2.v = new p6(this, b10, new boolean[1], 13);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, f6Var, adLayout, callback, 0));
        ic icVar3 = this.bulletin;
        g gVar = new g(0, this, tL_sponsoredMessage);
        nb nbVar = icVar3.e;
        if (nbVar != null) {
            nbVar.setOnClickListener(gVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        o1 o1Var = this.premiumSheet;
        if (o1Var != null) {
            o1Var.dismiss();
            this.premiumSheet = null;
        }
        o1 o1Var2 = new o1(new p2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.D1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                if (findActivity == null) {
                    return LaunchActivity.D1;
                }
                return findActivity;
            }
        }, 3, true);
        this.premiumSheet = o1Var2;
        o1Var2.setOnDismissListener(new n4(25, this, o1Var2));
        o1Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        o70 o70Var = this.currentMenu;
        if (o70Var == null || !o70Var.D()) {
            o1 o1Var = this.premiumSheet;
            if (o1Var != null && o1Var.isShown()) {
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

    public void setWaitingPaused(boolean z4) {
        if (this.waitingPaused != z4) {
            this.waitingPaused = z4;
            AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
            if (z4) {
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
        o70 o70Var = this.currentMenu;
        if (o70Var != null) {
            o70Var.u();
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
        public final k01 text = new k01(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
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
