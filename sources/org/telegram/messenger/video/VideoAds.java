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
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b8.mf;
import ei.k0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import lg.y;
import m2.s;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ya;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey0;
import vg.v0;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private ac bulletin;
    private fc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private f60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private v0 premiumSheet;
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
        private final u5 showCrossAnimated;
        private final u5 showTimerAnimated;
        private final long startTime;
        private final g6 timer;
        private final u5 timerScaleAnimated;

        public CloseDrawable(View view, int i3, int i10, long j10) {
            g6 g6Var = new g6(false, true, true);
            this.timer = g6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = i3 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            g6Var.setCallback(view);
            g6Var.f33983b = 17;
            g6Var.w(g0.L(12.0f));
            g6Var.x(g0.o1("fonts/num.otf"));
            g6Var.M = g0.f22608q.x;
            g6Var.u(-1);
            xq xqVar = xq.h;
            this.showCrossAnimated = new u5(view, 0L, 420L, xqVar);
            this.showTimerAnimated = new u5(view, 0L, 420L, xqVar);
            this.timerScaleAnimated = new u5(view, 0L, 420L, xqVar);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z10;
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
            int i3 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            boolean z11 = false;
            if (i3 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.showTimerAnimated.d(z10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            u5 u5Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f10 = 0.825f;
            } else if (str.length() >= 2) {
                f10 = 0.875f;
            } else {
                f10 = 1.0f;
            }
            float e10 = u5Var.e(false, f10);
            canvas.save();
            canvas.scale(e10, e10, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            g6 g6Var = this.timer;
            g6Var.B = (int) (this.alpha * d);
            g6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(g0.L(2.0f));
            RectF rectF = g0.P;
            rectF.set(centerX - g0.L(9.0f), centerY - g0.L(9.0f), g0.L(9.0f) + centerX, g0.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, this.paint);
            u5 u5Var2 = this.showCrossAnimated;
            if ((1.0f - f11) * 360.0f > 75.0f) {
                z11 = true;
            }
            float d10 = u5Var2.d(z11);
            float T1 = g0.T1(centerX, g0.L(8.0f) + centerX, d);
            float T12 = g0.T1(centerY, centerY - g0.L(8.0f), d);
            float T13 = g0.T1(0.35f, 1.0f, d10) * g0.W1(d, g0.L(5.0f), g0.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d10));
            float f12 = T1 - T13;
            float f13 = T12 - T13;
            float f14 = T1 + T13;
            float f15 = T13 + T12;
            canvas.drawLine(f12, f13, f14, f15, this.paint);
            canvas.drawLine(f12, f15, f14, f13, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return g0.L(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return g0.L(24.0f);
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
        public void setAlpha(int i3) {
            this.alpha = i3;
        }

        public void setColor(int i3) {
            this.timer.u(i3);
            this.paint.setColor(i3);
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

        public VideoAdsCache(int i3) {
            this.msgId = i3;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i3, long j10) {
            this.currentAccount = i3;
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

    private VideoAds(int i3, long j10, int i10, fc fcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i3;
        this.dialogId = j10;
        this.msg_id = i10;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(fcVar);
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

    private void init(fc fcVar) {
        this.bulletinFactory = fcVar;
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
            hp.s1(this.currentAccount).Y3(tL_messages_sponsoredMessages.users, false);
            hp.s1(this.currentAccount).S3(tL_messages_sponsoredMessages.chats, false);
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
        g0.h3(new s(21, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(f60 f60Var) {
        if (h10.i(this.currentAccount).q()) {
            f60Var.u();
            ac acVar = this.bulletin;
            if (acVar != null) {
                acVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(bd.M0(2131754488, null)).j();
            hp.s1(this.currentAccount).o0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, f60 f60Var) {
        int i3 = this.currentAccount;
        long j10 = this.dialogId;
        fc fcVar = this.bulletinFactory;
        k0 k0Var = new k0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(f60Var);
        a aVar = new a(f60Var, 1);
        int i10 = ey0.f45092t1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_reportSponsoredMessage, new g60(context, k0Var, j10, bArr, aVar, fcVar, dVar, i3));
    }

    public void lambda$show$15(f60 f60Var) {
        if (h10.i(this.currentAccount).q()) {
            f60Var.u();
            ac acVar = this.bulletin;
            if (acVar != null) {
                acVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(bd.M0(2131754488, null)).j();
            hp.s1(this.currentAccount).o0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(u10 u10Var) {
        u10Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(org.telegram.ui.Components.ac r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, org.telegram.ui.ActionBar.e6 r25, org.telegram.messenger.video.VideoAds.AdLayout r26, org.telegram.messenger.u10 r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.ac, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.e6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.u10, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        sf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, hp.s1(h10.f22829t0).f22988d6, false, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            ac acVar = this.bulletin;
            if (acVar != null) {
                acVar.b();
            }
        } else if (h10.i(this.currentAccount).q()) {
            ac acVar2 = this.bulletin;
            if (acVar2 != null) {
                acVar2.b();
                this.bulletin = null;
            }
            hp.s1(this.currentAccount).o0(true);
            this.bulletinFactory.c(bd.M0(2131754488, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(ac acVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        ac acVar2 = this.bulletin;
        if (acVar2 != null && acVar2 == acVar) {
            acVar2.f31792j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            acVar2.i(true);
        }
    }

    public void lambda$show$4(ac acVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        ac acVar2 = this.bulletin;
        if (acVar2 != null && acVar2 == acVar && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                g0.r(runnable);
                return;
            }
            g0.r(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
            long j11 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j12 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j12 <= 0) {
                ac acVar3 = this.bulletin;
                if (acVar3 != null) {
                    acVar3.b();
                    this.bulletin = null;
                }
            } else if (j11 <= 0) {
                ac acVar4 = this.bulletin;
                acVar4.f31792j = (int) j12;
                acVar4.i(true);
            } else {
                g0.i3(runnable, j11);
            }
        }
    }

    public void lambda$show$5(ac acVar, boolean[] zArr) {
        ac acVar2 = this.bulletin;
        if (acVar2 != null && acVar2 == acVar && !zArr[0]) {
            zArr[0] = true;
            f60 f60Var = this.currentMenu;
            if (f60Var != null) {
                f60Var.u();
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

    public void lambda$show$7(f60 f60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        f60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        sf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, hp.s1(this.currentAccount).f22988d6, false, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(v0 v0Var) {
        if (v0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!h10.i(this.currentAccount).q() || !hp.s1(this.currentAccount).E2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = hp.s1(this.currentAccount).j1(this.dialogId);
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

    public static VideoAds make(int i3, long j10, int i10, fc fcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i3, j10);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i3, j10, i10, fcVar, videoAdsCache);
    }

    private void schedule() {
        int i3;
        g0.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i3 = this.start_delay;
            } else {
                i3 = this.between_delay;
            }
            g0.i3(this.showRunnable, Math.max(0L, (i3 * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        ac acVar = this.bulletin;
        if (acVar != null) {
            acVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        e6 e6Var = this.bulletinFactory.f33774c;
        AdLayout adLayout = new AdLayout(W, e6Var) {
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
        k5 k5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i3 = k6.Ci;
        k5Var.i(new AdOptionsDrawable(W2, k6.w0(i3, this.bulletinFactory.f33774c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.ac.b(tL_sponsoredMessage.media.document), org.telegram.messenger.ac.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.ac.i(w10, tL_sponsoredMessage.media.photo), org.telegram.messenger.ac.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.ac.i(w11, tL_sponsoredMessage.photo), org.telegram.messenger.ac.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(k6.w0(i3, this.bulletinFactory.f33774c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new ai.d(29, this, closeDrawable));
        final ac b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.f31803u = false;
        b10.i(false);
        final y yVar = new y(this, b10, tL_sponsoredMessage, 17);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        u10 u10Var = new u10() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, yVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.i3(yVar, tL_sponsoredMessage.min_display_duration * 1000);
        ac acVar2 = this.bulletin;
        acVar2.f31800r = false;
        acVar2.v = new y(this, b10, new boolean[1], 18);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, e6Var, adLayout, u10Var, 0));
        ac acVar3 = this.bulletin;
        g gVar = new g(0, this, tL_sponsoredMessage);
        fb fbVar = acVar3.f31788e;
        if (fbVar != null) {
            fbVar.setOnClickListener(gVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        v0 v0Var = this.premiumSheet;
        if (v0Var != null) {
            v0Var.dismiss();
            this.premiumSheet = null;
        }
        v0 v0Var2 = new v0(new d2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return g0.W(LaunchActivity.K1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = g0.W(t0.f25457b);
                if (W == null) {
                    return LaunchActivity.K1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = v0Var2;
        v0Var2.n(new s(20, this, v0Var2));
        v0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        f60 f60Var = this.currentMenu;
        if (f60Var == null || !f60Var.D()) {
            v0 v0Var = this.premiumSheet;
            if (v0Var != null && !v0Var.J) {
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
        boolean z10 = r2.f25040a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z10 = r2.f25040a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused != z10) {
            this.waitingPaused = z10;
            g0.r(this.showRunnable);
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
        f60 f60Var = this.currentMenu;
        if (f60Var != null) {
            f60Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        g0.r(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdLayout extends ya {
        public final ImageView buttonView;
        public final k9 imageView;
        private final LinearLayout linearLayout;
        public final s70 subtitleTextView;
        public final k5 titleTextView;

        public AdLayout(Context context, e6 e6Var) {
            super(context, e6Var);
            setBackground(getThemedColor(k6.tj));
            k9 k9Var = new k9(context);
            this.imageView = k9Var;
            k9Var.setRoundRadius(g0.L(48.0f));
            addView(k9Var, mf.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i3 = k6.vj;
            getThemedColor(i3);
            int i10 = k6.uj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, mf.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            k5 k5Var = new k5(context);
            this.titleTextView = k5Var;
            k5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            r6.Y(k5Var, i3, e6Var);
            k5Var.setTextSize(14);
            k5Var.setTypeface(g0.o());
            linearLayout.addView(k5Var);
            s70 s70Var = new s70(context, null);
            this.subtitleTextView = s70Var;
            s70Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            r6.V(s70Var, i3, e6Var);
            r6.H(s70Var, i10, e6Var);
            s70Var.setTypeface(Typeface.SANS_SERIF);
            s70Var.setTextSize(1, 13.0f);
            linearLayout.addView(s70Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = k6.Ci;
            org.telegram.ui.Cells.y h02 = k6.h0(k6.r1(0.15f, getThemedColor(i11)), 7, -1);
            n6 L = r6.L(0.15f, i11);
            imageView.setBackground(h02);
            r6.k(imageView, h02, null, L, e6Var);
            addView(imageView, mf.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(mf.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        public final ly0 text = new ly0(bd.M0(2131745268, null), 11.0f, g0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i3) {
            this.color = i3;
            Drawable g7 = p1.g(context, 2131231244);
            this.icon = g7;
            g7.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = g0.P;
            rectF.set(getBounds());
            rectF.left += g0.L(4.0f);
            this.backgroundPaint.setColor(k6.r1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + g0.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - g0.L(12.99f), getBounds().centerY() - g0.L(5.665f), getBounds().right - g0.L(1.66f), g0.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return g0.L(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.k() + g0.L(4.0f) + g0.L(18.0f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i3) {
            this.alpha = i3 / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
