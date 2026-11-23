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
import org.telegram.messenger.ff;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.tr;
import org.telegram.messenger.ue;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
public final class nb implements fs {
    public static nb G2;
    public c0 A0;
    public View A1;
    public boolean A2;
    public final ab B0;
    public View B1;
    public boolean B2;
    public qa C0;
    public de0 C1;
    public boolean C2;
    public j6 D0;
    public final ce0 D1;
    public va D2;
    public final bg.v0 E;
    public final x6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final yb F0;
    public ud0 F1;
    public ValueAnimator F2;
    public ib G;
    public final zb G0;
    public wd0 G1;
    public float H;
    public final i0 H0;
    public File H1;
    public final RectF I;
    public final yb I0;
    public ArrayList I1;
    public float J;
    public final h0 J0;
    public ArrayList J1;
    public int K;
    public final cc K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public x7 L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public p3 N0;
    public long N1;
    public long O;
    public e1 O0;
    public boolean O1;
    public boolean P;
    public final n6 P0;
    public int P1;
    public final h2.f Q;
    public final e Q0;
    public boolean Q1;
    public Runnable R;
    public final ha R0;
    public boolean R1;
    public t10 S;
    public final u2 S0;
    public boolean S1;
    public int T;
    public final u2 T0;
    public boolean T1;
    public int U;
    public final r3 U0;
    public float U1;
    public int V;
    public final r3 V0;
    public int V1;
    public boolean W;
    public final g81 W0;
    public boolean W1;
    public boolean X;
    public final u3 X0;
    public boolean X1;
    public boolean Y;
    public final bb Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final fi.b f15054a;
    public int f15055a0;
    public final xb f15056a1;
    public AnimatorSet f15057a2;
    public final Activity f15058b;
    public int f15059b0;
    public final bc f15060b1;
    public boolean f15061b2;
    public final int f15062c;
    public int f15063c0;
    public final z5 f15064c1;
    public boolean f15065c2;
    public boolean d;
    public final RectF f15066d0;
    public final db f15067d1;
    public boolean d2;
    public boolean f15068e;
    public final RectF f15069e0;
    public final ga f15070e1;
    public boolean f15071e2;
    public final WindowManager f15072f;
    public final Path f15073f0;
    public final d1 f15074f1;
    public Runnable f15075f2;
    public int f15076g0;
    public nh0 f15077g1;
    public AnimatorSet f15078g2;
    public final WindowManager.LayoutParams h;
    public int f15079h0;
    public final qh0 f15080h1;
    public s9 f15081h2;
    public final za f15082i0;
    public nh0 f15083i1;
    public boolean f15084i2;
    public final FrameLayout f15085j0;
    public ImageView f15086j1;
    public AnimatorSet f15087j2;
    public final LinearLayout f15088k0;
    public final w5 f15089k1;
    public ValueAnimator f15090k2;
    public final FrameLayout f15091l0;
    public final u3 l1;
    public boolean f15092l2;
    public final bi.g3 m0;
    public final u3 f15093m1;
    public v4.b0 f15094m2;
    public final mb f15095n;
    public final FrameLayout f15096n0;
    public final u3 n1;
    public ue f15097n2;
    public final u2 f15098o0;
    public final u3 f15099o1;
    public ValueAnimator f15100o2;
    public final f7 f15101p0;
    public final a6 f15102p1;
    public r1.g f15103p2;
    public final org.telegram.ui.ActionBar.n5 f15104q0;
    public final ac f15105q1;
    public Boolean f15106q2;
    public final fb f15107r;
    public k9 f15108r0;
    public q f15109r1;
    public w9 f15110r2;
    public final w2 f15111s;
    public final org.telegram.ui.Components.ba f15112s0;
    public xa f15113s1;
    public AnimatorSet f15114s2;
    public final e6 f15115t0;
    public ya f15116t1;
    public boolean f15117t2;
    public final bi.o3 f15118u0;
    public final xb f15119u1;
    public int f15120u2;
    public boolean f15121v0;
    public final e f15122v1;
    public ArrayList f15123v2;
    public boolean f15124w;
    public long f15125w0;
    public pa f15126w1;
    public FrameLayout f15127w2;
    public long f15128x;
    public String f15129x0;
    public sg.t0 f15130x1;
    public boolean f15131x2;
    public eb f15132y;
    public TLRPC.InputPeer f15133y0;
    public View f15134y1;
    public m9 f15135y2;
    public i9 f15136z0;
    public View f15137z1;
    public ai.u0 f15138z2;

