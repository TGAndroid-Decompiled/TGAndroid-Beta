package hi;

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
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.ve;
import org.telegram.messenger.vr;
import org.telegram.messenger.w10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
public final class sa implements is {
    public static sa G2;
    public t A0;
    public View A1;
    public boolean A2;
    public final fa B0;
    public View B1;
    public boolean B2;
    public v9 C0;
    public td0 C1;
    public boolean C2;
    public b6 D0;
    public final sd0 D1;
    public aa D2;
    public final bg.u0 E;
    public final p6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final db F0;
    public kd0 F1;
    public ValueAnimator F2;
    public na G;
    public final eb G0;
    public md0 G1;
    public float H;
    public final z H0;
    public File H1;
    public final RectF I;
    public final db I0;
    public ArrayList I1;
    public float J;
    public final y J0;
    public ArrayList J1;
    public int K;
    public final hb K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public d7 L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public g3 N0;
    public long N1;
    public long O;
    public v0 O0;
    public boolean O1;
    public boolean P;
    public final f6 P0;
    public int P1;
    public final h2.f Q;
    public final d Q0;
    public boolean Q1;
    public Runnable R;
    public final m9 R0;
    public boolean R1;
    public w10 S;
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
    public final s71 W0;
    public boolean W1;
    public boolean X;
    public final l3 X0;
    public boolean X1;
    public boolean Y;
    public final ga Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final fi.b f15035a;
    public int f15036a0;
    public final cb f15037a1;
    public AnimatorSet f15038a2;
    public final Activity f15039b;
    public int f15040b0;
    public final gb f15041b1;
    public boolean f15042b2;
    public final int f15043c;
    public int f15044c0;
    public final r5 f15045c1;
    public boolean f15046c2;
    public boolean d;
    public final RectF f15047d0;
    public final ia f15048d1;
    public boolean d2;
    public boolean f15049e;
    public final RectF f15050e0;
    public final l9 f15051e1;
    public boolean f15052e2;
    public final WindowManager f15053f;
    public final Path f15054f0;
    public final u0 f15055f1;
    public Runnable f15056f2;
    public int f15057g0;
    public ch0 f15058g1;
    public AnimatorSet f15059g2;
    public final WindowManager.LayoutParams h;
    public int f15060h0;
    public final fh0 f15061h1;
    public y8 f15062h2;
    public final ea f15063i0;
    public ch0 f15064i1;
    public boolean f15065i2;
    public final FrameLayout f15066j0;
    public ImageView f15067j1;
    public AnimatorSet f15068j2;
    public final LinearLayout f15069k0;
    public final n5 f15070k1;
    public ValueAnimator f15071k2;
    public final FrameLayout f15072l0;
    public final l3 l1;
    public boolean f15073l2;
    public final bi.g2 m0;
    public final l3 f15074m1;
    public v4.a0 f15075m2;
    public final ra f15076n;
    public final FrameLayout f15077n0;
    public final l3 n1;
    public ve f15078n2;
    public final l2 f15079o0;
    public final l3 f15080o1;
    public ValueAnimator f15081o2;
    public final w6 f15082p0;
    public final s5 f15083p1;
    public r1.g f15084p2;
    public final org.telegram.ui.ActionBar.j5 f15085q0;
    public final fb f15086q1;
    public Boolean f15087q2;
    public final ka f15088r;
    public q8 f15089r0;
    public p f15090r1;
    public c9 f15091r2;
    public final n2 f15092s;
    public final org.telegram.ui.Components.u9 f15093s0;
    public ca f15094s1;
    public AnimatorSet f15095s2;
    public final w5 f15096t0;
    public da f15097t1;
    public boolean f15098t2;
    public final bi.o2 f15099u0;
    public final cb f15100u1;
    public int f15101u2;
    public boolean f15102v0;
    public final d f15103v1;
    public ArrayList f15104v2;
    public boolean f15105w;
    public long f15106w0;
    public u9 f15107w1;
    public FrameLayout f15108w2;
    public long f15109x;
    public String f15110x0;
    public sg.u0 f15111x1;
    public boolean f15112x2;
    public ja f15113y;
    public TLRPC.InputPeer f15114y0;
    public View f15115y1;
    public s8 f15116y2;
    public o8 f15117z0;
    public View f15118z1;
    public ai.v0 f15119z2;

