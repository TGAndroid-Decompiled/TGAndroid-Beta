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
public class rc2 extends hg0 implements zw9, ln5, cr3, nkb, jm7, g94, mk5, au5 {
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
    public hd8 A8;
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
    public final pc0 B7;
    public boolean B8;
    public int B9;
    public String Ba;
    public final hc2 Bb;
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
    public tm Ca;
    public int Cb;
    public int Cc;
    public Paint Cd;
    public final Rect D0;
    public byte D1;
    public int D2;
    public uib D3;
    public final ic2 D4;
    public int D5;
    public boolean D6;
    public boolean D7;
    public boolean D8;
    public int D9;
    public tm Da;
    public int Db;
    public int Dc;
    public float Dd;
    public final fn0 E;
    public int E0;
    public float E1;
    public boolean E2;
    public uib E3;
    public final gx9 E4;
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
    public uib F3;
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
    public u51 H2;
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
    public final hc2 Ib;
    public n50 Ic;
    public boolean J;
    public boolean J0;
    public int J1;
    public final Drawable[] J2;
    public boolean J3;
    public bc2 J4;
    public fc2 J5;
    public int J6;
    public Drawable J7;
    public final RectF J8;
    public float J9;
    public boolean Ja;
    public final SparseArray Jb;
    public e7a Jc;
    public boolean K;
    public boolean K0;
    public long K1;
    public final kc2[] K2;
    public int K3;
    public cc2 K4;
    public int K5;
    public boolean K6;
    public Drawable K7;
    public final Path K8;
    public float K9;
    public boolean Ka;
    public boolean Kb;
    public boolean Kc;
    public f47 L;
    public int L0;
    public long L1;
    public final int[] L2;
    public int L3;
    public StaticLayout L4;
    public boolean L5;
    public m37 L6;
    public int L7;
    public final float[] L8;
    public StaticLayout L9;
    public boolean La;
    public boolean Lb;
    public boolean Lc;
    public c47 M;
    public int M0;
    public byte M1;
    public final RectF M2;
    public int M3;
    public double M4;
    public boolean M5;
    public m37 M6;
    public boolean M7;
    public ln M8;
    public int M9;
    public cn Ma;
    public float Mb;
    public oi7 Mc;
    public boolean N;
    public float N0;
    public TLRPC.Document N1;
    public final int[] N2;
    public int N3;
    public int N4;
    public int N5;
    public int N6;
    public boolean N7;
    public b66 N8;
    public int N9;
    public cn Na;
    public float Nb;
    public boolean Nc;
    public final l39 O;
    public boolean O0;
    public boolean O1;
    public float O2;
    public int O3;
    public int O4;
    public rna O5;
    public int O6;
    public boolean O7;
    public qa6 O8;
    public int O9;
    public cn Oa;
    public float Ob;
    public final dc2 Oc;
    public final ay4 P;
    public boolean P0;
    public in3 P1;
    public SpannableStringBuilder P2;
    public boolean P3;
    public final ArrayList P4;
    public boolean P5;
    public int P6;
    public CheckBoxBase P7;
    public ArrayList P8;
    public int P9;
    public cn Pa;
    public float Pb;
    public Runnable Pc;
    public final cy4 Q;
    public final RadialProgress2 Q0;
    public int Q1;
    public boolean Q2;
    public boolean Q3;
    public final ArrayList Q4;
    public k47 Q5;
    public int Q6;
    public StaticLayout Q7;
    public boolean Q8;
    public CharSequence Q9;
    public cn Qa;
    public long Qb;
    public Runnable Qc;
    public boolean R;
    public final RadialProgress2 R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public float R4;
    public k47 R5;
    public int R6;
    public StaticLayout R7;
    public byte R8;
    public boolean R9;
    public u51 Ra;
    public float Rb;
    public int Rc;
    public long S;
    public boolean S0;
    public boolean S1;
    public long S2;
    public int S3;
    public int S4;
    public f47 S5;
    public boolean S6;
    public final AtomicReference S7;
    public boolean S8;
    public boolean S9;
    public u51 Sa;
    public float Sb;
    public int Sc;
    public uib T;
    public final int[] T0;
    public boolean T1;
    public boolean T2;
    public int T3;
    public int T4;
    public boolean T5;
    public z5c T6;
    public final ImageReceiver T7;
    public byte T8;
    public Paint T9;
    public u51 Ta;
    public boolean Tb;
    public boolean Tc;
    public b66 U;
    public final mm U0;
    public boolean U1;
    public int U2;
    public int U3;
    public float U4;
    public boolean U5;
    public z5c U6;
    public int U7;
    public boolean U8;
    public Path U9;
    public float Ua;
    public float Ub;
    public float Uc;
    public CornerPathEffect V;
    public final ImageReceiver V0;
    public boolean V1;
    public fg0 V2;
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
    public fg0 Wa;
    public float Wb;
    public Drawable Wc;
    public final pc0 X0;
    public int X1;
    public boolean X2;
    public int X3;
    public boolean X4;
    public dd5 X5;
    public boolean X6;
    public int X7;
    public byte X8;
    public rna X9;
    public Path Xa;
    public int Xb;
    public boolean Xc;
    public uc2 Y0;
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
    public ndb Yc;
    public oc1 Z0;
    public int Z1;
    public fg0 Z2;
    public boolean Z3;
    public boolean Z4;
    public final int Z5;
    public float Z6;
    public int Z7;
    public Path Z8;
    public float Z9;
    public final RectF Za;
    public final s34 Zb;
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
    public ucc ac;
    public nc2 ad;
    public uib b0;
    public p09 b1;
    public int b2;
    public fg0 b3;
    public final RectF b4;
    public boolean b5;
    public boolean b6;
    public int b7;
    public int b8;
    public float[] b9;
    public float ba;
    public float bb;
    public jc2 bc;
    public StaticLayout bd;
    public b66 c0;
    public Paint c1;
    public int c2;
    public boolean c3;
    public final RectF c4;
    public boolean c5;
    public int c6;
    public boolean c7;
    public boolean c8;
    public float[] c9;
    public qna ca;
    public float cb;
    public ylb cc;
    public String cd;
    public CornerPathEffect d0;
    public Paint d1;
    public float d2;
    public final vm9 d3;
    public TLObject d4;
    public int d5;
    public byte[] d6;
    public int d7;
    public boolean d8;
    public float d9;
    public Integer da;
    public int db;
    public final boolean dc;
    public b66 dd;
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
    public mc2 eb;
    public final mx6 ec;
    public final Path ed;
    public boolean f;
    public bwb f0;
    public u1b f1;
    public int f2;
    public int f3;
    public TLRPC.PhotoSize f4;
    public boolean f5;
    public boolean f6;
    public CheckBoxBase[] f7;
    public boolean f8;
    public float f9;
    public float[] fa;
    public final f37 fb;
    public final ArrayList fc;
    public final RectF fd;
    public int g0;
    public boolean g1;
    public StaticLayout g2;
    public int g3;
    public BitmapDrawable g4;
    public boolean g5;
    public boolean g6;
    public lp5 g7;
    public boolean g8;
    public float g9;
    public final float ga;
    public int gb;
    public final Stack gc;
    public Paint gd;
    public boolean h;
    public kdb h0;
    public float h1;
    public StaticLayout h2;
    public boolean h3;
    public String h4;
    public float h5;
    public boolean h6;
    public qa6 h7;
    public ln h8;
    public StaticLayout h9;
    public float ha;
    public int hb;
    public final Path hc;
    public int hd;
    public int i0;
    public float i1;
    public float i2;
    public wc2 i3;
    public String i4;
    public int i5;
    public boolean i6;
    public float i7;
    public float i8;
    public int i9;
    public float ia;
    public int ib;
    public boolean ic;
    public i47 id;
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
    public lx6 jc;
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
    public final dc2 kc;
    public boolean kd;
    public u51 l0;
    public CheckBoxBase l1;
    public float l2;
    public int l3;
    public float l4;
    public int l5;
    public boolean l6;
    public pc0[] l7;
    public int l8;
    public boolean l9;
    public String la;
    public float lb;
    public final dc2 lc;
    public long ld;
    public tm m0;
    public CheckBoxBase m1;
    public boolean m2;
    public i47 m3;
    public long m4;
    public uqb m5;
    public boolean m6;
    public boolean[] m7;
    public Drawable m8;
    public StaticLayout m9;
    public rna ma;
    public boolean mb;
    public long mc;
    public long md;
    public int n;
    public boolean n0;
    public boolean n1;
    public u51 n2;
    public i47 n3;
    public long n4;
    public ln n5;
    public boolean n6;
    public StaticLayout n7;
    public p99 n8;
    public final RectF n9;
    public final Path na;
    public float nb;
    public float nc;
    public long nd;
    public int o0;
    public boolean o1;
    public StaticLayout o2;
    public a09 o3;
    public boolean o4;
    public int o5;
    public boolean o6;
    public qn o7;
    public p99 o8;
    public u51 o9;
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
    public p99 p8;
    public RectF p9;
    public StaticLayout pa;
    public int pb;
    public m37[] pc;
    public final RectF pd;
    public int q0;
    public long q1;
    public StaticLayout q2;
    public i47 q3;
    public gn q4;
    public boolean q5;
    public boolean q6;
    public int q7;
    public p99 q8;
    public ln0 q9;
    public int qa;
    public int qb;
    public boolean qc;
    public Paint qd;
    public w74 r;
    public int r0;
    public int r1;
    public StaticLayout r2;
    public int r3;
    public m66 r4;
    public boolean r5;
    public boolean r6;
    public int r7;
    public p99 r8;
    public int r9;
    public String ra;
    public boolean rb;
    public boolean rc;
    public Paint rd;
    public boolean s;
    public tc2 s0;
    public ed0 s1;
    public float s2;
    public float s3;
    public h47 s4;
    public float s5;
    public boolean s6;
    public boolean s7;
    public boolean s8;
    public float s9;
    public StaticLayout sa;
    public final boolean sb;
    public boolean sc;
    public float sd;
    public vc2 t0;
    public pn2 t1;
    public float t2;
    public float t3;
    public int t4;
    public int t5;
    public long t6;
    public int t7;
    public yxa t8;
    public float t9;
    public int ta;
    public float tb;
    public nc2 tc;
    public int td;
    public int u0;
    public oo4 u1;
    public boolean u2;
    public int u3;
    public final i66 u4;
    public float u5;
    public boolean u6;
    public int u7;
    public int u8;
    public float u9;
    public String ua;
    public final yc2 ub;
    public nc2 uc;
    public i47 ud;
    public int v0;
    public boolean v1;
    public RectF v2;
    public int v3;
    public int v4;
    public float v5;
    public boolean v6;
    public int v7;
    public fg0 v8;
    public boolean v9;
    public TLRPC.User va;
    public boolean vb;
    public boolean vc;
    public float vd;
    public lk1 w;
    public int w0;
    public boolean w1;
    public sc2 w2;
    public int w3;
    public final ArrayList w4;
    public int w5;
    public boolean w6;
    public int w7;
    public uib w8;
    public boolean w9;
    public TLRPC.Chat wa;
    public boolean wb;
    public boolean wc;
    public float wd;
    public final qa4 x;
    public int x0;
    public boolean x1;
    public xc2 x2;
    public StaticLayout x3;
    public final ArrayList x4;
    public int x5;
    public boolean x6;
    public boolean x7;
    public uib x8;
    public boolean x9;
    public TLRPC.FileLocation xa;
    public boolean xb;
    public int xc;
    public final ny1 xd;
    public boolean y;
    public int y0;
    public boolean y1;
    public byte y2;
    public ho y3;
    public qa6 y4;
    public boolean y5;
    public boolean y6;
    public final Rect y7;
    public int y8;
    public float y9;
    public String ya;
    public final ln yb;
    public nc2 yc;
    public RectF yd;
    public int z0;
    public boolean z1;
    public CharSequence z2;
    public ho z3;
    public ArrayList z4;
    public String z5;
    public int z6;
    public boolean z7;
    public int z8;
    public float z9;
    public Object za;
    public s34 zb;
    public Drawable zc;
    public final Path zd;

    public rc2(Context context, int i, boolean z, mx6 mx6Var, ylb ylbVar) {
        super(context);
        boolean z2;
        this.h = true;
        this.x = new qa4((byte) 1);
        d53 d53Var = d53.h;
        this.E = new fn0(0, this, d53Var, 380L, false);
        this.O = new l39(this);
        this.P = new ay4(this);
        this.Q = new cy4(this);
        this.D0 = new Rect();
        this.H0 = -1;
        this.I0 = -1;
        this.T0 = new int[4];
        this.J2 = new Drawable[2];
        this.K2 = new kc2[2];
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
        this.u4 = new i66(this);
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
        this.ub = new yc2(this);
        this.yb = new ln(200L, this, d53.g);
        this.Bb = new hc2(this, (byte) 0);
        this.Ib = new hc2(this, (byte) 1);
        this.Jb = new SparseArray();
        this.Xb = -1;
        this.Zb = new s34();
        this.fc = new ArrayList();
        this.gc = new Stack();
        this.hc = new Path();
        this.kc = new dc2(this, (byte) 11);
        this.lc = new dc2(this, (byte) 2);
        this.sc = false;
        this.Ac = new AtomicReference();
        this.Bc = -1L;
        this.Nc = false;
        this.Oc = new dc2(this, (byte) 0);
        this.Xc = true;
        this.ed = new Path();
        this.fd = new RectF();
        this.hd = -1;
        this.od = new RectF();
        this.pd = new RectF();
        this.sd = 1.0f;
        this.xd = new ny1(Float.class, "animationOffsetX", (byte) 1);
        this.zd = new Path();
        this.a6 = i;
        this.cc = ylbVar;
        this.dc = z;
        this.ec = mx6Var;
        if (mx6Var == null) {
            this.ec = new mx6(context, (byte) 20);
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
        imageReceiver.q0(gm.L(21.0f));
        this.B7 = new pc0((ylb) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.T7 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.q0(gm.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.F7 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.q0(gm.L(26.1f));
        this.Z5 = er3.q(i).k();
        this.X0 = new pc0((ylb) null);
        mm mmVar = new mm(this, this, (byte) 3);
        this.U0 = mmVar;
        mmVar.A1 = true;
        mmVar.m0 = true;
        mmVar.h1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.V0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.m0 = true;
        this.Q0 = new RadialProgress2(this, ylbVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.R0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(gm.L(15.0f));
        ic2 ic2Var = new ic2(this, this);
        this.D4 = ic2Var;
        ic2Var.h = this;
        ?? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.e = false;
        obj.f = false;
        obj.s = 1.0f;
        obj.t = 1.0f;
        ln lnVar = new ln(125L, 600L, d53Var);
        obj.v = lnVar;
        obj.w = 1.0f;
        ln lnVar2 = new ln(150L, d53.f);
        obj.B = lnVar2;
        obj.J = false;
        if (gx9.N == null) {
            gx9.N = new Paint(1);
            gx9.O = new Paint(1);
            Paint paint = gx9.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            gx9.O.setStyle(style);
        }
        this.E4 = obj;
        obj.k = this;
        obj.n = this;
        lnVar2.a = this;
        lnVar.a = this;
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
        drawable2.n = ylbVar;
        drawable2.j = this;
        this.d3 = drawable2;
        setImportantForAccessibility(1);
    }

    public static boolean F2(nc2 nc2Var, float f, float f2) {
        RectF rectF = nc2Var.d;
        if (f >= rectF.left - gm.L(6.0f) && f <= rectF.right + gm.L(6.0f) && f2 >= rectF.top - gm.L(4.0f) && f2 <= rectF.bottom + gm.L(4.0f)) {
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
        return oya.c(spannableStringBuilder, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, gm.L(1.0f), TextUtils.TruncateAt.END, i9, i4, true);
    }

    public static int M1(c47 c47Var) {
        int i = 0;
        if (c47Var != null) {
            if ((c47Var.l & 2) == 0) {
                i = gm.L(4.0f);
            }
            if ((c47Var.l & 1) == 0) {
                return gm.L(4.0f) + i;
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

    public static String N3(k47 k47Var, k47 k47Var2, boolean z, int i) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!k47Var.w1 && !k47Var.q4() && !k47.a4(k47Var.k) && !k47.c5(k47Var.k)) {
            if (!k47Var.r1 || k47Var.k.date != 2147483646) {
                if (k47Var.V != 0) {
                    return jb6.T(k47Var.V) + ", " + jb6.D0().o0().format(k47Var.V * 1000);
                } else if (k47Var.j2) {
                    return jb6.T(k47Var2.k.date) + ", " + jb6.D0().o0().format(k47Var2.k.date * 1000);
                } else if (z) {
                    if (oc7.r1(k47Var.K1).l4.Y.f) {
                        if (i == 0 && k47Var.Y2()) {
                            i = ConnectionsManager.getInstance(k47Var.K1).getCurrentTime();
                        }
                        return jb6.L(i);
                    }
                    return jb6.M0(2131751147, null) + " " + jb6.D0().o0().format(k47Var2.k.date * 1000);
                } else if (k47Var.n2 && (messageFwdHeader = (message = k47Var.k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(k47.n1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = k47Var.k.fwd_from;
                    int i2 = messageFwdHeader2.saved_date;
                    if (i2 == 0) {
                        i2 = messageFwdHeader2.date;
                    }
                    return jb6.O(i2);
                } else {
                    return jb6.D0().o0().format(k47Var2.k.date * 1000);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.S1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean W2() {
        return e86.e(2);
    }

    public static StaticLayout X2(int i, TextPaint textPaint, CharSequence charSequence) {
        SpannableStringBuilder O3 = O3(charSequence);
        if (O3 != null && i > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(O3, textPaint, i, truncateAt);
            int L = gm.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return oya.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static void Y0(Canvas canvas, StaticLayout staticLayout, float f, float f2) {
        canvas.save();
        canvas.translate(f - staticLayout.getLineLeft(0), ((gm.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public static int[] Z1(Spannable spannable, CharacterStyle characterStyle) {
        int i;
        int i2;
        boolean z;
        wkb wkbVar;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof e6c) && (wkbVar = ((e6c) characterStyle).a) != null && (messageEntity = wkbVar.d) != null) {
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
        k47 k47Var;
        TLRPC.User user = this.va;
        if (user != null) {
            return pg3.c(user);
        }
        if (this.wa != null && (k47Var = this.Q5) != null && k47.B0(k47Var.k) != 1271266957 && this.wa.signature_profiles) {
            long n = pg3.n(this.Q5.k.from_id);
            int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            int i2 = this.a6;
            if (i >= 0) {
                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(n));
                if (W1 != null) {
                    return pg3.c(W1);
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-n));
                if (L0 != null) {
                    return pg3.c(L0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.va;
        if (user != null) {
            return m9c.r(user);
        }
        TLRPC.Chat chat = this.wa;
        k47 k47Var = this.Q5;
        if (chat != null) {
            if (k47Var != null && k47.B0(k47Var.k) != 1271266957 && this.wa.signature_profiles) {
                long n = pg3.n(this.Q5.k.from_id);
                int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                int i2 = this.a6;
                if (i >= 0) {
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(n));
                    if (W1 != null) {
                        return m9c.r(W1);
                    }
                } else {
                    TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-n));
                    if (L0 != null) {
                        return L0.title;
                    }
                }
            }
            return this.wa.title;
        } else if (k47Var != null && k47Var.q4()) {
            return this.Q5.S0;
        } else {
            return "DELETED";
        }
    }

    private Object getAuthorStatus() {
        k47 k47Var;
        TLRPC.User user = this.va;
        if (user != null) {
            Long i = m9c.i(user);
            TLRPC.User user2 = this.va;
            if (i != null) {
                TLRPC.EmojiStatus emojiStatus = user2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return i;
            } else if (user2.premium) {
                return a.b.getDrawable(2131232313).mutate();
            } else {
                return null;
            }
        } else if (this.wa != null && (k47Var = this.Q5) != null && k47.B0(k47Var.k) != 1271266957 && this.wa.signature_profiles) {
            long n = pg3.n(this.Q5.k.from_id);
            int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            int i3 = this.a6;
            if (i2 >= 0) {
                TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(n));
                if (W1 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = W1.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return m9c.i(W1);
            }
            TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-n));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = L0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(pg3.f(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private int getCommentButtonHeight() {
        float f;
        if (v2()) {
            return gm.L(24.0f);
        }
        if (I3()) {
            f = 41.3f;
        } else {
            f = 43.0f;
        }
        return gm.L(f);
    }

    private int getCompactHeaderColor() {
        return on2.l(cmb.v0(cmb.Ra, this.cc), cmb.v0(cmb.ta, this.cc));
    }

    private int getCompactInShift() {
        if (v2()) {
            return (gm.L(16.0f) - gm.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactNameTimeWidth() {
        int i;
        if (y2() && (i = this.M9) > 0) {
            return gm.L(6.0f) + i;
        }
        return 0;
    }

    private float getCompactNameTimeX() {
        float compactLeft = getCompactLeft();
        if (this.x9) {
            compactLeft += getNameAvatarOffset();
        }
        if (this.Aa != 0) {
            compactLeft += gm.L(20.0f);
        }
        if (this.h9 != null) {
            compactLeft += this.i9;
        }
        if (this.za != null && this.R6 <= 0) {
            compactLeft += gm.L(20.0f);
        }
        if (this.m9 != null) {
            int i = 0;
            float lineWidth = this.m9.getLineWidth(0) + gm.L(8.0f);
            if (this.j9) {
                i = gm.L(6.0f);
            }
            compactLeft += lineWidth + i;
        }
        return compactLeft + gm.L(6.0f);
    }

    private float getCompactNameTimeY() {
        float f;
        if (this.J) {
            f = 9.0f;
        } else {
            f = 10.0f;
        }
        float L = gm.L(f) + this.xc + this.ub.k0;
        StaticLayout staticLayout = this.h9;
        if (staticLayout != null && this.L9 != null && staticLayout.getLineCount() > 0 && this.L9.getLineCount() > 0) {
            L += this.h9.getLineBaseline(0) - this.L9.getLineBaseline(0);
        }
        f47 f47Var = this.L;
        if (f47Var != null) {
            e47 e47Var = f47Var.m;
            if (e47Var.j) {
                return (e47Var.f - getTranslationY()) + L;
            }
        }
        return L;
    }

    private int getCompactSideButtonColumn() {
        k47 k47Var;
        if (this.Kb && this.R8 != 0 && (k47Var = this.Q5) != null && k47Var.S4()) {
            return gm.L(40.0f);
        }
        return 0;
    }

    private float getCompactSideMenuShift() {
        if (v2()) {
            return gm.L(71.0f) * this.Z6;
        }
        return 0.0f;
    }

    private int getCompactSideMenuWidth() {
        if (this.Y6) {
            return gm.L(71.0f);
        }
        return 0;
    }

    private hw1 getDraftMessageMeasureController() {
        mc2 mc2Var = this.eb;
        if (mc2Var != null) {
            return mc2Var.S();
        }
        return null;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        ColorMatrixColorFilter colorMatrixColorFilter = this.W0;
        if (colorMatrixColorFilter == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            gm.l2(colorMatrix, 0.9f);
            gm.i(colorMatrix, 0.6f);
            ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
            this.W0 = colorMatrixColorFilter2;
            return colorMatrixColorFilter2;
        }
        return colorMatrixColorFilter;
    }

    private pn2 getForwardVerifiedSpan() {
        pn2 pn2Var = this.t1;
        if (pn2Var == null) {
            sn2 sn2Var = new sn2(getContext().getResources().getDrawable(2131232809).mutate(), getContext().getResources().getDrawable(2131232810).mutate());
            sn2Var.x = true;
            pn2Var = new pn2(0, sn2Var);
            this.t1 = pn2Var;
            pn2Var.d = false;
        }
        sn2 sn2Var2 = (sn2) pn2Var.c;
        Drawable drawable = sn2Var2.a;
        int v0 = cmb.v0(cmb.y9, this.cc);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
        sn2Var2.b.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.z9, this.cc), mode));
        this.t1.c((int) (cmb.W2.getTextSize() * 0.95f));
        return this.t1;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.t1) {
            parentWidth = this.L0;
        }
        if (!gm.E && gm.O1()) {
            if (!gm.N1() || getResources().getConfiguration().orientation == 2) {
                return parentWidth - gm.k1(parentWidth, 0, 0);
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
        return gm.L(f);
    }

    private int getNameHeight() {
        if (this.x9 && !w2()) {
            if (this.m9 == null) {
                return gm.L(31.0f);
            }
            return gm.L(37.66f);
        }
        return (int) (cmb.V2.getTextSize() + gm.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f;
        float f2;
        yc2 yc2Var = this.ub;
        boolean z = yc2Var.Q2;
        boolean z2 = this.x9;
        float f3 = 0.0f;
        if (z) {
            f = gm.T1(!z2, z2, yc2Var.L1);
        } else if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float textSize = cmb.V2.getTextSize() + gm.L(5.0f);
        if (this.m9 == null) {
            f2 = 31.0f;
        } else {
            f2 = 35.0f;
        }
        float L = gm.L(f2);
        if (!w2()) {
            f3 = f;
        }
        return gm.R1(textSize, L, f3);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        f47 f47Var = this.L;
        if (f47Var != null && !f47Var.d.isEmpty() && (messageReplies = ((k47) this.L.d.get(0)).k.replies) != null) {
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
        ylb ylbVar = this.cc;
        if (ylbVar == null) {
            return 0;
        }
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.N3()) {
            i = cmb.Oc;
        } else {
            i = cmb.ra;
        }
        return ylbVar.h(i);
    }

    private float getUseTranscribeButtonProgress() {
        yc2 yc2Var = this.ub;
        boolean z = yc2Var.o1;
        boolean z2 = this.I4;
        if (z) {
            float f = yc2Var.L1;
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

    public static void p0(ImageReceiver imageReceiver) {
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

    public static oc2 w0(int i, String str, int i2, float f) {
        oc2 oc2Var = new oc2();
        oc2Var.a = i;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, cmb.L2, i2, TextUtils.TruncateAt.END), cmb.L2, gm.L(2.0f) + i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        oc2Var.d = staticLayout;
        oc2Var.b = f;
        if (staticLayout.getLineCount() > 0) {
            oc2Var.c = ((float) (oc2Var.b - Math.ceil(oc2Var.d.getLineWidth(0)))) / 2.0f;
            oc2Var.c -= (int) oc2Var.d.getLineLeft(0);
        }
        return oc2Var;
    }

    @Override
    public final void A(boolean z) {
        boolean z2;
        byte b = this.M1;
        if (b != 3 && b != 5) {
            z2 = false;
        } else {
            z2 = true;
        }
        R3(true, z2, false);
    }

    public final void A0(int i) {
        int i2;
        int v0;
        int i3;
        int i4;
        int i5;
        if (this.Q5.F4()) {
            if (this.Q5.O3()) {
                i5 = cmb.Nb;
            } else {
                i5 = cmb.Ad;
            }
            v0 = cmb.v0(i5, this.cc);
        } else {
            if (i == 0) {
                if (this.E5) {
                    if (this.Q5.O3()) {
                        i3 = cmb.Hb;
                    } else {
                        i3 = cmb.nd;
                    }
                    v0 = cmb.v0(i3, this.cc);
                } else {
                    p99 p99Var = this.o8;
                    if (p99Var != null) {
                        v0 = p99Var.h();
                    } else {
                        p99 p99Var2 = this.q8;
                        if (p99Var2 != null) {
                            v0 = p99Var2.h();
                        }
                    }
                }
            }
            if (this.Q5.O3()) {
                i2 = cmb.Nb;
            } else {
                i2 = cmb.Ad;
            }
            v0 = cmb.v0(i2, this.cc);
        }
        Drawable[] drawableArr = this.J2;
        Drawable drawable = drawableArr[i];
        if (drawable == null) {
            kc2 kc2Var = new kc2(this, i);
            kc2[] kc2VarArr = this.K2;
            kc2VarArr[i] = kc2Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.Q5.O3()) {
                i4 = cmb.Nb;
            } else {
                i4 = cmb.Ad;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{cmb.v0(i4, this.cc) & 436207615}), null, kc2VarArr[i]);
            drawableArr[i] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            cmb.F1(drawable, v0 & 436207615, true);
        }
        drawableArr[i].setVisible(true, false);
    }

    public void A1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.A1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean A2() {
        if (((isPressed() && this.D6) || ((!this.D6 && this.w6) || this.x6)) && !M3() && !n2()) {
            k47 k47Var = this.Q5;
            if (k47Var == null || !k47Var.t1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A3(int i) {
        this.n = i;
    }

    public final void B() {
        StaticLayout staticLayout;
        if (this.Q5.D == 20 && (staticLayout = this.ja) != null) {
            mm mmVar = this.U0;
            this.ha = aq1.z(mmVar.N0, staticLayout.getWidth(), 2.0f, this.N6);
            this.ia = aq1.z(mmVar.O0, this.ja.getHeight(), 2.0f, this.P6 + mmVar.M0);
        }
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
        yc2 yc2Var;
        int i7;
        float f6;
        boolean z4;
        float f7;
        boolean z5;
        int i8;
        rc2 rc2Var;
        String str;
        float f8;
        float L2;
        yc2 yc2Var2;
        boolean z6;
        float f9;
        int i9;
        yc2 yc2Var3;
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
        yc2 yc2Var4;
        float f14;
        float f15;
        boolean z15;
        int i13;
        boolean z16;
        k47 k47Var;
        TextPaint textPaint;
        int i14;
        int i15;
        rc2 rc2Var2 = this;
        Canvas canvas2 = canvas;
        if (((!rc2Var2.R9 || rc2Var2.N) && rc2Var2.I3()) || staticLayout == null) {
            return;
        }
        k47 k47Var2 = rc2Var2.Q5;
        if ((!k47Var2.Z || rc2Var2.M == null) && (i = k47Var2.D) != 16) {
            if (i == 5) {
                TextPaint textPaint2 = cmb.S2;
                if (rc2Var2.v2()) {
                    i14 = rc2Var2.Q5.O3() ? cmb.ic : cmb.de;
                } else {
                    i14 = cmb.Yc;
                }
                int v0 = cmb.v0(i14, rc2Var2.cc);
                boolean A2 = rc2Var2.A2();
                k47 k47Var3 = rc2Var2.Q5;
                if (A2) {
                    i15 = k47Var3.O3() ? cmb.dc : cmb.ee;
                } else {
                    i15 = k47Var3.O3() ? cmb.ic : cmb.de;
                }
                textPaint2.setColor(on2.f(rc2Var2.getVideoTranscriptionProgress(), v0, cmb.v0(i15, rc2Var2.cc)));
            } else {
                boolean I3 = rc2Var2.I3();
                k47 k47Var4 = rc2Var2.Q5;
                if (I3) {
                    if (k47Var4.O5()) {
                        cmb.S2.setColor(cmb.v0(cmb.Yc, rc2Var2.cc));
                    } else {
                        cmb.S2.setColor(cmb.v0(cmb.ae, rc2Var2.cc));
                    }
                } else if (k47Var4.O3()) {
                    cmb.S2.setColor(cmb.v0(z2 ? cmb.dc : cmb.ic, rc2Var2.cc));
                } else {
                    cmb.S2.setColor(cmb.v0(z2 ? cmb.ee : cmb.de, rc2Var2.cc));
                }
            }
            if (rc2Var2.y2()) {
                cmb.S2.setColor(cmb.v0(z2 ? cmb.ce : cmb.be, rc2Var2.cc));
            }
            float f16 = rc2Var2.getTransitionParams().K1 ? rc2Var2.getTransitionParams().L1 * f : f;
            if (f16 != 1.0f) {
                cmb.S2.setAlpha((int) (textPaint.getAlpha() * f16));
            }
            canvas2.save();
            if (rc2Var2.K && !rc2Var2.I3() && !rc2Var2.y2()) {
                canvas2.translate(0.0f, gm.L(2.0f));
            }
            float f17 = rc2Var2.e7;
            yc2 yc2Var5 = rc2Var2.ub;
            if (yc2Var5.x0) {
                f17 += yc2Var5.j0;
            }
            f47 f47Var = rc2Var2.L;
            if (f47Var == null || !f47Var.m.j) {
                f4 = f2;
            } else {
                f17 -= rc2Var2.getTranslationY();
                f4 = f2 + rc2Var2.L.m.g;
            }
            float f18 = f17;
            float f19 = f4;
            if (rc2Var2.K && rc2Var2.I3()) {
                f18 += gm.L(1.0f);
            }
            float f20 = f18;
            if (yc2Var5.x0) {
                float f21 = rc2Var2.wd;
                f4 += f21;
                f19 += f21;
            }
            float f22 = f4;
            boolean N5 = rc2Var2.Q5.N5();
            l39 l39Var = rc2Var2.O;
            if (N5) {
                l39Var.getClass();
            }
            if (yc2Var5.U0) {
                f19 = kt6.B(1.0f, yc2Var5.L1, yc2Var5.Z0, f19);
            }
            float f23 = f19;
            boolean I32 = rc2Var2.I3();
            RectF rectF2 = rc2Var2.c4;
            mm mmVar = rc2Var2.U0;
            if (I32) {
                if (rc2Var2.x7) {
                    i10 = rc2Var2.v2() ? rc2Var2.getCommentButtonHeight() : gm.L(41.3f);
                } else {
                    i10 = 0;
                }
                int i16 = -i10;
                if (rc2Var2.Q5.O5()) {
                    c22 = rc2Var2.c2("paintChatActionBackground");
                } else {
                    c22 = rc2Var2.c2("paintChatTimeBackground");
                }
                int alpha = c22.getAlpha();
                float f24 = f16;
                cmb.S2.setAlpha((int) (rc2Var2.k4 * 255.0f * f24));
                k47 k47Var5 = rc2Var2.Q5;
                if (k47Var5 == null || k47Var5.D != 4) {
                    f11 = f20;
                    f12 = f24;
                } else {
                    float f25 = mmVar.G() ? 1.0f : mmVar.i1;
                    if (!mmVar.E()) {
                        f25 = 0.0f;
                    }
                    f11 = f20;
                    f12 = gm.R1(0.35f, 1.0f, f25);
                }
                k47 k47Var6 = rc2Var2.Q5;
                if (k47Var6 != null && k47Var6.B0) {
                    tm tmVar = rc2Var2.m0;
                    f12 *= tmVar == null ? 0.0f : tmVar.e();
                }
                c22.setAlpha((int) mlb.C(alpha, rc2Var2.k4, f12, 0.6f));
                if (rc2Var2.g4()) {
                    int L4 = gm.L(8.0f);
                    int i17 = gda.U0;
                    if (i17 > 2) {
                        i17 -= 2;
                    }
                    L3 = Math.min(L4, gm.L(i17));
                    z13 = gda.U0 >= 10;
                    i2 = 2;
                } else {
                    byte b = rc2Var2.M1;
                    if (b != 7 && b != 6 && rc2Var2.Q5.D != 19) {
                        int[] iArr = mmVar.X0;
                        i2 = 2;
                        L3 = Math.min(gm.L(8.0f), Math.max(iArr[2], iArr[3]));
                        z13 = gda.U0 >= 10;
                    } else {
                        i2 = 2;
                        int L5 = gm.L(4.0f);
                        k47 k47Var7 = rc2Var2.Q5;
                        L3 = L5 + ((k47Var7 == null || !k47Var7.M2()) ? 0 : gm.L(8.0f));
                        z13 = false;
                    }
                }
                k47 k47Var8 = rc2Var2.Q5;
                float L6 = f22 + ((k47Var8 == null || !k47Var8.M2()) ? 0 : gm.L(-6.0f));
                if (rc2Var2.j0 != 0) {
                    L6 -= gm.L(18.0f);
                }
                float L7 = L6 - gm.L(z13 ? 6.0f : 4.0f);
                k47 k47Var9 = rc2Var2.Q5;
                float L8 = (k47Var9 == null || !k47Var9.M2()) ? 0.0f : gm.L(2.0f);
                float f26 = f12;
                float f27 = L6;
                if (rc2Var2.M1 != 7 || ((k47Var = rc2Var2.Q5) != null && k47Var.f4())) {
                    photoBottom = rc2Var2.getPhotoBottom() + rc2Var2.w0;
                } else {
                    photoBottom = f11 - ((1.0f - rc2Var2.getVideoTranscriptionProgress()) * (l39Var.i(yc2Var5.L1) + gm.L(rc2Var2.K ? 4.0f : 5.0f)));
                }
                float f28 = photoBottom;
                float L9 = f28 - gm.L(23.0f);
                float max = Math.max(gm.L(17.0f), cmb.S2.getTextSize() + gm.L(5.0f));
                float f29 = L7 - L8;
                float f30 = L8 + L7 + f3;
                int i18 = z13 ? 12 : 8;
                if (rc2Var2.Q5.O3()) {
                    i11 = i18;
                    i12 = (rc2Var2.Q5.D == 19 ? 4 : 0) + 20;
                } else {
                    i11 = i18;
                    i12 = 0;
                }
                rectF2.set(f29, L9, f30 + gm.L(i11 + i12), L9 + max);
                dd5 dd5Var = rc2Var2.X5;
                if (dd5Var != null) {
                    float f31 = L3;
                    canvas2.save();
                    Path path = dd5Var.t;
                    path.rewind();
                    path.addRoundRect(rectF2, f31, f31, Path.Direction.CW);
                    canvas2.clipPath(path);
                    canvas2.drawColor(1073741824);
                    canvas2.restore();
                } else if (!k47.a4(rc2Var2.Q5.k)) {
                    if (rc2Var2.Q5.t2() && rc2Var2.Q5.D != 5) {
                        Path path2 = rc2Var2.B4;
                        path2.rewind();
                        float f32 = L3;
                        path2.addRoundRect(rectF2, f32, f32, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path2);
                        ImageReceiver imageReceiver = rc2Var2.Q5.l5() ? mmVar : rc2Var2.V0;
                        float alpha2 = imageReceiver.getAlpha();
                        imageReceiver.setAlpha(0.5f * alpha2);
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(alpha2);
                        canvas2.restore();
                        Paint c23 = rc2Var2.c2("paintChatTimeBackground");
                        int alpha3 = c23.getAlpha();
                        c23.setAlpha((int) (alpha3 * rc2Var2.l4 * 0.4f));
                        canvas2.drawRoundRect(rectF2, f32, f32, c23);
                        c23.setAlpha(alpha3);
                    } else {
                        rc2Var2.x();
                        float f33 = L3;
                        canvas2.drawRoundRect(rectF2, f33, f33, c22);
                        if (c22 == rc2Var2.c2("paintChatActionBackground") && rc2Var2.i2()) {
                            int alpha4 = cmb.g2.getAlpha();
                            cmb.g2.setAlpha((int) (alpha4 * rc2Var2.k4 * f26));
                            canvas2.drawRoundRect(rectF2, f33, f33, cmb.g2);
                            cmb.g2.setAlpha(alpha4);
                        }
                    }
                }
                c22.setAlpha(alpha);
                float f34 = -staticLayout.getLineLeft(0);
                k47 k47Var10 = rc2Var2.Q5;
                float L10 = f34 + ((k47Var10 == null || !k47Var10.M2()) ? 0 : gm.L(-6.0f));
                if (rc2Var2.Q5.N5()) {
                    l39Var.getClass();
                }
                if ((!sd2.T(rc2Var2.wa) || rc2Var2.wa.megagroup) && (rc2Var2.Q5.k.flags & 1024) == 0 && rc2Var2.sa == null && !rc2Var2.q6) {
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
                    float lineWidth = (rc2Var2.M9 - staticLayout.getLineWidth(0)) + L10;
                    l39Var.getClass();
                    int b2 = yc2Var5.b();
                    int i19 = yc2Var5.b2;
                    if (i19 >= 0 && i19 != b2 && !rc2Var2.Fb) {
                        rc2Var2.C0(i19, b2, z);
                    }
                    boolean z17 = rc2Var2.Fb;
                    if (z17) {
                        b2 = rc2Var2.Cb;
                    }
                    boolean z18 = (b2 & 4) != 0;
                    boolean z19 = (b2 & 8) != 0;
                    if (z17) {
                        int i20 = rc2Var2.Db;
                        if ((i20 & 4) != 0) {
                            i13 = i20;
                            z16 = true;
                        } else {
                            i13 = i20;
                            z16 = false;
                        }
                        boolean z20 = (i13 & 8) != 0;
                        float f35 = i16;
                        yc2Var4 = yc2Var5;
                        f14 = lineWidth;
                        rectF = rectF2;
                        float f36 = f11;
                        c = 6;
                        c3 = 4;
                        z14 = false;
                        i5 = i16;
                        c2 = 7;
                        rc2Var2.T0(canvas2, z16, z20, f36, f24, f35, f27, 1.0f - rc2Var2.Eb, z2);
                        boolean z21 = z16;
                        boolean z22 = z20;
                        boolean z23 = z18;
                        boolean z24 = z19;
                        rc2Var2.T0(canvas, z23, z24, f36, f24, f35, f27, rc2Var2.Eb, z2);
                        f20 = f36;
                        f15 = f27;
                        z15 = z23;
                        f16 = f24;
                        if (!rc2Var2.Q5.O3()) {
                            if (!z21 && !z22) {
                                rc2Var2.D1(canvas, f16, f35, f15, 1.0f - rc2Var2.Eb, z2);
                            }
                            if (!z15 && !z24) {
                                rc2Var2.D1(canvas, f16, f35, f15, rc2Var2.Eb, z2);
                            }
                        }
                    } else {
                        yc2Var4 = yc2Var5;
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
                        if (!rc2Var2.Q5.O3() && !z25 && !z26) {
                            rc2Var2.D1(canvas, f24, i5, f27, 1.0f, z2);
                        }
                        rc2Var2 = this;
                        rc2Var2.T0(canvas, z25, z26, f37, f24, i5, f27, 1.0f, z2);
                        f20 = f37;
                        f15 = f27;
                        z15 = z25;
                        f16 = f24;
                    }
                    if (rc2Var2.Q5.O3()) {
                        canvas2 = canvas;
                        rc2Var2.D1(canvas2, f16, i5, f15, 1.0f, z2);
                    } else {
                        canvas2 = canvas;
                    }
                    yc2Var5 = yc2Var4;
                    yc2Var5.b2 = yc2Var4.b();
                    if (z15 && z && rc2Var2.getParent() != null) {
                        ((View) rc2Var2.getParent()).invalidate();
                    }
                    f13 = f14;
                }
                canvas2.save();
                float f38 = f23 + f13;
                rc2Var2.J9 = f38;
                float L11 = (f28 - gm.L(7.3f)) - staticLayout.getHeight();
                rc2Var2.K9 = L11;
                canvas2.translate(f38, L11);
                rna.f(canvas2, staticLayout);
                canvas2.restore();
                cmb.S2.setAlpha(255);
                z3 = z13;
                i8 = z14;
            } else {
                rectF = rectF2;
                i2 = 2;
                c = 6;
                c2 = 7;
                c3 = 4;
                if (rc2Var2.Q5.q4()) {
                    i4 = -gm.L(48.0f);
                    if (rc2Var2.c7) {
                        i4 -= gm.L(4.0f);
                    }
                } else {
                    if (rc2Var2.x7) {
                        i3 = rc2Var2.v2() ? rc2Var2.getCommentButtonHeight() : gm.L(43.0f);
                    } else {
                        i3 = 0;
                    }
                    i4 = -i3;
                }
                i5 = i4;
                if (rc2Var2.y2()) {
                    L = rc2Var2.getCompactNameTimeY();
                } else {
                    L = ((f20 - gm.L((rc2Var2.G || rc2Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i5;
                }
                float f39 = -staticLayout.getLineLeft(0);
                if (rc2Var2.Q5.N5()) {
                    l39Var.getClass();
                }
                if ((!sd2.T(rc2Var2.wa) || rc2Var2.wa.megagroup) && (rc2Var2.Q5.k.flags & 1024) == 0 && rc2Var2.sa == null && !yc2Var5.G && !rc2Var2.q6 && !yc2Var5.C) {
                    i6 = 0;
                    f5 = L;
                } else {
                    float lineWidth2 = (f3 - staticLayout.getLineWidth(0)) + f39;
                    l39Var.getClass();
                    int b3 = yc2Var5.b();
                    int i21 = yc2Var5.b2;
                    if (i21 >= 0 && i21 != b3 && !rc2Var2.Fb) {
                        rc2Var2.C0(i21, b3, z);
                    }
                    boolean z27 = rc2Var2.Fb;
                    if (z27) {
                        b3 = rc2Var2.Cb;
                    }
                    boolean z28 = (b3 & 4) != 0;
                    boolean z29 = (b3 & 8) != 0;
                    if (z27) {
                        int i22 = rc2Var2.Db;
                        boolean z30 = (i22 & 4) != 0;
                        if ((i22 & 8) != 0) {
                            f7 = L;
                            z5 = true;
                        } else {
                            f7 = L;
                            z5 = false;
                        }
                        float f40 = i5;
                        yc2Var = yc2Var5;
                        i7 = 0;
                        f5 = f7;
                        float f41 = f16;
                        boolean z31 = z30;
                        rc2Var2.T0(canvas2, z31, z5, f20, f41, f40, f22, 1.0f - rc2Var2.Eb, z2);
                        boolean z32 = z5;
                        boolean z33 = z28;
                        boolean z34 = z29;
                        rc2Var2.T0(canvas, z33, z34, f20, f41, f40, f22, rc2Var2.Eb, z2);
                        f20 = f20;
                        f6 = f22;
                        z4 = z33;
                        f16 = f41;
                        if (!rc2Var2.Q5.O3()) {
                            if (!z31 && !z32) {
                                rc2Var2.D1(canvas, f16, f40, f6, 1.0f - rc2Var2.Eb, z2);
                            }
                            if (!z4 && !z34) {
                                rc2Var2.D1(canvas, f16, f40, f6, rc2Var2.Eb, z2);
                            }
                        }
                    } else {
                        yc2Var = yc2Var5;
                        i7 = 0;
                        boolean z35 = z28;
                        boolean z36 = z29;
                        f5 = L;
                        if (!rc2Var2.Q5.O3() && !z35 && !z36) {
                            rc2Var2.D1(canvas, f16, i5, f22, 1.0f, z2);
                        }
                        rc2Var2 = this;
                        float f42 = f16;
                        rc2Var2.T0(canvas, z35, z36, f20, f42, i5, f22, 1.0f, z2);
                        f20 = f20;
                        f6 = f22;
                        z4 = z35;
                        f16 = f42;
                    }
                    if (rc2Var2.Q5.O3()) {
                        canvas2 = canvas;
                        rc2Var2.D1(canvas2, f16, i5, f6, 1.0f, z2);
                    } else {
                        canvas2 = canvas;
                    }
                    yc2Var5 = yc2Var;
                    yc2Var5.b2 = yc2Var.b();
                    if (z4 && z && rc2Var2.getParent() != null) {
                        ((View) rc2Var2.getParent()).invalidate();
                    }
                    f39 = lineWidth2;
                    i6 = i7;
                }
                canvas2.save();
                if (yc2Var5.U0 && yc2Var5.L1 != 1.0f) {
                    if (yc2Var5.V0 != null) {
                        canvas2.translate(f23 + f39, f5);
                        int alpha5 = cmb.S2.getAlpha();
                        cmb.S2.setAlpha((int) (alpha5 * yc2Var5.L1));
                        yc2Var5.V0.draw(canvas2);
                        cmb.S2.setAlpha(alpha5);
                        rna.f(canvas2, yc2Var5.W0);
                    } else {
                        int alpha6 = cmb.S2.getAlpha();
                        canvas2.save();
                        canvas2.translate(yc2Var5.h1 + f39, f5);
                        float f43 = alpha6;
                        cmb.S2.setAlpha((int) ((1.0f - yc2Var5.L1) * f43));
                        rna.f(canvas2, yc2Var5.W0);
                        canvas2.restore();
                        canvas2.translate(f23 + f39, f5);
                        cmb.S2.setAlpha((int) (f43 * yc2Var5.L1));
                        rna.f(canvas2, staticLayout);
                        cmb.S2.setAlpha(alpha6);
                    }
                } else {
                    float f44 = f23 + f39;
                    rc2Var2.J9 = f44;
                    rc2Var2.K9 = f5;
                    canvas2.translate(f44, f5);
                    rna.f(canvas2, staticLayout);
                }
                canvas2.restore();
                z3 = i6 == 1 ? 1 : 0;
                i8 = i6;
            }
            int i23 = i5;
            if (rc2Var2.Q5.O3()) {
                int b4 = yc2Var5.b();
                int i24 = yc2Var5.b2;
                if (i24 >= 0 && i24 != b4 && !rc2Var2.Fb) {
                    rc2Var2.C0(i24, b4, z);
                }
                if (rc2Var2.Fb) {
                    b4 = rc2Var2.Cb;
                }
                int i25 = (b4 & 1) != 0 ? true : i8;
                int i26 = (b4 & 2) != 0 ? true : i8;
                if ((b4 & 4) != 0) {
                    yc2Var2 = yc2Var5;
                    z6 = true;
                } else {
                    yc2Var2 = yc2Var5;
                    z6 = i8;
                }
                boolean z37 = (b4 & 8) != 0 ? true : i8;
                if (rc2Var2.Uc != 0.0f) {
                    canvas2.save();
                    f9 = 0.0f;
                    canvas2.translate(0.0f, rc2Var2.Uc);
                    i9 = 1;
                } else {
                    f9 = 0.0f;
                    i9 = i8;
                }
                if (rc2Var2.Fb) {
                    int i27 = rc2Var2.Db;
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
                        yc2Var3 = yc2Var2;
                        f8 = f9;
                        z6 = z9;
                        str = "paintChatTimeBackground";
                        rc2Var2.z1(canvas2, i25, z7, z6, z11, f10, z3, i23, f20, rc2Var2.Eb, true, z2);
                    } else {
                        yc2Var3 = yc2Var2;
                        f8 = f9;
                        boolean z39 = z7;
                        boolean z40 = i25;
                        str = "paintChatTimeBackground";
                        float f45 = i23;
                        rc2Var2.z1(canvas, z8, z38, z10, z12, f10, z3, f45, f20, 1.0f - rc2Var2.Eb, false, z2);
                        z6 = z9;
                        rc2Var2.z1(canvas, z40, z39, z6, z11, f10, z3, f45, f20, rc2Var2.Eb, false, z2);
                    }
                    rc2Var = this;
                    canvas2 = canvas;
                } else {
                    yc2Var3 = yc2Var2;
                    f8 = f9;
                    str = "paintChatTimeBackground";
                    canvas2 = canvas;
                    z1(canvas2, i25, i26, z6, z37, f16, z3, i23, f20, 1.0f, false, z2);
                    rc2Var = this;
                }
                if (i9 != 0) {
                    canvas2.restore();
                }
                yc2Var3.b2 = yc2Var3.b();
                if (z && z6 && rc2Var.getParent() != null) {
                    ((View) rc2Var.getParent()).invalidate();
                }
            } else {
                rc2Var = rc2Var2;
                str = "paintChatTimeBackground";
                f8 = 0.0f;
            }
            canvas2.restore();
            if (rc2Var.ja != null) {
                if (rc2Var.ha == f8 || rc2Var.ia == f8) {
                    rc2Var.B();
                }
                Path path3 = rc2Var.na;
                path3.rewind();
                RectF rectF3 = gm.P;
                rectF3.set(mmVar.L0, mmVar.M0, mmVar.w(), mmVar.x());
                int[] iArr2 = mmVar.X0;
                float f46 = iArr2[i8];
                float[] fArr = rc2Var.oa;
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
                rectF3.set(rc2Var.ha - gm.L(12.0f), rc2Var.ia - gm.L(8.0f), rc2Var.ha + cmb.K3.getIntrinsicWidth() + gm.L(14.0f) + rc2Var.ja.getWidth() + gm.L(12.0f), rc2Var.ia + rc2Var.ja.getHeight() + gm.L(8.0f));
                path3.addRoundRect(rectF3, gm.L(32.0f), gm.L(32.0f), direction);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                if (rc2Var.ca == null) {
                    rna rnaVar = rc2Var.ma;
                    if (rnaVar == null) {
                        rnaVar = new rna();
                        rc2Var.ma = rnaVar;
                    }
                    rnaVar.h(on2.p(-1, 82));
                    rc2Var.ma.setBounds((int) mmVar.L0, (int) mmVar.M0, (int) mmVar.w(), (int) mmVar.x());
                    rc2Var.ma.draw(canvas2);
                }
                rc2Var.invalidate();
                canvas2.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, rc2Var.getWidth(), rc2Var.getHeight(), (int) (rc2Var.ga * 255.0f), 31);
                int alpha7 = cmb.h2.getAlpha();
                cmb.h2.setAlpha((int) (alpha7 * 0.7f));
                canvas.drawRoundRect(rectF3, gm.L(32.0f), gm.L(32.0f), cmb.h2);
                cmb.h2.setAlpha(alpha7);
                canvas.translate(rc2Var.ha + gm.L(4.0f), rc2Var.ia);
                Drawable drawable = cmb.K3;
                int i28 = i8;
                drawable.setBounds(i28, i28, drawable.getIntrinsicWidth(), cmb.K3.getIntrinsicHeight());
                cmb.K3.draw(canvas);
                canvas.translate(cmb.K3.getIntrinsicWidth() + gm.L(6.0f), f8);
                rna.f(canvas, rc2Var.ja);
                canvas.restore();
                if (rc2Var.q2 != null && mmVar.R0 && rc2Var.A2 == 0) {
                    int i29 = gda.U0;
                    int i30 = i2;
                    if (i29 > i30) {
                        L2 = gm.L(i29 - i30);
                        z3 = gda.U0 < 10 ? i28 : true;
                    } else {
                        L2 = gm.L(i29);
                    }
                    int L12 = (int) (mmVar.L0 + gm.L(9.0f));
                    int L13 = (int) (mmVar.M0 + gm.L(6.0f));
                    RectF rectF4 = rectF;
                    rectF4.set(L12 - gm.L(4.0f), L13 - gm.L(1.5f), gm.L(z3 ? 2.0f : f8) + gm.L(4.0f) + rc2Var.Z1 + L12, gm.L(1.5f) + rc2Var.q2.getHeight() + L13);
                    canvas.drawRoundRect(rectF4, L2, L2, rc2Var.c2(str));
                    canvas.save();
                    if (!z3) {
                        i30 = i28;
                    }
                    canvas.translate(L12 + i30, L13);
                    rna.f(canvas, rc2Var.q2);
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
        m37 m37Var;
        this.L0 = i;
        this.M0 = i2;
        this.ob = i2;
        if ((this.Q5 != null && i2() && this.Q5.O5()) || ((m37Var = this.L6) != null && m37Var.a != null)) {
            invalidate();
        }
    }

    public final int C() {
        if (this.w1) {
            return 4;
        }
        return 8;
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
        this.Gb.setInterpolator(d53.f);
        this.Db = i;
        this.Cb = i2;
        this.Gb.addUpdateListener(new d30((byte) 2, this, z));
        this.Gb.addListener(new y7((byte) 18, this, z));
        this.Fb = true;
        this.Gb.start();
    }

    public final void C1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.C1(android.graphics.Canvas, int):void");
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
            O();
            if (z) {
                invalidate();
            }
        }
        mm mmVar = this.U0;
        float f4 = f - mmVar.M0;
        float measuredHeight = f2 - (getMeasuredHeight() - mmVar.x());
        float f5 = mmVar.O0;
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
        mmVar.B1 = z2;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            invalidate();
            r2();
        }
    }

    public final void D0() {
        k47 k47Var;
        mc2 mc2Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.Q5.t2() && !this.Q5.l5()) {
            k47 k47Var2 = this.Q5;
            if (!k47Var2.O0) {
                if (this.eb != null && k47Var2.o4()) {
                    this.eb.U0(this);
                    return;
                } else {
                    L3(this.h1, this.i1);
                    return;
                }
            }
        }
        k47 k47Var3 = this.Q5;
        int i = k47Var3.D;
        int i2 = 0;
        if (i == 20) {
            TLRPC.Message message = k47Var3.k;
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
                            this.eb.X1(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i != 1 && !k47Var3.M2()) {
            k47 k47Var4 = this.Q5;
            int i3 = k47Var4.D;
            if (i3 == 12) {
                long j = k47.n1(k47Var4.k).user_id;
                if (j != 0) {
                    user = oc7.r1(this.a6).W1(Long.valueOf(j));
                } else {
                    user = null;
                }
                this.eb.W(this, user, this.h1, this.i1);
            } else if (i3 == 5) {
                if (this.O3 != -1) {
                    E0(false);
                } else if (MediaController.w().D(this.Q5) && !MediaController.w().C()) {
                    MediaController.w().Q(this.Q5, true);
                } else {
                    this.eb.n2(this, this.Q5);
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
                this.eb.r0(this, this.h1, this.i1, false);
            } else if (this.M1 != 4 && !k47Var4.D2(true)) {
                k47 k47Var5 = this.Q5;
                int i5 = k47Var5.D;
                if (i5 != 4 && i5 != 17 && i5 != 23 && i5 != 24) {
                    byte b = this.M1;
                    if (b == 1) {
                        if (this.O3 == -1) {
                            this.eb.r0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (k47Var5.a1 != null) {
                        mc2 mc2Var2 = this.eb;
                        if (mc2Var2 != null) {
                            mc2Var2.r0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (b == 2) {
                        if (this.O3 == -1 && (webPage = k47.n1(k47Var5.k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.eb.w1(this.Q5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                l11.u(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.U1) {
                        if (this.O3 == -1) {
                            this.eb.r0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (mc2Var = this.eb) != null) {
                        if (i5 == 16) {
                            mc2Var.u(this, 0.0f, 0.0f);
                            return;
                        } else {
                            mc2Var.d2(this, this.S3, this.T3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.eb.r0(this, this.h1, this.i1, false);
            } else if (this.O3 != -1 && (!this.z1 || (!this.H5 && (((k47Var = this.Q5) == null || !k47Var.D2(true)) && (!gda.x0 || !this.C1))))) {
                if (this.z1) {
                    E0(true);
                    return;
                }
                int i6 = this.O3;
                if (i6 == 0 || i6 == 3) {
                    E0(false);
                }
            } else {
                this.eb.r0(this, this.h1, this.i1, false);
            }
        } else {
            int i7 = this.O3;
            if (i7 == -1) {
                this.eb.r0(this, this.h1, this.i1, false);
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
        float r;
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
        int alpha = cmb.S2.getAlpha();
        float d2 = d2(f2);
        StaticLayout staticLayout = this.sa;
        yc2 yc2Var = this.ub;
        float f13 = 0.0f;
        if (staticLayout == null && !yc2Var.G) {
            f6 = 10.0f;
            d = 1.0d;
        } else {
            boolean z8 = yc2Var.i1;
            if (z8) {
                f5 = this.O9;
            } else {
                f5 = f3;
            }
            float f14 = f5 + 0.0f;
            f6 = 10.0f;
            boolean z9 = yc2Var.G;
            d = 1.0d;
            if (z9 && yc2Var.I == null && staticLayout != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z9 && yc2Var.I != null && staticLayout == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z9 && yc2Var.I != null && staticLayout != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((!this.Kb || !yc2Var.m1) && z8 && !z3) {
                float f15 = yc2Var.J;
                if (z4) {
                    f14 = f15;
                } else {
                    float f16 = yc2Var.L1;
                    f14 = (f14 * f16) + ((1.0f - f16) * f15);
                }
            }
            f47 f47Var = this.L;
            if (f47Var != null) {
                e47 e47Var = f47Var.m;
                if (e47Var.j) {
                    f14 += e47Var.g;
                }
            }
            if (yc2Var.x0) {
                f14 += this.wd;
            }
            boolean I3 = I3();
            k47 k47Var = this.Q5;
            if (I3) {
                if (k47Var.O5()) {
                    b2 = b2("drawableMsgStickerReplies");
                } else {
                    b2 = cmb.a4;
                }
            } else if (!k47Var.O3()) {
                if (z) {
                    b2 = cmb.Q3;
                } else {
                    b2 = cmb.P3;
                }
            } else {
                b2 = b2("drawableMsgOutReplies");
            }
            float r2 = hg0.r(b2, f14, d2, cmb.S2.getTextSize());
            if (z3) {
                f7 = yc2Var.L1 * f12;
            } else if (z4) {
                f7 = (1.0f - yc2Var.L1) * f12;
            } else {
                f7 = f12;
            }
            b2.setAlpha((int) (f7 * 255.0f));
            if (z2) {
                canvas.save();
                canvas.scale(f11, f11, td4.e(gm.L(3.0f) + r2, this.ta, 2.0f, f14), b2.getBounds().centerY());
            }
            b2.draw(canvas);
            b2.setAlpha(255);
            if (yc2Var.G) {
                if (z5) {
                    canvas.save();
                    f8 = r2;
                    cmb.S2.setAlpha((int) ((1.0d - yc2Var.L1) * alpha));
                    canvas.translate(f14 + f8 + gm.L(3.0f), d2);
                    yc2Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f8 = r2;
                }
                cmb.S2.setAlpha((int) (alpha * f7));
            } else {
                f8 = r2;
            }
            canvas.save();
            canvas.translate(f14 + f8 + gm.L(3.0f), d2);
            StaticLayout staticLayout2 = this.sa;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = yc2Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.sa != null) {
                f13 = f8 + this.ta + gm.L(10.0f) + 0.0f;
            }
            if (z2) {
                canvas.restore();
            }
            if (yc2Var.G) {
                cmb.S2.setAlpha(alpha);
            }
            yc2Var.K = f14;
        }
        if (this.pa != null) {
            boolean z10 = yc2Var.i1;
            if (z10) {
                f10 = this.O9;
            } else {
                f10 = f3;
            }
            float f17 = f10 + f13;
            if ((!this.Kb || !yc2Var.m1) && z10) {
                float f18 = yc2Var.L;
                float f19 = yc2Var.L1;
                f17 = (f17 * f19) + ((1.0f - f19) * f18);
            }
            f47 f47Var2 = this.L;
            if (f47Var2 != null) {
                e47 e47Var2 = f47Var2.m;
                if (e47Var2.j) {
                    f17 += e47Var2.g;
                }
            }
            if (yc2Var.x0) {
                f17 += this.wd;
            }
            boolean I32 = I3();
            k47 k47Var2 = this.Q5;
            if (I32) {
                if (k47Var2.O5()) {
                    b23 = b2("drawableMsgStickerViews");
                } else {
                    b23 = cmb.Z3;
                }
            } else if (!k47Var2.O3()) {
                if (z) {
                    b23 = cmb.M3;
                } else {
                    b23 = cmb.L3;
                }
            } else {
                if (z) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                b23 = b2(str2);
            }
            float r3 = hg0.r(b23, f17, gm.L(1.5f) + d2, cmb.S2.getTextSize() - gm.L(2.0f));
            if (z2) {
                canvas.save();
                canvas.scale(f11, f11, (((gm.L(3.0f) + b23.getIntrinsicWidth()) + this.qa) / 2.0f) + f17, b23.getBounds().centerY());
            }
            b23.setAlpha((int) (f12 * 255.0f));
            b23.draw(canvas);
            b23.setAlpha(255);
            if (yc2Var.e2 != null) {
                canvas.save();
                cmb.S2.setAlpha((int) ((d - yc2Var.L1) * alpha));
                canvas.translate(f17 + r3 + gm.L(3.0f), d2);
                rna.f(canvas, yc2Var.e2);
                canvas.restore();
                cmb.S2.setAlpha((int) (alpha * yc2Var.L1));
            }
            canvas.save();
            canvas.translate(f17 + r3 + gm.L(3.0f), d2);
            rna.f(canvas, this.pa);
            canvas.restore();
            if (z2) {
                canvas.restore();
            }
            f13 = this.qa + r3 + gm.L(f6) + f13;
            if (yc2Var.e2 != null) {
                cmb.S2.setAlpha(alpha);
            }
            yc2Var.M = f17;
        }
        boolean z11 = this.q6;
        if (!z11 && !yc2Var.C) {
            return;
        }
        boolean z12 = yc2Var.i1;
        if (z12) {
            f9 = this.O9;
        } else {
            f9 = f3;
        }
        float f20 = f9 + f13;
        boolean z13 = yc2Var.C;
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
            float f21 = yc2Var.E;
            if (z7) {
                f20 = f21;
            } else {
                float f22 = yc2Var.L1;
                f20 = (f20 * f22) + ((1.0f - f22) * f21);
            }
        }
        f47 f47Var3 = this.L;
        if (f47Var3 != null) {
            e47 e47Var3 = f47Var3.m;
            if (e47Var3.j) {
                f20 += e47Var3.g;
            }
        }
        if (yc2Var.x0) {
            f20 += this.wd;
        }
        boolean I33 = I3();
        k47 k47Var3 = this.Q5;
        if (I33) {
            if (k47Var3.O5()) {
                b22 = b2("drawableMsgStickerPinned");
            } else {
                b22 = cmb.Y3;
            }
        } else if (!k47Var3.O3()) {
            if (z) {
                b22 = cmb.U3;
            } else {
                b22 = cmb.T3;
            }
        } else {
            if (z) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            b22 = b2(str);
        }
        if (yc2Var.C) {
            boolean z14 = this.q6;
            float f23 = yc2Var.L1;
            float f24 = f12 * 255.0f;
            if (z14) {
                b22.setAlpha((int) (f24 * f23));
                r = hg0.r(b22, f20, d2, cmb.S2.getTextSize() + gm.L(1.0f));
            } else {
                b22.setAlpha((int) ((1.0f - f23) * f24));
                r = hg0.r(b22, f20, d2, cmb.S2.getTextSize() + gm.L(1.0f));
            }
        } else {
            b22.setAlpha((int) (f12 * 255.0f));
            r = hg0.r(b22, f20, d2, cmb.S2.getTextSize() + gm.L(1.0f));
        }
        if (z2) {
            canvas.save();
            canvas.scale(f11, f11, (r / 2.0f) + f20, b22.getBounds().centerY());
        }
        b22.draw(canvas);
        b22.setAlpha(255);
        if (z2) {
            canvas.restore();
        }
        yc2Var.D = f20;
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
        uj9 uj9Var;
        yc2 yc2Var;
        h47 h47Var;
        k47 k47Var;
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
        if ((!this.I5.isEmpty() || (this.w != null && (k47Var = this.Q5) != null && k47Var.D == 27)) && this.nb != f2) {
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
        k47 k47Var2 = this.Q5;
        if (k47Var2 != null && k47Var2.B2 != null) {
            int i11 = i - this.u0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int size = this.Q5.B2.size();
                yc2Var = this.ub;
                if (i12 >= size || ((h47) this.Q5.B2.get(i12)).p(this.Q5.B2, yc2Var) > i11) {
                    break;
                }
                i13 = i12;
                i12++;
            }
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            while (i13 < this.Q5.B2.size()) {
                float p = ((h47) this.Q5.B2.get(i13)).p(this.Q5.B2, yc2Var);
                float j = h47Var.f + p + h47Var.j(yc2Var) + h47Var.h;
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
                        bn bnVar = (bn) this.Ma.a.get(i17);
                        if (bnVar != null && bnVar.n) {
                            float y = (0.0f - getY()) - bnVar.r;
                            float y2 = (this.n - getY()) - bnVar.r;
                            Rect rect = bnVar.e;
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
        k47 k47Var3 = this.Q5;
        if (k47Var3 != null && (uj9Var = k47Var3.y2) != null) {
            ArrayList arrayList = uj9Var.g;
            int i18 = i - this.u0;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                qi9 qi9Var = (qi9) arrayList.get(i21);
                if (qi9Var.R || qi9Var.S) {
                    float f4 = qi9Var.N;
                    float f5 = i18 + i2;
                    if (q2(f4, qi9Var.H() + f4, i18, f5)) {
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
                qc2 qc2Var = (qc2) arrayList2.get(i24);
                int i25 = qc2Var.b + this.gb;
                if (q2(i25, i25 + qc2Var.c, this.Cc, i10 + this.Ec)) {
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
            if (Math.abs(this.g9 - Math.max(Math.min(gm.L(4.0f) + (-this.Dc), this.e9 - gm.L(42.0f)), gm.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        l39 l39Var = this.O;
        int i26 = l39Var.c;
        boolean q2 = q2(i26, i26 + l39Var.m, this.Cc, i9 + this.Ec);
        if (this.V4 != q2) {
            this.V4 = q2;
            invalidate();
        }
    }

    public final boolean E(MotionEvent motionEvent) {
        RectF rectF;
        mc2 mc2Var;
        fg0 fg0Var;
        boolean z = false;
        if (this.m9 != null && (rectF = this.p9) != null && (this.va != null || this.wa != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) P1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.m9.getText());
                ln0[] ln0VarArr = (ln0[]) spannableString.getSpans(0, spannableString.length(), ln0.class);
                if (contains && ln0VarArr != null && ln0VarArr.length > 0) {
                    z = true;
                }
                this.X2 = z;
                if (z && (fg0Var = this.Z2) != null) {
                    fg0Var.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.Z2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.X2 && (mc2Var = this.eb) != null) {
                    mc2Var.k(this);
                }
                fg0 fg0Var2 = this.Z2;
                if (fg0Var2 != null) {
                    fg0Var2.setState(StateSet.NOTHING);
                }
                this.X2 = false;
            }
            return this.X2;
        }
        this.X2 = false;
        return false;
    }

    public final void E0(boolean z) {
        float f;
        k47 k47Var;
        k47 k47Var2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i;
        RadialProgress2 radialProgress2;
        int i2;
        k47 k47Var3;
        if (this.eb != null && this.Q5.o4() && this.Q5.t2() && !this.Q5.l5() && !this.Q5.O0) {
            this.eb.U0(this);
            return;
        }
        k47 k47Var4 = this.Q5;
        if (k47Var4 != null && !k47Var4.M2()) {
            this.Q5.P = true;
        }
        int i3 = this.O3;
        RadialProgress2 radialProgress22 = this.R0;
        int i4 = this.a6;
        mm mmVar = this.U0;
        RadialProgress2 radialProgress23 = this.Q0;
        if (i3 == 0 && (!this.z1 || z)) {
            byte b = this.M1;
            if (b != 3 && b != 5 && (b != 7 || (k47Var3 = this.Q5) == null || !k47Var3.S4() || !this.Q5.z0)) {
                if (z) {
                    radialProgress22.o(false, 0.0f);
                } else {
                    radialProgress23.o(false, 0.0f);
                }
                if (this.e4 != null && (mmVar.E() || this.f4 == null)) {
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
                if (k47.Q5(this.Q5.k)) {
                    i = 2;
                } else {
                    i = 0;
                }
                k47 k47Var5 = this.Q5;
                int i5 = k47Var5.D;
                if (i5 != 1 && i5 != 20) {
                    if (i5 == 8) {
                        bc4.G(i4).X(this.N1, this.Q5, 2, 0);
                        if (this.Q5.H0 > 0) {
                            z0(this.N1);
                        }
                        radialProgress2 = radialProgress23;
                    } else if (this.Kb) {
                        if (k47Var5.k4()) {
                            bc4 G = bc4.G(i4);
                            TLRPC.Document F0 = this.Q5.F0();
                            k47 k47Var6 = this.Q5;
                            if (k47.Q5(k47Var6.k)) {
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            G.X(F0, k47Var6, 2, i2);
                            radialProgress2 = radialProgress23;
                        } else {
                            k47 k47Var7 = this.Q5;
                            k47Var7.h0 = 2.0f;
                            TLRPC.Document F02 = k47Var7.F0();
                            mmVar.r = true;
                            String str2 = str;
                            radialProgress2 = radialProgress23;
                            mmVar.Z(gn5.b(F02), null, gn5.f(photoSize, F02), str2, null, F02.size, null, this.Q5, 0);
                        }
                        this.xb = true;
                        invalidate();
                    } else {
                        radialProgress2 = radialProgress23;
                        if (i5 == 9) {
                            bc4.G(i4).X(this.N1, this.Q5, 2, 0);
                            if (this.Q5.H0 > 0) {
                                z0(this.N1);
                            }
                        } else {
                            byte b2 = this.M1;
                            if (b2 == 4) {
                                bc4.G(i4).X(this.N1, this.Q5, 1, i);
                                k47 k47Var8 = this.Q5;
                                if (k47Var8.H0 > 0) {
                                    z0(k47Var8.F0());
                                }
                            } else if (i5 == 0 && b2 != 0) {
                                if (b2 == 2) {
                                    mmVar.r = true;
                                    mmVar.Z(gn5.b(this.N1), null, gn5.c(this.e4, this.N1), this.i4, null, this.N1.size, null, this.Q5, i);
                                    k47 k47Var9 = this.Q5;
                                    k47Var9.h0 = 2.0f;
                                    if (k47Var9.H0 > 0) {
                                        z0(k47Var9.F0());
                                    }
                                } else if (b2 == 1) {
                                    bc4.G(i4).X(this.N1, this.Q5, 2, 0);
                                } else if (b2 == 8) {
                                    mmVar.Z(gn5.b(this.N1), this.h4, gn5.c(this.e4, this.N1), "b1", null, 0L, "jpg", this.Q5, 1);
                                }
                            } else {
                                mmVar.r = true;
                                mmVar.Z(gn5.f(this.e4, this.d4), this.h4, gn5.f(this.f4, this.d4), this.i4, this.g4, 0L, null, this.Q5, 0);
                            }
                        }
                    }
                } else {
                    radialProgress2 = radialProgress23;
                    mmVar.r = true;
                    mmVar.Z(gn5.f(this.e4, this.d4), this.h4, gn5.f(this.f4, this.d4), this.i4, this.g4, this.e4.size, null, this.Q5, i);
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
                bc4.G(i4).X(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
            }
            if (this.eb.n2(this, this.Q5)) {
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
            mmVar.r = false;
            byte b3 = this.M1;
            if (b3 != 3 && b3 != 5 && (b3 != 7 || (k47Var2 = this.Q5) == null || !k47Var2.S4())) {
                if (this.Q5.N3() && !this.z1 && (this.Q5.n4() || this.Q5.Y2())) {
                    if (radialProgress23.i.q != 6) {
                        this.eb.y1(this);
                        return;
                    }
                    return;
                }
                k47 k47Var10 = this.Q5;
                k47Var10.l1 = true;
                byte b4 = this.M1;
                if (b4 != 2 && b4 != 4 && b4 != 1 && b4 != 8) {
                    int i6 = k47Var10.D;
                    if (i6 != 0 && i6 != 1 && i6 != 20 && i6 != 8 && i6 != 5) {
                        if (i6 == 9) {
                            bc4.G(i4).f(this.Q5.F0());
                        }
                    } else {
                        fn5 z2 = fn5.z();
                        String str3 = mmVar.R;
                        if (str3 != null) {
                            z2.s.c(new jm5(z2, str3, (byte) 2));
                        }
                        mmVar.c();
                    }
                } else {
                    bc4.G(i4).f(this.N1);
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
            k47 k47Var11 = this.Q5;
            if (k47Var11 != null && k47Var11.D == 23) {
                this.eb.r0(this, 0.0f, 0.0f, false);
            } else if (this.M1 == 7 && k47Var11 != null && k47Var11.S4()) {
                if (this.X3 == 0) {
                    bc4.G(i4).X(this.N1, this.Q5, 2, 0);
                    this.Q5.l1 = false;
                }
                if (this.eb.n2(this, this.Q5)) {
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
                        k47 k47Var12 = MediaController.w().v0;
                        if (k47Var12 == null || !k47Var12.g4()) {
                            mmVar.u0 = true;
                            mmVar.w0(false);
                        }
                    } else {
                        mmVar.u0 = true;
                        mmVar.w0(false);
                    }
                    this.Q5.h0 = 0.0f;
                    this.O3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(false, 0.0f);
                bc4.G(i4).X(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
                this.O3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i3 != 3 && i3 != 0) {
            if (i3 == 4) {
                byte b6 = this.M1;
                if (b6 == 3 || b6 == 5 || (b6 == 7 && (k47Var = this.Q5) != null && k47Var.S4())) {
                    if ((this.Q5.N3() && (this.Q5.n4() || this.Q5.Y2())) || this.Q5.m4()) {
                        mc2 mc2Var = this.eb;
                        if (mc2Var != null && radialProgress23.i.q != 6) {
                            mc2Var.y1(this);
                            return;
                        }
                        return;
                    }
                    this.Q5.l1 = true;
                    bc4.G(i4).f(this.N1);
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
            mc2 mc2Var2 = this.eb;
            if (mc2Var2 != null) {
                mc2Var2.r0(this, f, f, false);
            }
        }
    }

    public final void E1(Canvas canvas, float f, Runnable runnable) {
        m37 m37Var;
        float f2;
        boolean z;
        boolean z2;
        int i;
        int i2;
        Canvas canvas2 = canvas;
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.R4()) {
            RadialProgress2 radialProgress2 = this.Q0;
            RectF rectF = radialProgress2.a;
            Paint paint = radialProgress2.g;
            wl6 wl6Var = radialProgress2.i;
            RectF rectF2 = radialProgress2.a;
            float cos = (((float) Math.cos((gm.U1(f, 190, 45) / 180.0f) * 3.141592653589793d)) * gm.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((gm.U1(f, 190, 45) / 180.0f) * 3.141592653589793d)) * gm.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = gm.P;
            rectF3.set(rectF2);
            rectF3.inset(-gm.L(1.0f), -gm.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (A2()) {
                m37Var = this.M6;
            } else {
                m37Var = this.L6;
            }
            wl6Var.B = m37Var;
            radialProgress2.j.B = m37Var;
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
                canvas2.scale(f4, f4, rectF2.centerX(), gm.R1(rectF2.top, rectF2.bottom, 0.5f));
                if (this.b1 == null) {
                    p09 p09Var = new p09(2131624022, gm.L(32.0f), gm.L(32.0f), true, null);
                    this.b1 = p09Var;
                    p09Var.M(this);
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
                    i2 = cmb.v0(i3, this.cc);
                } else {
                    i2 = radialProgress2.n;
                }
                this.c1.setColor(i2);
                this.e1.setColor(i2);
                wl6Var.a(false);
                this.c1.setShader(wl6Var.d.getShader());
                this.e1.setShader(wl6Var.d.getShader());
                rectF3.set(this.b1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f5 = f2;
                rectF3.inset(f5, f5);
                canvas2.drawRect(rectF3, this.c1);
                this.b1.l(canvas, this.d1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.e1.setAlpha((int) (255.0f * f3));
                this.e1.setStrokeWidth(gm.L(1.66f));
                RectF rectF4 = this.c4;
                rectF4.set(rectF2);
                rectF4.inset(gm.L(3.0f), gm.L(3.0f));
                gx9 gx9Var = this.E4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - gx9Var.K) * (-360.0f), false, this.e1);
                uqb uqbVar = this.m5;
                if (uqbVar == null) {
                    uqbVar = new uqb();
                    this.m5 = uqbVar;
                }
                uqbVar.a((1.0f - gx9Var.K) * (-360.0f), f3, canvas, this.e1, rectF4);
                canvas2 = canvas;
            } else {
                p09 p09Var2 = this.b1;
                if (p09Var2 != null) {
                    p09Var2.x(true);
                    this.b1 = null;
                    if (this.m5 != null) {
                        this.m5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, gm.L((f * 1.5f) + 10.0f) * f, this.a1);
            canvas2.restore();
            if (this.Z0 == null) {
                oc1 oc1Var = new oc1(3);
                this.Z0 = oc1Var;
                z = false;
                oc1Var.e(-1, 0, 0);
                oc1 oc1Var2 = this.Z0;
                oc1Var2.i = 14.0f;
                oc1Var2.c(10.0f);
                this.Z0.a.setStrokeWidth(gm.N(1.5f));
                z2 = true;
                this.Z0.d(1, false, false);
                this.Z0.j = -gm.N(0.33f);
                this.Z0.k = gm.N(0.33f);
            } else {
                z = false;
                z2 = true;
            }
            oc1 oc1Var3 = this.Z0;
            oc1Var3.i = f * 14.0f;
            oc1Var3.c(f * 10.0f);
            canvas2.saveLayerAlpha(cos - gm.L(10.0f), sin - gm.L(10.0f), gm.L(10.0f) + cos, gm.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, gm.L(10.0f) * f, paint);
            oc1 oc1Var4 = this.Z0;
            if (gm.B(paint.getColor()) <= 0.8f) {
                z2 = z;
            }
            oc1Var4.b(z2);
            oc1 oc1Var5 = this.Z0;
            oc1Var5.n = cos;
            oc1Var5.o = sin;
            oc1Var5.a(canvas2, f);
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

    public final void E3(int r21, defpackage.k47 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.E3(int, k47):void");
    }

    public final boolean F(MotionEvent motionEvent) {
        mc2 mc2Var;
        if (this.m9 == null || (mc2Var = this.eb) == null || !mc2Var.b()) {
            return false;
        }
        boolean contains = this.n9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.o9 == null) {
            this.o9 = new u51(this);
        }
        if (motionEvent.getAction() == 0) {
            this.o9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.o9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.o9.i) {
                this.eb.J1(this);
            }
            this.o9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.o9.c(false);
        }
        return this.o9.i;
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
            k47 k47Var = this.Q5;
            if (k47Var != null && !k47Var.M2()) {
                this.Q5.P = true;
            }
            byte b = this.M1;
            if (b != 3 && b != 5) {
                if (b == 4 || b == 7) {
                    z0(this.N1);
                    bc4 G = bc4.G(i4);
                    TLRPC.Document document = this.N1;
                    k47 k47Var2 = this.Q5;
                    if (k47.Q5(k47Var2.k)) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    G.X(document, k47Var2, 2, i2);
                    this.Q5.l1 = false;
                }
            } else {
                bc4 G2 = bc4.G(i4);
                TLRPC.Document document2 = this.N1;
                k47 k47Var3 = this.Q5;
                if (k47.Q5(k47Var3.k)) {
                    i = 2;
                } else {
                    i = 0;
                }
                G2.X(document2, k47Var3, 2, i);
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
            bc4.G(i4).f(this.N1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final cc2 F1() {
        cc2 cc2Var = this.K4;
        if (cc2Var == null) {
            cc2 cc2Var2 = new cc2(this);
            this.K4 = cc2Var2;
            return cc2Var2;
        }
        return cc2Var;
    }

    public final void F3() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.Q5.O3()) {
            TextPaint textPaint = cmb.n2;
            int i5 = cmb.Vc;
            textPaint.setColor(cmb.v0(i5, this.cc));
            cmb.w2.setColor(cmb.v0(i5, this.cc));
            cmb.o2.setColor(cmb.v0(i5, this.cc));
            cmb.p2.setColor(cmb.v0(i5, this.cc));
            cmb.q2.setColor(cmb.v0(i5, this.cc));
            TextPaint textPaint2 = cmb.w2;
            TextPaint textPaint3 = cmb.Y2;
            TextPaint textPaint4 = cmb.Z2;
            TextPaint textPaint5 = cmb.n2;
            TextPaint textPaint6 = cmb.o2;
            TextPaint textPaint7 = cmb.p2;
            TextPaint textPaint8 = cmb.q2;
            int v0 = cmb.v0(cmb.Xc, this.cc);
            textPaint8.linkColor = v0;
            textPaint7.linkColor = v0;
            textPaint6.linkColor = v0;
            textPaint5.linkColor = v0;
            textPaint4.linkColor = v0;
            textPaint3.linkColor = v0;
            textPaint2.linkColor = v0;
        } else {
            TextPaint textPaint9 = cmb.n2;
            int i6 = cmb.Uc;
            textPaint9.setColor(cmb.v0(i6, this.cc));
            cmb.w2.setColor(cmb.v0(i6, this.cc));
            cmb.o2.setColor(cmb.v0(i6, this.cc));
            cmb.p2.setColor(cmb.v0(i6, this.cc));
            cmb.q2.setColor(cmb.v0(i6, this.cc));
            TextPaint textPaint10 = cmb.w2;
            TextPaint textPaint11 = cmb.Y2;
            TextPaint textPaint12 = cmb.Z2;
            TextPaint textPaint13 = cmb.n2;
            TextPaint textPaint14 = cmb.o2;
            TextPaint textPaint15 = cmb.p2;
            TextPaint textPaint16 = cmb.q2;
            int v02 = cmb.v0(cmb.Wc, this.cc);
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
            ic2 ic2Var = this.D4;
            if (b != 3 && b != 7) {
                if (b == 5) {
                    if (this.Q5.O3()) {
                        int v03 = cmb.v0(cmb.mc, this.cc);
                        int v04 = cmb.v0(cmb.nc, this.cc);
                        int i7 = cmb.pc;
                        ic2Var.f(v03, v04, cmb.v0(i7, this.cc), cmb.v0(i7, this.cc), cmb.v0(cmb.oc, this.cc));
                    } else if (this.R1 && this.o8 != null) {
                        int b2 = cmb.b(cmb.v0(cmb.ke, this.cc), this.o8.h());
                        int b3 = cmb.b(cmb.v0(cmb.le, this.cc), this.o8.h());
                        int i8 = cmb.ne;
                        ic2Var.f(b2, b3, cmb.b(cmb.v0(i8, this.cc), this.o8.h()), cmb.b(cmb.v0(i8, this.cc), this.o8.h()), cmb.b(cmb.v0(cmb.me, this.cc), this.o8.h()));
                    } else {
                        int v05 = cmb.v0(cmb.ke, this.cc);
                        int v06 = cmb.v0(cmb.le, this.cc);
                        int i9 = cmb.ne;
                        ic2Var.f(v05, v06, cmb.v0(i9, this.cc), cmb.v0(i9, this.cc), cmb.v0(cmb.me, this.cc));
                    }
                }
            } else {
                boolean O3 = this.Q5.O3();
                gx9 gx9Var = this.E4;
                if (O3) {
                    int v07 = cmb.v0(cmb.qc, this.cc);
                    int v08 = cmb.v0(cmb.sc, this.cc);
                    int v09 = cmb.v0(cmb.rc, this.cc);
                    gx9Var.p = v07;
                    gx9Var.q = v08;
                    gx9Var.r = v09;
                    int v010 = cmb.v0(cmb.mc, this.cc);
                    int v011 = cmb.v0(cmb.nc, this.cc);
                    int i10 = cmb.pc;
                    ic2Var.f(v010, v011, cmb.v0(i10, this.cc), cmb.v0(i10, this.cc), cmb.v0(cmb.oc, this.cc));
                } else if (this.R1 && this.o8 != null) {
                    int b4 = cmb.b(cmb.v0(cmb.oe, this.cc), this.o8.h());
                    int b5 = cmb.b(cmb.v0(cmb.qe, this.cc), this.o8.h());
                    int b6 = cmb.b(cmb.v0(cmb.pe, this.cc), this.o8.h());
                    gx9Var.p = b4;
                    gx9Var.q = b5;
                    gx9Var.r = b6;
                    int b7 = cmb.b(cmb.v0(cmb.ke, this.cc), this.o8.h());
                    int b8 = cmb.b(cmb.v0(cmb.le, this.cc), this.o8.h());
                    int i11 = cmb.ne;
                    ic2Var.f(b7, b8, cmb.b(cmb.v0(i11, this.cc), this.o8.h()), cmb.b(cmb.v0(i11, this.cc), this.o8.h()), cmb.b(cmb.v0(cmb.me, this.cc), this.o8.h()));
                } else {
                    int v012 = cmb.v0(cmb.oe, this.cc);
                    int v013 = cmb.v0(cmb.qe, this.cc);
                    int v014 = cmb.v0(cmb.pe, this.cc);
                    gx9Var.p = v012;
                    gx9Var.q = v013;
                    gx9Var.r = v014;
                    int v015 = cmb.v0(cmb.ke, this.cc);
                    int v016 = cmb.v0(cmb.le, this.cc);
                    int i12 = cmb.ne;
                    ic2Var.f(v015, v016, cmb.v0(i12, this.cc), cmb.v0(i12, this.cc), cmb.v0(cmb.me, this.cc));
                }
            }
        }
        k47 k47Var = this.Q5;
        if (k47Var.D == 5) {
            TextPaint textPaint17 = cmb.S2;
            if (v2()) {
                if (this.Q5.O3()) {
                    i3 = cmb.ic;
                } else {
                    i3 = cmb.de;
                }
            } else {
                i3 = cmb.Yc;
            }
            int v017 = cmb.v0(i3, this.cc);
            boolean A2 = A2();
            k47 k47Var2 = this.Q5;
            if (A2) {
                if (k47Var2.O3()) {
                    i4 = cmb.dc;
                } else {
                    i4 = cmb.ee;
                }
            } else if (k47Var2.O3()) {
                i4 = cmb.ic;
            } else {
                i4 = cmb.de;
            }
            textPaint17.setColor(on2.f(getVideoTranscriptionProgress(), v017, cmb.v0(i4, this.cc)));
        } else if (this.C6) {
            if (k47Var.O5()) {
                cmb.S2.setColor(cmb.v0(cmb.Yc, this.cc));
            } else {
                cmb.S2.setColor(cmb.v0(cmb.ae, this.cc));
            }
        } else if (k47Var.O3()) {
            TextPaint textPaint18 = cmb.S2;
            if (A2()) {
                i2 = cmb.dc;
            } else {
                i2 = cmb.ic;
            }
            textPaint18.setColor(cmb.v0(i2, this.cc));
        } else {
            TextPaint textPaint19 = cmb.S2;
            if (A2()) {
                i = cmb.ee;
            } else {
                i = cmb.de;
            }
            textPaint19.setColor(cmb.v0(i, this.cc));
        }
    }

    public final boolean G(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.G(android.view.MotionEvent):boolean");
    }

    public final void G0() {
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            k47Var.L0 = !k47Var.L0;
            mc2 mc2Var = this.eb;
            if (mc2Var != null) {
                mc2Var.o1(this, true);
            }
        }
    }

    public final uc2 G1() {
        uc2 uc2Var = this.Y0;
        if (uc2Var == null) {
            uc2 uc2Var2 = new uc2(this);
            this.Y0 = uc2Var2;
            return uc2Var2;
        }
        return uc2Var;
    }

    public final boolean G2() {
        if (this.R5 != null) {
            return this.W5;
        }
        return this.I;
    }

    public final boolean G3() {
        f47 f47Var;
        k47 k47Var = this.Q5;
        if (k47Var != null && !k47Var.t1 && !k47Var.q4()) {
            c47 c47Var = this.M;
            if ((c47Var == null || ((f47Var = this.L) != null && f47Var.i && (c47Var.l & 8) == 0)) && !this.ub.x0) {
                if (!this.y || !k47.Q4(this.Q5.k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean H(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.H(android.view.MotionEvent):boolean");
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
        yc2 yc2Var = this.ub;
        if (yc2Var.x0) {
            if (yc2Var.D0) {
                f4 -= getTranslationY();
                f3 = yc2Var.h0;
            } else if (yc2Var.t0) {
                float f6 = yc2Var.L1;
                float f7 = 1.0f - f6;
                f5 = (f5 * f6) + (yc2Var.r0 * f7);
                f4 = (f4 * f6) + (f7 * yc2Var.s0);
            } else if (!k47.Q4(this.Q5.k) || !TextUtils.isEmpty(this.Q5.z)) {
                f3 = yc2Var.h0;
            }
            f5 += f3;
        }
        float f8 = f5;
        float f9 = f4;
        float f10 = 0.0f;
        ArrayList arrayList2 = null;
        if (yc2Var.b1) {
            float f11 = yc2Var.L1;
            if (f11 != 1.0f) {
                i47 i47Var = yc2Var.c1;
                if (i47Var != null) {
                    arrayList = i47Var.e;
                } else {
                    arrayList = null;
                }
                cn cnVar = yc2Var.P0;
                float f12 = (1.0f - f11) * f;
                if (i47Var != null) {
                    f2 = i47Var.d;
                } else {
                    f2 = 0.0f;
                }
                I0(f8, f9, canvas, arrayList, cnVar, false, f12, f2, true);
                i47 i47Var2 = this.m3;
                if (i47Var2 != null) {
                    arrayList2 = i47Var2.e;
                }
                ArrayList arrayList3 = arrayList2;
                cn cnVar2 = this.Ma;
                float f13 = f * yc2Var.L1;
                if (i47Var2 != null) {
                    f10 = i47Var2.d;
                }
                I0(f8, f9, canvas, arrayList3, cnVar2, true, f13, f10, true);
                return;
            }
        }
        i47 i47Var3 = this.m3;
        if (i47Var3 != null) {
            arrayList2 = i47Var3.e;
        }
        ArrayList arrayList4 = arrayList2;
        cn cnVar3 = this.Ma;
        if (i47Var3 != null) {
            f10 = i47Var3.d;
        }
        I0(f8, f9, canvas, arrayList4, cnVar3, true, f, f10, true);
    }

    public final boolean H1(pc2 pc2Var, b66 b66Var, Layout layout, int i) {
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
                    pc2Var.b = i;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (pc2Var.b != i) {
            return false;
        }
        b66Var.rewind();
        int spanStart = spanned.getSpanStart(this.A4);
        int spanEnd = spanned.getSpanEnd(this.A4);
        b66Var.c = true;
        b66Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, b66Var);
        b66Var.a();
        this.y4.k();
        return true;
    }

    public final boolean H2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        k47 k47Var = this.Q5;
        if (!k47Var.l2) {
            if (k47.B0(k47Var.k) != 489000 || (message = this.Q5.k) == null || message.fwd_from == null) {
                if (!this.Q5.q4() && !this.Q5.v3()) {
                    if (!this.g6 || this.v6) {
                        TLRPC.Message message2 = this.Q5.k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || pg3.n(peer) != pg3.n(this.Q5.k.peer_id)) {
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
                k47 k47Var = this.Q5;
                if (k47Var != null) {
                    if (!k47Var.j2 && !k47Var.q4()) {
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
        Drawable drawable;
        if (this.x7) {
            int x = (int) motionEvent.getX();
            int P1 = (int) P1(motionEvent);
            c47 c47Var = this.M;
            if (c47Var != null) {
                int i = c47Var.l;
                if ((i & 1) == 0 || (i & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt != this && (childAt instanceof rc2)) {
                            rc2 rc2Var = (rc2) childAt;
                            if (rc2Var.x7 && rc2Var.L == this.L) {
                                int i3 = rc2Var.M.l;
                                if ((i3 & 1) != 0 && (i3 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - rc2Var.getLeft(), (P1(motionEvent) + getTop()) - rc2Var.getTop(), 0);
                                    boolean I = rc2Var.I(obtain);
                                    obtain.recycle();
                                    return I;
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
                    mc2 mc2Var = this.eb;
                    if (mc2Var != null) {
                        if (this.u6) {
                            mc2Var.Z0(this);
                        } else {
                            mc2Var.F0(this);
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

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, defpackage.cn r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.I0(float, float, android.graphics.Canvas, java.util.ArrayList, cn, boolean, float, float, boolean):void");
    }

    public final boolean I1(pc2 pc2Var, b66 b66Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (H1(pc2Var, b66Var, ((h47) arrayList.get(i)).e, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean I2(k47 k47Var) {
        TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            mc2 mc2Var = this.eb;
            if (mc2Var == null || mc2Var.N()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean I3() {
        k47 k47Var;
        k47 k47Var2;
        byte b = this.Hb;
        if (b != 0) {
            if (b != 1) {
                return false;
            }
        } else if (!v2()) {
            if (!g4() && ((!this.C6 || ((this.m3 != null && !this.w1) || (!this.O.p && ((k47Var2 = this.Q5) == null || (!k47Var2.M2() && !this.Q5.g4()))))) && ((k47Var = this.Q5) == null || k47Var.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean J(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.Q5.D == 12) {
            sc2 sc2Var = this.w2;
            if (sc2Var == null) {
                sc2Var = new sc2(this);
                this.w2 = sc2Var;
            }
            rc2 rc2Var = sc2Var.a;
            k47 k47Var = rc2Var.Q5;
            int[] iArr = rc2Var.N2;
            Drawable[] drawableArr = rc2Var.J2;
            if (k47Var.D == 12) {
                int x = (int) motionEvent.getX();
                int P1 = (int) rc2Var.P1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = sc2Var.g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i = 0; i < sc2Var.g.size(); i++) {
                            oc2 oc2Var = (oc2) sc2Var.g.get(i);
                            float f = x;
                            float f2 = P1;
                            if (oc2Var.e.contains(f, f2)) {
                                u51 u51Var = oc2Var.f;
                                if (u51Var == null) {
                                    u51Var = new u51(rc2Var);
                                    oc2Var.f = u51Var;
                                }
                                u51Var.c(true);
                                fg0 fg0Var = oc2Var.g;
                                if (fg0Var != null) {
                                    fg0Var.setHotspot(f, f2);
                                    oc2Var.g.setState(iArr);
                                }
                                rc2Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f3 = x;
                    float f4 = P1;
                    if (rc2Var.v2.contains(f3, f4)) {
                        sc2Var.h = true;
                        rc2Var.Sa.c(true);
                        Drawable drawable2 = drawableArr[0];
                        if (drawable2 != null) {
                            drawable2.setHotspot(f3, f4);
                            drawableArr[0].setState(iArr);
                        }
                        rc2Var.invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (sc2Var.h) {
                        if (rc2Var.eb != null) {
                            ArrayList arrayList2 = sc2Var.g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                rc2Var.eb.t1(rc2Var, ((oc2) sc2Var.g.get(0)).a);
                            } else {
                                rc2Var.eb.t1(rc2Var, 5);
                            }
                        }
                        rc2Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        sc2Var.h = false;
                        rc2Var.Sa.c(false);
                        rc2Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = sc2Var.g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i2 = 0; i2 < sc2Var.g.size(); i2++) {
                            oc2 oc2Var2 = (oc2) sc2Var.g.get(i2);
                            u51 u51Var2 = oc2Var2.f;
                            if (u51Var2 != null && u51Var2.i) {
                                mc2 mc2Var = rc2Var.eb;
                                if (mc2Var != null) {
                                    mc2Var.t1(rc2Var, oc2Var2.a);
                                }
                                fg0 fg0Var2 = oc2Var2.g;
                                if (fg0Var2 != null) {
                                    fg0Var2.setState(StateSet.NOTHING);
                                }
                                oc2Var2.f.c(false);
                                rc2Var.playSoundEffect(0);
                                rc2Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (sc2Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x, P1);
                        return false;
                    }
                    ArrayList arrayList4 = sc2Var.g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= sc2Var.g.size()) {
                                break;
                            }
                            oc2 oc2Var3 = (oc2) sc2Var.g.get(i3);
                            u51 u51Var3 = oc2Var3.f;
                            if (u51Var3 != null && u51Var3.i) {
                                fg0 fg0Var3 = oc2Var3.g;
                                if (fg0Var3 != null) {
                                    fg0Var3.setHotspot(x, P1);
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

    public final void J0(Canvas canvas, float f) {
        oi7 oi7Var;
        k47 k47Var = this.Q5;
        if (k47Var != null && !k47Var.q4()) {
            float f2 = this.u0;
            yc2 yc2Var = this.ub;
            if (yc2Var.m2) {
                float f3 = yc2Var.o2;
                float f4 = yc2Var.L1;
                f2 = (f2 * f4) + ((1.0f - f4) * f3);
            }
            float f5 = f2;
            if (yc2Var.L1 != 1.0f && yc2Var.H0 && ((oi7Var = this.Mc) == null || !oi7Var.h)) {
                canvas.save();
                m37 m37Var = this.L6;
                if (m37Var != null) {
                    Rect bounds = m37Var.getBounds();
                    if (this.Q5.O3() && !this.C6 && !this.G) {
                        canvas.clipRect(gm.L(4.0f) + bounds.left, gm.L(4.0f) + bounds.top, bounds.right - gm.L(10.0f), bounds.bottom - gm.L(4.0f));
                    } else {
                        canvas.clipRect(gm.L(4.0f) + bounds.left, gm.L(4.0f) + bounds.top, bounds.right - gm.L(4.0f), bounds.bottom - gm.L(4.0f));
                    }
                }
                I0(this.o0, f5, canvas, yc2Var.I0, yc2Var.P0, false, (1.0f - yc2Var.L1) * f, this.Q5.x2, false);
                k47 k47Var2 = this.Q5;
                I0(this.o0, f5, canvas, k47Var2.B2, this.Ma, true, f * yc2Var.L1, k47Var2.x2, false);
                canvas.restore();
            } else {
                k47 k47Var3 = this.Q5;
                I0(this.o0, f5, canvas, k47Var3.B2, this.Ma, true, f, k47Var3.x2, false);
            }
        }
        if (G3()) {
            H0(canvas, f);
        }
    }

    public final void J1() {
        k47 k47Var = this.R5;
        if (k47Var == null) {
            k47Var = this.Q5;
        }
        k47 k47Var2 = k47Var;
        this.Q5 = null;
        z3(k47Var2, this.L, this.G, this.F, this.H, false);
    }

    public final boolean J2(defpackage.k47 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.J2(k47):boolean");
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

    public final boolean K(MotionEvent motionEvent) {
        float f;
        mc2 mc2Var;
        k47 k47Var = this.Q5;
        if (k47Var == null || k47Var.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f2 = 0.0f;
        if (this.j0 == 0) {
            f = 0.0f;
        } else {
            f = 18.0f;
        }
        float L = timeX - gm.L(f);
        float f3 = this.M9;
        if (this.Q5.B0) {
            f2 = 1.0f - this.k4;
        }
        int L2 = ((int) ((f3 * f2) + L)) - gm.L(2.0f);
        int timeY = ((int) getTimeY()) - gm.L(2.0f);
        RectF rectF = gm.P;
        rectF.set(L2, timeY, gm.L(16.0f) + L2 + this.M9, gm.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), P1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.l0 == null) {
                    this.l0 = new u51(this);
                }
                this.sc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.sc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.sc && (mc2Var = this.eb) != null) {
                mc2Var.i2(this);
            }
            this.sc = false;
        } else if (motionEvent.getAction() == 3) {
            this.sc = false;
        }
        u51 u51Var = this.l0;
        if (u51Var != null) {
            u51Var.c(this.sc);
        }
        return this.sc;
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        if (this.R5 != null) {
            return this.U5;
        }
        return this.G;
    }

    public final void K3() {
        mm mmVar = this.U0;
        L3((mmVar.N0 / 2.0f) + mmVar.L0, (mmVar.O0 / 2.0f) + mmVar.M0);
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        k47 k47Var = this.Q5;
        if (k47Var != null && imageReceiver == this.U0 && k47Var.J2()) {
            this.eb.T(this.Q5);
        }
    }

    public final boolean L0() {
        k47 k47Var;
        if (this.dc && (k47Var = this.Q5) != null && k47Var.O3() && cmb.v0(cmb.tb, this.cc) != 0) {
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
        rc2 rc2Var;
        mm mmVar = this.U0;
        this.ba = (float) Math.sqrt(Math.pow(mmVar.O0, 2.0d) + Math.pow(mmVar.N0, 2.0d));
        k47 k47Var = this.Q5;
        if (!k47Var.O0 && this.Y9 == 0.0f) {
            if (k47Var.D == 3) {
                k47Var.M1 = true;
                k47Var.Q0 = true;
                rc2Var = this;
                rc2Var.y3(k47Var, this.L, this.G, this.F, this.H, this.I);
                k47 k47Var2 = rc2Var.Q5;
                k47Var2.Q0 = false;
                k47Var2.M1 = false;
                if (rc2Var.L != null) {
                    rc2Var.Q0.o(false, 0.0f);
                }
            } else {
                rc2Var = this;
            }
            rc2Var.Z9 = f;
            rc2Var.aa = f2;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(pqe.a(rc2Var.ba * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(d53.j);
            duration.addUpdateListener(new et1(rc2Var, (byte) 7));
            duration.addListener(new lc2(rc2Var, (byte) 0));
            duration.start();
        }
    }

    public final boolean M(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        if (this.T1) {
            uc2 G1 = G1();
            rc2 rc2Var = G1.a;
            boolean z = rc2Var.T1;
            ArrayList arrayList = rc2Var.I5;
            i66 i66Var = rc2Var.u4;
            if (z) {
                int x = (int) motionEvent.getX();
                int P1 = (int) rc2Var.P1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (rc2Var.O1 && rc2Var.y1 && rc2Var.O3 != -1 && x >= (i2 = rc2Var.K3) && x <= gm.L(48.0f) + i2 && P1 >= (i3 = rc2Var.L3) && P1 <= gm.L(48.0f) + i3 && rc2Var.Q0.i.q != 4) {
                        rc2Var.P3 = true;
                        rc2Var.invalidate();
                        return true;
                    } else if (rc2Var.O1 && rc2Var.U0.H(x, P1)) {
                        G1.v = true;
                        return true;
                    } else if (rc2Var.p2 == null || P1 < rc2Var.Y1) {
                        return false;
                    } else {
                        try {
                            int L = x - ((rc2Var.p0 + gm.L(10.0f)) + rc2Var.a2);
                            int i4 = P1 - rc2Var.Y1;
                            int lineForVertical = rc2Var.p2.getLineForVertical(i4);
                            float f = L;
                            int offsetForHorizontal = rc2Var.p2.getOffsetForHorizontal(lineForVertical, f);
                            float lineLeft = rc2Var.p2.getLineLeft(lineForVertical);
                            if (lineLeft > f || lineLeft + rc2Var.p2.getLineWidth(lineForVertical) < f) {
                                return false;
                            }
                            Spannable spannable = (Spannable) rc2Var.Q5.y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof d6c) && !d6c.h) || gm.A1()) {
                                return false;
                            }
                            m66 m66Var = rc2Var.r4;
                            if (m66Var == null || m66Var.i != clickableSpanArr[0]) {
                                i66Var.l(m66Var, true);
                                m66 m66Var2 = new m66(clickableSpanArr[0], rc2Var.cc, f, i4, 0);
                                rc2Var.r4 = m66Var2;
                                if (rc2Var.Q5.O3()) {
                                    i = cmb.Cc;
                                } else {
                                    i = cmb.Be;
                                }
                                m66Var2.d(cmb.v0(i, rc2Var.cc));
                                rc2Var.y0 = -10;
                                rc2Var.v4 = 2;
                                try {
                                    b66 b = rc2Var.r4.b();
                                    int[] Z1 = Z1(spannable, rc2Var.r4.i);
                                    b.d(rc2Var.p2, Z1[0], 0.0f);
                                    rc2Var.p2.getSelectionPath(Z1[0], Z1[1], b);
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                i66Var.a(rc2Var.r4, 2);
                            }
                            rc2Var.invalidate();
                            return true;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    if (rc2Var.v4 != 2 && !G1.v && !rc2Var.P3) {
                        rc2Var.i3(2);
                        return false;
                    } else if (rc2Var.P3) {
                        rc2Var.P3 = false;
                        rc2Var.playSoundEffect(0);
                        rc2Var.E0(false);
                        rc2Var.invalidate();
                        return false;
                    } else {
                        m66 m66Var3 = rc2Var.r4;
                        if (m66Var3 != null) {
                            CharacterStyle characterStyle = m66Var3.i;
                            if (characterStyle instanceof URLSpan) {
                                l11.u(rc2Var.getContext(), ((URLSpan) rc2Var.r4.i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(rc2Var);
                            }
                            rc2Var.i3(2);
                            return false;
                        }
                        G1.v = false;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                break;
                            }
                            wp0 wp0Var = (wp0) arrayList.get(i5);
                            if (kfb.c(wp0Var.i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                rc2Var.playSoundEffect(0);
                                rc2Var.eb.L0(rc2Var, wp0Var.i);
                                rc2Var.invalidate();
                                break;
                            }
                            i5++;
                        }
                        rc2Var.i3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean M0(android.graphics.Canvas r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.M0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final boolean M2() {
        if (this.Kb && this.Lb) {
            return true;
        }
        return false;
    }

    public final boolean M3() {
        mc2 mc2Var;
        if (getCurrentMessagesGroup() == null && (mc2Var = this.eb) != null && mc2Var.p2() != null && this.eb.p2().y(this.Q5)) {
            return true;
        }
        return false;
    }

    @Override
    public final void N(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.N(java.lang.String):void");
    }

    public void N0(Canvas canvas) {
        if (!this.Q5.O0 && this.Y9 != 1.0f) {
            mm mmVar = this.U0;
            int[] iArr = mmVar.X0;
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
            RectF rectF = gm.P;
            rectF.set(mmVar.L0, mmVar.M0, mmVar.w(), mmVar.x());
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
                mmVar.h(canvas, null);
            } else {
                float f5 = mmVar.L0;
                float f6 = mmVar.M0;
                float f7 = mmVar.N0;
                float f8 = mmVar.O0;
                ImageReceiver imageReceiver = this.V0;
                imageReceiver.i0(f5, f6, f7, f8);
                imageReceiver.s0(mmVar.X0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final boolean N2() {
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.R4()) {
            return false;
        }
        return true;
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.O():void");
    }

    public void O0(Canvas canvas) {
        if (this.ca == null) {
            return;
        }
        canvas.save();
        mm mmVar = this.U0;
        canvas.translate(mmVar.L0, mmVar.M0);
        this.ca.c(canvas, this, (int) mmVar.N0, (int) mmVar.O0, mmVar.getAlpha(), this.Tc);
        canvas.restore();
        invalidate();
    }

    public final m37 O1(boolean z) {
        boolean z2;
        if (z) {
            c47 c47Var = this.M;
            if (c47Var != null && (c47Var.l & 8) == 0 && this.L.i && !this.K) {
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
                this.L6 = (m37) b2("drawableMsgIn");
            } else {
                this.L6 = (m37) b2("drawableMsgInMedia");
            }
        }
        this.L6.f();
        return this.L6;
    }

    public final boolean O2() {
        k47 k47Var;
        if (this.Y6 && (k47Var = this.Q5) != null && !k47Var.O3() && this.M == null && !v2()) {
            return true;
        }
        return false;
    }

    public final boolean P(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.P(android.view.MotionEvent):boolean");
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k47 k47Var;
        mc2 mc2Var;
        String str;
        boolean c = kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i = 1;
        int i2 = this.a6;
        if (!c && !kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                a6a B = a6a.B(i2);
                k47 k47Var2 = this.Q5;
                if (k47Var2 != null && keyboardButtonProto != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(k47.B0(k47Var2.k));
                    sb.append("_");
                    sb.append(k47Var2.e1());
                    sb.append("_");
                    sb.append(Utilities.f(keyboardButtonProto.getData()));
                    sb.append("_");
                    if (kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb.append(str);
                    return B.n.containsKey(sb.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (mc2Var = this.eb) != null && mc2Var.n1(this, 3) && TextUtils.equals(this.eb.P0(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            a6a B2 = a6a.B(i2);
            if (this.Q5 != null && keyboardButtonProto != null) {
                if (kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i = 3;
                } else if (!kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                return B2.r.containsKey(k47.B0(k47Var.k) + "_" + k47Var.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i);
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
                qc2 qc2Var = (qc2) arrayList.get(i);
                if (this.eb.J0(this, qc2Var.t, !qc2Var.i)) {
                    if (z) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = k47.B0(this.Q5.k);
                    int i2 = this.a6;
                    long M = sd2.M(oc7.r1(i2).L0(Long.valueOf(B0)), oc7.r1(i2).M0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) k47.m1(this.Q5);
                    int i3 = this.a6;
                    k47.Y5(i3, M, tL_messageMediaToDo, qc2Var.t.id, !qc2Var.i, ConnectionsManager.getInstance(i3).getCurrentTime());
                    if (!qc2Var.i) {
                        TLObject a2 = oc7.r1(i2).a2(M);
                        qc2Var.y.k(a2);
                        qc2Var.z.U(a2, qc2Var.y, null);
                        qc2Var.q = new uib(pg3.l(a2), 12.0f, null);
                    }
                    this.f7[i].f(-1, !qc2Var.i, true);
                    if (this.y3 != null) {
                        if (!this.Q5.O3() && k47.B0(this.Q5.k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.y3.t(jb6.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(k47.z0(tL_messageMediaToDo)), pg3.k(z8c.t0, this.Q5.Z0())), true, true);
                        } else {
                            this.y3.t(jb6.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(k47.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    qc2Var.i = !qc2Var.i;
                    invalidate();
                    return;
                }
                this.Z4 = false;
            }
        }
    }

    public final boolean Q(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.Q(android.view.MotionEvent):boolean");
    }

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final String Q1(k47 k47Var) {
        if (this.B5) {
            return jb6.N0("PsaMessage_" + k47Var.k.fwd_from.psa_type);
        }
        return jb6.M0(2131750497, null);
    }

    public final boolean Q2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.Q2():boolean");
    }

    public final void Q3() {
        k47 k47Var;
        int i;
        boolean z;
        uj9 uj9Var;
        ArrayList arrayList;
        if (this.Kc && (k47Var = this.Q5) != null) {
            boolean z2 = false;
            if (k47Var.X1) {
                i = vm.f();
            } else {
                i = 0;
            }
            i47 i47Var = this.m3;
            if (i47Var != null && (arrayList = i47Var.e) != null) {
                this.Ma = gn.update(i, (View) this, false, this.Ma, (ArrayList<h47>) arrayList);
            } else {
                mc2 mc2Var = this.eb;
                if (mc2Var != null && mc2Var.f()) {
                    z = false;
                } else {
                    z = true;
                }
                this.Ma = gn.update(i, this, z, this.Ma, this.Q5.B2);
            }
            k47 k47Var2 = this.Q5;
            if (k47Var2.D == 36 && (uj9Var = k47Var2.y2) != null) {
                mc2 mc2Var2 = this.eb;
                if (mc2Var2 == null || !mc2Var2.f()) {
                    z2 = true;
                }
                uj9Var.v = z2;
                this.Q5.y2.a0(i);
            }
        }
    }

    public final boolean R() {
        return bc4.G(this.a6).k(getFilename());
    }

    public final void R0(android.graphics.Canvas r34, defpackage.i47 r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.R0(android.graphics.Canvas, i47, boolean, boolean, float):void");
    }

    public final float R1(boolean z) {
        float f;
        a09 a09Var;
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
        if (!z && (a09Var = this.o3) != null) {
            return (1.0f - a09Var.k.e(false, 1.0f)) * f;
        }
        return f;
    }

    public final boolean R2() {
        k47 k47Var = this.Q5;
        uj9 uj9Var = k47Var.y2;
        if (k47Var.D == 36 && uj9Var != null) {
            ArrayList arrayList = uj9Var.g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof al9)) {
                return true;
            }
        }
        return false;
    }

    public final void R3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.R3(boolean, boolean, boolean):void");
    }

    public final boolean S(MotionEvent motionEvent) {
        fg0 fg0Var;
        rc2 rc2Var;
        mc2 mc2Var;
        TLRPC.Chat chat;
        int i;
        TLRPC.Chat chat2;
        if (this.w9 && this.h9 != null && (fg0Var = this.V2) != null && (this.va != null || this.wa != null)) {
            boolean contains = fg0Var.getBounds().contains((int) motionEvent.getX(), (int) P1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.W2 = contains;
                if (contains) {
                    this.V2.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.V2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (mc2Var = this.eb) != null) {
                    if (this.S6) {
                        TLRPC.User user = this.Fa;
                        if (user != null && user.bot_inline_placeholder == null) {
                            mc2Var.v0(this, user.id);
                        } else {
                            String p = m9c.p(user);
                            mc2 mc2Var2 = this.eb;
                            if (p == null) {
                                p = this.Q5.k.via_bot_name;
                            }
                            mc2Var2.h0(p);
                        }
                    } else {
                        TLRPC.User user2 = this.va;
                        if (user2 != null) {
                            mc2Var.W(this, user2, motionEvent.getX(), P1(motionEvent));
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
                                rc2Var = this;
                                mc2Var.W1(rc2Var, chat2, i, this.h1, this.i1, false);
                                rc2Var.V2.setState(StateSet.NOTHING);
                                rc2Var.W2 = false;
                                return rc2Var.W2;
                            }
                        }
                    }
                }
                rc2Var = this;
                rc2Var.V2.setState(StateSet.NOTHING);
                rc2Var.W2 = false;
                return rc2Var.W2;
            }
            rc2Var = this;
            return rc2Var.W2;
        }
        this.W2 = false;
        return false;
    }

    public final void S0(Canvas canvas) {
        k47 k47Var;
        float f;
        k47 k47Var2 = this.Q5;
        if ((k47Var2 == null || !k47Var2.q4()) && (k47Var = this.Q5) != null && !k47Var.n4()) {
            k47 k47Var3 = this.Q5;
            if (k47Var3.D != 27 && !k47Var3.m4() && this.m1 != null) {
                if (this.n1 || this.o1) {
                    c47 c47Var = this.M;
                    if (c47Var != null) {
                        int i = c47Var.l;
                        if ((i & 8) == 0 || (i & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y = getY() + getPaddingTop();
                    f47 f47Var = this.L;
                    if (f47Var != null && f47Var.d.size() > 1) {
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
        al9 f4 = f4();
        if (f4 != null) {
            long j = this.mc;
            long j2 = 0;
            if (j != 0) {
                hyc hycVar = f4.e0;
                if (hycVar != null) {
                    j2 = hycVar.t;
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
        k47 k47Var = this.Q5;
        int i9 = k47Var.D;
        float f5 = 0.0f;
        yc2 yc2Var = this.ub;
        int i10 = 0;
        boolean z = true;
        if (i9 != 1 && i9 != 20 && this.M1 != 4 && i9 != 8 && i9 != 23) {
            float f6 = 10.0f;
            float f7 = 11.0f;
            if (this.S1) {
                int i11 = this.N6;
                if (!k47Var.O3()) {
                    f7 = 17.0f;
                }
                this.s3 = gm.L(f7) + i11 + this.r3;
                int i12 = this.v0 - this.u3;
                if (this.J) {
                    f6 = 9.0f;
                }
                int L2 = ((i12 - gm.L(f6)) - this.W1) - gm.L(17.0f);
                if (this.x7 && this.R8 != 3) {
                    i8 = getCommentButtonHeight();
                } else {
                    i8 = 0;
                }
                L = L2 - i8;
                this.t3 = gm.R1(L, gm.L(9.0f) + this.gb, a3());
            } else {
                if (this.Kb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.Q5.O3()) {
                        i7 = 0;
                    } else {
                        i7 = 6;
                    }
                    this.s3 = gm.L(i7 + 11) + backgroundDrawableLeft;
                } else {
                    int i13 = this.N6;
                    if (!k47Var.O3() && !this.C6 && !this.K) {
                        f7 = 17.0f;
                    }
                    this.s3 = gm.L(f7) + i13 + this.r3;
                }
                int i14 = this.v0 - this.u3;
                if (this.J) {
                    f6 = 9.0f;
                }
                int L3 = i14 - gm.L(f6);
                if (this.x7 && this.R8 != 3) {
                    i5 = getCommentButtonHeight();
                } else {
                    i5 = 0;
                }
                int i15 = L3 - i5;
                l39 l39Var = this.O;
                if (!l39Var.p) {
                    i6 = l39Var.n;
                } else {
                    i6 = 0;
                }
                L = i15 - i6;
                this.t3 = gm.R1(L, gm.L(9.0f) + this.gb, a3());
            }
        } else {
            if (yc2Var.g0) {
                f2 = yc2Var.n0;
                f3 = yc2Var.o0;
                f = yc2Var.q0;
            } else {
                mm mmVar = this.U0;
                float f8 = mmVar.L0;
                float f9 = mmVar.M0;
                f = mmVar.O0;
                f2 = f8;
                f3 = f9;
            }
            this.s3 = f2 + gm.L(5.0f) + this.r3;
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
            L = f3 + f + gm.L(6.0f);
            float L4 = f + gm.L(6.0f);
            i47 i47Var = this.m3;
            if (i47Var == null) {
                i = 0;
            } else {
                i = -i47Var.b();
            }
            this.t3 = gm.R1(L4, i - gm.L(4.0f), a3()) + f3;
            z = false;
        }
        this.s3 += getExtraTextX();
        k47 k47Var2 = this.Q5;
        if (k47Var2 != null && (i2 = k47Var2.D) != 0 && i2 != 24 && !k47Var2.v3() && !this.Q5.q4()) {
            if (z && h2()) {
                this.t3 -= (1.0f - a3()) * (gm.L(16.0f) + this.s0.r);
            }
            if (z) {
                tc2 tc2Var = this.s0;
                if (tc2Var != null) {
                    i4 = tc2Var.r;
                } else {
                    i4 = 0;
                }
                i3 = gm.L(14.0f) + i4;
            } else {
                i3 = 0;
            }
            float f10 = L - i3;
            i47 i47Var2 = this.m3;
            if (i47Var2 != null) {
                i10 = gm.L(4.0f) + i47Var2.c(yc2Var);
            }
            this.r0 = (int) ((f10 + gm.U1(a3(), i10, gm.L(6.0f))) - yc2Var.k0);
        }
        k47 k47Var3 = this.Q5;
        if (k47Var3 != null && k47Var3.D == 17) {
            float f11 = this.t3;
            xc2 xc2Var = this.x2;
            if (xc2Var != null) {
                f5 = xc2Var.q;
            }
            this.t3 = f11 + f5;
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        mc2 mc2Var;
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
                if (motionEvent.getAction() == 1 && this.c3 && (mc2Var = this.eb) != null && (user = this.va) != null) {
                    Drawable drawable = this.Ca.f[0];
                    if (drawable instanceof vm) {
                        document = ((vm) drawable).e;
                    } else {
                        document = null;
                    }
                    mc2Var.z(this, user, document, this.Ba);
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
        yc2 yc2Var = this.ub;
        l39 l39Var = this.O;
        if (z) {
            if (!this.Q5.O3()) {
                ai7 ai7Var = cmb.D3;
                if (I3()) {
                    v0 = cmb.v0(cmb.jd, this.cc);
                } else {
                    if (z3) {
                        i = cmb.Eb;
                    } else {
                        i = cmb.jd;
                    }
                    v0 = cmb.v0(i, this.cc);
                }
                ai7Var.a(v0);
                if (I3()) {
                    f7 = (getPhotoBottom() + this.w0) - gm.L(9.0f);
                } else {
                    if (!this.G && !this.F) {
                        f6 = 8.5f;
                    } else {
                        f6 = 9.5f;
                    }
                    float L2 = (f - gm.L(f6)) + f3;
                    if (this.Kb && !v2()) {
                        if (this.K) {
                            f8 = 4.0f;
                        } else {
                            f8 = 5.0f;
                        }
                        f7 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (l39Var.i(yc2Var.L1) + gm.L(f8)));
                    } else {
                        f7 = L2;
                    }
                }
                if (!this.Q5.r1) {
                    i2 = gm.L(11.0f);
                }
                hg0.t(ai7Var, f4 + i2, f7 - gm.L(12.0f));
                ai7Var.setAlpha((int) (f10 * 255.0f));
                if (z4) {
                    canvas.save();
                    canvas.scale(f9, f9, ai7Var.getBounds().centerX(), ai7Var.getBounds().centerY());
                }
                ai7Var.draw(canvas);
                ai7Var.setAlpha(255);
                invalidate();
                if (z4) {
                    canvas.restore();
                }
            }
        } else if (z2 && !this.Q5.O3()) {
            if (!this.Q5.r1) {
                i2 = gm.L(11.0f);
            }
            float f11 = f4 + i2;
            float f12 = 21.5f;
            if (I3()) {
                L = (getPhotoBottom() + this.w0) - gm.L(21.5f);
            } else {
                if (!this.G && !this.F) {
                    f12 = 20.5f;
                }
                L = (f - gm.L(f12)) + f3;
                if (this.Kb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * l39Var.i(yc2Var.L1);
                }
            }
            RectF rectF = this.c4;
            rectF.set(f11, L, gm.L(14.0f) + f11, gm.L(14.0f) + L);
            int alpha = cmb.a2.getAlpha();
            int i3 = (int) (f10 * 255.0f);
            cmb.a2.setAlpha(i3);
            if (z4) {
                canvas.save();
                canvas.scale(f9, f9, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), cmb.a2);
            cmb.a2.setAlpha(alpha);
            Drawable b2 = b2("drawableMsgError");
            hg0.t(b2, f11 + gm.L(6.0f), L + gm.L(2.0f));
            b2.setAlpha(i3);
            b2.draw(canvas);
            b2.setAlpha(255);
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final String T1(long j) {
        TLRPC.Chat L0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a6;
        if (i > 0) {
            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
            if (W1 != null) {
                return m9c.r(W1);
            }
            return null;
        } else if (i < 0 && (L0 = oc7.r1(i2).L0(Long.valueOf(-j))) != null) {
            return L0.title;
        } else {
            return null;
        }
    }

    public final void T2(int i, int i2) {
        c47 c47Var = this.M;
        float f = c47Var.p;
        float f2 = c47Var.r;
        this.Dd = f - f2;
        this.Ed = f2;
        this.Fd = (int) c47Var.q;
        this.Gd = (int) ((i * c47Var.s) / (i2 / 1000.0f));
    }

    public final void T3() {
        TLRPC.Chat chat;
        if (this.Q5 != null) {
            int i = this.a6;
            oc7 r1 = oc7.r1(i);
            TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.k.fwd_from;
            long e = z8c.h(i).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (k47.B0(this.Q5.k) == e || k47.B0(this.Q5.k) == 1271266957)) {
                this.wa = oc7.r1(i).L0(Long.valueOf(messageFwdHeader.from_id.channel_id));
                return;
            }
            if (messageFwdHeader != null) {
                if (k47.B0(this.Q5.k) == 489000) {
                    long n = pg3.n(messageFwdHeader.from_id);
                    if (n >= 0) {
                        this.va = r1.W1(Long.valueOf(n));
                        return;
                    } else {
                        this.wa = r1.L0(Long.valueOf(-n));
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
                                this.va = r1.W1(Long.valueOf(peer2.user_id));
                                return;
                            }
                        }
                        this.va = r1.W1(Long.valueOf(j));
                        return;
                    } else if (peer.channel_id != 0) {
                        if (this.Q5.j4()) {
                            TLRPC.Peer peer3 = messageFwdHeader.from_id;
                            if (peer3 instanceof TLRPC.TL_peerUser) {
                                this.va = r1.W1(Long.valueOf(peer3.user_id));
                                return;
                            }
                        }
                        this.wa = r1.L0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                        return;
                    } else {
                        long j2 = peer.chat_id;
                        if (j2 != 0) {
                            TLRPC.Peer peer4 = messageFwdHeader.from_id;
                            if (peer4 instanceof TLRPC.TL_peerUser) {
                                this.va = r1.W1(Long.valueOf(peer4.user_id));
                                return;
                            } else {
                                this.wa = r1.L0(Long.valueOf(j2));
                                return;
                            }
                        }
                        return;
                    }
                } else if ((messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || k47.B0(this.Q5.k) == e)) {
                    this.va = r1.W1(Long.valueOf(messageFwdHeader.from_id.user_id));
                    return;
                }
            }
            if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || k47.B0(this.Q5.k) == e)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.va = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || k47.B0(this.Q5.k) == e)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.va = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = k47.B0(this.Q5.k);
                long Z0 = this.Q5.Z0();
                TLRPC.Chat chat2 = null;
                if (pg3.y(Z0)) {
                    chat = r1.L0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (pg3.y(B0)) {
                    chat2 = r1.L0(Long.valueOf(-B0));
                }
                if (pg3.B(k47.B0(this.Q5.k))) {
                    if (this.Q5.O3()) {
                        this.va = z8c.h(i).f();
                        return;
                    }
                    TLRPC.EncryptedChat Z02 = r1.Z0(Integer.valueOf((int) (k47.B0(this.Q5.k) & 4294967295L)));
                    if (Z02 != null) {
                        this.va = r1.W1(Long.valueOf(Z02.user_id));
                    }
                } else if (pg3.D(Z0) && (!this.Q5.k.post || (chat != null && chat.signature_profiles))) {
                    this.va = r1.W1(Long.valueOf(Z0));
                } else if (this.Q5.k.post && chat2 != null && !chat2.signature_profiles) {
                    this.wa = chat2;
                } else if (pg3.y(Z0)) {
                    this.wa = chat;
                } else {
                    TLRPC.Message message = this.Q5.k;
                    if (message.post) {
                        this.wa = r1.L0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean U(defpackage.k47 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.U(k47):boolean");
    }

    public final void U0(Canvas canvas, float f) {
        int i;
        if (this.R8 == 3) {
            int L = gm.L(32.0f);
            if (this.n7 != null) {
                this.e9 -= gm.L(18.0f);
                L += gm.L(18.0f);
            }
            float f2 = this.d9;
            float f3 = this.e9 + L;
            RectF rectF = this.c4;
            rectF.set(f2, this.e9, gm.L(32.0f) + f2, f3);
            x();
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i2 != 0) {
                int alpha = c2("paintChatActionBackground").getAlpha();
                c2("paintChatActionBackground").setAlpha((int) (alpha * f));
                canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), c2("paintChatActionBackground"));
                c2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float L2 = gm.L(16.0f);
                float L3 = gm.L(16.0f);
                if (this.U8) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, L2, L3, c2(str));
            }
            if (i2()) {
                if (i2 != 0) {
                    int alpha2 = cmb.g2.getAlpha();
                    cmb.g2.setAlpha((int) (alpha2 * f));
                    canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.g2);
                    cmb.g2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.g2);
                }
            }
            Drawable P0 = cmb.P0("drawableCommentSticker");
            if (v2()) {
                Drawable drawable = this.Wc;
                if (drawable == null) {
                    drawable = P0.getConstantState().newDrawable().mutate();
                    this.Wc = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Sa, this.cc), PorterDuff.Mode.SRC_IN));
                P0 = this.Wc;
            }
            hg0.t(P0, this.d9 + gm.L(4.0f), this.e9 + gm.L(4.0f));
            if (i2 != 0) {
                P0.setAlpha((int) (f * 255.0f));
                P0.draw(canvas);
                P0.setAlpha(255);
            } else {
                P0.draw(canvas);
            }
            if (this.n7 != null) {
                TextPaint textPaint = cmb.D2;
                if (v2()) {
                    i = cmb.Sa;
                } else {
                    i = cmb.Nd;
                }
                textPaint.setColor(cmb.v0(i, this.cc));
                cmb.D2.setAlpha((int) (f * 255.0f));
                yc2 yc2Var = this.ub;
                if (yc2Var.V) {
                    if (yc2Var.W != null) {
                        canvas.save();
                        cmb.D2.setAlpha((int) ((1.0d - yc2Var.L1) * 255.0d * f));
                        canvas.translate(this.d9 + ((gm.L(32.0f) - yc2Var.Y) / 2), this.e9 + gm.L(30.0f));
                        yc2Var.W.draw(canvas);
                        canvas.restore();
                    }
                    cmb.D2.setAlpha((int) (yc2Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.d9 + ((gm.L(32.0f) - this.v7) / 2), this.e9 + gm.L(30.0f));
                this.n7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(boolean z) {
        d53 d53Var;
        float f = this.vd;
        k47 k47Var = this.Q5;
        if (k47Var != null && !k47Var.O3()) {
            int i = 0;
            if (z) {
                if (!this.n1) {
                    if (this.o1) {
                        d53Var = d53.i;
                    }
                } else {
                    d53Var = d53.g;
                }
                this.r1 = (int) Math.ceil(d53Var.getInterpolation(this.p1) * gm.L(35.0f));
                if (this.Q5.D == 36) {
                    if (gm.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
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
                return (gm.L(71 - i) * this.Z6) + f;
            }
        }
        return f;
    }

    public final int U2(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.U2(int):int");
    }

    public final void U3() {
        Window window;
        if (this.zb == null) {
            Activity W = gm.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                s34 s34Var = new s34(window, new cd1(this, (byte) 25));
                this.zb = s34Var;
                if (this.O0) {
                    s34Var.a();
                }
            }
        }
        s34 s34Var2 = this.zb;
        if (s34Var2 != null) {
            s34Var2.i();
        }
    }

    public final void V0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.V0(android.graphics.Canvas, float):void");
    }

    public final ImageReceiver V1(int i) {
        TLRPC.PollAnswer pollAnswer;
        ag8 ag8Var;
        ag8 ag8Var2;
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.D == 17) {
            if (i == -2) {
                xc2 xc2Var = this.x2;
                if (xc2Var != null && (ag8Var2 = xc2Var.m) != null) {
                    return ag8Var2.b;
                }
                return null;
            } else if (i == -3) {
                xc2 xc2Var2 = this.x2;
                if (xc2Var2 != null && (ag8Var = xc2Var2.n) != null) {
                    return ag8Var.b;
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
                        qc2 qc2Var = (qc2) obj;
                        yf8 yf8Var = qc2Var.x;
                        if (yf8Var != null && (pollAnswer = qc2Var.s) != null && pollAnswer.unshuffled_index == i) {
                            return yf8Var.c;
                        }
                    }
                }
            }
        }
        dd5 dd5Var = this.X5;
        if (dd5Var != null) {
            ArrayList arrayList2 = dd5Var.c;
            bd5 bd5Var = dd5Var.b;
            if (bd5Var != null && i >= 0 && i < bd5Var.a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) dd5Var.b.a.get(i);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((cd5) arrayList2.get(i3)).F == messageExtendedMedia) {
                        return ((cd5) arrayList2.get(i3)).f;
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
        yc2 yc2Var = this.ub;
        if (O3) {
            if (z) {
                currentBackgroundLeft2 = (int) (this.N6 + yc2Var.h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            extraTextX = getExtraTextX() + gm.L(11.0f) + currentBackgroundLeft2;
            this.o0 = extraTextX;
        } else {
            if (z) {
                currentBackgroundLeft = (int) (this.N6 + yc2Var.h0);
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
                L = gm.L(f);
            }
            extraTextX = currentBackgroundLeft + L + getExtraTextX();
            this.o0 = extraTextX;
        }
        float f3 = 4.0f;
        if (this.T1) {
            this.o0 = gm.L(11.0f) + extraTextX;
            int L3 = gm.L(14.0f) + this.gb;
            this.u0 = L3;
            StaticLayout staticLayout = this.g2;
            if (staticLayout != null) {
                this.u0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.U1) {
            int L4 = gm.L(14.0f) + this.gb;
            this.u0 = L4;
            StaticLayout staticLayout2 = this.g2;
            if (staticLayout2 != null) {
                this.u0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.Q5.D == 19) {
            this.u0 = gm.L(6.0f) + this.gb;
            if (!this.Q5.N3()) {
                this.o0 = getCurrentBackgroundLeft();
            } else {
                this.o0 -= gm.L(4.0f);
            }
        } else {
            int L5 = gm.L(8.0f) + this.gb;
            this.u0 = L5;
            k47 k47Var = this.Q5;
            float f4 = 2.0f;
            if (k47Var.D == 36) {
                if (this.w1 && this.m3 != null && R2()) {
                    this.u0 = hg9.v(7.0f, this.m3.b(), this.u0);
                } else {
                    uj9 uj9Var = this.Q5.y2;
                    if (uj9Var != null && uj9Var.X()) {
                        int i3 = this.u0;
                        if (this.gb <= 0) {
                            f4 = -3.0f;
                        }
                        this.u0 = gm.L(f4) + i3;
                    }
                }
            } else {
                if (k47Var.E2 && (i = gda.U0) > 10) {
                    if (i < 15) {
                        f4 = 1.0f;
                    }
                    L5 += gm.L(f4);
                    this.u0 = L5;
                }
                if (this.Q5.E2 && this.gb > 0) {
                    this.u0 = gm.L(5.0f) + L5;
                }
            }
        }
        if (this.Q5.q4()) {
            this.q0 = gm.L(14.0f) + this.u0;
        } else {
            boolean z2 = this.v1;
            int i4 = this.u0;
            if (z2) {
                this.q0 = gm.L(10.0f) + i4;
                this.u0 = hg9.v(13.0f, this.W1, this.u0);
                if (this.u2 && !this.U1 && !this.Q5.v3()) {
                    this.u0 = gm.L(44.0f) + this.u0;
                }
            } else {
                this.q0 = gm.L(10.0f) + this.Q5.V5(yc2Var) + i4;
            }
        }
        if (this.v1) {
            L2 = gm.L(10.0f) + this.Q5.V5(yc2Var) + this.u0;
        } else {
            int i5 = this.q0 + this.W1;
            if (this.u2) {
                f2 = 46.0f;
            } else {
                f2 = 0.0f;
            }
            int L6 = gm.L(f2) + i5;
            if (this.W1 <= 0) {
                f3 = -8.0f;
            }
            L2 = gm.L(f3) + L6;
        }
        this.r0 = L2;
        this.p0 = this.o0;
        if (this.Q5.x2 != 0.0f && this.Q7 != null) {
            int L7 = this.b7 - gm.L(31.0f);
            k47 k47Var2 = this.Q5;
            int i6 = L7 - k47Var2.v2;
            if (!this.c7) {
                int i7 = this.M9;
                if (k47Var2.O3()) {
                    i2 = 20;
                }
                i6 = wi8.B(i2 + 4, i7, i6);
            }
            if (i6 > 0) {
                this.o0 = (i6 - getExtraTimeX()) + this.o0;
            }
        }
    }

    public final void V3(k47 k47Var) {
        boolean z;
        boolean z2;
        String B;
        int i = 0;
        this.B8 = false;
        if (k47Var.D == 9 && this.M1 == 1 && !this.O1 && this.L == null && this.M == null) {
            TLRPC.Document F0 = k47Var.F0();
            int i2 = this.a6;
            np3 np3Var = jd8.a;
            if (!oc7.r1(i2).l4.v0.f && F0 != null) {
                if ("application/vnd.apple.pkpass".equalsIgnoreCase(F0.mime_type) || ((B = bc4.B(F0)) != null && B.toLowerCase(Locale.ROOT).endsWith(".pkpass"))) {
                    long j = F0.size;
                    if (j > 0 && j <= 2097152 && !jd8.c.containsKey(Long.valueOf(F0.id))) {
                        if (this.A8 == null) {
                            this.A8 = new hd8();
                        }
                        this.H8 = this.b7 - gm.L(11.0f);
                        ed8 ed8Var = (ed8) jd8.b.get(Long.valueOf(F0.id));
                        if (ed8Var != null) {
                            try {
                                this.F8 = this.A8.e(ed8Var, this.H8);
                                z = true;
                            } catch (Throwable th) {
                                fc4.g(th, true);
                                long j2 = F0.id;
                                jd8.b.remove(Long.valueOf(j2));
                                jd8.c.put(Long.valueOf(j2), Boolean.TRUE);
                                return;
                            }
                        } else {
                            int i3 = this.H8;
                            Paint paint = hd8.B;
                            this.F8 = Math.round((i3 * 7.0f) / 5.0f);
                            e3(k47Var);
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
                            i = gm.L(6.0f);
                        }
                        this.gb += this.F8 + i;
                        this.B8 = true;
                    }
                }
            }
        }
    }

    public final boolean W(MotionEvent motionEvent) {
        byte b;
        c47 c47Var;
        boolean z;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i;
        int L2;
        int i2;
        if ((!w2() || this.Q5.D == 16) && (((b = this.M1) != 5 && b != 1) || (c47Var = this.M) == null || (c47Var.l & 4) != 0)) {
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
                    k47 k47Var = this.Q5;
                    if (k47Var.D == 16) {
                        boolean I4 = k47Var.I4();
                        int i4 = this.S3;
                        if (x >= i4) {
                            if (jb6.a0) {
                                L = 0;
                            } else {
                                L = this.b7 - gm.L(70.0f);
                            }
                            int i5 = i4 + L;
                            if (!I4) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            if (x <= gm.L(i + 30) + i5 && P1 >= this.T3 - gm.L(14.0f)) {
                                if (P1 <= gm.L(50.0f) + this.T3) {
                                    this.Z3 = true;
                                    this.L2[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i6 = this.S3;
                                        if (jb6.a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.b7 - gm.L(70.0f);
                                        }
                                        int i7 = i6 + L2;
                                        if (!I4) {
                                            i2 = 2;
                                        } else {
                                            i2 = 0;
                                        }
                                        int L3 = gm.L(i2) + i7;
                                        Drawable[] drawableArr2 = cmb.F4;
                                        int w = aq1.w(2, L3, drawableArr2[I4 ? 1 : 0]);
                                        int i8 = aq1.i(2, this.T3, drawableArr2[I4 ? 1 : 0]);
                                        drawableArr[0].setBounds(w - gm.L(20.0f), i8 - gm.L(20.0f), gm.L(20.0f) + w, gm.L(20.0f) + i8);
                                        drawableArr[0].setHotspot(x, P1);
                                        drawableArr[0].setState(this.N2);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x >= this.S3 - gm.L(20.0f)) {
                        if (x <= gm.L(20.0f) + this.S3 && P1 >= this.T3 - gm.L(4.0f)) {
                            if (P1 <= gm.L(30.0f) + this.T3) {
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
                        this.eb.d2(this, this.S3, this.T3);
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

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.W0(android.graphics.Canvas):void");
    }

    public final float W1(int i) {
        qc2 qc2Var;
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                int i2 = ((qc2) arrayList.get(i)).b;
                int i3 = this.gb;
                float f = i2 + i3;
                yc2 yc2Var = this.ub;
                if (yc2Var.u2) {
                    float f2 = yc2Var.L1;
                    f += ((1.0f - f2) * yc2Var.v2) + (i3 * f2);
                    if (this.Q5.m5()) {
                        f -= this.gb;
                    }
                }
                if (yc2Var.x0) {
                    f += yc2Var.k0;
                }
                return f + qc2Var.c + gm.L(13.0f);
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
        ag8 ag8Var;
        ag8 ag8Var2;
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            jc2 jc2Var = this.bc;
            if (jc2Var != null && jc2Var.rewindCount != 0 && jc2Var.rewindByBackSeek) {
                k47Var.b0 = jc2Var.getVideoProgress();
            }
            boolean z2 = true;
            if (this.Q5.S3()) {
                xc2 xc2Var = this.x2;
                if (xc2Var != null && (ag8Var2 = xc2Var.m) != null) {
                    ag8Var2.p(true);
                }
                xc2 xc2Var2 = this.x2;
                if (xc2Var2 != null && (ag8Var = xc2Var2.n) != null) {
                    ag8Var.p(true);
                }
            }
            byte b = this.M1;
            ic2 ic2Var = this.D4;
            double d4 = 0.0d;
            int i = 0;
            if (b == 4) {
                if (ic2Var != null) {
                    ic2Var.a();
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
                kn m = this.U0.m();
                if (m != null) {
                    k47 k47Var2 = this.Q5;
                    int i2 = m.d[4] / 1000;
                    k47Var2.j0 = i2;
                    d3 = i2;
                    TLRPC.Message message = k47Var2.k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !k47Var2.l5() && k47.K4(this.Q5.k) && m.s()) {
                        this.eb.e0(this.Q5);
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
                        this.eb.s0();
                    }
                }
                if (this.M4 != d3) {
                    String g0 = gm.g0((int) d3, false, false);
                    this.C3 = (int) Math.ceil(cmb.B2.measureText(g0));
                    this.x3 = new StaticLayout(g0, cmb.B2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M4 = d3;
                    return;
                }
                return;
            }
            boolean z3 = this.Kb;
            gx9 gx9Var = this.E4;
            if (z3) {
                if (this.C4) {
                    if (!gx9Var.f) {
                        gx9Var.f(true, this.Q5.b0);
                    }
                } else {
                    if (!ic2Var.e) {
                        ic2Var.g(this.Q5.b0);
                        ic2Var.q = this.Q5.g0;
                    }
                    ic2Var.a();
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
                    String g02 = gm.g0((int) d2, true, false);
                    this.N4 = (int) Math.ceil(cmb.S2.measureText(g02));
                    this.L4 = new StaticLayout(g02, cmb.S2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                    if (!gx9Var.f) {
                        gx9Var.f(true, this.Q5.b0);
                    }
                    z = true;
                } else {
                    if (!ic2Var.e) {
                        ic2Var.g(this.Q5.b0);
                        ic2Var.q = this.Q5.g0;
                    }
                    ic2Var.i(this.Q5);
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
                        String g03 = gm.g0((int) d, true, false);
                        this.N4 = (int) Math.ceil(cmb.M2.measureText(g03));
                        this.L4 = new StaticLayout(g03, cmb.M2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.Q5.L0();
                    if (MediaController.w().D(this.Q5)) {
                        i = this.Q5.i0;
                    }
                    double d5 = i;
                    if (this.M4 != d5) {
                        this.M4 = d5;
                        this.L4 = new StaticLayout(gm.k0(i, (int) L0), cmb.M2, (int) Math.ceil(cmb.M2.measureText(k0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z2 = z;
                }
                if (z2) {
                    invalidate();
                }
            }
        }
    }

    public final boolean X(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.X(android.view.MotionEvent):boolean");
    }

    public final void X0(Canvas canvas) {
        float f;
        rc2 rc2Var;
        Canvas canvas2;
        if (this.vc || this.wc) {
            c47 c47Var = this.M;
            if (c47Var == null || (c47Var.c == 0 && c47Var.a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                Jd.setColor(compactHeaderColor);
                Kd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.J) {
                    f = 9.0f;
                } else {
                    f = 10.0f;
                }
                float L = gm.L(f);
                if (this.vc) {
                    rc2Var = this;
                    canvas2 = canvas;
                    rc2Var.Z0(canvas2, this.tc, compactLeft, L, compactHeaderColor);
                    L += gm.L(24.0f);
                } else {
                    rc2Var = this;
                    canvas2 = canvas;
                }
                if (rc2Var.wc) {
                    rc2Var.Z0(canvas2, rc2Var.uc, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final float X1(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                int i2 = ((qc2) arrayList.get(i)).b;
                int i3 = this.gb;
                float f = i2 + i3;
                yc2 yc2Var = this.ub;
                if (yc2Var.u2) {
                    float f2 = yc2Var.L1;
                    f += ((1.0f - f2) * yc2Var.v2) + (i3 * f2);
                    if (this.Q5.m5()) {
                        f -= this.gb;
                    }
                }
                if (yc2Var.x0) {
                    f += yc2Var.k0;
                }
                return f - gm.L(13.0f);
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
        pc8 M1;
        mc2 mc2Var = this.eb;
        if (mc2Var == null) {
            M1 = null;
        } else {
            M1 = mc2Var.M1();
        }
        pc8 pc8Var = M1;
        int i = 0;
        if (this.Q5 != null) {
            mm mmVar = this.U0;
            if (mmVar.E() && pc8Var != null && !this.Q5.s4() && !this.Q5.G2() && ((!k47.K4(this.Q5.k) || this.H5) && !this.Kb && !this.Q5.J2() && ((!this.Q5.U2() || k47.t3(this.Q5.k)) && !this.Q5.l5()))) {
                k47 k47Var = this.Q5;
                qna qnaVar = this.ca;
                if (qnaVar != null) {
                    Integer num = (Integer) qnaVar.k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i = num.intValue();
                }
                return pc8Var.a(motionEvent, this, mmVar, k47Var, i);
            }
        }
        return false;
    }

    public final int Y1(byte[] bArr) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((qc2) arrayList.get(i)).s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public qna Y2() {
        return qna.e(this);
    }

    public final void Y3() {
        k47 k47Var;
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        if (!this.Q5.N5()) {
            return;
        }
        l39 l39Var = this.O;
        if (!l39Var.p) {
            c47 c47Var = this.M;
            if (c47Var != null) {
                int i4 = c47Var.l;
                if ((i4 & 8) == 0 || (i4 & 1) == 0) {
                    return;
                }
            }
            k47 k47Var2 = this.Q5;
            int i5 = 0;
            if (k47Var2.D != 19 && !k47Var2.G2() && !this.Q5.M2()) {
                float f3 = 11.0f;
                if (this.Q5.O3()) {
                    l39Var.b = gm.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.Kb) {
                    int L = gm.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.K) {
                        i3 = 6;
                    } else {
                        i3 = 0;
                    }
                    int L2 = gm.L(gm.U1(getVideoTranscriptionProgress(), 0, i3)) + L;
                    l39Var.b = L2;
                    l39Var.b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * gm.L(9.0f)));
                } else {
                    int L3 = gm.L((this.C6 || !this.K) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    l39Var.b = L3;
                    if (this.C6) {
                        l39Var.b = L3 - gm.L(9.0f);
                    }
                }
            } else if (this.Q5.O3()) {
                l39Var.b = (getMeasuredWidth() - l39Var.o) - gm.L(16.0f);
            } else {
                l39Var.b = getCurrentBackgroundLeft();
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
                l39Var.b = (int) (compactLeft - f2);
            }
            if (!this.Q5.O3() && this.M != null && !v2()) {
                float f4 = l39Var.b;
                if (b3()) {
                    i2 = 48;
                } else {
                    i2 = 0;
                }
                l39Var.b = (int) (f4 - (gm.L(64 - i2) * this.Z6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - gm.L(10.0f)) - l39Var.m;
            l39Var.c = backgroundDrawableBottom;
            if (this.x7) {
                if (v2()) {
                    i5 = getCommentButtonHeight();
                } else {
                    if (this.Q5.D == 29 && f2()) {
                        f = 28.0f;
                    } else {
                        f = 43.0f;
                    }
                    i5 = gm.L(f);
                }
            }
            int i6 = backgroundDrawableBottom - i5;
            l39Var.c = i6;
            if (this.c7 && (!this.E9 || !this.R1 || this.M1 != 3)) {
                l39Var.c = i6 - gm.L(16.0f);
            }
            if (this.Q5.D != 9 && !R2() && this.m3 != null && (((i = (k47Var = this.Q5).D) != 2 && i != 17 && (!k47Var.N3() || !this.E9 || this.O1)) || ((this.M != null && this.L != null) || this.Q5.D == 29))) {
                l39Var.c -= gm.L(14.0f);
            }
            l39Var.c += l39Var.k;
        }
    }

    public final void Z() {
        ag8 ag8Var;
        ag8 ag8Var2;
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.S3()) {
            xc2 xc2Var = this.x2;
            if (xc2Var != null && (ag8Var2 = xc2Var.n) != null) {
                ag8Var2.c();
            }
            xc2 xc2Var2 = this.x2;
            if (xc2Var2 != null && (ag8Var = xc2Var2.m) != null) {
                ag8Var.c();
            }
        }
    }

    public final void Z0(Canvas canvas, nc2 nc2Var, float f, float f2, int i) {
        int i2;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z;
        int L = gm.L(16.0f);
        RectF rectF = nc2Var.d;
        ImageReceiver imageReceiver = nc2Var.b;
        boolean z2 = nc2Var.a;
        float f3 = L;
        rectF.set(f, f2, nc2Var.j + f, f2 + f3);
        canvas.save();
        float a = nc2Var.e.a(0.02f);
        RectF rectF2 = nc2Var.d;
        canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
        int p1 = cmb.p1(0.15f, i);
        fg0 fg0Var = nc2Var.k;
        if (fg0Var == null) {
            nc2Var.l = p1;
            fg0 Y = cmb.Y(p1, 6, 6);
            nc2Var.k = Y;
            Y.setCallback(this);
        } else if (nc2Var.l != p1) {
            nc2Var.l = p1;
            cmb.F1(fg0Var, p1, true);
        }
        nc2Var.k.setBounds((int) (rectF2.left - gm.L(6.0f)), (int) (rectF2.top - gm.L(4.0f)), (int) (rectF2.right + gm.L(6.0f)), (int) (rectF2.bottom + gm.L(4.0f)));
        nc2Var.k.draw(canvas);
        if (!z2) {
            mc2 mc2Var = this.eb;
            if (mc2Var != null && mc2Var.n1(this, 0)) {
                z = true;
            } else {
                z = false;
            }
            a1(canvas, nc2Var, i, z);
        }
        if (this.zc == null) {
            this.zc = getContext().getResources().getDrawable(2131232338).mutate();
        }
        if (z2) {
            i2 = cmb.v0(cmb.Ed, this.cc);
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
        float L2 = f + f3 + gm.L(6.0f);
        if (nc2Var.f != null) {
            Jd.setColor(i2);
            Y0(canvas, nc2Var.f, L2, f2);
            Jd.setColor(i);
            L2 += gm.L(4.0f) + N1(nc2Var.f);
        }
        if (nc2Var.i) {
            imageReceiver.i0(L2, f2, f3, f3);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += gm.L(5.0f) + L;
        }
        StaticLayout staticLayout = nc2Var.g;
        if (staticLayout != null) {
            if (z2) {
                staticLayout.getPaint().setColor(on2.l(cmb.p1(0.7f, i2), cmb.v0(cmb.ta, this.cc)));
            }
            Y0(canvas, nc2Var.g, L2, f2);
            if (z2) {
                nc2Var.g.getPaint().setColor(i);
            }
            L2 += gm.L(4.0f) + N1(nc2Var.g);
        }
        if (nc2Var.h != null) {
            canvas.save();
            canvas.translate(L2 - nc2Var.h.getLineLeft(0), ((L - nc2Var.h.getHeight()) / 2.0f) + f2);
            if (z2) {
                nc2Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = nc2Var.h;
                AtomicReference atomicReference = this.Ac;
                ArrayList arrayList = this.fc;
                rna.g(this, this.n0, i, -gm.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                gn.drawAnimatedEmojis(canvas, nc2Var.h, this.Na, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, L1(2, i));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final void Z2(k47 k47Var) {
        long j;
        TLRPC.User W1;
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
        f47 f47Var;
        TLRPC.Chat L0;
        k47 primaryMessageObject = getPrimaryMessageObject();
        long Z0 = k47Var.Z0();
        boolean z5 = k47Var.r1;
        int i4 = this.a6;
        CharSequence charSequence = "";
        if (z5) {
            replace = null;
            j = 0;
        } else {
            if (primaryMessageObject.k.via_business_bot_id != 0) {
                TLRPC.User W12 = oc7.r1(k47Var.K1).W1(Long.valueOf(primaryMessageObject.k.via_business_bot_id));
                if (W12 == null) {
                    replace = null;
                } else {
                    replace = m9c.r(W12);
                }
            } else {
                TLRPC.Message message2 = k47Var.k;
                if (message2.post_author != null) {
                    if (this.k6 && k47Var.Z0() == k47.B0(k47Var.k)) {
                        j = 0;
                        replace = null;
                    } else {
                        replace = k47Var.k.post_author.replace("\n", "");
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
                                replace = jb6.M0(2131748977, "ImportedMessage");
                            } else {
                                j = 0;
                                try {
                                    Date date = new Date(i5 * 1000);
                                    str = String.format("%1$s, %2$s", jb6.D0().B0().format(date), jb6.D0().o0().format(date));
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    str = "LOC_ERR";
                                }
                                replace = str + " " + jb6.M0(2131748977, "ImportedMessage");
                            }
                        }
                    }
                    j = 0;
                    if (!k47Var.O3() && Z0 > 0 && k47Var.k.post && (W1 = oc7.r1(i4).W1(Long.valueOf(Z0))) != null) {
                        replace = bw2.m(0, W1.first_name, W1.last_name).replace('\n', ' ');
                    }
                    replace = null;
                }
            }
            j = 0;
        }
        if (k47.B0(k47Var.k) < j && (L0 = oc7.r1(i4).L0(Long.valueOf(-k47.B0(k47Var.k)))) != null && L0.signature_profiles && (k47Var.k.flags & 256) != 0) {
            replace = null;
        }
        if (this.Q5.p3()) {
            oc7.r1(i4).W1(Long.valueOf(Z0));
        }
        boolean x2 = k47Var.x2();
        if (!k47Var.r1 && !k47Var.k.edit_hide) {
            if (this.M != null && (f47Var = this.L) != null && !f47Var.d.isEmpty()) {
                this.vb = false;
                x2 = ((k47) this.L.d.get(0)).x2();
                if (!((k47) this.L.d.get(0)).k.edit_hide) {
                    int size = this.L.d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        k47 k47Var2 = (k47) this.L.d.get(i6);
                        if ((k47Var2.k.flags & 32768) != 0 || k47Var2.Y2()) {
                            this.vb = true;
                            break;
                        }
                    }
                }
            } else {
                if ((k47Var.k.flags & 32768) == 0 && !k47Var.Y2()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.vb = z4;
            }
        } else {
            this.vb = false;
        }
        k47 k47Var3 = this.Q5;
        boolean z6 = this.vb;
        f47 f47Var2 = this.L;
        if (f47Var2 != null) {
            ArrayList arrayList = f47Var2.d;
            i = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                k47 k47Var4 = (k47) arrayList.get(i7);
                if (k47Var4 != null && (message = k47Var4.k) != null) {
                    i = Math.max(i, message.edit_date);
                }
            }
        } else {
            i = k47Var.k.edit_date;
        }
        String N3 = N3(k47Var3, k47Var, z6, i);
        if (this.Q5.k.video_processing_pending) {
            N3 = jb6.a0(null, null, 2131745580, N3);
        }
        if (replace != null) {
            TLRPC.Message message3 = k47Var.k;
            if (message3.via_business_bot_id != j) {
                this.Q9 = td4.p(N3, ", ");
            } else {
                TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
                if (messageFwdHeader2 != null && messageFwdHeader2.imported) {
                    this.Q9 = b10.h(" ", N3);
                } else {
                    this.Q9 = b10.h(", ", N3);
                }
            }
        } else {
            this.Q9 = N3;
        }
        TLRPC.MessageMedia n1 = k47.n1(this.Q5.k);
        if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null) {
            TLRPC.MessageMedia n12 = k47.n1(this.Q5.k);
            if ((n12 instanceof TLRPC.TL_messageMediaDice) && (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n12).game_outcome) != null) {
                j5 = tL_messages_emojiGameOutcome.stake_ton_amount;
            } else {
                j5 = j;
            }
            CharSequence concat = TextUtils.concat("💎", nxa.K0(j5), "  ", this.Q9);
            this.Q9 = concat;
            this.Q9 = nxa.S0(concat, 0.55f, gm.L(-0.33f), 1.05f);
        }
        if (k47.B0(this.Q5.k) < j) {
            j2 = getStarsPrice();
        } else {
            j2 = j;
        }
        if (j2 > j) {
            CharSequence concat2 = TextUtils.concat("⭐️", gm.o0((int) j2, 0), "  ", this.Q9);
            this.Q9 = concat2;
            this.Q9 = nxa.Y0(false, concat2, 0.8f, null, gm.L(-0.33f), 0.94f);
        }
        TLRPC.Message message4 = this.Q5.k;
        if (message4 != null && (i3 = message4.schedule_repeat_period) != 0) {
            if (i3 == 31536000) {
                this.Q9 = TextUtils.concat(jb6.M0(2131748251, null), ", ", this.Q9);
            } else if (i3 == 15724800) {
                this.Q9 = TextUtils.concat(jb6.G(6, "MessageScheduledRepeatMonthlyMany", new Object[0]), ", ", this.Q9);
            } else if (i3 == 7862400) {
                this.Q9 = TextUtils.concat(jb6.G(3, "MessageScheduledRepeatMonthlyMany", new Object[0]), ", ", this.Q9);
            } else if (i3 == 2592000) {
                this.Q9 = TextUtils.concat(jb6.M0(2131748267, null), ", ", this.Q9);
            } else if (i3 == 1209600) {
                this.Q9 = TextUtils.concat(jb6.M0(2131748283, null), ", ", this.Q9);
            } else if (i3 == 604800) {
                this.Q9 = TextUtils.concat(jb6.M0(2131748252, null), ", ", this.Q9);
            } else if (i3 == 86400) {
                this.Q9 = TextUtils.concat(jb6.M0(2131748282, null), ", ", this.Q9);
            } else {
                this.Q9 = TextUtils.concat(jb6.a0(null, null, 2131748253, Integer.valueOf(i3)), ", ", this.Q9);
            }
        }
        TextPaint textPaint = cmb.S2;
        CharSequence charSequence2 = this.Q9;
        if (charSequence2 == null) {
            length = 0;
        } else {
            length = charSequence2.length();
        }
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence2, 0, length));
        this.M9 = ceil;
        this.N9 = ceil;
        k47 k47Var5 = this.Q5;
        if ((k47Var5.r1 && k47Var5.k.date == 2147483646) || k47Var5.w1) {
            this.M9 = ceil - gm.L(8.0f);
        }
        mc2 mc2Var = this.eb;
        if (mc2Var != null && mc2Var.O() == 9) {
            z = true;
        } else {
            z = false;
        }
        TLRPC.Message message5 = k47Var.k;
        if ((message5.flags & 1024) != 0 && !z) {
            this.ra = jb6.S(null, Math.max(1, message5.views));
            this.qa = (int) Math.ceil(cmb.S2.measureText(S2));
            this.M9 = (int) (this.qa + (((cmb.S2.getTextSize() - gm.L(2.0f)) * cmb.L3.getIntrinsicWidth()) / cmb.L3.getIntrinsicHeight()) + gm.L(10.0f) + this.M9);
        }
        if (k47Var.D == 20) {
            jb6 D0 = jb6.D0();
            TLRPC.MessageMedia messageMedia = k47Var.k.media;
            String a0 = jb6.a0(null, null, 2131747144, D0.p(messageMedia.total_amount, messageMedia.currency).toUpperCase(Locale.ROOT));
            if (a0.length() >= 2) {
                a0 = a0.substring(0, 1).toUpperCase(locale) + a0.substring(1).toLowerCase(locale);
            }
            this.la = a0;
            this.ka = (int) Math.ceil(cmb.u2.measureText(a0));
        }
        if (this.f6 && this.k6 && ((!this.o6 || this.m6) && x2)) {
            this.ua = jb6.S(null, getRepliesCount());
            this.ta = (int) Math.ceil(cmb.S2.measureText(S));
            this.M9 = (int) (this.ta + (((cmb.S2.getTextSize() - gm.L(2.0f)) * cmb.P3.getIntrinsicWidth()) / cmb.P3.getIntrinsicHeight()) + gm.L(10.0f) + this.M9);
        } else {
            this.ua = null;
        }
        if (this.q6) {
            this.M9 = hg9.v(3.0f, cmb.T3.getIntrinsicWidth(), this.M9);
        }
        if (k47Var.r1) {
            if (k47Var.m4()) {
                this.M9 = gm.L(18.0f) + this.M9;
            } else if (k47Var.n4() && k47Var.k.peer_id.channel_id != j && !k47Var.z4()) {
                this.M9 = gm.L(18.0f) + this.M9;
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
                mc2 mc2Var2 = this.eb;
                if (mc2Var2 != null && mc2Var2.f()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                this.m0 = new tm(gm.L(14.0f), 23, this, z3);
            }
            if (this.k0 == this.Q5.e1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (effect != null) {
                if (!TextUtils.isEmpty(effect.emoticon)) {
                    this.m0.g(gw3.g(effect.emoticon), z2);
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
            this.M9 = gm.L(18.0f) + this.M9;
        }
        if (replace != null) {
            int i8 = this.V6;
            if (i8 == 0) {
                i8 = gm.L(1000.0f);
                this.V6 = i8;
            }
            int i9 = i8 - this.M9;
            if (k47Var.O3()) {
                if (k47Var.D == 5) {
                    L = gm.L(20.0f);
                } else {
                    L = gm.L(96.0f);
                }
                i9 -= L;
            }
            CharSequence m = gw3.m(replace, cmb.S2.getFontMetricsInt(), false, null, 0);
            int ceil2 = (int) Math.ceil(cmb.S2.measureText(m, 0, m.length()));
            this.P9 = Math.min(ceil2, i9);
            if (ceil2 > i9) {
                if (i9 <= 0) {
                    i2 = 0;
                } else {
                    charSequence = TextUtils.ellipsize(m, cmb.S2, i9, TextUtils.TruncateAt.END);
                    i2 = i9;
                }
            } else {
                charSequence = m;
                i2 = ceil2;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (k47Var.k.via_business_bot_id != j) {
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

    public final void Z3(k47 k47Var) {
        String str;
        CharSequence concat;
        int i;
        if (k47Var != null && k47Var.l5()) {
            int i2 = 0;
            if (!k47Var.k4()) {
                concat = null;
            } else {
                TLRPC.Message message = k47Var.k;
                int i3 = message.ttl;
                if (i3 == Integer.MAX_VALUE) {
                    if (k47Var.Y2 == null) {
                        k47Var.Y2 = new SpannableString("v");
                        pn2 pn2Var = new pn2(2131231984, 0);
                        pn2Var.r = -gm.L(3.0f);
                        pn2Var.F = gm.L(13.0f);
                        SpannableString spannableString = k47Var.Y2;
                        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(k47Var.Y2, "1");
                } else {
                    int i4 = message.destroyTime;
                    if (i4 != 0) {
                        i3 = Math.max(0, i4 - ConnectionsManager.getInstance(k47Var.K1).getCurrentTime());
                    }
                    if (i3 < 60) {
                        str = aq1.n(i3, "s");
                    } else {
                        str = (i3 / 60) + "m";
                    }
                    if (k47Var.Z2 == null) {
                        k47Var.Z2 = new SpannableString("p");
                        pn2 pn2Var2 = new pn2(2131232566, 0);
                        pn2Var2.r = gm.L(1.0f);
                        pn2Var2.F = gm.L(13.0f);
                        SpannableString spannableString2 = k47Var.Z2;
                        spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(k47Var.Z2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(cmb.B2.measureText((String) charSequence));
                    this.C3 = ceil;
                    this.x3 = new StaticLayout(TextUtils.ellipsize(charSequence, cmb.B2, ceil, TextUtils.TruncateAt.END), cmb.B2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = cmb.C2;
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
        f47 f47Var = this.L;
        if ((f47Var == null || !f47Var.m.j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z) {
        k47 k47Var;
        boolean z2;
        k47 k47Var2;
        byte[] bArr;
        xc2 xc2Var = this.x2;
        if (xc2Var != null && xc2Var.k != null && (k47Var = this.Q5) != null && k47Var.S3()) {
            TLRPC.MessageMedia m1 = k47.m1(this.Q5);
            boolean z3 = false;
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                z2 = ((TLRPC.TL_messageMediaPoll) m1).poll.multiple_choice;
            } else {
                z2 = false;
            }
            og8 og8Var = this.x2.k;
            if (z2) {
                a6a B = a6a.B(this.a6);
                if (this.Q5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) B.w.get("poll_" + k47Var2.D1());
                }
                if (bArr != null) {
                    z3 = true;
                }
            }
            fn0 fn0Var = og8Var.f;
            if (fn0Var.f != z3) {
                fn0Var.a(z3, z);
            }
        }
    }

    public final void a1(Canvas canvas, nc2 nc2Var, int i, boolean z) {
        qa6 qa6Var;
        qa6 qa6Var2;
        qa6 qa6Var3;
        if (!z) {
            if (nc2Var.n && (qa6Var3 = nc2Var.m) != null) {
                qa6Var3.a();
            }
        } else if (!nc2Var.n && (qa6Var = nc2Var.m) != null) {
            qa6Var.c = -1L;
            qa6Var.b = -1L;
        }
        nc2Var.n = z;
        float[] fArr = nc2Var.o;
        RectF rectF = nc2Var.d;
        if (!z && ((qa6Var2 = nc2Var.m) == null || !qa6Var2.d())) {
            qa6 qa6Var4 = nc2Var.m;
            if (qa6Var4 != null) {
                qa6Var4.b = -1L;
                return;
            }
            return;
        }
        qa6 qa6Var5 = nc2Var.m;
        if (qa6Var5 == null) {
            qa6Var5 = new qa6();
            nc2Var.m = qa6Var5;
            qa6Var5.D = true;
            qa6Var5.t = 3.5f;
            qa6Var5.u = 0.5f;
        }
        qa6Var5.g(cmb.p1(0.1f, i), cmb.p1(0.3f, i), cmb.p1(0.3f, i), cmb.p1(1.25f, i));
        Arrays.fill(fArr, gm.L(6.0f));
        RectF rectF2 = gm.P;
        rectF2.set(rectF.left - gm.L(6.0f), rectF.top - gm.L(4.0f), rectF.right + gm.L(6.0f), rectF.bottom + gm.L(4.0f));
        nc2Var.m.e(rectF2);
        nc2Var.m.i(fArr);
        nc2Var.m.x.setStrokeWidth(gm.L(1.0f));
        nc2Var.m.draw(canvas);
        invalidate();
    }

    public final int a2(int i) {
        return cmb.v0(i, this.cc);
    }

    public final float a3() {
        yc2 yc2Var = this.ub;
        boolean z = yc2Var.G1;
        boolean z2 = this.w1;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            if (!z2) {
                f2 = 1.0f;
                f = 0.0f;
            }
            return gm.R1(f2, f, yc2Var.L1);
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
        int i10 = -gm.L(i + 92);
        yc2 yc2Var = this.ub;
        boolean z = yc2Var.x0;
        ic2 ic2Var = this.D4;
        gx9 gx9Var = this.E4;
        float f2 = 10.0f;
        if (z && ((b = this.M1) == 3 || b == 7)) {
            int i11 = this.b7;
            float f3 = i11;
            int i12 = (int) ((f3 - yc2Var.l0) + yc2Var.m0);
            int i13 = (int) ((f3 - yc2Var.h0) + yc2Var.i0);
            if (this.Kb && !this.I6) {
                i13 = (int) ((getVideoTranscriptionProgress() * gm.L(8.0f)) + i13);
                i12 += gm.L(8.0f);
            }
            if (yc2Var.l0 == 0.0f && yc2Var.m0 == 0.0f) {
                i12 = i13;
            }
            if (gx9Var != null) {
                if (yc2Var.o1) {
                    int L = (i13 + i10) - ((int) (gm.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f2 = 0.0f;
                    }
                    int L2 = L - gm.L(f2);
                    int L3 = gm.L(30.0f);
                    int i14 = i11 + i10;
                    if (!this.I4) {
                        i8 = -gm.L(34.0f);
                    } else {
                        i8 = 0;
                    }
                    int i15 = i14 + i8;
                    int i16 = i12 + i10;
                    if (this.I4) {
                        i9 = -gm.L(34.0f);
                    } else {
                        i9 = 0;
                    }
                    gx9Var.g(L2, L3, i15, i16 + i9);
                } else {
                    int L4 = (i13 + i10) - ((int) (gm.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f2 = 0.0f;
                    }
                    gx9Var.g(L4 - gm.L(f2), gm.L(30.0f), (i11 + i10) - ((int) (gm.L(34.0f) * getUseTranscribeButtonProgress())), (i12 + i10) - ((int) (gm.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (ic2Var != null) {
                int useTranscribeButtonProgress = i13 - ((int) (getUseTranscribeButtonProgress() * gm.L(34.0f)));
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
                ic2Var.h(useTranscribeButtonProgress - gm.L(i6 + i7), gm.L(30.0f));
                return;
            }
            return;
        }
        if (gx9Var != null) {
            boolean z2 = yc2Var.o1;
            int i17 = this.b7 + i10;
            if (z2) {
                int L5 = i17 - ((int) (gm.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.R1) {
                    f = 10.0f;
                } else {
                    f = 0.0f;
                }
                int L6 = L5 - gm.L(f);
                int L7 = gm.L(30.0f);
                int i18 = this.b7 + i10;
                if (!this.I4) {
                    i4 = -gm.L(34.0f);
                } else {
                    i4 = 0;
                }
                int i19 = i18 + i4;
                if (!this.R1) {
                    f2 = 0.0f;
                }
                int L8 = i19 - gm.L(f2);
                int i20 = this.b7 + i10;
                if (this.I4) {
                    i5 = -gm.L(34.0f);
                } else {
                    i5 = 0;
                }
                gx9Var.g(L6, L7, L8, i20 + i5);
            } else {
                int L9 = i17 - ((int) (gm.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.R1) {
                    f2 = 0.0f;
                }
                int L10 = L9 - gm.L(f2);
                gx9Var.g(L10, gm.L(30.0f), L10, L10);
            }
        }
        if (ic2Var != null) {
            int useTranscribeButtonProgress2 = this.b7 - ((int) (getUseTranscribeButtonProgress() * gm.L(34.0f)));
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
            ic2Var.h(useTranscribeButtonProgress2 - gm.L(i2 + i3), gm.L(30.0f));
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

    @Override
    public final void b0(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.b0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void b1(Canvas canvas, float f) {
        i47 i47Var;
        l39 l39Var;
        Paint paint;
        nc2 nc2Var;
        nc2 nc2Var2;
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
                compactLeft = Math.max(compactLeft, this.s3 + i47Var.c);
            }
            if (this.O1) {
                mm mmVar = this.U0;
                if (mmVar.R0) {
                    compactLeft = Math.max(compactLeft, mmVar.w());
                }
            }
            if (this.w9 && this.h9 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.r9);
            }
            if (this.vc && (nc2Var2 = this.tc) != null) {
                compactLeft = Math.max(compactLeft, nc2Var2.d.right);
            }
            if (this.wc && (nc2Var = this.uc) != null) {
                compactLeft = Math.max(compactLeft, nc2Var.d.right);
            }
            if (!this.O.p) {
                compactLeft = Math.max(compactLeft, l39Var.b + l39Var.o);
            }
            if (this.Q5.D != 0 && !this.O1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - gm.L(10.0f));
            }
            if (this.L9 != null) {
                compactLeft = Math.max(compactLeft, this.O9 + this.M9);
            }
            float L = gm.L(8.0f);
            RectF rectF = gm.P;
            rectF.set(L, gm.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - gm.L(2.0f));
            this.Cd.setColor(cmb.v0(cmb.ta, this.cc));
            this.Cd.setAlpha((int) (paint.getAlpha() * f));
            float L2 = gm.L(gda.U0);
            canvas.drawRoundRect(rectF, L2, L2, this.Cd);
        }
    }

    public final Drawable b2(String str) {
        Drawable drawable;
        ylb ylbVar = this.cc;
        if (ylbVar != null) {
            drawable = ylbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return cmb.P0(str);
    }

    public final boolean b3() {
        k47 k47Var;
        if (!v2()) {
            if (!this.f6 || this.i6 || ((this.H6 && !this.l6) || (k47Var = this.Q5) == null || k47Var.O3() || !this.Q5.j5())) {
                k47 k47Var2 = this.Q5;
                if (k47Var2 == null || k47.B0(k47Var2.k) != 489000) {
                    k47 k47Var3 = this.Q5;
                    if (k47Var3 != null) {
                        if (k47Var3.l2 || k47Var3.k.guestchat_via_from != null) {
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
        if (getDelegate() != null && getDelegate().p2() != null && getDelegate().p2().y(this.Q5)) {
            hkb p2 = getDelegate().p2();
            int i3 = 0;
            if (p2.q0) {
                c = 2;
            } else if (p2.s0) {
                c = 3;
            } else if (p2.u0) {
                c = 4;
            } else if (f2()) {
                c = 1;
            } else {
                c = 0;
            }
            if (c == 2) {
                if (this.T1) {
                    i2 = this.p0 - gm.L(10.0f);
                } else {
                    boolean z = this.U1;
                    int i4 = this.p0;
                    if (z) {
                        L2 = gm.L(1.0f);
                    } else {
                        L2 = gm.L(1.0f);
                    }
                    i2 = L2 + i4;
                }
                getDelegate().p2().b0(gm.L(10.0f) + i2 + this.a2, this.Y1);
            } else if (c == 1) {
                S3();
                getDelegate().p2().b0((int) this.s3, (int) this.t3);
            } else if (c == 3) {
                f47 f47Var = this.L;
                if (f47Var != null && !f47Var.i) {
                    i = (int) this.s3;
                } else {
                    float f = 12.0f;
                    if (this.Q5.O3()) {
                        i = getExtraTextX() + gm.L(12.0f) + this.N6;
                        if (this.Q5.D == 19) {
                            i -= Math.max(0, (gm.L(14.0f) + (Math.max(this.X7, this.Z7) + i)) - gm.q.x);
                        }
                    } else {
                        boolean z2 = this.C6;
                        int i5 = this.N6;
                        if (z2) {
                            L = gm.L(12.0f) + i5;
                            extraTextX = getExtraTextX();
                        } else {
                            if (!this.K) {
                                f = 18.0f;
                            }
                            L = gm.L(f) + i5;
                            extraTextX = getExtraTextX();
                        }
                        i = L + extraTextX;
                    }
                }
                int L3 = ((int) (i + this.ub.h0)) - gm.L(1.33f);
                int i6 = this.r0;
                S3();
                hkb p22 = getDelegate().p2();
                int L4 = gm.L(10.0f) + L3;
                tc2 tc2Var = this.s0;
                if (tc2Var != null) {
                    i3 = tc2Var.o;
                }
                p22.b0(L4 - i3, gm.L(22.0f) + i6);
            } else {
                getDelegate().p2().b0(this.o0, this.u0);
            }
        }
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        mc2 mc2Var = this.eb;
        if (mc2Var != null) {
            mc2Var.V0(this, reactionCount, z, f, f2);
        }
    }

    public final boolean c0(MotionEvent motionEvent) {
        nc2 nc2Var;
        nc2 nc2Var2;
        nc2 nc2Var3;
        nc2 nc2Var4;
        mc2 mc2Var;
        int i;
        rc2 rc2Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.vc && !this.wc) {
            if (this.Q7 != null && (mc2Var = this.eb) != null && mc2Var.d0()) {
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
                            fg0 fg0Var = this.Wa;
                            if (fg0Var != null) {
                                fg0Var.setHotspot(x, P1);
                                this.f8 = false;
                                this.g8 = true;
                                postDelayed(new dc2(this, (byte) 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            u51 u51Var = this.Ra;
                            if (u51Var != null) {
                                u51Var.c(true);
                                this.Ua = x;
                                this.Va = P1;
                            }
                            u();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.e8) {
                            o();
                            this.e8 = false;
                            fg0 fg0Var2 = this.Wa;
                            if (fg0Var2 != null) {
                                if (!this.f8) {
                                    fg0Var2.setState(new int[]{16842919, 16842910});
                                    post(new dc2(this, (byte) 4));
                                } else {
                                    fg0Var2.setState(new int[0]);
                                }
                                this.f8 = false;
                                this.g8 = false;
                                invalidate();
                            }
                            u51 u51Var2 = this.Ra;
                            if (u51Var2 != null) {
                                u51Var2.c(false);
                            }
                            playSoundEffect(0);
                            boolean z = this.Ja;
                            mc2 mc2Var2 = this.eb;
                            if (z) {
                                if (mc2Var2 != null) {
                                    TLRPC.Chat chat = this.Ga;
                                    if (chat != null) {
                                        mc2Var2.W1(this, chat, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                                        rc2Var = this;
                                    } else {
                                        rc2Var = this;
                                        TLRPC.User user = rc2Var.Ea;
                                        if (user != null) {
                                            mc2Var2.W(rc2Var, user, rc2Var.h1, rc2Var.i1);
                                        } else if (rc2Var.Ha != null) {
                                            mc2Var2.Q0(rc2Var);
                                        }
                                    }
                                }
                            } else {
                                rc2Var = this;
                                if (mc2Var2 != null && (rc2Var.Q5.B2() || rc2Var.Q5.e4() || rc2Var.M7 || ((message = rc2Var.Q5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    rc2Var.eb.H(rc2Var, rc2Var.Q5.N1(), x, P1, false);
                                }
                            }
                        }
                    } else {
                        rc2Var = this;
                        if (motionEvent.getAction() == 3) {
                            rc2Var.e8 = false;
                            rc2Var.f8 = false;
                            fg0 fg0Var3 = rc2Var.Wa;
                            if (fg0Var3 != null) {
                                fg0Var3.setState(new int[0]);
                            }
                            rc2Var.invalidate();
                            u51 u51Var3 = rc2Var.Ra;
                            if (u51Var3 != null) {
                                u51Var3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x >= rc2Var.U7 && x <= i) {
                                float f2 = rc2Var.V7;
                                if (P1 >= f2 && P1 <= f2 + rc2Var.W7) {
                                    if (rc2Var.Wa != null && rc2Var.g8) {
                                        if (Math.sqrt(Math.pow((rc2Var.getY() + P1) - rc2Var.j8, 2.0d) + Math.pow(x - rc2Var.i8, 2.0d)) > 0.75d) {
                                            rc2Var.g8 = false;
                                        }
                                    }
                                }
                            }
                            rc2Var.e8 = false;
                            rc2Var.f8 = false;
                            rc2Var.g8 = false;
                            fg0 fg0Var4 = rc2Var.Wa;
                            if (fg0Var4 != null) {
                                fg0Var4.setState(new int[0]);
                            }
                            rc2Var.invalidate();
                            u51 u51Var4 = rc2Var.Ra;
                            if (u51Var4 != null) {
                                u51Var4.c(false);
                            }
                        }
                    }
                    return rc2Var.e8;
                }
                rc2Var = this;
                return rc2Var.e8;
            }
        } else {
            float x2 = motionEvent.getX();
            float P12 = P1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.eb != null) {
                    if (this.vc && (nc2Var4 = this.tc) != null && F2(nc2Var4, x2, P12)) {
                        nc2Var2 = this.tc;
                    } else if (this.wc && (nc2Var3 = this.uc) != null && F2(nc2Var3, x2, P12)) {
                        nc2Var2 = this.uc;
                    } else {
                        nc2Var2 = null;
                    }
                    if (nc2Var2 != null && (nc2Var2.a || this.eb.d0())) {
                        this.yc = nc2Var2;
                        nc2Var2.e.c(true);
                        fg0 fg0Var5 = nc2Var2.k;
                        if (fg0Var5 != null) {
                            fg0Var5.setHotspot(x2, P12);
                            nc2Var2.k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        u();
                        return true;
                    }
                }
            } else if (action == 1) {
                nc2 nc2Var5 = this.yc;
                if (nc2Var5 != null) {
                    o();
                    g3();
                    playSoundEffect(0);
                    if (nc2Var5.a) {
                        TLRPC.Chat chat2 = this.Ga;
                        if (chat2 != null) {
                            this.eb.W1(this, chat2, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.Ea;
                        mc2 mc2Var3 = this.eb;
                        if (user2 != null) {
                            mc2Var3.W(this, user2, this.h1, this.i1);
                            return true;
                        }
                        mc2Var3.Q0(this);
                        return true;
                    }
                    this.eb.H(this, this.Q5.N1(), x2, P12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    g3();
                } else if (action == 2 && (nc2Var = this.yc) != null && !F2(nc2Var, x2, P12)) {
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

    public final void c1(android.graphics.Canvas r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.c1(android.graphics.Canvas, boolean):void");
    }

    public Paint c2(String str) {
        Paint paint;
        ylb ylbVar = this.cc;
        if (ylbVar != null) {
            paint = ylbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return cmb.T0(str);
    }

    public final b66 c3() {
        b66 b66Var;
        ArrayList arrayList = this.w4;
        if (!arrayList.isEmpty()) {
            b66Var = (b66) arrayList.get(0);
            arrayList.remove(0);
        } else {
            b66Var = new b66(0);
        }
        b66Var.reset();
        this.x4.add(b66Var);
        return b66Var;
    }

    public final void c4(int i, int i2) {
        ArrayList arrayList;
        i47 i47Var = this.m3;
        yc2 yc2Var = this.ub;
        if (i47Var != null && (arrayList = i47Var.e) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                h47 h47Var = (h47) obj;
                ArrayList arrayList2 = h47Var.y;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((rna) obj2).i((i - h47Var.p(this.m3.e, yc2Var)) - this.s3, getWidth(), (i2 - h47Var.p(this.m3.e, yc2Var)) - this.t3);
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
                ((rna) obj3).i(i + height, getWidth(), i2 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            ArrayList arrayList4 = getMessageObject().B2;
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                h47 h47Var2 = (h47) obj4;
                ArrayList arrayList5 = h47Var2.y;
                int size5 = arrayList5.size();
                int i7 = 0;
                while (i7 < size5) {
                    Object obj5 = arrayList5.get(i7);
                    i7++;
                    ((rna) obj5).i((i - h47Var2.p(getMessageObject().B2, yc2Var)) - this.u0, getWidth(), (i2 - h47Var2.p(getMessageObject().B2, yc2Var)) - this.u0);
                }
            }
        }
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        lk1 lk1Var = this.w;
        if (lk1Var != null) {
            lk1Var.b();
        }
    }

    public final boolean d0(MotionEvent motionEvent) {
        k47 k47Var = this.Q5;
        if (k47Var == null || k47Var.y2 == null || k47Var.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.i0 + this.u0;
        motionEvent.offsetLocation(-this.o0, -topicSeparatorTopPadding);
        uj9 uj9Var = this.Q5.y2;
        mc2 mc2Var = this.eb;
        uj9Var.E = this;
        uj9Var.F = mc2Var;
        boolean L = uj9Var.L(motionEvent);
        motionEvent.offsetLocation(this.o0, topicSeparatorTopPadding);
        return L;
    }

    public final void d1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.d1(android.graphics.Canvas):void");
    }

    public final float d2(float f) {
        float f2;
        float f3;
        if (y2() && this.L9 != null) {
            return getCompactNameTimeY();
        }
        if (I3() && this.M1 != 7) {
            return ((getPhotoBottom() + this.w0) - gm.L(7.3f)) - this.L9.getHeight();
        }
        int i = this.e7;
        if (!this.G && !this.F) {
            f2 = 6.5f;
        } else {
            f2 = 7.5f;
        }
        float L = ((i - gm.L(f2)) - this.L9.getHeight()) + f;
        boolean z = this.Kb;
        yc2 yc2Var = this.ub;
        if (z && !v2()) {
            if (this.K) {
                f3 = 4.0f;
            } else {
                f3 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.O.i(yc2Var.L1) + gm.L(f3));
        }
        f47 f47Var = this.L;
        if (f47Var != null) {
            e47 e47Var = f47Var.m;
            float f4 = L + e47Var.h;
            if (e47Var.j) {
                return f4 - getTranslationY();
            }
            return f4;
        }
        return (yc2Var.j0 - yc2Var.k0) + L;
    }

    public final m37 d3(String str) {
        ?? r1;
        int i;
        int i2;
        boolean o;
        int i3;
        Integer valueOf;
        m37 m37Var = (m37) b2(str);
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.O3() && R2()) {
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
            ylb ylbVar = this.cc;
            int i5 = nyc.c[0];
            if (ylbVar != null) {
                i2 = ylbVar.j(i5);
            } else {
                i2 = cmb.km.get(i5);
            }
            if (i2 == 0) {
                valueOf = null;
            } else {
                if (ylbVar != null) {
                    o = ylbVar.a();
                } else {
                    o = cmb.I.o();
                }
                int b = nyc.b(ylbVar, true);
                if (o) {
                    i3 = -16777216;
                } else {
                    i3 = -1;
                }
                int v = cmb.v(i3, b);
                if (r1 != 0) {
                    v = cmb.v(v, cmb.v0(cmb.Rc, ylbVar));
                }
                valueOf = Integer.valueOf(v);
            }
            if (valueOf != null) {
                m37[] m37VarArr = this.pc;
                if (m37VarArr == null) {
                    m37VarArr = new m37[4];
                    this.pc = m37VarArr;
                }
                if (i != 0) {
                    i4 = 2;
                }
                int i6 = i4 + r1;
                if (m37VarArr[i6] == null) {
                    m37VarArr[i6] = new m37(i, true, r1, this.cc);
                }
                m37 m37Var2 = this.pc[i6];
                m37Var2.w = valueOf;
                return m37Var2;
            }
        }
        return m37Var;
    }

    public void d4() {
        int i;
        k47 k47Var = this.Q5;
        if (k47Var == null) {
            return;
        }
        float f = this.vd + this.wd;
        if (!k47Var.O3() || this.Q5.D2) {
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
            f += gm.L(71 - i) * this.Z6;
        }
        setTranslationX(f);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k47 k47Var;
        if (i == nm7.m1) {
            setSpoilersSuppressed(false);
        } else if (i == nm7.l1) {
            setSpoilersSuppressed(true);
        } else if (i == nm7.E0) {
            TLRPC.User user = this.va;
            if (user != null && user.id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.Q5);
            }
        } else if (i == nm7.m4) {
            invalidate();
        } else if (i == nm7.Y2 && (k47Var = this.Q5) != null) {
            TLRPC.MessageMedia messageMedia = k47Var.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                z3(k47Var, this.L, this.G, this.F, this.H, false);
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

    public final boolean e0(int i, MotionEvent motionEvent) {
        int i2;
        rna rnaVar;
        int i3;
        int i4;
        i47 i47Var;
        i47 i47Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        f47 f47Var;
        if (i <= 15 && getParent() != null) {
            boolean z = true;
            if (this.Q5.z2() && (f47Var = this.L) != null && !f47Var.i) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt instanceof rc2) {
                        rc2 rc2Var = (rc2) childAt;
                        f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
                        c47 currentPosition = rc2Var.getCurrentPosition();
                        if (currentMessagesGroup != null && currentMessagesGroup.a == this.L.a) {
                            int i10 = currentPosition.l;
                            if ((i10 & 8) != 0 && (i10 & 1) != 0 && rc2Var != this) {
                                motionEvent.offsetLocation(getLeft() - rc2Var.getLeft(), getTop() - rc2Var.getTop());
                                boolean e0 = rc2Var.e0(i + 1, motionEvent);
                                motionEvent.offsetLocation(-(getLeft() - rc2Var.getLeft()), -(getTop() - rc2Var.getTop()));
                                return e0;
                            }
                        }
                    }
                }
            }
            if (!this.P5) {
                int x = (int) motionEvent.getX();
                int P1 = (int) P1(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                yc2 yc2Var = this.ub;
                if (actionMasked == 0) {
                    int i11 = this.o0;
                    if (x >= i11 && P1 >= (i7 = this.u0)) {
                        k47 k47Var = this.Q5;
                        if (x <= i11 + k47Var.v2 && P1 <= k47Var.V5(yc2Var) + i7) {
                            ArrayList arrayList = this.Q5.B2;
                            for (int i12 = 0; i12 < arrayList.size() && ((h47) arrayList.get(i12)).p(this.Q5.B2, yc2Var) <= P1; i12++) {
                                h47 h47Var = (h47) arrayList.get(i12);
                                if (h47Var.l()) {
                                    i8 = (int) this.Q5.x2;
                                } else {
                                    i8 = 0;
                                }
                                ArrayList arrayList2 = h47Var.y;
                                int size = arrayList2.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList2.get(i13);
                                    i13++;
                                    rna rnaVar2 = (rna) obj;
                                    boolean z2 = z;
                                    if (rnaVar2.getBounds().contains((x - this.o0) + i8, (int) ((P1 - this.u0) - h47Var.p(this.Q5.B2, yc2Var)))) {
                                        this.O5 = rnaVar2;
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
                            if (f3 >= f4 && f <= f2 + i47Var.c && f3 <= f4 + i47Var.c(yc2Var)) {
                                ArrayList arrayList3 = this.m3.e;
                                for (int i14 = 0; i14 < arrayList3.size() && ((h47) arrayList3.get(i14)).p(this.m3.e, yc2Var) <= f3; i14++) {
                                    h47 h47Var2 = (h47) arrayList3.get(i14);
                                    if (h47Var2.l()) {
                                        i6 = (int) this.m3.d;
                                    } else {
                                        i6 = 0;
                                    }
                                    ArrayList arrayList4 = h47Var2.y;
                                    int size2 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = arrayList4.get(i15);
                                        i15++;
                                        rna rnaVar3 = (rna) obj2;
                                        ArrayList arrayList5 = arrayList3;
                                        float f5 = f;
                                        if (rnaVar3.getBounds().contains((int) ((f - this.s3) + i6), (int) ((f3 - this.t3) - h47Var2.p(this.m3.e, yc2Var)))) {
                                            this.O5 = rnaVar3;
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
                            if (f8 > f9 && f6 <= f7 + i47Var2.c && f8 <= f9 + i47Var2.c(yc2Var)) {
                                ArrayList arrayList6 = this.q3.e;
                                for (int i16 = 0; i16 < arrayList6.size() && ((h47) arrayList6.get(i16)).p(this.q3.e, yc2Var) <= f8; i16++) {
                                    h47 h47Var3 = (h47) arrayList6.get(i16);
                                    if (h47Var3.l()) {
                                        i5 = (int) this.q3.d;
                                    } else {
                                        i5 = 0;
                                    }
                                    ArrayList arrayList7 = h47Var3.y;
                                    int size3 = arrayList7.size();
                                    int i17 = 0;
                                    while (i17 < size3) {
                                        Object obj3 = arrayList7.get(i17);
                                        i17++;
                                        rna rnaVar4 = (rna) obj3;
                                        if (rnaVar4.getBounds().contains((int) ((f6 - this.u5) + i5), (int) ((f8 - this.v5) - h47Var3.p(this.q3.e, yc2Var)))) {
                                            this.O5 = rnaVar4;
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
                    i47 i47Var3 = this.q3;
                    if (i47Var3 != null) {
                        ArrayList arrayList8 = i47Var3.e;
                        int size4 = arrayList8.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            Object obj4 = arrayList8.get(i18);
                            i18++;
                            h47 h47Var4 = (h47) obj4;
                            ArrayList arrayList9 = h47Var4.y;
                            int size5 = arrayList9.size();
                            int i19 = 0;
                            while (i19 < size5) {
                                int i20 = i19 + 1;
                                Rect bounds = ((rna) arrayList9.get(i19)).getBounds();
                                path.addRect(bounds.left, h47Var4.p(this.q3.e, yc2Var) + bounds.top, bounds.right, h47Var4.p(this.q3.e, yc2Var) + bounds.bottom, Path.Direction.CW);
                                i19 = i20;
                            }
                        }
                    }
                    i47 i47Var4 = this.m3;
                    if (i47Var4 != null) {
                        ArrayList arrayList10 = i47Var4.e;
                        int size6 = arrayList10.size();
                        int i21 = 0;
                        while (i21 < size6) {
                            Object obj5 = arrayList10.get(i21);
                            i21++;
                            h47 h47Var5 = (h47) obj5;
                            ArrayList arrayList11 = h47Var5.y;
                            int size7 = arrayList11.size();
                            int i22 = 0;
                            while (i22 < size7) {
                                int i23 = i22 + 1;
                                Rect bounds2 = ((rna) arrayList11.get(i22)).getBounds();
                                path.addRect(bounds2.left, h47Var5.p(this.m3.e, yc2Var) + bounds2.top, bounds2.right, h47Var5.p(this.m3.e, yc2Var) + bounds2.bottom, Path.Direction.CW);
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
                                h47 h47Var6 = (h47) obj6;
                                ArrayList arrayList13 = h47Var6.y;
                                int size9 = arrayList13.size();
                                int i25 = 0;
                                while (i25 < size9) {
                                    int i26 = i25 + 1;
                                    Rect bounds3 = ((rna) arrayList13.get(i25)).getBounds();
                                    path.addRect(bounds3.left, h47Var6.p(this.Q5.B2, yc2Var) + bounds3.top, bounds3.right, h47Var6.p(this.Q5.B2, yc2Var) + bounds3.bottom, Path.Direction.CW);
                                    i25 = i26;
                                }
                            }
                        }
                    }
                    RectF rectF = this.c4;
                    path.computeBounds(rectF, false);
                    float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
                    this.P5 = true;
                    this.O5.q = new dc2(this, (byte) 9);
                    i47 i47Var5 = this.q3;
                    if (i47Var5 != null) {
                        ArrayList arrayList14 = i47Var5.e;
                        int size10 = arrayList14.size();
                        int i27 = 0;
                        while (i27 < size10) {
                            Object obj7 = arrayList14.get(i27);
                            i27++;
                            h47 h47Var7 = (h47) obj7;
                            if (h47Var7.l()) {
                                i4 = (int) this.q3.d;
                            } else {
                                i4 = 0;
                            }
                            ArrayList arrayList15 = h47Var7.y;
                            int size11 = arrayList15.size();
                            int i28 = 0;
                            while (i28 < size11) {
                                Object obj8 = arrayList15.get(i28);
                                i28++;
                                ((rna) obj8).j((x - this.u5) + i4, (P1 - h47Var7.p(this.q3.e, yc2Var)) - this.v5, sqrt, false);
                                arrayList14 = arrayList14;
                            }
                        }
                    }
                    i47 i47Var6 = this.m3;
                    if (i47Var6 != null) {
                        ArrayList arrayList16 = i47Var6.e;
                        int size12 = arrayList16.size();
                        int i29 = 0;
                        while (i29 < size12) {
                            Object obj9 = arrayList16.get(i29);
                            i29++;
                            h47 h47Var8 = (h47) obj9;
                            if (h47Var8.l()) {
                                i3 = (int) this.m3.d;
                            } else {
                                i3 = 0;
                            }
                            ArrayList arrayList17 = h47Var8.y;
                            int size13 = arrayList17.size();
                            int i30 = 0;
                            while (i30 < size13) {
                                Object obj10 = arrayList17.get(i30);
                                i30++;
                                ((rna) obj10).j((x - this.s3) + i3, (P1 - h47Var8.p(this.m3.e, yc2Var)) - this.t3, sqrt, false);
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
                                h47 h47Var9 = (h47) obj11;
                                if (h47Var9.l()) {
                                    i2 = (int) this.Q5.x2;
                                } else {
                                    i2 = 0;
                                }
                                ArrayList arrayList19 = h47Var9.y;
                                int size15 = arrayList19.size();
                                int i32 = 0;
                                while (i32 < size15) {
                                    Object obj12 = arrayList19.get(i32);
                                    i32++;
                                    ((rna) obj12).j((x - this.o0) + i2, (P1 - h47Var9.p(this.Q5.B2, yc2Var)) - this.u0, sqrt, false);
                                }
                            }
                        }
                    }
                    if (getParent() instanceof r59) {
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        for (int i33 = 0; i33 < viewGroup2.getChildCount(); i33++) {
                            View childAt2 = viewGroup2.getChildAt(i33);
                            if (childAt2 instanceof rc2) {
                                rc2 rc2Var2 = (rc2) childAt2;
                                ArrayList arrayList20 = rc2Var2.fc;
                                if (rc2Var2.getMessageObject() != null && rc2Var2.getMessageObject().N1() == getMessageObject().e1() && !arrayList20.isEmpty()) {
                                    ((rna) arrayList20.get(0)).q = new ra2(this, rc2Var2, (byte) 9);
                                    int size16 = arrayList20.size();
                                    int i34 = 0;
                                    while (i34 < size16) {
                                        Object obj13 = arrayList20.get(i34);
                                        i34++;
                                        ((rna) obj13).j(rnaVar.getBounds().centerX(), rnaVar.getBounds().centerY(), sqrt, false);
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
                TLRPC.TodoItem todoItem = ((qc2) arrayList.get(i2)).t;
                if (todoItem != null && todoItem.id == i) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final void e3(k47 k47Var) {
        final int i = this.a6;
        ra2 ra2Var = new ra2(this, k47Var, (byte) 7);
        np3 np3Var = jd8.a;
        TLRPC.Document F0 = k47Var.F0();
        if (F0 != null) {
            final long j = F0.id;
            if (!oc7.r1(i).l4.v0.f && jd8.b.get(Long.valueOf(j)) == null && !jd8.c.containsKey(Long.valueOf(j))) {
                HashMap hashMap = jd8.d;
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.add(ra2Var);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ra2Var);
                hashMap.put(Long.valueOf(j), arrayList2);
                final TLRPC.Message message = k47Var.k;
                final String language = jb6.D0().y.getLanguage();
                final float f = gm.p;
                np3 np3Var2 = jd8.a;
                if (np3Var2 == null) {
                    np3Var2 = new np3("pkpass", true);
                    jd8.a = np3Var2;
                }
                np3Var2.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.id8.run():void");
                    }
                });
            }
        }
    }

    public final void e4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.e4():void");
    }

    @Override
    public final void f(float f) {
        k47 k47Var = this.Q5;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(this.Q5, f);
        W3();
    }

    public final void f0() {
        byte b;
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            TLRPC.MessageMedia n1 = k47.n1(k47Var.k);
            if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null && !this.R) {
                Drawable t = this.U0.t();
                if (t instanceof o09) {
                    o09 o09Var = (o09) t;
                    if ((o09Var.n0 != null || o09Var.Z0) && !this.R && (b = o09Var.K) != 1 && b == 2) {
                        if (!o09Var.Y0) {
                            float o = o09Var.o();
                            if (o09Var.V0 != null) {
                                o = o09Var.b0 / o09Var.b1;
                            }
                            if (o <= 0.95f) {
                                return;
                            }
                        }
                        this.R = true;
                        mc2 mc2Var = this.eb;
                        if (mc2Var != null) {
                            mc2Var.o1(this, false);
                        }
                    }
                }
            }
        }
    }

    public final void f1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        if (this.m3 != null) {
            return true;
        }
        return false;
    }

    public final void f3() {
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.B2 != null) {
            for (int i = 0; i < this.Q5.B2.size(); i++) {
                h47 h47Var = (h47) this.Q5.B2.get(i);
                fg0 fg0Var = h47Var.T;
                if (fg0Var != null) {
                    fg0Var.setCallback(this);
                    h47Var.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.m3 != null) {
            for (int i2 = 0; i2 < this.m3.e.size(); i2++) {
                h47 h47Var2 = (h47) this.m3.e.get(i2);
                fg0 fg0Var2 = h47Var2.T;
                if (fg0Var2 != null) {
                    fg0Var2.setCallback(this);
                    h47Var2.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (v2()) {
            invalidate();
        }
    }

    public final al9 f4() {
        if (this.Q5 != null && R2()) {
            return (al9) this.Q5.y2.g.get(0);
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
        path.addRoundRect(this.yd, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
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

    public final boolean g0(MotionEvent motionEvent) {
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
                fg0 fg0Var = this.v8;
                if (fg0Var != null) {
                    fg0Var.setHotspot(x, P1);
                    this.v8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ta.i && !rectF.contains(x, P1)) {
                this.Ta.c(false);
                fg0 fg0Var2 = this.v8;
                if (fg0Var2 != null) {
                    fg0Var2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ta.i) {
                this.eb.G(this);
            }
            this.Ta.c(false);
            fg0 fg0Var3 = this.v8;
            if (fg0Var3 != null) {
                fg0Var3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ta.c(false);
            fg0 fg0Var4 = this.v8;
            if (fg0Var4 != null) {
                fg0Var4.setState(new int[0]);
            }
        }
        return this.Ta.i;
    }

    public final void g1(Canvas canvas) {
        float f;
        float f2;
        float L;
        float L2;
        int i;
        int i2;
        Canvas canvas2;
        k47 k47Var = this.Q5;
        if (k47Var != null && !k47Var.q4()) {
            float f3 = this.u0;
            yc2 yc2Var = this.ub;
            if (yc2Var.m2) {
                float f4 = yc2Var.o2;
                float f5 = yc2Var.L1;
                f = (f5 * f3) + ((1.0f - f5) * f4);
            } else {
                f = f3;
            }
            if (yc2Var.L1 != 1.0f && yc2Var.H0) {
                canvas.save();
                m37 m37Var = this.L6;
                if (m37Var != null) {
                    Rect bounds = m37Var.getBounds();
                    if (this.Q5.O3() && !this.C6 && !this.G) {
                        canvas.clipRect(gm.L(4.0f) + bounds.left, gm.L(4.0f) + bounds.top, bounds.right - gm.L(10.0f), bounds.bottom - gm.L(4.0f));
                    } else {
                        canvas.clipRect(gm.L(4.0f) + bounds.left, gm.L(4.0f) + bounds.top, bounds.right - gm.L(4.0f), bounds.bottom - gm.L(4.0f));
                    }
                }
                oi7 oi7Var = this.Mc;
                if (oi7Var != null && oi7Var.h) {
                    k47 k47Var2 = this.Q5;
                    f1(this.o0, f, canvas, k47Var2.B2, k47Var2.x2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.o0, f, canvas, yc2Var.I0, yc2Var.O0, false, 1.0f - yc2Var.L1, true, false, false, false);
                    k47 k47Var3 = this.Q5;
                    f1(this.o0, f, canvas, k47Var3.B2, k47Var3.x2, true, yc2Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            boolean z = yc2Var.E1;
            if (z && this.L6 != null) {
                if (z) {
                    int i3 = -1;
                    if (this.v1) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    float A = td4.A(1.0f, yc2Var.L1, this.Q5.V5(yc2Var) * i2, f3);
                    float f6 = yc2Var.o2;
                    if (this.v1) {
                        i3 = 1;
                    }
                    f2 = A;
                    f = f6 - ((this.Q5.V5(yc2Var) * i3) * yc2Var.L1);
                } else {
                    f2 = f;
                }
                canvas.save();
                RectF rectF = gm.P;
                rectF.set(this.L6.getBounds());
                if (this.Q5.O3() && !this.C6 && !this.G) {
                    rectF.left += gm.L(4.0f);
                    L = rectF.right - gm.L(10.0f);
                    rectF.right = L;
                } else {
                    rectF.left += gm.L(4.0f);
                    L = rectF.right - gm.L(4.0f);
                    rectF.right = L;
                }
                float f7 = rectF.left;
                float f8 = yc2Var.o2;
                canvas.clipRect(f7, f8, L, this.Q5.V5(yc2Var) + f8 + gm.L(4.0f));
                k47 k47Var4 = this.Q5;
                f1(this.o0, f, canvas, k47Var4.B2, k47Var4.x2, false, 1.0f - yc2Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.L6.getBounds());
                if (this.Q5.O3() && !this.C6 && !this.G) {
                    rectF.left += gm.L(4.0f);
                    L2 = rectF.right - gm.L(10.0f);
                    rectF.right = L2;
                } else {
                    rectF.left += gm.L(4.0f);
                    L2 = rectF.right - gm.L(4.0f);
                    rectF.right = L2;
                }
                canvas.clipRect(rectF.left, this.u0, L2, gm.L(4.0f) + this.Q5.V5(yc2Var) + i);
                k47 k47Var5 = this.Q5;
                f1(this.o0, f2, canvas, k47Var5.B2, k47Var5.x2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            k47 k47Var6 = this.Q5;
            f1(this.o0, f, canvas, k47Var6.B2, k47Var6.x2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        if (v2()) {
            k47 k47Var = this.Q5;
            if (k47Var.D != 27 && !k47Var.q4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g3() {
        nc2 nc2Var = this.yc;
        if (nc2Var != null) {
            fg0 fg0Var = nc2Var.k;
            if (fg0Var != null) {
                fg0Var.setState(StateSet.NOTHING);
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
        return new ac2(this);
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
        ln0[] ln0VarArr = (ln0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ln0.class);
        for (int length = ln0VarArr.length - 1; length >= 0; length--) {
            int spanStart = spannableStringBuilder.getSpanStart(ln0VarArr[length]);
            int spanEnd = spannableStringBuilder.getSpanEnd(ln0VarArr[length]);
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

    public defpackage.gn[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.getAnimatedEmojiSpans():gn[]");
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

    public f37 getBackgroundDrawable() {
        return this.fb;
    }

    public int getBackgroundDrawableBottom() {
        int i;
        c47 c47Var = this.M;
        int i2 = 0;
        if (c47Var != null) {
            int i3 = 4;
            if ((c47Var.l & 4) == 0) {
                i = gm.L(3.0f);
            } else {
                i = 0;
            }
            if ((this.M.l & 8) == 0) {
                k47 k47Var = this.Q5;
                if (k47Var != null && k47Var.O3()) {
                    i3 = 3;
                }
                i += gm.L(i3);
            }
        } else {
            i = 0;
        }
        boolean z = this.K;
        if (!z || !this.J) {
            if (z) {
                i2 = gm.L(1.0f);
            } else {
                i2 = gm.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.e7) - i2) + i;
        if (!this.C6) {
            if (this.J) {
                backgroundDrawableTop += gm.L(1.0f);
            }
            if (this.K) {
                return gm.L(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int compactInShift;
        int i;
        k47 messageObject = getMessageObject();
        int i2 = 0;
        float f = 9.0f;
        if (messageObject != null && messageObject.O3()) {
            boolean z = this.Kb;
            int i3 = this.d7 - this.b7;
            if (z) {
                return i3 - ((int) ((1.0f - getVideoTranscriptionProgress()) * gm.L(9.0f)));
            }
            if (this.C6) {
                i2 = gm.L(9.0f);
            }
            return i3 - i2;
        }
        float f2 = 71.0f;
        if (this.Kb) {
            if (!O2()) {
                if ((this.f6 || ((messageObject != null && (messageObject.j2 || messageObject.l2 || messageObject.k.guestchat_via_from != null)) || k47.B0(messageObject.k) == 489000)) && this.G6) {
                    i2 = 48;
                }
                f2 = i2 + 3;
            }
            compactInShift = gm.L(f2) + ((int) ((1.0f - getVideoTranscriptionProgress()) * gm.L(6.0f)));
        } else {
            if (!O2()) {
                if ((this.f6 || ((messageObject != null && (messageObject.j2 || messageObject.l2 || messageObject.k.guestchat_via_from != null)) || k47.B0(messageObject.k) == 489000)) && this.G6) {
                    i2 = 48;
                }
                f2 = i2;
            }
            int L = gm.L(f2);
            if (!this.C6) {
                f = 3.0f;
            }
            compactInShift = getCompactInShift() + gm.L(f) + L;
        }
        f47 f47Var = this.L;
        if (f47Var != null && !f47Var.i && (i = this.M.j) != 0) {
            compactInShift += (int) Math.ceil((i / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.Kb) {
            if (this.K) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * gm.L(6.0f)));
            }
        } else if (!this.C6 && this.K) {
            return gm.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i;
        int backgroundDrawableLeft;
        k47 k47Var;
        k47 k47Var2;
        int i2 = this.b7;
        if (this.Kb) {
            i = i2 - ((int) (getVideoTranscriptionProgress() * gm.L(3.0f)));
            if (this.K && (k47Var2 = this.Q5) != null && k47Var2.O3()) {
                i = (int) (i - ((1.0f - getVideoTranscriptionProgress()) * gm.L(6.0f)));
            }
            if (this.K && ((k47Var = this.Q5) == null || !k47Var.O3())) {
                i = (int) (i - ((1.0f - getVideoTranscriptionProgress()) * gm.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.C6) {
                L = 0;
            } else {
                L = gm.L(3.0f);
            }
            i = i2 - L;
            if (!this.C6 && this.K) {
                i -= gm.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i;
    }

    public int getBackgroundDrawableTop() {
        int i;
        c47 c47Var = this.M;
        int i2 = 0;
        if (c47Var != null && (c47Var.l & 4) == 0) {
            i = 0 - gm.L(3.0f);
        } else {
            i = 0;
        }
        if (!this.J) {
            i2 = gm.L(1.0f);
        }
        int i3 = i + i2;
        if (!this.C6 && this.J) {
            return i3 - gm.L(1.0f);
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
        yc2 yc2Var = this.ub;
        if (yc2Var.C1) {
            return gm.U1(yc2Var.L1, yc2Var.B1, this.e0);
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
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.O3()) {
            z = true;
        } else {
            z = false;
        }
        if (b3()) {
            if (this.M != null) {
                f2 = 73.0f;
            } else {
                k47 k47Var2 = this.Q5;
                if (k47Var2 != null && k47Var2.j2) {
                    i3 = 42;
                } else {
                    i3 = 63;
                }
                f2 = i3;
            }
            i = gm.L(f2);
        } else {
            i = 0;
        }
        if (z && (U(this.Q5) || this.I4)) {
            i2 = gm.L(48.0f);
        } else {
            i2 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i) - i2;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            k47 k47Var3 = this.Q5;
            if (k47Var3 != null && k47Var3.O3()) {
                L = (getMeasuredWidth() - widthForButtons) - gm.L(10.0f);
            } else {
                int i4 = this.N6;
                if (!this.C6 && !this.K) {
                    f = 7.0f;
                } else {
                    f = 1.0f;
                }
                L = i4 + gm.L(f);
            }
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                i5 = Math.max(i5, ((int) (((wp0) arrayList.get(i6)).c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i5);
        }
        if (this.T != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.T.j()) - gm.L(18.0f))) / 2);
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
        k47 k47Var = this.Q5;
        if (k47Var != null && !k47Var.O3() && (U(this.Q5) || this.I4)) {
            i = gm.L(48.0f);
        } else {
            i = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            k47 k47Var2 = this.Q5;
            if (k47Var2 != null && k47Var2.O3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - gm.L(10.0f);
            } else {
                int i2 = this.N6;
                if (!this.C6 && !this.K) {
                    f = 7.0f;
                } else {
                    f = 1.0f;
                }
                L = i2 + gm.L(f);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                wp0 wp0Var = (wp0) arrayList.get(i4);
                float f2 = widthForButtons;
                i3 = Math.max(i3, ((int) (wp0Var.c * f2)) + L + ((int) (wp0Var.e * f2)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i3);
        }
        if (this.T != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.T.j() + getParentWidth()) + gm.L(18.0f))) / 2);
        }
        if (this.f0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public i47 getCaptionLayout() {
        return this.m3;
    }

    public float getCaptionX() {
        yc2 yc2Var = this.ub;
        if (yc2Var.x0) {
            if (yc2Var.D0) {
                this.s3 += yc2Var.h0;
            } else if (yc2Var.t0) {
                float f = this.s3;
                float f2 = yc2Var.L1;
                this.s3 = td4.A(1.0f, f2, yc2Var.r0, f * f2);
            } else if (!k47.Q4(this.Q5.k) || !TextUtils.isEmpty(this.Q5.z)) {
                this.s3 += yc2Var.h0;
            }
        }
        return this.s3;
    }

    public float getCaptionY() {
        float f = this.t3;
        yc2 yc2Var = this.ub;
        if (yc2Var.x0) {
            if (yc2Var.D0) {
                return f - getTranslationY();
            }
            if (yc2Var.t0) {
                float f2 = yc2Var.L1;
                return td4.A(1.0f, f2, yc2Var.s0, f * f2);
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
        if (gda.U0 >= 10) {
            f = 27.3f;
        } else {
            f = 25.3f;
        }
        return i - gm.L(f);
    }

    public int getChecksY() {
        int intrinsicHeight;
        boolean O5 = this.Q5.O5();
        float f = this.K9;
        if (O5) {
            intrinsicHeight = b2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            intrinsicHeight = cmb.E3.getIntrinsicHeight();
        }
        return (int) (f - intrinsicHeight);
    }

    public int getCompactContentWidth() {
        int parentWidth;
        if (gm.O1()) {
            parentWidth = gm.P0();
        } else {
            parentWidth = getParentWidth();
        }
        return (parentWidth - gm.L(32.0f)) - getCompactSideMenuWidth();
    }

    public int getCompactLeft() {
        return gm.L(16.0f);
    }

    public int getCompactRight() {
        return (getMeasuredWidth() - gm.L(16.0f)) - getCompactSideMenuWidth();
    }

    public int getCurrentBackgroundLeft() {
        m37 m37Var = this.L6;
        if (m37Var == null) {
            return 0;
        }
        int i = m37Var.getBounds().left;
        if (!this.Q5.O3() && this.ub.A0 != 1.0f) {
            boolean z = this.Kb;
            if ((z || !this.C6) && !this.K) {
                if (z) {
                    return (int) (i - (getVideoTranscriptionProgress() * gm.L(6.0f)));
                }
                return i - gm.L(6.0f);
            }
            return i;
        }
        return i;
    }

    public int getCurrentBackgroundRight() {
        boolean z;
        m37 m37Var = this.L6;
        if (m37Var == null) {
            return getWidth();
        }
        int i = m37Var.getBounds().right;
        if (this.Q5.O3() && this.ub.A0 != 1.0f && (((z = this.Kb) || !this.C6) && !this.K)) {
            if (z) {
                return (int) ((getVideoTranscriptionProgress() * gm.L(6.0f)) + i);
            }
            return gm.L(6.0f) + i;
        }
        return i;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.wa;
    }

    public f47 getCurrentMessagesGroup() {
        return this.L;
    }

    public c47 getCurrentPosition() {
        return this.M;
    }

    public TLRPC.User getCurrentUser() {
        return this.va;
    }

    public mc2 getDelegate() {
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
        yc2 yc2Var = this.ub;
        if (z) {
            Typeface typeface = gm.a;
            L2 = this.p0 - gm.L(10.0f);
        } else {
            if (this.U1) {
                Typeface typeface2 = gm.a;
                i = this.p0;
                L3 = gm.L(1.0f);
            } else if (this.Q5.q4()) {
                Typeface typeface3 = gm.a;
                i = this.p0;
                L3 = gm.L(1.0f);
            } else {
                float f3 = 12.0f;
                if (this.Q5.O3()) {
                    f = getExtraTextX() + gm.L(12.0f) + this.N6;
                    if (this.Q5.D == 19) {
                        f -= Math.max(0.0f, ((Math.max(this.X7, this.Z7) + f) + gm.L(14.0f)) - gm.q.x);
                    }
                } else {
                    boolean z2 = this.C6;
                    int i3 = this.N6;
                    if (z2) {
                        L = gm.L(12.0f) + i3;
                        extraTextX = getExtraTextX();
                    } else {
                        if (!this.K) {
                            f3 = 18.0f;
                        }
                        L = gm.L(f3) + i3;
                        extraTextX = getExtraTextX();
                    }
                    f = extraTextX + L;
                }
                L2 = (f + yc2Var.h0) - gm.L(1.33f);
            }
            L2 = L3 + i;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (yc2Var != null) {
            f2 = yc2Var.i0;
        }
        float f4 = backgroundDrawableRight + f2;
        int i4 = 0;
        if (this.Q5.O3() && !this.C6 && !this.K) {
            i2 = 6;
        } else {
            i2 = 0;
        }
        int L4 = (int) (((f4 - gm.L(10 + i2)) - getExtraTextX()) - L2);
        float L5 = L2 + gm.L(10.0f);
        if (Math.abs(this.c2) > 1) {
            i4 = ((L4 - gm.L(20.0f)) - this.b2) - this.c2;
        }
        return L5 + i4;
    }

    public float getDescriptionLayoutY() {
        float f;
        float f2 = this.Y1;
        yc2 yc2Var = this.ub;
        if (!yc2Var.s2) {
            f = (-yc2Var.k0) + yc2Var.j0;
        } else {
            f = 0.0f;
        }
        return f2 + f;
    }

    public StaticLayout getDescriptionlayout() {
        return this.p2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        k47 k47Var;
        c47 c47Var = this.M;
        if ((c47Var == null || c47Var.h) && (k47Var = this.Q5) != null) {
            return k47Var.M0();
        }
        return null;
    }

    public i47 getExplanationLayout() {
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
        l39 l39Var = this.O;
        if (h2) {
            if (l39Var.p) {
                i = 18;
            } else {
                i = 0;
            }
            i2 += gm.L(i + 2) + this.s0.r;
        }
        if (this.x7) {
            i2 += getCommentButtonHeight();
        }
        if (!l39Var.p) {
            this.Q5.getClass();
            return i2 + l39Var.n;
        }
        return i2;
    }

    public int getExtraTextX() {
        int i = gda.U0;
        if (i >= 15) {
            return gm.L(2.0f);
        }
        if (i >= 11) {
            return gm.L(1.0f);
        }
        return 0;
    }

    public int getExtraTimeX() {
        int i;
        if (!v2()) {
            if (!this.Q5.O3() && ((!this.C6 || this.m3 != null) && (i = gda.U0) > 11)) {
                return gm.L((i - 11) / 1.5f);
            }
            if (!this.Q5.O3() && this.Lb && this.G6 && this.Q5.D == 5) {
                return (int) ((gm.b3(this.X6, w2()) - gm.u) * 0.7f);
            }
            return 0;
        }
        return 0;
    }

    public StaticLayout getFactCheckLayout() {
        tc2 tc2Var = this.s0;
        if (tc2Var != null) {
            return tc2Var.g;
        }
        return null;
    }

    public String getFilename() {
        byte b;
        byte b2;
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            int i = k47Var.D;
            if (i == 1) {
                TLRPC.PhotoSize photoSize = this.e4;
                if (photoSize != null) {
                    return bc4.r(null, photoSize);
                }
            } else if (i != 8 && (b2 = this.M1) != 7 && b2 != 4 && b2 != 8 && i != 9 && b2 != 3 && b2 != 5) {
                if (b2 != 0) {
                    return bc4.r(null, this.N1);
                }
                TLRPC.PhotoSize photoSize2 = this.e4;
                if (photoSize2 != null) {
                    return bc4.r(null, photoSize2);
                }
            } else if (!k47Var.E0) {
                if (k47Var.y0 && !TextUtils.isEmpty(k47Var.k.attachPath)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.getIconForCurrentState():int");
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
        k47 k47Var;
        k47 k47Var2;
        int i2;
        int i3;
        float f;
        int L3;
        int parentWidth;
        c47 c47Var;
        if (v2() && this.L == null) {
            return getCompactContentWidth();
        }
        byte b = this.M1;
        if (b != 6 && b != 8 && (i2 = (k47Var2 = this.Q5).D) != 5) {
            f47 f47Var = this.L;
            int i4 = 0;
            if (f47Var != null && !f47Var.i) {
                if (gm.O1()) {
                    parentWidth = gm.P0();
                } else {
                    parentWidth = getParentWidth();
                }
                i3 = 0;
                for (int i5 = 0; i5 < this.L.e.size(); i5++) {
                    if (((c47) this.L.e.get(i5)).c != 0) {
                        break;
                    }
                    i3 = (int) (Math.ceil(((c47Var.e + c47Var.j) / 1000.0f) * parentWidth) + i3);
                }
                if (this.X6) {
                    i4 = 71;
                } else if (b3()) {
                    i4 = 48;
                }
                L3 = gm.L(i4 + 31);
            } else if (i2 == 19) {
                int i6 = k47Var2.v2;
                int L4 = gm.q.x - gm.L(52.0f);
                if (this.G6) {
                    i4 = gm.L(48.0f);
                }
                return Math.max(i6, (int) ((L4 - i4) * 0.5f));
            } else {
                i3 = this.b7;
                if (k47Var2.n2 && k47Var2.O3() && U(this.Q5)) {
                    i3 -= gm.L(25.0f);
                }
                if (this.C6) {
                    f = 22.0f;
                } else {
                    f = 31.0f;
                }
                L3 = gm.L(f);
            }
            return i3 - L3;
        }
        float f2 = 0.0f;
        if (gm.O1()) {
            min = gm.P0();
            if (this.X6) {
                f2 = 71.0f;
            } else if (b3()) {
                f2 = 42.0f;
            }
            L = gm.L(f2);
        } else {
            min = Math.min(getParentWidth(), gm.q.y);
            if (this.X6) {
                f2 = 71.0f;
            } else if (b3()) {
                f2 = 42.0f;
            }
            L = gm.L(f2);
        }
        int i7 = min - L;
        k47 k47Var3 = this.Q5;
        if (k47Var3 != null && k47Var3.n2 && k47Var3.O3() && U(this.Q5)) {
            i7 -= gm.L(25.0f);
        }
        if (this.Lb && ((k47Var = this.Q5) == null || !k47Var.S4())) {
            i = i7 - (this.b7 - (gm.b3(this.X6, w2()) - gm.u));
            L2 = gm.L(57.0f);
        } else if (this.X6 && (this.Q5.D == 5 || this.M1 == 6)) {
            return this.b7 - gm.L(57.0f);
        } else {
            i = i7 - this.b7;
            L2 = gm.L(57.0f);
        }
        return i - L2;
    }

    public int getMediaOffsetY() {
        yc2 yc2Var = this.ub;
        if (yc2Var.a2) {
            return gm.U1(yc2Var.L1, yc2Var.Z1, this.X1);
        }
        return this.X1;
    }

    @Override
    public k47 getMessageObject() {
        k47 k47Var = this.R5;
        if (k47Var != null) {
            return k47Var;
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
            i = i2 - gm.L(32.0f);
        } else {
            i = this.i9;
        }
        return (int) (f + i + gm.L(2.0f) + (gm.L(20.0f) / 2));
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
        k47 k47Var = this.Q5;
        if (k47Var == null) {
            k47Var = this.R5;
        }
        if (k47Var != null && k47Var.t1 && (i = this.L0) > 0) {
            return i;
        }
        return gm.q.x;
    }

    public float getPhotoBottom() {
        if (g4()) {
            float f = this.oc;
            if (f > 0.0f) {
                return f;
            }
            return this.e7 - gm.L(5.0f);
        }
        dd5 dd5Var = this.X5;
        if (dd5Var != null) {
            return dd5Var.e + dd5Var.h;
        }
        return this.U0.x();
    }

    public ImageReceiver getPhotoImage() {
        return this.U0;
    }

    public ArrayList<qc2> getPollButtons() {
        return this.Q4;
    }

    public float getPollButtonsLeft() {
        if (getMessageObject() != null && getMessageObject().O3()) {
            return (gm.L(3.0f) + this.d7) - this.b7;
        }
        if (this.Y6) {
            return gm.L(82.0f);
        }
        if (b3()) {
            return gm.L(59.0f);
        }
        return gm.L(11.0f);
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.b7) - gm.L(15.0f);
    }

    public k47 getPrimaryMessageObject() {
        k47 k47Var;
        k47 k47Var2 = this.Q5;
        if (k47Var2 != null && this.L != null && k47Var2.z2()) {
            k47Var = this.L.c();
        } else {
            k47Var = null;
        }
        if (k47Var != null) {
            return k47Var;
        }
        return this.Q5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.Q0;
    }

    public l39 getReactionsLayout() {
        return this.O;
    }

    public int getRepliesCount() {
        f47 f47Var = this.L;
        if (f47Var != null && !f47Var.d.isEmpty()) {
            return ((k47) this.L.d.get(0)).M1();
        }
        return this.Q5.M1();
    }

    public ylb getResourcesProvider() {
        return this.cc;
    }

    public RectF getScrimBlockBounds() {
        return this.yd;
    }

    public gx9 getSeekBarWaveform() {
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
        f47 f47Var = this.L;
        if (f47Var != null) {
            ArrayList arrayList = f47Var.d;
            int size = arrayList.size();
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                k47 k47Var = (k47) obj;
                if (k47Var != null && (message2 = k47Var.k) != null) {
                    j = message2.paid_message_stars;
                } else {
                    j = 0;
                }
                j2 += j;
            }
            return j2;
        }
        k47 k47Var2 = this.Q5;
        if (k47Var2 == null || (message = k47Var2.k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        yc2 yc2Var = this.ub;
        if (yc2Var.z1) {
            return gm.U1(yc2Var.L1, yc2Var.y1, this.W);
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
        yc2 yc2Var = this.ub;
        if (yc2Var.i1) {
            i = gm.U1(yc2Var.L1, yc2Var.h1, this.O9);
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
                i2 = v2() ? getCommentButtonHeight() : gm.L(41.3f);
            }
        } else if (this.Q5.q4()) {
            i = -gm.L(48.0f);
            if (this.c7) {
                i -= gm.L(4.0f);
            }
            return d2(i);
        } else if (this.x7) {
            i2 = v2() ? getCommentButtonHeight() : gm.L(43.0f);
        }
        i = -i2;
        return d2(i);
    }

    public int getTopMediaOffset() {
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.D == 14) {
            return this.X1 + this.gb;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        yc2 yc2Var = this.ub;
        if (yc2Var.v1) {
            return gm.U1(yc2Var.L1, yc2Var.u1, this.g0);
        }
        return this.g0;
    }

    public yc2 getTransitionParams() {
        return this.ub;
    }

    public float getVideoTranscriptionProgress() {
        k47 k47Var;
        yc2 yc2Var = this.ub;
        if (yc2Var != null && (k47Var = this.Q5) != null && k47Var.g4()) {
            boolean z = yc2Var.m1;
            boolean z2 = this.I6;
            if (z) {
                float f = yc2Var.L1;
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
        yc2 yc2Var = this.ub;
        if (yc2Var.O1) {
            return gm.U1(yc2Var.L1, yc2Var.P1, this.K5);
        }
        return this.K5;
    }

    @Override
    public final void h(float f) {
        k47 k47Var = this.Q5;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        k47Var.i0 = (int) (k47Var.L0() * f);
        W3();
    }

    public final boolean h0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.h0(android.view.MotionEvent):boolean");
    }

    public final void h1(android.graphics.Canvas r63, float r64) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        tc2 tc2Var = this.s0;
        if (tc2Var != null && tc2Var.b) {
            return true;
        }
        return false;
    }

    public final void h3() {
        sc2 sc2Var = this.w2;
        if (sc2Var != null) {
            sc2Var.h = false;
        }
        u51 u51Var = this.Sa;
        if (u51Var != null) {
            u51Var.c(false);
        }
        Drawable drawable = this.J2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        sc2 sc2Var2 = this.w2;
        if (sc2Var2 != null && sc2Var2.g != null) {
            for (int i = 0; i < this.w2.g.size(); i++) {
                oc2 oc2Var = (oc2) this.w2.g.get(i);
                u51 u51Var2 = oc2Var.f;
                if (u51Var2 != null) {
                    u51Var2.c(false);
                }
                fg0 fg0Var = oc2Var.g;
                if (fg0Var != null) {
                    fg0Var.setState(StateSet.NOTHING);
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
        y0(j, j2);
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

    public final boolean i0(MotionEvent motionEvent) {
        hkb p2;
        boolean z;
        boolean z2;
        int L;
        int i;
        tc2 tc2Var;
        int L2;
        int extraTextX;
        int i2;
        f47 f47Var;
        mc2 mc2Var = this.eb;
        if (mc2Var != null && (p2 = mc2Var.p2()) != null && (p2.a() || p2.d())) {
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            uj9 uj9Var = this.Q5.y2;
            if (uj9Var != null && !uj9Var.n.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || f2() || z2) && ((this.k1 || this.L != null) && (this.L == null || this.eb.K()))) {
                if (this.Q5.z2() && (f47Var = this.L) != null && !f47Var.i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt instanceof rc2) {
                                rc2 rc2Var = (rc2) childAt;
                                f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
                                c47 currentPosition = rc2Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.a == this.L.a && (currentPosition.l & C()) != 0 && (currentPosition.l & 1) != 0) {
                                    p2.c = (int) rc2Var.s3;
                                    p2.d = (int) rc2Var.t3;
                                    p2.a0(rc2Var);
                                    if (rc2Var == this) {
                                        return p2.L(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - rc2Var.getLeft(), getTop() - rc2Var.getTop());
                                    boolean L3 = p2.L(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - rc2Var.getLeft()), -(getTop() - rc2Var.getTop()));
                                    return L3;
                                }
                            }
                        }
                    }
                } else {
                    k47 k47Var = this.Q5;
                    if (k47Var != null && !k47Var.t1 && (tc2Var = this.s0) != null && tc2Var.g != null && P1(motionEvent) >= this.r0) {
                        p2.r0 = false;
                        p2.t0 = true;
                        p2.v0 = false;
                        f47 f47Var2 = this.L;
                        if (f47Var2 != null && !f47Var2.i) {
                            i2 = (int) this.s3;
                        } else {
                            float f = 12.0f;
                            if (this.Q5.O3()) {
                                int extraTextX2 = getExtraTextX() + gm.L(12.0f) + this.N6;
                                if (this.Q5.D == 19) {
                                    i2 = extraTextX2 - Math.max(0, (gm.L(14.0f) + (Math.max(this.X7, this.Z7) + extraTextX2)) - gm.q.x);
                                } else {
                                    i2 = extraTextX2;
                                }
                            } else {
                                boolean z3 = this.C6;
                                int i4 = this.N6;
                                if (z3) {
                                    L2 = gm.L(12.0f) + i4;
                                    extraTextX = getExtraTextX();
                                } else {
                                    if (!this.K) {
                                        f = 18.0f;
                                    }
                                    L2 = gm.L(f) + i4;
                                    extraTextX = getExtraTextX();
                                }
                                i2 = L2 + extraTextX;
                            }
                        }
                        int L4 = ((int) (i2 + this.ub.h0)) - gm.L(1.33f);
                        int i5 = this.r0;
                        p2.c = (gm.L(10.0f) + L4) - this.s0.o;
                        p2.d = gm.L(22.0f) + i5;
                    } else {
                        if (z2 && R2()) {
                            if (P1(motionEvent) < this.Q5.y2.t() + this.u0) {
                                p2.r0 = false;
                                p2.t0 = false;
                                p2.v0 = true;
                                int i6 = this.o0;
                                int i7 = this.u0;
                                p2.c = i6;
                                p2.d = i7;
                            }
                        }
                        if (f2()) {
                            p2.r0 = false;
                            p2.t0 = false;
                            p2.v0 = false;
                            p2.c = (int) this.s3;
                            p2.d = (int) this.t3;
                        } else {
                            k47 k47Var2 = this.Q5;
                            if (k47Var2 != null && !k47Var2.t1 && this.p2 != null && (!this.v1 ? P1(motionEvent) > this.Y1 : P1(motionEvent) < this.u0)) {
                                p2.r0 = true;
                                p2.t0 = false;
                                p2.v0 = false;
                                if (this.T1) {
                                    i = this.p0 - gm.L(10.0f);
                                } else {
                                    boolean z4 = this.U1;
                                    int i8 = this.p0;
                                    if (z4) {
                                        L = gm.L(1.0f);
                                    } else {
                                        L = gm.L(1.0f);
                                    }
                                    i = L + i8;
                                }
                                int L5 = gm.L(10.0f) + i + this.a2;
                                int i9 = this.Y1;
                                p2.c = L5;
                                p2.d = i9;
                            } else if (z2) {
                                p2.r0 = false;
                                p2.t0 = false;
                                p2.v0 = true;
                                int i10 = this.o0;
                                int i11 = this.u0;
                                p2.c = i10;
                                p2.d = i11;
                            } else {
                                p2.r0 = false;
                                p2.t0 = false;
                                p2.v0 = false;
                                int i12 = this.o0;
                                int i13 = this.u0;
                                p2.c = i12;
                                p2.d = i13;
                            }
                        }
                    }
                    p2.a0(this);
                    return p2.L(motionEvent);
                }
            }
        }
        return false;
    }

    public final void i1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.i1(android.graphics.Canvas):void");
    }

    public final boolean i2() {
        ylb ylbVar = this.cc;
        if (ylbVar != null) {
            return ylbVar.g();
        }
        return cmb.b1();
    }

    public final void i3(int i) {
        i66 i66Var;
        i66 i66Var2 = this.u4;
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            for (int i2 = 0; i2 < i66Var2.a; i2++) {
                if (((Pair) ((ArrayList) i66Var2.e).get(i2)).second == valueOf) {
                    i66Var2.k(i2);
                }
            }
        } else {
            i66Var2.e(true);
        }
        tc2 tc2Var = this.s0;
        if (tc2Var != null && (i66Var = tc2Var.i) != null) {
            i66Var.e(true);
        }
        this.q4 = null;
        tc2 tc2Var2 = this.s0;
        if (tc2Var2 != null) {
            tc2Var2.j = null;
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
        mc2 mc2Var;
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
            if (this.ic && (mc2Var = this.eb) != null) {
                mc2Var.c();
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
        f47 f47Var = this.L;
        if (f47Var != null && f47Var.i) {
            c47 c47Var = this.M;
            if (c47Var != null && (c47Var.l & 4) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean j0(MotionEvent motionEvent) {
        if (this.Q5.q4() && this.Q5.b1) {
            int x = (int) motionEvent.getX();
            int P1 = (int) P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f = x;
                if (f >= this.k2 - gm.L(6.0f) && f <= this.k2 + this.i2 + gm.L(6.0f)) {
                    float f2 = P1;
                    if (f2 >= this.l2 - gm.L(2.0f) && f2 <= this.l2 + this.j2 + gm.L(2.0f)) {
                        u51 u51Var = this.n2;
                        if (u51Var != null) {
                            u51Var.c(true);
                        }
                        this.m2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.m2) {
                mc2 mc2Var = this.eb;
                if (mc2Var != null) {
                    mc2Var.C1();
                }
                u51 u51Var2 = this.n2;
                if (u51Var2 != null) {
                    u51Var2.c(false);
                }
                playSoundEffect(0);
                this.m2 = false;
            }
        }
        return false;
    }

    public void j1(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.j1(android.graphics.Canvas):void");
    }

    public final boolean j2() {
        k47 k47Var = this.Q5;
        if ((k47Var != null && k47Var.s2()) || this.M5) {
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
        bc2 bc2Var;
        fg0 fg0Var;
        if (this.I4 && ((!this.Lb || getVideoTranscriptionProgress() > 0.0f || this.T2) && (bc2Var = this.J4) != null)) {
            int action = motionEvent.getAction();
            float x = motionEvent.getX();
            float P1 = P1(motionEvent);
            if (action != 1 && action != 3) {
                if (bc2Var.v.contains((int) x, (int) P1)) {
                    if (action == 0) {
                        bc2Var.A = true;
                    }
                    if (bc2Var.A && (fg0Var = bc2Var.q) != null) {
                        fg0Var.setHotspot(x, P1);
                        bc2Var.q.setState(v0c.N);
                        bc2Var.r.invalidate();
                    }
                    return true;
                }
            } else if (bc2Var.A && action == 1) {
                bc2Var.p();
                return true;
            } else {
                bc2Var.A = false;
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
        mm mmVar = this.U0;
        float alpha = mmVar.getAlpha();
        if (this.Q5.f4()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        mmVar.setAlpha(f * alpha);
        mmVar.h(canvas, null);
        mmVar.setAlpha(alpha);
        canvas.restore();
        Paint c2 = c2("paintChatTimeBackground");
        int alpha2 = c2.getAlpha();
        c2.setAlpha((int) (alpha2 * this.l4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, c2);
        c2.setAlpha(alpha2);
    }

    public final boolean k2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.k2():boolean");
    }

    public final void k3() {
        CharSequence charSequence;
        long j;
        long j2;
        long j3;
        long j4;
        dc2 dc2Var = this.kc;
        qa4 qa4Var = this.x;
        qa4Var.a(dc2Var);
        dc2 dc2Var2 = this.lc;
        qa4Var.a(dc2Var2);
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            boolean isEmpty = TextUtils.isEmpty(k47Var.z);
            k47 k47Var2 = this.Q5;
            if (!isEmpty) {
                charSequence = k47Var2.z;
            } else {
                charSequence = k47Var2.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i = jo4.e;
                int i2 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    jo4[] jo4VarArr = (jo4[]) spanned.getSpans(0, spanned.length(), jo4.class);
                    for (jo4 jo4Var : jo4VarArr) {
                        if (jo4Var.b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(jo4VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(jo4Var.b.date));
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
                        qa4Var.a(dc2Var2);
                        a18 a18Var = new a18(qa4Var, dc2Var2, (byte) 19);
                        qa4Var.a.put(dc2Var2, a18Var);
                        if (j8 > 0) {
                            gm.d3(a18Var, j8);
                        } else {
                            gm.c3(a18Var);
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
        if (j == j2 && ((this.M != null || ((message = this.Q5.k) != null && message.paid_message_stars > 0)) && a6a.B(this.a6).I(this.Q5.e1()) && ((i = this.O3) == 1 || (i == 4 && this.M1 == 5)))) {
            this.S0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j3 = this.A1;
        if (j3 > 0 && Math.abs(j3 - j2) > 1048576) {
            this.A1 = j2;
        }
        y0(j, j2);
    }

    public final boolean l0() {
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.D == 17) {
            TLRPC.MessageMedia n1 = k47.n1(k47Var.k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) n1).results.has_unread_votes;
            }
        }
        return false;
    }

    public boolean l1(Canvas canvas) {
        kn m;
        int i;
        boolean z;
        k47 k47Var = this.Q5;
        mm mmVar = this.U0;
        if (k47Var != null && k47Var.D3() && (m = mmVar.m()) != null && (i = m.d[4]) > 0) {
            float l = 1.0f - Utilities.l(((i - 90) - m.o()) / 500.0f);
            if (l > 0.0f) {
                if (l < 1.0f) {
                    z = mmVar.h(canvas, null);
                } else {
                    z = true;
                }
                mmVar.U0 = true;
                float alpha = mmVar.getAlpha();
                mmVar.setAlpha(l * alpha);
                mmVar.h(canvas, null);
                mmVar.setAlpha(alpha);
                mmVar.U0 = false;
                return z;
            }
        }
        return mmVar.h(canvas, null);
    }

    public final boolean l2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.l2():boolean");
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

    public final boolean m0(float f, int i) {
        l39 l39Var = this.O;
        if (!l39Var.H) {
            return false;
        }
        float y = getY() + l39Var.c;
        if (y <= f || (y + l39Var.m) - gm.L(16.0f) >= i) {
            return false;
        }
        return true;
    }

    public final void m1(Canvas canvas) {
        if (this.B8 && this.A8 != null) {
            int saveCount = canvas.getSaveCount();
            try {
                n1(canvas);
            } catch (Throwable th) {
                fc4.g(th, true);
                canvas.restoreToCount(saveCount);
                this.B8 = false;
                long j = this.Q5.F0().id;
                jd8.b.remove(Long.valueOf(j));
                jd8.c.put(Long.valueOf(j), Boolean.TRUE);
                if (this.eb != null) {
                    gm.c3(new dc2(this, (byte) 8));
                }
            }
        }
    }

    public final boolean m2() {
        k47 k47Var = this.Q5;
        if (k47Var != null && k47Var.N5()) {
            c47 c47Var = this.M;
            if (c47Var != null) {
                int i = c47Var.l;
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
        f47 f47Var;
        f47 f47Var2;
        k47 k47Var;
        if (!z2 || (k47Var = this.Q5) == null || !k47Var.a0) {
            if (z) {
                this.o3 = null;
                CheckBoxBase checkBoxBase = this.m1;
                ylb ylbVar = this.cc;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, ylbVar, this);
                    this.m1 = checkBoxBase2;
                    if (this.O0) {
                        checkBoxBase2.l = true;
                    }
                } else if (checkBoxBase.F != ylbVar) {
                    checkBoxBase.F = ylbVar;
                    checkBoxBase.b();
                }
            }
            if (z && (((f47Var = this.L) != null && f47Var.d.size() > 1) || ((f47Var2 = this.S5) != null && f47Var2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.l1;
                ylb ylbVar2 = this.cc;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, ylbVar2, this);
                    this.l1 = checkBoxBase4;
                    if (!checkBoxBase4.y) {
                        checkBoxBase4.y = true;
                        checkBoxBase4.b();
                    }
                    if (this.O0) {
                        this.l1.l = true;
                    }
                } else if (checkBoxBase3.F != ylbVar2) {
                    checkBoxBase3.F = ylbVar2;
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
        f47 f47Var = this.L;
        if (f47Var != null && f47Var.i) {
            c47 c47Var = this.M;
            if (c47Var != null && (c47Var.l & 8) != 0) {
                return this.G;
            }
            return true;
        }
        return this.G;
    }

    public final boolean n0() {
        qd4 qd4Var;
        bc4 G = bc4.G(this.a6);
        String filename = getFilename();
        if (filename == null || (qd4Var = (qd4) G.h.get(filename)) == null || !qd4Var.T) {
            return false;
        }
        qd4Var.T = false;
        return true;
    }

    public final void n1(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.n1(android.graphics.Canvas):void");
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

    public final void o0(Bitmap bitmap, boolean z) {
        boolean K4 = k47.K4(this.Q5.k);
        mm mmVar = this.U0;
        if (K4) {
            if (MediaController.w().D(this.Q5)) {
                mmVar.u0 = false;
                mmVar.x0();
                return;
            }
            mmVar.u0 = true;
            mmVar.w0(false);
            return;
        }
        if (z) {
            k47 k47Var = MediaController.w().v0;
            if (k47Var != null && k47Var.g4()) {
                z = false;
            } else {
                z = true;
            }
        }
        mmVar.u0 = z;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            mmVar.Z = null;
            mmVar.b0 = null;
            mmVar.c0 = null;
            mmVar.d0 = null;
            mmVar.a1.setShader(null);
            mmVar.u0(bitmapDrawable);
            mmVar.n1 = true;
            mmVar.i1 = 0.0f;
            mmVar.y0(mmVar.n0);
        }
        if (z) {
            mmVar.w0(false);
        } else {
            mmVar.x0();
        }
    }

    public final void o1(Canvas canvas, int i) {
        int i2;
        i47 i47Var;
        k47 k47Var;
        mc2 mc2Var = this.eb;
        int i3 = 0;
        if (mc2Var != null) {
            if (!mc2Var.n1(this, 1)) {
                this.A4 = null;
                ArrayList arrayList = this.z4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i4 = 0; i4 < this.z4.size(); i4++) {
                        pc2 pc2Var = (pc2) this.z4.get(i4);
                        if (!pc2Var.a.d()) {
                            pc2Var.a.a();
                        }
                    }
                }
            } else {
                CharacterStyle a0 = this.eb.a0(this);
                if (a0 != this.A4) {
                    this.A4 = a0;
                    qa6 qa6Var = this.y4;
                    if (qa6Var != null) {
                        qa6Var.a();
                        this.y4 = null;
                    }
                    qa6 qa6Var2 = new qa6();
                    this.y4 = qa6Var2;
                    qa6Var2.D = true;
                    b66 b66Var = new b66(0);
                    qa6 qa6Var3 = this.y4;
                    qa6Var3.y = b66Var;
                    qa6Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.a = this.y4;
                    obj.b = -3;
                    ArrayList arrayList2 = this.z4;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.z4 = arrayList2;
                    }
                    arrayList2.add(obj);
                    if (this.A4 != null && !H1(obj, b66Var, this.p2, -2) && (((i47Var = this.m3) == null || !I1(obj, b66Var, i47Var.e)) && (k47Var = this.Q5) != null)) {
                        I1(obj, b66Var, k47Var.B2);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.z4;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            k47 k47Var2 = this.Q5;
            if (k47Var2 != null && k47Var2.O3()) {
                i2 = cmb.Cc;
            } else {
                i2 = cmb.Be;
            }
            int v0 = cmb.v0(i2, this.cc);
            while (i3 < this.z4.size()) {
                pc2 pc2Var2 = (pc2) this.z4.get(i3);
                if (pc2Var2.b == i) {
                    qa6 qa6Var4 = pc2Var2.a;
                    qa6Var4.g(cmb.p1(0.85f, v0), cmb.p1(2.0f, v0), cmb.p1(3.5f, v0), cmb.p1(6.0f, v0));
                    qa6Var4.draw(canvas);
                    invalidate();
                    if (qa6Var4.c()) {
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
        i47 i47Var = this.m3;
        if (i47Var != null && (arrayList = i47Var.e) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((h47) obj).y.isEmpty()) {
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
                if (!((h47) obj2).y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o3(boolean z, boolean z2, boolean z3) {
        k47 k47Var;
        if (z || !z3 || (k47Var = this.Q5) == null || !k47Var.a0) {
            CheckBoxBase checkBoxBase = this.m1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z2, z3);
            }
            CheckBoxBase checkBoxBase2 = this.l1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z, z3);
            }
            f37 f37Var = this.fb;
            float f = 0.0f;
            if (f37Var.e == z2) {
                if (f37Var.f != z3 && !z3) {
                    if (z2) {
                        f = 1.0f;
                    }
                    f37Var.d = f;
                    f37Var.f = false;
                    return;
                }
                return;
            }
            f37Var.e = z2;
            f37Var.f = z3;
            if (z3) {
                f37Var.c = SystemClock.elapsedRealtime();
            } else {
                if (z2) {
                    f = 1.0f;
                }
                f37Var.d = f;
            }
            f37Var.a();
            rc2 rc2Var = f37Var.m;
            if (rc2Var != null) {
                rc2Var.invalidate();
                if (rc2Var.getParent() != null) {
                    ((ViewGroup) rc2Var.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        rc2 rc2Var;
        float f;
        float f2;
        ag8 ag8Var;
        ag8 ag8Var2;
        gd0 gd0Var;
        super.onAttachedToWindow();
        e7a e7aVar = this.Jc;
        if (e7aVar != null) {
            e7aVar.a();
            this.Jc = null;
        }
        e7a e7aVar2 = new e7a(nm7.f(this.a6), this);
        e7aVar2.b(nm7.E0);
        e7aVar2.e(nm7.m1);
        e7aVar2.e(nm7.l1);
        e7aVar2.e(nm7.m4);
        e7aVar2.e(nm7.Y2);
        this.Jc = e7aVar2;
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            k47Var.k1 = false;
            uj9 uj9Var = k47Var.y2;
            if (uj9Var != null) {
                uj9Var.b(this);
            }
        }
        uj9 uj9Var2 = this.ub.M0;
        if (uj9Var2 != null) {
            uj9Var2.b(this);
        }
        wc2 wc2Var = this.i3;
        if (wc2Var != null && (gd0Var = wc2Var.b) != null) {
            gd0Var.e();
        }
        xc2 xc2Var = this.x2;
        if (xc2Var != null && (ag8Var2 = xc2Var.m) != null) {
            ag8Var2.a();
        }
        xc2 xc2Var2 = this.x2;
        if (xc2Var2 != null && (ag8Var = xc2Var2.n) != null) {
            ag8Var.a();
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qc2) obj).a();
        }
        k47 k47Var2 = this.R5;
        if (k47Var2 != null) {
            k47Var2.k1 = false;
            rc2Var = this;
            rc2Var.y3(k47Var2, this.S5, this.U5, this.T5, this.V5, this.W5);
            rc2Var.R5 = null;
            rc2Var.S5 = null;
        } else {
            rc2Var = this;
        }
        CheckBoxBase checkBoxBase = rc2Var.m1;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        CheckBoxBase checkBoxBase2 = rc2Var.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.l = true;
        }
        bwb bwbVar = rc2Var.f0;
        if (bwbVar != null) {
            bwbVar.a();
        }
        CheckBoxBase checkBoxBase3 = rc2Var.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.l = true;
        }
        if (rc2Var.f7 != null) {
            int i2 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = rc2Var.f7;
                if (i2 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i2].l = true;
                i2++;
            }
        }
        rc2Var.O0 = true;
        float f3 = 0.0f;
        rc2Var.wd = 0.0f;
        rc2Var.vd = 0.0f;
        rc2Var.r1 = 0;
        rc2Var.d4();
        ImageReceiver imageReceiver = rc2Var.A7;
        imageReceiver.p0((View) rc2Var.getParent());
        imageReceiver.I();
        nc2 nc2Var = rc2Var.tc;
        if (nc2Var != null) {
            nc2Var.b.I();
        }
        nc2 nc2Var2 = rc2Var.uc;
        if (nc2Var2 != null) {
            nc2Var2.b.I();
        }
        rc2Var.O();
        k47 k47Var3 = rc2Var.Q5;
        if (k47Var3 != null) {
            rc2Var.setAvatar(k47Var3);
        }
        byte b = rc2Var.M1;
        if (b == 4 && rc2Var.H5) {
            boolean D = MediaController.w().D(rc2Var.Q5);
            rc2Var.F1 = D;
            if (D) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            rc2Var.H1 = f2;
            rc2Var.G1 = (byte) 0;
        } else {
            rc2Var.F1 = false;
            rc2Var.H1 = 0.0f;
            if ((b == 4 || b == 2) && rc2Var.B1) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            rc2Var.E1 = f;
        }
        if (rc2Var.getDelegate() != null && rc2Var.getDelegate().p2() != null) {
            hkb p2 = rc2Var.getDelegate().p2();
            p2.getClass();
            if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().e1() == p2.w) {
                p2.W = rc2Var;
            }
        }
        if (rc2Var.M1 == 5) {
            boolean D2 = MediaController.w().D(rc2Var.Q5);
            cc2 F1 = rc2Var.F1();
            if (D2) {
                f3 = 1.0f;
            }
            F1.h = f3;
        }
        l39 l39Var = rc2Var.O;
        ArrayList arrayList2 = l39Var.s;
        l39Var.D = true;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((i39) arrayList2.get(i3)).a();
        }
        s34 s34Var = rc2Var.zb;
        if (s34Var != null) {
            s34Var.a();
        }
        dd5 dd5Var = rc2Var.X5;
        if (dd5Var != null) {
            ArrayList arrayList3 = dd5Var.c;
            if (!dd5Var.C) {
                dd5Var.C = true;
                qna qnaVar = dd5Var.l;
                if (qnaVar != null) {
                    qnaVar.b(dd5Var.a);
                }
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    cd5 cd5Var = (cd5) arrayList3.get(i4);
                    if (!cd5Var.N) {
                        cd5Var.N = true;
                        cd5Var.f.I();
                    }
                }
            }
        }
        rc2Var.U3();
        k47 k47Var4 = rc2Var.Q5;
        if (k47Var4 != null && k47Var4.D == 20 && rc2Var.ja != null) {
            rc2Var.invalidate();
        }
        tm tmVar = rc2Var.Ca;
        if (tmVar != null) {
            tmVar.a();
        }
        tm tmVar2 = rc2Var.Da;
        if (tmVar2 != null) {
            tmVar2.a();
        }
        qna qnaVar2 = rc2Var.ca;
        if (qnaVar2 != null) {
            if (qnaVar2.i) {
                qna Y2 = rc2Var.Y2();
                rc2Var.ca = Y2;
                Integer num = rc2Var.da;
                if (num != null) {
                    Y2.k.put(rc2Var, num);
                }
            } else {
                qnaVar2.a(rc2Var);
            }
        }
        lk1 lk1Var = rc2Var.w;
        if (lk1Var != null) {
            ArrayList arrayList4 = lk1Var.p;
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((kk1) arrayList4.get(i5)).a();
            }
        }
        u1b u1bVar = rc2Var.f1;
        if (u1bVar != null) {
            for (int i6 = 0; i6 < u1bVar.b; i6++) {
                u1bVar.c[i6].b(rc2Var);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        vc2 vc2Var;
        gd0 gd0Var;
        ry2 ry2Var;
        ag8 ag8Var;
        ag8 ag8Var2;
        super.onDetachedFromWindow();
        e7a e7aVar = this.Jc;
        if (e7aVar != null) {
            e7aVar.a();
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
        xc2 xc2Var = this.x2;
        if (xc2Var != null && (ag8Var2 = xc2Var.m) != null) {
            ag8Var2.b.K();
            ag8Var2.y.f();
        }
        xc2 xc2Var2 = this.x2;
        if (xc2Var2 != null && (ag8Var = xc2Var2.n) != null) {
            ag8Var.b.K();
            ag8Var.y.f();
        }
        xc2 xc2Var3 = this.x2;
        if (xc2Var3 != null && (ry2Var = xc2Var3.j) != null) {
            ry2Var.b();
            this.x2.j = null;
        }
        uj9 uj9Var = this.Q5.y2;
        if (uj9Var != null) {
            uj9Var.f(this);
        }
        yc2 yc2Var = this.ub;
        uj9 uj9Var2 = yc2Var.M0;
        if (uj9Var2 != null) {
            uj9Var2.f(this);
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qc2) obj).b();
        }
        wc2 wc2Var = this.i3;
        if (wc2Var != null && (gd0Var = wc2Var.b) != null) {
            gd0Var.f();
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
        dd5 dd5Var = this.X5;
        if (dd5Var != null) {
            dd5Var.e();
        }
        this.A7.K();
        nc2 nc2Var = this.tc;
        if (nc2Var != null) {
            nc2Var.b.K();
        }
        nc2 nc2Var2 = this.uc;
        if (nc2Var2 != null) {
            nc2Var2.b.K();
        }
        bwb bwbVar = this.f0;
        if (bwbVar != null) {
            bwbVar.b();
        }
        O();
        if (this.G3 && (vc2Var = this.t0) != null && vc2Var.d != null && vc2Var.e != null) {
            fn5 z = fn5.z();
            String str = this.t0.d;
            if (str != null) {
                z.A.remove(str);
            }
            this.G3 = false;
        }
        u1b u1bVar = this.f1;
        if (u1bVar != null) {
            u1bVar.a(this);
        }
        er3.q(this.a6).v(this);
        if (getDelegate() != null && getDelegate().p2() != null) {
            hkb p2 = getDelegate().p2();
            p2.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == p2.w) {
                p2.W = null;
            }
        }
        yc2Var.w0 = false;
        if (MediaController.w().D(this.Q5)) {
            n50 n50Var = cmb.c5;
            if (n50Var == null) {
                n50Var = new n50();
                cmb.c5 = n50Var;
            }
            n50Var.i = null;
        }
        ValueAnimator valueAnimator = this.Gb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Gb.cancel();
        }
        this.O.p();
        this.Fb = false;
        s34 s34Var = this.zb;
        if (s34Var != null) {
            s34Var.g();
        }
        tm tmVar = this.Ca;
        if (tmVar != null) {
            tmVar.b();
        }
        tm tmVar2 = this.Da;
        if (tmVar2 != null) {
            tmVar2.b();
        }
        qna qnaVar = this.ca;
        if (qnaVar != null) {
            qnaVar.b(this);
        }
        lk1 lk1Var = this.w;
        if (lk1Var != null) {
            ArrayList arrayList2 = lk1Var.p;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                kk1 kk1Var = (kk1) arrayList2.get(i3);
                int i4 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = kk1Var.c;
                    if (i4 < imageReceiverArr.length) {
                        imageReceiverArr[i4].K();
                        i4++;
                    }
                }
            }
        }
        fi2.d().g(this.Oc);
    }

    @Override
    public void onDraw(Canvas canvas) {
        d1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        al9 f4 = f4();
        int i = 0;
        if (f4 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.i0 + this.u0;
            motionEvent.offsetLocation(-this.o0, -topicSeparatorTopPadding);
            Rect rect = f4.b;
            if (f4.e0 != null && f4.f0) {
                motionEvent.offsetLocation((-rect.left) + f4.k0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < f4.t0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < f4.j0) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        rc2 rc2Var;
        int i3;
        k47 k47Var = this.Q5;
        boolean z = true;
        if (k47Var != null && (k47Var.I() || this.V3 != gm.q.y)) {
            this.C0 = true;
            k47 k47Var2 = this.Q5;
            this.Q5 = null;
            rc2Var = this;
            rc2Var.z3(k47Var2, this.L, this.G, this.F, this.H, false);
            rc2Var.C0 = false;
        } else {
            rc2Var = this;
        }
        rc2Var.b4();
        int i4 = rc2Var.W + rc2Var.g0 + rc2Var.i0 + rc2Var.v0 + rc2Var.x0 + rc2Var.e0;
        hw1 draftMessageMeasureController = rc2Var.getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(rc2Var.Q5)) {
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
        rc2Var.Rc = Math.max(0, i3 - i4);
        rc2Var.setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.K6) {
            k47 k47Var = this.Q5;
            if (k47Var != null && (charSequence2 = k47Var.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.Q5.v);
                return;
            }
            k47 k47Var2 = this.Q5;
            if (k47Var2 != null && (charSequence = k47Var2.z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.Q5.z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void p() {
        mc2 mc2Var;
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
            if (this.ic && (mc2Var = this.eb) != null) {
                mc2Var.c();
            }
        }
    }

    public final void p1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.p1(android.graphics.Canvas):void");
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
            h47 h47Var = (h47) arrayList.get(i4);
            if (i >= h47Var.n && i < h47Var.r) {
                this.A0 = i4;
                j3();
                try {
                    b66 c3 = c3();
                    c3.c = true;
                    c3.d(h47Var.e, i, 0.0f);
                    h47Var.e.getSelectionPath(i, i2, c3);
                    c3.a();
                    float f = h47Var.w + h47Var.h;
                    if (i2 >= h47Var.n + i3) {
                        for (int i5 = i4 + 1; i5 < arrayList.size(); i5++) {
                            h47 h47Var2 = (h47) arrayList.get(i5);
                            int i6 = h47Var2.r - h47Var2.n;
                            b66 c32 = c3();
                            c32.c = true;
                            float f2 = f + h47Var2.f;
                            c32.d(h47Var2.e, 0, f2);
                            f = f2 + h47Var2.w + h47Var2.h;
                            h47Var2.e.getSelectionPath(0, i2 - h47Var2.n, c32);
                            c32.a();
                            if (i2 < (h47Var.n + i6) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.B0) {
                        this.y6 = true;
                        this.z6 = 2500;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
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
        yb7 yb7Var;
        rc2 rc2Var;
        if (this.Q5.T2()) {
            Drawable t = this.U0.t();
            if (t instanceof o09) {
                final o09 o09Var = (o09) t;
                String C0 = this.Q5.C0();
                TLRPC.TL_messages_stickerSet o0 = hs6.d0(this.a6).o0(C0);
                if (o0 == null) {
                    hs6.d0(this.a6).d1(C0, true, true);
                    return false;
                }
                int D0 = this.Q5.D0();
                if ("🎰".equals(this.Q5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        sla slaVar = (sla) o09Var;
                        if (slaVar.V0 == null && !slaVar.W0) {
                            int i = D0 - 1;
                            int S = sla.S(i & 3);
                            int S2 = sla.S((i >> 2) & 3);
                            int S3 = sla.S(i >> 4);
                            if (S == 4 && S2 == 4 && S3 == 4) {
                                S = 5;
                                S3 = 5;
                                S2 = 5;
                            }
                            slaVar.c1 = S;
                            slaVar.d1 = S2;
                            slaVar.e1 = S3;
                            k47 messageObject = getMessageObject();
                            int i2 = getMessageObject().K1;
                            slaVar.W0 = true;
                            rc2Var = this;
                            Utilities.e.c(new m25(slaVar, o0, i2, messageObject, rc2Var, z, (byte) 4));
                        } else {
                            rc2Var = this;
                        }
                        if (rc2Var.Q5.N3()) {
                            o09Var.N(Integer.MAX_VALUE, rc2Var.Bb);
                        }
                        rc2Var.Q5.n1 = false;
                    } else {
                        rc2Var = this;
                    }
                    if (o09Var.n0 == null && !o09Var.Z0 && o0.documents.size() > 0) {
                        sla slaVar2 = (sla) o09Var;
                        if (slaVar2.n0 == null && !slaVar2.Z0) {
                            slaVar2.Z0 = true;
                            Utilities.e.c(new i77(slaVar2, o0, rc2Var.getMessageObject().K1, rc2Var.getMessageObject(), rc2Var, (byte) 25));
                            return true;
                        }
                    }
                } else {
                    if (o09Var.n0 == null && !o09Var.Z0 && o0.documents.size() > 0) {
                        TLRPC.Document document = o0.documents.get(0);
                        bc4.G(this.a6);
                        File J = bc4.J(document, null, true, true);
                        if (o09Var.n0 == null && !o09Var.Z0) {
                            final String v2 = gm.v2(J, 0);
                            if (TextUtils.isEmpty(v2)) {
                                er3.q(this.a6).a(bc4.r(null, document), this.Q5, this);
                                bc4.G(this.a6).X(document, o0, 1, 1);
                            } else {
                                o09Var.Z0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3 = 0;
                                        switch (r3) {
                                            case 0:
                                                final o09 o09Var2 = o09Var;
                                                String str = v2;
                                                if (o09Var2.X0) {
                                                    gm.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b = r2;
                                                            o09 o09Var3 = o09Var2;
                                                            switch (b) {
                                                                case 0:
                                                                    o09Var3.Z0 = false;
                                                                    if (!o09Var3.W0 && o09Var3.X0) {
                                                                        o09Var3.x(true);
                                                                        return;
                                                                    }
                                                                    o09Var3.g();
                                                                    o09Var3.D();
                                                                    o09Var3.s();
                                                                    return;
                                                                default:
                                                                    o09Var3.W0 = false;
                                                                    if (!o09Var3.Z0 && o09Var3.X0) {
                                                                        o09Var3.x(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                o09Var2.V0 = RLottieNative.b(str, null, null, null);
                                                if (o09Var2.V0 != null) {
                                                    i3 = o09Var2.V0.a[0];
                                                }
                                                if (o09Var2.V0 != null) {
                                                    int i4 = o09Var2.V0.a[1];
                                                }
                                                gm.c3(new ge7(o09Var2, i3, (byte) 11));
                                                return;
                                            default:
                                                final o09 o09Var3 = o09Var;
                                                o09Var3.n0 = RLottieNative.b(v2, o09Var3.e, null, null);
                                                gm.c3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        byte b = r2;
                                                        o09 o09Var32 = o09Var3;
                                                        switch (b) {
                                                            case 0:
                                                                o09Var32.Z0 = false;
                                                                if (!o09Var32.W0 && o09Var32.X0) {
                                                                    o09Var32.x(true);
                                                                    return;
                                                                }
                                                                o09Var32.g();
                                                                o09Var32.D();
                                                                o09Var32.s();
                                                                return;
                                                            default:
                                                                o09Var32.W0 = false;
                                                                if (!o09Var32.Z0 && o09Var32.X0) {
                                                                    o09Var32.x(true);
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
                        er3.q(this.a6).v(this);
                    }
                    if (D0 >= 0 && D0 < o0.documents.size()) {
                        if (!z && this.Q5.N3() && (yb7Var = (yb7) oc7.r1(this.a6).A3.get(C0)) != null && yb7Var.b == D0) {
                            o09Var.N(yb7Var.a, this.Bb);
                        }
                        TLRPC.Document document2 = o0.documents.get(Math.max(D0, 0));
                        bc4.G(this.a6);
                        File J2 = bc4.J(document2, null, true, true);
                        if (o09Var.V0 == null && !o09Var.W0) {
                            final String v22 = gm.v2(J2, 0);
                            if (TextUtils.isEmpty(v22)) {
                                er3.q(this.a6).a(bc4.r(null, document2), this.Q5, this);
                                bc4.G(this.a6).X(document2, o0, 1, 1);
                                this.Q5.n1 = false;
                            } else {
                                if (z && o09Var.R == null && o09Var.S == null && o09Var.Q == null) {
                                    o09Var.K = (byte) 2;
                                    o09Var.Y0 = true;
                                }
                                o09Var.W0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3 = 0;
                                        switch (r3) {
                                            case 0:
                                                final o09 o09Var2 = o09Var;
                                                String str = v22;
                                                if (o09Var2.X0) {
                                                    gm.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b = r2;
                                                            o09 o09Var32 = o09Var2;
                                                            switch (b) {
                                                                case 0:
                                                                    o09Var32.Z0 = false;
                                                                    if (!o09Var32.W0 && o09Var32.X0) {
                                                                        o09Var32.x(true);
                                                                        return;
                                                                    }
                                                                    o09Var32.g();
                                                                    o09Var32.D();
                                                                    o09Var32.s();
                                                                    return;
                                                                default:
                                                                    o09Var32.W0 = false;
                                                                    if (!o09Var32.Z0 && o09Var32.X0) {
                                                                        o09Var32.x(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                o09Var2.V0 = RLottieNative.b(str, null, null, null);
                                                if (o09Var2.V0 != null) {
                                                    i3 = o09Var2.V0.a[0];
                                                }
                                                if (o09Var2.V0 != null) {
                                                    int i4 = o09Var2.V0.a[1];
                                                }
                                                gm.c3(new ge7(o09Var2, i3, (byte) 11));
                                                return;
                                            default:
                                                final o09 o09Var3 = o09Var;
                                                o09Var3.n0 = RLottieNative.b(v22, o09Var3.e, null, null);
                                                gm.c3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        byte b = r2;
                                                        o09 o09Var32 = o09Var3;
                                                        switch (b) {
                                                            case 0:
                                                                o09Var32.Z0 = false;
                                                                if (!o09Var32.W0 && o09Var32.X0) {
                                                                    o09Var32.x(true);
                                                                    return;
                                                                }
                                                                o09Var32.g();
                                                                o09Var32.D();
                                                                o09Var32.s();
                                                                return;
                                                            default:
                                                                o09Var32.W0 = false;
                                                                if (!o09Var32.Z0 && o09Var32.X0) {
                                                                    o09Var32.x(true);
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
                        er3.q(this.a6).v(this);
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
        rc2 rc2Var;
        ArrayList arrayList;
        mc2 mc2Var = this.eb;
        int i2 = 0;
        if (mc2Var != null && mc2Var.m2(i)) {
            return false;
        }
        if (i == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                E0(false);
                return true;
            } else if (this.Q5.D == 16) {
                this.eb.d2(this, this.S3, this.T3);
                return true;
            } else {
                D0();
                return true;
            }
        }
        if (i == 2131296267) {
            F0();
        } else if (i == 2131296264) {
            mc2 mc2Var2 = this.eb;
            if (mc2Var2 != null) {
                if (this.Q5.D == 16) {
                    mc2Var2.u(this, 0.0f, 0.0f);
                } else {
                    mc2Var2.d2(this, this.S3, this.T3);
                }
            }
        } else {
            if (i == 2131296265) {
                mc2 mc2Var3 = this.eb;
                if (mc2Var3 != null) {
                    TLRPC.Chat chat = this.Ga;
                    if (chat != null) {
                        rc2Var = this;
                        mc2Var3.W1(rc2Var, chat, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                    } else {
                        rc2Var = this;
                        TLRPC.User user = rc2Var.Ea;
                        if (user != null) {
                            mc2Var3.W(rc2Var, user, rc2Var.h1, rc2Var.i1);
                        } else if (rc2Var.Ha != null) {
                            mc2Var3.Q0(rc2Var);
                        }
                    }
                }
            } else {
                rc2Var = this;
                if (i == 2131296270) {
                    mc2 mc2Var4 = rc2Var.eb;
                    if (mc2Var4 != null) {
                        mc2Var4.G(rc2Var);
                    }
                } else if (i == 2131296263 && rc2Var.eb != null && (arrayList = rc2Var.Q5.B2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        h47 h47Var = (h47) obj;
                        if (h47Var.O) {
                            rc2Var.eb.q1(h47Var);
                            break;
                        }
                    }
                }
            }
            if ((!k47.Q4(rc2Var.Q5.k) || rc2Var.Q5.g4() || (rc2Var.Q5.I3() && MediaController.w().D(rc2Var.Q5))) && rc2Var.F4.g(null, i, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        rc2Var = this;
        if (!k47.Q4(rc2Var.Q5.k)) {
        }
        return true;
    }

    @Override
    public final boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.q():boolean");
    }

    public final int q0(k47 k47Var, f47 f47Var, boolean z) {
        f47 f47Var2 = f47Var;
        mm mmVar = this.U0;
        mmVar.p0 = true;
        ImageReceiver imageReceiver = this.A7;
        imageReceiver.p0 = true;
        ImageReceiver imageReceiver2 = this.T7;
        imageReceiver2.p0 = true;
        ImageReceiver imageReceiver3 = this.F7;
        imageReceiver3.p0 = true;
        int i = 0;
        if (f47Var2 != null) {
            ArrayList arrayList = f47Var2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != f47Var2.f.size()) {
                    f47Var2.a();
                }
                this.td = 0;
                int i2 = 0;
                while (i < arrayList.size()) {
                    k47 k47Var2 = (k47) arrayList.get(i);
                    c47 d = f47Var2.d(k47Var2);
                    if (d != null && (d.l & 1) != 0) {
                        y3(k47Var2, f47Var2, false, false, false, false);
                        if (z && !TextUtils.isEmpty(this.p3)) {
                            S3();
                            this.td = (int) (i2 + this.t3);
                            this.ud = this.m3;
                        }
                        i2 = this.v0 + this.x0 + i2;
                    }
                    i++;
                    f47Var2 = f47Var;
                }
                return i2;
            }
        }
        y3(k47Var, f47Var, false, false, false, false);
        mmVar.p0 = false;
        imageReceiver.p0 = false;
        imageReceiver2.p0 = false;
        imageReceiver3.p0 = false;
        S3();
        return this.v0 + this.x0;
    }

    public void q1(Canvas canvas, float f, Integer num) {
        boolean z;
        boolean z2 = this.Kb;
        float f2 = 1.0f;
        l39 l39Var = this.O;
        if (z2) {
            l39Var.a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.V4 && m2()) {
            if (l39Var.a > 0.0f) {
                x();
            }
            if (getAlpha() * f != 1.0f) {
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f * 255.0f), 31);
                z = true;
            } else {
                z = false;
            }
            int i = (l39Var.a > 0.0f ? 1 : (l39Var.a == 0.0f ? 0 : -1));
            yc2 yc2Var = this.ub;
            if (i <= 0 && yc2Var.x0 && this.M == null && !this.Kb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + yc2Var.j0);
                l39Var.A = 0.0f;
                l39Var.B = false;
                if (yc2Var.h) {
                    f2 = yc2Var.L1;
                }
                l39Var.d(canvas, f2, num);
                canvas.restore();
            } else {
                l39Var.A = 0.0f;
                l39Var.B = false;
                if (yc2Var.h) {
                    f2 = yc2Var.L1;
                }
                l39Var.d(canvas, f2, num);
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public final void q3(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            oi7 oi7Var = this.Mc;
            yc2 yc2Var = this.ub;
            if (oi7Var != null && oi7Var.h) {
                this.Uc = 0.0f;
            } else {
                float f = i2 + i4 + yc2Var.j0;
                this.Uc = f - ((int) f);
            }
            drawable.setBounds((int) (i + yc2Var.h0), (int) (i2 + yc2Var.k0), (int) (i + i3 + yc2Var.i0), (int) (i2 + i4 + yc2Var.j0));
            if (drawable == this.L6) {
                this.I8.set(drawable.getBounds());
            }
        }
    }

    public final void r0(rc2 rc2Var) {
        if (rc2Var == null) {
            return;
        }
        rc2Var.f6 = this.f6;
        rc2Var.s6 = this.s6;
        rc2Var.h6 = this.h6;
        rc2Var.i6 = this.i6;
        rc2Var.j6 = this.j6;
        rc2Var.k6 = this.k6;
        rc2Var.l6 = this.l6;
        rc2Var.m6 = this.m6;
        rc2Var.n6 = this.n6;
        rc2Var.o6 = this.o6;
        rc2Var.p6 = this.p6;
        rc2Var.q6 = this.q6;
        rc2Var.t6 = this.t6;
        rc2Var.u6 = this.u6;
        rc2Var.v6 = this.v6;
        rc2Var.W6 = this.W6;
        rc2Var.X6 = this.X6;
        rc2Var.Y6 = this.Y6;
        rc2Var.Z6 = this.Z6;
        rc2Var.a7 = this.a7;
    }

    public final boolean r1(Canvas canvas) {
        boolean z = this.Kb;
        float f = 1.0f;
        l39 l39Var = this.O;
        if (z) {
            l39Var.a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z2 = false;
        if (!this.V4 || !m2()) {
            return false;
        }
        if (l39Var.a > 0.0f) {
            x();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z2 = true;
        }
        int i = (l39Var.a > 0.0f ? 1 : (l39Var.a == 0.0f ? 0 : -1));
        yc2 yc2Var = this.ub;
        if (i <= 0 && yc2Var.x0 && this.M == null && !this.Kb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + yc2Var.j0);
            if (yc2Var.h) {
                f = yc2Var.L1;
            }
            l39Var.e(canvas, f);
            canvas.restore();
        } else {
            if (yc2Var.h) {
                f = yc2Var.L1;
            }
            l39Var.e(canvas, f);
        }
        if (z2) {
            canvas.restore();
        }
        return true;
    }

    public final void r2() {
        mc2 mc2Var = this.eb;
        if (mc2Var != null && mc2Var.f()) {
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

    public final void s0(rc2 rc2Var) {
        qna qnaVar;
        if (rc2Var != null && (qnaVar = rc2Var.ca) != null) {
            int i = (Integer) qnaVar.k.get(rc2Var);
            if (i == null) {
                i = 0;
            }
            this.da = i;
            qna qnaVar2 = this.ca;
            if (qnaVar2 != null) {
                qnaVar2.k.put(this, i);
            }
        }
    }

    public final void s1(Canvas canvas, uj9 uj9Var, float f, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (uj9Var != null && f > 0.0f && uj9Var.B()) {
            if (f < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.o0, this.u0);
            uj9Var.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean s2() {
        if (this.u4.a <= 0 && this.O.p) {
            k47 k47Var = this.Q5;
            if (k47Var == null || !k47Var.t1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void s3(byte[] bArr) {
        k47 k47Var = this.R5;
        if (k47Var == null) {
            k47Var = this.Q5;
        }
        if (k47Var == null) {
            this.o3 = null;
            return;
        }
        a09 a09Var = this.o3;
        if (a09Var == null || !a09Var.f || !Arrays.equals(a09Var.g, bArr)) {
            this.o3 = new a09(this, k47Var.e1(), bArr);
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
        c47 c47Var = this.M;
        if ((c47Var != null && (c47Var.c != 0 || c47Var.a != 0)) || ((this.y && !k47.Q4(this.Q5.k)) || this.Q7 == null || this.R7 == null)) {
            c47 c47Var2 = this.M;
            if (c47Var2 != null) {
                int i = c47Var2.l;
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

    public void setAvatar(k47 k47Var) {
        if (k47Var != null) {
            if (!this.G6 && !g2()) {
                this.xa = null;
                return;
            }
            Drawable drawable = k47Var.m2;
            ImageReceiver imageReceiver = this.A7;
            if (drawable != null) {
                imageReceiver.g0(drawable);
                return;
            }
            TLRPC.User user = this.va;
            pc0 pc0Var = this.B7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.xa = userProfilePhoto.photo_small;
                } else {
                    this.xa = null;
                }
                pc0Var.q(user);
                imageReceiver.V(this.va, pc0Var, null, e86.e(360928), 1, false);
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
                if (chat.signature_profiles && k47.B0(k47Var.k) != 1271266957) {
                    long n = pg3.n(k47Var.k.from_id);
                    int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                    int i2 = k47Var.K1;
                    if (i >= 0) {
                        TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(n));
                        pc0Var.q(W1);
                        imageReceiver.U(W1, pc0Var, null);
                        return;
                    }
                    TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-n));
                    pc0Var.p(L0);
                    imageReceiver.U(L0, pc0Var, null);
                    return;
                }
                pc0Var.p(this.wa);
                imageReceiver.U(this.wa, pc0Var, null);
            } else if (k47Var.q4()) {
                TLRPC.Photo photo = k47Var.V0;
                if (photo != null) {
                    imageReceiver.d0(gn5.i(bc4.w(photo.sizes, gm.L(50.0f), false, null, true), k47Var.V0), "50_50", pc0Var, null, null, 0);
                }
            } else {
                this.xa = null;
                pc0Var.j(k47Var.Z0(), null, null, null);
                imageReceiver.d0(null, null, pc0Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(mc2 mc2Var) {
        this.eb = mc2Var;
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
        u51 u51Var = this.H2;
        if (u51Var == null) {
            u51Var = new u51(this);
            this.H2 = u51Var;
        }
        this.G2 = z;
        u51Var.c(z);
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

    public void setMessageObjectInternal(defpackage.k47 r64) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.setMessageObjectInternal(k47):void");
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

    public void setResourcesProvider(ylb ylbVar) {
        this.cc = ylbVar;
        RadialProgress2 radialProgress2 = this.Q0;
        if (radialProgress2 != null) {
            radialProgress2.F = ylbVar;
        }
        RadialProgress2 radialProgress22 = this.R0;
        if (radialProgress22 != null) {
            radialProgress22.F = ylbVar;
        }
        vm9 vm9Var = this.d3;
        if (vm9Var != null) {
            vm9Var.n = ylbVar;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.yd = rectF;
    }

    @Override
    public void setScrimHidden(boolean z) {
        td4.a(this, z);
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
            ((rna) arrayList.get(i)).invalidateSelf();
            i++;
        }
        i47 i47Var = this.m3;
        if (i47Var != null && i47Var.e != null) {
            for (int i2 = 0; i2 < this.m3.e.size(); i2++) {
                h47 h47Var = (h47) this.m3.e.get(i2);
                for (int i3 = 0; i3 < h47Var.y.size(); i3++) {
                    ((rna) h47Var.y.get(i3)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            for (int i4 = 0; i4 < getMessageObject().B2.size(); i4++) {
                h47 h47Var2 = (h47) getMessageObject().B2.get(i4);
                for (int i5 = 0; i5 < h47Var2.y.size(); i5++) {
                    ((rna) h47Var2.y.get(i5)).invalidateSelf();
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

    public final void t0(rc2 rc2Var) {
        rc2Var.D3(this.Cc, this.Ec, this.Fc, this.Gc, this.Hc, this.L0, this.M0, this.pb, this.qb, this.Dc);
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
            f = gm.L(4.0f);
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
            f2 = gm.H.getInterpolation(this.Nb);
        } else {
            f2 = this.Nb;
        }
        yc2 yc2Var = this.ub;
        if (yc2Var.l2) {
            boolean z3 = this.Lb;
            float f17 = yc2Var.L1;
            if (!z3) {
                f17 = 1.0f - f17;
            }
            f = gm.L(4.0f) * f17;
        }
        float L = (gm.L(16.0f) * f2) + f;
        int i2 = (this.Nb > 0.0f ? 1 : (this.Nb == 0.0f ? 0 : -1));
        mm mmVar = this.U0;
        if (i2 > 0) {
            float f18 = mmVar.N0 / 2.0f;
            wm9 wm9Var = cmb.tm;
            if (wm9Var == null) {
                wm9Var = new wm9((byte) 0, false);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, 0, on2.p(-16777216, 40)}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                wm9Var.b = radialGradient;
                Paint paint = new Paint();
                wm9Var.c = paint;
                wm9Var.d = new Matrix();
                paint.setShader(radialGradient);
                cmb.tm = wm9Var;
            }
            float r = mmVar.r();
            float s = mmVar.s();
            float f19 = this.Nb;
            Paint paint2 = (Paint) wm9Var.c;
            f5 = 255.0f;
            Matrix matrix = (Matrix) wm9Var.d;
            f3 = 2.0f;
            f4 = 0.10666667f;
            if (((int) r) + (((int) s) << 12) + (((int) f18) << 24) != 0) {
                matrix.reset();
                float f20 = f18 / 100.0f;
                matrix.setTranslate(r, s);
                matrix.preScale(f20, f20);
                ((RadialGradient) wm9Var.b).setLocalMatrix(matrix);
            }
            paint2.setAlpha((int) (f19 * 255.0f));
            canvas.drawCircle(r, s, f18, paint2);
        } else {
            f3 = 2.0f;
            f4 = 0.10666667f;
            f5 = 255.0f;
        }
        float N = gm.N(1.5f) + mmVar.L0 + L;
        float N2 = gm.N(1.5f) + mmVar.M0 + L;
        float w = (mmVar.w() - gm.N(1.5f)) - L;
        float x = (mmVar.x() - gm.N(1.5f)) - L;
        RectF rectF = this.c4;
        rectF.set(N, N2, w, x);
        if (this.Mb == 1.0f && (this.R1 || getVideoTranscriptionProgress() <= 0.0f)) {
            i = -1;
        } else {
            int alpha = cmb.j2.getAlpha();
            Paint paint3 = cmb.j2;
            float f21 = this.Mb;
            if (!this.R1) {
                f6 = 1.0f - getVideoTranscriptionProgress();
            } else {
                f6 = 1.0f;
            }
            paint3.setAlpha((int) (f21 * f6 * alpha));
            i = alpha;
        }
        ucc uccVar = this.ac;
        if (uccVar != null && uccVar.j) {
            float f22 = mmVar.L0;
            float f23 = mmVar.M0;
            uccVar.setBounds((int) f22, (int) f23, (int) (f22 + mmVar.N0), (int) (f23 + mmVar.O0));
            this.ac.draw(canvas);
        }
        int alpha2 = cmb.j2.getAlpha();
        float strokeWidth = cmb.j2.getStrokeWidth();
        if (this.Mb == 1.0f) {
            f7 = this.Q5.b0;
        } else {
            f7 = this.Wb;
        }
        if (f2 > 0.0f) {
            float width = rectF.width() / f3;
            cmb.j2.setStrokeWidth((0.5f * strokeWidth * this.Nb) + strokeWidth);
            cmb.j2.setAlpha((int) (alpha2 * this.Nb * 0.3f));
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), width, cmb.j2);
            cmb.j2.setAlpha(alpha2);
            double d = ((-360.0f) * f7) + 180.0f;
            f8 = 0.0f;
            float f24 = f2;
            double d2 = width;
            this.Rb = (float) ((Math.sin(Math.toRadians(d)) * d2) + rectF.centerX());
            this.Sb = (float) ((Math.cos(Math.toRadians(d)) * d2) + rectF.centerY());
            cmb.l2.setColor(-1);
            Paint paint4 = cmb.l2;
            float min = Math.min(1.0f, f24) * f5;
            if (!this.R1) {
                f10 = 1.0f - getVideoTranscriptionProgress();
            } else {
                f10 = 1.0f;
            }
            paint4.setAlpha((int) (min * f10));
            canvas.drawCircle(this.Rb, this.Sb, (gm.L(3.0f) * this.Ob) + (gm.L(5.0f) * f24) + gm.L(3.0f), cmb.l2);
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
                i = cmb.j2.getAlpha();
            }
            float f27 = alpha2;
            cmb.j2.setAlpha((int) ((1.0f - this.Vb) * f27));
            canvas.drawArc(rectF, -90.0f, f7 * 360.0f, false, cmb.j2);
            cmb.j2.setAlpha((int) (f27 * this.Vb));
            canvas.drawArc(rectF, -90.0f, this.Ub * 360.0f, false, cmb.j2);
            i = i;
        } else {
            canvas.drawArc(rectF, -90.0f, f7 * 360.0f, false, cmb.j2);
        }
        if (i != -1) {
            cmb.j2.setAlpha(i);
        }
        cmb.j2.setStrokeWidth(strokeWidth);
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
        k47 k47Var = this.R5;
        if (k47Var == null) {
            k47Var = this.Q5;
        }
        this.B0 = false;
        ArrayList arrayList = this.x4;
        if (k47Var != null && k47Var.k.message != null && characterStyle != null) {
            if (this.m3 != null && !TextUtils.isEmpty(k47Var.z)) {
                CharSequence charSequence = k47Var.z;
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
                            h47 h47Var = (h47) this.m3.e.get(i6);
                            if (i4 >= h47Var.n && i4 < h47Var.r) {
                                this.A0 = i6;
                                this.B0 = false;
                                j3();
                                try {
                                    b66 c3 = c3();
                                    c3.d(h47Var.e, i4, 0.0f);
                                    h47Var.e.getSelectionPath(i4, i3, c3);
                                    if (i3 >= h47Var.n + i5) {
                                        for (int i7 = i6 + 1; i7 < this.m3.e.size(); i7++) {
                                            h47 h47Var2 = (h47) this.m3.e.get(i7);
                                            int i8 = h47Var2.r - h47Var2.n;
                                            b66 c32 = c3();
                                            c32.d(h47Var2.e, 0, h47Var2.w);
                                            h47Var2.e.getSelectionPath(0, i3 - h47Var2.n, c32);
                                            if (i3 < (h47Var.n + i8) - 1) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                invalidate();
                                return;
                            }
                        }
                    }
                }
            }
            CharSequence charSequence2 = k47Var.v;
            if ((charSequence2 instanceof Spanned) && k47Var.B2 != null) {
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
                    for (int i10 = 0; i10 < k47Var.B2.size(); i10++) {
                        h47 h47Var3 = (h47) k47Var.B2.get(i10);
                        if (i2 >= h47Var3.n && i2 < h47Var3.r) {
                            this.A0 = i10;
                            this.B0 = false;
                            j3();
                            try {
                                b66 c33 = c3();
                                c33.d(h47Var3.e, i2, 0.0f);
                                h47Var3.e.getSelectionPath(i2, i, c33);
                                if (i >= h47Var3.n + i9) {
                                    for (int i11 = i10 + 1; i11 < k47Var.B2.size(); i11++) {
                                        h47 h47Var4 = (h47) k47Var.B2.get(i11);
                                        int i12 = h47Var4.r - h47Var4.n;
                                        b66 c34 = c3();
                                        c34.d(h47Var4.e, 0, h47Var4.w);
                                        h47Var4.e.getSelectionPath(0, i - h47Var4.n, c34);
                                        if (i < (h47Var3.n + i12) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
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

    public final void u0() {
        if (this.k7 == null) {
            this.k7 = new ImageReceiver[3];
            this.l7 = new pc0[3];
            this.m7 = new boolean[3];
            int i = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.k7;
                if (i < imageReceiverArr.length) {
                    imageReceiverArr[i] = new ImageReceiver(this);
                    this.k7[i].q0(gm.L(12.0f));
                    this.l7[i] = new pc0((ylb) null);
                    this.l7[i].s(gm.L(18.0f));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u1(Canvas canvas, Integer num, float f, boolean z) {
        c47 c47Var = this.M;
        if (c47Var != null) {
            int i = c47Var.l;
            if ((i & 8) == 0 || (i & 1) == 0) {
                return;
            }
        }
        l39 l39Var = this.O;
        l39Var.getClass();
        l39Var.A = f;
        l39Var.B = z;
        l39Var.d(canvas, this.ub.L1, num);
    }

    public final boolean u2() {
        f47 f47Var;
        if (v2() && (f47Var = this.L) != null && this.M != null && !f47Var.b && !f47Var.i) {
            return true;
        }
        return false;
    }

    public final void u3(int i) {
        k47 k47Var = this.R5;
        if (k47Var == null) {
            k47Var = this.Q5;
        }
        if (k47Var == null) {
            this.o3 = null;
            return;
        }
        a09 a09Var = this.o3;
        if (a09Var == null || !a09Var.e || a09Var.c != (-i)) {
            this.o3 = new a09(this, k47Var.e1(), i);
        }
        this.B0 = true;
    }

    public final boolean v() {
        if (this.Q5.t2() && !this.Q5.O0 && this.Y9 == 0.0f && this.V0.n() != null) {
            return false;
        }
        return true;
    }

    public final int v0(int i, k47 k47Var) {
        TLRPC.Document F0;
        TLRPC.WebPage webPage;
        boolean z;
        int i2;
        cc2 cc2Var;
        cc2 cc2Var2;
        int i3 = i;
        TLRPC.MessageMedia messageMedia = k47Var.a1;
        TLRPC.PhotoSize photoSize = null;
        if (messageMedia != null) {
            F0 = messageMedia.document;
            this.N1 = F0;
        } else if (k47Var.D == 0) {
            TLRPC.MessageMedia n1 = k47.n1(k47Var.k);
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
            F0 = k47Var.F0();
            this.N1 = F0;
        }
        int i4 = 0;
        if (F0 != null) {
            double d = 0.0d;
            if (k47.P4(F0)) {
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
                Typeface typeface = gm.a;
                cmb.M2.measureText("00:00");
                this.V6 = i3 - gm.L(18.0f);
                Z2(k47Var);
                int L = gm.L(174.0f) + this.M9;
                if (!this.R1) {
                    this.b7 = Math.min(i3, L + ((int) Math.ceil(cmb.M2.measureText(gm.g0((int) d, true, false)))));
                }
                this.E4.m = k47Var;
                return 0;
            } else if (k47.J4(this.N1)) {
                this.M1 = (byte) 4;
                if (!k47Var.l5()) {
                    W3();
                    String i0 = gm.i0(this.N1.size, false, false);
                    this.f3 = (int) Math.ceil(cmb.B2.measureText(i0));
                    this.e3 = new StaticLayout(i0, cmb.B2, this.f3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (k47.J3(this.N1)) {
                F1();
                this.M1 = (byte) 5;
                int L2 = i3 - gm.L(92.0f);
                if (L2 < 0) {
                    L2 = gm.L(100.0f);
                }
                int i6 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(k47Var.y1(true).replace('\n', ' '), cmb.N2, i6 - gm.L(12.0f), truncateAt);
                cc2 cc2Var3 = this.K4;
                TextPaint textPaint = cmb.N2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                cc2Var3.d = new StaticLayout(ellipsize, textPaint, i6, alignment, 1.0f, 0.0f, false);
                if (this.K4.d.getLineCount() > 0) {
                    this.K4.e = -((int) Math.ceil(cc2Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.K4.d.getLineWidth(0);
                    if (gm.L(104.0f) + lineWidth > this.b7) {
                        this.b7 = gm.L(104.0f) + lineWidth;
                    }
                }
                this.K4.f = new StaticLayout(TextUtils.ellipsize(k47Var.w1(true).replace('\n', ' '), cmb.O2, i6, truncateAt), cmb.O2, i6, alignment, 1.0f, 0.0f, false);
                if (this.K4.f.getLineCount() > 0) {
                    this.K4.g = -((int) Math.ceil(cc2Var.f.getLineLeft(0)));
                    int lineWidth2 = (int) this.K4.f.getLineWidth(0);
                    if (gm.L(104.0f) + lineWidth2 > this.b7) {
                        this.b7 = gm.L(104.0f) + lineWidth2;
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
                int ceil = (int) Math.ceil(cmb.M2.measureText(gm.k0(i7, i7)));
                this.V6 = this.b7 - gm.L(28.0f);
                return ceil;
            } else if (k47.s3(this.N1, k47Var.z2())) {
                this.M1 = (byte) 2;
                if (!k47Var.l5()) {
                    String M0 = jb6.M0(2131753936, "AttachGif");
                    this.C3 = (int) Math.ceil(cmb.B2.measureText(M0));
                    TextPaint textPaint2 = cmb.B2;
                    int i8 = this.C3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.x3 = new StaticLayout(M0, textPaint2, i8, alignment2, 1.0f, 0.0f, false);
                    String i02 = gm.i0(this.N1.size, false, false);
                    this.f3 = (int) Math.ceil(cmb.B2.measureText(i02));
                    this.e3 = new StaticLayout(i02, cmb.B2, this.f3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.N1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.N1.mime_type.toLowerCase().startsWith("video/mp4"))) || k47.W2(this.N1)) {
                    z = true;
                } else {
                    z = false;
                }
                this.O1 = z;
                if (!z) {
                    i3 += gm.L(30.0f);
                }
                int i9 = i3;
                this.M1 = (byte) 1;
                String B = bc4.B(this.N1);
                if (B.length() == 0) {
                    B = jb6.M0(2131753940, "AttachDocument");
                }
                StaticLayout c = oya.c(B, cmb.F2, i9, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i9, 2, false);
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
                int min = Math.min(i9 - gm.L(30.0f), (int) Math.ceil(cmb.B2.measureText("000.0 mm / ".concat(gm.i0(this.N1.size, false, false)))));
                this.C3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(gm.i0(this.N1.size, false, false) + " " + bc4.A(this.N1), cmb.B2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.C3 < 0) {
                        this.C3 = gm.L(10.0f);
                    }
                    this.x3 = new StaticLayout(ellipsize2, cmb.B2, this.C3 + gm.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (this.O1) {
                    this.e4 = bc4.w(k47Var.p0, 320, false, null, false);
                    this.f4 = bc4.w(k47Var.p0, 40, false, null, false);
                    if (this.Q5.x3() || (er3.q(this.a6).l() & 1) == 0) {
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
                        mm mmVar = this.U0;
                        mmVar.G0 = true;
                        mmVar.H0 = true;
                    }
                    this.h4 = "86_86_b";
                    this.U0.Z(gn5.f(photoSize, k47Var.n0), "86_86", gn5.f(this.f4, k47Var.n0), this.h4, this.g4, 0L, null, k47Var, 1);
                }
                return i2;
            }
        }
        return 0;
    }

    public final void v1(mu1 mu1Var, Canvas canvas, int i, Integer num, float f) {
        c47 c47Var = this.M;
        if (c47Var != null) {
            int i2 = c47Var.l;
            if ((i2 & 8) == 0 || (i2 & 1) == 0) {
                return;
            }
        }
        l39 l39Var = this.O;
        l39Var.getClass();
        l39Var.A = f;
        l39Var.f(mu1Var, canvas, i, num);
    }

    public final boolean v2() {
        k47 k47Var;
        if (w2() && (k47Var = this.Q5) != null && !k47Var.O3()) {
            return true;
        }
        return false;
    }

    public final void v3(String str) {
        w3(false, -1, str, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        fg0 fg0Var;
        yf8 yf8Var;
        kf8 kf8Var;
        nc2 nc2Var;
        nc2 nc2Var2;
        nc2 nc2Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.J2;
            if (drawable != drawableArr[0] && drawable != this.y3 && drawable != drawableArr[1]) {
                uc2 uc2Var = this.Y0;
                if (uc2Var != null) {
                    fg0Var = uc2Var.x;
                } else {
                    fg0Var = null;
                }
                if (drawable == fg0Var || drawable == this.V2 || drawable == this.Wa || ((drawable != null && (((nc2Var = this.tc) != null && drawable == nc2Var.k) || (((nc2Var2 = this.uc) != null && drawable == nc2Var2.k) || ((nc2Var3 = this.ad) != null && drawable == nc2Var3.k)))) || ((this.O != null && (drawable instanceof ho)) || (drawable instanceof qa6)))) {
                    return true;
                }
                xc2 xc2Var = this.x2;
                if (xc2Var == null || (kf8Var = xc2Var.l) == null || (drawable != kf8Var && drawable != kf8Var.a)) {
                    ArrayList arrayList = this.Q4;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        qc2 qc2Var = (qc2) obj;
                        if (qc2Var.w != drawable && ((yf8Var = qc2Var.x) == null || (drawable != yf8Var && drawable != yf8Var.a && drawable != yf8Var.b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void w() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.w():void");
    }

    public final void w1(Canvas canvas, RectF rectF, float f) {
        String str;
        x();
        if (this.U8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f, f, c2(str));
        if (i2()) {
            canvas.drawRoundRect(rectF, f, f, cmb.g2);
        }
    }

    public final boolean w2() {
        k47 k47Var = this.Q5;
        if (k47Var != null) {
            return k47Var.P2();
        }
        return cmb.g1(this.cc);
    }

    public final boolean w3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.w3(boolean, int, java.lang.String, boolean):boolean");
    }

    public final void x() {
        y(getX(), this.nb, getMeasuredWidth(), this.ob);
    }

    public final void x0() {
        float f;
        float f2;
        int i;
        int measureText;
        boolean z;
        if (this.u2) {
            A0(0);
        }
        if (this.u2 && this.r2 == null) {
            this.D2 = gm.L(33.0f);
            CharSequence charSequence = this.z2;
            if (charSequence == null) {
                byte b = this.y2;
                if (b == 12) {
                    charSequence = jb6.M0(2131747541, null);
                } else if (b == 1) {
                    charSequence = jb6.M0(2131747545, null);
                } else if (b == 29) {
                    charSequence = jb6.M0(2131747542, null);
                } else if (b == 13) {
                    charSequence = jb6.M0(2131745335, null).toUpperCase();
                } else if (b == 32) {
                    charSequence = jb6.M0(2131747519, null).toUpperCase();
                } else if (b == 85) {
                    charSequence = jb6.M0(2131747549, null);
                } else if (b == 10) {
                    charSequence = jb6.M0(2131747546, null);
                } else if (b == 2) {
                    charSequence = jb6.M0(2131747533, null);
                } else if (b == 3) {
                    charSequence = jb6.M0(2131747520, null);
                } else if (b == 5) {
                    charSequence = jb6.M0(2131743240, null);
                } else if (b == 6) {
                    charSequence = jb6.M0(2131747547, null);
                } else if (b == 7) {
                    charSequence = jb6.M0(2131747517, null);
                } else if (b != 9 && b != 11) {
                    if (b == 25) {
                        charSequence = jb6.M0(2131743051, null);
                    } else if (b == 14) {
                        charSequence = jb6.M0(2131743242, null).toUpperCase();
                    } else if (b == 15) {
                        charSequence = jb6.M0(2131752871, null).toUpperCase();
                    } else if (b == 16) {
                        charSequence = jb6.M0(2131747522, null).toUpperCase();
                    } else if (b == 17) {
                        charSequence = jb6.M0(2131743225, null).toUpperCase();
                    } else if (b != 18 && b != 22) {
                        if (b == 19) {
                            charSequence = jb6.M0(2131753311, null);
                        } else if (b == 20) {
                            charSequence = jb6.M0(2131747537, null);
                        } else if (b == 21) {
                            charSequence = jb6.M0(2131754195, null);
                        } else if (b == 23) {
                            charSequence = jb6.M0(2131747518, null);
                        } else if (b == 24) {
                            charSequence = jb6.M0(2131747540, null);
                        } else if (b == 26) {
                            TL_stars.StarGift starGift = this.Hd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.a6).getCurrentTime()) {
                                    charSequence = jb6.M0(2131747534, null);
                                    z = false;
                                } else {
                                    if (this.Hd.sold_out) {
                                        charSequence = jb6.M0(2131747535, null);
                                    } else {
                                        charSequence = jb6.M0(2131747536, null);
                                    }
                                    z = true;
                                }
                                if (z) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new pn2(2131231120, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = jb6.M0(2131747516, null);
                            }
                        } else if (b == 27) {
                            charSequence = jb6.M0(2131748837, null).toUpperCase();
                        } else if (b == 28) {
                            charSequence = jb6.M0(2131743241, null);
                        } else {
                            charSequence = jb6.M0(2131748950, null);
                        }
                    } else {
                        charSequence = jb6.M0(2131753581, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) k47.n1(this.Q5.k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = jb6.M0(2131743050, null);
                    } else {
                        charSequence = jb6.M0(2131743051, null);
                    }
                }
            }
            if (this.Q5.q4() && this.b7 < (measureText = (int) (cmb.L2.measureText(charSequence, 0, charSequence.length()) + gm.L(75.0f)))) {
                this.b7 = measureText;
            }
            int L = this.b7 - gm.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, cmb.L2, L, TextUtils.TruncateAt.END), cmb.L2, gm.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            this.D2 = i2 - gm.L(f2);
            int L2 = gm.L(46.0f) + this.v0;
            this.v0 = L2;
            if (this.Q5.D == 12) {
                this.v0 = gm.L(14.0f) + L2;
            }
            if (this.Q5.q4()) {
                this.v0 = gm.L(2.0f) + this.v0;
            }
            StaticLayout staticLayout2 = this.r2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.D2 - Math.ceil(this.r2.getLineWidth(0)))) / 2;
                if (this.y2 == 0) {
                    i = gm.L(8.0f);
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

    public final void x1(Canvas canvas, boolean z) {
        float f;
        float f2;
        boolean z2;
        int i;
        float f3;
        float L;
        float f4;
        f47 f47Var;
        if ((!this.Q8 || z) && this.R8 != 0) {
            c47 c47Var = this.M;
            if (c47Var == null || (f47Var = this.L) == null || !f47Var.i || c47Var.h) {
                boolean O3 = this.Q5.O3();
                yc2 yc2Var = this.ub;
                if (O3) {
                    float L2 = yc2Var.j1 - gm.L(40.0f);
                    this.d9 = L2;
                    f47 f47Var2 = this.L;
                    if (f47Var2 != null) {
                        this.d9 = (f47Var2.m.e - this.wd) + L2;
                    }
                } else {
                    float L3 = gm.L(8.0f) + yc2Var.k1;
                    this.d9 = L3;
                    f47 f47Var3 = this.L;
                    if (f47Var3 != null) {
                        this.d9 = (f47Var3.m.g - this.wd) + L3;
                    }
                    if (v2()) {
                        this.d9 = Math.min(this.d9, getCompactRight() - gm.L(32.0f));
                    }
                }
                float f5 = 0.0f;
                if (this.R8 == 4) {
                    this.e9 = gm.L(6.0f);
                } else {
                    float L4 = (this.e7 + yc2Var.j0) - gm.L(41.0f);
                    this.e9 = L4;
                    k47 k47Var = this.Q5;
                    if (k47Var.D == 19 && k47Var.v2 < this.N9) {
                        L4 -= gm.L(22.0f);
                        this.e9 = L4;
                    }
                    f47 f47Var4 = this.L;
                    if (f47Var4 != null) {
                        e47 e47Var = f47Var4.m;
                        float f6 = L4 + e47Var.h;
                        this.e9 = f6;
                        if (e47Var.j) {
                            this.e9 = f6 - getTranslationY();
                        }
                    }
                    if (this.Q5.N5()) {
                        l39 l39Var = this.O;
                        l39Var.getClass();
                        if (this.Kb) {
                            this.e9 -= (1.0f - getVideoTranscriptionProgress()) * l39Var.i(yc2Var.L1);
                        } else if (l39Var.a > 0.0f) {
                            this.e9 -= l39Var.i(yc2Var.L1);
                        }
                    }
                }
                if (this.R8 != 4) {
                    float L5 = ((this.e7 + yc2Var.j0) - gm.L(32.0f)) / 2.0f;
                    if (this.e9 < L5) {
                        this.e9 = L5;
                    }
                }
                if (this.Q5.D == 19) {
                    if (this.R8 == 3 && this.n7 != null) {
                        this.e9 = gm.L(18.0f);
                    } else {
                        this.e9 = 0.0f;
                    }
                }
                if (!this.Q5.O3() && this.Kb && !this.R1) {
                    if (this.G6) {
                        L = (gm.b3(this.X6, w2()) - gm.u) * 0.7f;
                    } else {
                        L = gm.L(50.0f);
                    }
                    if (this.Lb) {
                        f4 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f4 = 0.0f;
                    }
                    if (this.Lb) {
                        f5 = gm.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (yc2Var.l2) {
                        boolean z3 = this.Lb;
                        float f7 = yc2Var.L1;
                        if (!z3) {
                            f7 = 1.0f - f7;
                        }
                        f4 = (1.0f - getVideoTranscriptionProgress()) * f7 * L;
                        boolean z4 = this.Lb;
                        float f8 = yc2Var.L1;
                        if (!z4) {
                            f8 = 1.0f - f8;
                        }
                        f5 = (1.0f - getVideoTranscriptionProgress()) * f8 * gm.L(28.0f);
                    }
                    this.d9 -= f4;
                    this.e9 -= f5;
                    if (v2()) {
                        float compactRight = getCompactRight() - gm.L(32.0f);
                        this.d9 = gm.R1(Math.min(this.U0.w() + gm.L(8.0f), compactRight), Math.min(this.d9 + f4, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.S8 = true;
                if (this.R8 == 3) {
                    if (!this.y || k47.Q4(this.Q5.k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!ela.l0) {
                    float f9 = this.d9;
                    float f10 = this.e9;
                    float L6 = gm.L(32.0f) + f9;
                    float f11 = this.e9;
                    if (this.T8 == 5) {
                        f = 64.0f;
                    } else {
                        f = 32.0f;
                    }
                    RectF rectF = this.c4;
                    rectF.set(f9, f10, L6, f11 + gm.L(f));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.S8 = false;
                        return;
                    }
                    int i2 = (int) ((1.0f - this.E.e) * 255.0f);
                    if (i2 != 255) {
                        float f12 = this.d9;
                        f2 = 32.0f;
                        z2 = false;
                        i = canvas.saveLayerAlpha(f12, this.e9, gm.L(32.0f) + f12, this.e9 + gm.L(64.0f), i2);
                    } else {
                        f2 = 32.0f;
                        z2 = false;
                        i = -1;
                    }
                    x();
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
                            float L7 = gm.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z5 ? 1 : 0] = L7;
                        } else {
                            f3 = 2.0f;
                        }
                        if (this.c9 == null) {
                            this.c9 = r3;
                            float L8 = gm.L(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, L8, L8, L8, L8};
                        }
                        RectF rectF2 = gm.P;
                        float f13 = this.d9;
                        rectF2.set(f13, this.e9, gm.L(f2) + f13, this.e9 + gm.L(f2));
                        Path path3 = this.Z8;
                        float[] fArr3 = this.b9;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.d9, this.e9 + gm.L(f2), this.d9 + gm.L(f2), this.e9 + gm.L(64.0f));
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
                        float L9 = gm.L(16.0f);
                        float L10 = gm.L(16.0f);
                        if (this.U8) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, L9, L10, c2(str));
                    }
                    if (i2()) {
                        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.g2);
                    }
                    byte b2 = this.R8;
                    if (b2 == 2) {
                        Drawable b22 = b2("drawableGoIcon");
                        hg0.t(b22, (this.d9 + gm.L(16.0f)) - (b22.getIntrinsicWidth() / f3), (this.e9 + gm.L(16.0f)) - (b22.getIntrinsicHeight() / f3));
                        b22.draw(canvas);
                    } else {
                        float f14 = this.d9;
                        if (b2 == 4) {
                            int L11 = (int) (f14 + gm.L(16.0f));
                            int L12 = (int) (this.e9 + gm.L(16.0f));
                            Drawable b23 = b2("drawableCloseIcon");
                            int intrinsicWidth = b23.getIntrinsicWidth() / 2;
                            int intrinsicHeight = b23.getIntrinsicHeight() / 2;
                            b23.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                            hg0.t(b23, this.d9 + gm.L(4.0f), this.e9 + gm.L(4.0f));
                            canvas.save();
                            canvas.scale(0.65f, 0.65f, b23.getBounds().centerX(), b23.getBounds().centerY());
                            b23.draw(canvas);
                            canvas.restore();
                            if (this.T8 == 5) {
                                Drawable b24 = b2("drawableMoreIcon");
                                int intrinsicWidth2 = b24.getIntrinsicWidth() / 2;
                                int intrinsicHeight2 = b24.getIntrinsicHeight() / 2;
                                b24.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                                hg0.t(b24, this.d9 + gm.L(4.0f), this.e9 + gm.L(34.0f));
                                b24.draw(canvas);
                            }
                        } else {
                            int L13 = (int) (f14 + gm.L(16.0f));
                            int L14 = (int) (this.e9 + gm.L(16.0f));
                            Drawable b25 = b2("drawableShareIcon");
                            int intrinsicWidth3 = b25.getIntrinsicWidth() / 2;
                            int intrinsicHeight3 = b25.getIntrinsicHeight() / 2;
                            b25.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                            hg0.t(b25, this.d9 + gm.L(4.0f), this.e9 + gm.L(4.0f));
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
        k47 k47Var;
        int i;
        if (v2() && !this.F && (i = (k47Var = this.Q5).D) != 16 && i != 27 && !k47Var.g3() && !this.Q5.q4()) {
            k47 k47Var2 = this.Q5;
            if (k47Var2.G != null || k47Var2.Z0() != 0 || this.Q5.k.post) {
                c47 c47Var = this.M;
                if (c47Var == null || (c47Var.l & 4) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void x3(float f, float f2, float f3, float f4) {
        mm mmVar = this.U0;
        mmVar.i0(f, f2, f3, f4);
        byte b = this.M1;
        if (b != 4 && b != 2) {
            return;
        }
        this.M3 = (int) (mmVar.L0 + gm.L(8.0f));
        int L = (int) (mmVar.M0 + gm.L(8.0f));
        this.N3 = L;
        int i = this.M3;
        int L2 = gm.L(24.0f) + this.N3;
        this.R0.p(i, L, gm.L(24.0f) + i, L2);
        this.K3 = (int) aq1.z(mmVar.N0, gm.L(48.0f), 2.0f, f);
        int z = (int) aq1.z(mmVar.O0, gm.L(48.0f), 2.0f, mmVar.M0);
        this.L3 = z;
        int i2 = this.K3;
        int i3 = this.L3;
        this.Q0.p(i2, z, gm.L(48.0f) + i2, gm.L(48.0f) + i3);
    }

    public final void y(float f, float f2, int i, int i2) {
        ylb ylbVar = this.cc;
        int i3 = this.W;
        if (ylbVar != null) {
            ylbVar.b(f, f2 + i3 + this.g0 + this.i0, i, i2);
        } else {
            cmb.q(f, f2 + i3 + this.g0 + this.i0, i, i2);
        }
    }

    public final void y0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.y0(long, long):void");
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
        this.gd.setColor(cmb.p1(f * 0.2f, i));
        this.gd.setPathEffect(b66.c());
        canvas.drawPath(path, this.gd);
        canvas.restore();
    }

    public final boolean y2() {
        if (this.Q5 != null && this.L == null && !this.B5 && x2() && H2()) {
            return true;
        }
        return false;
    }

    public final void y3(defpackage.k47 r116, defpackage.f47 r117, boolean r118, boolean r119, boolean r120, boolean r121) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.y3(k47, f47, boolean, boolean, boolean, boolean):void");
    }

    public final void z(int i, int i2, int i3) {
        int k1;
        boolean z;
        int i4;
        boolean z2;
        uj9 uj9Var;
        boolean z3;
        if (this.Q5.q4()) {
            this.b7 = gm.L(31.0f) + i3;
        } else if (g4()) {
            this.b7 = gm.L(31.0f) + i3;
        } else {
            l39 l39Var = this.O;
            if (!l39Var.p) {
                k1 = l39Var.r;
            } else {
                k1 = this.Q5.k1();
            }
            boolean z4 = false;
            if (!l39Var.p) {
                if (i - k1 >= i2 && !this.Q5.w2) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.U1) {
                    this.v0 = gm.L(14.0f) + this.v0;
                }
            } else if ((this.v1 || ((!this.R1 || this.Q5.q4()) && !h2() && !this.S1 && !this.T1 && !this.U1)) && i - k1 >= i2 && !this.Q5.w2) {
                z = false;
            } else {
                z = true;
            }
            if (this.Q5.F4()) {
                z = true;
            }
            if (l39Var.p && (uj9Var = this.Q5.y2) != null) {
                ArrayList arrayList = uj9Var.h;
                ArrayList arrayList2 = uj9Var.g;
                if (!arrayList2.isEmpty() && !uj9Var.d && !uj9Var.H()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            if (((ni9) obj).b >= arrayList2.size() - 1) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = ((qi9) b10.f(1, arrayList2)).u();
                } else {
                    z3 = true;
                    break;
                }
                if (z3) {
                    z = true;
                }
            }
            k47 k47Var = this.Q5;
            if ((k47Var.F2 && l39Var.p) || ((k47Var.J2 && l39Var.p) || k47Var.v3())) {
                i4 = 18;
                z = true;
            } else {
                i4 = 14;
            }
            if (l39Var.p && R2() && !TextUtils.isEmpty(this.Q5.z) && !this.w1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!y2()) {
                z4 = z;
            }
            if (z4) {
                if (!z2) {
                    this.v0 = gm.L(i4) + this.v0;
                    this.c7 = true;
                }
                int L = gm.L(31.0f) + Math.max(i3, k1);
                this.b7 = L;
                boolean O3 = this.Q5.O3();
                int i6 = this.M9;
                if (O3) {
                    i6 += gm.L(17.0f);
                }
                this.b7 = kt6.e(31.0f, i6, L);
            } else {
                int extraTextX = (i3 - getExtraTextX()) - k1;
                if (extraTextX >= 0 && extraTextX <= i2) {
                    this.b7 = gm.L(31.0f) + ((i3 + i2) - extraTextX);
                } else {
                    this.b7 = gm.L(31.0f) + Math.max(i3, k1 + i2);
                }
            }
            if (v2()) {
                this.b7 = gm.L(31.0f) + i;
            }
        }
    }

    public final void z0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] t = fn5.z().t(bc4.B(document));
        if (t != null) {
            y0(t[0], t[1]);
        } else {
            y0(this.Q5.H0, document.size);
        }
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
        k47 k47Var;
        boolean z8 = (f4 == 1.0f || z6) ? false : true;
        float f9 = (f4 * 0.5f) + 0.5f;
        float f10 = z8 ? f * f4 : f;
        if (this.M1 != 7 || ((k47Var = this.Q5) != null && k47Var.f4())) {
            photoBottom = getPhotoBottom() + this.w0;
        } else {
            photoBottom = f3 - ((1.0f - getVideoTranscriptionProgress()) * (this.O.i(this.ub.L1) + gm.L(this.K ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - gm.L(8.5f);
        k47 k47Var2 = this.Q5;
        float L4 = (k47Var2 == null || !k47Var2.M2()) ? 0.0f : gm.L(-6.0f);
        float f11 = 22.0f;
        if (z3) {
            ai7 ai7Var = cmb.D3;
            if (I3()) {
                if (this.Q5.O5()) {
                    f5 = 1.0f;
                    v0 = cmb.v0(cmb.Yc, this.cc);
                    int i2 = this.d7;
                    f8 = z5 ? 24.0f : 22.0f;
                    ai7Var.getClass();
                    f7 = 4.0f;
                    hg0.t(ai7Var, ((i2 - gm.L(f8)) - gm.L(12.0f)) + L4, (L3 - gm.L(12.0f)) + f2);
                    ai7Var.setAlpha((int) (this.k4 * 255.0f * f10));
                } else {
                    f5 = 1.0f;
                    f7 = 4.0f;
                    v0 = cmb.v0(cmb.jd, this.cc);
                    int i3 = this.d7;
                    f8 = z5 ? 24.0f : 22.0f;
                    ai7Var.getClass();
                    hg0.t(ai7Var, ((i3 - gm.L(f8)) - gm.L(12.0f)) + L4, (L3 - gm.L(12.0f)) + f2);
                    ai7Var.setAlpha((int) (f10 * 255.0f));
                }
                f6 = 18.5f;
            } else {
                f5 = 1.0f;
                f7 = 4.0f;
                v0 = cmb.v0(cmb.Db, this.cc);
                ai7Var.getClass();
                f6 = 18.5f;
                hg0.t(ai7Var, (this.d7 - gm.L(18.5f)) - gm.L(12.0f), ((f3 - gm.L(8.5f)) - gm.L(12.0f)) + f2);
                ai7Var.setAlpha((int) (f10 * 255.0f));
            }
            ai7Var.a(v0);
            if (z8) {
                canvas.save();
                canvas.scale(f9, f9, ai7Var.getBounds().centerX(), ai7Var.getBounds().centerY());
            }
            ai7Var.draw(canvas);
            ai7Var.setAlpha(255);
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
                            canvas.translate(gm.L(4.8f) * (f5 - f4), 0.0f);
                        }
                        hg0.t(drawable, ((this.d7 - gm.L(z5 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f2);
                    } else {
                        hg0.t(drawable, ((this.d7 - gm.L(z5 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f2);
                    }
                    drawable.setAlpha((int) (this.k4 * 255.0f * f10));
                } else {
                    if (z) {
                        if (z6) {
                            canvas.translate((f5 - f4) * gm.L(4.8f), 0.0f);
                        }
                        hg0.t(cmb.E3, (this.d7 - gm.L(z5 ? 28.3f : 26.3f)) - cmb.E3.getIntrinsicWidth(), (L3 - cmb.E3.getIntrinsicHeight()) + f2);
                    } else {
                        hg0.t(cmb.E3, (this.d7 - gm.L(z5 ? 23.5f : 21.5f)) - cmb.E3.getIntrinsicWidth(), (L3 - cmb.E3.getIntrinsicHeight()) + f2);
                    }
                    cmb.E3.setAlpha((int) (this.k4 * 255.0f * f10));
                    drawable = cmb.E3;
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
                        canvas.translate((f5 - f4) * gm.L(f7), 0.0f);
                    }
                    b2 = b2(z7 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    hg0.t(b2, ((this.d7 - gm.L(22.5f)) - b2.getIntrinsicWidth()) + L4, ((f3 - gm.L((this.G || this.F) ? 9.0f : 8.0f)) - b2.getIntrinsicHeight()) + f2);
                } else {
                    b2 = b2(z7 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    hg0.t(b2, ((this.d7 - gm.L(f6)) - b2.getIntrinsicWidth()) + L4, ((f3 - gm.L((this.G || this.F) ? 9.0f : 8.0f)) - b2.getIntrinsicHeight()) + f2);
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
                Drawable b22 = this.Q5.O5() ? b2("drawableMsgStickerHalfCheck") : cmb.F3;
                hg0.t(b22, ((this.d7 - gm.L(z5 ? 23.5f : 21.5f)) - b22.getIntrinsicWidth()) + L4, (L3 - b22.getIntrinsicHeight()) + f2);
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
                hg0.t(b23, (this.d7 - gm.L(18.0f)) - b23.getIntrinsicWidth(), ((f3 - gm.L((this.G || this.F) ? 9.0f : 8.0f)) - b23.getIntrinsicHeight()) + f2);
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
                L = i4 - gm.L(34.5f);
                L2 = gm.L(26.5f);
            } else {
                L = i4 - gm.L(32.0f);
                if (!this.G && !this.F) {
                    f11 = 21.0f;
                }
                L2 = gm.L(f11);
            }
            float f12 = (f3 - L2) + f2;
            RectF rectF = this.c4;
            rectF.set((int) (L + L4), f12, gm.L(14.0f) + i, gm.L(14.0f) + f12);
            int alpha = cmb.a2.getAlpha();
            cmb.a2.setAlpha((int) (alpha * f10));
            canvas.drawRoundRect(rectF, gm.L(f5), gm.L(f5), cmb.a2);
            cmb.a2.setAlpha(alpha);
            hg0.t(cmb.i4, gm.L(6.0f) + i, f12 + gm.L(2.0f));
            cmb.i4.setAlpha((int) (f10 * 255.0f));
            if (z8) {
                canvas.save();
                canvas.scale(f9, f9, cmb.i4.getBounds().centerX(), cmb.i4.getBounds().centerY());
            }
            cmb.i4.draw(canvas);
            cmb.i4.setAlpha(255);
            if (z8) {
                canvas.restore();
            }
        }
    }

    public final boolean z2(k47 k47Var) {
        int i = k47.n1(this.Q5.k).period;
        int currentTime = ConnectionsManager.getInstance(this.a6).getCurrentTime();
        if (i == Integer.MAX_VALUE) {
            return false;
        }
        if (i % 60 == 0) {
            if (Math.abs(currentTime - k47Var.k.date) <= i) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - k47Var.k.date) <= i - 5) {
            return false;
        } else {
            return true;
        }
    }

    public void z3(k47 k47Var, f47 f47Var, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.O0) {
            y3(k47Var, f47Var, z, z2, z3, z4);
            return;
        }
        this.R5 = k47Var;
        this.S5 = f47Var;
        this.U5 = z;
        this.T5 = z2;
        this.V5 = z3;
        this.W5 = z4;
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        mc2 mc2Var;
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
            if (!this.ic || (mc2Var = this.eb) == null) {
                return;
            }
            mc2Var.c();
        }
    }

    public void setBackgroundTopY(int i) {
        int i2;
        int i3;
        m37 m37Var = this.L6;
        int i4 = this.L0;
        int i5 = this.M0;
        if (i5 == 0) {
            i4 = getParentWidth();
            i5 = gm.q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i3 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                float f = this.N0;
                m37Var.p((int) (i + f), i3, i2, (int) f, this.pb, this.qb, this.F, (this.G && this.ub.A0 == 1.0f) ? false : true);
                m37Var.u = j2();
            }
        }
        i2 = i5;
        i3 = i4;
        float f2 = this.N0;
        m37Var.p((int) (i + f2), i3, i2, (int) f2, this.pb, this.qb, this.F, (this.G && this.ub.A0 == 1.0f) ? false : true);
        m37Var.u = j2();
    }

    public rc2(Context context, int i) {
        this(context, i, false, null, null);
    }
}
