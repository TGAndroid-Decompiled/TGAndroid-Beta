package bi;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.es;
import org.telegram.ui.fo;
import org.telegram.ui.kz;
import org.telegram.ui.vv0;
public abstract class q5 extends ow0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.c6 B0;
    public long B1;
    public a0 B2;
    public boolean B3;
    public final xa C0;
    public boolean C1;
    public int C2;
    public es C3;
    public final c4 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public c9 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public di.d4 F0;
    public boolean F1;
    public d4 F2;
    public final bh.b F3;
    public di.d4 G0;
    public boolean G1;
    public boolean G2;
    public final gh.a G3;
    public di.d4 H0;
    public long H1;
    public float H2;
    public final gh.d H3;
    public int I0;
    public final float I1;
    public w3 I2;
    public final eh.b I3;
    public final sb J0;
    public int J1;
    public p60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final u4 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final h3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final p5 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final o5 O1;
    public final org.telegram.ui.Components.g6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final c4 P0;
    public final com.google.firebase.messaging.m P1;
    public final org.telegram.ui.Components.g6 P2;
    public final r2 P3;
    public org.telegram.ui.Components.r6 Q0;
    public j5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.r6 R0;
    public boolean R1;
    public long R2;
    public final r2 R3;
    public org.telegram.ui.Components.g6 S0;
    public x8 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.g6 T0;
    public boolean T1;
    public boolean T2;
    public final ArrayList T3;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V0;
    public boolean V1;
    public boolean V2;
    public final androidx.activity.i V3;
    public long W0;
    public c4 W1;
    public v40 W2;
    public final org.telegram.ui.Components.g6 W3;
    public long X0;
    public a X1;
    public final vv0 X2;
    public final org.telegram.ui.Components.g6 X3;
    public boolean Y0;
    public l2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.g6 Y3;
    public boolean Z0;
    public m2 Z1;
    public z3 Z2;
    public float Z3;
    public boolean f3508a1;
    public g2 a2;
    public FrameLayout f3509a3;
    public final Path f3510a4;
    public boolean f3511b1;
    public q3 f3512b2;
    public f4 f3513b3;
    public boolean f3514b4;
    public final o4 f3515c1;
    public kh.h f3516c2;
    public boolean f3517c3;
    public ValueAnimator f3518c4;
    public final FrameLayout f3519d1;
    public di.d4 f3520d2;
    public s3 f3521d3;
    public float f3522d4;
    public final b4 f3523e1;
    public ValueAnimator f3524e2;
    public float f3525e3;
    public final ImageReceiver f3526f1;
    public gl0 f3527f2;
    public boolean f3528f3;
    public final ImageReceiver f3529g1;
    public LinearLayout f3530g2;
    public boolean f3531g3;
    public final ArrayList f3532h1;
    public TextView f3533h2;
    public boolean f3534h3;
    public Runnable f3535i1;
    public TextView f3536i2;
    public boolean f3537i3;
    public final k4 f3538j1;
    public qa f3539j2;
    public boolean f3540j3;
    public final kz f3541k1;
    public ViewPropertyAnimator f3542k2;
    public boolean f3543k3;
    public x5 l1;
    public final dh.d f3544l2;
    public final ImageReceiver f3545l3;
    public float f3546m1;
    public final dh.d f3547m2;
    public ah.e f3548m3;
    public final org.telegram.ui.Components.k9 f3549n1;
    public final Paint f3550n2;
    public final ImageReceiver f3551n3;
    public final m5 f3552o1;
    public int f3553o2;
    public org.telegram.ui.Components.s5 f3554o3;
    public final ra f3555p1;
    public ValueAnimator f3556p2;
    public boolean f3557p3;
    public j6.l f3558q1;
    public float f3559q2;
    public boolean f3560q3;
    public int f3561r1;
    public float f3562r2;
    public gl0 f3563r3;
    public org.telegram.ui.ActionBar.e1 f3564s1;
    public float f3565s2;
    public boolean f3566s3;
    public h5 f3567t1;
    public int f3568t2;
    public float f3569t3;
    public TL_stories.PeerStories f3570u1;
    public boolean f3571u2;
    public boolean f3572u3;
    public final ArrayList f3573v1;
    public boolean f3574v2;
    public float f3575v3;
    public final ImageView f3576w0;
    public final ArrayList f3577w1;
    public boolean f3578w2;
    public int f3579w3;
    public final ImageView f3580x0;
    public final n5 f3581x1;
    public boolean f3582x2;
    public int f3583x3;
    public final i5 f3584y0;
    public final u5 f3585y1;
    public int f3586y2;
    public int y3;
    public final bk0 f3587z0;
    public ArrayList f3588z1;
    public final int f3589z2;
    public r2 f3590z3;

    public q5(Context context, final sb sbVar, n5 n5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.f3511b1 = true;
        this.f3532h1 = new ArrayList();
        this.f3561r1 = -5;
        this.I1 = 1.0f;
        o5 o5Var = new o5(this);
        this.O1 = o5Var;
        this.f3559q2 = -1.0f;
        this.f3562r2 = -1.0f;
        this.f3565s2 = -1.0f;
        this.f3589z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.g6(this);
        this.P2 = new org.telegram.ui.Components.g6(this);
        vv0 vv0Var = new vv0();
        this.X2 = vv0Var;
        this.f3525e3 = 1.0f;
        this.P3 = new r2(this, 4);
        this.R3 = new r2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new androidx.activity.i(this, 8);
        this.W3 = new org.telegram.ui.Components.g6(this);
        this.X3 = new org.telegram.ui.Components.g6(this);
        this.Y3 = new org.telegram.ui.Components.g6(this);
        this.f3510a4 = new Path();
        vv0Var.E = new a4.l(this, 8);
        ?? obj = new Object();
        obj.f3472g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f3573v1 = new ArrayList();
        this.f3577w1 = new ArrayList();
        b4 b4Var = new b4(this, 0);
        this.f3523e1 = b4Var;
        b4Var.setCrossfadeWithOldImage(false);
        b4Var.setAllowLoadingOnAttachedOnly(true);
        b4Var.ignoreNotifications = true;
        b4Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f3545l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f3551n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f3526f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f3529g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        b4Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f3549n1 = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.J0 = sbVar;
        this.f3581x1 = n5Var;
        this.P1 = n5Var.f3367g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        n5Var.f3371l.setColor(-16777216);
        this.f3550n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = c6Var;
        setClipChildren(false);
        k4 k4Var = new k4(this, context, this.f3515c1, c6Var, sbVar);
        this.f3538j1 = k4Var;
        eh.b bVar = new eh.b(c6Var, org.telegram.ui.ActionBar.g6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        ih.j jVar = new ih.j(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.f2749f = jVar;
        bVar2.f2750g = this;
        this.F3 = bVar2;
        this.f3544l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.f3547m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        o4 o4Var = new o4(this, context, n5Var, sbVar);
        this.f3515c1 = o4Var;
        o4Var.setClipChildren(false);
        this.f3541k1 = new kz(this.C2, o4Var);
        o4Var.addView(k4Var, w7.z5.d(-1.0f, -1));
        u4 u4Var = new u4(this, getContext(), sbVar.f3718y, sbVar, c6Var);
        this.K0 = u4Var;
        u4Var.f3136b0.setOnClickListener(new t2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(n5Var.f3372m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new t2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(n5Var.f3373n);
        imageView2.setPadding(dp, dp, dp, dp);
        c4 c4Var = new c4(this, getContext(), 1);
        this.P0 = c4Var;
        org.telegram.ui.Components.r6 r6Var = this.R0;
        if (r6Var != null) {
            r6Var.setCallback(c4Var);
        }
        c4Var.setWillNotDraw(false);
        c4Var.setOnClickListener(new t2(this, 12));
        c4 c4Var2 = new c4(this, getContext(), 2);
        this.D0 = c4Var2;
        org.telegram.ui.Components.r6 r6Var2 = this.Q0;
        if (r6Var2 != null) {
            r6Var2.setCallback(c4Var2);
        }
        c4Var2.setWillNotDraw(false);
        c4Var2.setOnClickListener(new t2(this, 13));
        c4Var2.setOnLongClickListener(new g3(0, this, sbVar));
        c9 c9Var = new c9(context, n5Var);
        this.E0 = c9Var;
        c9Var.setPadding(dp, dp, dp, dp);
        c4Var2.addView(this.E0, w7.z5.e(40, 40, 3));
        c4Var.addView(imageView2, w7.z5.e(40, 40, 3));
        w7.b6.b(c4Var2, 0.3f, 5.0f);
        w7.b6.b(c4Var, 0.3f, 5.0f);
        b4Var.setAllowLoadingOnAttachedOnly(true);
        b4Var.setParentView(o4Var);
        u5 u5Var = new u5(10);
        this.f3585y1 = u5Var;
        o4Var.setOutlineProvider(u5Var);
        o4Var.setClipToOutline(true);
        addView(o4Var);
        m5 m5Var = new m5(context, o5Var);
        this.f3552o1 = m5Var;
        m5Var.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f3407b;

            {
                this.f3407b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        q5 q5Var = this.f3407b;
                        long j10 = UserConfig.getInstance(q5Var.C2).clientUserId;
                        long j11 = q5Var.B1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        sb sbVar2 = sbVar;
                        if (i11 == 0) {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, "type");
                            f7.putLong("dialog_id", q5Var.B1);
                            sbVar2.H(new cb0(f7, null));
                            return;
                        } else if (j11 > 0) {
                            sbVar2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            sbVar2.H(fo.W9(j11));
                            return;
                        }
                    default:
                        q5 q5Var2 = this.f3407b;
                        if (q5Var2.O1.j()) {
                            sbVar.O();
                            if (!sb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i5 i5Var = q5Var2.f3584y0;
                            if (!sb.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            i5Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        q5Var2.c1(true);
                        return;
                }
            }
        });
        o4Var.addView(m5Var, w7.z5.a(-2.0f, 0.0f, 17.0f, 0.0f, 0.0f, -1, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3519d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.z5.q(40, 40, 5));
        linearLayout.addView(c4Var, w7.z5.q(40, 40, 5));
        linearLayout.addView(c4Var2, w7.z5.q(40, 40, 5));
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        ImageView imageView3 = new ImageView(context);
        this.f3576w0 = imageView3;
        imageView3.setImageDrawable(n5Var.f3376q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        o4Var.addView(imageView3, w7.z5.a(40.0f, 2.0f, 15.0f, 2.0f, 0.0f, 40, 53));
        ImageView imageView4 = new ImageView(context);
        this.f3580x0 = imageView4;
        imageView4.setImageDrawable(n5Var.f3377r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        o4Var.addView(imageView4, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        imageView4.setOnClickListener(new ah.g0(sbVar, 3));
        imageView3.setOnClickListener(new l0(this, c6Var, sbVar, context, n5Var, 1));
        i5 i5Var = new i5(context, 0);
        this.f3584y0 = i5Var;
        o4Var.addView(i5Var, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        ?? imageView5 = new ImageView(context);
        this.f3587z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        i5Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(n5Var.f3379t);
        i5Var.addView(imageView6);
        imageView6.setVisibility(8);
        xa xaVar = new xa(context);
        this.C0 = xaVar;
        xaVar.setOnClickListener(new t2(this, 2));
        o4Var.addView(xaVar, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 60, 53));
        i5Var.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f3407b;

            {
                this.f3407b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        q5 q5Var = this.f3407b;
                        long j10 = UserConfig.getInstance(q5Var.C2).clientUserId;
                        long j11 = q5Var.B1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        sb sbVar2 = sbVar;
                        if (i11 == 0) {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, "type");
                            f7.putLong("dialog_id", q5Var.B1);
                            sbVar2.H(new cb0(f7, null));
                            return;
                        } else if (j11 > 0) {
                            sbVar2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            sbVar2.H(fo.W9(j11));
                            return;
                        }
                    default:
                        q5 q5Var2 = this.f3407b;
                        if (q5Var2.O1.j()) {
                            sbVar.O();
                            if (!sb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i5 i5Var2 = q5Var2.f3584y0;
                            if (!sb.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            i5Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        q5Var2.c1(true);
                        return;
                }
            }
        });
        this.f3555p1 = new ra(this, n5Var);
        o4Var.addView(u4Var, w7.z5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        h3 h3Var = new h3(this, context, sbVar, sbVar.v, view, frameLayout, sbVar);
        this.L0 = h3Var;
        o4Var.addView(view, w7.z5.e(-1, 200, 87));
        o4Var.addView(h3Var, w7.z5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        o4Var.addView(frameLayout, w7.z5.a(100.0f, 0.0f, 55.0f, 0.0f, 0.0f, -1, 0));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        i5Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.j0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        c4Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        c4Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.y9 y9Var = u4Var.W;
        View n10 = y9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        y9Var.D = new i3(this, 0);
        y9Var.S(this);
    }

    public static void V0(w8 w8Var, ImageReceiver imageReceiver, String str) {
        if (w8Var.f3923s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(w8Var.f3920f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(w8Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(q5 q5Var, ValueAnimator valueAnimator) {
        float f7;
        xa xaVar = q5Var.C0;
        q5Var.f3522d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m5 m5Var = q5Var.f3552o1;
        m5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.f3522d4);
        m5Var.setAlpha(1.0f - q5Var.f3522d4);
        ImageView imageView = q5Var.f3576w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.f3522d4);
        imageView.setAlpha(1.0f - q5Var.f3522d4);
        ImageView imageView2 = q5Var.f3580x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.f3522d4);
        imageView2.setAlpha(1.0f - q5Var.f3522d4);
        i5 i5Var = q5Var.f3584y0;
        i5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.f3522d4);
        i5Var.setAlpha((1.0f - q5Var.f3522d4) * q5Var.f3525e3);
        c4 c4Var = q5Var.W1;
        if (c4Var != null) {
            c4Var.setTranslationY(AndroidUtilities.dp(8.0f) * q5Var.f3522d4);
            q5Var.W1.setAlpha(1.0f - q5Var.f3522d4);
        }
        if (xaVar != null) {
            xaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.f3522d4);
            xaVar.setAlpha(1.0f - q5Var.f3522d4);
        }
        q5Var.K0.setAlpha(1.0f - q5Var.f3522d4);
        j5 j5Var = q5Var.Q1;
        if (j5Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((jb) j5Var).d.V;
        }
        float hideInterfaceAlpha = q5Var.getHideInterfaceAlpha();
        c4 c4Var2 = q5Var.D0;
        if (c4Var2 != null) {
            c4Var2.setAlpha((1.0f - q5Var.f3522d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = q5Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - q5Var.f3522d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        c4 c4Var3 = q5Var.P0;
        if (c4Var3 != null) {
            c4Var3.setAlpha((1.0f - q5Var.f3522d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        q3 q3Var = q5Var.f3512b2;
        if (q3Var != null) {
            q3Var.setAlpha(1.0f - q5Var.f3522d4);
            q5Var.invalidate();
        }
        q5Var.f3515c1.invalidate();
    }

    public static void a0(q5 q5Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = q5Var.D3;
        if (e1Var != null && q5Var.C3 != null && e1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(sb.B1 - 0.2f) < 0.05f) {
                    q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(sb.B1 - 0.5f) < 0.05f) {
                    q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(sb.B1 - 1.0f) < 0.05f) {
                    q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(sb.B1 - 1.5f) < 0.05f) {
                    q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(sb.B1 - 2.0f) < 0.05f) {
                    q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var2 = q5Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    e1Var2.setSubtext(LocaleController.formatString(i10, gd.a(sb.B1) + "x"));
                }
            }
            q5Var.C3.a(sb.B1, z10);
        }
    }

    public static void b0(q5 q5Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!q5Var.I0() && !q5Var.O1.f3420f) {
            if (UserConfig.getInstance(q5Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q5Var.B0).setOnClickListener(new t2(q5Var, 8));
                return;
            }
            Drawable drawable = q5Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            j3 j3Var = new j3(q5Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q5Var.B0);
            c10.setOnClickListener(new t2(q5Var, 9));
            c10.setIcon(j3Var);
        }
    }

    public static void d0(q5 q5Var) {
        o5 o5Var = q5Var.O1;
        TL_stories.StoryItem storyItem = o5Var.f3417a;
        if ((storyItem == null && o5Var.f3418b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = o5Var.h();
        boolean z10 = o5Var.e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), q5Var.getContext(), z10 ? 1 : 0, null, null, new y2(0, q5Var, z10));
            return;
        }
        q5Var.a1();
    }

    public static void e0(q5 q5Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new x2(q5Var, MessagesController.getInstance(q5Var.C2), j10, !z10, str, user), 200L);
    }

    public static void f0(q5 q5Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q5Var.getContext(), 0, q5Var.B0);
        if (q5Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f19248a.R = LocaleController.getString(i10);
        if (q5Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f19248a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new n2(q5Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w2(0));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        ((jb) q5Var.Q1).h(a2Var);
        a2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f24885c;
        e7 e7Var = this.J0.f3713w;
        if (e7Var == null) {
            f7 = 0.0f;
        } else {
            f7 = e7Var.f2995f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        sb sbVar;
        if (!this.O1.f3420f || (sbVar = this.J0) == null || sbVar.A0 == null || D0(true)) {
            return 0L;
        }
        return sbVar.A0.j();
    }

    public static void h0(q5 q5Var) {
        String str;
        sc J;
        org.telegram.ui.ActionBar.c6 c6Var = q5Var.B0;
        o4 o4Var = q5Var.f3515c1;
        if (q5Var.G1) {
            return;
        }
        if (q5Var.E1) {
            if (q5Var.J3 != null && q5Var.K3 != null) {
                sg.j0.D1(new o3(q5Var, 0), q5Var.J3, q5Var.K3, q5Var.B1, true);
                return;
            }
            sb sbVar = q5Var.J0;
            if (sbVar != null) {
                sbVar.f3689k1 = true;
                sbVar.P();
            }
            MessagesController.getInstance(q5Var.C2).getBoostsController().getBoostsStats(q5Var.B1, new u2(q5Var, 0));
            return;
        }
        q3 q3Var = q5Var.f3512b2;
        int i10 = -q5Var.f3561r1;
        q5Var.f3561r1 = i10;
        AndroidUtilities.shakeViewSpring(q3Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (q5Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked()) {
            J = new zc(o4Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new zc(o4Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new r2(q5Var, 5));
        }
        J.j();
    }

    public static void j0(q5 q5Var) {
        o5 o5Var = q5Var.O1;
        if (o5Var.f3417a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f19156id = o5Var.f3417a.f19151id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(q5Var.C2).getInputPeer(q5Var.B1);
        ConnectionsManager.getInstance(q5Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.f3513b3 != null) {
            return;
        }
        f4 f4Var = new f4(getContext(), 0);
        this.f3513b3 = f4Var;
        f4Var.setTextSize(1, 14.0f);
        this.f3513b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.f3513b3.setGravity(19);
        this.f3513b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f3513b3, w7.z5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 3));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        c4 c4Var = new c4(this, getContext(), 0);
        this.W1 = c4Var;
        c4Var.setClickable(true);
        addView(this.W1, w7.z5.a(48.0f, 0.0f, 0.0f, 136.0f, 0.0f, -1, 48));
        d4 d4Var = new d4(this, getContext());
        this.F2 = d4Var;
        d4Var.setOnClickListener(new t2(this, 0));
        this.W1.addView(this.F2, w7.z5.a(32.0f, 9.0f, 11.0f, 0.0f, 0.0f, -1, 0));
        a0 a0Var = new a0(0, getContext(), false);
        this.B2 = a0Var;
        a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.z5.a(28.0f, 13.0f, 13.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.z5.a(-2.0f, 0.0f, 16.0f, 0.0f, 9.0f, -2, 0));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f3581x1.f3378s);
        d4 d4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        d4Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.N(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.f3509a3 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        TextView textView2 = new TextView(getContext());
        w7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, k10, k10));
        textView2.setOnClickListener(new t2(this, 3));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        linearLayout.addView(textView2, w7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.z5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -1, 17));
        this.f3515c1.addView(frameLayout);
        this.f3509a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        t1 t1Var;
        TLRPC.Peer i10;
        t1 t1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        int i11 = (this.B1 > 0L ? 1 : (this.B1 == 0L ? 0 : -1));
        sb sbVar = this.J0;
        if (i11 < 0 && (t1Var2 = sbVar.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = t1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (sbVar.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && sbVar != null && (t1Var = sbVar.A0) != null && t1Var.l()) {
            if (!z10 || (i10 = sbVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        p5 p5Var = this.M2;
        org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) p5Var.e;
        if (n4Var != null && ((SurfaceView) p5Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) p5Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (n4Var != null && (textureView = (TextureView) p5Var.f3471f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            o4 o4Var = this.f3515c1;
            canvas.scale(i10 / o4Var.getMeasuredWidth(), i11 / o4Var.getMeasuredHeight());
            this.f3523e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(di.ca caVar, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        j5 j5Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        di.ea eaVar = new di.ea(context, i10, this.B0);
        eaVar.r1(caVar);
        di.h1 h1Var = eaVar.f6917b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof di.x9) {
                    ((di.x9) view).e(false);
                }
            }
        }
        eaVar.l1(true);
        eaVar.T = new ah.h0(2, this, storyItem);
        ((jb) j5Var).h(eaVar);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        o4 o4Var = this.f3515c1;
        float x11 = view.getX() + o4Var.getX() + x10;
        float y3 = view.getY() + o4Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        o8 o8Var;
        sb sbVar = this.J0;
        if (sbVar != null && (o8Var = sbVar.O0) != null && o8Var.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        TLRPC.User user;
        if (!I0() || (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean K0();

    public final void L0(ah.i1 i1Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        o5 o5Var = this.O1;
        TL_stories.StoryItem storyItem = o5Var.f3417a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && i1Var == null) {
            l0();
            this.S1.g0(this.B1, o5Var.f3417a, null);
        } else if (i1Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f3557p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ah.d1.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f3545l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f3560q3 = true;
                this.S1.g0(this.B1, o5Var.f3417a, ah.i1.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, o5Var.f3417a, i1Var);
        }
        TL_stories.StoryItem storyItem2 = o5Var.f3417a;
        c4 c4Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(ah.i1.d(reaction));
            c4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            c4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = o5Var.f3417a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = o5Var.f3417a.views;
            int i11 = storyViews.reactions_count;
            if (z11) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i12 = i11 + i10;
            storyViews.reactions_count = i12;
            if (i12 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = o5Var.f3417a;
        ah.l1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        t1 t1Var;
        boolean z10;
        if (this.O3 == null) {
            sb sbVar = this.J0;
            if (sbVar != null && (t1Var = sbVar.A0) != null) {
                TLRPC.GroupCall groupCall = t1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
            this.O3 = sendAsPeers;
            q3 q3Var = this.f3512b2;
            if (q3Var != null && sendAsPeers != null) {
                q3Var.M1(true);
            }
        }
    }

    public final boolean N0() {
        q3 q3Var = this.f3512b2;
        if (q3Var == null) {
            return false;
        }
        boolean z10 = q3Var.f22695z2;
        if (z10) {
            q3Var.p1();
        }
        AndroidUtilities.runOnUIThread(new r2(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        u2 u2Var;
        int i10;
        long j11;
        long j12;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f3512b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j13 = this.L3;
        u2 u2Var2 = new u2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (org.telegram.ui.ActionBar.c6) bVar, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j13;
            u2Var = u2Var2;
            i10 = ((org.telegram.ui.Components.b6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.b6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j13;
            u2Var = u2Var2;
            i10 = 0;
        }
        if (j10 <= 0) {
            j11 = 100;
        } else {
            j11 = j10;
        }
        int max = (int) Math.max(messageMinPrice, j11);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i13 = length * 7;
                int i14 = iArr[i13];
                j12 = messageMinPrice;
                int i15 = iArr[i13 + 2];
                if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                    max = Math.max(max, i14);
                    break;
                } else {
                    length--;
                    messageMinPrice = j12;
                }
            } else {
                j12 = messageMinPrice;
                break;
            }
        }
        final long[] jArr = {max};
        final br[] brVarArr = new br[1];
        final di.d dVar = new di.d(context, null, true);
        final ?? obj = new Object();
        obj.f2976c = clientUserId;
        obj.f2977f = textWithEntities;
        obj.f2978g = jArr[0];
        final z0 z0Var = new z0(i12, context, true);
        LinearLayout e = sk.e(context, 0);
        final ah.x xVar = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        e.addView(xVar, w7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ah.x xVar2 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        e.addView(xVar2, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ah.x xVar3 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        e.addView(xVar3, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final y yVar = new y(context, bVar, r6);
        final boolean[] zArr = {true};
        u2 u2Var3 = u2Var;
        long j14 = j12;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(zh.p7.W0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), brVarArr), true, true);
                long j15 = jArr2[0];
                e1 e1Var = obj;
                e1Var.f2978g = j15;
                z0Var.set(e1Var);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = z.b(i16, intValue2, 0);
                int b11 = z.b(i16, num.intValue(), 1);
                int b12 = z.b(i16, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.s6) xVar.f899b).c(formatString, true, true);
                ((org.telegram.ui.Components.s6) xVar2.f899b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.s6) xVar3.f899b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = z.b(i16, num.intValue(), 3);
                int b14 = z.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                yVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        z0Var.set(obj);
        int i16 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i18] >= j14) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j14) {
                    arrayList.add(Integer.valueOf((int) j14));
                }
                int i19 = iArr3[i18];
                if (i19 > i17) {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
                arrayList.add(Integer.valueOf(i19));
                if (iArr3[i18] == i17) {
                    break;
                }
            }
            i18++;
            iArr2 = iArr3;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i2.d.h(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        yVar.f50465e0 = iArr4;
        yVar.setValue((int) jArr[0]);
        linearLayout.addView(yVar, w7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e, w7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.g6.f19707j5;
        TextView b10 = w7.d6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        sk.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(z0Var, w7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        e3Var.show();
        dVar.setOnClickListener(new x(u2Var3, jArr, e3Var, 0));
    }

    public final void P0() {
        if (this.f3512b2 == null) {
            return;
        }
        t0();
        this.I2.f29684j0.f0();
        this.I2.N1(-1, true);
        w3 w3Var = this.I2;
        w3Var.Z = this.B1;
        w3Var.t1();
        this.I2.o1().setText(this.f3512b2.getFieldText());
        ((jb) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.B1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new fo(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.S0(android.net.Uri):void");
    }

    public final void T0(long j10, boolean z10) {
        int i10;
        int i11;
        o5 o5Var;
        if (this.K1 != z10) {
            this.K1 = z10;
            bk0 bk0Var = this.f3587z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f3664a && Build.VERSION.SDK_INT < 33) {
                    sb sbVar = ((jb) this.Q1).d;
                    sbVar.l1 = true;
                    sbVar.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j10);
                g1();
                bk0Var.setAnimation(this.f3581x1.f3380u);
                this.K1 = true;
                this.f3552o1.f3313a.getImageReceiver().setVisible(true, true);
                if (this.O1.f3417a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + o5Var.f3417a.f19151id + " " + o5.c(o5Var));
                }
            } else {
                p0();
                bk0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f3515c1.invalidate();
                invalidate();
                q0();
                sb sbVar2 = ((jb) this.Q1).d;
                sbVar2.I0 = false;
                sbVar2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f3523e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f3526f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f3529g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                x8 x8Var = this.S1;
                long j11 = this.B1;
                boolean z11 = this.K1;
                a0.h hVar = x8Var.f3975m;
                bc bcVar = (bc) hVar.f(j11);
                if (bcVar == null) {
                    bcVar = new bc(x8Var.f3966a, j11, x8Var);
                    hVar.k(bcVar, j11);
                }
                bcVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.B1 != j10) {
            o5 o5Var = this.O1;
            o5Var.f3418b = null;
            o5Var.f3417a = null;
        }
        this.B1 = j10;
        this.f3588z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        x8 x8Var = this.S1;
        TL_stories.PeerStories y3 = x8Var.y(j10);
        if (y3 == null) {
            y3 = x8Var.z(j10);
        } else {
            z10 = false;
        }
        x8Var.S(y3, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j10;
        this.N3 = z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        m5 m5Var = this.f3552o1;
        if (i10 >= 0) {
            if (this.C1 && !z11) {
                m5Var.f3314b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                m5Var.f3314b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                cr crVar = new cr(mutate, null);
                crVar.f23883w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                crVar.h = dp;
                crVar.f23880n = dp2;
                m5Var.f3314b.i(crVar);
            } else {
                m5Var.f3314b.i(null);
            }
            if (user != null) {
                m5Var.f3314b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), m5Var.f3314b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            m5Var.f3314b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j10));
        l5 l5Var = m5Var.f3314b;
        l5 l5Var2 = m5Var.f3314b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        l5Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            cr crVar2 = new cr(mutate2, null);
            crVar2.f23883w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            crVar2.h = dp3;
            crVar2.f23880n = dp4;
            l5Var2.i(crVar2);
            return;
        }
        l5Var2.i(null);
    }

    public final void X0(float f7, float f10, x5 x5Var) {
        this.f3546m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != x5Var) {
            this.l1 = x5Var;
            if (x5Var != null) {
                ImageReceiver imageReceiver = x5Var.f3958a;
                if (imageReceiver.getBitmap() != null) {
                    this.f3523e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        o5 o5Var = this.O1;
        if (o5Var.f3417a != null) {
            sb sbVar = this.J0;
            if (sbVar.f3677f != null) {
                String e = o5Var.e();
                if (z10) {
                    n3 n3Var = new n3(2, this.B0);
                    if (this.D1) {
                        chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.C2).storiesEnabled() && ((!this.D1 && !UserObject.isService(this.B1)) || ChatObject.isPublic(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z3 z3Var = new z3(this, sbVar.f3677f.getContext(), e, e, z11, n3Var);
                    this.Z2 = z3Var;
                    z3Var.f25751i0 = true;
                    TL_stories.StoryItem storyItem = o5Var.f3417a;
                    storyItem.dialogId = this.B1;
                    z3Var.F0 = storyItem;
                    z3Var.f25763s0 = new a6.m(this, 7);
                    ((jb) this.Q1).h(z3Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        o4 o4Var = this.f3515c1;
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        sk.q(R.string.UnsupportedAttachment, new zc(o4Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.T = string;
        ((jb) this.Q1).h(a2Var);
    }

    public final void b1(boolean z10) {
        if (this.f3566s3 != z10) {
            o5 o5Var = this.O1;
            if (o5Var.f3417a != null) {
                this.f3566s3 = z10;
                if (z10) {
                    this.f3563r3.setVisibility(0);
                }
                this.f3563r3.setStoryItem(o5Var.f3417a);
                sb sbVar = ((jb) this.Q1).d;
                sbVar.f3698p1 = z10;
                sbVar.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f3569t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f3563r3.setTransitionProgress(this.f3569t3);
                    ofFloat.addUpdateListener(new s2(this, 1));
                    ofFloat.addListener(new k3(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(org.telegram.ui.Components.es.f24466g);
                    ofFloat.start();
                    return;
                }
                if (this.f3563r3.getReactionsWindow() != null) {
                    this.f3563r3.getReactionsWindow().e();
                }
                this.f3563r3.animate().alpha(0.0f).setDuration(150L).setListener(new l3(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            di.d4 d4Var = new di.d4(getContext(), 1);
            d4Var.l(1.0f, -56.0f);
            this.G0 = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f3515c1.addView(this.G0, w7.z5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
        }
        di.d4 d4Var2 = this.G0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        d4Var2.s(LocaleController.getString(i10));
        this.G0.u();
    }

    public final boolean d1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.J1 < getStoriesCount() - 1) {
                this.J1++;
                f1(false);
                return true;
            }
        } else {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                f1(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        t1 t1Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        sb sbVar = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || sbVar.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f3136b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                q8 o10 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o10 != null && o10.a(this.C2, 1) && this.Q1 != null) {
                    o3 o3Var = new o3(this, 0);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.G1;
                    }
                    ((jb) this.Q1).h(new sg.j0(o10.b(), this.C2, findActivity, o3Var, null));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
                if (this.B1 >= 0 && !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F1 != z10 || this.H1 != DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                    this.F1 = z10;
                    this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    f1(false);
                    r0(true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f18917id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (sbVar != null && (t1Var = sbVar.A0) != null && t1Var.g() == longValue) {
                    f1(false);
                    q3 q3Var = this.f3512b2;
                    if (q3Var != null) {
                        q3Var.I(true);
                        this.f3512b2.M1(true);
                        r0(true);
                    }
                    h3 h3Var = this.L0;
                    if (h3Var != null) {
                        t1 t1Var2 = h3Var.P;
                        if (t1Var2 != null) {
                            j10 = t1Var2.j();
                        }
                        if (h3Var.H != j10) {
                            h3Var.e.N(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            } else {
                return;
            }
        }
        j5 j5Var = this.Q1;
        if (j5Var == null || !((jb) j5Var).d.H0) {
            if (this.K1) {
                j1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((jb) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f3573v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f3577w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.C1 || this.D1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = sbVar.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j11 = this.B1;
                if (j11 != 0) {
                    x8 x8Var = this.S1;
                    TL_stories.PeerStories y3 = x8Var.y(j11);
                    if (y3 == null) {
                        y3 = x8Var.z(j11);
                        z11 = true;
                    }
                    x8Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.f3564s1;
            if (e1Var != null) {
                ViewPropertyAnimator animate = e1Var.animate();
                if (this.S1.K(this.B1) && this.O1.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        le leVar;
        Canvas canvas2;
        org.telegram.ui.Components.r6 r6Var;
        org.telegram.ui.Components.r6 r6Var2;
        l1();
        if (this.D1 && (r6Var2 = this.Q0) != null) {
            r6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (r6Var = this.R0) != null) {
            r6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f3572u3;
        LinearLayout linearLayout = this.O0;
        c4 c4Var = this.D0;
        if (z10) {
            float measuredWidth = (c4Var.getMeasuredWidth() / 2.0f) + c4Var.getX() + linearLayout.getX();
            float measuredHeight = (c4Var.getMeasuredHeight() / 2.0f) + c4Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f3579w3, measuredWidth - f7, org.telegram.ui.Components.es.f24466g.getInterpolation(this.f3575v3));
            float lerp2 = AndroidUtilities.lerp(this.f3583x3, measuredHeight - f7, this.f3575v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f3575v3);
            if (this.f3557p3) {
                org.telegram.ui.Components.s5 s5Var = this.f3554o3;
                if (s5Var != null) {
                    float f10 = lerp3;
                    s5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f3554o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f3551n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f3560q3) {
            float measuredWidth2 = (c4Var.getMeasuredWidth() / 2.0f) + c4Var.getX() + linearLayout.getX();
            float measuredHeight2 = (c4Var.getMeasuredHeight() / 2.0f) + c4Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f3557p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f3545l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f3560q3 = false;
                }
            } else {
                ah.e eVar = this.f3548m3;
                if (eVar != null) {
                    float f16 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f3548m3.b(canvas);
                    if (this.f3548m3.c()) {
                        this.f3548m3.d(this);
                        this.f3548m3 = null;
                        this.f3560q3 = false;
                    }
                } else {
                    this.f3560q3 = false;
                }
            }
        }
        q3 q3Var = this.f3512b2;
        if (q3Var != null) {
            ne neVar = q3Var.f22690y1;
            le leVar2 = q3Var.f22694z1;
            if (q3Var.getAlpha() != 0.0f && (leVar = q3Var.f22577e1) != null && leVar.getParent() != null && q3Var.f22577e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(q3Var.f22577e1.getX() + neVar.getX() + leVar2.getX() + q3Var.getX(), q3Var.f22577e1.getY() + neVar.getY() + leVar2.getY() + q3Var.getY());
                if (q3Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, q3Var.getMeasuredWidth(), q3Var.getMeasuredHeight(), (int) (q3Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                q3Var.f22577e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gl0 gl0Var;
        gl0 gl0Var2;
        gh.d dVar;
        float dp;
        float f7;
        if (view == this.f3521d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f3521d3.getY(), getMeasuredWidth(), this.f3521d3.getY() + this.f3521d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        q3 q3Var = this.f3512b2;
        Paint paint = this.f3550n2;
        c4 c4Var = this.D0;
        n5 n5Var = this.f3581x1;
        if (view == q3Var) {
            float f10 = this.f3559q2;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            o5 o5Var = this.O1;
            if (i10 > 0 && !o5Var.f3420f) {
                n5Var.f3371l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n5Var.f3371l);
            }
            RectF rectF = n5Var.h;
            RectF rectF2 = n5Var.f3368i;
            RectF rectF3 = n5Var.f3369j;
            rectF.set(this.f3512b2.getX(), this.f3512b2.getY() + this.f3512b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f3512b2.getX() + this.f3512b2.getMeasuredWidth(), this.f3512b2.getY() + this.f3512b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!o5Var.f3420f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (c4Var != null && c4Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + c4Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                g2 g2Var = this.a2;
                if (g2Var != null && g2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f3512b2.getY() + this.f3512b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f3512b2.getY() + this.f3512b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f3512b2.setTranslationX((1.0f - this.f3559q2) * dp);
            if (this.f3512b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f3559q2) * (this.f3512b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f3512b2.getEditField().setTranslationY(com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f3559q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, n5Var.h, this.f3559q2, rectF3);
            dh.d dVar2 = this.f3544l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.q(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f3522d4) * (1.0f - this.f3562r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f3559q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (q3Var != null && q3Var.s0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = n5Var.f3370k;
            RectF rectF5 = n5Var.f3370k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f3510a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            dh.d dVar3 = this.f3547m2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.r(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f3527f2 && this.f3512b2 != null) {
                view.setTranslationY(((this.f3512b2.getY() + this.f3512b2.getAnimatedTop()) + (-gl0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f3563r3) {
                    view.setTranslationY((this.O0.getY() + (c4Var.getY() + (-(gl0Var2.getMeasuredHeight() - this.f3563r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    o4 o4Var = this.f3515c1;
                    if (view == o4Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f10157n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(o4Var.getX(), o4Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.C2).storiesEnabled()) {
            return;
        }
        File h = this.O1.h();
        if (h != null && h.exists()) {
            z3 z3Var = this.Z2;
            if (z3Var != null) {
                z3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new r2(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f3588z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        o4 o4Var = this.f3515c1;
        Bitmap createBitmap = Bitmap.createBitmap(o4Var.getWidth(), o4Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public x8 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f3573v1.size()) + this.f3577w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f3573v1;
    }

    public final void h1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f3533h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f3536i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f3533h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f3536i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f3536i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f3588z1;
        sb sbVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f3577w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((w8) arrayList2.get(i11)).f3917a;
                    if (((int) (j10 ^ (j10 >>> 32))) == sbVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f3588z1.indexOf(Integer.valueOf(sbVar.P0));
            if (indexOf < 0 && !this.f3588z1.isEmpty()) {
                if (sbVar.P0 > ((Integer) this.f3588z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (sbVar.P0 < ((Integer) i2.d.h(1, this.f3588z1)).intValue()) {
                    indexOf = this.f3588z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = sbVar.f3676e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !sbVar.N0 && (peerStories = this.f3570u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f3573v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f19151id > this.f3570u1.max_read_id) {
                        this.J1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.J1 == -1) {
            this.J1 = 0;
        }
    }

    public final void j1() {
        o8 o8Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f3573v1;
        arrayList.clear();
        sb sbVar = this.J0;
        if (sbVar.N0) {
            if (!sbVar.S0) {
                arrayList.add(sbVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.f3588z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f3577w1;
            if (arrayList2 != null && (o8Var = sbVar.O0) != null) {
                if (o8Var instanceof f8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((f8) sbVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            w8 w8Var = (w8) E.get(i11);
                            di.k8 k8Var = w8Var.f3919c;
                            if (k8Var != null && !k8Var.f7190g && TextUtils.equals(k8Var.K0, str)) {
                                arrayList3.add(w8Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f3588z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = sbVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (sbVar.O0 != null) {
                while (i10 < sbVar.O0.f3433i.size()) {
                    arrayList.add(((MessageObject) sbVar.O0.f3433i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = sbVar.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f3570u1 = sbVar.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f3570u1 = y3;
                    if (y3 == null) {
                        this.f3570u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f3570u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f3570u1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.S1.E(this.B1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        q5 currentPeerView;
        p60 p60Var = this.J2;
        if (p60Var != null) {
            p60Var.f27862f0 = null;
            p60Var.a(false);
        }
        long j10 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f3417a;
        sb sbVar = this.J0;
        sbVar.getClass();
        if (j10 != 0 && storyItem != null) {
            sb.E1.remove(j10 + (j10 >> 16) + (storyItem.f19151id << 16));
        }
        this.f3537i3 = true;
        ib ibVar = sbVar.f3693n0;
        if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            sc I = new zc(this.f3515c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new r2(this, 2));
            I.f28813r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        o5 o5Var = this.O1;
        TL_stories.StoryItem storyItem = o5Var.f3417a;
        if (storyItem == null) {
            storyItem = o5Var.f3419c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                sb sbVar = this.J0;
                c4 c4Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.r6 r6Var = this.R0;
                    if (r6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        r6Var.t(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.r6 r6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        r6Var2.t(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.g6 g6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        g6Var.d(f10, true);
                        org.telegram.ui.Components.g6 g6Var2 = this.T0;
                        if (g6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            g6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (sbVar.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new br(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = c4Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + c4Var.getLayoutParams().width;
                    c4 c4Var2 = this.P0;
                    if (c4Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = c4Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += c4Var2.getLayoutParams().width;
                        c4Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    c4Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = o5Var.f3417a;
                    k4 k4Var = this.f3538j1;
                    if (storyItem2 == null) {
                        k4Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < k4Var.getChildCount(); i14++) {
                        if (k4Var.getChildAt(i14) instanceof za) {
                            ((za) k4Var.getChildAt(i14)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < storyItem.views.recent_viewers.size(); i16++) {
                        TLObject userOrChat = MessagesController.getInstance(this.C2).getUserOrChat(storyItem.views.recent_viewers.get(i16).longValue());
                        if (userOrChat != null) {
                            this.B2.b(i15, userOrChat, this.C2);
                            i15++;
                        }
                        if (i15 >= 3) {
                            break;
                        }
                    }
                    for (int i17 = i15; i17 < 3; i17++) {
                        this.B2.b(i17, null, this.C2);
                    }
                    this.B2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        br brVar = new br(R.drawable.mini_views_likes, 0);
                        brVar.setOverrideColor(-53704);
                        brVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(brVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        br brVar2 = new br(R.drawable.mini_repost_story, 0);
                        brVar2.setOverrideColor(-14161823);
                        brVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(brVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.gms.internal.play_billing.k3.v(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (sbVar.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                c4Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void l0() {
        c9 c9Var = this.E0;
        c9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m3(0, c9Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        c9 c9Var2 = new c9(getContext(), this.f3581x1);
        this.E0 = c9Var2;
        c9Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.z5.e(40, 40, 3));
        this.f3560q3 = false;
    }

    public final void l1() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        q3 q3Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float dp;
        int i10;
        float f17;
        float f18;
        int i11;
        c4 c4Var;
        ImageView imageView;
        u4 u4Var;
        c4 c4Var2;
        boolean z11;
        float f19;
        gl0 gl0Var;
        float f20;
        int i12;
        float f21;
        float f22;
        float f23 = ((jb) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var = this.O2;
        g6Var.d(f7, false);
        int i13 = this.f3568t2;
        if (i13 != 0 && this.f3571u2) {
            f10 = w7.r.a(this.H2 / i13, 0.0f, 1.0f);
        } else if (this.f3574v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var2 = this.W3;
        float f24 = g6Var2.f24885c;
        org.telegram.ui.Components.g6 g6Var3 = this.X3;
        float f25 = g6Var3.f24885c;
        org.telegram.ui.Components.g6 g6Var4 = this.Y3;
        float f26 = g6Var4.f24885c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        g6Var2.d(f11, false);
        if (!this.f3537i3) {
            q3 q3Var2 = this.f3512b2;
            if (q3Var2 != null && !TextUtils.isEmpty(q3Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            g6Var3.d(f22, false);
        }
        q3 q3Var3 = this.f3512b2;
        if (q3Var3 != null && q3Var3.f22696z3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        g6Var4.d(f12, false);
        final q3 q3Var4 = this.f3512b2;
        if (q3Var4 != null) {
            q5 q5Var = q3Var4.f3504s5;
            f13 = 1.0f;
            int backgroundTop = q3Var4.getBackgroundTop();
            int i14 = q3Var4.p5;
            if (i14 != 0 && backgroundTop != i14) {
                int i15 = (q3Var4.T1 + i14) - backgroundTop;
                q3Var4.setAnimatedTop(i15);
                q5Var.V2 = true;
                ValueAnimator valueAnimator = q5Var.f3524e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    q5Var.f3524e2.cancel();
                }
                View view = q3Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    q3Var4.G1.setTranslationY(((1.0f - q3Var4.getTopViewEnterProgress()) * q3Var4.G1.getLayoutParams().height) + q3Var4.T1);
                }
                q5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i15, 0.0f);
                q5Var.f3524e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                q3 q3Var5 = q3Var4;
                                q3Var5.getClass();
                                q3Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                q5 q5Var2 = q3Var5.f3504s5;
                                q5Var2.V2 = true;
                                q5Var2.invalidate();
                                q3Var5.invalidate();
                                return;
                            default:
                                q3Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                q5Var.f3524e2.addListener(new ah.b(q3Var4, 7));
                q5Var.f3524e2.setDuration(250L);
                q5Var.f3524e2.setInterpolator(ki.n.V);
                q5Var.f3524e2.start();
                q3Var4.p5 = 0;
            }
            if (q3Var4.f22632n3) {
                float scrollY = (q3Var4.f3503r5 - q3Var4.E0.getScrollY()) + (q3Var4.f3502q5 - q3Var4.E0.getMeasuredHeight());
                rf rfVar = q3Var4.E0;
                rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(q3Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                q3 q3Var5 = q3Var4;
                                q3Var5.getClass();
                                q3Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                q5 q5Var2 = q3Var5.f3504s5;
                                q5Var2.V2 = true;
                                q5Var2.invalidate();
                                q3Var5.invalidate();
                                return;
                            default:
                                q3Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = q3Var4.f3501o5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                q3Var4.f3501o5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ki.n.V);
                ofFloat2.start();
                q3Var4.f22632n3 = false;
                q5Var.l1();
            }
            q3Var4.getMeasuredHeight();
        } else {
            f13 = 1.0f;
        }
        q3 q3Var5 = this.f3512b2;
        if (q3Var5 != null && q3Var5.r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f3582x2;
        Paint paint = this.f3550n2;
        if (z12) {
            paint.setColor(i0.a.d(this.f3559q2, -14933463, org.telegram.ui.ActionBar.g6.m1(0.44f, -16777216)));
            float f27 = f13;
            paint.setAlpha((int) ((f27 - this.f3522d4) * org.telegram.messenger.g0.z(f27, this.f3562r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((f13 - this.f3522d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        sb sbVar = this.J0;
        if (z13 || this.Z3 != sbVar.f3673d0 || g6Var.f24885c != this.Q2 || this.f3565s2 != this.H2 || f10 != this.f3559q2 || f23 != this.f3562r2 || f24 != g6Var2.f24885c || z10 || f26 != g6Var4.f24885c || f25 != g6Var3.f24885c) {
            this.V2 = false;
            this.f3565s2 = this.H2;
            int i16 = (g6Var.f24885c > this.Q2 ? 1 : (g6Var.f24885c == this.Q2 ? 0 : -1));
            o4 o4Var = this.f3515c1;
            if (i16 != 0) {
                o4Var.invalidate();
            }
            if (f23 != 0.0f) {
                o4Var.setLayerType(2, null);
            } else {
                o4Var.setLayerType(0, null);
            }
            this.Q2 = g6Var.f24885c;
            this.f3562r2 = f23;
            this.f3559q2 = f10;
            this.Z3 = sbVar.f3673d0;
            float height = this.H2 - (getHeight() - o4Var.getBottom());
            if (this.f3512b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = q3Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f3553o2 - (getHeight() - o4Var.getBottom());
            q3 q3Var6 = this.f3512b2;
            if (q3Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = q3Var6.getHeightWithTopView();
                if (this.f3574v2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            q3 q3Var7 = this.f3512b2;
            if (q3Var7 != null) {
                if (this.f3520d2 != null) {
                    ImageView suggestButton = q3Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f3520d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f3520d2.setTranslationY(-((getHeight() - this.f3512b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                nu editField = this.f3512b2.getEditField();
                xp0 senderSelectView = this.f3512b2.getSenderSelectView();
                if (editField != null) {
                    f16 = 6.0f;
                    f21 = 1.0f;
                    float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f10);
                    editField.setScaleX(lerp);
                    editField.setScaleY(lerp);
                } else {
                    f16 = 6.0f;
                    f21 = 1.0f;
                }
                if (senderSelectView != null) {
                    float lerp2 = AndroidUtilities.lerp(0.8f, f21, f10);
                    senderSelectView.setScaleX(lerp2);
                    senderSelectView.setScaleY(lerp2);
                    senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, f10));
                }
            } else {
                f16 = 6.0f;
            }
            if (this.f3582x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f3582x2 && !this.f3574v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f16) * f10) + max3;
            h3 h3Var = this.L0;
            o0 o0Var = h3Var.f3058c;
            h3Var.K = dp2;
            if (Math.abs(h3Var.L - max4) > 0.1f) {
                h3Var.L = max4;
                f17 = 0.8f;
                i11 = 0;
                f18 = 8.0f;
                o0Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - o0Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!o0Var.canScrollVertically(1)) {
                    h3Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 0.8f;
                f18 = 8.0f;
                i11 = 0;
            }
            h3Var.setTranslationY(-h3Var.K);
            h3Var.invalidate();
            di.j4 j4Var = sbVar.D0;
            if (j4Var != null) {
                j4Var.setKeyboardOffset(max);
            }
            gl0 gl0Var2 = this.f3527f2;
            o5 o5Var = this.O1;
            if (gl0Var2 != null) {
                if (this.f3559q2 > 0.0f && (o5Var == null || !o5Var.f3420f)) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                gl0Var2.setVisibility(i12);
            }
            int i17 = i11;
            while (true) {
                int childCount = getChildCount();
                c4Var = this.P0;
                imageView = this.N0;
                u4Var = this.K0;
                c4Var2 = this.D0;
                if (i17 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != u4Var.W.n(getContext())) {
                    q3 q3Var8 = this.f3512b2;
                    if (q3Var8 != null && childAt == q3Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f3512b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof v40) {
                        v40 v40Var = (v40) childAt;
                        View view2 = v40Var.e;
                        if (view2 != null) {
                            v40Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != o4Var && childAt != imageView && childAt != this.O0 && childAt != c4Var && childAt != this.W2 && childAt != this.f3520d2 && childAt != c4Var2 && ((gl0Var = this.f3563r3) == null || gl0Var.getReactionsWindow() == null || childAt != this.f3563r3.getReactionsWindow().f870c)) {
                        float f28 = this.f3559q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f18) * f29)) - (AndroidUtilities.dp(20.0f) * sbVar.f3673d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f3582x2) {
                            f20 = (1.0f - this.f3562r2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f3513b3) {
                            dp3 = sbVar.f3673d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f3521d3) {
                            dp3 -= this.f3512b2.getMeasuredHeight() - this.f3512b2.getAnimatedTop();
                            f20 = this.f3559q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f3516c2) {
                            dp3 -= this.f3512b2.getMeasuredHeight() - this.f3512b2.getAnimatedTop();
                            f20 *= this.f3559q2;
                        }
                        if (childAt == this.f3527f2) {
                            float f30 = (1.0f - g6Var3.f24885c) * (1.0f - f26) * (1.0f - g6Var2.f24885c) * this.f3559q2;
                            float f31 = f20 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f3527f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            q3 q3Var9 = this.f3512b2;
                            if (q3Var9 == null || childAt != q3Var9.O1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f3582x2) {
                        childAt.setAlpha((1.0f - this.f3522d4) * (1.0f - this.f3562r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f3522d4) * hideInterfaceAlpha);
                    }
                    i17++;
                }
                i17++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f3522d4) * f34);
            c4Var2.setAlpha((1.0f - this.f3522d4) * f34);
            if (c4Var != null) {
                c4Var.setAlpha((1.0f - this.f3522d4) * f34);
            }
            for (int i18 = 0; i18 < o4Var.getChildCount(); i18++) {
                View childAt2 = o4Var.getChildAt(i18);
                if (childAt2 != null && childAt2 != this.M0) {
                    m5 m5Var = this.f3552o1;
                    i5 i5Var = this.f3584y0;
                    if (childAt2 != m5Var && childAt2 != this.f3576w0 && childAt2 != this.f3580x0 && childAt2 != i5Var && childAt2 != this.W1 && childAt2 != u4Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == i5Var) {
                            f19 = this.f3525e3;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == u4Var) {
                            childAt2.setAlpha((1.0f - this.f3522d4) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f3522d4) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f3512b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!o5Var.f3420f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (c4Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + c4Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    g2 g2Var = this.a2;
                    if (g2Var != null && g2Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                q3 q3Var10 = this.f3512b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f3559q2;
                if ((this.S2 || this.E1) && !o5Var.f3420f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q3Var10.e1(f35, f36, f37, z11);
                if (this.f3512b2.getEmojiView() != null) {
                    this.f3512b2.getEmojiView().setAlpha(this.f3559q2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f3518c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f3522d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f3518c4 = ofFloat;
        ofFloat.addUpdateListener(new s2(this, 2));
        this.f3518c4.addListener(new k3(this, z10, 1));
        this.f3518c4.setDuration(420L);
        this.f3518c4.setInterpolator(org.telegram.ui.Components.es.h);
        this.f3518c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f3543k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 0, this.B0);
            a2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            a2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 6);
            a2Var.f19274l0 = string;
            a2Var.m0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            aa.a aVar = new aa.a(29);
            a2Var.f19276n0 = string2;
            a2Var.f19277o0 = aVar;
            a2Var.show();
            return;
        }
        runnable.run();
    }

    public final void o0(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j10 = this.B1;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        m5 m5Var = this.f3552o1;
        org.telegram.ui.Components.k9 k9Var = this.f3549n1;
        if (i13 >= 0) {
            if (j10 == UserConfig.getInstance(this.C2).getClientUserId()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.C1 = z14;
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            if (!UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.F1 = z15;
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            k9Var.m(this.C2, user);
            m5Var.f3313a.getImageReceiver().setForUserOrChat(user, k9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.B3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.E1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.C2).getChatFull(-this.B1) == null) {
                MessagesStorage.getInstance(this.C2).loadChatInfo(-this.B1, true, new CountDownLatch(1), false, false);
            }
            if (this.E1 && !ChatObject.canSendPlain(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F1 = z10;
            this.H1 = MessagesController.getInstance(this.C2).getSendPaidMessagesStars(this.B1);
            k9Var.k(this.C2, chat);
            m5Var.f3313a.getImageReceiver().setForUserOrChat(chat, k9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            x8 x8Var = this.S1;
            long j11 = this.B1;
            a0.h hVar = x8Var.f3975m;
            bc bcVar = (bc) hVar.f(j11);
            if (bcVar == null) {
                bcVar = new bc(x8Var.f3966a, j11, x8Var);
                hVar.k(bcVar, j11);
            }
            bcVar.b(true);
        }
        j1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z16 = this.D1;
        o4 o4Var = this.f3515c1;
        sb sbVar = this.J0;
        int i14 = 8;
        o5 o5Var = this.O1;
        if (z16) {
            B0();
            if (this.f3512b2 == null && (this.E1 || o5Var.f3420f)) {
                v0();
            }
            if (this.f3512b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                q3 q3Var = this.f3512b2;
                if (o5Var.f3420f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i14 = 0;
                }
                q3Var.setVisibility(i14);
                q3 q3Var2 = this.f3512b2;
                boolean z17 = o5Var.f3420f;
                D0(true);
                q3Var2.f1(z17);
                q3 q3Var3 = this.f3512b2;
                if (o5Var.f3420f && !D0(true) && (this.f3574v2 || this.f3512b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                q3Var3.l1(z13, true);
                nu editField = this.f3512b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem = o5Var.f3417a;
                sbVar.getClass();
                editField.setText(sb.u(j12, storyItem));
                this.f3512b2.Y0(this.C2, this.B1);
                this.f3512b2.H1(chat2, null);
            }
            org.telegram.ui.Components.r6 r6Var = this.Q0;
            org.telegram.ui.ActionBar.c6 c6Var = this.B0;
            if (r6Var == null) {
                org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, false, false);
                this.Q0 = r6Var2;
                c4 c4Var = this.D0;
                r6Var2.setCallback(c4Var);
                this.Q0.u(c6Var.E0(org.telegram.ui.ActionBar.g6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.g6(c4Var);
            }
            c4 c4Var2 = this.P0;
            if (c4Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(false, false, false);
                this.R0 = r6Var3;
                r6Var3.setCallback(c4Var2);
                this.R0.u(c6Var.E0(org.telegram.ui.ActionBar.g6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.g6(c4Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            o4Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (o5Var.f3420f) {
                this.W1.setVisibility(8);
                if (this.f3512b2 == null) {
                    v0();
                }
                this.f3512b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                q3 q3Var4 = this.f3512b2;
                if (q3Var4 != null) {
                    q3Var4.setVisibility(8);
                }
            }
            q3 q3Var5 = this.f3512b2;
            if (q3Var5 != null) {
                boolean z18 = o5Var.f3420f;
                D0(true);
                q3Var5.f1(z18);
                q3 q3Var6 = this.f3512b2;
                if (o5Var.f3420f && !D0(true) && (this.f3574v2 || this.f3512b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                q3Var6.l1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f3588z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(sbVar.P0));
                    if (indexOf < 0 && !this.f3588z1.isEmpty()) {
                        if (sbVar.P0 > ((Integer) this.f3588z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (sbVar.P0 < ((Integer) i2.d.h(1, this.f3588z1)).intValue()) {
                            indexOf = this.f3588z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f3577w1.isEmpty();
                    ArrayList arrayList2 = this.f3573v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i15)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i15)).f19151id > this.S1.f3969f.get(this.B1)) {
                                this.J1 = i15;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            o4Var.invalidate();
            invalidate();
        } else {
            if (this.f3512b2 == null) {
                v0();
            }
            if (this.F1 && this.f3530g2 == null) {
                z0();
            }
            if (this.f3530g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                LinearLayout linearLayout = this.f3530g2;
                if ((this.F1 && !o5Var.f3420f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            qa qaVar = this.f3539j2;
            if (qaVar != null) {
                qaVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            q3 q3Var7 = this.f3512b2;
            if (q3Var7 != null) {
                if (!I0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                q3Var7.setVisibility(i11);
                q3 q3Var8 = this.f3512b2;
                boolean z19 = o5Var.f3420f;
                D0(true);
                q3Var8.f1(z19);
                q3 q3Var9 = this.f3512b2;
                if (o5Var.f3420f && !D0(true) && (this.f3574v2 || this.f3512b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q3Var9.l1(z11, true);
                nu editField2 = this.f3512b2.getEditField();
                long j13 = this.B1;
                TL_stories.StoryItem storyItem2 = o5Var.f3417a;
                sbVar.getClass();
                editField2.setText(sb.u(j13, storyItem2));
                this.f3512b2.Y0(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f3512b2.H1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f3589z2, false);
                }
            }
            this.A1 = getStoriesCount();
            c4 c4Var3 = this.W1;
            if (c4Var3 != null) {
                c4Var3.setVisibility(8);
            }
            o4Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3508a1 = true;
        this.f3523e1.onAttachedToWindow();
        this.f3529g1.onAttachedToWindow();
        this.f3526f1.onAttachedToWindow();
        this.f3545l3.onAttachedToWindow();
        this.f3551n3.onAttachedToWindow();
        q3 q3Var = this.f3512b2;
        if (q3Var != null) {
            q3Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3532h1;
            if (i10 < arrayList.size()) {
                ((ah.y0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3508a1 = false;
        this.f3523e1.onDetachedFromWindow();
        this.f3529g1.onDetachedFromWindow();
        this.f3526f1.onDetachedFromWindow();
        this.f3545l3.onDetachedFromWindow();
        this.f3551n3.onDetachedFromWindow();
        q3 q3Var = this.f3512b2;
        if (q3Var != null) {
            q3Var.B0();
        }
        org.telegram.ui.Components.s5 s5Var = this.f3554o3;
        if (s5Var != null) {
            s5Var.o(this);
            this.f3554o3 = null;
        }
        ah.e eVar = this.f3548m3;
        if (eVar != null) {
            eVar.d(this);
            this.f3548m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3532h1;
            if (i10 < arrayList.size()) {
                ((ah.y0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3581x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f3559q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        u4 u4Var = this.K0;
        if (u4Var.W.x()) {
            u4Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((jb) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.f3512b2 != null && this.f3528f3 && this.f3508a1) {
            r2 r2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f3512b2.I(true);
            boolean z11 = this.F1;
            o5 o5Var = this.O1;
            if ((z11 && !o5Var.f3420f) || this.G1) {
                this.f3543k3 = false;
                this.f3512b2.setEnabled(false);
                this.f3512b2.g1(" ", z10);
            } else if (this.H1 > 0) {
                this.f3543k3 = false;
                this.f3512b2.setEnabled(true);
                this.f3512b2.g1(zh.p7.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!o5Var.f3420f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f3543k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f3512b2.setEnabled(true);
                        if (((int) this.f3512b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f3512b2.getEditField().getMeasuredWidth()) {
                            q3 q3Var = this.f3512b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            q3Var.e = formatString2;
                            q3Var.f22582f = format;
                            q3Var.D1(z10);
                        } else {
                            this.f3512b2.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(r2Var, 1000L);
                        return;
                    }
                }
                this.f3543k3 = false;
                this.f3512b2.setEnabled(true);
                if (o5Var.f3420f) {
                    long starsPrice = this.f3512b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f3512b2.g1(zh.p7.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f3512b2.O4), z10);
                        br brVar = this.f3512b2.O4[0];
                        if (brVar != null) {
                            brVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f3512b2.g1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                q3 q3Var2 = this.f3512b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                q3Var2.g1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f3566s3) {
            if (this.f3563r3.getReactionsWindow() != null) {
                if (this.f3586y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f3563r3.getReactionsWindow().f870c);
                    return true;
                }
                this.f3563r3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        k4 k4Var = this.f3538j1;
        if (k4Var != null) {
            di.d4 d4Var = k4Var.f3932c;
            if (d4Var != null) {
                d4Var.e(true);
                k4Var.f3932c = null;
            }
            k4Var.f3931b = null;
            k4Var.invalidate();
            k4Var.b(false);
        }
        u4 u4Var = this.K0;
        if (u4Var.W.x()) {
            u4Var.W.f(false);
            return true;
        }
        di.d4 d4Var2 = this.F0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        di.d4 d4Var3 = this.G0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        v40 v40Var = this.W2;
        if (v40Var != null) {
            v40Var.b(true);
        }
        h5 h5Var = this.f3567t1;
        if (h5Var != null && h5Var.f26478b) {
            h5Var.a();
            return true;
        }
        q3 q3Var = this.f3512b2;
        if (q3Var != null && q3Var.t0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f3512b2.f22565c1) {
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new n2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((jb) this.Q1).h(alertDialog$Builder.f19248a);
            return true;
        }
        gl0 gl0Var = this.f3527f2;
        if (gl0Var != null && gl0Var.getReactionsWindow() != null && !this.f3527f2.getReactionsWindow().f881q) {
            this.f3527f2.getReactionsWindow().d();
            return true;
        }
        q3 q3Var2 = this.f3512b2;
        if (q3Var2 != null && q3Var2.r0()) {
            if (this.f3586y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f3512b2.getEmojiView());
                return true;
            }
            this.f3512b2.l0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            q3 q3Var3 = this.f3512b2;
            if (q3Var3 != null) {
                long j10 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f3417a;
                Editable editText = q3Var3.getEditText();
                this.J0.getClass();
                sb.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f3512b2);
            return true;
        } else if (u4Var.getVisibility() != 0 || u4Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            u4Var.C();
            this.f3531g3 = false;
            this.f3515c1.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f3541k1.f37550b = i10;
        gl0 gl0Var = this.f3527f2;
        if (gl0Var != null) {
            gl0Var.setCurrentAccount(i10);
            this.f3527f2.p(null, null, true);
        }
        gl0 gl0Var2 = this.f3563r3;
        if (gl0Var2 != null) {
            gl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(j5 j5Var) {
        this.Q1 = j5Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f3528f3 != z10) {
            this.f3528f3 = z10;
            if (z10) {
                this.f3523e1.setCurrentAlpha(1.0f);
                r0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.K1) {
            this.L2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10;
        if (f7 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3511b1 != z10) {
            this.f3511b1 = z10;
            this.f3515c1.invalidate();
            if (this.K1 && this.J0.f3664a && Build.VERSION.SDK_INT < 33) {
                androidx.activity.i iVar = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                sb sbVar = ((jb) this.Q1).d;
                sbVar.l1 = true;
                sbVar.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            b4 b4Var = this.f3523e1;
            if (z10) {
                b4Var.stopAnimation();
                b4Var.setAllowStartAnimation(false);
            } else {
                b4Var.startAnimation();
                b4Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f3515c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            w3 w3Var = new w3(this, getContext(), this.B0);
            this.I2 = w3Var;
            w3Var.f29664c2 = new x3(this);
            w3Var.f29684j0.f0();
            w3 w3Var2 = this.I2;
            w3Var2.W = true;
            w3Var2.t1();
            w3 w3Var3 = this.I2;
            w3Var3.X = new y3(this);
            w3Var3.o1().setText(this.f3512b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.I3);
            this.X1 = aVar;
            aVar.setOnClickListener(new t2(this, 1));
            addView(this.X1, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 83));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        q3 q3Var = new q3(this, AndroidUtilities.findActivity(getContext()), this, new n3(1, c6Var));
        this.f3512b2 = q3Var;
        q3Var.getEditField().useAnimatedTextDrawable();
        this.f3512b2.getEditField().setScaleX(0.0f);
        this.f3512b2.setOverrideKeyboardAnimation(true);
        this.f3512b2.setClipChildren(false);
        this.f3512b2.setDelegate(new r3(this));
        setDelegate(this.f3512b2);
        q3 q3Var2 = this.f3512b2;
        q3Var2.f22692y4 = false;
        q3Var2.f22697z4 = true;
        if (this.O1.f3420f) {
            q3Var2.S0(false, false, false);
        } else {
            q3Var2.S0(true, true, false);
        }
        this.f3512b2.d();
        q3 q3Var3 = this.f3512b2;
        q3Var3.A4 = true;
        addView(q3Var3, w7.z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        if (this.O3 != null) {
            this.f3512b2.M1(false);
        }
        this.f3512b2.G2 = this.f3589z2;
        p5 p5Var = this.M2;
        ((ArrayList) p5Var.f3472g).add(this.f3515c1);
        ((ArrayList) p5Var.f3472g).add(this);
        if (this.f3508a1) {
            this.f3512b2.C0();
        }
        r0(false);
        if (I0()) {
            this.f3512b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), c6Var, this.I3, this.F3);
        this.f3516c2 = hVar;
        hVar.setOnClickListener(new n2(this, 1));
        addView(this.f3516c2, w7.z5.e(57, 300, 85));
        this.f3516c2.setVisibility(8);
        this.f3512b2.setSideButtonsForAttach(this.f3516c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.f3539j2 != null) {
            return;
        }
        qa qaVar = new qa(getContext(), this.B0);
        this.f3539j2 = qaVar;
        qaVar.setOnClickListener(new t2(this, 4));
        this.f3539j2.setAlpha(0.0f);
        this.f3539j2.setVisibility(8);
        addView(this.f3539j2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
    }

    public final void x0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            g2 g2Var = new g2(getContext(), this.I3);
            this.a2 = g2Var;
            g2Var.setOnClickListener(new t2(this, 5));
            g2 g2Var2 = this.a2;
            t1 t1Var = t1.W;
            boolean z11 = true;
            if (t1Var != null && t1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            g2Var2.b(z10, false);
            g2 g2Var3 = this.a2;
            t1 t1Var2 = t1.W;
            if (t1Var2 != null && !t1Var2.m()) {
                z11 = false;
            }
            g2Var3.a(z11, false);
            addView(this.a2, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
        }
    }

    public final void y0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new l2(getContext(), this.C2);
            m2 m2Var = new m2(getContext(), this.Y1, this.I3);
            this.Z1 = m2Var;
            m2Var.setOnClickListener(new t2(this, 6));
            this.Z1.setOnLongClickListener(new q2(this, 1));
            addView(this.Z1, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
            addView(this.Y1, w7.z5.a(200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 85));
        }
    }

    public final void z0() {
        int i10;
        if (this.f3530g2 != null) {
            return;
        }
        if (this.f3512b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f3530g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f3533h2 = textView;
        textView.setTextColor(-8026747);
        this.f3533h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f3533h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f3536i2 = textView3;
        textView3.setTextColor(-1);
        this.f3536i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f3536i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f3536i2.setGravity(17);
        w7.b6.a(this.f3536i2);
        this.f3536i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f3536i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f3530g2.addView(imageView, w7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.f3530g2.addView(this.f3533h2, w7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f3530g2.addView(this.f3536i2, w7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f3512b2.addView(this.f3530g2, w7.z5.a(-1.0f, 14.0f, 0.0f, 8.0f, 0.0f, -1, 119));
    }
}