    public nb(Activity activity, int i7) {
        bg.v0 v0Var;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        boolean z10;
        float f11;
        fi.b bVar = new fi.b();
        this.f15054a = bVar;
        this.f15128x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new h2.f((int[]) null);
        this.f15066d0 = new RectF();
        this.f15069e0 = new RectF();
        this.f15073f0 = new Path();
        new Rect();
        this.f15076g0 = 0;
        this.f15079h0 = -1;
        this.f15136z0 = new i9();
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
        ka kaVar = new ka(this);
        this.f15071e2 = true;
        this.f15092l2 = true;
        this.f15120u2 = -1;
        this.f15058b = activity;
        this.f15062c = i7;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.E = v0Var;
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
        this.f15072f = windowManager;
        mb mbVar = new mb(this, activity);
        this.f15095n = mbVar;
        v9 v9Var = new v9(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(mbVar, v9Var);
        this.f15095n.setFocusable(true);
        this.f15095n.setImportantForAccessibility(2);
        w2 w2Var = new w2(activity, windowManager, this.f15095n, layoutParams);
        this.f15111s = w2Var;
        w2Var.a(new ta(this));
        this.f15095n.addView(this.f15111s.f15654b, new ViewGroup.LayoutParams(-1, -1));
        mb mbVar2 = this.f15095n;
        fb fbVar = new fb(this, activity);
        this.f15107r = fbVar;
        mbVar2.addView(fbVar);
        fb fbVar2 = this.f15107r;
        za zaVar = new za(this, activity);
        this.f15082i0 = zaVar;
        fbVar2.addView(zaVar);
        this.f15107r.addView(this.f15111s.f15655c, new ViewGroup.LayoutParams(-1, -1));
        this.f15112s0 = new org.telegram.ui.Components.ba(this.f15082i0);
        this.f15115t0 = new Object();
        fb fbVar3 = this.f15107r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f15085j0 = frameLayout;
        fbVar3.addView(frameLayout);
        fb fbVar4 = this.f15107r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f15091l0 = frameLayout2;
        fbVar4.addView(frameLayout2);
        fb fbVar5 = this.f15107r;
        bi.g3 g3Var = new bi.g3(5, activity, this);
        this.m0 = g3Var;
        fbVar5.addView(g3Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        fb fbVar6 = this.f15107r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f15096n0 = frameLayout3;
        fbVar6.addView(frameLayout3);
        org.telegram.ui.Components.fc.a(this.f15095n, new bi.t(3));
        ab abVar = new ab(this, activity, this.f15112s0, this.f15107r, bVar);
        this.B0 = abVar;
        mb mbVar3 = this.f15095n;
        Objects.requireNonNull(mbVar3);
        abVar.setCancelGestures(new w(mbVar3, 18));
        this.B0.setResetState(new m9(this, 13));
        this.f15082i0.addView(this.B0, c8.na.e(-1, -1, 119));
        this.B0.setOnClickListener(new o9(this, 12));
        za zaVar2 = this.f15082i0;
        int i14 = this.K;
        if (i14 != 1 && i14 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        zaVar2.setBackgroundColor(i10);
        za zaVar3 = this.f15082i0;
        bg.q0 q0Var = bg.u0.f3313a;
        zaVar3.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(12.0f)));
        this.f15082i0.setClipToOutline(true);
        m9 m9Var = new m9(this, 14);
        ?? view = new View(activity);
        view.f34032a = new TextPaint(1);
        view.f34033b = new TextPaint(1);
        kr krVar = kr.h;
        view.f34039s = new org.telegram.ui.Components.c6((View) view, 0L, 350L, krVar);
        view.J = new eb0(view, 6);
        view.f34042y = m9Var;
        this.D1 = view;
        bb bbVar = new bb(this, activity, this.f15112s0, this.f15115t0);
        this.Y0 = bbVar;
        bbVar.setCollageView(this.B0);
        bb bbVar2 = this.Y0;
        bbVar2.f14473w = new m9(this, 15);
        bbVar2.setOnTapListener(new m9(this, 16));
        this.Y0.setVisibility(8);
        bb bbVar3 = this.Y0;
        bbVar3.O = new m9(this, 17);
        this.f15082i0.addView(bbVar3, c8.na.e(-1, -1, 119));
        this.f15082i0.addView(this.D1, c8.na.e(-1, -1, 119));
        mb mbVar4 = this.f15095n;
        db dbVar = new db(this, activity, mbVar4, mbVar4, this.f15107r, bVar, this.f15112s0);
        this.f15067d1 = dbVar;
        dbVar.setAccount(i7);
        this.f15067d1.setUiBlurBitmap(new z9(0));
        org.telegram.ui.Components.fc.a(this.m0, new bi.i1(this, 5));
        this.f15067d1.setOnHeightUpdate(new n9(this, 13));
        this.f15067d1.setOnPeriodUpdate(new n9(this, 4));
        long j3 = this.O;
        if (j3 != 0) {
            this.f15067d1.setDialogId(j3);
        }
        this.f15067d1.setOnPremiumHint(new n9(this, 5));
        this.f15067d1.setOnKeyboardOpen(new n9(this, 6));
        bi.o3 o3Var = new bi.o3(3, activity, this);
        this.f15118u0 = o3Var;
        this.f15107r.addView(o3Var);
        xb xbVar = new xb(activity, this.f15107r, this.f15082i0, bVar, this.f15112s0);
        this.f15056a1 = xbVar;
        xbVar.setOnTimelineClick(new m9(this, 10));
        this.f15056a1.setOnHeightChange(new m9(this, 11));
        this.Y0.setVideoTimelineView(this.f15056a1);
        this.f15056a1.setVisibility(8);
        this.f15056a1.setAlpha(0.0f);
        this.f15056a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.f15056a1, c8.na.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        bc bcVar = new bc(activity);
        this.f15060b1 = bcVar;
        bcVar.setVisibility(8);
        this.f15060b1.a(false);
        this.Z0.addView(this.f15060b1, c8.na.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, c8.na.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.f15067d1, c8.na.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.f15056a1);
        this.B0.setPreviewView(this.Y0);
        xb xbVar2 = new xb(activity, this.f15107r, this.f15082i0, bVar, this.f15112s0);
        this.f15119u1 = xbVar2;
        xbVar2.Y0 = true;
        xbVar2.setVisibility(8);
        this.f15119u1.setAlpha(0.0f);
        this.m0.addView(this.f15119u1, c8.na.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ga gaVar = new ga(this, activity, bVar, this.f15112s0);
        this.f15070e1 = gaVar;
        gaVar.setVisibility(8);
        this.m0.addView(this.f15070e1, c8.na.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f15098o0 = imageView;
        imageView.setContentDescription(gd.N0(2131754878, null));
        u2 u2Var = this.f15098o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u2Var.setScaleType(scaleType);
        this.f15098o0.setImageResource(2131232282);
        u2 u2Var2 = this.f15098o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        u2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15098o0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.f15098o0.setOnClickListener(new o9(this, 1));
        this.f15085j0.addView(this.f15098o0, c8.na.e(56, 56, 51));
        this.f15111s.a(this.f15098o0);
        f7 f7Var = new f7(activity, i7);
        this.f15101p0 = f7Var;
        f7Var.a(false, false);
        this.f15101p0.setOnClickListener(new ai.p2(23, this, activity));
        this.f15085j0.addView(this.f15101p0, c8.na.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.f15104q0 = n5Var;
        n5Var.setTextSize(20);
        this.f15104q0.setGravity(19);
        this.f15104q0.setTextColor(-1);
        this.f15104q0.setTypeface(org.telegram.messenger.g0.o());
        this.f15104q0.l(gd.N0(2131746157, null), false);
        this.f15104q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.f15104q0.setAlpha(0.0f);
        this.f15104q0.setVisibility(8);
        this.f15104q0.setEllipsizeByGradient(true);
        this.f15104q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.f15085j0.addView(this.f15104q0, c8.na.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f15088k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f15088k0.setGravity(5);
        this.f15085j0.addView(this.f15088k0, c8.na.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        n9 n9Var = new n9(this, 7);
        mb mbVar5 = this.f15095n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f14305x = true;
        imageView2.f14306y = true;
        imageView2.h = n9Var;
        imageView2.f14296a = i7;
        imageView2.f14297b = mbVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.d(imageView2, 29));
        imageView2.f14300f = new rp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        imageView2.d();
        this.f15074f1 = imageView2;
        u3 u3Var = new u3(activity, 1);
        u3Var.o(1.0f, -71.0f);
        u3Var.d = 2000L;
        u3Var.V = false;
        u3Var.I.r(true, false);
        this.l1 = u3Var;
        u3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15085j0.addView(this.l1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f15080h1 = imageView3;
        imageView3.setScaleType(scaleType);
        qh0 qh0Var = this.f15080h1;
        x7 x7Var = this.L1;
        if (x7Var != null && x7Var.Y) {
            i11 = 2131231763;
        } else {
            i11 = 2131231754;
        }
        qh0Var.setImageResource(i11);
        this.f15080h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15080h1.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.f15080h1.setOnClickListener(new o9(this, 2));
        this.f15080h1.setVisibility(8);
        this.f15080h1.setAlpha(0.0f);
        w5 w5Var = new w5(activity);
        this.f15089k1 = w5Var;
        w5Var.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.f15089k1.setVisibility(8);
        this.f15089k1.setAlpha(0.0f);
        this.f15089k1.setOnClickListener(new o9(this, 3));
        this.f15088k0.addView(this.f15089k1, c8.na.r(46, 56, 53));
        this.f15088k0.addView(this.f15080h1, c8.na.r(46, 56, 53));
        this.f15088k0.addView(this.f15074f1, c8.na.e(46, 56, 53));
        yb ybVar = new yb(activity);
        this.F0 = ybVar;
        ybVar.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new o9(this, 4));
        this.F0.setOnLongClickListener(new y4(this, 1));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.f15111s.a(this.F0);
        this.f15085j0.addView(this.F0, c8.na.e(56, 56, 53));
        zb zbVar = new zb(activity);
        this.G0 = zbVar;
        zbVar.setContentDescription(gd.N0(2131754886, null));
        this.G0.setOnClickListener(new o9(this, 5));
        boolean q10 = l1.q(activity);
        zb zbVar2 = this.G0;
        if (q10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        zbVar2.setVisibility(i12);
        zb zbVar3 = this.G0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        zbVar3.setAlpha(f10);
        this.f15111s.a(this.G0);
        this.f15085j0.addView(this.G0, c8.na.e(56, 56, 53));
        ?? ybVar2 = new yb(activity);
        this.H0 = ybVar2;
        ybVar2.setContentDescription(gd.N0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        if (this.A0 == null) {
            i13 = 6;
            this.A0 = (c0) c0.a().get(6);
        } else {
            i13 = 6;
        }
        this.H0.setOnClickListener(new o9(this, i13));
        this.H0.a(new d0(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.f15111s.a(this.H0);
        this.f15085j0.addView(this.H0, c8.na.e(56, 56, 53));
        yb ybVar3 = new yb(activity);
        this.I0 = ybVar3;
        ybVar3.setContentDescription(gd.N0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.I0.a(new d0(new c0("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new o9(this, 7));
        this.f15111s.a(this.I0);
        this.f15085j0.addView(this.I0, c8.na.e(56, 56, 53));
        h0 h0Var = new h0(activity, this.f15111s);
        this.J0 = h0Var;
        h0Var.f14567a.v0(6);
        this.J0.setSelected((c0) null);
        this.J0.setOnLayoutClick(new n9(this, 8));
        this.f15085j0.addView(this.J0, c8.na.e(-1, 56, 53));
        u3 u3Var2 = new u3(activity, 1);
        u3Var2.o(1.0f, -20.0f);
        u3Var2.d = 5000L;
        u3Var2.k(true);
        u3Var2.v(gd.N0(2131744472, null));
        u3Var2.f15506r0 = new ai.k(19);
        this.f15093m1 = u3Var2;
        u3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15085j0.addView(this.f15093m1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        u3 u3Var3 = new u3(activity, 2);
        u3Var3.o(0.0f, 28.0f);
        u3Var3.d = 5000L;
        u3Var3.r(true);
        this.n1 = u3Var3;
        this.f15085j0.addView(u3Var3, c8.na.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        u3 u3Var4 = new u3(activity, 1);
        u3Var4.o(1.0f, -20.0f);
        u3Var4.d = 5000L;
        u3Var4.v(gd.N0(2131744460, null));
        this.f15099o1 = u3Var4;
        u3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15085j0.addView(this.f15099o1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f14284a = paint;
        Paint paint2 = new Paint(1);
        view2.f14285b = paint2;
        view2.f14287e = new org.telegram.ui.Components.c6((View) view2, 0L, 250L, krVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        view2.f14286c = m6Var;
        m6Var.n(0.3f, 250L, krVar);
        m6Var.w(org.telegram.messenger.g0.L(13.0f));
        m6Var.u(-1);
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.setCallback(view2);
        m6Var.f37394b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.f15085j0.addView(this.K0, c8.na.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f15111s.a(this.K0);
        MediaController.O(0);
        n6 n6Var = new n6(activity);
        this.P0 = n6Var;
        n6Var.setDelegate(kaVar);
        n6 n6Var2 = this.P0;
        if (this.P1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6Var2.f15032o0 = -1.0f;
        n6Var2.f15033p0 = z10;
        n6Var2.invalidate();
        this.f15091l0.addView(this.P0, c8.na.e(-1, 100, 87));
        this.f15111s.a(this.P0);
        n6 n6Var3 = this.P0;
        if (this.B0.j()) {
            f11 = this.B0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        n6Var3.e(true, f11);
        e eVar = new e(activity, bVar, true);
        this.Q0 = eVar;
        eVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(gd.N0(2131748595, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.f15091l0.addView(this.Q0, c8.na.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new o9(this, 8));
        u3 u3Var5 = new u3(activity, 3);
        u3Var5.r(true);
        u3Var5.v(gd.N0(2131744470, null));
        u3Var5.h = org.telegram.messenger.g0.L(320.0f);
        u3Var5.d = 5000L;
        u3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = u3Var5;
        this.f15091l0.addView(u3Var5, c8.na.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        g81 g81Var = new g81(activity);
        this.W0 = g81Var;
        g81Var.N = false;
        g81Var.setAlpha(0.0f);
        this.f15091l0.addView(this.W0, c8.na.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new v9(this, 4));
        g81 g81Var2 = this.W0;
        this.U1 = 0.0f;
        g81Var2.b(false, 0.0f);
        x6 x6Var = new x6(activity, i7, new m9(this, 12));
        this.E0 = x6Var;
        x6Var.f15724c = new n9(this, 9);
        this.f15091l0.addView(x6Var, c8.na.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        ha haVar = new ha(this, activity);
        this.R0 = haVar;
        haVar.setOnSwitchModeListener(new n9(this, 10));
        this.R0.setOnSwitchingModeListener(new n9(this, 11));
        this.f15096n0.addView(this.R0, c8.na.e(-1, 48, 55));
        this.f15111s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(gd.N0(2131754751, null));
        this.S0.setImageResource(2131232772);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.f15096n0.addView(this.S0, c8.na.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f15111s.a(this.S0);
        this.S0.setOnClickListener(new o9(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(gd.N0(2131748597, null));
        this.T0.setImageResource(2131232773);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.f15096n0.addView(this.T0, c8.na.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f15111s.a(this.T0);
        this.T0.setOnClickListener(new o9(this, 10));
        r3 r3Var = new r3(activity);
        this.U0 = r3Var;
        this.f15096n0.addView(r3Var, c8.na.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f15111s.a(this.U0);
        r3 r3Var2 = new r3(activity);
        this.V0 = r3Var2;
        r3Var2.f15289a.t(gd.N0(2131744459, null), false, true);
        r3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.f15096n0.addView(this.V0, c8.na.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f15111s.a(this.V0);
        e eVar2 = new e(activity, bVar, true);
        eVar2.setRoundRadius(24);
        this.f15122v1 = eVar2;
        eVar2.setVisibility(8);
        this.f15122v1.setAlpha(0.0f);
        this.f15122v1.i(gd.N0(2131744445, null), false, true);
        this.f15122v1.setOnClickListener(new o9(this, 11));
        this.f15096n0.addView(this.f15122v1, c8.na.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f15911b = new ArrayList();
        frameLayout5.f15913e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f15910a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, c8.na.e(-1, -1, 119));
        frameLayout5.a(0, 2131231743, gd.N0(2131754813, null));
        frameLayout5.a(2, 2131232289, gd.N0(2131754755, null));
        frameLayout5.a(1, 2131232291, gd.N0(2131754806, null));
        frameLayout5.a(3, 2131231733, gd.N0(2131751687, null));
        frameLayout5.a(4, 2131232288, gd.N0(2131754810, null));
        String N0 = gd.N0(2131745444, null);
        frameLayout5.d = N0;
        frameLayout5.f15913e = true;
        y5 y5Var = new y5(frameLayout5, activity, N0, true);
        frameLayout5.f15912c = y5Var;
        y5Var.setContentDescription(gd.N0(2131745444, null));
        frameLayout5.addView(frameLayout5.f15912c, c8.na.c(-2.0f, -2));
        frameLayout5.e();
        this.f15064c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f15064c1.setOnClickListener(new n9(this, 12));
        this.f15096n0.addView(this.f15064c1, c8.na.e(-1, 52, 23));
        ac acVar = new ac(activity);
        this.f15105q1 = acVar;
        acVar.setAlpha(0.0f);
        this.f15105q1.setVisibility(8);
        this.f15082i0.addView(this.f15105q1, c8.na.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        a6 a6Var = new a6(activity, i7, bVar);
        this.f15102p1 = a6Var;
        this.f15082i0.addView(a6Var, c8.na.e(-1, -1, 119));
        l0(false);
    }

    public static nb D(Activity activity, int i7) {
        nb nbVar = G2;
        if (nbVar != null && (nbVar.f15058b != activity || nbVar.f15062c != i7)) {
            nbVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new nb(activity, i7);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        mp.g1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(nb nbVar) {
        qa qaVar = nbVar.C0;
        boolean z10 = false;
        if (qaVar != null && qaVar.getTextureView() != null) {
            Bitmap bitmap = nbVar.C0.getTextureView().getBitmap();
            if (bitmap == null) {
                nbVar.d2 = false;
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
            nbVar.d2 = z10;
            return;
        }
        nbVar.d2 = false;
    }

    public static void b(nb nbVar) {
        ValueAnimator valueAnimator = nbVar.f15090k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            nbVar.f15090k2 = null;
        }
        nbVar.f15092l2 = false;
        fb fbVar = nbVar.f15107r;
        float f10 = fbVar.f14508a;
        float f11 = fbVar.f14509b;
        fbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        nbVar.f15090k2 = ofFloat;
        ofFloat.addUpdateListener(new da(nbVar, f10, f11, 0));
        nbVar.f15090k2.setDuration(340L);
        nbVar.f15090k2.setInterpolator(kr.h);
        nbVar.f15090k2.addListener(new na(nbVar, 0));
        nbVar.f15090k2.start();
    }

    public static boolean c(nb nbVar) {
        Activity activity = nbVar.f15058b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g10 = i5.c.g(context, 2131232770);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        g10.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new ua(g10, g10), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        nb nbVar = G2;
        if (nbVar != null) {
            nbVar.p(false);
        }
        G2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        x7 x7Var = this.L1;
        if (x7Var != null) {
            return x7Var.r();
        }
        return 1;
    }

    public final String B() {
        qa qaVar = this.C0;
        if (qaVar != null && qaVar.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f15123v2.get(this.f15120u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final e1 C() {
        if (this.O0 == null) {
            e1 e1Var = new e1(this.f15058b);
            this.O0 = e1Var;
            this.f15091l0.addView(e1Var, c8.na.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        int i7;
        qa qaVar = this.C0;
        if (qaVar != null && qaVar.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f15123v2;
                if (this.f15120u2 + 1 >= arrayList.size()) {
                    i7 = 0;
                } else {
                    i7 = this.f15120u2 + 1;
                }
                return (String) arrayList.get(i7);
            }
            return this.C0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f15086j1 == null) {
            nh0 nh0Var = new nh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f15083i1 = nh0Var;
            nh0Var.h = true;
            x7 x7Var = this.L1;
            if (x7Var != null && x7Var.f15783y0) {
                nh0Var.M(35);
                this.f15083i1.P(36);
            } else {
                nh0Var.P(0);
                this.f15083i1.M(0);
            }
            this.f15083i1.f37799a0 = true;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J9, this.f15054a);
            this.f15083i1.Q(w02, "Sunny");
            this.f15083i1.Q(w02, "Path 6");
            this.f15083i1.Q(w02, "Path");
            this.f15083i1.Q(w02, "Path 5");
            this.f15083i1.o();
            ImageView imageView = new ImageView(this.f15058b);
            this.f15086j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f15086j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f15086j1.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
            this.f15086j1.setOnClickListener(new o9(this, 0));
            this.f15086j1.setVisibility(8);
            this.f15086j1.setImageDrawable(this.f15083i1);
            this.f15086j1.setAlpha(0.0f);
            this.f15088k0.addView(this.f15086j1, 0, c8.na.r(46, 56, 53));
        }
        return this.f15086j1;
    }

    public final void G() {
        pa paVar = this.f15126w1;
        if (paVar == null) {
            return;
        }
        this.f15127w2 = null;
        paVar.getTopLayout().setAlpha(0.0f);
        this.f15126w1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.f15126w1.getBottomLayout().setAlpha(0.0f);
        this.f15126w1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.f15126w1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.f15126w1.setVisibility(8);
    }

    public final boolean H() {
        float f10;
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.f15061b2 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        p3 p3Var;
        if (!this.X && (p3Var = this.N0) != null) {
            if (p3Var.getTranslationY() < (this.f15095n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.f24226q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: hi.nb.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j3) {
        if (!this.T1 && this.L1 != null) {
            s9 s9Var = this.f15081h2;
            if (s9Var != null) {
                org.telegram.messenger.g0.r(s9Var);
            }
            this.f15084i2 = true;
            this.T1 = true;
            this.f15081h2 = new s9(this, runnable, 1);
            this.Y0.setAlpha(0.0f);
            this.Y0.setVisibility(0);
            this.Y0.n(this.L1, this.f15081h2, j3);
            this.Y0.p(this.L1, false);
            org.telegram.messenger.g0.h3(this.f15081h2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: hi.nb.L():boolean");
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
            this.f15119u1.setVisibility(8);
            if (i10 == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.m0.setVisibility(i16);
            this.f15067d1.setVisibility(8);
            this.f15122v1.setVisibility(8);
        }
        if (i7 == 1) {
            this.f15064c1.setVisibility(8);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.m0.setVisibility(i13);
            this.f15080h1.setVisibility(8);
            this.f15089k1.setVisibility(8);
            this.f15074f1.setVisibility(8);
            ImageView imageView = this.f15086j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.Y0.setVisibility(i14);
            this.f15056a1.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            if (i10 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.f15104q0.setVisibility(i15);
            v();
            this.f15105q1.setAlpha(0.0f);
            this.f15105q1.setVisibility(8);
            this.f15060b1.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        if (i10 == 1) {
            x7 x7Var = this.L1;
            if (x7Var == null || !x7Var.f15761n) {
                t();
                G();
            }
            ce0 ce0Var = this.D1;
            if (ce0Var != null) {
                ce0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            x7 x7Var2 = this.L1;
            if (x7Var2 != null && x7Var2.f15751h0 >= 30000) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f15060b1.setVisibility(i12);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            x7 x7Var3 = this.L1;
            if (x7Var3 == null || x7Var3.J0 == 0) {
                i17 = 0;
            }
            this.f15067d1.setVisibility(i17);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            e1 C = C();
            C.f14364r.e(true, 0.0f);
            C.a(true);
            w wVar = C.h;
            if (wVar != null) {
                org.telegram.messenger.g0.r(wVar);
            }
            w wVar2 = new w(C, 4);
            C.h = wVar2;
            org.telegram.messenger.g0.h3(wVar2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        ce0 ce0Var2 = this.D1;
        if (ce0Var2 != null) {
            if (i10 == 1 && ((i11 = this.f15079h0) == -1 || i11 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ce0Var2.setAllowTouch(z11);
        }
        db dbVar = this.f15067d1;
        if (dbVar != null) {
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            dbVar.f14935e0 = z10;
        }
        if (i10 == 1) {
            int i18 = this.f15062c;
            ri.d0(i18).D(0);
            ri.d0(i18).Y0(0, false, true, false);
            ri.d0(i18).Y0(2, false, true, false);
            fi.p6 R1 = mp.u1(i18).R1();
            if (R1.Q == 0) {
                R1.S();
            }
            mp.u1(i18).R1().U();
        }
    }

    public final void N(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.nb.N(int, int):void");
    }

    public final void O() {
        sg.r0 r0Var;
        int i7;
        if (this.f15076g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f15135y2 = new m9(this, 3);
            } else {
                Y(false);
            }
        }
        db dbVar = this.f15067d1;
        if (dbVar != null) {
            dbVar.f14936f.s();
        }
        n6 n6Var = this.P0;
        if (n6Var != null) {
            n6Var.h();
        }
        a6 a6Var = this.f15102p1;
        if (a6Var != null) {
            fi.p6 R1 = mp.u1(a6Var.f14189a).R1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) R1.f12393i.f(i10.i(R1.f12387a).f24656n);
            if (peerStories != null) {
                i7 = peerStories.stories.size();
            } else {
                i7 = 0;
            }
            a6Var.f14190b = R1.f12388b.m() + i7 + 1;
            a6Var.f14191c.invalidate();
        }
        pa paVar = this.f15126w1;
        if (paVar != null && (r0Var = paVar.f15600y0.d) != null) {
            r0Var.postRunnable(r0Var.f57462x);
        }
        bb bbVar = this.Y0;
        if (bbVar != null) {
            bbVar.x(0, false);
        }
        j1 j1Var = mp.u1(this.f15062c).R1().f12406w;
        if (!j1Var.f14720c && !j1Var.d) {
            j1Var.d = true;
            f1 f1Var = new f1(j1Var, 1);
            tr a02 = tr.a0(j1Var.f14718a);
            a02.f27149a.c(new di.p6((Object) a02, false, (Object) f1Var, 3));
        }
    }

    public final void P(int i7, int i10) {
        boolean z10;
        pa paVar;
        xa xaVar;
        ya yaVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        pa paVar2;
        if (i10 == 0) {
            this.f15098o0.setVisibility(8);
        }
        if (i7 == 0 && (paVar2 = this.f15126w1) != null) {
            paVar2.setVisibility(8);
        }
        if (i7 == -1) {
            this.f15067d1.setVisibility(8);
            if (i10 == 2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f15080h1.setVisibility(i11);
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f15089k1.setVisibility(i12);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f15074f1.setVisibility(i13);
            ImageView imageView = this.f15086j1;
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
            this.f15056a1.setVisibility(i14);
            this.f15104q0.setVisibility(8);
        }
        boolean z11 = true;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y0.setAllowCropping(z10);
        if ((i10 == 0 || i7 == 0) && (paVar = this.f15126w1) != null) {
            paVar.N0.setLayerType(0, null);
        }
        ce0 ce0Var = this.D1;
        if (ce0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z11 = false;
            }
            ce0Var.setAllowTouch(z11);
        }
        if (i10 == 3) {
            xa xaVar2 = this.f15113s1;
            if (xaVar2 != null) {
                xaVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (xaVar = this.f15113s1) != null) {
            xaVar.setVisibility(8);
            this.f15113s1.setAppearProgress(0.0f);
            xa xaVar3 = this.f15113s1;
            xaVar3.f15362y = null;
            p0 p0Var = xaVar3.f15356f;
            p0Var.M = null;
            p0Var.d = null;
            p0Var.K = false;
            xaVar3.d.setVisibility(8);
            xaVar3.f15352a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ya yaVar2 = this.f15116t1;
            if (yaVar2 != null) {
                yaVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 4 && (yaVar = this.f15116t1) != null) {
            yaVar.setVisibility(8);
            this.f15116t1.setAppearProgress(0.0f);
            ya yaVar3 = this.f15116t1;
            yaVar3.f15633b = null;
            p0 p0Var2 = yaVar3.h;
            p0Var2.M = null;
            p0Var2.d = null;
            p0Var2.K = false;
            yaVar3.f15635e.setVisibility(8);
            yaVar3.setVisibility(8);
        }
    }

    public final void Q(hb hbVar) {
        fi.j6 o4;
        mb mbVar;
        if (this.d) {
            return;
        }
        int i7 = this.f15062c;
        if (mp.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.f15121v0 = false;
        this.f15068e = false;
        this.C2 = false;
        this.f15115t0.f14374g = false;
        WindowManager windowManager = this.f15072f;
        if (windowManager != null && (mbVar = this.f15095n) != null && mbVar.getParent() == null) {
            mb mbVar2 = this.f15095n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, mbVar2, layoutParams);
            windowManager.addView(this.f15095n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.f15125w0 == 0 && (o4 = mp.u1(i7).R1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (hbVar != null) {
            this.G = hbVar;
            this.K = hbVar.f14708a;
            rectF.set(hbVar.f14710c);
            this.H = hbVar.f14709b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24226q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15107r.c();
        int i11 = this.K;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f15082i0.setBackgroundColor(i10);
        this.f15107r.setTranslationX(0.0f);
        this.f15107r.setTranslationY(0.0f);
        this.f15107r.b(0.0f);
        this.f15107r.setScaleX(1.0f);
        this.f15107r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15058b);
        f(1.0f, true, new m9(this, 6));
        d();
        this.f15125w0 = 0L;
        this.f15129x0 = "";
    }

    public final void R(gb gbVar, x7 x7Var, long j3) {
        int i7;
        mb mbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f15062c;
        if (mp.u1(i10).A2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f15121v0 = false;
        this.f15068e = false;
        this.C2 = false;
        WindowManager windowManager = this.f15072f;
        if (windowManager != null && (mbVar = this.f15095n) != null && mbVar.getParent() == null) {
            mb mbVar2 = this.f15095n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, mbVar2, layoutParams);
            windowManager.addView(this.f15095n, layoutParams);
            f0();
        }
        this.L1 = x7Var;
        this.P1 = x7Var.K ? 1 : 0;
        this.f15115t0.f14374g = false;
        RectF rectF = this.I;
        if (gbVar != null) {
            this.G = gbVar;
            this.K = gbVar.f14708a;
            rectF.set(gbVar.f14710c);
            this.H = gbVar.f14709b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24226q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15107r.c();
        int i11 = this.K;
        int i12 = 1;
        if (i11 != 1 && i11 != 0) {
            i7 = -14737633;
        } else {
            i7 = 0;
        }
        this.f15082i0.setBackgroundColor(i7);
        this.f15107r.setTranslationX(0.0f);
        this.f15107r.setTranslationY(0.0f);
        this.f15107r.b(0.0f);
        this.f15107r.setScaleX(1.0f);
        this.f15107r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15058b);
        x7 x7Var2 = this.L1;
        if (x7Var2 != null) {
            this.f15067d1.setText(x7Var2.C0);
        }
        K(new fa(this, 0), j3);
        if (this.L1.f15737b0) {
            i12 = 2;
        }
        J(i12, false);
        k0(-1, false, false);
        this.f15064c1.b(false, false);
        d();
        this.f15125w0 = 0L;
        this.f15129x0 = "";
    }

    public final void S() {
        x60 x60Var;
        bb bbVar = this.Y0;
        if (bbVar != null) {
            bbVar.x(4, true);
        }
        db dbVar = this.f15067d1;
        if (dbVar != null && (x60Var = dbVar.V0) != null) {
            x60Var.v();
            dbVar.V0 = null;
        }
        ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) new ra(this, 1), 14, false);
        y0Var.setOnDismissListener(new ba(this, 1));
        y0Var.show();
    }

    public final void T(gb gbVar, x7 x7Var) {
        int i7;
        boolean z10;
        int i10;
        fi.j6 o4;
        mb mbVar;
        if (this.d) {
            return;
        }
        int i11 = this.f15062c;
        if (mp.u1(i11).A2()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f15121v0 = true;
        this.f15068e = false;
        this.C2 = false;
        WindowManager windowManager = this.f15072f;
        if (windowManager != null && (mbVar = this.f15095n) != null && mbVar.getParent() == null) {
            mb mbVar2 = this.f15095n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, mbVar2, layoutParams);
            windowManager.addView(this.f15095n, layoutParams);
            f0();
        }
        this.L1 = x7Var;
        l9.a(i11, x7Var);
        x7 x7Var2 = this.L1;
        if (x7Var2 != null && x7Var2.K) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.P1 = i7;
        if (x7Var2 != null && x7Var2.f15775u && i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15115t0.f14374g = z10;
        if (this.f15125w0 == 0 && (o4 = mp.u1(i11).R1().o()) != null && o4.a(i11, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.I;
        if (gbVar != null) {
            this.G = gbVar;
            this.K = gbVar.f14708a;
            rectF.set(gbVar.f14710c);
            this.H = gbVar.f14709b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24226q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15107r.c();
        int i12 = this.K;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f15082i0.setBackgroundColor(i10);
        this.f15107r.setTranslationX(0.0f);
        this.f15107r.setTranslationY(0.0f);
        this.f15107r.b(0.0f);
        this.f15107r.setScaleX(1.0f);
        this.f15107r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15058b);
        x7 x7Var3 = this.L1;
        if (x7Var3 != null) {
            this.f15067d1.setText(x7Var3.C0);
        }
        this.f15064c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new m9(this, 6));
        d();
        this.f15125w0 = 0L;
        this.f15129x0 = "";
    }

    public final void U() {
        sg.t0 t0Var = this.f15130x1;
        if (t0Var != null) {
            t0Var.bringToFront();
        }
        View view = this.f15134y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f15137z1;
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
        ac acVar = this.f15105q1;
        if (acVar != null) {
            acVar.bringToFront();
        }
        ce0 ce0Var = this.D1;
        if (ce0Var != null) {
            ce0Var.bringToFront();
        }
        ud0 ud0Var = this.F1;
        if (ud0Var != null) {
            ud0Var.bringToFront();
        }
        wd0 wd0Var = this.G1;
        if (wd0Var != null) {
            wd0Var.bringToFront();
        }
        a6 a6Var = this.f15102p1;
        if (a6Var != null) {
            a6Var.bringToFront();
        }
        q qVar = this.f15109r1;
        if (qVar != null) {
            qVar.bringToFront();
        }
    }

    public final void V(x7 x7Var, boolean z10) {
        File file;
        View view;
        float f10;
        x7 x7Var2;
        boolean z11;
        int i7;
        if (x7Var != null && this.Y0.getWidth() > 0 && this.Y0.getHeight() > 0) {
            if (z10) {
                file = x7Var.O0;
            } else {
                file = x7Var.N0;
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
            x51 textureView = this.Y0.getTextureView();
            if (x7Var.K && !x7Var.f15775u && textureView != null) {
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
            File file2 = x7Var.Q0;
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
            File file3 = x7Var.P0;
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
            pa paVar = this.f15126w1;
            if (paVar != null && paVar.B0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                pa paVar2 = this.f15126w1;
                paVar2.f15588s0 = true;
                q5 q5Var = paVar2.B0;
                q5Var.f57938a = true;
                q5Var.draw(canvas);
                pa paVar3 = this.f15126w1;
                paVar3.B0.f57938a = false;
                paVar3.f15588s0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = x7.w(this.f15062c, "jpg");
            if (z10) {
                x7Var2 = x7Var;
                z11 = z10;
                Utilities.f22879g.c(new ai.e(this, createBitmap, z11, w10, x7Var2, 2));
            } else {
                x7Var2 = x7Var;
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
                x7Var2.N0 = w10;
            }
            x7Var2.f15738b1 = createScaledBitmap;
        }
    }

    public final void W() {
        fi.j6 o4;
        int size;
        char c10;
        View[] viewPages;
        u41[] u41VarArr;
        k9 k9Var = this.f15108r0;
        BitmapDrawable bitmapDrawable = null;
        if (k9Var != null) {
            k9Var.dismiss();
            this.f15108r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
        if (z10) {
            d1 d1Var = this.f15074f1;
            d1Var.getClass();
            d1Var.c(gd.O0("VideoConvertFail"));
            q2Var.a();
            y5 y5Var = this.f15064c1.f15912c;
            int i7 = -this.V1;
            this.V1 = i7;
            org.telegram.messenger.g0.E3(i7, y5Var, null);
            return;
        }
        db dbVar = this.f15067d1;
        if (dbVar != null && dbVar.o()) {
            q2Var.a();
            org.telegram.ui.Components.n6 n6Var = dbVar.f14956w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.E3(i10, n6Var, null);
            dbVar.e();
            return;
        }
        x7 x7Var = this.L1;
        int i11 = this.f15062c;
        if ((x7Var == null || (!x7Var.f15749g && x7Var.J0 == 0)) && (o4 = mp.u1(i11).f25763i0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.L1.D0 = mp.u1(i11).j5();
        fi.b bVar = this.f15054a;
        char c11 = 1;
        if (dbVar != null && !this.L1.D0) {
            CharSequence text = dbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((fz0[]) spannable.getSpans(0, text.length(), fz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.kc(this.f15095n, bVar).Q(2131624346, 36, org.telegram.messenger.g0.R2(gd.N0(2131744337, null), org.telegram.ui.ActionBar.n6.Xc, 0, new m9(this, 27), bVar)).k(true);
                    int i12 = -this.V1;
                    this.V1 = i12;
                    org.telegram.messenger.g0.E3(i12, dbVar, null);
                    return;
                }
            }
        }
        x7 x7Var2 = this.L1;
        if (!x7Var2.f15749g && x7Var2.J0 == 0) {
            if (this.O != 0) {
                x7Var2.f15777v0 = mp.u1(i11).l1(this.O);
            }
            bb bbVar = this.Y0;
            bbVar.x(3, true);
            k9 k9Var2 = new k9(this.L1.I0, this.f15058b, bVar);
            k9Var2.X0(this.L1.E0);
            k9Var2.W0(this.L1.f15777v0);
            k9Var2.A1 = this.N;
            k9Var2.P1 = new n9(this, 14);
            k9Var2.M0(!this.B0.j());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            k9Var2.T0(size);
            k9Var2.R0(false);
            CharSequence text2 = dbVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (u41 u41Var : (u41[]) ((Spanned) text2).getSpans(0, text2.length(), u41.class)) {
                    if (u41Var != null) {
                        try {
                            TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(Long.parseLong(u41Var.getURL())));
                            if (c22 != null && !n10.C(c22) && n10.o(c22) != null && !arrayList2.contains(c22)) {
                                arrayList2.add(n10.o(c22));
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
                            TLObject h22 = mp.u1(i11).h2(charSequence);
                            if (h22 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) h22;
                                if (!user.bot && !n10.C(user) && user.f28641id != 777000 && !n10.A(user) && !arrayList2.contains(charSequence)) {
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
                    TLObject h23 = mp.u1(i11).h2(charSequence2);
                    if (h23 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) h23;
                        if (!user2.bot && !n10.C(user2) && user2.f28641id != 777000 && !n10.A(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            k9Var2.N1 = arrayList2;
            k9Var2.R1 = new n9(this, 15);
            k9Var2.S1 = new n9(this, 16);
            k9Var2.O1 = new v9(this, 9);
            this.f15108r0 = k9Var2;
            x7 x7Var3 = this.L1;
            if (x7Var3.K) {
                if (bbVar != null && !x7Var3.f15748f0 && this.f15076g0 != 2) {
                    x7Var3.f15745e0 = bbVar.getCurrentPosition();
                    w10 n9Var = new n9(this, 17);
                    View view = this.f15130x1;
                    View view2 = this.A1;
                    View[] viewArr = new View[3];
                    viewArr[0] = bbVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    bbVar.h(n9Var, viewArr);
                }
                k9 k9Var3 = this.f15108r0;
                Bitmap bitmap = this.L1.f15750g0;
                m9 m9Var = new m9(this, 20);
                if (bitmap != null) {
                    k9Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                k9Var3.W1 = bitmapDrawable;
                k9Var3.X1 = m9Var;
                q1 q1Var = k9Var3.f14787m1;
                if (q1Var != null) {
                    for (View view3 : q1Var.getViewPages()) {
                        if (view3 instanceof f9) {
                            f9 f9Var = (f9) view3;
                            f9Var.h(false);
                            f9Var.f(false);
                        }
                    }
                }
            }
            this.f15108r0.setOnDismissListener(new ba(this, 0));
            this.f15108r0.show();
            return;
        }
        x7Var2.f15758l = false;
        h(null);
        o0();
    }

    public final void X(ib ibVar) {
        int i7 = 0;
        RectF rectF = this.I;
        if (ibVar != null) {
            this.G = ibVar;
            this.K = ibVar.f14708a;
            rectF.set(ibVar.f14710c);
            this.H = ibVar.f14709b;
        } else {
            this.G = null;
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24226q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.K;
        if (i10 != 1 && i10 != 0) {
            i7 = -14737633;
        }
        this.f15082i0.setBackgroundColor(i7);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f15131x2 || z10) {
            this.f15117t2 = false;
            Activity activity = this.f15058b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f15117t2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(2131232770).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    lq lqVar = new lq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    lqVar.f37198e = L;
                    lqVar.f37199f = L2;
                    this.B0.setCameraThumb(lqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.f15054a);
                        int i7 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.N0(2131747114, null));
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.U = W2;
                        alertDialog$Builder.k(gd.N0(2131747106, null), new v9(this, 12));
                        alertDialog$Builder.h(gd.N0(2131751760, null), null);
                        t1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f15131x2 = true;
                }
            }
            if (!this.f15117t2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new m9(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        qa qaVar = this.C0;
        if (qaVar != null && qaVar.getTextureView() != null) {
            try {
                Utilities.f22880i.c(new di.a8(this, this.C0.getTextureView().getBitmap(), runnable, 21));
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
            animate.alpha(f10).setUpdateListener(new oa(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(kr.h).start();
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
            this.f15072f.updateViewLayout(this.f15095n, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        ks.e().b(this, ks.f25279r2);
        int i7 = this.f15062c;
        ks.f(i7).b(this, ks.B5);
        ks.f(i7).b(this, ks.f25200d3);
    }

    public final void d0(String str) {
        int i7;
        yb ybVar = this.F0;
        ybVar.clearAnimation();
        qa qaVar = this.C0;
        if ((qaVar != null && qaVar.isDual()) || this.f15061b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(ybVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    ybVar.setContentDescription(gd.N0(2131754915, null));
                    i7 = 2131231755;
                }
            } else {
                str.equals("off");
            }
            ybVar.setContentDescription(gd.N0(2131754914, null));
            i7 = 2131231756;
        } else {
            if (str.equals("on")) {
                ybVar.setContentDescription(gd.N0(2131754913, null));
                i7 = 2131231757;
            }
            ybVar.setContentDescription(gd.N0(2131754914, null));
            i7 = 2131231756;
        }
        if (ybVar.f15887n != i7) {
            ybVar.f15887n = i7;
            ValueAnimator valueAnimator = ybVar.f15888r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ybVar.f15888r = null;
            }
            ybVar.setDrawable(i7);
        }
        if (this.f15076g0 == 0 && !this.J0.f14570e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(ybVar, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.j6 o4;
        x7 x7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i7 == ks.f25279r2) {
            n6 n6Var = this.P0;
            if (n6Var != null) {
                n6Var.h();
            }
            if (this.f15097n2 != null && MediaController.f22786c2 != null) {
                for (int i11 = 0; i11 < MediaController.f22786c2.size(); i11++) {
                    ue ueVar = (ue) MediaController.f22786c2.get(i11);
                    int i12 = ueVar.f27259a;
                    ue ueVar2 = this.f15097n2;
                    if (i12 == ueVar2.f27259a && ueVar.f27260b == ueVar2.f27260b) {
                        this.f15097n2 = ueVar;
                        return;
                    }
                }
            }
        } else if (i7 == ks.B5) {
            n6 n6Var2 = this.P0;
            if (n6Var2 != null && !this.W1) {
                n6Var2.h();
            }
        } else if (i7 == ks.f25200d3) {
            int i13 = this.f15076g0;
            int i14 = this.f15062c;
            if (i13 == 1) {
                if (!this.O1 && !this.f15067d1.o()) {
                    fi.p6 R1 = mp.u1(i14).R1();
                    int A = A();
                    fi.j6 o10 = R1.o();
                    if (o10 == null || !o10.a(R1.f12387a, A) || ((x7Var = this.L1) != null && (x7Var.f15749g || x7Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f15064c1.setShareEnabled(z10);
            } else if (i13 == 0 && (o4 = mp.u1(i14).R1().o()) != null && o4.a(i14, 1)) {
                x7 x7Var2 = this.L1;
                if (x7Var2 == null || x7Var2.J0 == 0) {
                    g0(o4, true);
                }
            }
        }
    }

    public final void e(boolean z10) {
        float height;
        boolean z11;
        int i7;
        e1 e1Var;
        this.L0 = z10;
        Boolean bool = this.f15106q2;
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
                this.f15110r2 = new w9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f15100o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f15100o2 = null;
            }
            r1.g gVar = this.f15103p2;
            if (gVar != null) {
                gVar.d();
                this.f15103p2 = null;
            }
            if (this.N0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.N0 == null) {
                    return;
                }
            }
            p3 p3Var = this.N0;
            if (p3Var != null) {
                p3Var.L = false;
            }
            if (z10 && (e1Var = this.O0) != null) {
                e1Var.a(false);
            }
            int i10 = 4;
            fb fbVar = this.f15107r;
            if (fbVar != null) {
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                fbVar.setImportantForAccessibility(i7);
            }
            p3 p3Var2 = this.N0;
            if (z10) {
                i10 = 0;
            }
            p3Var2.setImportantForAccessibility(i10);
            this.f15106q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            mb mbVar = this.f15095n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (mbVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.f24221n * 2.5f);
            }
            Math.max(1, mbVar.getHeight());
            p3 p3Var3 = this.N0;
            p3Var3.L = !z10;
            if (this.f15090k2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f15092l2 = z11;
            if (z10) {
                r1.g gVar2 = new r1.g(p3Var3, r1.g.f56430p, height);
                this.f15103p2 = gVar2;
                gVar2.f56446m.a(0.75f);
                this.f15103p2.f56446m.b(350.0f);
                this.f15103p2.a(new x9(this, height, 0));
                this.f15103p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f15100o2 = ofFloat;
                ofFloat.addUpdateListener(new y9(this, 0));
                this.f15100o2.addListener(new na(this, 1));
                this.f15100o2.setDuration(450L);
                this.f15100o2.setInterpolator(kr.h);
                this.f15100o2.start();
            }
            if (!z10 && !this.T1) {
                this.f15094m2 = null;
            }
            if (!z10 && this.f15076g0 == 0 && !this.f15117t2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f15077g1 == null) {
            nh0 nh0Var = new nh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f15077g1 = nh0Var;
            nh0Var.G *= 1.5f;
        }
        this.f15080h1.setAnimation(this.f15077g1);
        int i7 = 20;
        if (!z11) {
            nh0 nh0Var2 = this.f15077g1;
            if (!z10) {
                i7 = 0;
            }
            nh0Var2.N(i7, false, false);
        } else if (z10) {
            nh0 nh0Var3 = this.f15077g1;
            if (nh0Var3.f37801b0 > 20) {
                nh0Var3.N(0, false, false);
            }
            this.f15077g1.P(20);
            this.f15077g1.start();
        } else {
            nh0 nh0Var4 = this.f15077g1;
            int i10 = nh0Var4.f37801b0;
            if (i10 != 0 && i10 < 43) {
                nh0Var4.P(43);
                this.f15077g1.start();
            }
        }
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        fb fbVar = this.f15107r;
        if (z10) {
            this.Q.d();
            ks.e().k(ks.f25234j1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new y9(this, 5));
            this.F.addListener(new di.j6(this, f10, runnable, 3));
            if (f10 < 1.0f && this.f15124w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(kr.h);
            } else if (f10 <= 0.0f && fbVar.f14508a >= org.telegram.messenger.g0.L(20.0f)) {
                if (f10 < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(kr.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(kr.h);
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
        fbVar.invalidate();
        this.f15095n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f15095n.findOnBackInvokedDispatcher()) == null) {
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
        h0 h0Var;
        if (z10) {
            u3 u3Var = this.f15093m1;
            if (u3Var != null) {
                u3Var.f(true);
            }
            u3 u3Var2 = this.n1;
            if (u3Var2 != null) {
                u3Var2.f(true);
            }
            u3 u3Var3 = this.l1;
            if (u3Var3 != null) {
                u3Var3.f(true);
            }
            u3 u3Var4 = this.X0;
            if (u3Var4 != null) {
                u3Var4.f(true);
            }
        }
        if (this.f15061b2 == z10 && this.f15065c2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.f15057a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f15057a2 = null;
        }
        this.f15061b2 = z10;
        this.f15065c2 = H();
        if (z10 && (h0Var = this.J0) != null && h0Var.f14570e) {
            h0Var.a(false, z11);
        }
        l0(z11);
        ha haVar = this.R0;
        r3 r3Var = this.V0;
        r3 r3Var2 = this.U0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f15057a2 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f15076g0 == 0 && !H()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f15076g0 == 0 && !H()) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r3Var2, property2, L3);
            if (z10 || this.f15076g0 != 0 || !H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r3Var, property, f12);
            if (!z10 && this.f15076g0 == 0 && H()) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r3Var, property2, L4);
            if (z10 || this.f15076g0 != 0 || H()) {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(haVar, property, f13);
            if (z10 || this.f15076g0 != 0 || H()) {
                f14 = org.telegram.messenger.g0.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(haVar, property2, f14));
            this.f15057a2.setDuration(260L);
            this.f15057a2.setInterpolator(kr.h);
            this.f15057a2.start();
            return;
        }
        if (z10 && this.f15076g0 == 0 && !H()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        r3Var2.setAlpha(f10);
        if (z10 && this.f15076g0 == 0 && !H()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        r3Var2.setTranslationY(L);
        if (z10 || this.f15076g0 != 0 || !H()) {
            f12 = 0.0f;
        }
        r3Var.setAlpha(f12);
        if (!z10 && this.f15076g0 == 0 && H()) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(16.0f);
        }
        r3Var.setTranslationY(L2);
        if (z10 || this.f15076g0 != 0 || H()) {
            f13 = 0.0f;
        }
        haVar.setAlpha(f13);
        if (z10 || this.f15076g0 != 0 || H()) {
            f14 = org.telegram.messenger.g0.L(16.0f);
        }
        haVar.setTranslationY(f14);
    }

    public final void g0(fi.j6 j6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        ug.k0 k0Var = new ug.k0(j6Var.b(), this.f15062c, this.f15058b, new ra(this, 0), null);
        k0Var.T1 = A();
        k0Var.setOnDismissListener(new k70(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        k0Var.show();
    }

    public final void h(Runnable runnable) {
        x7 x7Var;
        Runnable runnable2;
        bb bbVar;
        float f10;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        de0 de0Var = this.C1;
        if (de0Var != null && (x7Var = this.L1) != null) {
            x7Var.f15754j = de0Var.a() | x7Var.f15754j;
            x7 x7Var2 = this.L1;
            de0 de0Var2 = this.C1;
            File file = x7Var2.Z0;
            if (file != null) {
                file.delete();
                x7Var2.Z0 = null;
            }
            ff savedFilterState = de0Var2.getSavedFilterState();
            x7Var2.f15735a1 = savedFilterState;
            if (!x7Var2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = de0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i7 = x7Var2.R;
                        float f11 = 1.0f;
                        if (i7 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i7 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, x7Var2.f15757k0 / 2.0f, x7Var2.f15759l0 / 2.0f);
                        matrix.postRotate(-x7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        x7Var2.f15762n0.preScale(x7Var2.f15757k0 / createBitmap.getWidth(), x7Var2.f15759l0 / createBitmap.getHeight());
                        x7Var2.f15757k0 = createBitmap.getWidth();
                        x7Var2.f15759l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = x7Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            x7Var2.Z0.delete();
                        }
                        String k10 = x7.k(x7Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i10 = x7Var2.f15733a;
                        if (!z10) {
                            str = "jpg";
                        }
                        x7Var2.Z0 = x7.w(i10, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(x7Var2.Z0);
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
                            Utilities.f22880i.c(new aa.c0(x7Var2, createBitmap, z10, runnable2, 4));
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
                x7 x7Var3 = this.L1;
                if (!x7Var3.K && (bbVar = this.Y0) != null) {
                    bbVar.set(x7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f15071e2 != z10) {
            this.f15071e2 = z10;
            float f10 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.K0.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(kr.h).withEndAction(new w9(this, z10, 1)).start();
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
        if (this.L1 != null && this.E1 != null && this.f15082i0.getMeasuredWidth() > 0 && this.f15082i0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i7 = this.L1.Q;
            if (i7 != 0) {
                matrix.postRotate(-i7, this.f15082i0.getMeasuredWidth() / 2.0f, this.f15082i0.getMeasuredHeight() / 2.0f);
                if ((this.L1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f15082i0.getMeasuredWidth() / this.f15082i0.getMeasuredHeight(), this.f15082i0.getMeasuredHeight() / this.f15082i0.getMeasuredWidth(), this.f15082i0.getMeasuredWidth() / 2.0f, this.f15082i0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f15082i0.getMeasuredWidth()) * this.L1.f15757k0, (1.0f / this.f15082i0.getMeasuredHeight()) * this.L1.f15759l0);
            matrix.postConcat(this.L1.f15762n0);
            matrix.postScale(this.f15082i0.getMeasuredWidth() / this.L1.f15753i0, this.f15082i0.getMeasuredHeight() / this.L1.f15755j0);
            this.E1.setTransform(matrix);
            this.E1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f10;
        g81 g81Var = this.W0;
        if ((g81Var.getTag() != null && z10) || (g81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f15075f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                m9 m9Var = new m9(this, 25);
                this.f15075f2 = m9Var;
                org.telegram.messenger.g0.h3(m9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f15078g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        g81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f15078g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            g81Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f15078g2;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(g81Var, property, f10));
        this.f15078g2.addListener(new bi.j7(14, this, z10));
        this.f15078g2.start();
        if (z10) {
            m9 m9Var2 = new m9(this, 26);
            this.f15075f2 = m9Var2;
            org.telegram.messenger.g0.h3(m9Var2, 2000L);
        }
    }

    public final void j() {
        fi.c3 c3Var;
        if (this.K == 1) {
            RectF rectF = this.f15069e0;
            rectF.set(this.f15082i0.getLeft(), this.f15082i0.getTop(), this.f15082i0.getMeasuredWidth(), this.f15082i0.getMeasuredHeight());
            rectF.offset(this.f15107r.getX(), this.f15107r.getY());
            float f10 = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.f15066d0;
            org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
            this.f15082i0.setAlpha(this.J);
            float f11 = rectF3.left;
            za zaVar = this.f15082i0;
            zaVar.setTranslationX((f11 - zaVar.getLeft()) - this.f15107r.getX());
            float f12 = rectF3.top;
            za zaVar2 = this.f15082i0;
            zaVar2.setTranslationY((f12 - zaVar2.getTop()) - this.f15107r.getY());
            ib ibVar = this.G;
            if (ibVar != null && (c3Var = ibVar.f14712f) != null) {
                c3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f14712f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            this.f15082i0.setScaleX(rectF3.width() / this.f15082i0.getMeasuredWidth());
            this.f15082i0.setScaleY(rectF3.height() / this.f15082i0.getMeasuredHeight());
            this.f15085j0.setAlpha(this.J);
            this.f15091l0.setAlpha(this.J);
            this.m0.setAlpha(this.J);
            if (this.f15076g0 == 2) {
                this.f15122v1.setAlpha(this.J);
            }
        }
    }

    public final void j0() {
        k9 k9Var = this.f15108r0;
        if (k9Var != null) {
            k9Var.dismiss();
            this.f15108r0 = null;
        }
        k9 k9Var2 = new k9(86400, this.f15058b, this.f15054a);
        k9Var2.V0();
        k9Var2.X0(this.f15136z0);
        TLRPC.InputPeer inputPeer = this.f15133y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = mp.u1(this.f15062c).l1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        k9Var2.W0(inputPeer);
        k9Var2.A1 = this.N;
        k9Var2.P1 = new n9(this, 18);
        k9Var2.M0(false);
        k9Var2.T0(1);
        k9Var2.R0(false);
        k9Var2.R1 = new n9(this, 19);
        k9Var2.O1 = new v9(this, 11);
        this.f15108r0 = k9Var2;
        k9Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: hi.nb.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.nb.k0(int, boolean, boolean):void");
    }

    public final void l() {
        x7 x7Var;
        boolean z10;
        if (this.f15126w1 != null && (x7Var = this.L1) != null && x7Var.f15775u) {
            File file = x7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.W0 = null;
            }
            this.L1.W0 = x7.w(this.f15062c, "webp");
            pa paVar = this.f15126w1;
            x7 x7Var2 = this.L1;
            ArrayList arrayList = x7Var2.T0;
            if (this.P1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap s02 = paVar.s0(arrayList, false, false, true, z10, x7Var2);
            try {
                try {
                    s02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                    if (s02.isRecycled()) {
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
                    if (s02 == null || s02.isRecycled()) {
                        return;
                    }
                }
                s02.recycle();
            } catch (Throwable th2) {
                if (s02 != null && !s02.isRecycled()) {
                    s02.recycle();
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
        qa qaVar;
        boolean z17 = false;
        if (this.f15076g0 == 0 && this.P1 == 1 && !this.J0.f14570e && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0(z11, z10);
        this.H0.setSelected(this.B0.j());
        h0 h0Var = this.J0;
        if (h0Var != null && h0Var.f14570e) {
            z12 = false;
        } else {
            z12 = true;
        }
        b0(this.f15098o0, z12, z10);
        if (!this.f15061b2 && this.P1 != -1 && this.f15076g0 == 0 && this.Z1 != null && !this.J0.f14570e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.F0, z13, z10);
        if (!this.f15061b2 && this.P1 != -1 && this.f15076g0 == 0 && (qaVar = this.C0) != null && qaVar.f14810a && !this.J0.f14570e && !this.B0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.G0, z14, z10);
        if (!this.f15061b2 && this.P1 != -1 && this.f15076g0 == 0 && !this.J0.f14570e) {
            z15 = true;
        } else {
            z15 = false;
        }
        b0(this.H0, z15, z10);
        b0(this.I0, this.J0.f14570e, z10);
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.P0.e(z10, f10);
        boolean z18 = this.J0.f14570e;
        u3 u3Var = this.f15099o1;
        if (z18) {
            u3Var.x();
        } else {
            u3Var.f(true);
        }
        g(this.f15061b2, z10);
        if (this.P1 == -1 && this.f15076g0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        org.telegram.messenger.g0.T3(this.T0, z16, true);
        if (this.P1 == -1 && this.f15076g0 == 0) {
            z17 = true;
        }
        org.telegram.messenger.g0.T3(this.S0, z17, true);
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
        this.f15098o0.setTranslationX(0.0f);
        float alpha5 = this.f15098o0.getAlpha();
        float L = (alpha4 * org.telegram.messenger.g0.L(46.0f)) + alpha3 + org.telegram.messenger.g0.L(8.0f);
        e0 e0Var = this.J0.f14567a;
        e0Var.setPadding((int) ((alpha5 * org.telegram.messenger.g0.L(46.0f)) + 0.0f + org.telegram.messenger.g0.L(8.0f)), 0, (int) L, 0);
        e0Var.invalidate();
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
        bg.v0 v0Var = this.E;
        if (v0Var != null) {
            v0Var.b(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        int i7;
        nh0 nh0Var = this.f15083i1;
        if (nh0Var != null) {
            int[] iArr = nh0Var.f37805e;
            int i10 = 0;
            if (z10) {
                x7 x7Var = this.L1;
                if (x7Var != null && x7Var.f15783y0) {
                    i10 = iArr[0];
                }
                nh0Var.P(i10);
                nh0 nh0Var2 = this.f15083i1;
                if (nh0Var2 != null) {
                    nh0Var2.start();
                    return;
                }
                return;
            }
            x7 x7Var2 = this.L1;
            if (x7Var2 != null && x7Var2.f15783y0) {
                i7 = iArr[0] - 1;
            } else {
                i7 = 0;
            }
            nh0Var.N(i7, false, true);
            this.f15083i1.P(i7);
            ImageView imageView = this.f15086j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f15120u2 < 0) {
            this.f15120u2 = mp.g1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f15123v2 = arrayList;
            arrayList.add("off");
            this.f15123v2.add("auto");
            this.f15123v2.add("on");
            float f10 = mp.g1().getFloat("frontflash_warmth", 0.9f);
            w2 w2Var = this.f15111s;
            w2Var.f15665o = f10;
            w2Var.f15664n = w2.f(f10);
            w2Var.g();
            float f11 = mp.g1().getFloat("frontflash_intensity", 1.0f);
            w2 w2Var2 = this.f15111s;
            w2Var2.f15666p = f11;
            w2Var2.i();
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        m9 m9Var = new m9(this, 2);
        pa paVar = this.f15126w1;
        x7 x7Var = this.L1;
        if (paVar != null && x7Var != null) {
            x7Var.f();
            boolean t02 = paVar.t0();
            boolean z10 = paVar.f15600y0.getPainting().E;
            Utilities.f22879g.c(new p9(this, paVar, x7Var.f15753i0, x7Var.f15755j0, x7Var, z10, t02, m9Var, 1));
            return;
        }
        m9Var.run();
    }

    public final void p(boolean z10) {
        bb bbVar;
        if (this.d) {
            k9 k9Var = this.f15108r0;
            if (k9Var != null) {
                k9Var.dismiss();
                this.f15108r0 = null;
            }
            x7 x7Var = this.L1;
            long j3 = 0;
            if (x7Var != null && !x7Var.h) {
                if ((this.f15124w && x7Var.f15749g) || x7Var.f15736b != 0) {
                    x7Var.f15754j = false;
                }
                x7Var.i(false);
            }
            this.L1 = null;
            t10 t10Var = this.S;
            if (t10Var != null && (bbVar = this.Y0) != null) {
                if (this.f15068e) {
                    return;
                }
                this.f15068e = true;
                h61 h61Var = bbVar.E;
                if (h61Var != null) {
                    h61Var.g0();
                    bbVar.E.m0();
                    bbVar.E = null;
                }
                h61 h61Var2 = bbVar.f14477y;
                if (h61Var2 != null) {
                    j3 = h61Var2.S();
                    bbVar.f14477y.g0();
                    bbVar.f14477y.m0();
                    bbVar.f14477y = null;
                }
                h61 h61Var3 = bbVar.f14451e;
                if (h61Var3 != null) {
                    j3 = h61Var3.S();
                    bbVar.f14451e.g0();
                    bbVar.f14451e.m0();
                    bbVar.f14451e = null;
                }
                t10Var.a(Long.valueOf(j3), new w9(this, z10, 2), Boolean.valueOf(this.f15124w), Long.valueOf(this.f15128x));
                return;
            }
            bb bbVar2 = this.Y0;
            if (bbVar2 != null && !z10) {
                bbVar2.set(null);
            }
            f(0.0f, z10, new m9(this, 23));
            int i7 = this.K;
            if (i7 == 1 || i7 == 0) {
                this.f15095n.setBackgroundColor(0);
                this.f15064c1.b(false, true);
            }
            ks.e().n(this, ks.f25279r2);
            int i10 = this.f15062c;
            ks.f(i10).n(this, ks.B5);
            ks.f(i10).n(this, ks.f25200d3);
        }
    }

    public final boolean p0() {
        qa qaVar;
        if ((this.Q1 || this.R1) && (qaVar = this.C0) != null && qaVar.isFrontface()) {
            int i7 = this.f15120u2;
            if (i7 == 2 || (i7 == 1 && this.d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f15058b;
        if (this.C0 == null && activity != null) {
            this.C0 = new qa(this, activity, mp.g1().getBoolean("stories_camera", false));
            n6 n6Var = this.P0;
            float f10 = 0.0f;
            if (n6Var != null) {
                n6Var.f15025h0 = 0.0f;
                n6Var.f15026i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.j();
            this.C0.setThumbDrawable(z());
            this.C0.initTexture();
            this.C0.setDelegate(new v9(this, 0));
            zb zbVar = this.G0;
            if (this.C0.f14810a && this.f15076g0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(zbVar, z10, true);
            i0 i0Var = this.H0;
            if (!this.C0.f14810a) {
                f10 = org.telegram.messenger.g0.L(46.0f);
            }
            i0Var.setTranslationX(f10);
            this.B0.setCameraView(this.C0);
            if (mp.g1().getInt("storyhint2", 0) < 1) {
                this.X0.x();
                mp.g1().edit().putInt("storyhint2", mp.g1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!l1.q(this.C0.getContext()) || !mp.g1().getBoolean("dualcam", l1.p(org.telegram.messenger.t0.f27013b, false))) && this.C0.f14810a && mp.g1().getInt("storydualhint", 0) < 2) {
                this.f15093m1.x();
            }
            if (this.D0 == null) {
                this.D0 = new j6(activity, new n9(this, 3));
            }
            this.D0.a(this.C0);
            x6 x6Var = this.E0;
            if (x6Var != null) {
                ab abVar = this.B0;
                Object blurRenderNode = abVar.getBlurRenderNode();
                x6Var.G = abVar;
                x6Var.H = blurRenderNode;
                x6Var.invalidate();
            }
        }
    }

    public final void r() {
        x7 x7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.C1 == null && (x7Var = this.L1) != null) {
            ff ffVar = null;
            if (!x7Var.K) {
                if (x7Var.Z0 == null) {
                    q10 = this.Y0.getPhotoBitmap();
                } else {
                    v9 v9Var = new v9(this, 10);
                    Point point = org.telegram.messenger.g0.f24226q;
                    q10 = x7.q(v9Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                x51 textureView = this.Y0.getTextureView();
                int orientation = this.Y0.getOrientation();
                x7 x7Var2 = this.L1;
                if (x7Var2 != null) {
                    ffVar = x7Var2.f15735a1;
                }
                de0 de0Var = new de0(this.f15058b, textureView, bitmap, null, orientation, ffVar, null, 0, false, false, this.f15112s0, this.f15054a);
                this.C1 = de0Var;
                this.f15107r.addView(de0Var);
                ce0 ce0Var = this.D1;
                if (ce0Var != null) {
                    ce0Var.setFilterView(this.C1);
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
                ud0 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                if (blurControl != null) {
                    this.f15082i0.addView(blurControl);
                }
                wd0 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    this.f15082i0.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new o9(this, 13));
                this.C1.getCancelTextView().setOnClickListener(new o9(this, 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
                this.C1.f34294j0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.N0 != null) {
            ab abVar = this.B0;
            if (abVar != null && abVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.N0.Q) {
                return;
            }
        }
        if (this.f15058b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        ue ueVar = this.f15097n2;
        boolean z13 = !z10;
        ab abVar2 = this.B0;
        if (abVar2 != null && abVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        p3 p3Var = new p3(this, this.f15062c, this.f15058b, this.f15054a, ueVar, z10, z13, z11);
        this.N0 = p3Var;
        p3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, c0.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new fa(this, 1));
        this.N0.setOnSelectListener(new ea(this, z10, 0));
        this.N0.setOnSelectMultipleListener(new di.q1(this, 2));
        v4.b0 b0Var = this.f15094m2;
        if (b0Var != null) {
            gi.g gVar = this.N0.f14894e;
            gVar.B = b0Var;
            gVar.l0();
        }
        this.f15095n.addView(this.N0, c8.na.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: hi.nb.t():void");
    }

    public final void u(boolean z10) {
        j6 j6Var = this.D0;
        if (j6Var != null) {
            j6Var.f14734f = null;
            Utilities.f22877e.a(j6Var.h);
            this.D0 = null;
            ab abVar = this.B0;
            if (abVar != null) {
                abVar.f14968c.a(null);
            }
        }
        x6 x6Var = this.E0;
        if (x6Var != null) {
            x6Var.G = null;
            x6Var.H = null;
            x6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new m9(this, 8));
                return;
            }
            a0(new m9(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            ab abVar2 = this.B0;
            if (abVar2 != null) {
                abVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void v() {
        p3 p3Var = this.N0;
        if (p3Var == null) {
            return;
        }
        this.f15095n.removeView(p3Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.f15100o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15100o2 = null;
        }
        r1.g gVar = this.f15103p2;
        if (gVar != null) {
            gVar.d();
            this.f15103p2 = null;
        }
        this.f15106q2 = null;
    }

    public final void x() {
        de0 de0Var = this.C1;
        if (de0Var == null) {
            return;
        }
        de0Var.b();
        this.D1.setFilterView(null);
        this.f15107r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.f15082i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        ud0 ud0Var = this.F1;
        if (ud0Var != null) {
            this.f15082i0.removeView(ud0Var);
            this.F1 = null;
        }
        wd0 wd0Var = this.G1;
        if (wd0Var != null) {
            this.f15082i0.removeView(wd0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        pa paVar = this.f15126w1;
        if (paVar != null) {
            paVar.B0.removeAllViews();
            pa paVar2 = this.f15126w1;
            a0 a0Var = paVar2.U1;
            if (a0Var != null) {
                a0Var.f14169b.c();
                m.o3 o3Var = a0Var.f14170c;
                if (o3Var != null) {
                    o3Var.f20256f = null;
                    org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) o3Var.h;
                    if (fcVar != null) {
                        fcVar.b();
                        o3Var.h = null;
                    }
                    a0Var.f14170c = null;
                }
            }
            paVar2.f15600y0.h();
            paVar2.B0.setVisibility(8);
            paVar2.A0.setVisibility(8);
            paVar2.f15580o0.postRunnable(new ai.k(17));
            j5 j5Var = paVar2.Y1;
            if (j5Var != null) {
                j5Var.dismiss();
            }
            sg.q qVar = paVar2.D1;
            if (qVar != null) {
                qVar.dismiss();
            }
            this.f15107r.removeView(this.f15126w1);
            this.f15126w1 = null;
            sg.t0 t0Var = this.f15130x1;
            if (t0Var != null) {
                this.f15082i0.removeView(t0Var);
                this.f15130x1 = null;
            }
            View view = this.f15137z1;
            if (view != null) {
                this.f15082i0.removeView(view);
                this.f15137z1 = null;
            }
            View view2 = this.f15134y1;
            if (view2 != null) {
                this.f15082i0.removeView(view2);
                this.f15134y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                this.f15082i0.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                this.f15082i0.removeView(view4);
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
        return this.f15058b.getResources().getDrawable(2131231495);
    }
}
