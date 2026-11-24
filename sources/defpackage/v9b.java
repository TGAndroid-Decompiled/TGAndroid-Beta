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
public final class v9b implements jm7 {
    public static v9b G2;
    public sl2 A0;
    public View A1;
    public boolean A2;
    public final j9b B0;
    public View B1;
    public boolean B2;
    public a9b C0;
    public n78 C1;
    public boolean C2;
    public ex8 D0;
    public final m78 D1;
    public f9b D2;
    public final a26 E;
    public final ms9 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final nrb F0;
    public e78 F1;
    public ValueAnimator F2;
    public q9b G;
    public final orb G0;
    public g78 G1;
    public float H;
    public final xl2 H0;
    public File H1;
    public final RectF I;
    public final nrb I0;
    public ArrayList I1;
    public float J;
    public final wl2 J0;
    public ArrayList J1;
    public boolean K;
    public final uec K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public g6b L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public wt4 N0;
    public long N1;
    public long O;
    public or3 O0;
    public boolean O1;
    public boolean P;
    public final j49 P0;
    public int P1;
    public final po Q;
    public final b61 Q0;
    public boolean Q1;
    public Runnable R;
    public final s8b R0;
    public boolean R1;
    public nac S;
    public final pk4 S0;
    public boolean S1;
    public int T;
    public final pk4 T0;
    public boolean T1;
    public int U;
    public final eg5 U0;
    public float U1;
    public int V;
    public final eg5 V0;
    public int V1;
    public boolean W;
    public final b1d W0;
    public boolean W1;
    public boolean X;
    public final hg5 X0;
    public boolean X1;
    public boolean Y;
    public final k9b Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final r63 a;
    public int a0;
    public final lqb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final lec b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final yk8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final l9b d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final r8b e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final yq3 f1;
    public Runnable f2;
    public byte g0;
    public p09 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final s09 h1;
    public b7b h2;
    public final i9b i0;
    public p09 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final a91 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final hg5 l1;
    public boolean l2;
    public final ne6 m0;
    public final hg5 m1;
    public t46 m2;
    public final u9b n;
    public final FrameLayout n0;
    public final hg5 n1;
    public yn6 n2;
    public final pk4 o0;
    public final hg5 o1;
    public ValueAnimator o2;
    public final q0a p0;
    public final zk8 p1;
    public zna p2;
    public final lka q0;
    public final k3c q1;
    public Boolean q2;
    public final n9b r;
    public a8b r0;
    public wc1 r1;
    public n8b r2;
    public final rk4 s;
    public final sm0 s0;
    public g9b s1;
    public AnimatorSet s2;
    public final n10 t0;
    public h9b t1;
    public boolean t2;
    public final xd9 u0;
    public final lqb u1;
    public int u2;
    public boolean v0;
    public final b61 v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public z8b w1;
    public r9b w2;
    public long x;
    public String x0;
    public e99 x1;
    public boolean x2;
    public m9b y;
    public TLRPC.InputPeer y0;
    public View y1;
    public f8b y2;
    public y7b z0;
    public View z1;
    public bm3 z2;

