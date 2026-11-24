package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;
import org.telegram.ui.p;
public class yv1 extends d implements jm7, hk3, lc6, f42, f02, el4, vq5, g94 {
    public static Pattern Ad = null;
    public static Pattern Bd = null;
    public static Pattern Cd = null;
    public static final int[] Dd = {nm7.x, nm7.y, nm7.z, nm7.A, nm7.Z, nm7.C0, nm7.t0, nm7.W0, nm7.e1, nm7.T1, nm7.F, nm7.s, nm7.U, nm7.E0, nm7.F0, nm7.D4, nm7.i3, nm7.t4, nm7.K};
    public static boolean Ed = false;
    public static final Rect Fd = new Rect();
    public static int xd = 22;
    public static float yd = 1.4f;
    public static int zd = 10;
    public vr1 A0;
    public int A1;
    public hg5 A2;
    public boolean A3;
    public int A4;
    public f47 A5;
    public boolean A6;
    public boolean A7;
    public boolean A8;
    public float A9;
    public yv1 Aa;
    public int Ab;
    public k47 Ac;
    public xr1 B0;
    public int B1;
    public hg5 B2;
    public boolean B3;
    public int B4;
    public f47 B5;
    public int B6;
    public int B7;
    public String B8;
    public VelocityTracker B9;
    public wv1 Ba;
    public boolean Bb;
    public ym1 Bc;
    public yr1 C0;
    public u31 C1;
    public hg5 C2;
    public boolean C3;
    public int C4;
    public k47 C5;
    public int C6;
    public boolean C7;
    public String C8;
    public boolean C9;
    public k02 Ca;
    public boolean Cb;
    public ArrayList Cc;
    public hu1 D0;
    public ys1 D1;
    public hg5 D2;
    public TLRPC.User D3;
    public vp1 D4;
    public nv1 D5;
    public int D6;
    public boolean D7;
    public k47 D8;
    public boolean D9;
    public final bd2 Da;
    public vh6 Db;
    public final lx6 Dc;
    public jr1 E;
    public rs1 E0;
    public js1 E1;
    public rc2 E2;
    public TLRPC.Chat E3;
    public final SparseArray E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public k47 E8;
    public rt1 E9;
    public TLRPC.TL_channels_sendAsPeers Ea;
    public vh6 Eb;
    public final hw1 Ec;
    public final g79 F;
    public boolean F0;
    public hs1 F1;
    public int F2;
    public k39 F3;
    public final ArrayList F4;
    public k47 F5;
    public final ArrayList F6;
    public int F7;
    public int F8;
    public boolean F9;
    public TL_account.resolvedBusinessChatLinks Fa;
    public boolean Fb;
    public boolean Fc;
    public final g79 G;
    public l66 G0;
    public byte G1;
    public int G2;
    public boolean G3;
    public int G4;
    public int G5;
    public final SparseArray[] G6;
    public int G7;
    public boolean G8;
    public float G9;
    public boolean Ga;
    public boolean Gb;
    public boolean Gc;
    public final mr3 H;
    public TextView H0;
    public boolean H1;
    public hg5 H2;
    public boolean H3;
    public boolean H4;
    public k47 H5;
    public final SparseArray H6;
    public boolean H7;
    public boolean H8;
    public fs1 H9;
    public boolean Ha;
    public Paint Hb;
    public boolean Hc;
    public final int I;
    public ey0 I0;
    public te5 I1;
    public hg5 I2;
    public String I3;
    public boolean I4;
    public boolean I5;
    public final SparseArray I6;
    public ho1 I7;
    public String I8;
    public rc2 I9;
    public float Ia;
    public long Ib;
    public long Ic;
    public final nz4 J;
    public RadialProgressView J0;
    public he J1;
    public hg5 J2;
    public String J3;
    public int J4;
    public boolean J5;
    public final HashMap J6;
    public String J7;
    public ps1 J8;
    public uj4 J9;
    public final ct0 Ja;
    public ft1 Jb;
    public boolean Jc;
    public final nz4 K;
    public int K0;
    public hg5 K1;
    public qh2 K2;
    public int K3;
    public final ArrayList K4;
    public boolean K5;
    public final SparseArray K6;
    public boolean K7;
    public rc2 K8;
    public boolean K9;
    public final ct1 Ka;
    public boolean Kb;
    public boolean Kc;
    public km0 L;
    public int L0;
    public hg5 L1;
    public View L2;
    public int L3;
    public final HashMap L4;
    public boolean L5;
    public final vh6 L6;
    public boolean L7;
    public jy L8;
    public boolean L9;
    public int La;
    public boolean Lb;
    public boolean Lc;
    public km0 M;
    public int M0;
    public hg5 M1;
    public lt1 M2;
    public int M3;
    public k47 M4;
    public int M5;
    public final ArrayList M6;
    public int M7;
    public TextureView M8;
    public ValueAnimator M9;
    public int Ma;
    public boolean Mb;
    public boolean Mc;
    public final oz4 N;
    public int N0;
    public hg5 N1;
    public a91 N2;
    public UndoView N3;
    public int N4;
    public boolean N5;
    public final SparseArray N6;
    public int N7;
    public boolean N8;
    public ValueAnimator N9;
    public en1 Na;
    public ArrayList Nb;
    public boolean Nc;
    public km0 O;
    public int O0;
    public hg5 O1;
    public tc8 O2;
    public kt1 O3;
    public int O4;
    public TLRPC.PhotoSize O5;
    public final vh6 O6;
    public int O7;
    public final ho1 O8;
    public boolean O9;
    public boolean Oa;
    public ValueAnimator Ob;
    public boolean Oc;
    public he P;
    public Drawable P0;
    public hg5 P1;
    public boolean P2;
    public u31 P3;
    public final ArrayList P4;
    public TLRPC.PhotoSize P5;
    public final vh6 P6;
    public int P7;
    public final jz4 P8;
    public float P9;
    public boolean Pa;
    public boolean Pb;
    public s20 Pc;
    public boolean Q;
    public Drawable Q0;
    public xt1 Q1;
    public final bf0[] Q2;
    public boolean Q3;
    public en1 Q4;
    public TLObject Q5;
    public final int[] Q6;
    public int Q7;
    public km0 Q8;
    public float Q9;
    public long Qa;
    public Boolean Qb;
    public int Qc;
    public FrameLayout R;
    public Drawable R0;
    public float R1;
    public final xv1[] R2;
    public int R3;
    public boolean R4;
    public int R5;
    public final int[] R6;
    public int R7;
    public Bitmap R8;
    public int R9;
    public int Ra;
    public boolean Rb;
    public TLRPC.DraftMessage Rc;
    public a91 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final lka[] S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public final int[] S6;
    public boolean S7;
    public BitmapShader S8;
    public int S9;
    public int Sa;
    public final int[] Sb;
    public boolean Sc;
    public ps1 T;
    public int T0;
    public vh1 T1;
    public final mv1[] T2;
    public s34 T3;
    public boolean T4;
    public boolean T5;
    public final int[] T6;
    public int T7;
    public Paint T8;
    public float T9;
    public vs1 Ta;
    public rc2 Tb;
    public ValueAnimator Tc;
    public va2 U;
    public final Set U0;
    public boolean U1;
    public NumberTextView U2;
    public boolean U3;
    public byte U4;
    public TLRPC.PhotoSize U5;
    public final boolean[] U6;
    public boolean U7;
    public Matrix U8;
    public float U9;
    public xs1 Ua;
    public rc2 Ub;
    public xq1 Uc;
    public View V;
    public final Set V0;
    public en1 V1;
    public int V2;
    public k47 V3;
    public ArrayList V4;
    public TLRPC.PhotoSize V5;
    public final boolean[] V6;
    public int V7;
    public Paint V8;
    public float V9;
    public boolean Va;
    public int Vb;
    public boolean Vc;
    public FrameLayout W;
    public AnimatorSet W0;
    public ImageView W1;
    public final AnimatorSet[] W2;
    public boolean W3;
    public int W4;
    public TLObject W5;
    public final boolean[] W6;
    public boolean W7;
    public final Paint W8;
    public float W9;
    public float Wa;
    public boolean Wb;
    public int Wc;
    public FrameLayout X;
    public boolean X0;
    public es1 X1;
    public boolean X2;
    public k47 X3;
    public HashMap X4;
    public int X5;
    public boolean X6;
    public boolean X7;
    public float X8;
    public float X9;
    public int Xa;
    public int Xb;
    public int Xc;
    public final psc Y;
    public hg5 Y0;
    public e51 Y1;
    public ImageView Y2;
    public k47 Y3;
    public final SparseArray Y4;
    public TLRPC.WebPage Y5;
    public boolean Y6;
    public boolean Y7;
    public boolean Y8;
    public TLRPC.Document Y9;
    public int Ya;
    public HashMap Yb;
    public int Yc;
    public e02 Z;
    public hg5 Z0;
    public k7 Z1;
    public RadialProgressView Z2;
    public yd Z3;
    public int Z4;
    public ArrayList Z5;
    public boolean Z6;
    public int Z7;
    public View Z8;
    public boolean Z9;
    public mx6 Za;
    public en1 Zb;
    public int Zc;
    public int a;
    public ms1 a0;
    public hg5 a1;
    public TextView a2;
    public ImageView a3;
    public fv a4;
    public final int[] a5;
    public String a6;
    public boolean a7;
    public boolean a8;
    public float a9;
    public boolean aa;
    public ValueAnimator ab;
    public byte ac;
    public int ad;
    public boolean b;
    public ns1 b0;
    public r02 b1;
    public boolean b2;
    public AnimatorSet b3;
    public sc7 b4;
    public int b5;
    public us4 b6;
    public int b7;
    public k47 b8;
    public float b9;
    public long ba;
    public float bb;
    public ad bc;
    public boolean bd;
    public boolean c;
    public yd c0;
    public boolean c1;
    public TextView c2;
    public FrameLayout c3;
    public n02 c4;
    public boolean c5;
    public TLRPC.ChatInvite c6;
    public int c7;
    public k47 c8;
    public Integer c9;
    public int ca;
    public jt1 cb;
    public sm2 cc;
    public long cd;
    public boolean d;
    public int d0;
    public qs1 d1;
    public TextView d2;
    public us1 d3;
    public int d4;
    public int d5;
    public mz d6;
    public long d7;
    public int d8;
    public int d9;
    public int da;
    public final st1 db;
    public he dc;
    public TLRPC.TL_messages_discussionMessage dd;
    public TLRPC.Chat e;
    public p7 e0;
    public zv1 e1;
    public zs1 e2;
    public TextView e3;
    public TL_account.TL_businessChatLink e4;
    public int e5;
    public final LongSparseIntArray e6;
    public boolean e7;
    public boolean e8;
    public boolean e9;
    public int ea;
    public final yt1 eb;
    public int ec;
    public TLRPC.messages_Messages ed;
    public TLRPC.User f;
    public qr2 f0;
    public FrameLayout f1;
    public TextView f2;
    public TextView f3;
    public String f4;
    public boolean f5;
    public boolean f6;
    public long f7;
    public boolean f8;
    public AnimatorSet f9;
    public int fa;
    public ArrayList fb;
    public int fc;
    public boolean fd;
    public q6 g0;
    public LinearLayout g1;
    public mzb g2;
    public ps1 g3;
    public int g4;
    public boolean g5;
    public boolean g6;
    public final ArrayList g7;
    public long g8;
    public m8 g9;
    public boolean ga;
    public final kq1 gb;
    public boolean gc;
    public pv1 gd;
    public TLRPC.EncryptedChat h;
    public p7 h0;
    public ua2 h1;
    public w41 h2;
    public ImageView h3;
    public int h4;
    public AnimatorSet h5;
    public long h6;
    public final Paint h7;
    public String h8;
    public boolean h9;
    public boolean ha;
    public final pq1 hb;
    public boolean hc;
    public iv1 hd;
    public p7 i0;
    public vq1 i1;
    public l66 i2;
    public ImageView i3;
    public boolean i4;
    public final SparseIntArray i5;
    public boolean i6;
    public final Paint i7;
    public Integer i8;
    public int i9;
    public boolean ia;
    public final ir1 ib;
    public boolean ic;
    public kta id;
    public r7 j0;
    public rz8 j1;
    public ImageView j2;
    public io j3;
    public String j4;
    public final SparseIntArray j5;
    public boolean j6;
    public final ColorMatrix j7;
    public byte[] j8;
    public int j9;
    public h22 ja;
    public final jv1 jb;
    public int jc;
    public boolean jd;
    public r7 k0;
    public r51 k1;
    public np0 k2;
    public io k3;
    public byte[] k4;
    public boolean k5;
    public boolean k6;
    public final s34 k7;
    public int k8;
    public a8[] k9;
    public float ka;
    public final ho1 kb;
    public int kc;
    public boolean kd;
    public r7 l0;
    public zgc l1;
    public TextView l2;
    public io l3;
    public String l4;
    public boolean l5;
    public long l6;
    public final m37 l7;
    public int l8;
    public a8 l9;
    public float la;
    public final ho1 lb;
    public int lc;
    public float ld;
    public r7 m0;
    public mu1 m1;
    public gs1 m2;
    public ds1 m3;
    public k47 m4;
    public boolean m5;
    public Long m6;
    public long m7;
    public mz m8;
    public final ks1 m9;
    public vd2 ma;
    public boolean mb;
    public CharacterStyle mc;
    public float md;
    public boolean n;
    public oyb n0;
    public b92 n1;
    public FrameLayout n2;
    public cs1 n3;
    public k47 n4;
    public boolean n5;
    public int n6;
    public int n7;
    public String n8;
    public iu1 n9;
    public Animator na;
    public boolean nb;
    public String nc;
    public final fn0 nd;
    public p7 o0;
    public final ArrayList o1;
    public gs1 o2;
    public cm1 o3;
    public boolean o4;
    public boolean o5;
    public final SparseArray[] o6;
    public int o7;
    public qd2 o8;
    public ss1 o9;
    public boolean oa;
    public long ob;
    public k11 oc;
    public final fn0 od;
    public r7 p0;
    public pr1 p1;
    public FrameLayout p2;
    public short p3;
    public ArrayList p4;
    public boolean p5;
    public final SparseArray[] p6;
    public final Matrix p7;
    public boolean p8;
    public int p9;
    public boolean pa;
    public u00 pb;
    public boolean pc;
    public final fn0 pd;
    public q6 q0;
    public io q1;
    public TextView q2;
    public q q3;
    public k47 q4;
    public long q5;
    public final SparseArray[] q6;
    public LinearGradient q7;
    public boolean q8;
    public int q9;
    public yv1 qa;
    public boolean qb;
    public mz qc;
    public final fn0 qd;
    public long r;
    public boolean r0;
    public fp1 r1;
    public tk4 r2;
    public View r3;
    public TLRPC.TL_forumTopic r4;
    public boolean r5;
    public boolean r6;
    public int r7;
    public TLRPC.ChatFull r8;
    public int r9;
    public float ra;
    public boolean rb;
    public boolean rc;
    public final fn0 rd;
    public final HashMap s;
    public RadialProgressView s0;
    public fdb s1;
    public a1b s2;
    public boolean s3;
    public long s4;
    public boolean s5;
    public int s6;
    public int s7;
    public TLRPC.UserFull s8;
    public boolean s9;
    public AnimatorSet sa;
    public boolean sb;
    public boolean sc;
    public final fn0 sd;
    public p7 t0;
    public p7 t1;
    public hg5 t2;
    public boolean t3;
    public int t4;
    public boolean t5;
    public int t6;
    public final Paint t7;
    public ir8 t8;
    public boolean t9;
    public final us1 ta;
    public boolean tb;
    public final RectF tc;
    public final fn0 td;
    public p7 u0;
    public p7 u1;
    public hg5 u2;
    public boolean u3;
    public TLRPC.Chat u4;
    public k47 u5;
    public int u6;
    public final Matrix u7;
    public zq8 u8;
    public nu1 u9;
    public xz8 ua;
    public boolean ub;
    public he uc;
    public final jif ud;
    public p7 v0;
    public p7 v1;
    public hg5 v2;
    public AnimatorSet v3;
    public boolean v4;
    public k47 v5;
    public int v6;
    public LinearGradient v7;
    public final vh6 v8;
    public View v9;
    public qe2 va;
    public int vb;
    public long vc;
    public lf8 vd;
    public final qr1 w;
    public p7 w0;
    public p7 w1;
    public boolean w2;
    public ValueAnimator w3;
    public boolean w4;
    public f47 w5;
    public int w6;
    public boolean w7;
    public String w8;
    public boolean w9;
    public tw9 wa;
    public int wb;
    public final ho1 wc;
    public final Rect wd;
    public jr1 x;
    public ClippingImageView x0;
    public jd2 x1;
    public hg5 x2;
    public float x3;
    public boolean x4;
    public o47 x5;
    public int x6;
    public boolean x7;
    public long x8;
    public boolean x9;
    public boolean xa;
    public e7a xb;
    public int xc;
    public jr1 y;
    public jlb y0;
    public q02 y1;
    public boolean y2;
    public boolean y3;
    public boolean y4;
    public v67 y5;
    public int y6;
    public byte y7;
    public String y8;
    public boolean y9;
    public if2 ya;
    public boolean yb;
    public boolean yc;
    public nl9 z0;
    public boolean z1;
    public hg5 z2;
    public boolean z3;
    public boolean z4;
    public k47 z5;
    public final ArrayList z6;
    public boolean z7;
    public boolean z8;
    public float z9;
    public wv1 za;
    public int zb;
    public Pattern zc;

    public yv1(Bundle bundle) {
        super(bundle);
        km0 km0Var;
        this.a = 0;
        this.c = false;
        this.d = false;
        this.s = new HashMap();
        this.w = new qr1(this, new en1(this, (byte) 28));
        g79 g79Var = new g79(0, false);
        this.F = g79Var;
        g79 g79Var2 = new g79(0, false);
        this.G = g79Var2;
        this.Y = new psc();
        this.K0 = cmb.Ii;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.o1 = new ArrayList();
        this.Q2 = new bf0[2];
        this.R2 = new xv1[2];
        this.S2 = new lka[2];
        this.T2 = new mv1[2];
        this.W2 = new AnimatorSet[2];
        this.X2 = false;
        this.p3 = (short) 500;
        this.e4 = null;
        this.h4 = -1;
        this.o4 = true;
        this.E4 = new SparseArray();
        this.F4 = new ArrayList();
        this.K4 = new ArrayList();
        this.L4 = new HashMap();
        this.N4 = -1;
        this.O4 = 0;
        this.P4 = new ArrayList(10);
        this.V4 = new ArrayList();
        this.X4 = new HashMap();
        this.Y4 = new SparseArray();
        this.a5 = new int[1];
        this.i5 = new SparseIntArray();
        this.j5 = new SparseIntArray();
        this.r5 = true;
        this.t5 = true;
        this.I5 = true;
        this.L5 = true;
        this.e6 = new LongSparseIntArray();
        this.n6 = 1;
        this.o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.p6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.q6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.z6 = new ArrayList();
        this.A6 = true;
        this.C6 = Integer.MIN_VALUE;
        this.F6 = new ArrayList();
        this.G6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.H6 = new SparseArray();
        this.I6 = new SparseArray();
        this.J6 = new HashMap();
        this.K6 = new SparseArray();
        this.L6 = new vh6();
        this.M6 = new ArrayList();
        this.N6 = new SparseArray();
        this.O6 = new vh6();
        this.P6 = new vh6();
        this.Q6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.R6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.S6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.T6 = new int[2];
        this.U6 = new boolean[2];
        this.V6 = new boolean[2];
        this.W6 = new boolean[]{true, true};
        this.Y6 = true;
        this.Z6 = true;
        this.c7 = 0;
        this.g7 = new ArrayList();
        this.h7 = new Paint(1);
        this.i7 = new Paint(1);
        this.j7 = new ColorMatrix();
        this.k7 = new s34();
        this.l7 = new m37(0, false, false, new fe(this, (byte) 2));
        this.p7 = new Matrix();
        Paint paint = new Paint(1);
        this.t7 = paint;
        this.u7 = new Matrix();
        this.F7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(1.0f));
        this.P7 = Integer.MAX_VALUE;
        this.Q7 = -1;
        this.Y7 = true;
        this.d8 = Integer.MAX_VALUE;
        this.k8 = -1;
        this.l8 = -10000;
        this.v8 = new vh6();
        this.O8 = new ho1(this, (byte) 0);
        jz4 jz4Var = new jz4();
        this.P8 = jz4Var;
        this.Q8 = new km0(jz4Var, jz4Var, jz4Var);
        this.W8 = new Paint(1);
        this.X8 = 0.0f;
        this.a9 = 1.0f;
        this.b9 = 0.0f;
        this.h9 = true;
        this.m9 = new ks1(this);
        this.K9 = true;
        this.ta = new us1(this, (byte) 0);
        this.Da = new bd2(this);
        this.Ja = new ct0(this, (byte) 2);
        this.Ka = new ct1(this);
        this.Ma = -1;
        this.db = new st1(this);
        this.eb = new yt1(this);
        this.gb = new kq1(this);
        this.hb = new pq1(this);
        this.ib = new ir1(this);
        this.jb = new jv1(this);
        this.kb = new ho1(this, (byte) 4);
        this.lb = new ho1(this, (byte) 9);
        this.wb = Integer.MIN_VALUE;
        this.Sb = new int[2];
        this.tc = new RectF();
        this.wc = new ho1(this, (byte) 12);
        this.Dc = new lx6((byte) 10);
        this.Ec = new Object();
        this.Vc = false;
        d53 d53Var = d53.h;
        this.nd = new fn0(0, this, d53Var, 320L, false);
        this.od = new fn0(1, this, d53Var, 520L, false);
        this.pd = new fn0(2, this, d53Var, 520L, false);
        this.qd = new fn0(3, this, d53Var, 320L, false);
        this.rd = new fn0(4, this, d53Var, 320L, false);
        this.sd = new fn0(5, this, d53Var, 320L, false);
        this.td = new fn0(6, this, d53Var, 320L, false);
        this.ud = new jif(new ho1(this, (byte) 14));
        this.wd = new Rect();
        ?? obj = new Object();
        this.N = obj;
        if (Build.VERSION.SDK_INT >= 31 && gda.f()) {
            mr3 mr3Var = new mr3(false);
            this.H = mr3Var;
            this.I = Math.max(0, gm.L(48.0f) - Math.min(gm.n, gm.m));
            nz4 nz4Var = new nz4(obj);
            this.K = nz4Var;
            nz4Var.d = mr3Var;
            nz4Var.e = -3;
            nz4Var.f = obj;
            km0 km0Var2 = new km0(nz4Var, nz4Var, nz4Var);
            this.M = km0Var2;
            km0Var2.k = true;
            if (e86.e(262144)) {
                nz4 nz4Var2 = new nz4(obj);
                this.J = nz4Var2;
                nz4Var2.d = mr3Var;
                nz4Var2.e = -2;
                nz4Var2.f = obj;
                km0Var = new km0(nz4Var2, nz4Var2, nz4Var2);
                this.L = km0Var;
                km0Var.k = true;
            } else {
                this.J = null;
                km0Var = this.M;
                this.L = km0Var;
            }
        } else {
            this.H = null;
            this.I = 0;
            this.J = null;
            this.K = null;
            km0Var = new km0(obj, obj, obj);
            this.L = km0Var;
            this.M = new km0(obj, obj, obj);
        }
        km0 km0Var3 = new km0(obj, obj, obj);
        this.O = km0Var3;
        km0Var3.g = g79Var;
        km0Var.g = g79Var;
        this.M.g = g79Var;
        this.Q8.g = new g79(0, false);
        this.O.f = g79Var2;
        this.L.f = g79Var2;
        this.M.f = g79Var2;
        this.Q8.f = g79Var2;
    }

    public static void E6(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z, boolean z2, boolean z3, boolean z4) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i = 6;
        if (z) {
            menu.add(2131296498, 2131296504, 6, jb6.M0(2131746173, null));
            i = 7;
        }
        if (z4) {
            menu.add(2131296498, 2131296510, i, jb6.M0(2131744951, null));
            i++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, i, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
        spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i2 = i + 2;
        menu.add(2131296498, 2131296499, i + 1, spannableStringBuilder2);
        if (z3) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(jb6.M0(2131748107, null));
            spannableStringBuilder3.setSpan(new z5c(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296498, 2131296501, i2, spannableStringBuilder3);
            i2 = i + 3;
        }
        if (encryptedChat == null || gm.W0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(jb6.M0(2131744122, null));
            ?? obj = new Object();
            obj.a |= 8;
            spannableStringBuilder4.setSpan(new xkb(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i3 = i2 + 1;
            menu.add(2131296498, 2131296511, i2, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(jb6.M0(2131743576, null));
            ?? obj2 = new Object();
            obj2.a |= 16;
            spannableStringBuilder5.setSpan(new xkb(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i2 += 2;
            menu.add(2131296498, 2131296514, i3, spannableStringBuilder5);
        }
        if (z2) {
            menu.add(2131296498, 2131296500, i2, jb6.M0(2131751681, null));
            i2++;
        }
        if (z && encryptedChat == null) {
            menu.add(2131296498, 2131296495, i2, jb6.M0(2131750522, null));
            i2++;
        }
        menu.add(2131296498, 2131296505, i2, jb6.M0(2131746070, null));
    }

    public static Integer K6(ArrayList arrayList, int i, int[] iArr) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Integer num = (Integer) arrayList.get(0);
        if (i >= num.intValue()) {
            iArr[0] = 0;
            return num;
        }
        int size = arrayList.size();
        int i2 = size - 1;
        Integer num2 = (Integer) arrayList.get(i2);
        if (i <= num2.intValue()) {
            iArr[0] = i2;
            return num2;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            i4 = (i3 + size) / 2;
            Integer num3 = (Integer) arrayList.get(i4);
            if (num3.intValue() == i) {
                iArr[0] = i4;
                return num3;
            } else if (i < num3.intValue()) {
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    Integer num4 = (Integer) arrayList.get(i5);
                    if (i > num4.intValue()) {
                        iArr[0] = i5;
                        return num4;
                    }
                }
                i3 = i4 + 1;
            } else if (i4 > 0 && i < ((Integer) arrayList.get(i4 - 1)).intValue()) {
                iArr[0] = i4;
                return num3;
            } else {
                size = i4;
            }
        }
        iArr[0] = i4;
        return (Integer) arrayList.get(i4);
    }

    public static TLRPC.TL_message P5(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = message.id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    public static boolean T7(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static ArrayList V5(ArrayList arrayList, boolean z, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            z5a z5aVar = (z5a) arrayList.get(i);
            String str = z5aVar.c;
            if (str == null) {
                if (z5aVar.a != null) {
                    try {
                        File q0 = gm.q0("", z);
                        InputStream openInputStream = a.b.getContentResolver().openInputStream(z5aVar.a);
                        FileOutputStream fileOutputStream = new FileOutputStream(q0);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        openInputStream.close();
                        fileOutputStream.close();
                        str = q0.getAbsolutePath();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 != null) {
                Pair N0 = gm.N0(str2);
                jo6 jo6Var = new jo6(0, str2, ((Integer) N0.first).intValue(), z5aVar.o, 0, 0);
                jo6Var.n(N0);
                if (i == arrayList.size() - 1 && charSequence != null) {
                    jo6Var.a = charSequence;
                }
                arrayList2.add(jo6Var);
            }
        }
        return arrayList2;
    }

    public static CharSequence W6(k47 k47Var, f47 f47Var, int[] iArr) {
        if (k47Var != null) {
            String D1 = oc7.r1(k47Var.K1).D1(k47Var.k.restriction_reason);
            if (!TextUtils.isEmpty(D1)) {
                return D1;
            }
            if (k47Var.S4() && !v0c.l(k47Var)) {
                return k47Var.i2();
            }
            CharSequence charSequence = k47Var.z;
            if (charSequence != null) {
                return charSequence;
            }
            if (f47Var != null) {
                ArrayList arrayList = f47Var.d;
                int size = arrayList.size();
                CharSequence charSequence2 = null;
                for (int i = 0; i < size; i++) {
                    k47 k47Var2 = (k47) arrayList.get(i);
                    CharSequence charSequence3 = k47Var2.z;
                    if (charSequence3 != null) {
                        if (charSequence2 == null) {
                            if (iArr != null) {
                                iArr[0] = k47Var2.e1();
                            }
                            charSequence2 = charSequence3;
                        }
                    }
                }
                return charSequence2;
            }
        }
        return null;
    }

    public static SpannableStringBuilder Y6(long j, k47 k47Var, boolean z) {
        TLRPC.Chat L0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            long Z0 = k47Var.Z0();
            int i = k47Var.K1;
            if (j != Z0) {
                int i2 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i2 > 0) {
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(Z0));
                    if (W1 != null) {
                        spannableStringBuilder.append((CharSequence) bw2.m(0, W1.first_name, W1.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i2 < 0 && (L0 = oc7.r1(i).L0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) L0.title).append((CharSequence) ":\n");
                }
            }
        }
        String D1 = oc7.r1(k47Var.K1).D1(k47Var.k.restriction_reason);
        if (!TextUtils.isEmpty(D1)) {
            spannableStringBuilder.append((CharSequence) D1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = k47Var.z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(k47Var.v);
        return spannableStringBuilder;
    }

    public static FrameLayout Z5(Activity activity, ylb ylbVar, CharSequence charSequence, int i) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setMinimumHeight(gm.L(48.0f));
        frameLayout.setPadding(gm.L(14.0f), gm.L(4.0f), gm.L(14.0f), gm.L(4.0f));
        wb wbVar = new wb(activity, (byte) 17);
        int i2 = 3;
        wbVar.setMaxLines(3);
        wbVar.setGravity(3);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(wbVar, cmb.D8, ylbVar);
        wbVar.setTextSize(1, i);
        wbVar.setMaxWidth(gm.L(170.0f));
        wbVar.setText(charSequence);
        if (jb6.a0) {
            i2 = 5;
        }
        frameLayout.addView(wbVar, qoe.e(-1, -2, i2 | 16));
        return frameLayout;
    }

    public static int a7() {
        return gm.L(102.0f);
    }

    public static yv1 fa(int i, long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("message_id", i);
        return new yv1(bundle);
    }

    public static yv1 ga(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new yv1(bundle);
    }

    public final void A4(k47 k47Var, k47 k47Var2) {
        long D1 = k47Var.D1();
        if (D1 != 0) {
            vh6 vh6Var = this.O6;
            ArrayList arrayList = (ArrayList) vh6Var.f(D1);
            if (arrayList == null) {
                arrayList = td4.t(vh6Var, D1);
            }
            arrayList.add(k47Var);
            if (k47Var2 != null) {
                arrayList.remove(k47Var2);
            }
        }
    }

    public final void A5() {
        float d;
        boolean z;
        if (this.A0 != null) {
            if (this.mb && this.Aa == null) {
                d = gm.n;
            } else {
                d = this.w.d() + u7(izb.c) + gm.L(16.0f) + this.Ya + this.ld;
            }
            int i = (int) this.P9;
            mzb mzbVar = this.g2;
            if (mzbVar != null) {
                mzbVar.setSideMenuBackgroundMarginTop(0.0f);
            }
            nl9 nl9Var = this.z0;
            if (!this.A0.W1 && this.vb == 0) {
                z = true;
            } else {
                z = false;
            }
            vr1 vr1Var = (vr1) nl9Var.b;
            int i2 = (int) d;
            int paddingTop = vr1Var.getPaddingTop();
            int paddingBottom = vr1Var.getPaddingBottom();
            if (paddingTop != i || paddingBottom != i2) {
                int i3 = paddingTop - i;
                if (z && i3 != 0) {
                    boolean canScrollVertically = vr1Var.canScrollVertically(1);
                    boolean canScrollVertically2 = vr1Var.canScrollVertically(-1);
                    if ((i3 >= 0 || canScrollVertically) && (i3 <= 0 || canScrollVertically2)) {
                        gm.J(vr1Var, new eh(nl9Var, i3, (byte) 26));
                    }
                }
                vr1Var.setPadding(vr1Var.getPaddingLeft(), i, vr1Var.getPaddingRight(), i2);
            }
            n02 n02Var = this.c4;
            if (n02Var != null) {
                RectF rectF = n02Var.b;
                rectF.set(u7(izb.b), i - this.I, 0.0f, d - this.Ya);
                n02Var.c.set(rectF.left, rectF.top, n02Var.getMeasuredWidth() - rectF.right, n02Var.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void A6(Canvas canvas) {
        float f;
        r7 p7 = p7();
        if (p7 == null) {
            return;
        }
        View view = (View) p7.getParent();
        float x = this.actionBar.getX();
        oyb oybVar = this.n0;
        if (oybVar != null) {
            f = oybVar.getProgress() * this.n0.getContentWidth();
        } else {
            f = 0.0f;
        }
        float x2 = (p7.getX() + (view.getX() + (x - f))) - this.n0.getX();
        float y = (p7.getY() + (view.getY() + this.actionBar.getY())) - this.n0.getY();
        Paint paint = this.Hb;
        if (paint == null) {
            paint = new Paint(1);
            this.Hb = paint;
        }
        paint.setColor(cmb.p1(this.n0.getProgress(), getThemedColor(cmb.c6)));
        canvas.drawCircle((p7.getWidth() / 2.0f) + x2, (p7.getHeight() / 2.0f) + y, gm.L(23.0f), this.Hb);
        canvas.save();
        canvas.translate(x2, y);
        p7.draw(canvas);
        canvas.restore();
    }

    public final boolean A7() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.o6;
        for (int i = 0; i < sparseArrayArr.length; i++) {
            try {
                for (int i2 = 0; i2 < sparseArrayArr[i].size(); i2++) {
                    k47 k47Var = (k47) sparseArrayArr[i].valueAt(i2);
                    if (k47Var != null && (message = k47Var.k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void A8(Long l, Boolean bool) {
        int i;
        int i2;
        if (l.longValue() != d()) {
            this.Ib = SystemClock.uptimeMillis();
            this.H7 = bool.booleanValue();
            if (l.longValue() == 0) {
                mb(d());
            } else if (d() == 0) {
                mb(l.longValue());
            } else {
                this.F7 = -1;
            }
            getConnectionsManager().cancelRequestsForGuid(this.classGuid);
            getMessagesStorage().j(this.classGuid);
            this.classGuid = ConnectionsManager.generateClassGuid();
            jb();
            this.x5 = null;
            this.M7 = 0;
            this.C7 = false;
            this.D7 = true;
            this.Y7 = true;
            this.Z7 = 0;
            this.b8 = null;
            this.z6.clear();
            this.s4 = l.longValue();
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(-a(), l.longValue());
            if (l.longValue() != 0 && f != null) {
                int i3 = f.read_inbox_max_id;
                this.A4 = i3;
                this.B4 = f.read_outbox_max_id;
                this.C4 = Math.max(1, i3);
                getMessagesController().g4.k(this.l6, pg3.n(f.from_id));
            } else {
                this.r4 = null;
                this.p4 = null;
                this.m4 = null;
                this.F5 = null;
                this.A4 = 0;
                this.B4 = 0;
                this.C4 = 0;
                this.s4 = 0L;
                this.t4 = 0;
                this.u4 = null;
                this.x4 = false;
                this.v4 = false;
            }
            N6();
            wd(true);
            this.p1.n(true);
            this.p1.b();
            this.g2.setCurrentTopic(l.longValue());
            zd(true);
            Pc(true);
            getMessagesController().R4(-a(), d());
            G7(true);
            E7(true);
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.J0(false);
                this.a0.r2(true);
            }
            H4(true, true);
            if (f != null) {
                i = f.unread_reactions_count;
            } else {
                i = 0;
            }
            this.A1 = i;
            if (f != null) {
                i2 = f.unread_poll_votes_count;
            } else {
                i2 = 0;
            }
            this.B1 = i2;
            jd(false);
            id(false);
            Ad();
            pv1 pv1Var = this.gd;
            if (pv1Var != null && this.actionBar.o0) {
                pv1Var.k(null);
            }
        }
    }

    public final void A9(int i, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        k47 k47Var;
        k47 k47Var2;
        if (this.Xb != i) {
            return;
        }
        if (bool.booleanValue()) {
            this.Y5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                this.Y5 = null;
                o47 o47Var = this.x5;
                if (o47Var != null) {
                    int i2 = this.currentAccount;
                    CharSequence fieldText = this.a0.getFieldText();
                    k47 k47Var3 = this.F5;
                    if (k47Var3 == this.m4) {
                        k47Var2 = null;
                    } else {
                        k47Var2 = k47Var3;
                    }
                    o47Var.e(i2, null, fieldText, k47Var2, this.D5, this.H5);
                }
                D6();
                return;
            }
            boolean z = webPage instanceof TLRPC.TL_webPagePending;
            if (z) {
                this.a6 = str;
            }
            if (this.h != null && z) {
                webPage.url = str;
            }
            o47 o47Var2 = this.x5;
            if (o47Var2 != null) {
                int i3 = this.currentAccount;
                CharSequence fieldText2 = this.a0.getFieldText();
                k47 k47Var4 = this.F5;
                if (k47Var4 == this.m4) {
                    k47Var = null;
                } else {
                    k47Var = k47Var4;
                }
                o47Var2.e(i3, null, fieldText2, k47Var, this.D5, this.H5);
            }
            bc(true, this.Y5, false, true);
            return;
        }
        this.Y5 = null;
        D6();
    }

    public final void Aa(TLRPC.Chat chat) {
        boolean z;
        hg5 hg5Var = this.K1;
        if (hg5Var != null && hg5Var.W) {
            hg5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        hg5 hg5Var2 = this.L1;
        if (hg5Var2 != null && hg5Var2.W) {
            hg5Var2.f(true);
            z = true;
        }
        if (z) {
            gm.d3(new uj1(this, chat, (byte) 14), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.sd.a(true, true);
            r7 r7Var = this.j0;
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            qr2 qr2Var = this.f0;
            if (qr2Var != null) {
                qr2Var.b(false);
            }
            r7 r7Var2 = this.k0;
            if (r7Var2 != null) {
                r7Var2.setVisibility(0);
            }
            r7 r7Var3 = this.p0;
            if (r7Var3 != null && this.ha) {
                r7Var3.setVisibility(8);
            }
            q6 q6Var2 = this.q0;
            if (q6Var2 != null && this.ia) {
                q6Var2.e(8);
            }
            r7 r7Var4 = this.l0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(8);
            }
            r7 r7Var5 = this.m0;
            if (r7Var5 != null) {
                r7Var5.setVisibility(8);
            }
            this.r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        r7 r7Var6 = this.k0;
        if (r7Var6 != null) {
            this.Vc = true;
            this.k5 = false;
            r7Var6.G(false);
            this.Vc = false;
        }
        ub(chat, null);
        gd(0, true);
    }

    public final void Ab(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        long j2;
        if (s5()) {
            if (!TextUtils.isEmpty(str)) {
                y5a b = y5a.b(str, this.l6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b.K = X6();
                b.O = j;
                b.L = z2;
                b.Q = 0L;
                b.R = k7();
                b.T = this.y5;
                a6a.B(this.currentAccount).q0(b);
                j2 = 0;
            } else {
                j2 = j;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                y5a g = y5a.g((TLRPC.User) obj, this.l6, null, null, null, null, z, i, 0);
                g.K = X6();
                g.O = j2;
                g.L = z2;
                g.Q = 0L;
                g.R = k7();
                g.T = this.y5;
                getSendMessagesHelper().q0(g);
                j2 = 0;
            }
            E4();
        }
    }

    public final boolean Ac(k47 k47Var) {
        if (this.g4 == 0 && k47Var != null && k47Var.a5()) {
            return true;
        }
        return false;
    }

    public final void Ad() {
        int i;
        TLRPC.TL_forumTopic tL_forumTopic;
        p7 p7Var = this.w0;
        if (p7Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && sd2.i(this.currentAccount, chat, this.r4) && (tL_forumTopic = this.r4) != null && !tL_forumTopic.closed) {
                i = 0;
            } else {
                i = 8;
            }
            p7Var.e(i);
        }
    }

    @Override
    public final ela B() {
        return this.m1;
    }

    public final void B4() {
        if (getParentLayout() == null) {
            return;
        }
        de0.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f, null, this.l6, this.Sa, this.Ra);
    }

    public final void B5() {
        FrameLayout frameLayout = this.f1;
        if (frameLayout != null) {
            float c = this.w.c();
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + c + gm.L(9.0f)) * (-0.5f));
        }
    }

    public final void B6() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        k47 k47Var = this.H5;
        if (k47Var != null && (message = k47Var.k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean B7() {
        nu1 nu1Var = this.u9;
        if (nu1Var != null && nu1Var.w()) {
            return true;
        }
        return false;
    }

    public final void B8(int i) {
        this.actionBar.setSubtitle(jb6.G(i, "messages", new Object[0]));
    }

    public final void B9(CharSequence charSequence, oc7 oc7Var, boolean z) {
        boolean z2;
        String str;
        String charSequence2;
        i6c[] i6cVarArr;
        if (this.X5 != 0) {
            getConnectionsManager().cancelRequest(this.X5, true);
            this.X5 = 0;
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = gm.S.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (i6cVarArr = (i6c[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), i6c.class)) != null && i6cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (i6c i6cVar : i6cVarArr) {
                    arrayList.add(i6cVar.getURL());
                }
            }
            if (arrayList != null && this.Z5 != null && arrayList.size() == this.Z5.size()) {
                boolean z3 = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) this.Z5.get(i))) {
                        z3 = false;
                    }
                }
                if (z3 && !z2) {
                    return;
                }
            }
            this.Z5 = arrayList;
        } catch (Exception e) {
            fc4.g(e, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                str = charSequence;
            } else {
                gm.c3(new ho1(this, (byte) 20));
                return;
            }
        }
        if (arrayList == null) {
            gm.c3(new ho1(this, (byte) 19));
            return;
        }
        str = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (this.h != null && oc7Var.z2 == 2) {
            gm.c3(new mm1(this, oc7Var, charSequence, z));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (str instanceof String) {
            charSequence2 = str;
            getwebpagepreview.message = charSequence2;
        } else {
            charSequence2 = str.toString();
            getwebpagepreview.message = charSequence2;
        }
        TLRPC.WebPage webPage = this.Y5;
        if (webPage == null || !charSequence2.equals(webPage.displayedText)) {
            int i2 = this.Xb + 1;
            this.Xb = i2;
            ro1 ro1Var = new ro1(this, i2, getwebpagepreview, (byte) 0);
            HashMap hashMap = this.Yb;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.Yb = hashMap;
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) hashMap.get(getwebpagepreview.message);
            if (webPage2 != null) {
                ro1Var.a(Boolean.TRUE, webPage2);
                return;
            }
            p pVar = new p(this, getwebpagepreview, ro1Var, (byte) 6);
            if (this.X5 != 0) {
                getConnectionsManager().cancelRequest(this.X5, true);
            }
            this.X5 = getConnectionsManager().sendRequestTyped(getwebpagepreview, new kc((byte) 0), new lf2(this, pVar, (byte) 8));
            getConnectionsManager().bindRequestToGuid(this.X5, this.classGuid);
        }
    }

    public final void Ba(String str) {
        boolean z;
        boolean z2;
        String str2;
        int i;
        r7 r7Var;
        int i2;
        hg5 hg5Var = this.K1;
        if (hg5Var != null && hg5Var.W) {
            hg5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        hg5 hg5Var2 = this.L1;
        if (hg5Var2 != null && hg5Var2.W) {
            hg5Var2.f(true);
            z = true;
        }
        if (z) {
            gm.d3(new lm1(this, str, (byte) 2), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.sd.a(true, true);
            r7 r7Var2 = this.j0;
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            qr2 qr2Var = this.f0;
            if (qr2Var != null) {
                qr2Var.b(false);
            }
            if ((this.s4 == 0 || (i2 = this.g4) == 3 || i2 == 8) && (r7Var = this.k0) != null) {
                r7Var.setVisibility(0);
            }
            r7 r7Var3 = this.p0;
            if (r7Var3 != null && this.ha) {
                r7Var3.setVisibility(8);
            }
            q6 q6Var2 = this.q0;
            if (q6Var2 != null && this.ia) {
                q6Var2.e(8);
            }
            r7 r7Var4 = this.l0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(8);
            }
            r7 r7Var5 = this.m0;
            if (r7Var5 != null) {
                r7Var5.setVisibility(8);
            }
            this.r0 = true;
            nd(0, 0, -1);
            Pc(false);
        }
        if ((this.s4 == 0 || this.x4 || (i = this.g4) == 3 || i == 8) && !m9c.B(this.f)) {
            if (str == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.k5 = z2;
            r7 r7Var6 = this.k0;
            if (r7Var6 != null) {
                r7Var6.G(z2);
            }
        }
        r7 r7Var7 = this.k0;
        if (r7Var7 != null) {
            r7Var7.P(str, false);
        }
        hs6 mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.I3 = str2;
        mediaDataController.Z1(str2, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        gd(0, true);
    }

    public final void Bb(int i, ArrayList arrayList, boolean z, boolean z2) {
        String str;
        String str2;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                jo6 jo6Var = (jo6) obj;
                ?? obj2 = new Object();
                if (!jo6Var.b && (str2 = jo6Var.h) != null) {
                    obj2.c = str2;
                } else {
                    String str3 = jo6Var.I;
                    if (str3 != null) {
                        obj2.c = str3;
                    }
                }
                obj2.e = jo6Var.c;
                obj2.f = jo6Var.g;
                obj2.p = jo6Var.d();
                obj2.o = jo6Var.b;
                obj2.q = jo6Var.j();
                obj2.z = jo6Var.m;
                obj2.A = jo6Var.P;
                CharSequence charSequence = jo6Var.a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.i = jo6Var.n;
                obj2.j = jo6Var.r;
                obj2.h = jo6Var.x;
                obj2.k = jo6Var.s;
                obj2.r = jo6Var.L;
                obj2.x = jo6Var.c();
                arrayList2.add(obj2);
                jo6Var.e();
            }
            F6(((z5a) arrayList2.get(0)).d, ((z5a) arrayList2.get(0)).i);
            a6a.W(getAccountInstance(), arrayList2, this.l6, this.F5, this.m4, null, this.D5, z2, true, null, null, z, i, 0, ((z5a) arrayList2.get(0)).t, null, X6(), 0L, false, 0L, k7(), this.y5, null, false);
            E4();
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.setFieldText("");
            }
        }
        if (i != 0) {
            int i4 = this.h4;
            if (i4 == -1) {
                this.h4 = 0;
            } else {
                i2 = i4;
            }
            this.h4 = arrayList.size() + i2;
            md(true);
        }
    }

    public final void Bc(float f) {
        View view = this.v9;
        if (view instanceof rc2) {
            ((rc2) view).setSlidingOffset(f);
        } else if (view instanceof cm1) {
            ((cm1) view).setWalletSlidingOffset(f);
        }
    }

    public final void Bd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        pr1 pr1Var = this.p1;
        if (pr1Var != null && (tL_forumTopic = this.r4) != null) {
            pr1Var.setTitle(tL_forumTopic.title);
        }
        Cd();
    }

    @Override
    public final List C() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (sd2.T(this.e)) {
            arrayList.add(new dl4(jb6.M0(2131751549, null)));
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    M0 = jb6.M0(2131751546, null);
                } else {
                    M0 = jb6.M0(2131751547, null);
                }
            } else {
                M0 = jb6.M0(2131751548, null);
            }
            arrayList.add(new dl4(jb6.a0(null, null, 2131751545, M0), new ho1(this, (byte) 23)));
            arrayList.add(new dl4(jb6.M0(2131751544, null), new ho1(this, (byte) 24)));
        }
        if (this.f == null) {
            arrayList.add(new dl4(jb6.M0(2131751554, null)));
            arrayList.add(new dl4(jb6.M0(2131751553, null), 0.0f, 255.0f, new pn("", (byte) 6)));
            arrayList.add(new dl4(jb6.M0(2131751552, null), 1.0f, 10.0f, new v20(this)));
        }
        return arrayList;
    }

    public final void C4(k47 k47Var, boolean z) {
        D4(k47Var, z, true);
    }

    public final void C5() {
        int i;
        float f = this.td.e;
        te5 te5Var = this.I1;
        int i2 = 8;
        if (te5Var != null) {
            te5Var.setAlpha(f);
            te5 te5Var2 = this.I1;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            te5Var2.setVisibility(i);
        }
        fv fvVar = this.a4;
        if (fvVar != null) {
            float f2 = 1.0f - f;
            fvVar.setAlpha(f2);
            fv fvVar2 = this.a4;
            if (f2 > 0.0f) {
                i2 = 0;
            }
            fvVar2.setVisibility(i2);
        }
    }

    public final oyb C6() {
        long d;
        boolean z;
        if (this.n0 == null && getParentActivity() != null && this.m1 != null) {
            oyb oybVar = new oyb(getParentActivity(), this.currentAccount, a(), this.Ba, new bt1(this));
            this.n0 = oybVar;
            this.m1.addView(oybVar, qoe.c(-1.0f, -1));
        }
        oyb oybVar2 = this.n0;
        if (oybVar2 != null) {
            if (d8()) {
                d = f7();
            } else {
                d = d();
            }
            oybVar2.setCurrentTopic(d);
            oyb oybVar3 = this.n0;
            if (this.j0 != null) {
                z = true;
            } else {
                z = false;
            }
            oybVar3.setMenuAvailable(z);
        }
        return this.n0;
    }

    public final void C7() {
        qu3 editField;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            if (aVar.y()) {
                this.ud.s(5, false, true);
                this.actionBar.x();
            } else {
                return;
            }
        }
        this.s6 = 0;
        this.v6 = 0;
        this.t6 = 0;
        this.x6 = 0;
        this.y6 = 0;
        this.w6 = 0;
        ms1 ms1Var = this.a0;
        if (ms1Var != null && (editField = ms1Var.getEditField()) != null) {
            if (this.a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        nu1 nu1Var = this.u9;
        if (nu1Var != null) {
            nu1Var.e(true);
            SparseArray sparseArray = this.u9.p0;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
            }
            sparseArray.clear();
        }
        rt1 rt1Var = this.E9;
        if (rt1Var != null) {
            gm.r(rt1Var.I);
            rt1Var.a();
        }
        ms1 ms1Var2 = this.a0;
        if (ms1Var2 != null) {
            ms1Var2.b0 = false;
        }
        this.F9 = false;
        if (this.Jb != null) {
            K7();
        }
    }

    public final void C8(int i) {
        if (i != 0) {
            gm.c3(new vm1(this, i, (byte) 6));
        } else {
            this.actionBar.setSubtitle(jb6.M0(2131747926, null));
        }
    }

    public final void C9(int i, k47 k47Var) {
        if (i == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.id = getMessagesController().p1(this.f);
            getConnectionsManager().sendRequest(tL_contacts_acceptContact, new fm1(this, (byte) 4));
            return;
        }
        y5a g = y5a.g(getUserConfig().f(), this.l6, k47Var, this.m4, null, null, true, 0, 0);
        g.K = X6();
        a6a.B(this.currentAccount).q0(g);
        if (this.g4 == 0) {
            da(false);
        }
        E7(false);
    }

    public final void Ca(TLRPC.User user) {
        boolean z;
        hg5 hg5Var = this.K1;
        if (hg5Var != null && hg5Var.W) {
            hg5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        hg5 hg5Var2 = this.L1;
        if (hg5Var2 != null && hg5Var2.W) {
            hg5Var2.f(true);
            z = true;
        }
        if (z) {
            gm.d3(new do1(this, user, (byte) 1), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.sd.a(true, true);
            r7 r7Var = this.j0;
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            qr2 qr2Var = this.f0;
            if (qr2Var != null) {
                qr2Var.b(false);
            }
            r7 r7Var2 = this.k0;
            if (r7Var2 != null) {
                r7Var2.setVisibility(0);
            }
            r7 r7Var3 = this.p0;
            if (r7Var3 != null && this.ha) {
                r7Var3.setVisibility(8);
            }
            q6 q6Var2 = this.q0;
            if (q6Var2 != null && this.ia) {
                q6Var2.e(8);
            }
            r7 r7Var4 = this.l0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(8);
            }
            r7 r7Var5 = this.m0;
            if (r7Var5 != null) {
                r7Var5.setVisibility(8);
            }
            this.r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        r7 r7Var6 = this.k0;
        if (r7Var6 != null) {
            this.Vc = true;
            this.k5 = false;
            r7Var6.G(false);
            this.Vc = false;
        }
        ub(null, user);
        gd(0, true);
    }

    public final of2 Cb(k47 k47Var) {
        if (k47Var != null && !k47Var.N3() && k47Var.k4() && k47Var.k.ttl == Integer.MAX_VALUE) {
            long R = getMessagesController().R(k47Var.e1(), this.l6);
            k47Var.I0 = true;
            if (k47Var.O3() || (!k47Var.f4() && !k47Var.R4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(k47Var);
                bd(arrayList, true);
            }
            return new of2(this, R, k47Var, (byte) 14);
        }
        return null;
    }

    public final void Cc(k47 k47Var, boolean z) {
        TL_iv.RichMessage richMessage;
        if (k47Var != null && getParentActivity() != null) {
            qe2 qe2Var = this.va;
            if (qe2Var != null && qe2Var.d()) {
                this.va.setHiddenByScroll(true);
            }
            if (this.k0 != null) {
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar.o0) {
                    aVar.o(true);
                    this.a0.I1();
                }
            }
            TLRPC.Message message = k47Var.k;
            if (message != null && (richMessage = message.rich_message) != null) {
                jf9 jf9Var = new jf9(richMessage);
                jf9Var.K = this;
                jf9Var.r = k47Var;
                presentFragment(jf9Var);
                return;
            }
            this.X1.getAdapter().g0 = false;
            this.a0.setVisibility(0);
            ac(true, null, k47Var, null, null, true, 0, null, false, 0L, null, true);
            Pc(false);
            if (!z) {
                a5();
            } else {
                this.y5 = v67.b(k47Var.k.suggested_post);
            }
            this.a0.z1(false, false, true);
            gd(0, true);
            Gd(false);
            if (!z && !k47Var.r1 && !k47.a4(k47Var.k) && this.g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().i1(this.l6);
                tL_messages_getMessageEditData.id = k47Var.e1();
                this.G5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new fm1(this, (byte) 3));
                return;
            }
            ms1 ms1Var = this.a0;
            by1 by1Var = ms1Var.v2;
            if (by1Var != null) {
                by1Var.setEnabled(true);
                ms1Var.v2.h(false);
            }
        }
    }

    public final void Cd() {
        pr1 pr1Var;
        pr1 pr1Var2;
        if (m9c.w(this.f) && (pr1Var2 = this.p1) != null) {
            pr1Var2.getAvatarImageView().setVisibility(0);
            this.p1.b();
        } else if (this.r4 != null && (pr1Var = this.p1) != null) {
            pr1Var.getAvatarImageView().setVisibility(0);
            no4.q(this.p1.getAvatarImageView(), this.r4, true, true, this.Ba);
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        boolean z;
        int i2;
        int i3;
        if (i == 0) {
            ha();
            return;
        }
        boolean z2 = true;
        int i4 = 4;
        int i5 = 0;
        if (i == 1) {
            View view = this.V;
            if (view != null) {
                view.setAlpha(f);
                View view2 = this.V;
                if (f > 0.0f) {
                    i4 = 0;
                }
                view2.setVisibility(i4);
            }
        } else if (i == 2) {
            ha();
            F5();
            lf8 lf8Var = this.vd;
            if (lf8Var != null) {
                lf8Var.setAnimatedVisibility(this.pd.e);
            }
        } else {
            int i6 = 8;
            if (i == 3) {
                fn0 fn0Var = this.qd;
                float f3 = 1.0f - fn0Var.e;
                this.b1.setAlpha(f3);
                r02 r02Var = this.b1;
                if (f3 > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                r02Var.setVisibility(i3);
                float f4 = 1.0f - fn0Var.e;
                mzb mzbVar = this.g2;
                if (mzbVar != null) {
                    mzbVar.setAlpha(f4);
                    mzb mzbVar2 = this.g2;
                    if (f4 <= 0.0f) {
                        i5 = 8;
                    }
                    mzbVar2.setVisibility(i5);
                }
            } else if (i == 4) {
                yd ydVar = this.Z3;
                fn0 fn0Var2 = this.rd;
                if (ydVar != null) {
                    float f5 = fn0Var2.e;
                    ydVar.setAlpha(f5);
                    yd ydVar2 = this.Z3;
                    if (f5 > 0.0f) {
                        i6 = 0;
                    }
                    ydVar2.setVisibility(i6);
                }
                if (fn0Var2.e < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                e02 e02Var = this.Z;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                e02Var.setVisibility(i2);
                y5();
                if (fn0Var2.e >= 1.0f) {
                    z2 = false;
                }
                vr1 vr1Var = this.A0;
                if (z2) {
                    i4 = 0;
                }
                vr1Var.setVisibility(i4);
                F5();
                I5();
                H5();
                this.glassEngine.g();
            } else if (i == 5) {
                x5();
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.setSearchFactor(f);
                }
            } else if (i == 6) {
                C5();
            }
        }
    }

    public final void D4(defpackage.k47 r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.D4(k47, boolean, boolean):void");
    }

    public final void D5() {
        if (this.m1 == null) {
            return;
        }
        this.ld = K4(false);
        this.md = K4(true);
        this.U.setInputBubbleHeight(this.ld);
        ed();
        Oc();
        z5();
        w5();
        B5();
        A5();
    }

    public final void D6() {
        m47 m47Var;
        v67 v67Var = this.y5;
        if (v67Var != null) {
            fc(v67Var);
            return;
        }
        TLRPC.WebPage webPage = this.Y5;
        if (webPage != null) {
            bc(true, webPage, false, true);
            return;
        }
        nv1 nv1Var = this.D5;
        k47 k47Var = this.F5;
        if (nv1Var != null) {
            ec(k47Var, nv1Var);
        } else if (k47Var != null && k47Var != this.m4) {
            dc(k47Var);
        } else {
            o47 o47Var = this.x5;
            if (o47Var != null && (m47Var = o47Var.b) != null) {
                cc(m47Var.e);
                return;
            }
            k47 k47Var2 = this.H5;
            if (k47Var2 != null) {
                ac(true, null, k47Var2, null, null, true, 0, null, false, 0L, null, true);
            } else {
                bc(false, null, true, true);
            }
        }
    }

    public final void D7() {
        if (getUserConfig().p()) {
            c41.b0(this).c(jb6.M0(2131754485, null)).j();
            getMessagesController().l0(true);
            Za(this.v5);
            bb(this.v5);
            return;
        }
        showDialog(new kj8((d) this, 3, true));
    }

    public final void D8(TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = getMessagesController().i1(this.l6);
                tL_messages_getHistory.offset_date = this.O7 + 86400;
                tL_messages_getHistory.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getHistory, new pm(this, tLObject, (byte) 13));
                return;
            }
            this.actionBar.setSubtitle(jb6.M0(2131747926, null));
        }
    }

    public final void D9() {
        this.ya = null;
        this.A0.setOnInterceptTouchListener(null);
        Hb(this.m1, true);
        uf2.e(this.currentAccount).a.clear();
    }

    public final void Da(bu5 bu5Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) bu5Var.A;
        jd2 jd2Var = new jd2(getParentActivity(), this.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new hi2(this, bu5Var, false, (byte) 15), getResourceProvider());
        jd2Var.e(this.l6, d(), null);
        int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(jd2Var.f);
        bu5Var.q0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b);
    }

    public final jm1 Db(k47 k47Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        if (k47Var != null && !k47Var.N3() && k47Var.k4()) {
            TLRPC.Message message = k47Var.k;
            if (message.destroyTime == 0 && (i = message.ttl) > 0) {
                if (z) {
                    if (i != Integer.MAX_VALUE) {
                        i2 = i;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    message.destroyTime = getConnectionsManager().getCurrentTime() + i2;
                    if (this.h != null) {
                        getMessagesController().t3(this.l6, i2, k47Var.k.random_id);
                        return null;
                    }
                    getMessagesController().u3(this.l6, k47Var.e1(), null, i2, 0L, z2);
                    return null;
                }
                return new jm1(this, k47Var, (byte) 1);
            }
        }
        return null;
    }

    public final void Dc() {
        uj4 uj4Var = this.J9;
        if (uj4Var != null && !uj4Var.c) {
            uj4Var.c(false);
            try {
                this.J9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Dd() {
        boolean z;
        int i;
        float f;
        org.telegram.ui.ActionBar.a aVar;
        if (this.m0 == null) {
            return;
        }
        int i2 = 0;
        if (k8() && !this.r0 && ((aVar = this.actionBar) == null || !aVar.y())) {
            z = true;
        } else {
            z = false;
        }
        r7 r7Var = this.m0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        r7Var.setVisibility(i);
        r7 r7Var2 = this.j0;
        if (r7Var2 != null && (r7Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.j0.getLayoutParams();
            if (!z) {
                i2 = gm.L(48.0f);
            }
            if (layoutParams.width != i2) {
                layoutParams.width = i2;
                this.j0.setLayoutParams(layoutParams);
            }
            r7 r7Var3 = this.j0;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            r7Var3.setAlpha(f);
            this.j0.setClickable(!z);
        }
        ud();
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void E4() {
        this.y5 = null;
        if (this.s4 == 0 || this.x4) {
            if (this.x4) {
                this.F5 = this.m4;
            } else {
                this.F5 = null;
            }
            this.D5 = null;
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.Q1(null, null, null);
            }
        }
        E7(false);
        if (this.g4 == 0) {
            getMediaDataController().F(this.l6, this.s4, true);
        }
    }

    public final void E5() {
        int i;
        yv1 yv1Var = this.Aa;
        if (yv1Var != null) {
            yv1Var.E5();
        }
        int L = gm.L(2.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m + ((int) t7(gm.L(7.0f)));
        ys1 ys1Var = this.D1;
        if (ys1Var != null) {
            i = gm.L(ys1Var.F * 35.0f);
        } else {
            i = 0;
        }
        int L2 = gm.L(U6() * 43.0f) + L + i;
        int L3 = gm.L(60.0f) + ((int) this.w.d());
        fv fvVar = this.a4;
        if (fvVar != null) {
            fvVar.setPadding(0, L2, 0, L3);
        }
        te5 te5Var = this.I1;
        if (te5Var != null) {
            te5Var.e.setPadding(0, L2, 0, L3);
            te5Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        yd ydVar = this.Z3;
        if (ydVar != null) {
            e02 e02Var = (e02) ydVar.b;
            e02Var.setFadeZoneTop(L2);
            e02Var.setFadeZoneBottom(L3);
        }
        tk4 tk4Var = this.r2;
        if (tk4Var != null) {
            tk4Var.setTranslationY(L2);
        }
        a1b a1bVar = this.s2;
        if (a1bVar != null) {
            a1bVar.a.setTranslationY(((L2 - L3) / 2.0f) + gm.L(32.0f));
        }
    }

    public final void E7(boolean z) {
        bc(false, null, false, z);
    }

    public final hd2 E8(Context context) {
        jd2 jd2Var = new jd2(context, this.currentAccount, this.j0.getPopupLayout().getSwipeBack(), false, new sr1(this), getResourceProvider());
        this.x1 = jd2Var;
        jd2Var.e(this.l6, d(), null);
        return this.x1.f;
    }

    public final void E9() {
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
                int i = sharedPreferences.getInt("group_convert_time", 0);
                boolean z = e21.a;
                int currentTime = getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i) >= 604800 && this.visibleDialog == null && getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = getParentActivity();
                    gm1 gm1Var = new gm1(this, (byte) 15);
                    gm1 gm1Var2 = new gm1(this, (byte) 16);
                    Pattern pattern = ik.a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String v2 = gm.v2(null, 2131624038);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new xj((byte) 0));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(neb.e(gm.L(320.0f), gm.L(127.17949f), v2)));
                    frameLayout.addView(view, qoe.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    he heVar = alertDialog$Builder.a;
                    heVar.W = frameLayout;
                    heVar.P0 = 0.3974359f;
                    heVar.S = jb6.M0(2131749338, null);
                    heVar.U = gm.S2(jb6.M0(2131749339, null));
                    alertDialog$Builder.j(jb6.M0(2131749340, null), gm1Var);
                    alertDialog$Builder.g(jb6.M0(2131752542, null), gm1Var2);
                    showDialog(heVar);
                }
            }
        }
    }

    public final void Ea(long j) {
        int i = 0;
        if (j < 0) {
            if (j == a()) {
                this.p1.e(true, false);
            } else if (getMessagesController().m2(j)) {
                showDialog(new pp2(this, -j, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j);
                if (getMessagesController().A(bundle, this, null, null)) {
                    presentFragment(new yv1(bundle));
                }
            }
        } else if (j != getUserConfig().e()) {
            if (j == a()) {
                this.p1.e(true, false);
                return;
            }
            d f0 = rs0.f0(this.currentAccount, j);
            if (f0 != null) {
                presentFragment(f0);
                return;
            }
            Bundle k = kt6.k(j, "user_id");
            if (this.h != null && j == this.f.id) {
                k.putLong("dialog_id", this.l6);
            }
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            TLRPC.User user = this.f;
            if (user != null && user.id == j) {
                i = 1;
            }
            profileActivity.B3(i);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void Eb(int i, ArrayList arrayList, boolean z) {
        String str;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Uri uri = (Uri) arrayList.get(i2);
            String uri2 = uri.toString();
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str2 = uri2.split("/1/")[1];
                    int indexOf = str2.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"));
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            if (!e21.b) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(uri);
                arrayList4 = arrayList5;
            } else {
                String S0 = gm.S0(uri);
                if (S0 == null) {
                    String uri3 = uri.toString();
                    String o = MediaController.o(-1L, uri, "file");
                    if (o == null) {
                        Ub();
                    } else {
                        str = uri3;
                        S0 = o;
                    }
                } else {
                    str = S0;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                }
                ArrayList arrayList6 = arrayList2;
                ArrayList arrayList7 = arrayList3;
                arrayList6.add(S0);
                arrayList7.add(str);
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            }
        }
        if (arrayList2 == null && arrayList4 == null) {
            return;
        }
        G6();
        a6a.U(i, this.l6, 0L, 0L, 0L, getAccountInstance(), this.D5, null, this.F5, this.m4, this.H5, null, null, X6(), null, null, arrayList2, arrayList3, arrayList4, null, null, null, null, z, false);
        E7(false);
    }

    public final void Ec() {
        long j;
        mz mzVar = this.m8;
        if (mzVar != null) {
            gm.r(mzVar);
        }
        mz mzVar2 = new mz(this, (byte) 19);
        this.m8 = mzVar2;
        if (this.h8 != null) {
            j = 2500;
        } else {
            j = 1000;
        }
        gm.d3(mzVar2, j);
    }

    public final void Ed() {
        int i;
        p7 p7Var = this.o0;
        if (p7Var == null) {
            return;
        }
        if (getMessagesController().i4.y(a()) && getMessagesController().i4.s(a())) {
            i = 0;
        } else {
            i = 8;
        }
        p7Var.e(i);
    }

    public final void F4(k47 k47Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        if (k47Var.D == 3) {
            heVar.U = jb6.M0(2131747912, null);
        } else {
            heVar.U = jb6.a0("NoHandleAppInstalled", null, 2131747939, k47Var.F0().mime_type);
        }
        showDialog(heVar);
    }

    public final void F5() {
        int i;
        float f = (1.0f - this.rd.e) * (1.0f - this.pd.e);
        this.y1.setTranslationX((1.0f - f) * gm.L(80.0f));
        this.y1.setAlpha(f);
        q02 q02Var = this.y1;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        q02Var.setVisibility(i);
    }

    public final void F6(CharSequence charSequence, ArrayList arrayList) {
        if (this.H5 != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            k47 k47Var = this.H5;
            if (!isEmpty) {
                k47Var.y1 = charSequence;
                k47Var.z1 = arrayList;
            } else if (k47Var.F3()) {
                k47 k47Var2 = this.H5;
                k47Var2.y1 = "";
                k47Var2.z1 = new ArrayList();
            } else {
                ms1 ms1Var = this.a0;
                if (ms1Var != null) {
                    this.H5.y1 = ms1Var.getFieldText();
                    k47 k47Var3 = this.H5;
                    if (k47Var3.y1 == null && !TextUtils.isEmpty(k47Var3.k.message)) {
                        this.H5.y1 = "";
                    }
                }
            }
        }
    }

    public final void F7(boolean z) {
        if (this.m3.getTag() != null && !this.s3) {
            if (!this.y3 || this.u3) {
                this.m3.setTag(null);
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.v3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.v3.playTogether(ObjectAnimator.ofFloat(this.m3, View.ALPHA, 0.0f));
                    this.v3.addListener(new yq1(this, (byte) 5));
                    this.v3.setStartDelay(this.p3);
                    this.v3.start();
                } else {
                    AnimatorSet animatorSet2 = this.v3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.v3 = null;
                    }
                    this.m3.setAlpha(0.0f);
                }
                this.p3 = (short) 500;
            }
        }
    }

    public final void F8() {
        if (oc7.r1(this.currentAccount).o2(this.l6, d(), null)) {
            yd(true);
            gm.d3(new mz(this, (byte) 11), 150L);
            this.j0.U(null, null);
            if (getParentActivity() != null) {
                c41.z(this, 4, 0, this.Ba).j();
                return;
            }
            return;
        }
        View view = this.t1.j;
        if (view instanceof a8) {
            ((a8) view).b();
        }
    }

    public final void F9(TLRPC.TL_game tL_game, k47 k47Var, String str, long j) {
        oc(tL_game, k47Var, str, false, j);
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        edit.putBoolean("askgame_" + j, false).commit();
    }

    public final void Fa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap q = a6a.q(1, str);
            PhotoViewer.r0().T1(null, this, this.Ba);
            ArrayList arrayList = new ArrayList();
            jo6 jo6Var = new jo6(0, str, 0, true, 0, 0);
            jo6Var.a = charSequence;
            arrayList.add(jo6Var);
            if (PhotoViewer.r0().V0()) {
                PhotoViewer.r0().A(false, false);
            }
            PhotoViewer.r0().o1(arrayList, 0, 0, false, new tt1(this, q, arrayList), this);
            return;
        }
        F6(charSequence, null);
        j5 accountInstance = getAccountInstance();
        long j = this.l6;
        k47 k47Var = this.F5;
        k47 k47Var2 = this.m4;
        a6a.a0(0, 0, j, 0L, 0L, k7(), accountInstance, this.D5, k47Var, k47Var2, this.H5, this.y5, X6(), null, null, str, null, null, null, null, true, false, false);
        E4();
    }

    public final void Fb(k47 k47Var, rc2 rc2Var, int i, boolean z) {
        boolean z2;
        f47 v7 = v7(k47Var);
        boolean z3 = false;
        if (v7 != null) {
            ArrayList arrayList = v7.d;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (this.o6[i].indexOfKey(((k47) arrayList.get(i2)).e1()) < 0) {
                        break;
                    }
                    i2++;
                } else {
                    v7 = null;
                    break;
                }
            }
        }
        if (v7 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        rc2Var.setDrawSelectionBackground(z2);
        if (v7 == null) {
            z3 = true;
        }
        rc2Var.o3(true, z3, z);
    }

    public final void Fc(int i) {
        int i2;
        boolean z;
        if (!this.mb && (i2 = i - this.D0.K) >= 0) {
            ArrayList arrayList = this.M6;
            if (i2 < arrayList.size()) {
                k47 k47Var = (k47) arrayList.get(i2);
                SparseArray[] sparseArrayArr = this.o6;
                if (sparseArrayArr[0].get(k47Var.e1(), null) == null && sparseArrayArr[1].get(k47Var.e1(), null) == null) {
                    z = true;
                } else {
                    z = false;
                }
                SparseArray sparseArray = new SparseArray();
                for (int i3 = 0; i3 < sparseArrayArr[0].size(); i3++) {
                    sparseArray.put(sparseArrayArr[0].keyAt(i3), (k47) sparseArrayArr[0].valueAt(i3));
                }
                for (int i4 = 0; i4 < sparseArrayArr[1].size(); i4++) {
                    sparseArray.put(sparseArrayArr[1].keyAt(i4), (k47) sparseArrayArr[1].valueAt(i4));
                }
                r59 r59Var = this.A0;
                ?? obj = new Object();
                obj.d = this;
                obj.b = z;
                obj.c = sparseArray;
                if (!r59Var.c2) {
                    r59Var.l2 = new int[2];
                    r59Var.o1(r59Var, true);
                    r59Var.g2 = obj;
                    r59Var.c2 = true;
                    r59Var.f2 = i;
                    r59Var.e2 = i;
                }
            }
        }
    }

    public final void Fd(rac racVar) {
        int i;
        int i2;
        vr1 vr1Var = this.A0;
        if (vr1Var != null) {
            if (!this.R4 && this.b8 != null) {
                int childCount = vr1Var.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i3);
                    if (childAt instanceof rc2) {
                        k47 messageObject = ((rc2) childAt).getMessageObject();
                        k47 k47Var = this.b8;
                        if (messageObject == k47Var) {
                            ArrayList arrayList = this.M6;
                            if (arrayList.indexOf(k47Var) >= 0) {
                                i = arrayList.indexOf(this.b8) + this.D0.K;
                                i2 = i7(childAt);
                            }
                        }
                    }
                    i3++;
                }
            }
            i = -1;
            i2 = 0;
            int childCount2 = this.A0.getChildCount();
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.getEditingMessageObject();
            }
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = this.A0.getChildAt(i4);
                if (childAt2 instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt2;
                    k47 messageObject2 = rc2Var.getMessageObject();
                    if (((Boolean) racVar.a(messageObject2)).booleanValue()) {
                        messageObject2.M1 = true;
                        rc2Var.z3(messageObject2, rc2Var.getCurrentMessagesGroup(), rc2Var.K2(), rc2Var.L2(), rc2Var.C2(), rc2Var.G2());
                        hu1 hu1Var = this.D0;
                        this.A0.getClass();
                        hu1Var.L(RecyclerView.R(rc2Var));
                    }
                }
            }
            if (i != -1) {
                this.C0.g1(i, i2);
            }
        }
    }

    @Override
    public final void G(final jo6 jo6Var, final rcc rccVar, final boolean z, final int i, final boolean z2, long j) {
        if (jo6Var == null) {
            return;
        }
        this.od.a(false, true);
        k47 k47Var = this.H5;
        if (k47Var != null && k47Var.o5() && !sd2.z(this.currentAccount, 24, k47.B0(this.H5.k))) {
            v67 v67Var = this.y5;
            if (v67Var == null) {
                v67Var = v67.b(this.H5.k.suggested_post);
            }
            if (!jva.Q(this.currentAccount, v67Var.a)) {
                wc(v67Var);
                return;
            }
        }
        if (rccVar != null && rccVar.s) {
            ho1 ho1Var = new ho1(this, (byte) 3);
            this.I7 = ho1Var;
            gm.d3(ho1Var, 3000L);
        }
        F6(jo6Var.a, jo6Var.n);
        ik.Y(this.currentAccount, a(), 1, new qac() {
            @Override
            public final void a(Object obj) {
                Long l = (Long) obj;
                yv1 yv1Var = yv1.this;
                k47 k47Var2 = yv1Var.H5;
                jo6 jo6Var2 = jo6Var;
                rcc rccVar2 = rccVar;
                boolean z3 = z;
                int i2 = i;
                boolean z4 = z2;
                if (k47Var2 != null && k47Var2.o5()) {
                    v67 v67Var2 = yv1Var.y5;
                    if (v67Var2 == null) {
                        v67Var2 = v67.b(yv1Var.H5.k.suggested_post);
                    }
                    v67 v67Var3 = v67Var2;
                    if (jo6Var2.b) {
                        j5 accountInstance = yv1Var.getAccountInstance();
                        String str = jo6Var2.I;
                        String str2 = jo6Var2.g;
                        TLRPC.Photo photo = jo6Var2.e;
                        long j2 = yv1Var.l6;
                        k47 k47Var3 = yv1Var.H5;
                        k47 k47Var4 = yv1Var.m4;
                        nv1 nv1Var = yv1Var.D5;
                        ArrayList arrayList = jo6Var2.n;
                        int i3 = jo6Var2.x;
                        boolean z5 = jo6Var2.M;
                        CharSequence charSequence = jo6Var2.a;
                        a6a.a0(i3, i2, j2, jo6Var2.y, l.longValue(), yv1Var.k7(), accountInstance, nv1Var, k47Var3, k47Var4, null, v67Var3, yv1Var.X6(), rccVar2, charSequence, str, str2, arrayList, photo, null, z3, z4, z5);
                    } else if (jo6Var2.h != null) {
                        a6a.Y(yv1Var.getAccountInstance(), jo6Var2.h, jo6Var2.c, null, yv1Var.l6, yv1Var.H5, yv1Var.m4, yv1Var.D5, jo6Var2.n, jo6Var2.r, null, jo6Var2.x, null, rccVar2, z3, i2, z4, jo6Var2.a, yv1Var.X6(), jo6Var2.y, l.longValue(), yv1Var.k7(), v67Var3);
                    } else if (jo6Var2.I != null) {
                        a6a.Y(yv1Var.getAccountInstance(), jo6Var2.I, jo6Var2.c, null, yv1Var.l6, yv1Var.H5, yv1Var.m4, yv1Var.D5, jo6Var2.n, jo6Var2.r, null, jo6Var2.x, null, rccVar2, z3, i2, z4, jo6Var2.a, yv1Var.X6(), jo6Var2.y, l.longValue(), yv1Var.k7(), v67Var3);
                    }
                } else if (jo6Var2.b) {
                    j5 accountInstance2 = yv1Var.getAccountInstance();
                    String str3 = jo6Var2.I;
                    String str4 = jo6Var2.g;
                    TLRPC.Photo photo2 = jo6Var2.e;
                    long j3 = yv1Var.l6;
                    k47 k47Var5 = yv1Var.F5;
                    k47 k47Var6 = yv1Var.m4;
                    nv1 nv1Var2 = yv1Var.D5;
                    ArrayList arrayList2 = jo6Var2.n;
                    int i4 = jo6Var2.x;
                    k47 k47Var7 = yv1Var.H5;
                    boolean z6 = jo6Var2.M;
                    CharSequence charSequence2 = jo6Var2.a;
                    a6a.a0(i4, i2, j3, jo6Var2.y, l.longValue(), yv1Var.k7(), accountInstance2, nv1Var2, k47Var5, k47Var6, k47Var7, yv1Var.y5, yv1Var.X6(), rccVar2, charSequence2, str3, str4, arrayList2, photo2, null, z3, z4, z6);
                } else if (jo6Var2.h != null) {
                    a6a.Y(yv1Var.getAccountInstance(), jo6Var2.h, jo6Var2.c, null, yv1Var.l6, yv1Var.F5, yv1Var.m4, yv1Var.D5, jo6Var2.n, jo6Var2.r, null, jo6Var2.x, yv1Var.H5, rccVar2, z3, i2, z4, jo6Var2.a, yv1Var.X6(), jo6Var2.y, l.longValue(), yv1Var.k7(), yv1Var.y5);
                } else if (jo6Var2.I != null) {
                    a6a.Y(yv1Var.getAccountInstance(), jo6Var2.I, jo6Var2.c, null, yv1Var.l6, yv1Var.F5, yv1Var.m4, yv1Var.D5, jo6Var2.n, jo6Var2.r, null, jo6Var2.x, yv1Var.H5, rccVar2, z3, i2, z4, jo6Var2.a, yv1Var.X6(), jo6Var2.y, l.longValue(), yv1Var.k7(), yv1Var.y5);
                }
                yv1Var.E4();
            }
        }, j);
    }

    public final void G4() {
        long j;
        vd2 vd2Var = this.ma;
        if (vd2Var != null) {
            if (this.x4) {
                if (vd2Var.I != null) {
                    if (getParentLayout() != null) {
                        de0.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f, this.r4, this.l6, this.Sa, this.Ra);
                    }
                    TLRPC.Chat chat = this.e;
                    TLRPC.TL_forumTopic tL_forumTopic = this.ma.I;
                    long j2 = this.l6;
                    int i = this.Ra;
                    int i2 = this.Sa;
                    if (getParentLayout() != null) {
                        de0.a(this, getParentLayout().getFragmentStack().indexOf(this), chat, null, tL_forumTopic, j2, i, i2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", this.ma.a);
                    bundle.putInt("dialog_filter_id", this.ma.b);
                    bundle.putBoolean("pulled", true);
                    yv1 h = no4.h(this, -this.l6, this.ma.I, 0, bundle);
                    h.oa = true;
                    Ed = true;
                    presentFragment(h, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = vd2Var.H;
            long j3 = 0;
            if (chat2 == null) {
                j = 0;
            } else {
                j = chat2.id;
            }
            if (j != 0) {
                B4();
                vd2 vd2Var2 = this.ma;
                TLRPC.Chat chat3 = vd2Var2.H;
                long j4 = vd2Var2.a0;
                int i3 = vd2Var2.a;
                int i4 = vd2Var2.b;
                if (getParentLayout() != null) {
                    de0.a(this, getParentLayout().getFragmentStack().indexOf(this), chat3, null, null, j4, i3, i4);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = this.ma.H;
                if (chat4 != null) {
                    j3 = chat4.id;
                }
                bundle2.putLong("chat_id", j3);
                bundle2.putInt("dialog_folder_id", this.ma.a);
                bundle2.putInt("dialog_filter_id", this.ma.b);
                bundle2.putBoolean("pulled", true);
                oc7.r1(this.currentAccount).W3.edit().remove("diditem" + this.ma.a0).apply();
                yv1 yv1Var = new yv1(bundle2);
                ArrayList arrayList = this.Nb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = this.Nb;
                    yv1Var.Nb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                yv1Var.oa = true;
                Ed = true;
                presentFragment(yv1Var, true);
            }
        }
    }

    public final void G5() {
        yv1 yv1Var = this.Aa;
        if (yv1Var != null) {
            yv1Var.G5();
        }
        float f = 0.0f;
        if (!this.mb) {
            f = gm.L(1.0f) + this.actionBar.getMeasuredHeight() + 0.0f;
        }
        float t7 = t7(gm.L(7.0f)) + f;
        if (this.g2 != null) {
            t7 += u7(izb.a);
        }
        if (this.D1 != null) {
            t7 += gm.L(35.0f) * this.D1.F;
        }
        this.Z.setFadeZoneTop((int) ((U6() * gm.L(43.0f)) + t7));
    }

    public final void G6() {
        CharSequence charSequence;
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            charSequence = ms1Var.getFieldText();
        } else {
            charSequence = null;
        }
        F6(charSequence, null);
    }

    public final void G7(boolean z) {
        if (this.n3.getTag() != null && !this.t3) {
            if (!this.z3 || this.u3) {
                this.n3.setTag(null);
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x3, 0.0f);
                    this.w3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.w3.addUpdateListener(new em1(this, (byte) 1));
                    this.w3.addListener(new yq1(this, (byte) 7));
                    this.w3.setStartDelay(this.p3);
                    this.w3.start();
                } else {
                    ValueAnimator valueAnimator = this.w3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.w3 = null;
                    }
                    this.x3 = 0.0f;
                    Tc();
                }
                this.p3 = (short) 500;
            }
        }
    }

    public final void G8() {
        if (this.m3.getAlpha() != 0.0f && !this.actionBar.y() && !c8()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.m3.getCustomDate() * 1000);
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.clear();
            calendar.set(i, i2, i3);
            l8((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public final void G9(int i) {
        this.actionBar.getActionBarMenuOnItemClick().b(i);
    }

    public final void Ga() {
        this.g6 = true;
        this.fragmentBeginToShow = true;
        this.sa = null;
        this.m1.invalidate();
        this.m1.setSkipBackgroundDrawing(false);
        this.pa = false;
        this.fragmentView.setAlpha(1.0f);
        this.p1.setTranslationY(0.0f);
        this.p1.getAvatarImageView().setScaleX(1.0f);
        this.p1.getAvatarImageView().setScaleY(1.0f);
        this.p1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Gb(TLRPC.ChatTheme chatTheme) {
        boolean z;
        boolean z2;
        if (this.Ba != null && this.za == null) {
            fnb c = fnb.c(chatTheme);
            uf2 e = uf2.e(this.currentAccount);
            e.q(this.l6, fnb.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                e.n(chatTheme);
                tz3 g = e.g(c);
                if (g == null) {
                    g = new tz3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    g.k();
                    g.m(this.currentAccount);
                }
                tz3 tz3Var = g;
                wv1 wv1Var = this.Ba;
                TLRPC.WallPaper wallPaper = wv1Var.g;
                if (this.h6 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wv1Var.q(tz3Var, wallPaper, z2, null, false);
                return;
            }
            if (c != null && !c.b()) {
                gm1 gm1Var = new gm1(this, (byte) 14);
                String str = c.b;
                if (c.b()) {
                    gm1Var.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    tz3 tz3Var2 = (tz3) e.e.get(str);
                    if (tz3Var2 != null) {
                        tz3Var2.k();
                        gm1Var.onComplete(tz3Var2);
                    } else {
                        gm1Var.onComplete(null);
                    }
                } else {
                    e.o(new sf2(c, gm1Var), false);
                }
            }
            TLRPC.WallPaper c2 = e.c(this.l6);
            wv1 wv1Var2 = this.Ba;
            tz3 tz3Var3 = wv1Var2.f;
            if (this.h6 != 0) {
                z = true;
            } else {
                z = false;
            }
            wv1Var2.q(tz3Var3, c2, z, null, false);
        }
    }

    public final void Gc() {
        gm.d0(this.A0, new ra((byte) 2, this, S7()));
    }

    public final void Gd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Gd(boolean):void");
    }

    public final void H4(boolean z, boolean z2) {
        long j;
        TLRPC.DraftMessage T;
        Long l;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j2;
        k47 k47Var;
        TLRPC.TL_forumTopic f;
        TLRPC.Message message2;
        k47 k47Var2;
        String str;
        int Y;
        TLRPC.SuggestedPost suggestedPost;
        long j3;
        int i;
        long j4;
        Paint.FontMetricsInt fontMetricsInt;
        gn gnVar;
        TLRPC.InputReplyTo inputReplyTo;
        long j5;
        TLRPC.Message message3;
        Pair pair;
        Long l2;
        TLRPC.DraftMessage draftMessage;
        if (this.a0 != null) {
            int i2 = this.g4;
            int i3 = 8;
            if (i2 == 0 || i2 == 8 || (i2 == 3 && getUserConfig().e() == f7())) {
                long j6 = 0;
                if (this.g4 == 8) {
                    if (sd2.p0(this.e)) {
                        if (this.s4 == 0 && sd2.A(this.currentAccount, this.e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                nv1 nv1Var = null;
                nv1 nv1Var2 = null;
                nv1Var = null;
                nv1Var = null;
                nv1Var = null;
                if (V7()) {
                    vh6 vh6Var = (vh6) getMediaDataController().u1.f(this.l6);
                    if (vh6Var != null && vh6Var.m() > 0) {
                        pair = new Pair(Long.valueOf(vh6Var.j(0)), vh6Var.n(0));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        l2 = (Long) pair.first;
                        draftMessage = (TLRPC.DraftMessage) pair.second;
                    } else {
                        l2 = null;
                        draftMessage = null;
                    }
                    T = draftMessage;
                    l = l2;
                } else {
                    hs6 mediaDataController = getMediaDataController();
                    long j7 = this.l6;
                    if (this.g4 == 3) {
                        j = 0;
                    } else {
                        j = this.s4;
                    }
                    T = mediaDataController.T(j7, j);
                    l = null;
                }
                ms1 ms1Var = this.a0;
                if (T != null) {
                    richMessage = T.rich_message;
                } else {
                    richMessage = null;
                }
                ms1Var.setRichDraftPreview(richMessage);
                cs6 U = hs6.d0(this.currentAccount).U(this.l6, d());
                if (T != null && (inputReplyTo = T.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    hs6 mediaDataController2 = getMediaDataController();
                    long j8 = this.l6;
                    if (l != null) {
                        j5 = l.longValue();
                    } else {
                        j5 = this.s4;
                    }
                    vh6 vh6Var2 = (vh6) mediaDataController2.v1.f(j8);
                    if (vh6Var2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) vh6Var2.f(j5);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z2 || T == null) && this.a0.getFieldText() != null && (this.g4 != 0 || getUserConfig().e() != a() || T == null || this.Qc >= T.date)) {
                    if (z && T == null) {
                        this.a0.setFieldText("");
                        this.a0.setEffectId(0L);
                        E7(true);
                    }
                } else if (U != null) {
                    this.a0.setVoiceDraft(U);
                } else if (T != null) {
                    this.Qc = T.date;
                    ms1 ms1Var2 = this.a0;
                    ms1Var2.N3 = null;
                    ms1Var2.O3 = !T.no_webpage;
                    boolean isEmpty = T.entities.isEmpty();
                    ?? r11 = T.message;
                    if (!isEmpty) {
                        r11 = SpannableStringBuilder.valueOf(r11);
                        Collections.sort(T.entities, hs6.g2);
                        int i4 = 0;
                        while (i4 < T.entities.size()) {
                            TLRPC.MessageEntity messageEntity = T.entities.get(i4);
                            if (!(messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName)) {
                                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                    j3 = j6;
                                    i = i3;
                                    j4 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                } else {
                                    j3 = j6;
                                    i = i3;
                                    if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                        if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                            ?? obj = new Object();
                                            obj.a |= 1;
                                            xkb xkbVar = new xkb(obj, 0);
                                            int i5 = messageEntity.offset;
                                            hs6.f(xkbVar, i5, messageEntity.length + i5, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                            ?? obj2 = new Object();
                                            obj2.a |= 2;
                                            xkb xkbVar2 = new xkb(obj2, 0);
                                            int i6 = messageEntity.offset;
                                            hs6.f(xkbVar2, i6, messageEntity.length + i6, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                            ?? obj3 = new Object();
                                            obj3.a |= i;
                                            xkb xkbVar3 = new xkb(obj3, 0);
                                            int i7 = messageEntity.offset;
                                            hs6.f(xkbVar3, i7, messageEntity.length + i7, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                            ?? obj4 = new Object();
                                            obj4.a |= 16;
                                            xkb xkbVar4 = new xkb(obj4, 0);
                                            int i8 = messageEntity.offset;
                                            hs6.f(xkbVar4, i8, messageEntity.length + i8, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                            i6c i6cVar = new i6c(messageEntity.url, null);
                                            int i9 = messageEntity.offset;
                                            r11.setSpan(i6cVar, i9, messageEntity.length + i9, 33);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                            ?? obj5 = new Object();
                                            obj5.a |= 256;
                                            xkb xkbVar5 = new xkb(obj5, 0);
                                            int i10 = messageEntity.offset;
                                            hs6.f(xkbVar5, i10, messageEntity.length + i10, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                            int i11 = messageEntity.offset;
                                            f09.c(r11, i11, messageEntity.length + i11, messageEntity.collapsed);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                            try {
                                                fontMetricsInt = this.a0.getEditField().getPaint().getFontMetricsInt();
                                            } catch (Exception e) {
                                                fc4.g(e, false);
                                                fontMetricsInt = null;
                                            }
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                            if (tL_messageEntityCustomEmoji.document != null) {
                                                gnVar = new gn(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                            } else {
                                                gnVar = new gn(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                            }
                                            int i12 = messageEntity.offset;
                                            r11.setSpan(gnVar, i12, messageEntity.length + i12, 33);
                                        }
                                    } else {
                                        ?? obj6 = new Object();
                                        obj6.a |= 4;
                                        xkb xkbVar6 = new xkb(obj6, 0);
                                        int i13 = messageEntity.offset;
                                        hs6.f(xkbVar6, i13, messageEntity.length + i13, r11, true);
                                    }
                                    i4++;
                                    i3 = i;
                                    j6 = j3;
                                }
                            } else {
                                j3 = j6;
                                i = i3;
                                j4 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                            }
                            if (messageEntity.offset + messageEntity.length < r11.length() && r11.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            j6c j6cVar = new j6c(String.valueOf(j4), 3, null);
                            int i14 = messageEntity.offset;
                            r11.setSpan(j6cVar, i14, messageEntity.length + i14, 33);
                            i4++;
                            i3 = i;
                            j6 = j3;
                        }
                    }
                    j2 = j6;
                    this.a0.J1(r11, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.a0.setSelection(T.message.indexOf(10) + 1);
                        gm.d3(new mz(this, (byte) 6), 700L);
                    }
                    this.a0.setEffectId(T.effect);
                    if (T != null && (suggestedPost = T.suggested_post) != null) {
                        v67 b = v67.b(suggestedPost);
                        this.y5 = b;
                        fc(b);
                    }
                    k47Var = this.F5;
                    if (k47Var != null || this.m4 == k47Var) {
                        if (message == null && ((k47Var2 = this.m4) == null || k47Var2.e1() != message.id)) {
                            k47 k47Var3 = new k47(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = k47Var3;
                            TLRPC.InputReplyTo inputReplyTo2 = T.reply_to;
                            if (inputReplyTo2 != null) {
                                int i15 = inputReplyTo2.flags;
                                if ((i15 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i16 = -1;
                                    if (arrayList != null) {
                                        int i17 = inputReplyTo2.quote_offset;
                                        if (!arrayList.isEmpty()) {
                                            k47.B0(k47Var3.k);
                                            ?? obj7 = new Object();
                                            obj7.a = k47Var3;
                                            obj7.b = -1;
                                            obj7.c = -1;
                                            obj7.d = -1;
                                            obj7.m = true;
                                            obj7.e(i17, arrayList);
                                            nv1Var2 = obj7;
                                        }
                                        this.D5 = nv1Var2;
                                    } else {
                                        String str2 = inputReplyTo2.quote_text;
                                        if ((i15 & 16) != 0) {
                                            i16 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = k47Var3.k;
                                        if (message4 != null && (str = message4.message) != null && str2 != null && (Y = k47.Y(i16, str, str2)) >= 0) {
                                            k47.B0(k47Var3.k);
                                            nv1Var = new nv1(Y, str2.length() + Y, k47Var3);
                                        }
                                        this.D5 = nv1Var;
                                    }
                                }
                            }
                            i5(false);
                            nv1 nv1Var3 = this.D5;
                            k47 k47Var4 = this.F5;
                            if (nv1Var3 != null) {
                                ec(k47Var4, nv1Var3);
                            } else {
                                dc(k47Var4);
                            }
                            Pc(false);
                            return;
                        } else if (l == null && l.longValue() != j2 && this.e != null && (f = getMessagesController().g4.f(this.e.id, l.longValue())) != null && (message2 = f.topicStartMessage) != null) {
                            k47 k47Var5 = new k47(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = k47Var5;
                            k47Var5.j1 = f;
                            dc(k47Var5);
                            Pc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j2 = 0;
                if (T != null) {
                    v67 b2 = v67.b(suggestedPost);
                    this.y5 = b2;
                    fc(b2);
                }
                k47Var = this.F5;
                if (k47Var != null) {
                }
                if (message == null) {
                }
                if (l == null) {
                }
            }
        }
    }

    public final void H5() {
        if (this.b1 != null) {
            this.b1.setPadding(gm.L(7.0f) + ((int) ((1.0f - U6()) * (1.0f - this.rd.e) * o7())), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        }
    }

    public final void H6(boolean z) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.r8 != null && !sd2.r0(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.r8;
            long j = chatFull.inviterId;
            if (j != 0) {
                this.r = j;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.r = chatParticipant.inviter_id;
                    return;
                }
                long e = getUserConfig().e();
                int size = this.r8.participants.participants.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.r8.participants.participants.get(i);
                    if (chatParticipant2.user_id == e) {
                        this.r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z && this.r == 0) {
                getMessagesController().C(this.e.id, false);
            }
        }
    }

    public final void H7(boolean z) {
        if (!z) {
            hg5 hg5Var = this.B2;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            hg5 hg5Var2 = this.v2;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
            hg5 hg5Var3 = this.x2;
            if (hg5Var3 != null) {
                hg5Var3.f(true);
            }
        }
        hg5 hg5Var4 = this.A2;
        if (hg5Var4 != null) {
            hg5Var4.f(true);
        }
        hg5 hg5Var5 = this.z2;
        if (hg5Var5 != null) {
            hg5Var5.f(true);
        }
        hg5 hg5Var6 = this.I2;
        if (hg5Var6 != null) {
            hg5Var6.f(true);
        }
        hg5 hg5Var7 = this.J2;
        if (hg5Var7 != null) {
            hg5Var7.f(true);
        }
        hg5 hg5Var8 = this.C2;
        if (hg5Var8 != null) {
            hg5Var8.f(true);
        }
        hg5 hg5Var9 = this.D2;
        if (hg5Var9 != null) {
            hg5Var9.f(true);
        }
        qh2 qh2Var = this.K2;
        if (qh2Var != null) {
            qh2Var.f(true);
        }
        hg5 hg5Var10 = this.Y0;
        if (hg5Var10 != null) {
            hg5Var10.f(true);
        }
        hg5 hg5Var11 = this.a1;
        if (hg5Var11 != null) {
            hg5Var11.f(true);
        }
        hg5 hg5Var12 = this.Z0;
        if (hg5Var12 != null) {
            hg5Var12.f(true);
        }
    }

    public final void H8(TLRPC.TL_document tL_document, String str, Object obj, boolean z, int i) {
        a6a.B(this.currentAccount).t0(tL_document, str, this.l6, this.F5, this.m4, null, this.D5, null, z, i, 0, false, obj, X6(), 0L, k7(), this.y5);
    }

    public final void H9() {
        int i;
        String str;
        int i2;
        Activity parentActivity = getParentActivity();
        int i3 = this.currentAccount;
        long j = this.l6;
        wv1 wv1Var = this.Ba;
        int i4 = ua2.M;
        my0 my0Var = new my0(1, (ylb) wv1Var, (Context) parentActivity, false);
        my0Var.L(cmb.g5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624078, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gm.L(80.0f);
        int i5 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i5, wv1Var));
        wmb M = anb.M(i5);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, wv1Var);
        linearLayout.addView((View) imageView, qoe.t(80, 80, 1, 0, 16, 0, 16));
        boolean H3 = oc7.r1(i3).H3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        int i6 = cmb.i5;
        anb.X(textView, i6, wv1Var);
        textView.setTextSize(1, 20.0f);
        if (H3) {
            i = 2131746771;
        } else {
            i = 2131746772;
        }
        textView.setText(jb6.M0(i, null));
        linearLayout.addView(textView, qoe.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        anb.X(textView2, i6, wv1Var);
        textView2.setTextSize(1, 14.0f);
        if (j > 0) {
            str = m9c.k(oc7.r1(i3).W1(Long.valueOf(j)), true);
        } else {
            str = "";
        }
        if (H3) {
            i2 = 2131746769;
        } else {
            i2 = 2131746770;
        }
        hg9.q(null, null, i2, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, qoe.t(-1, -2, 1, 12, 9, 12, 19));
        if (!H3) {
            cj8 cj8Var = new cj8(wv1Var, parentActivity, true);
            cj8Var.setOnClickListener(new di(my0Var, (byte) 4));
            cj8Var.c(jb6.M0(2131746773, null), false, false);
            linearLayout.addView(cj8Var, qoe.t(-1, 48, 1, 0, 0, 0, 4));
        }
        my0Var.O = linearLayout;
        my0Var.show();
    }

    public final void Ha(long j, boolean z) {
        if (this.g2 != null && m9c.w(this.f)) {
            this.g2.setAllTopicsHidden(true);
        }
        this.e6.put(j, 1);
        i6();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.l6, 0, new ap1(this, j, z), new xo0(this, j, (byte) 5));
        this.D0.J(false);
    }

    public final void Hb(View view, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Hb(viewGroup.getChildAt(i), z);
            }
        }
        if (view != this.A0 && view != this.m1) {
            view.setEnabled(z);
        }
    }

    public final void Hc(boolean z) {
        if (!getMessagesController().o2(this.l6, d(), null)) {
            if (z) {
                getNotificationsController().G(this.l6, d(), true);
                return;
            }
            my0 C = ik.C(this.l6, d(), this.Ba, this);
            boolean Y7 = Y7();
            C.i0 = Y7;
            C.n = Y7;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.l6, d(), false);
        if (!z) {
            c41.z(this, 4, 0, this.Ba).j();
        }
    }

    public final boolean I4() {
        if (!sd2.u0(this.e)) {
            TLRPC.User user = this.f;
            if (!m9c.w(user) || !user.bot_forum_sidebar) {
                if (!m9c.w(this.f) && !sd2.a(this.e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void I5() {
        float f = this.T9;
        ys1 ys1Var = this.D1;
        if (ys1Var != null) {
            ys1Var.setTranslationY(f);
            f += gm.L(35.0f) * this.D1.F;
        }
        js1 js1Var = this.E1;
        if (js1Var != null) {
            js1Var.setTranslationY(f);
        }
        float U6 = (U6() * gm.L(43.0f)) + f;
        mzb mzbVar = this.g2;
        izb izbVar = izb.a;
        if (mzbVar != null) {
            mzbVar.setSideMenuBackgroundMarginTop((U6() * t7(gm.L(7.0f))) + U6);
            float u7 = u7(izbVar);
            float a = aie.a(this.rd.e);
            float U62 = U6();
            U6 += aie.a(Math.min(pqe.a(aie.a(a), 0.0f, 1.0f), pqe.a(aie.a(U62), 0.0f, 1.0f))) * u7;
        }
        r02 r02Var = this.b1;
        if (r02Var != null) {
            r02Var.setTranslationY((U6 - gm.L(5.0f)) - (U6() * u7(izbVar)));
        }
    }

    public final void I6(defpackage.k47 r78, java.util.ArrayList r79, java.util.ArrayList r80, java.util.ArrayList r81) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.I6(k47, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void I7() {
        ValueAnimator valueAnimator = this.Ob;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        cm1 cm1Var = this.o3;
        if (cm1Var != null && cm1Var.getTag() != null) {
            this.o3.setTag(null);
            cm1 cm1Var2 = this.o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new zm1(this, cm1Var2, (byte) 1));
            ofFloat.addListener(new u5(this, cm1Var2, (byte) 7));
            ofFloat.setDuration(150L);
            this.Ob = ofFloat;
            ofFloat.start();
        }
    }

    public final void I8(int i, View view) {
        gn gnVar;
        TLRPC.User user;
        char c;
        ps1 ps1Var;
        ps1 ps1Var2;
        if (i != 0) {
            k17 adapter = this.X1.getAdapter();
            if (adapter.x0 != null && !adapter.i0) {
                return;
            }
            int i2 = i - 1;
            Object J = this.X1.getAdapter().J(i2);
            int i3 = this.X1.getAdapter().Y;
            int i4 = this.X1.getAdapter().Z;
            if (this.X1.getAdapter().G != null && i2 == 1) {
                this.a0.q1(i3, i4, this.X1.getAdapter().G + "@" + sd2.K(this.e, false) + " ", false);
            } else if (this.X1.getAdapter().G != null && i2 == 0) {
                this.a0.q1(i3, i4, b10.j(new StringBuilder(), this.X1.getAdapter().G, " "), false);
            } else if (J instanceof oz8) {
                if (!getUserConfig().p()) {
                    showDialog(new kj8(this, getParentActivity(), this.currentAccount, true, 31, false, null));
                    return;
                }
                oz8 oz8Var = (oz8) J;
                ik.X(this.currentAccount, this.l6, Math.max(1, oz8Var.a()), new x0(this, oz8Var, (byte) 18));
            } else {
                g47 g47Var = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (this.g4 != 0 || !r5(view)) {
                        if (view instanceof v0b) {
                            g47Var = ((v0b) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        ik.X(this.currentAccount, a(), 1, new hv0(this, tL_document, k47.U(tL_document), this.X1.getAdapter().L(i2), g47Var, (byte) 4));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (this.C3 && (ps1Var2 = this.g3) != null && ps1Var2.getVisibility() == 0) {
                        ub(chat, null);
                        return;
                    }
                    String K = sd2.K(chat, false);
                    if (K != null) {
                        this.a0.q1(i3, i4, kt6.o("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (this.C3 && (ps1Var = this.g3) != null && ps1Var.getVisibility() == 0) {
                        ub(null, user2);
                    } else if (m9c.p(user2) != null) {
                        this.a0.q1(i3, i4, "@" + m9c.p(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(td4.p(m9c.k(user2, false), " "));
                        spannableString.setSpan(new j6c(String.valueOf(user2.id), 3, null), 0, spannableString.length(), 33);
                        this.a0.q1(i3, i4, spannableString, false);
                    }
                } else if (J instanceof h17) {
                    if (this.X1.getAdapter().K != null && this.g4 != 1) {
                        h17 h17Var = (h17) J;
                        y5a b = y5a.b(h17Var.a, this.l6, this.F5, this.m4, null, false, null, null, null, true, 0, 0, null, false);
                        b.K = X6();
                        b.X = h17Var.b;
                        b.R = k7();
                        b.T = this.y5;
                        getSendMessagesHelper().q0(b);
                        this.a0.setFieldText("");
                        E7(false);
                    }
                } else if (J instanceof String) {
                    if (this.X1.getAdapter().K != null) {
                        if (this.g4 == 1) {
                            ik.J(getParentActivity(), this.l6, new g11(this, (String) J, (byte) 13), this.Ba);
                            return;
                        } else if (!r5(view)) {
                            ik.X(this.currentAccount, this.l6, 1, new x0(this, (String) J, (byte) 19));
                            return;
                        } else {
                            return;
                        }
                    }
                    this.a0.q1(i3, i4, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (this.a0.getFieldText() != null) {
                        if (this.g4 == 1 || !r5(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (this.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c = 2;
                                } else {
                                    c = 0;
                                }
                                if (c != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                                    String M0 = jb6.M0(2131745330, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    if (c == 1) {
                                        heVar.U = jb6.M0(2131750408, null);
                                    } else {
                                        heVar.U = jb6.M0(2131748860, null);
                                    }
                                    alertDialog$Builder.g(jb6.M0(2131747564, null), null);
                                    showDialog(heVar);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(this.X1.getAdapter().S);
                                this.fb = arrayList;
                                PhotoViewer.r0().T1(null, this, this.Ba);
                                PhotoViewer.r0().o1(arrayList, this.X1.getAdapter().M(i2), 3, false, this.gb, this);
                                return;
                            }
                            ik.X(this.currentAccount, a(), 1, new x0(this, botInlineResult, (byte) 20));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    uj1 uj1Var = new uj1(this, (TLRPC.TL_inlineBotWebView) J, (byte) 9);
                    if (this.Rb) {
                        uj1Var.run();
                    } else {
                        quc.a(getParentActivity(), new x0(this, uj1Var, (byte) 21), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    es1 es1Var = this.X1;
                    if (es1Var != null && (user = es1Var.getAdapter().x0) != null) {
                        this.a0.setFieldText("");
                        long j = this.l6;
                        if (j == user.id) {
                            this.x8 = j;
                            getMessagesController().G4(tL_inlineBotSwitchPM.start_param, this.f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", this.l6);
                        if (getMessagesController().A(bundle, this, null, null)) {
                            presentFragment(new yv1(bundle));
                        }
                    }
                } else if (J instanceof ds6) {
                    String str = ((ds6) J).a;
                    ms1 ms1Var = this.a0;
                    ms1Var.X();
                    ms1Var.V0.d(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            this.a0.q1(i3, i4, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = this.a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                fc4.g(e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e2 = vm.e(this.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(k47.U(e2));
                            if (e2 != null) {
                                gnVar = new gn(e2, fontMetricsInt);
                            } else {
                                gnVar = new gn(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(gnVar, 0, spannableString2.length(), 33);
                            this.a0.q1(i3, i4, spannableString2, false);
                            this.X1.o(false);
                        }
                    }
                    this.a0.q1(i3, i4, str, true);
                    this.X1.o(false);
                }
            }
        }
    }

    public final void I9(long j) {
        if (jva.v(this.currentAccount, false).m().amount < j) {
            new dxa(getParentActivity(), getResourceProvider(), j, 13, pg3.s(a()), new en1(this, (byte) 25), a()).show();
        } else {
            new exa(getParentActivity(), this.resourceProvider).show();
        }
    }

    public final boolean Ia() {
        if (this.V4.size() != 1 || this.n4 == null || ((Integer) this.V4.get(0)).intValue() != this.n4.e1()) {
            return false;
        }
        return true;
    }

    public final void Ib(boolean z) {
        Jb(z, false, true);
    }

    public final void Ic(p7 p7Var, boolean z) {
        Set set;
        if (p7Var != null) {
            if (z) {
                set = this.V0;
            } else {
                set = this.U0;
            }
            set.add(p7Var);
        }
    }

    @Override
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        sb(i, i2, z, i3, z2, i4, null, null, null);
    }

    public final int J4(int i) {
        k47 messageObject;
        int i2;
        int height = this.A0.getHeight();
        int i3 = 0;
        long j = 0;
        while (true) {
            View U0 = this.A0.U0(i);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof rc2) {
                rc2 rc2Var = (rc2) U0;
                messageObject = rc2Var.getMessageObject();
                i2 = rc2Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof cm1) {
                messageObject = ((cm1) U0).getMessageObject();
                i2 = 0;
            } else {
                continue;
                i++;
            }
            if (messageObject != null) {
                long c1 = messageObject.c1();
                boolean N3 = messageObject.N3();
                if (j != 0 && j != c1) {
                    break;
                }
                height = Math.min(height, U0.getTop());
                i3 = Math.max(i3, U0.getBottom() - i2);
                if (!N3) {
                    continue;
                } else if (c1 == 0) {
                    break;
                } else {
                    j = c1;
                }
            } else {
                continue;
            }
            i++;
        }
        return Math.max(0, i3 - height);
    }

    public final void J5() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i;
        k47 k47Var;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.N6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i2 = 0;
            vh6 vh6Var = null;
            ArrayList arrayList3 = null;
            int i3 = 0;
            while (true) {
                arrayList = this.M6;
                if (i3 >= size) {
                    break;
                }
                k47 k47Var2 = (k47) sparseArray.valueAt(i3);
                if (k47Var2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i3)));
                    if (!(k47Var2.k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = k47Var2.C.k.fwd_from) != null && k47.B1(messageFwdHeader.saved_from_peer) == this.l6 && (i = k47Var2.C.k.fwd_from.channel_post) != 0 && (k47Var = (k47) this.G6[i2].get(i)) != null && (messageReplies = k47Var.k.replies) != null) {
                        messageReplies.replies++;
                        k47Var.k1 = true;
                        TLRPC.Message message = k47Var2.k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i4 = i2;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            } else if (k47.B1(k47Var.k.replies.recent_repliers.get(i4)) == k47.B1(peer)) {
                                k47Var.k.replies.recent_repliers.remove(i4);
                                break;
                            } else {
                                i4++;
                            }
                        }
                        k47Var.k.replies.recent_repliers.add(i2, peer);
                        if (!k47Var2.N3()) {
                            k47Var.k.replies.max_id = k47Var2.e1();
                        }
                        cf7 messagesStorage = getMessagesStorage();
                        long j = this.e.id;
                        int e1 = k47Var.e1();
                        TLRPC.MessageReplies messageReplies2 = k47Var.k.replies;
                        messagesStorage.a.c(new oe7(messagesStorage, e1, j, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (k47Var.z2()) {
                            f47 f47Var = (f47) this.P6.f(k47Var.c1());
                            if (f47Var != null) {
                                ArrayList arrayList4 = f47Var.d;
                                if (vh6Var == null) {
                                    vh6Var = new vh6();
                                }
                                vh6Var.k(f47Var, f47Var.a);
                                int size3 = arrayList4.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    ((k47) arrayList4.get(i5)).k1 = true;
                                }
                            }
                        } else if (this.D0 != null && (indexOf = arrayList.indexOf(k47Var)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.D0.K));
                        }
                    }
                }
                i3++;
                i2 = 0;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    sparseArray.remove(((Integer) arrayList2.get(i6)).intValue());
                }
            }
            if (this.D0 != null) {
                if (vh6Var != null) {
                    int m = vh6Var.m();
                    for (int i7 = 0; i7 < m; i7++) {
                        f47 f47Var2 = (f47) vh6Var.n(i7);
                        int indexOf2 = arrayList.indexOf((k47) b10.f(1, f47Var2.d));
                        if (indexOf2 >= 0) {
                            hu1 hu1Var = this.D0;
                            if (!hu1Var.O) {
                                hu1Var.l(indexOf2 + hu1Var.K, f47Var2.d.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.D0.O) {
                    int size5 = arrayList3.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        this.D0.g(((Integer) arrayList3.get(i8)).intValue());
                    }
                }
            }
        }
    }

    public final int J6() {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        int i3;
        int i4;
        int i5;
        int L;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        float min;
        TLRPC.PhotoSize photoSize;
        int i10;
        int i11;
        ArrayList arrayList3 = this.M6;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int indexOf = arrayList3.indexOf(this.b8);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashSet hashSet = new HashSet();
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1;
        while (i12 < arrayList3.size()) {
            k47 k47Var = (k47) arrayList3.get(i12);
            Integer num = k47Var.a3;
            if (num != null) {
                i6 = num.intValue();
                i4 = i13;
                i5 = i14;
            } else {
                int i16 = k47Var.D;
                if (i16 == 0) {
                    int W5 = k47Var.W5();
                    if ((k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && (k47.n1(k47Var.k).webpage instanceof TLRPC.TL_webPage)) {
                        i11 = gm.L(100.0f);
                    } else {
                        i11 = z;
                    }
                    i6 = W5 + i11;
                    if (k47Var.d4()) {
                        i10 = gm.L(42.0f) + i6;
                        i6 = i10;
                    }
                    i4 = i13;
                } else {
                    if (i16 == 20) {
                        i10 = gm.Y0(z);
                    } else if (i16 == 2) {
                        i10 = gm.L(72.0f);
                    } else if (i16 == 12) {
                        i10 = gm.L(71.0f);
                    } else if (i16 == 9) {
                        i10 = gm.L(100.0f);
                    } else if (i16 == 4) {
                        i10 = gm.L(114.0f);
                    } else if (i16 == 14) {
                        i10 = gm.L(82.0f);
                    } else {
                        if (i16 != 10 && i16 != 35 && i16 != 33 && i16 != 34) {
                            if (i16 != 11 && i16 != 18 && i16 != 31 && i16 != 30 && i16 != 25 && i16 != 21) {
                                if (i16 == 32) {
                                    i10 = gm.L(234.0f);
                                } else if (i16 == 5) {
                                    i10 = gm.u;
                                } else if (i16 == 19) {
                                    i6 = gm.L(30.0f) + k47Var.W5();
                                    i4 = i13;
                                } else if (i16 != 13 && i16 != 15) {
                                    if (gm.O1()) {
                                        min = gm.P0() * 0.7f;
                                    } else {
                                        Point point = gm.q;
                                        min = Math.min(point.x, point.y) * 0.7f;
                                    }
                                    int i17 = (int) min;
                                    int L2 = gm.L(100.0f) + i17;
                                    boolean z2 = z;
                                    if (i17 > gm.Y0(z2)) {
                                        i17 = gm.Y0(z2);
                                    }
                                    if (L2 > gm.Y0(z2)) {
                                        L2 = gm.Y0(z2);
                                    }
                                    ArrayList arrayList8 = k47Var.p0;
                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                        i4 = i13;
                                        photoSize = (TLRPC.PhotoSize) k47Var.p0.get(z2 ? 1 : 0);
                                    } else {
                                        i4 = i13;
                                        photoSize = null;
                                    }
                                    if (photoSize != null) {
                                        int i18 = (int) (photoSize.h / (photoSize.w / i17));
                                        if (i18 == 0) {
                                            i18 = gm.L(100.0f);
                                        }
                                        if (i18 <= L2) {
                                            if (i18 < gm.L(120.0f)) {
                                                L2 = gm.L(120.0f);
                                            } else {
                                                L2 = i18;
                                            }
                                        }
                                    }
                                    i6 = gm.L(14.0f) + L2;
                                } else {
                                    i4 = i13;
                                    Point point2 = gm.q;
                                    float f2 = point2.y * 0.4f;
                                    if (gm.O1()) {
                                        i7 = gm.P0();
                                    } else {
                                        i7 = point2.x;
                                    }
                                    float f3 = i7 * 0.5f;
                                    TLRPC.Document F0 = k47Var.F0();
                                    if (F0 != null) {
                                        int size = F0.attributes.size();
                                        f = f3;
                                        int i19 = 0;
                                        while (true) {
                                            i5 = i14;
                                            if (i19 >= size) {
                                                break;
                                            }
                                            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i19);
                                            int i20 = i19;
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                i9 = documentAttribute.w;
                                                i8 = documentAttribute.h;
                                                break;
                                            }
                                            i19 = i20 + 1;
                                            i14 = i5;
                                        }
                                    } else {
                                        f = f3;
                                        i5 = i14;
                                    }
                                    i8 = 0;
                                    i9 = 0;
                                    if (i9 == 0) {
                                        i8 = (int) f2;
                                        i9 = gm.L(100.0f) + i8;
                                    }
                                    float f4 = i8;
                                    if (f4 > f2) {
                                        i9 = (int) ((f2 / f4) * i9);
                                        i8 = (int) f2;
                                    }
                                    float f5 = i9;
                                    if (f5 > f) {
                                        i8 = (int) ((f / f5) * i8);
                                    }
                                    i6 = gm.L(14.0f) + i8;
                                    k47Var.a3 = Integer.valueOf(i6);
                                }
                            } else {
                                i4 = i13;
                                i5 = i14;
                                L = gm.L(50.0f);
                            }
                        } else {
                            i4 = i13;
                            i5 = i14;
                            L = gm.L(30.0f);
                        }
                        i6 = L;
                        k47Var.a3 = Integer.valueOf(i6);
                    }
                    i6 = i10;
                    i4 = i13;
                }
                i5 = i14;
                k47Var.a3 = Integer.valueOf(i6);
            }
            arrayList4.add(Integer.valueOf(i6));
            if (k47Var.q4() || i12 == indexOf) {
                if (i12 == indexOf) {
                    i15 = i4;
                }
                arrayList6.add(Integer.valueOf(i12));
                arrayList5.add(Integer.valueOf(i4));
                arrayList7.add(Integer.valueOf(i5));
            }
            if (k47Var.A2()) {
                if (!hashSet.contains(Long.valueOf(k47Var.c1()))) {
                    hashSet.add(Long.valueOf(k47Var.c1()));
                } else {
                    i13 = i4;
                    i14 = i5;
                    i12++;
                    z = false;
                }
            }
            i14 = i5 + 1;
            i13 = i4 + i6;
            i12++;
            z = false;
        }
        int size2 = arrayList6.size();
        if (indexOf >= 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (size2 - i <= 0) {
            return 0;
        }
        hashSet.clear();
        int i21 = 0;
        while (indexOf >= 0) {
            k47 k47Var2 = (k47) arrayList3.get(indexOf);
            int intValue = ((Integer) arrayList4.get(indexOf)).intValue();
            if (k47Var2.A2()) {
                if (!hashSet.contains(Long.valueOf(k47Var2.c1()))) {
                    hashSet.add(Long.valueOf(k47Var2.c1()));
                }
                if (k47Var2.q4() && !k47Var2.A2() && k47Var2 != this.b8) {
                    i3 = i21;
                    int i22 = 0;
                    int i23 = -1;
                    int i24 = -1;
                    int i25 = -1;
                    int i26 = -1;
                    int i27 = -1;
                    int i28 = -1;
                    while (i22 < arrayList6.size()) {
                        int intValue2 = ((Integer) arrayList6.get(i22)).intValue();
                        int i29 = intValue;
                        if (intValue2 >= indexOf && (i24 == -1 || i24 > intValue2)) {
                            i26 = ((Integer) arrayList5.get(i22)).intValue();
                            i25 = ((Integer) arrayList7.get(i22)).intValue();
                            i24 = intValue2;
                        }
                        if (intValue2 <= indexOf && (i23 == -1 || i23 < intValue2)) {
                            i27 = ((Integer) arrayList5.get(i22)).intValue();
                            i28 = ((Integer) arrayList7.get(i22)).intValue();
                            i23 = intValue2;
                        }
                        i22++;
                        intValue = i29;
                    }
                    int i30 = intValue;
                    int i31 = -1;
                    if (i24 != -1) {
                        if (Math.abs(i24 - indexOf) > this.xc + 1 && Math.abs(i25 - i3) > this.xc + 1 && Math.abs(i26 - (i15 + i30)) > gm.q.y) {
                            i31 = -1;
                        }
                    }
                    if (i23 == i31 || (Math.abs(i23 - indexOf) > this.xc + 1 && Math.abs(i28 - i3) > this.xc + 1 && Math.abs(i27 - i15) > gm.q.y)) {
                        return indexOf;
                    }
                } else {
                    i3 = i21;
                }
                indexOf--;
                i21 = i3;
            }
            i21--;
            i15 -= intValue;
            if (k47Var2.q4()) {
            }
            i3 = i21;
            indexOf--;
            i21 = i3;
        }
        hashSet.clear();
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (i34 < arrayList3.size()) {
            k47 k47Var3 = (k47) arrayList3.get(i34);
            int intValue3 = ((Integer) arrayList4.get(i34)).intValue();
            if (!k47Var3.A2()) {
                i32++;
                i33 += intValue3;
            } else if (!hashSet.contains(Long.valueOf(k47Var3.c1()))) {
                hashSet.add(Long.valueOf(k47Var3.c1()));
                i32++;
            }
            if (!k47Var3.q4() && !k47Var3.A2() && k47Var3 != this.b8) {
                arrayList = arrayList4;
                int i35 = 0;
                int i36 = -1;
                int i37 = -1;
                int i38 = -1;
                int i39 = -1;
                int i40 = -1;
                int i41 = -1;
                while (i35 < arrayList6.size()) {
                    int intValue4 = ((Integer) arrayList6.get(i35)).intValue();
                    ArrayList arrayList9 = arrayList3;
                    if (intValue4 >= i34 && (i39 == -1 || i39 > intValue4)) {
                        i41 = ((Integer) arrayList5.get(i35)).intValue();
                        i40 = ((Integer) arrayList7.get(i35)).intValue();
                        i39 = intValue4;
                    }
                    if (intValue4 <= i34 && (i36 == -1 || i36 < intValue4)) {
                        i37 = ((Integer) arrayList5.get(i35)).intValue();
                        i38 = ((Integer) arrayList7.get(i35)).intValue();
                        i36 = intValue4;
                    }
                    i35++;
                    arrayList3 = arrayList9;
                }
                arrayList2 = arrayList3;
                if (i39 != -1) {
                    if (Math.abs(i39 - i34) >= this.xc + 1 && Math.abs(i40 - i32) >= this.xc + 1 && Math.abs(i41 - (intValue3 + i33)) > gm.q.y) {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                if (i36 == i2 || (Math.abs(i36 - i34) >= this.xc + 1 && Math.abs(i38 - i32) >= this.xc + 1 && Math.abs(i37 - i33) > gm.q.y)) {
                    return i34;
                }
            } else {
                arrayList = arrayList4;
                arrayList2 = arrayList3;
            }
            i34++;
            arrayList4 = arrayList;
            arrayList3 = arrayList2;
        }
        return -1;
    }

    public final boolean J7(boolean z) {
        lt1 lt1Var;
        lt1 lt1Var2 = this.M2;
        if (lt1Var2 == null || lt1Var2.getTag() != null) {
            return false;
        }
        r02 r02Var = this.b1;
        if (r02Var != null && (lt1Var = this.M2) != null) {
            r02Var.j(lt1Var, false, z);
        }
        int i = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.W2;
            if (i < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i] = null;
                }
                i++;
            } else {
                this.P2 = false;
                this.M2.setTag(1);
                return true;
            }
        }
    }

    public final void J8(int i) {
        if (this.g4 == 7) {
            Object E = this.b4.E(i);
            if (i == 0) {
                this.b4.getClass();
            }
            if (E instanceof k47) {
                ua((k47) E);
            }
        } else if (this.F3 != null) {
            if (i >= 0 && i < getMediaDataController().Z0.size()) {
                k47 k47Var = (k47) getMediaDataController().Z0.get(i);
                this.G3 = false;
                Jb(false, true, false);
                hs6 mediaDataController = getMediaDataController();
                if (i >= 0) {
                    if (i < mediaDataController.Z0.size()) {
                        mediaDataController.f1 = i;
                    }
                } else {
                    mediaDataController.getClass();
                }
                nd(getMediaDataController().e0(), getMediaDataController().f1, getMediaDataController().k0());
                gm.c3(new jm1(this, k47Var, (byte) 2));
            }
        } else {
            hs6 mediaDataController2 = getMediaDataController();
            int i2 = this.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i >= 0 && i < arrayList.size()) {
                mediaDataController2.f1 = i;
                k47 k47Var2 = (k47) arrayList.get(i);
                mediaDataController2.getNotificationCenter().k(nm7.H0, Integer.valueOf(i2), Integer.valueOf(k47Var2.e1()), Integer.valueOf(mediaDataController2.e0()), Long.valueOf(k47.B0(k47Var2.k)), Integer.valueOf(mediaDataController2.f1), Integer.valueOf(mediaDataController2.k0()), Boolean.TRUE);
            }
            nc(false);
        }
    }

    public final void J9(long j) {
        if (jva.v(this.currentAccount, false).m().amount < j) {
            new dxa(getParentActivity(), getResourceProvider(), j, 13, pg3.s(a()), new en1(this, (byte) 25), a()).show();
        } else {
            new exa(getParentActivity(), this.resourceProvider).show();
        }
    }

    public final void Ja() {
        rc2 rc2Var;
        this.pd.a(false, true);
        lf8 lf8Var = this.vd;
        if (lf8Var != null && (rc2Var = lf8Var.n) != null && rc2Var.getDelegate() != null) {
            lf8Var.n.getDelegate().o1(lf8Var.n, false);
        }
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            ms1Var.z1(true, true, false);
            this.a0.b7 = null;
        }
    }

    public final void Jb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Jb(boolean, boolean, boolean):void");
    }

    public final void Jc(k47 k47Var) {
        if (k47Var == null) {
            return;
        }
        u31 u31Var = this.P3;
        if (u31Var != null) {
            u31Var.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.v5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(k47Var.e1()));
        int i = this.e5;
        getNotificationCenter().k(nm7.t0, Long.valueOf(this.l6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.e5 - 1), Boolean.valueOf(this.g5));
        this.P3 = c41.B(this, false, new up6(this, arrayList2, arrayList, i, (byte) 12), new jm1(this, k47Var, (byte) 6), this.Ba).j();
    }

    @Override
    public final boolean K() {
        return this.A8;
    }

    public final float K4(boolean z) {
        float f;
        float f2;
        float f3;
        ms1 ms1Var = this.a0;
        float f4 = 0.0f;
        if (ms1Var != null) {
            if (z) {
                f = ms1Var.s7;
            } else {
                f = ms1Var.r7;
            }
        } else {
            f = 0.0f;
        }
        float max = Math.max(f, gm.L(44.0f));
        float L = gm.L(44.0f);
        fn0 fn0Var = this.pd;
        jif jifVar = this.ud;
        if (z) {
            if (31 - Integer.numberOfLeadingZeros(jifVar.a) == 1) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(jifVar.a) == 0) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            if (fn0Var.f) {
                f4 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) jifVar.b;
            float f5 = fArr[1];
            f2 = 1.0f - fArr[0];
            f4 = fn0Var.e;
            f3 = f5;
        }
        if (!this.mb && !isInPreviewMode()) {
            return gm.R1(Math.max(gm.R1(L, max, f3) * f2, gm.L(44.0f)), -gm.L(7.0f), f4);
        }
        return gm.R1(L, max, f3) * f2;
    }

    public final void K5(boolean z) {
        boolean z2;
        this.vb = 0;
        this.wb = Integer.MIN_VALUE;
        if (this.tb) {
            this.tb = false;
            this.ub = false;
            yr1 yr1Var = this.C0;
            if (yr1Var != null) {
                yr1Var.G = true;
            }
        }
        this.M6.clear();
        this.J6.clear();
        this.K6.clear();
        this.z6.clear();
        this.P6.b();
        this.y4 = false;
        hu1 hu1Var = this.D0;
        if (hu1Var != null) {
            if (hu1Var.x < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sc(z2);
        }
        vr1 vr1Var = this.A0;
        if (vr1Var != null) {
            vr1Var.setEmptyView(null);
        }
        for (int i = 0; i < 2; i++) {
            this.G6[i].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.R6;
            int[] iArr2 = this.Q6;
            if (encryptedChat == null) {
                iArr2[i] = Integer.MAX_VALUE;
                iArr[i] = Integer.MIN_VALUE;
            } else {
                iArr2[i] = Integer.MIN_VALUE;
                iArr[i] = Integer.MAX_VALUE;
            }
            this.S6[i] = Integer.MIN_VALUE;
            this.T6[i] = 0;
            this.U6[i] = false;
            this.V6[i] = false;
            this.W6[i] = true;
        }
        if (z) {
            this.Y7 = true;
            this.Z6 = true;
            this.Y6 = true;
            this.a8 = false;
        }
        this.l5 = false;
        this.M7 = 0;
        this.L7 = false;
        this.c7 = 0;
        this.b8 = null;
        this.V7 = 0;
        this.W7 = false;
        this.S7 = false;
        hu1 hu1Var2 = this.D0;
        if (hu1Var2 != null && !hu1Var2.O) {
            hu1Var2.J(false);
        }
    }

    public final void K7() {
        ft1 ft1Var = this.Jb;
        if (ft1Var == null) {
            return;
        }
        this.Jb = null;
        ft1Var.b();
        if (ft1Var.getReactionsWindow() != null && ft1Var.getReactionsWindow().a != null) {
            ft1Var.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
        }
        ft1Var.animate().alpha(0.01f).translationY(-gm.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new uj1(this, ft1Var, (byte) 20)).setDuration(180L).start();
    }

    public final void K8(boolean[] zArr, Context context) {
        k47 k47Var;
        k47 k47Var2 = this.F5;
        if (k47Var2 == null || !k47.c3(k47Var2.k)) {
            boolean z = zArr[0];
            if (z) {
                zArr[0] = false;
            }
            byte b = this.ac;
            if (b == 5) {
                int i = this.currentAccount;
                long j = this.l6;
                v67 v67Var = this.y5;
                if (v67Var == null) {
                    v67Var = v67.a();
                }
                new u67(context, i, j, v67Var, this, getResourceProvider(), 0, new qm1(this, (byte) 1)).show();
            } else if (b == 1 && (k47Var = this.H5) != null) {
                if (k47Var.o5() && !z) {
                    v67 v67Var2 = this.y5;
                    if (v67Var2 == null) {
                        v67Var2 = v67.a();
                    }
                    wc(v67Var2);
                } else if (this.H5.t() && this.G5 == 0) {
                    if (this.Y1 == null) {
                        S5();
                    }
                    this.Y1.r1(-1, this.H5);
                    ma();
                } else {
                    J(this.H5.e1(), 0, 0, 0, true, true);
                }
            } else if (this.x5 != null) {
                if (b == 2) {
                    if (!pg3.B(this.l6) && !this.x5.u && this.g4 != 5) {
                        boolean z2 = gda.a;
                        SharedPreferences.Editor edit = oc7.d1().edit();
                        gda.P = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        ra(0);
                        return;
                    }
                    k47 k47Var3 = this.F5;
                    if (k47Var3 != null) {
                        J(k47Var3.e1(), 0, 0, 0, true, true);
                    }
                } else if (b == 3) {
                    boolean z3 = gda.a;
                    SharedPreferences.Editor edit2 = oc7.d1().edit();
                    gda.O = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    ra(1);
                } else if (b == 4) {
                    ra(2);
                }
            }
        }
    }

    public final void K9(String str) {
        Uri parse = Uri.parse(str);
        lb5.b(getParentActivity(), this.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public final void Ka(rc2 rc2Var) {
        lf8 lf8Var;
        if (this.pd.f && (lf8Var = this.vd) != null && lf8Var.n == rc2Var) {
            Editable text = lf8Var.a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().l4.M.f()) {
                a6a B = a6a.B(this.currentAccount);
                k47 messageObject = rc2Var.getMessageObject();
                nf8 attachedMedia = this.vd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m1 = k47.m1(messageObject);
                    if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = k47.B0(messageObject.k);
                        messageObject.e1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) m1).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = B.getMediaDataController().Y(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof rf8) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((rf8) attachedMedia).c);
                            a6a.W(B.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof xf8) {
                            xf8 xf8Var = (xf8) attachedMedia;
                            B.s(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) xf8Var.b, null, null, null, false, false, xf8Var.c);
                        } else if (attachedMedia instanceof uf8) {
                            tL_inputPollAnswer.input_media = brb.h(((uf8) attachedMedia).b);
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof sf8) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((sf8) attachedMedia).b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Ja();
                return;
            }
            gm.z3(this.vd.a);
        }
    }

    public final void Kb(int i, int i2, String str) {
        this.d8 = i;
        this.f8 = true;
        this.g8 = 0L;
        this.h8 = str;
        this.k8 = i2;
        this.e8 = true;
    }

    public final void Kc() {
        boolean c8 = c8();
        SparseArray[] sparseArrayArr = this.o6;
        if (!c8) {
            if (this.actionBar.y() && this.q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.q1.c(jb6.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        rs1 rs1Var = this.E0;
        if (size == 0) {
            rs1Var.setText(jb6.M0(2131745946, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        rs1Var.setText(jb6.a0(null, null, 2131745947, jb6.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    public final boolean L4(k47 k47Var) {
        if (!a8()) {
            TLRPC.Message message = k47Var.k;
            if ((message == null || !message.noforwards) && !k47Var.f4() && !k47Var.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L5(boolean z, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.R6;
        if (z) {
            if (e21.a) {
                StringBuilder sb = new StringBuilder("clear history by overwrite firstLoading=");
                sb.append(this.Z6);
                sb.append(" minMessage=");
                sb.append(iArr[0]);
                sb.append(" topMessage=");
                b10.p(tL_updates_channelDifferenceTooLong.dialog.top_message, sb);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i = dialog.top_message;
            int i2 = iArr[0];
            if (i > i2) {
                this.V7 = Math.max(i2 + 1, dialog.read_inbox_max_id);
            }
            this.W6[0] = false;
            this.X6 = false;
            hu1 hu1Var = this.D0;
            if (hu1Var != null && hu1Var.G < 0) {
                hu1Var.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i3 = dialog2.unread_count;
            this.B6 = i3;
            this.D6 = dialog2.unread_mentions_count;
            if (this.C6 != i3) {
                q02 q02Var = this.y1;
                if (q02Var != null) {
                    q02Var.c(1, i3, this.f6);
                }
                this.C6 = this.B6;
                dd();
            }
            int i4 = this.D6;
            int i5 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i4 != i5) {
                this.D6 = i5;
                if (i5 <= 0) {
                    this.D6 = 0;
                    this.E6 = true;
                    mc(false);
                } else {
                    q02 q02Var2 = this.y1;
                    if (q02Var2 != null) {
                        q02Var2.c(2, i5, true);
                    }
                    mc(true);
                }
            }
            n5(false);
            return;
        }
        this.M6.clear();
        this.z6.clear();
        this.J6.clear();
        this.K6.clear();
        this.P6.b();
        this.y4 = false;
        for (int i6 = 1; i6 >= 0; i6--) {
            this.G6[i6].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.Q6;
            if (encryptedChat == null) {
                iArr2[i6] = Integer.MAX_VALUE;
                iArr[i6] = Integer.MIN_VALUE;
            } else {
                iArr2[i6] = Integer.MIN_VALUE;
                iArr[i6] = Integer.MAX_VALUE;
            }
            this.S6[i6] = Integer.MIN_VALUE;
            this.T6[i6] = 0;
            this.o6[i6].clear();
            this.p6[i6].clear();
            this.q6[i6].clear();
        }
        C7();
        gd(0, true);
        if (this.D8 != null) {
            this.D8 = null;
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.D1(null, true, false);
            }
        }
        if (this.R != null) {
            sc(false);
            U5(false);
            this.A0.setEmptyView(this.f1);
        }
        hu1 hu1Var2 = this.D0;
        if (hu1Var2 != null) {
            hu1Var2.J(false);
        }
        if (this.h == null && (user = this.f) != null && user.bot && this.w8 == null) {
            this.w8 = "";
            Pc(false);
        }
    }

    public final hg0 L6(int i, boolean z) {
        k47 messageObject;
        vr1 vr1Var = this.A0;
        if (vr1Var != null) {
            int childCount = vr1Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.A0.getChildAt(i2);
                if (childAt instanceof rc2) {
                    messageObject = ((rc2) childAt).getMessageObject();
                } else if (childAt instanceof cm1) {
                    messageObject = ((cm1) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.e1() == i) {
                    if (z) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.P9 - this.R9) - gm.L(4.0f) || childAt.getY() > this.A0.getMeasuredHeight() - this.Ya) {
                            return null;
                        }
                    }
                    return (hg0) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void L7() {
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        u31 u31Var = this.P3;
        if (u31Var != null) {
            u31Var.c(0L, false);
        }
        kt1 kt1Var = this.O3;
        if (kt1Var != null) {
            kt1Var.d(0, true);
        }
    }

    public final void L8() {
        k47 k47Var;
        k47 k47Var2;
        m47 m47Var;
        ArrayList arrayList;
        String a0;
        this.y5 = null;
        byte b = this.ac;
        if (b == 2) {
            this.D5 = null;
            this.F5 = null;
            o47 o47Var = this.x5;
            if (o47Var != null) {
                o47Var.f(null, null, this.l6, null);
            }
            D6();
        } else if (b == 3) {
            o47 o47Var2 = this.x5;
            if (o47Var2 != null && !o47Var2.c() && (m47Var = this.x5.b) != null && (arrayList = m47Var.e) != null) {
                int size = arrayList.size();
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    k47 k47Var3 = (k47) this.x5.b.e.get(i);
                    if (j == 0) {
                        j2 = k47.B0(k47Var3.k);
                        j = k47Var3.Z0();
                    } else if (j != k47Var3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                he heVar = alertDialog$Builder.a;
                heVar.J0 = true;
                if (j2 > 0) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j2));
                    if (W1 != null) {
                        a0 = jb6.a0("CancelForwardPrivate", null, 2131752536, jb6.G(this.x5.b.e.size(), "MessagesBold", new Object[0]), bw2.m(0, W1.first_name, W1.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j2));
                    if (L0 != null) {
                        a0 = jb6.a0("CancelForwardChat", null, 2131752537, jb6.G(this.x5.b.e.size(), "MessagesBold", new Object[0]), L0.title);
                    } else {
                        return;
                    }
                }
                heVar.U = gm.S2(a0);
                heVar.S = jb6.G(this.x5.b.e.size(), "messages", new Object[0]);
                alertDialog$Builder.j(jb6.M0(2131752535, null), new gm1(this, (byte) 6));
                alertDialog$Builder.g(jb6.M0(2131745077, null), new gm1(this, (byte) 7));
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, getResourceProvider());
                }
            }
        } else if (b == 4) {
            this.Y5 = null;
            o47 o47Var3 = this.x5;
            if (o47Var3 != null) {
                int i2 = this.currentAccount;
                k47 k47Var4 = this.F5;
                if (k47Var4 == this.m4) {
                    k47Var2 = null;
                } else {
                    k47Var2 = k47Var4;
                }
                o47Var3.e(i2, null, null, k47Var2, this.D5, this.H5);
            }
            ms1 ms1Var = this.a0;
            ms1Var.N3 = null;
            ms1Var.O3 = false;
            B6();
            D6();
        } else {
            if (sd2.c0(this.e) && !this.x4 && (k47Var = this.F5) != null) {
                long b2 = k47.b2(this.currentAccount, k47Var.k, true, false);
                if (b2 != 0) {
                    getMediaDataController().F(this.l6, b2, false);
                }
            }
            ac(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public final void L9(bu5 bu5Var) {
        if (this.Ac == null) {
            return;
        }
        bu5Var.u();
        Y9(this.Ac, false, true);
        l11.t(getParentActivity(), Uri.parse(this.Ac.T0), true, false, false, null, null, false, oc7.r1(this.currentAccount).l4.A2.f, false, false);
    }

    public final void La(rc2 rc2Var) {
        kf8 kf8Var;
        int i;
        if (this.a0 != null) {
            fn0 fn0Var = this.pd;
            if (!fn0Var.f && rc2Var.getMessageObject() != null) {
                mu1 mu1Var = this.m1;
                RectF rectF = gm.P;
                zgc.c(rc2Var, mu1Var, rectF);
                Rect rect = gm.Q;
                xc2 xc2Var = rc2Var.x2;
                if (xc2Var != null && (kf8Var = xc2Var.l) != null && xc2Var.s) {
                    rect.set(kf8Var.getBounds());
                    int measuredHeight = (int) (rectF.bottom - (((this.m1.getMeasuredHeight() - this.A0.getPaddingBottom()) + this.ld) - gm.L(2.0f)));
                    k47 messageObject = rc2Var.getMessageObject();
                    if (this.vd == null) {
                        this.vd = new lf8(this, this.resourceProvider, getParentActivity());
                        int indexOfChild = this.m1.indexOfChild(this.A0);
                        mu1 mu1Var2 = this.m1;
                        lf8 lf8Var = this.vd;
                        if (indexOfChild >= 0) {
                            mu1Var2.addView(lf8Var, indexOfChild + 1, qoe.g());
                        } else {
                            mu1Var2.addView(lf8Var, qoe.g());
                        }
                    }
                    if (messageObject.O3()) {
                        if (rc2Var.A2()) {
                            i = cmb.dc;
                        } else {
                            i = cmb.ic;
                        }
                        this.T0 = i;
                    } else {
                        if (rc2Var.A2()) {
                            i = cmb.ee;
                        } else {
                            i = cmb.de;
                        }
                        this.T0 = i;
                    }
                    this.vd.setColor(getThemedColor(i));
                    this.vd.setCellToWatch(rc2Var);
                    ((fn0) this.vd.b.b).a(false, false);
                    this.vd.setAnimatedVisibility(fn0Var.e);
                    this.vd.b.setOnClickListener(new m67(new ho1(this, (byte) 7), (byte) 21));
                    lf8 lf8Var2 = this.vd;
                    lf8Var2.s = new ho1(this, (byte) 8);
                    pz pzVar = lf8Var2.a;
                    pzVar.setOnKeyListener(new w6(this, (byte) 1));
                    pzVar.setOnEditorActionListener(new j(this, (byte) 6));
                    this.a0.b7 = pzVar;
                    gm.d3(new wc7(this, measuredHeight, pzVar, (byte) 12), 100L);
                    fn0Var.a(true, true);
                }
            }
        }
    }

    public final void Lb(long j) {
        this.s4 = j;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = (int) j;
        new k47(this.currentAccount, tL_message, false, false);
    }

    public final void Lc() {
        Drawable r0;
        mu1 mu1Var = this.m1;
        if (mu1Var != null && this.za == null) {
            if (this.Ba.h == null || mu1Var.getBackgroundImage() == null) {
                if (this.m1.getBackgroundImage() == null || gm.O1()) {
                    if (U7()) {
                        r0 = this.m1.getCompactBackground();
                    } else {
                        r0 = cmb.r0();
                    }
                    mu1 mu1Var2 = this.m1;
                    if (!U7()) {
                        int i = cmb.a;
                    }
                    mu1Var2.U(r0);
                }
            }
        }
    }

    @Override
    public final long M() {
        return this.d7;
    }

    public final boolean M4() {
        if (!b8() && !getMessagesController().y2(a())) {
            if ((!getMessagesController().s2(a()) || this.x4) && getMessagesController().L1(a()) <= 0 && this.h == null) {
                qs1 qs1Var = this.d1;
                if (qs1Var == null || qs1Var.getVisibility() != 0) {
                    if (!j8() || this.x4) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void M5(boolean z) {
        for (int i = 1; i >= 0; i--) {
            this.o6[i].clear();
            this.p6[i].clear();
            this.q6[i].clear();
        }
        C7();
        gd(0, true);
        Gd(z);
        td();
    }

    public final cm1 M6(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i = 0; i < this.A0.getChildCount(); i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof cm1) {
                    cm1 cm1Var = (cm1) childAt;
                    if (c.P(cm1Var.getMessageObject(), wallettransaction)) {
                        return cm1Var;
                    }
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i2 >= arrayList.size()) {
                    break;
                } else if (c.P((k47) arrayList.get(i2), wallettransaction)) {
                    this.A0.D0();
                    this.C0.g1(this.D0.K + i2, 0);
                    return null;
                } else {
                    i2++;
                }
            }
        }
        return null;
    }

    public final void M7() {
        boolean z;
        nd(0, 0, -1);
        getMediaDataController().Z1(this.I3, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, true, this.F3);
        if (TextUtils.isEmpty(this.I3) && this.F3 == null) {
            z = false;
        } else {
            z = true;
        }
        this.H3 = z;
        this.r0 = z;
        Pc(false);
        qd();
    }

    public final void M8(defpackage.os1 r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.M8(os1, boolean[]):void");
    }

    public final boolean M9() {
        k47 k47Var = this.Ac;
        if (k47Var == null) {
            return false;
        }
        if (gm.g(k47Var.T0)) {
            new c41(n21.a(getParentActivity()), this.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public final void Ma(hg0 hg0Var, TLRPC.ReactionCount reactionCount, float f, float f2) {
        k47 messageObject;
        boolean z;
        boolean z2;
        TLRPC.Message message;
        k39 d = k39.d(reactionCount.reaction);
        if (hg0Var instanceof rc2) {
            messageObject = ((rc2) hg0Var).getPrimaryMessageObject();
        } else if (hg0Var instanceof cm1) {
            messageObject = ((cm1) hg0Var).getMessageObject();
        } else {
            return;
        }
        k47 k47Var = messageObject;
        vb(hg0Var, k47Var, null, null, f, f2, d, false, false, false, false);
        if (k47Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (k47Var.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            boolean z3 = this.D0.O;
            if (z3) {
                k47 k47Var2 = (k47) this.G6[0].get(k47Var.e1());
                if (k47Var2 != null && (message = k47Var2.k) != null) {
                    message.reactions = k47Var.k.reactions;
                }
            } else if (!z3 && this.F3 != null) {
                Sc(false);
            }
        }
        if (this.D0.O && !k47Var.v2(this.F3)) {
            f47 v7 = v7(k47Var);
            if (v7 != null) {
                ArrayList arrayList = v7.d;
                for (int i = 0; i < arrayList.size(); i++) {
                    getMediaDataController().P1(((k47) arrayList.get(i)).e1());
                }
            } else {
                getMediaDataController().P1(k47Var.e1());
            }
            sc7 sc7Var = this.b4;
            if (sc7Var != null) {
                sc7Var.f();
            }
            Sc(true);
        }
    }

    public final void Mb(View view) {
        View view2 = this.Z8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof cm1)) {
                ((cm1) view2).setInvalidateWithParent(null);
            }
            this.Z8 = view;
            if (view instanceof cm1) {
                ((cm1) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Mc() {
        TLRPC.User user;
        boolean z;
        if (this.j0 != null && (user = this.f) != null && this.h == null && user.bot) {
            vh6 vh6Var = this.v8;
            boolean z2 = false;
            if (vh6Var.m() != 0) {
                boolean z3 = false;
                z = false;
                for (int i = 0; i < vh6Var.m(); i++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vh6Var.n(i);
                    for (int i2 = 0; i2 < botInfo.commands.size(); i2++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i2);
                        if (botCommand.command.toLowerCase().equals("help")) {
                            z3 = true;
                        } else if (botCommand.command.toLowerCase().equals("settings")) {
                            z = true;
                        }
                        if (!z || !z3) {
                        }
                    }
                }
                z2 = z3;
            } else {
                z = false;
            }
            r7 r7Var = this.j0;
            if (z2) {
                r7Var.S(30);
            } else {
                r7Var.u(30);
            }
            r7 r7Var2 = this.j0;
            if (z) {
                r7Var2.S(31);
            } else {
                r7Var2.u(31);
            }
        }
    }

    public final boolean N4() {
        if (this.h == null) {
            qs1 qs1Var = this.d1;
            if (qs1Var == null || qs1Var.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void N5(boolean z) {
        this.h9 = z;
        m8 m8Var = this.g9;
        if (m8Var != null) {
            m8Var.dismiss();
        }
        if (!z) {
            ValueAnimator valueAnimator = this.Tc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Tc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Tc = ofFloat;
            ofFloat.addUpdateListener(new em1(this, (byte) 0));
            this.Tc.setDuration(150L);
            this.Tc.start();
        }
    }

    public final void N6() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.N6():void");
    }

    public final void N7(int i) {
        mr3 mr3Var;
        if (Build.VERSION.SDK_INT >= 31 && (mr3Var = this.H) != null) {
            if (iqd.a(i, 4)) {
                bz4 e = this.glassEngine.e();
                float L = gm.L(48.0f);
                float L2 = gm.L(48.0f);
                int i2 = 0;
                while (i2 < e.b) {
                    RectF rectF = (RectF) e.a.get(i2);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e.d(i2);
                    } else {
                        i2++;
                    }
                }
                e.b(this.A0.getY(), this.A0.getWidth(), this.A0.getY() + this.A0.getHeight());
                mr3Var.h(e);
            }
            mu1 mu1Var = this.m1;
            mr3Var.e(mu1Var.w0, mu1Var.getWidth(), this.m1.getHeight());
        }
    }

    public final void N8() {
        jg5.h.a();
        showDialog(new ux4(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void N9() {
        if (gm.g(this.Ac.W0)) {
            new c41(n21.a(getParentActivity()), this.resourceProvider).i(jb6.M0(2131743879, null)).j();
        }
    }

    public final void Na(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Na(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Nb(ArrayList arrayList, TLRPC.Chat chat, int i, int i2, int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z;
        boolean z2;
        this.r4 = tL_forumTopic;
        this.p4 = arrayList;
        k47 k47Var = (k47) b10.f(1, arrayList);
        this.m4 = k47Var;
        this.F5 = k47Var;
        this.A4 = i2;
        this.B4 = i3;
        this.C4 = Math.max(1, i2);
        this.s4 = this.m4.e1();
        this.t4 = i;
        this.u4 = chat;
        if (tL_forumTopic != null) {
            z = true;
        } else {
            z = false;
        }
        this.x4 = z;
        k47 k47Var2 = this.F5;
        TLRPC.MessageFwdHeader messageFwdHeader = k47Var2.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.v4 = z2;
        if (z) {
            k47Var2.p = true;
        }
        hd();
        zd(false);
        Pc(false);
    }

    public final void Nc(er0 er0Var) {
        String charSequence;
        if (oc7.r1(this.currentAccount).i4.r()) {
            CharSequence text = er0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            eoe.b(charSequence, new jf(this, er0Var, text, (byte) 12), new cd1(er0Var, (byte) 6), false);
            return;
        }
        er0Var.setClickable(false);
    }

    public final boolean O4(k47 k47Var) {
        if (this.g4 != 8) {
            if (k47Var != null) {
                if (sd2.c0(this.e)) {
                    TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.e.id, k47.b2(this.currentAccount, k47Var.k, true, false));
                    if (this.g4 == 8 || (f != null && (!f.closed || sd2.i(this.currentAccount, this.e, f)))) {
                        return true;
                    }
                    return false;
                } else if (!sd2.p0(this.e) || !sd2.A(this.currentAccount, this.e, 24) || k47.u1(k47Var.k) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final long O5(k47 k47Var) {
        if (this.g4 == 3) {
            return 0L;
        }
        if (sd2.c0(this.e) && !this.x4 && k47Var != null) {
            TLRPC.TL_forumTopic tL_forumTopic = k47Var.j1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.id;
            }
            return k47.b2(this.currentAccount, k47Var.k, sd2.c0(this.e), false);
        }
        return this.s4;
    }

    public final boolean O6() {
        boolean z;
        f47 currentMessagesGroup;
        int childCount = this.A0.getChildCount();
        HashMap hashMap = null;
        int i = 0;
        while (true) {
            z = true;
            if (i >= childCount) {
                break;
            }
            View childAt = this.A0.getChildAt(i);
            if ((childAt instanceof rc2) && (currentMessagesGroup = ((rc2) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.a), currentMessagesGroup);
                    int indexOf = this.M6.indexOf((k47) b10.f(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        hu1 hu1Var = this.D0;
                        hu1Var.l(indexOf + hu1Var.K, currentMessagesGroup.d.size());
                        this.A0.setItemAnimator(null);
                    }
                }
            }
            i++;
        }
        if (!gm.O1()) {
            return true;
        }
        if (gm.N1() && a.b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new ee0(false));
            return false;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && !tk5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z = false;
        }
        aVar.setBackButtonDrawable(new ee0(z));
        return false;
    }

    public final void O7() {
        if (!this.aa) {
            this.aa = true;
            mu1 mu1Var = this.m1;
            if (mu1Var != null) {
                mu1Var.invalidate();
            }
            vr1 vr1Var = this.A0;
            if (vr1Var != null) {
                vr1Var.invalidate();
            }
        }
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(u7(izb.c) + this.U.getInputBubbleHeight() + this.w.d() + gm.L(16.0f));
        }
        I5();
    }

    public final void O8() {
        if (this.g4 == 0 && getMessagesController().l4.Y2.f() > getConnectionsManager().getCurrentTime() && !h5.a(this.currentAccount, this.f)) {
            h5.c(this.currentAccount, getResourceProvider(), getParentActivity());
        }
    }

    public final void O9() {
        if (gm.g(this.Ac.X0)) {
            new c41(n21.a(getParentActivity()), this.resourceProvider).i(jb6.M0(2131743879, null)).j();
        }
    }

    public final void Oa(int i, String str, CharacterStyle characterStyle, rc2 rc2Var, boolean z) {
        boolean z2;
        wkb wkbVar;
        boolean z3;
        boolean z4 = false;
        try {
            String J0 = gm.J0(str, false);
            if ((this.h == null || getMessagesController().z2 == 1) && getMessagesController().l4.B3.f.contains(J0)) {
                a6a sendMessagesHelper = getSendMessagesHelper();
                if (i != 0 && i != 2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new bh2(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z3), 2);
                return;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (!z && !gm.D3(str)) {
            if (i == 0) {
                l11.s(getParentActivity(), Uri.parse(str), true, true, Z9(rc2Var, characterStyle));
            } else if (i == 1) {
                Activity parentActivity = getParentActivity();
                Uri parse = Uri.parse(str);
                if (this.x8 == 0) {
                    z4 = true;
                }
                l11.s(parentActivity, parse, z4, true, Z9(rc2Var, characterStyle));
            } else if (i == 2) {
                Activity parentActivity2 = getParentActivity();
                Uri parse2 = Uri.parse(str);
                if (this.x8 == 0) {
                    z4 = true;
                }
                l11.s(parentActivity2, parse2, z4, true, Z9(rc2Var, characterStyle));
            }
        } else if (i != 0 && i != 2) {
            if (i == 1) {
                ik.o0(this, str, true, true, false, false, Z9(rc2Var, characterStyle), null, this.Ba);
            }
        } else {
            if ((characterStyle instanceof i6c) && (wkbVar = ((i6c) characterStyle).a) != null && (wkbVar.a & 1024) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ik.o0(this, str, true, true, true, z2, Z9(rc2Var, characterStyle), null, this.Ba);
        }
    }

    public final void Ob(ViewGroup viewGroup) {
        if (this.j0 != null && !this.inPreviewMode && !this.mb && this.Aa == null && (this.fragmentView instanceof FrameLayout)) {
            nz4 nz4Var = this.K;
            if (nz4Var != null) {
                nz4 nz4Var2 = this.J;
                if (nz4Var2 == null) {
                    nz4Var2 = nz4Var;
                }
                lz4 lz4Var = new lz4(nz4Var2, nz4Var);
                km0 km0Var = new km0(lz4Var, lz4Var, lz4Var);
                km0Var.k = true;
                km0Var.j = S6();
                km0Var.h = this.l1;
                km0Var.i = viewGroup;
                km0Var.g = this.F;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                aVar.X0 = km0Var;
                aVar.Y0 = lz4Var;
            }
            this.actionBar.setMenuRise(gm.L(8.0f));
            this.j0.setSubMenuOverlayProvider(new um1(this, (byte) 0));
        }
    }

    public final void Oc() {
        if (this.g2 == null) {
            return;
        }
        float d = this.w.d();
        this.g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + gm.L(9.0f)) - gm.L(5.0f)) + d);
    }

    public final void P4(final boolean z, final boolean z2, final boolean z3) {
        TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews;
        if (!this.rb && Z7()) {
            this.rb = true;
            if (z2) {
                this.sb = true;
            }
            this.E0.setEnabled(false);
            Wb(true, true);
            final long j = this.e.id;
            if (z2) {
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = getMessagesController().g1(j);
                tL_channels_editChannelNews = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews2 = new TLRPC.TL_channels_editChannelNews();
                tL_channels_editChannelNews2.channel = getMessagesController().g1(j);
                tL_channels_editChannelNews2.news = z;
                tL_channels_editChannelNews = tL_channels_editChannelNews2;
            }
            final TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews3 = tL_channels_editChannelNews;
            getConnectionsManager().sendRequest(tL_channels_editChannelNews3, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    boolean z4;
                    boolean z5;
                    final boolean z6 = z2;
                    if (z6 && tL_error != null && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z7 = tLObject instanceof TLRPC.Updates;
                    final yv1 yv1Var = yv1.this;
                    final boolean z8 = z4;
                    final long j2 = j;
                    final boolean z9 = z;
                    if (z7) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                        ArrayList<TLRPC.Chat> arrayList = updates.chats;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            TLRPC.Chat chat = arrayList.get(i);
                            i++;
                            TLRPC.Chat chat2 = chat;
                            if (chat2.id == j2) {
                                if (z9 && !z6) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                chat2.in_news = z5;
                                if (z6) {
                                    chat2.left = true;
                                }
                            }
                        }
                        yv1Var.getMessagesController().T3(updates, false);
                    }
                    final boolean z10 = z3;
                    final TLObject tLObject2 = tL_channels_editChannelNews3;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            yv1.this.o8(z8, tL_error, tLObject, j2, z9, z6, z10, tLObject2);
                        }
                    });
                }
            });
        }
    }

    public final void P6(ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, long j) {
        boolean z4;
        if (!arrayList.isEmpty() && s5()) {
            boolean z5 = false;
            if (i != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.g4 == 1) {
                z5 = true;
            }
            if (z4 == z5) {
                this.L9 = true;
                hu1 hu1Var = this.D0;
                if (hu1Var != null) {
                    hu1Var.F(true);
                }
            }
            int p0 = getSendMessagesHelper().p0(arrayList, this.l6, z, z2, z3, i, 0, this.m4, -1, j, k7(), this.y5);
            ik.q0(p0, this.Ba, this);
            if (p0 != 0) {
                gm.c3(new ho1(this, (byte) 2));
            }
        }
    }

    public final void P7() {
        boolean z;
        Rect rect;
        if (this.m1 != null) {
            if (this.zb <= 0 && this.Ab <= 0) {
                z = false;
            } else {
                z = true;
            }
            qr1 qr1Var = this.w;
            float c = qr1Var.c();
            bbc bbcVar = qr1Var.b;
            int max = (int) Math.max(0.0f, (c * bbcVar.a) - gm.L(29.0f));
            mu1 mu1Var = this.m1;
            xd9 xd9Var = mu1Var.M;
            Rect rect2 = this.wd;
            if (xd9Var != null) {
                rect2.set(0, 0, mu1Var.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                this.m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                rect2.offset(0, -this.A0.getTop());
                vr1 vr1Var = this.A0;
                if (vr1Var.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                vr1Var.setClipBounds(rect);
            }
            if (this.Z != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(qr1Var.w, qr1Var.c() * bbcVar.a) - gm.L(29.0f))));
                e02 e02Var = this.Z;
                if (z) {
                    rect2 = null;
                }
                e02Var.setClipBounds(rect2);
            }
        }
    }

    public final void P8(Context context, TLRPC.TL_error tL_error) {
        boolean z;
        oc7.r1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.l6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (sd2.T(this.e) && !this.e.megagroup) {
                z = true;
            } else {
                z = false;
            }
            int i = ew5.t1;
            ew5.E0(context, this, c41.b0(this), z);
        }
        Wb(false, true);
    }

    public final void P9(final defpackage.cd9[] r20, final defpackage.bu5 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.P9(cd9[], bu5):void");
    }

    public final void Pa(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final defpackage.k47 r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final defpackage.k47 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Pa(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, k47, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, k47):void");
    }

    public final void Pb() {
        gm.A3(5.0f, this.A0, null);
        xx0.APP_ERROR.a();
        ms1 ms1Var = this.a0;
        for (int i = 0; i < ms1Var.getChildCount(); i++) {
            gm.A3(5.0f, ms1Var.getChildAt(i), null);
        }
        org.telegram.ui.ActionBar.a actionBar = getActionBar();
        for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
            gm.A3(5.0f, actionBar.getChildAt(i2), null);
        }
    }

    public final void Pc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Pc(boolean):void");
    }

    public final SpannableStringBuilder Q4(boolean z) {
        int i;
        int i2;
        float f;
        if (!z) {
            i = 2131752474;
        } else if (this.e.in_news) {
            i = 2131752469;
        } else {
            i = 2131752471;
        }
        if (!z) {
            i2 = 2131232458;
        } else if (getMessagesController().o2(this.l6, 0L, null)) {
            i2 = 2131232457;
        } else {
            i2 = 2131232461;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!z || !this.e.in_news) {
            spannableStringBuilder.append((CharSequence) "￼ ");
            pn2 pn2Var = new pn2(i2, 2);
            if (z) {
                f = 20.0f;
            } else {
                f = 24.0f;
            }
            pn2Var.c(gm.L(f));
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) jb6.M0(i, null));
        if (z) {
            spannableStringBuilder.append((CharSequence) " ￼");
            pn2 pn2Var2 = new pn2(2131232455, 2);
            pn2Var2.c(gm.L(18.0f));
            spannableStringBuilder.setSpan(pn2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void Q5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Q5():void");
    }

    public final wzc Q6(wzc wzcVar) {
        e51 e51Var;
        mzc izcVar;
        if (wzcVar != null && (e51Var = this.Y1) != null && ((e51Var.isShowing() && !this.Y1.J) || this.Y1.r2)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                izcVar = new lzc(wzcVar);
            } else if (i >= 30) {
                izcVar = new kzc(wzcVar);
            } else if (i >= 29) {
                izcVar = new jzc(wzcVar);
            } else {
                izcVar = new izc(wzcVar);
            }
            izcVar.c(8, iq5.e);
            izcVar.i(8, false);
            return izcVar.b();
        }
        return wzcVar;
    }

    public final void Q7() {
        this.Oa = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Q8(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        km0 km0Var;
        lz4 lz4Var;
        am0 k;
        boolean z4;
        r02 r02Var;
        boolean z5;
        String str;
        if (getParentActivity() != null && this.ka == 0.0f) {
            if (this.g4 == 3) {
                Bundle bundle = new Bundle();
                long f7 = f7();
                if (f7 >= 0) {
                    bundle.putLong("user_id", f7);
                } else {
                    bundle.putLong("chat_id", -f7);
                }
                presentFragment(new yv1(bundle));
                return;
            }
            boolean z6 = false;
            if (c8()) {
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.o6;
                    if (i5 >= sparseArrayArr[0].size()) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i5)));
                    i5++;
                }
                Wb(true, true);
                byte[] bArr = this.k4;
                String str2 = this.l4;
                qm1 qm1Var = new qm1(this, (byte) 2);
                int i6 = da9.v1;
                int currentAccount = getCurrentAccount();
                Activity parentActivity = getParentActivity();
                long a = a();
                if (parentActivity != null) {
                    da9.D0(currentAccount, parentActivity, a, false, false, arrayList, c41.b0(this), getResourceProvider(), bArr, str2, qm1Var);
                }
            } else if (this.g4 == 2) {
                finishFragment();
                iu1 iu1Var = this.n9;
                if (this.E0.getTag() == null) {
                    z6 = true;
                }
                iu1Var.E(true, z6);
            } else {
                TLRPC.User user = this.f;
                if (user != null) {
                    if (user.id == 489000) {
                        Hc(true);
                        return;
                    } else if (this.n) {
                        if (user.bot) {
                            String str3 = this.w8;
                            this.w8 = null;
                            getMessagesController().n5(new lm1(this, str3, (byte) 1), this.f.id);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                        String M0 = jb6.M0(2131754030, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.U = M0;
                        alertDialog$Builder.j(jb6.M0(2131747564, null), new gm1(this, (byte) 8));
                        heVar.S = jb6.M0(2131689472, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        showDialog(heVar);
                        return;
                    }
                }
                if (m9c.B(user)) {
                    Hc(true);
                    return;
                }
                TLRPC.User user2 = this.f;
                if (user2 != null && user2.bot && (str = this.w8) != null) {
                    if (str.length() != 0) {
                        getMessagesController().G4(this.w8, this.f);
                    } else {
                        getSendMessagesHelper().q0(y5a.b("/start", this.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    }
                    this.w8 = null;
                    Pc(false);
                    return;
                }
                if (sd2.T(this.e)) {
                    TLRPC.Chat chat = this.e;
                    if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                        if (!this.rb) {
                            if (sd2.r0(chat) && (!Z7() || !this.e.in_news)) {
                                if (this.e.join_request) {
                                    Wb(true, true);
                                    oc7 r1 = oc7.r1(this.currentAccount);
                                    long j = this.e.id;
                                    TLRPC.User f = z8c.h(this.currentAccount).f();
                                    mz mzVar = new mz(this, (byte) 21);
                                    g11 g11Var = new g11(this, context, (byte) 12);
                                    if (Z7() && this.qb) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    r1.j(j, f, 0, null, null, true, mzVar, g11Var, null, z5);
                                    return;
                                }
                                mz mzVar2 = this.d6;
                                if (mzVar2 != null) {
                                    gm.r(mzVar2);
                                    this.d6 = null;
                                }
                                if (Z7() && this.qb) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                Wb(true, true);
                                getMessagesController().j(this.e.id, getUserConfig().f(), 0, null, this, false, new wm1(this, z4, (byte) 0), null, null, z4);
                                nm7.e().k(nm7.M4, new Object[0]);
                                k7 k7Var = this.Z1;
                                if (k7Var != null && (r02Var = this.b1) != null && r02Var.d(k7Var) && this.c2.getVisibility() != 8 && this.c2.getTag(2131296587) != null) {
                                    oc7.r1(this.currentAccount).W3.edit().putInt("dialog_bar_vis3" + this.l6, 3).commit();
                                    getNotificationCenter().k(nm7.Q0, Long.valueOf(this.l6));
                                    return;
                                }
                                return;
                            } else if (Z7()) {
                                if (Z7() && !this.rb && getParentActivity() != null) {
                                    boolean z7 = this.e.in_news;
                                    boolean o2 = getMessagesController().o2(this.l6, 0L, null);
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(this.l6);
                                    if (dialog != null && dialog.folder_id == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    u00 u00Var = this.pb;
                                    if (u00Var == null || !((bka) u00Var.d).d(u00Var)) {
                                        u00 u00Var2 = this.pb;
                                        if (u00Var2 == null) {
                                            bka simpleMenuOverlay = getSimpleMenuOverlay();
                                            if (simpleMenuOverlay != null) {
                                                nz4 nz4Var = this.K;
                                                if (nz4Var != null) {
                                                    nz4 nz4Var2 = this.J;
                                                    if (nz4Var2 == null) {
                                                        nz4Var2 = nz4Var;
                                                    }
                                                    lz4 lz4Var2 = new lz4(nz4Var2, nz4Var);
                                                    km0Var = new km0(lz4Var2, lz4Var2, lz4Var2);
                                                    km0Var.k = true;
                                                    km0Var.j = S6();
                                                    zgc zgcVar = this.l1;
                                                    yv1 yv1Var = this.Aa;
                                                    if (yv1Var == null) {
                                                        yv1Var = this;
                                                    }
                                                    mu1 mu1Var = yv1Var.m1;
                                                    km0Var.h = zgcVar;
                                                    km0Var.i = mu1Var;
                                                    km0Var.g = this.F;
                                                    lz4Var = lz4Var2;
                                                } else {
                                                    km0Var = this.M;
                                                    lz4Var = null;
                                                }
                                                km0 km0Var2 = km0Var;
                                                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                                                if (aVar != null && aVar.getMenuGlassColorProvider() != null) {
                                                    k = this.actionBar.getMenuGlassColorProvider();
                                                } else {
                                                    k = qqd.k(this.Ba);
                                                }
                                                u00 u00Var3 = new u00(this.d1, new ws1(this), simpleMenuOverlay, km0Var2, lz4Var, k, this.x, this.Ba);
                                                this.pb = u00Var3;
                                                u00Var2 = u00Var3;
                                            } else {
                                                return;
                                            }
                                        }
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) u00Var2.s;
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                                        if (!z7) {
                                            if (o2) {
                                                i3 = 2131232268;
                                                i4 = 2131752283;
                                            } else {
                                                i3 = 2131231513;
                                                i4 = 2131752361;
                                            }
                                            u00Var2.e(i3, jb6.M0(i4, null), false, new wm1(this, o2, (byte) 3));
                                        }
                                        if (z7) {
                                            u00Var2.e(2131232027, jb6.M0(2131752476, null), false, new en1(this, (byte) 21));
                                            u00Var2.e(2131232201, jb6.M0(2131752255, null), true, new en1(this, (byte) 22));
                                        } else {
                                            if (z3) {
                                                i = 2131232415;
                                                i2 = 2131743602;
                                            } else {
                                                i = 2131232057;
                                                i2 = 2131754137;
                                            }
                                            u00Var2.e(i, jb6.M0(i2, null), false, new wm1(this, z3, (byte) 4));
                                            u00Var2.e(2131232096, jb6.M0(2131752256, null), true, new en1(this, (byte) 23));
                                        }
                                        qs1 qs1Var = (qs1) u00Var2.b;
                                        bka bkaVar = (bka) u00Var2.d;
                                        if (!bkaVar.d(u00Var2) && qs1Var.getContainer().isAttachedToWindow() && qs1Var.getContainer().getWidth() != 0) {
                                            u00Var2.w = null;
                                            bkaVar.setOnClosed(new yt0(u00Var2, (byte) 26));
                                            bkaVar.e(u00Var2, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                Hc(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null && chatFull.can_delete_channel) {
                    z = true;
                } else {
                    z = false;
                }
                TLRPC.Chat chat2 = this.e;
                TLRPC.User user3 = this.f;
                if (this.h != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ik.r(this, false, chat2, user3, z2, true, false, z, new gm1(this, (byte) 9));
            }
        }
    }

    public final void Q9() {
        if (this.Ac == null) {
            return;
        }
        cd9[] cd9VarArr = {cd9.Y0(getParentActivity(), this, true, this.resourceProvider, new x0(this, cd9VarArr, (byte) 22))};
    }

    public final void Qa(java.util.ArrayList r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Qa(java.util.ArrayList, boolean):void");
    }

    public final void Qb() {
        k47 k47Var = null;
        for (int i = 1; i >= 0; i--) {
            SparseArray[] sparseArrayArr = this.o6;
            if (k47Var == null && sparseArrayArr[i].size() != 0) {
                k47Var = (k47) this.G6[i].get(sparseArrayArr[i].keyAt(0));
            }
            sparseArrayArr[i].clear();
            this.p6[i].clear();
            this.q6[i].clear();
        }
        if (getParentActivity() != null && k47Var != null && ((k47.Q4(k47Var.k) || k47Var.g4()) && k47Var.F0() != null)) {
            TLRPC.Document F0 = k47Var.F0();
            bc4.G(this.currentAccount);
            File J = bc4.J(F0, null, false, true);
            TLRPC.Message message = k47Var.k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(k47Var.k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!k47.K4(k47Var.k) && !k47Var.g4()) {
                    intent.setType(k47Var.t1());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = getParentActivity();
                        StringBuilder sb = new StringBuilder();
                        a.d();
                        sb.append("org.telegram.messenger.beta");
                        sb.append(".provider");
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.c(parentActivity, sb.toString(), J));
                        intent.setFlags(1);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(J));
                }
                getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, null)), 500);
            }
        }
        C7();
        gd(0, true);
        Gd(false);
        td();
    }

    public final void Qc() {
        Pc(false);
    }

    public final void R4(boolean z) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z2;
        final boolean z3;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z4 = true;
        int i3 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.g4 != 0 || this.s4 != 0 || (chatFull = this.r8) == null || chatFull.ttl_period == 0)) || ((user = this.f) != null && (m9c.z(user) || (this.h == null && ((userFull = this.s8) == null || userFull.ttl_period == 0)))))) {
            p7 p7Var = this.e0;
            if (p7Var != null) {
                p7Var.e(8);
            }
            pr1 pr1Var = this.p1;
            if (pr1Var != null) {
                pr1Var.a.a(false, z);
            }
        } else {
            p7 p7Var2 = this.e0;
            if (p7Var2 != null) {
                p7Var2.e(0);
            }
            pr1 pr1Var2 = this.p1;
            if (pr1Var2 != null) {
                pr1Var2.a.a(true, z);
            }
        }
        p7 p7Var3 = this.v0;
        if (p7Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            p7Var3.e(i2);
        }
        pr1 pr1Var3 = this.p1;
        if (pr1Var3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f) != null && user2.linked_community_id != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            pr1Var3.setCommunityItemVisible(z2);
            final pr1 pr1Var4 = this.p1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ImageView imageView = pr1Var4.F;
            ImageView imageView2 = pr1Var4.E;
            if (imageView2 != null && imageView != null) {
                pr1Var4.n0 = z3;
                float f9 = 1.1f;
                float f10 = 1.0f;
                if (!z) {
                    int i4 = 4;
                    if (z3) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    imageView2.setVisibility(i);
                    if (z3) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    imageView2.setAlpha(f5);
                    if (z3) {
                        f6 = 1.1f;
                    } else {
                        f6 = 0.0f;
                    }
                    imageView2.setScaleX(f6);
                    if (!z3) {
                        f9 = 0.0f;
                    }
                    imageView2.setScaleY(f9);
                    if (z3) {
                        i4 = 0;
                    }
                    imageView.setVisibility(i4);
                    if (z3) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView.setAlpha(f7);
                    if (z3) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    imageView.setScaleX(f8);
                    if (!z3) {
                        f10 = 0.0f;
                    }
                    imageView.setScaleY(f10);
                } else {
                    if (z3) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f);
                    if (z3) {
                        f2 = 1.1f;
                    } else {
                        f2 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                    if (!z3) {
                        f9 = 0.0f;
                    }
                    scaleX.scaleY(f9).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z5 = z3;
                                    pr1 pr1Var5 = pr1Var4;
                                    if (!z5) {
                                        pr1Var5.E.setVisibility(4);
                                        return;
                                    } else {
                                        pr1Var5.getClass();
                                        return;
                                    }
                                default:
                                    boolean z6 = z3;
                                    pr1 pr1Var6 = pr1Var4;
                                    if (!z6) {
                                        pr1Var6.F.setVisibility(4);
                                        return;
                                    } else {
                                        pr1Var6.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                    ViewPropertyAnimator animate2 = imageView.animate();
                    if (z3) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f3);
                    if (z3) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f4);
                    if (!z3) {
                        f10 = 0.0f;
                    }
                    scaleX2.scaleY(f10).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z5 = z3;
                                    pr1 pr1Var5 = pr1Var4;
                                    if (!z5) {
                                        pr1Var5.E.setVisibility(4);
                                        return;
                                    } else {
                                        pr1Var5.getClass();
                                        return;
                                    }
                                default:
                                    boolean z6 = z3;
                                    pr1 pr1Var6 = pr1Var4;
                                    if (!z6) {
                                        pr1Var6.F.setVisibility(4);
                                        return;
                                    } else {
                                        pr1Var6.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.p1.g(encryptedChat2.ttl, z);
            } else {
                TLRPC.UserFull userFull2 = this.s8;
                if (userFull2 != null) {
                    this.p1.g(userFull2.ttl_period, z);
                } else {
                    TLRPC.ChatFull chatFull3 = this.r8;
                    if (chatFull3 != null) {
                        this.p1.g(chatFull3.ttl_period, z);
                    }
                }
            }
        }
        if (this.u0 != null && (chatFull2 = this.r8) != null) {
            if (!chatFull2.can_delete_channel && sd2.T(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || sd2.t0(chat4)) {
                    z4 = false;
                }
            }
            p7 p7Var4 = this.u0;
            if (z4) {
                i3 = 0;
            }
            p7Var4.e(i3);
        }
        r();
    }

    public final void R5() {
        if (this.f2 == null && getParentActivity() != null) {
            f6();
            if (this.b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f2 = textView;
                textView.setGravity(17);
                this.f2.setTextSize(1, 14.0f);
                this.f2.setTypeface(gm.o());
                TextView textView2 = this.f2;
                int i = cmb.Ei;
                anb.X(textView2, i, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new pn2(2131232494, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) jb6.M0(2131745250, null));
                this.f2.setText(spannableStringBuilder);
                TextView textView3 = this.f2;
                int p1 = cmb.p1(0.1f, getThemedColor(i));
                int L = gm.L(3.0f);
                anb.R(textView3, cmb.W(gm.L(15.0f), p1, L, L, L, L), null, anb.K(0.1f, i), getResourceProvider());
                this.f2.setOnClickListener(new tm1(this, (byte) 20));
                rve.b(this.f2, 0.04f, 1.5f);
                this.b1.addView(this.f2, qoe.r(-1, 36, 83));
                this.b1.i(12, this.f2);
                this.b1.h(this.f2);
            }
        }
    }

    public final ArrayList R6() {
        hu1 hu1Var = this.D0;
        if (hu1Var != null) {
            return hu1Var.Q;
        }
        return null;
    }

    public final void R7() {
        TLRPC.User user;
        boolean z;
        if (a() != getUserConfig().e() && !getUserConfig().p() && (user = this.f) != null && user.contact_require_premium) {
            boolean isEmpty = this.M6.isEmpty();
            if (getMessagesController().L2(a()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (isEmpty != z) {
                getMessagesController().j2(this.classGuid, a());
            }
        }
    }

    public final void R8(ArrayList arrayList, long j, vs9 vs9Var, boolean z, int i) {
        if (z) {
            a6a.B(this.currentAccount).p0(arrayList, j, false, false, true, i, 0, null, -1, 0L, 0L, null);
            gm.d3(new xo0(this, j, (byte) 6), 400L);
            vs9Var.dismiss();
        }
    }

    public final void R9(TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j;
        yj8 yj8Var = new yj8(this, this.currentAccount, user, null, null, getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j = tL_emojiStatusCollectible.document_id;
            yj8Var.y2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        bf0 bf0Var = new bf0(getParentActivity());
        tm tmVar = new tm(gm.L(160.0f), 4, bf0Var, false);
        bf0Var.setImageDrawable(tmVar);
        bf0Var.addOnAttachStateChangeListener(new eq1(tmVar, (byte) 0));
        tmVar.j(j, false);
        yj8Var.z2 = true;
        yj8Var.w2 = bf0Var;
        showDialog(yj8Var);
    }

    public final void Ra(View view, float f, float f2, boolean z) {
        k47 k47Var;
        int i;
        int i2;
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            k47Var = rc2Var.getMessageObject();
            rc2Var.h1 = f;
            rc2Var.i1 = f2;
            f37 f37Var = rc2Var.fb;
            float f3 = rc2Var.i1;
            f37Var.h = rc2Var.getTranslationX() + f;
            f37Var.i = f3;
            f37Var.l = SystemClock.elapsedRealtime();
        } else if (view instanceof cm1) {
            k47Var = ((cm1) view).getMessageObject();
        } else {
            k47Var = null;
        }
        int Z6 = Z6(k47Var);
        if ((k47Var == null || ((i2 = k47Var.D) != 30 && i2 != 18 && i2 != 25)) && Z6 >= 2 && Z6 != 20 && Z6 != 21) {
            if (k47Var == null || ((i = k47Var.D) != 27 && i != 30 && !k47Var.W4() && !k47Var.q4() && !k47.c3(k47Var.k))) {
                D4(k47Var, z, true);
                Kc();
                Gd(false);
            }
        }
    }

    public final void Rb(int i, k47 k47Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
        String M0 = jb6.M0(2131745154, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        TLRPC.User user = this.f;
        if (user != null) {
            if (user.bot) {
                heVar.U = jb6.M0(2131754034, null);
            } else {
                String l = mlb.l(new StringBuilder("+"), getUserConfig().f().phone, r58.f());
                TLRPC.User user2 = this.f;
                heVar.U = gm.S2(jb6.a0("AreYouSureShareMyContactInfoUser", null, 2131754032, l, bw2.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            heVar.U = jb6.M0(2131754035, null);
        }
        alertDialog$Builder.j(jb6.M0(2131745195, null), new yg(this, i, k47Var, (byte) 3));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
    }

    public final void Rc() {
        int i;
        y21 y21Var;
        zs1 zs1Var;
        ms1 ms1Var;
        if (this.aa && this.A0 != null) {
            float f = 0.0f;
            if (this.Ma <= 0 || this.bb != 0.0f) {
                float t7 = t7(gm.L(7.0f));
                ys1 ys1Var = this.D1;
                if (ys1Var != null) {
                    i = gm.L(ys1Var.F * 35.0f);
                } else {
                    i = 0;
                }
                float U6 = (U6() * gm.L(43.0f)) + t7 + i;
                float f2 = this.P9;
                this.Q9 = U6;
                this.P9 = u7(izb.a) + gm.L(4.0f) + this.S9 + U6;
                if (this.actionBar.getVisibility() == 0 || this.Aa != null) {
                    this.P9 += this.actionBar.getMeasuredHeight();
                }
                this.R9 = 0;
                this.P9 = this.P9 + this.Xa + this.T9;
                if (this.bb != 0.0f && (ms1Var = this.a0) != null && ms1Var.getVisibility() == 0) {
                    float f3 = this.P9;
                    float measuredHeight = this.bb * (this.a0.getMeasuredHeight() - gm.L(44.0f));
                    this.P9 = f3 - measuredHeight;
                    f = measuredHeight;
                }
                cm1 cm1Var = this.o3;
                if (cm1Var != null) {
                    cm1Var.setTranslationY(((this.A0.getTranslationY() + this.P9) + this.X9) - gm.L(30.0f));
                    float f4 = this.P9;
                    float f5 = this.X9;
                    this.P9 = f4 + f5;
                    this.R9 = (int) (this.R9 + f5);
                }
                ds1 ds1Var = this.m3;
                if (ds1Var != null) {
                    ds1Var.setTranslationY((((this.A0.getTranslationY() - f) + this.P9) + this.V9) - gm.L(4.0f));
                }
                Tc();
                vr1 vr1Var = this.A0;
                if (vr1Var != null && this.C0 != null && this.D0 != null) {
                    int paddingTop = vr1Var.getPaddingTop();
                    int paddingBottom = this.A0.getPaddingBottom();
                    A5();
                    if (this.A0.getPaddingTop() != paddingTop || this.A0.getPaddingBottom() != paddingBottom) {
                        Q7();
                    }
                    this.A0.setTopGlowOffset((int) ((this.P9 - this.R9) - gm.L(4.0f)));
                    if (f2 != this.P9 && this.vb == 0) {
                        int childCount = this.A0.getChildCount();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= childCount) {
                                break;
                            }
                            View childAt = this.A0.getChildAt(i2);
                            this.A0.getClass();
                            if (RecyclerView.R(childAt) == this.D0.b() - 1) {
                                float f6 = this.P9;
                                if (childAt.getTop() > f6) {
                                    this.A0.scrollBy(0, (int) (childAt.getTop() - f6));
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!j8() && !this.R4 && this.vb == 0 && this.b8 != null && this.A0 != null && ((zs1Var = this.e2) == null || zs1Var.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f2 - this.P9));
                    }
                }
                this.aa = false;
                u31 u31Var = u31.x;
                if (u31Var != null && (y21Var = u31Var.e) != null) {
                    y21Var.updatePosition();
                }
                A5();
            }
        }
    }

    public final void S4() {
        if (this.mb) {
            return;
        }
        if (c8()) {
            gm.U2(getParentActivity(), this.classGuid);
        } else {
            gm.V2(getParentActivity(), this.classGuid);
        }
    }

    public final void S5() {
        if (getParentActivity() != null && getParentActivity() != null && this.Y1 == null) {
            e51 e51Var = new e51(this, getParentActivity(), this, this.Ba, (byte) 1);
            this.Y1 = e51Var;
            e51Var.T1 = a();
            e51 e51Var2 = this.Y1;
            e51Var2.c2 = true;
            e51Var2.W3 = new qt1(this);
        }
    }

    public final sy4 S6() {
        yv1 yv1Var = this.Aa;
        if (yv1Var != null) {
            return yv1Var.S6();
        }
        return this.glassEngine;
    }

    public final boolean S7() {
        if (this.g2 != null && this.s4 == 0) {
            return true;
        }
        return false;
    }

    public final void S8(tv0 tv0Var, String str) {
        if (oc7.r1(this.currentAccount).N2(true)) {
            tv0Var.run();
            l11.o(getParentActivity(), str, false, null);
            return;
        }
        ik.l0(getParentActivity(), this.Ba, str, true, new eo1((byte) 1, tv0Var, this, str));
    }

    public final void S9(long j, long j2, Long l, Boolean bool) {
        boolean z = false;
        jva v = jva.v(this.currentAccount, false);
        if (l.longValue() > 0 && bool.booleanValue()) {
            z = true;
        }
        v.g0(j, j2, z, true);
    }

    public final void Sa(int i) {
        boolean z;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z2 = false;
        byte b = 1;
        if (i == 0) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q0 = gm.q0(null, false);
                if (q0 != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Activity parentActivity = getParentActivity();
                        a.d();
                        intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", q0));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q0));
                    }
                    this.n8 = q0.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        try {
            if (i == 1) {
                Activity parentActivity2 = getParentActivity();
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (sd2.T(this.e) && (tL_chatBannedRights = this.e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z = false;
                } else {
                    z = true;
                }
                j68 j68Var = new j68(0, z, true, this);
                if (this.g4 == 9) {
                    j68Var.H = (byte) 1;
                    j68Var.I = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !sd2.N(chat) && this.e.slowmode_enabled) {
                        j68Var.H = (byte) 10;
                        j68Var.I = true;
                    } else {
                        if (this.H5 == null) {
                            b = 0;
                            z2 = true;
                        }
                        j68Var.H = b;
                        j68Var.I = z2;
                    }
                }
                j68Var.W = new nl9(this, (byte) 17);
                presentFragment(j68Var);
            } else if (i == 2) {
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s0 = gm.s0(false);
                    if (s0 != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Activity parentActivity3 = getParentActivity();
                            a.d();
                            intent2.putExtra("output", FileProvider.c(parentActivity3, "org.telegram.messenger.beta.provider", s0));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(s0));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.n8 = s0.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean Sb() {
        if (V7() && this.F5 == null && this.H5 == null) {
            if (this.g4 != 8 && V7() && this.e != null) {
                TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.e.id, 1L);
                if (this.g4 != 8) {
                    if (f != null) {
                        if (f.closed && !sd2.i(this.currentAccount, this.e, f)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void Sc(boolean z) {
        vh6 vh6Var;
        ArrayList arrayList;
        boolean z2;
        hu1 hu1Var;
        hu1 hu1Var2;
        f47 f47Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        k47 k47Var;
        ArrayList arrayList2 = new ArrayList(hs6.d0(this.currentAccount).Z0);
        if (this.Eb == null) {
            this.Eb = new vh6();
        }
        vh6 vh6Var2 = this.Db;
        if (vh6Var2 == null) {
            this.Db = new vh6();
        } else {
            vh6Var2.b();
        }
        this.D0.Q.clear();
        this.Eb.b();
        vh6 vh6Var3 = null;
        vh6 vh6Var4 = null;
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            vh6Var = this.P6;
            arrayList = this.M6;
            z2 = true;
            if (i >= size) {
                break;
            }
            k47 k47Var2 = (k47) arrayList2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    k47Var = (k47) arrayList.get(i2);
                    if (k47.B0(k47Var.k) == k47.B0(k47Var2.k) && k47Var.e1() == k47Var2.e1()) {
                        break;
                    }
                    i2++;
                } else {
                    k47Var = null;
                    break;
                }
            }
            if (k47Var2.m1 == 0) {
                if (k47Var == null) {
                    k47Var2.K(true);
                } else {
                    k47Var2.z0 = k47Var.z0;
                    k47Var2.y0 = k47Var.y0;
                }
            }
            if (k47Var != null) {
                k47Var2.n2 = k47Var.n2;
                if (this.D0.O && k47Var2.m1 != 0) {
                    k47Var.N(k47Var2);
                } else {
                    k47Var2.N(k47Var);
                }
            } else if (k47Var2.m1 == 0) {
                int i3 = zd;
                zd = i3 + 1;
                k47Var2.m1 = i3;
            }
            k47Var2.W2 = null;
            TLRPC.Message message2 = k47Var2.k;
            if (message2 != null) {
                message2.out = true;
            }
            k47Var2.O3();
            if (k47Var2.z2()) {
                f47 f47Var2 = (f47) vh6Var.f(k47Var2.d1());
                if (f47Var2 == null) {
                    f47Var2 = new f47();
                    f47Var2.n = this.nb;
                    long c1 = k47Var2.c1();
                    f47Var2.a = c1;
                    vh6Var.k(f47Var2, c1);
                } else if (vh6Var3 == null || vh6Var3.h(k47Var2.c1()) < 0) {
                    if (vh6Var4 == null) {
                        vh6Var4 = new vh6();
                    }
                    vh6Var4.k(f47Var2, k47Var2.c1());
                }
                ArrayList arrayList3 = f47Var2.d;
                if (vh6Var3 == null) {
                    vh6Var3 = new vh6();
                }
                vh6Var3.k(f47Var2, f47Var2.a);
                if (f47Var2.d(k47Var2) == null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList3.size()) {
                            if (((k47) arrayList3.get(i4)).e1() != k47Var2.e1()) {
                                i4++;
                            }
                        } else {
                            arrayList3.add(k47Var2);
                            break;
                        }
                    }
                }
            } else if (k47Var2.d1() != 0) {
                k47Var2.k.grouped_id = 0L;
                k47Var2.e = 0L;
            }
            this.D0.Q.add(k47Var2);
            this.Eb.k(k47Var2, k47Var2.e1());
            i++;
        }
        if (vh6Var3 != null) {
            for (int i5 = 0; i5 < vh6Var3.m(); i5++) {
                f47 f47Var3 = (f47) vh6Var3.n(i5);
                Collections.sort(f47Var3.d, new sa((byte) 19));
                f47Var3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                k47 k47Var3 = (k47) arrayList.get(i6);
                if (k47Var3 != null && (message = k47Var3.k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= k47Var3.k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(k47Var3.k.reactions.results.get(i7).reaction)) {
                            arrayList4.add(k47Var3);
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < arrayList4.size(); i8++) {
            k47 k47Var4 = (k47) arrayList4.get(i8);
            if (!this.Eb.d(k47Var4.e1())) {
                k47Var4.W2 = null;
                TLRPC.Message message3 = k47Var4.k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(k47Var4);
                this.Eb.k(k47Var4, k47Var4.e1());
            }
        }
        int i9 = 0;
        while (true) {
            int size2 = this.D0.Q.size();
            hu1Var = this.D0;
            if (i9 >= size2) {
                break;
            }
            k47 k47Var5 = (k47) hu1Var.Q.get(i9);
            if (k47Var5.z2() && (f47Var = (f47) vh6Var.f(k47Var5.c1())) != null) {
                ArrayList arrayList5 = f47Var.d;
                for (int size3 = arrayList5.size() - 1; size3 >= 0; size3--) {
                    k47 k47Var6 = (k47) arrayList5.get(size3);
                    if (k47Var6 != k47Var5 && !this.Eb.d(k47Var6.e1())) {
                        this.D0.Q.add(i9, k47Var6);
                        this.Eb.k(k47Var6, k47Var6.e1());
                        i9++;
                    }
                }
            }
            i9++;
        }
        Collections.sort(hu1Var.Q, new sa((byte) 20));
        k47 k47Var7 = null;
        int i10 = 0;
        while (true) {
            int size4 = this.D0.Q.size();
            hu1Var2 = this.D0;
            if (i10 >= size4) {
                break;
            }
            k47 k47Var8 = (k47) hu1Var2.Q.get(i10);
            if (this.nb && k47Var8 != null && i10 == 0) {
                Va(i10, k47Var8);
                i10++;
            }
            if (!this.nb && k47Var7 != null && k47Var8.X != k47Var7.X) {
                Va(i10, k47Var7);
                i10++;
            }
            vh6 vh6Var5 = this.Db;
            int i11 = k47Var8.X;
            ArrayList arrayList6 = (ArrayList) vh6Var5.f(i11);
            if (arrayList6 == null) {
                arrayList6 = td4.t(this.Db, i11);
            }
            arrayList6.add(k47Var8);
            if (this.nb && k47Var7 != null && i11 != k47Var7.X) {
                Va(i10, k47Var8);
                i10++;
            }
            if (!this.nb && i10 >= this.D0.Q.size() - 1) {
                Va(this.D0.Q.size(), k47Var8);
                i10++;
            }
            i10++;
            k47Var7 = k47Var8;
        }
        hu1Var2.P = hs6.d0(this.currentAccount).Y1();
        if (z) {
            this.D0.O();
            this.D0.J(true);
            if (this.D0.O ? getMediaDataController().M0 == 0 || !this.D0.Q.isEmpty() : !this.Y6 || !arrayList.isEmpty() || this.D0.x >= 0) {
                z2 = false;
            }
            sc(z2);
            if (this.A0 != null) {
                U5(false);
                if (this.D0.O ? getMediaDataController().M0 != 0 || !this.D0.Q.isEmpty() : this.Y6 || !arrayList.isEmpty() || this.D0.x >= 0) {
                    this.f1.setVisibility(8);
                    this.A0.setEmptyView(null);
                    return;
                }
                this.A0.setEmptyView(this.f1);
                vr1 vr1Var = this.A0;
                vr1Var.L0(vr1Var.w1());
            }
        }
    }

    public final void T4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.T4():void");
    }

    public final void T5(k47 k47Var, f47 f47Var, boolean z) {
        ho1 ho1Var;
        if (k47Var == null) {
            SparseArray[] sparseArrayArr = this.o6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.r8;
        long j = this.d7;
        int d = (int) d();
        int i = this.g4;
        ho1 ho1Var2 = new ho1(this, (byte) 10);
        if (z) {
            ho1Var = new ho1(this, (byte) 11);
        } else {
            ho1Var = null;
        }
        ho1 ho1Var3 = ho1Var;
        ik.y(this, user, chat, encryptedChat, chatFull, j, k47Var, this.o6, f47Var, d, i, null, ho1Var2, ho1Var3, this.Ba);
    }

    public final f47 T6(long j) {
        return (f47) this.P6.f(j);
    }

    public final void T8(tv0 tv0Var, String str) {
        if (oc7.r1(this.currentAccount).N2(false)) {
            tv0Var.run();
            getParentActivity();
            l11.p(str);
            return;
        }
        ik.l0(getParentActivity(), this.Ba, str, false, new eo1((byte) 0, tv0Var, this, str));
    }

    public final void T9(long j, long j2, Long l) {
        int i;
        String str;
        if (getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        String M0 = jb6.M0(2131746024, null);
        if (sd2.p0(this.e)) {
            i = 2131746028;
        } else {
            i = 2131746029;
        }
        SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, i, pg3.s(j)));
        if (l.longValue() > 0) {
            str = jb6.H(',', "RemoveMessageFeeRefund", (int) l.longValue());
        } else {
            str = null;
        }
        ik.f0(parentActivity, M0, S2, str, jb6.M0(2131751754, null), new dp1(this, j, j2, l, (byte) 0), this.resourceProvider, true);
    }

    public final void Ta(int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Ta(int):void");
    }

    public final void Tb(View view) {
        String str;
        km0 km0Var;
        lz4 lz4Var;
        am0 k;
        if (getParentActivity() != null && this.a0 != null) {
            ad adVar = this.bc;
            if (adVar == null || !adVar.c.d(adVar)) {
                sm2 sm2Var = this.cc;
                if (sm2Var == null) {
                    bka simpleMenuOverlay = getSimpleMenuOverlay();
                    if (simpleMenuOverlay != null) {
                        nz4 nz4Var = this.K;
                        if (nz4Var != null) {
                            nz4 nz4Var2 = this.J;
                            if (nz4Var2 == null) {
                                nz4Var2 = nz4Var;
                            }
                            lz4 lz4Var2 = new lz4(nz4Var2, nz4Var);
                            km0Var = new km0(lz4Var2, lz4Var2, lz4Var2);
                            km0Var.k = true;
                            km0Var.j = S6();
                            zgc zgcVar = this.l1;
                            yv1 yv1Var = this.Aa;
                            if (yv1Var == null) {
                                yv1Var = this;
                            }
                            mu1 mu1Var = yv1Var.m1;
                            km0Var.h = zgcVar;
                            km0Var.i = mu1Var;
                            km0Var.g = this.F;
                            lz4Var = lz4Var2;
                        } else {
                            km0Var = this.M;
                            lz4Var = null;
                        }
                        km0 km0Var2 = km0Var;
                        org.telegram.ui.ActionBar.a aVar = this.actionBar;
                        if (aVar != null && aVar.getMenuGlassColorProvider() != null) {
                            k = this.actionBar.getMenuGlassColorProvider();
                        } else {
                            k = qqd.k(this.Ba);
                        }
                        sm2 sm2Var2 = new sm2(simpleMenuOverlay, km0Var2, lz4Var, k, this.x, (byte) 1);
                        this.cc = sm2Var2;
                        sm2Var = sm2Var2;
                    } else {
                        return;
                    }
                }
                ad adVar2 = this.bc;
                if (adVar2 == null || adVar2.b != view) {
                    adVar2 = new ad(this.currentAccount, view, sm2Var, this.Ba);
                    this.bc = adVar2;
                }
                View view2 = adVar2.b;
                bka bkaVar = adVar2.c;
                if (!bkaVar.d(adVar2) && view2.isAttachedToWindow() && view2.getWidth() != 0) {
                    ArrayList arrayList = adVar2.N;
                    wc wcVar = adVar2.E;
                    mc mcVar = adVar2.y;
                    TL_agent.settings settingsVar = mcVar.d;
                    if (settingsVar != null && !TextUtils.isEmpty(settingsVar.active_provider)) {
                        adVar2.M = null;
                        if (!TextUtils.equals(adVar2.F, settingsVar.active_provider)) {
                            adVar2.F = settingsVar.active_provider;
                            arrayList.clear();
                            adVar2.H = "";
                            wcVar.a.setText("");
                            adVar2.j(true);
                        } else if (!TextUtils.isEmpty(adVar2.H)) {
                            adVar2.H = "";
                            wcVar.a.setText("");
                            adVar2.j(true);
                        } else if (adVar2.G.isEmpty() && !adVar2.K) {
                            adVar2.j(true);
                        }
                        ArrayList arrayList2 = adVar2.Q;
                        arrayList2.clear();
                        TL_agent.settings settingsVar2 = mcVar.d;
                        ArrayList e = mcVar.e(adVar2.F);
                        if (settingsVar2 != null && !TextUtils.isEmpty(settingsVar2.model)) {
                            TL_agent.agentModel e2 = ad.e(settingsVar2.model, arrayList);
                            if (e2 == null) {
                                e2 = ad.e(settingsVar2.model, e);
                            }
                            if (e2 == null) {
                                e2 = new TL_agent.agentModel();
                                e2.id = settingsVar2.model;
                                if (TextUtils.isEmpty(settingsVar2.model_name)) {
                                    str = settingsVar2.model;
                                } else {
                                    str = settingsVar2.model_name;
                                }
                                e2.name = str;
                                e2.effort_supported = settingsVar2.effort_supported;
                            }
                            arrayList2.add(e2);
                        }
                        int size = e.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = e.get(i);
                            i++;
                            TL_agent.agentModel agentmodel = (TL_agent.agentModel) obj;
                            if (arrayList2.size() >= 4) {
                                break;
                            } else if (ad.e(agentmodel.id, arrayList2) == null) {
                                arrayList2.add(agentmodel);
                            }
                        }
                        wcVar.c();
                        wcVar.d(false);
                        wcVar.b.w0(0);
                        bkaVar.setOnClosed(null);
                        bkaVar.e(adVar2, null, adVar2.f);
                    }
                }
            }
        }
    }

    public final void Tc() {
        int i;
        cs1 cs1Var = this.n3;
        if (cs1Var == null) {
            return;
        }
        cs1Var.setTranslationX(o7() / 2.0f);
        this.n3.setTranslationY((((this.A0.getTranslationY() + this.P9) + this.W9) - gm.L(4.0f)) + gm.L(28.0f));
        float i2 = Utilities.i(gm.x1(this.W9, -this.n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.n3.setAlpha(this.x3 * i2);
        cs1 cs1Var2 = this.n3;
        if (this.x3 * i2 > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        cs1Var2.setVisibility(i);
        float R1 = gm.R1(0.5f, 1.0f, i2);
        this.n3.setScaleX(R1);
        this.n3.setScaleY(R1);
    }

    public final void U4() {
        rc2 rc2Var;
        k47 primaryMessageObject;
        TLRPC.Message message;
        if (this.O1 != null) {
            return;
        }
        rc2 rc2Var2 = null;
        for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.A0.getChildAt(childCount);
            if ((childAt instanceof rc2) && (primaryMessageObject = (rc2Var = (rc2) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.k) != null && message.via_business_bot_id != 0) {
                rc2Var2 = rc2Var;
            }
        }
        Vb(rc2Var2);
    }

    public final void U5(boolean z) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        Paint paint;
        int i;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f1 == null || z) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.m1.addView(this.f1, 3, qoe.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f1.setTranslationX(o7() / 2.0f);
            int i2 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.q2 = textView;
                textView.setText(jb6.M0(2131747944, null));
                this.q2.setTextSize(1, 14.0f);
                this.q2.setGravity(17);
                anb.X(this.q2, cmb.Yc, getResourceProvider());
                this.q2.setBackground(new slb(this.q2, this.m1, gm.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.q2.setTypeface(gm.o());
                this.q2.setPadding(gm.L(10.0f), gm.L(2.0f), gm.L(10.0f), gm.L(3.0f));
                this.f1.addView(this.q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (b8()) {
                rz8 rz8Var = new rz8(getParentActivity(), this.g4, this.s4, this.f4, getResourceProvider());
                this.j1 = rz8Var;
                int L = gm.L(24.0f);
                rz8 rz8Var2 = this.j1;
                mu1 mu1Var = this.m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i3 = cmb.a;
                rz8Var.setBackground(new slb(rz8Var2, mu1Var, L, themedPaint));
                this.f1.addView(this.j1, qoe.e(-2, -2, 17));
                this.l1.d(this.j1, this.m1, new qn0((byte) 20), false);
            } else if (this.g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.e4;
                ylb resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i4 = cmb.Yc;
                cmb.v0(i4, resourceProvider);
                cmb.u0(i4);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231099);
                linearLayout.addView(imageView, qoe.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                anb.X(textView2, i4, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(gm.L(208.0f));
                textView2.setText(gm.S2(jb6.M0(2131752655, null)));
                linearLayout.addView(textView2, qoe.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                anb.X(textView3, i4, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(gm.L(208.0f));
                String str2 = tL_businessChatLink.link;
                q51[] q51VarArr = q51.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(cmb.Z(503316480, 503316480, 5, 5));
                textView3.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
                textView3.setOnClickListener(new t(tL_businessChatLink, this, (byte) 26));
                linearLayout.addView(textView3, qoe.t(-2, -2, 49, 17, 0, 17, 17));
                this.k1 = linearLayout;
                linearLayout.setBackground(new slb(this.k1, this.m1, gm.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f1.addView(this.k1, qoe.e(-2, -2, 17));
            } else if ((this.Y9 != null && this.f != null && !this.n) || (this.s8 != null && a() != getUserConfig().e() && ((this.s8.contact_require_premium && !getUserConfig().p()) || this.s8.send_paid_messages_stars > jva.v(this.currentAccount, false).m().amount))) {
                this.h1 = new tq1(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                Vc();
                this.h1.setListener(new gm1(this, (byte) 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.g1.setGravity(17);
                this.g1.addView(this.h1, qoe.e(-2, -2, 17));
                this.f1.addView(this.g1, qoe.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.s8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.h1.c(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.h1.setSticker(this.s8.business_intro.sticker);
                }
                Uc();
            } else if (this.h == null) {
                if (this.x4 && this.g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    mu1 mu1Var2 = this.m1;
                    wv1 wv1Var = this.Ba;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = gm.L(18.0f);
                    if (wv1Var != null) {
                        paint = wv1Var.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = cmb.T0("paintChatActionBackground");
                    }
                    int i5 = cmb.a;
                    linearLayout3.setBackground(new slb(linearLayout3, mu1Var2, L2, paint));
                    linearLayout3.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
                    linearLayout3.setOrientation(1);
                    bf0 bf0Var = new bf0(parentActivity2);
                    if (cmb.g1(wv1Var)) {
                        i = cmb.Ia;
                    } else {
                        i = cmb.Yc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    wi8.v(textView4, 1, 15.0f);
                    anb.X(textView4, i, wv1Var);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(gm.L(210.0f));
                    textView4.setText(jb6.M0(2131754237, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    anb.X(textView5, i, wv1Var);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(gm.L(160.0f));
                    textView5.setText(jb6.M0(2131743708, null));
                    linearLayout3.addView(bf0Var, qoe.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, qoe.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, qoe.r(-2, -2, 1));
                    TLRPC.Document V = hs6.d0(z8c.t0).V("🥳");
                    if (V != null) {
                        meb d = eq3.d(V.thumbs, cmb.b7, 0.2f, false);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        bf0Var.n(gn5.b(V), null, "tgs", d, null);
                    }
                    this.f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!j8() && this.g4 == 0 && (((user2 = this.f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !sd2.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    mu1 mu1Var3 = this.m1;
                    if (this.e == null) {
                        i2 = 2;
                    }
                    b92 b92Var = new b92(parentActivity3, mu1Var3, i2, this.Ba);
                    this.n1 = b92Var;
                    this.f1.addView(b92Var, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.n1.setStatusText(gm.S2(jb6.M0(2131749195, null)));
                    }
                } else {
                    if (j8() && this.g4 == 0) {
                        str = this.v4 ? jb6.M0(2131747960, null) : jb6.M0(2131747902, null);
                    } else if (this.g4 == 1) {
                        str = jb6.M0(2131747895, null);
                    } else {
                        TLRPC.User user3 = this.f;
                        if (user3 != null) {
                            long j = user3.id;
                            if (j != 777000 && j != 429000 && j != 4244000 && oc7.G2(user3)) {
                                str = jb6.M0(2131749306, null);
                            }
                        }
                        if (this.g4 != 8 && ((user = this.f) == null || user.self || user.deleted || this.n)) {
                            str = jb6.M0(2131747927, null);
                        }
                    }
                    if (str == null) {
                        this.h1 = new uq1(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                        Vc();
                        this.h1.setListener(new gm1(this, (byte) 5));
                        TLRPC.UserFull userFull2 = this.s8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.h1.c(tL_businessIntro.title, tL_businessIntro.description);
                            this.h1.setSticker(this.s8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.g1.setGravity(17);
                        this.g1.addView(this.h1, qoe.e(-2, -2, 17));
                        this.f1.addView(this.g1, qoe.e(-1, -2, 17));
                        Uc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.q2 = textView6;
                    textView6.setText(str);
                    this.q2.setTextSize(1, 14.0f);
                    this.q2.setGravity(17);
                    anb.X(this.q2, cmb.Yc, getResourceProvider());
                    this.q2.setBackground(new slb(this.q2, this.m1, gm.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.q2.setTypeface(gm.o());
                    this.q2.setPadding(gm.L(9.0f), gm.L(2.0f), gm.L(9.0f), gm.L(3.0f));
                    this.f1.addView(this.q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.n1 = new b92(getParentActivity(), this.m1, 0, this.Ba);
                int i6 = (this.h.admin_id > getUserConfig().e() ? 1 : (this.h.admin_id == getUserConfig().e() ? 0 : -1));
                b92 b92Var2 = this.n1;
                TLRPC.User user4 = this.f;
                if (i6 == 0) {
                    b92Var2.setStatusText(jb6.a0(null, null, 2131751070, m9c.k(user4, true)));
                } else {
                    b92Var2.setStatusText(jb6.a0(null, null, 2131751071, m9c.k(user4, true)));
                }
                this.f1.addView(this.n1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final float U6() {
        yv1 yv1Var = this.Aa;
        if (yv1Var != null) {
            this = yv1Var;
        }
        js1 js1Var = this.E1;
        if (js1Var == null) {
            return 0.0f;
        }
        return js1Var.b;
    }

    public final boolean U7() {
        if (!gda.D0 && !this.Fb) {
            return false;
        }
        return true;
    }

    public final void U8(java.lang.String r9, defpackage.k47 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.U8(java.lang.String, k47, boolean):void");
    }

    public final void U9(long j, long j2) {
        jva.v(this.currentAccount, false).z(j, j2, new xn1(this, j, j2, (byte) 0));
    }

    public final boolean Ua(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.x8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.x8 == this.l6) {
                this.x8 = 0L;
                this.a0.setFieldText(str);
                return true;
            }
            getMediaDataController().T1(this.x8, 0L, str, null, null, null, null, 0L, false, false, null);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                d dVar = (d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((dVar instanceof yv1) && ((yv1) dVar).l6 == this.x8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                boolean B = pg3.B(this.x8);
                long j = this.x8;
                if (B) {
                    bundle.putInt("enc_id", (int) (j & 4294967295L));
                } else {
                    boolean D = pg3.D(j);
                    long j2 = this.x8;
                    if (D) {
                        bundle.putLong("user_id", j2);
                    } else {
                        bundle.putLong("chat_id", -j2);
                    }
                }
                B4();
                presentFragment(new yv1(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Ub() {
        if (getParentActivity() == null) {
            return;
        }
        c41.b0(this).t(jb6.M0(2131743520, null), this.Ba).j();
    }

    public final void Uc() {
        boolean z;
        int i;
        int indexOf;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.s8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().p()) && this.s8.send_paid_messages_stars <= 0)) {
            z = true;
        } else {
            z = false;
        }
        if (this.g1 != null) {
            if (z && this.i1 == null) {
                vq1 vq1Var = new vq1(this, getResourceProvider(), getParentActivity());
                this.i1 = vq1Var;
                rve.b(vq1Var, 0.02f, 1.2f);
                this.i1.setOnClickListener(new tm1(this, (byte) 12));
            }
            vq1 vq1Var2 = this.i1;
            if (vq1Var2 != null) {
                if (!z) {
                    vq1Var2.setVisibility(8);
                    return;
                }
                vq1Var2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.s8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.s8.business_intro.title)) {
                    i = 2131749258;
                } else {
                    i = 2131749259;
                }
                String a0 = jb6.a0(null, null, i, m9c.k(this.f, true));
                int indexOf2 = a0.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                if (indexOf2 > 0 && (indexOf = (a0 = a0.substring(0, indexOf2).concat(a0.substring(indexOf2 + 2))).indexOf("**")) > 0) {
                    a0 = a0.substring(0, indexOf).concat(a0.substring(indexOf + 2));
                    spannableStringBuilder = new SpannableStringBuilder(a0);
                    vq8 vq8Var = new vq8(a0.substring(indexOf2, indexOf));
                    if (vq8Var.c != -1) {
                        vq8Var.c = -1;
                        vq8Var.invalidateSelf();
                    }
                    vq8Var.a(503316480);
                    vq8Var.setBounds(0, 0, vq8Var.getIntrinsicWidth(), gm.L(17.33f));
                    spannableStringBuilder.setSpan(new ImageSpan(vq8Var), indexOf2, indexOf, 33);
                }
                this.i1.setCustomText(spannableStringBuilder);
                this.i1.setOverrideTextMaxWidth(hg5.a(a0, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.i1.getParent() != null && (!z || this.i1.getParent() != this.g1)) {
                    ((ViewGroup) this.i1.getParent()).removeView(this.i1);
                }
                if (z) {
                    ViewParent parent = this.i1.getParent();
                    LinearLayout linearLayout = this.g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.i1, qoe.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void V(float f, int i) {
        if (i == 2 && f == 0.0f) {
            lf8 lf8Var = this.vd;
            if (lf8Var != null) {
                this.m1.removeView(lf8Var);
                this.vd = null;
            }
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.j1();
            }
        }
    }

    public final void V4(int i, View view, boolean z) {
        int i2;
        if (view != null) {
            float f = ((float[]) this.ud.b)[i];
            float f2 = (1.0f - this.pd.e) * (1.0f - this.nd.e) * f;
            view.setAlpha(f2);
            if (z) {
                if (f2 > 0.0f) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                if (view.getVisibility() != i2) {
                    view.setVisibility(i2);
                }
            }
        }
    }

    public final int V6(k47 k47Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        rc2 rc2Var = this.I9;
        if (rc2Var == null) {
            rc2 rc2Var2 = new rc2(getParentActivity(), this.currentAccount, true, this.Za, this.Ba);
            this.I9 = rc2Var2;
            rc2Var = rc2Var2;
        }
        if (this.e == null && !m9c.D(this.f)) {
            z2 = false;
        } else {
            z2 = true;
        }
        rc2Var.f6 = z2;
        rc2 rc2Var3 = this.I9;
        int i = this.g4;
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        rc2Var3.h6 = z3;
        if (i == 3 && this.mb) {
            z4 = true;
        } else {
            z4 = false;
        }
        rc2Var3.i6 = z4;
        TLRPC.User user = this.f;
        if (user != null && user.bot) {
            z5 = true;
        } else {
            z5 = false;
        }
        rc2Var3.j6 = z5;
        if (sd2.T(this.e) && this.e.megagroup) {
            z6 = true;
        }
        rc2Var3.k6 = z6;
        this.I9.W6 = S7();
        this.I9.X6 = f8();
        this.I9.Y6 = e8();
        return this.I9.q0(k47Var, (f47) this.P6.f(k47Var.c1()), z);
    }

    public final boolean V7() {
        if (!sd2.c0(this.e) || this.x4) {
            if (sd2.p0(this.e) && d() == 0 && !this.i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void V8(String str) {
        o.c(str, this.currentAccount, this.m1, null, this.Ba);
    }

    public final void V9(ArrayList arrayList) {
        mzb mzbVar;
        if (arrayList != null && (mzbVar = this.g2) != null && mzbVar.U) {
            for (int i = 0; i < arrayList.size(); i++) {
                k47 k47Var = (k47) arrayList.get(i);
                if (k47Var != null && k47Var.D == 36) {
                    TLRPC.MessageMedia n1 = k47.n1(k47Var.k);
                    ConcurrentHashMap concurrentHashMap = wxc.a;
                    if (n1 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!k47Var.U2) {
                            k47Var.U2 = true;
                            k47Var.n0(null);
                        }
                    }
                }
                if (k47Var != null && k47Var.P2() && !k47Var.O3() && k47Var.c1() != 0 && !k47Var.U2) {
                    k47Var.U2 = true;
                    k47Var.n0(null);
                }
            }
        }
    }

    public final void Va(int i, k47 k47Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = jb6.u(k47Var.k.date, false);
        tL_message.id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(k47Var.k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        k47 k47Var2 = new k47(this.currentAccount, tL_message, false, false);
        k47Var2.D = 10;
        k47Var2.U = 1;
        k47Var2.l0 = true;
        k47Var2.m1 = s7(k47Var.X);
        this.D0.Q.add(i, k47Var2);
    }

    public final void Vb(rc2 rc2Var) {
        if (getParentActivity() != null && rc2Var != null && rc2Var.L9 != null && rc2Var.getPrimaryMessageObject() != null && rc2Var.getPrimaryMessageObject().k != null && rc2Var.getPrimaryMessageObject().k.via_business_bot_id != 0 && !getMessagesController().X3.getBoolean("bizbothint", false)) {
            getMessagesController().X3.edit().putBoolean("bizbothint", true).apply();
            if (!this.Cb) {
                this.Cb = true;
                if (this.O1 != null) {
                    return;
                }
                hg5 hg5Var = new hg5(getParentActivity(), 3);
                hg5Var.p(true);
                hg5Var.L = Layout.Alignment.ALIGN_NORMAL;
                hg5Var.d = -1L;
                hg5Var.U = true;
                hg5Var.e = true;
                hg5Var.j(true);
                hg5Var.q(8.0f);
                this.O1 = hg5Var;
                hg5Var.t(gm.S2(jb6.M0(2131748355, null)));
                this.O1.k(this.L);
                hg5 hg5Var2 = this.O1;
                hg5Var2.h = hg5.a(hg5Var2.getText(), this.O1.getTextPaint());
                this.m1.addView(this.O1, qoe.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.m1.post(new uj1(this, rc2Var, (byte) 8));
            }
        }
    }

    public final void Vc() {
        boolean z;
        int i;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a0;
        if (this.h1 == null) {
            return;
        }
        String str = null;
        if (sd2.p0(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().t1(this.e.id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !sd2.A(this.currentAccount, chat2, 24)) {
                final long j = this.e.send_paid_messages_stars;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                long j2 = chat.id;
                if (i2 > 0) {
                    a0 = jb6.a0(null, null, 2131744034, pg3.s(-j2), jb6.E(j, ','));
                } else {
                    a0 = jb6.a0(null, null, 2131744017, pg3.s(-j2));
                }
                SpannableStringBuilder Q2 = gm.Q2(nxa.U0(a0, 1.0f, null));
                if (i2 > 0) {
                    str = jb6.M0(2131748229, null);
                }
                this.h1.b(true, true, Q2, str, new View.OnClickListener(this) {
                    public final yv1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r4;
                        long j3 = j;
                        yv1 yv1Var = this.b;
                        switch (b) {
                            case 0:
                                yv1Var.I9(j3);
                                return;
                            default:
                                yv1Var.J9(j3);
                                return;
                        }
                    }
                });
                return;
            }
            this.h1.b(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.s8;
            if (userFull != null) {
                if (userFull.contact_require_premium) {
                    ua2 ua2Var = this.h1;
                    boolean z2 = !getUserConfig().p();
                    if (getMessagesController().H3()) {
                        i = 2131748338;
                    } else {
                        i = 2131748339;
                    }
                    ua2Var.b(z2, false, gm.S2(jb6.a0(null, null, i, pg3.s(this.l6))), jb6.M0(2131748295, null), new x10((byte) 2));
                    return;
                }
                final long j3 = userFull.send_paid_messages_stars;
                int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i3 > 0) {
                    ua2 ua2Var2 = this.h1;
                    if (i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ua2Var2.b(z, false, gm.Q2(nxa.U0(jb6.a0(null, null, 2131748337, pg3.s(this.l6), jb6.E(this.s8.send_paid_messages_stars, ',')), 1.0f, null)), jb6.M0(2131748229, null), new View.OnClickListener(this) {
                        public final yv1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r4;
                            long j32 = j3;
                            yv1 yv1Var = this.b;
                            switch (b) {
                                case 0:
                                    yv1Var.I9(j32);
                                    return;
                                default:
                                    yv1Var.J9(j32);
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
            this.h1.b(false, false, null, null, null);
        } else {
            this.h1.b(false, false, null, null, null);
        }
    }

    public final boolean W4() {
        boolean z;
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            gm.t1(getParentActivity().getCurrentFocus());
            i46.n1(this, this.S1, this.T1, this.l6, false);
        }
        return z;
    }

    public final void W5() {
        if (this.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.g4;
        if (i == 3) {
            tL_message.message = jb6.M0(2131745628, null);
        } else if (i == 9) {
            tL_message.message = jb6.M0(2131742556, null);
        } else {
            tL_message.message = jb6.M0(2131752624, null);
        }
        tL_message.id = 0;
        k47 k47Var = new k47(this.currentAccount, tL_message, false, false);
        this.X3 = k47Var;
        k47Var.D = 10;
        k47Var.U = 1;
    }

    public final boolean W7() {
        return m9c.w(this.f);
    }

    public final void W8(String str) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", bw2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void W9() {
        this.R4 = true;
        if (this.E6) {
            cf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new n40(messagesStorage, d(), this.l6, new oo1(this, (byte) 1), (byte) 11));
            return;
        }
        cf7 messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().i1(this.l6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.x4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.D6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new pm(this, messagesStorage2, (byte) 16));
    }

    public final void Wa(Bundle bundle, k47 k47Var) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.e;
        if (chat != null && sd2.V(chat) && !sd2.p0(this.e)) {
            TLRPC.Chat chat2 = this.e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().L0(Long.valueOf(this.e.linked_monoforum_id)) != null && !sd2.z(this.currentAccount, 24, -this.e.linked_monoforum_id)) {
                oc7 messagesController = getMessagesController();
                TLRPC.Chat chat3 = this.e;
                long j = chat3.id;
                long j2 = chat3.linked_monoforum_id;
                ConcurrentHashMap concurrentHashMap = messagesController.f;
                concurrentHashMap.put(Long.valueOf(j), Long.valueOf(j2));
                concurrentHashMap.put(Long.valueOf(j2), Long.valueOf(j));
                bundle.putLong("reply_to_channel_direct", -this.e.linked_monoforum_id);
                return;
            }
        }
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            peer = message.from_id;
        } else {
            peer = null;
        }
        long n = pg3.n(peer);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i != 0 && n != a() && n != getUserConfig().e() && i > 0) {
            bundle.putLong("reply_to_author", n);
        }
    }

    public final void Wb(boolean z, boolean z2) {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        View view;
        int i3;
        if (this.J0 != null && Z7()) {
            TLRPC.Chat chat = this.e;
            if (!chat.in_news && sd2.r0(chat)) {
                i3 = cmb.Ii;
            } else {
                i3 = cmb.Ei;
            }
            this.K0 = i3;
            this.J0.setProgressColor(getThemedColor(i3));
        }
        Object tag = this.J0.getTag();
        if (z) {
            if (tag != null) {
                return;
            }
        } else if (tag == null) {
            return;
        }
        AnimatorSet animatorSet = this.W0;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W0 = null;
        }
        RadialProgressView radialProgressView = this.J0;
        if (z) {
            num = 1;
        }
        radialProgressView.setTag(num);
        int i4 = 0;
        float f8 = 0.1f;
        if (z2) {
            this.W0 = new AnimatorSet();
            if (z) {
                this.J0.setVisibility(0);
                AnimatorSet animatorSet2 = this.W0;
                rs1 rs1Var = this.E0;
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rs1Var, property, 0.1f);
                rs1 rs1Var2 = this.E0;
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rs1Var2, property2, 0.1f);
                rs1 rs1Var3 = this.E0;
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(rs1Var3, property3, 0.0f), ObjectAnimator.ofFloat(this.J0, property, 1.0f), ObjectAnimator.ofFloat(this.J0, property2, 1.0f), ObjectAnimator.ofFloat(this.J0, property3, 1.0f));
                this.W0.setStartDelay(200L);
            } else {
                if (this.F0) {
                    view = this.G0;
                } else {
                    view = this.E0;
                }
                view.setVisibility(0);
                AnimatorSet animatorSet3 = this.W0;
                RadialProgressView radialProgressView2 = this.J0;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                RadialProgressView radialProgressView3 = this.J0;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                RadialProgressView radialProgressView4 = this.J0;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(view, property4, 1.0f), ObjectAnimator.ofFloat(view, property5, 1.0f), ObjectAnimator.ofFloat(view, property6, 1.0f));
            }
            this.W0.addListener(new y7((byte) 14, this, z));
            this.W0.setDuration(150L);
            this.W0.start();
            return;
        }
        RadialProgressView radialProgressView5 = this.J0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        radialProgressView5.setVisibility(i);
        RadialProgressView radialProgressView6 = this.J0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.1f;
        }
        radialProgressView6.setScaleX(f);
        RadialProgressView radialProgressView7 = this.J0;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.1f;
        }
        radialProgressView7.setScaleY(f2);
        this.J0.setAlpha(1.0f);
        rs1 rs1Var4 = this.E0;
        if (!z && !this.F0) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        rs1Var4.setVisibility(i2);
        l66 l66Var = this.G0;
        if (z || !this.F0) {
            i4 = 4;
        }
        l66Var.setVisibility(i4);
        rs1 rs1Var5 = this.E0;
        if (!z && !this.F0) {
            f3 = 1.0f;
        } else {
            f3 = 0.1f;
        }
        rs1Var5.setScaleX(f3);
        l66 l66Var2 = this.G0;
        if (!z && this.F0) {
            f4 = 1.0f;
        } else {
            f4 = 0.1f;
        }
        l66Var2.setScaleX(f4);
        rs1 rs1Var6 = this.E0;
        if (!z && !this.F0) {
            f5 = 1.0f;
        } else {
            f5 = 0.1f;
        }
        rs1Var6.setScaleY(f5);
        l66 l66Var3 = this.G0;
        if (!z && this.F0) {
            f8 = 1.0f;
        }
        l66Var3.setScaleY(f8);
        rs1 rs1Var7 = this.E0;
        if (!z && !this.F0) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        rs1Var7.setAlpha(f6);
        l66 l66Var4 = this.G0;
        if (!z && this.F0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l66Var4.setAlpha(f7);
    }

    public final void Wc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Wc(boolean):void");
    }

    public final void X4() {
        rc2 rc2Var;
        xt1 xt1Var;
        int i;
        if (!this.Fc && this.U3 && this.A0.H && getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof rc2) {
                        rc2Var = (rc2) childAt;
                        if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().k != null && rc2Var.getMessageObject().k.video_processing_pending) {
                            if (rc2Var.getCurrentPosition() != null) {
                                if (rc2Var.getMessageObject() != null && (rc2Var.getCurrentPosition().l & 8) != 0) {
                                    int i2 = rc2Var.getCurrentPosition().l;
                                    if (rc2Var.getMessageObject().O3()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    if ((i2 & i) == 0) {
                                        continue;
                                    }
                                }
                            }
                            rc2Var.getLocationInWindow(iArr);
                            float timeY = rc2Var.getTimeY() + iArr[1];
                            if (timeY >= gm.L(240.0f) && timeY <= (gm.q.y - gm.L(25.0f)) - gm.n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    rc2Var = null;
                    break;
                }
            }
            if (rc2Var != null) {
                this.Fc = true;
                xt1 xt1Var2 = new xt1(this, getParentActivity());
                xt1Var2.p(true);
                xt1Var2.L = Layout.Alignment.ALIGN_CENTER;
                xt1Var2.d = 3500L;
                xt1Var2.U = true;
                xt1Var2.e = true;
                xt1Var2.h = gm.L(150.0f);
                xt1Var2.q(8.0f);
                this.Q1 = xt1Var2;
                xt1Var2.t(jb6.M0(2131743285, null));
                this.Q1.k(this.L);
                this.m1.addView(this.Q1, qoe.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                rc2Var.getLocationInWindow(iArr);
                this.R1 = rc2Var.getTimeY() + iArr[1];
                this.Q1.setTranslationY(((-xt1Var.getTop()) - gm.L(120.0f)) + this.R1);
                this.Q1.o(0.0f, (rc2Var.M9 / 2.0f) + (-gm.L(16.0f)) + iArr[0] + rc2Var.O9);
                this.Q1.v();
                return;
            }
            gm.r(new mz(this, (byte) 23));
            gm.d3(new mz(this, (byte) 23), 2000L);
        }
    }

    public final void X5() {
        if (this.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = jb6.M0(2131742557, null);
        tL_message.id = 0;
        k47 k47Var = new k47(this.currentAccount, tL_message, false, false);
        this.Y3 = k47Var;
        k47Var.D = 10;
        k47Var.U = 1;
    }

    public final l3a X6() {
        ?? obj = new Object();
        int i = this.g4;
        if (i == 9) {
            obj.b = this.Qa;
        }
        if (i == 5) {
            String str = this.f4;
            int e7 = e7();
            obj.c = str;
            obj.a = e7;
        }
        return new l3a(obj);
    }

    public final boolean X7() {
        if (this.g4 == 1) {
            return true;
        }
        return false;
    }

    public final void X8(TLRPC.ReactionCount reactionCount) {
        N5(true);
        xu9.c(getParentActivity(), this.currentAccount, reactionCount.reaction, this.Ba);
    }

    public final void X9(boolean z) {
        TLRPC.Chat chat;
        if (this.Ea == null && (chat = this.e) != null && sd2.k(chat) && this.a0 != null && !sd2.p0(this.e)) {
            TLRPC.TL_channels_sendAsPeers K1 = getMessagesController().K1(this.l6, false);
            this.Ea = K1;
            if (K1 != null) {
                this.a0.B2(false, z);
            }
        }
    }

    public final boolean Xa(View view, RectF rectF) {
        if (rectF != null && this.A0 != null && view != null) {
            RectF rectF2 = this.tc;
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public final void Xb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = jb6.M0(2131752666, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752667, null);
        alertDialog$Builder.j(jb6.M0(2131751343, null), new cf(runnable, (byte) 5));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, getResourceProvider());
        }
    }

    public final void Xc() {
        k47 k47Var;
        if (this.f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                vr1 vr1Var = this.A0;
                if (vr1Var != null) {
                    int childCount = vr1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.A0.getChildAt(i);
                        if (childAt instanceof rc2) {
                            k47Var = ((rc2) childAt).getMessageObject();
                        } else {
                            k47Var = null;
                        }
                        if (k47Var != null && k47Var.e1() < 0) {
                            long j = k47Var.k.random_id;
                            if (j != 0) {
                                arrayList.add(Long.valueOf(j));
                            }
                        }
                    }
                }
                MediaController.w();
                return;
            }
            k47 k47Var2 = SecretMediaViewer.d().g0;
            if (k47Var2 != null && !k47Var2.N3()) {
                MediaController.w();
                k47Var2.e1();
            }
        }
    }

    public final void Y4(boolean z) {
        if (this.f7 == 0) {
            if (z && !this.g7.isEmpty()) {
                this.f7 = System.currentTimeMillis();
            } else {
                this.f7 = 1L;
            }
            h8();
            vr1 vr1Var = this.A0;
            if (vr1Var != null) {
                vr1Var.invalidate();
            }
        }
    }

    public final boolean Y5(android.view.View r96, boolean r97, boolean r98, float r99, float r100, boolean r101, boolean r102, boolean r103) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Y5(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public boolean Y7() {
        if (this.m1.getKeyboardHeight() > gm.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Y8(rc2 rc2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i;
        bu5 J = bu5.J(this, rc2Var);
        vs9 vs9Var = new vs9(getParentActivity(), this.Ba);
        J.p = new hm1(vs9Var, (byte) 0);
        if (z && getMessagesController().l4.n0.f) {
            J.b(2131231279, jb6.M0(2131742680, null), new lm1(this, str, (byte) 9), false);
        }
        boolean z2 = true;
        J.b(2131232109, jb6.M0(2131742835, null), new nm1(this, vs9Var, str, (byte) 1), false);
        if (z) {
            J.b(2131232360, jb6.M0(2131742626, null), new lm1(this, str, (byte) 10), false);
            J.j();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i2 = this.currentAccount;
                long j = user.id;
                uj1 uj1Var = new uj1(this, userArr, (byte) 10);
                TLObject a2 = oc7.r1(i2).a2(j);
                boolean z3 = a2 instanceof TLRPC.User;
                if (!(a2 instanceof TLRPC.Chat) || !sd2.V((TLRPC.Chat) a2)) {
                    z2 = false;
                }
                if (z3) {
                    i = 2131743230;
                } else if (z2) {
                    i = 2131743244;
                } else {
                    i = 2131743237;
                }
                J.m(a2, jb6.M0(i, null), uj1Var);
            } else {
                J.o(13, -1, jb6.M0(2131742881, null));
            }
        }
        vs9Var.e(J);
        vs9Var.f(rc2Var, characterStyle, null, false);
        showDialog(vs9Var);
    }

    public final void Y9(k47 k47Var, boolean z, boolean z2) {
        if (k47Var != null && k47Var.q4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = k47Var.R0;
            tL_messages_clickSponsoredMessage.media = z;
            tL_messages_clickSponsoredMessage.fullscreen = z2;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Ya() {
        int i;
        this.V4.clear();
        this.X4.clear();
        this.Z4 = 0;
        this.d5 = 0;
        this.e5 = 0;
        gd(0, true);
        hs6 mediaDataController = getMediaDataController();
        long a = a();
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull == null) {
            i = 0;
        } else {
            i = chatFull.pinned_msg_id;
        }
        mediaDataController.S0(0, i, a);
        this.f5 = true;
        hd();
    }

    public final void Yb(int i) {
        int i2;
        if (getParentActivity() != null && this.e != null) {
            TextPaint textPaint = new TextPaint(1);
            hg9.o(textPaint, gm.L(15.0f));
            int i3 = 0;
            SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, i, TextUtils.ellipsize(this.e.title, textPaint, gm.L(120.0f), TextUtils.TruncateAt.END)));
            if (i == 2131752405) {
                i3 = 2131623980;
            } else if (i == 2131752212) {
                i3 = 2131623984;
            } else if (i == 2131752360) {
                i3 = 2131624054;
            } else if (i == 2131752282) {
                i3 = 2131624060;
            }
            if (i3 != 0) {
                c41 b0 = c41.b0(this);
                b0.getClass();
                jc8 jc8Var = new jc8(b0.X(), b0.c, null, S2);
                jc8Var.c.f(i3, 24, 24, null);
                u31 b = b0.b(jc8Var, 1780);
                b.l = true;
                y21 y21Var = b.e;
                y21Var.pillStyle = true;
                y21Var.b();
                b.a = 1313167187;
                b.j();
                return;
            }
            if (i == 2131752251) {
                i2 = 2131232460;
            } else if (i == 2131752468) {
                i2 = 2131232451;
            } else {
                i2 = 2131232452;
            }
            Drawable mutate = getParentActivity().getResources().getDrawable(i2).mutate();
            c41 b02 = c41.b0(this);
            b02.getClass();
            u31 b2 = b02.b(new jc8(b02.X(), b02.c, mutate, S2), 1780);
            b2.l = true;
            y21 y21Var2 = b2.e;
            y21Var2.pillStyle = true;
            y21Var2.b();
            b2.a = 1313167187;
            b2.j();
        }
    }

    public final void Yc(k47 k47Var, boolean z) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new np6(this, k47Var, z, (byte) 9));
    }

    public final void Z4(CharSequence charSequence) {
        boolean z;
        TLRPC.WebPage webPage;
        k47 k47Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        k47 k47Var2 = this.H5;
        if (k47Var2 != null && (message = k47Var2.k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z = true;
        } else {
            z = false;
        }
        if (this.x5 != null && k47Var2 != null) {
            int i = k47Var2.D;
            if ((i == 0 || i == 19) && (webPage = this.Y5) != null) {
                String str = webPage.url;
                if (str != null) {
                    try {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        try {
                            gm.c(valueOf, 1, false, true);
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                            if (o47.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
                if (z) {
                    this.Y5 = null;
                    ms1 ms1Var = this.a0;
                    if (ms1Var != null) {
                        ms1Var.N3 = null;
                        ms1Var.O3 = true;
                    }
                    o47 o47Var = this.x5;
                    if (o47Var != null) {
                        int i2 = this.currentAccount;
                        CharSequence fieldText = ms1Var.getFieldText();
                        k47 k47Var3 = this.F5;
                        if (k47Var3 == this.m4) {
                            k47Var = null;
                        } else {
                            k47Var = k47Var3;
                        }
                        o47Var.e(i2, null, fieldText, k47Var, this.D5, this.H5);
                    }
                    B6();
                    D6();
                }
            }
        }
    }

    public final int Z6(defpackage.k47 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.Z6(k47):int");
    }

    public final boolean Z7() {
        if (sd2.V(this.e) && !j8() && this.g4 == 0) {
            return true;
        }
        return false;
    }

    public final void Z8(Object[] objArr, x2b x2bVar, boolean z, TLRPC.StickerSet stickerSet) {
        int i;
        if (objArr.length > 2) {
            Object obj = objArr[2];
            if (obj instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) obj;
                if (objArr.length > 3) {
                    Object obj2 = objArr[3];
                    if (obj2 instanceof String) {
                        document.localThumbPath = (String) obj2;
                    }
                }
                c41 c41Var = new c41(x2bVar.c, this.resourceProvider);
                if (z) {
                    i = 2131744533;
                } else {
                    i = 2131744534;
                }
                u31 q = c41Var.q(document, jb6.a0(null, null, i, stickerSet.title));
                q.j = 2750;
                q.k(true);
            }
        }
    }

    public final br1 Z9(rc2 rc2Var, CharacterStyle characterStyle) {
        k11 k11Var = this.oc;
        if (k11Var != null) {
            k11Var.a(true);
            this.oc = null;
        }
        if (characterStyle != null && rc2Var != null && rc2Var.getMessageObject() != null) {
            br1 br1Var = new br1(this, rc2Var.getMessageObject().e1(), characterStyle, rc2Var, (byte) 0);
            this.oc = br1Var;
            return br1Var;
        }
        this.oc = null;
        return null;
    }

    public final void Za(k47 k47Var) {
        if (k47Var == this.Ac) {
            this.Ac = null;
            zd(true);
            return;
        }
        lc7 M1 = getMessagesController().M1(this.l6);
        if (M1 != null) {
            M1.a.remove(k47Var);
        }
    }

    public final void Zb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            boolean n0 = sd2.n0(chat);
            TLRPC.Chat chat2 = this.e;
            if (n0) {
                if (sd2.N(chat2)) {
                    ac5 ac5Var = new ac5(a());
                    ac5Var.m0 = this;
                    presentFragment(ac5Var);
                    return;
                }
                return;
            } else if (sd2.w(1, chat2)) {
                vi1 vi1Var = new vi1(a());
                vi1Var.m0 = this;
                presentFragment(vi1Var);
                return;
            } else {
                return;
            }
        }
        this.ya = new if2(this, this.Ba);
        this.A0.setOnInterceptTouchListener(new qn0((byte) 21));
        Hb(this.m1, false);
        showDialog(this.ya, new km1(this, (byte) 1));
    }

    public final void Zc(k47 k47Var, boolean z) {
        k47 k47Var2;
        if (this.D0 != null && this.fragmentView != null) {
            f47 f47Var = (f47) this.P6.f(k47Var.c1());
            if (f47Var != null) {
                ArrayList arrayList = f47Var.d;
                xr1 xr1Var = this.B0;
                if (xr1Var != null) {
                    xr1Var.U(f47Var);
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ((k47) arrayList.get(i)).M1 = true;
                    if (z) {
                        ((k47) arrayList.get(i)).H = true;
                    }
                }
                this.D0.J(true);
                return;
            }
            k47 k47Var3 = (k47) this.G6[0].get(k47Var.e1());
            if (z) {
                k47Var.M1 = true;
                k47Var.H = true;
            }
            if (this.D0.O) {
                vh6 vh6Var = this.Eb;
                if (vh6Var != null) {
                    k47Var2 = (k47) vh6Var.f(k47Var.e1());
                } else {
                    k47Var2 = null;
                }
                int indexOf = this.D0.Q.indexOf(k47Var2);
                if (k47Var2 != null && z) {
                    k47Var2.M1 = true;
                    k47Var2.H = true;
                }
                if (indexOf >= 0) {
                    hu1 hu1Var = this.D0;
                    hu1Var.g(hu1Var.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.M6.indexOf(k47Var3);
            if (indexOf2 >= 0) {
                hu1 hu1Var2 = this.D0;
                hu1Var2.g(hu1Var2.K + indexOf2);
            }
        }
    }

    public long a() {
        return this.l6;
    }

    public final void a5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.a5():void");
    }

    public final mc8 a6(View view, kj1 kj1Var) {
        km0 km0Var;
        lz4 lz4Var;
        am0 k;
        bka simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || getParentActivity() == null) {
            return null;
        }
        nz4 nz4Var = this.K;
        if (nz4Var != null) {
            nz4 nz4Var2 = this.J;
            if (nz4Var2 == null) {
                nz4Var2 = nz4Var;
            }
            lz4 lz4Var2 = new lz4(nz4Var2, nz4Var);
            km0Var = new km0(lz4Var2, lz4Var2, lz4Var2);
            km0Var.k = true;
            km0Var.j = S6();
            zgc zgcVar = this.l1;
            yv1 yv1Var = this.Aa;
            if (yv1Var == null) {
                yv1Var = this;
            }
            mu1 mu1Var = yv1Var.m1;
            km0Var.h = zgcVar;
            km0Var.i = mu1Var;
            km0Var.g = this.F;
            lz4Var = lz4Var2;
        } else {
            km0Var = this.M;
            lz4Var = null;
        }
        km0 km0Var2 = km0Var;
        if (km0Var2 == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getMenuGlassColorProvider() != null) {
            k = this.actionBar.getMenuGlassColorProvider();
        } else {
            k = qqd.k(this.Ba);
        }
        return new mc8(getParentActivity(), view, kj1Var, simpleMenuOverlay, km0Var2, lz4Var, k, this.x, this.Ba);
    }

    public final boolean a8() {
        if (this.e != null) {
            return getMessagesController().l2(this.e);
        }
        oc7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.s8;
        messagesController.getClass();
        return oc7.M2(userFull);
    }

    public final void a9(int i) {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var == null) {
            return;
        }
        d backgroundFragment = tk5Var.getBackgroundFragment();
        if (backgroundFragment instanceof yv1) {
            yv1 yv1Var = (yv1) backgroundFragment;
            if (yv1Var.a() == this.l6) {
                finishFragment();
                yv1Var.J(i, 0, 0, 0, true, true);
                return;
            }
        }
        presentFragment(fa(i, this.l6));
    }

    public final void aa(k47 k47Var) {
        if (k47Var != null && k47Var.q4() && !k47Var.u0) {
            k47Var.u0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = k47Var.R0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void ab(k47 k47Var) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(k47Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            hu1 hu1Var = this.D0;
            if (hu1Var != null && !hu1Var.O) {
                hu1Var.s(hu1Var.K + indexOf);
            }
        }
    }

    public final void ac(boolean r31, defpackage.k47 r32, defpackage.k47 r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, defpackage.nv1 r38, boolean r39, long r40, defpackage.v67 r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.ac(boolean, k47, k47, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, nv1, boolean, long, v67, boolean):void");
    }

    public final void ad() {
        m8 m8Var;
        int i;
        if (this.h != null) {
            return;
        }
        vr1 vr1Var = this.A0;
        es1 es1Var = this.X1;
        if ((es1Var != null && es1Var.J) || ((m8Var = this.g9) != null && m8Var.isShowing())) {
            i = 4;
        } else {
            i = 0;
        }
        vr1Var.setImportantForAccessibility(i);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.ng));
        hashSet.add(Integer.valueOf(cmb.J5));
        hashSet.add(Integer.valueOf(cmb.z5));
        hashSet.add(Integer.valueOf(cmb.p5));
        hashSet.add(Integer.valueOf(cmb.h5));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.W9));
        hashSet.add(Integer.valueOf(cmb.ca));
        hashSet.add(Integer.valueOf(cmb.na));
        hashSet.add(Integer.valueOf(cmb.ha));
        hashSet.add(Integer.valueOf(cmb.ma));
        hashSet.add(Integer.valueOf(cmb.la));
        hashSet.add(Integer.valueOf(cmb.ka));
        hashSet.add(Integer.valueOf(cmb.ja));
        hashSet.add(Integer.valueOf(cmb.ia));
        hashSet.add(Integer.valueOf(cmb.bd));
        hashSet.add(Integer.valueOf(cmb.fg));
        hashSet.add(Integer.valueOf(cmb.Zd));
        hashSet.add(Integer.valueOf(cmb.Yd));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.xf));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.tf));
        hashSet.add(Integer.valueOf(cmb.vf));
        hashSet.add(Integer.valueOf(cmb.uf));
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.jg));
        hashSet.add(Integer.valueOf(cmb.Nl));
        hashSet.add(Integer.valueOf(cmb.mf));
        hashSet.add(Integer.valueOf(cmb.Ue));
        hashSet.add(Integer.valueOf(cmb.s7));
        hashSet.add(Integer.valueOf(cmb.v7));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.yf));
        hashSet.add(Integer.valueOf(cmb.Rf));
        hashSet.add(Integer.valueOf(cmb.Zf));
        hashSet.add(Integer.valueOf(cmb.Re));
        hashSet.add(Integer.valueOf(cmb.Sf));
        hashSet.add(Integer.valueOf(cmb.Oe));
        hashSet.add(Integer.valueOf(cmb.Me));
        hashSet.add(Integer.valueOf(cmb.Ke));
        hashSet.add(Integer.valueOf(cmb.Je));
        hashSet.add(Integer.valueOf(cmb.u9));
        hashSet.add(Integer.valueOf(cmb.t9));
        hashSet.add(Integer.valueOf(cmb.p9));
        hashSet.add(Integer.valueOf(cmb.o9));
        hashSet.add(Integer.valueOf(cmb.n9));
        hashSet.add(Integer.valueOf(cmb.j9));
        hashSet.add(Integer.valueOf(cmb.l9));
        hashSet.add(Integer.valueOf(cmb.h9));
        hashSet.add(Integer.valueOf(cmb.i9));
        hashSet.add(Integer.valueOf(cmb.Z8));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.T8));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.Hb));
        hashSet.add(Integer.valueOf(cmb.nd));
        hashSet.add(Integer.valueOf(cmb.Nb));
        hashSet.add(Integer.valueOf(cmb.Ad));
        hashSet.add(Integer.valueOf(cmb.ga));
        hashSet.add(Integer.valueOf(cmb.fa));
        hashSet.add(Integer.valueOf(cmb.ea));
        hashSet.add(Integer.valueOf(cmb.da));
        hashSet.add(Integer.valueOf(cmb.Fc));
        hashSet.add(Integer.valueOf(cmb.gf));
        hashSet.add(Integer.valueOf(cmb.Hc));
        hashSet.add(Integer.valueOf(cmb.Gc));
        hashSet.add(Integer.valueOf(cmb.jf));
        hashSet.add(Integer.valueOf(cmb.hf));
        hashSet.add(Integer.valueOf(cmb.ld));
        hashSet.add(Integer.valueOf(cmb.Ze));
        hashSet.add(Integer.valueOf(cmb.kd));
        hashSet.add(Integer.valueOf(cmb.Ye));
        hashSet.add(Integer.valueOf(cmb.Gb));
        hashSet.add(Integer.valueOf(cmb.Ec));
        hashSet.add(Integer.valueOf(cmb.Fb));
        hashSet.add(Integer.valueOf(cmb.Dc));
        hashSet.add(Integer.valueOf(cmb.Kd));
        hashSet.add(Integer.valueOf(cmb.Qb));
        hashSet.add(Integer.valueOf(cmb.Be));
        hashSet.add(Integer.valueOf(cmb.Ae));
        hashSet.add(Integer.valueOf(cmb.Bc));
        hashSet.add(Integer.valueOf(cmb.ze));
        hashSet.add(Integer.valueOf(cmb.Ac));
        hashSet.add(Integer.valueOf(cmb.ye));
        hashSet.add(Integer.valueOf(cmb.zc));
        hashSet.add(Integer.valueOf(cmb.xe));
        hashSet.add(Integer.valueOf(cmb.yc));
        hashSet.add(Integer.valueOf(cmb.we));
        hashSet.add(Integer.valueOf(cmb.xc));
        hashSet.add(Integer.valueOf(cmb.ve));
        hashSet.add(Integer.valueOf(cmb.wc));
        hashSet.add(Integer.valueOf(cmb.ue));
        hashSet.add(Integer.valueOf(cmb.vc));
        hashSet.add(Integer.valueOf(cmb.te));
        hashSet.add(Integer.valueOf(cmb.uc));
        hashSet.add(Integer.valueOf(cmb.se));
        hashSet.add(Integer.valueOf(cmb.tc));
        hashSet.add(Integer.valueOf(cmb.re));
        hashSet.add(Integer.valueOf(cmb.sc));
        hashSet.add(Integer.valueOf(cmb.qe));
        hashSet.add(Integer.valueOf(cmb.rc));
        hashSet.add(Integer.valueOf(cmb.pe));
        hashSet.add(Integer.valueOf(cmb.qc));
        hashSet.add(Integer.valueOf(cmb.oe));
        hashSet.add(Integer.valueOf(cmb.pc));
        hashSet.add(Integer.valueOf(cmb.le));
        hashSet.add(Integer.valueOf(cmb.ne));
        hashSet.add(Integer.valueOf(cmb.me));
        hashSet.add(Integer.valueOf(cmb.ke));
        hashSet.add(Integer.valueOf(cmb.lc));
        hashSet.add(Integer.valueOf(cmb.je));
        hashSet.add(Integer.valueOf(cmb.kc));
        hashSet.add(Integer.valueOf(cmb.ie));
        hashSet.add(Integer.valueOf(cmb.jc));
        hashSet.add(Integer.valueOf(cmb.he));
        hashSet.add(Integer.valueOf(cmb.cc));
        hashSet.add(Integer.valueOf(cmb.bc));
        hashSet.add(Integer.valueOf(cmb.ge));
        hashSet.add(Integer.valueOf(cmb.fe));
        hashSet.add(Integer.valueOf(cmb.dc));
        hashSet.add(Integer.valueOf(cmb.fc));
        hashSet.add(Integer.valueOf(cmb.ec));
        hashSet.add(Integer.valueOf(cmb.ce));
        hashSet.add(Integer.valueOf(cmb.be));
        hashSet.add(Integer.valueOf(cmb.ee));
        hashSet.add(Integer.valueOf(cmb.ic));
        hashSet.add(Integer.valueOf(cmb.de));
        hashSet.add(Integer.valueOf(cmb.ae));
        hashSet.add(Integer.valueOf(cmb.hc));
        hashSet.add(Integer.valueOf(cmb.gc));
        hashSet.add(Integer.valueOf(cmb.Xd));
        hashSet.add(Integer.valueOf(cmb.Wd));
        hashSet.add(Integer.valueOf(cmb.Xb));
        hashSet.add(Integer.valueOf(cmb.Td));
        hashSet.add(Integer.valueOf(cmb.Wb));
        hashSet.add(Integer.valueOf(cmb.Sd));
        hashSet.add(Integer.valueOf(cmb.Rd));
        hashSet.add(Integer.valueOf(cmb.Vb));
        hashSet.add(Integer.valueOf(cmb.Qd));
        hashSet.add(Integer.valueOf(cmb.Ub));
        hashSet.add(Integer.valueOf(cmb.Pd));
        hashSet.add(Integer.valueOf(cmb.Tb));
        hashSet.add(Integer.valueOf(cmb.Od));
        hashSet.add(Integer.valueOf(cmb.Nd));
        hashSet.add(Integer.valueOf(cmb.Ld));
        hashSet.add(Integer.valueOf(cmb.Hd));
        hashSet.add(Integer.valueOf(cmb.Pb));
        hashSet.add(Integer.valueOf(cmb.Gd));
        hashSet.add(Integer.valueOf(cmb.Pc));
        hashSet.add(Integer.valueOf(cmb.Fd));
        hashSet.add(Integer.valueOf(cmb.Ob));
        hashSet.add(Integer.valueOf(cmb.Ed));
        hashSet.add(Integer.valueOf(cmb.md));
        hashSet.add(Integer.valueOf(cmb.Dd));
        hashSet.add(Integer.valueOf(cmb.Cd));
        hashSet.add(Integer.valueOf(cmb.Bd));
        hashSet.add(Integer.valueOf(cmb.zd));
        hashSet.add(Integer.valueOf(cmb.yd));
        hashSet.add(Integer.valueOf(cmb.xd));
        hashSet.add(Integer.valueOf(cmb.wd));
        hashSet.add(Integer.valueOf(cmb.vd));
        hashSet.add(Integer.valueOf(cmb.pa));
        hashSet.add(Integer.valueOf(cmb.q7));
        hashSet.add(Integer.valueOf(cmb.yb));
        hashSet.add(Integer.valueOf(cmb.ud));
        hashSet.add(Integer.valueOf(cmb.td));
        hashSet.add(Integer.valueOf(cmb.Lb));
        hashSet.add(Integer.valueOf(cmb.sd));
        hashSet.add(Integer.valueOf(cmb.rd));
        hashSet.add(Integer.valueOf(cmb.qd));
        hashSet.add(Integer.valueOf(cmb.Kb));
        hashSet.add(Integer.valueOf(cmb.Jb));
        hashSet.add(Integer.valueOf(cmb.pd));
        hashSet.add(Integer.valueOf(cmb.od));
        hashSet.add(Integer.valueOf(cmb.Ib));
        hashSet.add(Integer.valueOf(cmb.jd));
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Eb));
        hashSet.add(Integer.valueOf(cmb.Db));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.Xc));
        hashSet.add(Integer.valueOf(cmb.Vc));
        hashSet.add(Integer.valueOf(cmb.Uc));
        hashSet.add(Integer.valueOf(cmb.cd));
        hashSet.add(Integer.valueOf(cmb.ad));
        hashSet.add(Integer.valueOf(cmb.Zc));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.n8));
        hashSet.add(Integer.valueOf(cmb.m8));
        hashSet.add(Integer.valueOf(cmb.l8));
        hashSet.add(Integer.valueOf(cmb.k8));
        hashSet.add(Integer.valueOf(cmb.j8));
        hashSet.add(Integer.valueOf(cmb.i8));
        hashSet.add(Integer.valueOf(cmb.h8));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.fd));
        hashSet.add(Integer.valueOf(cmb.ed));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.oa));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.A8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    public void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        y5a d = y5a.d(messageMedia, this.l6, this.F5, this.m4, null, null, z, i2);
        d.K = X6();
        d.Q = j;
        d.R = k7();
        d.T = this.y5;
        getSendMessagesHelper().q0(d);
        if (this.g4 == 0) {
            da(false);
        }
        if (i == 0 || i == 1) {
            E4();
        }
        if (this.I5) {
            this.i6 = true;
        }
    }

    public final void b5(boolean z) {
        TLRPC.ChatFull chatFull;
        String str;
        qd2 qd2Var = this.o8;
        if (qd2Var != null && (((str = this.y8) != null || this.z8) && this.f6)) {
            sic.l(this.e, str, this.q8, Boolean.valueOf(!qd2Var.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y8 = null;
            this.z8 = false;
            return;
        }
        if (this.y8 != null && z && (chatFull = this.r8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            ts2.u(null, 2131748670, c41.b0(this), 2131624080, 36);
            this.y8 = null;
        }
        this.p8 = !this.f6;
    }

    public final void b6() {
        if (this.h == null && this.M2 == null && getParentActivity() != null) {
            lt1 lt1Var = new lt1(this, getParentActivity());
            this.M2 = lt1Var;
            lt1Var.setTag(1);
            this.b1.addView(this.M2, qoe.o(-1, 48));
            this.b1.i(1, this.M2);
            this.b1.h(this.M2);
            this.M2.setOnClickListener(new tm1(this, (byte) 17));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(cmb.L0(false));
            tc8 tc8Var = new tc8(getParentActivity(), this.Ba);
            this.O2 = tc8Var;
            this.M2.addView(tc8Var, qoe.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(cmb.Ve));
            this.U2.setTypeface(gm.o());
            this.M2.addView(this.U2, qoe.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i = 0; i < 2; i++) {
                xv1 xv1Var = new xv1(this, getParentActivity());
                xv1[] xv1VarArr = this.R2;
                xv1VarArr[i] = xv1Var;
                xv1Var.setTextSize(14);
                anb.W(xv1VarArr[i], cmb.Ve, getResourceProvider());
                xv1VarArr[i].setTypeface(gm.o());
                this.M2.addView(xv1VarArr[i], qoe.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                mt1 mt1Var = new mt1((byte) 0, getParentActivity(), this);
                lka[] lkaVarArr = this.S2;
                lkaVarArr[i] = mt1Var;
                mt1Var.setTextSize(14);
                anb.W(lkaVarArr[i], cmb.We, getResourceProvider());
                this.M2.addView(lkaVarArr[i], qoe.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                mv1 mv1Var = new mv1(this, getParentActivity());
                mv1[] mv1VarArr = this.T2;
                mv1VarArr[i] = mv1Var;
                this.M2.addView(mv1Var, qoe.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                nt1 nt1Var = new nt1(getParentActivity());
                nt1Var.J = new rna();
                nt1Var.I = new Path();
                nt1Var.K = new float[8];
                bf0[] bf0VarArr = this.Q2;
                bf0VarArr[i] = nt1Var;
                nt1Var.setBlurAllowed(true);
                bf0VarArr[i].setRoundRadius(gm.L(2.0f));
                this.M2.addView(bf0VarArr[i], qoe.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i == 1) {
                    xv1VarArr[i].setVisibility(4);
                    mv1VarArr[i].setVisibility(4);
                    lkaVarArr[i].setVisibility(4);
                    bf0VarArr[i].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.a3 = imageView;
            imageView.setImageResource(2131232303);
            ImageView imageView2 = this.a3;
            int i2 = cmb.Te;
            ylb resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView2, i2, resourceProvider, mode);
            ImageView imageView3 = this.a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.a3.setContentDescription(jb6.M0(2131754722, null));
            this.a3.setVisibility(4);
            this.a3.setAlpha(0.0f);
            this.a3.setScaleX(0.4f);
            this.a3.setScaleY(0.4f);
            ImageView imageView4 = this.a3;
            int i3 = cmb.w7;
            anb.R(imageView4, cmb.f0(getThemedColor(i3) & 436207615, 1, -1), null, anb.g(i3, 25), getResourceProvider());
            this.M2.addView(this.a3, qoe.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.a3.setOnClickListener(new tm1(this, (byte) 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231988);
            anb.s(this.Y2, i2, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(jb6.M0(2131751978, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.Ba);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(gm.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(cmb.Ue));
            this.M2.addView(this.Z2, qoe.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            anb.R(this.Y2, cmb.f0(getThemedColor(i3) & 436207615, 1, gm.L(14.0f)), null, anb.g(i3, 25), getResourceProvider());
            this.M2.addView(this.Y2, qoe.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new tm1(this, (byte) 19));
            fd(false);
        }
    }

    public final int b7() {
        tk5 tk5Var = this.parentLayout;
        int i = 0;
        if (tk5Var == null || tk5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i < this.parentLayout.getFragmentStack().size()) {
                d dVar = (d) this.parentLayout.getFragmentStack().get(i);
                if (dVar != this && (dVar instanceof yv1) && ((yv1) dVar).l6 == this.l6) {
                    break;
                }
                i++;
            } else {
                i = indexOf;
                break;
            }
        }
        return i - indexOf;
    }

    public final boolean b8() {
        int i = this.g4;
        if (i != 5 && i != 9) {
            return false;
        }
        return true;
    }

    public final void b9(int i) {
        if (this.fragmentView != null) {
            hg0 L6 = L6(i, false);
            if (L6 instanceof rc2) {
                rc2 rc2Var = (rc2) L6;
                l39 l39Var = rc2Var.O;
                TLRPC.MessagePeerReaction K1 = rc2Var.getMessageObject().K1();
                if (K1 != null && (l39Var.H || K1.big)) {
                    g39.d(this, null, L6, null, 0.0f, 0.0f, k39.d(K1.reaction), this.currentAccount, !K1.big ? 1 : 0);
                    g39.f();
                }
                l39Var.H = false;
                k47 k47Var = rc2Var.Q5;
                if (k47Var != null) {
                    k47Var.g5();
                }
            } else if (L6 instanceof cm1) {
                cm1 cm1Var = (cm1) L6;
                l39 l39Var2 = cm1Var.F0;
                TLRPC.MessagePeerReaction K12 = cm1Var.getMessageObject().K1();
                if (K12 != null && (l39Var2.H || K12.big)) {
                    g39.d(this, null, L6, null, 0.0f, 0.0f, k39.d(K12.reaction), this.currentAccount, !K12.big ? 1 : 0);
                    g39.f();
                }
                l39Var2.H = false;
                k47 k47Var2 = cm1Var.Q0;
                if (k47Var2 != null) {
                    k47Var2.g5();
                }
            }
        }
    }

    public final boolean ba() {
        k47 k47Var;
        kn knVar;
        k47 k47Var2;
        ImageReceiver photoImage;
        kn m;
        boolean z;
        rc2 rc2Var;
        boolean z2;
        if (this.A0 != null && ((k47Var = MediaController.w().v0) == null || k47.K4(k47Var.k))) {
            hg5 hg5Var = this.I2;
            ArrayList arrayList = null;
            if (hg5Var != null && hg5Var.W && (rc2Var = this.Tb) != null) {
                ImageReceiver photoImage2 = rc2Var.getPhotoImage();
                knVar = photoImage2.m();
                if (knVar != null) {
                    k47Var2 = rc2Var.getMessageObject();
                    if (photoImage2.x() + rc2Var.getTop() > this.A0.getMeasuredHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.N8 = z2;
                } else {
                    k47Var2 = null;
                }
            } else {
                knVar = null;
                k47Var2 = null;
            }
            if (k47Var2 == null) {
                int childCount = this.A0.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i);
                    if (childAt instanceof rc2) {
                        rc2 rc2Var2 = (rc2) childAt;
                        k47 messageObject = rc2Var2.getMessageObject();
                        boolean g4 = messageObject.g4();
                        if (!messageObject.f4() && !messageObject.R4() && ((k47.K4(messageObject.k) || g4) && messageObject.r0 == null && (m = (photoImage = rc2Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.M0;
                            float f = photoImage.O0 + top;
                            if (f >= 0.0f && top <= this.A0.getMeasuredHeight()) {
                                if (k47Var2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f <= this.A0.getMeasuredHeight()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.N8 = z;
                                if (top >= 0.0f && f <= this.A0.getMeasuredHeight()) {
                                    k47Var2 = messageObject;
                                    knVar = m;
                                    break;
                                }
                                k47Var2 = messageObject;
                                knVar = m;
                            }
                        }
                    }
                    i++;
                }
            }
            if (k47Var2 != null && !MediaController.w().D(k47Var2)) {
                H7(true);
                if (k47Var2.g4()) {
                    boolean R = MediaController.w().R(k47Var2);
                    MediaController w = MediaController.w();
                    if (R) {
                        arrayList = j6(k47Var2, false);
                    }
                    w.q0(arrayList, false);
                    return R;
                }
                gda.C(true);
                k47Var2.b0 = knVar.n();
                k47Var2.d0 = knVar.o();
                knVar.stop();
                if (PhotoViewer.O0(k47Var2)) {
                    PhotoViewer.k9.L();
                }
                return MediaController.w().R(k47Var2);
            }
        }
        return false;
    }

    public final void bb(k47 k47Var) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(k47Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            hu1 hu1Var = this.D0;
            if (hu1Var != null && !hu1Var.O) {
                hu1Var.K(hu1Var.K + indexOf, true);
            }
        }
    }

    public final void bc(boolean z, TLRPC.WebPage webPage, boolean z2, boolean z3) {
        ac(z, null, null, null, webPage, true, 0, null, z2, 0L, null, z3);
    }

    public final void bd(ArrayList arrayList, boolean z) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.D0.M((k47) arrayList.get(i), false, z);
        }
    }

    public final void c5() {
        TLRPC.ChatFull M0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        if (this.N1 == null && sd2.n0(this.e) && (M0 = getMessagesController().M0(this.e.id)) != null && this.a0 != null && getParentActivity() != null && (stickerSet = M0.emojiset) != null) {
            qs1 qs1Var = this.d1;
            if (qs1Var == null || qs1Var.getVisibility() != 0) {
                jg5 jg5Var = jg5.n;
                if (jg5Var.c()) {
                    long j = stickerSet.thumb_document_id;
                    if (j == 0 && (a0 = getMediaDataController().a0(stickerSet)) != null && !a0.documents.isEmpty()) {
                        j = a0.documents.get(0).id;
                    }
                    if (j != 0 && getParentActivity() != null) {
                        jg5Var.b();
                        hg5 hg5Var = new hg5(getParentActivity(), 3);
                        this.N1 = hg5Var;
                        hg5Var.j(true);
                        this.N1.p(true);
                        hg5 hg5Var2 = this.N1;
                        hg5Var2.L = Layout.Alignment.ALIGN_CENTER;
                        hg5Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new gn(j, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new z5c(gm.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.t(gm.G2(jb6.M0(2131749199, null), spannableStringBuilder, "%s"));
                        hg5 hg5Var3 = this.N1;
                        hg5Var3.h = hg5.a(hg5Var3.getText(), this.N1.getTextPaint());
                        hg5 hg5Var4 = this.N1;
                        hg5Var4.d = -1L;
                        hg5Var4.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
                        this.N1.k(this.L);
                        gm.d3(new mz(this, (byte) 4), 300L);
                    }
                }
            }
        }
    }

    public final void c6() {
        int i;
        int i2;
        if (this.g3 == null && getParentActivity() != null) {
            ps1 ps1Var = new ps1(this, getParentActivity(), (byte) 1);
            this.g3 = ps1Var;
            ps1Var.setClickable(false);
            this.g3.setWillNotDraw(false);
            this.ud.s(4, false, false);
            this.g3.setClipToPadding(false);
            io ioVar = new io(getParentActivity(), true, true, true);
            this.j3 = ioVar;
            d53 d53Var = d53.h;
            ioVar.b(0.25f, 280L, d53Var);
            this.j3.setTextSize(gm.L(15.0f));
            this.j3.setTypeface(gm.o());
            anb.U(this.j3, cmb.pf, getResourceProvider());
            this.j3.setGravity(3);
            this.g3.addView(this.j3, qoe.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.g3, qoe.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            io ioVar2 = new io(getParentActivity(), true, false, true);
            this.k3 = ioVar2;
            ioVar2.b(0.0f, 420L, d53Var);
            this.k3.setScaleProperty(0.7f);
            this.k3.setTextSize(gm.L(15.0f));
            this.k3.setGravity(5);
            this.k3.setTypeface(gm.o());
            anb.U(this.k3, cmb.n6, getResourceProvider());
            io ioVar3 = this.k3;
            if (this.rd.f) {
                i = 2131745552;
            } else {
                i = 2131745551;
            }
            ioVar3.setText(jb6.M0(i, null));
            io ioVar4 = this.k3;
            ioVar4.n = false;
            ioVar4.setPadding(gm.L(15.33f), 0, gm.L(15.33f), 0);
            this.k3.setOnClickListener(new tm1(this, (byte) 2));
            this.k3.setAlpha(0.5f);
            this.k3.setClickable(false);
            this.g3.addView(this.k3, qoe.e(-2, -1, 117));
            io ioVar5 = new io(getParentActivity(), true, true, true);
            this.l3 = ioVar5;
            ioVar5.setGravity(17);
            this.l3.setTypeface(gm.o());
            anb.U(this.l3, cmb.rf, getResourceProvider());
            this.l3.setTextSize(gm.L(15.0f));
            io ioVar6 = this.l3;
            int i3 = cmb.c6;
            int themedColor = getThemedColor(i3);
            int themedColor2 = getThemedColor(i3);
            int i4 = cmb.h6;
            anb.R(ioVar6, cmb.g0(themedColor, cmb.v(themedColor2, getThemedColor(i4))), anb.M(i3), anb.p(i3, i4), getResourceProvider());
            io ioVar7 = this.l3;
            if (this.D0.O) {
                i2 = 2131745617;
            } else {
                i2 = 2131745600;
            }
            ioVar7.setText(jb6.M0(i2, null));
            this.l3.setOnClickListener(new tm1(this, (byte) 3));
            this.l3.setVisibility(8);
            this.l3.setAlpha(0.0f);
            this.g3.addView(this.l3, qoe.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!sd2.T(chat) || this.e.megagroup) && this.g4 != 7 && !sd2.p0(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.i3.setImageResource(2131232423);
                anb.s(this.i3, cmb.of, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.i3;
                int i5 = cmb.y8;
                anb.R(imageView2, cmb.f0(getThemedColor(i5), 1, -1), null, anb.M(i5), getResourceProvider());
                this.g3.addView(this.i3, qoe.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.i3.setOnClickListener(new tm1(this, (byte) 4));
                this.i3.setContentDescription(jb6.M0(2131754779, null));
            }
            if (this.g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.h3.setImageResource(2131232082);
                anb.s(this.h3, cmb.of, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.h3;
                int i6 = cmb.y8;
                anb.R(imageView4, cmb.f0(getThemedColor(i6), 1, -1), null, anb.M(i6), getResourceProvider());
                this.g3.addView(this.h3, qoe.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.h3.setOnClickListener(new tm1(this, (byte) 5));
                this.h3.setContentDescription(jb6.M0(2131748822, null));
            }
        }
    }

    public final int c7() {
        return Math.max(this.d5, this.e5);
    }

    public final boolean c8() {
        return !TextUtils.isEmpty(this.j4);
    }

    public final void c9(long j, boolean z, boolean z2) {
        if (!gm.C1(getParentActivity())) {
            return;
        }
        xhb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, z, z2, getResourceProvider());
    }

    public final void ca(k47 k47Var) {
        d dVar;
        yv1 yv1Var;
        tk5 tk5Var = this.parentLayout;
        if (tk5Var == null) {
            return;
        }
        long j = k47Var.k.action.channel_id;
        if (tk5Var.getFragmentStack().size() > 0) {
            dVar = (d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            dVar = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        tk5 tk5Var2 = this.parentLayout;
        if (indexOf > 0 && !(dVar instanceof yv1) && !(dVar instanceof ProfileActivity) && this.e.creator) {
            int size = tk5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                d dVar2 = (d) tk5Var2.getFragmentStack().get(indexOf);
                if (dVar2 instanceof yv1) {
                    ((ActionBarLayout) tk5Var2).b(indexOf, new yv1(kt6.k(j, "chat_id")));
                    dVar2.removeSelfFromStack();
                } else if (dVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) tk5Var2).b(indexOf, new ProfileActivity(kt6.k(j, "chat_id"), null));
                    dVar2.removeSelfFromStack();
                } else if (dVar2 instanceof ba2) {
                    ((ActionBarLayout) tk5Var2).b(indexOf, new ba2(kt6.k(j, "chat_id")));
                    dVar2.removeSelfFromStack();
                } else if (dVar2 instanceof wg2) {
                    if (((wg2) dVar2).e1 == 0) {
                        Bundle arguments = dVar2.getArguments();
                        arguments.putLong("chat_id", j);
                        ((ActionBarLayout) tk5Var2).b(indexOf, new wg2(arguments));
                    }
                    dVar2.removeSelfFromStack();
                }
                indexOf++;
            }
            yv1Var = this;
        } else {
            yv1Var = this;
            gm.c3(new l97(yv1Var, dVar, k47Var, tk5Var2, (byte) 27));
        }
        gm.d3(new xo0(yv1Var, j, (byte) 2), 1000L);
    }

    @Override
    public final boolean canBeginSlide() {
        oyb oybVar;
        xz8 xz8Var;
        px1 px1Var;
        if ((this.g4 != 5 || (!this.M6.isEmpty() && this.s4 != 0)) && (((oybVar = this.n0) == null || (oybVar.y <= 0.0f && !oybVar.c0)) && !this.y9 && !this.rd.f && this.K9)) {
            ms1 ms1Var = this.a0;
            if (!ms1Var.v3 && ((!ms1Var.d1 || (px1Var = ms1Var.f1) == null || px1Var.getVisibility() != 0) && ((!ms1Var.G0() || !ms1Var.m0.w) && !d.hasSheets(ms1Var.F3) && this.ka == 0.0f && ((xz8Var = this.ua) == null || !xz8Var.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb() {
        if (this.h8 == null && this.i8 == null && this.j8 == null) {
            mz mzVar = this.m8;
            if (mzVar != null) {
                gm.r(mzVar);
                this.m8 = null;
            }
            this.d8 = Integer.MAX_VALUE;
            this.f8 = false;
            this.g8 = 0L;
            this.h8 = null;
            this.i8 = null;
            this.j8 = null;
        }
    }

    public final void cc(ArrayList arrayList) {
        ac(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void cd() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.cd():void");
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i;
        if (!this.x4 && (i = this.g4) != 3 && i != 5 && i != 8) {
            return 0L;
        }
        return this.s4;
    }

    public final void d5() {
        ArrayList arrayList;
        int i;
        if (this.nb) {
            int i2 = -1;
            int i3 = 0;
            long j = 0;
            while (true) {
                arrayList = this.M6;
                if (i3 >= arrayList.size()) {
                    break;
                }
                long d1 = ((k47) arrayList.get(i3)).d1();
                if (j != d1) {
                    if (i2 >= 0 && j != 0 && (i = i3 - i2) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < i; i4++) {
                            arrayList2.add((k47) arrayList.remove(i2));
                        }
                        Collections.sort(arrayList2, new sa((byte) 22));
                        arrayList.addAll(i2, arrayList2);
                    }
                    i2 = i3;
                    j = d1;
                }
                i3++;
            }
            if (i2 >= 0 && j != 0 && arrayList.size() - i2 > 1) {
                int size = arrayList.size() - i2;
                ArrayList arrayList3 = new ArrayList();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList3.add((k47) arrayList.remove(i2));
                }
                arrayList.addAll(i2, arrayList3);
            }
        }
    }

    public final void d6() {
        if (this.s2 == null && this.I1 == null) {
            tk4 tk4Var = new tk4(getParentActivity(), this.Ba);
            this.r2 = tk4Var;
            tk4Var.setViewType(7);
            a1b a1bVar = new a1b(getParentActivity(), this.r2, 1, null);
            this.s2 = a1bVar;
            a1bVar.setClickable(true);
            this.s2.d.setText(jb6.M0(2131747901, null));
            this.s2.setVisibility(8);
            this.s2.addView(this.r2, 0);
            this.s2.e(true, false);
            this.Z3.addView(this.s2, new FrameLayout.LayoutParams(-1, -1, 17));
            Activity parentActivity = getParentActivity();
            te5 te5Var = new te5(this.currentAccount, this.resourceProvider, parentActivity);
            this.I1 = te5Var;
            te5Var.setOnHashtagClickListener(new qm1(this, (byte) 3));
            this.I1.setOnScrollListener(new y(this, (byte) 16));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            E5();
            C5();
        }
    }

    public final defpackage.qb8 d7(defpackage.k47 r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.d7(k47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):qb8");
    }

    public final boolean d8() {
        int i = this.g4;
        if (((i == 0 && this.s4 == 0) || i == 3) && this.l6 == getUserConfig().e() && !c8()) {
            return true;
        }
        return false;
    }

    public final void d9() {
        U5(false);
        boolean z = this.fragmentBeginToShow;
        vr1 vr1Var = this.A0;
        if (!z) {
            vr1Var.X1 = false;
            vr1Var.Y1 = false;
            vr1Var.setEmptyView(this.f1);
            vr1 vr1Var2 = this.A0;
            vr1Var2.X1 = true;
            vr1Var2.Y1 = true;
            return;
        }
        vr1Var.setEmptyView(this.f1);
    }

    public final void da(boolean z) {
        int i;
        if (this.A0 != null) {
            ArrayList arrayList = this.M6;
            if (!arrayList.isEmpty() && !this.Ta.n) {
                if (z) {
                    i = 0;
                    while (i < arrayList.size() && ((k47) arrayList.get(i)).q4()) {
                        i++;
                    }
                } else {
                    i = 0;
                }
                this.C0.g1(i, 0);
                this.A0.D0();
            }
        }
    }

    public final void db(boolean z) {
        k47 k47Var = this.b8;
        if (k47Var != null) {
            if (z) {
                boolean[] zArr = this.W6;
                zArr[1] = true;
                zArr[0] = true;
                this.Z7 = 0;
                this.c7 = 0;
            }
            this.V7 = 0;
            this.W7 = false;
            ab(k47Var);
            this.b8 = null;
        }
    }

    public final void dc(k47 k47Var) {
        ac(true, k47Var, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void dd() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.y1 == null) {
            return;
        }
        boolean z4 = false;
        if (this.D9 && !B7() && !this.a0.U0() && !this.mb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.h6 != 0 && SystemClock.elapsedRealtime() >= this.h6 + 150) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.z1 = false;
        } else {
            this.T7 = 0;
            this.B6 = 0;
            z2 = true;
        }
        ms1 ms1Var = this.a0;
        if (ms1Var != null && ms1Var.a()) {
            z3 = true;
        } else {
            z3 = false;
        }
        q02 q02Var = this.y1;
        if (z && !z3) {
            z4 = true;
        }
        q02Var.e(1, z4, z2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, final Object... objArr) {
        long j;
        k47 k47Var;
        TLRPC.MessageReplies messageReplies;
        k47 k47Var2;
        tk5 tk5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull X1;
        TLRPC.User W1;
        boolean z;
        TLRPC.User W12;
        pr1 pr1Var;
        ms1 ms1Var;
        TLRPC.Chat chat;
        qu3 editField;
        boolean z2;
        boolean z3;
        x2b x2bVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i3;
        ms1 ms1Var2;
        final yv1 yv1Var = this;
        if (i == nm7.C) {
            yv1Var.u6(objArr);
            return;
        }
        if (i == nm7.n4) {
            vr1 vr1Var = yv1Var.A0;
            if (vr1Var != null) {
                vr1Var.h1();
            }
            h22 h22Var = yv1Var.ja;
            if (h22Var != null) {
                h22Var.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z4 = false;
            r2 = false;
            boolean z5 = false;
            int i4 = 0;
            if (i == nm7.H) {
                if (((Integer) objArr[0]).intValue() == yv1Var.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        yv1Var.finishFragment();
                        h5.b(yv1Var.currentAccount);
                    }
                }
            } else if (i == nm7.u3) {
                if (objArr.length > 0) {
                    z2 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z2 = false;
                }
                e51 e51Var = yv1Var.Y1;
                if (e51Var != null && e51Var.isShowing()) {
                    yv1Var.Y1.a(true);
                }
                if (z2 && (ms1Var2 = yv1Var.a0) != null && ms1Var2.R0()) {
                    yv1Var.a0.J0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        if (objArr.length > 4) {
                            z3 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z3 = false;
                        }
                        Dialog dialog = yv1Var.visibleDialog;
                        if ((dialog instanceof x2b) && (tL_messages_stickerSet = (x2bVar = (x2b) dialog).M1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.id == stickerSet2.id) {
                            x2bVar.M1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (x2bVar.n1 != null) {
                                x2bVar.V0();
                                x2bVar.T0();
                                x2bVar.n1.f();
                            }
                            x2bVar.S0();
                            hs6.d0(x2bVar.a).r1(x2bVar.M1);
                            x2bVar.D0();
                            if (objArr.length > 2) {
                                Object obj3 = objArr[2];
                                if (obj3 instanceof TLRPC.Document) {
                                    TLRPC.Document document = (TLRPC.Document) obj3;
                                    if (objArr.length > 3) {
                                        Object obj4 = objArr[3];
                                        if (obj4 instanceof String) {
                                            document.localThumbPath = (String) obj4;
                                        }
                                    }
                                    c41 c41Var = new c41(x2bVar.c, yv1Var.resourceProvider);
                                    if (z3) {
                                        i3 = 2131744533;
                                    } else {
                                        i3 = 2131744534;
                                    }
                                    u31 q = c41Var.q(document, jb6.a0(null, null, i3, stickerSet2.title));
                                    q.j = 2750;
                                    q.k(true);
                                }
                            }
                        } else {
                            final x2b x2bVar2 = new x2b(yv1Var.getParentActivity(), yv1Var, tL_inputStickerSetID, null, yv1Var.a0, yv1Var.Ba);
                            final boolean z6 = z3;
                            yv1Var = this;
                            x2bVar2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    yv1.this.Z8(objArr, x2bVar2, z6, stickerSet2);
                                }
                            });
                            yv1Var.showDialog(x2bVar2);
                        }
                    }
                }
            } else if (i == nm7.m4) {
                vr1 vr1Var2 = yv1Var.A0;
                if (vr1Var2 != null) {
                    vr1Var2.h1();
                }
                TextView textView = yv1Var.f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i5 = 0; i5 < 2; i5++) {
                    lka lkaVar = yv1Var.S2[i5];
                    if (lkaVar != null) {
                        lkaVar.invalidate();
                    }
                }
                es1 es1Var = yv1Var.X1;
                if (es1Var != null) {
                    es1Var.getListView().h1();
                }
                fv fvVar = yv1Var.a4;
                if (fvVar != null) {
                    fvVar.h1();
                }
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                ms1 ms1Var3 = yv1Var.a0;
                if (ms1Var3 != null && (editField = ms1Var3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                mv1[] mv1VarArr = yv1Var.T2;
                mv1 mv1Var = mv1VarArr[0];
                if (mv1Var != null) {
                    mv1Var.invalidate();
                }
                mv1 mv1Var2 = mv1VarArr[1];
                if (mv1Var2 != null) {
                    mv1Var2.invalidate();
                }
            } else if (i == nm7.T1) {
                ConnectionsManager.getInstance(i2).getConnectionState();
            } else if (i == nm7.g1) {
                Long l = (Long) objArr[0];
                if (yv1Var.r8 != null && (chat = yv1Var.e) != null && chat.id == l.longValue()) {
                    yv1Var.r8.online_count = ((Integer) objArr[1]).intValue();
                    pr1 pr1Var2 = yv1Var.p1;
                    if (pr1Var2 != null) {
                        pr1Var2.m();
                        yv1Var.p1.n(false);
                    }
                }
            } else if (i == nm7.F) {
                if (((Long) objArr[0]).longValue() == yv1Var.l6 && (ms1Var = yv1Var.a0) != null) {
                    ms1Var.B2(false, true);
                }
            } else if (i == nm7.k3) {
                ms1 ms1Var4 = yv1Var.a0;
                if (ms1Var4 != null) {
                    ms1Var4.C2();
                }
            } else if (i == 2) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i6 = oc7.s5;
                int i7 = intValue & 1;
                if (i7 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (yv1Var.e != null) {
                        TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(yv1Var.e.id));
                        if (L0 != null) {
                            yv1Var.e = L0;
                        }
                    } else if (yv1Var.f != null && (W1 = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.f.id))) != null) {
                        yv1Var.f = W1;
                    }
                    yv1Var.wd(true);
                }
                if (!yv1Var.j8() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (yv1Var.e != null && (pr1Var = yv1Var.p1) != null) {
                        pr1Var.m();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i7 != 0) {
                    yv1Var.r();
                    yv1Var.Gd(false);
                }
                if ((intValue & 64) != 0) {
                    z = true;
                }
                if ((intValue & 8192) != 0 && yv1Var.e != null) {
                    yv1Var.a8();
                    TLRPC.Chat L02 = yv1Var.getMessagesController().L0(Long.valueOf(yv1Var.e.id));
                    if (L02 != null) {
                        yv1Var.e = L02;
                        yv1Var.a8();
                        z = !yv1Var.j8();
                        yv1Var.Pc(false);
                        ms1 ms1Var5 = yv1Var.a0;
                        if (ms1Var5 != null) {
                            ms1Var5.F1(yv1Var.currentAccount, yv1Var.l6);
                        }
                        s34 s34Var = yv1Var.T3;
                        if (s34Var != null) {
                            s34Var.i();
                        }
                    }
                }
                TLRPC.User user = yv1Var.f;
                if (user != null && m9c.w(user) && (W12 = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.f.id))) != null) {
                    yv1Var.f = W12;
                }
                if (yv1Var.g2 != null) {
                    boolean I4 = yv1Var.I4();
                    mzb mzbVar = yv1Var.g2;
                    if (mzbVar.c != I4) {
                        mzbVar.setTabsEnabled(I4);
                        if (yv1Var.n0 != null && !yv1Var.k8()) {
                            yv1Var.n0.d();
                        }
                        yv1Var.Dd();
                    }
                }
                pr1 pr1Var3 = yv1Var.p1;
                if (pr1Var3 != null && z) {
                    pr1Var3.n(true);
                }
                if ((intValue & 130) != 0) {
                    yv1Var.zd(true);
                }
                r7 r7Var = yv1Var.j0;
                if (r7Var != null) {
                    if (sd2.T(yv1Var.e) && !sd2.p0(yv1Var.e)) {
                        long j2 = yv1Var.e.linked_monoforum_id;
                        if (j2 != 0 && sd2.z(yv1Var.currentAccount, 24, -j2)) {
                            z4 = true;
                        }
                    }
                    r7Var.Q(70, z4);
                }
            } else if (i == 1) {
                fc4.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!yv1Var.mb) {
                    if (longValue == yv1Var.l6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i8 = yv1Var.g4;
                        if (intValue2 != i8 && i8 != 3 && i8 != 8) {
                            if (i8 != 1 && intValue2 == 1 && !yv1Var.isPaused && LaunchActivity.S() == yv1Var && yv1Var.x5 == null && !arrayList.isEmpty() && ((k47) arrayList.get(0)).e1() < 0) {
                                int e1 = ((k47) arrayList.get(0)).e1();
                                if (((k47) arrayList.get(0)).k != null && ((k47) arrayList.get(0)).k.video_processing_pending) {
                                    z5 = true;
                                }
                                yv1Var.za(e1, z5);
                            }
                            fc4.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !yv1Var.jd && yv1Var.f != null && yv1Var.a() != yv1Var.getUserConfig().e() && (X1 = yv1Var.getMessagesController().X1(yv1Var.f.id)) != null && X1.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    k47 k47Var3 = (k47) arrayList.get(i4);
                                    if (k47Var3.e1() > 0 && !k47Var3.N3() && !k47Var3.q4()) {
                                        yv1Var.jd = true;
                                        yv1Var.getMessagesController().b3(yv1Var.f, yv1Var.classGuid, true, null);
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            yv1Var.Qa(arrayList, true);
                        }
                    } else if (sd2.T(yv1Var.e) && !yv1Var.e.megagroup && (chatFull = yv1Var.r8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            k47 k47Var4 = (k47) arrayList.get(i9);
                            if (k47Var4.d4()) {
                                yv1Var.N6.put(k47Var4.e1(), k47Var4);
                            }
                        }
                        yv1Var.J5();
                    }
                    fc4.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i == nm7.E) {
                yv1Var.X9(true);
            } else if (i == nm7.D) {
                yv1Var.z4();
            } else if (i == nm7.s) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == yv1Var.l6) {
                        yv1Var.finishFragment();
                    }
                } else if (gm.O1() && (tk5Var = yv1Var.parentLayout) != null && tk5Var.getFragmentStack().size() > 1) {
                    yv1Var.finishFragment();
                } else {
                    yv1Var.removeSelfFromStack(true);
                }
            } else if (i == nm7.t) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == yv1Var.a() && (booleanValue2 || yv1Var.parentLayout.getLastFragment() != yv1Var)) {
                    if (yv1Var.parentLayout.getLastFragment() == yv1Var) {
                        yv1Var.finishFragment();
                    } else {
                        yv1Var.removeSelfFromStack(true);
                    }
                }
            } else {
                int i10 = nm7.A;
                SparseArray[] sparseArrayArr = yv1Var.G6;
                if (i == i10) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = yv1Var.e;
                    if (chat2 != null && chat2.id == longValue3 && (k47Var2 = (k47) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && k47Var2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (yv1Var.I5) {
                            vp1 vp1Var = yv1Var.D4;
                            if (vp1Var != null) {
                                gm.r(vp1Var);
                                yv1Var.D4 = null;
                            }
                            k47Var2.k.replies.read_max_id = intValue3;
                        } else {
                            vp1 vp1Var2 = new vp1(yv1Var, k47Var2, intValue3);
                            yv1Var.D4 = vp1Var2;
                            gm.d3(vp1Var2, 500L);
                        }
                    }
                } else if (i == nm7.B) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = yv1Var.e;
                    if (chat3 != null && chat3.id == longValue4 && (k47Var = (k47) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = k47Var.k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer x1 = yv1Var.getMessagesController().x1(sd2.M(yv1Var.e, yv1Var.getMessagesController().M0(yv1Var.e.id), false));
                            int size3 = k47Var.k.replies.recent_repliers.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                } else if (k47.B1(k47Var.k.replies.recent_repliers.get(i11)) == k47.B1(x1)) {
                                    k47Var.k.replies.recent_repliers.remove(i11);
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            k47Var.k.replies.recent_repliers.add(0, x1);
                        }
                        TLRPC.MessageReplies messageReplies2 = k47Var.k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i12 = nm7.z;
                    int i13 = nm7.y;
                    if ((i == i13 || i == i12) && yv1Var.l6 == ((Long) objArr[0]).longValue()) {
                        if (i == i13) {
                            j = ((Integer) objArr[1]).intValue();
                        } else if (i == i12) {
                            j = ((Long) objArr[1]).longValue();
                        } else {
                            j = 0;
                        }
                        long j3 = yv1Var.s4;
                        if (j == j3 || j3 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i14 = yv1Var.A4;
                            ArrayList arrayList2 = yv1Var.M6;
                            if (intValue4 > i14) {
                                yv1Var.A4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i15 = 0; i15 < size4; i15++) {
                                    k47 k47Var5 = (k47) arrayList2.get(i15);
                                    int e12 = k47Var5.e1();
                                    if (!k47Var5.N3() && e12 > 0 && e12 <= yv1Var.A4) {
                                        if (!k47Var5.E4()) {
                                            break;
                                        }
                                        k47Var5.H5();
                                        hu1 hu1Var = yv1Var.D0;
                                        if (hu1Var != null) {
                                            hu1Var.H(k47Var5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > yv1Var.B4) {
                                yv1Var.B4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i16 = 0; i16 < size5; i16++) {
                                    k47 k47Var6 = (k47) arrayList2.get(i16);
                                    int e13 = k47Var6.e1();
                                    if (k47Var6.N3() && e13 > 0 && e13 <= yv1Var.B4) {
                                        if (!k47Var6.E4()) {
                                            break;
                                        }
                                        k47Var6.H5();
                                        hu1 hu1Var2 = yv1Var.D0;
                                        if (hu1Var2 != null) {
                                            hu1Var2.M(k47Var6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yv1Var.p6(i, objArr);
        yv1Var.q6(i, objArr);
        yv1Var.r6(i, objArr);
        yv1Var.s6(i, objArr);
        yv1Var.t6(i, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        e51 e51Var = this.Y1;
        if (e51Var != null && this.visibleDialog == e51Var) {
            e51Var.d2.b0(false);
            this.Y1.H();
            this.Y1.d2.f0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.ya && !(dialog instanceof wx0) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e5(boolean z) {
        sc7 sc7Var;
        if (this.d4 == 2 && (sc7Var = this.b4) != null) {
            String str = this.J3;
            pg6 pg6Var = sc7Var.F;
            if (!TextUtils.equals(sc7Var.y, str)) {
                String trim = str.trim();
                String str2 = null;
                if (trim.charAt(0) != '$' && trim.charAt(0) != '#') {
                    trim = null;
                } else {
                    int indexOf = trim.indexOf(64);
                    if (indexOf >= 0) {
                        String substring = trim.substring(0, indexOf);
                        str2 = trim.substring(indexOf + 1);
                        trim = substring;
                    }
                }
                gm.r(pg6Var);
                u3b u3bVar = sc7Var.E;
                if (u3bVar != null && u3bVar.I != 0) {
                    ConnectionsManager.getInstance(u3bVar.c).cancelRequest(u3bVar.I, true);
                    u3bVar.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    sc7Var.y = str;
                    sc7Var.E = new u3b(sc7Var.r, str2, trim);
                    if (z) {
                        pg6Var.run();
                    } else {
                        gm.d3(pg6Var, 1000L);
                    }
                }
                u3b u3bVar2 = sc7Var.E;
                if (u3bVar2 != null && u3bVar2.J > 0) {
                    sc7Var.f();
                }
            }
        }
    }

    public final TextureView e6(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        gm.r(this.O8);
        if (this.J8 == null) {
            ps1 ps1Var = new ps1(this, getParentActivity(), (byte) 2);
            this.J8 = ps1Var;
            ps1Var.setOutlineProvider(new cm0(this, (byte) 3));
            this.J8.setClipToOutline(true);
            this.J8.setWillNotDraw(false);
            jy jyVar = new jy(getParentActivity());
            this.L8 = jyVar;
            jyVar.setBackgroundColor(0);
            if (z) {
                this.J8.addView(this.L8, qoe.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.M8 = textureView;
            textureView.setOpaque(false);
            this.L8.addView(this.M8, qoe.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.J8.getParent();
        if (viewGroup != null && viewGroup != this.m1) {
            viewGroup.removeView(this.J8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.m1.addView(this.J8, 1, new FrameLayout.LayoutParams(gm.b3(f8(), U7()), gm.b3(f8(), U7())));
        }
        this.J8.setTag(null);
        this.L8.setDrawingReady(false);
        return this.M8;
    }

    public final int e7() {
        if (this.g4 == 5) {
            return (int) this.s4;
        }
        return 0;
    }

    public final boolean e8() {
        mzb mzbVar = this.g2;
        if (mzbVar != null && mzbVar.U && mzbVar.a.f) {
            return true;
        }
        return false;
    }

    public final void e9() {
        long j;
        Integer valueOf = Integer.valueOf(this.n6);
        ArrayList arrayList = this.z6;
        arrayList.add(valueOf);
        if (this.g4 == 7) {
            af5 a = af5.a(this.currentAccount);
            String str = this.J3;
            int i = this.classGuid;
            int i2 = this.d4;
            int i3 = this.n6;
            this.n6 = i3 + 1;
            a.e(i, i2, i3, str);
        } else if (this.O7 != 0) {
            oc7 messagesController = getMessagesController();
            long j2 = this.l6;
            long j3 = this.d7;
            int i4 = this.O7;
            int i5 = this.classGuid;
            int i6 = this.g4;
            long j4 = this.s4;
            int i7 = this.C4;
            int i8 = this.n6;
            this.n6 = i8 + 1;
            messagesController.c3(j2, j3, false, 30, 0, i4, true, 0, i5, 4, i6, j4, i7, i8, this.x4);
        } else if (this.M7 != 0 && (!j8() || this.M7 == this.d8 || this.x4)) {
            int i9 = this.B7;
            if (i9 != 0) {
                this.d7 = i9;
                oc7 messagesController2 = getMessagesController();
                long j5 = this.d7;
                boolean z = this.z7;
                byte b = this.y7;
                int i10 = this.M7;
                int i11 = this.classGuid;
                int i12 = this.g4;
                long j6 = this.s4;
                int i13 = this.C4;
                int i14 = this.n6;
                this.n6 = i14 + 1;
                messagesController2.c3(j5, 0L, z, b, i10, 0, true, 0, i11, 3, i12, j6, i13, i14, this.x4);
            } else {
                oc7 messagesController3 = getMessagesController();
                long j7 = this.l6;
                long j8 = this.d7;
                boolean z2 = this.z7;
                byte b2 = this.y7;
                int i15 = this.M7;
                int i16 = this.classGuid;
                int i17 = this.g4;
                long j9 = this.s4;
                int i18 = this.C4;
                int i19 = this.n6;
                this.n6 = i19 + 1;
                messagesController3.c3(j7, j8, z2, b2, i15, 0, true, 0, i16, 3, i17, j9, i18, i19, this.x4);
            }
        } else if (this.A7) {
            this.n6++;
        } else {
            oc7 messagesController4 = getMessagesController();
            long j10 = this.l6;
            long j11 = this.d7;
            boolean z3 = this.z7;
            byte b3 = this.y7;
            int i20 = this.M7;
            int i21 = this.classGuid;
            int i22 = this.g4;
            long j12 = this.s4;
            int i23 = this.C4;
            int i24 = this.n6;
            this.n6 = i24 + 1;
            messagesController4.c3(j10, j11, z3, b3, i20, 0, true, 0, i21, 2, i22, j12, i23, i24, this.x4);
        }
        int i25 = this.g4;
        if (i25 == 0 || (i25 == 3 && f7() == getUserConfig().e())) {
            if (j8() && !this.x4) {
                return;
            }
            arrayList.add(Integer.valueOf(this.n6));
            oc7 messagesController5 = getMessagesController();
            long j13 = this.l6;
            long j14 = this.d7;
            int i26 = this.classGuid;
            if (this.g4 == 3) {
                j = 0;
            } else {
                j = this.s4;
            }
            long j15 = j;
            int i27 = this.C4;
            int i28 = this.n6;
            this.n6 = i28 + 1;
            messagesController5.c3(j13, j14, false, 1, 0, 0, true, 0, i26, 2, 1, j15, i27, i28, this.x4);
        }
    }

    public final boolean ea() {
        ms1 ms1Var = this.a0;
        boolean z = ms1Var.p3;
        if (z) {
            ms1Var.Y1();
            this.S3 = true;
        }
        gm.g3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z;
    }

    public final void eb(int r23, java.util.ArrayList r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.eb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void ec(k47 k47Var, nv1 nv1Var) {
        ac(true, k47Var, null, null, null, true, 0, nv1Var, false, 0L, null, true);
    }

    public final void ed() {
        q02 q02Var = this.y1;
        qr1 qr1Var = this.w;
        if (q02Var != null) {
            this.y1.setTranslationY((((-qr1Var.d()) - this.U.getInputBubbleHeight()) - u7(izb.c)) - gm.L(13.0f));
        }
        if (this.s1 != null) {
            this.s1.setTranslationY((-qr1Var.d()) - gm.L(16.0f));
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.extendActionMode(android.view.Menu):boolean");
    }

    @Override
    public final TLRPC.Chat f() {
        return this.e;
    }

    public final void f5() {
        this.U.d();
        ed();
        Oc();
        z5();
        w5();
        B5();
        A5();
        E5();
        P7();
        boolean z = true;
        if (this.w.s == 1) {
            z = false;
        }
        if (this.Bb != z) {
            this.Bb = z;
            checkSystemBarColors();
        }
    }

    public final void f6() {
        if (this.m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new k7((byte) 1, getParentActivity(), this);
            O7();
            this.Z1.setClickable(true);
            this.b1.addView(this.Z1, qoe.o(-1, 44));
            this.b1.i(2, this.Z1);
            this.b1.h(this.Z1);
            TextView textView = new TextView(getParentActivity());
            this.c2 = textView;
            int i = cmb.p7;
            anb.X(textView, i, getResourceProvider());
            TextView textView2 = this.c2;
            float L = gm.L(18.0f);
            int L2 = gm.L(4.0f);
            anb.R(textView2, cmb.W(L, getThemedColor(i) & 436207615, L2, L2, L2, L2), null, anb.g(i, 25), getResourceProvider());
            this.c2.setTag(Integer.valueOf(i));
            this.c2.setTextSize(1, 14.0f);
            this.c2.setTypeface(gm.o());
            this.c2.setSingleLine(true);
            this.c2.setMaxLines(1);
            this.c2.setGravity(17);
            this.Z1.addView(this.c2, qoe.e(-1, -1, 51));
            this.c2.setOnClickListener(new tm1(this, (byte) 13));
            l66 l66Var = new l66(getParentActivity(), this.Ba);
            this.i2 = l66Var;
            anb.X(l66Var, cmb.We, getResourceProvider());
            this.i2.setTextSize(1, 13.3f);
            this.i2.setDisablePaddingsOffset(true);
            anb.G(this.i2, cmb.Yl, getResourceProvider());
            this.i2.setGravity(17);
            this.i2.setPadding(0, gm.L(9.0f), 0, gm.L(9.0f));
            this.b1.addView(this.i2, qoe.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.b1.i(8, this.i2);
            this.b1.h(this.i2);
            TextView textView3 = new TextView(getParentActivity());
            this.a2 = textView3;
            int i2 = cmb.Xe;
            anb.X(textView3, i2, getResourceProvider());
            this.a2.setVisibility(8);
            this.a2.setTextSize(1, 14.0f);
            this.a2.setTypeface(gm.o());
            this.a2.setSingleLine(true);
            this.a2.setMaxLines(1);
            this.a2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            this.a2.setGravity(17);
            TextView textView4 = this.a2;
            int themedColor = getThemedColor(i2) & 436207615;
            int L3 = gm.L(4.0f);
            anb.R(textView4, cmb.W(gm.L(18.0f), themedColor, L3, L3, L3, L3), null, anb.g(i2, 25), getResourceProvider());
            this.Z1.addView(this.a2, qoe.e(-1, -1, 51));
            this.a2.setOnClickListener(new tm1(this, (byte) 14));
            TextView textView5 = new TextView(getParentActivity());
            this.d2 = textView5;
            anb.X(textView5, i2, getResourceProvider());
            this.d2.setVisibility(8);
            this.d2.setTextSize(1, 14.0f);
            this.d2.setTypeface(gm.o());
            this.d2.setSingleLine(true);
            this.d2.setMaxLines(1);
            this.d2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            this.d2.setGravity(17);
            this.d2.setText(jb6.M0(2131745817, null));
            anb.R(this.d2, cmb.f0(getThemedColor(i2) & 436207615, 3, -1), null, anb.g(i2, 25), getResourceProvider());
            this.b1.addView(this.d2, qoe.o(-1, 48));
            this.b1.i(4, this.d2);
            this.b1.h(this.d2);
            this.d2.setOnClickListener(new tm1(this, (byte) 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.j2 = imageView;
            imageView.setImageResource(2131231988);
            this.j2.setContentDescription(jb6.M0(2131751978, null));
            ImageView imageView2 = this.j2;
            int i3 = cmb.h6;
            anb.R(imageView2, cmb.N(getThemedColor(i3), 0, 0), null, anb.M(i3), getResourceProvider());
            anb.s(this.j2, cmb.Te, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.j2, qoe.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.j2.setOnClickListener(new tm1(this, (byte) 16));
        }
    }

    public final long f7() {
        if (this.g4 == 3) {
            return this.s4;
        }
        return 0L;
    }

    public final boolean f8() {
        mzb mzbVar = this.g2;
        if (mzbVar != null) {
            return mzbVar.c;
        }
        if (sd2.c0(this.e) && I4()) {
            return true;
        }
        return false;
    }

    public final void f9(View view, boolean[] zArr, m8 m8Var, View view2) {
        int i;
        int i2;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            i = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        } else {
            i = 0;
        }
        if (i > 0 && !zArr[0] && m8Var == this.g9 && m8Var.isShowing() && view2.isLaidOut()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = (view2.getHeight() + iArr[1]) - (view.getHeight() - i);
            int i3 = gm.m;
            int i4 = this.j9;
            if (height > 0) {
                i2 = gm.L(8.0f) + height;
            } else {
                i2 = 0;
            }
            int max = Math.max(i3, i4 - i2);
            if (max != this.j9) {
                zArr[0] = true;
                int i5 = this.i9;
                this.j9 = max;
                m8Var.update(i5, max, -1, -1);
            }
        }
    }

    public final void fb() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().j(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.M7 = 0;
        this.C7 = false;
        this.D7 = true;
        this.z6.clear();
    }

    public final void fc(v67 v67Var) {
        ac(true, null, null, null, null, true, 0, null, false, 0L, v67Var, true);
    }

    public final void fd(boolean z) {
        boolean z2;
        Object[] objArr;
        Object[] objArr2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Integer num;
        boolean z8;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        int i2;
        float f7;
        float f8;
        float f9;
        int i3;
        Integer num2;
        Integer num3;
        Integer num4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        if ((!j8() || this.x4) && this.a3 != null) {
            if (!this.g6) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (this.V4.size() > 1 && !this.X2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.a3.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.Z2.getTag() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.Y2.getTag() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (objArr == null && !this.pc && !this.X2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (objArr != null && !this.pc && !this.X2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.pc && !this.X2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (objArr2 == objArr && z3 == z7 && z4 == z5) {
                z8 = false;
            } else {
                AnimatorSet animatorSet = this.b3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.b3 = null;
                }
                if (z2) {
                    if (objArr != null) {
                        this.a3.setVisibility(0);
                    } else if (z5) {
                        this.Y2.setVisibility(0);
                    }
                    if (z7) {
                        this.Z2.setVisibility(0);
                        this.Z2.setAlpha(0.0f);
                        this.Z2.setScaleX(0.4f);
                        this.Z2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.b3 = animatorSet2;
                    ImageView imageView = this.a3;
                    Property property = View.ALPHA;
                    if (z6) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f10);
                    ImageView imageView2 = this.a3;
                    Property property2 = View.SCALE_X;
                    if (z6) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f11);
                    ImageView imageView3 = this.a3;
                    Property property3 = View.SCALE_Y;
                    if (z6) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.4f;
                    }
                    z8 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f12);
                    ImageView imageView4 = this.Y2;
                    if (z5) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f13);
                    ImageView imageView5 = this.Y2;
                    if (z5) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f14);
                    ImageView imageView6 = this.Y2;
                    if (z5) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f15);
                    RadialProgressView radialProgressView = this.Z2;
                    if (!z7) {
                        f16 = 0.0f;
                    } else {
                        f16 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f16);
                    RadialProgressView radialProgressView2 = this.Z2;
                    if (!z7) {
                        f17 = 0.4f;
                    } else {
                        f17 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f17);
                    RadialProgressView radialProgressView3 = this.Z2;
                    if (!z7) {
                        f18 = 0.4f;
                    } else {
                        f18 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f18));
                    this.b3.setInterpolator(d53.h);
                    this.b3.setDuration(360L);
                    this.b3.addListener(new bq1(this, z5, z6, z7));
                    this.b3.start();
                } else {
                    num = 1;
                    z8 = false;
                    ImageView imageView7 = this.Y2;
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    imageView7.setAlpha(f);
                    ImageView imageView8 = this.Y2;
                    if (z5) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.4f;
                    }
                    imageView8.setScaleX(f2);
                    ImageView imageView9 = this.Y2;
                    if (z5) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.4f;
                    }
                    imageView9.setScaleY(f3);
                    ImageView imageView10 = this.Y2;
                    if (z5) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    imageView10.setVisibility(i);
                    ImageView imageView11 = this.a3;
                    if (z6) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    imageView11.setAlpha(f4);
                    ImageView imageView12 = this.a3;
                    if (z6) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.4f;
                    }
                    imageView12.setScaleX(f5);
                    ImageView imageView13 = this.a3;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.4f;
                    }
                    imageView13.setScaleY(f6);
                    ImageView imageView14 = this.a3;
                    if (z6) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    imageView14.setVisibility(i2);
                    RadialProgressView radialProgressView4 = this.Z2;
                    if (z7) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f7);
                    RadialProgressView radialProgressView5 = this.Z2;
                    if (z7) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f8);
                    RadialProgressView radialProgressView6 = this.Z2;
                    if (z7) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f9);
                    RadialProgressView radialProgressView7 = this.Z2;
                    if (z7) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    radialProgressView7.setVisibility(i3);
                }
                ImageView imageView15 = this.Y2;
                if (z5) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.a3;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.Z2;
                if (z7) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.O2 != null) {
                if (j8() && !this.x4) {
                    boolean z9 = z8;
                    this.O2.c(z9 ? 1 : 0, 1, z9);
                    return;
                }
                this.O2.c((this.V4.size() - 1) - Collections.binarySearch(this.V4, Integer.valueOf(this.Z4), Comparator$CC.reverseOrder()), this.V4.size(), z2);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        m8 m8Var = this.g9;
        if (m8Var != null) {
            m8Var.e = false;
            N5(true);
        }
    }

    public final void g5() {
        TLRPC.Chat L0;
        long j = getArguments().getInt("search_from_user_id", 0);
        if (j != 0) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
            if (W1 != null) {
                Ba("");
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                ub(null, W1);
                return;
            }
            return;
        }
        long j2 = getArguments().getInt("search_from_chat_id", 0);
        if (j2 != 0 && (L0 = getMessagesController().L0(Long.valueOf(j2))) != null) {
            Ba("");
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            ub(L0, null);
        }
    }

    public final void g6() {
        int i;
        if (this.g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                b6();
            }
            mzb mzbVar = new mzb(getParentActivity(), this, this.currentAccount, a(), I4(), getResourceProvider());
            this.g2 = mzbVar;
            mzbVar.S = new mz(this, (byte) 7);
            mzbVar.setSideMenuBackgroundDrawable(this.L.c(mzbVar, qqd.o(this.Ba), false));
            mzb mzbVar2 = this.g2;
            mzbVar2.setTopMenuBackgroundDrawable(this.L.c(mzbVar2, qqd.o(this.Ba), false));
            this.g2.setCurrentTopic(d());
            this.g2.setOnNewTopicSelected(new mz(this, (byte) 9));
            this.g2.setOnTopicSelected(new pm1(this, (byte) 0));
            this.g2.setOnDialogSelected(new pm1(this, (byte) 1));
            int indexOfChild = this.m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i = indexOfChild + 1;
            } else {
                i = 8;
            }
            this.m1.addView(this.g2, i, qoe.f(-1.0f, -1, 51, 0, -gm.L(5.0f), 0, 0));
            this.g2.m();
            Dd();
            es1 es1Var = this.X1;
            if (es1Var != null) {
                es1Var.bringToFront();
            }
        }
    }

    public final int g7(int i) {
        return (int) aq1.f((((this.A0.getMeasuredHeight() - this.Ya) - this.P9) - this.w.e()) - gm.L(53.0f), i, 2.0f, -gm.L(2.0f));
    }

    public final boolean g8() {
        if (this.m0 != null && k8()) {
            return true;
        }
        return false;
    }

    public final void g9(long j) {
        getMediaDataController().I0(j, j, true, this.classGuid, null);
    }

    public final void gb() {
        this.mc = null;
        this.kc = 0;
        this.lc = -1;
        this.nc = null;
        this.oc = null;
        this.y1.d(false);
    }

    public final void gc(boolean z, TLRPC.WebPage webPage, boolean z2) {
        bc(z, webPage, z2, true);
    }

    public final void gd(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.gd(int, boolean):void");
    }

    @Override
    public final ok5 getBackButtonState() {
        return ok5.a;
    }

    @Override
    public final bu3 getEdgeToEdgeSupportMode() {
        return bu3.c;
    }

    @Override
    public final qd2 getGroupCall() {
        qd2 qd2Var;
        if (this.g4 == 0 && (qd2Var = this.o8) != null && (qd2Var.b instanceof TLRPC.TL_groupCall)) {
            return qd2Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.g4 == 2) {
            ArrayList arrayList = this.M6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.L(80.0f) + V6((k47) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public ylb getResourceProvider() {
        return this.Ba;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        lka lkaVar;
        lka lkaVar2;
        View view;
        e34 e34Var;
        e34 e34Var2;
        e34 e34Var3;
        e34 e34Var4;
        e34 e34Var5;
        e34 e34Var6;
        e34 e34Var7;
        e34 e34Var8;
        e34 e34Var9;
        e34 e34Var10;
        e34 e34Var11;
        e34 e34Var12;
        View view2;
        if (this.w7) {
            return null;
        }
        int i = 0;
        if (this.xa) {
            this.xa = false;
            return null;
        }
        t10 t10Var = new t10(this, (byte) 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.De));
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ee));
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Fe));
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ge));
        c8();
        arrayList.add(new cnb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.F8));
        arrayList.add(new cnb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.E8));
        pr1 pr1Var = this.p1;
        if (pr1Var != null) {
            lkaVar = pr1Var.getTitleTextView();
        } else {
            lkaVar = null;
        }
        arrayList.add(new cnb(lkaVar, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.z8));
        pr1 pr1Var2 = this.p1;
        if (pr1Var2 != null) {
            lkaVar2 = pr1Var2.getTitleTextView();
        } else {
            lkaVar2 = null;
        }
        int i2 = cmb.A8;
        arrayList.add(new cnb(lkaVar2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        pr1 pr1Var3 = this.p1;
        if (pr1Var3 != null) {
            view = pr1Var3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new cnb(i2, view));
        arrayList.add(new cnb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i3 = cmb.C8;
        arrayList.add(new cnb(aVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.w8));
        m37 m37Var = (m37) getThemedDrawable("drawableMsgIn");
        m37 m37Var2 = (m37) getThemedDrawable("drawableMsgInMedia");
        m37 m37Var3 = (m37) getThemedDrawable("drawableMsgInSelected");
        m37 m37Var4 = (m37) getThemedDrawable("drawableMsgInMediaSelected");
        m37 m37Var5 = (m37) getThemedDrawable("drawableMsgOut");
        m37 m37Var6 = (m37) getThemedDrawable("drawableMsgOutMedia");
        m37 m37Var7 = (m37) getThemedDrawable("drawableMsgOutSelected");
        m37 m37Var8 = (m37) getThemedDrawable("drawableMsgOutMediaSelected");
        if (m37Var != null) {
            Drawable[] drawableArr = m37Var.A;
            int i4 = cmb.sa;
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, drawableArr, (bnb) null, i4));
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, m37Var2.A, (bnb) null, i4));
            Drawable[] drawableArr2 = m37Var5.A;
            int i5 = cmb.sb;
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, drawableArr2, (bnb) null, i5));
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, m37Var6.A, (bnb) null, i5));
        }
        if (!this.Ba.p(false)) {
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{m37Var5, m37Var6}, (bnb) null, cmb.tb));
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{m37Var5, m37Var6}, (bnb) null, cmb.ub));
            arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{m37Var5, m37Var6}, (bnb) null, cmb.vb));
        }
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{m37Var7, m37Var8}, (bnb) null, cmb.Rc));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.gd));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.hd));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ud));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yb));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vd));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zb));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ac));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.mc));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oc));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.nc));
        arrayList.add(new cnb(this.A0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ff));
        this.Ba.getClass();
        ps1 ps1Var = this.g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i6 = cmb.Ie;
        arrayList.add(new cnb(ps1Var, 0, (Class[]) null, themedPaint, (Drawable[]) null, (bnb) null, i6));
        arrayList.add(new cnb(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (bnb) null, i6));
        arrayList.add(new cnb(this.a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (bnb) null, cmb.Nl));
        arrayList.add(new cnb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Pe));
        arrayList.add(new cnb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qe));
        arrayList.add(new cnb(this.a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (bnb) null, cmb.ag));
        arrayList.add(new cnb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.dg));
        ms1 ms1Var = this.a0;
        int i7 = cmb.cg;
        arrayList.add(new cnb(ms1Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        arrayList.add(new cnb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        arrayList.add(new cnb(this.a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (bnb) null, cmb.eg));
        arrayList.add(new cnb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (bnb) null, cmb.Tf));
        arrayList.add(new cnb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Wf));
        ms1 ms1Var2 = this.a0;
        if (ms1Var2 != null) {
            e34Var = ms1Var2.getEmojiView();
        } else {
            e34Var = null;
        }
        arrayList.add(new cnb(e34Var, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Bf));
        ms1 ms1Var3 = this.a0;
        if (ms1Var3 != null) {
            e34Var2 = ms1Var3.getEmojiView();
        } else {
            e34Var2 = null;
        }
        arrayList.add(new cnb(e34Var2, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Cf));
        ms1 ms1Var4 = this.a0;
        if (ms1Var4 != null) {
            e34Var3 = ms1Var4.getEmojiView();
        } else {
            e34Var3 = null;
        }
        arrayList.add(new cnb(e34Var3, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Df));
        ms1 ms1Var5 = this.a0;
        if (ms1Var5 != null) {
            e34Var4 = ms1Var5.getEmojiView();
        } else {
            e34Var4 = null;
        }
        arrayList.add(new cnb(e34Var4, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Ff));
        ms1 ms1Var6 = this.a0;
        if (ms1Var6 != null) {
            e34Var5 = ms1Var6.getEmojiView();
        } else {
            e34Var5 = null;
        }
        arrayList.add(new cnb(e34Var5, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Gf));
        ms1 ms1Var7 = this.a0;
        if (ms1Var7 != null) {
            e34Var6 = ms1Var7.getEmojiView();
        } else {
            e34Var6 = null;
        }
        arrayList.add(new cnb(e34Var6, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.If));
        ms1 ms1Var8 = this.a0;
        if (ms1Var8 != null) {
            e34Var7 = ms1Var8.getEmojiView();
        } else {
            e34Var7 = null;
        }
        arrayList.add(new cnb(e34Var7, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Jf));
        ms1 ms1Var9 = this.a0;
        if (ms1Var9 != null) {
            e34Var8 = ms1Var9.getEmojiView();
        } else {
            e34Var8 = null;
        }
        arrayList.add(new cnb(e34Var8, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Nf));
        ms1 ms1Var10 = this.a0;
        if (ms1Var10 != null) {
            e34Var9 = ms1Var10.getEmojiView();
        } else {
            e34Var9 = null;
        }
        arrayList.add(new cnb(e34Var9, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Ef));
        ms1 ms1Var11 = this.a0;
        if (ms1Var11 != null) {
            e34Var10 = ms1Var11.getEmojiView();
        } else {
            e34Var10 = null;
        }
        arrayList.add(new cnb(e34Var10, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Af));
        ms1 ms1Var12 = this.a0;
        if (ms1Var12 != null) {
            e34Var11 = ms1Var12.getEmojiView();
        } else {
            e34Var11 = null;
        }
        arrayList.add(new cnb(e34Var11, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Lf));
        ms1 ms1Var13 = this.a0;
        if (ms1Var13 != null) {
            e34Var12 = ms1Var13.getEmojiView();
        } else {
            e34Var12 = null;
        }
        arrayList.add(new cnb(e34Var12, 0, new Class[]{e34.class}, (String[]) null, (Drawable[]) null, t10Var, cmb.Hf));
        ms1 ms1Var14 = this.a0;
        if (ms1Var14 != null) {
            p3c trendingStickersAlert = ms1Var14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.R());
            }
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.a0.getStickersArrowDrawable()}, (bnb) null, cmb.Ml));
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (i8 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new cnb(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vj));
        }
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Of));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Pf));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qf));
        arrayList.add(new cnb(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.u7));
        arrayList.add(new cnb(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (bnb) null, cmb.t7));
        arrayList.add(new cnb(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (bnb) null, cmb.z7));
        arrayList.add(new cnb(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.x7));
        arrayList.add(new cnb(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.c6));
        NumberTextView numberTextView = this.U2;
        int i9 = cmb.Ve;
        arrayList.add(new cnb(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i9));
        ImageView imageView = this.h3;
        int i10 = cmb.y8;
        arrayList.add(new cnb(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i10));
        arrayList.add(new cnb(this.i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i10));
        arrayList.add(new cnb(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yc));
        arrayList.add(new cnb(this.A0, 131072, new Class[]{vf2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (bnb) null, cmb.wf));
        a91 a91Var = this.S;
        int i11 = cmb.bd;
        arrayList.add(new cnb(a91Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i11));
        arrayList.add(new cnb(this.q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i11));
        arrayList.add(new cnb(this.n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i11));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.J6));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Lc));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.kg));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.lg));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Jh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Kh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Lh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Mh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Nh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Oh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ph));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Rh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Th));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Uh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ai));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Wh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Xh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ic));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.sk));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.uk));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.tk));
        int i12 = cmb.vk;
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i12));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i12));
        k02 k02Var = this.Ca;
        if (k02Var != null) {
            arrayList.add(new cnb(k02Var.g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i9));
            arrayList.add(new cnb(k02Var.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Te));
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cnb) obj).n = this.Ba;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.Ba.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.Ba.d(str);
        if (d != null) {
            return d;
        }
        return cmb.T0(str);
    }

    public TLRPC.User h() {
        return this.f;
    }

    public final void h5() {
        k47 k47Var;
        if (!this.R4 && (k47Var = this.b8) != null) {
            if (this.M6.indexOf(k47Var) >= 0) {
                this.S4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.Q4 != null) {
        } else {
            en1 en1Var = new en1(this, (byte) 29);
            this.Q4 = en1Var;
            gm.c3(en1Var);
        }
    }

    public final void h6() {
        if (this.e2 == null && getParentActivity() != null) {
            f6();
            if (this.b1 != null) {
                zs1 zs1Var = new zs1(this, getParentActivity(), this, this.Ba);
                this.e2 = zs1Var;
                this.b1.addView(zs1Var, qoe.r(-1, 36, 83));
                this.b1.i(12, this.e2);
                this.b1.h(this.e2);
            }
        }
    }

    public final int h7(k47 k47Var) {
        return g7(V6(k47Var, !TextUtils.isEmpty(this.h8))) - pb(k47Var);
    }

    public final boolean h8() {
        boolean z;
        boolean z2;
        float f;
        FrameLayout frameLayout;
        if (!this.c && !this.d && this.f == null && this.A0 != null && gda.c()) {
            Boolean bool = this.Qb;
            if (bool == null) {
                bool = Boolean.valueOf(e86.e(360928));
                this.Qb = bool;
            }
            if (bool.booleanValue()) {
                int i = Integer.MAX_VALUE;
                int i2 = 0;
                for (int i3 = 0; i3 < this.A0.getChildCount(); i3++) {
                    i2 += this.A0.getChildAt(i3).getHeight();
                    int top = this.A0.getChildAt(i3).getTop();
                    if (top < i) {
                        i = top;
                    }
                }
                float f2 = i;
                if (f2 <= this.P9) {
                    Y4(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.U6;
                boolean z3 = zArr[0];
                ArrayList arrayList = this.M6;
                if ((!z3 || ((this.d7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.Y6 && f2 > this.P9 && (!arrayList.isEmpty() ? i2 != 0 : this.Pb)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !this.inTransitionAnimation || (frameLayout = this.f1) == null || frameLayout.getVisibility() != 0 || this.f1.getChildCount() <= 0) {
                    if (!z && this.f7 == 0) {
                        Y4(this.fragmentBeginToShow);
                    }
                    if (gda.o() != 0 && !this.oa && this.fragmentBeginToShow) {
                        if (z && this.f7 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Drawable l = this.Ba.l();
                        mu1 mu1Var = this.m1;
                        if (mu1Var != null) {
                            l = mu1Var.getBackgroundImage();
                        }
                        if (l instanceof ah7) {
                            ah7 ah7Var = (ah7) l;
                            if (ah7Var.M != z2) {
                                float f3 = 1.0f;
                                if (!z2) {
                                    ah7Var.d();
                                    if (ah7Var.M) {
                                        ah7Var.h = 1.0f - ((ah7Var.h - (((int) (f / 0.125f)) * 0.125f)) / 0.125f);
                                        ah7Var.d = true;
                                    }
                                }
                                ah7Var.M = z2;
                                if (z2) {
                                    f3 = 1.5f;
                                }
                                ah7Var.L = f3;
                                ah7Var.x();
                            } else if (z2) {
                                ah7Var.x();
                            }
                        }
                    }
                    if (z || (this.f7 != 0 && System.currentTimeMillis() - this.f7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void h9() {
        if (this.o5) {
            this.o5 = false;
            MediaController w = MediaController.w();
            if (w.E() && !w.F() && w.h1 == this.classGuid) {
                w.C0(false);
            }
        }
    }

    public final void ha() {
        V4(5, this.e1, true);
        V4(1, this.a0, false);
        V4(4, this.g3, true);
        V4(3, this.d1, false);
        V4(2, this.T, false);
        float f = this.pd.e;
        jif jifVar = this.ud;
        float B = kt6.B(1.0f, f, 1.0f - ((float[]) jifVar.b)[5], 1.0f);
        zv1 zv1Var = this.e1;
        if (zv1Var != null) {
            zv1Var.setTotalVisibilityFactor(B);
        }
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            ms1Var.setTranslationY(gm.L(54.0f) * B);
        }
        ps1 ps1Var = this.g3;
        if (ps1Var != null) {
            ps1Var.setTranslationY(gm.L(54.0f) * B);
        }
        qs1 qs1Var = this.d1;
        if (qs1Var != null) {
            qs1Var.setTranslationY(gm.L(54.0f) * B);
        }
        ps1 ps1Var2 = this.T;
        if (ps1Var2 != null) {
            ps1Var2.setTranslationY(gm.L(54.0f) * B);
        }
        va2 va2Var = this.U;
        if (va2Var != null) {
            va2Var.setInputBubbleAlpha((int) ((1.0f - B) * 255.0f));
            this.U.setInputBubbleTranslationY(gm.L(54.0f) * B);
        }
        qs1 qs1Var2 = this.d1;
        fn0 fn0Var = this.nd;
        if (qs1Var2 != null) {
            qs1Var2.setTotalVisibilityFactor((1.0f - fn0Var.e) * ((float[]) jifVar.b)[3]);
        }
        vd2 vd2Var = this.ma;
        if (vd2Var != null) {
            float f2 = fn0Var.e;
            if (vd2Var.T != f2) {
                vd2Var.T = f2;
                this.fragmentView.invalidate();
            }
        }
        D5();
    }

    public final void hb(defpackage.rc2 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.hb(rc2):void");
    }

    public final void hc(boolean z) {
        if (this.m3 != null && !b8()) {
            if (this.m3.getTag() == null) {
                AnimatorSet animatorSet = this.v3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.m3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.v3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.v3.playTogether(ObjectAnimator.ofFloat(this.m3, View.ALPHA, 1.0f));
                this.v3.addListener(new yq1(this, (byte) 4));
                this.v3.start();
            }
            if (!z) {
                Q7();
                this.p3 = (short) 1000;
            }
        }
    }

    public final void hd() {
        k47 k47Var;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.x4 && !this.X4.isEmpty() && this.V4.size() == 1 && ((Integer) this.V4.get(0)).intValue() == d() + 1) {
            k47Var = (k47) this.X4.get(this.V4.get(0));
        } else {
            k47Var = null;
        }
        this.n4 = k47Var;
        if (this.x4 && k47Var != null && (message = k47Var.k) != null && (tL_forumTopic = this.r4) != null && !k47.u5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.e;
            TLRPC.Peer peer = this.n4.k.from_id;
            if (chat == null) {
                if (peer == null) {
                    return;
                }
            } else if (peer != null) {
                if (sd2.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                    if (chat.id == peer.channel_id) {
                        return;
                    }
                } else if (!sd2.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.id == peer.chat_id) {
                    return;
                }
            }
            this.n4 = null;
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        k47 k47Var = this.m4;
        if (k47Var != null && k47Var.M1() == 0 && sd2.n(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i5(boolean z) {
        if (this.F5 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i < arrayList.size()) {
                    k47 k47Var = (k47) arrayList.get(i);
                    if (k47Var != null && k47Var.e1() == this.F5.e1() && k47.B0(k47Var.k) == k47.B0(this.F5.k)) {
                        this.F5 = k47Var;
                        nv1 nv1Var = this.D5;
                        if (nv1Var != null) {
                            nv1Var.a(k47Var);
                        }
                        if (z) {
                            o47 o47Var = this.x5;
                            if (o47Var != null) {
                                k47 k47Var2 = this.F5;
                                f47 f47Var = this.B5;
                                if (f47Var == null) {
                                    f47Var = T6(k47Var2.c1());
                                }
                                o47Var.f(k47Var2, f47Var, this.l6, this.D5);
                            }
                            D6();
                            return;
                        }
                        return;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i6() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.Ba);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(gm.L(51.0f));
            this.m1.addView(this.N3, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int i7(View view) {
        fc4.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom()) + "} chatHeight=" + this.A0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.A0.getPaddingBottom());
        return (this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom();
    }

    public final boolean i8() {
        if (getUserConfig().e() == a() && !getMessagesController().E1().b && getUserConfig().p()) {
            return true;
        }
        return false;
    }

    public final void i9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            hs6.d0(this.currentAccount).G0(false, true, null);
            la(user.id, this.C8, false);
        }
    }

    public final void ia(boolean z, boolean z2) {
        if (this.S3) {
            gm.d3(new mz(this, (byte) 26), 200L);
            if (z2) {
                this.S3 = false;
            }
        }
        if (z && !this.mb) {
            gm.V2(getParentActivity(), this.classGuid);
        }
    }

    public final void ib() {
        ah7 j;
        wv1 wv1Var = this.Ba;
        if (wv1Var != null) {
            Drawable l = wv1Var.l();
            if (this.fragmentView != null) {
                l = this.m1.getBackgroundImage();
            }
            if (l instanceof a92) {
                l = ((a92) l).c(true);
            }
            if (l instanceof ah7) {
                ((ah7) l).v(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof m37) && (j = ((m37) themedDrawable).j()) != null) {
                j.v(false);
            }
        }
    }

    public final void ic(boolean z) {
        if (this.n3 != null && !b8()) {
            if (this.n3.getTag() == null) {
                ValueAnimator valueAnimator = this.w3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.n3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x3, 1.0f);
                this.w3 = ofFloat;
                ofFloat.setDuration(150L);
                this.w3.addUpdateListener(new em1(this, (byte) 2));
                this.w3.addListener(new yq1(this, (byte) 6));
                this.w3.start();
            }
            if (!z) {
                Q7();
                this.p3 = (short) 1000;
            }
        }
    }

    public final void id(boolean z) {
        boolean z2;
        int i;
        if (getParentActivity() == null) {
            return;
        }
        if (this.B1 > 0 && ((i = this.g4) == 0 || i == 8)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y1.e(4, z2, z);
        this.y1.c(4, this.B1, z);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z;
        int w0;
        if (c8()) {
            ylb resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w0 = resourceProvider.f(cmb.v8);
            } else {
                w0 = cmb.w0(null, cmb.v8, true);
            }
            if (on2.h(w0) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z = cmb.I.o();
        } else {
            z = this.rc;
        }
        return !z;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        oyb oybVar;
        jt1 jt1Var;
        xz8 xz8Var;
        if ((this.g4 == 5 && (this.M6.isEmpty() || this.s4 == 0)) || (((oybVar = this.n0) != null && (oybVar.y > 0.0f || oybVar.c0)) || this.y9 || this.rd.f || !this.K9 || (((jt1Var = this.cb) != null && jt1Var.s) || ((xz8Var = this.ua) != null && xz8Var.a())))) {
            return false;
        }
        return true;
    }

    public final void j5() {
        qs1 qs1Var;
        ps1 ps1Var;
        ps1 ps1Var2;
        ms1 ms1Var = this.a0;
        if (ms1Var != null && ms1Var.p4) {
            MediaController.w().O = false;
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !sd2.v(chat)) {
            MediaController.w().O = false;
        } else if (!a.x && (((qs1Var = this.d1) == null || qs1Var.getVisibility() != 0) && (((ps1Var = this.T) == null || ps1Var.getVisibility() != 0) && ((ps1Var2 = this.g3) == null || ps1Var2.getVisibility() != 0)))) {
            MediaController.w().O = true;
        } else {
            MediaController.w().O = false;
        }
    }

    public final ArrayList j6(k47 k47Var, boolean z) {
        ArrayList u = td4.u(k47Var);
        int e1 = k47Var.e1();
        k47Var.A0();
        if (e1 != 0) {
            ArrayList arrayList = this.M6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k47 k47Var2 = (k47) arrayList.get(size);
                if ((k47.B0(k47Var2.k) != this.d7 || k47.B0(k47Var.k) == this.d7) && (((this.h == null && k47Var2.e1() > e1) || (this.h != null && k47Var2.e1() < e1)) && ((k47.Q4(k47Var2.k) || k47Var2.g4()) && !k47Var2.R4() && !k47Var2.f4() && (!z || (k47Var2.k.media_unread && !k47Var2.N3()))))) {
                    u.add(k47Var2);
                }
            }
        }
        return u;
    }

    public final pv1 j7() {
        pv1 pv1Var = this.gd;
        if (pv1Var == null) {
            pv1 pv1Var2 = new pv1(this);
            this.gd = pv1Var2;
            return pv1Var2;
        }
        return pv1Var;
    }

    public final boolean j8() {
        if (this.m4 != null) {
            return true;
        }
        return false;
    }

    public final void j9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = oc7.r1(this.currentAccount).n1(user.id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mp1(this, tL_attachMenuBot, user, (byte) 0), 66);
    }

    public final void ja() {
        this.R4 = true;
        nu1 nu1Var = this.u9;
        gm.r(nu1Var.f0);
        nu1Var.z = false;
        mz mzVar = new mz(this, (byte) 12);
        int i = this.V7;
        if (i != 0) {
            sb(i, 0, false, this.U7 ? 1 : 0, true, 0, null, null, mzVar);
            return;
        }
        int i2 = this.T7;
        if (i2 > 0) {
            sb(i2, 0, true, this.U7 ? 1 : 0, true, 0, null, null, mzVar);
            return;
        }
        rb(!this.Kb, mzVar);
        this.Kb = false;
        if (!this.V4.isEmpty()) {
            this.c5 = true;
            this.b5 = ((Integer) this.V4.get(0)).intValue();
        }
    }

    public final void jb() {
        boolean z;
        k47 k47Var;
        CharSequence charSequence;
        boolean z2;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j;
        qs1 qs1Var;
        ms1 ms1Var = this.a0;
        if (ms1Var != null && ms1Var.t2) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.m5 && ms1Var != null && (qs1Var = this.d1) != null && qs1Var.getVisibility() != 0) {
            k47Var = this.F5;
            charSequence = gm.m1(this.a0.getDraftMessage());
            z = this.a0.O3;
        } else {
            z = true;
            k47Var = null;
            charSequence = null;
        }
        if (this.E5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        hs6 mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && gm.W0(encryptedChat.layer) < 101) {
            z2 = false;
        } else {
            z2 = true;
        }
        ArrayList Y = mediaDataController.Y(charSequenceArr, z2, false);
        long O5 = O5(k47Var);
        TLRPC.DraftMessage T = getMediaDataController().T(this.l6, O5);
        if (T != null) {
            richMessage = T.rich_message;
        } else {
            richMessage = null;
        }
        hs6 mediaDataController2 = getMediaDataController();
        long j2 = this.l6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (k47Var != null && !k47Var.p && k47Var.j1 == null && !this.E5) {
            message = k47Var.k;
        } else {
            message = null;
        }
        nv1 nv1Var = this.D5;
        v67 v67Var = this.y5;
        if (v67Var != null) {
            suggestedPost = v67Var.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        ms1 ms1Var2 = this.a0;
        if (ms1Var2 != null) {
            j = ms1Var2.getEffectId();
        } else {
            j = 0;
        }
        mediaDataController2.T1(j2, O5, charSequence2, Y, message, nv1Var, suggestedPost2, j, !z, false, richMessage);
    }

    public final boolean jc() {
        ms1 ms1Var = this.a0;
        if (ms1Var != null && ms1Var.getVisibility() == 0) {
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("gifhint", false)) {
                d1.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.t2 == null) {
                    if (!this.t5) {
                        ms1 ms1Var2 = this.a0;
                        if (ms1Var2 != null) {
                            ms1Var2.X();
                            hs6.d0(ms1Var2.R).X0(true, true, false, 0);
                            jz1 jz1Var = ms1Var2.V0;
                            jz1Var.K(false, false);
                            jz1Var.P(false, false);
                            jz1Var.h.x(1, false);
                            return false;
                        }
                    } else {
                        mu1 mu1Var = this.m1;
                        int indexOfChild = mu1Var.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            ms1 ms1Var3 = this.a0;
                            ms1Var3.X();
                            hs6.d0(ms1Var3.R).X0(true, true, false, 0);
                            jz1 jz1Var2 = ms1Var3.V0;
                            jz1Var2.K(false, false);
                            jz1Var2.P(false, false);
                            jz1Var2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232691);
                            int i = indexOfChild + 1;
                            mu1Var.addView(this.L2, i, qoe.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            hg5 x4 = x4(310.0f, 3, i, false);
                            this.t2 = x4;
                            x4.d = 2300L;
                            x4.t(jb6.M0(2131743953, null));
                            this.L2.setAlpha(0.0f);
                            this.L2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.a0.getEmojiButton();
                            if (emojiButton != null) {
                                this.t2.x(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void jd(boolean z) {
        boolean z2;
        int i;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i = this.g4) == 0 || i == 8)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y1.e(3, z2, z);
        this.y1.c(3, this.A1, z);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        boolean z3;
        String str2;
        F6(str, null);
        if (s5()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                y5a b = y5a.b(str, this.l6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b.K = X6();
                z3 = z2;
                b.L = z3;
                b.Q = j2;
                b.R = k7();
                b.T = this.y5;
                a6a.B(this.currentAccount).q0(b);
                str2 = null;
            } else {
                z3 = z2;
                str2 = str;
            }
            getSendMessagesHelper().p0(arrayList3, this.l6, false, false, true, 0, 0, null, -1, j2, k7(), this.y5);
            j5 accountInstance = getAccountInstance();
            a6a.U(i, this.l6, j, j2, k7(), accountInstance, this.D5, null, this.F5, this.m4, this.H5, this.y5, null, X6(), str2, null, arrayList, arrayList, null, arrayList2, null, null, null, z, z3);
            E4();
        }
    }

    public final boolean k5(boolean z, boolean z2) {
        ms1 ms1Var = this.a0;
        if (ms1Var == null || !ms1Var.T0()) {
            return false;
        }
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
            boolean z3 = this.a0.d1;
            he heVar = alertDialog$Builder.a;
            if (z3) {
                heVar.S = jb6.M0(2131751332, null);
                heVar.U = jb6.M0(2131751333, null);
            } else {
                heVar.S = jb6.M0(2131751329, null);
                heVar.U = jb6.M0(2131751330, null);
            }
            alertDialog$Builder.j(jb6.M0(2131751331, null), new s51((byte) 2, this, z2));
            alertDialog$Builder.g(jb6.M0(2131751708, null), null);
            showDialog(heVar);
            return true;
        }
        return true;
    }

    public final void k6(int i, int i2, boolean z) {
        this.D0.N.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.M6;
            if (i3 >= arrayList.size()) {
                break;
            }
            k47 k47Var = (k47) arrayList.get(i3);
            int i4 = k47Var.k.date;
            if (i4 <= i || i4 >= i2) {
                this.D0.N.add(k47Var);
            }
            i3++;
        }
        vr1 vr1Var = this.A0;
        if (vr1Var != null) {
            vr1Var.setEmptyView(null);
        }
        if (this.D0.N.isEmpty()) {
            sc(true);
        }
        hu1 hu1Var = this.D0;
        hu1Var.M = true;
        hu1Var.J(true);
        i6();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.l6, 81, new ep1(this, i, i2, z), new ho1(this, (byte) 26));
    }

    public final long k7() {
        k47 k47Var;
        TLRPC.Message message;
        k47 k47Var2;
        TLRPC.Message message2;
        if (!sd2.p0(this.e) || !sd2.A(this.currentAccount, this.e, 24)) {
            return 0L;
        }
        long j = this.s4;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0 && (k47Var2 = this.H5) != null && (message2 = k47Var2.k) != null) {
            return pg3.n(message2.saved_peer_id);
        }
        if (i == 0 && (k47Var = this.F5) != null && (message = k47Var.k) != null) {
            return pg3.n(message.saved_peer_id);
        }
        return j;
    }

    public final boolean k8() {
        if (d8()) {
            return getMessagesController().E1().e();
        }
        mzb mzbVar = this.g2;
        if (mzbVar == null || !mzbVar.a.f) {
            return false;
        }
        if (!sd2.u0(this.e)) {
            TLRPC.User user = this.f;
            if (!m9c.w(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void k9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            hs6.d0(this.currentAccount).G0(false, true, null);
            la(user.id, this.C8, false);
        }
    }

    public final void kb() {
        rc2 rc2Var = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.A0.getChildCount()) {
                break;
            }
            View childAt = this.A0.getChildAt(i);
            if ((childAt instanceof vf2) && childAt.getBottom() > 0 && childAt.getTop() < this.A0.getHeight()) {
                rc2Var = childAt;
                break;
            }
            if (childAt instanceof rc2) {
                rc2 rc2Var2 = (rc2) childAt;
                int min = Math.min(rc2Var2.getBottom(), this.A0.getHeight()) - Math.max(0, rc2Var2.getTop());
                if (min > i2) {
                    rc2Var = rc2Var2;
                    i2 = min;
                }
            }
            i++;
        }
        if (rc2Var != null) {
            yr1 yr1Var = this.C0;
            this.A0.getClass();
            yr1Var.h1(RecyclerView.R(rc2Var), rc2Var.getTop() - ((int) this.P9), false);
        }
    }

    public final void kc() {
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                gm.d3(new mz(this, (byte) 18), 1000L);
            }
        }
    }

    public final void kd(boolean z) {
        String M0;
        if (this.g4 != 3 && !m9c.w(this.f)) {
            pr1 pr1Var = this.p1;
            if (pr1Var != null && this.s4 != 0) {
                if (this.x4) {
                    Bd();
                } else {
                    boolean z2 = this.v4;
                    k47 k47Var = this.m4;
                    if (z2) {
                        if (k47Var != null && k47Var.x2()) {
                            this.p1.setTitle(jb6.G(this.m4.M1(), "Comments", new Object[0]));
                        } else {
                            this.p1.setTitle(jb6.M0(2131751933, null));
                        }
                    } else if (k47Var != null) {
                        pr1Var.setTitle(jb6.G(k47Var.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.q4 != null) {
                if (this.m4.M1() == 0) {
                    if (this.v4) {
                        M0 = jb6.M0(2131747960, null);
                    } else {
                        M0 = jb6.M0(2131747902, null);
                    }
                } else {
                    M0 = jb6.M0(2131751312, null);
                }
                k47 k47Var2 = this.q4;
                k47Var2.k.message = M0;
                k47Var2.v = M0;
                if (z) {
                    this.D0.M(k47Var2, true, false);
                }
            }
        }
    }

    public final void l5() {
        if (!this.Gc) {
            this.Gc = true;
            if (!this.Hc && this.g4 == 0 && !getMessagesController().E1().b && getMessagesController().E1().c() > 2) {
                if (this.K1 != null && oc7.d1().getInt("savedhint", 0) < 1) {
                    this.K1.v();
                    this.Hc = true;
                    oc7.d1().edit().putInt("savedhint", oc7.d1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", oc7.d1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && oc7.d1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.v();
                    this.Hc = true;
                    oc7.d1().edit().putInt("savedsearchhint", oc7.d1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    m5();
                }
            }
        }
    }

    public final void l6(rc2 rc2Var, k47 k47Var, CharacterStyle characterStyle, final String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        int i;
        boolean z5;
        CharacterStyle characterStyle2;
        boolean z6;
        rc2 rc2Var2;
        int i2;
        TLRPC.WebPage webPage;
        int i3;
        int i4;
        k47 k47Var2 = k47Var;
        final tv0 tv0Var = new tv0(this, k47Var2, characterStyle, (byte) 26);
        bu5 J = bu5.J(this, rc2Var);
        vs9 vs9Var = new vs9(getParentActivity(), this.Ba);
        J.p = new hm1(vs9Var, (byte) 0);
        if (!str.startsWith("video?") && !l11.g(Uri.parse(str), false, null)) {
            z = true;
        } else {
            z = false;
        }
        boolean P2 = getMessagesController().P2(str);
        if (P2 && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!str.startsWith("#") && !str.startsWith("$")) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean startsWith = str.startsWith("mailto:");
        if (startsWith) {
            str2 = "mailto:";
            z4 = z;
            i = 2131232271;
            z5 = z3;
            characterStyle2 = characterStyle;
            z6 = z2;
            rc2Var2 = rc2Var;
        } else {
            if (z2 && !z3) {
                i3 = 2131231930;
            } else {
                i3 = 2131232271;
            }
            if (z2 && !z3) {
                i4 = 2131747524;
            } else {
                i4 = 2131747550;
            }
            String M0 = jb6.M0(i4, null);
            z4 = z;
            i = 2131232271;
            str2 = "mailto:";
            q97 q97Var = new q97(this, str, characterStyle, k47Var2, rc2Var, z2, z3, tv0Var, (byte) 1);
            z5 = z3;
            characterStyle2 = characterStyle;
            k47Var2 = k47Var2;
            z6 = z2;
            rc2Var2 = rc2Var;
            J.b(i3, M0, q97Var, false);
        }
        if ((z6 && !z5) || startsWith) {
            J.b(i, jb6.M0(2131747526, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r1;
                    String str3 = str;
                    tv0 tv0Var2 = tv0Var;
                    yv1 yv1Var = this;
                    switch (b) {
                        case 0:
                            yv1Var.S8(tv0Var2, str3);
                            return;
                        default:
                            yv1Var.T8(tv0Var2, str3);
                            return;
                    }
                }
            }, false);
        } else if (!startsWith && !z5 && !z6 && z4 && !P2) {
            J.b(2131231930, jb6.M0(2131747524, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r1;
                    String str3 = str;
                    tv0 tv0Var2 = tv0Var;
                    yv1 yv1Var = this;
                    switch (b) {
                        case 0:
                            yv1Var.S8(tv0Var2, str3);
                            return;
                        default:
                            yv1Var.T8(tv0Var2, str3);
                            return;
                    }
                }
            }, false);
        }
        TLRPC.MessageMedia m1 = k47.m1(k47Var2);
        if ((m1 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m1.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            J.b(2131231839, jb6.M0(2131747523, null), new jm1(this, k47Var2, (byte) 0), false);
        }
        if (z5) {
            i2 = 2131751700;
        } else if (startsWith) {
            i2 = 2131751698;
        } else {
            i2 = 2131751699;
        }
        J.b(2131232109, jb6.M0(i2, null), new rh(this, str, k47Var2, startsWith, (byte) 4), false);
        if (P2 && !z5 && !startsWith && !str.startsWith("tg:")) {
            J.b(2131232521, jb6.M0(2131742604, null), new lm1(this, str, (byte) 0), false);
        }
        vs9Var.e(J);
        if (str.startsWith(str2)) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            vs9Var.f(rc2Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof i6c) {
            String d = l11.d(((i6c) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204).concat("…");
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            vs9Var.f(rc2Var2, characterStyle2, spannableString2, false);
        } else {
            vs9Var.f(rc2Var2, characterStyle2, null, false);
        }
        showDialog(vs9Var);
    }

    public final int l7() {
        return this.m1.getBackgroundSizeY();
    }

    public final void l8(int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        int i4;
        ArrayList arrayList = this.M6;
        if (!arrayList.isEmpty()) {
            k47 k47Var = (k47) b10.f(1, arrayList);
            if ((((k47) arrayList.get(0)).k.date >= i && k47Var.k.date <= i) || (k47Var.k.date >= i && this.U6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    k47 k47Var2 = (k47) arrayList.get(size);
                    if (k47Var2.k.date >= i && k47Var2.e1() != 0) {
                        int e1 = k47Var2.e1();
                        if (k47.B0(k47Var2.k) == this.d7) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        J(e1, 0, i4, 0, false, true);
                        return;
                    }
                }
            } else if (!pg3.B(this.l6)) {
                int M0 = this.C0.M0();
                int K0 = this.C0.K0();
                while (true) {
                    if (K0 <= M0) {
                        hu1 hu1Var = this.D0;
                        int i5 = hu1Var.K;
                        if (K0 >= i5 && K0 < hu1Var.L && (message = ((k47) arrayList.get(K0 - i5)).k) != null) {
                            if (message.date < i) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            if (x()) {
                                i3 ^= 1;
                            }
                            i2 = i3 ^ 1;
                        } else {
                            K0++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                this.o9.m(i2);
                he heVar = this.dc;
                if (heVar != null) {
                    heVar.dismiss();
                }
                fd(false);
                he heVar2 = new he(3, this.Ba, getParentActivity());
                this.dc = heVar2;
                heVar2.setOnCancelListener(this.Ja);
                this.dc.q(1000L);
                int i6 = this.n6;
                this.q9 = i6;
                this.s9 = false;
                this.z6.add(Integer.valueOf(i6));
                this.r9 = 0;
                this.t9 = false;
                oc7 messagesController = getMessagesController();
                long j = this.l6;
                long j2 = this.d7;
                int i7 = this.classGuid;
                int i8 = this.g4;
                long j3 = this.s4;
                int i9 = this.C4;
                int i10 = this.n6;
                this.n6 = i10 + 1;
                messagesController.c3(j, j2, false, 30, 0, i, true, 0, i7, 4, i8, j3, i9, i10, this.x4);
                this.m3.setAlpha(0.0f);
                this.m3.setTag(null);
                this.x3 = 0.0f;
                Tc();
                this.n3.setTag(null);
            }
        }
    }

    public final void l9(TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = oc7.r1(this.currentAccount).n1(user.id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mp1(this, tL_attachMenuBot, user, (byte) 1), 66);
    }

    public final void la(long j, String str, boolean z) {
        ma();
        e51 e51Var = this.Y1;
        if (e51Var != null) {
            e51Var.x1(j, str, z, false);
        }
    }

    public final void lb(defpackage.k47 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.lb(k47):void");
    }

    public final void lc(k47 k47Var, CharSequence charSequence, int i) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        u31 G = c41.b0(this).G(2131623982, 9999, charSequence);
        G.j = max;
        G.w = new wm1(this, i);
        G.k(true);
        this.V3 = k47Var;
        this.W3 = i;
    }

    public final void ld(int i, k47 k47Var) {
        k47 k47Var2;
        SparseArray sparseArray = this.I6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i);
        if (arrayList == null) {
            return;
        }
        if (k47Var == null) {
            k47Var2 = new k47(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            k47Var2 = null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k47 k47Var3 = (k47) this.G6[0].get(((Integer) arrayList.get(i2)).intValue());
            if (k47Var3 != null) {
                if (k47Var == null) {
                    k47Var3.C = k47Var2;
                } else {
                    k47Var3.C = k47Var;
                }
                hu1 hu1Var = this.D0;
                if (hu1Var != null) {
                    hu1Var.M(k47Var3, true, false);
                }
            }
        }
        if (k47Var == null) {
            sparseArray.remove(i);
        }
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        F6(((z5a) arrayList.get(0)).d, ((z5a) arrayList.get(0)).i);
        a6a.W(getAccountInstance(), arrayList, this.l6, this.F5, this.m4, null, this.D5, true, false, this.H5, null, z, i, 0, ((z5a) arrayList.get(0)).t, null, X6(), 0L, false, j, k7(), this.y5, null, false);
        E4();
        if (i != 0) {
            int i2 = this.h4;
            if (i2 == -1) {
                this.h4 = 0;
                i2 = 0;
            }
            this.h4 = arrayList.size() + i2;
            md(true);
        }
    }

    public final void m5() {
        rc2 rc2Var;
        hg5 hg5Var;
        boolean z;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        hg5 hg5Var2 = this.M1;
        if (hg5Var2 != null && !hg5Var2.W && !this.Jc && this.Gc && !this.rd.f && System.currentTimeMillis() - this.Ic > 1800 && oc7.d1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof rc2) {
                        rc2Var = (rc2) childAt;
                        l39 l39Var = rc2Var.O;
                        k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.k) == null || (tL_messageReactions = message.reactions) == null) {
                            z = false;
                        } else {
                            z = tL_messageReactions.reactions_as_tags;
                        }
                        if (z && !l39Var.s.isEmpty()) {
                            rc2Var.getLocationInWindow(iArr);
                            float f = iArr[1] + l39Var.c;
                            if (f >= gm.L(240.0f) && f <= (gm.q.y - gm.L(25.0f)) - gm.n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    rc2Var = null;
                    break;
                }
            }
            if (rc2Var != null) {
                l39 l39Var2 = rc2Var.O;
                this.Jc = true;
                rc2Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - hg5Var.getTop()) - gm.L(120.0f)) + l39Var2.c);
                this.M1.o(0.0f, (((i39) l39Var2.s.get(0)).z / 2.0f) + (-gm.L(16.0f)) + iArr[0] + l39Var2.b);
                this.M1.v();
                oc7.d1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            gm.r(new mz(this, (byte) 25));
            gm.d3(new mz(this, (byte) 25), 2000L);
        }
    }

    public final void m6(CharacterStyle characterStyle, boolean z, k47 k47Var, rc2 rc2Var) {
        Object[] objArr;
        int i;
        TLRPC.WebPage webPage;
        boolean z2;
        int i2;
        k47 k47Var2;
        k47 k47Var3;
        k47 k47Var4;
        TLRPC.WebPage webPage2;
        k47 k47Var5;
        rc2 rc2Var2;
        k47 messageObject;
        ArrayList arrayList;
        f47 f47Var;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z3 = true;
            boolean z4 = true;
            char c = 1;
            char c2 = 1;
            if (!a8() && (k47Var == null || (message = k47Var.k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            rc2 rc2Var3 = null;
            if (characterStyle instanceof f6c) {
                if (objArr == null || a() == 489000) {
                    f6c f6cVar = (f6c) characterStyle;
                    gm.g(f6cVar.a.subSequence(f6cVar.b, f6cVar.c).toString());
                    i6();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z && rc2Var != null) {
                    rc2Var.i3(-1);
                }
            } else if (characterStyle instanceof j6c) {
                TLRPC.User W1 = getMessagesController().W1(Utilities.A(((j6c) characterStyle).getURL()));
                if (W1 != null) {
                    oc7.r1(this.currentAccount).D3(W1, null, this, 0);
                }
                if (z && rc2Var != null) {
                    rc2Var.i3(-1);
                }
                Y9(k47Var, false, false);
            } else if (characterStyle instanceof jo4) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((jo4) characterStyle).b;
                if (tL_messageEntityFormattedDate == null || (messageObject = rc2Var.getMessageObject()) == null) {
                    rc2Var2 = rc2Var;
                } else {
                    if (messageObject.c1() != 0 && (f47Var = (f47) this.P6.f(messageObject.c1())) != null) {
                        arrayList = f47Var.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = td4.u(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e = getUserConfig().e();
                    String A = jb6.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    bu5 J = bu5.J(this, rc2Var);
                    vs9 vs9Var = new vs9(getParentActivity(), this.Ba);
                    J.p = new hm1(vs9Var, (byte) 0);
                    J.b(2131232109, jb6.M0(2131746065, null), new nm1(this, vs9Var, A, (byte) 0), false);
                    rc2Var2 = rc2Var;
                    J.b(2131232083, jb6.M0(2131746066, null), new ja7(this, J, messageObject, rc2Var, A, tL_messageEntityFormattedDate, vs9Var, (byte) 5), false);
                    J.b(2131232268, jb6.M0(2131746064, null), new om1(this, J, e, tL_messageEntityFormattedDate, arrayList2, vs9Var, (byte) 0), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    vs9Var.e(J);
                    vs9Var.f(rc2Var2, characterStyle, spannableString, false);
                    showDialog(vs9Var);
                }
                if (rc2Var2 != null) {
                    rc2Var2.i3(-1);
                }
            } else if (characterStyle instanceof g6c) {
                String url = ((g6c) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    n6(rc2Var, characterStyle, url.substring(4));
                    if (z && rc2Var != null) {
                        rc2Var.i3(-1);
                        return;
                    }
                    return;
                }
                SparseArray[] sparseArrayArr = this.G6;
                if (k47Var != null) {
                    if (url.startsWith("/")) {
                        if (d6c.h) {
                            ms1 ms1Var = this.a0;
                            TLRPC.Chat chat = this.e;
                            if (chat == null || !chat.megagroup) {
                                z4 = false;
                            }
                            ms1Var.E1(k47Var, url, z, z4);
                            if (!z && this.a0.getFieldText() == null) {
                                E7(false);
                            }
                        }
                        if (z && rc2Var != null) {
                            rc2Var.i3(-1);
                            return;
                        }
                        return;
                    } else if (url.startsWith("video") && !z) {
                        int intValue = Utilities.z(url).intValue();
                        if (k47Var.d5()) {
                            webPage2 = k47Var.k.media.webpage;
                            k47Var4 = k47Var;
                        } else {
                            k47 k47Var6 = k47Var.C;
                            if (k47Var6 != null && k47Var6.d5()) {
                                k47Var4 = k47Var.C;
                                webPage2 = k47Var4.k.media.webpage;
                            } else {
                                k47Var4 = k47Var;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            zv3.I0(this, k47Var4, this.db, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, Y7());
                            return;
                        }
                        if (!k47.K4(k47Var4.k) && (k47Var5 = k47Var4.C) != null) {
                            if (k47.B0(k47Var5.k) == this.l6) {
                                c = 0;
                            }
                            k47 k47Var7 = (k47) sparseArrayArr[c].get(k47Var4.C.e1());
                            if (k47Var7 == null) {
                                k47Var4 = k47Var4.C;
                            } else {
                                k47Var4 = k47Var7;
                            }
                        } else {
                            rc2Var3 = rc2Var;
                        }
                        k47Var4.c0 = intValue / ((float) k47Var4.L0());
                        wa(rc2Var3, k47Var4);
                        return;
                    }
                }
                if (k47Var != null && url.startsWith("audio")) {
                    int intValue2 = Utilities.z(url).intValue();
                    if (!k47Var.I3() && (k47Var3 = k47Var.C) != null) {
                        if (k47.B0(k47Var3.k) == this.l6) {
                            c2 = 0;
                        }
                        k47Var2 = (k47) sparseArrayArr[c2].get(k47Var.C.e1());
                    } else {
                        k47Var2 = k47Var;
                    }
                    if (k47Var2 != null) {
                        float f = intValue2;
                        float L0 = f / ((float) k47Var2.L0());
                        MediaController mediaController = getMediaController();
                        if (mediaController.D(k47Var2)) {
                            k47Var2.b0 = L0;
                            mediaController.h0(k47Var2, L0);
                            if (mediaController.C()) {
                                mediaController.R(k47Var2);
                            }
                        } else {
                            k47Var2.c0 = f / ((float) k47Var2.L0());
                            mediaController.R(k47Var2);
                        }
                        if (z && rc2Var != null) {
                            rc2Var.i3(-1);
                        }
                        if (!k47.Q4(k47Var2.k)) {
                            showDialog(new i30(getParentActivity(), this.Ba));
                        }
                    }
                } else if (url.startsWith("tonaddress:")) {
                    String substring = url.substring(11);
                    c C = c.C(this.currentAccount);
                    boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                    TLRPC.User[] userArr = new TLRPC.User[1];
                    b5a b5aVar = new b5a(this, rc2Var, isValidAddress, substring, userArr, characterStyle);
                    if (isValidAddress) {
                        br1 Z9 = Z9(rc2Var, characterStyle);
                        boolean[] zArr = {false};
                        if (Z9 != null) {
                            Z9.b = new rm1(zArr, (byte) 0);
                            Z9.d();
                        }
                        C.h0(new sm1(this, zArr, Z9, userArr, b5aVar, (byte) 0), substring);
                    } else {
                        b5aVar.run();
                    }
                    if (rc2Var != null) {
                        rc2Var.i3(-1);
                    }
                } else if (url.startsWith("card:")) {
                    String substring2 = url.substring(5);
                    br1 Z92 = Z9(rc2Var, characterStyle);
                    TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                    tL_payments_getBankCardData.number = substring2;
                    Z92.b = new vm1(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new fo0(this, Z92, rc2Var, substring2, characterStyle, (byte) 3), null, null, 0, getMessagesController().r3, 1, true), (byte) 2);
                    Z92.d();
                    rc2Var.i3(-1);
                } else {
                    oa(characterStyle, url, z, rc2Var, k47Var);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    n6(rc2Var, characterStyle, url2.substring(4));
                } else if (z) {
                    l6(rc2Var, k47Var, characterStyle, url2);
                    if (rc2Var != null) {
                        rc2Var.i3(-1);
                    }
                } else {
                    Y9(k47Var, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        l11.u(parentActivity, url2);
                        return;
                    }
                    boolean z5 = characterStyle instanceof i6c;
                    if ((z5 && (url2 == null || !url2.startsWith("mailto:"))) || gm.D3(url2)) {
                        if (k47Var != null) {
                            i2 = k47Var.e1();
                        } else {
                            i2 = 0;
                        }
                        if (ta(url2, rc2Var, characterStyle, i2, 1)) {
                            return;
                        }
                    } else {
                        if (k47Var != null) {
                            TLRPC.MessageMedia messageMedia = k47Var.k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = k47Var.k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || l11.j(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    ia4.f.N(url2);
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var) == null) {
                                        createArticleViewer(false).L(k47Var, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (k47Var != null) {
                            i = k47Var.e1();
                        } else {
                            i = 0;
                        }
                        if (!ta(url2, rc2Var, characterStyle, i, 1)) {
                            z3 = z5;
                        } else {
                            return;
                        }
                    }
                    if (l11.A(url2)) {
                        z2 = false;
                    } else {
                        z2 = z3;
                    }
                    Oa(2, url2, characterStyle, rc2Var, z2);
                }
            }
        }
    }

    public final float m7(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.m1.getBackgroundTranslationY()) - ((1.0f - this.U9) * this.P9);
    }

    public final void m8(m8 m8Var) {
        if (Build.VERSION.SDK_INT >= 30 && m8Var != null && m8Var.isShowing()) {
            View contentView = m8Var.getContentView();
            View rootView = contentView.getRootView();
            final boolean[] zArr = new boolean[1];
            final da7 da7Var = new da7(this, rootView, zArr, m8Var, contentView, (byte) 18);
            rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zArr[0] = false;
                    view.post(da7Var);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
            rootView.addOnLayoutChangeListener(new ol1(da7Var, (byte) 1));
            rootView.requestApplyInsets();
        }
    }

    public final void m9(TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            oc7.r1(this.currentAccount).d4(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (h() != null) {
                tLObject2 = h();
            } else {
                tLObject2 = this.e;
            }
            if (!hs6.v(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = this.f;
                if (user2 != null && user2.bot && user.id == tL_attachMenuBot.bot_id) {
                    mlb.y(null, 2131753069, c41.b0(this), null);
                } else if (user2 != null && user2.bot && user.id != tL_attachMenuBot.bot_id) {
                    mlb.y(null, 2131753072, c41.b0(this), null);
                } else if (user2 != null && !user2.bot) {
                    mlb.y(null, 2131753068, c41.b0(this), null);
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !sd2.V(chat)) {
                        mlb.y(null, 2131753070, c41.b0(this), null);
                        return;
                    }
                    TLRPC.Chat chat2 = this.e;
                    if (chat2 != null && sd2.V(chat2)) {
                        mlb.y(null, 2131753071, c41.b0(this), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                la(user.id, this.C8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                yy yyVar = new yy(getParentActivity());
                yyVar.setColor(cmb.w0(null, cmb.ha, false));
                anb.h(cmb.K5, null, yyVar);
                yyVar.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                he heVar = alertDialog$Builder.a;
                heVar.W = yyVar;
                heVar.U = gm.S2(jb6.a0("BotRequestAttachPermission", null, 2131752949, m9c.r(user)));
                alertDialog$Builder.j(jb6.M0(2131753118, null), new lu(this, user, atomicBoolean, tL_attachMenuBot, (byte) 4));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    oh2 oh2Var = new oh2(5, getResourceProvider(), getParentActivity());
                    oh2Var.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
                    oh2Var.setBackground(cmb.L0(false));
                    oh2Var.setMultiline(true);
                    oh2Var.e(gm.S2(jb6.a0(null, null, 2131747513, m9c.r(user))), "", true, false, false);
                    if (jb6.a0) {
                        L = gm.L(16.0f);
                    } else {
                        L = gm.L(8.0f);
                    }
                    if (jb6.a0) {
                        L2 = gm.L(8.0f);
                    } else {
                        L2 = gm.L(16.0f);
                    }
                    oh2Var.setPadding(L, 0, L2, 0);
                    oh2Var.setOnClickListener(new rc1(oh2Var, atomicBoolean, (byte) 8));
                    heVar.H = (byte) 6;
                    alertDialog$Builder.n(oh2Var);
                }
                alertDialog$Builder.o();
            } else {
                quc.a(getParentActivity(), new iu(this, user, tL_attachMenuBot, (byte) 9), null);
            }
        }
    }

    public final void ma() {
        boolean z;
        boolean z2;
        if (getParentActivity() != null) {
            ms1 ms1Var = this.a0;
            if (ms1Var == null || TextUtils.isEmpty(ms1Var.getSlowModeTimer())) {
                ms1 ms1Var2 = this.a0;
                if (ms1Var2 != null && ms1Var2.q7.f) {
                    z = true;
                } else {
                    z = false;
                }
                S5();
                e51 e51Var = this.Y1;
                if (!z && this.g4 != 9) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                e51Var.O3 = z2;
                e51Var.d2.h0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.y5 == null) && !z && this.g4 != 9) {
                    if (chat != null && !sd2.N(chat) && this.e.slowmode_enabled) {
                        this.Y1.t1(10, true);
                    } else {
                        this.Y1.t1(-1, true);
                    }
                } else {
                    this.Y1.t1(1, true);
                }
                e51 e51Var2 = this.Y1;
                e51Var2.P2 = true;
                e51Var2.u3.setVisibility(0);
                e51Var2.N2 = (byte) 0;
                e51Var2.z1 = false;
                e51Var2.A1 = false;
                e51Var2.c2 = true;
                e51Var2.D1 = null;
                r7 r7Var = e51Var2.h3;
                if (r7Var != null) {
                    e51Var2.g3.setTranslationY(0.0f);
                    r7Var.setVisibility(8);
                }
                this.Y1.Z0();
                this.Y1.U0().setText(this.a0.getFieldText());
                e51 e51Var3 = this.Y1;
                e51Var3.s1 = this.Ba;
                showDialog(e51Var3);
            }
        }
    }

    public final void mb(long j) {
        yr1 yr1Var;
        k47 messageObject;
        int i7;
        int abs;
        int i = -1;
        if (this.A0 != null && (yr1Var = this.C0) != null && yr1Var.y < 0) {
            int i2 = 0;
            if (this.W6[0] && yr1Var.K0() == 0) {
                this.F7 = -1;
                return;
            }
            int i3 = Integer.MAX_VALUE;
            for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof rc2) && (messageObject = ((rc2) childAt).getMessageObject()) != null && messageObject.Y1() == j && (abs = Math.abs((i7 = i7(childAt)))) < i3) {
                    i = messageObject.e1();
                    i2 = i7;
                    i3 = abs;
                }
            }
            this.F7 = i;
            this.G7 = i2;
            return;
        }
        this.F7 = -1;
    }

    public final void mc(boolean z) {
        boolean z2;
        q02 q02Var = this.y1;
        if (q02Var != null) {
            if (z && !sd2.p0(this.e)) {
                z2 = true;
            } else {
                z2 = false;
            }
            q02Var.e(2, z2, true);
            if (!z) {
                this.T7 = 0;
            }
        }
    }

    public final void md(boolean z) {
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            ms1Var.z2(z);
        }
    }

    @Override
    public final boolean n() {
        return this.O9;
    }

    public final void n5(boolean z) {
        int i;
        if (this.C0 != null && !this.I5 && !this.D0.M && !this.x7) {
            final int i2 = 0;
            int i3 = -1;
            final int i4 = -1;
            for (int i5 = 0; i5 < this.A0.getChildCount(); i5++) {
                int R = RecyclerView.R(this.A0.getChildAt(i5));
                if (R != -1) {
                    if (i4 == -1 || R < i4) {
                        i4 = R;
                    }
                    if (i3 == -1 || R > i3) {
                        i3 = R;
                    }
                    i2++;
                }
            }
            hu1 hu1Var = this.D0;
            if (hu1Var.O) {
                int i6 = hu1Var.F;
                if (i6 >= 0 && i4 >= 0 && i6 >= i4 && i6 <= i3) {
                    getMediaDataController().Q0();
                    return;
                }
                return;
            }
            final int b = hu1Var.b();
            if (z) {
                i = 25;
            } else {
                i = 5;
            }
            final int i7 = i;
            if (this.g4 == 7) {
                if ((b - i4) - i2 <= i7 && !this.Y6 && !this.U6[0]) {
                    this.Y6 = true;
                    this.z6.add(Integer.valueOf(this.n6));
                    af5 a = af5.a(this.currentAccount);
                    String str = this.J3;
                    int i8 = this.classGuid;
                    int i9 = this.d4;
                    int i10 = this.n6;
                    this.n6 = i10 + 1;
                    a.e(i8, i9, i10, str);
                    return;
                }
                return;
            }
            gm.c3(new Runnable() {
                @Override
                public final void run() {
                    yv1.this.p8(b, i4, i2, i7);
                }
            });
        }
    }

    public final void n6(rc2 rc2Var, CharacterStyle characterStyle, String str) {
        br1 Z9 = Z9(rc2Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().l0.get(r58.h(str, false));
        hv0 hv0Var = new hv0(this, rc2Var, str, tL_contact, characterStyle, (byte) 3);
        if (tL_contact != null) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(tL_contact.user_id));
            if (W1 != null) {
                hv0Var.a(W1);
                return;
            } else {
                getMessagesStorage().a.c(new tv0(this, tL_contact, hv0Var, (byte) 27));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = r58.h(str, false);
        Z9.b = new vm1(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new eo0(this, Z9, hv0Var, (byte) 15)), (byte) 0);
        Z9.d();
    }

    public final float n7() {
        mzb mzbVar = this.g2;
        if (mzbVar != null) {
            return mzbVar.getSideMenuT();
        }
        return 0.0f;
    }

    public final boolean n8(org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.n8(org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public final void n9(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = oc7.r1(this.currentAccount).n1(user.id);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new pm(this, user, (byte) 14));
                }
            }
        }
    }

    public final void na() {
        hx2.e().T = null;
        if (getParentActivity() == null) {
            return;
        }
        S5();
        this.Y1.d2.h0();
        this.Y1.t1(1, false);
        e51 e51Var = this.Y1;
        e51Var.R3 = true;
        e51Var.Q0(null);
        this.Y1.Z0();
        e51 e51Var2 = this.Y1;
        e51Var2.s1 = this.Ba;
        if (this.visibleDialog != null) {
            e51Var2.show();
        } else {
            showDialog(e51Var2);
        }
    }

    public final void nb() {
        int i;
        int i2;
        vr1 vr1Var = this.A0;
        if (vr1Var != null && this.C0 != null) {
            for (int childCount = vr1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                i2 = RecyclerView.R(childAt);
                if (i2 >= 0) {
                    if (childAt instanceof rc2) {
                        if (((rc2) childAt).getCurrentMessagesGroup() == null) {
                            i = i7(childAt);
                            break;
                        }
                    } else if (childAt instanceof cm1) {
                        i = i7(childAt);
                        break;
                    }
                }
            }
        }
        i = 0;
        i2 = -1;
        if (i2 >= 0) {
            this.C0.g1(i2, i);
        }
    }

    public final void nc(boolean z) {
        int i;
        if (this.Z3 != null) {
            fn0 fn0Var = this.rd;
            if (fn0Var.f != z) {
                fn0Var.a(z, true);
                if (!z && this.g4 == 7) {
                    u46 u46Var = (u46) this.a4.getLayoutManager();
                    Object E = this.b4.E((u46Var.M0() + u46Var.K0()) / 2);
                    Object E2 = this.b4.E(u46Var.K0());
                    Object E3 = this.b4.E(u46Var.M0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList G = this.D0.G();
                        int K0 = this.C0.K0();
                        int M0 = this.C0.M0();
                        int i2 = ((k47) E).k.id;
                        int i3 = ((k47) E2).k.id;
                        int i4 = ((k47) E3).k.id;
                        int i5 = -1;
                        boolean z2 = false;
                        boolean z3 = false;
                        for (int i6 = 0; i6 < G.size(); i6++) {
                            if (((k47) G.get(i6)).k.id == i3) {
                                int i7 = this.D0.K + i6;
                                if (K0 <= i7 && M0 >= i7) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    break;
                                }
                            }
                            if (((k47) G.get(i6)).k.id == i4) {
                                int i8 = this.D0.K + i6;
                                if (K0 <= i8 && M0 >= i8) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    break;
                                }
                            }
                            if (((k47) G.get(i6)).k.id == i2) {
                                i5 = i6;
                            }
                        }
                        if (!z2 && !z3 && i5 != -1) {
                            this.C0.g1(this.D0.K + i5, (this.A0.getHeight() - V6((k47) G.get(i5), true)) / 2);
                        }
                    }
                }
                io ioVar = this.k3;
                if (ioVar != null) {
                    if (fn0Var.f) {
                        i = 2131745552;
                    } else {
                        i = 2131745551;
                    }
                    ioVar.c(jb6.M0(i, null), !jb6.a0, true);
                }
                hg5 hg5Var = this.M1;
                if (hg5Var != null && hg5Var.W) {
                    hg5Var.f(true);
                }
                xt1 xt1Var = this.Q1;
                if (xt1Var != null && xt1Var.W) {
                    xt1Var.f(true);
                }
                ms1 ms1Var = this.a0;
                if (ms1Var != null) {
                    ms1Var.I0();
                }
                od();
            }
        }
    }

    public final void nd(int i, int i2, int i3) {
        float f;
        int i4;
        boolean z;
        boolean z2;
        q02 q02Var = this.y1;
        boolean z3 = false;
        if (q02Var != null) {
            int i5 = 2;
            if (this.nb) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            if ((i4 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            q02Var.b(6).c = z;
            mx6 mx6Var = q02Var.e[6];
            if (mx6Var != null) {
                ((bw1) mx6Var.b).b(z, true);
            }
            q02 q02Var2 = this.y1;
            if (this.nb) {
                i5 = 1;
            }
            if ((i & i5) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            q02Var2.b(5).c = z2;
            mx6 mx6Var2 = q02Var2.e[5];
            if (mx6Var2 != null) {
                ((bw1) mx6Var2.b).b(z2, true);
            }
        }
        this.L3 = i3;
        this.M3 = i2;
        od();
        io ioVar = this.k3;
        if (ioVar != null) {
            if (i3 > 0) {
                z3 = true;
            }
            ioVar.setClickable(z3);
            ViewPropertyAnimator animate = this.k3.animate();
            if (i3 > 0) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            animate.alpha(f).start();
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.g4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            d dVar = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((dVar instanceof yv1) && ((yv1) dVar).Y7()) {
                return false;
            }
        }
        if (this.Z6 && !this.tb) {
            return true;
        }
        return false;
    }

    public final void o5(k47 k47Var) {
        if (k47Var.D == 4 && !this.H8) {
            boolean z = gda.a;
            if (!oc7.d1().contains("mapPreviewType")) {
                this.H8 = true;
                ik.p0(getParentActivity(), this.currentAccount, new mz(this, (byte) 13), true, this.Ba);
            }
        }
    }

    public final void o6(defpackage.hg0 r30, final org.telegram.tgnet.TLRPC.ReactionCount r31, boolean r32, float r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.o6(hg0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int o7() {
        return (int) (n7() * gm.L(71.0f));
    }

    public final void o8(boolean z, TLRPC.TL_error tL_error, TLObject tLObject, long j, boolean z2, boolean z3, boolean z4, TLObject tLObject2) {
        int i;
        boolean z5;
        this.rb = false;
        if (!z && (tL_error != null || !(tLObject instanceof TLRPC.Updates))) {
            if (z3) {
                this.sb = false;
            }
            if (tL_error != null) {
                ik.c0(this.currentAccount, tL_error, this, tLObject2, new Object[0]);
            }
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                getMessagesController().d4(updates.users, false);
                getMessagesController().X3(updates.chats, false);
            }
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j));
            if (L0 != null) {
                if (z2 && !z3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                L0.in_news = z5;
                if (z3) {
                    L0.left = true;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(L0);
                getMessagesStorage().j1(null, arrayList, true, true);
                this.e = L0;
            }
            if (z3) {
                getMessagesController().T(3, -j, false);
            }
            getNotificationCenter().k(nm7.Q, Long.valueOf(j));
            getMessagesController().b5(null);
            getNotificationCenter().k(nm7.r, new Object[0]);
            nm7 notificationCenter = getNotificationCenter();
            int i2 = oc7.s5;
            notificationCenter.k(2, 8192);
            if (!isFinishing()) {
                if (z4) {
                    i = 2131752468;
                } else if (z3) {
                    i = 2131752251;
                } else if (z2) {
                    i = 2131752252;
                } else {
                    i = 2131752470;
                }
                Yb(i);
            }
        }
        if (this.E0 != null) {
            Wb(false, true);
            Pc(false);
        }
    }

    public final void o9(java.lang.String r9, android.text.style.CharacterStyle r10, defpackage.k47 r11, defpackage.rc2 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.o9(java.lang.String, android.text.style.CharacterStyle, k47, rc2, int, int):void");
    }

    public final void oa(final CharacterStyle characterStyle, final String str, boolean z, final rc2 rc2Var, final k47 k47Var) {
        TLRPC.Message message;
        if (z) {
            int i = -1;
            if (str.startsWith("@")) {
                if (rc2Var != null) {
                    rc2Var.i3(-1);
                }
                String substring = str.substring(1);
                br1 Z9 = Z9(rc2Var, characterStyle);
                TLObject b2 = getMessagesController().b2(substring);
                sm1 sm1Var = new sm1(this, Z9, rc2Var, substring, characterStyle);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                Z9.b = new vm1(this, getConnectionsManager().sendRequest(checkusername, new fo0(this, b2, sm1Var, substring, Z9, (byte) 4)), (byte) 4);
                Z9.d();
                return;
            } else if (characterStyle == null) {
                my0 my0Var = new my0(1, (ylb) this.Ba, (Context) getParentActivity(), false);
                my0Var.J();
                if (str.startsWith("video?")) {
                    i = Utilities.z(str).intValue();
                }
                final int i2 = i;
                if (i2 >= 0) {
                    my0Var.P = gm.g0(i2, false, false);
                    my0Var.Q = false;
                } else {
                    my0Var.P = l11.d(str, true);
                    my0Var.Q = false;
                    my0Var.R = true;
                }
                CharSequence[] charSequenceArr = (a8() || !(k47Var == null || (message = k47Var.k) == null || !message.noforwards)) ? new CharSequence[]{jb6.M0(2131747550, null)} : new CharSequence[]{jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        yv1.this.o9(str, characterStyle, k47Var, rc2Var, i2, i3);
                    }
                };
                my0Var.M = charSequenceArr;
                my0Var.L = onClickListener;
                my0Var.I0 = new n1(rc2Var, (byte) 12);
                showDialog(my0Var);
                return;
            } else {
                if (rc2Var != null) {
                    rc2Var.i3(-1);
                }
                l6(rc2Var, k47Var, characterStyle, str);
                return;
            }
        }
        Y9(k47Var, false, false);
        String c = l11.c(str);
        if (c != null) {
            String lowerCase = c.toLowerCase();
            if (!sd2.O(lowerCase, this.e) && !m9c.t(lowerCase, this.f)) {
                if (str.startsWith("@")) {
                    getMessagesController().C3(lowerCase, this, 0, Z9(rc2Var, characterStyle));
                    return;
                } else {
                    Oa(0, str, characterStyle, rc2Var, false);
                    return;
                }
            }
            pr1 pr1Var = this.p1;
            if (pr1Var != null) {
                pr1Var.e(false, false);
            } else {
                Pb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Oa(0, str, characterStyle, rc2Var, false);
        } else {
            int i3 = this.g4;
            if (i3 != 1 && i3 != 2 && i3 != 7) {
                if (str.contains("@")) {
                    presentFragment(new re5(str, this.resourceProvider));
                    return;
                } else {
                    sa(str, false);
                    return;
                }
            }
            this.n9.N(str);
            if (this.g4 != 7) {
                finishFragment();
            }
        }
    }

    public final boolean ob() {
        ms1 ms1Var = this.a0;
        if (ms1Var != null && ms1Var.U0() && !this.a0.d1 && !MediaController.w().F()) {
            this.o5 = true;
            ms1 ms1Var2 = this.a0;
            this.p5 = ms1Var2.P;
            this.q5 = ms1Var2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void oc(TLRPC.TL_game tL_game, k47 k47Var, String str, boolean z, long j) {
        String str2;
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
        String str3 = "";
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
            String M0 = jb6.M0(2131689472, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (W1 != null) {
                str3 = bw2.m(0, W1.first_name, W1.last_name);
            }
            heVar.U = jb6.a0(null, null, 2131752971, str3);
            alertDialog$Builder.j(jb6.M0(2131747564, null), new jp1(this, tL_game, k47Var, str, j));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            return;
        }
        String p = m9c.p(W1);
        if (!gm.O1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (W1 == null || TextUtils.isEmpty(p)) {
                        str2 = "";
                    } else {
                        str2 = p;
                    }
                    presentFragment(new uwc(str, str2, tL_game.title, tL_game.short_name, k47Var));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (W1 != null && p != null) {
            str3 = p;
        }
        uwc.a0(str, k47Var, parentActivity, str6, str3);
    }

    public final void od() {
        io ioVar = this.j3;
        if (ioVar != null) {
            boolean z = !jb6.a0;
            int i = this.L3;
            if (i < 0) {
                ioVar.c("", z, true);
            } else if (i == 0) {
                ioVar.c(jb6.M0(2131747901, null), z, true);
            } else if (this.G3) {
                ioVar.c(jb6.G(i, "TaggedMessages", new Object[0]), z, true);
            } else if (this.g4 != 7 && !this.rd.f) {
                ioVar.c(jb6.a0(null, null, 2131747562, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z, true);
            } else {
                ioVar.c(jb6.G(i, "SearchMessagesResultCount", jb6.E(i, ' ')), z, true);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        q qVar;
        he heVar;
        sy1 sy1Var;
        he heVar2;
        py1 py1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        nu1 nu1Var;
        pe2 pe2Var;
        bka bkaVar;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getOpenMenuOverlay() != null) {
            if (z && (bkaVar = this.actionBar.a1) != null) {
                bkaVar.a(true);
                return false;
            }
        } else {
            oyb oybVar = this.n0;
            if (oybVar != null && oybVar.y > 0.0f) {
                if (z) {
                    oybVar.d();
                    return false;
                }
            } else {
                ad adVar = this.bc;
                if (adVar != null && adVar.c.d(adVar)) {
                    if (z) {
                        ad adVar2 = this.bc;
                        wc wcVar = adVar2.E;
                        if (wcVar.a.isFocused()) {
                            gm.t1(wcVar.a);
                        }
                        bka bkaVar2 = adVar2.c;
                        if (bkaVar2.d(adVar2)) {
                            bkaVar2.a(true);
                            return false;
                        }
                    }
                } else {
                    u00 u00Var = this.pb;
                    if (u00Var != null && ((bka) u00Var.d).d(u00Var)) {
                        if (z) {
                            u00 u00Var2 = this.pb;
                            u00Var2.w = null;
                            bka bkaVar3 = (bka) u00Var2.d;
                            if (bkaVar3.d(u00Var2)) {
                                bkaVar3.a(true);
                                return false;
                            }
                        }
                    } else {
                        u31 u31Var = u31.x;
                        if (u31Var != null) {
                            y21 y21Var = u31Var.e;
                            if (y21Var instanceof f31) {
                                if (z) {
                                    ((f31) y21Var).f();
                                    u31Var.b();
                                    return false;
                                }
                            }
                        }
                        tw9 tw9Var = this.wa;
                        if (tw9Var != null && !tw9Var.c0) {
                            if (z) {
                                tw9Var.dismiss();
                                return false;
                            }
                        } else if (hasShownSheet()) {
                            if (z) {
                                closeSheet();
                                return false;
                            }
                        } else {
                            qe2 qe2Var = this.va;
                            if (qe2Var != null && (pe2Var = qe2Var.b) != null && pe2Var.getReactionsWindow() != null) {
                                if (z) {
                                    qe2Var.b.b();
                                    return false;
                                }
                            } else if (hx2.e().E) {
                                if (z) {
                                    hx2.e().c();
                                    return false;
                                }
                            } else {
                                jt1 jt1Var = this.cb;
                                if (jt1Var != null && jt1Var.s) {
                                    if (z) {
                                        jt1Var.a(true);
                                        return false;
                                    }
                                } else if (this.rd.f) {
                                    if (z) {
                                        nc(false);
                                        return false;
                                    }
                                } else if (this.g9 != null) {
                                    if (z) {
                                        N5(true);
                                        return false;
                                    }
                                } else if (!k5(z, false)) {
                                    if (B7()) {
                                        if (z && (nu1Var = this.u9) != null && nu1Var.w()) {
                                            this.u9.e(false);
                                            return false;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                                        if (aVar2 != null && aVar2.y()) {
                                            if (z) {
                                                M5(false);
                                                return false;
                                            }
                                        } else {
                                            ms1 ms1Var = this.a0;
                                            if (ms1Var != null && ms1Var.R0() && (ms1Var.V2 != 1 || (tL_replyKeyboardMarkup = ms1Var.d3) == null || !tL_replyKeyboardMarkup.is_persistent || ms1Var.c3 == null)) {
                                                if (z) {
                                                    this.a0.J0(true);
                                                    return false;
                                                }
                                            } else {
                                                ms1 ms1Var2 = this.a0;
                                                if (ms1Var2 != null && ms1Var2.y()) {
                                                    if (z) {
                                                        ms1 ms1Var3 = this.a0;
                                                        eq0 eq0Var = ms1Var3.m0;
                                                        if (eq0Var != null) {
                                                            eq0Var.setOpened(false);
                                                        }
                                                        if (!ms1Var3.G0() && (py1Var = ms1Var3.n0) != null) {
                                                            py1Var.c();
                                                            return false;
                                                        }
                                                    }
                                                } else {
                                                    ms1 ms1Var4 = this.a0;
                                                    if (ms1Var4 != null && (sy1Var = ms1Var4.F0) != null && (heVar2 = sy1Var.b2) != null && heVar2.isShowing()) {
                                                        if (z) {
                                                            sy1Var.b2.dismiss();
                                                            return false;
                                                        }
                                                    } else if (this.g4 == 6 && (heVar = m51.e) != null && heVar.isShowing()) {
                                                        if (z) {
                                                            m51.e.dismiss();
                                                            return false;
                                                        }
                                                    } else if (sd2.p0(this.e) && !this.i4 && this.g2 != null && d() != 0) {
                                                        if (z) {
                                                            this.g2.k(0L, this.H7);
                                                            return false;
                                                        }
                                                    } else if (this.g4 == 5 && !"hello".equalsIgnoreCase(this.f4) && !"away".equalsIgnoreCase(this.f4) && (this.M6.isEmpty() || this.s4 == 0)) {
                                                        if (z) {
                                                            tc();
                                                            return false;
                                                        }
                                                    } else if (this.g4 == 6 && this.a0.z()) {
                                                        if (z) {
                                                            Xb(new ho1(this, (byte) 16));
                                                            return false;
                                                        }
                                                    } else {
                                                        org.telegram.ui.ActionBar.a aVar3 = this.actionBar;
                                                        if (aVar3 != null && aVar3.o0) {
                                                            if (z) {
                                                                aVar3.o(true);
                                                                return false;
                                                            }
                                                        } else if (this.pd.f) {
                                                            if (z) {
                                                                Ja();
                                                            }
                                                        } else {
                                                            if (z && (qVar = this.q3) != null) {
                                                                qVar.f(false);
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        K7();
        if (!getMessagesController().H3() && getMessagesController().G3 <= 0 && getMessagesController().a4 < 2 && !getUserConfig().p() && (arrayList = this.M6) != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                k47 k47Var = (k47) arrayList.get(i);
                if (k47Var != null && !k47Var.O3() && ((k47.Q4(k47Var.k) || k47Var.g4()) && !k47Var.E4() && (k47Var.k.media_unread || sd2.V(this.e)))) {
                    v0c.v(k47Var, false);
                }
            }
        }
        this.U3 = false;
        L7();
        ArrayList arrayList2 = v0c.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        k11 k11Var = this.oc;
        if (k11Var != null) {
            k11Var.a(false);
            this.oc = null;
        }
        this.T3.g();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.U3 = true;
        super.onBecomeFullyVisible();
        if (this.Q) {
            showDialog(this.P);
        }
        if (this.Mb) {
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.k1();
                ms1 ms1Var2 = this.a0;
                ms1Var2.U0 = false;
                jz1 jz1Var = ms1Var2.V0;
                if (jz1Var != null) {
                    jz1Var.s(false);
                }
            }
            this.Mb = false;
        }
        if (this.K1 != null) {
            gm.d3(new mz(this, (byte) 3), 600L);
        }
        if (this.H4 && !this.I4) {
            this.I4 = true;
            u31 I = c41.b0(this).I(2131623993, jb6.M0(2131743284, null), jb6.M0(2131743286, null));
            I.j = 5000;
            I.w = new mz(this, (byte) 5);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        qe2 qe2Var = this.va;
        if (qe2Var != null && qe2Var.d()) {
            this.va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        k47 k47Var;
        long j;
        long j2;
        long j3;
        pr1 pr1Var = this.p1;
        if (pr1Var != null) {
            ViewTreeObserver viewTreeObserver = pr1Var.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new fq1(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        N5(true);
        if (!gm.O1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C0() || !PhotoViewer.r0().V0()) && (k47Var = MediaController.w().v0) != null && k47.K4(k47Var.k)) {
                    PhotoViewer.r0().T1(null, this, this.Ba);
                    getFileLoader().c0(k47Var.F0(), false);
                    MediaController.w().l(true, true, false, true);
                    PhotoViewer r0 = PhotoViewer.r0();
                    if (k47Var.D != 0) {
                        j = this.l6;
                        j2 = this.d7;
                        j3 = d();
                    } else {
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                    }
                    if (r0.m1(k47Var, null, null, null, null, null, null, 0, this.db, null, j, j2, j3, false, null, null)) {
                        PhotoViewer.r0().k4 = this;
                    }
                    H7(false);
                    MediaController.w().w0 = null;
                }
            } else if (PhotoViewer.C0() && PhotoViewer.r0().m2) {
                PhotoViewer r02 = PhotoViewer.r0();
                if (r02.G2.c0()) {
                    if (r02.Z2) {
                        r02.G2.r0(false);
                    }
                    MediaController w = MediaController.w();
                    ndc ndcVar = r02.G2;
                    k47 k47Var2 = r02.S4;
                    if (ndcVar != null && k47Var2 != null) {
                        int i = k47Var2.K1;
                        bc4.G(i).c0(k47Var2.F0(), true);
                        w.G0 = false;
                        w.m();
                        w.F0 = ndcVar;
                        w.v0 = k47Var2;
                        int i2 = w.n0 + 1;
                        w.n0 = i2;
                        ndcVar.K = new nn6(w, i2, k47Var2, (byte) 1);
                        w.Q0 = false;
                        TextureView textureView = w.H0;
                        if (textureView != null) {
                            ndcVar.z0(textureView);
                        }
                        w.e(k47Var2);
                        w.m0();
                        w.h0 = false;
                        k47 k47Var3 = w.v0;
                        w.v0 = k47Var2;
                        if (!gda.k(true)) {
                            w.v0(w.s);
                        }
                        w.u0(w.v0);
                        nm7.f(i).k(nm7.h2, k47Var2, k47Var3);
                    }
                    r02.G2 = null;
                }
                PhotoViewer.r0().A(false, true);
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        ValueAnimator ofFloat;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int measuredHeight4;
        us1 us1Var = this.ta;
        float f = 0.0f;
        if (z && this.oa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            d dVar = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (dVar instanceof yv1) {
                this.R4 = true;
                yv1 yv1Var = (yv1) dVar;
                yv1Var.qa = this;
                this.fragmentView.setAlpha(0.0f);
                this.m1.setSkipBackgroundDrawing(true);
                this.p1.setTranslationY(gm.L(8.0f));
                this.p1.getAvatarImageView().setAlpha(0.0f);
                this.p1.getAvatarImageView().setTranslationY(-gm.L(8.0f));
                this.pa = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ms1 ms1Var = this.a0;
                if (ms1Var != null) {
                    ms1Var.measure(View.MeasureSpec.makeMeasureSpec(gm.q.x, 1073741824), -2146483649);
                }
                ps1 ps1Var = this.T;
                if (ps1Var != null) {
                    ps1Var.measure(View.MeasureSpec.makeMeasureSpec(gm.q.x, 1073741824), -2146483649);
                }
                ms1 ms1Var2 = this.a0;
                if (ms1Var2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = ms1Var2.getMeasuredHeight();
                }
                ps1 ps1Var2 = this.T;
                if (ps1Var2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = ps1Var2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                ms1 ms1Var3 = yv1Var.a0;
                if (ms1Var3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = ms1Var3.getMeasuredHeight();
                }
                ps1 ps1Var3 = this.T;
                if (ps1Var3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = ps1Var3.getMeasuredHeight();
                }
                this.la = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new pl(this, yv1Var, (byte) 6));
                Rc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.sa = animatorSet;
                animatorSet.addListener(new dr1(this, yv1Var, runnable));
                this.sa.setDuration(300L);
                this.sa.setInterpolator(d53.f);
                this.sa.playTogether(ofFloat2);
                gm.d3(us1Var, 200L);
                return this.sa;
            }
        }
        if (this.Ga && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            d dVar2 = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (dVar2 instanceof sxb) {
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                dVar2.getFragmentView().getWidth();
                if (!z) {
                    f = 1.0f;
                }
                this.Ia = f;
                ofFloat.addUpdateListener(new af0(this, (byte) 2));
                this.Ha = true;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.invalidate();
                }
                mu1 mu1Var = this.m1;
                if (mu1Var != null) {
                    mu1Var.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.sa = animatorSet2;
                animatorSet2.addListener(new er1(this, z, runnable));
                this.sa.setDuration(150L);
                this.sa.playTogether(ofFloat);
                if (z) {
                    gm.d3(us1Var, 200L);
                } else {
                    this.sa.start();
                }
                return this.sa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        he heVar = this.P;
        if (heVar != null && dialog == heVar) {
            getMessagesController().T(0, this.l6, false);
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && !tk5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z;
        fha fhaVar;
        u00 u00Var = this.pb;
        if (u00Var != null) {
            u00Var.w = null;
            bka bkaVar = (bka) u00Var.d;
            if (bkaVar.d(u00Var)) {
                bkaVar.a(false);
            }
        }
        long j = this.l6;
        int[] iArr = v0c.N;
        ArrayList arrayList = new ArrayList(v0c.R.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k47 k47Var = (k47) obj;
            if (k47.B0(k47Var.k) == j) {
                v0c.x(k47Var);
            }
        }
        getMessagesController().C4.remove(Integer.valueOf(this.classGuid));
        super.onFragmentDestroy();
        n02 n02Var = this.c4;
        if (n02Var != null) {
            gm.r(n02Var.f);
            n02Var.I = false;
            ra4 ra4Var = n02Var.h;
            ra4Var.e &= ra4Var.d;
            ra4Var.a();
            ha4 ha4Var = n02Var.G;
            if (ha4Var != null) {
                ha4Var.a.b(false);
                ha4Var.a();
            }
        }
        int i2 = this.currentAccount;
        HashMap hashMap = ia4.a.a;
        if (hashMap.get(Integer.valueOf(i2)) == this) {
            hashMap.remove(Integer.valueOf(i2));
        }
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            ms1Var.d1();
        }
        pr1 pr1Var = this.p1;
        if (pr1Var != null && (fhaVar = pr1Var.d0) != null) {
            fhaVar.b(pr1Var.H);
        }
        es1 es1Var = this.X1;
        if (es1Var != null && es1Var.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        e51 e51Var = this.Y1;
        if (e51Var != null) {
            e51Var.H();
        }
        q qVar = this.q3;
        if (qVar != null) {
            qVar.j();
        }
        hx2 e = hx2.e();
        if (e.l == this.H9) {
            e.W = null;
            e.a0 = null;
            e.Y = null;
            e.l = null;
            e.c0 = null;
            e.j();
        }
        getNotificationCenter().j(this.ca);
        nm7.e().j(this.da);
        getNotificationCenter().j(this.ea);
        getNotificationCenter().j(this.fa);
        L7();
        mz mzVar = this.d6;
        if (mzVar != null) {
            gm.r(mzVar);
            this.d6 = null;
        }
        nm7 notificationCenter = getNotificationCenter();
        ct1 ct1Var = this.Ka;
        notificationCenter.getClass();
        boolean z2 = e21.a;
        if (Thread.currentThread() == a.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(ct1Var)) {
                notificationCenter.o();
            }
            oc7 messagesController = getMessagesController();
            long j2 = this.l6;
            if (this.g4 == 1) {
                z = true;
            } else {
                z = false;
            }
            messagesController.S4(j2, z, false);
            if (this.w4) {
                this.w4 = false;
                getMessagesController().f4(this.l6);
            }
            e7a e7aVar = this.xb;
            if (e7aVar != null) {
                e7aVar.a();
                this.xb = null;
            }
            getNotificationCenter().n(this, nm7.s);
            if (this.g4 == 0 && gm.O1()) {
                getNotificationCenter().k(nm7.h0, Long.valueOf(this.l6), Long.valueOf(d()), Boolean.TRUE);
            }
            if (this.f != null) {
                MediaController w = MediaController.w();
                if (w.T1 == null) {
                    w.T1 = new sw(w, (byte) 9);
                }
                a.d.postDelayed(w.T1, 5000L);
            }
            s34 s34Var = this.T3;
            if (s34Var != null) {
                s34Var.g();
            }
            if (this.f != null) {
                getMessagesController().h1.remove(Long.valueOf(this.f.id));
            }
            gm.y2(getParentActivity(), this.classGuid);
            e51 e51Var2 = this.Y1;
            if (e51Var2 != null) {
                e51Var2.e1();
                this.Y1 = null;
            }
            gm.K3(getParentActivity());
            if (sd2.T(this.e)) {
                getMessagesController().d5(this.e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().d5(getMessagesController().L0(Long.valueOf(this.r8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            nu1 nu1Var = this.u9;
            if (nu1Var != null) {
                nu1Var.e(false);
            }
            xr1 xr1Var = this.B0;
            if (xr1Var != null) {
                xr1Var.N();
            }
            vs1 vs1Var = this.Ta;
            if (vs1Var != null) {
                vs1Var.b();
            }
            this.ya = null;
            tk5 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Ed ? 1 : 0);
                tk5 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i3 = 0;
                    while (i3 < parentLayout2.getPulledDialogs().size()) {
                        if (((ce0) parentLayout2.getPulledDialogs().get(i3)).b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                }
            }
            Ed = false;
            k11 k11Var = this.oc;
            if (k11Var != null) {
                k11Var.a(false);
                this.oc = null;
            }
            bd2 bd2Var = this.Da;
            yv1 yv1Var = bd2Var.a;
            ArrayList arrayList2 = bd2Var.f;
            ArrayList arrayList3 = bd2Var.e;
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                yv1Var.getConnectionsManager().cancelRequest(((Integer) arrayList3.get(i4)).intValue(), false);
            }
            arrayList3.clear();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                yv1Var.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i5)).intValue(), false);
            }
            arrayList2.clear();
            zq8 zq8Var = this.u8;
            if (zq8Var != null) {
                zq8Var.b(true);
                this.u8 = null;
            }
            kta ktaVar = this.id;
            if (ktaVar != null) {
                ktaVar.setMessageCell(null);
                gm.B2(this.id);
                this.id = null;
                return;
            }
            return;
        }
        zo4.k("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Wb = true;
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && k47.K4(k47Var.k)) {
            MediaController.w().l(true, true, false, false);
        } else {
            MediaController.w().o0(this.M8, null, null, false);
        }
        kta ktaVar = this.id;
        if (ktaVar != null) {
            ktaVar.setMessageCell(null);
            gm.B2(this.id);
            this.id = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        e51 e51Var;
        e51 e51Var2;
        boolean z;
        boolean z2;
        boolean z3;
        i22 i22Var;
        ms1 ms1Var = this.a0;
        boolean z4 = false;
        if (ms1Var != null && i == 2 && ms1Var.Z3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                a6a.B(ms1Var.R).n0(ms1Var.Y3, ms1Var.Z3);
            }
            ms1Var.Z3 = null;
            ms1Var.Y3 = null;
        }
        es1 es1Var = this.X1;
        if (es1Var != null && es1Var.getAdapter() != null) {
            k17 adapter = this.X1.getAdapter();
            if (i == 2) {
                TLRPC.User user = adapter.x0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.J0.m();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i == 4) {
            e51 e51Var3 = this.Y1;
            if (e51Var3 != null) {
                e51Var3.d2.Z();
            }
            if2 if2Var = this.ya;
            if (if2Var != null && (i22Var = if2Var.R1) != null) {
                i22Var.d2.Z();
            }
        } else if ((i == 5 || i == 30) && (e51Var = this.Y1) != null) {
            if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                e51Var.l1();
            }
        } else if ((i == 17 || i == 18) && (e51Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = e51Var2.d2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z4 = true;
            }
            chatAttachAlertPhotoLayout.U(z4);
            this.Y1.d2.Z();
        } else if (i == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                String M0 = jb6.M0(2131689472, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131747045, null);
                alertDialog$Builder.g(jb6.M0(2131747033, null), new rp1(this, (byte) 4));
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                alertDialog$Builder.o();
            }
        } else if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Sa(0);
        } else if (i == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Sa(2);
        } else if (((i != 101 && i != 102) || this.f == null) && (i != 103 || this.e == null)) {
        } else {
            int i2 = 0;
            while (true) {
                if (i2 < iArr.length) {
                    if (iArr[i2] != 0) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (iArr.length > 0 && z) {
                if (i == 103) {
                    sic.l(this.e, null, this.q8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f;
                if (i == 102) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                TLRPC.UserFull userFull = this.s8;
                if (userFull != null && userFull.video_calls_available) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sic.m(user2, z2, z3, getParentActivity(), getMessagesController().X1(this.f.id), getAccountInstance());
                return;
            }
            sic.h(getParentActivity(), null, i);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.onResume():void");
    }

    @Override
    public final void onThemeColorsChanged() {
        int i;
        int themedColor;
        int themedColor2;
        int themedColor3;
        int themedColor4;
        int i2;
        try {
            super.onThemeColorsChanged();
            nz4 nz4Var = this.J;
            if (nz4Var != null) {
                Iterator it = nz4Var.w.iterator();
                while (it.hasNext()) {
                    gm0 gm0Var = ((im0) it.next()).h0;
                    if (gm0Var != null) {
                        gm0Var.h = true;
                    }
                }
            }
            nz4 nz4Var2 = this.K;
            if (nz4Var2 != null) {
                Iterator it2 = nz4Var2.w.iterator();
                while (it2.hasNext()) {
                    gm0 gm0Var2 = ((im0) it2.next()).h0;
                    if (gm0Var2 != null) {
                        gm0Var2.h = true;
                    }
                }
            }
            Paint paint = this.W8;
            if (paint != null) {
                paint.setColor(getThemedColor(cmb.r8));
            }
            RadialProgressView radialProgressView = this.s0;
            if (radialProgressView != null) {
                if (U7()) {
                    i2 = cmb.Ja;
                } else {
                    i2 = cmb.Yc;
                }
                radialProgressView.setProgressColor(getThemedColor(i2));
            }
            qs1 qs1Var = this.d1;
            if (qs1Var != null) {
                qs1Var.setAccentColor(getThemedColor(cmb.Ei));
            }
            ey0 ey0Var = this.I0;
            if (ey0Var != null && ey0Var.getBackground() != null && ((themedColor4 = getThemedColor(cmb.Ei)) != this.L0 || this.Lb != cmb.I.o())) {
                this.L0 = themedColor4;
                this.Lb = cmb.I.o();
                Drawable background = this.I0.getBackground();
                cmb.F1(background, themedColor4, false);
                cmb.F1(background, ulb.b(themedColor4), true);
            }
            wb();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        Set<p7> set = this.V0;
        Set<p7> set2 = this.U0;
        try {
            RadialProgressView radialProgressView2 = this.J0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.K0));
            }
            NumberTextView numberTextView = this.U2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(cmb.Ve));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(cmb.Ue));
            }
            l66 l66Var = this.i2;
            if (l66Var != null && this.S0) {
                l66Var.setEmojiColor(getThemedColor(cmb.We));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(cmb.x6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(cmb.Ei)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(cmb.G6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            lf8 lf8Var = this.vd;
            if (lf8Var != null && (i = this.T0) >= 0) {
                lf8Var.setColor(getThemedColor(i));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(cmb.o7);
                for (p7 p7Var : set2) {
                    if (p7Var != null) {
                        p7Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int w0 = cmb.w0(null, cmb.o7, false);
                for (p7 p7Var2 : set) {
                    if (p7Var2 != null) {
                        p7Var2.a(w0, w0);
                    }
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        int[] iArr;
        mw1 mw1Var;
        super.onTransitionAnimationStart(z, z2);
        System.currentTimeMillis();
        int i = nm7.r;
        int i2 = nm7.K2;
        int i3 = nm7.G0;
        int i4 = nm7.s;
        if (z) {
            if (!this.g6) {
                this.g6 = true;
                cd();
            }
            iArr = this.ca == 0 ? new int[]{i, i4, i3, i2, nm7.C} : new int[]{i, i4, i3, i2};
            this.f6 = false;
            if (!z2) {
                this.h6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = m9c.D(this.f) ? new int[]{i, i4, i3, i2, nm7.V} : null;
            ms1 ms1Var = this.a0;
            if (ms1Var != null && (mw1Var = ms1Var.I2) != null) {
                gm.r(mw1Var);
                ms1Var.I2 = null;
            }
        }
        q5();
        this.ca = getNotificationCenter().p(iArr, this.ca, true);
    }

    @Override
    public final z82 p() {
        return this.p1;
    }

    public final void p5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.p5(boolean):void");
    }

    public final void p6(int r34, java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.p6(int, java.lang.Object[]):void");
    }

    public final r7 p7() {
        r7 r7Var = this.m0;
        if (r7Var != null && r7Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final void p8(int i, int i2, int i3, int i4) {
        char c;
        long j;
        int i5 = (i - i2) - i3;
        ArrayList arrayList = this.z6;
        if (i5 <= i4 && !this.Y6) {
            boolean[] zArr = this.U6;
            boolean z = zArr[0];
            int[] iArr = this.Q6;
            int[] iArr2 = this.T6;
            boolean[] zArr2 = this.V6;
            if (!z) {
                this.Y6 = true;
                arrayList.add(Integer.valueOf(this.n6));
                if (this.J6.size() != 0) {
                    oc7 messagesController = getMessagesController();
                    long j2 = this.l6;
                    j = 0;
                    long j3 = this.d7;
                    int i6 = iArr[0];
                    boolean z2 = !zArr2[0];
                    int i7 = iArr2[0];
                    int i8 = this.classGuid;
                    int i9 = this.g4;
                    long j4 = this.s4;
                    int i10 = this.C4;
                    int i11 = this.n6;
                    c = 0;
                    this.n6 = i11 + 1;
                    messagesController.c3(j2, j3, false, 50, i6, 0, z2, i7, i8, 0, i9, j4, i10, i11, this.x4);
                } else {
                    c = 0;
                    j = 0;
                    oc7 messagesController2 = getMessagesController();
                    long j5 = this.l6;
                    long j6 = this.d7;
                    boolean z3 = !zArr2[0];
                    int i12 = iArr2[0];
                    int i13 = this.classGuid;
                    int i14 = this.g4;
                    long j7 = this.s4;
                    int i15 = this.C4;
                    int i16 = this.n6;
                    this.n6 = i16 + 1;
                    messagesController2.c3(j5, j6, false, 50, 0, 0, z3, i12, i13, 0, i14, j7, i15, i16, this.x4);
                }
            } else {
                c = 0;
                j = 0;
                if (this.d7 != 0 && !zArr[1]) {
                    this.Y6 = true;
                    arrayList.add(Integer.valueOf(this.n6));
                    oc7 messagesController3 = getMessagesController();
                    long j8 = this.d7;
                    int i17 = iArr[1];
                    boolean z4 = !zArr2[1];
                    int i18 = iArr2[1];
                    int i19 = this.classGuid;
                    int i20 = this.g4;
                    long j9 = this.s4;
                    int i21 = this.C4;
                    int i22 = this.n6;
                    this.n6 = i22 + 1;
                    messagesController3.c3(j8, 0L, false, 50, i17, 0, z4, i18, i19, 0, i20, j9, i21, i22, this.x4);
                }
            }
        } else {
            c = 0;
            j = 0;
        }
        if (i3 > 0 && !this.a8 && i2 <= 10) {
            int i23 = (this.d7 > j ? 1 : (this.d7 == j ? 0 : -1));
            int[] iArr3 = this.S6;
            int[] iArr4 = this.R6;
            boolean[] zArr3 = this.W6;
            if (i23 != 0 && !zArr3[1]) {
                arrayList.add(Integer.valueOf(this.n6));
                oc7 messagesController4 = getMessagesController();
                long j10 = this.d7;
                int i24 = iArr4[1];
                int i25 = iArr3[1];
                int i26 = this.classGuid;
                int i27 = this.g4;
                long j11 = this.s4;
                int i28 = this.C4;
                int i29 = this.n6;
                this.n6 = i29 + 1;
                messagesController4.c3(j10, 0L, false, 50, i24, 0, true, i25, i26, 1, i27, j11, i28, i29, this.x4);
                this.a8 = true;
            } else if (!zArr3[c]) {
                arrayList.add(Integer.valueOf(this.n6));
                oc7 messagesController5 = getMessagesController();
                long j12 = this.l6;
                long j13 = this.d7;
                int i30 = iArr4[c];
                int i31 = iArr3[c];
                int i32 = this.classGuid;
                int i33 = this.g4;
                long j14 = this.s4;
                int i34 = this.C4;
                int i35 = this.n6;
                this.n6 = i35 + 1;
                messagesController5.c3(j12, j13, false, 50, i30, 0, true, i31, i32, 1, i33, j14, i34, i35, this.x4);
                this.a8 = true;
            }
        }
    }

    public final void p9(long j, boolean z) {
        if (!this.V4.isEmpty()) {
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
            edit.putInt("pin_" + this.l6, ((Integer) this.V4.get(0)).intValue()).commit();
            this.V4.clear();
            this.X4.clear();
            this.Z4 = 0;
            this.d5 = 0;
            this.e5 = 0;
            gd(0, true);
        }
        if (sd2.p0(this.e) && sd2.A(this.currentAccount, this.e, 24)) {
            if (j != 0) {
                cf7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new tc7(messagesStorage, -this.e.id, j, (byte) 1));
                getMessagesController().e0(j, 0, getMessagesController().i1(-this.e.id));
                getMessagesController().g4.s(this.e.id, j);
            }
        } else {
            getMessagesController().T(1, this.l6, z);
            cf7 messagesStorage2 = getMessagesStorage();
            long j2 = this.l6;
            messagesStorage2.getClass();
            messagesStorage2.H(new vc7(messagesStorage2, j2, (byte) 2));
            qwb qwbVar = getMessagesController().g4;
            qwbVar.getClass();
            gm.c3(new vp2((Object) qwbVar, -this.l6, true, (byte) 4));
        }
        this.e6.put(j, 0);
        mzb mzbVar = this.g2;
        if (mzbVar != null) {
            mzbVar.setAllTopicsHidden(false);
        }
        if (j == this.s4) {
            L5(false, null);
            this.D0.J(false);
        }
    }

    public final void pa(long j, final k47 k47Var, int i, final long j2, final int i2, final int i3, final k47 k47Var2) {
        int i4 = i;
        final TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = oc7.k1(L0);
        tL_messages_getDiscussionMessage.msg_id = i4;
        if (e21.a) {
            fc4.b("getDiscussionMessage chat = " + L0.id + " msg_id = " + i4);
        }
        this.ad = 0;
        this.bd = false;
        this.dd = null;
        this.ed = null;
        vr1 vr1Var = this.A0;
        if (vr1Var != null) {
            vr1Var.h1();
        }
        if (this.Zc != -1) {
            getConnectionsManager().cancelRequest(this.Zc, false);
        }
        if (this.Yc != -1) {
            getConnectionsManager().cancelRequest(this.Yc, false);
        }
        if (k47Var2 != null) {
            i4 = k47Var2.e1();
        }
        this.ad = i4;
        this.bd = false;
        this.cd = System.currentTimeMillis();
        vr1 vr1Var2 = this.A0;
        if (vr1Var2 != null) {
            vr1Var2.h1();
        }
        final int i5 = this.Wc + 1;
        this.Wc = i5;
        this.Yc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final yv1 yv1Var = yv1.this;
                final int i6 = i5;
                final int i7 = i2;
                final long j3 = j2;
                final int i8 = i3;
                final k47 k47Var3 = k47Var2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = L0;
                final k47 k47Var4 = k47Var;
                gm.c3(new uj1(yv1Var, new Runnable(i6, i7, j3, tLObject, i8, k47Var3, tL_messages_getDiscussionMessage2, chat, k47Var4) {
                    public final int b;
                    public final int c;
                    public final TLObject d;
                    public final int e;
                    public final k47 f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat n;
                    public final k47 r;

                    {
                        this.d = tLObject;
                        this.e = i8;
                        this.f = k47Var3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.n = chat;
                        this.r = k47Var4;
                    }

                    @Override
                    public final void run() {
                        int i9;
                        final yv1 yv1Var2 = yv1.this;
                        if (this.b != yv1Var2.Wc) {
                            return;
                        }
                        yv1Var2.Yc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            yv1Var2.dd = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            yv1Var2.getMessagesController().d4(yv1Var2.dd.users, false);
                            yv1Var2.getMessagesController().X3(yv1Var2.dd.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = yv1Var2.dd;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i10 = 0; i10 < yv1Var2.dd.messages.size(); i10++) {
                                TLRPC.Message message = yv1Var2.dd.messages.get(i10);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i11 = this.c;
                        final int i12 = this.e;
                        final k47 k47Var5 = this.f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.n;
                        final k47 k47Var6 = this.r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = yv1Var2.getMessagesController().l1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i12 > 0) {
                                tL_messages_getReplies.offset_id = i12;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i11 == 0) {
                                    i9 = 1;
                                } else {
                                    i9 = i11;
                                }
                                tL_messages_getReplies.offset_id = i9;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i13 = yv1Var2.Xc + 1;
                            yv1Var2.Xc = i13;
                            yv1Var2.Zc = yv1Var2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    gm.c3(new kp1(yv1.this, i13, tLObject3, tL_error2, i11, k47Var5, tL_messages_getDiscussionMessage3, chat2, i12, k47Var6, (byte) 0));
                                }
                            });
                            return;
                        }
                        yv1Var2.Pa(yv1Var2.dd, yv1Var2.ed, i11, k47Var5, tL_messages_getDiscussionMessage3, chat2, i12, k47Var6);
                    }
                }, (byte) 12));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Yc, this.classGuid);
    }

    public final int pb(defpackage.k47 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.pb(k47):int");
    }

    public final void pc(boolean z) {
        mz mzVar = this.qc;
        if (z) {
            if (mzVar == null) {
                mz mzVar2 = new mz(this, (byte) 14);
                this.qc = mzVar2;
                gm.d3(mzVar2, 100L);
                return;
            }
            return;
        }
        if (mzVar != null) {
            gm.r(mzVar);
        }
        this.qc = null;
        this.pc = false;
        fd(true);
    }

    public final void pd() {
        d6();
        String str = this.J3;
        if (str != null) {
            this.s2.e.setText(jb6.a0(null, null, 2131749111, str));
            this.a4.setEmptyView(this.s2);
            return;
        }
        this.a4.setEmptyView(null);
        this.s2.setVisibility(8);
    }

    @Override
    public final boolean q(final nk3 nk3Var, final ArrayList arrayList, final CharSequence charSequence, boolean z, final boolean z2, final int i, final int i2, sxb sxbVar) {
        int i3;
        ms1 ms1Var;
        boolean z3;
        ms1 ms1Var2;
        k47 k47Var;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        o47 o47Var = this.x5;
        SparseArray[] sparseArrayArr = this.o6;
        int i8 = 0;
        int i9 = 1;
        if (((o47Var == null && (!nk3Var.P0 || this.F5 == null)) || (nk3Var.P0 && this.F5 == null)) && this.z5 == null && sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
            return false;
        }
        final ArrayList arrayList2 = new ArrayList();
        k47 k47Var2 = this.z5;
        if (k47Var2 != null) {
            f47 f47Var = this.A5;
            if (f47Var != null) {
                arrayList2.addAll(f47Var.d);
            } else {
                arrayList2.add(k47Var2);
            }
        } else {
            for (int i10 = 1; i10 >= 0; i10--) {
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < sparseArrayArr[i10].size(); i11++) {
                    arrayList3.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                }
                Collections.sort(arrayList3);
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    k47 k47Var3 = (k47) sparseArrayArr[i10].get(((Integer) arrayList3.get(i12)).intValue());
                    if (k47Var3 != null) {
                        arrayList2.add(k47Var3);
                    }
                }
            }
        }
        int i13 = 0;
        while (true) {
            int i14 = 8;
            if (i13 < arrayList.size()) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((bf7) arrayList.get(i13)).a));
                if (L0 != null) {
                    int i15 = i8;
                    while (i15 < arrayList2.size()) {
                        k47 k47Var4 = (k47) arrayList2.get(i15);
                        mp3 mp3Var = a6a.J;
                        boolean t = sd2.t(L0);
                        boolean p = sd2.p(L0);
                        boolean u = sd2.u(L0);
                        boolean l = sd2.l(L0);
                        sd2.m(L0);
                        boolean r = sd2.r(L0);
                        boolean s = sd2.s(L0);
                        boolean v = sd2.v(L0);
                        boolean o = sd2.o(L0);
                        if (!k47Var4.s4() && !k47Var4.J2() && !k47.t3(k47Var4.k) && !(k47.n1(k47Var4.k) instanceof TLRPC.TL_messageMediaGame)) {
                            i4 = i8;
                        } else {
                            i4 = i9;
                        }
                        if (!t && i4 != 0) {
                            if (sd2.P(i14, L0)) {
                                i6 = 4;
                                z4 = i8;
                            } else {
                                i7 = i8;
                                i6 = i9;
                                z4 = i7;
                            }
                        } else {
                            if (!p) {
                                TLRPC.Message message = k47Var4.k;
                                int i16 = i8;
                                i5 = i16;
                                if (message.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    i5 = i16;
                                    i5 = i16;
                                    if (!k47.K4(message) && i4 == 0) {
                                        if (sd2.P(16, L0)) {
                                            i6 = 10;
                                            z4 = i16;
                                        } else {
                                            i6 = 12;
                                            z4 = i16;
                                        }
                                    }
                                }
                            } else {
                                i5 = i8;
                            }
                            if (!o && k47Var4.I3()) {
                                if (sd2.P(18, L0)) {
                                    i6 = 19;
                                    z4 = i5;
                                } else {
                                    i6 = 20;
                                    z4 = i5;
                                }
                            } else if (!u && k47.K4(k47Var4.k) && i4 == 0) {
                                if (sd2.P(17, L0)) {
                                    i6 = 9;
                                    z4 = i5;
                                } else {
                                    i6 = 11;
                                    z4 = i5;
                                }
                            } else {
                                i9 = 21;
                                if (!r) {
                                    TLRPC.MessageMedia messageMedia = k47Var4.k.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        if (sd2.P(10, L0)) {
                                            i6 = 6;
                                            z4 = i5;
                                        } else {
                                            i6 = 3;
                                            z4 = i5;
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                        i7 = i5;
                                        if (!sd2.P(10, L0)) {
                                            i6 = 22;
                                            z4 = i5;
                                        }
                                        i6 = i9;
                                        z4 = i7;
                                    }
                                }
                                if (!v && k47.Q4(k47Var4.k)) {
                                    if (sd2.P(20, L0)) {
                                        i6 = 13;
                                        z4 = i5;
                                    } else {
                                        i6 = 14;
                                        z4 = i5;
                                    }
                                } else if (!s && k47.i4(k47Var4.k)) {
                                    if (sd2.P(21, L0)) {
                                        i6 = 15;
                                        z4 = i5;
                                    } else {
                                        i6 = 16;
                                        z4 = i5;
                                    }
                                } else if (!l && (k47Var4.k.media instanceof TLRPC.TL_messageMediaDocument) && i4 == 0) {
                                    if (sd2.P(19, L0)) {
                                        i6 = 17;
                                        z4 = i5;
                                    } else {
                                        i6 = 18;
                                        z4 = i5;
                                    }
                                } else {
                                    i6 = i5 == 1 ? 1 : 0;
                                    z4 = i5;
                                }
                            }
                        }
                        if (i6 != 0) {
                            ik.q0(i6, null, nk3Var);
                            return z4;
                        }
                        i15++;
                        i8 = z4;
                        i14 = 8;
                        i9 = 1;
                    }
                    continue;
                }
                i13++;
                i8 = i8;
                i9 = 1;
            } else {
                int i17 = i8;
                if (!nk3Var.P0 && (arrayList.size() > 1 || ((bf7) arrayList.get(i17)).a == getUserConfig().e() || charSequence != null || i != 0 || !z2)) {
                    int i18 = this.currentAccount;
                    int size = arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0);
                    qac qacVar = new qac() {
                        @Override
                        public final void a(Object obj) {
                            ArrayList arrayList4;
                            ArrayList arrayList5;
                            Long l2;
                            int i19;
                            int i20;
                            boolean z5;
                            long longValue;
                            long longValue2;
                            HashMap hashMap = (HashMap) obj;
                            nk3 nk3Var2 = nk3Var;
                            if (nk3Var2.k2) {
                                nk3Var2.E2 = null;
                            }
                            yv1 yv1Var = yv1.this;
                            if (yv1Var.z5 != null) {
                                yv1Var.z5 = null;
                                yv1Var.A5 = null;
                            } else {
                                for (int i21 = 1; i21 >= 0; i21--) {
                                    yv1Var.p6[i21].clear();
                                    yv1Var.q6[i21].clear();
                                    yv1Var.o6[i21].clear();
                                }
                                yv1Var.C7();
                                yv1Var.gd(0, true);
                                yv1Var.Gd(false);
                            }
                            yv1Var.x5 = null;
                            yv1Var.E7(false);
                            int i22 = 0;
                            while (true) {
                                arrayList4 = arrayList;
                                int size2 = arrayList4.size();
                                arrayList5 = arrayList2;
                                if (i22 >= size2) {
                                    break;
                                }
                                long j = ((bf7) arrayList4.get(i22)).a;
                                if (hashMap == null) {
                                    l2 = 0L;
                                } else {
                                    l2 = (Long) hashMap.get(Long.valueOf(j));
                                }
                                CharSequence charSequence2 = charSequence;
                                boolean z6 = z2;
                                int i23 = i;
                                int i24 = i2;
                                if (charSequence2 != null) {
                                    z5 = z6;
                                    y5a b = y5a.b(charSequence2.toString(), j, null, null, null, true, null, null, null, z5, i23, i24, null, false);
                                    j = j;
                                    i20 = i23;
                                    i19 = i24;
                                    b.K = yv1Var.X6();
                                    if (l2 == null) {
                                        longValue2 = 0;
                                    } else {
                                        longValue2 = l2.longValue();
                                    }
                                    b.Q = longValue2;
                                    b.R = yv1Var.k7();
                                    b.T = yv1Var.y5;
                                    yv1Var.getSendMessagesHelper().q0(b);
                                } else {
                                    i19 = i24;
                                    i20 = i23;
                                    z5 = z6;
                                }
                                a6a sendMessagesHelper = yv1Var.getSendMessagesHelper();
                                if (l2 == null) {
                                    longValue = 0;
                                } else {
                                    longValue = l2.longValue();
                                }
                                sendMessagesHelper.p0(arrayList5, j, false, false, z5, i20, i19, null, -1, longValue, yv1Var.k7(), yv1Var.y5);
                                i22++;
                            }
                            nk3Var2.finishFragment();
                            yv1Var.i6();
                            if (yv1Var.N3 != null) {
                                if (arrayList4.size() == 1) {
                                    if (!c41.b0(yv1Var).h0(arrayList5.size(), ((bf7) arrayList4.get(0)).a)) {
                                        yv1Var.N3.m(Integer.valueOf(arrayList5.size()), 53, ((bf7) arrayList4.get(0)).a);
                                        return;
                                    }
                                    return;
                                }
                                yv1Var.N3.k(0L, 53, Integer.valueOf(arrayList5.size()), Integer.valueOf(arrayList4.size()), null, null);
                            }
                        }
                    };
                    Pattern pattern = ik.a;
                    HashSet hashSet = new HashSet();
                    int size2 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj = arrayList.get(i19);
                        i19++;
                        hashSet.add(Long.valueOf(((bf7) obj).a));
                    }
                    return !ik.Z(i18, new ArrayList(hashSet), size, qacVar);
                }
                if (this.z5 != null) {
                    this.z5 = null;
                    this.A5 = null;
                    i3 = 0;
                } else {
                    for (int i20 = 1; i20 >= 0; i20--) {
                        this.p6[i20].clear();
                        this.q6[i20].clear();
                        sparseArrayArr[i20].clear();
                    }
                    C7();
                    i3 = 0;
                    gd(0, true);
                    Gd(false);
                }
                bf7 bf7Var = (bf7) arrayList.get(i3);
                long j = bf7Var.a;
                if (j == this.l6 && d() == bf7Var.b && this.g4 != 2) {
                    ArrayList arrayList4 = new ArrayList(getParentLayout().getFragmentStack());
                    if (!arrayList4.isEmpty() && b10.f(1, arrayList4) == nk3Var) {
                        nk3Var.finishFragment();
                    } else {
                        int indexOf = arrayList4.indexOf(nk3Var);
                        if (indexOf > 0) {
                            while (indexOf < arrayList4.size()) {
                                if (indexOf == arrayList4.size() - 1) {
                                    ((d) arrayList4.get(indexOf)).finishFragment();
                                } else {
                                    nk3Var.removeSelfFromStack();
                                }
                                indexOf++;
                            }
                        }
                    }
                    da(false);
                    if (nk3Var.P0 && (k47Var = this.F5) != null) {
                        ec(k47Var, this.D5);
                    } else {
                        cc(arrayList2);
                    }
                    if (gm.O1()) {
                        C7();
                        z3 = false;
                        gd(0, true);
                    } else {
                        z3 = false;
                    }
                    Gd(z3);
                    if (this.Mb && (ms1Var2 = this.a0) != null) {
                        ms1Var2.k1();
                        ms1 ms1Var3 = this.a0;
                        ms1Var3.U0 = z3;
                        jz1 jz1Var = ms1Var3.V0;
                        if (jz1Var != null) {
                            jz1Var.s(z3);
                        }
                        this.Mb = z3;
                        return true;
                    }
                    return true;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", this.i6);
                if (pg3.B(j)) {
                    bundle.putInt("enc_id", (int) (j & 4294967295L));
                } else {
                    if (pg3.D(j)) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    if (!getMessagesController().A(bundle, nk3Var, null, null)) {
                        return true;
                    }
                }
                if (getMessagesController().y2(bf7Var.a)) {
                    bundle.putInt("chatMode", 8);
                    if (!getMessagesController().z2(bf7Var.a)) {
                        bundle.putBoolean("isSubscriberSuggestions", true);
                    }
                }
                bundle.putBoolean("historyPreloaded", false);
                B4();
                yv1 yv1Var = new yv1(bundle);
                if (bf7Var.b != 0 || sxbVar != null) {
                    no4.a(yv1Var, bf7Var);
                    nk3Var.removeSelfFromStack();
                }
                if (presentFragment(yv1Var, true)) {
                    if (nk3Var.P0 && this.F5 != null) {
                        ms1 ms1Var4 = this.a0;
                        if (ms1Var4 != null && (ms1Var = yv1Var.a0) != null) {
                            ms1Var.setFieldText(ms1Var4.getFieldText());
                        }
                        f47 f47Var2 = this.B5;
                        if (f47Var2 != null) {
                            yv1Var.B5 = f47Var2;
                        } else {
                            k47 k47Var5 = this.F5;
                            if (k47Var5 != null) {
                                yv1Var.B5 = T6(k47Var5.c1());
                            }
                        }
                        k47 k47Var6 = this.C5;
                        if (k47Var6 != null) {
                            yv1Var.C5 = k47Var6;
                        } else {
                            k47 k47Var7 = this.m4;
                            if (k47Var7 != null) {
                                yv1Var.C5 = k47Var7;
                            }
                        }
                        yv1Var.Zb = new en1(this, (byte) 11);
                        yv1Var.ec(this.F5, this.D5);
                    } else {
                        yv1Var.cc(arrayList2);
                    }
                    if (yv1Var.l6 == a() && !gm.O1()) {
                        removeSelfFromStack();
                        return true;
                    }
                    return true;
                }
                nk3Var.finishFragment();
                return true;
            }
        }
    }

    public final void q5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.q5():void");
    }

    public final void q6(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.q6(int, java.lang.Object[]):void");
    }

    public final k47 q7() {
        View view = this.v9;
        if (view instanceof rc2) {
            return ((rc2) view).getMessageObject();
        }
        if (view instanceof cm1) {
            return ((cm1) view).getMessageObject();
        }
        return null;
    }

    public final void q8(nk nkVar, Runnable runnable) {
        if (!this.isFinished) {
            if (nk.n(jva.u(this.currentAccount, nkVar.a).m()).b < nkVar.b) {
                ok okVar = nkVar.a;
                if (okVar == ok.a) {
                    new dxa(getParentActivity(), getResourceProvider(), nkVar.a(), 13, no4.i(this.currentAccount, a()), null, a()).show();
                    return;
                } else if (okVar == ok.b) {
                    new xfb(getParentActivity(), getResourceProvider(), nkVar, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void q9(TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j;
        TLRPC.User user = this.X1.getAdapter().x0;
        int i = this.currentAccount;
        TLRPC.User user2 = this.f;
        if (user2 != null) {
            j = user2.id;
        } else {
            j = this.e.id;
        }
        rwc b = rwc.b(i, j, user.id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, k7(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
            return;
        }
        String D1 = oc7.r1(this.currentAccount).D1(user.restriction_reason);
        if (!TextUtils.isEmpty(D1)) {
            oc7.r1(this.currentAccount);
            oc7.Z4(D1, this);
            return;
        }
        wx0 wx0Var = new wx0(getParentActivity(), getResourceProvider());
        wx0Var.B(false);
        wx0Var.C0 = true;
        wx0Var.m0 = getParentActivity();
        wx0Var.x(this, b);
        wx0Var.show();
    }

    public final void qa(boolean z) {
        CharSequence M0;
        if (!a8() && !A7()) {
            int i = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.o6;
                    if (i3 >= sparseArrayArr[i2].size()) {
                        break;
                    }
                    k47 k47Var = (k47) sparseArrayArr[i2].valueAt(i3);
                    if (k47Var.C4()) {
                        i = 3;
                    } else if (k47Var.S3()) {
                        if (k47Var.Y3()) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        if (i == 2) {
                            break;
                        }
                    } else if (k47Var.z3()) {
                        z2 = true;
                    }
                    i3++;
                }
                if (i == 2) {
                    break;
                }
            }
            qe2 qe2Var = this.va;
            if (qe2Var != null && qe2Var.d()) {
                this.va.setHiddenByScroll(true);
            }
            Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
            j.putInt("messagesCount", this.u6);
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            j.putBoolean("canSelectTopics", true);
            nk3 nk3Var = new nk3(j);
            nk3Var.E2 = this;
            presentFragment(nk3Var);
            return;
        }
        if (a8()) {
            if (a() > 0) {
                M0 = jb6.M0(2131750466, null);
            } else if (sd2.T(this.e) && !this.e.megagroup) {
                M0 = jb6.M0(2131750468, null);
            } else {
                M0 = jb6.M0(2131750467, null);
            }
        } else {
            M0 = jb6.M0(2131750469, null);
        }
        if (z) {
            hg5 hg5Var = this.z2;
            if (hg5Var == null) {
                int indexOfChild = this.m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    hg5Var = x4(310.0f, 1, indexOfChild + 1, false);
                    this.z2 = hg5Var;
                } else {
                    return;
                }
            }
            hg5Var.t(M0);
            this.z2.x(this.actionBar.getActionMode().j(11), true);
            return;
        }
        hg5 hg5Var2 = this.A2;
        if (hg5Var2 == null) {
            int indexOfChild2 = this.m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            hg5Var2 = x4(310.0f, 3, indexOfChild2 + 1, false);
            this.A2 = hg5Var2;
        }
        hg5Var2.t(M0);
        this.A2.x(this.e1.getForwardButton(), true);
    }

    public final void qb() {
        rb(false, null);
    }

    public final void qc(rc2 rc2Var, int i, int i2, int i3) {
        if (!this.C2.W || this.Ub != rc2Var || this.Vb != i3) {
            k47 messageObject = rc2Var.getMessageObject();
            if (messageObject != null && (k47.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k47.m1(messageObject);
                if (k47.V4(tL_messageMediaPoll) && !k47.T4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        this.C2.t(jb6.M0(2131746892, null));
                        this.Ub = rc2Var;
                        this.Vb = i3;
                        this.C2.w(w7(rc2Var, i2), x7(rc2Var, i3), true);
                    }
                }
            }
            if (i == -1) {
                this.C2.t(jb6.M0(2131746891, null));
                this.Ub = rc2Var;
                this.Vb = i3;
                this.C2.w(w7(rc2Var, i2), x7(rc2Var, i3), true);
            }
        }
    }

    public final void qd() {
        boolean z;
        if (this.y1 == null) {
            return;
        }
        if ((!getMediaDataController().Z0.isEmpty() && this.H3 && !this.G3) || (this.g4 == 7 && this.d4 == 2 && !this.M6.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        this.y1.e(6, z, true);
        this.y1.e(5, z, true);
        if (z) {
            this.y1.e(1, false, true);
        } else {
            this.T7 = 0;
        }
        this.m1.invalidate();
    }

    @Override
    public final void r() {
        if (!this.x4) {
            if (this.f != null) {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.f.id));
                if (W1 != null) {
                    this.f = W1;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e.id));
                if (L0 != null) {
                    this.e = L0;
                } else {
                    return;
                }
            }
            pr1 pr1Var = this.p1;
            if (pr1Var != null) {
                pr1Var.b();
            }
        }
    }

    public final boolean r5(View view) {
        CharSequence slowModeTimer = this.a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            vc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void r6(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.r6(int, java.lang.Object[]):void");
    }

    public final int r7(int i) {
        SparseIntArray sparseIntArray = this.j5;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 == -1) {
            int i3 = zd;
            zd = i3 + 1;
            sparseIntArray.put(i, i3);
            return i3;
        }
        return i2;
    }

    public final void r8(TLRPC.Document document) {
        this.L4.put(document, 0);
        a6a.B(this.currentAccount).t0(document, null, this.l6, null, null, null, this.D5, null, true, 0, 0, false, null, X6(), 0L, k7(), this.y5);
    }

    public final void r9(final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i, k47 k47Var, int i2, int i3, k47 k47Var2) {
        boolean z;
        int i4;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i5 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            this.bd = true;
            this.A0.h1();
            Bundle bundle = new Bundle();
            final long B0 = k47.B0(((k47) arrayList.get(0)).k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("historyPreloaded", z);
            yv1 yv1Var = new yv1(bundle);
            yv1Var.Nb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i != 0) {
                yv1Var.d8 = i;
            }
            if (k47Var != null && (messageReplies = k47Var.k.replies) != null && (messageReplies2 = yv1Var.m4.k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (k47Var != null && (tL_messageReactions = k47Var.k.reactions) != null) {
                yv1Var.m4.k.reactions = tL_messageReactions;
            }
            up6 up6Var = new up6(this, new boolean[]{false}, i2, yv1Var, (byte) 13);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i6 = message.id;
                        i4 = i3;
                        if (i6 > i4 && !message.out) {
                            i5 = i6;
                            break;
                        }
                    }
                }
                i4 = i3;
                final int classGuid = yv1Var.getClassGuid();
                nm7.f(this.currentAccount).a(new ar1(this, classGuid, up6Var, yv1Var), nm7.C);
                final int i7 = i4;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i8;
                        int i9;
                        yv1 yv1Var2 = yv1.this;
                        oc7 messagesController = yv1Var2.getMessagesController();
                        TLRPC.messages_Messages messages_messages2 = messages_messages;
                        int size2 = messages_messages2.messages.size();
                        int i10 = i;
                        if (i10 > 0) {
                            i8 = i10;
                        } else {
                            i8 = i7;
                        }
                        if (i10 > 0) {
                            i9 = 3;
                        } else {
                            i9 = 2;
                        }
                        int i11 = i9;
                        messagesController.P3(messages_messages2, size2, B0, 0L, 30, i8, 0, false, classGuid, i5, 0, 0, 0, i11, true, 0, ((k47) b10.f(1, arrayList)).e1(), 1, false, 0, true, yv1Var2.x4, null);
                    }
                });
                return;
            }
            up6Var.run();
            return;
        }
        this.ad = 0;
        this.bd = false;
        this.A0.h1();
        if (k47Var2 != null) {
            va(k47Var2);
        } else if (getParentActivity() != null) {
            c41.b0(this).t(jb6.M0(2131752272, null), this.Ba).j();
        }
    }

    public final void ra(int i) {
        boolean z;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        k47 k47Var;
        o47 o47Var = this.x5;
        if (o47Var != null && this.cb == null) {
            TLRPC.Peer peer = null;
            if (o47Var.c != null) {
                int i2 = this.currentAccount;
                TLRPC.WebPage webPage = this.Y5;
                CharSequence fieldText = this.a0.getFieldText();
                k47 k47Var2 = this.F5;
                if (k47Var2 == this.m4) {
                    k47Var = null;
                } else {
                    k47Var = k47Var2;
                }
                o47Var.e(i2, webPage, fieldText, k47Var, this.D5, this.H5);
            }
            if (!this.x5.c()) {
                this.Mb = this.a0.p3;
                Context context = this.m1.getContext();
                km0 km0Var = this.Q8;
                o47 o47Var2 = this.x5;
                TLRPC.User user = this.f;
                TLRPC.Chat chat = this.e;
                int i3 = this.currentAccount;
                wv1 wv1Var = this.Ba;
                nv1 nv1Var = this.D5;
                if (nv1Var != null && nv1Var.f) {
                    z = true;
                } else {
                    z = false;
                }
                jt1 jt1Var = new jt1(this, context, this, km0Var, o47Var2, user, chat, i3, wv1Var, i, z);
                this.cb = jt1Var;
                this.x5.x = jt1Var;
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ea) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ea.peers.get(0).peer;
                }
                this.cb.setSendAsPeer(peer);
                q5();
                this.m1.addView(this.cb);
                if (this.Mb) {
                    ms1 ms1Var = this.a0;
                    ms1Var.U0 = true;
                    jz1 jz1Var = ms1Var.V0;
                    if (jz1Var != null) {
                        jz1Var.s(true);
                    }
                    this.a0.Y1();
                    this.S3 = true;
                }
                gm.g3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void rb(boolean z, mz mzVar) {
        ArrayList arrayList;
        int i;
        if (this.A0.W1) {
            return;
        }
        this.vb = 0;
        this.wb = Integer.MIN_VALUE;
        this.b5 = 0;
        this.ec = 0;
        this.c5 = false;
        this.o9.m(0);
        if (this.W6[0] && this.Z7 == 0 && this.M7 == 0) {
            this.y1.d(false);
            if (this.C0.H0() == 0) {
                this.D9 = false;
                dd();
                cb();
                Gd(false);
                return;
            }
            this.D0.O();
            jv1 jv1Var = this.jb;
            jv1Var.a = null;
            int i2 = 0;
            while (true) {
                arrayList = this.M6;
                if (i2 >= arrayList.size() || !((k47) arrayList.get(i2)).q4()) {
                    break;
                }
                i2++;
                z = false;
            }
            if (z && arrayList != null && !arrayList.isEmpty() && arrayList.get(i2) != null) {
                long c1 = ((k47) arrayList.get(i2)).c1();
                while (c1 != 0 && (i = i2 + 1) < arrayList.size() && c1 == ((k47) arrayList.get(i)).c1()) {
                    i2 = i;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i2 = Math.min(i2, arrayList.size() - 1);
            }
            ss1 ss1Var = this.o9;
            jv1Var.b = i2;
            jv1Var.d = 0;
            boolean z2 = !z;
            jv1Var.c = z2;
            ss1Var.l(i2, 0, z2, true);
            this.D9 = false;
            dd();
            return;
        }
        he heVar = this.dc;
        if (heVar != null) {
            heVar.dismiss();
        }
        fd(false);
        if (mzVar != null) {
            mzVar.run();
        } else {
            gb();
            he heVar2 = new he(3, this.Ba, getParentActivity());
            this.dc = heVar2;
            heVar2.setOnCancelListener(this.Ja);
            this.dc.q(1000L);
        }
        this.q9 = this.n6;
        this.s9 = false;
        this.r9 = 0;
        this.t9 = false;
        ArrayList arrayList2 = this.z6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.n6));
        gm.d3(new en1(this, (byte) 17), 0L);
    }

    public final void rc(boolean z) {
        double d;
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= oc7.r1(this.currentAccount).l4.j2.f() * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!z8c.h(this.currentAccount).p() && !oc7.r1(this.currentAccount).H3()) {
                int i3 = this.currentAccount;
                if (z) {
                    d = oc7.r1(i3).l4.p3.i;
                } else {
                    d = oc7.r1(i3).l4.q3.i;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(((float) d) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    c41 b0 = c41.b0(this);
                    if (z) {
                        i = 2131743489;
                    } else {
                        i = 2131751285;
                    }
                    String M0 = jb6.M0(i, null);
                    if (z) {
                        i2 = 2131743488;
                    } else {
                        i2 = 2131751284;
                    }
                    u31 I = b0.I(2131624205, M0, gm.G2(gm.N2(jb6.M0(i2, null), -1, 2, new wm1(this, z, (byte) 1), null), spannableString, "%d"));
                    I.j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void rd(String str) {
        if (this.g4 == 7 && !TextUtils.equals(this.J3, str)) {
            d6();
            nc(true);
            this.J3 = str;
            this.I3 = str;
            e5(false);
            K5(true);
            this.f7 = 0L;
            this.C7 = false;
            af5.a(this.currentAccount).b(this.d4).a();
            this.b4.f();
            this.a4.requestLayout();
            if (this.a4.getLayoutManager() != null) {
                this.a4.getLayoutManager().m0(0);
            }
            pd();
            this.s2.e(true, true);
            N6();
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.n8 = bundle.getString("path");
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    public final boolean s5() {
        CharSequence slowModeTimer = this.a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131745044, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0("SlowModeHint", null, 2131745045, slowModeTimer));
        b10.t(null, 2131747564, alertDialog$Builder, null);
        return false;
    }

    public final void s6(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.s6(int, java.lang.Object[]):void");
    }

    public final int s7(int i) {
        SparseIntArray sparseIntArray = this.i5;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 == -1) {
            int i3 = zd;
            zd = i3 + 1;
            sparseIntArray.put(i, i3);
            return i3;
        }
        return i2;
    }

    public final void s8(TLRPC.Document document) {
        this.L4.put(document, 0);
        a6a.B(this.currentAccount).t0(document, null, this.l6, null, null, null, this.D5, null, true, 0, 0, false, null, X6(), 0L, k7(), this.y5);
    }

    public final void s9(long j, long j2) {
        wq0.b(this.currentAccount).h(j, j2, false);
        this.Bc = null;
    }

    public final void sa(String str, boolean z) {
        boolean z2;
        js1 js1Var;
        r7 r7Var;
        int i;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                d6();
                hg5 hg5Var = this.K1;
                if (hg5Var != null && hg5Var.W) {
                    hg5Var.f(true);
                    z2 = true;
                } else {
                    z2 = false;
                }
                hg5 hg5Var2 = this.L1;
                if (hg5Var2 != null && hg5Var2.W) {
                    hg5Var2.f(true);
                    z2 = true;
                }
                if (z2) {
                    gm.d3(new lm1(this, str, (byte) 8), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                e5(true);
                if (!this.actionBar.o0) {
                    this.sd.a(true, true);
                    r7 r7Var2 = this.j0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                    q6 q6Var = this.g0;
                    if (q6Var != null) {
                        q6Var.e(8);
                    }
                    qr2 qr2Var = this.f0;
                    if (qr2Var != null) {
                        qr2Var.b(false);
                    }
                    if ((this.s4 == 0 || (i = this.g4) == 3 || i == 8) && (r7Var = this.k0) != null) {
                        r7Var.setVisibility(0);
                    }
                    r7 r7Var3 = this.p0;
                    if (r7Var3 != null && this.ha) {
                        r7Var3.setVisibility(8);
                    }
                    q6 q6Var2 = this.q0;
                    if (q6Var2 != null && this.ia) {
                        q6Var2.e(8);
                    }
                    r7 r7Var4 = this.l0;
                    if (r7Var4 != null) {
                        r7Var4.setVisibility(8);
                    }
                    r7 r7Var5 = this.m0;
                    if (r7Var5 != null) {
                        r7Var5.setVisibility(8);
                    }
                    this.r0 = true;
                    nd(0, 0, -1);
                    Pc(false);
                }
                ys1 ys1Var = this.D1;
                if (ys1Var != null && ys1Var.F > 0.5f) {
                    ys1Var.g(false);
                }
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z && (!sd2.V(this.e) || !sd2.t0(this.e) || this.J3 == null)) {
                    this.G1 = (byte) 0;
                } else {
                    this.G1 = (byte) 2;
                }
                this.k5 = false;
                int i2 = this.d4;
                int i3 = this.currentAccount;
                if (i2 == 3) {
                    af5.a(i3).b(3).a();
                } else {
                    af5 a = af5.a(i3);
                    a.b.a();
                    a.c.a();
                }
                hs1 hs1Var = this.F1;
                if (hs1Var != null) {
                    hs1Var.h.clear();
                }
                r7 r7Var6 = this.k0;
                if (r7Var6 != null) {
                    this.Vc = true;
                    r7Var6.G(false);
                    this.Vc = false;
                }
                r7 r7Var7 = this.k0;
                if (r7Var7 != null) {
                    r7Var7.setSearchFieldCaption(null);
                    this.k0.P(str, false);
                    this.k0.setSearchFieldHint(jb6.M0(2131745497, null));
                }
                getMediaDataController().Z1(this.I3, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, false, this.F3);
                gd(0, true);
                this.s2.e(true, true);
                nc(true);
                js1 js1Var2 = this.E1;
                if (js1Var2 != null) {
                    js1Var2.b(!contains);
                    pd();
                }
                if ((contains || z) && this.J3 != null && (js1Var = this.E1) != null) {
                    int currentPosition = js1Var.a.getCurrentPosition();
                    byte b = this.G1;
                    if (currentPosition != b) {
                        this.E1.a.e(b, b);
                    }
                }
                af5.a(this.currentAccount).c(this.J3);
                this.I1.f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof gw1) {
                    ((gw1) currentView).a.rd(this.J3);
                }
            }
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        en1 en1Var = this.Na;
        if (en1Var != null) {
            gm.r(en1Var);
        }
        ms1 ms1Var = this.a0;
        if (ms1Var != null && this.m1 != null && ms1Var.getAdjustPanLayoutHelper() != null && !this.a0.getAdjustPanLayoutHelper().f) {
            this.Ma = this.m1.getKeyboardHeight();
        } else {
            this.Ma = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.n8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.sb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void sc(boolean z) {
        if (this.R != null) {
            if (!gm.O1() && !this.v4 && this.f == null) {
                Boolean bool = this.Qb;
                if (bool == null) {
                    bool = Boolean.valueOf(e86.e(360928));
                    this.Qb = bool;
                }
                if (bool.booleanValue()) {
                    this.Pb = z;
                    return;
                }
            }
            int i = 0;
            if (this.g6 && gda.c()) {
                if (z == this.Pb) {
                    return;
                }
                this.Pb = z;
                FrameLayout frameLayout = this.R;
                if (z) {
                    if (frameLayout.getVisibility() != 0) {
                        this.R.setVisibility(0);
                        this.R.setAlpha(0.0f);
                        this.R.setScaleX(0.3f);
                        this.R.setScaleY(0.3f);
                    }
                    this.R.animate().setListener(null).cancel();
                    this.R.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                frameLayout.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new yq1(this, (byte) 3)).start();
                return;
            }
            this.Pb = z;
            FrameLayout frameLayout2 = this.R;
            if (!z) {
                i = 4;
            }
            frameLayout2.setVisibility(i);
        }
    }

    public final void sd() {
        ms1 ms1Var;
        if (this.T != null) {
            this.H0.setBackground(null);
            this.H0.setOnClickListener(null);
            boolean z = true;
            if (this.g4 == 3 && f7() == 2666000) {
                this.H0.setText(jb6.M0(2131753847, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                ad();
                fdb fdbVar = this.s1;
                if (fdbVar != null) {
                    fdbVar.e();
                }
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null && !sd2.n(chat)) {
                    TLRPC.Chat chat2 = this.e;
                    if (!sd2.p(chat2) && !sd2.u(chat2) && !sd2.s(chat2) && !sd2.v(chat2) && !sd2.l(chat2) && !sd2.o(chat2) && !sd2.t(chat2)) {
                        TLRPC.Chat chat3 = this.e;
                        if (!chat3.gigagroup && (!sd2.T(chat3) || this.e.megagroup)) {
                            TLRPC.Chat chat4 = this.e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (sd2.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231130).mutate();
                                    int i = cmb.Ei;
                                    mutate.setTint(getThemedColor(i));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i);
                                    mutate.setBounds(0, 0, gm.L(14.0f), gm.L(14.0f));
                                    sn2 sn2Var = new sn2(null, mutate, gm.L(-6.0f), gm.L(-6.0f));
                                    int L = gm.L(14.0f);
                                    int L2 = gm.L(14.0f);
                                    sn2Var.e = L;
                                    sn2Var.f = L2;
                                    int L3 = gm.L(14.0f);
                                    int L4 = gm.L(14.0f);
                                    sn2Var.h = L3;
                                    sn2Var.n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ".concat(jb6.M0(2131753546, null)));
                                    spannableStringBuilder.setSpan(new do4(i, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(sn2Var, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i2 = cmb.h6;
                                    anb.R(textView, cmb.g0(0, cmb.w0(null, i2, false)), null, anb.M(i2), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new tm1(this, (byte) 0));
                                } else {
                                    this.H0.setText(jb6.M0(2131749308, null));
                                }
                            } else {
                                boolean B1 = gm.B1(chat4.banned_rights);
                                TextView textView2 = this.H0;
                                if (B1) {
                                    textView2.setText(jb6.M0(2131745331, null));
                                } else {
                                    textView2.setText(jb6.a0("SendMessageRestricted", null, 2131745332, jb6.v(this.e.banned_rights.until_date)));
                                }
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            ad();
                            fdb fdbVar2 = this.s1;
                            if (fdbVar2 != null) {
                                fdbVar2.e();
                            }
                        }
                    }
                }
                U5(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(jb6.M0(2131751066, null));
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        hg9.q("AwaitingEncryption", null, 2131753722, new Object[]{b10.j(new StringBuilder("<b>"), this.f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(jb6.M0(2131751065, null));
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                        this.a0.setFieldText("");
                        getMediaDataController().F(this.l6, this.s4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.T.setVisibility(4);
                            if (!this.inPreviewMode && !this.mb && this.g4 != 3) {
                                this.a0.setVisibility(0);
                            }
                        }
                        z = false;
                    }
                    j5();
                    R4(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.s1 != null && (ms1Var = this.a0) != null && ms1Var.H0()) {
                        this.s1.d();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.T.setVisibility(4);
            }
            if (z) {
                this.a0.J0(false);
                if (getParentActivity() != null) {
                    gm.t1(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final void setInMenuMode(boolean z) {
        int i;
        super.setInMenuMode(z);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            r6 t = aVar.t();
            if (this.inMenuMode) {
                i = 8;
            } else {
                i = 0;
            }
            t.setVisibility(i);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z) {
        boolean z2;
        boolean z3;
        vr1 vr1Var;
        k47 k47Var;
        TLRPC.Message message;
        long j;
        ee0 ee0Var;
        float f;
        float f2;
        ms1 ms1Var;
        int i;
        float f3;
        super.setInPreviewMode(z);
        int i2 = 8;
        boolean z4 = true;
        if (this.f != null && this.q0 != null) {
            TLRPC.UserFull X1 = getMessagesController().X1(this.f.id);
            if (X1 != null && X1.phone_calls_available) {
                this.ia = !this.inPreviewMode;
                this.q0.e(0);
            } else {
                this.ia = false;
                this.q0.e(8);
            }
        }
        pr1 pr1Var = this.p1;
        float f4 = 0.0f;
        if (pr1Var != null) {
            pr1Var.setOccupyStatusBar(!z);
            pr1 pr1Var2 = this.p1;
            if (!this.inPreviewMode) {
                f3 = 52.0f;
            } else {
                f3 = 0.0f;
            }
            pr1Var2.setLayoutParams(qoe.d(-2, -1.0f, 51, f3, 0.0f, 52.0f, 0.0f));
        }
        ms1 ms1Var2 = this.a0;
        if (ms1Var2 != null) {
            if (!z) {
                i = 0;
            } else {
                i = 4;
            }
            ms1Var2.setVisibility(i);
        }
        fdb fdbVar = this.s1;
        if (fdbVar != null) {
            if (this.r5 && !z && ((ms1Var = this.a0) == null || !ms1Var.p4)) {
                i2 = 0;
            }
            fdbVar.setVisibility(i2);
        }
        es1 es1Var = this.X1;
        if (es1Var != null) {
            ViewPropertyAnimator animate = es1Var.animate();
            if (!this.a0.p4 && !isInPreviewMode()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            animate.alpha(f2).setInterpolator(d53.f).start();
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            if (!z) {
                ee0Var = new ee0(false);
            } else {
                ee0Var = null;
            }
            aVar.setBackButtonDrawable(ee0Var);
            r7 r7Var = this.j0;
            if (r7Var != null) {
                if (!z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                r7Var.setAlpha(f);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                if (!z) {
                    f4 = 1.0f;
                }
                q6Var.i = f4;
                r7 r7Var2 = q6Var.m;
                if (r7Var2 != null) {
                    r7Var2.setAlpha(f4);
                }
            }
        }
        vr1 vr1Var2 = this.A0;
        if (vr1Var2 != null) {
            int childCount = vr1Var2.getChildCount();
            int i3 = 0;
            while (true) {
                vr1Var = this.A0;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = vr1Var.getChildAt(i3);
                boolean z5 = childAt instanceof rc2;
                if (z5) {
                    k47Var = ((rc2) childAt).getMessageObject();
                } else if (childAt instanceof cm1) {
                    k47Var = ((cm1) childAt).getMessageObject();
                } else {
                    k47Var = null;
                }
                if (k47Var != null && (message = k47Var.k) != null && message.media_unread && message.mentioned) {
                    if (!k47.Q4(message) && !k47Var.g4()) {
                        int i4 = this.D6 - 1;
                        this.D6 = i4;
                        if (i4 <= 0) {
                            this.D6 = 0;
                            this.E6 = true;
                            mc(false);
                        } else {
                            this.y1.c(2, i4, true);
                        }
                        oc7 messagesController = getMessagesController();
                        int e1 = k47Var.e1();
                        if (sd2.T(this.e)) {
                            j = this.e.id;
                        } else {
                            j = 0;
                        }
                        messagesController.r3(j, e1, this.l6);
                        k47Var.k.media_unread = false;
                    }
                    if (z5) {
                        rc2 rc2Var = (rc2) childAt;
                        rc2Var.setHighlighted(false);
                        rc2Var.r3();
                    }
                }
                i3++;
            }
            vr1Var.setItemAnimator(null);
        }
        Pc(false);
        sd();
        gs1 gs1Var = this.m2;
        if (gs1Var != null) {
            if (!z && !this.mb) {
                z3 = true;
            } else {
                z3 = false;
            }
            gs1Var.setEnabled(z3);
        }
        gs1 gs1Var2 = this.o2;
        if (gs1Var2 != null) {
            if (!z && !this.mb) {
                z2 = true;
            } else {
                z2 = false;
            }
            gs1Var2.setEnabled(z2);
        }
        lt1 lt1Var = this.M2;
        if (lt1Var != null) {
            lt1Var.setEnabled(!isInPreviewMode());
        }
        mu1 mu1Var = this.m1;
        if (mu1Var != null) {
            if (this.inBubbleMode || this.mb || this.inPreviewMode) {
                z4 = false;
            }
            mu1Var.setOccupyStatusBar(z4);
        }
    }

    public final void t5(Runnable runnable, nk nkVar, boolean z) {
        if (nkVar != null && z) {
            co1 co1Var = new co1(this, nkVar, runnable, (byte) 2);
            jva u = jva.u(this.currentAccount, nkVar.a);
            if (!u.e) {
                u.n(co1Var, true, true);
                return;
            } else {
                co1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void t6(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.t6(int, java.lang.Object[]):void");
    }

    public final float t7(float f) {
        yv1 yv1Var = this.Aa;
        if (yv1Var != null) {
            this = yv1Var;
        }
        r02 r02Var = this.b1;
        if (r02Var == null) {
            return 0.0f;
        }
        return r02Var.c(f);
    }

    public final void t8(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nxa.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public final void t9(k47 k47Var, Long l, Runnable runnable) {
        jva.v(this.currentAccount, false).j0(k47Var, l.longValue(), runnable, false);
    }

    public final boolean ta(String str, rc2 rc2Var, CharacterStyle characterStyle, int i, int i2) {
        yv1 yv1Var;
        an1 an1Var;
        boolean z;
        yv1 yv1Var2;
        Integer num;
        int parseInt;
        int i3;
        Integer num2;
        TLRPC.TL_forumTopic f;
        if (this.e == null || str == null || this.g4 != 0) {
            return false;
        }
        if (rc2Var != null && (characterStyle != null || i2 != 1)) {
            yv1Var = this;
            an1Var = new an1(yv1Var, i, i2, characterStyle, rc2Var);
        } else {
            yv1Var = this;
            an1Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (sd2.K(yv1Var.e, false) != null) {
                try {
                    if (Ad == null) {
                        Ad = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Bd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Ad.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z = false;
                        try {
                            if (sd2.O(matcher.group(2), yv1Var.e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g = wf8.g(parse);
                                if (intValue != 0 || intValue2 != 0) {
                                    return false;
                                }
                                if (matcher.group(4) != null) {
                                    i3 = Integer.parseInt(matcher.group(3));
                                    parseInt = Integer.parseInt(matcher.group(4));
                                } else {
                                    parseInt = Integer.parseInt(matcher.group(3));
                                    i3 = 0;
                                }
                                if (sd2.c0(yv1Var.e) && i3 != yv1Var.d()) {
                                    return false;
                                }
                                yv1Var.L7 = true;
                                if (yv1Var.g4 == 2) {
                                    yv1Var.n9.Z(parseInt);
                                    yv1Var.finishFragment();
                                    return true;
                                }
                                int U = LaunchActivity.U(parse);
                                yv1Var.Q7 = U;
                                if (U >= 0) {
                                    yv1Var.R7 = parseInt;
                                }
                                yv1Var.sb(parseInt, i, true, 0, false, 0, num, g, an1Var);
                                return true;
                            }
                            yv1Var2 = yv1Var;
                        } catch (Exception e) {
                            e = e;
                            fc4.g(e, true);
                            return z;
                        }
                    } else {
                        yv1Var2 = yv1Var;
                        z = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Bd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (sd2.O(matcher2.group(2), yv1Var2.e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        yv1Var2.y8 = queryParameter2;
                                        yv1Var2.b5(true);
                                        return true;
                                    }
                                    return z;
                                }
                                return z;
                            }
                            return z;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            return z;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (sd2.O(lowerCase, yv1Var2.e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (yv1Var2.g4 == 2) {
                            yv1Var2.n9.Z(intValue3);
                            yv1Var2.finishFragment();
                            return true;
                        }
                        yv1Var2.sb(intValue3, i, true, 0, false, 0, null, null, an1Var);
                        return true;
                    }
                    return z;
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                }
            } else {
                yv1 yv1Var3 = yv1Var;
                try {
                    Pattern pattern = Cd;
                    if (pattern == null) {
                        pattern = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                        Cd = pattern;
                    }
                    Matcher matcher3 = pattern.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt2 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != yv1Var3.e.id || parseInt2 == 0) {
                        return false;
                    }
                    Uri parse3 = Uri.parse(str);
                    int intValue6 = Utilities.z(parse3.getQueryParameter("thread")).intValue();
                    int intValue7 = Utilities.z(parse3.getQueryParameter("topic")).intValue();
                    int intValue8 = Utilities.z(parse3.getQueryParameter("comment")).intValue();
                    String queryParameter3 = parse3.getQueryParameter("task");
                    if (queryParameter3 != null) {
                        num2 = Utilities.z(queryParameter3);
                    } else {
                        num2 = null;
                    }
                    byte[] g2 = wf8.g(parse3);
                    if (intValue6 != 0 || intValue7 != 0 || intValue8 != 0) {
                        return false;
                    }
                    if (sd2.c0(yv1Var3.e) && (f = yv1Var3.getMessagesController().g4.f(parseLong, parseInt2)) != null) {
                        TLRPC.TL_forumTopic tL_forumTopic = yv1Var3.r4;
                        if (tL_forumTopic == null || tL_forumTopic.id != f.id) {
                            return false;
                        }
                        return true;
                    }
                    yv1Var3.L7 = true;
                    if (yv1Var3.g4 == 2) {
                        yv1Var3.n9.Z(parseInt2);
                        yv1Var3.finishFragment();
                        return true;
                    }
                    yv1Var3.sb(parseInt2, i, true, 0, false, 0, num2, g2, an1Var);
                    return true;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.z(parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.A(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.z(parse4.getQueryParameter("thread")).intValue();
            long j = yv1Var.e.id;
            if (longValue != j || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                pa(j, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            yv1 yv1Var4 = yv1Var;
            yv1Var4.L7 = true;
            if (yv1Var4.g4 == 2) {
                yv1Var4.n9.Z(intValue9);
                yv1Var4.finishFragment();
                return true;
            }
            yv1Var4.sb(intValue9, i, true, 0, false, 0, null, null, an1Var);
            return true;
        }
    }

    public final void tb(java.lang.CharSequence r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.tb(java.lang.CharSequence, boolean):void");
    }

    public final void tc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = jb6.M0(2131752610, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752611, null);
        alertDialog$Builder.j(jb6.M0(2131746054, null), new gm1(this, (byte) 10));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
    }

    public final void td() {
        boolean z;
        int i;
        int i2;
        c47 c47Var;
        int i3 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.o6;
        if (i3 == 0) {
            ArrayList<k47> arrayList = new ArrayList<>();
            for (int i4 = 0; i4 < sparseArrayArr.length; i4++) {
                for (int i5 = 0; i5 < sparseArrayArr[i4].size(); i5++) {
                    k47 k47Var = (k47) sparseArrayArr[i4].valueAt(i5);
                    if (k47Var.z2()) {
                        f47 v7 = v7(k47Var);
                        if (v7 != null) {
                            c47Var = v7.d(k47Var);
                        } else {
                            c47Var = null;
                        }
                        if (c47Var != null) {
                            if (!c47Var.h) {
                            }
                        }
                    }
                    arrayList.add(k47Var);
                }
            }
            ft1 ft1Var = this.Jb;
            if (ft1Var != null) {
                ft1Var.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Jb.getSelectedReactions().isEmpty();
                z = !isEmpty;
                ft1 ft1Var2 = this.Jb;
                if (isEmpty) {
                    i2 = 2131745606;
                } else {
                    i2 = 2131745605;
                }
                ft1Var2.setHint(jb6.M0(i2, null));
                gm.d3(new mz(this, (byte) 15), 120L);
            } else {
                z = !v29.f(arrayList).isEmpty();
            }
            r7 j = this.actionBar.q(null).j(28);
            if (j != null) {
                if (z) {
                    i = 2131231903;
                } else {
                    i = 2131231905;
                }
                s09 s09Var = j.y;
                if (s09Var != null && j.E != i) {
                    j.E = i;
                    gm.L3(s09Var, i);
                }
            }
        }
        if (this.va != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                arrayList2.add((k47) sparseArray.valueAt(i6));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                arrayList2.add((k47) sparseArray2.valueAt(i7));
            }
            this.va.setSelectedMessages(arrayList2);
        }
    }

    public final void u5() {
        if (this.O3 != null) {
            return;
        }
        kt1 kt1Var = new kt1(this, getParentActivity(), this, this.Ba);
        this.O3 = kt1Var;
        this.m1.addView(kt1Var, 17, qoe.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void u6(java.lang.Object... r89) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.u6(java.lang.Object[]):void");
    }

    public final float u7(izb izbVar) {
        float f;
        mzb mzbVar = this.g2;
        if (mzbVar != null) {
            float L = gm.L(7.0f);
            float h = mzbVar.h(izbVar);
            if (izbVar == izb.b) {
                f = 64.0f;
            } else {
                f = 36.0f;
            }
            return (gm.L(f) + L) * h;
        }
        return 0.0f;
    }

    public final void u8(int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z, jn1 jn1Var) {
        String str4;
        j1c j1cVar;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = getParentActivity();
            int i2 = iArr[0];
            ho1 ho1Var = new ho1(this, (byte) 5);
            String[] strArr = s1c.R1;
            if (parentActivity == null) {
                j1cVar = null;
            } else {
                j1c j1cVar2 = new j1c(parentActivity, str, str4, inputPeer, i2, richMessage, ho1Var);
                j1cVar2.N0(z);
                j1cVar2.M1 = this;
                j1cVar2.N1 = jn1Var;
                if (getParentActivity() != null) {
                    showDialog(j1cVar2);
                }
                j1cVar = j1cVar2;
            }
            j1cVar.p0 = false;
            N5(false);
            SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
            int i3 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i3 > 0) {
                SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i3 - 1).apply();
                zd(true);
            }
        }
    }

    public final void u9(TLRPC.TL_error tL_error, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        ik.c0(this.currentAccount, tL_error, this, tL_messages_editMessage, new Object[0]);
    }

    public final void ua(k47 k47Var) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = k47Var.k.peer_id;
        long j = peer.channel_id;
        if (j != 0) {
            bundle.putLong("chat_id", j);
        } else {
            long j2 = peer.chat_id;
            if (j2 != 0) {
                bundle.putLong("chat_id", j2);
            } else {
                long j3 = peer.user_id;
                if (j3 != 0) {
                    bundle.putLong("user_id", j3);
                }
            }
        }
        bundle.putInt("message_id", k47Var.L1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().A(bundle, this, null, null)) {
            presentFragment(new yv1(bundle));
        }
    }

    public final void ub(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.D3 = user;
        this.E3 = chat;
        if (this.k0 != null && this.X1 != null) {
            if (user == null) {
                if (chat != null) {
                    str = chat.title;
                } else {
                    return;
                }
            } else {
                str = user.first_name;
                if (TextUtils.isEmpty(str)) {
                    str = this.D3.last_name;
                }
            }
            if (str != null) {
                if (str.length() > 10) {
                    str = str.substring(0, 10);
                }
                this.C3 = false;
                String M0 = jb6.M0(2131745500, null);
                SpannableString spannableString = new SpannableString(kt6.o(M0, " ", str));
                spannableString.setSpan(new do4(cmb.A8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                this.k0.setSearchFieldCaption(spannableString);
                this.X1.getAdapter().U(null, 0, null, false, true);
                this.k0.setSearchFieldHint(null);
                this.k0.o();
                hs6 mediaDataController = getMediaDataController();
                this.I3 = "";
                mediaDataController.Z1("", this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, true, this.F3);
            }
        }
    }

    public final void uc() {
        String str;
        if (this.uc != null) {
            return;
        }
        if (this.F5 != null) {
            str = getMessagesController().b1(this.F5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = jb6.M0(2131743498, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0(null, null, 2131743499, str));
        alertDialog$Builder.j(jb6.M0(2131751272, null), new gm1(this, (byte) 20));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new gm1(this, (byte) 21));
        heVar.setOnDismissListener(new km1(this, (byte) 8));
        this.uc = alertDialog$Builder.o();
    }

    public final void ud() {
        q02 q02Var;
        q6 q6Var;
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            if (this.g4 != 1 && !this.v4 && !g8()) {
                q02Var = null;
            } else {
                q02Var = this.y1;
            }
            ms1Var.setSideButtonsForAttach(q02Var);
            boolean g8 = g8();
            if (this.Gb != g8) {
                this.Gb = g8;
                r7 r7Var = this.j0;
                if ((r7Var != null && r7Var.getVisibility() == 0) || ((q6Var = this.g0) != null && q6Var.l == 0)) {
                    org.telegram.ui.ActionBar.a aVar = this.actionBar;
                    if (!aVar.o0 && !aVar.y()) {
                        if (this.a0.H0() && TextUtils.isEmpty(this.a0.getSlowModeTimer()) && !g8()) {
                            q6 q6Var2 = this.g0;
                            if (q6Var2 != null) {
                                q6Var2.e(0);
                            }
                            r7 r7Var2 = this.j0;
                            if (r7Var2 != null) {
                                r7Var2.setVisibility(8);
                            }
                            qr2 qr2Var = this.f0;
                            if (qr2Var != null) {
                                qr2Var.b(true);
                            }
                        } else {
                            q6 q6Var3 = this.g0;
                            if (q6Var3 != null) {
                                q6Var3.e(8);
                            }
                            r7 r7Var3 = this.j0;
                            if (r7Var3 != null) {
                                r7Var3.setVisibility(0);
                            }
                            qr2 qr2Var2 = this.f0;
                            if (qr2Var2 != null) {
                                qr2Var2.b(false);
                            }
                        }
                        pr1 pr1Var = this.p1;
                        if (pr1Var != null) {
                            pr1Var.l0 = false;
                        }
                    }
                }
            }
        }
    }

    public final void v5(boolean z) {
        long j;
        if (System.currentTimeMillis() - this.vc > 1000) {
            z = true;
        }
        ho1 ho1Var = this.wc;
        gm.r(ho1Var);
        if (z) {
            j = 0;
        } else {
            j = 150;
        }
        gm.d3(ho1Var, j);
    }

    public final void v6(int i, ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        yv1 yv1Var;
        int i2;
        yv1 yv1Var2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && yv1Var2.s5()) {
            int i3 = 0;
            while (true) {
                if (i3 < arrayList3.size()) {
                    z5a z5aVar = (z5a) arrayList3.get(i3);
                    if (z5aVar.m == null && z5aVar.k == null) {
                        break;
                    }
                    i3++;
                } else if (!TextUtils.isEmpty(((z5a) arrayList3.get(0)).d)) {
                    y5a b = y5a.b(((z5a) arrayList3.get(0)).d, yv1Var2.l6, yv1Var2.F5, yv1Var2.m4, null, false, ((z5a) arrayList3.get(0)).i, null, null, z, i, 0, null, false);
                    b.K = yv1Var2.X6();
                    a6a.B(yv1Var2.currentAccount).q0(b);
                }
            }
            int i4 = 0;
            while (i4 < arrayList3.size()) {
                z5a z5aVar2 = (z5a) arrayList3.get(i4);
                if (z5aVar2.m != null && z5aVar2.k == null) {
                    j5 accountInstance = yv1Var2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = z5aVar2.m;
                    HashMap hashMap = z5aVar2.n;
                    int i5 = i4;
                    a6a.R(i, yv1Var2.l6, 0L, yv1Var2.k7(), accountInstance, yv1Var2.D5, yv1Var2.F5, yv1Var2.m4, yv1Var2.X6(), hashMap, botInlineResult, null, yv1Var2, z);
                    arrayList2 = arrayList;
                    yv1Var = yv1Var2;
                    arrayList2.remove(i5);
                    i2 = i5 - 1;
                } else {
                    arrayList2 = arrayList3;
                    yv1Var = yv1Var2;
                    i2 = i4;
                }
                i4 = i2 + 1;
                yv1Var2 = yv1Var;
                arrayList3 = arrayList2;
            }
            ArrayList arrayList4 = arrayList3;
            yv1 yv1Var3 = yv1Var2;
            if (!arrayList4.isEmpty()) {
                yv1Var3.F6(((z5a) arrayList4.get(0)).d, ((z5a) arrayList4.get(0)).i);
                a6a.W(yv1Var3.getAccountInstance(), arrayList4, yv1Var3.l6, yv1Var3.F5, yv1Var3.m4, null, yv1Var3.D5, false, true, yv1Var3.H5, null, z, i, 0, ((z5a) arrayList4.get(0)).t, null, yv1Var3.X6(), 0L, false, 0L, yv1Var3.k7(), yv1Var3.y5, null, false);
                E4();
                if (i != 0) {
                    int i6 = this.h4;
                    if (i6 == -1) {
                        this.h4 = 0;
                        i6 = 0;
                    }
                    this.h4 = arrayList.size() + i6;
                    md(true);
                }
            }
        }
    }

    public final f47 v7(k47 k47Var) {
        if (k47Var.c1() != 0) {
            f47 f47Var = (f47) this.P6.f(k47Var.c1());
            if (f47Var == null || (f47Var.d.size() > 1 && f47Var.d(k47Var) != null)) {
                return f47Var;
            }
            return null;
        }
        return null;
    }

    public final void v8(int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, jn1 jn1Var) {
        String str4;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            s1c.P0(getParentActivity(), this, inputPeer, iArr[0], this.v5.M2, str, str4, charSequence, z, jn1Var, new en1(this, (byte) 26)).p0 = false;
            N5(false);
            SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
            int i2 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i2 > 0) {
                SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i2 - 1).apply();
                zd(true);
            }
        }
    }

    public final void v9(TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j;
        nm7 f = nm7.f(this.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.id;
        long e = getUserConfig().e();
        long j2 = this.l6;
        if (e == j2) {
            j = 0;
        } else {
            j = -j2;
        }
        Long valueOf = Long.valueOf(j);
        Boolean bool = Boolean.TRUE;
        f.k(nm7.v, arrayList, valueOf, bool, bool);
    }

    public final void va(k47 k47Var) {
        if (m9c.D(this.f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f.id) {
                J(messageFwdHeader.saved_from_msg_id, k47Var.e1(), 0, 0, true, true);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = k47Var.k.fwd_from.saved_from_peer;
        long j = peer.channel_id;
        if (j != 0) {
            bundle.putLong("chat_id", j);
        } else {
            long j2 = peer.chat_id;
            if (j2 != 0) {
                bundle.putLong("chat_id", j2);
            } else {
                long j3 = peer.user_id;
                if (j3 != 0) {
                    bundle.putLong("user_id", j3);
                }
            }
        }
        bundle.putInt("message_id", k47Var.k.fwd_from.saved_from_msg_id);
        if (getMessagesController().A(bundle, this, null, null)) {
            presentFragment(new yv1(bundle));
        }
    }

    public final void vb(View view, k47 k47Var, v29 v29Var, View view2, float f, float f2, k39 k39Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        k39 k39Var2;
        String str;
        TLRPC.Document e;
        k47 b;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        hg0 hg0Var;
        kta ktaVar;
        int[] iArr;
        int[] iArr2;
        int i;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z6;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!X7() && k47Var != null) {
            if (getMessagesController().u2()) {
                h5.b(this.currentAccount);
                return;
            }
            int i2 = 2;
            if (k39Var != null && k39Var.a) {
                N5(true);
                if (view == null) {
                    hg0Var = L6(k47Var.e1(), true);
                } else {
                    hg0Var = view;
                }
                String str2 = "";
                if (z2) {
                    if (hg0Var != null) {
                        try {
                            hg0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = k47Var.k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j = -cva.b(k47Var).a;
                    TLRPC.ChatFull M0 = getMessagesController().M0(j);
                    if (M0 != null && !M0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j));
                        c41 b0 = c41.b0(this);
                        if (L0 != null) {
                            str2 = L0.title;
                        }
                        b0.Q(2131624221, 36, gm.S2(jb6.a0(null, null, 2131744721, str2))).k(true);
                        return;
                    }
                    hva hvaVar = jva.v(this.currentAccount, false).B;
                    if (hvaVar != null) {
                        hvaVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i3 = this.currentAccount;
                    long j2 = this.l6;
                    if (M0 != null && !M0.paid_reactions_available) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    eya eyaVar = new eya(parentActivity, i3, j2, this, k47Var, arrayList, z6, false, 0L, this.Ba);
                    k47Var.e1();
                    eyaVar.P1 = this;
                    eyaVar.Q1 = hg0Var;
                    eyaVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j3 = -cva.b(k47Var).a;
                TLRPC.ChatFull M02 = getMessagesController().M0(j3);
                if (M02 != null && !M02.paid_reactions_available) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(j3));
                    c41 b02 = c41.b0(this);
                    if (L02 != null) {
                        str2 = L02.title;
                    }
                    b02.Q(2131624221, 36, gm.S2(jb6.a0(null, null, 2131744721, str2))).k(true);
                    return;
                }
                hva b03 = jva.v(this.currentAccount, false).b0(k47Var, this, 1L, true, true, null);
                if (b03 != null && (hg0Var instanceof hg0)) {
                    if (this.id == null) {
                        this.id = new kta(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        ktaVar = null;
                    } else {
                        ViewParent parent = this.id.getParent();
                        kta ktaVar2 = this.id;
                        if (parent != layoutContainer) {
                            gm.B2(ktaVar2);
                            layoutContainer.addView(this.id, qoe.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(ktaVar2) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.id.bringToFront();
                        }
                        ktaVar = this.id;
                    }
                    ktaVar.setMessageCell((hg0) hg0Var);
                    b03.o = ktaVar;
                    ktaVar.J = false;
                    ktaVar.b(1.0f, null);
                    hg0Var.getLocationInWindow(new int[2]);
                    ktaVar.getLocationInWindow(new int[2]);
                    float f3 = (iArr[0] - iArr2[0]) + f;
                    float f4 = (iArr[1] - iArr2[1]) + f2;
                    if (hg0Var instanceof rc2) {
                        i = ((rc2) hg0Var).W;
                    } else {
                        i = 0;
                    }
                    ktaVar.d(f3, f4 + i, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().p() && (message = k47Var.k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new kj8((d) this, 24, true).show();
            } else {
                if (k47Var.w2() && k39Var != null) {
                    for (int i4 = 0; i4 < k47Var.k.reactions.results.size(); i4++) {
                        TLRPC.ReactionCount reactionCount = k47Var.k.reactions.results.get(i4);
                        if (k39Var.f(reactionCount.reaction)) {
                            z5 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z5 = false;
                if (!z5 && (chat = this.e) != null && !sd2.V(chat) && !sd2.w(26, this.e)) {
                    ts2.u(null, 2131745325, c41.b0(this), 2131624007, 36);
                    return;
                }
                g39.b(false);
                int size = k47Var.y0().size();
                boolean G5 = k47Var.G5(k39Var, z2);
                int e1 = k47Var.e1();
                long c1 = k47Var.c1();
                vh6 vh6Var = this.P6;
                if (vh6Var.f(c1) != null && (b = ((f47) vh6Var.f(k47Var.c1())).b(9)) != null) {
                    e1 = b.e1();
                }
                int i5 = e1;
                if (G5) {
                    hg0 L6 = L6(i5, true);
                    if (!gda.s1 && L6 != null && k39Var != null && !getUserConfig().p() && size == 1) {
                        gda.B(true);
                        long j4 = k39Var.g;
                        int i6 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                        int i7 = this.currentAccount;
                        if (i6 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i7).r.get(k39Var.f);
                            if (tL_availableReaction != null) {
                                e = tL_availableReaction.center_icon;
                            }
                        } else {
                            e = vm.e(i7, j4);
                        }
                        if (e != null) {
                            u31 q = c41.b0(this).q(e, jb6.M0(2131752155, null));
                            q.j = 5000;
                            q.j();
                        }
                    }
                    if (!z) {
                        int i8 = this.currentAccount;
                        if (v29Var != null) {
                            if (z2) {
                                i2 = 0;
                            }
                        } else {
                            i2 = 1;
                        }
                        g39.d(this, v29Var, L6, view2, f, f2, k39Var, i8, i2);
                    }
                }
                if (G5 && k39Var != null && (str = k39Var.f) != null) {
                    gm.g2(jb6.a0(null, null, 2131754724, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(k47Var.y0());
                a6a sendMessagesHelper = getSendMessagesHelper();
                if (G5) {
                    k39Var2 = k39Var;
                } else {
                    k39Var2 = null;
                }
                xq1 xq1Var = new xq1(this, z4, z, i5, G5, v29Var, f, f2, k39Var, k47Var);
                this.Uc = xq1Var;
                sendMessagesHelper.r0(k47Var, arrayList2, k39Var2, z2, z3, this, xq1Var);
                if (z || z4) {
                    Yc(k47Var, true);
                    this.Uc.run();
                }
                if (!z4) {
                    gm.d3(this.Uc, 50L);
                }
            }
        }
    }

    public final void vc(View view, CharSequence charSequence, boolean z) {
        hg5 hg5Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z || ((hg5Var = this.B2) != null && hg5Var.W)) {
                this.B2.t(gm.S2(jb6.a0("SlowModeHint", null, 2131745045, charSequence)));
                if (z) {
                    this.B2.x(view, true);
                }
            }
        }
    }

    public final void vd(boolean z, boolean z2) {
        boolean z3;
        k47 k47Var;
        kmc kmcVar;
        if (this.fragmentView != null && !this.I5) {
            int childCount = this.A0.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = this.A0.getChildAt(i);
                    if (childAt instanceof cm1) {
                        cm1 cm1Var = (cm1) childAt;
                        k47 messageObject = cm1Var.getMessageObject();
                        if (this.d8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.d8 && cm1Var.S()) {
                            mmc mmcVar = cm1Var.J0;
                            if (!mmcVar.h0 && (mmcVar.e0 == 0 || (kmcVar = mmcVar.d0) == null || kmcVar.c())) {
                                mmcVar.e();
                                kmc kmcVar2 = mmcVar.d0;
                                kmcVar2.v = 600L;
                                kmcVar2.b = -1L;
                                kmcVar2.c = -1L;
                                mmcVar.e0 = SystemClock.elapsedRealtime();
                                mmcVar.f0 = false;
                                mmcVar.a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof rc2) {
                        rc2 rc2Var = (rc2) childAt;
                        k47 messageObject2 = rc2Var.getMessageObject();
                        if (this.J8 != null && ((messageObject2.g4() || k47.K4(messageObject2.k)) && !messageObject2.S4() && MediaController.w().D(messageObject2))) {
                            ImageReceiver photoImage = rc2Var.getPhotoImage();
                            this.J8.setTranslationX(rc2Var.getX() + photoImage.L0);
                            this.J8.setTranslationY((this.A0.getY() + ((rc2Var.getY() + rc2Var.getPaddingTop()) + photoImage.M0)) - this.J8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J8.getLayoutParams();
                            boolean g4 = messageObject2.g4();
                            ps1 ps1Var = this.J8;
                            if (g4) {
                                ps1Var.setTag(2131296593, null);
                                if (layoutParams.width != gm.b3(f8(), U7()) || layoutParams.height != gm.b3(f8(), U7())) {
                                    int b3 = gm.b3(f8(), U7());
                                    layoutParams.height = b3;
                                    layoutParams.width = b3;
                                    this.L8.setResizeMode(0);
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                float b32 = (gm.b3(f8(), U7()) + (gm.x << 1)) / gm.b3(f8(), U7());
                                float b33 = rc2Var.getPhotoImage().N0 / gm.b3(f8(), U7());
                                if (this.J8.getScaleX() != b33) {
                                    this.J8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.J8.setPivotX(0.0f);
                                this.J8.setPivotY(0.0f);
                                this.J8.setScaleX(b33);
                                this.J8.setScaleY(b33);
                                this.M8.setScaleX(b32);
                                this.M8.setScaleY(b32);
                            } else {
                                ps1Var.setTag(2131296593, photoImage);
                                if (layoutParams.width != photoImage.N0 || layoutParams.height != photoImage.O0) {
                                    this.L8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.N0;
                                    layoutParams.height = (int) photoImage.O0;
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                this.M8.setScaleX(1.0f);
                                this.M8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.J8.invalidate();
                            z3 = true;
                        }
                    }
                    i++;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z && this.J8 != null && (k47Var = MediaController.w().v0) != null && k47Var.T == 0) {
                if (!z3) {
                    if (this.B3 && k47.K4(k47Var.k)) {
                        MediaController.w().l(true, true, false, false);
                        return;
                    }
                    this.J8.setTranslationY((-gm.b3(f8(), U7())) - 100);
                    this.fragmentView.invalidate();
                    if (k47Var.g4() || k47.K4(k47Var.k)) {
                        if (!this.B3 && PipRoundVideoView.G == null) {
                            if (z2) {
                                J(k47Var.e1(), 0, 0, 0, false, true);
                                return;
                            }
                            return;
                        }
                        MediaController.w().j0(false);
                        return;
                    }
                    return;
                }
                MediaController.w().j0(true);
                if (!k47Var.g4() && !this.N8) {
                    this.A0.invalidate();
                }
            }
        }
    }

    public final void w5() {
        int u7 = (int) (u7(izb.c) + this.U.getInputBubbleHeight() + this.w.d() + gm.L(9.0f) + gm.L(7.0f));
        this.Z.setFadeZoneBottom(u7);
        int b = pqe.b(gm.L(36.0f) + (this.m1.getMeasuredHeight() - u7), 0, this.m1.getMeasuredHeight());
        int measuredWidth = this.m1.getMeasuredWidth();
        Rect rect = Fd;
        rect.set(0, 0, measuredWidth, b);
        rect.set(0, this.Xa, this.A0.getMeasuredWidth(), gm.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Ya) - u7));
    }

    public final void w6(View view) {
        x6(view, false);
    }

    public final float w7(rc2 rc2Var, float f) {
        int[] iArr = this.Sb;
        rc2Var.getLocationInWindow(iArr);
        int i = iArr[0];
        this.m1.getLocationInWindow(iArr);
        return (i - iArr[0]) + f;
    }

    public final void w8(int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, jn1 jn1Var) {
        String str3;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            s1c.P0(getParentActivity(), this, inputPeer, iArr[0], this.v5.M2, strArr[0], str3, charSequence, z, jn1Var, new ho1(this, (byte) 6)).p0 = false;
            N5(false);
            SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
            int i2 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i2 > 0) {
                SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i2 - 1).apply();
                zd(true);
            }
        }
    }

    public final void w9() {
        if (!r5(this.a0.getSendButton())) {
            if (getMediaController().D(this.v5)) {
                getMediaController().l(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = getMessagesController().i1(this.l6);
            if (this.w5 != null) {
                for (int i = 0; i < this.w5.d.size(); i++) {
                    tL_messages_sendScheduledMessages.id.add(Integer.valueOf(((k47) this.w5.d.get(i)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.id.add(Integer.valueOf(this.v5.e1()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new pm(this, tL_messages_sendScheduledMessages, (byte) 15));
        }
    }

    public final boolean wa(rc2 rc2Var, k47 k47Var) {
        rc2 rc2Var2;
        boolean z;
        long j;
        long j2;
        long j3;
        boolean l1;
        kn m;
        Bitmap m2;
        if (rc2Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2Var2 = (rc2) childAt;
                    if (rc2Var2.getMessageObject().T(k47Var)) {
                        break;
                    }
                }
            }
        }
        rc2Var2 = rc2Var;
        if (k47.K4(k47Var.k)) {
            Db(k47Var, true);
        }
        if (k47.K4(k47Var.k) && !k47Var.D2(true) && gda.x0 && k47Var.B() && !pg3.B(k47.B0(k47Var.k)) && !k47Var.z0 && !k47Var.y0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bc4 fileLoader = getFileLoader();
            TLRPC.Document F0 = k47Var.F0();
            fileLoader.getClass();
            bc4.K.c(new pz2(fileLoader, F0, k47Var, (byte) 25));
        }
        PhotoViewer.r0().T1(null, this, this.Ba);
        k47 k47Var2 = MediaController.w().v0;
        if (rc2Var2 != null && k47Var2 != null && k47.K4(k47Var2.k)) {
            getFileLoader().c0(k47Var2.F0(), false);
            if (k47Var2.T(k47Var) && (m = rc2Var2.getPhotoImage().m()) != null && this.M8 != null && this.J8.getTag() != null && (m2 = m.m()) != null) {
                try {
                    Bitmap bitmap = this.M8.getBitmap(m2.getWidth(), m2.getHeight());
                    new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
            MediaController.w().l(true, true, false, k47Var2.T(k47Var));
        }
        if (this.g4 == 1 && (k47.K4(k47Var.k) || k47Var.D == 1)) {
            PhotoViewer.r0().k4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.M6.size();
            for (int i2 = 0; i2 < size; i2++) {
                k47 k47Var3 = (k47) this.M6.get(i2);
                if (k47.K4(k47Var3.k) || k47Var3.D == 1) {
                    arrayList.add(0, k47Var3);
                }
            }
            l1 = PhotoViewer.r0().n1(arrayList, arrayList.indexOf(k47Var), this.l6, 0L, d(), this.db);
        } else {
            PhotoViewer r0 = PhotoViewer.r0();
            if (k47Var.D != 0) {
                j = this.l6;
                j2 = this.d7;
                j3 = d();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            l1 = r0.l1(k47Var, this, j, j2, j3, this.db);
            if (!l1 && z) {
                getFileLoader().f(k47Var.F0());
            }
        }
        H7(false);
        MediaController.w().w0 = null;
        return l1;
    }

    public final void wb() {
        mx6[] mx6VarArr;
        bw1 bw1Var;
        aw1 aw1Var;
        jw1[] jw1VarArr;
        wv1 wv1Var = this.Ba;
        if (wv1Var != null) {
            wv1Var.s();
        }
        jr1 jr1Var = this.y;
        if (jr1Var != null) {
            jr1Var.d();
        }
        jr1 jr1Var2 = this.x;
        if (jr1Var2 != null) {
            jr1Var2.d();
        }
        jr1 jr1Var3 = this.E;
        if (jr1Var3 != null) {
            jr1Var3.d();
        }
        ms1 ms1Var = this.a0;
        if (ms1Var != null) {
            ms1Var.updateColors();
        }
        e51 e51Var = this.Y1;
        if (e51Var != null) {
            e51Var.H0();
        }
        vr1 vr1Var = this.A0;
        if (vr1Var != null) {
            int childCount = vr1Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof rc2) {
                    ((rc2) childAt).A0(0);
                } else if (childAt instanceof cm1) {
                    ((cm1) childAt).setInvalidateColors(true);
                }
            }
        }
        m8 m8Var = this.g9;
        if (m8Var != null && m8Var.getContentView() != null) {
            View contentView = this.g9.getContentView();
            int themedColor = getThemedColor(cmb.F8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        tc8 tc8Var = this.O2;
        if (tc8Var != null) {
            tc8Var.d();
        }
        ns1 ns1Var = this.b0;
        if (ns1Var != null && ns1Var.getEditView() != null) {
            for (jw1 jw1Var : this.b0.getEditView().a) {
                if (jw1Var != null) {
                    jw1Var.d();
                }
            }
        }
        r7 r7Var = this.j0;
        if (r7Var != null) {
            r7Var.V();
        }
        gs1 gs1Var = this.m2;
        if (gs1Var != null) {
            gs1Var.updateColors();
        }
        pr1 pr1Var = this.p1;
        if (pr1Var != null) {
            pr1Var.updateColors();
        }
        mu1 mu1Var = this.m1;
        if (mu1Var != null) {
            mu1Var.M();
            xd9 xd9Var = this.m1.M;
            if (xd9Var != null) {
                xd9Var.invalidate();
            }
        }
        r02 r02Var = this.b1;
        if (r02Var != null) {
            im0 im0Var = r02Var.s;
            if (im0Var != null) {
                im0Var.updateColors();
            }
            cmb.w0(null, cmb.c6, false);
            r02Var.invalidate();
        }
        fdb fdbVar = this.s1;
        if (fdbVar != null) {
            fdbVar.updateColors();
        }
        pr1 pr1Var2 = this.p1;
        if (pr1Var2 != null && pr1Var2.getTimeItem() != null) {
            this.p1.getTimeItem().invalidate();
        }
        va2 va2Var = this.U;
        if (va2Var != null) {
            va2Var.updateColors();
        }
        q02 q02Var = this.y1;
        if (q02Var != null) {
            for (mx6 mx6Var : q02Var.e) {
                if (mx6Var != null && (aw1Var = (bw1Var = (bw1) mx6Var.b).b) != null) {
                    aw1Var.updateColors();
                    bw1Var.invalidate();
                }
            }
        }
        qs1 qs1Var = this.d1;
        if (qs1Var != null) {
            qs1Var.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((im0) it.next()).updateColors();
        }
        this.m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void wc(v67 v67Var) {
        if (this.H5 == null) {
            return;
        }
        new u67(getParentActivity(), this.currentAccount, this.l6, v67Var, this, getResourceProvider(), 0, new qm1(this, (byte) 0)).show();
    }

    public final void wd(boolean z) {
        TLRPC.Chat L0;
        TLRPC.User user;
        TLRPC.Chat chat;
        pr1 pr1Var = this.p1;
        if (pr1Var == null) {
            return;
        }
        int i = this.g4;
        if (i == 8 && (chat = this.e) != null) {
            if (this.i4) {
                String j = no4.j(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.e;
                pr1Var.h(j, chat2.scam, chat2.fake, chat2.verified, false, null, z);
            } else if (sd2.p0(chat)) {
                int i2 = (this.s4 > 0L ? 1 : (this.s4 == 0L ? 0 : -1));
                if (i2 == 0) {
                    TLRPC.Chat chat3 = this.e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.e.linked_monoforum_id));
                        if (L02 == null) {
                            L02 = this.e;
                        }
                        this.p1.h(gm.C2(gm.A2(L02.title)), L02.scam, L02.fake, L02.verified, false, L02.emoji_status, z);
                    } else {
                        pr1 pr1Var2 = this.p1;
                        String C2 = gm.C2(gm.A2(chat3.title));
                        TLRPC.Chat chat4 = this.e;
                        pr1Var2.h(C2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z);
                    }
                } else if (i2 > 0) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.s4));
                    this.p1.h(gm.C2(gm.A2(m9c.r(W1))), W1.scam, W1.fake, W1.verified, W1.premium, W1.emoji_status, z);
                } else {
                    TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(-this.s4));
                    if (L03 == null) {
                        L03 = this.e;
                    }
                    this.p1.h(gm.C2(gm.A2(L03.title)), L03.scam, L03.fake, L03.verified, false, L03.emoji_status, z);
                }
            } else {
                pr1 pr1Var3 = this.p1;
                String C22 = gm.C2(gm.A2(this.e.title));
                TLRPC.Chat chat5 = this.e;
                pr1Var3.h(C22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i == 9) {
                pr1Var.setTitle(jb6.M0(2131742561, null));
            } else if (i == 5) {
                if ("hello".equalsIgnoreCase(this.f4)) {
                    this.p1.setTitle(jb6.M0(2131752728, null));
                } else {
                    boolean equalsIgnoreCase = "away".equalsIgnoreCase(this.f4);
                    pr1 pr1Var4 = this.p1;
                    if (equalsIgnoreCase) {
                        pr1Var4.setTitle(jb6.M0(2131752791, null));
                    } else {
                        pr1Var4.setTitle(this.f4);
                    }
                }
            } else if (i == 6) {
                boolean isEmpty = TextUtils.isEmpty(this.e4.title);
                pr1 pr1Var5 = this.p1;
                if (!isEmpty) {
                    pr1Var5.setTitle(this.e4.title);
                } else {
                    pr1Var5.setTitle(jb6.M0(2131752669, null));
                }
            } else if (i == 3) {
                long j2 = this.s4;
                if (j2 > 0) {
                    user = getMessagesController().W1(Long.valueOf(j2));
                    L0 = null;
                } else {
                    L0 = getMessagesController().L0(Long.valueOf(-j2));
                    user = null;
                }
                if (m9c.B(user)) {
                    this.p1.setTitle(jb6.M0(2131745999, null));
                } else if (m9c.u(user)) {
                    this.p1.setTitle(jb6.M0(2131754217, null));
                } else if (m9c.D(user)) {
                    this.p1.setTitle(jb6.M0(2131748060, null));
                } else {
                    pr1 pr1Var6 = this.p1;
                    if (user != null) {
                        pr1Var6.setTitle(gm.C2(gm.A2(m9c.r(user))));
                    } else if (L0 != null) {
                        pr1Var6.setTitle(gm.C2(gm.A2(L0.title)));
                    } else {
                        pr1Var6.setTitle("");
                    }
                }
            } else if (j8() && !m9c.w(this.f)) {
                if (this.x4) {
                    Bd();
                } else if (this.v4) {
                    boolean x2 = this.m4.x2();
                    pr1 pr1Var7 = this.p1;
                    if (x2) {
                        pr1Var7.setTitle(jb6.G(this.m4.M1(), "Comments", new Object[0]));
                    } else {
                        pr1Var7.setTitle(jb6.M0(2131751933, null));
                    }
                } else {
                    this.p1.setTitle(jb6.G(this.m4.M1(), "Replies", new Object[0]));
                }
            } else if (m9c.B(this.f)) {
                this.p1.setTitle(jb6.M0(2131745999, null));
            } else if (m9c.u(this.f)) {
                this.p1.setTitle(jb6.M0(2131754217, null));
            } else {
                int i3 = this.g4;
                if (i3 == 1) {
                    boolean D = m9c.D(this.f);
                    pr1 pr1Var8 = this.p1;
                    if (D) {
                        pr1Var8.setTitle(jb6.M0(2131746055, null));
                    } else {
                        pr1Var8.setTitle(jb6.M0(2131745582, null));
                    }
                } else if (i3 == 2) {
                    this.p1.setTitle(jb6.G(c7(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.e;
                    if (chat6 != null) {
                        pr1 pr1Var9 = this.p1;
                        String C23 = gm.C2(gm.A2(chat6.title));
                        TLRPC.Chat chat7 = this.e;
                        pr1Var9.h(C23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z);
                    } else {
                        TLRPC.User user2 = this.f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.p1.setTitle(jb6.M0(2131745635, null));
                            } else if (!oc7.G2(user2) && getContactsController().g0.get(Long.valueOf(this.f.id)) == null && (getContactsController().g0.size() != 0 || !getContactsController().y())) {
                                oc7 messagesController = getMessagesController();
                                TLRPC.User user3 = this.f;
                                messagesController.getClass();
                                boolean C24 = oc7.C2(user3);
                                if (!this.Nc) {
                                    emojiStatus = this.f.emoji_status;
                                }
                                TLRPC.EmojiStatus emojiStatus2 = emojiStatus;
                                boolean isEmpty2 = TextUtils.isEmpty(this.f.phone);
                                pr1 pr1Var10 = this.p1;
                                if (!isEmpty2) {
                                    String l = mlb.l(new StringBuilder("+"), this.f.phone, r58.f());
                                    TLRPC.User user4 = this.f;
                                    pr1Var10.h(l, user4.scam, user4.fake, user4.verified, C24, emojiStatus2, z);
                                } else {
                                    String C25 = gm.C2(gm.A2(m9c.r(this.f)));
                                    TLRPC.User user5 = this.f;
                                    pr1Var10.h(C25, user5.scam, user5.fake, user5.verified, C24, emojiStatus2, z);
                                }
                            } else {
                                pr1 pr1Var11 = this.p1;
                                String C26 = gm.C2(gm.A2(m9c.r(this.f)));
                                TLRPC.User user6 = this.f;
                                boolean z2 = user6.scam;
                                boolean z3 = user6.fake;
                                boolean z4 = user6.verified;
                                oc7 messagesController2 = getMessagesController();
                                TLRPC.User user7 = this.f;
                                messagesController2.getClass();
                                boolean C27 = oc7.C2(user7);
                                if (!this.Nc && !oc7.G2(this.f)) {
                                    emojiStatus = this.f.emoji_status;
                                }
                                pr1Var11.h(C26, z2, z3, z4, C27, emojiStatus, z);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.p1.getTitleTextView().getText());
        yd(false);
    }

    @Override
    public final boolean x() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final hg5 x4(float f, int i, int i2, boolean z) {
        long j;
        hg5 hg5Var = new hg5(getParentActivity(), i);
        hg5Var.p(true);
        hg5Var.h = gm.L(f);
        if (z) {
            j = -1;
        } else {
            j = 2300;
        }
        hg5Var.d = j;
        hg5Var.U = true;
        hg5Var.e = true;
        hg5Var.j(z);
        hg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
        hg5Var.v0 = gm.L(4.0f);
        hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        hg5Var.k(this.L);
        FrameLayout.LayoutParams e = qoe.e(-1, 150, 55);
        mu1 mu1Var = this.m1;
        if (i2 >= 0) {
            mu1Var.addView(hg5Var, i2, e);
            return hg5Var;
        }
        mu1Var.addView(hg5Var, e);
        return hg5Var;
    }

    public final void x5() {
        int i;
        if (this.p1 != null) {
            float actionModeFactor = (1.0f - this.sd.e) * (1.0f - this.actionBar.getActionModeFactor());
            float R1 = gm.R1(0.95f, 1.0f, actionModeFactor);
            this.p1.setScaleX(R1);
            this.p1.setScaleY(R1);
            this.p1.setAlpha(actionModeFactor);
            pr1 pr1Var = this.p1;
            if (actionModeFactor > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            pr1Var.setVisibility(i);
        }
    }

    public final void x6(View view, boolean z) {
        boolean z2;
        Mb(view);
        if (view != this.y1) {
            z2 = true;
        } else {
            z2 = false;
        }
        y6(z, z2, 0.2f);
    }

    public final float x7(rc2 rc2Var, float f) {
        int[] iArr = this.Sb;
        rc2Var.getLocationInWindow(iArr);
        int i = iArr[1];
        this.m1.getLocationInWindow(iArr);
        return (i - iArr[1]) + f;
    }

    public final void x8() {
        TLRPC.UserFull userFull;
        boolean z;
        if (getParentActivity() != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                if (sd2.j(chat) && !this.e.monoforum) {
                    z = true;
                }
                z = false;
            } else {
                if (this.h == null && (userFull = this.s8) != null) {
                    z = userFull.can_pin_message;
                }
                z = false;
            }
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                String M0 = jb6.M0(2131743529, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131743530, null);
                alertDialog$Builder.j(jb6.M0(2131743531, null), new gm1(this, (byte) 24));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
            } else if (!this.V4.isEmpty()) {
                oc7.r1(this.currentAccount).W3.edit().putInt("pin_" + this.l6, ((Integer) this.V4.get(0)).intValue()).commit();
                gd(0, true);
            }
        }
    }

    public final void x9(f47 f47Var, k47 k47Var, int i, int i2) {
        if (f47Var != null) {
            ArrayList arrayList = f47Var.d;
            if (!arrayList.isEmpty()) {
                a6a.B(this.currentAccount).t((k47) arrayList.get(0), this, i, i2);
                return;
            }
        }
        a6a.B(this.currentAccount).t(k47Var, this, i, i2);
    }

    public final void xa(boolean z) {
        tk5 tk5Var;
        int i;
        if (getParentActivity() != null && (tk5Var = this.parentLayout) != null && tk5Var.getLastFragment() == this && !this.V4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.id);
            } else {
                bundle.putLong("user_id", this.f.id);
            }
            bundle.putInt("chatMode", 2);
            yv1 yv1Var = new yv1(bundle);
            yv1Var.V4 = new ArrayList(this.V4);
            yv1Var.X4 = new HashMap(this.X4);
            int size = this.V4.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) this.V4.get(i2);
                k47 k47Var = (k47) this.X4.get(num);
                k47 k47Var2 = (k47) this.G6[0].get(num.intValue());
                if (k47Var == null) {
                    k47Var = k47Var2;
                } else if (k47Var2 != null) {
                    k47Var.z0 = k47Var2.z0;
                    k47Var.y0 = k47Var2.y0;
                }
                if (k47Var != null) {
                    yv1Var.X4.put(num, k47Var);
                    yv1Var.hd();
                }
            }
            yv1Var.d5 = this.d5;
            if (this.x4) {
                i = this.V4.size();
            } else {
                i = this.e5;
            }
            yv1Var.e5 = i;
            yv1Var.g5 = this.g5;
            yv1Var.s8 = this.s8;
            yv1Var.r8 = this.r8;
            yv1Var.n9 = new pt1(this, yv1Var);
            if (z) {
                presentFragmentAsPreview(yv1Var);
                q5();
                return;
            }
            presentFragment(yv1Var, false);
        }
    }

    public final void xb(TLRPC.Document document) {
        String V;
        if (document == null || (V = k47.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        y5a b = y5a.b(V, this.l6, this.F5, this.m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b.K = X6();
        a6a.B(this.currentAccount).q0(b);
        E4();
    }

    public final void xc() {
        int i;
        if (a() == getUserConfig().e() && getUserConfig().p() && this.Jb == null) {
            ft1 ft1Var = new ft1(this, this, getParentActivity(), this.currentAccount, this.Ba);
            this.Jb = ft1Var;
            ft1Var.setPadding(gm.L(4.0f), gm.L(24.0f), gm.L(4.0f), gm.L(0.0f));
            this.Jb.setDelegate(new gt1(this));
            this.Jb.setTop(true);
            int i2 = 0;
            this.Jb.setClipChildren(false);
            this.Jb.setClipToPadding(false);
            this.Jb.setVisibility(0);
            ft1 ft1Var2 = this.Jb;
            if (ft1Var2.getSelectedReactions().isEmpty()) {
                i = 2131745606;
            } else {
                i = 2131745605;
            }
            ft1Var2.setHint(jb6.M0(i, null));
            this.m1.addView(this.Jb, qoe.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Jb.m(null, null, true);
            this.Jb.setTranslationY(-gm.L(12.0f));
            this.Jb.setScaleY(0.4f);
            this.Jb.setScaleX(0.4f);
            this.Jb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(d53.h).start();
            td();
            ft1 ft1Var3 = this.Jb;
            float f = this.T9;
            ys1 ys1Var = this.D1;
            if (ys1Var != null) {
                i2 = ys1Var.getCurrentHeight();
            }
            ft1Var3.setTranslationY(f + i2);
        }
    }

    public final void xd() {
        yd(false);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void y4(k47 k47Var, Integer num) {
        k47 k47Var2 = k47Var.C;
        if (k47Var2 != null) {
            int e1 = k47Var2.e1();
            SparseArray sparseArray = this.I6;
            ArrayList arrayList = (ArrayList) sparseArray.get(e1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(e1, arrayList);
            }
            int e12 = k47Var.e1();
            if (!arrayList.contains(Integer.valueOf(e12))) {
                arrayList.add(Integer.valueOf(e12));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void y5() {
        boolean z;
        hs1 hs1Var;
        if (this.Aa != null) {
            return;
        }
        int i = 0;
        if (this.rd.e >= 1.0f && ((hs1Var = this.F1) == null || hs1Var.getPositionAnimated() <= 0.0f)) {
            z = false;
        } else {
            z = true;
        }
        xd9 xd9Var = this.m1.M;
        if (!z) {
            i = 4;
        }
        xd9Var.setVisibility(i);
    }

    public final void y6(boolean z, boolean z2, float f) {
        boolean z3;
        ValueAnimator ofFloat;
        q02 q02Var;
        rc2 rc2Var;
        if (f > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        View view = this.Z8;
        if (view instanceof rc2) {
            rc2 rc2Var2 = (rc2) view;
            rc2Var2.setInvalidatesParent(z3);
            if (z3) {
                hb(rc2Var2);
            }
        }
        this.m1.invalidate();
        this.A0.invalidate();
        AnimatorSet animatorSet = this.f9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f9.cancel();
        }
        this.f9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.X8, f);
        float f2 = 1.0f;
        if (z3) {
            this.a9 = 1.0f;
            this.b9 = 0.0f;
            ValueAnimator valueAnimator = this.Tc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.Y8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
            if (z) {
                vs9.d(new pm1(this, (byte) 3));
            }
        } else {
            float f3 = this.X8;
            this.b9 = f3 / max;
            this.Y8 = false;
            ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new go1(this, max, (byte) 0));
        if ((!z3 || z2) && (q02Var = this.y1) != null) {
            Property property = View.ALPHA;
            if (z3) {
                f2 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(q02Var, property, f2));
        }
        this.f9.playTogether(arrayList);
        this.f9.setInterpolator(d53.h);
        this.f9.setDuration(320L);
        View view2 = this.Z8;
        if (view2 instanceof rc2) {
            rc2Var = (rc2) view2;
        } else {
            rc2Var = null;
        }
        this.f9.addListener(new qx(this, z3, rc2Var, (byte) 1));
        if (this.Z8 != null && this.a9 <= 0.0f) {
            Mb(null);
        }
        this.f9.start();
    }

    public final void y7(boolean z) {
        int i;
        int i2;
        if (this.g4 == 7) {
            af5 a = af5.a(this.currentAccount);
            int i3 = this.classGuid;
            int i4 = this.K3;
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int i5 = i4 + i2;
            ze5 b = a.b(this.d4);
            ArrayList arrayList = b.a;
            if (i5 >= 0 && i5 < arrayList.size()) {
                b.l = i5;
                nm7.f(a.a).k(nm7.I0, Integer.valueOf(i3), Integer.valueOf(b.m), Boolean.valueOf(b.n), Integer.valueOf(b.b()), Integer.valueOf(b.l), Integer.valueOf(((k47) arrayList.get(i5)).k.id));
                return;
            }
            return;
        }
        hs6 mediaDataController = getMediaDataController();
        long j = this.l6;
        long j2 = this.d7;
        int i6 = this.classGuid;
        boolean z2 = this.nb;
        if (!z ? z2 : !z2) {
            i = 1;
        } else {
            i = 2;
        }
        mediaDataController.Z1(null, j, j2, i6, i, this.s4, false, this.D3, this.E3, true, this.F3);
        nc(false);
    }

    public final void y8() {
        int i = 0;
        if (this.b2) {
            getMessagesController().b(0, 0, this.l6);
            i6();
            this.N3.j(23, this.l6, null);
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
            edit.putBoolean("dialog_bar_archived" + this.l6, false);
            edit.putBoolean("dialog_bar_block" + this.l6, false);
            edit.putBoolean("dialog_bar_report" + this.l6, false);
            edit.commit();
            zd(false);
            lo7 notificationsController = getNotificationsController();
            long j = this.l6;
            long d = d();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().d().edit();
            String p = lo7.p(j, d, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + p);
            remove.remove("custom_" + p);
            notificationsController.getMessagesStorage().B1(j, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().R.f(j);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j, d, true);
        } else if (this.a2.getTag() != null && ((Integer) this.a2.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = this.r8;
            if (chatFull != null && chatFull.participants != null) {
                vh6 vh6Var = new vh6();
                while (true) {
                    int size = this.r8.participants.participants.size();
                    TLRPC.ChatFull chatFull2 = this.r8;
                    if (i < size) {
                        vh6Var.k(null, chatFull2.participants.participants.get(i).user_id);
                        i++;
                    } else {
                        long j2 = chatFull2.id;
                        it5 it5Var = new it5(getParentActivity(), this.currentAccount, vh6Var, this.r8.id, this, this.Ba);
                        it5Var.f2 = new gm1(this, (byte) 25);
                        it5Var.show();
                        return;
                    }
                }
            }
        } else if (this.a2.getTag() != null) {
            Rb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f.id);
            bundle.putBoolean("addContact", true);
            tu2 tu2Var = new tu2(bundle);
            tu2Var.P = new gm1(this, (byte) 26);
            presentFragment(tu2Var);
        }
    }

    public final void y9(TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p pVar) {
        try {
            vh6 vh6Var = new vh6();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new k47(this.currentAccount, tL_message, false, false));
            vh6Var.k(arrayList, pg3.n(tL_webPageAttributeStory.peer));
            getMessagesController().N1().k.c(vh6Var, new uj1(vh6Var, pVar, (byte) 17), this.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public final void ya(long j) {
        int i;
        boolean z;
        vr9 vr9Var;
        if (j != f7()) {
            getConnectionsManager().cancelRequestsForGuid(this.classGuid);
            getMessagesStorage().j(this.classGuid);
            this.classGuid = ConnectionsManager.generateClassGuid();
            jb();
            this.x5 = null;
            this.M7 = 0;
            this.F7 = -1;
            this.C7 = false;
            this.D7 = true;
            this.z6.clear();
            if (j != 0) {
                i = 3;
            } else {
                i = 0;
            }
            this.g4 = i;
            this.s4 = j;
            if (i == 3) {
                wr9 E1 = getMessagesController().E1();
                long d = d();
                ArrayList arrayList = E1.j;
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        vr9Var = (vr9) arrayList.get(i2);
                        if (vr9Var.a == d) {
                            break;
                        }
                        i2++;
                    } else {
                        vr9Var = null;
                        break;
                    }
                }
                if (vr9Var != null && !vr9Var.i) {
                    E1.f(d, null);
                }
            }
            N6();
            wd(true);
            pr1 pr1Var = this.p1;
            if (pr1Var != null) {
                pr1Var.n(true);
                this.p1.b();
            }
            oyb oybVar = this.n0;
            if (oybVar != null) {
                oybVar.setCurrentTopic(j);
                oyb oybVar2 = this.n0;
                if (this.j0 != null) {
                    z = true;
                } else {
                    z = false;
                }
                oybVar2.setMenuAvailable(z);
            }
            zd(true);
            Pc(true);
            F7(true);
            E7(true);
            ms1 ms1Var = this.a0;
            if (ms1Var != null) {
                ms1Var.J0(false);
                this.a0.r2(true);
            }
            H4(true, true);
            pv1 pv1Var = this.gd;
            if (pv1Var != null && this.actionBar.o0) {
                pv1Var.k(null);
            }
        }
    }

    public final void yb(TLRPC.BotInlineResult botInlineResult, boolean z, int i, long j) {
        long j2;
        String str;
        es1 es1Var = this.X1;
        if (es1Var == null) {
            return;
        }
        TLRPC.User user = es1Var.getAdapter().x0;
        if (user != null) {
            j2 = user.id;
        } else {
            j2 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.id);
        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
        hashMap.put("bot", String.valueOf(j2));
        TLRPC.User user2 = this.X1.getAdapter().x0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        j5 accountInstance = getAccountInstance();
        long j3 = this.l6;
        k47 k47Var = this.F5;
        k47 k47Var2 = this.m4;
        a6a.R(i, j3, j, k7(), accountInstance, this.D5, k47Var, k47Var2, X6(), hashMap, botInlineResult, null, this, z);
        this.a0.setFieldText("");
        E7(false);
        getMediaDataController().w0(j2, false);
    }

    public final void yc(k47 k47Var) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().B2(k47.B0(k47Var.k))) {
            TLRPC.Message message = k47Var.k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = k47Var.B2;
                boolean z = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = k47Var.v;
                    if (k47Var.B2.size() > 1) {
                        z = true;
                    }
                } else {
                    charSequence = k47Var.z;
                }
                if (!z && charSequence != null) {
                    z = true;
                }
                if (z && gda.I <= 2 && !this.F9 && this.G9 <= this.a0.getTop() - gm.L(60.0f)) {
                    this.F9 = true;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    int i = gda.I + 1;
                    gda.I = i;
                    edit.putInt("textSelectionHintShows", i);
                    edit.apply();
                    if (this.E9 == null) {
                        rt1 rt1Var = new rt1(this, this.Ba, getParentActivity());
                        this.E9 = rt1Var;
                        this.m1.addView(rt1Var, qoe.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.E9.c();
                }
            }
        }
    }

    public final void yd(boolean z) {
        Drawable mutate;
        Drawable drawable;
        p7 p7Var;
        if (this.p1 != null) {
            int i = this.g4;
            if (i == 0 || i == 8) {
                boolean o2 = getMessagesController().o2(this.l6, d(), null);
                if (z) {
                    o2 = !o2;
                }
                this.R0 = null;
                if (!sd2.e0(this.currentAccount, this.e) && !sd2.f0(this.currentAccount, this.f)) {
                    if (!m9c.B(this.f) && ((!j8() || this.x4) && o2)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231947).mutate();
                    int i2 = cmb.G6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i2);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.p1.c(pg3.c(chat));
                    } else {
                        TLRPC.User user = this.f;
                        if (user != null && !m9c.D(user)) {
                            drawable = this.p1.c(pg3.c(this.f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.p1.j(drawable, mutate);
                if (!z && (p7Var = this.t1) != null) {
                    byte b = p7Var.m;
                    if (o2) {
                        if (b != 8) {
                            p7Var.m = (byte) 8;
                            View view = p7Var.j;
                            if (view instanceof a8) {
                                ((a8) view).getRightIcon().setVisibility(p7Var.m);
                            }
                        }
                        this.t1.d(jb6.M0(2131743536, null));
                        this.t1.b(2131232262);
                    } else {
                        if (b != 0) {
                            p7Var.m = (byte) 0;
                            View view2 = p7Var.j;
                            if (view2 instanceof a8) {
                                ((a8) view2).getRightIcon().setVisibility(p7Var.m);
                            }
                        }
                        boolean p2 = getMessagesController().p2(this.l6, d());
                        p7 p7Var2 = this.t1;
                        if (p2) {
                            p7Var2.d(jb6.M0(2131748071, null));
                            this.t1.b(2131232418);
                        } else {
                            p7Var2.d(jb6.M0(2131748071, null));
                            this.t1.b(2131232372);
                        }
                    }
                }
                jd2 jd2Var = this.x1;
                if (jd2Var != null) {
                    jd2Var.e(this.l6, d(), null);
                }
            }
        }
    }

    public final void z4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.z4():void");
    }

    public final void z5() {
        float f;
        py1 py1Var;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + gm.L(15.0f) + u7(izb.c) + this.w.d();
        ms1 ms1Var = this.a0;
        if (ms1Var != null && (py1Var = ms1Var.n0) != null) {
            py1Var.setTranslationY(-inputBubbleHeight);
        }
        es1 es1Var = this.X1;
        if (es1Var != null) {
            if (es1Var.g()) {
                f = gm.L(5.0f);
            } else {
                f = -inputBubbleHeight;
            }
            es1Var.setTranslationY(f);
        }
    }

    public final void z6(Runnable runnable) {
        nm7.f(this.currentAccount).d(runnable);
    }

    public final void z7() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.z7():void");
    }

    public final void z8(Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        yv1 yv1Var;
        int i;
        int i2;
        TLRPC.TL_forumTopic f;
        if (num.intValue() != d()) {
            this.fd = false;
            ym1 ym1Var = this.Bc;
            if (ym1Var != null) {
                gm.r(ym1Var);
                this.Bc.run();
                this.Bc = null;
            }
            hw1 hw1Var = this.Ec;
            if (hw1Var != null && num.intValue() == 0) {
                hw1Var.b(0, 0L);
            }
            mzb mzbVar = this.g2;
            long intValue = num.intValue();
            ArrayList l = oc7.r1(mzbVar.e).g4.l(-mzbVar.f);
            if (l != null) {
                int size = l.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = l.get(i3);
                    i3++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.id == intValue) {
                        break;
                    }
                }
            }
            tL_forumTopic = null;
            if (tL_forumTopic == null) {
                message = null;
            } else {
                message = tL_forumTopic.topicStartMessage;
            }
            if (message == null && tL_forumTopic != null && (f = getMessagesController().g4.f(-a(), tL_forumTopic.id)) != null) {
                message = f.topicStartMessage;
                tL_forumTopic2 = f;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                this.Ib = SystemClock.uptimeMillis();
                this.H7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    mb(d());
                } else if (d() == 0) {
                    mb(num.intValue());
                } else {
                    this.F7 = -1;
                }
                getConnectionsManager().cancelRequestsForGuid(this.classGuid);
                getMessagesStorage().j(this.classGuid);
                this.classGuid = ConnectionsManager.generateClassGuid();
                jb();
                this.x5 = null;
                this.M7 = 0;
                this.C7 = false;
                this.D7 = true;
                this.Y7 = true;
                this.Z7 = 0;
                this.b8 = null;
                this.z6.clear();
                this.c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new k47(getCurrentAccount(), message, false, false));
                    yv1Var = this;
                    yv1Var.Nb(arrayList, this.e, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    yv1Var = this;
                    yv1Var.r4 = null;
                    yv1Var.p4 = null;
                    yv1Var.m4 = null;
                    yv1Var.F5 = null;
                    yv1Var.A4 = 0;
                    yv1Var.B4 = 0;
                    yv1Var.C4 = 0;
                    yv1Var.s4 = 0L;
                    yv1Var.t4 = 0;
                    yv1Var.u4 = null;
                    yv1Var.x4 = false;
                    yv1Var.v4 = false;
                }
                hu1 hu1Var = yv1Var.D0;
                if (hu1Var != null) {
                    if (hu1Var.J >= 0 && !hu1Var.I()) {
                        hu1 hu1Var2 = yv1Var.D0;
                        hu1Var2.s(hu1Var2.J);
                    } else {
                        hu1 hu1Var3 = yv1Var.D0;
                        if (hu1Var3.J < 0 && hu1Var3.I()) {
                            yv1Var.D0.i(0);
                        }
                    }
                    yv1Var.D0.O();
                }
                yv1Var.N6();
                yv1Var.wd(true);
                yv1Var.p1.n(true);
                if (tL_forumTopic2 != null) {
                    yv1Var.Cd();
                } else {
                    yv1Var.p1.b();
                }
                yv1Var.g2.setCurrentTopic(yv1Var.d());
                yv1Var.zd(true);
                yv1Var.Pc(true);
                yv1Var.getMessagesController().R4(-yv1Var.a(), yv1Var.d());
                yv1Var.Ya();
                yv1Var.F7(true);
                yv1Var.E7(true);
                yv1Var.H4(true, true);
                if (yv1Var.a0 != null) {
                    if (!m9c.w(yv1Var.f)) {
                        yv1Var.a0.J0(false);
                    }
                    yv1Var.a0.r2(true);
                }
                if (tL_forumTopic2 != null) {
                    yv1Var.getMessagesController().g4.k(yv1Var.l6, tL_forumTopic2.id);
                    i = tL_forumTopic2.unread_reactions_count;
                } else {
                    i = 0;
                }
                yv1Var.A1 = i;
                if (tL_forumTopic2 != null) {
                    i2 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i2 = 0;
                }
                yv1Var.B1 = i2;
                yv1Var.jd(false);
                yv1Var.id(false);
                yv1Var.Ad();
                pv1 pv1Var = yv1Var.gd;
                if (pv1Var != null && yv1Var.actionBar.o0) {
                    pv1Var.k(null);
                }
                if (m9c.w(yv1Var.f)) {
                    yv1Var.getMediaDataController().K0(bf7.a(yv1Var.l6, num.intValue()), true);
                }
            }
        }
    }

    public final void z9() {
        oc7 messagesController = getMessagesController();
        long j = this.l6;
        long j2 = this.d7;
        int i = this.classGuid;
        int i2 = this.g4;
        long j3 = this.s4;
        int i3 = this.C4;
        int i4 = this.n6;
        this.n6 = i4 + 1;
        messagesController.c3(j, j2, false, 30, 0, 0, true, 0, i, 0, i2, j3, i3, i4, this.x4);
    }

    public final void za(int i, boolean z) {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && tk5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.id);
                } else {
                    bundle.putLong("user_id", this.f.id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z) {
                bundle.putInt("converting_toast_from", i);
                bundle.putBoolean("converting_toast", true);
            }
            yv1 yv1Var = new yv1(bundle);
            if (this.x4) {
                no4.a(yv1Var, bf7.a(a(), d()));
            }
            yv1Var.n9 = new rr1(this);
            presentFragment(yv1Var, false);
        }
    }

    public final void zb(ClipData clipData, boolean z, int i) {
        int i2 = 0;
        if (this.H5 != null) {
            while (i2 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    Eb(i, arrayList, z);
                }
                i2++;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        while (i2 < clipData.getItemCount()) {
            Uri uri2 = clipData.getItemAt(i2).getUri();
            if (uri2 != null) {
                arrayList2.add(uri2);
            }
            i2++;
        }
        Eb(i, arrayList2, z);
    }

    public final void zc(boolean z, boolean z2) {
        ms1 ms1Var;
        int i;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z || this.H2 != null) && this.g4 == 0 && (ms1Var = this.a0) != null && ms1Var.getAudioVideoButtonContainer() != null && this.a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                hg5 hg5Var = this.H2;
                if (hg5Var == null) {
                    int indexOfChild = this.m1.indexOfChild(this.U);
                    if (indexOfChild != -1) {
                        hg5Var = x4(310.0f, 3, indexOfChild + 1, false);
                        this.H2 = hg5Var;
                    } else {
                        return;
                    }
                }
                if (z) {
                    hg5Var.f(true);
                    return;
                }
                if (this.a0.U2) {
                    if (z2) {
                        i = 2131749047;
                    } else {
                        i = 2131749049;
                    }
                    hg5Var.t(jb6.M0(i, null));
                } else {
                    hg5Var.t(jb6.M0(2131749048, null));
                }
                this.H2.x(this.a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void zd(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.zd(boolean):void");
    }

    @Override
    public final void S() {
    }

    public void ka(boolean z) {
    }
}
