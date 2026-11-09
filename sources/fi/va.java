package fi;

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
import bi.ec;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hf;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.we;
import org.telegram.messenger.yr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
public final class va implements ls {
    public static va F2;
    public final ia A0;
    public View A1;
    public boolean A2;
    public y9 B0;
    public td0 B1;
    public boolean B2;
    public c6 C0;
    public final sd0 C1;
    public da C2;
    public final bg.v0 D;
    public final q6 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final gb E0;
    public kd0 E1;
    public ValueAnimator E2;
    public qa F;
    public final hb F0;
    public md0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final gb H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final kb J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public e7 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public i3 M0;
    public long M1;
    public long N;
    public u0 N0;
    public boolean N1;
    public boolean O;
    public final g6 O0;
    public int O1;
    public final h2.f P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final o9 Q0;
    public boolean Q1;
    public z10 R;
    public final n2 R0;
    public boolean R1;
    public int S;
    public final n2 S0;
    public boolean S1;
    public int T;
    public final k3 T0;
    public float T1;
    public int U;
    public final k3 U0;
    public int U1;
    public boolean V;
    public final s71 V0;
    public boolean V1;
    public boolean W;
    public final m3 W0;
    public boolean W1;
    public boolean X;
    public final ja X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final fb Z0;
    public AnimatorSet Z1;
    public final di.b f12934a;
    public int f12935a0;
    public final jb f12936a1;
    public boolean f12937a2;
    public final Activity f12938b;
    public int f12939b0;
    public final s5 f12940b1;
    public boolean f12941b2;
    public final int f12942c;
    public final RectF f12943c0;
    public final la f12944c1;
    public boolean f12945c2;
    public boolean d;
    public final RectF f12946d0;
    public final n9 f12947d1;
    public boolean d2;
    public boolean f12948e;
    public final Path f12949e0;
    public final t0 f12950e1;
    public Runnable f12951e2;
    public final WindowManager f12952f;
    public int f12953f0;
    public ah0 f12954f1;
    public AnimatorSet f12955f2;
    public int f12956g0;
    public final dh0 f12957g1;
    public a9 f12958g2;
    public final WindowManager.LayoutParams h;
    public final ha f12959h0;
    public ah0 f12960h1;
    public boolean f12961h2;
    public final FrameLayout f12962i0;
    public ImageView f12963i1;
    public AnimatorSet f12964i2;
    public final LinearLayout f12965j0;
    public final p5 f12966j1;
    public ValueAnimator f12967j2;
    public final FrameLayout f12968k0;
    public final m3 f12969k1;
    public boolean f12970k2;
    public final bi.e5 f12971l0;
    public final m3 l1;
    public v4.a0 f12972l2;
    public final FrameLayout m0;
    public final m3 f12973m1;
    public we f12974m2;
    public final ua f12975n;
    public final n2 f12976n0;
    public final m3 n1;
    public ValueAnimator f12977n2;
    public final x6 f12978o0;
    public final t5 f12979o1;
    public r1.g f12980o2;
    public final org.telegram.ui.ActionBar.l5 f12981p0;
    public final ib f12982p1;
    public Boolean f12983p2;
    public s8 f12984q0;
    public p f12985q1;
    public e9 f12986q2;
    public final na f12987r;
    public final org.telegram.ui.Components.y9 f12988r0;
    public fa f12989r1;
    public AnimatorSet f12990r2;
    public final p2 f12991s;
    public final x5 f12992s0;
    public ga f12993s1;
    public boolean f12994s2;
    public final ec f12995t0;
    public final fb f12996t1;
    public int f12997t2;
    public boolean f12998u0;
    public final d f12999u1;
    public ArrayList f13000u2;
    public long f13001v0;
    public x9 f13002v1;
    public FrameLayout f13003v2;
    public boolean f13004w;
    public String f13005w0;
    public sg.v0 f13006w1;
    public boolean f13007w2;
    public long f13008x;
    public TLRPC.InputPeer f13009x0;
    public View f13010x1;
    public u8 f13011x2;
    public ma f13012y;
    public q8 f13013y0;
    public View f13014y1;
    public bg.m0 f13015y2;
    public t f13016z0;
    public View f13017z1;
    public boolean f13018z2;

