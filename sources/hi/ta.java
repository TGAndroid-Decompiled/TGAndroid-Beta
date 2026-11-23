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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.v10;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
public final class ta implements gs {
    public static ta G2;
    public t A0;
    public View A1;
    public boolean A2;
    public final ga B0;
    public View B1;
    public boolean B2;
    public w9 C0;
    public ee0 C1;
    public boolean C2;
    public a6 D0;
    public final de0 D1;
    public ba D2;
    public final bg.v0 E;
    public final o6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final eb F0;
    public vd0 F1;
    public ValueAnimator F2;
    public oa G;
    public final fb G0;
    public xd0 G1;
    public float H;
    public final z H0;
    public File H1;
    public final RectF I;
    public final eb I0;
    public ArrayList I1;
    public float J;
    public final y J0;
    public ArrayList J1;
    public int K;
    public final ib K0;
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
    public final e6 P0;
    public int P1;
    public final h2.f Q;
    public final d Q0;
    public boolean Q1;
    public Runnable R;
    public final n9 R0;
    public boolean R1;
    public v10 S;
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
    public final f81 W0;
    public boolean W1;
    public boolean X;
    public final l3 X0;
    public boolean X1;
    public boolean Y;
    public final ha Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final fi.b f15387a;
    public int f15388a0;
    public final db f15389a1;
    public AnimatorSet f15390a2;
    public final Activity f15391b;
    public int f15392b0;
    public final hb f15393b1;
    public boolean f15394b2;
    public final int f15395c;
    public int f15396c0;
    public final p5 f15397c1;
    public boolean f15398c2;
    public boolean d;
    public final RectF f15399d0;
    public final ja f15400d1;
    public boolean d2;
    public boolean f15401e;
    public final RectF f15402e0;
    public final m9 f15403e1;
    public boolean f15404e2;
    public final WindowManager f15405f;
    public final Path f15406f0;
    public final u0 f15407f1;
    public Runnable f15408f2;
    public int f15409g0;
    public oh0 f15410g1;
    public AnimatorSet f15411g2;
    public final WindowManager.LayoutParams h;
    public int f15412h0;
    public final rh0 f15413h1;
    public y8 f15414h2;
    public final fa f15415i0;
    public oh0 f15416i1;
    public boolean f15417i2;
    public final FrameLayout f15418j0;
    public ImageView f15419j1;
    public AnimatorSet f15420j2;
    public final LinearLayout f15421k0;
    public final m5 f15422k1;
    public ValueAnimator f15423k2;
    public final FrameLayout f15424l0;
    public final l3 l1;
    public boolean f15425l2;
    public final bi.g3 m0;
    public final l3 f15426m1;
    public v4.a0 f15427m2;
    public final sa f15428n;
    public final FrameLayout f15429n0;
    public final l3 n1;
    public ve f15430n2;
    public final l2 f15431o0;
    public final l3 f15432o1;
    public ValueAnimator f15433o2;
    public final w6 f15434p0;
    public final q5 f15435p1;
    public r1.g f15436p2;
    public final org.telegram.ui.ActionBar.m5 f15437q0;
    public final gb f15438q1;
    public Boolean f15439q2;
    public final la f15440r;
    public q8 f15441r0;
    public p f15442r1;
    public c9 f15443r2;
    public final n2 f15444s;
    public final org.telegram.ui.Components.ca f15445s0;
    public da f15446s1;
    public AnimatorSet f15447s2;
    public final v5 f15448t0;
    public ea f15449t1;
    public boolean f15450t2;
    public final bi.o3 f15451u0;
    public final db f15452u1;
    public int f15453u2;
    public boolean f15454v0;
    public final d f15455v1;
    public ArrayList f15456v2;
    public boolean f15457w;
    public long f15458w0;
    public v9 f15459w1;
    public FrameLayout f15460w2;
    public long f15461x;
    public String f15462x0;
    public sg.u0 f15463x1;
    public boolean f15464x2;
    public ka f15465y;
    public TLRPC.InputPeer f15466y0;
    public View f15467y1;
    public s8 f15468y2;
    public o8 f15469z0;
    public View f15470z1;
    public ai.t0 f15471z2;

