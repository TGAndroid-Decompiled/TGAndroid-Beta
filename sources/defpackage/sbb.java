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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class sbb implements fn7 {
    public static sbb G2;
    public al2 A0;
    public View A1;
    public boolean A2;
    public final gbb B0;
    public View B1;
    public boolean B2;
    public xab C0;
    public c98 C1;
    public boolean C2;
    public oy8 D0;
    public final b98 D1;
    public cbb D2;
    public final e26 E;
    public final du9 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final ntb F0;
    public t88 F1;
    public ValueAnimator F2;
    public nbb G;
    public final otb G0;
    public v88 G1;
    public float H;
    public final fl2 H0;
    public File H1;
    public final RectF I;
    public final ntb I0;
    public ArrayList I1;
    public float J;
    public final el2 J0;
    public ArrayList J1;
    public boolean K;
    public final rgc K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public c8b L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public zt4 N0;
    public long N1;
    public long O;
    public vq3 O0;
    public boolean O1;
    public boolean P;
    public final u59 P0;
    public int P1;
    public final pn Q;
    public final c51 Q0;
    public boolean Q1;
    public Runnable R;
    public final pab R0;
    public boolean R1;
    public mcc S;
    public final pk4 S0;
    public boolean S1;
    public int T;
    public final pk4 T0;
    public boolean T1;
    public int U;
    public final hg5 U0;
    public float U1;
    public int V;
    public final hg5 V0;
    public int V1;
    public boolean W;
    public final r3d W0;
    public boolean W1;
    public boolean X;
    public final kg5 X0;
    public boolean X1;
    public boolean Y;
    public final hbb Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final x53 a;
    public int a0;
    public final ksb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final igc b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final im8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final ibb d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final oab e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final fq3 f1;
    public Runnable f2;
    public byte g0;
    public b29 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final e29 h1;
    public n3b h2;
    public final fbb i0;
    public b29 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final a81 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final kg5 l1;
    public boolean l2;
    public final h8b m0;
    public final kg5 m1;
    public w46 m2;
    public final rbb n;
    public final FrameLayout n0;
    public final kg5 n1;
    public do6 n2;
    public final pk4 o0;
    public final kg5 o1;
    public ValueAnimator o2;
    public final i2a p0;
    public final jm8 p1;
    public vpa p2;
    public final ema q0;
    public final j5c q1;
    public Boolean q2;
    public final kbb r;
    public w9b r0;
    public xb1 r1;
    public lab r2;
    public final rk4 s;
    public final tl0 s0;
    public dbb s1;
    public AnimatorSet s2;
    public final o00 t0;
    public ebb t1;
    public boolean t2;
    public final nf9 u0;
    public final ksb u1;
    public int u2;
    public boolean v0;
    public final c51 v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public wab w1;
    public obb w2;
    public long x;
    public String x0;
    public pa9 x1;
    public boolean x2;
    public jbb y;
    public TLRPC.InputPeer y0;
    public View y1;
    public bab y2;
    public u9b z0;
    public View z1;
    public hl3 z2;

    public sbb(Activity activity, int i) {
        int i2;
        int i3;
        int i4;
        float f;
        byte b;
        boolean z;
        float f2;
        x53 x53Var = new x53();
        this.a = x53Var;
        this.x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new pn(null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        this.g0 = (byte) 0;
        this.h0 = -1;
        this.z0 = new u9b();
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
        sab sabVar = new sab(this);
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
        hl.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        rbb rbbVar = new rbb(this, activity);
        this.n = rbbVar;
        kab kabVar = new kab(this, (byte) 1);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(rbbVar, kabVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        rk4 rk4Var = new rk4(activity, windowManager, this.n, layoutParams);
        this.s = rk4Var;
        rk4Var.a(new abb(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        rbb rbbVar2 = this.n;
        kbb kbbVar = new kbb(this, activity);
        this.r = kbbVar;
        rbbVar2.addView(kbbVar);
        kbb kbbVar2 = this.r;
        fbb fbbVar = new fbb(this, activity);
        this.i0 = fbbVar;
        kbbVar2.addView(fbbVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new tl0(this.i0);
        this.t0 = new Object();
        kbb kbbVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        kbbVar3.addView(frameLayout);
        kbb kbbVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        kbbVar4.addView(frameLayout2);
        kbb kbbVar5 = this.r;
        h8b h8bVar = new h8b((byte) 1, activity, this);
        this.m0 = h8bVar;
        kbbVar5.addView(h8bVar);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        kbb kbbVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        kbbVar6.addView(frameLayout3);
        v21.a(this.n, new py((byte) 15));
        gbb gbbVar = new gbb(this, activity, this.s0, this.r, x53Var);
        this.B0 = gbbVar;
        rbb rbbVar3 = this.n;
        Objects.requireNonNull(rbbVar3);
        gbbVar.setCancelGestures(new s8b(rbbVar3, (byte) 3));
        this.B0.setResetState(new bab(this, (byte) 11));
        this.i0.addView(this.B0, tre.e(-1, -1, 119));
        this.B0.setOnClickListener(new eab(this, (byte) 12));
        fbb fbbVar2 = this.i0;
        boolean z2 = this.K;
        if (!z2 && z2) {
            i2 = -14737633;
        } else {
            i2 = 0;
        }
        fbbVar2.setBackgroundColor(i2);
        fbb fbbVar3 = this.i0;
        yi yiVar = yhc.a;
        fbbVar3.setOutlineProvider(new whc(0, hl.L(12.0f)));
        this.i0.setClipToOutline(true);
        bab babVar = new bab(this, (byte) 12);
        ?? view = new View(activity);
        view.a = new TextPaint(1);
        view.b = new TextPaint(1);
        k43 k43Var = k43.h;
        view.s = new mm((View) view, 0L, 350L, k43Var);
        view.J = new x38(view, (byte) 6);
        view.y = babVar;
        this.D1 = view;
        hbb hbbVar = new hbb(this, activity, this.s0, this.t0);
        this.Y0 = hbbVar;
        hbbVar.setCollageView(this.B0);
        hbb hbbVar2 = this.Y0;
        hbbVar2.w = new bab(this, (byte) 13);
        hbbVar2.setOnTapListener(new bab(this, (byte) 14));
        this.Y0.setVisibility(8);
        hbb hbbVar3 = this.Y0;
        hbbVar3.O = new bab(this, (byte) 15);
        this.i0.addView(hbbVar3, tre.e(-1, -1, 119));
        this.i0.addView(this.D1, tre.e(-1, -1, 119));
        rbb rbbVar4 = this.n;
        ibb ibbVar = new ibb(this, activity, rbbVar4, rbbVar4, this.r, x53Var, this.s0);
        this.d1 = ibbVar;
        ibbVar.setAccount(i);
        this.d1.setUiBlurBitmap(new bya((byte) 4));
        v21.a(this.m0, new t10(this, (byte) 21));
        this.d1.setOnHeightUpdate(new dab(this, (byte) 12));
        this.d1.setOnPeriodUpdate(new dab(this, (byte) 3));
        long j = this.O;
        if (j != 0) {
            this.d1.setDialogId(j);
        }
        this.d1.setOnPremiumHint(new dab(this, (byte) 4));
        this.d1.setOnKeyboardOpen(new dab(this, (byte) 5));
        nf9 nf9Var = new nf9((byte) 12, activity, this);
        this.u0 = nf9Var;
        this.r.addView(nf9Var);
        ksb ksbVar = new ksb(activity, this.r, this.i0, x53Var, this.s0);
        this.a1 = ksbVar;
        ksbVar.setOnTimelineClick(new bab(this, (byte) 8));
        this.a1.setOnHeightChange(new bab(this, (byte) 9));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        frameLayout4.addView(this.a1, tre.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        igc igcVar = new igc(activity);
        this.b1 = igcVar;
        igcVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, tre.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, tre.d(-1, 413.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, tre.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        ksb ksbVar2 = new ksb(activity, this.r, this.i0, x53Var, this.s0);
        this.u1 = ksbVar2;
        ksbVar2.Y0 = true;
        ksbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, tre.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        oab oabVar = new oab(this, activity, x53Var, this.s0);
        this.e1 = oabVar;
        oabVar.setVisibility(8);
        this.m0.addView(this.e1, tre.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.o0 = imageView;
        imageView.setContentDescription(ob6.M0(2131754874, null));
        pk4 pk4Var = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pk4Var.setScaleType(scaleType);
        this.o0.setImageResource(2131232282);
        pk4 pk4Var2 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        pk4Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(aob.f0(553648127, 1, -1));
        this.o0.setOnClickListener(new eab(this, (byte) 1));
        this.j0.addView(this.o0, tre.e(56, 56, 51));
        this.s.a(this.o0);
        i2a i2aVar = new i2a(activity, i);
        this.p0 = i2aVar;
        i2aVar.a(false, false);
        this.p0.setOnClickListener(new jy8(this, activity, (byte) 26));
        this.j0.addView(this.p0, tre.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        ema emaVar = new ema(activity);
        this.q0 = emaVar;
        emaVar.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(hl.o());
        this.q0.l(ob6.M0(2131746080, null), false);
        this.q0.getPaint().setShadowLayer(hl.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(hl.L(144.0f));
        this.j0.addView(this.q0, tre.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, tre.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        dab dabVar = new dab(this, (byte) 6);
        rbb rbbVar5 = this.n;
        ?? imageView2 = new ImageView(activity);
        imageView2.x = true;
        imageView2.y = true;
        imageView2.h = dabVar;
        imageView2.a = i;
        imageView2.b = rbbVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(aob.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new mh3(imageView2, (byte) 4));
        imageView2.f = new di2(hl.L(18.0f), hl.L(2.0f), -1);
        imageView2.d();
        this.f1 = imageView2;
        kg5 kg5Var = new kg5(activity, 1);
        kg5Var.n(1.0f, -71.0f);
        kg5Var.d = 2000L;
        kg5Var.V = false;
        kg5Var.I.r(true, false);
        this.l1 = kg5Var;
        kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.j0.addView(this.l1, tre.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.h1 = imageView3;
        imageView3.setScaleType(scaleType);
        e29 e29Var = this.h1;
        c8b c8bVar = this.L1;
        if (c8bVar != null && c8bVar.Y) {
            i3 = 2131231763;
        } else {
            i3 = 2131231754;
        }
        e29Var.setImageResource(i3);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(aob.f0(553648127, 1, -1));
        this.h1.setOnClickListener(new eab(this, (byte) 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        a81 a81Var = new a81(activity);
        this.k1 = a81Var;
        a81Var.setBackground(aob.f0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new eab(this, (byte) 3));
        this.k0.addView(this.k1, tre.r(46, 56, 53));
        this.k0.addView(this.h1, tre.r(46, 56, 53));
        this.k0.addView(this.f1, tre.e(46, 56, 53));
        ntb ntbVar = new ntb(activity);
        this.F0 = ntbVar;
        ntbVar.setBackground(aob.f0(553648127, 1, -1));
        this.F0.setOnClickListener(new eab(this, (byte) 4));
        this.F0.setOnLongClickListener(new zs(this, (byte) 18));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, tre.e(56, 56, 53));
        otb otbVar = new otb(activity);
        this.G0 = otbVar;
        otbVar.setContentDescription(ob6.M0(2131754882, null));
        this.G0.setOnClickListener(new eab(this, (byte) 5));
        boolean g0 = as3.g0(activity);
        otb otbVar2 = this.G0;
        if (g0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        otbVar2.setVisibility(i4);
        otb otbVar3 = this.G0;
        if (g0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        otbVar3.setAlpha(f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, tre.e(56, 56, 53));
        ?? ntbVar2 = new ntb(activity);
        this.H0 = ntbVar2;
        ntbVar2.setContentDescription(ob6.M0(2131754891, null));
        this.H0.setBackground(aob.f0(553648127, 1, -1));
        if (this.A0 == null) {
            b = 6;
            this.A0 = (al2) al2.a().get(6);
        } else {
            b = 6;
        }
        this.H0.setOnClickListener(new eab(this, b));
        this.H0.a(new bl2(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, tre.e(56, 56, 53));
        ntb ntbVar3 = new ntb(activity);
        this.I0 = ntbVar3;
        ntbVar3.setContentDescription(ob6.M0(2131754890, null));
        this.I0.setBackground(aob.f0(553648127, 1, -1));
        this.I0.a(new bl2(new al2("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new eab(this, (byte) 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, tre.e(56, 56, 53));
        el2 el2Var = new el2(activity, this.s);
        this.J0 = el2Var;
        el2Var.a.x0(6);
        this.J0.setSelected((al2) null);
        this.J0.setOnLayoutClick(new dab(this, (byte) 7));
        this.j0.addView(this.J0, tre.e(-1, 56, 53));
        kg5 kg5Var2 = new kg5(activity, 1);
        kg5Var2.n(1.0f, -20.0f);
        kg5Var2.d = 5000L;
        kg5Var2.j(true);
        kg5Var2.t(ob6.M0(2131744370, null));
        kg5Var2.r0 = new osa((byte) 4);
        this.m1 = kg5Var2;
        kg5Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.j0.addView(this.m1, tre.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        kg5 kg5Var3 = new kg5(activity, 2);
        kg5Var3.n(0.0f, 28.0f);
        kg5Var3.d = 5000L;
        kg5Var3.p(true);
        this.n1 = kg5Var3;
        this.j0.addView(kg5Var3, tre.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        kg5 kg5Var4 = new kg5(activity, 1);
        kg5Var4.n(1.0f, -20.0f);
        kg5Var4.d = 5000L;
        kg5Var4.t(ob6.M0(2131744358, null));
        this.o1 = kg5Var4;
        kg5Var4.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.j0.addView(this.o1, tre.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.a = paint;
        Paint paint2 = new Paint(1);
        view2.b = paint2;
        view2.e = new mm((View) view2, 0L, 250L, k43Var);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        hn hnVar = new hn(false, true, true);
        view2.c = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.w(hl.L(13.0f));
        hnVar.u(-1);
        hnVar.x(hl.o());
        hnVar.setCallback(view2);
        hnVar.b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.j0.addView(this.K0, tre.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.R(0);
        u59 u59Var = new u59(activity);
        this.P0 = u59Var;
        u59Var.setDelegate(sabVar);
        u59 u59Var2 = this.P0;
        if (this.P1 == 1) {
            z = true;
        } else {
            z = false;
        }
        u59Var2.o0 = -1.0f;
        u59Var2.p0 = z;
        u59Var2.invalidate();
        this.l0.addView(this.P0, tre.e(-1, 100, 87));
        this.s.a(this.P0);
        u59 u59Var3 = this.P0;
        if (this.B0.i()) {
            f2 = this.B0.getFilledProgress();
        } else {
            f2 = 0.0f;
        }
        u59Var3.e(true, f2);
        c51 c51Var = new c51(x53Var, activity, true);
        this.Q0 = c51Var;
        c51Var.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(ob6.M0(2131748542, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, tre.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new eab(this, (byte) 8));
        kg5 kg5Var5 = new kg5(activity, 3);
        kg5Var5.p(true);
        kg5Var5.t(ob6.M0(2131744368, null));
        kg5Var5.h = hl.L(320.0f);
        kg5Var5.d = 5000L;
        kg5Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = kg5Var5;
        this.l0.addView(kg5Var5, tre.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        r3d r3dVar = new r3d(activity);
        this.W0 = r3dVar;
        r3dVar.N = false;
        r3dVar.setAlpha(0.0f);
        this.l0.addView(this.W0, tre.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new kab(this, (byte) 4));
        r3d r3dVar2 = this.W0;
        this.U1 = 0.0f;
        r3dVar2.b(false, 0.0f);
        du9 du9Var = new du9(activity, i, new bab(this, (byte) 10));
        this.E0 = du9Var;
        du9Var.c = new dab(this, (byte) 8);
        this.l0.addView(du9Var, tre.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        pab pabVar = new pab(this, activity);
        this.R0 = pabVar;
        pabVar.setOnSwitchModeListener(new dab(this, (byte) 9));
        this.R0.setOnSwitchingModeListener(new dab(this, (byte) 10));
        this.n0.addView(this.R0, tre.e(-1, 48, 55));
        this.s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(ob6.M0(2131754747, null));
        this.S0.setImageResource(2131232790);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(aob.f0(553648127, 1, -1));
        this.n0.addView(this.S0, tre.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new eab(this, (byte) 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(ob6.M0(2131748544, null));
        this.T0.setImageResource(2131232791);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(aob.f0(553648127, 1, -1));
        this.n0.addView(this.T0, tre.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new eab(this, (byte) 10));
        hg5 hg5Var = new hg5(activity);
        this.U0 = hg5Var;
        this.n0.addView(hg5Var, tre.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        hg5 hg5Var2 = new hg5(activity);
        this.V0 = hg5Var2;
        hg5Var2.a.t(ob6.M0(2131744357, null), false, true);
        hg5Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, tre.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        c51 c51Var2 = new c51(x53Var, activity, true);
        c51Var2.setRoundRadius(24);
        this.v1 = c51Var2;
        c51Var2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(ob6.M0(2131744343, null), false, true);
        this.v1.setOnClickListener(new eab(this, (byte) 11));
        this.n0.addView(this.v1, tre.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, tre.e(-1, -1, 119));
        frameLayout5.a(0, 2131231743, ob6.M0(2131754809, null));
        frameLayout5.a(2, 2131232289, ob6.M0(2131754751, null));
        frameLayout5.a(1, 2131232291, ob6.M0(2131754802, null));
        frameLayout5.a(3, 2131231733, ob6.M0(2131751664, null));
        frameLayout5.a(4, 2131232288, ob6.M0(2131754806, null));
        String M0 = ob6.M0(2131745368, null);
        frameLayout5.d = M0;
        frameLayout5.e = true;
        hm8 hm8Var = new hm8(frameLayout5, activity, M0, true);
        frameLayout5.c = hm8Var;
        hm8Var.setContentDescription(ob6.M0(2131745368, null));
        frameLayout5.addView(frameLayout5.c, tre.c(-2.0f, -2));
        frameLayout5.e();
        this.c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.c1.setOnClickListener(new dab(this, (byte) 11));
        this.n0.addView(this.c1, tre.e(-1, 52, 23));
        j5c j5cVar = new j5c(activity);
        this.q1 = j5cVar;
        j5cVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, tre.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        jm8 jm8Var = new jm8(activity, i, x53Var);
        this.p1 = jm8Var;
        this.i0.addView(jm8Var, tre.e(-1, -1, 119));
        l0(false);
    }

    public static sbb C(Activity activity, int i) {
        sbb sbbVar = G2;
        if (sbbVar != null && (sbbVar.b != activity || sbbVar.c != i)) {
            sbbVar.o(false);
            sbbVar = null;
            G2 = null;
        }
        if (sbbVar == null) {
            sbb sbbVar2 = new sbb(activity, i);
            G2 = sbbVar2;
            return sbbVar2;
        }
        return sbbVar;
    }

    public static SpannableString k(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable e = c00.e(context, 2131232788);
        int L = hl.L(35.0f);
        int i = -L;
        e.setBounds(i / 4, i, (L / 4) * 3, 0);
        spannableString.setSpan(new bbb(e, e), 0, 1, 33);
        return spannableString;
    }

    public static void v() {
        sbb sbbVar = G2;
        if (sbbVar != null) {
            sbbVar.o(false);
        }
        G2 = null;
    }

    public final String A() {
        xab xabVar = this.C0;
        if (xabVar != null && xabVar.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                m();
                return (String) this.v2.get(this.u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final vq3 B() {
        if (this.O0 == null) {
            vq3 vq3Var = new vq3(this.b);
            this.O0 = vq3Var;
            this.l0.addView(vq3Var, tre.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String D() {
        int i;
        xab xabVar = this.C0;
        if (xabVar != null && xabVar.getCameraSession() != null) {
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
            b29 b29Var = new b29(2131624235, hl.L(28.0f), hl.L(28.0f), true, null);
            this.i1 = b29Var;
            b29Var.h = true;
            c8b c8bVar = this.L1;
            if (c8bVar != null && c8bVar.y0) {
                b29Var.H(35);
                this.i1.K(36);
            } else {
                b29Var.K(0);
                this.i1.H(0);
            }
            this.i1.a0 = true;
            int v0 = aob.v0(aob.J9, this.a);
            this.i1.L(v0, "Sunny");
            this.i1.L(v0, "Path 6");
            this.i1.L(v0, "Path");
            this.i1.L(v0, "Path 5");
            this.i1.j();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(aob.f0(553648127, 1, -1));
            this.j1.setOnClickListener(new eab(this, (byte) 0));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, tre.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void F() {
        wab wabVar = this.w1;
        if (wabVar == null) {
            return;
        }
        this.w2 = null;
        wabVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-hl.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(hl.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-hl.L(32.0f));
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
        zt4 zt4Var;
        if (!this.X && (zt4Var = this.N0) != null) {
            if (zt4Var.getTranslationY() < (this.n.getMeasuredHeight() - ((int) (hl.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + hl.m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void I(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbb.I(int, boolean):void");
    }

    public final void J(Runnable runnable, long j) {
        if (!this.T1 && this.L1 != null) {
            n3b n3bVar = this.h2;
            if (n3bVar != null) {
                hl.r(n3bVar);
            }
            this.i2 = true;
            this.T1 = true;
            this.h2 = new n3b(this, runnable, (byte) 29);
            hbb hbbVar = this.Y0;
            hbbVar.setAlpha(0.0f);
            hbbVar.setVisibility(0);
            hbbVar.n(this.L1, this.h2, j);
            hbbVar.q(this.L1, false);
            hl.d3(this.h2, 800L);
        }
    }

    public final boolean K() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbb.K():boolean");
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
        u59 u59Var = this.P0;
        int i9 = 8;
        if (i == 0) {
            t(false);
            u59Var.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            e(false, false);
            c0(false);
        }
        ibb ibbVar = this.d1;
        h8b h8bVar = this.m0;
        if (i == 2) {
            this.u1.setVisibility(8);
            if (i2 == 1) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            h8bVar.setVisibility(i8);
            ibbVar.setVisibility(8);
            this.v1.setVisibility(8);
        }
        igc igcVar = this.b1;
        hbb hbbVar = this.Y0;
        if (i == 1) {
            this.c1.setVisibility(8);
            if (i2 == 2) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            h8bVar.setVisibility(i5);
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
            hbbVar.setVisibility(i6);
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
            j5c j5cVar = this.q1;
            j5cVar.setAlpha(0.0f);
            j5cVar.setVisibility(8);
            igcVar.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        b98 b98Var = this.D1;
        if (i2 == 1) {
            c8b c8bVar = this.L1;
            if (c8bVar == null || !c8bVar.n) {
                s();
                F();
            }
            if (b98Var != null) {
                b98Var.setAllowTouch(false);
            }
            hbbVar.x(2, false);
            hbbVar.x(3, false);
            hbbVar.x(4, false);
            hbbVar.x(5, false);
            hbbVar.x(7, false);
            c8b c8bVar2 = this.L1;
            j = 0;
            if (c8bVar2 != null && c8bVar2.h0 >= 30000) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            igcVar.setVisibility(i4);
            h8bVar.setAlpha(1.0f);
            h8bVar.setTranslationY(0.0f);
            c8b c8bVar3 = this.L1;
            if (c8bVar3 == null || c8bVar3.J0 == 0) {
                i9 = 0;
            }
            ibbVar.setVisibility(i9);
        } else {
            j = 0;
        }
        if (i2 == 0 && this.W1) {
            B().setVisibility(0);
            vq3 B = B();
            B.r.e(true, 0.0f);
            B.a(true);
            zg3 zg3Var = B.h;
            if (zg3Var != null) {
                hl.r(zg3Var);
            }
            zg3 zg3Var2 = new zg3(B, (byte) 17);
            B.h = zg3Var2;
            hl.d3(zg3Var2, 3500L);
            u59Var.h();
        }
        this.W1 = false;
        if (b98Var != null) {
            if (i2 == 1 && ((i3 = this.h0) == -1 || i3 == 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            b98Var.setAllowTouch(z2);
        }
        if (ibbVar != null) {
            if (i2 != 1) {
                z = true;
            } else {
                z = false;
            }
            ibbVar.e0 = z;
        }
        if (i2 == 1) {
            int i10 = this.c;
            ls6.d0(i10).D(0);
            ls6.d0(i10).X0(false, true, false, 0);
            ls6.d0(i10).X0(false, true, false, 2);
            c6b O1 = uc7.s1(i10).O1();
            if (O1.Q == j) {
                O1.R();
            }
            uc7.s1(i10).O1().T();
        }
    }

    public final void M(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbb.M(int, int):void");
    }

    public final void N() {
        this.d = true;
        this.w = false;
        if (this.K) {
            fbb fbbVar = this.i0;
            fbbVar.setAlpha(1.0f);
            fbbVar.setTranslationX(0.0f);
            fbbVar.setTranslationY(0.0f);
            this.j0.setAlpha(1.0f);
            this.l0.setAlpha(1.0f);
            this.n.setBackgroundColor(-16777216);
            if (this.g0 == 2) {
                this.v1.setAlpha(1.0f);
            }
        }
        bab babVar = this.y2;
        if (babVar != null) {
            babVar.run();
            this.y2 = null;
        } else {
            O();
        }
        c8b c8bVar = this.L1;
        if (c8bVar != null) {
            if (c8bVar.n) {
                s();
                F();
                q();
            } else if (c8bVar.u) {
                if (c8bVar.K) {
                    this.Y0.t(c8bVar, null, 0L);
                }
                q();
            }
        }
    }

    public final void O() {
        na9 na9Var;
        int i;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.y2 = new bab(this, (byte) 5);
            } else {
                Z(false);
            }
        }
        ibb ibbVar = this.d1;
        if (ibbVar != null) {
            ibbVar.f.s();
        }
        u59 u59Var = this.P0;
        if (u59Var != null) {
            u59Var.h();
        }
        jm8 jm8Var = this.p1;
        if (jm8Var != null) {
            c6b O1 = uc7.s1(jm8Var.a).O1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) O1.i.f(yac.h(O1.a).n);
            if (peerStories != null) {
                i = peerStories.stories.size();
            } else {
                i = 0;
            }
            jm8Var.b = O1.b.m() + i + 1;
            jm8Var.c.invalidate();
        }
        wab wabVar = this.w1;
        if (wabVar != null && (na9Var = wabVar.y0.d) != null) {
            na9Var.postRunnable(na9Var.x);
        }
        hbb hbbVar = this.Y0;
        if (hbbVar != null) {
            hbbVar.x(0, false);
        }
        ar3 ar3Var = uc7.s1(this.c).O1().w;
        if (!ar3Var.c && !ar3Var.d) {
            ar3Var.d = true;
            wq3 wq3Var = new wq3(ar3Var, (byte) 1);
            kf7 a0 = kf7.a0(ar3Var.a);
            a0.a.c(new ds6((Object) a0, false, (Object) wq3Var, (byte) 18));
        }
    }

    public final void P(int i, int i2) {
        boolean z;
        wab wabVar;
        dbb dbbVar;
        ebb ebbVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        wab wabVar2;
        if (i2 == 0) {
            this.o0.setVisibility(8);
        }
        if (i == 0 && (wabVar2 = this.w1) != null) {
            wabVar2.setVisibility(8);
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
        if ((i2 == 0 || i == 0) && (wabVar = this.w1) != null) {
            wabVar.N0.setLayerType(0, null);
        }
        b98 b98Var = this.D1;
        if (b98Var != null) {
            if (i2 != 1 && i2 != -1) {
                z2 = false;
            }
            b98Var.setAllowTouch(z2);
        }
        if (i2 == 3) {
            dbb dbbVar2 = this.s1;
            if (dbbVar2 != null) {
                dbbVar2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (dbbVar = this.s1) != null) {
            dbbVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            dbb dbbVar3 = this.s1;
            dbbVar3.y = null;
            i33 i33Var = dbbVar3.f;
            i33Var.M = null;
            i33Var.d = null;
            i33Var.K = false;
            dbbVar3.d.setVisibility(8);
            dbbVar3.a.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            ebb ebbVar2 = this.t1;
            if (ebbVar2 != null) {
                ebbVar2.setAppearProgress(1.0f);
            }
        } else if (i == 4 && (ebbVar = this.t1) != null) {
            ebbVar.setVisibility(8);
            this.t1.setAppearProgress(0.0f);
            ebb ebbVar3 = this.t1;
            ebbVar3.b = null;
            i33 i33Var2 = ebbVar3.h;
            i33Var2.M = null;
            i33Var2.d = null;
            i33Var2.K = false;
            ebbVar3.e.setVisibility(8);
            ebbVar3.setVisibility(8);
        }
    }

    public final void Q(mbb mbbVar) {
        xx n;
        rbb rbbVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (uc7.s1(i).x2()) {
            i5.b(i);
            return;
        }
        int i2 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (rbbVar = this.n) != null && rbbVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            hl.s3(windowManager, rbbVar, layoutParams);
            windowManager.addView(rbbVar, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(y());
        if (this.w0 == 0 && (n = uc7.s1(i).O1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        I(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (mbbVar != null) {
            this.G = mbbVar;
            this.K = mbbVar.a;
            rectF.set(mbbVar.c);
            this.H = mbbVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = hl.q;
            rectF.set(0.0f, hl.L(100.0f), point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
        }
        kbb kbbVar = this.r;
        kbbVar.c();
        boolean z = this.K;
        if (!z && z) {
            i2 = -14737633;
        }
        this.i0.setBackgroundColor(i2);
        kbbVar.setTranslationX(0.0f);
        kbbVar.setTranslationY(0.0f);
        kbbVar.b(0.0f);
        kbbVar.setScaleX(1.0f);
        kbbVar.setScaleY(1.0f);
        this.L = 0.0f;
        hl.e2(this.b);
        d(1.0f, true, new bab(this, (byte) 22));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(lbb lbbVar, c8b c8bVar, long j) {
        int i;
        View view;
        if (this.d) {
            return;
        }
        int i2 = this.c;
        if (uc7.s1(i2).x2()) {
            i5.b(i2);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (view = this.n) != null && view.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            hl.s3(windowManager, view, layoutParams);
            windowManager.addView(view, layoutParams);
            f0();
        }
        this.L1 = c8bVar;
        this.P1 = c8bVar.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (lbbVar != null) {
            this.G = lbbVar;
            this.K = lbbVar.a;
            rectF.set(lbbVar.c);
            this.H = lbbVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = hl.q;
            rectF.set(0.0f, hl.L(100.0f), point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
        }
        kbb kbbVar = this.r;
        kbbVar.c();
        boolean z = this.K;
        int i3 = 1;
        if (!z && z) {
            i = -14737633;
        } else {
            i = 0;
        }
        this.i0.setBackgroundColor(i);
        kbbVar.setTranslationX(0.0f);
        kbbVar.setTranslationY(0.0f);
        kbbVar.b(0.0f);
        kbbVar.setScaleX(1.0f);
        kbbVar.setScaleY(1.0f);
        this.L = 0.0f;
        hl.e2(this.b);
        c8b c8bVar2 = this.L1;
        if (c8bVar2 != null) {
            this.d1.setText(c8bVar2.C0);
        }
        J(new bab(this, (byte) 1), j);
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
        fu5 fu5Var;
        hbb hbbVar = this.Y0;
        if (hbbVar != null) {
            hbbVar.x(4, true);
        }
        ibb ibbVar = this.d1;
        if (ibbVar != null && (fu5Var = ibbVar.V0) != null) {
            fu5Var.u();
            ibbVar.V0 = null;
        }
        xk8 xk8Var = new xk8((e) new yab(this, (byte) 1), 14, false);
        xk8Var.setOnDismissListener(new cab(this, (byte) 0));
        xk8Var.show();
    }

    public final void T(lbb lbbVar, c8b c8bVar) {
        int i;
        boolean z;
        int i2;
        xx n;
        rbb rbbVar;
        if (this.d) {
            return;
        }
        int i3 = this.c;
        if (uc7.s1(i3).x2()) {
            i5.b(i3);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (rbbVar = this.n) != null && rbbVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            hl.s3(windowManager, rbbVar, layoutParams);
            windowManager.addView(rbbVar, layoutParams);
            f0();
        }
        this.L1 = c8bVar;
        y9b.a(i3, c8bVar);
        c8b c8bVar2 = this.L1;
        if (c8bVar2 != null && c8bVar2.K) {
            i = 1;
        } else {
            i = 0;
        }
        this.P1 = i;
        if (c8bVar2 != null && c8bVar2.u && i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.t0.g = z;
        if (this.w0 == 0 && (n = uc7.s1(i3).O1().n()) != null && n.a(i3, 1)) {
            g0(n, true);
        }
        RectF rectF = this.I;
        if (lbbVar != null) {
            this.G = lbbVar;
            this.K = lbbVar.a;
            rectF.set(lbbVar.c);
            this.H = lbbVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = hl.q;
            rectF.set(0.0f, hl.L(100.0f), point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
        }
        kbb kbbVar = this.r;
        kbbVar.c();
        boolean z2 = this.K;
        if (!z2 && z2) {
            i2 = -14737633;
        } else {
            i2 = 0;
        }
        this.i0.setBackgroundColor(i2);
        kbbVar.setTranslationX(0.0f);
        kbbVar.setTranslationY(0.0f);
        kbbVar.b(0.0f);
        kbbVar.setScaleX(1.0f);
        kbbVar.setScaleY(1.0f);
        this.L = 0.0f;
        hl.e2(this.b);
        c8b c8bVar3 = this.L1;
        if (c8bVar3 != null) {
            this.d1.setText(c8bVar3.C0);
        }
        this.c1.b(true, false);
        I(1, false);
        k0(-1, false, false);
        d(1.0f, true, new bab(this, (byte) 22));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        pa9 pa9Var = this.x1;
        if (pa9Var != null) {
            pa9Var.bringToFront();
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
        j5c j5cVar = this.q1;
        if (j5cVar != null) {
            j5cVar.bringToFront();
        }
        b98 b98Var = this.D1;
        if (b98Var != null) {
            b98Var.bringToFront();
        }
        t88 t88Var = this.F1;
        if (t88Var != null) {
            t88Var.bringToFront();
        }
        v88 v88Var = this.G1;
        if (v88Var != null) {
            v88Var.bringToFront();
        }
        jm8 jm8Var = this.p1;
        if (jm8Var != null) {
            jm8Var.bringToFront();
        }
        xb1 xb1Var = this.r1;
        if (xb1Var != null) {
            xb1Var.bringToFront();
        }
    }

    public final void V(c8b c8bVar, boolean z) {
        File file;
        View view;
        float f;
        c8b c8bVar2;
        boolean z2;
        int i;
        if (c8bVar != null && this.Y0.getWidth() > 0 && this.Y0.getHeight() > 0) {
            if (z) {
                file = c8bVar.O0;
            } else {
                file = c8bVar.N0;
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
            hl.m0 = true;
            view.draw(canvas);
            hl.m0 = false;
            canvas.restore();
            Paint paint = new Paint(2);
            kec textureView = this.Y0.getTextureView();
            if (c8bVar.K && !c8bVar.u && textureView != null) {
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
            File file2 = c8bVar.Q0;
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
                    cc4.g(e, true);
                }
            }
            File file3 = c8bVar.P0;
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
                    cc4.g(e2, true);
                }
            }
            wab wabVar = this.w1;
            if (wabVar != null && wabVar.B0 != null) {
                canvas.save();
                canvas.scale(f, f);
                wab wabVar2 = this.w1;
                wabVar2.s0 = true;
                zw7 zw7Var = wabVar2.B0;
                zw7Var.a = true;
                zw7Var.draw(canvas);
                wab wabVar3 = this.w1;
                wabVar3.B0.a = false;
                wabVar3.s0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w = c8b.w(this.c, "jpg");
            if (z) {
                c8bVar2 = c8bVar;
                z2 = z;
                Utilities.g.c(new va7(this, createBitmap, z2, w, c8bVar2, (byte) 22));
            } else {
                c8bVar2 = c8bVar;
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
                    cc4.g(e3, true);
                }
            }
            if (!z2) {
                c8bVar2.N0 = w;
            }
            c8bVar2.b1 = createScaledBitmap;
        }
    }

    public final void W() {
        xx n;
        int size;
        View[] viewPages;
        i8c[] i8cVarArr;
        w9b w9bVar = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (w9bVar != null) {
            w9bVar.dismiss();
            this.r0 = null;
        }
        boolean z = this.O1;
        yw0 yw0Var = yw0.APP_ERROR;
        if (z) {
            fq3 fq3Var = this.f1;
            fq3Var.getClass();
            fq3Var.c(ob6.N0("VideoConvertFail"));
            yw0Var.a();
            hm8 hm8Var = this.c1.c;
            int i = -this.V1;
            this.V1 = i;
            hl.A3(i, hm8Var, null);
            return;
        }
        ibb ibbVar = this.d1;
        if (ibbVar != null && ibbVar.o()) {
            yw0Var.a();
            in inVar = ibbVar.w;
            int i2 = -this.V1;
            this.V1 = i2;
            hl.A3(i2, inVar, null);
            ibbVar.e();
            return;
        }
        c8b c8bVar = this.L1;
        int i3 = this.c;
        if ((c8bVar == null || (!c8bVar.g && c8bVar.J0 == 0)) && (n = uc7.s1(i3).e0.n()) != null && n.a(i3, z())) {
            g0(n, false);
            return;
        }
        this.L1.D0 = uc7.s1(i3).l5();
        x53 x53Var = this.a;
        if (ibbVar != null && !this.L1.D0) {
            CharSequence text = ibbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((smb[]) spannable.getSpans(0, text.length(), smb.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new d31(this.n, x53Var).Q(2131624341, 36, hl.N2(ob6.M0(2131744235, null), aob.Xc, 0, new bab(this, (byte) 26), x53Var)).k(true);
                    int i4 = -this.V1;
                    this.V1 = i4;
                    hl.A3(i4, ibbVar, null);
                    return;
                }
            }
        }
        c8b c8bVar2 = this.L1;
        if (!c8bVar2.g && c8bVar2.J0 == 0) {
            if (this.O != 0) {
                c8bVar2.v0 = uc7.s1(i3).j1(this.O);
            }
            hbb hbbVar = this.Y0;
            hbbVar.x(3, true);
            w9b w9bVar2 = new w9b(this.b, this.L1.I0, x53Var);
            w9bVar2.S0(this.L1.E0);
            w9bVar2.R0(this.L1.v0);
            w9bVar2.z1 = this.N;
            w9bVar2.O1 = new dab(this, (byte) 13);
            w9bVar2.F0(!this.B0.i());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            w9bVar2.O0(size);
            w9bVar2.M0(false);
            CharSequence text2 = ibbVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (i8c i8cVar : (i8c[]) ((Spanned) text2).getSpans(0, text2.length(), i8c.class)) {
                    if (i8cVar != null) {
                        try {
                            TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(Long.parseLong(i8cVar.getURL())));
                            if (X1 != null && !lbc.D(X1) && lbc.p(X1) != null && !arrayList2.contains(X1)) {
                                arrayList2.add(lbc.p(X1));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i5 = -1;
                for (int i6 = 0; i6 < text2.length(); i6++) {
                    char charAt = text2.charAt(i6);
                    if (charAt == '@') {
                        i5 = i6 + 1;
                    } else if (charAt == ' ') {
                        if (i5 != -1) {
                            String charSequence = text2.subSequence(i5, i6).toString();
                            TLObject c2 = uc7.s1(i3).c2(charSequence);
                            if (c2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) c2;
                                if (!user.bot && !lbc.D(user) && user.id != 777000 && !lbc.B(user) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i5 = -1;
                    }
                }
                if (i5 != -1) {
                    String charSequence2 = text2.subSequence(i5, text2.length()).toString();
                    TLObject c22 = uc7.s1(i3).c2(charSequence2);
                    if (c22 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) c22;
                        if (!user2.bot && !lbc.D(user2) && user2.id != 777000 && !lbc.B(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            }
            w9bVar2.M1 = arrayList2;
            w9bVar2.Q1 = new dab(this, (byte) 14);
            w9bVar2.R1 = new dab(this, (byte) 15);
            w9bVar2.N1 = new kab(this, (byte) 9);
            this.r0 = w9bVar2;
            c8b c8bVar3 = this.L1;
            if (c8bVar3.K) {
                if (hbbVar != null && !c8bVar3.f0 && this.g0 != 2) {
                    c8bVar3.e0 = hbbVar.getCurrentPosition();
                    hbbVar.g(new dab(this, (byte) 16), hbbVar, this.x1, this.A1);
                }
                w9b w9bVar3 = this.r0;
                Bitmap bitmap = this.L1.g0;
                bab babVar = new bab(this, (byte) 19);
                if (bitmap != null) {
                    w9bVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                w9bVar3.V1 = bitmapDrawable;
                w9bVar3.W1 = babVar;
                ir1 ir1Var = w9bVar3.l1;
                if (ir1Var != null) {
                    for (View view : ir1Var.getViewPages()) {
                        if (view instanceof r9b) {
                            r9b r9bVar = (r9b) view;
                            r9bVar.h(false);
                            r9bVar.f(false);
                        }
                    }
                }
            }
            this.r0.setOnDismissListener(new cab(this, (byte) 1));
            this.r0.show();
            return;
        }
        c8bVar2.l = false;
        f(null);
        o0();
    }

    public final void X(nbb nbbVar) {
        int i = 0;
        RectF rectF = this.I;
        if (nbbVar != null) {
            this.G = nbbVar;
            this.K = nbbVar.a;
            rectF.set(nbbVar.c);
            this.H = nbbVar.b;
        } else {
            this.G = null;
            this.K = false;
            Point point = hl.q;
            rectF.set(0.0f, hl.L(100.0f), point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
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
                    Drawable mutate = activity.getResources().getDrawable(2131232788).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    zm2 zm2Var = new zm2(new ColorDrawable(-14540254), mutate);
                    int L = hl.L(64.0f);
                    int L2 = hl.L(64.0f);
                    zm2Var.e = L;
                    zm2Var.f = L2;
                    this.B0.setCameraThumb(zm2Var);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, activity);
                        int i = aob.L5;
                        alertDialog$Builder.l(2131624117, 72, aob.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747035, null));
                        id idVar = alertDialog$Builder.a;
                        idVar.U = S2;
                        alertDialog$Builder.j(ob6.M0(2131747027, null), new kab(this, (byte) 12));
                        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                        idVar.show();
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
                    CameraController.getInstance().initCamera(new bab(this, (byte) 0));
                }
            }
        }
    }

    public final void a() {
        jn7.e().a(this, jn7.r2);
        int i = this.c;
        jn7.f(i).a(this, jn7.B5);
        jn7.f(i).a(this, jn7.d3);
    }

    public final void a0(Runnable runnable) {
        xab xabVar = this.C0;
        if (xabVar != null && xabVar.getTextureView() != null) {
            try {
                Utilities.i.c(new pwa(this, this.C0.getTextureView().getBitmap(), runnable, (byte) 16));
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
        kbb kbbVar = this.r;
        float f = kbbVar.a;
        float f2 = kbbVar.b;
        kbbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new gy1(this, f, f2, (byte) 6));
        this.k2.setDuration(340L);
        this.k2.setInterpolator(k43.h);
        this.k2.addListener(new uab(this, (byte) 0));
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
            animate.alpha(f).setUpdateListener(new vab(this, (byte) 1)).setListener(new rw(this, z, view, (byte) 14)).setDuration(320L).setInterpolator(k43.h).start();
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
        vq3 vq3Var;
        this.L0 = z;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z) {
            zt4 zt4Var = this.N0;
            if (zt4Var == null) {
                if (z) {
                    r(false);
                }
                zt4Var = this.N0;
                if (zt4Var == null) {
                    return;
                }
            }
            if (zt4Var.V) {
                this.r2 = new lab(this, z, (byte) 0);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            vpa vpaVar = this.p2;
            if (vpaVar != null) {
                vpaVar.d();
                this.p2 = null;
            }
            zt4 zt4Var2 = this.N0;
            if (zt4Var2 == null) {
                if (z) {
                    r(false);
                }
                zt4Var2 = this.N0;
                if (zt4Var2 == null) {
                    return;
                }
            }
            zt4Var2.L = false;
            if (z && (vq3Var = this.O0) != null) {
                vq3Var.a(false);
            }
            int i2 = 4;
            kbb kbbVar = this.r;
            if (kbbVar != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                kbbVar.setImportantForAccessibility(i);
            }
            zt4 zt4Var3 = this.N0;
            if (z) {
                i2 = 0;
            }
            zt4Var3.setImportantForAccessibility(i2);
            this.q2 = Boolean.valueOf(z);
            float translationY = this.N0.getTranslationY();
            rbb rbbVar = this.n;
            if (z) {
                height = 0.0f;
            } else {
                height = (rbbVar.getHeight() - this.N0.g()) + (hl.n * 2.5f);
            }
            rbbVar.getHeight();
            zt4 zt4Var4 = this.N0;
            zt4Var4.L = !z;
            if (this.k2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.l2 = z2;
            if (z) {
                vpa vpaVar2 = new vpa(zt4Var4, vpa.p, height);
                this.p2 = vpaVar2;
                vpaVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new f22(this, height, (byte) 2));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new mab(this, (byte) 0));
                this.o2.addListener(new uab(this, (byte) 1));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(k43.h);
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
            cc4.g(e, true);
        }
    }

    public final void d(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        kbb kbbVar = this.r;
        if (z) {
            this.Q.d();
            jn7.e().k(jn7.j1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new mab(this, (byte) 5));
            this.F.addListener(new ok4(this, f, runnable, (byte) 5));
            if (f < 1.0f && this.w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(k43.h);
            } else if (f <= 0.0f && kbbVar.a >= hl.L(20.0f)) {
                if (f < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(k43.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(k43.h);
                }
            } else {
                this.F.setDuration(300L);
                this.F.setInterpolator(new x84());
            }
            this.F.start();
            return;
        }
        this.M = null;
        this.J = f;
        h();
        kbbVar.invalidate();
        this.n.invalidate();
        runnable.run();
        l();
    }

    public final void d0(String str) {
        int i;
        ntb ntbVar = this.F0;
        ntbVar.clearAnimation();
        xab xabVar = this.C0;
        if ((xabVar != null && xabVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z = false;
        if (str == null) {
            b0(ntbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    ntbVar.setContentDescription(ob6.M0(2131754911, null));
                    i = 2131231755;
                }
            } else {
                str.equals("off");
            }
            ntbVar.setContentDescription(ob6.M0(2131754910, null));
            i = 2131231756;
        } else {
            if (str.equals("on")) {
                ntbVar.setContentDescription(ob6.M0(2131754909, null));
                i = 2131231757;
            }
            ntbVar.setContentDescription(ob6.M0(2131754910, null));
            i = 2131231756;
        }
        if (ntbVar.n != i) {
            ntbVar.n = i;
            ValueAnimator valueAnimator = ntbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ntbVar.r = null;
            }
            ntbVar.setDrawable(i);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !G()) {
            z = true;
        }
        b0(ntbVar, z, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xx n;
        c8b c8bVar;
        int i3 = jn7.r2;
        u59 u59Var = this.P0;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == i3) {
            if (u59Var != null) {
                u59Var.h();
            }
            if (this.n2 != null && MediaController.c2 != null) {
                for (int i4 = 0; i4 < MediaController.c2.size(); i4++) {
                    do6 do6Var = (do6) MediaController.c2.get(i4);
                    int i5 = do6Var.a;
                    do6 do6Var2 = this.n2;
                    if (i5 == do6Var2.a && do6Var.b == do6Var2.b) {
                        this.n2 = do6Var;
                        return;
                    }
                }
            }
        } else if (i == jn7.B5) {
            if (u59Var != null && !this.W1) {
                u59Var.h();
            }
        } else if (i == jn7.d3) {
            byte b = this.g0;
            int i6 = this.c;
            if (b == 1) {
                if (!this.O1 && !this.d1.o()) {
                    c6b O1 = uc7.s1(i6).O1();
                    int z2 = z();
                    xx n2 = O1.n();
                    if (n2 == null || !n2.a(O1.a, z2) || ((c8bVar = this.L1) != null && (c8bVar.g || c8bVar.J0 != 0))) {
                        z = true;
                    }
                }
                this.c1.setShareEnabled(z);
            } else if (b == 0 && (n = uc7.s1(i6).O1().n()) != null && n.a(i6, 1)) {
                c8b c8bVar2 = this.L1;
                if (c8bVar2 == null || c8bVar2.J0 == 0) {
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
        el2 el2Var;
        if (z) {
            kg5 kg5Var = this.m1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = this.n1;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
            kg5 kg5Var3 = this.l1;
            if (kg5Var3 != null) {
                kg5Var3.f(true);
            }
            kg5 kg5Var4 = this.X0;
            if (kg5Var4 != null) {
                kg5Var4.f(true);
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
        if (z && (el2Var = this.J0) != null && el2Var.e) {
            el2Var.a(false, z2);
        }
        l0(z2);
        pab pabVar = this.R0;
        hg5 hg5Var = this.V0;
        hg5 hg5Var2 = this.U0;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hg5Var2, property, f2);
            Property property2 = View.TRANSLATION_Y;
            if (z && this.g0 == 0 && !G()) {
                L3 = 0.0f;
            } else {
                L3 = hl.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hg5Var2, property2, L3);
            if (z || this.g0 != 0 || !G()) {
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hg5Var, property, f3);
            if (!z && this.g0 == 0 && G()) {
                L4 = 0.0f;
            } else {
                L4 = hl.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hg5Var, property2, L4);
            if (z || this.g0 != 0 || G()) {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pabVar, property, f4);
            if (z || this.g0 != 0 || G()) {
                f5 = hl.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(pabVar, property2, f5));
            this.a2.setDuration(260L);
            this.a2.setInterpolator(k43.h);
            this.a2.start();
            return;
        }
        if (z && this.g0 == 0 && !G()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        hg5Var2.setAlpha(f);
        if (z && this.g0 == 0 && !G()) {
            L = 0.0f;
        } else {
            L = hl.L(16.0f);
        }
        hg5Var2.setTranslationY(L);
        if (z || this.g0 != 0 || !G()) {
            f3 = 0.0f;
        }
        hg5Var.setAlpha(f3);
        if (!z && this.g0 == 0 && G()) {
            L2 = 0.0f;
        } else {
            L2 = hl.L(16.0f);
        }
        hg5Var.setTranslationY(L2);
        if (z || this.g0 != 0 || G()) {
            f4 = 0.0f;
        }
        pabVar.setAlpha(f4);
        if (z || this.g0 != 0 || G()) {
            f5 = hl.L(16.0f);
        }
        pabVar.setTranslationY(f5);
    }

    public final void e0(boolean z, boolean z2) {
        b29 b29Var = this.g1;
        if (b29Var == null) {
            b29 b29Var2 = new b29(2131624089, hl.L(28.0f), hl.L(28.0f), true, null);
            this.g1 = b29Var2;
            b29Var2.G *= 1.5f;
            b29Var = b29Var2;
        }
        this.h1.setAnimation(b29Var);
        b29 b29Var3 = this.g1;
        int i = 20;
        if (!z2) {
            if (!z) {
                i = 0;
            }
            b29Var3.I(i, false, false);
        } else if (z) {
            if (b29Var3.b0 > 20) {
                b29Var3.I(0, false, false);
            }
            this.g1.K(20);
            this.g1.start();
        } else {
            int i2 = b29Var3.b0;
            if (i2 != 0 && i2 < 43) {
                b29Var3.K(43);
                this.g1.start();
            }
        }
    }

    public final void f(Runnable runnable) {
        c8b c8bVar;
        Runnable runnable2;
        hbb hbbVar;
        float f;
        boolean z;
        Bitmap.CompressFormat compressFormat;
        c98 c98Var = this.C1;
        if (c98Var != null && (c8bVar = this.L1) != null) {
            c8bVar.j |= c98Var.b();
            c8b c8bVar2 = this.L1;
            c98 c98Var2 = this.C1;
            File file = c8bVar2.Z0;
            if (file != null) {
                file.delete();
                c8bVar2.Z0 = null;
            }
            po6 savedFilterState = c98Var2.getSavedFilterState();
            c8bVar2.a1 = savedFilterState;
            if (!c8bVar2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = c98Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i = c8bVar2.R;
                        float f2 = 1.0f;
                        if (i == 1) {
                            f = -1.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (i == 2) {
                            f2 = -1.0f;
                        }
                        matrix.postScale(f, f2, c8bVar2.k0 / 2.0f, c8bVar2.l0 / 2.0f);
                        matrix.postRotate(-c8bVar2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        c8bVar2.n0.preScale(c8bVar2.k0 / createBitmap.getWidth(), c8bVar2.l0 / createBitmap.getHeight());
                        c8bVar2.k0 = createBitmap.getWidth();
                        c8bVar2.l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = c8bVar2.Z0;
                        if (file2 != null && file2.exists()) {
                            c8bVar2.Z0.delete();
                        }
                        String k = c8b.k(c8bVar2.L);
                        String str = "webp";
                        if (!"png".equals(k) && !"webp".equals(k)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int i2 = c8bVar2.a;
                        if (!z) {
                            str = "jpg";
                        }
                        c8bVar2.Z0 = c8b.w(i2, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(c8bVar2.Z0);
                                if (z) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.i.c(new lb7(c8bVar2, createBitmap, z, runnable2, (byte) 16));
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
                c8b c8bVar3 = this.L1;
                if (!c8bVar3.K && (hbbVar = this.Y0) != null) {
                    hbbVar.set(c8bVar3);
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
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new vo(this, (byte) 3));
    }

    public final void g() {
        if (this.L1 != null && this.E1 != null) {
            fbb fbbVar = this.i0;
            if (fbbVar.getMeasuredWidth() > 0 && fbbVar.getMeasuredHeight() > 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                int i = this.L1.Q;
                if (i != 0) {
                    matrix.postRotate(-i, fbbVar.getMeasuredWidth() / 2.0f, fbbVar.getMeasuredHeight() / 2.0f);
                    if ((this.L1.Q / 90) % 2 == 1) {
                        matrix.postScale(fbbVar.getMeasuredWidth() / fbbVar.getMeasuredHeight(), fbbVar.getMeasuredHeight() / fbbVar.getMeasuredWidth(), fbbVar.getMeasuredWidth() / 2.0f, fbbVar.getMeasuredHeight() / 2.0f);
                    }
                }
                matrix.postScale((1.0f / fbbVar.getMeasuredWidth()) * this.L1.k0, (1.0f / fbbVar.getMeasuredHeight()) * this.L1.l0);
                matrix.postConcat(this.L1.n0);
                matrix.postScale(fbbVar.getMeasuredWidth() / this.L1.i0, fbbVar.getMeasuredHeight() / this.L1.j0);
                this.E1.setTransform(matrix);
                this.E1.invalidate();
            }
        }
    }

    public final void g0(xx xxVar, boolean z) {
        if (this.A2) {
            return;
        }
        l46 l46Var = new l46(xxVar.b(), this.c, null, this.b, new yab(this, (byte) 0));
        l46Var.S1 = z();
        l46Var.setOnDismissListener(new lw1(this, z, (byte) 1));
        this.Y0.x(7, true);
        this.A2 = true;
        l46Var.show();
    }

    public final void h() {
        u58 u58Var;
        if (this.K) {
            fbb fbbVar = this.i0;
            RectF rectF = this.e0;
            rectF.set(fbbVar.getLeft(), fbbVar.getTop(), fbbVar.getMeasuredWidth(), fbbVar.getMeasuredHeight());
            kbb kbbVar = this.r;
            rectF.offset(kbbVar.getX(), kbbVar.getY());
            float f = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.d0;
            hl.X1(rectF2, rectF, f, rectF3);
            fbbVar.setAlpha(this.J);
            fbbVar.setTranslationX((rectF3.left - fbbVar.getLeft()) - kbbVar.getX());
            fbbVar.setTranslationY((rectF3.top - fbbVar.getTop()) - kbbVar.getY());
            nbb nbbVar = this.G;
            if (nbbVar != null && (u58Var = nbbVar.f) != null) {
                u58Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            fbbVar.setScaleX(rectF3.width() / fbbVar.getMeasuredWidth());
            fbbVar.setScaleY(rectF3.height() / fbbVar.getMeasuredHeight());
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
            rgc rgcVar = this.K0;
            if (z2) {
                ViewPropertyAnimator animate = rgcVar.animate();
                if (z) {
                    f = 1.0f;
                }
                animate.alpha(f).setDuration(350L).setInterpolator(k43.h).withEndAction(new lab(this, z, (byte) 1)).start();
                return;
            }
            rgcVar.clearAnimation();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbb.i():void");
    }

    public final void i0(boolean z) {
        Integer num;
        float f;
        r3d r3dVar = this.W0;
        if (r3dVar.getTag() != null && z) {
            Runnable runnable = this.f2;
            if (runnable != null) {
                hl.r(runnable);
            }
            bab babVar = new bab(this, (byte) 24);
            this.f2 = babVar;
            hl.d3(babVar, 2000L);
        } else if (r3dVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.g2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            r3dVar.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g2 = animatorSet2;
            animatorSet2.setDuration(180L);
            if (z) {
                r3dVar.setVisibility(0);
            }
            AnimatorSet animatorSet3 = this.g2;
            Property property = View.ALPHA;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(r3dVar, property, f));
            this.g2.addListener(new i1a((byte) 5, this, z));
            this.g2.start();
            if (z) {
                bab babVar2 = new bab(this, (byte) 25);
                this.f2 = babVar2;
                hl.d3(babVar2, 2000L);
            }
        }
    }

    public final void j() {
        c8b c8bVar;
        boolean z;
        if (this.w1 != null && (c8bVar = this.L1) != null && c8bVar.u) {
            File file = c8bVar.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                c8bVar = this.L1;
                c8bVar.W0 = null;
            }
            c8bVar.W0 = c8b.w(this.c, "webp");
            wab wabVar = this.w1;
            c8b c8bVar2 = this.L1;
            ArrayList arrayList = c8bVar2.T0;
            if (this.P1 != 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap q0 = wabVar.q0(arrayList, false, false, true, z, c8bVar2);
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
                cc4.g(e2, true);
                try {
                    this.L1.W0.delete();
                } catch (Exception e3) {
                    cc4.g(e3, true);
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
        w9b w9bVar = this.r0;
        if (w9bVar != null) {
            w9bVar.dismiss();
            this.r0 = null;
        }
        w9b w9bVar2 = new w9b(this.b, 86400, this.a);
        w9bVar2.Q0();
        w9bVar2.S0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = uc7.s1(this.c).j1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        w9bVar2.R0(inputPeer);
        w9bVar2.z1 = this.N;
        w9bVar2.O1 = new dab(this, (byte) 17);
        w9bVar2.F0(false);
        w9bVar2.O0(1);
        w9bVar2.M0(false);
        w9bVar2.Q1 = new dab(this, (byte) 18);
        w9bVar2.N1 = new kab(this, (byte) 11);
        this.r0 = w9bVar2;
        w9bVar2.show();
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbb.k0(int, boolean, boolean):void");
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
        e26 e26Var = this.E;
        if (e26Var != null) {
            e26Var.b(!z);
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
        xab xabVar;
        byte b = this.g0;
        el2 el2Var = this.J0;
        boolean z8 = false;
        if (b == 0 && this.P1 == 1 && !el2Var.e && !G()) {
            z2 = true;
        } else {
            z2 = false;
        }
        h0(z2, z);
        gbb gbbVar = this.B0;
        boolean i = gbbVar.i();
        fl2 fl2Var = this.H0;
        fl2Var.setSelected(i);
        if (el2Var != null && el2Var.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        b0(this.o0, z3, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && this.Z1 != null && !el2Var.e && !G()) {
            z4 = true;
        } else {
            z4 = false;
        }
        b0(this.F0, z4, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && (xabVar = this.C0) != null && xabVar.a && !el2Var.e && !gbbVar.i()) {
            z5 = true;
        } else {
            z5 = false;
        }
        b0(this.G0, z5, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && !el2Var.e) {
            z6 = true;
        } else {
            z6 = false;
        }
        b0(fl2Var, z6, z);
        b0(this.I0, el2Var.e, z);
        if (gbbVar.i()) {
            f = gbbVar.getFilledProgress();
        } else {
            f = 0.0f;
        }
        this.P0.e(z, f);
        boolean z9 = el2Var.e;
        kg5 kg5Var = this.o1;
        if (z9) {
            kg5Var.v();
        } else {
            kg5Var.f(true);
        }
        e(this.b2, z);
        if (this.P1 == -1 && this.g0 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        hl.P3(this.T0, z7, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z8 = true;
        }
        hl.P3(this.S0, z8, true);
    }

    public final void m() {
        if (this.u2 < 0) {
            this.u2 = uc7.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f = uc7.e1().getFloat("frontflash_warmth", 0.9f);
            rk4 rk4Var = this.s;
            rk4Var.o = f;
            rk4Var.n = rk4.f(f);
            rk4Var.g();
            rk4Var.p = uc7.e1().getFloat("frontflash_intensity", 1.0f);
            rk4Var.i();
        }
    }

    public final void m0() {
        ntb ntbVar = this.I0;
        ntbVar.setTranslationX(-0.0f);
        float alpha = (ntbVar.getAlpha() * hl.L(46.0f)) + 0.0f;
        otb otbVar = this.G0;
        otbVar.setTranslationX(-alpha);
        float alpha2 = (otbVar.getAlpha() * hl.L(46.0f)) + alpha;
        fl2 fl2Var = this.H0;
        fl2Var.setTranslationX(-alpha2);
        float alpha3 = (fl2Var.getAlpha() * hl.L(46.0f)) + alpha2;
        ntb ntbVar2 = this.F0;
        ntbVar2.setTranslationX(-alpha3);
        float alpha4 = ntbVar2.getAlpha();
        pk4 pk4Var = this.o0;
        pk4Var.setTranslationX(0.0f);
        float alpha5 = pk4Var.getAlpha();
        float L = (alpha4 * hl.L(46.0f)) + alpha3 + hl.L(8.0f);
        iw iwVar = this.J0.a;
        iwVar.setPadding((int) ((alpha5 * hl.L(46.0f)) + 0.0f + hl.L(8.0f)), 0, (int) L, 0);
        iwVar.invalidate();
    }

    public final void n() {
        xab xabVar = this.C0;
        boolean z = false;
        if (xabVar != null && xabVar.getTextureView() != null) {
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
                    f += hl.B(bitmap.getPixel((i + 1) * width, i2 * height));
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
        b29 b29Var = this.i1;
        if (b29Var != null) {
            int[] iArr = b29Var.e;
            c8b c8bVar = this.L1;
            int i2 = 0;
            if (z) {
                if (c8bVar != null && c8bVar.y0) {
                    i2 = iArr[0];
                }
                b29Var.K(i2);
                b29 b29Var2 = this.i1;
                if (b29Var2 != null) {
                    b29Var2.start();
                    return;
                }
                return;
            }
            if (c8bVar != null && c8bVar.y0) {
                i = iArr[0] - 1;
            } else {
                i = 0;
            }
            b29Var.I(i, false, true);
            this.i1.K(i);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o(boolean z) {
        if (this.d) {
            w9b w9bVar = this.r0;
            if (w9bVar != null) {
                w9bVar.dismiss();
                this.r0 = null;
            }
            c8b c8bVar = this.L1;
            long j = 0;
            if (c8bVar != null && !c8bVar.h) {
                if ((this.w && c8bVar.g) || c8bVar.b != 0) {
                    c8bVar.j = false;
                }
                c8bVar.i(false);
            }
            this.L1 = null;
            mcc mccVar = this.S;
            hbb hbbVar = this.Y0;
            if (mccVar != null && hbbVar != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                kfc kfcVar = hbbVar.E;
                if (kfcVar != null) {
                    kfcVar.f0();
                    hbbVar.E.l0();
                    hbbVar.E = null;
                }
                kfc kfcVar2 = hbbVar.y;
                if (kfcVar2 != null) {
                    j = kfcVar2.S();
                    hbbVar.y.f0();
                    hbbVar.y.l0();
                    hbbVar.y = null;
                }
                kfc kfcVar3 = hbbVar.e;
                if (kfcVar3 != null) {
                    j = kfcVar3.S();
                    hbbVar.e.f0();
                    hbbVar.e.l0();
                    hbbVar.e = null;
                }
                mccVar.a(Long.valueOf(j), new lab(this, z, (byte) 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
                return;
            }
            if (hbbVar != null && !z) {
                hbbVar.set(null);
            }
            d(0.0f, z, new nab(this, (byte) 1));
            boolean z2 = this.K;
            if (z2 || !z2) {
                this.n.setBackgroundColor(0);
                this.c1.b(false, true);
            }
            jn7.e().n(this, jn7.r2);
            int i = this.c;
            jn7.f(i).n(this, jn7.B5);
            jn7.f(i).n(this, jn7.d3);
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        nab nabVar = new nab(this, (byte) 0);
        wab wabVar = this.w1;
        c8b c8bVar = this.L1;
        if (wabVar != null && c8bVar != null) {
            c8bVar.f();
            boolean r0 = wabVar.r0();
            boolean z = wabVar.y0.getPainting().E;
            Utilities.g.c(new b6a(this, wabVar, c8bVar.i0, c8bVar.j0, c8bVar, z, r0, nabVar, (byte) 1));
            return;
        }
        nabVar.run();
    }

    public final void p() {
        boolean z;
        Activity activity = this.b;
        if (this.C0 == null && activity != null) {
            this.C0 = new xab(this, activity, uc7.e1().getBoolean("stories_camera", false));
            u59 u59Var = this.P0;
            float f = 0.0f;
            if (u59Var != null) {
                u59Var.h0 = 0.0f;
                u59Var.i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.i();
            this.C0.setThumbDrawable(y());
            this.C0.initTexture();
            this.C0.setDelegate(new kab(this, (byte) 0));
            otb otbVar = this.G0;
            if (this.C0.a && this.g0 == 0) {
                z = true;
            } else {
                z = false;
            }
            b0(otbVar, z, true);
            fl2 fl2Var = this.H0;
            if (!this.C0.a) {
                f = hl.L(46.0f);
            }
            fl2Var.setTranslationX(f);
            this.B0.setCameraView(this.C0);
            if (uc7.e1().getInt("storyhint2", 0) < 1) {
                this.X0.v();
                uc7.e1().edit().putInt("storyhint2", uc7.e1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!as3.g0(this.C0.getContext()) || !uc7.e1().getBoolean("dualcam", as3.f0(org.telegram.messenger.a.b, false))) && this.C0.a && uc7.e1().getInt("storydualhint", 0) < 2) {
                this.m1.v();
            }
            oy8 oy8Var = this.D0;
            if (oy8Var == null) {
                oy8Var = new oy8(activity, new dab(this, (byte) 2));
                this.D0 = oy8Var;
            }
            oy8Var.a(this.C0);
            du9 du9Var = this.E0;
            if (du9Var != null) {
                gbb gbbVar = this.B0;
                Object blurRenderNode = gbbVar.getBlurRenderNode();
                du9Var.G = gbbVar;
                du9Var.H = blurRenderNode;
                du9Var.invalidate();
            }
        }
    }

    public final boolean p0() {
        xab xabVar;
        if ((this.Q1 || this.R1) && (xabVar = this.C0) != null && xabVar.isFrontface()) {
            int i = this.u2;
            if (i == 2 || (i == 1 && this.d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        c8b c8bVar;
        Bitmap bitmap;
        Bitmap q;
        if (this.C1 == null && (c8bVar = this.L1) != null) {
            boolean z = c8bVar.K;
            hbb hbbVar = this.Y0;
            po6 po6Var = null;
            if (!z) {
                if (c8bVar.Z0 == null) {
                    q = hbbVar.getPhotoBitmap();
                } else {
                    kab kabVar = new kab(this, (byte) 10);
                    Point point = hl.q;
                    q = c8b.q(kabVar, point.x, point.y, 0, true);
                }
                bitmap = q;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                kec textureView = hbbVar.getTextureView();
                int orientation = hbbVar.getOrientation();
                c8b c8bVar2 = this.L1;
                if (c8bVar2 != null) {
                    po6Var = c8bVar2.a1;
                }
                c98 c98Var = new c98(this.b, textureView, bitmap, null, orientation, po6Var, null, 0, false, false, this.s0, this.a);
                this.C1 = c98Var;
                this.r.addView(c98Var);
                b98 b98Var = this.D1;
                if (b98Var != null) {
                    b98Var.setFilterView(this.C1);
                }
                TextureView myTextureView = this.C1.getMyTextureView();
                this.E1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                hbbVar.o(this.E1, this.C1);
                TextureView textureView2 = this.E1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.E1.animate().alpha(1.0f).setDuration(220L).start();
                }
                g();
                t88 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                fbb fbbVar = this.i0;
                if (blurControl != null) {
                    fbbVar.addView(blurControl);
                }
                v88 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    fbbVar.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new eab(this, (byte) 13));
                this.C1.getCancelTextView().setOnClickListener(new eab(this, (byte) 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(hl.L(186.0f));
                this.C1.j0.setVisibility(0);
            }
        }
    }

    public final void r(boolean z) {
        boolean z2;
        boolean z3;
        zt4 zt4Var = this.N0;
        gbb gbbVar = this.B0;
        if (zt4Var != null) {
            if (gbbVar != null && gbbVar.i()) {
                z3 = true;
            } else {
                z3 = false;
            }
            zt4 zt4Var2 = this.N0;
            if (z3 != zt4Var2.Q) {
                zt4Var = zt4Var2;
            } else {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (zt4Var != null) {
            u();
        }
        do6 do6Var = this.n2;
        boolean z4 = !z;
        if (gbbVar != null && gbbVar.i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        zt4 zt4Var3 = new zt4(this, this.c, this.b, this.a, do6Var, z, z4, z2);
        this.N0 = zt4Var3;
        zt4Var3.H.setVisibility(8);
        this.N0.setMultipleOnClick(gbbVar.i());
        this.N0.setMaxCount(Math.min(10, al2.b() - gbbVar.getFilledCount()));
        this.N0.setOnBackClickListener(new bab(this, (byte) 28));
        this.N0.setOnSelectListener(new oo2(this, z, (byte) 2));
        this.N0.setOnSelectMultipleListener(new ih6(this, (byte) 2));
        w46 w46Var = this.m2;
        if (w46Var != null) {
            ar0 ar0Var = this.N0.e;
            ar0Var.B = w46Var;
            ar0Var.k0();
        }
        this.n.addView(this.N0, tre.e(-1, -1, 119));
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbb.s():void");
    }

    public final void t(boolean z) {
        oy8 oy8Var = this.D0;
        if (oy8Var != null) {
            oy8Var.f = null;
            Utilities.e.a((ly8) oy8Var.h);
            this.D0 = null;
            gbb gbbVar = this.B0;
            if (gbbVar != null) {
                gbbVar.c.c(null);
            }
        }
        du9 du9Var = this.E0;
        if (du9Var != null) {
            du9Var.G = null;
            du9Var.H = null;
            du9Var.invalidate();
        }
        if (this.C0 != null) {
            if (z) {
                a0(new bab(this, (byte) 6));
                return;
            }
            a0(new bab(this, (byte) 7));
            this.C0.destroy(true, null);
            hl.B2(this.C0);
            gbb gbbVar2 = this.B0;
            if (gbbVar2 != null) {
                gbbVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void u() {
        zt4 zt4Var = this.N0;
        if (zt4Var == null) {
            return;
        }
        this.n.removeView(zt4Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        vpa vpaVar = this.p2;
        if (vpaVar != null) {
            vpaVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void w() {
        c98 c98Var = this.C1;
        if (c98Var == null) {
            return;
        }
        c98Var.c();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        fbb fbbVar = this.i0;
        if (textureView != null) {
            fbbVar.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        t88 t88Var = this.F1;
        if (t88Var != null) {
            fbbVar.removeView(t88Var);
            this.F1 = null;
        }
        v88 v88Var = this.G1;
        if (v88Var != null) {
            fbbVar.removeView(v88Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void x() {
        wab wabVar = this.w1;
        if (wabVar != null) {
            wabVar.B0.removeAllViews();
            wab wabVar2 = this.w1;
            gc1 gc1Var = wabVar2.U1;
            if (gc1Var != null) {
                gc1Var.b.c();
                gd4 gd4Var = gc1Var.c;
                if (gd4Var != null) {
                    gd4Var.f = null;
                    v21 v21Var = (v21) gd4Var.g;
                    if (v21Var != null) {
                        v21Var.b();
                        gd4Var.g = null;
                    }
                    gc1Var.c = null;
                }
            }
            wabVar2.y0.h();
            wabVar2.B0.setVisibility(8);
            wabVar2.A0.setVisibility(8);
            wabVar2.o0.postRunnable(new pg6((byte) 12));
            tw7 tw7Var = wabVar2.Y1;
            if (tw7Var != null) {
                tw7Var.dismiss();
            }
            sm2 sm2Var = wabVar2.D1;
            if (sm2Var != null) {
                sm2Var.dismiss();
            }
            this.r.removeView(this.w1);
            this.w1 = null;
            pa9 pa9Var = this.x1;
            fbb fbbVar = this.i0;
            if (pa9Var != null) {
                fbbVar.removeView(pa9Var);
                this.x1 = null;
            }
            View view = this.z1;
            if (view != null) {
                fbbVar.removeView(view);
                this.z1 = null;
            }
            View view2 = this.y1;
            if (view2 != null) {
                fbbVar.removeView(view2);
                this.y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                fbbVar.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                fbbVar.removeView(view4);
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
        c8b c8bVar = this.L1;
        if (c8bVar != null) {
            return c8bVar.r();
        }
        return 1;
    }
}