    public v9b(Activity activity, int i) {
        int i2;
        int i3;
        int i4;
        float f;
        boolean z;
        float f2;
        r63 r63Var = new r63();
        this.a = r63Var;
        this.x = 0L;
        this.I = new RectF();
        this.N = true;
        this.Q = new po(null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        this.g0 = (byte) 0;
        this.h0 = -1;
        this.z0 = new y7b();
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
        v8b v8bVar = new v8b(this);
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
        gm.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        u9b u9bVar = new u9b(this, activity);
        this.n = u9bVar;
        m8b m8bVar = new m8b(this, (byte) 1);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(u9bVar, m8bVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        rk4 rk4Var = new rk4(activity, windowManager, this.n, layoutParams);
        this.s = rk4Var;
        rk4Var.a(new d9b(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        u9b u9bVar2 = this.n;
        n9b n9bVar = new n9b(this, activity);
        this.r = n9bVar;
        u9bVar2.addView(n9bVar);
        n9b n9bVar2 = this.r;
        i9b i9bVar = new i9b(this, activity);
        this.i0 = i9bVar;
        n9bVar2.addView(i9bVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new sm0(this.i0);
        this.t0 = new Object();
        n9b n9bVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        n9bVar3.addView(frameLayout);
        n9b n9bVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        n9bVar4.addView(frameLayout2);
        n9b n9bVar5 = this.r;
        ne6 ne6Var = new ne6((byte) 29, activity, this);
        this.m0 = ne6Var;
        n9bVar5.addView(ne6Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        n9b n9bVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        n9bVar6.addView(frameLayout3);
        u31.a(this.n, new oz((byte) 15));
        j9b j9bVar = new j9b(this, activity, this.s0, this.r, r63Var);
        this.B0 = j9bVar;
        u9b u9bVar3 = this.n;
        Objects.requireNonNull(u9bVar3);
        j9bVar.setCancelGestures(new nsa(u9bVar3, (byte) 24));
        this.B0.setResetState(new f8b(this, (byte) 13));
        this.i0.addView(this.B0, qoe.e(-1, -1, 119));
        this.B0.setOnClickListener(new h8b(this, (byte) 12));
        i9b i9bVar2 = this.i0;
        boolean z2 = this.K;
        if (!z2 && z2) {
            i2 = -14737633;
        } else {
            i2 = 0;
        }
        i9bVar2.setBackgroundColor(i2);
        i9b i9bVar3 = this.i0;
        xj xjVar = agc.a;
        i9bVar3.setOutlineProvider(new yfc(0, gm.L(12.0f)));
        this.i0.setClipToOutline(true);
        f8b f8bVar = new f8b(this, (byte) 14);
        ?? view = new View(activity);
        view.a = new TextPaint(1);
        view.b = new TextPaint(1);
        d53 d53Var = d53.h;
        view.s = new ln((View) view, 0L, 350L, d53Var);
        view.J = new kl7(view, (byte) 28);
        view.y = f8bVar;
        this.D1 = view;
        k9b k9bVar = new k9b(this, activity, this.s0, this.t0);
        this.Y0 = k9bVar;
        k9bVar.setCollageView(this.B0);
        k9b k9bVar2 = this.Y0;
        k9bVar2.w = new f8b(this, (byte) 15);
        k9bVar2.setOnTapListener(new f8b(this, (byte) 16));
        this.Y0.setVisibility(8);
        k9b k9bVar3 = this.Y0;
        k9bVar3.O = new f8b(this, (byte) 17);
        this.i0.addView(k9bVar3, qoe.e(-1, -1, 119));
        this.i0.addView(this.D1, qoe.e(-1, -1, 119));
        u9b u9bVar4 = this.n;
        l9b l9bVar = new l9b(this, activity, u9bVar4, u9bVar4, this.r, r63Var, this.s0);
        this.d1 = l9bVar;
        l9bVar.setAccount(i);
        this.d1.setUiBlurBitmap(new c1b((byte) 3));
        u31.a(this.m0, new s20(this, (byte) 20));
        this.d1.setOnHeightUpdate(new g8b(this, (byte) 14));
        this.d1.setOnPeriodUpdate(new g8b(this, (byte) 5));
        long j = this.O;
        if (j != 0) {
            this.d1.setDialogId(j);
        }
        this.d1.setOnPremiumHint(new g8b(this, (byte) 6));
        this.d1.setOnKeyboardOpen(new g8b(this, (byte) 7));
        xd9 xd9Var = new xd9((byte) 12, activity, this);
        this.u0 = xd9Var;
        this.r.addView(xd9Var);
        lqb lqbVar = new lqb(activity, this.r, this.i0, r63Var, this.s0);
        this.a1 = lqbVar;
        lqbVar.setOnTimelineClick(new f8b(this, (byte) 10));
        this.a1.setOnHeightChange(new f8b(this, (byte) 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        frameLayout4.addView(this.a1, qoe.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        lec lecVar = new lec(activity);
        this.b1 = lecVar;
        lecVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, qoe.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, qoe.d(-1, 413.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, qoe.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        lqb lqbVar2 = new lqb(activity, this.r, this.i0, r63Var, this.s0);
        this.u1 = lqbVar2;
        lqbVar2.Y0 = true;
        lqbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, qoe.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        r8b r8bVar = new r8b(this, activity, r63Var, this.s0);
        this.e1 = r8bVar;
        r8bVar.setVisibility(8);
        this.m0.addView(this.e1, qoe.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.o0 = imageView;
        imageView.setContentDescription(jb6.M0(2131754878, null));
        pk4 pk4Var = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pk4Var.setScaleType(scaleType);
        this.o0.setImageResource(2131232283);
        pk4 pk4Var2 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        pk4Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(cmb.f0(553648127, 1, -1));
        this.o0.setOnClickListener(new h8b(this, (byte) 1));
        this.j0.addView(this.o0, qoe.e(56, 56, 51));
        this.s.a(this.o0);
        q0a q0aVar = new q0a(activity, i);
        this.p0 = q0aVar;
        q0aVar.a(false, false);
        this.p0.setOnClickListener(new r39(this, activity, (byte) 24));
        this.j0.addView(this.p0, qoe.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        lka lkaVar = new lka(activity);
        this.q0 = lkaVar;
        lkaVar.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(gm.o());
        this.q0.l(jb6.M0(2131746086, null), false);
        this.q0.getPaint().setShadowLayer(gm.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(gm.L(144.0f));
        this.j0.addView(this.q0, qoe.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, qoe.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        g8b g8bVar = new g8b(this, (byte) 8);
        u9b u9bVar5 = this.n;
        ?? imageView2 = new ImageView(activity);
        imageView2.x = true;
        imageView2.y = true;
        imageView2.h = g8bVar;
        imageView2.a = i;
        imageView2.b = u9bVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(cmb.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new sf3(imageView2, (byte) 5));
        imageView2.f = new wi2(gm.L(18.0f), gm.L(2.0f), -1);
        imageView2.d();
        this.f1 = imageView2;
        hg5 hg5Var = new hg5(activity, 1);
        hg5Var.n(1.0f, -71.0f);
        hg5Var.d = 2000L;
        hg5Var.V = false;
        hg5Var.I.r(true, false);
        this.l1 = hg5Var;
        hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        this.j0.addView(this.l1, qoe.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.h1 = imageView3;
        imageView3.setScaleType(scaleType);
        s09 s09Var = this.h1;
        g6b g6bVar = this.L1;
        if (g6bVar != null && g6bVar.Y) {
            i3 = 2131231764;
        } else {
            i3 = 2131231755;
        }
        s09Var.setImageResource(i3);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(cmb.f0(553648127, 1, -1));
        this.h1.setOnClickListener(new h8b(this, (byte) 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        a91 a91Var = new a91(activity);
        this.k1 = a91Var;
        a91Var.setBackground(cmb.f0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new h8b(this, (byte) 3));
        this.k0.addView(this.k1, qoe.r(46, 56, 53));
        this.k0.addView(this.h1, qoe.r(46, 56, 53));
        this.k0.addView(this.f1, qoe.e(46, 56, 53));
        nrb nrbVar = new nrb(activity);
        this.F0 = nrbVar;
        nrbVar.setBackground(cmb.f0(553648127, 1, -1));
        this.F0.setOnClickListener(new h8b(this, (byte) 4));
        this.F0.setOnLongClickListener(new au(this, (byte) 18));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, qoe.e(56, 56, 53));
        orb orbVar = new orb(activity);
        this.G0 = orbVar;
        orbVar.setContentDescription(jb6.M0(2131754886, null));
        this.G0.setOnClickListener(new h8b(this, (byte) 5));
        boolean o = ss3.o(activity);
        orb orbVar2 = this.G0;
        if (o) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        orbVar2.setVisibility(i4);
        orb orbVar3 = this.G0;
        if (o) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        orbVar3.setAlpha(f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, qoe.e(56, 56, 53));
        ?? nrbVar2 = new nrb(activity);
        this.H0 = nrbVar2;
        nrbVar2.setContentDescription(jb6.M0(2131754895, null));
        this.H0.setBackground(cmb.f0(553648127, 1, -1));
        if (this.A0 == null) {
            this.A0 = (sl2) sl2.a().get(6);
        }
        this.H0.setOnClickListener(new h8b(this, (byte) 6));
        this.H0.a(new tl2(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, qoe.e(56, 56, 53));
        nrb nrbVar3 = new nrb(activity);
        this.I0 = nrbVar3;
        nrbVar3.setContentDescription(jb6.M0(2131754894, null));
        this.I0.setBackground(cmb.f0(553648127, 1, -1));
        this.I0.a(new tl2(new sl2("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new h8b(this, (byte) 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, qoe.e(56, 56, 53));
        wl2 wl2Var = new wl2(activity, this.s);
        this.J0 = wl2Var;
        wl2Var.a.w0(6);
        this.J0.setSelected((sl2) null);
        this.J0.setOnLayoutClick(new g8b(this, (byte) 9));
        this.j0.addView(this.J0, qoe.e(-1, 56, 53));
        hg5 hg5Var2 = new hg5(activity, 1);
        hg5Var2.n(1.0f, -20.0f);
        hg5Var2.d = 5000L;
        hg5Var2.j(true);
        hg5Var2.t(jb6.M0(2131744402, null));
        hg5Var2.r0 = new e1b((byte) 1);
        this.m1 = hg5Var2;
        hg5Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        this.j0.addView(this.m1, qoe.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        hg5 hg5Var3 = new hg5(activity, 2);
        hg5Var3.n(0.0f, 28.0f);
        hg5Var3.d = 5000L;
        hg5Var3.p(true);
        this.n1 = hg5Var3;
        this.j0.addView(hg5Var3, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        hg5 hg5Var4 = new hg5(activity, 1);
        hg5Var4.n(1.0f, -20.0f);
        hg5Var4.d = 5000L;
        hg5Var4.t(jb6.M0(2131744390, null));
        this.o1 = hg5Var4;
        hg5Var4.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        this.j0.addView(this.o1, qoe.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.a = paint;
        Paint paint2 = new Paint(1);
        view2.b = paint2;
        view2.e = new ln((View) view2, 0L, 250L, d53Var);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        ho hoVar = new ho(false, true, true);
        view2.c = hoVar;
        hoVar.n(0.3f, 250L, d53Var);
        hoVar.w(gm.L(13.0f));
        hoVar.u(-1);
        hoVar.x(gm.o());
        hoVar.setCallback(view2);
        hoVar.b = 1;
        view2.a(0L, false);
        this.K0 = view2;
        h0(false, false);
        this.j0.addView(this.K0, qoe.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.N(0);
        j49 j49Var = new j49(activity);
        this.P0 = j49Var;
        j49Var.setDelegate(v8bVar);
        j49 j49Var2 = this.P0;
        if (this.P1 == 1) {
            z = true;
        } else {
            z = false;
        }
        j49Var2.o0 = -1.0f;
        j49Var2.p0 = z;
        j49Var2.invalidate();
        this.l0.addView(this.P0, qoe.e(-1, 100, 87));
        this.s.a(this.P0);
        j49 j49Var3 = this.P0;
        if (this.B0.i()) {
            f2 = this.B0.getFilledProgress();
        } else {
            f2 = 0.0f;
        }
        j49Var3.e(true, f2);
        b61 b61Var = new b61(r63Var, activity, true);
        this.Q0 = b61Var;
        b61Var.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(jb6.M0(2131748545, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, qoe.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new h8b(this, (byte) 8));
        hg5 hg5Var5 = new hg5(activity, 3);
        hg5Var5.p(true);
        hg5Var5.t(jb6.M0(2131744400, null));
        hg5Var5.h = gm.L(320.0f);
        hg5Var5.d = 5000L;
        hg5Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = hg5Var5;
        this.l0.addView(hg5Var5, qoe.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        b1d b1dVar = new b1d(activity);
        this.W0 = b1dVar;
        b1dVar.N = false;
        b1dVar.setAlpha(0.0f);
        this.l0.addView(this.W0, qoe.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new m8b(this, (byte) 4));
        b1d b1dVar2 = this.W0;
        this.U1 = 0.0f;
        b1dVar2.b(false, 0.0f);
        ms9 ms9Var = new ms9(activity, i, new f8b(this, (byte) 12));
        this.E0 = ms9Var;
        ms9Var.c = new g8b(this, (byte) 10);
        this.l0.addView(ms9Var, qoe.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        s8b s8bVar = new s8b(this, activity);
        this.R0 = s8bVar;
        s8bVar.setOnSwitchModeListener(new g8b(this, (byte) 11));
        this.R0.setOnSwitchingModeListener(new g8b(this, (byte) 12));
        this.n0.addView(this.R0, qoe.e(-1, 48, 55));
        this.s.a(this.R0);
        ?? imageView4 = new ImageView(activity);
        this.S0 = imageView4;
        imageView4.setContentDescription(jb6.M0(2131754751, null));
        this.S0.setImageResource(2131232784);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(cmb.f0(553648127, 1, -1));
        this.n0.addView(this.S0, qoe.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new h8b(this, (byte) 9));
        ?? imageView5 = new ImageView(activity);
        this.T0 = imageView5;
        imageView5.setContentDescription(jb6.M0(2131748547, null));
        this.T0.setImageResource(2131232785);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(cmb.f0(553648127, 1, -1));
        this.n0.addView(this.T0, qoe.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new h8b(this, (byte) 10));
        eg5 eg5Var = new eg5(activity);
        this.U0 = eg5Var;
        this.n0.addView(eg5Var, qoe.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        eg5 eg5Var2 = new eg5(activity);
        this.V0 = eg5Var2;
        eg5Var2.a.t(jb6.M0(2131744389, null), false, true);
        eg5Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, qoe.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        b61 b61Var2 = new b61(r63Var, activity, true);
        b61Var2.setRoundRadius(24);
        this.v1 = b61Var2;
        b61Var2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(jb6.M0(2131744375, null), false, true);
        this.v1.setOnClickListener(new h8b(this, (byte) 11));
        this.n0.addView(this.v1, qoe.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, qoe.e(-1, -1, 119));
        frameLayout5.a(0, 2131231744, jb6.M0(2131754813, null));
        frameLayout5.a(2, 2131232290, jb6.M0(2131754755, null));
        frameLayout5.a(1, 2131232292, jb6.M0(2131754806, null));
        frameLayout5.a(3, 2131231734, jb6.M0(2131751636, null));
        frameLayout5.a(4, 2131232289, jb6.M0(2131754810, null));
        String M0 = jb6.M0(2131745374, null);
        frameLayout5.d = M0;
        frameLayout5.e = true;
        xk8 xk8Var = new xk8(frameLayout5, activity, M0, true);
        frameLayout5.c = xk8Var;
        xk8Var.setContentDescription(jb6.M0(2131745374, null));
        frameLayout5.addView(frameLayout5.c, qoe.c(-2.0f, -2));
        frameLayout5.e();
        this.c1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.c1.setOnClickListener(new g8b(this, (byte) 13));
        this.n0.addView(this.c1, qoe.e(-1, 52, 23));
        k3c k3cVar = new k3c(activity);
        this.q1 = k3cVar;
        k3cVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, qoe.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        zk8 zk8Var = new zk8(activity, i, r63Var);
        this.p1 = zk8Var;
        this.i0.addView(zk8Var, qoe.e(-1, -1, 119));
        l0(false);
    }

    public static v9b C(Activity activity, int i) {
        v9b v9bVar = G2;
        if (v9bVar != null && (v9bVar.b != activity || v9bVar.c != i)) {
            v9bVar.o(false);
            v9bVar = null;
            G2 = null;
        }
        if (v9bVar == null) {
            v9b v9bVar2 = new v9b(activity, i);
            G2 = v9bVar2;
            return v9bVar2;
        }
        return v9bVar;
    }

    public static SpannableString k(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable d = b10.d(context, 2131232782);
        int L = gm.L(35.0f);
        int i = -L;
        d.setBounds(i / 4, i, (L / 4) * 3, 0);
        spannableString.setSpan(new e9b(d, d), 0, 1, 33);
        return spannableString;
    }

    public static void v() {
        v9b v9bVar = G2;
        if (v9bVar != null) {
            v9bVar.o(false);
        }
        G2 = null;
    }

    public final String A() {
        a9b a9bVar = this.C0;
        if (a9bVar != null && a9bVar.getCameraSession() != null) {
            if (this.C0.isFrontface() && !this.C0.getCameraSession().hasFlashModes()) {
                m();
                return (String) this.v2.get(this.u2);
            }
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final or3 B() {
        if (this.O0 == null) {
            or3 or3Var = new or3(this.b);
            this.O0 = or3Var;
            this.l0.addView(or3Var, qoe.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String D() {
        int i;
        a9b a9bVar = this.C0;
        if (a9bVar != null && a9bVar.getCameraSession() != null) {
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
            p09 p09Var = new p09(2131624235, gm.L(28.0f), gm.L(28.0f), true, null);
            this.i1 = p09Var;
            p09Var.h = true;
            g6b g6bVar = this.L1;
            if (g6bVar != null && g6bVar.y0) {
                p09Var.H(35);
                this.i1.K(36);
            } else {
                p09Var.K(0);
                this.i1.H(0);
            }
            this.i1.a0 = true;
            int v0 = cmb.v0(cmb.I9, this.a);
            this.i1.L(v0, "Sunny");
            this.i1.L(v0, "Path 6");
            this.i1.L(v0, "Path");
            this.i1.L(v0, "Path 5");
            this.i1.j();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(cmb.f0(553648127, 1, -1));
            this.j1.setOnClickListener(new h8b(this, (byte) 0));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, qoe.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void F() {
        z8b z8bVar = this.w1;
        if (z8bVar == null) {
            return;
        }
        this.w2 = null;
        z8bVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-gm.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(gm.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-gm.L(32.0f));
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
        wt4 wt4Var;
        if (!this.X && (wt4Var = this.N0) != null) {
            if (wt4Var.getTranslationY() < (this.n.getMeasuredHeight() - ((int) (gm.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + gm.m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void I(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.I(int, boolean):void");
    }

    public final void J(Runnable runnable, long j) {
        if (!this.T1 && this.L1 != null) {
            b7b b7bVar = this.h2;
            if (b7bVar != null) {
                gm.r(b7bVar);
            }
            this.i2 = true;
            this.T1 = true;
            this.h2 = new b7b(this, runnable, (byte) 4);
            k9b k9bVar = this.Y0;
            k9bVar.setAlpha(0.0f);
            k9bVar.setVisibility(0);
            k9bVar.n(this.L1, this.h2, j);
            k9bVar.q(this.L1, false);
            gm.d3(this.h2, 800L);
        }
    }

    public final boolean K() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.K():boolean");
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
        j49 j49Var = this.P0;
        int i9 = 8;
        if (i == 0) {
            t(false);
            j49Var.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            e(false, false);
            c0(false);
        }
        l9b l9bVar = this.d1;
        ne6 ne6Var = this.m0;
        if (i == 2) {
            this.u1.setVisibility(8);
            if (i2 == 1) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            ne6Var.setVisibility(i8);
            l9bVar.setVisibility(8);
            this.v1.setVisibility(8);
        }
        lec lecVar = this.b1;
        k9b k9bVar = this.Y0;
        if (i == 1) {
            this.c1.setVisibility(8);
            if (i2 == 2) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            ne6Var.setVisibility(i5);
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
            k9bVar.setVisibility(i6);
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
            k3c k3cVar = this.q1;
            k3cVar.setAlpha(0.0f);
            k3cVar.setVisibility(8);
            lecVar.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        m78 m78Var = this.D1;
        if (i2 == 1) {
            g6b g6bVar = this.L1;
            if (g6bVar == null || !g6bVar.n) {
                s();
                F();
            }
            if (m78Var != null) {
                m78Var.setAllowTouch(false);
            }
            k9bVar.x(2, false);
            k9bVar.x(3, false);
            k9bVar.x(4, false);
            k9bVar.x(5, false);
            k9bVar.x(7, false);
            g6b g6bVar2 = this.L1;
            j = 0;
            if (g6bVar2 != null && g6bVar2.h0 >= 30000) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            lecVar.setVisibility(i4);
            ne6Var.setAlpha(1.0f);
            ne6Var.setTranslationY(0.0f);
            g6b g6bVar3 = this.L1;
            if (g6bVar3 == null || g6bVar3.J0 == 0) {
                i9 = 0;
            }
            l9bVar.setVisibility(i9);
        } else {
            j = 0;
        }
        if (i2 == 0 && this.W1) {
            B().setVisibility(0);
            or3 B = B();
            B.r.e(true, 0.0f);
            B.a(true);
            bi3 bi3Var = B.h;
            if (bi3Var != null) {
                gm.r(bi3Var);
            }
            bi3 bi3Var2 = new bi3(B, (byte) 16);
            B.h = bi3Var2;
            gm.d3(bi3Var2, 3500L);
            j49Var.h();
        }
        this.W1 = false;
        if (m78Var != null) {
            if (i2 == 1 && ((i3 = this.h0) == -1 || i3 == 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            m78Var.setAllowTouch(z2);
        }
        if (l9bVar != null) {
            if (i2 != 1) {
                z = true;
            } else {
                z = false;
            }
            l9bVar.e0 = z;
        }
        if (i2 == 1) {
            int i10 = this.c;
            hs6.d0(i10).D(0);
            hs6.d0(i10).X0(false, true, false, 0);
            hs6.d0(i10).X0(false, true, false, 2);
            h4b N1 = oc7.r1(i10).N1();
            if (N1.Q == j) {
                N1.R();
            }
            oc7.r1(i10).N1().T();
        }
    }

    public final void M(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.M(int, int):void");
    }

    public final void N() {
        this.d = true;
        this.w = false;
        if (this.K) {
            i9b i9bVar = this.i0;
            i9bVar.setAlpha(1.0f);
            i9bVar.setTranslationX(0.0f);
            i9bVar.setTranslationY(0.0f);
            this.j0.setAlpha(1.0f);
            this.l0.setAlpha(1.0f);
            this.n.setBackgroundColor(-16777216);
            if (this.g0 == 2) {
                this.v1.setAlpha(1.0f);
            }
        }
        f8b f8bVar = this.y2;
        if (f8bVar != null) {
            f8bVar.run();
            this.y2 = null;
        } else {
            O();
        }
        g6b g6bVar = this.L1;
        if (g6bVar != null) {
            if (g6bVar.n) {
                s();
                F();
                q();
            } else if (g6bVar.u) {
                if (g6bVar.K) {
                    this.Y0.t(g6bVar, null, 0L);
                }
                q();
            }
        }
    }

    public final void O() {
        c99 c99Var;
        int i;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.y2 = new f8b(this, (byte) 3);
            } else {
                Z(false);
            }
        }
        l9b l9bVar = this.d1;
        if (l9bVar != null) {
            l9bVar.f.s();
        }
        j49 j49Var = this.P0;
        if (j49Var != null) {
            j49Var.h();
        }
        zk8 zk8Var = this.p1;
        if (zk8Var != null) {
            h4b N1 = oc7.r1(zk8Var.a).N1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) N1.i.f(z8c.h(N1.a).n);
            if (peerStories != null) {
                i = peerStories.stories.size();
            } else {
                i = 0;
            }
            zk8Var.b = N1.b.m() + i + 1;
            zk8Var.c.invalidate();
        }
        z8b z8bVar = this.w1;
        if (z8bVar != null && (c99Var = z8bVar.E0.d) != null) {
            c99Var.postRunnable(c99Var.x);
        }
        k9b k9bVar = this.Y0;
        if (k9bVar != null) {
            k9bVar.x(0, false);
        }
        tr3 tr3Var = oc7.r1(this.c).N1().w;
        if (!tr3Var.c && !tr3Var.d) {
            tr3Var.d = true;
            pr3 pr3Var = new pr3(tr3Var, (byte) 1);
            cf7 Y = cf7.Y(tr3Var.a);
            Y.a.c(new np6((Object) Y, false, (Object) pr3Var, (byte) 18));
        }
    }

    public final void P(int i, int i2) {
        boolean z;
        z8b z8bVar;
        g9b g9bVar;
        h9b h9bVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        z8b z8bVar2;
        if (i2 == 0) {
            this.o0.setVisibility(8);
        }
        if (i == 0 && (z8bVar2 = this.w1) != null) {
            z8bVar2.setVisibility(8);
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
        if ((i2 == 0 || i == 0) && (z8bVar = this.w1) != null) {
            z8bVar.T0.setLayerType(0, null);
        }
        m78 m78Var = this.D1;
        if (m78Var != null) {
            if (i2 != 1 && i2 != -1) {
                z2 = false;
            }
            m78Var.setAllowTouch(z2);
        }
        if (i2 == 3) {
            g9b g9bVar2 = this.s1;
            if (g9bVar2 != null) {
                g9bVar2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (g9bVar = this.s1) != null) {
            g9bVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            g9b g9bVar3 = this.s1;
            g9bVar3.y = null;
            b43 b43Var = g9bVar3.f;
            b43Var.M = null;
            b43Var.d = null;
            b43Var.K = false;
            g9bVar3.d.setVisibility(8);
            g9bVar3.a.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            h9b h9bVar2 = this.t1;
            if (h9bVar2 != null) {
                h9bVar2.setAppearProgress(1.0f);
            }
        } else if (i == 4 && (h9bVar = this.t1) != null) {
            h9bVar.setVisibility(8);
            this.t1.setAppearProgress(0.0f);
            h9b h9bVar3 = this.t1;
            h9bVar3.b = null;
            b43 b43Var2 = h9bVar3.h;
            b43Var2.M = null;
            b43Var2.d = null;
            b43Var2.K = false;
            h9bVar3.e.setVisibility(8);
            h9bVar3.setVisibility(8);
        }
    }

    public final void Q(p9b p9bVar) {
        xy n;
        u9b u9bVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (oc7.r1(i).u2()) {
            h5.b(i);
            return;
        }
        int i2 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (u9bVar = this.n) != null && u9bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gm.s3(windowManager, u9bVar, layoutParams);
            windowManager.addView(u9bVar, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(y());
        if (this.w0 == 0 && (n = oc7.r1(i).N1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        I(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (p9bVar != null) {
            this.G = p9bVar;
            this.K = p9bVar.a;
            rectF.set(p9bVar.c);
            this.H = p9bVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = gm.q;
            rectF.set(0.0f, gm.L(100.0f), point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        n9b n9bVar = this.r;
        n9bVar.c();
        boolean z = this.K;
        if (!z && z) {
            i2 = -14737633;
        }
        this.i0.setBackgroundColor(i2);
        n9bVar.setTranslationX(0.0f);
        n9bVar.setTranslationY(0.0f);
        n9bVar.b(0.0f);
        n9bVar.setScaleX(1.0f);
        n9bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gm.e2(this.b);
        d(1.0f, true, new f8b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(o9b o9bVar, g6b g6bVar, long j) {
        int i;
        View view;
        if (this.d) {
            return;
        }
        int i2 = this.c;
        if (oc7.r1(i2).u2()) {
            h5.b(i2);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (view = this.n) != null && view.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gm.s3(windowManager, view, layoutParams);
            windowManager.addView(view, layoutParams);
            f0();
        }
        this.L1 = g6bVar;
        this.P1 = g6bVar.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (o9bVar != null) {
            this.G = o9bVar;
            this.K = o9bVar.a;
            rectF.set(o9bVar.c);
            this.H = o9bVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = gm.q;
            rectF.set(0.0f, gm.L(100.0f), point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        n9b n9bVar = this.r;
        n9bVar.c();
        boolean z = this.K;
        int i3 = 1;
        if (!z && z) {
            i = -14737633;
        } else {
            i = 0;
        }
        this.i0.setBackgroundColor(i);
        n9bVar.setTranslationX(0.0f);
        n9bVar.setTranslationY(0.0f);
        n9bVar.b(0.0f);
        n9bVar.setScaleX(1.0f);
        n9bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gm.e2(this.b);
        g6b g6bVar2 = this.L1;
        if (g6bVar2 != null) {
            this.d1.setText(g6bVar2.C0);
        }
        J(new q8b(this, (byte) 1), j);
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
        bu5 bu5Var;
        k9b k9bVar = this.Y0;
        if (k9bVar != null) {
            k9bVar.x(4, true);
        }
        l9b l9bVar = this.d1;
        if (l9bVar != null && (bu5Var = l9bVar.V0) != null) {
            bu5Var.u();
            l9bVar.V0 = null;
        }
        kj8 kj8Var = new kj8((d) new b9b(this, (byte) 1), 14, false);
        kj8Var.setOnDismissListener(new p8b(this, (byte) 1));
        kj8Var.show();
    }

    public final void T(o9b o9bVar, g6b g6bVar) {
        int i;
        boolean z;
        int i2;
        xy n;
        u9b u9bVar;
        if (this.d) {
            return;
        }
        int i3 = this.c;
        if (oc7.r1(i3).u2()) {
            h5.b(i3);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (u9bVar = this.n) != null && u9bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gm.s3(windowManager, u9bVar, layoutParams);
            windowManager.addView(u9bVar, layoutParams);
            f0();
        }
        this.L1 = g6bVar;
        c8b.a(i3, g6bVar);
        g6b g6bVar2 = this.L1;
        if (g6bVar2 != null && g6bVar2.K) {
            i = 1;
        } else {
            i = 0;
        }
        this.P1 = i;
        if (g6bVar2 != null && g6bVar2.u && i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.t0.g = z;
        if (this.w0 == 0 && (n = oc7.r1(i3).N1().n()) != null && n.a(i3, 1)) {
            g0(n, true);
        }
        RectF rectF = this.I;
        if (o9bVar != null) {
            this.G = o9bVar;
            this.K = o9bVar.a;
            rectF.set(o9bVar.c);
            this.H = o9bVar.b;
            this.G.e();
        } else {
            this.K = false;
            Point point = gm.q;
            rectF.set(0.0f, gm.L(100.0f), point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        n9b n9bVar = this.r;
        n9bVar.c();
        boolean z2 = this.K;
        if (!z2 && z2) {
            i2 = -14737633;
        } else {
            i2 = 0;
        }
        this.i0.setBackgroundColor(i2);
        n9bVar.setTranslationX(0.0f);
        n9bVar.setTranslationY(0.0f);
        n9bVar.b(0.0f);
        n9bVar.setScaleX(1.0f);
        n9bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gm.e2(this.b);
        g6b g6bVar3 = this.L1;
        if (g6bVar3 != null) {
            this.d1.setText(g6bVar3.C0);
        }
        this.c1.b(true, false);
        I(1, false);
        k0(-1, false, false);
        d(1.0f, true, new f8b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        e99 e99Var = this.x1;
        if (e99Var != null) {
            e99Var.bringToFront();
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
        k3c k3cVar = this.q1;
        if (k3cVar != null) {
            k3cVar.bringToFront();
        }
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.bringToFront();
        }
        e78 e78Var = this.F1;
        if (e78Var != null) {
            e78Var.bringToFront();
        }
        g78 g78Var = this.G1;
        if (g78Var != null) {
            g78Var.bringToFront();
        }
        zk8 zk8Var = this.p1;
        if (zk8Var != null) {
            zk8Var.bringToFront();
        }
        wc1 wc1Var = this.r1;
        if (wc1Var != null) {
            wc1Var.bringToFront();
        }
    }

    public final void V(g6b g6bVar, boolean z) {
        File file;
        View view;
        float f;
        g6b g6bVar2;
        boolean z2;
        int i;
        if (g6bVar != null && this.Y0.getWidth() > 0 && this.Y0.getHeight() > 0) {
            if (z) {
                file = g6bVar.O0;
            } else {
                file = g6bVar.N0;
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
            gm.m0 = true;
            view.draw(canvas);
            gm.m0 = false;
            canvas.restore();
            Paint paint = new Paint(2);
            ncc textureView = this.Y0.getTextureView();
            if (g6bVar.K && !g6bVar.u && textureView != null) {
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
            File file2 = g6bVar.Q0;
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
                    fc4.g(e, true);
                }
            }
            File file3 = g6bVar.P0;
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
                    fc4.g(e2, true);
                }
            }
            z8b z8bVar = this.w1;
            if (z8bVar != null && z8bVar.H0 != null) {
                canvas.save();
                canvas.scale(f, f);
                z8b z8bVar2 = this.w1;
                z8bVar2.y0 = true;
                tv7 tv7Var = z8bVar2.H0;
                tv7Var.a = true;
                tv7Var.draw(canvas);
                z8b z8bVar3 = this.w1;
                z8bVar3.H0.a = false;
                z8bVar3.y0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w = g6b.w(this.c, "jpg");
            if (z) {
                g6bVar2 = g6bVar;
                z2 = z;
                Utilities.g.c(new aa7(this, createBitmap, z2, w, g6bVar2, (byte) 22));
            } else {
                g6bVar2 = g6bVar;
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
                    fc4.g(e3, true);
                }
            }
            if (!z2) {
                g6bVar2.N0 = w;
            }
            g6bVar2.b1 = createScaledBitmap;
        }
    }

    public final void W() {
        xy n;
        int size;
        char c;
        View[] viewPages;
        j6c[] j6cVarArr;
        a8b a8bVar = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (a8bVar != null) {
            a8bVar.dismiss();
            this.r0 = null;
        }
        boolean z = this.O1;
        xx0 xx0Var = xx0.APP_ERROR;
        if (z) {
            yq3 yq3Var = this.f1;
            yq3Var.getClass();
            yq3Var.c(jb6.N0("VideoConvertFail"));
            xx0Var.a();
            xk8 xk8Var = this.c1.c;
            int i = -this.V1;
            this.V1 = i;
            gm.A3(i, xk8Var, null);
            return;
        }
        l9b l9bVar = this.d1;
        if (l9bVar != null && l9bVar.o()) {
            xx0Var.a();
            io ioVar = l9bVar.w;
            int i2 = -this.V1;
            this.V1 = i2;
            gm.A3(i2, ioVar, null);
            l9bVar.e();
            return;
        }
        g6b g6bVar = this.L1;
        int i3 = this.c;
        if ((g6bVar == null || (!g6bVar.g && g6bVar.J0 == 0)) && (n = oc7.r1(i3).e0.n()) != null && n.a(i3, z())) {
            g0(n, false);
            return;
        }
        this.L1.D0 = oc7.r1(i3).f5();
        r63 r63Var = this.a;
        char c2 = 1;
        if (l9bVar != null && !this.L1.D0) {
            CharSequence text = l9bVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((xkb[]) spannable.getSpans(0, text.length(), xkb.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new c41(this.n, r63Var).Q(2131624341, 36, gm.N2(jb6.M0(2131744267, null), cmb.Wc, 0, new f8b(this, (byte) 28), r63Var)).k(true);
                    int i4 = -this.V1;
                    this.V1 = i4;
                    gm.A3(i4, l9bVar, null);
                    return;
                }
            }
        }
        g6b g6bVar2 = this.L1;
        if (!g6bVar2.g && g6bVar2.J0 == 0) {
            if (this.O != 0) {
                g6bVar2.v0 = oc7.r1(i3).i1(this.O);
            }
            k9b k9bVar = this.Y0;
            k9bVar.x(3, true);
            a8b a8bVar2 = new a8b(this.b, this.L1.I0, r63Var);
            a8bVar2.R0(this.L1.E0);
            a8bVar2.Q0(this.L1.v0);
            a8bVar2.z1 = this.N;
            a8bVar2.O1 = new g8b(this, (byte) 15);
            a8bVar2.E0(!this.B0.i());
            ArrayList arrayList = this.J1;
            if (arrayList == null) {
                size = this.L1.r();
            } else {
                size = arrayList.size();
            }
            a8bVar2.N0(size);
            a8bVar2.L0(false);
            CharSequence text2 = l9bVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (j6c j6cVar : (j6c[]) ((Spanned) text2).getSpans(0, text2.length(), j6c.class)) {
                    if (j6cVar != null) {
                        try {
                            TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(Long.parseLong(j6cVar.getURL())));
                            if (W1 != null && !m9c.D(W1) && m9c.p(W1) != null && !arrayList2.contains(W1)) {
                                arrayList2.add(m9c.p(W1));
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
                            TLObject b2 = oc7.r1(i3).b2(charSequence);
                            if (b2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) b2;
                                if (!user.bot && !m9c.D(user) && user.id != 777000 && !m9c.B(user) && !arrayList2.contains(charSequence)) {
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
                    TLObject b22 = oc7.r1(i3).b2(charSequence2);
                    if (b22 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) b22;
                        if (!user2.bot && !m9c.D(user2) && user2.id != 777000 && !m9c.B(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c = 1;
            }
            a8bVar2.M1 = arrayList2;
            a8bVar2.Q1 = new g8b(this, (byte) 16);
            a8bVar2.R1 = new g8b(this, (byte) 17);
            a8bVar2.N1 = new m8b(this, (byte) 9);
            this.r0 = a8bVar2;
            g6b g6bVar3 = this.L1;
            if (g6bVar3.K) {
                if (k9bVar != null && !g6bVar3.f0 && this.g0 != 2) {
                    g6bVar3.e0 = k9bVar.getCurrentPosition();
                    qac g8bVar = new g8b(this, (byte) 18);
                    View view = this.x1;
                    View view2 = this.A1;
                    View[] viewArr = new View[3];
                    viewArr[0] = k9bVar;
                    viewArr[c] = view;
                    viewArr[2] = view2;
                    k9bVar.g(g8bVar, viewArr);
                }
                a8b a8bVar3 = this.r0;
                Bitmap bitmap = this.L1.g0;
                f8b f8bVar = new f8b(this, (byte) 20);
                if (bitmap != null) {
                    a8bVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                a8bVar3.V1 = bitmapDrawable;
                a8bVar3.W1 = f8bVar;
                hs1 hs1Var = a8bVar3.l1;
                if (hs1Var != null) {
                    for (View view3 : hs1Var.getViewPages()) {
                        if (view3 instanceof v7b) {
                            v7b v7bVar = (v7b) view3;
                            v7bVar.h(false);
                            v7bVar.f(false);
                        }
                    }
                }
            }
            this.r0.setOnDismissListener(new p8b(this, (byte) 0));
            this.r0.show();
            return;
        }
        g6bVar2.l = false;
        f(null);
        o0();
    }

    public final void X(q9b q9bVar) {
        int i = 0;
        RectF rectF = this.I;
        if (q9bVar != null) {
            this.G = q9bVar;
            this.K = q9bVar.a;
            rectF.set(q9bVar.c);
            this.H = q9bVar.b;
        } else {
            this.G = null;
            this.K = false;
            Point point = gm.q;
            rectF.set(0.0f, gm.L(100.0f), point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
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
                    Drawable mutate = activity.getResources().getDrawable(2131232782).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    sn2 sn2Var = new sn2(new ColorDrawable(-14540254), mutate);
                    int L = gm.L(64.0f);
                    int L2 = gm.L(64.0f);
                    sn2Var.e = L;
                    sn2Var.f = L2;
                    this.B0.setCameraThumb(sn2Var);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, activity);
                        int i = cmb.K5;
                        alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747041, null));
                        he heVar = alertDialog$Builder.a;
                        heVar.U = S2;
                        alertDialog$Builder.j(jb6.M0(2131747033, null), new m8b(this, (byte) 12));
                        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
                        heVar.show();
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
                    CameraController.getInstance().initCamera(new f8b(this, (byte) 0));
                }
            }
        }
    }

    public final void a() {
        nm7.e().a(this, nm7.r2);
        int i = this.c;
        nm7.f(i).a(this, nm7.C5);
        nm7.f(i).a(this, nm7.d3);
    }

    public final void a0(Runnable runnable) {
        a9b a9bVar = this.C0;
        if (a9bVar != null && a9bVar.getTextureView() != null) {
            try {
                Utilities.i.c(new j2b(this, this.C0.getTextureView().getBitmap(), runnable, (byte) 10));
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
        n9b n9bVar = this.r;
        float f = n9bVar.a;
        float f2 = n9bVar.b;
        n9bVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new dz1(this, f, f2, (byte) 6));
        this.k2.setDuration(340L);
        this.k2.setInterpolator(d53.h);
        this.k2.addListener(new x8b(this, (byte) 0));
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
            animate.alpha(f).setUpdateListener(new y8b(this, (byte) 1)).setListener(new qx(this, z, view, (byte) 14)).setDuration(320L).setInterpolator(d53.h).start();
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
        or3 or3Var;
        this.L0 = z;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z) {
            wt4 wt4Var = this.N0;
            if (wt4Var == null) {
                if (z) {
                    r(false);
                }
                wt4Var = this.N0;
                if (wt4Var == null) {
                    return;
                }
            }
            if (wt4Var.V) {
                this.r2 = new n8b(this, z, (byte) 0);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            zna znaVar = this.p2;
            if (znaVar != null) {
                znaVar.d();
                this.p2 = null;
            }
            wt4 wt4Var2 = this.N0;
            if (wt4Var2 == null) {
                if (z) {
                    r(false);
                }
                wt4Var2 = this.N0;
                if (wt4Var2 == null) {
                    return;
                }
            }
            wt4Var2.L = false;
            if (z && (or3Var = this.O0) != null) {
                or3Var.a(false);
            }
            int i2 = 4;
            n9b n9bVar = this.r;
            if (n9bVar != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                n9bVar.setImportantForAccessibility(i);
            }
            wt4 wt4Var3 = this.N0;
            if (z) {
                i2 = 0;
            }
            wt4Var3.setImportantForAccessibility(i2);
            this.q2 = Boolean.valueOf(z);
            float translationY = this.N0.getTranslationY();
            u9b u9bVar = this.n;
            if (z) {
                height = 0.0f;
            } else {
                height = (u9bVar.getHeight() - this.N0.g()) + (gm.n * 2.5f);
            }
            u9bVar.getHeight();
            wt4 wt4Var4 = this.N0;
            wt4Var4.L = !z;
            if (this.k2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.l2 = z2;
            if (z) {
                zna znaVar2 = new zna(wt4Var4, zna.p, height);
                this.p2 = znaVar2;
                znaVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new z22(this, height, (byte) 2));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new o8b(this, (byte) 0));
                this.o2.addListener(new x8b(this, (byte) 1));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(d53.h);
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
            fc4.g(e, true);
        }
    }

    public final void d(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        n9b n9bVar = this.r;
        if (z) {
            this.Q.d();
            nm7.e().k(nm7.j1, 512);
            this.M = Float.valueOf(this.L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new o8b(this, (byte) 5));
            this.F.addListener(new ok4(this, f, runnable, (byte) 5));
            if (f < 1.0f && this.w) {
                this.F.setDuration(250L);
                this.F.setInterpolator(d53.h);
            } else if (f <= 0.0f && n9bVar.a >= gm.L(20.0f)) {
                if (f < 0.0f && this.P) {
                    this.F.setDuration(200L);
                    this.F.setInterpolator(d53.h);
                    this.P = false;
                } else {
                    this.F.setDuration(400L);
                    this.F.setInterpolator(d53.h);
                }
            } else {
                this.F.setDuration(300L);
                this.F.setInterpolator(new l94());
            }
            this.F.start();
            return;
        }
        this.M = null;
        this.J = f;
        h();
        n9bVar.invalidate();
        this.n.invalidate();
        runnable.run();
        l();
    }

    public final void d0(String str) {
        int i;
        nrb nrbVar = this.F0;
        nrbVar.clearAnimation();
        a9b a9bVar = this.C0;
        if ((a9bVar != null && a9bVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z = false;
        if (str == null) {
            b0(nrbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    nrbVar.setContentDescription(jb6.M0(2131754915, null));
                    i = 2131231756;
                }
            } else {
                str.equals("off");
            }
            nrbVar.setContentDescription(jb6.M0(2131754914, null));
            i = 2131231757;
        } else {
            if (str.equals("on")) {
                nrbVar.setContentDescription(jb6.M0(2131754913, null));
                i = 2131231758;
            }
            nrbVar.setContentDescription(jb6.M0(2131754914, null));
            i = 2131231757;
        }
        if (nrbVar.n != i) {
            nrbVar.n = i;
            ValueAnimator valueAnimator = nrbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nrbVar.r = null;
            }
            nrbVar.setDrawable(i);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !G()) {
            z = true;
        }
        b0(nrbVar, z, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xy n;
        g6b g6bVar;
        int i3 = nm7.r2;
        j49 j49Var = this.P0;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == i3) {
            if (j49Var != null) {
                j49Var.h();
            }
            if (this.n2 != null && MediaController.c2 != null) {
                for (int i4 = 0; i4 < MediaController.c2.size(); i4++) {
                    yn6 yn6Var = (yn6) MediaController.c2.get(i4);
                    int i5 = yn6Var.a;
                    yn6 yn6Var2 = this.n2;
                    if (i5 == yn6Var2.a && yn6Var.b == yn6Var2.b) {
                        this.n2 = yn6Var;
                        return;
                    }
                }
            }
        } else if (i == nm7.C5) {
            if (j49Var != null && !this.W1) {
                j49Var.h();
            }
        } else if (i == nm7.d3) {
            byte b = this.g0;
            int i6 = this.c;
            if (b == 1) {
                if (!this.O1 && !this.d1.o()) {
                    h4b N1 = oc7.r1(i6).N1();
                    int z2 = z();
                    xy n2 = N1.n();
                    if (n2 == null || !n2.a(N1.a, z2) || ((g6bVar = this.L1) != null && (g6bVar.g || g6bVar.J0 != 0))) {
                        z = true;
                    }
                }
                this.c1.setShareEnabled(z);
            } else if (b == 0 && (n = oc7.r1(i6).N1().n()) != null && n.a(i6, 1)) {
                g6b g6bVar2 = this.L1;
                if (g6bVar2 == null || g6bVar2.J0 == 0) {
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
        wl2 wl2Var;
        if (z) {
            hg5 hg5Var = this.m1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            hg5 hg5Var2 = this.n1;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
            hg5 hg5Var3 = this.l1;
            if (hg5Var3 != null) {
                hg5Var3.f(true);
            }
            hg5 hg5Var4 = this.X0;
            if (hg5Var4 != null) {
                hg5Var4.f(true);
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
        if (z && (wl2Var = this.J0) != null && wl2Var.e) {
            wl2Var.a(false, z2);
        }
        l0(z2);
        s8b s8bVar = this.R0;
        eg5 eg5Var = this.V0;
        eg5 eg5Var2 = this.U0;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eg5Var2, property, f2);
            Property property2 = View.TRANSLATION_Y;
            if (z && this.g0 == 0 && !G()) {
                L3 = 0.0f;
            } else {
                L3 = gm.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eg5Var2, property2, L3);
            if (z || this.g0 != 0 || !G()) {
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eg5Var, property, f3);
            if (!z && this.g0 == 0 && G()) {
                L4 = 0.0f;
            } else {
                L4 = gm.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(eg5Var, property2, L4);
            if (z || this.g0 != 0 || G()) {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s8bVar, property, f4);
            if (z || this.g0 != 0 || G()) {
                f5 = gm.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(s8bVar, property2, f5));
            this.a2.setDuration(260L);
            this.a2.setInterpolator(d53.h);
            this.a2.start();
            return;
        }
        if (z && this.g0 == 0 && !G()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        eg5Var2.setAlpha(f);
        if (z && this.g0 == 0 && !G()) {
            L = 0.0f;
        } else {
            L = gm.L(16.0f);
        }
        eg5Var2.setTranslationY(L);
        if (z || this.g0 != 0 || !G()) {
            f3 = 0.0f;
        }
        eg5Var.setAlpha(f3);
        if (!z && this.g0 == 0 && G()) {
            L2 = 0.0f;
        } else {
            L2 = gm.L(16.0f);
        }
        eg5Var.setTranslationY(L2);
        if (z || this.g0 != 0 || G()) {
            f4 = 0.0f;
        }
        s8bVar.setAlpha(f4);
        if (z || this.g0 != 0 || G()) {
            f5 = gm.L(16.0f);
        }
        s8bVar.setTranslationY(f5);
    }

    public final void e0(boolean z, boolean z2) {
        p09 p09Var = this.g1;
        if (p09Var == null) {
            p09 p09Var2 = new p09(2131624089, gm.L(28.0f), gm.L(28.0f), true, null);
            this.g1 = p09Var2;
            p09Var2.G *= 1.5f;
            p09Var = p09Var2;
        }
        this.h1.setAnimation(p09Var);
        p09 p09Var3 = this.g1;
        int i = 20;
        if (!z2) {
            if (!z) {
                i = 0;
            }
            p09Var3.I(i, false, false);
        } else if (z) {
            if (p09Var3.b0 > 20) {
                p09Var3.I(0, false, false);
            }
            this.g1.K(20);
            this.g1.start();
        } else {
            int i2 = p09Var3.b0;
            if (i2 != 0 && i2 < 43) {
                p09Var3.K(43);
                this.g1.start();
            }
        }
    }

    public final void f(Runnable runnable) {
        g6b g6bVar;
        Runnable runnable2;
        k9b k9bVar;
        float f;
        boolean z;
        Bitmap.CompressFormat compressFormat;
        n78 n78Var = this.C1;
        if (n78Var != null && (g6bVar = this.L1) != null) {
            g6bVar.j |= n78Var.b();
            g6b g6bVar2 = this.L1;
            n78 n78Var2 = this.C1;
            File file = g6bVar2.Z0;
            if (file != null) {
                file.delete();
                g6bVar2.Z0 = null;
            }
            lo6 savedFilterState = n78Var2.getSavedFilterState();
            g6bVar2.a1 = savedFilterState;
            if (!g6bVar2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = n78Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i = g6bVar2.R;
                        float f2 = 1.0f;
                        if (i == 1) {
                            f = -1.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (i == 2) {
                            f2 = -1.0f;
                        }
                        matrix.postScale(f, f2, g6bVar2.k0 / 2.0f, g6bVar2.l0 / 2.0f);
                        matrix.postRotate(-g6bVar2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        g6bVar2.n0.preScale(g6bVar2.k0 / createBitmap.getWidth(), g6bVar2.l0 / createBitmap.getHeight());
                        g6bVar2.k0 = createBitmap.getWidth();
                        g6bVar2.l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = g6bVar2.Z0;
                        if (file2 != null && file2.exists()) {
                            g6bVar2.Z0.delete();
                        }
                        String k = g6b.k(g6bVar2.L);
                        String str = "webp";
                        if (!"png".equals(k) && !"webp".equals(k)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int i2 = g6bVar2.a;
                        if (!z) {
                            str = "jpg";
                        }
                        g6bVar2.Z0 = g6b.w(i2, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(g6bVar2.Z0);
                                if (z) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.i.c(new eb7(g6bVar2, createBitmap, z, runnable2, (byte) 16));
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
                g6b g6bVar3 = this.L1;
                if (!g6bVar3.K && (k9bVar = this.Y0) != null) {
                    k9bVar.set(g6bVar3);
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
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new up(this, (byte) 3));
    }

    public final void g() {
        if (this.L1 != null && this.E1 != null) {
            i9b i9bVar = this.i0;
            if (i9bVar.getMeasuredWidth() > 0 && i9bVar.getMeasuredHeight() > 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                int i = this.L1.Q;
                if (i != 0) {
                    matrix.postRotate(-i, i9bVar.getMeasuredWidth() / 2.0f, i9bVar.getMeasuredHeight() / 2.0f);
                    if ((this.L1.Q / 90) % 2 == 1) {
                        matrix.postScale(i9bVar.getMeasuredWidth() / i9bVar.getMeasuredHeight(), i9bVar.getMeasuredHeight() / i9bVar.getMeasuredWidth(), i9bVar.getMeasuredWidth() / 2.0f, i9bVar.getMeasuredHeight() / 2.0f);
                    }
                }
                matrix.postScale((1.0f / i9bVar.getMeasuredWidth()) * this.L1.k0, (1.0f / i9bVar.getMeasuredHeight()) * this.L1.l0);
                matrix.postConcat(this.L1.n0);
                matrix.postScale(i9bVar.getMeasuredWidth() / this.L1.i0, i9bVar.getMeasuredHeight() / this.L1.j0);
                this.E1.setTransform(matrix);
                this.E1.invalidate();
            }
        }
    }

    public final void g0(xy xyVar, boolean z) {
        if (this.A2) {
            return;
        }
        i46 i46Var = new i46(xyVar.b(), this.c, null, this.b, new b9b(this, (byte) 0));
        i46Var.S1 = z();
        i46Var.setOnDismissListener(new aw5((byte) 2, this, z));
        this.Y0.x(7, true);
        this.A2 = true;
        i46Var.show();
    }

    public final void h() {
        g48 g48Var;
        if (this.K) {
            i9b i9bVar = this.i0;
            RectF rectF = this.e0;
            rectF.set(i9bVar.getLeft(), i9bVar.getTop(), i9bVar.getMeasuredWidth(), i9bVar.getMeasuredHeight());
            n9b n9bVar = this.r;
            rectF.offset(n9bVar.getX(), n9bVar.getY());
            float f = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.d0;
            gm.X1(rectF2, rectF, f, rectF3);
            i9bVar.setAlpha(this.J);
            i9bVar.setTranslationX((rectF3.left - i9bVar.getLeft()) - n9bVar.getX());
            i9bVar.setTranslationY((rectF3.top - i9bVar.getTop()) - n9bVar.getY());
            q9b q9bVar = this.G;
            if (q9bVar != null && (g48Var = q9bVar.f) != null) {
                g48Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            i9bVar.setScaleX(rectF3.width() / i9bVar.getMeasuredWidth());
            i9bVar.setScaleY(rectF3.height() / i9bVar.getMeasuredHeight());
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
            uec uecVar = this.K0;
            if (z2) {
                ViewPropertyAnimator animate = uecVar.animate();
                if (z) {
                    f = 1.0f;
                }
                animate.alpha(f).setDuration(350L).setInterpolator(d53.h).withEndAction(new n8b(this, z, (byte) 1)).start();
                return;
            }
            uecVar.clearAnimation();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.i():void");
    }

    public final void i0(boolean z) {
        Integer num;
        float f;
        b1d b1dVar = this.W0;
        if (b1dVar.getTag() != null && z) {
            Runnable runnable = this.f2;
            if (runnable != null) {
                gm.r(runnable);
            }
            f8b f8bVar = new f8b(this, (byte) 25);
            this.f2 = f8bVar;
            gm.d3(f8bVar, 2000L);
        } else if (b1dVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.g2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            b1dVar.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g2 = animatorSet2;
            animatorSet2.setDuration(180L);
            if (z) {
                b1dVar.setVisibility(0);
            }
            AnimatorSet animatorSet3 = this.g2;
            Property property = View.ALPHA;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(b1dVar, property, f));
            this.g2.addListener(new sw9((byte) 6, this, z));
            this.g2.start();
            if (z) {
                f8b f8bVar2 = new f8b(this, (byte) 26);
                this.f2 = f8bVar2;
                gm.d3(f8bVar2, 2000L);
            }
        }
    }

    public final void j() {
        g6b g6bVar;
        boolean z;
        if (this.w1 != null && (g6bVar = this.L1) != null && g6bVar.u) {
            File file = g6bVar.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                g6bVar = this.L1;
                g6bVar.W0 = null;
            }
            g6bVar.W0 = g6b.w(this.c, "webp");
            z8b z8bVar = this.w1;
            g6b g6bVar2 = this.L1;
            ArrayList arrayList = g6bVar2.T0;
            if (this.P1 != 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap q0 = z8bVar.q0(arrayList, false, false, true, z, g6bVar2);
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
                fc4.g(e2, true);
                try {
                    this.L1.W0.delete();
                } catch (Exception e3) {
                    fc4.g(e3, true);
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
        a8b a8bVar = this.r0;
        if (a8bVar != null) {
            a8bVar.dismiss();
            this.r0 = null;
        }
        a8b a8bVar2 = new a8b(this.b, 86400, this.a);
        a8bVar2.P0();
        a8bVar2.R0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            if (this.O != 0) {
                inputPeer = oc7.r1(this.c).i1(this.O);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        a8bVar2.Q0(inputPeer);
        a8bVar2.z1 = this.N;
        a8bVar2.O1 = new g8b(this, (byte) 19);
        a8bVar2.E0(false);
        a8bVar2.N0(1);
        a8bVar2.L0(false);
        a8bVar2.Q1 = new g8b(this, (byte) 20);
        a8bVar2.N1 = new m8b(this, (byte) 11);
        this.r0 = a8bVar2;
        a8bVar2.show();
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.k0(int, boolean, boolean):void");
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
        a26 a26Var = this.E;
        if (a26Var != null) {
            a26Var.b(!z);
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
        a9b a9bVar;
        byte b = this.g0;
        wl2 wl2Var = this.J0;
        boolean z8 = false;
        if (b == 0 && this.P1 == 1 && !wl2Var.e && !G()) {
            z2 = true;
        } else {
            z2 = false;
        }
        h0(z2, z);
        j9b j9bVar = this.B0;
        boolean i = j9bVar.i();
        xl2 xl2Var = this.H0;
        xl2Var.setSelected(i);
        if (wl2Var != null && wl2Var.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        b0(this.o0, z3, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && this.Z1 != null && !wl2Var.e && !G()) {
            z4 = true;
        } else {
            z4 = false;
        }
        b0(this.F0, z4, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && (a9bVar = this.C0) != null && a9bVar.a && !wl2Var.e && !j9bVar.i()) {
            z5 = true;
        } else {
            z5 = false;
        }
        b0(this.G0, z5, z);
        if (!this.b2 && this.P1 != -1 && this.g0 == 0 && !wl2Var.e) {
            z6 = true;
        } else {
            z6 = false;
        }
        b0(xl2Var, z6, z);
        b0(this.I0, wl2Var.e, z);
        if (j9bVar.i()) {
            f = j9bVar.getFilledProgress();
        } else {
            f = 0.0f;
        }
        this.P0.e(z, f);
        boolean z9 = wl2Var.e;
        hg5 hg5Var = this.o1;
        if (z9) {
            hg5Var.v();
        } else {
            hg5Var.f(true);
        }
        e(this.b2, z);
        if (this.P1 == -1 && this.g0 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        gm.P3(this.T0, z7, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z8 = true;
        }
        gm.P3(this.S0, z8, true);
    }

    public final void m() {
        if (this.u2 < 0) {
            this.u2 = oc7.d1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f = oc7.d1().getFloat("frontflash_warmth", 0.9f);
            rk4 rk4Var = this.s;
            rk4Var.o = f;
            rk4Var.n = rk4.f(f);
            rk4Var.g();
            rk4Var.p = oc7.d1().getFloat("frontflash_intensity", 1.0f);
            rk4Var.i();
        }
    }

    public final void m0() {
        nrb nrbVar = this.I0;
        nrbVar.setTranslationX(-0.0f);
        float alpha = (nrbVar.getAlpha() * gm.L(46.0f)) + 0.0f;
        orb orbVar = this.G0;
        orbVar.setTranslationX(-alpha);
        float alpha2 = (orbVar.getAlpha() * gm.L(46.0f)) + alpha;
        xl2 xl2Var = this.H0;
        xl2Var.setTranslationX(-alpha2);
        float alpha3 = (xl2Var.getAlpha() * gm.L(46.0f)) + alpha2;
        nrb nrbVar2 = this.F0;
        nrbVar2.setTranslationX(-alpha3);
        float alpha4 = nrbVar2.getAlpha();
        pk4 pk4Var = this.o0;
        pk4Var.setTranslationX(0.0f);
        float alpha5 = pk4Var.getAlpha();
        float L = (alpha4 * gm.L(46.0f)) + alpha3 + gm.L(8.0f);
        hx hxVar = this.J0.a;
        hxVar.setPadding((int) ((alpha5 * gm.L(46.0f)) + 0.0f + gm.L(8.0f)), 0, (int) L, 0);
        hxVar.invalidate();
    }

    public final void n() {
        a9b a9bVar = this.C0;
        boolean z = false;
        if (a9bVar != null && a9bVar.getTextureView() != null) {
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
                    f += gm.B(bitmap.getPixel((i + 1) * width, i2 * height));
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
        p09 p09Var = this.i1;
        if (p09Var != null) {
            int[] iArr = p09Var.e;
            g6b g6bVar = this.L1;
            int i2 = 0;
            if (z) {
                if (g6bVar != null && g6bVar.y0) {
                    i2 = iArr[0];
                }
                p09Var.K(i2);
                p09 p09Var2 = this.i1;
                if (p09Var2 != null) {
                    p09Var2.start();
                    return;
                }
                return;
            }
            if (g6bVar != null && g6bVar.y0) {
                i = iArr[0] - 1;
            } else {
                i = 0;
            }
            p09Var.I(i, false, true);
            this.i1.K(i);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o(boolean z) {
        if (this.d) {
            a8b a8bVar = this.r0;
            if (a8bVar != null) {
                a8bVar.dismiss();
                this.r0 = null;
            }
            g6b g6bVar = this.L1;
            long j = 0;
            if (g6bVar != null && !g6bVar.h) {
                if ((this.w && g6bVar.g) || g6bVar.b != 0) {
                    g6bVar.j = false;
                }
                g6bVar.i(false);
            }
            this.L1 = null;
            nac nacVar = this.S;
            k9b k9bVar = this.Y0;
            if (nacVar != null && k9bVar != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                ndc ndcVar = k9bVar.E;
                if (ndcVar != null) {
                    ndcVar.f0();
                    k9bVar.E.l0();
                    k9bVar.E = null;
                }
                ndc ndcVar2 = k9bVar.y;
                if (ndcVar2 != null) {
                    j = ndcVar2.S();
                    k9bVar.y.f0();
                    k9bVar.y.l0();
                    k9bVar.y = null;
                }
                ndc ndcVar3 = k9bVar.e;
                if (ndcVar3 != null) {
                    j = ndcVar3.S();
                    k9bVar.e.f0();
                    k9bVar.e.l0();
                    k9bVar.e = null;
                }
                nacVar.a(Long.valueOf(j), new n8b(this, z, (byte) 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
                return;
            }
            if (k9bVar != null && !z) {
                k9bVar.set(null);
            }
            d(0.0f, z, new f8b(this, (byte) 23));
            boolean z2 = this.K;
            if (z2 || !z2) {
                this.n.setBackgroundColor(0);
                this.c1.b(false, true);
            }
            nm7.e().n(this, nm7.r2);
            int i = this.c;
            nm7.f(i).n(this, nm7.C5);
            nm7.f(i).n(this, nm7.d3);
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        f8b f8bVar = new f8b(this, (byte) 2);
        z8b z8bVar = this.w1;
        g6b g6bVar = this.L1;
        if (z8bVar != null && g6bVar != null) {
            g6bVar.f();
            boolean r0 = z8bVar.r0();
            boolean z = z8bVar.E0.getPainting().E;
            Utilities.g.c(new i4a(this, z8bVar, g6bVar.i0, g6bVar.j0, g6bVar, z, r0, f8bVar, (byte) 2));
            return;
        }
        f8bVar.run();
    }

    public final void p() {
        boolean z;
        Activity activity = this.b;
        if (this.C0 == null && activity != null) {
            this.C0 = new a9b(this, activity, oc7.d1().getBoolean("stories_camera", false));
            j49 j49Var = this.P0;
            float f = 0.0f;
            if (j49Var != null) {
                j49Var.h0 = 0.0f;
                j49Var.i0.e(true, 0.0f);
            }
            this.C0.recordHevc = !this.B0.i();
            this.C0.setThumbDrawable(y());
            this.C0.initTexture();
            this.C0.setDelegate(new m8b(this, (byte) 0));
            orb orbVar = this.G0;
            if (this.C0.a && this.g0 == 0) {
                z = true;
            } else {
                z = false;
            }
            b0(orbVar, z, true);
            xl2 xl2Var = this.H0;
            if (!this.C0.a) {
                f = gm.L(46.0f);
            }
            xl2Var.setTranslationX(f);
            this.B0.setCameraView(this.C0);
            if (oc7.d1().getInt("storyhint2", 0) < 1) {
                this.X0.v();
                oc7.d1().edit().putInt("storyhint2", oc7.d1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!ss3.o(this.C0.getContext()) || !oc7.d1().getBoolean("dualcam", ss3.n(org.telegram.messenger.a.b, false))) && this.C0.a && oc7.d1().getInt("storydualhint", 0) < 2) {
                this.m1.v();
            }
            ex8 ex8Var = this.D0;
            if (ex8Var == null) {
                ex8Var = new ex8(activity, new g8b(this, (byte) 4));
                this.D0 = ex8Var;
            }
            ex8Var.a(this.C0);
            ms9 ms9Var = this.E0;
            if (ms9Var != null) {
                j9b j9bVar = this.B0;
                Object blurRenderNode = j9bVar.getBlurRenderNode();
                ms9Var.G = j9bVar;
                ms9Var.H = blurRenderNode;
                ms9Var.invalidate();
            }
        }
    }

    public final boolean p0() {
        a9b a9bVar;
        if ((this.Q1 || this.R1) && (a9bVar = this.C0) != null && a9bVar.isFrontface()) {
            int i = this.u2;
            if (i == 2 || (i == 1 && this.d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        g6b g6bVar;
        Bitmap bitmap;
        Bitmap q;
        if (this.C1 == null && (g6bVar = this.L1) != null) {
            boolean z = g6bVar.K;
            k9b k9bVar = this.Y0;
            lo6 lo6Var = null;
            if (!z) {
                if (g6bVar.Z0 == null) {
                    q = k9bVar.getPhotoBitmap();
                } else {
                    m8b m8bVar = new m8b(this, (byte) 10);
                    Point point = gm.q;
                    q = g6b.q(m8bVar, point.x, point.y, 0, true);
                }
                bitmap = q;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.L1.K) {
                ncc textureView = k9bVar.getTextureView();
                int orientation = k9bVar.getOrientation();
                g6b g6bVar2 = this.L1;
                if (g6bVar2 != null) {
                    lo6Var = g6bVar2.a1;
                }
                n78 n78Var = new n78(this.b, textureView, bitmap, null, orientation, lo6Var, null, 0, false, false, this.s0, this.a);
                this.C1 = n78Var;
                this.r.addView(n78Var);
                m78 m78Var = this.D1;
                if (m78Var != null) {
                    m78Var.setFilterView(this.C1);
                }
                TextureView myTextureView = this.C1.getMyTextureView();
                this.E1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                k9bVar.o(this.E1, this.C1);
                TextureView textureView2 = this.E1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.E1.animate().alpha(1.0f).setDuration(220L).start();
                }
                g();
                e78 blurControl = this.C1.getBlurControl();
                this.F1 = blurControl;
                i9b i9bVar = this.i0;
                if (blurControl != null) {
                    i9bVar.addView(blurControl);
                }
                g78 curveControl = this.C1.getCurveControl();
                this.G1 = curveControl;
                if (curveControl != null) {
                    i9bVar.addView(curveControl);
                }
                U();
                this.C1.getDoneTextView().setOnClickListener(new h8b(this, (byte) 13));
                this.C1.getCancelTextView().setOnClickListener(new h8b(this, (byte) 14));
                this.C1.getToolsView().setVisibility(8);
                this.C1.getToolsView().setAlpha(0.0f);
                this.C1.getToolsView().setTranslationY(gm.L(186.0f));
                this.C1.j0.setVisibility(0);
            }
        }
    }

    public final void r(boolean z) {
        boolean z2;
        boolean z3;
        wt4 wt4Var = this.N0;
        j9b j9bVar = this.B0;
        if (wt4Var != null) {
            if (j9bVar != null && j9bVar.i()) {
                z3 = true;
            } else {
                z3 = false;
            }
            wt4 wt4Var2 = this.N0;
            if (z3 != wt4Var2.Q) {
                wt4Var = wt4Var2;
            } else {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (wt4Var != null) {
            u();
        }
        yn6 yn6Var = this.n2;
        boolean z4 = !z;
        if (j9bVar != null && j9bVar.i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        wt4 wt4Var3 = new wt4(this, this.c, this.b, this.a, yn6Var, z, z4, z2);
        this.N0 = wt4Var3;
        wt4Var3.H.setVisibility(8);
        this.N0.setMultipleOnClick(j9bVar.i());
        this.N0.setMaxCount(Math.min(10, sl2.b() - j9bVar.getFilledCount()));
        this.N0.setOnBackClickListener(new q8b(this, (byte) 0));
        this.N0.setOnSelectListener(new gp2(this, z, (byte) 2));
        this.N0.setOnSelectMultipleListener(new fh6(this, (byte) 2));
        t46 t46Var = this.m2;
        if (t46Var != null) {
            as0 as0Var = this.N0.e;
            as0Var.B = t46Var;
            as0Var.k0();
        }
        this.n.addView(this.N0, qoe.e(-1, -1, 119));
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.s():void");
    }

    public final void t(boolean z) {
        ex8 ex8Var = this.D0;
        if (ex8Var != null) {
            ex8Var.f = null;
            Utilities.e.a((bx8) ex8Var.h);
            this.D0 = null;
            j9b j9bVar = this.B0;
            if (j9bVar != null) {
                j9bVar.c.c(null);
            }
        }
        ms9 ms9Var = this.E0;
        if (ms9Var != null) {
            ms9Var.G = null;
            ms9Var.H = null;
            ms9Var.invalidate();
        }
        if (this.C0 != null) {
            if (z) {
                a0(new f8b(this, (byte) 8));
                return;
            }
            a0(new f8b(this, (byte) 9));
            this.C0.destroy(true, null);
            gm.B2(this.C0);
            j9b j9bVar2 = this.B0;
            if (j9bVar2 != null) {
                j9bVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void u() {
        wt4 wt4Var = this.N0;
        if (wt4Var == null) {
            return;
        }
        this.n.removeView(wt4Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        zna znaVar = this.p2;
        if (znaVar != null) {
            znaVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void w() {
        n78 n78Var = this.C1;
        if (n78Var == null) {
            return;
        }
        n78Var.c();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        i9b i9bVar = this.i0;
        if (textureView != null) {
            i9bVar.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        e78 e78Var = this.F1;
        if (e78Var != null) {
            i9bVar.removeView(e78Var);
            this.F1 = null;
        }
        g78 g78Var = this.G1;
        if (g78Var != null) {
            i9bVar.removeView(g78Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void x() {
        z8b z8bVar = this.w1;
        if (z8bVar != null) {
            z8bVar.H0.removeAllViews();
            z8b z8bVar2 = this.w1;
            gd1 gd1Var = z8bVar2.a2;
            if (gd1Var != null) {
                gd1Var.b.c();
                jd4 jd4Var = gd1Var.c;
                if (jd4Var != null) {
                    jd4Var.f = null;
                    u31 u31Var = (u31) jd4Var.g;
                    if (u31Var != null) {
                        u31Var.b();
                        jd4Var.g = null;
                    }
                    gd1Var.c = null;
                }
            }
            z8bVar2.E0.h();
            z8bVar2.H0.setVisibility(8);
            z8bVar2.G0.setVisibility(8);
            z8bVar2.u0.postRunnable(new bo6((byte) 9));
            nv7 nv7Var = z8bVar2.e2;
            if (nv7Var != null) {
                nv7Var.dismiss();
            }
            ln2 ln2Var = z8bVar2.J1;
            if (ln2Var != null) {
                ln2Var.dismiss();
            }
            this.r.removeView(this.w1);
            this.w1 = null;
            e99 e99Var = this.x1;
            i9b i9bVar = this.i0;
            if (e99Var != null) {
                i9bVar.removeView(e99Var);
                this.x1 = null;
            }
            View view = this.z1;
            if (view != null) {
                i9bVar.removeView(view);
                this.z1 = null;
            }
            View view2 = this.y1;
            if (view2 != null) {
                i9bVar.removeView(view2);
                this.y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                i9bVar.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                i9bVar.removeView(view4);
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
        return this.b.getResources().getDrawable(2131231496);
    }

    public final int z() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        g6b g6bVar = this.L1;
        if (g6bVar != null) {
            return g6bVar.r();
        }
        return 1;
    }
}