    public ta(Activity activity, int i7) {
        bg.v0 v0Var;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        boolean z10;
        float f11;
        fi.b bVar = new fi.b();
        this.f15387a = bVar;
        this.f15461x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new h2.f((int[]) null);
        this.f15399d0 = new RectF();
        this.f15402e0 = new RectF();
        this.f15406f0 = new Path();
        new Rect();
        this.f15409g0 = 0;
        this.f15412h0 = -1;
        this.f15469z0 = new o8();
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
        q9 q9Var = new q9(this);
        this.f15404e2 = true;
        this.f15425l2 = true;
        this.f15453u2 = -1;
        this.f15391b = activity;
        this.f15395c = i7;
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
        this.f15405f = windowManager;
        sa saVar = new sa(this, activity);
        this.f15428n = saVar;
        b9 b9Var = new b9(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.a0.i(saVar, b9Var);
        this.f15428n.setFocusable(true);
        this.f15428n.setImportantForAccessibility(2);
        n2 n2Var = new n2(activity, windowManager, this.f15428n, layoutParams);
        this.f15444s = n2Var;
        n2Var.a(new z9(this));
        this.f15428n.addView(this.f15444s.f15050b, new ViewGroup.LayoutParams(-1, -1));
        sa saVar2 = this.f15428n;
        la laVar = new la(this, activity);
        this.f15440r = laVar;
        saVar2.addView(laVar);
        la laVar2 = this.f15440r;
        fa faVar = new fa(this, activity);
        this.f15415i0 = faVar;
        laVar2.addView(faVar);
        this.f15440r.addView(this.f15444s.f15051c, new ViewGroup.LayoutParams(-1, -1));
        this.f15445s0 = new org.telegram.ui.Components.ca(this.f15415i0);
        this.f15448t0 = new Object();
        la laVar3 = this.f15440r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f15418j0 = frameLayout;
        laVar3.addView(frameLayout);
        la laVar4 = this.f15440r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f15424l0 = frameLayout2;
        laVar4.addView(frameLayout2);
        la laVar5 = this.f15440r;
        bi.g3 g3Var = new bi.g3(5, activity, this);
        this.m0 = g3Var;
        laVar5.addView(g3Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        la laVar6 = this.f15440r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f15429n0 = frameLayout3;
        laVar6.addView(frameLayout3);
        gc.a(this.f15428n, new bi.t(3));
        ga gaVar = new ga(this, activity, this.f15445s0, this.f15440r, bVar);
        this.B0 = gaVar;
        sa saVar3 = this.f15428n;
        Objects.requireNonNull(saVar3);
        gaVar.setCancelGestures(new b0(saVar3, 16));
        this.B0.setResetState(new s8(this, 13));
        this.f15415i0.addView(this.B0, c8.na.e(-1, -1, 119));
        this.B0.setOnClickListener(new u8(this, 12));
        fa faVar2 = this.f15415i0;
        int i14 = this.K;
        if (i14 != 1 && i14 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        faVar2.setBackgroundColor(i10);
        fa faVar3 = this.f15415i0;
        bg.q0 q0Var = bg.u0.f3313a;
        faVar3.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(12.0f)));
        this.f15415i0.setClipToOutline(true);
        s8 s8Var = new s8(this, 14);
        ?? view = new View(activity);
        view.f34440a = new TextPaint(1);
        view.f34441b = new TextPaint(1);
        nr nrVar = nr.h;
        view.f34447s = new org.telegram.ui.Components.d6((View) view, 0L, 350L, nrVar);
        view.J = new hb0(view, 6);
        view.f34450y = s8Var;
        this.D1 = view;
        ha haVar = new ha(this, activity, this.f15445s0, this.f15448t0);
        this.Y0 = haVar;
        haVar.setCollageView(this.B0);
        ha haVar2 = this.Y0;
        haVar2.f15623w = new s8(this, 15);
        haVar2.setOnTapListener(new s8(this, 16));
        this.Y0.setVisibility(8);
        ha haVar3 = this.Y0;
        haVar3.O = new s8(this, 17);
        this.f15415i0.addView(haVar3, c8.na.e(-1, -1, 119));
        this.f15415i0.addView(this.D1, c8.na.e(-1, -1, 119));
        sa saVar4 = this.f15428n;
        ja jaVar = new ja(this, activity, saVar4, saVar4, this.f15440r, bVar, this.f15445s0);
        this.f15400d1 = jaVar;
        jaVar.setAccount(i7);
        this.f15400d1.setUiBlurBitmap(new f9(0));
        gc.a(this.m0, new bi.i1(this, 5));
        this.f15400d1.setOnHeightUpdate(new t8(this, 13));
        this.f15400d1.setOnPeriodUpdate(new t8(this, 4));
        long j3 = this.O;
        if (j3 != 0) {
            this.f15400d1.setDialogId(j3);
        }
        this.f15400d1.setOnPremiumHint(new t8(this, 5));
        this.f15400d1.setOnKeyboardOpen(new t8(this, 6));
        bi.o3 o3Var = new bi.o3(3, activity, this);
        this.f15451u0 = o3Var;
        this.f15440r.addView(o3Var);
        db dbVar = new db(activity, this.f15440r, this.f15415i0, bVar, this.f15445s0);
        this.f15389a1 = dbVar;
        dbVar.setOnTimelineClick(new s8(this, 10));
        this.f15389a1.setOnHeightChange(new s8(this, 11));
        this.Y0.setVideoTimelineView(this.f15389a1);
        this.f15389a1.setVisibility(8);
        this.f15389a1.setAlpha(0.0f);
        this.f15389a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.f15389a1, c8.na.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hb hbVar = new hb(activity);
        this.f15393b1 = hbVar;
        hbVar.setVisibility(8);
        this.f15393b1.a(false);
        this.Z0.addView(this.f15393b1, c8.na.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, c8.na.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.f15400d1, c8.na.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.f15389a1);
        this.B0.setPreviewView(this.Y0);
        db dbVar2 = new db(activity, this.f15440r, this.f15415i0, bVar, this.f15445s0);
        this.f15452u1 = dbVar2;
        dbVar2.Y0 = true;
        dbVar2.setVisibility(8);
        this.f15452u1.setAlpha(0.0f);
        this.m0.addView(this.f15452u1, c8.na.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        m9 m9Var = new m9(this, activity, bVar, this.f15445s0);
        this.f15403e1 = m9Var;
        m9Var.setVisibility(8);
        this.m0.addView(this.f15403e1, c8.na.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f15431o0 = imageView;
        imageView.setContentDescription(hd.N0(2131754878, null));
        l2 l2Var = this.f15431o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        this.f15431o0.setImageResource(2131232279);
        l2 l2Var2 = this.f15431o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        l2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15431o0.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.f15431o0.setOnClickListener(new u8(this, 1));
        this.f15418j0.addView(this.f15431o0, c8.na.e(56, 56, 51));
        this.f15444s.a(this.f15431o0);
        w6 w6Var = new w6(activity, i7);
        this.f15434p0 = w6Var;
        w6Var.a(false, false);
        this.f15434p0.setOnClickListener(new ai.o2(23, this, activity));
        this.f15418j0.addView(this.f15434p0, c8.na.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.f15437q0 = m5Var;
        m5Var.setTextSize(20);
        this.f15437q0.setGravity(19);
        this.f15437q0.setTextColor(-1);
        this.f15437q0.setTypeface(org.telegram.messenger.g0.o());
        this.f15437q0.l(hd.N0(2131746157, null), false);
        this.f15437q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.f15437q0.setAlpha(0.0f);
        this.f15437q0.setVisibility(8);
        this.f15437q0.setEllipsizeByGradient(true);
        this.f15437q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.f15418j0.addView(this.f15437q0, c8.na.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f15421k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f15421k0.setGravity(5);
        this.f15418j0.addView(this.f15421k0, c8.na.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        t8 t8Var = new t8(this, 7);
        sa saVar5 = this.f15428n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f15487x = true;
        imageView2.f15488y = true;
        imageView2.h = t8Var;
        imageView2.f15478a = i7;
        imageView2.f15479b = saVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.d(imageView2, 29));
        imageView2.f15482f = new up(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        imageView2.d();
        this.f15407f1 = imageView2;
        l3 l3Var = new l3(activity, 1);
        l3Var.o(1.0f, -71.0f);
        l3Var.d = 2000L;
        l3Var.V = false;
        l3Var.I.r(true, false);
        this.l1 = l3Var;
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15418j0.addView(this.l1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f15413h1 = imageView3;
        imageView3.setScaleType(scaleType);
        rh0 rh0Var = this.f15413h1;
        d7 d7Var = this.L1;
        if (d7Var != null && d7Var.Y) {
            i11 = 2131231760;
        } else {
            i11 = 2131231751;
        }
        rh0Var.setImageResource(i11);
        this.f15413h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15413h1.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.f15413h1.setOnClickListener(new u8(this, 2));
        this.f15413h1.setVisibility(8);
        this.f15413h1.setAlpha(0.0f);
        m5 m5Var2 = new m5(activity);
        this.f15422k1 = m5Var2;
        m5Var2.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.f15422k1.setVisibility(8);
        this.f15422k1.setAlpha(0.0f);
        this.f15422k1.setOnClickListener(new u8(this, 3));
        this.f15421k0.addView(this.f15422k1, c8.na.r(46, 56, 53));
        this.f15421k0.addView(this.f15413h1, c8.na.r(46, 56, 53));
        this.f15421k0.addView(this.f15407f1, c8.na.e(46, 56, 53));
        eb ebVar = new eb(activity);
        this.F0 = ebVar;
        ebVar.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new u8(this, 4));
        this.F0.setOnLongClickListener(new o4(this, 1));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.f15444s.a(this.F0);
        this.f15418j0.addView(this.F0, c8.na.e(56, 56, 53));
        fb fbVar = new fb(activity);
        this.G0 = fbVar;
        fbVar.setContentDescription(hd.N0(2131754886, null));
        this.G0.setOnClickListener(new u8(this, 5));
        boolean q10 = c1.q(activity);
        fb fbVar2 = this.G0;
        if (q10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        fbVar2.setVisibility(i12);
        fb fbVar3 = this.G0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        fbVar3.setAlpha(f10);
        this.f15444s.a(this.G0);
        this.f15418j0.addView(this.G0, c8.na.e(56, 56, 53));
        ?? ebVar2 = new eb(activity);
        this.H0 = ebVar2;
        ebVar2.setContentDescription(hd.N0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
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
        this.f15444s.a(this.H0);
        this.f15418j0.addView(this.H0, c8.na.e(56, 56, 53));
        eb ebVar3 = new eb(activity);
        this.I0 = ebVar3;
        ebVar3.setContentDescription(hd.N0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.I0.a(new u(new t("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new u8(this, 7));
        this.f15444s.a(this.I0);
        this.f15418j0.addView(this.I0, c8.na.e(56, 56, 53));
        y yVar = new y(activity, this.f15444s);
        this.J0 = yVar;
        yVar.f15701a.v0(6);
        this.J0.setSelected((t) null);
        this.J0.setOnLayoutClick(new t8(this, 8));
        this.f15418j0.addView(this.J0, c8.na.e(-1, 56, 53));
        l3 l3Var2 = new l3(activity, 1);
        l3Var2.o(1.0f, -20.0f);
        l3Var2.d = 5000L;
        l3Var2.k(true);
        l3Var2.v(hd.N0(2131744472, null));
        l3Var2.f14868r0 = new ai.i(19);
        this.f15426m1 = l3Var2;
        l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15418j0.addView(this.f15426m1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        l3 l3Var3 = new l3(activity, 2);
        l3Var3.o(0.0f, 28.0f);
        l3Var3.d = 5000L;
        l3Var3.r(true);
        this.n1 = l3Var3;
        this.f15418j0.addView(l3Var3, c8.na.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        l3 l3Var4 = new l3(activity, 1);
        l3Var4.o(1.0f, -20.0f);
        l3Var4.d = 5000L;
        l3Var4.v(hd.N0(2131744463, null));
        this.f15432o1 = l3Var4;
        l3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.f15418j0.addView(this.f15432o1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f14736a = paint;
        Paint paint2 = new Paint(1);
        view2.f14737b = paint2;
        view2.f14739e = new org.telegram.ui.Components.d6((View) view2, 0L, 250L, nrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        view2.f14738c = n6Var;
        n6Var.n(0.3f, 250L, nrVar);
        n6Var.w(org.telegram.messenger.g0.L(13.0f));
        n6Var.u(-1);
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.setCallback(view2);
        n6Var.f37751b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.f15418j0.addView(this.K0, c8.na.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f15444s.a(this.K0);
        MediaController.O(0);
        e6 e6Var = new e6(activity);
        this.P0 = e6Var;
        e6Var.setDelegate(q9Var);
        e6 e6Var2 = this.P0;
        if (this.P1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e6Var2.f14529o0 = -1.0f;
        e6Var2.f14530p0 = z10;
        e6Var2.invalidate();
        this.f15424l0.addView(this.P0, c8.na.e(-1, 100, 87));
        this.f15444s.a(this.P0);
        e6 e6Var3 = this.P0;
        if (this.B0.j()) {
            f11 = this.B0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        e6Var3.e(true, f11);
        d dVar = new d(activity, bVar, true);
        this.Q0 = dVar;
        dVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(hd.N0(2131748595, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.f15424l0.addView(this.Q0, c8.na.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new u8(this, 8));
        l3 l3Var5 = new l3(activity, 3);
        l3Var5.r(true);
        l3Var5.v(hd.N0(2131744470, null));
        l3Var5.h = org.telegram.messenger.g0.L(320.0f);
        l3Var5.d = 5000L;
        l3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = l3Var5;
        this.f15424l0.addView(l3Var5, c8.na.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        f81 f81Var = new f81(activity);
        this.W0 = f81Var;
        f81Var.N = false;
        f81Var.setAlpha(0.0f);
        this.f15424l0.addView(this.W0, c8.na.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new b9(this, 4));
        f81 f81Var2 = this.W0;
        this.U1 = 0.0f;
        f81Var2.b(false, 0.0f);
        o6 o6Var = new o6(activity, i7, new s8(this, 12));
        this.E0 = o6Var;
        o6Var.f15130c = new t8(this, 9);
        this.f15424l0.addView(o6Var, c8.na.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        n9 n9Var = new n9(this, activity);
        this.R0 = n9Var;
        n9Var.setOnSwitchModeListener(new t8(this, 10));
        this.R0.setOnSwitchingModeListener(new t8(this, 11));
        this.f15429n0.addView(this.R0, c8.na.e(-1, 48, 55));
        this.f15444s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(hd.N0(2131754751, null));
        this.S0.setImageResource(2131232769);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.f15429n0.addView(this.S0, c8.na.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f15444s.a(this.S0);
        this.S0.setOnClickListener(new u8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(hd.N0(2131748597, null));
        this.T0.setImageResource(2131232770);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        this.f15429n0.addView(this.T0, c8.na.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f15444s.a(this.T0);
        this.T0.setOnClickListener(new u8(this, 10));
        i3 i3Var = new i3(activity);
        this.U0 = i3Var;
        this.f15429n0.addView(i3Var, c8.na.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f15444s.a(this.U0);
        i3 i3Var2 = new i3(activity);
        this.V0 = i3Var2;
        i3Var2.f14717a.t(hd.N0(2131744462, null), false, true);
        i3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.f15429n0.addView(this.V0, c8.na.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f15444s.a(this.V0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f15455v1 = dVar2;
        dVar2.setVisibility(8);
        this.f15455v1.setAlpha(0.0f);
        this.f15455v1.i(hd.N0(2131744448, null), false, true);
        this.f15455v1.setOnClickListener(new u8(this, 11));
        this.f15429n0.addView(this.f15455v1, c8.na.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f15176b = new ArrayList();
        frameLayout5.f15178e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f15175a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, c8.na.e(-1, -1, 119));
        frameLayout5.a(0, 2131231740, hd.N0(2131754813, null));
        frameLayout5.a(2, 2131232286, hd.N0(2131754755, null));
        frameLayout5.a(1, 2131232288, hd.N0(2131754806, null));
        frameLayout5.a(3, 2131231730, hd.N0(2131751687, null));
        frameLayout5.a(4, 2131232285, hd.N0(2131754810, null));
        String N0 = hd.N0(2131745444, null);
        frameLayout5.d = N0;
        frameLayout5.f15178e = true;
        o5 o5Var = new o5(frameLayout5, activity, N0, true);
        frameLayout5.f15177c = o5Var;
        o5Var.setContentDescription(hd.N0(2131745444, null));
        frameLayout5.addView(frameLayout5.f15177c, c8.na.c(-2.0f, -2));
        frameLayout5.e();
        this.f15397c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f15397c1.setOnClickListener(new t8(this, 12));
        this.f15429n0.addView(this.f15397c1, c8.na.e(-1, 52, 23));
        gb gbVar = new gb(activity);
        this.f15438q1 = gbVar;
        gbVar.setAlpha(0.0f);
        this.f15438q1.setVisibility(8);
        this.f15415i0.addView(this.f15438q1, c8.na.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        q5 q5Var = new q5(activity, i7, bVar);
        this.f15435p1 = q5Var;
        this.f15415i0.addView(q5Var, c8.na.e(-1, -1, 119));
        l0(false);
    }

    public static ta D(Activity activity, int i7) {
        ta taVar = G2;
        if (taVar != null && (taVar.f15391b != activity || taVar.f15395c != i7)) {
            taVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new ta(activity, i7);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        np.g1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(ta taVar) {
        w9 w9Var = taVar.C0;
        boolean z10 = false;
        if (w9Var != null && w9Var.getTextureView() != null) {
            Bitmap bitmap = taVar.C0.getTextureView().getBitmap();
            if (bitmap == null) {
                taVar.d2 = false;
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
            taVar.d2 = z10;
            return;
        }
        taVar.d2 = false;
    }

    public static void b(ta taVar) {
        ValueAnimator valueAnimator = taVar.f15423k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            taVar.f15423k2 = null;
        }
        taVar.f15425l2 = false;
        la laVar = taVar.f15440r;
        float f10 = laVar.f14955a;
        float f11 = laVar.f14956b;
        laVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        taVar.f15423k2 = ofFloat;
        ofFloat.addUpdateListener(new j9(taVar, f10, f11, 0));
        taVar.f15423k2.setDuration(340L);
        taVar.f15423k2.setInterpolator(nr.h);
        taVar.f15423k2.addListener(new t9(taVar, 0));
        taVar.f15423k2.start();
    }

    public static boolean c(ta taVar) {
        Activity activity = taVar.f15391b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g10 = i5.c.g(context, 2131232767);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        g10.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new aa(g10, g10), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        ta taVar = G2;
        if (taVar != null) {
            taVar.p(false);
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
        w9 w9Var = this.C0;
        if (w9Var != null && w9Var.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f15456v2.get(this.f15453u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 C() {
        if (this.O0 == null) {
            v0 v0Var = new v0(this.f15391b);
            this.O0 = v0Var;
            this.f15424l0.addView(v0Var, c8.na.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        int i7;
        w9 w9Var = this.C0;
        if (w9Var != null && w9Var.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f15456v2;
                if (this.f15453u2 + 1 >= arrayList.size()) {
                    i7 = 0;
                } else {
                    i7 = this.f15453u2 + 1;
                }
                return (String) arrayList.get(i7);
            }
            return this.C0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f15419j1 == null) {
            oh0 oh0Var = new oh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f15416i1 = oh0Var;
            oh0Var.h = true;
            d7 d7Var = this.L1;
            if (d7Var != null && d7Var.f14412y0) {
                oh0Var.M(35);
                this.f15416i1.P(36);
            } else {
                oh0Var.P(0);
                this.f15416i1.M(0);
            }
            this.f15416i1.f38173a0 = true;
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.J9, this.f15387a);
            this.f15416i1.Q(w02, "Sunny");
            this.f15416i1.Q(w02, "Path 6");
            this.f15416i1.Q(w02, "Path");
            this.f15416i1.Q(w02, "Path 5");
            this.f15416i1.o();
            ImageView imageView = new ImageView(this.f15391b);
            this.f15419j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f15419j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f15419j1.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
            this.f15419j1.setOnClickListener(new u8(this, 0));
            this.f15419j1.setVisibility(8);
            this.f15419j1.setImageDrawable(this.f15416i1);
            this.f15419j1.setAlpha(0.0f);
            this.f15421k0.addView(this.f15419j1, 0, c8.na.r(46, 56, 53));
        }
        return this.f15419j1;
    }

    public final void G() {
        v9 v9Var = this.f15459w1;
        if (v9Var == null) {
            return;
        }
        this.f15460w2 = null;
        v9Var.getTopLayout().setAlpha(0.0f);
        this.f15459w1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.f15459w1.getBottomLayout().setAlpha(0.0f);
        this.f15459w1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.f15459w1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.f15459w1.setVisibility(8);
    }

    public final boolean H() {
        float f10;
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.f15394b2 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        g3 g3Var;
        if (!this.X && (g3Var = this.N0) != null) {
            if (g3Var.getTranslationY() < (this.f15428n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.f24010q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: hi.ta.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j3) {
        if (!this.T1 && this.L1 != null) {
            y8 y8Var = this.f15414h2;
            if (y8Var != null) {
                org.telegram.messenger.g0.r(y8Var);
            }
            this.f15417i2 = true;
            this.T1 = true;
            this.f15414h2 = new y8(this, runnable, 1);
            this.Y0.setAlpha(0.0f);
            this.Y0.setVisibility(0);
            this.Y0.n(this.L1, this.f15414h2, j3);
            this.Y0.p(this.L1, false);
            org.telegram.messenger.g0.h3(this.f15414h2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: hi.ta.L():boolean");
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
            this.f15452u1.setVisibility(8);
            if (i10 == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.m0.setVisibility(i16);
            this.f15400d1.setVisibility(8);
            this.f15455v1.setVisibility(8);
        }
        if (i7 == 1) {
            this.f15397c1.setVisibility(8);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.m0.setVisibility(i13);
            this.f15413h1.setVisibility(8);
            this.f15422k1.setVisibility(8);
            this.f15407f1.setVisibility(8);
            ImageView imageView = this.f15419j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.Y0.setVisibility(i14);
            this.f15389a1.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            if (i10 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.f15437q0.setVisibility(i15);
            v();
            this.f15438q1.setAlpha(0.0f);
            this.f15438q1.setVisibility(8);
            this.f15393b1.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        if (i10 == 1) {
            d7 d7Var = this.L1;
            if (d7Var == null || !d7Var.f14390n) {
                t();
                G();
            }
            de0 de0Var = this.D1;
            if (de0Var != null) {
                de0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            d7 d7Var2 = this.L1;
            if (d7Var2 != null && d7Var2.f14380h0 >= 30000) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f15393b1.setVisibility(i12);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            d7 d7Var3 = this.L1;
            if (d7Var3 == null || d7Var3.J0 == 0) {
                i17 = 0;
            }
            this.f15400d1.setVisibility(i17);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            v0 C = C();
            C.f15518r.e(true, 0.0f);
            C.a(true);
            b0 b0Var = C.h;
            if (b0Var != null) {
                org.telegram.messenger.g0.r(b0Var);
            }
            b0 b0Var2 = new b0(C, 2);
            C.h = b0Var2;
            org.telegram.messenger.g0.h3(b0Var2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        de0 de0Var2 = this.D1;
        if (de0Var2 != null) {
            if (i10 == 1 && ((i11 = this.f15412h0) == -1 || i11 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            de0Var2.setAllowTouch(z11);
        }
        ja jaVar = this.f15400d1;
        if (jaVar != null) {
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jaVar.f14970e0 = z10;
        }
        if (i10 == 1) {
            int i18 = this.f15395c;
            si.d0(i18).D(0);
            si.d0(i18).Y0(0, false, true, false);
            si.d0(i18).Y0(2, false, true, false);
            fi.p6 R1 = np.u1(i18).R1();
            if (R1.Q == 0) {
                R1.S();
            }
            np.u1(i18).R1().U();
        }
    }

    public final void N(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.ta.N(int, int):void");
    }

    public final void O() {
        sg.s0 s0Var;
        int i7;
        if (this.f15409g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f15468y2 = new s8(this, 3);
            } else {
                Y(false);
            }
        }
        ja jaVar = this.f15400d1;
        if (jaVar != null) {
            jaVar.f14971f.s();
        }
        e6 e6Var = this.P0;
        if (e6Var != null) {
            e6Var.h();
        }
        q5 q5Var = this.f15435p1;
        if (q5Var != null) {
            fi.p6 R1 = np.u1(q5Var.f15232a).R1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) R1.f12383i.f(k10.i(R1.f12377a).f24951n);
            if (peerStories != null) {
                i7 = peerStories.stories.size();
            } else {
                i7 = 0;
            }
            q5Var.f15233b = R1.f12378b.m() + i7 + 1;
            q5Var.f15234c.invalidate();
        }
        v9 v9Var = this.f15459w1;
        if (v9Var != null && (s0Var = v9Var.f14926y0.d) != null) {
            s0Var.postRunnable(s0Var.f57356x);
        }
        ha haVar = this.Y0;
        if (haVar != null) {
            haVar.x(0, false);
        }
        a1 a1Var = np.u1(this.f15395c).R1().f12396w;
        if (!a1Var.f14172c && !a1Var.d) {
            a1Var.d = true;
            w0 w0Var = new w0(a1Var, 1);
            ur a02 = ur.a0(a1Var.f14170a);
            a02.f27214a.c(new di.p6((Object) a02, false, (Object) w0Var, 3));
        }
    }

    public final void P(int i7, int i10) {
        boolean z10;
        v9 v9Var;
        da daVar;
        ea eaVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        v9 v9Var2;
        if (i10 == 0) {
            this.f15431o0.setVisibility(8);
        }
        if (i7 == 0 && (v9Var2 = this.f15459w1) != null) {
            v9Var2.setVisibility(8);
        }
        if (i7 == -1) {
            this.f15400d1.setVisibility(8);
            if (i10 == 2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f15413h1.setVisibility(i11);
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f15422k1.setVisibility(i12);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f15407f1.setVisibility(i13);
            ImageView imageView = this.f15419j1;
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
            this.f15389a1.setVisibility(i14);
            this.f15437q0.setVisibility(8);
        }
        boolean z11 = true;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y0.setAllowCropping(z10);
        if ((i10 == 0 || i7 == 0) && (v9Var = this.f15459w1) != null) {
            v9Var.N0.setLayerType(0, null);
        }
        de0 de0Var = this.D1;
        if (de0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z11 = false;
            }
            de0Var.setAllowTouch(z11);
        }
        if (i10 == 3) {
            da daVar2 = this.f15446s1;
            if (daVar2 != null) {
                daVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (daVar = this.f15446s1) != null) {
            daVar.setVisibility(8);
            this.f15446s1.setAppearProgress(0.0f);
            da daVar3 = this.f15446s1;
            daVar3.f14804y = null;
            h0 h0Var = daVar3.f14798f;
            h0Var.M = null;
            h0Var.d = null;
            h0Var.K = false;
            daVar3.d.setVisibility(8);
            daVar3.f14794a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ea eaVar2 = this.f15449t1;
            if (eaVar2 != null) {
                eaVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 4 && (eaVar = this.f15449t1) != null) {
            eaVar.setVisibility(8);
            this.f15449t1.setAppearProgress(0.0f);
            ea eaVar3 = this.f15449t1;
            eaVar3.f15029b = null;
            h0 h0Var2 = eaVar3.h;
            h0Var2.M = null;
            h0Var2.d = null;
            h0Var2.K = false;
            eaVar3.f15031e.setVisibility(8);
            eaVar3.setVisibility(8);
        }
    }

    public final void Q(na naVar) {
        fi.j6 o4;
        sa saVar;
        if (this.d) {
            return;
        }
        int i7 = this.f15395c;
        if (np.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.f15454v0 = false;
        this.f15401e = false;
        this.C2 = false;
        this.f15448t0.f15531g = false;
        WindowManager windowManager = this.f15405f;
        if (windowManager != null && (saVar = this.f15428n) != null && saVar.getParent() == null) {
            sa saVar2 = this.f15428n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, saVar2, layoutParams);
            windowManager.addView(this.f15428n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.f15458w0 == 0 && (o4 = np.u1(i7).R1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (naVar != null) {
            this.G = naVar;
            this.K = naVar.f15157a;
            rectF.set(naVar.f15159c);
            this.H = naVar.f15158b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24010q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15440r.c();
        int i11 = this.K;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f15415i0.setBackgroundColor(i10);
        this.f15440r.setTranslationX(0.0f);
        this.f15440r.setTranslationY(0.0f);
        this.f15440r.b(0.0f);
        this.f15440r.setScaleX(1.0f);
        this.f15440r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15391b);
        f(1.0f, true, new s8(this, 6));
        d();
        this.f15458w0 = 0L;
        this.f15462x0 = "";
    }

    public final void R(ma maVar, d7 d7Var, long j3) {
        int i7;
        sa saVar;
        if (this.d) {
            return;
        }
        int i10 = this.f15395c;
        if (np.u1(i10).A2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f15454v0 = false;
        this.f15401e = false;
        this.C2 = false;
        WindowManager windowManager = this.f15405f;
        if (windowManager != null && (saVar = this.f15428n) != null && saVar.getParent() == null) {
            sa saVar2 = this.f15428n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, saVar2, layoutParams);
            windowManager.addView(this.f15428n, layoutParams);
            f0();
        }
        this.L1 = d7Var;
        this.P1 = d7Var.K ? 1 : 0;
        this.f15448t0.f15531g = false;
        RectF rectF = this.I;
        if (maVar != null) {
            this.G = maVar;
            this.K = maVar.f15157a;
            rectF.set(maVar.f15159c);
            this.H = maVar.f15158b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24010q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15440r.c();
        int i11 = this.K;
        int i12 = 1;
        if (i11 != 1 && i11 != 0) {
            i7 = -14737633;
        } else {
            i7 = 0;
        }
        this.f15415i0.setBackgroundColor(i7);
        this.f15440r.setTranslationX(0.0f);
        this.f15440r.setTranslationY(0.0f);
        this.f15440r.b(0.0f);
        this.f15440r.setScaleX(1.0f);
        this.f15440r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15391b);
        d7 d7Var2 = this.L1;
        if (d7Var2 != null) {
            this.f15400d1.setText(d7Var2.C0);
        }
        K(new l9(this, 0), j3);
        if (this.L1.f14366b0) {
            i12 = 2;
        }
        J(i12, false);
        k0(-1, false, false);
        this.f15397c1.b(false, false);
        d();
        this.f15458w0 = 0L;
        this.f15462x0 = "";
    }

    public final void S() {
        a70 a70Var;
        ha haVar = this.Y0;
        if (haVar != null) {
            haVar.x(4, true);
        }
        ja jaVar = this.f15400d1;
        if (jaVar != null && (a70Var = jaVar.V0) != null) {
            a70Var.v();
            jaVar.V0 = null;
        }
        ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) new x9(this, 1), 14, false);
        y0Var.setOnDismissListener(new h9(this, 1));
        y0Var.show();
    }

    public final void T(ma maVar, d7 d7Var) {
        int i7;
        boolean z10;
        int i10;
        fi.j6 o4;
        sa saVar;
        if (this.d) {
            return;
        }
        int i11 = this.f15395c;
        if (np.u1(i11).A2()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f15454v0 = true;
        this.f15401e = false;
        this.C2 = false;
        WindowManager windowManager = this.f15405f;
        if (windowManager != null && (saVar = this.f15428n) != null && saVar.getParent() == null) {
            sa saVar2 = this.f15428n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, saVar2, layoutParams);
            windowManager.addView(this.f15428n, layoutParams);
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
        if (d7Var2 != null && d7Var2.f14404u && i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15448t0.f15531g = z10;
        if (this.f15458w0 == 0 && (o4 = np.u1(i11).R1().o()) != null && o4.a(i11, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.I;
        if (maVar != null) {
            this.G = maVar;
            this.K = maVar.f15157a;
            rectF.set(maVar.f15159c);
            this.H = maVar.f15158b;
            this.G.e();
        } else {
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24010q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.f15440r.c();
        int i12 = this.K;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f15415i0.setBackgroundColor(i10);
        this.f15440r.setTranslationX(0.0f);
        this.f15440r.setTranslationY(0.0f);
        this.f15440r.b(0.0f);
        this.f15440r.setScaleX(1.0f);
        this.f15440r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.f15391b);
        d7 d7Var3 = this.L1;
        if (d7Var3 != null) {
            this.f15400d1.setText(d7Var3.C0);
        }
        this.f15397c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new s8(this, 6));
        d();
        this.f15458w0 = 0L;
        this.f15462x0 = "";
    }

    public final void U() {
        sg.u0 u0Var = this.f15463x1;
        if (u0Var != null) {
            u0Var.bringToFront();
        }
        View view = this.f15467y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f15470z1;
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
        gb gbVar = this.f15438q1;
        if (gbVar != null) {
            gbVar.bringToFront();
        }
        de0 de0Var = this.D1;
        if (de0Var != null) {
            de0Var.bringToFront();
        }
        vd0 vd0Var = this.F1;
        if (vd0Var != null) {
            vd0Var.bringToFront();
        }
        xd0 xd0Var = this.G1;
        if (xd0Var != null) {
            xd0Var.bringToFront();
        }
        q5 q5Var = this.f15435p1;
        if (q5Var != null) {
            q5Var.bringToFront();
        }
        p pVar = this.f15442r1;
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
            y51 textureView = this.Y0.getTextureView();
            if (d7Var.K && !d7Var.f14404u && textureView != null) {
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
            v9 v9Var = this.f15459w1;
            if (v9Var != null && v9Var.B0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                v9 v9Var2 = this.f15459w1;
                v9Var2.f14914s0 = true;
                g5 g5Var = v9Var2.B0;
                g5Var.f57772a = true;
                g5Var.draw(canvas);
                v9 v9Var3 = this.f15459w1;
                v9Var3.B0.f57772a = false;
                v9Var3.f14914s0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = d7.w(this.f15395c, "jpg");
            if (z10) {
                d7Var2 = d7Var;
                z11 = z10;
                Utilities.f22776g.c(new ai.e(this, createBitmap, z11, w10, d7Var2, 2));
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
            d7Var2.f14367b1 = createScaledBitmap;
        }
    }

    public final void W() {
        fi.j6 o4;
        int size;
        char c10;
        View[] viewPages;
        v41[] v41VarArr;
        q8 q8Var = this.f15441r0;
        BitmapDrawable bitmapDrawable = null;
        if (q8Var != null) {
            q8Var.dismiss();
            this.f15441r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
        if (z10) {
            u0 u0Var = this.f15407f1;
            u0Var.getClass();
            u0Var.c(hd.O0("VideoConvertFail"));
            q2Var.a();
            o5 o5Var = this.f15397c1.f15177c;
            int i7 = -this.V1;
            this.V1 = i7;
            org.telegram.messenger.g0.E3(i7, o5Var, null);
            return;
        }
        ja jaVar = this.f15400d1;
        if (jaVar != null && jaVar.o()) {
            q2Var.a();
            org.telegram.ui.Components.o6 o6Var = jaVar.f14991w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.E3(i10, o6Var, null);
            jaVar.e();
            return;
        }
        d7 d7Var = this.L1;
        int i11 = this.f15395c;
        if ((d7Var == null || (!d7Var.f14378g && d7Var.J0 == 0)) && (o4 = np.u1(i11).f25831i0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.L1.D0 = np.u1(i11).j5();
        fi.b bVar = this.f15387a;
        char c11 = 1;
        if (jaVar != null && !this.L1.D0) {
            CharSequence text = jaVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((gz0[]) spannable.getSpans(0, text.length(), gz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new lc(this.f15428n, bVar).Q(2131624346, 36, org.telegram.messenger.g0.R2(hd.N0(2131744340, null), org.telegram.ui.ActionBar.m6.Xc, 0, new s8(this, 27), bVar)).k(true);
                    int i12 = -this.V1;
                    this.V1 = i12;
                    org.telegram.messenger.g0.E3(i12, jaVar, null);
                    return;
                }
            }
        }
        d7 d7Var2 = this.L1;
        if (!d7Var2.f14378g && d7Var2.J0 == 0) {
            if (this.O != 0) {
                d7Var2.f14406v0 = np.u1(i11).l1(this.O);
            }
            ha haVar = this.Y0;
            haVar.x(3, true);
            q8 q8Var2 = new q8(this.L1.I0, this.f15391b, bVar);
            q8Var2.X0(this.L1.E0);
            q8Var2.W0(this.L1.f14406v0);
            q8Var2.A1 = this.N;
            q8Var2.P1 = new t8(this, 14);
            q8Var2.M0(!this.B0.j());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            q8Var2.T0(size);
            q8Var2.R0(false);
            CharSequence text2 = jaVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (v41 v41Var : (v41[]) ((Spanned) text2).getSpans(0, text2.length(), v41.class)) {
                    if (v41Var != null) {
                        try {
                            TLRPC.User c22 = np.u1(i11).c2(Long.valueOf(Long.parseLong(v41Var.getURL())));
                            if (c22 != null && !p10.C(c22) && p10.o(c22) != null && !arrayList2.contains(c22)) {
                                arrayList2.add(p10.o(c22));
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
                            TLObject h22 = np.u1(i11).h2(charSequence);
                            if (h22 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) h22;
                                if (!user.bot && !p10.C(user) && user.f28547id != 777000 && !p10.A(user) && !arrayList2.contains(charSequence)) {
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
                    TLObject h23 = np.u1(i11).h2(charSequence2);
                    if (h23 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) h23;
                        if (!user2.bot && !p10.C(user2) && user2.f28547id != 777000 && !p10.A(user2) && !arrayList2.contains(charSequence2)) {
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
            this.f15441r0 = q8Var2;
            d7 d7Var3 = this.L1;
            if (d7Var3.K) {
                if (haVar != null && !d7Var3.f14377f0 && this.f15409g0 != 2) {
                    d7Var3.f14374e0 = haVar.getCurrentPosition();
                    y10 t8Var = new t8(this, 17);
                    View view = this.f15463x1;
                    View view2 = this.A1;
                    View[] viewArr = new View[3];
                    viewArr[0] = haVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    haVar.h(t8Var, viewArr);
                }
                q8 q8Var3 = this.f15441r0;
                Bitmap bitmap = this.L1.f14379g0;
                s8 s8Var = new s8(this, 20);
                if (bitmap != null) {
                    q8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                q8Var3.W1 = bitmapDrawable;
                q8Var3.X1 = s8Var;
                h1 h1Var = q8Var3.f15242m1;
                if (h1Var != null) {
                    for (View view3 : h1Var.getViewPages()) {
                        if (view3 instanceof l8) {
                            l8 l8Var = (l8) view3;
                            l8Var.h(false);
                            l8Var.f(false);
                        }
                    }
                }
            }
            this.f15441r0.setOnDismissListener(new h9(this, 0));
            this.f15441r0.show();
            return;
        }
        d7Var2.f14387l = false;
        h(null);
        o0();
    }

    public final void X(oa oaVar) {
        int i7 = 0;
        RectF rectF = this.I;
        if (oaVar != null) {
            this.G = oaVar;
            this.K = oaVar.f15157a;
            rectF.set(oaVar.f15159c);
            this.H = oaVar.f15158b;
        } else {
            this.G = null;
            this.K = 0;
            Point point = org.telegram.messenger.g0.f24010q;
            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.K;
        if (i10 != 1 && i10 != 0) {
            i7 = -14737633;
        }
        this.f15415i0.setBackgroundColor(i7);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f15464x2 || z10) {
            this.f15450t2 = false;
            Activity activity = this.f15391b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f15450t2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(2131232767).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    oq oqVar = new oq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    oqVar.f38303e = L;
                    oqVar.f38304f = L2;
                    this.B0.setCameraThumb(oqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.f15387a);
                        int i7 = org.telegram.ui.ActionBar.m6.L5;
                        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.m6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.N0(2131747114, null));
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.U = W2;
                        alertDialog$Builder.k(hd.N0(2131747106, null), new b9(this, 12));
                        alertDialog$Builder.h(hd.N0(2131751760, null), null);
                        t1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f15464x2 = true;
                }
            }
            if (!this.f15450t2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new s8(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        w9 w9Var = this.C0;
        if (w9Var != null && w9Var.getTextureView() != null) {
            try {
                Utilities.f22777i.c(new di.a8(this, this.C0.getTextureView().getBitmap(), runnable, 20));
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
            animate.alpha(f10).setUpdateListener(new u9(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(nr.h).start();
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
            this.f15405f.updateViewLayout(this.f15428n, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        ls.e().b(this, ls.f25338r2);
        int i7 = this.f15395c;
        ls.f(i7).b(this, ls.B5);
        ls.f(i7).b(this, ls.f25259d3);
    }

    public final void d0(String str) {
        int i7;
        eb ebVar = this.F0;
        ebVar.clearAnimation();
        w9 w9Var = this.C0;
        if ((w9Var != null && w9Var.isDual()) || this.f15394b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(ebVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    ebVar.setContentDescription(hd.N0(2131754915, null));
                    i7 = 2131231752;
                }
            } else {
                str.equals("off");
            }
            ebVar.setContentDescription(hd.N0(2131754914, null));
            i7 = 2131231753;
        } else {
            if (str.equals("on")) {
                ebVar.setContentDescription(hd.N0(2131754913, null));
                i7 = 2131231754;
            }
            ebVar.setContentDescription(hd.N0(2131754914, null));
            i7 = 2131231753;
        }
        if (ebVar.f14555n != i7) {
            ebVar.f14555n = i7;
            ValueAnimator valueAnimator = ebVar.f14556r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ebVar.f14556r = null;
            }
            ebVar.setDrawable(i7);
        }
        if (this.f15409g0 == 0 && !this.J0.f15704e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(ebVar, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.j6 o4;
        d7 d7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i7 == ls.f25338r2) {
            e6 e6Var = this.P0;
            if (e6Var != null) {
                e6Var.h();
            }
            if (this.f15430n2 != null && MediaController.f22683c2 != null) {
                for (int i11 = 0; i11 < MediaController.f22683c2.size(); i11++) {
                    ve veVar = (ve) MediaController.f22683c2.get(i11);
                    int i12 = veVar.f27318a;
                    ve veVar2 = this.f15430n2;
                    if (i12 == veVar2.f27318a && veVar.f27319b == veVar2.f27319b) {
                        this.f15430n2 = veVar;
                        return;
                    }
                }
            }
        } else if (i7 == ls.B5) {
            e6 e6Var2 = this.P0;
            if (e6Var2 != null && !this.W1) {
                e6Var2.h();
            }
        } else if (i7 == ls.f25259d3) {
            int i13 = this.f15409g0;
            int i14 = this.f15395c;
            if (i13 == 1) {
                if (!this.O1 && !this.f15400d1.o()) {
                    fi.p6 R1 = np.u1(i14).R1();
                    int A = A();
                    fi.j6 o10 = R1.o();
                    if (o10 == null || !o10.a(R1.f12377a, A) || ((d7Var = this.L1) != null && (d7Var.f14378g || d7Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f15397c1.setShareEnabled(z10);
            } else if (i13 == 0 && (o4 = np.u1(i14).R1().o()) != null && o4.a(i14, 1)) {
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
        Boolean bool = this.f15439q2;
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
                this.f15443r2 = new c9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f15433o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f15433o2 = null;
            }
            r1.g gVar = this.f15436p2;
            if (gVar != null) {
                gVar.d();
                this.f15436p2 = null;
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
            la laVar = this.f15440r;
            if (laVar != null) {
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                laVar.setImportantForAccessibility(i7);
            }
            g3 g3Var2 = this.N0;
            if (z10) {
                i10 = 0;
            }
            g3Var2.setImportantForAccessibility(i10);
            this.f15439q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            sa saVar = this.f15428n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (saVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.f24005n * 2.5f);
            }
            Math.max(1, saVar.getHeight());
            g3 g3Var3 = this.N0;
            g3Var3.L = !z10;
            if (this.f15423k2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f15425l2 = z11;
            if (z10) {
                r1.g gVar2 = new r1.g(g3Var3, r1.g.f56317p, height);
                this.f15436p2 = gVar2;
                gVar2.f56333m.a(0.75f);
                this.f15436p2.f56333m.b(350.0f);
                this.f15436p2.a(new d9(this, height, 0));
                this.f15436p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f15433o2 = ofFloat;
                ofFloat.addUpdateListener(new e9(this, 0));
                this.f15433o2.addListener(new t9(this, 1));
                this.f15433o2.setDuration(450L);
                this.f15433o2.setInterpolator(nr.h);
                this.f15433o2.start();
            }
            if (!z10 && !this.T1) {
                this.f15427m2 = null;
            }
            if (!z10 && this.f15409g0 == 0 && !this.f15450t2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f15410g1 == null) {
            oh0 oh0Var = new oh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f15410g1 = oh0Var;
            oh0Var.G *= 1.5f;
        }
        this.f15413h1.setAnimation(this.f15410g1);
        int i7 = 20;
        if (!z11) {
            oh0 oh0Var2 = this.f15410g1;
            if (!z10) {
                i7 = 0;
            }
            oh0Var2.N(i7, false, false);
        } else if (z10) {
            oh0 oh0Var3 = this.f15410g1;
            if (oh0Var3.f38175b0 > 20) {
                oh0Var3.N(0, false, false);
            }
            this.f15410g1.P(20);
            this.f15410g1.start();
        } else {
            oh0 oh0Var4 = this.f15410g1;
            int i10 = oh0Var4.f38175b0;
            if (i10 != 0 && i10 < 43) {
                oh0Var4.P(43);
                this.f15410g1.start();
            }
        }
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        la laVar = this.f15440r;
        if (z10) {
            this.Q.d();
            ls.e().k(ls.f25293j1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new e9(this, 5));
            this.F.addListener(new di.j6(this, f10, runnable, 3));
            if (f10 < 1.0f && this.f15457w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(nr.h);
            } else if (f10 <= 0.0f && laVar.f14955a >= org.telegram.messenger.g0.L(20.0f)) {
                if (f10 < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(nr.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(nr.h);
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
        laVar.invalidate();
        this.f15428n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f15428n.findOnBackInvokedDispatcher()) == null) {
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
            l3 l3Var = this.f15426m1;
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
        if (this.f15394b2 == z10 && this.f15398c2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.f15390a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f15390a2 = null;
        }
        this.f15394b2 = z10;
        this.f15398c2 = H();
        if (z10 && (yVar = this.J0) != null && yVar.f15704e) {
            yVar.a(false, z11);
        }
        l0(z11);
        n9 n9Var = this.R0;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f15390a2 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f15409g0 == 0 && !H()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f15409g0 == 0 && !H()) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i3Var2, property2, L3);
            if (z10 || this.f15409g0 != 0 || !H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i3Var, property, f12);
            if (!z10 && this.f15409g0 == 0 && H()) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i3Var, property2, L4);
            if (z10 || this.f15409g0 != 0 || H()) {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(n9Var, property, f13);
            if (z10 || this.f15409g0 != 0 || H()) {
                f14 = org.telegram.messenger.g0.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(n9Var, property2, f14));
            this.f15390a2.setDuration(260L);
            this.f15390a2.setInterpolator(nr.h);
            this.f15390a2.start();
            return;
        }
        if (z10 && this.f15409g0 == 0 && !H()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        i3Var2.setAlpha(f10);
        if (z10 && this.f15409g0 == 0 && !H()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        i3Var2.setTranslationY(L);
        if (z10 || this.f15409g0 != 0 || !H()) {
            f12 = 0.0f;
        }
        i3Var.setAlpha(f12);
        if (!z10 && this.f15409g0 == 0 && H()) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(16.0f);
        }
        i3Var.setTranslationY(L2);
        if (z10 || this.f15409g0 != 0 || H()) {
            f13 = 0.0f;
        }
        n9Var.setAlpha(f13);
        if (z10 || this.f15409g0 != 0 || H()) {
            f14 = org.telegram.messenger.g0.L(16.0f);
        }
        n9Var.setTranslationY(f14);
    }

    public final void g0(fi.j6 j6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        ug.k0 k0Var = new ug.k0(j6Var.b(), this.f15395c, this.f15391b, new x9(this, 0), null);
        k0Var.T1 = A();
        k0Var.setOnDismissListener(new n70(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        k0Var.show();
    }

    public final void h(Runnable runnable) {
        d7 d7Var;
        Runnable runnable2;
        ha haVar;
        float f10;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        ee0 ee0Var = this.C1;
        if (ee0Var != null && (d7Var = this.L1) != null) {
            d7Var.f14383j = ee0Var.a() | d7Var.f14383j;
            d7 d7Var2 = this.L1;
            ee0 ee0Var2 = this.C1;
            File file = d7Var2.Z0;
            if (file != null) {
                file.delete();
                d7Var2.Z0 = null;
            }
            gf savedFilterState = ee0Var2.getSavedFilterState();
            d7Var2.f14364a1 = savedFilterState;
            if (!d7Var2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = ee0Var2.getBitmap();
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
                        matrix.postScale(f10, f11, d7Var2.f14386k0 / 2.0f, d7Var2.f14388l0 / 2.0f);
                        matrix.postRotate(-d7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        d7Var2.f14391n0.preScale(d7Var2.f14386k0 / createBitmap.getWidth(), d7Var2.f14388l0 / createBitmap.getHeight());
                        d7Var2.f14386k0 = createBitmap.getWidth();
                        d7Var2.f14388l0 = createBitmap.getHeight();
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
                        int i10 = d7Var2.f14362a;
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
                            Utilities.f22777i.c(new aa.c0(d7Var2, createBitmap, z10, runnable2, 4));
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
                if (!d7Var3.K && (haVar = this.Y0) != null) {
                    haVar.set(d7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f15404e2 != z10) {
            this.f15404e2 = z10;
            float f10 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.K0.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(nr.h).withEndAction(new c9(this, z10, 1)).start();
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
        if (this.L1 != null && this.E1 != null && this.f15415i0.getMeasuredWidth() > 0 && this.f15415i0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i7 = this.L1.Q;
            if (i7 != 0) {
                matrix.postRotate(-i7, this.f15415i0.getMeasuredWidth() / 2.0f, this.f15415i0.getMeasuredHeight() / 2.0f);
                if ((this.L1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f15415i0.getMeasuredWidth() / this.f15415i0.getMeasuredHeight(), this.f15415i0.getMeasuredHeight() / this.f15415i0.getMeasuredWidth(), this.f15415i0.getMeasuredWidth() / 2.0f, this.f15415i0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f15415i0.getMeasuredWidth()) * this.L1.f14386k0, (1.0f / this.f15415i0.getMeasuredHeight()) * this.L1.f14388l0);
            matrix.postConcat(this.L1.f14391n0);
            matrix.postScale(this.f15415i0.getMeasuredWidth() / this.L1.f14382i0, this.f15415i0.getMeasuredHeight() / this.L1.f14384j0);
            this.E1.setTransform(matrix);
            this.E1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f10;
        f81 f81Var = this.W0;
        if ((f81Var.getTag() != null && z10) || (f81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f15408f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                s8 s8Var = new s8(this, 25);
                this.f15408f2 = s8Var;
                org.telegram.messenger.g0.h3(s8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f15411g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        f81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f15411g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            f81Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f15411g2;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(f81Var, property, f10));
        this.f15411g2.addListener(new bi.j7(14, this, z10));
        this.f15411g2.start();
        if (z10) {
            s8 s8Var2 = new s8(this, 26);
            this.f15408f2 = s8Var2;
            org.telegram.messenger.g0.h3(s8Var2, 2000L);
        }
    }

    public final void j() {
        fi.c3 c3Var;
        if (this.K == 1) {
            RectF rectF = this.f15402e0;
            rectF.set(this.f15415i0.getLeft(), this.f15415i0.getTop(), this.f15415i0.getMeasuredWidth(), this.f15415i0.getMeasuredHeight());
            rectF.offset(this.f15440r.getX(), this.f15440r.getY());
            float f10 = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.f15399d0;
            org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
            this.f15415i0.setAlpha(this.J);
            float f11 = rectF3.left;
            fa faVar = this.f15415i0;
            faVar.setTranslationX((f11 - faVar.getLeft()) - this.f15440r.getX());
            float f12 = rectF3.top;
            fa faVar2 = this.f15415i0;
            faVar2.setTranslationY((f12 - faVar2.getTop()) - this.f15440r.getY());
            oa oaVar = this.G;
            if (oaVar != null && (c3Var = oaVar.f15161f) != null) {
                c3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f15161f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            this.f15415i0.setScaleX(rectF3.width() / this.f15415i0.getMeasuredWidth());
            this.f15415i0.setScaleY(rectF3.height() / this.f15415i0.getMeasuredHeight());
            this.f15418j0.setAlpha(this.J);
            this.f15424l0.setAlpha(this.J);
            this.m0.setAlpha(this.J);
            if (this.f15409g0 == 2) {
                this.f15455v1.setAlpha(this.J);
            }
        }
    }

    public final void j0() {
        q8 q8Var = this.f15441r0;
        if (q8Var != null) {
            q8Var.dismiss();
            this.f15441r0 = null;
        }
        q8 q8Var2 = new q8(86400, this.f15391b, this.f15387a);
        q8Var2.V0();
        q8Var2.X0(this.f15469z0);
        TLRPC.InputPeer inputPeer = this.f15466y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = np.u1(this.f15395c).l1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        q8Var2.W0(inputPeer);
        q8Var2.A1 = this.N;
        q8Var2.P1 = new t8(this, 18);
        q8Var2.M0(false);
        q8Var2.T0(1);
        q8Var2.R0(false);
        q8Var2.R1 = new t8(this, 19);
        q8Var2.O1 = new b9(this, 11);
        this.f15441r0 = q8Var2;
        q8Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: hi.ta.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.ta.k0(int, boolean, boolean):void");
    }

    public final void l() {
        d7 d7Var;
        boolean z10;
        if (this.f15459w1 != null && (d7Var = this.L1) != null && d7Var.f14404u) {
            File file = d7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.W0 = null;
            }
            this.L1.W0 = d7.w(this.f15395c, "webp");
            v9 v9Var = this.f15459w1;
            d7 d7Var2 = this.L1;
            ArrayList arrayList = d7Var2.T0;
            if (this.P1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap q02 = v9Var.q0(arrayList, false, false, true, z10, d7Var2);
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
        w9 w9Var;
        boolean z17 = false;
        if (this.f15409g0 == 0 && this.P1 == 1 && !this.J0.f15704e && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0(z11, z10);
        this.H0.setSelected(this.B0.j());
        y yVar = this.J0;
        if (yVar != null && yVar.f15704e) {
            z12 = false;
        } else {
            z12 = true;
        }
        b0(this.f15431o0, z12, z10);
        if (!this.f15394b2 && this.P1 != -1 && this.f15409g0 == 0 && this.Z1 != null && !this.J0.f15704e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.F0, z13, z10);
        if (!this.f15394b2 && this.P1 != -1 && this.f15409g0 == 0 && (w9Var = this.C0) != null && w9Var.f14252a && !this.J0.f15704e && !this.B0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.G0, z14, z10);
        if (!this.f15394b2 && this.P1 != -1 && this.f15409g0 == 0 && !this.J0.f15704e) {
            z15 = true;
        } else {
            z15 = false;
        }
        b0(this.H0, z15, z10);
        b0(this.I0, this.J0.f15704e, z10);
        if (this.B0.j()) {
            f10 = this.B0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.P0.e(z10, f10);
        boolean z18 = this.J0.f15704e;
        l3 l3Var = this.f15432o1;
        if (z18) {
            l3Var.x();
        } else {
            l3Var.f(true);
        }
        g(this.f15394b2, z10);
        if (this.P1 == -1 && this.f15409g0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        org.telegram.messenger.g0.T3(this.T0, z16, true);
        if (this.P1 == -1 && this.f15409g0 == 0) {
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
        this.f15431o0.setTranslationX(0.0f);
        float alpha5 = this.f15431o0.getAlpha();
        float L = (alpha4 * org.telegram.messenger.g0.L(46.0f)) + alpha3 + org.telegram.messenger.g0.L(8.0f);
        v vVar = this.J0.f15701a;
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
        bg.v0 v0Var = this.E;
        if (v0Var != null) {
            v0Var.b(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        int i7;
        oh0 oh0Var = this.f15416i1;
        if (oh0Var != null) {
            int[] iArr = oh0Var.f38179e;
            int i10 = 0;
            if (z10) {
                d7 d7Var = this.L1;
                if (d7Var != null && d7Var.f14412y0) {
                    i10 = iArr[0];
                }
                oh0Var.P(i10);
                oh0 oh0Var2 = this.f15416i1;
                if (oh0Var2 != null) {
                    oh0Var2.start();
                    return;
                }
                return;
            }
            d7 d7Var2 = this.L1;
            if (d7Var2 != null && d7Var2.f14412y0) {
                i7 = iArr[0] - 1;
            } else {
                i7 = 0;
            }
            oh0Var.N(i7, false, true);
            this.f15416i1.P(i7);
            ImageView imageView = this.f15419j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f15453u2 < 0) {
            this.f15453u2 = np.g1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f15456v2 = arrayList;
            arrayList.add("off");
            this.f15456v2.add("auto");
            this.f15456v2.add("on");
            float f10 = np.g1().getFloat("frontflash_warmth", 0.9f);
            n2 n2Var = this.f15444s;
            n2Var.f15061o = f10;
            n2Var.f15060n = n2.f(f10);
            n2Var.g();
            float f11 = np.g1().getFloat("frontflash_intensity", 1.0f);
            n2 n2Var2 = this.f15444s;
            n2Var2.f15062p = f11;
            n2Var2.i();
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        s8 s8Var = new s8(this, 2);
        v9 v9Var = this.f15459w1;
        d7 d7Var = this.L1;
        if (v9Var != null && d7Var != null) {
            d7Var.f();
            boolean r02 = v9Var.r0();
            boolean z10 = v9Var.f14926y0.getPainting().E;
            Utilities.f22776g.c(new v8(this, v9Var, d7Var.f14382i0, d7Var.f14384j0, d7Var, z10, r02, s8Var, 1));
            return;
        }
        s8Var.run();
    }

    public final void p(boolean z10) {
        ha haVar;
        if (this.d) {
            q8 q8Var = this.f15441r0;
            if (q8Var != null) {
                q8Var.dismiss();
                this.f15441r0 = null;
            }
            d7 d7Var = this.L1;
            long j3 = 0;
            if (d7Var != null && !d7Var.h) {
                if ((this.f15457w && d7Var.f14378g) || d7Var.f14365b != 0) {
                    d7Var.f14383j = false;
                }
                d7Var.i(false);
            }
            this.L1 = null;
            v10 v10Var = this.S;
            if (v10Var != null && (haVar = this.Y0) != null) {
                if (this.f15401e) {
                    return;
                }
                this.f15401e = true;
                i61 i61Var = haVar.E;
                if (i61Var != null) {
                    i61Var.g0();
                    haVar.E.m0();
                    haVar.E = null;
                }
                i61 i61Var2 = haVar.f15627y;
                if (i61Var2 != null) {
                    j3 = i61Var2.S();
                    haVar.f15627y.g0();
                    haVar.f15627y.m0();
                    haVar.f15627y = null;
                }
                i61 i61Var3 = haVar.f15601e;
                if (i61Var3 != null) {
                    j3 = i61Var3.S();
                    haVar.f15601e.g0();
                    haVar.f15601e.m0();
                    haVar.f15601e = null;
                }
                v10Var.a(Long.valueOf(j3), new c9(this, z10, 2), Boolean.valueOf(this.f15457w), Long.valueOf(this.f15461x));
                return;
            }
            ha haVar2 = this.Y0;
            if (haVar2 != null && !z10) {
                haVar2.set(null);
            }
            f(0.0f, z10, new s8(this, 23));
            int i7 = this.K;
            if (i7 == 1 || i7 == 0) {
                this.f15428n.setBackgroundColor(0);
                this.f15397c1.b(false, true);
            }
            ls.e().n(this, ls.f25338r2);
            int i10 = this.f15395c;
            ls.f(i10).n(this, ls.B5);
            ls.f(i10).n(this, ls.f25259d3);
        }
    }

    public final boolean p0() {
        w9 w9Var;
        if ((this.Q1 || this.R1) && (w9Var = this.C0) != null && w9Var.isFrontface()) {
            int i7 = this.f15453u2;
            if (i7 == 2 || (i7 == 1 && this.d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f15391b;
        if (this.C0 == null && activity != null) {
            this.C0 = new w9(this, activity, np.g1().getBoolean("stories_camera", false));
            e6 e6Var = this.P0;
            float f10 = 0.0f;
            if (e6Var != null) {
                e6Var.f14522h0 = 0.0f;
                e6Var.f14523i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.j();
            this.C0.setThumbDrawable(z());
            this.C0.initTexture();
            this.C0.setDelegate(new b9(this, 0));
            fb fbVar = this.G0;
            if (this.C0.f14252a && this.f15409g0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(fbVar, z10, true);
            z zVar = this.H0;
            if (!this.C0.f14252a) {
                f10 = org.telegram.messenger.g0.L(46.0f);
            }
            zVar.setTranslationX(f10);
            this.B0.setCameraView(this.C0);
            if (np.g1().getInt("storyhint2", 0) < 1) {
                this.X0.x();
                np.g1().edit().putInt("storyhint2", np.g1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!c1.q(this.C0.getContext()) || !np.g1().getBoolean("dualcam", c1.p(org.telegram.messenger.t0.f26895b, false))) && this.C0.f14252a && np.g1().getInt("storydualhint", 0) < 2) {
                this.f15426m1.x();
            }
            if (this.D0 == null) {
                this.D0 = new a6(activity, new t8(this, 3));
            }
            this.D0.a(this.C0);
            o6 o6Var = this.E0;
            if (o6Var != null) {
                ga gaVar = this.B0;
                Object blurRenderNode = gaVar.getBlurRenderNode();
                o6Var.G = gaVar;
                o6Var.H = blurRenderNode;
                o6Var.invalidate();
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
                    Point point = org.telegram.messenger.g0.f24010q;
                    q10 = d7.q(b9Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                y51 textureView = this.Y0.getTextureView();
                int orientation = this.Y0.getOrientation();
                d7 d7Var2 = this.L1;
                if (d7Var2 != null) {
                    gfVar = d7Var2.f14364a1;
                }
                ee0 ee0Var = new ee0(this.f15391b, textureView, bitmap, null, orientation, gfVar, null, 0, false, false, this.f15445s0, this.f15387a);
                this.C1 = ee0Var;
                this.f15440r.addView(ee0Var);
                de0 de0Var = this.D1;
                if (de0Var != null) {
                    de0Var.setFilterView(this.C1);
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
                vd0 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                if (blurControl != null) {
                    this.f15415i0.addView(blurControl);
                }
                xd0 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    this.f15415i0.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new u8(this, 13));
                this.C1.getCancelTextView().setOnClickListener(new u8(this, 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
                this.C1.f34747j0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.N0 != null) {
            ga gaVar = this.B0;
            if (gaVar != null && gaVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.N0.Q) {
                return;
            }
        }
        if (this.f15391b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        ve veVar = this.f15430n2;
        boolean z13 = !z10;
        ga gaVar2 = this.B0;
        if (gaVar2 != null && gaVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        g3 g3Var = new g3(this, this.f15395c, this.f15391b, this.f15387a, veVar, z10, z13, z11);
        this.N0 = g3Var;
        g3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, t.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new l9(this, 1));
        this.N0.setOnSelectListener(new k9(this, z10, 0));
        this.N0.setOnSelectMultipleListener(new di.q1(this, 2));
        v4.a0 a0Var = this.f15427m2;
        if (a0Var != null) {
            gi.g gVar = this.N0.f14340e;
            gVar.B = a0Var;
            gVar.l0();
        }
        this.f15428n.addView(this.N0, c8.na.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: hi.ta.t():void");
    }

    public final void u(boolean z10) {
        a6 a6Var = this.D0;
        if (a6Var != null) {
            a6Var.f14189f = null;
            Utilities.f22774e.a(a6Var.h);
            this.D0 = null;
            ga gaVar = this.B0;
            if (gaVar != null) {
                gaVar.f14563c.a(null);
            }
        }
        o6 o6Var = this.E0;
        if (o6Var != null) {
            o6Var.G = null;
            o6Var.H = null;
            o6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new s8(this, 8));
                return;
            }
            a0(new s8(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            ga gaVar2 = this.B0;
            if (gaVar2 != null) {
                gaVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void v() {
        g3 g3Var = this.N0;
        if (g3Var == null) {
            return;
        }
        this.f15428n.removeView(g3Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.f15433o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15433o2 = null;
        }
        r1.g gVar = this.f15436p2;
        if (gVar != null) {
            gVar.d();
            this.f15436p2 = null;
        }
        this.f15439q2 = null;
    }

    public final void x() {
        ee0 ee0Var = this.C1;
        if (ee0Var == null) {
            return;
        }
        ee0Var.b();
        this.D1.setFilterView(null);
        this.f15440r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.f15415i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        vd0 vd0Var = this.F1;
        if (vd0Var != null) {
            this.f15415i0.removeView(vd0Var);
            this.F1 = null;
        }
        xd0 xd0Var = this.G1;
        if (xd0Var != null) {
            this.f15415i0.removeView(xd0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        v9 v9Var = this.f15459w1;
        if (v9Var != null) {
            v9Var.B0.removeAllViews();
            v9 v9Var2 = this.f15459w1;
            v9Var2.f14926y0.h();
            v9Var2.B0.setVisibility(8);
            v9Var2.A0.setVisibility(8);
            v9Var2.f14906o0.postRunnable(new ai.i(17));
            z4 z4Var = v9Var2.U1;
            if (z4Var != null) {
                z4Var.dismiss();
            }
            sg.q qVar = v9Var2.D1;
            if (qVar != null) {
                qVar.dismiss();
            }
            this.f15440r.removeView(this.f15459w1);
            this.f15459w1 = null;
            sg.u0 u0Var = this.f15463x1;
            if (u0Var != null) {
                this.f15415i0.removeView(u0Var);
                this.f15463x1 = null;
            }
            View view = this.f15470z1;
            if (view != null) {
                this.f15415i0.removeView(view);
                this.f15470z1 = null;
            }
            View view2 = this.f15467y1;
            if (view2 != null) {
                this.f15415i0.removeView(view2);
                this.f15467y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                this.f15415i0.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                this.f15415i0.removeView(view4);
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
        return this.f15391b.getResources().getDrawable(2131231492);
    }
}
