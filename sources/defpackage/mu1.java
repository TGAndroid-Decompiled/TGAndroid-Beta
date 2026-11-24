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
import android.util.Log;
import android.util.LongSparseArray;
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
public class mu1 extends d implements gk7, wi3, ma6, t22, sy1, aj4, vo5, x74 {
    public static int nd = 22;
    public static float od = 1.4f;
    public static int pd = 10;
    public static Pattern qd;
    public static Pattern rd;
    public static Pattern sd;
    public static final int[] td = {kk7.x, kk7.y, kk7.z, kk7.A, kk7.Y, kk7.B0, kk7.s0, kk7.V0, kk7.d1, kk7.S1, kk7.F, kk7.s, kk7.T, kk7.D0, kk7.E0, kk7.B4, kk7.h3, kk7.r4, kk7.K};
    public static boolean ud = false;
    public static final Rect vd = new Rect();
    public jq1 A0;
    public int A1;
    public je5 A2;
    public boolean A3;
    public int A4;
    public f27 A5;
    public boolean A6;
    public boolean A7;
    public boolean A8;
    public float A9;
    public mu1 Aa;
    public long Ab;
    public boolean Ac;
    public lq1 B0;
    public int B1;
    public je5 B2;
    public boolean B3;
    public int B4;
    public f27 B5;
    public int B6;
    public int B7;
    public String B8;
    public VelocityTracker B9;
    public ku1 Ba;
    public sr1 Bb;
    public boolean Bc;
    public mq1 C0;
    public m21 C1;
    public je5 C2;
    public boolean C3;
    public int C4;
    public k27 C5;
    public int C6;
    public boolean C7;
    public String C8;
    public boolean C9;
    public xy1 Ca;
    public boolean Cb;
    public boolean Cc;
    public vs1 D0;
    public lr1 D1;
    public je5 D2;
    public TLRPC.User D3;
    public jo1 D4;
    public bu1 D5;
    public int D6;
    public boolean D7;
    public k27 D8;
    public boolean D9;
    public final qb2 Da;
    public boolean Db;
    public boolean Dc;
    public wp1 E;
    public fr1 E0;
    public xq1 E1;
    public gb2 E2;
    public TLRPC.Chat E3;
    public final SparseArray E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public k27 E8;
    public es1 E9;
    public TLRPC.TL_channels_sendAsPeers Ea;
    public boolean Eb;
    public boolean Ec;
    public final e59 F;
    public boolean F0;
    public vq1 F1;
    public int F2;
    public h19 F3;
    public final ArrayList F4;
    public k27 F5;
    public final ArrayList F6;
    public int F7;
    public int F8;
    public boolean F9;
    public TL_account.resolvedBusinessChatLinks Fa;
    public ArrayList Fb;
    public s10 Fc;
    public final e59 G;
    public l46 G0;
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
    public ValueAnimator Gb;
    public int Gc;
    public final cq3 H;
    public TextView H0;
    public boolean H1;
    public je5 H2;
    public boolean H3;
    public boolean H4;
    public k27 H5;
    public final SparseArray H6;
    public boolean H7;
    public boolean H8;
    public tq1 H9;
    public boolean Ha;
    public boolean Hb;
    public TLRPC.DraftMessage Hc;
    public final int I;
    public xw0 I0;
    public vc5 I1;
    public je5 I2;
    public String I3;
    public boolean I4;
    public boolean I5;
    public final SparseArray I6;
    public wl1 I7;
    public String I8;
    public gb2 I9;
    public float Ia;
    public Boolean Ib;
    public boolean Ic;
    public final lx4 J;
    public RadialProgressView J0;
    public hd J1;
    public je5 J2;
    public String J3;
    public int J4;
    public boolean J5;
    public final HashMap J6;
    public String J7;
    public dr1 J8;
    public qh4 J9;
    public final ur0 Ja;
    public boolean Jb;
    public ValueAnimator Jc;
    public final lx4 K;
    public final int K0;
    public je5 K1;
    public cg2 K2;
    public int K3;
    public final ArrayList K4;
    public boolean K5;
    public final SparseArray K6;
    public boolean K7;
    public gb2 K8;
    public boolean K9;
    public final pr1 Ka;
    public final int[] Kb;
    public kp1 Kc;
    public kl0 L;
    public int L0;
    public je5 L1;
    public View L2;
    public int L3;
    public final HashMap L4;
    public boolean L5;
    public final vf6 L6;
    public boolean L7;
    public ix L8;
    public boolean L9;
    public int La;
    public gb2 Lb;
    public boolean Lc;
    public kl0 M;
    public int M0;
    public je5 M1;
    public yr1 M2;
    public int M3;
    public k27 M4;
    public int M5;
    public final ArrayList M6;
    public int M7;
    public TextureView M8;
    public ValueAnimator M9;
    public int Ma;
    public gb2 Mb;
    public int Mc;
    public final mx4 N;
    public int N0;
    public je5 N1;
    public s71 N2;
    public UndoView N3;
    public int N4;
    public boolean N5;
    public final SparseArray N6;
    public int N7;
    public boolean N8;
    public ValueAnimator N9;
    public wl1 Na;
    public int Nb;
    public int Nc;
    public kl0 O;
    public int O0;
    public je5 O1;
    public qa8 O2;
    public xr1 O3;
    public int O4;
    public TLRPC.PhotoSize O5;
    public final vf6 O6;
    public int O7;
    public final wl1 O8;
    public boolean O9;
    public boolean Oa;
    public boolean Ob;
    public int Oc;
    public hd P;
    public Drawable P0;
    public je5 P1;
    public boolean P2;
    public m21 P3;
    public final ArrayList P4;
    public TLRPC.PhotoSize P5;
    public final vf6 P6;
    public int P7;
    public final hx4 P8;
    public float P9;
    public boolean Pa;
    public int Pb;
    public int Pc;
    public boolean Q;
    public Drawable Q0;
    public ks1 Q1;
    public final be0[] Q2;
    public boolean Q3;
    public wl1 Q4;
    public TLObject Q5;
    public final int[] Q6;
    public int Q7;
    public kl0 Q8;
    public float Q9;
    public long Qa;
    public HashMap Qb;
    public int Qc;
    public FrameLayout R;
    public Drawable R0;
    public float R1;
    public final lu1[] R2;
    public int R3;
    public boolean R4;
    public int R5;
    public final int[] R6;
    public int R7;
    public Bitmap R8;
    public int R9;
    public int Ra;
    public wl1 Rb;
    public boolean Rc;
    public s71 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final jia[] S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public final int[] S6;
    public boolean S7;
    public BitmapShader S8;
    public int S9;
    public int Sa;
    public byte Sb;
    public long Sc;
    public dr1 T;
    public int T0;
    public ng1 T1;
    public final au1[] T2;
    public h24 T3;
    public boolean T4;
    public boolean T5;
    public final int[] T6;
    public int T7;
    public Paint T8;
    public float T9;
    public jr1 Ta;
    public hd Tb;
    public TLRPC.TL_messages_discussionMessage Tc;
    public j92 U;
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
    public kr1 Ua;
    public int Ub;
    public TLRPC.messages_Messages Uc;
    public View V;
    public final Set V0;
    public wl1 V1;
    public int V2;
    public k27 V3;
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
    public du1 Wc;
    public FrameLayout X;
    public boolean X0;
    public sq1 X1;
    public boolean X2;
    public k27 X3;
    public HashMap X4;
    public int X5;
    public boolean X6;
    public boolean X7;
    public float X8;
    public float X9;
    public int Xa;
    public boolean Xb;
    public wt1 Xc;
    public final nqc Y;
    public je5 Y0;
    public x31 Y1;
    public ImageView Y2;
    public k27 Y3;
    public final SparseArray Y4;
    public TLRPC.WebPage Y5;
    public boolean Y6;
    public boolean Y7;
    public boolean Y8;
    public TLRPC.Document Y9;
    public int Ya;
    public boolean Yb;
    public jra Yc;
    public ry1 Z;
    public je5 Z0;
    public k7 Z1;
    public RadialProgressView Z2;
    public yc Z3;
    public int Z4;
    public ArrayList Z5;
    public boolean Z6;
    public int Z7;
    public View Z8;
    public boolean Z9;
    public mv6 Za;
    public int Zb;
    public boolean Zc;
    public int a;
    public ar1 a0;
    public je5 a1;
    public TextView a2;
    public ImageView a3;
    public fu a4;
    public final int[] a5;
    public String a6;
    public boolean a7;
    public boolean a8;
    public float a9;
    public boolean aa;
    public ValueAnimator ab;
    public int ac;
    public boolean ad;
    public boolean b;
    public br1 b0;
    public ez1 b1;
    public boolean b2;
    public AnimatorSet b3;
    public ra7 b4;
    public int b5;
    public tq4 b6;
    public int b7;
    public k27 b8;
    public float b9;
    public long ba;
    public float bb;
    public int bc;
    public float bd;
    public boolean c;
    public yc c0;
    public boolean c1;
    public TextView c2;
    public FrameLayout c3;
    public az1 c4;
    public boolean c5;
    public TLRPC.ChatInvite c6;
    public int c7;
    public k27 c8;
    public Integer c9;
    public int ca;
    public wr1 cb;
    public CharacterStyle cc;
    public float cd;
    public boolean d;
    public int d0;
    public er1 d1;
    public TextView d2;
    public ir1 d3;
    public int d4;
    public int d5;
    public my d6;
    public long d7;
    public int d8;
    public int d9;
    public int da;
    public final fs1 db;
    public String dc;
    public final fm0 dd;
    public TLRPC.Chat e;
    public p7 e0;
    public nu1 e1;
    public mr1 e2;
    public TextView e3;
    public TL_account.TL_businessChatLink e4;
    public int e5;
    public final LongSparseIntArray e6;
    public boolean e7;
    public boolean e8;
    public boolean e9;
    public int ea;
    public final ms1 eb;
    public c01 ec;
    public final fm0 ed;
    public TLRPC.User f;
    public fq2 f0;
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
    public boolean fc;
    public final fm0 fd;
    public q6 g0;
    public LinearLayout g1;
    public kxb g2;
    public dr1 g3;
    public int g4;
    public boolean g5;
    public boolean g6;
    public final ArrayList g7;
    public long g8;
    public m8 g9;
    public boolean ga;
    public final yo1 gb;
    public my gc;
    public final fm0 gd;
    public TLRPC.EncryptedChat h;
    public p7 h0;
    public i92 h1;
    public o31 h2;
    public ImageView h3;
    public int h4;
    public AnimatorSet h5;
    public long h6;
    public final Paint h7;
    public String h8;
    public boolean h9;
    public boolean ha;
    public final dp1 hb;
    public boolean hc;
    public final fm0 hd;
    public p7 i0;
    public ip1 i1;
    public l46 i2;
    public ImageView i3;
    public boolean i4;
    public final SparseIntArray i5;
    public boolean i6;
    public final Paint i7;
    public Integer i8;
    public int i9;
    public boolean ia;
    public final vp1 ib;
    public boolean ic;
    public final fm0 id;
    public r7 j0;
    public qx8 j1;
    public ImageView j2;
    public hn j3;
    public String j4;
    public final SparseIntArray j5;
    public boolean j6;
    public final ColorMatrix j7;
    public byte[] j8;
    public int j9;
    public w02 ja;
    public final xt1 jb;
    public final RectF jc;
    public final fm0 jd;
    public r7 k0;
    public k41 k1;
    public no0 k2;
    public hn k3;
    public byte[] k4;
    public boolean k5;
    public boolean k6;
    public final h24 k7;
    public int k8;
    public a8[] k9;
    public float ka;
    public final vm1 kb;
    public hd kc;
    public final igf kd;
    public r7 l0;
    public zec l1;
    public TextView l2;
    public hn l3;
    public String l4;
    public boolean l5;
    public long l6;
    public final m17 l7;
    public int l8;
    public a8 l9;
    public float la;
    public final vm1 lb;
    public long lc;
    public jd8 ld;
    public r7 m0;
    public at1 m1;
    public uq1 m2;
    public rq1 m3;
    public k27 m4;
    public boolean m5;
    public Long m6;
    public long m7;
    public my m8;
    public final yq1 m9;
    public kc2 ma;
    public boolean mb;
    public final vm1 mc;
    public final Rect md;
    public boolean n;
    public lwb n0;
    public q72 n1;
    public FrameLayout n2;
    public qq1 n3;
    public k27 n4;
    public boolean n5;
    public int n6;
    public int n7;
    public String n8;
    public ws1 n9;
    public Animator na;
    public boolean nb;
    public int nc;
    public p7 o0;
    public final ArrayList o1;
    public uq1 o2;
    public uk1 o3;
    public boolean o4;
    public boolean o5;
    public final SparseArray[] o6;
    public int o7;
    public fc2 o8;
    public gr1 o9;
    public boolean oa;
    public long ob;
    public boolean oc;
    public r7 p0;
    public cq1 p1;
    public FrameLayout p2;
    public short p3;
    public ArrayList p4;
    public boolean p5;
    public final SparseArray[] p6;
    public final Matrix p7;
    public boolean p8;
    public int p9;
    public boolean pa;
    public wtc pb;
    public Pattern pc;
    public q6 q0;
    public hn q1;
    public TextView q2;
    public q q3;
    public k27 q4;
    public long q5;
    public final SparseArray[] q6;
    public LinearGradient q7;
    public boolean q8;
    public int q9;
    public mu1 qa;
    public boolean qb;
    public k27 qc;
    public long r;
    public boolean r0;
    public un1 r1;
    public pi4 r2;
    public View r3;
    public TLRPC.TL_forumTopic r4;
    public boolean r5;
    public boolean r6;
    public int r7;
    public TLRPC.ChatFull r8;
    public int r9;
    public float ra;
    public int rb;
    public ol1 rc;
    public final HashMap s;
    public RadialProgressView s0;
    public dbb s1;
    public zya s2;
    public boolean s3;
    public long s4;
    public boolean s5;
    public int s6;
    public int s7;
    public TLRPC.UserFull s8;
    public boolean s9;
    public AnimatorSet sa;
    public int sb;
    public ArrayList sc;
    public p7 t0;
    public p7 t1;
    public je5 t2;
    public boolean t3;
    public int t4;
    public boolean t5;
    public int t6;
    public final Paint t7;
    public hp8 t8;
    public boolean t9;
    public final ir1 ta;
    public boolean tb;
    public final tg2 tc;
    public p7 u0;
    public p7 u1;
    public je5 u2;
    public boolean u3;
    public TLRPC.Chat u4;
    public k27 u5;
    public int u6;
    public final Matrix u7;
    public yo8 u8;
    public bt1 u9;
    public wx8 ua;
    public boolean ub;
    public final vu1 uc;
    public p7 v0;
    public p7 v1;
    public je5 v2;
    public AnimatorSet v3;
    public boolean v4;
    public k27 v5;
    public int v6;
    public LinearGradient v7;
    public final vf6 v8;
    public View v9;
    public fd2 va;
    public vf6 vb;
    public boolean vc;
    public final dq1 w;
    public p7 w0;
    public p7 w1;
    public boolean w2;
    public ValueAnimator w3;
    public boolean w4;
    public f27 w5;
    public int w6;
    public boolean w7;
    public String w8;
    public boolean w9;
    public qu9 wa;
    public vf6 wb;
    public boolean wc;
    public wp1 x;
    public ClippingImageView x0;
    public yb2 x1;
    public je5 x2;
    public float x3;
    public boolean x4;
    public o27 x5;
    public int x6;
    public boolean x7;
    public long x8;
    public boolean x9;
    public boolean xa;
    public boolean xb;
    public boolean xc;
    public wp1 y;
    public ijb y0;
    public dz1 y1;
    public boolean y2;
    public boolean y3;
    public boolean y4;
    public u47 y5;
    public int y6;
    public byte y7;
    public String y8;
    public boolean y9;
    public xd2 ya;
    public boolean yb;
    public long yc;
    public i4d z0;
    public boolean z1;
    public je5 z2;
    public boolean z3;
    public boolean z4;
    public k27 z5;
    public final ArrayList z6;
    public boolean z7;
    public boolean z8;
    public float z9;
    public ku1 za;
    public Paint zb;
    public boolean zc;

    public mu1(Bundle bundle) {
        super(bundle);
        kl0 kl0Var;
        this.a = 0;
        this.c = false;
        this.d = false;
        this.s = new HashMap();
        this.w = new dq1(this, new wl1(this, (byte) 27));
        e59 e59Var = new e59(0, false);
        this.F = e59Var;
        e59 e59Var2 = new e59(0, false);
        this.G = e59Var2;
        this.Y = new nqc();
        this.K0 = bkb.Ii;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.o1 = new ArrayList();
        this.Q2 = new be0[2];
        this.R2 = new lu1[2];
        this.S2 = new jia[2];
        this.T2 = new au1[2];
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
        this.L6 = new vf6();
        this.M6 = new ArrayList();
        this.N6 = new SparseArray();
        this.O6 = new vf6();
        this.P6 = new vf6();
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
        this.k7 = new h24();
        this.l7 = new m17(0, false, false, new fd(this, (byte) 2));
        this.p7 = new Matrix();
        Paint paint = new Paint(1);
        this.t7 = paint;
        this.u7 = new Matrix();
        this.F7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.0f));
        this.P7 = Integer.MAX_VALUE;
        this.Q7 = -1;
        this.Y7 = true;
        this.d8 = Integer.MAX_VALUE;
        this.k8 = -1;
        this.l8 = -10000;
        this.v8 = new vf6();
        this.O8 = new wl1(this, (byte) 28);
        hx4 hx4Var = new hx4();
        this.P8 = hx4Var;
        this.Q8 = new kl0(hx4Var, hx4Var, hx4Var);
        this.W8 = new Paint(1);
        this.X8 = 0.0f;
        this.a9 = 1.0f;
        this.b9 = 0.0f;
        this.h9 = true;
        this.m9 = new yq1(this);
        this.K9 = true;
        this.ta = new ir1(this, (byte) 0);
        this.Da = new qb2(this);
        this.Ja = new ur0(this, (byte) 2);
        this.Ka = new pr1(this);
        this.Ma = -1;
        this.db = new fs1(this);
        this.eb = new ms1(this);
        this.gb = new yo1(this);
        this.hb = new dp1(this);
        this.ib = new vp1(this);
        this.jb = new xt1(this);
        this.kb = new vm1(this, (byte) 6);
        this.lb = new vm1(this, (byte) 8);
        this.Kb = new int[2];
        this.jc = new RectF();
        this.mc = new vm1(this, (byte) 10);
        this.tc = new tg2((byte) 11);
        this.uc = new Object();
        this.Lc = false;
        s33 s33Var = s33.h;
        this.dd = new fm0(0, this, s33Var, 320L, false);
        this.ed = new fm0(1, this, s33Var, 520L, false);
        this.fd = new fm0(2, this, s33Var, 520L, false);
        this.gd = new fm0(3, this, s33Var, 320L, false);
        this.hd = new fm0(4, this, s33Var, 320L, false);
        this.id = new fm0(5, this, s33Var, 320L, false);
        this.jd = new fm0(6, this, s33Var, 320L, false);
        this.kd = new igf(new vm1(this, (byte) 12));
        this.md = new Rect();
        ?? obj = new Object();
        this.N = obj;
        if (Build.VERSION.SDK_INT >= 31 && gba.f()) {
            cq3 cq3Var = new cq3(false);
            this.H = cq3Var;
            this.I = Math.max(0, gl.L(48.0f) - Math.min(gl.n, gl.m));
            lx4 lx4Var = new lx4(obj);
            this.K = lx4Var;
            lx4Var.d = cq3Var;
            lx4Var.e = -3;
            lx4Var.f = obj;
            kl0 kl0Var2 = new kl0(lx4Var, lx4Var, lx4Var);
            this.M = kl0Var2;
            kl0Var2.k = true;
            if (e66.e(262144)) {
                lx4 lx4Var2 = new lx4(obj);
                this.J = lx4Var2;
                lx4Var2.d = cq3Var;
                lx4Var2.e = -2;
                lx4Var2.f = obj;
                kl0Var = new kl0(lx4Var2, lx4Var2, lx4Var2);
                this.L = kl0Var;
                kl0Var.k = true;
            } else {
                this.J = null;
                kl0Var = this.M;
                this.L = kl0Var;
            }
        } else {
            this.H = null;
            this.I = 0;
            this.J = null;
            this.K = null;
            kl0Var = new kl0(obj, obj, obj);
            this.L = kl0Var;
            this.M = new kl0(obj, obj, obj);
        }
        kl0 kl0Var3 = new kl0(obj, obj, obj);
        this.O = kl0Var3;
        kl0Var3.g = e59Var;
        kl0Var.g = e59Var;
        this.M.g = e59Var;
        this.Q8.g = new e59(0, false);
        this.O.f = e59Var2;
        this.L.f = e59Var2;
        this.M.f = e59Var2;
        this.Q8.f = e59Var2;
    }

    public static Integer D6(ArrayList arrayList, int i, int[] iArr) {
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

    public static TLRPC.TL_message I5(TLRPC.Message message) {
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

    public static boolean L7(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static int N0(mu1 mu1Var) {
        return mu1Var.currentAccount;
    }

    public static ArrayList O5(ArrayList arrayList, boolean z, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            y3a y3aVar = (y3a) arrayList.get(i);
            String str = y3aVar.c;
            if (str == null) {
                if (y3aVar.a != null) {
                    try {
                        File q0 = gl.q0("", z);
                        InputStream openInputStream = a.b.getContentResolver().openInputStream(y3aVar.a);
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
                        fa4.g(e, true);
                    }
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 != null) {
                Pair N0 = gl.N0(str2);
                jm6 jm6Var = new jm6(0, str2, ((Integer) N0.first).intValue(), y3aVar.o, 0, 0);
                jm6Var.n(N0);
                if (i == arrayList.size() - 1 && charSequence != null) {
                    jm6Var.a = charSequence;
                }
                arrayList2.add(jm6Var);
            }
        }
        return arrayList2;
    }

    public static CharSequence P6(k27 k27Var, f27 f27Var, int[] iArr) {
        if (k27Var != null) {
            String C1 = na7.q1(k27Var.K1).C1(k27Var.k.restriction_reason);
            if (!TextUtils.isEmpty(C1)) {
                return C1;
            }
            if (k27Var.S4() && !uyb.l(k27Var)) {
                return k27Var.i2();
            }
            CharSequence charSequence = k27Var.z;
            if (charSequence != null) {
                return charSequence;
            }
            if (f27Var != null) {
                ArrayList arrayList = f27Var.d;
                int size = arrayList.size();
                CharSequence charSequence2 = null;
                for (int i = 0; i < size; i++) {
                    k27 k27Var2 = (k27) arrayList.get(i);
                    CharSequence charSequence3 = k27Var2.z;
                    if (charSequence3 != null) {
                        if (charSequence2 == null) {
                            if (iArr != null) {
                                iArr[0] = k27Var2.e1();
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

    public static SpannableStringBuilder R6(long j, k27 k27Var, boolean z) {
        TLRPC.Chat K0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            long Z0 = k27Var.Z0();
            int i = k27Var.K1;
            if (j != Z0) {
                int i2 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i2 > 0) {
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(Z0));
                    if (V1 != null) {
                        spannableStringBuilder.append((CharSequence) qu2.m(0, V1.first_name, V1.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i2 < 0 && (K0 = na7.q1(i).K0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) K0.title).append((CharSequence) ":\n");
                }
            }
        }
        String C1 = na7.q1(k27Var.K1).C1(k27Var.k.restriction_reason);
        if (!TextUtils.isEmpty(C1)) {
            spannableStringBuilder.append((CharSequence) C1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = k27Var.z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(k27Var.v);
        return spannableStringBuilder;
    }

    public static FrameLayout S5(Activity activity, wjb wjbVar, CharSequence charSequence, int i) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setMinimumHeight(gl.L(48.0f));
        frameLayout.setPadding(gl.L(14.0f), gl.L(4.0f), gl.L(14.0f), gl.L(4.0f));
        wb wbVar = new wb(activity, (byte) 17);
        int i2 = 3;
        wbVar.setMaxLines(3);
        wbVar.setGravity(3);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(wbVar, bkb.D8, wjbVar);
        wbVar.setTextSize(1, i);
        wbVar.setMaxWidth(gl.L(170.0f));
        wbVar.setText(charSequence);
        if (k96.a0) {
            i2 = 5;
        }
        frameLayout.addView(wbVar, nme.e(-1, -2, i2 | 16));
        return frameLayout;
    }

    public static mu1 V9(int i, long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("message_id", i);
        return new mu1(bundle);
    }

    public static mu1 W9(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new mu1(bundle);
    }

    public static void x6(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z, boolean z2, boolean z3, boolean z4) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i = 6;
        if (z) {
            menu.add(2131296498, 2131296504, 6, k96.M0(2131746247, null));
            i = 7;
        }
        if (z4) {
            menu.add(2131296498, 2131296510, i, k96.M0(2131745025, null));
            i++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, i, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i2 = i + 2;
        menu.add(2131296498, 2131296499, i + 1, spannableStringBuilder2);
        if (z3) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(k96.M0(2131748158, null));
            spannableStringBuilder3.setSpan(new z3c(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296498, 2131296501, i2, spannableStringBuilder3);
            i2 = i + 3;
        }
        if (encryptedChat == null || gl.W0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(k96.M0(2131744196, null));
            ?? obj = new Object();
            obj.a |= 8;
            spannableStringBuilder4.setSpan(new wib(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i3 = i2 + 1;
            menu.add(2131296498, 2131296511, i2, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(k96.M0(2131743650, null));
            ?? obj2 = new Object();
            obj2.a |= 16;
            spannableStringBuilder5.setSpan(new wib(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i2 += 2;
            menu.add(2131296498, 2131296514, i3, spannableStringBuilder5);
        }
        if (z2) {
            menu.add(2131296498, 2131296500, i2, k96.M0(2131751732, null));
            i2++;
        }
        if (z && encryptedChat == null) {
            menu.add(2131296498, 2131296495, i2, k96.M0(2131750573, null));
            i2++;
        }
        menu.add(2131296498, 2131296505, i2, k96.M0(2131746144, null));
    }

    public final void A4(k27 k27Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        if (k27Var.D == 3) {
            hdVar.U = k96.M0(2131747986, null);
        } else {
            hdVar.U = k96.a0("NoHandleAppInstalled", null, 2131748013, k27Var.F0().mime_type);
        }
        showDialog(hdVar);
    }

    public final void A5() {
        if (this.b1 != null) {
            this.b1.setPadding(gl.L(7.0f) + ((int) ((1.0f - N6()) * (1.0f - this.hd.e) * g7())), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
        }
    }

    public final void A6(boolean z) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.r8 != null && !hc2.r0(chat) && !this.e.creator) {
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

    public final void A7() {
        ValueAnimator valueAnimator = this.Gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        uk1 uk1Var = this.o3;
        if (uk1Var != null && uk1Var.getTag() != null) {
            this.o3.setTag(null);
            uk1 uk1Var2 = this.o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new pl1(this, uk1Var2, (byte) 1));
            ofFloat.addListener(new u5(this, uk1Var2, (byte) 7));
            ofFloat.setDuration(150L);
            this.Gb = ofFloat;
            ofFloat.start();
        }
    }

    public final void A8(boolean[] zArr, Context context) {
        k27 k27Var;
        k27 k27Var2 = this.F5;
        if (k27Var2 == null || !k27.c3(k27Var2.k)) {
            boolean z = zArr[0];
            if (z) {
                zArr[0] = false;
            }
            byte b = this.Sb;
            if (b == 5) {
                int i = this.currentAccount;
                long j = this.l6;
                u47 u47Var = this.y5;
                if (u47Var == null) {
                    u47Var = u47.a();
                }
                new t47(context, i, j, u47Var, this, getResourceProvider(), 0, new hl1(this, (byte) 1)).show();
            } else if (b == 1 && (k27Var = this.H5) != null) {
                if (k27Var.o5() && !z) {
                    u47 u47Var2 = this.y5;
                    if (u47Var2 == null) {
                        u47Var2 = u47.a();
                    }
                    kc(u47Var2);
                } else if (this.H5.t() && this.G5 == 0) {
                    if (this.Y1 == null) {
                        L5();
                    }
                    this.Y1.r1(-1, this.H5);
                    ca();
                } else {
                    J(this.H5.e1(), 0, 0, 0, true, true);
                }
            } else if (this.x5 != null) {
                if (b == 2) {
                    if (!cf3.B(this.l6) && !this.x5.u && this.g4 != 5) {
                        boolean z2 = gba.a;
                        SharedPreferences.Editor edit = na7.c1().edit();
                        gba.P = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        ha(0);
                        return;
                    }
                    k27 k27Var3 = this.F5;
                    if (k27Var3 != null) {
                        J(k27Var3.e1(), 0, 0, 0, true, true);
                    }
                } else if (b == 3) {
                    boolean z3 = gba.a;
                    SharedPreferences.Editor edit2 = na7.c1().edit();
                    gba.O = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    ha(1);
                } else if (b == 4) {
                    ha(2);
                }
            }
        }
    }

    public final void A9(String str) {
        Uri parse = Uri.parse(str);
        n95.b(getParentActivity(), this.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public final void Aa(gb2 gb2Var) {
        jd8 jd8Var;
        if (this.fd.f && (jd8Var = this.ld) != null && jd8Var.n == gb2Var) {
            Editable text = jd8Var.a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().k4.M.f()) {
                z3a B = z3a.B(this.currentAccount);
                k27 messageObject = gb2Var.getMessageObject();
                ld8 attachedMedia = this.ld.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m1 = k27.m1(messageObject);
                    if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = k27.B0(messageObject.k);
                        messageObject.e1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) m1).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = B.getMediaDataController().Y(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof pd8) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((pd8) attachedMedia).c);
                            z3a.W(B.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof vd8) {
                            vd8 vd8Var = (vd8) attachedMedia;
                            B.s(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) vd8Var.b, null, null, null, false, false, vd8Var.c);
                        } else if (attachedMedia instanceof sd8) {
                            tL_inputPollAnswer.input_media = apb.h(((sd8) attachedMedia).b);
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof qd8) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((qd8) attachedMedia).b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                za();
                return;
            }
            gl.z3(this.ld.a);
        }
    }

    public final void Ab(int i, int i2, String str) {
        this.d8 = i;
        this.f8 = true;
        this.g8 = 0L;
        this.h8 = str;
        this.k8 = i2;
        this.e8 = true;
    }

    public final void Ac() {
        TLRPC.User user;
        boolean z;
        if (this.j0 != null && (user = this.f) != null && this.h == null && user.bot) {
            vf6 vf6Var = this.v8;
            boolean z2 = false;
            if (vf6Var.m() != 0) {
                boolean z3 = false;
                z = false;
                for (int i = 0; i < vf6Var.m(); i++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vf6Var.n(i);
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

    public final void B4() {
        long j;
        kc2 kc2Var = this.ma;
        if (kc2Var != null) {
            if (this.x4) {
                if (kc2Var.I != null) {
                    if (getParentLayout() != null) {
                        dd0.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f, this.r4, this.l6, this.Sa, this.Ra);
                    }
                    TLRPC.Chat chat = this.e;
                    TLRPC.TL_forumTopic tL_forumTopic = this.ma.I;
                    long j2 = this.l6;
                    int i = this.Ra;
                    int i2 = this.Sa;
                    if (getParentLayout() != null) {
                        dd0.a(this, getParentLayout().getFragmentStack().indexOf(this), chat, null, tL_forumTopic, j2, i, i2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", this.ma.a);
                    bundle.putInt("dialog_filter_id", this.ma.b);
                    bundle.putBoolean("pulled", true);
                    mu1 h = mm4.h(this, -this.l6, this.ma.I, 0, bundle);
                    h.oa = true;
                    ud = true;
                    presentFragment(h, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = kc2Var.H;
            long j3 = 0;
            if (chat2 == null) {
                j = 0;
            } else {
                j = chat2.id;
            }
            if (j != 0) {
                w4();
                kc2 kc2Var2 = this.ma;
                TLRPC.Chat chat3 = kc2Var2.H;
                long j4 = kc2Var2.a0;
                int i3 = kc2Var2.a;
                int i4 = kc2Var2.b;
                if (getParentLayout() != null) {
                    dd0.a(this, getParentLayout().getFragmentStack().indexOf(this), chat3, null, null, j4, i3, i4);
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
                na7.q1(this.currentAccount).W3.edit().remove("diditem" + this.ma.a0).apply();
                mu1 mu1Var = new mu1(bundle2);
                ArrayList arrayList = this.Fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = this.Fb;
                    mu1Var.Fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                mu1Var.oa = true;
                ud = true;
                presentFragment(mu1Var, true);
            }
        }
    }

    public final void B5() {
        float f = this.T9;
        lr1 lr1Var = this.D1;
        if (lr1Var != null) {
            lr1Var.setTranslationY(f);
            f += gl.L(35.0f) * this.D1.F;
        }
        xq1 xq1Var = this.E1;
        if (xq1Var != null) {
            xq1Var.setTranslationY(f);
        }
        float N6 = (N6() * gl.L(43.0f)) + f;
        kxb kxbVar = this.g2;
        gxb gxbVar = gxb.a;
        if (kxbVar != null) {
            kxbVar.setSideMenuBackgroundMarginTop((N6() * l7(gl.L(7.0f))) + N6);
            float m7 = m7(gxbVar);
            float a = zfe.a(this.hd.e);
            float N62 = N6();
            N6 += zfe.a(Math.min(moe.a(zfe.a(a), 0.0f, 1.0f), moe.a(zfe.a(N62), 0.0f, 1.0f))) * m7;
        }
        ez1 ez1Var = this.b1;
        if (ez1Var != null) {
            ez1Var.setTranslationY((N6 - gl.L(5.0f)) - (N6() * m7(gxbVar)));
        }
    }

    public final void B6(defpackage.k27 r78, java.util.ArrayList r79, java.util.ArrayList r80, java.util.ArrayList r81) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.B6(k27, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final boolean B7(boolean z) {
        yr1 yr1Var;
        yr1 yr1Var2 = this.M2;
        if (yr1Var2 == null || yr1Var2.getTag() != null) {
            return false;
        }
        ez1 ez1Var = this.b1;
        if (ez1Var != null && (yr1Var = this.M2) != null) {
            ez1Var.j(yr1Var, false, z);
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

    public final void B8() {
        k27 k27Var;
        k27 k27Var2;
        m27 m27Var;
        ArrayList arrayList;
        String a0;
        this.y5 = null;
        byte b = this.Sb;
        if (b == 2) {
            this.D5 = null;
            this.F5 = null;
            o27 o27Var = this.x5;
            if (o27Var != null) {
                o27Var.f(null, null, this.l6, null);
            }
            w6();
        } else if (b == 3) {
            o27 o27Var2 = this.x5;
            if (o27Var2 != null && !o27Var2.c() && (m27Var = this.x5.b) != null && (arrayList = m27Var.e) != null) {
                int size = arrayList.size();
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    k27 k27Var3 = (k27) this.x5.b.e.get(i);
                    if (j == 0) {
                        j2 = k27.B0(k27Var3.k);
                        j = k27Var3.Z0();
                    } else if (j != k27Var3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                hd hdVar = alertDialog$Builder.a;
                hdVar.J0 = true;
                if (j2 > 0) {
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j2));
                    if (V1 != null) {
                        a0 = k96.a0("CancelForwardPrivate", null, 2131752571, k96.G(this.x5.b.e.size(), "MessagesBold", new Object[0]), qu2.m(0, V1.first_name, V1.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j2));
                    if (K0 != null) {
                        a0 = k96.a0("CancelForwardChat", null, 2131752572, k96.G(this.x5.b.e.size(), "MessagesBold", new Object[0]), K0.title);
                    } else {
                        return;
                    }
                }
                hdVar.U = gl.S2(a0);
                hdVar.S = k96.G(this.x5.b.e.size(), "messages", new Object[0]);
                alertDialog$Builder.j(k96.M0(2131752570, null), new yk1(this, (byte) 6));
                alertDialog$Builder.g(k96.M0(2131745151, null), new yk1(this, (byte) 7));
                showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, getResourceProvider());
                }
            }
        } else if (b == 4) {
            this.Y5 = null;
            o27 o27Var3 = this.x5;
            if (o27Var3 != null) {
                int i2 = this.currentAccount;
                k27 k27Var4 = this.F5;
                if (k27Var4 == this.m4) {
                    k27Var2 = null;
                } else {
                    k27Var2 = k27Var4;
                }
                o27Var3.e(i2, null, null, k27Var2, this.D5, this.H5);
            }
            ar1 ar1Var = this.a0;
            ar1Var.N3 = null;
            ar1Var.O3 = false;
            u6();
            w6();
        } else {
            if (hc2.c0(this.e) && !this.x4 && (k27Var = this.F5) != null) {
                long b2 = k27.b2(this.currentAccount, k27Var.k, true, false);
                if (b2 != 0) {
                    getMediaDataController().F(this.l6, b2, false);
                }
            }
            Pb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public final void B9(cs5 cs5Var) {
        if (this.qc == null) {
            return;
        }
        cs5Var.u();
        O9(this.qc, false, true);
        d01.s(getParentActivity(), Uri.parse(this.qc.T0), true, false, false, null, null, false, na7.q1(this.currentAccount).k4.A2.f, false, false);
    }

    public final void Ba(gb2 gb2Var) {
        id8 id8Var;
        int i;
        if (this.a0 != null) {
            fm0 fm0Var = this.fd;
            if (!fm0Var.f && gb2Var.getMessageObject() != null) {
                at1 at1Var = this.m1;
                RectF rectF = gl.P;
                zec.c(gb2Var, at1Var, rectF);
                Rect rect = gl.Q;
                mb2 mb2Var = gb2Var.x2;
                if (mb2Var != null && (id8Var = mb2Var.l) != null && mb2Var.s) {
                    rect.set(id8Var.getBounds());
                    int measuredHeight = (int) (rectF.bottom - (((this.m1.getMeasuredHeight() - this.A0.getPaddingBottom()) + this.bd) - gl.L(2.0f)));
                    k27 messageObject = gb2Var.getMessageObject();
                    if (this.ld == null) {
                        this.ld = new jd8(this, this.resourceProvider, getParentActivity());
                        int indexOfChild = this.m1.indexOfChild(this.A0);
                        at1 at1Var2 = this.m1;
                        jd8 jd8Var = this.ld;
                        if (indexOfChild >= 0) {
                            at1Var2.addView(jd8Var, indexOfChild + 1, nme.g());
                        } else {
                            at1Var2.addView(jd8Var, nme.g());
                        }
                    }
                    if (messageObject.O3()) {
                        if (gb2Var.A2()) {
                            i = bkb.dc;
                        } else {
                            i = bkb.ic;
                        }
                        this.T0 = i;
                    } else {
                        if (gb2Var.A2()) {
                            i = bkb.ee;
                        } else {
                            i = bkb.de;
                        }
                        this.T0 = i;
                    }
                    this.ld.setColor(getThemedColor(i));
                    this.ld.setCellToWatch(gb2Var);
                    ((fm0) this.ld.b.b).a(false, false);
                    this.ld.setAnimatedVisibility(fm0Var.e);
                    this.ld.b.setOnClickListener(new fr7(new wl1(this, (byte) 29), (byte) 18));
                    jd8 jd8Var2 = this.ld;
                    jd8Var2.s = new vm1(this, (byte) 0);
                    py pyVar = jd8Var2.a;
                    pyVar.setOnKeyListener(new w6(this, (byte) 1));
                    pyVar.setOnEditorActionListener(new j(this, (byte) 5));
                    this.a0.T6 = pyVar;
                    gl.d3(new va7(this, measuredHeight, pyVar, (byte) 12), 100L);
                    fm0Var.a(true, true);
                }
            }
        }
    }

    public final void Bb(long j) {
        this.s4 = j;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = (int) j;
        new k27(this.currentAccount, tL_message, false, false);
    }

    public final void Bc(eq0 eq0Var) {
        String charSequence;
        if (na7.q1(this.currentAccount).i4.r()) {
            CharSequence text = eq0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            cme.b(charSequence, new ie(this, eq0Var, text, (byte) 12), new rh1(eq0Var, (byte) 3), false);
            return;
        }
        eq0Var.setClickable(false);
    }

    @Override
    public final cja C() {
        return this.m1;
    }

    public final void C4(boolean z, boolean z2) {
        long j;
        TLRPC.DraftMessage T;
        Long l;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j2;
        k27 k27Var;
        TLRPC.TL_forumTopic f;
        TLRPC.Message message2;
        k27 k27Var2;
        String str;
        int Y;
        TLRPC.SuggestedPost suggestedPost;
        long j3;
        int i;
        long j4;
        Paint.FontMetricsInt fontMetricsInt;
        gm gmVar;
        TLRPC.InputReplyTo inputReplyTo;
        long j5;
        TLRPC.Message message3;
        Pair pair;
        Long l2;
        TLRPC.DraftMessage draftMessage;
        if (this.a0 != null) {
            int i2 = this.g4;
            int i3 = 8;
            if (i2 == 0 || i2 == 8 || (i2 == 3 && getUserConfig().e() == X6())) {
                long j6 = 0;
                if (this.g4 == 8) {
                    if (hc2.p0(this.e)) {
                        if (this.s4 == 0 && hc2.A(this.currentAccount, this.e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                bu1 bu1Var = null;
                bu1 bu1Var2 = null;
                bu1Var = null;
                bu1Var = null;
                bu1Var = null;
                if (N7()) {
                    vf6 vf6Var = (vf6) getMediaDataController().u1.f(this.l6);
                    if (vf6Var != null && vf6Var.m() > 0) {
                        pair = new Pair(Long.valueOf(vf6Var.j(0)), vf6Var.n(0));
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
                    hq6 mediaDataController = getMediaDataController();
                    long j7 = this.l6;
                    if (this.g4 == 3) {
                        j = 0;
                    } else {
                        j = this.s4;
                    }
                    T = mediaDataController.T(j7, j);
                    l = null;
                }
                ar1 ar1Var = this.a0;
                if (T != null) {
                    richMessage = T.rich_message;
                } else {
                    richMessage = null;
                }
                ar1Var.setRichDraftPreview(richMessage);
                cq6 U = hq6.d0(this.currentAccount).U(this.l6, d());
                if (T != null && (inputReplyTo = T.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    hq6 mediaDataController2 = getMediaDataController();
                    long j8 = this.l6;
                    if (l != null) {
                        j5 = l.longValue();
                    } else {
                        j5 = this.s4;
                    }
                    vf6 vf6Var2 = (vf6) mediaDataController2.v1.f(j8);
                    if (vf6Var2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) vf6Var2.f(j5);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z2 || T == null) && this.a0.getFieldText() != null && (this.g4 != 0 || getUserConfig().e() != a() || T == null || this.Gc >= T.date)) {
                    if (z && T == null) {
                        this.a0.setFieldText("");
                        this.a0.setEffectId(0L);
                        w7(true);
                    }
                } else if (U != null) {
                    this.a0.setVoiceDraft(U);
                } else if (T != null) {
                    this.Gc = T.date;
                    ar1 ar1Var2 = this.a0;
                    ar1Var2.N3 = null;
                    ar1Var2.O3 = !T.no_webpage;
                    boolean isEmpty = T.entities.isEmpty();
                    ?? r11 = T.message;
                    if (!isEmpty) {
                        r11 = SpannableStringBuilder.valueOf(r11);
                        Collections.sort(T.entities, hq6.g2);
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
                                            wib wibVar = new wib(obj, 0);
                                            int i5 = messageEntity.offset;
                                            hq6.f(wibVar, i5, messageEntity.length + i5, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                            ?? obj2 = new Object();
                                            obj2.a |= 2;
                                            wib wibVar2 = new wib(obj2, 0);
                                            int i6 = messageEntity.offset;
                                            hq6.f(wibVar2, i6, messageEntity.length + i6, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                            ?? obj3 = new Object();
                                            obj3.a |= i;
                                            wib wibVar3 = new wib(obj3, 0);
                                            int i7 = messageEntity.offset;
                                            hq6.f(wibVar3, i7, messageEntity.length + i7, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                            ?? obj4 = new Object();
                                            obj4.a |= 16;
                                            wib wibVar4 = new wib(obj4, 0);
                                            int i8 = messageEntity.offset;
                                            hq6.f(wibVar4, i8, messageEntity.length + i8, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                            i4c i4cVar = new i4c(messageEntity.url, null);
                                            int i9 = messageEntity.offset;
                                            r11.setSpan(i4cVar, i9, messageEntity.length + i9, 33);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                            ?? obj5 = new Object();
                                            obj5.a |= 256;
                                            wib wibVar5 = new wib(obj5, 0);
                                            int i10 = messageEntity.offset;
                                            hq6.f(wibVar5, i10, messageEntity.length + i10, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                            int i11 = messageEntity.offset;
                                            ey8.c(r11, i11, messageEntity.length + i11, messageEntity.collapsed);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                            try {
                                                fontMetricsInt = this.a0.getEditField().getPaint().getFontMetricsInt();
                                            } catch (Exception e) {
                                                fa4.g(e, false);
                                                fontMetricsInt = null;
                                            }
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                            if (tL_messageEntityCustomEmoji.document != null) {
                                                gmVar = new gm(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                            } else {
                                                gmVar = new gm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                            }
                                            int i12 = messageEntity.offset;
                                            r11.setSpan(gmVar, i12, messageEntity.length + i12, 33);
                                        }
                                    } else {
                                        ?? obj6 = new Object();
                                        obj6.a |= 4;
                                        wib wibVar6 = new wib(obj6, 0);
                                        int i13 = messageEntity.offset;
                                        hq6.f(wibVar6, i13, messageEntity.length + i13, r11, true);
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
                            j4c j4cVar = new j4c(String.valueOf(j4), 3, null);
                            int i14 = messageEntity.offset;
                            r11.setSpan(j4cVar, i14, messageEntity.length + i14, 33);
                            i4++;
                            i3 = i;
                            j6 = j3;
                        }
                    }
                    j2 = j6;
                    this.a0.G1(r11, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.a0.setSelection(T.message.indexOf(10) + 1);
                        gl.d3(new my(this, (byte) 6), 700L);
                    }
                    this.a0.setEffectId(T.effect);
                    if (T != null && (suggestedPost = T.suggested_post) != null) {
                        u47 b = u47.b(suggestedPost);
                        this.y5 = b;
                        Tb(b);
                    }
                    k27Var = this.F5;
                    if (k27Var != null || this.m4 == k27Var) {
                        if (message == null && ((k27Var2 = this.m4) == null || k27Var2.e1() != message.id)) {
                            k27 k27Var3 = new k27(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = k27Var3;
                            TLRPC.InputReplyTo inputReplyTo2 = T.reply_to;
                            if (inputReplyTo2 != null) {
                                int i15 = inputReplyTo2.flags;
                                if ((i15 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i16 = -1;
                                    if (arrayList != null) {
                                        int i17 = inputReplyTo2.quote_offset;
                                        if (!arrayList.isEmpty()) {
                                            k27.B0(k27Var3.k);
                                            ?? obj7 = new Object();
                                            obj7.a = k27Var3;
                                            obj7.b = -1;
                                            obj7.c = -1;
                                            obj7.d = -1;
                                            obj7.m = true;
                                            obj7.e(i17, arrayList);
                                            bu1Var2 = obj7;
                                        }
                                        this.D5 = bu1Var2;
                                    } else {
                                        String str2 = inputReplyTo2.quote_text;
                                        if ((i15 & 16) != 0) {
                                            i16 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = k27Var3.k;
                                        if (message4 != null && (str = message4.message) != null && str2 != null && (Y = k27.Y(i16, str, str2)) >= 0) {
                                            k27.B0(k27Var3.k);
                                            bu1Var = new bu1(Y, str2.length() + Y, k27Var3);
                                        }
                                        this.D5 = bu1Var;
                                    }
                                }
                            }
                            b5(false);
                            bu1 bu1Var3 = this.D5;
                            k27 k27Var4 = this.F5;
                            if (bu1Var3 != null) {
                                Sb(k27Var4, bu1Var3);
                            } else {
                                Rb(k27Var4);
                            }
                            Dc(false);
                            return;
                        } else if (l == null && l.longValue() != j2 && this.e != null && (f = getMessagesController().g4.f(this.e.id, l.longValue())) != null && (message2 = f.topicStartMessage) != null) {
                            k27 k27Var5 = new k27(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = k27Var5;
                            k27Var5.j1 = f;
                            Rb(k27Var5);
                            Dc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j2 = 0;
                if (T != null) {
                    u47 b2 = u47.b(suggestedPost);
                    this.y5 = b2;
                    Tb(b2);
                }
                k27Var = this.F5;
                if (k27Var != null) {
                }
                if (message == null) {
                }
                if (l == null) {
                }
            }
        }
    }

    public final void C5() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i;
        k27 k27Var;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.N6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i2 = 0;
            vf6 vf6Var = null;
            ArrayList arrayList3 = null;
            int i3 = 0;
            while (true) {
                arrayList = this.M6;
                if (i3 >= size) {
                    break;
                }
                k27 k27Var2 = (k27) sparseArray.valueAt(i3);
                if (k27Var2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i3)));
                    if (!(k27Var2.k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = k27Var2.C.k.fwd_from) != null && k27.B1(messageFwdHeader.saved_from_peer) == this.l6 && (i = k27Var2.C.k.fwd_from.channel_post) != 0 && (k27Var = (k27) this.G6[i2].get(i)) != null && (messageReplies = k27Var.k.replies) != null) {
                        messageReplies.replies++;
                        k27Var.k1 = true;
                        TLRPC.Message message = k27Var2.k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i4 = i2;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            } else if (k27.B1(k27Var.k.replies.recent_repliers.get(i4)) == k27.B1(peer)) {
                                k27Var.k.replies.recent_repliers.remove(i4);
                                break;
                            } else {
                                i4++;
                            }
                        }
                        k27Var.k.replies.recent_repliers.add(i2, peer);
                        if (!k27Var2.N3()) {
                            k27Var.k.replies.max_id = k27Var2.e1();
                        }
                        ad7 messagesStorage = getMessagesStorage();
                        long j = this.e.id;
                        int e1 = k27Var.e1();
                        TLRPC.MessageReplies messageReplies2 = k27Var.k.replies;
                        messagesStorage.a.c(new lc7(messagesStorage, e1, j, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (k27Var.z2()) {
                            f27 f27Var = (f27) this.P6.f(k27Var.c1());
                            if (f27Var != null) {
                                ArrayList arrayList4 = f27Var.d;
                                if (vf6Var == null) {
                                    vf6Var = new vf6();
                                }
                                vf6Var.k(f27Var, f27Var.a);
                                int size3 = arrayList4.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    ((k27) arrayList4.get(i5)).k1 = true;
                                }
                            }
                        } else if (this.D0 != null && (indexOf = arrayList.indexOf(k27Var)) >= 0) {
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
                if (vf6Var != null) {
                    int m = vf6Var.m();
                    for (int i7 = 0; i7 < m; i7++) {
                        f27 f27Var2 = (f27) vf6Var.n(i7);
                        int indexOf2 = arrayList.indexOf((k27) b00.f(1, f27Var2.d));
                        if (indexOf2 >= 0) {
                            vs1 vs1Var = this.D0;
                            if (!vs1Var.O) {
                                vs1Var.l(indexOf2 + vs1Var.K, f27Var2.d.size());
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

    public final int C6() {
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
            k27 k27Var = (k27) arrayList3.get(i12);
            Integer num = k27Var.a3;
            if (num != null) {
                i6 = num.intValue();
                i4 = i13;
                i5 = i14;
            } else {
                int i16 = k27Var.D;
                if (i16 == 0) {
                    int W5 = k27Var.W5();
                    if ((k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaWebPage) && (k27.n1(k27Var.k).webpage instanceof TLRPC.TL_webPage)) {
                        i11 = gl.L(100.0f);
                    } else {
                        i11 = z;
                    }
                    i6 = W5 + i11;
                    if (k27Var.d4()) {
                        i10 = gl.L(42.0f) + i6;
                        i6 = i10;
                    }
                    i4 = i13;
                } else {
                    if (i16 == 20) {
                        i10 = gl.Y0(z);
                    } else if (i16 == 2) {
                        i10 = gl.L(72.0f);
                    } else if (i16 == 12) {
                        i10 = gl.L(71.0f);
                    } else if (i16 == 9) {
                        i10 = gl.L(100.0f);
                    } else if (i16 == 4) {
                        i10 = gl.L(114.0f);
                    } else if (i16 == 14) {
                        i10 = gl.L(82.0f);
                    } else {
                        if (i16 != 10 && i16 != 35 && i16 != 33 && i16 != 34) {
                            if (i16 != 11 && i16 != 18 && i16 != 31 && i16 != 30 && i16 != 25 && i16 != 21) {
                                if (i16 == 32) {
                                    i10 = gl.L(234.0f);
                                } else if (i16 == 5) {
                                    i10 = gl.u;
                                } else if (i16 == 19) {
                                    i6 = gl.L(30.0f) + k27Var.W5();
                                    i4 = i13;
                                } else if (i16 != 13 && i16 != 15) {
                                    if (gl.O1()) {
                                        min = gl.P0() * 0.7f;
                                    } else {
                                        Point point = gl.q;
                                        min = Math.min(point.x, point.y) * 0.7f;
                                    }
                                    int i17 = (int) min;
                                    int L2 = gl.L(100.0f) + i17;
                                    boolean z2 = z;
                                    if (i17 > gl.Y0(z2)) {
                                        i17 = gl.Y0(z2);
                                    }
                                    if (L2 > gl.Y0(z2)) {
                                        L2 = gl.Y0(z2);
                                    }
                                    ArrayList arrayList8 = k27Var.p0;
                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                        i4 = i13;
                                        photoSize = (TLRPC.PhotoSize) k27Var.p0.get(z2 ? 1 : 0);
                                    } else {
                                        i4 = i13;
                                        photoSize = null;
                                    }
                                    if (photoSize != null) {
                                        int i18 = (int) (photoSize.h / (photoSize.w / i17));
                                        if (i18 == 0) {
                                            i18 = gl.L(100.0f);
                                        }
                                        if (i18 <= L2) {
                                            if (i18 < gl.L(120.0f)) {
                                                L2 = gl.L(120.0f);
                                            } else {
                                                L2 = i18;
                                            }
                                        }
                                    }
                                    i6 = gl.L(14.0f) + L2;
                                } else {
                                    i4 = i13;
                                    Point point2 = gl.q;
                                    float f2 = point2.y * 0.4f;
                                    if (gl.O1()) {
                                        i7 = gl.P0();
                                    } else {
                                        i7 = point2.x;
                                    }
                                    float f3 = i7 * 0.5f;
                                    TLRPC.Document F0 = k27Var.F0();
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
                                        i9 = gl.L(100.0f) + i8;
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
                                    i6 = gl.L(14.0f) + i8;
                                    k27Var.a3 = Integer.valueOf(i6);
                                }
                            } else {
                                i4 = i13;
                                i5 = i14;
                                L = gl.L(50.0f);
                            }
                        } else {
                            i4 = i13;
                            i5 = i14;
                            L = gl.L(30.0f);
                        }
                        i6 = L;
                        k27Var.a3 = Integer.valueOf(i6);
                    }
                    i6 = i10;
                    i4 = i13;
                }
                i5 = i14;
                k27Var.a3 = Integer.valueOf(i6);
            }
            arrayList4.add(Integer.valueOf(i6));
            if (k27Var.q4() || i12 == indexOf) {
                if (i12 == indexOf) {
                    i15 = i4;
                }
                arrayList6.add(Integer.valueOf(i12));
                arrayList5.add(Integer.valueOf(i4));
                arrayList7.add(Integer.valueOf(i5));
            }
            if (k27Var.A2()) {
                if (!hashSet.contains(Long.valueOf(k27Var.c1()))) {
                    hashSet.add(Long.valueOf(k27Var.c1()));
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
            k27 k27Var2 = (k27) arrayList3.get(indexOf);
            int intValue = ((Integer) arrayList4.get(indexOf)).intValue();
            if (k27Var2.A2()) {
                if (!hashSet.contains(Long.valueOf(k27Var2.c1()))) {
                    hashSet.add(Long.valueOf(k27Var2.c1()));
                }
                if (k27Var2.q4() && !k27Var2.A2() && k27Var2 != this.b8) {
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
                        if (Math.abs(i24 - indexOf) > this.nc + 1 && Math.abs(i25 - i3) > this.nc + 1 && Math.abs(i26 - (i15 + i30)) > gl.q.y) {
                            i31 = -1;
                        }
                    }
                    if (i23 == i31 || (Math.abs(i23 - indexOf) > this.nc + 1 && Math.abs(i28 - i3) > this.nc + 1 && Math.abs(i27 - i15) > gl.q.y)) {
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
            if (k27Var2.q4()) {
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
            k27 k27Var3 = (k27) arrayList3.get(i34);
            int intValue3 = ((Integer) arrayList4.get(i34)).intValue();
            if (!k27Var3.A2()) {
                i32++;
                i33 += intValue3;
            } else if (!hashSet.contains(Long.valueOf(k27Var3.c1()))) {
                hashSet.add(Long.valueOf(k27Var3.c1()));
                i32++;
            }
            if (!k27Var3.q4() && !k27Var3.A2() && k27Var3 != this.b8) {
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
                    if (Math.abs(i39 - i34) >= this.nc + 1 && Math.abs(i40 - i32) >= this.nc + 1 && Math.abs(i41 - (intValue3 + i33)) > gl.q.y) {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                if (i36 == i2 || (Math.abs(i36 - i34) >= this.nc + 1 && Math.abs(i38 - i32) >= this.nc + 1 && Math.abs(i37 - i33) > gl.q.y)) {
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

    public final void C7() {
        sr1 sr1Var = this.Bb;
        if (sr1Var == null) {
            return;
        }
        this.Bb = null;
        sr1Var.b();
        if (sr1Var.getReactionsWindow() != null && sr1Var.getReactionsWindow().a != null) {
            sr1Var.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
        }
        sr1Var.animate().alpha(0.01f).translationY(-gl.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new aj1(this, sr1Var, (byte) 19)).setDuration(180L).start();
    }

    public final void C8(defpackage.cr1 r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.C8(cr1, boolean[]):void");
    }

    public final boolean C9() {
        k27 k27Var = this.qc;
        if (k27Var == null) {
            return false;
        }
        if (gl.g(k27Var.T0)) {
            new u21(f11.a(getParentActivity()), this.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public final void Ca(hf0 hf0Var, TLRPC.ReactionCount reactionCount, float f, float f2) {
        k27 messageObject;
        boolean z;
        boolean z2;
        TLRPC.Message message;
        h19 d = h19.d(reactionCount.reaction);
        if (hf0Var instanceof gb2) {
            messageObject = ((gb2) hf0Var).getPrimaryMessageObject();
        } else if (hf0Var instanceof uk1) {
            messageObject = ((uk1) hf0Var).getMessageObject();
        } else {
            return;
        }
        k27 k27Var = messageObject;
        lb(hf0Var, k27Var, null, null, f, f2, d, false, false, false, false);
        if (k27Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (k27Var.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            boolean z3 = this.D0.O;
            if (z3) {
                k27 k27Var2 = (k27) this.G6[0].get(k27Var.e1());
                if (k27Var2 != null && (message = k27Var2.k) != null) {
                    message.reactions = k27Var.k.reactions;
                }
            } else if (!z3 && this.F3 != null) {
                Gc(false);
            }
        }
        if (this.D0.O && !k27Var.v2(this.F3)) {
            f27 n7 = n7(k27Var);
            if (n7 != null) {
                ArrayList arrayList = n7.d;
                for (int i = 0; i < arrayList.size(); i++) {
                    getMediaDataController().P1(((k27) arrayList.get(i)).e1());
                }
            } else {
                getMediaDataController().P1(k27Var.e1());
            }
            ra7 ra7Var = this.b4;
            if (ra7Var != null) {
                ra7Var.f();
            }
            Gc(true);
        }
    }

    public final void Cb(View view) {
        View view2 = this.Z8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof uk1)) {
                ((uk1) view2).setInvalidateWithParent(null);
            }
            this.Z8 = view;
            if (view instanceof uk1) {
                ((uk1) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Cc() {
        if (this.g2 == null) {
            return;
        }
        float d = this.w.d();
        this.g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + gl.L(9.0f)) - gl.L(5.0f)) + d);
    }

    @Override
    public final List D() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (hc2.T(this.e)) {
            arrayList.add(new zi4(k96.M0(2131751600, null)));
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    M0 = k96.M0(2131751597, null);
                } else {
                    M0 = k96.M0(2131751598, null);
                }
            } else {
                M0 = k96.M0(2131751599, null);
            }
            arrayList.add(new zi4(k96.a0(null, null, 2131751596, M0), new vm1(this, (byte) 19)));
            arrayList.add(new zi4(k96.M0(2131751595, null), new vm1(this, (byte) 20)));
        }
        if (this.f == null) {
            arrayList.add(new zi4(k96.M0(2131751605, null)));
            arrayList.add(new zi4(k96.M0(2131751604, null), 0.0f, 255.0f, new pm("", (byte) 6)));
            arrayList.add(new zi4(k96.M0(2131751603, null), 1.0f, 10.0f, new v10(this)));
        }
        return arrayList;
    }

    public final boolean D4() {
        if (!hc2.u0(this.e)) {
            TLRPC.User user = this.f;
            if (!l7c.w(user) || !user.bot_forum_sidebar) {
                if (!l7c.w(this.f) && !hc2.a(this.e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void D5(boolean z) {
        boolean z2;
        this.M6.clear();
        this.J6.clear();
        this.K6.clear();
        this.z6.clear();
        this.P6.b();
        this.y4 = false;
        vs1 vs1Var = this.D0;
        if (vs1Var != null) {
            if (vs1Var.x < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            gc(z2);
        }
        jq1 jq1Var = this.A0;
        if (jq1Var != null) {
            jq1Var.setEmptyView(null);
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
        vs1 vs1Var2 = this.D0;
        if (vs1Var2 != null && !vs1Var2.O) {
            vs1Var2.J(false);
        }
    }

    public final void D7() {
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        m21 m21Var = this.P3;
        if (m21Var != null) {
            m21Var.c(0L, false);
        }
        xr1 xr1Var = this.O3;
        if (xr1Var != null) {
            xr1Var.d(0, true);
        }
    }

    public final void D8() {
        le5.h.a();
        showDialog(new tv4(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void D9() {
        if (gl.g(this.qc.W0)) {
            new u21(f11.a(getParentActivity()), this.resourceProvider).i(k96.M0(2131743953, null)).j();
        }
    }

    public final void Da(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Da(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Db(ArrayList arrayList, TLRPC.Chat chat, int i, int i2, int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z;
        boolean z2;
        this.r4 = tL_forumTopic;
        this.p4 = arrayList;
        k27 k27Var = (k27) b00.f(1, arrayList);
        this.m4 = k27Var;
        this.F5 = k27Var;
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
        k27 k27Var2 = this.F5;
        TLRPC.MessageFwdHeader messageFwdHeader = k27Var2.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.v4 = z2;
        if (z) {
            k27Var2.p = true;
        }
        Vc();
        nd(false);
        Dc(false);
    }

    public final void Dc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Dc(boolean):void");
    }

    @Override
    public final void E(final jm6 jm6Var, final oac oacVar, final boolean z, final int i, final boolean z2, long j) {
        if (jm6Var == null) {
            return;
        }
        this.ed.a(false, true);
        k27 k27Var = this.H5;
        if (k27Var != null && k27Var.o5() && !hc2.z(this.currentAccount, 24, k27.B0(this.H5.k))) {
            u47 u47Var = this.y5;
            if (u47Var == null) {
                u47Var = u47.b(this.H5.k.suggested_post);
            }
            if (!gta.Q(this.currentAccount, u47Var.a)) {
                kc(u47Var);
                return;
            }
        }
        if (oacVar != null && oacVar.s) {
            wl1 wl1Var = new wl1(this, (byte) 26);
            this.I7 = wl1Var;
            gl.d3(wl1Var, 3000L);
        }
        y6(jm6Var.a, jm6Var.n);
        ij.Y(this.currentAccount, a(), 1, new p8c() {
            @Override
            public final void a(Object obj) {
                Long l = (Long) obj;
                mu1 mu1Var = mu1.this;
                k27 k27Var2 = mu1Var.H5;
                jm6 jm6Var2 = jm6Var;
                oac oacVar2 = oacVar;
                boolean z3 = z;
                int i2 = i;
                boolean z4 = z2;
                if (k27Var2 != null && k27Var2.o5()) {
                    u47 u47Var2 = mu1Var.y5;
                    if (u47Var2 == null) {
                        u47Var2 = u47.b(mu1Var.H5.k.suggested_post);
                    }
                    u47 u47Var3 = u47Var2;
                    if (jm6Var2.b) {
                        j5 accountInstance = mu1Var.getAccountInstance();
                        String str = jm6Var2.I;
                        String str2 = jm6Var2.g;
                        TLRPC.Photo photo = jm6Var2.e;
                        long j2 = mu1Var.l6;
                        k27 k27Var3 = mu1Var.H5;
                        k27 k27Var4 = mu1Var.m4;
                        bu1 bu1Var = mu1Var.D5;
                        ArrayList arrayList = jm6Var2.n;
                        int i3 = jm6Var2.x;
                        boolean z5 = jm6Var2.M;
                        CharSequence charSequence = jm6Var2.a;
                        z3a.a0(i3, i2, j2, jm6Var2.y, l.longValue(), mu1Var.c7(), accountInstance, bu1Var, k27Var3, k27Var4, null, u47Var3, mu1Var.Q6(), oacVar2, charSequence, str, str2, arrayList, photo, null, z3, z4, z5);
                    } else if (jm6Var2.h != null) {
                        z3a.Y(mu1Var.getAccountInstance(), jm6Var2.h, jm6Var2.c, null, mu1Var.l6, mu1Var.H5, mu1Var.m4, mu1Var.D5, jm6Var2.n, jm6Var2.r, null, jm6Var2.x, null, oacVar2, z3, i2, z4, jm6Var2.a, mu1Var.Q6(), jm6Var2.y, l.longValue(), mu1Var.c7(), u47Var3);
                    } else if (jm6Var2.I != null) {
                        z3a.Y(mu1Var.getAccountInstance(), jm6Var2.I, jm6Var2.c, null, mu1Var.l6, mu1Var.H5, mu1Var.m4, mu1Var.D5, jm6Var2.n, jm6Var2.r, null, jm6Var2.x, null, oacVar2, z3, i2, z4, jm6Var2.a, mu1Var.Q6(), jm6Var2.y, l.longValue(), mu1Var.c7(), u47Var3);
                    }
                } else if (jm6Var2.b) {
                    j5 accountInstance2 = mu1Var.getAccountInstance();
                    String str3 = jm6Var2.I;
                    String str4 = jm6Var2.g;
                    TLRPC.Photo photo2 = jm6Var2.e;
                    long j3 = mu1Var.l6;
                    k27 k27Var5 = mu1Var.F5;
                    k27 k27Var6 = mu1Var.m4;
                    bu1 bu1Var2 = mu1Var.D5;
                    ArrayList arrayList2 = jm6Var2.n;
                    int i4 = jm6Var2.x;
                    k27 k27Var7 = mu1Var.H5;
                    boolean z6 = jm6Var2.M;
                    CharSequence charSequence2 = jm6Var2.a;
                    z3a.a0(i4, i2, j3, jm6Var2.y, l.longValue(), mu1Var.c7(), accountInstance2, bu1Var2, k27Var5, k27Var6, k27Var7, mu1Var.y5, mu1Var.Q6(), oacVar2, charSequence2, str3, str4, arrayList2, photo2, null, z3, z4, z6);
                } else if (jm6Var2.h != null) {
                    z3a.Y(mu1Var.getAccountInstance(), jm6Var2.h, jm6Var2.c, null, mu1Var.l6, mu1Var.F5, mu1Var.m4, mu1Var.D5, jm6Var2.n, jm6Var2.r, null, jm6Var2.x, mu1Var.H5, oacVar2, z3, i2, z4, jm6Var2.a, mu1Var.Q6(), jm6Var2.y, l.longValue(), mu1Var.c7(), mu1Var.y5);
                } else if (jm6Var2.I != null) {
                    z3a.Y(mu1Var.getAccountInstance(), jm6Var2.I, jm6Var2.c, null, mu1Var.l6, mu1Var.F5, mu1Var.m4, mu1Var.D5, jm6Var2.n, jm6Var2.r, null, jm6Var2.x, mu1Var.H5, oacVar2, z3, i2, z4, jm6Var2.a, mu1Var.Q6(), jm6Var2.y, l.longValue(), mu1Var.c7(), mu1Var.y5);
                }
                mu1Var.z4();
            }
        }, j);
    }

    public final int E4(int i) {
        k27 messageObject;
        int i2;
        int height = this.A0.getHeight();
        int i3 = 0;
        long j = 0;
        while (true) {
            View U0 = this.A0.U0(i);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof gb2) {
                gb2 gb2Var = (gb2) U0;
                messageObject = gb2Var.getMessageObject();
                i2 = gb2Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof uk1) {
                messageObject = ((uk1) U0).getMessageObject();
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

    public final void E5(boolean z, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.R6;
        if (z) {
            if (w01.a) {
                StringBuilder sb = new StringBuilder("clear history by overwrite firstLoading=");
                sb.append(this.Z6);
                sb.append(" minMessage=");
                sb.append(iArr[0]);
                sb.append(" topMessage=");
                b00.p(tL_updates_channelDifferenceTooLong.dialog.top_message, sb);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i = dialog.top_message;
            int i2 = iArr[0];
            if (i > i2) {
                this.V7 = Math.max(i2 + 1, dialog.read_inbox_max_id);
            }
            this.W6[0] = false;
            this.X6 = false;
            vs1 vs1Var = this.D0;
            if (vs1Var != null && vs1Var.G < 0) {
                vs1Var.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i3 = dialog2.unread_count;
            this.B6 = i3;
            this.D6 = dialog2.unread_mentions_count;
            if (this.C6 != i3) {
                dz1 dz1Var = this.y1;
                if (dz1Var != null) {
                    dz1Var.c(1, i3, this.f6);
                }
                this.C6 = this.B6;
                Rc();
            }
            int i4 = this.D6;
            int i5 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i4 != i5) {
                this.D6 = i5;
                if (i5 <= 0) {
                    this.D6 = 0;
                    this.E6 = true;
                    ac(false);
                } else {
                    dz1 dz1Var2 = this.y1;
                    if (dz1Var2 != null) {
                        dz1Var2.c(2, i5, true);
                    }
                    ac(true);
                }
            }
            g5(false);
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
        u7();
        Uc(0, true);
        if (this.D8 != null) {
            this.D8 = null;
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.A1(null, true, false);
            }
        }
        if (this.R != null) {
            gc(false);
            N5(false);
            this.A0.setEmptyView(this.f1);
        }
        vs1 vs1Var2 = this.D0;
        if (vs1Var2 != null) {
            vs1Var2.J(false);
        }
        if (this.h == null && (user = this.f) != null && user.bot && this.w8 == null) {
            this.w8 = "";
            Dc(false);
        }
    }

    public final hf0 E6(int i, boolean z) {
        k27 messageObject;
        jq1 jq1Var = this.A0;
        if (jq1Var != null) {
            int childCount = jq1Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.A0.getChildAt(i2);
                if (childAt instanceof gb2) {
                    messageObject = ((gb2) childAt).getMessageObject();
                } else if (childAt instanceof uk1) {
                    messageObject = ((uk1) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.e1() == i) {
                    if (z) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.P9 - this.R9) - gl.L(4.0f) || childAt.getY() > this.A0.getMeasuredHeight() - this.Ya) {
                            return null;
                        }
                    }
                    return (hf0) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void E7() {
        boolean z;
        bd(0, 0, -1);
        getMediaDataController().Z1(this.I3, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, true, this.F3);
        if (TextUtils.isEmpty(this.I3) && this.F3 == null) {
            z = false;
        } else {
            z = true;
        }
        this.H3 = z;
        this.r0 = z;
        Dc(false);
        ed();
    }

    public final void E8() {
        if (this.g4 == 0 && getMessagesController().k4.Y2.f() > getConnectionsManager().getCurrentTime() && !h5.a(this.currentAccount, this.f)) {
            h5.c(this.currentAccount, getResourceProvider(), getParentActivity());
        }
    }

    public final void E9() {
        if (gl.g(this.qc.X0)) {
            new u21(f11.a(getParentActivity()), this.resourceProvider).i(k96.M0(2131743953, null)).j();
        }
    }

    public final void Ea(int i, String str, CharacterStyle characterStyle, gb2 gb2Var, boolean z) {
        boolean z2;
        vib vibVar;
        boolean z3;
        boolean z4 = false;
        try {
            String J0 = gl.J0(str, false);
            if ((this.h == null || getMessagesController().z2 == 1) && getMessagesController().k4.B3.f.contains(J0)) {
                z3a sendMessagesHelper = getSendMessagesHelper();
                if (i != 0 && i != 2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new pf2(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z3), 2);
                return;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (!z && !gl.D3(str)) {
            if (i == 0) {
                d01.r(getParentActivity(), Uri.parse(str), true, true, P9(gb2Var, characterStyle));
            } else if (i == 1) {
                Activity parentActivity = getParentActivity();
                Uri parse = Uri.parse(str);
                if (this.x8 == 0) {
                    z4 = true;
                }
                d01.r(parentActivity, parse, z4, true, P9(gb2Var, characterStyle));
            } else if (i == 2) {
                Activity parentActivity2 = getParentActivity();
                Uri parse2 = Uri.parse(str);
                if (this.x8 == 0) {
                    z4 = true;
                }
                d01.r(parentActivity2, parse2, z4, true, P9(gb2Var, characterStyle));
            }
        } else if (i != 0 && i != 2) {
            if (i == 1) {
                ij.o0(this, str, true, true, false, false, P9(gb2Var, characterStyle), null, this.Ba);
            }
        } else {
            if ((characterStyle instanceof i4c) && (vibVar = ((i4c) characterStyle).a) != null && (vibVar.a & 1024) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ij.o0(this, str, true, true, true, z2, P9(gb2Var, characterStyle), null, this.Ba);
        }
    }

    public final void Eb(ViewGroup viewGroup) {
        if (this.j0 != null && !this.inPreviewMode && !this.mb && this.Aa == null && (this.fragmentView instanceof FrameLayout)) {
            lx4 lx4Var = this.K;
            if (lx4Var != null) {
                lx4 lx4Var2 = this.J;
                if (lx4Var2 == null) {
                    lx4Var2 = lx4Var;
                }
                jx4 jx4Var = new jx4(lx4Var2, lx4Var);
                kl0 kl0Var = new kl0(jx4Var, jx4Var, jx4Var);
                kl0Var.k = true;
                kl0Var.j = L6();
                kl0Var.h = this.l1;
                kl0Var.i = viewGroup;
                kl0Var.g = this.F;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                aVar.X0 = kl0Var;
                aVar.Y0 = jx4Var;
            }
            this.actionBar.setMenuRise(gl.L(8.0f));
            this.j0.setSubMenuOverlayProvider(new ll1(this, (byte) 0));
        }
    }

    public final void Ec() {
        Dc(false);
    }

    @Override
    public final void F(float f, int i) {
        if (i == 2 && f == 0.0f) {
            jd8 jd8Var = this.ld;
            if (jd8Var != null) {
                this.m1.removeView(jd8Var);
                this.ld = null;
            }
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.h1();
            }
        }
    }

    public final float F4(boolean z) {
        float f;
        float f2;
        float f3;
        ar1 ar1Var = this.a0;
        float f4 = 0.0f;
        if (ar1Var != null) {
            if (z) {
                f = ar1Var.k7;
            } else {
                f = ar1Var.j7;
            }
        } else {
            f = 0.0f;
        }
        float max = Math.max(f, gl.L(44.0f));
        float L = gl.L(44.0f);
        fm0 fm0Var = this.fd;
        igf igfVar = this.kd;
        if (z) {
            if (31 - Integer.numberOfLeadingZeros(igfVar.a) == 1) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(igfVar.a) == 0) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            if (fm0Var.f) {
                f4 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) igfVar.b;
            float f5 = fArr[1];
            f2 = 1.0f - fArr[0];
            f4 = fm0Var.e;
            f3 = f5;
        }
        if (!this.mb && !isInPreviewMode()) {
            return gl.R1(Math.max(gl.R1(L, max, f3) * f2, gl.L(44.0f)), -gl.L(7.0f), f4);
        }
        return gl.R1(L, max, f3) * f2;
    }

    public final void F5(boolean z) {
        for (int i = 1; i >= 0; i--) {
            this.o6[i].clear();
            this.p6[i].clear();
            this.q6[i].clear();
        }
        u7();
        Uc(0, true);
        ud(z);
        hd();
    }

    public final uk1 F6(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i = 0; i < this.A0.getChildCount(); i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof uk1) {
                    uk1 uk1Var = (uk1) childAt;
                    if (c.P(uk1Var.getMessageObject(), wallettransaction)) {
                        return uk1Var;
                    }
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i2 >= arrayList.size()) {
                    break;
                } else if (c.P((k27) arrayList.get(i2), wallettransaction)) {
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

    public final void F7(int i) {
        cq3 cq3Var;
        if (Build.VERSION.SDK_INT >= 31 && (cq3Var = this.H) != null) {
            if (fod.a(i, 4)) {
                zw4 e = this.glassEngine.e();
                float L = gl.L(48.0f);
                float L2 = gl.L(48.0f);
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
                cq3Var.h(e);
            }
            at1 at1Var = this.m1;
            cq3Var.e(at1Var.w0, at1Var.getWidth(), this.m1.getHeight());
        }
    }

    public final void F8(Context context, TLRPC.TL_error tL_error) {
        boolean z;
        na7.q1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.l6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (hc2.T(this.e) && !this.e.megagroup) {
                z = true;
            } else {
                z = false;
            }
            int i = fu5.t1;
            fu5.E0(context, this, u21.b0(this), z);
        }
        Lb(false, true);
    }

    public final void F9(final defpackage.cb9[] r20, final defpackage.cs5 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.F9(cb9[], cs5):void");
    }

    public final void Fa(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final defpackage.k27 r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final defpackage.k27 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Fa(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, k27, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, k27):void");
    }

    public final void Fb() {
        gl.A3(5.0f, this.A0, null);
        pw0.APP_ERROR.a();
        ar1 ar1Var = this.a0;
        for (int i = 0; i < ar1Var.getChildCount(); i++) {
            gl.A3(5.0f, ar1Var.getChildAt(i), null);
        }
        org.telegram.ui.ActionBar.a actionBar = getActionBar();
        for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
            gl.A3(5.0f, actionBar.getChildAt(i2), null);
        }
    }

    public final void Fc() {
        int i;
        q11 q11Var;
        mr1 mr1Var;
        ar1 ar1Var;
        if (this.aa && this.A0 != null) {
            float f = 0.0f;
            if (this.Ma <= 0 || this.bb != 0.0f) {
                float l7 = l7(gl.L(7.0f));
                lr1 lr1Var = this.D1;
                if (lr1Var != null) {
                    i = gl.L(lr1Var.F * 35.0f);
                } else {
                    i = 0;
                }
                float N6 = (N6() * gl.L(43.0f)) + l7 + i;
                float f2 = this.P9;
                this.Q9 = N6;
                this.P9 = m7(gxb.a) + gl.L(4.0f) + this.S9 + N6;
                if (this.actionBar.getVisibility() == 0 || this.Aa != null) {
                    this.P9 += this.actionBar.getMeasuredHeight();
                }
                this.R9 = 0;
                this.P9 = this.P9 + this.Xa + this.T9;
                if (this.bb != 0.0f && (ar1Var = this.a0) != null && ar1Var.getVisibility() == 0) {
                    float f3 = this.P9;
                    float measuredHeight = this.bb * (this.a0.getMeasuredHeight() - gl.L(44.0f));
                    this.P9 = f3 - measuredHeight;
                    f = measuredHeight;
                }
                uk1 uk1Var = this.o3;
                if (uk1Var != null) {
                    uk1Var.setTranslationY(((this.A0.getTranslationY() + this.P9) + this.X9) - gl.L(30.0f));
                    float f4 = this.P9;
                    float f5 = this.X9;
                    this.P9 = f4 + f5;
                    this.R9 = (int) (this.R9 + f5);
                }
                rq1 rq1Var = this.m3;
                if (rq1Var != null) {
                    rq1Var.setTranslationY((((this.A0.getTranslationY() - f) + this.P9) + this.V9) - gl.L(4.0f));
                }
                Hc();
                jq1 jq1Var = this.A0;
                if (jq1Var != null && this.C0 != null && this.D0 != null) {
                    int paddingTop = jq1Var.getPaddingTop();
                    int paddingBottom = this.A0.getPaddingBottom();
                    t5();
                    if (this.A0.getPaddingTop() != paddingTop || this.A0.getPaddingBottom() != paddingBottom) {
                        I7();
                    }
                    this.A0.setTopGlowOffset((int) ((this.P9 - this.R9) - gl.L(4.0f)));
                    if (f2 != this.P9) {
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
                    if (!a8() && !this.R4 && this.b8 != null && this.A0 != null && ((mr1Var = this.e2) == null || mr1Var.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f2 - this.P9));
                    }
                }
                this.aa = false;
                m21 m21Var = m21.w;
                if (m21Var != null && (q11Var = m21Var.e) != null) {
                    q11Var.updatePosition();
                }
                t5();
            }
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final boolean G4(k27 k27Var) {
        if (!R7()) {
            TLRPC.Message message = k27Var.k;
            if ((message == null || !message.noforwards) && !k27Var.f4() && !k27Var.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void G5(boolean z) {
        this.h9 = z;
        m8 m8Var = this.g9;
        if (m8Var != null) {
            m8Var.dismiss();
        }
        if (!z) {
            ValueAnimator valueAnimator = this.Jc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Jc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Jc = ofFloat;
            ofFloat.addUpdateListener(new wk1(this, (byte) 0));
            this.Jc.setDuration(150L);
            this.Jc.start();
        }
    }

    public final void G6() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.G6():void");
    }

    public final void G7() {
        if (!this.aa) {
            this.aa = true;
            at1 at1Var = this.m1;
            if (at1Var != null) {
                at1Var.invalidate();
            }
            jq1 jq1Var = this.A0;
            if (jq1Var != null) {
                jq1Var.invalidate();
            }
        }
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(m7(gxb.c) + this.U.getInputBubbleHeight() + this.w.d() + gl.L(16.0f));
        }
        B5();
    }

    public final void G8(Context context) {
        boolean z;
        boolean z2;
        ez1 ez1Var;
        String str;
        if (getParentActivity() != null && this.ka == 0.0f) {
            if (this.g4 == 3) {
                Bundle bundle = new Bundle();
                long X6 = X6();
                if (X6 >= 0) {
                    bundle.putLong("user_id", X6);
                } else {
                    bundle.putLong("chat_id", -X6);
                }
                presentFragment(new mu1(bundle));
                return;
            }
            boolean z3 = false;
            if (T7()) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.o6;
                    if (i >= sparseArrayArr[0].size()) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i)));
                    i++;
                }
                Lb(true, true);
                byte[] bArr = this.k4;
                String str2 = this.l4;
                hl1 hl1Var = new hl1(this, (byte) 2);
                int i2 = b89.v1;
                int currentAccount = getCurrentAccount();
                Activity parentActivity = getParentActivity();
                long a = a();
                if (parentActivity != null) {
                    b89.D0(currentAccount, parentActivity, a, false, false, arrayList, u21.b0(this), getResourceProvider(), bArr, str2, hl1Var);
                }
            } else if (this.g4 == 2) {
                finishFragment();
                ws1 ws1Var = this.n9;
                if (this.E0.getTag() == null) {
                    z3 = true;
                }
                ws1Var.l(true, z3);
            } else {
                TLRPC.User user = this.f;
                if (user != null) {
                    if (user.id == 489000) {
                        vc(true);
                        return;
                    } else if (this.n) {
                        if (user.bot) {
                            String str3 = this.w8;
                            this.w8 = null;
                            getMessagesController().l5(new al1(this, str3, (byte) 3), this.f.id);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                        String M0 = k96.M0(2131754062, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = M0;
                        alertDialog$Builder.j(k96.M0(2131747638, null), new yk1(this, (byte) 8));
                        hdVar.S = k96.M0(2131689472, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        showDialog(hdVar);
                        return;
                    }
                }
                if (l7c.B(user)) {
                    vc(true);
                    return;
                }
                TLRPC.User user2 = this.f;
                if (user2 != null && user2.bot && (str = this.w8) != null) {
                    if (str.length() != 0) {
                        getMessagesController().E4(this.w8, this.f);
                    } else {
                        getSendMessagesHelper().q0(x3a.b("/start", this.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    }
                    this.w8 = null;
                    Dc(false);
                    return;
                }
                if (hc2.T(this.e)) {
                    TLRPC.Chat chat = this.e;
                    if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                        if (hc2.r0(chat)) {
                            if (this.e.join_request) {
                                Lb(true, true);
                                na7.q1(this.currentAccount).j(this.e.id, y6c.h(this.currentAccount).f(), 0, null, null, true, new my(this, (byte) 21), new q31(this, context, (byte) 11), null);
                                return;
                            }
                            my myVar = this.d6;
                            if (myVar != null) {
                                gl.r(myVar);
                                this.d6 = null;
                            }
                            Lb(true, true);
                            getMessagesController().k(this.e.id, getUserConfig().f(), null, this, null);
                            kk7.e().k(kk7.K4, new Object[0]);
                            k7 k7Var = this.Z1;
                            if (k7Var != null && (ez1Var = this.b1) != null && ez1Var.e(k7Var) && this.c2.getVisibility() != 8 && this.c2.getTag(2131296587) != null) {
                                na7.q1(this.currentAccount).W3.edit().putInt("dialog_bar_vis3" + this.l6, 3).commit();
                                getNotificationCenter().k(kk7.P0, Long.valueOf(this.l6));
                                return;
                            }
                            return;
                        }
                        vc(true);
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
                ij.r(this, false, chat2, user3, z2, true, false, z, new yk1(this, (byte) 9));
            }
        }
    }

    public final void G9() {
        if (this.qc == null) {
            return;
        }
        cb9[] cb9VarArr = {cb9.Y0(getParentActivity(), this, true, this.resourceProvider, new x0(this, cb9VarArr, (byte) 21))};
    }

    public final void Ga(java.util.ArrayList r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Ga(java.util.ArrayList, boolean):void");
    }

    public final void Gb() {
        k27 k27Var = null;
        for (int i = 1; i >= 0; i--) {
            SparseArray[] sparseArrayArr = this.o6;
            if (k27Var == null && sparseArrayArr[i].size() != 0) {
                k27Var = (k27) this.G6[i].get(sparseArrayArr[i].keyAt(0));
            }
            sparseArrayArr[i].clear();
            this.p6[i].clear();
            this.q6[i].clear();
        }
        if (getParentActivity() != null && k27Var != null && ((k27.Q4(k27Var.k) || k27Var.g4()) && k27Var.F0() != null)) {
            TLRPC.Document F0 = k27Var.F0();
            ba4.G(this.currentAccount);
            File J = ba4.J(F0, null, false, true);
            TLRPC.Message message = k27Var.k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(k27Var.k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!k27.K4(k27Var.k) && !k27Var.g4()) {
                    intent.setType(k27Var.t1());
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
                        fa4.g(e, true);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(J));
                }
                getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131745267, null)), 500);
            }
        }
        u7();
        Uc(0, true);
        ud(false);
        hd();
    }

    public final void Gc(boolean z) {
        vf6 vf6Var;
        ArrayList arrayList;
        boolean z2;
        vs1 vs1Var;
        vs1 vs1Var2;
        f27 f27Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        k27 k27Var;
        ArrayList arrayList2 = new ArrayList(hq6.d0(this.currentAccount).Z0);
        if (this.wb == null) {
            this.wb = new vf6();
        }
        vf6 vf6Var2 = this.vb;
        if (vf6Var2 == null) {
            this.vb = new vf6();
        } else {
            vf6Var2.b();
        }
        this.D0.Q.clear();
        this.wb.b();
        vf6 vf6Var3 = null;
        vf6 vf6Var4 = null;
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            vf6Var = this.P6;
            arrayList = this.M6;
            z2 = true;
            if (i >= size) {
                break;
            }
            k27 k27Var2 = (k27) arrayList2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    k27Var = (k27) arrayList.get(i2);
                    if (k27.B0(k27Var.k) == k27.B0(k27Var2.k) && k27Var.e1() == k27Var2.e1()) {
                        break;
                    }
                    i2++;
                } else {
                    k27Var = null;
                    break;
                }
            }
            if (k27Var2.m1 == 0) {
                if (k27Var == null) {
                    k27Var2.K(true);
                } else {
                    k27Var2.z0 = k27Var.z0;
                    k27Var2.y0 = k27Var.y0;
                }
            }
            if (k27Var != null) {
                k27Var2.n2 = k27Var.n2;
                if (this.D0.O && k27Var2.m1 != 0) {
                    k27Var.N(k27Var2);
                } else {
                    k27Var2.N(k27Var);
                }
            } else if (k27Var2.m1 == 0) {
                int i3 = pd;
                pd = i3 + 1;
                k27Var2.m1 = i3;
            }
            k27Var2.W2 = null;
            TLRPC.Message message2 = k27Var2.k;
            if (message2 != null) {
                message2.out = true;
            }
            k27Var2.O3();
            if (k27Var2.z2()) {
                f27 f27Var2 = (f27) vf6Var.f(k27Var2.d1());
                if (f27Var2 == null) {
                    f27Var2 = new f27();
                    f27Var2.n = this.nb;
                    long c1 = k27Var2.c1();
                    f27Var2.a = c1;
                    vf6Var.k(f27Var2, c1);
                } else if (vf6Var3 == null || vf6Var3.h(k27Var2.c1()) < 0) {
                    if (vf6Var4 == null) {
                        vf6Var4 = new vf6();
                    }
                    vf6Var4.k(f27Var2, k27Var2.c1());
                }
                ArrayList arrayList3 = f27Var2.d;
                if (vf6Var3 == null) {
                    vf6Var3 = new vf6();
                }
                vf6Var3.k(f27Var2, f27Var2.a);
                if (f27Var2.d(k27Var2) == null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList3.size()) {
                            if (((k27) arrayList3.get(i4)).e1() != k27Var2.e1()) {
                                i4++;
                            }
                        } else {
                            arrayList3.add(k27Var2);
                            break;
                        }
                    }
                }
            } else if (k27Var2.d1() != 0) {
                k27Var2.k.grouped_id = 0L;
                k27Var2.e = 0L;
            }
            this.D0.Q.add(k27Var2);
            this.wb.k(k27Var2, k27Var2.e1());
            i++;
        }
        if (vf6Var3 != null) {
            for (int i5 = 0; i5 < vf6Var3.m(); i5++) {
                f27 f27Var3 = (f27) vf6Var3.n(i5);
                Collections.sort(f27Var3.d, new sa((byte) 19));
                f27Var3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                k27 k27Var3 = (k27) arrayList.get(i6);
                if (k27Var3 != null && (message = k27Var3.k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= k27Var3.k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(k27Var3.k.reactions.results.get(i7).reaction)) {
                            arrayList4.add(k27Var3);
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < arrayList4.size(); i8++) {
            k27 k27Var4 = (k27) arrayList4.get(i8);
            if (!this.wb.d(k27Var4.e1())) {
                k27Var4.W2 = null;
                TLRPC.Message message3 = k27Var4.k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(k27Var4);
                this.wb.k(k27Var4, k27Var4.e1());
            }
        }
        int i9 = 0;
        while (true) {
            int size2 = this.D0.Q.size();
            vs1Var = this.D0;
            if (i9 >= size2) {
                break;
            }
            k27 k27Var5 = (k27) vs1Var.Q.get(i9);
            if (k27Var5.z2() && (f27Var = (f27) vf6Var.f(k27Var5.c1())) != null) {
                ArrayList arrayList5 = f27Var.d;
                for (int size3 = arrayList5.size() - 1; size3 >= 0; size3--) {
                    k27 k27Var6 = (k27) arrayList5.get(size3);
                    if (k27Var6 != k27Var5 && !this.wb.d(k27Var6.e1())) {
                        this.D0.Q.add(i9, k27Var6);
                        this.wb.k(k27Var6, k27Var6.e1());
                        i9++;
                    }
                }
            }
            i9++;
        }
        Collections.sort(vs1Var.Q, new sa((byte) 20));
        k27 k27Var7 = null;
        int i10 = 0;
        while (true) {
            int size4 = this.D0.Q.size();
            vs1Var2 = this.D0;
            if (i10 >= size4) {
                break;
            }
            k27 k27Var8 = (k27) vs1Var2.Q.get(i10);
            if (this.nb && k27Var8 != null && i10 == 0) {
                La(i10, k27Var8);
                i10++;
            }
            if (!this.nb && k27Var7 != null && k27Var8.X != k27Var7.X) {
                La(i10, k27Var7);
                i10++;
            }
            vf6 vf6Var5 = this.vb;
            int i11 = k27Var8.X;
            ArrayList arrayList6 = (ArrayList) vf6Var5.f(i11);
            if (arrayList6 == null) {
                arrayList6 = tb4.s(this.vb, i11);
            }
            arrayList6.add(k27Var8);
            if (this.nb && k27Var7 != null && i11 != k27Var7.X) {
                La(i10, k27Var8);
                i10++;
            }
            if (!this.nb && i10 >= this.D0.Q.size() - 1) {
                La(this.D0.Q.size(), k27Var8);
                i10++;
            }
            i10++;
            k27Var7 = k27Var8;
        }
        vs1Var2.P = hq6.d0(this.currentAccount).Y1();
        if (z) {
            this.D0.O();
            this.D0.J(true);
            if (this.D0.O ? getMediaDataController().M0 == 0 || !this.D0.Q.isEmpty() : !this.Y6 || !arrayList.isEmpty() || this.D0.x >= 0) {
                z2 = false;
            }
            gc(z2);
            if (this.A0 != null) {
                N5(false);
                if (this.D0.O ? getMediaDataController().M0 != 0 || !this.D0.Q.isEmpty() : this.Y6 || !arrayList.isEmpty() || this.D0.x >= 0) {
                    this.f1.setVisibility(8);
                    this.A0.setEmptyView(null);
                    return;
                }
                this.A0.setEmptyView(this.f1);
                jq1 jq1Var = this.A0;
                jq1Var.L0(jq1Var.w1());
            }
        }
    }

    public final boolean H4() {
        if (!S7() && !getMessagesController().x2(a())) {
            if ((!getMessagesController().r2(a()) || this.x4) && getMessagesController().K1(a()) <= 0 && this.h == null) {
                er1 er1Var = this.d1;
                if (er1Var == null || er1Var.getVisibility() != 0) {
                    if (!a8() || this.x4) {
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

    public final long H5(k27 k27Var) {
        if (this.g4 == 3) {
            return 0L;
        }
        if (hc2.c0(this.e) && !this.x4 && k27Var != null) {
            TLRPC.TL_forumTopic tL_forumTopic = k27Var.j1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.id;
            }
            return k27.b2(this.currentAccount, k27Var.k, hc2.c0(this.e), false);
        }
        return this.s4;
    }

    public final boolean H6() {
        boolean z;
        f27 currentMessagesGroup;
        int childCount = this.A0.getChildCount();
        HashMap hashMap = null;
        int i = 0;
        while (true) {
            z = true;
            if (i >= childCount) {
                break;
            }
            View childAt = this.A0.getChildAt(i);
            if ((childAt instanceof gb2) && (currentMessagesGroup = ((gb2) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.a), currentMessagesGroup);
                    int indexOf = this.M6.indexOf((k27) b00.f(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        vs1 vs1Var = this.D0;
                        vs1Var.l(indexOf + vs1Var.K, currentMessagesGroup.d.size());
                        this.A0.setItemAnimator(null);
                    }
                }
            }
            i++;
        }
        if (!gl.O1()) {
            return true;
        }
        if (gl.N1() && a.b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new ed0(false));
            return false;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && !ui5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z = false;
        }
        aVar.setBackButtonDrawable(new ed0(z));
        return false;
    }

    public final void H7() {
        boolean z;
        Rect rect;
        if (this.m1 != null) {
            if (this.rb <= 0 && this.sb <= 0) {
                z = false;
            } else {
                z = true;
            }
            dq1 dq1Var = this.w;
            float c = dq1Var.c();
            a9c a9cVar = dq1Var.b;
            int max = (int) Math.max(0.0f, (c * a9cVar.a) - gl.L(29.0f));
            at1 at1Var = this.m1;
            si9 si9Var = at1Var.M;
            Rect rect2 = this.md;
            if (si9Var != null) {
                rect2.set(0, 0, at1Var.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                this.m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                rect2.offset(0, -this.A0.getTop());
                jq1 jq1Var = this.A0;
                if (jq1Var.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                jq1Var.setClipBounds(rect);
            }
            if (this.Z != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(dq1Var.w, dq1Var.c() * a9cVar.a) - gl.L(29.0f))));
                ry1 ry1Var = this.Z;
                if (z) {
                    rect2 = null;
                }
                ry1Var.setClipBounds(rect2);
            }
        }
    }

    public final void H8(ArrayList arrayList, long j, tq9 tq9Var, boolean z, int i) {
        if (z) {
            z3a.B(this.currentAccount).p0(arrayList, j, false, false, true, i, 0, null, -1, 0L, 0L, null);
            gl.d3(new xn0(this, j, (byte) 4), 400L);
            tq9Var.dismiss();
        }
    }

    public final void H9(TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j;
        xh8 xh8Var = new xh8(this, this.currentAccount, user, null, null, getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j = tL_emojiStatusCollectible.document_id;
            xh8Var.y2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        be0 be0Var = new be0(getParentActivity());
        tl tlVar = new tl(gl.L(160.0f), 4, be0Var, false);
        be0Var.setImageDrawable(tlVar);
        be0Var.addOnAttachStateChangeListener(new ro1(tlVar, (byte) 0));
        tlVar.j(j, false);
        xh8Var.z2 = true;
        xh8Var.w2 = be0Var;
        showDialog(xh8Var);
    }

    public final void Ha(View view, float f, float f2, boolean z) {
        k27 k27Var;
        int i;
        int i2;
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            k27Var = gb2Var.getMessageObject();
            gb2Var.h1 = f;
            gb2Var.i1 = f2;
            f17 f17Var = gb2Var.fb;
            float f3 = gb2Var.i1;
            f17Var.h = gb2Var.getTranslationX() + f;
            f17Var.i = f3;
            f17Var.l = SystemClock.elapsedRealtime();
        } else if (view instanceof uk1) {
            k27Var = ((uk1) view).getMessageObject();
        } else {
            k27Var = null;
        }
        int S6 = S6(k27Var);
        if ((k27Var == null || ((i2 = k27Var.D) != 30 && i2 != 18 && i2 != 25)) && S6 >= 2 && S6 != 20 && S6 != 21) {
            if (k27Var == null || ((i = k27Var.D) != 27 && i != 30 && !k27Var.W4() && !k27Var.q4() && !k27.c3(k27Var.k))) {
                y4(k27Var, z, true);
                yc();
                ud(false);
            }
        }
    }

    public final void Hb(int i, k27 k27Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
        String M0 = k96.M0(2131745228, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        TLRPC.User user = this.f;
        if (user != null) {
            if (user.bot) {
                hdVar.U = k96.M0(2131754066, null);
            } else {
                String k = yjb.k(new StringBuilder("+"), getUserConfig().f().phone, p38.f());
                TLRPC.User user2 = this.f;
                hdVar.U = gl.S2(k96.a0("AreYouSureShareMyContactInfoUser", null, 2131754064, k, qu2.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            hdVar.U = k96.M0(2131754067, null);
        }
        alertDialog$Builder.j(k96.M0(2131745269, null), new yf(this, i, k27Var, (byte) 3));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(hdVar);
    }

    public final void Hc() {
        int i;
        qq1 qq1Var = this.n3;
        if (qq1Var == null) {
            return;
        }
        qq1Var.setTranslationX(g7() / 2.0f);
        this.n3.setTranslationY((((this.A0.getTranslationY() + this.P9) + this.W9) - gl.L(4.0f)) + gl.L(28.0f));
        float i2 = Utilities.i(gl.x1(this.W9, -this.n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.n3.setAlpha(this.x3 * i2);
        qq1 qq1Var2 = this.n3;
        if (this.x3 * i2 > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        qq1Var2.setVisibility(i);
        float R1 = gl.R1(0.5f, 1.0f, i2);
        this.n3.setScaleX(R1);
        this.n3.setScaleY(R1);
    }

    public final boolean I4() {
        if (this.h == null) {
            er1 er1Var = this.d1;
            if (er1Var == null || er1Var.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void I6(ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, long j) {
        boolean z4;
        if (!arrayList.isEmpty() && l5()) {
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
                vs1 vs1Var = this.D0;
                if (vs1Var != null) {
                    vs1Var.F(true);
                }
            }
            int p0 = getSendMessagesHelper().p0(arrayList, this.l6, z, z2, z3, i, 0, this.m4, -1, j, c7(), this.y5);
            ij.q0(p0, this.Ba, this);
            if (p0 != 0) {
                gl.c3(new wl1(this, (byte) 25));
            }
        }
    }

    public final void I7() {
        this.Oa = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void I8(String str) {
        if (na7.q1(this.currentAccount).L2(true)) {
            d01.n(getParentActivity(), str, false, null);
        } else {
            ij.l0(getParentActivity(), this.Ba, str, true, new pm1(this, str, (byte) 1));
        }
    }

    public final void I9(long j, long j2, Long l, Boolean bool) {
        boolean z = false;
        gta v = gta.v(this.currentAccount, false);
        if (l.longValue() > 0 && bool.booleanValue()) {
            z = true;
        }
        v.g0(j, j2, z, true);
    }

    public final void Ia(int i) {
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
                File q0 = gl.q0(null, false);
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
                fa4.g(e, true);
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
                if (hc2.T(this.e) && (tL_chatBannedRights = this.e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z = false;
                } else {
                    z = true;
                }
                g48 g48Var = new g48(0, z, true, this);
                if (this.g4 == 9) {
                    g48Var.H = (byte) 1;
                    g48Var.I = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !hc2.N(chat) && this.e.slowmode_enabled) {
                        g48Var.H = (byte) 10;
                        g48Var.I = true;
                    } else {
                        if (this.H5 == null) {
                            b = 0;
                            z2 = true;
                        }
                        g48Var.H = b;
                        g48Var.I = z2;
                    }
                }
                g48Var.W = new lj9(this, (byte) 17);
                presentFragment(g48Var);
            } else if (i == 2) {
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s0 = gl.s0(false);
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
                    fa4.g(e2, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean Ib() {
        if (N7() && this.F5 == null && this.H5 == null) {
            if (this.g4 != 8 && N7() && this.e != null) {
                TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.e.id, 1L);
                if (this.g4 != 8) {
                    if (f != null) {
                        if (f.closed && !hc2.i(this.currentAccount, this.e, f)) {
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

    public final void Ic() {
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
                ip1 ip1Var = new ip1(this, getResourceProvider(), getParentActivity());
                this.i1 = ip1Var;
                ote.b(ip1Var, 0.02f, 1.2f);
                this.i1.setOnClickListener(new kl1(this, (byte) 12));
            }
            ip1 ip1Var2 = this.i1;
            if (ip1Var2 != null) {
                if (!z) {
                    ip1Var2.setVisibility(8);
                    return;
                }
                ip1Var2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.s8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.s8.business_intro.title)) {
                    i = 2131749309;
                } else {
                    i = 2131749310;
                }
                String a0 = k96.a0(null, null, i, l7c.k(this.f, true));
                int indexOf2 = a0.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                if (indexOf2 > 0 && (indexOf = (a0 = a0.substring(0, indexOf2).concat(a0.substring(indexOf2 + 2))).indexOf("**")) > 0) {
                    a0 = a0.substring(0, indexOf).concat(a0.substring(indexOf + 2));
                    spannableStringBuilder = new SpannableStringBuilder(a0);
                    uo8 uo8Var = new uo8(a0.substring(indexOf2, indexOf));
                    if (uo8Var.c != -1) {
                        uo8Var.c = -1;
                        uo8Var.invalidateSelf();
                    }
                    uo8Var.a(503316480);
                    uo8Var.setBounds(0, 0, uo8Var.getIntrinsicWidth(), gl.L(17.33f));
                    spannableStringBuilder.setSpan(new ImageSpan(uo8Var), indexOf2, indexOf, 33);
                }
                this.i1.setCustomText(spannableStringBuilder);
                this.i1.setOverrideTextMaxWidth(je5.a(a0, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.i1.getParent() != null && (!z || this.i1.getParent() != this.g1)) {
                    ((ViewGroup) this.i1.getParent()).removeView(this.i1);
                }
                if (z) {
                    ViewParent parent = this.i1.getParent();
                    LinearLayout linearLayout = this.g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.i1, nme.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        ib(i, i2, z, i3, z2, i4, null, null, null);
    }

    public final boolean J4(k27 k27Var) {
        if (this.g4 != 8) {
            if (k27Var != null) {
                if (hc2.c0(this.e)) {
                    TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.e.id, k27.b2(this.currentAccount, k27Var.k, true, false));
                    if (this.g4 == 8 || (f != null && (!f.closed || hc2.i(this.currentAccount, this.e, f)))) {
                        return true;
                    }
                    return false;
                } else if (!hc2.p0(this.e) || !hc2.A(this.currentAccount, this.e, 24) || k27.u1(k27Var.k) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final void J5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.J5():void");
    }

    public final vxc J6(vxc vxcVar) {
        x31 x31Var;
        lxc hxcVar;
        if (vxcVar != null && (x31Var = this.Y1) != null && ((x31Var.isShowing() && !this.Y1.J) || this.Y1.r2)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                hxcVar = new kxc(vxcVar);
            } else if (i >= 30) {
                hxcVar = new jxc(vxcVar);
            } else if (i >= 29) {
                hxcVar = new ixc(vxcVar);
            } else {
                hxcVar = new hxc(vxcVar);
            }
            hxcVar.c(8, io5.e);
            hxcVar.i(8, false);
            return hxcVar.b();
        }
        return vxcVar;
    }

    public final void J7() {
        TLRPC.User user;
        boolean z;
        if (a() != getUserConfig().e() && !getUserConfig().p() && (user = this.f) != null && user.contact_require_premium) {
            boolean isEmpty = this.M6.isEmpty();
            if (getMessagesController().J2(a()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (isEmpty != z) {
                getMessagesController().i2(this.classGuid, a());
            }
        }
    }

    public final void J8(String str) {
        if (na7.q1(this.currentAccount).L2(false)) {
            getParentActivity();
            d01.o(str);
            return;
        }
        ij.l0(getParentActivity(), this.Ba, str, false, new pm1(this, str, (byte) 0));
    }

    public final void J9(long j, long j2, Long l) {
        int i;
        String str;
        if (getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        String M0 = k96.M0(2131746098, null);
        if (hc2.p0(this.e)) {
            i = 2131746102;
        } else {
            i = 2131746103;
        }
        SpannableStringBuilder S2 = gl.S2(k96.a0(null, null, i, cf3.s(j)));
        if (l.longValue() > 0) {
            str = k96.H(',', "RemoveMessageFeeRefund", (int) l.longValue());
        } else {
            str = null;
        }
        ij.f0(parentActivity, M0, S2, str, k96.M0(2131751805, null), new tn1(this, j, j2, l, (byte) 0), this.resourceProvider, true);
    }

    public final void Ja(int r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Ja(int):void");
    }

    public final void Jb() {
        if (getParentActivity() == null) {
            return;
        }
        u21.b0(this).t(k96.M0(2131743594, null), this.Ba).j();
    }

    public final void Jc() {
        boolean z;
        int i;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a0;
        if (this.h1 == null) {
            return;
        }
        String str = null;
        if (hc2.p0(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().s1(this.e.id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !hc2.A(this.currentAccount, chat2, 24)) {
                final long j = this.e.send_paid_messages_stars;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                long j2 = chat.id;
                if (i2 > 0) {
                    a0 = k96.a0(null, null, 2131744108, cf3.s(-j2), k96.E(j, ','));
                } else {
                    a0 = k96.a0(null, null, 2131744091, cf3.s(-j2));
                }
                SpannableStringBuilder Q2 = gl.Q2(jva.T0(a0, 1.0f, null));
                if (i2 > 0) {
                    str = k96.M0(2131748280, null);
                }
                this.h1.b(true, true, Q2, str, new View.OnClickListener(this) {
                    public final mu1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r4;
                        long j3 = j;
                        mu1 mu1Var = this.b;
                        switch (b) {
                            case 0:
                                mu1Var.y9(j3);
                                return;
                            default:
                                mu1Var.z9(j3);
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
                    i92 i92Var = this.h1;
                    boolean z2 = !getUserConfig().p();
                    if (getMessagesController().F3()) {
                        i = 2131748389;
                    } else {
                        i = 2131748390;
                    }
                    i92Var.b(z2, false, gl.S2(k96.a0(null, null, i, cf3.s(this.l6))), k96.M0(2131748346, null), new x00((byte) 2));
                    return;
                }
                final long j3 = userFull.send_paid_messages_stars;
                int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i3 > 0) {
                    i92 i92Var2 = this.h1;
                    if (i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i92Var2.b(z, false, gl.Q2(jva.T0(k96.a0(null, null, 2131748388, cf3.s(this.l6), k96.E(this.s8.send_paid_messages_stars, ',')), 1.0f, null)), k96.M0(2131748280, null), new View.OnClickListener(this) {
                        public final mu1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r4;
                            long j32 = j3;
                            mu1 mu1Var = this.b;
                            switch (b) {
                                case 0:
                                    mu1Var.y9(j32);
                                    return;
                                default:
                                    mu1Var.z9(j32);
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

    @Override
    public final boolean K() {
        return this.A8;
    }

    public final void K4(boolean z) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.g4 != 0 || this.s4 != 0 || (chatFull = this.r8) == null || chatFull.ttl_period == 0)) || ((user = this.f) != null && (l7c.z(user) || (this.h == null && ((userFull = this.s8) == null || userFull.ttl_period == 0)))))) {
            p7 p7Var = this.e0;
            if (p7Var != null) {
                p7Var.e(8);
            }
            cq1 cq1Var = this.p1;
            if (cq1Var != null) {
                cq1Var.a.a(false, z);
            }
        } else {
            p7 p7Var2 = this.e0;
            if (p7Var2 != null) {
                p7Var2.e(0);
            }
            cq1 cq1Var2 = this.p1;
            if (cq1Var2 != null) {
                cq1Var2.a.a(true, z);
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
        cq1 cq1Var3 = this.p1;
        if (cq1Var3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f) != null && user2.linked_community_id != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            cq1Var3.setCommunityItemVisible(z2);
            final cq1 cq1Var4 = this.p1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ImageView imageView = cq1Var4.F;
            ImageView imageView2 = cq1Var4.E;
            if (imageView2 != null && imageView != null) {
                cq1Var4.n0 = z3;
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
                                    cq1 cq1Var5 = cq1Var4;
                                    if (!z5) {
                                        cq1Var5.E.setVisibility(4);
                                        return;
                                    } else {
                                        cq1Var5.getClass();
                                        return;
                                    }
                                default:
                                    boolean z6 = z3;
                                    cq1 cq1Var6 = cq1Var4;
                                    if (!z6) {
                                        cq1Var6.F.setVisibility(4);
                                        return;
                                    } else {
                                        cq1Var6.getClass();
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
                                    cq1 cq1Var5 = cq1Var4;
                                    if (!z5) {
                                        cq1Var5.E.setVisibility(4);
                                        return;
                                    } else {
                                        cq1Var5.getClass();
                                        return;
                                    }
                                default:
                                    boolean z6 = z3;
                                    cq1 cq1Var6 = cq1Var4;
                                    if (!z6) {
                                        cq1Var6.F.setVisibility(4);
                                        return;
                                    } else {
                                        cq1Var6.getClass();
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
            if (!chatFull2.can_delete_channel && hc2.T(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || hc2.t0(chat4)) {
                    z4 = false;
                }
            }
            p7 p7Var4 = this.u0;
            if (z4) {
                i3 = 0;
            }
            p7Var4.e(i3);
        }
        s();
    }

    public final void K5() {
        if (this.f2 == null && getParentActivity() != null) {
            Y5();
            if (this.b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f2 = textView;
                textView.setGravity(17);
                this.f2.setTextSize(1, 14.0f);
                this.f2.setTypeface(gl.o());
                TextView textView2 = this.f2;
                int i = bkb.Ei;
                zkb.X(textView2, i, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new cm2(2131232482, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) k96.M0(2131745324, null));
                this.f2.setText(spannableStringBuilder);
                TextView textView3 = this.f2;
                int p1 = bkb.p1(0.1f, getThemedColor(i));
                int L = gl.L(3.0f);
                zkb.R(textView3, bkb.W(gl.L(15.0f), p1, L, L, L, L), null, zkb.K(0.1f, i), getResourceProvider());
                this.f2.setOnClickListener(new kl1(this, (byte) 20));
                ote.b(this.f2, 0.04f, 1.5f);
                this.b1.addView(this.f2, nme.r(-1, 36, 83));
                this.b1.i(12, this.f2);
                this.b1.h(this.f2);
            }
        }
    }

    public final ArrayList K6() {
        vs1 vs1Var = this.D0;
        if (vs1Var != null) {
            return vs1Var.Q;
        }
        return null;
    }

    public final boolean K7() {
        if (this.g2 != null && this.s4 == 0) {
            return true;
        }
        return false;
    }

    public final void K8(java.lang.String r9, defpackage.k27 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.K8(java.lang.String, k27, boolean):void");
    }

    public final void K9(long j, long j2) {
        gta.v(this.currentAccount, false).z(j, j2, new um1(this, j, j2, (byte) 0));
    }

    public final boolean Ka(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
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
                if ((dVar instanceof mu1) && ((mu1) dVar).l6 == this.x8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                boolean B = cf3.B(this.x8);
                long j = this.x8;
                if (B) {
                    bundle.putInt("enc_id", (int) (j & 4294967295L));
                } else {
                    boolean D = cf3.D(j);
                    long j2 = this.x8;
                    if (D) {
                        bundle.putLong("user_id", j2);
                    } else {
                        bundle.putLong("chat_id", -j2);
                    }
                }
                w4();
                presentFragment(new mu1(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Kb(gb2 gb2Var) {
        if (getParentActivity() != null && gb2Var != null && gb2Var.L9 != null && gb2Var.getPrimaryMessageObject() != null && gb2Var.getPrimaryMessageObject().k != null && gb2Var.getPrimaryMessageObject().k.via_business_bot_id != 0 && !getMessagesController().X3.getBoolean("bizbothint", false)) {
            getMessagesController().X3.edit().putBoolean("bizbothint", true).apply();
            if (!this.ub) {
                this.ub = true;
                if (this.O1 != null) {
                    return;
                }
                je5 je5Var = new je5(getParentActivity(), 3);
                je5Var.p(true);
                je5Var.L = Layout.Alignment.ALIGN_NORMAL;
                je5Var.d = -1L;
                je5Var.U = true;
                je5Var.e = true;
                je5Var.j(true);
                je5Var.q(8.0f);
                this.O1 = je5Var;
                je5Var.t(gl.S2(k96.M0(2131748406, null)));
                this.O1.k(this.L);
                je5 je5Var2 = this.O1;
                je5Var2.h = je5.a(je5Var2.getText(), this.O1.getTextPaint());
                this.m1.addView(this.O1, nme.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.m1.post(new aj1(this, gb2Var, (byte) 8));
            }
        }
    }

    public final void Kc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Kc(boolean):void");
    }

    public final void L4() {
        if (this.mb) {
            return;
        }
        if (T7()) {
            gl.U2(getParentActivity(), this.classGuid);
        } else {
            gl.V2(getParentActivity(), this.classGuid);
        }
    }

    public final void L5() {
        if (getParentActivity() != null && getParentActivity() != null && this.Y1 == null) {
            x31 x31Var = new x31(this, getParentActivity(), this, this.Ba, (byte) 1);
            this.Y1 = x31Var;
            x31Var.T1 = a();
            x31 x31Var2 = this.Y1;
            x31Var2.c2 = true;
            x31Var2.W3 = new ds1(this);
        }
    }

    public final qw4 L6() {
        mu1 mu1Var = this.Aa;
        if (mu1Var != null) {
            return mu1Var.L6();
        }
        return this.glassEngine;
    }

    public final void L8(String str) {
        o.c(str, this.currentAccount, this.m1, null, this.Ba);
    }

    public final void L9(ArrayList arrayList) {
        kxb kxbVar;
        if (arrayList != null && (kxbVar = this.g2) != null && kxbVar.U) {
            for (int i = 0; i < arrayList.size(); i++) {
                k27 k27Var = (k27) arrayList.get(i);
                if (k27Var != null && k27Var.D == 36) {
                    TLRPC.MessageMedia n1 = k27.n1(k27Var.k);
                    ConcurrentHashMap concurrentHashMap = vvc.a;
                    if (n1 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!k27Var.U2) {
                            k27Var.U2 = true;
                            k27Var.n0(null);
                        }
                    }
                }
                if (k27Var != null && k27Var.P2() && !k27Var.O3() && k27Var.c1() != 0 && !k27Var.U2) {
                    k27Var.U2 = true;
                    k27Var.n0(null);
                }
            }
        }
    }

    public final void La(int i, k27 k27Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = k96.u(k27Var.k.date, false);
        tL_message.id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(k27Var.k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        k27 k27Var2 = new k27(this.currentAccount, tL_message, false, false);
        k27Var2.D = 10;
        k27Var2.U = 1;
        k27Var2.l0 = true;
        k27Var2.m1 = k7(k27Var.X);
        this.D0.Q.add(i, k27Var2);
    }

    public final void Lb(boolean z, boolean z2) {
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
        int i3 = 0;
        float f8 = 0.1f;
        if (z2) {
            this.W0 = new AnimatorSet();
            if (z) {
                this.J0.setVisibility(0);
                AnimatorSet animatorSet2 = this.W0;
                fr1 fr1Var = this.E0;
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fr1Var, property, 0.1f);
                fr1 fr1Var2 = this.E0;
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fr1Var2, property2, 0.1f);
                fr1 fr1Var3 = this.E0;
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fr1Var3, property3, 0.0f), ObjectAnimator.ofFloat(this.J0, property, 1.0f), ObjectAnimator.ofFloat(this.J0, property2, 1.0f), ObjectAnimator.ofFloat(this.J0, property3, 1.0f));
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
        fr1 fr1Var4 = this.E0;
        if (!z && !this.F0) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        fr1Var4.setVisibility(i2);
        l46 l46Var = this.G0;
        if (z || !this.F0) {
            i3 = 4;
        }
        l46Var.setVisibility(i3);
        fr1 fr1Var5 = this.E0;
        if (!z && !this.F0) {
            f3 = 1.0f;
        } else {
            f3 = 0.1f;
        }
        fr1Var5.setScaleX(f3);
        l46 l46Var2 = this.G0;
        if (!z && this.F0) {
            f4 = 1.0f;
        } else {
            f4 = 0.1f;
        }
        l46Var2.setScaleX(f4);
        fr1 fr1Var6 = this.E0;
        if (!z && !this.F0) {
            f5 = 1.0f;
        } else {
            f5 = 0.1f;
        }
        fr1Var6.setScaleY(f5);
        l46 l46Var3 = this.G0;
        if (!z && this.F0) {
            f8 = 1.0f;
        }
        l46Var3.setScaleY(f8);
        fr1 fr1Var7 = this.E0;
        if (!z && !this.F0) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        fr1Var7.setAlpha(f6);
        l46 l46Var4 = this.G0;
        if (!z && this.F0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l46Var4.setAlpha(f7);
    }

    public final void Lc() {
        k27 k27Var;
        if (this.f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                jq1 jq1Var = this.A0;
                if (jq1Var != null) {
                    int childCount = jq1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.A0.getChildAt(i);
                        if (childAt instanceof gb2) {
                            k27Var = ((gb2) childAt).getMessageObject();
                        } else {
                            k27Var = null;
                        }
                        if (k27Var != null && k27Var.e1() < 0) {
                            long j = k27Var.k.random_id;
                            if (j != 0) {
                                arrayList.add(Long.valueOf(j));
                            }
                        }
                    }
                }
                MediaController.w();
                return;
            }
            k27 k27Var2 = SecretMediaViewer.d().g0;
            if (k27Var2 != null && !k27Var2.N3()) {
                MediaController.w();
                k27Var2.e1();
            }
        }
    }

    @Override
    public final long M() {
        return this.d7;
    }

    public final void M4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.M4():void");
    }

    public final void M5(k27 k27Var, f27 f27Var, boolean z) {
        vm1 vm1Var;
        if (k27Var == null) {
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
        vm1 vm1Var2 = new vm1(this, (byte) 1);
        if (z) {
            vm1Var = new vm1(this, (byte) 2);
        } else {
            vm1Var = null;
        }
        vm1 vm1Var3 = vm1Var;
        ij.y(this, user, chat, encryptedChat, chatFull, j, k27Var, this.o6, f27Var, d, i, null, vm1Var2, vm1Var3, this.Ba);
    }

    public final f27 M6(long j) {
        return (f27) this.P6.f(j);
    }

    public final boolean M7() {
        if (!gba.D0 && !this.xb) {
            return false;
        }
        return true;
    }

    public final void M8(String str) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", qu2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void M9() {
        this.R4 = true;
        if (this.E6) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new n30(messagesStorage, d(), this.l6, new an1(this, (byte) 1), (byte) 11));
            return;
        }
        ad7 messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().h1(this.l6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.x4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.D6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new pl(this, messagesStorage2, (byte) 15));
    }

    public final void Ma(Bundle bundle, k27 k27Var) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.e;
        if (chat != null && hc2.V(chat) && !hc2.p0(this.e)) {
            TLRPC.Chat chat2 = this.e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().K0(Long.valueOf(this.e.linked_monoforum_id)) != null && !hc2.z(this.currentAccount, 24, -this.e.linked_monoforum_id)) {
                na7 messagesController = getMessagesController();
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
        TLRPC.Message message = k27Var.k;
        if (message != null) {
            peer = message.from_id;
        } else {
            peer = null;
        }
        long n = cf3.n(peer);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i != 0 && n != a() && n != getUserConfig().e() && i > 0) {
            bundle.putLong("reply_to_author", n);
        }
    }

    public final void Mb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = k96.M0(2131752701, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752702, null);
        alertDialog$Builder.j(k96.M0(2131751394, null), new ce(runnable, (byte) 5));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, getResourceProvider());
        }
    }

    public final void Mc(k27 k27Var, boolean z) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new mn6(this, k27Var, z, (byte) 9));
    }

    public final void N4() {
        gb2 gb2Var;
        k27 primaryMessageObject;
        TLRPC.Message message;
        if (this.O1 != null) {
            return;
        }
        gb2 gb2Var2 = null;
        for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.A0.getChildAt(childCount);
            if ((childAt instanceof gb2) && (primaryMessageObject = (gb2Var = (gb2) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.k) != null && message.via_business_bot_id != 0) {
                gb2Var2 = gb2Var;
            }
        }
        Kb(gb2Var2);
    }

    public final void N5(boolean z) {
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
                this.m1.addView(this.f1, 3, nme.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f1.setTranslationX(g7() / 2.0f);
            int i2 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.q2 = textView;
                textView.setText(k96.M0(2131748018, null));
                this.q2.setTextSize(1, 14.0f);
                this.q2.setGravity(17);
                zkb.X(this.q2, bkb.Yc, getResourceProvider());
                this.q2.setBackground(new qjb(this.q2, this.m1, gl.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.q2.setTypeface(gl.o());
                this.q2.setPadding(gl.L(10.0f), gl.L(2.0f), gl.L(10.0f), gl.L(3.0f));
                this.f1.addView(this.q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (S7()) {
                qx8 qx8Var = new qx8(getParentActivity(), this.g4, this.s4, this.f4, getResourceProvider());
                this.j1 = qx8Var;
                int L = gl.L(24.0f);
                qx8 qx8Var2 = this.j1;
                at1 at1Var = this.m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i3 = bkb.a;
                qx8Var.setBackground(new qjb(qx8Var2, at1Var, L, themedPaint));
                this.f1.addView(this.j1, nme.e(-2, -2, 17));
                this.l1.d(this.j1, this.m1, new qm0((byte) 20), false);
            } else if (this.g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.e4;
                wjb resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i4 = bkb.Yc;
                bkb.v0(i4, resourceProvider);
                bkb.u0(i4);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231098);
                linearLayout.addView(imageView, nme.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                zkb.X(textView2, i4, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(gl.L(208.0f));
                textView2.setText(gl.S2(k96.M0(2131752690, null)));
                linearLayout.addView(textView2, nme.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                zkb.X(textView3, i4, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(gl.L(208.0f));
                String str2 = tL_businessChatLink.link;
                j41[] j41VarArr = j41.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(bkb.Z(503316480, 503316480, 5, 5));
                textView3.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
                textView3.setOnClickListener(new t(tL_businessChatLink, this, (byte) 26));
                linearLayout.addView(textView3, nme.t(-2, -2, 49, 17, 0, 17, 17));
                this.k1 = linearLayout;
                linearLayout.setBackground(new qjb(this.k1, this.m1, gl.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f1.addView(this.k1, nme.e(-2, -2, 17));
            } else if ((this.Y9 != null && this.f != null && !this.n) || (this.s8 != null && a() != getUserConfig().e() && ((this.s8.contact_require_premium && !getUserConfig().p()) || this.s8.send_paid_messages_stars > gta.v(this.currentAccount, false).m().amount))) {
                this.h1 = new gp1(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                Jc();
                this.h1.setListener(new yk1(this, (byte) 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.g1.setGravity(17);
                this.g1.addView(this.h1, nme.e(-2, -2, 17));
                this.f1.addView(this.g1, nme.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.s8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.h1.c(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.h1.setSticker(this.s8.business_intro.sticker);
                }
                Ic();
            } else if (this.h == null) {
                if (this.x4 && this.g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    at1 at1Var2 = this.m1;
                    ku1 ku1Var = this.Ba;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = gl.L(18.0f);
                    if (ku1Var != null) {
                        paint = ku1Var.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = bkb.T0("paintChatActionBackground");
                    }
                    int i5 = bkb.a;
                    linearLayout3.setBackground(new qjb(linearLayout3, at1Var2, L2, paint));
                    linearLayout3.setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
                    linearLayout3.setOrientation(1);
                    be0 be0Var = new be0(parentActivity2);
                    if (bkb.g1(ku1Var)) {
                        i = bkb.Ia;
                    } else {
                        i = bkb.Yc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    ug8.v(textView4, 1, 15.0f);
                    zkb.X(textView4, i, ku1Var);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(gl.L(210.0f));
                    textView4.setText(k96.M0(2131754269, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    zkb.X(textView5, i, ku1Var);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(gl.L(160.0f));
                    textView5.setText(k96.M0(2131743782, null));
                    linearLayout3.addView(be0Var, nme.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, nme.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, nme.r(-2, -2, 1));
                    TLRPC.Document V = hq6.d0(y6c.t0).V("🥳");
                    if (V != null) {
                        kcb d = uo3.d(V.thumbs, bkb.b7, 0.2f, false);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        be0Var.n(gl5.b(V), null, "tgs", d, null);
                    }
                    this.f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!a8() && this.g4 == 0 && (((user2 = this.f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !hc2.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    at1 at1Var3 = this.m1;
                    if (this.e == null) {
                        i2 = 2;
                    }
                    q72 q72Var = new q72(parentActivity3, at1Var3, i2, this.Ba);
                    this.n1 = q72Var;
                    this.f1.addView(q72Var, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.n1.setStatusText(gl.S2(k96.M0(2131749246, null)));
                    }
                } else {
                    if (a8() && this.g4 == 0) {
                        str = this.v4 ? k96.M0(2131748034, null) : k96.M0(2131747976, null);
                    } else if (this.g4 == 1) {
                        str = k96.M0(2131747969, null);
                    } else {
                        TLRPC.User user3 = this.f;
                        if (user3 != null) {
                            long j = user3.id;
                            if (j != 777000 && j != 429000 && j != 4244000 && na7.E2(user3)) {
                                str = k96.M0(2131749357, null);
                            }
                        }
                        if (this.g4 != 8 && ((user = this.f) == null || user.self || user.deleted || this.n)) {
                            str = k96.M0(2131748001, null);
                        }
                    }
                    if (str == null) {
                        this.h1 = new hp1(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                        Jc();
                        this.h1.setListener(new yk1(this, (byte) 5));
                        TLRPC.UserFull userFull2 = this.s8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.h1.c(tL_businessIntro.title, tL_businessIntro.description);
                            this.h1.setSticker(this.s8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.g1.setGravity(17);
                        this.g1.addView(this.h1, nme.e(-2, -2, 17));
                        this.f1.addView(this.g1, nme.e(-1, -2, 17));
                        Ic();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.q2 = textView6;
                    textView6.setText(str);
                    this.q2.setTextSize(1, 14.0f);
                    this.q2.setGravity(17);
                    zkb.X(this.q2, bkb.Yc, getResourceProvider());
                    this.q2.setBackground(new qjb(this.q2, this.m1, gl.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.q2.setTypeface(gl.o());
                    this.q2.setPadding(gl.L(9.0f), gl.L(2.0f), gl.L(9.0f), gl.L(3.0f));
                    this.f1.addView(this.q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.n1 = new q72(getParentActivity(), this.m1, 0, this.Ba);
                int i6 = (this.h.admin_id > getUserConfig().e() ? 1 : (this.h.admin_id == getUserConfig().e() ? 0 : -1));
                q72 q72Var2 = this.n1;
                TLRPC.User user4 = this.f;
                if (i6 == 0) {
                    q72Var2.setStatusText(k96.a0(null, null, 2131751121, l7c.k(user4, true)));
                } else {
                    q72Var2.setStatusText(k96.a0(null, null, 2131751122, l7c.k(user4, true)));
                }
                this.f1.addView(this.n1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final float N6() {
        mu1 mu1Var = this.Aa;
        if (mu1Var != null) {
            this = mu1Var;
        }
        xq1 xq1Var = this.E1;
        if (xq1Var == null) {
            return 0.0f;
        }
        return xq1Var.b;
    }

    public final boolean N7() {
        if (!hc2.c0(this.e) || this.x4) {
            if (hc2.p0(this.e) && d() == 0 && !this.i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void N8(TLRPC.ReactionCount reactionCount) {
        G5(true);
        vs9.c(getParentActivity(), this.currentAccount, reactionCount.reaction, this.Ba);
    }

    public final void N9(boolean z) {
        TLRPC.Chat chat;
        if (this.Ea == null && (chat = this.e) != null && hc2.k(chat) && this.a0 != null && !hc2.p0(this.e)) {
            TLRPC.TL_channels_sendAsPeers J1 = getMessagesController().J1(this.l6, false);
            this.Ea = J1;
            if (J1 != null) {
                this.a0.w2(false, z);
            }
        }
    }

    public final boolean Na(View view, RectF rectF) {
        if (rectF != null && this.A0 != null && view != null) {
            RectF rectF2 = this.jc;
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public final void Nb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            boolean n0 = hc2.n0(chat);
            TLRPC.Chat chat2 = this.e;
            if (n0) {
                if (hc2.N(chat2)) {
                    ca5 ca5Var = new ca5(a());
                    ca5Var.m0 = this;
                    presentFragment(ca5Var);
                    return;
                }
                return;
            } else if (hc2.w(1, chat2)) {
                nh1 nh1Var = new nh1(a());
                nh1Var.m0 = this;
                presentFragment(nh1Var);
                return;
            } else {
                return;
            }
        }
        this.ya = new xd2(this, this.Ba);
        this.A0.setOnInterceptTouchListener(new qm0((byte) 21));
        xb(this.m1, false);
        showDialog(this.ya, new cl1(this, (byte) 1));
    }

    public final void Nc(k27 k27Var, boolean z) {
        k27 k27Var2;
        if (this.D0 != null && this.fragmentView != null) {
            f27 f27Var = (f27) this.P6.f(k27Var.c1());
            if (f27Var != null) {
                ArrayList arrayList = f27Var.d;
                lq1 lq1Var = this.B0;
                if (lq1Var != null) {
                    lq1Var.U(f27Var);
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ((k27) arrayList.get(i)).M1 = true;
                    if (z) {
                        ((k27) arrayList.get(i)).H = true;
                    }
                }
                this.D0.J(true);
                return;
            }
            k27 k27Var3 = (k27) this.G6[0].get(k27Var.e1());
            if (z) {
                k27Var.M1 = true;
                k27Var.H = true;
            }
            if (this.D0.O) {
                vf6 vf6Var = this.wb;
                if (vf6Var != null) {
                    k27Var2 = (k27) vf6Var.f(k27Var.e1());
                } else {
                    k27Var2 = null;
                }
                int indexOf = this.D0.Q.indexOf(k27Var2);
                if (k27Var2 != null && z) {
                    k27Var2.M1 = true;
                    k27Var2.H = true;
                }
                if (indexOf >= 0) {
                    vs1 vs1Var = this.D0;
                    vs1Var.g(vs1Var.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.M6.indexOf(k27Var3);
            if (indexOf2 >= 0) {
                vs1 vs1Var2 = this.D0;
                vs1Var2.g(vs1Var2.K + indexOf2);
            }
        }
    }

    public final void O4(int i, View view, boolean z) {
        int i2;
        if (view != null) {
            float f = ((float[]) this.kd.b)[i];
            float f2 = (1.0f - this.fd.e) * (1.0f - this.dd.e) * f;
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

    public final int O6(k27 k27Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        gb2 gb2Var = this.I9;
        if (gb2Var == null) {
            gb2 gb2Var2 = new gb2(getParentActivity(), this.currentAccount, true, this.Za, this.Ba);
            this.I9 = gb2Var2;
            gb2Var = gb2Var2;
        }
        if (this.e == null && !l7c.D(this.f)) {
            z2 = false;
        } else {
            z2 = true;
        }
        gb2Var.f6 = z2;
        gb2 gb2Var3 = this.I9;
        int i = this.g4;
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        gb2Var3.h6 = z3;
        if (i == 3 && this.mb) {
            z4 = true;
        } else {
            z4 = false;
        }
        gb2Var3.i6 = z4;
        TLRPC.User user = this.f;
        if (user != null && user.bot) {
            z5 = true;
        } else {
            z5 = false;
        }
        gb2Var3.j6 = z5;
        if (hc2.T(this.e) && this.e.megagroup) {
            z6 = true;
        }
        gb2Var3.k6 = z6;
        this.I9.W6 = K7();
        this.I9.X6 = W7();
        this.I9.Y6 = V7();
        return this.I9.r0(k27Var, (f27) this.P6.f(k27Var.c1()), z);
    }

    public final boolean O7() {
        return l7c.w(this.f);
    }

    public final void O8(gb2 gb2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i;
        cs5 J = cs5.J(this, gb2Var);
        tq9 tq9Var = new tq9(getParentActivity(), this.Ba);
        J.p = new zk1(tq9Var, (byte) 0);
        if (z && getMessagesController().k4.n0.f) {
            J.b(2131231278, k96.M0(2131742754, null), new al1(this, str, (byte) 5), false);
        }
        boolean z2 = true;
        J.b(2131232108, k96.M0(2131742909, null), new el1(this, tq9Var, str, (byte) 1), false);
        if (z) {
            J.b(2131232359, k96.M0(2131742700, null), new al1(this, str, (byte) 6), false);
            J.j();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i2 = this.currentAccount;
                long j = user.id;
                aj1 aj1Var = new aj1(this, userArr, (byte) 6);
                TLObject Z1 = na7.q1(i2).Z1(j);
                boolean z3 = Z1 instanceof TLRPC.User;
                if (!(Z1 instanceof TLRPC.Chat) || !hc2.V((TLRPC.Chat) Z1)) {
                    z2 = false;
                }
                if (z3) {
                    i = 2131743304;
                } else if (z2) {
                    i = 2131743318;
                } else {
                    i = 2131743311;
                }
                J.m(Z1, k96.M0(i, null), aj1Var);
            } else {
                J.o(13, -1, k96.M0(2131742955, null));
            }
        }
        tq9Var.e(J);
        tq9Var.f(gb2Var, characterStyle, null, false);
        showDialog(tq9Var);
    }

    public final void O9(k27 k27Var, boolean z, boolean z2) {
        if (k27Var != null && k27Var.q4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = k27Var.R0;
            tL_messages_clickSponsoredMessage.media = z;
            tL_messages_clickSponsoredMessage.fullscreen = z2;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Oa() {
        int i;
        this.V4.clear();
        this.X4.clear();
        this.Z4 = 0;
        this.d5 = 0;
        this.e5 = 0;
        Uc(0, true);
        hq6 mediaDataController = getMediaDataController();
        long a = a();
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull == null) {
            i = 0;
        } else {
            i = chatFull.pinned_msg_id;
        }
        mediaDataController.S0(0, i, a);
        this.f5 = true;
        Vc();
    }

    public final void Ob(boolean z, k27 k27Var, k27 k27Var2, ArrayList arrayList, TLRPC.WebPage webPage, boolean z2, int i, bu1 bu1Var, boolean z3, long j) {
        Pb(z, k27Var, k27Var2, arrayList, webPage, z2, i, bu1Var, z3, j, null, true);
    }

    public final void Oc() {
        m8 m8Var;
        int i;
        if (this.h != null) {
            return;
        }
        jq1 jq1Var = this.A0;
        sq1 sq1Var = this.X1;
        if ((sq1Var != null && sq1Var.J) || ((m8Var = this.g9) != null && m8Var.isShowing())) {
            i = 4;
        } else {
            i = 0;
        }
        jq1Var.setImportantForAccessibility(i);
    }

    public final boolean P4() {
        boolean z;
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            gl.t1(getParentActivity().getCurrentFocus());
            h26.n1(this, this.S1, this.T1, this.l6, false);
        }
        return z;
    }

    public final void P5() {
        if (this.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.g4;
        if (i == 3) {
            tL_message.message = k96.M0(2131745702, null);
        } else if (i == 9) {
            tL_message.message = k96.M0(2131742630, null);
        } else {
            tL_message.message = k96.M0(2131752659, null);
        }
        tL_message.id = 0;
        k27 k27Var = new k27(this.currentAccount, tL_message, false, false);
        this.X3 = k27Var;
        k27Var.D = 10;
        k27Var.U = 1;
    }

    public final boolean P7() {
        if (this.g4 == 1) {
            return true;
        }
        return false;
    }

    public final void P8(Object[] objArr, u0b u0bVar, boolean z, TLRPC.StickerSet stickerSet) {
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
                u21 u21Var = new u21(u0bVar.c, this.resourceProvider);
                if (z) {
                    i = 2131744607;
                } else {
                    i = 2131744608;
                }
                m21 q = u21Var.q(document, k96.a0(null, null, i, stickerSet.title));
                q.j = 2750;
                q.k(true);
            }
        }
    }

    public final op1 P9(gb2 gb2Var, CharacterStyle characterStyle) {
        c01 c01Var = this.ec;
        if (c01Var != null) {
            c01Var.a(true);
            this.ec = null;
        }
        if (characterStyle != null && gb2Var != null && gb2Var.getMessageObject() != null) {
            op1 op1Var = new op1(this, gb2Var.getMessageObject().e1(), characterStyle, gb2Var, (byte) 0);
            this.ec = op1Var;
            return op1Var;
        }
        this.ec = null;
        return null;
    }

    public final void Pa(k27 k27Var) {
        if (k27Var == this.qc) {
            this.qc = null;
            nd(true);
            return;
        }
        ka7 L1 = getMessagesController().L1(this.l6);
        if (L1 != null) {
            L1.a.remove(k27Var);
        }
    }

    public final void Pb(boolean r31, defpackage.k27 r32, defpackage.k27 r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, defpackage.bu1 r38, boolean r39, long r40, defpackage.u47 r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Pb(boolean, k27, k27, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, bu1, boolean, long, u47, boolean):void");
    }

    public final void Pc(ArrayList arrayList, boolean z) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.D0.M((k27) arrayList.get(i), false, z);
        }
    }

    public final void Q4() {
        gb2 gb2Var;
        ks1 ks1Var;
        int i;
        if (!this.vc && this.U3 && this.A0.H && getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof gb2) {
                        gb2Var = (gb2) childAt;
                        if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().k != null && gb2Var.getMessageObject().k.video_processing_pending) {
                            if (gb2Var.getCurrentPosition() != null) {
                                if (gb2Var.getMessageObject() != null && (gb2Var.getCurrentPosition().l & 8) != 0) {
                                    int i2 = gb2Var.getCurrentPosition().l;
                                    if (gb2Var.getMessageObject().O3()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    if ((i2 & i) == 0) {
                                        continue;
                                    }
                                }
                            }
                            gb2Var.getLocationInWindow(iArr);
                            float timeY = gb2Var.getTimeY() + iArr[1];
                            if (timeY >= gl.L(240.0f) && timeY <= (gl.q.y - gl.L(25.0f)) - gl.n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    gb2Var = null;
                    break;
                }
            }
            if (gb2Var != null) {
                this.vc = true;
                ks1 ks1Var2 = new ks1(this, getParentActivity());
                ks1Var2.p(true);
                ks1Var2.L = Layout.Alignment.ALIGN_CENTER;
                ks1Var2.d = 3500L;
                ks1Var2.U = true;
                ks1Var2.e = true;
                ks1Var2.h = gl.L(150.0f);
                ks1Var2.q(8.0f);
                this.Q1 = ks1Var2;
                ks1Var2.t(k96.M0(2131743359, null));
                this.Q1.k(this.L);
                this.m1.addView(this.Q1, nme.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                gb2Var.getLocationInWindow(iArr);
                this.R1 = gb2Var.getTimeY() + iArr[1];
                this.Q1.setTranslationY(((-ks1Var.getTop()) - gl.L(120.0f)) + this.R1);
                this.Q1.o(0.0f, (gb2Var.M9 / 2.0f) + (-gl.L(16.0f)) + iArr[0] + gb2Var.O9);
                this.Q1.v();
                return;
            }
            gl.r(new my(this, (byte) 24));
            gl.d3(new my(this, (byte) 24), 2000L);
        }
    }

    public final void Q5() {
        if (this.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = k96.M0(2131742631, null);
        tL_message.id = 0;
        k27 k27Var = new k27(this.currentAccount, tL_message, false, false);
        this.Y3 = k27Var;
        k27Var.D = 10;
        k27Var.U = 1;
    }

    public final j1a Q6() {
        ?? obj = new Object();
        int i = this.g4;
        if (i == 9) {
            obj.b = this.Qa;
        }
        if (i == 5) {
            String str = this.f4;
            int W6 = W6();
            obj.c = str;
            obj.a = W6;
        }
        return new j1a(obj);
    }

    public boolean Q7() {
        if (this.m1.getKeyboardHeight() > gl.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Q8(int i) {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var == null) {
            return;
        }
        d backgroundFragment = ui5Var.getBackgroundFragment();
        if (backgroundFragment instanceof mu1) {
            mu1 mu1Var = (mu1) backgroundFragment;
            if (mu1Var.a() == this.l6) {
                finishFragment();
                mu1Var.J(i, 0, 0, 0, true, true);
                return;
            }
        }
        presentFragment(V9(i, this.l6));
    }

    public final void Q9(k27 k27Var) {
        if (k27Var != null && k27Var.q4() && !k27Var.u0) {
            k27Var.u0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = k27Var.R0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void Qa(k27 k27Var) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(k27Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            vs1 vs1Var = this.D0;
            if (vs1Var != null && !vs1Var.O) {
                vs1Var.r(vs1Var.K + indexOf);
            }
        }
    }

    public final void Qb(ArrayList arrayList) {
        Ob(true, null, null, arrayList, null, true, 0, null, false, 0L);
    }

    public final void Qc() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Qc():void");
    }

    public final void R4(boolean z) {
        if (this.f7 == 0) {
            if (z && !this.g7.isEmpty()) {
                this.f7 = System.currentTimeMillis();
            } else {
                this.f7 = 1L;
            }
            Y7();
            jq1 jq1Var = this.A0;
            if (jq1Var != null) {
                jq1Var.invalidate();
            }
        }
    }

    public final boolean R5(android.view.View r92, boolean r93, boolean r94, float r95, float r96, boolean r97, boolean r98, boolean r99) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.R5(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final boolean R7() {
        if (this.e != null) {
            return getMessagesController().k2(this.e);
        }
        na7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.s8;
        messagesController.getClass();
        return na7.K2(userFull);
    }

    public final void R8(int i) {
        if (this.fragmentView != null) {
            hf0 E6 = E6(i, false);
            if (E6 instanceof gb2) {
                gb2 gb2Var = (gb2) E6;
                i19 i19Var = gb2Var.O;
                TLRPC.MessagePeerReaction K1 = gb2Var.getMessageObject().K1();
                if (K1 != null && (i19Var.H || K1.big)) {
                    d19.d(this, null, E6, null, 0.0f, 0.0f, h19.d(K1.reaction), this.currentAccount, !K1.big ? 1 : 0);
                    d19.f();
                }
                i19Var.H = false;
                k27 k27Var = gb2Var.Q5;
                if (k27Var != null) {
                    k27Var.g5();
                }
            } else if (E6 instanceof uk1) {
                uk1 uk1Var = (uk1) E6;
                i19 i19Var2 = uk1Var.F0;
                TLRPC.MessagePeerReaction K12 = uk1Var.getMessageObject().K1();
                if (K12 != null && (i19Var2.H || K12.big)) {
                    d19.d(this, null, E6, null, 0.0f, 0.0f, h19.d(K12.reaction), this.currentAccount, !K12.big ? 1 : 0);
                    d19.f();
                }
                i19Var2.H = false;
                k27 k27Var2 = uk1Var.Q0;
                if (k27Var2 != null) {
                    k27Var2.g5();
                }
            }
        }
    }

    public final boolean R9() {
        k27 k27Var;
        km kmVar;
        k27 k27Var2;
        ImageReceiver photoImage;
        km m;
        boolean z;
        gb2 gb2Var;
        boolean z2;
        if (this.A0 != null && ((k27Var = MediaController.w().v0) == null || k27.K4(k27Var.k))) {
            je5 je5Var = this.I2;
            ArrayList arrayList = null;
            if (je5Var != null && je5Var.W && (gb2Var = this.Lb) != null) {
                ImageReceiver photoImage2 = gb2Var.getPhotoImage();
                kmVar = photoImage2.m();
                if (kmVar != null) {
                    k27Var2 = gb2Var.getMessageObject();
                    if (photoImage2.x() + gb2Var.getTop() > this.A0.getMeasuredHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.N8 = z2;
                } else {
                    k27Var2 = null;
                }
            } else {
                kmVar = null;
                k27Var2 = null;
            }
            if (k27Var2 == null) {
                int childCount = this.A0.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i);
                    if (childAt instanceof gb2) {
                        gb2 gb2Var2 = (gb2) childAt;
                        k27 messageObject = gb2Var2.getMessageObject();
                        boolean g4 = messageObject.g4();
                        if (!messageObject.f4() && !messageObject.R4() && ((k27.K4(messageObject.k) || g4) && messageObject.r0 == null && (m = (photoImage = gb2Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.M0;
                            float f = photoImage.O0 + top;
                            if (f >= 0.0f && top <= this.A0.getMeasuredHeight()) {
                                if (k27Var2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f <= this.A0.getMeasuredHeight()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.N8 = z;
                                if (top >= 0.0f && f <= this.A0.getMeasuredHeight()) {
                                    k27Var2 = messageObject;
                                    kmVar = m;
                                    break;
                                }
                                k27Var2 = messageObject;
                                kmVar = m;
                            }
                        }
                    }
                    i++;
                }
            }
            if (k27Var2 != null && !MediaController.w().D(k27Var2)) {
                z7(true);
                if (k27Var2.g4()) {
                    boolean R = MediaController.w().R(k27Var2);
                    MediaController w = MediaController.w();
                    if (R) {
                        arrayList = c6(k27Var2, false);
                    }
                    w.q0(arrayList, false);
                    return R;
                }
                gba.C(true);
                k27Var2.b0 = kmVar.n();
                k27Var2.d0 = kmVar.o();
                kmVar.stop();
                if (PhotoViewer.O0(k27Var2)) {
                    PhotoViewer.k9.M();
                }
                return MediaController.w().R(k27Var2);
            }
        }
        return false;
    }

    public final void Ra(k27 k27Var) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(k27Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            vs1 vs1Var = this.D0;
            if (vs1Var != null && !vs1Var.O) {
                vs1Var.K(vs1Var.K + indexOf, true);
            }
        }
    }

    public final void Rb(k27 k27Var) {
        Ob(true, k27Var, null, null, null, true, 0, null, false, 0L);
    }

    public final void Rc() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.y1 == null) {
            return;
        }
        boolean z4 = false;
        if (this.D9 && !t7() && !this.a0.T0() && !this.mb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
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
        ar1 ar1Var = this.a0;
        if (ar1Var != null && ar1Var.a()) {
            z3 = true;
        } else {
            z3 = false;
        }
        dz1 dz1Var = this.y1;
        if (z && !z3) {
            z4 = true;
        }
        dz1Var.e(1, z4, z2);
    }

    public final void S4(CharSequence charSequence) {
        boolean z;
        TLRPC.WebPage webPage;
        k27 k27Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        k27 k27Var2 = this.H5;
        if (k27Var2 != null && (message = k27Var2.k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z = true;
        } else {
            z = false;
        }
        if (this.x5 != null && k27Var2 != null) {
            int i = k27Var2.D;
            if ((i == 0 || i == 19) && (webPage = this.Y5) != null) {
                String str = webPage.url;
                if (str != null) {
                    try {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        try {
                            gl.c(valueOf, 1, false, true);
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                            if (o27.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                if (z) {
                    this.Y5 = null;
                    ar1 ar1Var = this.a0;
                    if (ar1Var != null) {
                        ar1Var.N3 = null;
                        ar1Var.O3 = true;
                    }
                    o27 o27Var = this.x5;
                    if (o27Var != null) {
                        int i2 = this.currentAccount;
                        CharSequence fieldText = ar1Var.getFieldText();
                        k27 k27Var3 = this.F5;
                        if (k27Var3 == this.m4) {
                            k27Var = null;
                        } else {
                            k27Var = k27Var3;
                        }
                        o27Var.e(i2, null, fieldText, k27Var, this.D5, this.H5);
                    }
                    u6();
                    w6();
                }
            }
        }
    }

    public final int S6(defpackage.k27 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.S6(k27):int");
    }

    public final boolean S7() {
        int i = this.g4;
        if (i != 5 && i != 9) {
            return false;
        }
        return true;
    }

    public final void S8(long j, boolean z, boolean z2) {
        if (!gl.C1(getParentActivity())) {
            return;
        }
        wfb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, z, z2, getResourceProvider());
    }

    public final void S9(k27 k27Var) {
        d dVar;
        mu1 mu1Var;
        ui5 ui5Var = this.parentLayout;
        if (ui5Var == null) {
            return;
        }
        long j = k27Var.k.action.channel_id;
        if (ui5Var.getFragmentStack().size() > 0) {
            dVar = (d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            dVar = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        ui5 ui5Var2 = this.parentLayout;
        if (indexOf > 0 && !(dVar instanceof mu1) && !(dVar instanceof ProfileActivity) && this.e.creator) {
            int size = ui5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                d dVar2 = (d) ui5Var2.getFragmentStack().get(indexOf);
                if (dVar2 instanceof mu1) {
                    ((ActionBarLayout) ui5Var2).b(indexOf, new mu1(ls6.k(j, "chat_id")));
                    dVar2.removeSelfFromStack();
                } else if (dVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) ui5Var2).b(indexOf, new ProfileActivity(ls6.k(j, "chat_id"), null));
                    dVar2.removeSelfFromStack();
                } else if (dVar2 instanceof p82) {
                    ((ActionBarLayout) ui5Var2).b(indexOf, new p82(ls6.k(j, "chat_id")));
                    dVar2.removeSelfFromStack();
                } else if (dVar2 instanceof kf2) {
                    if (((kf2) dVar2).e1 == 0) {
                        Bundle arguments = dVar2.getArguments();
                        arguments.putLong("chat_id", j);
                        ((ActionBarLayout) ui5Var2).b(indexOf, new kf2(arguments));
                    }
                    dVar2.removeSelfFromStack();
                }
                indexOf++;
            }
            mu1Var = this;
        } else {
            mu1Var = this;
            gl.c3(new s67(mu1Var, dVar, k27Var, ui5Var2, (byte) 27));
        }
        gl.d3(new xn0(mu1Var, j, (byte) 2), 1000L);
    }

    public final void Sa() {
        if (this.h8 == null && this.i8 == null && this.j8 == null) {
            my myVar = this.m8;
            if (myVar != null) {
                gl.r(myVar);
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

    public final void Sb(k27 k27Var, bu1 bu1Var) {
        Ob(true, k27Var, null, null, null, true, 0, bu1Var, false, 0L);
    }

    public final void Sc() {
        dz1 dz1Var = this.y1;
        dq1 dq1Var = this.w;
        if (dz1Var != null) {
            this.y1.setTranslationY((((-dq1Var.d()) - this.U.getInputBubbleHeight()) - m7(gxb.c)) - gl.L(13.0f));
        }
        if (this.s1 != null) {
            this.s1.setTranslationY((-dq1Var.d()) - gl.L(16.0f));
        }
    }

    public final void T4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.T4():void");
    }

    public final ja8 T5(View view, ia8 ia8Var) {
        kl0 kl0Var;
        jx4 jx4Var;
        al0 k;
        zha simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || getParentActivity() == null) {
            return null;
        }
        lx4 lx4Var = this.K;
        if (lx4Var != null) {
            lx4 lx4Var2 = this.J;
            if (lx4Var2 == null) {
                lx4Var2 = lx4Var;
            }
            jx4 jx4Var2 = new jx4(lx4Var2, lx4Var);
            kl0Var = new kl0(jx4Var2, jx4Var2, jx4Var2);
            kl0Var.k = true;
            kl0Var.j = L6();
            zec zecVar = this.l1;
            mu1 mu1Var = this.Aa;
            if (mu1Var == null) {
                mu1Var = this;
            }
            at1 at1Var = mu1Var.m1;
            kl0Var.h = zecVar;
            kl0Var.i = at1Var;
            kl0Var.g = this.F;
            jx4Var = jx4Var2;
        } else {
            kl0Var = this.M;
            jx4Var = null;
        }
        kl0 kl0Var2 = kl0Var;
        if (kl0Var2 == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getMenuGlassColorProvider() != null) {
            k = this.actionBar.getMenuGlassColorProvider();
        } else {
            k = nod.k(this.Ba);
        }
        return new ja8(getParentActivity(), view, ia8Var, simpleMenuOverlay, kl0Var2, jx4Var, k, this.x, this.Ba);
    }

    public final int T6() {
        ui5 ui5Var = this.parentLayout;
        int i = 0;
        if (ui5Var == null || ui5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i < this.parentLayout.getFragmentStack().size()) {
                d dVar = (d) this.parentLayout.getFragmentStack().get(i);
                if (dVar != this && (dVar instanceof mu1) && ((mu1) dVar).l6 == this.l6) {
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

    public final boolean T7() {
        return !TextUtils.isEmpty(this.j4);
    }

    public final void T8() {
        N5(false);
        boolean z = this.fragmentBeginToShow;
        jq1 jq1Var = this.A0;
        if (!z) {
            jq1Var.X1 = false;
            jq1Var.Y1 = false;
            jq1Var.setEmptyView(this.f1);
            jq1 jq1Var2 = this.A0;
            jq1Var2.X1 = true;
            jq1Var2.Y1 = true;
            return;
        }
        jq1Var.setEmptyView(this.f1);
    }

    public final void T9(boolean z) {
        int i;
        if (this.A0 != null) {
            ArrayList arrayList = this.M6;
            if (!arrayList.isEmpty() && !this.Ta.n) {
                if (z) {
                    i = 0;
                    while (i < arrayList.size() && ((k27) arrayList.get(i)).q4()) {
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

    public final void Ta(boolean z) {
        k27 k27Var = this.b8;
        if (k27Var != null) {
            if (z) {
                boolean[] zArr = this.W6;
                zArr[1] = true;
                zArr[0] = true;
                this.Z7 = 0;
                this.c7 = 0;
            }
            this.V7 = 0;
            this.W7 = false;
            Qa(k27Var);
            this.b8 = null;
        }
    }

    public final void Tb(u47 u47Var) {
        Pb(true, null, null, null, null, true, 0, null, false, 0L, u47Var, true);
    }

    public final void Tc(boolean z) {
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
        if ((!a8() || this.x4) && this.a3 != null) {
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
            if (objArr == null && !this.fc && !this.X2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (objArr != null && !this.fc && !this.X2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.fc && !this.X2) {
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
                    this.b3.setInterpolator(s33.h);
                    this.b3.setDuration(360L);
                    this.b3.addListener(new ls1(this, z5, z6, z7));
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
                if (a8() && !this.x4) {
                    boolean z9 = z8;
                    this.O2.c(z9 ? 1 : 0, 1, z9);
                    return;
                }
                this.O2.c((this.V4.size() - 1) - Collections.binarySearch(this.V4, Integer.valueOf(this.Z4), Comparator$CC.reverseOrder()), this.V4.size(), z2);
            }
        }
    }

    public final void U4(boolean z) {
        TLRPC.ChatFull chatFull;
        String str;
        fc2 fc2Var = this.o8;
        if (fc2Var != null && (((str = this.y8) != null || this.z8) && this.f6)) {
            rgc.l(this.e, str, this.q8, Boolean.valueOf(!fc2Var.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y8 = null;
            this.z8 = false;
            return;
        }
        if (this.y8 != null && z && (chatFull = this.r8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            ir2.v(null, 2131748721, u21.b0(this), 2131624080, 36);
            this.y8 = null;
        }
        this.p8 = !this.f6;
    }

    public final void U5() {
        if (this.h == null && this.M2 == null && getParentActivity() != null) {
            yr1 yr1Var = new yr1(this, getParentActivity());
            this.M2 = yr1Var;
            yr1Var.setTag(1);
            this.b1.addView(this.M2, nme.o(-1, 48));
            this.b1.i(1, this.M2);
            this.b1.h(this.M2);
            this.M2.setOnClickListener(new kl1(this, (byte) 17));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(bkb.L0(false));
            qa8 qa8Var = new qa8(getParentActivity(), this.Ba);
            this.O2 = qa8Var;
            this.M2.addView(qa8Var, nme.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(bkb.Ve));
            this.U2.setTypeface(gl.o());
            this.M2.addView(this.U2, nme.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i = 0; i < 2; i++) {
                lu1 lu1Var = new lu1(this, getParentActivity());
                lu1[] lu1VarArr = this.R2;
                lu1VarArr[i] = lu1Var;
                lu1Var.setTextSize(14);
                zkb.W(lu1VarArr[i], bkb.Ve, getResourceProvider());
                lu1VarArr[i].setTypeface(gl.o());
                this.M2.addView(lu1VarArr[i], nme.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                zr1 zr1Var = new zr1((byte) 0, getParentActivity(), this);
                jia[] jiaVarArr = this.S2;
                jiaVarArr[i] = zr1Var;
                zr1Var.setTextSize(14);
                zkb.W(jiaVarArr[i], bkb.We, getResourceProvider());
                this.M2.addView(jiaVarArr[i], nme.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                au1 au1Var = new au1(this, getParentActivity());
                au1[] au1VarArr = this.T2;
                au1VarArr[i] = au1Var;
                this.M2.addView(au1Var, nme.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                as1 as1Var = new as1(getParentActivity());
                as1Var.J = new qla();
                as1Var.I = new Path();
                as1Var.K = new float[8];
                be0[] be0VarArr = this.Q2;
                be0VarArr[i] = as1Var;
                as1Var.setBlurAllowed(true);
                be0VarArr[i].setRoundRadius(gl.L(2.0f));
                this.M2.addView(be0VarArr[i], nme.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i == 1) {
                    lu1VarArr[i].setVisibility(4);
                    au1VarArr[i].setVisibility(4);
                    jiaVarArr[i].setVisibility(4);
                    be0VarArr[i].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.a3 = imageView;
            imageView.setImageResource(2131232302);
            ImageView imageView2 = this.a3;
            int i2 = bkb.Te;
            wjb resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.s(imageView2, i2, resourceProvider, mode);
            ImageView imageView3 = this.a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.a3.setContentDescription(k96.M0(2131754722, null));
            this.a3.setVisibility(4);
            this.a3.setAlpha(0.0f);
            this.a3.setScaleX(0.4f);
            this.a3.setScaleY(0.4f);
            ImageView imageView4 = this.a3;
            int i3 = bkb.w7;
            zkb.R(imageView4, bkb.f0(getThemedColor(i3) & 436207615, 1, -1), null, zkb.g(i3, 25), getResourceProvider());
            this.M2.addView(this.a3, nme.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.a3.setOnClickListener(new kl1(this, (byte) 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231987);
            zkb.s(this.Y2, i2, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(k96.M0(2131752029, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.Ba);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(gl.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(bkb.Ue));
            this.M2.addView(this.Z2, nme.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            zkb.R(this.Y2, bkb.f0(getThemedColor(i3) & 436207615, 1, gl.L(14.0f)), null, zkb.g(i3, 25), getResourceProvider());
            this.M2.addView(this.Y2, nme.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new kl1(this, (byte) 19));
            Tc(false);
        }
    }

    public final int U6() {
        return Math.max(this.d5, this.e5);
    }

    public final boolean U7() {
        int i = this.g4;
        if (((i == 0 && this.s4 == 0) || i == 3) && this.l6 == getUserConfig().e() && !T7()) {
            return true;
        }
        return false;
    }

    public final void U8() {
        long j;
        Integer valueOf = Integer.valueOf(this.n6);
        ArrayList arrayList = this.z6;
        arrayList.add(valueOf);
        if (this.g4 == 7) {
            cd5 a = cd5.a(this.currentAccount);
            String str = this.J3;
            int i = this.classGuid;
            int i2 = this.d4;
            int i3 = this.n6;
            this.n6 = i3 + 1;
            a.e(i, i2, i3, str);
        } else if (this.O7 != 0) {
            na7 messagesController = getMessagesController();
            long j2 = this.l6;
            long j3 = this.d7;
            int i4 = this.O7;
            int i5 = this.classGuid;
            int i6 = this.g4;
            long j4 = this.s4;
            int i7 = this.C4;
            int i8 = this.n6;
            this.n6 = i8 + 1;
            messagesController.a3(j2, j3, false, 30, 0, i4, true, 0, i5, 4, i6, j4, i7, i8, this.x4);
        } else if (this.M7 != 0 && (!a8() || this.M7 == this.d8 || this.x4)) {
            int i9 = this.B7;
            if (i9 != 0) {
                this.d7 = i9;
                na7 messagesController2 = getMessagesController();
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
                messagesController2.a3(j5, 0L, z, b, i10, 0, true, 0, i11, 3, i12, j6, i13, i14, this.x4);
            } else {
                na7 messagesController3 = getMessagesController();
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
                messagesController3.a3(j7, j8, z2, b2, i15, 0, true, 0, i16, 3, i17, j9, i18, i19, this.x4);
            }
        } else if (this.A7) {
            this.n6++;
        } else {
            na7 messagesController4 = getMessagesController();
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
            messagesController4.a3(j10, j11, z3, b3, i20, 0, true, 0, i21, 2, i22, j12, i23, i24, this.x4);
        }
        int i25 = this.g4;
        if (i25 == 0 || (i25 == 3 && X6() == getUserConfig().e())) {
            if (a8() && !this.x4) {
                return;
            }
            arrayList.add(Integer.valueOf(this.n6));
            na7 messagesController5 = getMessagesController();
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
            messagesController5.a3(j13, j14, false, 1, 0, 0, true, 0, i26, 2, 1, j15, i27, i28, this.x4);
        }
    }

    public final boolean U9() {
        ar1 ar1Var = this.a0;
        boolean z = ar1Var.p3;
        if (z) {
            ar1Var.V1();
            this.S3 = true;
        }
        gl.g3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z;
    }

    public final void Ua(int r23, java.util.ArrayList r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Ua(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void Ub(boolean z, TLRPC.WebPage webPage, boolean z2) {
        Ob(z, null, null, null, webPage, true, 0, null, z2, 0L);
    }

    public final void Uc(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Uc(int, boolean):void");
    }

    public final void V4() {
        TLRPC.ChatFull L0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        if (this.N1 == null && hc2.n0(this.e) && (L0 = getMessagesController().L0(this.e.id)) != null && this.a0 != null && getParentActivity() != null && (stickerSet = L0.emojiset) != null) {
            er1 er1Var = this.d1;
            if (er1Var == null || er1Var.getVisibility() != 0) {
                le5 le5Var = le5.n;
                if (le5Var.c()) {
                    long j = stickerSet.thumb_document_id;
                    if (j == 0 && (a0 = getMediaDataController().a0(stickerSet)) != null && !a0.documents.isEmpty()) {
                        j = a0.documents.get(0).id;
                    }
                    if (j != 0 && getParentActivity() != null) {
                        le5Var.b();
                        je5 je5Var = new je5(getParentActivity(), 3);
                        this.N1 = je5Var;
                        je5Var.j(true);
                        this.N1.p(true);
                        je5 je5Var2 = this.N1;
                        je5Var2.L = Layout.Alignment.ALIGN_CENTER;
                        je5Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new gm(j, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new z3c(gl.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.t(gl.G2(k96.M0(2131749250, null), spannableStringBuilder, "%s"));
                        je5 je5Var3 = this.N1;
                        je5Var3.h = je5.a(je5Var3.getText(), this.N1.getTextPaint());
                        je5 je5Var4 = this.N1;
                        je5Var4.d = -1L;
                        je5Var4.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
                        this.N1.k(this.L);
                        gl.d3(new my(this, (byte) 3), 300L);
                    }
                }
            }
        }
    }

    public final void V5() {
        int i;
        int i2;
        if (this.g3 == null && getParentActivity() != null) {
            dr1 dr1Var = new dr1(this, getParentActivity(), (byte) 1);
            this.g3 = dr1Var;
            dr1Var.setClickable(false);
            this.g3.setWillNotDraw(false);
            this.kd.s(4, false, false);
            this.g3.setClipToPadding(false);
            hn hnVar = new hn(getParentActivity(), true, true, true);
            this.j3 = hnVar;
            s33 s33Var = s33.h;
            hnVar.b(0.25f, 280L, s33Var);
            this.j3.setTextSize(gl.L(15.0f));
            this.j3.setTypeface(gl.o());
            zkb.U(this.j3, bkb.pf, getResourceProvider());
            this.j3.setGravity(3);
            this.g3.addView(this.j3, nme.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.g3, nme.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            hn hnVar2 = new hn(getParentActivity(), true, false, true);
            this.k3 = hnVar2;
            hnVar2.b(0.0f, 420L, s33Var);
            this.k3.setScaleProperty(0.7f);
            this.k3.setTextSize(gl.L(15.0f));
            this.k3.setGravity(5);
            this.k3.setTypeface(gl.o());
            zkb.U(this.k3, bkb.n6, getResourceProvider());
            hn hnVar3 = this.k3;
            if (this.hd.f) {
                i = 2131745626;
            } else {
                i = 2131745625;
            }
            hnVar3.setText(k96.M0(i, null));
            hn hnVar4 = this.k3;
            hnVar4.n = false;
            hnVar4.setPadding(gl.L(15.33f), 0, gl.L(15.33f), 0);
            this.k3.setOnClickListener(new kl1(this, (byte) 2));
            this.k3.setAlpha(0.5f);
            this.k3.setClickable(false);
            this.g3.addView(this.k3, nme.e(-2, -1, 117));
            hn hnVar5 = new hn(getParentActivity(), true, true, true);
            this.l3 = hnVar5;
            hnVar5.setGravity(17);
            this.l3.setTypeface(gl.o());
            zkb.U(this.l3, bkb.rf, getResourceProvider());
            this.l3.setTextSize(gl.L(15.0f));
            hn hnVar6 = this.l3;
            int i3 = bkb.c6;
            int themedColor = getThemedColor(i3);
            int themedColor2 = getThemedColor(i3);
            int i4 = bkb.h6;
            zkb.R(hnVar6, bkb.g0(themedColor, bkb.v(themedColor2, getThemedColor(i4))), zkb.M(i3), zkb.p(i3, i4), getResourceProvider());
            hn hnVar7 = this.l3;
            if (this.D0.O) {
                i2 = 2131745691;
            } else {
                i2 = 2131745674;
            }
            hnVar7.setText(k96.M0(i2, null));
            this.l3.setOnClickListener(new kl1(this, (byte) 3));
            this.l3.setVisibility(8);
            this.l3.setAlpha(0.0f);
            this.g3.addView(this.l3, nme.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!hc2.T(chat) || this.e.megagroup) && this.g4 != 7 && !hc2.p0(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.i3.setImageResource(2131232422);
                zkb.s(this.i3, bkb.of, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.i3;
                int i5 = bkb.y8;
                zkb.R(imageView2, bkb.f0(getThemedColor(i5), 1, -1), null, zkb.M(i5), getResourceProvider());
                this.g3.addView(this.i3, nme.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.i3.setOnClickListener(new kl1(this, (byte) 4));
                this.i3.setContentDescription(k96.M0(2131754779, null));
            }
            if (this.g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.h3.setImageResource(2131232081);
                zkb.s(this.h3, bkb.of, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.h3;
                int i6 = bkb.y8;
                zkb.R(imageView4, bkb.f0(getThemedColor(i6), 1, -1), null, zkb.M(i6), getResourceProvider());
                this.g3.addView(this.h3, nme.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.h3.setOnClickListener(new kl1(this, (byte) 5));
                this.h3.setContentDescription(k96.M0(2131748873, null));
            }
        }
    }

    public final defpackage.p98 V6(defpackage.k27 r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.V6(k27, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):p98");
    }

    public final boolean V7() {
        kxb kxbVar = this.g2;
        if (kxbVar != null && kxbVar.U && kxbVar.a.f) {
            return true;
        }
        return false;
    }

    public final void V8(View view, boolean[] zArr, m8 m8Var, View view2) {
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
            int i3 = gl.m;
            int i4 = this.j9;
            if (height > 0) {
                i2 = gl.L(8.0f) + height;
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

    public final void Va() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().j(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.M7 = 0;
        this.C7 = false;
        this.D7 = true;
        this.z6.clear();
    }

    public final void Vb(boolean z) {
        if (this.m3 != null && !S7()) {
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
                this.v3.addListener(new lp1(this, (byte) 4));
                this.v3.start();
            }
            if (!z) {
                I7();
                this.p3 = (short) 1000;
            }
        }
    }

    public final void Vc() {
        k27 k27Var;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.x4 && !this.X4.isEmpty() && this.V4.size() == 1 && ((Integer) this.V4.get(0)).intValue() == d() + 1) {
            k27Var = (k27) this.X4.get(this.V4.get(0));
        } else {
            k27Var = null;
        }
        this.n4 = k27Var;
        if (this.x4 && k27Var != null && (message = k27Var.k) != null && (tL_forumTopic = this.r4) != null && !k27.u5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.e;
            TLRPC.Peer peer = this.n4.k.from_id;
            if (chat == null) {
                if (peer == null) {
                    return;
                }
            } else if (peer != null) {
                if (hc2.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                    if (chat.id == peer.channel_id) {
                        return;
                    }
                } else if (!hc2.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.id == peer.chat_id) {
                    return;
                }
            }
            this.n4 = null;
        }
    }

    public final void W4() {
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
                long d1 = ((k27) arrayList.get(i3)).d1();
                if (j != d1) {
                    if (i2 >= 0 && j != 0 && (i = i3 - i2) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < i; i4++) {
                            arrayList2.add((k27) arrayList.remove(i2));
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
                    arrayList3.add((k27) arrayList.remove(i2));
                }
                arrayList.addAll(i2, arrayList3);
            }
        }
    }

    public final void W5() {
        if (this.s2 == null && this.I1 == null) {
            pi4 pi4Var = new pi4(getParentActivity(), this.Ba);
            this.r2 = pi4Var;
            pi4Var.setViewType(7);
            zya zyaVar = new zya(getParentActivity(), this.r2, 1, null);
            this.s2 = zyaVar;
            zyaVar.setClickable(true);
            this.s2.d.setText(k96.M0(2131747975, null));
            this.s2.setVisibility(8);
            this.s2.addView(this.r2, 0);
            this.s2.e(true, false);
            this.Z3.addView(this.s2, new FrameLayout.LayoutParams(-1, -1, 17));
            Activity parentActivity = getParentActivity();
            vc5 vc5Var = new vc5(this.currentAccount, this.resourceProvider, parentActivity);
            this.I1 = vc5Var;
            vc5Var.setOnHashtagClickListener(new hl1(this, (byte) 3));
            this.I1.setOnScrollListener(new y(this, (byte) 15));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            x5();
            v5();
        }
    }

    public final int W6() {
        if (this.g4 == 5) {
            return (int) this.s4;
        }
        return 0;
    }

    public final boolean W7() {
        kxb kxbVar = this.g2;
        if (kxbVar != null) {
            return kxbVar.c;
        }
        if (hc2.c0(this.e) && D4()) {
            return true;
        }
        return false;
    }

    public final void W8(long j) {
        getMediaDataController().I0(j, j, true, this.classGuid, null);
    }

    public final void Wa() {
        this.cc = null;
        this.ac = 0;
        this.bc = -1;
        this.dc = null;
        this.ec = null;
        this.y1.d(false);
    }

    public final void Wb(boolean z) {
        if (this.n3 != null && !S7()) {
            if (this.n3.getTag() == null) {
                ValueAnimator valueAnimator = this.w3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.n3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x3, 1.0f);
                this.w3 = ofFloat;
                ofFloat.setDuration(150L);
                this.w3.addUpdateListener(new wk1(this, (byte) 2));
                this.w3.addListener(new lp1(this, (byte) 6));
                this.w3.start();
            }
            if (!z) {
                I7();
                this.p3 = (short) 1000;
            }
        }
    }

    public final void Wc(boolean z) {
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

    public final void X4(boolean z) {
        ra7 ra7Var;
        if (this.d4 == 2 && (ra7Var = this.b4) != null) {
            String str = this.J3;
            vl6 vl6Var = ra7Var.F;
            if (!TextUtils.equals(ra7Var.y, str)) {
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
                gl.r(vl6Var);
                t1b t1bVar = ra7Var.E;
                if (t1bVar != null && t1bVar.I != 0) {
                    ConnectionsManager.getInstance(t1bVar.c).cancelRequest(t1bVar.I, true);
                    t1bVar.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    ra7Var.y = str;
                    ra7Var.E = new t1b(ra7Var.r, str2, trim);
                    if (z) {
                        vl6Var.run();
                    } else {
                        gl.d3(vl6Var, 1000L);
                    }
                }
                t1b t1bVar2 = ra7Var.E;
                if (t1bVar2 != null && t1bVar2.J > 0) {
                    ra7Var.f();
                }
            }
        }
    }

    public final TextureView X5(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        gl.r(this.O8);
        if (this.J8 == null) {
            dr1 dr1Var = new dr1(this, getParentActivity(), (byte) 2);
            this.J8 = dr1Var;
            dr1Var.setOutlineProvider(new cl0(this, (byte) 2));
            this.J8.setClipToOutline(true);
            this.J8.setWillNotDraw(false);
            ix ixVar = new ix(getParentActivity());
            this.L8 = ixVar;
            ixVar.setBackgroundColor(0);
            if (z) {
                this.J8.addView(this.L8, nme.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.M8 = textureView;
            textureView.setOpaque(false);
            this.L8.addView(this.M8, nme.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.J8.getParent();
        if (viewGroup != null && viewGroup != this.m1) {
            viewGroup.removeView(this.J8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.m1.addView(this.J8, 1, new FrameLayout.LayoutParams(gl.b3(W7(), M7()), gl.b3(W7(), M7())));
        }
        this.J8.setTag(null);
        this.L8.setDrawingReady(false);
        return this.M8;
    }

    public final long X6() {
        if (this.g4 == 3) {
            return this.s4;
        }
        return 0L;
    }

    public final boolean X7() {
        if (this.m0 != null && b8()) {
            return true;
        }
        return false;
    }

    public final void X8() {
        if (this.o5) {
            this.o5 = false;
            MediaController w = MediaController.w();
            if (w.E() && !w.F() && w.h1 == this.classGuid) {
                w.C0(false);
            }
        }
    }

    public final void X9() {
        O4(5, this.e1, true);
        O4(1, this.a0, false);
        O4(4, this.g3, true);
        O4(3, this.d1, false);
        O4(2, this.T, false);
        float f = this.fd.e;
        igf igfVar = this.kd;
        float B = ls6.B(1.0f, f, 1.0f - ((float[]) igfVar.b)[5], 1.0f);
        nu1 nu1Var = this.e1;
        if (nu1Var != null) {
            nu1Var.setTotalVisibilityFactor(B);
        }
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            ar1Var.setTranslationY(gl.L(54.0f) * B);
        }
        dr1 dr1Var = this.g3;
        if (dr1Var != null) {
            dr1Var.setTranslationY(gl.L(54.0f) * B);
        }
        er1 er1Var = this.d1;
        if (er1Var != null) {
            er1Var.setTranslationY(gl.L(54.0f) * B);
        }
        dr1 dr1Var2 = this.T;
        if (dr1Var2 != null) {
            dr1Var2.setTranslationY(gl.L(54.0f) * B);
        }
        j92 j92Var = this.U;
        if (j92Var != null) {
            j92Var.setInputBubbleAlpha((int) ((1.0f - B) * 255.0f));
            this.U.setInputBubbleTranslationY(gl.L(54.0f) * B);
        }
        er1 er1Var2 = this.d1;
        fm0 fm0Var = this.dd;
        if (er1Var2 != null) {
            er1Var2.setTotalVisibilityFactor((1.0f - fm0Var.e) * ((float[]) igfVar.b)[3]);
        }
        kc2 kc2Var = this.ma;
        if (kc2Var != null) {
            float f2 = fm0Var.e;
            if (kc2Var.T != f2) {
                kc2Var.T = f2;
                this.fragmentView.invalidate();
            }
        }
        w5();
    }

    public final void Xa(defpackage.gb2 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Xa(gb2):void");
    }

    public final boolean Xb() {
        ar1 ar1Var = this.a0;
        if (ar1Var != null && ar1Var.getVisibility() == 0) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("gifhint", false)) {
                c1.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.t2 == null) {
                    if (!this.t5) {
                        ar1 ar1Var2 = this.a0;
                        if (ar1Var2 != null) {
                            ar1Var2.X();
                            hq6.d0(ar1Var2.R).X0(true, true, false, 0);
                            wx1 wx1Var = ar1Var2.V0;
                            wx1Var.L(false, false);
                            wx1Var.Q(false, false);
                            wx1Var.h.x(1, false);
                            return false;
                        }
                    } else {
                        at1 at1Var = this.m1;
                        int indexOfChild = at1Var.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            ar1 ar1Var3 = this.a0;
                            ar1Var3.X();
                            hq6.d0(ar1Var3.R).X0(true, true, false, 0);
                            wx1 wx1Var2 = ar1Var3.V0;
                            wx1Var2.L(false, false);
                            wx1Var2.Q(false, false);
                            wx1Var2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232679);
                            int i = indexOfChild + 1;
                            at1Var.addView(this.L2, i, nme.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            je5 s4 = s4(310.0f, 3, i, false);
                            this.t2 = s4;
                            s4.d = 2300L;
                            s4.t(k96.M0(2131744027, null));
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

    public final void Xc(boolean z) {
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

    public final void Y4() {
        this.U.d();
        Sc();
        Cc();
        s5();
        p5();
        u5();
        t5();
        x5();
        H7();
        boolean z = true;
        if (this.w.s == 1) {
            z = false;
        }
        if (this.tb != z) {
            this.tb = z;
            checkSystemBarColors();
        }
    }

    public final void Y5() {
        if (this.m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new k7((byte) 1, getParentActivity(), this);
            G7();
            this.Z1.setClickable(true);
            this.b1.addView(this.Z1, nme.o(-1, 44));
            this.b1.i(2, this.Z1);
            this.b1.h(this.Z1);
            TextView textView = new TextView(getParentActivity());
            this.c2 = textView;
            int i = bkb.p7;
            zkb.X(textView, i, getResourceProvider());
            TextView textView2 = this.c2;
            float L = gl.L(18.0f);
            int L2 = gl.L(4.0f);
            zkb.R(textView2, bkb.W(L, getThemedColor(i) & 436207615, L2, L2, L2, L2), null, zkb.g(i, 25), getResourceProvider());
            this.c2.setTag(Integer.valueOf(i));
            this.c2.setTextSize(1, 14.0f);
            this.c2.setTypeface(gl.o());
            this.c2.setSingleLine(true);
            this.c2.setMaxLines(1);
            this.c2.setGravity(17);
            this.Z1.addView(this.c2, nme.e(-1, -1, 51));
            this.c2.setOnClickListener(new kl1(this, (byte) 13));
            l46 l46Var = new l46(getParentActivity(), this.Ba);
            this.i2 = l46Var;
            zkb.X(l46Var, bkb.We, getResourceProvider());
            this.i2.setTextSize(1, 13.3f);
            this.i2.setDisablePaddingsOffset(true);
            zkb.G(this.i2, bkb.Yl, getResourceProvider());
            this.i2.setGravity(17);
            this.i2.setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
            this.b1.addView(this.i2, nme.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.b1.i(8, this.i2);
            this.b1.h(this.i2);
            TextView textView3 = new TextView(getParentActivity());
            this.a2 = textView3;
            int i2 = bkb.Xe;
            zkb.X(textView3, i2, getResourceProvider());
            this.a2.setVisibility(8);
            this.a2.setTextSize(1, 14.0f);
            this.a2.setTypeface(gl.o());
            this.a2.setSingleLine(true);
            this.a2.setMaxLines(1);
            this.a2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            this.a2.setGravity(17);
            TextView textView4 = this.a2;
            int themedColor = getThemedColor(i2) & 436207615;
            int L3 = gl.L(4.0f);
            zkb.R(textView4, bkb.W(gl.L(18.0f), themedColor, L3, L3, L3, L3), null, zkb.g(i2, 25), getResourceProvider());
            this.Z1.addView(this.a2, nme.e(-1, -1, 51));
            this.a2.setOnClickListener(new kl1(this, (byte) 14));
            TextView textView5 = new TextView(getParentActivity());
            this.d2 = textView5;
            zkb.X(textView5, i2, getResourceProvider());
            this.d2.setVisibility(8);
            this.d2.setTextSize(1, 14.0f);
            this.d2.setTypeface(gl.o());
            this.d2.setSingleLine(true);
            this.d2.setMaxLines(1);
            this.d2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            this.d2.setGravity(17);
            this.d2.setText(k96.M0(2131745891, null));
            zkb.R(this.d2, bkb.f0(getThemedColor(i2) & 436207615, 3, -1), null, zkb.g(i2, 25), getResourceProvider());
            this.b1.addView(this.d2, nme.o(-1, 48));
            this.b1.i(4, this.d2);
            this.b1.h(this.d2);
            this.d2.setOnClickListener(new kl1(this, (byte) 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.j2 = imageView;
            imageView.setImageResource(2131231987);
            this.j2.setContentDescription(k96.M0(2131752029, null));
            ImageView imageView2 = this.j2;
            int i3 = bkb.h6;
            zkb.R(imageView2, bkb.N(getThemedColor(i3), 0, 0), null, zkb.M(i3), getResourceProvider());
            zkb.s(this.j2, bkb.Te, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.j2, nme.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.j2.setOnClickListener(new kl1(this, (byte) 16));
        }
    }

    public final int Y6(int i) {
        return (int) oo1.f((((this.A0.getMeasuredHeight() - this.Ya) - this.P9) - this.w.e()) - gl.L(53.0f), i, 2.0f, -gl.L(2.0f));
    }

    public final boolean Y7() {
        boolean z;
        boolean z2;
        float f;
        FrameLayout frameLayout;
        if (!this.c && !this.d && this.f == null && this.A0 != null && gba.c()) {
            Boolean bool = this.Ib;
            if (bool == null) {
                bool = Boolean.valueOf(e66.e(360928));
                this.Ib = bool;
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
                    R4(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.U6;
                boolean z3 = zArr[0];
                ArrayList arrayList = this.M6;
                if ((!z3 || ((this.d7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.Y6 && f2 > this.P9 && (!arrayList.isEmpty() ? i2 != 0 : this.Hb)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !this.inTransitionAnimation || (frameLayout = this.f1) == null || frameLayout.getVisibility() != 0 || this.f1.getChildCount() <= 0) {
                    if (!z && this.f7 == 0) {
                        R4(this.fragmentBeginToShow);
                    }
                    if (gba.o() != 0 && !this.oa && this.fragmentBeginToShow) {
                        if (z && this.f7 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Drawable l = this.Ba.l();
                        at1 at1Var = this.m1;
                        if (at1Var != null) {
                            l = at1Var.getBackgroundImage();
                        }
                        if (l instanceof ye7) {
                            ye7 ye7Var = (ye7) l;
                            if (ye7Var.M != z2) {
                                float f3 = 1.0f;
                                if (!z2) {
                                    ye7Var.d();
                                    if (ye7Var.M) {
                                        ye7Var.h = 1.0f - ((ye7Var.h - (((int) (f / 0.125f)) * 0.125f)) / 0.125f);
                                        ye7Var.d = true;
                                    }
                                }
                                ye7Var.M = z2;
                                if (z2) {
                                    f3 = 1.5f;
                                }
                                ye7Var.L = f3;
                                ye7Var.x();
                            } else if (z2) {
                                ye7Var.x();
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

    public final void Y8(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            hq6.d0(this.currentAccount).G0(false, true, null);
            ba(user.id, this.C8, false);
        }
    }

    public final void Y9(boolean z, boolean z2) {
        if (this.S3) {
            gl.d3(new my(this, (byte) 26), 200L);
            if (z2) {
                this.S3 = false;
            }
        }
        if (z && !this.mb) {
            gl.V2(getParentActivity(), this.classGuid);
        }
    }

    public final void Ya() {
        ye7 j;
        ku1 ku1Var = this.Ba;
        if (ku1Var != null) {
            Drawable l = ku1Var.l();
            if (this.fragmentView != null) {
                l = this.m1.getBackgroundImage();
            }
            if (l instanceof p72) {
                l = ((p72) l).c(true);
            }
            if (l instanceof ye7) {
                ((ye7) l).v(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof m17) && (j = ((m17) themedDrawable).j()) != null) {
                j.v(false);
            }
        }
    }

    public final void Yb() {
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                gl.d3(new my(this, (byte) 18), 1000L);
            }
        }
    }

    public final void Yc(boolean z) {
        String M0;
        if (this.g4 != 3 && !l7c.w(this.f)) {
            cq1 cq1Var = this.p1;
            if (cq1Var != null && this.s4 != 0) {
                if (this.x4) {
                    pd();
                } else {
                    boolean z2 = this.v4;
                    k27 k27Var = this.m4;
                    if (z2) {
                        if (k27Var != null && k27Var.x2()) {
                            this.p1.setTitle(k96.G(this.m4.M1(), "Comments", new Object[0]));
                        } else {
                            this.p1.setTitle(k96.M0(2131751984, null));
                        }
                    } else if (k27Var != null) {
                        cq1Var.setTitle(k96.G(k27Var.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.q4 != null) {
                if (this.m4.M1() == 0) {
                    if (this.v4) {
                        M0 = k96.M0(2131748034, null);
                    } else {
                        M0 = k96.M0(2131747976, null);
                    }
                } else {
                    M0 = k96.M0(2131751363, null);
                }
                k27 k27Var2 = this.q4;
                k27Var2.k.message = M0;
                k27Var2.v = M0;
                if (z) {
                    this.D0.M(k27Var2, true, false);
                }
            }
        }
    }

    public final void Z4() {
        TLRPC.Chat K0;
        long j = getArguments().getInt("search_from_user_id", 0);
        if (j != 0) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
            if (V1 != null) {
                ra("");
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                kb(null, V1);
                return;
            }
            return;
        }
        long j2 = getArguments().getInt("search_from_chat_id", 0);
        if (j2 != 0 && (K0 = getMessagesController().K0(Long.valueOf(j2))) != null) {
            ra("");
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            kb(K0, null);
        }
    }

    public final void Z5() {
        int i;
        if (this.g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                U5();
            }
            kxb kxbVar = new kxb(getParentActivity(), this, this.currentAccount, a(), D4(), getResourceProvider());
            this.g2 = kxbVar;
            kxbVar.S = new my(this, (byte) 7);
            kxbVar.setSideMenuBackgroundDrawable(this.L.c(kxbVar, nod.o(this.Ba), false));
            kxb kxbVar2 = this.g2;
            kxbVar2.setTopMenuBackgroundDrawable(this.L.c(kxbVar2, nod.o(this.Ba), false));
            this.g2.setCurrentTopic(d());
            this.g2.setOnNewTopicSelected(new my(this, (byte) 9));
            this.g2.setOnTopicSelected(new gl1(this, (byte) 0));
            this.g2.setOnDialogSelected(new gl1(this, (byte) 1));
            int indexOfChild = this.m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i = indexOfChild + 1;
            } else {
                i = 8;
            }
            this.m1.addView(this.g2, i, nme.f(-1.0f, -1, 51, 0, -gl.L(5.0f), 0, 0));
            this.g2.m();
            rd();
            sq1 sq1Var = this.X1;
            if (sq1Var != null) {
                sq1Var.bringToFront();
            }
        }
    }

    public final int Z6(k27 k27Var) {
        return Y6(O6(k27Var, !TextUtils.isEmpty(this.h8))) - fb(k27Var);
    }

    public final boolean Z7() {
        if (getUserConfig().e() == a() && !getMessagesController().D1().b && getUserConfig().p()) {
            return true;
        }
        return false;
    }

    public final void Z8(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = na7.q1(this.currentAccount).m1(user.id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new zn1(this, tL_attachMenuBot, user, (byte) 0), 66);
    }

    public final void Z9() {
        this.R4 = true;
        bt1 bt1Var = this.u9;
        gl.r(bt1Var.f0);
        bt1Var.z = false;
        my myVar = new my(this, (byte) 11);
        int i = this.V7;
        if (i != 0) {
            ib(i, 0, false, this.U7 ? 1 : 0, true, 0, null, null, myVar);
            return;
        }
        int i2 = this.T7;
        if (i2 > 0) {
            ib(i2, 0, true, this.U7 ? 1 : 0, true, 0, null, null, myVar);
            return;
        }
        hb(!this.Cb, myVar);
        this.Cb = false;
        if (!this.V4.isEmpty()) {
            this.c5 = true;
            this.b5 = ((Integer) this.V4.get(0)).intValue();
        }
    }

    public final void Za() {
        boolean z;
        k27 k27Var;
        CharSequence charSequence;
        boolean z2;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j;
        er1 er1Var;
        ar1 ar1Var = this.a0;
        if (ar1Var != null && ar1Var.t2) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.m5 && ar1Var != null && (er1Var = this.d1) != null && er1Var.getVisibility() != 0) {
            k27Var = this.F5;
            charSequence = gl.m1(this.a0.getDraftMessage());
            z = this.a0.O3;
        } else {
            z = true;
            k27Var = null;
            charSequence = null;
        }
        if (this.E5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        hq6 mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && gl.W0(encryptedChat.layer) < 101) {
            z2 = false;
        } else {
            z2 = true;
        }
        ArrayList Y = mediaDataController.Y(charSequenceArr, z2, false);
        long H5 = H5(k27Var);
        TLRPC.DraftMessage T = getMediaDataController().T(this.l6, H5);
        if (T != null) {
            richMessage = T.rich_message;
        } else {
            richMessage = null;
        }
        hq6 mediaDataController2 = getMediaDataController();
        long j2 = this.l6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (k27Var != null && !k27Var.p && k27Var.j1 == null && !this.E5) {
            message = k27Var.k;
        } else {
            message = null;
        }
        bu1 bu1Var = this.D5;
        u47 u47Var = this.y5;
        if (u47Var != null) {
            suggestedPost = u47Var.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        ar1 ar1Var2 = this.a0;
        if (ar1Var2 != null) {
            j = ar1Var2.getEffectId();
        } else {
            j = 0;
        }
        mediaDataController2.T1(j2, H5, charSequence2, Y, message, bu1Var, suggestedPost2, j, !z, false, richMessage);
    }

    public final void Zb(k27 k27Var, CharSequence charSequence, int i) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        m21 G = u21.b0(this).G(2131623982, 9999, charSequence);
        G.j = max;
        G.v = new rl1(this, i);
        G.k(true);
        this.V3 = k27Var;
        this.W3 = i;
    }

    public final void Zc(int i, k27 k27Var) {
        k27 k27Var2;
        SparseArray sparseArray = this.I6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i);
        if (arrayList == null) {
            return;
        }
        if (k27Var == null) {
            k27Var2 = new k27(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            k27Var2 = null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k27 k27Var3 = (k27) this.G6[0].get(((Integer) arrayList.get(i2)).intValue());
            if (k27Var3 != null) {
                if (k27Var == null) {
                    k27Var3.C = k27Var2;
                } else {
                    k27Var3.C = k27Var;
                }
                vs1 vs1Var = this.D0;
                if (vs1Var != null) {
                    vs1Var.M(k27Var3, true, false);
                }
            }
        }
        if (k27Var == null) {
            sparseArray.remove(i);
        }
    }

    public long a() {
        return this.l6;
    }

    public final void a5() {
        k27 k27Var;
        if (!this.R4 && (k27Var = this.b8) != null) {
            if (this.M6.indexOf(k27Var) >= 0) {
                this.S4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.Q4 != null) {
        } else {
            wl1 wl1Var = new wl1(this, (byte) 22);
            this.Q4 = wl1Var;
            gl.c3(wl1Var);
        }
    }

    public final void a6() {
        if (this.e2 == null && getParentActivity() != null) {
            Y5();
            if (this.b1 != null) {
                mr1 mr1Var = new mr1(this, getParentActivity(), this, this.Ba);
                this.e2 = mr1Var;
                this.b1.addView(mr1Var, nme.r(-1, 36, 83));
                this.b1.i(12, this.e2);
                this.b1.h(this.e2);
            }
        }
    }

    public final int a7(View view) {
        fa4.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom()) + "} chatHeight=" + this.A0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.A0.getPaddingBottom());
        return (this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom();
    }

    public final boolean a8() {
        if (this.m4 != null) {
            return true;
        }
        return false;
    }

    public final void a9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            hq6.d0(this.currentAccount).G0(false, true, null);
            ba(user.id, this.C8, false);
        }
    }

    public final void ab() {
        gb2 gb2Var = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.A0.getChildCount()) {
                break;
            }
            View childAt = this.A0.getChildAt(i);
            if ((childAt instanceof ke2) && childAt.getBottom() > 0 && childAt.getTop() < this.A0.getHeight()) {
                gb2Var = childAt;
                break;
            }
            if (childAt instanceof gb2) {
                gb2 gb2Var2 = (gb2) childAt;
                int min = Math.min(gb2Var2.getBottom(), this.A0.getHeight()) - Math.max(0, gb2Var2.getTop());
                if (min > i2) {
                    gb2Var = gb2Var2;
                    i2 = min;
                }
            }
            i++;
        }
        if (gb2Var != null) {
            mq1 mq1Var = this.C0;
            this.A0.getClass();
            mq1Var.h1(RecyclerView.R(gb2Var), gb2Var.getTop() - ((int) this.P9), false);
        }
    }

    public final void ac(boolean z) {
        boolean z2;
        dz1 dz1Var = this.y1;
        if (dz1Var != null) {
            if (z && !hc2.p0(this.e)) {
                z2 = true;
            } else {
                z2 = false;
            }
            dz1Var.e(2, z2, true);
            if (!z) {
                this.T7 = 0;
            }
        }
    }

    public final void ad(boolean z) {
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            ar1Var.u2(z);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.ng));
        hashSet.add(Integer.valueOf(bkb.J5));
        hashSet.add(Integer.valueOf(bkb.z5));
        hashSet.add(Integer.valueOf(bkb.p5));
        hashSet.add(Integer.valueOf(bkb.h5));
        hashSet.add(Integer.valueOf(bkb.g5));
        hashSet.add(Integer.valueOf(bkb.W9));
        hashSet.add(Integer.valueOf(bkb.ca));
        hashSet.add(Integer.valueOf(bkb.na));
        hashSet.add(Integer.valueOf(bkb.ha));
        hashSet.add(Integer.valueOf(bkb.ma));
        hashSet.add(Integer.valueOf(bkb.la));
        hashSet.add(Integer.valueOf(bkb.ka));
        hashSet.add(Integer.valueOf(bkb.ja));
        hashSet.add(Integer.valueOf(bkb.ia));
        hashSet.add(Integer.valueOf(bkb.bd));
        hashSet.add(Integer.valueOf(bkb.fg));
        hashSet.add(Integer.valueOf(bkb.Zd));
        hashSet.add(Integer.valueOf(bkb.Yd));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.xf));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.tf));
        hashSet.add(Integer.valueOf(bkb.vf));
        hashSet.add(Integer.valueOf(bkb.uf));
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.jg));
        hashSet.add(Integer.valueOf(bkb.Nl));
        hashSet.add(Integer.valueOf(bkb.mf));
        hashSet.add(Integer.valueOf(bkb.Ue));
        hashSet.add(Integer.valueOf(bkb.s7));
        hashSet.add(Integer.valueOf(bkb.v7));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.yf));
        hashSet.add(Integer.valueOf(bkb.Rf));
        hashSet.add(Integer.valueOf(bkb.Zf));
        hashSet.add(Integer.valueOf(bkb.Re));
        hashSet.add(Integer.valueOf(bkb.Sf));
        hashSet.add(Integer.valueOf(bkb.Oe));
        hashSet.add(Integer.valueOf(bkb.Me));
        hashSet.add(Integer.valueOf(bkb.Ke));
        hashSet.add(Integer.valueOf(bkb.Je));
        hashSet.add(Integer.valueOf(bkb.u9));
        hashSet.add(Integer.valueOf(bkb.t9));
        hashSet.add(Integer.valueOf(bkb.p9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.n9));
        hashSet.add(Integer.valueOf(bkb.j9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.Z8));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.Hb));
        hashSet.add(Integer.valueOf(bkb.nd));
        hashSet.add(Integer.valueOf(bkb.Nb));
        hashSet.add(Integer.valueOf(bkb.Ad));
        hashSet.add(Integer.valueOf(bkb.ga));
        hashSet.add(Integer.valueOf(bkb.fa));
        hashSet.add(Integer.valueOf(bkb.ea));
        hashSet.add(Integer.valueOf(bkb.da));
        hashSet.add(Integer.valueOf(bkb.Fc));
        hashSet.add(Integer.valueOf(bkb.gf));
        hashSet.add(Integer.valueOf(bkb.Hc));
        hashSet.add(Integer.valueOf(bkb.Gc));
        hashSet.add(Integer.valueOf(bkb.jf));
        hashSet.add(Integer.valueOf(bkb.hf));
        hashSet.add(Integer.valueOf(bkb.ld));
        hashSet.add(Integer.valueOf(bkb.Ze));
        hashSet.add(Integer.valueOf(bkb.kd));
        hashSet.add(Integer.valueOf(bkb.Ye));
        hashSet.add(Integer.valueOf(bkb.Gb));
        hashSet.add(Integer.valueOf(bkb.Ec));
        hashSet.add(Integer.valueOf(bkb.Fb));
        hashSet.add(Integer.valueOf(bkb.Dc));
        hashSet.add(Integer.valueOf(bkb.Kd));
        hashSet.add(Integer.valueOf(bkb.Qb));
        hashSet.add(Integer.valueOf(bkb.Be));
        hashSet.add(Integer.valueOf(bkb.Ae));
        hashSet.add(Integer.valueOf(bkb.Bc));
        hashSet.add(Integer.valueOf(bkb.ze));
        hashSet.add(Integer.valueOf(bkb.Ac));
        hashSet.add(Integer.valueOf(bkb.ye));
        hashSet.add(Integer.valueOf(bkb.zc));
        hashSet.add(Integer.valueOf(bkb.xe));
        hashSet.add(Integer.valueOf(bkb.yc));
        hashSet.add(Integer.valueOf(bkb.we));
        hashSet.add(Integer.valueOf(bkb.xc));
        hashSet.add(Integer.valueOf(bkb.ve));
        hashSet.add(Integer.valueOf(bkb.wc));
        hashSet.add(Integer.valueOf(bkb.ue));
        hashSet.add(Integer.valueOf(bkb.vc));
        hashSet.add(Integer.valueOf(bkb.te));
        hashSet.add(Integer.valueOf(bkb.uc));
        hashSet.add(Integer.valueOf(bkb.se));
        hashSet.add(Integer.valueOf(bkb.tc));
        hashSet.add(Integer.valueOf(bkb.re));
        hashSet.add(Integer.valueOf(bkb.sc));
        hashSet.add(Integer.valueOf(bkb.qe));
        hashSet.add(Integer.valueOf(bkb.rc));
        hashSet.add(Integer.valueOf(bkb.pe));
        hashSet.add(Integer.valueOf(bkb.qc));
        hashSet.add(Integer.valueOf(bkb.oe));
        hashSet.add(Integer.valueOf(bkb.pc));
        hashSet.add(Integer.valueOf(bkb.le));
        hashSet.add(Integer.valueOf(bkb.ne));
        hashSet.add(Integer.valueOf(bkb.me));
        hashSet.add(Integer.valueOf(bkb.ke));
        hashSet.add(Integer.valueOf(bkb.lc));
        hashSet.add(Integer.valueOf(bkb.je));
        hashSet.add(Integer.valueOf(bkb.kc));
        hashSet.add(Integer.valueOf(bkb.ie));
        hashSet.add(Integer.valueOf(bkb.jc));
        hashSet.add(Integer.valueOf(bkb.he));
        hashSet.add(Integer.valueOf(bkb.cc));
        hashSet.add(Integer.valueOf(bkb.bc));
        hashSet.add(Integer.valueOf(bkb.ge));
        hashSet.add(Integer.valueOf(bkb.fe));
        hashSet.add(Integer.valueOf(bkb.dc));
        hashSet.add(Integer.valueOf(bkb.fc));
        hashSet.add(Integer.valueOf(bkb.ec));
        hashSet.add(Integer.valueOf(bkb.ce));
        hashSet.add(Integer.valueOf(bkb.be));
        hashSet.add(Integer.valueOf(bkb.ee));
        hashSet.add(Integer.valueOf(bkb.ic));
        hashSet.add(Integer.valueOf(bkb.de));
        hashSet.add(Integer.valueOf(bkb.ae));
        hashSet.add(Integer.valueOf(bkb.hc));
        hashSet.add(Integer.valueOf(bkb.gc));
        hashSet.add(Integer.valueOf(bkb.Xd));
        hashSet.add(Integer.valueOf(bkb.Wd));
        hashSet.add(Integer.valueOf(bkb.Xb));
        hashSet.add(Integer.valueOf(bkb.Td));
        hashSet.add(Integer.valueOf(bkb.Wb));
        hashSet.add(Integer.valueOf(bkb.Sd));
        hashSet.add(Integer.valueOf(bkb.Rd));
        hashSet.add(Integer.valueOf(bkb.Vb));
        hashSet.add(Integer.valueOf(bkb.Qd));
        hashSet.add(Integer.valueOf(bkb.Ub));
        hashSet.add(Integer.valueOf(bkb.Pd));
        hashSet.add(Integer.valueOf(bkb.Tb));
        hashSet.add(Integer.valueOf(bkb.Od));
        hashSet.add(Integer.valueOf(bkb.Nd));
        hashSet.add(Integer.valueOf(bkb.Ld));
        hashSet.add(Integer.valueOf(bkb.Hd));
        hashSet.add(Integer.valueOf(bkb.Pb));
        hashSet.add(Integer.valueOf(bkb.Gd));
        hashSet.add(Integer.valueOf(bkb.Pc));
        hashSet.add(Integer.valueOf(bkb.Fd));
        hashSet.add(Integer.valueOf(bkb.Ob));
        hashSet.add(Integer.valueOf(bkb.Ed));
        hashSet.add(Integer.valueOf(bkb.md));
        hashSet.add(Integer.valueOf(bkb.Dd));
        hashSet.add(Integer.valueOf(bkb.Cd));
        hashSet.add(Integer.valueOf(bkb.Bd));
        hashSet.add(Integer.valueOf(bkb.zd));
        hashSet.add(Integer.valueOf(bkb.yd));
        hashSet.add(Integer.valueOf(bkb.xd));
        hashSet.add(Integer.valueOf(bkb.wd));
        hashSet.add(Integer.valueOf(bkb.vd));
        hashSet.add(Integer.valueOf(bkb.pa));
        hashSet.add(Integer.valueOf(bkb.q7));
        hashSet.add(Integer.valueOf(bkb.yb));
        hashSet.add(Integer.valueOf(bkb.ud));
        hashSet.add(Integer.valueOf(bkb.td));
        hashSet.add(Integer.valueOf(bkb.Lb));
        hashSet.add(Integer.valueOf(bkb.sd));
        hashSet.add(Integer.valueOf(bkb.rd));
        hashSet.add(Integer.valueOf(bkb.qd));
        hashSet.add(Integer.valueOf(bkb.Kb));
        hashSet.add(Integer.valueOf(bkb.Jb));
        hashSet.add(Integer.valueOf(bkb.pd));
        hashSet.add(Integer.valueOf(bkb.od));
        hashSet.add(Integer.valueOf(bkb.Ib));
        hashSet.add(Integer.valueOf(bkb.jd));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Eb));
        hashSet.add(Integer.valueOf(bkb.Db));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Xc));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.Uc));
        hashSet.add(Integer.valueOf(bkb.cd));
        hashSet.add(Integer.valueOf(bkb.ad));
        hashSet.add(Integer.valueOf(bkb.Zc));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.n8));
        hashSet.add(Integer.valueOf(bkb.m8));
        hashSet.add(Integer.valueOf(bkb.l8));
        hashSet.add(Integer.valueOf(bkb.k8));
        hashSet.add(Integer.valueOf(bkb.j8));
        hashSet.add(Integer.valueOf(bkb.i8));
        hashSet.add(Integer.valueOf(bkb.h8));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.fd));
        hashSet.add(Integer.valueOf(bkb.ed));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.oa));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.A8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        x3a d = x3a.d(messageMedia, this.l6, this.F5, this.m4, null, null, z, i2);
        d.K = Q6();
        d.Q = j;
        d.R = c7();
        d.T = this.y5;
        getSendMessagesHelper().q0(d);
        if (this.g4 == 0) {
            T9(false);
        }
        if (i == 0 || i == 1) {
            z4();
        }
        if (this.I5) {
            this.i6 = true;
        }
    }

    public final void b5(boolean z) {
        if (this.F5 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i < arrayList.size()) {
                    k27 k27Var = (k27) arrayList.get(i);
                    if (k27Var != null && k27Var.e1() == this.F5.e1() && k27.B0(k27Var.k) == k27.B0(this.F5.k)) {
                        this.F5 = k27Var;
                        bu1 bu1Var = this.D5;
                        if (bu1Var != null) {
                            bu1Var.a(k27Var);
                        }
                        if (z) {
                            o27 o27Var = this.x5;
                            if (o27Var != null) {
                                k27 k27Var2 = this.F5;
                                f27 f27Var = this.B5;
                                if (f27Var == null) {
                                    f27Var = M6(k27Var2.c1());
                                }
                                o27Var.f(k27Var2, f27Var, this.l6, this.D5);
                            }
                            w6();
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

    public final void b6() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.Ba);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(gl.L(51.0f));
            this.m1.addView(this.N3, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final du1 b7() {
        du1 du1Var = this.Wc;
        if (du1Var == null) {
            du1 du1Var2 = new du1(this);
            this.Wc = du1Var2;
            return du1Var2;
        }
        return du1Var;
    }

    public final boolean b8() {
        if (U7()) {
            return getMessagesController().D1().e();
        }
        kxb kxbVar = this.g2;
        if (kxbVar == null || !kxbVar.a.f) {
            return false;
        }
        if (!hc2.u0(this.e)) {
            TLRPC.User user = this.f;
            if (!l7c.w(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b9(TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = na7.q1(this.currentAccount).m1(user.id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new zn1(this, tL_attachMenuBot, user, (byte) 1), 66);
    }

    public final void ba(long j, String str, boolean z) {
        ca();
        x31 x31Var = this.Y1;
        if (x31Var != null) {
            x31Var.x1(j, str, z, false);
        }
    }

    public final void bb(defpackage.k27 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.bb(k27):void");
    }

    public final void bc(boolean z) {
        int i;
        if (this.Z3 != null) {
            fm0 fm0Var = this.hd;
            if (fm0Var.f != z) {
                fm0Var.a(z, true);
                if (!z && this.g4 == 7) {
                    t26 t26Var = (t26) this.a4.getLayoutManager();
                    Object E = this.b4.E((t26Var.M0() + t26Var.K0()) / 2);
                    Object E2 = this.b4.E(t26Var.K0());
                    Object E3 = this.b4.E(t26Var.M0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList G = this.D0.G();
                        int K0 = this.C0.K0();
                        int M0 = this.C0.M0();
                        int i2 = ((k27) E).k.id;
                        int i3 = ((k27) E2).k.id;
                        int i4 = ((k27) E3).k.id;
                        int i5 = -1;
                        boolean z2 = false;
                        boolean z3 = false;
                        for (int i6 = 0; i6 < G.size(); i6++) {
                            if (((k27) G.get(i6)).k.id == i3) {
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
                            if (((k27) G.get(i6)).k.id == i4) {
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
                            if (((k27) G.get(i6)).k.id == i2) {
                                i5 = i6;
                            }
                        }
                        if (!z2 && !z3 && i5 != -1) {
                            this.C0.g1(this.D0.K + i5, (this.A0.getHeight() - O6((k27) G.get(i5), true)) / 2);
                        }
                    }
                }
                hn hnVar = this.k3;
                if (hnVar != null) {
                    if (fm0Var.f) {
                        i = 2131745626;
                    } else {
                        i = 2131745625;
                    }
                    hnVar.c(k96.M0(i, null), !k96.a0, true);
                }
                je5 je5Var = this.M1;
                if (je5Var != null && je5Var.W) {
                    je5Var.f(true);
                }
                ks1 ks1Var = this.Q1;
                if (ks1Var != null && ks1Var.W) {
                    ks1Var.f(true);
                }
                ar1 ar1Var = this.a0;
                if (ar1Var != null) {
                    ar1Var.I0();
                }
                cd();
            }
        }
    }

    public final void bd(int i, int i2, int i3) {
        float f;
        int i4;
        boolean z;
        boolean z2;
        dz1 dz1Var = this.y1;
        boolean z3 = false;
        if (dz1Var != null) {
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
            dz1Var.b(6).c = z;
            mv6 mv6Var = dz1Var.e[6];
            if (mv6Var != null) {
                ((pu1) mv6Var.b).b(z, true);
            }
            dz1 dz1Var2 = this.y1;
            if (this.nb) {
                i5 = 1;
            }
            if ((i & i5) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            dz1Var2.b(5).c = z2;
            mv6 mv6Var2 = dz1Var2.e[5];
            if (mv6Var2 != null) {
                ((pu1) mv6Var2.b).b(z2, true);
            }
        }
        this.L3 = i3;
        this.M3 = i2;
        cd();
        hn hnVar = this.k3;
        if (hnVar != null) {
            if (i3 > 0) {
                z3 = true;
            }
            hnVar.setClickable(z3);
            ViewPropertyAnimator animate = this.k3.animate();
            if (i3 > 0) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            animate.alpha(f).start();
        }
    }

    public final void c5() {
        er1 er1Var;
        dr1 dr1Var;
        dr1 dr1Var2;
        ar1 ar1Var = this.a0;
        if (ar1Var != null && ar1Var.p4) {
            MediaController.w().O = false;
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !hc2.v(chat)) {
            MediaController.w().O = false;
        } else if (!a.x && (((er1Var = this.d1) == null || er1Var.getVisibility() != 0) && (((dr1Var = this.T) == null || dr1Var.getVisibility() != 0) && ((dr1Var2 = this.g3) == null || dr1Var2.getVisibility() != 0)))) {
            MediaController.w().O = true;
        } else {
            MediaController.w().O = false;
        }
    }

    public final ArrayList c6(k27 k27Var, boolean z) {
        ArrayList t = tb4.t(k27Var);
        int e1 = k27Var.e1();
        k27Var.A0();
        if (e1 != 0) {
            ArrayList arrayList = this.M6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k27 k27Var2 = (k27) arrayList.get(size);
                if ((k27.B0(k27Var2.k) != this.d7 || k27.B0(k27Var.k) == this.d7) && (((this.h == null && k27Var2.e1() > e1) || (this.h != null && k27Var2.e1() < e1)) && ((k27.Q4(k27Var2.k) || k27Var2.g4()) && !k27Var2.R4() && !k27Var2.f4() && (!z || (k27Var2.k.media_unread && !k27Var2.N3()))))) {
                    t.add(k27Var2);
                }
            }
        }
        return t;
    }

    public final long c7() {
        k27 k27Var;
        TLRPC.Message message;
        k27 k27Var2;
        TLRPC.Message message2;
        if (!hc2.p0(this.e) || !hc2.A(this.currentAccount, this.e, 24)) {
            return 0L;
        }
        long j = this.s4;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0 && (k27Var2 = this.H5) != null && (message2 = k27Var2.k) != null) {
            return cf3.n(message2.saved_peer_id);
        }
        if (i == 0 && (k27Var = this.F5) != null && (message = k27Var.k) != null) {
            return cf3.n(message.saved_peer_id);
        }
        return j;
    }

    public final void c8(int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        int i4;
        ArrayList arrayList = this.M6;
        if (!arrayList.isEmpty()) {
            k27 k27Var = (k27) b00.f(1, arrayList);
            if ((((k27) arrayList.get(0)).k.date >= i && k27Var.k.date <= i) || (k27Var.k.date >= i && this.U6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    k27 k27Var2 = (k27) arrayList.get(size);
                    if (k27Var2.k.date >= i && k27Var2.e1() != 0) {
                        int e1 = k27Var2.e1();
                        if (k27.B0(k27Var2.k) == this.d7) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        J(e1, 0, i4, 0, false, true);
                        return;
                    }
                }
            } else if (!cf3.B(this.l6)) {
                int M0 = this.C0.M0();
                int K0 = this.C0.K0();
                while (true) {
                    if (K0 <= M0) {
                        vs1 vs1Var = this.D0;
                        int i5 = vs1Var.K;
                        if (K0 >= i5 && K0 < vs1Var.L && (message = ((k27) arrayList.get(K0 - i5)).k) != null) {
                            if (message.date < i) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            if (y()) {
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
                this.o9.l(i2);
                hd hdVar = this.Tb;
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                Tc(false);
                hd hdVar2 = new hd(3, this.Ba, getParentActivity());
                this.Tb = hdVar2;
                hdVar2.setOnCancelListener(this.Ja);
                this.Tb.q(1000L);
                int i6 = this.n6;
                this.q9 = i6;
                this.s9 = false;
                this.z6.add(Integer.valueOf(i6));
                this.r9 = 0;
                this.t9 = false;
                na7 messagesController = getMessagesController();
                long j = this.l6;
                long j2 = this.d7;
                int i7 = this.classGuid;
                int i8 = this.g4;
                long j3 = this.s4;
                int i9 = this.C4;
                int i10 = this.n6;
                this.n6 = i10 + 1;
                messagesController.a3(j, j2, false, 30, 0, i, true, 0, i7, 4, i8, j3, i9, i10, this.x4);
                this.m3.setAlpha(0.0f);
                this.m3.setTag(null);
                this.x3 = 0.0f;
                Hc();
                this.n3.setTag(null);
            }
        }
    }

    public final void c9(TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            na7.q1(this.currentAccount).b4(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (h() != null) {
                tLObject2 = h();
            } else {
                tLObject2 = this.e;
            }
            if (!hq6.v(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = this.f;
                if (user2 != null && user2.bot && user.id == tL_attachMenuBot.bot_id) {
                    yjb.x(null, 2131753101, u21.b0(this), null);
                } else if (user2 != null && user2.bot && user.id != tL_attachMenuBot.bot_id) {
                    yjb.x(null, 2131753104, u21.b0(this), null);
                } else if (user2 != null && !user2.bot) {
                    yjb.x(null, 2131753100, u21.b0(this), null);
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !hc2.V(chat)) {
                        yjb.x(null, 2131753102, u21.b0(this), null);
                        return;
                    }
                    TLRPC.Chat chat2 = this.e;
                    if (chat2 != null && hc2.V(chat2)) {
                        yjb.x(null, 2131753103, u21.b0(this), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                ba(user.id, this.C8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                xx xxVar = new xx(getParentActivity());
                xxVar.setColor(bkb.w0(null, bkb.ha, false));
                zkb.h(bkb.K5, null, xxVar);
                xxVar.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                hd hdVar = alertDialog$Builder.a;
                hdVar.W = xxVar;
                hdVar.U = gl.S2(k96.a0("BotRequestAttachPermission", null, 2131752984, l7c.r(user)));
                alertDialog$Builder.j(k96.M0(2131753150, null), new lt(this, user, atomicBoolean, tL_attachMenuBot, (byte) 4));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    ag2 ag2Var = new ag2(5, getResourceProvider(), getParentActivity());
                    ag2Var.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
                    ag2Var.setBackground(bkb.L0(false));
                    ag2Var.setMultiline(true);
                    ag2Var.e(gl.S2(k96.a0(null, null, 2131747587, l7c.r(user))), "", true, false, false);
                    if (k96.a0) {
                        L = gl.L(16.0f);
                    } else {
                        L = gl.L(8.0f);
                    }
                    if (k96.a0) {
                        L2 = gl.L(8.0f);
                    } else {
                        L2 = gl.L(16.0f);
                    }
                    ag2Var.setPadding(L, 0, L2, 0);
                    ag2Var.setOnClickListener(new kb1(ag2Var, atomicBoolean, (byte) 7));
                    hdVar.H = (byte) 6;
                    alertDialog$Builder.n(ag2Var);
                }
                alertDialog$Builder.o();
            } else {
                psc.a(getParentActivity(), new ht(this, user, tL_attachMenuBot, (byte) 9), null);
            }
        }
    }

    public final void ca() {
        boolean z;
        boolean z2;
        if (getParentActivity() != null) {
            ar1 ar1Var = this.a0;
            if (ar1Var == null || TextUtils.isEmpty(ar1Var.getSlowModeTimer())) {
                ar1 ar1Var2 = this.a0;
                if (ar1Var2 != null && ar1Var2.i7.f) {
                    z = true;
                } else {
                    z = false;
                }
                L5();
                x31 x31Var = this.Y1;
                if (!z && this.g4 != 9) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                x31Var.O3 = z2;
                x31Var.d2.h0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.y5 == null) && !z && this.g4 != 9) {
                    if (chat != null && !hc2.N(chat) && this.e.slowmode_enabled) {
                        this.Y1.t1(10, true);
                    } else {
                        this.Y1.t1(-1, true);
                    }
                } else {
                    this.Y1.t1(1, true);
                }
                x31 x31Var2 = this.Y1;
                x31Var2.P2 = true;
                x31Var2.u3.setVisibility(0);
                x31Var2.N2 = (byte) 0;
                x31Var2.z1 = false;
                x31Var2.A1 = false;
                x31Var2.c2 = true;
                x31Var2.D1 = null;
                r7 r7Var = x31Var2.h3;
                if (r7Var != null) {
                    x31Var2.g3.setTranslationY(0.0f);
                    r7Var.setVisibility(8);
                }
                this.Y1.Z0();
                this.Y1.U0().setText(this.a0.getFieldText());
                x31 x31Var3 = this.Y1;
                x31Var3.s1 = this.Ba;
                showDialog(x31Var3);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        lwb lwbVar;
        wx8 wx8Var;
        cw1 cw1Var;
        if ((this.g4 != 5 || (!this.M6.isEmpty() && this.s4 != 0)) && (((lwbVar = this.n0) == null || (lwbVar.y <= 0.0f && !lwbVar.c0)) && !this.y9 && !this.hd.f && this.K9)) {
            ar1 ar1Var = this.a0;
            if (!ar1Var.v3 && ((!ar1Var.d1 || (cw1Var = ar1Var.f1) == null || cw1Var.getVisibility() != 0) && ((!ar1Var.G0() || !ar1Var.m0.w) && !d.hasSheets(ar1Var.F3) && this.ka == 0.0f && ((wx8Var = this.ua) == null || !wx8Var.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(long j) {
        mq1 mq1Var;
        k27 messageObject;
        int a7;
        int abs;
        int i = -1;
        if (this.A0 != null && (mq1Var = this.C0) != null && mq1Var.y < 0) {
            int i2 = 0;
            if (this.W6[0] && mq1Var.K0() == 0) {
                this.F7 = -1;
                return;
            }
            int i3 = Integer.MAX_VALUE;
            for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof gb2) && (messageObject = ((gb2) childAt).getMessageObject()) != null && messageObject.Y1() == j && (abs = Math.abs((a7 = a7(childAt)))) < i3) {
                    i = messageObject.e1();
                    i2 = a7;
                    i3 = abs;
                }
            }
            this.F7 = i;
            this.G7 = i2;
            return;
        }
        this.F7 = -1;
    }

    public final void cc(TLRPC.TL_game tL_game, k27 k27Var, String str, boolean z, long j) {
        String str2;
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
        String str3 = "";
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
            String M0 = k96.M0(2131689472, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (V1 != null) {
                str3 = qu2.m(0, V1.first_name, V1.last_name);
            }
            hdVar.U = k96.a0(null, null, 2131753003, str3);
            alertDialog$Builder.j(k96.M0(2131747638, null), new xn1(this, tL_game, k27Var, str, j));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            return;
        }
        String p = l7c.p(V1);
        if (!gl.O1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (V1 == null || TextUtils.isEmpty(p)) {
                        str2 = "";
                    } else {
                        str2 = p;
                    }
                    presentFragment(new tuc(str, str2, tL_game.title, tL_game.short_name, k27Var));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (V1 != null && p != null) {
            str3 = p;
        }
        tuc.Z(str, k27Var, parentActivity, str6, str3);
    }

    public final void cd() {
        hn hnVar = this.j3;
        if (hnVar != null) {
            boolean z = !k96.a0;
            int i = this.L3;
            if (i < 0) {
                hnVar.c("", z, true);
            } else if (i == 0) {
                hnVar.c(k96.M0(2131747975, null), z, true);
            } else if (this.G3) {
                hnVar.c(k96.G(i, "TaggedMessages", new Object[0]), z, true);
            } else if (this.g4 != 7 && !this.hd.f) {
                hnVar.c(k96.a0(null, null, 2131747636, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z, true);
            } else {
                hnVar.c(k96.G(i, "SearchMessagesResultCount", k96.E(i, ' ')), z, true);
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i;
        if (!this.x4 && (i = this.g4) != 3 && i != 5 && i != 8) {
            return 0L;
        }
        return this.s4;
    }

    public final boolean d5(boolean z, boolean z2) {
        ar1 ar1Var = this.a0;
        if (ar1Var == null || !ar1Var.S0()) {
            return false;
        }
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
            boolean z3 = this.a0.d1;
            hd hdVar = alertDialog$Builder.a;
            if (z3) {
                hdVar.S = k96.M0(2131751383, null);
                hdVar.U = k96.M0(2131751384, null);
            } else {
                hdVar.S = k96.M0(2131751380, null);
                hdVar.U = k96.M0(2131751381, null);
            }
            alertDialog$Builder.j(k96.M0(2131751382, null), new l41((byte) 2, this, z2));
            alertDialog$Builder.g(k96.M0(2131751759, null), null);
            showDialog(hdVar);
            return true;
        }
        return true;
    }

    public final void d6(int i, int i2, boolean z) {
        this.D0.N.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.M6;
            if (i3 >= arrayList.size()) {
                break;
            }
            k27 k27Var = (k27) arrayList.get(i3);
            int i4 = k27Var.k.date;
            if (i4 <= i || i4 >= i2) {
                this.D0.N.add(k27Var);
            }
            i3++;
        }
        jq1 jq1Var = this.A0;
        if (jq1Var != null) {
            jq1Var.setEmptyView(null);
        }
        if (this.D0.N.isEmpty()) {
            gc(true);
        }
        vs1 vs1Var = this.D0;
        vs1Var.M = true;
        vs1Var.J(true);
        b6();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.l6, 81, new rn1(this, i, i2, z), new vm1(this, (byte) 21));
    }

    public final int d7() {
        return this.m1.getBackgroundSizeY();
    }

    public final void d8(m8 m8Var) {
        if (Build.VERSION.SDK_INT >= 30 && m8Var != null && m8Var.isShowing()) {
            View contentView = m8Var.getContentView();
            View rootView = contentView.getRootView();
            final boolean[] zArr = new boolean[1];
            final b87 b87Var = new b87(this, rootView, zArr, m8Var, contentView, (byte) 18);
            rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zArr[0] = false;
                    view.post(b87Var);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
            rootView.addOnLayoutChangeListener(new gk1(b87Var, (byte) 1));
            rootView.requestApplyInsets();
        }
    }

    public final void d9(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = na7.q1(this.currentAccount).m1(user.id);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new pl(this, user, (byte) 14));
                }
            }
        }
    }

    public final void da() {
        xv2.e().T = null;
        if (getParentActivity() == null) {
            return;
        }
        L5();
        this.Y1.d2.h0();
        this.Y1.t1(1, false);
        x31 x31Var = this.Y1;
        x31Var.R3 = true;
        x31Var.Q0(null);
        this.Y1.Z0();
        x31 x31Var2 = this.Y1;
        x31Var2.s1 = this.Ba;
        if (this.visibleDialog != null) {
            x31Var2.show();
        } else {
            showDialog(x31Var2);
        }
    }

    public final void db() {
        int i;
        int i2;
        jq1 jq1Var = this.A0;
        if (jq1Var != null && this.C0 != null) {
            for (int childCount = jq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                i2 = RecyclerView.R(childAt);
                if (i2 >= 0) {
                    if (childAt instanceof gb2) {
                        if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                            i = a7(childAt);
                            break;
                        }
                    } else if (childAt instanceof uk1) {
                        i = a7(childAt);
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

    public final void dc(boolean z) {
        my myVar = this.gc;
        if (z) {
            if (myVar == null) {
                my myVar2 = new my(this, (byte) 14);
                this.gc = myVar2;
                gl.d3(myVar2, 100L);
                return;
            }
            return;
        }
        if (myVar != null) {
            gl.r(myVar);
        }
        this.gc = null;
        this.fc = false;
        Tc(true);
    }

    public final void dd() {
        W5();
        String str = this.J3;
        if (str != null) {
            this.s2.e.setText(k96.a0(null, null, 2131749162, str));
            this.a4.setEmptyView(this.s2);
            return;
        }
        this.a4.setEmptyView(null);
        this.s2.setVisibility(8);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, final Object... objArr) {
        long j;
        k27 k27Var;
        TLRPC.MessageReplies messageReplies;
        k27 k27Var2;
        ui5 ui5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull W1;
        TLRPC.User V1;
        boolean z;
        TLRPC.User V12;
        cq1 cq1Var;
        ar1 ar1Var;
        TLRPC.Chat chat;
        gt3 editField;
        boolean z2;
        boolean z3;
        u0b u0bVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i3;
        ar1 ar1Var2;
        mu1 mu1Var = this;
        if (i == kk7.C) {
            mu1Var.n6(objArr);
            return;
        }
        if (i == kk7.l4) {
            jq1 jq1Var = mu1Var.A0;
            if (jq1Var != null) {
                jq1Var.h1();
            }
            w02 w02Var = mu1Var.ja;
            if (w02Var != null) {
                w02Var.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z4 = false;
            r2 = false;
            boolean z5 = false;
            int i4 = 0;
            if (i == kk7.H) {
                if (((Integer) objArr[0]).intValue() == mu1Var.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        mu1Var.finishFragment();
                        h5.b(mu1Var.currentAccount);
                    }
                }
            } else if (i == kk7.t3) {
                if (objArr.length > 0) {
                    z2 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z2 = false;
                }
                x31 x31Var = mu1Var.Y1;
                if (x31Var != null && x31Var.isShowing()) {
                    mu1Var.Y1.a(true);
                }
                if (z2 && (ar1Var2 = mu1Var.a0) != null && ar1Var2.Q0()) {
                    mu1Var.a0.J0(true);
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
                        Dialog dialog = mu1Var.visibleDialog;
                        if ((dialog instanceof u0b) && (tL_messages_stickerSet = (u0bVar = (u0b) dialog).M1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.id == stickerSet2.id) {
                            u0bVar.M1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (u0bVar.n1 != null) {
                                u0bVar.V0();
                                u0bVar.T0();
                                u0bVar.n1.f();
                            }
                            u0bVar.S0();
                            hq6.d0(u0bVar.a).r1(u0bVar.M1);
                            u0bVar.D0();
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
                                    u21 u21Var = new u21(u0bVar.c, mu1Var.resourceProvider);
                                    if (z3) {
                                        i3 = 2131744607;
                                    } else {
                                        i3 = 2131744608;
                                    }
                                    m21 q = u21Var.q(document, k96.a0(null, null, i3, stickerSet2.title));
                                    q.j = 2750;
                                    q.k(true);
                                }
                            }
                        } else {
                            final u0b u0bVar2 = new u0b(mu1Var.getParentActivity(), mu1Var, tL_inputStickerSetID, null, mu1Var.a0, mu1Var.Ba);
                            final boolean z6 = z3;
                            mu1Var = this;
                            u0bVar2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    mu1.this.P8(objArr, u0bVar2, z6, stickerSet2);
                                }
                            });
                            mu1Var.showDialog(u0bVar2);
                        }
                    }
                }
            } else if (i == kk7.k4) {
                jq1 jq1Var2 = mu1Var.A0;
                if (jq1Var2 != null) {
                    jq1Var2.h1();
                }
                TextView textView = mu1Var.f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i5 = 0; i5 < 2; i5++) {
                    jia jiaVar = mu1Var.S2[i5];
                    if (jiaVar != null) {
                        jiaVar.invalidate();
                    }
                }
                sq1 sq1Var = mu1Var.X1;
                if (sq1Var != null) {
                    sq1Var.getListView().h1();
                }
                fu fuVar = mu1Var.a4;
                if (fuVar != null) {
                    fuVar.h1();
                }
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                ar1 ar1Var3 = mu1Var.a0;
                if (ar1Var3 != null && (editField = ar1Var3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                au1[] au1VarArr = mu1Var.T2;
                au1 au1Var = au1VarArr[0];
                if (au1Var != null) {
                    au1Var.invalidate();
                }
                au1 au1Var2 = au1VarArr[1];
                if (au1Var2 != null) {
                    au1Var2.invalidate();
                }
            } else if (i == kk7.S1) {
                ConnectionsManager.getInstance(i2).getConnectionState();
            } else if (i == kk7.f1) {
                Long l = (Long) objArr[0];
                if (mu1Var.r8 != null && (chat = mu1Var.e) != null && chat.id == l.longValue()) {
                    mu1Var.r8.online_count = ((Integer) objArr[1]).intValue();
                    cq1 cq1Var2 = mu1Var.p1;
                    if (cq1Var2 != null) {
                        cq1Var2.m();
                        mu1Var.p1.n(false);
                    }
                }
            } else if (i == kk7.F) {
                if (((Long) objArr[0]).longValue() == mu1Var.l6 && (ar1Var = mu1Var.a0) != null) {
                    ar1Var.w2(false, true);
                }
            } else if (i == kk7.j3) {
                ar1 ar1Var4 = mu1Var.a0;
                if (ar1Var4 != null) {
                    ar1Var4.x2();
                }
            } else if (i == 2) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i6 = na7.q5;
                int i7 = intValue & 1;
                if (i7 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (mu1Var.e != null) {
                        TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(mu1Var.e.id));
                        if (K0 != null) {
                            mu1Var.e = K0;
                        }
                    } else if (mu1Var.f != null && (V1 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.f.id))) != null) {
                        mu1Var.f = V1;
                    }
                    mu1Var.kd(true);
                }
                if (!mu1Var.a8() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (mu1Var.e != null && (cq1Var = mu1Var.p1) != null) {
                        cq1Var.m();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i7 != 0) {
                    mu1Var.s();
                    mu1Var.ud(false);
                }
                if ((intValue & 64) != 0) {
                    z = true;
                }
                if ((intValue & 8192) != 0 && mu1Var.e != null) {
                    mu1Var.R7();
                    TLRPC.Chat K02 = mu1Var.getMessagesController().K0(Long.valueOf(mu1Var.e.id));
                    if (K02 != null) {
                        mu1Var.e = K02;
                        mu1Var.R7();
                        z = !mu1Var.a8();
                        mu1Var.Dc(false);
                        ar1 ar1Var5 = mu1Var.a0;
                        if (ar1Var5 != null) {
                            ar1Var5.C1(mu1Var.currentAccount, mu1Var.l6);
                        }
                        h24 h24Var = mu1Var.T3;
                        if (h24Var != null) {
                            h24Var.i();
                        }
                    }
                }
                TLRPC.User user = mu1Var.f;
                if (user != null && l7c.w(user) && (V12 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.f.id))) != null) {
                    mu1Var.f = V12;
                }
                if (mu1Var.g2 != null) {
                    boolean D4 = mu1Var.D4();
                    kxb kxbVar = mu1Var.g2;
                    if (kxbVar.c != D4) {
                        kxbVar.setTabsEnabled(D4);
                        if (mu1Var.n0 != null && !mu1Var.b8()) {
                            mu1Var.n0.d();
                        }
                        mu1Var.rd();
                    }
                }
                cq1 cq1Var3 = mu1Var.p1;
                if (cq1Var3 != null && z) {
                    cq1Var3.n(true);
                }
                if ((intValue & 130) != 0) {
                    mu1Var.nd(true);
                }
                r7 r7Var = mu1Var.j0;
                if (r7Var != null) {
                    if (hc2.T(mu1Var.e) && !hc2.p0(mu1Var.e)) {
                        long j2 = mu1Var.e.linked_monoforum_id;
                        if (j2 != 0 && hc2.z(mu1Var.currentAccount, 24, -j2)) {
                            z4 = true;
                        }
                    }
                    r7Var.Q(70, z4);
                }
            } else if (i == 1) {
                fa4.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!mu1Var.mb) {
                    if (longValue == mu1Var.l6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i8 = mu1Var.g4;
                        if (intValue2 != i8 && i8 != 3 && i8 != 8) {
                            if (i8 != 1 && intValue2 == 1 && !mu1Var.isPaused && LaunchActivity.S() == mu1Var && mu1Var.x5 == null && !arrayList.isEmpty() && ((k27) arrayList.get(0)).e1() < 0) {
                                int e1 = ((k27) arrayList.get(0)).e1();
                                if (((k27) arrayList.get(0)).k != null && ((k27) arrayList.get(0)).k.video_processing_pending) {
                                    z5 = true;
                                }
                                mu1Var.pa(e1, z5);
                            }
                            fa4.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !mu1Var.Zc && mu1Var.f != null && mu1Var.a() != mu1Var.getUserConfig().e() && (W1 = mu1Var.getMessagesController().W1(mu1Var.f.id)) != null && W1.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    k27 k27Var3 = (k27) arrayList.get(i4);
                                    if (k27Var3.e1() > 0 && !k27Var3.N3() && !k27Var3.q4()) {
                                        mu1Var.Zc = true;
                                        mu1Var.getMessagesController().Z2(mu1Var.f, mu1Var.classGuid, true, null);
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            mu1Var.Ga(arrayList, true);
                        }
                    } else if (hc2.T(mu1Var.e) && !mu1Var.e.megagroup && (chatFull = mu1Var.r8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            k27 k27Var4 = (k27) arrayList.get(i9);
                            if (k27Var4.d4()) {
                                mu1Var.N6.put(k27Var4.e1(), k27Var4);
                            }
                        }
                        mu1Var.C5();
                    }
                    fa4.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i == kk7.E) {
                mu1Var.N9(true);
            } else if (i == kk7.D) {
                mu1Var.u4();
            } else if (i == kk7.s) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == mu1Var.l6) {
                        mu1Var.finishFragment();
                    }
                } else if (gl.O1() && (ui5Var = mu1Var.parentLayout) != null && ui5Var.getFragmentStack().size() > 1) {
                    mu1Var.finishFragment();
                } else {
                    mu1Var.removeSelfFromStack(true);
                }
            } else if (i == kk7.t) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == mu1Var.a() && (booleanValue2 || mu1Var.parentLayout.getLastFragment() != mu1Var)) {
                    if (mu1Var.parentLayout.getLastFragment() == mu1Var) {
                        mu1Var.finishFragment();
                    } else {
                        mu1Var.removeSelfFromStack(true);
                    }
                }
            } else {
                int i10 = kk7.A;
                SparseArray[] sparseArrayArr = mu1Var.G6;
                if (i == i10) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = mu1Var.e;
                    if (chat2 != null && chat2.id == longValue3 && (k27Var2 = (k27) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && k27Var2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (mu1Var.I5) {
                            jo1 jo1Var = mu1Var.D4;
                            if (jo1Var != null) {
                                gl.r(jo1Var);
                                mu1Var.D4 = null;
                            }
                            k27Var2.k.replies.read_max_id = intValue3;
                        } else {
                            jo1 jo1Var2 = new jo1(mu1Var, k27Var2, intValue3);
                            mu1Var.D4 = jo1Var2;
                            gl.d3(jo1Var2, 500L);
                        }
                    }
                } else if (i == kk7.B) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = mu1Var.e;
                    if (chat3 != null && chat3.id == longValue4 && (k27Var = (k27) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = k27Var.k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer w1 = mu1Var.getMessagesController().w1(hc2.M(mu1Var.e, mu1Var.getMessagesController().L0(mu1Var.e.id), false));
                            int size3 = k27Var.k.replies.recent_repliers.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                } else if (k27.B1(k27Var.k.replies.recent_repliers.get(i11)) == k27.B1(w1)) {
                                    k27Var.k.replies.recent_repliers.remove(i11);
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            k27Var.k.replies.recent_repliers.add(0, w1);
                        }
                        TLRPC.MessageReplies messageReplies2 = k27Var.k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i12 = kk7.z;
                    int i13 = kk7.y;
                    if ((i == i13 || i == i12) && mu1Var.l6 == ((Long) objArr[0]).longValue()) {
                        if (i == i13) {
                            j = ((Integer) objArr[1]).intValue();
                        } else if (i == i12) {
                            j = ((Long) objArr[1]).longValue();
                        } else {
                            j = 0;
                        }
                        long j3 = mu1Var.s4;
                        if (j == j3 || j3 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i14 = mu1Var.A4;
                            ArrayList arrayList2 = mu1Var.M6;
                            if (intValue4 > i14) {
                                mu1Var.A4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i15 = 0; i15 < size4; i15++) {
                                    k27 k27Var5 = (k27) arrayList2.get(i15);
                                    int e12 = k27Var5.e1();
                                    if (!k27Var5.N3() && e12 > 0 && e12 <= mu1Var.A4) {
                                        if (!k27Var5.E4()) {
                                            break;
                                        }
                                        k27Var5.H5();
                                        vs1 vs1Var = mu1Var.D0;
                                        if (vs1Var != null) {
                                            vs1Var.H(k27Var5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > mu1Var.B4) {
                                mu1Var.B4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i16 = 0; i16 < size5; i16++) {
                                    k27 k27Var6 = (k27) arrayList2.get(i16);
                                    int e13 = k27Var6.e1();
                                    if (k27Var6.N3() && e13 > 0 && e13 <= mu1Var.B4) {
                                        if (!k27Var6.E4()) {
                                            break;
                                        }
                                        k27Var6.H5();
                                        vs1 vs1Var2 = mu1Var.D0;
                                        if (vs1Var2 != null) {
                                            vs1Var2.M(k27Var6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        mu1Var.i6(i, objArr);
        mu1Var.j6(i, objArr);
        mu1Var.k6(i, objArr);
        mu1Var.l6(i, objArr);
        mu1Var.m6(i, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        x31 x31Var = this.Y1;
        if (x31Var != null && this.visibleDialog == x31Var) {
            x31Var.d2.b0(false);
            this.Y1.I();
            this.Y1.d2.f0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.ya && !(dialog instanceof ow0) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e5() {
        if (!this.wc) {
            this.wc = true;
            if (!this.xc && this.g4 == 0 && !getMessagesController().D1().b && getMessagesController().D1().c() > 2) {
                if (this.K1 != null && na7.c1().getInt("savedhint", 0) < 1) {
                    this.K1.v();
                    this.xc = true;
                    na7.c1().edit().putInt("savedhint", na7.c1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", na7.c1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && na7.c1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.v();
                    this.xc = true;
                    na7.c1().edit().putInt("savedsearchhint", na7.c1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    f5();
                }
            }
        }
    }

    public final void e6(gb2 gb2Var, k27 k27Var, CharacterStyle characterStyle, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        boolean z5;
        boolean z6;
        gb2 gb2Var2;
        CharacterStyle characterStyle2;
        int i;
        k27 k27Var2;
        int i2;
        TLRPC.WebPage webPage;
        int i3;
        int i4;
        cs5 J = cs5.J(this, gb2Var);
        tq9 tq9Var = new tq9(getParentActivity(), this.Ba);
        J.p = new zk1(tq9Var, (byte) 0);
        if (!str.startsWith("video?") && !d01.g(Uri.parse(str), false, null)) {
            z = true;
        } else {
            z = false;
        }
        boolean N2 = getMessagesController().N2(str);
        if (N2 && z) {
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
            z4 = z2;
            z5 = z3;
            z6 = z;
            gb2Var2 = gb2Var;
            characterStyle2 = characterStyle;
            i = 2131232270;
        } else {
            if (z2 && !z3) {
                i3 = 2131231929;
            } else {
                i3 = 2131232270;
            }
            if (z2 && !z3) {
                i4 = 2131747598;
            } else {
                i4 = 2131747624;
            }
            String M0 = k96.M0(i4, null);
            int i5 = i3;
            z6 = z;
            str2 = "mailto:";
            i = 2131232270;
            zo6 zo6Var = new zo6(this, str, characterStyle, k27Var, gb2Var, z2, z3, (byte) 2);
            z5 = z3;
            characterStyle2 = characterStyle;
            z4 = z2;
            gb2Var2 = gb2Var;
            J.b(i5, M0, zo6Var, false);
        }
        if ((z4 && !z5) || startsWith) {
            J.b(i, k96.M0(2131747600, null), new al1(this, str, (byte) 0), false);
        } else if (!startsWith && !z5 && !z4 && z6 && !N2) {
            J.b(2131231929, k96.M0(2131747598, null), new al1(this, str, (byte) 1), false);
        }
        TLRPC.MessageMedia m1 = k27.m1(k27Var);
        if ((m1 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m1.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            k27Var2 = k27Var;
            J.b(2131231838, k96.M0(2131747597, null), new bl1(this, k27Var2, (byte) 0), false);
        } else {
            k27Var2 = k27Var;
        }
        if (z5) {
            i2 = 2131751751;
        } else if (startsWith) {
            i2 = 2131751749;
        } else {
            i2 = 2131751750;
        }
        J.b(2131232108, k96.M0(i2, null), new rg(this, str, k27Var2, startsWith, (byte) 4), false);
        if (N2 && !z5 && !startsWith && !str.startsWith("tg:")) {
            J.b(2131232509, k96.M0(2131742678, null), new al1(this, str, (byte) 2), false);
        }
        tq9Var.e(J);
        if (str.startsWith(str2)) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            tq9Var.f(gb2Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof i4c) {
            String d = d01.d(((i4c) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204).concat("…");
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            tq9Var.f(gb2Var2, characterStyle2, spannableString2, false);
        } else {
            tq9Var.f(gb2Var2, characterStyle2, null, false);
        }
        showDialog(tq9Var);
    }

    public final float e7(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.m1.getBackgroundTranslationY()) - ((1.0f - this.U9) * this.P9);
    }

    public final boolean e8(org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.e8(org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public final void e9(java.lang.String r9, android.text.style.CharacterStyle r10, defpackage.k27 r11, defpackage.gb2 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.e9(java.lang.String, android.text.style.CharacterStyle, k27, gb2, int, int):void");
    }

    public final void ea(final CharacterStyle characterStyle, final String str, boolean z, final gb2 gb2Var, final k27 k27Var) {
        TLRPC.Message message;
        if (z) {
            int i = -1;
            if (str.startsWith("@")) {
                if (gb2Var != null) {
                    gb2Var.i3(-1);
                }
                String substring = str.substring(1);
                op1 P9 = P9(gb2Var, characterStyle);
                TLObject a2 = getMessagesController().a2(substring);
                jl1 jl1Var = new jl1(this, P9, gb2Var, substring, characterStyle);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                P9.b = new ml1(this, getConnectionsManager().sendRequest(checkusername, new fn0(this, a2, jl1Var, substring, P9, (byte) 4)), (byte) 4);
                P9.d();
                return;
            } else if (characterStyle == null) {
                fx0 fx0Var = new fx0(1, (wjb) this.Ba, (Context) getParentActivity(), false);
                fx0Var.K();
                if (str.startsWith("video?")) {
                    i = Utilities.z(str).intValue();
                }
                final int i2 = i;
                if (i2 >= 0) {
                    fx0Var.P = gl.g0(i2, false, false);
                    fx0Var.Q = false;
                } else {
                    fx0Var.P = d01.d(str, true);
                    fx0Var.Q = false;
                    fx0Var.R = true;
                }
                CharSequence[] charSequenceArr = (R7() || !(k27Var == null || (message = k27Var.k) == null || !message.noforwards)) ? new CharSequence[]{k96.M0(2131747624, null)} : new CharSequence[]{k96.M0(2131747624, null), k96.M0(2131751755, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        mu1.this.e9(str, characterStyle, k27Var, gb2Var, i2, i3);
                    }
                };
                fx0Var.M = charSequenceArr;
                fx0Var.L = onClickListener;
                fx0Var.I0 = new n1(gb2Var, (byte) 12);
                showDialog(fx0Var);
                return;
            } else {
                if (gb2Var != null) {
                    gb2Var.i3(-1);
                }
                e6(gb2Var, k27Var, characterStyle, str);
                return;
            }
        }
        O9(k27Var, false, false);
        String c = d01.c(str);
        if (c != null) {
            String lowerCase = c.toLowerCase();
            if (!hc2.O(lowerCase, this.e) && !l7c.t(lowerCase, this.f)) {
                if (str.startsWith("@")) {
                    getMessagesController().A3(lowerCase, this, 0, P9(gb2Var, characterStyle));
                    return;
                } else {
                    Ea(0, str, characterStyle, gb2Var, false);
                    return;
                }
            }
            cq1 cq1Var = this.p1;
            if (cq1Var != null) {
                cq1Var.e(false, false);
            } else {
                Fb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Ea(0, str, characterStyle, gb2Var, false);
        } else {
            int i3 = this.g4;
            if (i3 != 1 && i3 != 2 && i3 != 7) {
                if (str.contains("@")) {
                    presentFragment(new tc5(str, this.resourceProvider));
                    return;
                } else {
                    ia(str, false);
                    return;
                }
            }
            this.n9.m(str);
            if (this.g4 != 7) {
                finishFragment();
            }
        }
    }

    public final boolean eb() {
        ar1 ar1Var = this.a0;
        if (ar1Var != null && ar1Var.T0() && !this.a0.d1 && !MediaController.w().F()) {
            this.o5 = true;
            ar1 ar1Var2 = this.a0;
            this.p5 = ar1Var2.P;
            this.q5 = ar1Var2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void ec(gb2 gb2Var, int i, int i2, int i3) {
        if (!this.C2.W || this.Mb != gb2Var || this.Nb != i3) {
            k27 messageObject = gb2Var.getMessageObject();
            if (messageObject != null && (k27.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k27.m1(messageObject);
                if (k27.V4(tL_messageMediaPoll) && !k27.T4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        this.C2.t(k96.M0(2131746966, null));
                        this.Mb = gb2Var;
                        this.Nb = i3;
                        this.C2.w(o7(gb2Var, i2), p7(gb2Var, i3), true);
                    }
                }
            }
            if (i == -1) {
                this.C2.t(k96.M0(2131746965, null));
                this.Mb = gb2Var;
                this.Nb = i3;
                this.C2.w(o7(gb2Var, i2), p7(gb2Var, i3), true);
            }
        }
    }

    public final void ed() {
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
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.extendActionMode(android.view.Menu):boolean");
    }

    @Override
    public final TLRPC.Chat f() {
        return this.e;
    }

    public final void f5() {
        gb2 gb2Var;
        je5 je5Var;
        boolean z;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        je5 je5Var2 = this.M1;
        if (je5Var2 != null && !je5Var2.W && !this.zc && this.wc && !this.hd.f && System.currentTimeMillis() - this.yc > 1800 && na7.c1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof gb2) {
                        gb2Var = (gb2) childAt;
                        i19 i19Var = gb2Var.O;
                        k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.k) == null || (tL_messageReactions = message.reactions) == null) {
                            z = false;
                        } else {
                            z = tL_messageReactions.reactions_as_tags;
                        }
                        if (z && !i19Var.s.isEmpty()) {
                            gb2Var.getLocationInWindow(iArr);
                            float f = iArr[1] + i19Var.c;
                            if (f >= gl.L(240.0f) && f <= (gl.q.y - gl.L(25.0f)) - gl.n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    gb2Var = null;
                    break;
                }
            }
            if (gb2Var != null) {
                i19 i19Var2 = gb2Var.O;
                this.zc = true;
                gb2Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - je5Var.getTop()) - gl.L(120.0f)) + i19Var2.c);
                this.M1.o(0.0f, (((f19) i19Var2.s.get(0)).z / 2.0f) + (-gl.L(16.0f)) + iArr[0] + i19Var2.b);
                this.M1.v();
                na7.c1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            gl.r(new my(this, (byte) 25));
            gl.d3(new my(this, (byte) 25), 2000L);
        }
    }

    public final void f6(CharacterStyle characterStyle, boolean z, k27 k27Var, gb2 gb2Var) {
        Object[] objArr;
        int i;
        TLRPC.WebPage webPage;
        boolean z2;
        int i2;
        k27 k27Var2;
        k27 k27Var3;
        k27 k27Var4;
        TLRPC.WebPage webPage2;
        k27 k27Var5;
        gb2 gb2Var2;
        k27 messageObject;
        ArrayList arrayList;
        f27 f27Var;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z3 = true;
            boolean z4 = true;
            char c = 1;
            char c2 = 1;
            if (!R7() && (k27Var == null || (message = k27Var.k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            gb2 gb2Var3 = null;
            if (characterStyle instanceof f4c) {
                if (objArr == null || a() == 489000) {
                    f4c f4cVar = (f4c) characterStyle;
                    gl.g(f4cVar.a.subSequence(f4cVar.b, f4cVar.c).toString());
                    b6();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z && gb2Var != null) {
                    gb2Var.i3(-1);
                }
            } else if (characterStyle instanceof j4c) {
                TLRPC.User V1 = getMessagesController().V1(Utilities.A(((j4c) characterStyle).getURL()));
                if (V1 != null) {
                    na7.q1(this.currentAccount).B3(V1, null, this, 0);
                }
                if (z && gb2Var != null) {
                    gb2Var.i3(-1);
                }
                O9(k27Var, false, false);
            } else if (characterStyle instanceof im4) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((im4) characterStyle).b;
                if (tL_messageEntityFormattedDate == null || (messageObject = gb2Var.getMessageObject()) == null) {
                    gb2Var2 = gb2Var;
                } else {
                    if (messageObject.c1() != 0 && (f27Var = (f27) this.P6.f(messageObject.c1())) != null) {
                        arrayList = f27Var.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = tb4.t(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e = getUserConfig().e();
                    String A = k96.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    cs5 J = cs5.J(this, gb2Var);
                    tq9 tq9Var = new tq9(getParentActivity(), this.Ba);
                    J.p = new zk1(tq9Var, (byte) 0);
                    J.b(2131232108, k96.M0(2131746139, null), new el1(this, tq9Var, A, (byte) 0), false);
                    gb2Var2 = gb2Var;
                    J.b(2131232082, k96.M0(2131746140, null), new i87(this, J, messageObject, gb2Var, A, tL_messageEntityFormattedDate, tq9Var, (byte) 5), false);
                    J.b(2131232267, k96.M0(2131746138, null), new fl1(this, J, e, tL_messageEntityFormattedDate, arrayList2, tq9Var, (byte) 0), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    tq9Var.e(J);
                    tq9Var.f(gb2Var2, characterStyle, spannableString, false);
                    showDialog(tq9Var);
                }
                if (gb2Var2 != null) {
                    gb2Var2.i3(-1);
                }
            } else if (characterStyle instanceof g4c) {
                String url = ((g4c) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    g6(gb2Var, characterStyle, url.substring(4));
                    if (z && gb2Var != null) {
                        gb2Var.i3(-1);
                        return;
                    }
                    return;
                }
                SparseArray[] sparseArrayArr = this.G6;
                if (k27Var != null) {
                    if (url.startsWith("/")) {
                        if (d4c.h) {
                            ar1 ar1Var = this.a0;
                            TLRPC.Chat chat = this.e;
                            if (chat == null || !chat.megagroup) {
                                z4 = false;
                            }
                            ar1Var.B1(k27Var, url, z, z4);
                            if (!z && this.a0.getFieldText() == null) {
                                w7(false);
                            }
                        }
                        if (z && gb2Var != null) {
                            gb2Var.i3(-1);
                            return;
                        }
                        return;
                    } else if (url.startsWith("video") && !z) {
                        int intValue = Utilities.z(url).intValue();
                        if (k27Var.d5()) {
                            webPage2 = k27Var.k.media.webpage;
                            k27Var4 = k27Var;
                        } else {
                            k27 k27Var6 = k27Var.C;
                            if (k27Var6 != null && k27Var6.d5()) {
                                k27Var4 = k27Var.C;
                                webPage2 = k27Var4.k.media.webpage;
                            } else {
                                k27Var4 = k27Var;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            ou3.I0(this, k27Var4, this.db, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, Q7());
                            return;
                        }
                        if (!k27.K4(k27Var4.k) && (k27Var5 = k27Var4.C) != null) {
                            if (k27.B0(k27Var5.k) == this.l6) {
                                c = 0;
                            }
                            k27 k27Var7 = (k27) sparseArrayArr[c].get(k27Var4.C.e1());
                            if (k27Var7 == null) {
                                k27Var4 = k27Var4.C;
                            } else {
                                k27Var4 = k27Var7;
                            }
                        } else {
                            gb2Var3 = gb2Var;
                        }
                        k27Var4.c0 = intValue / ((float) k27Var4.L0());
                        ma(gb2Var3, k27Var4);
                        return;
                    }
                }
                if (k27Var != null && url.startsWith("audio")) {
                    int intValue2 = Utilities.z(url).intValue();
                    if (!k27Var.I3() && (k27Var3 = k27Var.C) != null) {
                        if (k27.B0(k27Var3.k) == this.l6) {
                            c2 = 0;
                        }
                        k27Var2 = (k27) sparseArrayArr[c2].get(k27Var.C.e1());
                    } else {
                        k27Var2 = k27Var;
                    }
                    if (k27Var2 != null) {
                        float f = intValue2;
                        float L0 = f / ((float) k27Var2.L0());
                        MediaController mediaController = getMediaController();
                        if (mediaController.D(k27Var2)) {
                            k27Var2.b0 = L0;
                            mediaController.h0(k27Var2, L0);
                            if (mediaController.C()) {
                                mediaController.R(k27Var2);
                            }
                        } else {
                            k27Var2.c0 = f / ((float) k27Var2.L0());
                            mediaController.R(k27Var2);
                        }
                        if (z && gb2Var != null) {
                            gb2Var.i3(-1);
                        }
                        if (!k27.Q4(k27Var2.k)) {
                            showDialog(new i20(getParentActivity(), this.Ba));
                        }
                    }
                } else if (url.startsWith("tonaddress:")) {
                    String substring = url.substring(11);
                    c C = c.C(this.currentAccount);
                    boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                    TLRPC.User[] userArr = new TLRPC.User[1];
                    z2a z2aVar = new z2a(this, gb2Var, isValidAddress, substring, userArr, characterStyle);
                    if (isValidAddress) {
                        op1 P9 = P9(gb2Var, characterStyle);
                        boolean[] zArr = {false};
                        if (P9 != null) {
                            P9.b = new il1(zArr, (byte) 0);
                            P9.d();
                        }
                        C.h0(new jl1(this, zArr, P9, userArr, z2aVar, (byte) 0), substring);
                    } else {
                        z2aVar.run();
                    }
                    if (gb2Var != null) {
                        gb2Var.i3(-1);
                    }
                } else if (url.startsWith("card:")) {
                    String substring2 = url.substring(5);
                    op1 P92 = P9(gb2Var, characterStyle);
                    TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                    tL_payments_getBankCardData.number = substring2;
                    P92.b = new ml1(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new fn0(this, P92, gb2Var, substring2, characterStyle, (byte) 3), null, null, 0, getMessagesController().r3, 1, true), (byte) 2);
                    P92.d();
                    gb2Var.i3(-1);
                } else {
                    ea(characterStyle, url, z, gb2Var, k27Var);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    g6(gb2Var, characterStyle, url2.substring(4));
                } else if (z) {
                    e6(gb2Var, k27Var, characterStyle, url2);
                    if (gb2Var != null) {
                        gb2Var.i3(-1);
                    }
                } else {
                    O9(k27Var, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        d01.t(parentActivity, url2);
                        return;
                    }
                    boolean z5 = characterStyle instanceof i4c;
                    if ((z5 && (url2 == null || !url2.startsWith("mailto:"))) || gl.D3(url2)) {
                        if (k27Var != null) {
                            i2 = k27Var.e1();
                        } else {
                            i2 = 0;
                        }
                        if (ja(url2, gb2Var, characterStyle, i2, 1)) {
                            return;
                        }
                    } else {
                        if (k27Var != null) {
                            TLRPC.MessageMedia messageMedia = k27Var.k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = k27Var.k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || d01.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                                        createArticleViewer(false).L(k27Var, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (k27Var != null) {
                            i = k27Var.e1();
                        } else {
                            i = 0;
                        }
                        if (!ja(url2, gb2Var, characterStyle, i, 1)) {
                            z3 = z5;
                        } else {
                            return;
                        }
                    }
                    if (d01.z(url2)) {
                        z2 = false;
                    } else {
                        z2 = z3;
                    }
                    Ea(2, url2, characterStyle, gb2Var, z2);
                }
            }
        }
    }

    public final float f7() {
        kxb kxbVar = this.g2;
        if (kxbVar != null) {
            return kxbVar.getSideMenuT();
        }
        return 0.0f;
    }

    public final void f8(int i, int i2, int i3, int i4) {
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
                    na7 messagesController = getMessagesController();
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
                    messagesController.a3(j2, j3, false, 50, i6, 0, z2, i7, i8, 0, i9, j4, i10, i11, this.x4);
                } else {
                    c = 0;
                    j = 0;
                    na7 messagesController2 = getMessagesController();
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
                    messagesController2.a3(j5, j6, false, 50, 0, 0, z3, i12, i13, 0, i14, j7, i15, i16, this.x4);
                }
            } else {
                c = 0;
                j = 0;
                if (this.d7 != 0 && !zArr[1]) {
                    this.Y6 = true;
                    arrayList.add(Integer.valueOf(this.n6));
                    na7 messagesController3 = getMessagesController();
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
                    messagesController3.a3(j8, 0L, false, 50, i17, 0, z4, i18, i19, 0, i20, j9, i21, i22, this.x4);
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
                na7 messagesController4 = getMessagesController();
                long j10 = this.d7;
                int i24 = iArr4[1];
                int i25 = iArr3[1];
                int i26 = this.classGuid;
                int i27 = this.g4;
                long j11 = this.s4;
                int i28 = this.C4;
                int i29 = this.n6;
                this.n6 = i29 + 1;
                messagesController4.a3(j10, 0L, false, 50, i24, 0, true, i25, i26, 1, i27, j11, i28, i29, this.x4);
                this.a8 = true;
            } else if (!zArr3[c]) {
                arrayList.add(Integer.valueOf(this.n6));
                na7 messagesController5 = getMessagesController();
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
                messagesController5.a3(j12, j13, false, 50, i30, 0, true, i31, i32, 1, i33, j14, i34, i35, this.x4);
                this.a8 = true;
            }
        }
    }

    public final void f9(long j, boolean z) {
        if (!this.V4.isEmpty()) {
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
            edit.putInt("pin_" + this.l6, ((Integer) this.V4.get(0)).intValue()).commit();
            this.V4.clear();
            this.X4.clear();
            this.Z4 = 0;
            this.d5 = 0;
            this.e5 = 0;
            Uc(0, true);
        }
        if (hc2.p0(this.e) && hc2.A(this.currentAccount, this.e, 24)) {
            if (j != 0) {
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new sa7(messagesStorage, -this.e.id, j, (byte) 1));
                getMessagesController().e0(j, 0, getMessagesController().h1(-this.e.id));
                getMessagesController().g4.s(this.e.id, j);
            }
        } else {
            getMessagesController().T(1, this.l6, z);
            ad7 messagesStorage2 = getMessagesStorage();
            long j2 = this.l6;
            messagesStorage2.getClass();
            messagesStorage2.H(new ua7(messagesStorage2, j2, (byte) 2));
            pub pubVar = getMessagesController().g4;
            pubVar.getClass();
            gl.c3(new ko2((Object) pubVar, -this.l6, true, (byte) 4));
        }
        this.e6.put(j, 0);
        kxb kxbVar = this.g2;
        if (kxbVar != null) {
            kxbVar.setAllTopicsHidden(false);
        }
        if (j == this.s4) {
            E5(false, null);
            this.D0.J(false);
        }
    }

    public final void fa(long j, final k27 k27Var, int i, final long j2, final int i2, final int i3, final k27 k27Var2) {
        int i4 = i;
        final TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = na7.j1(K0);
        tL_messages_getDiscussionMessage.msg_id = i4;
        if (w01.a) {
            fa4.b("getDiscussionMessage chat = " + K0.id + " msg_id = " + i4);
        }
        this.Qc = 0;
        this.Rc = false;
        this.Tc = null;
        this.Uc = null;
        jq1 jq1Var = this.A0;
        if (jq1Var != null) {
            jq1Var.h1();
        }
        if (this.Pc != -1) {
            getConnectionsManager().cancelRequest(this.Pc, false);
        }
        if (this.Oc != -1) {
            getConnectionsManager().cancelRequest(this.Oc, false);
        }
        if (k27Var2 != null) {
            i4 = k27Var2.e1();
        }
        this.Qc = i4;
        this.Rc = false;
        this.Sc = System.currentTimeMillis();
        jq1 jq1Var2 = this.A0;
        if (jq1Var2 != null) {
            jq1Var2.h1();
        }
        final int i5 = this.Mc + 1;
        this.Mc = i5;
        this.Oc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final mu1 mu1Var = mu1.this;
                final int i6 = i5;
                final int i7 = i2;
                final long j3 = j2;
                final int i8 = i3;
                final k27 k27Var3 = k27Var2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = K0;
                final k27 k27Var4 = k27Var;
                gl.c3(new aj1(mu1Var, new Runnable(i6, i7, j3, tLObject, i8, k27Var3, tL_messages_getDiscussionMessage2, chat, k27Var4) {
                    public final int b;
                    public final int c;
                    public final TLObject d;
                    public final int e;
                    public final k27 f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat n;
                    public final k27 r;

                    {
                        this.d = tLObject;
                        this.e = i8;
                        this.f = k27Var3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.n = chat;
                        this.r = k27Var4;
                    }

                    @Override
                    public final void run() {
                        int i9;
                        final mu1 mu1Var2 = mu1.this;
                        if (this.b != mu1Var2.Mc) {
                            return;
                        }
                        mu1Var2.Oc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            mu1Var2.Tc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            mu1Var2.getMessagesController().b4(mu1Var2.Tc.users, false);
                            mu1Var2.getMessagesController().V3(mu1Var2.Tc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = mu1Var2.Tc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i10 = 0; i10 < mu1Var2.Tc.messages.size(); i10++) {
                                TLRPC.Message message = mu1Var2.Tc.messages.get(i10);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i11 = this.c;
                        final int i12 = this.e;
                        final k27 k27Var5 = this.f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.n;
                        final k27 k27Var6 = this.r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = mu1Var2.getMessagesController().k1(message2.peer_id);
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
                            final int i13 = mu1Var2.Nc + 1;
                            mu1Var2.Nc = i13;
                            mu1Var2.Pc = mu1Var2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    gl.c3(new ao1(mu1.this, i13, tLObject3, tL_error2, i11, k27Var5, tL_messages_getDiscussionMessage3, chat2, i12, k27Var6, (byte) 0));
                                }
                            });
                            return;
                        }
                        mu1Var2.Fa(mu1Var2.Tc, mu1Var2.Uc, i11, k27Var5, tL_messages_getDiscussionMessage3, chat2, i12, k27Var6);
                    }
                }, (byte) 11));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Oc, this.classGuid);
    }

    public final int fb(defpackage.k27 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.fb(k27):int");
    }

    public final void fc(boolean z) {
        double d;
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= na7.q1(this.currentAccount).k4.j2.f() * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!y6c.h(this.currentAccount).p() && !na7.q1(this.currentAccount).F3()) {
                int i3 = this.currentAccount;
                if (z) {
                    d = na7.q1(i3).k4.p3.i;
                } else {
                    d = na7.q1(i3).k4.q3.i;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(((float) d) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    u21 b0 = u21.b0(this);
                    if (z) {
                        i = 2131743563;
                    } else {
                        i = 2131751336;
                    }
                    String M0 = k96.M0(i, null);
                    if (z) {
                        i2 = 2131743562;
                    } else {
                        i2 = 2131751335;
                    }
                    m21 I = b0.I(2131624205, M0, gl.G2(gl.N2(k96.M0(i2, null), -1, 2, new rl1(this, z, (byte) 0), null), spannableString, "%d"));
                    I.j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void fd(String str) {
        if (this.g4 == 7 && !TextUtils.equals(this.J3, str)) {
            W5();
            bc(true);
            this.J3 = str;
            this.I3 = str;
            X4(false);
            D5(true);
            this.f7 = 0L;
            this.C7 = false;
            cd5.a(this.currentAccount).b(this.d4).a();
            this.b4.f();
            this.a4.requestLayout();
            if (this.a4.getLayoutManager() != null) {
                this.a4.getLayoutManager().m0(0);
            }
            dd();
            this.s2.e(true, true);
            G6();
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        m8 m8Var = this.g9;
        if (m8Var != null) {
            m8Var.e = false;
            G5(true);
        }
    }

    public final void g5(boolean z) {
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
            vs1 vs1Var = this.D0;
            if (vs1Var.O) {
                int i6 = vs1Var.F;
                if (i6 >= 0 && i4 >= 0 && i6 >= i4 && i6 <= i3) {
                    getMediaDataController().Q0();
                    return;
                }
                return;
            }
            final int b = vs1Var.b();
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
                    cd5 a = cd5.a(this.currentAccount);
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
            gl.c3(new Runnable() {
                @Override
                public final void run() {
                    mu1.this.f8(b, i4, i2, i7);
                }
            });
        }
    }

    public final void g6(gb2 gb2Var, CharacterStyle characterStyle, String str) {
        op1 P9 = P9(gb2Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().l0.get(p38.h(str, false));
        yt0 yt0Var = new yt0(this, gb2Var, str, tL_contact, characterStyle, (byte) 3);
        if (tL_contact != null) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(tL_contact.user_id));
            if (V1 != null) {
                yt0Var.a(V1);
                return;
            } else {
                getMessagesStorage().a.c(new fv0(this, tL_contact, yt0Var, (byte) 25));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = p38.h(str, false);
        P9.b = new ml1(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new en0(this, P9, yt0Var, (byte) 15)), (byte) 0);
        P9.d();
    }

    public final int g7() {
        return (int) (f7() * gl.L(71.0f));
    }

    public final void g8(nj njVar, Runnable runnable) {
        if (!this.isFinished) {
            if (nj.n(gta.u(this.currentAccount, njVar.a).m()).b < njVar.b) {
                oj ojVar = njVar.a;
                if (ojVar == oj.a) {
                    new zua(getParentActivity(), getResourceProvider(), njVar.a(), 13, mm4.i(this.currentAccount, a()), null, a()).show();
                    return;
                } else if (ojVar == oj.b) {
                    new xdb(getParentActivity(), getResourceProvider(), njVar, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void g9(TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j;
        TLRPC.User user = this.X1.getAdapter().x0;
        int i = this.currentAccount;
        TLRPC.User user2 = this.f;
        if (user2 != null) {
            j = user2.id;
        } else {
            j = this.e.id;
        }
        quc b = quc.b(i, j, user.id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, c7(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
            return;
        }
        String C1 = na7.q1(this.currentAccount).C1(user.restriction_reason);
        if (!TextUtils.isEmpty(C1)) {
            na7.q1(this.currentAccount);
            na7.X4(C1, this);
            return;
        }
        ow0 ow0Var = new ow0(getParentActivity(), getResourceProvider());
        ow0Var.B(false);
        ow0Var.C0 = true;
        ow0Var.m0 = getParentActivity();
        ow0Var.x(this, b);
        ow0Var.show();
    }

    public final void ga(boolean z) {
        CharSequence M0;
        if (!R7() && !s7()) {
            int i = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.o6;
                    if (i3 >= sparseArrayArr[i2].size()) {
                        break;
                    }
                    k27 k27Var = (k27) sparseArrayArr[i2].valueAt(i3);
                    if (k27Var.C4()) {
                        i = 3;
                    } else if (k27Var.S3()) {
                        if (k27Var.Y3()) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        if (i == 2) {
                            break;
                        }
                    } else if (k27Var.z3()) {
                        z2 = true;
                    }
                    i3++;
                }
                if (i == 2) {
                    break;
                }
            }
            fd2 fd2Var = this.va;
            if (fd2Var != null && fd2Var.d()) {
                this.va.setHiddenByScroll(true);
            }
            Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
            j.putInt("messagesCount", this.u6);
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            j.putBoolean("canSelectTopics", true);
            cj3 cj3Var = new cj3(j);
            cj3Var.E2 = this;
            presentFragment(cj3Var);
            return;
        }
        if (R7()) {
            if (a() > 0) {
                M0 = k96.M0(2131750517, null);
            } else if (hc2.T(this.e) && !this.e.megagroup) {
                M0 = k96.M0(2131750519, null);
            } else {
                M0 = k96.M0(2131750518, null);
            }
        } else {
            M0 = k96.M0(2131750520, null);
        }
        if (z) {
            je5 je5Var = this.z2;
            if (je5Var == null) {
                int indexOfChild = this.m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    je5Var = s4(310.0f, 1, indexOfChild + 1, false);
                    this.z2 = je5Var;
                } else {
                    return;
                }
            }
            je5Var.t(M0);
            this.z2.x(this.actionBar.getActionMode().j(11), true);
            return;
        }
        je5 je5Var2 = this.A2;
        if (je5Var2 == null) {
            int indexOfChild2 = this.m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            je5Var2 = s4(310.0f, 3, indexOfChild2 + 1, false);
            this.A2 = je5Var2;
        }
        je5Var2.t(M0);
        this.A2.x(this.e1.getForwardButton(), true);
    }

    public final void gb() {
        hb(false, null);
    }

    public final void gc(boolean z) {
        if (this.R != null) {
            if (!gl.O1() && !this.v4 && this.f == null) {
                Boolean bool = this.Ib;
                if (bool == null) {
                    bool = Boolean.valueOf(e66.e(360928));
                    this.Ib = bool;
                }
                if (bool.booleanValue()) {
                    this.Hb = z;
                    return;
                }
            }
            int i = 0;
            if (this.g6 && gba.c()) {
                if (z == this.Hb) {
                    return;
                }
                this.Hb = z;
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
                this.R.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new lp1(this, (byte) 3)).start();
                return;
            }
            this.Hb = z;
            FrameLayout frameLayout2 = this.R;
            if (!z) {
                i = 4;
            }
            frameLayout2.setVisibility(i);
        }
    }

    public final void gd() {
        ar1 ar1Var;
        if (this.T != null) {
            this.H0.setBackground(null);
            this.H0.setOnClickListener(null);
            boolean z = true;
            if (this.g4 == 3 && X6() == 2666000) {
                this.H0.setText(k96.M0(2131753879, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                Oc();
                dbb dbbVar = this.s1;
                if (dbbVar != null) {
                    dbbVar.e();
                }
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null && !hc2.n(chat)) {
                    TLRPC.Chat chat2 = this.e;
                    if (!hc2.p(chat2) && !hc2.u(chat2) && !hc2.s(chat2) && !hc2.v(chat2) && !hc2.l(chat2) && !hc2.o(chat2) && !hc2.t(chat2)) {
                        TLRPC.Chat chat3 = this.e;
                        if (!chat3.gigagroup && (!hc2.T(chat3) || this.e.megagroup)) {
                            TLRPC.Chat chat4 = this.e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (hc2.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231129).mutate();
                                    int i = bkb.Ei;
                                    mutate.setTint(getThemedColor(i));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i);
                                    mutate.setBounds(0, 0, gl.L(14.0f), gl.L(14.0f));
                                    fm2 fm2Var = new fm2(null, mutate, gl.L(-6.0f), gl.L(-6.0f));
                                    int L = gl.L(14.0f);
                                    int L2 = gl.L(14.0f);
                                    fm2Var.e = L;
                                    fm2Var.f = L2;
                                    int L3 = gl.L(14.0f);
                                    int L4 = gl.L(14.0f);
                                    fm2Var.h = L3;
                                    fm2Var.n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ".concat(k96.M0(2131753578, null)));
                                    spannableStringBuilder.setSpan(new cm4(i, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(fm2Var, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i2 = bkb.h6;
                                    zkb.R(textView, bkb.g0(0, bkb.w0(null, i2, false)), null, zkb.M(i2), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new kl1(this, (byte) 0));
                                } else {
                                    this.H0.setText(k96.M0(2131749359, null));
                                }
                            } else {
                                boolean B1 = gl.B1(chat4.banned_rights);
                                TextView textView2 = this.H0;
                                if (B1) {
                                    textView2.setText(k96.M0(2131745405, null));
                                } else {
                                    textView2.setText(k96.a0("SendMessageRestricted", null, 2131745406, k96.v(this.e.banned_rights.until_date)));
                                }
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            Oc();
                            dbb dbbVar2 = this.s1;
                            if (dbbVar2 != null) {
                                dbbVar2.e();
                            }
                        }
                    }
                }
                N5(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(k96.M0(2131751117, null));
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        de9.r("AwaitingEncryption", null, 2131753754, new Object[]{b00.j(new StringBuilder("<b>"), this.f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(k96.M0(2131751116, null));
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
                    c5();
                    K4(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.s1 != null && (ar1Var = this.a0) != null && ar1Var.H0()) {
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
                    gl.t1(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final pi5 getBackButtonState() {
        return pi5.a;
    }

    @Override
    public final rs3 getEdgeToEdgeSupportMode() {
        return rs3.c;
    }

    @Override
    public final fc2 getGroupCall() {
        fc2 fc2Var;
        if (this.g4 == 0 && (fc2Var = this.o8) != null && (fc2Var.b instanceof TLRPC.TL_groupCall)) {
            return fc2Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.g4 == 2) {
            ArrayList arrayList = this.M6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.L(80.0f) + O6((k27) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public wjb getResourceProvider() {
        return this.Ba;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        jia jiaVar;
        jia jiaVar2;
        View view;
        t14 t14Var;
        t14 t14Var2;
        t14 t14Var3;
        t14 t14Var4;
        t14 t14Var5;
        t14 t14Var6;
        t14 t14Var7;
        t14 t14Var8;
        t14 t14Var9;
        t14 t14Var10;
        t14 t14Var11;
        t14 t14Var12;
        View view2;
        if (this.w7) {
            return null;
        }
        int i = 0;
        if (this.xa) {
            this.xa = false;
            return null;
        }
        t00 t00Var = new t00(this, (byte) 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.De));
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ee));
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Fe));
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ge));
        T7();
        arrayList.add(new blb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.F8));
        arrayList.add(new blb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.E8));
        cq1 cq1Var = this.p1;
        if (cq1Var != null) {
            jiaVar = cq1Var.getTitleTextView();
        } else {
            jiaVar = null;
        }
        arrayList.add(new blb(jiaVar, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.z8));
        cq1 cq1Var2 = this.p1;
        if (cq1Var2 != null) {
            jiaVar2 = cq1Var2.getTitleTextView();
        } else {
            jiaVar2 = null;
        }
        int i2 = bkb.A8;
        arrayList.add(new blb(jiaVar2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        cq1 cq1Var3 = this.p1;
        if (cq1Var3 != null) {
            view = cq1Var3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new blb(i2, view));
        arrayList.add(new blb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i3 = bkb.C8;
        arrayList.add(new blb(aVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.w8));
        m17 m17Var = (m17) getThemedDrawable("drawableMsgIn");
        m17 m17Var2 = (m17) getThemedDrawable("drawableMsgInMedia");
        m17 m17Var3 = (m17) getThemedDrawable("drawableMsgInSelected");
        m17 m17Var4 = (m17) getThemedDrawable("drawableMsgInMediaSelected");
        m17 m17Var5 = (m17) getThemedDrawable("drawableMsgOut");
        m17 m17Var6 = (m17) getThemedDrawable("drawableMsgOutMedia");
        m17 m17Var7 = (m17) getThemedDrawable("drawableMsgOutSelected");
        m17 m17Var8 = (m17) getThemedDrawable("drawableMsgOutMediaSelected");
        if (m17Var != null) {
            Drawable[] drawableArr = m17Var.A;
            int i4 = bkb.sa;
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, drawableArr, (alb) null, i4));
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, m17Var2.A, (alb) null, i4));
            Drawable[] drawableArr2 = m17Var5.A;
            int i5 = bkb.sb;
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, drawableArr2, (alb) null, i5));
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, m17Var6.A, (alb) null, i5));
        }
        if (!this.Ba.p(false)) {
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{m17Var5, m17Var6}, (alb) null, bkb.tb));
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{m17Var5, m17Var6}, (alb) null, bkb.ub));
            arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{m17Var5, m17Var6}, (alb) null, bkb.vb));
        }
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{m17Var7, m17Var8}, (alb) null, bkb.Rc));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.gd));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.hd));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ud));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yb));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vd));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zb));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ac));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.mc));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.oc));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.nc));
        arrayList.add(new blb(this.A0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ff));
        this.Ba.getClass();
        dr1 dr1Var = this.g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i6 = bkb.Ie;
        arrayList.add(new blb(dr1Var, 0, (Class[]) null, themedPaint, (Drawable[]) null, (alb) null, i6));
        arrayList.add(new blb(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (alb) null, i6));
        arrayList.add(new blb(this.a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (alb) null, bkb.Nl));
        arrayList.add(new blb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Pe));
        arrayList.add(new blb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qe));
        arrayList.add(new blb(this.a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (alb) null, bkb.ag));
        arrayList.add(new blb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.dg));
        ar1 ar1Var = this.a0;
        int i7 = bkb.cg;
        arrayList.add(new blb(ar1Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i7));
        arrayList.add(new blb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i7));
        arrayList.add(new blb(this.a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (alb) null, bkb.eg));
        arrayList.add(new blb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (alb) null, bkb.Tf));
        arrayList.add(new blb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Wf));
        ar1 ar1Var2 = this.a0;
        if (ar1Var2 != null) {
            t14Var = ar1Var2.getEmojiView();
        } else {
            t14Var = null;
        }
        arrayList.add(new blb(t14Var, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Bf));
        ar1 ar1Var3 = this.a0;
        if (ar1Var3 != null) {
            t14Var2 = ar1Var3.getEmojiView();
        } else {
            t14Var2 = null;
        }
        arrayList.add(new blb(t14Var2, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Cf));
        ar1 ar1Var4 = this.a0;
        if (ar1Var4 != null) {
            t14Var3 = ar1Var4.getEmojiView();
        } else {
            t14Var3 = null;
        }
        arrayList.add(new blb(t14Var3, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Df));
        ar1 ar1Var5 = this.a0;
        if (ar1Var5 != null) {
            t14Var4 = ar1Var5.getEmojiView();
        } else {
            t14Var4 = null;
        }
        arrayList.add(new blb(t14Var4, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Ff));
        ar1 ar1Var6 = this.a0;
        if (ar1Var6 != null) {
            t14Var5 = ar1Var6.getEmojiView();
        } else {
            t14Var5 = null;
        }
        arrayList.add(new blb(t14Var5, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Gf));
        ar1 ar1Var7 = this.a0;
        if (ar1Var7 != null) {
            t14Var6 = ar1Var7.getEmojiView();
        } else {
            t14Var6 = null;
        }
        arrayList.add(new blb(t14Var6, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.If));
        ar1 ar1Var8 = this.a0;
        if (ar1Var8 != null) {
            t14Var7 = ar1Var8.getEmojiView();
        } else {
            t14Var7 = null;
        }
        arrayList.add(new blb(t14Var7, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Jf));
        ar1 ar1Var9 = this.a0;
        if (ar1Var9 != null) {
            t14Var8 = ar1Var9.getEmojiView();
        } else {
            t14Var8 = null;
        }
        arrayList.add(new blb(t14Var8, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Nf));
        ar1 ar1Var10 = this.a0;
        if (ar1Var10 != null) {
            t14Var9 = ar1Var10.getEmojiView();
        } else {
            t14Var9 = null;
        }
        arrayList.add(new blb(t14Var9, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Ef));
        ar1 ar1Var11 = this.a0;
        if (ar1Var11 != null) {
            t14Var10 = ar1Var11.getEmojiView();
        } else {
            t14Var10 = null;
        }
        arrayList.add(new blb(t14Var10, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Af));
        ar1 ar1Var12 = this.a0;
        if (ar1Var12 != null) {
            t14Var11 = ar1Var12.getEmojiView();
        } else {
            t14Var11 = null;
        }
        arrayList.add(new blb(t14Var11, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Lf));
        ar1 ar1Var13 = this.a0;
        if (ar1Var13 != null) {
            t14Var12 = ar1Var13.getEmojiView();
        } else {
            t14Var12 = null;
        }
        arrayList.add(new blb(t14Var12, 0, new Class[]{t14.class}, (String[]) null, (Drawable[]) null, t00Var, bkb.Hf));
        ar1 ar1Var14 = this.a0;
        if (ar1Var14 != null) {
            p1c trendingStickersAlert = ar1Var14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.S());
            }
            arrayList.add(new blb((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.a0.getStickersArrowDrawable()}, (alb) null, bkb.Ml));
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (i8 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new blb(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.vj));
        }
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Of));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Pf));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qf));
        arrayList.add(new blb(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.u7));
        arrayList.add(new blb(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (alb) null, bkb.t7));
        arrayList.add(new blb(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (alb) null, bkb.z7));
        arrayList.add(new blb(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.x7));
        arrayList.add(new blb(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.c6));
        NumberTextView numberTextView = this.U2;
        int i9 = bkb.Ve;
        arrayList.add(new blb(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i9));
        ImageView imageView = this.h3;
        int i10 = bkb.y8;
        arrayList.add(new blb(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i10));
        arrayList.add(new blb(this.i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i10));
        arrayList.add(new blb(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yc));
        arrayList.add(new blb(this.A0, 131072, new Class[]{ke2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (alb) null, bkb.wf));
        s71 s71Var = this.S;
        int i11 = bkb.bd;
        arrayList.add(new blb(s71Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i11));
        arrayList.add(new blb(this.q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i11));
        arrayList.add(new blb(this.n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i11));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.J6));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Lc));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.kg));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.lg));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Jh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Lh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Mh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Nh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Oh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ph));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Rh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Th));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Uh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ai));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Wh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Xh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ic));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.sk));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.uk));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.tk));
        int i12 = bkb.vk;
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i12));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i12));
        xy1 xy1Var = this.Ca;
        if (xy1Var != null) {
            arrayList.add(new blb(xy1Var.g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i9));
            arrayList.add(new blb(xy1Var.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Te));
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((blb) obj).n = this.Ba;
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
        return bkb.T0(str);
    }

    public TLRPC.User h() {
        return this.f;
    }

    public final void h5(k27 k27Var) {
        if (k27Var.D == 4 && !this.H8) {
            boolean z = gba.a;
            if (!na7.c1().contains("mapPreviewType")) {
                this.H8 = true;
                ij.p0(getParentActivity(), this.currentAccount, new my(this, (byte) 13), true, this.Ba);
            }
        }
    }

    public final void h6(defpackage.hf0 r30, final org.telegram.tgnet.TLRPC.ReactionCount r31, boolean r32, float r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.h6(hf0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final r7 h7() {
        r7 r7Var = this.m0;
        if (r7Var != null && r7Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final void h8(TLRPC.Document document) {
        this.L4.put(document, 0);
        z3a.B(this.currentAccount).t0(document, null, this.l6, null, null, null, this.D5, null, true, 0, 0, false, null, Q6(), 0L, c7(), this.y5);
    }

    public final void h9(final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i, k27 k27Var, int i2, int i3, k27 k27Var2) {
        boolean z;
        int i4;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i5 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            this.Rc = true;
            this.A0.h1();
            Bundle bundle = new Bundle();
            final long B0 = k27.B0(((k27) arrayList.get(0)).k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("historyPreloaded", z);
            mu1 mu1Var = new mu1(bundle);
            mu1Var.Db(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i != 0) {
                mu1Var.d8 = i;
            }
            if (k27Var != null && (messageReplies = k27Var.k.replies) != null && (messageReplies2 = mu1Var.m4.k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (k27Var != null && (tL_messageReactions = k27Var.k.reactions) != null) {
                mu1Var.m4.k.reactions = tL_messageReactions;
            }
            tn6 tn6Var = new tn6(this, new boolean[]{false}, i2, mu1Var, (byte) 13);
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
                final int classGuid = mu1Var.getClassGuid();
                kk7.f(this.currentAccount).a(new np1(this, classGuid, tn6Var, mu1Var), kk7.C);
                final int i7 = i4;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i8;
                        int i9;
                        mu1 mu1Var2 = mu1.this;
                        na7 messagesController = mu1Var2.getMessagesController();
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
                        messagesController.N3(messages_messages2, size2, B0, 0L, 30, i8, 0, false, classGuid, i5, 0, 0, 0, i11, true, 0, ((k27) b00.f(1, arrayList)).e1(), 1, false, 0, true, mu1Var2.x4, null);
                    }
                });
                return;
            }
            tn6Var.run();
            return;
        }
        this.Qc = 0;
        this.Rc = false;
        this.A0.h1();
        if (k27Var2 != null) {
            la(k27Var2);
        } else if (getParentActivity() != null) {
            u21.b0(this).t(k96.M0(2131752318, null), this.Ba).j();
        }
    }

    public final void ha(int i) {
        boolean z;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        k27 k27Var;
        o27 o27Var = this.x5;
        if (o27Var != null && this.cb == null) {
            TLRPC.Peer peer = null;
            if (o27Var.c != null) {
                int i2 = this.currentAccount;
                TLRPC.WebPage webPage = this.Y5;
                CharSequence fieldText = this.a0.getFieldText();
                k27 k27Var2 = this.F5;
                if (k27Var2 == this.m4) {
                    k27Var = null;
                } else {
                    k27Var = k27Var2;
                }
                o27Var.e(i2, webPage, fieldText, k27Var, this.D5, this.H5);
            }
            if (!this.x5.c()) {
                this.Eb = this.a0.p3;
                Context context = this.m1.getContext();
                kl0 kl0Var = this.Q8;
                o27 o27Var2 = this.x5;
                TLRPC.User user = this.f;
                TLRPC.Chat chat = this.e;
                int i3 = this.currentAccount;
                ku1 ku1Var = this.Ba;
                bu1 bu1Var = this.D5;
                if (bu1Var != null && bu1Var.f) {
                    z = true;
                } else {
                    z = false;
                }
                wr1 wr1Var = new wr1(this, context, this, kl0Var, o27Var2, user, chat, i3, ku1Var, i, z);
                this.cb = wr1Var;
                this.x5.x = wr1Var;
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ea) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ea.peers.get(0).peer;
                }
                this.cb.setSendAsPeer(peer);
                j5();
                this.m1.addView(this.cb);
                if (this.Eb) {
                    ar1 ar1Var = this.a0;
                    ar1Var.U0 = true;
                    wx1 wx1Var = ar1Var.V0;
                    if (wx1Var != null) {
                        wx1Var.t(true);
                    }
                    this.a0.V1();
                    this.S3 = true;
                }
                gl.g3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void hb(boolean z, my myVar) {
        ArrayList arrayList;
        int i;
        if (this.A0.W1) {
            return;
        }
        this.b5 = 0;
        this.Ub = 0;
        this.c5 = false;
        this.o9.l(0);
        if (this.W6[0] && this.Z7 == 0 && this.M7 == 0) {
            this.y1.d(false);
            if (this.C0.H0() == 0) {
                this.D9 = false;
                Rc();
                Sa();
                ud(false);
                return;
            }
            this.D0.O();
            xt1 xt1Var = this.jb;
            xt1Var.a = null;
            int i2 = 0;
            while (true) {
                arrayList = this.M6;
                if (i2 >= arrayList.size() || !((k27) arrayList.get(i2)).q4()) {
                    break;
                }
                i2++;
                z = false;
            }
            if (z && arrayList != null && !arrayList.isEmpty() && arrayList.get(i2) != null) {
                long c1 = ((k27) arrayList.get(i2)).c1();
                while (c1 != 0 && (i = i2 + 1) < arrayList.size() && c1 == ((k27) arrayList.get(i)).c1()) {
                    i2 = i;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i2 = Math.min(i2, arrayList.size() - 1);
            }
            gr1 gr1Var = this.o9;
            xt1Var.b = i2;
            xt1Var.d = 0;
            boolean z2 = !z;
            xt1Var.c = z2;
            gr1Var.k(i2, 0, z2, true);
            this.D9 = false;
            Rc();
            return;
        }
        hd hdVar = this.Tb;
        if (hdVar != null) {
            hdVar.dismiss();
        }
        Tc(false);
        if (myVar != null) {
            myVar.run();
        } else {
            Wa();
            hd hdVar2 = new hd(3, this.Ba, getParentActivity());
            this.Tb = hdVar2;
            hdVar2.setOnCancelListener(this.Ja);
            this.Tb.q(1000L);
        }
        this.q9 = this.n6;
        this.s9 = false;
        this.r9 = 0;
        this.t9 = false;
        ArrayList arrayList2 = this.z6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.n6));
        gl.d3(new wl1(this, (byte) 16), 0L);
    }

    public final void hc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = k96.M0(2131752645, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752646, null);
        alertDialog$Builder.j(k96.M0(2131746128, null), new yk1(this, (byte) 10));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(hdVar);
    }

    public final void hd() {
        boolean z;
        int i;
        int i2;
        c27 c27Var;
        int i3 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.o6;
        if (i3 == 0) {
            ArrayList<k27> arrayList = new ArrayList<>();
            for (int i4 = 0; i4 < sparseArrayArr.length; i4++) {
                for (int i5 = 0; i5 < sparseArrayArr[i4].size(); i5++) {
                    k27 k27Var = (k27) sparseArrayArr[i4].valueAt(i5);
                    if (k27Var.z2()) {
                        f27 n7 = n7(k27Var);
                        if (n7 != null) {
                            c27Var = n7.d(k27Var);
                        } else {
                            c27Var = null;
                        }
                        if (c27Var != null) {
                            if (!c27Var.h) {
                            }
                        }
                    }
                    arrayList.add(k27Var);
                }
            }
            sr1 sr1Var = this.Bb;
            if (sr1Var != null) {
                sr1Var.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Bb.getSelectedReactions().isEmpty();
                z = !isEmpty;
                sr1 sr1Var2 = this.Bb;
                if (isEmpty) {
                    i2 = 2131745680;
                } else {
                    i2 = 2131745679;
                }
                sr1Var2.setHint(k96.M0(i2, null));
                gl.d3(new my(this, (byte) 15), 120L);
            } else {
                z = !t09.f(arrayList).isEmpty();
            }
            r7 j = this.actionBar.q(null).j(28);
            if (j != null) {
                if (z) {
                    i = 2131231902;
                } else {
                    i = 2131231904;
                }
                ry8 ry8Var = j.y;
                if (ry8Var != null && j.E != i) {
                    j.E = i;
                    gl.L3(ry8Var, i);
                }
            }
        }
        if (this.va != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                arrayList2.add((k27) sparseArray.valueAt(i6));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                arrayList2.add((k27) sparseArray2.valueAt(i7));
            }
            this.va.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        k27 k27Var = this.m4;
        if (k27Var != null && k27Var.M1() == 0 && hc2.n(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.i5(boolean):void");
    }

    public final void i6(int r34, java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.i6(int, java.lang.Object[]):void");
    }

    public final k27 i7() {
        View view = this.v9;
        if (view instanceof gb2) {
            return ((gb2) view).getMessageObject();
        }
        if (view instanceof uk1) {
            return ((uk1) view).getMessageObject();
        }
        return null;
    }

    public final void i8(TLRPC.Document document) {
        this.L4.put(document, 0);
        z3a.B(this.currentAccount).t0(document, null, this.l6, null, null, null, this.D5, null, true, 0, 0, false, null, Q6(), 0L, c7(), this.y5);
    }

    public final void i9(long j, long j2) {
        wp0.b(this.currentAccount).h(j, j2, false);
        this.rc = null;
    }

    public final void ia(String str, boolean z) {
        boolean z2;
        xq1 xq1Var;
        r7 r7Var;
        int i;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                W5();
                je5 je5Var = this.K1;
                if (je5Var != null && je5Var.W) {
                    je5Var.f(true);
                    z2 = true;
                } else {
                    z2 = false;
                }
                je5 je5Var2 = this.L1;
                if (je5Var2 != null && je5Var2.W) {
                    je5Var2.f(true);
                    z2 = true;
                }
                if (z2) {
                    gl.d3(new al1(this, str, (byte) 7), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                X4(true);
                if (!this.actionBar.o0) {
                    this.id.a(true, true);
                    r7 r7Var2 = this.j0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                    q6 q6Var = this.g0;
                    if (q6Var != null) {
                        q6Var.e(8);
                    }
                    fq2 fq2Var = this.f0;
                    if (fq2Var != null) {
                        fq2Var.b(false);
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
                    bd(0, 0, -1);
                    Dc(false);
                }
                lr1 lr1Var = this.D1;
                if (lr1Var != null && lr1Var.F > 0.5f) {
                    lr1Var.g(false);
                }
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z && (!hc2.V(this.e) || !hc2.t0(this.e) || this.J3 == null)) {
                    this.G1 = (byte) 0;
                } else {
                    this.G1 = (byte) 2;
                }
                this.k5 = false;
                int i2 = this.d4;
                int i3 = this.currentAccount;
                if (i2 == 3) {
                    cd5.a(i3).b(3).a();
                } else {
                    cd5 a = cd5.a(i3);
                    a.b.a();
                    a.c.a();
                }
                vq1 vq1Var = this.F1;
                if (vq1Var != null) {
                    vq1Var.h.clear();
                }
                r7 r7Var6 = this.k0;
                if (r7Var6 != null) {
                    this.Lc = true;
                    r7Var6.G(false);
                    this.Lc = false;
                }
                r7 r7Var7 = this.k0;
                if (r7Var7 != null) {
                    r7Var7.setSearchFieldCaption(null);
                    this.k0.P(str, false);
                    this.k0.setSearchFieldHint(k96.M0(2131745571, null));
                }
                getMediaDataController().Z1(this.I3, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, false, this.F3);
                Uc(0, true);
                this.s2.e(true, true);
                bc(true);
                xq1 xq1Var2 = this.E1;
                if (xq1Var2 != null) {
                    xq1Var2.b(!contains);
                    dd();
                }
                if ((contains || z) && this.J3 != null && (xq1Var = this.E1) != null) {
                    int currentPosition = xq1Var.a.getCurrentPosition();
                    byte b = this.G1;
                    if (currentPosition != b) {
                        this.E1.a.e(b, b);
                    }
                }
                cd5.a(this.currentAccount).c(this.J3);
                this.I1.f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof uu1) {
                    ((uu1) currentView).a.fd(this.J3);
                }
            }
        }
    }

    public final void ib(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.ib(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void ic() {
        String str;
        if (this.kc != null) {
            return;
        }
        if (this.F5 != null) {
            str = getMessagesController().a1(this.F5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = k96.M0(2131743572, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.a0(null, null, 2131743573, str));
        alertDialog$Builder.j(k96.M0(2131751323, null), new yk1(this, (byte) 19));
        alertDialog$Builder.g(k96.M0(2131752577, null), new yk1(this, (byte) 20));
        hdVar.setOnDismissListener(new cl1(this, (byte) 8));
        this.kc = alertDialog$Builder.o();
    }

    public final void id() {
        dz1 dz1Var;
        q6 q6Var;
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            if (this.g4 != 1 && !this.v4 && !X7()) {
                dz1Var = null;
            } else {
                dz1Var = this.y1;
            }
            ar1Var.setSideButtonsForAttach(dz1Var);
            boolean X7 = X7();
            if (this.yb != X7) {
                this.yb = X7;
                r7 r7Var = this.j0;
                if ((r7Var != null && r7Var.getVisibility() == 0) || ((q6Var = this.g0) != null && q6Var.l == 0)) {
                    org.telegram.ui.ActionBar.a aVar = this.actionBar;
                    if (!aVar.o0 && !aVar.y()) {
                        if (this.a0.H0() && TextUtils.isEmpty(this.a0.getSlowModeTimer()) && !X7()) {
                            q6 q6Var2 = this.g0;
                            if (q6Var2 != null) {
                                q6Var2.e(0);
                            }
                            r7 r7Var2 = this.j0;
                            if (r7Var2 != null) {
                                r7Var2.setVisibility(8);
                            }
                            fq2 fq2Var = this.f0;
                            if (fq2Var != null) {
                                fq2Var.b(true);
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
                            fq2 fq2Var2 = this.f0;
                            if (fq2Var2 != null) {
                                fq2Var2.b(false);
                            }
                        }
                        cq1 cq1Var = this.p1;
                        if (cq1Var != null) {
                            cq1Var.l0 = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z;
        int w0;
        if (T7()) {
            wjb resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w0 = resourceProvider.f(bkb.v8);
            } else {
                w0 = bkb.w0(null, bkb.v8, true);
            }
            if (bm2.h(w0) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z = bkb.I.o();
        } else {
            z = this.hc;
        }
        return !z;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        lwb lwbVar;
        wr1 wr1Var;
        wx8 wx8Var;
        if ((this.g4 == 5 && (this.M6.isEmpty() || this.s4 == 0)) || (((lwbVar = this.n0) != null && (lwbVar.y > 0.0f || lwbVar.c0)) || this.y9 || this.hd.f || !this.K9 || (((wr1Var = this.cb) != null && wr1Var.s) || ((wx8Var = this.ua) != null && wx8Var.a())))) {
            return false;
        }
        return true;
    }

    public final void j5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.j5():void");
    }

    public final void j6(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.j6(int, java.lang.Object[]):void");
    }

    public final int j7(int i) {
        SparseIntArray sparseIntArray = this.j5;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 == -1) {
            int i3 = pd;
            pd = i3 + 1;
            sparseIntArray.put(i, i3);
            return i3;
        }
        return i2;
    }

    public final void j8(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            jva.m1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public final void j9(k27 k27Var, Long l, Runnable runnable) {
        gta.v(this.currentAccount, false).j0(k27Var, l.longValue(), runnable, false);
    }

    public final boolean ja(String str, gb2 gb2Var, CharacterStyle characterStyle, int i, int i2) {
        mu1 mu1Var;
        ql1 ql1Var;
        boolean z;
        mu1 mu1Var2;
        Integer num;
        int parseInt;
        int i3;
        Integer num2;
        TLRPC.TL_forumTopic f;
        if (this.e == null || str == null || this.g4 != 0) {
            return false;
        }
        if (gb2Var != null && (characterStyle != null || i2 != 1)) {
            mu1Var = this;
            ql1Var = new ql1(mu1Var, i, i2, characterStyle, gb2Var);
        } else {
            mu1Var = this;
            ql1Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (hc2.K(mu1Var.e, false) != null) {
                try {
                    if (qd == null) {
                        qd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        rd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = qd.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z = false;
                        try {
                            if (hc2.O(matcher.group(2), mu1Var.e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g = ud8.g(parse);
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
                                if (hc2.c0(mu1Var.e) && i3 != mu1Var.d()) {
                                    return false;
                                }
                                mu1Var.L7 = true;
                                if (mu1Var.g4 == 2) {
                                    mu1Var.n9.p(parseInt);
                                    mu1Var.finishFragment();
                                    return true;
                                }
                                int U = LaunchActivity.U(parse);
                                mu1Var.Q7 = U;
                                if (U >= 0) {
                                    mu1Var.R7 = parseInt;
                                }
                                mu1Var.ib(parseInt, i, true, 0, false, 0, num, g, ql1Var);
                                return true;
                            }
                            mu1Var2 = mu1Var;
                        } catch (Exception e) {
                            e = e;
                            fa4.g(e, true);
                            return z;
                        }
                    } else {
                        mu1Var2 = mu1Var;
                        z = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = rd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (hc2.O(matcher2.group(2), mu1Var2.e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        mu1Var2.y8 = queryParameter2;
                                        mu1Var2.U4(true);
                                        return true;
                                    }
                                    return z;
                                }
                                return z;
                            }
                            return z;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            return z;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (hc2.O(lowerCase, mu1Var2.e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (mu1Var2.g4 == 2) {
                            mu1Var2.n9.p(intValue3);
                            mu1Var2.finishFragment();
                            return true;
                        }
                        mu1Var2.ib(intValue3, i, true, 0, false, 0, null, null, ql1Var);
                        return true;
                    }
                    return z;
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                }
            } else {
                mu1 mu1Var3 = mu1Var;
                try {
                    Pattern pattern = sd;
                    if (pattern == null) {
                        pattern = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                        sd = pattern;
                    }
                    Matcher matcher3 = pattern.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt2 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != mu1Var3.e.id || parseInt2 == 0) {
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
                    byte[] g2 = ud8.g(parse3);
                    if (intValue6 != 0 || intValue7 != 0 || intValue8 != 0) {
                        return false;
                    }
                    if (hc2.c0(mu1Var3.e) && (f = mu1Var3.getMessagesController().g4.f(parseLong, parseInt2)) != null) {
                        TLRPC.TL_forumTopic tL_forumTopic = mu1Var3.r4;
                        if (tL_forumTopic == null || tL_forumTopic.id != f.id) {
                            return false;
                        }
                        return true;
                    }
                    mu1Var3.L7 = true;
                    if (mu1Var3.g4 == 2) {
                        mu1Var3.n9.p(parseInt2);
                        mu1Var3.finishFragment();
                        return true;
                    }
                    mu1Var3.ib(parseInt2, i, true, 0, false, 0, num2, g2, ql1Var);
                    return true;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.z(parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.A(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.z(parse4.getQueryParameter("thread")).intValue();
            long j = mu1Var.e.id;
            if (longValue != j || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                fa(j, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            mu1 mu1Var4 = mu1Var;
            mu1Var4.L7 = true;
            if (mu1Var4.g4 == 2) {
                mu1Var4.n9.p(intValue9);
                mu1Var4.finishFragment();
                return true;
            }
            mu1Var4.ib(intValue9, i, true, 0, false, 0, null, null, ql1Var);
            return true;
        }
    }

    public final void jb(java.lang.CharSequence r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.jb(java.lang.CharSequence, boolean):void");
    }

    public final void jc(View view, CharSequence charSequence, boolean z) {
        je5 je5Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z || ((je5Var = this.B2) != null && je5Var.W)) {
                this.B2.t(gl.S2(k96.a0("SlowModeHint", null, 2131745119, charSequence)));
                if (z) {
                    this.B2.x(view, true);
                }
            }
        }
    }

    public final void jd(boolean z, boolean z2) {
        boolean z3;
        k27 k27Var;
        lkc lkcVar;
        if (this.fragmentView != null && !this.I5) {
            int childCount = this.A0.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = this.A0.getChildAt(i);
                    if (childAt instanceof uk1) {
                        uk1 uk1Var = (uk1) childAt;
                        k27 messageObject = uk1Var.getMessageObject();
                        if (this.d8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.d8 && uk1Var.V()) {
                            nkc nkcVar = uk1Var.J0;
                            if (!nkcVar.h0 && (nkcVar.e0 == 0 || (lkcVar = nkcVar.d0) == null || lkcVar.c())) {
                                nkcVar.e();
                                lkc lkcVar2 = nkcVar.d0;
                                lkcVar2.v = 600L;
                                lkcVar2.b = -1L;
                                lkcVar2.c = -1L;
                                nkcVar.e0 = SystemClock.elapsedRealtime();
                                nkcVar.f0 = false;
                                nkcVar.a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof gb2) {
                        gb2 gb2Var = (gb2) childAt;
                        k27 messageObject2 = gb2Var.getMessageObject();
                        if (this.J8 != null && ((messageObject2.g4() || k27.K4(messageObject2.k)) && !messageObject2.S4() && MediaController.w().D(messageObject2))) {
                            ImageReceiver photoImage = gb2Var.getPhotoImage();
                            this.J8.setTranslationX(gb2Var.getX() + photoImage.L0);
                            this.J8.setTranslationY((this.A0.getY() + ((gb2Var.getY() + gb2Var.getPaddingTop()) + photoImage.M0)) - this.J8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J8.getLayoutParams();
                            boolean g4 = messageObject2.g4();
                            dr1 dr1Var = this.J8;
                            if (g4) {
                                dr1Var.setTag(2131296593, null);
                                if (layoutParams.width != gl.b3(W7(), M7()) || layoutParams.height != gl.b3(W7(), M7())) {
                                    int b3 = gl.b3(W7(), M7());
                                    layoutParams.height = b3;
                                    layoutParams.width = b3;
                                    this.L8.setResizeMode(0);
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                float b32 = (gl.b3(W7(), M7()) + (gl.x << 1)) / gl.b3(W7(), M7());
                                float b33 = gb2Var.getPhotoImage().N0 / gl.b3(W7(), M7());
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
                                dr1Var.setTag(2131296593, photoImage);
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
            if (z && this.J8 != null && (k27Var = MediaController.w().v0) != null && k27Var.T == 0) {
                if (!z3) {
                    if (this.B3 && k27.K4(k27Var.k)) {
                        MediaController.w().l(true, true, false, false);
                        return;
                    }
                    this.J8.setTranslationY((-gl.b3(W7(), M7())) - 100);
                    this.fragmentView.invalidate();
                    if (k27Var.g4() || k27.K4(k27Var.k)) {
                        if (!this.B3 && PipRoundVideoView.G == null) {
                            if (z2) {
                                J(k27Var.e1(), 0, 0, 0, false, true);
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
                if (!k27Var.g4() && !this.N8) {
                    this.A0.invalidate();
                }
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        boolean z3;
        String str2;
        y6(str, null);
        if (l5()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                x3a b = x3a.b(str, this.l6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b.K = Q6();
                z3 = z2;
                b.L = z3;
                b.Q = j2;
                b.R = c7();
                b.T = this.y5;
                z3a.B(this.currentAccount).q0(b);
                str2 = null;
            } else {
                z3 = z2;
                str2 = str;
            }
            getSendMessagesHelper().p0(arrayList3, this.l6, false, false, true, 0, 0, null, -1, j2, c7(), this.y5);
            j5 accountInstance = getAccountInstance();
            z3a.U(i, this.l6, j, j2, c7(), accountInstance, this.D5, null, this.F5, this.m4, this.H5, this.y5, null, Q6(), str2, null, arrayList, arrayList, null, arrayList2, null, null, null, z, z3);
            z4();
        }
    }

    public final boolean k5(View view) {
        CharSequence slowModeTimer = this.a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            jc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void k6(int r36, final java.lang.Object... r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.k6(int, java.lang.Object[]):void");
    }

    public final int k7(int i) {
        SparseIntArray sparseIntArray = this.i5;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 == -1) {
            int i3 = pd;
            pd = i3 + 1;
            sparseIntArray.put(i, i3);
            return i3;
        }
        return i2;
    }

    public final void k8(int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z, bm1 bm1Var) {
        String str4;
        izb izbVar;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = getParentActivity();
            int i2 = iArr[0];
            vm1 vm1Var = new vm1(this, (byte) 16);
            String[] strArr = rzb.R1;
            if (parentActivity == null) {
                izbVar = null;
            } else {
                izb izbVar2 = new izb(parentActivity, str, str4, inputPeer, i2, richMessage, vm1Var);
                izbVar2.N0(z);
                izbVar2.M1 = this;
                izbVar2.N1 = bm1Var;
                if (getParentActivity() != null) {
                    showDialog(izbVar2);
                }
                izbVar = izbVar2;
            }
            izbVar.p0 = false;
            G5(false);
            SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
            int i3 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i3 > 0) {
                SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i3 - 1).apply();
                nd(true);
            }
        }
    }

    public final void k9(TLRPC.TL_error tL_error, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        ij.c0(this.currentAccount, tL_error, this, tL_messages_editMessage, new Object[0]);
    }

    public final void ka(k27 k27Var) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = k27Var.k.peer_id;
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
        bundle.putInt("message_id", k27Var.L1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().A(bundle, this, null, null)) {
            presentFragment(new mu1(bundle));
        }
    }

    public final void kb(TLRPC.Chat chat, TLRPC.User user) {
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
                String M0 = k96.M0(2131745574, null);
                SpannableString spannableString = new SpannableString(tb4.y(M0, " ", str));
                spannableString.setSpan(new cm4(bkb.A8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                this.k0.setSearchFieldCaption(spannableString);
                this.X1.getAdapter().U(null, 0, null, false, true);
                this.k0.setSearchFieldHint(null);
                this.k0.o();
                hq6 mediaDataController = getMediaDataController();
                this.I3 = "";
                mediaDataController.Z1("", this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, true, this.F3);
            }
        }
    }

    public final void kc(u47 u47Var) {
        if (this.H5 == null) {
            return;
        }
        new t47(getParentActivity(), this.currentAccount, this.l6, u47Var, this, getResourceProvider(), 0, new hl1(this, (byte) 0)).show();
    }

    public final void kd(boolean z) {
        TLRPC.Chat K0;
        TLRPC.User user;
        TLRPC.Chat chat;
        cq1 cq1Var = this.p1;
        if (cq1Var == null) {
            return;
        }
        int i = this.g4;
        if (i == 8 && (chat = this.e) != null) {
            if (this.i4) {
                String j = mm4.j(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.e;
                cq1Var.h(j, chat2.scam, chat2.fake, chat2.verified, false, null, z);
            } else if (hc2.p0(chat)) {
                int i2 = (this.s4 > 0L ? 1 : (this.s4 == 0L ? 0 : -1));
                if (i2 == 0) {
                    TLRPC.Chat chat3 = this.e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(this.e.linked_monoforum_id));
                        if (K02 == null) {
                            K02 = this.e;
                        }
                        this.p1.h(gl.C2(gl.A2(K02.title)), K02.scam, K02.fake, K02.verified, false, K02.emoji_status, z);
                    } else {
                        cq1 cq1Var2 = this.p1;
                        String C2 = gl.C2(gl.A2(chat3.title));
                        TLRPC.Chat chat4 = this.e;
                        cq1Var2.h(C2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z);
                    }
                } else if (i2 > 0) {
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.s4));
                    this.p1.h(gl.C2(gl.A2(l7c.r(V1))), V1.scam, V1.fake, V1.verified, V1.premium, V1.emoji_status, z);
                } else {
                    TLRPC.Chat K03 = getMessagesController().K0(Long.valueOf(-this.s4));
                    if (K03 == null) {
                        K03 = this.e;
                    }
                    this.p1.h(gl.C2(gl.A2(K03.title)), K03.scam, K03.fake, K03.verified, false, K03.emoji_status, z);
                }
            } else {
                cq1 cq1Var3 = this.p1;
                String C22 = gl.C2(gl.A2(this.e.title));
                TLRPC.Chat chat5 = this.e;
                cq1Var3.h(C22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i == 9) {
                cq1Var.setTitle(k96.M0(2131742635, null));
            } else if (i == 5) {
                if ("hello".equalsIgnoreCase(this.f4)) {
                    this.p1.setTitle(k96.M0(2131752763, null));
                } else {
                    boolean equalsIgnoreCase = "away".equalsIgnoreCase(this.f4);
                    cq1 cq1Var4 = this.p1;
                    if (equalsIgnoreCase) {
                        cq1Var4.setTitle(k96.M0(2131752826, null));
                    } else {
                        cq1Var4.setTitle(this.f4);
                    }
                }
            } else if (i == 6) {
                boolean isEmpty = TextUtils.isEmpty(this.e4.title);
                cq1 cq1Var5 = this.p1;
                if (!isEmpty) {
                    cq1Var5.setTitle(this.e4.title);
                } else {
                    cq1Var5.setTitle(k96.M0(2131752704, null));
                }
            } else if (i == 3) {
                long j2 = this.s4;
                if (j2 > 0) {
                    user = getMessagesController().V1(Long.valueOf(j2));
                    K0 = null;
                } else {
                    K0 = getMessagesController().K0(Long.valueOf(-j2));
                    user = null;
                }
                if (l7c.B(user)) {
                    this.p1.setTitle(k96.M0(2131746073, null));
                } else if (l7c.u(user)) {
                    this.p1.setTitle(k96.M0(2131754249, null));
                } else if (l7c.D(user)) {
                    this.p1.setTitle(k96.M0(2131748111, null));
                } else {
                    cq1 cq1Var6 = this.p1;
                    if (user != null) {
                        cq1Var6.setTitle(gl.C2(gl.A2(l7c.r(user))));
                    } else if (K0 != null) {
                        cq1Var6.setTitle(gl.C2(gl.A2(K0.title)));
                    } else {
                        cq1Var6.setTitle("");
                    }
                }
            } else if (a8() && !l7c.w(this.f)) {
                if (this.x4) {
                    pd();
                } else if (this.v4) {
                    boolean x2 = this.m4.x2();
                    cq1 cq1Var7 = this.p1;
                    if (x2) {
                        cq1Var7.setTitle(k96.G(this.m4.M1(), "Comments", new Object[0]));
                    } else {
                        cq1Var7.setTitle(k96.M0(2131751984, null));
                    }
                } else {
                    this.p1.setTitle(k96.G(this.m4.M1(), "Replies", new Object[0]));
                }
            } else if (l7c.B(this.f)) {
                this.p1.setTitle(k96.M0(2131746073, null));
            } else if (l7c.u(this.f)) {
                this.p1.setTitle(k96.M0(2131754249, null));
            } else {
                int i3 = this.g4;
                if (i3 == 1) {
                    boolean D = l7c.D(this.f);
                    cq1 cq1Var8 = this.p1;
                    if (D) {
                        cq1Var8.setTitle(k96.M0(2131746129, null));
                    } else {
                        cq1Var8.setTitle(k96.M0(2131745656, null));
                    }
                } else if (i3 == 2) {
                    this.p1.setTitle(k96.G(U6(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.e;
                    if (chat6 != null) {
                        cq1 cq1Var9 = this.p1;
                        String C23 = gl.C2(gl.A2(chat6.title));
                        TLRPC.Chat chat7 = this.e;
                        cq1Var9.h(C23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z);
                    } else {
                        TLRPC.User user2 = this.f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.p1.setTitle(k96.M0(2131745709, null));
                            } else if (!na7.E2(user2) && getContactsController().g0.get(Long.valueOf(this.f.id)) == null && (getContactsController().g0.size() != 0 || !getContactsController().y())) {
                                na7 messagesController = getMessagesController();
                                TLRPC.User user3 = this.f;
                                messagesController.getClass();
                                boolean A2 = na7.A2(user3);
                                if (!this.Dc) {
                                    emojiStatus = this.f.emoji_status;
                                }
                                TLRPC.EmojiStatus emojiStatus2 = emojiStatus;
                                boolean isEmpty2 = TextUtils.isEmpty(this.f.phone);
                                cq1 cq1Var10 = this.p1;
                                if (!isEmpty2) {
                                    String k = yjb.k(new StringBuilder("+"), this.f.phone, p38.f());
                                    TLRPC.User user4 = this.f;
                                    cq1Var10.h(k, user4.scam, user4.fake, user4.verified, A2, emojiStatus2, z);
                                } else {
                                    String C24 = gl.C2(gl.A2(l7c.r(this.f)));
                                    TLRPC.User user5 = this.f;
                                    cq1Var10.h(C24, user5.scam, user5.fake, user5.verified, A2, emojiStatus2, z);
                                }
                            } else {
                                cq1 cq1Var11 = this.p1;
                                String C25 = gl.C2(gl.A2(l7c.r(this.f)));
                                TLRPC.User user6 = this.f;
                                boolean z2 = user6.scam;
                                boolean z3 = user6.fake;
                                boolean z4 = user6.verified;
                                na7 messagesController2 = getMessagesController();
                                TLRPC.User user7 = this.f;
                                messagesController2.getClass();
                                boolean A22 = na7.A2(user7);
                                if (!this.Dc && !na7.E2(this.f)) {
                                    emojiStatus = this.f.emoji_status;
                                }
                                cq1Var11.h(C25, z2, z3, z4, A22, emojiStatus, z);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.p1.getTitleTextView().getText());
        md(false);
    }

    public final boolean l5() {
        CharSequence slowModeTimer = this.a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131745118, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.a0("SlowModeHint", null, 2131745119, slowModeTimer));
        b00.t(null, 2131747638, alertDialog$Builder, null);
        return false;
    }

    public final void l6(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.l6(int, java.lang.Object[]):void");
    }

    public final float l7(float f) {
        mu1 mu1Var = this.Aa;
        if (mu1Var != null) {
            this = mu1Var;
        }
        ez1 ez1Var = this.b1;
        if (ez1Var == null) {
            return 0.0f;
        }
        return ez1Var.c(f);
    }

    public final void l8(int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, bm1 bm1Var) {
        String str4;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            rzb.P0(getParentActivity(), this, inputPeer, iArr[0], this.v5.M2, str, str4, charSequence, z, bm1Var, new vm1(this, (byte) 13)).p0 = false;
            G5(false);
            SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
            int i2 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i2 > 0) {
                SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i2 - 1).apply();
                nd(true);
            }
        }
    }

    public final void l9(TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j;
        kk7 f = kk7.f(this.currentAccount);
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
        f.k(kk7.v, arrayList, valueOf, bool, bool);
    }

    public final void la(k27 k27Var) {
        if (l7c.D(this.f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = k27Var.k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f.id) {
                J(messageFwdHeader.saved_from_msg_id, k27Var.e1(), 0, 0, true, true);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = k27Var.k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", k27Var.k.fwd_from.saved_from_msg_id);
        if (getMessagesController().A(bundle, this, null, null)) {
            presentFragment(new mu1(bundle));
        }
    }

    public final void lb(View view, k27 k27Var, t09 t09Var, View view2, float f, float f2, h19 h19Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        h19 h19Var2;
        String str;
        TLRPC.Document e;
        k27 b;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        hf0 hf0Var;
        jra jraVar;
        int[] iArr;
        int[] iArr2;
        int i;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z6;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!P7() && k27Var != null) {
            if (getMessagesController().t2()) {
                h5.b(this.currentAccount);
                return;
            }
            int i2 = 2;
            if (h19Var != null && h19Var.a) {
                G5(true);
                if (view == null) {
                    hf0Var = E6(k27Var.e1(), true);
                } else {
                    hf0Var = view;
                }
                String str2 = "";
                if (z2) {
                    if (hf0Var != null) {
                        try {
                            hf0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = k27Var.k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j = -zsa.b(k27Var).a;
                    TLRPC.ChatFull L0 = getMessagesController().L0(j);
                    if (L0 != null && !L0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j));
                        u21 b0 = u21.b0(this);
                        if (K0 != null) {
                            str2 = K0.title;
                        }
                        b0.Q(2131624221, 36, gl.S2(k96.a0(null, null, 2131744795, str2))).k(true);
                        return;
                    }
                    eta etaVar = gta.v(this.currentAccount, false).B;
                    if (etaVar != null) {
                        etaVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i3 = this.currentAccount;
                    long j2 = this.l6;
                    if (L0 != null && !L0.paid_reactions_available) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    bwa bwaVar = new bwa(parentActivity, i3, j2, this, k27Var, arrayList, z6, false, 0L, this.Ba);
                    k27Var.e1();
                    bwaVar.P1 = this;
                    bwaVar.Q1 = hf0Var;
                    bwaVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j3 = -zsa.b(k27Var).a;
                TLRPC.ChatFull L02 = getMessagesController().L0(j3);
                if (L02 != null && !L02.paid_reactions_available) {
                    TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(j3));
                    u21 b02 = u21.b0(this);
                    if (K02 != null) {
                        str2 = K02.title;
                    }
                    b02.Q(2131624221, 36, gl.S2(k96.a0(null, null, 2131744795, str2))).k(true);
                    return;
                }
                eta b03 = gta.v(this.currentAccount, false).b0(k27Var, this, 1L, true, true, null);
                if (b03 != null && (hf0Var instanceof hf0)) {
                    if (this.Yc == null) {
                        this.Yc = new jra(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        jraVar = null;
                    } else {
                        ViewParent parent = this.Yc.getParent();
                        jra jraVar2 = this.Yc;
                        if (parent != layoutContainer) {
                            gl.B2(jraVar2);
                            layoutContainer.addView(this.Yc, nme.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(jraVar2) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Yc.bringToFront();
                        }
                        jraVar = this.Yc;
                    }
                    jraVar.setMessageCell((hf0) hf0Var);
                    b03.o = jraVar;
                    jraVar.J = false;
                    jraVar.b(1.0f, null);
                    hf0Var.getLocationInWindow(new int[2]);
                    jraVar.getLocationInWindow(new int[2]);
                    float f3 = (iArr[0] - iArr2[0]) + f;
                    float f4 = (iArr[1] - iArr2[1]) + f2;
                    if (hf0Var instanceof gb2) {
                        i = ((gb2) hf0Var).W;
                    } else {
                        i = 0;
                    }
                    jraVar.d(f3, f4 + i, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().p() && (message = k27Var.k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new jh8((d) this, 24, true).show();
            } else {
                if (k27Var.w2() && h19Var != null) {
                    for (int i4 = 0; i4 < k27Var.k.reactions.results.size(); i4++) {
                        TLRPC.ReactionCount reactionCount = k27Var.k.reactions.results.get(i4);
                        if (h19Var.f(reactionCount.reaction)) {
                            z5 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z5 = false;
                if (!z5 && (chat = this.e) != null && !hc2.V(chat) && !hc2.w(26, this.e)) {
                    ir2.v(null, 2131745399, u21.b0(this), 2131624007, 36);
                    return;
                }
                d19.b(false);
                int size = k27Var.y0().size();
                boolean G5 = k27Var.G5(h19Var, z2);
                int e1 = k27Var.e1();
                long c1 = k27Var.c1();
                vf6 vf6Var = this.P6;
                if (vf6Var.f(c1) != null && (b = ((f27) vf6Var.f(k27Var.c1())).b(9)) != null) {
                    e1 = b.e1();
                }
                int i5 = e1;
                if (G5) {
                    hf0 E6 = E6(i5, true);
                    if (!gba.s1 && E6 != null && h19Var != null && !getUserConfig().p() && size == 1) {
                        gba.B(true);
                        long j4 = h19Var.g;
                        int i6 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                        int i7 = this.currentAccount;
                        if (i6 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i7).r.get(h19Var.f);
                            if (tL_availableReaction != null) {
                                e = tL_availableReaction.center_icon;
                            }
                        } else {
                            e = vl.e(i7, j4);
                        }
                        if (e != null) {
                            m21 q = u21.b0(this).q(e, k96.M0(2131752206, null));
                            q.j = 5000;
                            q.j();
                        }
                    }
                    if (!z) {
                        int i8 = this.currentAccount;
                        if (t09Var != null) {
                            if (z2) {
                                i2 = 0;
                            }
                        } else {
                            i2 = 1;
                        }
                        d19.d(this, t09Var, E6, view2, f, f2, h19Var, i8, i2);
                    }
                }
                if (G5 && h19Var != null && (str = h19Var.f) != null) {
                    gl.g2(k96.a0(null, null, 2131754724, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(k27Var.y0());
                z3a sendMessagesHelper = getSendMessagesHelper();
                if (G5) {
                    h19Var2 = h19Var;
                } else {
                    h19Var2 = null;
                }
                kp1 kp1Var = new kp1(this, z4, z, i5, G5, t09Var, f, f2, h19Var, k27Var);
                this.Kc = kp1Var;
                sendMessagesHelper.r0(k27Var, arrayList2, h19Var2, z2, z3, this, kp1Var);
                if (z || z4) {
                    Mc(k27Var, true);
                    this.Kc.run();
                }
                if (!z4) {
                    gl.d3(this.Kc, 50L);
                }
            }
        }
    }

    public final void lc() {
        int i;
        if (a() == getUserConfig().e() && getUserConfig().p() && this.Bb == null) {
            sr1 sr1Var = new sr1(this, this, getParentActivity(), this.currentAccount, this.Ba);
            this.Bb = sr1Var;
            sr1Var.setPadding(gl.L(4.0f), gl.L(24.0f), gl.L(4.0f), gl.L(0.0f));
            this.Bb.setDelegate(new tr1(this));
            this.Bb.setTop(true);
            int i2 = 0;
            this.Bb.setClipChildren(false);
            this.Bb.setClipToPadding(false);
            this.Bb.setVisibility(0);
            sr1 sr1Var2 = this.Bb;
            if (sr1Var2.getSelectedReactions().isEmpty()) {
                i = 2131745680;
            } else {
                i = 2131745679;
            }
            sr1Var2.setHint(k96.M0(i, null));
            this.m1.addView(this.Bb, nme.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Bb.m(null, null, true);
            this.Bb.setTranslationY(-gl.L(12.0f));
            this.Bb.setScaleY(0.4f);
            this.Bb.setScaleX(0.4f);
            this.Bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(s33.h).start();
            hd();
            sr1 sr1Var3 = this.Bb;
            float f = this.T9;
            lr1 lr1Var = this.D1;
            if (lr1Var != null) {
                i2 = lr1Var.getCurrentHeight();
            }
            sr1Var3.setTranslationY(f + i2);
        }
    }

    public final void ld() {
        md(false);
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        y6(((y3a) arrayList.get(0)).d, ((y3a) arrayList.get(0)).i);
        z3a.W(getAccountInstance(), arrayList, this.l6, this.F5, this.m4, null, this.D5, true, false, this.H5, null, z, i, 0, ((y3a) arrayList.get(0)).t, null, Q6(), 0L, false, j, c7(), this.y5, null, false);
        z4();
        if (i != 0) {
            int i2 = this.h4;
            if (i2 == -1) {
                this.h4 = 0;
                i2 = 0;
            }
            this.h4 = arrayList.size() + i2;
            ad(true);
        }
    }

    public final void m5(Runnable runnable, nj njVar, boolean z) {
        if (njVar != null && z) {
            jn1 jn1Var = new jn1(this, njVar, runnable, (byte) 0);
            gta u = gta.u(this.currentAccount, njVar.a);
            if (!u.e) {
                u.n(jn1Var, true, true);
                return;
            } else {
                jn1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void m6(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.m6(int, java.lang.Object[]):void");
    }

    public final float m7(gxb gxbVar) {
        float f;
        kxb kxbVar = this.g2;
        if (kxbVar != null) {
            float L = gl.L(7.0f);
            float h = kxbVar.h(gxbVar);
            if (gxbVar == gxb.b) {
                f = 64.0f;
            } else {
                f = 36.0f;
            }
            return (gl.L(f) + L) * h;
        }
        return 0.0f;
    }

    public final void m8(int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, bm1 bm1Var) {
        String str3;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            rzb.P0(getParentActivity(), this, inputPeer, iArr[0], this.v5.M2, strArr[0], str3, charSequence, z, bm1Var, new wl1(this, (byte) 17)).p0 = false;
            G5(false);
            SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
            int i2 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i2 > 0) {
                SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i2 - 1).apply();
                nd(true);
            }
        }
    }

    public final void m9() {
        if (!k5(this.a0.getSendButton())) {
            if (getMediaController().D(this.v5)) {
                getMediaController().l(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = getMessagesController().h1(this.l6);
            if (this.w5 != null) {
                for (int i = 0; i < this.w5.d.size(); i++) {
                    tL_messages_sendScheduledMessages.id.add(Integer.valueOf(((k27) this.w5.d.get(i)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.id.add(Integer.valueOf(this.v5.e1()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new pl(this, tL_messages_sendScheduledMessages, (byte) 16));
        }
    }

    public final void ma(gb2 gb2Var, k27 k27Var) {
        gb2 gb2Var2;
        boolean z;
        long j;
        long j2;
        long j3;
        km m;
        Bitmap m2;
        if (gb2Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2Var2 = (gb2) childAt;
                    if (gb2Var2.getMessageObject().T(k27Var)) {
                        break;
                    }
                }
            }
        }
        gb2Var2 = gb2Var;
        if (k27.K4(k27Var.k)) {
            tb(k27Var, true);
        }
        if (k27.K4(k27Var.k) && !k27Var.D2(true) && gba.x0 && k27Var.B() && !cf3.B(k27.B0(k27Var.k)) && !k27Var.z0 && !k27Var.y0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ba4 fileLoader = getFileLoader();
            TLRPC.Document F0 = k27Var.F0();
            fileLoader.getClass();
            ba4.K.c(new mg3(fileLoader, F0, k27Var, (byte) 23));
        }
        PhotoViewer.r0().T1(null, this, this.Ba);
        k27 k27Var2 = MediaController.w().v0;
        if (gb2Var2 != null && k27Var2 != null && k27.K4(k27Var2.k)) {
            getFileLoader().c0(k27Var2.F0(), false);
            if (k27Var2.T(k27Var) && (m = gb2Var2.getPhotoImage().m()) != null && this.M8 != null && this.J8.getTag() != null && (m2 = m.m()) != null) {
                try {
                    Bitmap bitmap = this.M8.getBitmap(m2.getWidth(), m2.getHeight());
                    new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
            MediaController.w().l(true, true, false, k27Var2.T(k27Var));
        }
        if (this.g4 == 1 && (k27.K4(k27Var.k) || k27Var.D == 1)) {
            PhotoViewer.r0().k4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.M6.size();
            for (int i2 = 0; i2 < size; i2++) {
                k27 k27Var3 = (k27) this.M6.get(i2);
                if (k27.K4(k27Var3.k) || k27Var3.D == 1) {
                    arrayList.add(0, k27Var3);
                }
            }
            PhotoViewer.r0().j1(arrayList, arrayList.indexOf(k27Var), this.l6, 0L, d(), this.db);
        } else {
            PhotoViewer r0 = PhotoViewer.r0();
            if (k27Var.D != 0) {
                j = this.l6;
                j2 = this.d7;
                j3 = d();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            if (!r0.m1(k27Var, this, j, j2, j3, this.db) && z) {
                getFileLoader().f(k27Var.F0());
            }
        }
        z7(false);
        MediaController.w().w0 = null;
    }

    public final void mb() {
        mv6[] mv6VarArr;
        pu1 pu1Var;
        ou1 ou1Var;
        xu1[] xu1VarArr;
        ku1 ku1Var = this.Ba;
        if (ku1Var != null) {
            ku1Var.s();
        }
        wp1 wp1Var = this.y;
        if (wp1Var != null) {
            wp1Var.d();
        }
        wp1 wp1Var2 = this.x;
        if (wp1Var2 != null) {
            wp1Var2.d();
        }
        wp1 wp1Var3 = this.E;
        if (wp1Var3 != null) {
            wp1Var3.d();
        }
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            ar1Var.updateColors();
        }
        x31 x31Var = this.Y1;
        if (x31Var != null) {
            x31Var.H0();
        }
        jq1 jq1Var = this.A0;
        if (jq1Var != null) {
            int childCount = jq1Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof gb2) {
                    ((gb2) childAt).B0(0);
                } else if (childAt instanceof uk1) {
                    ((uk1) childAt).setInvalidateColors(true);
                }
            }
        }
        m8 m8Var = this.g9;
        if (m8Var != null && m8Var.getContentView() != null) {
            View contentView = this.g9.getContentView();
            int themedColor = getThemedColor(bkb.F8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        qa8 qa8Var = this.O2;
        if (qa8Var != null) {
            qa8Var.d();
        }
        br1 br1Var = this.b0;
        if (br1Var != null && br1Var.getEditView() != null) {
            for (xu1 xu1Var : this.b0.getEditView().a) {
                if (xu1Var != null) {
                    xu1Var.d();
                }
            }
        }
        r7 r7Var = this.j0;
        if (r7Var != null) {
            r7Var.V();
        }
        uq1 uq1Var = this.m2;
        if (uq1Var != null) {
            uq1Var.updateColors();
        }
        cq1 cq1Var = this.p1;
        if (cq1Var != null) {
            cq1Var.updateColors();
        }
        at1 at1Var = this.m1;
        if (at1Var != null) {
            at1Var.M();
            si9 si9Var = this.m1.M;
            if (si9Var != null) {
                si9Var.invalidate();
            }
        }
        ez1 ez1Var = this.b1;
        if (ez1Var != null) {
            il0 il0Var = ez1Var.s;
            if (il0Var != null) {
                il0Var.updateColors();
            }
            bkb.w0(null, bkb.c6, false);
            ez1Var.invalidate();
        }
        dbb dbbVar = this.s1;
        if (dbbVar != null) {
            dbbVar.updateColors();
        }
        cq1 cq1Var2 = this.p1;
        if (cq1Var2 != null && cq1Var2.getTimeItem() != null) {
            this.p1.getTimeItem().invalidate();
        }
        j92 j92Var = this.U;
        if (j92Var != null) {
            j92Var.updateColors();
        }
        dz1 dz1Var = this.y1;
        if (dz1Var != null) {
            for (mv6 mv6Var : dz1Var.e) {
                if (mv6Var != null && (ou1Var = (pu1Var = (pu1) mv6Var.b).b) != null) {
                    ou1Var.updateColors();
                    pu1Var.invalidate();
                }
            }
        }
        er1 er1Var = this.d1;
        if (er1Var != null) {
            er1Var.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((il0) it.next()).updateColors();
        }
        this.m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void mc(k27 k27Var) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().z2(k27.B0(k27Var.k))) {
            TLRPC.Message message = k27Var.k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = k27Var.B2;
                boolean z = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = k27Var.v;
                    if (k27Var.B2.size() > 1) {
                        z = true;
                    }
                } else {
                    charSequence = k27Var.z;
                }
                if (!z && charSequence != null) {
                    z = true;
                }
                if (z && gba.I <= 2 && !this.F9 && this.G9 <= this.a0.getTop() - gl.L(60.0f)) {
                    this.F9 = true;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    int i = gba.I + 1;
                    gba.I = i;
                    edit.putInt("textSelectionHintShows", i);
                    edit.apply();
                    if (this.E9 == null) {
                        es1 es1Var = new es1(this, this.Ba, getParentActivity());
                        this.E9 = es1Var;
                        this.m1.addView(es1Var, nme.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.E9.c();
                }
            }
        }
    }

    public final void md(boolean z) {
        Drawable mutate;
        Drawable drawable;
        p7 p7Var;
        if (this.p1 != null) {
            int i = this.g4;
            if (i == 0 || i == 8) {
                boolean n2 = getMessagesController().n2(this.l6, d(), null);
                if (z) {
                    n2 = !n2;
                }
                this.R0 = null;
                if (!hc2.e0(this.currentAccount, this.e) && !hc2.f0(this.currentAccount, this.f)) {
                    if (!l7c.B(this.f) && ((!a8() || this.x4) && n2)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231946).mutate();
                    int i2 = bkb.G6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i2);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.p1.c(cf3.c(chat));
                    } else {
                        TLRPC.User user = this.f;
                        if (user != null && !l7c.D(user)) {
                            drawable = this.p1.c(cf3.c(this.f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.p1.j(drawable, mutate);
                if (!z && (p7Var = this.t1) != null) {
                    byte b = p7Var.m;
                    if (n2) {
                        if (b != 8) {
                            p7Var.m = (byte) 8;
                            View view = p7Var.j;
                            if (view instanceof a8) {
                                ((a8) view).getRightIcon().setVisibility(p7Var.m);
                            }
                        }
                        this.t1.d(k96.M0(2131743610, null));
                        this.t1.b(2131232261);
                    } else {
                        if (b != 0) {
                            p7Var.m = (byte) 0;
                            View view2 = p7Var.j;
                            if (view2 instanceof a8) {
                                ((a8) view2).getRightIcon().setVisibility(p7Var.m);
                            }
                        }
                        boolean o2 = getMessagesController().o2(this.l6, d());
                        p7 p7Var2 = this.t1;
                        if (o2) {
                            p7Var2.d(k96.M0(2131748122, null));
                            this.t1.b(2131232417);
                        } else {
                            p7Var2.d(k96.M0(2131748122, null));
                            this.t1.b(2131232371);
                        }
                    }
                }
                yb2 yb2Var = this.x1;
                if (yb2Var != null) {
                    yb2Var.e(this.l6, d(), null);
                }
            }
        }
    }

    @Override
    public final boolean n() {
        return this.O9;
    }

    public final void n5() {
        if (this.O3 != null) {
            return;
        }
        xr1 xr1Var = new xr1(this, getParentActivity(), this, this.Ba);
        this.O3 = xr1Var;
        this.m1.addView(xr1Var, 17, nme.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void n6(java.lang.Object... r89) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.n6(java.lang.Object[]):void");
    }

    public final f27 n7(k27 k27Var) {
        if (k27Var.c1() != 0) {
            f27 f27Var = (f27) this.P6.f(k27Var.c1());
            if (f27Var == null || (f27Var.d.size() > 1 && f27Var.d(k27Var) != null)) {
                return f27Var;
            }
            return null;
        }
        return null;
    }

    public final void n8() {
        TLRPC.UserFull userFull;
        boolean z;
        if (getParentActivity() != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                if (hc2.j(chat) && !this.e.monoforum) {
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
                String M0 = k96.M0(2131743603, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131743604, null);
                alertDialog$Builder.j(k96.M0(2131743605, null), new yk1(this, (byte) 22));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
            } else if (!this.V4.isEmpty()) {
                na7.q1(this.currentAccount).W3.edit().putInt("pin_" + this.l6, ((Integer) this.V4.get(0)).intValue()).commit();
                Uc(0, true);
            }
        }
    }

    public final void n9(f27 f27Var, k27 k27Var, int i, int i2) {
        if (f27Var != null) {
            ArrayList arrayList = f27Var.d;
            if (!arrayList.isEmpty()) {
                z3a.B(this.currentAccount).t((k27) arrayList.get(0), this, i, i2);
                return;
            }
        }
        z3a.B(this.currentAccount).t(k27Var, this, i, i2);
    }

    public final void na(boolean z) {
        ui5 ui5Var;
        int i;
        if (getParentActivity() != null && (ui5Var = this.parentLayout) != null && ui5Var.getLastFragment() == this && !this.V4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.id);
            } else {
                bundle.putLong("user_id", this.f.id);
            }
            bundle.putInt("chatMode", 2);
            mu1 mu1Var = new mu1(bundle);
            mu1Var.V4 = new ArrayList(this.V4);
            mu1Var.X4 = new HashMap(this.X4);
            int size = this.V4.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) this.V4.get(i2);
                k27 k27Var = (k27) this.X4.get(num);
                k27 k27Var2 = (k27) this.G6[0].get(num.intValue());
                if (k27Var == null) {
                    k27Var = k27Var2;
                } else if (k27Var2 != null) {
                    k27Var.z0 = k27Var2.z0;
                    k27Var.y0 = k27Var2.y0;
                }
                if (k27Var != null) {
                    mu1Var.X4.put(num, k27Var);
                    mu1Var.Vc();
                }
            }
            mu1Var.d5 = this.d5;
            if (this.x4) {
                i = this.V4.size();
            } else {
                i = this.e5;
            }
            mu1Var.e5 = i;
            mu1Var.g5 = this.g5;
            mu1Var.s8 = this.s8;
            mu1Var.r8 = this.r8;
            mu1Var.n9 = new cs1(this, mu1Var);
            if (z) {
                presentFragmentAsPreview(mu1Var);
                j5();
                return;
            }
            presentFragment(mu1Var, false);
        }
    }

    public final void nb(TLRPC.Document document) {
        String V;
        if (document == null || (V = k27.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        x3a b = x3a.b(V, this.l6, this.F5, this.m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b.K = Q6();
        z3a.B(this.currentAccount).q0(b);
        z4();
    }

    public final void nc(boolean z, boolean z2) {
        ar1 ar1Var;
        int i;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z || this.H2 != null) && this.g4 == 0 && (ar1Var = this.a0) != null && ar1Var.getAudioVideoButtonContainer() != null && this.a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                je5 je5Var = this.H2;
                if (je5Var == null) {
                    int indexOfChild = this.m1.indexOfChild(this.U);
                    if (indexOfChild != -1) {
                        je5Var = s4(310.0f, 3, indexOfChild + 1, false);
                        this.H2 = je5Var;
                    } else {
                        return;
                    }
                }
                if (z) {
                    je5Var.f(true);
                    return;
                }
                if (this.a0.U2) {
                    if (z2) {
                        i = 2131749098;
                    } else {
                        i = 2131749100;
                    }
                    je5Var.t(k96.M0(i, null));
                } else {
                    je5Var.t(k96.M0(2131749099, null));
                }
                this.H2.x(this.a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void nd(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.nd(boolean):void");
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.g4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            d dVar = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((dVar instanceof mu1) && ((mu1) dVar).Q7()) {
                return false;
            }
        }
        return this.Z6;
    }

    public final void o5(boolean z) {
        long j;
        if (System.currentTimeMillis() - this.lc > 1000) {
            z = true;
        }
        vm1 vm1Var = this.mc;
        gl.r(vm1Var);
        if (z) {
            j = 0;
        } else {
            j = 150;
        }
        gl.d3(vm1Var, j);
    }

    public final void o6(int i, ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        mu1 mu1Var;
        int i2;
        mu1 mu1Var2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && mu1Var2.l5()) {
            int i3 = 0;
            while (true) {
                if (i3 < arrayList3.size()) {
                    y3a y3aVar = (y3a) arrayList3.get(i3);
                    if (y3aVar.m == null && y3aVar.k == null) {
                        break;
                    }
                    i3++;
                } else if (!TextUtils.isEmpty(((y3a) arrayList3.get(0)).d)) {
                    x3a b = x3a.b(((y3a) arrayList3.get(0)).d, mu1Var2.l6, mu1Var2.F5, mu1Var2.m4, null, false, ((y3a) arrayList3.get(0)).i, null, null, z, i, 0, null, false);
                    b.K = mu1Var2.Q6();
                    z3a.B(mu1Var2.currentAccount).q0(b);
                }
            }
            int i4 = 0;
            while (i4 < arrayList3.size()) {
                y3a y3aVar2 = (y3a) arrayList3.get(i4);
                if (y3aVar2.m != null && y3aVar2.k == null) {
                    j5 accountInstance = mu1Var2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = y3aVar2.m;
                    HashMap hashMap = y3aVar2.n;
                    int i5 = i4;
                    z3a.R(i, mu1Var2.l6, 0L, mu1Var2.c7(), accountInstance, mu1Var2.D5, mu1Var2.F5, mu1Var2.m4, mu1Var2.Q6(), hashMap, botInlineResult, null, mu1Var2, z);
                    arrayList2 = arrayList;
                    mu1Var = mu1Var2;
                    arrayList2.remove(i5);
                    i2 = i5 - 1;
                } else {
                    arrayList2 = arrayList3;
                    mu1Var = mu1Var2;
                    i2 = i4;
                }
                i4 = i2 + 1;
                mu1Var2 = mu1Var;
                arrayList3 = arrayList2;
            }
            ArrayList arrayList4 = arrayList3;
            mu1 mu1Var3 = mu1Var2;
            if (!arrayList4.isEmpty()) {
                mu1Var3.y6(((y3a) arrayList4.get(0)).d, ((y3a) arrayList4.get(0)).i);
                z3a.W(mu1Var3.getAccountInstance(), arrayList4, mu1Var3.l6, mu1Var3.F5, mu1Var3.m4, null, mu1Var3.D5, false, true, mu1Var3.H5, null, z, i, 0, ((y3a) arrayList4.get(0)).t, null, mu1Var3.Q6(), 0L, false, 0L, mu1Var3.c7(), mu1Var3.y5, null, false);
                z4();
                if (i != 0) {
                    int i6 = this.h4;
                    if (i6 == -1) {
                        this.h4 = 0;
                        i6 = 0;
                    }
                    this.h4 = arrayList.size() + i6;
                    ad(true);
                }
            }
        }
    }

    public final float o7(gb2 gb2Var, float f) {
        int[] iArr = this.Kb;
        gb2Var.getLocationInWindow(iArr);
        int i = iArr[0];
        this.m1.getLocationInWindow(iArr);
        return (i - iArr[0]) + f;
    }

    public final void o8() {
        int i = 0;
        if (this.b2) {
            getMessagesController().b(0, 0, this.l6);
            b6();
            this.N3.j(23, this.l6, null);
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
            edit.putBoolean("dialog_bar_archived" + this.l6, false);
            edit.putBoolean("dialog_bar_block" + this.l6, false);
            edit.putBoolean("dialog_bar_report" + this.l6, false);
            edit.commit();
            nd(false);
            im7 notificationsController = getNotificationsController();
            long j = this.l6;
            long d = d();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().d().edit();
            String p = im7.p(j, d, false);
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
                vf6 vf6Var = new vf6();
                while (true) {
                    int size = this.r8.participants.participants.size();
                    TLRPC.ChatFull chatFull2 = this.r8;
                    if (i < size) {
                        vf6Var.k(null, chatFull2.participants.participants.get(i).user_id);
                        i++;
                    } else {
                        long j2 = chatFull2.id;
                        jr5 jr5Var = new jr5(getParentActivity(), this.currentAccount, vf6Var, this.r8.id, this, this.Ba);
                        jr5Var.f2 = new yk1(this, (byte) 25);
                        jr5Var.show();
                        return;
                    }
                }
            }
        } else if (this.a2.getTag() != null) {
            Hb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f.id);
            bundle.putBoolean("addContact", true);
            it2 it2Var = new it2(bundle);
            it2Var.P = new yk1(this, (byte) 26);
            presentFragment(it2Var);
        }
    }

    public final void o9(TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p pVar) {
        try {
            vf6 vf6Var = new vf6();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new k27(this.currentAccount, tL_message, false, false));
            vf6Var.k(arrayList, cf3.n(tL_webPageAttributeStory.peer));
            getMessagesController().M1().k.c(vf6Var, new aj1(vf6Var, pVar, (byte) 16), this.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public final void oa(long j) {
        int i;
        boolean z;
        up9 up9Var;
        if (j != X6()) {
            getConnectionsManager().cancelRequestsForGuid(this.classGuid);
            getMessagesStorage().j(this.classGuid);
            this.classGuid = ConnectionsManager.generateClassGuid();
            Za();
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
                vp9 D1 = getMessagesController().D1();
                long d = d();
                ArrayList arrayList = D1.j;
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        up9Var = (up9) arrayList.get(i2);
                        if (up9Var.a == d) {
                            break;
                        }
                        i2++;
                    } else {
                        up9Var = null;
                        break;
                    }
                }
                if (up9Var != null && !up9Var.i) {
                    D1.f(d, null);
                }
            }
            G6();
            kd(true);
            cq1 cq1Var = this.p1;
            if (cq1Var != null) {
                cq1Var.n(true);
                this.p1.b();
            }
            lwb lwbVar = this.n0;
            if (lwbVar != null) {
                lwbVar.setCurrentTopic(j);
                lwb lwbVar2 = this.n0;
                if (this.j0 != null) {
                    z = true;
                } else {
                    z = false;
                }
                lwbVar2.setMenuAvailable(z);
            }
            nd(true);
            Dc(true);
            x7(true);
            w7(true);
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.J0(false);
                this.a0.m2(true);
            }
            C4(true, true);
            du1 du1Var = this.Wc;
            if (du1Var != null && this.actionBar.o0) {
                du1Var.k(null);
            }
        }
    }

    public final void ob(TLRPC.BotInlineResult botInlineResult, boolean z, int i, long j) {
        long j2;
        String str;
        sq1 sq1Var = this.X1;
        if (sq1Var == null) {
            return;
        }
        TLRPC.User user = sq1Var.getAdapter().x0;
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
        k27 k27Var = this.F5;
        k27 k27Var2 = this.m4;
        z3a.R(i, j3, j, c7(), accountInstance, this.D5, k27Var, k27Var2, Q6(), hashMap, botInlineResult, null, this, z);
        this.a0.setFieldText("");
        w7(false);
        getMediaDataController().w0(j2, false);
    }

    public final boolean oc(k27 k27Var) {
        if (this.g4 == 0 && k27Var != null && k27Var.a5()) {
            return true;
        }
        return false;
    }

    public final void od() {
        int i;
        TLRPC.TL_forumTopic tL_forumTopic;
        p7 p7Var = this.w0;
        if (p7Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && hc2.i(this.currentAccount, chat, this.r4) && (tL_forumTopic = this.r4) != null && !tL_forumTopic.closed) {
                i = 0;
            } else {
                i = 8;
            }
            p7Var.e(i);
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        q qVar;
        hd hdVar;
        ex1 ex1Var;
        hd hdVar2;
        cx1 cx1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        bt1 bt1Var;
        ed2 ed2Var;
        zha zhaVar;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getOpenMenuOverlay() != null) {
            if (z && (zhaVar = this.actionBar.a1) != null) {
                zhaVar.a(true);
                return false;
            }
        } else {
            lwb lwbVar = this.n0;
            if (lwbVar != null && lwbVar.y > 0.0f) {
                if (z) {
                    lwbVar.d();
                    return false;
                }
            } else {
                m21 m21Var = m21.w;
                if (m21Var != null) {
                    q11 q11Var = m21Var.e;
                    if (q11Var instanceof x11) {
                        if (z) {
                            ((x11) q11Var).f();
                            m21Var.b();
                            return false;
                        }
                    }
                }
                qu9 qu9Var = this.wa;
                if (qu9Var != null && !qu9Var.c0) {
                    if (z) {
                        qu9Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z) {
                        closeSheet();
                        return false;
                    }
                } else {
                    fd2 fd2Var = this.va;
                    if (fd2Var != null && (ed2Var = fd2Var.b) != null && ed2Var.getReactionsWindow() != null) {
                        if (z) {
                            fd2Var.b.b();
                            return false;
                        }
                    } else if (xv2.e().E) {
                        if (z) {
                            xv2.e().c();
                            return false;
                        }
                    } else {
                        wr1 wr1Var = this.cb;
                        if (wr1Var != null && wr1Var.s) {
                            if (z) {
                                wr1Var.a(true);
                                return false;
                            }
                        } else if (this.hd.f) {
                            if (z) {
                                bc(false);
                                return false;
                            }
                        } else if (this.g9 != null) {
                            if (z) {
                                G5(true);
                                return false;
                            }
                        } else if (!d5(z, false)) {
                            if (t7()) {
                                if (z && (bt1Var = this.u9) != null && bt1Var.w()) {
                                    this.u9.e(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                                if (aVar2 != null && aVar2.y()) {
                                    if (z) {
                                        F5(false);
                                        return false;
                                    }
                                } else {
                                    ar1 ar1Var = this.a0;
                                    if (ar1Var != null && ar1Var.Q0() && (ar1Var.V2 != 1 || (tL_replyKeyboardMarkup = ar1Var.d3) == null || !tL_replyKeyboardMarkup.is_persistent || ar1Var.c3 == null)) {
                                        if (z) {
                                            this.a0.J0(true);
                                            return false;
                                        }
                                    } else {
                                        ar1 ar1Var2 = this.a0;
                                        if (ar1Var2 != null && ar1Var2.z()) {
                                            if (z) {
                                                ar1 ar1Var3 = this.a0;
                                                ep0 ep0Var = ar1Var3.m0;
                                                if (ep0Var != null) {
                                                    ep0Var.setOpened(false);
                                                }
                                                if (!ar1Var3.G0() && (cx1Var = ar1Var3.n0) != null) {
                                                    cx1Var.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            ar1 ar1Var4 = this.a0;
                                            if (ar1Var4 != null && (ex1Var = ar1Var4.F0) != null && (hdVar2 = ex1Var.b2) != null && hdVar2.isShowing()) {
                                                if (z) {
                                                    ex1Var.b2.dismiss();
                                                    return false;
                                                }
                                            } else if (this.g4 == 6 && (hdVar = f41.e) != null && hdVar.isShowing()) {
                                                if (z) {
                                                    f41.e.dismiss();
                                                    return false;
                                                }
                                            } else if (hc2.p0(this.e) && !this.i4 && this.g2 != null && d() != 0) {
                                                if (z) {
                                                    this.g2.k(0L, this.H7);
                                                    return false;
                                                }
                                            } else if (this.g4 == 5 && !"hello".equalsIgnoreCase(this.f4) && !"away".equalsIgnoreCase(this.f4) && (this.M6.isEmpty() || this.s4 == 0)) {
                                                if (z) {
                                                    hc();
                                                    return false;
                                                }
                                            } else if (this.g4 == 6 && this.a0.A()) {
                                                if (z) {
                                                    Mb(new vm1(this, (byte) 15));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.a aVar3 = this.actionBar;
                                                if (aVar3 != null && aVar3.o0) {
                                                    if (z) {
                                                        aVar3.n(true);
                                                        return false;
                                                    }
                                                } else if (this.fd.f) {
                                                    if (z) {
                                                        za();
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
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        C7();
        if (!getMessagesController().F3() && getMessagesController().G3 <= 0 && getMessagesController().a4 < 2 && !getUserConfig().p() && (arrayList = this.M6) != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                k27 k27Var = (k27) arrayList.get(i);
                if (k27Var != null && !k27Var.O3() && ((k27.Q4(k27Var.k) || k27Var.g4()) && !k27Var.E4() && (k27Var.k.media_unread || hc2.V(this.e)))) {
                    uyb.v(k27Var, false);
                }
            }
        }
        this.U3 = false;
        D7();
        ArrayList arrayList2 = uyb.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        c01 c01Var = this.ec;
        if (c01Var != null) {
            c01Var.a(false);
            this.ec = null;
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
        if (this.Eb) {
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.i1();
                ar1 ar1Var2 = this.a0;
                ar1Var2.U0 = false;
                wx1 wx1Var = ar1Var2.V0;
                if (wx1Var != null) {
                    wx1Var.t(false);
                }
            }
            this.Eb = false;
        }
        if (this.K1 != null) {
            gl.d3(new my(this, (byte) 2), 600L);
        }
        if (this.H4 && !this.I4) {
            this.I4 = true;
            m21 I = u21.b0(this).I(2131623993, k96.M0(2131743358, null), k96.M0(2131743360, null));
            I.j = 5000;
            I.v = new my(this, (byte) 4);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        fd2 fd2Var = this.va;
        if (fd2Var != null && fd2Var.d()) {
            this.va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        k27 k27Var;
        long j;
        long j2;
        long j3;
        cq1 cq1Var = this.p1;
        if (cq1Var != null) {
            ViewTreeObserver viewTreeObserver = cq1Var.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new so1(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        G5(true);
        if (!gl.O1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C0() || !PhotoViewer.r0().V0()) && (k27Var = MediaController.w().v0) != null && k27.K4(k27Var.k)) {
                    PhotoViewer.r0().T1(null, this, this.Ba);
                    getFileLoader().c0(k27Var.F0(), false);
                    MediaController.w().l(true, true, false, true);
                    PhotoViewer r0 = PhotoViewer.r0();
                    if (k27Var.D != 0) {
                        j = this.l6;
                        j2 = this.d7;
                        j3 = d();
                    } else {
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                    }
                    if (r0.n1(k27Var, null, null, null, null, null, null, 0, this.db, null, j, j2, j3, false, null, null)) {
                        PhotoViewer.r0().k4 = this;
                    }
                    z7(false);
                    MediaController.w().w0 = null;
                }
            } else if (PhotoViewer.C0() && PhotoViewer.r0().m2) {
                PhotoViewer r02 = PhotoViewer.r0();
                if (r02.G2.c0()) {
                    if (r02.Z2) {
                        r02.G2.r0(false);
                    }
                    MediaController w = MediaController.w();
                    lbc lbcVar = r02.G2;
                    k27 k27Var2 = r02.S4;
                    if (lbcVar != null && k27Var2 != null) {
                        int i = k27Var2.K1;
                        ba4.G(i).c0(k27Var2.F0(), true);
                        w.G0 = false;
                        w.m();
                        w.F0 = lbcVar;
                        w.v0 = k27Var2;
                        int i2 = w.n0 + 1;
                        w.n0 = i2;
                        lbcVar.K = new ll6(w, i2, k27Var2, (byte) 1);
                        w.Q0 = false;
                        TextureView textureView = w.H0;
                        if (textureView != null) {
                            lbcVar.z0(textureView);
                        }
                        w.e(k27Var2);
                        w.m0();
                        w.h0 = false;
                        k27 k27Var3 = w.v0;
                        w.v0 = k27Var2;
                        if (!gba.k(true)) {
                            w.v0(w.s);
                        }
                        w.u0(w.v0);
                        kk7.f(i).k(kk7.g2, k27Var2, k27Var3);
                    }
                    r02.G2 = null;
                }
                PhotoViewer.r0().B(false, true);
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
        ir1 ir1Var = this.ta;
        float f = 0.0f;
        if (z && this.oa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            d dVar = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (dVar instanceof mu1) {
                this.R4 = true;
                mu1 mu1Var = (mu1) dVar;
                mu1Var.qa = this;
                this.fragmentView.setAlpha(0.0f);
                this.m1.setSkipBackgroundDrawing(true);
                this.p1.setTranslationY(gl.L(8.0f));
                this.p1.getAvatarImageView().setAlpha(0.0f);
                this.p1.getAvatarImageView().setTranslationY(-gl.L(8.0f));
                this.pa = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ar1 ar1Var = this.a0;
                if (ar1Var != null) {
                    ar1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.q.x, 1073741824), -2146483649);
                }
                dr1 dr1Var = this.T;
                if (dr1Var != null) {
                    dr1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.q.x, 1073741824), -2146483649);
                }
                ar1 ar1Var2 = this.a0;
                if (ar1Var2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = ar1Var2.getMeasuredHeight();
                }
                dr1 dr1Var2 = this.T;
                if (dr1Var2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = dr1Var2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                ar1 ar1Var3 = mu1Var.a0;
                if (ar1Var3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = ar1Var3.getMeasuredHeight();
                }
                dr1 dr1Var3 = this.T;
                if (dr1Var3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = dr1Var3.getMeasuredHeight();
                }
                this.la = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new pk(this, mu1Var, (byte) 6));
                Fc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.sa = animatorSet;
                animatorSet.addListener(new qp1(this, mu1Var, runnable));
                this.sa.setDuration(300L);
                this.sa.setInterpolator(s33.f);
                this.sa.playTogether(ofFloat2);
                gl.d3(ir1Var, 200L);
                return this.sa;
            }
        }
        if (this.Ga && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            d dVar2 = (d) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (dVar2 instanceof qvb) {
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
                ofFloat.addUpdateListener(new ae0(this, (byte) 2));
                this.Ha = true;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.invalidate();
                }
                at1 at1Var = this.m1;
                if (at1Var != null) {
                    at1Var.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.sa = animatorSet2;
                animatorSet2.addListener(new rp1(this, z, runnable));
                this.sa.setDuration(150L);
                this.sa.playTogether(ofFloat);
                if (z) {
                    gl.d3(ir1Var, 200L);
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
        hd hdVar = this.P;
        if (hdVar != null && dialog == hdVar) {
            getMessagesController().T(0, this.l6, false);
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && !ui5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z;
        ffa ffaVar;
        long j = this.l6;
        int[] iArr = uyb.N;
        ArrayList arrayList = new ArrayList(uyb.R.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k27 k27Var = (k27) obj;
            if (k27.B0(k27Var.k) == j) {
                uyb.x(k27Var);
            }
        }
        super.onFragmentDestroy();
        az1 az1Var = this.c4;
        if (az1Var != null) {
            LongSparseArray longSparseArray = az1Var.x;
            int size2 = longSparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                zy1 zy1Var = (zy1) longSparseArray.valueAt(i2);
                if (zy1Var.i) {
                    az1Var.w.add(zy1Var.a());
                }
            }
            if (w01.a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            az1Var.a();
        }
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            ar1Var.b1();
        }
        cq1 cq1Var = this.p1;
        if (cq1Var != null && (ffaVar = cq1Var.d0) != null) {
            ffaVar.b(cq1Var.H);
        }
        sq1 sq1Var = this.X1;
        if (sq1Var != null && sq1Var.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        x31 x31Var = this.Y1;
        if (x31Var != null) {
            x31Var.I();
        }
        q qVar = this.q3;
        if (qVar != null) {
            qVar.j();
        }
        xv2 e = xv2.e();
        if (e.l == this.H9) {
            e.W = null;
            e.a0 = null;
            e.Y = null;
            e.l = null;
            e.c0 = null;
            e.j();
        }
        getNotificationCenter().j(this.ca);
        kk7.e().j(this.da);
        getNotificationCenter().j(this.ea);
        getNotificationCenter().j(this.fa);
        D7();
        my myVar = this.d6;
        if (myVar != null) {
            gl.r(myVar);
            this.d6 = null;
        }
        kk7 notificationCenter = getNotificationCenter();
        pr1 pr1Var = this.Ka;
        notificationCenter.getClass();
        boolean z2 = w01.a;
        if (Thread.currentThread() == a.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(pr1Var)) {
                notificationCenter.o();
            }
            na7 messagesController = getMessagesController();
            long j2 = this.l6;
            if (this.g4 == 1) {
                z = true;
            } else {
                z = false;
            }
            messagesController.Q4(j2, z, false);
            if (this.w4) {
                this.w4 = false;
                getMessagesController().d4(this.l6);
            }
            wtc wtcVar = this.pb;
            if (wtcVar != null) {
                wtcVar.a();
                this.pb = null;
            }
            getNotificationCenter().n(this, kk7.s);
            if (this.g4 == 0 && gl.O1()) {
                getNotificationCenter().k(kk7.g0, Long.valueOf(this.l6), Long.valueOf(d()), Boolean.TRUE);
            }
            if (this.f != null) {
                MediaController w = MediaController.w();
                if (w.T1 == null) {
                    w.T1 = new sv(w, (byte) 9);
                }
                a.d.postDelayed(w.T1, 5000L);
            }
            h24 h24Var = this.T3;
            if (h24Var != null) {
                h24Var.g();
            }
            if (this.f != null) {
                getMessagesController().h1.remove(Long.valueOf(this.f.id));
            }
            gl.y2(getParentActivity(), this.classGuid);
            x31 x31Var2 = this.Y1;
            if (x31Var2 != null) {
                x31Var2.e1();
                this.Y1 = null;
            }
            gl.K3(getParentActivity());
            if (hc2.T(this.e)) {
                getMessagesController().b5(this.e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().b5(getMessagesController().K0(Long.valueOf(this.r8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            bt1 bt1Var = this.u9;
            if (bt1Var != null) {
                bt1Var.e(false);
            }
            lq1 lq1Var = this.B0;
            if (lq1Var != null) {
                lq1Var.N();
            }
            jr1 jr1Var = this.Ta;
            if (jr1Var != null) {
                jr1Var.b();
            }
            this.ya = null;
            ui5 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!ud ? 1 : 0);
                ui5 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i3 = 0;
                    while (i3 < parentLayout2.getPulledDialogs().size()) {
                        if (((cd0) parentLayout2.getPulledDialogs().get(i3)).b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                }
            }
            ud = false;
            c01 c01Var = this.ec;
            if (c01Var != null) {
                c01Var.a(false);
                this.ec = null;
            }
            qb2 qb2Var = this.Da;
            mu1 mu1Var = qb2Var.a;
            ArrayList arrayList2 = qb2Var.f;
            ArrayList arrayList3 = qb2Var.e;
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                mu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList3.get(i4)).intValue(), false);
            }
            arrayList3.clear();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                mu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i5)).intValue(), false);
            }
            arrayList2.clear();
            yo8 yo8Var = this.u8;
            if (yo8Var != null) {
                yo8Var.b(true);
                this.u8 = null;
            }
            jra jraVar = this.Yc;
            if (jraVar != null) {
                jraVar.setMessageCell(null);
                gl.B2(this.Yc);
                this.Yc = null;
                return;
            }
            return;
        }
        wn4.j("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Ob = true;
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27.K4(k27Var.k)) {
            MediaController.w().l(true, true, false, false);
        } else {
            MediaController.w().o0(this.M8, null, null, false);
        }
        jra jraVar = this.Yc;
        if (jraVar != null) {
            jraVar.setMessageCell(null);
            gl.B2(this.Yc);
            this.Yc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        x31 x31Var;
        x31 x31Var2;
        boolean z;
        boolean z2;
        boolean z3;
        x02 x02Var;
        ar1 ar1Var = this.a0;
        boolean z4 = false;
        if (ar1Var != null && i == 2 && ar1Var.Z3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z3a.B(ar1Var.R).n0(ar1Var.Y3, ar1Var.Z3);
            }
            ar1Var.Z3 = null;
            ar1Var.Y3 = null;
        }
        sq1 sq1Var = this.X1;
        if (sq1Var != null && sq1Var.getAdapter() != null) {
            kz6 adapter = this.X1.getAdapter();
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
            x31 x31Var3 = this.Y1;
            if (x31Var3 != null) {
                x31Var3.d2.Z();
            }
            xd2 xd2Var = this.ya;
            if (xd2Var != null && (x02Var = xd2Var.R1) != null) {
                x02Var.d2.Z();
            }
        } else if ((i == 5 || i == 30) && (x31Var = this.Y1) != null) {
            if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                x31Var.l1();
            }
        } else if ((i == 17 || i == 18) && (x31Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x31Var2.d2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z4 = true;
            }
            chatAttachAlertPhotoLayout.V(z4);
            this.Y1.d2.Z();
        } else if (i == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                String M0 = k96.M0(2131689472, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131747119, null);
                alertDialog$Builder.g(k96.M0(2131747107, null), new eo1(this, (byte) 4));
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                alertDialog$Builder.o();
            }
        } else if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ia(0);
        } else if (i == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ia(2);
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
                    rgc.l(this.e, null, this.q8, null, getParentActivity(), this, getAccountInstance());
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
                rgc.m(user2, z2, z3, getParentActivity(), getMessagesController().W1(this.f.id), getAccountInstance());
                return;
            }
            rgc.h(getParentActivity(), null, i);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onResume():void");
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
            lx4 lx4Var = this.J;
            if (lx4Var != null) {
                Iterator it = lx4Var.w.iterator();
                while (it.hasNext()) {
                    gl0 gl0Var = ((il0) it.next()).h0;
                    if (gl0Var != null) {
                        gl0Var.h = true;
                    }
                }
            }
            lx4 lx4Var2 = this.K;
            if (lx4Var2 != null) {
                Iterator it2 = lx4Var2.w.iterator();
                while (it2.hasNext()) {
                    gl0 gl0Var2 = ((il0) it2.next()).h0;
                    if (gl0Var2 != null) {
                        gl0Var2.h = true;
                    }
                }
            }
            Paint paint = this.W8;
            if (paint != null) {
                paint.setColor(getThemedColor(bkb.r8));
            }
            RadialProgressView radialProgressView = this.s0;
            if (radialProgressView != null) {
                if (M7()) {
                    i2 = bkb.Ja;
                } else {
                    i2 = bkb.Yc;
                }
                radialProgressView.setProgressColor(getThemedColor(i2));
            }
            er1 er1Var = this.d1;
            if (er1Var != null) {
                er1Var.setAccentColor(getThemedColor(bkb.Ei));
            }
            xw0 xw0Var = this.I0;
            if (xw0Var != null && xw0Var.getBackground() != null && ((themedColor4 = getThemedColor(bkb.Ei)) != this.L0 || this.Db != bkb.I.o())) {
                this.L0 = themedColor4;
                this.Db = bkb.I.o();
                Drawable background = this.I0.getBackground();
                bkb.F1(background, themedColor4, false);
                bkb.F1(background, sjb.b(themedColor4), true);
            }
            mb();
        } catch (Exception e) {
            fa4.g(e, true);
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
                numberTextView.setTextColor(getThemedColor(bkb.Ve));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(bkb.Ue));
            }
            l46 l46Var = this.i2;
            if (l46Var != null && this.S0) {
                l46Var.setEmojiColor(getThemedColor(bkb.We));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(bkb.x6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(bkb.Ei)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(bkb.G6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            jd8 jd8Var = this.ld;
            if (jd8Var != null && (i = this.T0) >= 0) {
                jd8Var.setColor(getThemedColor(i));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(bkb.o7);
                for (p7 p7Var : set2) {
                    if (p7Var != null) {
                        p7Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int w0 = bkb.w0(null, bkb.o7, false);
                for (p7 p7Var2 : set) {
                    if (p7Var2 != null) {
                        p7Var2.a(w0, w0);
                    }
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        int[] iArr;
        av1 av1Var;
        super.onTransitionAnimationStart(z, z2);
        System.currentTimeMillis();
        int i = kk7.r;
        int i2 = kk7.J2;
        int i3 = kk7.F0;
        int i4 = kk7.s;
        if (z) {
            if (!this.g6) {
                this.g6 = true;
                Qc();
            }
            iArr = this.ca == 0 ? new int[]{i, i4, i3, i2, kk7.C} : new int[]{i, i4, i3, i2};
            this.f6 = false;
            if (!z2) {
                this.h6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = l7c.D(this.f) ? new int[]{i, i4, i3, i2, kk7.U} : null;
            ar1 ar1Var = this.a0;
            if (ar1Var != null && (av1Var = ar1Var.I2) != null) {
                gl.r(av1Var);
                ar1Var.I2 = null;
            }
        }
        j5();
        this.ca = getNotificationCenter().q(iArr, this.ca, true);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        boolean z;
        int i2;
        int i3;
        if (i == 0) {
            X9();
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
            X9();
            y5();
            jd8 jd8Var = this.ld;
            if (jd8Var != null) {
                jd8Var.setAnimatedVisibility(this.fd.e);
            }
        } else {
            int i6 = 8;
            if (i == 3) {
                fm0 fm0Var = this.gd;
                float f3 = 1.0f - fm0Var.e;
                this.b1.setAlpha(f3);
                ez1 ez1Var = this.b1;
                if (f3 > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                ez1Var.setVisibility(i3);
                float f4 = 1.0f - fm0Var.e;
                kxb kxbVar = this.g2;
                if (kxbVar != null) {
                    kxbVar.setAlpha(f4);
                    kxb kxbVar2 = this.g2;
                    if (f4 <= 0.0f) {
                        i5 = 8;
                    }
                    kxbVar2.setVisibility(i5);
                }
            } else if (i == 4) {
                yc ycVar = this.Z3;
                fm0 fm0Var2 = this.hd;
                if (ycVar != null) {
                    float f5 = fm0Var2.e;
                    ycVar.setAlpha(f5);
                    yc ycVar2 = this.Z3;
                    if (f5 > 0.0f) {
                        i6 = 0;
                    }
                    ycVar2.setVisibility(i6);
                }
                if (fm0Var2.e < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                ry1 ry1Var = this.Z;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                ry1Var.setVisibility(i2);
                r5();
                if (fm0Var2.e >= 1.0f) {
                    z2 = false;
                }
                jq1 jq1Var = this.A0;
                if (z2) {
                    i4 = 0;
                }
                jq1Var.setVisibility(i4);
                y5();
                B5();
                A5();
                this.glassEngine.g();
            } else if (i == 5) {
                q5();
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.setSearchFactor(f);
                }
            } else if (i == 6) {
                v5();
            }
        }
    }

    public final void p5() {
        int m7 = (int) (m7(gxb.c) + this.U.getInputBubbleHeight() + this.w.d() + gl.L(9.0f) + gl.L(7.0f));
        this.Z.setFadeZoneBottom(m7);
        int b = moe.b(gl.L(36.0f) + (this.m1.getMeasuredHeight() - m7), 0, this.m1.getMeasuredHeight());
        int measuredWidth = this.m1.getMeasuredWidth();
        Rect rect = vd;
        rect.set(0, 0, measuredWidth, b);
        rect.set(0, this.Xa, this.A0.getMeasuredWidth(), gl.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Ya) - m7));
    }

    public final void p6(View view) {
        q6(view, false);
    }

    public final float p7(gb2 gb2Var, float f) {
        int[] iArr = this.Kb;
        gb2Var.getLocationInWindow(iArr);
        int i = iArr[1];
        this.m1.getLocationInWindow(iArr);
        return (i - iArr[1]) + f;
    }

    public final void p8(Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        mu1 mu1Var;
        int i;
        int i2;
        TLRPC.TL_forumTopic f;
        if (num.intValue() != d()) {
            this.Vc = false;
            ol1 ol1Var = this.rc;
            if (ol1Var != null) {
                gl.r(ol1Var);
                this.rc.run();
                this.rc = null;
            }
            vu1 vu1Var = this.uc;
            if (vu1Var != null && num.intValue() == 0) {
                vu1Var.b(0, 0L);
            }
            kxb kxbVar = this.g2;
            long intValue = num.intValue();
            ArrayList l = na7.q1(kxbVar.e).g4.l(-kxbVar.f);
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
                this.Ab = SystemClock.uptimeMillis();
                this.H7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    cb(d());
                } else if (d() == 0) {
                    cb(num.intValue());
                } else {
                    this.F7 = -1;
                }
                getConnectionsManager().cancelRequestsForGuid(this.classGuid);
                getMessagesStorage().j(this.classGuid);
                this.classGuid = ConnectionsManager.generateClassGuid();
                Za();
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
                    arrayList.add(new k27(getCurrentAccount(), message, false, false));
                    mu1Var = this;
                    mu1Var.Db(arrayList, this.e, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    mu1Var = this;
                    mu1Var.r4 = null;
                    mu1Var.p4 = null;
                    mu1Var.m4 = null;
                    mu1Var.F5 = null;
                    mu1Var.A4 = 0;
                    mu1Var.B4 = 0;
                    mu1Var.C4 = 0;
                    mu1Var.s4 = 0L;
                    mu1Var.t4 = 0;
                    mu1Var.u4 = null;
                    mu1Var.x4 = false;
                    mu1Var.v4 = false;
                }
                vs1 vs1Var = mu1Var.D0;
                if (vs1Var != null) {
                    if (vs1Var.J >= 0 && !vs1Var.I()) {
                        vs1 vs1Var2 = mu1Var.D0;
                        vs1Var2.r(vs1Var2.J);
                    } else {
                        vs1 vs1Var3 = mu1Var.D0;
                        if (vs1Var3.J < 0 && vs1Var3.I()) {
                            mu1Var.D0.i(0);
                        }
                    }
                    mu1Var.D0.O();
                }
                mu1Var.G6();
                mu1Var.kd(true);
                mu1Var.p1.n(true);
                if (tL_forumTopic2 != null) {
                    mu1Var.qd();
                } else {
                    mu1Var.p1.b();
                }
                mu1Var.g2.setCurrentTopic(mu1Var.d());
                mu1Var.nd(true);
                mu1Var.Dc(true);
                mu1Var.getMessagesController().P4(-mu1Var.a(), mu1Var.d());
                mu1Var.Oa();
                mu1Var.x7(true);
                mu1Var.w7(true);
                mu1Var.C4(true, true);
                if (mu1Var.a0 != null) {
                    if (!l7c.w(mu1Var.f)) {
                        mu1Var.a0.J0(false);
                    }
                    mu1Var.a0.m2(true);
                }
                if (tL_forumTopic2 != null) {
                    mu1Var.getMessagesController().g4.k(mu1Var.l6, tL_forumTopic2.id);
                    i = tL_forumTopic2.unread_reactions_count;
                } else {
                    i = 0;
                }
                mu1Var.A1 = i;
                if (tL_forumTopic2 != null) {
                    i2 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i2 = 0;
                }
                mu1Var.B1 = i2;
                mu1Var.Xc(false);
                mu1Var.Wc(false);
                mu1Var.od();
                du1 du1Var = mu1Var.Wc;
                if (du1Var != null && mu1Var.actionBar.o0) {
                    du1Var.k(null);
                }
                if (l7c.w(mu1Var.f)) {
                    mu1Var.getMediaDataController().K0(zc7.a(mu1Var.l6, num.intValue()), true);
                }
            }
        }
    }

    public final void p9() {
        na7 messagesController = getMessagesController();
        long j = this.l6;
        long j2 = this.d7;
        int i = this.classGuid;
        int i2 = this.g4;
        long j3 = this.s4;
        int i3 = this.C4;
        int i4 = this.n6;
        this.n6 = i4 + 1;
        messagesController.a3(j, j2, false, 30, 0, 0, true, 0, i, 0, i2, j3, i3, i4, this.x4);
    }

    public final void pa(int i, boolean z) {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ui5Var.getLastFragment() == this) {
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
            mu1 mu1Var = new mu1(bundle);
            if (this.x4) {
                mm4.a(mu1Var, zc7.a(a(), d()));
            }
            mu1Var.n9 = new eq1(this);
            presentFragment(mu1Var, false);
        }
    }

    public final void pb(ClipData clipData, boolean z, int i) {
        int i2 = 0;
        if (this.H5 != null) {
            while (i2 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    ub(i, arrayList, z);
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
        ub(i, arrayList2, z);
    }

    public final void pc(float f) {
        View view = this.v9;
        if (view instanceof gb2) {
            ((gb2) view).setSlidingOffset(f);
        } else if (view instanceof uk1) {
            ((uk1) view).setWalletSlidingOffset(f);
        }
    }

    public final void pd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        cq1 cq1Var = this.p1;
        if (cq1Var != null && (tL_forumTopic = this.r4) != null) {
            cq1Var.setTitle(tL_forumTopic.title);
        }
        qd();
    }

    @Override
    public final o72 q() {
        return this.p1;
    }

    public final void q5() {
        int i;
        if (this.p1 != null) {
            float actionModeFactor = (1.0f - this.id.e) * (1.0f - this.actionBar.getActionModeFactor());
            float R1 = gl.R1(0.95f, 1.0f, actionModeFactor);
            this.p1.setScaleX(R1);
            this.p1.setScaleY(R1);
            this.p1.setAlpha(actionModeFactor);
            cq1 cq1Var = this.p1;
            if (actionModeFactor > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            cq1Var.setVisibility(i);
        }
    }

    public final void q6(View view, boolean z) {
        boolean z2;
        Cb(view);
        if (view != this.y1) {
            z2 = true;
        } else {
            z2 = false;
        }
        r6(z, z2, 0.2f);
    }

    public final void q7(boolean z) {
        int i;
        int i2;
        if (this.g4 == 7) {
            cd5 a = cd5.a(this.currentAccount);
            int i3 = this.classGuid;
            int i4 = this.K3;
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int i5 = i4 + i2;
            bd5 b = a.b(this.d4);
            ArrayList arrayList = b.a;
            if (i5 >= 0 && i5 < arrayList.size()) {
                b.l = i5;
                kk7.f(a.a).k(kk7.H0, Integer.valueOf(i3), Integer.valueOf(b.m), Boolean.valueOf(b.n), Integer.valueOf(b.b()), Integer.valueOf(b.l), Integer.valueOf(((k27) arrayList.get(i5)).k.id));
                return;
            }
            return;
        }
        hq6 mediaDataController = getMediaDataController();
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
        bc(false);
    }

    public final void q8(Long l, Boolean bool) {
        int i;
        int i2;
        if (l.longValue() != d()) {
            this.Ab = SystemClock.uptimeMillis();
            this.H7 = bool.booleanValue();
            if (l.longValue() == 0) {
                cb(d());
            } else if (d() == 0) {
                cb(l.longValue());
            } else {
                this.F7 = -1;
            }
            getConnectionsManager().cancelRequestsForGuid(this.classGuid);
            getMessagesStorage().j(this.classGuid);
            this.classGuid = ConnectionsManager.generateClassGuid();
            Za();
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
                getMessagesController().g4.k(this.l6, cf3.n(f.from_id));
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
            G6();
            kd(true);
            this.p1.n(true);
            this.p1.b();
            this.g2.setCurrentTopic(l.longValue());
            nd(true);
            Dc(true);
            getMessagesController().P4(-a(), d());
            y7(true);
            w7(true);
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.J0(false);
                this.a0.m2(true);
            }
            C4(true, true);
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
            Xc(false);
            Wc(false);
            od();
            du1 du1Var = this.Wc;
            if (du1Var != null && this.actionBar.o0) {
                du1Var.k(null);
            }
        }
    }

    public final void q9(int i, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        k27 k27Var;
        k27 k27Var2;
        if (this.Pb != i) {
            return;
        }
        if (bool.booleanValue()) {
            this.Y5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                this.Y5 = null;
                o27 o27Var = this.x5;
                if (o27Var != null) {
                    int i2 = this.currentAccount;
                    CharSequence fieldText = this.a0.getFieldText();
                    k27 k27Var3 = this.F5;
                    if (k27Var3 == this.m4) {
                        k27Var2 = null;
                    } else {
                        k27Var2 = k27Var3;
                    }
                    o27Var.e(i2, null, fieldText, k27Var2, this.D5, this.H5);
                }
                w6();
                return;
            }
            boolean z = webPage instanceof TLRPC.TL_webPagePending;
            if (z) {
                this.a6 = str;
            }
            if (this.h != null && z) {
                webPage.url = str;
            }
            o27 o27Var2 = this.x5;
            if (o27Var2 != null) {
                int i3 = this.currentAccount;
                CharSequence fieldText2 = this.a0.getFieldText();
                k27 k27Var4 = this.F5;
                if (k27Var4 == this.m4) {
                    k27Var = null;
                } else {
                    k27Var = k27Var4;
                }
                o27Var2.e(i3, null, fieldText2, k27Var, this.D5, this.H5);
            }
            Ub(true, this.Y5, false);
            return;
        }
        this.Y5 = null;
        w6();
    }

    public final void qa(TLRPC.Chat chat) {
        boolean z;
        je5 je5Var = this.K1;
        if (je5Var != null && je5Var.W) {
            je5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        je5 je5Var2 = this.L1;
        if (je5Var2 != null && je5Var2.W) {
            je5Var2.f(true);
            z = true;
        }
        if (z) {
            gl.d3(new aj1(this, chat, (byte) 13), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.id.a(true, true);
            r7 r7Var = this.j0;
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            fq2 fq2Var = this.f0;
            if (fq2Var != null) {
                fq2Var.b(false);
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
            bd(0, 0, -1);
            Dc(false);
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
            this.Lc = true;
            this.k5 = false;
            r7Var6.G(false);
            this.Lc = false;
        }
        kb(chat, null);
        Uc(0, true);
    }

    public final void qb(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        long j2;
        if (l5()) {
            if (!TextUtils.isEmpty(str)) {
                x3a b = x3a.b(str, this.l6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b.K = Q6();
                b.O = j;
                b.L = z2;
                b.Q = 0L;
                b.R = c7();
                b.T = this.y5;
                z3a.B(this.currentAccount).q0(b);
                j2 = 0;
            } else {
                j2 = j;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                x3a g = x3a.g((TLRPC.User) obj, this.l6, null, null, null, null, z, i, 0);
                g.K = Q6();
                g.O = j2;
                g.L = z2;
                g.Q = 0L;
                g.R = c7();
                g.T = this.y5;
                getSendMessagesHelper().q0(g);
                j2 = 0;
            }
            z4();
        }
    }

    public final void qc(k27 k27Var, boolean z) {
        TL_iv.RichMessage richMessage;
        if (k27Var != null && getParentActivity() != null) {
            fd2 fd2Var = this.va;
            if (fd2Var != null && fd2Var.d()) {
                this.va.setHiddenByScroll(true);
            }
            if (this.k0 != null) {
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar.o0) {
                    aVar.n(true);
                    this.a0.F1();
                }
            }
            TLRPC.Message message = k27Var.k;
            if (message != null && (richMessage = message.rich_message) != null) {
                hd9 hd9Var = new hd9(richMessage);
                hd9Var.K = this;
                hd9Var.r = k27Var;
                presentFragment(hd9Var);
                return;
            }
            this.X1.getAdapter().g0 = false;
            this.a0.setVisibility(0);
            Ob(true, null, k27Var, null, null, true, 0, null, false, 0L);
            Dc(false);
            if (!z) {
                T4();
            } else {
                this.y5 = u47.b(k27Var.k.suggested_post);
            }
            this.a0.w1(false, false, true);
            Uc(0, true);
            ud(false);
            if (!z && !k27Var.r1 && !k27.a4(k27Var.k) && this.g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().h1(this.l6);
                tL_messages_getMessageEditData.id = k27Var.e1();
                this.G5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new xk1(this, (byte) 3));
                return;
            }
            ar1 ar1Var = this.a0;
            ow1 ow1Var = ar1Var.v2;
            if (ow1Var != null) {
                ow1Var.setEnabled(true);
                ar1Var.v2.h(false);
            }
        }
    }

    public final void qd() {
        cq1 cq1Var;
        cq1 cq1Var2;
        if (l7c.w(this.f) && (cq1Var2 = this.p1) != null) {
            cq1Var2.getAvatarImageView().setVisibility(0);
            this.p1.b();
        } else if (this.r4 != null && (cq1Var = this.p1) != null) {
            cq1Var.getAvatarImageView().setVisibility(0);
            mm4.q(this.p1.getAvatarImageView(), this.r4, true, true, this.Ba);
        }
    }

    @Override
    public final boolean r(final defpackage.cj3 r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, defpackage.qvb r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.r(cj3, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, qvb):boolean");
    }

    public final void r5() {
        boolean z;
        vq1 vq1Var;
        if (this.Aa != null) {
            return;
        }
        int i = 0;
        if (this.hd.e >= 1.0f && ((vq1Var = this.F1) == null || vq1Var.getPositionAnimated() <= 0.0f)) {
            z = false;
        } else {
            z = true;
        }
        si9 si9Var = this.m1.M;
        if (!z) {
            i = 4;
        }
        si9Var.setVisibility(i);
    }

    public final void r6(boolean z, boolean z2, float f) {
        boolean z3;
        ValueAnimator ofFloat;
        dz1 dz1Var;
        gb2 gb2Var;
        if (f > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        View view = this.Z8;
        if (view instanceof gb2) {
            gb2 gb2Var2 = (gb2) view;
            gb2Var2.setInvalidatesParent(z3);
            if (z3) {
                Xa(gb2Var2);
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
            ValueAnimator valueAnimator = this.Jc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.Y8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
            if (z) {
                tq9.d(new gl1(this, (byte) 3));
            }
        } else {
            float f3 = this.X8;
            this.b9 = f3 / max;
            this.Y8 = false;
            ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new rm1(this, max, (byte) 0));
        if ((!z3 || z2) && (dz1Var = this.y1) != null) {
            Property property = View.ALPHA;
            if (z3) {
                f2 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(dz1Var, property, f2));
        }
        this.f9.playTogether(arrayList);
        this.f9.setInterpolator(s33.h);
        this.f9.setDuration(320L);
        View view2 = this.Z8;
        if (view2 instanceof gb2) {
            gb2Var = (gb2) view2;
        } else {
            gb2Var = null;
        }
        this.f9.addListener(new qw(this, z3, gb2Var, (byte) 1));
        if (this.Z8 != null && this.a9 <= 0.0f) {
            Cb(null);
        }
        this.f9.start();
    }

    public final void r7() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.r7():void");
    }

    public final void r8(int i) {
        this.actionBar.setSubtitle(k96.G(i, "messages", new Object[0]));
    }

    public final void r9(CharSequence charSequence, na7 na7Var, boolean z) {
        boolean z2;
        String str;
        String charSequence2;
        i4c[] i4cVarArr;
        if (this.X5 != 0) {
            getConnectionsManager().cancelRequest(this.X5, true);
            this.X5 = 0;
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = gl.S.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (i4cVarArr = (i4c[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), i4c.class)) != null && i4cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (i4c i4cVar : i4cVarArr) {
                    arrayList.add(i4cVar.getURL());
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
            fa4.g(e, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                str = charSequence;
            } else {
                gl.c3(new vm1(this, (byte) 5));
                return;
            }
        }
        if (arrayList == null) {
            gl.c3(new vm1(this, (byte) 4));
            return;
        }
        str = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (this.h != null && na7Var.z2 == 2) {
            gl.c3(new dl1(this, na7Var, charSequence, z));
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
            int i2 = this.Pb + 1;
            this.Pb = i2;
            wm1 wm1Var = new wm1(this, i2, getwebpagepreview, (byte) 0);
            HashMap hashMap = this.Qb;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.Qb = hashMap;
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) hashMap.get(getwebpagepreview.message);
            if (webPage2 != null) {
                wm1Var.a(Boolean.TRUE, webPage2);
                return;
            }
            p pVar = new p(this, getwebpagepreview, wm1Var, (byte) 6);
            if (this.X5 != 0) {
                getConnectionsManager().cancelRequest(this.X5, true);
            }
            this.X5 = getConnectionsManager().sendRequestTyped(getwebpagepreview, new hc((byte) 0), new ae2(this, pVar, (byte) 6));
            getConnectionsManager().bindRequestToGuid(this.X5, this.classGuid);
        }
    }

    public final void ra(String str) {
        boolean z;
        boolean z2;
        String str2;
        int i;
        r7 r7Var;
        int i2;
        je5 je5Var = this.K1;
        if (je5Var != null && je5Var.W) {
            je5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        je5 je5Var2 = this.L1;
        if (je5Var2 != null && je5Var2.W) {
            je5Var2.f(true);
            z = true;
        }
        if (z) {
            gl.d3(new al1(this, str, (byte) 4), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.id.a(true, true);
            r7 r7Var2 = this.j0;
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            fq2 fq2Var = this.f0;
            if (fq2Var != null) {
                fq2Var.b(false);
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
            bd(0, 0, -1);
            Dc(false);
        }
        if ((this.s4 == 0 || this.x4 || (i = this.g4) == 3 || i == 8) && !l7c.B(this.f)) {
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
        hq6 mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.I3 = str2;
        mediaDataController.Z1(str2, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        Uc(0, true);
    }

    public final void rb(int i, ArrayList arrayList, boolean z, boolean z2) {
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
                jm6 jm6Var = (jm6) obj;
                ?? obj2 = new Object();
                if (!jm6Var.b && (str2 = jm6Var.h) != null) {
                    obj2.c = str2;
                } else {
                    String str3 = jm6Var.I;
                    if (str3 != null) {
                        obj2.c = str3;
                    }
                }
                obj2.e = jm6Var.c;
                obj2.f = jm6Var.g;
                obj2.p = jm6Var.d();
                obj2.o = jm6Var.b;
                obj2.q = jm6Var.j();
                obj2.z = jm6Var.m;
                obj2.A = jm6Var.P;
                CharSequence charSequence = jm6Var.a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.i = jm6Var.n;
                obj2.j = jm6Var.r;
                obj2.h = jm6Var.x;
                obj2.k = jm6Var.s;
                obj2.r = jm6Var.L;
                obj2.x = jm6Var.c();
                arrayList2.add(obj2);
                jm6Var.e();
            }
            y6(((y3a) arrayList2.get(0)).d, ((y3a) arrayList2.get(0)).i);
            z3a.W(getAccountInstance(), arrayList2, this.l6, this.F5, this.m4, null, this.D5, z2, true, null, null, z, i, 0, ((y3a) arrayList2.get(0)).t, null, Q6(), 0L, false, 0L, c7(), this.y5, null, false);
            z4();
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.setFieldText("");
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
            ad(true);
        }
    }

    public final void rc() {
        qh4 qh4Var = this.J9;
        if (qh4Var != null && !qh4Var.c) {
            qh4Var.c(false);
            try {
                this.J9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void rd() {
        boolean z;
        int i;
        float f;
        org.telegram.ui.ActionBar.a aVar;
        if (this.m0 == null) {
            return;
        }
        int i2 = 0;
        if (b8() && !this.r0 && ((aVar = this.actionBar) == null || !aVar.y())) {
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
                i2 = gl.L(48.0f);
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
        id();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.n8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.x4) {
            if (this.f != null) {
                TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.f.id));
                if (V1 != null) {
                    this.f = V1;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.e.id));
                if (K0 != null) {
                    this.e = K0;
                } else {
                    return;
                }
            }
            cq1 cq1Var = this.p1;
            if (cq1Var != null) {
                cq1Var.b();
            }
        }
    }

    public final je5 s4(float f, int i, int i2, boolean z) {
        long j;
        je5 je5Var = new je5(getParentActivity(), i);
        je5Var.p(true);
        je5Var.h = gl.L(f);
        if (z) {
            j = -1;
        } else {
            j = 2300;
        }
        je5Var.d = j;
        je5Var.U = true;
        je5Var.e = true;
        je5Var.j(z);
        je5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
        je5Var.v0 = gl.L(4.0f);
        je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        je5Var.k(this.L);
        FrameLayout.LayoutParams e = nme.e(-1, 150, 55);
        at1 at1Var = this.m1;
        if (i2 >= 0) {
            at1Var.addView(je5Var, i2, e);
            return je5Var;
        }
        at1Var.addView(je5Var, e);
        return je5Var;
    }

    public final void s5() {
        float f;
        cx1 cx1Var;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + gl.L(15.0f) + m7(gxb.c) + this.w.d();
        ar1 ar1Var = this.a0;
        if (ar1Var != null && (cx1Var = ar1Var.n0) != null) {
            cx1Var.setTranslationY(-inputBubbleHeight);
        }
        sq1 sq1Var = this.X1;
        if (sq1Var != null) {
            if (sq1Var.g()) {
                f = gl.L(5.0f);
            } else {
                f = -inputBubbleHeight;
            }
            sq1Var.setTranslationY(f);
        }
    }

    public final void s6(Runnable runnable) {
        kk7.f(this.currentAccount).d(runnable);
    }

    public final boolean s7() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.o6;
        for (int i = 0; i < sparseArrayArr.length; i++) {
            try {
                for (int i2 = 0; i2 < sparseArrayArr[i].size(); i2++) {
                    k27 k27Var = (k27) sparseArrayArr[i].valueAt(i2);
                    if (k27Var != null && (message = k27Var.k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void s8(int i) {
        if (i != 0) {
            gl.c3(new ml1(this, i, (byte) 6));
        } else {
            this.actionBar.setSubtitle(k96.M0(2131748000, null));
        }
    }

    public final void s9(int i, k27 k27Var) {
        if (i == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.id = getMessagesController().o1(this.f);
            getConnectionsManager().sendRequest(tL_contacts_acceptContact, new xk1(this, (byte) 4));
            return;
        }
        x3a g = x3a.g(getUserConfig().f(), this.l6, k27Var, this.m4, null, null, true, 0, 0);
        g.K = Q6();
        z3a.B(this.currentAccount).q0(g);
        if (this.g4 == 0) {
            T9(false);
        }
        w7(false);
    }

    public final void sa(TLRPC.User user) {
        boolean z;
        je5 je5Var = this.K1;
        if (je5Var != null && je5Var.W) {
            je5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        je5 je5Var2 = this.L1;
        if (je5Var2 != null && je5Var2.W) {
            je5Var2.f(true);
            z = true;
        }
        if (z) {
            gl.d3(new fn1(this, user, (byte) 1), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.id.a(true, true);
            r7 r7Var = this.j0;
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
            q6 q6Var = this.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            fq2 fq2Var = this.f0;
            if (fq2Var != null) {
                fq2Var.b(false);
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
            bd(0, 0, -1);
            Dc(false);
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
            this.Lc = true;
            this.k5 = false;
            r7Var6.G(false);
            this.Lc = false;
        }
        kb(null, user);
        Uc(0, true);
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        wl1 wl1Var = this.Na;
        if (wl1Var != null) {
            gl.r(wl1Var);
        }
        ar1 ar1Var = this.a0;
        if (ar1Var != null && this.m1 != null && ar1Var.getAdjustPanLayoutHelper() != null && !this.a0.getAdjustPanLayoutHelper().f) {
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

    public final de2 sb(k27 k27Var) {
        if (k27Var != null && !k27Var.N3() && k27Var.k4() && k27Var.k.ttl == Integer.MAX_VALUE) {
            long R = getMessagesController().R(k27Var.e1(), this.l6);
            k27Var.I0 = true;
            if (k27Var.O3() || (!k27Var.f4() && !k27Var.R4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(k27Var);
                Pc(arrayList, true);
            }
            return new de2(this, R, k27Var, (byte) 14);
        }
        return null;
    }

    public final void sc() {
        long j;
        my myVar = this.m8;
        if (myVar != null) {
            gl.r(myVar);
        }
        my myVar2 = new my(this, (byte) 19);
        this.m8 = myVar2;
        if (this.h8 != null) {
            j = 2500;
        } else {
            j = 1000;
        }
        gl.d3(myVar2, j);
    }

    public final void sd() {
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
        jq1 jq1Var;
        k27 k27Var;
        TLRPC.Message message;
        long j;
        ed0 ed0Var;
        float f;
        float f2;
        ar1 ar1Var;
        int i;
        float f3;
        super.setInPreviewMode(z);
        int i2 = 8;
        boolean z4 = true;
        if (this.f != null && this.q0 != null) {
            TLRPC.UserFull W1 = getMessagesController().W1(this.f.id);
            if (W1 != null && W1.phone_calls_available) {
                this.ia = !this.inPreviewMode;
                this.q0.e(0);
            } else {
                this.ia = false;
                this.q0.e(8);
            }
        }
        cq1 cq1Var = this.p1;
        float f4 = 0.0f;
        if (cq1Var != null) {
            cq1Var.setOccupyStatusBar(!z);
            cq1 cq1Var2 = this.p1;
            if (!this.inPreviewMode) {
                f3 = 52.0f;
            } else {
                f3 = 0.0f;
            }
            cq1Var2.setLayoutParams(nme.d(-2, -1.0f, 51, f3, 0.0f, 52.0f, 0.0f));
        }
        ar1 ar1Var2 = this.a0;
        if (ar1Var2 != null) {
            if (!z) {
                i = 0;
            } else {
                i = 4;
            }
            ar1Var2.setVisibility(i);
        }
        dbb dbbVar = this.s1;
        if (dbbVar != null) {
            if (this.r5 && !z && ((ar1Var = this.a0) == null || !ar1Var.p4)) {
                i2 = 0;
            }
            dbbVar.setVisibility(i2);
        }
        sq1 sq1Var = this.X1;
        if (sq1Var != null) {
            ViewPropertyAnimator animate = sq1Var.animate();
            if (!this.a0.p4 && !isInPreviewMode()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            animate.alpha(f2).setInterpolator(s33.f).start();
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            if (!z) {
                ed0Var = new ed0(false);
            } else {
                ed0Var = null;
            }
            aVar.setBackButtonDrawable(ed0Var);
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
        jq1 jq1Var2 = this.A0;
        if (jq1Var2 != null) {
            int childCount = jq1Var2.getChildCount();
            int i3 = 0;
            while (true) {
                jq1Var = this.A0;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = jq1Var.getChildAt(i3);
                boolean z5 = childAt instanceof gb2;
                if (z5) {
                    k27Var = ((gb2) childAt).getMessageObject();
                } else if (childAt instanceof uk1) {
                    k27Var = ((uk1) childAt).getMessageObject();
                } else {
                    k27Var = null;
                }
                if (k27Var != null && (message = k27Var.k) != null && message.media_unread && message.mentioned) {
                    if (!k27.Q4(message) && !k27Var.g4()) {
                        int i4 = this.D6 - 1;
                        this.D6 = i4;
                        if (i4 <= 0) {
                            this.D6 = 0;
                            this.E6 = true;
                            ac(false);
                        } else {
                            this.y1.c(2, i4, true);
                        }
                        na7 messagesController = getMessagesController();
                        int e1 = k27Var.e1();
                        if (hc2.T(this.e)) {
                            j = this.e.id;
                        } else {
                            j = 0;
                        }
                        messagesController.p3(j, e1, this.l6);
                        k27Var.k.media_unread = false;
                    }
                    if (z5) {
                        gb2 gb2Var = (gb2) childAt;
                        gb2Var.setHighlighted(false);
                        gb2Var.r3();
                    }
                }
                i3++;
            }
            jq1Var.setItemAnimator(null);
        }
        Dc(false);
        gd();
        uq1 uq1Var = this.m2;
        if (uq1Var != null) {
            if (!z && !this.mb) {
                z3 = true;
            } else {
                z3 = false;
            }
            uq1Var.setEnabled(z3);
        }
        uq1 uq1Var2 = this.o2;
        if (uq1Var2 != null) {
            if (!z && !this.mb) {
                z2 = true;
            } else {
                z2 = false;
            }
            uq1Var2.setEnabled(z2);
        }
        yr1 yr1Var = this.M2;
        if (yr1Var != null) {
            yr1Var.setEnabled(!isInPreviewMode());
        }
        at1 at1Var = this.m1;
        if (at1Var != null) {
            if (this.inBubbleMode || this.mb || this.inPreviewMode) {
                z4 = false;
            }
            at1Var.setOccupyStatusBar(z4);
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    public final void t4(k27 k27Var, Integer num) {
        k27 k27Var2 = k27Var.C;
        if (k27Var2 != null) {
            int e1 = k27Var2.e1();
            SparseArray sparseArray = this.I6;
            ArrayList arrayList = (ArrayList) sparseArray.get(e1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(e1, arrayList);
            }
            int e12 = k27Var.e1();
            if (!arrayList.contains(Integer.valueOf(e12))) {
                arrayList.add(Integer.valueOf(e12));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void t5() {
        float d;
        if (this.A0 != null) {
            if (this.mb && this.Aa == null) {
                d = gl.n;
            } else {
                d = this.w.d() + m7(gxb.c) + gl.L(16.0f) + this.Ya + this.bd;
            }
            int i = (int) this.P9;
            kxb kxbVar = this.g2;
            if (kxbVar != null) {
                kxbVar.setSideMenuBackgroundMarginTop(0.0f);
            }
            i4d i4dVar = this.z0;
            boolean z = this.A0.W1;
            jq1 jq1Var = (jq1) i4dVar.a;
            int i2 = (int) d;
            int paddingTop = jq1Var.getPaddingTop();
            int paddingBottom = jq1Var.getPaddingBottom();
            if (paddingTop != i || paddingBottom != i2) {
                int i3 = paddingTop - i;
                if (!z && i3 != 0) {
                    boolean canScrollVertically = jq1Var.canScrollVertically(1);
                    boolean canScrollVertically2 = jq1Var.canScrollVertically(-1);
                    if ((i3 >= 0 || canScrollVertically) && (i3 <= 0 || canScrollVertically2)) {
                        gl.J(jq1Var, new eg(i4dVar, i3, (byte) 25));
                    }
                }
                jq1Var.setPadding(jq1Var.getPaddingLeft(), i, jq1Var.getPaddingRight(), i2);
            }
            az1 az1Var = this.c4;
            if (az1Var != null) {
                RectF rectF = az1Var.b;
                rectF.set(m7(gxb.b), i - this.I, 0.0f, d - this.Ya);
                az1Var.c.set(rectF.left, rectF.top, az1Var.getMeasuredWidth() - rectF.right, az1Var.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void t6(Canvas canvas) {
        float f;
        r7 h7 = h7();
        if (h7 == null) {
            return;
        }
        View view = (View) h7.getParent();
        float x = this.actionBar.getX();
        lwb lwbVar = this.n0;
        if (lwbVar != null) {
            f = lwbVar.getProgress() * this.n0.getContentWidth();
        } else {
            f = 0.0f;
        }
        float x2 = (h7.getX() + (view.getX() + (x - f))) - this.n0.getX();
        float y = (h7.getY() + (view.getY() + this.actionBar.getY())) - this.n0.getY();
        Paint paint = this.zb;
        if (paint == null) {
            paint = new Paint(1);
            this.zb = paint;
        }
        paint.setColor(bkb.p1(this.n0.getProgress(), getThemedColor(bkb.c6)));
        canvas.drawCircle((h7.getWidth() / 2.0f) + x2, (h7.getHeight() / 2.0f) + y, gl.L(23.0f), this.zb);
        canvas.save();
        canvas.translate(x2, y);
        h7.draw(canvas);
        canvas.restore();
    }

    public final boolean t7() {
        bt1 bt1Var = this.u9;
        if (bt1Var != null && bt1Var.w()) {
            return true;
        }
        return false;
    }

    public final void t8(TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = getMessagesController().h1(this.l6);
                tL_messages_getHistory.offset_date = this.O7 + 86400;
                tL_messages_getHistory.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getHistory, new pl(this, tLObject, (byte) 13));
                return;
            }
            this.actionBar.setSubtitle(k96.M0(2131748000, null));
        }
    }

    public final void t9() {
        this.ya = null;
        this.A0.setOnInterceptTouchListener(null);
        xb(this.m1, true);
        je2.e(this.currentAccount).a.clear();
    }

    public final void ta(cs5 cs5Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) cs5Var.A;
        yb2 yb2Var = new yb2(getParentActivity(), this.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new lv6(this, cs5Var, (byte) 13), getResourceProvider());
        yb2Var.e(this.l6, d(), null);
        int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(yb2Var.f);
        cs5Var.q0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b);
    }

    public final bl1 tb(k27 k27Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        if (k27Var != null && !k27Var.N3() && k27Var.k4()) {
            TLRPC.Message message = k27Var.k;
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
                        getMessagesController().r3(this.l6, i2, k27Var.k.random_id);
                        return null;
                    }
                    getMessagesController().s3(this.l6, k27Var.e1(), null, i2, 0L, z2);
                    return null;
                }
                return new bl1(this, k27Var, (byte) 1);
            }
        }
        return null;
    }

    public final void tc(int i) {
        int i2;
        boolean z;
        if (!this.mb && (i2 = i - this.D0.K) >= 0) {
            ArrayList arrayList = this.M6;
            if (i2 < arrayList.size()) {
                k27 k27Var = (k27) arrayList.get(i2);
                SparseArray[] sparseArrayArr = this.o6;
                if (sparseArrayArr[0].get(k27Var.e1(), null) == null && sparseArrayArr[1].get(k27Var.e1(), null) == null) {
                    z = true;
                } else {
                    z = false;
                }
                SparseArray sparseArray = new SparseArray();
                for (int i3 = 0; i3 < sparseArrayArr[0].size(); i3++) {
                    sparseArray.put(sparseArrayArr[0].keyAt(i3), (k27) sparseArrayArr[0].valueAt(i3));
                }
                for (int i4 = 0; i4 < sparseArrayArr[1].size(); i4++) {
                    sparseArray.put(sparseArrayArr[1].keyAt(i4), (k27) sparseArrayArr[1].valueAt(i4));
                }
                o39 o39Var = this.A0;
                ?? obj = new Object();
                obj.d = this;
                obj.b = z;
                obj.c = sparseArray;
                if (!o39Var.c2) {
                    o39Var.l2 = new int[2];
                    o39Var.o1(o39Var, true);
                    o39Var.g2 = obj;
                    o39Var.c2 = true;
                    o39Var.f2 = i;
                    o39Var.e2 = i;
                }
            }
        }
    }

    public final void td(q8c q8cVar) {
        int i;
        int i2;
        jq1 jq1Var = this.A0;
        if (jq1Var != null) {
            if (!this.R4 && this.b8 != null) {
                int childCount = jq1Var.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i3);
                    if (childAt instanceof gb2) {
                        k27 messageObject = ((gb2) childAt).getMessageObject();
                        k27 k27Var = this.b8;
                        if (messageObject == k27Var) {
                            ArrayList arrayList = this.M6;
                            if (arrayList.indexOf(k27Var) >= 0) {
                                i = arrayList.indexOf(this.b8) + this.D0.K;
                                i2 = a7(childAt);
                            }
                        }
                    }
                    i3++;
                }
            }
            i = -1;
            i2 = 0;
            int childCount2 = this.A0.getChildCount();
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.getEditingMessageObject();
            }
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = this.A0.getChildAt(i4);
                if (childAt2 instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt2;
                    k27 messageObject2 = gb2Var.getMessageObject();
                    if (((Boolean) q8cVar.a(messageObject2)).booleanValue()) {
                        messageObject2.M1 = true;
                        gb2Var.z3(messageObject2, gb2Var.getCurrentMessagesGroup(), gb2Var.K2(), gb2Var.L2(), gb2Var.C2(), gb2Var.G2());
                        vs1 vs1Var = this.D0;
                        this.A0.getClass();
                        vs1Var.L(RecyclerView.R(gb2Var));
                    }
                }
            }
            if (i != -1) {
                this.C0.g1(i, i2);
            }
        }
    }

    public final void u4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.u4():void");
    }

    public final void u5() {
        FrameLayout frameLayout = this.f1;
        if (frameLayout != null) {
            float c = this.w.c();
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + c + gl.L(9.0f)) * (-0.5f));
        }
    }

    public final void u6() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        k27 k27Var = this.H5;
        if (k27Var != null && (message = k27Var.k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void u7() {
        gt3 editField;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            if (aVar.y()) {
                this.kd.s(5, false, true);
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
        ar1 ar1Var = this.a0;
        if (ar1Var != null && (editField = ar1Var.getEditField()) != null) {
            if (this.a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        bt1 bt1Var = this.u9;
        if (bt1Var != null) {
            bt1Var.e(true);
            SparseArray sparseArray = this.u9.p0;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
            }
            sparseArray.clear();
        }
        es1 es1Var = this.E9;
        if (es1Var != null) {
            gl.r(es1Var.I);
            es1Var.a();
        }
        ar1 ar1Var2 = this.a0;
        if (ar1Var2 != null) {
            ar1Var2.b0 = false;
        }
        this.F9 = false;
        if (this.Bb != null) {
            C7();
        }
    }

    public final wb2 u8(Context context) {
        yb2 yb2Var = new yb2(context, this.currentAccount, this.j0.getPopupLayout().getSwipeBack(), false, new fq1(this), getResourceProvider());
        this.x1 = yb2Var;
        yb2Var.e(this.l6, d(), null);
        return this.x1.f;
    }

    public final void u9() {
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
                int i = sharedPreferences.getInt("group_convert_time", 0);
                boolean z = w01.a;
                int currentTime = getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i) >= 604800 && this.visibleDialog == null && getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = getParentActivity();
                    yk1 yk1Var = new yk1(this, (byte) 15);
                    yk1 yk1Var2 = new yk1(this, (byte) 16);
                    Pattern pattern = ij.a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String v2 = gl.v2(null, 2131624038);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new xi((byte) 0));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(lcb.e(gl.L(320.0f), gl.L(127.17949f), v2)));
                    frameLayout.addView(view, nme.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.W = frameLayout;
                    hdVar.P0 = 0.3974359f;
                    hdVar.S = k96.M0(2131749389, null);
                    hdVar.U = gl.S2(k96.M0(2131749390, null));
                    alertDialog$Builder.j(k96.M0(2131749391, null), yk1Var);
                    alertDialog$Builder.g(k96.M0(2131752577, null), yk1Var2);
                    showDialog(hdVar);
                }
            }
        }
    }

    public final void ua(long j) {
        int i = 0;
        if (j < 0) {
            if (j == a()) {
                this.p1.e(true, false);
            } else if (getMessagesController().l2(j)) {
                showDialog(new eo2(this, -j, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j);
                if (getMessagesController().A(bundle, this, null, null)) {
                    presentFragment(new mu1(bundle));
                }
            }
        } else if (j != getUserConfig().e()) {
            if (j == a()) {
                this.p1.e(true, false);
                return;
            }
            Bundle k = ls6.k(j, "user_id");
            if (this.h != null && j == this.f.id) {
                k.putLong("dialog_id", this.l6);
            }
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            TLRPC.User user = this.f;
            if (user != null && user.id == j) {
                i = 1;
            }
            profileActivity.x3(i);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void ub(int i, ArrayList arrayList, boolean z) {
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
                    fa4.g(e, true);
                }
            }
            if (!w01.b) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(uri);
                arrayList4 = arrayList5;
            } else {
                String S0 = gl.S0(uri);
                if (S0 == null) {
                    String uri3 = uri.toString();
                    String o = MediaController.o(-1L, uri, "file");
                    if (o == null) {
                        Jb();
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
        z6();
        z3a.U(i, this.l6, 0L, 0L, 0L, getAccountInstance(), this.D5, null, this.F5, this.m4, this.H5, null, null, Q6(), null, null, arrayList2, arrayList3, arrayList4, null, null, null, null, z, false);
        w7(false);
    }

    public final void uc() {
        gl.d0(this.A0, new ra((byte) 2, this, K7()));
    }

    public final void ud(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.ud(boolean):void");
    }

    public final void v4(k27 k27Var, k27 k27Var2) {
        long D1 = k27Var.D1();
        if (D1 != 0) {
            vf6 vf6Var = this.O6;
            ArrayList arrayList = (ArrayList) vf6Var.f(D1);
            if (arrayList == null) {
                arrayList = tb4.s(vf6Var, D1);
            }
            arrayList.add(k27Var);
            if (k27Var2 != null) {
                arrayList.remove(k27Var2);
            }
        }
    }

    public final void v5() {
        int i;
        float f = this.jd.e;
        vc5 vc5Var = this.I1;
        int i2 = 8;
        if (vc5Var != null) {
            vc5Var.setAlpha(f);
            vc5 vc5Var2 = this.I1;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            vc5Var2.setVisibility(i);
        }
        fu fuVar = this.a4;
        if (fuVar != null) {
            float f2 = 1.0f - f;
            fuVar.setAlpha(f2);
            fu fuVar2 = this.a4;
            if (f2 > 0.0f) {
                i2 = 0;
            }
            fuVar2.setVisibility(i2);
        }
    }

    public final lwb v6() {
        long d;
        boolean z;
        if (this.n0 == null && getParentActivity() != null && this.m1 != null) {
            lwb lwbVar = new lwb(getParentActivity(), this.currentAccount, a(), this.Ba, new or1(this));
            this.n0 = lwbVar;
            this.m1.addView(lwbVar, nme.c(-1.0f, -1));
        }
        lwb lwbVar2 = this.n0;
        if (lwbVar2 != null) {
            if (U7()) {
                d = X6();
            } else {
                d = d();
            }
            lwbVar2.setCurrentTopic(d);
            lwb lwbVar3 = this.n0;
            if (this.j0 != null) {
                z = true;
            } else {
                z = false;
            }
            lwbVar3.setMenuAvailable(z);
        }
        return this.n0;
    }

    public final void v7() {
        if (getUserConfig().p()) {
            u21.b0(this).c(k96.M0(2131754485, null)).j();
            getMessagesController().l0(true);
            Pa(this.v5);
            Ra(this.v5);
            return;
        }
        showDialog(new jh8((d) this, 3, true));
    }

    public final void v8() {
        if (na7.q1(this.currentAccount).n2(this.l6, d(), null)) {
            md(true);
            gl.d3(new my(this, (byte) 10), 150L);
            this.j0.U(null, null);
            if (getParentActivity() != null) {
                u21.z(this, 4, 0, this.Ba).j();
                return;
            }
            return;
        }
        View view = this.t1.j;
        if (view instanceof a8) {
            ((a8) view).b();
        }
    }

    public final void v9(TLRPC.TL_game tL_game, k27 k27Var, String str, long j) {
        cc(tL_game, k27Var, str, false, j);
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        edit.putBoolean("askgame_" + j, false).commit();
    }

    public final void va(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap q = z3a.q(1, str);
            PhotoViewer.r0().T1(null, this, this.Ba);
            ArrayList arrayList = new ArrayList();
            jm6 jm6Var = new jm6(0, str, 0, true, 0, 0);
            jm6Var.a = charSequence;
            arrayList.add(jm6Var);
            if (PhotoViewer.r0().V0()) {
                PhotoViewer.r0().B(false, false);
            }
            PhotoViewer.r0().o1(arrayList, 0, 0, false, new gs1(this, q, arrayList), this);
            return;
        }
        y6(charSequence, null);
        j5 accountInstance = getAccountInstance();
        long j = this.l6;
        k27 k27Var = this.F5;
        k27 k27Var2 = this.m4;
        z3a.a0(0, 0, j, 0L, 0L, c7(), accountInstance, this.D5, k27Var, k27Var2, this.H5, this.y5, Q6(), null, null, str, null, null, null, null, true, false, false);
        z4();
    }

    public final void vb(k27 k27Var, gb2 gb2Var, int i, boolean z) {
        boolean z2;
        f27 n7 = n7(k27Var);
        boolean z3 = false;
        if (n7 != null) {
            ArrayList arrayList = n7.d;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (this.o6[i].indexOfKey(((k27) arrayList.get(i2)).e1()) < 0) {
                        break;
                    }
                    i2++;
                } else {
                    n7 = null;
                    break;
                }
            }
        }
        if (n7 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        gb2Var.setDrawSelectionBackground(z2);
        if (n7 == null) {
            z3 = true;
        }
        gb2Var.o3(true, z3, z);
    }

    public final void vc(boolean z) {
        if (!getMessagesController().n2(this.l6, d(), null)) {
            if (z) {
                getNotificationsController().G(this.l6, d(), true);
                return;
            }
            fx0 C = ij.C(this.l6, d(), this.Ba, this);
            boolean Q7 = Q7();
            C.i0 = Q7;
            C.n = Q7;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.l6, d(), false);
        if (!z) {
            u21.z(this, 4, 0, this.Ba).j();
        }
    }

    public final void w4() {
        if (getParentLayout() == null) {
            return;
        }
        dd0.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f, null, this.l6, this.Sa, this.Ra);
    }

    public final void w5() {
        if (this.m1 == null) {
            return;
        }
        this.bd = F4(false);
        this.cd = F4(true);
        this.U.setInputBubbleHeight(this.bd);
        Sc();
        Cc();
        s5();
        p5();
        u5();
        t5();
    }

    public final void w6() {
        m27 m27Var;
        u47 u47Var = this.y5;
        if (u47Var != null) {
            Tb(u47Var);
            return;
        }
        TLRPC.WebPage webPage = this.Y5;
        if (webPage != null) {
            Ub(true, webPage, false);
            return;
        }
        bu1 bu1Var = this.D5;
        k27 k27Var = this.F5;
        if (bu1Var != null) {
            Sb(k27Var, bu1Var);
        } else if (k27Var != null && k27Var != this.m4) {
            Rb(k27Var);
        } else {
            o27 o27Var = this.x5;
            if (o27Var != null && (m27Var = o27Var.b) != null) {
                Qb(m27Var.e);
                return;
            }
            k27 k27Var2 = this.H5;
            if (k27Var2 != null) {
                Ob(true, null, k27Var2, null, null, true, 0, null, false, 0L);
            } else {
                Ub(false, null, true);
            }
        }
    }

    public final void w7(boolean z) {
        Pb(false, null, null, null, null, true, 0, null, false, 0L, null, z);
    }

    public final void w8() {
        if (this.m3.getAlpha() != 0.0f && !this.actionBar.y() && !T7()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.m3.getCustomDate() * 1000);
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.clear();
            calendar.set(i, i2, i3);
            c8((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public final void w9(int i) {
        this.actionBar.getActionBarMenuOnItemClick().b(i);
    }

    public final void wa() {
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

    public final void wb(TLRPC.ChatTheme chatTheme) {
        boolean z;
        boolean z2;
        if (this.Ba != null && this.za == null) {
            elb c = elb.c(chatTheme);
            je2 e = je2.e(this.currentAccount);
            e.q(this.l6, elb.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                e.n(chatTheme);
                jy3 g = e.g(c);
                if (g == null) {
                    g = new jy3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    g.k();
                    g.m(this.currentAccount);
                }
                jy3 jy3Var = g;
                ku1 ku1Var = this.Ba;
                TLRPC.WallPaper wallPaper = ku1Var.g;
                if (this.h6 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ku1Var.q(jy3Var, wallPaper, z2, null, false);
                return;
            }
            if (c != null && !c.b()) {
                yk1 yk1Var = new yk1(this, (byte) 14);
                String str = c.b;
                if (c.b()) {
                    yk1Var.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    jy3 jy3Var2 = (jy3) e.e.get(str);
                    if (jy3Var2 != null) {
                        jy3Var2.k();
                        yk1Var.onComplete(jy3Var2);
                    } else {
                        yk1Var.onComplete(null);
                    }
                } else {
                    e.o(new he2(c, yk1Var), false);
                }
            }
            TLRPC.WallPaper c2 = e.c(this.l6);
            ku1 ku1Var2 = this.Ba;
            jy3 jy3Var3 = ku1Var2.f;
            if (this.h6 != 0) {
                z = true;
            } else {
                z = false;
            }
            ku1Var2.q(jy3Var3, c2, z, null, false);
        }
    }

    public final void wc(p7 p7Var, boolean z) {
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

    public final void x4(k27 k27Var, boolean z) {
        y4(k27Var, z, true);
    }

    public final void x5() {
        int i;
        mu1 mu1Var = this.Aa;
        if (mu1Var != null) {
            mu1Var.x5();
        }
        int L = gl.L(2.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m + ((int) l7(gl.L(7.0f)));
        lr1 lr1Var = this.D1;
        if (lr1Var != null) {
            i = gl.L(lr1Var.F * 35.0f);
        } else {
            i = 0;
        }
        int L2 = gl.L(N6() * 43.0f) + L + i;
        int L3 = gl.L(60.0f) + ((int) this.w.d());
        fu fuVar = this.a4;
        if (fuVar != null) {
            fuVar.setPadding(0, L2, 0, L3);
        }
        vc5 vc5Var = this.I1;
        if (vc5Var != null) {
            vc5Var.e.setPadding(0, L2, 0, L3);
            vc5Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        yc ycVar = this.Z3;
        if (ycVar != null) {
            ry1 ry1Var = (ry1) ycVar.b;
            ry1Var.setFadeZoneTop(L2);
            ry1Var.setFadeZoneBottom(L3);
        }
        pi4 pi4Var = this.r2;
        if (pi4Var != null) {
            pi4Var.setTranslationY(L2);
        }
        zya zyaVar = this.s2;
        if (zyaVar != null) {
            zyaVar.a.setTranslationY(((L2 - L3) / 2.0f) + gl.L(32.0f));
        }
    }

    public final void x7(boolean z) {
        if (this.m3.getTag() != null && !this.s3) {
            if (!this.y3 || this.u3) {
                this.m3.setTag(null);
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.v3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.v3.playTogether(ObjectAnimator.ofFloat(this.m3, View.ALPHA, 0.0f));
                    this.v3.addListener(new lp1(this, (byte) 5));
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

    public final void x8(TLRPC.TL_document tL_document, String str, Object obj, boolean z, int i) {
        z3a.B(this.currentAccount).t0(tL_document, str, this.l6, this.F5, this.m4, null, this.D5, null, z, i, 0, false, obj, Q6(), 0L, c7(), this.y5);
    }

    public final void x9() {
        int i;
        String str;
        int i2;
        Activity parentActivity = getParentActivity();
        int i3 = this.currentAccount;
        long j = this.l6;
        ku1 ku1Var = this.Ba;
        int i4 = i92.M;
        fx0 fx0Var = new fx0(1, (wjb) ku1Var, (Context) parentActivity, false);
        fx0Var.M(bkb.g5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624078, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(80.0f);
        int i5 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i5, ku1Var));
        vkb M = zkb.M(i5);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, ku1Var);
        linearLayout.addView((View) imageView, nme.t(80, 80, 1, 0, 16, 0, 16));
        boolean F3 = na7.q1(i3).F3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        int i6 = bkb.i5;
        zkb.X(textView, i6, ku1Var);
        textView.setTextSize(1, 20.0f);
        if (F3) {
            i = 2131746845;
        } else {
            i = 2131746846;
        }
        textView.setText(k96.M0(i, null));
        linearLayout.addView(textView, nme.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        zkb.X(textView2, i6, ku1Var);
        textView2.setTextSize(1, 14.0f);
        if (j > 0) {
            str = l7c.k(na7.q1(i3).V1(Long.valueOf(j)), true);
        } else {
            str = "";
        }
        if (F3) {
            i2 = 2131746843;
        } else {
            i2 = 2131746844;
        }
        de9.r(null, null, i2, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, nme.t(-1, -2, 1, 12, 9, 12, 19));
        if (!F3) {
            ah8 ah8Var = new ah8(ku1Var, parentActivity, true);
            ah8Var.setOnClickListener(new dh(fx0Var, (byte) 4));
            ah8Var.c(k96.M0(2131746847, null), false, false);
            linearLayout.addView(ah8Var, nme.t(-1, 48, 1, 0, 0, 0, 4));
        }
        fx0Var.O = linearLayout;
        fx0Var.show();
    }

    public final void xa(long j, boolean z) {
        if (this.g2 != null && l7c.w(this.f)) {
            this.g2.setAllTopicsHidden(true);
        }
        this.e6.put(j, 1);
        b6();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.l6, 0, new on1(this, j, z), new xn0(this, j, (byte) 3));
        this.D0.J(false);
    }

    public final void xb(View view, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                xb(viewGroup.getChildAt(i), z);
            }
        }
        if (view != this.A0 && view != this.m1) {
            view.setEnabled(z);
        }
    }

    public final void xc(k27 k27Var) {
        if (k27Var == null) {
            return;
        }
        m21 m21Var = this.P3;
        if (m21Var != null) {
            m21Var.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.v5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(k27Var.e1()));
        int i = this.e5;
        getNotificationCenter().k(kk7.s0, Long.valueOf(this.l6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.e5 - 1), Boolean.valueOf(this.g5));
        this.P3 = u21.B(this, false, new tn6(this, arrayList2, arrayList, i, (byte) 12), new bl1(this, k27Var, (byte) 6), this.Ba).j();
    }

    @Override
    public final boolean y() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void y4(defpackage.k27 r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.y4(k27, boolean, boolean):void");
    }

    public final void y5() {
        int i;
        float f = (1.0f - this.hd.e) * (1.0f - this.fd.e);
        this.y1.setTranslationX((1.0f - f) * gl.L(80.0f));
        this.y1.setAlpha(f);
        dz1 dz1Var = this.y1;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        dz1Var.setVisibility(i);
    }

    public final void y6(CharSequence charSequence, ArrayList arrayList) {
        if (this.H5 != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            k27 k27Var = this.H5;
            if (!isEmpty) {
                k27Var.y1 = charSequence;
                k27Var.z1 = arrayList;
            } else if (k27Var.F3()) {
                k27 k27Var2 = this.H5;
                k27Var2.y1 = "";
                k27Var2.z1 = new ArrayList();
            } else {
                ar1 ar1Var = this.a0;
                if (ar1Var != null) {
                    this.H5.y1 = ar1Var.getFieldText();
                    k27 k27Var3 = this.H5;
                    if (k27Var3.y1 == null && !TextUtils.isEmpty(k27Var3.k.message)) {
                        this.H5.y1 = "";
                    }
                }
            }
        }
    }

    public final void y7(boolean z) {
        if (this.n3.getTag() != null && !this.t3) {
            if (!this.z3 || this.u3) {
                this.n3.setTag(null);
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x3, 0.0f);
                    this.w3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.w3.addUpdateListener(new wk1(this, (byte) 1));
                    this.w3.addListener(new lp1(this, (byte) 7));
                    this.w3.setStartDelay(this.p3);
                    this.w3.start();
                } else {
                    ValueAnimator valueAnimator = this.w3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.w3 = null;
                    }
                    this.x3 = 0.0f;
                    Hc();
                }
                this.p3 = (short) 500;
            }
        }
    }

    public final void y8(int i, View view) {
        gm gmVar;
        TLRPC.User user;
        char c;
        dr1 dr1Var;
        dr1 dr1Var2;
        if (i != 0) {
            kz6 adapter = this.X1.getAdapter();
            if (adapter.x0 != null && !adapter.i0) {
                return;
            }
            int i2 = i - 1;
            Object J = this.X1.getAdapter().J(i2);
            int i3 = this.X1.getAdapter().Y;
            int i4 = this.X1.getAdapter().Z;
            if (this.X1.getAdapter().G != null && i2 == 1) {
                this.a0.o1(i3, i4, this.X1.getAdapter().G + "@" + hc2.K(this.e, false) + " ", false);
            } else if (this.X1.getAdapter().G != null && i2 == 0) {
                this.a0.o1(i3, i4, b00.j(new StringBuilder(), this.X1.getAdapter().G, " "), false);
            } else if (J instanceof nx8) {
                if (!getUserConfig().p()) {
                    showDialog(new jh8(this, getParentActivity(), this.currentAccount, true, 31, false, null));
                    return;
                }
                nx8 nx8Var = (nx8) J;
                ij.X(this.currentAccount, this.l6, Math.max(1, nx8Var.a()), new x0(this, nx8Var, (byte) 17));
            } else {
                g27 g27Var = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (this.g4 != 0 || !k5(view)) {
                        if (view instanceof uya) {
                            g27Var = ((uya) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        ij.X(this.currentAccount, a(), 1, new yt0(this, tL_document, k27.U(tL_document), this.X1.getAdapter().L(i2), g27Var, (byte) 4));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (this.C3 && (dr1Var2 = this.g3) != null && dr1Var2.getVisibility() == 0) {
                        kb(chat, null);
                        return;
                    }
                    String K = hc2.K(chat, false);
                    if (K != null) {
                        this.a0.o1(i3, i4, tb4.y("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (this.C3 && (dr1Var = this.g3) != null && dr1Var.getVisibility() == 0) {
                        kb(null, user2);
                    } else if (l7c.p(user2) != null) {
                        this.a0.o1(i3, i4, "@" + l7c.p(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(tb4.o(l7c.k(user2, false), " "));
                        spannableString.setSpan(new j4c(String.valueOf(user2.id), 3, null), 0, spannableString.length(), 33);
                        this.a0.o1(i3, i4, spannableString, false);
                    }
                } else if (J instanceof hz6) {
                    if (this.X1.getAdapter().K != null && this.g4 != 1) {
                        hz6 hz6Var = (hz6) J;
                        x3a b = x3a.b(hz6Var.a, this.l6, this.F5, this.m4, null, false, null, null, null, true, 0, 0, null, false);
                        b.K = Q6();
                        b.X = hz6Var.b;
                        b.R = c7();
                        b.T = this.y5;
                        getSendMessagesHelper().q0(b);
                        this.a0.setFieldText("");
                        w7(false);
                    }
                } else if (J instanceof String) {
                    if (this.X1.getAdapter().K != null) {
                        if (this.g4 == 1) {
                            ij.J(getParentActivity(), this.l6, new q31(this, (String) J, (byte) 12), this.Ba);
                            return;
                        } else if (!k5(view)) {
                            ij.X(this.currentAccount, this.l6, 1, new x0(this, (String) J, (byte) 18));
                            return;
                        } else {
                            return;
                        }
                    }
                    this.a0.o1(i3, i4, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (this.a0.getFieldText() != null) {
                        if (this.g4 == 1 || !k5(view)) {
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
                                    String M0 = k96.M0(2131745404, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    if (c == 1) {
                                        hdVar.U = k96.M0(2131750459, null);
                                    } else {
                                        hdVar.U = k96.M0(2131748911, null);
                                    }
                                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                                    showDialog(hdVar);
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
                            ij.X(this.currentAccount, a(), 1, new x0(this, botInlineResult, (byte) 19));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    aj1 aj1Var = new aj1(this, (TLRPC.TL_inlineBotWebView) J, (byte) 9);
                    if (this.Jb) {
                        aj1Var.run();
                    } else {
                        psc.a(getParentActivity(), new x0(this, aj1Var, (byte) 20), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    sq1 sq1Var = this.X1;
                    if (sq1Var != null && (user = sq1Var.getAdapter().x0) != null) {
                        this.a0.setFieldText("");
                        long j = this.l6;
                        if (j == user.id) {
                            this.x8 = j;
                            getMessagesController().E4(tL_inlineBotSwitchPM.start_param, this.f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", this.l6);
                        if (getMessagesController().A(bundle, this, null, null)) {
                            presentFragment(new mu1(bundle));
                        }
                    }
                } else if (J instanceof dq6) {
                    String str = ((dq6) J).a;
                    ar1 ar1Var = this.a0;
                    ar1Var.X();
                    ar1Var.V0.d(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            this.a0.o1(i3, i4, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = this.a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                fa4.g(e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e2 = vl.e(this.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(k27.U(e2));
                            if (e2 != null) {
                                gmVar = new gm(e2, fontMetricsInt);
                            } else {
                                gmVar = new gm(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(gmVar, 0, spannableString2.length(), 33);
                            this.a0.o1(i3, i4, spannableString2, false);
                            this.X1.o(false);
                        }
                    }
                    this.a0.o1(i3, i4, str, true);
                    this.X1.o(false);
                }
            }
        }
    }

    public final void y9(long j) {
        if (gta.v(this.currentAccount, false).m().amount < j) {
            new zua(getParentActivity(), getResourceProvider(), j, 13, cf3.s(a()), new wl1(this, (byte) 23), a()).show();
        } else {
            new ava(getParentActivity(), this.resourceProvider).show();
        }
    }

    public final boolean ya() {
        if (this.V4.size() != 1 || this.n4 == null || ((Integer) this.V4.get(0)).intValue() != this.n4.e1()) {
            return false;
        }
        return true;
    }

    public final void yb(boolean z) {
        zb(z, false, true);
    }

    public final void yc() {
        boolean T7 = T7();
        SparseArray[] sparseArrayArr = this.o6;
        if (!T7) {
            if (this.actionBar.y() && this.q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.q1.c(k96.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        fr1 fr1Var = this.E0;
        if (size == 0) {
            fr1Var.setText(k96.M0(2131746020, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        fr1Var.setText(k96.a0(null, null, 2131746021, k96.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    @Override
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void z4() {
        this.y5 = null;
        if (this.s4 == 0 || this.x4) {
            if (this.x4) {
                this.F5 = this.m4;
            } else {
                this.F5 = null;
            }
            this.D5 = null;
            ar1 ar1Var = this.a0;
            if (ar1Var != null) {
                ar1Var.N1(null, null, null);
            }
        }
        w7(false);
        if (this.g4 == 0) {
            getMediaDataController().F(this.l6, this.s4, true);
        }
    }

    public final void z5() {
        mu1 mu1Var = this.Aa;
        if (mu1Var != null) {
            mu1Var.z5();
        }
        float f = 0.0f;
        if (!this.mb) {
            f = gl.L(1.0f) + this.actionBar.getMeasuredHeight() + 0.0f;
        }
        float l7 = l7(gl.L(7.0f)) + f;
        if (this.g2 != null) {
            l7 += m7(gxb.a);
        }
        if (this.D1 != null) {
            l7 += gl.L(35.0f) * this.D1.F;
        }
        this.Z.setFadeZoneTop((int) ((N6() * gl.L(43.0f)) + l7));
    }

    public final void z6() {
        CharSequence charSequence;
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            charSequence = ar1Var.getFieldText();
        } else {
            charSequence = null;
        }
        y6(charSequence, null);
    }

    public final void z7(boolean z) {
        if (!z) {
            je5 je5Var = this.B2;
            if (je5Var != null) {
                je5Var.f(true);
            }
            je5 je5Var2 = this.v2;
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
            je5 je5Var3 = this.x2;
            if (je5Var3 != null) {
                je5Var3.f(true);
            }
        }
        je5 je5Var4 = this.A2;
        if (je5Var4 != null) {
            je5Var4.f(true);
        }
        je5 je5Var5 = this.z2;
        if (je5Var5 != null) {
            je5Var5.f(true);
        }
        je5 je5Var6 = this.I2;
        if (je5Var6 != null) {
            je5Var6.f(true);
        }
        je5 je5Var7 = this.J2;
        if (je5Var7 != null) {
            je5Var7.f(true);
        }
        je5 je5Var8 = this.C2;
        if (je5Var8 != null) {
            je5Var8.f(true);
        }
        je5 je5Var9 = this.D2;
        if (je5Var9 != null) {
            je5Var9.f(true);
        }
        cg2 cg2Var = this.K2;
        if (cg2Var != null) {
            cg2Var.f(true);
        }
        je5 je5Var10 = this.Y0;
        if (je5Var10 != null) {
            je5Var10.f(true);
        }
        je5 je5Var11 = this.a1;
        if (je5Var11 != null) {
            je5Var11.f(true);
        }
        je5 je5Var12 = this.Z0;
        if (je5Var12 != null) {
            je5Var12.f(true);
        }
    }

    public final void z8(int i) {
        if (this.g4 == 7) {
            Object E = this.b4.E(i);
            if (i == 0) {
                this.b4.getClass();
            }
            if (E instanceof k27) {
                ka((k27) E);
            }
        } else if (this.F3 != null) {
            if (i >= 0 && i < getMediaDataController().Z0.size()) {
                k27 k27Var = (k27) getMediaDataController().Z0.get(i);
                this.G3 = false;
                zb(false, true, false);
                hq6 mediaDataController = getMediaDataController();
                if (i >= 0) {
                    if (i < mediaDataController.Z0.size()) {
                        mediaDataController.f1 = i;
                    }
                } else {
                    mediaDataController.getClass();
                }
                bd(getMediaDataController().e0(), getMediaDataController().f1, getMediaDataController().k0());
                gl.c3(new bl1(this, k27Var, (byte) 2));
            }
        } else {
            hq6 mediaDataController2 = getMediaDataController();
            int i2 = this.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i >= 0 && i < arrayList.size()) {
                mediaDataController2.f1 = i;
                k27 k27Var2 = (k27) arrayList.get(i);
                mediaDataController2.getNotificationCenter().k(kk7.G0, Integer.valueOf(i2), Integer.valueOf(k27Var2.e1()), Integer.valueOf(mediaDataController2.e0()), Long.valueOf(k27.B0(k27Var2.k)), Integer.valueOf(mediaDataController2.f1), Integer.valueOf(mediaDataController2.k0()), Boolean.TRUE);
            }
            bc(false);
        }
    }

    public final void z9(long j) {
        if (gta.v(this.currentAccount, false).m().amount < j) {
            new zua(getParentActivity(), getResourceProvider(), j, 13, cf3.s(a()), new wl1(this, (byte) 23), a()).show();
        } else {
            new ava(getParentActivity(), this.resourceProvider).show();
        }
    }

    public final void za() {
        gb2 gb2Var;
        this.fd.a(false, true);
        jd8 jd8Var = this.ld;
        if (jd8Var != null && (gb2Var = jd8Var.n) != null && gb2Var.getDelegate() != null) {
            jd8Var.n.getDelegate().C1(jd8Var.n, false);
        }
        ar1 ar1Var = this.a0;
        if (ar1Var != null) {
            ar1Var.w1(true, true, false);
            this.a0.T6 = null;
        }
    }

    public final void zb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.zb(boolean, boolean, boolean):void");
    }

    public final void zc() {
        Drawable r0;
        at1 at1Var = this.m1;
        if (at1Var != null && this.za == null) {
            if (this.Ba.h == null || at1Var.getBackgroundImage() == null) {
                if (this.m1.getBackgroundImage() == null || gl.O1()) {
                    if (M7()) {
                        r0 = this.m1.getCompactBackground();
                    } else {
                        r0 = bkb.r0();
                    }
                    at1 at1Var2 = this.m1;
                    if (!M7()) {
                        int i = bkb.a;
                    }
                    at1Var2.U(r0);
                }
            }
        }
    }

    @Override
    public final void S() {
    }

    public void aa(boolean z) {
    }
}
