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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bs;
import org.telegram.ui.co;
import org.telegram.ui.gz;
public abstract class o5 extends ov0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.f6 B0;
    public long B1;
    public a0 B2;
    public boolean B3;
    public final ua C0;
    public boolean C1;
    public int C2;
    public bs C3;
    public final z3 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.f1 D3;
    public z8 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.f1 E3;
    public di.f4 F0;
    public boolean F1;
    public a4 F2;
    public final bh.b F3;
    public di.f4 G0;
    public boolean G1;
    public boolean G2;
    public final gh.a G3;
    public di.f4 H0;
    public long H1;
    public float H2;
    public final gh.d H3;
    public int I0;
    public final float I1;
    public t3 I2;
    public final eh.b I3;
    public final pb J0;
    public int J1;
    public w50 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final s4 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final e3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final n5 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final m5 O1;
    public final org.telegram.ui.Components.e6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final z3 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.e6 P2;
    public final q2 P3;
    public org.telegram.ui.Components.p6 Q0;
    public h5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.p6 R0;
    public boolean R1;
    public long R2;
    public final q2 R3;
    public org.telegram.ui.Components.e6 S0;
    public u8 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.e6 T0;
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
    public z3 W1;
    public i40 W2;
    public final org.telegram.ui.Components.e6 W3;
    public long X0;
    public a X1;
    public final org.telegram.ui.ov0 X2;
    public final org.telegram.ui.Components.e6 X3;
    public boolean Y0;
    public k2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.e6 Y3;
    public boolean Z0;
    public l2 Z1;
    public w3 Z2;
    public float Z3;
    public boolean f3402a1;
    public f2 a2;
    public FrameLayout f3403a3;
    public final Path f3404a4;
    public boolean f3405b1;
    public n3 f3406b2;
    public c4 f3407b3;
    public boolean f3408b4;
    public final l4 f3409c1;
    public kh.h f3410c2;
    public boolean f3411c3;
    public ValueAnimator f3412c4;
    public final FrameLayout f3413d1;
    public di.f4 f3414d2;
    public p3 f3415d3;
    public float f3416d4;
    public final y3 f3417e1;
    public ValueAnimator f3418e2;
    public float f3419e3;
    public final ImageReceiver f3420f1;
    public fk0 f3421f2;
    public boolean f3422f3;
    public final ImageReceiver f3423g1;
    public LinearLayout f3424g2;
    public boolean f3425g3;
    public final ArrayList f3426h1;
    public TextView f3427h2;
    public boolean f3428h3;
    public Runnable f3429i1;
    public TextView f3430i2;
    public boolean f3431i3;
    public final h4 f3432j1;
    public ma f3433j2;
    public boolean j3;
    public final gz f3434k1;
    public ViewPropertyAnimator f3435k2;
    public boolean f3436k3;
    public v5 l1;
    public final dh.d f3437l2;
    public final ImageReceiver f3438l3;
    public float f3439m1;
    public final dh.d f3440m2;
    public ah.e f3441m3;
    public final org.telegram.ui.Components.i9 f3442n1;
    public final Paint f3443n2;
    public final ImageReceiver f3444n3;
    public final k5 f3445o1;
    public int f3446o2;
    public org.telegram.ui.Components.q5 f3447o3;
    public final na f3448p1;
    public ValueAnimator f3449p2;
    public boolean f3450p3;
    public j6.l f3451q1;
    public float f3452q2;
    public boolean f3453q3;
    public int f3454r1;
    public float f3455r2;
    public fk0 f3456r3;
    public org.telegram.ui.ActionBar.f1 f3457s1;
    public float f3458s2;
    public boolean f3459s3;
    public f5 f3460t1;
    public int f3461t2;
    public float f3462t3;
    public TL_stories.PeerStories f3463u1;
    public boolean f3464u2;
    public boolean f3465u3;
    public final ArrayList f3466v1;
    public boolean f3467v2;
    public float f3468v3;
    public final ImageView f3469w0;
    public final ArrayList f3470w1;
    public boolean f3471w2;
    public int f3472w3;
    public final ImageView f3473x0;
    public final l5 f3474x1;
    public boolean f3475x2;
    public int f3476x3;
    public final g5 f3477y0;
    public final s5 f3478y1;
    public int f3479y2;
    public int y3;
    public final aj0 f3480z0;
    public ArrayList f3481z1;
    public final int f3482z2;
    public q2 f3483z3;

    public o5(Context context, final pb pbVar, l5 l5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.f3405b1 = true;
        this.f3426h1 = new ArrayList();
        this.f3454r1 = -5;
        this.I1 = 1.0f;
        m5 m5Var = new m5(this);
        this.O1 = m5Var;
        this.f3452q2 = -1.0f;
        this.f3455r2 = -1.0f;
        this.f3458s2 = -1.0f;
        this.f3482z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.e6(this);
        this.P2 = new org.telegram.ui.Components.e6(this);
        org.telegram.ui.ov0 ov0Var = new org.telegram.ui.ov0();
        this.X2 = ov0Var;
        this.f3419e3 = 1.0f;
        this.P3 = new q2(this, 4);
        this.R3 = new q2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new androidx.activity.i(this, 8);
        this.W3 = new org.telegram.ui.Components.e6(this);
        this.X3 = new org.telegram.ui.Components.e6(this);
        this.Y3 = new org.telegram.ui.Components.e6(this);
        this.f3404a4 = new Path();
        ov0Var.E = new a6.m(this, 6);
        ?? obj = new Object();
        obj.f3369g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f3466v1 = new ArrayList();
        this.f3470w1 = new ArrayList();
        y3 y3Var = new y3(this, 0);
        this.f3417e1 = y3Var;
        y3Var.setCrossfadeWithOldImage(false);
        y3Var.setAllowLoadingOnAttachedOnly(true);
        y3Var.ignoreNotifications = true;
        y3Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f3438l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f3444n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f3420f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f3423g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        y3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f3442n1 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.J0 = pbVar;
        this.f3474x1 = l5Var;
        this.P1 = l5Var.f3253g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        l5Var.f3257l.setColor(-16777216);
        this.f3443n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = f6Var;
        setClipChildren(false);
        h4 h4Var = new h4(this, context, this.f3409c1, f6Var, pbVar);
        this.f3432j1 = h4Var;
        eh.b bVar = new eh.b(f6Var, org.telegram.ui.ActionBar.j6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        ih.k kVar = new ih.k(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.d = kVar;
        bVar2.f2653e = this;
        this.F3 = bVar2;
        this.f3437l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.f3440m2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        l4 l4Var = new l4(this, context, l5Var, pbVar);
        this.f3409c1 = l4Var;
        l4Var.setClipChildren(false);
        this.f3434k1 = new gz(this.C2, l4Var);
        l4Var.addView(h4Var, w7.x5.c(-1.0f, -1));
        s4 s4Var = new s4(this, getContext(), pbVar.f3586y, pbVar, f6Var);
        this.K0 = s4Var;
        s4Var.f2922b0.setOnClickListener(new s2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(l5Var.f3258m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new s2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.z5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(l5Var.f3259n);
        imageView2.setPadding(dp, dp, dp, dp);
        z3 z3Var = new z3(this, getContext(), 1);
        this.P0 = z3Var;
        org.telegram.ui.Components.p6 p6Var = this.R0;
        if (p6Var != null) {
            p6Var.setCallback(z3Var);
        }
        z3Var.setWillNotDraw(false);
        z3Var.setOnClickListener(new s2(this, 12));
        z3 z3Var2 = new z3(this, getContext(), 2);
        this.D0 = z3Var2;
        org.telegram.ui.Components.p6 p6Var2 = this.Q0;
        if (p6Var2 != null) {
            p6Var2.setCallback(z3Var2);
        }
        z3Var2.setWillNotDraw(false);
        z3Var2.setOnClickListener(new s2(this, 13));
        z3Var2.setOnLongClickListener(new d3(0, this, pbVar));
        z8 z8Var = new z8(context, l5Var);
        this.E0 = z8Var;
        z8Var.setPadding(dp, dp, dp, dp);
        z3Var2.addView(this.E0, w7.x5.e(40, 40, 3));
        z3Var.addView(imageView2, w7.x5.e(40, 40, 3));
        w7.z5.b(z3Var2, 0.3f, 5.0f);
        w7.z5.b(z3Var, 0.3f, 5.0f);
        y3Var.setAllowLoadingOnAttachedOnly(true);
        y3Var.setParentView(l4Var);
        s5 s5Var = new s5(10);
        this.f3478y1 = s5Var;
        l4Var.setOutlineProvider(s5Var);
        l4Var.setClipToOutline(true);
        addView(l4Var);
        k5 k5Var = new k5(context, m5Var);
        this.f3445o1 = k5Var;
        k5Var.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f3354b;

            {
                this.f3354b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        o5 o5Var = this.f3354b;
                        long j3 = UserConfig.getInstance(o5Var.C2).clientUserId;
                        long j10 = o5Var.B1;
                        pb pbVar2 = pbVar;
                        if (j3 == j10) {
                            Bundle e7 = org.telegram.ui.Cells.p6.e(1, "type");
                            e7.putLong("dialog_id", o5Var.B1);
                            pbVar2.H(new ca0(e7, null));
                            return;
                        } else if (j10 > 0) {
                            pbVar2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            pbVar2.H(co.R9(j10));
                            return;
                        }
                    default:
                        o5 o5Var2 = this.f3354b;
                        if (o5Var2.O1.j()) {
                            pbVar.O();
                            if (!pb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            g5 g5Var = o5Var2.f3477y0;
                            if (!pb.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            g5Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        o5Var2.c1(true);
                        return;
                }
            }
        });
        l4Var.addView(k5Var, w7.x5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3413d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.x5.q(40, 40, 5));
        linearLayout.addView(z3Var, w7.x5.q(40, 40, 5));
        linearLayout.addView(z3Var2, w7.x5.q(40, 40, 5));
        addView(linearLayout, w7.x5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f3469w0 = imageView3;
        imageView3.setImageDrawable(l5Var.f3262q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        l4Var.addView(imageView3, w7.x5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f3473x0 = imageView4;
        imageView4.setImageDrawable(l5Var.f3263r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        l4Var.addView(imageView4, w7.x5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.h0(pbVar, 3));
        imageView3.setOnClickListener(new l0(this, f6Var, pbVar, context, l5Var, 1));
        g5 g5Var = new g5(context, 0);
        this.f3477y0 = g5Var;
        l4Var.addView(g5Var, w7.x5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f3480z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        g5Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(l5Var.f3265t);
        g5Var.addView(imageView6);
        imageView6.setVisibility(8);
        ua uaVar = new ua(context);
        this.C0 = uaVar;
        uaVar.setOnClickListener(new s2(this, 2));
        l4Var.addView(uaVar, w7.x5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        g5Var.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f3354b;

            {
                this.f3354b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        o5 o5Var = this.f3354b;
                        long j3 = UserConfig.getInstance(o5Var.C2).clientUserId;
                        long j10 = o5Var.B1;
                        pb pbVar2 = pbVar;
                        if (j3 == j10) {
                            Bundle e7 = org.telegram.ui.Cells.p6.e(1, "type");
                            e7.putLong("dialog_id", o5Var.B1);
                            pbVar2.H(new ca0(e7, null));
                            return;
                        } else if (j10 > 0) {
                            pbVar2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            pbVar2.H(co.R9(j10));
                            return;
                        }
                    default:
                        o5 o5Var2 = this.f3354b;
                        if (o5Var2.O1.j()) {
                            pbVar.O();
                            if (!pb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            g5 g5Var2 = o5Var2.f3477y0;
                            if (!pb.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            g5Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        o5Var2.c1(true);
                        return;
                }
            }
        });
        this.f3448p1 = new na(this, l5Var);
        l4Var.addView(s4Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        e3 e3Var = new e3(this, context, pbVar, pbVar.v, view, frameLayout, pbVar);
        this.L0 = e3Var;
        l4Var.addView(view, w7.x5.e(-1, 200, 87));
        l4Var.addView(e3Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        l4Var.addView(frameLayout, w7.x5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        g5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        z3Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        z3Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.aa aaVar = s4Var.W;
        View o9 = aaVar.o(context);
        if (o9 != null) {
            AndroidUtilities.removeFromParent(o9);
            addView(o9);
        }
        aaVar.D = new f3(this, 0);
        aaVar.T(this);
    }

    public static void V0(t8 t8Var, ImageReceiver imageReceiver, String str) {
        if (t8Var.f3745s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(t8Var.f3742f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(t8Var.f3741e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(o5 o5Var, ValueAnimator valueAnimator) {
        float f7;
        ua uaVar = o5Var.C0;
        o5Var.f3416d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k5 k5Var = o5Var.f3445o1;
        k5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.f3416d4);
        k5Var.setAlpha(1.0f - o5Var.f3416d4);
        ImageView imageView = o5Var.f3469w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.f3416d4);
        imageView.setAlpha(1.0f - o5Var.f3416d4);
        ImageView imageView2 = o5Var.f3473x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.f3416d4);
        imageView2.setAlpha(1.0f - o5Var.f3416d4);
        g5 g5Var = o5Var.f3477y0;
        g5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.f3416d4);
        g5Var.setAlpha((1.0f - o5Var.f3416d4) * o5Var.f3419e3);
        z3 z3Var = o5Var.W1;
        if (z3Var != null) {
            z3Var.setTranslationY(AndroidUtilities.dp(8.0f) * o5Var.f3416d4);
            o5Var.W1.setAlpha(1.0f - o5Var.f3416d4);
        }
        if (uaVar != null) {
            uaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.f3416d4);
            uaVar.setAlpha(1.0f - o5Var.f3416d4);
        }
        o5Var.K0.setAlpha(1.0f - o5Var.f3416d4);
        h5 h5Var = o5Var.Q1;
        if (h5Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((gb) h5Var).d.V;
        }
        float hideInterfaceAlpha = o5Var.getHideInterfaceAlpha();
        z3 z3Var2 = o5Var.D0;
        if (z3Var2 != null) {
            z3Var2.setAlpha((1.0f - o5Var.f3416d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = o5Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - o5Var.f3416d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        z3 z3Var3 = o5Var.P0;
        if (z3Var3 != null) {
            z3Var3.setAlpha((1.0f - o5Var.f3416d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        n3 n3Var = o5Var.f3406b2;
        if (n3Var != null) {
            n3Var.setAlpha(1.0f - o5Var.f3416d4);
            o5Var.invalidate();
        }
        o5Var.f3409c1.invalidate();
    }

    public static void a0(o5 o5Var, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = o5Var.D3;
        if (f1Var != null && o5Var.C3 != null && f1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(pb.B1 - 0.2f) < 0.05f) {
                    o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(pb.B1 - 0.5f) < 0.05f) {
                    o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(pb.B1 - 1.0f) < 0.05f) {
                    o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(pb.B1 - 1.5f) < 0.05f) {
                    o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(pb.B1 - 2.0f) < 0.05f) {
                    o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var2 = o5Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    f1Var2.setSubtext(LocaleController.formatString(i10, fd.a(pb.B1) + "x"));
                }
            }
            o5Var.C3.a(pb.B1, z10);
        }
    }

    public static void b0(o5 o5Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!o5Var.I0() && !o5Var.O1.f3314f) {
            if (UserConfig.getInstance(o5Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, o5Var.B0).setOnClickListener(new s2(o5Var, 8));
                return;
            }
            Drawable drawable = o5Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            g3 g3Var = new g3(o5Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, o5Var.B0);
            c10.setOnClickListener(new s2(o5Var, 9));
            c10.setIcon(g3Var);
        }
    }

    public static void d0(o5 o5Var) {
        m5 m5Var = o5Var.O1;
        TL_stories.StoryItem storyItem = m5Var.f3310a;
        if ((storyItem == null && m5Var.f3311b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = m5Var.h();
        boolean z10 = m5Var.f3313e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), o5Var.getContext(), z10 ? 1 : 0, null, null, new v2(0, o5Var, z10));
            return;
        }
        o5Var.a1();
    }

    public static void e0(o5 o5Var, long j3) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(j3));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-j3));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new u2(o5Var, MessagesController.getInstance(o5Var.C2), j3, !z10, str, user), 200L);
    }

    public static void f0(o5 o5Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o5Var.getContext(), 0, o5Var.B0);
        if (o5Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f20198a.R = LocaleController.getString(i10);
        if (o5Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f20198a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m2(o5Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.emoji2.text.w(16));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        ((gb) o5Var.Q1).h(b2Var);
        b2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f25565c;
        a7 a7Var = this.J0.f3581w;
        if (a7Var == null) {
            f7 = 0.0f;
        } else {
            f7 = a7Var.f2765f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        pb pbVar;
        if (!this.O1.f3314f || (pbVar = this.J0) == null || pbVar.A0 == null || D0(true)) {
            return 0L;
        }
        return pbVar.A0.j();
    }

    public static void h0(o5 o5Var) {
        String str;
        qc J;
        org.telegram.ui.ActionBar.f6 f6Var = o5Var.B0;
        l4 l4Var = o5Var.f3409c1;
        if (o5Var.G1) {
            return;
        }
        if (o5Var.E1) {
            if (o5Var.J3 != null && o5Var.K3 != null) {
                sg.k0.C1(new l3(o5Var, 0), o5Var.J3, o5Var.K3, o5Var.B1, true);
                return;
            }
            pb pbVar = o5Var.J0;
            if (pbVar != null) {
                pbVar.f3557k1 = true;
                pbVar.P();
            }
            MessagesController.getInstance(o5Var.C2).getBoostsController().getBoostsStats(o5Var.B1, new ah.m(o5Var, 1));
            return;
        }
        n3 n3Var = o5Var.f3406b2;
        int i10 = -o5Var.f3454r1;
        o5Var.f3454r1 = i10;
        AndroidUtilities.shakeViewSpring(n3Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (o5Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked()) {
            J = new yc(l4Var, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new yc(l4Var, f6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new q2(o5Var, 5));
        }
        J.j();
    }

    public static void j0(o5 o5Var) {
        m5 m5Var = o5Var.O1;
        if (m5Var.f3310a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f20112id = m5Var.f3310a.f20107id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(o5Var.C2).getInputPeer(o5Var.B1);
        ConnectionsManager.getInstance(o5Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.f3407b3 != null) {
            return;
        }
        c4 c4Var = new c4(getContext(), 0);
        this.f3407b3 = c4Var;
        c4Var.setTextSize(1, 14.0f);
        this.f3407b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.f3407b3.setGravity(19);
        this.f3407b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f3407b3, w7.x5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        z3 z3Var = new z3(this, getContext(), 0);
        this.W1 = z3Var;
        z3Var.setClickable(true);
        addView(this.W1, w7.x5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a4 a4Var = new a4(this, getContext());
        this.F2 = a4Var;
        a4Var.setOnClickListener(new s2(this, 0));
        this.W1.addView(this.F2, w7.x5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        a0 a0Var = new a0(0, getContext(), false);
        this.B2 = a0Var;
        a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.x5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.x5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f3474x1.f3264s);
        a4 a4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        a4Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.f3403a3 != null) {
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextView textView2 = new TextView(getContext());
        w7.z5.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new s2(this, 3));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        linearLayout.addView(textView2, w7.x5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.x5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.f3409c1.addView(frameLayout);
        this.f3403a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        t1 t1Var;
        TLRPC.Peer i10;
        t1 t1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        pb pbVar = this.J0;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 < 0 && (t1Var2 = pbVar.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = t1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (pbVar.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && pbVar != null && (t1Var = pbVar.A0) != null && t1Var.l()) {
            if (!z10 || (i10 = pbVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        n5 n5Var = this.M2;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) n5Var.f3367e;
        if (l4Var != null && ((SurfaceView) n5Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) n5Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (l4Var != null && (textureView = (TextureView) n5Var.f3368f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            l4 l4Var2 = this.f3409c1;
            canvas.scale(i10 / l4Var2.getMeasuredWidth(), i11 / l4Var2.getMeasuredHeight());
            this.f3417e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(di.ga gaVar, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        h5 h5Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        di.ia iaVar = new di.ia(context, i10, this.B0);
        iaVar.q1(gaVar);
        di.i1 i1Var = iaVar.f7390b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof di.ba) {
                    ((di.ba) view).e(false);
                }
            }
        }
        iaVar.k1(true);
        iaVar.T = new ah.i0(2, this, storyItem);
        ((gb) h5Var).h(iaVar);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        l4 l4Var = this.f3409c1;
        float x11 = view.getX() + l4Var.getX() + x10;
        float y3 = view.getY() + l4Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        l8 l8Var;
        pb pbVar = this.J0;
        if (pbVar != null && (l8Var = pbVar.O0) != null && l8Var.f3272e == 4) {
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

    public final void L0(ah.j1 j1Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        m5 m5Var = this.O1;
        TL_stories.StoryItem storyItem = m5Var.f3310a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && j1Var == null) {
            l0();
            this.S1.g0(this.B1, m5Var.f3310a, null);
        } else if (j1Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f3450p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ah.e1.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f3438l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.f3453q3 = true;
                this.S1.g0(this.B1, m5Var.f3310a, ah.j1.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, m5Var.f3310a, j1Var);
        }
        TL_stories.StoryItem storyItem2 = m5Var.f3310a;
        z3 z3Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(ah.j1.d(reaction));
            z3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            z3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = m5Var.f3310a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = m5Var.f3310a.views;
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
        TL_stories.StoryItem storyItem4 = m5Var.f3310a;
        ah.m1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        t1 t1Var;
        boolean z10;
        if (this.O3 == null) {
            pb pbVar = this.J0;
            if (pbVar != null && (t1Var = pbVar.A0) != null) {
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
            n3 n3Var = this.f3406b2;
            if (n3Var != null && sendAsPeers != null) {
                n3Var.P1(true);
            }
        }
    }

    public final boolean N0() {
        n3 n3Var = this.f3406b2;
        if (n3Var == null) {
            return false;
        }
        boolean z10 = n3Var.f23802y2;
        if (z10) {
            n3Var.s1();
        }
        AndroidUtilities.runOnUIThread(new q2(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        o1 o1Var;
        int i10;
        long j10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f3406b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.L3;
        o1 o1Var2 = new o1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.f6) bVar, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j3 = j12;
            o1Var = o1Var2;
            i10 = ((org.telegram.ui.Components.z5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j12;
            o1Var = o1Var2;
            i10 = 0;
        }
        if (j3 <= 0) {
            j10 = 100;
        } else {
            j10 = j3;
        }
        int max = (int) Math.max(messageMinPrice, j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i13 = length * 7;
                int i14 = iArr[i13];
                j11 = messageMinPrice;
                int i15 = iArr[i13 + 2];
                if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                    max = Math.max(max, i14);
                    break;
                } else {
                    length--;
                    messageMinPrice = j11;
                }
            } else {
                j11 = messageMinPrice;
                break;
            }
        }
        final long[] jArr = {max};
        final nq[] nqVarArr = new nq[1];
        final di.d dVar = new di.d(context, null, true);
        final ?? obj = new Object();
        obj.f2900c = clientUserId;
        obj.f2902f = textWithEntities;
        obj.f2903g = jArr[0];
        final z0 z0Var = new z0(i12, context, true);
        LinearLayout f7 = wl.f(context, 0);
        final ah.y yVar = new ah.y(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f7.addView(yVar, w7.x5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ah.y yVar2 = new ah.y(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f7.addView(yVar2, w7.x5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ah.y yVar3 = new ah.y(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f7.addView(yVar3, w7.x5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final y yVar4 = new y(context, bVar, r6);
        final boolean[] zArr = {true};
        o1 o1Var3 = o1Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(zh.v7.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), nqVarArr), true, true);
                long j14 = jArr2[0];
                e1 e1Var = obj;
                e1Var.f2903g = j14;
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
                ((org.telegram.ui.Components.q6) yVar.f718b).c(formatString, true, true);
                ((org.telegram.ui.Components.q6) yVar2.f718b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.q6) yVar3.f718b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = z.b(i16, num.intValue(), 3);
                int b14 = z.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                yVar4.f(b13, b14, true ^ zArr2[0]);
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
            if (iArr2[i18] >= j13) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
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
        if (arrayList.isEmpty() || ((Integer) i2.g.h(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        yVar4.f52158e0 = iArr4;
        yVar4.setValue((int) jArr[0]);
        linearLayout.addView(yVar4, w7.x5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f7, w7.x5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.j6.f20770j5;
        TextView b10 = w7.b6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.x5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        wl.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.x5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(z0Var, w7.x5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.x5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new x(o1Var3, jArr, f3Var, 0));
    }

    public final void P0() {
        if (this.f3406b2 == null) {
            return;
        }
        t0();
        this.I2.f31291j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.f3406b2.P();
        }
        this.I2.J1(-1, true);
        t3 t3Var = this.I2;
        t3Var.Z = this.B1;
        t3Var.r1();
        this.I2.m1().setText(this.f3406b2.getFieldText());
        ((gb) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j3 = this.B1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new co(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.S0(android.net.Uri):void");
    }

    public final void T0(long j3, boolean z10) {
        int i10;
        int i11;
        if (this.K1 != z10) {
            this.K1 = z10;
            aj0 aj0Var = this.f3480z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f3531a && Build.VERSION.SDK_INT < 33) {
                    pb pbVar = ((gb) this.Q1).d;
                    pbVar.l1 = true;
                    pbVar.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j3);
                g1();
                aj0Var.setAnimation(this.f3474x1.f3266u);
                this.K1 = true;
                this.f3445o1.f3195a.getImageReceiver().setVisible(true, true);
                m5 m5Var = this.O1;
                if (m5Var.f3310a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + m5Var.f3310a.f20107id + " " + m5.c(m5Var));
                }
            } else {
                p0();
                aj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f3409c1.invalidate();
                invalidate();
                q0();
                pb pbVar2 = ((gb) this.Q1).d;
                pbVar2.I0 = false;
                pbVar2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f3417e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f3420f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f3423g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                u8 u8Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar2 = u8Var.f3815m;
                yb ybVar = (yb) iVar2.f(j10);
                if (ybVar == null) {
                    ybVar = new yb(u8Var.f3805a, j10, u8Var);
                    iVar2.k(ybVar, j10);
                }
                ybVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            m5 m5Var = this.O1;
            m5Var.f3311b = null;
            m5Var.f3310a = null;
        }
        this.B1 = j3;
        this.f3481z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        u8 u8Var = this.S1;
        TL_stories.PeerStories y3 = u8Var.y(j3);
        if (y3 == null) {
            y3 = u8Var.z(j3);
        } else {
            z10 = false;
        }
        u8Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        String str;
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        k5 k5Var = this.f3445o1;
        if (j3 >= 0) {
            if (this.C1 && !z11) {
                k5Var.f3196b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                k5Var.f3196b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                oq oqVar = new oq(mutate, null);
                oqVar.f29167w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                oqVar.h = dp;
                oqVar.f29164n = dp2;
                k5Var.f3196b.i(oqVar);
            } else {
                k5Var.f3196b.i(null);
            }
            if (user != null) {
                k5Var.f3196b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), k5Var.f3196b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            k5Var.f3196b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
        j5 j5Var = k5Var.f3196b;
        j5 j5Var2 = k5Var.f3196b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        j5Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            oq oqVar2 = new oq(mutate2, null);
            oqVar2.f29167w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            oqVar2.h = dp3;
            oqVar2.f29164n = dp4;
            j5Var2.i(oqVar2);
            return;
        }
        j5Var2.i(null);
    }

    public final void X0(float f7, float f10, v5 v5Var) {
        this.f3439m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != v5Var) {
            this.l1 = v5Var;
            if (v5Var != null) {
                ImageReceiver imageReceiver = v5Var.f3895a;
                if (imageReceiver.getBitmap() != null) {
                    this.f3417e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        m5 m5Var = this.O1;
        if (m5Var.f3310a != null) {
            pb pbVar = this.J0;
            if (pbVar.f3545f != null) {
                String e7 = m5Var.e();
                if (z10) {
                    k3 k3Var = new k3(2, this.B0);
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
                    w3 w3Var = new w3(this, pbVar.f3545f.getContext(), e7, e7, z11, k3Var);
                    this.Z2 = w3Var;
                    w3Var.f26799i0 = true;
                    TL_stories.StoryItem storyItem = m5Var.f3310a;
                    storyItem.dialogId = this.B1;
                    w3Var.F0 = storyItem;
                    w3Var.f26811s0 = new xa.c(this, 7);
                    ((gb) this.Q1).h(w3Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e7);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        l4 l4Var = this.f3409c1;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        org.telegram.messenger.w1.p(R.string.UnsupportedAttachment, new yc(l4Var, f6Var), f6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.T = string;
        ((gb) this.Q1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.f3459s3 != z10) {
            m5 m5Var = this.O1;
            if (m5Var.f3310a != null) {
                this.f3459s3 = z10;
                if (z10) {
                    this.f3456r3.setVisibility(0);
                }
                this.f3456r3.setStoryItem(m5Var.f3310a);
                pb pbVar = ((gb) this.Q1).d;
                pbVar.f3566p1 = z10;
                pbVar.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f3462t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f3456r3.setTransitionProgress(this.f3462t3);
                    ofFloat.addUpdateListener(new r2(this, 1));
                    ofFloat.addListener(new h3(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(pr.f29467g);
                    ofFloat.start();
                    return;
                }
                if (this.f3456r3.getReactionsWindow() != null) {
                    this.f3456r3.getReactionsWindow().e();
                }
                this.f3456r3.animate().alpha(0.0f).setDuration(150L).setListener(new i3(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            di.f4 f4Var = new di.f4(getContext(), 1);
            f4Var.l(1.0f, -56.0f);
            this.G0 = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f3409c1.addView(this.G0, w7.x5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        di.f4 f4Var2 = this.G0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        f4Var2.s(LocaleController.getString(i10));
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
        long j3 = 0;
        pb pbVar = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || pbVar.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f2922b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                n8 o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o9 != null && o9.a(this.C2, 1) && this.Q1 != null) {
                    l3 l3Var = new l3(this, 0);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.G1;
                    }
                    ((gb) this.Q1).h(new sg.k0(o9.b(), this.C2, findActivity, l3Var, null));
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
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f19870id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (pbVar != null && (t1Var = pbVar.A0) != null && t1Var.g() == longValue) {
                    f1(false);
                    n3 n3Var = this.f3406b2;
                    if (n3Var != null) {
                        n3Var.K(true);
                        this.f3406b2.P1(true);
                        r0(true);
                    }
                    e3 e3Var = this.L0;
                    if (e3Var != null) {
                        t1 t1Var2 = e3Var.P;
                        if (t1Var2 != null) {
                            j3 = t1Var2.j();
                        }
                        if (e3Var.H != j3) {
                            e3Var.f3007e.N(true);
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
        h5 h5Var = this.Q1;
        if (h5Var == null || !((gb) h5Var).d.H0) {
            if (this.K1) {
                j1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((gb) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f3466v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f3470w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.C1 || this.D1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = pbVar.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j10 = this.B1;
                if (j10 != 0) {
                    u8 u8Var = this.S1;
                    TL_stories.PeerStories y3 = u8Var.y(j10);
                    if (y3 == null) {
                        y3 = u8Var.z(j10);
                        z11 = true;
                    }
                    u8Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.f1 f1Var = this.f3457s1;
            if (f1Var != null) {
                ViewPropertyAnimator animate = f1Var.animate();
                if (this.S1.K(this.B1) && this.O1.f3313e && !SharedConfig.allowPreparingHevcPlayers()) {
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
        ke keVar;
        Canvas canvas2;
        org.telegram.ui.Components.p6 p6Var;
        org.telegram.ui.Components.p6 p6Var2;
        l1();
        if (this.D1 && (p6Var2 = this.Q0) != null) {
            p6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (p6Var = this.R0) != null) {
            p6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f3465u3;
        LinearLayout linearLayout = this.O0;
        z3 z3Var = this.D0;
        if (z10) {
            float measuredWidth = (z3Var.getMeasuredWidth() / 2.0f) + z3Var.getX() + linearLayout.getX();
            float measuredHeight = (z3Var.getMeasuredHeight() / 2.0f) + z3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f3472w3, measuredWidth - f7, pr.f29467g.getInterpolation(this.f3468v3));
            float lerp2 = AndroidUtilities.lerp(this.f3476x3, measuredHeight - f7, this.f3468v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f3468v3);
            if (this.f3450p3) {
                org.telegram.ui.Components.q5 q5Var = this.f3447o3;
                if (q5Var != null) {
                    float f10 = lerp3;
                    q5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f3447o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f3444n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f3453q3) {
            float measuredWidth2 = (z3Var.getMeasuredWidth() / 2.0f) + z3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (z3Var.getMeasuredHeight() / 2.0f) + z3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f3450p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f3438l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.f3453q3 = false;
                }
            } else {
                ah.e eVar = this.f3441m3;
                if (eVar != null) {
                    float f16 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f3441m3.b(canvas);
                    if (this.f3441m3.c()) {
                        this.f3441m3.d(this);
                        this.f3441m3 = null;
                        this.f3453q3 = false;
                    }
                } else {
                    this.f3453q3 = false;
                }
            }
        }
        n3 n3Var = this.f3406b2;
        if (n3Var != null) {
            me meVar = n3Var.f23795x1;
            ke keVar2 = n3Var.f23801y1;
            if (n3Var.getAlpha() != 0.0f && (keVar = n3Var.f23690e1) != null && keVar.getParent() != null && n3Var.f23690e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(n3Var.f23690e1.getX() + meVar.getX() + keVar2.getX() + n3Var.getX(), n3Var.f23690e1.getY() + meVar.getY() + keVar2.getY() + n3Var.getY());
                if (n3Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                n3Var.f23690e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fk0 fk0Var;
        fk0 fk0Var2;
        gh.d dVar;
        float dp;
        float f7;
        if (view == this.f3415d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f3415d3.getY(), getMeasuredWidth(), this.f3415d3.getY() + this.f3415d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        n3 n3Var = this.f3406b2;
        Paint paint = this.f3443n2;
        z3 z3Var = this.D0;
        l5 l5Var = this.f3474x1;
        if (view == n3Var) {
            float f10 = this.f3452q2;
            m5 m5Var = this.O1;
            if (f10 > 0.0f && !m5Var.f3314f) {
                l5Var.f3257l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), l5Var.f3257l);
            }
            RectF rectF = l5Var.h;
            RectF rectF2 = l5Var.f3254i;
            RectF rectF3 = l5Var.f3255j;
            rectF.set(this.f3406b2.getX(), this.f3406b2.getY() + this.f3406b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f3406b2.getX() + this.f3406b2.getMeasuredWidth(), this.f3406b2.getY() + this.f3406b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!m5Var.f3314f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (z3Var != null && z3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + z3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                f2 f2Var = this.a2;
                if (f2Var != null && f2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f3406b2.getY() + this.f3406b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f3406b2.getY() + this.f3406b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f3406b2.setTranslationX((1.0f - this.f3452q2) * dp);
            if (this.f3406b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f3452q2) * (this.f3406b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f3406b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.f3452q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, l5Var.h, this.f3452q2, rectF3);
            dh.d dVar2 = this.f3437l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f3416d4) * (1.0f - this.f3455r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f3452q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (n3Var != null && n3Var.u0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = l5Var.f3256k;
            RectF rectF5 = l5Var.f3256k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f3404a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            dh.d dVar3 = this.f3440m2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.q(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f3421f2 && this.f3406b2 != null) {
                view.setTranslationY(((this.f3406b2.getY() + this.f3406b2.getAnimatedTop()) + (-fk0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f3456r3) {
                    view.setTranslationY((this.O0.getY() + (z3Var.getY() + (-(fk0Var2.getMeasuredHeight() - this.f3456r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    l4 l4Var = this.f3409c1;
                    if (view == l4Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f10658n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(l4Var.getX(), l4Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.C2).storiesEnabled()) {
            return;
        }
        File h = this.O1.h();
        if (h != null && h.exists()) {
            w3 w3Var = this.Z2;
            if (w3Var != null) {
                w3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new q2(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f3481z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        l4 l4Var = this.f3409c1;
        Bitmap createBitmap = Bitmap.createBitmap(l4Var.getWidth(), l4Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public u8 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f3466v1.size()) + this.f3470w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f3466v1;
    }

    public final void h1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f3427h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f3430i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f3427h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f3430i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f3430i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f3481z1;
        pb pbVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f3470w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((t8) arrayList2.get(i11)).f3738a;
                    if (((int) (j3 ^ (j3 >>> 32))) == pbVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f3481z1.indexOf(Integer.valueOf(pbVar.P0));
            if (indexOf < 0 && !this.f3481z1.isEmpty()) {
                if (pbVar.P0 > ((Integer) this.f3481z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (pbVar.P0 < ((Integer) i2.g.h(1, this.f3481z1)).intValue()) {
                    indexOf = this.f3481z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = pbVar.f3544e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !pbVar.N0 && (peerStories = this.f3463u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f3466v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f20107id > this.f3463u1.max_read_id) {
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
        l8 l8Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f3466v1;
        arrayList.clear();
        pb pbVar = this.J0;
        if (pbVar.N0) {
            if (!pbVar.S0) {
                arrayList.add(pbVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.f3481z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f3470w1;
            if (arrayList2 != null && (l8Var = pbVar.O0) != null) {
                if (l8Var instanceof b8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((b8) pbVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            t8 t8Var = (t8) E.get(i11);
                            di.o8 o8Var = t8Var.f3740c;
                            if (o8Var != null && !o8Var.f7756g && TextUtils.equals(o8Var.K0, str)) {
                                arrayList3.add(t8Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f3481z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = pbVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (pbVar.O0 != null) {
                while (i10 < pbVar.O0.f3275i.size()) {
                    arrayList.add(((MessageObject) pbVar.O0.f3275i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = pbVar.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f3463u1 = pbVar.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f3463u1 = y3;
                    if (y3 == null) {
                        this.f3463u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f3463u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f3463u1.stories);
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
        o5 currentPeerView;
        w50 w50Var = this.J2;
        if (w50Var != null) {
            w50Var.f32125a0 = null;
            w50Var.d(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f3310a;
        pb pbVar = this.J0;
        pbVar.getClass();
        if (j3 != 0 && storyItem != null) {
            pb.E1.remove(j3 + (j3 >> 16) + (storyItem.f20107id << 16));
        }
        this.f3431i3 = true;
        fb fbVar = pbVar.f3561n0;
        if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            qc I = new yc(this.f3409c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new q2(this, 2));
            I.f29687r = false;
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
        m5 m5Var = this.O1;
        TL_stories.StoryItem storyItem = m5Var.f3310a;
        if (storyItem == null) {
            storyItem = m5Var.f3312c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                pb pbVar = this.J0;
                z3 z3Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.p6 p6Var = this.R0;
                    if (p6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        p6Var.q(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.p6 p6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        p6Var2.q(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.e6 e6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        e6Var.d(f10, true);
                        org.telegram.ui.Components.e6 e6Var2 = this.T0;
                        if (e6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            e6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (pbVar.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new nq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = z3Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + z3Var.getLayoutParams().width;
                    z3 z3Var2 = this.P0;
                    if (z3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = z3Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += z3Var2.getLayoutParams().width;
                        z3Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    z3Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = m5Var.f3310a;
                    h4 h4Var = this.f3432j1;
                    if (storyItem2 == null) {
                        h4Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < h4Var.getChildCount(); i14++) {
                        if (h4Var.getChildAt(i14) instanceof wa) {
                            ((wa) h4Var.getChildAt(i14)).c(storyItem2.views, z10);
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
                        nq nqVar = new nq(R.drawable.mini_views_likes, 0);
                        nqVar.setOverrideColor(-53704);
                        nqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(nqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        nq nqVar2 = new nq(R.drawable.mini_repost_story, 0);
                        nqVar2.setOverrideColor(-14161823);
                        nqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(nqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.gms.internal.vision.e2.w(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (pbVar.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                z3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void l0() {
        z8 z8Var = this.E0;
        z8Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new j3(0, z8Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        z8 z8Var2 = new z8(getContext(), this.f3474x1);
        this.E0 = z8Var2;
        z8Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.x5.e(40, 40, 3));
        this.f3453q3 = false;
    }

    public final void l1() {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10;
        n3 n3Var;
        float heightWithTopView;
        float f13;
        float f14;
        float f15;
        float dp;
        int i10;
        float f16;
        float f17;
        z3 z3Var;
        ImageView imageView;
        s4 s4Var;
        z3 z3Var2;
        boolean z11;
        float f18;
        fk0 fk0Var;
        float f19;
        int i11;
        float f20;
        float f21;
        float f22 = ((gb) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.e6 e6Var = this.O2;
        e6Var.d(f7, false);
        int i12 = this.f3461t2;
        if (i12 != 0 && this.f3464u2) {
            f10 = w7.p.a(this.H2 / i12, 0.0f, 1.0f);
        } else if (this.f3467v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.e6 e6Var2 = this.W3;
        float f23 = e6Var2.f25565c;
        org.telegram.ui.Components.e6 e6Var3 = this.X3;
        float f24 = e6Var3.f25565c;
        org.telegram.ui.Components.e6 e6Var4 = this.Y3;
        float f25 = e6Var4.f25565c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        e6Var2.d(f11, false);
        if (!this.f3431i3) {
            n3 n3Var2 = this.f3406b2;
            if (n3Var2 != null && !TextUtils.isEmpty(n3Var2.getFieldText())) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            e6Var3.d(f21, false);
        }
        n3 n3Var3 = this.f3406b2;
        if (n3Var3 != null && n3Var3.y3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        e6Var4.d(f12, false);
        final n3 n3Var4 = this.f3406b2;
        if (n3Var4 != null) {
            o5 o5Var = n3Var4.f3359r5;
            int backgroundTop = n3Var4.getBackgroundTop();
            int i13 = n3Var4.f3357o5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (n3Var4.S1 + i13) - backgroundTop;
                n3Var4.setAnimatedTop(i14);
                o5Var.V2 = true;
                ValueAnimator valueAnimator = o5Var.f3418e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    o5Var.f3418e2.cancel();
                }
                View view = n3Var4.F1;
                if (view != null && view.getVisibility() == 0) {
                    n3Var4.F1.setTranslationY(((1.0f - n3Var4.getTopViewEnterProgress()) * n3Var4.F1.getLayoutParams().height) + n3Var4.S1);
                }
                o5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                o5Var.f3418e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                n3 n3Var5 = n3Var4;
                                n3Var5.getClass();
                                n3Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                o5 o5Var2 = n3Var5.f3359r5;
                                o5Var2.V2 = true;
                                o5Var2.invalidate();
                                n3Var5.invalidate();
                                return;
                            default:
                                n3Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                o5Var.f3418e2.addListener(new ah.b(n3Var4, 7));
                o5Var.f3418e2.setDuration(250L);
                o5Var.f3418e2.setInterpolator(ki.o.V);
                o5Var.f3418e2.start();
                n3Var4.f3357o5 = 0;
            }
            if (n3Var4.f23737m3) {
                float scrollY = (n3Var4.f3358q5 - n3Var4.E0.getScrollY()) + (n3Var4.p5 - n3Var4.E0.getMeasuredHeight());
                qf qfVar = n3Var4.E0;
                qfVar.setOffsetY(qfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(n3Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                n3 n3Var5 = n3Var4;
                                n3Var5.getClass();
                                n3Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                o5 o5Var2 = n3Var5.f3359r5;
                                o5Var2.V2 = true;
                                o5Var2.invalidate();
                                n3Var5.invalidate();
                                return;
                            default:
                                n3Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = n3Var4.f3356n5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                n3Var4.f3356n5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ki.o.V);
                ofFloat2.start();
                n3Var4.f23737m3 = false;
                o5Var.l1();
            }
            n3Var4.getMeasuredHeight();
        }
        n3 n3Var5 = this.f3406b2;
        if (n3Var5 != null && n3Var5.t0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f3475x2;
        Paint paint = this.f3443n2;
        if (z12) {
            paint.setColor(i0.a.d(this.f3452q2, -14933463, org.telegram.ui.ActionBar.j6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.f3416d4) * org.telegram.messenger.w1.A(1.0f, this.f3455r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((1.0f - this.f3416d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        pb pbVar = this.J0;
        if (z13 || this.Z3 != pbVar.f3540d0 || e6Var.f25565c != this.Q2 || this.f3458s2 != this.H2 || f10 != this.f3452q2 || f22 != this.f3455r2 || f23 != e6Var2.f25565c || z10 || f25 != e6Var4.f25565c || f24 != e6Var3.f25565c) {
            this.V2 = false;
            this.f3458s2 = this.H2;
            float f26 = e6Var.f25565c;
            float f27 = this.Q2;
            l4 l4Var = this.f3409c1;
            if (f26 != f27) {
                l4Var.invalidate();
            }
            if (f22 != 0.0f) {
                l4Var.setLayerType(2, null);
            } else {
                l4Var.setLayerType(0, null);
            }
            this.Q2 = e6Var.f25565c;
            this.f3455r2 = f22;
            this.f3452q2 = f10;
            this.Z3 = pbVar.f3540d0;
            float height = this.H2 - (getHeight() - l4Var.getBottom());
            if (this.f3406b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = n3Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f3446o2 - (getHeight() - l4Var.getBottom());
            n3 n3Var6 = this.f3406b2;
            if (n3Var6 == null) {
                f14 = 0.0f;
            } else {
                float heightWithTopView2 = n3Var6.getHeightWithTopView();
                if (this.f3467v2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                f14 = heightWithTopView2 * f13;
            }
            float max2 = Math.max(0.0f, height2 + f14);
            n3 n3Var7 = this.f3406b2;
            if (n3Var7 != null) {
                if (this.f3414d2 != null) {
                    ImageView suggestButton = n3Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f3414d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f3414d2.setTranslationY(-((getHeight() - this.f3406b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                zt editField = this.f3406b2.getEditField();
                xo0 senderSelectView = this.f3406b2.getSenderSelectView();
                if (editField != null) {
                    f20 = 1.0f;
                    f15 = 6.0f;
                    float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f10);
                    editField.setScaleX(lerp);
                    editField.setScaleY(lerp);
                } else {
                    f20 = 1.0f;
                    f15 = 6.0f;
                }
                if (senderSelectView != null) {
                    float lerp2 = AndroidUtilities.lerp(0.8f, f20, f10);
                    senderSelectView.setScaleX(lerp2);
                    senderSelectView.setScaleY(lerp2);
                    senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, f10));
                }
            } else {
                f15 = 6.0f;
            }
            if (this.f3475x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f3475x2 && !this.f3467v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f15) * f10) + max3;
            e3 e3Var = this.L0;
            o0 o0Var = e3Var.f3004c;
            e3Var.K = dp2;
            if (Math.abs(e3Var.L - max4) > 0.1f) {
                e3Var.L = max4;
                f17 = 0.8f;
                f16 = 8.0f;
                o0Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - o0Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!o0Var.canScrollVertically(1)) {
                    e3Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f16 = 8.0f;
                f17 = 0.8f;
            }
            e3Var.setTranslationY(-e3Var.K);
            e3Var.invalidate();
            di.l4 l4Var2 = pbVar.D0;
            if (l4Var2 != null) {
                l4Var2.setKeyboardOffset(max);
            }
            fk0 fk0Var2 = this.f3421f2;
            m5 m5Var = this.O1;
            if (fk0Var2 != null) {
                if (this.f3452q2 > 0.0f && (m5Var == null || !m5Var.f3314f)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                fk0Var2.setVisibility(i11);
            }
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                z3Var = this.P0;
                imageView = this.N0;
                s4Var = this.K0;
                z3Var2 = this.D0;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != s4Var.W.o(getContext())) {
                    n3 n3Var8 = this.f3406b2;
                    if (n3Var8 != null && childAt == n3Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f3406b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof i40) {
                        i40 i40Var = (i40) childAt;
                        View view2 = i40Var.f26959e;
                        if (view2 != null) {
                            i40Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != l4Var && childAt != imageView && childAt != this.O0 && childAt != z3Var && childAt != this.W2 && childAt != this.f3414d2 && childAt != z3Var2 && ((fk0Var = this.f3456r3) == null || fk0Var.getReactionsWindow() == null || childAt != this.f3456r3.getReactionsWindow().f687c)) {
                        float f28 = this.f3452q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f16) * f29)) - (AndroidUtilities.dp(20.0f) * pbVar.f3540d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f3475x2) {
                            f19 = (1.0f - this.f3455r2) * hideInterfaceAlpha;
                        } else {
                            f19 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f3407b3) {
                            dp3 = pbVar.f3540d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f3415d3) {
                            dp3 -= this.f3406b2.getMeasuredHeight() - this.f3406b2.getAnimatedTop();
                            f19 = this.f3452q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f3410c2) {
                            dp3 -= this.f3406b2.getMeasuredHeight() - this.f3406b2.getAnimatedTop();
                            f19 *= this.f3452q2;
                        }
                        if (childAt == this.f3421f2) {
                            float f30 = (1.0f - e6Var3.f25565c) * (1.0f - f25) * (1.0f - e6Var2.f25565c) * this.f3452q2;
                            float f31 = f19 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f3421f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            n3 n3Var9 = this.f3406b2;
                            if (n3Var9 == null || childAt != n3Var9.N1) {
                                childAt.setAlpha(f19);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f3475x2) {
                        childAt.setAlpha((1.0f - this.f3416d4) * (1.0f - this.f3455r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f3416d4) * hideInterfaceAlpha);
                    }
                    i15++;
                }
                i15++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f22) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f3416d4) * f34);
            z3Var2.setAlpha((1.0f - this.f3416d4) * f34);
            if (z3Var != null) {
                z3Var.setAlpha((1.0f - this.f3416d4) * f34);
            }
            for (int i16 = 0; i16 < l4Var.getChildCount(); i16++) {
                View childAt2 = l4Var.getChildAt(i16);
                if (childAt2 != null && childAt2 != this.M0) {
                    k5 k5Var = this.f3445o1;
                    g5 g5Var = this.f3477y0;
                    if (childAt2 != k5Var && childAt2 != this.f3469w0 && childAt2 != this.f3473x0 && childAt2 != g5Var && childAt2 != this.W1 && childAt2 != s4Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == g5Var) {
                            f18 = this.f3419e3;
                        } else {
                            f18 = 1.0f;
                        }
                        if (childAt2 == s4Var) {
                            childAt2.setAlpha((1.0f - this.f3416d4) * f18 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f3416d4) * f18 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f3406b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!m5Var.f3314f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (z3Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + z3Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    f2 f2Var = this.a2;
                    if (f2Var != null && f2Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                n3 n3Var10 = this.f3406b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f3452q2;
                if ((this.S2 || this.E1) && !m5Var.f3314f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n3Var10.h1(f35, f36, f37, z11);
                if (this.f3406b2.getEmojiView() != null) {
                    this.f3406b2.getEmojiView().setAlpha(this.f3452q2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f3412c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f3416d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f3412c4 = ofFloat;
        ofFloat.addUpdateListener(new r2(this, 2));
        this.f3412c4.addListener(new h3(this, z10, 1));
        this.f3412c4.setDuration(420L);
        this.f3412c4.setInterpolator(pr.h);
        this.f3412c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f3436k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 0, this.B0);
            b2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            b2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 5);
            b2Var.f20242l0 = string;
            b2Var.m0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(15);
            b2Var.f20244n0 = string2;
            b2Var.f20245o0 = wVar;
            b2Var.show();
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
        long j3 = this.B1;
        k5 k5Var = this.f3445o1;
        org.telegram.ui.Components.i9 i9Var = this.f3442n1;
        if (j3 >= 0) {
            if (j3 == UserConfig.getInstance(this.C2).getClientUserId()) {
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
            i9Var.m(this.C2, user);
            k5Var.f3195a.getImageReceiver().setForUserOrChat(user, i9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j3) || BuildVars.DEBUG_PRIVATE_VERSION) {
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
            i9Var.k(this.C2, chat);
            k5Var.f3195a.getImageReceiver().setForUserOrChat(chat, i9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            u8 u8Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = u8Var.f3815m;
            yb ybVar = (yb) iVar.f(j10);
            if (ybVar == null) {
                ybVar = new yb(u8Var.f3805a, j10, u8Var);
                iVar.k(ybVar, j10);
            }
            ybVar.b(true);
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
        l4 l4Var = this.f3409c1;
        pb pbVar = this.J0;
        int i13 = 8;
        m5 m5Var = this.O1;
        if (z16) {
            B0();
            if (this.f3406b2 == null && (this.E1 || m5Var.f3314f)) {
                v0();
            }
            if (this.f3406b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                n3 n3Var = this.f3406b2;
                if (m5Var.f3314f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i13 = 0;
                }
                n3Var.setVisibility(i13);
                n3 n3Var2 = this.f3406b2;
                boolean z17 = m5Var.f3314f;
                D0(true);
                n3Var2.i1(z17);
                n3 n3Var3 = this.f3406b2;
                if (m5Var.f3314f && !D0(true) && (this.f3467v2 || this.f3406b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n3Var3.o1(z13, true);
                zt editField = this.f3406b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = m5Var.f3310a;
                pbVar.getClass();
                editField.setText(pb.u(j11, storyItem));
                this.f3406b2.b1(this.C2, this.B1);
                this.f3406b2.K1(chat2, null);
            }
            org.telegram.ui.Components.p6 p6Var = this.Q0;
            org.telegram.ui.ActionBar.f6 f6Var = this.B0;
            if (p6Var == null) {
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, false, false, false);
                this.Q0 = p6Var2;
                z3 z3Var = this.D0;
                p6Var2.setCallback(z3Var);
                this.Q0.r(f6Var.G0(org.telegram.ui.ActionBar.j6.G6));
                this.Q0.t(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.e6(z3Var);
            }
            z3 z3Var2 = this.P0;
            if (z3Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(false, false, false, false);
                this.R0 = p6Var3;
                p6Var3.setCallback(z3Var2);
                this.R0.r(f6Var.G0(org.telegram.ui.ActionBar.j6.G6));
                this.R0.t(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.e6(z3Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            l4Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (m5Var.f3314f) {
                this.W1.setVisibility(8);
                if (this.f3406b2 == null) {
                    v0();
                }
                this.f3406b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                n3 n3Var4 = this.f3406b2;
                if (n3Var4 != null) {
                    n3Var4.setVisibility(8);
                }
            }
            n3 n3Var5 = this.f3406b2;
            if (n3Var5 != null) {
                boolean z18 = m5Var.f3314f;
                D0(true);
                n3Var5.i1(z18);
                n3 n3Var6 = this.f3406b2;
                if (m5Var.f3314f && !D0(true) && (this.f3467v2 || this.f3406b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n3Var6.o1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f3481z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(pbVar.P0));
                    if (indexOf < 0 && !this.f3481z1.isEmpty()) {
                        if (pbVar.P0 > ((Integer) this.f3481z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (pbVar.P0 < ((Integer) i2.g.h(1, this.f3481z1)).intValue()) {
                            indexOf = this.f3481z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f3470w1.isEmpty();
                    ArrayList arrayList2 = this.f3466v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f20107id > this.S1.f3809f.get(this.B1)) {
                                this.J1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            l4Var.invalidate();
            invalidate();
        } else {
            if (this.f3406b2 == null) {
                v0();
            }
            if (this.F1 && this.f3424g2 == null) {
                z0();
            }
            if (this.f3424g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                LinearLayout linearLayout = this.f3424g2;
                if ((this.F1 && !m5Var.f3314f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            ma maVar = this.f3433j2;
            if (maVar != null) {
                maVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            n3 n3Var7 = this.f3406b2;
            if (n3Var7 != null) {
                if (!I0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                n3Var7.setVisibility(i11);
                n3 n3Var8 = this.f3406b2;
                boolean z19 = m5Var.f3314f;
                D0(true);
                n3Var8.i1(z19);
                n3 n3Var9 = this.f3406b2;
                if (m5Var.f3314f && !D0(true) && (this.f3467v2 || this.f3406b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n3Var9.o1(z11, true);
                zt editField2 = this.f3406b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = m5Var.f3310a;
                pbVar.getClass();
                editField2.setText(pb.u(j12, storyItem2));
                this.f3406b2.b1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f3406b2.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f3482z2, false);
                }
            }
            this.A1 = getStoriesCount();
            z3 z3Var3 = this.W1;
            if (z3Var3 != null) {
                z3Var3.setVisibility(8);
            }
            l4Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3402a1 = true;
        this.f3417e1.onAttachedToWindow();
        this.f3423g1.onAttachedToWindow();
        this.f3420f1.onAttachedToWindow();
        this.f3438l3.onAttachedToWindow();
        this.f3444n3.onAttachedToWindow();
        n3 n3Var = this.f3406b2;
        if (n3Var != null) {
            n3Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3426h1;
            if (i10 < arrayList.size()) {
                ((ah.z0) arrayList.get(i10)).b(true);
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
        this.f3402a1 = false;
        this.f3417e1.onDetachedFromWindow();
        this.f3423g1.onDetachedFromWindow();
        this.f3420f1.onDetachedFromWindow();
        this.f3438l3.onDetachedFromWindow();
        this.f3444n3.onDetachedFromWindow();
        n3 n3Var = this.f3406b2;
        if (n3Var != null) {
            n3Var.D0();
        }
        org.telegram.ui.Components.q5 q5Var = this.f3447o3;
        if (q5Var != null) {
            q5Var.o(this);
            this.f3447o3 = null;
        }
        ah.e eVar = this.f3441m3;
        if (eVar != null) {
            eVar.d(this);
            this.f3441m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3426h1;
            if (i10 < arrayList.size()) {
                ((ah.z0) arrayList.get(i10)).b(false);
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
        this.f3474x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f3452q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        s4 s4Var = this.K0;
        if (s4Var.W.y()) {
            s4Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((gb) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.f3406b2 != null && this.f3422f3 && this.f3402a1) {
            q2 q2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(q2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f3406b2.K(true);
            boolean z11 = this.F1;
            m5 m5Var = this.O1;
            if ((z11 && !m5Var.f3314f) || this.G1) {
                this.f3436k3 = false;
                this.f3406b2.setEnabled(false);
                this.f3406b2.j1(" ", z10);
            } else if (this.H1 > 0) {
                this.f3436k3 = false;
                this.f3406b2.setEnabled(true);
                this.f3406b2.j1(zh.v7.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!m5Var.f3314f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f3436k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f3406b2.setEnabled(true);
                        if (((int) this.f3406b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f3406b2.getEditField().getMeasuredWidth()) {
                            n3 n3Var = this.f3406b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            n3Var.f23688e = formatString2;
                            n3Var.f23695f = format;
                            n3Var.G1(z10);
                        } else {
                            this.f3406b2.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(q2Var, 1000L);
                        return;
                    }
                }
                this.f3436k3 = false;
                this.f3406b2.setEnabled(true);
                if (m5Var.f3314f) {
                    long starsPrice = this.f3406b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f3406b2.j1(zh.v7.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f3406b2.N4), z10);
                        nq nqVar = this.f3406b2.N4[0];
                        if (nqVar != null) {
                            nqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f3406b2.j1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                n3 n3Var2 = this.f3406b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                n3Var2.j1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f3459s3) {
            if (this.f3456r3.getReactionsWindow() != null) {
                if (this.f3479y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f3456r3.getReactionsWindow().f687c);
                    return true;
                }
                this.f3456r3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        h4 h4Var = this.f3432j1;
        if (h4Var != null) {
            di.f4 f4Var = h4Var.f3755c;
            if (f4Var != null) {
                f4Var.e(true);
                h4Var.f3755c = null;
            }
            h4Var.f3754b = null;
            h4Var.invalidate();
            h4Var.b(false);
        }
        s4 s4Var = this.K0;
        if (s4Var.W.y()) {
            s4Var.W.f(false);
            return true;
        }
        di.f4 f4Var2 = this.F0;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        di.f4 f4Var3 = this.G0;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        i40 i40Var = this.W2;
        if (i40Var != null) {
            i40Var.b(true);
        }
        f5 f5Var = this.f3460t1;
        if (f5Var != null && f5Var.f32323b) {
            f5Var.a();
            return true;
        }
        n3 n3Var = this.f3406b2;
        if (n3Var != null && n3Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f3406b2.f23677c1) {
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new m2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((gb) this.Q1).h(alertDialog$Builder.f20198a);
            return true;
        }
        fk0 fk0Var = this.f3421f2;
        if (fk0Var != null && fk0Var.getReactionsWindow() != null && !this.f3421f2.getReactionsWindow().f699q) {
            this.f3421f2.getReactionsWindow().d();
            return true;
        }
        n3 n3Var2 = this.f3406b2;
        if (n3Var2 != null && n3Var2.t0()) {
            if (this.f3479y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f3406b2.getEmojiView());
                return true;
            }
            this.f3406b2.n0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            n3 n3Var3 = this.f3406b2;
            if (n3Var3 != null) {
                long j3 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f3310a;
                Editable editText = n3Var3.getEditText();
                this.J0.getClass();
                pb.J(j3, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f3406b2);
            return true;
        } else if (s4Var.getVisibility() != 0 || s4Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            s4Var.C();
            this.f3425g3 = false;
            this.f3409c1.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f3434k1.f36813b = i10;
        fk0 fk0Var = this.f3421f2;
        if (fk0Var != null) {
            fk0Var.setCurrentAccount(i10);
            this.f3421f2.p(null, null, true);
        }
        fk0 fk0Var2 = this.f3456r3;
        if (fk0Var2 != null) {
            fk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(h5 h5Var) {
        this.Q1 = h5Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f3422f3 != z10) {
            this.f3422f3 = z10;
            if (z10) {
                this.f3417e1.setCurrentAlpha(1.0f);
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
        if (this.f3405b1 != z10) {
            this.f3405b1 = z10;
            this.f3409c1.invalidate();
            if (this.K1 && this.J0.f3531a && Build.VERSION.SDK_INT < 33) {
                androidx.activity.i iVar = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                pb pbVar = ((gb) this.Q1).d;
                pbVar.l1 = true;
                pbVar.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            y3 y3Var = this.f3417e1;
            if (z10) {
                y3Var.stopAnimation();
                y3Var.setAllowStartAnimation(false);
            } else {
                y3Var.startAnimation();
                y3Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f3409c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            t3 t3Var = new t3(this, getContext(), this.B0);
            this.I2 = t3Var;
            t3Var.Z1 = new u3(this);
            t3Var.f31291j0.f0();
            t3 t3Var2 = this.I2;
            t3Var2.W = true;
            t3Var2.r1();
            t3 t3Var3 = this.I2;
            t3Var3.X = new v3(this);
            t3Var3.m1().setText(this.f3406b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.I3);
            this.X1 = aVar;
            aVar.setOnClickListener(new s2(this, 1));
            addView(this.X1, w7.x5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        n3 n3Var = new n3(this, AndroidUtilities.findActivity(getContext()), this, new k3(1, f6Var));
        this.f3406b2 = n3Var;
        n3Var.getEditField().useAnimatedTextDrawable();
        this.f3406b2.getEditField().setScaleX(0.0f);
        this.f3406b2.setOverrideKeyboardAnimation(true);
        this.f3406b2.setClipChildren(false);
        this.f3406b2.setDelegate(new o3(this));
        setDelegate(this.f3406b2);
        n3 n3Var2 = this.f3406b2;
        n3Var2.f23798x4 = false;
        n3Var2.f23803y4 = true;
        if (this.O1.f3314f) {
            n3Var2.V0(false, false, false);
        } else {
            n3Var2.V0(true, true, false);
        }
        this.f3406b2.d();
        n3 n3Var3 = this.f3406b2;
        n3Var3.f23808z4 = true;
        addView(n3Var3, w7.x5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.f3406b2.P1(false);
        }
        this.f3406b2.F2 = this.f3482z2;
        n5 n5Var = this.M2;
        ((ArrayList) n5Var.f3369g).add(this.f3409c1);
        ((ArrayList) n5Var.f3369g).add(this);
        if (this.f3402a1) {
            this.f3406b2.E0();
        }
        r0(false);
        if (I0()) {
            this.f3406b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), f6Var, this.I3, this.F3);
        this.f3410c2 = hVar;
        hVar.setOnClickListener(new m2(this, 1));
        addView(this.f3410c2, w7.x5.e(57, 300, 85));
        this.f3410c2.setVisibility(8);
        this.f3406b2.setSideButtonsForAttach(this.f3410c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.f3433j2 != null) {
            return;
        }
        ma maVar = new ma(getContext(), this.B0);
        this.f3433j2 = maVar;
        maVar.setOnClickListener(new s2(this, 4));
        this.f3433j2.setAlpha(0.0f);
        this.f3433j2.setVisibility(8);
        addView(this.f3433j2, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            f2 f2Var = new f2(getContext(), this.I3);
            this.a2 = f2Var;
            f2Var.setOnClickListener(new s2(this, 5));
            f2 f2Var2 = this.a2;
            t1 t1Var = t1.W;
            boolean z11 = true;
            if (t1Var != null && t1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            f2Var2.b(z10, false);
            f2 f2Var3 = this.a2;
            t1 t1Var2 = t1.W;
            if (t1Var2 != null && !t1Var2.m()) {
                z11 = false;
            }
            f2Var3.a(z11, false);
            addView(this.a2, w7.x5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void y0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new k2(getContext(), this.C2);
            l2 l2Var = new l2(getContext(), this.Y1, this.I3);
            this.Z1 = l2Var;
            l2Var.setOnClickListener(new s2(this, 6));
            this.Z1.setOnLongClickListener(new p2(this, 1));
            addView(this.Z1, w7.x5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.Y1, w7.x5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void z0() {
        int i10;
        if (this.f3424g2 != null) {
            return;
        }
        if (this.f3406b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f3424g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f3427h2 = textView;
        textView.setTextColor(-8026747);
        this.f3427h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f3427h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f3430i2 = textView3;
        textView3.setTextColor(-1);
        this.f3430i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f3430i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f3430i2.setGravity(17);
        w7.z5.a(this.f3430i2);
        this.f3430i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f3430i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f3424g2.addView(imageView, w7.x5.t(22, 22, 16, 12, 1, 4, 0));
        this.f3424g2.addView(this.f3427h2, w7.x5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f3424g2.addView(this.f3430i2, w7.x5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f3406b2.addView(this.f3424g2, w7.x5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
