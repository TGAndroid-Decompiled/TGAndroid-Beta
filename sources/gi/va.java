package gi;

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
import b8.mf;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.pe;
import org.telegram.messenger.qr;
import org.telegram.messenger.r10;
import org.telegram.messenger.u10;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
public final class va implements cs {
    public static va G2;
    public t A0;
    public View A1;
    public boolean A2;
    public final ia B0;
    public View B1;
    public boolean B2;
    public y9 C0;
    public nd0 C1;
    public boolean C2;
    public c6 D0;
    public final md0 D1;
    public da D2;
    public final cg.u0 E;
    public final r6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final gb F0;
    public ed0 F1;
    public ValueAnimator F2;
    public qa G;
    public final hb G0;
    public gd0 G1;
    public float H;
    public final z H0;
    public File H1;
    public final RectF I;
    public final gb I0;
    public ArrayList I1;
    public float J;
    public final y J0;
    public ArrayList J1;
    public int K;
    public final kb K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public f7 L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public g3 N0;
    public long N1;
    public long O;
    public u0 O0;
    public boolean O1;
    public boolean P;
    public final h6 P0;
    public int P1;
    public final g2.g Q;
    public final d Q0;
    public boolean Q1;
    public Runnable R;
    public final p9 R0;
    public boolean R1;
    public r10 S;
    public final l2 S0;
    public boolean S1;
    public int T;
    public final l2 T0;
    public boolean T1;
    public int U;
    public final i3 U0;
    public float U1;
    public int V;
    public final i3 V0;
    public int V1;
    public boolean W;
    public final j71 W0;
    public boolean W1;
    public boolean X;
    public final l3 X0;
    public boolean X1;
    public boolean Y;
    public final ja Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final ei.b f13698a;
    public int f13699a0;
    public final fb f13700a1;
    public AnimatorSet f13701a2;
    public final Activity f13702b;
    public int f13703b0;
    public final jb f13704b1;
    public boolean f13705b2;
    public final int f13706c;
    public int f13707c0;
    public final q5 f13708c1;
    public boolean c2;
    public boolean d;
    public final RectF f13709d0;
    public final la f13710d1;
    public boolean f13711d2;
    public boolean f13712e;
    public final RectF f13713e0;
    public final o9 f13714e1;
    public boolean f13715e2;
    public final WindowManager f13716f;
    public final Path f13717f0;
    public final t0 f13718f1;
    public Runnable f13719f2;
    public int f13720g0;
    public ch0 f13721g1;
    public AnimatorSet f13722g2;
    public final WindowManager.LayoutParams h;
    public int f13723h0;
    public final fh0 f13724h1;
    public b9 f13725h2;
    public final ha f13726i0;
    public ch0 f13727i1;
    public boolean f13728i2;
    public final FrameLayout f13729j0;
    public ImageView f13730j1;
    public AnimatorSet f13731j2;
    public final LinearLayout f13732k0;
    public final n5 k1;
    public ValueAnimator f13733k2;
    public final FrameLayout f13734l0;
    public final l3 f13735l1;
    public boolean f13736l2;
    public final ai.o2 m0;
    public final l3 m1;
    public u4.a0 f13737m2;
    public final ua f13738n;
    public final FrameLayout f13739n0;
    public final l3 f13740n1;
    public pe f13741n2;
    public final l2 f13742o0;
    public final l3 f13743o1;
    public ValueAnimator f13744o2;
    public final y6 f13745p0;
    public final r5 f13746p1;
    public q1.g f13747p2;
    public final org.telegram.ui.ActionBar.k5 f13748q0;
    public final ib f13749q1;
    public Boolean f13750q2;
    public final na f13751r;
    public t8 f13752r0;
    public p f13753r1;
    public f9 f13754r2;
    public final n2 f13755s;
    public final org.telegram.ui.Components.x9 f13756s0;
    public fa f13757s1;
    public AnimatorSet f13758s2;
    public final x5 f13759t0;
    public ga f13760t1;
    public boolean f13761t2;
    public final ai.x2 f13762u0;
    public final fb f13763u1;
    public int f13764u2;
    public boolean f13765v0;
    public final d f13766v1;
    public ArrayList f13767v2;
    public boolean f13768w;
    public long f13769w0;
    public x9 f13770w1;
    public FrameLayout f13771w2;
    public long f13772x;
    public String f13773x0;
    public tg.u0 f13774x1;
    public boolean f13775x2;
    public ma f13776y;
    public TLRPC.InputPeer f13777y0;
    public View f13778y1;
    public v8 f13779y2;
    public r8 f13780z0;
    public View f13781z1;
    public cg.l0 f13782z2;

