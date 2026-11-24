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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private u31 bulletin;
    private c41 bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private bu5 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private kj8 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new ecc(this, (byte) 1);

    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final ln showCrossAnimated;
        private final ln showTimerAnimated;
        private final long startTime;
        private final ho timer;
        private final ln timerScaleAnimated;

        public CloseDrawable(View view, int i, int i2, long j) {
            ho hoVar = new ho(false, true, true);
            this.timer = hoVar;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j;
            this.min_display_duration = i * 1000;
            this.max_display_duration = i2 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            hoVar.setCallback(view);
            hoVar.b = 17;
            hoVar.w(gm.L(12.0f));
            hoVar.x(gm.n1("fonts/num.otf"));
            hoVar.N = gm.q.x;
            hoVar.u(-1);
            d53 d53Var = d53.h;
            this.showCrossAnimated = new ln(view, 0L, 420L, d53Var);
            this.showTimerAnimated = new ln(view, 0L, 420L, d53Var);
            this.timerScaleAnimated = new ln(view, 0L, 420L, d53Var);
        }

        @Override
        public void draw(Canvas canvas) {
            long currentTimeMillis;
            boolean z;
            float f;
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            if (this.paused) {
                currentTimeMillis = this.pausedTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j = (currentTimeMillis - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - j);
            long j2 = this.min_display_duration;
            float f2 = ((float) max) / ((float) j2);
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            boolean z2 = false;
            if (i < 0) {
                z = true;
            } else {
                z = false;
            }
            float d = this.showTimerAnimated.d(z);
            String valueOf = String.valueOf((int) Math.ceil(max / 1000.0d));
            ln lnVar = this.timerScaleAnimated;
            if (valueOf.length() >= 3) {
                f = 0.825f;
            } else if (valueOf.length() >= 2) {
                f = 0.875f;
            } else {
                f = 1.0f;
            }
            float e = lnVar.e(false, f);
            canvas.save();
            canvas.scale(e, e, centerX, centerY);
            this.timer.t(valueOf, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            ho hoVar = this.timer;
            hoVar.C = (int) (this.alpha * d);
            hoVar.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(gm.L(2.0f));
            RectF rectF = gm.P;
            rectF.set(centerX - gm.L(9.0f), centerY - gm.L(9.0f), gm.L(9.0f) + centerX, gm.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f2 * (-360.0f), false, this.paint);
            ln lnVar2 = this.showCrossAnimated;
            if ((1.0f - f2) * 360.0f > 75.0f) {
                z2 = true;
            }
            float d2 = lnVar2.d(z2);
            float R1 = gm.R1(centerX, gm.L(8.0f) + centerX, d);
            float R12 = gm.R1(centerY, centerY - gm.L(8.0f), d);
            float R13 = gm.R1(0.35f, 1.0f, d2) * gm.U1(d, gm.L(5.0f), gm.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d2));
            float f3 = R1 - R13;
            float f4 = R12 - R13;
            float f5 = R1 + R13;
            float f6 = R13 + R12;
            canvas.drawLine(f3, f4, f5, f6, this.paint);
            canvas.drawLine(f3, f6, f5, f4, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return gm.L(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return gm.L(24.0f);
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
        public void setAlpha(int i) {
            this.alpha = i;
        }

        public void setColor(int i) {
            this.timer.u(i);
            this.paint.setColor(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setPaused(boolean z) {
            if (this.paused == z) {
                return;
            }
            this.paused = z;
            if (z) {
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

        public VideoAdsCache(int i) {
            this.msgId = i;
        }
    }

    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
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

    private VideoAds(int i, long j, int i2, c41 c41Var, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i;
        this.dialogId = j;
        this.msg_id = i2;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(c41Var);
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

    private void init(c41 c41Var) {
        this.bulletinFactory = c41Var;
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
            oc7.r1(this.currentAccount).d4(tL_messages_sponsoredMessages.users, false);
            oc7.r1(this.currentAccount).X3(tL_messages_sponsoredMessages.chats, false);
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
        gm.c3(new x4c(this, tLObject, (byte) 11));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gm.g(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(bu5 bu5Var) {
        if (z8c.h(this.currentAccount).p()) {
            bu5Var.u();
            u31 u31Var = this.bulletin;
            if (u31Var != null) {
                u31Var.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(jb6.M0(2131754485, null)).j();
            oc7.r1(this.currentAccount).l0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, bu5 bu5Var) {
        int i = this.currentAccount;
        long j = this.dialogId;
        c41 c41Var = this.bulletinFactory;
        q63 q63Var = new q63();
        ecc eccVar = new ecc(this, (byte) 0);
        Objects.requireNonNull(bu5Var);
        bo1 bo1Var = new bo1(bu5Var, (byte) 11);
        int i2 = da9.v1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_reportSponsoredMessage, new l15(context, q63Var, j, bArr, bo1Var, c41Var, eccVar, i));
    }

    public void lambda$show$15(bu5 bu5Var) {
        if (z8c.h(this.currentAccount).p()) {
            bu5Var.u();
            u31 u31Var = this.bulletin;
            if (u31Var != null) {
                u31Var.i(true);
                this.bulletin.b();
            }
            this.bulletinFactory.c(jb6.M0(2131754485, null)).j();
            oc7.r1(this.currentAccount).l0(true);
            return;
        }
        showPremium();
    }

    public void lambda$show$16(qac qacVar) {
        qacVar.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(defpackage.u31 r22, final org.telegram.tgnet.TLRPC.TL_sponsoredMessage r23, android.content.Context r24, defpackage.ylb r25, org.telegram.messenger.video.VideoAds.AdLayout r26, defpackage.qac r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoAds.lambda$show$17(u31, org.telegram.tgnet.TLRPC$TL_sponsoredMessage, android.content.Context, ylb, org.telegram.messenger.video.VideoAds$AdLayout, qac, android.view.View):void");
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        l11.t(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, oc7.r1(z8c.t0).l4.A2.f, false, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            u31 u31Var = this.bulletin;
            if (u31Var != null) {
                u31Var.b();
            }
        } else if (z8c.h(this.currentAccount).p()) {
            u31 u31Var2 = this.bulletin;
            if (u31Var2 != null) {
                u31Var2.b();
                this.bulletin = null;
            }
            oc7.r1(this.currentAccount).l0(true);
            this.bulletinFactory.c(jb6.M0(2131754485, null)).j();
        } else {
            showPremium();
        }
    }

    public void lambda$show$3(u31 u31Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        u31 u31Var2 = this.bulletin;
        if (u31Var2 != null && u31Var2 == u31Var) {
            u31Var2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
            u31Var2.i(true);
        }
    }

    public void lambda$show$4(u31 u31Var, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        u31 u31Var2 = this.bulletin;
        if (u31Var2 != null && u31Var2 == u31Var && bool.booleanValue() != zArr[0]) {
            boolean booleanValue = bool.booleanValue();
            zArr[0] = booleanValue;
            closeDrawable.setPaused(booleanValue);
            if (zArr[0]) {
                this.bulletin.i(false);
                jArr[0] = System.currentTimeMillis();
                gm.r(runnable);
                return;
            }
            gm.r(runnable);
            jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
            long currentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
            long j2 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
            long j3 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
            if (j3 <= 0) {
                u31 u31Var3 = this.bulletin;
                if (u31Var3 != null) {
                    u31Var3.b();
                    this.bulletin = null;
                }
            } else if (j2 <= 0) {
                u31 u31Var4 = this.bulletin;
                u31Var4.j = (int) j3;
                u31Var4.i(true);
            } else {
                gm.d3(runnable, j2);
            }
        }
    }

    public void lambda$show$5(u31 u31Var, boolean[] zArr) {
        u31 u31Var2 = this.bulletin;
        if (u31Var2 != null && u31Var2 == u31Var && !zArr[0]) {
            zArr[0] = true;
            bu5 bu5Var = this.currentMenu;
            if (bu5Var != null) {
                bu5Var.u();
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

    public void lambda$show$7(bu5 bu5Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        bu5Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        l11.t(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, oc7.r1(this.currentAccount).l4.A2.f, false, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gm.g(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gm.g(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(kj8 kj8Var) {
        if (kj8Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (!this.loading && !this.loaded) {
            if (!z8c.h(this.currentAccount).p() || !oc7.r1(this.currentAccount).F2()) {
                this.loading = true;
                TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
                tL_messages_getSponsoredMessages.peer = oc7.r1(this.currentAccount).i1(this.dialogId);
                tL_messages_getSponsoredMessages.flags |= 1;
                tL_messages_getSponsoredMessages.msg_id = this.msg_id;
                this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new go9(this, (byte) 23));
            }
        }
    }

    public static VideoAds make(int i, long j, int i2, c41 c41Var) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i2 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i2);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i, j, i2, c41Var, videoAdsCache);
    }

    private void schedule() {
        int i;
        gm.r(this.showRunnable);
        if (this.loaded && !this.ads.isEmpty()) {
            if (this.first) {
                i = this.start_delay;
            } else {
                i = this.between_delay;
            }
            gm.d3(this.showRunnable, Math.max(0L, (i * 1000) - (System.currentTimeMillis() - this.lastTime)));
        }
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        u31 u31Var = this.bulletin;
        if (u31Var != null) {
            u31Var.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        ylb ylbVar = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, ylbVar) {
            {
                VideoAds.this = this;
            }

            @Override
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.Y(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override
            public void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        lka lkaVar = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i = cmb.Ei;
        lkaVar.i(new AdOptionsDrawable(X2, cmb.v0(i, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, gn5.b(tL_sponsoredMessage.media.document), gn5.c(bc4.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document), null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w = bc4.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, gn5.i(w, tL_sponsoredMessage.media.photo), gn5.i(bc4.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w, false), tL_sponsoredMessage.media.photo), null, "48_48", "48_48", null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w2 = bc4.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, gn5.i(w2, tL_sponsoredMessage.photo), gn5.i(bc4.w(tL_sponsoredMessage.photo.sizes, 48, true, w2, false), tL_sponsoredMessage.photo), null, "48_48", "48_48", null);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(cmb.v0(i, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new fyb(this, closeDrawable, (byte) 9));
        final u31 b = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b;
        b.v = false;
        b.i(false);
        final j2b j2bVar = new j2b(this, b, tL_sponsoredMessage, (byte) 29);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        qac qacVar = new qac() {
            @Override
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b, zArr, closeDrawable, jArr2, j2bVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        gm.d3(j2bVar, tL_sponsoredMessage.min_display_duration * 1000);
        u31 u31Var2 = this.bulletin;
        u31Var2.s = false;
        u31Var2.w = new gcc(this, b, new boolean[1], (byte) 0);
        adLayout.titleTextView.setRightDrawableOnClick(new x55(this, b, tL_sponsoredMessage, X, ylbVar, adLayout, qacVar, (byte) 1));
        u31 u31Var3 = this.bulletin;
        fyb fybVar = new fyb(this, tL_sponsoredMessage, (byte) 10);
        y21 y21Var = u31Var3.e;
        if (y21Var != null) {
            y21Var.setOnClickListener(fybVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        kj8 kj8Var = this.premiumSheet;
        if (kj8Var != null) {
            kj8Var.dismiss();
            this.premiumSheet = null;
        }
        kj8 kj8Var2 = new kj8(new d() {
            {
                VideoAds.this = this;
            }

            @Override
            public Context getContext() {
                return gm.W(LaunchActivity.H1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity W = gm.W(org.telegram.messenger.a.b);
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            }
        }, 3, true);
        this.premiumSheet = kj8Var2;
        kj8Var2.n(new x4c(this, kj8Var2, (byte) 10));
        kj8Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        bu5 bu5Var = this.currentMenu;
        if (bu5Var == null || !bu5Var.E()) {
            kj8 kj8Var = this.premiumSheet;
            if (kj8Var != null && !kj8Var.J) {
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
        boolean z = e21.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z = e21.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z) {
        if (this.waitingPaused != z) {
            this.waitingPaused = z;
            gm.r(this.showRunnable);
            if (z) {
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
        bu5 bu5Var = this.currentMenu;
        if (bu5Var != null) {
            bu5Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        gm.r(this.showRunnable);
        setWaitingPaused(true);
    }

    public static class AdLayout extends p21 {
        public final ImageView buttonView;
        public final bf0 imageView;
        private final LinearLayout linearLayout;
        public final l66 subtitleTextView;
        public final lka titleTextView;

        public AdLayout(Context context, ylb ylbVar) {
            super(context, ylbVar);
            setBackground(getThemedColor(cmb.vj));
            bf0 bf0Var = new bf0(context);
            this.imageView = bf0Var;
            bf0Var.setRoundRadius(gm.L(48.0f));
            addView(bf0Var, qoe.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i = cmb.xj;
            getThemedColor(i);
            int i2 = cmb.wj;
            getThemedColor(i2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, qoe.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            lka lkaVar = new lka(context);
            this.titleTextView = lkaVar;
            lkaVar.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            anb.W(lkaVar, i, ylbVar);
            lkaVar.setTextSize(14);
            lkaVar.setTypeface(gm.o());
            linearLayout.addView(lkaVar);
            l66 l66Var = new l66(context, null);
            this.subtitleTextView = l66Var;
            l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            anb.X(l66Var, i, ylbVar);
            anb.G(l66Var, i2, ylbVar);
            l66Var.setTypeface(Typeface.SANS_SERIF);
            l66Var.setTextSize(1, 13.0f);
            linearLayout.addView(l66Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = cmb.Ei;
            fg0 f0 = cmb.f0(cmb.p1(0.15f, getThemedColor(i3)), 7, -1);
            wmb K = anb.K(0.15f, i3);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, K, ylbVar);
            addView(imageView, qoe.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(qoe.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        public final uib text = new uib(jb6.M0(2131744947, null), 11.0f, gm.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i) {
            this.color = i;
            Drawable d = b10.d(context, 2131231248);
            this.icon = d;
            d.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = gm.P;
            rectF.set(getBounds());
            rectF.left += gm.L(4.0f);
            this.backgroundPaint.setColor(cmb.p1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + gm.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - gm.L(12.99f), getBounds().centerY() - gm.L(5.665f), getBounds().right - gm.L(1.66f), gm.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return gm.L(16.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.j() + gm.L(4.0f) + gm.L(18.0f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
