package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
public abstract class bkb {
    public static int A;
    public static TextPaint[] A0;
    public static boolean A1;
    public static TextPaint A2;
    public static Drawable A3;
    public static Drawable A4;
    public static final int A5;
    public static final int A6;
    public static final int A7;
    public static final int A8;
    public static final int A9;
    public static final int Aa;
    public static final int Ab;
    public static final int Ac;
    public static final int Ad;
    public static final int Ae;
    public static final int Af;
    public static final int Ag;
    public static final int Ah;
    public static final int Ai;
    public static final int Aj;
    public static final int Ak;
    public static final int Al;
    public static Bitmap Am;
    public static int B;
    public static TextPaint[] B0;
    public static boolean B1;
    public static TextPaint B2;
    public static Drawable B3;
    public static Drawable B4;
    public static final int B5;
    public static final int B6;
    public static final int B7;
    public static final int B8;
    public static final int B9;
    public static final int Ba;
    public static final int Bb;
    public static final int Bc;
    public static final int Bd;
    public static final int Be;
    public static final int Bf;
    public static final int Bg;
    public static final int Bh;
    public static final int Bi;
    public static final int Bj;
    public static final int Bk;
    public static final int Bl;
    public static int[] Bm;
    public static TextPaint C0;
    public static int C1;
    public static TextPaint C2;
    public static Drawable C3;
    public static Drawable C4;
    public static final int C5;
    public static final int C6;
    public static final int C7;
    public static final int C8;
    public static final int C9;
    public static final int Ca;
    public static final int Cb;
    public static final int Cc;
    public static final int Cd;
    public static final int Ce;
    public static final int Cf;
    public static final int Cg;
    public static final int Ch;
    public static final int Ci;
    public static final int Cj;
    public static final int Ck;
    public static final int Cl;
    public static final HashSet Cm;
    public static TextPaint D0;
    public static int D1;
    public static TextPaint D2;
    public static xf7 D3;
    public static Drawable D4;
    public static final int D5;
    public static final int D6;
    public static final int D7;
    public static final int D8;
    public static final int D9;
    public static final int Da;
    public static final int Db;
    public static final int Dc;
    public static final int Dd;
    public static final int De;
    public static final int Df;
    public static final int Dg;
    public static final int Dh;
    public static final int Di;
    public static final int Dj;
    public static final int Dk;
    public static final int Dl;
    public static int Dm;
    public static TextPaint[] E0;
    public static long E1;
    public static TextPaint E2;
    public static Drawable E3;
    public static Drawable E4;
    public static final int E5;
    public static final int E6;
    public static final int E7;
    public static final int E8;
    public static final int E9;
    public static final int Ea;
    public static final int Eb;
    public static final int Ec;
    public static final int Ed;
    public static final int Ee;
    public static final int Ef;
    public static final int Eg;
    public static final int Eh;
    public static final int Ei;
    public static final int Ej;
    public static final int Ek;
    public static final int El;
    public static final Paint Em;
    public static final ArrayList F;
    public static TextPaint F0;
    public static boolean F1;
    public static TextPaint F2;
    public static Drawable F3;
    public static final int F5;
    public static final int F6;
    public static final int F7;
    public static final int F8;
    public static final int F9;
    public static final int Fa;
    public static final int Fb;
    public static final int Fc;
    public static final int Fd;
    public static final int Fe;
    public static final int Ff;
    public static final int Fg;
    public static final int Fh;
    public static final int Fi;
    public static final int Fj;
    public static final int Fk;
    public static final int Fl;
    public static final Paint Fm;
    public static final ArrayList G;
    public static TextPaint[] G0;
    public static oy8 G1;
    public static TextPaint G2;
    public static Drawable G3;
    public static final int G5;
    public static final int G6;
    public static final int G7;
    public static final int G8;
    public static final int G9;
    public static final int Ga;
    public static final int Gb;
    public static final int Gc;
    public static final int Gd;
    public static final int Ge;
    public static final int Gf;
    public static final int Gg;
    public static final int Gh;
    public static final int Gi;
    public static final int Gj;
    public static final int Gk;
    public static final int Gl;
    public static final Paint Gm;
    public static final HashMap H;
    public static TextPaint H0;
    public static oy8 H1;
    public static TextPaint H2;
    public static Drawable H3;
    public static final int H5;
    public static final int H6;
    public static final int H7;
    public static final int H8;
    public static final int H9;
    public static final int Ha;
    public static final int Hb;
    public static final int Hc;
    public static final int Hd;
    public static final int He;
    public static final int Hf;
    public static final int Hg;
    public static final int Hh;
    public static final int Hi;
    public static final int Hj;
    public static final int Hk;
    public static final int Hl;
    public static final Paint Hm;
    public static akb I;
    public static TextPaint I0;
    public static oy8 I1;
    public static TextPaint I2;
    public static Drawable I3;
    public static final int I5;
    public static final int I6;
    public static final int I7;
    public static final int I8;
    public static final int I9;
    public static final int Ia;
    public static final int Ib;
    public static final int Ic;
    public static final int Id;
    public static final int Ie;
    public static final int If;
    public static final int Ig;
    public static final int Ih;
    public static final int Ii;
    public static final int Ij;
    public static final int Ik;
    public static final int Il;
    public static final Paint Im;
    public static akb J;
    public static TextPaint J0;
    public static oy8 J1;
    public static TextPaint J2;
    public static Drawable J3;
    public static final int J5;
    public static final int J6;
    public static final int J7;
    public static final int J8;
    public static final int J9;
    public static final int Ja;
    public static final int Jb;
    public static final int Jc;
    public static final int Jd;
    public static final int Je;
    public static final int Jf;
    public static final int Jg;
    public static final int Jh;
    public static final int Ji;
    public static final int Jj;
    public static final int Jk;
    public static final int Jl;
    public static final Paint Jm;
    public static akb K;
    public static TextPaint K0;
    public static oy8 K1;
    public static TextPaint K2;
    public static Drawable K3;
    public static final int K5;
    public static final int K6;
    public static final int K7;
    public static final int K8;
    public static final int K9;
    public static final int Ka;
    public static final int Kb;
    public static final int Kc;
    public static final int Kd;
    public static final int Ke;
    public static final int Kf;
    public static final int Kg;
    public static final int Kh;
    public static final int Ki;
    public static final int Kj;
    public static final int Kk;
    public static final int Kl;
    public static final akb L;
    public static TextPaint L0;
    public static oy8 L1;
    public static TextPaint L2;
    public static Drawable L3;
    public static final int L5;
    public static final int L6;
    public static final int L7;
    public static final int L8;
    public static final int L9;
    public static final int La;
    public static final int Lb;
    public static final int Lc;
    public static final int Ld;
    public static final int Le;
    public static final int Lf;
    public static final int Lg;
    public static final int Lh;
    public static final int Li;
    public static final int Lj;
    public static final int Lk;
    public static final int Ll;
    public static akb M;
    public static TextPaint M0;
    public static oy8 M1;
    public static TextPaint M2;
    public static Drawable M3;
    public static final int M5;
    public static final int M6;
    public static final int M7;
    public static final int M8;
    public static final int M9;
    public static final int Ma;
    public static final int Mb;
    public static final int Mc;
    public static final int Md;
    public static final int Me;
    public static final int Mf;
    public static final int Mg;
    public static final int Mh;
    public static final int Mi;
    public static final int Mj;
    public static final int Mk;
    public static final int Ml;
    public static boolean N;
    public static TextPaint N0;
    public static oy8 N1;
    public static TextPaint N2;
    public static Drawable N3;
    public static Drawable N4;
    public static final int N5;
    public static final int N6;
    public static final int N7;
    public static final int N8;
    public static final int N9;
    public static final int Na;
    public static final int Nb;
    public static final int Nc;
    public static final int Nd;
    public static final int Ne;
    public static final int Nf;
    public static final int Ng;
    public static final int Nh;
    public static final int Ni;
    public static final int Nj;
    public static final int Nk;
    public static final int Nl;
    public static boolean O;
    public static TextPaint O0;
    public static TextPaint O1;
    public static TextPaint O2;
    public static Drawable O3;
    public static Drawable O4;
    public static final int O5;
    public static final int O6;
    public static final int O7;
    public static final int O8;
    public static final int O9;
    public static final int Oa;
    public static final int Ob;
    public static final int Oc;
    public static final int Od;
    public static final int Oe;
    public static final int Of;
    public static final int Og;
    public static final int Oh;
    public static final int Oi;
    public static final int Oj;
    public static final int Ok;
    public static final int Ol;
    public static boolean P;
    public static TextPaint P0;
    public static Drawable P1;
    public static TextPaint P2;
    public static Drawable P3;
    public static Drawable P4;
    public static final int P5;
    public static final int P6;
    public static final int P7;
    public static final int P8;
    public static final int P9;
    public static final int Pa;
    public static final int Pb;
    public static final int Pc;
    public static final int Pd;
    public static final int Pe;
    public static final int Pf;
    public static final int Pg;
    public static final int Ph;
    public static final int Pi;
    public static final int Pj;
    public static final int Pk;
    public static final int Pl;
    public static boolean Q;
    public static TextPaint Q0;
    public static Drawable Q1;
    public static TextPaint Q2;
    public static Drawable Q3;
    public static Drawable Q4;
    public static final int Q5;
    public static final int Q6;
    public static final int Q7;
    public static final int Q8;
    public static final int Q9;
    public static final int Qa;
    public static final int Qb;
    public static final int Qc;
    public static final int Qd;
    public static final int Qe;
    public static final int Qf;
    public static final int Qg;
    public static final int Qh;
    public static final int Qi;
    public static final int Qj;
    public static final int Qk;
    public static final int Ql;
    public static boolean R;
    public static Drawable R0;
    public static Paint R1;
    public static TextPaint R2;
    public static Drawable R3;
    public static final int R5;
    public static final int R6;
    public static final int R7;
    public static final int R8;
    public static final int R9;
    public static final int Ra;
    public static final int Rb;
    public static final int Rc;
    public static final int Rd;
    public static final int Re;
    public static final int Rf;
    public static final int Rg;
    public static final int Rh;
    public static final int Ri;
    public static final int Rj;
    public static final int Rk;
    public static final int Rl;
    public static int S;
    public static Drawable S0;
    public static Paint S1;
    public static TextPaint S2;
    public static Drawable S3;
    public static final int S5;
    public static final int S6;
    public static final int S7;
    public static final int S8;
    public static final int S9;
    public static final int Sa;
    public static final int Sb;
    public static final int Sc;
    public static final int Sd;
    public static final int Se;
    public static final int Sf;
    public static final int Sg;
    public static final int Sh;
    public static final int Si;
    public static final int Sj;
    public static final int Sk;
    public static final int Sl;
    public static int T;
    public static Drawable T0;
    public static Paint T1;
    public static TextPaint T2;
    public static Drawable T3;
    public static final int T5;
    public static final int T6;
    public static final int T7;
    public static final int T8;
    public static final int T9;
    public static final int Ta;
    public static final int Tb;
    public static final int Tc;
    public static final int Td;
    public static final int Te;
    public static final int Tf;
    public static final int Tg;
    public static final int Th;
    public static final int Ti;
    public static final int Tj;
    public static final int Tk;
    public static final int Tl;
    public static long U;
    public static Drawable U0;
    public static Paint U1;
    public static TextPaint U2;
    public static Drawable U3;
    public static Drawable U4;
    public static final int U5;
    public static final int U6;
    public static final int U7;
    public static final int U8;
    public static final int U9;
    public static final int Ua;
    public static final int Ub;
    public static final int Uc;
    public static final int Ud;
    public static final int Ue;
    public static final int Uf;
    public static final int Ug;
    public static final int Uh;
    public static final int Ui;
    public static final int Uj;
    public static final int Uk;
    public static final int Ul;
    public static boolean V;
    public static Drawable V0;
    public static Paint V1;
    public static TextPaint V2;
    public static Drawable V3;
    public static Drawable V4;
    public static final int V5;
    public static final int V6;
    public static final int V7;
    public static final int V8;
    public static final int V9;
    public static final int Va;
    public static final int Vb;
    public static final int Vc;
    public static final int Vd;
    public static final int Ve;
    public static final int Vf;
    public static final int Vg;
    public static final int Vh;
    public static final int Vi;
    public static final int Vj;
    public static final int Vk;
    public static final int Vl;
    public static int W;
    public static xf7 W0;
    public static Paint W1;
    public static TextPaint W2;
    public static Drawable W3;
    public static Drawable W4;
    public static final int W5;
    public static final int W6;
    public static final int W7;
    public static final int W8;
    public static final int W9;
    public static final int Wa;
    public static final int Wb;
    public static final int Wc;
    public static final int Wd;
    public static final int We;
    public static final int Wf;
    public static final int Wg;
    public static final int Wh;
    public static final int Wi;
    public static final int Wj;
    public static final int Wk;
    public static final int Wl;
    public static Bitmap X;
    public static Drawable X0;
    public static Paint X1;
    public static TextPaint X2;
    public static Drawable X3;
    public static Drawable X4;
    public static final int X5;
    public static final int X6;
    public static final int X7;
    public static final int X8;
    public static final int X9;
    public static final int Xa;
    public static final int Xb;
    public static final int Xc;
    public static final int Xd;
    public static final int Xe;
    public static final int Xf;
    public static final int Xg;
    public static final int Xh;
    public static final int Xi;
    public static final int Xj;
    public static final int Xk;
    public static final int Xl;
    public static BitmapShader Y;
    public static Drawable Y0;
    public static Paint Y1;
    public static TextPaint Y2;
    public static Drawable Y3;
    public static final int Y5;
    public static final int Y6;
    public static final int Y7;
    public static final int Y8;
    public static final int Y9;
    public static final int Ya;
    public static final int Yb;
    public static final int Yc;
    public static final int Yd;
    public static final int Ye;
    public static final int Yf;
    public static final int Yg;
    public static final int Yh;
    public static final int Yi;
    public static final int Yj;
    public static final int Yk;
    public static final int Yl;
    public static Matrix Z;
    public static Drawable Z0;
    public static Paint Z1;
    public static TextPaint Z2;
    public static Drawable Z3;
    public static final int Z5;
    public static final int Z6;
    public static final int Z7;
    public static final int Z8;
    public static final int Z9;
    public static final int Za;
    public static final int Zb;
    public static final int Zc;
    public static final int Zd;
    public static final int Ze;
    public static final int Zf;
    public static final int Zg;
    public static final int Zh;
    public static final int Zi;
    public static final int Zj;
    public static final int Zk;
    public static final int Zl;
    public static int a0;
    public static Drawable a1;
    public static Paint a2;
    public static TextPaint a3;
    public static Drawable a4;
    public static Drawable a5;
    public static final int a6;
    public static final int a7;
    public static final int a8;
    public static final int a9;
    public static final int aa;
    public static final int ab;
    public static final int ac;
    public static final int ad;
    public static final int ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static boolean b;
    public static int b0;
    public static Drawable b1;
    public static Paint b2;
    public static TextPaint b3;
    public static Drawable b4;
    public static Drawable b5;
    public static final int b6;
    public static final int b7;
    public static final int b8;
    public static final int b9;
    public static final int ba;
    public static final int bb;
    public static final int bc;
    public static final int bd;
    public static final int be;
    public static final int bf;
    public static final int bg;
    public static final int bh;
    public static final int bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final int bm;
    public static int c0;
    public static Drawable c1;
    public static Paint c2;
    public static TextPaint c3;
    public static Drawable c4;
    public static n40 c5;
    public static final int c6;
    public static final int c7;
    public static final int c8;
    public static final int c9;
    public static final int ca;
    public static final int cb;
    public static final int cc;
    public static final int cd;
    public static final int ce;
    public static final int cf;
    public static final int cg;
    public static final int ch;
    public static final int ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static final HashMap cm;
    public static fp6 d;
    public static Drawable d0;
    public static Drawable d1;
    public static Paint d2;
    public static TextPaint d3;
    public static Drawable d4;
    public static HashMap d5;
    public static final int d6;
    public static final int d7;
    public static final int d8;
    public static final int d9;
    public static final int da;
    public static final int db;
    public static final int dc;
    public static final int dd;
    public static final int de;
    public static final int df;
    public static final int dg;
    public static final int dh;
    public static final int di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static final HashMap dm;
    public static SensorManager e;
    public static Drawable e0;
    public static Drawable e1;
    public static Paint e2;
    public static TextPaint e3;
    public static Drawable e4;
    public static final int e5;
    public static final int e6;
    public static final int e7;
    public static final int e8;
    public static final int e9;
    public static final int ea;
    public static final int eb;
    public static final int ec;
    public static final int ed;
    public static final int ee;
    public static final int ef;
    public static final int eg;
    public static final int eh;
    public static final int ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static final HashMap em;
    public static Sensor f;
    public static int f0;
    public static gq9 f1;
    public static Paint f2;
    public static TextPaint f3;
    public static Drawable f4;
    public static final int f5;
    public static final int f6;
    public static final int f7;
    public static final int f8;
    public static final int f9;
    public static final int fa;
    public static final int fb;
    public static final int fc;
    public static final int fd;
    public static final int fe;
    public static final int ff;
    public static final int fg;
    public static final int fh;
    public static final int fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static final HashMap fm;
    public static boolean g;
    public static String g0;
    public static gq9 g1;
    public static Paint g2;
    public static Drawable g3;
    public static Drawable g4;
    public static final int g5;
    public static final int g6;
    public static final int g7;
    public static final int g8;
    public static final int g9;
    public static final int ga;
    public static final int gb;
    public static final int gc;
    public static final int gd;
    public static final int ge;
    public static final int gf;
    public static final int gg;
    public static final int gh;
    public static final int gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static final int[] gm;
    public static boolean h0;
    public static Drawable h1;
    public static Paint h2;
    public static Drawable h3;
    public static Drawable h4;
    public static final int h5;
    public static final int h6;
    public static final int h7;
    public static final int h8;
    public static final int h9;
    public static final int ha;
    public static final int hb;
    public static final int hc;
    public static final int hd;
    public static final int he;
    public static final int hf;
    public static final int hg;
    public static final int hh;
    public static final int hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static final SparseIntArray hm;
    public static long i;
    public static boolean i0;
    public static Drawable i1;
    public static Paint i2;
    public static Drawable i3;
    public static Drawable i4;
    public static final int i5;
    public static final int i6;
    public static final int i7;
    public static final int i8;
    public static final int i9;
    public static final int ia;
    public static final int ib;
    public static final int ic;
    public static final int id;
    public static final int ie;
    public static final int ig;
    public static final int ih;
    public static final int ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static final HashSet im;
    public static boolean j;
    public static Paint j0;
    public static Drawable j1;
    public static Paint j2;
    public static wl9 j3;
    public static Drawable j4;
    public static final int j5;
    public static final int j6;
    public static final int j7;
    public static final int j8;
    public static final int j9;
    public static final int ja;
    public static final int jb;
    public static final int jc;
    public static final int jd;
    public static final int je;
    public static final int jf;
    public static final int jg;
    public static final int jh;
    public static final int ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static SparseIntArray jm;
    public static boolean k;
    public static Paint k0;
    public static Drawable k1;
    public static Paint k2;
    public static Drawable k3;
    public static Drawable k4;
    public static final int k5;
    public static final int k6;
    public static final int k7;
    public static final int k8;
    public static final int k9;
    public static final int ka;
    public static final int kb;
    public static final int kc;
    public static final int kd;
    public static final int ke;
    public static final int kf;
    public static final int kg;
    public static final int kh;
    public static final int ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static SparseIntArray km;
    public static Paint l0;
    public static Drawable l1;
    public static Paint l2;
    public static m17 l3;
    public static Drawable l4;
    public static final int l5;
    public static final int l6;
    public static final int l7;
    public static final int l8;
    public static final int l9;
    public static final int la;
    public static final int lb;
    public static final int lc;
    public static final int ld;
    public static final int le;
    public static final int lf;
    public static final int lg;
    public static final int lh;
    public static final int li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static SparseIntArray lm;
    public static Paint m0;
    public static Drawable m1;
    public static Paint m2;
    public static m17 m3;
    public static Drawable m4;
    public static final int m5;
    public static final int m6;
    public static final int m7;
    public static final int m8;
    public static final int m9;
    public static final int ma;
    public static final int mb;
    public static final int mc;
    public static final int md;
    public static final int me;
    public static final int mf;
    public static final int mg;
    public static final int mh;
    public static final int mi;
    public static final int mj;
    public static final int mk;
    public static final int ml;
    public static boolean mm;
    public static Paint n0;
    public static Drawable n1;
    public static TextPaint n2;
    public static m17 n3;
    public static Drawable n4;
    public static final int n5;
    public static final int n6;
    public static final int n7;
    public static final int n8;
    public static final int n9;
    public static final int na;
    public static final int nb;
    public static final int nc;
    public static final int nd;
    public static final int ne;
    public static final int nf;
    public static final int ng;
    public static final int nh;
    public static final int ni;
    public static final int nj;
    public static final int nk;
    public static final int nl;
    public static final ThreadLocal nm;
    public static int o;
    public static Paint o0;
    public static Drawable o1;
    public static TextPaint o2;
    public static m17 o3;
    public static Drawable o4;
    public static final int o5;
    public static final int o6;
    public static final int o7;
    public static final int[] o8;
    public static final int o9;
    public static final int oa;
    public static final int ob;
    public static final int oc;
    public static final int od;
    public static final int oe;
    public static final int of;
    public static final int og;
    public static final int oh;
    public static final int oi;
    public static final int oj;
    public static final int ok;
    public static final int ol;
    public static final ThreadLocal om;
    public static boolean p;
    public static Paint p0;
    public static Drawable p1;
    public static TextPaint p2;
    public static m17 p3;
    public static Drawable p4;
    public static final int p5;
    public static final int p6;
    public static final int p7;
    public static final int[] p8;
    public static final int p9;
    public static final int pa;
    public static final int pb;
    public static final int pc;
    public static final int pd;
    public static final int pe;
    public static final int pf;
    public static final int pg;
    public static final int ph;
    public static final int pi;
    public static final int pj;
    public static final int pk;
    public static final int pl;
    public static final ThreadLocal pm;
    public static float q;
    public static Drawable q1;
    public static TextPaint q2;
    public static m17 q3;
    public static Drawable q4;
    public static final int q5;
    public static final int q6;
    public static final int q7;
    public static final int[] q8;
    public static final int q9;
    public static final int qa;
    public static final int qb;
    public static final int qc;
    public static final int qd;
    public static final int qe;
    public static final int qf;
    public static final int qg;
    public static final int qh;
    public static final int qi;
    public static final int qj;
    public static final int qk;
    public static final int ql;
    public static final ThreadLocal qm;
    public static int r;
    public static Drawable r0;
    public static Drawable r1;
    public static TextPaint r2;
    public static m17 r3;
    public static Drawable r4;
    public static final int r5;
    public static final int r6;
    public static final int r7;
    public static final int r8;
    public static final int r9;
    public static final int ra;
    public static final int rb;
    public static final int rc;
    public static final int rd;
    public static final int re;
    public static final int rf;
    public static final int rg;
    public static final int rh;
    public static final int ri;
    public static final int rj;
    public static final int[] rk;
    public static final int rl;
    public static final ThreadLocal rm;
    public static int s;
    public static Paint s0;
    public static Drawable s1;
    public static TextPaint s2;
    public static m17 s3;
    public static Drawable s4;
    public static final int s5;
    public static final int s6;
    public static final int s7;
    public static final int s8;
    public static final int s9;
    public static final int sa;
    public static final int sb;
    public static final int sc;
    public static final int sd;
    public static final int se;
    public static final int sf;
    public static final int sg;
    public static final int sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static final int sl;
    public static tn4 sm;
    public static int t;
    public static Paint t0;
    public static oy8 t1;
    public static TextPaint t2;
    public static Drawable t4;
    public static final int t5;
    public static final int t6;
    public static final int t7;
    public static final int t8;
    public static final int t9;
    public static final int ta;
    public static final int tb;
    public static final int tc;
    public static final int td;
    public static final int te;
    public static final int tf;
    public static final int tg;
    public static final int th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static final int tl;
    public static vk9 tm;
    public static int u;
    public static Paint u0;
    public static oy8 u1;
    public static TextPaint u2;
    public static PorterDuffColorFilter u3;
    public static Drawable u4;
    public static final int u5;
    public static final int u6;
    public static final int u7;
    public static final int u8;
    public static final int u9;
    public static final int ua;
    public static final int ub;
    public static final int uc;
    public static final int ud;
    public static final int ue;
    public static final int uf;
    public static final int ug;
    public static final int uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static final int ul;
    public static Method um;
    public static int v;
    public static Paint v0;
    public static oy8 v1;
    public static TextPaint v2;
    public static PorterDuffColorFilter v3;
    public static Drawable v4;
    public static final int v5;
    public static final int v6;
    public static final int v7;
    public static final int v8;
    public static final int v9;
    public static final int va;
    public static final int vb;
    public static final int vc;
    public static final int vd;
    public static final int ve;
    public static final int vf;
    public static final int vg;
    public static final int vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static final int vl;
    public static int vm;
    public static String w;
    public static Paint w0;
    public static oy8 w1;
    public static TextPaint w2;
    public static jy7 w3;
    public static Drawable w4;
    public static final int w5;
    public static final int w6;
    public static final int w7;
    public static final int w8;
    public static final int w9;
    public static final int wa;
    public static final int wb;
    public static final int wc;
    public static final int wd;
    public static final int we;
    public static final int wf;
    public static final int wg;
    public static final int wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static final int wl;
    public static float[] wm;
    public static double x;
    public static Paint x0;
    public static oy8 x1;
    public static TextPaint[] x2;
    public static Drawable x3;
    public static Drawable x4;
    public static final int x5;
    public static final int x6;
    public static final int x7;
    public static final int x8;
    public static final int x9;
    public static final int xa;
    public static final int xb;
    public static final int xc;
    public static final int xd;
    public static final int xe;
    public static final int xf;
    public static final int xg;
    public static final int xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final int[] xl;
    public static final mjb xm;
    public static double y;
    public static Paint y0;
    public static oy8 y1;
    public static TextPaint y2;
    public static Drawable y3;
    public static Drawable y4;
    public static final int y5;
    public static final int y6;
    public static final int y7;
    public static final int y8;
    public static final int y9;
    public static final int ya;
    public static final int yb;
    public static final int yc;
    public static final int yd;
    public static final int ye;
    public static final int yf;
    public static final int yg;
    public static final int yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final int yl;
    public static final int[] ym;
    public static Paint z0;
    public static boolean z1;
    public static TextPaint z2;
    public static Drawable z3;
    public static Drawable z4;
    public static final int z5;
    public static final int z6;
    public static final int z7;
    public static final int z8;
    public static final int z9;
    public static final int za;
    public static final int zb;
    public static final int zc;
    public static final int zd;
    public static final int ze;
    public static final int zf;
    public static final int zg;
    public static final int zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static final int zl;
    public static WeakReference zm;
    public static final int a = bm2.o(-16777216, 27);
    public static final Object c = new Object();
    public static float h = 1.0f;
    public static final sv l = new sv((byte) 11);
    public static final sv m = new sv((byte) 12);
    public static final byte n = 99;
    public static final Paint z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] q0 = new Drawable[25];
    public static final bya[] t3 = new bya[6];
    public static final Drawable[] F4 = new Drawable[2];
    public static final Drawable[] G4 = new Drawable[2];
    public static final Drawable[] H4 = new Drawable[2];
    public static final Drawable[] I4 = new Drawable[2];
    public static final Drawable[] J4 = new Drawable[2];
    public static final Drawable[] K4 = new Drawable[2];
    public static final Drawable[] L4 = new Drawable[2];
    public static final Drawable[] M4 = new Drawable[2];
    public static final Drawable[] R4 = new Drawable[2];
    public static final Drawable[] S4 = new Drawable[2];
    public static final Drawable[][] T4 = (Drawable[][]) Array.newInstance(Drawable.class, 5, 2);
    public static final Path[] Y4 = new Path[2];
    public static final Path[] Z4 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.<clinit>():void");
    }

    public static void A() {
        if (o != 2) {
            if (k) {
                k = false;
                gl.r(m);
            }
            if (j) {
                j = false;
                gl.r(l);
            }
            if (g) {
                h = 1.0f;
                e.unregisterListener(xm, f);
                g = false;
                if (w01.a) {
                    fa4.b("light sensor unregistered");
                }
            }
        }
    }

    public static String A0() {
        akb akbVar = J;
        if (akbVar == null) {
            return "";
        }
        String l10 = akbVar.l();
        if (l10.toLowerCase().endsWith(".attheme")) {
            return l10.substring(0, l10.lastIndexOf(46));
        }
        return l10;
    }

    public static void A1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof bya) {
            ((bya) drawable).b(i10);
        } else if (drawable instanceof xf7) {
            ((xf7) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof gq9) {
            ((gq9) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int B(akb akbVar, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = akbVar.Y) != 0 && i10 != i12 && (!akbVar.T || akbVar.Z != n)) {
            float[] N02 = N0(3);
            float[] N03 = N0(4);
            Color.colorToHSV(akbVar.Y, N02);
            Color.colorToHSV(i10, N03);
            return D(N02, N03, i11, akbVar.o(), i11);
        }
        return i11;
    }

    public static akb B0() {
        akb akbVar = K;
        if (akbVar != null) {
            return akbVar;
        }
        return L;
    }

    public static void B1(int i10, Drawable drawable) {
        A1(w0(null, i10, false), drawable);
    }

    public static int C(boolean z10, int i10, int i11, int i12, int i13) {
        float[] N02 = N0(3);
        float[] N03 = N0(4);
        Color.colorToHSV(i10, N02);
        Color.colorToHSV(i11, N03);
        return D(N02, N03, i12, z10, i13);
    }

    public static int C0(int i10) {
        int indexOfKey = jm.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = jm.valueAt(indexOfKey);
        zjb i11 = I.i(false);
        if (i11 == null) {
            return 0;
        }
        float[] N02 = N0(1);
        float[] N03 = N0(2);
        Color.colorToHSV(I.Y, N02);
        Color.colorToHSV(i11.c, N03);
        return D(N02, N03, valueAt, I.o(), valueAt);
    }

    public static void C1(Drawable drawable, int i10, boolean z10) {
        Drawable M02;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    M02 = M0(0, drawable);
                } else {
                    M02 = M0(1, drawable);
                }
                if (M02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) M02).getPaint().setColor(i10);
                } else {
                    M02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int D(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        int min;
        int min2;
        float[] fArr3 = wm;
        if (fArr3 == null) {
            fArr3 = new float[3];
            wm = fArr3;
        }
        Color.colorToHSV(i10, fArr3);
        int i12 = 0;
        float f10 = fArr3[0];
        float f11 = fArr[0];
        float f12 = f10 - f11;
        if (f12 <= 0.0f) {
            f12 = -f12;
        }
        float f13 = (f10 - f11) - 360.0f;
        if (f13 <= 0.0f) {
            f13 = -f13;
        }
        if (Math.min(f12, f13) > 30.0f) {
            return i11;
        }
        float min3 = Math.min((fArr3[1] * 1.5f) / fArr[1], 1.0f);
        fArr3[0] = (fArr3[0] + fArr2[0]) - fArr[0];
        fArr3[1] = (fArr3[1] * fArr2[1]) / fArr[1];
        fArr3[2] = (((min3 * fArr2[2]) / fArr[2]) + (1.0f - min3)) * fArr3[2];
        int HSVToColor = Color.HSVToColor(Color.alpha(i10), fArr3);
        float B10 = gl.B(i10);
        float B11 = gl.B(HSVToColor);
        if (z10) {
            if (B10 <= B11) {
                return HSVToColor;
            }
        } else if (B10 >= B11) {
            return HSVToColor;
        }
        float d10 = ls6.d(0.39999998f, B10, B11, 0.6f);
        int red = (int) (Color.red(HSVToColor) * d10);
        int green = (int) (Color.green(HSVToColor) * d10);
        int blue = (int) (Color.blue(HSVToColor) * d10);
        if (red < 0) {
            min = 0;
        } else {
            min = Math.min(red, 255);
        }
        if (green < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(green, 255);
        }
        if (blue >= 0) {
            i12 = Math.min(blue, 255);
        }
        return Color.argb(Color.alpha(HSVToColor), min, min2, i12);
    }

    public static int D0(int i10) {
        int i11 = gm[i10];
        if (i11 == 0) {
            int i12 = hm.get(i10, -1);
            if (i12 != -1) {
                return D0(i12);
            }
            if ((i10 < pb || i10 >= wb) && i10 != C9 && i10 != M9 && i10 != D9 && i10 != Fe && i10 != Ge) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static void D1(ff0 ff0Var, float f10, float f11, float f12, float f13) {
        if (ug8.A(ff0Var)) {
            int numberOfLayers = ff0Var.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = ff0Var.getDrawable(i10);
                if (drawable instanceof xjb) {
                    xjb xjbVar = (xjb) drawable;
                    float[] fArr = xjbVar.b;
                    float L10 = gl.L(f10);
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = gl.L(f11);
                    fArr[3] = L11;
                    fArr[2] = L11;
                    float L12 = gl.L(f12);
                    fArr[5] = L12;
                    fArr[4] = L12;
                    float L13 = gl.L(f13);
                    fArr[7] = L13;
                    fArr[6] = L13;
                    xjbVar.c = true;
                    xjbVar.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void E(boolean z10) {
        if (M == null && !N) {
            if (!z10 && T > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - U;
                U = elapsedRealtime;
                int i10 = (int) (T - j10);
                T = i10;
                if (i10 > 0) {
                    return;
                }
            }
            boolean z11 = false;
            if (z10) {
                if (k) {
                    k = false;
                    gl.r(m);
                }
                if (j) {
                    j = false;
                    gl.r(l);
                }
            }
            A();
            int q12 = q1();
            if (q12 != 0) {
                if (q12 == 2) {
                    z11 = true;
                }
                l(z11);
            }
            if (z10) {
                i = 0L;
            }
        }
    }

    public static tn4 E0() {
        tn4 tn4Var = sm;
        tn4 tn4Var2 = tn4Var;
        if (tn4Var == null) {
            ?? obj = new Object();
            obj.a = new sn4[4];
            obj.k = 1.0f;
            obj.l = new ArrayList();
            obj.m = new Paint(1);
            obj.n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.a[i10] = new sn4(i10);
            }
            sm = obj;
            tn4Var2 = obj;
        }
        return tn4Var2;
    }

    public static void E1(ff0 ff0Var, int i10, int i11) {
        if (ug8.A(ff0Var)) {
            int numberOfLayers = ff0Var.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = ff0Var.getDrawable(i12);
                if (drawable instanceof xjb) {
                    xjb xjbVar = (xjb) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = xjbVar.b;
                    float L10 = gl.L(f10);
                    fArr[3] = L10;
                    fArr[2] = L10;
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = gl.L(f11);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    xjbVar.c = true;
                    xjbVar.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void F(boolean z10) {
        akb akbVar;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        akbVar = K;
                    } else {
                        akbVar = J;
                    }
                    if (akbVar != null && y6c.h(akbVar.F).o()) {
                        zjb i12 = akbVar.i(false);
                        TLRPC.TL_theme tL_theme = akbVar.G;
                        if (tL_theme != null) {
                            i10 = akbVar.F;
                        } else if (i12 != null && (tL_theme = i12.r) != null) {
                            i10 = y6c.t0;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.id = tL_theme.id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new ck8(i12, akbVar, tL_theme, (byte) 24));
                        }
                    }
                }
            }
        }
    }

    public static int F0(int i10) {
        return w0(null, i10, true);
    }

    public static boolean F1(Drawable drawable, int i10, boolean z10) {
        Drawable M02;
        boolean z11;
        boolean z12 = true;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    Drawable M03 = M0(0, drawable);
                    if (M03 instanceof ShapeDrawable) {
                        if (((ShapeDrawable) M03).getPaint().getColor() == i10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        try {
                            ((ShapeDrawable) M03).getPaint().setColor(i10);
                        } catch (Throwable unused) {
                            return z11;
                        }
                    } else {
                        M03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        z11 = false;
                    }
                    M02 = M0(1, drawable);
                } else {
                    M02 = M0(2, drawable);
                    z11 = false;
                }
                if (M02 instanceof ShapeDrawable) {
                    if (((ShapeDrawable) M02).getPaint().getColor() == i10 && !z11) {
                        z12 = false;
                    }
                    try {
                        ((ShapeDrawable) M02).getPaint().setColor(i10);
                        return z12;
                    } catch (Throwable unused2) {
                        return z12;
                    }
                }
                M02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return z11;
            } catch (Throwable unused3) {
                return false;
            }
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (z10) {
                rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}));
                return false;
            } else if (rippleDrawable.getNumberOfLayers() > 0) {
                Drawable drawable2 = rippleDrawable.getDrawable(0);
                if (drawable2 instanceof ShapeDrawable) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) drawable2;
                    if (shapeDrawable.getPaint().getColor() == i10) {
                        z12 = false;
                    }
                    shapeDrawable.getPaint().setColor(i10);
                    return z12;
                }
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
        }
        return false;
    }

    public static void G(SparseIntArray sparseIntArray, akb akbVar) {
        if (akbVar != null && akbVar.k0 == -1) {
            int i10 = c6;
            if (bm2.h(bm2.f(0.5f, G0(sparseIntArray, i10), G0(sparseIntArray, i10))) < 0.5d) {
                akbVar.k0 = 1;
            } else {
                akbVar.k0 = 0;
            }
        }
    }

    public static int G0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return gm[i10];
    }

    public static void G1(akb akbVar, zjb zjbVar, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        TLRPC.ThemeSettings themeSettings;
        String str;
        boolean z11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        if (tL_theme != null) {
            if (tL_theme.settings.size() > 0) {
                themeSettings = tL_theme.settings.get(0);
            } else {
                themeSettings = null;
            }
            HashMap hashMap = H;
            if (themeSettings != null) {
                if (akbVar == null) {
                    String q02 = q0(themeSettings);
                    if (q02 != null && (akbVar = (akb) hashMap.get(q02)) != null) {
                        zjbVar = (zjb) akbVar.d0.get(tL_theme.id);
                    } else {
                        return;
                    }
                }
                if (zjbVar != null) {
                    TLRPC.TL_theme tL_theme2 = zjbVar.r;
                    if (tL_theme2 != null) {
                        akbVar.d0.remove(tL_theme2.id);
                    }
                    zjbVar.r = tL_theme;
                    zjbVar.t = i10;
                    akbVar.d0.put(tL_theme.id, zjbVar);
                    if (!akb.a(zjbVar, themeSettings)) {
                        akb.g(zjbVar, themeSettings);
                        akb akbVar2 = I;
                        if (akbVar2 == akbVar && akbVar2.Z == zjbVar.a) {
                            r1(false, false);
                            akb akbVar3 = I;
                            if (J == akbVar3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            I1(akbVar3, z12, -1, null);
                        }
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zjbVar.q = z11;
                    akbVar.U = false;
                } else {
                    return;
                }
            } else {
                if (akbVar != null) {
                    str = akbVar.k();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.id;
                    akbVar = (akb) hashMap.get(str);
                }
                if (akbVar == null) {
                    return;
                }
                akbVar.G = tL_theme;
                akbVar.a = tL_theme.title;
                File file = new File(akbVar.b);
                File file2 = new File(a.h(), tb4.o(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        gl.E(file, file2);
                        akbVar.b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        fa4.g(e10, true);
                    }
                }
                if (z10) {
                    akbVar.H = false;
                    akbVar.h0 = null;
                    akbVar.i0 = null;
                    kk7.f(akbVar.F).a(akbVar, kk7.X1);
                    kk7.f(akbVar.F).a(akbVar, kk7.Y1);
                    ba4 G10 = ba4.G(akbVar.F);
                    TLRPC.TL_theme tL_theme3 = akbVar.G;
                    G10.X(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    akbVar.U = false;
                }
                hashMap.put(akbVar.k(), akbVar);
            }
            w1(true, false);
        }
    }

    public static defpackage.gl2 H(defpackage.akb r19, defpackage.vjb r20, android.util.SparseIntArray r21, java.lang.String r22, java.lang.String r23, int r24, int r25, int r26, boolean r27, boolean r28, boolean r29, boolean r30, org.telegram.tgnet.TLRPC.Document r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.H(akb, vjb, android.util.SparseIntArray, java.lang.String, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):gl2");
    }

    public static ff0 H0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void H1(akb akbVar) {
        Collections.sort(akbVar.c0, new pva((byte) 3));
    }

    public static gl2 I(akb akbVar, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        String str2;
        boolean z12;
        float f10;
        float f11;
        if (akbVar.T && akbVar.Z == n) {
            z11 = true;
        } else {
            z11 = false;
        }
        zjb i11 = akbVar.i(false);
        if (i11 != null) {
            str2 = i11.o;
        } else {
            str2 = null;
        }
        if (i11 != null && i11.q) {
            z12 = true;
        } else {
            z12 = false;
        }
        vjb vjbVar = akbVar.j0;
        if (vjbVar != null) {
            f11 = vjbVar.k;
        } else if (i11 != null) {
            f11 = i11.p;
        } else {
            f10 = akbVar.E;
            return H(akbVar, vjbVar, sparseIntArray, str2, str, jm.get(f5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return H(akbVar, vjbVar, sparseIntArray, str2, str, jm.get(f5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String I0() {
        vjb vjbVar = I.j0;
        if (vjbVar != null) {
            return vjbVar.c;
        }
        if (e1()) {
            return "t";
        }
        return "d";
    }

    public static void I1(akb akbVar, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view != null && view.isAttachedToWindow()) {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        } else {
            iArr[0] = gl.q.x / 2;
            iArr[1] = 0;
        }
        kk7.e().k(kk7.v4, akbVar, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
    }

    public static void J(Context context, boolean z10) {
        float f10;
        float f11;
        TextPaint textPaint;
        float f12;
        Drawable[] drawableArr;
        O();
        if (!z10 && l3 == null) {
            Resources resources = context.getResources();
            g3 = resources.getDrawable(2131232801);
            k3 = resources.getDrawable(2131231751).mutate();
            l3 = new m17(0, false, false, null);
            m3 = new m17(0, false, true, null);
            n3 = new m17(0, true, false, null);
            o3 = new m17(0, true, true, null);
            p3 = new m17(1, false, false, null);
            q3 = new m17(1, false, true, null);
            r3 = new m17(1, true, false, null);
            s3 = new m17(1, true, true, null);
            ?? obj = new Object();
            obj.a = new Path();
            obj.b = -1.0f;
            obj.g = new ArrayList();
            obj.c = 0.293f;
            obj.d = -26.0f;
            obj.e = -28.0f;
            obj.f = 1.0f;
            w3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            w3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            w3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            w3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            w3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            w3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            w3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            x3 = resources.getDrawable(2131232096).mutate();
            y3 = resources.getDrawable(2131232096).mutate();
            z3 = resources.getDrawable(2131232096).mutate();
            A3 = resources.getDrawable(2131232096).mutate();
            E3 = resources.getDrawable(2131232096).mutate();
            G3 = resources.getDrawable(2131232096).mutate();
            B3 = resources.getDrawable(2131232182).mutate();
            C3 = resources.getDrawable(2131232182).mutate();
            F3 = resources.getDrawable(2131232183).mutate();
            H3 = resources.getDrawable(2131232183).mutate();
            D3 = new xf7();
            K3 = resources.getDrawable(2131231313).mutate();
            L3 = resources.getDrawable(2131232429).mutate();
            M3 = resources.getDrawable(2131232429).mutate();
            N3 = resources.getDrawable(2131232429).mutate();
            O3 = resources.getDrawable(2131232429).mutate();
            P3 = resources.getDrawable(2131232337).mutate();
            Q3 = resources.getDrawable(2131232337).mutate();
            R3 = resources.getDrawable(2131232337).mutate();
            S3 = resources.getDrawable(2131232337).mutate();
            T3 = resources.getDrawable(2131232301).mutate();
            U3 = resources.getDrawable(2131232301).mutate();
            V3 = resources.getDrawable(2131232301).mutate();
            W3 = resources.getDrawable(2131232301).mutate();
            Y3 = resources.getDrawable(2131232301).mutate();
            X3 = resources.getDrawable(2131232301).mutate();
            Z3 = resources.getDrawable(2131232429).mutate();
            a4 = resources.getDrawable(2131232337).mutate();
            I3 = resources.getDrawable(2131232429).mutate();
            J3 = resources.getDrawable(2131232337).mutate();
            b4 = resources.getDrawable(2131232046).mutate();
            c4 = resources.getDrawable(2131232046).mutate();
            d4 = resources.getDrawable(2131232046).mutate();
            e4 = resources.getDrawable(2131232046).mutate();
            f4 = resources.getDrawable(2131232799);
            g4 = resources.getDrawable(2131232195).mutate();
            h4 = resources.getDrawable(2131232195).mutate();
            i4 = resources.getDrawable(2131232441);
            j4 = resources.getDrawable(2131231629).mutate();
            k4 = resources.getDrawable(2131231313);
            Drawable mutate = resources.getDrawable(2131230994).mutate();
            Drawable[] drawableArr2 = F4;
            drawableArr2[0] = mutate;
            Drawable mutate2 = resources.getDrawable(2131230994).mutate();
            Drawable[] drawableArr3 = G4;
            drawableArr3[0] = mutate2;
            Drawable mutate3 = resources.getDrawable(2131230994).mutate();
            Drawable[] drawableArr4 = H4;
            drawableArr4[0] = mutate3;
            Drawable mutate4 = resources.getDrawable(2131230994).mutate();
            Drawable[] drawableArr5 = I4;
            drawableArr5[0] = mutate4;
            drawableArr2[1] = resources.getDrawable(2131230993).mutate();
            drawableArr3[1] = resources.getDrawable(2131230993).mutate();
            drawableArr4[1] = resources.getDrawable(2131230993).mutate();
            drawableArr5[1] = resources.getDrawable(2131230993).mutate();
            N4 = resources.getDrawable(2131230992).mutate();
            O4 = resources.getDrawable(2131230991).mutate();
            P4 = resources.getDrawable(2131230991).mutate();
            int i10 = 0;
            while (true) {
                drawableArr = L4;
                if (i10 >= 2) {
                    break;
                }
                J4[i10] = resources.getDrawable(2131232567).mutate();
                K4[i10] = resources.getDrawable(2131232568).mutate();
                drawableArr[i10] = resources.getDrawable(2131232127).mutate();
                M4[i10] = resources.getDrawable(2131232322).mutate();
                i10++;
            }
            U4 = resources.getDrawable(2131231939).mutate();
            V4 = resources.getDrawable(2131231939).mutate();
            W4 = resources.getDrawable(2131231937).mutate();
            X4 = resources.getDrawable(2131231937).mutate();
            l4 = resources.getDrawable(2131230893);
            m4 = resources.getDrawable(2131230898);
            n4 = resources.getDrawable(2131230897);
            u4 = resources.getDrawable(2131230896);
            w4 = resources.getDrawable(2131230895);
            v4 = resources.getDrawable(2131230892);
            x4 = resources.getDrawable(2131230899);
            y4 = resources.getDrawable(2131230894);
            z4 = resources.getDrawable(2131232518);
            A4 = resources.getDrawable(2131232258);
            B4 = resources.getDrawable(2131232259);
            C4 = resources.getDrawable(2131232064);
            D4 = resources.getDrawable(2131231229);
            E4 = resources.getDrawable(2131231230);
            o4 = resources.getDrawable(2131231240).mutate();
            Q4 = resources.getDrawable(2131232456);
            p4 = resources.getDrawable(2131231090).mutate();
            q4 = resources.getDrawable(2131231089);
            r4 = resources.getDrawable(2131232439).mutate();
            s4 = resources.getDrawable(2131231753).mutate();
            t4 = resources.getDrawable(2131231135);
            int L10 = gl.L(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Y4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(gl.L(7.0f), gl.L(3.0f));
            pathArr[0].lineTo(gl.L(14.0f), gl.L(3.0f));
            pathArr[0].lineTo(gl.L(21.0f), gl.L(10.0f));
            pathArr[0].lineTo(gl.L(21.0f), gl.L(20.0f));
            int i11 = L10 << 1;
            f11 = 14.0f;
            rectF.set(gl.L(21.0f) - i11, gl.L(19.0f) - L10, gl.L(21.0f), gl.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(gl.L(6.0f), gl.L(21.0f));
            rectF.set(gl.L(5.0f), gl.L(19.0f) - L10, gl.L(5.0f) + i11, gl.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(gl.L(5.0f), gl.L(4.0f));
            rectF.set(gl.L(5.0f), gl.L(3.0f), gl.L(5.0f) + i11, gl.L(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(gl.L(14.0f), gl.L(5.0f));
            pathArr[1].lineTo(gl.L(19.0f), gl.L(10.0f));
            pathArr[1].lineTo(gl.L(14.0f), gl.L(10.0f));
            pathArr[1].close();
            a5 = resources.getDrawable(2131231110).mutate();
            b5 = resources.getDrawable(2131232350).mutate();
            Drawable[][] drawableArr6 = T4;
            drawableArr6[0][0] = M(gl.L(44.0f), 2131232353);
            drawableArr6[0][1] = M(gl.L(44.0f), 2131232353);
            drawableArr6[1][0] = M(gl.L(44.0f), 2131232352);
            drawableArr6[1][1] = M(gl.L(44.0f), 2131232352);
            drawableArr6[2][0] = M(gl.L(44.0f), 2131232351);
            drawableArr6[2][1] = M(gl.L(44.0f), 2131232351);
            drawableArr6[3][0] = M(gl.L(44.0f), 2131232349);
            drawableArr6[3][1] = M(gl.L(44.0f), 2131232349);
            drawableArr6[4][0] = M(gl.L(44.0f), 2131232348);
            drawableArr6[4][1] = M(gl.L(44.0f), 2131232348);
            fm2 M10 = M(gl.L(44.0f), 2131232103);
            Drawable[] drawableArr7 = S4;
            drawableArr7[0] = M10;
            drawableArr7[1] = M(gl.L(44.0f), 2131232103);
            Drawable mutate5 = resources.getDrawable(2131232214).mutate();
            Drawable[] drawableArr8 = R4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(2131232214).mutate();
            h3 = b00.d(context, 2131231032);
            i3 = b00.d(context, 2131232733);
            wl9 wl9Var = new wl9((byte) 0);
            Paint paint = new Paint(1);
            wl9Var.b = paint;
            paint.setShadowLayer(gl.L(4.0f), 0.0f, 0.0f, 1593835520);
            j3 = wl9Var;
            cm.clear();
            dm.clear();
            Drawable drawable = w4;
            int i12 = ad;
            c("drawableBotInline", drawable, i12);
            c("drawableBotWebView", x4, i12);
            c("drawableBotLock", z4, i12);
            c("drawableBotLink", u4, i12);
            c("drawable_botInvite", y4, i12);
            c("drawableGoIcon", t4, i12);
            c("drawableCommentSticker", B4, i12);
            c("drawableMsgError", i4, wd);
            c("drawableMsgIn", l3, -1);
            c("drawableMsgInSelected", m3, -1);
            c("drawableMsgInMedia", p3, -1);
            c("drawableMsgInMediaSelected", q3, -1);
            c("drawableMsgInInstant", g4, td);
            c("drawableMsgOut", n3, -1);
            c("drawableMsgOutSelected", o3, -1);
            c("drawableMsgOutMedia", r3, -1);
            c("drawableMsgOutMediaSelected", s3, -1);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Lb;
            c("drawableMsgOutCallAudio", drawable2, i13);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Mb;
            c("drawableMsgOutCallAudioSelected", drawable3, i14);
            c("drawableMsgOutCallVideo", drawableArr4[1], i13);
            c("drawableMsgOutCallVideo", drawableArr5[1], i14);
            c("drawableMsgOutCheck", x3, zb);
            c("drawableMsgOutCheckSelected", y3, Ab);
            Drawable drawable4 = z3;
            int i15 = Bb;
            c("drawableMsgOutCheckRead", drawable4, i15);
            Drawable drawable5 = A3;
            int i16 = Cb;
            c("drawableMsgOutCheckReadSelected", drawable5, i16);
            c("drawableMsgOutHalfCheck", B3, i15);
            c("drawableMsgOutHalfCheckSelected", C3, i16);
            c("drawableMsgOutInstant", h4, i13);
            c("drawableMsgOutMenu", d4, Jb);
            c("drawableMsgOutMenuSelected", e4, Kb);
            Drawable drawable6 = V3;
            int i17 = Hb;
            c("drawableMsgOutPinned", drawable6, i17);
            Drawable drawable7 = W3;
            int i18 = Ib;
            c("drawableMsgOutPinnedSelected", drawable7, i18);
            c("drawableMsgOutReplies", R3, i17);
            c("drawableMsgOutReplies", S3, i18);
            c("drawableMsgOutViews", N3, i17);
            c("drawableMsgOutViewsSelected", O3, i18);
            Drawable drawable8 = G3;
            int i19 = Yc;
            c("drawableMsgStickerCheck", drawable8, i19);
            c("drawableMsgStickerHalfCheck", H3, i19);
            c("drawableMsgStickerPinned", X3, i19);
            c("drawableMsgStickerReplies", J3, i19);
            c("drawableMsgStickerViews", I3, i19);
            c("drawableReplyIcon", q4, i12);
            c("drawableCloseIcon", r4, i12);
            c("drawableMoreIcon", s4, i12);
            c("drawableShareIcon", p4, i12);
            c("drawableMuteIcon", j4, ed);
            c("drawableLockIcon", k4, fd);
            c("drawable_chat_pollHintDrawableOut", drawableArr[1], Nb);
            c("drawable_chat_pollHintDrawableIn", drawableArr[0], Ad);
            j(z10, false);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        if (!z10 && (textPaint = B2) != null) {
            textPaint.setTextSize(gl.L(12.0f));
            C2.setTextSize(gl.L(12.0f));
            D2.setTextSize(gl.L(11.0f));
            F2.setTextSize(gl.L(15.0f));
            G2.setTextSize(gl.L(15.0f));
            H2.setTextSize(gl.L(13.0f));
            M2.setTextSize(gl.L(12.0f));
            E2.setTextSize(gl.L(12.0f));
            N2.setTextSize(gl.L(16.0f));
            O2.setTextSize(gl.L(15.0f));
            P2.setTextSize(gl.L(15.0f));
            Q2.setTextSize(gl.L(15.0f));
            R2.setTextSize(gl.L(13.0f));
            I2.setTextSize(gl.L(12.0f));
            V2.setTextSize(gl.L(f12));
            X2.setTextSize(gl.L(f12));
            Y2.setTextSize(gl.L(f12));
            float f13 = (((gba.S0 << 1) + 10) / 3.0f) - f10;
            c3.setTextSize(gl.L(f13));
            W2.setTextSize(gl.L(f12));
            T2.setTextSize(gl.L(f13));
            U2.setTextSize(gl.L(12.0f));
            S2.setTextSize(gl.L(12.0f));
            J2.setTextSize(gl.L(13.0f));
            K2.setTextSize(gl.L(13.0f));
            L2.setTextSize(gl.L(13.0f));
            W1.setStrokeWidth(gl.L(f10));
            Y1.setStrokeWidth(gl.L(1.1f));
            r2.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
            s2.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
            t2.setTextSize(gl.L(Math.max(16, gba.S0) - 3));
            u2.setTextSize(gl.L(Math.max(16, gba.S0)));
            e3.setTextSize(gl.L(15.0f));
            f3.setTextSize(gl.L(13.0f));
            j2.setStrokeWidth(gl.L(3.0f));
            k2.setStrokeWidth(gl.L(2.33f));
            d3.setTextSize(gl.L(f11));
            d3.setTypeface(gl.o());
        }
    }

    public static ff0 J0(int i10, int i11, wjb wjbVar) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(v0(i11, wjbVar)), new ColorDrawable(-1));
        }
        return f0(i10, 2, -1);
    }

    public static int J1(SparseIntArray sparseIntArray) {
        int i10 = ub;
        int i11 = vb;
        int i12 = qb;
        int[] iArr = {i12, tb, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, gm[i18]);
                int red = Color.red(i19) + i13;
                int green = Color.green(i19) + i15;
                i14++;
                i16 = Color.blue(i19) + i16;
                i15 = green;
                i13 = red;
            }
        }
        return Color.rgb(i13 / i14, i15 / i14, i16 / i14);
    }

    public static ShapeDrawable K(int i10, int i11) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static ff0 K0(wjb wjbVar, boolean z10) {
        int v02 = v0(h6, wjbVar);
        if (z10) {
            return J0(v02, c6, wjbVar);
        }
        return f0(v02, 2, -1);
    }

    public static void K1(d dVar) {
        String M02;
        if (o != 0) {
            if (dVar != null) {
                try {
                    u21 b02 = u21.b0(dVar);
                    if (o == 3) {
                        M02 = k96.M0(2131753782, "AutoNightSystemModeOff");
                    } else {
                        M02 = k96.M0(2131753787, "AutoNightModeOff");
                    }
                    b02.J(2131623938, M02, k96.M0(2131745303, "Settings"), 5000, false, new ro8(dVar, (byte) 27)).j();
                } catch (Exception e10) {
                    fa4.g(e10, true);
                }
            }
            o = 0;
            u1();
            A();
        }
    }

    public static ShapeDrawable L(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, i11, i12, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static ff0 L0(boolean z10) {
        int w02 = w0(null, h6, false);
        if (z10) {
            return J0(w02, c6, null);
        }
        return f0(w02, 2, -1);
    }

    public static void L1(k27 k27Var) {
        n40 n40Var = c5;
        if (n40Var == null) {
            return;
        }
        if (n40Var.i != null && k27Var != null) {
            HashMap hashMap = d5;
            if (hashMap == null) {
                hashMap = new HashMap();
                d5 = hashMap;
            }
            hashMap.put(k27Var, c5);
            c5.d(false, null);
            gl.d3(new os1(k27Var, (byte) 3), 200L);
            c5 = null;
            return;
        }
        n40Var.i = null;
    }

    public static fm2 M(int i10, int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = b00.d(a.b, i11);
        } else {
            drawable = null;
        }
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        fm2 fm2Var = new fm2(shapeDrawable, drawable);
        fm2Var.h = i10;
        fm2Var.n = i10;
        return fm2Var;
    }

    public static Drawable M0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (um == null) {
            try {
                um = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = um;
        if (method != null) {
            try {
                return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean M1(int i10, int i11) {
        float red = Color.red(i10) / 255.0f;
        float green = Color.green(i10) / 255.0f;
        float blue = Color.blue(i10) / 255.0f;
        float red2 = ((Color.red(i11) / 255.0f) * 0.5f) + (red * 0.5f);
        float green2 = (((Color.green(i11) / 255.0f) * 0.5f) + (green * 0.5f)) * 0.7152f;
        float blue2 = (((Color.blue(i11) / 255.0f) * 0.5f) + (blue * 0.5f)) * 0.0722f;
        float f10 = blue * 0.0722f;
        float f11 = f10 + (green * 0.7152f) + (red * 0.2126f);
        if (blue2 + green2 + (red2 * 0.2126f) <= 0.705f && f11 <= 0.705f) {
            return false;
        }
        return true;
    }

    public static ff0 N(int i10, int i11, int i12) {
        z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new ljb(i11, i12));
    }

    public static float[] N0(int i10) {
        ThreadLocal threadLocal;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        threadLocal = rm;
                    } else {
                        threadLocal = qm;
                    }
                } else {
                    threadLocal = pm;
                }
            } else {
                threadLocal = om;
            }
        } else {
            threadLocal = nm;
        }
        float[] fArr = (float[]) threadLocal.get();
        if (fArr == null) {
            float[] fArr2 = new float[3];
            threadLocal.set(fArr2);
            return fArr2;
        }
        return fArr;
    }

    public static void O() {
        P();
        if (B2 == null) {
            B2 = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            C2 = textPaint;
            TextPaint i10 = de9.i(textPaint, 1);
            D2 = i10;
            TextPaint i11 = de9.i(i10, 1);
            F2 = i11;
            i11.setTypeface(gl.o());
            R1 = new Paint(1);
            Paint paint = new Paint(1);
            S1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = S1;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint2 = new TextPaint(1);
            G2 = textPaint2;
            H2 = de9.i(textPaint2, 1);
            Paint paint3 = new Paint();
            T1 = paint3;
            paint3.setPathEffect(b46.c());
            Paint paint4 = new Paint();
            U1 = paint4;
            paint4.setPathEffect(b46.c());
            Paint paint5 = new Paint();
            V1 = paint5;
            paint5.setPathEffect(b46.c());
            Paint paint6 = new Paint(1);
            j2 = paint6;
            paint6.setStrokeCap(cap);
            j2.setStyle(style);
            j2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            k2 = paint7;
            paint7.setStrokeCap(cap);
            k2.setStyle(style);
            M2 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            E2 = textPaint3;
            textPaint3.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint4 = new TextPaint(1);
            N2 = textPaint4;
            O2 = de9.i(textPaint4, 1);
            TextPaint textPaint5 = new TextPaint(1);
            P2 = textPaint5;
            TextPaint i12 = de9.i(textPaint5, 1);
            Q2 = i12;
            R2 = de9.i(i12, 1);
            I2 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            J2 = textPaint6;
            K2 = de9.i(textPaint6, 1);
            S2 = new TextPaint(1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            V2 = textPaint7;
            W2 = de9.i(textPaint7, 1);
            TextPaint textPaint8 = new TextPaint(1);
            X2 = textPaint8;
            Y2 = de9.i(textPaint8, 1);
            TextPaint textPaint9 = new TextPaint(1);
            c3 = textPaint9;
            b3 = de9.i(textPaint9, 1);
            d3 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            L2 = textPaint10;
            textPaint10.setTypeface(gl.o());
            Paint paint8 = new Paint(1);
            W1 = paint8;
            paint8.setStyle(style);
            W1.setStrokeCap(cap);
            X1 = new Paint(1);
            Paint paint9 = new Paint(1);
            Y1 = paint9;
            paint9.setStyle(style);
            Y1.setStrokeCap(cap);
            Z1 = new Paint(1);
            a2 = new Paint(1);
            b2 = new Paint(1);
            Paint paint10 = new Paint(1);
            c2 = paint10;
            paint10.setStyle(style);
            c2.setStrokeCap(cap);
            r2 = new TextPaint(1);
            s2 = new TextPaint(1);
            t2 = new TextPaint(1);
            TextPaint i13 = de9.i(r2, 1);
            u2 = i13;
            i13.setTypeface(gl.o());
            Paint paint11 = new Paint(1);
            g2 = paint11;
            paint11.setColor(352321536);
            h2 = new Paint(1);
            TextPaint textPaint11 = new TextPaint(1);
            e3 = textPaint11;
            f3 = de9.i(textPaint11, 1);
            i2 = new Paint();
            new Paint(1);
            l2 = new Paint(1);
            m2 = new Paint(1);
            d2 = new Paint(1);
            e2 = new Paint(7);
            f2 = new Paint(7);
            d(xd, d2, "paintChatMessageBackgroundSelected");
            Paint paint12 = e2;
            int i14 = bd;
            d(i14, paint12, "paintChatActionBackground");
            d(i14, g2, "paintChatActionBackgroundDarken");
            d(cd, f2, "paintChatActionBackgroundSelected");
            TextPaint textPaint12 = r2;
            int i15 = Yc;
            d(i15, textPaint12, "paintChatActionText");
            d(i15, s2, "paintChatActionText2");
            d(i15, t2, "paintChatActionText3");
            d(Dd, P2, "paintChatBotButton");
            d(Ie, i2, "paintChatComposeBackground");
            d(md, h2, "paintChatTimeBackground");
        }
    }

    public static akb O0(String str) {
        return (akb) H.get(str);
    }

    public static void P() {
        synchronized (c) {
            if (n2 == null) {
                n2 = new TextPaint(1);
                w2 = new TextPaint(1);
                x2 = new TextPaint[6];
                y2 = new TextPaint(1);
                z2 = new TextPaint(1);
                A2 = new TextPaint(1);
                TextPaint textPaint = new TextPaint(1);
                v2 = textPaint;
                textPaint.setTypeface(gl.o());
                TextPaint textPaint2 = new TextPaint(1);
                V2 = textPaint2;
                textPaint2.setTypeface(gl.o());
                TextPaint textPaint3 = new TextPaint(1);
                X2 = textPaint3;
                textPaint3.setTypeface(gl.o());
                Y2 = new TextPaint(1);
                Z2 = new TextPaint(1);
                a3 = new TextPaint(1);
                b3 = new TextPaint(1);
                TextPaint textPaint4 = new TextPaint(1);
                c3 = textPaint4;
                textPaint4.setTypeface(gl.o());
                W2 = new TextPaint(1);
                T2 = new TextPaint(1);
                S2 = new TextPaint(1);
                TextPaint textPaint5 = new TextPaint(1);
                o2 = textPaint5;
                Typeface typeface = Typeface.MONOSPACE;
                textPaint5.setTypeface(typeface);
                TextPaint textPaint6 = new TextPaint(1);
                p2 = textPaint6;
                textPaint6.setTypeface(typeface);
                TextPaint textPaint7 = new TextPaint(1);
                q2 = textPaint7;
                textPaint7.setTypeface(typeface);
                new TextPaint(1);
                U2 = new TextPaint(1);
            }
            float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
            int i10 = 0;
            while (true) {
                TextPaint[] textPaintArr = x2;
                if (i10 < textPaintArr.length) {
                    textPaintArr[i10] = new TextPaint(1);
                    x2[i10].setTextSize(gl.L(fArr[i10] * 120.0f));
                    i10++;
                } else {
                    y2.setTextSize(gl.L(46.0f));
                    z2.setTextSize(gl.L(38.0f));
                    A2.setTextSize(gl.L(30.0f));
                    n2.setTextSize(gl.L(gba.S0));
                    w2.setTextSize(gl.L(14.0f));
                    v2.setTextSize(gl.L(15.0f));
                    float f10 = ((gba.S0 << 1) + 10) / 3.0f;
                    V2.setTextSize(gl.L(f10));
                    X2.setTextSize(gl.L(f10));
                    Y2.setTextSize(gl.L(f10));
                    float f11 = f10 - 1.0f;
                    Z2.setTextSize(gl.L(f11));
                    a3.setTextSize(gl.L(f10));
                    U2.setTextSize(gl.L(12.0f));
                    c3.setTextSize(gl.L(f11));
                    b3.setTextSize(gl.L(f10 - 2.0f));
                    W2.setTextSize(gl.L(f10));
                    T2.setTextSize(gl.L(f11));
                    o2.setTextSize(gl.L(Math.max(Math.min(10, gba.S0 - 1), gba.S0 - 2)));
                    p2.setTextSize(gl.L(Math.max(Math.min(10, gba.S0 - 2), gba.S0 - 3)));
                    q2.setTextSize(gl.L(Math.max(Math.min(10, gba.S0 - 2), gba.S0 - 5)));
                }
            }
        }
    }

    public static Drawable P0(String str) {
        return (Drawable) cm.get(str);
    }

    public static void Q(Context context) {
        if (j0 == null) {
            Paint paint = new Paint();
            j0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            k0 = paint2;
            paint2.setStrokeWidth(1.0f);
            p0 = new Paint(1);
            Paint paint3 = new Paint(1);
            n0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            n0.setStrokeWidth(gl.L(2.0f));
            n0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            m0 = paint4;
            paint4.setColor(0);
            m0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            o0 = new Paint(1);
            Paint paint5 = new Paint();
            l0 = paint5;
            paint5.setPathEffect(b46.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(2131231002);
            Drawable[] drawableArr = q0;
            drawableArr[0] = drawable;
            drawableArr[1] = resources.getDrawable(2131231217);
            drawableArr[2] = resources.getDrawable(2131232167);
            drawableArr[3] = resources.getDrawable(2131232169);
            drawableArr[4] = resources.getDrawable(2131232165);
            drawableArr[5] = resources.getDrawable(2131232164);
            drawableArr[6] = resources.getDrawable(2131232163);
            drawableArr[7] = resources.getDrawable(2131232166);
            drawableArr[8] = resources.getDrawable(2131232168);
            drawableArr[9] = resources.getDrawable(2131232162);
            drawableArr[10] = resources.getDrawable(2131232167);
            drawableArr[11] = resources.getDrawable(2131231001);
            drawableArr[12] = resources.getDrawable(2131232477);
            drawableArr[13] = resources.getDrawable(2131232391);
            drawableArr[14] = resources.getDrawable(2131231118);
            drawableArr[15] = resources.getDrawable(2131231183);
            drawableArr[16] = resources.getDrawable(2131231181);
            drawableArr[17] = resources.getDrawable(2131231619);
            drawableArr[18] = resources.getDrawable(2131231612);
            drawableArr[19] = resources.getDrawable(2131231617);
            drawableArr[20] = resources.getDrawable(2131231112);
            drawableArr[21] = resources.getDrawable(2131231111);
            drawableArr[22] = resources.getDrawable(2131231125);
            drawableArr[23] = resources.getDrawable(2131231126);
            drawableArr[24] = resources.getDrawable(2131231178);
            oy8 oy8Var = t1;
            if (oy8Var != null) {
                oy8Var.setCallback(null);
                t1.x(false);
            }
            oy8 oy8Var2 = u1;
            if (oy8Var2 != null) {
                oy8Var2.x(false);
            }
            oy8 oy8Var3 = v1;
            if (oy8Var3 != null) {
                oy8Var3.x(false);
            }
            oy8 oy8Var4 = w1;
            if (oy8Var4 != null) {
                oy8Var4.x(false);
            }
            oy8 oy8Var5 = x1;
            if (oy8Var5 != null) {
                oy8Var5.x(false);
            }
            oy8 oy8Var6 = y1;
            if (oy8Var6 != null) {
                oy8Var6.x(false);
            }
            t1 = new oy8(2131623979, gl.L(36.0f), gl.L(36.0f), false, null);
            u1 = new oy8(2131623978, gl.L(36.0f), gl.L(36.0f), false, null);
            v1 = new oy8(2131623984, gl.L(36.0f), gl.L(36.0f), false, null);
            w1 = new oy8(2131623981, gl.L(36.0f), gl.L(36.0f), false, null);
            x1 = new oy8(2131623985, gl.L(36.0f), gl.L(36.0f), false, null);
            y1 = new oy8(2131623974, gl.L(30.0f), gl.L(30.0f), false, null);
            G1 = new oy8(2131624240, gl.L(36.0f), gl.L(36.0f), false, null);
            H1 = new oy8(2131624243, gl.L(36.0f), gl.L(36.0f), false, null);
            K1 = new oy8(2131624242, gl.L(36.0f), gl.L(36.0f), false, null);
            L1 = new oy8(2131624245, gl.L(36.0f), gl.L(36.0f), false, null);
            I1 = new oy8(2131624238, gl.L(36.0f), gl.L(36.0f), false, null);
            N1 = new oy8(2131624244, gl.L(36.0f), gl.L(36.0f), false, null);
            M1 = new oy8(2131624241, gl.L(36.0f), gl.L(36.0f), false, null);
            J1 = new oy8(2131624237, gl.L(28.0f), gl.L(28.0f), false, null);
            k();
        }
    }

    public static Drawable Q0(String str, wjb wjbVar) {
        Drawable drawable;
        if (wjbVar != null) {
            drawable = wjbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) cm.get(str);
    }

    public static ye7 R(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ye7 ye7Var = new ye7(-2368069, -9722489, -2762611, -7817084, z10, false);
        Bitmap bitmap = null;
        if (i10 > 0 && i11 > 0) {
            i13 = i10;
            i12 = i11;
        } else {
            Point point = gl.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            mqc c10 = zqc.c();
            if (c10 != null) {
                bitmap = c10.a;
            }
            i12 = max;
            i13 = min;
        }
        if (bitmap == null) {
            bitmap = lcb.c(1.0f, 2131623998, i13, i12, -16777216, 2);
        }
        ye7Var.r(34, bitmap);
        ye7Var.s(ye7Var.f());
        return ye7Var;
    }

    public static SparseIntArray R0(File file, String str, String[] strArr) {
        boolean z10;
        File file2;
        FileInputStream fileInputStream;
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream2 = null;
        try {
            byte[] bArr = new byte[1024];
            if (str != null) {
                file2 = p0(str);
            } else {
                file2 = file;
            }
            fileInputStream = new FileInputStream(file2);
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == i10) {
                        break;
                    }
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = i12;
                    while (true) {
                        if (i13 >= read) {
                            break;
                        }
                        if (bArr[i13] == 10) {
                            int i16 = i13 - i14;
                            int i17 = i16 + 1;
                            String str2 = new String(bArr, i14, i16);
                            if (str2.startsWith("WLS=")) {
                                if (strArr != null && strArr.length > 0) {
                                    strArr[0] = str2.substring(4);
                                }
                            } else if (str2.startsWith("WPS")) {
                                i11 = i15 + i17;
                                z11 = true;
                                break;
                            } else {
                                int indexOf = str2.indexOf(61);
                                if (indexOf != i10) {
                                    String substring = str2.substring(0, indexOf);
                                    String substring2 = str2.substring(indexOf + 1);
                                    if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                        try {
                                            intValue = Color.parseColor(substring2);
                                        } catch (Exception unused) {
                                            intValue = Utilities.z(substring2).intValue();
                                        }
                                    } else {
                                        intValue = Utilities.z(substring2).intValue();
                                    }
                                    int d10 = lve.d(substring);
                                    if (d10 >= 0) {
                                        sparseIntArray.put(d10, intValue);
                                    }
                                }
                            }
                            i14 += i17;
                            i15 += i17;
                        }
                        i13++;
                        i10 = -1;
                    }
                    if (i12 == i15) {
                        break;
                    }
                    fileInputStream.getChannel().position(i15);
                    if (z11) {
                        break;
                    }
                    i12 = i15;
                    i10 = -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    z10 = true;
                    try {
                        fa4.g(th, true);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                fa4.g(e, z10);
                                return sparseIntArray;
                            }
                        }
                        return sparseIntArray;
                    } catch (Throwable th3) {
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e11) {
                                fa4.g(e11, true);
                            }
                        }
                        throw th3;
                    }
                }
            }
            sparseIntArray.put(f5, i11);
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            fileInputStream.close();
        } catch (Exception e12) {
            e = e12;
            z10 = true;
            fa4.g(e, z10);
            return sparseIntArray;
        }
        return sparseIntArray;
    }

    public static void S(Context context) {
        Q(context);
        if (K0 == null) {
            TextPaint textPaint = new TextPaint(1);
            K0 = textPaint;
            TextPaint i10 = de9.i(textPaint, 1);
            L0 = i10;
            i10.setTypeface(gl.o());
            v0 = new Paint(1);
            s0 = new Paint(1);
            z0 = new Paint(1);
        }
        K0.setTextSize(gl.L(12.0f));
        L0.setTextSize(gl.L(13.0f));
        if (A0 == null) {
            Resources resources = context.getResources();
            A0 = new TextPaint[2];
            B0 = new TextPaint[2];
            E0 = new TextPaint[2];
            G0 = new TextPaint[2];
            for (int i11 = 0; i11 < 2; i11++) {
                A0[i11] = new TextPaint(1);
                A0[i11].setTypeface(gl.o());
                B0[i11] = new TextPaint(1);
                B0[i11].setTypeface(gl.o());
                E0[i11] = new TextPaint(1);
                G0[i11] = new TextPaint(1);
            }
            TextPaint textPaint2 = new TextPaint(1);
            C0 = textPaint2;
            TextPaint i12 = de9.i(textPaint2, 1);
            D0 = i12;
            TextPaint i13 = de9.i(i12, 1);
            F0 = i13;
            H0 = de9.i(i13, 1);
            I0 = new TextPaint(1);
            J0 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            M0 = textPaint3;
            TextPaint i14 = de9.i(textPaint3, 1);
            N0 = i14;
            O0 = de9.i(i14, 1);
            P0 = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            Q0 = textPaint4;
            textPaint4.setTypeface(gl.o());
            t0 = new Paint();
            u0 = new Paint(1);
            x0 = new Paint(1);
            w0 = new Paint(1);
            y0 = new Paint(1);
            Z0 = resources.getDrawable(2131231632);
            a1 = resources.getDrawable(2131232247);
            S0 = resources.getDrawable(2131231626).mutate();
            R0 = resources.getDrawable(2131231030).mutate();
            T0 = resources.getDrawable(2131231988).mutate();
            U0 = resources.getDrawable(2131231626).mutate();
            V0 = resources.getDrawable(2131231628);
            W0 = new xf7();
            X0 = resources.getDrawable(2131231635);
            Y0 = resources.getDrawable(2131231631).mutate();
            b1 = resources.getDrawable(2131231629).mutate();
            c1 = resources.getDrawable(2131231634).mutate();
            d1 = resources.getDrawable(2131231947).mutate();
            e1 = resources.getDrawable(2131232796).mutate();
            f1 = new gq9(0);
            g1 = new gq9(1);
            h1 = resources.getDrawable(2131232797).mutate();
            l1 = resources.getDrawable(2131231100).mutate();
            m1 = resources.getDrawable(2131231102).mutate();
            n1 = resources.getDrawable(2131231101).mutate();
            o1 = resources.getDrawable(2131231100).mutate();
            p1 = resources.getDrawable(2131231102).mutate();
            q1 = resources.getDrawable(2131231101).mutate();
            i1 = resources.getDrawable(2131231630);
            j1 = resources.getDrawable(2131232301).mutate();
            k1 = resources.getDrawable(2131232301).mutate();
            s1 = resources.getDrawable(2131232246);
            r0 = resources.getDrawable(2131232579);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float L10 = gl.L(12.0f);
            float L11 = gl.L(12.0f);
            rectF.set(L10 - gl.L(5.0f), L11 - gl.L(5.0f), gl.L(5.0f) + L10, gl.L(5.0f) + L11);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(L10, gl.L(8.0f) + L11);
            pathArr[0].lineTo(L10, gl.L(2.0f) + L11);
            pathArr[0].lineTo(gl.L(3.0f) + L10, gl.L(5.0f) + L11);
            pathArr[0].close();
            pathArr[0].moveTo(L10, L11 - gl.L(8.0f));
            pathArr[0].lineTo(L10, L11 - gl.L(2.0f));
            pathArr[0].lineTo(L10 - gl.L(3.0f), L11 - gl.L(5.0f));
            pathArr[0].close();
            n();
        }
        F0.setTextSize(gl.L(14.0f));
        H0.setTextSize(gl.L(12.0f));
        I0.setTextSize(gl.L(12.0f));
        I0.setTypeface(gl.o());
        J0.setTextSize(gl.L(12.0f));
        J0.setTypeface(gl.o());
        M0.setTextSize(gl.L(13.0f));
        N0.setTextSize(gl.L(11.0f));
        O0.setTextSize(gl.L(15.0f));
        P0.setTextSize(gl.L(15.0f));
        Q0.setTextSize(gl.L(10.0f));
        C0.setTextSize(gl.L(16.0f));
        D0.setTextSize(gl.L(16.0f));
    }

    public static float S0(float f10) {
        if (f10 < 0.0f && !I.o()) {
            return -f10;
        }
        return f10;
    }

    public static ojb T(Context context) {
        return U(context, w0(null, t5, false), w0(null, u5, false));
    }

    public static Paint T0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return j0;
        }
        return (Paint) em.get(str);
    }

    public static ojb U(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(2131232688).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(2131232689).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        ?? stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842908}, mutate2);
        stateListDrawable.addState(new int[]{16842908}, mutate2);
        stateListDrawable.addState(StateSet.WILD_CARD, mutate);
        return stateListDrawable;
    }

    public static Paint U0(String str, wjb wjbVar) {
        Paint d10;
        if (wjbVar != null && (d10 = wjbVar.d(str)) != null) {
            return d10;
        }
        return T0(str);
    }

    public static ojb V(Context context, int i10, int i11, int i12) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(i10).mutate();
        if (i11 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i10).mutate();
        if (i12 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
        ?? stateListDrawable = new StateListDrawable();
        stateListDrawable.setEnterFadeDuration(1);
        stateListDrawable.setExitFadeDuration(200);
        stateListDrawable.addState(new int[]{16842913}, mutate2);
        stateListDrawable.addState(new int[0], mutate);
        return stateListDrawable;
    }

    public static Drawable V0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable d10 = b00.d(context, i10);
        d10.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return d10;
    }

    public static ff0 W(float f10, int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new rjb(i11, i12, i13, i14, f10));
    }

    public static Drawable W0(Context context, int i10, int i11) {
        return V0(context, i10, w0(null, i11, false));
    }

    public static void X(Context context) {
        if (P1 == null) {
            O1 = new TextPaint(1);
            Resources resources = context.getResources();
            P1 = resources.getDrawable(2131232796).mutate();
            Q1 = resources.getDrawable(2131232797).mutate();
            p();
        }
        O1.setTextSize(gl.L(16.0f));
    }

    public static android.graphics.drawable.Drawable X0(boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.X0(boolean):android.graphics.drawable.Drawable");
    }

    public static ff0 Y(int i10, int i11, int i12) {
        z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new xjb(i11, i12));
    }

    public static int Y0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static ff0 Z(int i10, int i11, int i12, int i13) {
        z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(gl.L(f10), gl.L(f11), i10), new xjb(f10, f11));
    }

    public static String Z0(vjb vjbVar) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (vjbVar == null || TextUtils.isEmpty(vjbVar.c) || vjbVar.c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (vjbVar.i) {
            sb2.append("blur");
        }
        if (vjbVar.j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = vjbVar.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + vjbVar.c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.d >> 8)) & 255), Byte.valueOf((byte) (vjbVar.d & 255))).toLowerCase();
            int i11 = vjbVar.e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.e >> 8)) & 255), Byte.valueOf((byte) (vjbVar.e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = vjbVar.f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.f >> 8)) & 255), Byte.valueOf((byte) (vjbVar.f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = vjbVar.g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.g >> 8)) & 255), Byte.valueOf((byte) (vjbVar.g & 255))).toLowerCase();
            }
            if (str != null) {
                if (str2 != null) {
                    if (str4 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(lowerCase);
                        sb3.append("~");
                        sb3.append(str);
                        sb3.append("~");
                        sb3.append(str2);
                        lowerCase = b00.j(sb3, "~", str4);
                    } else {
                        lowerCase = lowerCase + "~" + str + "~" + str2;
                    }
                } else {
                    StringBuilder k10 = b00.k(tb4.p(lowerCase, "-", str), "&rotation=");
                    k10.append(vjbVar.h);
                    lowerCase = k10.toString();
                }
            }
            str3 = "https://attheme.org?slug=" + vjbVar.c + "&intensity=" + ((int) (vjbVar.k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder k11 = b00.k(str3, "&mode=");
            k11.append(sb2.toString());
            return k11.toString();
        }
        return str3;
    }

    public static int a(float f10, float f11, int i10) {
        float[] N02 = N0(5);
        Color.colorToHSV(i10, N02);
        float f12 = N02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            N02[1] = moe.a(f12 + f10, 0.0f, 1.0f);
        }
        N02[2] = moe.a(N02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static ff0 a0(int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.a = new Path();
        drawable.b = r1;
        drawable.c = true;
        float L10 = gl.L(i11);
        float L11 = gl.L(i12);
        float L12 = gl.L(i13);
        float L13 = gl.L(i14);
        float[] fArr = {L10, L10, L11, L11, L12, L12, L13, L13};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean a1() {
        if (P && I.j0 != null) {
            return true;
        }
        return false;
    }

    public static int b(int i10, int i11) {
        float[] N02 = N0(5);
        Color.colorToHSV(i11, N02);
        float f10 = N02[0];
        float f11 = N02[1];
        Color.colorToHSV(i10, N02);
        N02[0] = f10;
        N02[1] = gl.R1(N02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static ShapeDrawable b0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean b1() {
        if (Y != null) {
            return true;
        }
        return false;
    }

    public static void c(String str, Drawable drawable, int i10) {
        cm.put(str, drawable);
        dm.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable c0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean c1(int i10) {
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        float f10 = N02[1];
        if (f10 > 0.1f && f10 < 0.9f) {
            return true;
        }
        return false;
    }

    public static void d(int i10, Paint paint, String str) {
        em.put(str, paint);
        fm.put(str, Integer.valueOf(i10));
    }

    public static InsetDrawable d0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(gl.N(2.0f), 0.0f, gl.N(0.33f), p1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
    }

    public static boolean d1(int i10) {
        if (km.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static void e(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = nl;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, p1(0.1f, -1));
            }
        }
        int[] iArr = gm;
        int i11 = qa;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int J12 = J1(sparseIntArray2);
        int i13 = pl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, w(i12, z10, false));
        }
        int i14 = ql;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, w(i12, z10, true));
        }
        int i15 = rl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, w(J12, z10, false));
        }
        int i16 = sl;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, w(J12, z10, true));
        }
        int i17 = tl;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, x(z10, false, true, i12));
        }
        int i18 = ul;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, x(z10, true, true, J12));
        }
        int i19 = vl;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, x(z10, false, false, i12));
        }
        int i20 = wl;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, x(z10, true, false, J12));
        }
    }

    public static ff0 e0(int i10, int i11) {
        return f0(i10, i11, -1);
    }

    public static boolean e1() {
        akb akbVar = I;
        if (!akbVar.T || akbVar.Z != n) {
            if (km.indexOfKey(De) < 0 && f0 <= 0 && TextUtils.isEmpty(g0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = gm;
        int i10 = qa;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int J12 = J1(sparseIntArray2);
        int i12 = hl;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, y(i11, z10, false));
        }
        int i13 = il;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, y(J12, z10, true));
        }
        int i14 = jl;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, z(i11, z10, false));
        }
        int i15 = kl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, z(J12, z10, true));
        }
        int i16 = ml;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = Qb;
            sparseIntArray2.put(i16, p1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = ll;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Od;
                sparseIntArray2.put(i18, p1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static defpackage.ff0 f0(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.f0(int, int, int):ff0");
    }

    public static boolean f1() {
        if (lm != null) {
            return true;
        }
        return false;
    }

    public static void g(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (d2 == null) {
            return;
        }
        int i10 = km.get(xd);
        if ((drawable instanceof ye7) && gba.o() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && X != (bitmap = ((ye7) drawable).k)) {
            X = bitmap;
            Bitmap bitmap2 = X;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Y = new BitmapShader(bitmap2, tileMode, tileMode);
            if (Z == null) {
                Z = new Matrix();
            }
        }
        if (Y != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            gl.i(colorMatrix, 2.5f);
            gl.l2(colorMatrix, 0.75f);
            d2.setShader(Y);
            d2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            d2.setAlpha(64);
            return;
        }
        Paint paint = d2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        d2.setColorFilter(null);
        d2.setShader(null);
    }

    public static ff0 g0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean g1(wjb wjbVar) {
        if (wjbVar != null) {
            return wjbVar.e();
        }
        return gba.D0;
    }

    public static void h() {
        Drawable drawable = d0;
        if (drawable != null) {
            i(drawable);
        }
    }

    public static ff0 h0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static boolean h1() {
        return I.o();
    }

    public static void i(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        Bitmap bitmap;
        if (e2 == null) {
            return;
        }
        W = b0;
        a0 = c0;
        boolean z11 = gba.D0;
        int i17 = bd;
        int i18 = 0;
        if (z11) {
            int w02 = w0(null, ta, false);
            int w03 = w0(null, Da, false);
            i11 = bm2.k(w03, w02);
            i12 = bm2.k(bm2.o(w03, Math.min(255, Color.alpha(w03) << 1)), w02);
            W = i11;
            a0 = i12;
        } else {
            int indexOfKey = km.indexOfKey(i17);
            if (indexOfKey >= 0) {
                i10 = km.valueAt(indexOfKey);
            } else {
                i10 = W;
            }
            i11 = i10;
            int indexOfKey2 = km.indexOfKey(cd);
            if (indexOfKey2 >= 0) {
                i12 = km.valueAt(indexOfKey2);
            } else {
                i12 = a0;
            }
        }
        if (!z11 && ((((z10 = drawable instanceof ye7)) || (drawable instanceof BitmapDrawable)) && gba.o() != 0 && e66.e(32))) {
            if (z10) {
                bitmap = ((ye7) drawable).k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = zm;
                    if (weakReference != null && weakReference.get() == drawable) {
                        bitmap = Am;
                    } else {
                        WeakReference weakReference2 = zm;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        zm = null;
                        if (drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                            zm = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            gl.l2(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            Am = createBitmap;
                            bitmap = createBitmap;
                        } else {
                            Am = null;
                        }
                    }
                }
                bitmap = null;
            }
            if (X != bitmap) {
                X = bitmap;
                Bitmap bitmap2 = X;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Y = new BitmapShader(bitmap2, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    Y.setFilterMode(2);
                }
                if (Z == null) {
                    Z = new Matrix();
                }
            }
            A1(-1, X3);
            A1(-1, G3);
            A1(-1, H3);
            A1(-1, I3);
            A1(-1, J3);
            r2.setColor(-1);
            s2.setColor(-1);
            t2.setColor(-1);
            r2.linkColor = -1;
            u2.setColor(-1);
            P2.setColor(-1);
            A1(-1, B4);
            A1(-1, p4);
            A1(-1, q4);
            A1(-1, t4);
            A1(-1, w4);
            A1(-1, x4);
            A1(-1, z4);
            A1(-1, y4);
            A1(-1, u4);
        } else {
            X = null;
            Y = null;
            if (z11) {
                i15 = Ea;
                i13 = Fa;
                i14 = i15;
            } else {
                int i19 = Yc;
                int i20 = Zc;
                i13 = ad;
                i14 = i19;
                i15 = i20;
            }
            B1(i14, X3);
            B1(i14, G3);
            B1(i14, H3);
            B1(i14, I3);
            B1(i14, J3);
            r2.setColor(w0(null, i14, false));
            s2.setColor(w0(null, i14, false));
            t2.setColor(w0(null, i14, false));
            r2.linkColor = w0(null, i15, false);
            u2.setColor(w0(null, i14, false));
            B1(i13, B4);
            B1(i13, p4);
            B1(i13, q4);
            B1(i13, t4);
            B1(i13, w4);
            B1(i13, x4);
            B1(i13, z4);
            B1(i13, y4);
            B1(i13, u4);
            TextPaint textPaint = P2;
            if (z11) {
                i16 = Ga;
            } else {
                i16 = Dd;
            }
            textPaint.setColor(w0(null, i16, false));
            Drawable drawable2 = r4;
            if (z11) {
                B1(i13, drawable2);
                B1(i13, s4);
            } else {
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                }
                Drawable drawable3 = s4;
                if (drawable3 != null) {
                    drawable3.setColorFilter(null);
                }
            }
        }
        e2.setColor(i11);
        f2.setColor(i12);
        if (Y != null && (km.indexOfKey(i17) < 0 || (drawable instanceof ye7) || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (drawable instanceof ye7) {
                float f14 = -0.06f;
                if (((ye7) drawable).q >= 0.0f) {
                    colorMatrix2.setSaturation(1.6f);
                    if (I.o()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    gl.l2(colorMatrix2, f13);
                    if (I.o()) {
                        f14 = 0.12f;
                    }
                    gl.h(colorMatrix2, f14);
                } else {
                    colorMatrix2.setSaturation(1.1f);
                    if (I.o()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    gl.l2(colorMatrix2, f12);
                    if (I.o()) {
                        f14 = 0.08f;
                    }
                    gl.h(colorMatrix2, f14);
                }
            } else {
                colorMatrix2.setSaturation(1.6f);
                if (I.o()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                gl.l2(colorMatrix2, f10);
                if (I.o()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                gl.h(colorMatrix2, f11);
            }
            e2.setFilterBitmap(true);
            e2.setShader(Y);
            e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            e2.setAlpha(255);
            f2.setFilterBitmap(true);
            f2.setShader(Y);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            gl.i(colorMatrix3, 0.26f);
            h1();
            gl.l2(colorMatrix3, 0.92f);
            f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f2.setAlpha(255);
            g2.setAlpha(0);
            return;
        }
        e2.setColorFilter(null);
        e2.setShader(null);
        f2.setColorFilter(null);
        f2.setShader(null);
        Paint paint = g2;
        if (!z11) {
            i18 = 21;
        }
        paint.setAlpha(i18);
    }

    public static ff0 i0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        float f10 = i10;
        float f11 = i11;
        float f12 = i12;
        float f13 = i13;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setPadding(0, 0, 0, 0);
        shapeDrawable.getPaint().setColor(i14);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(i16);
        shapeDrawable2.setPadding(0, 0, 0, 0);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i15}), shapeDrawable, shapeDrawable2);
    }

    public static boolean i1() {
        return !I.o();
    }

    public static void j(boolean z10, boolean z11) {
        if (n2 != null && l3 != null && !z10) {
            J2.setColor(w0(null, zd, false));
            I2.setColor(w0(null, yd, false));
            P2.setColor(w0(null, Dd, false));
            T1.setColor(w0(null, Be, false));
            U1.setColor(w0(null, Cc, false));
            V1.setColor(w0(null, Ce, false));
            a2.setColor(w0(null, vd, false));
            Paint paint = b2;
            int i10 = oa;
            paint.setColor(w0(null, i10, false));
            c2.setColor(w0(null, i10, false));
            TextPaint textPaint = r2;
            int i11 = Yc;
            textPaint.setColor(w0(null, i11, false));
            s2.setColor(w0(null, i11, false));
            t2.setColor(w0(null, i11, false));
            r2.linkColor = w0(null, Zc, false);
            u2.setColor(w0(null, i11, false));
            e3.setColor(w0(null, F6, false));
            Paint paint2 = i2;
            int i12 = Ie;
            paint2.setColor(w0(null, i12, false));
            h2.setColor(w0(null, md, false));
            B1(ae, g3);
            m17 m17Var = l3;
            int i13 = qa;
            B1(i13, m17Var);
            m17 m17Var2 = m3;
            int i14 = Tc;
            B1(i14, m17Var2);
            B1(i13, p3);
            B1(i14, q3);
            B1(zb, x3);
            B1(Ab, y3);
            Drawable drawable = z3;
            int i15 = Bb;
            B1(i15, drawable);
            Drawable drawable2 = A3;
            int i16 = Cb;
            B1(i16, drawable2);
            B1(i15, B3);
            B1(i16, C3);
            Drawable drawable3 = E3;
            int i17 = id;
            B1(i17, drawable3);
            B1(i17, F3);
            B1(i11, G3);
            B1(i11, H3);
            B1(i11, I3);
            B1(i11, J3);
            B1(i11, K3);
            Drawable drawable4 = p4;
            int i18 = ad;
            B1(i18, drawable4);
            B1(i18, q4);
            B1(i18, t4);
            B1(i18, w4);
            B1(i18, x4);
            Drawable drawable5 = z4;
            int i19 = fd;
            B1(i19, drawable5);
            B1(i18, y4);
            B1(i18, u4);
            Drawable drawable6 = L3;
            int i20 = nd;
            B1(i20, drawable6);
            Drawable drawable7 = M3;
            int i21 = od;
            B1(i21, drawable7);
            Drawable drawable8 = N3;
            int i22 = Hb;
            B1(i22, drawable8);
            Drawable drawable9 = O3;
            int i23 = Ib;
            B1(i23, drawable9);
            B1(i20, P3);
            B1(i21, Q3);
            B1(i22, R3);
            B1(i23, S3);
            B1(i20, T3);
            B1(i21, U3);
            B1(i22, V3);
            B1(i23, W3);
            Drawable drawable10 = Y3;
            int i24 = pd;
            B1(i24, drawable10);
            B1(i11, X3);
            B1(i24, Z3);
            B1(i24, a4);
            B1(qd, b4);
            B1(rd, c4);
            B1(Jb, d4);
            B1(Kb, e4);
            B1(sd, f4);
            Drawable drawable11 = h4;
            int i25 = Lb;
            B1(i25, drawable11);
            Drawable drawable12 = g4;
            int i26 = td;
            B1(i26, drawable12);
            B1(wd, i4);
            B1(ed, j4);
            B1(i19, k4);
            Drawable drawable13 = l4;
            int i27 = xf;
            B1(i27, drawable13);
            B1(i27, m4);
            B1(i27, n4);
            B1(i26, A4);
            B1(i18, B4);
            B1(i26, C4);
            Drawable drawable14 = D4;
            int i28 = sf;
            B1(i28, drawable14);
            B1(i28, E4);
            for (int i29 = 0; i29 < 2; i29++) {
                B1(i26, F4[i29]);
                B1(ud, G4[i29]);
                B1(i25, H4[i29]);
                B1(Mb, I4[i29]);
            }
            B1(yb, N4);
            Drawable drawable15 = O4;
            int i30 = q7;
            B1(i30, drawable15);
            B1(pa, P4);
            B1(i30, U4);
            Drawable drawable16 = V4;
            int i31 = tj;
            B1(i31, drawable16);
            B1(i30, W4);
            B1(i31, X4);
            int i32 = 0;
            while (true) {
                bya[] byaVarArr = t3;
                if (i32 >= byaVarArr.length) {
                    break;
                }
                B1(o9, byaVarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = T4;
                z1(drawableArr[i33][0], w0(null, Ye, false), false);
                z1(drawableArr[i33][0], w0(null, kd, false), true);
                z1(drawableArr[i33][1], w0(null, Ze, false), false);
                z1(drawableArr[i33][1], w0(null, ld, false), true);
            }
            Drawable[] drawableArr2 = S4;
            z1(drawableArr2[0], w0(null, hf, false), false);
            z1(drawableArr2[0], w0(null, jf, false), true);
            z1(drawableArr2[1], w0(null, Gc, false), false);
            z1(drawableArr2[1], w0(null, Hc, false), true);
            Drawable[] drawableArr3 = R4;
            A1(w0(null, gf, false), drawableArr3[0]);
            A1(w0(null, Fc, false), drawableArr3[1]);
            Drawable[] drawableArr4 = L4;
            A1(w0(null, Ad, false), drawableArr4[0]);
            A1(w0(null, Nb, false), drawableArr4[1]);
            Drawable[] drawableArr5 = M4;
            A1(w0(null, i20, false), drawableArr5[0]);
            A1(w0(null, i22, false), drawableArr5[1]);
            B1(Je, h3);
            B1(i12, i3);
            int i34 = -1;
            if (w0(null, pc, false) == -1) {
                i34 = w0(null, qb, false);
            }
            A1(i34, J4[1]);
            A1(i34, K4[1]);
            A1(w0(null, ca, false), Q4);
            if (!z11 && !b) {
                h();
                g(d0);
            } else if (gba.D0 && !b) {
                h();
            }
        }
    }

    public static boolean j0(akb akbVar, zjb zjbVar, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (zjbVar == null || akbVar == null || akbVar.c0 == null) {
            return false;
        }
        int i10 = zjbVar.a;
        if (i10 == akbVar.Z) {
            z11 = true;
        } else {
            z11 = false;
        }
        akbVar.b0.remove(i10);
        akbVar.c0.remove(zjbVar);
        TLRPC.TL_theme tL_theme = zjbVar.r;
        if (tL_theme != null) {
            akbVar.d0.remove(tL_theme.id);
        }
        vjb vjbVar = zjbVar.y;
        if (vjbVar != null) {
            vjbVar.a();
        }
        if (z11) {
            akbVar.u(((zjb) akbVar.c0.get(0)).a);
        }
        if (z10) {
            x1(akbVar, true, false, false, false, false);
            if (zjbVar.r != null) {
                na7 q12 = na7.q1(zjbVar.t);
                if (z11 && akbVar == J) {
                    z12 = true;
                }
                q12.A4(akbVar, zjbVar, z12, true);
            }
        }
        return z11;
    }

    public static boolean j1(zjb zjbVar) {
        akb akbVar = zjbVar.b;
        if (akbVar != null) {
            if (akbVar.k().equals("Blue") && zjbVar.a == 99) {
                return true;
            }
            if (zjbVar.b.k().equals("Day") && zjbVar.a == 9) {
                return true;
            }
            if ((zjbVar.b.k().equals("Night") || zjbVar.b.k().equals("Dark Blue")) && zjbVar.a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void k() {
        Paint paint = j0;
        if (paint == null) {
            return;
        }
        paint.setColor(w0(null, c7, false));
        l0.setColor(w0(null, J6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = q0;
            int length = drawableArr.length;
            int i11 = I7;
            if (i10 < length) {
                B1(i11, drawableArr[i10]);
                i10++;
            } else {
                oy8 oy8Var = t1;
                oy8Var.a0 = true;
                int i12 = L7;
                oy8Var.L(w0(null, i12, true), "Arrow1");
                t1.L(w0(null, i12, true), "Arrow2");
                t1.L(w0(null, i11, true), "Box2");
                t1.L(w0(null, i11, true), "Box1");
                t1.j();
                B1 = false;
                t1.E(true);
                oy8 oy8Var2 = w1;
                oy8Var2.a0 = true;
                int i13 = d9;
                oy8Var2.L(w0(null, i13, true), "Arrow");
                w1.L(w0(null, i13, true), "Line");
                w1.j();
                oy8 oy8Var3 = x1;
                oy8Var3.a0 = true;
                oy8Var3.L(w0(null, i13, true), "Arrow");
                x1.L(w0(null, i13, true), "Line");
                x1.j();
                oy8 oy8Var4 = y1;
                oy8Var4.a0 = true;
                int i14 = b9;
                oy8Var4.L(w0(null, i14, true), "Line 1");
                y1.L(w0(null, i14, true), "Line 2");
                y1.L(w0(null, i14, true), "Line 3");
                y1.L(w0(null, i13, true), "Cup Red");
                y1.L(w0(null, i13, true), "Box");
                y1.j();
                A1 = false;
                oy8 oy8Var5 = u1;
                oy8Var5.a0 = true;
                oy8Var5.L(w0(null, i14, true), "Arrow");
                u1.L(w0(null, i13, true), "Box2");
                u1.L(w0(null, i13, true), "Box1");
                u1.j();
                z1 = false;
                oy8 oy8Var6 = v1;
                oy8Var6.a0 = true;
                oy8Var6.L(w0(null, i13, true), "Arrow1");
                v1.L(w0(null, c9, true), "Arrow2");
                v1.L(w0(null, i13, true), "Box2");
                v1.L(w0(null, i13, true), "Box1");
                v1.j();
                int w02 = w0(null, F6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u3 = new PorterDuffColorFilter(w02, mode);
                v3 = new PorterDuffColorFilter(w0(null, Vc, false), mode);
                nh8.d().b();
                return;
            }
        }
    }

    public static akb k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            akb akbVar = new akb();
            akbVar.a = str;
            akbVar.G = tL_theme;
            akbVar.b = file.getAbsolutePath();
            akbVar.F = y6c.t0;
            String[] strArr = new String[1];
            G(R0(new File(akbVar.b), null, strArr), akbVar);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                akbVar.c = sqc.d(str2).getAbsolutePath();
                Uri parse = Uri.parse(str2);
                akbVar.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            akbVar.h = true;
                        } else if ("motion".equals(split[i10])) {
                            akbVar.n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            akbVar.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && gl.Q1(queryParameter3.charAt(6))) {
                                akbVar.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && gl.Q1(queryParameter3.charAt(13))) {
                                akbVar.w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && gl.Q1(queryParameter3.charAt(20))) {
                                akbVar.x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            akbVar.y = Utilities.z(queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        akbVar.E = Utilities.z(queryParameter2).intValue();
                    }
                    if (akbVar.E == 0) {
                        akbVar.E = 50;
                    }
                }
                return akbVar;
            }
            g0 = null;
            return akbVar;
        } catch (Exception e10) {
            fa4.g(e10, true);
            return null;
        }
    }

    public static void k1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (!zArr[i10]) {
            if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && y6c.h(i10).o()) {
                zArr[i10] = true;
                TL_account.getThemes getthemes = new TL_account.getThemes();
                getthemes.format = "android";
                if (!hq6.d0(i10).B0.isEmpty()) {
                    getthemes.hash = E[i10];
                }
                if (w01.a) {
                    Log.i("theme", "loading remote themes, hash " + getthemes.hash);
                }
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new vv0(i10, (byte) 3));
            }
        }
    }

    public static void l(boolean z10) {
        akb akbVar;
        if (M == null) {
            if (z10) {
                akb akbVar2 = I;
                akb akbVar3 = J;
                if (akbVar2 != akbVar3) {
                    if (akbVar2 == null || (akbVar3 != null && akbVar2.o() != J.o())) {
                        R = true;
                        i = SystemClock.elapsedRealtime();
                        Q = true;
                        I1(J, true, -1, null);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            akb akbVar4 = K;
            if (akbVar4 != null && akbVar4.o() && o != 0 && (akbVar = L) != null) {
                akbVar4 = akbVar;
            }
            akb akbVar5 = I;
            if (akbVar5 != akbVar4) {
                if (akbVar5 == null || (akbVar4 != null && akbVar5.o() != akbVar4.o())) {
                    R = false;
                    i = SystemClock.elapsedRealtime();
                    Q = true;
                    I1(akbVar4, true, -1, null);
                    Q = false;
                }
            }
        }
    }

    public static Paint l0(int i10) {
        Paint paint = Em;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static Bitmap l1(FileInputStream fileInputStream, int i10) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            long j10 = i10;
            fileInputStream.getChannel().position(j10);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                Point point = gl.q;
                long j11 = (point.x << 1) * point.y;
                int i11 = 1;
                while ((options.outWidth / i11) * (options.outHeight / i11) > j11) {
                    i11 <<= 1;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = i11;
                fileInputStream.getChannel().position(j10);
                return BitmapFactory.decodeStream(fileInputStream, null, options);
            }
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            return null;
        } catch (Throwable th2) {
            try {
                fa4.g(th2, true);
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return null;
            } finally {
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
            }
        }
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33f), a);
    }

    public static Bitmap m0(String str, TLRPC.Document document, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ng5 c10 = ng5.c(str);
        mqc d10 = zqc.d(str);
        if (d10 == null && document != null) {
            ba4.G(y6c.t0);
            File J10 = ba4.J(document, null, true, true);
            if (J10.exists()) {
                d10 = zqc.e(c10, new c4b(J10, (byte) 2));
            }
        }
        if (d10 != null) {
            return d10.a;
        }
        int i10 = y6c.t0;
        kjb kjbVar = new kjb(z10, str, (byte) 1);
        do3 do3Var = xqc.e;
        gl.c3(new clc(i10, str, kjbVar));
        return null;
    }

    public static void m1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.m1(boolean):void");
    }

    public static void n() {
        if (A0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = o9;
            int i12 = f9;
            int i13 = Y8;
            int i14 = W8;
            if (i10 < 2) {
                A0[i10].setColor(w0(null, i14, false));
                B0[i10].setColor(w0(null, i13, false));
                TextPaint textPaint = E0[i10];
                int w02 = w0(null, i12, false);
                textPaint.linkColor = w02;
                textPaint.setColor(w02);
                G0[i10].setColor(w0(null, i11, false));
                i10++;
            } else {
                C0.setColor(w0(null, i14, false));
                D0.setColor(w0(null, i13, false));
                TextPaint textPaint2 = F0;
                int w03 = w0(null, l9, false);
                textPaint2.linkColor = w03;
                textPaint2.setColor(w03);
                t0.setColor(w0(null, s9, false));
                u0.setColor(w0(null, r9, false));
                H0.setColor(w0(null, p9, false));
                I0.setColor(w0(null, q9, false));
                TextPaint textPaint3 = J0;
                int i15 = Yl;
                textPaint3.setColor(w0(null, i15, false));
                TextPaint textPaint4 = K0;
                int i16 = V8;
                textPaint4.setColor(w0(null, i16, false));
                L0.setColor(w0(null, i16, false));
                TextPaint textPaint5 = M0;
                int i17 = e9;
                textPaint5.setColor(w0(null, i17, false));
                N0.setColor(w0(null, i17, false));
                Paint paint = v0;
                int i18 = T8;
                paint.setColor(w0(null, i18, false));
                Paint paint2 = x0;
                int i19 = U8;
                paint2.setColor(w0(null, i19, false));
                y0.setColor(w0(null, i11, false));
                w0.setColor(w0(null, w9, false));
                O0.setColor(w0(null, o6, false));
                P0.setColor(w0(null, z6, false));
                B1(Z8, Z0);
                Drawable drawable = a1;
                int i20 = a9;
                B1(i20, drawable);
                B1(t9, S0);
                B1(F6, R0);
                Drawable drawable2 = U0;
                int i21 = u9;
                B1(i21, drawable2);
                B1(i21, V0);
                B1(v9, W0);
                B1(x9, X0);
                B1(i20, i1);
                B1(i20, j1);
                B1(i15, k1);
                B1(i20, Y0);
                Drawable drawable3 = b1;
                int i22 = A9;
                B1(i22, drawable3);
                B1(i22, c1);
                B1(i22, d1);
                B1(i18, l1);
                B1(Y5, m1);
                B1(pk, n1);
                B1(i19, o1);
                B1(i19, p1);
                B1(i19, q1);
                B1(i12, s1);
                B1(y9, e1);
                B1(z9, h1);
                B1(z8, r1);
                gq9 gq9Var = f1;
                int i23 = i9;
                B1(i23, gq9Var);
                B1(i23, g1);
                return;
            }
        }
    }

    public static ColorFilter n0(wjb wjbVar) {
        if (wjbVar != null) {
            return wjbVar.c();
        }
        return u3;
    }

    public static Drawable n1(vjb vjbVar, String str, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        gl2 H10 = H(I, vjbVar, km, str, g0, f0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) H10.d;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = h0;
        }
        h0 = z12;
        Boolean bool2 = (Boolean) H10.e;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = i0;
        }
        i0 = z13;
        Boolean bool3 = (Boolean) H10.f;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = V;
        }
        V = z14;
        Drawable drawable2 = (Drawable) H10.b;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = d0;
        }
        d0 = drawable;
        int[] q10 = gl.q(drawable2);
        int i11 = q10[0];
        b0 = i11;
        W = i11;
        int i12 = q10[1];
        c0 = i12;
        a0 = i12;
        h();
        return drawable2;
    }

    public static void o() {
        akb akbVar;
        akb akbVar2 = M;
        if (akbVar2 == null) {
            return;
        }
        O = false;
        if (R && (akbVar = J) != null) {
            t(akbVar, true, true);
        } else if (!P) {
            t(akbVar2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static n40 o0(k27 k27Var) {
        HashMap hashMap = d5;
        if (hashMap != null && k27Var != null) {
            return (n40) hashMap.get(k27Var);
        }
        return null;
    }

    public static void o1(int i10, int i11, int... iArr) {
        for (int i12 : iArr) {
            Bm[i12] = (i10 << 16) | i11;
        }
    }

    public static void p() {
        if (P1 == null) {
            return;
        }
        O1.setColor(w0(null, F6, false));
        O1.linkColor = w0(null, I6, false);
        B1(pi, P1);
        B1(qi, Q1);
    }

    public static File p0(String str) {
        long j10;
        File file = new File(a.h(), str);
        try {
            InputStream open = a.b.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            fa4.g(e10, true);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = a.b.getAssets().open(str);
                Typeface typeface = gl.a;
                gl.D(open2, new FileOutputStream(file));
                open2.close();
            } catch (Exception e11) {
                fa4.g(e11, true);
            }
        }
        return file;
    }

    public static int p1(float f10, int i10) {
        if (f10 == 1.0f) {
            return i10;
        }
        return bm2.o(i10, moe.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(X, Y, Z, i10, i11, f10, f11);
    }

    public static String q0(TLRPC.ThemeSettings themeSettings) {
        if (themeSettings == null) {
            return null;
        }
        TLRPC.BaseTheme baseTheme = themeSettings.base_theme;
        if (baseTheme instanceof TLRPC.TL_baseThemeClassic) {
            return "Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeDay) {
            return "Day";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeTinted) {
            return "Dark Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeArctic) {
            return "Arctic Blue";
        }
        if (!(baseTheme instanceof TLRPC.TL_baseThemeNight)) {
            return null;
        }
        return "Night";
    }

    public static int q1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.q1():int");
    }

    public static void r(Bitmap bitmap, BitmapShader bitmapShader, Matrix matrix, int i10, int i11, float f10, float f11) {
        if (bitmapShader != null && matrix != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f12 = i10;
            float f13 = i11;
            float max = Math.max(f12 / width, f13 / height);
            matrix.reset();
            matrix.setTranslate(((f12 - (width * max)) / 2.0f) - f10, ((f13 - (height * max)) / 2.0f) - f11);
            matrix.preScale(max, max);
            bitmapShader.setLocalMatrix(matrix);
        }
    }

    public static Drawable r0() {
        Drawable s02 = s0();
        if (s02 == null && d != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Utilities.i.c(new wm3(countDownLatch, (byte) 1));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                fa4.g(e10, true);
            }
            return s0();
        }
        return s02;
    }

    public static void r1(boolean z10, boolean z11) {
        boolean z12;
        SparseIntArray clone = jm.clone();
        zjb i10 = I.i(false);
        if (i10 != null) {
            z12 = i10.d(jm, clone);
        } else {
            z12 = true;
        }
        f(jm, clone, I.o());
        e(jm, clone, I.o());
        mm = z12;
        km = clone;
        if (!z11) {
            s1(!(LaunchActivity.Q() instanceof mu1));
        }
        k();
        n();
        p();
        j(false, z10);
        gl.c3(new yf4((byte) 3, !O));
    }

    public static void s(View view, View view2, wjb wjbVar) {
        if (view != null && view2 != null) {
            int[] iArr = ym;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof gmb) {
                Bitmap bitmap = X;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / X.getHeight()) * width)) / 2.0f) - ((gmb) view2).J) + i10);
                } else {
                    i10 = (int) (i10 + (-((gmb) view2).J));
                }
                i11 = (int) (i11 + (-((gmb) view2).K));
            }
            if (wjbVar != null) {
                wjbVar.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable drawable = e0;
        if (drawable != null) {
            return drawable;
        }
        return d0;
    }

    public static void s1(boolean z10) {
        Drawable drawable = d0;
        if (drawable instanceof ye7) {
            S = ((ye7) drawable).i;
        } else {
            S = 0;
        }
        d0 = null;
        e0 = null;
        m1(z10);
    }

    public static void t(akb akbVar, boolean z10, boolean z11) {
        SparseIntArray R02;
        String[] split;
        boolean z12;
        if (akbVar != null) {
            vm++;
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            try {
                if (akbVar.b == null && akbVar.d == null) {
                    if (!z11 && z10) {
                        SharedPreferences.Editor edit = na7.c1().edit();
                        edit.remove("theme");
                        edit.commit();
                    }
                    jm.clear();
                    f0 = 0;
                    g0 = null;
                    d0 = null;
                    e0 = null;
                } else {
                    if (!z11 && z10) {
                        SharedPreferences.Editor edit2 = na7.c1().edit();
                        edit2.putString("theme", akbVar.k());
                        edit2.apply();
                    }
                    String[] strArr = new String[1];
                    String str = akbVar.d;
                    if (str != null) {
                        R02 = R0(null, str, null);
                        jm = R02;
                    } else {
                        R02 = R0(new File(akbVar.b), null, strArr);
                        jm = R02;
                    }
                    f0 = R02.get(f5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        String str2 = strArr[0];
                        g0 = str2;
                        String absolutePath = sqc.d(str2).getAbsolutePath();
                        try {
                            String str3 = akbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        akbVar.c = absolutePath;
                        Uri parse = Uri.parse(g0);
                        akbVar.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i10 = 0; i10 < split.length; i10++) {
                                if ("blur".equals(split[i10])) {
                                    akbVar.h = true;
                                } else if ("motion".equals(split[i10])) {
                                    akbVar.n = true;
                                }
                            }
                        }
                        Utilities.z(parse.getQueryParameter("intensity"));
                        akbVar.y = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                akbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && gl.Q1(queryParameter2.charAt(6))) {
                                    akbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && gl.Q1(queryParameter2.charAt(13))) {
                                    akbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && gl.Q1(queryParameter2.charAt(20))) {
                                    akbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                akbVar.y = Utilities.z(queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (akbVar.c != null) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        akbVar.c = null;
                        g0 = null;
                    }
                }
                if (!z11 && M == null) {
                    K = akbVar;
                    if (I == J) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        T = 2000;
                        U = SystemClock.elapsedRealtime();
                        gl.d3(new am6((byte) 2), 2100L);
                    }
                }
                I = akbVar;
                r1(false, false);
            } catch (Exception e10) {
                fa4.g(e10, true);
            }
            float f10 = xk0.m1;
            xk0.o1 = 1.0f - (Color.alpha(w0(null, ng, true)) / 255.0f);
            if (M == null && z10 && !Q) {
                na7.q1(akbVar.F).A4(akbVar, akbVar.i(false), z11, false);
            }
        }
    }

    public static bya t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        bya[] byaVarArr = t3;
        bya byaVar = byaVarArr[i10];
        if (byaVar != null) {
            return byaVar;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                byaVarArr[5] = new pg2();
                            }
                        } else {
                            byaVarArr[4] = new oj9(true);
                        }
                    } else {
                        byaVarArr[3] = new bd8(null, true);
                    }
                } else {
                    byaVarArr[2] = new m4a(true);
                }
            } else {
                byaVarArr[1] = new pg2(true);
            }
        } else {
            byaVarArr[0] = new a4c(true);
        }
        bya byaVar2 = byaVarArr[i10];
        byaVar2.d();
        byaVar2.b(w0(null, o9, false));
        return byaVar2;
    }

    public static void t1(boolean z10) {
        if (z10) {
            P = false;
            s1(true);
            return;
        }
        I.v(null);
    }

    public static akb u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                kk7.e().k(kk7.w4, new Object[0]);
                akb akbVar = new akb();
                akbVar.a = str;
                akbVar.G = tL_theme;
                akbVar.b = file.getAbsolutePath();
                akbVar.F = y6c.t0;
                M = B0();
                O = true;
                P = false;
                t(akbVar, false, false);
                return akbVar;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.id;
                file2 = new File(a.h(), str2.concat(".attheme"));
            } else {
                file2 = new File(a.h(), str);
                str2 = str;
            }
            if (!gl.E(file, file2)) {
                o();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            akb akbVar2 = (akb) hashMap.get(str2);
            if (akbVar2 == null) {
                akbVar2 = new akb();
                akbVar2.a = str;
                akbVar2.F = y6c.t0;
                ArrayList arrayList = F;
                arrayList.add(akbVar2);
                G.add(akbVar2);
                Collections.sort(arrayList, new pva((byte) 2));
            } else {
                hashMap.remove(str2);
            }
            akbVar2.G = tL_theme;
            akbVar2.b = file2.getAbsolutePath();
            hashMap.put(akbVar2.k(), akbVar2);
            w1(true, false);
            t(akbVar2, true, false);
            return akbVar2;
        } catch (Exception e10) {
            fa4.g(e10, true);
            return null;
        }
    }

    public static int u0(int i10) {
        return w0(null, i10, false);
    }

    public static void u1() {
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("selectedAutoNightType", o);
        edit.putBoolean("autoNightScheduleByLocation", p);
        edit.putFloat("autoNightBrighnessThreshold", q);
        edit.putInt("autoNightDayStartTime", r);
        edit.putInt("autoNightDayEndTime", s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", w);
        edit.putInt("autoNightSunsetTime", t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(y));
        edit.putInt("autoNightLastSunCheckDay", u);
        akb akbVar = J;
        if (akbVar != null) {
            edit.putString("nighttheme", akbVar.k());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static int v(int i10, int i11) {
        float alpha = Color.alpha(i11) / 255.0f;
        float alpha2 = Color.alpha(i10) / 255.0f;
        float f10 = 1.0f - alpha;
        float f11 = (alpha2 * f10) + alpha;
        if (f11 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f11), (int) ((((Color.red(i10) * alpha2) * f10) + (Color.red(i11) * alpha)) / f11), (int) ((((Color.green(i10) * alpha2) * f10) + (Color.green(i11) * alpha)) / f11), (int) ((((Color.blue(i10) * alpha2) * f10) + (Color.blue(i11) * alpha)) / f11));
    }

    public static int v0(int i10, wjb wjbVar) {
        Integer y02;
        if (wjbVar != null) {
            if (wjbVar.e() && (y02 = y0(i10, wjbVar)) != null) {
                return y02.intValue();
            }
            return wjbVar.h(i10);
        }
        return w0(null, i10, false);
    }

    public static void v1(defpackage.akb r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.v1(akb, boolean, boolean, boolean):void");
    }

    public static int w(int i10, boolean z10, boolean z11) {
        int i11;
        float f10;
        if (z10) {
            if (z11) {
                f10 = 0.22f;
            } else {
                f10 = 0.12f;
            }
            return p1(f10, -1);
        }
        if (z11) {
            i11 = -3813931;
        } else {
            i11 = -1972501;
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (N02[1] > 0.02f) {
            return b(i11, i10);
        }
        return i11;
    }

    public static int w0(boolean[] zArr, int i10, boolean z10) {
        SparseIntArray sparseIntArray;
        int indexOfKey;
        Integer y02;
        if (gba.D0 && (y02 = y0(i10, null)) != null) {
            return y02.intValue();
        }
        if (!z10 && (sparseIntArray = lm) != null && (indexOfKey = sparseIntArray.indexOfKey(i10)) >= 0) {
            return lm.valueAt(indexOfKey);
        }
        return x0(km, i10, zArr);
    }

    public static void w1(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ArrayList arrayList;
        Integer num;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                akb akbVar = (akb) arrayList2.get(i11);
                akbVar.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", akbVar.a);
                    jSONObject.put("path", akbVar.b);
                    jSONObject.put("account", akbVar.F);
                    TLRPC.TL_theme tL_theme = akbVar.G;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        akbVar.G.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.f(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", akbVar.H);
                } catch (Exception e10) {
                    fa4.g(e10, true);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
                i11++;
            }
            edit.putString("themes2", jSONArray.toString());
        }
        for (int i12 = 0; i12 < 4; i12++) {
            StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
            Object obj = "";
            if (i12 == 0) {
                num = "";
            } else {
                num = Integer.valueOf(i12);
            }
            sb2.append(num);
            edit.putLong(sb2.toString(), E[i12]);
            StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
            if (i12 != 0) {
                obj = Integer.valueOf(i12);
            }
            sb3.append(obj);
            edit.putInt(sb3.toString(), D[i12]);
        }
        edit.putInt("lastLoadingCurrentThemeTime", B);
        edit.commit();
        if (z10) {
            while (i10 < 5) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                str = "Night";
                            } else {
                                str = "Day";
                            }
                        } else {
                            str = "Arctic Blue";
                        }
                    } else {
                        str = "Dark Blue";
                    }
                } else {
                    str = "Blue";
                }
                akb akbVar2 = (akb) H.get(str);
                if (akbVar2 != null && (arrayList = akbVar2.c0) != null && !arrayList.isEmpty()) {
                    z12 = z11;
                    x1(akbVar2, true, false, false, false, z12);
                } else {
                    z12 = z11;
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static int x(boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        float f10;
        if (z10) {
            if (z12) {
                f10 = 0.62f;
            } else {
                f10 = 0.18f;
            }
            return p1(f10, -1);
        }
        if (z12) {
            i11 = -6380376;
        } else {
            i11 = -2565928;
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z11 && N02[1] > 0.02f) {
            return b(i11, i10);
        }
        return i11;
    }

    public static int x0(android.util.SparseIntArray r7, int r8, boolean[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.x0(android.util.SparseIntArray, int, boolean[]):int");
    }

    public static void x1(akb akbVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = akbVar.c0.size();
                int max = Math.max(0, size - akbVar.X);
                SerializedData serializedData = new SerializedData(((max << 4) + 2) << 2);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    zjb zjbVar = (zjb) akbVar.c0.get(i10);
                    int i11 = zjbVar.a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(zjbVar.c);
                        serializedData.writeInt32(zjbVar.d);
                        serializedData.writeInt32(zjbVar.e);
                        serializedData.writeInt32(zjbVar.f);
                        serializedData.writeInt32(zjbVar.g);
                        serializedData.writeInt32(zjbVar.h);
                        serializedData.writeBool(zjbVar.i);
                        serializedData.writeInt64(zjbVar.j);
                        serializedData.writeInt64(zjbVar.k);
                        serializedData.writeInt64(zjbVar.l);
                        serializedData.writeInt64(zjbVar.m);
                        serializedData.writeInt32(zjbVar.n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(zjbVar.p);
                        serializedData.writeBool(zjbVar.q);
                        serializedData.writeString(zjbVar.o);
                        if (zjbVar.r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (zjbVar.r != null) {
                            serializedData.writeInt32(zjbVar.t);
                            zjbVar.r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + akbVar.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    kk7.e().k(kk7.s4, new Object[0]);
                }
                if (z13) {
                    na7.q1(y6c.t0).B4(akbVar, akbVar.i(false));
                }
            }
            edit.putInt("accent_current_" + akbVar.d, akbVar.Z);
            edit.commit();
        } else {
            if (akbVar.a0 != -1) {
                if (z11) {
                    zjb zjbVar2 = (zjb) akbVar.b0.get(akbVar.Z);
                    akbVar.b0.remove(zjbVar2.a);
                    akbVar.c0.remove(zjbVar2);
                    TLRPC.TL_theme tL_theme = zjbVar2.r;
                    if (tL_theme != null) {
                        akbVar.d0.remove(tL_theme.id);
                    }
                }
                akbVar.Z = akbVar.a0;
                zjb i12 = akbVar.i(false);
                if (i12 != null) {
                    akbVar.j0 = i12.y;
                } else {
                    akbVar.j0 = null;
                }
            }
            if (I == akbVar) {
                r1(false, false);
            }
        }
        akbVar.a0 = -1;
    }

    public static int y(int i10, boolean z10, boolean z11) {
        float f10;
        if (z10 && z11) {
            return p1(0.07f, -1);
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z10) {
            N02[2] = Math.min(1.0f, N02[2] + 0.07f);
            if (z11) {
                N02[1] = Math.min(1.0f, N02[1] + 0.02f);
            }
        } else {
            float f11 = N02[2];
            if (z11) {
                f10 = 0.06f;
            } else {
                f10 = 0.03f;
            }
            N02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = N02[1];
                if (f12 > 0.02f) {
                    N02[1] = Math.min(1.0f, f12 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static Integer y0(int i10, wjb wjbVar) {
        int i11;
        if (g1(wjbVar) && i10 >= 0 && i10 < (i11 = e5)) {
            if (Bm == null) {
                Bm = new int[i11];
                o1(2, La, ic, dc, Hb, Ib);
                o1(3, Qa, de, ee, nd, od);
                o1(1, Ma, zb, Ab, Bb, Cb, Db, Eb);
                o1(1, Oa, Qb, Rb);
                o1(1, Pa, Sb, Tb, Ub, Vb);
                o1(1, ab, Lb, Mb, Nb, Ob, Pb, Pc, Xb, Yb, jc, vc, Fc, Jb, Kb, Jd, Wb, ec, fc);
                o1(1, bb, Dc, Ec, Gc, pc, sc);
                o1(1, cb, Fb, Gb, Hc, gc, hc);
                o1(2, db, wc, xc, Ac, Bc, kc, lc);
                o1(2, eb, mc, oc, qc, rc, tc, uc, yc, zc, il, rl);
                o1(2, fb, kl, ml);
                o1(1, Ta, ie, je);
                o1(1, Ua, qe);
                o1(1, Va, oe, pe);
                o1(1, Wa, sk);
                o1(1, Xa, Ic);
                o1(1, Ea, Cd, Hd, Nd, Rd);
            }
            int i12 = Bm[i10];
            if (i12 != 0) {
                int i13 = 65535 & i12;
                int i14 = i12 >> 16;
                int i15 = ta;
                if (i14 != 2) {
                    if (i14 != 3) {
                        return Integer.valueOf(v0(i13, wjbVar));
                    }
                    return Integer.valueOf(bm2.k(v0(i13, wjbVar), v0(i15, wjbVar)));
                }
                return Integer.valueOf(bm2.k(v0(i13, wjbVar), bm2.k(v0(Ka, wjbVar), v0(i15, wjbVar))));
            }
            return null;
        }
        return null;
    }

    public static void y1(int i10, int i11, boolean z10) {
        int i12 = r8;
        int i13 = Z6;
        int i14 = Ge;
        int i15 = Fe;
        int i16 = Ee;
        int i17 = De;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == c6 || i10 == i13 || i10 == i12 || i10 == L8) {
            i11 |= -16777216;
        }
        SparseIntArray sparseIntArray = km;
        if (z10) {
            sparseIntArray.delete(i10);
        } else {
            sparseIntArray.put(i10, i11);
        }
        if (i10 == xd) {
            g(d0);
        } else if (i10 != bd && i10 != cd) {
            if (i10 != i17 && i10 != i16 && i10 != i15 && i10 != i14 && i10 != He) {
                int i18 = kk7.t4;
                if (i10 == i12) {
                    kk7.e().k(i18, new Object[0]);
                    return;
                } else if (i10 == i13 && Build.VERSION.SDK_INT >= 26) {
                    kk7.e().k(i18, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            s1(true);
        } else {
            h();
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        float f10 = 0.14f;
        if (z10 && z11) {
            return p1(0.14f, -1);
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z10) {
            N02[2] = Math.min(1.0f, N02[2] + 0.14f);
            if (z11) {
                N02[1] = Math.min(1.0f, N02[1] + 0.03f);
            }
        } else {
            float f11 = N02[2];
            if (!z11) {
                f10 = 0.12f;
            }
            N02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = N02[1];
                if (f12 > 0.02f) {
                    N02[1] = Math.min(1.0f, f12 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static android.graphics.drawable.Drawable z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.z0():android.graphics.drawable.Drawable");
    }

    public static void z1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof fm2)) {
            return;
        }
        if (z10) {
            drawable2 = ((fm2) drawable).b;
        } else {
            drawable2 = ((fm2) drawable).a;
        }
        if (drawable2 instanceof ColorDrawable) {
            ((ColorDrawable) drawable2).setColor(i10);
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }
}
