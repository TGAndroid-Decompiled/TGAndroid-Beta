package bi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kb0;
public final class ce implements NotificationCenter.NotificationCenterDelegate {
    public static ce F2;
    public final md A0;
    public View A1;
    public boolean A2;
    public bd B0;
    public sf0 B1;
    public boolean B2;
    public i8 C0;
    public final qf0 C1;
    public gd C2;
    public final x8 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final ne E0;
    public hf0 E1;
    public ValueAnimator E2;
    public xd F;
    public final oe F0;
    public jf0 F1;
    public float G;
    public final d0 G0;
    public File G1;
    public final RectF H;
    public final ne H0;
    public ArrayList H1;
    public float I;
    public final c0 I0;
    public ArrayList I1;
    public int J;
    public final re J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public r9 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public xc M0;
    public long M1;
    public long N;
    public z0 N0;
    public boolean N1;
    public boolean O;
    public final m8 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final pc Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final k3 R0;
    public boolean R1;
    public int S;
    public final k3 S0;
    public boolean S1;
    public int T;
    public final u4 T0;
    public float T1;
    public int U;
    public final u4 U0;
    public int U1;
    public boolean V;
    public final q91 V0;
    public boolean V1;
    public boolean W;
    public final x4 W0;
    public boolean W1;
    public boolean X;
    public final nd X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final me Z0;
    public AnimatorSet Z1;
    public final zh.b f2430a;
    public int f2431a0;
    public final qe f2432a1;
    public boolean a2;
    public final Activity f2433b;
    public int f2434b0;
    public final v7 f2435b1;
    public boolean f2436b2;
    public final int f2437c;
    public final RectF f2438c0;
    public final qd f2439c1;
    public boolean f2440c2;
    public boolean d;
    public final RectF f2441d0;
    public final oc f2442d1;
    public boolean f2443d2;
    public boolean e;
    public final Path f2444e0;
    public final y0 f2445e1;
    public Runnable f2446e2;
    public final WindowManager f2447f;
    public int f2448f0;
    public hj0 f2449f1;
    public AnimatorSet f2450f2;
    public int f2451g0;
    public final kj0 f2452g1;
    public zb f2453g2;
    public final WindowManager.LayoutParams h;
    public final kd f2454h0;
    public hj0 f2455h1;
    public boolean f2456h2;
    public final FrameLayout f2457i0;
    public ImageView f2458i1;
    public AnimatorSet f2459i2;
    public final LinearLayout f2460j0;
    public final s7 f2461j1;
    public ValueAnimator f2462j2;
    public final FrameLayout f2463k0;
    public final x4 f2464k1;
    public boolean f2465k2;
    public final ld f2466l0;
    public final x4 l1;
    public s4.b0 f2467l2;
    public final FrameLayout m0;
    public final x4 f2468m1;
    public MediaController.AlbumEntry f2469m2;
    public final be f2470n;
    public final k3 f2471n0;
    public final x4 f2472n1;
    public ValueAnimator f2473n2;
    public final j9 f2474o0;
    public final x7 f2475o1;
    public o1.k f2476o2;
    public final org.telegram.ui.ActionBar.l5 f2477p0;
    public final pe f2478p1;
    public Boolean f2479p2;
    public rb f2480q0;
    public t f2481q1;
    public dc f2482q2;
    public final td f2483r;
    public final org.telegram.ui.Components.ia f2484r0;
    public id f2485r1;
    public AnimatorSet f2486r2;
    public final m3 f2487s;
    public final d8 f2488s0;
    public jd f2489s1;
    public boolean f2490s2;
    public final nc f2491t0;
    public final me f2492t1;
    public int f2493t2;
    public boolean f2494u0;
    public final d f2495u1;
    public ArrayList f2496u2;
    public boolean v;
    public long f2497v0;
    public ad f2498v1;
    public FrameLayout f2499v2;
    public long f2500w;
    public String f2501w0;
    public og.h1 f2502w1;
    public boolean f2503w2;
    public sd f2504x;
    public TLRPC.InputPeer f2505x0;
    public View f2506x1;
    public tb f2507x2;
    public final kb0 f2508y;
    public pb f2509y0;
    public View f2510y1;
    public s f2511y2;
    public x f2512z0;
    public View f2513z1;
    public boolean f2514z2;

