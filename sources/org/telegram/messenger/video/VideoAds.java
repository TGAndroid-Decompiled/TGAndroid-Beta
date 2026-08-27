package org.telegram.messenger.video;

import ag.g2;
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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.a4;
import gh.f3;
import h7.z5;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import jh.h0;
import lh.k7;
import nh.x1;
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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x21;

public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private ec bulletin;
    private mc bulletinFactory;
    private long bulletinShowTime;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private b70 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private g2 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 0);

    public static class AdLayout extends cb {
        public final ImageView buttonView;
        public final n9 imageView;
        private final LinearLayout linearLayout;
        public final p80 subtitleTextView;
        public final h5 titleTextView;

        public AdLayout(Context context, c6 c6Var) {
            super(context, c6Var);
            setBackground(getThemedColor(g6.Fi));
            n9 n9Var = new n9(context);
            this.imageView = n9Var;
            n9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(n9Var, z5.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(g6.Hi);
            int themedColor2 = getThemedColor(g6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            h5 h5Var = new h5(context);
            this.titleTextView = h5Var;
            h5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h5Var.setTextColor(themedColor);
            h5Var.setTextSize(14);
            h5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(h5Var);
            p80 p80Var = new p80(context, null);
            this.subtitleTextView = p80Var;
            p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            p80Var.setTextColor(themedColor);
            p80Var.setLinkTextColor(themedColor2);
            p80Var.setTypeface(Typeface.SANS_SERIF);
            p80Var.setTextSize(1, 13.0f);
            linearLayout.addView(p80Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(g6.f0(g6.l1(0.15f, getThemedColor(g6.Oh)), 7, -1));
            addView(imageView, z5.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(z5.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
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
        private final y5 showCrossAnimated;
        private final y5 showTimerAnimated;
        private final long startTime;
        private final i6 timer;
        private final y5 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j10) {
            i6 i6Var = new i6(false, true, true, false);
            this.timer = i6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = ((long) i10) * 1000;
            this.max_display_duration = ((long) i11) * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            i6Var.setCallback(view);
            i6Var.f29239b = 17;
            i6Var.t(AndroidUtilities.dp(12.0f));
            i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            i6Var.G = AndroidUtilities.displaySize.x;
            i6Var.r(-1);
            er erVar = er.h;
            this.showCrossAnimated = new y5(view, 0L, 420L, erVar);
            this.showTimerAnimated = new y5(view, 0L, 420L, erVar);
            this.timerScaleAnimated = new y5(view, 0L, 420L, erVar);
        }

        @Override
        public void draw(Canvas canvas) {
            float f10;
            float fCenterX = getBounds().centerX();
            float fCenterY = getBounds().centerY();
            long jCurrentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long jMax = Math.max(0L, this.min_display_duration - jCurrentTimeMillis);
            long j10 = this.min_display_duration;
            float f11 = jMax / j10;
            float fE = this.showTimerAnimated.e(jCurrentTimeMillis < j10);
            String str = "" + ((int) Math.ceil(jMax / 1000.0d));
            y5 y5Var = this.timerScaleAnimated;
            if (str.length() >= 3) {
                f10 = 0.825f;
            } else {
                f10 = str.length() >= 2 ? 0.875f : 1.0f;
            }
            float fD = y5Var.d(f10, false);
            canvas.save();
            canvas.scale(fD, fD, fCenterX, fCenterY);
            this.timer.q(str, true, true);
            this.timer.l(fCenterX - 1.0f, fCenterY - 1.0f, fCenterX + 1.0f, fCenterY + 1.0f);
            i6 i6Var = this.timer;
            i6Var.f29257w = (int) (this.alpha * fE);
            i6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * fE));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fCenterX - AndroidUtilities.dp(9.0f), fCenterY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + fCenterX, AndroidUtilities.dp(9.0f) + fCenterY);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, this.paint);
            float fE2 = this.showCrossAnimated.e((1.0f - f11) * 360.0f > 75.0f);
            float fLerp = AndroidUtilities.lerp(fCenterX, AndroidUtilities.dp(8.0f) + fCenterX, fE);
            float fLerp2 = AndroidUtilities.lerp(fCenterY, fCenterY - AndroidUtilities.dp(8.0f), fE);
            float fLerp3 = AndroidUtilities.lerp(0.35f, 1.0f, fE2) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), fE);
            this.paint.setAlpha((int) (this.alpha * fE2));
            float f12 = fLerp - fLerp3;
            float f13 = fLerp2 - fLerp3;
            float f14 = fLerp + fLerp3;
            float f15 = fLerp3 + fLerp2;
            canvas.drawLine(f12, f13, f14, f15, this.paint);
            canvas.drawLine(f12, f15, f14, f13, this.paint);
            if (fE > 0.0f) {
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
            return (this.paused ? this.pausedTime : System.currentTimeMillis() - this.minusTime) - this.startTime > this.min_display_duration;
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
            } else {
                this.minusTime += System.currentTimeMillis() - this.pausedTime;
            }
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

    private VideoAds(int i10, long j10, int i11, mc mcVar) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j10;
        this.msg_id = i11;
        this.lastTime = System.currentTimeMillis();
        init(mcVar);
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

    private void init(mc mcVar) {
        this.bulletinFactory = mcVar;
        if (this.currentBulletinPassedTime <= 0) {
            this.lastTime = System.currentTimeMillis();
            if (this.waitingPaused) {
                this.waitingTimeSince = System.currentTimeMillis();
            }
            this.first = true;
        }
        if (this.loaded) {
            schedule();
        } else {
            load();
        }
    }

    public void lambda$load$0(TLObject tLObject) {
        if (this.loading) {
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
    }

    public void lambda$load$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new k7(20, this, tLObject));
    }

    public static void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    public void lambda$show$12(b70 b70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        b70Var.u();
        ec ecVar = this.bulletin;
        if (ecVar != null) {
            ecVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, b70 b70Var) {
        int i10 = this.currentAccount;
        long j10 = this.dialogId;
        mc mcVar = this.bulletinFactory;
        h0 h0Var = new h0();
        int i11 = 1;
        d dVar = new d(this, i11);
        Objects.requireNonNull(b70Var);
        a aVar = new a(b70Var, i11);
        int i12 = x21.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new c70(context, h0Var, j10, bArr, aVar, mcVar, dVar, i10));
    }

    public void lambda$show$15(b70 b70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        b70Var.u();
        ec ecVar = this.bulletin;
        if (ecVar != null) {
            ecVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    public void lambda$show$16(Utilities.Callback callback) {
        callback.run(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    public void lambda$show$17(ec ecVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, c6 c6Var, AdLayout adLayout, Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        b70 b70VarJ;
        Context context2;
        int iDp;
        int iDp2;
        ArrayList arrayList;
        String str;
        final b70 b70Var;
        int i10;
        int i11;
        int i12;
        ec ecVar2 = this.bulletin;
        if (ecVar2 == null || ecVar2 != ecVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) ecVar2.f28016e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        h0 h0Var = new h0();
        final b70 b70Var2 = new b70(viewGroup, h0Var, this.bulletin.f28016e, true, false, false);
        b70Var2.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b70Var2.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        b70Var2.I = true;
        b70Var2.f26992s = 0;
        b70Var2.f26993t = false;
        b70Var2.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str2 = tL_sponsoredMessage.url;
            if (str2 != null) {
                if (!str2.startsWith("https://" + MessagesController.getInstance(this.currentAccount).linkPrefix)) {
                    b70VarJ = b70Var2.J();
                    f1 f1Var = new f1(0, context, h0Var, true, false);
                    context2 = context;
                    f1Var.setItemHeight(44);
                    f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    s5 textView = f1Var.getTextView();
                    if (LocaleController.isRTL) {
                        iDp = 0;
                    } else {
                        iDp = AndroidUtilities.dp(40.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(40.0f);
                    } else {
                        iDp2 = 0;
                    }
                    textView.setPadding(iDp, 0, iDp2, 0);
                    final int i13 = 2;
                    f1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i13) {
                                case 0:
                                    VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) b70Var2, view2);
                                    break;
                                case 1:
                                    VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) b70Var2, view2);
                                    break;
                                default:
                                    ((b70) b70Var2).s();
                                    break;
                            }
                        }
                    });
                    b70VarJ.r(f1Var, z5.n(-1, -2));
                    b70VarJ.r(new k1(context2, h0Var), z5.n(-1, 8));
                    arrayList = new ArrayList();
                    str = tL_sponsoredMessage.url;
                    if (str != null) {
                        b70Var = b70Var2;
                    } else {
                        b70Var = b70Var2;
                    }
                    if (tL_sponsoredMessage.sponsor_info != null) {
                        TextView textView2 = new TextView(context2);
                        textView2.setTextColor(h0Var.N0(g6.E8));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                        textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
                        textView2.setText(tL_sponsoredMessage.sponsor_info);
                        int iN0 = h0Var.N0(g6.I5);
                        if (tL_sponsoredMessage.additional_info == null) {
                            i12 = 6;
                        } else {
                            i12 = 0;
                        }
                        textView2.setBackground(g6.Y(iN0, 0, i12));
                        final int i14 = 0;
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (i14) {
                                    case 0:
                                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                                        break;
                                    case 1:
                                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                                        break;
                                    default:
                                        ((b70) tL_sponsoredMessage).s();
                                        break;
                                }
                            }
                        });
                        arrayList.add(textView2);
                    }
                    if (tL_sponsoredMessage.additional_info != null) {
                        TextView textView3 = new TextView(context2);
                        textView3.setTextColor(h0Var.N0(g6.E8));
                        textView3.setTextSize(1, 14.0f);
                        textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                        textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
                        textView3.setText(tL_sponsoredMessage.additional_info);
                        textView3.setBackground(g6.Y(g6.v0(g6.I5, c6Var), 0, 6));
                        final int i15 = 1;
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (i15) {
                                    case 0:
                                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                                        break;
                                    case 1:
                                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                                        break;
                                    default:
                                        ((b70) tL_sponsoredMessage).s();
                                        break;
                                }
                            }
                        });
                        arrayList.add(textView3);
                    }
                    for (i10 = 0; i10 < arrayList.size(); i10++) {
                        View view2 = (View) arrayList.get(i10);
                        if (i10 > 0) {
                            FrameLayout frameLayout = new FrameLayout(context2);
                            frameLayout.setBackgroundColor(h0Var.N0(g6.f23054d7));
                            i11 = -1;
                            LinearLayout.LayoutParams layoutParamsN = z5.n(-1, 1);
                            layoutParamsN.height = 1;
                            b70VarJ.r(frameLayout, layoutParamsN);
                        } else {
                            i11 = -1;
                        }
                        b70VarJ.r(view2, z5.n(i11, -2));
                    }
                    b70Var.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new f3(b70Var, b70VarJ, 2), false);
                }
            }
            context2 = context;
            b70Var = b70Var2;
        } else {
            b70VarJ = b70Var2.J();
            f1 f1Var2 = new f1(0, context, h0Var, true, false);
            context2 = context;
            f1Var2.setItemHeight(44);
            f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
            s5 textView4 = f1Var2.getTextView();
            if (LocaleController.isRTL) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(40.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(40.0f);
            } else {
                iDp2 = 0;
            }
            textView4.setPadding(iDp, 0, iDp2, 0);
            final int i16 = 2;
            f1Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    switch (i16) {
                        case 0:
                            VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) b70Var2, view3);
                            break;
                        case 1:
                            VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) b70Var2, view3);
                            break;
                        default:
                            ((b70) b70Var2).s();
                            break;
                    }
                }
            });
            b70VarJ.r(f1Var2, z5.n(-1, -2));
            b70VarJ.r(new k1(context2, h0Var), z5.n(-1, 8));
            arrayList = new ArrayList();
            str = tL_sponsoredMessage.url;
            if (str != null || TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(this.currentAccount).linkPrefix)) {
                b70Var = b70Var2;
            } else {
                TextView textView5 = new TextView(context2);
                textView5.setTextColor(h0Var.N0(g6.gc));
                textView5.setTextSize(1, 14.0f);
                textView5.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                textView5.setMaxWidth(AndroidUtilities.dp(300.0f));
                Uri uri = Uri.parse(tL_sponsoredMessage.url);
                textView5.setText(we.e.v(uri, null, null, we.e.a(uri.getHost()), null));
                textView5.setBackground(g6.Y(h0Var.N0(g6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
                b70Var = b70Var2;
                textView5.setOnClickListener(new a4(this, b70Var, tL_sponsoredMessage, context2, 5));
                textView5.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view3) {
                        return VideoAds.lambda$show$8(tL_sponsoredMessage, view3);
                    }
                });
                arrayList.add(textView5);
            }
            if (tL_sponsoredMessage.sponsor_info != null) {
                TextView textView6 = new TextView(context2);
                textView6.setTextColor(h0Var.N0(g6.E8));
                textView6.setTextSize(1, 14.0f);
                textView6.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                textView6.setMaxWidth(AndroidUtilities.dp(300.0f));
                textView6.setText(tL_sponsoredMessage.sponsor_info);
                int iN1 = h0Var.N0(g6.I5);
                if (tL_sponsoredMessage.additional_info == null) {
                    i12 = 6;
                } else {
                    i12 = 0;
                }
                textView6.setBackground(g6.Y(iN1, 0, i12));
                final int i17 = 0;
                textView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        switch (i17) {
                            case 0:
                                VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view3);
                                break;
                            case 1:
                                VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view3);
                                break;
                            default:
                                ((b70) tL_sponsoredMessage).s();
                                break;
                        }
                    }
                });
                arrayList.add(textView6);
            }
            if (tL_sponsoredMessage.additional_info != null) {
                TextView textView7 = new TextView(context2);
                textView7.setTextColor(h0Var.N0(g6.E8));
                textView7.setTextSize(1, 14.0f);
                textView7.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                textView7.setMaxWidth(AndroidUtilities.dp(300.0f));
                textView7.setText(tL_sponsoredMessage.additional_info);
                textView7.setBackground(g6.Y(g6.v0(g6.I5, c6Var), 0, 6));
                final int i18 = 1;
                textView7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        switch (i18) {
                            case 0:
                                VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view3);
                                break;
                            case 1:
                                VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view3);
                                break;
                            default:
                                ((b70) tL_sponsoredMessage).s();
                                break;
                        }
                    }
                });
                arrayList.add(textView7);
            }
            while (i10 < arrayList.size()) {
                View view3 = (View) arrayList.get(i10);
                if (i10 > 0) {
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    frameLayout2.setBackgroundColor(h0Var.N0(g6.f23054d7));
                    i11 = -1;
                    LinearLayout.LayoutParams layoutParamsN2 = z5.n(-1, 1);
                    layoutParamsN2.height = 1;
                    b70VarJ.r(frameLayout2, layoutParamsN2);
                } else {
                    i11 = -1;
                }
                b70VarJ.r(view3, z5.n(i11, -2));
            }
            b70Var.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new f3(b70Var, b70VarJ, 2), false);
        }
        if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
            final int i19 = 1;
            b70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) {

                public final VideoAds f21828b;

                {
                    this.f21828b = this;
                }

                @Override
                public final void run() {
                    switch (i19) {
                        case 0:
                            this.f21828b.lambda$show$15(b70Var);
                            break;
                        default:
                            this.f21828b.lambda$show$12(b70Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
            b70Var.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new k7(22, context2, h0Var), false);
            Context context3 = context2;
            b70 b70Var3 = b70Var;
            b70Var = b70Var3;
            b70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new androidx.car.app.utils.b(this, context3, tL_sponsoredMessage, b70Var3, 23), false);
            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                b70Var.k();
                final int i20 = 0;
                b70Var.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable(this) {

                    public final VideoAds f21828b;

                    {
                        this.f21828b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i20) {
                            case 0:
                                this.f21828b.lambda$show$15(b70Var);
                                break;
                            default:
                                this.f21828b.lambda$show$12(b70Var);
                                break;
                        }
                    }
                }, false);
            }
        }
        if (b70Var.x() <= 0) {
            return;
        }
        this.currentMenu = b70Var;
        this.currentMenuTranslationY = adLayout.getTranslationY();
        callback.run(Boolean.TRUE);
        b70Var.f26987p = new k7(21, this, callback);
        b70Var.Z();
        checkPopupShownCallback();
    }

    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        we.e.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            ec ecVar = this.bulletin;
            if (ecVar != null) {
                ecVar.b();
                return;
            }
            return;
        }
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        ec ecVar2 = this.bulletin;
        if (ecVar2 != null) {
            ecVar2.b();
            this.bulletin = null;
        }
        MessagesController.getInstance(this.currentAccount).disableAds(true);
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
    }

    public void lambda$show$3(ec ecVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        ec ecVar2 = this.bulletin;
        if (ecVar2 == null || ecVar2 != ecVar) {
            return;
        }
        ecVar2.f28020j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        ecVar2.i(true);
    }

    public void lambda$show$4(ec ecVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        ec ecVar2 = this.bulletin;
        if (ecVar2 == null || ecVar2 != ecVar || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        zArr[0] = zBooleanValue;
        closeDrawable.setPaused(zBooleanValue);
        if (zArr[0]) {
            this.bulletin.i(false);
            jArr[0] = System.currentTimeMillis();
            AndroidUtilities.cancelRunOnUIThread(runnable);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
        long jCurrentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
        long j11 = (((long) tL_sponsoredMessage.min_display_duration) * 1000) - jCurrentTimeMillis;
        long j12 = (((long) tL_sponsoredMessage.max_display_duration) * 1000) - jCurrentTimeMillis;
        if (j12 <= 0) {
            ec ecVar3 = this.bulletin;
            if (ecVar3 != null) {
                ecVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j11 > 0) {
            AndroidUtilities.runOnUIThread(runnable, j11);
            return;
        }
        ec ecVar4 = this.bulletin;
        ecVar4.f28020j = (int) j12;
        ecVar4.i(true);
    }

    public void lambda$show$5(ec ecVar, boolean[] zArr) {
        ec ecVar2 = this.bulletin;
        if (ecVar2 == null || ecVar2 != ecVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        b70 b70Var = this.currentMenu;
        if (b70Var != null) {
            b70Var.u();
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

    public void lambda$show$7(b70 b70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        b70Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        we.e.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    public static void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
    }

    public void lambda$showPremium$19(g2 g2Var) {
        if (g2Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).isSponsoredDisabled()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f21845a.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i10, long j10, int i11, mc mcVar) {
        mc mcVar2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j10);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds == null || ((videoAds.msg_id != i11 || System.currentTimeMillis() - videoAds.lastTime > 180000) && videoAds.ads.isEmpty())) {
            HashMap<VideoAdsLocation, VideoAds> map = cached;
            mcVar2 = mcVar;
            VideoAds videoAds2 = new VideoAds(i10, j10, i11, mcVar2);
            map.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        } else {
            mcVar2 = mcVar;
        }
        videoAds.init(mcVar2);
        return videoAds;
    }

    private void schedule() {
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.showRunnable, Math.max(0L, (((long) (this.first ? this.start_delay : this.between_delay)) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = jCurrentTimeMillis;
        ec ecVar = this.bulletin;
        if (ecVar != null) {
            ecVar.b();
            this.bulletin = null;
        }
        Context contextW = this.bulletinFactory.W();
        c6 c6Var = this.bulletinFactory.f30645c;
        AdLayout adLayout = new AdLayout(contextW, c6Var) {
            @Override
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        h5 h5Var = adLayout.titleTextView;
        Context contextW2 = this.bulletinFactory.W();
        int i10 = g6.Oh;
        h5Var.i(new AdOptionsDrawable(contextW2, g6.v0(i10, this.bulletinFactory.f30645c)));
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
        closeDrawable.setColor(g6.v0(i10, this.bulletinFactory.f30645c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new x1(2, this, closeDrawable));
        final ec ecVarB = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = ecVarB;
        ecVarB.f28031u = false;
        ecVarB.i(false);
        final j3.m mVar = new j3.m(this, ecVarB, tL_sponsoredMessage, 24);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f21832a.lambda$show$4(ecVarB, zArr, closeDrawable, jArr2, mVar, jArr, jCurrentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(mVar, ((long) tL_sponsoredMessage.min_display_duration) * 1000);
        ec ecVar2 = this.bulletin;
        ecVar2.f28028r = false;
        ecVar2.v = new j3.m(this, ecVarB, new boolean[1], 25);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, ecVarB, tL_sponsoredMessage, contextW, c6Var, adLayout, callback, 0));
        ec ecVar3 = this.bulletin;
        x1 x1Var = new x1(3, this, tL_sponsoredMessage);
        jb jbVar = ecVar3.f28016e;
        if (jbVar != null) {
            jbVar.setOnClickListener(x1Var);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    public void showPremium() {
        g2 g2Var = this.premiumSheet;
        if (g2Var != null) {
            g2Var.dismiss();
            this.premiumSheet = null;
        }
        g2 g2Var2 = new g2(new n2() {
            @Override
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.C1);
            }

            @Override
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return activityFindActivity == null ? LaunchActivity.C1 : activityFindActivity;
            }
        }, 3, true);
        this.premiumSheet = g2Var2;
        g2Var2.setOnDismissListener(new k7(19, this, g2Var2));
        g2Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        b70 b70Var = this.currentMenu;
        if (b70Var != null && b70Var.D()) {
            return true;
        }
        g2 g2Var = this.premiumSheet;
        return g2Var != null && g2Var.isShown();
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused == z10) {
            return;
        }
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

    public void stop() {
        if (this.bulletin != null) {
            this.currentBulletinPassedTime = System.currentTimeMillis() - this.bulletinShowTime;
            if (!this.ads.isEmpty()) {
                if (this.currentBulletinPassedTime > ((long) this.ads.get(0).min_display_duration) * 1000) {
                    this.currentBulletinPassedTime = 0L;
                    this.ads.remove(0);
                    this.first = false;
                }
            }
            this.bulletin.b();
            this.bulletin = null;
        } else {
            this.currentBulletinPassedTime = 0L;
        }
        b70 b70Var = this.currentMenu;
        if (b70Var != null) {
            b70Var.u();
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
        public final pz0 text = new pz0(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i10) {
            this.color = i10;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            rectF.left += AndroidUtilities.dp(4.0f);
            this.backgroundPaint.setColor(g6.l1(this.alpha * 0.2f, this.color));
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