    public sa(Activity activity, int i7) {
        bg.u0 u0Var;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        boolean z10;
        float f11;
        fi.b bVar = new fi.b();
        this.f15035a = bVar;
        this.f15109x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new h2.f((int[]) null);
        this.f15047d0 = new RectF();
        this.f15050e0 = new RectF();
        this.f15054f0 = new Path();
        new Rect();
        this.f15057g0 = 0;
        this.f15060h0 = -1;
        this.f15117z0 = new o8();
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
        p9 p9Var = new p9(this);
        this.f15052e2 = true;
        this.f15073l2 = true;
        this.f15101u2 = -1;
        this.f15039b = activity;
        this.f15043c = i7;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            u0Var = new bg.u0(launchActivity, true);
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
        this.f15053f = windowManager;
        ra raVar = new ra(this, activity);
        this.f15076n = raVar;
        b9 b9Var = new b9(this, 1);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(raVar, b9Var);
        this.f15076n.setFocusable(true);
        this.f15076n.setImportantForAccessibility(2);
        n2 n2Var = new n2(activity, windowManager, this.f15076n, layoutParams);
        this.f15092s = n2Var;
        n2Var.a(new y9(this));
        this.f15076n.addView(this.f15092s.f14740b, new ViewGroup.LayoutParams(-1, -1));
        ra raVar2 = this.f15076n;
        ka kaVar = new ka(this, activity);
        this.f15088r = kaVar;
        raVar2.addView(kaVar);
        ka kaVar2 = this.f15088r;
        ea eaVar = new ea(this, activity);
        this.f15063i0 = eaVar;
        kaVar2.addView(eaVar);
        this.f15088r.addView(this.f15092s.f14741c, new ViewGroup.LayoutParams(-1, -1));
        this.f15093s0 = new org.telegram.ui.Components.u9(this.f15063i0);
        this.f15096t0 = new Object();
        ka kaVar3 = this.f15088r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f15066j0 = frameLayout;
        kaVar3.addView(frameLayout);
        ka kaVar4 = this.f15088r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f15072l0 = frameLayout2;
        kaVar4.addView(frameLayout2);
        ka kaVar5 = this.f15088r;
        bi.g2 g2Var = new bi.g2(5, activity, this);
        this.m0 = g2Var;
        kaVar5.addView(g2Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        ka kaVar6 = this.f15088r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f15077n0 = frameLayout3;
        kaVar6.addView(frameLayout3);
        xb.a(this.f15076n, new bi.t(3));
        fa faVar = new fa(this, activity, this.f15093s0, this.f15088r, bVar);
        this.B0 = faVar;
        ra raVar3 = this.f15076n;
        Objects.requireNonNull(raVar3);
        faVar.setCancelGestures(new e1(raVar3, 13));
        this.B0.setResetState(new s8(this, 13));
        this.f15063i0.addView(this.B0, c8.ja.e(-1, -1, 119));
        this.B0.setOnClickListener(new u8(this, 12));
        ea eaVar2 = this.f15063i0;
        int i14 = this.K;
        if (i14 != 1 && i14 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        eaVar2.setBackgroundColor(i10);
        ea eaVar3 = this.f15063i0;
        bg.p0 p0Var = bg.t0.f3332a;
        eaVar3.setOutlineProvider(new bg.r0(0, org.telegram.messenger.g0.L(12.0f)));
        this.f15063i0.setClipToOutline(true);
        s8 s8Var = new s8(this, 14);
        ?? view = new View(activity);
        view.f39279a = new TextPaint(1);
        view.f39280b = new TextPaint(1);
        er erVar = er.h;
        view.f39286s = new org.telegram.ui.Components.u5((View) view, 0L, 350L, erVar);
        view.J = new wa0(view, 6);
        view.f39289y = s8Var;
        this.D1 = view;
        ga gaVar = new ga(this, activity, this.f15093s0, this.f15096t0);
        this.Y0 = gaVar;
        gaVar.setCollageView(this.B0);
        ga gaVar2 = this.Y0;
        gaVar2.f15367w = new s8(this, 15);
        gaVar2.setOnTapListener(new s8(this, 16));
        this.Y0.setVisibility(8);
        ga gaVar3 = this.Y0;
        gaVar3.O = new s8(this, 17);
        this.f15063i0.addView(gaVar3, c8.ja.e(-1, -1, 119));
        this.f15063i0.addView(this.D1, c8.ja.e(-1, -1, 119));
        ra raVar4 = this.f15076n;
        ia iaVar = new ia(this, activity, raVar4, raVar4, this.f15088r, bVar, this.f15093s0);
        this.f15048d1 = iaVar;
        iaVar.setAccount(i7);
        this.f15048d1.setUiBlurBitmap(new g0.e(29));
        xb.a(this.m0, new bi.e1(this, 5));
        this.f15048d1.setOnHeightUpdate(new t8(this, 13));
        this.f15048d1.setOnPeriodUpdate(new t8(this, 4));
        long j3 = this.O;
        if (j3 != 0) {
            this.f15048d1.setDialogId(j3);
        }
        this.f15048d1.setOnPremiumHint(new t8(this, 5));
        this.f15048d1.setOnKeyboardOpen(new t8(this, 6));
        bi.o2 o2Var = new bi.o2(3, activity, this);
        this.f15099u0 = o2Var;
        this.f15088r.addView(o2Var);
        cb cbVar = new cb(activity, this.f15088r, this.f15063i0, bVar, this.f15093s0);
        this.f15037a1 = cbVar;
        cbVar.setOnTimelineClick(new s8(this, 10));
        this.f15037a1.setOnHeightChange(new s8(this, 11));
        this.Y0.setVideoTimelineView(this.f15037a1);
        this.f15037a1.setVisibility(8);
        this.f15037a1.setAlpha(0.0f);
        this.f15037a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.f15037a1, c8.ja.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gb gbVar = new gb(activity);
        this.f15041b1 = gbVar;
        gbVar.setVisibility(8);
        this.f15041b1.a(false);
        this.Z0.addView(this.f15041b1, c8.ja.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, c8.ja.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.f15048d1, c8.ja.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.f15037a1);
        this.B0.setPreviewView(this.Y0);
        cb cbVar2 = new cb(activity, this.f15088r, this.f15063i0, bVar, this.f15093s0);
        this.f15100u1 = cbVar2;
        cbVar2.Y0 = true;
        cbVar2.setVisibility(8);
        this.f15100u1.setAlpha(0.0f);
        this.m0.addView(this.f15100u1, c8.ja.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        l9 l9Var = new l9(this, activity, bVar, this.f15093s0);
        this.f15051e1 = l9Var;
        l9Var.setVisibility(8);
        this.m0.addView(this.f15051e1, c8.ja.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f15079o0 = imageView;
        imageView.setContentDescription(hd.M0(2131754878, null));
        l2 l2Var = this.f15079o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        this.f15079o0.setImageResource(2131232278);
        l2 l2Var2 = this.f15079o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        l2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15079o0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.f15079o0.setOnClickListener(new u8(this, 1));
        this.f15066j0.addView(this.f15079o0, c8.ja.e(56, 56, 51));
        this.f15092s.a(this.f15079o0);
        w6 w6Var = new w6(activity, i7);
        this.f15082p0 = w6Var;
        w6Var.a(false, false);
        this.f15082p0.setOnClickListener(new ai.t2(22, this, activity));
        this.f15066j0.addView(this.f15082p0, c8.ja.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.f15085q0 = j5Var;
        j5Var.setTextSize(20);
        this.f15085q0.setGravity(19);
        this.f15085q0.setTextColor(-1);
        this.f15085q0.setTypeface(org.telegram.messenger.g0.o());
        this.f15085q0.l(hd.M0(2131746353, null), false);
        this.f15085q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.f15085q0.setAlpha(0.0f);
        this.f15085q0.setVisibility(8);
        this.f15085q0.setEllipsizeByGradient(true);
        this.f15085q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.f15066j0.addView(this.f15085q0, c8.ja.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f15069k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f15069k0.setGravity(5);
        this.f15066j0.addView(this.f15069k0, c8.ja.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        t8 t8Var = new t8(this, 7);
        ra raVar5 = this.f15076n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f15177x = true;
        imageView2.f15178y = true;
        imageView2.h = t8Var;
        imageView2.f15168a = i7;
        imageView2.f15169b = raVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.d(imageView2, 28));
        imageView2.f15172f = new lp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        imageView2.d();
        this.f15055f1 = imageView2;
        l3 l3Var = new l3(activity, 1);
        l3Var.o(1.0f, -71.0f);
        l3Var.d = 2000L;
        l3Var.V = false;
        l3Var.I.r(true, false);
        this.l1 = l3Var;
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15066j0.addView(this.l1, c8.ja.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f15061h1 = imageView3;
        imageView3.setScaleType(scaleType);
        fh0 fh0Var = this.f15061h1;
        d7 d7Var = this.L1;
        if (d7Var != null && d7Var.Y) {
            i11 = 2131231759;
        } else {
            i11 = 2131231750;
        }
        fh0Var.setImageResource(i11);
        this.f15061h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15061h1.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.f15061h1.setOnClickListener(new u8(this, 2));
        this.f15061h1.setVisibility(8);
        this.f15061h1.setAlpha(0.0f);
        n5 n5Var = new n5(activity);
        this.f15070k1 = n5Var;
        n5Var.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.f15070k1.setVisibility(8);
        this.f15070k1.setAlpha(0.0f);
        this.f15070k1.setOnClickListener(new u8(this, 3));
        this.f15069k0.addView(this.f15070k1, c8.ja.r(46, 56, 53));
        this.f15069k0.addView(this.f15061h1, c8.ja.r(46, 56, 53));
        this.f15069k0.addView(this.f15055f1, c8.ja.e(46, 56, 53));
        db dbVar = new db(activity);
        this.F0 = dbVar;
        dbVar.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new u8(this, 4));
        this.F0.setOnLongClickListener(new p4(this, 1));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.f15092s.a(this.F0);
        this.f15066j0.addView(this.F0, c8.ja.e(56, 56, 53));
        eb ebVar = new eb(activity);
        this.G0 = ebVar;
        ebVar.setContentDescription(hd.M0(2131754886, null));
        this.G0.setOnClickListener(new u8(this, 5));
        boolean q10 = c1.q(activity);
        eb ebVar2 = this.G0;
        if (q10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ebVar2.setVisibility(i12);
        eb ebVar3 = this.G0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ebVar3.setAlpha(f10);
        this.f15092s.a(this.G0);
        this.f15066j0.addView(this.G0, c8.ja.e(56, 56, 53));
        ?? dbVar2 = new db(activity);
        this.H0 = dbVar2;
        dbVar2.setContentDescription(hd.M0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        if (this.A0 == null) {
            i13 = 6;
            this.A0 = (t) t.a().get(6);
        } else {
            i13 = 6;
        }
        this.H0.setOnClickListener(new u8(this, i13));
        this.H0.a(new u(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.f15092s.a(this.H0);
        this.f15066j0.addView(this.H0, c8.ja.e(56, 56, 53));
        db dbVar3 = new db(activity);
        this.I0 = dbVar3;
        dbVar3.setContentDescription(hd.M0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.I0.a(new u(new t("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new u8(this, 7));
        this.f15092s.a(this.I0);
        this.f15066j0.addView(this.I0, c8.ja.e(56, 56, 53));
        y yVar = new y(activity, this.f15092s);
        this.J0 = yVar;
        yVar.f15400a.v0(6);
        this.J0.setSelected((t) null);
        this.J0.setOnLayoutClick(new t8(this, 8));
        this.f15066j0.addView(this.J0, c8.ja.e(-1, 56, 53));
        l3 l3Var2 = new l3(activity, 1);
        l3Var2.o(1.0f, -20.0f);
        l3Var2.d = 5000L;
        l3Var2.k(true);
        l3Var2.u(hd.M0(2131744713, null));
        l3Var2.f14570r0 = new ai.o(17);
        this.f15074m1 = l3Var2;
        l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15066j0.addView(this.f15074m1, c8.ja.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        l3 l3Var3 = new l3(activity, 2);
        l3Var3.o(0.0f, 28.0f);
        l3Var3.d = 5000L;
        l3Var3.r(true);
        this.n1 = l3Var3;
        this.f15066j0.addView(l3Var3, c8.ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        l3 l3Var4 = new l3(activity, 1);
        l3Var4.o(1.0f, -20.0f);
        l3Var4.d = 5000L;
        l3Var4.u(hd.M0(2131744704, null));
        this.f15080o1 = l3Var4;
        l3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15066j0.addView(this.f15080o1, c8.ja.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f14389a = paint;
        Paint paint2 = new Paint(1);
        view2.f14390b = paint2;
        view2.f14392e = new org.telegram.ui.Components.u5((View) view2, 0L, 250L, erVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        view2.f14391c = g6Var;
        g6Var.n(0.3f, 250L, erVar);
        g6Var.w(org.telegram.messenger.g0.L(13.0f));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(view2);
        g6Var.f34829b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.f15066j0.addView(this.K0, c8.ja.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f15092s.a(this.K0);
        MediaController.O(0);
        f6 f6Var = new f6(activity);
        this.P0 = f6Var;
        f6Var.setDelegate(p9Var);
        f6 f6Var2 = this.P0;
        if (this.P1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        f6Var2.f14294o0 = -1.0f;
        f6Var2.f14295p0 = z10;
        f6Var2.invalidate();
        this.f15072l0.addView(this.P0, c8.ja.e(-1, 100, 87));
        this.f15092s.a(this.P0);
        f6 f6Var3 = this.P0;
        if (this.B0.j()) {
            f11 = this.B0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        f6Var3.e(true, f11);
        d dVar = new d(activity, bVar, true);
        this.Q0 = dVar;
        dVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(hd.M0(2131748788, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.f15072l0.addView(this.Q0, c8.ja.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new u8(this, 8));
        l3 l3Var5 = new l3(activity, 3);
        l3Var5.r(true);
        l3Var5.u(hd.M0(2131744711, null));
        l3Var5.h = org.telegram.messenger.g0.L(320.0f);
        l3Var5.d = 5000L;
        l3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = l3Var5;
        this.f15072l0.addView(l3Var5, c8.ja.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        s71 s71Var = new s71(activity);
        this.W0 = s71Var;
        s71Var.N = false;
        s71Var.setAlpha(0.0f);
        this.f15072l0.addView(this.W0, c8.ja.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new b9(this, 4));
        s71 s71Var2 = this.W0;
        this.U1 = 0.0f;
        s71Var2.b(false, 0.0f);
        p6 p6Var = new p6(activity, i7, new s8(this, 12));
        this.E0 = p6Var;
        p6Var.f14858c = new t8(this, 9);
        this.f15072l0.addView(p6Var, c8.ja.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        m9 m9Var = new m9(this, activity);
        this.R0 = m9Var;
        m9Var.setOnSwitchModeListener(new t8(this, 10));
        this.R0.setOnSwitchingModeListener(new t8(this, 11));
        this.f15077n0.addView(this.R0, c8.ja.e(-1, 48, 55));
        this.f15092s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(hd.M0(2131754752, null));
        this.S0.setImageResource(2131232768);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.f15077n0.addView(this.S0, c8.ja.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f15092s.a(this.S0);
        this.S0.setOnClickListener(new u8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(hd.M0(2131748790, null));
        this.T0.setImageResource(2131232769);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.f15077n0.addView(this.T0, c8.ja.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f15092s.a(this.T0);
        this.T0.setOnClickListener(new u8(this, 10));
        i3 i3Var = new i3(activity);
        this.U0 = i3Var;
        this.f15077n0.addView(i3Var, c8.ja.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f15092s.a(this.U0);
        i3 i3Var2 = new i3(activity);
        this.V0 = i3Var2;
        i3Var2.f14416a.t(hd.M0(2131744703, null), false, true);
        i3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.f15077n0.addView(this.V0, c8.ja.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f15092s.a(this.V0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f15103v1 = dVar2;
        dVar2.setVisibility(8);
        this.f15103v1.setAlpha(0.0f);
        this.f15103v1.i(hd.M0(2131744689, null), false, true);
        this.f15103v1.setOnClickListener(new u8(this, 11));
        this.f15077n0.addView(this.f15103v1, c8.ja.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f14987b = new ArrayList();
        frameLayout5.f14989e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f14986a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, c8.ja.e(-1, -1, 119));
        frameLayout5.a(0, 2131231739, hd.M0(2131754814, null));
        frameLayout5.a(2, 2131232285, hd.M0(2131754756, null));
        frameLayout5.a(1, 2131232287, hd.M0(2131754807, null));
        frameLayout5.a(3, 2131231729, hd.M0(2131751699, null));
        frameLayout5.a(4, 2131232284, hd.M0(2131754811, null));
        String M0 = hd.M0(2131745640, null);
        frameLayout5.d = M0;
        frameLayout5.f14989e = true;
        q5 q5Var = new q5(frameLayout5, activity, M0, true);
        frameLayout5.f14988c = q5Var;
        q5Var.setContentDescription(hd.M0(2131745640, null));
        frameLayout5.addView(frameLayout5.f14988c, c8.ja.c(-2.0f, -2));
        frameLayout5.e();
        this.f15045c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f15045c1.setOnClickListener(new t8(this, 12));
        this.f15077n0.addView(this.f15045c1, c8.ja.e(-1, 52, 23));
        fb fbVar = new fb(activity);
        this.f15086q1 = fbVar;
        fbVar.setAlpha(0.0f);
        this.f15086q1.setVisibility(8);
        this.f15063i0.addView(this.f15086q1, c8.ja.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        s5 s5Var = new s5(activity, i7, bVar);
        this.f15083p1 = s5Var;
        this.f15063i0.addView(s5Var, c8.ja.e(-1, -1, 119));
        l0(false);
    }

    public static sa D(Activity activity, int i7) {
        sa saVar = G2;
        if (saVar != null && (saVar.f15039b != activity || saVar.f15043c != i7)) {
            saVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new sa(activity, i7);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        np.e1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(sa saVar) {
        v9 v9Var = saVar.C0;
        boolean z10 = false;
        if (v9Var != null && v9Var.getTextureView() != null) {
            Bitmap bitmap = saVar.C0.getTextureView().getBitmap();
            if (bitmap == null) {
                saVar.d2 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f10 = 0.0f;
            for (int i7 = 0; i7 < 10; i7++) {
                int i10 = 0;
                while (i10 < 10) {
                    i10++;
                    f10 += org.telegram.messenger.g0.B(bitmap.getPixel((i7 + 1) * width, i10 * height));
                }
            }
            bitmap.recycle();
            if (f10 / 100.0f < 0.22f) {
                z10 = true;
            }
            saVar.d2 = z10;
            return;
        }
        saVar.d2 = false;
    }

    public static void b(sa saVar) {
        ValueAnimator valueAnimator = saVar.f15071k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            saVar.f15071k2 = null;
        }
        saVar.f15073l2 = false;
        ka kaVar = saVar.f15088r;
        float f10 = kaVar.f14523a;
        float f11 = kaVar.f14524b;
        kaVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        saVar.f15071k2 = ofFloat;
        ofFloat.addUpdateListener(new i9(saVar, f10, f11, 0));
        saVar.f15071k2.setDuration(340L);
        saVar.f15071k2.setInterpolator(er.h);
        saVar.f15071k2.addListener(new s9(saVar, 0));
        saVar.f15071k2.start();
    }

    public static boolean c(sa saVar) {
        Activity activity = saVar.f15039b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g10 = i5.c.g(context, 2131232766);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        g10.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new z9(g10, g10), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        sa saVar = G2;
        if (saVar != null) {
            saVar.p(false);
        }
        G2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        d7 d7Var = this.L1;
        if (d7Var != null) {
            return d7Var.r();
        }
        return 1;
    }

    public final String B() {
        v9 v9Var = this.C0;
        if (v9Var != null && v9Var.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f15104v2.get(this.f15101u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 C() {
        if (this.O0 == null) {
            v0 v0Var = new v0(this.f15039b);
            this.O0 = v0Var;
            this.f15072l0.addView(v0Var, c8.ja.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        int i7;
        v9 v9Var = this.C0;
        if (v9Var != null && v9Var.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f15104v2;
                if (this.f15101u2 + 1 >= arrayList.size()) {
                    i7 = 0;
                } else {
                    i7 = this.f15101u2 + 1;
                }
                return (String) arrayList.get(i7);
            }
            return this.C0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f15067j1 == null) {
            ch0 ch0Var = new ch0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f15064i1 = ch0Var;
            ch0Var.h = true;
            d7 d7Var = this.L1;
            if (d7Var != null && d7Var.f14173y0) {
                ch0Var.M(35);
                this.f15064i1.P(36);
            } else {
                ch0Var.P(0);
                this.f15064i1.M(0);
            }
            this.f15064i1.f33571a0 = true;
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.J9, this.f15035a);
            this.f15064i1.Q(w02, "Sunny");
            this.f15064i1.Q(w02, "Path 6");
            this.f15064i1.Q(w02, "Path");
            this.f15064i1.Q(w02, "Path 5");
            this.f15064i1.o();
            ImageView imageView = new ImageView(this.f15039b);
            this.f15067j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f15067j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f15067j1.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
            this.f15067j1.setOnClickListener(new u8(this, 0));
            this.f15067j1.setVisibility(8);
            this.f15067j1.setImageDrawable(this.f15064i1);
            this.f15067j1.setAlpha(0.0f);
            this.f15069k0.addView(this.f15067j1, 0, c8.ja.r(46, 56, 53));
        }
        return this.f15067j1;
    }

    public final void G() {
        u9 u9Var = this.f15107w1;
        if (u9Var == null) {
            return;
        }
        this.f15108w2 = null;
        u9Var.getTopLayout().setAlpha(0.0f);
        this.f15107w1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.f15107w1.getBottomLayout().setAlpha(0.0f);
        this.f15107w1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.f15107w1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.f15107w1.setVisibility(8);
    }

    public final boolean H() {
        float f10;
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.f15042b2 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        g3 g3Var;
        if (!this.X && (g3Var = this.N0) != null) {
            if (g3Var.getTranslationY() < (this.f15076n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.f23609q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j3) {
        if (!this.T1 && this.L1 != null) {
            y8 y8Var = this.f15062h2;
            if (y8Var != null) {
                org.telegram.messenger.g0.r(y8Var);
            }
            this.f15065i2 = true;
            this.T1 = true;
            this.f15062h2 = new y8(this, runnable, 1);
            this.Y0.setAlpha(0.0f);
            this.Y0.setVisibility(0);
            this.Y0.n(this.L1, this.f15062h2, j3);
            this.Y0.p(this.L1, false);
            org.telegram.messenger.g0.i3(this.f15062h2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.L():boolean");
    }

    public final void M(int i7, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        if (i7 == 0) {
            u(false);
            this.P0.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i7 == 2) {
            this.f15100u1.setVisibility(8);
            if (i10 == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.m0.setVisibility(i16);
            this.f15048d1.setVisibility(8);
            this.f15103v1.setVisibility(8);
        }
        if (i7 == 1) {
            this.f15045c1.setVisibility(8);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.m0.setVisibility(i13);
            this.f15061h1.setVisibility(8);
            this.f15070k1.setVisibility(8);
            this.f15055f1.setVisibility(8);
            ImageView imageView = this.f15067j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.Y0.setVisibility(i14);
            this.f15037a1.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            if (i10 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.f15085q0.setVisibility(i15);
            v();
            this.f15086q1.setAlpha(0.0f);
            this.f15086q1.setVisibility(8);
            this.f15041b1.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        if (i10 == 1) {
            d7 d7Var = this.L1;
            if (d7Var == null || !d7Var.f14151n) {
                t();
                G();
            }
            sd0 sd0Var = this.D1;
            if (sd0Var != null) {
                sd0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            d7 d7Var2 = this.L1;
            if (d7Var2 != null && d7Var2.f14141h0 >= 30000) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f15041b1.setVisibility(i12);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            d7 d7Var3 = this.L1;
            if (d7Var3 == null || d7Var3.J0 == 0) {
                i17 = 0;
            }
            this.f15048d1.setVisibility(i17);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            v0 C = C();
            C.f15212r.e(true, 0.0f);
            C.a(true);
            fi.c1 c1Var = C.h;
            if (c1Var != null) {
                org.telegram.messenger.g0.r(c1Var);
            }
            fi.c1 c1Var2 = new fi.c1(C, 29);
            C.h = c1Var2;
            org.telegram.messenger.g0.i3(c1Var2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        sd0 sd0Var2 = this.D1;
        if (sd0Var2 != null) {
            if (i10 == 1 && ((i11 = this.f15060h0) == -1 || i11 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            sd0Var2.setAllowTouch(z11);
        }
        ia iaVar = this.f15048d1;
        if (iaVar != null) {
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            iaVar.f14622e0 = z10;
        }
        if (i10 == 1) {
            int i18 = this.f15043c;
            si.b0(i18).B(0);
            si.b0(i18).V0(0, false, true, false);
            si.b0(i18).V0(2, false, true, false);
            fi.s6 P1 = np.s1(i18).P1();
            if (P1.Q == 0) {
                P1.S();
            }
            np.s1(i18).P1().U();
        }
    }

    public final void N(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.N(int, int):void");
    }

    public final void O() {
        sg.s0 s0Var;
        int i7;
        if (this.f15057g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f15116y2 = new s8(this, 3);
            } else {
                Y(false);
            }
        }
        ia iaVar = this.f15048d1;
        if (iaVar != null) {
            iaVar.f14623f.s();
        }
        f6 f6Var = this.P0;
        if (f6Var != null) {
            f6Var.h();
        }
        s5 s5Var = this.f15083p1;
        if (s5Var != null) {
            fi.s6 P1 = np.s1(s5Var.f15024a).P1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) P1.f12325i.f(m10.i(P1.f12319a).f24953n);
            if (peerStories != null) {
                i7 = peerStories.stories.size();
            } else {
                i7 = 0;
            }
            s5Var.f15025b = P1.f12320b.m() + i7 + 1;
            s5Var.f15026c.invalidate();
        }
        u9 u9Var = this.f15107w1;
        if (u9Var != null && (s0Var = u9Var.f14700y0.d) != null) {
            s0Var.postRunnable(s0Var.f56772x);
        }
        ga gaVar = this.Y0;
        if (gaVar != null) {
            gaVar.x(0, false);
        }
        a1 a1Var = np.s1(this.f15043c).P1().f12338w;
        if (!a1Var.f13863c && !a1Var.d) {
            a1Var.d = true;
            w0 w0Var = new w0(a1Var, 1);
            vr a02 = vr.a0(a1Var.f13861a);
            a02.f27220a.c(new di.m6((Object) a02, false, (Object) w0Var, 3));
        }
    }

    public final void P(int i7, int i10) {
        boolean z10;
        u9 u9Var;
        ca caVar;
        da daVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        u9 u9Var2;
        if (i10 == 0) {
            this.f15079o0.setVisibility(8);
        }
        if (i7 == 0 && (u9Var2 = this.f15107w1) != null) {
            u9Var2.setVisibility(8);
        }
        if (i7 == -1) {
            this.f15048d1.setVisibility(8);
            if (i10 == 2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f15061h1.setVisibility(i11);
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f15070k1.setVisibility(i12);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f15055f1.setVisibility(i13);
            ImageView imageView = this.f15067j1;
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
            this.f15037a1.setVisibility(i14);
            this.f15085q0.setVisibility(8);
        }
        boolean z11 = true;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y0.setAllowCropping(z10);
        if ((i10 == 0 || i7 == 0) && (u9Var = this.f15107w1) != null) {
            u9Var.N0.setLayerType(0, null);
        }
        sd0 sd0Var = this.D1;
        if (sd0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z11 = false;
            }
            sd0Var.setAllowTouch(z11);
        }
        if (i10 == 3) {
            ca caVar2 = this.f15094s1;
            if (caVar2 != null) {
                caVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (caVar = this.f15094s1) != null) {
            caVar.setVisibility(8);
            this.f15094s1.setAppearProgress(0.0f);
            ca caVar3 = this.f15094s1;
            caVar3.f14451y = null;
            g0 g0Var = caVar3.f14445f;
            g0Var.M = null;
            g0Var.d = null;
            g0Var.K = false;
            caVar3.d.setVisibility(8);
            caVar3.f14441a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            da daVar2 = this.f15097t1;
            if (daVar2 != null) {
                daVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 4 && (daVar = this.f15097t1) != null) {
            daVar.setVisibility(8);
            this.f15097t1.setAppearProgress(0.0f);
            da daVar3 = this.f15097t1;
            daVar3.f14720b = null;
            g0 g0Var2 = daVar3.h;
            g0Var2.M = null;
            g0Var2.d = null;
            g0Var2.K = false;
            daVar3.f14722e.setVisibility(8);
            daVar3.setVisibility(8);
        }
    }

    public final void Q(ma maVar) {
        fi.m6 o4;
        ra raVar;
        if (this.d) {
            return;
        }
        int i7 = this.f15043c;
        if (np.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.f15102v0 = false;
        this.f15049e = false;
        this.C2 = false;
        this.f15096t0.f15295g = false;
        WindowManager windowManager = this.f15053f;
        if (windowManager != null && (raVar = this.f15076n) != null && raVar.getParent() == null) {
            ra raVar2 = this.f15076n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.x3(windowManager, raVar2, layoutParams);
            windowManager.addView(this.f15076n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.f15106w0 == 0 && (o4 = np.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (maVar != null) {
            this.G = maVar;
            this.K = maVar.f14781a;
            rectF.set(maVar.f14783c);
            this.H = maVar.f14782b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f23609q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15088r.c();
        int i11 = this.K;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f15063i0.setBackgroundColor(i10);
        this.f15088r.setTranslationX(0.0f);
        this.f15088r.setTranslationY(0.0f);
        this.f15088r.b(0.0f);
        this.f15088r.setScaleX(1.0f);
        this.f15088r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15039b);
        f(1.0f, true, new s8(this, 6));
        d();
        this.f15106w0 = 0L;
        this.f15110x0 = "";
    }

    public final void R(la laVar, d7 d7Var, long j3) {
        int i7;
        ra raVar;
        if (this.d) {
            return;
        }
        int i10 = this.f15043c;
        if (np.s1(i10).v2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f15102v0 = false;
        this.f15049e = false;
        this.C2 = false;
        WindowManager windowManager = this.f15053f;
        if (windowManager != null && (raVar = this.f15076n) != null && raVar.getParent() == null) {
            ra raVar2 = this.f15076n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.x3(windowManager, raVar2, layoutParams);
            windowManager.addView(this.f15076n, layoutParams);
            f0();
        }
        this.L1 = d7Var;
        this.P1 = d7Var.K ? 1 : 0;
        this.f15096t0.f15295g = false;
        RectF rectF = this.I;
        if (laVar != null) {
            this.G = laVar;
            this.K = laVar.f14781a;
            rectF.set(laVar.f14783c);
            this.H = laVar.f14782b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f23609q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15088r.c();
        int i11 = this.K;
        int i12 = 1;
        if (i11 != 1 && i11 != 0) {
            i7 = -14737633;
        } else {
            i7 = 0;
        }
        this.f15063i0.setBackgroundColor(i7);
        this.f15088r.setTranslationX(0.0f);
        this.f15088r.setTranslationY(0.0f);
        this.f15088r.b(0.0f);
        this.f15088r.setScaleX(1.0f);
        this.f15088r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15039b);
        d7 d7Var2 = this.L1;
        if (d7Var2 != null) {
            this.f15048d1.setText(d7Var2.C0);
        }
        K(new k9(this, 0), j3);
        if (this.L1.f14127b0) {
            i12 = 2;
        }
        J(i12, false);
        k0(-1, false, false);
        this.f15045c1.b(false, false);
        d();
        this.f15106w0 = 0L;
        this.f15110x0 = "";
    }

    public final void S() {
        m60 m60Var;
        ga gaVar = this.Y0;
        if (gaVar != null) {
            gaVar.x(4, true);
        }
        ia iaVar = this.f15048d1;
        if (iaVar != null && (m60Var = iaVar.V0) != null) {
            m60Var.u();
            iaVar.V0 = null;
        }
        ug.x0 x0Var = new ug.x0((org.telegram.ui.ActionBar.e2) new w9(this, 1), 14, false);
        x0Var.setOnDismissListener(new g9(this, 1));
        x0Var.show();
    }

    public final void T(la laVar, d7 d7Var) {
        int i7;
        boolean z10;
        int i10;
        fi.m6 o4;
        ra raVar;
        if (this.d) {
            return;
        }
        int i11 = this.f15043c;
        if (np.s1(i11).v2()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f15102v0 = true;
        this.f15049e = false;
        this.C2 = false;
        WindowManager windowManager = this.f15053f;
        if (windowManager != null && (raVar = this.f15076n) != null && raVar.getParent() == null) {
            ra raVar2 = this.f15076n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.x3(windowManager, raVar2, layoutParams);
            windowManager.addView(this.f15076n, layoutParams);
            f0();
        }
        this.L1 = d7Var;
        r8.a(i11, d7Var);
        d7 d7Var2 = this.L1;
        if (d7Var2 != null && d7Var2.K) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.P1 = i7;
        if (d7Var2 != null && d7Var2.f14165u && i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15096t0.f15295g = z10;
        if (this.f15106w0 == 0 && (o4 = np.s1(i11).P1().o()) != null && o4.a(i11, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.I;
        if (laVar != null) {
            this.G = laVar;
            this.K = laVar.f14781a;
            rectF.set(laVar.f14783c);
            this.H = laVar.f14782b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f23609q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15088r.c();
        int i12 = this.K;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f15063i0.setBackgroundColor(i10);
        this.f15088r.setTranslationX(0.0f);
        this.f15088r.setTranslationY(0.0f);
        this.f15088r.b(0.0f);
        this.f15088r.setScaleX(1.0f);
        this.f15088r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15039b);
        d7 d7Var3 = this.L1;
        if (d7Var3 != null) {
            this.f15048d1.setText(d7Var3.C0);
        }
        this.f15045c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new s8(this, 6));
        d();
        this.f15106w0 = 0L;
        this.f15110x0 = "";
    }

    public final void U() {
        sg.u0 u0Var = this.f15111x1;
        if (u0Var != null) {
            u0Var.bringToFront();
        }
        View view = this.f15115y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f15118z1;
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
        fb fbVar = this.f15086q1;
        if (fbVar != null) {
            fbVar.bringToFront();
        }
        sd0 sd0Var = this.D1;
        if (sd0Var != null) {
            sd0Var.bringToFront();
        }
        kd0 kd0Var = this.F1;
        if (kd0Var != null) {
            kd0Var.bringToFront();
        }
        md0 md0Var = this.G1;
        if (md0Var != null) {
            md0Var.bringToFront();
        }
        s5 s5Var = this.f15083p1;
        if (s5Var != null) {
            s5Var.bringToFront();
        }
        p pVar = this.f15090r1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(d7 d7Var, boolean z10) {
        File file;
        View view;
        float f10;
        d7 d7Var2;
        boolean z11;
        int i7;
        if (d7Var != null && this.Y0.getWidth() > 0 && this.Y0.getHeight() > 0) {
            if (z10) {
                file = d7Var.O0;
            } else {
                file = d7Var.N0;
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
            k51 textureView = this.Y0.getTextureView();
            if (d7Var.K && !d7Var.f14165u && textureView != null) {
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
            File file2 = d7Var.Q0;
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
            File file3 = d7Var.P0;
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
            u9 u9Var = this.f15107w1;
            if (u9Var != null && u9Var.B0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                u9 u9Var2 = this.f15107w1;
                u9Var2.f14688s0 = true;
                h5 h5Var = u9Var2.B0;
                h5Var.f57179a = true;
                h5Var.draw(canvas);
                u9 u9Var3 = this.f15107w1;
                u9Var3.B0.f57179a = false;
                u9Var3.f14688s0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = d7.w(this.f15043c, "jpg");
            if (z10) {
                d7Var2 = d7Var;
                z11 = z10;
                Utilities.f22418g.c(new ai.j(this, createBitmap, z11, w10, d7Var2, 3));
            } else {
                d7Var2 = d7Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i7 = 95;
                    } else {
                        i7 = 99;
                    }
                    createBitmap.compress(compressFormat, i7, new FileOutputStream(w10));
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            }
            if (!z11) {
                d7Var2.N0 = w10;
            }
            d7Var2.f14128b1 = createScaledBitmap;
        }
    }

    public final void W() {
        fi.m6 o4;
        int size;
        char c10;
        View[] viewPages;
        i41[] i41VarArr;
        q8 q8Var = this.f15089r0;
        BitmapDrawable bitmapDrawable = null;
        if (q8Var != null) {
            q8Var.dismiss();
            this.f15089r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
        if (z10) {
            u0 u0Var = this.f15055f1;
            u0Var.getClass();
            u0Var.c(hd.N0("VideoConvertFail"));
            p2Var.a();
            q5 q5Var = this.f15045c1.f14988c;
            int i7 = -this.V1;
            this.V1 = i7;
            org.telegram.messenger.g0.F3(i7, q5Var, null);
            return;
        }
        ia iaVar = this.f15048d1;
        if (iaVar != null && iaVar.o()) {
            p2Var.a();
            org.telegram.ui.Components.h6 h6Var = iaVar.f14643w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.F3(i10, h6Var, null);
            iaVar.e();
            return;
        }
        d7 d7Var = this.L1;
        int i11 = this.f15043c;
        if ((d7Var == null || (!d7Var.f14139g && d7Var.J0 == 0)) && (o4 = np.s1(i11).f25299i0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.L1.D0 = np.s1(i11).Y4();
        fi.b bVar = this.f15035a;
        char c11 = 1;
        if (iaVar != null && !this.L1.D0) {
            CharSequence text = iaVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((xy0[]) spannable.getSpans(0, text.length(), xy0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new cc(this.f15076n, bVar).Q(2131624346, 36, org.telegram.messenger.g0.S2(hd.M0(2131744581, null), org.telegram.ui.ActionBar.j6.Xc, 0, new s8(this, 27), bVar)).k(true);
                    int i12 = -this.V1;
                    this.V1 = i12;
                    org.telegram.messenger.g0.F3(i12, iaVar, null);
                    return;
                }
            }
        }
        d7 d7Var2 = this.L1;
        if (!d7Var2.f14139g && d7Var2.J0 == 0) {
            if (this.O != 0) {
                d7Var2.f14167v0 = np.s1(i11).j1(this.O);
            }
            ga gaVar = this.Y0;
            gaVar.x(3, true);
            q8 q8Var2 = new q8(this.L1.I0, this.f15039b, bVar);
            q8Var2.W0(this.L1.E0);
            q8Var2.V0(this.L1.f14167v0);
            q8Var2.A1 = this.N;
            q8Var2.P1 = new t8(this, 14);
            q8Var2.L0(!this.B0.j());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            q8Var2.S0(size);
            q8Var2.Q0(false);
            CharSequence text2 = iaVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (i41 i41Var : (i41[]) ((Spanned) text2).getSpans(0, text2.length(), i41.class)) {
                    if (i41Var != null) {
                        try {
                            TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(Long.parseLong(i41Var.getURL())));
                            if (a22 != null && !q10.B(a22) && q10.n(a22) != null && !arrayList2.contains(a22)) {
                                arrayList2.add(q10.n(a22));
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
                    char c12 = c11;
                    if (charAt == '@') {
                        i14 = i13 + 1;
                    } else if (charAt == ' ') {
                        if (i14 != -1) {
                            String charSequence = text2.subSequence(i14, i13).toString();
                            TLObject f22 = np.s1(i11).f2(charSequence);
                            if (f22 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) f22;
                                if (!user.bot && !q10.B(user) && user.f28200id != 777000 && !q10.z(user) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i14 = -1;
                    }
                    i13++;
                    c11 = c12;
                }
                c10 = c11;
                if (i14 != -1) {
                    String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                    TLObject f23 = np.s1(i11).f2(charSequence2);
                    if (f23 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) f23;
                        if (!user2.bot && !q10.B(user2) && user2.f28200id != 777000 && !q10.z(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            q8Var2.N1 = arrayList2;
            q8Var2.R1 = new t8(this, 15);
            q8Var2.S1 = new t8(this, 16);
            q8Var2.O1 = new b9(this, 9);
            this.f15089r0 = q8Var2;
            d7 d7Var3 = this.L1;
            if (d7Var3.K) {
                if (gaVar != null && !d7Var3.f14138f0 && this.f15057g0 != 2) {
                    d7Var3.f14135e0 = gaVar.getCurrentPosition();
                    z10 t8Var = new t8(this, 17);
                    View view = this.f15111x1;
                    View view2 = this.A1;
                    View[] viewArr = new View[3];
                    viewArr[0] = gaVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    gaVar.h(t8Var, viewArr);
                }
                q8 q8Var3 = this.f15089r0;
                Bitmap bitmap = this.L1.f14140g0;
                s8 s8Var = new s8(this, 20);
                if (bitmap != null) {
                    q8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                q8Var3.W1 = bitmapDrawable;
                q8Var3.X1 = s8Var;
                i1 i1Var = q8Var3.f14918m1;
                if (i1Var != null) {
                    for (View view3 : i1Var.getViewPages()) {
                        if (view3 instanceof l8) {
                            l8 l8Var = (l8) view3;
                            l8Var.h(false);
                            l8Var.f(false);
                        }
                    }
                }
            }
            this.f15089r0.setOnDismissListener(new g9(this, 0));
            this.f15089r0.show();
            return;
        }
        d7Var2.f14148l = false;
        h(null);
        o0();
    }

    public final void X(na naVar) {
        int i7 = 0;
        RectF rectF = this.I;
        if (naVar != null) {
            this.G = naVar;
            this.K = naVar.f14781a;
            rectF.set(naVar.f14783c);
            this.H = naVar.f14782b;
        } else {
            this.G = null;
            this.K = 0;
            Point point = org.telegram.messenger.g0.f23609q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.K;
        if (i10 != 1 && i10 != 0) {
            i7 = -14737633;
        }
        this.f15063i0.setBackgroundColor(i7);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f15112x2 || z10) {
            this.f15098t2 = false;
            Activity activity = this.f15039b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f15098t2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(2131232766).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    fq fqVar = new fq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    fqVar.f34672e = L;
                    fqVar.f34673f = L2;
                    this.B0.setCameraThumb(fqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.f15035a);
                        int i7 = org.telegram.ui.ActionBar.j6.L5;
                        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(2131747308, null));
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.U = X2;
                        alertDialog$Builder.k(hd.M0(2131747300, null), new b9(this, 12));
                        alertDialog$Builder.h(hd.M0(2131751772, null), null);
                        t1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f15112x2 = true;
                }
            }
            if (!this.f15098t2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new s8(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        v9 v9Var = this.C0;
        if (v9Var != null && v9Var.getTextureView() != null) {
            try {
                Utilities.f22419i.c(new fi.s5(this, this.C0.getTextureView().getBitmap(), runnable, 15));
            } catch (Throwable unused) {
            }
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setUpdateListener(new t9(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(er.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i7 = 8;
        }
        view.setVisibility(i7);
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
            this.f15053f.updateViewLayout(this.f15076n, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        ns.e().b(this, ns.f25562r2);
        int i7 = this.f15043c;
        ns.f(i7).b(this, ns.f25612y5);
        ns.f(i7).b(this, ns.f25472b3);
    }

    public final void d0(String str) {
        int i7;
        db dbVar = this.F0;
        dbVar.clearAnimation();
        v9 v9Var = this.C0;
        if ((v9Var != null && v9Var.isDual()) || this.f15042b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(dbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    dbVar.setContentDescription(hd.M0(2131754915, null));
                    i7 = 2131231751;
                }
            } else {
                str.equals("off");
            }
            dbVar.setContentDescription(hd.M0(2131754914, null));
            i7 = 2131231752;
        } else {
            if (str.equals("on")) {
                dbVar.setContentDescription(hd.M0(2131754913, null));
                i7 = 2131231753;
            }
            dbVar.setContentDescription(hd.M0(2131754914, null));
            i7 = 2131231752;
        }
        if (dbVar.f14187n != i7) {
            dbVar.f14187n = i7;
            ValueAnimator valueAnimator = dbVar.f14188r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dbVar.f14188r = null;
            }
            dbVar.setDrawable(i7);
        }
        if (this.f15057g0 == 0 && !this.J0.f15403e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(dbVar, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.m6 o4;
        d7 d7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i7 == ns.f25562r2) {
            f6 f6Var = this.P0;
            if (f6Var != null) {
                f6Var.h();
            }
            if (this.f15078n2 != null && MediaController.f22325c2 != null) {
                for (int i11 = 0; i11 < MediaController.f22325c2.size(); i11++) {
                    ve veVar = (ve) MediaController.f22325c2.get(i11);
                    int i12 = veVar.f26968a;
                    ve veVar2 = this.f15078n2;
                    if (i12 == veVar2.f26968a && veVar.f26969b == veVar2.f26969b) {
                        this.f15078n2 = veVar;
                        return;
                    }
                }
            }
        } else if (i7 == ns.f25612y5) {
            f6 f6Var2 = this.P0;
            if (f6Var2 != null && !this.W1) {
                f6Var2.h();
            }
        } else if (i7 == ns.f25472b3) {
            int i13 = this.f15057g0;
            int i14 = this.f15043c;
            if (i13 == 1) {
                if (!this.O1 && !this.f15048d1.o()) {
                    fi.s6 P1 = np.s1(i14).P1();
                    int A = A();
                    fi.m6 o10 = P1.o();
                    if (o10 == null || !o10.a(P1.f12319a, A) || ((d7Var = this.L1) != null && (d7Var.f14139g || d7Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f15045c1.setShareEnabled(z10);
            } else if (i13 == 0 && (o4 = np.s1(i14).P1().o()) != null && o4.a(i14, 1)) {
                d7 d7Var2 = this.L1;
                if (d7Var2 == null || d7Var2.J0 == 0) {
                    g0(o4, true);
                }
            }
        }
    }

    public final void e(boolean z10) {
        float height;
        boolean z11;
        int i7;
        v0 v0Var;
        this.L0 = z10;
        Boolean bool = this.f15087q2;
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
                this.f15091r2 = new c9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f15081o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f15081o2 = null;
            }
            r1.g gVar = this.f15084p2;
            if (gVar != null) {
                gVar.d();
                this.f15084p2 = null;
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
            if (z10 && (v0Var = this.O0) != null) {
                v0Var.a(false);
            }
            int i10 = 4;
            ka kaVar = this.f15088r;
            if (kaVar != null) {
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                kaVar.setImportantForAccessibility(i7);
            }
            g3 g3Var2 = this.N0;
            if (z10) {
                i10 = 0;
            }
            g3Var2.setImportantForAccessibility(i10);
            this.f15087q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            ra raVar = this.f15076n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (raVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.f23604n * 2.5f);
            }
            Math.max(1, raVar.getHeight());
            g3 g3Var3 = this.N0;
            g3Var3.L = !z10;
            if (this.f15071k2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f15073l2 = z11;
            if (z10) {
                r1.g gVar2 = new r1.g(g3Var3, r1.g.f55732p, height);
                this.f15084p2 = gVar2;
                gVar2.f55748m.a(0.75f);
                this.f15084p2.f55748m.b(350.0f);
                this.f15084p2.a(new d9(this, height, 0));
                this.f15084p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f15081o2 = ofFloat;
                ofFloat.addUpdateListener(new e9(this, 0));
                this.f15081o2.addListener(new s9(this, 1));
                this.f15081o2.setDuration(450L);
                this.f15081o2.setInterpolator(er.h);
                this.f15081o2.start();
            }
            if (!z10 && !this.T1) {
                this.f15075m2 = null;
            }
            if (!z10 && this.f15057g0 == 0 && !this.f15098t2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f15058g1 == null) {
            ch0 ch0Var = new ch0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f15058g1 = ch0Var;
            ch0Var.G *= 1.5f;
        }
        this.f15061h1.setAnimation(this.f15058g1);
        int i7 = 20;
        if (!z11) {
            ch0 ch0Var2 = this.f15058g1;
            if (!z10) {
                i7 = 0;
            }
            ch0Var2.N(i7, false, false);
        } else if (z10) {
            ch0 ch0Var3 = this.f15058g1;
            if (ch0Var3.f33573b0 > 20) {
                ch0Var3.N(0, false, false);
            }
            this.f15058g1.P(20);
            this.f15058g1.start();
        } else {
            ch0 ch0Var4 = this.f15058g1;
            int i10 = ch0Var4.f33573b0;
            if (i10 != 0 && i10 < 43) {
                ch0Var4.P(43);
                this.f15058g1.start();
            }
        }
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        ka kaVar = this.f15088r;
        if (z10) {
            this.Q.d();
            ns.e().k(ns.f25517j1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new e9(this, 5));
            this.F.addListener(new di.g6(this, f10, runnable, 3));
            if (f10 < 1.0f && this.f15105w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(er.h);
            } else if (f10 <= 0.0f && kaVar.f14523a >= org.telegram.messenger.g0.L(20.0f)) {
                if (f10 < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(er.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(er.h);
                }
            } else {
                this.F.setDuration(300L);
                this.F.setInterpolator(new x1.a());
            }
            this.F.start();
            return;
        }
        this.M = null;
        this.J = f10;
        j();
        kaVar.invalidate();
        this.f15076n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f15076n.findOnBackInvokedDispatcher()) == null) {
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
            l3 l3Var = this.f15074m1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            l3 l3Var2 = this.n1;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            l3 l3Var3 = this.l1;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
            l3 l3Var4 = this.X0;
            if (l3Var4 != null) {
                l3Var4.f(true);
            }
        }
        if (this.f15042b2 == z10 && this.f15046c2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.f15038a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f15038a2 = null;
        }
        this.f15042b2 = z10;
        this.f15046c2 = H();
        if (z10 && (yVar = this.J0) != null && yVar.f15403e) {
            yVar.a(false, z11);
        }
        l0(z11);
        m9 m9Var = this.R0;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f15038a2 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f15057g0 == 0 && !H()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f15057g0 == 0 && !H()) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i3Var2, property2, L3);
            if (z10 || this.f15057g0 != 0 || !H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i3Var, property, f12);
            if (!z10 && this.f15057g0 == 0 && H()) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i3Var, property2, L4);
            if (z10 || this.f15057g0 != 0 || H()) {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m9Var, property, f13);
            if (z10 || this.f15057g0 != 0 || H()) {
                f14 = org.telegram.messenger.g0.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(m9Var, property2, f14));
            this.f15038a2.setDuration(260L);
            this.f15038a2.setInterpolator(er.h);
            this.f15038a2.start();
            return;
        }
        if (z10 && this.f15057g0 == 0 && !H()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        i3Var2.setAlpha(f10);
        if (z10 && this.f15057g0 == 0 && !H()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        i3Var2.setTranslationY(L);
        if (z10 || this.f15057g0 != 0 || !H()) {
            f12 = 0.0f;
        }
        i3Var.setAlpha(f12);
        if (!z10 && this.f15057g0 == 0 && H()) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(16.0f);
        }
        i3Var.setTranslationY(L2);
        if (z10 || this.f15057g0 != 0 || H()) {
            f13 = 0.0f;
        }
        m9Var.setAlpha(f13);
        if (z10 || this.f15057g0 != 0 || H()) {
            f14 = org.telegram.messenger.g0.L(16.0f);
        }
        m9Var.setTranslationY(f14);
    }

    public final void g0(fi.m6 m6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        ug.j0 j0Var = new ug.j0(m6Var.b(), this.f15043c, this.f15039b, new w9(this, 0), null);
        j0Var.T1 = A();
        j0Var.setOnDismissListener(new a70(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        j0Var.show();
    }

    public final void h(Runnable runnable) {
        d7 d7Var;
        Runnable runnable2;
        ga gaVar;
        float f10;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        td0 td0Var = this.C1;
        if (td0Var != null && (d7Var = this.L1) != null) {
            d7Var.f14144j = td0Var.a() | d7Var.f14144j;
            d7 d7Var2 = this.L1;
            td0 td0Var2 = this.C1;
            File file = d7Var2.Z0;
            if (file != null) {
                file.delete();
                d7Var2.Z0 = null;
            }
            gf savedFilterState = td0Var2.getSavedFilterState();
            d7Var2.f14125a1 = savedFilterState;
            if (!d7Var2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = td0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i7 = d7Var2.R;
                        float f11 = 1.0f;
                        if (i7 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i7 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, d7Var2.f14147k0 / 2.0f, d7Var2.f14149l0 / 2.0f);
                        matrix.postRotate(-d7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        d7Var2.f14152n0.preScale(d7Var2.f14147k0 / createBitmap.getWidth(), d7Var2.f14149l0 / createBitmap.getHeight());
                        d7Var2.f14147k0 = createBitmap.getWidth();
                        d7Var2.f14149l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = d7Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            d7Var2.Z0.delete();
                        }
                        String k10 = d7.k(d7Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i10 = d7Var2.f14123a;
                        if (!z10) {
                            str = "jpg";
                        }
                        d7Var2.Z0 = d7.w(i10, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(d7Var2.Z0);
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
                            Utilities.f22419i.c(new aa.c0(d7Var2, createBitmap, z10, runnable2, 4));
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
                d7 d7Var3 = this.L1;
                if (!d7Var3.K && (gaVar = this.Y0) != null) {
                    gaVar.set(d7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f15052e2 != z10) {
            this.f15052e2 = z10;
            float f10 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.K0.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(er.h).withEndAction(new c9(this, z10, 1)).start();
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
        if (this.L1 != null && this.E1 != null && this.f15063i0.getMeasuredWidth() > 0 && this.f15063i0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i7 = this.L1.Q;
            if (i7 != 0) {
                matrix.postRotate(-i7, this.f15063i0.getMeasuredWidth() / 2.0f, this.f15063i0.getMeasuredHeight() / 2.0f);
                if ((this.L1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f15063i0.getMeasuredWidth() / this.f15063i0.getMeasuredHeight(), this.f15063i0.getMeasuredHeight() / this.f15063i0.getMeasuredWidth(), this.f15063i0.getMeasuredWidth() / 2.0f, this.f15063i0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f15063i0.getMeasuredWidth()) * this.L1.f14147k0, (1.0f / this.f15063i0.getMeasuredHeight()) * this.L1.f14149l0);
            matrix.postConcat(this.L1.f14152n0);
            matrix.postScale(this.f15063i0.getMeasuredWidth() / this.L1.f14143i0, this.f15063i0.getMeasuredHeight() / this.L1.f14145j0);
            this.E1.setTransform(matrix);
            this.E1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f10;
        s71 s71Var = this.W0;
        if ((s71Var.getTag() != null && z10) || (s71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f15056f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                s8 s8Var = new s8(this, 25);
                this.f15056f2 = s8Var;
                org.telegram.messenger.g0.i3(s8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f15059g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        s71Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f15059g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            s71Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f15059g2;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(s71Var, property, f10));
        this.f15059g2.addListener(new bi.v4(14, this, z10));
        this.f15059g2.start();
        if (z10) {
            s8 s8Var2 = new s8(this, 26);
            this.f15056f2 = s8Var2;
            org.telegram.messenger.g0.i3(s8Var2, 2000L);
        }
    }

    public final void j() {
        fi.e3 e3Var;
        if (this.K == 1) {
            RectF rectF = this.f15050e0;
            rectF.set(this.f15063i0.getLeft(), this.f15063i0.getTop(), this.f15063i0.getMeasuredWidth(), this.f15063i0.getMeasuredHeight());
            rectF.offset(this.f15088r.getX(), this.f15088r.getY());
            float f10 = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.f15047d0;
            org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
            this.f15063i0.setAlpha(this.J);
            float f11 = rectF3.left;
            ea eaVar = this.f15063i0;
            eaVar.setTranslationX((f11 - eaVar.getLeft()) - this.f15088r.getX());
            float f12 = rectF3.top;
            ea eaVar2 = this.f15063i0;
            eaVar2.setTranslationY((f12 - eaVar2.getTop()) - this.f15088r.getY());
            na naVar = this.G;
            if (naVar != null && (e3Var = naVar.f14785f) != null) {
                e3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f14785f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            this.f15063i0.setScaleX(rectF3.width() / this.f15063i0.getMeasuredWidth());
            this.f15063i0.setScaleY(rectF3.height() / this.f15063i0.getMeasuredHeight());
            this.f15066j0.setAlpha(this.J);
            this.f15072l0.setAlpha(this.J);
            this.m0.setAlpha(this.J);
            if (this.f15057g0 == 2) {
                this.f15103v1.setAlpha(this.J);
            }
        }
    }

    public final void j0() {
        q8 q8Var = this.f15089r0;
        if (q8Var != null) {
            q8Var.dismiss();
            this.f15089r0 = null;
        }
        q8 q8Var2 = new q8(86400, this.f15039b, this.f15035a);
        q8Var2.U0();
        q8Var2.W0(this.f15117z0);
        TLRPC.InputPeer inputPeer = this.f15114y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = np.s1(this.f15043c).j1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        q8Var2.V0(inputPeer);
        q8Var2.A1 = this.N;
        q8Var2.P1 = new t8(this, 18);
        q8Var2.L0(false);
        q8Var2.S0(1);
        q8Var2.Q0(false);
        q8Var2.R1 = new t8(this, 19);
        q8Var2.O1 = new b9(this, 11);
        this.f15089r0 = q8Var2;
        q8Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.k0(int, boolean, boolean):void");
    }

    public final void l() {
        d7 d7Var;
        boolean z10;
        if (this.f15107w1 != null && (d7Var = this.L1) != null && d7Var.f14165u) {
            File file = d7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.W0 = null;
            }
            this.L1.W0 = d7.w(this.f15043c, "webp");
            u9 u9Var = this.f15107w1;
            d7 d7Var2 = this.L1;
            ArrayList arrayList = d7Var2.T0;
            if (this.P1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap q02 = u9Var.q0(arrayList, false, false, true, z10, d7Var2);
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
        v9 v9Var;
        boolean z17 = false;
        if (this.f15057g0 == 0 && this.P1 == 1 && !this.J0.f15403e && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0(z11, z10);
        this.H0.setSelected(this.B0.j());
        y yVar = this.J0;
        if (yVar != null && yVar.f15403e) {
            z12 = false;
        } else {
            z12 = true;
        }
        b0(this.f15079o0, z12, z10);
        if (!this.f15042b2 && this.P1 != -1 && this.f15057g0 == 0 && this.Z1 != null && !this.J0.f15403e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.F0, z13, z10);
        if (!this.f15042b2 && this.P1 != -1 && this.f15057g0 == 0 && (v9Var = this.C0) != null && v9Var.f13958a && !this.J0.f15403e && !this.B0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.G0, z14, z10);
        if (!this.f15042b2 && this.P1 != -1 && this.f15057g0 == 0 && !this.J0.f15403e) {
            z15 = true;
        } else {
            z15 = false;
        }
        b0(this.H0, z15, z10);
        b0(this.I0, this.J0.f15403e, z10);
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.P0.e(z10, f10);
        boolean z18 = this.J0.f15403e;
        l3 l3Var = this.f15080o1;
        if (z18) {
            l3Var.w();
        } else {
            l3Var.f(true);
        }
        g(this.f15042b2, z10);
        if (this.P1 == -1 && this.f15057g0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        org.telegram.messenger.g0.U3(this.T0, z16, true);
        if (this.P1 == -1 && this.f15057g0 == 0) {
            z17 = true;
        }
        org.telegram.messenger.g0.U3(this.S0, z17, true);
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
        this.f15079o0.setTranslationX(0.0f);
        float alpha5 = this.f15079o0.getAlpha();
        float L = (alpha4 * org.telegram.messenger.g0.L(46.0f)) + alpha3 + org.telegram.messenger.g0.L(8.0f);
        v vVar = this.J0.f15400a;
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
        bg.u0 u0Var = this.E;
        if (u0Var != null) {
            u0Var.c(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        int i7;
        ch0 ch0Var = this.f15064i1;
        if (ch0Var != null) {
            int[] iArr = ch0Var.f33577e;
            int i10 = 0;
            if (z10) {
                d7 d7Var = this.L1;
                if (d7Var != null && d7Var.f14173y0) {
                    i10 = iArr[0];
                }
                ch0Var.P(i10);
                ch0 ch0Var2 = this.f15064i1;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                    return;
                }
                return;
            }
            d7 d7Var2 = this.L1;
            if (d7Var2 != null && d7Var2.f14173y0) {
                i7 = iArr[0] - 1;
            } else {
                i7 = 0;
            }
            ch0Var.N(i7, false, true);
            this.f15064i1.P(i7);
            ImageView imageView = this.f15067j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f15101u2 < 0) {
            this.f15101u2 = np.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f15104v2 = arrayList;
            arrayList.add("off");
            this.f15104v2.add("auto");
            this.f15104v2.add("on");
            float f10 = np.e1().getFloat("frontflash_warmth", 0.9f);
            n2 n2Var = this.f15092s;
            n2Var.f14751o = f10;
            n2Var.f14750n = n2.f(f10);
            n2Var.g();
            float f11 = np.e1().getFloat("frontflash_intensity", 1.0f);
            n2 n2Var2 = this.f15092s;
            n2Var2.f14752p = f11;
            n2Var2.i();
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        s8 s8Var = new s8(this, 2);
        u9 u9Var = this.f15107w1;
        d7 d7Var = this.L1;
        if (u9Var != null && d7Var != null) {
            d7Var.f();
            boolean r02 = u9Var.r0();
            boolean z10 = u9Var.f14700y0.getPainting().E;
            Utilities.f22418g.c(new v8(this, u9Var, d7Var.f14143i0, d7Var.f14145j0, d7Var, z10, r02, s8Var, 1));
            return;
        }
        s8Var.run();
    }

    public final void p(boolean z10) {
        ga gaVar;
        if (this.d) {
            q8 q8Var = this.f15089r0;
            if (q8Var != null) {
                q8Var.dismiss();
                this.f15089r0 = null;
            }
            d7 d7Var = this.L1;
            long j3 = 0;
            if (d7Var != null && !d7Var.h) {
                if ((this.f15105w && d7Var.f14139g) || d7Var.f14126b != 0) {
                    d7Var.f14144j = false;
                }
                d7Var.i(false);
            }
            this.L1 = null;
            w10 w10Var = this.S;
            if (w10Var != null && (gaVar = this.Y0) != null) {
                if (this.f15049e) {
                    return;
                }
                this.f15049e = true;
                u51 u51Var = gaVar.E;
                if (u51Var != null) {
                    u51Var.g0();
                    gaVar.E.m0();
                    gaVar.E = null;
                }
                u51 u51Var2 = gaVar.f15371y;
                if (u51Var2 != null) {
                    j3 = u51Var2.S();
                    gaVar.f15371y.g0();
                    gaVar.f15371y.m0();
                    gaVar.f15371y = null;
                }
                u51 u51Var3 = gaVar.f15345e;
                if (u51Var3 != null) {
                    j3 = u51Var3.S();
                    gaVar.f15345e.g0();
                    gaVar.f15345e.m0();
                    gaVar.f15345e = null;
                }
                w10Var.a(Long.valueOf(j3), new c9(this, z10, 2), Boolean.valueOf(this.f15105w), Long.valueOf(this.f15109x));
                return;
            }
            ga gaVar2 = this.Y0;
            if (gaVar2 != null && !z10) {
                gaVar2.set(null);
            }
            f(0.0f, z10, new s8(this, 23));
            int i7 = this.K;
            if (i7 == 1 || i7 == 0) {
                this.f15076n.setBackgroundColor(0);
                this.f15045c1.b(false, true);
            }
            ns.e().n(this, ns.f25562r2);
            int i10 = this.f15043c;
            ns.f(i10).n(this, ns.f25612y5);
            ns.f(i10).n(this, ns.f25472b3);
        }
    }

    public final boolean p0() {
        v9 v9Var;
        if ((this.Q1 || this.R1) && (v9Var = this.C0) != null && v9Var.isFrontface()) {
            int i7 = this.f15101u2;
            if (i7 == 2 || (i7 == 1 && this.d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f15039b;
        if (this.C0 == null && activity != null) {
            this.C0 = new v9(this, activity, np.e1().getBoolean("stories_camera", false));
            f6 f6Var = this.P0;
            float f10 = 0.0f;
            if (f6Var != null) {
                f6Var.f14287h0 = 0.0f;
                f6Var.f14288i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.j();
            this.C0.setThumbDrawable(z());
            this.C0.initTexture();
            this.C0.setDelegate(new b9(this, 0));
            eb ebVar = this.G0;
            if (this.C0.f13958a && this.f15057g0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(ebVar, z10, true);
            z zVar = this.H0;
            if (!this.C0.f13958a) {
                f10 = org.telegram.messenger.g0.L(46.0f);
            }
            zVar.setTranslationX(f10);
            this.B0.setCameraView(this.C0);
            if (np.e1().getInt("storyhint2", 0) < 1) {
                this.X0.w();
                np.e1().edit().putInt("storyhint2", np.e1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!c1.q(this.C0.getContext()) || !np.e1().getBoolean("dualcam", c1.p(org.telegram.messenger.t0.f26600b, false))) && this.C0.f13958a && np.e1().getInt("storydualhint", 0) < 2) {
                this.f15074m1.w();
            }
            if (this.D0 == null) {
                this.D0 = new b6(activity, new t8(this, 3));
            }
            this.D0.a(this.C0);
            p6 p6Var = this.E0;
            if (p6Var != null) {
                fa faVar = this.B0;
                Object blurRenderNode = faVar.getBlurRenderNode();
                p6Var.G = faVar;
                p6Var.H = blurRenderNode;
                p6Var.invalidate();
            }
        }
    }

    public final void r() {
        d7 d7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.C1 == null && (d7Var = this.L1) != null) {
            gf gfVar = null;
            if (!d7Var.K) {
                if (d7Var.Z0 == null) {
                    q10 = this.Y0.getPhotoBitmap();
                } else {
                    b9 b9Var = new b9(this, 10);
                    Point point = org.telegram.messenger.g0.f23609q;
                    q10 = d7.q(b9Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                k51 textureView = this.Y0.getTextureView();
                int orientation = this.Y0.getOrientation();
                d7 d7Var2 = this.L1;
                if (d7Var2 != null) {
                    gfVar = d7Var2.f14125a1;
                }
                td0 td0Var = new td0(this.f15039b, textureView, bitmap, null, orientation, gfVar, null, 0, false, false, this.f15093s0, this.f15035a);
                this.C1 = td0Var;
                this.f15088r.addView(td0Var);
                sd0 sd0Var = this.D1;
                if (sd0Var != null) {
                    sd0Var.setFilterView(this.C1);
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
                kd0 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                if (blurControl != null) {
                    this.f15063i0.addView(blurControl);
                }
                md0 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    this.f15063i0.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new u8(this, 13));
                this.C1.getCancelTextView().setOnClickListener(new u8(this, 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
                this.C1.f39657j0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.N0 != null) {
            fa faVar = this.B0;
            if (faVar != null && faVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.N0.Q) {
                return;
            }
        }
        if (this.f15039b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        ve veVar = this.f15078n2;
        boolean z13 = !z10;
        fa faVar2 = this.B0;
        if (faVar2 != null && faVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        g3 g3Var = new g3(this, this.f15043c, this.f15039b, this.f15035a, veVar, z10, z13, z11);
        this.N0 = g3Var;
        g3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, t.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new k9(this, 1));
        this.N0.setOnSelectListener(new j9(0, this, z10));
        this.N0.setOnSelectMultipleListener(new di.s1(this, 2));
        v4.a0 a0Var = this.f15075m2;
        if (a0Var != null) {
            gi.g gVar = this.N0.f14106e;
            gVar.B = a0Var;
            gVar.l0();
        }
        this.f15076n.addView(this.N0, c8.ja.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.t():void");
    }

    public final void u(boolean z10) {
        b6 b6Var = this.D0;
        if (b6Var != null) {
            b6Var.f13935f = null;
            Utilities.f22416e.a(b6Var.h);
            this.D0 = null;
            fa faVar = this.B0;
            if (faVar != null) {
                faVar.f14196c.a(null);
            }
        }
        p6 p6Var = this.E0;
        if (p6Var != null) {
            p6Var.G = null;
            p6Var.H = null;
            p6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new s8(this, 8));
                return;
            }
            a0(new s8(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            fa faVar2 = this.B0;
            if (faVar2 != null) {
                faVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void v() {
        g3 g3Var = this.N0;
        if (g3Var == null) {
            return;
        }
        this.f15076n.removeView(g3Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.f15081o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15081o2 = null;
        }
        r1.g gVar = this.f15084p2;
        if (gVar != null) {
            gVar.d();
            this.f15084p2 = null;
        }
        this.f15087q2 = null;
    }

    public final void x() {
        td0 td0Var = this.C1;
        if (td0Var == null) {
            return;
        }
        td0Var.b();
        this.D1.setFilterView(null);
        this.f15088r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.f15063i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        kd0 kd0Var = this.F1;
        if (kd0Var != null) {
            this.f15063i0.removeView(kd0Var);
            this.F1 = null;
        }
        md0 md0Var = this.G1;
        if (md0Var != null) {
            this.f15063i0.removeView(md0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        u9 u9Var = this.f15107w1;
        if (u9Var != null) {
            u9Var.B0.removeAllViews();
            u9 u9Var2 = this.f15107w1;
            u9Var2.f14700y0.h();
            u9Var2.B0.setVisibility(8);
            u9Var2.A0.setVisibility(8);
            u9Var2.f14680o0.postRunnable(new ai.o(15));
            a5 a5Var = u9Var2.U1;
            if (a5Var != null) {
                a5Var.dismiss();
            }
            sg.q qVar = u9Var2.D1;
            if (qVar != null) {
                qVar.dismiss();
            }
            this.f15088r.removeView(this.f15107w1);
            this.f15107w1 = null;
            sg.u0 u0Var = this.f15111x1;
            if (u0Var != null) {
                this.f15063i0.removeView(u0Var);
                this.f15111x1 = null;
            }
            View view = this.f15118z1;
            if (view != null) {
                this.f15063i0.removeView(view);
                this.f15118z1 = null;
            }
            View view2 = this.f15115y1;
            if (view2 != null) {
                this.f15063i0.removeView(view2);
                this.f15115y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                this.f15063i0.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                this.f15063i0.removeView(view4);
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
        return this.f15039b.getResources().getDrawable(2131231492);
    }
}
