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
import c8.ja;
import fi.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import oi.u4;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.my0;
import ug.x0;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private xb bulletin;
    private cc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private m60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private x0 premiumSheet;
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

        public CloseDrawable(View view, int i7, int i10, long j3) {
            g6 g6Var = new g6(false, true, true);
            this.timer = g6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i7 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            g6Var.setCallback(view);
            g6Var.f34833b = 17;
            g6Var.w(g0.L(12.0f));
            g6Var.x(g0.o1("fonts/num.otf"));
            g6Var.N = g0.f23611q.x;
            g6Var.u(-1);
            er erVar = er.h;
            this.showCrossAnimated = new u5(view, 0L, 420L, erVar);
            this.showTimerAnimated = new u5(view, 0L, 420L, erVar);
            this.timerScaleAnimated = new u5(view, 0L, 420L, erVar);
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
            long j3 = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j3);
            long j10 = this.min_display_duration;
            float f11 = ((float) max) / ((float) j10);
            int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            boolean z11 = false;
            if (i7 < 0) {
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
            g6Var.C = (int) (this.alpha * d);
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
            float d2 = u5Var2.d(z11);
            float T1 = g0.T1(centerX, g0.L(8.0f) + centerX, d);
            float T12 = g0.T1(centerY, centerY - g0.L(8.0f), d);
            float T13 = g0.T1(0.35f, 1.0f, d2) * g0.W1(d, g0.L(5.0f), g0.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d2));
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
        public void setAlpha(int i7) {
            this.alpha = i7;
        }

        public void setColor(int i7) {
            this.timer.u(i7);
            this.paint.setColor(i7);
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

        public VideoAdsCache(int i7) {
            this.msgId = i7;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i7, long j3) {
            this.currentAccount = i7;
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

    private VideoAds(int i7, long j3, int i10, cc ccVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i7;
        this.dialogId = j3;
        this.msg_id = i10;
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
            np.s1(this.currentAccount).Y3(tL_messages_sponsoredMessages.users, false);
            np.s1(this.currentAccount).S3(tL_messages_sponsoredMessages.chats, false);
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
        g0.h3(new u4(4, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(m60 m60Var) {
        if (m10.i(this.currentAccount).q()) {
            m60Var.u();
            xb xbVar = this.bulletin;
            if (xbVar != null) {
                xbVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(hd.M0(2131754488, null)).j();
            np.s1(this.currentAccount).o0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, m60 m60Var) {
        int i7 = this.currentAccount;
        long j3 = this.dialogId;
        cc ccVar = this.bulletinFactory;
        i0 i0Var = new i0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(m60Var);
        a aVar = new a(m60Var, 1);
        int i10 = my0.f49339w1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_reportSponsoredMessage, new n60(context, i0Var, j3, bArr, aVar, ccVar, dVar, i7));
    }

    public void lambda$show$15(m60 m60Var) {
        if (m10.i(this.currentAccount).q()) {
            m60Var.u();
            xb xbVar = this.bulletin;
            if (xbVar != null) {
                xbVar.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(hd.M0(2131754488, null)).j();
            np.s1(this.currentAccount).o0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(z10 z10Var) {
        z10Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(org.telegram.ui.Components.xb r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, org.telegram.ui.ActionBar.e6 r25, org.telegram.messenger.video.VideoAds.AdLayout r26, org.telegram.messenger.z10 r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(org.telegram.ui.Components.xb, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, org.telegram.ui.ActionBar.e6, org.telegram.messenger.video.VideoAds$AdLayout, org.telegram.messenger.z10, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, np.s1(m10.f24940t0).f25272e6, false, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            xb xbVar = this.bulletin;
            if (xbVar != null) {
                xbVar.b();
            }
        } else if (m10.i(this.currentAccount).q()) {
            xb xbVar2 = this.bulletin;
            if (xbVar2 != null) {
                xbVar2.b();
                this.bulletin = null;
            }
            np.s1(this.currentAccount).o0(true);
            this.bulletinFactory.c(hd.M0(2131754488, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(xb xbVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        xb xbVar2 = this.bulletin;
        if (xbVar2 != null && xbVar2 == xbVar) {
            xbVar2.f41635j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            xbVar2.i(true);
        }
    }

    public void lambda$show$4(xb xbVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        xb xbVar2 = this.bulletin;
        if (xbVar2 != null && xbVar2 == xbVar && bool.booleanValue() != zArr[0]) {
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
            long currentTimeMillis = (System.currentTimeMillis() - j3) - jArr2[0];
            long j10 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j11 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j11 <= 0) {
                xb xbVar3 = this.bulletin;
                if (xbVar3 != null) {
                    xbVar3.b();
                    this.bulletin = null;
                }
            } else if (j10 <= 0) {
                xb xbVar4 = this.bulletin;
                xbVar4.f41635j = (int) j11;
                xbVar4.i(true);
            } else {
                g0.i3(runnable, j10);
            }
        }
    }

    public void lambda$show$5(xb xbVar, boolean[] zArr) {
        xb xbVar2 = this.bulletin;
        if (xbVar2 != null && xbVar2 == xbVar && !zArr[0]) {
            zArr[0] = true;
            m60 m60Var = this.currentMenu;
            if (m60Var != null) {
                m60Var.u();
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

    public void lambda$show$7(m60 m60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        m60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, np.s1(this.currentAccount).f25272e6, false, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(x0 x0Var) {
        if (x0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!m10.i(this.currentAccount).q() || !np.s1(this.currentAccount).E2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = np.s1(this.currentAccount).j1(this.dialogId);
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

    public static VideoAds make(int i7, long j3, int i10, cc ccVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i7, j3);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i7, j3, i10, ccVar, videoAdsCache);
    }

    private void schedule() {
        int i7;
        g0.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i7 = this.start_delay;
            } else {
                i7 = this.between_delay;
            }
            g0.i3(this.showRunnable, Math.max(0L, (i7 * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        xb xbVar = this.bulletin;
        if (xbVar != null) {
            xbVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        e6 e6Var = this.bulletinFactory.f33536c;
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
        j5 j5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i7 = j6.Fi;
        j5Var.i(new AdOptionsDrawable(W2, j6.w0(i7, this.bulletinFactory.f33536c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, gc.b(tL_sponsoredMessage.media.document), gc.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, gc.i(w10, tL_sponsoredMessage.media.photo), gc.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, gc.i(w11, tL_sponsoredMessage.photo), gc.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(j6.w0(i7, this.bulletinFactory.f33536c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new e(0, this, closeDrawable));
        final xb b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.f41646u = false;
        b10.i(false);
        final ki.n nVar = new ki.n(this, b10, tL_sponsoredMessage, 14);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        z10 z10Var = new z10() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, nVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.i3(nVar, tL_sponsoredMessage.min_display_duration * 1000);
        xb xbVar2 = this.bulletin;
        xbVar2.f41643r = false;
        xbVar2.v = new ki.n(this, b10, new boolean[1], 15);
        adLayout.titleTextView.setRightDrawableOnClick(new g(this, b10, tL_sponsoredMessage, W, e6Var, adLayout, z10Var, 0));
        xb xbVar3 = this.bulletin;
        e eVar = new e(1, this, tL_sponsoredMessage);
        cb cbVar = xbVar3.f41631e;
        if (cbVar != null) {
            cbVar.setOnClickListener(eVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        x0 x0Var = this.premiumSheet;
        if (x0Var != null) {
            x0Var.dismiss();
            this.premiumSheet = null;
        }
        x0 x0Var2 = new x0(new e2() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return g0.W(LaunchActivity.H1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = g0.W(t0.f26609b);
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = x0Var2;
        x0Var2.n(new u4(3, this, x0Var2));
        x0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        m60 m60Var = this.currentMenu;
        if (m60Var == null || !m60Var.D()) {
            x0 x0Var = this.premiumSheet;
            if (x0Var != null && !x0Var.J) {
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
        boolean z10 = r2.f26206a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z10 = r2.f26206a;
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
        m60 m60Var = this.currentMenu;
        if (m60Var != null) {
            m60Var.u();
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

    public static class AdLayout extends va {
        public final ImageView buttonView;
        public final i9 imageView;
        private final LinearLayout linearLayout;
        public final z70 subtitleTextView;
        public final j5 titleTextView;

        public AdLayout(Context context, e6 e6Var) {
            super(context, e6Var);
            setBackground(getThemedColor(j6.wj));
            i9 i9Var = new i9(context);
            this.imageView = i9Var;
            i9Var.setRoundRadius(g0.L(48.0f));
            addView(i9Var, ja.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i7 = j6.yj;
            getThemedColor(i7);
            int i10 = j6.xj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, ja.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            j5 j5Var = new j5(context);
            this.titleTextView = j5Var;
            j5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            q6.X(j5Var, i7, e6Var);
            j5Var.setTextSize(14);
            j5Var.setTypeface(g0.o());
            linearLayout.addView(j5Var);
            z70 z70Var = new z70(context, null);
            this.subtitleTextView = z70Var;
            z70Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            q6.U(z70Var, i7, e6Var);
            q6.G(z70Var, i10, e6Var);
            z70Var.setTypeface(Typeface.SANS_SERIF);
            z70Var.setTextSize(1, 13.0f);
            linearLayout.addView(z70Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = j6.Fi;
            y h02 = j6.h0(j6.r1(0.15f, getThemedColor(i11)), 7, -1);
            m6 K = q6.K(0.15f, i11);
            imageView.setBackground(h02);
            q6.j(imageView, h02, null, K, e6Var);
            addView(imageView, ja.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(ja.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        public final oy0 text = new oy0(hd.M0(2131745258, null), 11.0f, g0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i7) {
            this.color = i7;
            Drawable g10 = i5.c.g(context, 2131231244);
            this.icon = g10;
            g10.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = g0.P;
            rectF.set(getBounds());
            rectF.left += g0.L(4.0f);
            this.backgroundPaint.setColor(j6.r1(this.alpha * 0.2f, this.color));
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
        public void setAlpha(int i7) {
            this.alpha = i7 / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