    public va(Activity activity, int i3) {
        cg.u0 u0Var;
        int i10;
        int i11;
        int i12;
        float f10;
        boolean z10;
        float f11;
        ei.b bVar = new ei.b();
        this.f13698a = bVar;
        this.f13772x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new g2.g((int[]) null);
        this.f13709d0 = new RectF();
        this.f13713e0 = new RectF();
        this.f13717f0 = new Path();
        new Rect();
        this.f13720g0 = 0;
        this.f13723h0 = -1;
        this.f13780z0 = new r8();
        this.I1 = null;
        this.J1 = null;
        this.K1 = null;
        this.P1 = 0;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.V1 = -3;
        this.X1 = false;
        s9 s9Var = new s9(this);
        this.f13715e2 = true;
        this.f13736l2 = true;
        this.f13764u2 = -1;
        this.f13702b = activity;
        this.f13706c = i3;
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            u0Var = new cg.u0(launchActivity, true);
        } else {
            u0Var = null;
        }
        this.E = u0Var;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f13716f = windowManager;
        ua uaVar = new ua(this, activity);
        this.f13738n = uaVar;
        e9 e9Var = new e9(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(uaVar, e9Var);
        this.f13738n.setFocusable(true);
        this.f13738n.setImportantForAccessibility(2);
        n2 n2Var = new n2(activity, windowManager, this.f13738n, layoutParams);
        this.f13755s = n2Var;
        n2Var.a(new ba(this));
        this.f13738n.addView(this.f13755s.f13281b, new ViewGroup.LayoutParams(-1, -1));
        ua uaVar2 = this.f13738n;
        na naVar = new na(this, activity);
        this.f13751r = naVar;
        uaVar2.addView(naVar);
        na naVar2 = this.f13751r;
        ha haVar = new ha(this, activity);
        this.f13726i0 = haVar;
        naVar2.addView(haVar);
        this.f13751r.addView(this.f13755s.f13282c, new ViewGroup.LayoutParams(-1, -1));
        this.f13756s0 = new org.telegram.ui.Components.x9(this.f13726i0);
        this.f13759t0 = new Object();
        na naVar3 = this.f13751r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f13729j0 = frameLayout;
        naVar3.addView(frameLayout);
        na naVar4 = this.f13751r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f13734l0 = frameLayout2;
        naVar4.addView(frameLayout2);
        na naVar5 = this.f13751r;
        ai.o2 o2Var = new ai.o2(5, activity, this);
        this.m0 = o2Var;
        naVar5.addView(o2Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        na naVar6 = this.f13751r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f13739n0 = frameLayout3;
        naVar6.addView(frameLayout3);
        ac.a(this.f13738n, new ai.y(3));
        ia iaVar = new ia(this, activity, this.f13756s0, this.f13751r, bVar);
        this.B0 = iaVar;
        ua uaVar3 = this.f13738n;
        Objects.requireNonNull(uaVar3);
        iaVar.setCancelGestures(new f6(uaVar3, 4));
        this.B0.setResetState(new v8(this, 13));
        this.f13726i0.addView(this.B0, mf.e(-1, -1, 119));
        this.B0.setOnClickListener(new x8(this, 12));
        ha haVar2 = this.f13726i0;
        int i13 = this.K;
        if (i13 != 1 && i13 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        haVar2.setBackgroundColor(i10);
        ha haVar3 = this.f13726i0;
        cg.p0 p0Var = cg.t0.f4745a;
        haVar3.setOutlineProvider(new cg.r0(0, org.telegram.messenger.g0.L(12.0f)));
        this.f13726i0.setClipToOutline(true);
        v8 v8Var = new v8(this, 14);
        ?? view = new View(activity);
        view.f36129a = new TextPaint(1);
        view.f36130b = new TextPaint(1);
        xq xqVar = xq.h;
        view.f36136s = new org.telegram.ui.Components.u5((View) view, 0L, 350L, xqVar);
        view.J = new jb0(view, 4);
        view.f36139y = v8Var;
        this.D1 = view;
        ja jaVar = new ja(this, activity, this.f13756s0, this.f13759t0);
        this.Y0 = jaVar;
        jaVar.setCollageView(this.B0);
        ja jaVar2 = this.Y0;
        jaVar2.f13965w = new v8(this, 15);
        jaVar2.setOnTapListener(new v8(this, 16));
        this.Y0.setVisibility(8);
        ja jaVar3 = this.Y0;
        jaVar3.O = new v8(this, 17);
        this.f13726i0.addView(jaVar3, mf.e(-1, -1, 119));
        this.f13726i0.addView(this.D1, mf.e(-1, -1, 119));
        ua uaVar4 = this.f13738n;
        la laVar = new la(this, activity, uaVar4, uaVar4, this.f13751r, bVar, this.f13756s0);
        this.f13710d1 = laVar;
        laVar.setAccount(i3);
        this.f13710d1.setUiBlurBitmap(new i8(1));
        ac.a(this.m0, new ai.h1(this, 5));
        this.f13710d1.setOnHeightUpdate(new w8(this, 13));
        this.f13710d1.setOnPeriodUpdate(new w8(this, 4));
        long j10 = this.O;
        if (j10 != 0) {
            this.f13710d1.setDialogId(j10);
        }
        this.f13710d1.setOnPremiumHint(new w8(this, 5));
        this.f13710d1.setOnKeyboardOpen(new w8(this, 6));
        ai.x2 x2Var = new ai.x2(3, activity, this);
        this.f13762u0 = x2Var;
        this.f13751r.addView(x2Var);
        fb fbVar = new fb(activity, this.f13751r, this.f13726i0, bVar, this.f13756s0);
        this.f13700a1 = fbVar;
        fbVar.setOnTimelineClick(new v8(this, 10));
        this.f13700a1.setOnHeightChange(new v8(this, 11));
        this.Y0.setVideoTimelineView(this.f13700a1);
        this.f13700a1.setVisibility(8);
        this.f13700a1.setAlpha(0.0f);
        this.f13700a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.f13700a1, mf.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        jb jbVar = new jb(activity);
        this.f13704b1 = jbVar;
        jbVar.setVisibility(8);
        this.f13704b1.a(false);
        this.Z0.addView(this.f13704b1, mf.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, mf.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.f13710d1, mf.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.f13700a1);
        this.B0.setPreviewView(this.Y0);
        fb fbVar2 = new fb(activity, this.f13751r, this.f13726i0, bVar, this.f13756s0);
        this.f13763u1 = fbVar2;
        fbVar2.Y0 = true;
        fbVar2.setVisibility(8);
        this.f13763u1.setAlpha(0.0f);
        this.m0.addView(this.f13763u1, mf.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        o9 o9Var = new o9(this, activity, bVar, this.f13756s0);
        this.f13714e1 = o9Var;
        o9Var.setVisibility(8);
        this.m0.addView(this.f13714e1, mf.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f13742o0 = imageView;
        imageView.setContentDescription(bd.M0(2131754878, null));
        l2 l2Var = this.f13742o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        this.f13742o0.setImageResource(2131232277);
        l2 l2Var2 = this.f13742o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        l2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f13742o0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.f13742o0.setOnClickListener(new x8(this, 1));
        this.f13729j0.addView(this.f13742o0, mf.e(56, 56, 51));
        this.f13755s.a(this.f13742o0);
        y6 y6Var = new y6(activity, i3);
        this.f13745p0 = y6Var;
        y6Var.a(false, false);
        this.f13745p0.setOnClickListener(new ai.d(21, this, activity));
        this.f13729j0.addView(this.f13745p0, mf.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f13748q0 = k5Var;
        k5Var.setTextSize(20);
        this.f13748q0.setGravity(19);
        this.f13748q0.setTextColor(-1);
        this.f13748q0.setTypeface(org.telegram.messenger.g0.o());
        this.f13748q0.l(bd.M0(2131746361, null), false);
        this.f13748q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.f13748q0.setAlpha(0.0f);
        this.f13748q0.setVisibility(8);
        this.f13748q0.setEllipsizeByGradient(true);
        this.f13748q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.f13729j0.addView(this.f13748q0, mf.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f13732k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f13732k0.setGravity(5);
        this.f13729j0.addView(this.f13732k0, mf.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        w8 w8Var = new w8(this, 7);
        ua uaVar5 = this.f13738n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f13599x = true;
        imageView2.f13600y = true;
        imageView2.h = w8Var;
        imageView2.f13590a = i3;
        imageView2.f13591b = uaVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ai.b(imageView2, 25));
        imageView2.f13594f = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        imageView2.d();
        this.f13718f1 = imageView2;
        l3 l3Var = new l3(activity, 1);
        l3Var.o(1.0f, -71.0f);
        l3Var.d = 2000L;
        l3Var.V = false;
        l3Var.I.r(true, false);
        this.f13735l1 = l3Var;
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f13729j0.addView(this.f13735l1, mf.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f13724h1 = imageView3;
        imageView3.setScaleType(scaleType);
        fh0 fh0Var = this.f13724h1;
        f7 f7Var = this.L1;
        if (f7Var != null && f7Var.Y) {
            i11 = 2131231759;
        } else {
            i11 = 2131231750;
        }
        fh0Var.setImageResource(i11);
        this.f13724h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f13724h1.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.f13724h1.setOnClickListener(new x8(this, 2));
        this.f13724h1.setVisibility(8);
        this.f13724h1.setAlpha(0.0f);
        n5 n5Var = new n5(activity);
        this.k1 = n5Var;
        n5Var.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new x8(this, 3));
        this.f13732k0.addView(this.k1, mf.r(46, 56, 53));
        this.f13732k0.addView(this.f13724h1, mf.r(46, 56, 53));
        this.f13732k0.addView(this.f13718f1, mf.e(46, 56, 53));
        gb gbVar = new gb(activity);
        this.F0 = gbVar;
        gbVar.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new x8(this, 4));
        this.F0.setOnLongClickListener(new p4(this, 1));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.f13755s.a(this.F0);
        this.f13729j0.addView(this.F0, mf.e(56, 56, 53));
        hb hbVar = new hb(activity);
        this.G0 = hbVar;
        hbVar.setContentDescription(bd.M0(2131754886, null));
        this.G0.setOnClickListener(new x8(this, 5));
        boolean q10 = b1.q(activity);
        hb hbVar2 = this.G0;
        if (q10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        hbVar2.setVisibility(i12);
        hb hbVar3 = this.G0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        hbVar3.setAlpha(f10);
        this.f13755s.a(this.G0);
        this.f13729j0.addView(this.G0, mf.e(56, 56, 53));
        ?? gbVar2 = new gb(activity);
        this.H0 = gbVar2;
        gbVar2.setContentDescription(bd.M0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        if (this.A0 == null) {
            this.A0 = (t) t.a().get(6);
        }
        this.H0.setOnClickListener(new x8(this, 6));
        this.H0.a(new u(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.f13755s.a(this.H0);
        this.f13729j0.addView(this.H0, mf.e(56, 56, 53));
        gb gbVar3 = new gb(activity);
        this.I0 = gbVar3;
        gbVar3.setContentDescription(bd.M0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.I0.a(new u(new t("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new x8(this, 7));
        this.f13755s.a(this.I0);
        this.f13729j0.addView(this.I0, mf.e(56, 56, 53));
        y yVar = new y(activity, this.f13755s);
        this.J0 = yVar;
        yVar.f13875a.v0(6);
        this.J0.setSelected((t) null);
        this.J0.setOnLayoutClick(new w8(this, 8));
        this.f13729j0.addView(this.J0, mf.e(-1, 56, 53));
        l3 l3Var2 = new l3(activity, 1);
        l3Var2.o(1.0f, -20.0f);
        l3Var2.d = 5000L;
        l3Var2.k(true);
        l3Var2.u(bd.M0(2131744723, null));
        l3Var2.f13100r0 = new ai.y1(17);
        this.m1 = l3Var2;
        l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f13729j0.addView(this.m1, mf.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        l3 l3Var3 = new l3(activity, 2);
        l3Var3.o(0.0f, 28.0f);
        l3Var3.d = 5000L;
        l3Var3.r(true);
        this.f13740n1 = l3Var3;
        this.f13729j0.addView(l3Var3, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        l3 l3Var4 = new l3(activity, 1);
        l3Var4.o(1.0f, -20.0f);
        l3Var4.d = 5000L;
        l3Var4.u(bd.M0(2131744714, null));
        this.f13743o1 = l3Var4;
        l3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f13729j0.addView(this.f13743o1, mf.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f13048a = paint;
        Paint paint2 = new Paint(1);
        view2.f13049b = paint2;
        view2.f13051e = new org.telegram.ui.Components.u5((View) view2, 0L, 250L, xqVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        view2.f13050c = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.w(org.telegram.messenger.g0.L(13.0f));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(view2);
        g6Var.f33983b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.f13729j0.addView(this.K0, mf.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f13755s.a(this.K0);
        MediaController.O(0);
        h6 h6Var = new h6(activity);
        this.P0 = h6Var;
        h6Var.setDelegate(s9Var);
        h6 h6Var2 = this.P0;
        if (this.P1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h6Var2.f12902o0 = -1.0f;
        h6Var2.f12903p0 = z10;
        h6Var2.invalidate();
        this.f13734l0.addView(this.P0, mf.e(-1, 100, 87));
        this.f13755s.a(this.P0);
        h6 h6Var3 = this.P0;
        if (this.B0.j()) {
            f11 = this.B0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        h6Var3.e(true, f11);
        d dVar = new d(activity, bVar, true);
        this.Q0 = dVar;
        dVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(bd.M0(2131748796, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.f13734l0.addView(this.Q0, mf.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new x8(this, 8));
        l3 l3Var5 = new l3(activity, 3);
        l3Var5.r(true);
        l3Var5.u(bd.M0(2131744721, null));
        l3Var5.h = org.telegram.messenger.g0.L(320.0f);
        l3Var5.d = 5000L;
        l3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = l3Var5;
        this.f13734l0.addView(l3Var5, mf.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        j71 j71Var = new j71(activity);
        this.W0 = j71Var;
        j71Var.N = false;
        j71Var.setAlpha(0.0f);
        this.f13734l0.addView(this.W0, mf.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new e9(this, 4));
        j71 j71Var2 = this.W0;
        this.U1 = 0.0f;
        j71Var2.b(false, 0.0f);
        r6 r6Var = new r6(activity, i3, new v8(this, 12));
        this.E0 = r6Var;
        r6Var.f13514c = new w8(this, 9);
        this.f13734l0.addView(r6Var, mf.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        p9 p9Var = new p9(this, activity);
        this.R0 = p9Var;
        p9Var.setOnSwitchModeListener(new w8(this, 10));
        this.R0.setOnSwitchingModeListener(new w8(this, 11));
        this.f13739n0.addView(this.R0, mf.e(-1, 48, 55));
        this.f13755s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(bd.M0(2131754752, null));
        this.S0.setImageResource(2131232765);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.f13739n0.addView(this.S0, mf.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f13755s.a(this.S0);
        this.S0.setOnClickListener(new x8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(bd.M0(2131748798, null));
        this.T0.setImageResource(2131232766);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.f13739n0.addView(this.T0, mf.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f13755s.a(this.T0);
        this.T0.setOnClickListener(new x8(this, 10));
        i3 i3Var = new i3(activity);
        this.U0 = i3Var;
        this.f13739n0.addView(i3Var, mf.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f13755s.a(this.U0);
        i3 i3Var2 = new i3(activity);
        this.V0 = i3Var2;
        i3Var2.f12965a.t(bd.M0(2131744713, null), false, true);
        i3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.f13739n0.addView(this.V0, mf.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f13755s.a(this.V0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f13766v1 = dVar2;
        dVar2.setVisibility(8);
        this.f13766v1.setAlpha(0.0f);
        this.f13766v1.i(bd.M0(2131744699, null), false, true);
        this.f13766v1.setOnClickListener(new x8(this, 11));
        this.f13739n0.addView(this.f13766v1, mf.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f13428b = new ArrayList();
        frameLayout5.f13430e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f13427a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, mf.e(-1, -1, 119));
        frameLayout5.a(0, 2131231739, bd.M0(2131754814, null));
        frameLayout5.a(2, 2131232284, bd.M0(2131754756, null));
        frameLayout5.a(1, 2131232286, bd.M0(2131754807, null));
        frameLayout5.a(3, 2131231729, bd.M0(2131751700, null));
        frameLayout5.a(4, 2131232283, bd.M0(2131754811, null));
        String M0 = bd.M0(2131745650, null);
        frameLayout5.d = M0;
        frameLayout5.f13430e = true;
        p5 p5Var = new p5(frameLayout5, activity, M0, true);
        frameLayout5.f13429c = p5Var;
        p5Var.setContentDescription(bd.M0(2131745650, null));
        frameLayout5.addView(frameLayout5.f13429c, mf.c(-2.0f, -2));
        frameLayout5.e();
        this.f13708c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f13708c1.setOnClickListener(new w8(this, 12));
        this.f13739n0.addView(this.f13708c1, mf.e(-1, 52, 23));
        ib ibVar = new ib(activity);
        this.f13749q1 = ibVar;
        ibVar.setAlpha(0.0f);
        this.f13749q1.setVisibility(8);
        this.f13726i0.addView(this.f13749q1, mf.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        r5 r5Var = new r5(activity, i3, bVar);
        this.f13746p1 = r5Var;
        this.f13726i0.addView(r5Var, mf.e(-1, -1, 119));
        l0(false);
    }

    public static va D(Activity activity, int i3) {
        va vaVar = G2;
        if (vaVar != null && (vaVar.f13702b != activity || vaVar.f13706c != i3)) {
            vaVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new va(activity, i3);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        hp.e1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(va vaVar) {
        y9 y9Var = vaVar.C0;
        boolean z10 = false;
        if (y9Var != null && y9Var.getTextureView() != null) {
            Bitmap bitmap = vaVar.C0.getTextureView().getBitmap();
            if (bitmap == null) {
                vaVar.f13711d2 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f10 = 0.0f;
            for (int i3 = 0; i3 < 10; i3++) {
                int i10 = 0;
                while (i10 < 10) {
                    i10++;
                    f10 += org.telegram.messenger.g0.B(bitmap.getPixel((i3 + 1) * width, i10 * height));
                }
            }
            bitmap.recycle();
            if (f10 / 100.0f < 0.22f) {
                z10 = true;
            }
            vaVar.f13711d2 = z10;
            return;
        }
        vaVar.f13711d2 = false;
    }

    public static void b(va vaVar) {
        ValueAnimator valueAnimator = vaVar.f13733k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vaVar.f13733k2 = null;
        }
        vaVar.f13736l2 = false;
        na naVar = vaVar.f13751r;
        float f10 = naVar.f13311a;
        float f11 = naVar.f13312b;
        naVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        vaVar.f13733k2 = ofFloat;
        ofFloat.addUpdateListener(new l9(vaVar, f10, f11, 0));
        vaVar.f13733k2.setDuration(340L);
        vaVar.f13733k2.setInterpolator(xq.h);
        vaVar.f13733k2.addListener(new v9(vaVar, 0));
        vaVar.f13733k2.start();
    }

    public static boolean c(va vaVar) {
        Activity activity = vaVar.f13702b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g7 = k2.p1.g(context, 2131232763);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i3 = -L;
        g7.setBounds(i3 / 4, i3, (L / 4) * 3, 0);
        spannableString.setSpan(new ca(g7, g7), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        va vaVar = G2;
        if (vaVar != null) {
            vaVar.p(false);
        }
        G2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        f7 f7Var = this.L1;
        if (f7Var != null) {
            return f7Var.r();
        }
        return 1;
    }

    public final String B() {
        y9 y9Var = this.C0;
        if (y9Var != null && y9Var.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f13767v2.get(this.f13764u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final u0 C() {
        if (this.O0 == null) {
            u0 u0Var = new u0(this.f13702b);
            this.O0 = u0Var;
            this.f13734l0.addView(u0Var, mf.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        int i3;
        y9 y9Var = this.C0;
        if (y9Var != null && y9Var.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f13767v2;
                if (this.f13764u2 + 1 >= arrayList.size()) {
                    i3 = 0;
                } else {
                    i3 = this.f13764u2 + 1;
                }
                return (String) arrayList.get(i3);
            }
            return this.C0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f13730j1 == null) {
            ch0 ch0Var = new ch0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f13727i1 = ch0Var;
            ch0Var.h = true;
            f7 f7Var = this.L1;
            if (f7Var != null && f7Var.f12752y0) {
                ch0Var.M(35);
                this.f13727i1.P(36);
            } else {
                ch0Var.P(0);
                this.f13727i1.M(0);
            }
            this.f13727i1.f32719a0 = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.f13698a);
            this.f13727i1.Q(w02, "Sunny");
            this.f13727i1.Q(w02, "Path 6");
            this.f13727i1.Q(w02, "Path");
            this.f13727i1.Q(w02, "Path 5");
            this.f13727i1.o();
            ImageView imageView = new ImageView(this.f13702b);
            this.f13730j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f13730j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f13730j1.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
            this.f13730j1.setOnClickListener(new x8(this, 0));
            this.f13730j1.setVisibility(8);
            this.f13730j1.setImageDrawable(this.f13727i1);
            this.f13730j1.setAlpha(0.0f);
            this.f13732k0.addView(this.f13730j1, 0, mf.r(46, 56, 53));
        }
        return this.f13730j1;
    }

    public final void G() {
        x9 x9Var = this.f13770w1;
        if (x9Var == null) {
            return;
        }
        this.f13771w2 = null;
        x9Var.getTopLayout().setAlpha(0.0f);
        this.f13770w1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.f13770w1.getBottomLayout().setAlpha(0.0f);
        this.f13770w1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.f13770w1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.f13770w1.setVisibility(8);
    }

    public final boolean H() {
        float f10;
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.f13705b2 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        g3 g3Var;
        if (!this.X && (g3Var = this.N0) != null) {
            if (g3Var.getTranslationY() < (this.f13738n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.f22608q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: gi.va.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j10) {
        if (!this.T1 && this.L1 != null) {
            b9 b9Var = this.f13725h2;
            if (b9Var != null) {
                org.telegram.messenger.g0.r(b9Var);
            }
            this.f13728i2 = true;
            this.T1 = true;
            this.f13725h2 = new b9(this, runnable, 1);
            this.Y0.setAlpha(0.0f);
            this.Y0.setVisibility(0);
            this.Y0.n(this.L1, this.f13725h2, j10);
            this.Y0.p(this.L1, false);
            org.telegram.messenger.g0.i3(this.f13725h2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: gi.va.L():boolean");
    }

    public final void M(int i3, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        if (i3 == 0) {
            u(false);
            this.P0.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i3 == 2) {
            this.f13763u1.setVisibility(8);
            if (i10 == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.m0.setVisibility(i16);
            this.f13710d1.setVisibility(8);
            this.f13766v1.setVisibility(8);
        }
        if (i3 == 1) {
            this.f13708c1.setVisibility(8);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.m0.setVisibility(i13);
            this.f13724h1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f13718f1.setVisibility(8);
            ImageView imageView = this.f13730j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.Y0.setVisibility(i14);
            this.f13700a1.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            if (i10 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.f13748q0.setVisibility(i15);
            v();
            this.f13749q1.setAlpha(0.0f);
            this.f13749q1.setVisibility(8);
            this.f13704b1.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        if (i10 == 1) {
            f7 f7Var = this.L1;
            if (f7Var == null || !f7Var.f12730n) {
                t();
                G();
            }
            md0 md0Var = this.D1;
            if (md0Var != null) {
                md0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            f7 f7Var2 = this.L1;
            if (f7Var2 != null && f7Var2.f12720h0 >= 30000) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f13704b1.setVisibility(i12);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            f7 f7Var3 = this.L1;
            if (f7Var3 == null || f7Var3.J0 == 0) {
                i17 = 0;
            }
            this.f13710d1.setVisibility(i17);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            u0 C = C();
            C.f13652r.e(true, 0.0f);
            C.a(true);
            ei.z5 z5Var = C.h;
            if (z5Var != null) {
                org.telegram.messenger.g0.r(z5Var);
            }
            ei.z5 z5Var2 = new ei.z5(C, 20);
            C.h = z5Var2;
            org.telegram.messenger.g0.i3(z5Var2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        md0 md0Var2 = this.D1;
        if (md0Var2 != null) {
            if (i10 == 1 && ((i11 = this.f13723h0) == -1 || i11 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            md0Var2.setAllowTouch(z11);
        }
        la laVar = this.f13710d1;
        if (laVar != null) {
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            laVar.f13143e0 = z10;
        }
        if (i10 == 1) {
            int i18 = this.f13706c;
            li.b0(i18).B(0);
            li.b0(i18).V0(0, false, true, false);
            li.b0(i18).V0(2, false, true, false);
            ei.z6 P1 = hp.s1(i18).P1();
            if (P1.Q == 0) {
                P1.S();
            }
            hp.s1(i18).P1().U();
        }
    }

    public final void N(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: gi.va.N(int, int):void");
    }

    public final void O() {
        tg.s0 s0Var;
        int i3;
        if (this.f13720g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13779y2 = new v8(this, 3);
            } else {
                Y(false);
            }
        }
        la laVar = this.f13710d1;
        if (laVar != null) {
            laVar.f13144f.s();
        }
        h6 h6Var = this.P0;
        if (h6Var != null) {
            h6Var.h();
        }
        r5 r5Var = this.f13746p1;
        if (r5Var != null) {
            ei.z6 P1 = hp.s1(r5Var.f13507a).P1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) P1.f11280i.f(h10.i(P1.f11274a).f22848n);
            if (peerStories != null) {
                i3 = peerStories.stories.size();
            } else {
                i3 = 0;
            }
            r5Var.f13508b = P1.f11275b.m() + i3 + 1;
            r5Var.f13509c.invalidate();
        }
        x9 x9Var = this.f13770w1;
        if (x9Var != null && (s0Var = x9Var.f13239y0.d) != null) {
            s0Var.postRunnable(s0Var.f55313x);
        }
        ja jaVar = this.Y0;
        if (jaVar != null) {
            jaVar.x(0, false);
        }
        z0 z0Var = hp.s1(this.f13706c).P1().f11293w;
        if (!z0Var.f13998c && !z0Var.d) {
            z0Var.d = true;
            v0 v0Var = new v0(z0Var, 1);
            qr a02 = qr.a0(z0Var.f13996a);
            a02.f24934a.c(new ci.v6((Object) a02, false, (Object) v0Var, 3));
        }
    }

    public final void P(int i3, int i10) {
        boolean z10;
        x9 x9Var;
        fa faVar;
        ga gaVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        x9 x9Var2;
        if (i10 == 0) {
            this.f13742o0.setVisibility(8);
        }
        if (i3 == 0 && (x9Var2 = this.f13770w1) != null) {
            x9Var2.setVisibility(8);
        }
        if (i3 == -1) {
            this.f13710d1.setVisibility(8);
            if (i10 == 2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f13724h1.setVisibility(i11);
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.k1.setVisibility(i12);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f13718f1.setVisibility(i13);
            ImageView imageView = this.f13730j1;
            if (imageView != null) {
                if (i10 == 2) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                imageView.setVisibility(i15);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f13700a1.setVisibility(i14);
            this.f13748q0.setVisibility(8);
        }
        boolean z11 = true;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y0.setAllowCropping(z10);
        if ((i10 == 0 || i3 == 0) && (x9Var = this.f13770w1) != null) {
            x9Var.N0.setLayerType(0, null);
        }
        md0 md0Var = this.D1;
        if (md0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z11 = false;
            }
            md0Var.setAllowTouch(z11);
        }
        if (i10 == 3) {
            fa faVar2 = this.f13757s1;
            if (faVar2 != null) {
                faVar2.setAppearProgress(1.0f);
            }
        } else if (i3 == 3 && (faVar = this.f13757s1) != null) {
            faVar.setVisibility(8);
            this.f13757s1.setAppearProgress(0.0f);
            fa faVar3 = this.f13757s1;
            faVar3.f12998y = null;
            g0 g0Var = faVar3.f12992f;
            g0Var.M = null;
            g0Var.d = null;
            g0Var.K = false;
            faVar3.d.setVisibility(8);
            faVar3.f12988a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ga gaVar2 = this.f13760t1;
            if (gaVar2 != null) {
                gaVar2.setAppearProgress(1.0f);
            }
        } else if (i3 == 4 && (gaVar = this.f13760t1) != null) {
            gaVar.setVisibility(8);
            this.f13760t1.setAppearProgress(0.0f);
            ga gaVar3 = this.f13760t1;
            gaVar3.f13172b = null;
            g0 g0Var2 = gaVar3.h;
            g0Var2.M = null;
            g0Var2.d = null;
            g0Var2.K = false;
            gaVar3.f13174e.setVisibility(8);
            gaVar3.setVisibility(8);
        }
    }

    public final void Q(pa paVar) {
        ei.t6 o10;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i3 = this.f13706c;
        if (hp.s1(i3).v2()) {
            org.telegram.ui.b.b(i3);
            return;
        }
        int i10 = 0;
        this.f13765v0 = false;
        this.f13712e = false;
        this.C2 = false;
        this.f13759t0.f13843g = false;
        WindowManager windowManager = this.f13716f;
        if (windowManager != null && (uaVar = this.f13738n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.f13738n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.f13738n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.f13769w0 == 0 && (o10 = hp.s1(i3).P1().o()) != null && o10.a(i3, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (paVar != null) {
            this.G = paVar;
            this.K = paVar.f13452a;
            rectF.set(paVar.f13454c);
            this.H = paVar.f13453b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f22608q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f13751r.c();
        int i11 = this.K;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f13726i0.setBackgroundColor(i10);
        this.f13751r.setTranslationX(0.0f);
        this.f13751r.setTranslationY(0.0f);
        this.f13751r.b(0.0f);
        this.f13751r.setScaleX(1.0f);
        this.f13751r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f13702b);
        f(1.0f, true, new v8(this, 6));
        d();
        this.f13769w0 = 0L;
        this.f13773x0 = "";
    }

    public final void R(oa oaVar, f7 f7Var, long j10) {
        int i3;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i10 = this.f13706c;
        if (hp.s1(i10).v2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f13765v0 = false;
        this.f13712e = false;
        this.C2 = false;
        WindowManager windowManager = this.f13716f;
        if (windowManager != null && (uaVar = this.f13738n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.f13738n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.f13738n, layoutParams);
            f0();
        }
        this.L1 = f7Var;
        this.P1 = f7Var.K ? 1 : 0;
        this.f13759t0.f13843g = false;
        RectF rectF = this.I;
        if (oaVar != null) {
            this.G = oaVar;
            this.K = oaVar.f13452a;
            rectF.set(oaVar.f13454c);
            this.H = oaVar.f13453b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f22608q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f13751r.c();
        int i11 = this.K;
        int i12 = 1;
        if (i11 != 1 && i11 != 0) {
            i3 = -14737633;
        } else {
            i3 = 0;
        }
        this.f13726i0.setBackgroundColor(i3);
        this.f13751r.setTranslationX(0.0f);
        this.f13751r.setTranslationY(0.0f);
        this.f13751r.b(0.0f);
        this.f13751r.setScaleX(1.0f);
        this.f13751r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f13702b);
        f7 f7Var2 = this.L1;
        if (f7Var2 != null) {
            this.f13710d1.setText(f7Var2.C0);
        }
        K(new n9(this, 0), j10);
        if (this.L1.f12706b0) {
            i12 = 2;
        }
        J(i12, false);
        k0(-1, false, false);
        this.f13708c1.b(false, false);
        d();
        this.f13769w0 = 0L;
        this.f13773x0 = "";
    }

    public final void S() {
        f60 f60Var;
        ja jaVar = this.Y0;
        if (jaVar != null) {
            jaVar.x(4, true);
        }
        la laVar = this.f13710d1;
        if (laVar != null && (f60Var = laVar.V0) != null) {
            f60Var.u();
            laVar.V0 = null;
        }
        vg.v0 v0Var = new vg.v0((org.telegram.ui.ActionBar.d2) new z9(this, 1), 14, false);
        v0Var.setOnDismissListener(new j9(this, 1));
        v0Var.show();
    }

    public final void T(oa oaVar, f7 f7Var) {
        int i3;
        boolean z10;
        int i10;
        ei.t6 o10;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i11 = this.f13706c;
        if (hp.s1(i11).v2()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f13765v0 = true;
        this.f13712e = false;
        this.C2 = false;
        WindowManager windowManager = this.f13716f;
        if (windowManager != null && (uaVar = this.f13738n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.f13738n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.f13738n, layoutParams);
            f0();
        }
        this.L1 = f7Var;
        u8.a(i11, f7Var);
        f7 f7Var2 = this.L1;
        if (f7Var2 != null && f7Var2.K) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.P1 = i3;
        if (f7Var2 != null && f7Var2.f12744u && i3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13759t0.f13843g = z10;
        if (this.f13769w0 == 0 && (o10 = hp.s1(i11).P1().o()) != null && o10.a(i11, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.I;
        if (oaVar != null) {
            this.G = oaVar;
            this.K = oaVar.f13452a;
            rectF.set(oaVar.f13454c);
            this.H = oaVar.f13453b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f22608q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f13751r.c();
        int i12 = this.K;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f13726i0.setBackgroundColor(i10);
        this.f13751r.setTranslationX(0.0f);
        this.f13751r.setTranslationY(0.0f);
        this.f13751r.b(0.0f);
        this.f13751r.setScaleX(1.0f);
        this.f13751r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f13702b);
        f7 f7Var3 = this.L1;
        if (f7Var3 != null) {
            this.f13710d1.setText(f7Var3.C0);
        }
        this.f13708c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new v8(this, 6));
        d();
        this.f13769w0 = 0L;
        this.f13773x0 = "";
    }

    public final void U() {
        tg.u0 u0Var = this.f13774x1;
        if (u0Var != null) {
            u0Var.bringToFront();
        }
        View view = this.f13778y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f13781z1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.A1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.B1;
        if (view4 != null) {
            view4.bringToFront();
        }
        ib ibVar = this.f13749q1;
        if (ibVar != null) {
            ibVar.bringToFront();
        }
        md0 md0Var = this.D1;
        if (md0Var != null) {
            md0Var.bringToFront();
        }
        ed0 ed0Var = this.F1;
        if (ed0Var != null) {
            ed0Var.bringToFront();
        }
        gd0 gd0Var = this.G1;
        if (gd0Var != null) {
            gd0Var.bringToFront();
        }
        r5 r5Var = this.f13746p1;
        if (r5Var != null) {
            r5Var.bringToFront();
        }
        p pVar = this.f13753r1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(f7 f7Var, boolean z10) {
        File file;
        View view;
        float f10;
        f7 f7Var2;
        boolean z11;
        int i3;
        if (f7Var != null && this.Y0.getWidth() > 0 && this.Y0.getHeight() > 0) {
            if (z10) {
                file = f7Var.O0;
            } else {
                file = f7Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.B0.j()) {
                view = this.B0;
            } else {
                view = this.Y0;
            }
            if (z10) {
                f10 = 0.33333334f;
            } else {
                f10 = 1.0f;
            }
            int width = (int) (view.getWidth() * f10);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f10, f10);
            org.telegram.messenger.g0.m0 = true;
            view.draw(canvas);
            org.telegram.messenger.g0.m0 = false;
            canvas.restore();
            Paint paint = new Paint(2);
            b51 textureView = this.Y0.getTextureView();
            if (f7Var.K && !f7Var.f12744u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f10, f10);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = f7Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            File file3 = f7Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            x9 x9Var = this.f13770w1;
            if (x9Var != null && x9Var.B0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                x9 x9Var2 = this.f13770w1;
                x9Var2.f13227s0 = true;
                h5 h5Var = x9Var2.B0;
                h5Var.f55923a = true;
                h5Var.draw(canvas);
                x9 x9Var3 = this.f13770w1;
                x9Var3.B0.f55923a = false;
                x9Var3.f13227s0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = f7.w(this.f13706c, "jpg");
            if (z10) {
                f7Var2 = f7Var;
                z11 = z10;
                Utilities.f21389g.c(new q1(this, createBitmap, z11, w10, f7Var2, 1));
            } else {
                f7Var2 = f7Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i3 = 95;
                    } else {
                        i3 = 99;
                    }
                    createBitmap.compress(compressFormat, i3, new FileOutputStream(w10));
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            }
            if (!z11) {
                f7Var2.N0 = w10;
            }
            f7Var2.f12707b1 = createScaledBitmap;
        }
    }

    public final void W() {
        ei.t6 o10;
        int size;
        char c2;
        View[] viewPages;
        y31[] y31VarArr;
        t8 t8Var = this.f13752r0;
        BitmapDrawable bitmapDrawable = null;
        if (t8Var != null) {
            t8Var.dismiss();
            this.f13752r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
        if (z10) {
            t0 t0Var = this.f13718f1;
            t0Var.getClass();
            t0Var.c(bd.N0("VideoConvertFail"));
            p2Var.a();
            p5 p5Var = this.f13708c1.f13429c;
            int i3 = -this.V1;
            this.V1 = i3;
            org.telegram.messenger.g0.G3(i3, p5Var, null);
            return;
        }
        la laVar = this.f13710d1;
        if (laVar != null && laVar.o()) {
            p2Var.a();
            org.telegram.ui.Components.h6 h6Var = laVar.f13164w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.G3(i10, h6Var, null);
            laVar.e();
            return;
        }
        f7 f7Var = this.L1;
        int i11 = this.f13706c;
        if ((f7Var == null || (!f7Var.f12718g && f7Var.J0 == 0)) && (o10 = hp.s1(i11).f23027i0.o()) != null && o10.a(i11, A())) {
            g0(o10, false);
            return;
        }
        this.L1.D0 = hp.s1(i11).X4();
        ei.b bVar = this.f13698a;
        char c10 = 1;
        if (laVar != null && !this.L1.D0) {
            CharSequence text = laVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((uy0[]) spannable.getSpans(0, text.length(), uy0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new fc(this.f13738n, bVar).Q(2131624345, 36, org.telegram.messenger.g0.S2(bd.M0(2131744591, null), org.telegram.ui.ActionBar.k6.Uc, 0, new v8(this, 27), bVar)).k(true);
                    int i12 = -this.V1;
                    this.V1 = i12;
                    org.telegram.messenger.g0.G3(i12, laVar, null);
                    return;
                }
            }
        }
        f7 f7Var2 = this.L1;
        if (!f7Var2.f12718g && f7Var2.J0 == 0) {
            if (this.O != 0) {
                f7Var2.f12746v0 = hp.s1(i11).j1(this.O);
            }
            ja jaVar = this.Y0;
            jaVar.x(3, true);
            t8 t8Var2 = new t8(this.L1.I0, this.f13702b, bVar);
            t8Var2.W0(this.L1.E0);
            t8Var2.V0(this.L1.f12746v0);
            t8Var2.f13633x1 = this.N;
            t8Var2.M1 = new w8(this, 14);
            t8Var2.L0(!this.B0.j());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            t8Var2.S0(size);
            t8Var2.Q0(false);
            CharSequence text2 = laVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (y31 y31Var : (y31[]) ((Spanned) text2).getSpans(0, text2.length(), y31.class)) {
                    if (y31Var != null) {
                        try {
                            TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(Long.parseLong(y31Var.getURL())));
                            if (a22 != null && !l10.B(a22) && l10.n(a22) != null && !arrayList2.contains(a22)) {
                                arrayList2.add(l10.n(a22));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i13 = 0;
                int i14 = -1;
                while (i13 < text2.length()) {
                    char charAt = text2.charAt(i13);
                    char c11 = c10;
                    if (charAt == '@') {
                        i14 = i13 + 1;
                    } else if (charAt == ' ') {
                        if (i14 != -1) {
                            String charSequence = text2.subSequence(i14, i13).toString();
                            TLObject f22 = hp.s1(i11).f2(charSequence);
                            if (f22 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) f22;
                                if (!user.bot && !l10.B(user) && user.f27150id != 777000 && !l10.z(user) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i14 = -1;
                    }
                    i13++;
                    c10 = c11;
                }
                c2 = c10;
                if (i14 != -1) {
                    String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                    TLObject f23 = hp.s1(i11).f2(charSequence2);
                    if (f23 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) f23;
                        if (!user2.bot && !l10.B(user2) && user2.f27150id != 777000 && !l10.z(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c2 = 1;
            }
            t8Var2.K1 = arrayList2;
            t8Var2.O1 = new w8(this, 15);
            t8Var2.P1 = new w8(this, 16);
            t8Var2.L1 = new e9(this, 9);
            this.f13752r0 = t8Var2;
            f7 f7Var3 = this.L1;
            if (f7Var3.K) {
                if (jaVar != null && !f7Var3.f12717f0 && this.f13720g0 != 2) {
                    f7Var3.f12714e0 = jaVar.getCurrentPosition();
                    u10 w8Var = new w8(this, 17);
                    View view = this.f13774x1;
                    View view2 = this.A1;
                    View[] viewArr = new View[3];
                    viewArr[0] = jaVar;
                    viewArr[c2] = view;
                    viewArr[2] = view2;
                    jaVar.h(w8Var, viewArr);
                }
                t8 t8Var3 = this.f13752r0;
                Bitmap bitmap = this.L1.f12719g0;
                v8 v8Var = new v8(this, 20);
                if (bitmap != null) {
                    t8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                t8Var3.T1 = bitmapDrawable;
                t8Var3.U1 = v8Var;
                g1 g1Var = t8Var3.f13621j1;
                if (g1Var != null) {
                    for (View view3 : g1Var.getViewPages()) {
                        if (view3 instanceof o8) {
                            o8 o8Var = (o8) view3;
                            o8Var.h(false);
                            o8Var.f(false);
                        }
                    }
                }
            }
            this.f13752r0.setOnDismissListener(new j9(this, 0));
            this.f13752r0.show();
            return;
        }
        f7Var2.f12727l = false;
        h(null);
        o0();
    }

    public final void X(qa qaVar) {
        int i3 = 0;
        RectF rectF = this.I;
        if (qaVar != null) {
            this.G = qaVar;
            this.K = qaVar.f13452a;
            rectF.set(qaVar.f13454c);
            this.H = qaVar.f13453b;
        } else {
            this.G = null;
            this.K = 0;
            Point point = org.telegram.messenger.g0.f22608q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.K;
        if (i10 != 1 && i10 != 0) {
            i3 = -14737633;
        }
        this.f13726i0.setBackgroundColor(i3);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f13775x2 || z10) {
            this.f13761t2 = false;
            Activity activity = this.f13702b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f13761t2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(2131232763).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    xp xpVar = new xp(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    xpVar.f40441e = L;
                    xpVar.f40442f = L2;
                    this.B0.setCameraThumb(xpVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.f13698a);
                        int i3 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                        alertDialog$Builder.n(i3, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(2131747316, null));
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.U = X2;
                        alertDialog$Builder.k(bd.M0(2131747308, null), new e9(this, 12));
                        alertDialog$Builder.h(bd.M0(2131751772, null), null);
                        s1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f13775x2 = true;
                }
            }
            if (!this.f13761t2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new v8(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        y9 y9Var = this.C0;
        if (y9Var != null && y9Var.getTextureView() != null) {
            try {
                Utilities.f21390i.c(new ei.h9(this, this.C0.getTextureView().getBitmap(), runnable, 12));
            } catch (Throwable unused) {
            }
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f10 = 0.0f;
        int i3 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setUpdateListener(new w9(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(xq.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (z10) {
            f10 = 1.0f;
        }
        view.setAlpha(f10);
        m0();
    }

    public final void c0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f13716f.updateViewLayout(this.f13738n, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        hs.e().b(this, hs.f23295r2);
        int i3 = this.f13706c;
        hs.f(i3).b(this, hs.f23345y5);
        hs.f(i3).b(this, hs.f23205b3);
    }

    public final void d0(String str) {
        int i3;
        gb gbVar = this.F0;
        gbVar.clearAnimation();
        y9 y9Var = this.C0;
        if ((y9Var != null && y9Var.isDual()) || this.f13705b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(gbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    gbVar.setContentDescription(bd.M0(2131754915, null));
                    i3 = 2131231751;
                }
            } else {
                str.equals("off");
            }
            gbVar.setContentDescription(bd.M0(2131754914, null));
            i3 = 2131231752;
        } else {
            if (str.equals("on")) {
                gbVar.setContentDescription(bd.M0(2131754913, null));
                i3 = 2131231753;
            }
            gbVar.setContentDescription(bd.M0(2131754914, null));
            i3 = 2131231752;
        }
        if (gbVar.f12850n != i3) {
            gbVar.f12850n = i3;
            ValueAnimator valueAnimator = gbVar.f12851r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                gbVar.f12851r = null;
            }
            gbVar.setDrawable(i3);
        }
        if (this.f13720g0 == 0 && !this.J0.f13878e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(gbVar, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ei.t6 o10;
        f7 f7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i3 == hs.f23295r2) {
            h6 h6Var = this.P0;
            if (h6Var != null) {
                h6Var.h();
            }
            if (this.f13741n2 != null && MediaController.c2 != null) {
                for (int i11 = 0; i11 < MediaController.c2.size(); i11++) {
                    pe peVar = (pe) MediaController.c2.get(i11);
                    int i12 = peVar.f24735a;
                    pe peVar2 = this.f13741n2;
                    if (i12 == peVar2.f24735a && peVar.f24736b == peVar2.f24736b) {
                        this.f13741n2 = peVar;
                        return;
                    }
                }
            }
        } else if (i3 == hs.f23345y5) {
            h6 h6Var2 = this.P0;
            if (h6Var2 != null && !this.W1) {
                h6Var2.h();
            }
        } else if (i3 == hs.f23205b3) {
            int i13 = this.f13720g0;
            int i14 = this.f13706c;
            if (i13 == 1) {
                if (!this.O1 && !this.f13710d1.o()) {
                    ei.z6 P1 = hp.s1(i14).P1();
                    int A = A();
                    ei.t6 o11 = P1.o();
                    if (o11 == null || !o11.a(P1.f11274a, A) || ((f7Var = this.L1) != null && (f7Var.f12718g || f7Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f13708c1.setShareEnabled(z10);
            } else if (i13 == 0 && (o10 = hp.s1(i14).P1().o()) != null && o10.a(i14, 1)) {
                f7 f7Var2 = this.L1;
                if (f7Var2 == null || f7Var2.J0 == 0) {
                    g0(o10, true);
                }
            }
        }
    }

    public final void e(boolean z10) {
        float height;
        boolean z11;
        int i3;
        u0 u0Var;
        this.L0 = z10;
        Boolean bool = this.f13750q2;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.N0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.N0 == null) {
                    return;
                }
            }
            if (this.N0.V) {
                this.f13754r2 = new f9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f13744o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f13744o2 = null;
            }
            q1.g gVar = this.f13747p2;
            if (gVar != null) {
                gVar.d();
                this.f13747p2 = null;
            }
            if (this.N0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.N0 == null) {
                    return;
                }
            }
            g3 g3Var = this.N0;
            if (g3Var != null) {
                g3Var.L = false;
            }
            if (z10 && (u0Var = this.O0) != null) {
                u0Var.a(false);
            }
            int i10 = 4;
            na naVar = this.f13751r;
            if (naVar != null) {
                if (z10) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                naVar.setImportantForAccessibility(i3);
            }
            g3 g3Var2 = this.N0;
            if (z10) {
                i10 = 0;
            }
            g3Var2.setImportantForAccessibility(i10);
            this.f13750q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            ua uaVar = this.f13738n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (uaVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.f22603n * 2.5f);
            }
            Math.max(1, uaVar.getHeight());
            g3 g3Var3 = this.N0;
            g3Var3.L = !z10;
            if (this.f13733k2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f13736l2 = z11;
            if (z10) {
                q1.g gVar2 = new q1.g(g3Var3, q1.g.f53637p, height);
                this.f13747p2 = gVar2;
                gVar2.f53653m.a(0.75f);
                this.f13747p2.f53653m.b(350.0f);
                this.f13747p2.a(new g9(this, height, 0));
                this.f13747p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f13744o2 = ofFloat;
                ofFloat.addUpdateListener(new h9(this, 0));
                this.f13744o2.addListener(new v9(this, 1));
                this.f13744o2.setDuration(450L);
                this.f13744o2.setInterpolator(xq.h);
                this.f13744o2.start();
            }
            if (!z10 && !this.T1) {
                this.f13737m2 = null;
            }
            if (!z10 && this.f13720g0 == 0 && !this.f13761t2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f13721g1 == null) {
            ch0 ch0Var = new ch0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f13721g1 = ch0Var;
            ch0Var.G *= 1.5f;
        }
        this.f13724h1.setAnimation(this.f13721g1);
        int i3 = 20;
        if (!z11) {
            ch0 ch0Var2 = this.f13721g1;
            if (!z10) {
                i3 = 0;
            }
            ch0Var2.N(i3, false, false);
        } else if (z10) {
            ch0 ch0Var3 = this.f13721g1;
            if (ch0Var3.f32721b0 > 20) {
                ch0Var3.N(0, false, false);
            }
            this.f13721g1.P(20);
            this.f13721g1.start();
        } else {
            ch0 ch0Var4 = this.f13721g1;
            int i10 = ch0Var4.f32721b0;
            if (i10 != 0 && i10 < 43) {
                ch0Var4.P(43);
                this.f13721g1.start();
            }
        }
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        na naVar = this.f13751r;
        if (z10) {
            this.Q.d();
            hs.e().k(hs.f23249j1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new h9(this, 5));
            this.F.addListener(new ci.p6(this, f10, runnable, 3));
            if (f10 < 1.0f && this.f13768w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(xq.h);
            } else if (f10 <= 0.0f && naVar.f13311a >= org.telegram.messenger.g0.L(20.0f)) {
                if (f10 < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(xq.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(xq.h);
                }
            } else {
                this.F.setDuration(300L);
                this.F.setInterpolator(new w1.a());
            }
            this.F.start();
            return;
        }
        this.M = null;
        this.J = f10;
        j();
        naVar.invalidate();
        this.f13738n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f13738n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 3));
    }

    public final void g(boolean z10, boolean z11) {
        float f10;
        float L;
        float L2;
        float f11;
        float L3;
        float L4;
        y yVar;
        if (z10) {
            l3 l3Var = this.m1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            l3 l3Var2 = this.f13740n1;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            l3 l3Var3 = this.f13735l1;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
            l3 l3Var4 = this.X0;
            if (l3Var4 != null) {
                l3Var4.f(true);
            }
        }
        if (this.f13705b2 == z10 && this.c2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.f13701a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f13701a2 = null;
        }
        this.f13705b2 = z10;
        this.c2 = H();
        if (z10 && (yVar = this.J0) != null && yVar.f13878e) {
            yVar.a(false, z11);
        }
        l0(z11);
        p9 p9Var = this.R0;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f13701a2 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f13720g0 == 0 && !H()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f13720g0 == 0 && !H()) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i3Var2, property2, L3);
            if (z10 || this.f13720g0 != 0 || !H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i3Var, property, f12);
            if (!z10 && this.f13720g0 == 0 && H()) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i3Var, property2, L4);
            if (z10 || this.f13720g0 != 0 || H()) {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p9Var, property, f13);
            if (z10 || this.f13720g0 != 0 || H()) {
                f14 = org.telegram.messenger.g0.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(p9Var, property2, f14));
            this.f13701a2.setDuration(260L);
            this.f13701a2.setInterpolator(xq.h);
            this.f13701a2.start();
            return;
        }
        if (z10 && this.f13720g0 == 0 && !H()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        i3Var2.setAlpha(f10);
        if (z10 && this.f13720g0 == 0 && !H()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        i3Var2.setTranslationY(L);
        if (z10 || this.f13720g0 != 0 || !H()) {
            f12 = 0.0f;
        }
        i3Var.setAlpha(f12);
        if (!z10 && this.f13720g0 == 0 && H()) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(16.0f);
        }
        i3Var.setTranslationY(L2);
        if (z10 || this.f13720g0 != 0 || H()) {
            f13 = 0.0f;
        }
        p9Var.setAlpha(f13);
        if (z10 || this.f13720g0 != 0 || H()) {
            f14 = org.telegram.messenger.g0.L(16.0f);
        }
        p9Var.setTranslationY(f14);
    }

    public final void g0(ei.t6 t6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        vg.i0 i0Var = new vg.i0(t6Var.b(), this.f13706c, this.f13702b, new z9(this, 0), null);
        i0Var.Q1 = A();
        i0Var.setOnDismissListener(new s60(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        i0Var.show();
    }

    public final void h(Runnable runnable) {
        f7 f7Var;
        Runnable runnable2;
        ja jaVar;
        float f10;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        nd0 nd0Var = this.C1;
        if (nd0Var != null && (f7Var = this.L1) != null) {
            f7Var.f12723j = nd0Var.a() | f7Var.f12723j;
            f7 f7Var2 = this.L1;
            nd0 nd0Var2 = this.C1;
            File file = f7Var2.Z0;
            if (file != null) {
                file.delete();
                f7Var2.Z0 = null;
            }
            ze savedFilterState = nd0Var2.getSavedFilterState();
            f7Var2.f12704a1 = savedFilterState;
            if (!f7Var2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = nd0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i3 = f7Var2.R;
                        float f11 = 1.0f;
                        if (i3 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i3 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, f7Var2.f12726k0 / 2.0f, f7Var2.f12728l0 / 2.0f);
                        matrix.postRotate(-f7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        f7Var2.f12731n0.preScale(f7Var2.f12726k0 / createBitmap.getWidth(), f7Var2.f12728l0 / createBitmap.getHeight());
                        f7Var2.f12726k0 = createBitmap.getWidth();
                        f7Var2.f12728l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = f7Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            f7Var2.Z0.delete();
                        }
                        String k10 = f7.k(f7Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i10 = f7Var2.f12702a;
                        if (!z10) {
                            str = "jpg";
                        }
                        f7Var2.Z0 = f7.w(i10, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(f7Var2.Z0);
                                if (z10) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.f21390i.c(new ci.u8(f7Var2, createBitmap, z10, runnable2, 3));
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
                f7 f7Var3 = this.L1;
                if (!f7Var3.K && (jaVar = this.Y0) != null) {
                    jaVar.set(f7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f13715e2 != z10) {
            this.f13715e2 = z10;
            float f10 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.K0.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(xq.h).withEndAction(new f9(this, z10, 1)).start();
                return;
            }
            this.K0.clearAnimation();
            if (z10) {
                f10 = 1.0f;
            }
            this.K0.setAlpha(f10);
            if (!z10) {
                this.K0.b(false, false);
            }
        }
    }

    public final void i() {
        if (this.L1 != null && this.E1 != null && this.f13726i0.getMeasuredWidth() > 0 && this.f13726i0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i3 = this.L1.Q;
            if (i3 != 0) {
                matrix.postRotate(-i3, this.f13726i0.getMeasuredWidth() / 2.0f, this.f13726i0.getMeasuredHeight() / 2.0f);
                if ((this.L1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f13726i0.getMeasuredWidth() / this.f13726i0.getMeasuredHeight(), this.f13726i0.getMeasuredHeight() / this.f13726i0.getMeasuredWidth(), this.f13726i0.getMeasuredWidth() / 2.0f, this.f13726i0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f13726i0.getMeasuredWidth()) * this.L1.f12726k0, (1.0f / this.f13726i0.getMeasuredHeight()) * this.L1.f12728l0);
            matrix.postConcat(this.L1.f12731n0);
            matrix.postScale(this.f13726i0.getMeasuredWidth() / this.L1.f12722i0, this.f13726i0.getMeasuredHeight() / this.L1.f12724j0);
            this.E1.setTransform(matrix);
            this.E1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f10;
        j71 j71Var = this.W0;
        if ((j71Var.getTag() != null && z10) || (j71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f13719f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                v8 v8Var = new v8(this, 25);
                this.f13719f2 = v8Var;
                org.telegram.messenger.g0.i3(v8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f13722g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        j71Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f13722g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            j71Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f13722g2;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(j71Var, property, f10));
        this.f13722g2.addListener(new dh.x(14, this, z10));
        this.f13722g2.start();
        if (z10) {
            v8 v8Var2 = new v8(this, 26);
            this.f13719f2 = v8Var2;
            org.telegram.messenger.g0.i3(v8Var2, 2000L);
        }
    }

    public final void j() {
        ei.m3 m3Var;
        if (this.K == 1) {
            RectF rectF = this.f13713e0;
            rectF.set(this.f13726i0.getLeft(), this.f13726i0.getTop(), this.f13726i0.getMeasuredWidth(), this.f13726i0.getMeasuredHeight());
            rectF.offset(this.f13751r.getX(), this.f13751r.getY());
            float f10 = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.f13709d0;
            org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
            this.f13726i0.setAlpha(this.J);
            float f11 = rectF3.left;
            ha haVar = this.f13726i0;
            haVar.setTranslationX((f11 - haVar.getLeft()) - this.f13751r.getX());
            float f12 = rectF3.top;
            ha haVar2 = this.f13726i0;
            haVar2.setTranslationY((f12 - haVar2.getTop()) - this.f13751r.getY());
            qa qaVar = this.G;
            if (qaVar != null && (m3Var = qaVar.f13456f) != null) {
                m3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f13456f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            this.f13726i0.setScaleX(rectF3.width() / this.f13726i0.getMeasuredWidth());
            this.f13726i0.setScaleY(rectF3.height() / this.f13726i0.getMeasuredHeight());
            this.f13729j0.setAlpha(this.J);
            this.f13734l0.setAlpha(this.J);
            this.m0.setAlpha(this.J);
            if (this.f13720g0 == 2) {
                this.f13766v1.setAlpha(this.J);
            }
        }
    }

    public final void j0() {
        t8 t8Var = this.f13752r0;
        if (t8Var != null) {
            t8Var.dismiss();
            this.f13752r0 = null;
        }
        t8 t8Var2 = new t8(86400, this.f13702b, this.f13698a);
        t8Var2.U0();
        t8Var2.W0(this.f13780z0);
        TLRPC.InputPeer inputPeer = this.f13777y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = hp.s1(this.f13706c).j1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        t8Var2.V0(inputPeer);
        t8Var2.f13633x1 = this.N;
        t8Var2.M1 = new w8(this, 18);
        t8Var2.L0(false);
        t8Var2.S0(1);
        t8Var2.Q0(false);
        t8Var2.O1 = new w8(this, 19);
        t8Var2.L1 = new e9(this, 11);
        this.f13752r0 = t8Var2;
        t8Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: gi.va.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: gi.va.k0(int, boolean, boolean):void");
    }

    public final void l() {
        f7 f7Var;
        boolean z10;
        if (this.f13770w1 != null && (f7Var = this.L1) != null && f7Var.f12744u) {
            File file = f7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.W0 = null;
            }
            this.L1.W0 = f7.w(this.f13706c, "webp");
            x9 x9Var = this.f13770w1;
            f7 f7Var2 = this.L1;
            ArrayList arrayList = f7Var2.T0;
            if (this.P1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap q02 = x9Var.q0(arrayList, false, false, true, z10, f7Var2);
            try {
                try {
                    q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                    if (q02.isRecycled()) {
                        return;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    try {
                        this.L1.W0.delete();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    this.L1.W0 = null;
                    if (q02 == null || q02.isRecycled()) {
                        return;
                    }
                }
                q02.recycle();
            } catch (Throwable th2) {
                if (q02 != null && !q02.isRecycled()) {
                    q02.recycle();
                }
                throw th2;
            }
        }
    }

    public final void l0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f10;
        boolean z16;
        y9 y9Var;
        boolean z17 = false;
        if (this.f13720g0 == 0 && this.P1 == 1 && !this.J0.f13878e && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0(z11, z10);
        this.H0.setSelected(this.B0.j());
        y yVar = this.J0;
        if (yVar != null && yVar.f13878e) {
            z12 = false;
        } else {
            z12 = true;
        }
        b0(this.f13742o0, z12, z10);
        if (!this.f13705b2 && this.P1 != -1 && this.f13720g0 == 0 && this.Z1 != null && !this.J0.f13878e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.F0, z13, z10);
        if (!this.f13705b2 && this.P1 != -1 && this.f13720g0 == 0 && (y9Var = this.C0) != null && y9Var.f12429a && !this.J0.f13878e && !this.B0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.G0, z14, z10);
        if (!this.f13705b2 && this.P1 != -1 && this.f13720g0 == 0 && !this.J0.f13878e) {
            z15 = true;
        } else {
            z15 = false;
        }
        b0(this.H0, z15, z10);
        b0(this.I0, this.J0.f13878e, z10);
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.P0.e(z10, f10);
        boolean z18 = this.J0.f13878e;
        l3 l3Var = this.f13743o1;
        if (z18) {
            l3Var.w();
        } else {
            l3Var.f(true);
        }
        g(this.f13705b2, z10);
        if (this.P1 == -1 && this.f13720g0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        org.telegram.messenger.g0.V3(this.T0, z16, true);
        if (this.P1 == -1 && this.f13720g0 == 0) {
            z17 = true;
        }
        org.telegram.messenger.g0.V3(this.S0, z17, true);
    }

    public final void m0() {
        this.I0.setTranslationX(-0.0f);
        float alpha = (this.I0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f;
        this.G0.setTranslationX(-alpha);
        float alpha2 = (this.G0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha;
        this.H0.setTranslationX(-alpha2);
        float alpha3 = (this.H0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha2;
        this.F0.setTranslationX(-alpha3);
        float alpha4 = this.F0.getAlpha();
        this.f13742o0.setTranslationX(0.0f);
        float alpha5 = this.f13742o0.getAlpha();
        float L = (alpha4 * org.telegram.messenger.g0.L(46.0f)) + alpha3 + org.telegram.messenger.g0.L(8.0f);
        v vVar = this.J0.f13875a;
        vVar.setPadding((int) ((alpha5 * org.telegram.messenger.g0.L(46.0f)) + 0.0f + org.telegram.messenger.g0.L(8.0f)), 0, (int) L, 0);
        vVar.invalidate();
    }

    public final void n() {
        boolean z10;
        if (this.L == 0.0f && this.J >= 1.0f && !this.C2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.B2) {
            return;
        }
        cg.u0 u0Var = this.E;
        if (u0Var != null) {
            u0Var.c(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        int i3;
        ch0 ch0Var = this.f13727i1;
        if (ch0Var != null) {
            int[] iArr = ch0Var.f32725e;
            int i10 = 0;
            if (z10) {
                f7 f7Var = this.L1;
                if (f7Var != null && f7Var.f12752y0) {
                    i10 = iArr[0];
                }
                ch0Var.P(i10);
                ch0 ch0Var2 = this.f13727i1;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                    return;
                }
                return;
            }
            f7 f7Var2 = this.L1;
            if (f7Var2 != null && f7Var2.f12752y0) {
                i3 = iArr[0] - 1;
            } else {
                i3 = 0;
            }
            ch0Var.N(i3, false, true);
            this.f13727i1.P(i3);
            ImageView imageView = this.f13730j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f13764u2 < 0) {
            this.f13764u2 = hp.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f13767v2 = arrayList;
            arrayList.add("off");
            this.f13767v2.add("auto");
            this.f13767v2.add("on");
            float f10 = hp.e1().getFloat("frontflash_warmth", 0.9f);
            n2 n2Var = this.f13755s;
            n2Var.f13292o = f10;
            n2Var.f13291n = n2.f(f10);
            n2Var.g();
            float f11 = hp.e1().getFloat("frontflash_intensity", 1.0f);
            n2 n2Var2 = this.f13755s;
            n2Var2.f13293p = f11;
            n2Var2.i();
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        v8 v8Var = new v8(this, 2);
        x9 x9Var = this.f13770w1;
        f7 f7Var = this.L1;
        if (x9Var != null && f7Var != null) {
            f7Var.f();
            boolean r02 = x9Var.r0();
            boolean z10 = x9Var.f13239y0.getPainting().E;
            Utilities.f21389g.c(new y8(this, x9Var, f7Var.f12722i0, f7Var.f12724j0, f7Var, z10, r02, v8Var, 1));
            return;
        }
        v8Var.run();
    }

    public final void p(boolean z10) {
        ja jaVar;
        if (this.d) {
            t8 t8Var = this.f13752r0;
            if (t8Var != null) {
                t8Var.dismiss();
                this.f13752r0 = null;
            }
            f7 f7Var = this.L1;
            long j10 = 0;
            if (f7Var != null && !f7Var.h) {
                if ((this.f13768w && f7Var.f12718g) || f7Var.f12705b != 0) {
                    f7Var.f12723j = false;
                }
                f7Var.i(false);
            }
            this.L1 = null;
            r10 r10Var = this.S;
            if (r10Var != null && (jaVar = this.Y0) != null) {
                if (this.f13712e) {
                    return;
                }
                this.f13712e = true;
                m51 m51Var = jaVar.E;
                if (m51Var != null) {
                    m51Var.g0();
                    jaVar.E.m0();
                    jaVar.E = null;
                }
                m51 m51Var2 = jaVar.f13969y;
                if (m51Var2 != null) {
                    j10 = m51Var2.S();
                    jaVar.f13969y.g0();
                    jaVar.f13969y.m0();
                    jaVar.f13969y = null;
                }
                m51 m51Var3 = jaVar.f13943e;
                if (m51Var3 != null) {
                    j10 = m51Var3.S();
                    jaVar.f13943e.g0();
                    jaVar.f13943e.m0();
                    jaVar.f13943e = null;
                }
                r10Var.a(Long.valueOf(j10), new f9(this, z10, 2), Boolean.valueOf(this.f13768w), Long.valueOf(this.f13772x));
                return;
            }
            ja jaVar2 = this.Y0;
            if (jaVar2 != null && !z10) {
                jaVar2.set(null);
            }
            f(0.0f, z10, new v8(this, 23));
            int i3 = this.K;
            if (i3 == 1 || i3 == 0) {
                this.f13738n.setBackgroundColor(0);
                this.f13708c1.b(false, true);
            }
            hs.e().n(this, hs.f23295r2);
            int i10 = this.f13706c;
            hs.f(i10).n(this, hs.f23345y5);
            hs.f(i10).n(this, hs.f23205b3);
        }
    }

    public final boolean p0() {
        y9 y9Var;
        if ((this.Q1 || this.R1) && (y9Var = this.C0) != null && y9Var.isFrontface()) {
            int i3 = this.f13764u2;
            if (i3 == 2 || (i3 == 1 && this.f13711d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f13702b;
        if (this.C0 == null && activity != null) {
            this.C0 = new y9(this, activity, hp.e1().getBoolean("stories_camera", false));
            h6 h6Var = this.P0;
            float f10 = 0.0f;
            if (h6Var != null) {
                h6Var.f12895h0 = 0.0f;
                h6Var.f12896i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.j();
            this.C0.setThumbDrawable(z());
            this.C0.initTexture();
            this.C0.setDelegate(new e9(this, 0));
            hb hbVar = this.G0;
            if (this.C0.f12429a && this.f13720g0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(hbVar, z10, true);
            z zVar = this.H0;
            if (!this.C0.f12429a) {
                f10 = org.telegram.messenger.g0.L(46.0f);
            }
            zVar.setTranslationX(f10);
            this.B0.setCameraView(this.C0);
            if (hp.e1().getInt("storyhint2", 0) < 1) {
                this.X0.w();
                hp.e1().edit().putInt("storyhint2", hp.e1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!b1.q(this.C0.getContext()) || !hp.e1().getBoolean("dualcam", b1.p(org.telegram.messenger.t0.f25457b, false))) && this.C0.f12429a && hp.e1().getInt("storydualhint", 0) < 2) {
                this.m1.w();
            }
            if (this.D0 == null) {
                this.D0 = new c6(activity, new w8(this, 3));
            }
            this.D0.a(this.C0);
            r6 r6Var = this.E0;
            if (r6Var != null) {
                ia iaVar = this.B0;
                Object blurRenderNode = iaVar.getBlurRenderNode();
                r6Var.G = iaVar;
                r6Var.H = blurRenderNode;
                r6Var.invalidate();
            }
        }
    }

    public final void r() {
        f7 f7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.C1 == null && (f7Var = this.L1) != null) {
            ze zeVar = null;
            if (!f7Var.K) {
                if (f7Var.Z0 == null) {
                    q10 = this.Y0.getPhotoBitmap();
                } else {
                    e9 e9Var = new e9(this, 10);
                    Point point = org.telegram.messenger.g0.f22608q;
                    q10 = f7.q(e9Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                b51 textureView = this.Y0.getTextureView();
                int orientation = this.Y0.getOrientation();
                f7 f7Var2 = this.L1;
                if (f7Var2 != null) {
                    zeVar = f7Var2.f12704a1;
                }
                nd0 nd0Var = new nd0(this.f13702b, textureView, bitmap, null, orientation, zeVar, null, 0, false, false, this.f13756s0, this.f13698a);
                this.C1 = nd0Var;
                this.f13751r.addView(nd0Var);
                md0 md0Var = this.D1;
                if (md0Var != null) {
                    md0Var.setFilterView(this.C1);
                }
                TextureView myTextureView = this.C1.getMyTextureView();
                this.E1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.Y0.o(this.E1, this.C1);
                TextureView textureView2 = this.E1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.E1.animate().alpha(1.0f).setDuration(220L).start();
                }
                i();
                ed0 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                if (blurControl != null) {
                    this.f13726i0.addView(blurControl);
                }
                gd0 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    this.f13726i0.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new x8(this, 13));
                this.C1.getCancelTextView().setOnClickListener(new x8(this, 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
                this.C1.f36471j0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.N0 != null) {
            ia iaVar = this.B0;
            if (iaVar != null && iaVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.N0.Q) {
                return;
            }
        }
        if (this.f13702b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        pe peVar = this.f13741n2;
        boolean z13 = !z10;
        ia iaVar2 = this.B0;
        if (iaVar2 != null && iaVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        g3 g3Var = new g3(this, this.f13706c, this.f13702b, this.f13698a, peVar, z10, z13, z11);
        this.N0 = g3Var;
        g3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, t.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new n9(this, 1));
        this.N0.setOnSelectListener(new m9(0, this, z10));
        this.N0.setOnSelectMultipleListener(new ci.y1(this, 2));
        u4.a0 a0Var = this.f13737m2;
        if (a0Var != null) {
            fi.g gVar = this.N0.f12566e;
            gVar.B = a0Var;
            gVar.l0();
        }
        this.f13738n.addView(this.N0, mf.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: gi.va.t():void");
    }

    public final void u(boolean z10) {
        c6 c6Var = this.D0;
        if (c6Var != null) {
            c6Var.f12496f = null;
            Utilities.f21387e.a(c6Var.h);
            this.D0 = null;
            ia iaVar = this.B0;
            if (iaVar != null) {
                iaVar.f12621c.a(null);
            }
        }
        r6 r6Var = this.E0;
        if (r6Var != null) {
            r6Var.G = null;
            r6Var.H = null;
            r6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new v8(this, 8));
                return;
            }
            a0(new v8(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            ia iaVar2 = this.B0;
            if (iaVar2 != null) {
                iaVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void v() {
        g3 g3Var = this.N0;
        if (g3Var == null) {
            return;
        }
        this.f13738n.removeView(g3Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.f13744o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13744o2 = null;
        }
        q1.g gVar = this.f13747p2;
        if (gVar != null) {
            gVar.d();
            this.f13747p2 = null;
        }
        this.f13750q2 = null;
    }

    public final void x() {
        nd0 nd0Var = this.C1;
        if (nd0Var == null) {
            return;
        }
        nd0Var.b();
        this.D1.setFilterView(null);
        this.f13751r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.f13726i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        ed0 ed0Var = this.F1;
        if (ed0Var != null) {
            this.f13726i0.removeView(ed0Var);
            this.F1 = null;
        }
        gd0 gd0Var = this.G1;
        if (gd0Var != null) {
            this.f13726i0.removeView(gd0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        x9 x9Var = this.f13770w1;
        if (x9Var != null) {
            x9Var.B0.removeAllViews();
            x9 x9Var2 = this.f13770w1;
            x9Var2.f13239y0.h();
            x9Var2.B0.setVisibility(8);
            x9Var2.A0.setVisibility(8);
            x9Var2.f13219o0.postRunnable(new ai.y1(15));
            a5 a5Var = x9Var2.U1;
            if (a5Var != null) {
                a5Var.dismiss();
            }
            tg.q qVar = x9Var2.D1;
            if (qVar != null) {
                qVar.dismiss();
            }
            this.f13751r.removeView(this.f13770w1);
            this.f13770w1 = null;
            tg.u0 u0Var = this.f13774x1;
            if (u0Var != null) {
                this.f13726i0.removeView(u0Var);
                this.f13774x1 = null;
            }
            View view = this.f13781z1;
            if (view != null) {
                this.f13726i0.removeView(view);
                this.f13781z1 = null;
            }
            View view2 = this.f13778y1;
            if (view2 != null) {
                this.f13726i0.removeView(view2);
                this.f13778y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                this.f13726i0.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                this.f13726i0.removeView(view4);
                this.B1 = null;
            }
        }
    }

    public final Drawable z() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.f13702b.getResources().getDrawable(2131231492);
    }
}
