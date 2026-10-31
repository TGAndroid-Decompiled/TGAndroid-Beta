package org.telegram.messenger.video;

import ag.t0;
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
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import kg.i1;
import li.s;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.q20;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c01;
import w7.b6;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private wb bulletin;
    private cc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private z60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private i1 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 1);

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final t5 showCrossAnimated;
        private final t5 showTimerAnimated;
        private final long startTime;
        private final e6 timer;
        private final t5 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j10) {
            e6 e6Var = new e6(false, true, true);
            this.timer = e6Var;
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
            e6Var.setCallback(view);
            e6Var.f25695b = 17;
            e6Var.w(i0.L(12.0f));
            e6Var.x(i0.o1("fonts/num.otf"));
            e6Var.M = i0.f16026q.x;
            e6Var.u(-1);
            gr grVar = gr.h;
            this.showCrossAnimated = new t5(view, 0L, 420L, grVar);
            this.showTimerAnimated = new t5(view, 0L, 420L, grVar);
            this.timerScaleAnimated = new t5(view, 0L, 420L, grVar);
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
            long j10 = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j10);
            long j11 = this.min_display_duration;
            float f10 = ((float) max) / ((float) j11);
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            boolean z11 = false;
            if (i10 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.showTimerAnimated.d(z10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            t5 t5Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f7 = 0.825f;
            } else if (str.length() >= 2) {
                f7 = 0.875f;
            } else {
                f7 = 1.0f;
            }
            float e = t5Var.e(false, f7);
            canvas.save();
            canvas.scale(e, e, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            e6 e6Var = this.timer;
            e6Var.B = (int) (this.alpha * d);
            e6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(i0.L(2.0f));
            RectF rectF = i0.P;
            rectF.set(centerX - i0.L(9.0f), centerY - i0.L(9.0f), i0.L(9.0f) + centerX, i0.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, this.paint);
            t5 t5Var2 = this.showCrossAnimated;
            if ((1.0f - f10) * 360.0f > 75.0f) {
                z11 = true;
            }
            float d10 = t5Var2.d(z11);
            float T1 = i0.T1(centerX, i0.L(8.0f) + centerX, d);
            float T12 = i0.T1(centerY, centerY - i0.L(8.0f), d);
            float T13 = i0.T1(0.35f, 1.0f, d10) * i0.W1(d, i0.L(5.0f), i0.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d10));
            float f11 = T1 - T13;
            float f12 = T12 - T13;
            float f13 = T1 + T13;
            float f14 = T13 + T12;
            canvas.drawLine(f11, f12, f13, f14, this.paint);
            canvas.drawLine(f11, f14, f13, f12, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return i0.L(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return i0.L(24.0f);
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
            this.timer.u(i10);
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

    public static class VideoAdsCache {
        final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
        int betweenDelay;
        long loadTime;
        boolean loaded;
        final int msgId;
        int startDelay;

        public VideoAdsCache(int i10) {
            this.msgId = i10;
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

    private VideoAds(int i10, long j10, int i11, cc ccVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j10;
        this.msg_id = i11;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(ccVar);
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
        cached.evictAll();
    }

    private void init(cc ccVar) {
        this.bulletinFactory = ccVar;
        this.lastTime = System.currentTimeMillis();
        this.first = true;
        VideoAdsCache videoAdsCache = this.cache;
        if (videoAdsCache.loaded) {
            this.start_delay = videoAdsCache.startDelay;
            this.between_delay = videoAdsCache.betweenDelay;
            this.ads.addAll(videoAdsCache.ads);
            this.loaded = true;
            schedule();
            return;
        }
        load();
    }

    public void lambda$load$0(TLObject tLObject) {
        if (!this.loading) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_sponsoredMessages) {
            TLRPC.TL_messages_sponsoredMessages tL_messages_sponsoredMessages = (TLRPC.TL_messages_sponsoredMessages) tLObject;
            vp.r1(this.currentAccount).V3(tL_messages_sponsoredMessages.users, false);
            vp.r1(this.currentAccount).P3(tL_messages_sponsoredMessages.chats, false);
            this.ads.addAll(tL_messages_sponsoredMessages.messages);
            this.start_delay = tL_messages_sponsoredMessages.start_delay;
            this.between_delay = tL_messages_sponsoredMessages.between_delay;
            this.cache.ads.clear();
            this.cache.ads.addAll(tL_messages_sponsoredMessages.messages);
            VideoAdsCache videoAdsCache = this.cache;
            videoAdsCache.startDelay = tL_messages_sponsoredMessages.start_delay;
            videoAdsCache.betweenDelay = tL_messages_sponsoredMessages.between_delay;
        }
        this.cache.loadTime = System.currentTimeMillis();
        this.cache.loaded = true;
        this.loaded = true;
        this.loading = false;
        schedule();
    }

    public void lambda$load$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new mh.k(10, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        i0.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(z60 z60Var) {
        if (d20.i(this.currentAccount).q()) {
            z60Var.u();
            wb wbVar = this.bulletin;
            if (wbVar != null) {
                wbVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(cd.L0(2131754488, null)).j();
            vp.r1(this.currentAccount).o0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, z60 z60Var) {
        int i10 = this.currentAccount;
        long j10 = this.dialogId;
        cc ccVar = this.bulletinFactory;
        ro0 ro0Var = new ro0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(z60Var);
        a aVar = new a(z60Var, 1);
        int i11 = c01.f36350s1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new a70(context, ro0Var, j10, bArr, aVar, ccVar, dVar, i10));
    }

    public void lambda$show$15(z60 z60Var) {
        if (d20.i(this.currentAccount).q()) {
            z60Var.u();
            wb wbVar = this.bulletin;
            if (wbVar != null) {
                wbVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(cd.L0(2131754488, null)).j();
            vp.r1(this.currentAccount).o0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(q20 q20Var) {
        q20Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(org.telegram.ui.Components.wb r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, org.telegram.ui.ActionBar.p6 r25, org.telegram.messenger.video.VideoAds.AdLayout r26, org.telegram.messenger.q20 r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.wb, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.p6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.q20, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        gf.f.q(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, vp.r1(d20.f15147s0).f18777e6, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            wb wbVar = this.bulletin;
            if (wbVar != null) {
                wbVar.b();
            }
        } else if (d20.i(this.currentAccount).q()) {
            wb wbVar2 = this.bulletin;
            if (wbVar2 != null) {
                wbVar2.b();
                this.bulletin = null;
            }
            vp.r1(this.currentAccount).o0(true);
            this.bulletinFactory.c(cd.L0(2131754488, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(wb wbVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        wb wbVar2 = this.bulletin;
        if (wbVar2 != null && wbVar2 == wbVar) {
            wbVar2.f32135j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            wbVar2.i(true);
        }
    }

    public void lambda$show$4(wb wbVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        wb wbVar2 = this.bulletin;
        if (wbVar2 != null && wbVar2 == wbVar && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                i0.r(runnable);
                return;
            }
            i0.r(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
            long j11 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j12 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j12 <= 0) {
                wb wbVar3 = this.bulletin;
                if (wbVar3 != null) {
                    wbVar3.b();
                    this.bulletin = null;
                }
            } else if (j11 <= 0) {
                wb wbVar4 = this.bulletin;
                wbVar4.f32135j = (int) j12;
                wbVar4.i(true);
            } else {
                i0.h3(runnable, j11);
            }
        }
    }

    public void lambda$show$5(wb wbVar, boolean[] zArr) {
        wb wbVar2 = this.bulletin;
        if (wbVar2 != null && wbVar2 == wbVar && !zArr[0]) {
            zArr[0] = true;
            z60 z60Var = this.currentMenu;
            if (z60Var != null) {
                z60Var.u();
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

    public void lambda$show$7(z60 z60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        z60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        gf.f.q(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, vp.r1(this.currentAccount).f18777e6, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        i0.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        i0.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(i1 i1Var) {
        if (i1Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!d20.i(this.currentAccount).q() || !vp.r1(this.currentAccount).D2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = vp.r1(this.currentAccount).i1(this.dialogId);
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

    public static VideoAds make(int i10, long j10, int i11, cc ccVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j10);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i11 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i11);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i10, j10, i11, ccVar, videoAdsCache);
    }

    private void schedule() {
        int i10;
        i0.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i10 = this.start_delay;
            } else {
                i10 = this.between_delay;
            }
            i0.h3(this.showRunnable, Math.max(0L, (i10 * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        wb wbVar = this.bulletin;
        if (wbVar != null) {
            wbVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        p6 p6Var = this.bulletinFactory.f25043c;
        AdLayout adLayout = new AdLayout(W, p6Var) {
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

            @Override
            public void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        u5 u5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i10 = t6.Ci;
        u5Var.i(new AdOptionsDrawable(W2, t6.w0(i10, this.bulletinFactory.f25043c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, ic.b(tL_sponsoredMessage.media.document), ic.c(b8.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w9 = b8.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, ic.i(w9, tL_sponsoredMessage.media.photo), ic.i(b8.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w9, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w10 = b8.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, ic.i(w10, tL_sponsoredMessage.photo), ic.i(b8.w(tL_sponsoredMessage.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(t6.w0(i10, this.bulletinFactory.f25043c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new t0(15, this, closeDrawable));
        final wb b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.f32146u = false;
        b10.i(false);
        final s sVar = new s(this, b10, tL_sponsoredMessage, 13);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        q20 q20Var = new q20() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, sVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        i0.h3(sVar, tL_sponsoredMessage.min_display_duration * 1000);
        wb wbVar2 = this.bulletin;
        wbVar2.f32143r = false;
        wbVar2.v = new s(this, b10, new boolean[1], 14);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, p6Var, adLayout, q20Var, 0));
        wb wbVar3 = this.bulletin;
        t0 t0Var = new t0(16, this, tL_sponsoredMessage);
        bb bbVar = wbVar3.e;
        if (bbVar != null) {
            bbVar.setOnClickListener(t0Var);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        i1 i1Var = this.premiumSheet;
        if (i1Var != null) {
            i1Var.dismiss();
            this.premiumSheet = null;
        }
        i1 i1Var2 = new i1(new k2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return i0.W(LaunchActivity.I1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = i0.W(w0.f19025b);
                if (W == null) {
                    return LaunchActivity.I1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = i1Var2;
        i1Var2.o(new mh.k(9, this, i1Var2));
        i1Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        z60 z60Var = this.currentMenu;
        if (z60Var == null || !z60Var.D()) {
            i1 i1Var = this.premiumSheet;
            if (i1Var != null && !i1Var.I) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z10 = v2.f18448a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z10 = v2.f18448a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused != z10) {
            this.waitingPaused = z10;
            i0.r(this.showRunnable);
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
        z60 z60Var = this.currentMenu;
        if (z60Var != null) {
            z60Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        i0.r(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdLayout extends ta {
        public final ImageView buttonView;
        public final g9 imageView;
        private final LinearLayout linearLayout;
        public final p80 subtitleTextView;
        public final u5 titleTextView;

        public AdLayout(Context context, p6 p6Var) {
            super(context, p6Var);
            setBackground(getThemedColor(t6.tj));
            g9 g9Var = new g9(context);
            this.imageView = g9Var;
            g9Var.setRoundRadius(i0.L(48.0f));
            addView(g9Var, b6.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i10 = t6.vj;
            getThemedColor(i10);
            int i11 = t6.uj;
            getThemedColor(i11);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            u5 u5Var = new u5(context);
            this.titleTextView = u5Var;
            u5Var.setPadding(i0.L(4.0f), 0, i0.L(4.0f), 0);
            a7.Y(u5Var, i10, p6Var);
            u5Var.setTextSize(14);
            u5Var.setTypeface(i0.o());
            linearLayout.addView(u5Var);
            p80 p80Var = new p80(context, null);
            this.subtitleTextView = p80Var;
            p80Var.setPadding(i0.L(4.0f), 0, i0.L(4.0f), 0);
            a7.V(p80Var, i10, p6Var);
            a7.H(p80Var, i11, p6Var);
            p80Var.setTypeface(Typeface.SANS_SERIF);
            p80Var.setTextSize(1, 13.0f);
            linearLayout.addView(p80Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = t6.Ci;
            y h02 = t6.h0(t6.r1(0.15f, getThemedColor(i12)), 7, -1);
            w6 L = a7.L(0.15f, i12);
            imageView.setBackground(h02);
            a7.k(imageView, h02, null, L, p6Var);
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

        @Override
        public void addColorKeys(HashSet hashSet) {
        }
    }

    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final qz0 text = new qz0(cd.L0(2131745276, null), 11.0f, i0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i10) {
            this.color = i10;
            Drawable f7 = i0.a.f(context, 2131231245);
            this.icon = f7;
            f7.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = i0.P;
            rectF.set(getBounds());
            rectF.left += i0.L(4.0f);
            this.backgroundPaint.setColor(t6.r1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + i0.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - i0.L(12.99f), getBounds().centerY() - i0.L(5.665f), getBounds().right - i0.L(1.66f), i0.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return i0.L(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.k() + i0.L(4.0f) + i0.L(18.0f));
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
