package defpackage;

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
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class t7b implements gk7 {
    public static t7b G2;
    public fk2 A0;
    public View A1;
    public boolean A2;
    public final h7b B0;
    public View B1;
    public boolean B2;
    public y6b C0;
    public l58 C1;
    public boolean C2;
    public dv8 D0;
    public final k58 D1;
    public d7b D2;
    public final a06 E;
    public final lq9 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final mpb F0;
    public c58 F1;
    public ValueAnimator F2;
    public o7b G;
    public final npb G0;
    public e58 G1;
    public float H;
    public final kk2 H0;
    public File H1;
    public final RectF I;
    public final mpb I0;
    public ArrayList I1;
    public float J;
    public final jk2 J0;
    public ArrayList J1;
    public boolean K;
    public final tcc K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public f4b L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public vr4 N0;
    public long N1;
    public long O;
    public eq3 O0;
    public boolean O1;
    public boolean P;
    public final f29 P0;
    public int P1;
    public final on Q;
    public final u41 Q0;
    public boolean Q1;
    public Runnable R;
    public final q6b R0;
    public boolean R1;
    public m8c S;
    public final ki4 S0;
    public boolean S1;
    public int T;
    public final ki4 T0;
    public boolean T1;
    public int U;
    public final ge5 U0;
    public float U1;
    public int V;
    public final ge5 V0;
    public int V1;
    public boolean W;
    public final azc W0;
    public boolean W1;
    public boolean X;
    public final je5 X0;
    public boolean X1;
    public boolean Y;
    public final i7b Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final f53 a;
    public int a0;
    public final kob a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final kcc b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final vi8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final j7b d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final p6b e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final op3 f1;
    public Runnable f2;
    public byte g0;
    public oy8 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final ry8 h1;
    public a5b h2;
    public final g7b i0;
    public oy8 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final s71 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final je5 l1;
    public boolean l2;
    public final oc6 m0;
    public final je5 m1;
    public s26 m2;
    public final s7b n;
    public final FrameLayout n0;
    public final je5 n1;
    public xl6 n2;
    public final ki4 o0;
    public final je5 o1;
    public ValueAnimator o2;
    public final oy9 p0;
    public final wi8 p1;
    public yla p2;
    public final jia q0;
    public final k1c q1;
    public Boolean q2;
    public final l7b r;
    public y5b r0;
    public pb1 r1;
    public l6b r2;
    public final mi4 s;
    public final sl0 s0;
    public e7b s1;
    public AnimatorSet s2;
    public final n00 t0;
    public f7b t1;
    public boolean t2;
    public final si9 u0;
    public final kob u1;
    public int u2;
    public boolean v0;
    public final u41 v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public x6b w1;
    public p7b w2;
    public long x;
    public String x0;
    public c79 x1;
    public boolean x2;
    public k7b y;
    public TLRPC.InputPeer y0;
    public View y1;
    public d6b y2;
    public w5b z0;
    public View z1;
    public sm3 z2;

    public t7b(Activity activity, int i) {
        f53 f53Var = new f53();
        this.a = f53Var;
        this.x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new on(null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        this.g0 = (byte) 0;
        this.h0 = -1;
        this.z0 = new w5b();
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
        t6b t6bVar = new t6b(this);
        this.e2 = true;
        this.l2 = true;
        this.u2 = -1;
        this.b = activity;
        this.c = i;
        this.E = LaunchActivity.c0();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        gl.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        s7b s7bVar = new s7b(this, activity);
        this.n = s7bVar;
        k6b k6bVar = new k6b(this, (byte) 1);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(s7bVar, k6bVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        mi4 mi4Var = new mi4(activity, windowManager, this.n, layoutParams);
        this.s = mi4Var;
        mi4Var.a(new b7b(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        s7b s7bVar2 = this.n;
        l7b l7bVar = new l7b(this, activity);
        this.r = l7bVar;
        s7bVar2.addView(l7bVar);
        l7b l7bVar2 = this.r;
        g7b g7bVar = new g7b(this, activity);
        this.i0 = g7bVar;
        l7bVar2.addView(g7bVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new sl0(this.i0);
        this.t0 = new Object();
        l7b l7bVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        l7bVar3.addView(frameLayout);
        l7b l7bVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        l7bVar4.addView(frameLayout2);
        l7b l7bVar5 = this.r;
        oc6 oc6Var = new oc6((byte) 29, activity, this);
        this.m0 = oc6Var;
        l7bVar5.addView(oc6Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        l7b l7bVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        l7bVar6.addView(frameLayout3);
        m21.a(this.n, new oy((byte) 15));
        h7b h7bVar = new h7b(this, activity, this.s0, this.r, f53Var);
        this.B0 = h7bVar;
        s7b s7bVar3 = this.n;
        Objects.requireNonNull(s7bVar3);
        h7bVar.setCancelGestures(new kya(s7bVar3, (byte) 16));
        this.B0.setResetState(new d6b(this, (byte) 13));
        this.i0.addView(this.B0, nme.e(-1, -1, 119));
        this.B0.setOnClickListener(new f6b(this, (byte) 12));
        g7b g7bVar2 = this.i0;
        boolean z = this.K;
        g7bVar2.setBackgroundColor((z || !z) ? 0 : -14737633);
        g7b g7bVar3 = this.i0;
        xi xiVar = zdc.a;
        g7bVar3.setOutlineProvider(new xdc(0, gl.L(12.0f)));
        this.i0.setClipToOutline(true);
        d6b d6bVar = new d6b(this, (byte) 14);
        ?? view = new View(activity);
        view.a = new TextPaint(1);
        view.b = new TextPaint(1);
        s33 s33Var = s33.h;
        view.s = new lm((View) view, 0L, 350L, s33Var);
        view.J = new oq7(view, (byte) 21);
        view.y = d6bVar;
        this.D1 = view;
        i7b i7bVar = new i7b(this, activity, this.s0, this.t0);
        this.Y0 = i7bVar;
        i7bVar.setCollageView(this.B0);
        i7b i7bVar2 = this.Y0;
        i7bVar2.w = new d6b(this, (byte) 15);
        i7bVar2.setOnTapListener(new d6b(this, (byte) 16));
        this.Y0.setVisibility(8);
        i7b i7bVar3 = this.Y0;
        i7bVar3.O = new d6b(this, (byte) 17);
        this.i0.addView(i7bVar3, nme.e(-1, -1, 119));
        this.i0.addView(this.D1, nme.e(-1, -1, 119));
        s7b s7bVar4 = this.n;
        j7b j7bVar = new j7b(this, activity, s7bVar4, s7bVar4, this.r, f53Var, this.s0);
        this.d1 = j7bVar;
        j7bVar.setAccount(i);
        this.d1.setUiBlurBitmap(new v0b((byte) 2));
        m21.a(this.m0, new s10(this, (byte) 20));
        this.d1.setOnHeightUpdate(new e6b(this, (byte) 14));
        this.d1.setOnPeriodUpdate(new e6b(this, (byte) 5));
        long j = this.O;
        if (j != 0) {
            this.d1.setDialogId(j);
        }
        this.d1.setOnPremiumHint(new e6b(this, (byte) 6));
        this.d1.setOnKeyboardOpen(new e6b(this, (byte) 7));
        si9 si9Var = new si9((byte) 11, activity, this);
        this.u0 = si9Var;
        this.r.addView(si9Var);
        kob kobVar = new kob(activity, this.r, this.i0, f53Var, this.s0);
        this.a1 = kobVar;
        kobVar.setOnTimelineClick(new d6b(this, (byte) 10));
        this.a1.setOnHeightChange(new d6b(this, (byte) 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        frameLayout4.addView(this.a1, nme.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kcc kccVar = new kcc(activity);
        this.b1 = kccVar;
        kccVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, nme.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, nme.d(-1, 413.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, nme.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        kob kobVar2 = new kob(activity, this.r, this.i0, f53Var, this.s0);
        this.u1 = kobVar2;
        kobVar2.Y0 = true;
        kobVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, nme.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        p6b p6bVar = new p6b(this, activity, f53Var, this.s0);
        this.e1 = p6bVar;
        p6bVar.setVisibility(8);
        this.m0.addView(this.e1, nme.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.o0 = imageView;
        imageView.setContentDescription(k96.M0(2131754878, null));
        ki4 ki4Var = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ki4Var.setScaleType(scaleType);
        this.o0.setImageResource(2131232282);
        ki4 ki4Var2 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ki4Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(bkb.f0(553648127, 1, -1));
        this.o0.setOnClickListener(new f6b(this, (byte) 1));
        this.j0.addView(this.o0, nme.e(56, 56, 51));
        this.s.a(this.o0);
        oy9 oy9Var = new oy9(activity, i);
        this.p0 = oy9Var;
        oy9Var.a(false, false);
        this.p0.setOnClickListener(new b99(this, activity, (byte) 23));
        this.j0.addView(this.p0, nme.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        jia jiaVar = new jia(activity);
        this.q0 = jiaVar;
        jiaVar.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(gl.o());
        this.q0.l(k96.M0(2131746160, null), false);
        this.q0.getPaint().setShadowLayer(gl.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(gl.L(144.0f));
        this.j0.addView(this.q0, nme.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, nme.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        e6b e6bVar = new e6b(this, (byte) 8);
        s7b s7bVar5 = this.n;
        ?? imageView2 = new ImageView(activity);
        imageView2.x = true;
        imageView2.y = true;
        imageView2.h = e6bVar;
        imageView2.a = i;
        imageView2.b = s7bVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(bkb.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new yj3(imageView2, (byte) 2));
        imageView2.f = new ih2(gl.L(18.0f), gl.L(2.0f), -1);
        imageView2.d();
        this.f1 = imageView2;
        je5 je5Var = new je5(activity, 1);
        je5Var.n(1.0f, -71.0f);
        je5Var.d = 2000L;
        je5Var.V = false;
        je5Var.I.r(true, false);
        this.l1 = je5Var;
        je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        this.j0.addView(this.l1, nme.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.h1 = imageView3;
        imageView3.setScaleType(scaleType);
        ry8 ry8Var = this.h1;
        f4b f4bVar = this.L1;
        ry8Var.setImageResource((f4bVar == null || !f4bVar.Y) ? 2131231754 : 2131231763);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(bkb.f0(553648127, 1, -1));
        this.h1.setOnClickListener(new f6b(this, (byte) 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        s71 s71Var = new s71(activity, (byte) 17);
        this.k1 = s71Var;
        s71Var.setBackground(bkb.f0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new f6b(this, (byte) 3));
        this.k0.addView(this.k1, nme.r(46, 56, 53));
        this.k0.addView(this.h1, nme.r(46, 56, 53));
        this.k0.addView(this.f1, nme.e(46, 56, 53));
        mpb mpbVar = new mpb(activity);
        this.F0 = mpbVar;
        mpbVar.setBackground(bkb.f0(553648127, 1, -1));
        this.F0.setOnClickListener(new f6b(this, (byte) 4));
        this.F0.setOnLongClickListener(new zs(this, (byte) 18));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, nme.e(56, 56, 53));
        npb npbVar = new npb(activity);
        this.G0 = npbVar;
        npbVar.setContentDescription(k96.M0(2131754886, null));
        this.G0.setOnClickListener(new f6b(this, (byte) 5));
        boolean o = ir3.o(activity);
        this.G0.setVisibility(o ? 0 : 8);
        this.G0.setAlpha(o ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, nme.e(56, 56, 53));
        ?? mpbVar2 = new mpb(activity);
        this.H0 = mpbVar2;
        mpbVar2.setContentDescription(k96.M0(2131754895, null));
        this.H0.setBackground(bkb.f0(553648127, 1, -1));
        if (this.A0 == null) {
            this.A0 = (fk2) fk2.a().get(6);
        }
        this.H0.setOnClickListener(new f6b(this, (byte) 6));
        this.H0.a(new gk2(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, nme.e(56, 56, 53));
        mpb mpbVar3 = new mpb(activity);
        this.I0 = mpbVar3;
        mpbVar3.setContentDescription(k96.M0(2131754894, null));
        this.I0.setBackground(bkb.f0(553648127, 1, -1));
        this.I0.a(new gk2(new fk2("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new f6b(this, (byte) 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, nme.e(56, 56, 53));
        jk2 jk2Var = new jk2(activity, this.s);
        this.J0 = jk2Var;
        jk2Var.a.w0(6);
        this.J0.setSelected((fk2) null);
        this.J0.setOnLayoutClick(new e6b(this, (byte) 9));
        this.j0.addView(this.J0, nme.e(-1, 56, 53));
        je5 je5Var2 = new je5(activity, 1);
        je5Var2.n(1.0f, -20.0f);
        je5Var2.d = 5000L;
        je5Var2.j(true);
        je5Var2.t(k96.M0(2131744476, null));
        je5Var2.r0 = new cza((byte) 1);
        this.m1 = je5Var2;
        je5Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        this.j0.addView(this.m1, nme.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        je5 je5Var3 = new je5(activity, 2);
        je5Var3.n(0.0f, 28.0f);
        je5Var3.d = 5000L;
        je5Var3.p(true);
        this.n1 = je5Var3;
        this.j0.addView(je5Var3, nme.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        je5 je5Var4 = new je5(activity, 1);
        je5Var4.n(1.0f, -20.0f);
        je5Var4.d = 5000L;
        je5Var4.t(k96.M0(2131744464, null));
        this.o1 = je5Var4;
        je5Var4.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        this.j0.addView(this.o1, nme.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.a = paint;
        Paint paint2 = new Paint(1);
        view2.b = paint2;
        view2.e = new lm((View) view2, 0L, 250L, s33Var);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        gn gnVar = new gn(false, true, true);
        view2.c = gnVar;
        gnVar.n(0.3f, 250L, s33Var);
        gnVar.w(gl.L(13.0f));
        gnVar.u(-1);
        gnVar.x(gl.o());
        gnVar.setCallback(view2);
        gnVar.b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.j0.addView(this.K0, nme.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.N(0);
        f29 f29Var = new f29(activity);
        this.P0 = f29Var;
        f29Var.setDelegate(t6bVar);
        f29 f29Var2 = this.P0;
        boolean z2 = this.P1 == 1;
        f29Var2.o0 = -1.0f;
        f29Var2.p0 = z2;
        f29Var2.invalidate();
        this.l0.addView(this.P0, nme.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.i() ? this.B0.getFilledProgress() : 0.0f);
        u41 u41Var = new u41(f53Var, activity, true);
        this.Q0 = u41Var;
        u41Var.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(k96.M0(2131748596, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, nme.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new f6b(this, (byte) 8));
        je5 je5Var5 = new je5(activity, 3);
        je5Var5.p(true);
        je5Var5.t(k96.M0(2131744474, null));
        je5Var5.h = gl.L(320.0f);
        je5Var5.d = 5000L;
        je5Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = je5Var5;
        this.l0.addView(je5Var5, nme.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        azc azcVar = new azc(activity);
        this.W0 = azcVar;
        azcVar.N = false;
        azcVar.setAlpha(0.0f);
        this.l0.addView(this.W0, nme.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new k6b(this, (byte) 4));
        azc azcVar2 = this.W0;
        this.U1 = 0.0f;
        azcVar2.b(false, 0.0f);
        lq9 lq9Var = new lq9(activity, i, new d6b(this, (byte) 12));
        this.E0 = lq9Var;
        lq9Var.c = new e6b(this, (byte) 10);
        this.l0.addView(lq9Var, nme.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        q6b q6bVar = new q6b(this, activity);
        this.R0 = q6bVar;
        q6bVar.setOnSwitchModeListener(new e6b(this, (byte) 11));
        this.R0.setOnSwitchingModeListener(new e6b(this, (byte) 12));
        this.n0.addView(this.R0, nme.e(-1, 48, 55));
        this.s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(k96.M0(2131754751, null));
        this.S0.setImageResource(2131232772);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(bkb.f0(553648127, 1, -1));
        this.n0.addView(this.S0, nme.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new f6b(this, (byte) 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(k96.M0(2131748598, null));
        this.T0.setImageResource(2131232773);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(bkb.f0(553648127, 1, -1));
        this.n0.addView(this.T0, nme.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new f6b(this, (byte) 10));
        ge5 ge5Var = new ge5(activity);
        this.U0 = ge5Var;
        this.n0.addView(ge5Var, nme.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        ge5 ge5Var2 = new ge5(activity);
        this.V0 = ge5Var2;
        ge5Var2.a.t(k96.M0(2131744463, null), false, true);
        ge5Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, nme.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        u41 u41Var2 = new u41(f53Var, activity, true);
        u41Var2.setRoundRadius(24);
        this.v1 = u41Var2;
        u41Var2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(k96.M0(2131744449, null), false, true);
        this.v1.setOnClickListener(new f6b(this, (byte) 11));
        this.n0.addView(this.v1, nme.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, nme.e(-1, -1, 119));
        frameLayout5.a(0, 2131231743, k96.M0(2131754813, null));
        frameLayout5.a(2, 2131232289, k96.M0(2131754755, null));
        frameLayout5.a(1, 2131232291, k96.M0(2131754806, null));
        frameLayout5.a(3, 2131231733, k96.M0(2131751687, null));
        frameLayout5.a(4, 2131232288, k96.M0(2131754810, null));
        String M0 = k96.M0(2131745448, null);
        frameLayout5.d = M0;
        frameLayout5.e = true;
        ui8 ui8Var = new ui8(frameLayout5, activity, M0, true);
        frameLayout5.c = ui8Var;
        ui8Var.setContentDescription(k96.M0(2131745448, null));
        frameLayout5.addView(frameLayout5.c, nme.c(-2.0f, -2));
        frameLayout5.e();
        this.c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.c1.setOnClickListener(new e6b(this, (byte) 13));
        this.n0.addView(this.c1, nme.e(-1, 52, 23));
        k1c k1cVar = new k1c(activity);
        this.q1 = k1cVar;
        k1cVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, nme.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        wi8 wi8Var = new wi8(activity, i, f53Var);
        this.p1 = wi8Var;
        this.i0.addView(wi8Var, nme.e(-1, -1, 119));
        l0(false);
    }

    public static t7b C(Activity activity, int i) {
        t7b t7bVar = G2;
        if (t7bVar != null && (t7bVar.b != activity || t7bVar.c != i)) {
            t7bVar.o(false);
            t7bVar = null;
            G2 = null;
        }
        if (t7bVar == null) {
            t7b t7bVar2 = new t7b(activity, i);
            G2 = t7bVar2;
            return t7bVar2;
        }
        return t7bVar;
    }

    public static SpannableString k(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable d = b00.d(context, 2131232770);
        int L = gl.L(35.0f);
        int i = -L;
        d.setBounds(i / 4, i, (L / 4) * 3, 0);
        spannableString.setSpan(new c7b(d, d), 0, 1, 33);
        return spannableString;
    }

    public static void v() {
        t7b t7bVar = G2;
        if (t7bVar != null) {
            t7bVar.o(false);
        }
        G2 = null;
    }

    public final String A() {
        y6b y6bVar = this.C0;
        if (y6bVar != null && y6bVar.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                m();
                return (String) this.v2.get(this.u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final eq3 B() {
        if (this.O0 == null) {
            eq3 eq3Var = new eq3(this.b);
            this.O0 = eq3Var;
            this.l0.addView(eq3Var, nme.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String D() {
        int i;
        y6b y6bVar = this.C0;
        if (y6bVar != null && y6bVar.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                m();
                ArrayList arrayList = this.v2;
                if (this.u2 + 1 >= arrayList.size()) {
                    i = 0;
                } else {
                    i = this.u2 + 1;
                }
                return (String) arrayList.get(i);
            }
            return this.C0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView E() {
        if (this.j1 == null) {
            oy8 oy8Var = new oy8(2131624236, gl.L(28.0f), gl.L(28.0f), true, null);
            this.i1 = oy8Var;
            oy8Var.h = true;
            f4b f4bVar = this.L1;
            if (f4bVar != null && f4bVar.y0) {
                oy8Var.H(35);
                this.i1.K(36);
            } else {
                oy8Var.K(0);
                this.i1.H(0);
            }
            this.i1.a0 = true;
            int v0 = bkb.v0(bkb.I9, this.a);
            this.i1.L(v0, "Sunny");
            this.i1.L(v0, "Path 6");
            this.i1.L(v0, "Path");
            this.i1.L(v0, "Path 5");
            this.i1.j();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(bkb.f0(553648127, 1, -1));
            this.j1.setOnClickListener(new f6b(this, (byte) 0));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, nme.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void F() {
        x6b x6bVar = this.w1;
        if (x6bVar == null) {
            return;
        }
        this.w2 = null;
        x6bVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-gl.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(gl.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-gl.L(32.0f));
        this.w1.setVisibility(8);
    }

    public final boolean G() {
        float f;
        if (this.B0.i()) {
            f = this.B0.getFilledProgress();
        } else {
            f = 0.0f;
        }
        if (!this.b2 && f >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        vr4 vr4Var;
        if (!this.X && (vr4Var = this.N0) != null) {
            if (vr4Var.getTranslationY() < (this.n.getMeasuredHeight() - ((int) (gl.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + gl.m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void I(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.I(int, boolean):void");
    }

    public final void J(Runnable runnable, long j) {
        if (!this.T1 && this.L1 != null) {
            a5b a5bVar = this.h2;
            if (a5bVar != null) {
                gl.r(a5bVar);
            }
            this.i2 = true;
            this.T1 = true;
            this.h2 = new a5b(this, runnable, (byte) 2);
            i7b i7bVar = this.Y0;
            i7bVar.setAlpha(0.0f);
            i7bVar.setVisibility(0);
            i7bVar.n(this.L1, this.h2, j);
            i7bVar.q(this.L1, false);
            gl.e3(this.h2, 800L);
        }
    }

    public final boolean K() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.K():boolean");
    }

    public final void L(int i, int i2) {
        long j;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        f29 f29Var = this.P0;
        int i9 = 8;
        if (i == 0) {
            t(false);
            f29Var.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            e(false, false);
            c0(false);
        }
        j7b j7bVar = this.d1;
        oc6 oc6Var = this.m0;
        if (i == 2) {
            this.u1.setVisibility(8);
            if (i2 == 1) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            oc6Var.setVisibility(i8);
            j7bVar.setVisibility(8);
            this.v1.setVisibility(8);
        }
        kcc kccVar = this.b1;
        i7b i7bVar = this.Y0;
        if (i == 1) {
            this.c1.setVisibility(8);
            if (i2 == 2) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            oc6Var.setVisibility(i5);
            this.h1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setVisibility(8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i2 == 2) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            i7bVar.setVisibility(i6);
            this.a1.setVisibility(8);
            if (i2 != 2) {
                x();
                w();
            }
            if (i2 == 2) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.q0.setVisibility(i7);
            u();
            k1c k1cVar = this.q1;
            k1cVar.setAlpha(0.0f);
            k1cVar.setVisibility(8);
            kccVar.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        k58 k58Var = this.D1;
        if (i2 == 1) {
            f4b f4bVar = this.L1;
            if (f4bVar == null || !f4bVar.n) {
                s();
                F();
            }
            if (k58Var != null) {
                k58Var.setAllowTouch(false);
            }
            i7bVar.x(2, false);
            i7bVar.x(3, false);
            i7bVar.x(4, false);
            i7bVar.x(5, false);
            i7bVar.x(7, false);
            f4b f4bVar2 = this.L1;
            j = 0;
            if (f4bVar2 != null && f4bVar2.h0 >= 30000) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            kccVar.setVisibility(i4);
            oc6Var.setAlpha(1.0f);
            oc6Var.setTranslationY(0.0f);
            f4b f4bVar3 = this.L1;
            if (f4bVar3 == null || f4bVar3.J0 == 0) {
                i9 = 0;
            }
            j7bVar.setVisibility(i9);
        } else {
            j = 0;
        }
        if (i2 == 0 && this.W1) {
            B().setVisibility(0);
            eq3 B = B();
            B.r.e(true, 0.0f);
            B.a(true);
            li3 li3Var = B.h;
            if (li3Var != null) {
                gl.r(li3Var);
            }
            li3 li3Var2 = new li3(B, (byte) 11);
            B.h = li3Var2;
            gl.e3(li3Var2, 3500L);
            f29Var.h();
        }
        this.W1 = false;
        if (k58Var != null) {
            if (i2 == 1 && ((i3 = this.h0) == -1 || i3 == 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            k58Var.setAllowTouch(z2);
        }
        if (j7bVar != null) {
            if (i2 != 1) {
                z = true;
            } else {
                z = false;
            }
            j7bVar.e0 = z;
        }
        if (i2 == 1) {
            int i10 = this.c;
            hq6.d0(i10).D(0);
            hq6.d0(i10).X0(false, true, false, 0);
            hq6.d0(i10).X0(false, true, false, 2);
            g2b M1 = na7.q1(i10).M1();
            if (M1.Q == j) {
                M1.R();
            }
            na7.q1(i10).M1().T();
        }
    }

    public final void M(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.M(int, int):void");
    }

    public final void N() {
        this.d = true;
        this.w = false;
        if (this.K) {
            g7b g7bVar = this.i0;
            g7bVar.setAlpha(1.0f);
            g7bVar.setTranslationX(0.0f);
            g7bVar.setTranslationY(0.0f);
            this.j0.setAlpha(1.0f);
            this.l0.setAlpha(1.0f);
            this.n.setBackgroundColor(-16777216);
            if (this.g0 == 2) {
                this.v1.setAlpha(1.0f);
            }
        }
        d6b d6bVar = this.y2;
        if (d6bVar != null) {
            d6bVar.run();
            this.y2 = null;
        } else {
            O();
        }
        f4b f4bVar = this.L1;
        if (f4bVar != null) {
            if (f4bVar.n) {
                s();
                F();
                q();
            } else if (f4bVar.u) {
                if (f4bVar.K) {
                    this.Y0.t(f4bVar, null, 0L);
                }
                q();
            }
        }
    }

    public final void O() {
        a79 a79Var;
        int i;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.y2 = new d6b(this, (byte) 3);
            } else {
                Z(false);
            }
        }
        j7b j7bVar = this.d1;
        if (j7bVar != null) {
            j7bVar.f.s();
        }
        f29 f29Var = this.P0;
        if (f29Var != null) {
            f29Var.h();
        }
        wi8 wi8Var = this.p1;
        if (wi8Var != null) {
            g2b M1 = na7.q1(wi8Var.a).M1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) M1.i.f(y6c.h(M1.a).n);
            if (peerStories != null) {
                i = peerStories.stories.size();
            } else {
                i = 0;
            }
            wi8Var.b = M1.b.m() + i + 1;
            wi8Var.c.invalidate();
        }
        x6b x6bVar = this.w1;
        if (x6bVar != null && (a79Var = x6bVar.E0.d) != null) {
            a79Var.postRunnable(a79Var.x);
        }
        i7b i7bVar = this.Y0;
        if (i7bVar != null) {
            i7bVar.x(0, false);
        }
        jq3 jq3Var = na7.q1(this.c).M1().w;
        if (!jq3Var.c && !jq3Var.d) {
            jq3Var.d = true;
            fq3 fq3Var = new fq3(jq3Var, (byte) 1);
            ad7 Y = ad7.Y(jq3Var.a);
            Y.a.c(new mn6((Object) Y, false, (Object) fq3Var, (byte) 18));
        }
    }

    public final void P(int i, int i2) {
        boolean z;
        x6b x6bVar;
        e7b e7bVar;
        f7b f7bVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        x6b x6bVar2;
        if (i2 == 0) {
            this.o0.setVisibility(8);
        }
        if (i == 0 && (x6bVar2 = this.w1) != null) {
            x6bVar2.setVisibility(8);
        }
        if (i == -1) {
            this.d1.setVisibility(8);
            if (i2 == 2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            this.h1.setVisibility(i3);
            if (i2 == 2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            this.k1.setVisibility(i4);
            if (i2 == 2) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            this.f1.setVisibility(i5);
            ImageView imageView = this.j1;
            if (imageView != null) {
                if (i2 == 2) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                imageView.setVisibility(i7);
            }
            if (i2 == 2) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            this.a1.setVisibility(i6);
            this.q0.setVisibility(8);
        }
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        this.Y0.setAllowCropping(z);
        if ((i2 == 0 || i == 0) && (x6bVar = this.w1) != null) {
            x6bVar.T0.setLayerType(0, null);
        }
        k58 k58Var = this.D1;
        if (k58Var != null) {
            if (i2 != 1 && i2 != -1) {
                z2 = false;
            }
            k58Var.setAllowTouch(z2);
        }
        if (i2 == 3) {
            e7b e7bVar2 = this.s1;
            if (e7bVar2 != null) {
                e7bVar2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (e7bVar = this.s1) != null) {
            e7bVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            e7b e7bVar3 = this.s1;
            e7bVar3.y = null;
            q23 q23Var = e7bVar3.f;
            q23Var.M = null;
            q23Var.d = null;
            q23Var.K = false;
            e7bVar3.d.setVisibility(8);
            e7bVar3.a.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            f7b f7bVar2 = this.t1;
            if (f7bVar2 != null) {
                f7bVar2.setAppearProgress(1.0f);
            }
        } else if (i == 4 && (f7bVar = this.t1) != null) {
            f7bVar.setVisibility(8);
            this.t1.setAppearProgress(0.0f);
            f7b f7bVar3 = this.t1;
            f7bVar3.b = null;
            q23 q23Var2 = f7bVar3.h;
            q23Var2.M = null;
            q23Var2.d = null;
            q23Var2.K = false;
            f7bVar3.e.setVisibility(8);
            f7bVar3.setVisibility(8);
        }
    }

    public final void Q(n7b n7bVar) {
        wx n;
        s7b s7bVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (na7.q1(i).t2()) {
            h5.b(i);
            return;
        }
        int i2 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (s7bVar = this.n) != null && s7bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gl.t3(windowManager, s7bVar, layoutParams);
            windowManager.addView(s7bVar, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(y());
        if (this.w0 == 0 && (n = na7.q1(i).M1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        I(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (n7bVar != null) {
            this.G = n7bVar;
            this.K = n7bVar.a;
            rectF.set(n7bVar.c);
            this.H = n7bVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = gl.q;
            rectF.set(0.0f, gl.L(100.0f), point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        l7b l7bVar = this.r;
        l7bVar.c();
        boolean z = this.K;
        if (!z && z) {
            i2 = -14737633;
        }
        this.i0.setBackgroundColor(i2);
        l7bVar.setTranslationX(0.0f);
        l7bVar.setTranslationY(0.0f);
        l7bVar.b(0.0f);
        l7bVar.setScaleX(1.0f);
        l7bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gl.e2(this.b);
        d(1.0f, true, new d6b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(m7b m7bVar, f4b f4bVar, long j) {
        int i;
        View view;
        if (this.d) {
            return;
        }
        int i2 = this.c;
        if (na7.q1(i2).t2()) {
            h5.b(i2);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (view = this.n) != null && view.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gl.t3(windowManager, view, layoutParams);
            windowManager.addView(view, layoutParams);
            f0();
        }
        this.L1 = f4bVar;
        this.P1 = f4bVar.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (m7bVar != null) {
            this.G = m7bVar;
            this.K = m7bVar.a;
            rectF.set(m7bVar.c);
            this.H = m7bVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = gl.q;
            rectF.set(0.0f, gl.L(100.0f), point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        l7b l7bVar = this.r;
        l7bVar.c();
        boolean z = this.K;
        int i3 = 1;
        if (!z && z) {
            i = -14737633;
        } else {
            i = 0;
        }
        this.i0.setBackgroundColor(i);
        l7bVar.setTranslationX(0.0f);
        l7bVar.setTranslationY(0.0f);
        l7bVar.b(0.0f);
        l7bVar.setScaleX(1.0f);
        l7bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gl.e2(this.b);
        f4b f4bVar2 = this.L1;
        if (f4bVar2 != null) {
            this.d1.setText(f4bVar2.C0);
        }
        J(new o6b(this, (byte) 1), j);
        if (this.L1.b0) {
            i3 = 2;
        }
        I(i3, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        cs5 cs5Var;
        i7b i7bVar = this.Y0;
        if (i7bVar != null) {
            i7bVar.x(4, true);
        }
        j7b j7bVar = this.d1;
        if (j7bVar != null && (cs5Var = j7bVar.V0) != null) {
            cs5Var.u();
            j7bVar.V0 = null;
        }
        jh8 jh8Var = new jh8((d) new z6b(this, (byte) 1), 14, false);
        jh8Var.setOnDismissListener(new n6b(this, (byte) 1));
        jh8Var.show();
    }

    public final void T(m7b m7bVar, f4b f4bVar) {
        int i;
        boolean z;
        int i2;
        wx n;
        s7b s7bVar;
        if (this.d) {
            return;
        }
        int i3 = this.c;
        if (na7.q1(i3).t2()) {
            h5.b(i3);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (s7bVar = this.n) != null && s7bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gl.t3(windowManager, s7bVar, layoutParams);
            windowManager.addView(s7bVar, layoutParams);
            f0();
        }
        this.L1 = f4bVar;
        a6b.a(i3, f4bVar);
        f4b f4bVar2 = this.L1;
        if (f4bVar2 != null && f4bVar2.K) {
            i = 1;
        } else {
            i = 0;
        }
        this.P1 = i;
        if (f4bVar2 != null && f4bVar2.u && i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.t0.g = z;
        if (this.w0 == 0 && (n = na7.q1(i3).M1().n()) != null && n.a(i3, 1)) {
            g0(n, true);
        }
        RectF rectF = this.I;
        if (m7bVar != null) {
            this.G = m7bVar;
            this.K = m7bVar.a;
            rectF.set(m7bVar.c);
            this.H = m7bVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = gl.q;
            rectF.set(0.0f, gl.L(100.0f), point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        l7b l7bVar = this.r;
        l7bVar.c();
        boolean z2 = this.K;
        if (!z2 && z2) {
            i2 = -14737633;
        } else {
            i2 = 0;
        }
        this.i0.setBackgroundColor(i2);
        l7bVar.setTranslationX(0.0f);
        l7bVar.setTranslationY(0.0f);
        l7bVar.b(0.0f);
        l7bVar.setScaleX(1.0f);
        l7bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gl.e2(this.b);
        f4b f4bVar3 = this.L1;
        if (f4bVar3 != null) {
            this.d1.setText(f4bVar3.C0);
        }
        this.c1.b(true, false);
        I(1, false);
        k0(-1, false, false);
        d(1.0f, true, new d6b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        c79 c79Var = this.x1;
        if (c79Var != null) {
            c79Var.bringToFront();
        }
        View view = this.y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.z1;
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
        k1c k1cVar = this.q1;
        if (k1cVar != null) {
            k1cVar.bringToFront();
        }
        k58 k58Var = this.D1;
        if (k58Var != null) {
            k58Var.bringToFront();
        }
        c58 c58Var = this.F1;
        if (c58Var != null) {
            c58Var.bringToFront();
        }
        e58 e58Var = this.G1;
        if (e58Var != null) {
            e58Var.bringToFront();
        }
        wi8 wi8Var = this.p1;
        if (wi8Var != null) {
            wi8Var.bringToFront();
        }
        pb1 pb1Var = this.r1;
        if (pb1Var != null) {
            pb1Var.bringToFront();
        }
    }

    public final void V(f4b f4bVar, boolean z) {
        File file;
        View view;
        float f;
        f4b f4bVar2;
        boolean z2;
        int i;
        if (f4bVar != null && this.Y0.getWidth() > 0 && this.Y0.getHeight() > 0) {
            if (z) {
                file = f4bVar.O0;
            } else {
                file = f4bVar.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.B0.i()) {
                view = this.B0;
            } else {
                view = this.Y0;
            }
            if (z) {
                f = 0.33333334f;
            } else {
                f = 1.0f;
            }
            int width = (int) (view.getWidth() * f);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f, f);
            gl.m0 = true;
            view.draw(canvas);
            gl.m0 = false;
            canvas.restore();
            Paint paint = new Paint(2);
            kac textureView = this.Y0.getTextureView();
            if (f4bVar.K && !f4bVar.u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f, f);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = f4bVar.Q0;
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
                    fa4.g(e, true);
                }
            }
            File file3 = f4bVar.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            x6b x6bVar = this.w1;
            if (x6bVar != null && x6bVar.H0 != null) {
                canvas.save();
                canvas.scale(f, f);
                x6b x6bVar2 = this.w1;
                x6bVar2.y0 = true;
                st7 st7Var = x6bVar2.H0;
                st7Var.a = true;
                st7Var.draw(canvas);
                x6b x6bVar3 = this.w1;
                x6bVar3.H0.a = false;
                x6bVar3.y0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w = f4b.w(this.c, "jpg");
            if (z) {
                f4bVar2 = f4bVar;
                z2 = z;
                Utilities.g.c(new z77(this, createBitmap, z2, w, f4bVar2, (byte) 22));
            } else {
                f4bVar2 = f4bVar;
                z2 = z;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z2) {
                        i = 95;
                    } else {
                        i = 99;
                    }
                    createBitmap.compress(compressFormat, i, new FileOutputStream(w));
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
            }
            if (!z2) {
                f4bVar2.N0 = w;
            }
            f4bVar2.b1 = createScaledBitmap;
        }
    }

    public final void W() {
        wx n;
        int size;
        char c;
        View[] viewPages;
        j4c[] j4cVarArr;
        y5b y5bVar = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (y5bVar != null) {
            y5bVar.dismiss();
            this.r0 = null;
        }
        boolean z = this.O1;
        pw0 pw0Var = pw0.APP_ERROR;
        if (z) {
            op3 op3Var = this.f1;
            op3Var.getClass();
            op3Var.c(k96.N0("VideoConvertFail"));
            pw0Var.a();
            ui8 ui8Var = this.c1.c;
            int i = -this.V1;
            this.V1 = i;
            gl.B3(i, ui8Var, null);
            return;
        }
        j7b j7bVar = this.d1;
        if (j7bVar != null && j7bVar.o()) {
            pw0Var.a();
            hn hnVar = j7bVar.w;
            int i2 = -this.V1;
            this.V1 = i2;
            gl.B3(i2, hnVar, null);
            j7bVar.e();
            return;
        }
        f4b f4bVar = this.L1;
        int i3 = this.c;
        if ((f4bVar == null || (!f4bVar.g && f4bVar.J0 == 0)) && (n = na7.q1(i3).e0.n()) != null && n.a(i3, z())) {
            g0(n, false);
            return;
        }
        this.L1.D0 = na7.q1(i3).c5();
        f53 f53Var = this.a;
        char c2 = 1;
        if (j7bVar != null && !this.L1.D0) {
            CharSequence text = j7bVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((wib[]) spannable.getSpans(0, text.length(), wib.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new u21(this.n, f53Var).Q(2131624341, 36, gl.O2(k96.M0(2131744341, null), bkb.Wc, 0, new d6b(this, (byte) 28), f53Var)).k(true);
                    int i4 = -this.V1;
                    this.V1 = i4;
                    gl.B3(i4, j7bVar, null);
                    return;
                }
            }
        }
        f4b f4bVar2 = this.L1;
        if (!f4bVar2.g && f4bVar2.J0 == 0) {
            if (this.O != 0) {
                f4bVar2.v0 = na7.q1(i3).h1(this.O);
            }
            i7b i7bVar = this.Y0;
            i7bVar.x(3, true);
            y5b y5bVar2 = new y5b(this.b, this.L1.I0, f53Var);
            y5bVar2.R0(this.L1.E0);
            y5bVar2.Q0(this.L1.v0);
            y5bVar2.z1 = this.N;
            y5bVar2.O1 = new e6b(this, (byte) 15);
            y5bVar2.E0(!this.B0.i());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            y5bVar2.N0(size);
            y5bVar2.L0(false);
            CharSequence text2 = j7bVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (j4c j4cVar : (j4c[]) ((Spanned) text2).getSpans(0, text2.length(), j4c.class)) {
                    if (j4cVar != null) {
                        try {
                            TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(Long.parseLong(j4cVar.getURL())));
                            if (V1 != null && !l7c.C(V1) && l7c.o(V1) != null && !arrayList2.contains(V1)) {
                                arrayList2.add(l7c.o(V1));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i5 = 0;
                int i6 = -1;
                while (i5 < text2.length()) {
                    char charAt = text2.charAt(i5);
                    char c3 = c2;
                    if (charAt == '@') {
                        i6 = i5 + 1;
                    } else if (charAt == ' ') {
                        if (i6 != -1) {
                            String charSequence = text2.subSequence(i6, i5).toString();
                            TLObject a2 = na7.q1(i3).a2(charSequence);
                            if (a2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) a2;
                                if (!user.bot && !l7c.C(user) && user.id != 777000 && !l7c.A(user) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i6 = -1;
                    }
                    i5++;
                    c2 = c3;
                }
                c = c2;
                if (i6 != -1) {
                    String charSequence2 = text2.subSequence(i6, text2.length()).toString();
                    TLObject a22 = na7.q1(i3).a2(charSequence2);
                    if (a22 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) a22;
                        if (!user2.bot && !l7c.C(user2) && user2.id != 777000 && !l7c.A(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c = 1;
            }
            y5bVar2.M1 = arrayList2;
            y5bVar2.Q1 = new e6b(this, (byte) 16);
            y5bVar2.R1 = new e6b(this, (byte) 17);
            y5bVar2.N1 = new k6b(this, (byte) 9);
            this.r0 = y5bVar2;
            f4b f4bVar3 = this.L1;
            if (f4bVar3.K) {
                if (i7bVar != null && !f4bVar3.f0 && this.g0 != 2) {
                    f4bVar3.e0 = i7bVar.getCurrentPosition();
                    p8c e6bVar = new e6b(this, (byte) 18);
                    View view = this.x1;
                    View view2 = this.A1;
                    View[] viewArr = new View[3];
                    viewArr[0] = i7bVar;
                    viewArr[c] = view;
                    viewArr[2] = view2;
                    i7bVar.g(e6bVar, viewArr);
                }
                y5b y5bVar3 = this.r0;
                Bitmap bitmap = this.L1.g0;
                d6b d6bVar = new d6b(this, (byte) 20);
                if (bitmap != null) {
                    y5bVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                y5bVar3.V1 = bitmapDrawable;
                y5bVar3.W1 = d6bVar;
                vq1 vq1Var = y5bVar3.l1;
                if (vq1Var != null) {
                    for (View view3 : vq1Var.getViewPages()) {
                        if (view3 instanceof t5b) {
                            t5b t5bVar = (t5b) view3;
                            t5bVar.h(false);
                            t5bVar.f(false);
                        }
                    }
                }
            }
            this.r0.setOnDismissListener(new n6b(this, (byte) 0));
            this.r0.show();
            return;
        }
        f4bVar2.l = false;
        f(null);
        o0();
    }

    public final void X(o7b o7bVar) {
        int i = 0;
        RectF rectF = this.I;
        if (o7bVar != null) {
            this.G = o7bVar;
            this.K = o7bVar.a;
            rectF.set(o7bVar.c);
            this.H = o7bVar.b;
        } else {
            this.G = null;
            this.K = false;
            Point point = gl.q;
            rectF.set(0.0f, gl.L(100.0f), point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        boolean z = this.K;
        if (!z && z) {
            i = -14737633;
        }
        this.i0.setBackgroundColor(i);
    }

    public final boolean Y() {
        Activity activity = this.b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public final void Z(boolean z) {
        boolean z2;
        if (!this.x2 || z) {
            this.t2 = false;
            Activity activity = this.b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.t2 = z2;
                if (z2) {
                    Drawable mutate = activity.getResources().getDrawable(2131232770).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    fm2 fm2Var = new fm2(new ColorDrawable(-14540254), mutate);
                    int L = gl.L(64.0f);
                    int L2 = gl.L(64.0f);
                    fm2Var.e = L;
                    fm2Var.f = L2;
                    this.B0.setCameraThumb(fm2Var);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, activity);
                        int i = bkb.K5;
                        alertDialog$Builder.l(2131624117, 72, bkb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        SpannableStringBuilder T2 = gl.T2(k96.M0(2131747115, null));
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = T2;
                        alertDialog$Builder.j(k96.M0(2131747107, null), new k6b(this, (byte) 12));
                        alertDialog$Builder.g(k96.M0(2131751760, null), null);
                        hdVar.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.x2 = true;
                }
            }
            if (!this.t2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    p();
                } else {
                    CameraController.getInstance().initCamera(new d6b(this, (byte) 0));
                }
            }
        }
    }

    public final void a() {
        kk7.e().a(this, kk7.q2);
        int i = this.c;
        kk7.f(i).a(this, kk7.A5);
        kk7.f(i).a(this, kk7.c3);
    }

    public final void a0(Runnable runnable) {
        y6b y6bVar = this.C0;
        if (y6bVar != null && y6bVar.getTextureView() != null) {
            try {
                Utilities.i.c(new r1b(this, this.C0.getTextureView().getBitmap(), runnable, (byte) 7));
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k2 = null;
        }
        this.l2 = false;
        l7b l7bVar = this.r;
        float f = l7bVar.a;
        float f2 = l7bVar.b;
        l7bVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new qx1(this, f, f2, (byte) 6));
        this.k2.setDuration(340L);
        this.k2.setInterpolator(s33.h);
        this.k2.addListener(new v6b(this, (byte) 0));
        this.k2.start();
    }

    public final void b0(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        float f = 0.0f;
        int i = 0;
        if (z2) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z) {
                f = 1.0f;
            }
            animate.alpha(f).setUpdateListener(new w6b(this, (byte) 1)).setListener(new qw(this, z, view, (byte) 14)).setDuration(320L).setInterpolator(s33.h).start();
            return;
        }
        view.animate().cancel();
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
        m0();
    }

    public final void c(boolean z) {
        float height;
        boolean z2;
        int i;
        eq3 eq3Var;
        this.L0 = z;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z) {
            vr4 vr4Var = this.N0;
            if (vr4Var == null) {
                if (z) {
                    r(false);
                }
                vr4Var = this.N0;
                if (vr4Var == null) {
                    return;
                }
            }
            if (vr4Var.V) {
                this.r2 = new l6b(this, z, (byte) 0);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            yla ylaVar = this.p2;
            if (ylaVar != null) {
                ylaVar.d();
                this.p2 = null;
            }
            vr4 vr4Var2 = this.N0;
            if (vr4Var2 == null) {
                if (z) {
                    r(false);
                }
                vr4Var2 = this.N0;
                if (vr4Var2 == null) {
                    return;
                }
            }
            vr4Var2.L = false;
            if (z && (eq3Var = this.O0) != null) {
                eq3Var.a(false);
            }
            int i2 = 4;
            l7b l7bVar = this.r;
            if (l7bVar != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                l7bVar.setImportantForAccessibility(i);
            }
            vr4 vr4Var3 = this.N0;
            if (z) {
                i2 = 0;
            }
            vr4Var3.setImportantForAccessibility(i2);
            this.q2 = Boolean.valueOf(z);
            float translationY = this.N0.getTranslationY();
            s7b s7bVar = this.n;
            if (z) {
                height = 0.0f;
            } else {
                height = (s7bVar.getHeight() - this.N0.g()) + (gl.n * 2.5f);
            }
            s7bVar.getHeight();
            vr4 vr4Var4 = this.N0;
            vr4Var4.L = !z;
            if (this.k2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.l2 = z2;
            if (z) {
                yla ylaVar2 = new yla(vr4Var4, yla.p, height);
                this.p2 = ylaVar2;
                ylaVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new o12(this, height, (byte) 2));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new m6b(this, (byte) 0));
                this.o2.addListener(new v6b(this, (byte) 1));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(s33.h);
                this.o2.start();
                if (!this.T1) {
                    this.m2 = null;
                }
            }
            if (!z && this.g0 == 0 && !this.t2) {
                p();
            }
        }
    }

    public final void c0(boolean z) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f.updateViewLayout(this.n, layoutParams);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void d(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        l7b l7bVar = this.r;
        if (z) {
            this.Q.d();
            kk7.e().k(kk7.i1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new m6b(this, (byte) 5));
            this.F.addListener(new ji4(this, f, runnable, (byte) 5));
            if (f < 1.0f && this.w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(s33.h);
            } else if (f <= 0.0f && l7bVar.a >= gl.L(20.0f)) {
                if (f < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(s33.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(s33.h);
                }
            } else {
                this.F.setDuration(300L);
                this.F.setInterpolator(new c84());
            }
            this.F.start();
            return;
        }
        this.M = null;
        this.J = f;
        h();
        l7bVar.invalidate();
        this.n.invalidate();
        runnable.run();
        l();
    }

    public final void d0(String str) {
        int i;
        mpb mpbVar = this.F0;
        mpbVar.clearAnimation();
        y6b y6bVar = this.C0;
        if ((y6bVar != null && y6bVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z = false;
        if (str == null) {
            b0(mpbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    mpbVar.setContentDescription(k96.M0(2131754915, null));
                    i = 2131231755;
                }
            } else {
                str.equals("off");
            }
            mpbVar.setContentDescription(k96.M0(2131754914, null));
            i = 2131231756;
        } else {
            if (str.equals("on")) {
                mpbVar.setContentDescription(k96.M0(2131754913, null));
                i = 2131231757;
            }
            mpbVar.setContentDescription(k96.M0(2131754914, null));
            i = 2131231756;
        }
        if (mpbVar.n != i) {
            mpbVar.n = i;
            ValueAnimator valueAnimator = mpbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                mpbVar.r = null;
            }
            mpbVar.setDrawable(i);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !G()) {
            z = true;
        }
        b0(mpbVar, z, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wx n;
        f4b f4bVar;
        int i3 = kk7.q2;
        f29 f29Var = this.P0;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == i3) {
            if (f29Var != null) {
                f29Var.h();
            }
            if (this.n2 != null && MediaController.c2 != null) {
                for (int i4 = 0; i4 < MediaController.c2.size(); i4++) {
                    xl6 xl6Var = (xl6) MediaController.c2.get(i4);
                    int i5 = xl6Var.a;
                    xl6 xl6Var2 = this.n2;
                    if (i5 == xl6Var2.a && xl6Var.b == xl6Var2.b) {
                        this.n2 = xl6Var;
                        return;
                    }
                }
            }
        } else if (i == kk7.A5) {
            if (f29Var != null && !this.W1) {
                f29Var.h();
            }
        } else if (i == kk7.c3) {
            byte b = this.g0;
            int i6 = this.c;
            if (b == 1) {
                if (!this.O1 && !this.d1.o()) {
                    g2b M1 = na7.q1(i6).M1();
                    int z2 = z();
                    wx n2 = M1.n();
                    if (n2 == null || !n2.a(M1.a, z2) || ((f4bVar = this.L1) != null && (f4bVar.g || f4bVar.J0 != 0))) {
                        z = true;
                    }
                }
                this.c1.setShareEnabled(z);
            } else if (b == 0 && (n = na7.q1(i6).M1().n()) != null && n.a(i6, 1)) {
                f4b f4bVar2 = this.L1;
                if (f4bVar2 == null || f4bVar2.J0 == 0) {
                    g0(n, true);
                }
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        float f;
        float L;
        float L2;
        float f2;
        float L3;
        float L4;
        jk2 jk2Var;
        if (z) {
            je5 je5Var = this.m1;
            if (je5Var != null) {
                je5Var.f(true);
            }
            je5 je5Var2 = this.n1;
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
            je5 je5Var3 = this.l1;
            if (je5Var3 != null) {
                je5Var3.f(true);
            }
            je5 je5Var4 = this.X0;
            if (je5Var4 != null) {
                je5Var4.f(true);
            }
        }
        if (this.b2 == z && this.c2 == G()) {
            return;
        }
        AnimatorSet animatorSet = this.a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.a2 = null;
        }
        this.b2 = z;
        this.c2 = G();
        if (z && (jk2Var = this.J0) != null && jk2Var.e) {
            jk2Var.a(false, z2);
        }
        l0(z2);
        q6b q6bVar = this.R0;
        ge5 ge5Var = this.V0;
        ge5 ge5Var2 = this.U0;
        float f3 = 0.6f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a2 = animatorSet2;
            Property property = View.ALPHA;
            if (z && this.g0 == 0 && !G()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ge5Var2, property, f2);
            Property property2 = View.TRANSLATION_Y;
            if (z && this.g0 == 0 && !G()) {
                L3 = 0.0f;
            } else {
                L3 = gl.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ge5Var2, property2, L3);
            if (z || this.g0 != 0 || !G()) {
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ge5Var, property, f3);
            if (!z && this.g0 == 0 && G()) {
                L4 = 0.0f;
            } else {
                L4 = gl.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ge5Var, property2, L4);
            if (z || this.g0 != 0 || G()) {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q6bVar, property, f4);
            if (z || this.g0 != 0 || G()) {
                f5 = gl.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(q6bVar, property2, f5));
            this.a2.setDuration(260L);
            this.a2.setInterpolator(s33.h);
            this.a2.start();
            return;
        }
        if (z && this.g0 == 0 && !G()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ge5Var2.setAlpha(f);
        if (z && this.g0 == 0 && !G()) {
            L = 0.0f;
        } else {
            L = gl.L(16.0f);
        }
        ge5Var2.setTranslationY(L);
        if (z || this.g0 != 0 || !G()) {
            f3 = 0.0f;
        }
        ge5Var.setAlpha(f3);
        if (!z && this.g0 == 0 && G()) {
            L2 = 0.0f;
        } else {
            L2 = gl.L(16.0f);
        }
        ge5Var.setTranslationY(L2);
        if (z || this.g0 != 0 || G()) {
            f4 = 0.0f;
        }
        q6bVar.setAlpha(f4);
        if (z || this.g0 != 0 || G()) {
            f5 = gl.L(16.0f);
        }
        q6bVar.setTranslationY(f5);
    }

    public final void e0(boolean z, boolean z2) {
        oy8 oy8Var = this.g1;
        if (oy8Var == null) {
            oy8 oy8Var2 = new oy8(2131624089, gl.L(28.0f), gl.L(28.0f), true, null);
            this.g1 = oy8Var2;
            oy8Var2.G *= 1.5f;
            oy8Var = oy8Var2;
        }
        this.h1.setAnimation(oy8Var);
        oy8 oy8Var3 = this.g1;
        int i = 20;
        if (!z2) {
            if (!z) {
                i = 0;
            }
            oy8Var3.I(i, false, false);
        } else if (z) {
            if (oy8Var3.b0 > 20) {
                oy8Var3.I(0, false, false);
            }
            this.g1.K(20);
            this.g1.start();
        } else {
            int i2 = oy8Var3.b0;
            if (i2 != 0 && i2 < 43) {
                oy8Var3.K(43);
                this.g1.start();
            }
        }
    }

    public final void f(Runnable runnable) {
        f4b f4bVar;
        Runnable runnable2;
        i7b i7bVar;
        float f;
        boolean z;
        Bitmap.CompressFormat compressFormat;
        l58 l58Var = this.C1;
        if (l58Var != null && (f4bVar = this.L1) != null) {
            f4bVar.j |= l58Var.a();
            f4b f4bVar2 = this.L1;
            l58 l58Var2 = this.C1;
            File file = f4bVar2.Z0;
            if (file != null) {
                file.delete();
                f4bVar2.Z0 = null;
            }
            lm6 savedFilterState = l58Var2.getSavedFilterState();
            f4bVar2.a1 = savedFilterState;
            if (!f4bVar2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = l58Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i = f4bVar2.R;
                        float f2 = 1.0f;
                        if (i == 1) {
                            f = -1.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (i == 2) {
                            f2 = -1.0f;
                        }
                        matrix.postScale(f, f2, f4bVar2.k0 / 2.0f, f4bVar2.l0 / 2.0f);
                        matrix.postRotate(-f4bVar2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        f4bVar2.n0.preScale(f4bVar2.k0 / createBitmap.getWidth(), f4bVar2.l0 / createBitmap.getHeight());
                        f4bVar2.k0 = createBitmap.getWidth();
                        f4bVar2.l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = f4bVar2.Z0;
                        if (file2 != null && file2.exists()) {
                            f4bVar2.Z0.delete();
                        }
                        String k = f4b.k(f4bVar2.L);
                        String str = "webp";
                        if (!"png".equals(k) && !"webp".equals(k)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int i2 = f4bVar2.a;
                        if (!z) {
                            str = "jpg";
                        }
                        f4bVar2.Z0 = f4b.w(i2, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(f4bVar2.Z0);
                                if (z) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.i.c(new d97(f4bVar2, createBitmap, z, runnable2, (byte) 16));
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
                f4b f4bVar3 = this.L1;
                if (!f4bVar3.K && (i7bVar = this.Y0) != null) {
                    i7bVar.set(f4bVar3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new uo(this, (byte) 3));
    }

    public final void g() {
        if (this.L1 != null && this.E1 != null) {
            g7b g7bVar = this.i0;
            if (g7bVar.getMeasuredWidth() > 0 && g7bVar.getMeasuredHeight() > 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                int i = this.L1.Q;
                if (i != 0) {
                    matrix.postRotate(-i, g7bVar.getMeasuredWidth() / 2.0f, g7bVar.getMeasuredHeight() / 2.0f);
                    if ((this.L1.Q / 90) % 2 == 1) {
                        matrix.postScale(g7bVar.getMeasuredWidth() / g7bVar.getMeasuredHeight(), g7bVar.getMeasuredHeight() / g7bVar.getMeasuredWidth(), g7bVar.getMeasuredWidth() / 2.0f, g7bVar.getMeasuredHeight() / 2.0f);
                    }
                }
                matrix.postScale((1.0f / g7bVar.getMeasuredWidth()) * this.L1.k0, (1.0f / g7bVar.getMeasuredHeight()) * this.L1.l0);
                matrix.postConcat(this.L1.n0);
                matrix.postScale(g7bVar.getMeasuredWidth() / this.L1.i0, g7bVar.getMeasuredHeight() / this.L1.j0);
                this.E1.setTransform(matrix);
                this.E1.invalidate();
            }
        }
    }

    public final void g0(wx wxVar, boolean z) {
        if (this.A2) {
            return;
        }
        h26 h26Var = new h26(wxVar.b(), this.c, null, this.b, new z6b(this, (byte) 0));
        h26Var.S1 = z();
        h26Var.setOnDismissListener(new bu5((byte) 2, this, z));
        this.Y0.x(7, true);
        this.A2 = true;
        h26Var.show();
    }

    public final void h() {
        d28 d28Var;
        if (this.K) {
            g7b g7bVar = this.i0;
            RectF rectF = this.e0;
            rectF.set(g7bVar.getLeft(), g7bVar.getTop(), g7bVar.getMeasuredWidth(), g7bVar.getMeasuredHeight());
            l7b l7bVar = this.r;
            rectF.offset(l7bVar.getX(), l7bVar.getY());
            float f = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.d0;
            gl.X1(rectF2, rectF, f, rectF3);
            g7bVar.setAlpha(this.J);
            g7bVar.setTranslationX((rectF3.left - g7bVar.getLeft()) - l7bVar.getX());
            g7bVar.setTranslationY((rectF3.top - g7bVar.getTop()) - l7bVar.getY());
            o7b o7bVar = this.G;
            if (o7bVar != null && (d28Var = o7bVar.f) != null) {
                d28Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            g7bVar.setScaleX(rectF3.width() / g7bVar.getMeasuredWidth());
            g7bVar.setScaleY(rectF3.height() / g7bVar.getMeasuredHeight());
            this.j0.setAlpha(this.J);
            this.l0.setAlpha(this.J);
            this.m0.setAlpha(this.J);
            if (this.g0 == 2) {
                this.v1.setAlpha(this.J);
            }
        }
    }

    public final void h0(boolean z, boolean z2) {
        if (this.e2 != z) {
            this.e2 = z;
            float f = 0.0f;
            tcc tccVar = this.K0;
            if (z2) {
                ViewPropertyAnimator animate = tccVar.animate();
                if (z) {
                    f = 1.0f;
                }
                animate.alpha(f).setDuration(350L).setInterpolator(s33.h).withEndAction(new l6b(this, z, (byte) 1)).start();
                return;
            }
            tccVar.clearAnimation();
            if (z) {
                f = 1.0f;
            }
            this.K0.setAlpha(f);
            if (!z) {
                this.K0.b(false, false);
            }
        }
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.i():void");
    }

    public final void i0(boolean z) {
        Integer num;
        float f;
        azc azcVar = this.W0;
        if (azcVar.getTag() != null && z) {
            Runnable runnable = this.f2;
            if (runnable != null) {
                gl.r(runnable);
            }
            d6b d6bVar = new d6b(this, (byte) 25);
            this.f2 = d6bVar;
            gl.e3(d6bVar, 2000L);
        } else if (azcVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.g2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            azcVar.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g2 = animatorSet2;
            animatorSet2.setDuration(180L);
            if (z) {
                azcVar.setVisibility(0);
            }
            AnimatorSet animatorSet3 = this.g2;
            Property property = View.ALPHA;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(azcVar, property, f));
            this.g2.addListener(new pu9((byte) 6, this, z));
            this.g2.start();
            if (z) {
                d6b d6bVar2 = new d6b(this, (byte) 26);
                this.f2 = d6bVar2;
                gl.e3(d6bVar2, 2000L);
            }
        }
    }

    public final void j() {
        f4b f4bVar;
        boolean z;
        if (this.w1 != null && (f4bVar = this.L1) != null && f4bVar.u) {
            File file = f4bVar.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                f4bVar = this.L1;
                f4bVar.W0 = null;
            }
            f4bVar.W0 = f4b.w(this.c, "webp");
            x6b x6bVar = this.w1;
            f4b f4bVar2 = this.L1;
            ArrayList arrayList = f4bVar2.T0;
            if (this.P1 != 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap q0 = x6bVar.q0(arrayList, false, false, true, z, f4bVar2);
            try {
                try {
                    q0.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                    if (q0.isRecycled()) {
                        return;
                    }
                } catch (Throwable th) {
                    if (q0 != null && !q0.isRecycled()) {
                        q0.recycle();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
                try {
                    this.L1.W0.delete();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                this.L1.W0 = null;
                if (q0 == null || q0.isRecycled()) {
                    return;
                }
            }
            q0.recycle();
        }
    }

    public final void j0() {
        y5b y5bVar = this.r0;
        if (y5bVar != null) {
            y5bVar.dismiss();
            this.r0 = null;
        }
        y5b y5bVar2 = new y5b(this.b, 86400, this.a);
        y5bVar2.P0();
        y5bVar2.R0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = na7.q1(this.c).h1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        y5bVar2.Q0(inputPeer);
        y5bVar2.z1 = this.N;
        y5bVar2.O1 = new e6b(this, (byte) 19);
        y5bVar2.E0(false);
        y5bVar2.N0(1);
        y5bVar2.L0(false);
        y5bVar2.Q1 = new e6b(this, (byte) 20);
        y5bVar2.N1 = new k6b(this, (byte) 11);
        this.r0 = y5bVar2;
        y5bVar2.show();
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.k0(int, boolean, boolean):void");
    }

    public final void l() {
        boolean z;
        if (this.L == 0.0f && this.J >= 1.0f && !this.C2) {
            z = false;
        } else {
            z = true;
        }
        if (z == this.B2) {
            return;
        }
        a06 a06Var = this.E;
        if (a06Var != null) {
            a06Var.b(!z);
        }
        this.B2 = z;
    }

    public final void l0(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        boolean z7;
        y6b y6bVar;
        byte b = this.g0;
        jk2 jk2Var = this.J0;
        boolean z8 = false;
        if (b == 0 && this.P1 == 1 && !jk2Var.e && !G()) {
            z2 = true;
        } else {
            z2 = false;
        }
        h0(z2, z);
        h7b h7bVar = this.B0;
        boolean i = h7bVar.i();
        kk2 kk2Var = this.H0;
        kk2Var.setSelected(i);
        if (jk2Var != null && jk2Var.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        b0(this.o0, z3, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && this.Z1 != null && !jk2Var.e && !G()) {
            z4 = true;
        } else {
            z4 = false;
        }
        b0(this.F0, z4, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && (y6bVar = this.C0) != null && y6bVar.a && !jk2Var.e && !h7bVar.i()) {
            z5 = true;
        } else {
            z5 = false;
        }
        b0(this.G0, z5, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && !jk2Var.e) {
            z6 = true;
        } else {
            z6 = false;
        }
        b0(kk2Var, z6, z);
        b0(this.I0, jk2Var.e, z);
        if (h7bVar.i()) {
            f = h7bVar.getFilledProgress();
        } else {
            f = 0.0f;
        }
        this.P0.e(z, f);
        boolean z9 = jk2Var.e;
        je5 je5Var = this.o1;
        if (z9) {
            je5Var.v();
        } else {
            je5Var.f(true);
        }
        e(this.b2, z);
        if (this.P1 == -1 && this.g0 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        gl.Q3(this.T0, z7, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z8 = true;
        }
        gl.Q3(this.S0, z8, true);
    }

    public final void m() {
        if (this.u2 < 0) {
            this.u2 = na7.c1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f = na7.c1().getFloat("frontflash_warmth", 0.9f);
            mi4 mi4Var = this.s;
            mi4Var.o = f;
            mi4Var.n = mi4.f(f);
            mi4Var.g();
            mi4Var.p = na7.c1().getFloat("frontflash_intensity", 1.0f);
            mi4Var.i();
        }
    }

    public final void m0() {
        mpb mpbVar = this.I0;
        mpbVar.setTranslationX(-0.0f);
        float alpha = (mpbVar.getAlpha() * gl.L(46.0f)) + 0.0f;
        npb npbVar = this.G0;
        npbVar.setTranslationX(-alpha);
        float alpha2 = (npbVar.getAlpha() * gl.L(46.0f)) + alpha;
        kk2 kk2Var = this.H0;
        kk2Var.setTranslationX(-alpha2);
        float alpha3 = (kk2Var.getAlpha() * gl.L(46.0f)) + alpha2;
        mpb mpbVar2 = this.F0;
        mpbVar2.setTranslationX(-alpha3);
        float alpha4 = mpbVar2.getAlpha();
        ki4 ki4Var = this.o0;
        ki4Var.setTranslationX(0.0f);
        float alpha5 = ki4Var.getAlpha();
        float L = (alpha4 * gl.L(46.0f)) + alpha3 + gl.L(8.0f);
        hw hwVar = this.J0.a;
        hwVar.setPadding((int) ((alpha5 * gl.L(46.0f)) + 0.0f + gl.L(8.0f)), 0, (int) L, 0);
        hwVar.invalidate();
    }

    public final void n() {
        y6b y6bVar = this.C0;
        boolean z = false;
        if (y6bVar != null && y6bVar.getTextureView() != null) {
            Bitmap bitmap = this.C0.getTextureView().getBitmap();
            if (bitmap == null) {
                this.d2 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f = 0.0f;
            for (int i = 0; i < 10; i++) {
                int i2 = 0;
                while (i2 < 10) {
                    i2++;
                    f += gl.B(bitmap.getPixel((i + 1) * width, i2 * height));
                }
            }
            bitmap.recycle();
            if (f / 100.0f < 0.22f) {
                z = true;
            }
            this.d2 = z;
            return;
        }
        this.d2 = false;
    }

    public final void n0(boolean z) {
        int i;
        oy8 oy8Var = this.i1;
        if (oy8Var != null) {
            int[] iArr = oy8Var.e;
            f4b f4bVar = this.L1;
            int i2 = 0;
            if (z) {
                if (f4bVar != null && f4bVar.y0) {
                    i2 = iArr[0];
                }
                oy8Var.K(i2);
                oy8 oy8Var2 = this.i1;
                if (oy8Var2 != null) {
                    oy8Var2.start();
                    return;
                }
                return;
            }
            if (f4bVar != null && f4bVar.y0) {
                i = iArr[0] - 1;
            } else {
                i = 0;
            }
            oy8Var.I(i, false, true);
            this.i1.K(i);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o(boolean z) {
        if (this.d) {
            y5b y5bVar = this.r0;
            if (y5bVar != null) {
                y5bVar.dismiss();
                this.r0 = null;
            }
            f4b f4bVar = this.L1;
            long j = 0;
            if (f4bVar != null && !f4bVar.h) {
                if ((this.w && f4bVar.g) || f4bVar.b != 0) {
                    f4bVar.j = false;
                }
                f4bVar.i(false);
            }
            this.L1 = null;
            m8c m8cVar = this.S;
            i7b i7bVar = this.Y0;
            if (m8cVar != null && i7bVar != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                lbc lbcVar = i7bVar.E;
                if (lbcVar != null) {
                    lbcVar.f0();
                    i7bVar.E.l0();
                    i7bVar.E = null;
                }
                lbc lbcVar2 = i7bVar.y;
                if (lbcVar2 != null) {
                    j = lbcVar2.S();
                    i7bVar.y.f0();
                    i7bVar.y.l0();
                    i7bVar.y = null;
                }
                lbc lbcVar3 = i7bVar.e;
                if (lbcVar3 != null) {
                    j = lbcVar3.S();
                    i7bVar.e.f0();
                    i7bVar.e.l0();
                    i7bVar.e = null;
                }
                m8cVar.a(Long.valueOf(j), new l6b(this, z, (byte) 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
                return;
            }
            if (i7bVar != null && !z) {
                i7bVar.set(null);
            }
            d(0.0f, z, new d6b(this, (byte) 23));
            boolean z2 = this.K;
            if (z2 || !z2) {
                this.n.setBackgroundColor(0);
                this.c1.b(false, true);
            }
            kk7.e().n(this, kk7.q2);
            int i = this.c;
            kk7.f(i).n(this, kk7.A5);
            kk7.f(i).n(this, kk7.c3);
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        d6b d6bVar = new d6b(this, (byte) 2);
        x6b x6bVar = this.w1;
        f4b f4bVar = this.L1;
        if (x6bVar != null && f4bVar != null) {
            f4bVar.f();
            boolean r0 = x6bVar.r0();
            boolean z = x6bVar.E0.getPainting().E;
            Utilities.g.c(new g2a(this, x6bVar, f4bVar.i0, f4bVar.j0, f4bVar, z, r0, d6bVar, (byte) 2));
            return;
        }
        d6bVar.run();
    }

    public final void p() {
        boolean z;
        Activity activity = this.b;
        if (this.C0 == null && activity != null) {
            this.C0 = new y6b(this, activity, na7.c1().getBoolean("stories_camera", false));
            f29 f29Var = this.P0;
            float f = 0.0f;
            if (f29Var != null) {
                f29Var.h0 = 0.0f;
                f29Var.i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.i();
            this.C0.setThumbDrawable(y());
            this.C0.initTexture();
            this.C0.setDelegate(new k6b(this, (byte) 0));
            npb npbVar = this.G0;
            if (this.C0.a && this.g0 == 0) {
                z = true;
            } else {
                z = false;
            }
            b0(npbVar, z, true);
            kk2 kk2Var = this.H0;
            if (!this.C0.a) {
                f = gl.L(46.0f);
            }
            kk2Var.setTranslationX(f);
            this.B0.setCameraView(this.C0);
            if (na7.c1().getInt("storyhint2", 0) < 1) {
                this.X0.v();
                na7.c1().edit().putInt("storyhint2", na7.c1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!ir3.o(this.C0.getContext()) || !na7.c1().getBoolean("dualcam", ir3.n(org.telegram.messenger.a.b, false))) && this.C0.a && na7.c1().getInt("storydualhint", 0) < 2) {
                this.m1.v();
            }
            dv8 dv8Var = this.D0;
            if (dv8Var == null) {
                dv8Var = new dv8(activity, new e6b(this, (byte) 4));
                this.D0 = dv8Var;
            }
            dv8Var.a(this.C0);
            lq9 lq9Var = this.E0;
            if (lq9Var != null) {
                h7b h7bVar = this.B0;
                Object blurRenderNode = h7bVar.getBlurRenderNode();
                lq9Var.G = h7bVar;
                lq9Var.H = blurRenderNode;
                lq9Var.invalidate();
            }
        }
    }

    public final boolean p0() {
        y6b y6bVar;
        if ((this.Q1 || this.R1) && (y6bVar = this.C0) != null && y6bVar.isFrontface()) {
            int i = this.u2;
            if (i == 2 || (i == 1 && this.d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        f4b f4bVar;
        Bitmap bitmap;
        Bitmap q;
        if (this.C1 == null && (f4bVar = this.L1) != null) {
            boolean z = f4bVar.K;
            i7b i7bVar = this.Y0;
            lm6 lm6Var = null;
            if (!z) {
                if (f4bVar.Z0 == null) {
                    q = i7bVar.getPhotoBitmap();
                } else {
                    k6b k6bVar = new k6b(this, (byte) 10);
                    Point point = gl.q;
                    q = f4b.q(k6bVar, point.x, point.y, 0, true);
                }
                bitmap = q;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                kac textureView = i7bVar.getTextureView();
                int orientation = i7bVar.getOrientation();
                f4b f4bVar2 = this.L1;
                if (f4bVar2 != null) {
                    lm6Var = f4bVar2.a1;
                }
                l58 l58Var = new l58(this.b, textureView, bitmap, null, orientation, lm6Var, null, 0, false, false, this.s0, this.a);
                this.C1 = l58Var;
                this.r.addView(l58Var);
                k58 k58Var = this.D1;
                if (k58Var != null) {
                    k58Var.setFilterView(this.C1);
                }
                TextureView myTextureView = this.C1.getMyTextureView();
                this.E1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                i7bVar.o(this.E1, this.C1);
                TextureView textureView2 = this.E1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.E1.animate().alpha(1.0f).setDuration(220L).start();
                }
                g();
                c58 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                g7b g7bVar = this.i0;
                if (blurControl != null) {
                    g7bVar.addView(blurControl);
                }
                e58 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    g7bVar.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new f6b(this, (byte) 13));
                this.C1.getCancelTextView().setOnClickListener(new f6b(this, (byte) 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(gl.L(186.0f));
                this.C1.j0.setVisibility(0);
            }
        }
    }

    public final void r(boolean z) {
        boolean z2;
        boolean z3;
        vr4 vr4Var = this.N0;
        h7b h7bVar = this.B0;
        if (vr4Var != null) {
            if (h7bVar != null && h7bVar.i()) {
                z3 = true;
            } else {
                z3 = false;
            }
            vr4 vr4Var2 = this.N0;
            if (z3 != vr4Var2.Q) {
                vr4Var = vr4Var2;
            } else {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (vr4Var != null) {
            u();
        }
        xl6 xl6Var = this.n2;
        boolean z4 = !z;
        if (h7bVar != null && h7bVar.i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        vr4 vr4Var3 = new vr4(this, this.c, this.b, this.a, xl6Var, z, z4, z2);
        this.N0 = vr4Var3;
        vr4Var3.H.setVisibility(8);
        this.N0.setMultipleOnClick(h7bVar.i());
        this.N0.setMaxCount(Math.min(10, fk2.b() - h7bVar.getFilledCount()));
        this.N0.setOnBackClickListener(new o6b(this, (byte) 0));
        this.N0.setOnSelectListener(new vn2(this, z, (byte) 2));
        this.N0.setOnSelectMultipleListener(new ef6(this, (byte) 2));
        s26 s26Var = this.m2;
        if (s26Var != null) {
            ar0 ar0Var = this.N0.e;
            ar0Var.B = s26Var;
            ar0Var.k0();
        }
        this.n.addView(this.N0, nme.e(-1, -1, 119));
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.s():void");
    }

    public final void t(boolean z) {
        dv8 dv8Var = this.D0;
        if (dv8Var != null) {
            dv8Var.f = null;
            Utilities.e.a((av8) dv8Var.h);
            this.D0 = null;
            h7b h7bVar = this.B0;
            if (h7bVar != null) {
                h7bVar.c.c(null);
            }
        }
        lq9 lq9Var = this.E0;
        if (lq9Var != null) {
            lq9Var.G = null;
            lq9Var.H = null;
            lq9Var.invalidate();
        }
        if (this.C0 != null) {
            if (z) {
                a0(new d6b(this, (byte) 8));
                return;
            }
            a0(new d6b(this, (byte) 9));
            this.C0.destroy(true, null);
            gl.B2(this.C0);
            h7b h7bVar2 = this.B0;
            if (h7bVar2 != null) {
                h7bVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void u() {
        vr4 vr4Var = this.N0;
        if (vr4Var == null) {
            return;
        }
        this.n.removeView(vr4Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        yla ylaVar = this.p2;
        if (ylaVar != null) {
            ylaVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void w() {
        l58 l58Var = this.C1;
        if (l58Var == null) {
            return;
        }
        l58Var.c();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        g7b g7bVar = this.i0;
        if (textureView != null) {
            g7bVar.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        c58 c58Var = this.F1;
        if (c58Var != null) {
            g7bVar.removeView(c58Var);
            this.F1 = null;
        }
        e58 e58Var = this.G1;
        if (e58Var != null) {
            g7bVar.removeView(e58Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void x() {
        x6b x6bVar = this.w1;
        if (x6bVar != null) {
            x6bVar.H0.removeAllViews();
            x6b x6bVar2 = this.w1;
            yb1 yb1Var = x6bVar2.a2;
            if (yb1Var != null) {
                yb1Var.b.c();
                jb4 jb4Var = yb1Var.c;
                if (jb4Var != null) {
                    jb4Var.f = null;
                    m21 m21Var = (m21) jb4Var.g;
                    if (m21Var != null) {
                        m21Var.b();
                        jb4Var.g = null;
                    }
                    yb1Var.c = null;
                }
            }
            x6bVar2.E0.h();
            x6bVar2.H0.setVisibility(8);
            x6bVar2.G0.setVisibility(8);
            x6bVar2.u0.postRunnable(new am6((byte) 9));
            mt7 mt7Var = x6bVar2.e2;
            if (mt7Var != null) {
                mt7Var.dismiss();
            }
            yl2 yl2Var = x6bVar2.J1;
            if (yl2Var != null) {
                yl2Var.dismiss();
            }
            this.r.removeView(this.w1);
            this.w1 = null;
            c79 c79Var = this.x1;
            g7b g7bVar = this.i0;
            if (c79Var != null) {
                g7bVar.removeView(c79Var);
                this.x1 = null;
            }
            View view = this.z1;
            if (view != null) {
                g7bVar.removeView(view);
                this.z1 = null;
            }
            View view2 = this.y1;
            if (view2 != null) {
                g7bVar.removeView(view2);
                this.y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                g7bVar.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                g7bVar.removeView(view4);
                this.B1 = null;
            }
        }
    }

    public final Drawable y() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.a.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.b.getResources().getDrawable(2131231495);
    }

    public final int z() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        f4b f4bVar = this.L1;
        if (f4bVar != null) {
            return f4bVar.r();
        }
        return 1;
    }
}
