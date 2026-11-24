package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.PhotoViewer;
public class gb2 extends hf0 implements wu9, ll5, sp3, mib, gk7, x74, ni5, bs5 {
    public static final float[] Id = new float[8];
    public static TextPaint Jd;
    public static TextPaint Kd;
    public int A0;
    public long A1;
    public int A2;
    public StaticLayout A3;
    public CharacterStyle A4;
    public TLRPC.Message A5;
    public float A6;
    public final ImageReceiver A7;
    public eb8 A8;
    public StaticLayout A9;
    public long Aa;
    public boolean Ab;
    public final AtomicReference Ac;
    public ColorFilter[] Ad;
    public boolean B0;
    public boolean B1;
    public int B2;
    public long B3;
    public final Path B4;
    public boolean B5;
    public long B6;
    public final pb0 B7;
    public boolean B8;
    public int B9;
    public String Ba;
    public final wa2 Bb;
    public long Bc;
    public int[] Bd;
    public boolean C0;
    public boolean C1;
    public int C2;
    public int C3;
    public boolean C4;
    public int C5;
    public boolean C6;
    public boolean C7;
    public boolean C8;
    public final StaticLayout[] C9;
    public tl Ca;
    public int Cb;
    public int Cc;
    public Paint Cd;
    public final Rect D0;
    public byte D1;
    public int D2;
    public tgb D3;
    public final xa2 D4;
    public int D5;
    public boolean D6;
    public boolean D7;
    public boolean D8;
    public int D9;
    public tl Da;
    public int Db;
    public int Dc;
    public float Dd;
    public final fm0 E;
    public int E0;
    public float E1;
    public boolean E2;
    public tgb E3;
    public final dv9 E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public boolean E8;
    public boolean E9;
    public TLRPC.User Ea;
    public float Eb;
    public int Ec;
    public float Ed;
    public boolean F;
    public int F0;
    public boolean F1;
    public boolean F2;
    public tgb F3;
    public final u7 F4;
    public boolean F5;
    public boolean F6;
    public final ImageReceiver F7;
    public int F8;
    public float F9;
    public TLRPC.User Fa;
    public boolean Fb;
    public int Fc;
    public int Fd;
    public boolean G;
    public int G0;
    public byte G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public float G5;
    public boolean G6;
    public int G7;
    public int G8;
    public int G9;
    public TLRPC.Chat Ga;
    public ValueAnimator Gb;
    public float Gc;
    public int Gd;
    public boolean H;
    public int H0;
    public float H1;
    public n41 H2;
    public boolean H3;
    public int H4;
    public boolean H5;
    public boolean H6;
    public Drawable[] H7;
    public int H8;
    public int H9;
    public String Ha;
    public byte Hb;
    public float Hc;
    public TL_stars.StarGift Hd;
    public boolean I;
    public int I0;
    public int I1;
    public int I2;
    public boolean I3;
    public boolean I4;
    public final ArrayList I5;
    public boolean I6;
    public int[] I7;
    public final Rect I8;
    public final float[] I9;
    public String Ia;
    public final wa2 Ib;
    public n40 Ic;
    public boolean J;
    public boolean J0;
    public int J1;
    public final Drawable[] J2;
    public boolean J3;
    public qa2 J4;
    public ua2 J5;
    public int J6;
    public Drawable J7;
    public final RectF J8;
    public float J9;
    public boolean Ja;
    public final SparseArray Jb;
    public wtc Jc;
    public boolean K;
    public boolean K0;
    public long K1;
    public final za2[] K2;
    public int K3;
    public ra2 K4;
    public int K5;
    public boolean K6;
    public Drawable K7;
    public final Path K8;
    public float K9;
    public boolean Ka;
    public boolean Kb;
    public boolean Kc;
    public f27 L;
    public int L0;
    public long L1;
    public final int[] L2;
    public int L3;
    public StaticLayout L4;
    public boolean L5;
    public m17 L6;
    public int L7;
    public final float[] L8;
    public StaticLayout L9;
    public boolean La;
    public boolean Lb;
    public boolean Lc;
    public c27 M;
    public int M0;
    public byte M1;
    public final RectF M2;
    public int M3;
    public double M4;
    public boolean M5;
    public m17 M6;
    public boolean M7;
    public lm M8;
    public int M9;
    public cm Ma;
    public float Mb;
    public lg7 Mc;
    public boolean N;
    public float N0;
    public TLRPC.Document N1;
    public final int[] N2;
    public int N3;
    public int N4;
    public int N5;
    public int N6;
    public boolean N7;
    public b46 N8;
    public int N9;
    public cm Na;
    public float Nb;
    public boolean Nc;
    public final i19 O;
    public boolean O0;
    public boolean O1;
    public float O2;
    public int O3;
    public int O4;
    public qla O5;
    public int O6;
    public boolean O7;
    public r86 O8;
    public int O9;
    public cm Oa;
    public float Ob;
    public final sa2 Oc;
    public final yv4 P;
    public boolean P0;
    public xl3 P1;
    public SpannableStringBuilder P2;
    public boolean P3;
    public final ArrayList P4;
    public boolean P5;
    public int P6;
    public CheckBoxBase P7;
    public ArrayList P8;
    public int P9;
    public cm Pa;
    public float Pb;
    public Runnable Pc;
    public final aw4 Q;
    public final RadialProgress2 Q0;
    public int Q1;
    public boolean Q2;
    public boolean Q3;
    public final ArrayList Q4;
    public k27 Q5;
    public int Q6;
    public StaticLayout Q7;
    public boolean Q8;
    public CharSequence Q9;
    public cm Qa;
    public long Qb;
    public Runnable Qc;
    public boolean R;
    public final RadialProgress2 R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public float R4;
    public k27 R5;
    public int R6;
    public StaticLayout R7;
    public byte R8;
    public boolean R9;
    public n41 Ra;
    public float Rb;
    public int Rc;
    public long S;
    public boolean S0;
    public boolean S1;
    public long S2;
    public int S3;
    public int S4;
    public f27 S5;
    public boolean S6;
    public final AtomicReference S7;
    public boolean S8;
    public boolean S9;
    public n41 Sa;
    public float Sb;
    public int Sc;
    public tgb T;
    public final int[] T0;
    public boolean T1;
    public boolean T2;
    public int T3;
    public int T4;
    public boolean T5;
    public z3c T6;
    public final ImageReceiver T7;
    public byte T8;
    public Paint T9;
    public n41 Ta;
    public boolean Tb;
    public boolean Tc;
    public b46 U;
    public final ml U0;
    public boolean U1;
    public int U2;
    public int U3;
    public float U4;
    public boolean U5;
    public z3c U6;
    public int U7;
    public boolean U8;
    public Path U9;
    public float Ua;
    public float Ub;
    public float Uc;
    public CornerPathEffect V;
    public final ImageReceiver V0;
    public boolean V1;
    public ff0 V2;
    public int V3;
    public boolean V4;
    public boolean V5;
    public int V6;
    public int V7;
    public boolean V8;
    public final Path V9;
    public float Va;
    public float Vb;
    public Paint Vc;
    public int W;
    public ColorMatrixColorFilter W0;
    public int W1;
    public boolean W2;
    public byte W3;
    public boolean W4;
    public boolean W5;
    public boolean W6;
    public float W7;
    public boolean W8;
    public final float[] W9;
    public ff0 Wa;
    public float Wb;
    public Drawable Wc;
    public final pb0 X0;
    public int X1;
    public boolean X2;
    public int X3;
    public boolean X4;
    public fb5 X5;
    public boolean X6;
    public int X7;
    public byte X8;
    public qla X9;
    public Path Xa;
    public int Xb;
    public boolean Xc;
    public jb2 Y0;
    public int Y1;
    public int Y2;
    public boolean Y3;
    public boolean Y4;
    public AnimatorSet Y5;
    public boolean Y6;
    public int Y7;
    public boolean Y8;
    public float Y9;
    public final RectF Ya;
    public boolean Yb;
    public lbb Yc;
    public hb1 Z0;
    public int Z1;
    public ff0 Z2;
    public boolean Z3;
    public boolean Z4;
    public final int Z5;
    public float Z6;
    public int Z7;
    public Path Z8;
    public float Z9;
    public final RectF Za;
    public final h24 Zb;
    public int Zc;
    public long a0;
    public Paint a1;
    public int a2;
    public int a3;
    public boolean a4;
    public boolean a5;
    public final int a6;
    public int a7;
    public int a8;
    public Path a9;
    public float aa;
    public int ab;
    public rac ac;
    public cb2 ad;
    public tgb b0;
    public oy8 b1;
    public int b2;
    public ff0 b3;
    public final RectF b4;
    public boolean b5;
    public boolean b6;
    public int b7;
    public int b8;
    public float[] b9;
    public float ba;
    public float bb;
    public ya2 bc;
    public StaticLayout bd;
    public b46 c0;
    public Paint c1;
    public int c2;
    public boolean c3;
    public final RectF c4;
    public boolean c5;
    public int c6;
    public boolean c7;
    public boolean c8;
    public float[] c9;
    public pla ca;
    public float cb;
    public wjb cc;
    public String cd;
    public CornerPathEffect d0;
    public Paint d1;
    public float d2;
    public final uk9 d3;
    public TLObject d4;
    public int d5;
    public byte[] d6;
    public int d7;
    public boolean d8;
    public float d9;
    public Integer da;
    public int db;
    public final boolean dc;
    public b46 dd;
    public int e0;
    public Paint e1;
    public float e2;
    public StaticLayout e3;
    public TLRPC.PhotoSize e4;
    public float e5;
    public byte[] e6;
    public int e7;
    public boolean e8;
    public float e9;
    public Path ea;
    public bb2 eb;
    public final mv6 ec;
    public final Path ed;
    public boolean f;
    public aub f0;
    public tza f1;
    public int f2;
    public int f3;
    public TLRPC.PhotoSize f4;
    public boolean f5;
    public boolean f6;
    public CheckBoxBase[] f7;
    public boolean f8;
    public float f9;
    public float[] fa;
    public final f17 fb;
    public final ArrayList fc;
    public final RectF fd;
    public int g0;
    public boolean g1;
    public StaticLayout g2;
    public int g3;
    public BitmapDrawable g4;
    public boolean g5;
    public boolean g6;
    public ln5 g7;
    public boolean g8;
    public float g9;
    public final float ga;
    public int gb;
    public final Stack gc;
    public Paint gd;
    public boolean h;
    public ibb h0;
    public float h1;
    public StaticLayout h2;
    public boolean h3;
    public String h4;
    public float h5;
    public boolean h6;
    public r86 h7;
    public lm h8;
    public StaticLayout h9;
    public float ha;
    public int hb;
    public final Path hc;
    public int hd;
    public int i0;
    public float i1;
    public float i2;
    public lb2 i3;
    public String i4;
    public int i5;
    public boolean i6;
    public float i7;
    public float i8;
    public int i9;
    public float ia;
    public int ib;
    public boolean ic;
    public i27 id;
    public long j0;
    public boolean j1;
    public float j2;
    public int j3;
    public boolean j4;
    public TLRPC.Poll j5;
    public boolean j6;
    public long j7;
    public float j8;
    public boolean j9;
    public StaticLayout ja;
    public int jb;
    public tg2 jc;
    public boolean jd;
    public int k0;
    public boolean k1;
    public float k2;
    public int k3;
    public float k4;
    public ArrayList k5;
    public boolean k6;
    public ImageReceiver[] k7;
    public TLRPC.PhotoSize k8;
    public boolean k9;
    public int ka;
    public int kb;
    public final sa2 kc;
    public boolean kd;
    public n41 l0;
    public CheckBoxBase l1;
    public float l2;
    public int l3;
    public float l4;
    public int l5;
    public boolean l6;
    public pb0[] l7;
    public int l8;
    public boolean l9;
    public String la;
    public float lb;
    public final sa2 lc;
    public long ld;
    public tl m0;
    public CheckBoxBase m1;
    public boolean m2;
    public i27 m3;
    public long m4;
    public tob m5;
    public boolean m6;
    public boolean[] m7;
    public Drawable m8;
    public StaticLayout m9;
    public qla ma;
    public boolean mb;
    public long mc;
    public long md;
    public int n;
    public boolean n0;
    public boolean n1;
    public n41 n2;
    public i27 n3;
    public long n4;
    public lm n5;
    public boolean n6;
    public StaticLayout n7;
    public n79 n8;
    public final RectF n9;
    public final Path na;
    public float nb;
    public float nc;
    public long nd;
    public int o0;
    public boolean o1;
    public StaticLayout o2;
    public zx8 o3;
    public boolean o4;
    public int o5;
    public boolean o6;
    public qm o7;
    public n79 o8;
    public n41 o9;
    public final float[] oa;
    public int ob;
    public float oc;
    public final RectF od;
    public int p0;
    public float p1;
    public StaticLayout p2;
    public CharSequence p3;
    public boolean p4;
    public int p5;
    public boolean p6;
    public boolean p7;
    public n79 p8;
    public RectF p9;
    public StaticLayout pa;
    public int pb;
    public m17[] pc;
    public final RectF pd;
    public int q0;
    public long q1;
    public StaticLayout q2;
    public i27 q3;
    public gm q4;
    public boolean q5;
    public boolean q6;
    public int q7;
    public n79 q8;
    public lm0 q9;
    public int qa;
    public int qb;
    public boolean qc;
    public Paint qd;
    public n64 r;
    public int r0;
    public int r1;
    public StaticLayout r2;
    public int r3;
    public m46 r4;
    public boolean r5;
    public boolean r6;
    public int r7;
    public n79 r8;
    public int r9;
    public String ra;
    public boolean rb;
    public boolean rc;
    public Paint rd;
    public boolean s;
    public ib2 s0;
    public ec0 s1;
    public float s2;
    public float s3;
    public h27 s4;
    public float s5;
    public boolean s6;
    public boolean s7;
    public boolean s8;
    public float s9;
    public StaticLayout sa;
    public final boolean sb;
    public boolean sc;
    public float sd;
    public kb2 t0;
    public cm2 t1;
    public float t2;
    public float t3;
    public int t4;
    public int t5;
    public long t6;
    public int t7;
    public vva t8;
    public float t9;
    public int ta;
    public float tb;
    public cb2 tc;
    public int td;
    public int u0;
    public nm4 u1;
    public boolean u2;
    public int u3;
    public final i46 u4;
    public float u5;
    public boolean u6;
    public int u7;
    public int u8;
    public float u9;
    public String ua;
    public final nb2 ub;
    public cb2 uc;
    public i27 ud;
    public int v0;
    public boolean v1;
    public RectF v2;
    public int v3;
    public int v4;
    public float v5;
    public boolean v6;
    public int v7;
    public ff0 v8;
    public boolean v9;
    public TLRPC.User va;
    public boolean vb;
    public boolean vc;
    public float vd;
    public dj1 w;
    public int w0;
    public boolean w1;
    public hb2 w2;
    public int w3;
    public final ArrayList w4;
    public int w5;
    public boolean w6;
    public int w7;
    public tgb w8;
    public boolean w9;
    public TLRPC.Chat wa;
    public boolean wb;
    public boolean wc;
    public float wd;
    public final tj2 x;
    public int x0;
    public boolean x1;
    public mb2 x2;
    public StaticLayout x3;
    public final ArrayList x4;
    public int x5;
    public boolean x6;
    public boolean x7;
    public tgb x8;
    public boolean x9;
    public TLRPC.FileLocation xa;
    public boolean xb;
    public int xc;
    public final ax1 xd;
    public boolean y;
    public int y0;
    public boolean y1;
    public byte y2;
    public gn y3;
    public r86 y4;
    public boolean y5;
    public boolean y6;
    public final Rect y7;
    public int y8;
    public float y9;
    public String ya;
    public final lm yb;
    public cb2 yc;
    public RectF yd;
    public int z0;
    public boolean z1;
    public CharSequence z2;
    public gn z3;
    public ArrayList z4;
    public String z5;
    public int z6;
    public boolean z7;
    public int z8;
    public float z9;
    public Object za;
    public h24 zb;
    public Drawable zc;
    public final Path zd;

    public gb2(Context context, int i, boolean z, mv6 mv6Var, wjb wjbVar) {
        super(context);
        boolean z2;
        this.h = true;
        this.x = new tj2((byte) 1);
        s33 s33Var = s33.h;
        this.E = new fm0(0, this, s33Var, 380L, false);
        this.O = new i19(this);
        this.P = new yv4(this);
        this.Q = new aw4(this);
        this.D0 = new Rect();
        this.H0 = -1;
        this.I0 = -1;
        this.T0 = new int[4];
        this.J2 = new Drawable[2];
        this.K2 = new za2[2];
        this.L2 = new int[2];
        this.M2 = new RectF();
        this.N2 = new int[]{16842910, 16842919};
        this.j3 = -1;
        this.k3 = -1;
        this.b4 = new RectF();
        this.c4 = new RectF();
        this.k4 = 1.0f;
        this.l4 = 1.0f;
        this.t4 = -1;
        this.u4 = new i46(this);
        this.w4 = new ArrayList();
        this.x4 = new ArrayList();
        this.B4 = new Path();
        this.P4 = new ArrayList();
        this.Q4 = new ArrayList();
        this.S4 = -1;
        this.T4 = -1;
        this.V4 = true;
        this.I5 = new ArrayList();
        this.c6 = -1;
        this.D6 = true;
        this.I6 = true;
        this.b7 = 100;
        this.y7 = new Rect();
        this.S7 = new AtomicReference();
        this.I8 = new Rect();
        this.J8 = new RectF();
        this.K8 = new Path();
        this.L8 = new float[8];
        this.n9 = new RectF();
        this.C9 = new StaticLayout[2];
        this.I9 = new float[2];
        this.R9 = true;
        this.V9 = new Path();
        this.W9 = new float[8];
        this.ga = 1.0f;
        this.na = new Path();
        this.oa = new float[8];
        this.Ya = new RectF();
        this.Za = new RectF();
        if (Build.VERSION.SDK_INT == 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.sb = z2;
        this.tb = 1.0f;
        this.ub = new nb2(this);
        this.yb = new lm(200L, this, s33.g);
        this.Bb = new wa2(this, (byte) 0);
        this.Ib = new wa2(this, (byte) 1);
        this.Jb = new SparseArray();
        this.Xb = -1;
        this.Zb = new h24();
        this.fc = new ArrayList();
        this.gc = new Stack();
        this.hc = new Path();
        this.kc = new sa2(this, (byte) 11);
        this.lc = new sa2(this, (byte) 2);
        this.sc = false;
        this.Ac = new AtomicReference();
        this.Bc = -1L;
        this.Nc = false;
        this.Oc = new sa2(this, (byte) 0);
        this.Xc = true;
        this.ed = new Path();
        this.fd = new RectF();
        this.hd = -1;
        this.od = new RectF();
        this.pd = new RectF();
        this.sd = 1.0f;
        this.xd = new ax1(Float.class, "animationOffsetX", (byte) 1);
        this.zd = new Path();
        this.a6 = i;
        this.cc = wjbVar;
        this.dc = z;
        this.ec = mv6Var;
        if (mv6Var == null) {
            this.ec = new mv6(context, (byte) 20);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.a = new Paint(1);
        drawable.b = null;
        drawable.h = -1.0f;
        drawable.i = -1.0f;
        drawable.j = -1.0f;
        drawable.k = -1.0f;
        drawable.m = this;
        this.fb = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.A7 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.q0(gl.L(21.0f));
        this.B7 = new pb0((wjb) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.T7 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.q0(gl.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.F7 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.q0(gl.L(26.1f));
        this.Z5 = up3.q(i).k();
        this.X0 = new pb0((wjb) null);
        ml mlVar = new ml(this, this, (byte) 3);
        this.U0 = mlVar;
        mlVar.A1 = true;
        mlVar.m0 = true;
        mlVar.h1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.V0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.m0 = true;
        this.Q0 = new RadialProgress2(this, wjbVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.R0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(gl.L(15.0f));
        xa2 xa2Var = new xa2(this, this);
        this.D4 = xa2Var;
        xa2Var.h = this;
        ?? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.e = false;
        obj.f = false;
        obj.s = 1.0f;
        obj.t = 1.0f;
        lm lmVar = new lm(125L, 600L, s33Var);
        obj.v = lmVar;
        obj.w = 1.0f;
        lm lmVar2 = new lm(150L, s33.f);
        obj.B = lmVar2;
        obj.J = false;
        if (dv9.N == null) {
            dv9.N = new Paint(1);
            dv9.O = new Paint(1);
            Paint paint = dv9.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            dv9.O.setStyle(style);
        }
        this.E4 = obj;
        obj.k = this;
        obj.n = this;
        lmVar2.a = this;
        lmVar.a = this;
        this.F4 = new u7(this, (byte) 1);
        ?? drawable2 = new Drawable();
        drawable2.a = 0L;
        drawable2.b = false;
        drawable2.c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.e = 0.0f;
        drawable2.f = 0.32f;
        drawable2.g = 1;
        drawable2.h = 1;
        drawable2.i = 1;
        drawable2.m = 255;
        drawable2.n = wjbVar;
        drawable2.j = this;
        this.d3 = drawable2;
        setImportantForAccessibility(1);
    }

    public static boolean F2(cb2 cb2Var, float f, float f2) {
        RectF rectF = cb2Var.d;
        if (f >= rectF.left - gl.L(6.0f) && f <= rectF.right + gl.L(6.0f) && f2 >= rectF.top - gl.L(4.0f) && f2 <= rectF.bottom + gl.L(4.0f)) {
            return true;
        }
        return false;
    }

    public static StaticLayout K1(CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int i5 = i;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            staticLayout.getLineDirections(i7);
            if (staticLayout.getLineLeft(i7) != 0.0f || staticLayout.isRtlCharAt(staticLayout.getLineStart(i7)) || staticLayout.isRtlCharAt(staticLayout.getLineEnd(i7))) {
                i5 = i2;
            }
            int lineEnd = staticLayout.getLineEnd(i7);
            if (lineEnd == charSequence.length()) {
                break;
            }
            int i8 = (lineEnd - 1) + i6;
            if (spannableStringBuilder.charAt(i8) == ' ') {
                spannableStringBuilder.replace(i8, i8 + 1, (CharSequence) "\n");
            } else if (spannableStringBuilder.charAt(i8) != '\n') {
                spannableStringBuilder.insert(i8, (CharSequence) "\n");
                i6++;
            }
            if (i7 == staticLayout.getLineCount() - 1 || i7 == i4 - 1) {
                break;
            }
        }
        int i9 = i5;
        return lwa.c(spannableStringBuilder, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, gl.L(1.0f), TextUtils.TruncateAt.END, i9, i4, true);
    }

    public static int M1(c27 c27Var) {
        int i = 0;
        if (c27Var != null) {
            if ((c27Var.l & 2) == 0) {
                i = gl.L(4.0f);
            }
            if ((c27Var.l & 1) == 0) {
                return gl.L(4.0f) + i;
            }
        }
        return i;
    }

    public static int N1(StaticLayout staticLayout) {
        if (staticLayout.getLineCount() <= 0) {
            return 0;
        }
        return (int) Math.ceil(staticLayout.getLineWidth(0));
    }

    public static String N3(k27 k27Var, k27 k27Var2, boolean z, int i) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!k27Var.w1 && !k27Var.q4() && !k27.a4(k27Var.k) && !k27.c5(k27Var.k)) {
            if (!k27Var.r1 || k27Var.k.date != 2147483646) {
                if (k27Var.V != 0) {
                    return k96.T(k27Var.V) + ", " + k96.D0().o0().format(k27Var.V * 1000);
                } else if (k27Var.j2) {
                    return k96.T(k27Var2.k.date) + ", " + k96.D0().o0().format(k27Var2.k.date * 1000);
                } else if (z) {
                    if (na7.q1(k27Var.K1).k4.Y.f) {
                        if (i == 0 && k27Var.Y2()) {
                            i = ConnectionsManager.getInstance(k27Var.K1).getCurrentTime();
                        }
                        return k96.L(i);
                    }
                    return k96.M0(2131751198, null) + " " + k96.D0().o0().format(k27Var2.k.date * 1000);
                } else if (k27Var.n2 && (messageFwdHeader = (message = k27Var.k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(k27.n1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = k27Var.k.fwd_from;
                    int i2 = messageFwdHeader2.saved_date;
                    if (i2 == 0) {
                        i2 = messageFwdHeader2.date;
                    }
                    return k96.O(i2);
                } else {
                    return k96.D0().o0().format(k27Var2.k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static SpannableStringBuilder O3(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            char charAt = spannableStringBuilder.charAt(i);
            if (charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == 8232 || charAt == 8233) {
                spannableStringBuilder.replace(i, i + 1, (CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    public static boolean P2(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_botinvite".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    public static android.graphics.PointF S1(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.S1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean W2() {
        return e66.e(2);
    }

    public static StaticLayout X2(int i, TextPaint textPaint, CharSequence charSequence) {
        SpannableStringBuilder O3 = O3(charSequence);
        if (O3 != null && i > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(O3, textPaint, i, truncateAt);
            int L = gl.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return lwa.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static void Y0(Canvas canvas, StaticLayout staticLayout, float f, float f2) {
        canvas.save();
        canvas.translate(f - staticLayout.getLineLeft(0), ((gl.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public static int[] Z1(Spannable spannable, CharacterStyle characterStyle) {
        int i;
        int i2;
        boolean z;
        vib vibVar;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof e4c) && (vibVar = ((e4c) characterStyle).a) != null && (messageEntity = vibVar.d) != null) {
            i = messageEntity.offset;
            i2 = messageEntity.length + i;
            z = true;
        } else {
            i = 0;
            i2 = 0;
            z = false;
        }
        if (!z) {
            i = spannable.getSpanStart(characterStyle);
            i2 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i, i2};
    }

    private long getAuthorBotVerificationId() {
        k27 k27Var;
        TLRPC.User user = this.va;
        if (user != null) {
            return cf3.c(user);
        }
        if (this.wa != null && (k27Var = this.Q5) != null && k27.B0(k27Var.k) != 1271266957 && this.wa.signature_profiles) {
            long n = cf3.n(this.Q5.k.from_id);
            int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            int i2 = this.a6;
            if (i >= 0) {
                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
                if (V1 != null) {
                    return cf3.c(V1);
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
                if (K0 != null) {
                    return cf3.c(K0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.va;
        if (user != null) {
            return l7c.r(user);
        }
        TLRPC.Chat chat = this.wa;
        k27 k27Var = this.Q5;
        if (chat != null) {
            if (k27Var != null && k27.B0(k27Var.k) != 1271266957 && this.wa.signature_profiles) {
                long n = cf3.n(this.Q5.k.from_id);
                int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                int i2 = this.a6;
                if (i >= 0) {
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
                    if (V1 != null) {
                        return l7c.r(V1);
                    }
                } else {
                    TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
                    if (K0 != null) {
                        return K0.title;
                    }
                }
            }
            return this.wa.title;
        } else if (k27Var != null && k27Var.q4()) {
            return this.Q5.S0;
        } else {
            return "DELETED";
        }
    }

    private Object getAuthorStatus() {
        k27 k27Var;
        TLRPC.User user = this.va;
        if (user != null) {
            Long i = l7c.i(user);
            TLRPC.User user2 = this.va;
            if (i != null) {
                TLRPC.EmojiStatus emojiStatus = user2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return i;
            } else if (user2.premium) {
                return a.b.getDrawable(2131232312).mutate();
            } else {
                return null;
            }
        } else if (this.wa != null && (k27Var = this.Q5) != null && k27.B0(k27Var.k) != 1271266957 && this.wa.signature_profiles) {
            long n = cf3.n(this.Q5.k.from_id);
            int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            int i3 = this.a6;
            if (i2 >= 0) {
                TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(n));
                if (V1 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = V1.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return l7c.i(V1);
            }
            TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-n));
            if (K0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = K0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(cf3.f(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private int getCommentButtonHeight() {
        float f;
        if (v2()) {
            return gl.L(24.0f);
        }
        if (I3()) {
            f = 41.3f;
        } else {
            f = 43.0f;
        }
        return gl.L(f);
    }

    private int getCompactHeaderColor() {
        return bm2.k(bkb.v0(bkb.Ra, this.cc), bkb.v0(bkb.ta, this.cc));
    }

    private int getCompactInShift() {
        if (v2()) {
            return (gl.L(16.0f) - gl.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactNameTimeWidth() {
        int i;
        if (y2() && (i = this.M9) > 0) {
            return gl.L(6.0f) + i;
        }
        return 0;
    }

    private float getCompactNameTimeX() {
        float compactLeft = getCompactLeft();
        if (this.x9) {
            compactLeft += getNameAvatarOffset();
        }
        if (this.Aa != 0) {
            compactLeft += gl.L(20.0f);
        }
        if (this.h9 != null) {
            compactLeft += this.i9;
        }
        if (this.za != null && this.R6 <= 0) {
            compactLeft += gl.L(20.0f);
        }
        if (this.m9 != null) {
            int i = 0;
            float lineWidth = this.m9.getLineWidth(0) + gl.L(8.0f);
            if (this.j9) {
                i = gl.L(6.0f);
            }
            compactLeft += lineWidth + i;
        }
        return compactLeft + gl.L(6.0f);
    }

    private float getCompactNameTimeY() {
        float f;
        if (this.J) {
            f = 9.0f;
        } else {
            f = 10.0f;
        }
        float L = gl.L(f) + this.xc + this.ub.k0;
        StaticLayout staticLayout = this.h9;
        if (staticLayout != null && this.L9 != null && staticLayout.getLineCount() > 0 && this.L9.getLineCount() > 0) {
            L += this.h9.getLineBaseline(0) - this.L9.getLineBaseline(0);
        }
        f27 f27Var = this.L;
        if (f27Var != null) {
            e27 e27Var = f27Var.m;
            if (e27Var.j) {
                return (e27Var.f - getTranslationY()) + L;
            }
        }
        return L;
    }

    private int getCompactSideButtonColumn() {
        k27 k27Var;
        if (this.Kb && this.R8 != 0 && (k27Var = this.Q5) != null && k27Var.S4()) {
            return gl.L(40.0f);
        }
        return 0;
    }

    private float getCompactSideMenuShift() {
        if (v2()) {
            return gl.L(71.0f) * this.Z6;
        }
        return 0.0f;
    }

    private int getCompactSideMenuWidth() {
        if (this.Y6) {
            return gl.L(71.0f);
        }
        return 0;
    }

    private vu1 getDraftMessageMeasureController() {
        bb2 bb2Var = this.eb;
        if (bb2Var != null) {
            return bb2Var.X();
        }
        return null;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        ColorMatrixColorFilter colorMatrixColorFilter = this.W0;
        if (colorMatrixColorFilter == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            gl.l2(colorMatrix, 0.9f);
            gl.i(colorMatrix, 0.6f);
            ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
            this.W0 = colorMatrixColorFilter2;
            return colorMatrixColorFilter2;
        }
        return colorMatrixColorFilter;
    }

    private cm2 getForwardVerifiedSpan() {
        cm2 cm2Var = this.t1;
        if (cm2Var == null) {
            fm2 fm2Var = new fm2(getContext().getResources().getDrawable(2131232796).mutate(), getContext().getResources().getDrawable(2131232797).mutate());
            fm2Var.x = true;
            cm2Var = new cm2(0, fm2Var);
            this.t1 = cm2Var;
            cm2Var.d = false;
        }
        fm2 fm2Var2 = (fm2) cm2Var.c;
        Drawable drawable = fm2Var2.a;
        int v0 = bkb.v0(bkb.y9, this.cc);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
        fm2Var2.b.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.z9, this.cc), mode));
        this.t1.c((int) (bkb.W2.getTextSize() * 0.95f));
        return this.t1;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.t1) {
            parentWidth = this.L0;
        }
        if (!gl.E && gl.O1()) {
            if (!gl.N1() || getResources().getConfiguration().orientation == 2) {
                return parentWidth - gl.k1(parentWidth, 0, 0);
            }
            return parentWidth;
        }
        return parentWidth;
    }

    private float getNameAvatarOffset() {
        float f;
        if (w2()) {
            f = 21.0f;
        } else {
            f = 32.33f;
        }
        return gl.L(f);
    }

    private int getNameHeight() {
        if (this.x9 && !w2()) {
            if (this.m9 == null) {
                return gl.L(31.0f);
            }
            return gl.L(37.66f);
        }
        return (int) (bkb.V2.getTextSize() + gl.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f;
        float f2;
        nb2 nb2Var = this.ub;
        boolean z = nb2Var.Q2;
        boolean z2 = this.x9;
        float f3 = 0.0f;
        if (z) {
            f = gl.T1(!z2, z2, nb2Var.L1);
        } else if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float textSize = bkb.V2.getTextSize() + gl.L(5.0f);
        if (this.m9 == null) {
            f2 = 31.0f;
        } else {
            f2 = 35.0f;
        }
        float L = gl.L(f2);
        if (!w2()) {
            f3 = f;
        }
        return gl.R1(textSize, L, f3);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        f27 f27Var = this.L;
        if (f27Var != null && !f27Var.d.isEmpty() && (messageReplies = ((k27) this.L.d.get(0)).k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.Q5.k.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    private int getSelectionOverlayColor() {
        int i;
        wjb wjbVar = this.cc;
        if (wjbVar == null) {
            return 0;
        }
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.N3()) {
            i = bkb.Oc;
        } else {
            i = bkb.ra;
        }
        return wjbVar.h(i);
    }

    private float getUseTranscribeButtonProgress() {
        nb2 nb2Var = this.ub;
        boolean z = nb2Var.o1;
        boolean z2 = this.I4;
        if (z) {
            float f = nb2Var.L1;
            if (z2) {
                return f;
            }
            return 1.0f - f;
        } else if (z2) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static void q0(ImageReceiver imageReceiver) {
        Bitmap n;
        if (imageReceiver != null && (n = imageReceiver.n()) != null) {
            n.recycle();
            imageReceiver.g0(null);
        }
    }

    public static boolean q2(float f, float f2, float f3, float f4) {
        if (f <= f3) {
            if (f2 >= f3) {
                return true;
            }
            return false;
        } else if (f <= f4) {
            return true;
        } else {
            return false;
        }
    }

    public static db2 x0(int i, String str, int i2, float f) {
        db2 db2Var = new db2();
        db2Var.a = i;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, bkb.L2, i2, TextUtils.TruncateAt.END), bkb.L2, gl.L(2.0f) + i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        db2Var.d = staticLayout;
        db2Var.b = f;
        if (staticLayout.getLineCount() > 0) {
            db2Var.c = ((float) (db2Var.b - Math.ceil(db2Var.d.getLineWidth(0)))) / 2.0f;
            db2Var.c -= (int) db2Var.d.getLineLeft(0);
        }
        return db2Var;
    }

    public final void A(float f, float f2, int i, int i2) {
        wjb wjbVar = this.cc;
        int i3 = this.W;
        if (wjbVar != null) {
            wjbVar.b(f, f2 + i3 + this.g0 + this.i0, i, i2);
        } else {
            bkb.q(f, f2 + i3 + this.g0 + this.i0, i, i2);
        }
    }

    public final void A0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] t = fl5.z().t(ba4.B(document));
        if (t != null) {
            z0(t[0], t[1]);
        } else {
            z0(this.Q5.H0, document.size);
        }
    }

    public void A1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.A1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean A2() {
        if (((isPressed() && this.D6) || ((!this.D6 && this.w6) || this.x6)) && !M3() && !n2()) {
            k27 k27Var = this.Q5;
            if (k27Var == null || !k27Var.t1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A3(int i) {
        this.n = i;
    }

    @Override
    public final void B(boolean z) {
        boolean z2;
        byte b = this.M1;
        if (b != 3 && b != 5) {
            z2 = false;
        } else {
            z2 = true;
        }
        R3(true, z2, false);
    }

    public final void B0(int i) {
        int i2;
        int v0;
        int i3;
        int i4;
        int i5;
        if (this.Q5.F4()) {
            if (this.Q5.O3()) {
                i5 = bkb.Nb;
            } else {
                i5 = bkb.Ad;
            }
            v0 = bkb.v0(i5, this.cc);
        } else {
            if (i == 0) {
                if (this.E5) {
                    if (this.Q5.O3()) {
                        i3 = bkb.Hb;
                    } else {
                        i3 = bkb.nd;
                    }
                    v0 = bkb.v0(i3, this.cc);
                } else {
                    n79 n79Var = this.o8;
                    if (n79Var != null) {
                        v0 = n79Var.h();
                    } else {
                        n79 n79Var2 = this.q8;
                        if (n79Var2 != null) {
                            v0 = n79Var2.h();
                        }
                    }
                }
            }
            if (this.Q5.O3()) {
                i2 = bkb.Nb;
            } else {
                i2 = bkb.Ad;
            }
            v0 = bkb.v0(i2, this.cc);
        }
        Drawable[] drawableArr = this.J2;
        Drawable drawable = drawableArr[i];
        if (drawable == null) {
            za2 za2Var = new za2(this, i);
            za2[] za2VarArr = this.K2;
            za2VarArr[i] = za2Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.Q5.O3()) {
                i4 = bkb.Nb;
            } else {
                i4 = bkb.Ad;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{bkb.v0(i4, this.cc) & 436207615}), null, za2VarArr[i]);
            drawableArr[i] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            bkb.F1(drawable, v0 & 436207615, true);
        }
        drawableArr[i].setVisible(true, false);
    }

    public final void B1(Canvas canvas, float f, boolean z, float f2, StaticLayout staticLayout, float f3, boolean z2) {
        int i;
        float f4;
        RectF rectF;
        int i2;
        char c;
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        float L;
        int i6;
        float f5;
        boolean z3;
        nb2 nb2Var;
        int i7;
        float f6;
        boolean z4;
        float f7;
        boolean z5;
        int i8;
        gb2 gb2Var;
        String str;
        float f8;
        float L2;
        nb2 nb2Var2;
        boolean z6;
        float f9;
        int i9;
        nb2 nb2Var3;
        boolean z7;
        float f10;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Paint c22;
        float f11;
        float f12;
        int L3;
        boolean z13;
        float photoBottom;
        int i11;
        int i12;
        float f13;
        boolean z14;
        nb2 nb2Var4;
        float f14;
        float f15;
        boolean z15;
        int i13;
        boolean z16;
        k27 k27Var;
        TextPaint textPaint;
        int i14;
        int i15;
        gb2 gb2Var2 = this;
        Canvas canvas2 = canvas;
        if (((!gb2Var2.R9 || gb2Var2.N) && gb2Var2.I3()) || staticLayout == null) {
            return;
        }
        k27 k27Var2 = gb2Var2.Q5;
        if ((!k27Var2.Z || gb2Var2.M == null) && (i = k27Var2.D) != 16) {
            if (i == 5) {
                TextPaint textPaint2 = bkb.S2;
                if (gb2Var2.v2()) {
                    i14 = gb2Var2.Q5.O3() ? bkb.ic : bkb.de;
                } else {
                    i14 = bkb.Yc;
                }
                int v0 = bkb.v0(i14, gb2Var2.cc);
                boolean A2 = gb2Var2.A2();
                k27 k27Var3 = gb2Var2.Q5;
                if (A2) {
                    i15 = k27Var3.O3() ? bkb.dc : bkb.ee;
                } else {
                    i15 = k27Var3.O3() ? bkb.ic : bkb.de;
                }
                textPaint2.setColor(bm2.f(gb2Var2.getVideoTranscriptionProgress(), v0, bkb.v0(i15, gb2Var2.cc)));
            } else {
                boolean I3 = gb2Var2.I3();
                k27 k27Var4 = gb2Var2.Q5;
                if (I3) {
                    if (k27Var4.O5()) {
                        bkb.S2.setColor(bkb.v0(bkb.Yc, gb2Var2.cc));
                    } else {
                        bkb.S2.setColor(bkb.v0(bkb.ae, gb2Var2.cc));
                    }
                } else if (k27Var4.O3()) {
                    bkb.S2.setColor(bkb.v0(z2 ? bkb.dc : bkb.ic, gb2Var2.cc));
                } else {
                    bkb.S2.setColor(bkb.v0(z2 ? bkb.ee : bkb.de, gb2Var2.cc));
                }
            }
            if (gb2Var2.y2()) {
                bkb.S2.setColor(bkb.v0(z2 ? bkb.ce : bkb.be, gb2Var2.cc));
            }
            float f16 = gb2Var2.getTransitionParams().K1 ? gb2Var2.getTransitionParams().L1 * f : f;
            if (f16 != 1.0f) {
                bkb.S2.setAlpha((int) (textPaint.getAlpha() * f16));
            }
            canvas2.save();
            if (gb2Var2.K && !gb2Var2.I3() && !gb2Var2.y2()) {
                canvas2.translate(0.0f, gl.L(2.0f));
            }
            float f17 = gb2Var2.e7;
            nb2 nb2Var5 = gb2Var2.ub;
            if (nb2Var5.x0) {
                f17 += nb2Var5.j0;
            }
            f27 f27Var = gb2Var2.L;
            if (f27Var == null || !f27Var.m.j) {
                f4 = f2;
            } else {
                f17 -= gb2Var2.getTranslationY();
                f4 = f2 + gb2Var2.L.m.g;
            }
            float f18 = f17;
            float f19 = f4;
            if (gb2Var2.K && gb2Var2.I3()) {
                f18 += gl.L(1.0f);
            }
            float f20 = f18;
            if (nb2Var5.x0) {
                float f21 = gb2Var2.wd;
                f4 += f21;
                f19 += f21;
            }
            float f22 = f4;
            boolean N5 = gb2Var2.Q5.N5();
            i19 i19Var = gb2Var2.O;
            if (N5) {
                i19Var.getClass();
            }
            if (nb2Var5.U0) {
                f19 = ls6.B(1.0f, nb2Var5.L1, nb2Var5.Z0, f19);
            }
            float f23 = f19;
            boolean I32 = gb2Var2.I3();
            RectF rectF2 = gb2Var2.c4;
            ml mlVar = gb2Var2.U0;
            if (I32) {
                if (gb2Var2.x7) {
                    i10 = gb2Var2.v2() ? gb2Var2.getCommentButtonHeight() : gl.L(41.3f);
                } else {
                    i10 = 0;
                }
                int i16 = -i10;
                if (gb2Var2.Q5.O5()) {
                    c22 = gb2Var2.c2("paintChatActionBackground");
                } else {
                    c22 = gb2Var2.c2("paintChatTimeBackground");
                }
                int alpha = c22.getAlpha();
                float f24 = f16;
                bkb.S2.setAlpha((int) (gb2Var2.k4 * 255.0f * f24));
                k27 k27Var5 = gb2Var2.Q5;
                if (k27Var5 == null || k27Var5.D != 4) {
                    f11 = f20;
                    f12 = f24;
                } else {
                    float f25 = mlVar.G() ? 1.0f : mlVar.i1;
                    if (!mlVar.E()) {
                        f25 = 0.0f;
                    }
                    f11 = f20;
                    f12 = gl.R1(0.35f, 1.0f, f25);
                }
                k27 k27Var6 = gb2Var2.Q5;
                if (k27Var6 != null && k27Var6.B0) {
                    tl tlVar = gb2Var2.m0;
                    f12 *= tlVar == null ? 0.0f : tlVar.e();
                }
                c22.setAlpha((int) yjb.C(alpha, gb2Var2.k4, f12, 0.6f));
                if (gb2Var2.g4()) {
                    int L4 = gl.L(8.0f);
                    int i17 = gba.U0;
                    if (i17 > 2) {
                        i17 -= 2;
                    }
                    L3 = Math.min(L4, gl.L(i17));
                    z13 = gba.U0 >= 10;
                    i2 = 2;
                } else {
                    byte b = gb2Var2.M1;
                    if (b != 7 && b != 6 && gb2Var2.Q5.D != 19) {
                        int[] iArr = mlVar.X0;
                        i2 = 2;
                        L3 = Math.min(gl.L(8.0f), Math.max(iArr[2], iArr[3]));
                        z13 = gba.U0 >= 10;
                    } else {
                        i2 = 2;
                        int L5 = gl.L(4.0f);
                        k27 k27Var7 = gb2Var2.Q5;
                        L3 = L5 + ((k27Var7 == null || !k27Var7.M2()) ? 0 : gl.L(8.0f));
                        z13 = false;
                    }
                }
                k27 k27Var8 = gb2Var2.Q5;
                float L6 = f22 + ((k27Var8 == null || !k27Var8.M2()) ? 0 : gl.L(-6.0f));
                if (gb2Var2.j0 != 0) {
                    L6 -= gl.L(18.0f);
                }
                float L7 = L6 - gl.L(z13 ? 6.0f : 4.0f);
                k27 k27Var9 = gb2Var2.Q5;
                float L8 = (k27Var9 == null || !k27Var9.M2()) ? 0.0f : gl.L(2.0f);
                float f26 = f12;
                float f27 = L6;
                if (gb2Var2.M1 != 7 || ((k27Var = gb2Var2.Q5) != null && k27Var.f4())) {
                    photoBottom = gb2Var2.getPhotoBottom() + gb2Var2.w0;
                } else {
                    photoBottom = f11 - ((1.0f - gb2Var2.getVideoTranscriptionProgress()) * (i19Var.i(nb2Var5.L1) + gl.L(gb2Var2.K ? 4.0f : 5.0f)));
                }
                float f28 = photoBottom;
                float L9 = f28 - gl.L(23.0f);
                float max = Math.max(gl.L(17.0f), bkb.S2.getTextSize() + gl.L(5.0f));
                float f29 = L7 - L8;
                float f30 = L8 + L7 + f3;
                int i18 = z13 ? 12 : 8;
                if (gb2Var2.Q5.O3()) {
                    i11 = i18;
                    i12 = (gb2Var2.Q5.D == 19 ? 4 : 0) + 20;
                } else {
                    i11 = i18;
                    i12 = 0;
                }
                rectF2.set(f29, L9, f30 + gl.L(i11 + i12), L9 + max);
                fb5 fb5Var = gb2Var2.X5;
                if (fb5Var != null) {
                    float f31 = L3;
                    canvas2.save();
                    Path path = fb5Var.t;
                    path.rewind();
                    path.addRoundRect(rectF2, f31, f31, Path.Direction.CW);
                    canvas2.clipPath(path);
                    canvas2.drawColor(1073741824);
                    canvas2.restore();
                } else if (!k27.a4(gb2Var2.Q5.k)) {
                    if (gb2Var2.Q5.t2() && gb2Var2.Q5.D != 5) {
                        Path path2 = gb2Var2.B4;
                        path2.rewind();
                        float f32 = L3;
                        path2.addRoundRect(rectF2, f32, f32, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path2);
                        ImageReceiver imageReceiver = gb2Var2.Q5.l5() ? mlVar : gb2Var2.V0;
                        float alpha2 = imageReceiver.getAlpha();
                        imageReceiver.setAlpha(0.5f * alpha2);
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(alpha2);
                        canvas2.restore();
                        Paint c23 = gb2Var2.c2("paintChatTimeBackground");
                        int alpha3 = c23.getAlpha();
                        c23.setAlpha((int) (alpha3 * gb2Var2.l4 * 0.4f));
                        canvas2.drawRoundRect(rectF2, f32, f32, c23);
                        c23.setAlpha(alpha3);
                    } else {
                        gb2Var2.z();
                        float f33 = L3;
                        canvas2.drawRoundRect(rectF2, f33, f33, c22);
                        if (c22 == gb2Var2.c2("paintChatActionBackground") && gb2Var2.i2()) {
                            int alpha4 = bkb.g2.getAlpha();
                            bkb.g2.setAlpha((int) (alpha4 * gb2Var2.k4 * f26));
                            canvas2.drawRoundRect(rectF2, f33, f33, bkb.g2);
                            bkb.g2.setAlpha(alpha4);
                        }
                    }
                }
                c22.setAlpha(alpha);
                float f34 = -staticLayout.getLineLeft(0);
                k27 k27Var10 = gb2Var2.Q5;
                float L10 = f34 + ((k27Var10 == null || !k27Var10.M2()) ? 0 : gl.L(-6.0f));
                if (gb2Var2.Q5.N5()) {
                    i19Var.getClass();
                }
                if ((!hc2.T(gb2Var2.wa) || gb2Var2.wa.megagroup) && (gb2Var2.Q5.k.flags & 1024) == 0 && gb2Var2.sa == null && !gb2Var2.q6) {
                    f13 = L10;
                    rectF = rectF2;
                    f16 = f24;
                    f20 = f11;
                    i5 = i16;
                    z14 = false;
                    c = 6;
                    c2 = 7;
                    c3 = 4;
                } else {
                    float lineWidth = (gb2Var2.M9 - staticLayout.getLineWidth(0)) + L10;
                    i19Var.getClass();
                    int b2 = nb2Var5.b();
                    int i19 = nb2Var5.b2;
                    if (i19 >= 0 && i19 != b2 && !gb2Var2.Fb) {
                        gb2Var2.C0(i19, b2, z);
                    }
                    boolean z17 = gb2Var2.Fb;
                    if (z17) {
                        b2 = gb2Var2.Cb;
                    }
                    boolean z18 = (b2 & 4) != 0;
                    boolean z19 = (b2 & 8) != 0;
                    if (z17) {
                        int i20 = gb2Var2.Db;
                        if ((i20 & 4) != 0) {
                            i13 = i20;
                            z16 = true;
                        } else {
                            i13 = i20;
                            z16 = false;
                        }
                        boolean z20 = (i13 & 8) != 0;
                        float f35 = i16;
                        nb2Var4 = nb2Var5;
                        f14 = lineWidth;
                        rectF = rectF2;
                        float f36 = f11;
                        c = 6;
                        c3 = 4;
                        z14 = false;
                        i5 = i16;
                        c2 = 7;
                        gb2Var2.T0(canvas2, z16, z20, f36, f24, f35, f27, 1.0f - gb2Var2.Eb, z2);
                        boolean z21 = z16;
                        boolean z22 = z20;
                        boolean z23 = z18;
                        boolean z24 = z19;
                        gb2Var2.T0(canvas, z23, z24, f36, f24, f35, f27, gb2Var2.Eb, z2);
                        f20 = f36;
                        f15 = f27;
                        z15 = z23;
                        f16 = f24;
                        if (!gb2Var2.Q5.O3()) {
                            if (!z21 && !z22) {
                                gb2Var2.D1(canvas, f16, f35, f15, 1.0f - gb2Var2.Eb, z2);
                            }
                            if (!z15 && !z24) {
                                gb2Var2.D1(canvas, f16, f35, f15, gb2Var2.Eb, z2);
                            }
                        }
                    } else {
                        nb2Var4 = nb2Var5;
                        f14 = lineWidth;
                        rectF = rectF2;
                        boolean z25 = z18;
                        boolean z26 = z19;
                        float f37 = f11;
                        i5 = i16;
                        c = 6;
                        c2 = 7;
                        c3 = 4;
                        z14 = false;
                        if (!gb2Var2.Q5.O3() && !z25 && !z26) {
                            gb2Var2.D1(canvas, f24, i5, f27, 1.0f, z2);
                        }
                        gb2Var2 = this;
                        gb2Var2.T0(canvas, z25, z26, f37, f24, i5, f27, 1.0f, z2);
                        f20 = f37;
                        f15 = f27;
                        z15 = z25;
                        f16 = f24;
                    }
                    if (gb2Var2.Q5.O3()) {
                        canvas2 = canvas;
                        gb2Var2.D1(canvas2, f16, i5, f15, 1.0f, z2);
                    } else {
                        canvas2 = canvas;
                    }
                    nb2Var5 = nb2Var4;
                    nb2Var5.b2 = nb2Var4.b();
                    if (z15 && z && gb2Var2.getParent() != null) {
                        ((View) gb2Var2.getParent()).invalidate();
                    }
                    f13 = f14;
                }
                canvas2.save();
                float f38 = f23 + f13;
                gb2Var2.J9 = f38;
                float L11 = (f28 - gl.L(7.3f)) - staticLayout.getHeight();
                gb2Var2.K9 = L11;
                canvas2.translate(f38, L11);
                qla.f(canvas2, staticLayout);
                canvas2.restore();
                bkb.S2.setAlpha(255);
                z3 = z13;
                i8 = z14;
            } else {
                rectF = rectF2;
                i2 = 2;
                c = 6;
                c2 = 7;
                c3 = 4;
                if (gb2Var2.Q5.q4()) {
                    i4 = -gl.L(48.0f);
                    if (gb2Var2.c7) {
                        i4 -= gl.L(4.0f);
                    }
                } else {
                    if (gb2Var2.x7) {
                        i3 = gb2Var2.v2() ? gb2Var2.getCommentButtonHeight() : gl.L(43.0f);
                    } else {
                        i3 = 0;
                    }
                    i4 = -i3;
                }
                i5 = i4;
                if (gb2Var2.y2()) {
                    L = gb2Var2.getCompactNameTimeY();
                } else {
                    L = ((f20 - gl.L((gb2Var2.G || gb2Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i5;
                }
                float f39 = -staticLayout.getLineLeft(0);
                if (gb2Var2.Q5.N5()) {
                    i19Var.getClass();
                }
                if ((!hc2.T(gb2Var2.wa) || gb2Var2.wa.megagroup) && (gb2Var2.Q5.k.flags & 1024) == 0 && gb2Var2.sa == null && !nb2Var5.G && !gb2Var2.q6 && !nb2Var5.C) {
                    i6 = 0;
                    f5 = L;
                } else {
                    float lineWidth2 = (f3 - staticLayout.getLineWidth(0)) + f39;
                    i19Var.getClass();
                    int b3 = nb2Var5.b();
                    int i21 = nb2Var5.b2;
                    if (i21 >= 0 && i21 != b3 && !gb2Var2.Fb) {
                        gb2Var2.C0(i21, b3, z);
                    }
                    boolean z27 = gb2Var2.Fb;
                    if (z27) {
                        b3 = gb2Var2.Cb;
                    }
                    boolean z28 = (b3 & 4) != 0;
                    boolean z29 = (b3 & 8) != 0;
                    if (z27) {
                        int i22 = gb2Var2.Db;
                        boolean z30 = (i22 & 4) != 0;
                        if ((i22 & 8) != 0) {
                            f7 = L;
                            z5 = true;
                        } else {
                            f7 = L;
                            z5 = false;
                        }
                        float f40 = i5;
                        nb2Var = nb2Var5;
                        i7 = 0;
                        f5 = f7;
                        float f41 = f16;
                        boolean z31 = z30;
                        gb2Var2.T0(canvas2, z31, z5, f20, f41, f40, f22, 1.0f - gb2Var2.Eb, z2);
                        boolean z32 = z5;
                        boolean z33 = z28;
                        boolean z34 = z29;
                        gb2Var2.T0(canvas, z33, z34, f20, f41, f40, f22, gb2Var2.Eb, z2);
                        f20 = f20;
                        f6 = f22;
                        z4 = z33;
                        f16 = f41;
                        if (!gb2Var2.Q5.O3()) {
                            if (!z31 && !z32) {
                                gb2Var2.D1(canvas, f16, f40, f6, 1.0f - gb2Var2.Eb, z2);
                            }
                            if (!z4 && !z34) {
                                gb2Var2.D1(canvas, f16, f40, f6, gb2Var2.Eb, z2);
                            }
                        }
                    } else {
                        nb2Var = nb2Var5;
                        i7 = 0;
                        boolean z35 = z28;
                        boolean z36 = z29;
                        f5 = L;
                        if (!gb2Var2.Q5.O3() && !z35 && !z36) {
                            gb2Var2.D1(canvas, f16, i5, f22, 1.0f, z2);
                        }
                        gb2Var2 = this;
                        float f42 = f16;
                        gb2Var2.T0(canvas, z35, z36, f20, f42, i5, f22, 1.0f, z2);
                        f20 = f20;
                        f6 = f22;
                        z4 = z35;
                        f16 = f42;
                    }
                    if (gb2Var2.Q5.O3()) {
                        canvas2 = canvas;
                        gb2Var2.D1(canvas2, f16, i5, f6, 1.0f, z2);
                    } else {
                        canvas2 = canvas;
                    }
                    nb2Var5 = nb2Var;
                    nb2Var5.b2 = nb2Var.b();
                    if (z4 && z && gb2Var2.getParent() != null) {
                        ((View) gb2Var2.getParent()).invalidate();
                    }
                    f39 = lineWidth2;
                    i6 = i7;
                }
                canvas2.save();
                if (nb2Var5.U0 && nb2Var5.L1 != 1.0f) {
                    if (nb2Var5.V0 != null) {
                        canvas2.translate(f23 + f39, f5);
                        int alpha5 = bkb.S2.getAlpha();
                        bkb.S2.setAlpha((int) (alpha5 * nb2Var5.L1));
                        nb2Var5.V0.draw(canvas2);
                        bkb.S2.setAlpha(alpha5);
                        qla.f(canvas2, nb2Var5.W0);
                    } else {
                        int alpha6 = bkb.S2.getAlpha();
                        canvas2.save();
                        canvas2.translate(nb2Var5.h1 + f39, f5);
                        float f43 = alpha6;
                        bkb.S2.setAlpha((int) ((1.0f - nb2Var5.L1) * f43));
                        qla.f(canvas2, nb2Var5.W0);
                        canvas2.restore();
                        canvas2.translate(f23 + f39, f5);
                        bkb.S2.setAlpha((int) (f43 * nb2Var5.L1));
                        qla.f(canvas2, staticLayout);
                        bkb.S2.setAlpha(alpha6);
                    }
                } else {
                    float f44 = f23 + f39;
                    gb2Var2.J9 = f44;
                    gb2Var2.K9 = f5;
                    canvas2.translate(f44, f5);
                    qla.f(canvas2, staticLayout);
                }
                canvas2.restore();
                z3 = i6 == 1 ? 1 : 0;
                i8 = i6;
            }
            int i23 = i5;
            if (gb2Var2.Q5.O3()) {
                int b4 = nb2Var5.b();
                int i24 = nb2Var5.b2;
                if (i24 >= 0 && i24 != b4 && !gb2Var2.Fb) {
                    gb2Var2.C0(i24, b4, z);
                }
                if (gb2Var2.Fb) {
                    b4 = gb2Var2.Cb;
                }
                int i25 = (b4 & 1) != 0 ? true : i8;
                int i26 = (b4 & 2) != 0 ? true : i8;
                if ((b4 & 4) != 0) {
                    nb2Var2 = nb2Var5;
                    z6 = true;
                } else {
                    nb2Var2 = nb2Var5;
                    z6 = i8;
                }
                boolean z37 = (b4 & 8) != 0 ? true : i8;
                if (gb2Var2.Uc != 0.0f) {
                    canvas2.save();
                    f9 = 0.0f;
                    canvas2.translate(0.0f, gb2Var2.Uc);
                    i9 = 1;
                } else {
                    f9 = 0.0f;
                    i9 = i8;
                }
                if (gb2Var2.Fb) {
                    int i27 = gb2Var2.Db;
                    if ((i27 & 1) != 0) {
                        z7 = i26;
                        f10 = f16;
                        z8 = true;
                    } else {
                        z7 = i26;
                        f10 = f16;
                        z8 = i8;
                    }
                    boolean z38 = (i27 & 2) != 0 ? true : i8;
                    if ((i27 & 4) != 0) {
                        z9 = z6;
                        z10 = true;
                    } else {
                        z9 = z6;
                        z10 = i8;
                    }
                    if ((i27 & 8) != 0) {
                        z11 = z37;
                        z12 = true;
                    } else {
                        z11 = z37;
                        z12 = i8;
                    }
                    if (!z10 && z38 && z7 && !z8 && i25) {
                        nb2Var3 = nb2Var2;
                        f8 = f9;
                        z6 = z9;
                        str = "paintChatTimeBackground";
                        gb2Var2.z1(canvas2, i25, z7, z6, z11, f10, z3, i23, f20, gb2Var2.Eb, true, z2);
                    } else {
                        nb2Var3 = nb2Var2;
                        f8 = f9;
                        boolean z39 = z7;
                        boolean z40 = i25;
                        str = "paintChatTimeBackground";
                        float f45 = i23;
                        gb2Var2.z1(canvas, z8, z38, z10, z12, f10, z3, f45, f20, 1.0f - gb2Var2.Eb, false, z2);
                        z6 = z9;
                        gb2Var2.z1(canvas, z40, z39, z6, z11, f10, z3, f45, f20, gb2Var2.Eb, false, z2);
                    }
                    gb2Var = this;
                    canvas2 = canvas;
                } else {
                    nb2Var3 = nb2Var2;
                    f8 = f9;
                    str = "paintChatTimeBackground";
                    canvas2 = canvas;
                    z1(canvas2, i25, i26, z6, z37, f16, z3, i23, f20, 1.0f, false, z2);
                    gb2Var = this;
                }
                if (i9 != 0) {
                    canvas2.restore();
                }
                nb2Var3.b2 = nb2Var3.b();
                if (z && z6 && gb2Var.getParent() != null) {
                    ((View) gb2Var.getParent()).invalidate();
                }
            } else {
                gb2Var = gb2Var2;
                str = "paintChatTimeBackground";
                f8 = 0.0f;
            }
            canvas2.restore();
            if (gb2Var.ja != null) {
                if (gb2Var.ha == f8 || gb2Var.ia == f8) {
                    gb2Var.G();
                }
                Path path3 = gb2Var.na;
                path3.rewind();
                RectF rectF3 = gl.P;
                rectF3.set(mlVar.L0, mlVar.M0, mlVar.w(), mlVar.x());
                int[] iArr2 = mlVar.X0;
                float f46 = iArr2[i8];
                float[] fArr = gb2Var.oa;
                fArr[1] = f46;
                fArr[i8] = f46;
                float f47 = iArr2[1];
                fArr[3] = f47;
                fArr[i2] = f47;
                float f48 = iArr2[i2];
                fArr[5] = f48;
                fArr[c3] = f48;
                float f49 = iArr2[3];
                fArr[c2] = f49;
                fArr[c] = f49;
                Path.Direction direction = Path.Direction.CW;
                path3.addRoundRect(rectF3, fArr, direction);
                canvas2.save();
                canvas2.clipPath(path3);
                path3.rewind();
                rectF3.set(gb2Var.ha - gl.L(12.0f), gb2Var.ia - gl.L(8.0f), gb2Var.ha + bkb.K3.getIntrinsicWidth() + gl.L(14.0f) + gb2Var.ja.getWidth() + gl.L(12.0f), gb2Var.ia + gb2Var.ja.getHeight() + gl.L(8.0f));
                path3.addRoundRect(rectF3, gl.L(32.0f), gl.L(32.0f), direction);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                if (gb2Var.ca == null) {
                    qla qlaVar = gb2Var.ma;
                    if (qlaVar == null) {
                        qlaVar = new qla();
                        gb2Var.ma = qlaVar;
                    }
                    qlaVar.h(bm2.o(-1, 82));
                    gb2Var.ma.setBounds((int) mlVar.L0, (int) mlVar.M0, (int) mlVar.w(), (int) mlVar.x());
                    gb2Var.ma.draw(canvas2);
                }
                gb2Var.invalidate();
                canvas2.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, gb2Var.getWidth(), gb2Var.getHeight(), (int) (gb2Var.ga * 255.0f), 31);
                int alpha7 = bkb.h2.getAlpha();
                bkb.h2.setAlpha((int) (alpha7 * 0.7f));
                canvas.drawRoundRect(rectF3, gl.L(32.0f), gl.L(32.0f), bkb.h2);
                bkb.h2.setAlpha(alpha7);
                canvas.translate(gb2Var.ha + gl.L(4.0f), gb2Var.ia);
                Drawable drawable = bkb.K3;
                int i28 = i8;
                drawable.setBounds(i28, i28, drawable.getIntrinsicWidth(), bkb.K3.getIntrinsicHeight());
                bkb.K3.draw(canvas);
                canvas.translate(bkb.K3.getIntrinsicWidth() + gl.L(6.0f), f8);
                qla.f(canvas, gb2Var.ja);
                canvas.restore();
                if (gb2Var.q2 != null && mlVar.R0 && gb2Var.A2 == 0) {
                    int i29 = gba.U0;
                    int i30 = i2;
                    if (i29 > i30) {
                        L2 = gl.L(i29 - i30);
                        z3 = gba.U0 < 10 ? i28 : true;
                    } else {
                        L2 = gl.L(i29);
                    }
                    int L12 = (int) (mlVar.L0 + gl.L(9.0f));
                    int L13 = (int) (mlVar.M0 + gl.L(6.0f));
                    RectF rectF4 = rectF;
                    rectF4.set(L12 - gl.L(4.0f), L13 - gl.L(1.5f), gl.L(z3 ? 2.0f : f8) + gl.L(4.0f) + gb2Var.Z1 + L12, gl.L(1.5f) + gb2Var.q2.getHeight() + L13);
                    canvas.drawRoundRect(rectF4, L2, L2, gb2Var.c2(str));
                    canvas.save();
                    if (!z3) {
                        i30 = i28;
                    }
                    canvas.translate(L12 + i30, L13);
                    qla.f(canvas, gb2Var.q2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean B2() {
        if (!this.k1 && !this.y6 && !this.x6) {
            return false;
        }
        return true;
    }

    public final void B3(int i, int i2) {
        m17 m17Var;
        this.L0 = i;
        this.M0 = i2;
        this.ob = i2;
        if ((this.Q5 != null && i2() && this.Q5.O5()) || ((m17Var = this.L6) != null && m17Var.a != null)) {
            invalidate();
        }
    }

    @Override
    public final void C(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.C(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void C0(int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 2) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 4) == 0 && z5 && z3 && !z4 && z2) {
            z6 = true;
        }
        if (this.ub.i && !z6) {
            return;
        }
        this.Eb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Gb = ofFloat;
        if (z6) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.Gb.setInterpolator(s33.f);
        this.Db = i;
        this.Cb = i2;
        this.Gb.addUpdateListener(new d20((byte) 2, this, z));
        this.Gb.addListener(new y7((byte) 18, this, z));
        this.Fb = true;
        this.Gb.start();
    }

    public final void C1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.C1(android.graphics.Canvas, int):void");
    }

    public final boolean C2() {
        if (this.R5 != null) {
            return this.V5;
        }
        return this.H;
    }

    public final void C3(float f, float f2, boolean z) {
        float f3;
        boolean z2;
        if (this.h != z) {
            this.h = z;
            R();
            if (z) {
                invalidate();
            }
        }
        ml mlVar = this.U0;
        float f4 = f - mlVar.M0;
        float measuredHeight = f2 - (getMeasuredHeight() - mlVar.x());
        float f5 = mlVar.O0;
        if (f4 > 0.0f) {
            f3 = f5 - f4;
        } else {
            f3 = f5;
        }
        if (measuredHeight > 0.0f) {
            f3 -= measuredHeight;
        }
        if (f3 / f5 < 0.25f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.s = z2;
        mlVar.B1 = z2;
    }

    public final void D(int i, int i2, int i3) {
        int k1;
        boolean z;
        int i4;
        boolean z2;
        rh9 rh9Var;
        boolean z3;
        if (this.Q5.q4()) {
            this.b7 = gl.L(31.0f) + i3;
        } else if (g4()) {
            this.b7 = gl.L(31.0f) + i3;
        } else {
            i19 i19Var = this.O;
            if (!i19Var.p) {
                k1 = i19Var.r;
            } else {
                k1 = this.Q5.k1();
            }
            boolean z4 = false;
            if (!i19Var.p) {
                if (i - k1 >= i2 && !this.Q5.w2) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.U1) {
                    this.v0 = gl.L(14.0f) + this.v0;
                }
            } else if ((this.v1 || ((!this.R1 || this.Q5.q4()) && !h2() && !this.S1 && !this.T1 && !this.U1)) && i - k1 >= i2 && !this.Q5.w2) {
                z = false;
            } else {
                z = true;
            }
            if (this.Q5.F4()) {
                z = true;
            }
            if (i19Var.p && (rh9Var = this.Q5.y2) != null) {
                ArrayList arrayList = rh9Var.h;
                ArrayList arrayList2 = rh9Var.g;
                if (!arrayList2.isEmpty() && !rh9Var.d && !rh9Var.H()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            if (((jg9) obj).b >= arrayList2.size() - 1) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = ((mg9) b00.f(1, arrayList2)).v();
                } else {
                    z3 = true;
                    break;
                }
                if (z3) {
                    z = true;
                }
            }
            k27 k27Var = this.Q5;
            if ((k27Var.F2 && i19Var.p) || ((k27Var.J2 && i19Var.p) || k27Var.v3())) {
                i4 = 18;
                z = true;
            } else {
                i4 = 14;
            }
            if (i19Var.p && R2() && !TextUtils.isEmpty(this.Q5.z) && !this.w1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!y2()) {
                z4 = z;
            }
            if (z4) {
                if (!z2) {
                    this.v0 = gl.L(i4) + this.v0;
                    this.c7 = true;
                }
                int L = gl.L(31.0f) + Math.max(i3, k1);
                this.b7 = L;
                boolean O3 = this.Q5.O3();
                int i6 = this.M9;
                if (O3) {
                    i6 += gl.L(17.0f);
                }
                this.b7 = ls6.e(31.0f, i6, L);
            } else {
                int extraTextX = (i3 - getExtraTextX()) - k1;
                if (extraTextX >= 0 && extraTextX <= i2) {
                    this.b7 = gl.L(31.0f) + ((i3 + i2) - extraTextX);
                } else {
                    this.b7 = gl.L(31.0f) + Math.max(i3, k1 + i2);
                }
            }
            if (v2()) {
                this.b7 = gl.L(31.0f) + i;
            }
        }
    }

    public final void D0() {
        k27 k27Var;
        bb2 bb2Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.Q5.t2() && !this.Q5.l5()) {
            k27 k27Var2 = this.Q5;
            if (!k27Var2.O0) {
                if (this.eb != null && k27Var2.o4()) {
                    this.eb.l1(this);
                    return;
                } else {
                    L3(this.h1, this.i1);
                    return;
                }
            }
        }
        k27 k27Var3 = this.Q5;
        int i = k27Var3.D;
        int i2 = 0;
        if (i == 20) {
            TLRPC.Message message = k27Var3.k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.Q5.k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i2 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i2);
                        i2++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.eb.j2(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i != 1 && !k27Var3.M2()) {
            k27 k27Var4 = this.Q5;
            int i3 = k27Var4.D;
            if (i3 == 12) {
                long j = k27.n1(k27Var4.k).user_id;
                if (j != 0) {
                    user = na7.q1(this.a6).V1(Long.valueOf(j));
                } else {
                    user = null;
                }
                this.eb.c0(this, user, this.h1, this.i1);
            } else if (i3 == 5) {
                if (this.O3 != -1) {
                    E0(false);
                } else if (MediaController.w().D(this.Q5) && !MediaController.w().C()) {
                    MediaController.w().Q(this.Q5, true);
                } else {
                    this.eb.B2(this, this.Q5);
                }
            } else if (i3 == 8) {
                int i4 = this.O3;
                if (i4 != -1 && (i4 != 1 || !this.C1 || !this.H5)) {
                    if (i4 == 2 || i4 == 0) {
                        E0(false);
                        return;
                    }
                    return;
                }
                this.eb.A0(this, this.h1, this.i1, false);
            } else if (this.M1 != 4 && !k27Var4.D2(true)) {
                k27 k27Var5 = this.Q5;
                int i5 = k27Var5.D;
                if (i5 != 4 && i5 != 17 && i5 != 23 && i5 != 24) {
                    byte b = this.M1;
                    if (b == 1) {
                        if (this.O3 == -1) {
                            this.eb.A0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (k27Var5.a1 != null) {
                        bb2 bb2Var2 = this.eb;
                        if (bb2Var2 != null) {
                            bb2Var2.A0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (b == 2) {
                        if (this.O3 == -1 && (webPage = k27.n1(k27Var5.k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.eb.I1(this.Q5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                d01.t(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.U1) {
                        if (this.O3 == -1) {
                            this.eb.A0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (bb2Var = this.eb) != null) {
                        if (i5 == 16) {
                            bb2Var.A(this, 0.0f, 0.0f);
                            return;
                        } else {
                            bb2Var.s2(this, this.S3, this.T3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.eb.A0(this, this.h1, this.i1, false);
            } else if (this.O3 != -1 && (!this.z1 || (!this.H5 && (((k27Var = this.Q5) == null || !k27Var.D2(true)) && (!gba.x0 || !this.C1))))) {
                if (this.z1) {
                    E0(true);
                    return;
                }
                int i6 = this.O3;
                if (i6 == 0 || i6 == 3) {
                    E0(false);
                }
            } else {
                this.eb.A0(this, this.h1, this.i1, false);
            }
        } else {
            int i7 = this.O3;
            if (i7 == -1) {
                this.eb.A0(this, this.h1, this.i1, false);
            } else if (i7 == 0) {
                E0(false);
            }
        }
    }

    public final void D1(Canvas canvas, float f, float f2, float f3, float f4, boolean z) {
        boolean z2;
        float f5;
        float f6;
        double d;
        boolean z3;
        boolean z4;
        boolean z5;
        Drawable b2;
        float f7;
        float f8;
        float f9;
        boolean z6;
        boolean z7;
        String str;
        Drawable b22;
        float s;
        float f10;
        String str2;
        Drawable b23;
        if (f4 != 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f11 = (f4 * 0.5f) + 0.5f;
        float f12 = f * f4;
        this.O.getClass();
        int alpha = bkb.S2.getAlpha();
        float d2 = d2(f2);
        StaticLayout staticLayout = this.sa;
        nb2 nb2Var = this.ub;
        float f13 = 0.0f;
        if (staticLayout == null && !nb2Var.G) {
            f6 = 10.0f;
            d = 1.0d;
        } else {
            boolean z8 = nb2Var.i1;
            if (z8) {
                f5 = this.O9;
            } else {
                f5 = f3;
            }
            float f14 = f5 + 0.0f;
            f6 = 10.0f;
            boolean z9 = nb2Var.G;
            d = 1.0d;
            if (z9 && nb2Var.I == null && staticLayout != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z9 && nb2Var.I != null && staticLayout == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z9 && nb2Var.I != null && staticLayout != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((!this.Kb || !nb2Var.m1) && z8 && !z3) {
                float f15 = nb2Var.J;
                if (z4) {
                    f14 = f15;
                } else {
                    float f16 = nb2Var.L1;
                    f14 = (f14 * f16) + ((1.0f - f16) * f15);
                }
            }
            f27 f27Var = this.L;
            if (f27Var != null) {
                e27 e27Var = f27Var.m;
                if (e27Var.j) {
                    f14 += e27Var.g;
                }
            }
            if (nb2Var.x0) {
                f14 += this.wd;
            }
            boolean I3 = I3();
            k27 k27Var = this.Q5;
            if (I3) {
                if (k27Var.O5()) {
                    b2 = b2("drawableMsgStickerReplies");
                } else {
                    b2 = bkb.a4;
                }
            } else if (!k27Var.O3()) {
                if (z) {
                    b2 = bkb.Q3;
                } else {
                    b2 = bkb.P3;
                }
            } else {
                b2 = b2("drawableMsgOutReplies");
            }
            float s2 = hf0.s(b2, f14, d2, bkb.S2.getTextSize());
            if (z3) {
                f7 = nb2Var.L1 * f12;
            } else if (z4) {
                f7 = (1.0f - nb2Var.L1) * f12;
            } else {
                f7 = f12;
            }
            b2.setAlpha((int) (f7 * 255.0f));
            if (z2) {
                canvas.save();
                canvas.scale(f11, f11, tb4.e(gl.L(3.0f) + s2, this.ta, 2.0f, f14), b2.getBounds().centerY());
            }
            b2.draw(canvas);
            b2.setAlpha(255);
            if (nb2Var.G) {
                if (z5) {
                    canvas.save();
                    f8 = s2;
                    bkb.S2.setAlpha((int) ((1.0d - nb2Var.L1) * alpha));
                    canvas.translate(f14 + f8 + gl.L(3.0f), d2);
                    nb2Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f8 = s2;
                }
                bkb.S2.setAlpha((int) (alpha * f7));
            } else {
                f8 = s2;
            }
            canvas.save();
            canvas.translate(f14 + f8 + gl.L(3.0f), d2);
            StaticLayout staticLayout2 = this.sa;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = nb2Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.sa != null) {
                f13 = f8 + this.ta + gl.L(10.0f) + 0.0f;
            }
            if (z2) {
                canvas.restore();
            }
            if (nb2Var.G) {
                bkb.S2.setAlpha(alpha);
            }
            nb2Var.K = f14;
        }
        if (this.pa != null) {
            boolean z10 = nb2Var.i1;
            if (z10) {
                f10 = this.O9;
            } else {
                f10 = f3;
            }
            float f17 = f10 + f13;
            if ((!this.Kb || !nb2Var.m1) && z10) {
                float f18 = nb2Var.L;
                float f19 = nb2Var.L1;
                f17 = (f17 * f19) + ((1.0f - f19) * f18);
            }
            f27 f27Var2 = this.L;
            if (f27Var2 != null) {
                e27 e27Var2 = f27Var2.m;
                if (e27Var2.j) {
                    f17 += e27Var2.g;
                }
            }
            if (nb2Var.x0) {
                f17 += this.wd;
            }
            boolean I32 = I3();
            k27 k27Var2 = this.Q5;
            if (I32) {
                if (k27Var2.O5()) {
                    b23 = b2("drawableMsgStickerViews");
                } else {
                    b23 = bkb.Z3;
                }
            } else if (!k27Var2.O3()) {
                if (z) {
                    b23 = bkb.M3;
                } else {
                    b23 = bkb.L3;
                }
            } else {
                if (z) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                b23 = b2(str2);
            }
            float s3 = hf0.s(b23, f17, gl.L(1.5f) + d2, bkb.S2.getTextSize() - gl.L(2.0f));
            if (z2) {
                canvas.save();
                canvas.scale(f11, f11, (((gl.L(3.0f) + b23.getIntrinsicWidth()) + this.qa) / 2.0f) + f17, b23.getBounds().centerY());
            }
            b23.setAlpha((int) (f12 * 255.0f));
            b23.draw(canvas);
            b23.setAlpha(255);
            if (nb2Var.e2 != null) {
                canvas.save();
                bkb.S2.setAlpha((int) ((d - nb2Var.L1) * alpha));
                canvas.translate(f17 + s3 + gl.L(3.0f), d2);
                qla.f(canvas, nb2Var.e2);
                canvas.restore();
                bkb.S2.setAlpha((int) (alpha * nb2Var.L1));
            }
            canvas.save();
            canvas.translate(f17 + s3 + gl.L(3.0f), d2);
            qla.f(canvas, this.pa);
            canvas.restore();
            if (z2) {
                canvas.restore();
            }
            f13 = this.qa + s3 + gl.L(f6) + f13;
            if (nb2Var.e2 != null) {
                bkb.S2.setAlpha(alpha);
            }
            nb2Var.M = f17;
        }
        boolean z11 = this.q6;
        if (!z11 && !nb2Var.C) {
            return;
        }
        boolean z12 = nb2Var.i1;
        if (z12) {
            f9 = this.O9;
        } else {
            f9 = f3;
        }
        float f20 = f9 + f13;
        boolean z13 = nb2Var.C;
        if (z13 && z11) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z13 && !z11) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!this.Kb && z12 && !z6) {
            float f21 = nb2Var.E;
            if (z7) {
                f20 = f21;
            } else {
                float f22 = nb2Var.L1;
                f20 = (f20 * f22) + ((1.0f - f22) * f21);
            }
        }
        f27 f27Var3 = this.L;
        if (f27Var3 != null) {
            e27 e27Var3 = f27Var3.m;
            if (e27Var3.j) {
                f20 += e27Var3.g;
            }
        }
        if (nb2Var.x0) {
            f20 += this.wd;
        }
        boolean I33 = I3();
        k27 k27Var3 = this.Q5;
        if (I33) {
            if (k27Var3.O5()) {
                b22 = b2("drawableMsgStickerPinned");
            } else {
                b22 = bkb.Y3;
            }
        } else if (!k27Var3.O3()) {
            if (z) {
                b22 = bkb.U3;
            } else {
                b22 = bkb.T3;
            }
        } else {
            if (z) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            b22 = b2(str);
        }
        if (nb2Var.C) {
            boolean z14 = this.q6;
            float f23 = nb2Var.L1;
            float f24 = f12 * 255.0f;
            if (z14) {
                b22.setAlpha((int) (f24 * f23));
                s = hf0.s(b22, f20, d2, bkb.S2.getTextSize() + gl.L(1.0f));
            } else {
                b22.setAlpha((int) ((1.0f - f23) * f24));
                s = hf0.s(b22, f20, d2, bkb.S2.getTextSize() + gl.L(1.0f));
            }
        } else {
            b22.setAlpha((int) (f12 * 255.0f));
            s = hf0.s(b22, f20, d2, bkb.S2.getTextSize() + gl.L(1.0f));
        }
        if (z2) {
            canvas.save();
            canvas.scale(f11, f11, (s / 2.0f) + f20, b22.getBounds().centerY());
        }
        b22.draw(canvas);
        b22.setAlpha(255);
        if (z2) {
            canvas.restore();
        }
        nb2Var.D = f20;
    }

    public final boolean D2() {
        TLRPC.Chat chat = this.Ga;
        if (chat != null) {
            return chat.verified;
        }
        TLRPC.User user = this.Ea;
        if (user != null && user.verified) {
            return true;
        }
        return false;
    }

    public final void D3(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        rh9 rh9Var;
        nb2 nb2Var;
        h27 h27Var;
        k27 k27Var;
        this.Cc = i;
        this.Ec = i2;
        this.Fc = i3;
        this.L0 = i4;
        this.M0 = i5;
        this.Hc = f2;
        this.Gc = f;
        this.ob = i5;
        this.pb = i6;
        this.qb = i7;
        this.Dc = i8;
        if ((!this.I5.isEmpty() || (this.w != null && (k27Var = this.Q5) != null && k27Var.D == 27)) && this.nb != f2) {
            invalidate();
        }
        this.nb = f2;
        if (i3 != this.M0 || f != this.N0) {
            this.N0 = f;
            this.M0 = i3;
        }
        if (this.Q5 != null && i2() && this.Q5.O5()) {
            invalidate();
        }
        k27 k27Var2 = this.Q5;
        if (k27Var2 != null && k27Var2.B2 != null) {
            int i11 = i - this.u0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int size = this.Q5.B2.size();
                nb2Var = this.ub;
                if (i12 >= size || ((h27) this.Q5.B2.get(i12)).p(this.Q5.B2, nb2Var) > i11) {
                    break;
                }
                i13 = i12;
                i12++;
            }
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            while (i13 < this.Q5.B2.size()) {
                float p = ((h27) this.Q5.B2.get(i13)).p(this.Q5.B2, nb2Var);
                float j = h27Var.f + p + h27Var.j(nb2Var) + h27Var.h;
                float f3 = i11;
                if (q2(p, j, f3, i11 + i2)) {
                    if (i15 == -1) {
                        i15 = i13;
                    }
                    i14++;
                    i16 = i13;
                } else if (p > f3) {
                    break;
                }
                i13++;
            }
            if (this.E0 == i16 && this.F0 == i15 && this.G0 == i14) {
                if (this.Ma != null) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.Ma.a.size()) {
                            break;
                        }
                        bm bmVar = (bm) this.Ma.a.get(i17);
                        if (bmVar != null && bmVar.n) {
                            float y = (0.0f - getY()) - bmVar.r;
                            float y2 = (this.n - getY()) - bmVar.r;
                            Rect rect = bmVar.e;
                            if (rect.bottom >= y && rect.top <= y2) {
                                invalidate();
                                break;
                            }
                        }
                        i17++;
                    }
                }
            } else {
                this.E0 = i16;
                this.F0 = i15;
                this.G0 = i14;
                invalidate();
            }
        }
        k27 k27Var3 = this.Q5;
        if (k27Var3 != null && (rh9Var = k27Var3.y2) != null) {
            ArrayList arrayList = rh9Var.g;
            int i18 = i - this.u0;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                mg9 mg9Var = (mg9) arrayList.get(i21);
                if (mg9Var.R || mg9Var.S) {
                    float f4 = mg9Var.N;
                    float f5 = i18 + i2;
                    if (q2(f4, mg9Var.I() + f4, i18, f5)) {
                        if (i19 == -1) {
                            i19 = i21;
                        }
                        i20 = i21;
                    } else if (f4 > f5) {
                        break;
                    }
                }
            }
            if (this.H0 != i19 || this.I0 != i20) {
                this.H0 = i19;
                this.I0 = i20;
                invalidate();
            }
        }
        ArrayList arrayList2 = this.Q4;
        if (!arrayList2.isEmpty()) {
            int i22 = -1;
            int i23 = -1;
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                fb2 fb2Var = (fb2) arrayList2.get(i24);
                int i25 = fb2Var.b + this.gb;
                if (q2(i25, i25 + fb2Var.c, this.Cc, i10 + this.Ec)) {
                    if (i23 == -1) {
                        i23 = i24;
                    }
                    i22 = i24;
                }
            }
            if (this.T4 != i22 || this.S4 != i23) {
                this.T4 = i22;
                this.S4 = i23;
                invalidate();
            }
        }
        if (this.V8) {
            if (Math.abs(this.g9 - Math.max(Math.min(gl.L(4.0f) + (-this.Dc), this.e9 - gl.L(42.0f)), gl.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        i19 i19Var = this.O;
        int i26 = i19Var.c;
        boolean q2 = q2(i26, i26 + i19Var.m, this.Cc, i9 + this.Ec);
        if (this.V4 != q2) {
            this.V4 = q2;
            invalidate();
        }
    }

    public final void E0(boolean z) {
        float f;
        k27 k27Var;
        k27 k27Var2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i;
        RadialProgress2 radialProgress2;
        int i2;
        k27 k27Var3;
        if (this.eb != null && this.Q5.o4() && this.Q5.t2() && !this.Q5.l5() && !this.Q5.O0) {
            this.eb.l1(this);
            return;
        }
        k27 k27Var4 = this.Q5;
        if (k27Var4 != null && !k27Var4.M2()) {
            this.Q5.P = true;
        }
        int i3 = this.O3;
        RadialProgress2 radialProgress22 = this.R0;
        int i4 = this.a6;
        ml mlVar = this.U0;
        RadialProgress2 radialProgress23 = this.Q0;
        if (i3 == 0 && (!this.z1 || z)) {
            byte b = this.M1;
            if (b != 3 && b != 5 && (b != 7 || (k27Var3 = this.Q5) == null || !k27Var3.S4() || !this.Q5.z0)) {
                if (z) {
                    radialProgress22.o(false, 0.0f);
                } else {
                    radialProgress23.o(false, 0.0f);
                }
                if (this.e4 != null && (mlVar.E() || this.f4 == null)) {
                    photoSize = this.e4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.h4;
                    } else {
                        str = this.i4;
                    }
                } else {
                    photoSize = this.f4;
                    str = this.i4;
                }
                if (k27.Q5(this.Q5.k)) {
                    i = 2;
                } else {
                    i = 0;
                }
                k27 k27Var5 = this.Q5;
                int i5 = k27Var5.D;
                if (i5 != 1 && i5 != 20) {
                    if (i5 == 8) {
                        ba4.G(i4).X(this.N1, this.Q5, 2, 0);
                        if (this.Q5.H0 > 0) {
                            A0(this.N1);
                        }
                        radialProgress2 = radialProgress23;
                    } else if (this.Kb) {
                        if (k27Var5.k4()) {
                            ba4 G = ba4.G(i4);
                            TLRPC.Document F0 = this.Q5.F0();
                            k27 k27Var6 = this.Q5;
                            if (k27.Q5(k27Var6.k)) {
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            G.X(F0, k27Var6, 2, i2);
                            radialProgress2 = radialProgress23;
                        } else {
                            k27 k27Var7 = this.Q5;
                            k27Var7.h0 = 2.0f;
                            TLRPC.Document F02 = k27Var7.F0();
                            mlVar.r = true;
                            String str2 = str;
                            radialProgress2 = radialProgress23;
                            mlVar.Z(gl5.b(F02), null, gl5.f(photoSize, F02), str2, null, F02.size, null, this.Q5, 0);
                        }
                        this.xb = true;
                        invalidate();
                    } else {
                        radialProgress2 = radialProgress23;
                        if (i5 == 9) {
                            ba4.G(i4).X(this.N1, this.Q5, 2, 0);
                            if (this.Q5.H0 > 0) {
                                A0(this.N1);
                            }
                        } else {
                            byte b2 = this.M1;
                            if (b2 == 4) {
                                ba4.G(i4).X(this.N1, this.Q5, 1, i);
                                k27 k27Var8 = this.Q5;
                                if (k27Var8.H0 > 0) {
                                    A0(k27Var8.F0());
                                }
                            } else if (i5 == 0 && b2 != 0) {
                                if (b2 == 2) {
                                    mlVar.r = true;
                                    mlVar.Z(gl5.b(this.N1), null, gl5.c(this.e4, this.N1), this.i4, null, this.N1.size, null, this.Q5, i);
                                    k27 k27Var9 = this.Q5;
                                    k27Var9.h0 = 2.0f;
                                    if (k27Var9.H0 > 0) {
                                        A0(k27Var9.F0());
                                    }
                                } else if (b2 == 1) {
                                    ba4.G(i4).X(this.N1, this.Q5, 2, 0);
                                } else if (b2 == 8) {
                                    mlVar.Z(gl5.b(this.N1), this.h4, gl5.c(this.e4, this.N1), "b1", null, 0L, "jpg", this.Q5, 1);
                                }
                            } else {
                                mlVar.r = true;
                                mlVar.Z(gl5.f(this.e4, this.d4), this.h4, gl5.f(this.f4, this.d4), this.i4, this.g4, 0L, null, this.Q5, 0);
                            }
                        }
                    }
                } else {
                    radialProgress2 = radialProgress23;
                    mlVar.r = true;
                    mlVar.Z(gl5.f(this.e4, this.d4), this.h4, gl5.f(this.f4, this.d4), this.i4, this.g4, this.e4.size, null, this.Q5, i);
                }
                this.Q5.l1 = false;
                this.O3 = 1;
                if (z) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.X3 == 0) {
                ba4.G(i4).X(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
            }
            if (this.eb.B2(this, this.Q5)) {
                if (this.W3 == 2 && this.X3 != 1) {
                    this.X3 = 1;
                    radialProgress23.o(false, 0.0f);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                W3();
                this.O3 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 1 && (!this.z1 || z)) {
            mlVar.r = false;
            byte b3 = this.M1;
            if (b3 != 3 && b3 != 5 && (b3 != 7 || (k27Var2 = this.Q5) == null || !k27Var2.S4())) {
                if (this.Q5.N3() && !this.z1 && (this.Q5.n4() || this.Q5.Y2())) {
                    if (radialProgress23.i.q != 6) {
                        this.eb.M1(this);
                        return;
                    }
                    return;
                }
                k27 k27Var10 = this.Q5;
                k27Var10.l1 = true;
                byte b4 = this.M1;
                if (b4 != 2 && b4 != 4 && b4 != 1 && b4 != 8) {
                    int i6 = k27Var10.D;
                    if (i6 != 0 && i6 != 1 && i6 != 20 && i6 != 8 && i6 != 5) {
                        if (i6 == 9) {
                            ba4.G(i4).f(this.Q5.F0());
                        }
                    } else {
                        fl5 z2 = fl5.z();
                        String str3 = mlVar.R;
                        if (str3 != null) {
                            z2.s.c(new jk5(z2, str3, (byte) 2));
                        }
                        mlVar.c();
                    }
                } else {
                    ba4.G(i4).f(this.N1);
                }
                this.O3 = 0;
                if (z) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.w().Q(this.Q5, true)) {
                this.O3 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 2) {
            k27 k27Var11 = this.Q5;
            if (k27Var11 != null && k27Var11.D == 23) {
                this.eb.A0(this, 0.0f, 0.0f, false);
            } else if (this.M1 == 7 && k27Var11 != null && k27Var11.S4()) {
                if (this.X3 == 0) {
                    ba4.G(i4).X(this.N1, this.Q5, 2, 0);
                    this.Q5.l1 = false;
                }
                if (this.eb.B2(this, this.Q5)) {
                    if (this.W3 == 2 && this.X3 != 1) {
                        this.X3 = 1;
                        radialProgress23.o(false, 0.0f);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    W3();
                    this.O3 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.Kb) {
                    this.xb = true;
                    invalidate();
                }
            } else {
                byte b5 = this.M1;
                if (b5 != 3 && b5 != 5) {
                    if (this.Kb) {
                        k27 k27Var12 = MediaController.w().v0;
                        if (k27Var12 == null || !k27Var12.g4()) {
                            mlVar.u0 = true;
                            mlVar.w0(false);
                        }
                    } else {
                        mlVar.u0 = true;
                        mlVar.w0(false);
                    }
                    this.Q5.h0 = 0.0f;
                    this.O3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(false, 0.0f);
                ba4.G(i4).X(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
                this.O3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i3 != 3 && i3 != 0) {
            if (i3 == 4) {
                byte b6 = this.M1;
                if (b6 == 3 || b6 == 5 || (b6 == 7 && (k27Var = this.Q5) != null && k27Var.S4())) {
                    if ((this.Q5.N3() && (this.Q5.n4() || this.Q5.Y2())) || this.Q5.m4()) {
                        bb2 bb2Var = this.eb;
                        if (bb2Var != null && radialProgress23.i.q != 6) {
                            bb2Var.M1(this);
                            return;
                        }
                        return;
                    }
                    this.Q5.l1 = true;
                    ba4.G(i4).f(this.N1);
                    this.O3 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.W3 == 2 && this.X3 != 1) {
                this.X3 = 1;
                f = 0.0f;
                radialProgress23.o(false, 0.0f);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f = 0.0f;
            }
            bb2 bb2Var2 = this.eb;
            if (bb2Var2 != null) {
                bb2Var2.A0(this, f, f, false);
            }
        }
    }

    public final void E1(Canvas canvas, float f, Runnable runnable) {
        m17 m17Var;
        float f2;
        boolean z;
        boolean z2;
        int i;
        int i2;
        Canvas canvas2 = canvas;
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.R4()) {
            RadialProgress2 radialProgress2 = this.Q0;
            RectF rectF = radialProgress2.a;
            Paint paint = radialProgress2.g;
            tj6 tj6Var = radialProgress2.i;
            RectF rectF2 = radialProgress2.a;
            float cos = (((float) Math.cos((gl.U1(f, 190, 45) / 180.0f) * 3.141592653589793d)) * gl.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((gl.U1(f, 190, 45) / 180.0f) * 3.141592653589793d)) * gl.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = gl.P;
            rectF3.set(rectF2);
            rectF3.inset(-gl.L(1.0f), -gl.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (A2()) {
                m17Var = this.M6;
            } else {
                m17Var = this.L6;
            }
            tj6Var.B = m17Var;
            radialProgress2.j.B = m17Var;
            radialProgress2.I = f;
            runnable.run();
            if (this.a1 == null) {
                Paint paint2 = new Paint(1);
                this.a1 = paint2;
                f2 = 1.0f;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            } else {
                f2 = 1.0f;
            }
            if (f < f2) {
                canvas2.save();
                float f3 = f2 - f;
                float f4 = 0.7f * f3;
                canvas2.scale(f4, f4, rectF2.centerX(), gl.R1(rectF2.top, rectF2.bottom, 0.5f));
                if (this.b1 == null) {
                    oy8 oy8Var = new oy8(2131624022, gl.L(32.0f), gl.L(32.0f), true, null);
                    this.b1 = oy8Var;
                    oy8Var.M(this);
                    this.b1.E(true);
                    this.b1.F(1);
                    this.b1.start();
                }
                this.b1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.c1 == null) {
                    i = 1;
                    this.c1 = new Paint(1);
                } else {
                    i = 1;
                }
                if (this.d1 == null) {
                    Paint paint3 = new Paint(i);
                    this.d1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.e1 == null) {
                    Paint paint4 = new Paint(i);
                    this.e1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i3 = radialProgress2.u;
                if (i3 >= 0) {
                    i2 = bkb.v0(i3, this.cc);
                } else {
                    i2 = radialProgress2.n;
                }
                this.c1.setColor(i2);
                this.e1.setColor(i2);
                tj6Var.a(false);
                this.c1.setShader(tj6Var.d.getShader());
                this.e1.setShader(tj6Var.d.getShader());
                rectF3.set(this.b1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f5 = f2;
                rectF3.inset(f5, f5);
                canvas2.drawRect(rectF3, this.c1);
                this.b1.l(canvas, this.d1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.e1.setAlpha((int) (255.0f * f3));
                this.e1.setStrokeWidth(gl.L(1.66f));
                RectF rectF4 = this.c4;
                rectF4.set(rectF2);
                rectF4.inset(gl.L(3.0f), gl.L(3.0f));
                dv9 dv9Var = this.E4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - dv9Var.K) * (-360.0f), false, this.e1);
                tob tobVar = this.m5;
                if (tobVar == null) {
                    tobVar = new tob();
                    this.m5 = tobVar;
                }
                tobVar.a((1.0f - dv9Var.K) * (-360.0f), f3, canvas, this.e1, rectF4);
                canvas2 = canvas;
            } else {
                oy8 oy8Var2 = this.b1;
                if (oy8Var2 != null) {
                    oy8Var2.x(true);
                    this.b1 = null;
                    if (this.m5 != null) {
                        this.m5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, gl.L((f * 1.5f) + 10.0f) * f, this.a1);
            canvas2.restore();
            if (this.Z0 == null) {
                hb1 hb1Var = new hb1(3);
                this.Z0 = hb1Var;
                z = false;
                hb1Var.e(-1, 0, 0);
                hb1 hb1Var2 = this.Z0;
                hb1Var2.i = 14.0f;
                hb1Var2.c(10.0f);
                this.Z0.a.setStrokeWidth(gl.N(1.5f));
                z2 = true;
                this.Z0.d(1, false, false);
                this.Z0.j = -gl.N(0.33f);
                this.Z0.k = gl.N(0.33f);
            } else {
                z = false;
                z2 = true;
            }
            hb1 hb1Var3 = this.Z0;
            hb1Var3.i = f * 14.0f;
            hb1Var3.c(f * 10.0f);
            canvas2.saveLayerAlpha(cos - gl.L(10.0f), sin - gl.L(10.0f), gl.L(10.0f) + cos, gl.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, gl.L(10.0f) * f, paint);
            hb1 hb1Var4 = this.Z0;
            if (gl.B(paint.getColor()) <= 0.8f) {
                z2 = z;
            }
            hb1Var4.b(z2);
            hb1 hb1Var5 = this.Z0;
            hb1Var5.n = cos;
            hb1Var5.o = sin;
            hb1Var5.a(canvas2, f);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean E2(float f) {
        if (this.L6 != null) {
            int i = this.N6;
            if (f >= i && f <= i + this.O6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E3(int r21, defpackage.k27 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.E3(int, k27):void");
    }

    public final void F0() {
        int i;
        int i2;
        int i3 = this.X3;
        int i4 = this.a6;
        RadialProgress2 radialProgress2 = this.Q0;
        if (i3 == 0) {
            this.X3 = 1;
            radialProgress2.o(false, 0.0f);
            k27 k27Var = this.Q5;
            if (k27Var != null && !k27Var.M2()) {
                this.Q5.P = true;
            }
            byte b = this.M1;
            if (b != 3 && b != 5) {
                if (b == 4 || b == 7) {
                    A0(this.N1);
                    ba4 G = ba4.G(i4);
                    TLRPC.Document document = this.N1;
                    k27 k27Var2 = this.Q5;
                    if (k27.Q5(k27Var2.k)) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    G.X(document, k27Var2, 2, i2);
                    this.Q5.l1 = false;
                }
            } else {
                ba4 G2 = ba4.G(i4);
                TLRPC.Document document2 = this.N1;
                k27 k27Var3 = this.Q5;
                if (k27.Q5(k27Var3.k)) {
                    i = 2;
                } else {
                    i = 0;
                }
                G2.X(document2, k27Var3, 2, i);
                this.Q5.l1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i3 == 1) {
            byte b2 = this.M1;
            if ((b2 == 3 || b2 == 5 || b2 == 7) && MediaController.w().D(this.Q5)) {
                MediaController.w().l(true, true, false, false);
            }
            this.X3 = 0;
            this.Q5.l1 = true;
            ba4.G(i4).f(this.N1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final ra2 F1() {
        ra2 ra2Var = this.K4;
        if (ra2Var == null) {
            ra2 ra2Var2 = new ra2(this);
            this.K4 = ra2Var2;
            return ra2Var2;
        }
        return ra2Var;
    }

    public final void F3() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.Q5.O3()) {
            TextPaint textPaint = bkb.n2;
            int i5 = bkb.Vc;
            textPaint.setColor(bkb.v0(i5, this.cc));
            bkb.w2.setColor(bkb.v0(i5, this.cc));
            bkb.o2.setColor(bkb.v0(i5, this.cc));
            bkb.p2.setColor(bkb.v0(i5, this.cc));
            bkb.q2.setColor(bkb.v0(i5, this.cc));
            TextPaint textPaint2 = bkb.w2;
            TextPaint textPaint3 = bkb.Y2;
            TextPaint textPaint4 = bkb.Z2;
            TextPaint textPaint5 = bkb.n2;
            TextPaint textPaint6 = bkb.o2;
            TextPaint textPaint7 = bkb.p2;
            TextPaint textPaint8 = bkb.q2;
            int v0 = bkb.v0(bkb.Xc, this.cc);
            textPaint8.linkColor = v0;
            textPaint7.linkColor = v0;
            textPaint6.linkColor = v0;
            textPaint5.linkColor = v0;
            textPaint4.linkColor = v0;
            textPaint3.linkColor = v0;
            textPaint2.linkColor = v0;
        } else {
            TextPaint textPaint9 = bkb.n2;
            int i6 = bkb.Uc;
            textPaint9.setColor(bkb.v0(i6, this.cc));
            bkb.w2.setColor(bkb.v0(i6, this.cc));
            bkb.o2.setColor(bkb.v0(i6, this.cc));
            bkb.p2.setColor(bkb.v0(i6, this.cc));
            bkb.q2.setColor(bkb.v0(i6, this.cc));
            TextPaint textPaint10 = bkb.w2;
            TextPaint textPaint11 = bkb.Y2;
            TextPaint textPaint12 = bkb.Z2;
            TextPaint textPaint13 = bkb.n2;
            TextPaint textPaint14 = bkb.o2;
            TextPaint textPaint15 = bkb.p2;
            TextPaint textPaint16 = bkb.q2;
            int v02 = bkb.v0(bkb.Wc, this.cc);
            textPaint16.linkColor = v02;
            textPaint15.linkColor = v02;
            textPaint14.linkColor = v02;
            textPaint13.linkColor = v02;
            textPaint12.linkColor = v02;
            textPaint11.linkColor = v02;
            textPaint10.linkColor = v02;
        }
        if (this.N1 != null) {
            byte b = this.M1;
            xa2 xa2Var = this.D4;
            if (b != 3 && b != 7) {
                if (b == 5) {
                    if (this.Q5.O3()) {
                        int v03 = bkb.v0(bkb.mc, this.cc);
                        int v04 = bkb.v0(bkb.nc, this.cc);
                        int i7 = bkb.pc;
                        xa2Var.f(v03, v04, bkb.v0(i7, this.cc), bkb.v0(i7, this.cc), bkb.v0(bkb.oc, this.cc));
                    } else if (this.R1 && this.o8 != null) {
                        int b2 = bkb.b(bkb.v0(bkb.ke, this.cc), this.o8.h());
                        int b3 = bkb.b(bkb.v0(bkb.le, this.cc), this.o8.h());
                        int i8 = bkb.ne;
                        xa2Var.f(b2, b3, bkb.b(bkb.v0(i8, this.cc), this.o8.h()), bkb.b(bkb.v0(i8, this.cc), this.o8.h()), bkb.b(bkb.v0(bkb.me, this.cc), this.o8.h()));
                    } else {
                        int v05 = bkb.v0(bkb.ke, this.cc);
                        int v06 = bkb.v0(bkb.le, this.cc);
                        int i9 = bkb.ne;
                        xa2Var.f(v05, v06, bkb.v0(i9, this.cc), bkb.v0(i9, this.cc), bkb.v0(bkb.me, this.cc));
                    }
                }
            } else {
                boolean O3 = this.Q5.O3();
                dv9 dv9Var = this.E4;
                if (O3) {
                    int v07 = bkb.v0(bkb.qc, this.cc);
                    int v08 = bkb.v0(bkb.sc, this.cc);
                    int v09 = bkb.v0(bkb.rc, this.cc);
                    dv9Var.p = v07;
                    dv9Var.q = v08;
                    dv9Var.r = v09;
                    int v010 = bkb.v0(bkb.mc, this.cc);
                    int v011 = bkb.v0(bkb.nc, this.cc);
                    int i10 = bkb.pc;
                    xa2Var.f(v010, v011, bkb.v0(i10, this.cc), bkb.v0(i10, this.cc), bkb.v0(bkb.oc, this.cc));
                } else if (this.R1 && this.o8 != null) {
                    int b4 = bkb.b(bkb.v0(bkb.oe, this.cc), this.o8.h());
                    int b5 = bkb.b(bkb.v0(bkb.qe, this.cc), this.o8.h());
                    int b6 = bkb.b(bkb.v0(bkb.pe, this.cc), this.o8.h());
                    dv9Var.p = b4;
                    dv9Var.q = b5;
                    dv9Var.r = b6;
                    int b7 = bkb.b(bkb.v0(bkb.ke, this.cc), this.o8.h());
                    int b8 = bkb.b(bkb.v0(bkb.le, this.cc), this.o8.h());
                    int i11 = bkb.ne;
                    xa2Var.f(b7, b8, bkb.b(bkb.v0(i11, this.cc), this.o8.h()), bkb.b(bkb.v0(i11, this.cc), this.o8.h()), bkb.b(bkb.v0(bkb.me, this.cc), this.o8.h()));
                } else {
                    int v012 = bkb.v0(bkb.oe, this.cc);
                    int v013 = bkb.v0(bkb.qe, this.cc);
                    int v014 = bkb.v0(bkb.pe, this.cc);
                    dv9Var.p = v012;
                    dv9Var.q = v013;
                    dv9Var.r = v014;
                    int v015 = bkb.v0(bkb.ke, this.cc);
                    int v016 = bkb.v0(bkb.le, this.cc);
                    int i12 = bkb.ne;
                    xa2Var.f(v015, v016, bkb.v0(i12, this.cc), bkb.v0(i12, this.cc), bkb.v0(bkb.me, this.cc));
                }
            }
        }
        k27 k27Var = this.Q5;
        if (k27Var.D == 5) {
            TextPaint textPaint17 = bkb.S2;
            if (v2()) {
                if (this.Q5.O3()) {
                    i3 = bkb.ic;
                } else {
                    i3 = bkb.de;
                }
            } else {
                i3 = bkb.Yc;
            }
            int v017 = bkb.v0(i3, this.cc);
            boolean A2 = A2();
            k27 k27Var2 = this.Q5;
            if (A2) {
                if (k27Var2.O3()) {
                    i4 = bkb.dc;
                } else {
                    i4 = bkb.ee;
                }
            } else if (k27Var2.O3()) {
                i4 = bkb.ic;
            } else {
                i4 = bkb.de;
            }
            textPaint17.setColor(bm2.f(getVideoTranscriptionProgress(), v017, bkb.v0(i4, this.cc)));
        } else if (this.C6) {
            if (k27Var.O5()) {
                bkb.S2.setColor(bkb.v0(bkb.Yc, this.cc));
            } else {
                bkb.S2.setColor(bkb.v0(bkb.ae, this.cc));
            }
        } else if (k27Var.O3()) {
            TextPaint textPaint18 = bkb.S2;
            if (A2()) {
                i2 = bkb.dc;
            } else {
                i2 = bkb.ic;
            }
            textPaint18.setColor(bkb.v0(i2, this.cc));
        } else {
            TextPaint textPaint19 = bkb.S2;
            if (A2()) {
                i = bkb.ee;
            } else {
                i = bkb.de;
            }
            textPaint19.setColor(bkb.v0(i, this.cc));
        }
    }

    public final void G() {
        StaticLayout staticLayout;
        if (this.Q5.D == 20 && (staticLayout = this.ja) != null) {
            ml mlVar = this.U0;
            this.ha = oo1.z(mlVar.N0, staticLayout.getWidth(), 2.0f, this.N6);
            this.ia = oo1.z(mlVar.O0, this.ja.getHeight(), 2.0f, this.P6 + mlVar.M0);
        }
    }

    public final void G0() {
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            k27Var.L0 = !k27Var.L0;
            bb2 bb2Var = this.eb;
            if (bb2Var != null) {
                bb2Var.C1(this, true);
            }
        }
    }

    public final jb2 G1() {
        jb2 jb2Var = this.Y0;
        if (jb2Var == null) {
            jb2 jb2Var2 = new jb2(this);
            this.Y0 = jb2Var2;
            return jb2Var2;
        }
        return jb2Var;
    }

    public final boolean G2() {
        if (this.R5 != null) {
            return this.W5;
        }
        return this.I;
    }

    public final boolean G3() {
        f27 f27Var;
        k27 k27Var = this.Q5;
        if (k27Var != null && !k27Var.t1 && !k27Var.q4()) {
            c27 c27Var = this.M;
            if ((c27Var == null || ((f27Var = this.L) != null && f27Var.i && (c27Var.l & 8) == 0)) && !this.ub.x0) {
                if (!this.y || !k27.Q4(this.Q5.k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int H() {
        if (this.w1) {
            return 4;
        }
        return 8;
    }

    public final void H0(Canvas canvas, float f) {
        ArrayList arrayList;
        float f2;
        float f3;
        if (this.m3 == null) {
            return;
        }
        float f4 = this.t3;
        float f5 = this.s3;
        nb2 nb2Var = this.ub;
        if (nb2Var.x0) {
            if (nb2Var.D0) {
                f4 -= getTranslationY();
                f3 = nb2Var.h0;
            } else if (nb2Var.t0) {
                float f6 = nb2Var.L1;
                float f7 = 1.0f - f6;
                f5 = (f5 * f6) + (nb2Var.r0 * f7);
                f4 = (f4 * f6) + (f7 * nb2Var.s0);
            } else if (!k27.Q4(this.Q5.k) || !TextUtils.isEmpty(this.Q5.z)) {
                f3 = nb2Var.h0;
            }
            f5 += f3;
        }
        float f8 = f5;
        float f9 = f4;
        float f10 = 0.0f;
        ArrayList arrayList2 = null;
        if (nb2Var.b1) {
            float f11 = nb2Var.L1;
            if (f11 != 1.0f) {
                i27 i27Var = nb2Var.c1;
                if (i27Var != null) {
                    arrayList = i27Var.e;
                } else {
                    arrayList = null;
                }
                cm cmVar = nb2Var.P0;
                float f12 = (1.0f - f11) * f;
                if (i27Var != null) {
                    f2 = i27Var.d;
                } else {
                    f2 = 0.0f;
                }
                I0(f8, f9, canvas, arrayList, cmVar, false, f12, f2, true);
                i27 i27Var2 = this.m3;
                if (i27Var2 != null) {
                    arrayList2 = i27Var2.e;
                }
                ArrayList arrayList3 = arrayList2;
                cm cmVar2 = this.Ma;
                float f13 = f * nb2Var.L1;
                if (i27Var2 != null) {
                    f10 = i27Var2.d;
                }
                I0(f8, f9, canvas, arrayList3, cmVar2, true, f13, f10, true);
                return;
            }
        }
        i27 i27Var3 = this.m3;
        if (i27Var3 != null) {
            arrayList2 = i27Var3.e;
        }
        ArrayList arrayList4 = arrayList2;
        cm cmVar3 = this.Ma;
        if (i27Var3 != null) {
            f10 = i27Var3.d;
        }
        I0(f8, f9, canvas, arrayList4, cmVar3, true, f, f10, true);
    }

    public final boolean H1(eb2 eb2Var, b46 b46Var, Layout layout, int i) {
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) layout.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= characterStyleArr.length) {
                    break;
                } else if (characterStyleArr[i2] == this.A4) {
                    eb2Var.b = i;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (eb2Var.b != i) {
            return false;
        }
        b46Var.rewind();
        int spanStart = spanned.getSpanStart(this.A4);
        int spanEnd = spanned.getSpanEnd(this.A4);
        b46Var.c = true;
        b46Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, b46Var);
        b46Var.a();
        this.y4.k();
        return true;
    }

    public final boolean H2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        k27 k27Var = this.Q5;
        if (!k27Var.l2) {
            if (k27.B0(k27Var.k) != 489000 || (message = this.Q5.k) == null || message.fwd_from == null) {
                if (!this.Q5.q4() && !this.Q5.v3()) {
                    if (!this.g6 || this.v6) {
                        TLRPC.Message message2 = this.Q5.k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || cf3.n(peer) != cf3.n(this.Q5.k.peer_id)) {
                            if (!x2()) {
                                if (!this.v6 || this.Q5.D != 0) {
                                    if (!this.F && this.v9 && this.f6) {
                                        if (this.Q5.O3()) {
                                            if ((this.Q5.z4() && this.Q5.o3()) || this.Q5.j2) {
                                                return true;
                                            }
                                        } else {
                                            return true;
                                        }
                                    }
                                    if (!this.Q5.y3() || this.Q5.k.fwd_from.from_id != null) {
                                        return false;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean H3() {
        if (!w2()) {
            if ((this.L == null || (this.M.l & 4) != 0) && !this.R1) {
                k27 k27Var = this.Q5;
                if (k27Var != null) {
                    if (!k27Var.j2 && !k27Var.q4()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean I(MotionEvent motionEvent) {
        RectF rectF;
        bb2 bb2Var;
        ff0 ff0Var;
        boolean z = false;
        if (this.m9 != null && (rectF = this.p9) != null && (this.va != null || this.wa != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) P1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.m9.getText());
                lm0[] lm0VarArr = (lm0[]) spannableString.getSpans(0, spannableString.length(), lm0.class);
                if (contains && lm0VarArr != null && lm0VarArr.length > 0) {
                    z = true;
                }
                this.X2 = z;
                if (z && (ff0Var = this.Z2) != null) {
                    ff0Var.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.Z2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.X2 && (bb2Var = this.eb) != null) {
                    bb2Var.q(this);
                }
                ff0 ff0Var2 = this.Z2;
                if (ff0Var2 != null) {
                    ff0Var2.setState(StateSet.NOTHING);
                }
                this.X2 = false;
            }
            return this.X2;
        }
        this.X2 = false;
        return false;
    }

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, defpackage.cm r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.I0(float, float, android.graphics.Canvas, java.util.ArrayList, cm, boolean, float, float, boolean):void");
    }

    public final boolean I1(eb2 eb2Var, b46 b46Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (H1(eb2Var, b46Var, ((h27) arrayList.get(i)).e, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean I2(k27 k27Var) {
        TLRPC.MessageFwdHeader messageFwdHeader = k27Var.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            bb2 bb2Var = this.eb;
            if (bb2Var == null || bb2Var.Q()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean I3() {
        k27 k27Var;
        k27 k27Var2;
        byte b = this.Hb;
        if (b != 0) {
            if (b != 1) {
                return false;
            }
        } else if (!v2()) {
            if (!g4() && ((!this.C6 || ((this.m3 != null && !this.w1) || (!this.O.p && ((k27Var2 = this.Q5) == null || (!k27Var2.M2() && !this.Q5.g4()))))) && ((k27Var = this.Q5) == null || k27Var.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean J(MotionEvent motionEvent) {
        bb2 bb2Var;
        if (this.m9 == null || (bb2Var = this.eb) == null || !bb2Var.b()) {
            return false;
        }
        boolean contains = this.n9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.o9 == null) {
            this.o9 = new n41(this);
        }
        if (motionEvent.getAction() == 0) {
            this.o9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.o9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.o9.i) {
                this.eb.X1(this);
            }
            this.o9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.o9.c(false);
        }
        return this.o9.i;
    }

    public final void J0(Canvas canvas, float f) {
        lg7 lg7Var;
        k27 k27Var = this.Q5;
        if (k27Var != null && !k27Var.q4()) {
            float f2 = this.u0;
            nb2 nb2Var = this.ub;
            if (nb2Var.m2) {
                float f3 = nb2Var.o2;
                float f4 = nb2Var.L1;
                f2 = (f2 * f4) + ((1.0f - f4) * f3);
            }
            float f5 = f2;
            if (nb2Var.L1 != 1.0f && nb2Var.H0 && ((lg7Var = this.Mc) == null || !lg7Var.h)) {
                canvas.save();
                m17 m17Var = this.L6;
                if (m17Var != null) {
                    Rect bounds = m17Var.getBounds();
                    if (this.Q5.O3() && !this.C6 && !this.G) {
                        canvas.clipRect(gl.L(4.0f) + bounds.left, gl.L(4.0f) + bounds.top, bounds.right - gl.L(10.0f), bounds.bottom - gl.L(4.0f));
                    } else {
                        canvas.clipRect(gl.L(4.0f) + bounds.left, gl.L(4.0f) + bounds.top, bounds.right - gl.L(4.0f), bounds.bottom - gl.L(4.0f));
                    }
                }
                I0(this.o0, f5, canvas, nb2Var.I0, nb2Var.P0, false, (1.0f - nb2Var.L1) * f, this.Q5.x2, false);
                k27 k27Var2 = this.Q5;
                I0(this.o0, f5, canvas, k27Var2.B2, this.Ma, true, f * nb2Var.L1, k27Var2.x2, false);
                canvas.restore();
            } else {
                k27 k27Var3 = this.Q5;
                I0(this.o0, f5, canvas, k27Var3.B2, this.Ma, true, f, k27Var3.x2, false);
            }
        }
        if (G3()) {
            H0(canvas, f);
        }
    }

    public final void J1() {
        k27 k27Var = this.R5;
        if (k27Var == null) {
            k27Var = this.Q5;
        }
        k27 k27Var2 = k27Var;
        this.Q5 = null;
        z3(k27Var2, this.L, this.G, this.F, this.H, false);
    }

    public final boolean J2(defpackage.k27 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.J2(k27):boolean");
    }

    public final void J3(int i, boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (i == -1 || i == 0) {
            if (this.r5 != z) {
                this.r5 = z;
                if (!z2) {
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    this.s5 = f;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i != -1 && i != 1) || this.F5 == z) {
            return;
        }
        this.F5 = z;
        if (!z2) {
            if (z) {
                f2 = 1.0f;
            }
            this.G5 = f2;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    public final boolean K(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.K(android.view.MotionEvent):boolean");
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        if (this.R5 != null) {
            return this.U5;
        }
        return this.G;
    }

    public final void K3() {
        ml mlVar = this.U0;
        L3((mlVar.N0 / 2.0f) + mlVar.L0, (mlVar.O0 / 2.0f) + mlVar.M0);
    }

    public final boolean L(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.L(android.view.MotionEvent):boolean");
    }

    public final boolean L0() {
        k27 k27Var;
        if (this.dc && (k27Var = this.Q5) != null && k27Var.O3() && bkb.v0(bkb.tb, this.cc) != 0) {
            return true;
        }
        return false;
    }

    public final ColorFilter L1(int i, int i2) {
        ColorFilter[] colorFilterArr = this.Ad;
        if (colorFilterArr == null) {
            this.Bd = new int[3];
            colorFilterArr = new ColorFilter[3];
            this.Ad = colorFilterArr;
        }
        if (i2 != this.Bd[i] || colorFilterArr[i] == null) {
            this.Bd[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.Ad[i];
    }

    public final boolean L2() {
        if (this.R5 != null) {
            return this.T5;
        }
        return this.F;
    }

    public final void L3(float f, float f2) {
        gb2 gb2Var;
        ml mlVar = this.U0;
        this.ba = (float) Math.sqrt(Math.pow(mlVar.O0, 2.0d) + Math.pow(mlVar.N0, 2.0d));
        k27 k27Var = this.Q5;
        if (!k27Var.O0 && this.Y9 == 0.0f) {
            if (k27Var.D == 3) {
                k27Var.M1 = true;
                k27Var.Q0 = true;
                gb2Var = this;
                gb2Var.y3(k27Var, this.L, this.G, this.F, this.H, this.I);
                k27 k27Var2 = gb2Var.Q5;
                k27Var2.Q0 = false;
                k27Var2.M1 = false;
                if (gb2Var.L != null) {
                    gb2Var.Q0.o(false, 0.0f);
                }
            } else {
                gb2Var = this;
            }
            gb2Var.Z9 = f;
            gb2Var.aa = f2;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(moe.a(gb2Var.ba * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(s33.j);
            duration.addUpdateListener(new uz1(gb2Var, (byte) 5));
            duration.addListener(new ab2(gb2Var, (byte) 0));
            duration.start();
        }
    }

    public final boolean M(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.x7) {
            int x = (int) motionEvent.getX();
            int P1 = (int) P1(motionEvent);
            c27 c27Var = this.M;
            if (c27Var != null) {
                int i = c27Var.l;
                if ((i & 1) == 0 || (i & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt != this && (childAt instanceof gb2)) {
                            gb2 gb2Var = (gb2) childAt;
                            if (gb2Var.x7 && gb2Var.L == this.L) {
                                int i3 = gb2Var.M.l;
                                if ((i3 & 1) != 0 && (i3 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - gb2Var.getLeft(), (P1(motionEvent) + getTop()) - gb2Var.getTop(), 0);
                                    boolean M = gb2Var.M(obtain);
                                    obtain.recycle();
                                    return M;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.J2;
            if (action == 0) {
                if (this.y7.contains(x, P1)) {
                    if (this.Q5.p4()) {
                        this.L2[1] = 2;
                        this.z7 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x, P1);
                            drawableArr[1].setState(this.N2);
                        }
                        t2();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.z7) {
                    bb2 bb2Var = this.eb;
                    if (bb2Var != null) {
                        if (this.u6) {
                            bb2Var.q1(this);
                        } else {
                            bb2Var.N0(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.z7 = false;
                    t2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.z7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x, P1);
            }
        }
        return false;
    }

    public final boolean M0(android.graphics.Canvas r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.M0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final boolean M2() {
        if (this.Kb && this.Lb) {
            return true;
        }
        return false;
    }

    public final boolean M3() {
        bb2 bb2Var;
        if (getCurrentMessagesGroup() == null && (bb2Var = this.eb) != null && bb2Var.E2() != null && this.eb.E2().y(this.Q5)) {
            return true;
        }
        return false;
    }

    @Override
    public final void N(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.N(java.lang.String):void");
    }

    public void N0(Canvas canvas) {
        if (!this.Q5.O0 && this.Y9 != 1.0f) {
            ml mlVar = this.U0;
            int[] iArr = mlVar.X0;
            float f = iArr[0];
            float[] fArr = this.W9;
            fArr[1] = f;
            fArr[0] = f;
            float f2 = iArr[1];
            fArr[3] = f2;
            fArr[2] = f2;
            float f3 = iArr[2];
            fArr[5] = f3;
            fArr[4] = f3;
            float f4 = iArr[3];
            fArr[7] = f4;
            fArr[6] = f4;
            Path path = this.V9;
            path.rewind();
            RectF rectF = gl.P;
            rectF.set(mlVar.L0, mlVar.M0, mlVar.w(), mlVar.x());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.Y9 != 0.0f) {
                path.rewind();
                path.addCircle(this.Z9, this.aa, this.ba * this.Y9, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.Q5.l5()) {
                mlVar.h(canvas, null);
            } else {
                float f5 = mlVar.L0;
                float f6 = mlVar.M0;
                float f7 = mlVar.N0;
                float f8 = mlVar.O0;
                ImageReceiver imageReceiver = this.V0;
                imageReceiver.i0(f5, f6, f7, f8);
                imageReceiver.s0(mlVar.X0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final boolean N2() {
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.R4()) {
            return false;
        }
        return true;
    }

    public final boolean O(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.Q5.D == 12) {
            hb2 hb2Var = this.w2;
            if (hb2Var == null) {
                hb2Var = new hb2(this);
                this.w2 = hb2Var;
            }
            gb2 gb2Var = hb2Var.a;
            k27 k27Var = gb2Var.Q5;
            int[] iArr = gb2Var.N2;
            Drawable[] drawableArr = gb2Var.J2;
            if (k27Var.D == 12) {
                int x = (int) motionEvent.getX();
                int P1 = (int) gb2Var.P1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = hb2Var.g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i = 0; i < hb2Var.g.size(); i++) {
                            db2 db2Var = (db2) hb2Var.g.get(i);
                            float f = x;
                            float f2 = P1;
                            if (db2Var.e.contains(f, f2)) {
                                n41 n41Var = db2Var.f;
                                if (n41Var == null) {
                                    n41Var = new n41(gb2Var);
                                    db2Var.f = n41Var;
                                }
                                n41Var.c(true);
                                ff0 ff0Var = db2Var.g;
                                if (ff0Var != null) {
                                    ff0Var.setHotspot(f, f2);
                                    db2Var.g.setState(iArr);
                                }
                                gb2Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f3 = x;
                    float f4 = P1;
                    if (gb2Var.v2.contains(f3, f4)) {
                        hb2Var.h = true;
                        gb2Var.Sa.c(true);
                        Drawable drawable2 = drawableArr[0];
                        if (drawable2 != null) {
                            drawable2.setHotspot(f3, f4);
                            drawableArr[0].setState(iArr);
                        }
                        gb2Var.invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (hb2Var.h) {
                        if (gb2Var.eb != null) {
                            ArrayList arrayList2 = hb2Var.g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                gb2Var.eb.F1(gb2Var, ((db2) hb2Var.g.get(0)).a);
                            } else {
                                gb2Var.eb.F1(gb2Var, 5);
                            }
                        }
                        gb2Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        hb2Var.h = false;
                        gb2Var.Sa.c(false);
                        gb2Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = hb2Var.g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i2 = 0; i2 < hb2Var.g.size(); i2++) {
                            db2 db2Var2 = (db2) hb2Var.g.get(i2);
                            n41 n41Var2 = db2Var2.f;
                            if (n41Var2 != null && n41Var2.i) {
                                bb2 bb2Var = gb2Var.eb;
                                if (bb2Var != null) {
                                    bb2Var.F1(gb2Var, db2Var2.a);
                                }
                                ff0 ff0Var2 = db2Var2.g;
                                if (ff0Var2 != null) {
                                    ff0Var2.setState(StateSet.NOTHING);
                                }
                                db2Var2.f.c(false);
                                gb2Var.playSoundEffect(0);
                                gb2Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (hb2Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x, P1);
                        return false;
                    }
                    ArrayList arrayList4 = hb2Var.g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= hb2Var.g.size()) {
                                break;
                            }
                            db2 db2Var3 = (db2) hb2Var.g.get(i3);
                            n41 n41Var3 = db2Var3.f;
                            if (n41Var3 != null && n41Var3.i) {
                                ff0 ff0Var3 = db2Var3.g;
                                if (ff0Var3 != null) {
                                    ff0Var3.setHotspot(x, P1);
                                    return false;
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void O0(Canvas canvas) {
        if (this.ca == null) {
            return;
        }
        canvas.save();
        ml mlVar = this.U0;
        canvas.translate(mlVar.L0, mlVar.M0);
        this.ca.c(canvas, this, (int) mlVar.N0, (int) mlVar.O0, mlVar.getAlpha(), this.Tc);
        canvas.restore();
        invalidate();
    }

    public final m17 O1(boolean z) {
        boolean z2;
        if (z) {
            c27 c27Var = this.M;
            if (c27Var != null && (c27Var.l & 8) == 0 && this.L.i && !this.K) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean O3 = this.Q5.O3();
            boolean z3 = this.C6;
            if (O3) {
                if (!z3 && !this.K && !z2) {
                    this.L6 = d3("drawableMsgOut");
                } else {
                    this.L6 = d3("drawableMsgOutMedia");
                }
            } else if (!z3 && !this.K && !z2) {
                this.L6 = (m17) b2("drawableMsgIn");
            } else {
                this.L6 = (m17) b2("drawableMsgInMedia");
            }
        }
        this.L6.f();
        return this.L6;
    }

    public final boolean O2() {
        k27 k27Var;
        if (this.Y6 && (k27Var = this.Q5) != null && !k27Var.O3() && this.M == null && !v2()) {
            return true;
        }
        return false;
    }

    public final boolean P(MotionEvent motionEvent) {
        float f;
        bb2 bb2Var;
        k27 k27Var = this.Q5;
        if (k27Var == null || k27Var.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f2 = 0.0f;
        if (this.j0 == 0) {
            f = 0.0f;
        } else {
            f = 18.0f;
        }
        float L = timeX - gl.L(f);
        float f3 = this.M9;
        if (this.Q5.B0) {
            f2 = 1.0f - this.k4;
        }
        int L2 = ((int) ((f3 * f2) + L)) - gl.L(2.0f);
        int timeY = ((int) getTimeY()) - gl.L(2.0f);
        RectF rectF = gl.P;
        rectF.set(L2, timeY, gl.L(16.0f) + L2 + this.M9, gl.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), P1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.l0 == null) {
                    this.l0 = new n41(this);
                }
                this.sc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.sc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.sc && (bb2Var = this.eb) != null) {
                bb2Var.v2(this);
            }
            this.sc = false;
        } else if (motionEvent.getAction() == 3) {
            this.sc = false;
        }
        n41 n41Var = this.l0;
        if (n41Var != null) {
            n41Var.c(this.sc);
        }
        return this.sc;
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k27 k27Var;
        bb2 bb2Var;
        String str;
        boolean c = jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i = 1;
        int i2 = this.a6;
        if (!c && !jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                z3a B = z3a.B(i2);
                k27 k27Var2 = this.Q5;
                if (k27Var2 != null && keyboardButtonProto != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(k27.B0(k27Var2.k));
                    sb.append("_");
                    sb.append(k27Var2.e1());
                    sb.append("_");
                    sb.append(Utilities.f(keyboardButtonProto.getData()));
                    sb.append("_");
                    if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb.append(str);
                    return B.n.containsKey(sb.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (bb2Var = this.eb) != null && bb2Var.A1(this, 3) && TextUtils.equals(this.eb.b1(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            z3a B2 = z3a.B(i2);
            if (this.Q5 != null && keyboardButtonProto != null) {
                if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i = 3;
                } else if (!jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                return B2.r.containsKey(k27.B0(k27Var.k) + "_" + k27Var.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i);
            }
        }
        return false;
    }

    public final float P1(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.W) - this.g0) - this.i0;
    }

    public final void P3(int i, boolean z) {
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                fb2 fb2Var = (fb2) arrayList.get(i);
                if (this.eb.T0(this, fb2Var.t, !fb2Var.i)) {
                    if (z) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = k27.B0(this.Q5.k);
                    int i2 = this.a6;
                    long M = hc2.M(na7.q1(i2).K0(Long.valueOf(B0)), na7.q1(i2).L0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) k27.m1(this.Q5);
                    int i3 = this.a6;
                    k27.Y5(i3, M, tL_messageMediaToDo, fb2Var.t.id, !fb2Var.i, ConnectionsManager.getInstance(i3).getCurrentTime());
                    if (!fb2Var.i) {
                        TLObject Z1 = na7.q1(i2).Z1(M);
                        fb2Var.y.k(Z1);
                        fb2Var.z.U(Z1, fb2Var.y, null);
                        fb2Var.q = new tgb(cf3.l(Z1), 12.0f, null);
                    }
                    this.f7[i].f(-1, !fb2Var.i, true);
                    if (this.y3 != null) {
                        if (!this.Q5.O3() && k27.B0(this.Q5.k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.y3.t(k96.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(k27.z0(tL_messageMediaToDo)), cf3.k(y6c.t0, this.Q5.Z0())), true, true);
                        } else {
                            this.y3.t(k96.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(k27.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    fb2Var.i = !fb2Var.i;
                    invalidate();
                    return;
                }
                this.Z4 = false;
            }
        }
    }

    public final boolean Q(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        if (this.T1) {
            jb2 G1 = G1();
            gb2 gb2Var = G1.a;
            boolean z = gb2Var.T1;
            ArrayList arrayList = gb2Var.I5;
            i46 i46Var = gb2Var.u4;
            if (z) {
                int x = (int) motionEvent.getX();
                int P1 = (int) gb2Var.P1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (gb2Var.O1 && gb2Var.y1 && gb2Var.O3 != -1 && x >= (i2 = gb2Var.K3) && x <= gl.L(48.0f) + i2 && P1 >= (i3 = gb2Var.L3) && P1 <= gl.L(48.0f) + i3 && gb2Var.Q0.i.q != 4) {
                        gb2Var.P3 = true;
                        gb2Var.invalidate();
                        return true;
                    } else if (gb2Var.O1 && gb2Var.U0.H(x, P1)) {
                        G1.v = true;
                        return true;
                    } else if (gb2Var.p2 == null || P1 < gb2Var.Y1) {
                        return false;
                    } else {
                        try {
                            int L = x - ((gb2Var.p0 + gl.L(10.0f)) + gb2Var.a2);
                            int i4 = P1 - gb2Var.Y1;
                            int lineForVertical = gb2Var.p2.getLineForVertical(i4);
                            float f = L;
                            int offsetForHorizontal = gb2Var.p2.getOffsetForHorizontal(lineForVertical, f);
                            float lineLeft = gb2Var.p2.getLineLeft(lineForVertical);
                            if (lineLeft > f || lineLeft + gb2Var.p2.getLineWidth(lineForVertical) < f) {
                                return false;
                            }
                            Spannable spannable = (Spannable) gb2Var.Q5.y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof d4c) && !d4c.h) || gl.A1()) {
                                return false;
                            }
                            m46 m46Var = gb2Var.r4;
                            if (m46Var == null || m46Var.i != clickableSpanArr[0]) {
                                i46Var.l(m46Var, true);
                                m46 m46Var2 = new m46(clickableSpanArr[0], gb2Var.cc, f, i4, 0);
                                gb2Var.r4 = m46Var2;
                                if (gb2Var.Q5.O3()) {
                                    i = bkb.Cc;
                                } else {
                                    i = bkb.Be;
                                }
                                m46Var2.d(bkb.v0(i, gb2Var.cc));
                                gb2Var.y0 = -10;
                                gb2Var.v4 = 2;
                                try {
                                    b46 b = gb2Var.r4.b();
                                    int[] Z1 = Z1(spannable, gb2Var.r4.i);
                                    b.d(gb2Var.p2, Z1[0], 0.0f);
                                    gb2Var.p2.getSelectionPath(Z1[0], Z1[1], b);
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                i46Var.a(gb2Var.r4, 2);
                            }
                            gb2Var.invalidate();
                            return true;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    if (gb2Var.v4 != 2 && !G1.v && !gb2Var.P3) {
                        gb2Var.i3(2);
                        return false;
                    } else if (gb2Var.P3) {
                        gb2Var.P3 = false;
                        gb2Var.playSoundEffect(0);
                        gb2Var.E0(false);
                        gb2Var.invalidate();
                        return false;
                    } else {
                        m46 m46Var3 = gb2Var.r4;
                        if (m46Var3 != null) {
                            CharacterStyle characterStyle = m46Var3.i;
                            if (characterStyle instanceof URLSpan) {
                                d01.t(gb2Var.getContext(), ((URLSpan) gb2Var.r4.i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(gb2Var);
                            }
                            gb2Var.i3(2);
                            return false;
                        }
                        G1.v = false;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                break;
                            }
                            wo0 wo0Var = (wo0) arrayList.get(i5);
                            if (jdb.c(wo0Var.i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                gb2Var.playSoundEffect(0);
                                gb2Var.eb.V0(gb2Var, wo0Var.i);
                                gb2Var.invalidate();
                                break;
                            }
                            i5++;
                        }
                        gb2Var.i3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final String Q1(k27 k27Var) {
        if (this.B5) {
            return k96.N0("PsaMessage_" + k27Var.k.fwd_from.psa_type);
        }
        return k96.M0(2131750548, null);
    }

    public final boolean Q2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.Q2():boolean");
    }

    public final void Q3() {
        k27 k27Var;
        int i;
        boolean z;
        rh9 rh9Var;
        ArrayList arrayList;
        if (this.Kc && (k27Var = this.Q5) != null) {
            boolean z2 = false;
            if (k27Var.X1) {
                i = vl.f();
            } else {
                i = 0;
            }
            i27 i27Var = this.m3;
            if (i27Var != null && (arrayList = i27Var.e) != null) {
                this.Ma = gm.update(i, (View) this, false, this.Ma, (ArrayList<h27>) arrayList);
            } else {
                bb2 bb2Var = this.eb;
                if (bb2Var != null && bb2Var.l()) {
                    z = false;
                } else {
                    z = true;
                }
                this.Ma = gm.update(i, this, z, this.Ma, this.Q5.B2);
            }
            k27 k27Var2 = this.Q5;
            if (k27Var2.D == 36 && (rh9Var = k27Var2.y2) != null) {
                bb2 bb2Var2 = this.eb;
                if (bb2Var2 == null || !bb2Var2.l()) {
                    z2 = true;
                }
                rh9Var.v = z2;
                this.Q5.y2.a0(i);
            }
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.R():void");
    }

    public final void R0(android.graphics.Canvas r34, defpackage.i27 r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.R0(android.graphics.Canvas, i27, boolean, boolean, float):void");
    }

    public final float R1(boolean z) {
        float f;
        zx8 zx8Var;
        float f2;
        if (!this.k1 && this.y6) {
            int i = this.z6;
            if (i >= 300) {
                f2 = 1.0f;
            } else {
                f2 = i / 300.0f;
            }
            f = f2 * 1.0f;
        } else {
            f = 1.0f;
        }
        if (!z && (zx8Var = this.o3) != null) {
            return (1.0f - zx8Var.k.e(false, 1.0f)) * f;
        }
        return f;
    }

    public final boolean R2() {
        k27 k27Var = this.Q5;
        rh9 rh9Var = k27Var.y2;
        if (k27Var.D == 36 && rh9Var != null) {
            ArrayList arrayList = rh9Var.g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof zi9)) {
                return true;
            }
        }
        return false;
    }

    public final void R3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.R3(boolean, boolean, boolean):void");
    }

    public final boolean S(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.S(android.view.MotionEvent):boolean");
    }

    public final void S0(Canvas canvas) {
        k27 k27Var;
        float f;
        k27 k27Var2 = this.Q5;
        if ((k27Var2 == null || !k27Var2.q4()) && (k27Var = this.Q5) != null && !k27Var.n4()) {
            k27 k27Var3 = this.Q5;
            if (k27Var3.D != 27 && !k27Var3.m4() && this.m1 != null) {
                if (this.n1 || this.o1) {
                    c27 c27Var = this.M;
                    if (c27Var != null) {
                        int i = c27Var.l;
                        if ((i & 8) == 0 || (i & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y = getY() + getPaddingTop();
                    f27 f27Var = this.L;
                    if (f27Var != null && f27Var.d.size() > 1) {
                        f = (getTop() + this.L.m.f) - getTranslationY();
                    } else {
                        f = y + this.ub.k0;
                    }
                    canvas.translate(this.a7 - getCompactSideMenuShift(), f + this.Uc);
                    this.m1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean S2() {
        zi9 f4 = f4();
        if (f4 != null) {
            long j = this.mc;
            long j2 = 0;
            if (j != 0) {
                gwc gwcVar = f4.e0;
                if (gwcVar != null) {
                    j2 = gwcVar.t;
                }
                if (j2 == j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void S3() {
        float f;
        float f2;
        float f3;
        float L;
        int i;
        float f4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        k27 k27Var = this.Q5;
        int i9 = k27Var.D;
        float f5 = 0.0f;
        nb2 nb2Var = this.ub;
        int i10 = 0;
        boolean z = true;
        if (i9 != 1 && i9 != 20 && this.M1 != 4 && i9 != 8 && i9 != 23) {
            float f6 = 10.0f;
            float f7 = 11.0f;
            if (this.S1) {
                int i11 = this.N6;
                if (!k27Var.O3()) {
                    f7 = 17.0f;
                }
                this.s3 = gl.L(f7) + i11 + this.r3;
                int i12 = this.v0 - this.u3;
                if (this.J) {
                    f6 = 9.0f;
                }
                int L2 = ((i12 - gl.L(f6)) - this.W1) - gl.L(17.0f);
                if (this.x7 && this.R8 != 3) {
                    i8 = getCommentButtonHeight();
                } else {
                    i8 = 0;
                }
                L = L2 - i8;
                this.t3 = gl.R1(L, gl.L(9.0f) + this.gb, a3());
            } else {
                if (this.Kb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.Q5.O3()) {
                        i7 = 0;
                    } else {
                        i7 = 6;
                    }
                    this.s3 = gl.L(i7 + 11) + backgroundDrawableLeft;
                } else {
                    int i13 = this.N6;
                    if (!k27Var.O3() && !this.C6 && !this.K) {
                        f7 = 17.0f;
                    }
                    this.s3 = gl.L(f7) + i13 + this.r3;
                }
                int i14 = this.v0 - this.u3;
                if (this.J) {
                    f6 = 9.0f;
                }
                int L3 = i14 - gl.L(f6);
                if (this.x7 && this.R8 != 3) {
                    i5 = getCommentButtonHeight();
                } else {
                    i5 = 0;
                }
                int i15 = L3 - i5;
                i19 i19Var = this.O;
                if (!i19Var.p) {
                    i6 = i19Var.n;
                } else {
                    i6 = 0;
                }
                L = i15 - i6;
                this.t3 = gl.R1(L, gl.L(9.0f) + this.gb, a3());
            }
        } else {
            if (nb2Var.g0) {
                f2 = nb2Var.n0;
                f3 = nb2Var.o0;
                f = nb2Var.q0;
            } else {
                ml mlVar = this.U0;
                float f8 = mlVar.L0;
                float f9 = mlVar.M0;
                f = mlVar.O0;
                f2 = f8;
                f3 = f9;
            }
            this.s3 = f2 + gl.L(5.0f) + this.r3;
            if (v2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (u2()) {
                    f4 = this.Ed;
                } else if (this.L != null && this.M != null) {
                    f4 = getLeft();
                } else {
                    f4 = 0.0f;
                }
                this.s3 = compactLeft - f4;
            }
            L = f3 + f + gl.L(6.0f);
            float L4 = f + gl.L(6.0f);
            i27 i27Var = this.m3;
            if (i27Var == null) {
                i = 0;
            } else {
                i = -i27Var.b();
            }
            this.t3 = gl.R1(L4, i - gl.L(4.0f), a3()) + f3;
            z = false;
        }
        this.s3 += getExtraTextX();
        k27 k27Var2 = this.Q5;
        if (k27Var2 != null && (i2 = k27Var2.D) != 0 && i2 != 24 && !k27Var2.v3() && !this.Q5.q4()) {
            if (z && h2()) {
                this.t3 -= (1.0f - a3()) * (gl.L(16.0f) + this.s0.r);
            }
            if (z) {
                ib2 ib2Var = this.s0;
                if (ib2Var != null) {
                    i4 = ib2Var.r;
                } else {
                    i4 = 0;
                }
                i3 = gl.L(14.0f) + i4;
            } else {
                i3 = 0;
            }
            float f10 = L - i3;
            i27 i27Var2 = this.m3;
            if (i27Var2 != null) {
                i10 = gl.L(4.0f) + i27Var2.c(nb2Var);
            }
            this.r0 = (int) ((f10 + gl.U1(a3(), i10, gl.L(6.0f))) - nb2Var.k0);
        }
        k27 k27Var3 = this.Q5;
        if (k27Var3 != null && k27Var3.D == 17) {
            float f11 = this.t3;
            mb2 mb2Var = this.x2;
            if (mb2Var != null) {
                f5 = mb2Var.q;
            }
            this.t3 = f11 + f5;
        }
    }

    public final boolean T(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.T(android.view.MotionEvent):boolean");
    }

    public final void T0(Canvas canvas, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, boolean z3) {
        boolean z4;
        float L;
        int i;
        int v0;
        float f6;
        float f7;
        float f8;
        int i2 = 0;
        if (f5 != 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f9 = (f5 * 0.5f) + 0.5f;
        float f10 = f2 * f5;
        nb2 nb2Var = this.ub;
        i19 i19Var = this.O;
        if (z) {
            if (!this.Q5.O3()) {
                xf7 xf7Var = bkb.D3;
                if (I3()) {
                    v0 = bkb.v0(bkb.jd, this.cc);
                } else {
                    if (z3) {
                        i = bkb.Eb;
                    } else {
                        i = bkb.jd;
                    }
                    v0 = bkb.v0(i, this.cc);
                }
                xf7Var.a(v0);
                if (I3()) {
                    f7 = (getPhotoBottom() + this.w0) - gl.L(9.0f);
                } else {
                    if (!this.G && !this.F) {
                        f6 = 8.5f;
                    } else {
                        f6 = 9.5f;
                    }
                    float L2 = (f - gl.L(f6)) + f3;
                    if (this.Kb && !v2()) {
                        if (this.K) {
                            f8 = 4.0f;
                        } else {
                            f8 = 5.0f;
                        }
                        f7 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (i19Var.i(nb2Var.L1) + gl.L(f8)));
                    } else {
                        f7 = L2;
                    }
                }
                if (!this.Q5.r1) {
                    i2 = gl.L(11.0f);
                }
                hf0.u(xf7Var, f4 + i2, f7 - gl.L(12.0f));
                xf7Var.setAlpha((int) (f10 * 255.0f));
                if (z4) {
                    canvas.save();
                    canvas.scale(f9, f9, xf7Var.getBounds().centerX(), xf7Var.getBounds().centerY());
                }
                xf7Var.draw(canvas);
                xf7Var.setAlpha(255);
                invalidate();
                if (z4) {
                    canvas.restore();
                }
            }
        } else if (z2 && !this.Q5.O3()) {
            if (!this.Q5.r1) {
                i2 = gl.L(11.0f);
            }
            float f11 = f4 + i2;
            float f12 = 21.5f;
            if (I3()) {
                L = (getPhotoBottom() + this.w0) - gl.L(21.5f);
            } else {
                if (!this.G && !this.F) {
                    f12 = 20.5f;
                }
                L = (f - gl.L(f12)) + f3;
                if (this.Kb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * i19Var.i(nb2Var.L1);
                }
            }
            RectF rectF = this.c4;
            rectF.set(f11, L, gl.L(14.0f) + f11, gl.L(14.0f) + L);
            int alpha = bkb.a2.getAlpha();
            int i3 = (int) (f10 * 255.0f);
            bkb.a2.setAlpha(i3);
            if (z4) {
                canvas.save();
                canvas.scale(f9, f9, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), bkb.a2);
            bkb.a2.setAlpha(alpha);
            Drawable b2 = b2("drawableMsgError");
            hf0.u(b2, f11 + gl.L(6.0f), L + gl.L(2.0f));
            b2.setAlpha(i3);
            b2.draw(canvas);
            b2.setAlpha(255);
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final String T1(long j) {
        TLRPC.Chat K0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a6;
        if (i > 0) {
            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
            if (V1 != null) {
                return l7c.r(V1);
            }
            return null;
        } else if (i < 0 && (K0 = na7.q1(i2).K0(Long.valueOf(-j))) != null) {
            return K0.title;
        } else {
            return null;
        }
    }

    public final void T2(int i, int i2) {
        c27 c27Var = this.M;
        float f = c27Var.p;
        float f2 = c27Var.r;
        this.Dd = f - f2;
        this.Ed = f2;
        this.Fd = (int) c27Var.q;
        this.Gd = (int) ((i * c27Var.s) / (i2 / 1000.0f));
    }

    public final void T3() {
        TLRPC.Chat chat;
        if (this.Q5 != null) {
            int i = this.a6;
            na7 q1 = na7.q1(i);
            TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.k.fwd_from;
            long e = y6c.h(i).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (k27.B0(this.Q5.k) == e || k27.B0(this.Q5.k) == 1271266957)) {
                this.wa = na7.q1(i).K0(Long.valueOf(messageFwdHeader.from_id.channel_id));
                return;
            }
            if (messageFwdHeader != null) {
                if (k27.B0(this.Q5.k) == 489000) {
                    long n = cf3.n(messageFwdHeader.from_id);
                    if (n >= 0) {
                        this.va = q1.V1(Long.valueOf(n));
                        return;
                    } else {
                        this.wa = q1.K0(Long.valueOf(-n));
                        return;
                    }
                }
                TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                if (peer != null) {
                    long j = peer.user_id;
                    if (j != 0) {
                        if (!this.h6) {
                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                            if (peer2 instanceof TLRPC.TL_peerUser) {
                                this.va = q1.V1(Long.valueOf(peer2.user_id));
                                return;
                            }
                        }
                        this.va = q1.V1(Long.valueOf(j));
                        return;
                    } else if (peer.channel_id != 0) {
                        if (this.Q5.j4()) {
                            TLRPC.Peer peer3 = messageFwdHeader.from_id;
                            if (peer3 instanceof TLRPC.TL_peerUser) {
                                this.va = q1.V1(Long.valueOf(peer3.user_id));
                                return;
                            }
                        }
                        this.wa = q1.K0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                        return;
                    } else {
                        long j2 = peer.chat_id;
                        if (j2 != 0) {
                            TLRPC.Peer peer4 = messageFwdHeader.from_id;
                            if (peer4 instanceof TLRPC.TL_peerUser) {
                                this.va = q1.V1(Long.valueOf(peer4.user_id));
                                return;
                            } else {
                                this.wa = q1.K0(Long.valueOf(j2));
                                return;
                            }
                        }
                        return;
                    }
                } else if ((messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || k27.B0(this.Q5.k) == e)) {
                    this.va = q1.V1(Long.valueOf(messageFwdHeader.from_id.user_id));
                    return;
                }
            }
            if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || k27.B0(this.Q5.k) == e)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.va = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || k27.B0(this.Q5.k) == e)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.va = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = k27.B0(this.Q5.k);
                long Z0 = this.Q5.Z0();
                TLRPC.Chat chat2 = null;
                if (cf3.y(Z0)) {
                    chat = q1.K0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (cf3.y(B0)) {
                    chat2 = q1.K0(Long.valueOf(-B0));
                }
                if (cf3.B(k27.B0(this.Q5.k))) {
                    if (this.Q5.O3()) {
                        this.va = y6c.h(i).f();
                        return;
                    }
                    TLRPC.EncryptedChat Y0 = q1.Y0(Integer.valueOf((int) (k27.B0(this.Q5.k) & 4294967295L)));
                    if (Y0 != null) {
                        this.va = q1.V1(Long.valueOf(Y0.user_id));
                    }
                } else if (cf3.D(Z0) && (!this.Q5.k.post || (chat != null && chat.signature_profiles))) {
                    this.va = q1.V1(Long.valueOf(Z0));
                } else if (this.Q5.k.post && chat2 != null && !chat2.signature_profiles) {
                    this.wa = chat2;
                } else if (cf3.y(Z0)) {
                    this.wa = chat;
                } else {
                    TLRPC.Message message = this.Q5.k;
                    if (message.post) {
                        this.wa = q1.K0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean U() {
        return ba4.G(this.a6).k(getFilename());
    }

    public final void U0(Canvas canvas, float f) {
        int i;
        if (this.R8 == 3) {
            int L = gl.L(32.0f);
            if (this.n7 != null) {
                this.e9 -= gl.L(18.0f);
                L += gl.L(18.0f);
            }
            float f2 = this.d9;
            float f3 = this.e9 + L;
            RectF rectF = this.c4;
            rectF.set(f2, this.e9, gl.L(32.0f) + f2, f3);
            z();
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i2 != 0) {
                int alpha = c2("paintChatActionBackground").getAlpha();
                c2("paintChatActionBackground").setAlpha((int) (alpha * f));
                canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), c2("paintChatActionBackground"));
                c2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float L2 = gl.L(16.0f);
                float L3 = gl.L(16.0f);
                if (this.U8) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, L2, L3, c2(str));
            }
            if (i2()) {
                if (i2 != 0) {
                    int alpha2 = bkb.g2.getAlpha();
                    bkb.g2.setAlpha((int) (alpha2 * f));
                    canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), bkb.g2);
                    bkb.g2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), bkb.g2);
                }
            }
            Drawable P0 = bkb.P0("drawableCommentSticker");
            if (v2()) {
                Drawable drawable = this.Wc;
                if (drawable == null) {
                    drawable = P0.getConstantState().newDrawable().mutate();
                    this.Wc = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.Sa, this.cc), PorterDuff.Mode.SRC_IN));
                P0 = this.Wc;
            }
            hf0.u(P0, this.d9 + gl.L(4.0f), this.e9 + gl.L(4.0f));
            if (i2 != 0) {
                P0.setAlpha((int) (f * 255.0f));
                P0.draw(canvas);
                P0.setAlpha(255);
            } else {
                P0.draw(canvas);
            }
            if (this.n7 != null) {
                TextPaint textPaint = bkb.D2;
                if (v2()) {
                    i = bkb.Sa;
                } else {
                    i = bkb.Nd;
                }
                textPaint.setColor(bkb.v0(i, this.cc));
                bkb.D2.setAlpha((int) (f * 255.0f));
                nb2 nb2Var = this.ub;
                if (nb2Var.V) {
                    if (nb2Var.W != null) {
                        canvas.save();
                        bkb.D2.setAlpha((int) ((1.0d - nb2Var.L1) * 255.0d * f));
                        canvas.translate(this.d9 + ((gl.L(32.0f) - nb2Var.Y) / 2), this.e9 + gl.L(30.0f));
                        nb2Var.W.draw(canvas);
                        canvas.restore();
                    }
                    bkb.D2.setAlpha((int) (nb2Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.d9 + ((gl.L(32.0f) - this.v7) / 2), this.e9 + gl.L(30.0f));
                this.n7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(boolean z) {
        s33 s33Var;
        float f = this.vd;
        k27 k27Var = this.Q5;
        if (k27Var != null && !k27Var.O3()) {
            int i = 0;
            if (z) {
                if (!this.n1) {
                    if (this.o1) {
                        s33Var = s33.i;
                    }
                } else {
                    s33Var = s33.g;
                }
                this.r1 = (int) Math.ceil(s33Var.getInterpolation(this.p1) * gl.L(35.0f));
                if (this.Q5.D == 36) {
                    if (gl.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.r1 = 0;
                    }
                }
            }
            f += this.r1;
            if (v2()) {
                return f + getCompactSideMenuShift();
            }
            if (this.X6 && this.M != null) {
                if (b3()) {
                    i = 48;
                }
                return (gl.L(71 - i) * this.Z6) + f;
            }
        }
        return f;
    }

    public final int U2(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.U2(int):int");
    }

    public final void U3() {
        Window window;
        if (this.zb == null) {
            Activity W = gl.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                h24 h24Var = new h24(window, new rh1(this, (byte) 22));
                this.zb = h24Var;
                if (this.O0) {
                    h24Var.a();
                }
            }
        }
        h24 h24Var2 = this.zb;
        if (h24Var2 != null) {
            h24Var2.i();
        }
    }

    public final boolean V(MotionEvent motionEvent) {
        ff0 ff0Var;
        gb2 gb2Var;
        bb2 bb2Var;
        TLRPC.Chat chat;
        int i;
        TLRPC.Chat chat2;
        if (this.w9 && this.h9 != null && (ff0Var = this.V2) != null && (this.va != null || this.wa != null)) {
            boolean contains = ff0Var.getBounds().contains((int) motionEvent.getX(), (int) P1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.W2 = contains;
                if (contains) {
                    this.V2.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.V2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (bb2Var = this.eb) != null) {
                    if (this.S6) {
                        TLRPC.User user = this.Fa;
                        if (user != null && user.bot_inline_placeholder == null) {
                            bb2Var.E0(this, user.id);
                        } else {
                            String p = l7c.p(user);
                            bb2 bb2Var2 = this.eb;
                            if (p == null) {
                                p = this.Q5.k.via_bot_name;
                            }
                            bb2Var2.l0(p);
                        }
                    } else {
                        TLRPC.User user2 = this.va;
                        if (user2 != null) {
                            bb2Var.c0(this, user2, motionEvent.getX(), P1(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.wa;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i2 = messageFwdHeader.channel_post;
                                    chat = this.Ga;
                                    i = i2;
                                } else {
                                    chat = chat3;
                                    i = 0;
                                }
                                if (chat != null) {
                                    chat2 = chat;
                                } else {
                                    chat2 = chat3;
                                }
                                gb2Var = this;
                                bb2Var.i2(gb2Var, chat2, i, this.h1, this.i1, false);
                                gb2Var.V2.setState(StateSet.NOTHING);
                                gb2Var.W2 = false;
                                return gb2Var.W2;
                            }
                        }
                    }
                }
                gb2Var = this;
                gb2Var.V2.setState(StateSet.NOTHING);
                gb2Var.W2 = false;
                return gb2Var.W2;
            }
            gb2Var = this;
            return gb2Var.W2;
        }
        this.W2 = false;
        return false;
    }

    public final void V0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.V0(android.graphics.Canvas, float):void");
    }

    public final ImageReceiver V1(int i) {
        TLRPC.PollAnswer pollAnswer;
        yd8 yd8Var;
        yd8 yd8Var2;
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.D == 17) {
            if (i == -2) {
                mb2 mb2Var = this.x2;
                if (mb2Var != null && (yd8Var2 = mb2Var.m) != null) {
                    return yd8Var2.b;
                }
                return null;
            } else if (i == -3) {
                mb2 mb2Var2 = this.x2;
                if (mb2Var2 != null && (yd8Var = mb2Var2.n) != null) {
                    return yd8Var.b;
                }
                return null;
            } else {
                ArrayList arrayList = this.Q4;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        fb2 fb2Var = (fb2) obj;
                        wd8 wd8Var = fb2Var.x;
                        if (wd8Var != null && (pollAnswer = fb2Var.s) != null && pollAnswer.unshuffled_index == i) {
                            return wd8Var.c;
                        }
                    }
                }
            }
        }
        fb5 fb5Var = this.X5;
        if (fb5Var != null) {
            ArrayList arrayList2 = fb5Var.c;
            db5 db5Var = fb5Var.b;
            if (db5Var != null && i >= 0 && i < db5Var.a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) fb5Var.b.a.get(i);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((eb5) arrayList2.get(i3)).F == messageExtendedMedia) {
                        return ((eb5) arrayList2.get(i3)).f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.U0;
    }

    public final void V2(boolean z) {
        int currentBackgroundLeft;
        float f;
        int L;
        int extraTextX;
        int i;
        float f2;
        int L2;
        int currentBackgroundLeft2;
        boolean O3 = this.Q5.O3();
        int i2 = 0;
        nb2 nb2Var = this.ub;
        if (O3) {
            if (z) {
                currentBackgroundLeft2 = (int) (this.N6 + nb2Var.h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            extraTextX = getExtraTextX() + gl.L(11.0f) + currentBackgroundLeft2;
            this.o0 = extraTextX;
        } else {
            if (z) {
                currentBackgroundLeft = (int) (this.N6 + nb2Var.h0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.Q5.D == 19) {
                L = 0;
            } else {
                if (!this.C6 && this.K) {
                    f = 11.0f;
                } else {
                    f = 17.0f;
                }
                L = gl.L(f);
            }
            extraTextX = currentBackgroundLeft + L + getExtraTextX();
            this.o0 = extraTextX;
        }
        float f3 = 4.0f;
        if (this.T1) {
            this.o0 = gl.L(11.0f) + extraTextX;
            int L3 = gl.L(14.0f) + this.gb;
            this.u0 = L3;
            StaticLayout staticLayout = this.g2;
            if (staticLayout != null) {
                this.u0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.U1) {
            int L4 = gl.L(14.0f) + this.gb;
            this.u0 = L4;
            StaticLayout staticLayout2 = this.g2;
            if (staticLayout2 != null) {
                this.u0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.Q5.D == 19) {
            this.u0 = gl.L(6.0f) + this.gb;
            if (!this.Q5.N3()) {
                this.o0 = getCurrentBackgroundLeft();
            } else {
                this.o0 -= gl.L(4.0f);
            }
        } else {
            int L5 = gl.L(8.0f) + this.gb;
            this.u0 = L5;
            k27 k27Var = this.Q5;
            float f4 = 2.0f;
            if (k27Var.D == 36) {
                if (this.w1 && this.m3 != null && R2()) {
                    this.u0 = de9.w(7.0f, this.m3.b(), this.u0);
                } else {
                    rh9 rh9Var = this.Q5.y2;
                    if (rh9Var != null && rh9Var.X()) {
                        int i3 = this.u0;
                        if (this.gb <= 0) {
                            f4 = -3.0f;
                        }
                        this.u0 = gl.L(f4) + i3;
                    }
                }
            } else {
                if (k27Var.E2 && (i = gba.U0) > 10) {
                    if (i < 15) {
                        f4 = 1.0f;
                    }
                    L5 += gl.L(f4);
                    this.u0 = L5;
                }
                if (this.Q5.E2 && this.gb > 0) {
                    this.u0 = gl.L(5.0f) + L5;
                }
            }
        }
        if (this.Q5.q4()) {
            this.q0 = gl.L(14.0f) + this.u0;
        } else {
            boolean z2 = this.v1;
            int i4 = this.u0;
            if (z2) {
                this.q0 = gl.L(10.0f) + i4;
                this.u0 = de9.w(13.0f, this.W1, this.u0);
                if (this.u2 && !this.U1 && !this.Q5.v3()) {
                    this.u0 = gl.L(44.0f) + this.u0;
                }
            } else {
                this.q0 = gl.L(10.0f) + this.Q5.V5(nb2Var) + i4;
            }
        }
        if (this.v1) {
            L2 = gl.L(10.0f) + this.Q5.V5(nb2Var) + this.u0;
        } else {
            int i5 = this.q0 + this.W1;
            if (this.u2) {
                f2 = 46.0f;
            } else {
                f2 = 0.0f;
            }
            int L6 = gl.L(f2) + i5;
            if (this.W1 <= 0) {
                f3 = -8.0f;
            }
            L2 = gl.L(f3) + L6;
        }
        this.r0 = L2;
        this.p0 = this.o0;
        if (this.Q5.x2 != 0.0f && this.Q7 != null) {
            int L7 = this.b7 - gl.L(31.0f);
            k27 k27Var2 = this.Q5;
            int i6 = L7 - k27Var2.v2;
            if (!this.c7) {
                int i7 = this.M9;
                if (k27Var2.O3()) {
                    i2 = 20;
                }
                i6 = ug8.B(i2 + 4, i7, i6);
            }
            if (i6 > 0) {
                this.o0 = (i6 - getExtraTimeX()) + this.o0;
            }
        }
    }

    public final void V3(k27 k27Var) {
        boolean z;
        boolean z2;
        String B;
        int i = 0;
        this.B8 = false;
        if (k27Var.D == 9 && this.M1 == 1 && !this.O1 && this.L == null && this.M == null) {
            TLRPC.Document F0 = k27Var.F0();
            int i2 = this.a6;
            do3 do3Var = gb8.a;
            if (!na7.q1(i2).k4.v0.f && F0 != null) {
                if ("application/vnd.apple.pkpass".equalsIgnoreCase(F0.mime_type) || ((B = ba4.B(F0)) != null && B.toLowerCase(Locale.ROOT).endsWith(".pkpass"))) {
                    long j = F0.size;
                    if (j > 0 && j <= 2097152 && !gb8.c.containsKey(Long.valueOf(F0.id))) {
                        if (this.A8 == null) {
                            this.A8 = new eb8();
                        }
                        this.H8 = this.b7 - gl.L(11.0f);
                        bb8 bb8Var = (bb8) gb8.b.get(Long.valueOf(F0.id));
                        if (bb8Var != null) {
                            try {
                                this.F8 = this.A8.e(bb8Var, this.H8);
                                z = true;
                            } catch (Throwable th) {
                                fa4.g(th, true);
                                long j2 = F0.id;
                                gb8.b.remove(Long.valueOf(j2));
                                gb8.c.put(Long.valueOf(j2), Boolean.TRUE);
                                return;
                            }
                        } else {
                            int i3 = this.H8;
                            Paint paint = eb8.B;
                            this.F8 = Math.round((i3 * 7.0f) / 5.0f);
                            e3(k27Var);
                            z = false;
                        }
                        this.D8 = z;
                        if (this.gb == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.C8 = z2;
                        if (!z2) {
                            i = gl.L(6.0f);
                        }
                        this.gb += this.F8 + i;
                        this.B8 = true;
                    }
                }
            }
        }
    }

    public final boolean W(MotionEvent motionEvent) {
        bb2 bb2Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.w9 && this.h9 != null && this.V2 != null && ((this.va != null || this.wa != null) && this.za != null && this.Ca != null)) {
            boolean contains = this.b3.getBounds().contains((int) motionEvent.getX(), (int) P1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.c3 = contains;
                if (contains) {
                    this.b3.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.b3.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.c3 && (bb2Var = this.eb) != null && (user = this.va) != null) {
                    Drawable drawable = this.Ca.f[0];
                    if (drawable instanceof vl) {
                        document = ((vl) drawable).e;
                    } else {
                        document = null;
                    }
                    bb2Var.E(this, user, document, this.Ba);
                    r2();
                }
                this.b3.setState(StateSet.NOTHING);
                this.c3 = false;
            }
            return this.c3;
        }
        this.c3 = false;
        return false;
    }

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.W0(android.graphics.Canvas):void");
    }

    public final float W1(int i) {
        fb2 fb2Var;
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                int i2 = ((fb2) arrayList.get(i)).b;
                int i3 = this.gb;
                float f = i2 + i3;
                nb2 nb2Var = this.ub;
                if (nb2Var.u2) {
                    float f2 = nb2Var.L1;
                    f += ((1.0f - f2) * nb2Var.v2) + (i3 * f2);
                    if (this.Q5.m5()) {
                        f -= this.gb;
                    }
                }
                if (nb2Var.x0) {
                    f += nb2Var.k0;
                }
                return f + fb2Var.c + gl.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void W3() {
        boolean z;
        String k0;
        double d;
        double d2;
        double d3;
        yd8 yd8Var;
        yd8 yd8Var2;
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            ya2 ya2Var = this.bc;
            if (ya2Var != null && ya2Var.rewindCount != 0 && ya2Var.rewindByBackSeek) {
                k27Var.b0 = ya2Var.getVideoProgress();
            }
            boolean z2 = true;
            if (this.Q5.S3()) {
                mb2 mb2Var = this.x2;
                if (mb2Var != null && (yd8Var2 = mb2Var.m) != null) {
                    yd8Var2.p(true);
                }
                mb2 mb2Var2 = this.x2;
                if (mb2Var2 != null && (yd8Var = mb2Var2.n) != null) {
                    yd8Var.p(true);
                }
            }
            byte b = this.M1;
            xa2 xa2Var = this.D4;
            double d4 = 0.0d;
            int i = 0;
            if (b == 4) {
                if (xa2Var != null) {
                    xa2Var.a();
                }
                if (this.x3 != null) {
                    if (!PhotoViewer.N0(this.Q5)) {
                        if (MediaController.w().w0 == this.Q5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                km m = this.U0.m();
                if (m != null) {
                    k27 k27Var2 = this.Q5;
                    int i2 = m.d[4] / 1000;
                    k27Var2.j0 = i2;
                    d3 = i2;
                    TLRPC.Message message = k27Var2.k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !k27Var2.l5() && k27.K4(this.Q5.k) && m.s()) {
                        this.eb.j0(this.Q5);
                    }
                } else {
                    d3 = 0.0d;
                }
                if (d3 == 0.0d) {
                    d3 = this.Q5.L0();
                }
                if (MediaController.w().D(this.Q5)) {
                    d3 -= this.Q5.b0 * d3;
                } else if (m != null) {
                    if (d3 != 0.0d) {
                        d3 -= m.o() / 1000;
                    }
                    if (this.eb != null && m.o() >= 3000) {
                        this.eb.B0();
                    }
                }
                if (this.M4 != d3) {
                    String g0 = gl.g0((int) d3, false, false);
                    this.C3 = (int) Math.ceil(bkb.B2.measureText(g0));
                    this.x3 = new StaticLayout(g0, bkb.B2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M4 = d3;
                    return;
                }
                return;
            }
            boolean z3 = this.Kb;
            dv9 dv9Var = this.E4;
            if (z3) {
                if (this.C4) {
                    if (!dv9Var.f) {
                        dv9Var.f(true, this.Q5.b0);
                    }
                } else {
                    if (!xa2Var.e) {
                        xa2Var.g(this.Q5.b0);
                        xa2Var.q = this.Q5.g0;
                    }
                    xa2Var.a();
                }
                TLRPC.Document F0 = this.Q5.F0();
                if (F0 != null) {
                    for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
                        TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            d2 = documentAttribute.duration;
                            break;
                        }
                    }
                }
                d2 = 0.0d;
                long j = this.Bc;
                if (j >= 0) {
                    d2 = j;
                } else if (MediaController.w().D(this.Q5)) {
                    d2 = Math.max(0.0d, d2 - this.Q5.i0);
                }
                if (this.M4 != d2) {
                    this.M4 = d2;
                    String g02 = gl.g0((int) d2, true, false);
                    this.N4 = (int) Math.ceil(bkb.S2.measureText(g02));
                    this.L4 = new StaticLayout(g02, bkb.S2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f = this.Q5.b0;
                if (f != 0.0f) {
                    this.Wb = f;
                    if (f > 0.9f) {
                        this.Wb = 1.0f;
                    }
                }
                invalidate();
            } else if (this.N1 != null) {
                if (this.C4) {
                    if (!dv9Var.f) {
                        dv9Var.f(true, this.Q5.b0);
                    }
                    z = true;
                } else {
                    if (!xa2Var.e) {
                        xa2Var.g(this.Q5.b0);
                        xa2Var.q = this.Q5.g0;
                    }
                    xa2Var.i(this.Q5);
                    z = false;
                }
                byte b2 = this.M1;
                if (b2 == 5) {
                    z = true;
                }
                if (b2 == 3) {
                    long j2 = this.Bc;
                    if (j2 >= 0) {
                        d = j2;
                    } else if (!MediaController.w().D(this.Q5)) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= this.N1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.N1.attributes.get(i4);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d4 = documentAttribute2.duration;
                                break;
                            }
                            i4++;
                        }
                        d = d4;
                    } else {
                        d = this.Q5.i0;
                    }
                    if (this.M4 != d) {
                        this.M4 = d;
                        String g03 = gl.g0((int) d, true, false);
                        this.N4 = (int) Math.ceil(bkb.M2.measureText(g03));
                        this.L4 = new StaticLayout(g03, bkb.M2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.Q5.L0();
                    if (MediaController.w().D(this.Q5)) {
                        i = this.Q5.i0;
                    }
                    double d5 = i;
                    if (this.M4 != d5) {
                        this.M4 = d5;
                        this.L4 = new StaticLayout(gl.k0(i, (int) L0), bkb.M2, (int) Math.ceil(bkb.M2.measureText(k0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z2 = z;
                }
                if (z2) {
                    invalidate();
                }
            }
        }
    }

    public final boolean X(defpackage.k27 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.X(k27):boolean");
    }

    public final void X0(Canvas canvas) {
        float f;
        gb2 gb2Var;
        Canvas canvas2;
        if (this.vc || this.wc) {
            c27 c27Var = this.M;
            if (c27Var == null || (c27Var.c == 0 && c27Var.a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                Jd.setColor(compactHeaderColor);
                Kd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.J) {
                    f = 9.0f;
                } else {
                    f = 10.0f;
                }
                float L = gl.L(f);
                if (this.vc) {
                    gb2Var = this;
                    canvas2 = canvas;
                    gb2Var.Z0(canvas2, this.tc, compactLeft, L, compactHeaderColor);
                    L += gl.L(24.0f);
                } else {
                    gb2Var = this;
                    canvas2 = canvas;
                }
                if (gb2Var.wc) {
                    gb2Var.Z0(canvas2, gb2Var.uc, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final float X1(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                int i2 = ((fb2) arrayList.get(i)).b;
                int i3 = this.gb;
                float f = i2 + i3;
                nb2 nb2Var = this.ub;
                if (nb2Var.u2) {
                    float f2 = nb2Var.L1;
                    f += ((1.0f - f2) * nb2Var.v2) + (i3 * f2);
                    if (this.Q5.m5()) {
                        f -= this.gb;
                    }
                }
                if (nb2Var.x0) {
                    f += nb2Var.k0;
                }
                return f - gl.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void X3() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.S0) {
            return;
        }
        boolean z4 = true;
        if ((!this.x6 && !this.w6 && !isPressed()) || (this.O1 && this.U0.B())) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.P3) {
            z2 = false;
        } else {
            z2 = true;
        }
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.n(z2, false);
        if (this.W3 != 0) {
            if (!z && !this.R3) {
                z3 = false;
            } else {
                z3 = true;
            }
            radialProgress2.n(z3, true);
        }
        if (!z && !this.Q3) {
            z4 = false;
        }
        this.R0.n(z4, false);
    }

    public final boolean Y(MotionEvent motionEvent) {
        byte b;
        c27 c27Var;
        boolean z;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i;
        int L2;
        int i2;
        if ((!w2() || this.Q5.D == 16) && (((b = this.M1) != 5 && b != 1) || (c27Var = this.M) == null || (c27Var.l & 4) != 0)) {
            int i3 = this.Q5.D;
            if (i3 == 16) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (!z) {
                if ((b == 1 || i3 == 12 || b == 5 || b == 4 || b == 2 || i3 == 8) && !this.T1 && !this.U1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                int x = (int) motionEvent.getX();
                int P1 = (int) P1(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.J2;
                if (action == 0) {
                    k27 k27Var = this.Q5;
                    if (k27Var.D == 16) {
                        boolean I4 = k27Var.I4();
                        int i4 = this.S3;
                        if (x >= i4) {
                            if (k96.a0) {
                                L = 0;
                            } else {
                                L = this.b7 - gl.L(70.0f);
                            }
                            int i5 = i4 + L;
                            if (!I4) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            if (x <= gl.L(i + 30) + i5 && P1 >= this.T3 - gl.L(14.0f)) {
                                if (P1 <= gl.L(50.0f) + this.T3) {
                                    this.Z3 = true;
                                    this.L2[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i6 = this.S3;
                                        if (k96.a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.b7 - gl.L(70.0f);
                                        }
                                        int i7 = i6 + L2;
                                        if (!I4) {
                                            i2 = 2;
                                        } else {
                                            i2 = 0;
                                        }
                                        int L3 = gl.L(i2) + i7;
                                        Drawable[] drawableArr2 = bkb.F4;
                                        int w = oo1.w(2, L3, drawableArr2[I4 ? 1 : 0]);
                                        int i8 = oo1.i(2, this.T3, drawableArr2[I4 ? 1 : 0]);
                                        drawableArr[0].setBounds(w - gl.L(20.0f), i8 - gl.L(20.0f), gl.L(20.0f) + w, gl.L(20.0f) + i8);
                                        drawableArr[0].setHotspot(x, P1);
                                        drawableArr[0].setState(this.N2);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x >= this.S3 - gl.L(20.0f)) {
                        if (x <= gl.L(20.0f) + this.S3 && P1 >= this.T3 - gl.L(4.0f)) {
                            if (P1 <= gl.L(30.0f) + this.T3) {
                                this.Z3 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Z3) {
                        if (this.Q5.D == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Z3 = false;
                        playSoundEffect(0);
                        this.eb.s2(this, this.S3, this.T3);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.Q5.D == 16 && this.Z3 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x, P1);
                }
            }
        }
        return false;
    }

    public final int Y1(byte[] bArr) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((fb2) arrayList.get(i)).s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public pla Y2() {
        return pla.e(this);
    }

    public final void Y3() {
        k27 k27Var;
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        if (!this.Q5.N5()) {
            return;
        }
        i19 i19Var = this.O;
        if (!i19Var.p) {
            c27 c27Var = this.M;
            if (c27Var != null) {
                int i4 = c27Var.l;
                if ((i4 & 8) == 0 || (i4 & 1) == 0) {
                    return;
                }
            }
            k27 k27Var2 = this.Q5;
            int i5 = 0;
            if (k27Var2.D != 19 && !k27Var2.G2() && !this.Q5.M2()) {
                float f3 = 11.0f;
                if (this.Q5.O3()) {
                    i19Var.b = gl.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.Kb) {
                    int L = gl.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.K) {
                        i3 = 6;
                    } else {
                        i3 = 0;
                    }
                    int L2 = gl.L(gl.U1(getVideoTranscriptionProgress(), 0, i3)) + L;
                    i19Var.b = L2;
                    i19Var.b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * gl.L(9.0f)));
                } else {
                    int L3 = gl.L((this.C6 || !this.K) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    i19Var.b = L3;
                    if (this.C6) {
                        i19Var.b = L3 - gl.L(9.0f);
                    }
                }
            } else if (this.Q5.O3()) {
                i19Var.b = (getMeasuredWidth() - i19Var.o) - gl.L(16.0f);
            } else {
                i19Var.b = getCurrentBackgroundLeft();
            }
            if (v2()) {
                float compactLeft = getCompactLeft();
                if (u2()) {
                    f2 = this.Ed;
                } else if (this.L != null && this.M != null) {
                    f2 = getLeft();
                } else {
                    f2 = 0.0f;
                }
                i19Var.b = (int) (compactLeft - f2);
            }
            if (!this.Q5.O3() && this.M != null && !v2()) {
                float f4 = i19Var.b;
                if (b3()) {
                    i2 = 48;
                } else {
                    i2 = 0;
                }
                i19Var.b = (int) (f4 - (gl.L(64 - i2) * this.Z6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - gl.L(10.0f)) - i19Var.m;
            i19Var.c = backgroundDrawableBottom;
            if (this.x7) {
                if (v2()) {
                    i5 = getCommentButtonHeight();
                } else {
                    if (this.Q5.D == 29 && f2()) {
                        f = 28.0f;
                    } else {
                        f = 43.0f;
                    }
                    i5 = gl.L(f);
                }
            }
            int i6 = backgroundDrawableBottom - i5;
            i19Var.c = i6;
            if (this.c7 && (!this.E9 || !this.R1 || this.M1 != 3)) {
                i19Var.c = i6 - gl.L(16.0f);
            }
            if (this.Q5.D != 9 && !R2() && this.m3 != null && (((i = (k27Var = this.Q5).D) != 2 && i != 17 && (!k27Var.N3() || !this.E9 || this.O1)) || ((this.M != null && this.L != null) || this.Q5.D == 29))) {
                i19Var.c -= gl.L(14.0f);
            }
            i19Var.c += i19Var.k;
        }
    }

    public final boolean Z(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.Z(android.view.MotionEvent):boolean");
    }

    public final void Z0(Canvas canvas, cb2 cb2Var, float f, float f2, int i) {
        int i2;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z;
        int L = gl.L(16.0f);
        RectF rectF = cb2Var.d;
        ImageReceiver imageReceiver = cb2Var.b;
        boolean z2 = cb2Var.a;
        float f3 = L;
        rectF.set(f, f2, cb2Var.j + f, f2 + f3);
        canvas.save();
        float a = cb2Var.e.a(0.02f);
        RectF rectF2 = cb2Var.d;
        canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
        int p1 = bkb.p1(0.15f, i);
        ff0 ff0Var = cb2Var.k;
        if (ff0Var == null) {
            cb2Var.l = p1;
            ff0 Y = bkb.Y(p1, 6, 6);
            cb2Var.k = Y;
            Y.setCallback(this);
        } else if (cb2Var.l != p1) {
            cb2Var.l = p1;
            bkb.F1(ff0Var, p1, true);
        }
        cb2Var.k.setBounds((int) (rectF2.left - gl.L(6.0f)), (int) (rectF2.top - gl.L(4.0f)), (int) (rectF2.right + gl.L(6.0f)), (int) (rectF2.bottom + gl.L(4.0f)));
        cb2Var.k.draw(canvas);
        if (!z2) {
            bb2 bb2Var = this.eb;
            if (bb2Var != null && bb2Var.A1(this, 0)) {
                z = true;
            } else {
                z = false;
            }
            a1(canvas, cb2Var, i, z);
        }
        if (this.zc == null) {
            this.zc = getContext().getResources().getDrawable(2131232337).mutate();
        }
        if (z2) {
            i2 = bkb.v0(bkb.Ed, this.cc);
        } else {
            i2 = i;
        }
        this.zc.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        int i3 = (int) (((L - intrinsicWidth) / 2.0f) + f);
        int i4 = (int) (((L - intrinsicHeight) / 2.0f) + f2);
        this.zc.setBounds(i3, i4, this.zc.getIntrinsicWidth() + i3, this.zc.getIntrinsicHeight() + i4);
        canvas.save();
        if (!z2) {
            float f4 = f3 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f + f4, f4 + f2);
        }
        this.zc.draw(canvas);
        canvas.restore();
        float L2 = f + f3 + gl.L(6.0f);
        if (cb2Var.f != null) {
            Jd.setColor(i2);
            Y0(canvas, cb2Var.f, L2, f2);
            Jd.setColor(i);
            L2 += gl.L(4.0f) + N1(cb2Var.f);
        }
        if (cb2Var.i) {
            imageReceiver.i0(L2, f2, f3, f3);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += gl.L(5.0f) + L;
        }
        StaticLayout staticLayout = cb2Var.g;
        if (staticLayout != null) {
            if (z2) {
                staticLayout.getPaint().setColor(bm2.k(bkb.p1(0.7f, i2), bkb.v0(bkb.ta, this.cc)));
            }
            Y0(canvas, cb2Var.g, L2, f2);
            if (z2) {
                cb2Var.g.getPaint().setColor(i);
            }
            L2 += gl.L(4.0f) + N1(cb2Var.g);
        }
        if (cb2Var.h != null) {
            canvas.save();
            canvas.translate(L2 - cb2Var.h.getLineLeft(0), ((L - cb2Var.h.getHeight()) / 2.0f) + f2);
            if (z2) {
                cb2Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = cb2Var.h;
                AtomicReference atomicReference = this.Ac;
                ArrayList arrayList = this.fc;
                qla.g(this, this.n0, i, -gl.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                gm.drawAnimatedEmojis(canvas, cb2Var.h, this.Na, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, L1(2, i));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final void Z2(k27 k27Var) {
        long j;
        TLRPC.User V1;
        String replace;
        String str;
        int i;
        long j2;
        int length;
        boolean z;
        long j3;
        int i2;
        int L;
        boolean z2;
        long j4;
        boolean z3;
        String S;
        Locale locale;
        String S2;
        int i3;
        long j5;
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.Message message;
        boolean z4;
        f27 f27Var;
        TLRPC.Chat K0;
        k27 primaryMessageObject = getPrimaryMessageObject();
        long Z0 = k27Var.Z0();
        boolean z5 = k27Var.r1;
        int i4 = this.a6;
        CharSequence charSequence = "";
        if (z5) {
            replace = null;
            j = 0;
        } else {
            if (primaryMessageObject.k.via_business_bot_id != 0) {
                TLRPC.User V12 = na7.q1(k27Var.K1).V1(Long.valueOf(primaryMessageObject.k.via_business_bot_id));
                if (V12 == null) {
                    replace = null;
                } else {
                    replace = l7c.r(V12);
                }
            } else {
                TLRPC.Message message2 = k27Var.k;
                if (message2.post_author != null) {
                    if (this.k6 && k27Var.Z0() == k27.B0(k27Var.k)) {
                        j = 0;
                        replace = null;
                    } else {
                        replace = k27Var.k.post_author.replace("\n", "");
                    }
                } else {
                    TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                    if (messageFwdHeader != null) {
                        String str2 = messageFwdHeader.post_author;
                        if (str2 != null) {
                            replace = str2.replace("\n", "");
                        } else if (messageFwdHeader.imported) {
                            int i5 = messageFwdHeader.date;
                            if (i5 == message2.date) {
                                replace = k96.M0(2131749028, "ImportedMessage");
                            } else {
                                j = 0;
                                try {
                                    Date date = new Date(i5 * 1000);
                                    str = String.format("%1$s, %2$s", k96.D0().B0().format(date), k96.D0().o0().format(date));
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    str = "LOC_ERR";
                                }
                                replace = str + " " + k96.M0(2131749028, "ImportedMessage");
                            }
                        }
                    }
                    j = 0;
                    if (!k27Var.O3() && Z0 > 0 && k27Var.k.post && (V1 = na7.q1(i4).V1(Long.valueOf(Z0))) != null) {
                        replace = qu2.m(0, V1.first_name, V1.last_name).replace('\n', ' ');
                    }
                    replace = null;
                }
            }
            j = 0;
        }
        if (k27.B0(k27Var.k) < j && (K0 = na7.q1(i4).K0(Long.valueOf(-k27.B0(k27Var.k)))) != null && K0.signature_profiles && (k27Var.k.flags & 256) != 0) {
            replace = null;
        }
        if (this.Q5.p3()) {
            na7.q1(i4).V1(Long.valueOf(Z0));
        }
        boolean x2 = k27Var.x2();
        if (!k27Var.r1 && !k27Var.k.edit_hide) {
            if (this.M != null && (f27Var = this.L) != null && !f27Var.d.isEmpty()) {
                this.vb = false;
                x2 = ((k27) this.L.d.get(0)).x2();
                if (!((k27) this.L.d.get(0)).k.edit_hide) {
                    int size = this.L.d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        k27 k27Var2 = (k27) this.L.d.get(i6);
                        if ((k27Var2.k.flags & 32768) != 0 || k27Var2.Y2()) {
                            this.vb = true;
                            break;
                        }
                    }
                }
            } else {
                if ((k27Var.k.flags & 32768) == 0 && !k27Var.Y2()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.vb = z4;
            }
        } else {
            this.vb = false;
        }
        k27 k27Var3 = this.Q5;
        boolean z6 = this.vb;
        f27 f27Var2 = this.L;
        if (f27Var2 != null) {
            ArrayList arrayList = f27Var2.d;
            i = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                k27 k27Var4 = (k27) arrayList.get(i7);
                if (k27Var4 != null && (message = k27Var4.k) != null) {
                    i = Math.max(i, message.edit_date);
                }
            }
        } else {
            i = k27Var.k.edit_date;
        }
        String N3 = N3(k27Var3, k27Var, z6, i);
        if (this.Q5.k.video_processing_pending) {
            N3 = k96.a0(null, null, 2131745654, N3);
        }
        if (replace != null) {
            TLRPC.Message message3 = k27Var.k;
            if (message3.via_business_bot_id != j) {
                this.Q9 = tb4.o(N3, ", ");
            } else {
                TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
                if (messageFwdHeader2 != null && messageFwdHeader2.imported) {
                    this.Q9 = b00.h(" ", N3);
                } else {
                    this.Q9 = b00.h(", ", N3);
                }
            }
        } else {
            this.Q9 = N3;
        }
        TLRPC.MessageMedia n1 = k27.n1(this.Q5.k);
        if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null) {
            TLRPC.MessageMedia n12 = k27.n1(this.Q5.k);
            if ((n12 instanceof TLRPC.TL_messageMediaDice) && (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n12).game_outcome) != null) {
                j5 = tL_messages_emojiGameOutcome.stake_ton_amount;
            } else {
                j5 = j;
            }
            CharSequence concat = TextUtils.concat("💎", jva.J0(j5), "  ", this.Q9);
            this.Q9 = concat;
            this.Q9 = jva.R0(concat, 0.55f, gl.L(-0.33f), 1.05f);
        }
        if (k27.B0(this.Q5.k) < j) {
            j2 = getStarsPrice();
        } else {
            j2 = j;
        }
        if (j2 > j) {
            CharSequence concat2 = TextUtils.concat("⭐️", gl.o0((int) j2, 0), "  ", this.Q9);
            this.Q9 = concat2;
            this.Q9 = jva.X0(false, concat2, 0.8f, null, gl.L(-0.33f), 0.94f);
        }
        TLRPC.Message message4 = this.Q5.k;
        if (message4 != null && (i3 = message4.schedule_repeat_period) != 0) {
            if (i3 == 31536000) {
                this.Q9 = TextUtils.concat(k96.M0(2131748302, null), ", ", this.Q9);
            } else if (i3 == 15724800) {
                this.Q9 = TextUtils.concat(k96.G(6, "MessageScheduledRepeatMonthlyMany", new Object[0]), ", ", this.Q9);
            } else if (i3 == 7862400) {
                this.Q9 = TextUtils.concat(k96.G(3, "MessageScheduledRepeatMonthlyMany", new Object[0]), ", ", this.Q9);
            } else if (i3 == 2592000) {
                this.Q9 = TextUtils.concat(k96.M0(2131748318, null), ", ", this.Q9);
            } else if (i3 == 1209600) {
                this.Q9 = TextUtils.concat(k96.M0(2131748334, null), ", ", this.Q9);
            } else if (i3 == 604800) {
                this.Q9 = TextUtils.concat(k96.M0(2131748303, null), ", ", this.Q9);
            } else if (i3 == 86400) {
                this.Q9 = TextUtils.concat(k96.M0(2131748333, null), ", ", this.Q9);
            } else {
                this.Q9 = TextUtils.concat(k96.a0(null, null, 2131748304, Integer.valueOf(i3)), ", ", this.Q9);
            }
        }
        TextPaint textPaint = bkb.S2;
        CharSequence charSequence2 = this.Q9;
        if (charSequence2 == null) {
            length = 0;
        } else {
            length = charSequence2.length();
        }
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence2, 0, length));
        this.M9 = ceil;
        this.N9 = ceil;
        k27 k27Var5 = this.Q5;
        if ((k27Var5.r1 && k27Var5.k.date == 2147483646) || k27Var5.w1) {
            this.M9 = ceil - gl.L(8.0f);
        }
        bb2 bb2Var = this.eb;
        if (bb2Var != null && bb2Var.R() == 9) {
            z = true;
        } else {
            z = false;
        }
        TLRPC.Message message5 = k27Var.k;
        if ((message5.flags & 1024) != 0 && !z) {
            this.ra = k96.S(null, Math.max(1, message5.views));
            this.qa = (int) Math.ceil(bkb.S2.measureText(S2));
            this.M9 = (int) (this.qa + (((bkb.S2.getTextSize() - gl.L(2.0f)) * bkb.L3.getIntrinsicWidth()) / bkb.L3.getIntrinsicHeight()) + gl.L(10.0f) + this.M9);
        }
        if (k27Var.D == 20) {
            k96 D0 = k96.D0();
            TLRPC.MessageMedia messageMedia = k27Var.k.media;
            String a0 = k96.a0(null, null, 2131747218, D0.p(messageMedia.total_amount, messageMedia.currency).toUpperCase(Locale.ROOT));
            if (a0.length() >= 2) {
                a0 = a0.substring(0, 1).toUpperCase(locale) + a0.substring(1).toLowerCase(locale);
            }
            this.la = a0;
            this.ka = (int) Math.ceil(bkb.u2.measureText(a0));
        }
        if (this.f6 && this.k6 && ((!this.o6 || this.m6) && x2)) {
            this.ua = k96.S(null, getRepliesCount());
            this.ta = (int) Math.ceil(bkb.S2.measureText(S));
            this.M9 = (int) (this.ta + (((bkb.S2.getTextSize() - gl.L(2.0f)) * bkb.P3.getIntrinsicWidth()) / bkb.P3.getIntrinsicHeight()) + gl.L(10.0f) + this.M9);
        } else {
            this.ua = null;
        }
        if (this.q6) {
            this.M9 = de9.w(3.0f, bkb.T3.getIntrinsicWidth(), this.M9);
        }
        if (k27Var.r1) {
            if (k27Var.m4()) {
                this.M9 = gl.L(18.0f) + this.M9;
            } else if (k27Var.n4() && k27Var.k.peer_id.channel_id != j && !k27Var.z4()) {
                this.M9 = gl.L(18.0f) + this.M9;
            }
        }
        if (this.Q5.N5()) {
            this.O.getClass();
        }
        TLRPC.TL_availableEffect effect = getEffect();
        long j6 = this.j0;
        if (effect != null) {
            j3 = effect.id;
        } else {
            j3 = j;
        }
        if (j6 != j3) {
            if (this.m0 == null) {
                bb2 bb2Var2 = this.eb;
                if (bb2Var2 != null && bb2Var2.l()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                this.m0 = new tl(gl.L(14.0f), 23, this, z3);
            }
            if (this.k0 == this.Q5.e1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (effect != null) {
                if (!TextUtils.isEmpty(effect.emoticon)) {
                    this.m0.g(vu3.g(effect.emoticon), z2);
                } else if ((effect.flags & 1) != 0) {
                    this.m0.j(effect.static_icon_id, z2);
                }
            } else {
                this.m0.g(null, z2);
            }
            if (effect != null) {
                j4 = effect.id;
            } else {
                j4 = j;
            }
            this.j0 = j4;
            this.k0 = this.Q5.e1();
        }
        if (this.j0 != j && !this.Q5.w1) {
            this.M9 = gl.L(18.0f) + this.M9;
        }
        if (replace != null) {
            int i8 = this.V6;
            if (i8 == 0) {
                i8 = gl.L(1000.0f);
                this.V6 = i8;
            }
            int i9 = i8 - this.M9;
            if (k27Var.O3()) {
                if (k27Var.D == 5) {
                    L = gl.L(20.0f);
                } else {
                    L = gl.L(96.0f);
                }
                i9 -= L;
            }
            CharSequence m = vu3.m(replace, bkb.S2.getFontMetricsInt(), false, null, 0);
            int ceil2 = (int) Math.ceil(bkb.S2.measureText(m, 0, m.length()));
            this.P9 = Math.min(ceil2, i9);
            if (ceil2 > i9) {
                if (i9 <= 0) {
                    i2 = 0;
                } else {
                    charSequence = TextUtils.ellipsize(m, bkb.S2, i9, TextUtils.TruncateAt.END);
                    i2 = i9;
                }
            } else {
                charSequence = m;
                i2 = ceil2;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (k27Var.k.via_business_bot_id != j) {
                spannableStringBuilder.append(this.Q9);
                spannableStringBuilder.append(charSequence);
            } else {
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append(this.Q9);
            }
            this.Q9 = spannableStringBuilder;
            this.N9 += i2;
            this.M9 += i2;
            return;
        }
        this.P9 = 0;
    }

    public final void Z3(k27 k27Var) {
        String str;
        CharSequence concat;
        int i;
        if (k27Var != null && k27Var.l5()) {
            int i2 = 0;
            if (!k27Var.k4()) {
                concat = null;
            } else {
                TLRPC.Message message = k27Var.k;
                int i3 = message.ttl;
                if (i3 == Integer.MAX_VALUE) {
                    if (k27Var.Y2 == null) {
                        k27Var.Y2 = new SpannableString("v");
                        cm2 cm2Var = new cm2(2131231983, 0);
                        cm2Var.r = -gl.L(3.0f);
                        cm2Var.F = gl.L(13.0f);
                        SpannableString spannableString = k27Var.Y2;
                        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(k27Var.Y2, "1");
                } else {
                    int i4 = message.destroyTime;
                    if (i4 != 0) {
                        i3 = Math.max(0, i4 - ConnectionsManager.getInstance(k27Var.K1).getCurrentTime());
                    }
                    if (i3 < 60) {
                        str = oo1.n(i3, "s");
                    } else {
                        str = (i3 / 60) + "m";
                    }
                    if (k27Var.Z2 == null) {
                        k27Var.Z2 = new SpannableString("p");
                        cm2 cm2Var2 = new cm2(2131232554, 0);
                        cm2Var2.r = gl.L(1.0f);
                        cm2Var2.F = gl.L(13.0f);
                        SpannableString spannableString2 = k27Var.Z2;
                        spannableString2.setSpan(cm2Var2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(k27Var.Z2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(bkb.B2.measureText((String) charSequence));
                    this.C3 = ceil;
                    this.x3 = new StaticLayout(TextUtils.ellipsize(charSequence, bkb.B2, ceil, TextUtils.TruncateAt.END), bkb.B2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = bkb.C2;
                    if (getMeasuredWidth() > 0) {
                        i = getMeasuredWidth();
                    } else {
                        i = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.x3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i2 = (int) this.x3.getLineWidth(0);
                    }
                    this.C3 = i2;
                }
                invalidate();
            }
        }
    }

    @Override
    public final boolean a() {
        f27 f27Var = this.L;
        if ((f27Var == null || !f27Var.m.j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean a0(MotionEvent motionEvent) {
        ma8 Z1;
        bb2 bb2Var = this.eb;
        if (bb2Var == null) {
            Z1 = null;
        } else {
            Z1 = bb2Var.Z1();
        }
        ma8 ma8Var = Z1;
        int i = 0;
        if (this.Q5 != null) {
            ml mlVar = this.U0;
            if (mlVar.E() && ma8Var != null && !this.Q5.s4() && !this.Q5.G2() && ((!k27.K4(this.Q5.k) || this.H5) && !this.Kb && !this.Q5.J2() && ((!this.Q5.U2() || k27.t3(this.Q5.k)) && !this.Q5.l5()))) {
                k27 k27Var = this.Q5;
                pla plaVar = this.ca;
                if (plaVar != null) {
                    Integer num = (Integer) plaVar.k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i = num.intValue();
                }
                return ma8Var.a(motionEvent, this, mlVar, k27Var, i);
            }
        }
        return false;
    }

    public final void a1(Canvas canvas, cb2 cb2Var, int i, boolean z) {
        r86 r86Var;
        r86 r86Var2;
        r86 r86Var3;
        if (!z) {
            if (cb2Var.n && (r86Var3 = cb2Var.m) != null) {
                r86Var3.a();
            }
        } else if (!cb2Var.n && (r86Var = cb2Var.m) != null) {
            r86Var.c = -1L;
            r86Var.b = -1L;
        }
        cb2Var.n = z;
        float[] fArr = cb2Var.o;
        RectF rectF = cb2Var.d;
        if (!z && ((r86Var2 = cb2Var.m) == null || !r86Var2.d())) {
            r86 r86Var4 = cb2Var.m;
            if (r86Var4 != null) {
                r86Var4.b = -1L;
                return;
            }
            return;
        }
        r86 r86Var5 = cb2Var.m;
        if (r86Var5 == null) {
            r86Var5 = new r86();
            cb2Var.m = r86Var5;
            r86Var5.D = true;
            r86Var5.t = 3.5f;
            r86Var5.u = 0.5f;
        }
        r86Var5.g(bkb.p1(0.1f, i), bkb.p1(0.3f, i), bkb.p1(0.3f, i), bkb.p1(1.25f, i));
        Arrays.fill(fArr, gl.L(6.0f));
        RectF rectF2 = gl.P;
        rectF2.set(rectF.left - gl.L(6.0f), rectF.top - gl.L(4.0f), rectF.right + gl.L(6.0f), rectF.bottom + gl.L(4.0f));
        cb2Var.m.e(rectF2);
        cb2Var.m.i(fArr);
        cb2Var.m.x.setStrokeWidth(gl.L(1.0f));
        cb2Var.m.draw(canvas);
        invalidate();
    }

    public final int a2(int i) {
        return bkb.v0(i, this.cc);
    }

    public final float a3() {
        nb2 nb2Var = this.ub;
        boolean z = nb2Var.G1;
        boolean z2 = this.w1;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            if (!z2) {
                f2 = 1.0f;
                f = 0.0f;
            }
            return gl.R1(f2, f, nb2Var.L1);
        } else if (z2) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void a4() {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.R1) {
            i = 10;
        } else {
            i = 0;
        }
        int i10 = -gl.L(i + 92);
        nb2 nb2Var = this.ub;
        boolean z = nb2Var.x0;
        xa2 xa2Var = this.D4;
        dv9 dv9Var = this.E4;
        float f2 = 10.0f;
        if (z && ((b = this.M1) == 3 || b == 7)) {
            int i11 = this.b7;
            float f3 = i11;
            int i12 = (int) ((f3 - nb2Var.l0) + nb2Var.m0);
            int i13 = (int) ((f3 - nb2Var.h0) + nb2Var.i0);
            if (this.Kb && !this.I6) {
                i13 = (int) ((getVideoTranscriptionProgress() * gl.L(8.0f)) + i13);
                i12 += gl.L(8.0f);
            }
            if (nb2Var.l0 == 0.0f && nb2Var.m0 == 0.0f) {
                i12 = i13;
            }
            if (dv9Var != null) {
                if (nb2Var.o1) {
                    int L = (i13 + i10) - ((int) (gl.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f2 = 0.0f;
                    }
                    int L2 = L - gl.L(f2);
                    int L3 = gl.L(30.0f);
                    int i14 = i11 + i10;
                    if (!this.I4) {
                        i8 = -gl.L(34.0f);
                    } else {
                        i8 = 0;
                    }
                    int i15 = i14 + i8;
                    int i16 = i12 + i10;
                    if (this.I4) {
                        i9 = -gl.L(34.0f);
                    } else {
                        i9 = 0;
                    }
                    dv9Var.g(L2, L3, i15, i16 + i9);
                } else {
                    int L4 = (i13 + i10) - ((int) (gl.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f2 = 0.0f;
                    }
                    dv9Var.g(L4 - gl.L(f2), gl.L(30.0f), (i11 + i10) - ((int) (gl.L(34.0f) * getUseTranscribeButtonProgress())), (i12 + i10) - ((int) (gl.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (xa2Var != null) {
                int useTranscribeButtonProgress = i13 - ((int) (getUseTranscribeButtonProgress() * gl.L(34.0f)));
                if (this.M1 == 5) {
                    i6 = 65;
                } else {
                    i6 = 72;
                }
                if (this.R1) {
                    i7 = 20;
                } else {
                    i7 = 0;
                }
                xa2Var.h(useTranscribeButtonProgress - gl.L(i6 + i7), gl.L(30.0f));
                return;
            }
            return;
        }
        if (dv9Var != null) {
            boolean z2 = nb2Var.o1;
            int i17 = this.b7 + i10;
            if (z2) {
                int L5 = i17 - ((int) (gl.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.R1) {
                    f = 10.0f;
                } else {
                    f = 0.0f;
                }
                int L6 = L5 - gl.L(f);
                int L7 = gl.L(30.0f);
                int i18 = this.b7 + i10;
                if (!this.I4) {
                    i4 = -gl.L(34.0f);
                } else {
                    i4 = 0;
                }
                int i19 = i18 + i4;
                if (!this.R1) {
                    f2 = 0.0f;
                }
                int L8 = i19 - gl.L(f2);
                int i20 = this.b7 + i10;
                if (this.I4) {
                    i5 = -gl.L(34.0f);
                } else {
                    i5 = 0;
                }
                dv9Var.g(L6, L7, L8, i20 + i5);
            } else {
                int L9 = i17 - ((int) (gl.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.R1) {
                    f2 = 0.0f;
                }
                int L10 = L9 - gl.L(f2);
                dv9Var.g(L10, gl.L(30.0f), L10, L10);
            }
        }
        if (xa2Var != null) {
            int useTranscribeButtonProgress2 = this.b7 - ((int) (getUseTranscribeButtonProgress() * gl.L(34.0f)));
            if (this.M1 == 5) {
                i2 = 65;
            } else {
                i2 = 72;
            }
            if (this.R1) {
                i3 = 20;
            } else {
                i3 = 0;
            }
            xa2Var.h(useTranscribeButtonProgress2 - gl.L(i2 + i3), gl.L(30.0f));
        }
    }

    @Override
    public final void b(boolean z, boolean z2) {
        this.Ka = z;
        if (z) {
            this.La = z2;
        } else {
            this.La = false;
        }
    }

    public final void b0() {
        yd8 yd8Var;
        yd8 yd8Var2;
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.S3()) {
            mb2 mb2Var = this.x2;
            if (mb2Var != null && (yd8Var2 = mb2Var.n) != null) {
                yd8Var2.c();
            }
            mb2 mb2Var2 = this.x2;
            if (mb2Var2 != null && (yd8Var = mb2Var2.m) != null) {
                yd8Var.c();
            }
        }
    }

    public final void b1(Canvas canvas, float f) {
        i27 i27Var;
        i19 i19Var;
        Paint paint;
        cb2 cb2Var;
        cb2 cb2Var2;
        if (v2() && this.Q5 != null && f > 0.0f) {
            if (this.Cd == null) {
                this.Cd = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.o0 + this.Q5.v2);
            }
            if (this.m3 != null) {
                compactLeft = Math.max(compactLeft, this.s3 + i27Var.c);
            }
            if (this.O1) {
                ml mlVar = this.U0;
                if (mlVar.R0) {
                    compactLeft = Math.max(compactLeft, mlVar.w());
                }
            }
            if (this.w9 && this.h9 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.r9);
            }
            if (this.vc && (cb2Var2 = this.tc) != null) {
                compactLeft = Math.max(compactLeft, cb2Var2.d.right);
            }
            if (this.wc && (cb2Var = this.uc) != null) {
                compactLeft = Math.max(compactLeft, cb2Var.d.right);
            }
            if (!this.O.p) {
                compactLeft = Math.max(compactLeft, i19Var.b + i19Var.o);
            }
            if (this.Q5.D != 0 && !this.O1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - gl.L(10.0f));
            }
            if (this.L9 != null) {
                compactLeft = Math.max(compactLeft, this.O9 + this.M9);
            }
            float L = gl.L(8.0f);
            RectF rectF = gl.P;
            rectF.set(L, gl.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - gl.L(2.0f));
            this.Cd.setColor(bkb.v0(bkb.ta, this.cc));
            this.Cd.setAlpha((int) (paint.getAlpha() * f));
            float L2 = gl.L(gba.U0);
            canvas.drawRoundRect(rectF, L2, L2, this.Cd);
        }
    }

    public final Drawable b2(String str) {
        Drawable drawable;
        wjb wjbVar = this.cc;
        if (wjbVar != null) {
            drawable = wjbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return bkb.P0(str);
    }

    public final boolean b3() {
        k27 k27Var;
        if (!v2()) {
            if (!this.f6 || this.i6 || ((this.H6 && !this.l6) || (k27Var = this.Q5) == null || k27Var.O3() || !this.Q5.j5())) {
                k27 k27Var2 = this.Q5;
                if (k27Var2 == null || k27.B0(k27Var2.k) != 489000) {
                    k27 k27Var3 = this.Q5;
                    if (k27Var3 != null) {
                        if (k27Var3.l2 || k27Var3.k.guestchat_via_from != null) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void b4() {
        char c;
        int L;
        int extraTextX;
        int i;
        int L2;
        int i2;
        if (getDelegate() != null && getDelegate().E2() != null && getDelegate().E2().y(this.Q5)) {
            gib E2 = getDelegate().E2();
            int i3 = 0;
            if (E2.q0) {
                c = 2;
            } else if (E2.s0) {
                c = 3;
            } else if (E2.u0) {
                c = 4;
            } else if (f2()) {
                c = 1;
            } else {
                c = 0;
            }
            if (c == 2) {
                if (this.T1) {
                    i2 = this.p0 - gl.L(10.0f);
                } else {
                    boolean z = this.U1;
                    int i4 = this.p0;
                    if (z) {
                        L2 = gl.L(1.0f);
                    } else {
                        L2 = gl.L(1.0f);
                    }
                    i2 = L2 + i4;
                }
                getDelegate().E2().b0(gl.L(10.0f) + i2 + this.a2, this.Y1);
            } else if (c == 1) {
                S3();
                getDelegate().E2().b0((int) this.s3, (int) this.t3);
            } else if (c == 3) {
                f27 f27Var = this.L;
                if (f27Var != null && !f27Var.i) {
                    i = (int) this.s3;
                } else {
                    float f = 12.0f;
                    if (this.Q5.O3()) {
                        i = getExtraTextX() + gl.L(12.0f) + this.N6;
                        if (this.Q5.D == 19) {
                            i -= Math.max(0, (gl.L(14.0f) + (Math.max(this.X7, this.Z7) + i)) - gl.q.x);
                        }
                    } else {
                        boolean z2 = this.C6;
                        int i5 = this.N6;
                        if (z2) {
                            L = gl.L(12.0f) + i5;
                            extraTextX = getExtraTextX();
                        } else {
                            if (!this.K) {
                                f = 18.0f;
                            }
                            L = gl.L(f) + i5;
                            extraTextX = getExtraTextX();
                        }
                        i = L + extraTextX;
                    }
                }
                int L3 = ((int) (i + this.ub.h0)) - gl.L(1.33f);
                int i6 = this.r0;
                S3();
                gib E22 = getDelegate().E2();
                int L4 = gl.L(10.0f) + L3;
                ib2 ib2Var = this.s0;
                if (ib2Var != null) {
                    i3 = ib2Var.o;
                }
                E22.b0(L4 - i3, gl.L(22.0f) + i6);
            } else {
                getDelegate().E2().b0(this.o0, this.u0);
            }
        }
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        bb2 bb2Var = this.eb;
        if (bb2Var != null) {
            bb2Var.m1(this, reactionCount, z, f, f2);
        }
    }

    public final void c0(boolean z) {
        k27 k27Var;
        boolean z2;
        k27 k27Var2;
        byte[] bArr;
        mb2 mb2Var = this.x2;
        if (mb2Var != null && mb2Var.k != null && (k27Var = this.Q5) != null && k27Var.S3()) {
            TLRPC.MessageMedia m1 = k27.m1(this.Q5);
            boolean z3 = false;
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                z2 = ((TLRPC.TL_messageMediaPoll) m1).poll.multiple_choice;
            } else {
                z2 = false;
            }
            me8 me8Var = this.x2.k;
            if (z2) {
                z3a B = z3a.B(this.a6);
                if (this.Q5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) B.w.get("poll_" + k27Var2.D1());
                }
                if (bArr != null) {
                    z3 = true;
                }
            }
            fm0 fm0Var = me8Var.f;
            if (fm0Var.f != z3) {
                fm0Var.a(z3, z);
            }
        }
    }

    public final void c1(android.graphics.Canvas r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.c1(android.graphics.Canvas, boolean):void");
    }

    public Paint c2(String str) {
        Paint paint;
        wjb wjbVar = this.cc;
        if (wjbVar != null) {
            paint = wjbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return bkb.T0(str);
    }

    public final b46 c3() {
        b46 b46Var;
        ArrayList arrayList = this.w4;
        if (!arrayList.isEmpty()) {
            b46Var = (b46) arrayList.get(0);
            arrayList.remove(0);
        } else {
            b46Var = new b46(0);
        }
        b46Var.reset();
        this.x4.add(b46Var);
        return b46Var;
    }

    public final void c4(int i, int i2) {
        ArrayList arrayList;
        i27 i27Var = this.m3;
        nb2 nb2Var = this.ub;
        if (i27Var != null && (arrayList = i27Var.e) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                h27 h27Var = (h27) obj;
                ArrayList arrayList2 = h27Var.y;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((qla) obj2).i((i - h27Var.p(this.m3.e, nb2Var)) - this.s3, getWidth(), (i2 - h27Var.p(this.m3.e, nb2Var)) - this.t3);
                }
            }
        }
        StaticLayout staticLayout = this.R7;
        if (staticLayout != null) {
            float height = (-this.V7) - staticLayout.getHeight();
            ArrayList arrayList3 = this.fc;
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                ((qla) obj3).i(i + height, getWidth(), i2 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            ArrayList arrayList4 = getMessageObject().B2;
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                h27 h27Var2 = (h27) obj4;
                ArrayList arrayList5 = h27Var2.y;
                int size5 = arrayList5.size();
                int i7 = 0;
                while (i7 < size5) {
                    Object obj5 = arrayList5.get(i7);
                    i7++;
                    ((qla) obj5).i((i - h27Var2.p(getMessageObject().B2, nb2Var)) - this.u0, getWidth(), (i2 - h27Var2.p(getMessageObject().B2, nb2Var)) - this.u0);
                }
            }
        }
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        dj1 dj1Var = this.w;
        if (dj1Var != null) {
            dj1Var.b();
        }
    }

    public final boolean d0(MotionEvent motionEvent) {
        cb2 cb2Var;
        cb2 cb2Var2;
        cb2 cb2Var3;
        cb2 cb2Var4;
        bb2 bb2Var;
        int i;
        gb2 gb2Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.vc && !this.wc) {
            if (this.Q7 != null && (bb2Var = this.eb) != null && bb2Var.i0()) {
                float x = motionEvent.getX();
                float P1 = P1(motionEvent);
                boolean O5 = this.Q5.O5();
                int i2 = this.U7;
                if (O5) {
                    i = Math.max(this.X7, this.Z7) + i2;
                } else {
                    i = this.O6 + i2;
                }
                if (motionEvent.getAction() == 0) {
                    if (x >= this.U7 && x <= i) {
                        float f = this.V7;
                        if (P1 >= f && P1 <= f + this.W7) {
                            this.e8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.i8 = x;
                            this.j8 = getY() + P1;
                            ff0 ff0Var = this.Wa;
                            if (ff0Var != null) {
                                ff0Var.setHotspot(x, P1);
                                this.f8 = false;
                                this.g8 = true;
                                postDelayed(new sa2(this, (byte) 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            n41 n41Var = this.Ra;
                            if (n41Var != null) {
                                n41Var.c(true);
                                this.Ua = x;
                                this.Va = P1;
                            }
                            w();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.e8) {
                            o();
                            this.e8 = false;
                            ff0 ff0Var2 = this.Wa;
                            if (ff0Var2 != null) {
                                if (!this.f8) {
                                    ff0Var2.setState(new int[]{16842919, 16842910});
                                    post(new sa2(this, (byte) 4));
                                } else {
                                    ff0Var2.setState(new int[0]);
                                }
                                this.f8 = false;
                                this.g8 = false;
                                invalidate();
                            }
                            n41 n41Var2 = this.Ra;
                            if (n41Var2 != null) {
                                n41Var2.c(false);
                            }
                            playSoundEffect(0);
                            boolean z = this.Ja;
                            bb2 bb2Var2 = this.eb;
                            if (z) {
                                if (bb2Var2 != null) {
                                    TLRPC.Chat chat = this.Ga;
                                    if (chat != null) {
                                        bb2Var2.i2(this, chat, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                                        gb2Var = this;
                                    } else {
                                        gb2Var = this;
                                        TLRPC.User user = gb2Var.Ea;
                                        if (user != null) {
                                            bb2Var2.c0(gb2Var, user, gb2Var.h1, gb2Var.i1);
                                        } else if (gb2Var.Ha != null) {
                                            bb2Var2.c1(gb2Var);
                                        }
                                    }
                                }
                            } else {
                                gb2Var = this;
                                if (bb2Var2 != null && (gb2Var.Q5.B2() || gb2Var.Q5.e4() || gb2Var.M7 || ((message = gb2Var.Q5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    gb2Var.eb.N(gb2Var, gb2Var.Q5.N1(), x, P1, false);
                                }
                            }
                        }
                    } else {
                        gb2Var = this;
                        if (motionEvent.getAction() == 3) {
                            gb2Var.e8 = false;
                            gb2Var.f8 = false;
                            ff0 ff0Var3 = gb2Var.Wa;
                            if (ff0Var3 != null) {
                                ff0Var3.setState(new int[0]);
                            }
                            gb2Var.invalidate();
                            n41 n41Var3 = gb2Var.Ra;
                            if (n41Var3 != null) {
                                n41Var3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x >= gb2Var.U7 && x <= i) {
                                float f2 = gb2Var.V7;
                                if (P1 >= f2 && P1 <= f2 + gb2Var.W7) {
                                    if (gb2Var.Wa != null && gb2Var.g8) {
                                        if (Math.sqrt(Math.pow((gb2Var.getY() + P1) - gb2Var.j8, 2.0d) + Math.pow(x - gb2Var.i8, 2.0d)) > 0.75d) {
                                            gb2Var.g8 = false;
                                        }
                                    }
                                }
                            }
                            gb2Var.e8 = false;
                            gb2Var.f8 = false;
                            gb2Var.g8 = false;
                            ff0 ff0Var4 = gb2Var.Wa;
                            if (ff0Var4 != null) {
                                ff0Var4.setState(new int[0]);
                            }
                            gb2Var.invalidate();
                            n41 n41Var4 = gb2Var.Ra;
                            if (n41Var4 != null) {
                                n41Var4.c(false);
                            }
                        }
                    }
                    return gb2Var.e8;
                }
                gb2Var = this;
                return gb2Var.e8;
            }
        } else {
            float x2 = motionEvent.getX();
            float P12 = P1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.eb != null) {
                    if (this.vc && (cb2Var4 = this.tc) != null && F2(cb2Var4, x2, P12)) {
                        cb2Var2 = this.tc;
                    } else if (this.wc && (cb2Var3 = this.uc) != null && F2(cb2Var3, x2, P12)) {
                        cb2Var2 = this.uc;
                    } else {
                        cb2Var2 = null;
                    }
                    if (cb2Var2 != null && (cb2Var2.a || this.eb.i0())) {
                        this.yc = cb2Var2;
                        cb2Var2.e.c(true);
                        ff0 ff0Var5 = cb2Var2.k;
                        if (ff0Var5 != null) {
                            ff0Var5.setHotspot(x2, P12);
                            cb2Var2.k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        w();
                        return true;
                    }
                }
            } else if (action == 1) {
                cb2 cb2Var5 = this.yc;
                if (cb2Var5 != null) {
                    o();
                    g3();
                    playSoundEffect(0);
                    if (cb2Var5.a) {
                        TLRPC.Chat chat2 = this.Ga;
                        if (chat2 != null) {
                            this.eb.i2(this, chat2, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.Ea;
                        bb2 bb2Var3 = this.eb;
                        if (user2 != null) {
                            bb2Var3.c0(this, user2, this.h1, this.i1);
                            return true;
                        }
                        bb2Var3.c1(this);
                        return true;
                    }
                    this.eb.N(this, this.Q5.N1(), x2, P12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    g3();
                } else if (action == 2 && (cb2Var = this.yc) != null && !F2(cb2Var, x2, P12)) {
                    o();
                    g3();
                }
                if (this.yc != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.d1(android.graphics.Canvas):void");
    }

    public final float d2(float f) {
        float f2;
        float f3;
        if (y2() && this.L9 != null) {
            return getCompactNameTimeY();
        }
        if (I3() && this.M1 != 7) {
            return ((getPhotoBottom() + this.w0) - gl.L(7.3f)) - this.L9.getHeight();
        }
        int i = this.e7;
        if (!this.G && !this.F) {
            f2 = 6.5f;
        } else {
            f2 = 7.5f;
        }
        float L = ((i - gl.L(f2)) - this.L9.getHeight()) + f;
        boolean z = this.Kb;
        nb2 nb2Var = this.ub;
        if (z && !v2()) {
            if (this.K) {
                f3 = 4.0f;
            } else {
                f3 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.O.i(nb2Var.L1) + gl.L(f3));
        }
        f27 f27Var = this.L;
        if (f27Var != null) {
            e27 e27Var = f27Var.m;
            float f4 = L + e27Var.h;
            if (e27Var.j) {
                return f4 - getTranslationY();
            }
            return f4;
        }
        return (nb2Var.j0 - nb2Var.k0) + L;
    }

    public final m17 d3(String str) {
        ?? r1;
        int i;
        int i2;
        boolean o;
        int i3;
        Integer valueOf;
        m17 m17Var = (m17) b2(str);
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.O3() && R2()) {
            int i4 = 0;
            if (!"drawableMsgOutSelected".equals(str) && !"drawableMsgOutMediaSelected".equals(str)) {
                r1 = 0;
            } else {
                r1 = 1;
            }
            if (!"drawableMsgOutMedia".equals(str) && !"drawableMsgOutMediaSelected".equals(str)) {
                i = 0;
            } else {
                i = 1;
            }
            wjb wjbVar = this.cc;
            int i5 = mwc.c[0];
            if (wjbVar != null) {
                i2 = wjbVar.j(i5);
            } else {
                i2 = bkb.km.get(i5);
            }
            if (i2 == 0) {
                valueOf = null;
            } else {
                if (wjbVar != null) {
                    o = wjbVar.a();
                } else {
                    o = bkb.I.o();
                }
                int b = mwc.b(wjbVar, true);
                if (o) {
                    i3 = -16777216;
                } else {
                    i3 = -1;
                }
                int v = bkb.v(i3, b);
                if (r1 != 0) {
                    v = bkb.v(v, bkb.v0(bkb.Rc, wjbVar));
                }
                valueOf = Integer.valueOf(v);
            }
            if (valueOf != null) {
                m17[] m17VarArr = this.pc;
                if (m17VarArr == null) {
                    m17VarArr = new m17[4];
                    this.pc = m17VarArr;
                }
                if (i != 0) {
                    i4 = 2;
                }
                int i6 = i4 + r1;
                if (m17VarArr[i6] == null) {
                    m17VarArr[i6] = new m17(i, true, r1, this.cc);
                }
                m17 m17Var2 = this.pc[i6];
                m17Var2.w = valueOf;
                return m17Var2;
            }
        }
        return m17Var;
    }

    public void d4() {
        int i;
        k27 k27Var = this.Q5;
        if (k27Var == null) {
            return;
        }
        float f = this.vd + this.wd;
        if (!k27Var.O3() || this.Q5.D2) {
            f += this.r1;
        }
        if (v2()) {
            f += getCompactSideMenuShift();
        } else if (this.X6 && !this.Q5.O3() && this.M != null) {
            if (b3()) {
                i = 48;
            } else {
                i = 0;
            }
            f += gl.L(71 - i) * this.Z6;
        }
        setTranslationX(f);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        if (i == kk7.l1) {
            setSpoilersSuppressed(false);
        } else if (i == kk7.k1) {
            setSpoilersSuppressed(true);
        } else if (i == kk7.D0) {
            TLRPC.User user = this.va;
            if (user != null && user.id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.Q5);
            }
        } else if (i == kk7.k4) {
            invalidate();
        } else if (i == kk7.X2 && (k27Var = this.Q5) != null) {
            TLRPC.MessageMedia messageMedia = k27Var.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                z3(k27Var, this.L, this.G, this.F, this.H, false);
            }
        }
    }

    @Override
    public final void e(RectF rectF) {
        RectF rectF2 = this.yd;
        if (rectF2 != null) {
            rectF.set(rectF2);
        } else {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public final boolean e0(MotionEvent motionEvent) {
        k27 k27Var = this.Q5;
        if (k27Var == null || k27Var.y2 == null || k27Var.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.i0 + this.u0;
        motionEvent.offsetLocation(-this.o0, -topicSeparatorTopPadding);
        rh9 rh9Var = this.Q5.y2;
        bb2 bb2Var = this.eb;
        rh9Var.E = this;
        rh9Var.F = bb2Var;
        boolean L = rh9Var.L(motionEvent);
        motionEvent.offsetLocation(this.o0, topicSeparatorTopPadding);
        return L;
    }

    public final void e1(Canvas canvas, float f) {
        if (!this.Q5.q4() && !this.Q5.F4() && !this.R1 && !this.T1 && !this.U1) {
            return;
        }
        G1().a(canvas, f);
    }

    public final int e2(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i2 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((fb2) arrayList.get(i2)).t;
                if (todoItem != null && todoItem.id == i) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final void e3(k27 k27Var) {
        final int i = this.a6;
        n92 n92Var = new n92(this, k27Var, (byte) 6);
        do3 do3Var = gb8.a;
        TLRPC.Document F0 = k27Var.F0();
        if (F0 != null) {
            final long j = F0.id;
            if (!na7.q1(i).k4.v0.f && gb8.b.get(Long.valueOf(j)) == null && !gb8.c.containsKey(Long.valueOf(j))) {
                HashMap hashMap = gb8.d;
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.add(n92Var);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(n92Var);
                hashMap.put(Long.valueOf(j), arrayList2);
                final TLRPC.Message message = k27Var.k;
                final String language = k96.D0().y.getLanguage();
                final float f = gl.p;
                do3 do3Var2 = gb8.a;
                if (do3Var2 == null) {
                    do3Var2 = new do3("pkpass", true);
                    gb8.a = do3Var2;
                }
                do3Var2.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb8.run():void");
                    }
                });
            }
        }
    }

    public final void e4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.e4():void");
    }

    @Override
    public final void f(float f) {
        k27 k27Var = this.Q5;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(this.Q5, f);
        W3();
    }

    public final boolean f0(int i, MotionEvent motionEvent) {
        int i2;
        qla qlaVar;
        int i3;
        int i4;
        i27 i27Var;
        i27 i27Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        f27 f27Var;
        if (i <= 15 && getParent() != null) {
            boolean z = true;
            if (this.Q5.z2() && (f27Var = this.L) != null && !f27Var.i) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt instanceof gb2) {
                        gb2 gb2Var = (gb2) childAt;
                        f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
                        c27 currentPosition = gb2Var.getCurrentPosition();
                        if (currentMessagesGroup != null && currentMessagesGroup.a == this.L.a) {
                            int i10 = currentPosition.l;
                            if ((i10 & 8) != 0 && (i10 & 1) != 0 && gb2Var != this) {
                                motionEvent.offsetLocation(getLeft() - gb2Var.getLeft(), getTop() - gb2Var.getTop());
                                boolean f0 = gb2Var.f0(i + 1, motionEvent);
                                motionEvent.offsetLocation(-(getLeft() - gb2Var.getLeft()), -(getTop() - gb2Var.getTop()));
                                return f0;
                            }
                        }
                    }
                }
            }
            if (!this.P5) {
                int x = (int) motionEvent.getX();
                int P1 = (int) P1(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                nb2 nb2Var = this.ub;
                if (actionMasked == 0) {
                    int i11 = this.o0;
                    if (x >= i11 && P1 >= (i7 = this.u0)) {
                        k27 k27Var = this.Q5;
                        if (x <= i11 + k27Var.v2 && P1 <= k27Var.V5(nb2Var) + i7) {
                            ArrayList arrayList = this.Q5.B2;
                            for (int i12 = 0; i12 < arrayList.size() && ((h27) arrayList.get(i12)).p(this.Q5.B2, nb2Var) <= P1; i12++) {
                                h27 h27Var = (h27) arrayList.get(i12);
                                if (h27Var.l()) {
                                    i8 = (int) this.Q5.x2;
                                } else {
                                    i8 = 0;
                                }
                                ArrayList arrayList2 = h27Var.y;
                                int size = arrayList2.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList2.get(i13);
                                    i13++;
                                    qla qlaVar2 = (qla) obj;
                                    boolean z2 = z;
                                    if (qlaVar2.getBounds().contains((x - this.o0) + i8, (int) ((P1 - this.u0) - h27Var.p(this.Q5.B2, nb2Var)))) {
                                        this.O5 = qlaVar2;
                                        return z2;
                                    }
                                    z = z2;
                                }
                            }
                        }
                    }
                    boolean z3 = z;
                    if (this.m3 != null) {
                        float f = x;
                        float f2 = this.s3;
                        if (f >= f2) {
                            float f3 = P1;
                            float f4 = this.t3;
                            if (f3 >= f4 && f <= f2 + i27Var.c && f3 <= f4 + i27Var.c(nb2Var)) {
                                ArrayList arrayList3 = this.m3.e;
                                for (int i14 = 0; i14 < arrayList3.size() && ((h27) arrayList3.get(i14)).p(this.m3.e, nb2Var) <= f3; i14++) {
                                    h27 h27Var2 = (h27) arrayList3.get(i14);
                                    if (h27Var2.l()) {
                                        i6 = (int) this.m3.d;
                                    } else {
                                        i6 = 0;
                                    }
                                    ArrayList arrayList4 = h27Var2.y;
                                    int size2 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = arrayList4.get(i15);
                                        i15++;
                                        qla qlaVar3 = (qla) obj2;
                                        ArrayList arrayList5 = arrayList3;
                                        float f5 = f;
                                        if (qlaVar3.getBounds().contains((int) ((f - this.s3) + i6), (int) ((f3 - this.t3) - h27Var2.p(this.m3.e, nb2Var)))) {
                                            this.O5 = qlaVar3;
                                            return z3;
                                        }
                                        arrayList3 = arrayList5;
                                        f = f5;
                                    }
                                }
                            }
                        }
                    }
                    if (this.q3 != null) {
                        float f6 = x;
                        float f7 = this.u5;
                        if (f6 >= f7) {
                            float f8 = P1;
                            float f9 = this.v5;
                            if (f8 > f9 && f6 <= f7 + i27Var2.c && f8 <= f9 + i27Var2.c(nb2Var)) {
                                ArrayList arrayList6 = this.q3.e;
                                for (int i16 = 0; i16 < arrayList6.size() && ((h27) arrayList6.get(i16)).p(this.q3.e, nb2Var) <= f8; i16++) {
                                    h27 h27Var3 = (h27) arrayList6.get(i16);
                                    if (h27Var3.l()) {
                                        i5 = (int) this.q3.d;
                                    } else {
                                        i5 = 0;
                                    }
                                    ArrayList arrayList7 = h27Var3.y;
                                    int size3 = arrayList7.size();
                                    int i17 = 0;
                                    while (i17 < size3) {
                                        Object obj3 = arrayList7.get(i17);
                                        i17++;
                                        qla qlaVar4 = (qla) obj3;
                                        if (qlaVar4.getBounds().contains((int) ((f6 - this.u5) + i5), (int) ((f8 - this.v5) - h27Var3.p(this.q3.e, nb2Var)))) {
                                            this.O5 = qlaVar4;
                                            return z3;
                                        }
                                    }
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                } else if (actionMasked == 1 && this.O5 != null) {
                    playSoundEffect(0);
                    Path path = this.hc;
                    path.rewind();
                    i27 i27Var3 = this.q3;
                    if (i27Var3 != null) {
                        ArrayList arrayList8 = i27Var3.e;
                        int size4 = arrayList8.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            Object obj4 = arrayList8.get(i18);
                            i18++;
                            h27 h27Var4 = (h27) obj4;
                            ArrayList arrayList9 = h27Var4.y;
                            int size5 = arrayList9.size();
                            int i19 = 0;
                            while (i19 < size5) {
                                int i20 = i19 + 1;
                                Rect bounds = ((qla) arrayList9.get(i19)).getBounds();
                                path.addRect(bounds.left, h27Var4.p(this.q3.e, nb2Var) + bounds.top, bounds.right, h27Var4.p(this.q3.e, nb2Var) + bounds.bottom, Path.Direction.CW);
                                i19 = i20;
                            }
                        }
                    }
                    i27 i27Var4 = this.m3;
                    if (i27Var4 != null) {
                        ArrayList arrayList10 = i27Var4.e;
                        int size6 = arrayList10.size();
                        int i21 = 0;
                        while (i21 < size6) {
                            Object obj5 = arrayList10.get(i21);
                            i21++;
                            h27 h27Var5 = (h27) obj5;
                            ArrayList arrayList11 = h27Var5.y;
                            int size7 = arrayList11.size();
                            int i22 = 0;
                            while (i22 < size7) {
                                int i23 = i22 + 1;
                                Rect bounds2 = ((qla) arrayList11.get(i22)).getBounds();
                                path.addRect(bounds2.left, h27Var5.p(this.m3.e, nb2Var) + bounds2.top, bounds2.right, h27Var5.p(this.m3.e, nb2Var) + bounds2.bottom, Path.Direction.CW);
                                i22 = i23;
                            }
                        }
                    } else {
                        ArrayList arrayList12 = this.Q5.B2;
                        if (arrayList12 != null) {
                            int size8 = arrayList12.size();
                            int i24 = 0;
                            while (i24 < size8) {
                                Object obj6 = arrayList12.get(i24);
                                i24++;
                                h27 h27Var6 = (h27) obj6;
                                ArrayList arrayList13 = h27Var6.y;
                                int size9 = arrayList13.size();
                                int i25 = 0;
                                while (i25 < size9) {
                                    int i26 = i25 + 1;
                                    Rect bounds3 = ((qla) arrayList13.get(i25)).getBounds();
                                    path.addRect(bounds3.left, h27Var6.p(this.Q5.B2, nb2Var) + bounds3.top, bounds3.right, h27Var6.p(this.Q5.B2, nb2Var) + bounds3.bottom, Path.Direction.CW);
                                    i25 = i26;
                                }
                            }
                        }
                    }
                    RectF rectF = this.c4;
                    path.computeBounds(rectF, false);
                    float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
                    this.P5 = true;
                    this.O5.q = new sa2(this, (byte) 9);
                    i27 i27Var5 = this.q3;
                    if (i27Var5 != null) {
                        ArrayList arrayList14 = i27Var5.e;
                        int size10 = arrayList14.size();
                        int i27 = 0;
                        while (i27 < size10) {
                            Object obj7 = arrayList14.get(i27);
                            i27++;
                            h27 h27Var7 = (h27) obj7;
                            if (h27Var7.l()) {
                                i4 = (int) this.q3.d;
                            } else {
                                i4 = 0;
                            }
                            ArrayList arrayList15 = h27Var7.y;
                            int size11 = arrayList15.size();
                            int i28 = 0;
                            while (i28 < size11) {
                                Object obj8 = arrayList15.get(i28);
                                i28++;
                                ((qla) obj8).j((x - this.u5) + i4, (P1 - h27Var7.p(this.q3.e, nb2Var)) - this.v5, sqrt, false);
                                arrayList14 = arrayList14;
                            }
                        }
                    }
                    i27 i27Var6 = this.m3;
                    if (i27Var6 != null) {
                        ArrayList arrayList16 = i27Var6.e;
                        int size12 = arrayList16.size();
                        int i29 = 0;
                        while (i29 < size12) {
                            Object obj9 = arrayList16.get(i29);
                            i29++;
                            h27 h27Var8 = (h27) obj9;
                            if (h27Var8.l()) {
                                i3 = (int) this.m3.d;
                            } else {
                                i3 = 0;
                            }
                            ArrayList arrayList17 = h27Var8.y;
                            int size13 = arrayList17.size();
                            int i30 = 0;
                            while (i30 < size13) {
                                Object obj10 = arrayList17.get(i30);
                                i30++;
                                ((qla) obj10).j((x - this.s3) + i3, (P1 - h27Var8.p(this.m3.e, nb2Var)) - this.t3, sqrt, false);
                                x = x;
                            }
                        }
                    } else {
                        ArrayList arrayList18 = this.Q5.B2;
                        if (arrayList18 != null) {
                            int size14 = arrayList18.size();
                            int i31 = 0;
                            while (i31 < size14) {
                                Object obj11 = arrayList18.get(i31);
                                i31++;
                                h27 h27Var9 = (h27) obj11;
                                if (h27Var9.l()) {
                                    i2 = (int) this.Q5.x2;
                                } else {
                                    i2 = 0;
                                }
                                ArrayList arrayList19 = h27Var9.y;
                                int size15 = arrayList19.size();
                                int i32 = 0;
                                while (i32 < size15) {
                                    Object obj12 = arrayList19.get(i32);
                                    i32++;
                                    ((qla) obj12).j((x - this.o0) + i2, (P1 - h27Var9.p(this.Q5.B2, nb2Var)) - this.u0, sqrt, false);
                                }
                            }
                        }
                    }
                    if (getParent() instanceof o39) {
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        for (int i33 = 0; i33 < viewGroup2.getChildCount(); i33++) {
                            View childAt2 = viewGroup2.getChildAt(i33);
                            if (childAt2 instanceof gb2) {
                                gb2 gb2Var2 = (gb2) childAt2;
                                ArrayList arrayList20 = gb2Var2.fc;
                                if (gb2Var2.getMessageObject() != null && gb2Var2.getMessageObject().N1() == getMessageObject().e1() && !arrayList20.isEmpty()) {
                                    ((qla) arrayList20.get(0)).q = new n92(this, gb2Var2, (byte) 8);
                                    int size16 = arrayList20.size();
                                    int i34 = 0;
                                    while (i34 < size16) {
                                        Object obj13 = arrayList20.get(i34);
                                        i34++;
                                        ((qla) obj13).j(qlaVar.getBounds().centerX(), qlaVar.getBounds().centerY(), sqrt, false);
                                    }
                                }
                            }
                        }
                    }
                    this.O5 = null;
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final void f1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        if (this.m3 != null) {
            return true;
        }
        return false;
    }

    public final void f3() {
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.B2 != null) {
            for (int i = 0; i < this.Q5.B2.size(); i++) {
                h27 h27Var = (h27) this.Q5.B2.get(i);
                ff0 ff0Var = h27Var.T;
                if (ff0Var != null) {
                    ff0Var.setCallback(this);
                    h27Var.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.m3 != null) {
            for (int i2 = 0; i2 < this.m3.e.size(); i2++) {
                h27 h27Var2 = (h27) this.m3.e.get(i2);
                ff0 ff0Var2 = h27Var2.T;
                if (ff0Var2 != null) {
                    ff0Var2.setCallback(this);
                    h27Var2.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (v2()) {
            invalidate();
        }
    }

    public final zi9 f4() {
        if (this.Q5 != null && R2()) {
            return (zi9) this.Q5.y2.g.get(0);
        }
        return null;
    }

    @Override
    public final void g(Canvas canvas, float f) {
        if (this.yd == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        Path path = this.zd;
        path.rewind();
        path.addRoundRect(this.yd, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (L0()) {
            canvas.save();
            canvas.translate(0.0f, getPaddingTop());
            M0(canvas, true, false);
            canvas.restore();
        }
        draw(canvas);
        canvas.restore();
    }

    public final void g0() {
        byte b;
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            TLRPC.MessageMedia n1 = k27.n1(k27Var.k);
            if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null && !this.R) {
                Drawable t = this.U0.t();
                if (t instanceof ny8) {
                    ny8 ny8Var = (ny8) t;
                    if ((ny8Var.n0 != null || ny8Var.Z0) && !this.R && (b = ny8Var.K) != 1 && b == 2) {
                        if (!ny8Var.Y0) {
                            float o = ny8Var.o();
                            if (ny8Var.V0 != null) {
                                o = ny8Var.b0 / ny8Var.b1;
                            }
                            if (o <= 0.95f) {
                                return;
                            }
                        }
                        this.R = true;
                        bb2 bb2Var = this.eb;
                        if (bb2Var != null) {
                            bb2Var.C1(this, false);
                        }
                    }
                }
            }
        }
    }

    public final void g1(Canvas canvas) {
        float f;
        float f2;
        float L;
        float L2;
        int i;
        int i2;
        Canvas canvas2;
        k27 k27Var = this.Q5;
        if (k27Var != null && !k27Var.q4()) {
            float f3 = this.u0;
            nb2 nb2Var = this.ub;
            if (nb2Var.m2) {
                float f4 = nb2Var.o2;
                float f5 = nb2Var.L1;
                f = (f5 * f3) + ((1.0f - f5) * f4);
            } else {
                f = f3;
            }
            if (nb2Var.L1 != 1.0f && nb2Var.H0) {
                canvas.save();
                m17 m17Var = this.L6;
                if (m17Var != null) {
                    Rect bounds = m17Var.getBounds();
                    if (this.Q5.O3() && !this.C6 && !this.G) {
                        canvas.clipRect(gl.L(4.0f) + bounds.left, gl.L(4.0f) + bounds.top, bounds.right - gl.L(10.0f), bounds.bottom - gl.L(4.0f));
                    } else {
                        canvas.clipRect(gl.L(4.0f) + bounds.left, gl.L(4.0f) + bounds.top, bounds.right - gl.L(4.0f), bounds.bottom - gl.L(4.0f));
                    }
                }
                lg7 lg7Var = this.Mc;
                if (lg7Var != null && lg7Var.h) {
                    k27 k27Var2 = this.Q5;
                    f1(this.o0, f, canvas, k27Var2.B2, k27Var2.x2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.o0, f, canvas, nb2Var.I0, nb2Var.O0, false, 1.0f - nb2Var.L1, true, false, false, false);
                    k27 k27Var3 = this.Q5;
                    f1(this.o0, f, canvas, k27Var3.B2, k27Var3.x2, true, nb2Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            boolean z = nb2Var.E1;
            if (z && this.L6 != null) {
                if (z) {
                    int i3 = -1;
                    if (this.v1) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    float A = tb4.A(1.0f, nb2Var.L1, this.Q5.V5(nb2Var) * i2, f3);
                    float f6 = nb2Var.o2;
                    if (this.v1) {
                        i3 = 1;
                    }
                    f2 = A;
                    f = f6 - ((this.Q5.V5(nb2Var) * i3) * nb2Var.L1);
                } else {
                    f2 = f;
                }
                canvas.save();
                RectF rectF = gl.P;
                rectF.set(this.L6.getBounds());
                if (this.Q5.O3() && !this.C6 && !this.G) {
                    rectF.left += gl.L(4.0f);
                    L = rectF.right - gl.L(10.0f);
                    rectF.right = L;
                } else {
                    rectF.left += gl.L(4.0f);
                    L = rectF.right - gl.L(4.0f);
                    rectF.right = L;
                }
                float f7 = rectF.left;
                float f8 = nb2Var.o2;
                canvas.clipRect(f7, f8, L, this.Q5.V5(nb2Var) + f8 + gl.L(4.0f));
                k27 k27Var4 = this.Q5;
                f1(this.o0, f, canvas, k27Var4.B2, k27Var4.x2, false, 1.0f - nb2Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.L6.getBounds());
                if (this.Q5.O3() && !this.C6 && !this.G) {
                    rectF.left += gl.L(4.0f);
                    L2 = rectF.right - gl.L(10.0f);
                    rectF.right = L2;
                } else {
                    rectF.left += gl.L(4.0f);
                    L2 = rectF.right - gl.L(4.0f);
                    rectF.right = L2;
                }
                canvas.clipRect(rectF.left, this.u0, L2, gl.L(4.0f) + this.Q5.V5(nb2Var) + i);
                k27 k27Var5 = this.Q5;
                f1(this.o0, f2, canvas, k27Var5.B2, k27Var5.x2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            k27 k27Var6 = this.Q5;
            f1(this.o0, f, canvas, k27Var6.B2, k27Var6.x2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        if (v2()) {
            k27 k27Var = this.Q5;
            if (k27Var.D != 27 && !k27Var.q4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g3() {
        cb2 cb2Var = this.yc;
        if (cb2Var != null) {
            ff0 ff0Var = cb2Var.k;
            if (ff0Var != null) {
                ff0Var.setState(StateSet.NOTHING);
            }
            this.yc.e.c(false);
            this.yc = null;
            invalidate();
        }
    }

    public final boolean g4() {
        if (this.Q5 != null && R2() && !v2()) {
            if ((TextUtils.isEmpty(this.Q5.z) || this.w1) && this.O.p) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new pa2(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.Rc;
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.m9;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.m9.getText());
        lm0[] lm0VarArr = (lm0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), lm0.class);
        for (int length = lm0VarArr.length - 1; length >= 0; length--) {
            int spanStart = spannableStringBuilder.getSpanStart(lm0VarArr[length]);
            int spanEnd = spannableStringBuilder.getSpanEnd(lm0VarArr[length]);
            if (spanStart >= 0 && spanEnd >= spanStart) {
                spannableStringBuilder.delete(spanStart, spanEnd);
            }
        }
        String trim = spannableStringBuilder.toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public float getAlpha() {
        if (this.sb) {
            return this.tb;
        }
        return super.getAlpha();
    }

    public defpackage.gm[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.getAnimatedEmojiSpans():gm[]");
    }

    public float getAnimationOffsetX() {
        return this.wd;
    }

    public ImageReceiver getAvatarImage() {
        if (this.G6) {
            return this.A7;
        }
        return null;
    }

    public f17 getBackgroundDrawable() {
        return this.fb;
    }

    public int getBackgroundDrawableBottom() {
        int i;
        c27 c27Var = this.M;
        int i2 = 0;
        if (c27Var != null) {
            int i3 = 4;
            if ((c27Var.l & 4) == 0) {
                i = gl.L(3.0f);
            } else {
                i = 0;
            }
            if ((this.M.l & 8) == 0) {
                k27 k27Var = this.Q5;
                if (k27Var != null && k27Var.O3()) {
                    i3 = 3;
                }
                i += gl.L(i3);
            }
        } else {
            i = 0;
        }
        boolean z = this.K;
        if (!z || !this.J) {
            if (z) {
                i2 = gl.L(1.0f);
            } else {
                i2 = gl.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.e7) - i2) + i;
        if (!this.C6) {
            if (this.J) {
                backgroundDrawableTop += gl.L(1.0f);
            }
            if (this.K) {
                return gl.L(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int compactInShift;
        int i;
        k27 messageObject = getMessageObject();
        int i2 = 0;
        float f = 9.0f;
        if (messageObject != null && messageObject.O3()) {
            boolean z = this.Kb;
            int i3 = this.d7 - this.b7;
            if (z) {
                return i3 - ((int) ((1.0f - getVideoTranscriptionProgress()) * gl.L(9.0f)));
            }
            if (this.C6) {
                i2 = gl.L(9.0f);
            }
            return i3 - i2;
        }
        float f2 = 71.0f;
        if (this.Kb) {
            if (!O2()) {
                if ((this.f6 || ((messageObject != null && (messageObject.j2 || messageObject.l2 || messageObject.k.guestchat_via_from != null)) || k27.B0(messageObject.k) == 489000)) && this.G6) {
                    i2 = 48;
                }
                f2 = i2 + 3;
            }
            compactInShift = gl.L(f2) + ((int) ((1.0f - getVideoTranscriptionProgress()) * gl.L(6.0f)));
        } else {
            if (!O2()) {
                if ((this.f6 || ((messageObject != null && (messageObject.j2 || messageObject.l2 || messageObject.k.guestchat_via_from != null)) || k27.B0(messageObject.k) == 489000)) && this.G6) {
                    i2 = 48;
                }
                f2 = i2;
            }
            int L = gl.L(f2);
            if (!this.C6) {
                f = 3.0f;
            }
            compactInShift = getCompactInShift() + gl.L(f) + L;
        }
        f27 f27Var = this.L;
        if (f27Var != null && !f27Var.i && (i = this.M.j) != 0) {
            compactInShift += (int) Math.ceil((i / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.Kb) {
            if (this.K) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * gl.L(6.0f)));
            }
        } else if (!this.C6 && this.K) {
            return gl.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i;
        int backgroundDrawableLeft;
        k27 k27Var;
        k27 k27Var2;
        int i2 = this.b7;
        if (this.Kb) {
            i = i2 - ((int) (getVideoTranscriptionProgress() * gl.L(3.0f)));
            if (this.K && (k27Var2 = this.Q5) != null && k27Var2.O3()) {
                i = (int) (i - ((1.0f - getVideoTranscriptionProgress()) * gl.L(6.0f)));
            }
            if (this.K && ((k27Var = this.Q5) == null || !k27Var.O3())) {
                i = (int) (i - ((1.0f - getVideoTranscriptionProgress()) * gl.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.C6) {
                L = 0;
            } else {
                L = gl.L(3.0f);
            }
            i = i2 - L;
            if (!this.C6 && this.K) {
                i -= gl.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i;
    }

    public int getBackgroundDrawableTop() {
        int i;
        c27 c27Var = this.M;
        int i2 = 0;
        if (c27Var != null && (c27Var.l & 4) == 0) {
            i = 0 - gl.L(3.0f);
        } else {
            i = 0;
        }
        if (!this.J) {
            i2 = gl.L(1.0f);
        }
        int i3 = i + i2;
        if (!this.C6 && this.J) {
            return i3 - gl.L(1.0f);
        }
        return i3;
    }

    public int getBackgroundHeight() {
        return this.ob;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.V0;
    }

    public int getBottomActionPadding() {
        nb2 nb2Var = this.ub;
        if (nb2Var.C1) {
            return gl.U1(nb2Var.L1, nb2Var.B1, this.e0);
        }
        return this.e0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z;
        int i;
        int i2;
        float f;
        int L;
        int i3;
        float f2;
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.O3()) {
            z = true;
        } else {
            z = false;
        }
        if (b3()) {
            if (this.M != null) {
                f2 = 73.0f;
            } else {
                k27 k27Var2 = this.Q5;
                if (k27Var2 != null && k27Var2.j2) {
                    i3 = 42;
                } else {
                    i3 = 63;
                }
                f2 = i3;
            }
            i = gl.L(f2);
        } else {
            i = 0;
        }
        if (z && (X(this.Q5) || this.I4)) {
            i2 = gl.L(48.0f);
        } else {
            i2 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i) - i2;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            k27 k27Var3 = this.Q5;
            if (k27Var3 != null && k27Var3.O3()) {
                L = (getMeasuredWidth() - widthForButtons) - gl.L(10.0f);
            } else {
                int i4 = this.N6;
                if (!this.C6 && !this.K) {
                    f = 7.0f;
                } else {
                    f = 1.0f;
                }
                L = i4 + gl.L(f);
            }
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                i5 = Math.max(i5, ((int) (((wo0) arrayList.get(i6)).c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i5);
        }
        if (this.T != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.T.j()) - gl.L(18.0f))) / 2);
        }
        if (this.f0 != null) {
            backgroundDrawableLeft = Math.min(this.a7 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i;
        float f;
        int L;
        k27 k27Var = this.Q5;
        if (k27Var != null && !k27Var.O3() && (X(this.Q5) || this.I4)) {
            i = gl.L(48.0f);
        } else {
            i = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            k27 k27Var2 = this.Q5;
            if (k27Var2 != null && k27Var2.O3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - gl.L(10.0f);
            } else {
                int i2 = this.N6;
                if (!this.C6 && !this.K) {
                    f = 7.0f;
                } else {
                    f = 1.0f;
                }
                L = i2 + gl.L(f);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                wo0 wo0Var = (wo0) arrayList.get(i4);
                float f2 = widthForButtons;
                i3 = Math.max(i3, ((int) (wo0Var.c * f2)) + L + ((int) (wo0Var.e * f2)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i3);
        }
        if (this.T != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.T.j() + getParentWidth()) + gl.L(18.0f))) / 2);
        }
        if (this.f0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public i27 getCaptionLayout() {
        return this.m3;
    }

    public float getCaptionX() {
        nb2 nb2Var = this.ub;
        if (nb2Var.x0) {
            if (nb2Var.D0) {
                this.s3 += nb2Var.h0;
            } else if (nb2Var.t0) {
                float f = this.s3;
                float f2 = nb2Var.L1;
                this.s3 = tb4.A(1.0f, f2, nb2Var.r0, f * f2);
            } else if (!k27.Q4(this.Q5.k) || !TextUtils.isEmpty(this.Q5.z)) {
                this.s3 += nb2Var.h0;
            }
        }
        return this.s3;
    }

    public float getCaptionY() {
        float f = this.t3;
        nb2 nb2Var = this.ub;
        if (nb2Var.x0) {
            if (nb2Var.D0) {
                return f - getTranslationY();
            }
            if (nb2Var.t0) {
                float f2 = nb2Var.L1;
                return tb4.A(1.0f, f2, nb2Var.s0, f * f2);
            }
        }
        return f;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.r1;
    }

    public int getChecksX() {
        float f;
        int i = this.d7;
        if (gba.U0 >= 10) {
            f = 27.3f;
        } else {
            f = 25.3f;
        }
        return i - gl.L(f);
    }

    public int getChecksY() {
        int intrinsicHeight;
        boolean O5 = this.Q5.O5();
        float f = this.K9;
        if (O5) {
            intrinsicHeight = b2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            intrinsicHeight = bkb.E3.getIntrinsicHeight();
        }
        return (int) (f - intrinsicHeight);
    }

    public int getCompactContentWidth() {
        int parentWidth;
        if (gl.O1()) {
            parentWidth = gl.P0();
        } else {
            parentWidth = getParentWidth();
        }
        return (parentWidth - gl.L(32.0f)) - getCompactSideMenuWidth();
    }

    public int getCompactLeft() {
        return gl.L(16.0f);
    }

    public int getCompactRight() {
        return (getMeasuredWidth() - gl.L(16.0f)) - getCompactSideMenuWidth();
    }

    public int getCurrentBackgroundLeft() {
        m17 m17Var = this.L6;
        if (m17Var == null) {
            return 0;
        }
        int i = m17Var.getBounds().left;
        if (!this.Q5.O3() && this.ub.A0 != 1.0f) {
            boolean z = this.Kb;
            if ((z || !this.C6) && !this.K) {
                if (z) {
                    return (int) (i - (getVideoTranscriptionProgress() * gl.L(6.0f)));
                }
                return i - gl.L(6.0f);
            }
            return i;
        }
        return i;
    }

    public int getCurrentBackgroundRight() {
        boolean z;
        m17 m17Var = this.L6;
        if (m17Var == null) {
            return getWidth();
        }
        int i = m17Var.getBounds().right;
        if (this.Q5.O3() && this.ub.A0 != 1.0f && (((z = this.Kb) || !this.C6) && !this.K)) {
            if (z) {
                return (int) ((getVideoTranscriptionProgress() * gl.L(6.0f)) + i);
            }
            return gl.L(6.0f) + i;
        }
        return i;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.wa;
    }

    public f27 getCurrentMessagesGroup() {
        return this.L;
    }

    public c27 getCurrentPosition() {
        return this.M;
    }

    public TLRPC.User getCurrentUser() {
        return this.va;
    }

    public bb2 getDelegate() {
        return this.eb;
    }

    @Override
    public float getDeltaBottom() {
        return this.ub.j0;
    }

    public float getDeltaLeft() {
        return this.ub.h0;
    }

    public float getDeltaRight() {
        return this.ub.i0;
    }

    public float getDeltaTop() {
        return this.ub.k0;
    }

    public float getDescriptionLayoutX() {
        int L;
        int extraTextX;
        float f;
        float L2;
        int i;
        int L3;
        int i2;
        boolean z = this.T1;
        float f2 = 0.0f;
        nb2 nb2Var = this.ub;
        if (z) {
            Typeface typeface = gl.a;
            L2 = this.p0 - gl.L(10.0f);
        } else {
            if (this.U1) {
                Typeface typeface2 = gl.a;
                i = this.p0;
                L3 = gl.L(1.0f);
            } else if (this.Q5.q4()) {
                Typeface typeface3 = gl.a;
                i = this.p0;
                L3 = gl.L(1.0f);
            } else {
                float f3 = 12.0f;
                if (this.Q5.O3()) {
                    f = getExtraTextX() + gl.L(12.0f) + this.N6;
                    if (this.Q5.D == 19) {
                        f -= Math.max(0.0f, ((Math.max(this.X7, this.Z7) + f) + gl.L(14.0f)) - gl.q.x);
                    }
                } else {
                    boolean z2 = this.C6;
                    int i3 = this.N6;
                    if (z2) {
                        L = gl.L(12.0f) + i3;
                        extraTextX = getExtraTextX();
                    } else {
                        if (!this.K) {
                            f3 = 18.0f;
                        }
                        L = gl.L(f3) + i3;
                        extraTextX = getExtraTextX();
                    }
                    f = extraTextX + L;
                }
                L2 = (f + nb2Var.h0) - gl.L(1.33f);
            }
            L2 = L3 + i;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (nb2Var != null) {
            f2 = nb2Var.i0;
        }
        float f4 = backgroundDrawableRight + f2;
        int i4 = 0;
        if (this.Q5.O3() && !this.C6 && !this.K) {
            i2 = 6;
        } else {
            i2 = 0;
        }
        int L4 = (int) (((f4 - gl.L(10 + i2)) - getExtraTextX()) - L2);
        float L5 = L2 + gl.L(10.0f);
        if (Math.abs(this.c2) > 1) {
            i4 = ((L4 - gl.L(20.0f)) - this.b2) - this.c2;
        }
        return L5 + i4;
    }

    public float getDescriptionLayoutY() {
        float f;
        float f2 = this.Y1;
        nb2 nb2Var = this.ub;
        if (!nb2Var.s2) {
            f = (-nb2Var.k0) + nb2Var.j0;
        } else {
            f = 0.0f;
        }
        return f2 + f;
    }

    public StaticLayout getDescriptionlayout() {
        return this.p2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        k27 k27Var;
        c27 c27Var = this.M;
        if ((c27Var == null || c27Var.h) && (k27Var = this.Q5) != null) {
            return k27Var.M0();
        }
        return null;
    }

    public i27 getExplanationLayout() {
        return this.q3;
    }

    public float getExplanationX() {
        return this.u5;
    }

    public float getExplanationY() {
        return this.v5;
    }

    public int getExtraInsetHeight() {
        int i;
        int i2 = this.w3;
        boolean h2 = h2();
        i19 i19Var = this.O;
        if (h2) {
            if (i19Var.p) {
                i = 18;
            } else {
                i = 0;
            }
            i2 += gl.L(i + 2) + this.s0.r;
        }
        if (this.x7) {
            i2 += getCommentButtonHeight();
        }
        if (!i19Var.p) {
            this.Q5.getClass();
            return i2 + i19Var.n;
        }
        return i2;
    }

    public int getExtraTextX() {
        int i = gba.U0;
        if (i >= 15) {
            return gl.L(2.0f);
        }
        if (i >= 11) {
            return gl.L(1.0f);
        }
        return 0;
    }

    public int getExtraTimeX() {
        int i;
        if (!v2()) {
            if (!this.Q5.O3() && ((!this.C6 || this.m3 != null) && (i = gba.U0) > 11)) {
                return gl.L((i - 11) / 1.5f);
            }
            if (!this.Q5.O3() && this.Lb && this.G6 && this.Q5.D == 5) {
                return (int) ((gl.b3(this.X6, w2()) - gl.u) * 0.7f);
            }
            return 0;
        }
        return 0;
    }

    public StaticLayout getFactCheckLayout() {
        ib2 ib2Var = this.s0;
        if (ib2Var != null) {
            return ib2Var.g;
        }
        return null;
    }

    public String getFilename() {
        byte b;
        byte b2;
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            int i = k27Var.D;
            if (i == 1) {
                TLRPC.PhotoSize photoSize = this.e4;
                if (photoSize != null) {
                    return ba4.r(null, photoSize);
                }
            } else if (i != 8 && (b2 = this.M1) != 7 && b2 != 4 && b2 != 8 && i != 9 && b2 != 3 && b2 != 5) {
                if (b2 != 0) {
                    return ba4.r(null, this.N1);
                }
                TLRPC.PhotoSize photoSize2 = this.e4;
                if (photoSize2 != null) {
                    return ba4.r(null, photoSize2);
                }
            } else if (!k27Var.E0) {
                if (k27Var.y0 && !TextUtils.isEmpty(k27Var.k.attachPath)) {
                    return this.Q5.k.attachPath;
                }
                if (!this.Q5.m4() || (b = this.M1) == 3 || b == 5) {
                    return this.Q5.S0();
                }
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        TLRPC.User user = this.va;
        if (user != null && user.id == 0) {
            return (int) this.A7.r();
        }
        return (int) (this.F9 + this.J1);
    }

    public float getHighlightAlpha() {
        return R1(false);
    }

    public int getIconForCurrentState() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.getIconForCurrentState():int");
    }

    public float getLastTouchX() {
        return this.h1;
    }

    public float getLastTouchY() {
        return this.i1;
    }

    public int getLayoutHeight() {
        return this.e7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        int i;
        int L2;
        k27 k27Var;
        k27 k27Var2;
        int i2;
        int i3;
        float f;
        int L3;
        int parentWidth;
        c27 c27Var;
        if (v2() && this.L == null) {
            return getCompactContentWidth();
        }
        byte b = this.M1;
        if (b != 6 && b != 8 && (i2 = (k27Var2 = this.Q5).D) != 5) {
            f27 f27Var = this.L;
            int i4 = 0;
            if (f27Var != null && !f27Var.i) {
                if (gl.O1()) {
                    parentWidth = gl.P0();
                } else {
                    parentWidth = getParentWidth();
                }
                i3 = 0;
                for (int i5 = 0; i5 < this.L.e.size(); i5++) {
                    if (((c27) this.L.e.get(i5)).c != 0) {
                        break;
                    }
                    i3 = (int) (Math.ceil(((c27Var.e + c27Var.j) / 1000.0f) * parentWidth) + i3);
                }
                if (this.X6) {
                    i4 = 71;
                } else if (b3()) {
                    i4 = 48;
                }
                L3 = gl.L(i4 + 31);
            } else if (i2 == 19) {
                int i6 = k27Var2.v2;
                int L4 = gl.q.x - gl.L(52.0f);
                if (this.G6) {
                    i4 = gl.L(48.0f);
                }
                return Math.max(i6, (int) ((L4 - i4) * 0.5f));
            } else {
                i3 = this.b7;
                if (k27Var2.n2 && k27Var2.O3() && X(this.Q5)) {
                    i3 -= gl.L(25.0f);
                }
                if (this.C6) {
                    f = 22.0f;
                } else {
                    f = 31.0f;
                }
                L3 = gl.L(f);
            }
            return i3 - L3;
        }
        float f2 = 0.0f;
        if (gl.O1()) {
            min = gl.P0();
            if (this.X6) {
                f2 = 71.0f;
            } else if (b3()) {
                f2 = 42.0f;
            }
            L = gl.L(f2);
        } else {
            min = Math.min(getParentWidth(), gl.q.y);
            if (this.X6) {
                f2 = 71.0f;
            } else if (b3()) {
                f2 = 42.0f;
            }
            L = gl.L(f2);
        }
        int i7 = min - L;
        k27 k27Var3 = this.Q5;
        if (k27Var3 != null && k27Var3.n2 && k27Var3.O3() && X(this.Q5)) {
            i7 -= gl.L(25.0f);
        }
        if (this.Lb && ((k27Var = this.Q5) == null || !k27Var.S4())) {
            i = i7 - (this.b7 - (gl.b3(this.X6, w2()) - gl.u));
            L2 = gl.L(57.0f);
        } else if (this.X6 && (this.Q5.D == 5 || this.M1 == 6)) {
            return this.b7 - gl.L(57.0f);
        } else {
            i = i7 - this.b7;
            L2 = gl.L(57.0f);
        }
        return i - L2;
    }

    public int getMediaOffsetY() {
        nb2 nb2Var = this.ub;
        if (nb2Var.a2) {
            return gl.U1(nb2Var.L1, nb2Var.Z1, this.X1);
        }
        return this.X1;
    }

    @Override
    public k27 getMessageObject() {
        k27 k27Var = this.R5;
        if (k27Var != null) {
            return k27Var;
        }
        return this.Q5;
    }

    public int getMiniIconForCurrentState() {
        int i = this.X3;
        if (i < 0) {
            return 4;
        }
        if (i == 0) {
            return 2;
        }
        return 3;
    }

    public int getNameStatusX() {
        int i;
        float f = this.t9 + this.s9;
        int i2 = this.R6;
        if (i2 > 0) {
            i = i2 - gl.L(32.0f);
        } else {
            i = this.i9;
        }
        return (int) (f + i + gl.L(2.0f) + (gl.L(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f = this.u9;
        StaticLayout staticLayout = this.h9;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.I1;
    }

    @Override
    public int getObserverTag() {
        return this.Z5;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.W + this.i0;
    }

    public int getParentWidth() {
        int i;
        k27 k27Var = this.Q5;
        if (k27Var == null) {
            k27Var = this.R5;
        }
        if (k27Var != null && k27Var.t1 && (i = this.L0) > 0) {
            return i;
        }
        return gl.q.x;
    }

    public float getPhotoBottom() {
        if (g4()) {
            float f = this.oc;
            if (f > 0.0f) {
                return f;
            }
            return this.e7 - gl.L(5.0f);
        }
        fb5 fb5Var = this.X5;
        if (fb5Var != null) {
            return fb5Var.e + fb5Var.h;
        }
        return this.U0.x();
    }

    public ImageReceiver getPhotoImage() {
        return this.U0;
    }

    public ArrayList<fb2> getPollButtons() {
        return this.Q4;
    }

    public float getPollButtonsLeft() {
        if (getMessageObject() != null && getMessageObject().O3()) {
            return (gl.L(3.0f) + this.d7) - this.b7;
        }
        if (this.Y6) {
            return gl.L(82.0f);
        }
        if (b3()) {
            return gl.L(59.0f);
        }
        return gl.L(11.0f);
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.b7) - gl.L(15.0f);
    }

    public k27 getPrimaryMessageObject() {
        k27 k27Var;
        k27 k27Var2 = this.Q5;
        if (k27Var2 != null && this.L != null && k27Var2.z2()) {
            k27Var = this.L.c();
        } else {
            k27Var = null;
        }
        if (k27Var != null) {
            return k27Var;
        }
        return this.Q5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.Q0;
    }

    public i19 getReactionsLayout() {
        return this.O;
    }

    public int getRepliesCount() {
        f27 f27Var = this.L;
        if (f27Var != null && !f27Var.d.isEmpty()) {
            return ((k27) this.L.d.get(0)).M1();
        }
        return this.Q5.M1();
    }

    public wjb getResourcesProvider() {
        return this.cc;
    }

    public RectF getScrimBlockBounds() {
        return this.yd;
    }

    public dv9 getSeekBarWaveform() {
        return this.E4;
    }

    public float getSideButtonStartX() {
        return this.d9;
    }

    public float getSideButtonStartY() {
        return this.e9;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.vd;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j;
        TLRPC.Message message2;
        f27 f27Var = this.L;
        if (f27Var != null) {
            ArrayList arrayList = f27Var.d;
            int size = arrayList.size();
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                k27 k27Var = (k27) obj;
                if (k27Var != null && (message2 = k27Var.k) != null) {
                    j = message2.paid_message_stars;
                } else {
                    j = 0;
                }
                j2 += j;
            }
            return j2;
        }
        k27 k27Var2 = this.Q5;
        if (k27Var2 == null || (message = k27Var2.k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        nb2 nb2Var = this.ub;
        if (nb2Var.z1) {
            return gl.U1(nb2Var.L1, nb2Var.y1, this.W);
        }
        return this.W;
    }

    public TLRPC.Document getStreamingMedia() {
        byte b = this.M1;
        if (b != 4 && b != 7 && b != 2) {
            return null;
        }
        return this.N1;
    }

    public int getTextX() {
        return this.o0;
    }

    public int getTextY() {
        return this.u0;
    }

    public float getTimeAlpha() {
        return this.k4;
    }

    public float getTimeX() {
        int i;
        nb2 nb2Var = this.ub;
        if (nb2Var.i1) {
            i = gl.U1(nb2Var.L1, nb2Var.h1, this.O9);
        } else {
            i = this.O9;
        }
        return i;
    }

    public float getTimeY() {
        int i;
        int i2 = 0;
        if (I3()) {
            if (this.x7) {
                i2 = v2() ? getCommentButtonHeight() : gl.L(41.3f);
            }
        } else if (this.Q5.q4()) {
            i = -gl.L(48.0f);
            if (this.c7) {
                i -= gl.L(4.0f);
            }
            return d2(i);
        } else if (this.x7) {
            i2 = v2() ? getCommentButtonHeight() : gl.L(43.0f);
        }
        i = -i2;
        return d2(i);
    }

    public int getTopMediaOffset() {
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.D == 14) {
            return this.X1 + this.gb;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        nb2 nb2Var = this.ub;
        if (nb2Var.v1) {
            return gl.U1(nb2Var.L1, nb2Var.u1, this.g0);
        }
        return this.g0;
    }

    public nb2 getTransitionParams() {
        return this.ub;
    }

    public float getVideoTranscriptionProgress() {
        k27 k27Var;
        nb2 nb2Var = this.ub;
        if (nb2Var != null && (k27Var = this.Q5) != null && k27Var.g4()) {
            boolean z = nb2Var.m1;
            boolean z2 = this.I6;
            if (z) {
                float f = nb2Var.L1;
                if (z2) {
                    return f;
                }
                return 1.0f - f;
            } else if (!z2) {
                return 0.0f;
            }
        }
        return 1.0f;
    }

    public float getViewTop() {
        return this.nb;
    }

    public int getWidthForButtons() {
        nb2 nb2Var = this.ub;
        if (nb2Var.O1) {
            return gl.U1(nb2Var.L1, nb2Var.P1, this.K5);
        }
        return this.K5;
    }

    @Override
    public final void h(float f) {
        k27 k27Var = this.Q5;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        k27Var.i0 = (int) (k27Var.L0() * f);
        W3();
    }

    public final boolean h0(MotionEvent motionEvent) {
        if (!this.s8 || this.w8 == null || this.Ta == null || this.eb == null) {
            return false;
        }
        float x = motionEvent.getX();
        float P1 = P1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Za;
        if (action == 0) {
            if (rectF.contains(x, P1)) {
                this.Ta.c(true);
                ff0 ff0Var = this.v8;
                if (ff0Var != null) {
                    ff0Var.setHotspot(x, P1);
                    this.v8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ta.i && !rectF.contains(x, P1)) {
                this.Ta.c(false);
                ff0 ff0Var2 = this.v8;
                if (ff0Var2 != null) {
                    ff0Var2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ta.i) {
                this.eb.J(this);
            }
            this.Ta.c(false);
            ff0 ff0Var3 = this.v8;
            if (ff0Var3 != null) {
                ff0Var3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ta.c(false);
            ff0 ff0Var4 = this.v8;
            if (ff0Var4 != null) {
                ff0Var4.setState(new int[0]);
            }
        }
        return this.Ta.i;
    }

    public final void h1(android.graphics.Canvas r63, float r64) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        ib2 ib2Var = this.s0;
        if (ib2Var != null && ib2Var.b) {
            return true;
        }
        return false;
    }

    public final void h3() {
        hb2 hb2Var = this.w2;
        if (hb2Var != null) {
            hb2Var.h = false;
        }
        n41 n41Var = this.Sa;
        if (n41Var != null) {
            n41Var.c(false);
        }
        Drawable drawable = this.J2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        hb2 hb2Var2 = this.w2;
        if (hb2Var2 != null && hb2Var2.g != null) {
            for (int i = 0; i < this.w2.g.size(); i++) {
                db2 db2Var = (db2) this.w2.g.get(i);
                n41 n41Var2 = db2Var.f;
                if (n41Var2 != null) {
                    n41Var2.c(false);
                }
                ff0 ff0Var = db2Var.g;
                if (ff0Var != null) {
                    ff0Var.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void i(long j, long j2) {
        float min;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.Q5.H0 = j;
        z0(j, j2);
        if (this.z1) {
            this.R0.o(true, min);
        } else {
            this.Q0.o(true, min);
        }
        byte b = this.M1;
        if (b != 3 && b != 5) {
            if (this.W3 != 0) {
                if (this.X3 != 1) {
                    R3(false, false, false);
                }
            } else if (this.O3 != 1) {
                R3(false, false, false);
            }
        } else if (this.W3 != 0) {
            if (this.X3 != 1) {
                R3(false, false, false);
            }
        } else if (this.O3 != 4) {
            R3(false, false, false);
        }
    }

    public final boolean i0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.i0(android.view.MotionEvent):boolean");
    }

    public final void i1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.i1(android.graphics.Canvas):void");
    }

    public final boolean i2() {
        wjb wjbVar = this.cc;
        if (wjbVar != null) {
            return wjbVar.g();
        }
        return bkb.b1();
    }

    public final void i3(int i) {
        i46 i46Var;
        i46 i46Var2 = this.u4;
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            for (int i2 = 0; i2 < i46Var2.a; i2++) {
                if (((Pair) ((ArrayList) i46Var2.e).get(i2)).second == valueOf) {
                    i46Var2.k(i2);
                }
            }
        } else {
            i46Var2.e(true);
        }
        ib2 ib2Var = this.s0;
        if (ib2Var != null && (i46Var = ib2Var.i) != null) {
            i46Var.e(true);
        }
        this.q4 = null;
        ib2 ib2Var2 = this.s0;
        if (ib2Var2 != null) {
            ib2Var2.j = null;
        }
        if (this.r4 != null) {
            if (this.v4 == i || i == -1) {
                this.r4 = null;
                this.v4 = -1;
                this.qc = false;
                this.rc = false;
                invalidate();
            }
        }
    }

    @Override
    public void invalidate() {
        bb2 bb2Var;
        if (this.Q5 != null) {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.Pc;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            Runnable runnable3 = this.Qc;
            if (runnable3 != null) {
                runnable3.run();
            }
            super.invalidate();
            if ((this.b6 || (this.L != null && s2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.ic && (bb2Var = this.eb) != null) {
                bb2Var.c();
            }
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.L != null) {
            t2();
        }
    }

    @Override
    public final boolean j() {
        f27 f27Var = this.L;
        if (f27Var != null && f27Var.i) {
            c27 c27Var = this.M;
            if (c27Var != null && (c27Var.l & 4) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean j0(MotionEvent motionEvent) {
        gib E2;
        boolean z;
        boolean z2;
        int L;
        int i;
        ib2 ib2Var;
        int L2;
        int extraTextX;
        int i2;
        f27 f27Var;
        bb2 bb2Var = this.eb;
        if (bb2Var != null && (E2 = bb2Var.E2()) != null && (E2.a() || E2.d())) {
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            rh9 rh9Var = this.Q5.y2;
            if (rh9Var != null && !rh9Var.n.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || f2() || z2) && ((this.k1 || this.L != null) && (this.L == null || this.eb.O()))) {
                if (this.Q5.z2() && (f27Var = this.L) != null && !f27Var.i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt instanceof gb2) {
                                gb2 gb2Var = (gb2) childAt;
                                f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
                                c27 currentPosition = gb2Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.a == this.L.a && (currentPosition.l & H()) != 0 && (currentPosition.l & 1) != 0) {
                                    E2.c = (int) gb2Var.s3;
                                    E2.d = (int) gb2Var.t3;
                                    E2.a0(gb2Var);
                                    if (gb2Var == this) {
                                        return E2.L(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - gb2Var.getLeft(), getTop() - gb2Var.getTop());
                                    boolean L3 = E2.L(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - gb2Var.getLeft()), -(getTop() - gb2Var.getTop()));
                                    return L3;
                                }
                            }
                        }
                    }
                } else {
                    k27 k27Var = this.Q5;
                    if (k27Var != null && !k27Var.t1 && (ib2Var = this.s0) != null && ib2Var.g != null && P1(motionEvent) >= this.r0) {
                        E2.r0 = false;
                        E2.t0 = true;
                        E2.v0 = false;
                        f27 f27Var2 = this.L;
                        if (f27Var2 != null && !f27Var2.i) {
                            i2 = (int) this.s3;
                        } else {
                            float f = 12.0f;
                            if (this.Q5.O3()) {
                                int extraTextX2 = getExtraTextX() + gl.L(12.0f) + this.N6;
                                if (this.Q5.D == 19) {
                                    i2 = extraTextX2 - Math.max(0, (gl.L(14.0f) + (Math.max(this.X7, this.Z7) + extraTextX2)) - gl.q.x);
                                } else {
                                    i2 = extraTextX2;
                                }
                            } else {
                                boolean z3 = this.C6;
                                int i4 = this.N6;
                                if (z3) {
                                    L2 = gl.L(12.0f) + i4;
                                    extraTextX = getExtraTextX();
                                } else {
                                    if (!this.K) {
                                        f = 18.0f;
                                    }
                                    L2 = gl.L(f) + i4;
                                    extraTextX = getExtraTextX();
                                }
                                i2 = L2 + extraTextX;
                            }
                        }
                        int L4 = ((int) (i2 + this.ub.h0)) - gl.L(1.33f);
                        int i5 = this.r0;
                        E2.c = (gl.L(10.0f) + L4) - this.s0.o;
                        E2.d = gl.L(22.0f) + i5;
                    } else {
                        if (z2 && R2()) {
                            if (P1(motionEvent) < this.Q5.y2.t() + this.u0) {
                                E2.r0 = false;
                                E2.t0 = false;
                                E2.v0 = true;
                                int i6 = this.o0;
                                int i7 = this.u0;
                                E2.c = i6;
                                E2.d = i7;
                            }
                        }
                        if (f2()) {
                            E2.r0 = false;
                            E2.t0 = false;
                            E2.v0 = false;
                            E2.c = (int) this.s3;
                            E2.d = (int) this.t3;
                        } else {
                            k27 k27Var2 = this.Q5;
                            if (k27Var2 != null && !k27Var2.t1 && this.p2 != null && (!this.v1 ? P1(motionEvent) > this.Y1 : P1(motionEvent) < this.u0)) {
                                E2.r0 = true;
                                E2.t0 = false;
                                E2.v0 = false;
                                if (this.T1) {
                                    i = this.p0 - gl.L(10.0f);
                                } else {
                                    boolean z4 = this.U1;
                                    int i8 = this.p0;
                                    if (z4) {
                                        L = gl.L(1.0f);
                                    } else {
                                        L = gl.L(1.0f);
                                    }
                                    i = L + i8;
                                }
                                int L5 = gl.L(10.0f) + i + this.a2;
                                int i9 = this.Y1;
                                E2.c = L5;
                                E2.d = i9;
                            } else if (z2) {
                                E2.r0 = false;
                                E2.t0 = false;
                                E2.v0 = true;
                                int i10 = this.o0;
                                int i11 = this.u0;
                                E2.c = i10;
                                E2.d = i11;
                            } else {
                                E2.r0 = false;
                                E2.t0 = false;
                                E2.v0 = false;
                                int i12 = this.o0;
                                int i13 = this.u0;
                                E2.c = i12;
                                E2.d = i13;
                            }
                        }
                    }
                    E2.a0(this);
                    return E2.L(motionEvent);
                }
            }
        }
        return false;
    }

    public void j1(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.j1(android.graphics.Canvas):void");
    }

    public final boolean j2() {
        k27 k27Var = this.Q5;
        if ((k27Var != null && k27Var.s2()) || this.M5) {
            return true;
        }
        return false;
    }

    public final void j3() {
        if (this.o3 != null) {
            this.o3 = null;
        }
        ArrayList arrayList = this.x4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.w4.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean k0(MotionEvent motionEvent) {
        if (this.Q5.q4() && this.Q5.b1) {
            int x = (int) motionEvent.getX();
            int P1 = (int) P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f = x;
                if (f >= this.k2 - gl.L(6.0f) && f <= this.k2 + this.i2 + gl.L(6.0f)) {
                    float f2 = P1;
                    if (f2 >= this.l2 - gl.L(2.0f) && f2 <= this.l2 + this.j2 + gl.L(2.0f)) {
                        n41 n41Var = this.n2;
                        if (n41Var != null) {
                            n41Var.c(true);
                        }
                        this.m2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.m2) {
                bb2 bb2Var = this.eb;
                if (bb2Var != null) {
                    bb2Var.R1();
                }
                n41 n41Var2 = this.n2;
                if (n41Var2 != null) {
                    n41Var2.c(false);
                }
                playSoundEffect(0);
                this.m2 = false;
            }
        }
        return false;
    }

    public final void k1(Canvas canvas, RectF rectF) {
        float f;
        Path path = this.B4;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        ml mlVar = this.U0;
        float alpha = mlVar.getAlpha();
        if (this.Q5.f4()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        mlVar.setAlpha(f * alpha);
        mlVar.h(canvas, null);
        mlVar.setAlpha(alpha);
        canvas.restore();
        Paint c2 = c2("paintChatTimeBackground");
        int alpha2 = c2.getAlpha();
        c2.setAlpha((int) (alpha2 * this.l4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, c2);
        c2.setAlpha(alpha2);
    }

    public final boolean k2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.k2():boolean");
    }

    public final void k3() {
        CharSequence charSequence;
        long j;
        long j2;
        long j3;
        long j4;
        sa2 sa2Var = this.kc;
        tj2 tj2Var = this.x;
        tj2Var.a(sa2Var);
        sa2 sa2Var2 = this.lc;
        tj2Var.a(sa2Var2);
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            boolean isEmpty = TextUtils.isEmpty(k27Var.z);
            k27 k27Var2 = this.Q5;
            if (!isEmpty) {
                charSequence = k27Var2.z;
            } else {
                charSequence = k27Var2.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i = im4.e;
                int i2 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    im4[] im4VarArr = (im4[]) spanned.getSpans(0, spanned.length(), im4.class);
                    for (im4 im4Var : im4VarArr) {
                        if (im4Var.b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(im4VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(im4Var.b.date));
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    long j5 = Long.MAX_VALUE;
                    long j6 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        long intValue = ((Integer) obj).intValue() * 1000;
                        long abs = Math.abs(intValue - currentTimeMillis);
                        if (abs < j5) {
                            j6 = intValue;
                            j5 = abs;
                        }
                    }
                    long j7 = currentTimeMillis - j6;
                    if (j5 < 63000) {
                        if (j7 > 0) {
                            j = 1000 - (j7 % 1000);
                        } else {
                            j = (-j7) % 1000;
                        }
                    } else if (j5 < 3780000) {
                        j2 = 60000;
                        if (j7 > 0) {
                            j4 = j7 % 60000;
                            j = j2 - j4;
                        } else {
                            j3 = (-j7) % 60000;
                            j = j3;
                        }
                    } else if (j5 < 90720000) {
                        j2 = 3600000;
                        if (j7 > 0) {
                            j4 = j7 % 3600000;
                            j = j2 - j4;
                        } else {
                            j3 = (-j7) % 3600000;
                            j = j3;
                        }
                    } else {
                        j = -1;
                    }
                    if (j > 0) {
                        long j8 = j + 100;
                        tj2Var.a(sa2Var2);
                        h18 h18Var = new h18(tj2Var, sa2Var2, (byte) 18);
                        tj2Var.a.put(sa2Var2, h18Var);
                        if (j8 > 0) {
                            gl.d3(h18Var, j8);
                        } else {
                            gl.c3(h18Var);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void l(long j, long j2) {
        float min;
        int i;
        TLRPC.Message message;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.Q5.H0 = j;
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.o(true, min);
        if (j == j2 && ((this.M != null || ((message = this.Q5.k) != null && message.paid_message_stars > 0)) && z3a.B(this.a6).I(this.Q5.e1()) && ((i = this.O3) == 1 || (i == 4 && this.M1 == 5)))) {
            this.S0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j3 = this.A1;
        if (j3 > 0 && Math.abs(j3 - j2) > 1048576) {
            this.A1 = j2;
        }
        z0(j, j2);
    }

    public final boolean l0(MotionEvent motionEvent) {
        qa2 qa2Var;
        ff0 ff0Var;
        if (this.I4 && ((!this.Lb || getVideoTranscriptionProgress() > 0.0f || this.T2) && (qa2Var = this.J4) != null)) {
            int action = motionEvent.getAction();
            float x = motionEvent.getX();
            float P1 = P1(motionEvent);
            if (action != 1 && action != 3) {
                if (qa2Var.v.contains((int) x, (int) P1)) {
                    if (action == 0) {
                        qa2Var.A = true;
                    }
                    if (qa2Var.A && (ff0Var = qa2Var.q) != null) {
                        ff0Var.setHotspot(x, P1);
                        qa2Var.q.setState(uyb.N);
                        qa2Var.r.invalidate();
                    }
                    return true;
                }
            } else if (qa2Var.A && action == 1) {
                qa2Var.p();
                return true;
            } else {
                qa2Var.A = false;
            }
        }
        return false;
    }

    public boolean l1(Canvas canvas) {
        km m;
        int i;
        boolean z;
        k27 k27Var = this.Q5;
        ml mlVar = this.U0;
        if (k27Var != null && k27Var.D3() && (m = mlVar.m()) != null && (i = m.d[4]) > 0) {
            float l = 1.0f - Utilities.l(((i - 90) - m.o()) / 500.0f);
            if (l > 0.0f) {
                if (l < 1.0f) {
                    z = mlVar.h(canvas, null);
                } else {
                    z = true;
                }
                mlVar.U0 = true;
                float alpha = mlVar.getAlpha();
                mlVar.setAlpha(l * alpha);
                mlVar.h(canvas, null);
                mlVar.setAlpha(alpha);
                mlVar.U0 = false;
                return z;
            }
        }
        return mlVar.h(canvas, null);
    }

    public final boolean l2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.l2():boolean");
    }

    public final void l3(int i, int i2, String str) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i);
            if (str != null) {
                obtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, obtain);
            }
        }
    }

    @Override
    public final boolean m() {
        return this.La;
    }

    public final boolean m0() {
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.D == 17) {
            TLRPC.MessageMedia n1 = k27.n1(k27Var.k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) n1).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void m1(Canvas canvas) {
        if (this.B8 && this.A8 != null) {
            int saveCount = canvas.getSaveCount();
            try {
                n1(canvas);
            } catch (Throwable th) {
                fa4.g(th, true);
                canvas.restoreToCount(saveCount);
                this.B8 = false;
                long j = this.Q5.F0().id;
                gb8.b.remove(Long.valueOf(j));
                gb8.c.put(Long.valueOf(j), Boolean.TRUE);
                if (this.eb != null) {
                    gl.c3(new sa2(this, (byte) 8));
                }
            }
        }
    }

    public final boolean m2() {
        k27 k27Var = this.Q5;
        if (k27Var != null && k27Var.N5()) {
            c27 c27Var = this.M;
            if (c27Var != null) {
                int i = c27Var.l;
                if ((i & 8) == 0 || (i & 1) == 0) {
                    return false;
                }
            }
            this.O.getClass();
            return true;
        }
        return false;
    }

    public final void m3(boolean z, boolean z2) {
        f27 f27Var;
        f27 f27Var2;
        k27 k27Var;
        if (!z2 || (k27Var = this.Q5) == null || !k27Var.a0) {
            if (z) {
                this.o3 = null;
                CheckBoxBase checkBoxBase = this.m1;
                wjb wjbVar = this.cc;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, wjbVar, this);
                    this.m1 = checkBoxBase2;
                    if (this.O0) {
                        checkBoxBase2.l = true;
                    }
                } else if (checkBoxBase.F != wjbVar) {
                    checkBoxBase.F = wjbVar;
                    checkBoxBase.b();
                }
            }
            if (z && (((f27Var = this.L) != null && f27Var.d.size() > 1) || ((f27Var2 = this.S5) != null && f27Var2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.l1;
                wjb wjbVar2 = this.cc;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, wjbVar2, this);
                    this.l1 = checkBoxBase4;
                    if (!checkBoxBase4.y) {
                        checkBoxBase4.y = true;
                        checkBoxBase4.b();
                    }
                    if (this.O0) {
                        this.l1.l = true;
                    }
                } else if (checkBoxBase3.F != wjbVar2) {
                    checkBoxBase3.F = wjbVar2;
                    checkBoxBase3.b();
                }
            }
            float f = 0.0f;
            if (this.n1 == z) {
                if (z2 != this.o1 && !z2) {
                    if (z) {
                        f = 1.0f;
                    }
                    this.p1 = f;
                    invalidate();
                    return;
                }
                return;
            }
            this.o1 = z2;
            this.n1 = z;
            if (z2) {
                this.q1 = SystemClock.elapsedRealtime();
            } else {
                if (z) {
                    f = 1.0f;
                }
                this.p1 = f;
            }
            invalidate();
        }
    }

    @Override
    public final boolean n() {
        f27 f27Var = this.L;
        if (f27Var != null && f27Var.i) {
            c27 c27Var = this.M;
            if (c27Var != null && (c27Var.l & 8) != 0) {
                return this.G;
            }
            return true;
        }
        return this.G;
    }

    public final boolean n0(float f, int i) {
        i19 i19Var = this.O;
        if (!i19Var.H) {
            return false;
        }
        float y = getY() + i19Var.c;
        if (y <= f || (y + i19Var.m) - gl.L(16.0f) >= i) {
            return false;
        }
        return true;
    }

    public final void n1(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.n1(android.graphics.Canvas):void");
    }

    public final boolean n2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void n3(boolean z, boolean z2) {
        this.D6 = z;
        this.w6 = z2;
        X3();
        if (this.C4) {
            this.E4.o = A2();
        } else {
            this.D4.p = A2();
        }
        invalidate();
    }

    public final boolean o0() {
        qb4 qb4Var;
        ba4 G = ba4.G(this.a6);
        String filename = getFilename();
        if (filename == null || (qb4Var = (qb4) G.h.get(filename)) == null || !qb4Var.T) {
            return false;
        }
        qb4Var.T = false;
        return true;
    }

    public final void o1(Canvas canvas, int i) {
        int i2;
        i27 i27Var;
        k27 k27Var;
        bb2 bb2Var = this.eb;
        int i3 = 0;
        if (bb2Var != null) {
            if (!bb2Var.A1(this, 1)) {
                this.A4 = null;
                ArrayList arrayList = this.z4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i4 = 0; i4 < this.z4.size(); i4++) {
                        eb2 eb2Var = (eb2) this.z4.get(i4);
                        if (!eb2Var.a.d()) {
                            eb2Var.a.a();
                        }
                    }
                }
            } else {
                CharacterStyle f0 = this.eb.f0(this);
                if (f0 != this.A4) {
                    this.A4 = f0;
                    r86 r86Var = this.y4;
                    if (r86Var != null) {
                        r86Var.a();
                        this.y4 = null;
                    }
                    r86 r86Var2 = new r86();
                    this.y4 = r86Var2;
                    r86Var2.D = true;
                    b46 b46Var = new b46(0);
                    r86 r86Var3 = this.y4;
                    r86Var3.y = b46Var;
                    r86Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.a = this.y4;
                    obj.b = -3;
                    ArrayList arrayList2 = this.z4;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.z4 = arrayList2;
                    }
                    arrayList2.add(obj);
                    if (this.A4 != null && !H1(obj, b46Var, this.p2, -2) && (((i27Var = this.m3) == null || !I1(obj, b46Var, i27Var.e)) && (k27Var = this.Q5) != null)) {
                        I1(obj, b46Var, k27Var.B2);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.z4;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            k27 k27Var2 = this.Q5;
            if (k27Var2 != null && k27Var2.O3()) {
                i2 = bkb.Cc;
            } else {
                i2 = bkb.Be;
            }
            int v0 = bkb.v0(i2, this.cc);
            while (i3 < this.z4.size()) {
                eb2 eb2Var2 = (eb2) this.z4.get(i3);
                if (eb2Var2.b == i) {
                    r86 r86Var4 = eb2Var2.a;
                    r86Var4.g(bkb.p1(0.85f, v0), bkb.p1(2.0f, v0), bkb.p1(3.5f, v0), bkb.p1(6.0f, v0));
                    r86Var4.draw(canvas);
                    invalidate();
                    if (r86Var4.c()) {
                        this.z4.remove(i3);
                        i3--;
                    }
                }
                i3++;
            }
        }
    }

    public final boolean o2() {
        ArrayList arrayList;
        i27 i27Var = this.m3;
        if (i27Var != null && (arrayList = i27Var.e) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((h27) obj).y.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            ArrayList arrayList2 = getMessageObject().B2;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (!((h27) obj2).y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o3(boolean z, boolean z2, boolean z3) {
        k27 k27Var;
        if (z || !z3 || (k27Var = this.Q5) == null || !k27Var.a0) {
            CheckBoxBase checkBoxBase = this.m1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z2, z3);
            }
            CheckBoxBase checkBoxBase2 = this.l1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z, z3);
            }
            f17 f17Var = this.fb;
            float f = 0.0f;
            if (f17Var.e == z2) {
                if (f17Var.f != z3 && !z3) {
                    if (z2) {
                        f = 1.0f;
                    }
                    f17Var.d = f;
                    f17Var.f = false;
                    return;
                }
                return;
            }
            f17Var.e = z2;
            f17Var.f = z3;
            if (z3) {
                f17Var.c = SystemClock.elapsedRealtime();
            } else {
                if (z2) {
                    f = 1.0f;
                }
                f17Var.d = f;
            }
            f17Var.a();
            gb2 gb2Var = f17Var.m;
            if (gb2Var != null) {
                gb2Var.invalidate();
                if (gb2Var.getParent() != null) {
                    ((ViewGroup) gb2Var.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        gb2 gb2Var;
        float f;
        float f2;
        yd8 yd8Var;
        yd8 yd8Var2;
        gc0 gc0Var;
        super.onAttachedToWindow();
        wtc wtcVar = this.Jc;
        if (wtcVar != null) {
            wtcVar.a();
            this.Jc = null;
        }
        wtc wtcVar2 = new wtc(kk7.f(this.a6), this);
        wtcVar2.b(kk7.D0);
        wtcVar2.e(kk7.l1);
        wtcVar2.e(kk7.k1);
        wtcVar2.e(kk7.k4);
        wtcVar2.e(kk7.X2);
        this.Jc = wtcVar2;
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            k27Var.k1 = false;
            rh9 rh9Var = k27Var.y2;
            if (rh9Var != null) {
                rh9Var.b(this);
            }
        }
        rh9 rh9Var2 = this.ub.M0;
        if (rh9Var2 != null) {
            rh9Var2.b(this);
        }
        lb2 lb2Var = this.i3;
        if (lb2Var != null && (gc0Var = lb2Var.b) != null) {
            gc0Var.e();
        }
        mb2 mb2Var = this.x2;
        if (mb2Var != null && (yd8Var2 = mb2Var.m) != null) {
            yd8Var2.a();
        }
        mb2 mb2Var2 = this.x2;
        if (mb2Var2 != null && (yd8Var = mb2Var2.n) != null) {
            yd8Var.a();
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fb2) obj).a();
        }
        k27 k27Var2 = this.R5;
        if (k27Var2 != null) {
            k27Var2.k1 = false;
            gb2Var = this;
            gb2Var.y3(k27Var2, this.S5, this.U5, this.T5, this.V5, this.W5);
            gb2Var.R5 = null;
            gb2Var.S5 = null;
        } else {
            gb2Var = this;
        }
        CheckBoxBase checkBoxBase = gb2Var.m1;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        CheckBoxBase checkBoxBase2 = gb2Var.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.l = true;
        }
        aub aubVar = gb2Var.f0;
        if (aubVar != null) {
            aubVar.a();
        }
        CheckBoxBase checkBoxBase3 = gb2Var.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.l = true;
        }
        if (gb2Var.f7 != null) {
            int i2 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = gb2Var.f7;
                if (i2 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i2].l = true;
                i2++;
            }
        }
        gb2Var.O0 = true;
        float f3 = 0.0f;
        gb2Var.wd = 0.0f;
        gb2Var.vd = 0.0f;
        gb2Var.r1 = 0;
        gb2Var.d4();
        ImageReceiver imageReceiver = gb2Var.A7;
        imageReceiver.p0((View) gb2Var.getParent());
        imageReceiver.I();
        cb2 cb2Var = gb2Var.tc;
        if (cb2Var != null) {
            cb2Var.b.I();
        }
        cb2 cb2Var2 = gb2Var.uc;
        if (cb2Var2 != null) {
            cb2Var2.b.I();
        }
        gb2Var.R();
        k27 k27Var3 = gb2Var.Q5;
        if (k27Var3 != null) {
            gb2Var.setAvatar(k27Var3);
        }
        byte b = gb2Var.M1;
        if (b == 4 && gb2Var.H5) {
            boolean D = MediaController.w().D(gb2Var.Q5);
            gb2Var.F1 = D;
            if (D) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            gb2Var.H1 = f2;
            gb2Var.G1 = (byte) 0;
        } else {
            gb2Var.F1 = false;
            gb2Var.H1 = 0.0f;
            if ((b == 4 || b == 2) && gb2Var.B1) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            gb2Var.E1 = f;
        }
        if (gb2Var.getDelegate() != null && gb2Var.getDelegate().E2() != null) {
            gib E2 = gb2Var.getDelegate().E2();
            E2.getClass();
            if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() == E2.w) {
                E2.W = gb2Var;
            }
        }
        if (gb2Var.M1 == 5) {
            boolean D2 = MediaController.w().D(gb2Var.Q5);
            ra2 F1 = gb2Var.F1();
            if (D2) {
                f3 = 1.0f;
            }
            F1.h = f3;
        }
        i19 i19Var = gb2Var.O;
        ArrayList arrayList2 = i19Var.s;
        i19Var.D = true;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((f19) arrayList2.get(i3)).a();
        }
        h24 h24Var = gb2Var.zb;
        if (h24Var != null) {
            h24Var.a();
        }
        fb5 fb5Var = gb2Var.X5;
        if (fb5Var != null) {
            ArrayList arrayList3 = fb5Var.c;
            if (!fb5Var.C) {
                fb5Var.C = true;
                pla plaVar = fb5Var.l;
                if (plaVar != null) {
                    plaVar.b(fb5Var.a);
                }
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    eb5 eb5Var = (eb5) arrayList3.get(i4);
                    if (!eb5Var.N) {
                        eb5Var.N = true;
                        eb5Var.f.I();
                    }
                }
            }
        }
        gb2Var.U3();
        k27 k27Var4 = gb2Var.Q5;
        if (k27Var4 != null && k27Var4.D == 20 && gb2Var.ja != null) {
            gb2Var.invalidate();
        }
        tl tlVar = gb2Var.Ca;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = gb2Var.Da;
        if (tlVar2 != null) {
            tlVar2.a();
        }
        pla plaVar2 = gb2Var.ca;
        if (plaVar2 != null) {
            if (plaVar2.i) {
                pla Y2 = gb2Var.Y2();
                gb2Var.ca = Y2;
                Integer num = gb2Var.da;
                if (num != null) {
                    Y2.k.put(gb2Var, num);
                }
            } else {
                plaVar2.a(gb2Var);
            }
        }
        dj1 dj1Var = gb2Var.w;
        if (dj1Var != null) {
            ArrayList arrayList4 = dj1Var.p;
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((cj1) arrayList4.get(i5)).a();
            }
        }
        tza tzaVar = gb2Var.f1;
        if (tzaVar != null) {
            for (int i6 = 0; i6 < tzaVar.b; i6++) {
                tzaVar.c[i6].b(gb2Var);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        kb2 kb2Var;
        gc0 gc0Var;
        hx2 hx2Var;
        yd8 yd8Var;
        yd8 yd8Var2;
        super.onDetachedFromWindow();
        wtc wtcVar = this.Jc;
        if (wtcVar != null) {
            wtcVar.a();
            this.Jc = null;
        }
        AnimatorSet animatorSet = this.Y5;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Y5 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.m1;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        mb2 mb2Var = this.x2;
        if (mb2Var != null && (yd8Var2 = mb2Var.m) != null) {
            yd8Var2.b.K();
            yd8Var2.y.f();
        }
        mb2 mb2Var2 = this.x2;
        if (mb2Var2 != null && (yd8Var = mb2Var2.n) != null) {
            yd8Var.b.K();
            yd8Var.y.f();
        }
        mb2 mb2Var3 = this.x2;
        if (mb2Var3 != null && (hx2Var = mb2Var3.j) != null) {
            hx2Var.b();
            this.x2.j = null;
        }
        rh9 rh9Var = this.Q5.y2;
        if (rh9Var != null) {
            rh9Var.f(this);
        }
        nb2 nb2Var = this.ub;
        rh9 rh9Var2 = nb2Var.M0;
        if (rh9Var2 != null) {
            rh9Var2.f(this);
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fb2) obj).b();
        }
        lb2 lb2Var = this.i3;
        if (lb2Var != null && (gc0Var = lb2Var.b) != null) {
            gc0Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.l = false;
        }
        if (this.f7 != null) {
            int i2 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f7;
                if (i2 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i2].l = false;
                i2++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.l = false;
        }
        this.O0 = false;
        fb5 fb5Var = this.X5;
        if (fb5Var != null) {
            fb5Var.e();
        }
        this.A7.K();
        cb2 cb2Var = this.tc;
        if (cb2Var != null) {
            cb2Var.b.K();
        }
        cb2 cb2Var2 = this.uc;
        if (cb2Var2 != null) {
            cb2Var2.b.K();
        }
        aub aubVar = this.f0;
        if (aubVar != null) {
            aubVar.b();
        }
        R();
        if (this.G3 && (kb2Var = this.t0) != null && kb2Var.d != null && kb2Var.e != null) {
            fl5 z = fl5.z();
            String str = this.t0.d;
            if (str != null) {
                z.A.remove(str);
            }
            this.G3 = false;
        }
        tza tzaVar = this.f1;
        if (tzaVar != null) {
            tzaVar.a(this);
        }
        up3.q(this.a6).v(this);
        if (getDelegate() != null && getDelegate().E2() != null) {
            gib E2 = getDelegate().E2();
            E2.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == E2.w) {
                E2.W = null;
            }
        }
        nb2Var.w0 = false;
        if (MediaController.w().D(this.Q5)) {
            n40 n40Var = bkb.c5;
            if (n40Var == null) {
                n40Var = new n40();
                bkb.c5 = n40Var;
            }
            n40Var.i = null;
        }
        ValueAnimator valueAnimator = this.Gb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Gb.cancel();
        }
        this.O.p();
        this.Fb = false;
        h24 h24Var = this.zb;
        if (h24Var != null) {
            h24Var.g();
        }
        tl tlVar = this.Ca;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.Da;
        if (tlVar2 != null) {
            tlVar2.b();
        }
        pla plaVar = this.ca;
        if (plaVar != null) {
            plaVar.b(this);
        }
        dj1 dj1Var = this.w;
        if (dj1Var != null) {
            ArrayList arrayList2 = dj1Var.p;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                cj1 cj1Var = (cj1) arrayList2.get(i3);
                int i4 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = cj1Var.c;
                    if (i4 < imageReceiverArr.length) {
                        imageReceiverArr[i4].K();
                        i4++;
                    }
                }
            }
        }
        rg2.d().g(this.Oc);
    }

    @Override
    public void onDraw(Canvas canvas) {
        d1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        zi9 f4 = f4();
        int i = 0;
        if (f4 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.i0 + this.u0;
            motionEvent.offsetLocation(-this.o0, -topicSeparatorTopPadding);
            Rect rect = f4.b;
            if (f4.e0 != null && f4.f0) {
                motionEvent.offsetLocation((-rect.left) + f4.k0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < f4.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < f4.j0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f4.e0.m(motionEvent, z);
                } finally {
                    motionEvent.offsetLocation(rect.left - f4.k0, rect.top);
                }
            }
            motionEvent.offsetLocation(this.o0, topicSeparatorTopPadding);
        }
        int x = (int) motionEvent.getX();
        int P1 = (int) P1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.Jb;
                if (i >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i)).contains(x, P1)) {
                    int keyAt = sparseArray.keyAt(i);
                    if (keyAt != this.Xb) {
                        this.Xb = keyAt;
                        l3(keyAt, 32768, null);
                    }
                    return true;
                } else {
                    i++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.Xb = 0;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean r28, int r29, int r30, int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        gb2 gb2Var;
        int i3;
        k27 k27Var = this.Q5;
        boolean z = true;
        if (k27Var != null && (k27Var.I() || this.V3 != gl.q.y)) {
            this.C0 = true;
            k27 k27Var2 = this.Q5;
            this.Q5 = null;
            gb2Var = this;
            gb2Var.z3(k27Var2, this.L, this.G, this.F, this.H, false);
            gb2Var.C0 = false;
        } else {
            gb2Var = this;
        }
        gb2Var.b4();
        int i4 = gb2Var.W + gb2Var.g0 + gb2Var.i0 + gb2Var.v0 + gb2Var.x0 + gb2Var.e0;
        vu1 draftMessageMeasureController = gb2Var.getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(gb2Var.Q5)) {
            int max = Math.max(0, (((draftMessageMeasureController.a.getHeight() - draftMessageMeasureController.a.getPaddingTop()) - draftMessageMeasureController.a.getPaddingBottom()) - draftMessageMeasureController.d) - i4);
            if (max <= 0) {
                z = false;
            }
            draftMessageMeasureController.e = z;
            if (draftMessageMeasureController.b > 0 && !z) {
                draftMessageMeasureController.b(0, 0L);
            }
            i3 = max + i4;
        } else {
            i3 = i4;
        }
        gb2Var.Rc = Math.max(0, i3 - i4);
        gb2Var.setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.K6) {
            k27 k27Var = this.Q5;
            if (k27Var != null && (charSequence2 = k27Var.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.Q5.v);
                return;
            }
            k27 k27Var2 = this.Q5;
            if (k27Var2 != null && (charSequence = k27Var2.z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.Q5.z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            invalidate();
            r2();
        }
    }

    public final void p0(Bitmap bitmap, boolean z) {
        boolean K4 = k27.K4(this.Q5.k);
        ml mlVar = this.U0;
        if (K4) {
            if (MediaController.w().D(this.Q5)) {
                mlVar.u0 = false;
                mlVar.x0();
                return;
            }
            mlVar.u0 = true;
            mlVar.w0(false);
            return;
        }
        if (z) {
            k27 k27Var = MediaController.w().v0;
            if (k27Var != null && k27Var.g4()) {
                z = false;
            } else {
                z = true;
            }
        }
        mlVar.u0 = z;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            mlVar.Z = null;
            mlVar.b0 = null;
            mlVar.c0 = null;
            mlVar.d0 = null;
            mlVar.a1.setShader(null);
            mlVar.u0(bitmapDrawable);
            mlVar.n1 = true;
            mlVar.i1 = 0.0f;
            mlVar.y0(mlVar.n0);
        }
        if (z) {
            mlVar.w0(false);
        } else {
            mlVar.x0();
        }
    }

    public final void p1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.p1(android.graphics.Canvas):void");
    }

    public final void p2(int i, int i2, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            h27 h27Var = (h27) arrayList.get(i4);
            if (i >= h27Var.n && i < h27Var.r) {
                this.A0 = i4;
                j3();
                try {
                    b46 c3 = c3();
                    c3.c = true;
                    c3.d(h27Var.e, i, 0.0f);
                    h27Var.e.getSelectionPath(i, i2, c3);
                    c3.a();
                    float f = h27Var.w + h27Var.h;
                    if (i2 >= h27Var.n + i3) {
                        for (int i5 = i4 + 1; i5 < arrayList.size(); i5++) {
                            h27 h27Var2 = (h27) arrayList.get(i5);
                            int i6 = h27Var2.r - h27Var2.n;
                            b46 c32 = c3();
                            c32.c = true;
                            float f2 = f + h27Var2.f;
                            c32.d(h27Var2.e, 0, f2);
                            f = f2 + h27Var2.w + h27Var2.h;
                            h27Var2.e.getSelectionPath(0, i2 - h27Var2.n, c32);
                            c32.a();
                            if (i2 < (h27Var.n + i6) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.B0) {
                        this.y6 = true;
                        this.z6 = 2500;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                invalidate();
            } else {
                i4++;
            }
        }
        this.j3 = -1;
        this.k3 = -1;
    }

    public final boolean p3(boolean z) {
        x97 x97Var;
        gb2 gb2Var;
        if (this.Q5.T2()) {
            Drawable t = this.U0.t();
            if (t instanceof ny8) {
                final ny8 ny8Var = (ny8) t;
                String C0 = this.Q5.C0();
                TLRPC.TL_messages_stickerSet o0 = hq6.d0(this.a6).o0(C0);
                if (o0 == null) {
                    hq6.d0(this.a6).d1(C0, true, true);
                    return false;
                }
                int D0 = this.Q5.D0();
                if ("🎰".equals(this.Q5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        rja rjaVar = (rja) ny8Var;
                        if (rjaVar.V0 == null && !rjaVar.W0) {
                            int i = D0 - 1;
                            int S = rja.S(i & 3);
                            int S2 = rja.S((i >> 2) & 3);
                            int S3 = rja.S(i >> 4);
                            if (S == 4 && S2 == 4 && S3 == 4) {
                                S = 5;
                                S3 = 5;
                                S2 = 5;
                            }
                            rjaVar.c1 = S;
                            rjaVar.d1 = S2;
                            rjaVar.e1 = S3;
                            k27 messageObject = getMessageObject();
                            int i2 = getMessageObject().K1;
                            rjaVar.W0 = true;
                            gb2Var = this;
                            Utilities.e.c(new m05(rjaVar, o0, i2, messageObject, gb2Var, z, (byte) 4));
                        } else {
                            gb2Var = this;
                        }
                        if (gb2Var.Q5.N3()) {
                            ny8Var.N(Integer.MAX_VALUE, gb2Var.Bb);
                        }
                        gb2Var.Q5.n1 = false;
                    } else {
                        gb2Var = this;
                    }
                    if (ny8Var.n0 == null && !ny8Var.Z0 && o0.documents.size() > 0) {
                        rja rjaVar2 = (rja) ny8Var;
                        if (rjaVar2.n0 == null && !rjaVar2.Z0) {
                            rjaVar2.Z0 = true;
                            Utilities.e.c(new i57(rjaVar2, o0, gb2Var.getMessageObject().K1, gb2Var.getMessageObject(), gb2Var, (byte) 24));
                            return true;
                        }
                    }
                } else {
                    if (ny8Var.n0 == null && !ny8Var.Z0 && o0.documents.size() > 0) {
                        TLRPC.Document document = o0.documents.get(0);
                        ba4.G(this.a6);
                        File J = ba4.J(document, null, true, true);
                        if (ny8Var.n0 == null && !ny8Var.Z0) {
                            final String v2 = gl.v2(J, 0);
                            if (TextUtils.isEmpty(v2)) {
                                up3.q(this.a6).a(ba4.r(null, document), this.Q5, this);
                                ba4.G(this.a6).X(document, o0, 1, 1);
                            } else {
                                ny8Var.Z0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3 = 0;
                                        switch (r3) {
                                            case 0:
                                                final ny8 ny8Var2 = ny8Var;
                                                String str = v2;
                                                if (ny8Var2.X0) {
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b = r2;
                                                            ny8 ny8Var3 = ny8Var2;
                                                            switch (b) {
                                                                case 0:
                                                                    ny8Var3.Z0 = false;
                                                                    if (!ny8Var3.W0 && ny8Var3.X0) {
                                                                        ny8Var3.x(true);
                                                                        return;
                                                                    }
                                                                    ny8Var3.g();
                                                                    ny8Var3.D();
                                                                    ny8Var3.s();
                                                                    return;
                                                                default:
                                                                    ny8Var3.W0 = false;
                                                                    if (!ny8Var3.Z0 && ny8Var3.X0) {
                                                                        ny8Var3.x(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ny8Var2.V0 = RLottieNative.b(str, null, null, null);
                                                if (ny8Var2.V0 != null) {
                                                    i3 = ny8Var2.V0.a[0];
                                                }
                                                if (ny8Var2.V0 != null) {
                                                    int i4 = ny8Var2.V0.a[1];
                                                }
                                                gl.c3(new on7(ny8Var2, i3, (byte) 9));
                                                return;
                                            default:
                                                final ny8 ny8Var3 = ny8Var;
                                                ny8Var3.n0 = RLottieNative.b(v2, ny8Var3.e, null, null);
                                                gl.c3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        byte b = r2;
                                                        ny8 ny8Var32 = ny8Var3;
                                                        switch (b) {
                                                            case 0:
                                                                ny8Var32.Z0 = false;
                                                                if (!ny8Var32.W0 && ny8Var32.X0) {
                                                                    ny8Var32.x(true);
                                                                    return;
                                                                }
                                                                ny8Var32.g();
                                                                ny8Var32.D();
                                                                ny8Var32.s();
                                                                return;
                                                            default:
                                                                ny8Var32.W0 = false;
                                                                if (!ny8Var32.Z0 && ny8Var32.X0) {
                                                                    ny8Var32.x(true);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                        }
                                    }
                                });
                            }
                        }
                        up3.q(this.a6).v(this);
                    }
                    if (D0 >= 0 && D0 < o0.documents.size()) {
                        if (!z && this.Q5.N3() && (x97Var = (x97) na7.q1(this.a6).A3.get(C0)) != null && x97Var.b == D0) {
                            ny8Var.N(x97Var.a, this.Bb);
                        }
                        TLRPC.Document document2 = o0.documents.get(Math.max(D0, 0));
                        ba4.G(this.a6);
                        File J2 = ba4.J(document2, null, true, true);
                        if (ny8Var.V0 == null && !ny8Var.W0) {
                            final String v22 = gl.v2(J2, 0);
                            if (TextUtils.isEmpty(v22)) {
                                up3.q(this.a6).a(ba4.r(null, document2), this.Q5, this);
                                ba4.G(this.a6).X(document2, o0, 1, 1);
                                this.Q5.n1 = false;
                            } else {
                                if (z && ny8Var.R == null && ny8Var.S == null && ny8Var.Q == null) {
                                    ny8Var.K = (byte) 2;
                                    ny8Var.Y0 = true;
                                }
                                ny8Var.W0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3 = 0;
                                        switch (r3) {
                                            case 0:
                                                final ny8 ny8Var2 = ny8Var;
                                                String str = v22;
                                                if (ny8Var2.X0) {
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b = r2;
                                                            ny8 ny8Var32 = ny8Var2;
                                                            switch (b) {
                                                                case 0:
                                                                    ny8Var32.Z0 = false;
                                                                    if (!ny8Var32.W0 && ny8Var32.X0) {
                                                                        ny8Var32.x(true);
                                                                        return;
                                                                    }
                                                                    ny8Var32.g();
                                                                    ny8Var32.D();
                                                                    ny8Var32.s();
                                                                    return;
                                                                default:
                                                                    ny8Var32.W0 = false;
                                                                    if (!ny8Var32.Z0 && ny8Var32.X0) {
                                                                        ny8Var32.x(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ny8Var2.V0 = RLottieNative.b(str, null, null, null);
                                                if (ny8Var2.V0 != null) {
                                                    i3 = ny8Var2.V0.a[0];
                                                }
                                                if (ny8Var2.V0 != null) {
                                                    int i4 = ny8Var2.V0.a[1];
                                                }
                                                gl.c3(new on7(ny8Var2, i3, (byte) 9));
                                                return;
                                            default:
                                                final ny8 ny8Var3 = ny8Var;
                                                ny8Var3.n0 = RLottieNative.b(v22, ny8Var3.e, null, null);
                                                gl.c3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        byte b = r2;
                                                        ny8 ny8Var32 = ny8Var3;
                                                        switch (b) {
                                                            case 0:
                                                                ny8Var32.Z0 = false;
                                                                if (!ny8Var32.W0 && ny8Var32.X0) {
                                                                    ny8Var32.x(true);
                                                                    return;
                                                                }
                                                                ny8Var32.g();
                                                                ny8Var32.D();
                                                                ny8Var32.s();
                                                                return;
                                                            default:
                                                                ny8Var32.W0 = false;
                                                                if (!ny8Var32.Z0 && ny8Var32.X0) {
                                                                    ny8Var32.x(true);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                        }
                                    }
                                });
                            }
                        }
                        up3.q(this.a6).v(this);
                        this.Q5.n1 = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        gb2 gb2Var;
        ArrayList arrayList;
        bb2 bb2Var = this.eb;
        int i2 = 0;
        if (bb2Var != null && bb2Var.y2(i)) {
            return false;
        }
        if (i == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                E0(false);
                return true;
            } else if (this.Q5.D == 16) {
                this.eb.s2(this, this.S3, this.T3);
                return true;
            } else {
                D0();
                return true;
            }
        }
        if (i == 2131296267) {
            F0();
        } else if (i == 2131296264) {
            bb2 bb2Var2 = this.eb;
            if (bb2Var2 != null) {
                if (this.Q5.D == 16) {
                    bb2Var2.A(this, 0.0f, 0.0f);
                } else {
                    bb2Var2.s2(this, this.S3, this.T3);
                }
            }
        } else {
            if (i == 2131296265) {
                bb2 bb2Var3 = this.eb;
                if (bb2Var3 != null) {
                    TLRPC.Chat chat = this.Ga;
                    if (chat != null) {
                        gb2Var = this;
                        bb2Var3.i2(gb2Var, chat, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                    } else {
                        gb2Var = this;
                        TLRPC.User user = gb2Var.Ea;
                        if (user != null) {
                            bb2Var3.c0(gb2Var, user, gb2Var.h1, gb2Var.i1);
                        } else if (gb2Var.Ha != null) {
                            bb2Var3.c1(gb2Var);
                        }
                    }
                }
            } else {
                gb2Var = this;
                if (i == 2131296270) {
                    bb2 bb2Var4 = gb2Var.eb;
                    if (bb2Var4 != null) {
                        bb2Var4.J(gb2Var);
                    }
                } else if (i == 2131296263 && gb2Var.eb != null && (arrayList = gb2Var.Q5.B2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        h27 h27Var = (h27) obj;
                        if (h27Var.O) {
                            gb2Var.eb.D1(h27Var);
                            break;
                        }
                    }
                }
            }
            if ((!k27.Q4(gb2Var.Q5.k) || gb2Var.Q5.g4() || (gb2Var.Q5.I3() && MediaController.w().D(gb2Var.Q5))) && gb2Var.F4.g(null, i, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        gb2Var = this;
        if (!k27.Q4(gb2Var.Q5.k)) {
        }
        return true;
    }

    @Override
    public final void q() {
        bb2 bb2Var;
        if (this.Q5 != null) {
            Runnable runnable = this.Pc;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.Qc;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.b6 || (this.L != null && s2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.ic && (bb2Var = this.eb) != null) {
                bb2Var.c();
            }
        }
    }

    public void q1(Canvas canvas, float f, Integer num) {
        boolean z;
        boolean z2 = this.Kb;
        float f2 = 1.0f;
        i19 i19Var = this.O;
        if (z2) {
            i19Var.a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.V4 && m2()) {
            if (i19Var.a > 0.0f) {
                z();
            }
            if (getAlpha() * f != 1.0f) {
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f * 255.0f), 31);
                z = true;
            } else {
                z = false;
            }
            int i = (i19Var.a > 0.0f ? 1 : (i19Var.a == 0.0f ? 0 : -1));
            nb2 nb2Var = this.ub;
            if (i <= 0 && nb2Var.x0 && this.M == null && !this.Kb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + nb2Var.j0);
                i19Var.A = 0.0f;
                i19Var.B = false;
                if (nb2Var.h) {
                    f2 = nb2Var.L1;
                }
                i19Var.d(canvas, f2, num);
                canvas.restore();
            } else {
                i19Var.A = 0.0f;
                i19Var.B = false;
                if (nb2Var.h) {
                    f2 = nb2Var.L1;
                }
                i19Var.d(canvas, f2, num);
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public final void q3(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            lg7 lg7Var = this.Mc;
            nb2 nb2Var = this.ub;
            if (lg7Var != null && lg7Var.h) {
                this.Uc = 0.0f;
            } else {
                float f = i2 + i4 + nb2Var.j0;
                this.Uc = f - ((int) f);
            }
            drawable.setBounds((int) (i + nb2Var.h0), (int) (i2 + nb2Var.k0), (int) (i + i3 + nb2Var.i0), (int) (i2 + i4 + nb2Var.j0));
            if (drawable == this.L6) {
                this.I8.set(drawable.getBounds());
            }
        }
    }

    @Override
    public final boolean r() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.r():boolean");
    }

    public final int r0(k27 k27Var, f27 f27Var, boolean z) {
        f27 f27Var2 = f27Var;
        ml mlVar = this.U0;
        mlVar.p0 = true;
        ImageReceiver imageReceiver = this.A7;
        imageReceiver.p0 = true;
        ImageReceiver imageReceiver2 = this.T7;
        imageReceiver2.p0 = true;
        ImageReceiver imageReceiver3 = this.F7;
        imageReceiver3.p0 = true;
        int i = 0;
        if (f27Var2 != null) {
            ArrayList arrayList = f27Var2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != f27Var2.f.size()) {
                    f27Var2.a();
                }
                this.td = 0;
                int i2 = 0;
                while (i < arrayList.size()) {
                    k27 k27Var2 = (k27) arrayList.get(i);
                    c27 d = f27Var2.d(k27Var2);
                    if (d != null && (d.l & 1) != 0) {
                        y3(k27Var2, f27Var2, false, false, false, false);
                        if (z && !TextUtils.isEmpty(this.p3)) {
                            S3();
                            this.td = (int) (i2 + this.t3);
                            this.ud = this.m3;
                        }
                        i2 = this.v0 + this.x0 + i2;
                    }
                    i++;
                    f27Var2 = f27Var;
                }
                return i2;
            }
        }
        y3(k27Var, f27Var, false, false, false, false);
        mlVar.p0 = false;
        imageReceiver.p0 = false;
        imageReceiver2.p0 = false;
        imageReceiver3.p0 = false;
        S3();
        return this.v0 + this.x0;
    }

    public final boolean r1(Canvas canvas) {
        boolean z = this.Kb;
        float f = 1.0f;
        i19 i19Var = this.O;
        if (z) {
            i19Var.a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z2 = false;
        if (!this.V4 || !m2()) {
            return false;
        }
        if (i19Var.a > 0.0f) {
            z();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z2 = true;
        }
        int i = (i19Var.a > 0.0f ? 1 : (i19Var.a == 0.0f ? 0 : -1));
        nb2 nb2Var = this.ub;
        if (i <= 0 && nb2Var.x0 && this.M == null && !this.Kb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + nb2Var.j0);
            if (nb2Var.h) {
                f = nb2Var.L1;
            }
            i19Var.e(canvas, f);
            canvas.restore();
        } else {
            if (nb2Var.h) {
                f = nb2Var.L1;
            }
            i19Var.e(canvas, f);
        }
        if (z2) {
            canvas.restore();
        }
        return true;
    }

    public final void r2() {
        bb2 bb2Var = this.eb;
        if (bb2Var != null && bb2Var.l()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void r3() {
        this.y6 = true;
        this.z6 = 1000;
        this.B6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(gb2 gb2Var) {
        if (gb2Var == null) {
            return;
        }
        gb2Var.f6 = this.f6;
        gb2Var.s6 = this.s6;
        gb2Var.h6 = this.h6;
        gb2Var.i6 = this.i6;
        gb2Var.j6 = this.j6;
        gb2Var.k6 = this.k6;
        gb2Var.l6 = this.l6;
        gb2Var.m6 = this.m6;
        gb2Var.n6 = this.n6;
        gb2Var.o6 = this.o6;
        gb2Var.p6 = this.p6;
        gb2Var.q6 = this.q6;
        gb2Var.t6 = this.t6;
        gb2Var.u6 = this.u6;
        gb2Var.v6 = this.v6;
        gb2Var.W6 = this.W6;
        gb2Var.X6 = this.X6;
        gb2Var.Y6 = this.Y6;
        gb2Var.Z6 = this.Z6;
        gb2Var.a7 = this.a7;
    }

    public final void s1(Canvas canvas, rh9 rh9Var, float f, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (rh9Var != null && f > 0.0f && rh9Var.B()) {
            if (f < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.o0, this.u0);
            rh9Var.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean s2() {
        if (this.u4.a <= 0 && this.O.p) {
            k27 k27Var = this.Q5;
            if (k27Var == null || !k27Var.t1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void s3(byte[] bArr) {
        k27 k27Var = this.R5;
        if (k27Var == null) {
            k27Var = this.Q5;
        }
        if (k27Var == null) {
            this.o3 = null;
            return;
        }
        zx8 zx8Var = this.o3;
        if (zx8Var == null || !zx8Var.f || !Arrays.equals(zx8Var.g, bArr)) {
            this.o3 = new zx8(this, k27Var.e1(), bArr);
        }
        this.B0 = true;
    }

    public void setAllowAssistant(boolean z) {
        this.K6 = z;
    }

    @Override
    public void setAlpha(float f) {
        boolean z;
        boolean z2 = false;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (getAlpha() == 1.0f) {
            z2 = true;
        }
        if (z != z2) {
            invalidate();
        }
        if (this.sb) {
            this.tb = f;
            invalidate();
        } else {
            super.setAlpha(f);
        }
        c27 c27Var = this.M;
        if ((c27Var != null && (c27Var.c != 0 || c27Var.a != 0)) || ((this.y && !k27.Q4(this.Q5.k)) || this.Q7 == null || this.R7 == null)) {
            c27 c27Var2 = this.M;
            if (c27Var2 != null) {
                int i = c27Var2.l;
                if ((i & 8) == 0 || (i & 1) == 0) {
                    return;
                }
            }
            this.O.getClass();
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f) {
        if (this.wd != f) {
            this.wd = f;
            d4();
        }
    }

    public void setAvatar(k27 k27Var) {
        if (k27Var != null) {
            if (!this.G6 && !g2()) {
                this.xa = null;
                return;
            }
            Drawable drawable = k27Var.m2;
            ImageReceiver imageReceiver = this.A7;
            if (drawable != null) {
                imageReceiver.g0(drawable);
                return;
            }
            TLRPC.User user = this.va;
            pb0 pb0Var = this.B7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.xa = userProfilePhoto.photo_small;
                } else {
                    this.xa = null;
                }
                pb0Var.q(user);
                imageReceiver.V(this.va, pb0Var, null, e66.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.wa;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.xa = chatPhoto.photo_small;
                } else {
                    this.xa = null;
                }
                if (chat.signature_profiles && k27.B0(k27Var.k) != 1271266957) {
                    long n = cf3.n(k27Var.k.from_id);
                    int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                    int i2 = k27Var.K1;
                    if (i >= 0) {
                        TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
                        pb0Var.q(V1);
                        imageReceiver.U(V1, pb0Var, null);
                        return;
                    }
                    TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
                    pb0Var.p(K0);
                    imageReceiver.U(K0, pb0Var, null);
                    return;
                }
                pb0Var.p(this.wa);
                imageReceiver.U(this.wa, pb0Var, null);
            } else if (k27Var.q4()) {
                TLRPC.Photo photo = k27Var.V0;
                if (photo != null) {
                    imageReceiver.d0(gl5.i(ba4.w(photo.sizes, gl.L(50.0f), false, null, true), k27Var.V0), "50_50", pb0Var, null, null, 0);
                }
            } else {
                this.xa = null;
                pb0Var.j(k27Var.Z0(), null, null, null);
                imageReceiver.d0(null, null, pb0Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(bb2 bb2Var) {
        this.eb = bb2Var;
    }

    public void setDrawSelectionBackground(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z) {
        this.y = z;
        invalidate();
    }

    public void setFullyDraw(boolean z) {
        this.K0 = z;
    }

    public void setHideSideButtonByQuickShare(boolean z) {
        if (this.Q8 != z) {
            this.Q8 = z;
            boolean z2 = this.b6;
            this.b6 = true;
            invalidate();
            this.b6 = z2;
        }
    }

    public void setHighlighted(boolean z) {
        if (this.x6 != z) {
            this.x6 = z;
            if (z) {
                this.o3 = null;
                this.y6 = false;
                this.z6 = 0;
            } else {
                this.B6 = System.currentTimeMillis();
                this.y6 = true;
                this.z6 = 300;
            }
            X3();
            if (this.C4) {
                this.E4.o = A2();
            } else {
                this.D4.p = A2();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        x3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInstantButtonPressed(boolean z) {
        n41 n41Var = this.H2;
        if (n41Var == null) {
            n41Var = new n41(this);
            this.H2 = n41Var;
        }
        this.G2 = z;
        n41Var.c(z);
    }

    public void setInvalidateListener(Runnable runnable) {
        this.Qc = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z) {
        this.n0 = z;
    }

    public void setInvalidatesParent(boolean z) {
        this.b6 = z;
    }

    public void setIsUpdating(boolean z) {
        this.P0 = true;
    }

    public void setMessageObjectInternal(defpackage.k27 r68) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.setMessageObjectInternal(k27):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Pc = runnable;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        X3();
        if (this.C4) {
            this.E4.o = A2();
        } else {
            this.D4.p = A2();
        }
        invalidate();
    }

    public void setResourcesProvider(wjb wjbVar) {
        this.cc = wjbVar;
        RadialProgress2 radialProgress2 = this.Q0;
        if (radialProgress2 != null) {
            radialProgress2.F = wjbVar;
        }
        RadialProgress2 radialProgress22 = this.R0;
        if (radialProgress22 != null) {
            radialProgress22.F = wjbVar;
        }
        uk9 uk9Var = this.d3;
        if (uk9Var != null) {
            uk9Var.n = wjbVar;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.yd = rectF;
    }

    @Override
    public void setScrimHidden(boolean z) {
        tb4.a(this, z);
    }

    public void setScrimReaction(Integer num) {
        this.O.z = num;
    }

    public void setSelectedBackgroundProgress(float f) {
        this.lb = f;
        invalidate();
    }

    public void setShowTopic(boolean z) {
        if (this.Xc != z) {
            this.Xc = z;
            r2();
            invalidate();
        }
    }

    public void setSlidingOffset(float f) {
        if (this.vd != f) {
            this.vd = f;
            d4();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.fc;
            if (i >= arrayList.size()) {
                break;
            }
            ((qla) arrayList.get(i)).invalidateSelf();
            i++;
        }
        i27 i27Var = this.m3;
        if (i27Var != null && i27Var.e != null) {
            for (int i2 = 0; i2 < this.m3.e.size(); i2++) {
                h27 h27Var = (h27) this.m3.e.get(i2);
                for (int i3 = 0; i3 < h27Var.y.size(); i3++) {
                    ((qla) h27Var.y.get(i3)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            for (int i4 = 0; i4 < getMessageObject().B2.size(); i4++) {
                h27 h27Var2 = (h27) getMessageObject().B2.get(i4);
                for (int i5 = 0; i5 < h27Var2.y.size(); i5++) {
                    ((qla) h27Var2.y.get(i5)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f) {
        this.k4 = f;
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public final void t0(gb2 gb2Var) {
        pla plaVar;
        if (gb2Var != null && (plaVar = gb2Var.ca) != null) {
            int i = (Integer) plaVar.k.get(gb2Var);
            if (i == null) {
                i = 0;
            }
            this.da = i;
            pla plaVar2 = this.ca;
            if (plaVar2 != null) {
                plaVar2.k.put(this, i);
            }
        }
    }

    public final void t1(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        float f7;
        float f8;
        float f9;
        float f10;
        if (this.Lb) {
            f = gl.L(4.0f);
        } else {
            f = 0.0f;
        }
        boolean z2 = true;
        if (MediaController.w().D(this.Q5) && MediaController.w().C()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.Tb) {
            z2 = false;
        }
        float f11 = this.Nb;
        if (z) {
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                this.Nb = f12;
                if (f12 > 1.0f) {
                    this.Nb = 1.0f;
                } else {
                    invalidate();
                }
            }
        } else if (f11 != 0.0f) {
            float f13 = f11 - 0.10666667f;
            this.Nb = f13;
            if (f13 < 0.0f) {
                this.Nb = 0.0f;
            } else {
                invalidate();
            }
        }
        float f14 = this.Ob;
        if (z2) {
            if (f14 != 1.0f) {
                float f15 = f14 + 0.10666667f;
                this.Ob = f15;
                if (f15 > 1.0f) {
                    this.Ob = 1.0f;
                } else {
                    invalidate();
                }
            }
        } else if (f14 != 0.0f) {
            float f16 = f14 - 0.10666667f;
            this.Ob = f16;
            if (f16 < 0.0f) {
                this.Ob = 0.0f;
            } else {
                invalidate();
            }
        }
        if (z) {
            f2 = gl.H.getInterpolation(this.Nb);
        } else {
            f2 = this.Nb;
        }
        nb2 nb2Var = this.ub;
        if (nb2Var.l2) {
            boolean z3 = this.Lb;
            float f17 = nb2Var.L1;
            if (!z3) {
                f17 = 1.0f - f17;
            }
            f = gl.L(4.0f) * f17;
        }
        float L = (gl.L(16.0f) * f2) + f;
        int i2 = (this.Nb > 0.0f ? 1 : (this.Nb == 0.0f ? 0 : -1));
        ml mlVar = this.U0;
        if (i2 > 0) {
            float f18 = mlVar.N0 / 2.0f;
            vk9 vk9Var = bkb.tm;
            if (vk9Var == null) {
                vk9Var = new vk9((byte) 0, false);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, 0, bm2.o(-16777216, 40)}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                vk9Var.b = radialGradient;
                Paint paint = new Paint();
                vk9Var.c = paint;
                vk9Var.d = new Matrix();
                paint.setShader(radialGradient);
                bkb.tm = vk9Var;
            }
            float r = mlVar.r();
            float s = mlVar.s();
            float f19 = this.Nb;
            Paint paint2 = (Paint) vk9Var.c;
            f5 = 255.0f;
            Matrix matrix = (Matrix) vk9Var.d;
            f3 = 2.0f;
            f4 = 0.10666667f;
            if (((int) r) + (((int) s) << 12) + (((int) f18) << 24) != 0) {
                matrix.reset();
                float f20 = f18 / 100.0f;
                matrix.setTranslate(r, s);
                matrix.preScale(f20, f20);
                ((RadialGradient) vk9Var.b).setLocalMatrix(matrix);
            }
            paint2.setAlpha((int) (f19 * 255.0f));
            canvas.drawCircle(r, s, f18, paint2);
        } else {
            f3 = 2.0f;
            f4 = 0.10666667f;
            f5 = 255.0f;
        }
        float N = gl.N(1.5f) + mlVar.L0 + L;
        float N2 = gl.N(1.5f) + mlVar.M0 + L;
        float w = (mlVar.w() - gl.N(1.5f)) - L;
        float x = (mlVar.x() - gl.N(1.5f)) - L;
        RectF rectF = this.c4;
        rectF.set(N, N2, w, x);
        if (this.Mb == 1.0f && (this.R1 || getVideoTranscriptionProgress() <= 0.0f)) {
            i = -1;
        } else {
            int alpha = bkb.j2.getAlpha();
            Paint paint3 = bkb.j2;
            float f21 = this.Mb;
            if (!this.R1) {
                f6 = 1.0f - getVideoTranscriptionProgress();
            } else {
                f6 = 1.0f;
            }
            paint3.setAlpha((int) (f21 * f6 * alpha));
            i = alpha;
        }
        rac racVar = this.ac;
        if (racVar != null && racVar.j) {
            float f22 = mlVar.L0;
            float f23 = mlVar.M0;
            racVar.setBounds((int) f22, (int) f23, (int) (f22 + mlVar.N0), (int) (f23 + mlVar.O0));
            this.ac.draw(canvas);
        }
        int alpha2 = bkb.j2.getAlpha();
        float strokeWidth = bkb.j2.getStrokeWidth();
        if (this.Mb == 1.0f) {
            f7 = this.Q5.b0;
        } else {
            f7 = this.Wb;
        }
        if (f2 > 0.0f) {
            float width = rectF.width() / f3;
            bkb.j2.setStrokeWidth((0.5f * strokeWidth * this.Nb) + strokeWidth);
            bkb.j2.setAlpha((int) (alpha2 * this.Nb * 0.3f));
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), width, bkb.j2);
            bkb.j2.setAlpha(alpha2);
            double d = ((-360.0f) * f7) + 180.0f;
            f8 = 0.0f;
            float f24 = f2;
            double d2 = width;
            this.Rb = (float) ((Math.sin(Math.toRadians(d)) * d2) + rectF.centerX());
            this.Sb = (float) ((Math.cos(Math.toRadians(d)) * d2) + rectF.centerY());
            bkb.l2.setColor(-1);
            Paint paint4 = bkb.l2;
            float min = Math.min(1.0f, f24) * f5;
            if (!this.R1) {
                f10 = 1.0f - getVideoTranscriptionProgress();
            } else {
                f10 = 1.0f;
            }
            paint4.setAlpha((int) (min * f10));
            canvas.drawCircle(this.Rb, this.Sb, (gl.L(3.0f) * this.Ob) + (gl.L(5.0f) * f24) + gl.L(3.0f), bkb.l2);
        } else {
            f8 = 0.0f;
        }
        float f25 = this.Vb;
        if (f25 != f8) {
            float f26 = f25 - f4;
            this.Vb = f26;
            if (f26 < f8) {
                f9 = f8;
                this.Vb = f9;
            } else {
                f9 = f8;
                invalidate();
            }
        } else {
            f9 = f8;
        }
        if (this.Vb != f9) {
            if (i == -1) {
                i = bkb.j2.getAlpha();
            }
            float f27 = alpha2;
            bkb.j2.setAlpha((int) ((1.0f - this.Vb) * f27));
            canvas.drawArc(rectF, -90.0f, f7 * 360.0f, false, bkb.j2);
            bkb.j2.setAlpha((int) (f27 * this.Vb));
            canvas.drawArc(rectF, -90.0f, this.Ub * 360.0f, false, bkb.j2);
            i = i;
        } else {
            canvas.drawArc(rectF, -90.0f, f7 * 360.0f, false, bkb.j2);
        }
        if (i != -1) {
            bkb.j2.setAlpha(i);
        }
        bkb.j2.setStrokeWidth(strokeWidth);
    }

    public final void t2() {
        if (this.L != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void t3(CharacterStyle characterStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        k27 k27Var = this.R5;
        if (k27Var == null) {
            k27Var = this.Q5;
        }
        this.B0 = false;
        ArrayList arrayList = this.x4;
        if (k27Var != null && k27Var.k.message != null && characterStyle != null) {
            if (this.m3 != null && !TextUtils.isEmpty(k27Var.z)) {
                CharSequence charSequence = k27Var.z;
                if (charSequence instanceof Spannable) {
                    Spanned spanned = (Spanned) charSequence;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length > 0) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i4 = spanned.getSpanStart(characterStyle);
                                i3 = spanned.getSpanEnd(characterStyle);
                                break;
                            }
                        }
                    }
                    i3 = -1;
                    i4 = -1;
                    if (i4 >= 0 && i3 >= 0) {
                        int i5 = i3 - i4;
                        for (int i6 = 0; i6 < this.m3.e.size(); i6++) {
                            h27 h27Var = (h27) this.m3.e.get(i6);
                            if (i4 >= h27Var.n && i4 < h27Var.r) {
                                this.A0 = i6;
                                this.B0 = false;
                                j3();
                                try {
                                    b46 c3 = c3();
                                    c3.d(h27Var.e, i4, 0.0f);
                                    h27Var.e.getSelectionPath(i4, i3, c3);
                                    if (i3 >= h27Var.n + i5) {
                                        for (int i7 = i6 + 1; i7 < this.m3.e.size(); i7++) {
                                            h27 h27Var2 = (h27) this.m3.e.get(i7);
                                            int i8 = h27Var2.r - h27Var2.n;
                                            b46 c32 = c3();
                                            c32.d(h27Var2.e, 0, h27Var2.w);
                                            h27Var2.e.getSelectionPath(0, i3 - h27Var2.n, c32);
                                            if (i3 < (h27Var.n + i8) - 1) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                invalidate();
                                return;
                            }
                        }
                    }
                }
            }
            CharSequence charSequence2 = k27Var.v;
            if ((charSequence2 instanceof Spanned) && k27Var.B2 != null) {
                Spanned spanned2 = (Spanned) charSequence2;
                CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
                if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                    for (CharacterStyle characterStyle3 : characterStyleArr2) {
                        if (characterStyle3 == characterStyle) {
                            i2 = spanned2.getSpanStart(characterStyle);
                            i = spanned2.getSpanEnd(characterStyle);
                            break;
                        }
                    }
                }
                i = -1;
                i2 = -1;
                if (i2 >= 0 && i >= 0) {
                    int i9 = i - i2;
                    for (int i10 = 0; i10 < k27Var.B2.size(); i10++) {
                        h27 h27Var3 = (h27) k27Var.B2.get(i10);
                        if (i2 >= h27Var3.n && i2 < h27Var3.r) {
                            this.A0 = i10;
                            this.B0 = false;
                            j3();
                            try {
                                b46 c33 = c3();
                                c33.d(h27Var3.e, i2, 0.0f);
                                h27Var3.e.getSelectionPath(i2, i, c33);
                                if (i >= h27Var3.n + i9) {
                                    for (int i11 = i10 + 1; i11 < k27Var.B2.size(); i11++) {
                                        h27 h27Var4 = (h27) k27Var.B2.get(i11);
                                        int i12 = h27Var4.r - h27Var4.n;
                                        b46 c34 = c3();
                                        c34.d(h27Var4.e, 0, h27Var4.w);
                                        h27Var4.e.getSelectionPath(0, i - h27Var4.n, c34);
                                        if (i < (h27Var3.n + i12) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            invalidate();
                            return;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.A0 = -1;
                this.B0 = false;
                j3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.A0 = -1;
            this.B0 = false;
            j3();
            invalidate();
        }
    }

    public final void u0(gb2 gb2Var) {
        gb2Var.D3(this.Cc, this.Ec, this.Fc, this.Gc, this.Hc, this.L0, this.M0, this.pb, this.qb, this.Dc);
    }

    public final void u1(Canvas canvas, Integer num, float f, boolean z) {
        c27 c27Var = this.M;
        if (c27Var != null) {
            int i = c27Var.l;
            if ((i & 8) == 0 || (i & 1) == 0) {
                return;
            }
        }
        i19 i19Var = this.O;
        i19Var.getClass();
        i19Var.A = f;
        i19Var.B = z;
        i19Var.d(canvas, this.ub.L1, num);
    }

    public final boolean u2() {
        f27 f27Var;
        if (v2() && (f27Var = this.L) != null && this.M != null && !f27Var.b && !f27Var.i) {
            return true;
        }
        return false;
    }

    public final void u3(int i) {
        k27 k27Var = this.R5;
        if (k27Var == null) {
            k27Var = this.Q5;
        }
        if (k27Var == null) {
            this.o3 = null;
            return;
        }
        zx8 zx8Var = this.o3;
        if (zx8Var == null || !zx8Var.e || zx8Var.c != (-i)) {
            this.o3 = new zx8(this, k27Var.e1(), i);
        }
        this.B0 = true;
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        k27 k27Var = this.Q5;
        if (k27Var != null && imageReceiver == this.U0 && k27Var.J2()) {
            this.eb.Y(this.Q5);
        }
    }

    public final void v0() {
        if (this.k7 == null) {
            this.k7 = new ImageReceiver[3];
            this.l7 = new pb0[3];
            this.m7 = new boolean[3];
            int i = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.k7;
                if (i < imageReceiverArr.length) {
                    imageReceiverArr[i] = new ImageReceiver(this);
                    this.k7[i].q0(gl.L(12.0f));
                    this.l7[i] = new pb0((wjb) null);
                    this.l7[i].s(gl.L(18.0f));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v1(at1 at1Var, Canvas canvas, int i, Integer num, float f) {
        c27 c27Var = this.M;
        if (c27Var != null) {
            int i2 = c27Var.l;
            if ((i2 & 8) == 0 || (i2 & 1) == 0) {
                return;
            }
        }
        i19 i19Var = this.O;
        i19Var.getClass();
        i19Var.A = f;
        i19Var.f(at1Var, canvas, i, num);
    }

    public final boolean v2() {
        k27 k27Var;
        if (w2() && (k27Var = this.Q5) != null && !k27Var.O3()) {
            return true;
        }
        return false;
    }

    public final void v3(String str) {
        w3(false, -1, str, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        ff0 ff0Var;
        wd8 wd8Var;
        id8 id8Var;
        cb2 cb2Var;
        cb2 cb2Var2;
        cb2 cb2Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.J2;
            if (drawable != drawableArr[0] && drawable != this.y3 && drawable != drawableArr[1]) {
                jb2 jb2Var = this.Y0;
                if (jb2Var != null) {
                    ff0Var = jb2Var.x;
                } else {
                    ff0Var = null;
                }
                if (drawable == ff0Var || drawable == this.V2 || drawable == this.Wa || ((drawable != null && (((cb2Var = this.tc) != null && drawable == cb2Var.k) || (((cb2Var2 = this.uc) != null && drawable == cb2Var2.k) || ((cb2Var3 = this.ad) != null && drawable == cb2Var3.k)))) || ((this.O != null && (drawable instanceof gn)) || (drawable instanceof r86)))) {
                    return true;
                }
                mb2 mb2Var = this.x2;
                if (mb2Var == null || (id8Var = mb2Var.l) == null || (drawable != id8Var && drawable != id8Var.a)) {
                    ArrayList arrayList = this.Q4;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        fb2 fb2Var = (fb2) obj;
                        if (fb2Var.w != drawable && ((wd8Var = fb2Var.x) == null || (drawable != wd8Var && drawable != wd8Var.a && drawable != wd8Var.b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final int w0(int i, k27 k27Var) {
        TLRPC.Document F0;
        TLRPC.WebPage webPage;
        boolean z;
        int i2;
        ra2 ra2Var;
        ra2 ra2Var2;
        int i3 = i;
        TLRPC.MessageMedia messageMedia = k27Var.a1;
        TLRPC.PhotoSize photoSize = null;
        if (messageMedia != null) {
            F0 = messageMedia.document;
            this.N1 = F0;
        } else if (k27Var.D == 0) {
            TLRPC.MessageMedia n1 = k27.n1(k27Var.k);
            if (n1 == null) {
                webPage = null;
            } else {
                webPage = n1.webpage;
            }
            if (webPage == null) {
                F0 = null;
            } else {
                F0 = webPage.document;
            }
            this.N1 = F0;
        } else {
            F0 = k27Var.F0();
            this.N1 = F0;
        }
        int i4 = 0;
        if (F0 != null) {
            double d = 0.0d;
            if (k27.P4(F0)) {
                F1();
                this.M1 = (byte) 3;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.N1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.N1.attributes.get(i5);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i5++;
                }
                Typeface typeface = gl.a;
                bkb.M2.measureText("00:00");
                this.V6 = i3 - gl.L(18.0f);
                Z2(k27Var);
                int L = gl.L(174.0f) + this.M9;
                if (!this.R1) {
                    this.b7 = Math.min(i3, L + ((int) Math.ceil(bkb.M2.measureText(gl.g0((int) d, true, false)))));
                }
                this.E4.m = k27Var;
                return 0;
            } else if (k27.J4(this.N1)) {
                this.M1 = (byte) 4;
                if (!k27Var.l5()) {
                    W3();
                    String i0 = gl.i0(this.N1.size, false, false);
                    this.f3 = (int) Math.ceil(bkb.B2.measureText(i0));
                    this.e3 = new StaticLayout(i0, bkb.B2, this.f3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (k27.J3(this.N1)) {
                F1();
                this.M1 = (byte) 5;
                int L2 = i3 - gl.L(92.0f);
                if (L2 < 0) {
                    L2 = gl.L(100.0f);
                }
                int i6 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(k27Var.y1(true).replace('\n', ' '), bkb.N2, i6 - gl.L(12.0f), truncateAt);
                ra2 ra2Var3 = this.K4;
                TextPaint textPaint = bkb.N2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                ra2Var3.d = new StaticLayout(ellipsize, textPaint, i6, alignment, 1.0f, 0.0f, false);
                if (this.K4.d.getLineCount() > 0) {
                    this.K4.e = -((int) Math.ceil(ra2Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.K4.d.getLineWidth(0);
                    if (gl.L(104.0f) + lineWidth > this.b7) {
                        this.b7 = gl.L(104.0f) + lineWidth;
                    }
                }
                this.K4.f = new StaticLayout(TextUtils.ellipsize(k27Var.w1(true).replace('\n', ' '), bkb.O2, i6, truncateAt), bkb.O2, i6, alignment, 1.0f, 0.0f, false);
                if (this.K4.f.getLineCount() > 0) {
                    this.K4.g = -((int) Math.ceil(ra2Var.f.getLineLeft(0)));
                    int lineWidth2 = (int) this.K4.f.getLineWidth(0);
                    if (gl.L(104.0f) + lineWidth2 > this.b7) {
                        this.b7 = gl.L(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i4 >= this.N1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.N1.attributes.get(i4);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i4++;
                }
                int i7 = (int) d;
                int ceil = (int) Math.ceil(bkb.M2.measureText(gl.k0(i7, i7)));
                this.V6 = this.b7 - gl.L(28.0f);
                return ceil;
            } else if (k27.s3(this.N1, k27Var.z2())) {
                this.M1 = (byte) 2;
                if (!k27Var.l5()) {
                    String M0 = k96.M0(2131753968, "AttachGif");
                    this.C3 = (int) Math.ceil(bkb.B2.measureText(M0));
                    TextPaint textPaint2 = bkb.B2;
                    int i8 = this.C3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.x3 = new StaticLayout(M0, textPaint2, i8, alignment2, 1.0f, 0.0f, false);
                    String i02 = gl.i0(this.N1.size, false, false);
                    this.f3 = (int) Math.ceil(bkb.B2.measureText(i02));
                    this.e3 = new StaticLayout(i02, bkb.B2, this.f3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.N1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.N1.mime_type.toLowerCase().startsWith("video/mp4"))) || k27.W2(this.N1)) {
                    z = true;
                } else {
                    z = false;
                }
                this.O1 = z;
                if (!z) {
                    i3 += gl.L(30.0f);
                }
                int i9 = i3;
                this.M1 = (byte) 1;
                String B = ba4.B(this.N1);
                if (B.length() == 0) {
                    B = k96.M0(2131753972, "AttachDocument");
                }
                StaticLayout c = lwa.c(B, bkb.F2, i9, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i9, 2, false);
                this.e3 = c;
                this.g3 = Integer.MIN_VALUE;
                if (c != null && c.getLineCount() > 0) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.e3.getLineCount(); i11++) {
                        i10 = Math.max(i10, (int) Math.ceil(this.e3.getLineWidth(i11)));
                        this.g3 = Math.max(this.g3, (int) Math.ceil(-this.e3.getLineLeft(i11)));
                    }
                    i2 = Math.min(i9, i10);
                } else {
                    this.g3 = 0;
                    i2 = i9;
                }
                int min = Math.min(i9 - gl.L(30.0f), (int) Math.ceil(bkb.B2.measureText("000.0 mm / ".concat(gl.i0(this.N1.size, false, false)))));
                this.C3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(gl.i0(this.N1.size, false, false) + " " + ba4.A(this.N1), bkb.B2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.C3 < 0) {
                        this.C3 = gl.L(10.0f);
                    }
                    this.x3 = new StaticLayout(ellipsize2, bkb.B2, this.C3 + gl.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (this.O1) {
                    this.e4 = ba4.w(k27Var.p0, 320, false, null, false);
                    this.f4 = ba4.w(k27Var.p0, 40, false, null, false);
                    if (this.Q5.x3() || (up3.q(this.a6).l() & 1) == 0) {
                        this.e4 = null;
                    }
                    TLRPC.PhotoSize photoSize2 = this.e4;
                    if (photoSize2 != null && photoSize2 != this.f4) {
                        BitmapDrawable bitmapDrawable = this.Q5.I1;
                        if (bitmapDrawable != null) {
                            this.f4 = null;
                            this.g4 = bitmapDrawable;
                        }
                        photoSize = photoSize2;
                    } else {
                        this.e4 = null;
                        ml mlVar = this.U0;
                        mlVar.G0 = true;
                        mlVar.H0 = true;
                    }
                    this.h4 = "86_86_b";
                    this.U0.Z(gl5.f(photoSize, k27Var.n0), "86_86", gl5.f(this.f4, k27Var.n0), this.h4, this.g4, 0L, null, k27Var, 1);
                }
                return i2;
            }
        }
        return 0;
    }

    public final void w1(Canvas canvas, RectF rectF, float f) {
        String str;
        z();
        if (this.U8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f, f, c2(str));
        if (i2()) {
            canvas.drawRoundRect(rectF, f, f, bkb.g2);
        }
    }

    public final boolean w2() {
        k27 k27Var = this.Q5;
        if (k27Var != null) {
            return k27Var.P2();
        }
        return bkb.g1(this.cc);
    }

    public final boolean w3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.w3(boolean, int, java.lang.String, boolean):boolean");
    }

    public final boolean x() {
        if (this.Q5.t2() && !this.Q5.O0 && this.Y9 == 0.0f && this.V0.n() != null) {
            return false;
        }
        return true;
    }

    public final void x1(Canvas canvas, boolean z) {
        float f;
        float f2;
        boolean z2;
        int i;
        float f3;
        float L;
        float f4;
        f27 f27Var;
        if ((!this.Q8 || z) && this.R8 != 0) {
            c27 c27Var = this.M;
            if (c27Var == null || (f27Var = this.L) == null || !f27Var.i || c27Var.h) {
                boolean O3 = this.Q5.O3();
                nb2 nb2Var = this.ub;
                if (O3) {
                    float L2 = nb2Var.j1 - gl.L(40.0f);
                    this.d9 = L2;
                    f27 f27Var2 = this.L;
                    if (f27Var2 != null) {
                        this.d9 = (f27Var2.m.e - this.wd) + L2;
                    }
                } else {
                    float L3 = gl.L(8.0f) + nb2Var.k1;
                    this.d9 = L3;
                    f27 f27Var3 = this.L;
                    if (f27Var3 != null) {
                        this.d9 = (f27Var3.m.g - this.wd) + L3;
                    }
                    if (v2()) {
                        this.d9 = Math.min(this.d9, getCompactRight() - gl.L(32.0f));
                    }
                }
                float f5 = 0.0f;
                if (this.R8 == 4) {
                    this.e9 = gl.L(6.0f);
                } else {
                    float L4 = (this.e7 + nb2Var.j0) - gl.L(41.0f);
                    this.e9 = L4;
                    k27 k27Var = this.Q5;
                    if (k27Var.D == 19 && k27Var.v2 < this.N9) {
                        L4 -= gl.L(22.0f);
                        this.e9 = L4;
                    }
                    f27 f27Var4 = this.L;
                    if (f27Var4 != null) {
                        e27 e27Var = f27Var4.m;
                        float f6 = L4 + e27Var.h;
                        this.e9 = f6;
                        if (e27Var.j) {
                            this.e9 = f6 - getTranslationY();
                        }
                    }
                    if (this.Q5.N5()) {
                        i19 i19Var = this.O;
                        i19Var.getClass();
                        if (this.Kb) {
                            this.e9 -= (1.0f - getVideoTranscriptionProgress()) * i19Var.i(nb2Var.L1);
                        } else if (i19Var.a > 0.0f) {
                            this.e9 -= i19Var.i(nb2Var.L1);
                        }
                    }
                }
                if (this.R8 != 4) {
                    float L5 = ((this.e7 + nb2Var.j0) - gl.L(32.0f)) / 2.0f;
                    if (this.e9 < L5) {
                        this.e9 = L5;
                    }
                }
                if (this.Q5.D == 19) {
                    if (this.R8 == 3 && this.n7 != null) {
                        this.e9 = gl.L(18.0f);
                    } else {
                        this.e9 = 0.0f;
                    }
                }
                if (!this.Q5.O3() && this.Kb && !this.R1) {
                    if (this.G6) {
                        L = (gl.b3(this.X6, w2()) - gl.u) * 0.7f;
                    } else {
                        L = gl.L(50.0f);
                    }
                    if (this.Lb) {
                        f4 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f4 = 0.0f;
                    }
                    if (this.Lb) {
                        f5 = gl.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (nb2Var.l2) {
                        boolean z3 = this.Lb;
                        float f7 = nb2Var.L1;
                        if (!z3) {
                            f7 = 1.0f - f7;
                        }
                        f4 = (1.0f - getVideoTranscriptionProgress()) * f7 * L;
                        boolean z4 = this.Lb;
                        float f8 = nb2Var.L1;
                        if (!z4) {
                            f8 = 1.0f - f8;
                        }
                        f5 = (1.0f - getVideoTranscriptionProgress()) * f8 * gl.L(28.0f);
                    }
                    this.d9 -= f4;
                    this.e9 -= f5;
                    if (v2()) {
                        float compactRight = getCompactRight() - gl.L(32.0f);
                        this.d9 = gl.R1(Math.min(this.U0.w() + gl.L(8.0f), compactRight), Math.min(this.d9 + f4, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.S8 = true;
                if (this.R8 == 3) {
                    if (!this.y || k27.Q4(this.Q5.k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!cja.l0) {
                    float f9 = this.d9;
                    float f10 = this.e9;
                    float L6 = gl.L(32.0f) + f9;
                    float f11 = this.e9;
                    if (this.T8 == 5) {
                        f = 64.0f;
                    } else {
                        f = 32.0f;
                    }
                    RectF rectF = this.c4;
                    rectF.set(f9, f10, L6, f11 + gl.L(f));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.S8 = false;
                        return;
                    }
                    int i2 = (int) ((1.0f - this.E.e) * 255.0f);
                    if (i2 != 255) {
                        float f12 = this.d9;
                        f2 = 32.0f;
                        z2 = false;
                        i = canvas.saveLayerAlpha(f12, this.e9, gl.L(32.0f) + f12, this.e9 + gl.L(64.0f), i2);
                    } else {
                        f2 = 32.0f;
                        z2 = false;
                        i = -1;
                    }
                    z();
                    String str = "paintChatActionBackground";
                    if (this.R8 == 4 && this.T8 == 5 && this.U8) {
                        Path path = this.Z8;
                        if (path == null) {
                            this.Z8 = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.a9;
                        if (path2 == null) {
                            this.a9 = new Path();
                        } else {
                            path2.rewind();
                        }
                        boolean z5 = z2;
                        if (this.b9 == null) {
                            float[] fArr = new float[8];
                            this.b9 = fArr;
                            f3 = 2.0f;
                            float L7 = gl.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z5 ? 1 : 0] = L7;
                        } else {
                            f3 = 2.0f;
                        }
                        if (this.c9 == null) {
                            this.c9 = r3;
                            float L8 = gl.L(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, L8, L8, L8, L8};
                        }
                        RectF rectF2 = gl.P;
                        float f13 = this.d9;
                        rectF2.set(f13, this.e9, gl.L(f2) + f13, this.e9 + gl.L(f2));
                        Path path3 = this.Z8;
                        float[] fArr3 = this.b9;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.d9, this.e9 + gl.L(f2), this.d9 + gl.L(f2), this.e9 + gl.L(64.0f));
                        this.a9.addRoundRect(rectF2, this.c9, direction);
                        byte b = this.X8;
                        Path path4 = this.Z8;
                        if (b == 4) {
                            canvas.drawPath(path4, c2("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.a9, c2("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(path4, c2("paintChatActionBackground"));
                            canvas.drawPath(this.a9, c2("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        f3 = 2.0f;
                        float L9 = gl.L(16.0f);
                        float L10 = gl.L(16.0f);
                        if (this.U8) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, L9, L10, c2(str));
                    }
                    if (i2()) {
                        canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), bkb.g2);
                    }
                    byte b2 = this.R8;
                    if (b2 == 2) {
                        Drawable b22 = b2("drawableGoIcon");
                        hf0.u(b22, (this.d9 + gl.L(16.0f)) - (b22.getIntrinsicWidth() / f3), (this.e9 + gl.L(16.0f)) - (b22.getIntrinsicHeight() / f3));
                        b22.draw(canvas);
                    } else {
                        float f14 = this.d9;
                        if (b2 == 4) {
                            int L11 = (int) (f14 + gl.L(16.0f));
                            int L12 = (int) (this.e9 + gl.L(16.0f));
                            Drawable b23 = b2("drawableCloseIcon");
                            int intrinsicWidth = b23.getIntrinsicWidth() / 2;
                            int intrinsicHeight = b23.getIntrinsicHeight() / 2;
                            b23.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                            hf0.u(b23, this.d9 + gl.L(4.0f), this.e9 + gl.L(4.0f));
                            canvas.save();
                            canvas.scale(0.65f, 0.65f, b23.getBounds().centerX(), b23.getBounds().centerY());
                            b23.draw(canvas);
                            canvas.restore();
                            if (this.T8 == 5) {
                                Drawable b24 = b2("drawableMoreIcon");
                                int intrinsicWidth2 = b24.getIntrinsicWidth() / 2;
                                int intrinsicHeight2 = b24.getIntrinsicHeight() / 2;
                                b24.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                                hf0.u(b24, this.d9 + gl.L(4.0f), this.e9 + gl.L(34.0f));
                                b24.draw(canvas);
                            }
                        } else {
                            int L13 = (int) (f14 + gl.L(16.0f));
                            int L14 = (int) (this.e9 + gl.L(16.0f));
                            Drawable b25 = b2("drawableShareIcon");
                            int intrinsicWidth3 = b25.getIntrinsicWidth() / 2;
                            int intrinsicHeight3 = b25.getIntrinsicHeight() / 2;
                            b25.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                            hf0.u(b25, this.d9 + gl.L(4.0f), this.e9 + gl.L(4.0f));
                            b25.draw(canvas);
                        }
                    }
                    if (i != -1) {
                        canvas.restoreToCount(i);
                    }
                }
            }
        }
    }

    public final boolean x2() {
        k27 k27Var;
        int i;
        if (v2() && !this.F && (i = (k27Var = this.Q5).D) != 16 && i != 27 && !k27Var.g3() && !this.Q5.q4()) {
            k27 k27Var2 = this.Q5;
            if (k27Var2.G != null || k27Var2.Z0() != 0 || this.Q5.k.post) {
                c27 c27Var = this.M;
                if (c27Var == null || (c27Var.l & 4) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void x3(float f, float f2, float f3, float f4) {
        ml mlVar = this.U0;
        mlVar.i0(f, f2, f3, f4);
        byte b = this.M1;
        if (b != 4 && b != 2) {
            return;
        }
        this.M3 = (int) (mlVar.L0 + gl.L(8.0f));
        int L = (int) (mlVar.M0 + gl.L(8.0f));
        this.N3 = L;
        int i = this.M3;
        int L2 = gl.L(24.0f) + this.N3;
        this.R0.p(i, L, gl.L(24.0f) + i, L2);
        this.K3 = (int) oo1.z(mlVar.N0, gl.L(48.0f), 2.0f, f);
        int z = (int) oo1.z(mlVar.O0, gl.L(48.0f), 2.0f, mlVar.M0);
        this.L3 = z;
        int i2 = this.K3;
        int i3 = this.L3;
        this.Q0.p(i2, z, gl.L(48.0f) + i2, gl.L(48.0f) + i3);
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.y():void");
    }

    public final void y0() {
        float f;
        float f2;
        int i;
        int measureText;
        boolean z;
        if (this.u2) {
            B0(0);
        }
        if (this.u2 && this.r2 == null) {
            this.D2 = gl.L(33.0f);
            CharSequence charSequence = this.z2;
            if (charSequence == null) {
                byte b = this.y2;
                if (b == 12) {
                    charSequence = k96.M0(2131747615, null);
                } else if (b == 1) {
                    charSequence = k96.M0(2131747619, null);
                } else if (b == 29) {
                    charSequence = k96.M0(2131747616, null);
                } else if (b == 13) {
                    charSequence = k96.M0(2131745409, null).toUpperCase();
                } else if (b == 32) {
                    charSequence = k96.M0(2131747593, null).toUpperCase();
                } else if (b == 85) {
                    charSequence = k96.M0(2131747623, null);
                } else if (b == 10) {
                    charSequence = k96.M0(2131747620, null);
                } else if (b == 2) {
                    charSequence = k96.M0(2131747607, null);
                } else if (b == 3) {
                    charSequence = k96.M0(2131747594, null);
                } else if (b == 5) {
                    charSequence = k96.M0(2131743314, null);
                } else if (b == 6) {
                    charSequence = k96.M0(2131747621, null);
                } else if (b == 7) {
                    charSequence = k96.M0(2131747591, null);
                } else if (b != 9 && b != 11) {
                    if (b == 25) {
                        charSequence = k96.M0(2131743125, null);
                    } else if (b == 14) {
                        charSequence = k96.M0(2131743316, null).toUpperCase();
                    } else if (b == 15) {
                        charSequence = k96.M0(2131752906, null).toUpperCase();
                    } else if (b == 16) {
                        charSequence = k96.M0(2131747596, null).toUpperCase();
                    } else if (b == 17) {
                        charSequence = k96.M0(2131743299, null).toUpperCase();
                    } else if (b != 18 && b != 22) {
                        if (b == 19) {
                            charSequence = k96.M0(2131753343, null);
                        } else if (b == 20) {
                            charSequence = k96.M0(2131747611, null);
                        } else if (b == 21) {
                            charSequence = k96.M0(2131754227, null);
                        } else if (b == 23) {
                            charSequence = k96.M0(2131747592, null);
                        } else if (b == 24) {
                            charSequence = k96.M0(2131747614, null);
                        } else if (b == 26) {
                            TL_stars.StarGift starGift = this.Hd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.a6).getCurrentTime()) {
                                    charSequence = k96.M0(2131747608, null);
                                    z = false;
                                } else {
                                    if (this.Hd.sold_out) {
                                        charSequence = k96.M0(2131747609, null);
                                    } else {
                                        charSequence = k96.M0(2131747610, null);
                                    }
                                    z = true;
                                }
                                if (z) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new cm2(2131231119, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = k96.M0(2131747590, null);
                            }
                        } else if (b == 27) {
                            charSequence = k96.M0(2131748888, null).toUpperCase();
                        } else if (b == 28) {
                            charSequence = k96.M0(2131743315, null);
                        } else {
                            charSequence = k96.M0(2131749001, null);
                        }
                    } else {
                        charSequence = k96.M0(2131753613, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) k27.n1(this.Q5.k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = k96.M0(2131743124, null);
                    } else {
                        charSequence = k96.M0(2131743125, null);
                    }
                }
            }
            if (this.Q5.q4() && this.b7 < (measureText = (int) (bkb.L2.measureText(charSequence, 0, charSequence.length()) + gl.L(75.0f)))) {
                this.b7 = measureText;
            }
            int L = this.b7 - gl.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, bkb.L2, L, TextUtils.TruncateAt.END), bkb.L2, gl.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.r2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f3 = 0.0f;
            if (lineCount > 0) {
                f = this.r2.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.s2 = f;
            if (this.r2.getLineCount() > 0) {
                f3 = this.r2.getLineLeft(0);
            }
            this.t2 = f3;
            int i2 = this.b7;
            byte b2 = this.y2;
            if (b2 != 82 && b2 != 81 && b2 != 80 && b2 != 84 && b2 != 83) {
                f2 = 34.0f;
            } else {
                f2 = 13.0f;
            }
            this.D2 = i2 - gl.L(f2);
            int L2 = gl.L(46.0f) + this.v0;
            this.v0 = L2;
            if (this.Q5.D == 12) {
                this.v0 = gl.L(14.0f) + L2;
            }
            if (this.Q5.q4()) {
                this.v0 = gl.L(2.0f) + this.v0;
            }
            StaticLayout staticLayout2 = this.r2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.D2 - Math.ceil(this.r2.getLineWidth(0)))) / 2;
                if (this.y2 == 0) {
                    i = gl.L(8.0f);
                } else {
                    i = 0;
                }
                this.B2 = ceil + i;
                int lineLeft = (int) this.r2.getLineLeft(0);
                this.C2 = lineLeft;
                this.B2 += -lineLeft;
            }
        }
    }

    public final void y1(Canvas canvas, Path path, float f, int i) {
        if (f <= 0.0f) {
            return;
        }
        RectF rectF = this.fd;
        path.computeBounds(rectF, false);
        float f2 = (0.25f * f) + 0.75f;
        canvas.save();
        canvas.scale(f2, f2, rectF.centerX(), rectF.centerY());
        this.gd.setColor(bkb.p1(f * 0.2f, i));
        this.gd.setPathEffect(b46.c());
        canvas.drawPath(path, this.gd);
        canvas.restore();
    }

    public final boolean y2() {
        if (this.Q5 != null && this.L == null && !this.B5 && x2() && H2()) {
            return true;
        }
        return false;
    }

    public final void y3(defpackage.k27 r116, defpackage.f27 r117, boolean r118, boolean r119, boolean r120, boolean r121) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.y3(k27, f27, boolean, boolean, boolean, boolean):void");
    }

    public final void z() {
        A(getX(), this.nb, getMeasuredWidth(), this.ob);
    }

    public final void z0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb2.z0(long, long):void");
    }

    public final void z1(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, float f2, float f3, float f4, boolean z6, boolean z7) {
        float photoBottom;
        float f5;
        float f6;
        float f7;
        int L;
        int L2;
        int i;
        Drawable b2;
        Drawable drawable;
        int v0;
        float f8;
        k27 k27Var;
        boolean z8 = (f4 == 1.0f || z6) ? false : true;
        float f9 = (f4 * 0.5f) + 0.5f;
        float f10 = z8 ? f * f4 : f;
        if (this.M1 != 7 || ((k27Var = this.Q5) != null && k27Var.f4())) {
            photoBottom = getPhotoBottom() + this.w0;
        } else {
            photoBottom = f3 - ((1.0f - getVideoTranscriptionProgress()) * (this.O.i(this.ub.L1) + gl.L(this.K ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - gl.L(8.5f);
        k27 k27Var2 = this.Q5;
        float L4 = (k27Var2 == null || !k27Var2.M2()) ? 0.0f : gl.L(-6.0f);
        float f11 = 22.0f;
        if (z3) {
            xf7 xf7Var = bkb.D3;
            if (I3()) {
                if (this.Q5.O5()) {
                    f5 = 1.0f;
                    v0 = bkb.v0(bkb.Yc, this.cc);
                    int i2 = this.d7;
                    f8 = z5 ? 24.0f : 22.0f;
                    xf7Var.getClass();
                    f7 = 4.0f;
                    hf0.u(xf7Var, ((i2 - gl.L(f8)) - gl.L(12.0f)) + L4, (L3 - gl.L(12.0f)) + f2);
                    xf7Var.setAlpha((int) (this.k4 * 255.0f * f10));
                } else {
                    f5 = 1.0f;
                    f7 = 4.0f;
                    v0 = bkb.v0(bkb.jd, this.cc);
                    int i3 = this.d7;
                    f8 = z5 ? 24.0f : 22.0f;
                    xf7Var.getClass();
                    hf0.u(xf7Var, ((i3 - gl.L(f8)) - gl.L(12.0f)) + L4, (L3 - gl.L(12.0f)) + f2);
                    xf7Var.setAlpha((int) (f10 * 255.0f));
                }
                f6 = 18.5f;
            } else {
                f5 = 1.0f;
                f7 = 4.0f;
                v0 = bkb.v0(bkb.Db, this.cc);
                xf7Var.getClass();
                f6 = 18.5f;
                hf0.u(xf7Var, (this.d7 - gl.L(18.5f)) - gl.L(12.0f), ((f3 - gl.L(8.5f)) - gl.L(12.0f)) + f2);
                xf7Var.setAlpha((int) (f10 * 255.0f));
            }
            xf7Var.a(v0);
            if (z8) {
                canvas.save();
                canvas.scale(f9, f9, xf7Var.getBounds().centerX(), xf7Var.getBounds().centerY());
            }
            xf7Var.draw(canvas);
            xf7Var.setAlpha(255);
            if (z8) {
                canvas.restore();
            }
            invalidate();
        } else {
            f5 = 1.0f;
            f6 = 18.5f;
            f7 = 4.0f;
        }
        if (z2) {
            if (I3()) {
                if (z6) {
                    canvas.save();
                }
                if (this.Q5.O5()) {
                    drawable = b2("drawableMsgStickerCheck");
                    if (z) {
                        if (z6) {
                            canvas.translate(gl.L(4.8f) * (f5 - f4), 0.0f);
                        }
                        hf0.u(drawable, ((this.d7 - gl.L(z5 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f2);
                    } else {
                        hf0.u(drawable, ((this.d7 - gl.L(z5 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f2);
                    }
                    drawable.setAlpha((int) (this.k4 * 255.0f * f10));
                } else {
                    if (z) {
                        if (z6) {
                            canvas.translate((f5 - f4) * gl.L(4.8f), 0.0f);
                        }
                        hf0.u(bkb.E3, (this.d7 - gl.L(z5 ? 28.3f : 26.3f)) - bkb.E3.getIntrinsicWidth(), (L3 - bkb.E3.getIntrinsicHeight()) + f2);
                    } else {
                        hf0.u(bkb.E3, (this.d7 - gl.L(z5 ? 23.5f : 21.5f)) - bkb.E3.getIntrinsicWidth(), (L3 - bkb.E3.getIntrinsicHeight()) + f2);
                    }
                    bkb.E3.setAlpha((int) (this.k4 * 255.0f * f10));
                    drawable = bkb.E3;
                }
                if (z8) {
                    canvas.save();
                    canvas.scale(f9, f9, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                if (z8) {
                    canvas.restore();
                }
                if (z6) {
                    canvas.restore();
                }
                drawable.setAlpha(255);
            } else {
                if (z6) {
                    canvas.save();
                }
                if (z) {
                    if (z6) {
                        canvas.translate((f5 - f4) * gl.L(f7), 0.0f);
                    }
                    b2 = b2(z7 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    hf0.u(b2, ((this.d7 - gl.L(22.5f)) - b2.getIntrinsicWidth()) + L4, ((f3 - gl.L((this.G || this.F) ? 9.0f : 8.0f)) - b2.getIntrinsicHeight()) + f2);
                } else {
                    b2 = b2(z7 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    hf0.u(b2, ((this.d7 - gl.L(f6)) - b2.getIntrinsicWidth()) + L4, ((f3 - gl.L((this.G || this.F) ? 9.0f : 8.0f)) - b2.getIntrinsicHeight()) + f2);
                }
                b2.setAlpha((int) (f10 * 255.0f));
                if (z8) {
                    canvas.save();
                    canvas.scale(f9, f9, b2.getBounds().centerX(), b2.getBounds().centerY());
                }
                b2.draw(canvas);
                if (z8) {
                    canvas.restore();
                }
                if (z6) {
                    canvas.restore();
                }
                b2.setAlpha(255);
            }
        }
        if (z) {
            if (I3()) {
                Drawable b22 = this.Q5.O5() ? b2("drawableMsgStickerHalfCheck") : bkb.F3;
                hf0.u(b22, ((this.d7 - gl.L(z5 ? 23.5f : 21.5f)) - b22.getIntrinsicWidth()) + L4, (L3 - b22.getIntrinsicHeight()) + f2);
                b22.setAlpha((int) (this.k4 * 255.0f * f10));
                if (z8 || z6) {
                    canvas.save();
                    canvas.scale(f9, f9, b22.getBounds().centerX(), b22.getBounds().centerY());
                }
                b22.draw(canvas);
                if (z8 || z6) {
                    canvas.restore();
                }
                b22.setAlpha(255);
            } else {
                Drawable b23 = b2(z7 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                hf0.u(b23, (this.d7 - gl.L(18.0f)) - b23.getIntrinsicWidth(), ((f3 - gl.L((this.G || this.F) ? 9.0f : 8.0f)) - b23.getIntrinsicHeight()) + f2);
                b23.setAlpha((int) (f10 * 255.0f));
                if (z8 || z6) {
                    canvas.save();
                    canvas.scale(f9, f9, b23.getBounds().centerX(), b23.getBounds().centerY());
                }
                b23.draw(canvas);
                if (z8 || z6) {
                    canvas.restore();
                }
                b23.setAlpha(255);
            }
        }
        if (z4) {
            boolean I3 = I3();
            int i4 = this.d7;
            if (I3) {
                L = i4 - gl.L(34.5f);
                L2 = gl.L(26.5f);
            } else {
                L = i4 - gl.L(32.0f);
                if (!this.G && !this.F) {
                    f11 = 21.0f;
                }
                L2 = gl.L(f11);
            }
            float f12 = (f3 - L2) + f2;
            RectF rectF = this.c4;
            rectF.set((int) (L + L4), f12, gl.L(14.0f) + i, gl.L(14.0f) + f12);
            int alpha = bkb.a2.getAlpha();
            bkb.a2.setAlpha((int) (alpha * f10));
            canvas.drawRoundRect(rectF, gl.L(f5), gl.L(f5), bkb.a2);
            bkb.a2.setAlpha(alpha);
            hf0.u(bkb.i4, gl.L(6.0f) + i, f12 + gl.L(2.0f));
            bkb.i4.setAlpha((int) (f10 * 255.0f));
            if (z8) {
                canvas.save();
                canvas.scale(f9, f9, bkb.i4.getBounds().centerX(), bkb.i4.getBounds().centerY());
            }
            bkb.i4.draw(canvas);
            bkb.i4.setAlpha(255);
            if (z8) {
                canvas.restore();
            }
        }
    }

    public final boolean z2(k27 k27Var) {
        int i = k27.n1(this.Q5.k).period;
        int currentTime = ConnectionsManager.getInstance(this.a6).getCurrentTime();
        if (i == Integer.MAX_VALUE) {
            return false;
        }
        if (i % 60 == 0) {
            if (Math.abs(currentTime - k27Var.k.date) <= i) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - k27Var.k.date) <= i - 5) {
            return false;
        } else {
            return true;
        }
    }

    public void z3(k27 k27Var, f27 f27Var, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.O0) {
            y3(k27Var, f27Var, z, z2, z3, z4);
            return;
        }
        this.R5 = k27Var;
        this.S5 = f27Var;
        this.U5 = z;
        this.T5 = z2;
        this.V5 = z3;
        this.W5 = z4;
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }

    @Override
    public final void F(float f, int i) {
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        bb2 bb2Var;
        if (this.Q5 != null) {
            Runnable runnable = this.Pc;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.Qc;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate(i, i2, i3, i4);
            if (this.b6 && getParent() != null) {
                ((View) getParent()).invalidate(((int) getX()) + i, ((int) getY()) + i2, ((int) getX()) + i3, ((int) getY()) + i4);
            }
            if (!this.ic || (bb2Var = this.eb) == null) {
                return;
            }
            bb2Var.c();
        }
    }

    public void setBackgroundTopY(int i) {
        int i2;
        int i3;
        m17 m17Var = this.L6;
        int i4 = this.L0;
        int i5 = this.M0;
        if (i5 == 0) {
            i4 = getParentWidth();
            i5 = gl.q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i3 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                float f = this.N0;
                m17Var.p((int) (i + f), i3, i2, (int) f, this.pb, this.qb, this.F, (this.G && this.ub.A0 == 1.0f) ? false : true);
                m17Var.u = j2();
            }
        }
        i2 = i5;
        i3 = i4;
        float f2 = this.N0;
        m17Var.p((int) (i + f2), i3, i2, (int) f2, this.pb, this.qb, this.F, (this.G && this.ub.A0 == 1.0f) ? false : true);
        m17Var.u = j2();
    }

    public gb2(Context context, int i) {
        this(context, i, false, null, null);
    }
}