    public va(Activity activity, int i7) {
        bg.v0 v0Var;
        int i10;
        int i11;
        int i12;
        float f10;
        boolean z9;
        float f11;
        di.b bVar = new di.b();
        this.f12934a = bVar;
        this.f13008x = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new h2.f((int[]) null);
        this.f12943c0 = new RectF();
        this.f12946d0 = new RectF();
        this.f12949e0 = new Path();
        new Rect();
        this.f12953f0 = 0;
        this.f12956g0 = -1;
        this.f13013y0 = new q8();
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
        r9 r9Var = new r9(this);
        this.d2 = true;
        this.f12970k2 = true;
        this.f12997t2 = -1;
        this.f12938b = activity;
        this.f12942c = i7;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.D = v0Var;
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
        this.f12952f = windowManager;
        ua uaVar = new ua(this, activity);
        this.f12975n = uaVar;
        d9 d9Var = new d9(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(uaVar, d9Var);
        this.f12975n.setFocusable(true);
        this.f12975n.setImportantForAccessibility(2);
        p2 p2Var = new p2(activity, windowManager, this.f12975n, layoutParams);
        this.f12991s = p2Var;
        p2Var.a(new ba(this));
        this.f12975n.addView(this.f12991s.f12573b, new ViewGroup.LayoutParams(-1, -1));
        ua uaVar2 = this.f12975n;
        na naVar = new na(this, activity);
        this.f12987r = naVar;
        uaVar2.addView(naVar);
        na naVar2 = this.f12987r;
        ha haVar = new ha(this, activity);
        this.f12959h0 = haVar;
        naVar2.addView(haVar);
        this.f12987r.addView(this.f12991s.f12574c, new ViewGroup.LayoutParams(-1, -1));
        this.f12988r0 = new org.telegram.ui.Components.y9(this.f12959h0);
        this.f12992s0 = new Object();
        na naVar3 = this.f12987r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f12962i0 = frameLayout;
        naVar3.addView(frameLayout);
        na naVar4 = this.f12987r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f12968k0 = frameLayout2;
        naVar4.addView(frameLayout2);
        na naVar5 = this.f12987r;
        bi.e5 e5Var = new bi.e5(4, activity, this);
        this.f12971l0 = e5Var;
        naVar5.addView(e5Var);
        this.f12971l0.setVisibility(8);
        this.f12971l0.setAlpha(0.0f);
        na naVar6 = this.f12987r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        naVar6.addView(frameLayout3);
        cc.a(this.f12975n, new r7(2));
        ia iaVar = new ia(this, activity, this.f12988r0, this.f12987r, bVar);
        this.A0 = iaVar;
        ua uaVar3 = this.f12975n;
        Objects.requireNonNull(uaVar3);
        iaVar.setCancelGestures(new di.f8(uaVar3, 29));
        this.A0.setResetState(new u8(this, 13));
        this.f12959h0.addView(this.A0, c8.ha.e(-1, -1, 119));
        this.A0.setOnClickListener(new w8(this, 12));
        ha haVar2 = this.f12959h0;
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        haVar2.setBackgroundColor(i10);
        ha haVar3 = this.f12959h0;
        bg.q0 q0Var = bg.u0.f3380a;
        haVar3.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(12.0f)));
        this.f12959h0.setClipToOutline(true);
        u8 u8Var = new u8(this, 14);
        ?? view = new View(activity);
        view.f38025a = new TextPaint(1);
        view.f38026b = new TextPaint(1);
        xq xqVar = xq.h;
        view.f38032s = new org.telegram.ui.Components.w5((View) view, 0L, 350L, xqVar);
        view.I = new pb0(view, 4);
        view.f38035y = u8Var;
        this.C1 = view;
        ja jaVar = new ja(this, activity, this.f12988r0, this.f12992s0);
        this.X0 = jaVar;
        jaVar.setCollageView(this.A0);
        ja jaVar2 = this.X0;
        jaVar2.f13191w = new u8(this, 15);
        jaVar2.setOnTapListener(new u8(this, 16));
        this.X0.setVisibility(8);
        ja jaVar3 = this.X0;
        jaVar3.N = new u8(this, 17);
        this.f12959h0.addView(jaVar3, c8.ha.e(-1, -1, 119));
        this.f12959h0.addView(this.C1, c8.ha.e(-1, -1, 119));
        ua uaVar4 = this.f12975n;
        la laVar = new la(this, activity, uaVar4, uaVar4, this.f12987r, bVar, this.f12988r0);
        this.f12944c1 = laVar;
        laVar.setAccount(i7);
        this.f12944c1.setUiBlurBitmap(new di.a1(24));
        cc.a(this.f12971l0, new ch.v(this, 4));
        this.f12944c1.setOnHeightUpdate(new v8(this, 13));
        this.f12944c1.setOnPeriodUpdate(new v8(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.f12944c1.setDialogId(j3);
        }
        this.f12944c1.setOnPremiumHint(new v8(this, 5));
        this.f12944c1.setOnKeyboardOpen(new v8(this, 6));
        ec ecVar = new ec(2, activity, this);
        this.f12995t0 = ecVar;
        this.f12987r.addView(ecVar);
        fb fbVar = new fb(activity, this.f12987r, this.f12959h0, bVar, this.f12988r0);
        this.Z0 = fbVar;
        fbVar.setOnTimelineClick(new u8(this, 10));
        this.Z0.setOnHeightChange(new u8(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.Z0, c8.ha.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        jb jbVar = new jb(activity);
        this.f12936a1 = jbVar;
        jbVar.setVisibility(8);
        this.f12936a1.a(false);
        this.Y0.addView(this.f12936a1, c8.ha.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f12971l0.addView(this.Y0, c8.ha.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f12971l0.addView(this.f12944c1, c8.ha.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        fb fbVar2 = new fb(activity, this.f12987r, this.f12959h0, bVar, this.f12988r0);
        this.f12996t1 = fbVar2;
        fbVar2.X0 = true;
        fbVar2.setVisibility(8);
        this.f12996t1.setAlpha(0.0f);
        this.f12971l0.addView(this.f12996t1, c8.ha.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        n9 n9Var = new n9(this, activity, bVar, this.f12988r0);
        this.f12947d1 = n9Var;
        n9Var.setVisibility(8);
        this.f12971l0.addView(this.f12947d1, c8.ha.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f12976n0 = imageView;
        imageView.setContentDescription(id.M0(2131754878, null));
        n2 n2Var = this.f12976n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var.setScaleType(scaleType);
        this.f12976n0.setImageResource(2131232277);
        n2 n2Var2 = this.f12976n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        n2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f12976n0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.f12976n0.setOnClickListener(new w8(this, 1));
        this.f12962i0.addView(this.f12976n0, c8.ha.e(56, 56, 51));
        this.f12991s.a(this.f12976n0);
        x6 x6Var = new x6(activity, i7);
        this.f12978o0 = x6Var;
        x6Var.a(false, false);
        this.f12978o0.setOnClickListener(new bi.r(15, this, activity));
        this.f12962i0.addView(this.f12978o0, c8.ha.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.f12981p0 = l5Var;
        l5Var.setTextSize(20);
        this.f12981p0.setGravity(19);
        this.f12981p0.setTextColor(-1);
        this.f12981p0.setTypeface(org.telegram.messenger.g0.o());
        this.f12981p0.l(id.M0(2131746353, null), false);
        this.f12981p0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.f12981p0.setAlpha(0.0f);
        this.f12981p0.setVisibility(8);
        this.f12981p0.setEllipsizeByGradient(true);
        this.f12981p0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.f12962i0.addView(this.f12981p0, c8.ha.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f12965j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f12965j0.setGravity(5);
        this.f12962i0.addView(this.f12965j0, c8.ha.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        v8 v8Var = new v8(this, 7);
        ua uaVar5 = this.f12975n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f12837x = true;
        imageView2.f12838y = true;
        imageView2.h = v8Var;
        imageView2.f12828a = i7;
        imageView2.f12829b = uaVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.d(imageView2, 22));
        imageView2.f12832f = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        imageView2.d();
        this.f12950e1 = imageView2;
        m3 m3Var = new m3(activity, 1);
        m3Var.o(1.0f, -71.0f);
        m3Var.d = 2000L;
        m3Var.U = false;
        m3Var.H.r(true, false);
        this.f12969k1 = m3Var;
        m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f12962i0.addView(this.f12969k1, c8.ha.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f12957g1 = imageView3;
        imageView3.setScaleType(scaleType);
        dh0 dh0Var = this.f12957g1;
        e7 e7Var = this.K1;
        if (e7Var != null && e7Var.Y) {
            i11 = 2131231759;
        } else {
            i11 = 2131231750;
        }
        dh0Var.setImageResource(i11);
        this.f12957g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f12957g1.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.f12957g1.setOnClickListener(new w8(this, 2));
        this.f12957g1.setVisibility(8);
        this.f12957g1.setAlpha(0.0f);
        p5 p5Var = new p5(activity);
        this.f12966j1 = p5Var;
        p5Var.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.f12966j1.setVisibility(8);
        this.f12966j1.setAlpha(0.0f);
        this.f12966j1.setOnClickListener(new w8(this, 3));
        this.f12965j0.addView(this.f12966j1, c8.ha.r(46, 56, 53));
        this.f12965j0.addView(this.f12957g1, c8.ha.r(46, 56, 53));
        this.f12965j0.addView(this.f12950e1, c8.ha.e(46, 56, 53));
        gb gbVar = new gb(activity);
        this.E0 = gbVar;
        gbVar.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.E0.setOnClickListener(new w8(this, 4));
        this.E0.setOnLongClickListener(new s4(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f12991s.a(this.E0);
        this.f12962i0.addView(this.E0, c8.ha.e(56, 56, 53));
        hb hbVar = new hb(activity);
        this.F0 = hbVar;
        hbVar.setContentDescription(id.M0(2131754886, null));
        this.F0.setOnClickListener(new w8(this, 5));
        boolean q10 = b1.q(activity);
        hb hbVar2 = this.F0;
        if (q10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        hbVar2.setVisibility(i12);
        hb hbVar3 = this.F0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        hbVar3.setAlpha(f10);
        this.f12991s.a(this.F0);
        this.f12962i0.addView(this.F0, c8.ha.e(56, 56, 53));
        ?? gbVar2 = new gb(activity);
        this.G0 = gbVar2;
        gbVar2.setContentDescription(id.M0(2131754895, null));
        this.G0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        if (this.f13016z0 == null) {
            this.f13016z0 = (t) t.a().get(6);
        }
        this.G0.setOnClickListener(new w8(this, 6));
        this.G0.a(new u(this.f13016z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f12991s.a(this.G0);
        this.f12962i0.addView(this.G0, c8.ha.e(56, 56, 53));
        gb gbVar3 = new gb(activity);
        this.H0 = gbVar3;
        gbVar3.setContentDescription(id.M0(2131754894, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new w8(this, 7));
        this.f12991s.a(this.H0);
        this.f12962i0.addView(this.H0, c8.ha.e(56, 56, 53));
        y yVar = new y(activity, this.f12991s);
        this.I0 = yVar;
        yVar.f13105a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new v8(this, 8));
        this.f12962i0.addView(this.I0, c8.ha.e(-1, 56, 53));
        m3 m3Var2 = new m3(activity, 1);
        m3Var2.o(1.0f, -20.0f);
        m3Var2.d = 5000L;
        m3Var2.k(true);
        m3Var2.u(id.M0(2131744713, null));
        m3Var2.f12437q0 = new ai.m0(13);
        this.l1 = m3Var2;
        m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f12962i0.addView(this.l1, c8.ha.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        m3 m3Var3 = new m3(activity, 2);
        m3Var3.o(0.0f, 28.0f);
        m3Var3.d = 5000L;
        m3Var3.r(true);
        this.f12973m1 = m3Var3;
        this.f12962i0.addView(m3Var3, c8.ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        m3 m3Var4 = new m3(activity, 1);
        m3Var4.o(1.0f, -20.0f);
        m3Var4.d = 5000L;
        m3Var4.u(id.M0(2131744704, null));
        this.n1 = m3Var4;
        m3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f12962i0.addView(this.n1, c8.ha.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f12283a = paint;
        Paint paint2 = new Paint(1);
        view2.f12284b = paint2;
        view2.f12286e = new org.telegram.ui.Components.w5((View) view2, 0L, 250L, xqVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        view2.f12285c = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.w(org.telegram.messenger.g0.L(13.0f));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.setCallback(view2);
        i6Var.f34587b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        h0(false, false);
        this.f12962i0.addView(this.J0, c8.ha.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f12991s.a(this.J0);
        MediaController.O(0);
        g6 g6Var = new g6(activity);
        this.O0 = g6Var;
        g6Var.setDelegate(r9Var);
        g6 g6Var2 = this.O0;
        if (this.O1 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        g6Var2.f12089n0 = -1.0f;
        g6Var2.f12090o0 = z9;
        g6Var2.invalidate();
        this.f12968k0.addView(this.O0, c8.ha.e(-1, 100, 87));
        this.f12991s.a(this.O0);
        g6 g6Var3 = this.O0;
        if (this.A0.j()) {
            f11 = this.A0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        g6Var3.e(true, f11);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.i(id.M0(2131748788, null), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f12968k0.addView(this.P0, c8.ha.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new w8(this, 8));
        m3 m3Var5 = new m3(activity, 3);
        m3Var5.r(true);
        m3Var5.u(id.M0(2131744711, null));
        m3Var5.h = org.telegram.messenger.g0.L(320.0f);
        m3Var5.d = 5000L;
        m3Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = m3Var5;
        this.f12968k0.addView(m3Var5, c8.ha.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        s71 s71Var = new s71(activity);
        this.V0 = s71Var;
        s71Var.M = false;
        s71Var.setAlpha(0.0f);
        this.f12968k0.addView(this.V0, c8.ha.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new d9(this, 4));
        s71 s71Var2 = this.V0;
        this.T1 = 0.0f;
        s71Var2.b(false, 0.0f);
        q6 q6Var = new q6(activity, i7, new u8(this, 12));
        this.D0 = q6Var;
        q6Var.f12666c = new v8(this, 9);
        this.f12968k0.addView(q6Var, c8.ha.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        o9 o9Var = new o9(this, activity);
        this.Q0 = o9Var;
        o9Var.setOnSwitchModeListener(new v8(this, 10));
        this.Q0.setOnSwitchingModeListener(new v8(this, 11));
        this.m0.addView(this.Q0, c8.ha.e(-1, 48, 55));
        this.f12991s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(id.M0(2131754752, null));
        this.R0.setImageResource(2131232767);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.m0.addView(this.R0, c8.ha.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f12991s.a(this.R0);
        this.R0.setOnClickListener(new w8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(id.M0(2131748790, null));
        this.S0.setImageResource(2131232768);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.m0.addView(this.S0, c8.ha.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f12991s.a(this.S0);
        this.S0.setOnClickListener(new w8(this, 10));
        k3 k3Var = new k3(activity);
        this.T0 = k3Var;
        this.m0.addView(k3Var, c8.ha.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f12991s.a(this.T0);
        k3 k3Var2 = new k3(activity);
        this.U0 = k3Var2;
        k3Var2.f12266a.t(id.M0(2131744703, null), false, true);
        k3Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, c8.ha.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f12991s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f12999u1 = dVar2;
        dVar2.setVisibility(8);
        this.f12999u1.setAlpha(0.0f);
        this.f12999u1.i(id.M0(2131744689, null), false, true);
        this.f12999u1.setOnClickListener(new w8(this, 11));
        this.m0.addView(this.f12999u1, c8.ha.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f12790b = new ArrayList();
        frameLayout5.f12792e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f12789a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, c8.ha.e(-1, -1, 119));
        frameLayout5.a(0, 2131231739, id.M0(2131754814, null));
        frameLayout5.a(2, 2131232284, id.M0(2131754756, null));
        frameLayout5.a(1, 2131232286, id.M0(2131754807, null));
        frameLayout5.a(3, 2131231729, id.M0(2131751699, null));
        frameLayout5.a(4, 2131232283, id.M0(2131754811, null));
        String M0 = id.M0(2131745640, null);
        frameLayout5.d = M0;
        frameLayout5.f12792e = true;
        r5 r5Var = new r5(frameLayout5, activity, M0, true);
        frameLayout5.f12791c = r5Var;
        r5Var.setContentDescription(id.M0(2131745640, null));
        frameLayout5.addView(frameLayout5.f12791c, c8.ha.c(-2.0f, -2));
        frameLayout5.e();
        this.f12940b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f12940b1.setOnClickListener(new v8(this, 12));
        this.m0.addView(this.f12940b1, c8.ha.e(-1, 52, 23));
        ib ibVar = new ib(activity);
        this.f12982p1 = ibVar;
        ibVar.setAlpha(0.0f);
        this.f12982p1.setVisibility(8);
        this.f12959h0.addView(this.f12982p1, c8.ha.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        t5 t5Var = new t5(activity, i7, bVar);
        this.f12979o1 = t5Var;
        this.f12959h0.addView(t5Var, c8.ha.e(-1, -1, 119));
        l0(false);
    }

    public static va D(Activity activity, int i7) {
        va vaVar = F2;
        if (vaVar != null && (vaVar.f12938b != activity || vaVar.f12942c != i7)) {
            vaVar.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new va(activity, i7);
        }
        return F2;
    }

    public static void Z(boolean z9) {
        qp.e1().edit().putBoolean("stories_camera", z9).apply();
    }

    public static void a(va vaVar) {
        y9 y9Var = vaVar.B0;
        boolean z9 = false;
        if (y9Var != null && y9Var.getTextureView() != null) {
            Bitmap bitmap = vaVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                vaVar.f12945c2 = false;
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
                z9 = true;
            }
            vaVar.f12945c2 = z9;
            return;
        }
        vaVar.f12945c2 = false;
    }

    public static void b(va vaVar) {
        ValueAnimator valueAnimator = vaVar.f12967j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vaVar.f12967j2 = null;
        }
        vaVar.f12970k2 = false;
        na naVar = vaVar.f12987r;
        float f10 = naVar.f12496a;
        float f11 = naVar.f12497b;
        naVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        vaVar.f12967j2 = ofFloat;
        ofFloat.addUpdateListener(new k9(vaVar, f10, f11, 0));
        vaVar.f12967j2.setDuration(340L);
        vaVar.f12967j2.setInterpolator(xq.h);
        vaVar.f12967j2.addListener(new u9(vaVar, 0));
        vaVar.f12967j2.start();
    }

    public static boolean c(va vaVar) {
        Activity activity = vaVar.f12938b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable h = jg.g.h(context, 2131232765);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        h.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new ca(h, h), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        va vaVar = F2;
        if (vaVar != null) {
            vaVar.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        e7 e7Var = this.K1;
        if (e7Var != null) {
            return e7Var.r();
        }
        return 1;
    }

    public final String B() {
        y9 y9Var = this.B0;
        if (y9Var != null && y9Var.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f13000u2.get(this.f12997t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final u0 C() {
        if (this.N0 == null) {
            u0 u0Var = new u0(this.f12938b);
            this.N0 = u0Var;
            this.f12968k0.addView(u0Var, c8.ha.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        int i7;
        y9 y9Var = this.B0;
        if (y9Var != null && y9Var.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f13000u2;
                if (this.f12997t2 + 1 >= arrayList.size()) {
                    i7 = 0;
                } else {
                    i7 = this.f12997t2 + 1;
                }
                return (String) arrayList.get(i7);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f12963i1 == null) {
            ah0 ah0Var = new ah0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f12960h1 = ah0Var;
            ah0Var.h = true;
            e7 e7Var = this.K1;
            if (e7Var != null && e7Var.f11926y0) {
                ah0Var.M(35);
                this.f12960h1.P(36);
            } else {
                ah0Var.P(0);
                this.f12960h1.M(0);
            }
            this.f12960h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.J9, this.f12934a);
            this.f12960h1.Q(w02, "Sunny");
            this.f12960h1.Q(w02, "Path 6");
            this.f12960h1.Q(w02, "Path");
            this.f12960h1.Q(w02, "Path 5");
            this.f12960h1.o();
            ImageView imageView = new ImageView(this.f12938b);
            this.f12963i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f12963i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f12963i1.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
            this.f12963i1.setOnClickListener(new w8(this, 0));
            this.f12963i1.setVisibility(8);
            this.f12963i1.setImageDrawable(this.f12960h1);
            this.f12963i1.setAlpha(0.0f);
            this.f12965j0.addView(this.f12963i1, 0, c8.ha.r(46, 56, 53));
        }
        return this.f12963i1;
    }

    public final void G() {
        x9 x9Var = this.f13002v1;
        if (x9Var == null) {
            return;
        }
        this.f13003v2 = null;
        x9Var.getTopLayout().setAlpha(0.0f);
        this.f13002v1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.f13002v1.getBottomLayout().setAlpha(0.0f);
        this.f13002v1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.f13002v1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.f13002v1.setVisibility(8);
    }

    public final boolean H() {
        float f10;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.f12937a2 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        i3 i3Var;
        if (!this.W && (i3Var = this.M0) != null) {
            if (i3Var.getTranslationY() < (this.f12975n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.f22563q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: fi.va.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j3) {
        if (!this.S1 && this.K1 != null) {
            a9 a9Var = this.f12958g2;
            if (a9Var != null) {
                org.telegram.messenger.g0.r(a9Var);
            }
            this.f12961h2 = true;
            this.S1 = true;
            this.f12958g2 = new a9(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f12958g2, j3);
            this.X0.p(this.K1, false);
            org.telegram.messenger.g0.i3(this.f12958g2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: fi.va.L():boolean");
    }

    public final void M(int i7, int i10) {
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        if (i7 == 0) {
            u(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i7 == 2) {
            this.f12996t1.setVisibility(8);
            if (i10 == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f12971l0.setVisibility(i16);
            this.f12944c1.setVisibility(8);
            this.f12999u1.setVisibility(8);
        }
        if (i7 == 1) {
            this.f12940b1.setVisibility(8);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f12971l0.setVisibility(i13);
            this.f12957g1.setVisibility(8);
            this.f12966j1.setVisibility(8);
            this.f12950e1.setVisibility(8);
            ImageView imageView = this.f12963i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.X0.setVisibility(i14);
            this.Z0.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            if (i10 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.f12981p0.setVisibility(i15);
            v();
            this.f12982p1.setAlpha(0.0f);
            this.f12982p1.setVisibility(8);
            this.f12936a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i10 == 1) {
            e7 e7Var = this.K1;
            if (e7Var == null || !e7Var.f11904n) {
                t();
                G();
            }
            sd0 sd0Var = this.C1;
            if (sd0Var != null) {
                sd0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            e7 e7Var2 = this.K1;
            if (e7Var2 != null && e7Var2.f11894h0 >= 30000) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f12936a1.setVisibility(i12);
            this.f12971l0.setAlpha(1.0f);
            this.f12971l0.setTranslationY(0.0f);
            e7 e7Var3 = this.K1;
            if (e7Var3 == null || e7Var3.J0 == 0) {
                i17 = 0;
            }
            this.f12944c1.setVisibility(i17);
        }
        if (i10 == 0 && this.V1) {
            C().setVisibility(0);
            u0 C = C();
            C.f12881r.e(true, 0.0f);
            C.a(true);
            di.f8 f8Var = C.h;
            if (f8Var != null) {
                org.telegram.messenger.g0.r(f8Var);
            }
            di.f8 f8Var2 = new di.f8(C, 15);
            C.h = f8Var2;
            org.telegram.messenger.g0.i3(f8Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        sd0 sd0Var2 = this.C1;
        if (sd0Var2 != null) {
            if (i10 == 1 && ((i11 = this.f12956g0) == -1 || i11 == 1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            sd0Var2.setAllowTouch(z10);
        }
        la laVar = this.f12944c1;
        if (laVar != null) {
            if (i10 != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            laVar.f12363d0 = z9;
        }
        if (i10 == 1) {
            int i18 = this.f12942c;
            ui.b0(i18).B(0);
            ui.b0(i18).V0(0, false, true, false);
            ui.b0(i18).V0(2, false, true, false);
            di.z6 P1 = qp.s1(i18).P1();
            if (P1.Q == 0) {
                P1.S();
            }
            qp.s1(i18).P1().U();
        }
    }

    public final void N(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: fi.va.N(int, int):void");
    }

    public final void O() {
        sg.t0 t0Var;
        int i7;
        if (this.f12953f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13011x2 = new u8(this, 3);
            } else {
                Y(false);
            }
        }
        la laVar = this.f12944c1;
        if (laVar != null) {
            laVar.f12366f.s();
        }
        g6 g6Var = this.O0;
        if (g6Var != null) {
            g6Var.h();
        }
        t5 t5Var = this.f12979o1;
        if (t5Var != null) {
            di.z6 P1 = qp.s1(t5Var.f12853a).P1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) P1.f9998i.f(p10.i(P1.f9992a).f24489n);
            if (peerStories != null) {
                i7 = peerStories.stories.size();
            } else {
                i7 = 0;
            }
            t5Var.f12854b = P1.f9993b.m() + i7 + 1;
            t5Var.f12855c.invalidate();
        }
        x9 x9Var = this.f13002v1;
        if (x9Var != null && (t0Var = x9Var.f12553x0.d) != null) {
            t0Var.postRunnable(t0Var.f55224x);
        }
        ja jaVar = this.X0;
        if (jaVar != null) {
            jaVar.x(0, false);
        }
        z0 z0Var = qp.s1(this.f12942c).P1().f10011w;
        if (!z0Var.f13231c && !z0Var.d) {
            z0Var.d = true;
            v0 v0Var = new v0(z0Var, 1);
            yr a02 = yr.a0(z0Var.f13229a);
            a02.f26719a.c(new bi.u7((Object) a02, false, (Object) v0Var, 3));
        }
    }

    public final void P(int i7, int i10) {
        boolean z9;
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
            this.f12976n0.setVisibility(8);
        }
        if (i7 == 0 && (x9Var2 = this.f13002v1) != null) {
            x9Var2.setVisibility(8);
        }
        if (i7 == -1) {
            this.f12944c1.setVisibility(8);
            if (i10 == 2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f12957g1.setVisibility(i11);
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f12966j1.setVisibility(i12);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f12950e1.setVisibility(i13);
            ImageView imageView = this.f12963i1;
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
            this.Z0.setVisibility(i14);
            this.f12981p0.setVisibility(8);
        }
        boolean z10 = true;
        if (i10 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.X0.setAllowCropping(z9);
        if ((i10 == 0 || i7 == 0) && (x9Var = this.f13002v1) != null) {
            x9Var.M0.setLayerType(0, null);
        }
        sd0 sd0Var = this.C1;
        if (sd0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z10 = false;
            }
            sd0Var.setAllowTouch(z10);
        }
        if (i10 == 3) {
            fa faVar2 = this.f12989r1;
            if (faVar2 != null) {
                faVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (faVar = this.f12989r1) != null) {
            faVar.setVisibility(8);
            this.f12989r1.setAppearProgress(0.0f);
            fa faVar3 = this.f12989r1;
            faVar3.f12207y = null;
            g0 g0Var = faVar3.f12201f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            faVar3.d.setVisibility(8);
            faVar3.f12197a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ga gaVar2 = this.f12993s1;
            if (gaVar2 != null) {
                gaVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 4 && (gaVar = this.f12993s1) != null) {
            gaVar.setVisibility(8);
            this.f12993s1.setAppearProgress(0.0f);
            ga gaVar3 = this.f12993s1;
            gaVar3.f12394b = null;
            g0 g0Var2 = gaVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            gaVar3.f12396e.setVisibility(8);
            gaVar3.setVisibility(8);
        }
    }

    public final void Q(pa paVar) {
        di.t6 o4;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i7 = this.f12942c;
        if (qp.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.f12998u0 = false;
        this.f12948e = false;
        this.B2 = false;
        this.f12992s0.f13085g = false;
        WindowManager windowManager = this.f12952f;
        if (windowManager != null && (uaVar = this.f12975n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.f12975n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.f12975n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.f13001v0 == 0 && (o4 = qp.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (paVar != null) {
            this.F = paVar;
            this.J = paVar.f12686a;
            rectF.set(paVar.f12688c);
            this.G = paVar.f12687b;
            this.F.e();
        } else {
            this.J = 0;
            Point point = org.telegram.messenger.g0.f22563q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        this.f12987r.c();
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f12959h0.setBackgroundColor(i10);
        this.f12987r.setTranslationX(0.0f);
        this.f12987r.setTranslationY(0.0f);
        this.f12987r.b(0.0f);
        this.f12987r.setScaleX(1.0f);
        this.f12987r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.g0.g2(this.f12938b);
        f(1.0f, true, new u8(this, 6));
        d();
        this.f13001v0 = 0L;
        this.f13005w0 = "";
    }

    public final void R(oa oaVar, e7 e7Var, long j3) {
        int i7;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i10 = this.f12942c;
        if (qp.s1(i10).v2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f12998u0 = false;
        this.f12948e = false;
        this.B2 = false;
        WindowManager windowManager = this.f12952f;
        if (windowManager != null && (uaVar = this.f12975n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.f12975n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.f12975n, layoutParams);
            f0();
        }
        this.K1 = e7Var;
        this.O1 = e7Var.K ? 1 : 0;
        this.f12992s0.f13085g = false;
        RectF rectF = this.H;
        if (oaVar != null) {
            this.F = oaVar;
            this.J = oaVar.f12686a;
            rectF.set(oaVar.f12688c);
            this.G = oaVar.f12687b;
            this.F.e();
        } else {
            this.J = 0;
            Point point = org.telegram.messenger.g0.f22563q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        this.f12987r.c();
        int i11 = this.J;
        int i12 = 1;
        if (i11 != 1 && i11 != 0) {
            i7 = -14737633;
        } else {
            i7 = 0;
        }
        this.f12959h0.setBackgroundColor(i7);
        this.f12987r.setTranslationX(0.0f);
        this.f12987r.setTranslationY(0.0f);
        this.f12987r.b(0.0f);
        this.f12987r.setScaleX(1.0f);
        this.f12987r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.g0.g2(this.f12938b);
        e7 e7Var2 = this.K1;
        if (e7Var2 != null) {
            this.f12944c1.setText(e7Var2.C0);
        }
        K(new m9(this, 0), j3);
        if (this.K1.f11880b0) {
            i12 = 2;
        }
        J(i12, false);
        k0(-1, false, false);
        this.f12940b1.b(false, false);
        d();
        this.f13001v0 = 0L;
        this.f13005w0 = "";
    }

    public final void S() {
        l60 l60Var;
        ja jaVar = this.X0;
        if (jaVar != null) {
            jaVar.x(4, true);
        }
        la laVar = this.f12944c1;
        if (laVar != null && (l60Var = laVar.U0) != null) {
            l60Var.u();
            laVar.U0 = null;
        }
        ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) new z9(this, 1), 14, false);
        w0Var.setOnDismissListener(new i9(this, 1));
        w0Var.show();
    }

    public final void T(oa oaVar, e7 e7Var) {
        int i7;
        boolean z9;
        int i10;
        di.t6 o4;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i11 = this.f12942c;
        if (qp.s1(i11).v2()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f12998u0 = true;
        this.f12948e = false;
        this.B2 = false;
        WindowManager windowManager = this.f12952f;
        if (windowManager != null && (uaVar = this.f12975n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.f12975n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.f12975n, layoutParams);
            f0();
        }
        this.K1 = e7Var;
        t8.a(i11, e7Var);
        e7 e7Var2 = this.K1;
        if (e7Var2 != null && e7Var2.K) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.O1 = i7;
        if (e7Var2 != null && e7Var2.f11918u && i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f12992s0.f13085g = z9;
        if (this.f13001v0 == 0 && (o4 = qp.s1(i11).P1().o()) != null && o4.a(i11, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.H;
        if (oaVar != null) {
            this.F = oaVar;
            this.J = oaVar.f12686a;
            rectF.set(oaVar.f12688c);
            this.G = oaVar.f12687b;
            this.F.e();
        } else {
            this.J = 0;
            Point point = org.telegram.messenger.g0.f22563q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        this.f12987r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f12959h0.setBackgroundColor(i10);
        this.f12987r.setTranslationX(0.0f);
        this.f12987r.setTranslationY(0.0f);
        this.f12987r.b(0.0f);
        this.f12987r.setScaleX(1.0f);
        this.f12987r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.g0.g2(this.f12938b);
        e7 e7Var3 = this.K1;
        if (e7Var3 != null) {
            this.f12944c1.setText(e7Var3.C0);
        }
        this.f12940b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new u8(this, 6));
        d();
        this.f13001v0 = 0L;
        this.f13005w0 = "";
    }

    public final void U() {
        sg.v0 v0Var = this.f13006w1;
        if (v0Var != null) {
            v0Var.bringToFront();
        }
        View view = this.f13010x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f13014y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f13017z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        ib ibVar = this.f12982p1;
        if (ibVar != null) {
            ibVar.bringToFront();
        }
        sd0 sd0Var = this.C1;
        if (sd0Var != null) {
            sd0Var.bringToFront();
        }
        kd0 kd0Var = this.E1;
        if (kd0Var != null) {
            kd0Var.bringToFront();
        }
        md0 md0Var = this.F1;
        if (md0Var != null) {
            md0Var.bringToFront();
        }
        t5 t5Var = this.f12979o1;
        if (t5Var != null) {
            t5Var.bringToFront();
        }
        p pVar = this.f12985q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(e7 e7Var, boolean z9) {
        File file;
        View view;
        float f10;
        e7 e7Var2;
        boolean z10;
        int i7;
        if (e7Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z9) {
                file = e7Var.O0;
            } else {
                file = e7Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.A0.j()) {
                view = this.A0;
            } else {
                view = this.X0;
            }
            if (z9) {
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
            i51 textureView = this.X0.getTextureView();
            if (e7Var.K && !e7Var.f11918u && textureView != null) {
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
            File file2 = e7Var.Q0;
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
            File file3 = e7Var.P0;
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
            x9 x9Var = this.f13002v1;
            if (x9Var != null && x9Var.A0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                x9 x9Var2 = this.f13002v1;
                x9Var2.f12541r0 = true;
                j5 j5Var = x9Var2.A0;
                j5Var.f55628a = true;
                j5Var.draw(canvas);
                x9 x9Var3 = this.f13002v1;
                x9Var3.A0.f55628a = false;
                x9Var3.f12541r0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = e7.w(this.f12942c, "jpg");
            if (z9) {
                e7Var2 = e7Var;
                z10 = z9;
                Utilities.f21338g.c(new q1(this, createBitmap, z10, w10, e7Var2, 1));
            } else {
                e7Var2 = e7Var;
                z10 = z9;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z10) {
                        i7 = 95;
                    } else {
                        i7 = 99;
                    }
                    createBitmap.compress(compressFormat, i7, new FileOutputStream(w10));
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            }
            if (!z10) {
                e7Var2.N0 = w10;
            }
            e7Var2.f11881b1 = createScaledBitmap;
        }
    }

    public final void W() {
        di.t6 o4;
        int size;
        char c10;
        View[] viewPages;
        f41[] f41VarArr;
        s8 s8Var = this.f12984q0;
        BitmapDrawable bitmapDrawable = null;
        if (s8Var != null) {
            s8Var.dismiss();
            this.f12984q0 = null;
        }
        boolean z9 = this.N1;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
        if (z9) {
            t0 t0Var = this.f12950e1;
            t0Var.getClass();
            t0Var.c(id.N0("VideoConvertFail"));
            p2Var.a();
            r5 r5Var = this.f12940b1.f12791c;
            int i7 = -this.U1;
            this.U1 = i7;
            org.telegram.messenger.g0.G3(i7, r5Var, null);
            return;
        }
        la laVar = this.f12944c1;
        if (laVar != null && laVar.o()) {
            p2Var.a();
            org.telegram.ui.Components.j6 j6Var = laVar.f12386w;
            int i10 = -this.U1;
            this.U1 = i10;
            org.telegram.messenger.g0.G3(i10, j6Var, null);
            laVar.e();
            return;
        }
        e7 e7Var = this.K1;
        int i11 = this.f12942c;
        if ((e7Var == null || (!e7Var.f11892g && e7Var.J0 == 0)) && (o4 = qp.s1(i11).f24795h0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.K1.D0 = qp.s1(i11).X4();
        di.b bVar = this.f12934a;
        char c11 = 1;
        if (laVar != null && !this.K1.D0) {
            CharSequence text = laVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((wy0[]) spannable.getSpans(0, text.length(), wy0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new hc(this.f12975n, bVar).Q(2131624345, 36, org.telegram.messenger.g0.S2(id.M0(2131744581, null), org.telegram.ui.ActionBar.l6.Uc, 0, new u8(this, 27), bVar)).k(true);
                    int i12 = -this.U1;
                    this.U1 = i12;
                    org.telegram.messenger.g0.G3(i12, laVar, null);
                    return;
                }
            }
        }
        e7 e7Var2 = this.K1;
        if (!e7Var2.f11892g && e7Var2.J0 == 0) {
            if (this.N != 0) {
                e7Var2.f11920v0 = qp.s1(i11).j1(this.N);
            }
            ja jaVar = this.X0;
            jaVar.x(3, true);
            s8 s8Var2 = new s8(this.K1.I0, this.f12938b, bVar);
            s8Var2.W0(this.K1.E0);
            s8Var2.V0(this.K1.f11920v0);
            s8Var2.f12814w1 = this.M;
            s8Var2.L1 = new v8(this, 14);
            s8Var2.L0(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            s8Var2.S0(size);
            s8Var2.Q0(false);
            CharSequence text2 = laVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (f41 f41Var : (f41[]) ((Spanned) text2).getSpans(0, text2.length(), f41.class)) {
                    if (f41Var != null) {
                        try {
                            TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(Long.parseLong(f41Var.getURL())));
                            if (a22 != null && !t10.B(a22) && t10.n(a22) != null && !arrayList2.contains(a22)) {
                                arrayList2.add(t10.n(a22));
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
                            TLObject f22 = qp.s1(i11).f2(charSequence);
                            if (f22 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) f22;
                                if (!user.bot && !t10.B(user) && user.f27105id != 777000 && !t10.z(user) && !arrayList2.contains(charSequence)) {
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
                    TLObject f23 = qp.s1(i11).f2(charSequence2);
                    if (f23 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) f23;
                        if (!user2.bot && !t10.B(user2) && user2.f27105id != 777000 && !t10.z(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            s8Var2.J1 = arrayList2;
            s8Var2.N1 = new v8(this, 15);
            s8Var2.O1 = new v8(this, 16);
            s8Var2.K1 = new d9(this, 9);
            this.f12984q0 = s8Var2;
            e7 e7Var3 = this.K1;
            if (e7Var3.K) {
                if (jaVar != null && !e7Var3.f11891f0 && this.f12953f0 != 2) {
                    e7Var3.f11888e0 = jaVar.getCurrentPosition();
                    c20 v8Var = new v8(this, 17);
                    View view = this.f13006w1;
                    View view2 = this.f13017z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = jaVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    jaVar.h(v8Var, viewArr);
                }
                s8 s8Var3 = this.f12984q0;
                Bitmap bitmap = this.K1.f11893g0;
                u8 u8Var = new u8(this, 20);
                if (bitmap != null) {
                    s8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                s8Var3.S1 = bitmapDrawable;
                s8Var3.T1 = u8Var;
                g1 g1Var = s8Var3.f12802i1;
                if (g1Var != null) {
                    for (View view3 : g1Var.getViewPages()) {
                        if (view3 instanceof n8) {
                            n8 n8Var = (n8) view3;
                            n8Var.h(false);
                            n8Var.f(false);
                        }
                    }
                }
            }
            this.f12984q0.setOnDismissListener(new i9(this, 0));
            this.f12984q0.show();
            return;
        }
        e7Var2.f11901l = false;
        h(null);
        o0();
    }

    public final void X(qa qaVar) {
        int i7 = 0;
        RectF rectF = this.H;
        if (qaVar != null) {
            this.F = qaVar;
            this.J = qaVar.f12686a;
            rectF.set(qaVar.f12688c);
            this.G = qaVar.f12687b;
        } else {
            this.F = null;
            this.J = 0;
            Point point = org.telegram.messenger.g0.f22563q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.J;
        if (i10 != 1 && i10 != 0) {
            i7 = -14737633;
        }
        this.f12959h0.setBackgroundColor(i7);
    }

    public final void Y(boolean z9) {
        boolean z10;
        if (!this.f13007w2 || z9) {
            this.f12994s2 = false;
            Activity activity = this.f12938b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f12994s2 = z10;
                if (z10) {
                    Drawable mutate = activity.getResources().getDrawable(2131232765).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    xp xpVar = new xp(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    xpVar.f40447e = L;
                    xpVar.f40448f = L2;
                    this.A0.setCameraThumb(xpVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.f12934a);
                        int i7 = org.telegram.ui.ActionBar.l6.L5;
                        alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.l6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.M0(2131747308, null));
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.T = X2;
                        alertDialog$Builder.k(id.M0(2131747300, null), new d9(this, 12));
                        alertDialog$Builder.h(id.M0(2131751772, null), null);
                        u1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f13007w2 = true;
                }
            }
            if (!this.f12994s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new u8(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        y9 y9Var = this.B0;
        if (y9Var != null && y9Var.getTextureView() != null) {
            try {
                Utilities.f21339i.c(new x1(this, this.B0.getTextureView().getBitmap(), runnable, 8));
            } catch (Throwable unused) {
            }
        }
    }

    public final void b0(View view, boolean z9, boolean z10) {
        if (view == null) {
            return;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z10) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z9) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setUpdateListener(new w9(this, 1)).setListener(new ai.g0(this, z9, view, 4)).setDuration(320L).setInterpolator(xq.h).start();
            return;
        }
        view.animate().cancel();
        if (!z9) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (z9) {
            f10 = 1.0f;
        }
        view.setAlpha(f10);
        m0();
    }

    public final void c0(boolean z9) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z9) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f12952f.updateViewLayout(this.f12975n, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        qs.e().b(this, qs.f25066r2);
        int i7 = this.f12942c;
        qs.f(i7).b(this, qs.f25116y5);
        qs.f(i7).b(this, qs.f24976b3);
    }

    public final void d0(String str) {
        int i7;
        gb gbVar = this.E0;
        gbVar.clearAnimation();
        y9 y9Var = this.B0;
        if ((y9Var != null && y9Var.isDual()) || this.f12937a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z9 = false;
        if (str == null) {
            b0(gbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    gbVar.setContentDescription(id.M0(2131754915, null));
                    i7 = 2131231751;
                }
            } else {
                str.equals("off");
            }
            gbVar.setContentDescription(id.M0(2131754914, null));
            i7 = 2131231752;
        } else {
            if (str.equals("on")) {
                gbVar.setContentDescription(id.M0(2131754913, null));
                i7 = 2131231753;
            }
            gbVar.setContentDescription(id.M0(2131754914, null));
            i7 = 2131231752;
        }
        if (gbVar.f12116n != i7) {
            gbVar.f12116n = i7;
            ValueAnimator valueAnimator = gbVar.f12117r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                gbVar.f12117r = null;
            }
            gbVar.setDrawable(i7);
        }
        if (this.f12953f0 == 0 && !this.I0.f13108e && this.Y1 != null && !H()) {
            z9 = true;
        }
        b0(gbVar, z9, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        di.t6 o4;
        e7 e7Var;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (i7 == qs.f25066r2) {
            g6 g6Var = this.O0;
            if (g6Var != null) {
                g6Var.h();
            }
            if (this.f12974m2 != null && MediaController.f21245b2 != null) {
                for (int i11 = 0; i11 < MediaController.f21245b2.size(); i11++) {
                    we weVar = (we) MediaController.f21245b2.get(i11);
                    int i12 = weVar.f26297a;
                    we weVar2 = this.f12974m2;
                    if (i12 == weVar2.f26297a && weVar.f26298b == weVar2.f26298b) {
                        this.f12974m2 = weVar;
                        return;
                    }
                }
            }
        } else if (i7 == qs.f25116y5) {
            g6 g6Var2 = this.O0;
            if (g6Var2 != null && !this.V1) {
                g6Var2.h();
            }
        } else if (i7 == qs.f24976b3) {
            int i13 = this.f12953f0;
            int i14 = this.f12942c;
            if (i13 == 1) {
                if (!this.N1 && !this.f12944c1.o()) {
                    di.z6 P1 = qp.s1(i14).P1();
                    int A = A();
                    di.t6 o10 = P1.o();
                    if (o10 == null || !o10.a(P1.f9992a, A) || ((e7Var = this.K1) != null && (e7Var.f11892g || e7Var.J0 != 0))) {
                        z9 = true;
                    }
                }
                this.f12940b1.setShareEnabled(z9);
            } else if (i13 == 0 && (o4 = qp.s1(i14).P1().o()) != null && o4.a(i14, 1)) {
                e7 e7Var2 = this.K1;
                if (e7Var2 == null || e7Var2.J0 == 0) {
                    g0(o4, true);
                }
            }
        }
    }

    public final void e(boolean z9) {
        float height;
        boolean z10;
        int i7;
        u0 u0Var;
        this.K0 = z9;
        Boolean bool = this.f12983p2;
        if (bool == null || bool.booleanValue() != z9) {
            if (this.M0 == null) {
                if (z9) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.f12986q2 = new e9(this, z9, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f12977n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f12977n2 = null;
            }
            r1.g gVar = this.f12980o2;
            if (gVar != null) {
                gVar.d();
                this.f12980o2 = null;
            }
            if (this.M0 == null) {
                if (z9) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            i3 i3Var = this.M0;
            if (i3Var != null) {
                i3Var.K = false;
            }
            if (z9 && (u0Var = this.N0) != null) {
                u0Var.a(false);
            }
            int i10 = 4;
            na naVar = this.f12987r;
            if (naVar != null) {
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                naVar.setImportantForAccessibility(i7);
            }
            i3 i3Var2 = this.M0;
            if (z9) {
                i10 = 0;
            }
            i3Var2.setImportantForAccessibility(i10);
            this.f12983p2 = Boolean.valueOf(z9);
            float translationY = this.M0.getTranslationY();
            ua uaVar = this.f12975n;
            if (z9) {
                height = 0.0f;
            } else {
                height = (uaVar.getHeight() - this.M0.g()) + (org.telegram.messenger.g0.f22558n * 2.5f);
            }
            Math.max(1, uaVar.getHeight());
            i3 i3Var3 = this.M0;
            i3Var3.K = !z9;
            if (this.f12967j2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f12970k2 = z10;
            if (z9) {
                r1.g gVar2 = new r1.g(i3Var3, r1.g.f54264p, height);
                this.f12980o2 = gVar2;
                gVar2.f54280m.a(0.75f);
                this.f12980o2.f54280m.b(350.0f);
                this.f12980o2.a(new f9(this, height, 0));
                this.f12980o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f12977n2 = ofFloat;
                ofFloat.addUpdateListener(new g9(this, 0));
                this.f12977n2.addListener(new u9(this, 1));
                this.f12977n2.setDuration(450L);
                this.f12977n2.setInterpolator(xq.h);
                this.f12977n2.start();
            }
            if (!z9 && !this.S1) {
                this.f12972l2 = null;
            }
            if (!z9 && this.f12953f0 == 0 && !this.f12994s2) {
                q();
            }
        }
    }

    public final void e0(boolean z9, boolean z10) {
        if (this.f12954f1 == null) {
            ah0 ah0Var = new ah0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f12954f1 = ah0Var;
            ah0Var.F *= 1.5f;
        }
        this.f12957g1.setAnimation(this.f12954f1);
        int i7 = 20;
        if (!z10) {
            ah0 ah0Var2 = this.f12954f1;
            if (!z9) {
                i7 = 0;
            }
            ah0Var2.N(i7, false, false);
        } else if (z9) {
            ah0 ah0Var3 = this.f12954f1;
            if (ah0Var3.f31820a0 > 20) {
                ah0Var3.N(0, false, false);
            }
            this.f12954f1.P(20);
            this.f12954f1.start();
        } else {
            ah0 ah0Var4 = this.f12954f1;
            int i10 = ah0Var4.f31820a0;
            if (i10 != 0 && i10 < 43) {
                ah0Var4.P(43);
                this.f12954f1.start();
            }
        }
    }

    public final void f(float f10, boolean z9, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        na naVar = this.f12987r;
        if (z9) {
            this.P.d();
            qs.e().k(qs.f25021j1, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new g9(this, 5));
            this.E.addListener(new bi.o7(this, f10, runnable, 3));
            if (f10 < 1.0f && this.f13004w) {
                this.E.setDuration(250L);
                this.E.setInterpolator(xq.h);
            } else if (f10 <= 0.0f && naVar.f12496a >= org.telegram.messenger.g0.L(20.0f)) {
                if (f10 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(xq.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(xq.h);
                }
            } else {
                this.E.setDuration(300L);
                this.E.setInterpolator(new x1.a());
            }
            this.E.start();
            return;
        }
        this.L = null;
        this.I = f10;
        j();
        naVar.invalidate();
        this.f12975n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f12975n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 2));
    }

    public final void g(boolean z9, boolean z10) {
        float f10;
        float L;
        float L2;
        float f11;
        float L3;
        float L4;
        y yVar;
        if (z9) {
            m3 m3Var = this.l1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            m3 m3Var2 = this.f12973m1;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            m3 m3Var3 = this.f12969k1;
            if (m3Var3 != null) {
                m3Var3.f(true);
            }
            m3 m3Var4 = this.W0;
            if (m3Var4 != null) {
                m3Var4.f(true);
            }
        }
        if (this.f12937a2 == z9 && this.f12941b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.f12937a2 = z9;
        this.f12941b2 = H();
        if (z9 && (yVar = this.I0) != null && yVar.f13108e) {
            yVar.a(false, z10);
        }
        l0(z10);
        o9 o9Var = this.Q0;
        k3 k3Var = this.U0;
        k3 k3Var2 = this.T0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9 && this.f12953f0 == 0 && !H()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z9 && this.f12953f0 == 0 && !H()) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k3Var2, property2, L3);
            if (z9 || this.f12953f0 != 0 || !H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k3Var, property, f12);
            if (!z9 && this.f12953f0 == 0 && H()) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(k3Var, property2, L4);
            if (z9 || this.f12953f0 != 0 || H()) {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o9Var, property, f13);
            if (z9 || this.f12953f0 != 0 || H()) {
                f14 = org.telegram.messenger.g0.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(o9Var, property2, f14));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(xq.h);
            this.Z1.start();
            return;
        }
        if (z9 && this.f12953f0 == 0 && !H()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        k3Var2.setAlpha(f10);
        if (z9 && this.f12953f0 == 0 && !H()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        k3Var2.setTranslationY(L);
        if (z9 || this.f12953f0 != 0 || !H()) {
            f12 = 0.0f;
        }
        k3Var.setAlpha(f12);
        if (!z9 && this.f12953f0 == 0 && H()) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(16.0f);
        }
        k3Var.setTranslationY(L2);
        if (z9 || this.f12953f0 != 0 || H()) {
            f13 = 0.0f;
        }
        o9Var.setAlpha(f13);
        if (z9 || this.f12953f0 != 0 || H()) {
            f14 = org.telegram.messenger.g0.L(16.0f);
        }
        o9Var.setTranslationY(f14);
    }

    public final void g0(di.t6 t6Var, boolean z9) {
        if (this.f13018z2) {
            return;
        }
        ug.i0 i0Var = new ug.i0(t6Var.b(), this.f12942c, this.f12938b, new z9(this, 0), null);
        i0Var.P1 = A();
        i0Var.setOnDismissListener(new y60(2, this, z9));
        this.X0.x(7, true);
        this.f13018z2 = true;
        i0Var.show();
    }

    public final void h(Runnable runnable) {
        e7 e7Var;
        Runnable runnable2;
        ja jaVar;
        float f10;
        boolean z9;
        Bitmap.CompressFormat compressFormat;
        td0 td0Var = this.B1;
        if (td0Var != null && (e7Var = this.K1) != null) {
            e7Var.f11897j = td0Var.a() | e7Var.f11897j;
            e7 e7Var2 = this.K1;
            td0 td0Var2 = this.B1;
            File file = e7Var2.Z0;
            if (file != null) {
                file.delete();
                e7Var2.Z0 = null;
            }
            hf savedFilterState = td0Var2.getSavedFilterState();
            e7Var2.f11878a1 = savedFilterState;
            if (!e7Var2.K) {
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
                        int i7 = e7Var2.R;
                        float f11 = 1.0f;
                        if (i7 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i7 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, e7Var2.f11900k0 / 2.0f, e7Var2.f11902l0 / 2.0f);
                        matrix.postRotate(-e7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        e7Var2.f11905n0.preScale(e7Var2.f11900k0 / createBitmap.getWidth(), e7Var2.f11902l0 / createBitmap.getHeight());
                        e7Var2.f11900k0 = createBitmap.getWidth();
                        e7Var2.f11902l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = e7Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            e7Var2.Z0.delete();
                        }
                        String k10 = e7.k(e7Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        int i10 = e7Var2.f11876a;
                        if (!z9) {
                            str = "jpg";
                        }
                        e7Var2.Z0 = e7.w(i10, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(e7Var2.Z0);
                                if (z9) {
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
                            Utilities.f21339i.c(new aa.d0(e7Var2, createBitmap, z9, runnable2, 4));
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
                e7 e7Var3 = this.K1;
                if (!e7Var3.K && (jaVar = this.X0) != null) {
                    jaVar.set(e7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z9, boolean z10) {
        if (this.d2 != z9) {
            this.d2 = z9;
            float f10 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z9) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(xq.h).withEndAction(new e9(this, z9, 1)).start();
                return;
            }
            this.J0.clearAnimation();
            if (z9) {
                f10 = 1.0f;
            }
            this.J0.setAlpha(f10);
            if (!z9) {
                this.J0.b(false, false);
            }
        }
    }

    public final void i() {
        if (this.K1 != null && this.D1 != null && this.f12959h0.getMeasuredWidth() > 0 && this.f12959h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i7 = this.K1.Q;
            if (i7 != 0) {
                matrix.postRotate(-i7, this.f12959h0.getMeasuredWidth() / 2.0f, this.f12959h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f12959h0.getMeasuredWidth() / this.f12959h0.getMeasuredHeight(), this.f12959h0.getMeasuredHeight() / this.f12959h0.getMeasuredWidth(), this.f12959h0.getMeasuredWidth() / 2.0f, this.f12959h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f12959h0.getMeasuredWidth()) * this.K1.f11900k0, (1.0f / this.f12959h0.getMeasuredHeight()) * this.K1.f11902l0);
            matrix.postConcat(this.K1.f11905n0);
            matrix.postScale(this.f12959h0.getMeasuredWidth() / this.K1.f11896i0, this.f12959h0.getMeasuredHeight() / this.K1.f11898j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void i0(boolean z9) {
        Integer num;
        float f10;
        s71 s71Var = this.V0;
        if ((s71Var.getTag() != null && z9) || (s71Var.getTag() == null && !z9)) {
            if (z9) {
                Runnable runnable = this.f12951e2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                u8 u8Var = new u8(this, 25);
                this.f12951e2 = u8Var;
                org.telegram.messenger.g0.i3(u8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f12955f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        s71Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f12955f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z9) {
            s71Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f12955f2;
        Property property = View.ALPHA;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(s71Var, property, f10));
        this.f12955f2.addListener(new ch.y(13, this, z9));
        this.f12955f2.start();
        if (z9) {
            u8 u8Var2 = new u8(this, 26);
            this.f12951e2 = u8Var2;
            org.telegram.messenger.g0.i3(u8Var2, 2000L);
        }
    }

    public final void j() {
        di.j3 j3Var;
        if (this.J == 1) {
            RectF rectF = this.f12946d0;
            rectF.set(this.f12959h0.getLeft(), this.f12959h0.getTop(), this.f12959h0.getMeasuredWidth(), this.f12959h0.getMeasuredHeight());
            rectF.offset(this.f12987r.getX(), this.f12987r.getY());
            float f10 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f12943c0;
            org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
            this.f12959h0.setAlpha(this.I);
            float f11 = rectF3.left;
            ha haVar = this.f12959h0;
            haVar.setTranslationX((f11 - haVar.getLeft()) - this.f12987r.getX());
            float f12 = rectF3.top;
            ha haVar2 = this.f12959h0;
            haVar2.setTranslationY((f12 - haVar2.getTop()) - this.f12987r.getY());
            qa qaVar = this.F;
            if (qaVar != null && (j3Var = qaVar.f12690f) != null) {
                j3Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f12690f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f12959h0.setScaleX(rectF3.width() / this.f12959h0.getMeasuredWidth());
            this.f12959h0.setScaleY(rectF3.height() / this.f12959h0.getMeasuredHeight());
            this.f12962i0.setAlpha(this.I);
            this.f12968k0.setAlpha(this.I);
            this.f12971l0.setAlpha(this.I);
            if (this.f12953f0 == 2) {
                this.f12999u1.setAlpha(this.I);
            }
        }
    }

    public final void j0() {
        s8 s8Var = this.f12984q0;
        if (s8Var != null) {
            s8Var.dismiss();
            this.f12984q0 = null;
        }
        s8 s8Var2 = new s8(86400, this.f12938b, this.f12934a);
        s8Var2.U0();
        s8Var2.W0(this.f13013y0);
        TLRPC.InputPeer inputPeer = this.f13009x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = qp.s1(this.f12942c).j1(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        s8Var2.V0(inputPeer);
        s8Var2.f12814w1 = this.M;
        s8Var2.L1 = new v8(this, 18);
        s8Var2.L0(false);
        s8Var2.S0(1);
        s8Var2.Q0(false);
        s8Var2.N1 = new v8(this, 19);
        s8Var2.K1 = new d9(this, 11);
        this.f12984q0 = s8Var2;
        s8Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: fi.va.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: fi.va.k0(int, boolean, boolean):void");
    }

    public final void l() {
        e7 e7Var;
        boolean z9;
        if (this.f13002v1 != null && (e7Var = this.K1) != null && e7Var.f11918u) {
            File file = e7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = e7.w(this.f12942c, "webp");
            x9 x9Var = this.f13002v1;
            e7 e7Var2 = this.K1;
            ArrayList arrayList = e7Var2.T0;
            if (this.O1 != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            Bitmap q02 = x9Var.q0(arrayList, false, false, true, z9, e7Var2);
            try {
                try {
                    q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (q02.isRecycled()) {
                        return;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    try {
                        this.K1.W0.delete();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    this.K1.W0 = null;
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

    public final void l0(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f10;
        boolean z15;
        y9 y9Var;
        boolean z16 = false;
        if (this.f12953f0 == 0 && this.O1 == 1 && !this.I0.f13108e && !H()) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0(z10, z9);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        if (yVar != null && yVar.f13108e) {
            z11 = false;
        } else {
            z11 = true;
        }
        b0(this.f12976n0, z11, z9);
        if (!this.f12937a2 && this.O1 != -1 && this.f12953f0 == 0 && this.Y1 != null && !this.I0.f13108e && !H()) {
            z12 = true;
        } else {
            z12 = false;
        }
        b0(this.E0, z12, z9);
        if (!this.f12937a2 && this.O1 != -1 && this.f12953f0 == 0 && (y9Var = this.B0) != null && y9Var.f11636a && !this.I0.f13108e && !this.A0.j()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.F0, z13, z9);
        if (!this.f12937a2 && this.O1 != -1 && this.f12953f0 == 0 && !this.I0.f13108e) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.G0, z14, z9);
        b0(this.H0, this.I0.f13108e, z9);
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.O0.e(z9, f10);
        boolean z17 = this.I0.f13108e;
        m3 m3Var = this.n1;
        if (z17) {
            m3Var.w();
        } else {
            m3Var.f(true);
        }
        g(this.f12937a2, z9);
        if (this.O1 == -1 && this.f12953f0 == 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        org.telegram.messenger.g0.V3(this.S0, z15, true);
        if (this.O1 == -1 && this.f12953f0 == 0) {
            z16 = true;
        }
        org.telegram.messenger.g0.V3(this.R0, z16, true);
    }

    public final void m0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = this.E0.getAlpha();
        this.f12976n0.setTranslationX(0.0f);
        float alpha5 = this.f12976n0.getAlpha();
        float L = (alpha4 * org.telegram.messenger.g0.L(46.0f)) + alpha3 + org.telegram.messenger.g0.L(8.0f);
        v vVar = this.I0.f13105a;
        vVar.setPadding((int) ((alpha5 * org.telegram.messenger.g0.L(46.0f)) + 0.0f + org.telegram.messenger.g0.L(8.0f)), 0, (int) L, 0);
        vVar.invalidate();
    }

    public final void n() {
        boolean z9;
        if (this.K == 0.0f && this.I >= 1.0f && !this.B2) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9 == this.A2) {
            return;
        }
        bg.v0 v0Var = this.D;
        if (v0Var != null) {
            v0Var.c(!z9);
        }
        this.A2 = z9;
    }

    public final void n0(boolean z9) {
        int i7;
        ah0 ah0Var = this.f12960h1;
        if (ah0Var != null) {
            int[] iArr = ah0Var.f31826e;
            int i10 = 0;
            if (z9) {
                e7 e7Var = this.K1;
                if (e7Var != null && e7Var.f11926y0) {
                    i10 = iArr[0];
                }
                ah0Var.P(i10);
                ah0 ah0Var2 = this.f12960h1;
                if (ah0Var2 != null) {
                    ah0Var2.start();
                    return;
                }
                return;
            }
            e7 e7Var2 = this.K1;
            if (e7Var2 != null && e7Var2.f11926y0) {
                i7 = iArr[0] - 1;
            } else {
                i7 = 0;
            }
            ah0Var.N(i7, false, true);
            this.f12960h1.P(i7);
            ImageView imageView = this.f12963i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f12997t2 < 0) {
            this.f12997t2 = qp.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f13000u2 = arrayList;
            arrayList.add("off");
            this.f13000u2.add("auto");
            this.f13000u2.add("on");
            float f10 = qp.e1().getFloat("frontflash_warmth", 0.9f);
            p2 p2Var = this.f12991s;
            p2Var.f12584o = f10;
            p2Var.f12583n = p2.f(f10);
            p2Var.g();
            float f11 = qp.e1().getFloat("frontflash_intensity", 1.0f);
            p2 p2Var2 = this.f12991s;
            p2Var2.f12585p = f11;
            p2Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        u8 u8Var = new u8(this, 2);
        x9 x9Var = this.f13002v1;
        e7 e7Var = this.K1;
        if (x9Var != null && e7Var != null) {
            e7Var.f();
            boolean r02 = x9Var.r0();
            boolean z9 = x9Var.f12553x0.getPainting().E;
            Utilities.f21338g.c(new x8(this, x9Var, e7Var.f11896i0, e7Var.f11898j0, e7Var, z9, r02, u8Var, 1));
            return;
        }
        u8Var.run();
    }

    public final void p(boolean z9) {
        ja jaVar;
        if (this.d) {
            s8 s8Var = this.f12984q0;
            if (s8Var != null) {
                s8Var.dismiss();
                this.f12984q0 = null;
            }
            e7 e7Var = this.K1;
            long j3 = 0;
            if (e7Var != null && !e7Var.h) {
                if ((this.f13004w && e7Var.f11892g) || e7Var.f11879b != 0) {
                    e7Var.f11897j = false;
                }
                e7Var.i(false);
            }
            this.K1 = null;
            z10 z10Var = this.R;
            if (z10Var != null && (jaVar = this.X0) != null) {
                if (this.f12948e) {
                    return;
                }
                this.f12948e = true;
                u51 u51Var = jaVar.D;
                if (u51Var != null) {
                    u51Var.g0();
                    jaVar.D.m0();
                    jaVar.D = null;
                }
                u51 u51Var2 = jaVar.f13195y;
                if (u51Var2 != null) {
                    j3 = u51Var2.S();
                    jaVar.f13195y.g0();
                    jaVar.f13195y.m0();
                    jaVar.f13195y = null;
                }
                u51 u51Var3 = jaVar.f13169e;
                if (u51Var3 != null) {
                    j3 = u51Var3.S();
                    jaVar.f13169e.g0();
                    jaVar.f13169e.m0();
                    jaVar.f13169e = null;
                }
                z10Var.a(Long.valueOf(j3), new e9(this, z9, 2), Boolean.valueOf(this.f13004w), Long.valueOf(this.f13008x));
                return;
            }
            ja jaVar2 = this.X0;
            if (jaVar2 != null && !z9) {
                jaVar2.set(null);
            }
            f(0.0f, z9, new u8(this, 23));
            int i7 = this.J;
            if (i7 == 1 || i7 == 0) {
                this.f12975n.setBackgroundColor(0);
                this.f12940b1.b(false, true);
            }
            qs.e().n(this, qs.f25066r2);
            int i10 = this.f12942c;
            qs.f(i10).n(this, qs.f25116y5);
            qs.f(i10).n(this, qs.f24976b3);
        }
    }

    public final boolean p0() {
        y9 y9Var;
        if ((this.P1 || this.Q1) && (y9Var = this.B0) != null && y9Var.isFrontface()) {
            int i7 = this.f12997t2;
            if (i7 == 2 || (i7 == 1 && this.f12945c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z9;
        Activity activity = this.f12938b;
        if (this.B0 == null && activity != null) {
            this.B0 = new y9(this, activity, qp.e1().getBoolean("stories_camera", false));
            g6 g6Var = this.O0;
            float f10 = 0.0f;
            if (g6Var != null) {
                g6Var.f12082g0 = 0.0f;
                g6Var.f12083h0.e(true, 0.0f);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(z());
            this.B0.initTexture();
            this.B0.setDelegate(new d9(this, 0));
            hb hbVar = this.F0;
            if (this.B0.f11636a && this.f12953f0 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            b0(hbVar, z9, true);
            z zVar = this.G0;
            if (!this.B0.f11636a) {
                f10 = org.telegram.messenger.g0.L(46.0f);
            }
            zVar.setTranslationX(f10);
            this.A0.setCameraView(this.B0);
            if (qp.e1().getInt("storyhint2", 0) < 1) {
                this.W0.w();
                qp.e1().edit().putInt("storyhint2", qp.e1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!b1.q(this.B0.getContext()) || !qp.e1().getBoolean("dualcam", b1.p(org.telegram.messenger.t0.f25566b, false))) && this.B0.f11636a && qp.e1().getInt("storydualhint", 0) < 2) {
                this.l1.w();
            }
            if (this.C0 == null) {
                this.C0 = new c6(activity, new v8(this, 3));
            }
            this.C0.a(this.B0);
            q6 q6Var = this.D0;
            if (q6Var != null) {
                ia iaVar = this.A0;
                Object blurRenderNode = iaVar.getBlurRenderNode();
                q6Var.F = iaVar;
                q6Var.G = blurRenderNode;
                q6Var.invalidate();
            }
        }
    }

    public final void r() {
        e7 e7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.B1 == null && (e7Var = this.K1) != null) {
            hf hfVar = null;
            if (!e7Var.K) {
                if (e7Var.Z0 == null) {
                    q10 = this.X0.getPhotoBitmap();
                } else {
                    d9 d9Var = new d9(this, 10);
                    Point point = org.telegram.messenger.g0.f22563q;
                    q10 = e7.q(d9Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                i51 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                e7 e7Var2 = this.K1;
                if (e7Var2 != null) {
                    hfVar = e7Var2.f11878a1;
                }
                td0 td0Var = new td0(this.f12938b, textureView, bitmap, null, orientation, hfVar, null, 0, false, false, this.f12988r0, this.f12934a);
                this.B1 = td0Var;
                this.f12987r.addView(td0Var);
                sd0 sd0Var = this.C1;
                if (sd0Var != null) {
                    sd0Var.setFilterView(this.B1);
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
                i();
                kd0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f12959h0.addView(blurControl);
                }
                md0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f12959h0.addView(curveControl);
                }
                U();
                this.B1.getDoneTextView().setOnClickListener(new w8(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new w8(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
                this.B1.f38367i0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z9) {
        boolean z10;
        boolean z11;
        if (this.M0 != null) {
            ia iaVar = this.A0;
            if (iaVar != null && iaVar.j()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.M0.P) {
                return;
            }
        }
        if (this.f12938b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        we weVar = this.f12974m2;
        boolean z12 = !z9;
        ia iaVar2 = this.A0;
        if (iaVar2 != null && iaVar2.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i3 i3Var = new i3(this, this.f12942c, this.f12938b, this.f12934a, weVar, z9, z12, z10);
        this.M0 = i3Var;
        i3Var.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new m9(this, 1));
        this.M0.setOnSelectListener(new l9(0, this, z9));
        this.M0.setOnSelectMultipleListener(new bi.h2(this, 2));
        v4.a0 a0Var = this.f12972l2;
        if (a0Var != null) {
            ei.h hVar = this.M0.f11963e;
            hVar.B = a0Var;
            hVar.l0();
        }
        this.f12975n.addView(this.M0, c8.ha.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: fi.va.t():void");
    }

    public final void u(boolean z9) {
        c6 c6Var = this.C0;
        if (c6Var != null) {
            c6Var.f11735f = null;
            Utilities.f21336e.a(c6Var.h);
            this.C0 = null;
            ia iaVar = this.A0;
            if (iaVar != null) {
                iaVar.f11826c.a(null);
            }
        }
        q6 q6Var = this.D0;
        if (q6Var != null) {
            q6Var.F = null;
            q6Var.G = null;
            q6Var.invalidate();
        }
        if (this.B0 != null) {
            if (z9) {
                a0(new u8(this, 8));
                return;
            }
            a0(new u8(this, 9));
            this.B0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.B0);
            ia iaVar2 = this.A0;
            if (iaVar2 != null) {
                iaVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        i3 i3Var = this.M0;
        if (i3Var == null) {
            return;
        }
        this.f12975n.removeView(i3Var);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f12977n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12977n2 = null;
        }
        r1.g gVar = this.f12980o2;
        if (gVar != null) {
            gVar.d();
            this.f12980o2 = null;
        }
        this.f12983p2 = null;
    }

    public final void x() {
        td0 td0Var = this.B1;
        if (td0Var == null) {
            return;
        }
        td0Var.b();
        this.C1.setFilterView(null);
        this.f12987r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f12959h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        kd0 kd0Var = this.E1;
        if (kd0Var != null) {
            this.f12959h0.removeView(kd0Var);
            this.E1 = null;
        }
        md0 md0Var = this.F1;
        if (md0Var != null) {
            this.f12959h0.removeView(md0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        x9 x9Var = this.f13002v1;
        if (x9Var != null) {
            x9Var.A0.removeAllViews();
            x9 x9Var2 = this.f13002v1;
            x9Var2.f12553x0.h();
            x9Var2.A0.setVisibility(8);
            x9Var2.f12557z0.setVisibility(8);
            x9Var2.f12534n0.postRunnable(new ai.m0(11));
            c5 c5Var = x9Var2.T1;
            if (c5Var != null) {
                c5Var.dismiss();
            }
            sg.q qVar = x9Var2.C1;
            if (qVar != null) {
                qVar.dismiss();
            }
            this.f12987r.removeView(this.f13002v1);
            this.f13002v1 = null;
            sg.v0 v0Var = this.f13006w1;
            if (v0Var != null) {
                this.f12959h0.removeView(v0Var);
                this.f13006w1 = null;
            }
            View view = this.f13014y1;
            if (view != null) {
                this.f12959h0.removeView(view);
                this.f13014y1 = null;
            }
            View view2 = this.f13010x1;
            if (view2 != null) {
                this.f12959h0.removeView(view2);
                this.f13010x1 = null;
            }
            View view3 = this.f13017z1;
            if (view3 != null) {
                this.f12959h0.removeView(view3);
                this.f13017z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f12959h0.removeView(view4);
                this.A1 = null;
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
        return this.f12938b.getResources().getDrawable(2131231492);
    }
}