    public ce(Activity activity, int i10) {
        kb0 kb0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        zh.b bVar = new zh.b();
        this.f2430a = bVar;
        this.f2500w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f2438c0 = new RectF();
        this.f2441d0 = new RectF();
        this.f2444e0 = new Path();
        new Rect();
        this.f2448f0 = 0;
        this.f2451g0 = -1;
        this.f2509y0 = new pb();
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.O1 = 0;
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.U1 = -3;
        this.W1 = false;
        sc scVar = new sc(this);
        this.f2443d2 = true;
        this.f2465k2 = true;
        this.f2493t2 = -1;
        this.f2433b = activity;
        this.f2437c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            kb0Var = new kb0(launchActivity, true);
        } else {
            kb0Var = null;
        }
        this.f2508y = kb0Var;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f2447f = windowManager;
        be beVar = new be(this, activity);
        this.f2470n = beVar;
        cc ccVar = new cc(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(beVar, ccVar);
        this.f2470n.setFocusable(true);
        this.f2470n.setImportantForAccessibility(2);
        m3 m3Var = new m3(activity, windowManager, this.f2470n, layoutParams);
        this.f2487s = m3Var;
        m3Var.a(new ed(this));
        this.f2470n.addView(this.f2487s.f3077b, new ViewGroup.LayoutParams(-1, -1));
        be beVar2 = this.f2470n;
        td tdVar = new td(this, activity);
        this.f2483r = tdVar;
        beVar2.addView(tdVar);
        td tdVar2 = this.f2483r;
        kd kdVar = new kd(this, activity);
        this.f2454h0 = kdVar;
        tdVar2.addView(kdVar);
        this.f2483r.addView(this.f2487s.f3078c, new ViewGroup.LayoutParams(-1, -1));
        this.f2484r0 = new org.telegram.ui.Components.ia(this.f2454h0);
        this.f2488s0 = new Object();
        td tdVar3 = this.f2483r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f2457i0 = frameLayout;
        tdVar3.addView(frameLayout);
        td tdVar4 = this.f2483r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f2463k0 = frameLayout2;
        tdVar4.addView(frameLayout2);
        td tdVar5 = this.f2483r;
        ld ldVar = new ld(this, activity, 0);
        this.f2466l0 = ldVar;
        tdVar5.addView(ldVar);
        this.f2466l0.setVisibility(8);
        this.f2466l0.setAlpha(0.0f);
        td tdVar6 = this.f2483r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        tdVar6.addView(frameLayout3);
        org.telegram.ui.Components.pc.a(this.f2470n, new fa(2));
        md mdVar = new md(this, activity, this.f2484r0, this.f2483r, bVar);
        this.A0 = mdVar;
        be beVar3 = this.f2470n;
        Objects.requireNonNull(beVar3);
        mdVar.setCancelGestures(new a3.d(beVar3, 29));
        this.A0.setResetState(new tb(this, 13));
        this.f2454h0.addView(this.A0, w7.a6.e(-1, -1, 119));
        this.A0.setOnClickListener(new vb(this, 12));
        kd kdVar2 = this.f2454h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        kdVar2.setBackgroundColor(i11);
        kd kdVar3 = this.f2454h0;
        g gVar = xf.k0.f45156a;
        kdVar3.setOutlineProvider(new xf.j0(0, AndroidUtilities.dp(12.0f)));
        this.f2454h0.setClipToOutline(true);
        tb tbVar = new tb(this, 14);
        ?? view = new View(activity);
        view.f26401a = new TextPaint(1);
        view.f26402b = new TextPaint(1);
        wr wrVar = wr.h;
        view.f26407s = new org.telegram.ui.Components.d6((View) view, 0L, 350L, wrVar);
        view.I = new kc0(view, 7);
        view.f26409x = tbVar;
        this.C1 = view;
        nd ndVar = new nd(this, activity, this.f2484r0, this.f2488s0);
        this.X0 = ndVar;
        ndVar.setCollageView(this.A0);
        nd ndVar2 = this.X0;
        ndVar2.v = new tb(this, 15);
        ndVar2.setOnTapListener(new tb(this, 16));
        this.X0.setVisibility(8);
        nd ndVar3 = this.X0;
        ndVar3.N = new tb(this, 17);
        this.f2454h0.addView(ndVar3, w7.a6.e(-1, -1, 119));
        this.f2454h0.addView(this.C1, w7.a6.e(-1, -1, 119));
        be beVar4 = this.f2470n;
        qd qdVar = new qd(this, activity, beVar4, beVar4, this.f2483r, bVar, this.f2484r0);
        this.f2439c1 = qdVar;
        qdVar.setAccount(i10);
        this.f2439c1.setUiBlurBitmap(new cc(this, 6));
        org.telegram.ui.Components.pc.a(this.f2466l0, new rd(this, 0));
        this.f2439c1.setOnHeightUpdate(new ub(this, 13));
        this.f2439c1.setOnPeriodUpdate(new ub(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.f2439c1.setDialogId(j3);
        }
        this.f2439c1.setOnPremiumHint(new ub(this, 5));
        this.f2439c1.setOnKeyboardOpen(new ub(this, 6));
        nc ncVar = new nc(this, activity, 0);
        this.f2491t0 = ncVar;
        this.f2483r.addView(ncVar);
        me meVar = new me(activity, this.f2483r, this.f2454h0, bVar, this.f2484r0);
        this.Z0 = meVar;
        meVar.setOnTimelineClick(new tb(this, 10));
        this.Z0.setOnHeightChange(new tb(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, w7.a6.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        qe qeVar = new qe(activity);
        this.f2432a1 = qeVar;
        qeVar.setVisibility(8);
        this.f2432a1.a(false);
        this.Y0.addView(this.f2432a1, w7.a6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f2466l0.addView(this.Y0, w7.a6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f2466l0.addView(this.f2439c1, w7.a6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        me meVar2 = new me(activity, this.f2483r, this.f2454h0, bVar, this.f2484r0);
        this.f2492t1 = meVar2;
        meVar2.X0 = true;
        meVar2.setVisibility(8);
        this.f2492t1.setAlpha(0.0f);
        this.f2466l0.addView(this.f2492t1, w7.a6.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        oc ocVar = new oc(this, activity, bVar, this.f2484r0);
        this.f2442d1 = ocVar;
        ocVar.setVisibility(8);
        this.f2466l0.addView(this.f2442d1, w7.a6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f2471n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        k3 k3Var = this.f2471n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k3Var.setScaleType(scaleType);
        this.f2471n0.setImageResource(R.drawable.msg_photo_back);
        k3 k3Var2 = this.f2471n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        k3Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f2471n0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f2471n0.setOnClickListener(new vb(this, 1));
        this.f2457i0.addView(this.f2471n0, w7.a6.e(56, 56, 51));
        this.f2487s.a(this.f2471n0);
        j9 j9Var = new j9(activity, i10);
        this.f2474o0 = j9Var;
        j9Var.a(false, false);
        this.f2474o0.setOnClickListener(new n3(2, this, activity));
        this.f2457i0.addView(this.f2474o0, w7.a6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.f2477p0 = l5Var;
        l5Var.setTextSize(20);
        this.f2477p0.setGravity(19);
        this.f2477p0.setTextColor(-1);
        this.f2477p0.setTypeface(AndroidUtilities.bold());
        this.f2477p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f2477p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f2477p0.setAlpha(0.0f);
        this.f2477p0.setVisibility(8);
        this.f2477p0.setEllipsizeByGradient(true);
        this.f2477p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f2457i0.addView(this.f2477p0, w7.a6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f2460j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f2460j0.setGravity(5);
        this.f2457i0.addView(this.f2460j0, w7.a6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        ub ubVar = new ub(this, 7);
        be beVar5 = this.f2470n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f3960w = true;
        imageView2.f3961x = true;
        imageView2.h = ubVar;
        imageView2.f3953a = i10;
        imageView2.f3954b = beVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ai.u(imageView2, 4));
        imageView2.f3956f = new zp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f2445e1 = imageView2;
        x4 x4Var = new x4(activity, 1);
        x4Var.l(1.0f, -71.0f);
        x4Var.d = 2000L;
        x4Var.U = false;
        x4Var.H.o(true, false, false);
        this.f2464k1 = x4Var;
        x4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f2457i0.addView(this.f2464k1, w7.a6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f2452g1 = imageView3;
        imageView3.setScaleType(scaleType);
        kj0 kj0Var = this.f2452g1;
        r9 r9Var = this.K1;
        if (r9Var != null && r9Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        kj0Var.setImageResource(i12);
        this.f2452g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f2452g1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f2452g1.setOnClickListener(new vb(this, 2));
        this.f2452g1.setVisibility(8);
        this.f2452g1.setAlpha(0.0f);
        s7 s7Var = new s7(activity);
        this.f2461j1 = s7Var;
        s7Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f2461j1.setVisibility(8);
        this.f2461j1.setAlpha(0.0f);
        this.f2461j1.setOnClickListener(new vb(this, 3));
        this.f2460j0.addView(this.f2461j1, w7.a6.q(46, 56, 53));
        this.f2460j0.addView(this.f2452g1, w7.a6.q(46, 56, 53));
        this.f2460j0.addView(this.f2445e1, w7.a6.e(46, 56, 53));
        ne neVar = new ne(activity);
        this.E0 = neVar;
        neVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new vb(this, 4));
        this.E0.setOnLongClickListener(new l6(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f2487s.a(this.E0);
        this.f2457i0.addView(this.E0, w7.a6.e(56, 56, 53));
        oe oeVar = new oe(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new vb(this, 5));
        boolean q6 = i1.q(activity);
        oe oeVar2 = this.F0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        oeVar2.setVisibility(i13);
        oe oeVar3 = this.F0;
        if (q6) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        oeVar3.setAlpha(f7);
        this.f2487s.a(this.F0);
        this.f2457i0.addView(this.F0, w7.a6.e(56, 56, 53));
        ?? neVar2 = new ne(activity);
        this.G0 = neVar2;
        neVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.f2512z0 == null) {
            i14 = 6;
            this.f2512z0 = (x) x.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new vb(this, i14));
        this.G0.a(new y(this.f2512z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f2487s.a(this.G0);
        this.f2457i0.addView(this.G0, w7.a6.e(56, 56, 53));
        ne neVar3 = new ne(activity);
        this.H0 = neVar3;
        neVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.H0.a(new y(new x("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new vb(this, 7));
        this.f2487s.a(this.H0);
        this.f2457i0.addView(this.H0, w7.a6.e(56, 56, 53));
        c0 c0Var = new c0(activity, this.f2487s);
        this.I0 = c0Var;
        c0Var.f2392a.u0(6);
        this.I0.setSelected((x) null);
        this.I0.setOnLayoutClick(new ub(this, 8));
        this.f2457i0.addView(this.I0, w7.a6.e(-1, 56, 53));
        x4 x4Var2 = new x4(activity, 1);
        x4Var2.l(1.0f, -20.0f);
        x4Var2.d = 5000L;
        x4Var2.i();
        x4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        x4Var2.f3890l0 = new f0(3);
        this.l1 = x4Var2;
        x4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f2457i0.addView(this.l1, w7.a6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        x4 x4Var3 = new x4(activity, 2);
        x4Var3.l(0.0f, 28.0f);
        x4Var3.d = 5000L;
        x4Var3.p(true);
        this.f2468m1 = x4Var3;
        this.f2457i0.addView(x4Var3, w7.a6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        x4 x4Var4 = new x4(activity, 1);
        x4Var4.l(1.0f, -20.0f);
        x4Var4.d = 5000L;
        x4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f2472n1 = x4Var4;
        x4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f2457i0.addView(this.f2472n1, w7.a6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f3631a = paint;
        Paint paint2 = new Paint(1);
        view2.f3632b = paint2;
        view2.e = new org.telegram.ui.Components.d6((View) view2, 0L, 250L, wrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        view2.f3633c = n6Var;
        n6Var.k(0.3f, 250L, wrVar);
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(view2);
        n6Var.f25425b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        i0(false, false);
        this.f2457i0.addView(this.J0, w7.a6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f2487s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        m8 m8Var = new m8(activity);
        this.O0 = m8Var;
        m8Var.setDelegate(scVar);
        m8 m8Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var2.f3121n0 = -1.0f;
        m8Var2.f3122o0 = z10;
        m8Var2.invalidate();
        this.f2463k0.addView(this.O0, w7.a6.e(-1, 100, 87));
        this.f2487s.a(this.O0);
        m8 m8Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        m8Var3.e(f10, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f2463k0.addView(this.P0, w7.a6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new vb(this, 8));
        x4 x4Var5 = new x4(activity, 3);
        x4Var5.p(true);
        x4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        x4Var5.h = AndroidUtilities.dp(320.0f);
        x4Var5.d = 5000L;
        x4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = x4Var5;
        this.f2463k0.addView(x4Var5, w7.a6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        q91 q91Var = new q91(activity);
        this.V0 = q91Var;
        q91Var.M = false;
        q91Var.setAlpha(0.0f);
        this.f2463k0.addView(this.V0, w7.a6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new cc(this, 4));
        q91 q91Var2 = this.V0;
        this.T1 = 0.0f;
        q91Var2.b(0.0f, false);
        x8 x8Var = new x8(activity, i10, new tb(this, 12));
        this.D0 = x8Var;
        x8Var.f3922c = new ub(this, 9);
        this.f2463k0.addView(x8Var, w7.a6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        pc pcVar = new pc(this, activity);
        this.Q0 = pcVar;
        pcVar.setOnSwitchModeListener(new ub(this, 10));
        this.Q0.setOnSwitchingModeListener(new ub(this, 11));
        this.m0.addView(this.Q0, w7.a6.e(-1, 48, 55));
        this.f2487s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.a6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f2487s.a(this.R0);
        this.R0.setOnClickListener(new vb(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.a6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f2487s.a(this.S0);
        this.S0.setOnClickListener(new vb(this, 10));
        u4 u4Var = new u4(activity);
        this.T0 = u4Var;
        this.m0.addView(u4Var, w7.a6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f2487s.a(this.T0);
        u4 u4Var2 = new u4(activity);
        this.U0 = u4Var2;
        u4Var2.f3715a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        u4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.a6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f2487s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f2495u1 = dVar2;
        dVar2.setVisibility(8);
        this.f2495u1.setAlpha(0.0f);
        this.f2495u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f2495u1.setOnClickListener(new vb(this, 11));
        this.m0.addView(this.f2495u1, w7.a6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f3792b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f3791a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.a6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        u7 u7Var = new u7(frameLayout5, activity, string, true);
        frameLayout5.f3793c = u7Var;
        u7Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f3793c, w7.a6.c(-2.0f, -2));
        frameLayout5.e();
        this.f2435b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f2435b1.setOnClickListener(new ub(this, 12));
        this.m0.addView(this.f2435b1, w7.a6.e(-1, 52, 23));
        pe peVar = new pe(activity);
        this.f2478p1 = peVar;
        peVar.setAlpha(0.0f);
        this.f2478p1.setVisibility(8);
        this.f2454h0.addView(this.f2478p1, w7.a6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        x7 x7Var = new x7(activity, i10, bVar);
        this.f2475o1 = x7Var;
        this.f2454h0.addView(x7Var, w7.a6.e(-1, -1, 119));
        m0(false);
    }

    public static ce E(Activity activity, int i10) {
        ce ceVar = F2;
        if (ceVar != null && (ceVar.f2433b != activity || ceVar.f2437c != i10)) {
            ceVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new ce(activity, i10);
        }
        return F2;
    }

    public static void a(ce ceVar) {
        bd bdVar = ceVar.B0;
        boolean z10 = false;
        if (bdVar != null && bdVar.getTextureView() != null) {
            Bitmap bitmap = ceVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                ceVar.f2440c2 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f7 = 0.0f;
            for (int i10 = 0; i10 < 10; i10++) {
                int i11 = 0;
                while (i11 < 10) {
                    i11++;
                    f7 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
                }
            }
            bitmap.recycle();
            if (f7 / 100.0f < 0.22f) {
                z10 = true;
            }
            ceVar.f2440c2 = z10;
            return;
        }
        ceVar.f2440c2 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(ce ceVar) {
        Activity activity = ceVar.f2433b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 33) {
            z10 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? true : true;
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i10 >= 23) {
            if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                z10 = true;
            }
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z10;
    }

    public static void c(ce ceVar) {
        ValueAnimator valueAnimator = ceVar.f2462j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ceVar.f2462j2 = null;
        }
        ceVar.f2465k2 = false;
        td tdVar = ceVar.f2483r;
        float f7 = tdVar.f3694a;
        float f10 = tdVar.f3695b;
        tdVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ceVar.f2462j2 = ofFloat;
        ofFloat.addUpdateListener(new kc(ceVar, f7, f10, 0));
        ceVar.f2462j2.setDuration(340L);
        ceVar.f2462j2.setInterpolator(wr.h);
        ceVar.f2462j2.addListener(new vc(ceVar, 0));
        ceVar.f2462j2.start();
    }

    public static boolean d(ce ceVar) {
        Activity activity = ceVar.f2433b;
        if (Build.VERSION.SDK_INT >= 23 && activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString n(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new fd(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        ce ceVar = F2;
        if (ceVar != null) {
            ceVar.q(false);
        }
        F2 = null;
    }

    public final Drawable A() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.f2433b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        r9 r9Var = this.K1;
        if (r9Var != null) {
            return r9Var.r();
        }
        return 1;
    }

    public final String C() {
        bd bdVar = this.B0;
        if (bdVar != null && bdVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f2496u2.get(this.f2493t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final z0 D() {
        if (this.N0 == null) {
            z0 z0Var = new z0(this.f2433b);
            this.N0 = z0Var;
            this.f2463k0.addView(z0Var, w7.a6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        int i10;
        bd bdVar = this.B0;
        if (bdVar != null && bdVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f2496u2;
                if (this.f2493t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f2493t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f2458i1 == null) {
            hj0 hj0Var = new hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f2455h1 = hj0Var;
            hj0Var.h = true;
            r9 r9Var = this.K1;
            if (r9Var != null && r9Var.f3608y0) {
                hj0Var.M(35);
                this.f2455h1.P(36);
            } else {
                hj0Var.P(0);
                this.f2455h1.M(0);
            }
            this.f2455h1.f23646a0 = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.f2430a);
            this.f2455h1.Q(v02, "Sunny");
            this.f2455h1.Q(v02, "Path 6");
            this.f2455h1.Q(v02, "Path");
            this.f2455h1.Q(v02, "Path 5");
            this.f2455h1.o();
            ImageView imageView = new ImageView(this.f2433b);
            this.f2458i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f2458i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f2458i1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.f2458i1.setOnClickListener(new vb(this, 0));
            this.f2458i1.setVisibility(8);
            this.f2458i1.setImageDrawable(this.f2455h1);
            this.f2458i1.setAlpha(0.0f);
            this.f2460j0.addView(this.f2458i1, 0, w7.a6.q(46, 56, 53));
        }
        return this.f2458i1;
    }

    public final void H() {
        ad adVar = this.f2498v1;
        if (adVar == null) {
            return;
        }
        this.f2499v2 = null;
        adVar.getTopLayout().setAlpha(0.0f);
        this.f2498v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f2498v1.getBottomLayout().setAlpha(0.0f);
        this.f2498v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f2498v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f2498v1.setVisibility(8);
    }

    public final boolean I() {
        float f7;
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        if (!this.a2 && f7 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        xc xcVar;
        if (!this.W && (xcVar = this.M0) != null) {
            if (xcVar.getTranslationY() < (this.f2470n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ce.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j3) {
        if (!this.S1 && this.K1 != null) {
            zb zbVar = this.f2453g2;
            if (zbVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zbVar);
            }
            this.f2456h2 = true;
            this.S1 = true;
            this.f2453g2 = new zb(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f2453g2, j3);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f2453g2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ce.M():boolean");
    }

    public final void N(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        if (i10 == 0) {
            v(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.f2492t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f2466l0.setVisibility(i17);
            this.f2439c1.setVisibility(8);
            this.f2495u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f2435b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f2466l0.setVisibility(i14);
            this.f2452g1.setVisibility(8);
            this.f2461j1.setVisibility(8);
            this.f2445e1.setVisibility(8);
            ImageView imageView = this.f2458i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.X0.setVisibility(i15);
            this.Z0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            if (i11 == 2) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f2477p0.setVisibility(i16);
            w();
            this.f2478p1.setAlpha(0.0f);
            this.f2478p1.setVisibility(8);
            this.f2432a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            r9 r9Var = this.K1;
            if (r9Var == null || !r9Var.f3586n) {
                u();
                H();
            }
            qf0 qf0Var = this.C1;
            if (qf0Var != null) {
                qf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            r9 r9Var2 = this.K1;
            if (r9Var2 != null && r9Var2.f3576h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f2432a1.setVisibility(i13);
            this.f2466l0.setAlpha(1.0f);
            this.f2466l0.setTranslationY(0.0f);
            r9 r9Var3 = this.K1;
            this.f2439c1.setVisibility((r9Var3 == null || r9Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            z0 D = D();
            D.f3994r.d(0.0f, true);
            D.a(true);
            a3.d dVar = D.h;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
            }
            a3.d dVar2 = new a3.d(D, 15);
            D.h = dVar2;
            AndroidUtilities.runOnUIThread(dVar2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        qf0 qf0Var2 = this.C1;
        if (qf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f2451g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            qf0Var2.setAllowTouch(z11);
        }
        qd qdVar = this.f2439c1;
        if (qdVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qdVar.f3267e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f2437c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            zh.i5 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void O(int i10, int i11) {
        r9 r9Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j3;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        r9 r9Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        r9 r9Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        tb tbVar;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        r9 r9Var4;
        int i17;
        r9 r9Var5;
        r9 r9Var6;
        r9 r9Var7;
        h71 textureView;
        r9 r9Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Z(false);
            this.O0.setVisibility(0);
            m8 m8Var = this.O0;
            if (m8Var != null) {
                m8Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            r9 r9Var9 = this.K1;
            if (r9Var9 != null) {
                r9Var9.i(false);
                this.K1 = null;
            }
            md mdVar = this.A0;
            if (mdVar != null) {
                mdVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new tb(this, 18));
            z0 z0Var = this.N0;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            this.W0.e(true);
            x4 x4Var = this.l1;
            if (x4Var != null) {
                x4Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f2437c;
        if (i11 != 1 && i10 != 1) {
            j3 = 0;
        } else {
            if (i11 == 1) {
                r9Var = this.K1;
            } else {
                r9Var = null;
            }
            this.f2445e1.setEntry(r9Var);
            if (this.O1 == 1) {
                this.f2452g1.setVisibility(0);
                r9 r9Var10 = this.K1;
                if (r9Var10 != null && r9Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f0(z13, false);
                this.f2461j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((pg0) this.f2461j1.f3652c).a(this.X0.k(), false);
                this.f2477p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                r9 r9Var11 = this.K1;
                if (r9Var11 != null && !TextUtils.isEmpty(r9Var11.f3607y)) {
                    this.f2452g1.setVisibility(8);
                    this.f2461j1.setVisibility(0);
                    ((pg0) this.f2461j1.f3652c).a(true, false);
                    this.f2477p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f2477p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f2445e1.setVisibility(0);
            r9 r9Var12 = this.K1;
            if (r9Var12 != null && r9Var12.f3600u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f2458i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f2435b1.setVisibility(0);
            this.X0.setVisibility(0);
            r9 r9Var13 = this.K1;
            if ((r9Var13 != null && r9Var13.J0 != 0) || this.f2497v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f2439c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            r9 r9Var14 = this.K1;
            if ((r9Var14 != null && r9Var14.J0 != 0) || this.f2497v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f2466l0.setVisibility(0);
            this.f2466l0.clearFocus();
            r9 r9Var15 = this.K1;
            if (r9Var15 == null) {
                i13 = 86400;
            } else {
                i13 = r9Var15.I0;
            }
            this.f2439c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((r9Var2 = this.K1) == null || !r9Var2.f3574g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2439c1.setPeriodVisible(z10);
            r9 r9Var16 = this.K1;
            if (r9Var16 != null && r9Var16.f3589o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f2439c1.setHasRoundVideo(z11);
            qd qdVar = this.f2439c1;
            if (qdVar == null) {
                j3 = 0;
            } else {
                r9 r9Var17 = this.K1;
                if (r9Var17 == null || !r9Var17.f3586n) {
                    j3 = 0;
                    qdVar.v(null, null);
                } else {
                    TLRPC.Peer peer = r9Var17.f3592q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        r9 r9Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        r9Var18.f3590p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        r9 r9Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        r9Var19.f3590p = append;
                    }
                    String str3 = this.K1.f3596s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f2439c1.v(str4, append);
                }
            }
            r9 r9Var20 = this.K1;
            if (r9Var20 != null && r9Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            me meVar = this.Z0;
            boolean z22 = meVar.f3170j0;
            meVar.f3170j0 = z12;
            meVar.f3168i0.f(z12, true);
            meVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f2477p0.setVisibility(0);
            this.f2492t1.setVisibility(0);
            r9 r9Var21 = this.K1;
            if (r9Var21 != null && r9Var21.f3563b0) {
                this.f2477p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f2466l0.setVisibility(0);
            this.f2495u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f2477p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            r9 r9Var22 = this.K1;
            if (r9Var22 != null && r9Var22.J0 != j3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (r9Var22 != null && r9Var22.f3574g) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                i14 = R.string.Done;
            } else if (z16) {
                i14 = R.string.UploadBotPreview;
            } else {
                i14 = R.string.Next;
            }
            String string = LocaleController.getString(i14);
            boolean z23 = !z16;
            v7 v7Var = this.f2435b1;
            if (!TextUtils.equals(string, v7Var.d) || z23 != v7Var.e) {
                v7Var.removeView(v7Var.f3793c);
                Context context = v7Var.getContext();
                v7Var.d = string;
                v7Var.e = z23;
                u7 u7Var = new u7(v7Var, context, string, z23);
                v7Var.f3793c = u7Var;
                u7Var.setContentDescription(string);
                v7Var.addView(v7Var.f3793c, w7.a6.c(-2.0f, -2));
                v7Var.e();
            }
            this.f2492t1.setVisibility(8);
            this.f2495u1.setVisibility(8);
            if (!this.f2456h2) {
                r9 r9Var23 = this.K1;
                if (r9Var23 != null && r9Var23.f3600u) {
                    this.X0.l(r9Var23);
                } else {
                    this.X0.set(r9Var23);
                }
            }
            this.f2456h2 = false;
            fu editText = this.f2439c1.f3268f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                tbVar = null;
            } else {
                tbVar = new tb(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(tbVar);
            if (this.H1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f2442d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                oc ocVar = this.f2442d1;
                ocVar.c(false, false);
                ocVar.f3389c = arrayList;
                ocVar.d = arrayList2;
                ocVar.e = arrayList3;
                ocVar.f3394w = new t01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                ocVar.K = new t01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                ocVar.f3388b.Y2.N(false);
                this.f2442d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((r9Var8 = this.K1) == null || (!r9Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                r9 r9Var24 = this.K1;
                if (r9Var24 != null && (r9Var24.f3565c || r9Var24.f3574g || this.f2494u0)) {
                    if (r9Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    r9 r9Var25 = this.K1;
                    if (r9Var25.K && r9Var25.f3561a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new cc(this, 7));
                    }
                    this.f2439c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    qd qdVar2 = this.f2439c1;
                    qdVar2.V = true;
                    qdVar2.f3268f.setText("");
                }
            }
            r9 r9Var26 = this.K1;
            if (r9Var26 != null && ((r9Var26.f3600u && !r9Var26.K) || r9Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f2435b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (r9Var7 = this.K1) != null && !r9Var7.f3600u && !r9Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f2435b1.d(3, z19);
            if (!this.N1 && !this.f2439c1.o()) {
                zh.i5 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                j4.w o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.f48499a, B) || ((r9Var6 = this.K1) != null && (r9Var6.f3574g || r9Var6.J0 != j3))) {
                    z20 = true;
                    this.f2435b1.setShareEnabled(z20);
                    r9Var4 = this.K1;
                    if (r9Var4 == null && r9Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f2452g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f2477p0.setVisibility(0);
                    this.f2477p0.setTranslationX(0.0f);
                    r9Var5 = this.K1;
                    if (r9Var5 == null && r9Var5.J0 != j3) {
                        this.f2477p0.l("", false);
                    } else if (r9Var5 == null && r9Var5.f3574g) {
                        this.f2477p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (r9Var5 == null && r9Var5.f3600u) {
                        this.f2477p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (r9Var5 == null && r9Var5.f3586n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.f2477p0, 32.0f, i18);
                        this.f2477p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.K1.f3592q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f3592q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f3592q)));
                            g5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f2477p0.l(spannableStringBuilder, false);
                    } else {
                        this.f2477p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f2435b1.setShareEnabled(z20);
            r9Var4 = this.K1;
            if (r9Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f2452g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f2477p0.setVisibility(0);
            this.f2477p0.setTranslationX(0.0f);
            r9Var5 = this.K1;
            if (r9Var5 == null) {
            }
            if (r9Var5 == null) {
            }
            if (r9Var5 == null) {
            }
            if (r9Var5 == null) {
            }
            this.f2477p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            qd qdVar3 = this.f2439c1;
            w70 w70Var = qdVar3.V0;
            if (w70Var != null) {
                w70Var.u();
                qdVar3.V0 = null;
            }
            this.f2464k1.e(z21);
            oc ocVar2 = this.f2442d1;
            if (ocVar2.M) {
                ocVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (r9Var3 = this.K1) != null) {
            if (r9Var3.f3570e0 < j3) {
                r9Var3.f3570e0 = j3;
            }
            this.M1 = r9Var3.f3570e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f3576h0;
            } else {
                duration = this.X0.getDuration();
            }
            r9 r9Var27 = this.K1;
            if (r9Var27.f3576h0 <= 0) {
                r9Var27.f3576h0 = duration;
            }
            File file = r9Var27.Z0;
            if (file == null) {
                file = r9Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            r9 r9Var28 = this.K1;
            this.f2492t1.o(false, absolutePath, r9Var28.f3576h0, r9Var28.P);
            r9 r9Var29 = this.K1;
            float f10 = (float) duration;
            long j10 = r9Var29.Z * f10;
            long j11 = r9Var29.f3560a0 * f10;
            me meVar2 = this.f2492t1;
            meVar2.Z0 = j10;
            meVar2.f3150a1 = j11;
            he heVar = meVar2.h;
            if (heVar != null) {
                he.a(heVar, true);
            }
            ai.c0 c0Var = new ai.c0(this, 8);
            this.f2492t1.setDelegate(new yc(c0Var));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f2492t1.setVideoLeft(max);
            this.f2492t1.setVideoRight(0.04f + max);
            c0Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        qf0 qf0Var = this.C1;
        if (qf0Var != null) {
            qf0Var.setAllowTouch(false);
        }
        x4 x4Var2 = this.f2468m1;
        boolean z24 = true;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        org.telegram.ui.Components.pc.e();
        qd qdVar4 = this.f2439c1;
        if (qdVar4 != null) {
            i iVar = qdVar4.f3268f;
            iVar.d();
            iVar.k(true);
            this.f2439c1.f3267e0 = true;
        }
        nd ndVar = this.X0;
        if (ndVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            ndVar.x(8, z15);
        }
        ad adVar = this.f2498v1;
        if (adVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            adVar.setCoverPreview(z14);
        }
        x4 x4Var3 = this.f2472n1;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        md mdVar2 = this.A0;
        mdVar2.setPreview((i11 == 1 && mdVar2.j()) ? false : false);
    }

    public final void P() {
        og.f1 f1Var;
        int i10;
        if (this.f2448f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f2507x2 = new tb(this, 3);
            } else {
                Z(false);
            }
        }
        qd qdVar = this.f2439c1;
        if (qdVar != null) {
            qdVar.f3268f.s();
        }
        m8 m8Var = this.O0;
        if (m8Var != null) {
            m8Var.h();
        }
        x7 x7Var = this.f2475o1;
        if (x7Var != null) {
            zh.i5 storiesController = MessagesController.getInstance(x7Var.f3916a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f48504i.f(UserConfig.getInstance(storiesController.f48499a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            x7Var.f3917b = storiesController.f48500b.m() + i10 + 1;
            x7Var.f3918c.invalidate();
        }
        ad adVar = this.f2498v1;
        if (adVar != null && (f1Var = adVar.O0.d) != null) {
            f1Var.postRunnable(f1Var.f14361w);
        }
        nd ndVar = this.X0;
        if (ndVar != null) {
            ndVar.x(0, false);
        }
        f1 f1Var2 = MessagesController.getInstance(this.f2437c).getStoriesController().f48517w;
        if (!f1Var2.f2685c && !f1Var2.d) {
            f1Var2.d = true;
            b1 b1Var = new b1(f1Var2, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(f1Var2.f2683a);
            messagesStorage.getStorageQueue().postRunnable(new c1((Object) messagesStorage, false, (Object) b1Var, 0));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z10;
        ad adVar;
        id idVar;
        jd jdVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ad adVar2;
        if (i11 == 0) {
            this.f2471n0.setVisibility(8);
        }
        if (i10 == 0 && (adVar2 = this.f2498v1) != null) {
            adVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f2439c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f2452g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f2461j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f2445e1.setVisibility(i14);
            ImageView imageView = this.f2458i1;
            if (imageView != null) {
                if (i11 == 2) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                imageView.setVisibility(i16);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.Z0.setVisibility(i15);
            this.f2477p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (adVar = this.f2498v1) != null) {
            adVar.f3505d1.setLayerType(0, null);
        }
        qf0 qf0Var = this.C1;
        if (qf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            qf0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            id idVar2 = this.f2485r1;
            if (idVar2 != null) {
                idVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (idVar = this.f2485r1) != null) {
            idVar.setVisibility(8);
            this.f2485r1.setAppearProgress(0.0f);
            id idVar3 = this.f2485r1;
            idVar3.f3228x = null;
            l0 l0Var = idVar3.f3223f;
            l0Var.L = null;
            l0Var.d = null;
            l0Var.J = false;
            idVar3.d.setVisibility(8);
            idVar3.f3220a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            jd jdVar2 = this.f2489s1;
            if (jdVar2 != null) {
                jdVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (jdVar = this.f2489s1) != null) {
            jdVar.setVisibility(8);
            this.f2489s1.setAppearProgress(0.0f);
            jd jdVar3 = this.f2489s1;
            jdVar3.f3430b = null;
            l0 l0Var2 = jdVar3.h;
            l0Var2.L = null;
            l0Var2.d = null;
            l0Var2.J = false;
            jdVar3.e.setVisibility(8);
            jdVar3.setVisibility(8);
        }
    }

    public final void R(wd wdVar) {
        j4.w o9;
        be beVar;
        if (this.d) {
            return;
        }
        int i10 = this.f2437c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f2494u0 = false;
        this.e = false;
        this.B2 = false;
        this.f2488s0.f2555g = false;
        WindowManager windowManager = this.f2447f;
        if (windowManager != null && (beVar = this.f2470n) != null && beVar.getParent() == null) {
            be beVar2 = this.f2470n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, beVar2, layoutParams);
            windowManager.addView(this.f2470n, layoutParams);
            g0();
        }
        this.A0.setCameraThumb(A());
        if (this.f2497v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.H;
        if (wdVar != null) {
            this.F = wdVar;
            this.J = wdVar.f3942a;
            rectF.set(wdVar.f3944c);
            this.G = wdVar.f3943b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f2483r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f2454h0.setBackgroundColor(i11);
        this.f2483r.setTranslationX(0.0f);
        this.f2483r.setTranslationY(0.0f);
        this.f2483r.b(0.0f);
        this.f2483r.setScaleX(1.0f);
        this.f2483r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f2433b, 1);
        g(1.0f, true, new tb(this, 6));
        e();
        this.f2497v0 = 0L;
        this.f2501w0 = "";
    }

    public final void S(ud udVar, r9 r9Var, long j3) {
        int i10;
        be beVar;
        if (this.d) {
            return;
        }
        int i11 = this.f2437c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f2494u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f2447f;
        if (windowManager != null && (beVar = this.f2470n) != null && beVar.getParent() == null) {
            be beVar2 = this.f2470n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, beVar2, layoutParams);
            windowManager.addView(this.f2470n, layoutParams);
            g0();
        }
        this.K1 = r9Var;
        this.O1 = r9Var.K ? 1 : 0;
        this.f2488s0.f2555g = false;
        RectF rectF = this.H;
        if (udVar != null) {
            this.F = udVar;
            this.J = udVar.f3942a;
            rectF.set(udVar.f3944c);
            this.G = udVar.f3943b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f2483r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f2454h0.setBackgroundColor(i10);
        this.f2483r.setTranslationX(0.0f);
        this.f2483r.setTranslationY(0.0f);
        this.f2483r.b(0.0f);
        this.f2483r.setScaleX(1.0f);
        this.f2483r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f2433b, 1);
        r9 r9Var2 = this.K1;
        if (r9Var2 != null) {
            this.f2439c1.setText(r9Var2.C0);
        }
        L(new mc(this, 0), j3);
        if (this.K1.f3563b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.f2435b1.b(false, false);
        e();
        this.f2497v0 = 0L;
        this.f2501w0 = "";
    }

    public final void T() {
        w70 w70Var;
        nd ndVar = this.X0;
        if (ndVar != null) {
            ndVar.x(4, true);
        }
        qd qdVar = this.f2439c1;
        if (qdVar != null && (w70Var = qdVar.V0) != null) {
            w70Var.u();
            qdVar.V0 = null;
        }
        qg.a1 a1Var = new qg.a1((org.telegram.ui.ActionBar.p2) new cd(this, 1), 14, false);
        a1Var.setOnDismissListener(new ic(this, 1));
        a1Var.show();
    }

    public final void U(ud udVar, r9 r9Var) {
        int i10;
        boolean z10;
        int i11;
        j4.w o9;
        be beVar;
        if (this.d) {
            return;
        }
        int i12 = this.f2437c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f2494u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f2447f;
        if (windowManager != null && (beVar = this.f2470n) != null && beVar.getParent() == null) {
            be beVar2 = this.f2470n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, beVar2, layoutParams);
            windowManager.addView(this.f2470n, layoutParams);
            g0();
        }
        this.K1 = r9Var;
        sb.a(i12, r9Var);
        r9 r9Var2 = this.K1;
        if (r9Var2 != null && r9Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (r9Var2 != null && r9Var2.f3600u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2488s0.f2555g = z10;
        if (this.f2497v0 == 0 && (o9 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o9.a(i12, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (udVar != null) {
            this.F = udVar;
            this.J = udVar.f3942a;
            rectF.set(udVar.f3944c);
            this.G = udVar.f3943b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f2483r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f2454h0.setBackgroundColor(i11);
        this.f2483r.setTranslationX(0.0f);
        this.f2483r.setTranslationY(0.0f);
        this.f2483r.b(0.0f);
        this.f2483r.setScaleX(1.0f);
        this.f2483r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f2433b, 1);
        r9 r9Var3 = this.K1;
        if (r9Var3 != null) {
            this.f2439c1.setText(r9Var3.C0);
        }
        this.f2435b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new tb(this, 6));
        e();
        this.f2497v0 = 0L;
        this.f2501w0 = "";
    }

    public final void V() {
        og.h1 h1Var = this.f2502w1;
        if (h1Var != null) {
            h1Var.bringToFront();
        }
        View view = this.f2506x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f2510y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f2513z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        pe peVar = this.f2478p1;
        if (peVar != null) {
            peVar.bringToFront();
        }
        qf0 qf0Var = this.C1;
        if (qf0Var != null) {
            qf0Var.bringToFront();
        }
        hf0 hf0Var = this.E1;
        if (hf0Var != null) {
            hf0Var.bringToFront();
        }
        jf0 jf0Var = this.F1;
        if (jf0Var != null) {
            jf0Var.bringToFront();
        }
        x7 x7Var = this.f2475o1;
        if (x7Var != null) {
            x7Var.bringToFront();
        }
        t tVar = this.f2481q1;
        if (tVar != null) {
            tVar.bringToFront();
        }
    }

    public final void W(r9 r9Var, boolean z10) {
        File file;
        View view;
        float f7;
        r9 r9Var2;
        boolean z11;
        int i10;
        if (r9Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = r9Var.O0;
            } else {
                file = r9Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.A0.j()) {
                view = this.A0;
            } else {
                view = this.X0;
            }
            if (z10) {
                f7 = 0.33333334f;
            } else {
                f7 = 1.0f;
            }
            int width = (int) (view.getWidth() * f7);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f7), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f7, f7);
            AndroidUtilities.makingGlobalBlurBitmap = true;
            view.draw(canvas);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            canvas.restore();
            Paint paint = new Paint(2);
            h71 textureView = this.X0.getTextureView();
            if (r9Var.K && !r9Var.f3600u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f7, f7);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = r9Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            File file3 = r9Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            ad adVar = this.f2498v1;
            if (adVar != null && adVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                ad adVar2 = this.f2498v1;
                adVar2.I0 = true;
                j7 j7Var = adVar2.R0;
                j7Var.f39971a = true;
                j7Var.draw(canvas);
                ad adVar3 = this.f2498v1;
                adVar3.R0.f39971a = false;
                adVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = r9.w(this.f2437c, "jpg");
            if (z10) {
                r9Var2 = r9Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new e2(this, createBitmap, z11, w10, r9Var2, 1));
            } else {
                r9Var2 = r9Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (!z11) {
                r9Var2.N0 = w10;
            }
            r9Var2.f3564b1 = createScaledBitmap;
        }
    }

    public final void X() {
        j4.w o9;
        int size;
        char c10;
        View[] viewPages;
        c61[] c61VarArr;
        rb rbVar = this.f2480q0;
        BitmapDrawable bitmapDrawable = null;
        if (rbVar != null) {
            rbVar.dismiss();
            this.f2480q0 = null;
        }
        if (this.N1) {
            y0 y0Var = this.f2445e1;
            y0Var.getClass();
            y0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            u7 u7Var = this.f2435b1.f3793c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(u7Var, i10);
            return;
        }
        qd qdVar = this.f2439c1;
        if (qdVar != null && qdVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.o6 o6Var = qdVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            qdVar.e();
            return;
        }
        r9 r9Var = this.K1;
        int i12 = this.f2437c;
        if ((r9Var == null || (!r9Var.f3574g && r9Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        zh.b bVar = this.f2430a;
        if (qdVar != null && !this.K1.D0) {
            CharSequence text = qdVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((c11[]) spannable.getSpans(0, text.length(), c11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.wc(this.f2470n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new tb(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(qdVar, i13);
                    return;
                }
            }
        }
        r9 r9Var2 = this.K1;
        if (!r9Var2.f3574g && r9Var2.J0 == 0) {
            if (this.N != 0) {
                r9Var2.f3602v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            nd ndVar = this.X0;
            ndVar.x(3, true);
            rb rbVar2 = new rb(this.f2433b, this.K1.I0, bVar);
            rbVar2.q1(this.K1.E0);
            rbVar2.p1(this.K1.f3602v0);
            rbVar2.F = this.M;
            rbVar2.U = new ub(this, 14);
            rbVar2.e1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            rbVar2.m1(size);
            rbVar2.k1(false);
            CharSequence text2 = qdVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (c61 c61Var : (c61[]) ((Spanned) text2).getSpans(0, text2.length(), c61.class)) {
                    if (c61Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(c61Var.getURL())));
                            if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                                arrayList2.add(UserObject.getPublicUsername(user));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i14 = -1;
                for (int i15 = 0; i15 < text2.length(); i15++) {
                    char charAt = text2.charAt(i15);
                    if (charAt == '@') {
                        i14 = i15 + 1;
                    } else if (charAt == ' ') {
                        if (i14 != -1) {
                            String charSequence = text2.subSequence(i14, i15).toString();
                            TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                            if (userOrChat instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) userOrChat;
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f17342id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i14 = -1;
                    }
                }
                c10 = 1;
                if (i14 != -1) {
                    String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                    TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                    if (userOrChat2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) userOrChat2;
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f17342id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            rbVar2.S = arrayList2;
            rbVar2.W = new ub(this, 15);
            rbVar2.X = new ub(this, 16);
            rbVar2.T = new cc(this, 10);
            this.f2480q0 = rbVar2;
            r9 r9Var3 = this.K1;
            if (r9Var3.K) {
                if (ndVar != null && !r9Var3.f3573f0 && this.f2448f0 != 2) {
                    r9Var3.f3570e0 = ndVar.getCurrentPosition();
                    Utilities.Callback ubVar = new ub(this, 17);
                    View view = this.f2502w1;
                    View view2 = this.f2513z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = ndVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    ndVar.h(ubVar, viewArr);
                }
                rb rbVar3 = this.f2480q0;
                Bitmap bitmap = this.K1.f3575g0;
                tb tbVar = new tb(this, 20);
                if (bitmap != null) {
                    rbVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                rbVar3.f3616b0 = bitmapDrawable;
                rbVar3.f3618c0 = tbVar;
                p1 p1Var = rbVar3.f3615b;
                if (p1Var != null) {
                    for (View view3 : p1Var.getViewPages()) {
                        if (view3 instanceof kb) {
                            kb kbVar = (kb) view3;
                            kbVar.g(false);
                            kbVar.e(false);
                        }
                    }
                }
            }
            this.f2480q0.setOnDismissListener(new ic(this, 0));
            this.f2480q0.show();
            return;
        }
        r9Var2.f3583l = false;
        i(null);
        p0();
    }

    public final void Y(xd xdVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (xdVar != null) {
            this.F = xdVar;
            this.J = xdVar.f3942a;
            rectF.set(xdVar.f3944c);
            this.G = xdVar.f3943b;
        } else {
            this.F = null;
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f2454h0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f2503w2 || z10) {
            this.f2490s2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f2433b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f2490s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    vq vqVar = new vq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    vqVar.e = dp;
                    vqVar.f28576f = dp2;
                    this.A0.setCameraThumb(vqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f2430a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new cc(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f17528a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f2503w2 = true;
                }
            }
            if (!this.f2490s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new tb(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        bd bdVar = this.B0;
        if (bdVar != null && bdVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new a3.k0(this, this.B0.getTextureView().getBitmap(), runnable, 12));
            } catch (Throwable unused) {
            }
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setUpdateListener(new zc(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 1)).setDuration(320L).setInterpolator(wr.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (z10) {
            f7 = 1.0f;
        }
        view.setAlpha(f7);
        n0();
    }

    public final void d0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f2447f.updateViewLayout(this.f2470n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j4.w o9;
        r9 r9Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            m8 m8Var = this.O0;
            if (m8Var != null) {
                m8Var.h();
            }
            if (this.f2469m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f2469m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f2469m2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            m8 m8Var2 = this.O0;
            if (m8Var2 != null && !this.V1) {
                m8Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f2448f0;
            int i15 = this.f2437c;
            if (i14 == 1) {
                if (!this.N1 && !this.f2439c1.o()) {
                    zh.i5 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    j4.w o10 = storiesController.o();
                    if (o10 == null || !o10.a(storiesController.f48499a, B) || ((r9Var = this.K1) != null && (r9Var.f3574g || r9Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f2435b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                r9 r9Var2 = this.K1;
                if (r9Var2 == null || r9Var2.J0 == 0) {
                    h0(o9, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f2437c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.E0.clearAnimation();
        bd bdVar = this.B0;
        if ((bdVar != null && bdVar.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            c0(this.E0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    i10 = R.drawable.media_photo_flash_auto2;
                    this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                }
            } else {
                str.equals("off");
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        ne neVar = this.E0;
        if (neVar.f3258n != i10) {
            neVar.f3258n = i10;
            ValueAnimator valueAnimator = neVar.f3259r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                neVar.f3259r = null;
            }
            neVar.setDrawable(i10);
        }
        if (this.f2448f0 == 0 && !this.I0.e && this.Y1 != null && !I()) {
            z10 = true;
        }
        c0(this.E0, z10, true);
    }

    public final void f(boolean z10) {
        float height;
        boolean z11;
        int i10;
        z0 z0Var;
        this.K0 = z10;
        Boolean bool = this.f2479p2;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.f2482q2 = new dc(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f2473n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f2473n2 = null;
            }
            o1.k kVar = this.f2476o2;
            if (kVar != null) {
                kVar.c();
                this.f2476o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            xc xcVar = this.M0;
            if (xcVar != null) {
                xcVar.K = false;
            }
            if (z10 && (z0Var = this.N0) != null) {
                z0Var.a(false);
            }
            int i11 = 4;
            td tdVar = this.f2483r;
            if (tdVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                tdVar.setImportantForAccessibility(i10);
            }
            xc xcVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            xcVar2.setImportantForAccessibility(i11);
            this.f2479p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            be beVar = this.f2470n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (beVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, beVar.getHeight());
            xc xcVar3 = this.M0;
            xcVar3.K = !z10;
            if (this.f2462j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f2465k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(xcVar3, o1.h.f14117n, height);
                this.f2476o2 = kVar2;
                kVar2.f14134u.a(0.75f);
                this.f2476o2.f14134u.b(350.0f);
                this.f2476o2.a(new ec(this, height, 0));
                this.f2476o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f2473n2 = ofFloat;
                ofFloat.addUpdateListener(new fc(this, 0));
                this.f2473n2.addListener(new vc(this, 1));
                this.f2473n2.setDuration(450L);
                this.f2473n2.setInterpolator(wr.h);
                this.f2473n2.start();
            }
            if (!z10 && !this.S1) {
                this.f2467l2 = null;
            }
            if (!z10 && this.f2448f0 == 0 && !this.f2490s2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f2449f1 == null) {
            hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f2449f1 = hj0Var;
            hj0Var.F *= 1.5f;
        }
        this.f2452g1.setAnimation(this.f2449f1);
        int i10 = 20;
        if (!z11) {
            hj0 hj0Var2 = this.f2449f1;
            if (!z10) {
                i10 = 0;
            }
            hj0Var2.N(i10, false, false);
        } else if (z10) {
            hj0 hj0Var3 = this.f2449f1;
            if (hj0Var3.f23648b0 > 20) {
                hj0Var3.N(0, false, false);
            }
            this.f2449f1.P(20);
            this.f2449f1.start();
        } else {
            hj0 hj0Var4 = this.f2449f1;
            int i11 = hj0Var4.f23648b0;
            if (i11 != 0 && i11 < 43) {
                hj0Var4.P(43);
                this.f2449f1.start();
            }
        }
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        td tdVar = this.f2483r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new fc(this, 5));
            this.E.addListener(new j3(this, f7, runnable, 1));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(wr.h);
            } else if (f7 <= 0.0f && tdVar.f3694a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(wr.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(wr.h);
                }
            } else {
                this.E.setDuration(300L);
                this.E.setInterpolator(new u1.a());
            }
            this.E.start();
            return;
        }
        this.L = null;
        this.I = f7;
        k();
        tdVar.invalidate();
        this.f2470n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f2470n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
    }

    public final void h(boolean z10, boolean z11) {
        float f7;
        float dp;
        float dp2;
        float f10;
        float dp3;
        float dp4;
        c0 c0Var;
        if (z10) {
            x4 x4Var = this.l1;
            if (x4Var != null) {
                x4Var.e(true);
            }
            x4 x4Var2 = this.f2468m1;
            if (x4Var2 != null) {
                x4Var2.e(true);
            }
            x4 x4Var3 = this.f2464k1;
            if (x4Var3 != null) {
                x4Var3.e(true);
            }
            x4 x4Var4 = this.W0;
            if (x4Var4 != null) {
                x4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f2436b2 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f2436b2 = I();
        if (z10 && (c0Var = this.I0) != null && c0Var.e) {
            c0Var.a(false, z11);
        }
        m0(z11);
        pc pcVar = this.Q0;
        u4 u4Var = this.U0;
        u4 u4Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f2448f0 == 0 && !I()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u4Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f2448f0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u4Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u4Var, property, (!z10 && this.f2448f0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f2448f0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u4Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pcVar, property, (z10 || this.f2448f0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f2448f0 != 0 || I()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(pcVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(wr.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f2448f0 == 0 && !I()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u4Var2.setAlpha(f7);
        if (z10 && this.f2448f0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        u4Var2.setTranslationY(dp);
        u4Var.setAlpha((!z10 && this.f2448f0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f2448f0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        u4Var.setTranslationY(dp2);
        pcVar.setAlpha((z10 || this.f2448f0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f2448f0 != 0 || I()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        pcVar.setTranslationY(f13);
    }

    public final void h0(j4.w wVar, boolean z10) {
        if (this.f2514z2) {
            return;
        }
        qg.k0 k0Var = new qg.k0(wVar.b(), this.f2437c, this.f2433b, new cd(this, 0), null);
        k0Var.X = B();
        k0Var.setOnDismissListener(new k80(2, this, z10));
        this.X0.x(7, true);
        this.f2514z2 = true;
        k0Var.show();
    }

    public final void i(Runnable runnable) {
        r9 r9Var;
        Runnable runnable2;
        nd ndVar;
        float f7;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        sf0 sf0Var = this.B1;
        if (sf0Var != null && (r9Var = this.K1) != null) {
            r9Var.f3579j = sf0Var.d() | r9Var.f3579j;
            r9 r9Var2 = this.K1;
            sf0 sf0Var2 = this.B1;
            File file = r9Var2.Z0;
            if (file != null) {
                file.delete();
                r9Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = sf0Var2.getSavedFilterState();
            r9Var2.f3561a1 = savedFilterState;
            if (!r9Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = sf0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = r9Var2.R;
                        float f10 = 1.0f;
                        if (i10 == 1) {
                            f7 = -1.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f7, f10, r9Var2.f3582k0 / 2.0f, r9Var2.f3584l0 / 2.0f);
                        matrix.postRotate(-r9Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        r9Var2.f3587n0.preScale(r9Var2.f3582k0 / createBitmap.getWidth(), r9Var2.f3584l0 / createBitmap.getHeight());
                        r9Var2.f3582k0 = createBitmap.getWidth();
                        r9Var2.f3584l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = r9Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            r9Var2.Z0.delete();
                        }
                        String k10 = r9.k(r9Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = r9Var2.f3559a;
                        if (!z10) {
                            str = "jpg";
                        }
                        r9Var2.Z0 = r9.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(r9Var2.Z0);
                                if (z10) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new g2(r9Var2, createBitmap, z10, runnable2, 1));
                        }
                    }
                }
                runnable2 = runnable;
            } else {
                runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (runnable2 == null) {
                r9 r9Var3 = this.K1;
                if (!r9Var3.K && (ndVar = this.X0) != null) {
                    ndVar.set(r9Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f2443d2 != z10) {
            this.f2443d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(wr.h).withEndAction(new dc(this, z10, 1)).start();
                return;
            }
            this.J0.clearAnimation();
            if (z10) {
                f7 = 1.0f;
            }
            this.J0.setAlpha(f7);
            if (!z10) {
                this.J0.b(false, false);
            }
        }
    }

    public final void j() {
        if (this.K1 != null && this.D1 != null && this.f2454h0.getMeasuredWidth() > 0 && this.f2454h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f2454h0.getMeasuredWidth() / 2.0f, this.f2454h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f2454h0.getMeasuredWidth() / this.f2454h0.getMeasuredHeight(), this.f2454h0.getMeasuredHeight() / this.f2454h0.getMeasuredWidth(), this.f2454h0.getMeasuredWidth() / 2.0f, this.f2454h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f2454h0.getMeasuredWidth()) * this.K1.f3582k0, (1.0f / this.f2454h0.getMeasuredHeight()) * this.K1.f3584l0);
            matrix.postConcat(this.K1.f3587n0);
            matrix.postScale(this.f2454h0.getMeasuredWidth() / this.K1.f3578i0, this.f2454h0.getMeasuredHeight() / this.K1.f3580j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f7;
        q91 q91Var = this.V0;
        if ((q91Var.getTag() != null && z10) || (q91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f2446e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                tb tbVar = new tb(this, 25);
                this.f2446e2 = tbVar;
                AndroidUtilities.runOnUIThread(tbVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2450f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        q91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2450f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            q91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f2450f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(q91Var, property, f7));
        this.f2450f2.addListener(new ai.e(9, this, z10));
        this.f2450f2.start();
        if (z10) {
            tb tbVar2 = new tb(this, 26);
            this.f2446e2 = tbVar2;
            AndroidUtilities.runOnUIThread(tbVar2, 2000L);
        }
    }

    public final void k() {
        zh.h2 h2Var;
        if (this.J == 1) {
            RectF rectF = this.f2441d0;
            rectF.set(this.f2454h0.getLeft(), this.f2454h0.getTop(), this.f2454h0.getMeasuredWidth(), this.f2454h0.getMeasuredHeight());
            rectF.offset(this.f2483r.getX(), this.f2483r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f2438c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f2454h0.setAlpha(this.I);
            float f10 = rectF3.left;
            kd kdVar = this.f2454h0;
            kdVar.setTranslationX((f10 - kdVar.getLeft()) - this.f2483r.getX());
            float f11 = rectF3.top;
            kd kdVar2 = this.f2454h0;
            kdVar2.setTranslationY((f11 - kdVar2.getTop()) - this.f2483r.getY());
            xd xdVar = this.F;
            if (xdVar != null && (h2Var = xdVar.f3945f) != null) {
                h2Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f3945f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f2454h0.setScaleX(rectF3.width() / this.f2454h0.getMeasuredWidth());
            this.f2454h0.setScaleY(rectF3.height() / this.f2454h0.getMeasuredHeight());
            this.f2457i0.setAlpha(this.I);
            this.f2463k0.setAlpha(this.I);
            this.f2466l0.setAlpha(this.I);
            if (this.f2448f0 == 2) {
                this.f2495u1.setAlpha(this.I);
            }
        }
    }

    public final void k0() {
        rb rbVar = this.f2480q0;
        if (rbVar != null) {
            rbVar.dismiss();
            this.f2480q0 = null;
        }
        rb rbVar2 = new rb(this.f2433b, 86400, this.f2430a);
        rbVar2.o1();
        rbVar2.q1(this.f2509y0);
        TLRPC.InputPeer inputPeer = this.f2505x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f2437c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        rbVar2.p1(inputPeer);
        rbVar2.F = this.M;
        rbVar2.U = new ub(this, 18);
        rbVar2.e1(false);
        rbVar2.m1(1);
        rbVar2.k1(false);
        rbVar2.W = new ub(this, 19);
        rbVar2.T = new cc(this, 12);
        this.f2480q0 = rbVar2;
        rbVar2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ce.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ce.l0(int, boolean, boolean):void");
    }

    public final void m() {
        r9 r9Var;
        boolean z10;
        if (this.f2498v1 != null && (r9Var = this.K1) != null && r9Var.f3600u) {
            File file = r9Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = r9.w(this.f2437c, "webp");
            ad adVar = this.f2498v1;
            r9 r9Var2 = this.K1;
            ArrayList arrayList = r9Var2.T0;
            if (this.O1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = adVar.t0(arrayList, false, false, true, z10, r9Var2);
            try {
                try {
                    t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (t02.isRecycled()) {
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    try {
                        this.K1.W0.delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    this.K1.W0 = null;
                    if (t02 == null || t02.isRecycled()) {
                        return;
                    }
                }
                t02.recycle();
            } catch (Throwable th2) {
                if (t02 != null && !t02.isRecycled()) {
                    t02.recycle();
                }
                throw th2;
            }
        }
    }

    public final void m0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f7;
        boolean z16;
        bd bdVar;
        boolean z17 = false;
        if (this.f2448f0 == 0 && this.O1 == 1 && !this.I0.e && !I()) {
            z11 = true;
        } else {
            z11 = false;
        }
        i0(z11, z10);
        this.G0.setSelected(this.A0.j());
        c0 c0Var = this.I0;
        if (c0Var != null && c0Var.e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0(this.f2471n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f2448f0 == 0 && this.Y1 != null && !this.I0.e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f2448f0 == 0 && (bdVar = this.B0) != null && bdVar.f2839a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f2448f0 == 0 && !this.I0.e) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0(this.G0, z15, z10);
        c0(this.H0, this.I0.e, z10);
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        this.O0.e(f7, z10);
        boolean z18 = this.I0.e;
        x4 x4Var = this.f2472n1;
        if (z18) {
            x4Var.u();
        } else {
            x4Var.e(true);
        }
        h(this.a2, z10);
        if (this.O1 == -1 && this.f2448f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f2448f0 == 0) {
            z17 = true;
        }
        AndroidUtilities.updateViewShow(this.R0, z17);
    }

    public final void n0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = this.E0.getAlpha();
        this.f2471n0.setTranslationX(0.0f);
        float alpha5 = this.f2471n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        z zVar = this.I0.f2392a;
        zVar.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        zVar.invalidate();
    }

    public final void o() {
        boolean z10;
        if (this.K == 0.0f && this.I >= 1.0f && !this.B2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.A2) {
            return;
        }
        kb0 kb0Var = this.f2508y;
        if (kb0Var != null) {
            kb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        int i10;
        hj0 hj0Var = this.f2455h1;
        if (hj0Var != null) {
            int[] iArr = hj0Var.e;
            int i11 = 0;
            if (z10) {
                r9 r9Var = this.K1;
                if (r9Var != null && r9Var.f3608y0) {
                    i11 = iArr[0];
                }
                hj0Var.P(i11);
                hj0 hj0Var2 = this.f2455h1;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                    return;
                }
                return;
            }
            r9 r9Var2 = this.K1;
            if (r9Var2 != null && r9Var2.f3608y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            hj0Var.N(i10, false, true);
            this.f2455h1.P(i10);
            ImageView imageView = this.f2458i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f2493t2 < 0) {
            this.f2493t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f2496u2 = arrayList;
            arrayList.add("off");
            this.f2496u2.add("auto");
            this.f2496u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            m3 m3Var = this.f2487s;
            m3Var.f3087o = f7;
            m3Var.f3086n = m3.f(f7);
            m3Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            m3 m3Var2 = this.f2487s;
            m3Var2.f3088p = f10;
            m3Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        tb tbVar = new tb(this, 2);
        ad adVar = this.f2498v1;
        r9 r9Var = this.K1;
        if (adVar != null && r9Var != null) {
            r9Var.f();
            boolean u02 = adVar.u0();
            boolean z10 = adVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new wb(this, adVar, r9Var.f3578i0, r9Var.f3580j0, r9Var, z10, u02, tbVar, 1));
            return;
        }
        tbVar.run();
    }

    public final void q(boolean z10) {
        nd ndVar;
        if (this.d) {
            rb rbVar = this.f2480q0;
            if (rbVar != null) {
                rbVar.dismiss();
                this.f2480q0 = null;
            }
            r9 r9Var = this.K1;
            long j3 = 0;
            if (r9Var != null && !r9Var.h) {
                if ((this.v && r9Var.f3574g) || r9Var.f3562b != 0) {
                    r9Var.f3579j = false;
                }
                r9Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (ndVar = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                t71 t71Var = ndVar.f2663y;
                if (t71Var != null) {
                    t71Var.B();
                    ndVar.f2663y.H();
                    ndVar.f2663y = null;
                }
                t71 t71Var2 = ndVar.f2661x;
                if (t71Var2 != null) {
                    j3 = t71Var2.n();
                    ndVar.f2661x.B();
                    ndVar.f2661x.H();
                    ndVar.f2661x = null;
                }
                t71 t71Var3 = ndVar.e;
                if (t71Var3 != null) {
                    j3 = t71Var3.n();
                    ndVar.e.B();
                    ndVar.e.H();
                    ndVar.e = null;
                }
                callback4.run(Long.valueOf(j3), new dc(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f2500w));
                return;
            }
            nd ndVar2 = this.X0;
            if (ndVar2 != null && !z10) {
                ndVar2.set(null);
            }
            g(0.0f, z10, new tb(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f2470n.setBackgroundColor(0);
                this.f2435b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f2437c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        bd bdVar;
        if ((this.P1 || this.Q1) && (bdVar = this.B0) != null && bdVar.isFrontface()) {
            int i10 = this.f2493t2;
            if (i10 == 2 || (i10 == 1 && this.f2440c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f2433b;
        if (this.B0 == null && activity != null) {
            this.B0 = new bd(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            m8 m8Var = this.O0;
            float f7 = 0.0f;
            if (m8Var != null) {
                m8Var.f3114g0 = 0.0f;
                m8Var.f3115h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(A());
            this.B0.initTexture();
            this.B0.setDelegate(new cc(this, 0));
            oe oeVar = this.F0;
            if (this.B0.f2839a && this.f2448f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(oeVar, z10, true);
            d0 d0Var = this.G0;
            if (!this.B0.f2839a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            d0Var.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!i1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", i1.p(ApplicationLoader.applicationContext, false))) && this.B0.f2839a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new i8(activity, new ub(this, 3));
            }
            this.C0.a(this.B0);
            x8 x8Var = this.D0;
            if (x8Var != null) {
                md mdVar = this.A0;
                Object blurRenderNode = mdVar.getBlurRenderNode();
                x8Var.F = mdVar;
                x8Var.G = blurRenderNode;
                x8Var.invalidate();
            }
        }
    }

    public final void s() {
        r9 r9Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 == null && (r9Var = this.K1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!r9Var.K) {
                if (r9Var.Z0 == null) {
                    q6 = this.X0.getPhotoBitmap();
                } else {
                    cc ccVar = new cc(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q6 = r9.q(ccVar, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                h71 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                r9 r9Var2 = this.K1;
                if (r9Var2 != null) {
                    savedFilterState = r9Var2.f3561a1;
                }
                sf0 sf0Var = new sf0(this.f2433b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f2484r0, this.f2430a);
                this.B1 = sf0Var;
                this.f2483r.addView(sf0Var);
                qf0 qf0Var = this.C1;
                if (qf0Var != null) {
                    qf0Var.setFilterView(this.B1);
                }
                TextureView myTextureView = this.B1.getMyTextureView();
                this.D1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.X0.o(this.D1, this.B1);
                TextureView textureView2 = this.D1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.D1.animate().alpha(1.0f).setDuration(220L).start();
                }
                j();
                hf0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f2454h0.addView(blurControl);
                }
                jf0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f2454h0.addView(curveControl);
                }
                V();
                this.B1.getDoneTextView().setOnClickListener(new vb(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new vb(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f27023i0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            md mdVar = this.A0;
            if (mdVar != null && mdVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f2433b == null) {
            return;
        }
        if (this.M0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f2469m2;
        boolean z13 = !z10;
        md mdVar2 = this.A0;
        if (mdVar2 != null && mdVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        xc xcVar = new xc(this, this.f2437c, this.f2433b, this.f2430a, albumEntry, z10, z13, z11);
        this.M0 = xcVar;
        xcVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, x.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new mc(this, 1));
        this.M0.setOnSelectListener(new lc(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new xh.x0(this, 2));
        s4.b0 b0Var = this.f2467l2;
        if (b0Var != null) {
            x3 x3Var = this.M0.e;
            x3Var.B = b0Var;
            x3Var.l0();
        }
        this.f2470n.addView(this.M0, w7.a6.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ce.u():void");
    }

    public final void v(boolean z10) {
        i8 i8Var = this.C0;
        if (i8Var != null) {
            i8Var.f2860f = null;
            Utilities.globalQueue.cancelRunnable(i8Var.h);
            this.C0 = null;
            md mdVar = this.A0;
            if (mdVar != null) {
                mdVar.f2908c.b(null);
            }
        }
        x8 x8Var = this.D0;
        if (x8Var != null) {
            x8Var.F = null;
            x8Var.G = null;
            x8Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                b0(new tb(this, 8));
                return;
            }
            b0(new tb(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            md mdVar2 = this.A0;
            if (mdVar2 != null) {
                mdVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        xc xcVar = this.M0;
        if (xcVar == null) {
            return;
        }
        this.f2470n.removeView(xcVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f2473n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2473n2 = null;
        }
        o1.k kVar = this.f2476o2;
        if (kVar != null) {
            kVar.c();
            this.f2476o2 = null;
        }
        this.f2479p2 = null;
    }

    public final void y() {
        sf0 sf0Var = this.B1;
        if (sf0Var == null) {
            return;
        }
        sf0Var.e();
        this.C1.setFilterView(null);
        this.f2483r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f2454h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        hf0 hf0Var = this.E1;
        if (hf0Var != null) {
            this.f2454h0.removeView(hf0Var);
            this.E1 = null;
        }
        jf0 jf0Var = this.F1;
        if (jf0Var != null) {
            this.f2454h0.removeView(jf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        ad adVar = this.f2498v1;
        if (adVar != null) {
            adVar.R0.removeAllViews();
            ad adVar2 = this.f2498v1;
            adVar2.O0.h();
            adVar2.R0.setVisibility(8);
            adVar2.Q0.setVisibility(8);
            adVar2.E0.postRunnable(new f0(1));
            y6 y6Var = adVar2.f3520k2;
            if (y6Var != null) {
                y6Var.dismiss();
            }
            og.a0 a0Var = adVar2.T1;
            if (a0Var != null) {
                a0Var.dismiss();
            }
            this.f2483r.removeView(this.f2498v1);
            this.f2498v1 = null;
            og.h1 h1Var = this.f2502w1;
            if (h1Var != null) {
                this.f2454h0.removeView(h1Var);
                this.f2502w1 = null;
            }
            View view = this.f2510y1;
            if (view != null) {
                this.f2454h0.removeView(view);
                this.f2510y1 = null;
            }
            View view2 = this.f2506x1;
            if (view2 != null) {
                this.f2454h0.removeView(view2);
                this.f2506x1 = null;
            }
            View view3 = this.f2513z1;
            if (view3 != null) {
                this.f2454h0.removeView(view3);
                this.f2513z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f2454h0.removeView(view4);
                this.A1 = null;
            }
        }
    }
}
