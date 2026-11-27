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
public class wb2 extends jf0 implements qy9, on5, jq3, hmb, fn7, s84, pk5, eu5 {
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
    public te8 A8;
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
    public final rb0 B7;
    public boolean B8;
    public int B9;
    public String Ba;
    public final mb2 Bb;
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
    public ul Ca;
    public int Cb;
    public int Cc;
    public Paint Cd;
    public final Rect D0;
    public byte D1;
    public int D2;
    public pkb D3;
    public final nb2 D4;
    public int D5;
    public boolean D6;
    public boolean D7;
    public boolean D8;
    public int D9;
    public ul Da;
    public int Db;
    public int Dc;
    public float Dd;
    public final fm0 E;
    public int E0;
    public float E1;
    public boolean E2;
    public pkb E3;
    public final xy9 E4;
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
    public pkb F3;
    public final v7 F4;
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
    public v41 H2;
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
    public final mb2 Ib;
    public p40 Ic;
    public boolean J;
    public boolean J0;
    public int J1;
    public final Drawable[] J2;
    public boolean J3;
    public gb2 J4;
    public kb2 J5;
    public int J6;
    public Drawable J7;
    public final RectF J8;
    public float J9;
    public boolean Ja;
    public final SparseArray Jb;
    public u8a Jc;
    public boolean K;
    public boolean K0;
    public long K1;
    public final pb2[] K2;
    public int K3;
    public hb2 K4;
    public int K5;
    public boolean K6;
    public Drawable K7;
    public final Path K8;
    public float K9;
    public boolean Ka;
    public boolean Kb;
    public boolean Kc;
    public m47 L;
    public int L0;
    public long L1;
    public final int[] L2;
    public int L3;
    public StaticLayout L4;
    public boolean L5;
    public t37 L6;
    public int L7;
    public final float[] L8;
    public StaticLayout L9;
    public boolean La;
    public boolean Lb;
    public boolean Lc;
    public j47 M;
    public int M0;
    public byte M1;
    public final RectF M2;
    public int M3;
    public double M4;
    public boolean M5;
    public t37 M6;
    public boolean M7;
    public mm M8;
    public int M9;
    public dm Ma;
    public float Mb;
    public ui7 Mc;
    public boolean N;
    public float N0;
    public TLRPC.Document N1;
    public final int[] N2;
    public int N3;
    public int N4;
    public int N5;
    public int N6;
    public boolean N7;
    public f66 N8;
    public int N9;
    public dm Na;
    public float Nb;
    public boolean Nc;
    public final x49 O;
    public boolean O0;
    public boolean O1;
    public float O2;
    public int O3;
    public int O4;
    public npa O5;
    public int O6;
    public boolean O7;
    public va6 O8;
    public int O9;
    public dm Oa;
    public float Ob;
    public final ib2 Oc;
    public final dy4 P;
    public boolean P0;
    public pm3 P1;
    public SpannableStringBuilder P2;
    public boolean P3;
    public final ArrayList P4;
    public boolean P5;
    public int P6;
    public CheckBoxBase P7;
    public ArrayList P8;
    public int P9;
    public dm Pa;
    public float Pb;
    public Runnable Pc;
    public final fy4 Q;
    public final RadialProgress2 Q0;
    public int Q1;
    public boolean Q2;
    public boolean Q3;
    public final ArrayList Q4;
    public r47 Q5;
    public int Q6;
    public StaticLayout Q7;
    public boolean Q8;
    public CharSequence Q9;
    public dm Qa;
    public long Qb;
    public Runnable Qc;
    public boolean R;
    public final RadialProgress2 R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public float R4;
    public r47 R5;
    public int R6;
    public StaticLayout R7;
    public byte R8;
    public boolean R9;
    public v41 Ra;
    public float Rb;
    public int Rc;
    public long S;
    public boolean S0;
    public boolean S1;
    public long S2;
    public int S3;
    public int S4;
    public m47 S5;
    public boolean S6;
    public final AtomicReference S7;
    public boolean S8;
    public boolean S9;
    public v41 Sa;
    public float Sb;
    public int Sc;
    public pkb T;
    public final int[] T0;
    public boolean T1;
    public boolean T2;
    public int T3;
    public int T4;
    public boolean T5;
    public y7c T6;
    public final ImageReceiver T7;
    public byte T8;
    public Paint T9;
    public v41 Ta;
    public boolean Tb;
    public boolean Tc;
    public f66 U;
    public final nl U0;
    public boolean U1;
    public int U2;
    public int U3;
    public float U4;
    public boolean U5;
    public y7c U6;
    public int U7;
    public boolean U8;
    public Path U9;
    public float Ua;
    public float Ub;
    public float Uc;
    public CornerPathEffect V;
    public final ImageReceiver V0;
    public boolean V1;
    public hf0 V2;
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
    public hf0 Wa;
    public float Wb;
    public Drawable Wc;
    public final rb0 X0;
    public int X1;
    public boolean X2;
    public int X3;
    public boolean X4;
    public hd5 X5;
    public boolean X6;
    public int X7;
    public byte X8;
    public npa X9;
    public Path Xa;
    public int Xb;
    public boolean Xc;
    public zb2 Y0;
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
    public hfb Yc;
    public pb1 Z0;
    public int Z1;
    public hf0 Z2;
    public boolean Z3;
    public boolean Z4;
    public final int Z5;
    public float Z6;
    public int Z7;
    public Path Z8;
    public float Z9;
    public final RectF Za;
    public final c34 Zb;
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
    public rec ac;
    public sb2 ad;
    public pkb b0;
    public b29 b1;
    public int b2;
    public hf0 b3;
    public final RectF b4;
    public boolean b5;
    public boolean b6;
    public int b7;
    public int b8;
    public float[] b9;
    public float ba;
    public float bb;
    public ob2 bc;
    public StaticLayout bd;
    public f66 c0;
    public Paint c1;
    public int c2;
    public boolean c3;
    public final RectF c4;
    public boolean c5;
    public int c6;
    public boolean c7;
    public boolean c8;
    public float[] c9;
    public mpa ca;
    public float cb;
    public vnb cc;
    public String cd;
    public CornerPathEffect d0;
    public Paint d1;
    public float d2;
    public final jo9 d3;
    public TLObject d4;
    public int d5;
    public byte[] d6;
    public int d7;
    public boolean d8;
    public float d9;
    public Integer da;
    public int db;
    public final boolean dc;
    public f66 dd;
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
    public rb2 eb;
    public final rx6 ec;
    public final Path ed;
    public boolean f;
    public byb f0;
    public r3b f1;
    public int f2;
    public int f3;
    public TLRPC.PhotoSize f4;
    public boolean f5;
    public boolean f6;
    public CheckBoxBase[] f7;
    public boolean f8;
    public float f9;
    public float[] fa;
    public final m37 fb;
    public final ArrayList fc;
    public final RectF fd;
    public int g0;
    public boolean g1;
    public StaticLayout g2;
    public int g3;
    public BitmapDrawable g4;
    public boolean g5;
    public boolean g6;
    public op5 g7;
    public boolean g8;
    public float g9;
    public final float ga;
    public int gb;
    public final Stack gc;
    public Paint gd;
    public boolean h;
    public efb h0;
    public float h1;
    public StaticLayout h2;
    public boolean h3;
    public String h4;
    public float h5;
    public boolean h6;
    public va6 h7;
    public mm h8;
    public StaticLayout h9;
    public float ha;
    public int hb;
    public final Path hc;
    public int hd;
    public int i0;
    public float i1;
    public float i2;
    public bc2 i3;
    public String i4;
    public int i5;
    public boolean i6;
    public float i7;
    public float i8;
    public int i9;
    public float ia;
    public int ib;
    public boolean ic;
    public p47 id;
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
    public lh2 jc;
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
    public final ib2 kc;
    public boolean kd;
    public v41 l0;
    public CheckBoxBase l1;
    public float l2;
    public int l3;
    public float l4;
    public int l5;
    public boolean l6;
    public rb0[] l7;
    public int l8;
    public boolean l9;
    public String la;
    public float lb;
    public final ib2 lc;
    public long ld;
    public ul m0;
    public CheckBoxBase m1;
    public boolean m2;
    public p47 m3;
    public long m4;
    public tsb m5;
    public boolean m6;
    public boolean[] m7;
    public Drawable m8;
    public StaticLayout m9;
    public npa ma;
    public boolean mb;
    public long mc;
    public long md;
    public int n;
    public boolean n0;
    public boolean n1;
    public v41 n2;
    public p47 n3;
    public long n4;
    public mm n5;
    public boolean n6;
    public StaticLayout n7;
    public ab9 n8;
    public final RectF n9;
    public final Path na;
    public float nb;
    public float nc;
    public long nd;
    public int o0;
    public boolean o1;
    public StaticLayout o2;
    public m19 o3;
    public boolean o4;
    public int o5;
    public boolean o6;
    public rm o7;
    public ab9 o8;
    public v41 o9;
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
    public ab9 p8;
    public RectF p9;
    public StaticLayout pa;
    public int pb;
    public t37[] pc;
    public final RectF pd;
    public int q0;
    public long q1;
    public StaticLayout q2;
    public p47 q3;
    public hm q4;
    public boolean q5;
    public boolean q6;
    public int q7;
    public ab9 q8;
    public lm0 q9;
    public int qa;
    public int qb;
    public boolean qc;
    public Paint qd;
    public h74 r;
    public int r0;
    public int r1;
    public StaticLayout r2;
    public int r3;
    public q66 r4;
    public boolean r5;
    public boolean r6;
    public int r7;
    public ab9 r8;
    public int r9;
    public String ra;
    public boolean rb;
    public boolean rc;
    public Paint rd;
    public boolean s;
    public yb2 s0;
    public gc0 s1;
    public float s2;
    public float s3;
    public o47 s4;
    public float s5;
    public boolean s6;
    public boolean s7;
    public boolean s8;
    public float s9;
    public StaticLayout sa;
    public final boolean sb;
    public boolean sc;
    public float sd;
    public ac2 t0;
    public wm2 t1;
    public float t2;
    public float t3;
    public int t4;
    public int t5;
    public long t6;
    public int t7;
    public yza t8;
    public float t9;
    public int ta;
    public float tb;
    public sb2 tc;
    public int td;
    public int u0;
    public so4 u1;
    public boolean u2;
    public int u3;
    public final m66 u4;
    public float u5;
    public boolean u6;
    public int u7;
    public int u8;
    public float u9;
    public String ua;
    public final dc2 ub;
    public sb2 uc;
    public p47 ud;
    public int v0;
    public boolean v1;
    public RectF v2;
    public int v3;
    public int v4;
    public float v5;
    public boolean v6;
    public int v7;
    public hf0 v8;
    public boolean v9;
    public TLRPC.User va;
    public boolean vb;
    public boolean vc;
    public float vd;
    public mj1 w;
    public int w0;
    public boolean w1;
    public xb2 w2;
    public int w3;
    public final ArrayList w4;
    public int w5;
    public boolean w6;
    public int w7;
    public pkb w8;
    public boolean w9;
    public TLRPC.Chat wa;
    public boolean wb;
    public boolean wc;
    public float wd;
    public final y99 x;
    public int x0;
    public boolean x1;
    public cc2 x2;
    public StaticLayout x3;
    public final ArrayList x4;
    public int x5;
    public boolean x6;
    public boolean x7;
    public pkb x8;
    public boolean x9;
    public TLRPC.FileLocation xa;
    public boolean xb;
    public int xc;
    public final px1 xd;
    public boolean y;
    public int y0;
    public boolean y1;
    public byte y2;
    public hn y3;
    public va6 y4;
    public boolean y5;
    public boolean y6;
    public final Rect y7;
    public int y8;
    public float y9;
    public String ya;
    public final mm yb;
    public sb2 yc;
    public RectF yd;
    public int z0;
    public boolean z1;
    public CharSequence z2;
    public hn z3;
    public ArrayList z4;
    public String z5;
    public int z6;
    public boolean z7;
    public int z8;
    public float z9;
    public Object za;
    public c34 zb;
    public Drawable zc;
    public final Path zd;

    public wb2(Context context, int i, boolean z, rx6 rx6Var, vnb vnbVar) {
        super(context);
        boolean z2;
        this.h = true;
        this.x = new y99((byte) 2);
        k43 k43Var = k43.h;
        this.E = new fm0(0, this, k43Var, 380L, false);
        this.O = new x49(this);
        this.P = new dy4(this);
        this.Q = new fy4(this);
        this.D0 = new Rect();
        this.H0 = -1;
        this.I0 = -1;
        this.T0 = new int[4];
        this.J2 = new Drawable[2];
        this.K2 = new pb2[2];
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
        this.u4 = new m66(this);
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
        this.ub = new dc2(this);
        this.yb = new mm(200L, this, k43.g);
        this.Bb = new mb2(this, (byte) 0);
        this.Ib = new mb2(this, (byte) 1);
        this.Jb = new SparseArray();
        this.Xb = -1;
        this.Zb = new c34();
        this.fc = new ArrayList();
        this.gc = new Stack();
        this.hc = new Path();
        this.kc = new ib2(this, (byte) 11);
        this.lc = new ib2(this, (byte) 2);
        this.sc = false;
        this.Ac = new AtomicReference();
        this.Bc = -1L;
        this.Nc = false;
        this.Oc = new ib2(this, (byte) 0);
        this.Xc = true;
        this.ed = new Path();
        this.fd = new RectF();
        this.hd = -1;
        this.od = new RectF();
        this.pd = new RectF();
        this.sd = 1.0f;
        this.xd = new px1(Float.class, "animationOffsetX", (byte) 1);
        this.zd = new Path();
        this.a6 = i;
        this.cc = vnbVar;
        this.dc = z;
        this.ec = rx6Var;
        if (rx6Var == null) {
            this.ec = new rx6(context, (byte) 20);
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
        imageReceiver.q0(hl.L(21.0f));
        this.B7 = new rb0((vnb) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.T7 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.q0(hl.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.F7 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.q0(hl.L(26.1f));
        this.Z5 = lq3.q(i).k();
        this.X0 = new rb0((vnb) null);
        nl nlVar = new nl(this, this, (byte) 3);
        this.U0 = nlVar;
        nlVar.A1 = true;
        nlVar.m0 = true;
        nlVar.h1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.V0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.m0 = true;
        this.Q0 = new RadialProgress2(this, vnbVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.R0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(hl.L(15.0f));
        nb2 nb2Var = new nb2(this, this);
        this.D4 = nb2Var;
        nb2Var.h = this;
        ?? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.e = false;
        obj.f = false;
        obj.s = 1.0f;
        obj.t = 1.0f;
        mm mmVar = new mm(125L, 600L, k43Var);
        obj.v = mmVar;
        obj.w = 1.0f;
        mm mmVar2 = new mm(150L, k43.f);
        obj.B = mmVar2;
        obj.J = false;
        if (xy9.N == null) {
            xy9.N = new Paint(1);
            xy9.O = new Paint(1);
            Paint paint = xy9.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            xy9.O.setStyle(style);
        }
        this.E4 = obj;
        obj.k = this;
        obj.n = this;
        mmVar2.a = this;
        mmVar.a = this;
        this.F4 = new v7(this, (byte) 1);
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
        drawable2.n = vnbVar;
        drawable2.j = this;
        this.d3 = drawable2;
        setImportantForAccessibility(1);
    }

    public static boolean F2(sb2 sb2Var, float f, float f2) {
        RectF rectF = sb2Var.d;
        if (f >= rectF.left - hl.L(6.0f) && f <= rectF.right + hl.L(6.0f) && f2 >= rectF.top - hl.L(4.0f) && f2 <= rectF.bottom + hl.L(4.0f)) {
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
        return o0b.c(spannableStringBuilder, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, hl.L(1.0f), TextUtils.TruncateAt.END, i9, i4, true);
    }

    public static int M1(j47 j47Var) {
        int i = 0;
        if (j47Var != null) {
            if ((j47Var.l & 2) == 0) {
                i = hl.L(4.0f);
            }
            if ((j47Var.l & 1) == 0) {
                return hl.L(4.0f) + i;
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

    public static String N3(r47 r47Var, r47 r47Var2, boolean z, int i) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!r47Var.w1 && !r47Var.q4() && !r47.a4(r47Var.k) && !r47.c5(r47Var.k)) {
            if (!r47Var.r1 || r47Var.k.date != 2147483646) {
                if (r47Var.V != 0) {
                    return ob6.T(r47Var.V) + ", " + ob6.D0().o0().format(r47Var.V * 1000);
                } else if (r47Var.j2) {
                    return ob6.T(r47Var2.k.date) + ", " + ob6.D0().o0().format(r47Var2.k.date * 1000);
                } else if (z) {
                    if (uc7.s1(r47Var.K1).k4.f0.f) {
                        if (i == 0 && r47Var.Y2()) {
                            i = ConnectionsManager.getInstance(r47Var.K1).getCurrentTime();
                        }
                        return ob6.L(i);
                    }
                    return ob6.M0(2131751175, null) + " " + ob6.D0().o0().format(r47Var2.k.date * 1000);
                } else if (r47Var.n2 && (messageFwdHeader = (message = r47Var.k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(r47.n1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = r47Var.k.fwd_from;
                    int i2 = messageFwdHeader2.saved_date;
                    if (i2 == 0) {
                        i2 = messageFwdHeader2.date;
                    }
                    return ob6.O(i2);
                } else {
                    return ob6.D0().o0().format(r47Var2.k.date * 1000);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.S1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean W2() {
        return i86.e(2);
    }

    public static StaticLayout X2(int i, TextPaint textPaint, CharSequence charSequence) {
        SpannableStringBuilder O3 = O3(charSequence);
        if (O3 != null && i > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(O3, textPaint, i, truncateAt);
            int L = hl.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return o0b.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static void Y0(Canvas canvas, StaticLayout staticLayout, float f, float f2) {
        canvas.save();
        canvas.translate(f - staticLayout.getLineLeft(0), ((hl.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public static int[] Z1(Spannable spannable, CharacterStyle characterStyle) {
        int i;
        int i2;
        boolean z;
        rmb rmbVar;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof d8c) && (rmbVar = ((d8c) characterStyle).a) != null && (messageEntity = rmbVar.d) != null) {
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
        r47 r47Var;
        TLRPC.User user = this.va;
        if (user != null) {
            return wf3.c(user);
        }
        if (this.wa != null && (r47Var = this.Q5) != null && r47.B0(r47Var.k) != 1271266957 && this.wa.signature_profiles) {
            long n = wf3.n(this.Q5.k.from_id);
            int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            int i2 = this.a6;
            if (i >= 0) {
                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                if (X1 != null) {
                    return wf3.c(X1);
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
                if (M0 != null) {
                    return wf3.c(M0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.va;
        if (user != null) {
            return lbc.r(user);
        }
        TLRPC.Chat chat = this.wa;
        r47 r47Var = this.Q5;
        if (chat != null) {
            if (r47Var != null && r47.B0(r47Var.k) != 1271266957 && this.wa.signature_profiles) {
                long n = wf3.n(this.Q5.k.from_id);
                int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                int i2 = this.a6;
                if (i >= 0) {
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                    if (X1 != null) {
                        return lbc.r(X1);
                    }
                } else {
                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
                    if (M0 != null) {
                        return M0.title;
                    }
                }
            }
            return this.wa.title;
        } else if (r47Var != null && r47Var.q4()) {
            return this.Q5.S0;
        } else {
            return "DELETED";
        }
    }

    private Object getAuthorStatus() {
        r47 r47Var;
        TLRPC.User user = this.va;
        if (user != null) {
            Long i = lbc.i(user);
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
        } else if (this.wa != null && (r47Var = this.Q5) != null && r47.B0(r47Var.k) != 1271266957 && this.wa.signature_profiles) {
            long n = wf3.n(this.Q5.k.from_id);
            int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            int i3 = this.a6;
            if (i2 >= 0) {
                TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(n));
                if (X1 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = X1.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return lbc.i(X1);
            }
            TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-n));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = M0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.Ba = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(wf3.f(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private int getCommentButtonHeight() {
        float f;
        if (v2()) {
            return hl.L(24.0f);
        }
        if (I3()) {
            f = 41.3f;
        } else {
            f = 43.0f;
        }
        return hl.L(f);
    }

    private int getCompactHeaderColor() {
        return vm2.k(aob.v0(aob.Sa, this.cc), aob.v0(aob.ua, this.cc));
    }

    private int getCompactInShift() {
        if (v2()) {
            return (hl.L(16.0f) - hl.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactNameTimeWidth() {
        int i;
        if (y2() && (i = this.M9) > 0) {
            return hl.L(6.0f) + i;
        }
        return 0;
    }

    private float getCompactNameTimeX() {
        float compactLeft = getCompactLeft();
        if (this.x9) {
            compactLeft += getNameAvatarOffset();
        }
        if (this.Aa != 0) {
            compactLeft += hl.L(20.0f);
        }
        if (this.h9 != null) {
            compactLeft += this.i9;
        }
        if (this.za != null && this.R6 <= 0) {
            compactLeft += hl.L(20.0f);
        }
        if (this.m9 != null) {
            int i = 0;
            float lineWidth = this.m9.getLineWidth(0) + hl.L(8.0f);
            if (this.j9) {
                i = hl.L(6.0f);
            }
            compactLeft += lineWidth + i;
        }
        return compactLeft + hl.L(6.0f);
    }

    private float getCompactNameTimeY() {
        float f;
        if (this.J) {
            f = 9.0f;
        } else {
            f = 10.0f;
        }
        float L = hl.L(f) + this.xc + this.ub.k0;
        StaticLayout staticLayout = this.h9;
        if (staticLayout != null && this.L9 != null && staticLayout.getLineCount() > 0 && this.L9.getLineCount() > 0) {
            L += this.h9.getLineBaseline(0) - this.L9.getLineBaseline(0);
        }
        m47 m47Var = this.L;
        if (m47Var != null) {
            l47 l47Var = m47Var.m;
            if (l47Var.j) {
                return (l47Var.f - getTranslationY()) + L;
            }
        }
        return L;
    }

    private int getCompactSideButtonColumn() {
        r47 r47Var;
        if (this.Kb && this.R8 != 0 && (r47Var = this.Q5) != null && r47Var.S4()) {
            return hl.L(40.0f);
        }
        return 0;
    }

    private float getCompactSideMenuShift() {
        if (v2()) {
            return hl.L(71.0f) * this.Z6;
        }
        return 0.0f;
    }

    private int getCompactSideMenuWidth() {
        if (this.Y6) {
            return hl.L(71.0f);
        }
        return 0;
    }

    private iv1 getDraftMessageMeasureController() {
        rb2 rb2Var = this.eb;
        if (rb2Var != null) {
            return rb2Var.S();
        }
        return null;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        ColorMatrixColorFilter colorMatrixColorFilter = this.W0;
        if (colorMatrixColorFilter == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            hl.l2(colorMatrix, 0.9f);
            hl.i(colorMatrix, 0.6f);
            ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
            this.W0 = colorMatrixColorFilter2;
            return colorMatrixColorFilter2;
        }
        return colorMatrixColorFilter;
    }

    private wm2 getForwardVerifiedSpan() {
        wm2 wm2Var = this.t1;
        if (wm2Var == null) {
            zm2 zm2Var = new zm2(getContext().getResources().getDrawable(2131232815).mutate(), getContext().getResources().getDrawable(2131232816).mutate());
            zm2Var.x = true;
            wm2Var = new wm2(0, zm2Var);
            this.t1 = wm2Var;
            wm2Var.d = false;
        }
        zm2 zm2Var2 = (zm2) wm2Var.c;
        Drawable drawable = zm2Var2.a;
        int v0 = aob.v0(aob.z9, this.cc);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
        zm2Var2.b.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.A9, this.cc), mode));
        this.t1.c((int) (aob.X2.getTextSize() * 0.95f));
        return this.t1;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.t1) {
            parentWidth = this.L0;
        }
        if (!hl.E && hl.O1()) {
            if (!hl.N1() || getResources().getConfiguration().orientation == 2) {
                return parentWidth - hl.k1(parentWidth, 0, 0);
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
        return hl.L(f);
    }

    private int getNameHeight() {
        if (this.x9 && !w2()) {
            if (this.m9 == null) {
                return hl.L(31.0f);
            }
            return hl.L(37.66f);
        }
        return (int) (aob.W2.getTextSize() + hl.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f;
        float f2;
        dc2 dc2Var = this.ub;
        boolean z = dc2Var.Q2;
        boolean z2 = this.x9;
        float f3 = 0.0f;
        if (z) {
            f = hl.T1(!z2, z2, dc2Var.L1);
        } else if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float textSize = aob.W2.getTextSize() + hl.L(5.0f);
        if (this.m9 == null) {
            f2 = 31.0f;
        } else {
            f2 = 35.0f;
        }
        float L = hl.L(f2);
        if (!w2()) {
            f3 = f;
        }
        return hl.R1(textSize, L, f3);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        m47 m47Var = this.L;
        if (m47Var != null && !m47Var.d.isEmpty() && (messageReplies = ((r47) this.L.d.get(0)).k.replies) != null) {
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
        vnb vnbVar = this.cc;
        if (vnbVar == null) {
            return 0;
        }
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.N3()) {
            i = aob.Pc;
        } else {
            i = aob.sa;
        }
        return vnbVar.h(i);
    }

    private float getUseTranscribeButtonProgress() {
        dc2 dc2Var = this.ub;
        boolean z = dc2Var.o1;
        boolean z2 = this.I4;
        if (z) {
            float f = dc2Var.L1;
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

    public static tb2 x0(int i, String str, int i2, float f) {
        tb2 tb2Var = new tb2();
        tb2Var.a = i;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, aob.M2, i2, TextUtils.TruncateAt.END), aob.M2, hl.L(2.0f) + i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        tb2Var.d = staticLayout;
        tb2Var.b = f;
        if (staticLayout.getLineCount() > 0) {
            tb2Var.c = ((float) (tb2Var.b - Math.ceil(tb2Var.d.getLineWidth(0)))) / 2.0f;
            tb2Var.c -= (int) tb2Var.d.getLineLeft(0);
        }
        return tb2Var;
    }

    public final void A() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.A():void");
    }

    public final void A0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] t = in5.z().t(xb4.B(document));
        if (t != null) {
            z0(t[0], t[1]);
        } else {
            z0(this.Q5.H0, document.size);
        }
    }

    public void A1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.A1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean A2() {
        if (((isPressed() && this.D6) || ((!this.D6 && this.w6) || this.x6)) && !M3() && !n2()) {
            r47 r47Var = this.Q5;
            if (r47Var == null || !r47Var.t1) {
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
                i5 = aob.Ob;
            } else {
                i5 = aob.Bd;
            }
            v0 = aob.v0(i5, this.cc);
        } else {
            if (i == 0) {
                if (this.E5) {
                    if (this.Q5.O3()) {
                        i3 = aob.Ib;
                    } else {
                        i3 = aob.od;
                    }
                    v0 = aob.v0(i3, this.cc);
                } else {
                    ab9 ab9Var = this.o8;
                    if (ab9Var != null) {
                        v0 = ab9Var.h();
                    } else {
                        ab9 ab9Var2 = this.q8;
                        if (ab9Var2 != null) {
                            v0 = ab9Var2.h();
                        }
                    }
                }
            }
            if (this.Q5.O3()) {
                i2 = aob.Ob;
            } else {
                i2 = aob.Bd;
            }
            v0 = aob.v0(i2, this.cc);
        }
        Drawable[] drawableArr = this.J2;
        Drawable drawable = drawableArr[i];
        if (drawable == null) {
            pb2 pb2Var = new pb2(this, i);
            pb2[] pb2VarArr = this.K2;
            pb2VarArr[i] = pb2Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.Q5.O3()) {
                i4 = aob.Ob;
            } else {
                i4 = aob.Bd;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{aob.v0(i4, this.cc) & 436207615}), null, pb2VarArr[i]);
            drawableArr[i] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            aob.F1(drawable, v0 & 436207615, true);
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
        dc2 dc2Var;
        int i7;
        float f6;
        boolean z4;
        float f7;
        boolean z5;
        int i8;
        wb2 wb2Var;
        String str;
        float f8;
        float L2;
        dc2 dc2Var2;
        boolean z6;
        float f9;
        int i9;
        dc2 dc2Var3;
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
        dc2 dc2Var4;
        float f14;
        float f15;
        boolean z15;
        int i13;
        boolean z16;
        r47 r47Var;
        TextPaint textPaint;
        int i14;
        int i15;
        wb2 wb2Var2 = this;
        Canvas canvas2 = canvas;
        if (((!wb2Var2.R9 || wb2Var2.N) && wb2Var2.I3()) || staticLayout == null) {
            return;
        }
        r47 r47Var2 = wb2Var2.Q5;
        if ((!r47Var2.Z || wb2Var2.M == null) && (i = r47Var2.D) != 16) {
            if (i == 5) {
                TextPaint textPaint2 = aob.T2;
                if (wb2Var2.v2()) {
                    i14 = wb2Var2.Q5.O3() ? aob.jc : aob.ee;
                } else {
                    i14 = aob.Zc;
                }
                int v0 = aob.v0(i14, wb2Var2.cc);
                boolean A2 = wb2Var2.A2();
                r47 r47Var3 = wb2Var2.Q5;
                if (A2) {
                    i15 = r47Var3.O3() ? aob.ec : aob.fe;
                } else {
                    i15 = r47Var3.O3() ? aob.jc : aob.ee;
                }
                textPaint2.setColor(vm2.f(wb2Var2.getVideoTranscriptionProgress(), v0, aob.v0(i15, wb2Var2.cc)));
            } else {
                boolean I3 = wb2Var2.I3();
                r47 r47Var4 = wb2Var2.Q5;
                if (I3) {
                    if (r47Var4.O5()) {
                        aob.T2.setColor(aob.v0(aob.Zc, wb2Var2.cc));
                    } else {
                        aob.T2.setColor(aob.v0(aob.be, wb2Var2.cc));
                    }
                } else if (r47Var4.O3()) {
                    aob.T2.setColor(aob.v0(z2 ? aob.ec : aob.jc, wb2Var2.cc));
                } else {
                    aob.T2.setColor(aob.v0(z2 ? aob.fe : aob.ee, wb2Var2.cc));
                }
            }
            if (wb2Var2.y2()) {
                aob.T2.setColor(aob.v0(z2 ? aob.de : aob.ce, wb2Var2.cc));
            }
            float f16 = wb2Var2.getTransitionParams().K1 ? wb2Var2.getTransitionParams().L1 * f : f;
            if (f16 != 1.0f) {
                aob.T2.setAlpha((int) (textPaint.getAlpha() * f16));
            }
            canvas2.save();
            if (wb2Var2.K && !wb2Var2.I3() && !wb2Var2.y2()) {
                canvas2.translate(0.0f, hl.L(2.0f));
            }
            float f17 = wb2Var2.e7;
            dc2 dc2Var5 = wb2Var2.ub;
            if (dc2Var5.x0) {
                f17 += dc2Var5.j0;
            }
            m47 m47Var = wb2Var2.L;
            if (m47Var == null || !m47Var.m.j) {
                f4 = f2;
            } else {
                f17 -= wb2Var2.getTranslationY();
                f4 = f2 + wb2Var2.L.m.g;
            }
            float f18 = f17;
            float f19 = f4;
            if (wb2Var2.K && wb2Var2.I3()) {
                f18 += hl.L(1.0f);
            }
            float f20 = f18;
            if (dc2Var5.x0) {
                float f21 = wb2Var2.wd;
                f4 += f21;
                f19 += f21;
            }
            float f22 = f4;
            boolean N5 = wb2Var2.Q5.N5();
            x49 x49Var = wb2Var2.O;
            if (N5) {
                x49Var.getClass();
            }
            if (dc2Var5.U0) {
                f19 = qu6.B(1.0f, dc2Var5.L1, dc2Var5.Z0, f19);
            }
            float f23 = f19;
            boolean I32 = wb2Var2.I3();
            RectF rectF2 = wb2Var2.c4;
            nl nlVar = wb2Var2.U0;
            if (I32) {
                if (wb2Var2.x7) {
                    i10 = wb2Var2.v2() ? wb2Var2.getCommentButtonHeight() : hl.L(41.3f);
                } else {
                    i10 = 0;
                }
                int i16 = -i10;
                if (wb2Var2.Q5.O5()) {
                    c22 = wb2Var2.c2("paintChatActionBackground");
                } else {
                    c22 = wb2Var2.c2("paintChatTimeBackground");
                }
                int alpha = c22.getAlpha();
                float f24 = f16;
                aob.T2.setAlpha((int) (wb2Var2.k4 * 255.0f * f24));
                r47 r47Var5 = wb2Var2.Q5;
                if (r47Var5 == null || r47Var5.D != 4) {
                    f11 = f20;
                    f12 = f24;
                } else {
                    float f25 = nlVar.G() ? 1.0f : nlVar.i1;
                    if (!nlVar.E()) {
                        f25 = 0.0f;
                    }
                    f11 = f20;
                    f12 = hl.R1(0.35f, 1.0f, f25);
                }
                r47 r47Var6 = wb2Var2.Q5;
                if (r47Var6 != null && r47Var6.B0) {
                    ul ulVar = wb2Var2.m0;
                    f12 *= ulVar == null ? 0.0f : ulVar.e();
                }
                c22.setAlpha((int) xnb.C(alpha, wb2Var2.k4, f12, 0.6f));
                if (wb2Var2.g4()) {
                    int L4 = hl.L(8.0f);
                    int i17 = xea.U0;
                    if (i17 > 2) {
                        i17 -= 2;
                    }
                    L3 = Math.min(L4, hl.L(i17));
                    z13 = xea.U0 >= 10;
                    i2 = 2;
                } else {
                    byte b = wb2Var2.M1;
                    if (b != 7 && b != 6 && wb2Var2.Q5.D != 19) {
                        int[] iArr = nlVar.X0;
                        i2 = 2;
                        L3 = Math.min(hl.L(8.0f), Math.max(iArr[2], iArr[3]));
                        z13 = xea.U0 >= 10;
                    } else {
                        i2 = 2;
                        int L5 = hl.L(4.0f);
                        r47 r47Var7 = wb2Var2.Q5;
                        L3 = L5 + ((r47Var7 == null || !r47Var7.M2()) ? 0 : hl.L(8.0f));
                        z13 = false;
                    }
                }
                r47 r47Var8 = wb2Var2.Q5;
                float L6 = f22 + ((r47Var8 == null || !r47Var8.M2()) ? 0 : hl.L(-6.0f));
                if (wb2Var2.j0 != 0) {
                    L6 -= hl.L(18.0f);
                }
                float L7 = L6 - hl.L(z13 ? 6.0f : 4.0f);
                r47 r47Var9 = wb2Var2.Q5;
                float L8 = (r47Var9 == null || !r47Var9.M2()) ? 0.0f : hl.L(2.0f);
                float f26 = f12;
                float f27 = L6;
                if (wb2Var2.M1 != 7 || ((r47Var = wb2Var2.Q5) != null && r47Var.f4())) {
                    photoBottom = wb2Var2.getPhotoBottom() + wb2Var2.w0;
                } else {
                    photoBottom = f11 - ((1.0f - wb2Var2.getVideoTranscriptionProgress()) * (x49Var.i(dc2Var5.L1) + hl.L(wb2Var2.K ? 4.0f : 5.0f)));
                }
                float f28 = photoBottom;
                float L9 = f28 - hl.L(23.0f);
                float max = Math.max(hl.L(17.0f), aob.T2.getTextSize() + hl.L(5.0f));
                float f29 = L7 - L8;
                float f30 = L8 + L7 + f3;
                int i18 = z13 ? 12 : 8;
                if (wb2Var2.Q5.O3()) {
                    i11 = i18;
                    i12 = (wb2Var2.Q5.D == 19 ? 4 : 0) + 20;
                } else {
                    i11 = i18;
                    i12 = 0;
                }
                rectF2.set(f29, L9, f30 + hl.L(i11 + i12), L9 + max);
                hd5 hd5Var = wb2Var2.X5;
                if (hd5Var != null) {
                    float f31 = L3;
                    canvas2.save();
                    Path path = hd5Var.t;
                    path.rewind();
                    path.addRoundRect(rectF2, f31, f31, Path.Direction.CW);
                    canvas2.clipPath(path);
                    canvas2.drawColor(1073741824);
                    canvas2.restore();
                } else if (!r47.a4(wb2Var2.Q5.k)) {
                    if (wb2Var2.Q5.t2() && wb2Var2.Q5.D != 5) {
                        Path path2 = wb2Var2.B4;
                        path2.rewind();
                        float f32 = L3;
                        path2.addRoundRect(rectF2, f32, f32, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path2);
                        ImageReceiver imageReceiver = wb2Var2.Q5.l5() ? nlVar : wb2Var2.V0;
                        float alpha2 = imageReceiver.getAlpha();
                        imageReceiver.setAlpha(0.5f * alpha2);
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(alpha2);
                        canvas2.restore();
                        Paint c23 = wb2Var2.c2("paintChatTimeBackground");
                        int alpha3 = c23.getAlpha();
                        c23.setAlpha((int) (alpha3 * wb2Var2.l4 * 0.4f));
                        canvas2.drawRoundRect(rectF2, f32, f32, c23);
                        c23.setAlpha(alpha3);
                    } else {
                        wb2Var2.C();
                        float f33 = L3;
                        canvas2.drawRoundRect(rectF2, f33, f33, c22);
                        if (c22 == wb2Var2.c2("paintChatActionBackground") && wb2Var2.i2()) {
                            int alpha4 = aob.h2.getAlpha();
                            aob.h2.setAlpha((int) (alpha4 * wb2Var2.k4 * f26));
                            canvas2.drawRoundRect(rectF2, f33, f33, aob.h2);
                            aob.h2.setAlpha(alpha4);
                        }
                    }
                }
                c22.setAlpha(alpha);
                float f34 = -staticLayout.getLineLeft(0);
                r47 r47Var10 = wb2Var2.Q5;
                float L10 = f34 + ((r47Var10 == null || !r47Var10.M2()) ? 0 : hl.L(-6.0f));
                if (wb2Var2.Q5.N5()) {
                    x49Var.getClass();
                }
                if ((!xc2.T(wb2Var2.wa) || wb2Var2.wa.megagroup) && (wb2Var2.Q5.k.flags & 1024) == 0 && wb2Var2.sa == null && !wb2Var2.q6) {
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
                    float lineWidth = (wb2Var2.M9 - staticLayout.getLineWidth(0)) + L10;
                    x49Var.getClass();
                    int b2 = dc2Var5.b();
                    int i19 = dc2Var5.b2;
                    if (i19 >= 0 && i19 != b2 && !wb2Var2.Fb) {
                        wb2Var2.C0(i19, b2, z);
                    }
                    boolean z17 = wb2Var2.Fb;
                    if (z17) {
                        b2 = wb2Var2.Cb;
                    }
                    boolean z18 = (b2 & 4) != 0;
                    boolean z19 = (b2 & 8) != 0;
                    if (z17) {
                        int i20 = wb2Var2.Db;
                        if ((i20 & 4) != 0) {
                            i13 = i20;
                            z16 = true;
                        } else {
                            i13 = i20;
                            z16 = false;
                        }
                        boolean z20 = (i13 & 8) != 0;
                        float f35 = i16;
                        dc2Var4 = dc2Var5;
                        f14 = lineWidth;
                        rectF = rectF2;
                        float f36 = f11;
                        c = 6;
                        c3 = 4;
                        z14 = false;
                        i5 = i16;
                        c2 = 7;
                        wb2Var2.T0(canvas2, z16, z20, f36, f24, f35, f27, 1.0f - wb2Var2.Eb, z2);
                        boolean z21 = z16;
                        boolean z22 = z20;
                        boolean z23 = z18;
                        boolean z24 = z19;
                        wb2Var2.T0(canvas, z23, z24, f36, f24, f35, f27, wb2Var2.Eb, z2);
                        f20 = f36;
                        f15 = f27;
                        z15 = z23;
                        f16 = f24;
                        if (!wb2Var2.Q5.O3()) {
                            if (!z21 && !z22) {
                                wb2Var2.D1(canvas, f16, f35, f15, 1.0f - wb2Var2.Eb, z2);
                            }
                            if (!z15 && !z24) {
                                wb2Var2.D1(canvas, f16, f35, f15, wb2Var2.Eb, z2);
                            }
                        }
                    } else {
                        dc2Var4 = dc2Var5;
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
                        if (!wb2Var2.Q5.O3() && !z25 && !z26) {
                            wb2Var2.D1(canvas, f24, i5, f27, 1.0f, z2);
                        }
                        wb2Var2 = this;
                        wb2Var2.T0(canvas, z25, z26, f37, f24, i5, f27, 1.0f, z2);
                        f20 = f37;
                        f15 = f27;
                        z15 = z25;
                        f16 = f24;
                    }
                    if (wb2Var2.Q5.O3()) {
                        canvas2 = canvas;
                        wb2Var2.D1(canvas2, f16, i5, f15, 1.0f, z2);
                    } else {
                        canvas2 = canvas;
                    }
                    dc2Var5 = dc2Var4;
                    dc2Var5.b2 = dc2Var4.b();
                    if (z15 && z && wb2Var2.getParent() != null) {
                        ((View) wb2Var2.getParent()).invalidate();
                    }
                    f13 = f14;
                }
                canvas2.save();
                float f38 = f23 + f13;
                wb2Var2.J9 = f38;
                float L11 = (f28 - hl.L(7.3f)) - staticLayout.getHeight();
                wb2Var2.K9 = L11;
                canvas2.translate(f38, L11);
                npa.f(canvas2, staticLayout);
                canvas2.restore();
                aob.T2.setAlpha(255);
                z3 = z13;
                i8 = z14;
            } else {
                rectF = rectF2;
                i2 = 2;
                c = 6;
                c2 = 7;
                c3 = 4;
                if (wb2Var2.Q5.q4()) {
                    i4 = -hl.L(48.0f);
                    if (wb2Var2.c7) {
                        i4 -= hl.L(4.0f);
                    }
                } else {
                    if (wb2Var2.x7) {
                        i3 = wb2Var2.v2() ? wb2Var2.getCommentButtonHeight() : hl.L(43.0f);
                    } else {
                        i3 = 0;
                    }
                    i4 = -i3;
                }
                i5 = i4;
                if (wb2Var2.y2()) {
                    L = wb2Var2.getCompactNameTimeY();
                } else {
                    L = ((f20 - hl.L((wb2Var2.G || wb2Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i5;
                }
                float f39 = -staticLayout.getLineLeft(0);
                if (wb2Var2.Q5.N5()) {
                    x49Var.getClass();
                }
                if ((!xc2.T(wb2Var2.wa) || wb2Var2.wa.megagroup) && (wb2Var2.Q5.k.flags & 1024) == 0 && wb2Var2.sa == null && !dc2Var5.G && !wb2Var2.q6 && !dc2Var5.C) {
                    i6 = 0;
                    f5 = L;
                } else {
                    float lineWidth2 = (f3 - staticLayout.getLineWidth(0)) + f39;
                    x49Var.getClass();
                    int b3 = dc2Var5.b();
                    int i21 = dc2Var5.b2;
                    if (i21 >= 0 && i21 != b3 && !wb2Var2.Fb) {
                        wb2Var2.C0(i21, b3, z);
                    }
                    boolean z27 = wb2Var2.Fb;
                    if (z27) {
                        b3 = wb2Var2.Cb;
                    }
                    boolean z28 = (b3 & 4) != 0;
                    boolean z29 = (b3 & 8) != 0;
                    if (z27) {
                        int i22 = wb2Var2.Db;
                        boolean z30 = (i22 & 4) != 0;
                        if ((i22 & 8) != 0) {
                            f7 = L;
                            z5 = true;
                        } else {
                            f7 = L;
                            z5 = false;
                        }
                        float f40 = i5;
                        dc2Var = dc2Var5;
                        i7 = 0;
                        f5 = f7;
                        float f41 = f16;
                        boolean z31 = z30;
                        wb2Var2.T0(canvas2, z31, z5, f20, f41, f40, f22, 1.0f - wb2Var2.Eb, z2);
                        boolean z32 = z5;
                        boolean z33 = z28;
                        boolean z34 = z29;
                        wb2Var2.T0(canvas, z33, z34, f20, f41, f40, f22, wb2Var2.Eb, z2);
                        f20 = f20;
                        f6 = f22;
                        z4 = z33;
                        f16 = f41;
                        if (!wb2Var2.Q5.O3()) {
                            if (!z31 && !z32) {
                                wb2Var2.D1(canvas, f16, f40, f6, 1.0f - wb2Var2.Eb, z2);
                            }
                            if (!z4 && !z34) {
                                wb2Var2.D1(canvas, f16, f40, f6, wb2Var2.Eb, z2);
                            }
                        }
                    } else {
                        dc2Var = dc2Var5;
                        i7 = 0;
                        boolean z35 = z28;
                        boolean z36 = z29;
                        f5 = L;
                        if (!wb2Var2.Q5.O3() && !z35 && !z36) {
                            wb2Var2.D1(canvas, f16, i5, f22, 1.0f, z2);
                        }
                        wb2Var2 = this;
                        float f42 = f16;
                        wb2Var2.T0(canvas, z35, z36, f20, f42, i5, f22, 1.0f, z2);
                        f20 = f20;
                        f6 = f22;
                        z4 = z35;
                        f16 = f42;
                    }
                    if (wb2Var2.Q5.O3()) {
                        canvas2 = canvas;
                        wb2Var2.D1(canvas2, f16, i5, f6, 1.0f, z2);
                    } else {
                        canvas2 = canvas;
                    }
                    dc2Var5 = dc2Var;
                    dc2Var5.b2 = dc2Var.b();
                    if (z4 && z && wb2Var2.getParent() != null) {
                        ((View) wb2Var2.getParent()).invalidate();
                    }
                    f39 = lineWidth2;
                    i6 = i7;
                }
                canvas2.save();
                if (dc2Var5.U0 && dc2Var5.L1 != 1.0f) {
                    if (dc2Var5.V0 != null) {
                        canvas2.translate(f23 + f39, f5);
                        int alpha5 = aob.T2.getAlpha();
                        aob.T2.setAlpha((int) (alpha5 * dc2Var5.L1));
                        dc2Var5.V0.draw(canvas2);
                        aob.T2.setAlpha(alpha5);
                        npa.f(canvas2, dc2Var5.W0);
                    } else {
                        int alpha6 = aob.T2.getAlpha();
                        canvas2.save();
                        canvas2.translate(dc2Var5.h1 + f39, f5);
                        float f43 = alpha6;
                        aob.T2.setAlpha((int) ((1.0f - dc2Var5.L1) * f43));
                        npa.f(canvas2, dc2Var5.W0);
                        canvas2.restore();
                        canvas2.translate(f23 + f39, f5);
                        aob.T2.setAlpha((int) (f43 * dc2Var5.L1));
                        npa.f(canvas2, staticLayout);
                        aob.T2.setAlpha(alpha6);
                    }
                } else {
                    float f44 = f23 + f39;
                    wb2Var2.J9 = f44;
                    wb2Var2.K9 = f5;
                    canvas2.translate(f44, f5);
                    npa.f(canvas2, staticLayout);
                }
                canvas2.restore();
                z3 = i6 == 1 ? 1 : 0;
                i8 = i6;
            }
            int i23 = i5;
            if (wb2Var2.Q5.O3()) {
                int b4 = dc2Var5.b();
                int i24 = dc2Var5.b2;
                if (i24 >= 0 && i24 != b4 && !wb2Var2.Fb) {
                    wb2Var2.C0(i24, b4, z);
                }
                if (wb2Var2.Fb) {
                    b4 = wb2Var2.Cb;
                }
                int i25 = (b4 & 1) != 0 ? true : i8;
                int i26 = (b4 & 2) != 0 ? true : i8;
                if ((b4 & 4) != 0) {
                    dc2Var2 = dc2Var5;
                    z6 = true;
                } else {
                    dc2Var2 = dc2Var5;
                    z6 = i8;
                }
                boolean z37 = (b4 & 8) != 0 ? true : i8;
                if (wb2Var2.Uc != 0.0f) {
                    canvas2.save();
                    f9 = 0.0f;
                    canvas2.translate(0.0f, wb2Var2.Uc);
                    i9 = 1;
                } else {
                    f9 = 0.0f;
                    i9 = i8;
                }
                if (wb2Var2.Fb) {
                    int i27 = wb2Var2.Db;
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
                        dc2Var3 = dc2Var2;
                        f8 = f9;
                        z6 = z9;
                        str = "paintChatTimeBackground";
                        wb2Var2.z1(canvas2, i25, z7, z6, z11, f10, z3, i23, f20, wb2Var2.Eb, true, z2);
                    } else {
                        dc2Var3 = dc2Var2;
                        f8 = f9;
                        boolean z39 = z7;
                        boolean z40 = i25;
                        str = "paintChatTimeBackground";
                        float f45 = i23;
                        wb2Var2.z1(canvas, z8, z38, z10, z12, f10, z3, f45, f20, 1.0f - wb2Var2.Eb, false, z2);
                        z6 = z9;
                        wb2Var2.z1(canvas, z40, z39, z6, z11, f10, z3, f45, f20, wb2Var2.Eb, false, z2);
                    }
                    wb2Var = this;
                    canvas2 = canvas;
                } else {
                    dc2Var3 = dc2Var2;
                    f8 = f9;
                    str = "paintChatTimeBackground";
                    canvas2 = canvas;
                    z1(canvas2, i25, i26, z6, z37, f16, z3, i23, f20, 1.0f, false, z2);
                    wb2Var = this;
                }
                if (i9 != 0) {
                    canvas2.restore();
                }
                dc2Var3.b2 = dc2Var3.b();
                if (z && z6 && wb2Var.getParent() != null) {
                    ((View) wb2Var.getParent()).invalidate();
                }
            } else {
                wb2Var = wb2Var2;
                str = "paintChatTimeBackground";
                f8 = 0.0f;
            }
            canvas2.restore();
            if (wb2Var.ja != null) {
                if (wb2Var.ha == f8 || wb2Var.ia == f8) {
                    wb2Var.F();
                }
                Path path3 = wb2Var.na;
                path3.rewind();
                RectF rectF3 = hl.P;
                rectF3.set(nlVar.L0, nlVar.M0, nlVar.w(), nlVar.x());
                int[] iArr2 = nlVar.X0;
                float f46 = iArr2[i8];
                float[] fArr = wb2Var.oa;
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
                rectF3.set(wb2Var.ha - hl.L(12.0f), wb2Var.ia - hl.L(8.0f), wb2Var.ha + aob.L3.getIntrinsicWidth() + hl.L(14.0f) + wb2Var.ja.getWidth() + hl.L(12.0f), wb2Var.ia + wb2Var.ja.getHeight() + hl.L(8.0f));
                path3.addRoundRect(rectF3, hl.L(32.0f), hl.L(32.0f), direction);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                if (wb2Var.ca == null) {
                    npa npaVar = wb2Var.ma;
                    if (npaVar == null) {
                        npaVar = new npa();
                        wb2Var.ma = npaVar;
                    }
                    npaVar.h(vm2.o(-1, 82));
                    wb2Var.ma.setBounds((int) nlVar.L0, (int) nlVar.M0, (int) nlVar.w(), (int) nlVar.x());
                    wb2Var.ma.draw(canvas2);
                }
                wb2Var.invalidate();
                canvas2.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, wb2Var.getWidth(), wb2Var.getHeight(), (int) (wb2Var.ga * 255.0f), 31);
                int alpha7 = aob.i2.getAlpha();
                aob.i2.setAlpha((int) (alpha7 * 0.7f));
                canvas.drawRoundRect(rectF3, hl.L(32.0f), hl.L(32.0f), aob.i2);
                aob.i2.setAlpha(alpha7);
                canvas.translate(wb2Var.ha + hl.L(4.0f), wb2Var.ia);
                Drawable drawable = aob.L3;
                int i28 = i8;
                drawable.setBounds(i28, i28, drawable.getIntrinsicWidth(), aob.L3.getIntrinsicHeight());
                aob.L3.draw(canvas);
                canvas.translate(aob.L3.getIntrinsicWidth() + hl.L(6.0f), f8);
                npa.f(canvas, wb2Var.ja);
                canvas.restore();
                if (wb2Var.q2 != null && nlVar.R0 && wb2Var.A2 == 0) {
                    int i29 = xea.U0;
                    int i30 = i2;
                    if (i29 > i30) {
                        L2 = hl.L(i29 - i30);
                        z3 = xea.U0 < 10 ? i28 : true;
                    } else {
                        L2 = hl.L(i29);
                    }
                    int L12 = (int) (nlVar.L0 + hl.L(9.0f));
                    int L13 = (int) (nlVar.M0 + hl.L(6.0f));
                    RectF rectF4 = rectF;
                    rectF4.set(L12 - hl.L(4.0f), L13 - hl.L(1.5f), hl.L(z3 ? 2.0f : f8) + hl.L(4.0f) + wb2Var.Z1 + L12, hl.L(1.5f) + wb2Var.q2.getHeight() + L13);
                    canvas.drawRoundRect(rectF4, L2, L2, wb2Var.c2(str));
                    canvas.save();
                    if (!z3) {
                        i30 = i28;
                    }
                    canvas.translate(L12 + i30, L13);
                    npa.f(canvas, wb2Var.q2);
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
        t37 t37Var;
        this.L0 = i;
        this.M0 = i2;
        this.ob = i2;
        if ((this.Q5 != null && i2() && this.Q5.O5()) || ((t37Var = this.L6) != null && t37Var.a != null)) {
            invalidate();
        }
    }

    public final void C() {
        D(getX(), this.nb, getMeasuredWidth(), this.ob);
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
        this.Gb.setInterpolator(k43.f);
        this.Db = i;
        this.Cb = i2;
        this.Gb.addUpdateListener(new e20((byte) 2, this, z));
        this.Gb.addListener(new z7((byte) 18, this, z));
        this.Fb = true;
        this.Gb.start();
    }

    public final void C1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.C1(android.graphics.Canvas, int):void");
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
            Q();
            if (z) {
                invalidate();
            }
        }
        nl nlVar = this.U0;
        float f4 = f - nlVar.M0;
        float measuredHeight = f2 - (getMeasuredHeight() - nlVar.x());
        float f5 = nlVar.O0;
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
        nlVar.B1 = z2;
    }

    public final void D(float f, float f2, int i, int i2) {
        vnb vnbVar = this.cc;
        int i3 = this.W;
        if (vnbVar != null) {
            vnbVar.b(f, f2 + i3 + this.g0 + this.i0, i, i2);
        } else {
            aob.q(f, f2 + i3 + this.g0 + this.i0, i, i2);
        }
    }

    public final void D0() {
        r47 r47Var;
        rb2 rb2Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.Q5.t2() && !this.Q5.l5()) {
            r47 r47Var2 = this.Q5;
            if (!r47Var2.O0) {
                if (this.eb != null && r47Var2.o4()) {
                    this.eb.U0(this);
                    return;
                } else {
                    L3(this.h1, this.i1);
                    return;
                }
            }
        }
        r47 r47Var3 = this.Q5;
        int i = r47Var3.D;
        int i2 = 0;
        if (i == 20) {
            TLRPC.Message message = r47Var3.k;
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
                            this.eb.U1(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i != 1 && !r47Var3.M2()) {
            r47 r47Var4 = this.Q5;
            int i3 = r47Var4.D;
            if (i3 == 12) {
                long j = r47.n1(r47Var4.k).user_id;
                if (j != 0) {
                    user = uc7.s1(this.a6).X1(Long.valueOf(j));
                } else {
                    user = null;
                }
                this.eb.W(this, user, this.h1, this.i1);
            } else if (i3 == 5) {
                if (this.O3 != -1) {
                    E0(false);
                } else if (MediaController.z().H(this.Q5) && !MediaController.z().G()) {
                    MediaController.z().U(this.Q5, true);
                } else {
                    this.eb.j2(this, this.Q5);
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
                this.eb.q0(this, this.h1, this.i1, false);
            } else if (this.M1 != 4 && !r47Var4.D2(true)) {
                r47 r47Var5 = this.Q5;
                int i5 = r47Var5.D;
                if (i5 != 4 && i5 != 17 && i5 != 23 && i5 != 24) {
                    byte b = this.M1;
                    if (b == 1) {
                        if (this.O3 == -1) {
                            this.eb.q0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (r47Var5.a1 != null) {
                        rb2 rb2Var2 = this.eb;
                        if (rb2Var2 != null) {
                            rb2Var2.q0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (b == 2) {
                        if (this.O3 == -1 && (webPage = r47.n1(r47Var5.k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.eb.t1(this.Q5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                m01.u(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.U1) {
                        if (this.O3 == -1) {
                            this.eb.q0(this, this.h1, this.i1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (rb2Var = this.eb) != null) {
                        if (i5 == 16) {
                            rb2Var.v(this, 0.0f, 0.0f);
                            return;
                        } else {
                            rb2Var.a2(this, this.S3, this.T3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.eb.q0(this, this.h1, this.i1, false);
            } else if (this.O3 != -1 && (!this.z1 || (!this.H5 && (((r47Var = this.Q5) == null || !r47Var.D2(true)) && (!xea.x0 || !this.C1))))) {
                if (this.z1) {
                    E0(true);
                    return;
                }
                int i6 = this.O3;
                if (i6 == 0 || i6 == 3) {
                    E0(false);
                }
            } else {
                this.eb.q0(this, this.h1, this.i1, false);
            }
        } else {
            int i7 = this.O3;
            if (i7 == -1) {
                this.eb.q0(this, this.h1, this.i1, false);
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
        int alpha = aob.T2.getAlpha();
        float d2 = d2(f2);
        StaticLayout staticLayout = this.sa;
        dc2 dc2Var = this.ub;
        float f13 = 0.0f;
        if (staticLayout == null && !dc2Var.G) {
            f6 = 10.0f;
            d = 1.0d;
        } else {
            boolean z8 = dc2Var.i1;
            if (z8) {
                f5 = this.O9;
            } else {
                f5 = f3;
            }
            float f14 = f5 + 0.0f;
            f6 = 10.0f;
            boolean z9 = dc2Var.G;
            d = 1.0d;
            if (z9 && dc2Var.I == null && staticLayout != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z9 && dc2Var.I != null && staticLayout == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z9 && dc2Var.I != null && staticLayout != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((!this.Kb || !dc2Var.m1) && z8 && !z3) {
                float f15 = dc2Var.J;
                if (z4) {
                    f14 = f15;
                } else {
                    float f16 = dc2Var.L1;
                    f14 = (f14 * f16) + ((1.0f - f16) * f15);
                }
            }
            m47 m47Var = this.L;
            if (m47Var != null) {
                l47 l47Var = m47Var.m;
                if (l47Var.j) {
                    f14 += l47Var.g;
                }
            }
            if (dc2Var.x0) {
                f14 += this.wd;
            }
            boolean I3 = I3();
            r47 r47Var = this.Q5;
            if (I3) {
                if (r47Var.O5()) {
                    b2 = b2("drawableMsgStickerReplies");
                } else {
                    b2 = aob.b4;
                }
            } else if (!r47Var.O3()) {
                if (z) {
                    b2 = aob.R3;
                } else {
                    b2 = aob.Q3;
                }
            } else {
                b2 = b2("drawableMsgOutReplies");
            }
            float s2 = jf0.s(b2, f14, d2, aob.T2.getTextSize());
            if (z3) {
                f7 = dc2Var.L1 * f12;
            } else if (z4) {
                f7 = (1.0f - dc2Var.L1) * f12;
            } else {
                f7 = f12;
            }
            b2.setAlpha((int) (f7 * 255.0f));
            if (z2) {
                canvas.save();
                canvas.scale(f11, f11, qd4.e(hl.L(3.0f) + s2, this.ta, 2.0f, f14), b2.getBounds().centerY());
            }
            b2.draw(canvas);
            b2.setAlpha(255);
            if (dc2Var.G) {
                if (z5) {
                    canvas.save();
                    f8 = s2;
                    aob.T2.setAlpha((int) ((1.0d - dc2Var.L1) * alpha));
                    canvas.translate(f14 + f8 + hl.L(3.0f), d2);
                    dc2Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f8 = s2;
                }
                aob.T2.setAlpha((int) (alpha * f7));
            } else {
                f8 = s2;
            }
            canvas.save();
            canvas.translate(f14 + f8 + hl.L(3.0f), d2);
            StaticLayout staticLayout2 = this.sa;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = dc2Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.sa != null) {
                f13 = f8 + this.ta + hl.L(10.0f) + 0.0f;
            }
            if (z2) {
                canvas.restore();
            }
            if (dc2Var.G) {
                aob.T2.setAlpha(alpha);
            }
            dc2Var.K = f14;
        }
        if (this.pa != null) {
            boolean z10 = dc2Var.i1;
            if (z10) {
                f10 = this.O9;
            } else {
                f10 = f3;
            }
            float f17 = f10 + f13;
            if ((!this.Kb || !dc2Var.m1) && z10) {
                float f18 = dc2Var.L;
                float f19 = dc2Var.L1;
                f17 = (f17 * f19) + ((1.0f - f19) * f18);
            }
            m47 m47Var2 = this.L;
            if (m47Var2 != null) {
                l47 l47Var2 = m47Var2.m;
                if (l47Var2.j) {
                    f17 += l47Var2.g;
                }
            }
            if (dc2Var.x0) {
                f17 += this.wd;
            }
            boolean I32 = I3();
            r47 r47Var2 = this.Q5;
            if (I32) {
                if (r47Var2.O5()) {
                    b23 = b2("drawableMsgStickerViews");
                } else {
                    b23 = aob.a4;
                }
            } else if (!r47Var2.O3()) {
                if (z) {
                    b23 = aob.N3;
                } else {
                    b23 = aob.M3;
                }
            } else {
                if (z) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                b23 = b2(str2);
            }
            float s3 = jf0.s(b23, f17, hl.L(1.5f) + d2, aob.T2.getTextSize() - hl.L(2.0f));
            if (z2) {
                canvas.save();
                canvas.scale(f11, f11, (((hl.L(3.0f) + b23.getIntrinsicWidth()) + this.qa) / 2.0f) + f17, b23.getBounds().centerY());
            }
            b23.setAlpha((int) (f12 * 255.0f));
            b23.draw(canvas);
            b23.setAlpha(255);
            if (dc2Var.e2 != null) {
                canvas.save();
                aob.T2.setAlpha((int) ((d - dc2Var.L1) * alpha));
                canvas.translate(f17 + s3 + hl.L(3.0f), d2);
                npa.f(canvas, dc2Var.e2);
                canvas.restore();
                aob.T2.setAlpha((int) (alpha * dc2Var.L1));
            }
            canvas.save();
            canvas.translate(f17 + s3 + hl.L(3.0f), d2);
            npa.f(canvas, this.pa);
            canvas.restore();
            if (z2) {
                canvas.restore();
            }
            f13 = this.qa + s3 + hl.L(f6) + f13;
            if (dc2Var.e2 != null) {
                aob.T2.setAlpha(alpha);
            }
            dc2Var.M = f17;
        }
        boolean z11 = this.q6;
        if (!z11 && !dc2Var.C) {
            return;
        }
        boolean z12 = dc2Var.i1;
        if (z12) {
            f9 = this.O9;
        } else {
            f9 = f3;
        }
        float f20 = f9 + f13;
        boolean z13 = dc2Var.C;
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
            float f21 = dc2Var.E;
            if (z7) {
                f20 = f21;
            } else {
                float f22 = dc2Var.L1;
                f20 = (f20 * f22) + ((1.0f - f22) * f21);
            }
        }
        m47 m47Var3 = this.L;
        if (m47Var3 != null) {
            l47 l47Var3 = m47Var3.m;
            if (l47Var3.j) {
                f20 += l47Var3.g;
            }
        }
        if (dc2Var.x0) {
            f20 += this.wd;
        }
        boolean I33 = I3();
        r47 r47Var3 = this.Q5;
        if (I33) {
            if (r47Var3.O5()) {
                b22 = b2("drawableMsgStickerPinned");
            } else {
                b22 = aob.Z3;
            }
        } else if (!r47Var3.O3()) {
            if (z) {
                b22 = aob.V3;
            } else {
                b22 = aob.U3;
            }
        } else {
            if (z) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            b22 = b2(str);
        }
        if (dc2Var.C) {
            boolean z14 = this.q6;
            float f23 = dc2Var.L1;
            float f24 = f12 * 255.0f;
            if (z14) {
                b22.setAlpha((int) (f24 * f23));
                s = jf0.s(b22, f20, d2, aob.T2.getTextSize() + hl.L(1.0f));
            } else {
                b22.setAlpha((int) ((1.0f - f23) * f24));
                s = jf0.s(b22, f20, d2, aob.T2.getTextSize() + hl.L(1.0f));
            }
        } else {
            b22.setAlpha((int) (f12 * 255.0f));
            s = jf0.s(b22, f20, d2, aob.T2.getTextSize() + hl.L(1.0f));
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
        dc2Var.D = f20;
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
        hl9 hl9Var;
        dc2 dc2Var;
        o47 o47Var;
        r47 r47Var;
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
        if ((!this.I5.isEmpty() || (this.w != null && (r47Var = this.Q5) != null && r47Var.D == 27)) && this.nb != f2) {
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
        r47 r47Var2 = this.Q5;
        if (r47Var2 != null && r47Var2.B2 != null) {
            int i11 = i - this.u0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int size = this.Q5.B2.size();
                dc2Var = this.ub;
                if (i12 >= size || ((o47) this.Q5.B2.get(i12)).p(this.Q5.B2, dc2Var) > i11) {
                    break;
                }
                i13 = i12;
                i12++;
            }
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            while (i13 < this.Q5.B2.size()) {
                float p = ((o47) this.Q5.B2.get(i13)).p(this.Q5.B2, dc2Var);
                float j = o47Var.f + p + o47Var.j(dc2Var) + o47Var.h;
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
                        cm cmVar = (cm) this.Ma.a.get(i17);
                        if (cmVar != null && cmVar.n) {
                            float y = (0.0f - getY()) - cmVar.r;
                            float y2 = (this.n - getY()) - cmVar.r;
                            Rect rect = cmVar.e;
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
        r47 r47Var3 = this.Q5;
        if (r47Var3 != null && (hl9Var = r47Var3.y2) != null) {
            ArrayList arrayList = hl9Var.g;
            int i18 = i - this.u0;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                dk9 dk9Var = (dk9) arrayList.get(i21);
                if (dk9Var.R || dk9Var.S) {
                    float f4 = dk9Var.N;
                    float f5 = i18 + i2;
                    if (q2(f4, dk9Var.H() + f4, i18, f5)) {
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
                vb2 vb2Var = (vb2) arrayList2.get(i24);
                int i25 = vb2Var.b + this.gb;
                if (q2(i25, i25 + vb2Var.c, this.Cc, i10 + this.Ec)) {
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
            if (Math.abs(this.g9 - Math.max(Math.min(hl.L(4.0f) + (-this.Dc), this.e9 - hl.L(42.0f)), hl.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        x49 x49Var = this.O;
        int i26 = x49Var.c;
        boolean q2 = q2(i26, i26 + x49Var.m, this.Cc, i9 + this.Ec);
        if (this.V4 != q2) {
            this.V4 = q2;
            invalidate();
        }
    }

    public final void E(int i, int i2, int i3) {
        int k1;
        boolean z;
        int i4;
        boolean z2;
        hl9 hl9Var;
        boolean z3;
        if (this.Q5.q4()) {
            this.b7 = hl.L(31.0f) + i3;
        } else if (g4()) {
            this.b7 = hl.L(31.0f) + i3;
        } else {
            x49 x49Var = this.O;
            if (!x49Var.p) {
                k1 = x49Var.r;
            } else {
                k1 = this.Q5.k1();
            }
            boolean z4 = false;
            if (!x49Var.p) {
                if (i - k1 >= i2 && !this.Q5.w2) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.U1) {
                    this.v0 = hl.L(14.0f) + this.v0;
                }
            } else if ((this.v1 || ((!this.R1 || this.Q5.q4()) && !h2() && !this.S1 && !this.T1 && !this.U1)) && i - k1 >= i2 && !this.Q5.w2) {
                z = false;
            } else {
                z = true;
            }
            if (this.Q5.F4()) {
                z = true;
            }
            if (x49Var.p && (hl9Var = this.Q5.y2) != null) {
                ArrayList arrayList = hl9Var.h;
                ArrayList arrayList2 = hl9Var.g;
                if (!arrayList2.isEmpty() && !hl9Var.d && !hl9Var.H()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            if (((ak9) obj).b >= arrayList2.size() - 1) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = ((dk9) c00.g(1, arrayList2)).u();
                } else {
                    z3 = true;
                    break;
                }
                if (z3) {
                    z = true;
                }
            }
            r47 r47Var = this.Q5;
            if ((r47Var.F2 && x49Var.p) || ((r47Var.J2 && x49Var.p) || r47Var.v3())) {
                i4 = 18;
                z = true;
            } else {
                i4 = 14;
            }
            if (x49Var.p && R2() && !TextUtils.isEmpty(this.Q5.z) && !this.w1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!y2()) {
                z4 = z;
            }
            if (z4) {
                if (!z2) {
                    this.v0 = hl.L(i4) + this.v0;
                    this.c7 = true;
                }
                int L = hl.L(31.0f) + Math.max(i3, k1);
                this.b7 = L;
                boolean O3 = this.Q5.O3();
                int i6 = this.M9;
                if (O3) {
                    i6 += hl.L(17.0f);
                }
                this.b7 = qu6.e(31.0f, i6, L);
            } else {
                int extraTextX = (i3 - getExtraTextX()) - k1;
                if (extraTextX >= 0 && extraTextX <= i2) {
                    this.b7 = hl.L(31.0f) + ((i3 + i2) - extraTextX);
                } else {
                    this.b7 = hl.L(31.0f) + Math.max(i3, k1 + i2);
                }
            }
            if (v2()) {
                this.b7 = hl.L(31.0f) + i;
            }
        }
    }

    public final void E0(boolean z) {
        float f;
        r47 r47Var;
        r47 r47Var2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i;
        RadialProgress2 radialProgress2;
        int i2;
        r47 r47Var3;
        if (this.eb != null && this.Q5.o4() && this.Q5.t2() && !this.Q5.l5() && !this.Q5.O0) {
            this.eb.U0(this);
            return;
        }
        r47 r47Var4 = this.Q5;
        if (r47Var4 != null && !r47Var4.M2()) {
            this.Q5.P = true;
        }
        int i3 = this.O3;
        RadialProgress2 radialProgress22 = this.R0;
        int i4 = this.a6;
        nl nlVar = this.U0;
        RadialProgress2 radialProgress23 = this.Q0;
        if (i3 == 0 && (!this.z1 || z)) {
            byte b = this.M1;
            if (b != 3 && b != 5 && (b != 7 || (r47Var3 = this.Q5) == null || !r47Var3.S4() || !this.Q5.z0)) {
                if (z) {
                    radialProgress22.o(false, 0.0f);
                } else {
                    radialProgress23.o(false, 0.0f);
                }
                if (this.e4 != null && (nlVar.E() || this.f4 == null)) {
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
                if (r47.Q5(this.Q5.k)) {
                    i = 2;
                } else {
                    i = 0;
                }
                r47 r47Var5 = this.Q5;
                int i5 = r47Var5.D;
                if (i5 != 1 && i5 != 20) {
                    if (i5 == 8) {
                        xb4.G(i4).X(this.N1, this.Q5, 2, 0);
                        if (this.Q5.H0 > 0) {
                            A0(this.N1);
                        }
                        radialProgress2 = radialProgress23;
                    } else if (this.Kb) {
                        if (r47Var5.k4()) {
                            xb4 G = xb4.G(i4);
                            TLRPC.Document F0 = this.Q5.F0();
                            r47 r47Var6 = this.Q5;
                            if (r47.Q5(r47Var6.k)) {
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            G.X(F0, r47Var6, 2, i2);
                            radialProgress2 = radialProgress23;
                        } else {
                            r47 r47Var7 = this.Q5;
                            r47Var7.h0 = 2.0f;
                            TLRPC.Document F02 = r47Var7.F0();
                            nlVar.r = true;
                            String str2 = str;
                            radialProgress2 = radialProgress23;
                            nlVar.Z(jn5.b(F02), null, jn5.f(photoSize, F02), str2, null, F02.size, null, this.Q5, 0);
                        }
                        this.xb = true;
                        invalidate();
                    } else {
                        radialProgress2 = radialProgress23;
                        if (i5 == 9) {
                            xb4.G(i4).X(this.N1, this.Q5, 2, 0);
                            if (this.Q5.H0 > 0) {
                                A0(this.N1);
                            }
                        } else {
                            byte b2 = this.M1;
                            if (b2 == 4) {
                                xb4.G(i4).X(this.N1, this.Q5, 1, i);
                                r47 r47Var8 = this.Q5;
                                if (r47Var8.H0 > 0) {
                                    A0(r47Var8.F0());
                                }
                            } else if (i5 == 0 && b2 != 0) {
                                if (b2 == 2) {
                                    nlVar.r = true;
                                    nlVar.Z(jn5.b(this.N1), null, jn5.c(this.e4, this.N1), this.i4, null, this.N1.size, null, this.Q5, i);
                                    r47 r47Var9 = this.Q5;
                                    r47Var9.h0 = 2.0f;
                                    if (r47Var9.H0 > 0) {
                                        A0(r47Var9.F0());
                                    }
                                } else if (b2 == 1) {
                                    xb4.G(i4).X(this.N1, this.Q5, 2, 0);
                                } else if (b2 == 8) {
                                    nlVar.Z(jn5.b(this.N1), this.h4, jn5.c(this.e4, this.N1), "b1", null, 0L, "jpg", this.Q5, 1);
                                }
                            } else {
                                nlVar.r = true;
                                nlVar.Z(jn5.f(this.e4, this.d4), this.h4, jn5.f(this.f4, this.d4), this.i4, this.g4, 0L, null, this.Q5, 0);
                            }
                        }
                    }
                } else {
                    radialProgress2 = radialProgress23;
                    nlVar.r = true;
                    nlVar.Z(jn5.f(this.e4, this.d4), this.h4, jn5.f(this.f4, this.d4), this.i4, this.g4, this.e4.size, null, this.Q5, i);
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
                xb4.G(i4).X(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
            }
            if (this.eb.j2(this, this.Q5)) {
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
            nlVar.r = false;
            byte b3 = this.M1;
            if (b3 != 3 && b3 != 5 && (b3 != 7 || (r47Var2 = this.Q5) == null || !r47Var2.S4())) {
                if (this.Q5.N3() && !this.z1 && (this.Q5.n4() || this.Q5.Y2())) {
                    if (radialProgress23.i.q != 6) {
                        this.eb.v1(this);
                        return;
                    }
                    return;
                }
                r47 r47Var10 = this.Q5;
                r47Var10.l1 = true;
                byte b4 = this.M1;
                if (b4 != 2 && b4 != 4 && b4 != 1 && b4 != 8) {
                    int i6 = r47Var10.D;
                    if (i6 != 0 && i6 != 1 && i6 != 20 && i6 != 8 && i6 != 5) {
                        if (i6 == 9) {
                            xb4.G(i4).f(this.Q5.F0());
                        }
                    } else {
                        in5 z2 = in5.z();
                        String str3 = nlVar.R;
                        if (str3 != null) {
                            z2.s.c(new mm5(z2, str3, (byte) 3));
                        }
                        nlVar.c();
                    }
                } else {
                    xb4.G(i4).f(this.N1);
                }
                this.O3 = 0;
                if (z) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.z().U(this.Q5, true)) {
                this.O3 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 2) {
            r47 r47Var11 = this.Q5;
            if (r47Var11 != null && r47Var11.D == 23) {
                this.eb.q0(this, 0.0f, 0.0f, false);
            } else if (this.M1 == 7 && r47Var11 != null && r47Var11.S4()) {
                if (this.X3 == 0) {
                    xb4.G(i4).X(this.N1, this.Q5, 2, 0);
                    this.Q5.l1 = false;
                }
                if (this.eb.j2(this, this.Q5)) {
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
                        r47 r47Var12 = MediaController.z().v0;
                        if (r47Var12 == null || !r47Var12.g4()) {
                            nlVar.u0 = true;
                            nlVar.w0(false);
                        }
                    } else {
                        nlVar.u0 = true;
                        nlVar.w0(false);
                    }
                    this.Q5.h0 = 0.0f;
                    this.O3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(false, 0.0f);
                xb4.G(i4).X(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
                this.O3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i3 != 3 && i3 != 0) {
            if (i3 == 4) {
                byte b6 = this.M1;
                if (b6 == 3 || b6 == 5 || (b6 == 7 && (r47Var = this.Q5) != null && r47Var.S4())) {
                    if ((this.Q5.N3() && (this.Q5.n4() || this.Q5.Y2())) || this.Q5.m4()) {
                        rb2 rb2Var = this.eb;
                        if (rb2Var != null && radialProgress23.i.q != 6) {
                            rb2Var.v1(this);
                            return;
                        }
                        return;
                    }
                    this.Q5.l1 = true;
                    xb4.G(i4).f(this.N1);
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
            rb2 rb2Var2 = this.eb;
            if (rb2Var2 != null) {
                rb2Var2.q0(this, f, f, false);
            }
        }
    }

    public final void E1(Canvas canvas, float f, Runnable runnable) {
        t37 t37Var;
        float f2;
        boolean z;
        boolean z2;
        int i;
        int i2;
        Canvas canvas2 = canvas;
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.R4()) {
            RadialProgress2 radialProgress2 = this.Q0;
            RectF rectF = radialProgress2.a;
            Paint paint = radialProgress2.g;
            yl6 yl6Var = radialProgress2.i;
            RectF rectF2 = radialProgress2.a;
            float cos = (((float) Math.cos((hl.U1(f, 190, 45) / 180.0f) * 3.141592653589793d)) * hl.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((hl.U1(f, 190, 45) / 180.0f) * 3.141592653589793d)) * hl.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = hl.P;
            rectF3.set(rectF2);
            rectF3.inset(-hl.L(1.0f), -hl.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (A2()) {
                t37Var = this.M6;
            } else {
                t37Var = this.L6;
            }
            yl6Var.B = t37Var;
            radialProgress2.j.B = t37Var;
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
                canvas2.scale(f4, f4, rectF2.centerX(), hl.R1(rectF2.top, rectF2.bottom, 0.5f));
                if (this.b1 == null) {
                    b29 b29Var = new b29(2131624022, hl.L(32.0f), hl.L(32.0f), true, null);
                    this.b1 = b29Var;
                    b29Var.M(this);
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
                    i2 = aob.v0(i3, this.cc);
                } else {
                    i2 = radialProgress2.n;
                }
                this.c1.setColor(i2);
                this.e1.setColor(i2);
                yl6Var.a(false);
                this.c1.setShader(yl6Var.d.getShader());
                this.e1.setShader(yl6Var.d.getShader());
                rectF3.set(this.b1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f5 = f2;
                rectF3.inset(f5, f5);
                canvas2.drawRect(rectF3, this.c1);
                this.b1.l(canvas, this.d1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.e1.setAlpha((int) (255.0f * f3));
                this.e1.setStrokeWidth(hl.L(1.66f));
                RectF rectF4 = this.c4;
                rectF4.set(rectF2);
                rectF4.inset(hl.L(3.0f), hl.L(3.0f));
                xy9 xy9Var = this.E4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - xy9Var.K) * (-360.0f), false, this.e1);
                tsb tsbVar = this.m5;
                if (tsbVar == null) {
                    tsbVar = new tsb();
                    this.m5 = tsbVar;
                }
                tsbVar.a((1.0f - xy9Var.K) * (-360.0f), f3, canvas, this.e1, rectF4);
                canvas2 = canvas;
            } else {
                b29 b29Var2 = this.b1;
                if (b29Var2 != null) {
                    b29Var2.x(true);
                    this.b1 = null;
                    if (this.m5 != null) {
                        this.m5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, hl.L((f * 1.5f) + 10.0f) * f, this.a1);
            canvas2.restore();
            if (this.Z0 == null) {
                pb1 pb1Var = new pb1(3);
                this.Z0 = pb1Var;
                z = false;
                pb1Var.g(-1, 0, 0);
                pb1 pb1Var2 = this.Z0;
                pb1Var2.i = 14.0f;
                pb1Var2.e(10.0f);
                this.Z0.a.setStrokeWidth(hl.N(1.5f));
                z2 = true;
                this.Z0.f(1, false, false);
                this.Z0.j = -hl.N(0.33f);
                this.Z0.k = hl.N(0.33f);
            } else {
                z = false;
                z2 = true;
            }
            pb1 pb1Var3 = this.Z0;
            pb1Var3.i = f * 14.0f;
            pb1Var3.e(f * 10.0f);
            canvas2.saveLayerAlpha(cos - hl.L(10.0f), sin - hl.L(10.0f), hl.L(10.0f) + cos, hl.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, hl.L(10.0f) * f, paint);
            pb1 pb1Var4 = this.Z0;
            if (hl.B(paint.getColor()) <= 0.8f) {
                z2 = z;
            }
            pb1Var4.d(z2);
            pb1 pb1Var5 = this.Z0;
            pb1Var5.n = cos;
            pb1Var5.o = sin;
            pb1Var5.b(canvas2, f);
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

    public final void E3(int r21, defpackage.r47 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.E3(int, r47):void");
    }

    public final void F() {
        StaticLayout staticLayout;
        if (this.Q5.D == 20 && (staticLayout = this.ja) != null) {
            nl nlVar = this.U0;
            this.ha = bp1.z(nlVar.N0, staticLayout.getWidth(), 2.0f, this.N6);
            this.ia = bp1.z(nlVar.O0, this.ja.getHeight(), 2.0f, this.P6 + nlVar.M0);
        }
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
            r47 r47Var = this.Q5;
            if (r47Var != null && !r47Var.M2()) {
                this.Q5.P = true;
            }
            byte b = this.M1;
            if (b != 3 && b != 5) {
                if (b == 4 || b == 7) {
                    A0(this.N1);
                    xb4 G = xb4.G(i4);
                    TLRPC.Document document = this.N1;
                    r47 r47Var2 = this.Q5;
                    if (r47.Q5(r47Var2.k)) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    G.X(document, r47Var2, 2, i2);
                    this.Q5.l1 = false;
                }
            } else {
                xb4 G2 = xb4.G(i4);
                TLRPC.Document document2 = this.N1;
                r47 r47Var3 = this.Q5;
                if (r47.Q5(r47Var3.k)) {
                    i = 2;
                } else {
                    i = 0;
                }
                G2.X(document2, r47Var3, 2, i);
                this.Q5.l1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i3 == 1) {
            byte b2 = this.M1;
            if ((b2 == 3 || b2 == 5 || b2 == 7) && MediaController.z().H(this.Q5)) {
                MediaController.z().m(true, true, false, false);
            }
            this.X3 = 0;
            this.Q5.l1 = true;
            xb4.G(i4).f(this.N1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final hb2 F1() {
        hb2 hb2Var = this.K4;
        if (hb2Var == null) {
            hb2 hb2Var2 = new hb2(this);
            this.K4 = hb2Var2;
            return hb2Var2;
        }
        return hb2Var;
    }

    public final void F3() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.Q5.O3()) {
            TextPaint textPaint = aob.o2;
            int i5 = aob.Wc;
            textPaint.setColor(aob.v0(i5, this.cc));
            aob.x2.setColor(aob.v0(i5, this.cc));
            aob.p2.setColor(aob.v0(i5, this.cc));
            aob.q2.setColor(aob.v0(i5, this.cc));
            aob.r2.setColor(aob.v0(i5, this.cc));
            TextPaint textPaint2 = aob.x2;
            TextPaint textPaint3 = aob.Z2;
            TextPaint textPaint4 = aob.a3;
            TextPaint textPaint5 = aob.o2;
            TextPaint textPaint6 = aob.p2;
            TextPaint textPaint7 = aob.q2;
            TextPaint textPaint8 = aob.r2;
            int v0 = aob.v0(aob.Yc, this.cc);
            textPaint8.linkColor = v0;
            textPaint7.linkColor = v0;
            textPaint6.linkColor = v0;
            textPaint5.linkColor = v0;
            textPaint4.linkColor = v0;
            textPaint3.linkColor = v0;
            textPaint2.linkColor = v0;
        } else {
            TextPaint textPaint9 = aob.o2;
            int i6 = aob.Vc;
            textPaint9.setColor(aob.v0(i6, this.cc));
            aob.x2.setColor(aob.v0(i6, this.cc));
            aob.p2.setColor(aob.v0(i6, this.cc));
            aob.q2.setColor(aob.v0(i6, this.cc));
            aob.r2.setColor(aob.v0(i6, this.cc));
            TextPaint textPaint10 = aob.x2;
            TextPaint textPaint11 = aob.Z2;
            TextPaint textPaint12 = aob.a3;
            TextPaint textPaint13 = aob.o2;
            TextPaint textPaint14 = aob.p2;
            TextPaint textPaint15 = aob.q2;
            TextPaint textPaint16 = aob.r2;
            int v02 = aob.v0(aob.Xc, this.cc);
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
            nb2 nb2Var = this.D4;
            if (b != 3 && b != 7) {
                if (b == 5) {
                    if (this.Q5.O3()) {
                        int v03 = aob.v0(aob.nc, this.cc);
                        int v04 = aob.v0(aob.oc, this.cc);
                        int i7 = aob.qc;
                        nb2Var.f(v03, v04, aob.v0(i7, this.cc), aob.v0(i7, this.cc), aob.v0(aob.pc, this.cc));
                    } else if (this.R1 && this.o8 != null) {
                        int b2 = aob.b(aob.v0(aob.le, this.cc), this.o8.h());
                        int b3 = aob.b(aob.v0(aob.me, this.cc), this.o8.h());
                        int i8 = aob.oe;
                        nb2Var.f(b2, b3, aob.b(aob.v0(i8, this.cc), this.o8.h()), aob.b(aob.v0(i8, this.cc), this.o8.h()), aob.b(aob.v0(aob.ne, this.cc), this.o8.h()));
                    } else {
                        int v05 = aob.v0(aob.le, this.cc);
                        int v06 = aob.v0(aob.me, this.cc);
                        int i9 = aob.oe;
                        nb2Var.f(v05, v06, aob.v0(i9, this.cc), aob.v0(i9, this.cc), aob.v0(aob.ne, this.cc));
                    }
                }
            } else {
                boolean O3 = this.Q5.O3();
                xy9 xy9Var = this.E4;
                if (O3) {
                    int v07 = aob.v0(aob.rc, this.cc);
                    int v08 = aob.v0(aob.tc, this.cc);
                    int v09 = aob.v0(aob.sc, this.cc);
                    xy9Var.p = v07;
                    xy9Var.q = v08;
                    xy9Var.r = v09;
                    int v010 = aob.v0(aob.nc, this.cc);
                    int v011 = aob.v0(aob.oc, this.cc);
                    int i10 = aob.qc;
                    nb2Var.f(v010, v011, aob.v0(i10, this.cc), aob.v0(i10, this.cc), aob.v0(aob.pc, this.cc));
                } else if (this.R1 && this.o8 != null) {
                    int b4 = aob.b(aob.v0(aob.pe, this.cc), this.o8.h());
                    int b5 = aob.b(aob.v0(aob.re, this.cc), this.o8.h());
                    int b6 = aob.b(aob.v0(aob.qe, this.cc), this.o8.h());
                    xy9Var.p = b4;
                    xy9Var.q = b5;
                    xy9Var.r = b6;
                    int b7 = aob.b(aob.v0(aob.le, this.cc), this.o8.h());
                    int b8 = aob.b(aob.v0(aob.me, this.cc), this.o8.h());
                    int i11 = aob.oe;
                    nb2Var.f(b7, b8, aob.b(aob.v0(i11, this.cc), this.o8.h()), aob.b(aob.v0(i11, this.cc), this.o8.h()), aob.b(aob.v0(aob.ne, this.cc), this.o8.h()));
                } else {
                    int v012 = aob.v0(aob.pe, this.cc);
                    int v013 = aob.v0(aob.re, this.cc);
                    int v014 = aob.v0(aob.qe, this.cc);
                    xy9Var.p = v012;
                    xy9Var.q = v013;
                    xy9Var.r = v014;
                    int v015 = aob.v0(aob.le, this.cc);
                    int v016 = aob.v0(aob.me, this.cc);
                    int i12 = aob.oe;
                    nb2Var.f(v015, v016, aob.v0(i12, this.cc), aob.v0(i12, this.cc), aob.v0(aob.ne, this.cc));
                }
            }
        }
        r47 r47Var = this.Q5;
        if (r47Var.D == 5) {
            TextPaint textPaint17 = aob.T2;
            if (v2()) {
                if (this.Q5.O3()) {
                    i3 = aob.jc;
                } else {
                    i3 = aob.ee;
                }
            } else {
                i3 = aob.Zc;
            }
            int v017 = aob.v0(i3, this.cc);
            boolean A2 = A2();
            r47 r47Var2 = this.Q5;
            if (A2) {
                if (r47Var2.O3()) {
                    i4 = aob.ec;
                } else {
                    i4 = aob.fe;
                }
            } else if (r47Var2.O3()) {
                i4 = aob.jc;
            } else {
                i4 = aob.ee;
            }
            textPaint17.setColor(vm2.f(getVideoTranscriptionProgress(), v017, aob.v0(i4, this.cc)));
        } else if (this.C6) {
            if (r47Var.O5()) {
                aob.T2.setColor(aob.v0(aob.Zc, this.cc));
            } else {
                aob.T2.setColor(aob.v0(aob.be, this.cc));
            }
        } else if (r47Var.O3()) {
            TextPaint textPaint18 = aob.T2;
            if (A2()) {
                i2 = aob.ec;
            } else {
                i2 = aob.jc;
            }
            textPaint18.setColor(aob.v0(i2, this.cc));
        } else {
            TextPaint textPaint19 = aob.T2;
            if (A2()) {
                i = aob.fe;
            } else {
                i = aob.ee;
            }
            textPaint19.setColor(aob.v0(i, this.cc));
        }
    }

    public final int G() {
        if (this.w1) {
            return 4;
        }
        return 8;
    }

    public final void G0() {
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            r47Var.L0 = !r47Var.L0;
            rb2 rb2Var = this.eb;
            if (rb2Var != null) {
                rb2Var.l1(this, true);
            }
        }
    }

    public final zb2 G1() {
        zb2 zb2Var = this.Y0;
        if (zb2Var == null) {
            zb2 zb2Var2 = new zb2(this);
            this.Y0 = zb2Var2;
            return zb2Var2;
        }
        return zb2Var;
    }

    public final boolean G2() {
        if (this.R5 != null) {
            return this.W5;
        }
        return this.I;
    }

    public final boolean G3() {
        m47 m47Var;
        r47 r47Var = this.Q5;
        if (r47Var != null && !r47Var.t1 && !r47Var.q4()) {
            j47 j47Var = this.M;
            if ((j47Var == null || ((m47Var = this.L) != null && m47Var.i && (j47Var.l & 8) == 0)) && !this.ub.x0) {
                if (!this.y || !r47.Q4(this.Q5.k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean H(MotionEvent motionEvent) {
        RectF rectF;
        rb2 rb2Var;
        hf0 hf0Var;
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
                if (z && (hf0Var = this.Z2) != null) {
                    hf0Var.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.Z2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.X2 && (rb2Var = this.eb) != null) {
                    rb2Var.l(this);
                }
                hf0 hf0Var2 = this.Z2;
                if (hf0Var2 != null) {
                    hf0Var2.setState(StateSet.NOTHING);
                }
                this.X2 = false;
            }
            return this.X2;
        }
        this.X2 = false;
        return false;
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
        dc2 dc2Var = this.ub;
        if (dc2Var.x0) {
            if (dc2Var.D0) {
                f4 -= getTranslationY();
                f3 = dc2Var.h0;
            } else if (dc2Var.t0) {
                float f6 = dc2Var.L1;
                float f7 = 1.0f - f6;
                f5 = (f5 * f6) + (dc2Var.r0 * f7);
                f4 = (f4 * f6) + (f7 * dc2Var.s0);
            } else if (!r47.Q4(this.Q5.k) || !TextUtils.isEmpty(this.Q5.z)) {
                f3 = dc2Var.h0;
            }
            f5 += f3;
        }
        float f8 = f5;
        float f9 = f4;
        float f10 = 0.0f;
        ArrayList arrayList2 = null;
        if (dc2Var.b1) {
            float f11 = dc2Var.L1;
            if (f11 != 1.0f) {
                p47 p47Var = dc2Var.c1;
                if (p47Var != null) {
                    arrayList = p47Var.e;
                } else {
                    arrayList = null;
                }
                dm dmVar = dc2Var.P0;
                float f12 = (1.0f - f11) * f;
                if (p47Var != null) {
                    f2 = p47Var.d;
                } else {
                    f2 = 0.0f;
                }
                I0(f8, f9, canvas, arrayList, dmVar, false, f12, f2, true);
                p47 p47Var2 = this.m3;
                if (p47Var2 != null) {
                    arrayList2 = p47Var2.e;
                }
                ArrayList arrayList3 = arrayList2;
                dm dmVar2 = this.Ma;
                float f13 = f * dc2Var.L1;
                if (p47Var2 != null) {
                    f10 = p47Var2.d;
                }
                I0(f8, f9, canvas, arrayList3, dmVar2, true, f13, f10, true);
                return;
            }
        }
        p47 p47Var3 = this.m3;
        if (p47Var3 != null) {
            arrayList2 = p47Var3.e;
        }
        ArrayList arrayList4 = arrayList2;
        dm dmVar3 = this.Ma;
        if (p47Var3 != null) {
            f10 = p47Var3.d;
        }
        I0(f8, f9, canvas, arrayList4, dmVar3, true, f, f10, true);
    }

    public final boolean H1(ub2 ub2Var, f66 f66Var, Layout layout, int i) {
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
                    ub2Var.b = i;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (ub2Var.b != i) {
            return false;
        }
        f66Var.rewind();
        int spanStart = spanned.getSpanStart(this.A4);
        int spanEnd = spanned.getSpanEnd(this.A4);
        f66Var.c = true;
        f66Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, f66Var);
        f66Var.a();
        this.y4.k();
        return true;
    }

    public final boolean H2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        r47 r47Var = this.Q5;
        if (!r47Var.l2) {
            if (r47.B0(r47Var.k) != 489000 || (message = this.Q5.k) == null || message.fwd_from == null) {
                if (!this.Q5.q4() && !this.Q5.v3()) {
                    if (!this.g6 || this.v6) {
                        TLRPC.Message message2 = this.Q5.k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || wf3.n(peer) != wf3.n(this.Q5.k.peer_id)) {
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
                r47 r47Var = this.Q5;
                if (r47Var != null) {
                    if (!r47Var.j2 && !r47Var.q4()) {
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
        rb2 rb2Var;
        if (this.m9 == null || (rb2Var = this.eb) == null || !rb2Var.b()) {
            return false;
        }
        boolean contains = this.n9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.o9 == null) {
            this.o9 = new v41(this);
        }
        if (motionEvent.getAction() == 0) {
            this.o9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.o9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.o9.i) {
                this.eb.G1(this);
            }
            this.o9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.o9.c(false);
        }
        return this.o9.i;
    }

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, defpackage.dm r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.I0(float, float, android.graphics.Canvas, java.util.ArrayList, dm, boolean, float, float, boolean):void");
    }

    public final boolean I1(ub2 ub2Var, f66 f66Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (H1(ub2Var, f66Var, ((o47) arrayList.get(i)).e, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean I2(r47 r47Var) {
        TLRPC.MessageFwdHeader messageFwdHeader = r47Var.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            rb2 rb2Var = this.eb;
            if (rb2Var == null || rb2Var.M()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean I3() {
        r47 r47Var;
        r47 r47Var2;
        byte b = this.Hb;
        if (b != 0) {
            if (b != 1) {
                return false;
            }
        } else if (!v2()) {
            if (!g4() && ((!this.C6 || ((this.m3 != null && !this.w1) || (!this.O.p && ((r47Var2 = this.Q5) == null || (!r47Var2.M2() && !this.Q5.g4()))))) && ((r47Var = this.Q5) == null || r47Var.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean J(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.J(android.view.MotionEvent):boolean");
    }

    public final void J0(Canvas canvas, float f) {
        ui7 ui7Var;
        r47 r47Var = this.Q5;
        if (r47Var != null && !r47Var.q4()) {
            float f2 = this.u0;
            dc2 dc2Var = this.ub;
            if (dc2Var.m2) {
                float f3 = dc2Var.o2;
                float f4 = dc2Var.L1;
                f2 = (f2 * f4) + ((1.0f - f4) * f3);
            }
            float f5 = f2;
            if (dc2Var.L1 != 1.0f && dc2Var.H0 && ((ui7Var = this.Mc) == null || !ui7Var.h)) {
                canvas.save();
                t37 t37Var = this.L6;
                if (t37Var != null) {
                    Rect bounds = t37Var.getBounds();
                    if (this.Q5.O3() && !this.C6 && !this.G) {
                        canvas.clipRect(hl.L(4.0f) + bounds.left, hl.L(4.0f) + bounds.top, bounds.right - hl.L(10.0f), bounds.bottom - hl.L(4.0f));
                    } else {
                        canvas.clipRect(hl.L(4.0f) + bounds.left, hl.L(4.0f) + bounds.top, bounds.right - hl.L(4.0f), bounds.bottom - hl.L(4.0f));
                    }
                }
                I0(this.o0, f5, canvas, dc2Var.I0, dc2Var.P0, false, (1.0f - dc2Var.L1) * f, this.Q5.x2, false);
                r47 r47Var2 = this.Q5;
                I0(this.o0, f5, canvas, r47Var2.B2, this.Ma, true, f * dc2Var.L1, r47Var2.x2, false);
                canvas.restore();
            } else {
                r47 r47Var3 = this.Q5;
                I0(this.o0, f5, canvas, r47Var3.B2, this.Ma, true, f, r47Var3.x2, false);
            }
        }
        if (G3()) {
            H0(canvas, f);
        }
    }

    public final void J1() {
        r47 r47Var = this.R5;
        if (r47Var == null) {
            r47Var = this.Q5;
        }
        r47 r47Var2 = r47Var;
        this.Q5 = null;
        z3(r47Var2, this.L, this.G, this.F, this.H, false);
    }

    public final boolean J2(defpackage.r47 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.J2(r47):boolean");
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

    public final boolean K(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.K(android.view.MotionEvent):boolean");
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        if (this.R5 != null) {
            return this.U5;
        }
        return this.G;
    }

    public final void K3() {
        nl nlVar = this.U0;
        L3((nlVar.N0 / 2.0f) + nlVar.L0, (nlVar.O0 / 2.0f) + nlVar.M0);
    }

    public final boolean L(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.x7) {
            int x = (int) motionEvent.getX();
            int P1 = (int) P1(motionEvent);
            j47 j47Var = this.M;
            if (j47Var != null) {
                int i = j47Var.l;
                if ((i & 1) == 0 || (i & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt != this && (childAt instanceof wb2)) {
                            wb2 wb2Var = (wb2) childAt;
                            if (wb2Var.x7 && wb2Var.L == this.L) {
                                int i3 = wb2Var.M.l;
                                if ((i3 & 1) != 0 && (i3 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - wb2Var.getLeft(), (P1(motionEvent) + getTop()) - wb2Var.getTop(), 0);
                                    boolean L = wb2Var.L(obtain);
                                    obtain.recycle();
                                    return L;
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
                    rb2 rb2Var = this.eb;
                    if (rb2Var != null) {
                        if (this.u6) {
                            rb2Var.a1(this);
                        } else {
                            rb2Var.C0(this);
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

    public final boolean L0() {
        r47 r47Var;
        if (this.dc && (r47Var = this.Q5) != null && r47Var.O3() && aob.v0(aob.ub, this.cc) != 0) {
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
        wb2 wb2Var;
        nl nlVar = this.U0;
        this.ba = (float) Math.sqrt(Math.pow(nlVar.O0, 2.0d) + Math.pow(nlVar.N0, 2.0d));
        r47 r47Var = this.Q5;
        if (!r47Var.O0 && this.Y9 == 0.0f) {
            if (r47Var.D == 3) {
                r47Var.M1 = true;
                r47Var.Q0 = true;
                wb2Var = this;
                wb2Var.y3(r47Var, this.L, this.G, this.F, this.H, this.I);
                r47 r47Var2 = wb2Var.Q5;
                r47Var2.Q0 = false;
                r47Var2.M1 = false;
                if (wb2Var.L != null) {
                    wb2Var.Q0.o(false, 0.0f);
                }
            } else {
                wb2Var = this;
            }
            wb2Var.Z9 = f;
            wb2Var.aa = f2;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ete.a(wb2Var.ba * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(k43.j);
            duration.addUpdateListener(new az1(wb2Var, (byte) 6));
            duration.addListener(new qb2(wb2Var, (byte) 0));
            duration.start();
        }
    }

    public final boolean M(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.Q5.D == 12) {
            xb2 xb2Var = this.w2;
            if (xb2Var == null) {
                xb2Var = new xb2(this);
                this.w2 = xb2Var;
            }
            wb2 wb2Var = xb2Var.a;
            r47 r47Var = wb2Var.Q5;
            int[] iArr = wb2Var.N2;
            Drawable[] drawableArr = wb2Var.J2;
            if (r47Var.D == 12) {
                int x = (int) motionEvent.getX();
                int P1 = (int) wb2Var.P1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = xb2Var.g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i = 0; i < xb2Var.g.size(); i++) {
                            tb2 tb2Var = (tb2) xb2Var.g.get(i);
                            float f = x;
                            float f2 = P1;
                            if (tb2Var.e.contains(f, f2)) {
                                v41 v41Var = tb2Var.f;
                                if (v41Var == null) {
                                    v41Var = new v41(wb2Var);
                                    tb2Var.f = v41Var;
                                }
                                v41Var.c(true);
                                hf0 hf0Var = tb2Var.g;
                                if (hf0Var != null) {
                                    hf0Var.setHotspot(f, f2);
                                    tb2Var.g.setState(iArr);
                                }
                                wb2Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f3 = x;
                    float f4 = P1;
                    if (wb2Var.v2.contains(f3, f4)) {
                        xb2Var.h = true;
                        wb2Var.Sa.c(true);
                        Drawable drawable2 = drawableArr[0];
                        if (drawable2 != null) {
                            drawable2.setHotspot(f3, f4);
                            drawableArr[0].setState(iArr);
                        }
                        wb2Var.invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (xb2Var.h) {
                        if (wb2Var.eb != null) {
                            ArrayList arrayList2 = xb2Var.g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                wb2Var.eb.q1(wb2Var, ((tb2) xb2Var.g.get(0)).a);
                            } else {
                                wb2Var.eb.q1(wb2Var, 5);
                            }
                        }
                        wb2Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        xb2Var.h = false;
                        wb2Var.Sa.c(false);
                        wb2Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = xb2Var.g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i2 = 0; i2 < xb2Var.g.size(); i2++) {
                            tb2 tb2Var2 = (tb2) xb2Var.g.get(i2);
                            v41 v41Var2 = tb2Var2.f;
                            if (v41Var2 != null && v41Var2.i) {
                                rb2 rb2Var = wb2Var.eb;
                                if (rb2Var != null) {
                                    rb2Var.q1(wb2Var, tb2Var2.a);
                                }
                                hf0 hf0Var2 = tb2Var2.g;
                                if (hf0Var2 != null) {
                                    hf0Var2.setState(StateSet.NOTHING);
                                }
                                tb2Var2.f.c(false);
                                wb2Var.playSoundEffect(0);
                                wb2Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (xb2Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x, P1);
                        return false;
                    }
                    ArrayList arrayList4 = xb2Var.g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= xb2Var.g.size()) {
                                break;
                            }
                            tb2 tb2Var3 = (tb2) xb2Var.g.get(i3);
                            v41 v41Var3 = tb2Var3.f;
                            if (v41Var3 != null && v41Var3.i) {
                                hf0 hf0Var3 = tb2Var3.g;
                                if (hf0Var3 != null) {
                                    hf0Var3.setHotspot(x, P1);
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

    public final boolean M0(android.graphics.Canvas r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.M0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final boolean M2() {
        if (this.Kb && this.Lb) {
            return true;
        }
        return false;
    }

    public final boolean M3() {
        rb2 rb2Var;
        if (getCurrentMessagesGroup() == null && (rb2Var = this.eb) != null && rb2Var.l2() != null && this.eb.l2().y(this.Q5)) {
            return true;
        }
        return false;
    }

    @Override
    public final void N(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.N(java.lang.String):void");
    }

    public void N0(Canvas canvas) {
        if (!this.Q5.O0 && this.Y9 != 1.0f) {
            nl nlVar = this.U0;
            int[] iArr = nlVar.X0;
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
            RectF rectF = hl.P;
            rectF.set(nlVar.L0, nlVar.M0, nlVar.w(), nlVar.x());
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
                nlVar.h(canvas, null);
            } else {
                float f5 = nlVar.L0;
                float f6 = nlVar.M0;
                float f7 = nlVar.N0;
                float f8 = nlVar.O0;
                ImageReceiver imageReceiver = this.V0;
                imageReceiver.i0(f5, f6, f7, f8);
                imageReceiver.s0(nlVar.X0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final boolean N2() {
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.R4()) {
            return false;
        }
        return true;
    }

    public final boolean O(MotionEvent motionEvent) {
        float f;
        rb2 rb2Var;
        r47 r47Var = this.Q5;
        if (r47Var == null || r47Var.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f2 = 0.0f;
        if (this.j0 == 0) {
            f = 0.0f;
        } else {
            f = 18.0f;
        }
        float L = timeX - hl.L(f);
        float f3 = this.M9;
        if (this.Q5.B0) {
            f2 = 1.0f - this.k4;
        }
        int L2 = ((int) ((f3 * f2) + L)) - hl.L(2.0f);
        int timeY = ((int) getTimeY()) - hl.L(2.0f);
        RectF rectF = hl.P;
        rectF.set(L2, timeY, hl.L(16.0f) + L2 + this.M9, hl.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), P1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.l0 == null) {
                    this.l0 = new v41(this);
                }
                this.sc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.sc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.sc && (rb2Var = this.eb) != null) {
                rb2Var.e2(this);
            }
            this.sc = false;
        } else if (motionEvent.getAction() == 3) {
            this.sc = false;
        }
        v41 v41Var = this.l0;
        if (v41Var != null) {
            v41Var.c(this.sc);
        }
        return this.sc;
    }

    public void O0(Canvas canvas) {
        if (this.ca == null) {
            return;
        }
        canvas.save();
        nl nlVar = this.U0;
        canvas.translate(nlVar.L0, nlVar.M0);
        this.ca.c(canvas, this, (int) nlVar.N0, (int) nlVar.O0, nlVar.getAlpha(), this.Tc);
        canvas.restore();
        invalidate();
    }

    public final t37 O1(boolean z) {
        boolean z2;
        if (z) {
            j47 j47Var = this.M;
            if (j47Var != null && (j47Var.l & 8) == 0 && this.L.i && !this.K) {
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
                this.L6 = (t37) b2("drawableMsgIn");
            } else {
                this.L6 = (t37) b2("drawableMsgInMedia");
            }
        }
        this.L6.f();
        return this.L6;
    }

    public final boolean O2() {
        r47 r47Var;
        if (this.Y6 && (r47Var = this.Q5) != null && !r47Var.O3() && this.M == null && !v2()) {
            return true;
        }
        return false;
    }

    public final boolean P(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        if (this.T1) {
            zb2 G1 = G1();
            wb2 wb2Var = G1.a;
            boolean z = wb2Var.T1;
            ArrayList arrayList = wb2Var.I5;
            m66 m66Var = wb2Var.u4;
            if (z) {
                int x = (int) motionEvent.getX();
                int P1 = (int) wb2Var.P1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (wb2Var.O1 && wb2Var.y1 && wb2Var.O3 != -1 && x >= (i2 = wb2Var.K3) && x <= hl.L(48.0f) + i2 && P1 >= (i3 = wb2Var.L3) && P1 <= hl.L(48.0f) + i3 && wb2Var.Q0.i.q != 4) {
                        wb2Var.P3 = true;
                        wb2Var.invalidate();
                        return true;
                    } else if (wb2Var.O1 && wb2Var.U0.H(x, P1)) {
                        G1.v = true;
                        return true;
                    } else if (wb2Var.p2 == null || P1 < wb2Var.Y1) {
                        return false;
                    } else {
                        try {
                            int L = x - ((wb2Var.p0 + hl.L(10.0f)) + wb2Var.a2);
                            int i4 = P1 - wb2Var.Y1;
                            int lineForVertical = wb2Var.p2.getLineForVertical(i4);
                            float f = L;
                            int offsetForHorizontal = wb2Var.p2.getOffsetForHorizontal(lineForVertical, f);
                            float lineLeft = wb2Var.p2.getLineLeft(lineForVertical);
                            if (lineLeft > f || lineLeft + wb2Var.p2.getLineWidth(lineForVertical) < f) {
                                return false;
                            }
                            Spannable spannable = (Spannable) wb2Var.Q5.y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof c8c) && !c8c.h) || hl.A1()) {
                                return false;
                            }
                            q66 q66Var = wb2Var.r4;
                            if (q66Var == null || q66Var.i != clickableSpanArr[0]) {
                                m66Var.l(q66Var, true);
                                q66 q66Var2 = new q66(clickableSpanArr[0], wb2Var.cc, f, i4, 0);
                                wb2Var.r4 = q66Var2;
                                if (wb2Var.Q5.O3()) {
                                    i = aob.Dc;
                                } else {
                                    i = aob.Ce;
                                }
                                q66Var2.d(aob.v0(i, wb2Var.cc));
                                wb2Var.y0 = -10;
                                wb2Var.v4 = 2;
                                try {
                                    f66 b = wb2Var.r4.b();
                                    int[] Z1 = Z1(spannable, wb2Var.r4.i);
                                    b.d(wb2Var.p2, Z1[0], 0.0f);
                                    wb2Var.p2.getSelectionPath(Z1[0], Z1[1], b);
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                m66Var.a(wb2Var.r4, 2);
                            }
                            wb2Var.invalidate();
                            return true;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    if (wb2Var.v4 != 2 && !G1.v && !wb2Var.P3) {
                        wb2Var.i3(2);
                        return false;
                    } else if (wb2Var.P3) {
                        wb2Var.P3 = false;
                        wb2Var.playSoundEffect(0);
                        wb2Var.E0(false);
                        wb2Var.invalidate();
                        return false;
                    } else {
                        q66 q66Var3 = wb2Var.r4;
                        if (q66Var3 != null) {
                            CharacterStyle characterStyle = q66Var3.i;
                            if (characterStyle instanceof URLSpan) {
                                m01.u(wb2Var.getContext(), ((URLSpan) wb2Var.r4.i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(wb2Var);
                            }
                            wb2Var.i3(2);
                            return false;
                        }
                        G1.v = false;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                break;
                            }
                            wo0 wo0Var = (wo0) arrayList.get(i5);
                            if (ehb.c(wo0Var.i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                wb2Var.playSoundEffect(0);
                                wb2Var.eb.I0(wb2Var, wo0Var.i);
                                wb2Var.invalidate();
                                break;
                            }
                            i5++;
                        }
                        wb2Var.i3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        r47 r47Var;
        rb2 rb2Var;
        String str;
        boolean c = ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i = 1;
        int i2 = this.a6;
        if (!c && !ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                r7a B = r7a.B(i2);
                r47 r47Var2 = this.Q5;
                if (r47Var2 != null && keyboardButtonProto != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(r47.B0(r47Var2.k));
                    sb.append("_");
                    sb.append(r47Var2.e1());
                    sb.append("_");
                    sb.append(Utilities.f(keyboardButtonProto.getData()));
                    sb.append("_");
                    if (ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb.append(str);
                    return B.n.containsKey(sb.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (rb2Var = this.eb) != null && rb2Var.k1(this, 3) && TextUtils.equals(this.eb.M0(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            r7a B2 = r7a.B(i2);
            if (this.Q5 != null && keyboardButtonProto != null) {
                if (ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i = 3;
                } else if (!ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                return B2.r.containsKey(r47.B0(r47Var.k) + "_" + r47Var.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i);
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
                vb2 vb2Var = (vb2) arrayList.get(i);
                if (this.eb.G0(this, vb2Var.t, !vb2Var.i)) {
                    if (z) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = r47.B0(this.Q5.k);
                    int i2 = this.a6;
                    long M = xc2.M(uc7.s1(i2).M0(Long.valueOf(B0)), uc7.s1(i2).N0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) r47.m1(this.Q5);
                    int i3 = this.a6;
                    r47.Y5(i3, M, tL_messageMediaToDo, vb2Var.t.id, !vb2Var.i, ConnectionsManager.getInstance(i3).getCurrentTime());
                    if (!vb2Var.i) {
                        TLObject b2 = uc7.s1(i2).b2(M);
                        vb2Var.y.k(b2);
                        vb2Var.z.U(b2, vb2Var.y, null);
                        vb2Var.q = new pkb(wf3.l(b2), 12.0f, null);
                    }
                    this.f7[i].f(-1, !vb2Var.i, true);
                    if (this.y3 != null) {
                        if (!this.Q5.O3() && r47.B0(this.Q5.k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.y3.t(ob6.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(r47.z0(tL_messageMediaToDo)), wf3.k(yac.t0, this.Q5.Z0())), true, true);
                        } else {
                            this.y3.t(ob6.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(r47.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    vb2Var.i = !vb2Var.i;
                    invalidate();
                    return;
                }
                this.Z4 = false;
            }
        }
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.Q():void");
    }

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final String Q1(r47 r47Var) {
        if (this.B5) {
            return ob6.N0("PsaMessage_" + r47Var.k.fwd_from.psa_type);
        }
        return ob6.M0(2131750525, null);
    }

    public final boolean Q2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.Q2():boolean");
    }

    public final void Q3() {
        r47 r47Var;
        int i;
        boolean z;
        hl9 hl9Var;
        ArrayList arrayList;
        if (this.Kc && (r47Var = this.Q5) != null) {
            boolean z2 = false;
            if (r47Var.X1) {
                i = wl.f();
            } else {
                i = 0;
            }
            p47 p47Var = this.m3;
            if (p47Var != null && (arrayList = p47Var.e) != null) {
                this.Ma = hm.update(i, (View) this, false, this.Ma, (ArrayList<o47>) arrayList);
            } else {
                rb2 rb2Var = this.eb;
                if (rb2Var != null && rb2Var.h()) {
                    z = false;
                } else {
                    z = true;
                }
                this.Ma = hm.update(i, this, z, this.Ma, this.Q5.B2);
            }
            r47 r47Var2 = this.Q5;
            if (r47Var2.D == 36 && (hl9Var = r47Var2.y2) != null) {
                rb2 rb2Var2 = this.eb;
                if (rb2Var2 == null || !rb2Var2.h()) {
                    z2 = true;
                }
                hl9Var.v = z2;
                this.Q5.y2.a0(i);
            }
        }
    }

    public final boolean R(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.R(android.view.MotionEvent):boolean");
    }

    public final void R0(android.graphics.Canvas r34, defpackage.p47 r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.R0(android.graphics.Canvas, p47, boolean, boolean, float):void");
    }

    public final float R1(boolean z) {
        float f;
        m19 m19Var;
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
        if (!z && (m19Var = this.o3) != null) {
            return (1.0f - m19Var.k.e(false, 1.0f)) * f;
        }
        return f;
    }

    public final boolean R2() {
        r47 r47Var = this.Q5;
        hl9 hl9Var = r47Var.y2;
        if (r47Var.D == 36 && hl9Var != null) {
            ArrayList arrayList = hl9Var.g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof nm9)) {
                return true;
            }
        }
        return false;
    }

    public final void R3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.R3(boolean, boolean, boolean):void");
    }

    public final boolean S(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.S(android.view.MotionEvent):boolean");
    }

    public final void S0(Canvas canvas) {
        r47 r47Var;
        float f;
        r47 r47Var2 = this.Q5;
        if ((r47Var2 == null || !r47Var2.q4()) && (r47Var = this.Q5) != null && !r47Var.n4()) {
            r47 r47Var3 = this.Q5;
            if (r47Var3.D != 27 && !r47Var3.m4() && this.m1 != null) {
                if (this.n1 || this.o1) {
                    j47 j47Var = this.M;
                    if (j47Var != null) {
                        int i = j47Var.l;
                        if ((i & 8) == 0 || (i & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y = getY() + getPaddingTop();
                    m47 m47Var = this.L;
                    if (m47Var != null && m47Var.d.size() > 1) {
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
        nm9 f4 = f4();
        if (f4 != null) {
            long j = this.mc;
            long j2 = 0;
            if (j != 0) {
                v0d v0dVar = f4.e0;
                if (v0dVar != null) {
                    j2 = v0dVar.t;
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
        r47 r47Var = this.Q5;
        int i9 = r47Var.D;
        float f5 = 0.0f;
        dc2 dc2Var = this.ub;
        int i10 = 0;
        boolean z = true;
        if (i9 != 1 && i9 != 20 && this.M1 != 4 && i9 != 8 && i9 != 23) {
            float f6 = 10.0f;
            float f7 = 11.0f;
            if (this.S1) {
                int i11 = this.N6;
                if (!r47Var.O3()) {
                    f7 = 17.0f;
                }
                this.s3 = hl.L(f7) + i11 + this.r3;
                int i12 = this.v0 - this.u3;
                if (this.J) {
                    f6 = 9.0f;
                }
                int L2 = ((i12 - hl.L(f6)) - this.W1) - hl.L(17.0f);
                if (this.x7 && this.R8 != 3) {
                    i8 = getCommentButtonHeight();
                } else {
                    i8 = 0;
                }
                L = L2 - i8;
                this.t3 = hl.R1(L, hl.L(9.0f) + this.gb, a3());
            } else {
                if (this.Kb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.Q5.O3()) {
                        i7 = 0;
                    } else {
                        i7 = 6;
                    }
                    this.s3 = hl.L(i7 + 11) + backgroundDrawableLeft;
                } else {
                    int i13 = this.N6;
                    if (!r47Var.O3() && !this.C6 && !this.K) {
                        f7 = 17.0f;
                    }
                    this.s3 = hl.L(f7) + i13 + this.r3;
                }
                int i14 = this.v0 - this.u3;
                if (this.J) {
                    f6 = 9.0f;
                }
                int L3 = i14 - hl.L(f6);
                if (this.x7 && this.R8 != 3) {
                    i5 = getCommentButtonHeight();
                } else {
                    i5 = 0;
                }
                int i15 = L3 - i5;
                x49 x49Var = this.O;
                if (!x49Var.p) {
                    i6 = x49Var.n;
                } else {
                    i6 = 0;
                }
                L = i15 - i6;
                this.t3 = hl.R1(L, hl.L(9.0f) + this.gb, a3());
            }
        } else {
            if (dc2Var.g0) {
                f2 = dc2Var.n0;
                f3 = dc2Var.o0;
                f = dc2Var.q0;
            } else {
                nl nlVar = this.U0;
                float f8 = nlVar.L0;
                float f9 = nlVar.M0;
                f = nlVar.O0;
                f2 = f8;
                f3 = f9;
            }
            this.s3 = f2 + hl.L(5.0f) + this.r3;
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
            L = f3 + f + hl.L(6.0f);
            float L4 = f + hl.L(6.0f);
            p47 p47Var = this.m3;
            if (p47Var == null) {
                i = 0;
            } else {
                i = -p47Var.b();
            }
            this.t3 = hl.R1(L4, i - hl.L(4.0f), a3()) + f3;
            z = false;
        }
        this.s3 += getExtraTextX();
        r47 r47Var2 = this.Q5;
        if (r47Var2 != null && (i2 = r47Var2.D) != 0 && i2 != 24 && !r47Var2.v3() && !this.Q5.q4()) {
            if (z && h2()) {
                this.t3 -= (1.0f - a3()) * (hl.L(16.0f) + this.s0.r);
            }
            if (z) {
                yb2 yb2Var = this.s0;
                if (yb2Var != null) {
                    i4 = yb2Var.r;
                } else {
                    i4 = 0;
                }
                i3 = hl.L(14.0f) + i4;
            } else {
                i3 = 0;
            }
            float f10 = L - i3;
            p47 p47Var2 = this.m3;
            if (p47Var2 != null) {
                i10 = hl.L(4.0f) + p47Var2.c(dc2Var);
            }
            this.r0 = (int) ((f10 + hl.U1(a3(), i10, hl.L(6.0f))) - dc2Var.k0);
        }
        r47 r47Var3 = this.Q5;
        if (r47Var3 != null && r47Var3.D == 17) {
            float f11 = this.t3;
            cc2 cc2Var = this.x2;
            if (cc2Var != null) {
                f5 = cc2Var.q;
            }
            this.t3 = f11 + f5;
        }
    }

    public final boolean T() {
        return xb4.G(this.a6).k(getFilename());
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
        dc2 dc2Var = this.ub;
        x49 x49Var = this.O;
        if (z) {
            if (!this.Q5.O3()) {
                gi7 gi7Var = aob.E3;
                if (I3()) {
                    v0 = aob.v0(aob.kd, this.cc);
                } else {
                    if (z3) {
                        i = aob.Fb;
                    } else {
                        i = aob.kd;
                    }
                    v0 = aob.v0(i, this.cc);
                }
                gi7Var.a(v0);
                if (I3()) {
                    f7 = (getPhotoBottom() + this.w0) - hl.L(9.0f);
                } else {
                    if (!this.G && !this.F) {
                        f6 = 8.5f;
                    } else {
                        f6 = 9.5f;
                    }
                    float L2 = (f - hl.L(f6)) + f3;
                    if (this.Kb && !v2()) {
                        if (this.K) {
                            f8 = 4.0f;
                        } else {
                            f8 = 5.0f;
                        }
                        f7 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (x49Var.i(dc2Var.L1) + hl.L(f8)));
                    } else {
                        f7 = L2;
                    }
                }
                if (!this.Q5.r1) {
                    i2 = hl.L(11.0f);
                }
                jf0.w(gi7Var, f4 + i2, f7 - hl.L(12.0f));
                gi7Var.setAlpha((int) (f10 * 255.0f));
                if (z4) {
                    canvas.save();
                    canvas.scale(f9, f9, gi7Var.getBounds().centerX(), gi7Var.getBounds().centerY());
                }
                gi7Var.draw(canvas);
                gi7Var.setAlpha(255);
                invalidate();
                if (z4) {
                    canvas.restore();
                }
            }
        } else if (z2 && !this.Q5.O3()) {
            if (!this.Q5.r1) {
                i2 = hl.L(11.0f);
            }
            float f11 = f4 + i2;
            float f12 = 21.5f;
            if (I3()) {
                L = (getPhotoBottom() + this.w0) - hl.L(21.5f);
            } else {
                if (!this.G && !this.F) {
                    f12 = 20.5f;
                }
                L = (f - hl.L(f12)) + f3;
                if (this.Kb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * x49Var.i(dc2Var.L1);
                }
            }
            RectF rectF = this.c4;
            rectF.set(f11, L, hl.L(14.0f) + f11, hl.L(14.0f) + L);
            int alpha = aob.b2.getAlpha();
            int i3 = (int) (f10 * 255.0f);
            aob.b2.setAlpha(i3);
            if (z4) {
                canvas.save();
                canvas.scale(f9, f9, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), aob.b2);
            aob.b2.setAlpha(alpha);
            Drawable b2 = b2("drawableMsgError");
            jf0.w(b2, f11 + hl.L(6.0f), L + hl.L(2.0f));
            b2.setAlpha(i3);
            b2.draw(canvas);
            b2.setAlpha(255);
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final String T1(long j) {
        TLRPC.Chat M0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a6;
        if (i > 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
            if (X1 != null) {
                return lbc.r(X1);
            }
            return null;
        } else if (i < 0 && (M0 = uc7.s1(i2).M0(Long.valueOf(-j))) != null) {
            return M0.title;
        } else {
            return null;
        }
    }

    public final void T2(int i, int i2) {
        j47 j47Var = this.M;
        float f = j47Var.p;
        float f2 = j47Var.r;
        this.Dd = f - f2;
        this.Ed = f2;
        this.Fd = (int) j47Var.q;
        this.Gd = (int) ((i * j47Var.s) / (i2 / 1000.0f));
    }

    public final void T3() {
        TLRPC.Chat chat;
        if (this.Q5 != null) {
            int i = this.a6;
            uc7 s1 = uc7.s1(i);
            TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.k.fwd_from;
            long e = yac.h(i).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (r47.B0(this.Q5.k) == e || r47.B0(this.Q5.k) == 1271266957)) {
                this.wa = uc7.s1(i).M0(Long.valueOf(messageFwdHeader.from_id.channel_id));
                return;
            }
            if (messageFwdHeader != null) {
                if (r47.B0(this.Q5.k) == 489000) {
                    long n = wf3.n(messageFwdHeader.from_id);
                    if (n >= 0) {
                        this.va = s1.X1(Long.valueOf(n));
                        return;
                    } else {
                        this.wa = s1.M0(Long.valueOf(-n));
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
                                this.va = s1.X1(Long.valueOf(peer2.user_id));
                                return;
                            }
                        }
                        this.va = s1.X1(Long.valueOf(j));
                        return;
                    } else if (peer.channel_id != 0) {
                        if (this.Q5.j4()) {
                            TLRPC.Peer peer3 = messageFwdHeader.from_id;
                            if (peer3 instanceof TLRPC.TL_peerUser) {
                                this.va = s1.X1(Long.valueOf(peer3.user_id));
                                return;
                            }
                        }
                        this.wa = s1.M0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                        return;
                    } else {
                        long j2 = peer.chat_id;
                        if (j2 != 0) {
                            TLRPC.Peer peer4 = messageFwdHeader.from_id;
                            if (peer4 instanceof TLRPC.TL_peerUser) {
                                this.va = s1.X1(Long.valueOf(peer4.user_id));
                                return;
                            } else {
                                this.wa = s1.M0(Long.valueOf(j2));
                                return;
                            }
                        }
                        return;
                    }
                } else if ((messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || r47.B0(this.Q5.k) == e)) {
                    this.va = s1.X1(Long.valueOf(messageFwdHeader.from_id.user_id));
                    return;
                }
            }
            if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || r47.B0(this.Q5.k) == e)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.va = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || r47.B0(this.Q5.k) == e)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.va = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = r47.B0(this.Q5.k);
                long Z0 = this.Q5.Z0();
                TLRPC.Chat chat2 = null;
                if (wf3.y(Z0)) {
                    chat = s1.M0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (wf3.y(B0)) {
                    chat2 = s1.M0(Long.valueOf(-B0));
                }
                if (wf3.B(r47.B0(this.Q5.k))) {
                    if (this.Q5.O3()) {
                        this.va = yac.h(i).f();
                        return;
                    }
                    TLRPC.EncryptedChat a1 = s1.a1(Integer.valueOf((int) (r47.B0(this.Q5.k) & 4294967295L)));
                    if (a1 != null) {
                        this.va = s1.X1(Long.valueOf(a1.user_id));
                    }
                } else if (wf3.D(Z0) && (!this.Q5.k.post || (chat != null && chat.signature_profiles))) {
                    this.va = s1.X1(Long.valueOf(Z0));
                } else if (this.Q5.k.post && chat2 != null && !chat2.signature_profiles) {
                    this.wa = chat2;
                } else if (wf3.y(Z0)) {
                    this.wa = chat;
                } else {
                    TLRPC.Message message = this.Q5.k;
                    if (message.post) {
                        this.wa = s1.M0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean U(MotionEvent motionEvent) {
        hf0 hf0Var;
        wb2 wb2Var;
        rb2 rb2Var;
        TLRPC.Chat chat;
        int i;
        TLRPC.Chat chat2;
        if (this.w9 && this.h9 != null && (hf0Var = this.V2) != null && (this.va != null || this.wa != null)) {
            boolean contains = hf0Var.getBounds().contains((int) motionEvent.getX(), (int) P1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.W2 = contains;
                if (contains) {
                    this.V2.setHotspot((int) motionEvent.getX(), (int) P1(motionEvent));
                    this.V2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (rb2Var = this.eb) != null) {
                    if (this.S6) {
                        TLRPC.User user = this.Fa;
                        if (user != null && user.bot_inline_placeholder == null) {
                            rb2Var.u0(this, user.id);
                        } else {
                            String p = lbc.p(user);
                            rb2 rb2Var2 = this.eb;
                            if (p == null) {
                                p = this.Q5.k.via_bot_name;
                            }
                            rb2Var2.g0(p);
                        }
                    } else {
                        TLRPC.User user2 = this.va;
                        if (user2 != null) {
                            rb2Var.W(this, user2, motionEvent.getX(), P1(motionEvent));
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
                                wb2Var = this;
                                rb2Var.T1(wb2Var, chat2, i, this.h1, this.i1, false);
                                wb2Var.V2.setState(StateSet.NOTHING);
                                wb2Var.W2 = false;
                                return wb2Var.W2;
                            }
                        }
                    }
                }
                wb2Var = this;
                wb2Var.V2.setState(StateSet.NOTHING);
                wb2Var.W2 = false;
                return wb2Var.W2;
            }
            wb2Var = this;
            return wb2Var.W2;
        }
        this.W2 = false;
        return false;
    }

    public final void U0(Canvas canvas, float f) {
        int i;
        if (this.R8 == 3) {
            int L = hl.L(32.0f);
            if (this.n7 != null) {
                this.e9 -= hl.L(18.0f);
                L += hl.L(18.0f);
            }
            float f2 = this.d9;
            float f3 = this.e9 + L;
            RectF rectF = this.c4;
            rectF.set(f2, this.e9, hl.L(32.0f) + f2, f3);
            C();
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i2 != 0) {
                int alpha = c2("paintChatActionBackground").getAlpha();
                c2("paintChatActionBackground").setAlpha((int) (alpha * f));
                canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), c2("paintChatActionBackground"));
                c2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float L2 = hl.L(16.0f);
                float L3 = hl.L(16.0f);
                if (this.U8) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, L2, L3, c2(str));
            }
            if (i2()) {
                if (i2 != 0) {
                    int alpha2 = aob.h2.getAlpha();
                    aob.h2.setAlpha((int) (alpha2 * f));
                    canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.h2);
                    aob.h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.h2);
                }
            }
            Drawable P0 = aob.P0("drawableCommentSticker");
            if (v2()) {
                Drawable drawable = this.Wc;
                if (drawable == null) {
                    drawable = P0.getConstantState().newDrawable().mutate();
                    this.Wc = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.Ta, this.cc), PorterDuff.Mode.SRC_IN));
                P0 = this.Wc;
            }
            jf0.w(P0, this.d9 + hl.L(4.0f), this.e9 + hl.L(4.0f));
            if (i2 != 0) {
                P0.setAlpha((int) (f * 255.0f));
                P0.draw(canvas);
                P0.setAlpha(255);
            } else {
                P0.draw(canvas);
            }
            if (this.n7 != null) {
                TextPaint textPaint = aob.E2;
                if (v2()) {
                    i = aob.Ta;
                } else {
                    i = aob.Od;
                }
                textPaint.setColor(aob.v0(i, this.cc));
                aob.E2.setAlpha((int) (f * 255.0f));
                dc2 dc2Var = this.ub;
                if (dc2Var.V) {
                    if (dc2Var.W != null) {
                        canvas.save();
                        aob.E2.setAlpha((int) ((1.0d - dc2Var.L1) * 255.0d * f));
                        canvas.translate(this.d9 + ((hl.L(32.0f) - dc2Var.Y) / 2), this.e9 + hl.L(30.0f));
                        dc2Var.W.draw(canvas);
                        canvas.restore();
                    }
                    aob.E2.setAlpha((int) (dc2Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.d9 + ((hl.L(32.0f) - this.v7) / 2), this.e9 + hl.L(30.0f));
                this.n7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(boolean z) {
        k43 k43Var;
        float f = this.vd;
        r47 r47Var = this.Q5;
        if (r47Var != null && !r47Var.O3()) {
            int i = 0;
            if (z) {
                if (!this.n1) {
                    if (this.o1) {
                        k43Var = k43.i;
                    }
                } else {
                    k43Var = k43.g;
                }
                this.r1 = (int) Math.ceil(k43Var.getInterpolation(this.p1) * hl.L(35.0f));
                if (this.Q5.D == 36) {
                    if (hl.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
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
                return (hl.L(71 - i) * this.Z6) + f;
            }
        }
        return f;
    }

    public final int U2(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.U2(int):int");
    }

    public final void U3() {
        Window window;
        if (this.zb == null) {
            Activity W = hl.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                c34 c34Var = new c34(window, new rd1(this, (byte) 24));
                this.zb = c34Var;
                if (this.O0) {
                    c34Var.a();
                }
            }
        }
        c34 c34Var2 = this.zb;
        if (c34Var2 != null) {
            c34Var2.i();
        }
    }

    public final boolean V(MotionEvent motionEvent) {
        rb2 rb2Var;
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
                if (motionEvent.getAction() == 1 && this.c3 && (rb2Var = this.eb) != null && (user = this.va) != null) {
                    Drawable drawable = this.Ca.f[0];
                    if (drawable instanceof wl) {
                        document = ((wl) drawable).e;
                    } else {
                        document = null;
                    }
                    rb2Var.z(this, user, document, this.Ba);
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

    public final void V0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.V0(android.graphics.Canvas, float):void");
    }

    public final ImageReceiver V1(int i) {
        TLRPC.PollAnswer pollAnswer;
        mh8 mh8Var;
        mh8 mh8Var2;
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.D == 17) {
            if (i == -2) {
                cc2 cc2Var = this.x2;
                if (cc2Var != null && (mh8Var2 = cc2Var.m) != null) {
                    return mh8Var2.b;
                }
                return null;
            } else if (i == -3) {
                cc2 cc2Var2 = this.x2;
                if (cc2Var2 != null && (mh8Var = cc2Var2.n) != null) {
                    return mh8Var.b;
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
                        vb2 vb2Var = (vb2) obj;
                        kh8 kh8Var = vb2Var.x;
                        if (kh8Var != null && (pollAnswer = vb2Var.s) != null && pollAnswer.unshuffled_index == i) {
                            return kh8Var.c;
                        }
                    }
                }
            }
        }
        hd5 hd5Var = this.X5;
        if (hd5Var != null) {
            ArrayList arrayList2 = hd5Var.c;
            fd5 fd5Var = hd5Var.b;
            if (fd5Var != null && i >= 0 && i < fd5Var.a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) hd5Var.b.a.get(i);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((gd5) arrayList2.get(i3)).F == messageExtendedMedia) {
                        return ((gd5) arrayList2.get(i3)).f;
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
        dc2 dc2Var = this.ub;
        if (O3) {
            if (z) {
                currentBackgroundLeft2 = (int) (this.N6 + dc2Var.h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            extraTextX = getExtraTextX() + hl.L(11.0f) + currentBackgroundLeft2;
            this.o0 = extraTextX;
        } else {
            if (z) {
                currentBackgroundLeft = (int) (this.N6 + dc2Var.h0);
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
                L = hl.L(f);
            }
            extraTextX = currentBackgroundLeft + L + getExtraTextX();
            this.o0 = extraTextX;
        }
        float f3 = 4.0f;
        if (this.T1) {
            this.o0 = hl.L(11.0f) + extraTextX;
            int L3 = hl.L(14.0f) + this.gb;
            this.u0 = L3;
            StaticLayout staticLayout = this.g2;
            if (staticLayout != null) {
                this.u0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.U1) {
            int L4 = hl.L(14.0f) + this.gb;
            this.u0 = L4;
            StaticLayout staticLayout2 = this.g2;
            if (staticLayout2 != null) {
                this.u0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.Q5.D == 19) {
            this.u0 = hl.L(6.0f) + this.gb;
            if (!this.Q5.N3()) {
                this.o0 = getCurrentBackgroundLeft();
            } else {
                this.o0 -= hl.L(4.0f);
            }
        } else {
            int L5 = hl.L(8.0f) + this.gb;
            this.u0 = L5;
            r47 r47Var = this.Q5;
            float f4 = 2.0f;
            if (r47Var.D == 36) {
                if (this.w1 && this.m3 != null && R2()) {
                    this.u0 = uh9.w(7.0f, this.m3.b(), this.u0);
                } else {
                    hl9 hl9Var = this.Q5.y2;
                    if (hl9Var != null && hl9Var.X()) {
                        int i3 = this.u0;
                        if (this.gb <= 0) {
                            f4 = -3.0f;
                        }
                        this.u0 = hl.L(f4) + i3;
                    }
                }
            } else {
                if (r47Var.E2 && (i = xea.U0) > 10) {
                    if (i < 15) {
                        f4 = 1.0f;
                    }
                    L5 += hl.L(f4);
                    this.u0 = L5;
                }
                if (this.Q5.E2 && this.gb > 0) {
                    this.u0 = hl.L(5.0f) + L5;
                }
            }
        }
        if (this.Q5.q4()) {
            this.q0 = hl.L(14.0f) + this.u0;
        } else {
            boolean z2 = this.v1;
            int i4 = this.u0;
            if (z2) {
                this.q0 = hl.L(10.0f) + i4;
                this.u0 = uh9.w(13.0f, this.W1, this.u0);
                if (this.u2 && !this.U1 && !this.Q5.v3()) {
                    this.u0 = hl.L(44.0f) + this.u0;
                }
            } else {
                this.q0 = hl.L(10.0f) + this.Q5.V5(dc2Var) + i4;
            }
        }
        if (this.v1) {
            L2 = hl.L(10.0f) + this.Q5.V5(dc2Var) + this.u0;
        } else {
            int i5 = this.q0 + this.W1;
            if (this.u2) {
                f2 = 46.0f;
            } else {
                f2 = 0.0f;
            }
            int L6 = hl.L(f2) + i5;
            if (this.W1 <= 0) {
                f3 = -8.0f;
            }
            L2 = hl.L(f3) + L6;
        }
        this.r0 = L2;
        this.p0 = this.o0;
        if (this.Q5.x2 != 0.0f && this.Q7 != null) {
            int L7 = this.b7 - hl.L(31.0f);
            r47 r47Var2 = this.Q5;
            int i6 = L7 - r47Var2.v2;
            if (!this.c7) {
                int i7 = this.M9;
                if (r47Var2.O3()) {
                    i2 = 20;
                }
                i6 = ik8.B(i2 + 4, i7, i6);
            }
            if (i6 > 0) {
                this.o0 = (i6 - getExtraTimeX()) + this.o0;
            }
        }
    }

    public final void V3(r47 r47Var) {
        boolean z;
        boolean z2;
        String B;
        int i = 0;
        this.B8 = false;
        if (r47Var.D == 9 && this.M1 == 1 && !this.O1 && this.L == null && this.M == null) {
            TLRPC.Document F0 = r47Var.F0();
            int i2 = this.a6;
            uo3 uo3Var = ve8.a;
            if (!uc7.s1(i2).k4.D0.f && F0 != null) {
                if ("application/vnd.apple.pkpass".equalsIgnoreCase(F0.mime_type) || ((B = xb4.B(F0)) != null && B.toLowerCase(Locale.ROOT).endsWith(".pkpass"))) {
                    long j = F0.size;
                    if (j > 0 && j <= 2097152 && !ve8.c.containsKey(Long.valueOf(F0.id))) {
                        if (this.A8 == null) {
                            this.A8 = new te8();
                        }
                        this.H8 = this.b7 - hl.L(11.0f);
                        qe8 qe8Var = (qe8) ve8.b.get(Long.valueOf(F0.id));
                        if (qe8Var != null) {
                            try {
                                this.F8 = this.A8.e(qe8Var, this.H8);
                                z = true;
                            } catch (Throwable th) {
                                cc4.g(th, true);
                                long j2 = F0.id;
                                ve8.b.remove(Long.valueOf(j2));
                                ve8.c.put(Long.valueOf(j2), Boolean.TRUE);
                                return;
                            }
                        } else {
                            int i3 = this.H8;
                            Paint paint = te8.B;
                            this.F8 = Math.round((i3 * 7.0f) / 5.0f);
                            e3(r47Var);
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
                            i = hl.L(6.0f);
                        }
                        this.gb += this.F8 + i;
                        this.B8 = true;
                    }
                }
            }
        }
    }

    public final boolean W(defpackage.r47 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.W(r47):boolean");
    }

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.W0(android.graphics.Canvas):void");
    }

    public final float W1(int i) {
        vb2 vb2Var;
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                int i2 = ((vb2) arrayList.get(i)).b;
                int i3 = this.gb;
                float f = i2 + i3;
                dc2 dc2Var = this.ub;
                if (dc2Var.u2) {
                    float f2 = dc2Var.L1;
                    f += ((1.0f - f2) * dc2Var.v2) + (i3 * f2);
                    if (this.Q5.m5()) {
                        f -= this.gb;
                    }
                }
                if (dc2Var.x0) {
                    f += dc2Var.k0;
                }
                return f + vb2Var.c + hl.L(13.0f);
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
        mh8 mh8Var;
        mh8 mh8Var2;
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            ob2 ob2Var = this.bc;
            if (ob2Var != null && ob2Var.rewindCount != 0 && ob2Var.rewindByBackSeek) {
                r47Var.b0 = ob2Var.getVideoProgress();
            }
            boolean z2 = true;
            if (this.Q5.S3()) {
                cc2 cc2Var = this.x2;
                if (cc2Var != null && (mh8Var2 = cc2Var.m) != null) {
                    mh8Var2.p(true);
                }
                cc2 cc2Var2 = this.x2;
                if (cc2Var2 != null && (mh8Var = cc2Var2.n) != null) {
                    mh8Var.p(true);
                }
            }
            byte b = this.M1;
            nb2 nb2Var = this.D4;
            double d4 = 0.0d;
            int i = 0;
            if (b == 4) {
                if (nb2Var != null) {
                    nb2Var.a();
                }
                if (this.x3 != null) {
                    if (!PhotoViewer.N0(this.Q5)) {
                        if (MediaController.z().w0 == this.Q5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                lm m = this.U0.m();
                if (m != null) {
                    r47 r47Var2 = this.Q5;
                    int i2 = m.d[4] / 1000;
                    r47Var2.j0 = i2;
                    d3 = i2;
                    TLRPC.Message message = r47Var2.k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !r47Var2.l5() && r47.K4(this.Q5.k) && m.s()) {
                        this.eb.d0(this.Q5);
                    }
                } else {
                    d3 = 0.0d;
                }
                if (d3 == 0.0d) {
                    d3 = this.Q5.L0();
                }
                if (MediaController.z().H(this.Q5)) {
                    d3 -= this.Q5.b0 * d3;
                } else if (m != null) {
                    if (d3 != 0.0d) {
                        d3 -= m.o() / 1000;
                    }
                    if (this.eb != null && m.o() >= 3000) {
                        this.eb.r0();
                    }
                }
                if (this.M4 != d3) {
                    String g0 = hl.g0((int) d3, false, false);
                    this.C3 = (int) Math.ceil(aob.C2.measureText(g0));
                    this.x3 = new StaticLayout(g0, aob.C2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M4 = d3;
                    return;
                }
                return;
            }
            boolean z3 = this.Kb;
            xy9 xy9Var = this.E4;
            if (z3) {
                if (this.C4) {
                    if (!xy9Var.f) {
                        xy9Var.f(true, this.Q5.b0);
                    }
                } else {
                    if (!nb2Var.e) {
                        nb2Var.g(this.Q5.b0);
                        nb2Var.q = this.Q5.g0;
                    }
                    nb2Var.a();
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
                } else if (MediaController.z().H(this.Q5)) {
                    d2 = Math.max(0.0d, d2 - this.Q5.i0);
                }
                if (this.M4 != d2) {
                    this.M4 = d2;
                    String g02 = hl.g0((int) d2, true, false);
                    this.N4 = (int) Math.ceil(aob.T2.measureText(g02));
                    this.L4 = new StaticLayout(g02, aob.T2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                    if (!xy9Var.f) {
                        xy9Var.f(true, this.Q5.b0);
                    }
                    z = true;
                } else {
                    if (!nb2Var.e) {
                        nb2Var.g(this.Q5.b0);
                        nb2Var.q = this.Q5.g0;
                    }
                    nb2Var.i(this.Q5);
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
                    } else if (!MediaController.z().H(this.Q5)) {
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
                        String g03 = hl.g0((int) d, true, false);
                        this.N4 = (int) Math.ceil(aob.N2.measureText(g03));
                        this.L4 = new StaticLayout(g03, aob.N2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.Q5.L0();
                    if (MediaController.z().H(this.Q5)) {
                        i = this.Q5.i0;
                    }
                    double d5 = i;
                    if (this.M4 != d5) {
                        this.M4 = d5;
                        this.L4 = new StaticLayout(hl.k0(i, (int) L0), aob.N2, (int) Math.ceil(aob.N2.measureText(k0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z2 = z;
                }
                if (z2) {
                    invalidate();
                }
            }
        }
    }

    public final boolean X(MotionEvent motionEvent) {
        byte b;
        j47 j47Var;
        boolean z;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i;
        int L2;
        int i2;
        if ((!w2() || this.Q5.D == 16) && (((b = this.M1) != 5 && b != 1) || (j47Var = this.M) == null || (j47Var.l & 4) != 0)) {
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
                    r47 r47Var = this.Q5;
                    if (r47Var.D == 16) {
                        boolean I4 = r47Var.I4();
                        int i4 = this.S3;
                        if (x >= i4) {
                            if (ob6.a0) {
                                L = 0;
                            } else {
                                L = this.b7 - hl.L(70.0f);
                            }
                            int i5 = i4 + L;
                            if (!I4) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            if (x <= hl.L(i + 30) + i5 && P1 >= this.T3 - hl.L(14.0f)) {
                                if (P1 <= hl.L(50.0f) + this.T3) {
                                    this.Z3 = true;
                                    this.L2[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i6 = this.S3;
                                        if (ob6.a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.b7 - hl.L(70.0f);
                                        }
                                        int i7 = i6 + L2;
                                        if (!I4) {
                                            i2 = 2;
                                        } else {
                                            i2 = 0;
                                        }
                                        int L3 = hl.L(i2) + i7;
                                        Drawable[] drawableArr2 = aob.G4;
                                        int w = bp1.w(2, L3, drawableArr2[I4 ? 1 : 0]);
                                        int i8 = bp1.i(2, this.T3, drawableArr2[I4 ? 1 : 0]);
                                        drawableArr[0].setBounds(w - hl.L(20.0f), i8 - hl.L(20.0f), hl.L(20.0f) + w, hl.L(20.0f) + i8);
                                        drawableArr[0].setHotspot(x, P1);
                                        drawableArr[0].setState(this.N2);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x >= this.S3 - hl.L(20.0f)) {
                        if (x <= hl.L(20.0f) + this.S3 && P1 >= this.T3 - hl.L(4.0f)) {
                            if (P1 <= hl.L(30.0f) + this.T3) {
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
                        this.eb.a2(this, this.S3, this.T3);
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

    public final void X0(Canvas canvas) {
        float f;
        wb2 wb2Var;
        Canvas canvas2;
        if (this.vc || this.wc) {
            j47 j47Var = this.M;
            if (j47Var == null || (j47Var.c == 0 && j47Var.a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                Jd.setColor(compactHeaderColor);
                Kd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.J) {
                    f = 9.0f;
                } else {
                    f = 10.0f;
                }
                float L = hl.L(f);
                if (this.vc) {
                    wb2Var = this;
                    canvas2 = canvas;
                    wb2Var.Z0(canvas2, this.tc, compactLeft, L, compactHeaderColor);
                    L += hl.L(24.0f);
                } else {
                    wb2Var = this;
                    canvas2 = canvas;
                }
                if (wb2Var.wc) {
                    wb2Var.Z0(canvas2, wb2Var.uc, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final float X1(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                int i2 = ((vb2) arrayList.get(i)).b;
                int i3 = this.gb;
                float f = i2 + i3;
                dc2 dc2Var = this.ub;
                if (dc2Var.u2) {
                    float f2 = dc2Var.L1;
                    f += ((1.0f - f2) * dc2Var.v2) + (i3 * f2);
                    if (this.Q5.m5()) {
                        f -= this.gb;
                    }
                }
                if (dc2Var.x0) {
                    f += dc2Var.k0;
                }
                return f - hl.L(13.0f);
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

    public final boolean Y(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.Y(android.view.MotionEvent):boolean");
    }

    public final int Y1(byte[] bArr) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((vb2) arrayList.get(i)).s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public mpa Y2() {
        return mpa.e(this);
    }

    public final void Y3() {
        r47 r47Var;
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        if (!this.Q5.N5()) {
            return;
        }
        x49 x49Var = this.O;
        if (!x49Var.p) {
            j47 j47Var = this.M;
            if (j47Var != null) {
                int i4 = j47Var.l;
                if ((i4 & 8) == 0 || (i4 & 1) == 0) {
                    return;
                }
            }
            r47 r47Var2 = this.Q5;
            int i5 = 0;
            if (r47Var2.D != 19 && !r47Var2.G2() && !this.Q5.M2()) {
                float f3 = 11.0f;
                if (this.Q5.O3()) {
                    x49Var.b = hl.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.Kb) {
                    int L = hl.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.K) {
                        i3 = 6;
                    } else {
                        i3 = 0;
                    }
                    int L2 = hl.L(hl.U1(getVideoTranscriptionProgress(), 0, i3)) + L;
                    x49Var.b = L2;
                    x49Var.b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * hl.L(9.0f)));
                } else {
                    int L3 = hl.L((this.C6 || !this.K) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    x49Var.b = L3;
                    if (this.C6) {
                        x49Var.b = L3 - hl.L(9.0f);
                    }
                }
            } else if (this.Q5.O3()) {
                x49Var.b = (getMeasuredWidth() - x49Var.o) - hl.L(16.0f);
            } else {
                x49Var.b = getCurrentBackgroundLeft();
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
                x49Var.b = (int) (compactLeft - f2);
            }
            if (!this.Q5.O3() && this.M != null && !v2()) {
                float f4 = x49Var.b;
                if (b3()) {
                    i2 = 48;
                } else {
                    i2 = 0;
                }
                x49Var.b = (int) (f4 - (hl.L(64 - i2) * this.Z6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - hl.L(10.0f)) - x49Var.m;
            x49Var.c = backgroundDrawableBottom;
            if (this.x7) {
                if (v2()) {
                    i5 = getCommentButtonHeight();
                } else {
                    if (this.Q5.D == 29 && f2()) {
                        f = 28.0f;
                    } else {
                        f = 43.0f;
                    }
                    i5 = hl.L(f);
                }
            }
            int i6 = backgroundDrawableBottom - i5;
            x49Var.c = i6;
            if (this.c7 && (!this.E9 || !this.R1 || this.M1 != 3)) {
                x49Var.c = i6 - hl.L(16.0f);
            }
            if (this.Q5.D != 9 && !R2() && this.m3 != null && (((i = (r47Var = this.Q5).D) != 2 && i != 17 && (!r47Var.N3() || !this.E9 || this.O1)) || ((this.M != null && this.L != null) || this.Q5.D == 29))) {
                x49Var.c -= hl.L(14.0f);
            }
            x49Var.c += x49Var.k;
        }
    }

    public final boolean Z(MotionEvent motionEvent) {
        de8 J1;
        rb2 rb2Var = this.eb;
        if (rb2Var == null) {
            J1 = null;
        } else {
            J1 = rb2Var.J1();
        }
        de8 de8Var = J1;
        int i = 0;
        if (this.Q5 != null) {
            nl nlVar = this.U0;
            if (nlVar.E() && de8Var != null && !this.Q5.s4() && !this.Q5.G2() && ((!r47.K4(this.Q5.k) || this.H5) && !this.Kb && !this.Q5.J2() && ((!this.Q5.U2() || r47.t3(this.Q5.k)) && !this.Q5.l5()))) {
                r47 r47Var = this.Q5;
                mpa mpaVar = this.ca;
                if (mpaVar != null) {
                    Integer num = (Integer) mpaVar.k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i = num.intValue();
                }
                return de8Var.a(motionEvent, this, nlVar, r47Var, i);
            }
        }
        return false;
    }

    public final void Z0(Canvas canvas, sb2 sb2Var, float f, float f2, int i) {
        int i2;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z;
        int L = hl.L(16.0f);
        RectF rectF = sb2Var.d;
        ImageReceiver imageReceiver = sb2Var.b;
        boolean z2 = sb2Var.a;
        float f3 = L;
        rectF.set(f, f2, sb2Var.j + f, f2 + f3);
        canvas.save();
        float a = sb2Var.e.a(0.02f);
        RectF rectF2 = sb2Var.d;
        canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
        int p1 = aob.p1(0.15f, i);
        hf0 hf0Var = sb2Var.k;
        if (hf0Var == null) {
            sb2Var.l = p1;
            hf0 Y = aob.Y(p1, 6, 6);
            sb2Var.k = Y;
            Y.setCallback(this);
        } else if (sb2Var.l != p1) {
            sb2Var.l = p1;
            aob.F1(hf0Var, p1, true);
        }
        sb2Var.k.setBounds((int) (rectF2.left - hl.L(6.0f)), (int) (rectF2.top - hl.L(4.0f)), (int) (rectF2.right + hl.L(6.0f)), (int) (rectF2.bottom + hl.L(4.0f)));
        sb2Var.k.draw(canvas);
        if (!z2) {
            rb2 rb2Var = this.eb;
            if (rb2Var != null && rb2Var.k1(this, 0)) {
                z = true;
            } else {
                z = false;
            }
            a1(canvas, sb2Var, i, z);
        }
        if (this.zc == null) {
            this.zc = getContext().getResources().getDrawable(2131232337).mutate();
        }
        if (z2) {
            i2 = aob.v0(aob.Fd, this.cc);
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
        float L2 = f + f3 + hl.L(6.0f);
        if (sb2Var.f != null) {
            Jd.setColor(i2);
            Y0(canvas, sb2Var.f, L2, f2);
            Jd.setColor(i);
            L2 += hl.L(4.0f) + N1(sb2Var.f);
        }
        if (sb2Var.i) {
            imageReceiver.i0(L2, f2, f3, f3);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += hl.L(5.0f) + L;
        }
        StaticLayout staticLayout = sb2Var.g;
        if (staticLayout != null) {
            if (z2) {
                staticLayout.getPaint().setColor(vm2.k(aob.p1(0.7f, i2), aob.v0(aob.ua, this.cc)));
            }
            Y0(canvas, sb2Var.g, L2, f2);
            if (z2) {
                sb2Var.g.getPaint().setColor(i);
            }
            L2 += hl.L(4.0f) + N1(sb2Var.g);
        }
        if (sb2Var.h != null) {
            canvas.save();
            canvas.translate(L2 - sb2Var.h.getLineLeft(0), ((L - sb2Var.h.getHeight()) / 2.0f) + f2);
            if (z2) {
                sb2Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = sb2Var.h;
                AtomicReference atomicReference = this.Ac;
                ArrayList arrayList = this.fc;
                npa.g(this, this.n0, i, -hl.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                hm.drawAnimatedEmojis(canvas, sb2Var.h, this.Na, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, L1(2, i));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final void Z2(r47 r47Var) {
        long j;
        TLRPC.User X1;
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
        m47 m47Var;
        TLRPC.Chat M0;
        r47 primaryMessageObject = getPrimaryMessageObject();
        long Z0 = r47Var.Z0();
        boolean z5 = r47Var.r1;
        int i4 = this.a6;
        CharSequence charSequence = "";
        if (z5) {
            replace = null;
            j = 0;
        } else {
            if (primaryMessageObject.k.via_business_bot_id != 0) {
                TLRPC.User X12 = uc7.s1(r47Var.K1).X1(Long.valueOf(primaryMessageObject.k.via_business_bot_id));
                if (X12 == null) {
                    replace = null;
                } else {
                    replace = lbc.r(X12);
                }
            } else {
                TLRPC.Message message2 = r47Var.k;
                if (message2.post_author != null) {
                    if (this.k6 && r47Var.Z0() == r47.B0(r47Var.k)) {
                        j = 0;
                        replace = null;
                    } else {
                        replace = r47Var.k.post_author.replace("\n", "");
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
                                replace = ob6.M0(2131748974, "ImportedMessage");
                            } else {
                                j = 0;
                                try {
                                    Date date = new Date(i5 * 1000);
                                    str = String.format("%1$s, %2$s", ob6.D0().B0().format(date), ob6.D0().o0().format(date));
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    str = "LOC_ERR";
                                }
                                replace = str + " " + ob6.M0(2131748974, "ImportedMessage");
                            }
                        }
                    }
                    j = 0;
                    if (!r47Var.O3() && Z0 > 0 && r47Var.k.post && (X1 = uc7.s1(i4).X1(Long.valueOf(Z0))) != null) {
                        replace = lv2.m(0, X1.first_name, X1.last_name).replace('\n', ' ');
                    }
                    replace = null;
                }
            }
            j = 0;
        }
        if (r47.B0(r47Var.k) < j && (M0 = uc7.s1(i4).M0(Long.valueOf(-r47.B0(r47Var.k)))) != null && M0.signature_profiles && (r47Var.k.flags & 256) != 0) {
            replace = null;
        }
        if (this.Q5.p3()) {
            uc7.s1(i4).X1(Long.valueOf(Z0));
        }
        boolean x2 = r47Var.x2();
        if (!r47Var.r1 && !r47Var.k.edit_hide) {
            if (this.M != null && (m47Var = this.L) != null && !m47Var.d.isEmpty()) {
                this.vb = false;
                x2 = ((r47) this.L.d.get(0)).x2();
                if (!((r47) this.L.d.get(0)).k.edit_hide) {
                    int size = this.L.d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        r47 r47Var2 = (r47) this.L.d.get(i6);
                        if ((r47Var2.k.flags & 32768) != 0 || r47Var2.Y2()) {
                            this.vb = true;
                            break;
                        }
                    }
                }
            } else {
                if ((r47Var.k.flags & 32768) == 0 && !r47Var.Y2()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.vb = z4;
            }
        } else {
            this.vb = false;
        }
        r47 r47Var3 = this.Q5;
        boolean z6 = this.vb;
        m47 m47Var2 = this.L;
        if (m47Var2 != null) {
            ArrayList arrayList = m47Var2.d;
            i = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                r47 r47Var4 = (r47) arrayList.get(i7);
                if (r47Var4 != null && (message = r47Var4.k) != null) {
                    i = Math.max(i, message.edit_date);
                }
            }
        } else {
            i = r47Var.k.edit_date;
        }
        String N3 = N3(r47Var3, r47Var, z6, i);
        if (this.Q5.k.video_processing_pending) {
            N3 = ob6.a0(null, null, 2131745574, N3);
        }
        if (replace != null) {
            TLRPC.Message message3 = r47Var.k;
            if (message3.via_business_bot_id != j) {
                this.Q9 = qd4.o(N3, ", ");
            } else {
                TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
                if (messageFwdHeader2 != null && messageFwdHeader2.imported) {
                    this.Q9 = c00.i(" ", N3);
                } else {
                    this.Q9 = c00.i(", ", N3);
                }
            }
        } else {
            this.Q9 = N3;
        }
        TLRPC.MessageMedia n1 = r47.n1(this.Q5.k);
        if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null) {
            TLRPC.MessageMedia n12 = r47.n1(this.Q5.k);
            if ((n12 instanceof TLRPC.TL_messageMediaDice) && (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n12).game_outcome) != null) {
                j5 = tL_messages_emojiGameOutcome.stake_ton_amount;
            } else {
                j5 = j;
            }
            CharSequence concat = TextUtils.concat("💎", nza.K0(j5), "  ", this.Q9);
            this.Q9 = concat;
            this.Q9 = nza.S0(concat, 0.55f, hl.L(-0.33f), 1.05f);
        }
        if (r47.B0(this.Q5.k) < j) {
            j2 = getStarsPrice();
        } else {
            j2 = j;
        }
        if (j2 > j) {
            CharSequence concat2 = TextUtils.concat("⭐️", hl.o0((int) j2, 0), "  ", this.Q9);
            this.Q9 = concat2;
            this.Q9 = nza.Y0(false, concat2, 0.8f, null, hl.L(-0.33f), 0.94f);
        }
        TLRPC.Message message4 = this.Q5.k;
        if (message4 != null && (i3 = message4.schedule_repeat_period) != 0) {
            if (i3 == 31536000) {
                this.Q9 = TextUtils.concat(ob6.M0(2131748248, null), ", ", this.Q9);
            } else if (i3 == 15724800) {
                this.Q9 = TextUtils.concat(ob6.G(6, "MessageScheduledRepeatMonthlyMany", new Object[0]), ", ", this.Q9);
            } else if (i3 == 7862400) {
                this.Q9 = TextUtils.concat(ob6.G(3, "MessageScheduledRepeatMonthlyMany", new Object[0]), ", ", this.Q9);
            } else if (i3 == 2592000) {
                this.Q9 = TextUtils.concat(ob6.M0(2131748264, null), ", ", this.Q9);
            } else if (i3 == 1209600) {
                this.Q9 = TextUtils.concat(ob6.M0(2131748280, null), ", ", this.Q9);
            } else if (i3 == 604800) {
                this.Q9 = TextUtils.concat(ob6.M0(2131748249, null), ", ", this.Q9);
            } else if (i3 == 86400) {
                this.Q9 = TextUtils.concat(ob6.M0(2131748279, null), ", ", this.Q9);
            } else {
                this.Q9 = TextUtils.concat(ob6.a0(null, null, 2131748250, Integer.valueOf(i3)), ", ", this.Q9);
            }
        }
        TextPaint textPaint = aob.T2;
        CharSequence charSequence2 = this.Q9;
        if (charSequence2 == null) {
            length = 0;
        } else {
            length = charSequence2.length();
        }
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence2, 0, length));
        this.M9 = ceil;
        this.N9 = ceil;
        r47 r47Var5 = this.Q5;
        if ((r47Var5.r1 && r47Var5.k.date == 2147483646) || r47Var5.w1) {
            this.M9 = ceil - hl.L(8.0f);
        }
        rb2 rb2Var = this.eb;
        if (rb2Var != null && rb2Var.N() == 9) {
            z = true;
        } else {
            z = false;
        }
        TLRPC.Message message5 = r47Var.k;
        if ((message5.flags & 1024) != 0 && !z) {
            this.ra = ob6.S(null, Math.max(1, message5.views));
            this.qa = (int) Math.ceil(aob.T2.measureText(S2));
            this.M9 = (int) (this.qa + (((aob.T2.getTextSize() - hl.L(2.0f)) * aob.M3.getIntrinsicWidth()) / aob.M3.getIntrinsicHeight()) + hl.L(10.0f) + this.M9);
        }
        if (r47Var.D == 20) {
            ob6 D0 = ob6.D0();
            TLRPC.MessageMedia messageMedia = r47Var.k.media;
            String a0 = ob6.a0(null, null, 2131747138, D0.p(messageMedia.total_amount, messageMedia.currency).toUpperCase(Locale.ROOT));
            if (a0.length() >= 2) {
                a0 = a0.substring(0, 1).toUpperCase(locale) + a0.substring(1).toLowerCase(locale);
            }
            this.la = a0;
            this.ka = (int) Math.ceil(aob.v2.measureText(a0));
        }
        if (this.f6 && this.k6 && ((!this.o6 || this.m6) && x2)) {
            this.ua = ob6.S(null, getRepliesCount());
            this.ta = (int) Math.ceil(aob.T2.measureText(S));
            this.M9 = (int) (this.ta + (((aob.T2.getTextSize() - hl.L(2.0f)) * aob.Q3.getIntrinsicWidth()) / aob.Q3.getIntrinsicHeight()) + hl.L(10.0f) + this.M9);
        } else {
            this.ua = null;
        }
        if (this.q6) {
            this.M9 = uh9.w(3.0f, aob.U3.getIntrinsicWidth(), this.M9);
        }
        if (r47Var.r1) {
            if (r47Var.m4()) {
                this.M9 = hl.L(18.0f) + this.M9;
            } else if (r47Var.n4() && r47Var.k.peer_id.channel_id != j && !r47Var.z4()) {
                this.M9 = hl.L(18.0f) + this.M9;
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
                rb2 rb2Var2 = this.eb;
                if (rb2Var2 != null && rb2Var2.h()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                this.m0 = new ul(hl.L(14.0f), 23, this, z3);
            }
            if (this.k0 == this.Q5.e1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (effect != null) {
                if (!TextUtils.isEmpty(effect.emoticon)) {
                    this.m0.g(pv3.g(effect.emoticon), z2);
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
            this.M9 = hl.L(18.0f) + this.M9;
        }
        if (replace != null) {
            int i8 = this.V6;
            if (i8 == 0) {
                i8 = hl.L(1000.0f);
                this.V6 = i8;
            }
            int i9 = i8 - this.M9;
            if (r47Var.O3()) {
                if (r47Var.D == 5) {
                    L = hl.L(20.0f);
                } else {
                    L = hl.L(96.0f);
                }
                i9 -= L;
            }
            CharSequence m = pv3.m(replace, aob.T2.getFontMetricsInt(), false, null, 0);
            int ceil2 = (int) Math.ceil(aob.T2.measureText(m, 0, m.length()));
            this.P9 = Math.min(ceil2, i9);
            if (ceil2 > i9) {
                if (i9 <= 0) {
                    i2 = 0;
                } else {
                    charSequence = TextUtils.ellipsize(m, aob.T2, i9, TextUtils.TruncateAt.END);
                    i2 = i9;
                }
            } else {
                charSequence = m;
                i2 = ceil2;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (r47Var.k.via_business_bot_id != j) {
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

    public final void Z3(r47 r47Var) {
        String str;
        CharSequence concat;
        int i;
        if (r47Var != null && r47Var.l5()) {
            int i2 = 0;
            if (!r47Var.k4()) {
                concat = null;
            } else {
                TLRPC.Message message = r47Var.k;
                int i3 = message.ttl;
                if (i3 == Integer.MAX_VALUE) {
                    if (r47Var.Y2 == null) {
                        r47Var.Y2 = new SpannableString("v");
                        wm2 wm2Var = new wm2(2131231983, 0);
                        wm2Var.r = -hl.L(3.0f);
                        wm2Var.F = hl.L(13.0f);
                        SpannableString spannableString = r47Var.Y2;
                        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(r47Var.Y2, "1");
                } else {
                    int i4 = message.destroyTime;
                    if (i4 != 0) {
                        i3 = Math.max(0, i4 - ConnectionsManager.getInstance(r47Var.K1).getCurrentTime());
                    }
                    if (i3 < 60) {
                        str = bp1.n(i3, "s");
                    } else {
                        str = (i3 / 60) + "m";
                    }
                    if (r47Var.Z2 == null) {
                        r47Var.Z2 = new SpannableString("p");
                        wm2 wm2Var2 = new wm2(2131232565, 0);
                        wm2Var2.r = hl.L(1.0f);
                        wm2Var2.F = hl.L(13.0f);
                        SpannableString spannableString2 = r47Var.Z2;
                        spannableString2.setSpan(wm2Var2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(r47Var.Z2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(aob.C2.measureText((String) charSequence));
                    this.C3 = ceil;
                    this.x3 = new StaticLayout(TextUtils.ellipsize(charSequence, aob.C2, ceil, TextUtils.TruncateAt.END), aob.C2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = aob.D2;
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
        m47 m47Var = this.L;
        if ((m47Var == null || !m47Var.m.j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final void a0() {
        mh8 mh8Var;
        mh8 mh8Var2;
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.S3()) {
            cc2 cc2Var = this.x2;
            if (cc2Var != null && (mh8Var2 = cc2Var.n) != null) {
                mh8Var2.c();
            }
            cc2 cc2Var2 = this.x2;
            if (cc2Var2 != null && (mh8Var = cc2Var2.m) != null) {
                mh8Var.c();
            }
        }
    }

    public final void a1(Canvas canvas, sb2 sb2Var, int i, boolean z) {
        va6 va6Var;
        va6 va6Var2;
        va6 va6Var3;
        if (!z) {
            if (sb2Var.n && (va6Var3 = sb2Var.m) != null) {
                va6Var3.a();
            }
        } else if (!sb2Var.n && (va6Var = sb2Var.m) != null) {
            va6Var.c = -1L;
            va6Var.b = -1L;
        }
        sb2Var.n = z;
        float[] fArr = sb2Var.o;
        RectF rectF = sb2Var.d;
        if (!z && ((va6Var2 = sb2Var.m) == null || !va6Var2.d())) {
            va6 va6Var4 = sb2Var.m;
            if (va6Var4 != null) {
                va6Var4.b = -1L;
                return;
            }
            return;
        }
        va6 va6Var5 = sb2Var.m;
        if (va6Var5 == null) {
            va6Var5 = new va6();
            sb2Var.m = va6Var5;
            va6Var5.D = true;
            va6Var5.t = 3.5f;
            va6Var5.u = 0.5f;
        }
        va6Var5.g(aob.p1(0.1f, i), aob.p1(0.3f, i), aob.p1(0.3f, i), aob.p1(1.25f, i));
        Arrays.fill(fArr, hl.L(6.0f));
        RectF rectF2 = hl.P;
        rectF2.set(rectF.left - hl.L(6.0f), rectF.top - hl.L(4.0f), rectF.right + hl.L(6.0f), rectF.bottom + hl.L(4.0f));
        sb2Var.m.e(rectF2);
        sb2Var.m.i(fArr);
        sb2Var.m.x.setStrokeWidth(hl.L(1.0f));
        sb2Var.m.draw(canvas);
        invalidate();
    }

    public final int a2(int i) {
        return aob.v0(i, this.cc);
    }

    public final float a3() {
        dc2 dc2Var = this.ub;
        boolean z = dc2Var.G1;
        boolean z2 = this.w1;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            if (!z2) {
                f2 = 1.0f;
                f = 0.0f;
            }
            return hl.R1(f2, f, dc2Var.L1);
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
        int i10 = -hl.L(i + 92);
        dc2 dc2Var = this.ub;
        boolean z = dc2Var.x0;
        nb2 nb2Var = this.D4;
        xy9 xy9Var = this.E4;
        float f2 = 10.0f;
        if (z && ((b = this.M1) == 3 || b == 7)) {
            int i11 = this.b7;
            float f3 = i11;
            int i12 = (int) ((f3 - dc2Var.l0) + dc2Var.m0);
            int i13 = (int) ((f3 - dc2Var.h0) + dc2Var.i0);
            if (this.Kb && !this.I6) {
                i13 = (int) ((getVideoTranscriptionProgress() * hl.L(8.0f)) + i13);
                i12 += hl.L(8.0f);
            }
            if (dc2Var.l0 == 0.0f && dc2Var.m0 == 0.0f) {
                i12 = i13;
            }
            if (xy9Var != null) {
                if (dc2Var.o1) {
                    int L = (i13 + i10) - ((int) (hl.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f2 = 0.0f;
                    }
                    int L2 = L - hl.L(f2);
                    int L3 = hl.L(30.0f);
                    int i14 = i11 + i10;
                    if (!this.I4) {
                        i8 = -hl.L(34.0f);
                    } else {
                        i8 = 0;
                    }
                    int i15 = i14 + i8;
                    int i16 = i12 + i10;
                    if (this.I4) {
                        i9 = -hl.L(34.0f);
                    } else {
                        i9 = 0;
                    }
                    xy9Var.g(L2, L3, i15, i16 + i9);
                } else {
                    int L4 = (i13 + i10) - ((int) (hl.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f2 = 0.0f;
                    }
                    xy9Var.g(L4 - hl.L(f2), hl.L(30.0f), (i11 + i10) - ((int) (hl.L(34.0f) * getUseTranscribeButtonProgress())), (i12 + i10) - ((int) (hl.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (nb2Var != null) {
                int useTranscribeButtonProgress = i13 - ((int) (getUseTranscribeButtonProgress() * hl.L(34.0f)));
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
                nb2Var.h(useTranscribeButtonProgress - hl.L(i6 + i7), hl.L(30.0f));
                return;
            }
            return;
        }
        if (xy9Var != null) {
            boolean z2 = dc2Var.o1;
            int i17 = this.b7 + i10;
            if (z2) {
                int L5 = i17 - ((int) (hl.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.R1) {
                    f = 10.0f;
                } else {
                    f = 0.0f;
                }
                int L6 = L5 - hl.L(f);
                int L7 = hl.L(30.0f);
                int i18 = this.b7 + i10;
                if (!this.I4) {
                    i4 = -hl.L(34.0f);
                } else {
                    i4 = 0;
                }
                int i19 = i18 + i4;
                if (!this.R1) {
                    f2 = 0.0f;
                }
                int L8 = i19 - hl.L(f2);
                int i20 = this.b7 + i10;
                if (this.I4) {
                    i5 = -hl.L(34.0f);
                } else {
                    i5 = 0;
                }
                xy9Var.g(L6, L7, L8, i20 + i5);
            } else {
                int L9 = i17 - ((int) (hl.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.R1) {
                    f2 = 0.0f;
                }
                int L10 = L9 - hl.L(f2);
                xy9Var.g(L10, hl.L(30.0f), L10, L10);
            }
        }
        if (nb2Var != null) {
            int useTranscribeButtonProgress2 = this.b7 - ((int) (getUseTranscribeButtonProgress() * hl.L(34.0f)));
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
            nb2Var.h(useTranscribeButtonProgress2 - hl.L(i2 + i3), hl.L(30.0f));
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

    public final void b0(boolean z) {
        r47 r47Var;
        boolean z2;
        r47 r47Var2;
        byte[] bArr;
        cc2 cc2Var = this.x2;
        if (cc2Var != null && cc2Var.k != null && (r47Var = this.Q5) != null && r47Var.S3()) {
            TLRPC.MessageMedia m1 = r47.m1(this.Q5);
            boolean z3 = false;
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                z2 = ((TLRPC.TL_messageMediaPoll) m1).poll.multiple_choice;
            } else {
                z2 = false;
            }
            ai8 ai8Var = this.x2.k;
            if (z2) {
                r7a B = r7a.B(this.a6);
                if (this.Q5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) B.w.get("poll_" + r47Var2.D1());
                }
                if (bArr != null) {
                    z3 = true;
                }
            }
            fm0 fm0Var = ai8Var.f;
            if (fm0Var.f != z3) {
                fm0Var.a(z3, z);
            }
        }
    }

    public final void b1(Canvas canvas, float f) {
        p47 p47Var;
        x49 x49Var;
        Paint paint;
        sb2 sb2Var;
        sb2 sb2Var2;
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
                compactLeft = Math.max(compactLeft, this.s3 + p47Var.c);
            }
            if (this.O1) {
                nl nlVar = this.U0;
                if (nlVar.R0) {
                    compactLeft = Math.max(compactLeft, nlVar.w());
                }
            }
            if (this.w9 && this.h9 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.r9);
            }
            if (this.vc && (sb2Var2 = this.tc) != null) {
                compactLeft = Math.max(compactLeft, sb2Var2.d.right);
            }
            if (this.wc && (sb2Var = this.uc) != null) {
                compactLeft = Math.max(compactLeft, sb2Var.d.right);
            }
            if (!this.O.p) {
                compactLeft = Math.max(compactLeft, x49Var.b + x49Var.o);
            }
            if (this.Q5.D != 0 && !this.O1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - hl.L(10.0f));
            }
            if (this.L9 != null) {
                compactLeft = Math.max(compactLeft, this.O9 + this.M9);
            }
            float L = hl.L(8.0f);
            RectF rectF = hl.P;
            rectF.set(L, hl.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - hl.L(2.0f));
            this.Cd.setColor(aob.v0(aob.ua, this.cc));
            this.Cd.setAlpha((int) (paint.getAlpha() * f));
            float L2 = hl.L(xea.U0);
            canvas.drawRoundRect(rectF, L2, L2, this.Cd);
        }
    }

    public final Drawable b2(String str) {
        Drawable drawable;
        vnb vnbVar = this.cc;
        if (vnbVar != null) {
            drawable = vnbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return aob.P0(str);
    }

    public final boolean b3() {
        r47 r47Var;
        if (!v2()) {
            if (!this.f6 || this.i6 || ((this.H6 && !this.l6) || (r47Var = this.Q5) == null || r47Var.O3() || !this.Q5.j5())) {
                r47 r47Var2 = this.Q5;
                if (r47Var2 == null || r47.B0(r47Var2.k) != 489000) {
                    r47 r47Var3 = this.Q5;
                    if (r47Var3 != null) {
                        if (r47Var3.l2 || r47Var3.k.guestchat_via_from != null) {
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
        if (getDelegate() != null && getDelegate().l2() != null && getDelegate().l2().y(this.Q5)) {
            bmb l2 = getDelegate().l2();
            int i3 = 0;
            if (l2.q0) {
                c = 2;
            } else if (l2.s0) {
                c = 3;
            } else if (l2.u0) {
                c = 4;
            } else if (f2()) {
                c = 1;
            } else {
                c = 0;
            }
            if (c == 2) {
                if (this.T1) {
                    i2 = this.p0 - hl.L(10.0f);
                } else {
                    boolean z = this.U1;
                    int i4 = this.p0;
                    if (z) {
                        L2 = hl.L(1.0f);
                    } else {
                        L2 = hl.L(1.0f);
                    }
                    i2 = L2 + i4;
                }
                getDelegate().l2().b0(hl.L(10.0f) + i2 + this.a2, this.Y1);
            } else if (c == 1) {
                S3();
                getDelegate().l2().b0((int) this.s3, (int) this.t3);
            } else if (c == 3) {
                m47 m47Var = this.L;
                if (m47Var != null && !m47Var.i) {
                    i = (int) this.s3;
                } else {
                    float f = 12.0f;
                    if (this.Q5.O3()) {
                        i = getExtraTextX() + hl.L(12.0f) + this.N6;
                        if (this.Q5.D == 19) {
                            i -= Math.max(0, (hl.L(14.0f) + (Math.max(this.X7, this.Z7) + i)) - hl.q.x);
                        }
                    } else {
                        boolean z2 = this.C6;
                        int i5 = this.N6;
                        if (z2) {
                            L = hl.L(12.0f) + i5;
                            extraTextX = getExtraTextX();
                        } else {
                            if (!this.K) {
                                f = 18.0f;
                            }
                            L = hl.L(f) + i5;
                            extraTextX = getExtraTextX();
                        }
                        i = L + extraTextX;
                    }
                }
                int L3 = ((int) (i + this.ub.h0)) - hl.L(1.33f);
                int i6 = this.r0;
                S3();
                bmb l22 = getDelegate().l2();
                int L4 = hl.L(10.0f) + L3;
                yb2 yb2Var = this.s0;
                if (yb2Var != null) {
                    i3 = yb2Var.o;
                }
                l22.b0(L4 - i3, hl.L(22.0f) + i6);
            } else {
                getDelegate().l2().b0(this.o0, this.u0);
            }
        }
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        rb2 rb2Var = this.eb;
        if (rb2Var != null) {
            rb2Var.V0(this, reactionCount, z, f, f2);
        }
    }

    public final boolean c0(MotionEvent motionEvent) {
        sb2 sb2Var;
        sb2 sb2Var2;
        sb2 sb2Var3;
        sb2 sb2Var4;
        rb2 rb2Var;
        int i;
        wb2 wb2Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.vc && !this.wc) {
            if (this.Q7 != null && (rb2Var = this.eb) != null && rb2Var.c0()) {
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
                            hf0 hf0Var = this.Wa;
                            if (hf0Var != null) {
                                hf0Var.setHotspot(x, P1);
                                this.f8 = false;
                                this.g8 = true;
                                postDelayed(new ib2(this, (byte) 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            v41 v41Var = this.Ra;
                            if (v41Var != null) {
                                v41Var.c(true);
                                this.Ua = x;
                                this.Va = P1;
                            }
                            x();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.e8) {
                            o();
                            this.e8 = false;
                            hf0 hf0Var2 = this.Wa;
                            if (hf0Var2 != null) {
                                if (!this.f8) {
                                    hf0Var2.setState(new int[]{16842919, 16842910});
                                    post(new ib2(this, (byte) 4));
                                } else {
                                    hf0Var2.setState(new int[0]);
                                }
                                this.f8 = false;
                                this.g8 = false;
                                invalidate();
                            }
                            v41 v41Var2 = this.Ra;
                            if (v41Var2 != null) {
                                v41Var2.c(false);
                            }
                            playSoundEffect(0);
                            boolean z = this.Ja;
                            rb2 rb2Var2 = this.eb;
                            if (z) {
                                if (rb2Var2 != null) {
                                    TLRPC.Chat chat = this.Ga;
                                    if (chat != null) {
                                        rb2Var2.T1(this, chat, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                                        wb2Var = this;
                                    } else {
                                        wb2Var = this;
                                        TLRPC.User user = wb2Var.Ea;
                                        if (user != null) {
                                            rb2Var2.W(wb2Var, user, wb2Var.h1, wb2Var.i1);
                                        } else if (wb2Var.Ha != null) {
                                            rb2Var2.N0(wb2Var);
                                        }
                                    }
                                }
                            } else {
                                wb2Var = this;
                                if (rb2Var2 != null && (wb2Var.Q5.B2() || wb2Var.Q5.e4() || wb2Var.M7 || ((message = wb2Var.Q5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    wb2Var.eb.H(wb2Var, wb2Var.Q5.N1(), x, P1, false);
                                }
                            }
                        }
                    } else {
                        wb2Var = this;
                        if (motionEvent.getAction() == 3) {
                            wb2Var.e8 = false;
                            wb2Var.f8 = false;
                            hf0 hf0Var3 = wb2Var.Wa;
                            if (hf0Var3 != null) {
                                hf0Var3.setState(new int[0]);
                            }
                            wb2Var.invalidate();
                            v41 v41Var3 = wb2Var.Ra;
                            if (v41Var3 != null) {
                                v41Var3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x >= wb2Var.U7 && x <= i) {
                                float f2 = wb2Var.V7;
                                if (P1 >= f2 && P1 <= f2 + wb2Var.W7) {
                                    if (wb2Var.Wa != null && wb2Var.g8) {
                                        if (Math.sqrt(Math.pow((wb2Var.getY() + P1) - wb2Var.j8, 2.0d) + Math.pow(x - wb2Var.i8, 2.0d)) > 0.75d) {
                                            wb2Var.g8 = false;
                                        }
                                    }
                                }
                            }
                            wb2Var.e8 = false;
                            wb2Var.f8 = false;
                            wb2Var.g8 = false;
                            hf0 hf0Var4 = wb2Var.Wa;
                            if (hf0Var4 != null) {
                                hf0Var4.setState(new int[0]);
                            }
                            wb2Var.invalidate();
                            v41 v41Var4 = wb2Var.Ra;
                            if (v41Var4 != null) {
                                v41Var4.c(false);
                            }
                        }
                    }
                    return wb2Var.e8;
                }
                wb2Var = this;
                return wb2Var.e8;
            }
        } else {
            float x2 = motionEvent.getX();
            float P12 = P1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.eb != null) {
                    if (this.vc && (sb2Var4 = this.tc) != null && F2(sb2Var4, x2, P12)) {
                        sb2Var2 = this.tc;
                    } else if (this.wc && (sb2Var3 = this.uc) != null && F2(sb2Var3, x2, P12)) {
                        sb2Var2 = this.uc;
                    } else {
                        sb2Var2 = null;
                    }
                    if (sb2Var2 != null && (sb2Var2.a || this.eb.c0())) {
                        this.yc = sb2Var2;
                        sb2Var2.e.c(true);
                        hf0 hf0Var5 = sb2Var2.k;
                        if (hf0Var5 != null) {
                            hf0Var5.setHotspot(x2, P12);
                            sb2Var2.k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        x();
                        return true;
                    }
                }
            } else if (action == 1) {
                sb2 sb2Var5 = this.yc;
                if (sb2Var5 != null) {
                    o();
                    g3();
                    playSoundEffect(0);
                    if (sb2Var5.a) {
                        TLRPC.Chat chat2 = this.Ga;
                        if (chat2 != null) {
                            this.eb.T1(this, chat2, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.Ea;
                        rb2 rb2Var3 = this.eb;
                        if (user2 != null) {
                            rb2Var3.W(this, user2, this.h1, this.i1);
                            return true;
                        }
                        rb2Var3.N0(this);
                        return true;
                    }
                    this.eb.H(this, this.Q5.N1(), x2, P12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    g3();
                } else if (action == 2 && (sb2Var = this.yc) != null && !F2(sb2Var, x2, P12)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.c1(android.graphics.Canvas, boolean):void");
    }

    public Paint c2(String str) {
        Paint paint;
        vnb vnbVar = this.cc;
        if (vnbVar != null) {
            paint = vnbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return aob.T0(str);
    }

    public final f66 c3() {
        f66 f66Var;
        ArrayList arrayList = this.w4;
        if (!arrayList.isEmpty()) {
            f66Var = (f66) arrayList.get(0);
            arrayList.remove(0);
        } else {
            f66Var = new f66(0);
        }
        f66Var.reset();
        this.x4.add(f66Var);
        return f66Var;
    }

    public final void c4(int i, int i2) {
        ArrayList arrayList;
        p47 p47Var = this.m3;
        dc2 dc2Var = this.ub;
        if (p47Var != null && (arrayList = p47Var.e) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                o47 o47Var = (o47) obj;
                ArrayList arrayList2 = o47Var.y;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((npa) obj2).i((i - o47Var.p(this.m3.e, dc2Var)) - this.s3, getWidth(), (i2 - o47Var.p(this.m3.e, dc2Var)) - this.t3);
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
                ((npa) obj3).i(i + height, getWidth(), i2 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            ArrayList arrayList4 = getMessageObject().B2;
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                o47 o47Var2 = (o47) obj4;
                ArrayList arrayList5 = o47Var2.y;
                int size5 = arrayList5.size();
                int i7 = 0;
                while (i7 < size5) {
                    Object obj5 = arrayList5.get(i7);
                    i7++;
                    ((npa) obj5).i((i - o47Var2.p(getMessageObject().B2, dc2Var)) - this.u0, getWidth(), (i2 - o47Var2.p(getMessageObject().B2, dc2Var)) - this.u0);
                }
            }
        }
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        mj1 mj1Var = this.w;
        if (mj1Var != null) {
            mj1Var.b();
        }
    }

    public final boolean d0(MotionEvent motionEvent) {
        r47 r47Var = this.Q5;
        if (r47Var == null || r47Var.y2 == null || r47Var.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.i0 + this.u0;
        motionEvent.offsetLocation(-this.o0, -topicSeparatorTopPadding);
        hl9 hl9Var = this.Q5.y2;
        rb2 rb2Var = this.eb;
        hl9Var.E = this;
        hl9Var.F = rb2Var;
        boolean L = hl9Var.L(motionEvent);
        motionEvent.offsetLocation(this.o0, topicSeparatorTopPadding);
        return L;
    }

    public final void d1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.d1(android.graphics.Canvas):void");
    }

    public final float d2(float f) {
        float f2;
        float f3;
        if (y2() && this.L9 != null) {
            return getCompactNameTimeY();
        }
        if (I3() && this.M1 != 7) {
            return ((getPhotoBottom() + this.w0) - hl.L(7.3f)) - this.L9.getHeight();
        }
        int i = this.e7;
        if (!this.G && !this.F) {
            f2 = 6.5f;
        } else {
            f2 = 7.5f;
        }
        float L = ((i - hl.L(f2)) - this.L9.getHeight()) + f;
        boolean z = this.Kb;
        dc2 dc2Var = this.ub;
        if (z && !v2()) {
            if (this.K) {
                f3 = 4.0f;
            } else {
                f3 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.O.i(dc2Var.L1) + hl.L(f3));
        }
        m47 m47Var = this.L;
        if (m47Var != null) {
            l47 l47Var = m47Var.m;
            float f4 = L + l47Var.h;
            if (l47Var.j) {
                return f4 - getTranslationY();
            }
            return f4;
        }
        return (dc2Var.j0 - dc2Var.k0) + L;
    }

    public final t37 d3(String str) {
        ?? r1;
        int i;
        int i2;
        boolean o;
        int i3;
        Integer valueOf;
        t37 t37Var = (t37) b2(str);
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.O3() && R2()) {
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
            vnb vnbVar = this.cc;
            int i5 = c1d.c[0];
            if (vnbVar != null) {
                i2 = vnbVar.j(i5);
            } else {
                i2 = aob.lm.get(i5);
            }
            if (i2 == 0) {
                valueOf = null;
            } else {
                if (vnbVar != null) {
                    o = vnbVar.a();
                } else {
                    o = aob.I.o();
                }
                int b = c1d.b(vnbVar, true);
                if (o) {
                    i3 = -16777216;
                } else {
                    i3 = -1;
                }
                int v = aob.v(i3, b);
                if (r1 != 0) {
                    v = aob.v(v, aob.v0(aob.Sc, vnbVar));
                }
                valueOf = Integer.valueOf(v);
            }
            if (valueOf != null) {
                t37[] t37VarArr = this.pc;
                if (t37VarArr == null) {
                    t37VarArr = new t37[4];
                    this.pc = t37VarArr;
                }
                if (i != 0) {
                    i4 = 2;
                }
                int i6 = i4 + r1;
                if (t37VarArr[i6] == null) {
                    t37VarArr[i6] = new t37(i, true, r1, this.cc);
                }
                t37 t37Var2 = this.pc[i6];
                t37Var2.w = valueOf;
                return t37Var2;
            }
        }
        return t37Var;
    }

    public void d4() {
        int i;
        r47 r47Var = this.Q5;
        if (r47Var == null) {
            return;
        }
        float f = this.vd + this.wd;
        if (!r47Var.O3() || this.Q5.D2) {
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
            f += hl.L(71 - i) * this.Z6;
        }
        setTranslationX(f);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        if (i == jn7.m1) {
            setSpoilersSuppressed(false);
        } else if (i == jn7.l1) {
            setSpoilersSuppressed(true);
        } else if (i == jn7.E0) {
            TLRPC.User user = this.va;
            if (user != null && user.id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.Q5);
            }
        } else if (i == jn7.l4) {
            invalidate();
        } else if (i == jn7.Y2 && (r47Var = this.Q5) != null) {
            TLRPC.MessageMedia messageMedia = r47Var.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                z3(r47Var, this.L, this.G, this.F, this.H, false);
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
        npa npaVar;
        int i3;
        int i4;
        p47 p47Var;
        p47 p47Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        m47 m47Var;
        if (i <= 15 && getParent() != null) {
            boolean z = true;
            if (this.Q5.z2() && (m47Var = this.L) != null && !m47Var.i) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt instanceof wb2) {
                        wb2 wb2Var = (wb2) childAt;
                        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
                        j47 currentPosition = wb2Var.getCurrentPosition();
                        if (currentMessagesGroup != null && currentMessagesGroup.a == this.L.a) {
                            int i10 = currentPosition.l;
                            if ((i10 & 8) != 0 && (i10 & 1) != 0 && wb2Var != this) {
                                motionEvent.offsetLocation(getLeft() - wb2Var.getLeft(), getTop() - wb2Var.getTop());
                                boolean e0 = wb2Var.e0(i + 1, motionEvent);
                                motionEvent.offsetLocation(-(getLeft() - wb2Var.getLeft()), -(getTop() - wb2Var.getTop()));
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
                dc2 dc2Var = this.ub;
                if (actionMasked == 0) {
                    int i11 = this.o0;
                    if (x >= i11 && P1 >= (i7 = this.u0)) {
                        r47 r47Var = this.Q5;
                        if (x <= i11 + r47Var.v2 && P1 <= r47Var.V5(dc2Var) + i7) {
                            ArrayList arrayList = this.Q5.B2;
                            for (int i12 = 0; i12 < arrayList.size() && ((o47) arrayList.get(i12)).p(this.Q5.B2, dc2Var) <= P1; i12++) {
                                o47 o47Var = (o47) arrayList.get(i12);
                                if (o47Var.l()) {
                                    i8 = (int) this.Q5.x2;
                                } else {
                                    i8 = 0;
                                }
                                ArrayList arrayList2 = o47Var.y;
                                int size = arrayList2.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList2.get(i13);
                                    i13++;
                                    npa npaVar2 = (npa) obj;
                                    boolean z2 = z;
                                    if (npaVar2.getBounds().contains((x - this.o0) + i8, (int) ((P1 - this.u0) - o47Var.p(this.Q5.B2, dc2Var)))) {
                                        this.O5 = npaVar2;
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
                            if (f3 >= f4 && f <= f2 + p47Var.c && f3 <= f4 + p47Var.c(dc2Var)) {
                                ArrayList arrayList3 = this.m3.e;
                                for (int i14 = 0; i14 < arrayList3.size() && ((o47) arrayList3.get(i14)).p(this.m3.e, dc2Var) <= f3; i14++) {
                                    o47 o47Var2 = (o47) arrayList3.get(i14);
                                    if (o47Var2.l()) {
                                        i6 = (int) this.m3.d;
                                    } else {
                                        i6 = 0;
                                    }
                                    ArrayList arrayList4 = o47Var2.y;
                                    int size2 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = arrayList4.get(i15);
                                        i15++;
                                        npa npaVar3 = (npa) obj2;
                                        ArrayList arrayList5 = arrayList3;
                                        float f5 = f;
                                        if (npaVar3.getBounds().contains((int) ((f - this.s3) + i6), (int) ((f3 - this.t3) - o47Var2.p(this.m3.e, dc2Var)))) {
                                            this.O5 = npaVar3;
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
                            if (f8 > f9 && f6 <= f7 + p47Var2.c && f8 <= f9 + p47Var2.c(dc2Var)) {
                                ArrayList arrayList6 = this.q3.e;
                                for (int i16 = 0; i16 < arrayList6.size() && ((o47) arrayList6.get(i16)).p(this.q3.e, dc2Var) <= f8; i16++) {
                                    o47 o47Var3 = (o47) arrayList6.get(i16);
                                    if (o47Var3.l()) {
                                        i5 = (int) this.q3.d;
                                    } else {
                                        i5 = 0;
                                    }
                                    ArrayList arrayList7 = o47Var3.y;
                                    int size3 = arrayList7.size();
                                    int i17 = 0;
                                    while (i17 < size3) {
                                        Object obj3 = arrayList7.get(i17);
                                        i17++;
                                        npa npaVar4 = (npa) obj3;
                                        if (npaVar4.getBounds().contains((int) ((f6 - this.u5) + i5), (int) ((f8 - this.v5) - o47Var3.p(this.q3.e, dc2Var)))) {
                                            this.O5 = npaVar4;
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
                    p47 p47Var3 = this.q3;
                    if (p47Var3 != null) {
                        ArrayList arrayList8 = p47Var3.e;
                        int size4 = arrayList8.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            Object obj4 = arrayList8.get(i18);
                            i18++;
                            o47 o47Var4 = (o47) obj4;
                            ArrayList arrayList9 = o47Var4.y;
                            int size5 = arrayList9.size();
                            int i19 = 0;
                            while (i19 < size5) {
                                int i20 = i19 + 1;
                                Rect bounds = ((npa) arrayList9.get(i19)).getBounds();
                                path.addRect(bounds.left, o47Var4.p(this.q3.e, dc2Var) + bounds.top, bounds.right, o47Var4.p(this.q3.e, dc2Var) + bounds.bottom, Path.Direction.CW);
                                i19 = i20;
                            }
                        }
                    }
                    p47 p47Var4 = this.m3;
                    if (p47Var4 != null) {
                        ArrayList arrayList10 = p47Var4.e;
                        int size6 = arrayList10.size();
                        int i21 = 0;
                        while (i21 < size6) {
                            Object obj5 = arrayList10.get(i21);
                            i21++;
                            o47 o47Var5 = (o47) obj5;
                            ArrayList arrayList11 = o47Var5.y;
                            int size7 = arrayList11.size();
                            int i22 = 0;
                            while (i22 < size7) {
                                int i23 = i22 + 1;
                                Rect bounds2 = ((npa) arrayList11.get(i22)).getBounds();
                                path.addRect(bounds2.left, o47Var5.p(this.m3.e, dc2Var) + bounds2.top, bounds2.right, o47Var5.p(this.m3.e, dc2Var) + bounds2.bottom, Path.Direction.CW);
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
                                o47 o47Var6 = (o47) obj6;
                                ArrayList arrayList13 = o47Var6.y;
                                int size9 = arrayList13.size();
                                int i25 = 0;
                                while (i25 < size9) {
                                    int i26 = i25 + 1;
                                    Rect bounds3 = ((npa) arrayList13.get(i25)).getBounds();
                                    path.addRect(bounds3.left, o47Var6.p(this.Q5.B2, dc2Var) + bounds3.top, bounds3.right, o47Var6.p(this.Q5.B2, dc2Var) + bounds3.bottom, Path.Direction.CW);
                                    i25 = i26;
                                }
                            }
                        }
                    }
                    RectF rectF = this.c4;
                    path.computeBounds(rectF, false);
                    float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
                    this.P5 = true;
                    this.O5.q = new ib2(this, (byte) 9);
                    p47 p47Var5 = this.q3;
                    if (p47Var5 != null) {
                        ArrayList arrayList14 = p47Var5.e;
                        int size10 = arrayList14.size();
                        int i27 = 0;
                        while (i27 < size10) {
                            Object obj7 = arrayList14.get(i27);
                            i27++;
                            o47 o47Var7 = (o47) obj7;
                            if (o47Var7.l()) {
                                i4 = (int) this.q3.d;
                            } else {
                                i4 = 0;
                            }
                            ArrayList arrayList15 = o47Var7.y;
                            int size11 = arrayList15.size();
                            int i28 = 0;
                            while (i28 < size11) {
                                Object obj8 = arrayList15.get(i28);
                                i28++;
                                ((npa) obj8).j((x - this.u5) + i4, (P1 - o47Var7.p(this.q3.e, dc2Var)) - this.v5, sqrt, false);
                                arrayList14 = arrayList14;
                            }
                        }
                    }
                    p47 p47Var6 = this.m3;
                    if (p47Var6 != null) {
                        ArrayList arrayList16 = p47Var6.e;
                        int size12 = arrayList16.size();
                        int i29 = 0;
                        while (i29 < size12) {
                            Object obj9 = arrayList16.get(i29);
                            i29++;
                            o47 o47Var8 = (o47) obj9;
                            if (o47Var8.l()) {
                                i3 = (int) this.m3.d;
                            } else {
                                i3 = 0;
                            }
                            ArrayList arrayList17 = o47Var8.y;
                            int size13 = arrayList17.size();
                            int i30 = 0;
                            while (i30 < size13) {
                                Object obj10 = arrayList17.get(i30);
                                i30++;
                                ((npa) obj10).j((x - this.s3) + i3, (P1 - o47Var8.p(this.m3.e, dc2Var)) - this.t3, sqrt, false);
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
                                o47 o47Var9 = (o47) obj11;
                                if (o47Var9.l()) {
                                    i2 = (int) this.Q5.x2;
                                } else {
                                    i2 = 0;
                                }
                                ArrayList arrayList19 = o47Var9.y;
                                int size15 = arrayList19.size();
                                int i32 = 0;
                                while (i32 < size15) {
                                    Object obj12 = arrayList19.get(i32);
                                    i32++;
                                    ((npa) obj12).j((x - this.o0) + i2, (P1 - o47Var9.p(this.Q5.B2, dc2Var)) - this.u0, sqrt, false);
                                }
                            }
                        }
                    }
                    if (getParent() instanceof d79) {
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        for (int i33 = 0; i33 < viewGroup2.getChildCount(); i33++) {
                            View childAt2 = viewGroup2.getChildAt(i33);
                            if (childAt2 instanceof wb2) {
                                wb2 wb2Var2 = (wb2) childAt2;
                                ArrayList arrayList20 = wb2Var2.fc;
                                if (wb2Var2.getMessageObject() != null && wb2Var2.getMessageObject().N1() == getMessageObject().e1() && !arrayList20.isEmpty()) {
                                    ((npa) arrayList20.get(0)).q = new ea2(this, wb2Var2, (byte) 7);
                                    int size16 = arrayList20.size();
                                    int i34 = 0;
                                    while (i34 < size16) {
                                        Object obj13 = arrayList20.get(i34);
                                        i34++;
                                        ((npa) obj13).j(npaVar.getBounds().centerX(), npaVar.getBounds().centerY(), sqrt, false);
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
                TLRPC.TodoItem todoItem = ((vb2) arrayList.get(i2)).t;
                if (todoItem != null && todoItem.id == i) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final void e3(r47 r47Var) {
        final int i = this.a6;
        ea2 ea2Var = new ea2(this, r47Var, (byte) 5);
        uo3 uo3Var = ve8.a;
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null) {
            final long j = F0.id;
            if (!uc7.s1(i).k4.D0.f && ve8.b.get(Long.valueOf(j)) == null && !ve8.c.containsKey(Long.valueOf(j))) {
                HashMap hashMap = ve8.d;
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.add(ea2Var);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ea2Var);
                hashMap.put(Long.valueOf(j), arrayList2);
                final TLRPC.Message message = r47Var.k;
                final String language = ob6.D0().y.getLanguage();
                final float f = hl.p;
                uo3 uo3Var2 = ve8.a;
                if (uo3Var2 == null) {
                    uo3Var2 = new uo3("pkpass", true);
                    ve8.a = uo3Var2;
                }
                uo3Var2.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue8.run():void");
                    }
                });
            }
        }
    }

    public final void e4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.e4():void");
    }

    @Override
    public final void f(Canvas canvas, float f) {
        if (this.yd == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        Path path = this.zd;
        path.rewind();
        path.addRoundRect(this.yd, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
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

    public final void f0() {
        byte b;
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
            if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null && !this.R) {
                Drawable t = this.U0.t();
                if (t instanceof a29) {
                    a29 a29Var = (a29) t;
                    if ((a29Var.n0 != null || a29Var.Z0) && !this.R && (b = a29Var.K) != 1 && b == 2) {
                        if (!a29Var.Y0) {
                            float o = a29Var.o();
                            if (a29Var.V0 != null) {
                                o = a29Var.b0 / a29Var.b1;
                            }
                            if (o <= 0.95f) {
                                return;
                            }
                        }
                        this.R = true;
                        rb2 rb2Var = this.eb;
                        if (rb2Var != null) {
                            rb2Var.l1(this, false);
                        }
                    }
                }
            }
        }
    }

    public final void f1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        if (this.m3 != null) {
            return true;
        }
        return false;
    }

    public final void f3() {
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.B2 != null) {
            for (int i = 0; i < this.Q5.B2.size(); i++) {
                o47 o47Var = (o47) this.Q5.B2.get(i);
                hf0 hf0Var = o47Var.T;
                if (hf0Var != null) {
                    hf0Var.setCallback(this);
                    o47Var.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.m3 != null) {
            for (int i2 = 0; i2 < this.m3.e.size(); i2++) {
                o47 o47Var2 = (o47) this.m3.e.get(i2);
                hf0 hf0Var2 = o47Var2.T;
                if (hf0Var2 != null) {
                    hf0Var2.setCallback(this);
                    o47Var2.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (v2()) {
            invalidate();
        }
    }

    public final nm9 f4() {
        if (this.Q5 != null && R2()) {
            return (nm9) this.Q5.y2.g.get(0);
        }
        return null;
    }

    @Override
    public final void g(float f) {
        r47 r47Var = this.Q5;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(this.Q5, f);
        W3();
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
                hf0 hf0Var = this.v8;
                if (hf0Var != null) {
                    hf0Var.setHotspot(x, P1);
                    this.v8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ta.i && !rectF.contains(x, P1)) {
                this.Ta.c(false);
                hf0 hf0Var2 = this.v8;
                if (hf0Var2 != null) {
                    hf0Var2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ta.i) {
                this.eb.G(this);
            }
            this.Ta.c(false);
            hf0 hf0Var3 = this.v8;
            if (hf0Var3 != null) {
                hf0Var3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ta.c(false);
            hf0 hf0Var4 = this.v8;
            if (hf0Var4 != null) {
                hf0Var4.setState(new int[0]);
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
        r47 r47Var = this.Q5;
        if (r47Var != null && !r47Var.q4()) {
            float f3 = this.u0;
            dc2 dc2Var = this.ub;
            if (dc2Var.m2) {
                float f4 = dc2Var.o2;
                float f5 = dc2Var.L1;
                f = (f5 * f3) + ((1.0f - f5) * f4);
            } else {
                f = f3;
            }
            if (dc2Var.L1 != 1.0f && dc2Var.H0) {
                canvas.save();
                t37 t37Var = this.L6;
                if (t37Var != null) {
                    Rect bounds = t37Var.getBounds();
                    if (this.Q5.O3() && !this.C6 && !this.G) {
                        canvas.clipRect(hl.L(4.0f) + bounds.left, hl.L(4.0f) + bounds.top, bounds.right - hl.L(10.0f), bounds.bottom - hl.L(4.0f));
                    } else {
                        canvas.clipRect(hl.L(4.0f) + bounds.left, hl.L(4.0f) + bounds.top, bounds.right - hl.L(4.0f), bounds.bottom - hl.L(4.0f));
                    }
                }
                ui7 ui7Var = this.Mc;
                if (ui7Var != null && ui7Var.h) {
                    r47 r47Var2 = this.Q5;
                    f1(this.o0, f, canvas, r47Var2.B2, r47Var2.x2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.o0, f, canvas, dc2Var.I0, dc2Var.O0, false, 1.0f - dc2Var.L1, true, false, false, false);
                    r47 r47Var3 = this.Q5;
                    f1(this.o0, f, canvas, r47Var3.B2, r47Var3.x2, true, dc2Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            boolean z = dc2Var.E1;
            if (z && this.L6 != null) {
                if (z) {
                    int i3 = -1;
                    if (this.v1) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    float A = qd4.A(1.0f, dc2Var.L1, this.Q5.V5(dc2Var) * i2, f3);
                    float f6 = dc2Var.o2;
                    if (this.v1) {
                        i3 = 1;
                    }
                    f2 = A;
                    f = f6 - ((this.Q5.V5(dc2Var) * i3) * dc2Var.L1);
                } else {
                    f2 = f;
                }
                canvas.save();
                RectF rectF = hl.P;
                rectF.set(this.L6.getBounds());
                if (this.Q5.O3() && !this.C6 && !this.G) {
                    rectF.left += hl.L(4.0f);
                    L = rectF.right - hl.L(10.0f);
                    rectF.right = L;
                } else {
                    rectF.left += hl.L(4.0f);
                    L = rectF.right - hl.L(4.0f);
                    rectF.right = L;
                }
                float f7 = rectF.left;
                float f8 = dc2Var.o2;
                canvas.clipRect(f7, f8, L, this.Q5.V5(dc2Var) + f8 + hl.L(4.0f));
                r47 r47Var4 = this.Q5;
                f1(this.o0, f, canvas, r47Var4.B2, r47Var4.x2, false, 1.0f - dc2Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.L6.getBounds());
                if (this.Q5.O3() && !this.C6 && !this.G) {
                    rectF.left += hl.L(4.0f);
                    L2 = rectF.right - hl.L(10.0f);
                    rectF.right = L2;
                } else {
                    rectF.left += hl.L(4.0f);
                    L2 = rectF.right - hl.L(4.0f);
                    rectF.right = L2;
                }
                canvas.clipRect(rectF.left, this.u0, L2, hl.L(4.0f) + this.Q5.V5(dc2Var) + i);
                r47 r47Var5 = this.Q5;
                f1(this.o0, f2, canvas, r47Var5.B2, r47Var5.x2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            r47 r47Var6 = this.Q5;
            f1(this.o0, f, canvas, r47Var6.B2, r47Var6.x2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        if (v2()) {
            r47 r47Var = this.Q5;
            if (r47Var.D != 27 && !r47Var.q4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g3() {
        sb2 sb2Var = this.yc;
        if (sb2Var != null) {
            hf0 hf0Var = sb2Var.k;
            if (hf0Var != null) {
                hf0Var.setState(StateSet.NOTHING);
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
        return new fb2(this);
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

    public defpackage.hm[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.getAnimatedEmojiSpans():hm[]");
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

    public m37 getBackgroundDrawable() {
        return this.fb;
    }

    public int getBackgroundDrawableBottom() {
        int i;
        j47 j47Var = this.M;
        int i2 = 0;
        if (j47Var != null) {
            int i3 = 4;
            if ((j47Var.l & 4) == 0) {
                i = hl.L(3.0f);
            } else {
                i = 0;
            }
            if ((this.M.l & 8) == 0) {
                r47 r47Var = this.Q5;
                if (r47Var != null && r47Var.O3()) {
                    i3 = 3;
                }
                i += hl.L(i3);
            }
        } else {
            i = 0;
        }
        boolean z = this.K;
        if (!z || !this.J) {
            if (z) {
                i2 = hl.L(1.0f);
            } else {
                i2 = hl.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.e7) - i2) + i;
        if (!this.C6) {
            if (this.J) {
                backgroundDrawableTop += hl.L(1.0f);
            }
            if (this.K) {
                return hl.L(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int compactInShift;
        int i;
        r47 messageObject = getMessageObject();
        int i2 = 0;
        float f = 9.0f;
        if (messageObject != null && messageObject.O3()) {
            boolean z = this.Kb;
            int i3 = this.d7 - this.b7;
            if (z) {
                return i3 - ((int) ((1.0f - getVideoTranscriptionProgress()) * hl.L(9.0f)));
            }
            if (this.C6) {
                i2 = hl.L(9.0f);
            }
            return i3 - i2;
        }
        float f2 = 71.0f;
        if (this.Kb) {
            if (!O2()) {
                if ((this.f6 || ((messageObject != null && (messageObject.j2 || messageObject.l2 || messageObject.k.guestchat_via_from != null)) || r47.B0(messageObject.k) == 489000)) && this.G6) {
                    i2 = 48;
                }
                f2 = i2 + 3;
            }
            compactInShift = hl.L(f2) + ((int) ((1.0f - getVideoTranscriptionProgress()) * hl.L(6.0f)));
        } else {
            if (!O2()) {
                if ((this.f6 || ((messageObject != null && (messageObject.j2 || messageObject.l2 || messageObject.k.guestchat_via_from != null)) || r47.B0(messageObject.k) == 489000)) && this.G6) {
                    i2 = 48;
                }
                f2 = i2;
            }
            int L = hl.L(f2);
            if (!this.C6) {
                f = 3.0f;
            }
            compactInShift = getCompactInShift() + hl.L(f) + L;
        }
        m47 m47Var = this.L;
        if (m47Var != null && !m47Var.i && (i = this.M.j) != 0) {
            compactInShift += (int) Math.ceil((i / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.Kb) {
            if (this.K) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * hl.L(6.0f)));
            }
        } else if (!this.C6 && this.K) {
            return hl.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i;
        int backgroundDrawableLeft;
        r47 r47Var;
        r47 r47Var2;
        int i2 = this.b7;
        if (this.Kb) {
            i = i2 - ((int) (getVideoTranscriptionProgress() * hl.L(3.0f)));
            if (this.K && (r47Var2 = this.Q5) != null && r47Var2.O3()) {
                i = (int) (i - ((1.0f - getVideoTranscriptionProgress()) * hl.L(6.0f)));
            }
            if (this.K && ((r47Var = this.Q5) == null || !r47Var.O3())) {
                i = (int) (i - ((1.0f - getVideoTranscriptionProgress()) * hl.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.C6) {
                L = 0;
            } else {
                L = hl.L(3.0f);
            }
            i = i2 - L;
            if (!this.C6 && this.K) {
                i -= hl.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i;
    }

    public int getBackgroundDrawableTop() {
        int i;
        j47 j47Var = this.M;
        int i2 = 0;
        if (j47Var != null && (j47Var.l & 4) == 0) {
            i = 0 - hl.L(3.0f);
        } else {
            i = 0;
        }
        if (!this.J) {
            i2 = hl.L(1.0f);
        }
        int i3 = i + i2;
        if (!this.C6 && this.J) {
            return i3 - hl.L(1.0f);
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
        dc2 dc2Var = this.ub;
        if (dc2Var.C1) {
            return hl.U1(dc2Var.L1, dc2Var.B1, this.e0);
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
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.O3()) {
            z = true;
        } else {
            z = false;
        }
        if (b3()) {
            if (this.M != null) {
                f2 = 73.0f;
            } else {
                r47 r47Var2 = this.Q5;
                if (r47Var2 != null && r47Var2.j2) {
                    i3 = 42;
                } else {
                    i3 = 63;
                }
                f2 = i3;
            }
            i = hl.L(f2);
        } else {
            i = 0;
        }
        if (z && (W(this.Q5) || this.I4)) {
            i2 = hl.L(48.0f);
        } else {
            i2 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i) - i2;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            r47 r47Var3 = this.Q5;
            if (r47Var3 != null && r47Var3.O3()) {
                L = (getMeasuredWidth() - widthForButtons) - hl.L(10.0f);
            } else {
                int i4 = this.N6;
                if (!this.C6 && !this.K) {
                    f = 7.0f;
                } else {
                    f = 1.0f;
                }
                L = i4 + hl.L(f);
            }
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                i5 = Math.max(i5, ((int) (((wo0) arrayList.get(i6)).c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i5);
        }
        if (this.T != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.T.j()) - hl.L(18.0f))) / 2);
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
        r47 r47Var = this.Q5;
        if (r47Var != null && !r47Var.O3() && (W(this.Q5) || this.I4)) {
            i = hl.L(48.0f);
        } else {
            i = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            r47 r47Var2 = this.Q5;
            if (r47Var2 != null && r47Var2.O3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - hl.L(10.0f);
            } else {
                int i2 = this.N6;
                if (!this.C6 && !this.K) {
                    f = 7.0f;
                } else {
                    f = 1.0f;
                }
                L = i2 + hl.L(f);
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
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.T.j() + getParentWidth()) + hl.L(18.0f))) / 2);
        }
        if (this.f0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public p47 getCaptionLayout() {
        return this.m3;
    }

    public float getCaptionX() {
        dc2 dc2Var = this.ub;
        if (dc2Var.x0) {
            if (dc2Var.D0) {
                this.s3 += dc2Var.h0;
            } else if (dc2Var.t0) {
                float f = this.s3;
                float f2 = dc2Var.L1;
                this.s3 = qd4.A(1.0f, f2, dc2Var.r0, f * f2);
            } else if (!r47.Q4(this.Q5.k) || !TextUtils.isEmpty(this.Q5.z)) {
                this.s3 += dc2Var.h0;
            }
        }
        return this.s3;
    }

    public float getCaptionY() {
        float f = this.t3;
        dc2 dc2Var = this.ub;
        if (dc2Var.x0) {
            if (dc2Var.D0) {
                return f - getTranslationY();
            }
            if (dc2Var.t0) {
                float f2 = dc2Var.L1;
                return qd4.A(1.0f, f2, dc2Var.s0, f * f2);
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
        if (xea.U0 >= 10) {
            f = 27.3f;
        } else {
            f = 25.3f;
        }
        return i - hl.L(f);
    }

    public int getChecksY() {
        int intrinsicHeight;
        boolean O5 = this.Q5.O5();
        float f = this.K9;
        if (O5) {
            intrinsicHeight = b2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            intrinsicHeight = aob.F3.getIntrinsicHeight();
        }
        return (int) (f - intrinsicHeight);
    }

    public int getCompactContentWidth() {
        int parentWidth;
        if (hl.O1()) {
            parentWidth = hl.P0();
        } else {
            parentWidth = getParentWidth();
        }
        return (parentWidth - hl.L(32.0f)) - getCompactSideMenuWidth();
    }

    public int getCompactLeft() {
        return hl.L(16.0f);
    }

    public int getCompactRight() {
        return (getMeasuredWidth() - hl.L(16.0f)) - getCompactSideMenuWidth();
    }

    public int getCurrentBackgroundLeft() {
        t37 t37Var = this.L6;
        if (t37Var == null) {
            return 0;
        }
        int i = t37Var.getBounds().left;
        if (!this.Q5.O3() && this.ub.A0 != 1.0f) {
            boolean z = this.Kb;
            if ((z || !this.C6) && !this.K) {
                if (z) {
                    return (int) (i - (getVideoTranscriptionProgress() * hl.L(6.0f)));
                }
                return i - hl.L(6.0f);
            }
            return i;
        }
        return i;
    }

    public int getCurrentBackgroundRight() {
        boolean z;
        t37 t37Var = this.L6;
        if (t37Var == null) {
            return getWidth();
        }
        int i = t37Var.getBounds().right;
        if (this.Q5.O3() && this.ub.A0 != 1.0f && (((z = this.Kb) || !this.C6) && !this.K)) {
            if (z) {
                return (int) ((getVideoTranscriptionProgress() * hl.L(6.0f)) + i);
            }
            return hl.L(6.0f) + i;
        }
        return i;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.wa;
    }

    public m47 getCurrentMessagesGroup() {
        return this.L;
    }

    public j47 getCurrentPosition() {
        return this.M;
    }

    public TLRPC.User getCurrentUser() {
        return this.va;
    }

    public rb2 getDelegate() {
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
        dc2 dc2Var = this.ub;
        if (z) {
            Typeface typeface = hl.a;
            L2 = this.p0 - hl.L(10.0f);
        } else {
            if (this.U1) {
                Typeface typeface2 = hl.a;
                i = this.p0;
                L3 = hl.L(1.0f);
            } else if (this.Q5.q4()) {
                Typeface typeface3 = hl.a;
                i = this.p0;
                L3 = hl.L(1.0f);
            } else {
                float f3 = 12.0f;
                if (this.Q5.O3()) {
                    f = getExtraTextX() + hl.L(12.0f) + this.N6;
                    if (this.Q5.D == 19) {
                        f -= Math.max(0.0f, ((Math.max(this.X7, this.Z7) + f) + hl.L(14.0f)) - hl.q.x);
                    }
                } else {
                    boolean z2 = this.C6;
                    int i3 = this.N6;
                    if (z2) {
                        L = hl.L(12.0f) + i3;
                        extraTextX = getExtraTextX();
                    } else {
                        if (!this.K) {
                            f3 = 18.0f;
                        }
                        L = hl.L(f3) + i3;
                        extraTextX = getExtraTextX();
                    }
                    f = extraTextX + L;
                }
                L2 = (f + dc2Var.h0) - hl.L(1.33f);
            }
            L2 = L3 + i;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (dc2Var != null) {
            f2 = dc2Var.i0;
        }
        float f4 = backgroundDrawableRight + f2;
        int i4 = 0;
        if (this.Q5.O3() && !this.C6 && !this.K) {
            i2 = 6;
        } else {
            i2 = 0;
        }
        int L4 = (int) (((f4 - hl.L(10 + i2)) - getExtraTextX()) - L2);
        float L5 = L2 + hl.L(10.0f);
        if (Math.abs(this.c2) > 1) {
            i4 = ((L4 - hl.L(20.0f)) - this.b2) - this.c2;
        }
        return L5 + i4;
    }

    public float getDescriptionLayoutY() {
        float f;
        float f2 = this.Y1;
        dc2 dc2Var = this.ub;
        if (!dc2Var.s2) {
            f = (-dc2Var.k0) + dc2Var.j0;
        } else {
            f = 0.0f;
        }
        return f2 + f;
    }

    public StaticLayout getDescriptionlayout() {
        return this.p2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        r47 r47Var;
        j47 j47Var = this.M;
        if ((j47Var == null || j47Var.h) && (r47Var = this.Q5) != null) {
            return r47Var.M0();
        }
        return null;
    }

    public p47 getExplanationLayout() {
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
        x49 x49Var = this.O;
        if (h2) {
            if (x49Var.p) {
                i = 18;
            } else {
                i = 0;
            }
            i2 += hl.L(i + 2) + this.s0.r;
        }
        if (this.x7) {
            i2 += getCommentButtonHeight();
        }
        if (!x49Var.p) {
            this.Q5.getClass();
            return i2 + x49Var.n;
        }
        return i2;
    }

    public int getExtraTextX() {
        int i = xea.U0;
        if (i >= 15) {
            return hl.L(2.0f);
        }
        if (i >= 11) {
            return hl.L(1.0f);
        }
        return 0;
    }

    public int getExtraTimeX() {
        int i;
        if (!v2()) {
            if (!this.Q5.O3() && ((!this.C6 || this.m3 != null) && (i = xea.U0) > 11)) {
                return hl.L((i - 11) / 1.5f);
            }
            if (!this.Q5.O3() && this.Lb && this.G6 && this.Q5.D == 5) {
                return (int) ((hl.b3(this.X6, w2()) - hl.u) * 0.7f);
            }
            return 0;
        }
        return 0;
    }

    public StaticLayout getFactCheckLayout() {
        yb2 yb2Var = this.s0;
        if (yb2Var != null) {
            return yb2Var.g;
        }
        return null;
    }

    public String getFilename() {
        byte b;
        byte b2;
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            int i = r47Var.D;
            if (i == 1) {
                TLRPC.PhotoSize photoSize = this.e4;
                if (photoSize != null) {
                    return xb4.r(null, photoSize);
                }
            } else if (i != 8 && (b2 = this.M1) != 7 && b2 != 4 && b2 != 8 && i != 9 && b2 != 3 && b2 != 5) {
                if (b2 != 0) {
                    return xb4.r(null, this.N1);
                }
                TLRPC.PhotoSize photoSize2 = this.e4;
                if (photoSize2 != null) {
                    return xb4.r(null, photoSize2);
                }
            } else if (!r47Var.E0) {
                if (r47Var.y0 && !TextUtils.isEmpty(r47Var.k.attachPath)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.getIconForCurrentState():int");
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
        r47 r47Var;
        r47 r47Var2;
        int i2;
        int i3;
        float f;
        int L3;
        int parentWidth;
        j47 j47Var;
        if (v2() && this.L == null) {
            return getCompactContentWidth();
        }
        byte b = this.M1;
        if (b != 6 && b != 8 && (i2 = (r47Var2 = this.Q5).D) != 5) {
            m47 m47Var = this.L;
            int i4 = 0;
            if (m47Var != null && !m47Var.i) {
                if (hl.O1()) {
                    parentWidth = hl.P0();
                } else {
                    parentWidth = getParentWidth();
                }
                i3 = 0;
                for (int i5 = 0; i5 < this.L.e.size(); i5++) {
                    if (((j47) this.L.e.get(i5)).c != 0) {
                        break;
                    }
                    i3 = (int) (Math.ceil(((j47Var.e + j47Var.j) / 1000.0f) * parentWidth) + i3);
                }
                if (this.X6) {
                    i4 = 71;
                } else if (b3()) {
                    i4 = 48;
                }
                L3 = hl.L(i4 + 31);
            } else if (i2 == 19) {
                int i6 = r47Var2.v2;
                int L4 = hl.q.x - hl.L(52.0f);
                if (this.G6) {
                    i4 = hl.L(48.0f);
                }
                return Math.max(i6, (int) ((L4 - i4) * 0.5f));
            } else {
                i3 = this.b7;
                if (r47Var2.n2 && r47Var2.O3() && W(this.Q5)) {
                    i3 -= hl.L(25.0f);
                }
                if (this.C6) {
                    f = 22.0f;
                } else {
                    f = 31.0f;
                }
                L3 = hl.L(f);
            }
            return i3 - L3;
        }
        float f2 = 0.0f;
        if (hl.O1()) {
            min = hl.P0();
            if (this.X6) {
                f2 = 71.0f;
            } else if (b3()) {
                f2 = 42.0f;
            }
            L = hl.L(f2);
        } else {
            min = Math.min(getParentWidth(), hl.q.y);
            if (this.X6) {
                f2 = 71.0f;
            } else if (b3()) {
                f2 = 42.0f;
            }
            L = hl.L(f2);
        }
        int i7 = min - L;
        r47 r47Var3 = this.Q5;
        if (r47Var3 != null && r47Var3.n2 && r47Var3.O3() && W(this.Q5)) {
            i7 -= hl.L(25.0f);
        }
        if (this.Lb && ((r47Var = this.Q5) == null || !r47Var.S4())) {
            i = i7 - (this.b7 - (hl.b3(this.X6, w2()) - hl.u));
            L2 = hl.L(57.0f);
        } else if (this.X6 && (this.Q5.D == 5 || this.M1 == 6)) {
            return this.b7 - hl.L(57.0f);
        } else {
            i = i7 - this.b7;
            L2 = hl.L(57.0f);
        }
        return i - L2;
    }

    public int getMediaOffsetY() {
        dc2 dc2Var = this.ub;
        if (dc2Var.a2) {
            return hl.U1(dc2Var.L1, dc2Var.Z1, this.X1);
        }
        return this.X1;
    }

    @Override
    public r47 getMessageObject() {
        r47 r47Var = this.R5;
        if (r47Var != null) {
            return r47Var;
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
            i = i2 - hl.L(32.0f);
        } else {
            i = this.i9;
        }
        return (int) (f + i + hl.L(2.0f) + (hl.L(20.0f) / 2));
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
        r47 r47Var = this.Q5;
        if (r47Var == null) {
            r47Var = this.R5;
        }
        if (r47Var != null && r47Var.t1 && (i = this.L0) > 0) {
            return i;
        }
        return hl.q.x;
    }

    public float getPhotoBottom() {
        if (g4()) {
            float f = this.oc;
            if (f > 0.0f) {
                return f;
            }
            return this.e7 - hl.L(5.0f);
        }
        hd5 hd5Var = this.X5;
        if (hd5Var != null) {
            return hd5Var.e + hd5Var.h;
        }
        return this.U0.x();
    }

    public ImageReceiver getPhotoImage() {
        return this.U0;
    }

    public ArrayList<vb2> getPollButtons() {
        return this.Q4;
    }

    public float getPollButtonsLeft() {
        if (getMessageObject() != null && getMessageObject().O3()) {
            return (hl.L(3.0f) + this.d7) - this.b7;
        }
        if (this.Y6) {
            return hl.L(82.0f);
        }
        if (b3()) {
            return hl.L(59.0f);
        }
        return hl.L(11.0f);
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.b7) - hl.L(15.0f);
    }

    public r47 getPrimaryMessageObject() {
        r47 r47Var;
        r47 r47Var2 = this.Q5;
        if (r47Var2 != null && this.L != null && r47Var2.z2()) {
            r47Var = this.L.c();
        } else {
            r47Var = null;
        }
        if (r47Var != null) {
            return r47Var;
        }
        return this.Q5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.Q0;
    }

    public x49 getReactionsLayout() {
        return this.O;
    }

    public int getRepliesCount() {
        m47 m47Var = this.L;
        if (m47Var != null && !m47Var.d.isEmpty()) {
            return ((r47) this.L.d.get(0)).M1();
        }
        return this.Q5.M1();
    }

    public vnb getResourcesProvider() {
        return this.cc;
    }

    public RectF getScrimBlockBounds() {
        return this.yd;
    }

    public xy9 getSeekBarWaveform() {
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
        m47 m47Var = this.L;
        if (m47Var != null) {
            ArrayList arrayList = m47Var.d;
            int size = arrayList.size();
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                r47 r47Var = (r47) obj;
                if (r47Var != null && (message2 = r47Var.k) != null) {
                    j = message2.paid_message_stars;
                } else {
                    j = 0;
                }
                j2 += j;
            }
            return j2;
        }
        r47 r47Var2 = this.Q5;
        if (r47Var2 == null || (message = r47Var2.k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        dc2 dc2Var = this.ub;
        if (dc2Var.z1) {
            return hl.U1(dc2Var.L1, dc2Var.y1, this.W);
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
        dc2 dc2Var = this.ub;
        if (dc2Var.i1) {
            i = hl.U1(dc2Var.L1, dc2Var.h1, this.O9);
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
                i2 = v2() ? getCommentButtonHeight() : hl.L(41.3f);
            }
        } else if (this.Q5.q4()) {
            i = -hl.L(48.0f);
            if (this.c7) {
                i -= hl.L(4.0f);
            }
            return d2(i);
        } else if (this.x7) {
            i2 = v2() ? getCommentButtonHeight() : hl.L(43.0f);
        }
        i = -i2;
        return d2(i);
    }

    public int getTopMediaOffset() {
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.D == 14) {
            return this.X1 + this.gb;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        dc2 dc2Var = this.ub;
        if (dc2Var.v1) {
            return hl.U1(dc2Var.L1, dc2Var.u1, this.g0);
        }
        return this.g0;
    }

    public dc2 getTransitionParams() {
        return this.ub;
    }

    public float getVideoTranscriptionProgress() {
        r47 r47Var;
        dc2 dc2Var = this.ub;
        if (dc2Var != null && (r47Var = this.Q5) != null && r47Var.g4()) {
            boolean z = dc2Var.m1;
            boolean z2 = this.I6;
            if (z) {
                float f = dc2Var.L1;
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
        dc2 dc2Var = this.ub;
        if (dc2Var.O1) {
            return hl.U1(dc2Var.L1, dc2Var.P1, this.K5);
        }
        return this.K5;
    }

    @Override
    public final void h(float f) {
        r47 r47Var = this.Q5;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        r47Var.i0 = (int) (r47Var.L0() * f);
        W3();
    }

    public final boolean h0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.h0(android.view.MotionEvent):boolean");
    }

    public final void h1(android.graphics.Canvas r63, float r64) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        yb2 yb2Var = this.s0;
        if (yb2Var != null && yb2Var.b) {
            return true;
        }
        return false;
    }

    public final void h3() {
        xb2 xb2Var = this.w2;
        if (xb2Var != null) {
            xb2Var.h = false;
        }
        v41 v41Var = this.Sa;
        if (v41Var != null) {
            v41Var.c(false);
        }
        Drawable drawable = this.J2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        xb2 xb2Var2 = this.w2;
        if (xb2Var2 != null && xb2Var2.g != null) {
            for (int i = 0; i < this.w2.g.size(); i++) {
                tb2 tb2Var = (tb2) this.w2.g.get(i);
                v41 v41Var2 = tb2Var.f;
                if (v41Var2 != null) {
                    v41Var2.c(false);
                }
                hf0 hf0Var = tb2Var.g;
                if (hf0Var != null) {
                    hf0Var.setState(StateSet.NOTHING);
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

    public final boolean i0(MotionEvent motionEvent) {
        bmb l2;
        boolean z;
        boolean z2;
        int L;
        int i;
        yb2 yb2Var;
        int L2;
        int extraTextX;
        int i2;
        m47 m47Var;
        rb2 rb2Var = this.eb;
        if (rb2Var != null && (l2 = rb2Var.l2()) != null && (l2.a() || l2.d())) {
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            hl9 hl9Var = this.Q5.y2;
            if (hl9Var != null && !hl9Var.n.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || f2() || z2) && ((this.k1 || this.L != null) && (this.L == null || this.eb.K()))) {
                if (this.Q5.z2() && (m47Var = this.L) != null && !m47Var.i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt instanceof wb2) {
                                wb2 wb2Var = (wb2) childAt;
                                m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
                                j47 currentPosition = wb2Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.a == this.L.a && (currentPosition.l & G()) != 0 && (currentPosition.l & 1) != 0) {
                                    l2.c = (int) wb2Var.s3;
                                    l2.d = (int) wb2Var.t3;
                                    l2.a0(wb2Var);
                                    if (wb2Var == this) {
                                        return l2.L(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - wb2Var.getLeft(), getTop() - wb2Var.getTop());
                                    boolean L3 = l2.L(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - wb2Var.getLeft()), -(getTop() - wb2Var.getTop()));
                                    return L3;
                                }
                            }
                        }
                    }
                } else {
                    r47 r47Var = this.Q5;
                    if (r47Var != null && !r47Var.t1 && (yb2Var = this.s0) != null && yb2Var.g != null && P1(motionEvent) >= this.r0) {
                        l2.r0 = false;
                        l2.t0 = true;
                        l2.v0 = false;
                        m47 m47Var2 = this.L;
                        if (m47Var2 != null && !m47Var2.i) {
                            i2 = (int) this.s3;
                        } else {
                            float f = 12.0f;
                            if (this.Q5.O3()) {
                                int extraTextX2 = getExtraTextX() + hl.L(12.0f) + this.N6;
                                if (this.Q5.D == 19) {
                                    i2 = extraTextX2 - Math.max(0, (hl.L(14.0f) + (Math.max(this.X7, this.Z7) + extraTextX2)) - hl.q.x);
                                } else {
                                    i2 = extraTextX2;
                                }
                            } else {
                                boolean z3 = this.C6;
                                int i4 = this.N6;
                                if (z3) {
                                    L2 = hl.L(12.0f) + i4;
                                    extraTextX = getExtraTextX();
                                } else {
                                    if (!this.K) {
                                        f = 18.0f;
                                    }
                                    L2 = hl.L(f) + i4;
                                    extraTextX = getExtraTextX();
                                }
                                i2 = L2 + extraTextX;
                            }
                        }
                        int L4 = ((int) (i2 + this.ub.h0)) - hl.L(1.33f);
                        int i5 = this.r0;
                        l2.c = (hl.L(10.0f) + L4) - this.s0.o;
                        l2.d = hl.L(22.0f) + i5;
                    } else {
                        if (z2 && R2()) {
                            if (P1(motionEvent) < this.Q5.y2.t() + this.u0) {
                                l2.r0 = false;
                                l2.t0 = false;
                                l2.v0 = true;
                                int i6 = this.o0;
                                int i7 = this.u0;
                                l2.c = i6;
                                l2.d = i7;
                            }
                        }
                        if (f2()) {
                            l2.r0 = false;
                            l2.t0 = false;
                            l2.v0 = false;
                            l2.c = (int) this.s3;
                            l2.d = (int) this.t3;
                        } else {
                            r47 r47Var2 = this.Q5;
                            if (r47Var2 != null && !r47Var2.t1 && this.p2 != null && (!this.v1 ? P1(motionEvent) > this.Y1 : P1(motionEvent) < this.u0)) {
                                l2.r0 = true;
                                l2.t0 = false;
                                l2.v0 = false;
                                if (this.T1) {
                                    i = this.p0 - hl.L(10.0f);
                                } else {
                                    boolean z4 = this.U1;
                                    int i8 = this.p0;
                                    if (z4) {
                                        L = hl.L(1.0f);
                                    } else {
                                        L = hl.L(1.0f);
                                    }
                                    i = L + i8;
                                }
                                int L5 = hl.L(10.0f) + i + this.a2;
                                int i9 = this.Y1;
                                l2.c = L5;
                                l2.d = i9;
                            } else if (z2) {
                                l2.r0 = false;
                                l2.t0 = false;
                                l2.v0 = true;
                                int i10 = this.o0;
                                int i11 = this.u0;
                                l2.c = i10;
                                l2.d = i11;
                            } else {
                                l2.r0 = false;
                                l2.t0 = false;
                                l2.v0 = false;
                                int i12 = this.o0;
                                int i13 = this.u0;
                                l2.c = i12;
                                l2.d = i13;
                            }
                        }
                    }
                    l2.a0(this);
                    return l2.L(motionEvent);
                }
            }
        }
        return false;
    }

    public final void i1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.i1(android.graphics.Canvas):void");
    }

    public final boolean i2() {
        vnb vnbVar = this.cc;
        if (vnbVar != null) {
            return vnbVar.g();
        }
        return aob.b1();
    }

    public final void i3(int i) {
        m66 m66Var;
        m66 m66Var2 = this.u4;
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            for (int i2 = 0; i2 < m66Var2.a; i2++) {
                if (((Pair) ((ArrayList) m66Var2.e).get(i2)).second == valueOf) {
                    m66Var2.k(i2);
                }
            }
        } else {
            m66Var2.e(true);
        }
        yb2 yb2Var = this.s0;
        if (yb2Var != null && (m66Var = yb2Var.i) != null) {
            m66Var.e(true);
        }
        this.q4 = null;
        yb2 yb2Var2 = this.s0;
        if (yb2Var2 != null) {
            yb2Var2.j = null;
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
        rb2 rb2Var;
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
            if (this.ic && (rb2Var = this.eb) != null) {
                rb2Var.d();
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
        m47 m47Var = this.L;
        if (m47Var != null && m47Var.i) {
            j47 j47Var = this.M;
            if (j47Var != null && (j47Var.l & 4) != 0) {
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
                if (f >= this.k2 - hl.L(6.0f) && f <= this.k2 + this.i2 + hl.L(6.0f)) {
                    float f2 = P1;
                    if (f2 >= this.l2 - hl.L(2.0f) && f2 <= this.l2 + this.j2 + hl.L(2.0f)) {
                        v41 v41Var = this.n2;
                        if (v41Var != null) {
                            v41Var.c(true);
                        }
                        this.m2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.m2) {
                rb2 rb2Var = this.eb;
                if (rb2Var != null) {
                    rb2Var.z1();
                }
                v41 v41Var2 = this.n2;
                if (v41Var2 != null) {
                    v41Var2.c(false);
                }
                playSoundEffect(0);
                this.m2 = false;
            }
        }
        return false;
    }

    public void j1(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.j1(android.graphics.Canvas):void");
    }

    public final boolean j2() {
        r47 r47Var = this.Q5;
        if ((r47Var != null && r47Var.s2()) || this.M5) {
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
        gb2 gb2Var;
        hf0 hf0Var;
        if (this.I4 && ((!this.Lb || getVideoTranscriptionProgress() > 0.0f || this.T2) && (gb2Var = this.J4) != null)) {
            int action = motionEvent.getAction();
            float x = motionEvent.getX();
            float P1 = P1(motionEvent);
            if (action != 1 && action != 3) {
                if (gb2Var.v.contains((int) x, (int) P1)) {
                    if (action == 0) {
                        gb2Var.A = true;
                    }
                    if (gb2Var.A && (hf0Var = gb2Var.q) != null) {
                        hf0Var.setHotspot(x, P1);
                        gb2Var.q.setState(u2c.N);
                        gb2Var.r.invalidate();
                    }
                    return true;
                }
            } else if (gb2Var.A && action == 1) {
                gb2Var.p();
                return true;
            } else {
                gb2Var.A = false;
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
        nl nlVar = this.U0;
        float alpha = nlVar.getAlpha();
        if (this.Q5.f4()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        nlVar.setAlpha(f * alpha);
        nlVar.h(canvas, null);
        nlVar.setAlpha(alpha);
        canvas.restore();
        Paint c2 = c2("paintChatTimeBackground");
        int alpha2 = c2.getAlpha();
        c2.setAlpha((int) (alpha2 * this.l4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, c2);
        c2.setAlpha(alpha2);
    }

    public final boolean k2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.k2():boolean");
    }

    public final void k3() {
        CharSequence charSequence;
        long j;
        long j2;
        long j3;
        long j4;
        ib2 ib2Var = this.kc;
        y99 y99Var = this.x;
        y99Var.a(ib2Var);
        ib2 ib2Var2 = this.lc;
        y99Var.a(ib2Var2);
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            boolean isEmpty = TextUtils.isEmpty(r47Var.z);
            r47 r47Var2 = this.Q5;
            if (!isEmpty) {
                charSequence = r47Var2.z;
            } else {
                charSequence = r47Var2.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i = no4.e;
                int i2 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    no4[] no4VarArr = (no4[]) spanned.getSpans(0, spanned.length(), no4.class);
                    for (no4 no4Var : no4VarArr) {
                        if (no4Var.b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(no4VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(no4Var.b.date));
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
                        y99Var.a(ib2Var2);
                        h68 h68Var = new h68(y99Var, ib2Var2, (byte) 16);
                        y99Var.a.put(ib2Var2, h68Var);
                        if (j8 > 0) {
                            hl.d3(h68Var, j8);
                        } else {
                            hl.c3(h68Var);
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
        if (j == j2 && ((this.M != null || ((message = this.Q5.k) != null && message.paid_message_stars > 0)) && r7a.B(this.a6).I(this.Q5.e1()) && ((i = this.O3) == 1 || (i == 4 && this.M1 == 5)))) {
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

    public final boolean l0() {
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.D == 17) {
            TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) n1).results.has_unread_votes;
            }
        }
        return false;
    }

    public boolean l1(Canvas canvas) {
        lm m;
        int i;
        boolean z;
        r47 r47Var = this.Q5;
        nl nlVar = this.U0;
        if (r47Var != null && r47Var.D3() && (m = nlVar.m()) != null && (i = m.d[4]) > 0) {
            float l = 1.0f - Utilities.l(((i - 90) - m.o()) / 500.0f);
            if (l > 0.0f) {
                if (l < 1.0f) {
                    z = nlVar.h(canvas, null);
                } else {
                    z = true;
                }
                nlVar.U0 = true;
                float alpha = nlVar.getAlpha();
                nlVar.setAlpha(l * alpha);
                nlVar.h(canvas, null);
                nlVar.setAlpha(alpha);
                nlVar.U0 = false;
                return z;
            }
        }
        return nlVar.h(canvas, null);
    }

    public final boolean l2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.l2():boolean");
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
        x49 x49Var = this.O;
        if (!x49Var.H) {
            return false;
        }
        float y = getY() + x49Var.c;
        if (y <= f || (y + x49Var.m) - hl.L(16.0f) >= i) {
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
                cc4.g(th, true);
                canvas.restoreToCount(saveCount);
                this.B8 = false;
                long j = this.Q5.F0().id;
                ve8.b.remove(Long.valueOf(j));
                ve8.c.put(Long.valueOf(j), Boolean.TRUE);
                if (this.eb != null) {
                    hl.c3(new ib2(this, (byte) 7));
                }
            }
        }
    }

    public final boolean m2() {
        r47 r47Var = this.Q5;
        if (r47Var != null && r47Var.N5()) {
            j47 j47Var = this.M;
            if (j47Var != null) {
                int i = j47Var.l;
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
        m47 m47Var;
        m47 m47Var2;
        r47 r47Var;
        if (!z2 || (r47Var = this.Q5) == null || !r47Var.a0) {
            if (z) {
                this.o3 = null;
                CheckBoxBase checkBoxBase = this.m1;
                vnb vnbVar = this.cc;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, vnbVar, this);
                    this.m1 = checkBoxBase2;
                    if (this.O0) {
                        checkBoxBase2.l = true;
                    }
                } else if (checkBoxBase.F != vnbVar) {
                    checkBoxBase.F = vnbVar;
                    checkBoxBase.b();
                }
            }
            if (z && (((m47Var = this.L) != null && m47Var.d.size() > 1) || ((m47Var2 = this.S5) != null && m47Var2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.l1;
                vnb vnbVar2 = this.cc;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, vnbVar2, this);
                    this.l1 = checkBoxBase4;
                    if (!checkBoxBase4.y) {
                        checkBoxBase4.y = true;
                        checkBoxBase4.b();
                    }
                    if (this.O0) {
                        this.l1.l = true;
                    }
                } else if (checkBoxBase3.F != vnbVar2) {
                    checkBoxBase3.F = vnbVar2;
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
        m47 m47Var = this.L;
        if (m47Var != null && m47Var.i) {
            j47 j47Var = this.M;
            if (j47Var != null && (j47Var.l & 8) != 0) {
                return this.G;
            }
            return true;
        }
        return this.G;
    }

    public final boolean n0() {
        nd4 nd4Var;
        xb4 G = xb4.G(this.a6);
        String filename = getFilename();
        if (filename == null || (nd4Var = (nd4) G.h.get(filename)) == null || !nd4Var.T) {
            return false;
        }
        nd4Var.T = false;
        return true;
    }

    public final void n1(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.n1(android.graphics.Canvas):void");
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
        boolean K4 = r47.K4(this.Q5.k);
        nl nlVar = this.U0;
        if (K4) {
            if (MediaController.z().H(this.Q5)) {
                nlVar.u0 = false;
                nlVar.x0();
                return;
            }
            nlVar.u0 = true;
            nlVar.w0(false);
            return;
        }
        if (z) {
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null && r47Var.g4()) {
                z = false;
            } else {
                z = true;
            }
        }
        nlVar.u0 = z;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            nlVar.Z = null;
            nlVar.b0 = null;
            nlVar.c0 = null;
            nlVar.d0 = null;
            nlVar.a1.setShader(null);
            nlVar.u0(bitmapDrawable);
            nlVar.n1 = true;
            nlVar.i1 = 0.0f;
            nlVar.y0(nlVar.n0);
        }
        if (z) {
            nlVar.w0(false);
        } else {
            nlVar.x0();
        }
    }

    public final void o1(Canvas canvas, int i) {
        int i2;
        p47 p47Var;
        r47 r47Var;
        rb2 rb2Var = this.eb;
        int i3 = 0;
        if (rb2Var != null) {
            if (!rb2Var.k1(this, 1)) {
                this.A4 = null;
                ArrayList arrayList = this.z4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i4 = 0; i4 < this.z4.size(); i4++) {
                        ub2 ub2Var = (ub2) this.z4.get(i4);
                        if (!ub2Var.a.d()) {
                            ub2Var.a.a();
                        }
                    }
                }
            } else {
                CharacterStyle a0 = this.eb.a0(this);
                if (a0 != this.A4) {
                    this.A4 = a0;
                    va6 va6Var = this.y4;
                    if (va6Var != null) {
                        va6Var.a();
                        this.y4 = null;
                    }
                    va6 va6Var2 = new va6();
                    this.y4 = va6Var2;
                    va6Var2.D = true;
                    f66 f66Var = new f66(0);
                    va6 va6Var3 = this.y4;
                    va6Var3.y = f66Var;
                    va6Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.a = this.y4;
                    obj.b = -3;
                    ArrayList arrayList2 = this.z4;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.z4 = arrayList2;
                    }
                    arrayList2.add(obj);
                    if (this.A4 != null && !H1(obj, f66Var, this.p2, -2) && (((p47Var = this.m3) == null || !I1(obj, f66Var, p47Var.e)) && (r47Var = this.Q5) != null)) {
                        I1(obj, f66Var, r47Var.B2);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.z4;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r47 r47Var2 = this.Q5;
            if (r47Var2 != null && r47Var2.O3()) {
                i2 = aob.Dc;
            } else {
                i2 = aob.Ce;
            }
            int v0 = aob.v0(i2, this.cc);
            while (i3 < this.z4.size()) {
                ub2 ub2Var2 = (ub2) this.z4.get(i3);
                if (ub2Var2.b == i) {
                    va6 va6Var4 = ub2Var2.a;
                    va6Var4.g(aob.p1(0.85f, v0), aob.p1(2.0f, v0), aob.p1(3.5f, v0), aob.p1(6.0f, v0));
                    va6Var4.draw(canvas);
                    invalidate();
                    if (va6Var4.c()) {
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
        p47 p47Var = this.m3;
        if (p47Var != null && (arrayList = p47Var.e) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((o47) obj).y.isEmpty()) {
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
                if (!((o47) obj2).y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o3(boolean z, boolean z2, boolean z3) {
        r47 r47Var;
        if (z || !z3 || (r47Var = this.Q5) == null || !r47Var.a0) {
            CheckBoxBase checkBoxBase = this.m1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z2, z3);
            }
            CheckBoxBase checkBoxBase2 = this.l1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z, z3);
            }
            m37 m37Var = this.fb;
            float f = 0.0f;
            if (m37Var.e == z2) {
                if (m37Var.f != z3 && !z3) {
                    if (z2) {
                        f = 1.0f;
                    }
                    m37Var.d = f;
                    m37Var.f = false;
                    return;
                }
                return;
            }
            m37Var.e = z2;
            m37Var.f = z3;
            if (z3) {
                m37Var.c = SystemClock.elapsedRealtime();
            } else {
                if (z2) {
                    f = 1.0f;
                }
                m37Var.d = f;
            }
            m37Var.a();
            wb2 wb2Var = m37Var.m;
            if (wb2Var != null) {
                wb2Var.invalidate();
                if (wb2Var.getParent() != null) {
                    ((ViewGroup) wb2Var.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        wb2 wb2Var;
        float f;
        float f2;
        mh8 mh8Var;
        mh8 mh8Var2;
        ic0 ic0Var;
        super.onAttachedToWindow();
        u8a u8aVar = this.Jc;
        if (u8aVar != null) {
            u8aVar.a();
            this.Jc = null;
        }
        u8a u8aVar2 = new u8a(jn7.f(this.a6), this);
        u8aVar2.b(jn7.E0);
        u8aVar2.e(jn7.m1);
        u8aVar2.e(jn7.l1);
        u8aVar2.e(jn7.l4);
        u8aVar2.e(jn7.Y2);
        this.Jc = u8aVar2;
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            r47Var.k1 = false;
            hl9 hl9Var = r47Var.y2;
            if (hl9Var != null) {
                hl9Var.b(this);
            }
        }
        hl9 hl9Var2 = this.ub.M0;
        if (hl9Var2 != null) {
            hl9Var2.b(this);
        }
        bc2 bc2Var = this.i3;
        if (bc2Var != null && (ic0Var = bc2Var.b) != null) {
            ic0Var.e();
        }
        cc2 cc2Var = this.x2;
        if (cc2Var != null && (mh8Var2 = cc2Var.m) != null) {
            mh8Var2.a();
        }
        cc2 cc2Var2 = this.x2;
        if (cc2Var2 != null && (mh8Var = cc2Var2.n) != null) {
            mh8Var.a();
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vb2) obj).a();
        }
        r47 r47Var2 = this.R5;
        if (r47Var2 != null) {
            r47Var2.k1 = false;
            wb2Var = this;
            wb2Var.y3(r47Var2, this.S5, this.U5, this.T5, this.V5, this.W5);
            wb2Var.R5 = null;
            wb2Var.S5 = null;
        } else {
            wb2Var = this;
        }
        CheckBoxBase checkBoxBase = wb2Var.m1;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        CheckBoxBase checkBoxBase2 = wb2Var.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.l = true;
        }
        byb bybVar = wb2Var.f0;
        if (bybVar != null) {
            bybVar.a();
        }
        CheckBoxBase checkBoxBase3 = wb2Var.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.l = true;
        }
        if (wb2Var.f7 != null) {
            int i2 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = wb2Var.f7;
                if (i2 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i2].l = true;
                i2++;
            }
        }
        wb2Var.O0 = true;
        float f3 = 0.0f;
        wb2Var.wd = 0.0f;
        wb2Var.vd = 0.0f;
        wb2Var.r1 = 0;
        wb2Var.d4();
        ImageReceiver imageReceiver = wb2Var.A7;
        imageReceiver.p0((View) wb2Var.getParent());
        imageReceiver.I();
        sb2 sb2Var = wb2Var.tc;
        if (sb2Var != null) {
            sb2Var.b.I();
        }
        sb2 sb2Var2 = wb2Var.uc;
        if (sb2Var2 != null) {
            sb2Var2.b.I();
        }
        wb2Var.Q();
        r47 r47Var3 = wb2Var.Q5;
        if (r47Var3 != null) {
            wb2Var.setAvatar(r47Var3);
        }
        byte b = wb2Var.M1;
        if (b == 4 && wb2Var.H5) {
            boolean H = MediaController.z().H(wb2Var.Q5);
            wb2Var.F1 = H;
            if (H) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            wb2Var.H1 = f2;
            wb2Var.G1 = (byte) 0;
        } else {
            wb2Var.F1 = false;
            wb2Var.H1 = 0.0f;
            if ((b == 4 || b == 2) && wb2Var.B1) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            wb2Var.E1 = f;
        }
        if (wb2Var.getDelegate() != null && wb2Var.getDelegate().l2() != null) {
            bmb l2 = wb2Var.getDelegate().l2();
            l2.getClass();
            if (wb2Var.getMessageObject() != null && wb2Var.getMessageObject().e1() == l2.w) {
                l2.W = wb2Var;
            }
        }
        if (wb2Var.M1 == 5) {
            boolean H2 = MediaController.z().H(wb2Var.Q5);
            hb2 F1 = wb2Var.F1();
            if (H2) {
                f3 = 1.0f;
            }
            F1.h = f3;
        }
        x49 x49Var = wb2Var.O;
        ArrayList arrayList2 = x49Var.s;
        x49Var.D = true;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((u49) arrayList2.get(i3)).a();
        }
        c34 c34Var = wb2Var.zb;
        if (c34Var != null) {
            c34Var.a();
        }
        hd5 hd5Var = wb2Var.X5;
        if (hd5Var != null) {
            ArrayList arrayList3 = hd5Var.c;
            if (!hd5Var.C) {
                hd5Var.C = true;
                mpa mpaVar = hd5Var.l;
                if (mpaVar != null) {
                    mpaVar.b(hd5Var.a);
                }
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    gd5 gd5Var = (gd5) arrayList3.get(i4);
                    if (!gd5Var.N) {
                        gd5Var.N = true;
                        gd5Var.f.I();
                    }
                }
            }
        }
        wb2Var.U3();
        r47 r47Var4 = wb2Var.Q5;
        if (r47Var4 != null && r47Var4.D == 20 && wb2Var.ja != null) {
            wb2Var.invalidate();
        }
        ul ulVar = wb2Var.Ca;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = wb2Var.Da;
        if (ulVar2 != null) {
            ulVar2.a();
        }
        mpa mpaVar2 = wb2Var.ca;
        if (mpaVar2 != null) {
            if (mpaVar2.i) {
                mpa Y2 = wb2Var.Y2();
                wb2Var.ca = Y2;
                Integer num = wb2Var.da;
                if (num != null) {
                    Y2.k.put(wb2Var, num);
                }
            } else {
                mpaVar2.a(wb2Var);
            }
        }
        mj1 mj1Var = wb2Var.w;
        if (mj1Var != null) {
            ArrayList arrayList4 = mj1Var.p;
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((lj1) arrayList4.get(i5)).a();
            }
        }
        r3b r3bVar = wb2Var.f1;
        if (r3bVar != null) {
            for (int i6 = 0; i6 < r3bVar.b; i6++) {
                r3bVar.c[i6].b(wb2Var);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ac2 ac2Var;
        ic0 ic0Var;
        by2 by2Var;
        mh8 mh8Var;
        mh8 mh8Var2;
        super.onDetachedFromWindow();
        u8a u8aVar = this.Jc;
        if (u8aVar != null) {
            u8aVar.a();
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
        cc2 cc2Var = this.x2;
        if (cc2Var != null && (mh8Var2 = cc2Var.m) != null) {
            mh8Var2.b.K();
            mh8Var2.y.f();
        }
        cc2 cc2Var2 = this.x2;
        if (cc2Var2 != null && (mh8Var = cc2Var2.n) != null) {
            mh8Var.b.K();
            mh8Var.y.f();
        }
        cc2 cc2Var3 = this.x2;
        if (cc2Var3 != null && (by2Var = cc2Var3.j) != null) {
            by2Var.b();
            this.x2.j = null;
        }
        hl9 hl9Var = this.Q5.y2;
        if (hl9Var != null) {
            hl9Var.f(this);
        }
        dc2 dc2Var = this.ub;
        hl9 hl9Var2 = dc2Var.M0;
        if (hl9Var2 != null) {
            hl9Var2.f(this);
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vb2) obj).b();
        }
        bc2 bc2Var = this.i3;
        if (bc2Var != null && (ic0Var = bc2Var.b) != null) {
            ic0Var.f();
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
        hd5 hd5Var = this.X5;
        if (hd5Var != null) {
            hd5Var.e();
        }
        this.A7.K();
        sb2 sb2Var = this.tc;
        if (sb2Var != null) {
            sb2Var.b.K();
        }
        sb2 sb2Var2 = this.uc;
        if (sb2Var2 != null) {
            sb2Var2.b.K();
        }
        byb bybVar = this.f0;
        if (bybVar != null) {
            bybVar.b();
        }
        Q();
        if (this.G3 && (ac2Var = this.t0) != null && ac2Var.d != null && ac2Var.e != null) {
            in5 z = in5.z();
            String str = this.t0.d;
            if (str != null) {
                z.A.remove(str);
            }
            this.G3 = false;
        }
        r3b r3bVar = this.f1;
        if (r3bVar != null) {
            r3bVar.a(this);
        }
        lq3.q(this.a6).v(this);
        if (getDelegate() != null && getDelegate().l2() != null) {
            bmb l2 = getDelegate().l2();
            l2.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == l2.w) {
                l2.W = null;
            }
        }
        dc2Var.w0 = false;
        if (MediaController.z().H(this.Q5)) {
            p40 p40Var = aob.d5;
            if (p40Var == null) {
                p40Var = new p40();
                aob.d5 = p40Var;
            }
            p40Var.i = null;
        }
        ValueAnimator valueAnimator = this.Gb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Gb.cancel();
        }
        this.O.p();
        this.Fb = false;
        c34 c34Var = this.zb;
        if (c34Var != null) {
            c34Var.g();
        }
        ul ulVar = this.Ca;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = this.Da;
        if (ulVar2 != null) {
            ulVar2.b();
        }
        mpa mpaVar = this.ca;
        if (mpaVar != null) {
            mpaVar.b(this);
        }
        mj1 mj1Var = this.w;
        if (mj1Var != null) {
            ArrayList arrayList2 = mj1Var.p;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                lj1 lj1Var = (lj1) arrayList2.get(i3);
                int i4 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = lj1Var.c;
                    if (i4 < imageReceiverArr.length) {
                        imageReceiverArr[i4].K();
                        i4++;
                    }
                }
            }
        }
        jh2.d().g(this.Oc);
    }

    @Override
    public void onDraw(Canvas canvas) {
        d1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        nm9 f4 = f4();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        wb2 wb2Var;
        int i3;
        r47 r47Var = this.Q5;
        boolean z = true;
        if (r47Var != null && (r47Var.I() || this.V3 != hl.q.y)) {
            this.C0 = true;
            r47 r47Var2 = this.Q5;
            this.Q5 = null;
            wb2Var = this;
            wb2Var.z3(r47Var2, this.L, this.G, this.F, this.H, false);
            wb2Var.C0 = false;
        } else {
            wb2Var = this;
        }
        wb2Var.b4();
        int i4 = wb2Var.W + wb2Var.g0 + wb2Var.i0 + wb2Var.v0 + wb2Var.x0 + wb2Var.e0;
        iv1 draftMessageMeasureController = wb2Var.getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(wb2Var.Q5)) {
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
        wb2Var.Rc = Math.max(0, i3 - i4);
        wb2Var.setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.K6) {
            r47 r47Var = this.Q5;
            if (r47Var != null && (charSequence2 = r47Var.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.Q5.v);
                return;
            }
            r47 r47Var2 = this.Q5;
            if (r47Var2 != null && (charSequence = r47Var2.z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.Q5.z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void p() {
        rb2 rb2Var;
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
            if (this.ic && (rb2Var = this.eb) != null) {
                rb2Var.d();
            }
        }
    }

    public final void p1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.p1(android.graphics.Canvas):void");
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
            o47 o47Var = (o47) arrayList.get(i4);
            if (i >= o47Var.n && i < o47Var.r) {
                this.A0 = i4;
                j3();
                try {
                    f66 c3 = c3();
                    c3.c = true;
                    c3.d(o47Var.e, i, 0.0f);
                    o47Var.e.getSelectionPath(i, i2, c3);
                    c3.a();
                    float f = o47Var.w + o47Var.h;
                    if (i2 >= o47Var.n + i3) {
                        for (int i5 = i4 + 1; i5 < arrayList.size(); i5++) {
                            o47 o47Var2 = (o47) arrayList.get(i5);
                            int i6 = o47Var2.r - o47Var2.n;
                            f66 c32 = c3();
                            c32.c = true;
                            float f2 = f + o47Var2.f;
                            c32.d(o47Var2.e, 0, f2);
                            f = f2 + o47Var2.w + o47Var2.h;
                            o47Var2.e.getSelectionPath(0, i2 - o47Var2.n, c32);
                            c32.a();
                            if (i2 < (o47Var.n + i6) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.B0) {
                        this.y6 = true;
                        this.z6 = 2500;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
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
        ec7 ec7Var;
        wb2 wb2Var;
        if (this.Q5.T2()) {
            Drawable t = this.U0.t();
            if (t instanceof a29) {
                final a29 a29Var = (a29) t;
                String C0 = this.Q5.C0();
                TLRPC.TL_messages_stickerSet o0 = ls6.d0(this.a6).o0(C0);
                if (o0 == null) {
                    ls6.d0(this.a6).d1(C0, true, true);
                    return false;
                }
                int D0 = this.Q5.D0();
                if ("🎰".equals(this.Q5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        lna lnaVar = (lna) a29Var;
                        if (lnaVar.V0 == null && !lnaVar.W0) {
                            int i = D0 - 1;
                            int S = lna.S(i & 3);
                            int S2 = lna.S((i >> 2) & 3);
                            int S3 = lna.S(i >> 4);
                            if (S == 4 && S2 == 4 && S3 == 4) {
                                S = 5;
                                S3 = 5;
                                S2 = 5;
                            }
                            lnaVar.c1 = S;
                            lnaVar.d1 = S2;
                            lnaVar.e1 = S3;
                            r47 messageObject = getMessageObject();
                            int i2 = getMessageObject().K1;
                            lnaVar.W0 = true;
                            wb2Var = this;
                            Utilities.e.c(new q25(lnaVar, o0, i2, messageObject, wb2Var, z, (byte) 5));
                        } else {
                            wb2Var = this;
                        }
                        if (wb2Var.Q5.N3()) {
                            a29Var.N(Integer.MAX_VALUE, wb2Var.Bb);
                        }
                        wb2Var.Q5.n1 = false;
                    } else {
                        wb2Var = this;
                    }
                    if (a29Var.n0 == null && !a29Var.Z0 && o0.documents.size() > 0) {
                        lna lnaVar2 = (lna) a29Var;
                        if (lnaVar2.n0 == null && !lnaVar2.Z0) {
                            lnaVar2.Z0 = true;
                            Utilities.e.c(new l77(lnaVar2, o0, wb2Var.getMessageObject().K1, wb2Var.getMessageObject(), wb2Var, (byte) 25));
                            return true;
                        }
                    }
                } else {
                    if (a29Var.n0 == null && !a29Var.Z0 && o0.documents.size() > 0) {
                        TLRPC.Document document = o0.documents.get(0);
                        xb4.G(this.a6);
                        File J = xb4.J(document, null, true, true);
                        if (a29Var.n0 == null && !a29Var.Z0) {
                            final String v2 = hl.v2(J, 0);
                            if (TextUtils.isEmpty(v2)) {
                                lq3.q(this.a6).a(xb4.r(null, document), this.Q5, this);
                                xb4.G(this.a6).X(document, o0, 1, 1);
                            } else {
                                a29Var.Z0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3 = 0;
                                        switch (r3) {
                                            case 0:
                                                final a29 a29Var2 = a29Var;
                                                String str = v2;
                                                if (a29Var2.X0) {
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b = r2;
                                                            a29 a29Var3 = a29Var2;
                                                            switch (b) {
                                                                case 0:
                                                                    a29Var3.Z0 = false;
                                                                    if (!a29Var3.W0 && a29Var3.X0) {
                                                                        a29Var3.x(true);
                                                                        return;
                                                                    }
                                                                    a29Var3.g();
                                                                    a29Var3.D();
                                                                    a29Var3.s();
                                                                    return;
                                                                default:
                                                                    a29Var3.W0 = false;
                                                                    if (!a29Var3.Z0 && a29Var3.X0) {
                                                                        a29Var3.x(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                a29Var2.V0 = RLottieNative.b(str, null, null, null);
                                                if (a29Var2.V0 != null) {
                                                    i3 = a29Var2.V0.a[0];
                                                }
                                                if (a29Var2.V0 != null) {
                                                    int i4 = a29Var2.V0.a[1];
                                                }
                                                hl.c3(new me7(a29Var2, i3, (byte) 12));
                                                return;
                                            default:
                                                final a29 a29Var3 = a29Var;
                                                a29Var3.n0 = RLottieNative.b(v2, a29Var3.e, null, null);
                                                hl.c3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        byte b = r2;
                                                        a29 a29Var32 = a29Var3;
                                                        switch (b) {
                                                            case 0:
                                                                a29Var32.Z0 = false;
                                                                if (!a29Var32.W0 && a29Var32.X0) {
                                                                    a29Var32.x(true);
                                                                    return;
                                                                }
                                                                a29Var32.g();
                                                                a29Var32.D();
                                                                a29Var32.s();
                                                                return;
                                                            default:
                                                                a29Var32.W0 = false;
                                                                if (!a29Var32.Z0 && a29Var32.X0) {
                                                                    a29Var32.x(true);
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
                        lq3.q(this.a6).v(this);
                    }
                    if (D0 >= 0 && D0 < o0.documents.size()) {
                        if (!z && this.Q5.N3() && (ec7Var = (ec7) uc7.s1(this.a6).A3.get(C0)) != null && ec7Var.b == D0) {
                            a29Var.N(ec7Var.a, this.Bb);
                        }
                        TLRPC.Document document2 = o0.documents.get(Math.max(D0, 0));
                        xb4.G(this.a6);
                        File J2 = xb4.J(document2, null, true, true);
                        if (a29Var.V0 == null && !a29Var.W0) {
                            final String v22 = hl.v2(J2, 0);
                            if (TextUtils.isEmpty(v22)) {
                                lq3.q(this.a6).a(xb4.r(null, document2), this.Q5, this);
                                xb4.G(this.a6).X(document2, o0, 1, 1);
                                this.Q5.n1 = false;
                            } else {
                                if (z && a29Var.R == null && a29Var.S == null && a29Var.Q == null) {
                                    a29Var.K = (byte) 2;
                                    a29Var.Y0 = true;
                                }
                                a29Var.W0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3 = 0;
                                        switch (r3) {
                                            case 0:
                                                final a29 a29Var2 = a29Var;
                                                String str = v22;
                                                if (a29Var2.X0) {
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b = r2;
                                                            a29 a29Var32 = a29Var2;
                                                            switch (b) {
                                                                case 0:
                                                                    a29Var32.Z0 = false;
                                                                    if (!a29Var32.W0 && a29Var32.X0) {
                                                                        a29Var32.x(true);
                                                                        return;
                                                                    }
                                                                    a29Var32.g();
                                                                    a29Var32.D();
                                                                    a29Var32.s();
                                                                    return;
                                                                default:
                                                                    a29Var32.W0 = false;
                                                                    if (!a29Var32.Z0 && a29Var32.X0) {
                                                                        a29Var32.x(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                a29Var2.V0 = RLottieNative.b(str, null, null, null);
                                                if (a29Var2.V0 != null) {
                                                    i3 = a29Var2.V0.a[0];
                                                }
                                                if (a29Var2.V0 != null) {
                                                    int i4 = a29Var2.V0.a[1];
                                                }
                                                hl.c3(new me7(a29Var2, i3, (byte) 12));
                                                return;
                                            default:
                                                final a29 a29Var3 = a29Var;
                                                a29Var3.n0 = RLottieNative.b(v22, a29Var3.e, null, null);
                                                hl.c3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        byte b = r2;
                                                        a29 a29Var32 = a29Var3;
                                                        switch (b) {
                                                            case 0:
                                                                a29Var32.Z0 = false;
                                                                if (!a29Var32.W0 && a29Var32.X0) {
                                                                    a29Var32.x(true);
                                                                    return;
                                                                }
                                                                a29Var32.g();
                                                                a29Var32.D();
                                                                a29Var32.s();
                                                                return;
                                                            default:
                                                                a29Var32.W0 = false;
                                                                if (!a29Var32.Z0 && a29Var32.X0) {
                                                                    a29Var32.x(true);
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
                        lq3.q(this.a6).v(this);
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
        wb2 wb2Var;
        ArrayList arrayList;
        rb2 rb2Var = this.eb;
        int i2 = 0;
        if (rb2Var != null && rb2Var.i2(i)) {
            return false;
        }
        if (i == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                E0(false);
                return true;
            } else if (this.Q5.D == 16) {
                this.eb.a2(this, this.S3, this.T3);
                return true;
            } else {
                D0();
                return true;
            }
        }
        if (i == 2131296267) {
            F0();
        } else if (i == 2131296264) {
            rb2 rb2Var2 = this.eb;
            if (rb2Var2 != null) {
                if (this.Q5.D == 16) {
                    rb2Var2.v(this, 0.0f, 0.0f);
                } else {
                    rb2Var2.a2(this, this.S3, this.T3);
                }
            }
        } else {
            if (i == 2131296265) {
                rb2 rb2Var3 = this.eb;
                if (rb2Var3 != null) {
                    TLRPC.Chat chat = this.Ga;
                    if (chat != null) {
                        wb2Var = this;
                        rb2Var3.T1(wb2Var, chat, this.Q5.k.fwd_from.channel_post, this.h1, this.i1, false);
                    } else {
                        wb2Var = this;
                        TLRPC.User user = wb2Var.Ea;
                        if (user != null) {
                            rb2Var3.W(wb2Var, user, wb2Var.h1, wb2Var.i1);
                        } else if (wb2Var.Ha != null) {
                            rb2Var3.N0(wb2Var);
                        }
                    }
                }
            } else {
                wb2Var = this;
                if (i == 2131296270) {
                    rb2 rb2Var4 = wb2Var.eb;
                    if (rb2Var4 != null) {
                        rb2Var4.G(wb2Var);
                    }
                } else if (i == 2131296263 && wb2Var.eb != null && (arrayList = wb2Var.Q5.B2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        o47 o47Var = (o47) obj;
                        if (o47Var.O) {
                            wb2Var.eb.n1(o47Var);
                            break;
                        }
                    }
                }
            }
            if ((!r47.Q4(wb2Var.Q5.k) || wb2Var.Q5.g4() || (wb2Var.Q5.I3() && MediaController.z().H(wb2Var.Q5))) && wb2Var.F4.g(null, i, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        wb2Var = this;
        if (!r47.Q4(wb2Var.Q5.k)) {
        }
        return true;
    }

    @Override
    public final boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.q():boolean");
    }

    public final int q0(r47 r47Var, m47 m47Var, boolean z) {
        m47 m47Var2 = m47Var;
        nl nlVar = this.U0;
        nlVar.p0 = true;
        ImageReceiver imageReceiver = this.A7;
        imageReceiver.p0 = true;
        ImageReceiver imageReceiver2 = this.T7;
        imageReceiver2.p0 = true;
        ImageReceiver imageReceiver3 = this.F7;
        imageReceiver3.p0 = true;
        int i = 0;
        if (m47Var2 != null) {
            ArrayList arrayList = m47Var2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != m47Var2.f.size()) {
                    m47Var2.a();
                }
                this.td = 0;
                int i2 = 0;
                while (i < arrayList.size()) {
                    r47 r47Var2 = (r47) arrayList.get(i);
                    j47 d = m47Var2.d(r47Var2);
                    if (d != null && (d.l & 1) != 0) {
                        y3(r47Var2, m47Var2, false, false, false, false);
                        if (z && !TextUtils.isEmpty(this.p3)) {
                            S3();
                            this.td = (int) (i2 + this.t3);
                            this.ud = this.m3;
                        }
                        i2 = this.v0 + this.x0 + i2;
                    }
                    i++;
                    m47Var2 = m47Var;
                }
                return i2;
            }
        }
        y3(r47Var, m47Var, false, false, false, false);
        nlVar.p0 = false;
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
        x49 x49Var = this.O;
        if (z2) {
            x49Var.a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.V4 && m2()) {
            if (x49Var.a > 0.0f) {
                C();
            }
            if (getAlpha() * f != 1.0f) {
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f * 255.0f), 31);
                z = true;
            } else {
                z = false;
            }
            int i = (x49Var.a > 0.0f ? 1 : (x49Var.a == 0.0f ? 0 : -1));
            dc2 dc2Var = this.ub;
            if (i <= 0 && dc2Var.x0 && this.M == null && !this.Kb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + dc2Var.j0);
                x49Var.A = 0.0f;
                x49Var.B = false;
                if (dc2Var.h) {
                    f2 = dc2Var.L1;
                }
                x49Var.d(canvas, f2, num);
                canvas.restore();
            } else {
                x49Var.A = 0.0f;
                x49Var.B = false;
                if (dc2Var.h) {
                    f2 = dc2Var.L1;
                }
                x49Var.d(canvas, f2, num);
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public final void q3(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            ui7 ui7Var = this.Mc;
            dc2 dc2Var = this.ub;
            if (ui7Var != null && ui7Var.h) {
                this.Uc = 0.0f;
            } else {
                float f = i2 + i4 + dc2Var.j0;
                this.Uc = f - ((int) f);
            }
            drawable.setBounds((int) (i + dc2Var.h0), (int) (i2 + dc2Var.k0), (int) (i + i3 + dc2Var.i0), (int) (i2 + i4 + dc2Var.j0));
            if (drawable == this.L6) {
                this.I8.set(drawable.getBounds());
            }
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        r47 r47Var = this.Q5;
        if (r47Var != null && imageReceiver == this.U0 && r47Var.J2()) {
            this.eb.T(this.Q5);
        }
    }

    public final void r0(wb2 wb2Var) {
        if (wb2Var == null) {
            return;
        }
        wb2Var.f6 = this.f6;
        wb2Var.s6 = this.s6;
        wb2Var.h6 = this.h6;
        wb2Var.i6 = this.i6;
        wb2Var.j6 = this.j6;
        wb2Var.k6 = this.k6;
        wb2Var.l6 = this.l6;
        wb2Var.m6 = this.m6;
        wb2Var.n6 = this.n6;
        wb2Var.o6 = this.o6;
        wb2Var.p6 = this.p6;
        wb2Var.q6 = this.q6;
        wb2Var.t6 = this.t6;
        wb2Var.u6 = this.u6;
        wb2Var.v6 = this.v6;
        wb2Var.W6 = this.W6;
        wb2Var.X6 = this.X6;
        wb2Var.Y6 = this.Y6;
        wb2Var.Z6 = this.Z6;
        wb2Var.a7 = this.a7;
    }

    public final boolean r1(Canvas canvas) {
        boolean z = this.Kb;
        float f = 1.0f;
        x49 x49Var = this.O;
        if (z) {
            x49Var.a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z2 = false;
        if (!this.V4 || !m2()) {
            return false;
        }
        if (x49Var.a > 0.0f) {
            C();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z2 = true;
        }
        int i = (x49Var.a > 0.0f ? 1 : (x49Var.a == 0.0f ? 0 : -1));
        dc2 dc2Var = this.ub;
        if (i <= 0 && dc2Var.x0 && this.M == null && !this.Kb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + dc2Var.j0);
            if (dc2Var.h) {
                f = dc2Var.L1;
            }
            x49Var.e(canvas, f);
            canvas.restore();
        } else {
            if (dc2Var.h) {
                f = dc2Var.L1;
            }
            x49Var.e(canvas, f);
        }
        if (z2) {
            canvas.restore();
        }
        return true;
    }

    public final void r2() {
        rb2 rb2Var = this.eb;
        if (rb2Var != null && rb2Var.h()) {
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

    public final void s0(wb2 wb2Var) {
        mpa mpaVar;
        if (wb2Var != null && (mpaVar = wb2Var.ca) != null) {
            int i = (Integer) mpaVar.k.get(wb2Var);
            if (i == null) {
                i = 0;
            }
            this.da = i;
            mpa mpaVar2 = this.ca;
            if (mpaVar2 != null) {
                mpaVar2.k.put(this, i);
            }
        }
    }

    public final void s1(Canvas canvas, hl9 hl9Var, float f, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (hl9Var != null && f > 0.0f && hl9Var.B()) {
            if (f < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.o0, this.u0);
            hl9Var.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean s2() {
        if (this.u4.a <= 0 && this.O.p) {
            r47 r47Var = this.Q5;
            if (r47Var == null || !r47Var.t1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void s3(byte[] bArr) {
        r47 r47Var = this.R5;
        if (r47Var == null) {
            r47Var = this.Q5;
        }
        if (r47Var == null) {
            this.o3 = null;
            return;
        }
        m19 m19Var = this.o3;
        if (m19Var == null || !m19Var.f || !Arrays.equals(m19Var.g, bArr)) {
            this.o3 = new m19(this, r47Var.e1(), bArr);
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
        j47 j47Var = this.M;
        if ((j47Var != null && (j47Var.c != 0 || j47Var.a != 0)) || ((this.y && !r47.Q4(this.Q5.k)) || this.Q7 == null || this.R7 == null)) {
            j47 j47Var2 = this.M;
            if (j47Var2 != null) {
                int i = j47Var2.l;
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

    public void setAvatar(r47 r47Var) {
        if (r47Var != null) {
            if (!this.G6 && !g2()) {
                this.xa = null;
                return;
            }
            Drawable drawable = r47Var.m2;
            ImageReceiver imageReceiver = this.A7;
            if (drawable != null) {
                imageReceiver.g0(drawable);
                return;
            }
            TLRPC.User user = this.va;
            rb0 rb0Var = this.B7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.xa = userProfilePhoto.photo_small;
                } else {
                    this.xa = null;
                }
                rb0Var.q(user);
                imageReceiver.V(this.va, rb0Var, null, i86.e(360928), 1, false);
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
                if (chat.signature_profiles && r47.B0(r47Var.k) != 1271266957) {
                    long n = wf3.n(r47Var.k.from_id);
                    int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                    int i2 = r47Var.K1;
                    if (i >= 0) {
                        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                        rb0Var.q(X1);
                        imageReceiver.U(X1, rb0Var, null);
                        return;
                    }
                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
                    rb0Var.p(M0);
                    imageReceiver.U(M0, rb0Var, null);
                    return;
                }
                rb0Var.p(this.wa);
                imageReceiver.U(this.wa, rb0Var, null);
            } else if (r47Var.q4()) {
                TLRPC.Photo photo = r47Var.V0;
                if (photo != null) {
                    imageReceiver.d0(jn5.i(xb4.w(photo.sizes, hl.L(50.0f), false, null, true), r47Var.V0), "50_50", rb0Var, null, null, 0);
                }
            } else {
                this.xa = null;
                rb0Var.j(r47Var.Z0(), null, null, null);
                imageReceiver.d0(null, null, rb0Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(rb2 rb2Var) {
        this.eb = rb2Var;
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
        v41 v41Var = this.H2;
        if (v41Var == null) {
            v41Var = new v41(this);
            this.H2 = v41Var;
        }
        this.G2 = z;
        v41Var.c(z);
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

    public void setMessageObjectInternal(defpackage.r47 r67) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.setMessageObjectInternal(r47):void");
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

    public void setResourcesProvider(vnb vnbVar) {
        this.cc = vnbVar;
        RadialProgress2 radialProgress2 = this.Q0;
        if (radialProgress2 != null) {
            radialProgress2.F = vnbVar;
        }
        RadialProgress2 radialProgress22 = this.R0;
        if (radialProgress22 != null) {
            radialProgress22.F = vnbVar;
        }
        jo9 jo9Var = this.d3;
        if (jo9Var != null) {
            jo9Var.n = vnbVar;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.yd = rectF;
    }

    @Override
    public void setScrimHidden(boolean z) {
        qd4.a(this, z);
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
            ((npa) arrayList.get(i)).invalidateSelf();
            i++;
        }
        p47 p47Var = this.m3;
        if (p47Var != null && p47Var.e != null) {
            for (int i2 = 0; i2 < this.m3.e.size(); i2++) {
                o47 o47Var = (o47) this.m3.e.get(i2);
                for (int i3 = 0; i3 < o47Var.y.size(); i3++) {
                    ((npa) o47Var.y.get(i3)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            for (int i4 = 0; i4 < getMessageObject().B2.size(); i4++) {
                o47 o47Var2 = (o47) getMessageObject().B2.get(i4);
                for (int i5 = 0; i5 < o47Var2.y.size(); i5++) {
                    ((npa) o47Var2.y.get(i5)).invalidateSelf();
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

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            invalidate();
            r2();
        }
    }

    public final void t0(wb2 wb2Var) {
        wb2Var.D3(this.Cc, this.Ec, this.Fc, this.Gc, this.Hc, this.L0, this.M0, this.pb, this.qb, this.Dc);
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
            f = hl.L(4.0f);
        } else {
            f = 0.0f;
        }
        boolean z2 = true;
        if (MediaController.z().H(this.Q5) && MediaController.z().G()) {
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
            f2 = hl.H.getInterpolation(this.Nb);
        } else {
            f2 = this.Nb;
        }
        dc2 dc2Var = this.ub;
        if (dc2Var.l2) {
            boolean z3 = this.Lb;
            float f17 = dc2Var.L1;
            if (!z3) {
                f17 = 1.0f - f17;
            }
            f = hl.L(4.0f) * f17;
        }
        float L = (hl.L(16.0f) * f2) + f;
        int i2 = (this.Nb > 0.0f ? 1 : (this.Nb == 0.0f ? 0 : -1));
        nl nlVar = this.U0;
        if (i2 > 0) {
            float f18 = nlVar.N0 / 2.0f;
            ko9 ko9Var = aob.um;
            if (ko9Var == null) {
                ko9Var = new ko9((byte) 0, false);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, 0, vm2.o(-16777216, 40)}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                ko9Var.b = radialGradient;
                Paint paint = new Paint();
                ko9Var.c = paint;
                ko9Var.d = new Matrix();
                paint.setShader(radialGradient);
                aob.um = ko9Var;
            }
            float r = nlVar.r();
            float s = nlVar.s();
            float f19 = this.Nb;
            Paint paint2 = (Paint) ko9Var.c;
            f5 = 255.0f;
            Matrix matrix = (Matrix) ko9Var.d;
            f3 = 2.0f;
            f4 = 0.10666667f;
            if (((int) r) + (((int) s) << 12) + (((int) f18) << 24) != 0) {
                matrix.reset();
                float f20 = f18 / 100.0f;
                matrix.setTranslate(r, s);
                matrix.preScale(f20, f20);
                ((RadialGradient) ko9Var.b).setLocalMatrix(matrix);
            }
            paint2.setAlpha((int) (f19 * 255.0f));
            canvas.drawCircle(r, s, f18, paint2);
        } else {
            f3 = 2.0f;
            f4 = 0.10666667f;
            f5 = 255.0f;
        }
        float N = hl.N(1.5f) + nlVar.L0 + L;
        float N2 = hl.N(1.5f) + nlVar.M0 + L;
        float w = (nlVar.w() - hl.N(1.5f)) - L;
        float x = (nlVar.x() - hl.N(1.5f)) - L;
        RectF rectF = this.c4;
        rectF.set(N, N2, w, x);
        if (this.Mb == 1.0f && (this.R1 || getVideoTranscriptionProgress() <= 0.0f)) {
            i = -1;
        } else {
            int alpha = aob.k2.getAlpha();
            Paint paint3 = aob.k2;
            float f21 = this.Mb;
            if (!this.R1) {
                f6 = 1.0f - getVideoTranscriptionProgress();
            } else {
                f6 = 1.0f;
            }
            paint3.setAlpha((int) (f21 * f6 * alpha));
            i = alpha;
        }
        rec recVar = this.ac;
        if (recVar != null && recVar.j) {
            float f22 = nlVar.L0;
            float f23 = nlVar.M0;
            recVar.setBounds((int) f22, (int) f23, (int) (f22 + nlVar.N0), (int) (f23 + nlVar.O0));
            this.ac.draw(canvas);
        }
        int alpha2 = aob.k2.getAlpha();
        float strokeWidth = aob.k2.getStrokeWidth();
        if (this.Mb == 1.0f) {
            f7 = this.Q5.b0;
        } else {
            f7 = this.Wb;
        }
        if (f2 > 0.0f) {
            float width = rectF.width() / f3;
            aob.k2.setStrokeWidth((0.5f * strokeWidth * this.Nb) + strokeWidth);
            aob.k2.setAlpha((int) (alpha2 * this.Nb * 0.3f));
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), width, aob.k2);
            aob.k2.setAlpha(alpha2);
            double d = ((-360.0f) * f7) + 180.0f;
            f8 = 0.0f;
            float f24 = f2;
            double d2 = width;
            this.Rb = (float) ((Math.sin(Math.toRadians(d)) * d2) + rectF.centerX());
            this.Sb = (float) ((Math.cos(Math.toRadians(d)) * d2) + rectF.centerY());
            aob.m2.setColor(-1);
            Paint paint4 = aob.m2;
            float min = Math.min(1.0f, f24) * f5;
            if (!this.R1) {
                f10 = 1.0f - getVideoTranscriptionProgress();
            } else {
                f10 = 1.0f;
            }
            paint4.setAlpha((int) (min * f10));
            canvas.drawCircle(this.Rb, this.Sb, (hl.L(3.0f) * this.Ob) + (hl.L(5.0f) * f24) + hl.L(3.0f), aob.m2);
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
                i = aob.k2.getAlpha();
            }
            float f27 = alpha2;
            aob.k2.setAlpha((int) ((1.0f - this.Vb) * f27));
            canvas.drawArc(rectF, -90.0f, f7 * 360.0f, false, aob.k2);
            aob.k2.setAlpha((int) (f27 * this.Vb));
            canvas.drawArc(rectF, -90.0f, this.Ub * 360.0f, false, aob.k2);
            i = i;
        } else {
            canvas.drawArc(rectF, -90.0f, f7 * 360.0f, false, aob.k2);
        }
        if (i != -1) {
            aob.k2.setAlpha(i);
        }
        aob.k2.setStrokeWidth(strokeWidth);
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
        r47 r47Var = this.R5;
        if (r47Var == null) {
            r47Var = this.Q5;
        }
        this.B0 = false;
        ArrayList arrayList = this.x4;
        if (r47Var != null && r47Var.k.message != null && characterStyle != null) {
            if (this.m3 != null && !TextUtils.isEmpty(r47Var.z)) {
                CharSequence charSequence = r47Var.z;
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
                            o47 o47Var = (o47) this.m3.e.get(i6);
                            if (i4 >= o47Var.n && i4 < o47Var.r) {
                                this.A0 = i6;
                                this.B0 = false;
                                j3();
                                try {
                                    f66 c3 = c3();
                                    c3.d(o47Var.e, i4, 0.0f);
                                    o47Var.e.getSelectionPath(i4, i3, c3);
                                    if (i3 >= o47Var.n + i5) {
                                        for (int i7 = i6 + 1; i7 < this.m3.e.size(); i7++) {
                                            o47 o47Var2 = (o47) this.m3.e.get(i7);
                                            int i8 = o47Var2.r - o47Var2.n;
                                            f66 c32 = c3();
                                            c32.d(o47Var2.e, 0, o47Var2.w);
                                            o47Var2.e.getSelectionPath(0, i3 - o47Var2.n, c32);
                                            if (i3 < (o47Var.n + i8) - 1) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                invalidate();
                                return;
                            }
                        }
                    }
                }
            }
            CharSequence charSequence2 = r47Var.v;
            if ((charSequence2 instanceof Spanned) && r47Var.B2 != null) {
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
                    for (int i10 = 0; i10 < r47Var.B2.size(); i10++) {
                        o47 o47Var3 = (o47) r47Var.B2.get(i10);
                        if (i2 >= o47Var3.n && i2 < o47Var3.r) {
                            this.A0 = i10;
                            this.B0 = false;
                            j3();
                            try {
                                f66 c33 = c3();
                                c33.d(o47Var3.e, i2, 0.0f);
                                o47Var3.e.getSelectionPath(i2, i, c33);
                                if (i >= o47Var3.n + i9) {
                                    for (int i11 = i10 + 1; i11 < r47Var.B2.size(); i11++) {
                                        o47 o47Var4 = (o47) r47Var.B2.get(i11);
                                        int i12 = o47Var4.r - o47Var4.n;
                                        f66 c34 = c3();
                                        c34.d(o47Var4.e, 0, o47Var4.w);
                                        o47Var4.e.getSelectionPath(0, i - o47Var4.n, c34);
                                        if (i < (o47Var3.n + i12) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
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
            this.l7 = new rb0[3];
            this.m7 = new boolean[3];
            int i = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.k7;
                if (i < imageReceiverArr.length) {
                    imageReceiverArr[i] = new ImageReceiver(this);
                    this.k7[i].q0(hl.L(12.0f));
                    this.l7[i] = new rb0((vnb) null);
                    this.l7[i].s(hl.L(18.0f));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u1(Canvas canvas, Integer num, float f, boolean z) {
        j47 j47Var = this.M;
        if (j47Var != null) {
            int i = j47Var.l;
            if ((i & 8) == 0 || (i & 1) == 0) {
                return;
            }
        }
        x49 x49Var = this.O;
        x49Var.getClass();
        x49Var.A = f;
        x49Var.B = z;
        x49Var.d(canvas, this.ub.L1, num);
    }

    public final boolean u2() {
        m47 m47Var;
        if (v2() && (m47Var = this.L) != null && this.M != null && !m47Var.b && !m47Var.i) {
            return true;
        }
        return false;
    }

    public final void u3(int i) {
        r47 r47Var = this.R5;
        if (r47Var == null) {
            r47Var = this.Q5;
        }
        if (r47Var == null) {
            this.o3 = null;
            return;
        }
        m19 m19Var = this.o3;
        if (m19Var == null || !m19Var.e || m19Var.c != (-i)) {
            this.o3 = new m19(this, r47Var.e1(), i);
        }
        this.B0 = true;
    }

    @Override
    public final void v(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.v(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void v1(nt1 nt1Var, Canvas canvas, int i, Integer num, float f) {
        j47 j47Var = this.M;
        if (j47Var != null) {
            int i2 = j47Var.l;
            if ((i2 & 8) == 0 || (i2 & 1) == 0) {
                return;
            }
        }
        x49 x49Var = this.O;
        x49Var.getClass();
        x49Var.A = f;
        x49Var.f(nt1Var, canvas, i, num);
    }

    public final boolean v2() {
        r47 r47Var;
        if (w2() && (r47Var = this.Q5) != null && !r47Var.O3()) {
            return true;
        }
        return false;
    }

    public final void v3(String str) {
        w3(false, -1, str, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        hf0 hf0Var;
        kh8 kh8Var;
        wg8 wg8Var;
        sb2 sb2Var;
        sb2 sb2Var2;
        sb2 sb2Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.J2;
            if (drawable != drawableArr[0] && drawable != this.y3 && drawable != drawableArr[1]) {
                zb2 zb2Var = this.Y0;
                if (zb2Var != null) {
                    hf0Var = zb2Var.x;
                } else {
                    hf0Var = null;
                }
                if (drawable == hf0Var || drawable == this.V2 || drawable == this.Wa || ((drawable != null && (((sb2Var = this.tc) != null && drawable == sb2Var.k) || (((sb2Var2 = this.uc) != null && drawable == sb2Var2.k) || ((sb2Var3 = this.ad) != null && drawable == sb2Var3.k)))) || ((this.O != null && (drawable instanceof hn)) || (drawable instanceof va6)))) {
                    return true;
                }
                cc2 cc2Var = this.x2;
                if (cc2Var == null || (wg8Var = cc2Var.l) == null || (drawable != wg8Var && drawable != wg8Var.a)) {
                    ArrayList arrayList = this.Q4;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        vb2 vb2Var = (vb2) obj;
                        if (vb2Var.w != drawable && ((kh8Var = vb2Var.x) == null || (drawable != kh8Var && drawable != kh8Var.a && drawable != kh8Var.b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final int w0(int i, r47 r47Var) {
        TLRPC.Document F0;
        TLRPC.WebPage webPage;
        boolean z;
        int i2;
        hb2 hb2Var;
        hb2 hb2Var2;
        int i3 = i;
        TLRPC.MessageMedia messageMedia = r47Var.a1;
        TLRPC.PhotoSize photoSize = null;
        if (messageMedia != null) {
            F0 = messageMedia.document;
            this.N1 = F0;
        } else if (r47Var.D == 0) {
            TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
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
            F0 = r47Var.F0();
            this.N1 = F0;
        }
        int i4 = 0;
        if (F0 != null) {
            double d = 0.0d;
            if (r47.P4(F0)) {
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
                Typeface typeface = hl.a;
                aob.N2.measureText("00:00");
                this.V6 = i3 - hl.L(18.0f);
                Z2(r47Var);
                int L = hl.L(174.0f) + this.M9;
                if (!this.R1) {
                    this.b7 = Math.min(i3, L + ((int) Math.ceil(aob.N2.measureText(hl.g0((int) d, true, false)))));
                }
                this.E4.m = r47Var;
                return 0;
            } else if (r47.J4(this.N1)) {
                this.M1 = (byte) 4;
                if (!r47Var.l5()) {
                    W3();
                    String i0 = hl.i0(this.N1.size, false, false);
                    this.f3 = (int) Math.ceil(aob.C2.measureText(i0));
                    this.e3 = new StaticLayout(i0, aob.C2, this.f3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (r47.J3(this.N1)) {
                F1();
                this.M1 = (byte) 5;
                int L2 = i3 - hl.L(92.0f);
                if (L2 < 0) {
                    L2 = hl.L(100.0f);
                }
                int i6 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(r47Var.y1(true).replace('\n', ' '), aob.O2, i6 - hl.L(12.0f), truncateAt);
                hb2 hb2Var3 = this.K4;
                TextPaint textPaint = aob.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                hb2Var3.d = new StaticLayout(ellipsize, textPaint, i6, alignment, 1.0f, 0.0f, false);
                if (this.K4.d.getLineCount() > 0) {
                    this.K4.e = -((int) Math.ceil(hb2Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.K4.d.getLineWidth(0);
                    if (hl.L(104.0f) + lineWidth > this.b7) {
                        this.b7 = hl.L(104.0f) + lineWidth;
                    }
                }
                this.K4.f = new StaticLayout(TextUtils.ellipsize(r47Var.w1(true).replace('\n', ' '), aob.P2, i6, truncateAt), aob.P2, i6, alignment, 1.0f, 0.0f, false);
                if (this.K4.f.getLineCount() > 0) {
                    this.K4.g = -((int) Math.ceil(hb2Var.f.getLineLeft(0)));
                    int lineWidth2 = (int) this.K4.f.getLineWidth(0);
                    if (hl.L(104.0f) + lineWidth2 > this.b7) {
                        this.b7 = hl.L(104.0f) + lineWidth2;
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
                int ceil = (int) Math.ceil(aob.N2.measureText(hl.k0(i7, i7)));
                this.V6 = this.b7 - hl.L(28.0f);
                return ceil;
            } else if (r47.s3(this.N1, r47Var.z2())) {
                this.M1 = (byte) 2;
                if (!r47Var.l5()) {
                    String M0 = ob6.M0(2131753964, "AttachGif");
                    this.C3 = (int) Math.ceil(aob.C2.measureText(M0));
                    TextPaint textPaint2 = aob.C2;
                    int i8 = this.C3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.x3 = new StaticLayout(M0, textPaint2, i8, alignment2, 1.0f, 0.0f, false);
                    String i02 = hl.i0(this.N1.size, false, false);
                    this.f3 = (int) Math.ceil(aob.C2.measureText(i02));
                    this.e3 = new StaticLayout(i02, aob.C2, this.f3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.N1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.N1.mime_type.toLowerCase().startsWith("video/mp4"))) || r47.W2(this.N1)) {
                    z = true;
                } else {
                    z = false;
                }
                this.O1 = z;
                if (!z) {
                    i3 += hl.L(30.0f);
                }
                int i9 = i3;
                this.M1 = (byte) 1;
                String B = xb4.B(this.N1);
                if (B.length() == 0) {
                    B = ob6.M0(2131753968, "AttachDocument");
                }
                StaticLayout c = o0b.c(B, aob.G2, i9, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i9, 2, false);
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
                int min = Math.min(i9 - hl.L(30.0f), (int) Math.ceil(aob.C2.measureText("000.0 mm / ".concat(hl.i0(this.N1.size, false, false)))));
                this.C3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(hl.i0(this.N1.size, false, false) + " " + xb4.A(this.N1), aob.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.C3 < 0) {
                        this.C3 = hl.L(10.0f);
                    }
                    this.x3 = new StaticLayout(ellipsize2, aob.C2, this.C3 + hl.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (this.O1) {
                    this.e4 = xb4.w(r47Var.p0, 320, false, null, false);
                    this.f4 = xb4.w(r47Var.p0, 40, false, null, false);
                    if (this.Q5.x3() || (lq3.q(this.a6).l() & 1) == 0) {
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
                        nl nlVar = this.U0;
                        nlVar.G0 = true;
                        nlVar.H0 = true;
                    }
                    this.h4 = "86_86_b";
                    this.U0.Z(jn5.f(photoSize, r47Var.n0), "86_86", jn5.f(this.f4, r47Var.n0), this.h4, this.g4, 0L, null, r47Var, 1);
                }
                return i2;
            }
        }
        return 0;
    }

    public final void w1(Canvas canvas, RectF rectF, float f) {
        String str;
        C();
        if (this.U8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f, f, c2(str));
        if (i2()) {
            canvas.drawRoundRect(rectF, f, f, aob.h2);
        }
    }

    public final boolean w2() {
        r47 r47Var = this.Q5;
        if (r47Var != null) {
            return r47Var.P2();
        }
        return aob.g1(this.cc);
    }

    public final boolean w3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.w3(boolean, int, java.lang.String, boolean):boolean");
    }

    public final void x1(Canvas canvas, boolean z) {
        float f;
        float f2;
        boolean z2;
        int i;
        float f3;
        float L;
        float f4;
        m47 m47Var;
        if ((!this.Q8 || z) && this.R8 != 0) {
            j47 j47Var = this.M;
            if (j47Var == null || (m47Var = this.L) == null || !m47Var.i || j47Var.h) {
                boolean O3 = this.Q5.O3();
                dc2 dc2Var = this.ub;
                if (O3) {
                    float L2 = dc2Var.j1 - hl.L(40.0f);
                    this.d9 = L2;
                    m47 m47Var2 = this.L;
                    if (m47Var2 != null) {
                        this.d9 = (m47Var2.m.e - this.wd) + L2;
                    }
                } else {
                    float L3 = hl.L(8.0f) + dc2Var.k1;
                    this.d9 = L3;
                    m47 m47Var3 = this.L;
                    if (m47Var3 != null) {
                        this.d9 = (m47Var3.m.g - this.wd) + L3;
                    }
                    if (v2()) {
                        this.d9 = Math.min(this.d9, getCompactRight() - hl.L(32.0f));
                    }
                }
                float f5 = 0.0f;
                if (this.R8 == 4) {
                    this.e9 = hl.L(6.0f);
                } else {
                    float L4 = (this.e7 + dc2Var.j0) - hl.L(41.0f);
                    this.e9 = L4;
                    r47 r47Var = this.Q5;
                    if (r47Var.D == 19 && r47Var.v2 < this.N9) {
                        L4 -= hl.L(22.0f);
                        this.e9 = L4;
                    }
                    m47 m47Var4 = this.L;
                    if (m47Var4 != null) {
                        l47 l47Var = m47Var4.m;
                        float f6 = L4 + l47Var.h;
                        this.e9 = f6;
                        if (l47Var.j) {
                            this.e9 = f6 - getTranslationY();
                        }
                    }
                    if (this.Q5.N5()) {
                        x49 x49Var = this.O;
                        x49Var.getClass();
                        if (this.Kb) {
                            this.e9 -= (1.0f - getVideoTranscriptionProgress()) * x49Var.i(dc2Var.L1);
                        } else if (x49Var.a > 0.0f) {
                            this.e9 -= x49Var.i(dc2Var.L1);
                        }
                    }
                }
                if (this.R8 != 4) {
                    float L5 = ((this.e7 + dc2Var.j0) - hl.L(32.0f)) / 2.0f;
                    if (this.e9 < L5) {
                        this.e9 = L5;
                    }
                }
                if (this.Q5.D == 19) {
                    if (this.R8 == 3 && this.n7 != null) {
                        this.e9 = hl.L(18.0f);
                    } else {
                        this.e9 = 0.0f;
                    }
                }
                if (!this.Q5.O3() && this.Kb && !this.R1) {
                    if (this.G6) {
                        L = (hl.b3(this.X6, w2()) - hl.u) * 0.7f;
                    } else {
                        L = hl.L(50.0f);
                    }
                    if (this.Lb) {
                        f4 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f4 = 0.0f;
                    }
                    if (this.Lb) {
                        f5 = hl.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (dc2Var.l2) {
                        boolean z3 = this.Lb;
                        float f7 = dc2Var.L1;
                        if (!z3) {
                            f7 = 1.0f - f7;
                        }
                        f4 = (1.0f - getVideoTranscriptionProgress()) * f7 * L;
                        boolean z4 = this.Lb;
                        float f8 = dc2Var.L1;
                        if (!z4) {
                            f8 = 1.0f - f8;
                        }
                        f5 = (1.0f - getVideoTranscriptionProgress()) * f8 * hl.L(28.0f);
                    }
                    this.d9 -= f4;
                    this.e9 -= f5;
                    if (v2()) {
                        float compactRight = getCompactRight() - hl.L(32.0f);
                        this.d9 = hl.R1(Math.min(this.U0.w() + hl.L(8.0f), compactRight), Math.min(this.d9 + f4, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.S8 = true;
                if (this.R8 == 3) {
                    if (!this.y || r47.Q4(this.Q5.k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!wma.f0) {
                    float f9 = this.d9;
                    float f10 = this.e9;
                    float L6 = hl.L(32.0f) + f9;
                    float f11 = this.e9;
                    if (this.T8 == 5) {
                        f = 64.0f;
                    } else {
                        f = 32.0f;
                    }
                    RectF rectF = this.c4;
                    rectF.set(f9, f10, L6, f11 + hl.L(f));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.S8 = false;
                        return;
                    }
                    int i2 = (int) ((1.0f - this.E.e) * 255.0f);
                    if (i2 != 255) {
                        float f12 = this.d9;
                        f2 = 32.0f;
                        z2 = false;
                        i = canvas.saveLayerAlpha(f12, this.e9, hl.L(32.0f) + f12, this.e9 + hl.L(64.0f), i2);
                    } else {
                        f2 = 32.0f;
                        z2 = false;
                        i = -1;
                    }
                    C();
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
                            float L7 = hl.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z5 ? 1 : 0] = L7;
                        } else {
                            f3 = 2.0f;
                        }
                        if (this.c9 == null) {
                            this.c9 = r3;
                            float L8 = hl.L(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, L8, L8, L8, L8};
                        }
                        RectF rectF2 = hl.P;
                        float f13 = this.d9;
                        rectF2.set(f13, this.e9, hl.L(f2) + f13, this.e9 + hl.L(f2));
                        Path path3 = this.Z8;
                        float[] fArr3 = this.b9;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.d9, this.e9 + hl.L(f2), this.d9 + hl.L(f2), this.e9 + hl.L(64.0f));
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
                        float L9 = hl.L(16.0f);
                        float L10 = hl.L(16.0f);
                        if (this.U8) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, L9, L10, c2(str));
                    }
                    if (i2()) {
                        canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.h2);
                    }
                    byte b2 = this.R8;
                    if (b2 == 2) {
                        Drawable b22 = b2("drawableGoIcon");
                        jf0.w(b22, (this.d9 + hl.L(16.0f)) - (b22.getIntrinsicWidth() / f3), (this.e9 + hl.L(16.0f)) - (b22.getIntrinsicHeight() / f3));
                        b22.draw(canvas);
                    } else {
                        float f14 = this.d9;
                        if (b2 == 4) {
                            int L11 = (int) (f14 + hl.L(16.0f));
                            int L12 = (int) (this.e9 + hl.L(16.0f));
                            Drawable b23 = b2("drawableCloseIcon");
                            int intrinsicWidth = b23.getIntrinsicWidth() / 2;
                            int intrinsicHeight = b23.getIntrinsicHeight() / 2;
                            b23.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                            jf0.w(b23, this.d9 + hl.L(4.0f), this.e9 + hl.L(4.0f));
                            canvas.save();
                            canvas.scale(0.65f, 0.65f, b23.getBounds().centerX(), b23.getBounds().centerY());
                            b23.draw(canvas);
                            canvas.restore();
                            if (this.T8 == 5) {
                                Drawable b24 = b2("drawableMoreIcon");
                                int intrinsicWidth2 = b24.getIntrinsicWidth() / 2;
                                int intrinsicHeight2 = b24.getIntrinsicHeight() / 2;
                                b24.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                                jf0.w(b24, this.d9 + hl.L(4.0f), this.e9 + hl.L(34.0f));
                                b24.draw(canvas);
                            }
                        } else {
                            int L13 = (int) (f14 + hl.L(16.0f));
                            int L14 = (int) (this.e9 + hl.L(16.0f));
                            Drawable b25 = b2("drawableShareIcon");
                            int intrinsicWidth3 = b25.getIntrinsicWidth() / 2;
                            int intrinsicHeight3 = b25.getIntrinsicHeight() / 2;
                            b25.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                            jf0.w(b25, this.d9 + hl.L(4.0f), this.e9 + hl.L(4.0f));
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
        r47 r47Var;
        int i;
        if (v2() && !this.F && (i = (r47Var = this.Q5).D) != 16 && i != 27 && !r47Var.g3() && !this.Q5.q4()) {
            r47 r47Var2 = this.Q5;
            if (r47Var2.G != null || r47Var2.Z0() != 0 || this.Q5.k.post) {
                j47 j47Var = this.M;
                if (j47Var == null || (j47Var.l & 4) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void x3(float f, float f2, float f3, float f4) {
        nl nlVar = this.U0;
        nlVar.i0(f, f2, f3, f4);
        byte b = this.M1;
        if (b != 4 && b != 2) {
            return;
        }
        this.M3 = (int) (nlVar.L0 + hl.L(8.0f));
        int L = (int) (nlVar.M0 + hl.L(8.0f));
        this.N3 = L;
        int i = this.M3;
        int L2 = hl.L(24.0f) + this.N3;
        this.R0.p(i, L, hl.L(24.0f) + i, L2);
        this.K3 = (int) bp1.z(nlVar.N0, hl.L(48.0f), 2.0f, f);
        int z = (int) bp1.z(nlVar.O0, hl.L(48.0f), 2.0f, nlVar.M0);
        this.L3 = z;
        int i2 = this.K3;
        int i3 = this.L3;
        this.Q0.p(i2, z, hl.L(48.0f) + i2, hl.L(48.0f) + i3);
    }

    public final boolean y() {
        if (this.Q5.t2() && !this.Q5.O0 && this.Y9 == 0.0f && this.V0.n() != null) {
            return false;
        }
        return true;
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
            this.D2 = hl.L(33.0f);
            CharSequence charSequence = this.z2;
            if (charSequence == null) {
                byte b = this.y2;
                if (b == 12) {
                    charSequence = ob6.M0(2131747535, null);
                } else if (b == 1) {
                    charSequence = ob6.M0(2131747539, null);
                } else if (b == 29) {
                    charSequence = ob6.M0(2131747536, null);
                } else if (b == 13) {
                    charSequence = ob6.M0(2131745329, null).toUpperCase();
                } else if (b == 32) {
                    charSequence = ob6.M0(2131747513, null).toUpperCase();
                } else if (b == 85) {
                    charSequence = ob6.M0(2131747543, null);
                } else if (b == 10) {
                    charSequence = ob6.M0(2131747540, null);
                } else if (b == 2) {
                    charSequence = ob6.M0(2131747527, null);
                } else if (b == 3) {
                    charSequence = ob6.M0(2131747514, null);
                } else if (b == 5) {
                    charSequence = ob6.M0(2131743208, null);
                } else if (b == 6) {
                    charSequence = ob6.M0(2131747541, null);
                } else if (b == 7) {
                    charSequence = ob6.M0(2131747511, null);
                } else if (b != 9 && b != 11) {
                    if (b == 25) {
                        charSequence = ob6.M0(2131743019, null);
                    } else if (b == 14) {
                        charSequence = ob6.M0(2131743210, null).toUpperCase();
                    } else if (b == 15) {
                        charSequence = ob6.M0(2131752899, null).toUpperCase();
                    } else if (b == 16) {
                        charSequence = ob6.M0(2131747516, null).toUpperCase();
                    } else if (b == 17) {
                        charSequence = ob6.M0(2131743193, null).toUpperCase();
                    } else if (b != 18 && b != 22) {
                        if (b == 19) {
                            charSequence = ob6.M0(2131753339, null);
                        } else if (b == 20) {
                            charSequence = ob6.M0(2131747531, null);
                        } else if (b == 21) {
                            charSequence = ob6.M0(2131754223, null);
                        } else if (b == 23) {
                            charSequence = ob6.M0(2131747512, null);
                        } else if (b == 24) {
                            charSequence = ob6.M0(2131747534, null);
                        } else if (b == 26) {
                            TL_stars.StarGift starGift = this.Hd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.a6).getCurrentTime()) {
                                    charSequence = ob6.M0(2131747528, null);
                                    z = false;
                                } else {
                                    if (this.Hd.sold_out) {
                                        charSequence = ob6.M0(2131747529, null);
                                    } else {
                                        charSequence = ob6.M0(2131747530, null);
                                    }
                                    z = true;
                                }
                                if (z) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new wm2(2131231119, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = ob6.M0(2131747510, null);
                            }
                        } else if (b == 27) {
                            charSequence = ob6.M0(2131748834, null).toUpperCase();
                        } else if (b == 28) {
                            charSequence = ob6.M0(2131743209, null);
                        } else {
                            charSequence = ob6.M0(2131748947, null);
                        }
                    } else {
                        charSequence = ob6.M0(2131753609, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) r47.n1(this.Q5.k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = ob6.M0(2131743018, null);
                    } else {
                        charSequence = ob6.M0(2131743019, null);
                    }
                }
            }
            if (this.Q5.q4() && this.b7 < (measureText = (int) (aob.M2.measureText(charSequence, 0, charSequence.length()) + hl.L(75.0f)))) {
                this.b7 = measureText;
            }
            int L = this.b7 - hl.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, aob.M2, L, TextUtils.TruncateAt.END), aob.M2, hl.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            this.D2 = i2 - hl.L(f2);
            int L2 = hl.L(46.0f) + this.v0;
            this.v0 = L2;
            if (this.Q5.D == 12) {
                this.v0 = hl.L(14.0f) + L2;
            }
            if (this.Q5.q4()) {
                this.v0 = hl.L(2.0f) + this.v0;
            }
            StaticLayout staticLayout2 = this.r2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.D2 - Math.ceil(this.r2.getLineWidth(0)))) / 2;
                if (this.y2 == 0) {
                    i = hl.L(8.0f);
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
        this.gd.setColor(aob.p1(f * 0.2f, i));
        this.gd.setPathEffect(f66.c());
        canvas.drawPath(path, this.gd);
        canvas.restore();
    }

    public final boolean y2() {
        if (this.Q5 != null && this.L == null && !this.B5 && x2() && H2()) {
            return true;
        }
        return false;
    }

    public final void y3(defpackage.r47 r116, defpackage.m47 r117, boolean r118, boolean r119, boolean r120, boolean r121) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.y3(r47, m47, boolean, boolean, boolean, boolean):void");
    }

    public final void z0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.z0(long, long):void");
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
        r47 r47Var;
        boolean z8 = (f4 == 1.0f || z6) ? false : true;
        float f9 = (f4 * 0.5f) + 0.5f;
        float f10 = z8 ? f * f4 : f;
        if (this.M1 != 7 || ((r47Var = this.Q5) != null && r47Var.f4())) {
            photoBottom = getPhotoBottom() + this.w0;
        } else {
            photoBottom = f3 - ((1.0f - getVideoTranscriptionProgress()) * (this.O.i(this.ub.L1) + hl.L(this.K ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - hl.L(8.5f);
        r47 r47Var2 = this.Q5;
        float L4 = (r47Var2 == null || !r47Var2.M2()) ? 0.0f : hl.L(-6.0f);
        float f11 = 22.0f;
        if (z3) {
            gi7 gi7Var = aob.E3;
            if (I3()) {
                if (this.Q5.O5()) {
                    f5 = 1.0f;
                    v0 = aob.v0(aob.Zc, this.cc);
                    int i2 = this.d7;
                    f8 = z5 ? 24.0f : 22.0f;
                    gi7Var.getClass();
                    f7 = 4.0f;
                    jf0.w(gi7Var, ((i2 - hl.L(f8)) - hl.L(12.0f)) + L4, (L3 - hl.L(12.0f)) + f2);
                    gi7Var.setAlpha((int) (this.k4 * 255.0f * f10));
                } else {
                    f5 = 1.0f;
                    f7 = 4.0f;
                    v0 = aob.v0(aob.kd, this.cc);
                    int i3 = this.d7;
                    f8 = z5 ? 24.0f : 22.0f;
                    gi7Var.getClass();
                    jf0.w(gi7Var, ((i3 - hl.L(f8)) - hl.L(12.0f)) + L4, (L3 - hl.L(12.0f)) + f2);
                    gi7Var.setAlpha((int) (f10 * 255.0f));
                }
                f6 = 18.5f;
            } else {
                f5 = 1.0f;
                f7 = 4.0f;
                v0 = aob.v0(aob.Eb, this.cc);
                gi7Var.getClass();
                f6 = 18.5f;
                jf0.w(gi7Var, (this.d7 - hl.L(18.5f)) - hl.L(12.0f), ((f3 - hl.L(8.5f)) - hl.L(12.0f)) + f2);
                gi7Var.setAlpha((int) (f10 * 255.0f));
            }
            gi7Var.a(v0);
            if (z8) {
                canvas.save();
                canvas.scale(f9, f9, gi7Var.getBounds().centerX(), gi7Var.getBounds().centerY());
            }
            gi7Var.draw(canvas);
            gi7Var.setAlpha(255);
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
                            canvas.translate(hl.L(4.8f) * (f5 - f4), 0.0f);
                        }
                        jf0.w(drawable, ((this.d7 - hl.L(z5 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f2);
                    } else {
                        jf0.w(drawable, ((this.d7 - hl.L(z5 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f2);
                    }
                    drawable.setAlpha((int) (this.k4 * 255.0f * f10));
                } else {
                    if (z) {
                        if (z6) {
                            canvas.translate((f5 - f4) * hl.L(4.8f), 0.0f);
                        }
                        jf0.w(aob.F3, (this.d7 - hl.L(z5 ? 28.3f : 26.3f)) - aob.F3.getIntrinsicWidth(), (L3 - aob.F3.getIntrinsicHeight()) + f2);
                    } else {
                        jf0.w(aob.F3, (this.d7 - hl.L(z5 ? 23.5f : 21.5f)) - aob.F3.getIntrinsicWidth(), (L3 - aob.F3.getIntrinsicHeight()) + f2);
                    }
                    aob.F3.setAlpha((int) (this.k4 * 255.0f * f10));
                    drawable = aob.F3;
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
                        canvas.translate((f5 - f4) * hl.L(f7), 0.0f);
                    }
                    b2 = b2(z7 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    jf0.w(b2, ((this.d7 - hl.L(22.5f)) - b2.getIntrinsicWidth()) + L4, ((f3 - hl.L((this.G || this.F) ? 9.0f : 8.0f)) - b2.getIntrinsicHeight()) + f2);
                } else {
                    b2 = b2(z7 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    jf0.w(b2, ((this.d7 - hl.L(f6)) - b2.getIntrinsicWidth()) + L4, ((f3 - hl.L((this.G || this.F) ? 9.0f : 8.0f)) - b2.getIntrinsicHeight()) + f2);
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
                Drawable b22 = this.Q5.O5() ? b2("drawableMsgStickerHalfCheck") : aob.G3;
                jf0.w(b22, ((this.d7 - hl.L(z5 ? 23.5f : 21.5f)) - b22.getIntrinsicWidth()) + L4, (L3 - b22.getIntrinsicHeight()) + f2);
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
                jf0.w(b23, (this.d7 - hl.L(18.0f)) - b23.getIntrinsicWidth(), ((f3 - hl.L((this.G || this.F) ? 9.0f : 8.0f)) - b23.getIntrinsicHeight()) + f2);
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
                L = i4 - hl.L(34.5f);
                L2 = hl.L(26.5f);
            } else {
                L = i4 - hl.L(32.0f);
                if (!this.G && !this.F) {
                    f11 = 21.0f;
                }
                L2 = hl.L(f11);
            }
            float f12 = (f3 - L2) + f2;
            RectF rectF = this.c4;
            rectF.set((int) (L + L4), f12, hl.L(14.0f) + i, hl.L(14.0f) + f12);
            int alpha = aob.b2.getAlpha();
            aob.b2.setAlpha((int) (alpha * f10));
            canvas.drawRoundRect(rectF, hl.L(f5), hl.L(f5), aob.b2);
            aob.b2.setAlpha(alpha);
            jf0.w(aob.j4, hl.L(6.0f) + i, f12 + hl.L(2.0f));
            aob.j4.setAlpha((int) (f10 * 255.0f));
            if (z8) {
                canvas.save();
                canvas.scale(f9, f9, aob.j4.getBounds().centerX(), aob.j4.getBounds().centerY());
            }
            aob.j4.draw(canvas);
            aob.j4.setAlpha(255);
            if (z8) {
                canvas.restore();
            }
        }
    }

    public final boolean z2(r47 r47Var) {
        int i = r47.n1(this.Q5.k).period;
        int currentTime = ConnectionsManager.getInstance(this.a6).getCurrentTime();
        if (i == Integer.MAX_VALUE) {
            return false;
        }
        if (i % 60 == 0) {
            if (Math.abs(currentTime - r47Var.k.date) <= i) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - r47Var.k.date) <= i - 5) {
            return false;
        } else {
            return true;
        }
    }

    public void z3(r47 r47Var, m47 m47Var, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.O0) {
            y3(r47Var, m47Var, z, z2, z3, z4);
            return;
        }
        this.R5 = r47Var;
        this.S5 = m47Var;
        this.U5 = z;
        this.T5 = z2;
        this.V5 = z3;
        this.W5 = z4;
    }

    @Override
    public final void v0(float f, int i) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        rb2 rb2Var;
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
            if (!this.ic || (rb2Var = this.eb) == null) {
                return;
            }
            rb2Var.d();
        }
    }

    public void setBackgroundTopY(int i) {
        int i2;
        int i3;
        t37 t37Var = this.L6;
        int i4 = this.L0;
        int i5 = this.M0;
        if (i5 == 0) {
            i4 = getParentWidth();
            i5 = hl.q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i3 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                float f = this.N0;
                t37Var.p((int) (i + f), i3, i2, (int) f, this.pb, this.qb, this.F, (this.G && this.ub.A0 == 1.0f) ? false : true);
                t37Var.u = j2();
            }
        }
        i2 = i5;
        i3 = i4;
        float f2 = this.N0;
        t37Var.p((int) (i + f2), i3, i2, (int) f2, this.pb, this.qb, this.F, (this.G && this.ub.A0 == 1.0f) ? false : true);
        t37Var.u = j2();
    }

    public wb2(Context context, int i) {
        this(context, i, false, null, null);
    }
}
