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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
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
public class zu1 extends e implements fn7, oj3, qc6, k32, kz1, el4, yq5, s84 {
    public static int Ad = 22;
    public static float Bd = 1.4f;
    public static int Cd = 10;
    public static Pattern Dd;
    public static Pattern Ed;
    public static Pattern Fd;
    public static final int[] Gd = {jn7.x, jn7.y, jn7.z, jn7.A, jn7.Z, jn7.C0, jn7.t0, jn7.W0, jn7.e1, jn7.T1, jn7.F, jn7.s, jn7.U, jn7.E0, jn7.F0, jn7.C4, jn7.i3, jn7.s4, jn7.K};
    public static boolean Hd = false;
    public static final Rect Id = new Rect();
    public wq1 A0;
    public int A1;
    public kg5 A2;
    public boolean A3;
    public int A4;
    public m47 A5;
    public boolean A6;
    public boolean A7;
    public boolean A8;
    public float A9;
    public zu1 Aa;
    public u8a Ab;
    public Pattern Ac;
    public yq1 B0;
    public int B1;
    public kg5 B2;
    public boolean B3;
    public int B4;
    public m47 B5;
    public int B6;
    public int B7;
    public String B8;
    public VelocityTracker B9;
    public xu1 Ba;
    public boolean Bb;
    public r47 Bc;
    public zq1 C0;
    public v21 C1;
    public kg5 C2;
    public boolean C3;
    public int C4;
    public r47 C5;
    public int C6;
    public boolean C7;
    public String C8;
    public boolean C9;
    public pz1 Ca;
    public int Cb;
    public wl1 Cc;
    public it1 D0;
    public zr1 D1;
    public kg5 D2;
    public TLRPC.User D3;
    public tl1 D4;
    public ou1 D5;
    public int D6;
    public boolean D7;
    public r47 D8;
    public boolean D9;
    public final gc2 Da;
    public int Db;
    public ArrayList Dc;
    public kq1 E;
    public sr1 E0;
    public kr1 E1;
    public wb2 E2;
    public TLRPC.Chat E3;
    public final SparseArray E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public r47 E8;
    public ss1 E9;
    public TLRPC.TL_channels_sendAsPeers Ea;
    public boolean Eb;
    public final lh2 Ec;
    public final r89 F;
    public boolean F0;
    public ir1 F1;
    public int F2;
    public w49 F3;
    public final ArrayList F4;
    public r47 F5;
    public final ArrayList F6;
    public int F7;
    public int F8;
    public boolean F9;
    public TL_account.resolvedBusinessChatLinks Fa;
    public boolean Fb;
    public final iv1 Fc;
    public final r89 G;
    public p66 G0;
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
    public zh6 Gb;
    public boolean Gc;
    public final tq3 H;
    public TextView H0;
    public boolean H1;
    public kg5 H2;
    public boolean H3;
    public boolean H4;
    public r47 H5;
    public final SparseArray H6;
    public boolean H7;
    public boolean H8;
    public gr1 H9;
    public boolean Ha;
    public zh6 Hb;
    public boolean Hc;
    public final int I;
    public fx0 I0;
    public we5 I1;
    public kg5 I2;
    public String I3;
    public boolean I4;
    public boolean I5;
    public final SparseArray I6;
    public hm1 I7;
    public String I8;
    public wb2 I9;
    public float Ia;
    public boolean Ib;
    public boolean Ic;
    public final rz4 J;
    public RadialProgressView J0;
    public id J1;
    public kg5 J2;
    public String J3;
    public int J4;
    public boolean J5;
    public final HashMap J6;
    public String J7;
    public qr1 J8;
    public tj4 J9;
    public final cs0 Ja;
    public boolean Jb;
    public long Jc;
    public final rz4 K;
    public int K0;
    public kg5 K1;
    public ug2 K2;
    public int K3;
    public final ArrayList K4;
    public boolean K5;
    public final SparseArray K6;
    public boolean K7;
    public wb2 K8;
    public boolean K9;
    public final ds1 Ka;
    public Paint Kb;
    public boolean Kc;
    public ll0 L;
    public int L0;
    public kg5 L1;
    public View L2;
    public int L3;
    public final HashMap L4;
    public boolean L5;
    public final zh6 L6;
    public boolean L7;
    public jx L8;
    public boolean L9;
    public int La;
    public long Lb;
    public boolean Lc;
    public ll0 M;
    public int M0;
    public kg5 M1;
    public ms1 M2;
    public int M3;
    public r47 M4;
    public int M5;
    public final ArrayList M6;
    public int M7;
    public TextureView M8;
    public ValueAnimator M9;
    public int Ma;
    public gs1 Mb;
    public boolean Mc;
    public final sz4 N;
    public int N0;
    public kg5 N1;
    public a81 N2;
    public UndoView N3;
    public int N4;
    public boolean N5;
    public final SparseArray N6;
    public int N7;
    public boolean N8;
    public ValueAnimator N9;
    public hm1 Na;
    public boolean Nb;
    public boolean Nc;
    public ll0 O;
    public int O0;
    public kg5 O1;
    public he8 O2;
    public ls1 O3;
    public int O4;
    public TLRPC.PhotoSize O5;
    public final zh6 O6;
    public int O7;
    public final hm1 O8;
    public boolean O9;
    public boolean Oa;
    public boolean Ob;
    public boolean Oc;
    public id P;
    public Drawable P0;
    public kg5 P1;
    public boolean P2;
    public v21 P3;
    public final ArrayList P4;
    public TLRPC.PhotoSize P5;
    public final zh6 P6;
    public int P7;
    public final nz4 P8;
    public float P9;
    public boolean Pa;
    public boolean Pb;
    public TextView Pc;
    public boolean Q;
    public Drawable Q0;
    public ys1 Q1;
    public final de0[] Q2;
    public boolean Q3;
    public hm1 Q4;
    public TLObject Q5;
    public final int[] Q6;
    public int Q7;
    public ll0 Q8;
    public float Q9;
    public long Qa;
    public ArrayList Qb;
    public boolean Qc;
    public FrameLayout R;
    public Drawable R0;
    public float R1;
    public final yu1[] R2;
    public int R3;
    public boolean R4;
    public int R5;
    public final int[] R6;
    public int R7;
    public Bitmap R8;
    public int R9;
    public int Ra;
    public ValueAnimator Rb;
    public boolean Rc;
    public a81 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final ema[] S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public final int[] S6;
    public boolean S7;
    public BitmapShader S8;
    public int S9;
    public int Sa;
    public boolean Sb;
    public t10 Sc;
    public qr1 T;
    public int T0;
    public wg1 T1;
    public final nu1[] T2;
    public c34 T3;
    public boolean T4;
    public boolean T5;
    public final int[] T6;
    public int T7;
    public Paint T8;
    public float T9;
    public wr1 Ta;
    public Boolean Tb;
    public int Tc;
    public z92 U;
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
    public yr1 Ua;
    public boolean Ub;
    public TLRPC.DraftMessage Uc;
    public View V;
    public final Set V0;
    public ny V1;
    public int V2;
    public r47 V3;
    public ArrayList V4;
    public TLRPC.PhotoSize V5;
    public final boolean[] V6;
    public int V7;
    public Paint V8;
    public float V9;
    public boolean Va;
    public final int[] Vb;
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
    public wb2 Wb;
    public ValueAnimator Wc;
    public FrameLayout X;
    public boolean X0;
    public fr1 X1;
    public boolean X2;
    public r47 X3;
    public HashMap X4;
    public int X5;
    public boolean X6;
    public boolean X7;
    public float X8;
    public float X9;
    public int Xa;
    public wb2 Xb;
    public yp1 Xc;
    public final bvc Y;
    public kg5 Y0;
    public f41 Y1;
    public ImageView Y2;
    public r47 Y3;
    public final SparseArray Y4;
    public TLRPC.WebPage Y5;
    public boolean Y6;
    public boolean Y7;
    public boolean Y8;
    public TLRPC.Document Y9;
    public int Ya;
    public int Yb;
    public boolean Yc;
    public jz1 Z;
    public kg5 Z0;
    public l7 Z1;
    public RadialProgressView Z2;
    public zc Z3;
    public int Z4;
    public ArrayList Z5;
    public boolean Z6;
    public int Z7;
    public View Z8;
    public boolean Z9;
    public rx6 Za;
    public boolean Zb;
    public int Zc;
    public int a;
    public nr1 a0;
    public kg5 a1;
    public TextView a2;
    public ImageView a3;
    public gu a4;
    public final int[] a5;
    public String a6;
    public boolean a7;
    public boolean a8;
    public float a9;
    public boolean aa;
    public ValueAnimator ab;
    public int ac;
    public int ad;
    public boolean b;
    public or1 b0;
    public wz1 b1;
    public boolean b2;
    public AnimatorSet b3;
    public yc7 b4;
    public int b5;
    public xs4 b6;
    public int b7;
    public r47 b8;
    public float b9;
    public long ba;
    public float bb;
    public HashMap bc;
    public int bd;
    public boolean c;
    public zc c0;
    public boolean c1;
    public TextView c2;
    public FrameLayout c3;
    public sz1 c4;
    public boolean c5;
    public TLRPC.ChatInvite c6;
    public int c7;
    public r47 c8;
    public Integer c9;
    public int ca;
    public ks1 cb;
    public hm1 cc;
    public int cd;
    public boolean d;
    public int d0;
    public rr1 d1;
    public TextView d2;
    public vr1 d3;
    public int d4;
    public int d5;
    public gn1 d6;
    public long d7;
    public int d8;
    public int d9;
    public int da;
    public final ts1 db;
    public byte dc;
    public int dd;
    public TLRPC.Chat e;
    public q7 e0;
    public av1 e1;
    public as1 e2;
    public TextView e3;
    public TL_account.TL_businessChatLink e4;
    public int e5;
    public final LongSparseIntArray e6;
    public boolean e7;
    public boolean e8;
    public boolean e9;
    public int ea;
    public final zs1 eb;
    public id ec;
    public boolean ed;
    public TLRPC.User f;
    public yq2 f0;
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
    public long fd;
    public r6 g0;
    public LinearLayout g1;
    public l1c g2;
    public qr1 g3;
    public int g4;
    public boolean g5;
    public boolean g6;
    public final ArrayList g7;
    public long g8;
    public n8 g9;
    public boolean ga;
    public final lp1 gb;
    public int gc;
    public TLRPC.TL_messages_discussionMessage gd;
    public TLRPC.EncryptedChat h;
    public q7 h0;
    public y92 h1;
    public x31 h2;
    public ImageView h3;
    public int h4;
    public AnimatorSet h5;
    public long h6;
    public final Paint h7;
    public String h8;
    public boolean h9;
    public boolean ha;
    public final qp1 hb;
    public boolean hc;
    public TLRPC.messages_Messages hd;
    public q7 i0;
    public wp1 i1;
    public p66 i2;
    public ImageView i3;
    public boolean i4;
    public final SparseIntArray i5;
    public boolean i6;
    public final Paint i7;
    public Integer i8;
    public int i9;
    public boolean ia;
    public final jq1 ib;
    public boolean ic;
    public boolean id;
    public s7 j0;
    public d19 j1;
    public ImageView j2;
    public in j3;
    public String j4;
    public final SparseIntArray j5;
    public boolean j6;
    public final ColorMatrix j7;
    public byte[] j8;
    public int j9;
    public m12 ja;
    public final ku1 jb;
    public boolean jc;
    public qu1 jd;
    public s7 k0;
    public s41 k1;
    public no0 k2;
    public in k3;
    public byte[] k4;
    public boolean k5;
    public boolean k6;
    public final c34 k7;
    public int k8;
    public b8[] k9;
    public float ka;
    public final hm1 kb;
    public int kc;
    public ju1 kd;
    public s7 l0;
    public yic l1;
    public TextView l2;
    public in l3;
    public String l4;
    public boolean l5;
    public long l6;
    public final t37 l7;
    public int l8;
    public b8 l9;
    public float la;
    public final hm1 lb;
    public int lc;
    public lva ld;
    public s7 m0;
    public nt1 m1;
    public hr1 m2;
    public er1 m3;
    public r47 m4;
    public boolean m5;
    public Long m6;
    public long m7;
    public ny m8;
    public final lr1 m9;
    public ad2 ma;
    public boolean mb;
    public int mc;
    public boolean md;
    public boolean n;
    public n0c n0;
    public h82 n1;
    public FrameLayout n2;
    public dr1 n3;
    public r47 n4;
    public boolean n5;
    public int n6;
    public int n7;
    public String n8;
    public jt1 n9;
    public Animator na;
    public boolean nb;
    public CharacterStyle nc;
    public boolean nd;
    public q7 o0;
    public final ArrayList o1;
    public hr1 o2;
    public dl1 o3;
    public boolean o4;
    public boolean o5;
    public final SparseArray[] o6;
    public int o7;
    public vc2 o8;
    public tr1 o9;
    public boolean oa;
    public long ob;
    public String oc;
    public float od;
    public s7 p0;
    public qq1 p1;
    public FrameLayout p2;
    public short p3;
    public ArrayList p4;
    public boolean p5;
    public final SparseArray[] p6;
    public final Matrix p7;
    public boolean p8;
    public int p9;
    public boolean pa;
    public vz pb;
    public l01 pc;
    public float pd;
    public r6 q0;
    public in q1;
    public TextView q2;
    public q q3;
    public r47 q4;
    public long q5;
    public final SparseArray[] q6;
    public LinearGradient q7;
    public boolean q8;
    public int q9;
    public zu1 qa;
    public boolean qb;
    public boolean qc;
    public final fm0 qd;
    public long r;
    public boolean r0;
    public nn1 r1;
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
    public ny rc;
    public final fm0 rd;
    public final HashMap s;
    public RadialProgressView s0;
    public zeb s1;
    public z2b s2;
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
    public final fm0 sd;
    public q7 t0;
    public q7 t1;
    public kg5 t2;
    public boolean t3;
    public int t4;
    public boolean t5;
    public int t6;
    public final Paint t7;
    public ts8 t8;
    public boolean t9;
    public final vr1 ta;
    public r47 tb;
    public boolean tc;
    public final fm0 td;
    public q7 u0;
    public q7 u1;
    public kg5 u2;
    public boolean u3;
    public TLRPC.Chat u4;
    public r47 u5;
    public int u6;
    public final Matrix u7;
    public ks8 u8;
    public ot1 u9;
    public j19 ua;
    public boolean ub;
    public final RectF uc;
    public final fm0 ud;
    public q7 v0;
    public q7 v1;
    public kg5 v2;
    public AnimatorSet v3;
    public boolean v4;
    public r47 v5;
    public int v6;
    public LinearGradient v7;
    public final zh6 v8;
    public View v9;
    public wd2 va;
    public boolean vb;
    public id vc;
    public final fm0 vd;
    public final rq1 w;
    public q7 w0;
    public q7 w1;
    public boolean w2;
    public ValueAnimator w3;
    public boolean w4;
    public m47 w5;
    public int w6;
    public boolean w7;
    public String w8;
    public boolean w9;
    public ky9 wa;
    public int wb;
    public long wc;
    public final fm0 wd;
    public kq1 x;
    public ClippingImageView x0;
    public oc2 x1;
    public kg5 x2;
    public float x3;
    public boolean x4;
    public v47 x5;
    public int x6;
    public boolean x7;
    public long x8;
    public boolean x9;
    public boolean xa;
    public int xb;
    public final hm1 xc;
    public final ykf xd;
    public kq1 y;
    public hnb y0;
    public vz1 y1;
    public boolean y2;
    public boolean y3;
    public boolean y4;
    public b77 y5;
    public int y6;
    public byte y7;
    public String y8;
    public boolean y9;
    public oe2 ya;
    public ty0 yb;
    public int yc;
    public xg8 yd;
    public zm9 z0;
    public boolean z1;
    public kg5 z2;
    public boolean z3;
    public boolean z4;
    public r47 z5;
    public final ArrayList z6;
    public boolean z7;
    public boolean z8;
    public float z9;
    public xu1 za;
    public ha4 zb;
    public boolean zc;
    public final Rect zd;

    public zu1(Bundle bundle) {
        super(bundle);
        ll0 ll0Var;
        this.a = 0;
        this.c = false;
        this.d = false;
        this.s = new HashMap();
        this.w = new rq1(this, new hm1(this, (byte) 4));
        r89 r89Var = new r89(0, false);
        this.F = r89Var;
        r89 r89Var2 = new r89(0, false);
        this.G = r89Var2;
        this.Y = new bvc();
        this.K0 = aob.Ji;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.o1 = new ArrayList();
        this.Q2 = new de0[2];
        this.R2 = new yu1[2];
        this.S2 = new ema[2];
        this.T2 = new nu1[2];
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
        this.L6 = new zh6();
        this.M6 = new ArrayList();
        this.N6 = new SparseArray();
        this.O6 = new zh6();
        this.P6 = new zh6();
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
        this.k7 = new c34();
        this.l7 = new t37(0, false, false, new gd(this, (byte) 2));
        this.p7 = new Matrix();
        Paint paint = new Paint(1);
        this.t7 = paint;
        this.u7 = new Matrix();
        this.F7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
        this.P7 = Integer.MAX_VALUE;
        this.Q7 = -1;
        this.Y7 = true;
        this.d8 = Integer.MAX_VALUE;
        this.k8 = -1;
        this.l8 = -10000;
        this.v8 = new zh6();
        this.O8 = new hm1(this, (byte) 9);
        nz4 nz4Var = new nz4();
        this.P8 = nz4Var;
        this.Q8 = new ll0(nz4Var, nz4Var, nz4Var);
        this.W8 = new Paint(1);
        this.X8 = 0.0f;
        this.a9 = 1.0f;
        this.b9 = 0.0f;
        this.h9 = true;
        this.m9 = new lr1(this);
        this.K9 = true;
        this.ta = new vr1(this, (byte) 0);
        this.Da = new gc2(this);
        this.Ja = new cs0(this, (byte) 2);
        this.Ka = new ds1(this);
        this.Ma = -1;
        this.db = new ts1(this);
        this.eb = new zs1(this);
        this.gb = new lp1(this);
        this.hb = new qp1(this);
        this.ib = new jq1(this);
        this.jb = new ku1(this);
        this.kb = new hm1(this, (byte) 14);
        this.lb = new hm1(this, (byte) 17);
        this.xb = Integer.MIN_VALUE;
        this.Vb = new int[2];
        this.uc = new RectF();
        this.xc = new hm1(this, (byte) 18);
        this.Ec = new lh2((byte) 11);
        this.Fc = new Object();
        this.Yc = false;
        k43 k43Var = k43.h;
        this.qd = new fm0(0, this, k43Var, 320L, false);
        this.rd = new fm0(1, this, k43Var, 520L, false);
        this.sd = new fm0(2, this, k43Var, 520L, false);
        this.td = new fm0(3, this, k43Var, 320L, false);
        this.ud = new fm0(4, this, k43Var, 320L, false);
        this.vd = new fm0(5, this, k43Var, 320L, false);
        this.wd = new fm0(6, this, k43Var, 320L, false);
        this.xd = new ykf(new hm1(this, (byte) 21));
        this.zd = new Rect();
        ?? obj = new Object();
        this.N = obj;
        if (Build.VERSION.SDK_INT >= 31 && xea.f()) {
            tq3 tq3Var = new tq3(false);
            this.H = tq3Var;
            this.I = Math.max(0, hl.L(48.0f) - Math.min(hl.n, hl.m));
            rz4 rz4Var = new rz4(obj);
            this.K = rz4Var;
            rz4Var.d = tq3Var;
            rz4Var.e = -3;
            rz4Var.f = obj;
            ll0 ll0Var2 = new ll0(rz4Var, rz4Var, rz4Var);
            this.M = ll0Var2;
            ll0Var2.k = true;
            if (i86.e(262144)) {
                rz4 rz4Var2 = new rz4(obj);
                this.J = rz4Var2;
                rz4Var2.d = tq3Var;
                rz4Var2.e = -2;
                rz4Var2.f = obj;
                ll0Var = new ll0(rz4Var2, rz4Var2, rz4Var2);
                this.L = ll0Var;
                ll0Var.k = true;
            } else {
                this.J = null;
                ll0Var = this.M;
                this.L = ll0Var;
            }
        } else {
            this.H = null;
            this.I = 0;
            this.J = null;
            this.K = null;
            ll0Var = new ll0(obj, obj, obj);
            this.L = ll0Var;
            this.M = new ll0(obj, obj, obj);
        }
        ll0 ll0Var3 = new ll0(obj, obj, obj);
        this.O = ll0Var3;
        ll0Var3.g = r89Var;
        ll0Var.g = r89Var;
        this.M.g = r89Var;
        this.Q8.g = new r89(0, false);
        this.O.f = r89Var2;
        this.L.f = r89Var2;
        this.M.f = r89Var2;
        this.Q8.f = r89Var2;
    }

    public static void E6(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z, boolean z2, boolean z3, boolean z4) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i = 6;
        if (z) {
            menu.add(2131296498, 2131296504, 6, ob6.M0(2131746167, null));
            i = 7;
        }
        if (z4) {
            menu.add(2131296498, 2131296510, i, ob6.M0(2131744919, null));
            i++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, i, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
        spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i2 = i + 2;
        menu.add(2131296498, 2131296499, i + 1, spannableStringBuilder2);
        if (z3) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ob6.M0(2131748104, null));
            spannableStringBuilder3.setSpan(new y7c(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296498, 2131296501, i2, spannableStringBuilder3);
            i2 = i + 3;
        }
        if (encryptedChat == null || hl.W0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(ob6.M0(2131744090, null));
            ?? obj = new Object();
            obj.a |= 8;
            spannableStringBuilder4.setSpan(new smb(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i3 = i2 + 1;
            menu.add(2131296498, 2131296511, i2, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ob6.M0(2131743544, null));
            ?? obj2 = new Object();
            obj2.a |= 16;
            spannableStringBuilder5.setSpan(new smb(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i2 += 2;
            menu.add(2131296498, 2131296514, i3, spannableStringBuilder5);
        }
        if (z2) {
            menu.add(2131296498, 2131296500, i2, ob6.M0(2131751709, null));
            i2++;
        }
        if (z && encryptedChat == null) {
            menu.add(2131296498, 2131296495, i2, ob6.M0(2131750550, null));
            i2++;
        }
        menu.add(2131296498, 2131296505, i2, ob6.M0(2131746064, null));
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

    public static TLRPC.TL_message O5(TLRPC.Message message) {
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

    public static int T3(zu1 zu1Var) {
        return zu1Var.classGuid;
    }

    public static boolean T7(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static int U3(zu1 zu1Var) {
        return zu1Var.classGuid;
    }

    public static ArrayList V5(ArrayList arrayList, boolean z, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            q7a q7aVar = (q7a) arrayList.get(i);
            String str = q7aVar.c;
            if (str == null) {
                if (q7aVar.a != null) {
                    try {
                        File q0 = hl.q0("", z);
                        InputStream openInputStream = a.b.getContentResolver().openInputStream(q7aVar.a);
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
                        cc4.g(e, true);
                    }
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 != null) {
                Pair N0 = hl.N0(str2);
                no6 no6Var = new no6(0, str2, ((Integer) N0.first).intValue(), q7aVar.o, 0, 0);
                no6Var.n(N0);
                if (i == arrayList.size() - 1 && charSequence != null) {
                    no6Var.a = charSequence;
                }
                arrayList2.add(no6Var);
            }
        }
        return arrayList2;
    }

    public static CharSequence W6(r47 r47Var, m47 m47Var, int[] iArr) {
        if (r47Var != null) {
            String E1 = uc7.s1(r47Var.K1).E1(r47Var.k.restriction_reason);
            if (!TextUtils.isEmpty(E1)) {
                return E1;
            }
            if (r47Var.S4() && !u2c.l(r47Var)) {
                return r47Var.i2();
            }
            CharSequence charSequence = r47Var.z;
            if (charSequence != null) {
                return charSequence;
            }
            if (m47Var != null) {
                ArrayList arrayList = m47Var.d;
                int size = arrayList.size();
                CharSequence charSequence2 = null;
                for (int i = 0; i < size; i++) {
                    r47 r47Var2 = (r47) arrayList.get(i);
                    CharSequence charSequence3 = r47Var2.z;
                    if (charSequence3 != null) {
                        if (charSequence2 == null) {
                            if (iArr != null) {
                                iArr[0] = r47Var2.e1();
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

    public static SpannableStringBuilder Y6(long j, r47 r47Var, boolean z) {
        TLRPC.Chat M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            long Z0 = r47Var.Z0();
            int i = r47Var.K1;
            if (j != Z0) {
                int i2 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i2 > 0) {
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(Z0));
                    if (X1 != null) {
                        spannableStringBuilder.append((CharSequence) lv2.m(0, X1.first_name, X1.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i2 < 0 && (M0 = uc7.s1(i).M0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                }
            }
        }
        String E1 = uc7.s1(r47Var.K1).E1(r47Var.k.restriction_reason);
        if (!TextUtils.isEmpty(E1)) {
            spannableStringBuilder.append((CharSequence) E1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = r47Var.z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(r47Var.v);
        return spannableStringBuilder;
    }

    public static FrameLayout Z5(Activity activity, vnb vnbVar, CharSequence charSequence, int i) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setMinimumHeight(hl.L(48.0f));
        frameLayout.setPadding(hl.L(14.0f), hl.L(4.0f), hl.L(14.0f), hl.L(4.0f));
        xb xbVar = new xb(activity, (byte) 17);
        int i2 = 3;
        xbVar.setMaxLines(3);
        xbVar.setGravity(3);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(xbVar, aob.E8, vnbVar);
        xbVar.setTextSize(1, i);
        xbVar.setMaxWidth(hl.L(170.0f));
        xbVar.setText(charSequence);
        if (ob6.a0) {
            i2 = 5;
        }
        frameLayout.addView(xbVar, tre.e(-1, -2, i2 | 16));
        return frameLayout;
    }

    public static int a7() {
        return hl.L(102.0f);
    }

    public static zu1 ga(int i, long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("message_id", i);
        return new zu1(bundle);
    }

    public static zu1 ha(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new zu1(bundle);
    }

    public static int z2(zu1 zu1Var) {
        return zu1Var.currentAccount;
    }

    public final void A4(r47 r47Var, r47 r47Var2) {
        long D1 = r47Var.D1();
        if (D1 != 0) {
            zh6 zh6Var = this.O6;
            ArrayList arrayList = (ArrayList) zh6Var.f(D1);
            if (arrayList == null) {
                arrayList = qd4.s(zh6Var, D1);
            }
            arrayList.add(r47Var);
            if (r47Var2 != null) {
                arrayList.remove(r47Var2);
            }
        }
    }

    public final void A5() {
        FrameLayout frameLayout = this.f1;
        if (frameLayout != null) {
            float c = this.w.c();
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + c + hl.L(9.0f)) * (-0.5f));
        }
    }

    public final void A6(Canvas canvas) {
        float f;
        s7 p7 = p7();
        if (p7 == null) {
            return;
        }
        View view = (View) p7.getParent();
        float x = this.actionBar.getX();
        n0c n0cVar = this.n0;
        if (n0cVar != null) {
            f = n0cVar.getProgress() * this.n0.getContentWidth();
        } else {
            f = 0.0f;
        }
        float x2 = (p7.getX() + (view.getX() + (x - f))) - this.n0.getX();
        float y = (p7.getY() + (view.getY() + this.actionBar.getY())) - this.n0.getY();
        Paint paint = this.Kb;
        if (paint == null) {
            paint = new Paint(1);
            this.Kb = paint;
        }
        paint.setColor(aob.p1(this.n0.getProgress(), getThemedColor(aob.d6)));
        canvas.drawCircle((p7.getWidth() / 2.0f) + x2, (p7.getHeight() / 2.0f) + y, hl.L(23.0f), this.Kb);
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
                    r47 r47Var = (r47) sparseArrayArr[i].valueAt(i2);
                    if (r47Var != null && (message = r47Var.k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void A8(Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        zu1 zu1Var;
        int i;
        int i2;
        TLRPC.TL_forumTopic f;
        if (num.intValue() != c()) {
            this.id = false;
            wl1 wl1Var = this.Cc;
            if (wl1Var != null) {
                hl.r(wl1Var);
                this.Cc.run();
                this.Cc = null;
            }
            iv1 iv1Var = this.Fc;
            if (iv1Var != null && num.intValue() == 0) {
                iv1Var.b(0, 0L);
            }
            l1c l1cVar = this.g2;
            long intValue = num.intValue();
            ArrayList l = uc7.s1(l1cVar.e).g4.l(-l1cVar.f);
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
                this.Lb = SystemClock.uptimeMillis();
                this.H7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    nb(c());
                } else if (c() == 0) {
                    nb(num.intValue());
                } else {
                    this.F7 = -1;
                }
                getConnectionsManager().cancelRequestsForGuid(this.classGuid);
                getMessagesStorage().j(this.classGuid);
                this.classGuid = ConnectionsManager.generateClassGuid();
                kb();
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
                    arrayList.add(new r47(getCurrentAccount(), message, false, false));
                    zu1Var = this;
                    zu1Var.Ob(arrayList, this.e, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    zu1Var = this;
                    zu1Var.r4 = null;
                    zu1Var.p4 = null;
                    zu1Var.m4 = null;
                    zu1Var.F5 = null;
                    zu1Var.A4 = 0;
                    zu1Var.B4 = 0;
                    zu1Var.C4 = 0;
                    zu1Var.s4 = 0L;
                    zu1Var.t4 = 0;
                    zu1Var.u4 = null;
                    zu1Var.x4 = false;
                    zu1Var.v4 = false;
                }
                it1 it1Var = zu1Var.D0;
                if (it1Var != null) {
                    if (it1Var.J >= 0 && !it1Var.I()) {
                        it1 it1Var2 = zu1Var.D0;
                        it1Var2.s(it1Var2.J);
                    } else {
                        it1 it1Var3 = zu1Var.D0;
                        if (it1Var3.J < 0 && it1Var3.I()) {
                            zu1Var.D0.i(0);
                        }
                    }
                    zu1Var.D0.O();
                }
                zu1Var.N6();
                zu1Var.wd(true);
                zu1Var.p1.n(true);
                if (tL_forumTopic2 != null) {
                    zu1Var.Cd();
                } else {
                    zu1Var.p1.b();
                }
                zu1Var.g2.setCurrentTopic(zu1Var.c());
                zu1Var.zd(true);
                zu1Var.Pc(true);
                zu1Var.getMessagesController().X4(-zu1Var.a(), zu1Var.c());
                zu1Var.Za();
                zu1Var.F7(true);
                zu1Var.E7(true);
                zu1Var.H4(true, true);
                if (zu1Var.a0 != null) {
                    if (!lbc.w(zu1Var.f)) {
                        zu1Var.a0.N0(false);
                    }
                    zu1Var.a0.y2(true);
                }
                if (tL_forumTopic2 != null) {
                    zu1Var.getMessagesController().g4.k(zu1Var.l6, tL_forumTopic2.id);
                    i = tL_forumTopic2.unread_reactions_count;
                } else {
                    i = 0;
                }
                zu1Var.A1 = i;
                if (tL_forumTopic2 != null) {
                    i2 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i2 = 0;
                }
                zu1Var.B1 = i2;
                zu1Var.jd(false);
                zu1Var.id(false);
                zu1Var.Ad();
                qu1 qu1Var = zu1Var.jd;
                if (qu1Var != null && zu1Var.actionBar.o0) {
                    qu1Var.k(null);
                }
                if (lbc.w(zu1Var.f)) {
                    zu1Var.getMediaDataController().K0(if7.a(zu1Var.l6, num.intValue()), true);
                }
            }
        }
    }

    public final void A9() {
        uc7 messagesController = getMessagesController();
        long j = this.l6;
        long j2 = this.d7;
        int i = this.classGuid;
        int i2 = this.g4;
        long j3 = this.s4;
        int i3 = this.C4;
        int i4 = this.n6;
        this.n6 = i4 + 1;
        messagesController.g3(j, j2, false, 30, 0, 0, true, 0, i, 0, i2, j3, i3, i4, this.x4);
    }

    public final void Aa(int i, boolean z) {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && wk5Var.getLastFragment() == this) {
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
            zu1 zu1Var = new zu1(bundle);
            if (this.x4) {
                ro4.a(zu1Var, if7.a(a(), c()));
            }
            zu1Var.n9 = new sq1(this);
            presentFragment(zu1Var, false);
        }
    }

    public final void Ab(ClipData clipData, boolean z, int i) {
        int i2 = 0;
        if (this.H5 != null) {
            while (i2 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    Fb(i, arrayList, z);
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
        Fb(i, arrayList2, z);
    }

    public final boolean Ac(r47 r47Var) {
        if (this.g4 == 0 && r47Var != null && r47Var.a5()) {
            return true;
        }
        return false;
    }

    public final void Ad() {
        int i;
        TLRPC.TL_forumTopic tL_forumTopic;
        q7 q7Var = this.w0;
        if (q7Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && xc2.i(this.currentAccount, chat, this.r4) && (tL_forumTopic = this.r4) != null && !tL_forumTopic.closed) {
                i = 0;
            } else {
                i = 8;
            }
            q7Var.e(i);
        }
    }

    public final void B4() {
        if (getParentLayout() == null) {
            return;
        }
        fd0.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f, null, this.l6, this.Sa, this.Ra);
    }

    public final void B5() {
        int i;
        float f = this.wd.e;
        we5 we5Var = this.I1;
        int i2 = 8;
        if (we5Var != null) {
            we5Var.setAlpha(f);
            we5 we5Var2 = this.I1;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            we5Var2.setVisibility(i);
        }
        gu guVar = this.a4;
        if (guVar != null) {
            float f2 = 1.0f - f;
            guVar.setAlpha(f2);
            gu guVar2 = this.a4;
            if (f2 > 0.0f) {
                i2 = 0;
            }
            guVar2.setVisibility(i2);
        }
    }

    public final void B6() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        r47 r47Var = this.H5;
        if (r47Var != null && (message = r47Var.k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean B7() {
        ot1 ot1Var = this.u9;
        if (ot1Var != null && ot1Var.w()) {
            return true;
        }
        return false;
    }

    public final void B8(Long l, Boolean bool) {
        int i;
        int i2;
        if (l.longValue() != c()) {
            this.Lb = SystemClock.uptimeMillis();
            this.H7 = bool.booleanValue();
            if (l.longValue() == 0) {
                nb(c());
            } else if (c() == 0) {
                nb(l.longValue());
            } else {
                this.F7 = -1;
            }
            getConnectionsManager().cancelRequestsForGuid(this.classGuid);
            getMessagesStorage().j(this.classGuid);
            this.classGuid = ConnectionsManager.generateClassGuid();
            kb();
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
                getMessagesController().g4.k(this.l6, wf3.n(f.from_id));
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
            getMessagesController().X4(-a(), c());
            G7(true);
            E7(true);
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.N0(false);
                this.a0.y2(true);
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
            qu1 qu1Var = this.jd;
            if (qu1Var != null && this.actionBar.o0) {
                qu1Var.k(null);
            }
        }
    }

    public final void B9(int i, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        r47 r47Var;
        r47 r47Var2;
        if (this.ac != i) {
            return;
        }
        if (bool.booleanValue()) {
            this.Y5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                this.Y5 = null;
                v47 v47Var = this.x5;
                if (v47Var != null) {
                    int i2 = this.currentAccount;
                    CharSequence fieldText = this.a0.getFieldText();
                    r47 r47Var3 = this.F5;
                    if (r47Var3 == this.m4) {
                        r47Var2 = null;
                    } else {
                        r47Var2 = r47Var3;
                    }
                    v47Var.e(i2, null, fieldText, r47Var2, this.D5, this.H5);
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
            v47 v47Var2 = this.x5;
            if (v47Var2 != null) {
                int i3 = this.currentAccount;
                CharSequence fieldText2 = this.a0.getFieldText();
                r47 r47Var4 = this.F5;
                if (r47Var4 == this.m4) {
                    r47Var = null;
                } else {
                    r47Var = r47Var4;
                }
                v47Var2.e(i3, null, fieldText2, r47Var, this.D5, this.H5);
            }
            gc(true, this.Y5, false);
            return;
        }
        this.Y5 = null;
        D6();
    }

    public final void Ba(TLRPC.Chat chat) {
        boolean z;
        kg5 kg5Var = this.K1;
        if (kg5Var != null && kg5Var.W) {
            kg5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        kg5 kg5Var2 = this.L1;
        if (kg5Var2 != null && kg5Var2.W) {
            kg5Var2.f(true);
            z = true;
        }
        if (z) {
            hl.d3(new jj1(this, chat, (byte) 15), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.vd.a(true, true);
            s7 s7Var = this.j0;
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
            r6 r6Var = this.g0;
            if (r6Var != null) {
                r6Var.e(8);
            }
            yq2 yq2Var = this.f0;
            if (yq2Var != null) {
                yq2Var.b(false);
            }
            s7 s7Var2 = this.k0;
            if (s7Var2 != null) {
                s7Var2.setVisibility(0);
            }
            s7 s7Var3 = this.p0;
            if (s7Var3 != null && this.ha) {
                s7Var3.setVisibility(8);
            }
            r6 r6Var2 = this.q0;
            if (r6Var2 != null && this.ia) {
                r6Var2.e(8);
            }
            s7 s7Var4 = this.l0;
            if (s7Var4 != null) {
                s7Var4.setVisibility(8);
            }
            s7 s7Var5 = this.m0;
            if (s7Var5 != null) {
                s7Var5.setVisibility(8);
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
        s7 s7Var6 = this.k0;
        if (s7Var6 != null) {
            this.Yc = true;
            this.k5 = false;
            s7Var6.G(false);
            this.Yc = false;
        }
        vb(chat, null);
        gd(0, true);
    }

    public final void Bb(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        long j2;
        if (r5()) {
            if (!TextUtils.isEmpty(str)) {
                p7a b = p7a.b(str, this.l6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b.K = X6();
                b.O = j;
                b.L = z2;
                b.Q = 0L;
                b.R = k7();
                b.T = this.y5;
                r7a.B(this.currentAccount).q0(b);
                j2 = 0;
            } else {
                j2 = j;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                p7a g = p7a.g((TLRPC.User) obj, this.l6, null, null, null, null, z, i, 0);
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

    public final void Bc(float f) {
        View view = this.v9;
        if (view instanceof wb2) {
            ((wb2) view).setSlidingOffset(f);
        } else if (view instanceof dl1) {
            ((dl1) view).setWalletSlidingOffset(f);
        }
    }

    public final void Bd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        qq1 qq1Var = this.p1;
        if (qq1Var != null && (tL_forumTopic = this.r4) != null) {
            qq1Var.setTitle(tL_forumTopic.title);
        }
        Cd();
    }

    @Override
    public final wma C() {
        return this.m1;
    }

    public final void C4(r47 r47Var, boolean z) {
        D4(r47Var, z, true);
    }

    public final void C5() {
        if (this.m1 == null) {
            return;
        }
        this.od = K4(false);
        this.pd = K4(true);
        this.U.setInputBubbleHeight(this.od);
        ed();
        Oc();
        y5();
        v5();
        A5();
        z5();
    }

    public final n0c C6() {
        long c;
        boolean z;
        if (this.n0 == null && getParentActivity() != null && this.m1 != null) {
            n0c n0cVar = new n0c(getParentActivity(), this.currentAccount, a(), this.Ba, new cs1(this));
            this.n0 = n0cVar;
            this.m1.addView(n0cVar, tre.c(-1.0f, -1));
        }
        n0c n0cVar2 = this.n0;
        if (n0cVar2 != null) {
            if (d8()) {
                c = f7();
            } else {
                c = c();
            }
            n0cVar2.setCurrentTopic(c);
            n0c n0cVar3 = this.n0;
            if (this.j0 != null) {
                z = true;
            } else {
                z = false;
            }
            n0cVar3.setMenuAvailable(z);
        }
        return this.n0;
    }

    public final void C7() {
        xt3 editField;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            if (aVar.z()) {
                this.xd.s(5, false, true);
                this.actionBar.y();
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
        nr1 nr1Var = this.a0;
        if (nr1Var != null && (editField = nr1Var.getEditField()) != null) {
            if (this.a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        ot1 ot1Var = this.u9;
        if (ot1Var != null) {
            ot1Var.e(true);
            SparseArray sparseArray = this.u9.p0;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
            }
            sparseArray.clear();
        }
        ss1 ss1Var = this.E9;
        if (ss1Var != null) {
            hl.r(ss1Var.I);
            ss1Var.a();
        }
        nr1 nr1Var2 = this.a0;
        if (nr1Var2 != null) {
            nr1Var2.b0 = false;
        }
        this.F9 = false;
        if (this.Mb != null) {
            K7();
        }
    }

    public final void C8(int i) {
        this.actionBar.setSubtitle(ob6.G(i, "messages", new Object[0]));
    }

    public final void C9(CharSequence charSequence, uc7 uc7Var, boolean z) {
        boolean z2;
        String str;
        String charSequence2;
        h8c[] h8cVarArr;
        if (this.X5 != 0) {
            getConnectionsManager().cancelRequest(this.X5, true);
            this.X5 = 0;
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = hl.S.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (h8cVarArr = (h8c[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), h8c.class)) != null && h8cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (h8c h8cVar : h8cVarArr) {
                    arrayList.add(h8cVar.getURL());
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
            cc4.g(e, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                str = charSequence;
            } else {
                hl.c3(new gn1(this, (byte) 5));
                return;
            }
        }
        if (arrayList == null) {
            hl.c3(new gn1(this, (byte) 4));
            return;
        }
        str = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (this.h != null && uc7Var.z2 == 2) {
            hl.c3(new gm1(this, uc7Var, charSequence, z));
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
            int i2 = this.ac + 1;
            this.ac = i2;
            pn1 pn1Var = new pn1(this, i2, getwebpagepreview, (byte) 0);
            HashMap hashMap = this.bc;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.bc = hashMap;
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) hashMap.get(getwebpagepreview.message);
            if (webPage2 != null) {
                pn1Var.a(Boolean.TRUE, webPage2);
                return;
            }
            p pVar = new p(this, getwebpagepreview, pn1Var, (byte) 6);
            if (this.X5 != 0) {
                getConnectionsManager().cancelRequest(this.X5, true);
            }
            this.X5 = getConnectionsManager().sendRequestTyped(getwebpagepreview, new ic((byte) 0), new qe2(this, pVar, (byte) 6));
            getConnectionsManager().bindRequestToGuid(this.X5, this.classGuid);
        }
    }

    public final void Ca(String str) {
        boolean z;
        boolean z2;
        String str2;
        int i;
        s7 s7Var;
        int i2;
        kg5 kg5Var = this.K1;
        if (kg5Var != null && kg5Var.W) {
            kg5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        kg5 kg5Var2 = this.L1;
        if (kg5Var2 != null && kg5Var2.W) {
            kg5Var2.f(true);
            z = true;
        }
        if (z) {
            hl.d3(new hl1(this, str, (byte) 1), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.vd.a(true, true);
            s7 s7Var2 = this.j0;
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            r6 r6Var = this.g0;
            if (r6Var != null) {
                r6Var.e(8);
            }
            yq2 yq2Var = this.f0;
            if (yq2Var != null) {
                yq2Var.b(false);
            }
            if ((this.s4 == 0 || (i2 = this.g4) == 3 || i2 == 8) && (s7Var = this.k0) != null) {
                s7Var.setVisibility(0);
            }
            s7 s7Var3 = this.p0;
            if (s7Var3 != null && this.ha) {
                s7Var3.setVisibility(8);
            }
            r6 r6Var2 = this.q0;
            if (r6Var2 != null && this.ia) {
                r6Var2.e(8);
            }
            s7 s7Var4 = this.l0;
            if (s7Var4 != null) {
                s7Var4.setVisibility(8);
            }
            s7 s7Var5 = this.m0;
            if (s7Var5 != null) {
                s7Var5.setVisibility(8);
            }
            this.r0 = true;
            nd(0, 0, -1);
            Pc(false);
        }
        if ((this.s4 == 0 || this.x4 || (i = this.g4) == 3 || i == 8) && !lbc.B(this.f)) {
            if (str == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.k5 = z2;
            s7 s7Var6 = this.k0;
            if (s7Var6 != null) {
                s7Var6.G(z2);
            }
        }
        s7 s7Var7 = this.k0;
        if (s7Var7 != null) {
            s7Var7.P(str, false);
        }
        ls6 mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.I3 = str2;
        mediaDataController.Z1(str2, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        gd(0, true);
    }

    public final void Cb(int i, ArrayList arrayList, boolean z, boolean z2) {
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
                no6 no6Var = (no6) obj;
                ?? obj2 = new Object();
                if (!no6Var.b && (str2 = no6Var.h) != null) {
                    obj2.c = str2;
                } else {
                    String str3 = no6Var.I;
                    if (str3 != null) {
                        obj2.c = str3;
                    }
                }
                obj2.e = no6Var.c;
                obj2.f = no6Var.g;
                obj2.p = no6Var.d();
                obj2.o = no6Var.b;
                obj2.q = no6Var.j();
                obj2.z = no6Var.m;
                obj2.A = no6Var.P;
                CharSequence charSequence = no6Var.a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.i = no6Var.n;
                obj2.j = no6Var.r;
                obj2.h = no6Var.x;
                obj2.k = no6Var.s;
                obj2.r = no6Var.L;
                obj2.x = no6Var.c();
                arrayList2.add(obj2);
                no6Var.e();
            }
            F6(((q7a) arrayList2.get(0)).d, ((q7a) arrayList2.get(0)).i);
            r7a.W(getAccountInstance(), arrayList2, this.l6, this.F5, this.m4, null, this.D5, z2, true, null, null, z, i, 0, ((q7a) arrayList2.get(0)).t, null, X6(), 0L, false, 0L, k7(), this.y5, null, false);
            E4();
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.setFieldText("");
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

    public final void Cc(r47 r47Var, boolean z) {
        TL_iv.RichMessage richMessage;
        if (r47Var != null && getParentActivity() != null) {
            wd2 wd2Var = this.va;
            if (wd2Var != null && wd2Var.d()) {
                this.va.setHiddenByScroll(true);
            }
            if (this.k0 != null) {
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar.o0) {
                    aVar.o(true);
                    this.a0.P1();
                }
            }
            TLRPC.Message message = r47Var.k;
            if (message != null && (richMessage = message.rich_message) != null) {
                yg9 yg9Var = new yg9(richMessage);
                yg9Var.K = this;
                yg9Var.r = r47Var;
                presentFragment(yg9Var);
                return;
            }
            this.X1.getAdapter().g0 = false;
            this.a0.setVisibility(0);
            ac(true, null, r47Var, null, null, true, 0, null, false, 0L, null, true);
            Pc(false);
            if (!z) {
                Z4();
            } else {
                this.y5 = b77.b(r47Var.k.suggested_post);
            }
            this.a0.G1(false, false, true);
            gd(0, true);
            Gd(false);
            if (!z && !r47Var.r1 && !r47.a4(r47Var.k) && this.g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().j1(this.l6);
                tL_messages_getMessageEditData.id = r47Var.e1();
                this.G5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new ym1(this, (byte) 1));
                return;
            }
            nr1 nr1Var = this.a0;
            bx1 bx1Var = nr1Var.u2;
            if (bx1Var != null) {
                bx1Var.setEnabled(true);
                nr1Var.u2.h(false);
            }
        }
    }

    public final void Cd() {
        qq1 qq1Var;
        qq1 qq1Var2;
        if (lbc.w(this.f) && (qq1Var2 = this.p1) != null) {
            qq1Var2.getAvatarImageView().setVisibility(0);
            this.p1.b();
        } else if (this.r4 != null && (qq1Var = this.p1) != null) {
            qq1Var.getAvatarImageView().setVisibility(0);
            ro4.q(this.p1.getAvatarImageView(), this.r4, true, true, this.Ba);
        }
    }

    @Override
    public final List D() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (xc2.T(this.e)) {
            arrayList.add(new dl4(ob6.M0(2131751577, null)));
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    M0 = ob6.M0(2131751574, null);
                } else {
                    M0 = ob6.M0(2131751575, null);
                }
            } else {
                M0 = ob6.M0(2131751576, null);
            }
            arrayList.add(new dl4(ob6.a0(null, null, 2131751573, M0), new gn1(this, (byte) 2)));
            arrayList.add(new dl4(ob6.M0(2131751572, null), new gn1(this, (byte) 3)));
        }
        if (this.f == null) {
            arrayList.add(new dl4(ob6.M0(2131751582, null)));
            arrayList.add(new dl4(ob6.M0(2131751581, null), 0.0f, 255.0f, new qm("", (byte) 6)));
            arrayList.add(new dl4(ob6.M0(2131751580, null), 1.0f, 10.0f, new w10(this)));
        }
        return arrayList;
    }

    public final void D4(defpackage.r47 r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.D4(r47, boolean, boolean):void");
    }

    public final void D5() {
        int i;
        zu1 zu1Var = this.Aa;
        if (zu1Var != null) {
            zu1Var.D5();
        }
        int L = hl.L(2.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m + ((int) t7(hl.L(7.0f)));
        zr1 zr1Var = this.D1;
        if (zr1Var != null) {
            i = hl.L(zr1Var.F * 35.0f);
        } else {
            i = 0;
        }
        int L2 = hl.L(U6() * 43.0f) + L + i;
        int L3 = hl.L(60.0f) + ((int) this.w.d());
        gu guVar = this.a4;
        if (guVar != null) {
            guVar.setPadding(0, L2, 0, L3);
        }
        we5 we5Var = this.I1;
        if (we5Var != null) {
            we5Var.e.setPadding(0, L2, 0, L3);
            we5Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        zc zcVar = this.Z3;
        if (zcVar != null) {
            jz1 jz1Var = (jz1) zcVar.b;
            jz1Var.setFadeZoneTop(L2);
            jz1Var.setFadeZoneBottom(L3);
        }
        tk4 tk4Var = this.r2;
        if (tk4Var != null) {
            tk4Var.setTranslationY(L2);
        }
        z2b z2bVar = this.s2;
        if (z2bVar != null) {
            z2bVar.a.setTranslationY(((L2 - L3) / 2.0f) + hl.L(32.0f));
        }
    }

    public final void D6() {
        t47 t47Var;
        b77 b77Var = this.y5;
        if (b77Var != null) {
            fc(b77Var);
            return;
        }
        TLRPC.WebPage webPage = this.Y5;
        if (webPage != null) {
            gc(true, webPage, false);
            return;
        }
        ou1 ou1Var = this.D5;
        r47 r47Var = this.F5;
        if (ou1Var != null) {
            ec(r47Var, ou1Var);
        } else if (r47Var != null && r47Var != this.m4) {
            dc(r47Var);
        } else {
            v47 v47Var = this.x5;
            if (v47Var != null && (t47Var = v47Var.b) != null) {
                cc(t47Var.e);
                return;
            }
            r47 r47Var2 = this.H5;
            if (r47Var2 != null) {
                ac(true, null, r47Var2, null, null, true, 0, null, false, 0L, null, true);
            } else {
                gc(false, null, true);
            }
        }
    }

    public final void D7() {
        if (getUserConfig().p()) {
            d31.b0(this).c(ob6.M0(2131754481, null)).j();
            getMessagesController().n0(true);
            ab(this.v5);
            cb(this.v5);
            return;
        }
        showDialog(new xk8((e) this, 3, true));
    }

    public final void D8(int i) {
        if (i != 0) {
            hl.c3(new ul1(this, i, (byte) 7));
        } else {
            this.actionBar.setSubtitle(ob6.M0(2131747923, null));
        }
    }

    public final void D9(int i, r47 r47Var) {
        if (i == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.id = getMessagesController().q1(this.f);
            getConnectionsManager().sendRequest(tL_contacts_acceptContact, new ym1(this, (byte) 2));
            return;
        }
        p7a g = p7a.g(getUserConfig().f(), this.l6, r47Var, this.m4, null, null, true, 0, 0);
        g.K = X6();
        r7a.B(this.currentAccount).q0(g);
        if (this.g4 == 0) {
            ea(false);
        }
        E7(false);
    }

    public final void Da(TLRPC.User user) {
        boolean z;
        kg5 kg5Var = this.K1;
        if (kg5Var != null && kg5Var.W) {
            kg5Var.f(true);
            z = true;
        } else {
            z = false;
        }
        kg5 kg5Var2 = this.L1;
        if (kg5Var2 != null && kg5Var2.W) {
            kg5Var2.f(true);
            z = true;
        }
        if (z) {
            hl.d3(new wn1(this, user, (byte) 1), 200L);
            return;
        }
        if (!this.actionBar.o0) {
            this.vd.a(true, true);
            s7 s7Var = this.j0;
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
            r6 r6Var = this.g0;
            if (r6Var != null) {
                r6Var.e(8);
            }
            yq2 yq2Var = this.f0;
            if (yq2Var != null) {
                yq2Var.b(false);
            }
            s7 s7Var2 = this.k0;
            if (s7Var2 != null) {
                s7Var2.setVisibility(0);
            }
            s7 s7Var3 = this.p0;
            if (s7Var3 != null && this.ha) {
                s7Var3.setVisibility(8);
            }
            r6 r6Var2 = this.q0;
            if (r6Var2 != null && this.ia) {
                r6Var2.e(8);
            }
            s7 s7Var4 = this.l0;
            if (s7Var4 != null) {
                s7Var4.setVisibility(8);
            }
            s7 s7Var5 = this.m0;
            if (s7Var5 != null) {
                s7Var5.setVisibility(8);
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
        s7 s7Var6 = this.k0;
        if (s7Var6 != null) {
            this.Yc = true;
            this.k5 = false;
            s7Var6.G(false);
            this.Yc = false;
        }
        vb(null, user);
        gd(0, true);
    }

    public final ue2 Db(r47 r47Var) {
        if (r47Var != null && !r47Var.N3() && r47Var.k4() && r47Var.k.ttl == Integer.MAX_VALUE) {
            long T = getMessagesController().T(r47Var.e1(), this.l6);
            r47Var.I0 = true;
            if (r47Var.O3() || (!r47Var.f4() && !r47Var.R4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(r47Var);
                bd(arrayList, true);
            }
            return new ue2(this, T, r47Var, (byte) 14);
        }
        return null;
    }

    public final void Dc() {
        tj4 tj4Var = this.J9;
        if (tj4Var != null && !tj4Var.c) {
            tj4Var.c(false);
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
        if (l8() && !this.r0 && ((aVar = this.actionBar) == null || !aVar.z())) {
            z = true;
        } else {
            z = false;
        }
        s7 s7Var = this.m0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        s7Var.setVisibility(i);
        s7 s7Var2 = this.j0;
        if (s7Var2 != null && (s7Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.j0.getLayoutParams();
            if (!z) {
                i2 = hl.L(48.0f);
            }
            if (layoutParams.width != i2) {
                layoutParams.width = i2;
                this.j0.setLayoutParams(layoutParams);
            }
            s7 s7Var3 = this.j0;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            s7Var3.setAlpha(f);
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
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.Y1(null, null, null);
            }
        }
        E7(false);
        if (this.g4 == 0) {
            getMediaDataController().F(this.l6, this.s4, true);
        }
    }

    public final void E5() {
        int i;
        float f = (1.0f - this.ud.e) * (1.0f - this.sd.e);
        this.y1.setTranslationX((1.0f - f) * hl.L(80.0f));
        this.y1.setAlpha(f);
        vz1 vz1Var = this.y1;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        vz1Var.setVisibility(i);
    }

    public final void E7(boolean z) {
        bc(false, null, null, null, true, 0, null, false, 0L, z);
    }

    public final void E8(TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = getMessagesController().j1(this.l6);
                tL_messages_getHistory.offset_date = this.O7 + 86400;
                tL_messages_getHistory.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getHistory, new ql(this, tLObject, (byte) 13));
                return;
            }
            this.actionBar.setSubtitle(ob6.M0(2131747923, null));
        }
    }

    public final void E9() {
        this.ya = null;
        this.A0.setOnInterceptTouchListener(null);
        Ib(this.m1, true);
        af2.e(this.currentAccount).a.clear();
    }

    public final void Ea(fu5 fu5Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) fu5Var.A;
        oc2 oc2Var = new oc2(getParentActivity(), this.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new qx6(this, fu5Var, (byte) 13), getResourceProvider());
        oc2Var.e(this.l6, c(), null);
        int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(oc2Var.f);
        fu5Var.t0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b);
    }

    public final fm1 Eb(r47 r47Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        if (r47Var != null && !r47Var.N3() && r47Var.k4()) {
            TLRPC.Message message = r47Var.k;
            if (message.destroyTime == 0 && (i = message.ttl) > 0) {
                if (z) {
                    if (i != Integer.MAX_VALUE) {
                        z2 = true;
                        i2 = i;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    message.destroyTime = getConnectionsManager().getCurrentTime() + i2;
                    if (this.h != null) {
                        getMessagesController().x3(this.l6, i2, r47Var.k.random_id);
                        return null;
                    }
                    getMessagesController().y3(this.l6, r47Var.e1(), null, i2, 0L, z2);
                    return null;
                }
                return new fm1(this, r47Var, (byte) 7);
            }
        }
        return null;
    }

    public final void Ec() {
        long j;
        ny nyVar = this.m8;
        if (nyVar != null) {
            hl.r(nyVar);
        }
        ny nyVar2 = new ny(this, (byte) 5);
        this.m8 = nyVar2;
        if (this.h8 != null) {
            j = 2500;
        } else {
            j = 1000;
        }
        hl.d3(nyVar2, j);
    }

    public final void Ed() {
        int i;
        q7 q7Var = this.o0;
        if (q7Var == null) {
            return;
        }
        if (getMessagesController().i4.y(a()) && getMessagesController().i4.s(a())) {
            i = 0;
        } else {
            i = 8;
        }
        q7Var.e(i);
    }

    public final void F4(r47 r47Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
        String M0 = ob6.M0(2131689472, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        if (r47Var.D == 3) {
            idVar.U = ob6.M0(2131747909, null);
        } else {
            idVar.U = ob6.a0("NoHandleAppInstalled", null, 2131747936, r47Var.F0().mime_type);
        }
        showDialog(idVar);
    }

    public final void F5() {
        zu1 zu1Var = this.Aa;
        if (zu1Var != null) {
            zu1Var.F5();
        }
        float f = 0.0f;
        if (!this.mb) {
            f = hl.L(1.0f) + this.actionBar.getMeasuredHeight() + 0.0f;
        }
        float t7 = t7(hl.L(7.0f)) + f;
        if (this.g2 != null) {
            t7 += u7(h1c.a);
        }
        if (this.D1 != null) {
            t7 += hl.L(35.0f) * this.D1.F;
        }
        this.Z.setFadeZoneTop((int) ((U6() * hl.L(43.0f)) + t7));
    }

    public final void F6(CharSequence charSequence, ArrayList arrayList) {
        if (this.H5 != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            r47 r47Var = this.H5;
            if (!isEmpty) {
                r47Var.y1 = charSequence;
                r47Var.z1 = arrayList;
            } else if (r47Var.F3()) {
                r47 r47Var2 = this.H5;
                r47Var2.y1 = "";
                r47Var2.z1 = new ArrayList();
            } else {
                nr1 nr1Var = this.a0;
                if (nr1Var != null) {
                    this.H5.y1 = nr1Var.getFieldText();
                    r47 r47Var3 = this.H5;
                    if (r47Var3.y1 == null && !TextUtils.isEmpty(r47Var3.k.message)) {
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
                    this.v3.addListener(new zp1(this, (byte) 5));
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

    public final mc2 F8(Context context) {
        oc2 oc2Var = new oc2(context, this.currentAccount, this.j0.getPopupLayout().getSwipeBack(), false, new tq1(this), getResourceProvider());
        this.x1 = oc2Var;
        oc2Var.e(this.l6, c(), null);
        return this.x1.f;
    }

    public final void F9() {
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
                int i = sharedPreferences.getInt("group_convert_time", 0);
                boolean z = f11.a;
                int currentTime = getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i) >= 604800 && this.visibleDialog == null && getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = getParentActivity();
                    el1 el1Var = new el1(this, (byte) 10);
                    el1 el1Var2 = new el1(this, (byte) 11);
                    Pattern pattern = jj.a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String v2 = hl.v2(null, 2131624038);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new yi((byte) 0));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(hgb.e(hl.L(320.0f), hl.L(127.17949f), v2)));
                    frameLayout.addView(view, tre.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    id idVar = alertDialog$Builder.a;
                    idVar.W = frameLayout;
                    idVar.P0 = 0.3974359f;
                    idVar.S = ob6.M0(2131749335, null);
                    idVar.U = hl.S2(ob6.M0(2131749336, null));
                    alertDialog$Builder.j(ob6.M0(2131749337, null), el1Var);
                    alertDialog$Builder.g(ob6.M0(2131752570, null), el1Var2);
                    showDialog(idVar);
                }
            }
        }
    }

    public final void Fa(long j) {
        int i = 0;
        if (j < 0) {
            if (j == a()) {
                this.p1.e(true, false);
            } else if (getMessagesController().n2(j)) {
                showDialog(new xo2(this, -j, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j);
                if (getMessagesController().C(bundle, this, null, null)) {
                    presentFragment(new zu1(bundle));
                }
            }
        } else if (j != getUserConfig().e()) {
            if (j == a()) {
                this.p1.e(true, false);
                return;
            }
            e e0 = rr0.e0(this.currentAccount, j);
            if (e0 != null) {
                presentFragment(e0);
                return;
            }
            Bundle k = qu6.k(j, "user_id");
            if (this.h != null && j == this.f.id) {
                k.putLong("dialog_id", this.l6);
            }
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            TLRPC.User user = this.f;
            if (user != null && user.id == j) {
                i = 1;
            }
            profileActivity.y3(i);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void Fb(int i, ArrayList arrayList, boolean z) {
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
                    cc4.g(e, true);
                }
            }
            if (!f11.b) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(uri);
                arrayList4 = arrayList5;
            } else {
                String S0 = hl.S0(uri);
                if (S0 == null) {
                    String uri3 = uri.toString();
                    String q = MediaController.q(-1L, uri, "file");
                    if (q == null) {
                        Ub();
                    } else {
                        str = uri3;
                        S0 = q;
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
        r7a.U(i, this.l6, 0L, 0L, 0L, getAccountInstance(), this.D5, null, this.F5, this.m4, this.H5, null, null, X6(), null, null, arrayList2, arrayList3, arrayList4, null, null, null, null, z, false);
        E7(false);
    }

    public final void Fc(int i) {
        int i2;
        boolean z;
        if (!this.mb && (i2 = i - this.D0.K) >= 0) {
            ArrayList arrayList = this.M6;
            if (i2 < arrayList.size()) {
                r47 r47Var = (r47) arrayList.get(i2);
                SparseArray[] sparseArrayArr = this.o6;
                if (sparseArrayArr[0].get(r47Var.e1(), null) == null && sparseArrayArr[1].get(r47Var.e1(), null) == null) {
                    z = true;
                } else {
                    z = false;
                }
                SparseArray sparseArray = new SparseArray();
                for (int i3 = 0; i3 < sparseArrayArr[0].size(); i3++) {
                    sparseArray.put(sparseArrayArr[0].keyAt(i3), (r47) sparseArrayArr[0].valueAt(i3));
                }
                for (int i4 = 0; i4 < sparseArrayArr[1].size(); i4++) {
                    sparseArray.put(sparseArrayArr[1].keyAt(i4), (r47) sparseArrayArr[1].valueAt(i4));
                }
                d79 d79Var = this.A0;
                ?? obj = new Object();
                obj.d = this;
                obj.b = z;
                obj.c = sparseArray;
                if (!d79Var.c2) {
                    d79Var.l2 = new int[2];
                    d79Var.p1(d79Var, true);
                    d79Var.g2 = obj;
                    d79Var.c2 = true;
                    d79Var.f2 = i;
                    d79Var.e2 = i;
                }
            }
        }
    }

    public final void Fd(qcc qccVar) {
        int i;
        int i2;
        wq1 wq1Var = this.A0;
        if (wq1Var != null) {
            if (!this.R4 && this.b8 != null) {
                int childCount = wq1Var.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i3);
                    if (childAt instanceof wb2) {
                        r47 messageObject = ((wb2) childAt).getMessageObject();
                        r47 r47Var = this.b8;
                        if (messageObject == r47Var) {
                            ArrayList arrayList = this.M6;
                            if (arrayList.indexOf(r47Var) >= 0) {
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
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.getEditingMessageObject();
            }
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = this.A0.getChildAt(i4);
                if (childAt2 instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt2;
                    r47 messageObject2 = wb2Var.getMessageObject();
                    if (((Boolean) qccVar.a(messageObject2)).booleanValue()) {
                        messageObject2.M1 = true;
                        wb2Var.z3(messageObject2, wb2Var.getCurrentMessagesGroup(), wb2Var.K2(), wb2Var.L2(), wb2Var.C2(), wb2Var.G2());
                        it1 it1Var = this.D0;
                        this.A0.getClass();
                        it1Var.L(RecyclerView.S(wb2Var));
                    }
                }
            }
            if (i != -1) {
                this.C0.g1(i, i2);
            }
        }
    }

    @Override
    public final void G(final no6 no6Var, final oec oecVar, final boolean z, final int i, final boolean z2, long j) {
        if (no6Var == null) {
            return;
        }
        this.rd.a(false, true);
        r47 r47Var = this.H5;
        if (r47Var != null && r47Var.o5() && !xc2.z(this.currentAccount, 24, r47.B0(this.H5.k))) {
            b77 b77Var = this.y5;
            if (b77Var == null) {
                b77Var = b77.b(this.H5.k.suggested_post);
            }
            if (!jxa.R(this.currentAccount, b77Var.a)) {
                wc(b77Var);
                return;
            }
        }
        if (oecVar != null && oecVar.s) {
            hm1 hm1Var = new hm1(this, (byte) 16);
            this.I7 = hm1Var;
            hl.d3(hm1Var, 3000L);
        }
        F6(no6Var.a, no6Var.n);
        jj.Y(this.currentAccount, a(), 1, new pcc() {
            @Override
            public final void a(Object obj) {
                Long l = (Long) obj;
                zu1 zu1Var = zu1.this;
                r47 r47Var2 = zu1Var.H5;
                no6 no6Var2 = no6Var;
                oec oecVar2 = oecVar;
                boolean z3 = z;
                int i2 = i;
                boolean z4 = z2;
                if (r47Var2 != null && r47Var2.o5()) {
                    b77 b77Var2 = zu1Var.y5;
                    if (b77Var2 == null) {
                        b77Var2 = b77.b(zu1Var.H5.k.suggested_post);
                    }
                    b77 b77Var3 = b77Var2;
                    if (no6Var2.b) {
                        k5 accountInstance = zu1Var.getAccountInstance();
                        String str = no6Var2.I;
                        String str2 = no6Var2.g;
                        TLRPC.Photo photo = no6Var2.e;
                        long j2 = zu1Var.l6;
                        r47 r47Var3 = zu1Var.H5;
                        r47 r47Var4 = zu1Var.m4;
                        ou1 ou1Var = zu1Var.D5;
                        ArrayList arrayList = no6Var2.n;
                        int i3 = no6Var2.x;
                        boolean z5 = no6Var2.M;
                        CharSequence charSequence = no6Var2.a;
                        r7a.a0(i3, i2, j2, no6Var2.y, l.longValue(), zu1Var.k7(), accountInstance, ou1Var, r47Var3, r47Var4, null, b77Var3, zu1Var.X6(), oecVar2, charSequence, str, str2, arrayList, photo, null, z3, z4, z5);
                    } else if (no6Var2.h != null) {
                        r7a.Y(zu1Var.getAccountInstance(), no6Var2.h, no6Var2.c, null, zu1Var.l6, zu1Var.H5, zu1Var.m4, zu1Var.D5, no6Var2.n, no6Var2.r, null, no6Var2.x, null, oecVar2, z3, i2, z4, no6Var2.a, zu1Var.X6(), no6Var2.y, l.longValue(), zu1Var.k7(), b77Var3);
                    } else if (no6Var2.I != null) {
                        r7a.Y(zu1Var.getAccountInstance(), no6Var2.I, no6Var2.c, null, zu1Var.l6, zu1Var.H5, zu1Var.m4, zu1Var.D5, no6Var2.n, no6Var2.r, null, no6Var2.x, null, oecVar2, z3, i2, z4, no6Var2.a, zu1Var.X6(), no6Var2.y, l.longValue(), zu1Var.k7(), b77Var3);
                    }
                } else if (no6Var2.b) {
                    k5 accountInstance2 = zu1Var.getAccountInstance();
                    String str3 = no6Var2.I;
                    String str4 = no6Var2.g;
                    TLRPC.Photo photo2 = no6Var2.e;
                    long j3 = zu1Var.l6;
                    r47 r47Var5 = zu1Var.F5;
                    r47 r47Var6 = zu1Var.m4;
                    ou1 ou1Var2 = zu1Var.D5;
                    ArrayList arrayList2 = no6Var2.n;
                    int i4 = no6Var2.x;
                    r47 r47Var7 = zu1Var.H5;
                    boolean z6 = no6Var2.M;
                    CharSequence charSequence2 = no6Var2.a;
                    r7a.a0(i4, i2, j3, no6Var2.y, l.longValue(), zu1Var.k7(), accountInstance2, ou1Var2, r47Var5, r47Var6, r47Var7, zu1Var.y5, zu1Var.X6(), oecVar2, charSequence2, str3, str4, arrayList2, photo2, null, z3, z4, z6);
                } else if (no6Var2.h != null) {
                    r7a.Y(zu1Var.getAccountInstance(), no6Var2.h, no6Var2.c, null, zu1Var.l6, zu1Var.F5, zu1Var.m4, zu1Var.D5, no6Var2.n, no6Var2.r, null, no6Var2.x, zu1Var.H5, oecVar2, z3, i2, z4, no6Var2.a, zu1Var.X6(), no6Var2.y, l.longValue(), zu1Var.k7(), zu1Var.y5);
                } else if (no6Var2.I != null) {
                    r7a.Y(zu1Var.getAccountInstance(), no6Var2.I, no6Var2.c, null, zu1Var.l6, zu1Var.F5, zu1Var.m4, zu1Var.D5, no6Var2.n, no6Var2.r, null, no6Var2.x, zu1Var.H5, oecVar2, z3, i2, z4, no6Var2.a, zu1Var.X6(), no6Var2.y, l.longValue(), zu1Var.k7(), zu1Var.y5);
                }
                zu1Var.E4();
            }
        }, j);
    }

    public final void G4() {
        long j;
        ad2 ad2Var = this.ma;
        if (ad2Var != null) {
            if (this.x4) {
                if (ad2Var.I != null) {
                    if (getParentLayout() != null) {
                        fd0.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f, this.r4, this.l6, this.Sa, this.Ra);
                    }
                    TLRPC.Chat chat = this.e;
                    TLRPC.TL_forumTopic tL_forumTopic = this.ma.I;
                    long j2 = this.l6;
                    int i = this.Ra;
                    int i2 = this.Sa;
                    if (getParentLayout() != null) {
                        fd0.a(this, getParentLayout().getFragmentStack().indexOf(this), chat, null, tL_forumTopic, j2, i, i2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", this.ma.a);
                    bundle.putInt("dialog_filter_id", this.ma.b);
                    bundle.putBoolean("pulled", true);
                    zu1 h = ro4.h(this, -this.l6, this.ma.I, 0, bundle);
                    h.oa = true;
                    Hd = true;
                    presentFragment(h, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = ad2Var.H;
            long j3 = 0;
            if (chat2 == null) {
                j = 0;
            } else {
                j = chat2.id;
            }
            if (j != 0) {
                B4();
                ad2 ad2Var2 = this.ma;
                TLRPC.Chat chat3 = ad2Var2.H;
                long j4 = ad2Var2.a0;
                int i3 = ad2Var2.a;
                int i4 = ad2Var2.b;
                if (getParentLayout() != null) {
                    fd0.a(this, getParentLayout().getFragmentStack().indexOf(this), chat3, null, null, j4, i3, i4);
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
                uc7.s1(this.currentAccount).W3.edit().remove("diditem" + this.ma.a0).apply();
                zu1 zu1Var = new zu1(bundle2);
                ArrayList arrayList = this.Qb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = this.Qb;
                    zu1Var.Qb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                zu1Var.oa = true;
                Hd = true;
                presentFragment(zu1Var, true);
            }
        }
    }

    public final void G5() {
        if (this.b1 != null) {
            this.b1.setPadding(hl.L(7.0f) + ((int) ((1.0f - U6()) * (1.0f - this.ud.e) * o7())), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        }
    }

    public final void G6() {
        CharSequence charSequence;
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            charSequence = nr1Var.getFieldText();
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
                    this.w3.addUpdateListener(new ql1(this, (byte) 0));
                    this.w3.addListener(new zp1(this, (byte) 7));
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
        if (uc7.s1(this.currentAccount).p2(this.l6, c(), null)) {
            yd(true);
            hl.d3(new zo1(this, (byte) 4), 150L);
            this.j0.U(null, null);
            if (getParentActivity() != null) {
                d31.z(this, 4, 0, this.Ba).j();
                return;
            }
            return;
        }
        View view = this.t1.j;
        if (view instanceof b8) {
            ((b8) view).b();
        }
    }

    public final void G9(TLRPC.TL_game tL_game, r47 r47Var, String str, long j) {
        oc(tL_game, r47Var, str, false, j);
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
        edit.putBoolean("askgame_" + j, false).commit();
    }

    public final void Ga(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap q = r7a.q(1, str);
            PhotoViewer.q0().T1(null, this, this.Ba);
            ArrayList arrayList = new ArrayList();
            no6 no6Var = new no6(0, str, 0, true, 0, 0);
            no6Var.a = charSequence;
            arrayList.add(no6Var);
            if (PhotoViewer.q0().V0()) {
                PhotoViewer.q0().A(false, false);
            }
            PhotoViewer.q0().o1(arrayList, 0, 0, false, new us1(this, q, arrayList), this);
            return;
        }
        F6(charSequence, null);
        k5 accountInstance = getAccountInstance();
        long j = this.l6;
        r47 r47Var = this.F5;
        r47 r47Var2 = this.m4;
        r7a.a0(0, 0, j, 0L, 0L, k7(), accountInstance, this.D5, r47Var, r47Var2, this.H5, this.y5, X6(), null, null, str, null, null, null, null, true, false, false);
        E4();
    }

    public final void Gb(r47 r47Var, wb2 wb2Var, int i, boolean z) {
        boolean z2;
        m47 v7 = v7(r47Var);
        boolean z3 = false;
        if (v7 != null) {
            ArrayList arrayList = v7.d;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (this.o6[i].indexOfKey(((r47) arrayList.get(i2)).e1()) < 0) {
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
        wb2Var.setDrawSelectionBackground(z2);
        if (v7 == null) {
            z3 = true;
        }
        wb2Var.o3(true, z3, z);
    }

    public final void Gc() {
        hl.d0(this.A0, new sa((byte) 2, this, S7()));
    }

    public final void Gd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Gd(boolean):void");
    }

    public final void H4(boolean z, boolean z2) {
        long j;
        TLRPC.DraftMessage T;
        Long l;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j2;
        r47 r47Var;
        TLRPC.TL_forumTopic f;
        TLRPC.Message message2;
        r47 r47Var2;
        String str;
        int Y;
        TLRPC.SuggestedPost suggestedPost;
        long j3;
        int i;
        long j4;
        Paint.FontMetricsInt fontMetricsInt;
        hm hmVar;
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
                    if (xc2.p0(this.e)) {
                        if (this.s4 == 0 && xc2.A(this.currentAccount, this.e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                ou1 ou1Var = null;
                ou1 ou1Var2 = null;
                ou1Var = null;
                ou1Var = null;
                ou1Var = null;
                if (V7()) {
                    zh6 zh6Var = (zh6) getMediaDataController().u1.f(this.l6);
                    if (zh6Var != null && zh6Var.m() > 0) {
                        pair = new Pair(Long.valueOf(zh6Var.j(0)), zh6Var.n(0));
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
                    ls6 mediaDataController = getMediaDataController();
                    long j7 = this.l6;
                    if (this.g4 == 3) {
                        j = 0;
                    } else {
                        j = this.s4;
                    }
                    T = mediaDataController.T(j7, j);
                    l = null;
                }
                nr1 nr1Var = this.a0;
                if (T != null) {
                    richMessage = T.rich_message;
                } else {
                    richMessage = null;
                }
                nr1Var.setRichDraftPreview(richMessage);
                gs6 U = ls6.d0(this.currentAccount).U(this.l6, c());
                if (T != null && (inputReplyTo = T.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    ls6 mediaDataController2 = getMediaDataController();
                    long j8 = this.l6;
                    if (l != null) {
                        j5 = l.longValue();
                    } else {
                        j5 = this.s4;
                    }
                    zh6 zh6Var2 = (zh6) mediaDataController2.v1.f(j8);
                    if (zh6Var2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) zh6Var2.f(j5);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z2 || T == null) && this.a0.getFieldText() != null && (this.g4 != 0 || getUserConfig().e() != a() || T == null || this.Tc >= T.date)) {
                    if (z && T == null) {
                        this.a0.setFieldText("");
                        this.a0.setEffectId(0L);
                        E7(true);
                    }
                } else if (U != null) {
                    this.a0.setVoiceDraft(U);
                } else if (T != null) {
                    this.Tc = T.date;
                    nr1 nr1Var2 = this.a0;
                    nr1Var2.M3 = null;
                    nr1Var2.N3 = !T.no_webpage;
                    boolean isEmpty = T.entities.isEmpty();
                    ?? r11 = T.message;
                    if (!isEmpty) {
                        r11 = SpannableStringBuilder.valueOf(r11);
                        Collections.sort(T.entities, ls6.g2);
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
                                            smb smbVar = new smb(obj, 0);
                                            int i5 = messageEntity.offset;
                                            ls6.f(smbVar, i5, messageEntity.length + i5, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                            ?? obj2 = new Object();
                                            obj2.a |= 2;
                                            smb smbVar2 = new smb(obj2, 0);
                                            int i6 = messageEntity.offset;
                                            ls6.f(smbVar2, i6, messageEntity.length + i6, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                            ?? obj3 = new Object();
                                            obj3.a |= i;
                                            smb smbVar3 = new smb(obj3, 0);
                                            int i7 = messageEntity.offset;
                                            ls6.f(smbVar3, i7, messageEntity.length + i7, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                            ?? obj4 = new Object();
                                            obj4.a |= 16;
                                            smb smbVar4 = new smb(obj4, 0);
                                            int i8 = messageEntity.offset;
                                            ls6.f(smbVar4, i8, messageEntity.length + i8, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                            h8c h8cVar = new h8c(messageEntity.url, null);
                                            int i9 = messageEntity.offset;
                                            r11.setSpan(h8cVar, i9, messageEntity.length + i9, 33);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                            ?? obj5 = new Object();
                                            obj5.a |= 256;
                                            smb smbVar5 = new smb(obj5, 0);
                                            int i10 = messageEntity.offset;
                                            ls6.f(smbVar5, i10, messageEntity.length + i10, r11, true);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                            int i11 = messageEntity.offset;
                                            r19.c(r11, i11, messageEntity.length + i11, messageEntity.collapsed);
                                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                            try {
                                                fontMetricsInt = this.a0.getEditField().getPaint().getFontMetricsInt();
                                            } catch (Exception e) {
                                                cc4.g(e, false);
                                                fontMetricsInt = null;
                                            }
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                            if (tL_messageEntityCustomEmoji.document != null) {
                                                hmVar = new hm(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                            } else {
                                                hmVar = new hm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                            }
                                            int i12 = messageEntity.offset;
                                            r11.setSpan(hmVar, i12, messageEntity.length + i12, 33);
                                        }
                                    } else {
                                        ?? obj6 = new Object();
                                        obj6.a |= 4;
                                        smb smbVar6 = new smb(obj6, 0);
                                        int i13 = messageEntity.offset;
                                        ls6.f(smbVar6, i13, messageEntity.length + i13, r11, true);
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
                            i8c i8cVar = new i8c(String.valueOf(j4), 3, null);
                            int i14 = messageEntity.offset;
                            r11.setSpan(i8cVar, i14, messageEntity.length + i14, 33);
                            i4++;
                            i3 = i;
                            j6 = j3;
                        }
                    }
                    j2 = j6;
                    this.a0.Q1(r11, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.a0.setSelection(T.message.indexOf(10) + 1);
                        hl.d3(new zo1(this, (byte) 1), 700L);
                    }
                    this.a0.setEffectId(T.effect);
                    if (T != null && (suggestedPost = T.suggested_post) != null) {
                        b77 b = b77.b(suggestedPost);
                        this.y5 = b;
                        fc(b);
                    }
                    r47Var = this.F5;
                    if (r47Var != null || this.m4 == r47Var) {
                        if (message == null && ((r47Var2 = this.m4) == null || r47Var2.e1() != message.id)) {
                            r47 r47Var3 = new r47(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = r47Var3;
                            TLRPC.InputReplyTo inputReplyTo2 = T.reply_to;
                            if (inputReplyTo2 != null) {
                                int i15 = inputReplyTo2.flags;
                                if ((i15 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i16 = -1;
                                    if (arrayList != null) {
                                        int i17 = inputReplyTo2.quote_offset;
                                        if (!arrayList.isEmpty()) {
                                            r47.B0(r47Var3.k);
                                            ?? obj7 = new Object();
                                            obj7.a = r47Var3;
                                            obj7.b = -1;
                                            obj7.c = -1;
                                            obj7.d = -1;
                                            obj7.m = true;
                                            obj7.e(i17, arrayList);
                                            ou1Var2 = obj7;
                                        }
                                        this.D5 = ou1Var2;
                                    } else {
                                        String str2 = inputReplyTo2.quote_text;
                                        if ((i15 & 16) != 0) {
                                            i16 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = r47Var3.k;
                                        if (message4 != null && (str = message4.message) != null && str2 != null && (Y = r47.Y(i16, str, str2)) >= 0) {
                                            r47.B0(r47Var3.k);
                                            ou1Var = new ou1(Y, str2.length() + Y, r47Var3);
                                        }
                                        this.D5 = ou1Var;
                                    }
                                }
                            }
                            h5(false);
                            ou1 ou1Var3 = this.D5;
                            r47 r47Var4 = this.F5;
                            if (ou1Var3 != null) {
                                ec(r47Var4, ou1Var3);
                            } else {
                                dc(r47Var4);
                            }
                            Pc(false);
                            return;
                        } else if (l == null && l.longValue() != j2 && this.e != null && (f = getMessagesController().g4.f(this.e.id, l.longValue())) != null && (message2 = f.topicStartMessage) != null) {
                            r47 r47Var5 = new r47(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = r47Var5;
                            r47Var5.j1 = f;
                            dc(r47Var5);
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
                    b77 b2 = b77.b(suggestedPost);
                    this.y5 = b2;
                    fc(b2);
                }
                r47Var = this.F5;
                if (r47Var != null) {
                }
                if (message == null) {
                }
                if (l == null) {
                }
            }
        }
    }

    public final void H5() {
        float f = this.T9;
        zr1 zr1Var = this.D1;
        if (zr1Var != null) {
            zr1Var.setTranslationY(f);
            f += hl.L(35.0f) * this.D1.F;
        }
        kr1 kr1Var = this.E1;
        if (kr1Var != null) {
            kr1Var.setTranslationY(f);
        }
        float U6 = (U6() * hl.L(43.0f)) + f;
        l1c l1cVar = this.g2;
        h1c h1cVar = h1c.a;
        if (l1cVar != null) {
            l1cVar.setSideMenuBackgroundMarginTop((U6() * t7(hl.L(7.0f))) + U6);
            float u7 = u7(h1cVar);
            float a = qke.a(this.ud.e);
            float U62 = U6();
            U6 += qke.a(Math.min(ete.a(qke.a(a), 0.0f, 1.0f), ete.a(qke.a(U62), 0.0f, 1.0f))) * u7;
        }
        wz1 wz1Var = this.b1;
        if (wz1Var != null) {
            wz1Var.setTranslationY((U6 - hl.L(5.0f)) - (U6() * u7(h1cVar)));
        }
    }

    public final void H6(boolean z) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.r8 != null && !xc2.r0(chat) && !this.e.creator) {
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
                getMessagesController().E(this.e.id, false);
            }
        }
    }

    public final void H7(boolean z) {
        if (!z) {
            kg5 kg5Var = this.B2;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = this.v2;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
            kg5 kg5Var3 = this.x2;
            if (kg5Var3 != null) {
                kg5Var3.f(true);
            }
        }
        kg5 kg5Var4 = this.A2;
        if (kg5Var4 != null) {
            kg5Var4.f(true);
        }
        kg5 kg5Var5 = this.z2;
        if (kg5Var5 != null) {
            kg5Var5.f(true);
        }
        kg5 kg5Var6 = this.I2;
        if (kg5Var6 != null) {
            kg5Var6.f(true);
        }
        kg5 kg5Var7 = this.J2;
        if (kg5Var7 != null) {
            kg5Var7.f(true);
        }
        kg5 kg5Var8 = this.C2;
        if (kg5Var8 != null) {
            kg5Var8.f(true);
        }
        kg5 kg5Var9 = this.D2;
        if (kg5Var9 != null) {
            kg5Var9.f(true);
        }
        ug2 ug2Var = this.K2;
        if (ug2Var != null) {
            ug2Var.f(true);
        }
        kg5 kg5Var10 = this.Y0;
        if (kg5Var10 != null) {
            kg5Var10.f(true);
        }
        kg5 kg5Var11 = this.a1;
        if (kg5Var11 != null) {
            kg5Var11.f(true);
        }
        kg5 kg5Var12 = this.Z0;
        if (kg5Var12 != null) {
            kg5Var12.f(true);
        }
    }

    public final void H8() {
        if (this.m3.getAlpha() != 0.0f && !this.actionBar.z() && !c8()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.m3.getCustomDate() * 1000);
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.clear();
            calendar.set(i, i2, i3);
            m8((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public final void H9(int i) {
        this.actionBar.getActionBarMenuOnItemClick().b(i);
    }

    public final void Ha() {
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

    public final void Hb(TLRPC.ChatTheme chatTheme) {
        boolean z;
        boolean z2;
        if (this.Ba != null && this.za == null) {
            dpb c = dpb.c(chatTheme);
            af2 e = af2.e(this.currentAccount);
            e.q(this.l6, dpb.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                e.n(chatTheme);
                ez3 g = e.g(c);
                if (g == null) {
                    g = new ez3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    g.k();
                    g.m(this.currentAccount);
                }
                ez3 ez3Var = g;
                xu1 xu1Var = this.Ba;
                TLRPC.WallPaper wallPaper = xu1Var.g;
                if (this.h6 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xu1Var.q(ez3Var, wallPaper, z2, null, false);
                return;
            }
            if (c != null && !c.b()) {
                el1 el1Var = new el1(this, (byte) 20);
                String str = c.b;
                if (c.b()) {
                    el1Var.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    ez3 ez3Var2 = (ez3) e.e.get(str);
                    if (ez3Var2 != null) {
                        ez3Var2.k();
                        el1Var.onComplete(ez3Var2);
                    } else {
                        el1Var.onComplete(null);
                    }
                } else {
                    e.o(new ye2(c, el1Var), false);
                }
            }
            TLRPC.WallPaper c2 = e.c(this.l6);
            xu1 xu1Var2 = this.Ba;
            ez3 ez3Var3 = xu1Var2.f;
            if (this.h6 != 0) {
                z = true;
            } else {
                z = false;
            }
            xu1Var2.q(ez3Var3, c2, z, null, false);
        }
    }

    public final void Hc(boolean z) {
        if (!getMessagesController().p2(this.l6, c(), null)) {
            if (z) {
                getNotificationsController().G(this.l6, c(), true);
                return;
            }
            nx0 C = jj.C(this.l6, c(), this.Ba, this);
            boolean Y7 = Y7();
            C.i0 = Y7;
            C.n = Y7;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.l6, c(), false);
        if (!z) {
            d31.z(this, 4, 0, this.Ba).j();
        }
    }

    public final boolean I4() {
        if (!xc2.u0(this.e)) {
            TLRPC.User user = this.f;
            if (!lbc.w(user) || !user.bot_forum_sidebar) {
                if (!lbc.w(this.f) && !xc2.a(this.e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void I5() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i;
        r47 r47Var;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.N6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i2 = 0;
            zh6 zh6Var = null;
            ArrayList arrayList3 = null;
            int i3 = 0;
            while (true) {
                arrayList = this.M6;
                if (i3 >= size) {
                    break;
                }
                r47 r47Var2 = (r47) sparseArray.valueAt(i3);
                if (r47Var2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i3)));
                    if (!(r47Var2.k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = r47Var2.C.k.fwd_from) != null && r47.B1(messageFwdHeader.saved_from_peer) == this.l6 && (i = r47Var2.C.k.fwd_from.channel_post) != 0 && (r47Var = (r47) this.G6[i2].get(i)) != null && (messageReplies = r47Var.k.replies) != null) {
                        messageReplies.replies++;
                        r47Var.k1 = true;
                        TLRPC.Message message = r47Var2.k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i4 = i2;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            } else if (r47.B1(r47Var.k.replies.recent_repliers.get(i4)) == r47.B1(peer)) {
                                r47Var.k.replies.recent_repliers.remove(i4);
                                break;
                            } else {
                                i4++;
                            }
                        }
                        r47Var.k.replies.recent_repliers.add(i2, peer);
                        if (!r47Var2.N3()) {
                            r47Var.k.replies.max_id = r47Var2.e1();
                        }
                        jf7 messagesStorage = getMessagesStorage();
                        long j = this.e.id;
                        int e1 = r47Var.e1();
                        TLRPC.MessageReplies messageReplies2 = r47Var.k.replies;
                        messagesStorage.a.c(new ed7(messagesStorage, e1, j, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (r47Var.z2()) {
                            m47 m47Var = (m47) this.P6.f(r47Var.c1());
                            if (m47Var != null) {
                                ArrayList arrayList4 = m47Var.d;
                                if (zh6Var == null) {
                                    zh6Var = new zh6();
                                }
                                zh6Var.k(m47Var.a, m47Var);
                                int size3 = arrayList4.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    ((r47) arrayList4.get(i5)).k1 = true;
                                }
                            }
                        } else if (this.D0 != null && (indexOf = arrayList.indexOf(r47Var)) >= 0) {
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
                if (zh6Var != null) {
                    int m = zh6Var.m();
                    for (int i7 = 0; i7 < m; i7++) {
                        m47 m47Var2 = (m47) zh6Var.n(i7);
                        int indexOf2 = arrayList.indexOf((r47) c00.g(1, m47Var2.d));
                        if (indexOf2 >= 0) {
                            it1 it1Var = this.D0;
                            if (!it1Var.O) {
                                it1Var.l(indexOf2 + it1Var.K, m47Var2.d.size());
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

    public final void I6(defpackage.r47 r78, java.util.ArrayList r79, java.util.ArrayList r80, java.util.ArrayList r81) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.I6(r47, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void I7() {
        ValueAnimator valueAnimator = this.Rb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dl1 dl1Var = this.o3;
        if (dl1Var != null && dl1Var.getTag() != null) {
            this.o3.setTag(null);
            dl1 dl1Var2 = this.o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ml1(this, dl1Var2, (byte) 1));
            ofFloat.addListener(new v5(this, dl1Var2, (byte) 7));
            ofFloat.setDuration(150L);
            this.Rb = ofFloat;
            ofFloat.start();
        }
    }

    public final void I8(TLRPC.TL_document tL_document, String str, Object obj, boolean z, int i) {
        r7a.B(this.currentAccount).t0(tL_document, str, this.l6, this.F5, this.m4, null, this.D5, null, z, i, 0, false, obj, X6(), 0L, k7(), this.y5);
    }

    public final void I9() {
        int i;
        String str;
        int i2;
        Activity parentActivity = getParentActivity();
        int i3 = this.currentAccount;
        long j = this.l6;
        xu1 xu1Var = this.Ba;
        int i4 = y92.M;
        nx0 nx0Var = new nx0(1, (vnb) xu1Var, (Context) parentActivity, false);
        nx0Var.L(aob.h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624078, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = hl.L(80.0f);
        int i5 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i5, xu1Var));
        uob M = yob.M(i5);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, xu1Var);
        linearLayout.addView((View) imageView, tre.t(80, 80, 1, 0, 16, 0, 16));
        boolean M3 = uc7.s1(i3).M3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        int i6 = aob.j5;
        yob.X(textView, i6, xu1Var);
        textView.setTextSize(1, 20.0f);
        if (M3) {
            i = 2131746765;
        } else {
            i = 2131746766;
        }
        textView.setText(ob6.M0(i, null));
        linearLayout.addView(textView, tre.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        yob.X(textView2, i6, xu1Var);
        textView2.setTextSize(1, 14.0f);
        if (j > 0) {
            str = lbc.k(uc7.s1(i3).X1(Long.valueOf(j)), true);
        } else {
            str = "";
        }
        if (M3) {
            i2 = 2131746763;
        } else {
            i2 = 2131746764;
        }
        uh9.r(null, null, i2, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, tre.t(-1, -2, 1, 12, 9, 12, 19));
        if (!M3) {
            ok8 ok8Var = new ok8(xu1Var, parentActivity, true);
            ok8Var.setOnClickListener(new rg(nx0Var, (byte) 4));
            ok8Var.c(ob6.M0(2131746767, null), false, false);
            linearLayout.addView(ok8Var, tre.t(-1, 48, 1, 0, 0, 0, 4));
        }
        nx0Var.O = linearLayout;
        nx0Var.show();
    }

    public final void Ia(long j, boolean z) {
        if (this.g2 != null && lbc.w(this.f)) {
            this.g2.setAllTopicsHidden(true);
        }
        this.e6.put(j, 1);
        i6();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.l6, 0, new ln1(this, j, z), new xn0(this, j, (byte) 2));
        this.D0.J(false);
    }

    public final void Ib(View view, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Ib(viewGroup.getChildAt(i), z);
            }
        }
        if (view != this.A0 && view != this.m1) {
            view.setEnabled(z);
        }
    }

    public final void Ic(q7 q7Var, boolean z) {
        Set set;
        if (q7Var != null) {
            if (z) {
                set = this.V0;
            } else {
                set = this.U0;
            }
            set.add(q7Var);
        }
    }

    @Override
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        tb(i, i2, z, i3, z2, i4, null, null, null);
    }

    public final int J4(int i) {
        r47 messageObject;
        int i2;
        int height = this.A0.getHeight();
        int i3 = 0;
        long j = 0;
        while (true) {
            View V0 = this.A0.V0(i);
            if (V0 == null) {
                break;
            }
            if (V0 instanceof wb2) {
                wb2 wb2Var = (wb2) V0;
                messageObject = wb2Var.getMessageObject();
                i2 = wb2Var.getAdditionalPaddingHeight();
            } else if (V0 instanceof dl1) {
                messageObject = ((dl1) V0).getMessageObject();
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
                height = Math.min(height, V0.getTop());
                i3 = Math.max(i3, V0.getBottom() - i2);
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

    public final void J5(boolean z) {
        boolean z2;
        this.wb = 0;
        this.xb = Integer.MIN_VALUE;
        if (this.ub) {
            this.ub = false;
            this.vb = false;
            zq1 zq1Var = this.C0;
            if (zq1Var != null) {
                zq1Var.G = true;
            }
        }
        this.M6.clear();
        this.J6.clear();
        this.K6.clear();
        this.z6.clear();
        this.P6.b();
        this.y4 = false;
        it1 it1Var = this.D0;
        if (it1Var != null) {
            if (it1Var.x < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sc(z2);
        }
        wq1 wq1Var = this.A0;
        if (wq1Var != null) {
            wq1Var.setEmptyView(null);
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
        it1 it1Var2 = this.D0;
        if (it1Var2 != null && !it1Var2.O) {
            it1Var2.J(false);
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
            r47 r47Var = (r47) arrayList3.get(i12);
            Integer num = r47Var.a3;
            if (num != null) {
                i6 = num.intValue();
                i4 = i13;
                i5 = i14;
            } else {
                int i16 = r47Var.D;
                if (i16 == 0) {
                    int W5 = r47Var.W5();
                    if ((r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && (r47.n1(r47Var.k).webpage instanceof TLRPC.TL_webPage)) {
                        i11 = hl.L(100.0f);
                    } else {
                        i11 = z;
                    }
                    i6 = W5 + i11;
                    if (r47Var.d4()) {
                        i10 = hl.L(42.0f) + i6;
                        i6 = i10;
                    }
                    i4 = i13;
                } else {
                    if (i16 == 20) {
                        i10 = hl.Y0(z);
                    } else if (i16 == 2) {
                        i10 = hl.L(72.0f);
                    } else if (i16 == 12) {
                        i10 = hl.L(71.0f);
                    } else if (i16 == 9) {
                        i10 = hl.L(100.0f);
                    } else if (i16 == 4) {
                        i10 = hl.L(114.0f);
                    } else if (i16 == 14) {
                        i10 = hl.L(82.0f);
                    } else {
                        if (i16 != 10 && i16 != 35 && i16 != 33 && i16 != 34) {
                            if (i16 != 11 && i16 != 18 && i16 != 31 && i16 != 30 && i16 != 25 && i16 != 21) {
                                if (i16 == 32) {
                                    i10 = hl.L(234.0f);
                                } else if (i16 == 5) {
                                    i10 = hl.u;
                                } else if (i16 == 19) {
                                    i6 = hl.L(30.0f) + r47Var.W5();
                                    i4 = i13;
                                } else if (i16 != 13 && i16 != 15) {
                                    if (hl.O1()) {
                                        min = hl.P0() * 0.7f;
                                    } else {
                                        Point point = hl.q;
                                        min = Math.min(point.x, point.y) * 0.7f;
                                    }
                                    int i17 = (int) min;
                                    int L2 = hl.L(100.0f) + i17;
                                    boolean z2 = z;
                                    if (i17 > hl.Y0(z2)) {
                                        i17 = hl.Y0(z2);
                                    }
                                    if (L2 > hl.Y0(z2)) {
                                        L2 = hl.Y0(z2);
                                    }
                                    ArrayList arrayList8 = r47Var.p0;
                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                        i4 = i13;
                                        photoSize = (TLRPC.PhotoSize) r47Var.p0.get(z2 ? 1 : 0);
                                    } else {
                                        i4 = i13;
                                        photoSize = null;
                                    }
                                    if (photoSize != null) {
                                        int i18 = (int) (photoSize.h / (photoSize.w / i17));
                                        if (i18 == 0) {
                                            i18 = hl.L(100.0f);
                                        }
                                        if (i18 <= L2) {
                                            if (i18 < hl.L(120.0f)) {
                                                L2 = hl.L(120.0f);
                                            } else {
                                                L2 = i18;
                                            }
                                        }
                                    }
                                    i6 = hl.L(14.0f) + L2;
                                } else {
                                    i4 = i13;
                                    Point point2 = hl.q;
                                    float f2 = point2.y * 0.4f;
                                    if (hl.O1()) {
                                        i7 = hl.P0();
                                    } else {
                                        i7 = point2.x;
                                    }
                                    float f3 = i7 * 0.5f;
                                    TLRPC.Document F0 = r47Var.F0();
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
                                        i9 = hl.L(100.0f) + i8;
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
                                    i6 = hl.L(14.0f) + i8;
                                    r47Var.a3 = Integer.valueOf(i6);
                                }
                            } else {
                                i4 = i13;
                                i5 = i14;
                                L = hl.L(50.0f);
                            }
                        } else {
                            i4 = i13;
                            i5 = i14;
                            L = hl.L(30.0f);
                        }
                        i6 = L;
                        r47Var.a3 = Integer.valueOf(i6);
                    }
                    i6 = i10;
                    i4 = i13;
                }
                i5 = i14;
                r47Var.a3 = Integer.valueOf(i6);
            }
            arrayList4.add(Integer.valueOf(i6));
            if (r47Var.q4() || i12 == indexOf) {
                if (i12 == indexOf) {
                    i15 = i4;
                }
                arrayList6.add(Integer.valueOf(i12));
                arrayList5.add(Integer.valueOf(i4));
                arrayList7.add(Integer.valueOf(i5));
            }
            if (r47Var.A2()) {
                if (!hashSet.contains(Long.valueOf(r47Var.c1()))) {
                    hashSet.add(Long.valueOf(r47Var.c1()));
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
            r47 r47Var2 = (r47) arrayList3.get(indexOf);
            int intValue = ((Integer) arrayList4.get(indexOf)).intValue();
            if (r47Var2.A2()) {
                if (!hashSet.contains(Long.valueOf(r47Var2.c1()))) {
                    hashSet.add(Long.valueOf(r47Var2.c1()));
                }
                if (r47Var2.q4() && !r47Var2.A2() && r47Var2 != this.b8) {
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
                        if (Math.abs(i24 - indexOf) > this.yc + 1 && Math.abs(i25 - i3) > this.yc + 1 && Math.abs(i26 - (i15 + i30)) > hl.q.y) {
                            i31 = -1;
                        }
                    }
                    if (i23 == i31 || (Math.abs(i23 - indexOf) > this.yc + 1 && Math.abs(i28 - i3) > this.yc + 1 && Math.abs(i27 - i15) > hl.q.y)) {
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
            if (r47Var2.q4()) {
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
            r47 r47Var3 = (r47) arrayList3.get(i34);
            int intValue3 = ((Integer) arrayList4.get(i34)).intValue();
            if (!r47Var3.A2()) {
                i32++;
                i33 += intValue3;
            } else if (!hashSet.contains(Long.valueOf(r47Var3.c1()))) {
                hashSet.add(Long.valueOf(r47Var3.c1()));
                i32++;
            }
            if (!r47Var3.q4() && !r47Var3.A2() && r47Var3 != this.b8) {
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
                    if (Math.abs(i39 - i34) >= this.yc + 1 && Math.abs(i40 - i32) >= this.yc + 1 && Math.abs(i41 - (intValue3 + i33)) > hl.q.y) {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                if (i36 == i2 || (Math.abs(i36 - i34) >= this.yc + 1 && Math.abs(i38 - i32) >= this.yc + 1 && Math.abs(i37 - i33) > hl.q.y)) {
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
        ms1 ms1Var;
        ms1 ms1Var2 = this.M2;
        if (ms1Var2 == null || ms1Var2.getTag() != null) {
            return false;
        }
        wz1 wz1Var = this.b1;
        if (wz1Var != null && (ms1Var = this.M2) != null) {
            wz1Var.j(ms1Var, false, z);
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

    public final void J8(int i, View view) {
        hm hmVar;
        TLRPC.User user;
        char c;
        qr1 qr1Var;
        qr1 qr1Var2;
        if (i != 0) {
            r17 adapter = this.X1.getAdapter();
            if (adapter.x0 != null && !adapter.i0) {
                return;
            }
            int i2 = i - 1;
            Object J = this.X1.getAdapter().J(i2);
            int i3 = this.X1.getAdapter().Y;
            int i4 = this.X1.getAdapter().Z;
            if (this.X1.getAdapter().G != null && i2 == 1) {
                this.a0.y1(i3, i4, this.X1.getAdapter().G + "@" + xc2.K(this.e, false) + " ", false);
            } else if (this.X1.getAdapter().G != null && i2 == 0) {
                this.a0.y1(i3, i4, c00.k(new StringBuilder(), this.X1.getAdapter().G, " "), false);
            } else if (J instanceof a19) {
                if (!getUserConfig().p()) {
                    showDialog(new xk8(this, getParentActivity(), this.currentAccount, true, 31, false, null));
                    return;
                }
                a19 a19Var = (a19) J;
                jj.X(this.currentAccount, this.l6, Math.max(1, a19Var.a()), new y0(this, a19Var, (byte) 17));
            } else {
                n47 n47Var = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (this.g4 != 0 || !q5(view)) {
                        if (view instanceof u2b) {
                            n47Var = ((u2b) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        jj.X(this.currentAccount, a(), 1, new hu0(this, tL_document, r47.U(tL_document), this.X1.getAdapter().L(i2), n47Var, (byte) 4));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (this.C3 && (qr1Var2 = this.g3) != null && qr1Var2.getVisibility() == 0) {
                        vb(chat, null);
                        return;
                    }
                    String K = xc2.K(chat, false);
                    if (K != null) {
                        this.a0.y1(i3, i4, qd4.y("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (this.C3 && (qr1Var = this.g3) != null && qr1Var.getVisibility() == 0) {
                        vb(null, user2);
                    } else if (lbc.p(user2) != null) {
                        this.a0.y1(i3, i4, "@" + lbc.p(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(qd4.o(lbc.k(user2, false), " "));
                        spannableString.setSpan(new i8c(String.valueOf(user2.id), 3, null), 0, spannableString.length(), 33);
                        this.a0.y1(i3, i4, spannableString, false);
                    }
                } else if (J instanceof o17) {
                    if (this.X1.getAdapter().K != null && this.g4 != 1) {
                        o17 o17Var = (o17) J;
                        p7a b = p7a.b(o17Var.a, this.l6, this.F5, this.m4, null, false, null, null, null, true, 0, 0, null, false);
                        b.K = X6();
                        b.X = o17Var.b;
                        b.R = k7();
                        b.T = this.y5;
                        getSendMessagesHelper().q0(b);
                        this.a0.setFieldText("");
                        E7(false);
                    }
                } else if (J instanceof String) {
                    if (this.X1.getAdapter().K != null) {
                        if (this.g4 == 1) {
                            jj.J(getParentActivity(), this.l6, new h01(this, (String) J, (byte) 12), this.Ba);
                            return;
                        } else if (!q5(view)) {
                            jj.X(this.currentAccount, this.l6, 1, new y0(this, (String) J, (byte) 18));
                            return;
                        } else {
                            return;
                        }
                    }
                    this.a0.y1(i3, i4, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (this.a0.getFieldText() != null) {
                        if (this.g4 == 1 || !q5(view)) {
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
                                    String M0 = ob6.M0(2131745324, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    if (c == 1) {
                                        idVar.U = ob6.M0(2131750436, null);
                                    } else {
                                        idVar.U = ob6.M0(2131748857, null);
                                    }
                                    alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                                    showDialog(idVar);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(this.X1.getAdapter().S);
                                this.fb = arrayList;
                                PhotoViewer.q0().T1(null, this, this.Ba);
                                PhotoViewer.q0().o1(arrayList, this.X1.getAdapter().M(i2), 3, false, this.gb, this);
                                return;
                            }
                            jj.X(this.currentAccount, a(), 1, new y0(this, botInlineResult, (byte) 19));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    jj1 jj1Var = new jj1(this, (TLRPC.TL_inlineBotWebView) J, (byte) 7);
                    if (this.Ub) {
                        jj1Var.run();
                    } else {
                        exc.a(getParentActivity(), new y0(this, jj1Var, (byte) 23), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    fr1 fr1Var = this.X1;
                    if (fr1Var != null && (user = fr1Var.getAdapter().x0) != null) {
                        this.a0.setFieldText("");
                        long j = this.l6;
                        if (j == user.id) {
                            this.x8 = j;
                            getMessagesController().M4(tL_inlineBotSwitchPM.start_param, this.f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", this.l6);
                        if (getMessagesController().C(bundle, this, null, null)) {
                            presentFragment(new zu1(bundle));
                        }
                    }
                } else if (J instanceof hs6) {
                    String str = ((hs6) J).a;
                    nr1 nr1Var = this.a0;
                    nr1Var.Z();
                    nr1Var.V0.d(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            this.a0.y1(i3, i4, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = this.a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                cc4.g(e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e2 = wl.e(this.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(r47.U(e2));
                            if (e2 != null) {
                                hmVar = new hm(e2, fontMetricsInt);
                            } else {
                                hmVar = new hm(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(hmVar, 0, spannableString2.length(), 33);
                            this.a0.y1(i3, i4, spannableString2, false);
                            this.X1.o(false);
                        }
                    }
                    this.a0.y1(i3, i4, str, true);
                    this.X1.o(false);
                }
            }
        }
    }

    public final void J9(long j) {
        if (jxa.v(this.currentAccount, false).m().amount < j) {
            new dza(getParentActivity(), getResourceProvider(), j, 13, wf3.s(a()), new gn1(this, (byte) 0), a()).show();
        } else {
            new eza(getParentActivity(), this.resourceProvider).show();
        }
    }

    public final boolean Ja() {
        if (this.V4.size() != 1 || this.n4 == null || ((Integer) this.V4.get(0)).intValue() != this.n4.e1()) {
            return false;
        }
        return true;
    }

    public final void Jb(boolean z) {
        Kb(z, false, true);
    }

    public final void Jc(r47 r47Var) {
        if (r47Var == null) {
            return;
        }
        v21 v21Var = this.P3;
        if (v21Var != null) {
            v21Var.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.v5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(r47Var.e1()));
        int i = this.e5;
        getNotificationCenter().k(jn7.t0, Long.valueOf(this.l6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.e5 - 1), Boolean.valueOf(this.g5));
        this.P3 = d31.B(this, false, new gp6(this, arrayList2, arrayList, i, (byte) 11), new fm1(this, r47Var, (byte) 2), this.Ba).j();
    }

    @Override
    public final boolean K() {
        return this.A8;
    }

    public final float K4(boolean z) {
        float f;
        float f2;
        float f3;
        nr1 nr1Var = this.a0;
        float f4 = 0.0f;
        if (nr1Var != null) {
            if (z) {
                f = nr1Var.P7;
            } else {
                f = nr1Var.O7;
            }
        } else {
            f = 0.0f;
        }
        float max = Math.max(f, hl.L(44.0f));
        float L = hl.L(44.0f);
        fm0 fm0Var = this.sd;
        ykf ykfVar = this.xd;
        if (z) {
            if (31 - Integer.numberOfLeadingZeros(ykfVar.a) == 1) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(ykfVar.a) == 0) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            if (fm0Var.f) {
                f4 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) ykfVar.b;
            float f5 = fArr[1];
            f2 = 1.0f - fArr[0];
            f4 = fm0Var.e;
            f3 = f5;
        }
        if (!this.mb && !isInPreviewMode()) {
            return hl.R1(Math.max(hl.R1(L, max, f3) * f2, hl.L(44.0f)), -hl.L(7.0f), f4);
        }
        return hl.R1(L, max, f3) * f2;
    }

    public final void K5(boolean z, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.R6;
        if (z) {
            if (f11.a) {
                StringBuilder sb = new StringBuilder("clear history by overwrite firstLoading=");
                sb.append(this.Z6);
                sb.append(" minMessage=");
                sb.append(iArr[0]);
                sb.append(" topMessage=");
                c00.q(tL_updates_channelDifferenceTooLong.dialog.top_message, sb);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i = dialog.top_message;
            int i2 = iArr[0];
            if (i > i2) {
                this.V7 = Math.max(i2 + 1, dialog.read_inbox_max_id);
            }
            this.W6[0] = false;
            this.X6 = false;
            it1 it1Var = this.D0;
            if (it1Var != null && it1Var.G < 0) {
                it1Var.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i3 = dialog2.unread_count;
            this.B6 = i3;
            this.D6 = dialog2.unread_mentions_count;
            if (this.C6 != i3) {
                vz1 vz1Var = this.y1;
                if (vz1Var != null) {
                    vz1Var.c(1, i3, this.f6);
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
                    vz1 vz1Var2 = this.y1;
                    if (vz1Var2 != null) {
                        vz1Var2.c(2, i5, true);
                    }
                    mc(true);
                }
            }
            m5(false);
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
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.K1(null, true, false);
            }
        }
        if (this.R != null) {
            sc(false);
            U5(false);
            this.A0.setEmptyView(this.f1);
        }
        it1 it1Var2 = this.D0;
        if (it1Var2 != null) {
            it1Var2.J(false);
        }
        if (this.h == null && (user = this.f) != null && user.bot && this.w8 == null) {
            this.w8 = "";
            Pc(false);
        }
    }

    public final void K7() {
        gs1 gs1Var = this.Mb;
        if (gs1Var == null) {
            return;
        }
        this.Mb = null;
        gs1Var.b();
        if (gs1Var.getReactionsWindow() != null && gs1Var.getReactionsWindow().a != null) {
            gs1Var.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
        }
        gs1Var.animate().alpha(0.01f).translationY(-hl.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new jj1(this, gs1Var, (byte) 19)).setDuration(180L).start();
    }

    public final void K8(int i) {
        if (this.g4 == 7) {
            Object E = this.b4.E(i);
            if (i == 0) {
                this.b4.getClass();
            }
            if (E instanceof r47) {
                va((r47) E);
            }
        } else if (this.F3 != null) {
            if (i >= 0 && i < getMediaDataController().Z0.size()) {
                r47 r47Var = (r47) getMediaDataController().Z0.get(i);
                this.G3 = false;
                Kb(false, true, false);
                ls6 mediaDataController = getMediaDataController();
                if (i >= 0) {
                    if (i < mediaDataController.Z0.size()) {
                        mediaDataController.f1 = i;
                    }
                } else {
                    mediaDataController.getClass();
                }
                nd(getMediaDataController().e0(), getMediaDataController().f1, getMediaDataController().k0());
                hl.c3(new fm1(this, r47Var, (byte) 1));
            }
        } else {
            ls6 mediaDataController2 = getMediaDataController();
            int i2 = this.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i >= 0 && i < arrayList.size()) {
                mediaDataController2.f1 = i;
                r47 r47Var2 = (r47) arrayList.get(i);
                mediaDataController2.getNotificationCenter().k(jn7.H0, Integer.valueOf(i2), Integer.valueOf(r47Var2.e1()), Integer.valueOf(mediaDataController2.e0()), Long.valueOf(r47.B0(r47Var2.k)), Integer.valueOf(mediaDataController2.f1), Integer.valueOf(mediaDataController2.k0()), Boolean.TRUE);
            }
            nc(false);
        }
    }

    public final void K9(long j) {
        if (jxa.v(this.currentAccount, false).m().amount < j) {
            new dza(getParentActivity(), getResourceProvider(), j, 13, wf3.s(a()), new gn1(this, (byte) 0), a()).show();
        } else {
            new eza(getParentActivity(), this.resourceProvider).show();
        }
    }

    public final void Ka() {
        wb2 wb2Var;
        this.sd.a(false, true);
        xg8 xg8Var = this.yd;
        if (xg8Var != null && (wb2Var = xg8Var.n) != null && wb2Var.getDelegate() != null) {
            xg8Var.n.getDelegate().l1(xg8Var.n, false);
        }
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            nr1Var.G1(true, true, false);
            this.a0.w7 = null;
        }
    }

    public final void Kb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Kb(boolean, boolean, boolean):void");
    }

    public final void Kc() {
        boolean c8 = c8();
        SparseArray[] sparseArrayArr = this.o6;
        if (!c8) {
            if (this.actionBar.z() && this.q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.q1.c(ob6.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        sr1 sr1Var = this.E0;
        if (size == 0) {
            sr1Var.setText(ob6.M0(2131745940, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        sr1Var.setText(ob6.a0(null, null, 2131745941, ob6.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    public final boolean L4(r47 r47Var) {
        if (!a8()) {
            TLRPC.Message message = r47Var.k;
            if ((message == null || !message.noforwards) && !r47Var.f4() && !r47Var.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L5(boolean z) {
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

    public final jf0 L6(int i, boolean z) {
        r47 messageObject;
        wq1 wq1Var = this.A0;
        if (wq1Var != null) {
            int childCount = wq1Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.A0.getChildAt(i2);
                if (childAt instanceof wb2) {
                    messageObject = ((wb2) childAt).getMessageObject();
                } else if (childAt instanceof dl1) {
                    messageObject = ((dl1) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.e1() == i) {
                    if (z) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.P9 - this.R9) - hl.L(4.0f) || childAt.getY() > this.A0.getMeasuredHeight() - this.Ya) {
                            return null;
                        }
                    }
                    return (jf0) childAt;
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
        v21 v21Var = this.P3;
        if (v21Var != null) {
            v21Var.c(0L, false);
        }
        ls1 ls1Var = this.O3;
        if (ls1Var != null) {
            ls1Var.d(0, true);
        }
    }

    public final void L8(boolean[] zArr, Context context) {
        r47 r47Var;
        r47 r47Var2 = this.F5;
        if (r47Var2 == null || !r47.c3(r47Var2.k)) {
            boolean z = zArr[0];
            if (z) {
                zArr[0] = false;
            }
            byte b = this.dc;
            if (b == 5) {
                int i = this.currentAccount;
                long j = this.l6;
                b77 b77Var = this.y5;
                if (b77Var == null) {
                    b77Var = b77.a();
                }
                new a77(context, i, j, b77Var, this, getResourceProvider(), 0, new gl1(this, (byte) 8)).show();
            } else if (b == 1 && (r47Var = this.H5) != null) {
                if (r47Var.o5() && !z) {
                    b77 b77Var2 = this.y5;
                    if (b77Var2 == null) {
                        b77Var2 = b77.a();
                    }
                    wc(b77Var2);
                } else if (this.H5.t() && this.G5 == 0) {
                    if (this.Y1 == null) {
                        S5();
                    }
                    this.Y1.s1(-1, this.H5);
                    na();
                } else {
                    J(this.H5.e1(), 0, 0, 0, true, true);
                }
            } else if (this.x5 != null) {
                if (b == 2) {
                    if (!wf3.B(this.l6) && !this.x5.u && this.g4 != 5) {
                        boolean z2 = xea.a;
                        SharedPreferences.Editor edit = uc7.e1().edit();
                        xea.P = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        sa(0);
                        return;
                    }
                    r47 r47Var3 = this.F5;
                    if (r47Var3 != null) {
                        J(r47Var3.e1(), 0, 0, 0, true, true);
                    }
                } else if (b == 3) {
                    boolean z3 = xea.a;
                    SharedPreferences.Editor edit2 = uc7.e1().edit();
                    xea.O = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    sa(1);
                } else if (b == 4) {
                    sa(2);
                }
            }
        }
    }

    public final void L9(String str) {
        Uri parse = Uri.parse(str);
        ob5.b(getParentActivity(), this.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public final void La(wb2 wb2Var) {
        xg8 xg8Var;
        if (this.sd.f && (xg8Var = this.yd) != null && xg8Var.n == wb2Var) {
            Editable text = xg8Var.a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().k4.T.f()) {
                r7a B = r7a.B(this.currentAccount);
                r47 messageObject = wb2Var.getMessageObject();
                zg8 attachedMedia = this.yd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m1 = r47.m1(messageObject);
                    if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = r47.B0(messageObject.k);
                        messageObject.e1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) m1).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = B.getMediaDataController().Y(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof dh8) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((dh8) attachedMedia).c);
                            r7a.W(B.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof jh8) {
                            jh8 jh8Var = (jh8) attachedMedia;
                            B.s(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) jh8Var.b, null, null, null, false, false, jh8Var.c);
                        } else if (attachedMedia instanceof gh8) {
                            tL_inputPollAnswer.input_media = atb.h(((gh8) attachedMedia).b);
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof eh8) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((eh8) attachedMedia).b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            B.s(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Ka();
                return;
            }
            hl.z3(this.yd.a);
        }
    }

    public final void Lb(int i, int i2, String str) {
        this.d8 = i;
        this.f8 = true;
        this.g8 = 0L;
        this.h8 = str;
        this.k8 = i2;
        this.e8 = true;
    }

    public final void Lc() {
        Drawable r0;
        nt1 nt1Var = this.m1;
        if (nt1Var != null && this.za == null) {
            if (this.Ba.h == null || nt1Var.getBackgroundImage() == null) {
                if (this.m1.getBackgroundImage() == null || hl.O1()) {
                    if (U7()) {
                        r0 = this.m1.getCompactBackground();
                    } else {
                        r0 = aob.r0();
                    }
                    nt1 nt1Var2 = this.m1;
                    if (!U7()) {
                        int i = aob.a;
                    }
                    nt1Var2.U(r0);
                }
            }
        }
    }

    @Override
    public final long M() {
        return this.d7;
    }

    public final boolean M4() {
        if (!b8() && !getMessagesController().B2(a())) {
            if ((!getMessagesController().v2(a()) || this.x4) && getMessagesController().M1(a()) <= 0 && this.h == null) {
                rr1 rr1Var = this.d1;
                if (rr1Var == null || rr1Var.getVisibility() != 0) {
                    if (!k8() || this.x4) {
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
        this.h9 = z;
        n8 n8Var = this.g9;
        if (n8Var != null) {
            n8Var.dismiss();
        }
        if (!z) {
            ValueAnimator valueAnimator = this.Wc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Wc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Wc = ofFloat;
            ofFloat.addUpdateListener(new ql1(this, (byte) 4));
            this.Wc.setDuration(150L);
            this.Wc.start();
        }
    }

    public final dl1 M6(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i = 0; i < this.A0.getChildCount(); i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof dl1) {
                    dl1 dl1Var = (dl1) childAt;
                    if (c.Q(dl1Var.getMessageObject(), wallettransaction)) {
                        return dl1Var;
                    }
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i2 >= arrayList.size()) {
                    break;
                } else if (c.Q((r47) arrayList.get(i2), wallettransaction)) {
                    this.A0.E0();
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

    public final void M8() {
        r47 r47Var;
        r47 r47Var2;
        t47 t47Var;
        ArrayList arrayList;
        String a0;
        this.y5 = null;
        byte b = this.dc;
        if (b == 2) {
            this.D5 = null;
            this.F5 = null;
            v47 v47Var = this.x5;
            if (v47Var != null) {
                v47Var.f(null, null, this.l6, null);
            }
            D6();
        } else if (b == 3) {
            v47 v47Var2 = this.x5;
            if (v47Var2 != null && !v47Var2.c() && (t47Var = this.x5.b) != null && (arrayList = t47Var.e) != null) {
                int size = arrayList.size();
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    r47 r47Var3 = (r47) this.x5.b.e.get(i);
                    if (j == 0) {
                        j2 = r47.B0(r47Var3.k);
                        j = r47Var3.Z0();
                    } else if (j != r47Var3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                id idVar = alertDialog$Builder.a;
                idVar.J0 = true;
                if (j2 > 0) {
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
                    if (X1 != null) {
                        a0 = ob6.a0("CancelForwardPrivate", null, 2131752564, ob6.G(this.x5.b.e.size(), "MessagesBold", new Object[0]), lv2.m(0, X1.first_name, X1.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j2));
                    if (M0 != null) {
                        a0 = ob6.a0("CancelForwardChat", null, 2131752565, ob6.G(this.x5.b.e.size(), "MessagesBold", new Object[0]), M0.title);
                    } else {
                        return;
                    }
                }
                idVar.U = hl.S2(a0);
                idVar.S = ob6.G(this.x5.b.e.size(), "messages", new Object[0]);
                alertDialog$Builder.j(ob6.M0(2131752563, null), new el1(this, (byte) 2));
                alertDialog$Builder.g(ob6.M0(2131745071, null), new el1(this, (byte) 3));
                showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, getResourceProvider());
                }
            }
        } else if (b == 4) {
            this.Y5 = null;
            v47 v47Var3 = this.x5;
            if (v47Var3 != null) {
                int i2 = this.currentAccount;
                r47 r47Var4 = this.F5;
                if (r47Var4 == this.m4) {
                    r47Var2 = null;
                } else {
                    r47Var2 = r47Var4;
                }
                v47Var3.e(i2, null, null, r47Var2, this.D5, this.H5);
            }
            nr1 nr1Var = this.a0;
            nr1Var.M3 = null;
            nr1Var.N3 = false;
            B6();
            D6();
        } else {
            if (xc2.c0(this.e) && !this.x4 && (r47Var = this.F5) != null) {
                long b2 = r47.b2(this.currentAccount, r47Var.k, true, false);
                if (b2 != 0) {
                    getMediaDataController().F(this.l6, b2, false);
                }
            }
            ac(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public final void M9(fu5 fu5Var) {
        if (this.Bc == null) {
            return;
        }
        fu5Var.u();
        Z9(this.Bc, false, true);
        m01.t(getParentActivity(), Uri.parse(this.Bc.T0), true, false, false, null, null, false, uc7.s1(this.currentAccount).k4.I2.f, false, false);
    }

    public final void Ma(wb2 wb2Var) {
        wg8 wg8Var;
        int i;
        if (this.a0 != null) {
            fm0 fm0Var = this.sd;
            if (!fm0Var.f && wb2Var.getMessageObject() != null) {
                nt1 nt1Var = this.m1;
                RectF rectF = hl.P;
                yic.c(wb2Var, nt1Var, rectF);
                Rect rect = hl.Q;
                cc2 cc2Var = wb2Var.x2;
                if (cc2Var != null && (wg8Var = cc2Var.l) != null && cc2Var.s) {
                    rect.set(wg8Var.getBounds());
                    int measuredHeight = (int) (rectF.bottom - (((this.m1.getMeasuredHeight() - this.A0.getPaddingBottom()) + this.od) - hl.L(2.0f)));
                    r47 messageObject = wb2Var.getMessageObject();
                    if (this.yd == null) {
                        this.yd = new xg8(this, this.resourceProvider, getParentActivity());
                        int indexOfChild = this.m1.indexOfChild(this.A0);
                        nt1 nt1Var2 = this.m1;
                        xg8 xg8Var = this.yd;
                        if (indexOfChild >= 0) {
                            nt1Var2.addView(xg8Var, indexOfChild + 1, tre.g());
                        } else {
                            nt1Var2.addView(xg8Var, tre.g());
                        }
                    }
                    if (messageObject.O3()) {
                        if (wb2Var.A2()) {
                            i = aob.ec;
                        } else {
                            i = aob.jc;
                        }
                        this.T0 = i;
                    } else {
                        if (wb2Var.A2()) {
                            i = aob.fe;
                        } else {
                            i = aob.ee;
                        }
                        this.T0 = i;
                    }
                    this.yd.setColor(getThemedColor(i));
                    this.yd.setCellToWatch(wb2Var);
                    ((fm0) this.yd.b.b).a(false, false);
                    this.yd.setAnimatedVisibility(fm0Var.e);
                    this.yd.b.setOnClickListener(new am7(new gn1(this, (byte) 10), (byte) 20));
                    xg8 xg8Var2 = this.yd;
                    xg8Var2.s = new gn1(this, (byte) 11);
                    qy qyVar = xg8Var2.a;
                    qyVar.setOnKeyListener(new x6(this, (byte) 1));
                    qyVar.setOnEditorActionListener(new j(this, (byte) 5));
                    this.a0.w7 = qyVar;
                    hl.d3(new ze7(this, measuredHeight, qyVar, (byte) 12), 100L);
                    fm0Var.a(true, true);
                }
            }
        }
    }

    public final void Mb(long j) {
        this.s4 = j;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = (int) j;
        new r47(this.currentAccount, tL_message, false, false);
    }

    public final void Mc() {
        TLRPC.User user;
        boolean z;
        if (this.j0 != null && (user = this.f) != null && this.h == null && user.bot) {
            zh6 zh6Var = this.v8;
            boolean z2 = false;
            if (zh6Var.m() != 0) {
                boolean z3 = false;
                z = false;
                for (int i = 0; i < zh6Var.m(); i++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) zh6Var.n(i);
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
            s7 s7Var = this.j0;
            if (z2) {
                s7Var.S(30);
            } else {
                s7Var.u(30);
            }
            s7 s7Var2 = this.j0;
            if (z) {
                s7Var2.S(31);
            } else {
                s7Var2.u(31);
            }
        }
    }

    public final boolean N4() {
        if (this.h == null) {
            rr1 rr1Var = this.d1;
            if (rr1Var == null || rr1Var.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long N5(r47 r47Var) {
        if (this.g4 == 3) {
            return 0L;
        }
        if (xc2.c0(this.e) && !this.x4 && r47Var != null) {
            TLRPC.TL_forumTopic tL_forumTopic = r47Var.j1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.id;
            }
            return r47.b2(this.currentAccount, r47Var.k, xc2.c0(this.e), false);
        }
        return this.s4;
    }

    public final void N6() {
        TLRPC.User X1;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        id idVar;
        if (this.C7) {
            return;
        }
        this.C7 = true;
        ny nyVar = new ny(this, (byte) 20);
        uc7 messagesController = getMessagesController();
        long j = this.l6;
        gn1 gn1Var = new gn1(this, (byte) 7);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(-j));
            if (M0 != null) {
                arrayList = M0.restriction_reason;
            }
            arrayList = null;
        } else {
            if (i >= 0 && (X1 = messagesController.X1(Long.valueOf(j))) != null) {
                arrayList = X1.restriction_reason;
            }
            arrayList = null;
        }
        if (messagesController.I2(arrayList) && !messagesController.K4.contains(Long.valueOf(j))) {
            Context parentActivity = getParentActivity();
            if (parentActivity == null) {
                parentActivity = hl.W(LaunchActivity.H1);
            }
            if (parentActivity == null) {
                parentActivity = LaunchActivity.H1;
            }
            if (parentActivity == null) {
                parentActivity = a.b;
            }
            if (parentActivity == null) {
                idVar = null;
            } else {
                idVar = new id(3, null, parentActivity);
            }
            if (idVar != null) {
                idVar.q(200L);
            }
            messagesController.R0(new ks5(messagesController, idVar, this, gn1Var, j, nyVar));
            return;
        }
        nyVar.run();
    }

    public final void N7(int i) {
        tq3 tq3Var;
        if (Build.VERSION.SDK_INT >= 31 && (tq3Var = this.H) != null) {
            if (vsd.a(i, 4)) {
                fz4 e = this.glassEngine.e();
                float L = hl.L(48.0f);
                float L2 = hl.L(48.0f);
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
                tq3Var.h(e);
            }
            nt1 nt1Var = this.m1;
            tq3Var.e(nt1Var.q0, nt1Var.getWidth(), this.m1.getHeight());
        }
    }

    public final void N8(defpackage.pr1 r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.N8(pr1, boolean[]):void");
    }

    public final boolean N9() {
        r47 r47Var = this.Bc;
        if (r47Var == null) {
            return false;
        }
        if (hl.g(r47Var.T0)) {
            new d31(o11.a(getParentActivity()), this.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public final void Na(jf0 jf0Var, TLRPC.ReactionCount reactionCount, float f, float f2) {
        r47 messageObject;
        boolean z;
        boolean z2;
        TLRPC.Message message;
        w49 d = w49.d(reactionCount.reaction);
        if (jf0Var instanceof wb2) {
            messageObject = ((wb2) jf0Var).getPrimaryMessageObject();
        } else if (jf0Var instanceof dl1) {
            messageObject = ((dl1) jf0Var).getMessageObject();
        } else {
            return;
        }
        r47 r47Var = messageObject;
        wb(jf0Var, r47Var, null, null, f, f2, d, false, false, false, false);
        if (r47Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (r47Var.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            boolean z3 = this.D0.O;
            if (z3) {
                r47 r47Var2 = (r47) this.G6[0].get(r47Var.e1());
                if (r47Var2 != null && (message = r47Var2.k) != null) {
                    message.reactions = r47Var.k.reactions;
                }
            } else if (!z3 && this.F3 != null) {
                Sc(false);
            }
        }
        if (this.D0.O && !r47Var.v2(this.F3)) {
            m47 v7 = v7(r47Var);
            if (v7 != null) {
                ArrayList arrayList = v7.d;
                for (int i = 0; i < arrayList.size(); i++) {
                    getMediaDataController().P1(((r47) arrayList.get(i)).e1());
                }
            } else {
                getMediaDataController().P1(r47Var.e1());
            }
            yc7 yc7Var = this.b4;
            if (yc7Var != null) {
                yc7Var.f();
            }
            Sc(true);
        }
    }

    public final void Nb(View view) {
        View view2 = this.Z8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof dl1)) {
                ((dl1) view2).setInvalidateWithParent(null);
            }
            this.Z8 = view;
            if (view instanceof dl1) {
                ((dl1) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Nc(eq0 eq0Var) {
        String charSequence;
        if (uc7.s1(this.currentAccount).i4.r()) {
            CharSequence text = eq0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            xqe.b(charSequence, new ie(this, eq0Var, text, (byte) 10), new rd1(eq0Var, (byte) 5), false);
            return;
        }
        eq0Var.setClickable(false);
    }

    public final boolean O4(r47 r47Var) {
        if (this.g4 != 8) {
            if (r47Var != null) {
                if (xc2.c0(this.e)) {
                    TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.e.id, r47.b2(this.currentAccount, r47Var.k, true, false));
                    if (this.g4 == 8 || (f != null && (!f.closed || xc2.i(this.currentAccount, this.e, f)))) {
                        return true;
                    }
                    return false;
                } else if (!xc2.p0(this.e) || !xc2.A(this.currentAccount, this.e, 24) || r47.u1(r47Var.k) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean O6() {
        boolean z;
        m47 currentMessagesGroup;
        int childCount = this.A0.getChildCount();
        HashMap hashMap = null;
        int i = 0;
        while (true) {
            z = true;
            if (i >= childCount) {
                break;
            }
            View childAt = this.A0.getChildAt(i);
            if ((childAt instanceof wb2) && (currentMessagesGroup = ((wb2) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.a), currentMessagesGroup);
                    int indexOf = this.M6.indexOf((r47) c00.g(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        it1 it1Var = this.D0;
                        it1Var.l(indexOf + it1Var.K, currentMessagesGroup.d.size());
                        this.A0.setItemAnimator(null);
                    }
                }
            }
            i++;
        }
        if (!hl.O1()) {
            return true;
        }
        if (hl.N1() && a.b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new gd0(false));
            return false;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && !wk5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z = false;
        }
        aVar.setBackButtonDrawable(new gd0(z));
        return false;
    }

    public final void O7() {
        if (!this.aa) {
            this.aa = true;
            nt1 nt1Var = this.m1;
            if (nt1Var != null) {
                nt1Var.invalidate();
            }
            wq1 wq1Var = this.A0;
            if (wq1Var != null) {
                wq1Var.invalidate();
            }
        }
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(u7(h1c.c) + this.U.getInputBubbleHeight() + this.w.d() + hl.L(16.0f));
        }
        H5();
    }

    public final void O8() {
        mg5.h.a();
        showDialog(new yx4(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void O9() {
        if (hl.g(this.Bc.W0)) {
            new d31(o11.a(getParentActivity()), this.resourceProvider).i(ob6.M0(2131743847, null)).j();
        }
    }

    public final void Oa(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Oa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ob(ArrayList arrayList, TLRPC.Chat chat, int i, int i2, int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z;
        boolean z2;
        this.r4 = tL_forumTopic;
        this.p4 = arrayList;
        r47 r47Var = (r47) c00.g(1, arrayList);
        this.m4 = r47Var;
        this.F5 = r47Var;
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
        r47 r47Var2 = this.F5;
        TLRPC.MessageFwdHeader messageFwdHeader = r47Var2.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.v4 = z2;
        if (z) {
            r47Var2.p = true;
        }
        hd();
        zd(false);
        Pc(false);
    }

    public final void Oc() {
        if (this.g2 == null) {
            return;
        }
        float d = this.w.d();
        this.g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + hl.L(9.0f)) - hl.L(5.0f)) + d);
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
                tL_channels_leaveChannel.channel = getMessagesController().h1(j);
                tL_channels_editChannelNews = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews2 = new TLRPC.TL_channels_editChannelNews();
                tL_channels_editChannelNews2.channel = getMessagesController().h1(j);
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
                    final zu1 zu1Var = zu1.this;
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
                        zu1Var.getMessagesController().Y3(updates, false);
                    }
                    final boolean z10 = z3;
                    final TLObject tLObject2 = tL_channels_editChannelNews3;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            zu1.this.p8(z8, tL_error, tLObject, j2, z9, z6, z10, tLObject2);
                        }
                    });
                }
            });
        }
    }

    public final void P5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.P5():void");
    }

    public final void P6(ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, long j) {
        boolean z4;
        if (!arrayList.isEmpty() && r5()) {
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
                it1 it1Var = this.D0;
                if (it1Var != null) {
                    it1Var.F(true);
                }
            }
            int p0 = getSendMessagesHelper().p0(arrayList, this.l6, z, z2, z3, i, 0, this.m4, -1, j, k7(), this.y5);
            jj.q0(p0, this.Ba, this);
            if (p0 != 0) {
                hl.c3(new hm1(this, (byte) 15));
            }
        }
    }

    public final void P7() {
        boolean z;
        Rect rect;
        if (this.m1 != null) {
            if (this.Cb <= 0 && this.Db <= 0) {
                z = false;
            } else {
                z = true;
            }
            rq1 rq1Var = this.w;
            float c = rq1Var.c();
            adc adcVar = rq1Var.b;
            int max = (int) Math.max(0.0f, (c * adcVar.a) - hl.L(29.0f));
            nt1 nt1Var = this.m1;
            nf9 nf9Var = nt1Var.M;
            Rect rect2 = this.zd;
            if (nf9Var != null) {
                rect2.set(0, 0, nt1Var.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                this.m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                rect2.offset(0, -this.A0.getTop());
                wq1 wq1Var = this.A0;
                if (wq1Var.a1()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                wq1Var.setClipBounds(rect);
            }
            if (this.Z != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(rq1Var.w, rq1Var.c() * adcVar.a) - hl.L(29.0f))));
                jz1 jz1Var = this.Z;
                if (z) {
                    rect2 = null;
                }
                jz1Var.setClipBounds(rect2);
            }
        }
    }

    public final void P8() {
        if (this.g4 == 0 && getMessagesController().k4.g3.f() > getConnectionsManager().getCurrentTime() && !i5.a(this.currentAccount, this.f)) {
            i5.c(this.currentAccount, getResourceProvider(), getParentActivity());
        }
    }

    public final void P9() {
        if (hl.g(this.Bc.X0)) {
            new d31(o11.a(getParentActivity()), this.resourceProvider).i(ob6.M0(2131743847, null)).j();
        }
    }

    public final void Pa(int i, String str, CharacterStyle characterStyle, wb2 wb2Var, boolean z) {
        boolean z2;
        rmb rmbVar;
        boolean z3;
        boolean z4 = false;
        try {
            String J0 = hl.J0(str, false);
            if ((this.h == null || getMessagesController().z2 == 1) && getMessagesController().k4.J3.f.contains(J0)) {
                r7a sendMessagesHelper = getSendMessagesHelper();
                if (i != 0 && i != 2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new gg2(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z3), 2);
                return;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!z && !hl.D3(str)) {
            if (i == 0) {
                m01.s(getParentActivity(), Uri.parse(str), true, true, aa(wb2Var, characterStyle));
            } else if (i == 1) {
                Activity parentActivity = getParentActivity();
                Uri parse = Uri.parse(str);
                if (this.x8 == 0) {
                    z4 = true;
                }
                m01.s(parentActivity, parse, z4, true, aa(wb2Var, characterStyle));
            } else if (i == 2) {
                Activity parentActivity2 = getParentActivity();
                Uri parse2 = Uri.parse(str);
                if (this.x8 == 0) {
                    z4 = true;
                }
                m01.s(parentActivity2, parse2, z4, true, aa(wb2Var, characterStyle));
            }
        } else if (i != 0 && i != 2) {
            if (i == 1) {
                jj.o0(this, str, true, true, false, false, aa(wb2Var, characterStyle), null, this.Ba);
            }
        } else {
            if ((characterStyle instanceof h8c) && (rmbVar = ((h8c) characterStyle).a) != null && (rmbVar.a & 1024) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jj.o0(this, str, true, true, true, z2, aa(wb2Var, characterStyle), null, this.Ba);
        }
    }

    public final void Pb(ViewGroup viewGroup) {
        if (this.j0 != null && !this.inPreviewMode && !this.mb && this.Aa == null && (this.fragmentView instanceof FrameLayout)) {
            rz4 rz4Var = this.K;
            if (rz4Var != null) {
                rz4 rz4Var2 = this.J;
                if (rz4Var2 == null) {
                    rz4Var2 = rz4Var;
                }
                pz4 pz4Var = new pz4(rz4Var2, rz4Var);
                ll0 ll0Var = new ll0(pz4Var, pz4Var, pz4Var);
                ll0Var.k = true;
                ll0Var.j = S6();
                ll0Var.h = this.l1;
                ll0Var.i = viewGroup;
                ll0Var.g = this.F;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                aVar.X0 = ll0Var;
                aVar.Y0 = pz4Var;
            }
            this.actionBar.setMenuRise(hl.L(8.0f));
            this.j0.setSubMenuOverlayProvider(new fl1(this, (byte) 0));
        }
    }

    public final void Pc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Pc(boolean):void");
    }

    public final SpannableStringBuilder Q4(boolean z) {
        int i;
        int i2;
        float f;
        if (!z) {
            i = 2131752502;
        } else if (this.e.in_news) {
            i = 2131752497;
        } else {
            i = 2131752499;
        }
        if (!z) {
            i2 = 2131232457;
        } else if (getMessagesController().p2(this.l6, 0L, null)) {
            i2 = 2131232456;
        } else {
            i2 = 2131232460;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!z || !this.e.in_news) {
            spannableStringBuilder.append((CharSequence) "￼ ");
            wm2 wm2Var = new wm2(i2, 2);
            if (z) {
                f = 20.0f;
            } else {
                f = 24.0f;
            }
            wm2Var.c(hl.L(f));
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) ob6.M0(i, null));
        if (z) {
            spannableStringBuilder.append((CharSequence) " ￼");
            wm2 wm2Var2 = new wm2(2131232454, 2);
            wm2Var2.c(hl.L(18.0f));
            spannableStringBuilder.setSpan(wm2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void Q5() {
        if (this.f2 == null && getParentActivity() != null) {
            f6();
            if (this.b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f2 = textView;
                textView.setGravity(17);
                this.f2.setTextSize(1, 14.0f);
                this.f2.setTypeface(hl.o());
                TextView textView2 = this.f2;
                int i = aob.Fi;
                yob.X(textView2, i, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new wm2(2131232493, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) ob6.M0(2131745244, null));
                this.f2.setText(spannableStringBuilder);
                TextView textView3 = this.f2;
                int p1 = aob.p1(0.1f, getThemedColor(i));
                int L = hl.L(3.0f);
                yob.R(textView3, aob.W(hl.L(15.0f), p1, L, L, L, L), null, yob.K(0.1f, i), getResourceProvider());
                this.f2.setOnClickListener(new ll1(this, (byte) 16));
                iye.b(this.f2, 0.04f, 1.5f);
                this.b1.addView(this.f2, tre.r(-1, 36, 83));
                this.b1.i(12, this.f2);
                this.b1.h(this.f2);
            }
        }
    }

    public final l2d Q6(l2d l2dVar) {
        f41 f41Var;
        b2d x1dVar;
        if (l2dVar != null && (f41Var = this.Y1) != null && ((f41Var.isShowing() && !this.Y1.J) || this.Y1.r2)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                x1dVar = new a2d(l2dVar);
            } else if (i >= 30) {
                x1dVar = new z1d(l2dVar);
            } else if (i >= 29) {
                x1dVar = new y1d(l2dVar);
            } else {
                x1dVar = new x1d(l2dVar);
            }
            x1dVar.c(8, mq5.e);
            x1dVar.i(8, false);
            return x1dVar.b();
        }
        return l2dVar;
    }

    public final void Q7() {
        this.Oa = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Q8(Context context, TLRPC.TL_error tL_error) {
        boolean z;
        uc7.s1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.l6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (xc2.T(this.e) && !this.e.megagroup) {
                z = true;
            } else {
                z = false;
            }
            int i = jw5.t1;
            jw5.F0(context, this, d31.b0(this), z);
        }
        Wb(false, true);
    }

    public final void Q9(final defpackage.qe9[] r20, final defpackage.fu5 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Q9(qe9[], fu5):void");
    }

    public final void Qa(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final defpackage.r47 r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final defpackage.r47 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Qa(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, r47, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, r47):void");
    }

    public final void Qb() {
        hl.A3(5.0f, this.A0, null);
        yw0.APP_ERROR.a();
        nr1 nr1Var = this.a0;
        for (int i = 0; i < nr1Var.getChildCount(); i++) {
            hl.A3(5.0f, nr1Var.getChildAt(i), null);
        }
        org.telegram.ui.ActionBar.a actionBar = getActionBar();
        for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
            hl.A3(5.0f, actionBar.getChildAt(i2), null);
        }
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.g4 != 0 || this.s4 != 0 || (chatFull = this.r8) == null || chatFull.ttl_period == 0)) || ((user = this.f) != null && (lbc.z(user) || (this.h == null && ((userFull = this.s8) == null || userFull.ttl_period == 0)))))) {
            q7 q7Var = this.e0;
            if (q7Var != null) {
                q7Var.e(8);
            }
            qq1 qq1Var = this.p1;
            if (qq1Var != null) {
                qq1Var.a.a(false, z);
            }
        } else {
            q7 q7Var2 = this.e0;
            if (q7Var2 != null) {
                q7Var2.e(0);
            }
            qq1 qq1Var2 = this.p1;
            if (qq1Var2 != null) {
                qq1Var2.a.a(true, z);
            }
        }
        q7 q7Var3 = this.v0;
        if (q7Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            q7Var3.e(i2);
        }
        qq1 qq1Var3 = this.p1;
        if (qq1Var3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f) != null && user2.linked_community_id != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            qq1Var3.setCommunityItemVisible(z2);
            final qq1 qq1Var4 = this.p1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ImageView imageView = qq1Var4.F;
            ImageView imageView2 = qq1Var4.E;
            if (imageView2 != null && imageView != null) {
                qq1Var4.n0 = z3;
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
                                    qq1 qq1Var5 = qq1Var4;
                                    if (!z5) {
                                        qq1Var5.E.setVisibility(4);
                                        return;
                                    } else {
                                        qq1Var5.getClass();
                                        return;
                                    }
                                default:
                                    boolean z6 = z3;
                                    qq1 qq1Var6 = qq1Var4;
                                    if (!z6) {
                                        qq1Var6.F.setVisibility(4);
                                        return;
                                    } else {
                                        qq1Var6.getClass();
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
                                    qq1 qq1Var5 = qq1Var4;
                                    if (!z5) {
                                        qq1Var5.E.setVisibility(4);
                                        return;
                                    } else {
                                        qq1Var5.getClass();
                                        return;
                                    }
                                default:
                                    boolean z6 = z3;
                                    qq1 qq1Var6 = qq1Var4;
                                    if (!z6) {
                                        qq1Var6.F.setVisibility(4);
                                        return;
                                    } else {
                                        qq1Var6.getClass();
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
            if (!chatFull2.can_delete_channel && xc2.T(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || xc2.t0(chat4)) {
                    z4 = false;
                }
            }
            q7 q7Var4 = this.u0;
            if (z4) {
                i3 = 0;
            }
            q7Var4.e(i3);
        }
        r();
    }

    public final void R5() {
        if (this.b1 != null && this.k2 == null && getParentActivity() != null) {
            no0 no0Var = new no0(getParentActivity(), this.Ba);
            this.k2 = no0Var;
            this.b1.addView(no0Var, tre.o(-1, -2));
            this.b1.i(10, this.k2);
            this.b1.h(this.k2);
        }
    }

    public final ArrayList R6() {
        it1 it1Var = this.D0;
        if (it1Var != null) {
            return it1Var.Q;
        }
        return null;
    }

    public final void R7() {
        TLRPC.User user;
        boolean z;
        if (a() != getUserConfig().e() && !getUserConfig().p() && (user = this.f) != null && user.contact_require_premium) {
            boolean isEmpty = this.M6.isEmpty();
            if (getMessagesController().P2(a()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (isEmpty != z) {
                getMessagesController().k2(this.classGuid, a());
            }
        }
    }

    public final void R8(Context context) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ll0 ll0Var;
        pz4 pz4Var;
        bl0 k;
        boolean z3;
        wz1 wz1Var;
        boolean z4;
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
                presentFragment(new zu1(bundle));
                return;
            }
            boolean z5 = false;
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
                gl1 gl1Var = new gl1(this, (byte) 0);
                int i6 = nb9.v1;
                int currentAccount = getCurrentAccount();
                Activity parentActivity = getParentActivity();
                long a = a();
                if (parentActivity != null) {
                    nb9.E0(currentAccount, parentActivity, a, false, false, arrayList, d31.b0(this), getResourceProvider(), bArr, str2, gl1Var);
                }
            } else if (this.g4 == 2) {
                finishFragment();
                jt1 jt1Var = this.n9;
                if (this.E0.getTag() == null) {
                    z5 = true;
                }
                jt1Var.F(true, z5);
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
                            getMessagesController().t5(new hl1(this, str3, (byte) 0), this.f.id);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                        String M0 = ob6.M0(2131754058, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.U = M0;
                        alertDialog$Builder.j(ob6.M0(2131747558, null), new el1(this, (byte) 4));
                        idVar.S = ob6.M0(2131689472, null);
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        showDialog(idVar);
                        return;
                    }
                }
                if (lbc.B(user)) {
                    Hc(true);
                    return;
                }
                TLRPC.User user2 = this.f;
                if (user2 != null && user2.bot && (str = this.w8) != null) {
                    if (str.length() != 0) {
                        getMessagesController().M4(this.w8, this.f);
                    } else {
                        getSendMessagesHelper().q0(p7a.b("/start", this.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    }
                    this.w8 = null;
                    Pc(false);
                    return;
                }
                if (xc2.T(this.e)) {
                    TLRPC.Chat chat = this.e;
                    if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                        if (!this.rb) {
                            if (xc2.r0(chat) && (!Z7() || !this.e.in_news)) {
                                if (this.e.join_request) {
                                    Wb(true, true);
                                    uc7 s1 = uc7.s1(this.currentAccount);
                                    long j = this.e.id;
                                    TLRPC.User f = yac.h(this.currentAccount).f();
                                    ny nyVar = new ny(this, (byte) 7);
                                    h01 h01Var = new h01(this, context, (byte) 11);
                                    if (Z7() && this.qb) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    s1.j(j, f, 0, null, null, true, nyVar, h01Var, null, z4);
                                    return;
                                }
                                gn1 gn1Var = this.d6;
                                if (gn1Var != null) {
                                    hl.r(gn1Var);
                                    this.d6 = null;
                                }
                                if (Z7() && this.qb) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Wb(true, true);
                                getMessagesController().j(this.e.id, getUserConfig().f(), 0, null, this, false, new il1(this, z3, (byte) 0), null, null, z3);
                                jn7.e().k(jn7.L4, new Object[0]);
                                l7 l7Var = this.Z1;
                                if (l7Var != null && (wz1Var = this.b1) != null && wz1Var.d(l7Var) && this.c2.getVisibility() != 8 && this.c2.getTag(2131296587) != null) {
                                    uc7.s1(this.currentAccount).W3.edit().putInt("dialog_bar_vis3" + this.l6, 3).commit();
                                    getNotificationCenter().k(jn7.Q0, Long.valueOf(this.l6));
                                    return;
                                }
                                return;
                            } else if (Z7()) {
                                if (Z7() && !this.rb && getParentActivity() != null) {
                                    boolean z6 = this.e.in_news;
                                    boolean p2 = getMessagesController().p2(this.l6, 0L, null);
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(this.l6);
                                    if (dialog != null && dialog.folder_id == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    vz vzVar = this.pb;
                                    if (vzVar == null || !((ula) vzVar.d).d(vzVar)) {
                                        vz vzVar2 = this.pb;
                                        if (vzVar2 == null) {
                                            ula simpleMenuOverlay = getSimpleMenuOverlay();
                                            if (simpleMenuOverlay != null) {
                                                rz4 rz4Var = this.K;
                                                if (rz4Var != null) {
                                                    rz4 rz4Var2 = this.J;
                                                    if (rz4Var2 == null) {
                                                        rz4Var2 = rz4Var;
                                                    }
                                                    pz4 pz4Var2 = new pz4(rz4Var2, rz4Var);
                                                    ll0Var = new ll0(pz4Var2, pz4Var2, pz4Var2);
                                                    ll0Var.k = true;
                                                    ll0Var.j = S6();
                                                    yic yicVar = this.l1;
                                                    zu1 zu1Var = this.Aa;
                                                    if (zu1Var == null) {
                                                        zu1Var = this;
                                                    }
                                                    nt1 nt1Var = zu1Var.m1;
                                                    ll0Var.h = yicVar;
                                                    ll0Var.i = nt1Var;
                                                    ll0Var.g = this.F;
                                                    pz4Var = pz4Var2;
                                                } else {
                                                    ll0Var = this.M;
                                                    pz4Var = null;
                                                }
                                                ll0 ll0Var2 = ll0Var;
                                                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                                                if (aVar != null && aVar.getMenuGlassColorProvider() != null) {
                                                    k = this.actionBar.getMenuGlassColorProvider();
                                                } else {
                                                    k = dtd.k(this.Ba);
                                                }
                                                vz vzVar3 = new vz(this.d1, new xr1(this), simpleMenuOverlay, ll0Var2, pz4Var, k, this.x, this.Ba);
                                                this.pb = vzVar3;
                                                vzVar2 = vzVar3;
                                            } else {
                                                return;
                                            }
                                        }
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) vzVar2.s;
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                                        if (!z6) {
                                            if (p2) {
                                                i3 = 2131232267;
                                                i4 = 2131752311;
                                            } else {
                                                i3 = 2131231512;
                                                i4 = 2131752389;
                                            }
                                            vzVar2.e(i3, ob6.M0(i4, null), false, new il1(this, p2, (byte) 2));
                                        }
                                        if (z6) {
                                            vzVar2.e(2131232026, ob6.M0(2131752504, null), false, new hm1(this, (byte) 5));
                                            vzVar2.e(2131232200, ob6.M0(2131752283, null), true, new hm1(this, (byte) 6));
                                        } else {
                                            if (z2) {
                                                i = 2131232414;
                                                i2 = 2131743570;
                                            } else {
                                                i = 2131232056;
                                                i2 = 2131754165;
                                            }
                                            vzVar2.e(i, ob6.M0(i2, null), false, new il1(this, z2, (byte) 3));
                                            vzVar2.e(2131232095, ob6.M0(2131752284, null), true, new hm1(this, (byte) 7));
                                        }
                                        rr1 rr1Var = (rr1) vzVar2.b;
                                        ula ulaVar = (ula) vzVar2.d;
                                        if (!ulaVar.d(vzVar2) && rr1Var.getContainer().isAttachedToWindow() && rr1Var.getContainer().getWidth() != 0) {
                                            vzVar2.w = null;
                                            ulaVar.setOnClosed(new fv0(vzVar2, (byte) 26));
                                            ulaVar.e(vzVar2, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
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
                    z5 = true;
                }
                jj.r(this, false, chat2, user3, z5, true, false, z, new el1(this, (byte) 5));
            }
        }
    }

    public final void R9() {
        if (this.Bc == null) {
            return;
        }
        qe9[] qe9VarArr = {qe9.Z0(getParentActivity(), this, true, this.resourceProvider, new y0(this, qe9VarArr, (byte) 20))};
    }

    public final void Ra(java.util.ArrayList r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Ra(java.util.ArrayList, boolean):void");
    }

    public final void Rb() {
        r47 r47Var = null;
        for (int i = 1; i >= 0; i--) {
            SparseArray[] sparseArrayArr = this.o6;
            if (r47Var == null && sparseArrayArr[i].size() != 0) {
                r47Var = (r47) this.G6[i].get(sparseArrayArr[i].keyAt(0));
            }
            sparseArrayArr[i].clear();
            this.p6[i].clear();
            this.q6[i].clear();
        }
        if (getParentActivity() != null && r47Var != null && ((r47.Q4(r47Var.k) || r47Var.g4()) && r47Var.F0() != null)) {
            TLRPC.Document F0 = r47Var.F0();
            xb4.G(this.currentAccount);
            File J = xb4.J(F0, null, false, true);
            TLRPC.Message message = r47Var.k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(r47Var.k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!r47.K4(r47Var.k) && !r47Var.g4()) {
                    intent.setType(r47Var.t1());
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
                        cc4.g(e, true);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(J));
                }
                getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, null)), 500);
            }
        }
        C7();
        gd(0, true);
        Gd(false);
        td();
    }

    public final void Rc() {
        int i;
        z11 z11Var;
        as1 as1Var;
        nr1 nr1Var;
        if (this.aa && this.A0 != null) {
            float f = 0.0f;
            if (this.Ma <= 0 || this.bb != 0.0f) {
                float t7 = t7(hl.L(7.0f));
                zr1 zr1Var = this.D1;
                if (zr1Var != null) {
                    i = hl.L(zr1Var.F * 35.0f);
                } else {
                    i = 0;
                }
                float U6 = (U6() * hl.L(43.0f)) + t7 + i;
                float f2 = this.P9;
                this.Q9 = U6;
                this.P9 = u7(h1c.a) + hl.L(4.0f) + this.S9 + U6;
                if (this.actionBar.getVisibility() == 0 || this.Aa != null) {
                    this.P9 += this.actionBar.getMeasuredHeight();
                }
                this.R9 = 0;
                this.P9 = this.P9 + this.Xa + this.T9;
                if (this.bb != 0.0f && (nr1Var = this.a0) != null && nr1Var.getVisibility() == 0) {
                    float f3 = this.P9;
                    float measuredHeight = this.bb * (this.a0.getMeasuredHeight() - hl.L(44.0f));
                    this.P9 = f3 - measuredHeight;
                    f = measuredHeight;
                }
                dl1 dl1Var = this.o3;
                if (dl1Var != null) {
                    dl1Var.setTranslationY(((this.A0.getTranslationY() + this.P9) + this.X9) - hl.L(30.0f));
                    float f4 = this.P9;
                    float f5 = this.X9;
                    this.P9 = f4 + f5;
                    this.R9 = (int) (this.R9 + f5);
                }
                er1 er1Var = this.m3;
                if (er1Var != null) {
                    er1Var.setTranslationY((((this.A0.getTranslationY() - f) + this.P9) + this.V9) - hl.L(4.0f));
                }
                Tc();
                wq1 wq1Var = this.A0;
                if (wq1Var != null && this.C0 != null && this.D0 != null) {
                    int paddingTop = wq1Var.getPaddingTop();
                    int paddingBottom = this.A0.getPaddingBottom();
                    z5();
                    if (this.A0.getPaddingTop() != paddingTop || this.A0.getPaddingBottom() != paddingBottom) {
                        Q7();
                    }
                    this.A0.setTopGlowOffset((int) ((this.P9 - this.R9) - hl.L(4.0f)));
                    if (f2 != this.P9 && this.wb == 0) {
                        int childCount = this.A0.getChildCount();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= childCount) {
                                break;
                            }
                            View childAt = this.A0.getChildAt(i2);
                            this.A0.getClass();
                            if (RecyclerView.S(childAt) == this.D0.b() - 1) {
                                float f6 = this.P9;
                                if (childAt.getTop() > f6) {
                                    this.A0.scrollBy(0, (int) (childAt.getTop() - f6));
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!k8() && !this.R4 && this.wb == 0 && this.b8 != null && this.A0 != null && ((as1Var = this.e2) == null || as1Var.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f2 - this.P9));
                    }
                }
                this.aa = false;
                v21 v21Var = v21.x;
                if (v21Var != null && (z11Var = v21Var.e) != null) {
                    z11Var.updatePosition();
                }
                z5();
            }
        }
    }

    public final void S4() {
        if (this.mb) {
            return;
        }
        if (c8()) {
            hl.U2(getParentActivity(), this.classGuid);
        } else {
            hl.V2(getParentActivity(), this.classGuid);
        }
    }

    public final void S5() {
        if (getParentActivity() != null && getParentActivity() != null && this.Y1 == null) {
            f41 f41Var = new f41(this, getParentActivity(), this, this.Ba, (byte) 1);
            this.Y1 = f41Var;
            f41Var.T1 = a();
            f41 f41Var2 = this.Y1;
            f41Var2.c2 = true;
            f41Var2.W3 = new rs1(this);
        }
    }

    public final vy4 S6() {
        zu1 zu1Var = this.Aa;
        if (zu1Var != null) {
            return zu1Var.S6();
        }
        return this.glassEngine;
    }

    public final boolean S7() {
        if (this.g2 != null && this.s4 == 0) {
            return true;
        }
        return false;
    }

    public final void S8(ArrayList arrayList, long j, mu9 mu9Var, boolean z, int i) {
        if (z) {
            r7a.B(this.currentAccount).p0(arrayList, j, false, false, true, i, 0, null, -1, 0L, 0L, null);
            hl.d3(new xn0(this, j, (byte) 3), 400L);
            mu9Var.dismiss();
        }
    }

    public final void S9(TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j;
        kl8 kl8Var = new kl8(this, this.currentAccount, user, null, null, getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j = tL_emojiStatusCollectible.document_id;
            kl8Var.y2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        de0 de0Var = new de0(getParentActivity());
        ul ulVar = new ul(hl.L(160.0f), 4, de0Var, false);
        de0Var.setImageDrawable(ulVar);
        de0Var.addOnAttachStateChangeListener(new fp1(ulVar, (byte) 0));
        ulVar.j(j, false);
        kl8Var.z2 = true;
        kl8Var.w2 = de0Var;
        showDialog(kl8Var);
    }

    public final void Sa(View view, float f, float f2, boolean z) {
        r47 r47Var;
        int i;
        int i2;
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            r47Var = wb2Var.getMessageObject();
            wb2Var.h1 = f;
            wb2Var.i1 = f2;
            m37 m37Var = wb2Var.fb;
            float f3 = wb2Var.i1;
            m37Var.h = wb2Var.getTranslationX() + f;
            m37Var.i = f3;
            m37Var.l = SystemClock.elapsedRealtime();
        } else if (view instanceof dl1) {
            r47Var = ((dl1) view).getMessageObject();
        } else {
            r47Var = null;
        }
        int Z6 = Z6(r47Var);
        if ((r47Var == null || ((i2 = r47Var.D) != 30 && i2 != 18 && i2 != 25)) && Z6 >= 2 && Z6 != 20 && Z6 != 21) {
            if (r47Var == null || ((i = r47Var.D) != 27 && i != 30 && !r47Var.W4() && !r47Var.q4() && !r47.c3(r47Var.k))) {
                D4(r47Var, z, true);
                Kc();
                Gd(false);
            }
        }
    }

    public final void Sb(int i, r47 r47Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
        String M0 = ob6.M0(2131745148, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        TLRPC.User user = this.f;
        if (user != null) {
            if (user.bot) {
                idVar.U = ob6.M0(2131754062, null);
            } else {
                String k = xnb.k(new StringBuilder("+"), getUserConfig().f().phone, f78.f());
                TLRPC.User user2 = this.f;
                idVar.U = hl.S2(ob6.a0("AreYouSureShareMyContactInfoUser", null, 2131754060, k, lv2.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            idVar.U = ob6.M0(2131754063, null);
        }
        alertDialog$Builder.j(ob6.M0(2131745189, null), new bf(this, i, r47Var, (byte) 3));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
    }

    public final void Sc(boolean z) {
        zh6 zh6Var;
        ArrayList arrayList;
        boolean z2;
        it1 it1Var;
        it1 it1Var2;
        m47 m47Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        r47 r47Var;
        ArrayList arrayList2 = new ArrayList(ls6.d0(this.currentAccount).Z0);
        if (this.Hb == null) {
            this.Hb = new zh6();
        }
        zh6 zh6Var2 = this.Gb;
        if (zh6Var2 == null) {
            this.Gb = new zh6();
        } else {
            zh6Var2.b();
        }
        this.D0.Q.clear();
        this.Hb.b();
        zh6 zh6Var3 = null;
        zh6 zh6Var4 = null;
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            zh6Var = this.P6;
            arrayList = this.M6;
            z2 = true;
            if (i >= size) {
                break;
            }
            r47 r47Var2 = (r47) arrayList2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    r47Var = (r47) arrayList.get(i2);
                    if (r47.B0(r47Var.k) == r47.B0(r47Var2.k) && r47Var.e1() == r47Var2.e1()) {
                        break;
                    }
                    i2++;
                } else {
                    r47Var = null;
                    break;
                }
            }
            if (r47Var2.m1 == 0) {
                if (r47Var == null) {
                    r47Var2.K(true);
                } else {
                    r47Var2.z0 = r47Var.z0;
                    r47Var2.y0 = r47Var.y0;
                }
            }
            if (r47Var != null) {
                r47Var2.n2 = r47Var.n2;
                if (this.D0.O && r47Var2.m1 != 0) {
                    r47Var.N(r47Var2);
                } else {
                    r47Var2.N(r47Var);
                }
            } else if (r47Var2.m1 == 0) {
                int i3 = Cd;
                Cd = i3 + 1;
                r47Var2.m1 = i3;
            }
            r47Var2.W2 = null;
            TLRPC.Message message2 = r47Var2.k;
            if (message2 != null) {
                message2.out = true;
            }
            r47Var2.O3();
            if (r47Var2.z2()) {
                m47 m47Var2 = (m47) zh6Var.f(r47Var2.d1());
                if (m47Var2 == null) {
                    m47Var2 = new m47();
                    m47Var2.n = this.nb;
                    long c1 = r47Var2.c1();
                    m47Var2.a = c1;
                    zh6Var.k(c1, m47Var2);
                } else if (zh6Var3 == null || zh6Var3.h(r47Var2.c1()) < 0) {
                    if (zh6Var4 == null) {
                        zh6Var4 = new zh6();
                    }
                    zh6Var4.k(r47Var2.c1(), m47Var2);
                }
                ArrayList arrayList3 = m47Var2.d;
                if (zh6Var3 == null) {
                    zh6Var3 = new zh6();
                }
                zh6Var3.k(m47Var2.a, m47Var2);
                if (m47Var2.d(r47Var2) == null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList3.size()) {
                            if (((r47) arrayList3.get(i4)).e1() != r47Var2.e1()) {
                                i4++;
                            }
                        } else {
                            arrayList3.add(r47Var2);
                            break;
                        }
                    }
                }
            } else if (r47Var2.d1() != 0) {
                r47Var2.k.grouped_id = 0L;
                r47Var2.e = 0L;
            }
            this.D0.Q.add(r47Var2);
            this.Hb.k(r47Var2.e1(), r47Var2);
            i++;
        }
        if (zh6Var3 != null) {
            for (int i5 = 0; i5 < zh6Var3.m(); i5++) {
                m47 m47Var3 = (m47) zh6Var3.n(i5);
                Collections.sort(m47Var3.d, new ta((byte) 20));
                m47Var3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                r47 r47Var3 = (r47) arrayList.get(i6);
                if (r47Var3 != null && (message = r47Var3.k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= r47Var3.k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(r47Var3.k.reactions.results.get(i7).reaction)) {
                            arrayList4.add(r47Var3);
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < arrayList4.size(); i8++) {
            r47 r47Var4 = (r47) arrayList4.get(i8);
            if (!this.Hb.d(r47Var4.e1())) {
                r47Var4.W2 = null;
                TLRPC.Message message3 = r47Var4.k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(r47Var4);
                this.Hb.k(r47Var4.e1(), r47Var4);
            }
        }
        int i9 = 0;
        while (true) {
            int size2 = this.D0.Q.size();
            it1Var = this.D0;
            if (i9 >= size2) {
                break;
            }
            r47 r47Var5 = (r47) it1Var.Q.get(i9);
            if (r47Var5.z2() && (m47Var = (m47) zh6Var.f(r47Var5.c1())) != null) {
                ArrayList arrayList5 = m47Var.d;
                for (int size3 = arrayList5.size() - 1; size3 >= 0; size3--) {
                    r47 r47Var6 = (r47) arrayList5.get(size3);
                    if (r47Var6 != r47Var5 && !this.Hb.d(r47Var6.e1())) {
                        this.D0.Q.add(i9, r47Var6);
                        this.Hb.k(r47Var6.e1(), r47Var6);
                        i9++;
                    }
                }
            }
            i9++;
        }
        Collections.sort(it1Var.Q, new ta((byte) 21));
        r47 r47Var7 = null;
        int i10 = 0;
        while (true) {
            int size4 = this.D0.Q.size();
            it1Var2 = this.D0;
            if (i10 >= size4) {
                break;
            }
            r47 r47Var8 = (r47) it1Var2.Q.get(i10);
            if (this.nb && r47Var8 != null && i10 == 0) {
                Wa(i10, r47Var8);
                i10++;
            }
            if (!this.nb && r47Var7 != null && r47Var8.X != r47Var7.X) {
                Wa(i10, r47Var7);
                i10++;
            }
            zh6 zh6Var5 = this.Gb;
            int i11 = r47Var8.X;
            ArrayList arrayList6 = (ArrayList) zh6Var5.f(i11);
            if (arrayList6 == null) {
                arrayList6 = qd4.s(this.Gb, i11);
            }
            arrayList6.add(r47Var8);
            if (this.nb && r47Var7 != null && i11 != r47Var7.X) {
                Wa(i10, r47Var8);
                i10++;
            }
            if (!this.nb && i10 >= this.D0.Q.size() - 1) {
                Wa(this.D0.Q.size(), r47Var8);
                i10++;
            }
            i10++;
            r47Var7 = r47Var8;
        }
        it1Var2.P = ls6.d0(this.currentAccount).Y1();
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
                wq1 wq1Var = this.A0;
                wq1Var.M0(wq1Var.x1());
            }
        }
    }

    public final void T4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.T4():void");
    }

    public final void T5(r47 r47Var, m47 m47Var, boolean z) {
        hm1 hm1Var;
        if (r47Var == null) {
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
        int c = (int) c();
        int i = this.g4;
        hm1 hm1Var2 = new hm1(this, (byte) 19);
        if (z) {
            hm1Var = new hm1(this, (byte) 20);
        } else {
            hm1Var = null;
        }
        hm1 hm1Var3 = hm1Var;
        jj.y(this, user, chat, encryptedChat, chatFull, j, r47Var, this.o6, m47Var, c, i, null, hm1Var2, hm1Var3, this.Ba);
    }

    public final m47 T6(long j) {
        return (m47) this.P6.f(j);
    }

    public final void T8(tu0 tu0Var, String str) {
        if (uc7.s1(this.currentAccount).R2(true)) {
            tu0Var.run();
            m01.o(getParentActivity(), str, false, null);
            return;
        }
        jj.l0(getParentActivity(), this.Ba, str, true, new hn1((byte) 0, tu0Var, this, str));
    }

    public final void T9(long j, long j2, Long l, Boolean bool) {
        boolean z = false;
        jxa v = jxa.v(this.currentAccount, false);
        if (l.longValue() > 0 && bool.booleanValue()) {
            z = true;
        }
        v.h0(j, j2, z, true);
    }

    public final void Ta(int i) {
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
                File q0 = hl.q0(null, false);
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
                cc4.g(e, true);
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
                if (xc2.T(this.e) && (tL_chatBannedRights = this.e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z = false;
                } else {
                    z = true;
                }
                w78 w78Var = new w78(0, z, true, this);
                if (this.g4 == 9) {
                    w78Var.H = (byte) 1;
                    w78Var.I = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !xc2.N(chat) && this.e.slowmode_enabled) {
                        w78Var.H = (byte) 10;
                        w78Var.I = true;
                    } else {
                        if (this.H5 == null) {
                            b = 0;
                            z2 = true;
                        }
                        w78Var.H = b;
                        w78Var.I = z2;
                    }
                }
                w78Var.W = new zm9(this, (byte) 17);
                presentFragment(w78Var);
            } else if (i == 2) {
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s0 = hl.s0(false);
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
                    cc4.g(e2, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean Tb() {
        if (V7() && this.F5 == null && this.H5 == null) {
            if (this.g4 != 8 && V7() && this.e != null) {
                TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.e.id, 1L);
                if (this.g4 != 8) {
                    if (f != null) {
                        if (f.closed && !xc2.i(this.currentAccount, this.e, f)) {
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

    public final void Tc() {
        int i;
        dr1 dr1Var = this.n3;
        if (dr1Var == null) {
            return;
        }
        dr1Var.setTranslationX(o7() / 2.0f);
        this.n3.setTranslationY((((this.A0.getTranslationY() + this.P9) + this.W9) - hl.L(4.0f)) + hl.L(28.0f));
        float i2 = Utilities.i(hl.x1(this.W9, -this.n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.n3.setAlpha(this.x3 * i2);
        dr1 dr1Var2 = this.n3;
        if (this.x3 * i2 > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        dr1Var2.setVisibility(i);
        float R1 = hl.R1(0.5f, 1.0f, i2);
        this.n3.setScaleX(R1);
        this.n3.setScaleY(R1);
    }

    public final void U4(int i, View view, boolean z) {
        int i2;
        if (view != null) {
            float f = ((float[]) this.xd.b)[i];
            float f2 = (1.0f - this.sd.e) * (1.0f - this.qd.e) * f;
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
                this.m1.addView(this.f1, 3, tre.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f1.setTranslationX(o7() / 2.0f);
            int i2 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.q2 = textView;
                textView.setText(ob6.M0(2131747941, null));
                this.q2.setTextSize(1, 14.0f);
                this.q2.setGravity(17);
                yob.X(this.q2, aob.Zc, getResourceProvider());
                this.q2.setBackground(new pnb(this.q2, this.m1, hl.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.q2.setTypeface(hl.o());
                this.q2.setPadding(hl.L(10.0f), hl.L(2.0f), hl.L(10.0f), hl.L(3.0f));
                this.f1.addView(this.q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (b8()) {
                d19 d19Var = new d19(getParentActivity(), this.g4, this.s4, this.f4, getResourceProvider());
                this.j1 = d19Var;
                int L = hl.L(24.0f);
                d19 d19Var2 = this.j1;
                nt1 nt1Var = this.m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i3 = aob.a;
                d19Var.setBackground(new pnb(d19Var2, nt1Var, L, themedPaint));
                this.f1.addView(this.j1, tre.e(-2, -2, 17));
                this.l1.d(this.j1, this.m1, new rm0((byte) 23), false);
            } else if (this.g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.e4;
                vnb resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i4 = aob.Zc;
                aob.v0(i4, resourceProvider);
                aob.u0(i4);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231098);
                linearLayout.addView(imageView, tre.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                yob.X(textView2, i4, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(hl.L(208.0f));
                textView2.setText(hl.S2(ob6.M0(2131752683, null)));
                linearLayout.addView(textView2, tre.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                yob.X(textView3, i4, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(hl.L(208.0f));
                String str2 = tL_businessChatLink.link;
                r41[] r41VarArr = r41.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(aob.Z(503316480, 503316480, 5, 5));
                textView3.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
                textView3.setOnClickListener(new t(tL_businessChatLink, this, (byte) 26));
                linearLayout.addView(textView3, tre.t(-2, -2, 49, 17, 0, 17, 17));
                this.k1 = linearLayout;
                linearLayout.setBackground(new pnb(this.k1, this.m1, hl.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f1.addView(this.k1, tre.e(-2, -2, 17));
            } else if ((this.Y9 != null && this.f != null && !this.n) || (this.s8 != null && a() != getUserConfig().e() && ((this.s8.contact_require_premium && !getUserConfig().p()) || this.s8.send_paid_messages_stars > jxa.v(this.currentAccount, false).m().amount))) {
                this.h1 = new up1(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                Vc();
                this.h1.setListener(new el1(this, (byte) 0));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.g1.setGravity(17);
                this.g1.addView(this.h1, tre.e(-2, -2, 17));
                this.f1.addView(this.g1, tre.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.s8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.h1.c(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.h1.setSticker(this.s8.business_intro.sticker);
                }
                Uc();
            } else if (this.h == null) {
                if (this.x4 && this.g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    nt1 nt1Var2 = this.m1;
                    xu1 xu1Var = this.Ba;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = hl.L(18.0f);
                    if (xu1Var != null) {
                        paint = xu1Var.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = aob.T0("paintChatActionBackground");
                    }
                    int i5 = aob.a;
                    linearLayout3.setBackground(new pnb(linearLayout3, nt1Var2, L2, paint));
                    linearLayout3.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
                    linearLayout3.setOrientation(1);
                    de0 de0Var = new de0(parentActivity2);
                    if (aob.g1(xu1Var)) {
                        i = aob.Ja;
                    } else {
                        i = aob.Zc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    ik8.v(textView4, 1, 15.0f);
                    yob.X(textView4, i, xu1Var);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(hl.L(210.0f));
                    textView4.setText(ob6.M0(2131754265, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    yob.X(textView5, i, xu1Var);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(hl.L(160.0f));
                    textView5.setText(ob6.M0(2131743676, null));
                    linearLayout3.addView(de0Var, tre.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, tre.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, tre.r(-2, -2, 1));
                    TLRPC.Document V = ls6.d0(yac.t0).V("🥳");
                    if (V != null) {
                        ggb d = lp3.d(V.thumbs, aob.c7, 0.2f, false);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        de0Var.n(jn5.b(V), null, "tgs", d, null);
                    }
                    this.f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!k8() && this.g4 == 0 && (((user2 = this.f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !xc2.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    nt1 nt1Var3 = this.m1;
                    if (this.e == null) {
                        i2 = 2;
                    }
                    h82 h82Var = new h82(parentActivity3, nt1Var3, i2, this.Ba);
                    this.n1 = h82Var;
                    this.f1.addView(h82Var, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.n1.setStatusText(hl.S2(ob6.M0(2131749192, null)));
                    }
                } else {
                    if (k8() && this.g4 == 0) {
                        str = this.v4 ? ob6.M0(2131747957, null) : ob6.M0(2131747899, null);
                    } else if (this.g4 == 1) {
                        str = ob6.M0(2131747892, null);
                    } else {
                        TLRPC.User user3 = this.f;
                        if (user3 != null) {
                            long j = user3.id;
                            if (j != 777000 && j != 429000 && j != 4244000 && uc7.K2(user3)) {
                                str = ob6.M0(2131749303, null);
                            }
                        }
                        if (this.g4 != 8 && ((user = this.f) == null || user.self || user.deleted || this.n)) {
                            str = ob6.M0(2131747924, null);
                        }
                    }
                    if (str == null) {
                        this.h1 = new vp1(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                        Vc();
                        this.h1.setListener(new el1(this, (byte) 1));
                        TLRPC.UserFull userFull2 = this.s8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.h1.c(tL_businessIntro.title, tL_businessIntro.description);
                            this.h1.setSticker(this.s8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.g1.setGravity(17);
                        this.g1.addView(this.h1, tre.e(-2, -2, 17));
                        this.f1.addView(this.g1, tre.e(-1, -2, 17));
                        Uc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.q2 = textView6;
                    textView6.setText(str);
                    this.q2.setTextSize(1, 14.0f);
                    this.q2.setGravity(17);
                    yob.X(this.q2, aob.Zc, getResourceProvider());
                    this.q2.setBackground(new pnb(this.q2, this.m1, hl.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.q2.setTypeface(hl.o());
                    this.q2.setPadding(hl.L(9.0f), hl.L(2.0f), hl.L(9.0f), hl.L(3.0f));
                    this.f1.addView(this.q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.n1 = new h82(getParentActivity(), this.m1, 0, this.Ba);
                int i6 = (this.h.admin_id > getUserConfig().e() ? 1 : (this.h.admin_id == getUserConfig().e() ? 0 : -1));
                h82 h82Var2 = this.n1;
                TLRPC.User user4 = this.f;
                if (i6 == 0) {
                    h82Var2.setStatusText(ob6.a0(null, null, 2131751098, lbc.k(user4, true)));
                } else {
                    h82Var2.setStatusText(ob6.a0(null, null, 2131751099, lbc.k(user4, true)));
                }
                this.f1.addView(this.n1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final float U6() {
        zu1 zu1Var = this.Aa;
        if (zu1Var != null) {
            this = zu1Var;
        }
        kr1 kr1Var = this.E1;
        if (kr1Var == null) {
            return 0.0f;
        }
        return kr1Var.b;
    }

    public final boolean U7() {
        if (!xea.D0 && !this.Ib) {
            return false;
        }
        return true;
    }

    public final void U8(tu0 tu0Var, String str) {
        if (uc7.s1(this.currentAccount).R2(false)) {
            tu0Var.run();
            getParentActivity();
            m01.p(str);
            return;
        }
        jj.l0(getParentActivity(), this.Ba, str, false, new hn1((byte) 1, tu0Var, this, str));
    }

    public final void U9(long j, long j2, Long l) {
        int i;
        String str;
        if (getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        String M0 = ob6.M0(2131746018, null);
        if (xc2.p0(this.e)) {
            i = 2131746022;
        } else {
            i = 2131746023;
        }
        SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, i, wf3.s(j)));
        if (l.longValue() > 0) {
            str = ob6.H(',', "RemoveMessageFeeRefund", (int) l.longValue());
        } else {
            str = null;
        }
        jj.f0(parentActivity, M0, S2, str, ob6.M0(2131751782, null), new fn1(this, j, j2, l, (byte) 0), this.resourceProvider, true);
    }

    public final void Ua(int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Ua(int):void");
    }

    public final void Ub() {
        if (getParentActivity() == null) {
            return;
        }
        d31.b0(this).t(ob6.M0(2131743488, null), this.Ba).j();
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
                wp1 wp1Var = new wp1(this, getResourceProvider(), getParentActivity());
                this.i1 = wp1Var;
                iye.b(wp1Var, 0.02f, 1.2f);
                this.i1.setOnClickListener(new ll1(this, (byte) 14));
            }
            wp1 wp1Var2 = this.i1;
            if (wp1Var2 != null) {
                if (!z) {
                    wp1Var2.setVisibility(8);
                    return;
                }
                wp1Var2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.s8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.s8.business_intro.title)) {
                    i = 2131749255;
                } else {
                    i = 2131749256;
                }
                String a0 = ob6.a0(null, null, i, lbc.k(this.f, true));
                int indexOf2 = a0.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                if (indexOf2 > 0 && (indexOf = (a0 = a0.substring(0, indexOf2).concat(a0.substring(indexOf2 + 2))).indexOf("**")) > 0) {
                    a0 = a0.substring(0, indexOf).concat(a0.substring(indexOf + 2));
                    spannableStringBuilder = new SpannableStringBuilder(a0);
                    gs8 gs8Var = new gs8(a0.substring(indexOf2, indexOf));
                    if (gs8Var.c != -1) {
                        gs8Var.c = -1;
                        gs8Var.invalidateSelf();
                    }
                    gs8Var.a(503316480);
                    gs8Var.setBounds(0, 0, gs8Var.getIntrinsicWidth(), hl.L(17.33f));
                    spannableStringBuilder.setSpan(new ImageSpan(gs8Var), indexOf2, indexOf, 33);
                }
                this.i1.setCustomText(spannableStringBuilder);
                this.i1.setOverrideTextMaxWidth(kg5.a(a0, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.i1.getParent() != null && (!z || this.i1.getParent() != this.g1)) {
                    ((ViewGroup) this.i1.getParent()).removeView(this.i1);
                }
                if (z) {
                    ViewParent parent = this.i1.getParent();
                    LinearLayout linearLayout = this.g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.i1, tre.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final boolean V4() {
        boolean z;
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hl.t1(getParentActivity().getCurrentFocus());
            l46.o1(this, this.S1, this.T1, this.l6, false);
        }
        return z;
    }

    public final int V6(r47 r47Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        wb2 wb2Var = this.I9;
        if (wb2Var == null) {
            wb2 wb2Var2 = new wb2(getParentActivity(), this.currentAccount, true, this.Za, this.Ba);
            this.I9 = wb2Var2;
            wb2Var = wb2Var2;
        }
        if (this.e == null && !lbc.D(this.f)) {
            z2 = false;
        } else {
            z2 = true;
        }
        wb2Var.f6 = z2;
        wb2 wb2Var3 = this.I9;
        int i = this.g4;
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        wb2Var3.h6 = z3;
        if (i == 3 && this.mb) {
            z4 = true;
        } else {
            z4 = false;
        }
        wb2Var3.i6 = z4;
        TLRPC.User user = this.f;
        if (user != null && user.bot) {
            z5 = true;
        } else {
            z5 = false;
        }
        wb2Var3.j6 = z5;
        if (xc2.T(this.e) && this.e.megagroup) {
            z6 = true;
        }
        wb2Var3.k6 = z6;
        this.I9.W6 = S7();
        this.I9.X6 = f8();
        this.I9.Y6 = e8();
        return this.I9.q0(r47Var, (m47) this.P6.f(r47Var.c1()), z);
    }

    public final boolean V7() {
        if (!xc2.c0(this.e) || this.x4) {
            if (xc2.p0(this.e) && c() == 0 && !this.i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void V8(java.lang.String r9, defpackage.r47 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.V8(java.lang.String, r47, boolean):void");
    }

    public final void V9(long j, long j2) {
        jxa.v(this.currentAccount, false).z(j, j2, new sm1(this, j, j2, (byte) 0));
    }

    public final boolean Va(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.x8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.x8 == this.l6) {
                this.x8 = 0L;
                this.a0.setFieldText(str);
                return true;
            }
            getMediaDataController().T1(this.x8, 0L, str, null, null, null, null, 0L, false, false, null);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                e eVar = (e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((eVar instanceof zu1) && ((zu1) eVar).l6 == this.x8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                boolean B = wf3.B(this.x8);
                long j = this.x8;
                if (B) {
                    bundle.putInt("enc_id", (int) (j & 4294967295L));
                } else {
                    boolean D = wf3.D(j);
                    long j2 = this.x8;
                    if (D) {
                        bundle.putLong("user_id", j2);
                    } else {
                        bundle.putLong("chat_id", -j2);
                    }
                }
                B4();
                presentFragment(new zu1(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Vb(wb2 wb2Var) {
        if (getParentActivity() != null && wb2Var != null && wb2Var.L9 != null && wb2Var.getPrimaryMessageObject() != null && wb2Var.getPrimaryMessageObject().k != null && wb2Var.getPrimaryMessageObject().k.via_business_bot_id != 0 && !getMessagesController().X3.getBoolean("bizbothint", false)) {
            getMessagesController().X3.edit().putBoolean("bizbothint", true).apply();
            if (!this.Fb) {
                this.Fb = true;
                if (this.O1 != null) {
                    return;
                }
                kg5 kg5Var = new kg5(getParentActivity(), 3);
                kg5Var.p(true);
                kg5Var.L = Layout.Alignment.ALIGN_NORMAL;
                kg5Var.d = -1L;
                kg5Var.U = true;
                kg5Var.e = true;
                kg5Var.j(true);
                kg5Var.q(8.0f);
                this.O1 = kg5Var;
                kg5Var.t(hl.S2(ob6.M0(2131748352, null)));
                this.O1.k(this.L);
                kg5 kg5Var2 = this.O1;
                kg5Var2.h = kg5.a(kg5Var2.getText(), this.O1.getTextPaint());
                this.m1.addView(this.O1, tre.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.m1.post(new jj1(this, wb2Var, (byte) 5));
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
        if (xc2.p0(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().u1(this.e.id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !xc2.A(this.currentAccount, chat2, 24)) {
                final long j = this.e.send_paid_messages_stars;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                long j2 = chat.id;
                if (i2 > 0) {
                    a0 = ob6.a0(null, null, 2131744002, wf3.s(-j2), ob6.E(j, ','));
                } else {
                    a0 = ob6.a0(null, null, 2131743985, wf3.s(-j2));
                }
                SpannableStringBuilder Q2 = hl.Q2(nza.U0(a0, 1.0f, null));
                if (i2 > 0) {
                    str = ob6.M0(2131748226, null);
                }
                this.h1.b(true, true, Q2, str, new View.OnClickListener(this) {
                    public final zu1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r4;
                        long j3 = j;
                        zu1 zu1Var = this.b;
                        switch (b) {
                            case 0:
                                zu1Var.J9(j3);
                                return;
                            default:
                                zu1Var.K9(j3);
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
                    y92 y92Var = this.h1;
                    boolean z2 = !getUserConfig().p();
                    if (getMessagesController().M3()) {
                        i = 2131748335;
                    } else {
                        i = 2131748336;
                    }
                    y92Var.b(z2, false, hl.S2(ob6.a0(null, null, i, wf3.s(this.l6))), ob6.M0(2131748292, null), new y00((byte) 2));
                    return;
                }
                final long j3 = userFull.send_paid_messages_stars;
                int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i3 > 0) {
                    y92 y92Var2 = this.h1;
                    if (i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y92Var2.b(z, false, hl.Q2(nza.U0(ob6.a0(null, null, 2131748334, wf3.s(this.l6), ob6.E(this.s8.send_paid_messages_stars, ',')), 1.0f, null)), ob6.M0(2131748226, null), new View.OnClickListener(this) {
                        public final zu1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r4;
                            long j32 = j3;
                            zu1 zu1Var = this.b;
                            switch (b) {
                                case 0:
                                    zu1Var.J9(j32);
                                    return;
                                default:
                                    zu1Var.K9(j32);
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

    public final void W4() {
        wb2 wb2Var;
        ys1 ys1Var;
        int i;
        if (!this.Gc && this.U3 && this.A0.H && getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof wb2) {
                        wb2Var = (wb2) childAt;
                        if (wb2Var.getMessageObject() != null && wb2Var.getMessageObject().k != null && wb2Var.getMessageObject().k.video_processing_pending) {
                            if (wb2Var.getCurrentPosition() != null) {
                                if (wb2Var.getMessageObject() != null && (wb2Var.getCurrentPosition().l & 8) != 0) {
                                    int i2 = wb2Var.getCurrentPosition().l;
                                    if (wb2Var.getMessageObject().O3()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    if ((i2 & i) == 0) {
                                        continue;
                                    }
                                }
                            }
                            wb2Var.getLocationInWindow(iArr);
                            float timeY = wb2Var.getTimeY() + iArr[1];
                            if (timeY >= hl.L(240.0f) && timeY <= (hl.q.y - hl.L(25.0f)) - hl.n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    wb2Var = null;
                    break;
                }
            }
            if (wb2Var != null) {
                this.Gc = true;
                ys1 ys1Var2 = new ys1(this, getParentActivity());
                ys1Var2.p(true);
                ys1Var2.L = Layout.Alignment.ALIGN_CENTER;
                ys1Var2.d = 3500L;
                ys1Var2.U = true;
                ys1Var2.e = true;
                ys1Var2.h = hl.L(150.0f);
                ys1Var2.q(8.0f);
                this.Q1 = ys1Var2;
                ys1Var2.t(ob6.M0(2131743253, null));
                this.Q1.k(this.L);
                this.m1.addView(this.Q1, tre.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                wb2Var.getLocationInWindow(iArr);
                this.R1 = wb2Var.getTimeY() + iArr[1];
                this.Q1.setTranslationY(((-ys1Var.getTop()) - hl.L(120.0f)) + this.R1);
                this.Q1.o(0.0f, (wb2Var.M9 / 2.0f) + (-hl.L(16.0f)) + iArr[0] + wb2Var.O9);
                this.Q1.v();
                return;
            }
            hl.r(new ny(this, (byte) 11));
            hl.d3(new ny(this, (byte) 11), 2000L);
        }
    }

    public final void W5() {
        if (this.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.g4;
        if (i == 3) {
            tL_message.message = ob6.M0(2131745622, null);
        } else if (i == 9) {
            tL_message.message = ob6.M0(2131742524, null);
        } else {
            tL_message.message = ob6.M0(2131752652, null);
        }
        tL_message.id = 0;
        r47 r47Var = new r47(this.currentAccount, tL_message, false, false);
        this.X3 = r47Var;
        r47Var.D = 10;
        r47Var.U = 1;
    }

    public final boolean W7() {
        return lbc.w(this.f);
    }

    public final void W8(String str) {
        o.c(str, this.currentAccount, this.m1, null, this.Ba);
    }

    public final void W9(ArrayList arrayList) {
        l1c l1cVar;
        if (arrayList != null && (l1cVar = this.g2) != null && l1cVar.U) {
            for (int i = 0; i < arrayList.size(); i++) {
                r47 r47Var = (r47) arrayList.get(i);
                if (r47Var != null && r47Var.D == 36) {
                    TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
                    ConcurrentHashMap concurrentHashMap = k0d.a;
                    if (n1 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!r47Var.U2) {
                            r47Var.U2 = true;
                            r47Var.n0(null);
                        }
                    }
                }
                if (r47Var != null && r47Var.P2() && !r47Var.O3() && r47Var.c1() != 0 && !r47Var.U2) {
                    r47Var.U2 = true;
                    r47Var.n0(null);
                }
            }
        }
    }

    public final void Wa(int i, r47 r47Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = ob6.u(r47Var.k.date, false);
        tL_message.id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(r47Var.k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        r47 r47Var2 = new r47(this.currentAccount, tL_message, false, false);
        r47Var2.D = 10;
        r47Var2.U = 1;
        r47Var2.l0 = true;
        r47Var2.m1 = s7(r47Var.X);
        this.D0.Q.add(i, r47Var2);
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
            if (!chat.in_news && xc2.r0(chat)) {
                i3 = aob.Ji;
            } else {
                i3 = aob.Fi;
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
                sr1 sr1Var = this.E0;
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sr1Var, property, 0.1f);
                sr1 sr1Var2 = this.E0;
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(sr1Var2, property2, 0.1f);
                sr1 sr1Var3 = this.E0;
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(sr1Var3, property3, 0.0f), ObjectAnimator.ofFloat(this.J0, property, 1.0f), ObjectAnimator.ofFloat(this.J0, property2, 1.0f), ObjectAnimator.ofFloat(this.J0, property3, 1.0f));
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
            this.W0.addListener(new z7((byte) 14, this, z));
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
        sr1 sr1Var4 = this.E0;
        if (!z && !this.F0) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        sr1Var4.setVisibility(i2);
        p66 p66Var = this.G0;
        if (z || !this.F0) {
            i4 = 4;
        }
        p66Var.setVisibility(i4);
        sr1 sr1Var5 = this.E0;
        if (!z && !this.F0) {
            f3 = 1.0f;
        } else {
            f3 = 0.1f;
        }
        sr1Var5.setScaleX(f3);
        p66 p66Var2 = this.G0;
        if (!z && this.F0) {
            f4 = 1.0f;
        } else {
            f4 = 0.1f;
        }
        p66Var2.setScaleX(f4);
        sr1 sr1Var6 = this.E0;
        if (!z && !this.F0) {
            f5 = 1.0f;
        } else {
            f5 = 0.1f;
        }
        sr1Var6.setScaleY(f5);
        p66 p66Var3 = this.G0;
        if (!z && this.F0) {
            f8 = 1.0f;
        }
        p66Var3.setScaleY(f8);
        sr1 sr1Var7 = this.E0;
        if (!z && !this.F0) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        sr1Var7.setAlpha(f6);
        p66 p66Var4 = this.G0;
        if (!z && this.F0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        p66Var4.setAlpha(f7);
    }

    public final void Wc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Wc(boolean):void");
    }

    public final void X4(boolean z) {
        if (this.f7 == 0) {
            if (z && !this.g7.isEmpty()) {
                this.f7 = System.currentTimeMillis();
            } else {
                this.f7 = 1L;
            }
            h8();
            wq1 wq1Var = this.A0;
            if (wq1Var != null) {
                wq1Var.invalidate();
            }
        }
    }

    public final void X5() {
        if (this.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = ob6.M0(2131742525, null);
        tL_message.id = 0;
        r47 r47Var = new r47(this.currentAccount, tL_message, false, false);
        this.Y3 = r47Var;
        r47Var.D = 10;
        r47Var.U = 1;
    }

    public final c5a X6() {
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
        return new c5a(obj);
    }

    public final boolean X7() {
        if (this.g4 == 1) {
            return true;
        }
        return false;
    }

    public final void X8(String str) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", lv2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void X9() {
        this.R4 = true;
        if (this.E6) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new o30(messagesStorage, c(), this.l6, new cn1(this, (byte) 1), (byte) 11));
            return;
        }
        jf7 messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().j1(this.l6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.x4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.D6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ql(this, messagesStorage2, (byte) 15));
    }

    public final void Xa(Bundle bundle, r47 r47Var) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.e;
        if (chat != null && xc2.V(chat) && !xc2.p0(this.e)) {
            TLRPC.Chat chat2 = this.e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().M0(Long.valueOf(this.e.linked_monoforum_id)) != null && !xc2.z(this.currentAccount, 24, -this.e.linked_monoforum_id)) {
                uc7 messagesController = getMessagesController();
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
        TLRPC.Message message = r47Var.k;
        if (message != null) {
            peer = message.from_id;
        } else {
            peer = null;
        }
        long n = wf3.n(peer);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i != 0 && n != a() && n != getUserConfig().e() && i > 0) {
            bundle.putLong("reply_to_author", n);
        }
    }

    public final void Xb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = ob6.M0(2131752694, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752695, null);
        alertDialog$Builder.j(ob6.M0(2131751371, null), new td(runnable, (byte) 5));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, getResourceProvider());
        }
    }

    public final void Xc() {
        r47 r47Var;
        if (this.f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                wq1 wq1Var = this.A0;
                if (wq1Var != null) {
                    int childCount = wq1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.A0.getChildAt(i);
                        if (childAt instanceof wb2) {
                            r47Var = ((wb2) childAt).getMessageObject();
                        } else {
                            r47Var = null;
                        }
                        if (r47Var != null && r47Var.e1() < 0) {
                            long j = r47Var.k.random_id;
                            if (j != 0) {
                                arrayList.add(Long.valueOf(j));
                            }
                        }
                    }
                }
                MediaController.z();
                return;
            }
            r47 r47Var2 = SecretMediaViewer.d().g0;
            if (r47Var2 != null && !r47Var2.N3()) {
                MediaController.z();
                r47Var2.e1();
            }
        }
    }

    public final void Y4(CharSequence charSequence) {
        boolean z;
        TLRPC.WebPage webPage;
        r47 r47Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        r47 r47Var2 = this.H5;
        if (r47Var2 != null && (message = r47Var2.k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z = true;
        } else {
            z = false;
        }
        if (this.x5 != null && r47Var2 != null) {
            int i = r47Var2.D;
            if ((i == 0 || i == 19) && (webPage = this.Y5) != null) {
                String str = webPage.url;
                if (str != null) {
                    try {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        try {
                            hl.c(valueOf, 1, false, true);
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                            if (v47.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                }
                if (z) {
                    this.Y5 = null;
                    nr1 nr1Var = this.a0;
                    if (nr1Var != null) {
                        nr1Var.M3 = null;
                        nr1Var.N3 = true;
                    }
                    v47 v47Var = this.x5;
                    if (v47Var != null) {
                        int i2 = this.currentAccount;
                        CharSequence fieldText = nr1Var.getFieldText();
                        r47 r47Var3 = this.F5;
                        if (r47Var3 == this.m4) {
                            r47Var = null;
                        } else {
                            r47Var = r47Var3;
                        }
                        v47Var.e(i2, null, fieldText, r47Var, this.D5, this.H5);
                    }
                    B6();
                    D6();
                }
            }
        }
    }

    public final boolean Y5(android.view.View r91, boolean r92, boolean r93, float r94, float r95, boolean r96, boolean r97, boolean r98) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Y5(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public boolean Y7() {
        if (this.m1.getKeyboardHeight() > hl.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Y8(TLRPC.ReactionCount reactionCount) {
        M5(true);
        ow9.c(getParentActivity(), this.currentAccount, reactionCount.reaction, this.Ba);
    }

    public final void Y9(boolean z) {
        TLRPC.Chat chat;
        if (this.Ea == null && (chat = this.e) != null && xc2.k(chat) && this.a0 != null && !xc2.p0(this.e)) {
            TLRPC.TL_channels_sendAsPeers L1 = getMessagesController().L1(this.l6, false);
            this.Ea = L1;
            if (L1 != null) {
                this.a0.J2(false, z);
            }
        }
    }

    public final boolean Ya(View view, RectF rectF) {
        if (rectF != null && this.A0 != null && view != null) {
            RectF rectF2 = this.uc;
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public final void Yb(int i) {
        int i2;
        if (getParentActivity() != null && this.e != null) {
            TextPaint textPaint = new TextPaint(1);
            uh9.p(textPaint, hl.L(15.0f));
            int i3 = 0;
            SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, i, TextUtils.ellipsize(this.e.title, textPaint, hl.L(120.0f), TextUtils.TruncateAt.END)));
            if (i == 2131752433) {
                i3 = 2131623980;
            } else if (i == 2131752240) {
                i3 = 2131623984;
            } else if (i == 2131752388) {
                i3 = 2131624054;
            } else if (i == 2131752310) {
                i3 = 2131624060;
            }
            if (i3 != 0) {
                d31 b0 = d31.b0(this);
                b0.getClass();
                xd8 xd8Var = new xd8(b0.X(), b0.c, null, S2);
                xd8Var.c.f(i3, 24, 24, null);
                v21 b = b0.b(xd8Var, 1780);
                b.l = true;
                z11 z11Var = b.e;
                z11Var.pillStyle = true;
                z11Var.f();
                b.a = 1313167187;
                b.j();
                return;
            }
            if (i == 2131752279) {
                i2 = 2131232459;
            } else if (i == 2131752496) {
                i2 = 2131232450;
            } else {
                i2 = 2131232451;
            }
            Drawable mutate = getParentActivity().getResources().getDrawable(i2).mutate();
            d31 b02 = d31.b0(this);
            b02.getClass();
            v21 b2 = b02.b(new xd8(b02.X(), b02.c, mutate, S2), 1780);
            b2.l = true;
            z11 z11Var2 = b2.e;
            z11Var2.pillStyle = true;
            z11Var2.f();
            b2.a = 1313167187;
            b2.j();
        }
    }

    public final void Yc(r47 r47Var, boolean z) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new ds6(this, r47Var, z, (byte) 10));
    }

    public final void Z4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Z4():void");
    }

    public final int Z6(defpackage.r47 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.Z6(r47):int");
    }

    public final boolean Z7() {
        if (xc2.V(this.e) && !k8() && this.g4 == 0) {
            return true;
        }
        return false;
    }

    public final void Z8(wb2 wb2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i;
        fu5 J = fu5.J(this, wb2Var);
        mu9 mu9Var = new mu9(getParentActivity(), this.Ba);
        J.p = new dm1(mu9Var, (byte) 0);
        if (z && getMessagesController().k4.v0.f) {
            J.b(2131231278, ob6.M0(2131742648, null), new hl1(this, str, (byte) 4), false);
        }
        boolean z2 = true;
        J.b(2131232108, ob6.M0(2131742803, null), new mm1(this, mu9Var, str, (byte) 1), false);
        if (z) {
            J.b(2131232359, ob6.M0(2131742594, null), new hl1(this, str, (byte) 5), false);
            J.j();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i2 = this.currentAccount;
                long j = user.id;
                jj1 jj1Var = new jj1(this, userArr, (byte) 6);
                TLObject b2 = uc7.s1(i2).b2(j);
                boolean z3 = b2 instanceof TLRPC.User;
                if (!(b2 instanceof TLRPC.Chat) || !xc2.V((TLRPC.Chat) b2)) {
                    z2 = false;
                }
                if (z3) {
                    i = 2131743198;
                } else if (z2) {
                    i = 2131743212;
                } else {
                    i = 2131743205;
                }
                J.m(b2, ob6.M0(i, null), jj1Var);
            } else {
                J.o(13, -1, ob6.M0(2131742849, null));
            }
        }
        mu9Var.e(J);
        mu9Var.f(wb2Var, characterStyle, null, false);
        showDialog(mu9Var);
    }

    public final void Z9(r47 r47Var, boolean z, boolean z2) {
        if (r47Var != null && r47Var.q4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = r47Var.R0;
            tL_messages_clickSponsoredMessage.media = z;
            tL_messages_clickSponsoredMessage.fullscreen = z2;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Za() {
        int i;
        this.V4.clear();
        this.X4.clear();
        this.Z4 = 0;
        this.d5 = 0;
        this.e5 = 0;
        gd(0, true);
        ls6 mediaDataController = getMediaDataController();
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

    public final void Zb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            boolean n0 = xc2.n0(chat);
            TLRPC.Chat chat2 = this.e;
            if (n0) {
                if (xc2.N(chat2)) {
                    dc5 dc5Var = new dc5(a());
                    dc5Var.m0 = this;
                    presentFragment(dc5Var);
                    return;
                }
                return;
            } else if (xc2.w(1, chat2)) {
                wh1 wh1Var = new wh1(a());
                wh1Var.m0 = this;
                presentFragment(wh1Var);
                return;
            } else {
                return;
            }
        }
        this.ya = new oe2(this, this.Ba);
        this.A0.setOnInterceptTouchListener(new rm0((byte) 24));
        Ib(this.m1, false);
        showDialog(this.ya, new kl1(this, (byte) 1));
    }

    public final void Zc(r47 r47Var, boolean z) {
        r47 r47Var2;
        if (this.D0 != null && this.fragmentView != null) {
            m47 m47Var = (m47) this.P6.f(r47Var.c1());
            if (m47Var != null) {
                ArrayList arrayList = m47Var.d;
                yq1 yq1Var = this.B0;
                if (yq1Var != null) {
                    yq1Var.U(m47Var);
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ((r47) arrayList.get(i)).M1 = true;
                    if (z) {
                        ((r47) arrayList.get(i)).H = true;
                    }
                }
                this.D0.J(true);
                return;
            }
            r47 r47Var3 = (r47) this.G6[0].get(r47Var.e1());
            if (z) {
                r47Var.M1 = true;
                r47Var.H = true;
            }
            if (this.D0.O) {
                zh6 zh6Var = this.Hb;
                if (zh6Var != null) {
                    r47Var2 = (r47) zh6Var.f(r47Var.e1());
                } else {
                    r47Var2 = null;
                }
                int indexOf = this.D0.Q.indexOf(r47Var2);
                if (r47Var2 != null && z) {
                    r47Var2.M1 = true;
                    r47Var2.H = true;
                }
                if (indexOf >= 0) {
                    it1 it1Var = this.D0;
                    it1Var.g(it1Var.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.M6.indexOf(r47Var3);
            if (indexOf2 >= 0) {
                it1 it1Var2 = this.D0;
                it1Var2.g(it1Var2.K + indexOf2);
            }
        }
    }

    public long a() {
        return this.l6;
    }

    public final void a5(boolean z) {
        TLRPC.ChatFull chatFull;
        String str;
        vc2 vc2Var = this.o8;
        if (vc2Var != null && (((str = this.y8) != null || this.z8) && this.f6)) {
            xkc.l(this.e, str, this.q8, Boolean.valueOf(!vc2Var.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y8 = null;
            this.z8 = false;
            return;
        }
        if (this.y8 != null && z && (chatFull = this.r8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            bs2.v(null, 2131748667, d31.b0(this), 2131624080, 36);
            this.y8 = null;
        }
        this.p8 = !this.f6;
    }

    public final ae8 a6(View view, li1 li1Var) {
        ll0 ll0Var;
        pz4 pz4Var;
        bl0 k;
        ula simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || getParentActivity() == null) {
            return null;
        }
        rz4 rz4Var = this.K;
        if (rz4Var != null) {
            rz4 rz4Var2 = this.J;
            if (rz4Var2 == null) {
                rz4Var2 = rz4Var;
            }
            pz4 pz4Var2 = new pz4(rz4Var2, rz4Var);
            ll0Var = new ll0(pz4Var2, pz4Var2, pz4Var2);
            ll0Var.k = true;
            ll0Var.j = S6();
            yic yicVar = this.l1;
            zu1 zu1Var = this.Aa;
            if (zu1Var == null) {
                zu1Var = this;
            }
            nt1 nt1Var = zu1Var.m1;
            ll0Var.h = yicVar;
            ll0Var.i = nt1Var;
            ll0Var.g = this.F;
            pz4Var = pz4Var2;
        } else {
            ll0Var = this.M;
            pz4Var = null;
        }
        ll0 ll0Var2 = ll0Var;
        if (ll0Var2 == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getMenuGlassColorProvider() != null) {
            k = this.actionBar.getMenuGlassColorProvider();
        } else {
            k = dtd.k(this.Ba);
        }
        return new ae8(getParentActivity(), view, li1Var, simpleMenuOverlay, ll0Var2, pz4Var, k, this.x, this.Ba);
    }

    public final boolean a8() {
        if (this.e != null) {
            return getMessagesController().m2(this.e);
        }
        uc7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.s8;
        messagesController.getClass();
        return uc7.Q2(userFull);
    }

    public final void a9(Object[] objArr, s4b s4bVar, boolean z, TLRPC.StickerSet stickerSet) {
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
                d31 d31Var = new d31(s4bVar.c, this.resourceProvider);
                if (z) {
                    i = 2131744501;
                } else {
                    i = 2131744502;
                }
                v21 q = d31Var.q(document, ob6.a0(null, null, i, stickerSet.title));
                q.j = 2750;
                q.k(true);
            }
        }
    }

    public final cq1 aa(wb2 wb2Var, CharacterStyle characterStyle) {
        l01 l01Var = this.pc;
        if (l01Var != null) {
            l01Var.a(true);
            this.pc = null;
        }
        if (characterStyle != null && wb2Var != null && wb2Var.getMessageObject() != null) {
            cq1 cq1Var = new cq1(this, wb2Var.getMessageObject().e1(), characterStyle, wb2Var, (byte) 0);
            this.pc = cq1Var;
            return cq1Var;
        }
        this.pc = null;
        return null;
    }

    public final void ab(r47 r47Var) {
        if (r47Var == this.Bc) {
            this.Bc = null;
            zd(true);
            return;
        }
        rc7 N1 = getMessagesController().N1(this.l6);
        if (N1 != null) {
            N1.a.remove(r47Var);
        }
    }

    public final void ac(boolean r31, defpackage.r47 r32, defpackage.r47 r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, defpackage.ou1 r38, boolean r39, long r40, defpackage.b77 r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.ac(boolean, r47, r47, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, ou1, boolean, long, b77, boolean):void");
    }

    public final void ad() {
        n8 n8Var;
        int i;
        if (this.h != null) {
            return;
        }
        wq1 wq1Var = this.A0;
        fr1 fr1Var = this.X1;
        if ((fr1Var != null && fr1Var.J) || ((n8Var = this.g9) != null && n8Var.isShowing())) {
            i = 4;
        } else {
            i = 0;
        }
        wq1Var.setImportantForAccessibility(i);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.og));
        hashSet.add(Integer.valueOf(aob.K5));
        hashSet.add(Integer.valueOf(aob.A5));
        hashSet.add(Integer.valueOf(aob.q5));
        hashSet.add(Integer.valueOf(aob.i5));
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.X9));
        hashSet.add(Integer.valueOf(aob.da));
        hashSet.add(Integer.valueOf(aob.oa));
        hashSet.add(Integer.valueOf(aob.ia));
        hashSet.add(Integer.valueOf(aob.na));
        hashSet.add(Integer.valueOf(aob.ma));
        hashSet.add(Integer.valueOf(aob.la));
        hashSet.add(Integer.valueOf(aob.ka));
        hashSet.add(Integer.valueOf(aob.ja));
        hashSet.add(Integer.valueOf(aob.cd));
        hashSet.add(Integer.valueOf(aob.gg));
        hashSet.add(Integer.valueOf(aob.ae));
        hashSet.add(Integer.valueOf(aob.Zd));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.yf));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.uf));
        hashSet.add(Integer.valueOf(aob.wf));
        hashSet.add(Integer.valueOf(aob.vf));
        hashSet.add(Integer.valueOf(aob.Je));
        hashSet.add(Integer.valueOf(aob.kg));
        hashSet.add(Integer.valueOf(aob.Ol));
        hashSet.add(Integer.valueOf(aob.nf));
        hashSet.add(Integer.valueOf(aob.Ve));
        hashSet.add(Integer.valueOf(aob.t7));
        hashSet.add(Integer.valueOf(aob.w7));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.zf));
        hashSet.add(Integer.valueOf(aob.Sf));
        hashSet.add(Integer.valueOf(aob.ag));
        hashSet.add(Integer.valueOf(aob.Se));
        hashSet.add(Integer.valueOf(aob.Tf));
        hashSet.add(Integer.valueOf(aob.Pe));
        hashSet.add(Integer.valueOf(aob.Ne));
        hashSet.add(Integer.valueOf(aob.Le));
        hashSet.add(Integer.valueOf(aob.Ke));
        hashSet.add(Integer.valueOf(aob.v9));
        hashSet.add(Integer.valueOf(aob.u9));
        hashSet.add(Integer.valueOf(aob.q9));
        hashSet.add(Integer.valueOf(aob.p9));
        hashSet.add(Integer.valueOf(aob.o9));
        hashSet.add(Integer.valueOf(aob.k9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.i9));
        hashSet.add(Integer.valueOf(aob.j9));
        hashSet.add(Integer.valueOf(aob.a9));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.U8));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.Ib));
        hashSet.add(Integer.valueOf(aob.od));
        hashSet.add(Integer.valueOf(aob.Ob));
        hashSet.add(Integer.valueOf(aob.Bd));
        hashSet.add(Integer.valueOf(aob.ha));
        hashSet.add(Integer.valueOf(aob.ga));
        hashSet.add(Integer.valueOf(aob.fa));
        hashSet.add(Integer.valueOf(aob.ea));
        hashSet.add(Integer.valueOf(aob.Gc));
        hashSet.add(Integer.valueOf(aob.hf));
        hashSet.add(Integer.valueOf(aob.Ic));
        hashSet.add(Integer.valueOf(aob.Hc));
        hashSet.add(Integer.valueOf(aob.kf));
        hashSet.add(Integer.valueOf(aob.jf));
        hashSet.add(Integer.valueOf(aob.md));
        hashSet.add(Integer.valueOf(aob.af));
        hashSet.add(Integer.valueOf(aob.ld));
        hashSet.add(Integer.valueOf(aob.Ze));
        hashSet.add(Integer.valueOf(aob.Hb));
        hashSet.add(Integer.valueOf(aob.Fc));
        hashSet.add(Integer.valueOf(aob.Gb));
        hashSet.add(Integer.valueOf(aob.Ec));
        hashSet.add(Integer.valueOf(aob.Ld));
        hashSet.add(Integer.valueOf(aob.Rb));
        hashSet.add(Integer.valueOf(aob.Ce));
        hashSet.add(Integer.valueOf(aob.Be));
        hashSet.add(Integer.valueOf(aob.Cc));
        hashSet.add(Integer.valueOf(aob.Ae));
        hashSet.add(Integer.valueOf(aob.Bc));
        hashSet.add(Integer.valueOf(aob.ze));
        hashSet.add(Integer.valueOf(aob.Ac));
        hashSet.add(Integer.valueOf(aob.ye));
        hashSet.add(Integer.valueOf(aob.zc));
        hashSet.add(Integer.valueOf(aob.xe));
        hashSet.add(Integer.valueOf(aob.yc));
        hashSet.add(Integer.valueOf(aob.we));
        hashSet.add(Integer.valueOf(aob.xc));
        hashSet.add(Integer.valueOf(aob.ve));
        hashSet.add(Integer.valueOf(aob.wc));
        hashSet.add(Integer.valueOf(aob.ue));
        hashSet.add(Integer.valueOf(aob.vc));
        hashSet.add(Integer.valueOf(aob.te));
        hashSet.add(Integer.valueOf(aob.uc));
        hashSet.add(Integer.valueOf(aob.se));
        hashSet.add(Integer.valueOf(aob.tc));
        hashSet.add(Integer.valueOf(aob.re));
        hashSet.add(Integer.valueOf(aob.sc));
        hashSet.add(Integer.valueOf(aob.qe));
        hashSet.add(Integer.valueOf(aob.rc));
        hashSet.add(Integer.valueOf(aob.pe));
        hashSet.add(Integer.valueOf(aob.qc));
        hashSet.add(Integer.valueOf(aob.me));
        hashSet.add(Integer.valueOf(aob.oe));
        hashSet.add(Integer.valueOf(aob.ne));
        hashSet.add(Integer.valueOf(aob.le));
        hashSet.add(Integer.valueOf(aob.mc));
        hashSet.add(Integer.valueOf(aob.ke));
        hashSet.add(Integer.valueOf(aob.lc));
        hashSet.add(Integer.valueOf(aob.je));
        hashSet.add(Integer.valueOf(aob.kc));
        hashSet.add(Integer.valueOf(aob.ie));
        hashSet.add(Integer.valueOf(aob.dc));
        hashSet.add(Integer.valueOf(aob.cc));
        hashSet.add(Integer.valueOf(aob.he));
        hashSet.add(Integer.valueOf(aob.ge));
        hashSet.add(Integer.valueOf(aob.ec));
        hashSet.add(Integer.valueOf(aob.gc));
        hashSet.add(Integer.valueOf(aob.fc));
        hashSet.add(Integer.valueOf(aob.de));
        hashSet.add(Integer.valueOf(aob.ce));
        hashSet.add(Integer.valueOf(aob.fe));
        hashSet.add(Integer.valueOf(aob.jc));
        hashSet.add(Integer.valueOf(aob.ee));
        hashSet.add(Integer.valueOf(aob.be));
        hashSet.add(Integer.valueOf(aob.ic));
        hashSet.add(Integer.valueOf(aob.hc));
        hashSet.add(Integer.valueOf(aob.Yd));
        hashSet.add(Integer.valueOf(aob.Xd));
        hashSet.add(Integer.valueOf(aob.Yb));
        hashSet.add(Integer.valueOf(aob.Ud));
        hashSet.add(Integer.valueOf(aob.Xb));
        hashSet.add(Integer.valueOf(aob.Td));
        hashSet.add(Integer.valueOf(aob.Sd));
        hashSet.add(Integer.valueOf(aob.Wb));
        hashSet.add(Integer.valueOf(aob.Rd));
        hashSet.add(Integer.valueOf(aob.Vb));
        hashSet.add(Integer.valueOf(aob.Qd));
        hashSet.add(Integer.valueOf(aob.Ub));
        hashSet.add(Integer.valueOf(aob.Pd));
        hashSet.add(Integer.valueOf(aob.Od));
        hashSet.add(Integer.valueOf(aob.Md));
        hashSet.add(Integer.valueOf(aob.Id));
        hashSet.add(Integer.valueOf(aob.Qb));
        hashSet.add(Integer.valueOf(aob.Hd));
        hashSet.add(Integer.valueOf(aob.Qc));
        hashSet.add(Integer.valueOf(aob.Gd));
        hashSet.add(Integer.valueOf(aob.Pb));
        hashSet.add(Integer.valueOf(aob.Fd));
        hashSet.add(Integer.valueOf(aob.nd));
        hashSet.add(Integer.valueOf(aob.Ed));
        hashSet.add(Integer.valueOf(aob.Dd));
        hashSet.add(Integer.valueOf(aob.Cd));
        hashSet.add(Integer.valueOf(aob.Ad));
        hashSet.add(Integer.valueOf(aob.zd));
        hashSet.add(Integer.valueOf(aob.yd));
        hashSet.add(Integer.valueOf(aob.xd));
        hashSet.add(Integer.valueOf(aob.wd));
        hashSet.add(Integer.valueOf(aob.qa));
        hashSet.add(Integer.valueOf(aob.r7));
        hashSet.add(Integer.valueOf(aob.zb));
        hashSet.add(Integer.valueOf(aob.vd));
        hashSet.add(Integer.valueOf(aob.ud));
        hashSet.add(Integer.valueOf(aob.Mb));
        hashSet.add(Integer.valueOf(aob.td));
        hashSet.add(Integer.valueOf(aob.sd));
        hashSet.add(Integer.valueOf(aob.rd));
        hashSet.add(Integer.valueOf(aob.Lb));
        hashSet.add(Integer.valueOf(aob.Kb));
        hashSet.add(Integer.valueOf(aob.qd));
        hashSet.add(Integer.valueOf(aob.pd));
        hashSet.add(Integer.valueOf(aob.Jb));
        hashSet.add(Integer.valueOf(aob.kd));
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Fb));
        hashSet.add(Integer.valueOf(aob.Eb));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.Yc));
        hashSet.add(Integer.valueOf(aob.Wc));
        hashSet.add(Integer.valueOf(aob.Vc));
        hashSet.add(Integer.valueOf(aob.dd));
        hashSet.add(Integer.valueOf(aob.bd));
        hashSet.add(Integer.valueOf(aob.ad));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.o8));
        hashSet.add(Integer.valueOf(aob.n8));
        hashSet.add(Integer.valueOf(aob.m8));
        hashSet.add(Integer.valueOf(aob.l8));
        hashSet.add(Integer.valueOf(aob.k8));
        hashSet.add(Integer.valueOf(aob.j8));
        hashSet.add(Integer.valueOf(aob.i8));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.gd));
        hashSet.add(Integer.valueOf(aob.fd));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.pa));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.B8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
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
        p7a d = p7a.d(messageMedia, this.l6, this.F5, this.m4, null, null, z, i2);
        d.K = X6();
        d.Q = j;
        d.R = k7();
        d.T = this.y5;
        getSendMessagesHelper().q0(d);
        if (this.g4 == 0) {
            ea(false);
        }
        if (i == 0 || i == 1) {
            E4();
        }
        if (this.I5) {
            this.i6 = true;
        }
    }

    public final void b5() {
        TLRPC.ChatFull N0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        if (this.N1 == null && xc2.n0(this.e) && (N0 = getMessagesController().N0(this.e.id)) != null && this.a0 != null && getParentActivity() != null && (stickerSet = N0.emojiset) != null) {
            rr1 rr1Var = this.d1;
            if (rr1Var == null || rr1Var.getVisibility() != 0) {
                mg5 mg5Var = mg5.n;
                if (mg5Var.c()) {
                    long j = stickerSet.thumb_document_id;
                    if (j == 0 && (a0 = getMediaDataController().a0(stickerSet)) != null && !a0.documents.isEmpty()) {
                        j = a0.documents.get(0).id;
                    }
                    if (j != 0 && getParentActivity() != null) {
                        mg5Var.b();
                        kg5 kg5Var = new kg5(getParentActivity(), 3);
                        this.N1 = kg5Var;
                        kg5Var.j(true);
                        this.N1.p(true);
                        kg5 kg5Var2 = this.N1;
                        kg5Var2.L = Layout.Alignment.ALIGN_CENTER;
                        kg5Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new hm(j, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new y7c(hl.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.t(hl.G2(ob6.M0(2131749196, null), spannableStringBuilder, "%s"));
                        kg5 kg5Var3 = this.N1;
                        kg5Var3.h = kg5.a(kg5Var3.getText(), this.N1.getTextPaint());
                        kg5 kg5Var4 = this.N1;
                        kg5Var4.d = -1L;
                        kg5Var4.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
                        this.N1.k(this.L);
                        hl.d3(new ny(this, (byte) 6), 300L);
                    }
                }
            }
        }
    }

    public final void b6() {
        if (this.h == null && this.M2 == null && getParentActivity() != null) {
            ms1 ms1Var = new ms1(this, getParentActivity());
            this.M2 = ms1Var;
            ms1Var.setTag(1);
            this.b1.addView(this.M2, tre.o(-1, 48));
            this.b1.i(1, this.M2);
            this.b1.h(this.M2);
            this.M2.setOnClickListener(new ll1(this, (byte) 11));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(aob.L0(false));
            he8 he8Var = new he8(getParentActivity(), this.Ba);
            this.O2 = he8Var;
            this.M2.addView(he8Var, tre.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(aob.We));
            this.U2.setTypeface(hl.o());
            this.M2.addView(this.U2, tre.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i = 0; i < 2; i++) {
                yu1 yu1Var = new yu1(this, getParentActivity());
                yu1[] yu1VarArr = this.R2;
                yu1VarArr[i] = yu1Var;
                yu1Var.setTextSize(14);
                yob.W(yu1VarArr[i], aob.We, getResourceProvider());
                yu1VarArr[i].setTypeface(hl.o());
                this.M2.addView(yu1VarArr[i], tre.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                ns1 ns1Var = new ns1((byte) 0, getParentActivity(), this);
                ema[] emaVarArr = this.S2;
                emaVarArr[i] = ns1Var;
                ns1Var.setTextSize(14);
                yob.W(emaVarArr[i], aob.Xe, getResourceProvider());
                this.M2.addView(emaVarArr[i], tre.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                nu1 nu1Var = new nu1(this, getParentActivity());
                nu1[] nu1VarArr = this.T2;
                nu1VarArr[i] = nu1Var;
                this.M2.addView(nu1Var, tre.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                os1 os1Var = new os1(getParentActivity());
                os1Var.J = new npa();
                os1Var.I = new Path();
                os1Var.K = new float[8];
                de0[] de0VarArr = this.Q2;
                de0VarArr[i] = os1Var;
                os1Var.setBlurAllowed(true);
                de0VarArr[i].setRoundRadius(hl.L(2.0f));
                this.M2.addView(de0VarArr[i], tre.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i == 1) {
                    yu1VarArr[i].setVisibility(4);
                    nu1VarArr[i].setVisibility(4);
                    emaVarArr[i].setVisibility(4);
                    de0VarArr[i].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.a3 = imageView;
            imageView.setImageResource(2131232302);
            ImageView imageView2 = this.a3;
            int i2 = aob.Ue;
            vnb resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView2, i2, resourceProvider, mode);
            ImageView imageView3 = this.a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.a3.setContentDescription(ob6.M0(2131754718, null));
            this.a3.setVisibility(4);
            this.a3.setAlpha(0.0f);
            this.a3.setScaleX(0.4f);
            this.a3.setScaleY(0.4f);
            ImageView imageView4 = this.a3;
            int i3 = aob.x7;
            yob.R(imageView4, aob.f0(getThemedColor(i3) & 436207615, 1, -1), null, yob.g(i3, 25), getResourceProvider());
            this.M2.addView(this.a3, tre.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.a3.setOnClickListener(new ll1(this, (byte) 12));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231987);
            yob.s(this.Y2, i2, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(ob6.M0(2131752006, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.Ba);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(hl.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(aob.Ve));
            this.M2.addView(this.Z2, tre.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            yob.R(this.Y2, aob.f0(getThemedColor(i3) & 436207615, 1, hl.L(14.0f)), null, yob.g(i3, 25), getResourceProvider());
            this.M2.addView(this.Y2, tre.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new ll1(this, (byte) 13));
            fd(false);
        }
    }

    public final int b7() {
        wk5 wk5Var = this.parentLayout;
        int i = 0;
        if (wk5Var == null || wk5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i < this.parentLayout.getFragmentStack().size()) {
                e eVar = (e) this.parentLayout.getFragmentStack().get(i);
                if (eVar != this && (eVar instanceof zu1) && ((zu1) eVar).l6 == this.l6) {
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
        wk5 wk5Var = this.parentLayout;
        if (wk5Var == null) {
            return;
        }
        e backgroundFragment = wk5Var.getBackgroundFragment();
        if (backgroundFragment instanceof zu1) {
            zu1 zu1Var = (zu1) backgroundFragment;
            if (zu1Var.a() == this.l6) {
                finishFragment();
                zu1Var.J(i, 0, 0, 0, true, true);
                return;
            }
        }
        presentFragment(ga(i, this.l6));
    }

    public final void ba(r47 r47Var) {
        if (r47Var != null && r47Var.q4() && !r47Var.u0) {
            r47Var.u0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = r47Var.R0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void bb(r47 r47Var) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(r47Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            it1 it1Var = this.D0;
            if (it1Var != null && !it1Var.O) {
                it1Var.s(it1Var.K + indexOf);
            }
        }
    }

    public final void bc(boolean z, r47 r47Var, ArrayList arrayList, TLRPC.WebPage webPage, boolean z2, int i, ou1 ou1Var, boolean z3, long j, boolean z4) {
        ac(z, r47Var, null, arrayList, webPage, z2, i, ou1Var, z3, j, null, z4);
    }

    public final void bd(ArrayList arrayList, boolean z) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.D0.M((r47) arrayList.get(i), false, z);
        }
    }

    @Override
    public final long c() {
        int i;
        if (!this.x4 && (i = this.g4) != 3 && i != 5 && i != 8) {
            return 0L;
        }
        return this.s4;
    }

    public final void c5() {
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
                long d1 = ((r47) arrayList.get(i3)).d1();
                if (j != d1) {
                    if (i2 >= 0 && j != 0 && (i = i3 - i2) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < i; i4++) {
                            arrayList2.add((r47) arrayList.remove(i2));
                        }
                        Collections.sort(arrayList2, new ta((byte) 22));
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
                    arrayList3.add((r47) arrayList.remove(i2));
                }
                arrayList.addAll(i2, arrayList3);
            }
        }
    }

    public final void c6() {
        int i;
        int i2;
        if (this.g3 == null && getParentActivity() != null) {
            qr1 qr1Var = new qr1(this, getParentActivity(), (byte) 1);
            this.g3 = qr1Var;
            qr1Var.setClickable(false);
            this.g3.setWillNotDraw(false);
            this.xd.s(4, false, false);
            this.g3.setClipToPadding(false);
            in inVar = new in(getParentActivity(), true, true, true);
            this.j3 = inVar;
            k43 k43Var = k43.h;
            inVar.b(0.25f, 280L, k43Var);
            this.j3.setTextSize(hl.L(15.0f));
            this.j3.setTypeface(hl.o());
            yob.U(this.j3, aob.qf, getResourceProvider());
            this.j3.setGravity(3);
            this.g3.addView(this.j3, tre.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.g3, tre.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            in inVar2 = new in(getParentActivity(), true, false, true);
            this.k3 = inVar2;
            inVar2.b(0.0f, 420L, k43Var);
            this.k3.setScaleProperty(0.7f);
            this.k3.setTextSize(hl.L(15.0f));
            this.k3.setGravity(5);
            this.k3.setTypeface(hl.o());
            yob.U(this.k3, aob.o6, getResourceProvider());
            in inVar3 = this.k3;
            if (this.ud.f) {
                i = 2131745546;
            } else {
                i = 2131745545;
            }
            inVar3.setText(ob6.M0(i, null));
            in inVar4 = this.k3;
            inVar4.n = false;
            inVar4.setPadding(hl.L(15.33f), 0, hl.L(15.33f), 0);
            this.k3.setOnClickListener(new ll1(this, (byte) 2));
            this.k3.setAlpha(0.5f);
            this.k3.setClickable(false);
            this.g3.addView(this.k3, tre.e(-2, -1, 117));
            in inVar5 = new in(getParentActivity(), true, true, true);
            this.l3 = inVar5;
            inVar5.setGravity(17);
            this.l3.setTypeface(hl.o());
            yob.U(this.l3, aob.sf, getResourceProvider());
            this.l3.setTextSize(hl.L(15.0f));
            in inVar6 = this.l3;
            int i3 = aob.d6;
            int themedColor = getThemedColor(i3);
            int themedColor2 = getThemedColor(i3);
            int i4 = aob.i6;
            yob.R(inVar6, aob.g0(themedColor, aob.v(themedColor2, getThemedColor(i4))), yob.M(i3), yob.p(i3, i4), getResourceProvider());
            in inVar7 = this.l3;
            if (this.D0.O) {
                i2 = 2131745611;
            } else {
                i2 = 2131745594;
            }
            inVar7.setText(ob6.M0(i2, null));
            this.l3.setOnClickListener(new ll1(this, (byte) 3));
            this.l3.setVisibility(8);
            this.l3.setAlpha(0.0f);
            this.g3.addView(this.l3, tre.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!xc2.T(chat) || this.e.megagroup) && this.g4 != 7 && !xc2.p0(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.i3.setImageResource(2131232422);
                yob.s(this.i3, aob.pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.i3;
                int i5 = aob.z8;
                yob.R(imageView2, aob.f0(getThemedColor(i5), 1, -1), null, yob.M(i5), getResourceProvider());
                this.g3.addView(this.i3, tre.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.i3.setOnClickListener(new ll1(this, (byte) 4));
                this.i3.setContentDescription(ob6.M0(2131754775, null));
            }
            if (this.g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.h3.setImageResource(2131232081);
                yob.s(this.h3, aob.pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.h3;
                int i6 = aob.z8;
                yob.R(imageView4, aob.f0(getThemedColor(i6), 1, -1), null, yob.M(i6), getResourceProvider());
                this.g3.addView(this.h3, tre.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.h3.setOnClickListener(new ll1(this, (byte) 5));
                this.h3.setContentDescription(ob6.M0(2131748819, null));
            }
        }
    }

    public final int c7() {
        return Math.max(this.d5, this.e5);
    }

    public final boolean c8() {
        return !TextUtils.isEmpty(this.j4);
    }

    public final void c9(int i) {
        if (this.fragmentView != null) {
            jf0 L6 = L6(i, false);
            if (L6 instanceof wb2) {
                wb2 wb2Var = (wb2) L6;
                x49 x49Var = wb2Var.O;
                TLRPC.MessagePeerReaction K1 = wb2Var.getMessageObject().K1();
                if (K1 != null && (x49Var.H || K1.big)) {
                    s49.d(this, null, L6, null, 0.0f, 0.0f, w49.d(K1.reaction), this.currentAccount, !K1.big ? 1 : 0);
                    s49.f();
                }
                x49Var.H = false;
                r47 r47Var = wb2Var.Q5;
                if (r47Var != null) {
                    r47Var.g5();
                }
            } else if (L6 instanceof dl1) {
                dl1 dl1Var = (dl1) L6;
                x49 x49Var2 = dl1Var.F0;
                TLRPC.MessagePeerReaction K12 = dl1Var.getMessageObject().K1();
                if (K12 != null && (x49Var2.H || K12.big)) {
                    s49.d(this, null, L6, null, 0.0f, 0.0f, w49.d(K12.reaction), this.currentAccount, !K12.big ? 1 : 0);
                    s49.f();
                }
                x49Var2.H = false;
                r47 r47Var2 = dl1Var.Q0;
                if (r47Var2 != null) {
                    r47Var2.g5();
                }
            }
        }
    }

    public final boolean ca() {
        r47 r47Var;
        lm lmVar;
        r47 r47Var2;
        ImageReceiver photoImage;
        lm m;
        boolean z;
        wb2 wb2Var;
        boolean z2;
        if (this.A0 != null && ((r47Var = MediaController.z().v0) == null || r47.K4(r47Var.k))) {
            kg5 kg5Var = this.I2;
            ArrayList arrayList = null;
            if (kg5Var != null && kg5Var.W && (wb2Var = this.Wb) != null) {
                ImageReceiver photoImage2 = wb2Var.getPhotoImage();
                lmVar = photoImage2.m();
                if (lmVar != null) {
                    r47Var2 = wb2Var.getMessageObject();
                    if (photoImage2.x() + wb2Var.getTop() > this.A0.getMeasuredHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.N8 = z2;
                } else {
                    r47Var2 = null;
                }
            } else {
                lmVar = null;
                r47Var2 = null;
            }
            if (r47Var2 == null) {
                int childCount = this.A0.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i);
                    if (childAt instanceof wb2) {
                        wb2 wb2Var2 = (wb2) childAt;
                        r47 messageObject = wb2Var2.getMessageObject();
                        boolean g4 = messageObject.g4();
                        if (!messageObject.f4() && !messageObject.R4() && ((r47.K4(messageObject.k) || g4) && messageObject.r0 == null && (m = (photoImage = wb2Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.M0;
                            float f = photoImage.O0 + top;
                            if (f >= 0.0f && top <= this.A0.getMeasuredHeight()) {
                                if (r47Var2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f <= this.A0.getMeasuredHeight()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.N8 = z;
                                if (top >= 0.0f && f <= this.A0.getMeasuredHeight()) {
                                    r47Var2 = messageObject;
                                    lmVar = m;
                                    break;
                                }
                                r47Var2 = messageObject;
                                lmVar = m;
                            }
                        }
                    }
                    i++;
                }
            }
            if (r47Var2 != null && !MediaController.z().H(r47Var2)) {
                H7(true);
                if (r47Var2.g4()) {
                    boolean V = MediaController.z().V(r47Var2);
                    MediaController z3 = MediaController.z();
                    if (V) {
                        arrayList = j6(r47Var2, false);
                    }
                    z3.u0(arrayList, false);
                    return V;
                }
                xea.C(true);
                r47Var2.b0 = lmVar.n();
                r47Var2.d0 = lmVar.o();
                lmVar.stop();
                if (PhotoViewer.O0(r47Var2)) {
                    PhotoViewer.k9.L();
                }
                return MediaController.z().V(r47Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        n0c n0cVar;
        j19 j19Var;
        rw1 rw1Var;
        if ((this.g4 != 5 || (!this.M6.isEmpty() && this.s4 != 0)) && (((n0cVar = this.n0) == null || (n0cVar.y <= 0.0f && !n0cVar.c0)) && !this.y9 && !this.ud.f && this.K9)) {
            nr1 nr1Var = this.a0;
            if (!nr1Var.u3 && ((!nr1Var.d1 || (rw1Var = nr1Var.f1) == null || rw1Var.getVisibility() != 0) && ((!nr1Var.K0() || !nr1Var.m0.w) && !e.hasSheets(nr1Var.E3) && this.ka == 0.0f && ((j19Var = this.ua) == null || !j19Var.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(r47 r47Var) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(r47Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            it1 it1Var = this.D0;
            if (it1Var != null && !it1Var.O) {
                it1Var.K(it1Var.K + indexOf, true);
            }
        }
    }

    public final void cc(ArrayList arrayList) {
        bc(true, null, arrayList, null, true, 0, null, false, 0L, true);
    }

    public final void cd() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.cd():void");
    }

    @Override
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.createView(android.content.Context):android.view.View");
    }

    public final void d5(boolean z) {
        yc7 yc7Var;
        if (this.d4 == 2 && (yc7Var = this.b4) != null) {
            String str = this.J3;
            z96 z96Var = yc7Var.F;
            if (!TextUtils.equals(yc7Var.y, str)) {
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
                hl.r(z96Var);
                p5b p5bVar = yc7Var.E;
                if (p5bVar != null && p5bVar.I != 0) {
                    ConnectionsManager.getInstance(p5bVar.c).cancelRequest(p5bVar.I, true);
                    p5bVar.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    yc7Var.y = str;
                    yc7Var.E = new p5b(yc7Var.r, str2, trim);
                    if (z) {
                        z96Var.run();
                    } else {
                        hl.d3(z96Var, 1000L);
                    }
                }
                p5b p5bVar2 = yc7Var.E;
                if (p5bVar2 != null && p5bVar2.J > 0) {
                    yc7Var.f();
                }
            }
        }
    }

    public final void d6() {
        if (this.s2 == null && this.I1 == null) {
            tk4 tk4Var = new tk4(getParentActivity(), this.Ba);
            this.r2 = tk4Var;
            tk4Var.setViewType(7);
            z2b z2bVar = new z2b(getParentActivity(), this.r2, 1, null);
            this.s2 = z2bVar;
            z2bVar.setClickable(true);
            this.s2.d.setText(ob6.M0(2131747898, null));
            this.s2.setVisibility(8);
            this.s2.addView(this.r2, 0);
            this.s2.e(true, false);
            this.Z3.addView(this.s2, new FrameLayout.LayoutParams(-1, -1, 17));
            Activity parentActivity = getParentActivity();
            we5 we5Var = new we5(this.currentAccount, this.resourceProvider, parentActivity);
            this.I1 = we5Var;
            we5Var.setOnHashtagClickListener(new gl1(this, (byte) 1));
            this.I1.setOnScrollListener(new y(this, (byte) 15));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            D5();
            B5();
        }
    }

    public final defpackage.fd8 d7(defpackage.r47 r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.d7(r47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):fd8");
    }

    public final boolean d8() {
        int i = this.g4;
        if (((i == 0 && this.s4 == 0) || i == 3) && this.l6 == getUserConfig().e() && !c8()) {
            return true;
        }
        return false;
    }

    public final void d9(long j, boolean z, boolean z2) {
        if (!hl.C1(getParentActivity())) {
            return;
        }
        sjb.c(getParentActivity(), this.currentAccount, -j, getUserConfig().f(), null, z, z2, getResourceProvider());
    }

    public final void da(r47 r47Var) {
        e eVar;
        zu1 zu1Var;
        wk5 wk5Var = this.parentLayout;
        if (wk5Var == null) {
            return;
        }
        long j = r47Var.k.action.channel_id;
        if (wk5Var.getFragmentStack().size() > 0) {
            eVar = (e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            eVar = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        wk5 wk5Var2 = this.parentLayout;
        if (indexOf > 0 && !(eVar instanceof zu1) && !(eVar instanceof ProfileActivity) && this.e.creator) {
            int size = wk5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                e eVar2 = (e) wk5Var2.getFragmentStack().get(indexOf);
                if (eVar2 instanceof zu1) {
                    ((ActionBarLayout) wk5Var2).b(indexOf, new zu1(qu6.k(j, "chat_id")));
                    eVar2.removeSelfFromStack();
                } else if (eVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) wk5Var2).b(indexOf, new ProfileActivity(qu6.k(j, "chat_id"), null));
                    eVar2.removeSelfFromStack();
                } else if (eVar2 instanceof g92) {
                    ((ActionBarLayout) wk5Var2).b(indexOf, new g92(qu6.k(j, "chat_id")));
                    eVar2.removeSelfFromStack();
                } else if (eVar2 instanceof bg2) {
                    if (((bg2) eVar2).e1 == 0) {
                        Bundle arguments = eVar2.getArguments();
                        arguments.putLong("chat_id", j);
                        ((ActionBarLayout) wk5Var2).b(indexOf, new bg2(arguments));
                    }
                    eVar2.removeSelfFromStack();
                }
                indexOf++;
            }
            zu1Var = this;
        } else {
            zu1Var = this;
            hl.c3(new o97(zu1Var, eVar, r47Var, wk5Var2, (byte) 27));
        }
        hl.d3(new xn0(zu1Var, j, (byte) 1), 1000L);
    }

    public final void db() {
        if (this.h8 == null && this.i8 == null && this.j8 == null) {
            ny nyVar = this.m8;
            if (nyVar != null) {
                hl.r(nyVar);
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

    public final void dc(r47 r47Var) {
        bc(true, r47Var, null, null, true, 0, null, false, 0L, true);
    }

    public final void dd() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.y1 == null) {
            return;
        }
        boolean z4 = false;
        if (this.D9 && !B7() && !this.a0.X0() && !this.mb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
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
        nr1 nr1Var = this.a0;
        if (nr1Var != null && nr1Var.a()) {
            z3 = true;
        } else {
            z3 = false;
        }
        vz1 vz1Var = this.y1;
        if (z && !z3) {
            z4 = true;
        }
        vz1Var.e(1, z4, z2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, final Object... objArr) {
        long j;
        r47 r47Var;
        TLRPC.MessageReplies messageReplies;
        r47 r47Var2;
        wk5 wk5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull Y1;
        TLRPC.User X1;
        boolean z;
        TLRPC.User X12;
        qq1 qq1Var;
        nr1 nr1Var;
        TLRPC.Chat chat;
        xt3 editField;
        boolean z2;
        boolean z3;
        s4b s4bVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i3;
        nr1 nr1Var2;
        zu1 zu1Var = this;
        if (i == jn7.C) {
            zu1Var.u6(objArr);
            return;
        }
        if (i == jn7.m4) {
            wq1 wq1Var = zu1Var.A0;
            if (wq1Var != null) {
                wq1Var.i1();
            }
            m12 m12Var = zu1Var.ja;
            if (m12Var != null) {
                m12Var.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z4 = false;
            r2 = false;
            boolean z5 = false;
            int i4 = 0;
            if (i == jn7.H) {
                if (((Integer) objArr[0]).intValue() == zu1Var.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        zu1Var.finishFragment();
                        i5.b(zu1Var.currentAccount);
                    }
                }
            } else if (i == jn7.u3) {
                if (objArr.length > 0) {
                    z2 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z2 = false;
                }
                f41 f41Var = zu1Var.Y1;
                if (f41Var != null && f41Var.isShowing()) {
                    zu1Var.Y1.a(true);
                }
                if (z2 && (nr1Var2 = zu1Var.a0) != null && nr1Var2.U0()) {
                    zu1Var.a0.N0(true);
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
                        Dialog dialog = zu1Var.visibleDialog;
                        if ((dialog instanceof s4b) && (tL_messages_stickerSet = (s4bVar = (s4b) dialog).M1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.id == stickerSet2.id) {
                            s4bVar.M1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (s4bVar.n1 != null) {
                                s4bVar.W0();
                                s4bVar.U0();
                                s4bVar.n1.f();
                            }
                            s4bVar.T0();
                            ls6.d0(s4bVar.a).r1(s4bVar.M1);
                            s4bVar.E0();
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
                                    d31 d31Var = new d31(s4bVar.c, zu1Var.resourceProvider);
                                    if (z3) {
                                        i3 = 2131744501;
                                    } else {
                                        i3 = 2131744502;
                                    }
                                    v21 q = d31Var.q(document, ob6.a0(null, null, i3, stickerSet2.title));
                                    q.j = 2750;
                                    q.k(true);
                                }
                            }
                        } else {
                            final s4b s4bVar2 = new s4b(zu1Var.getParentActivity(), zu1Var, tL_inputStickerSetID, null, zu1Var.a0, zu1Var.Ba);
                            final boolean z6 = z3;
                            zu1Var = this;
                            s4bVar2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    zu1.this.a9(objArr, s4bVar2, z6, stickerSet2);
                                }
                            });
                            zu1Var.showDialog(s4bVar2);
                        }
                    }
                }
            } else if (i == jn7.l4) {
                wq1 wq1Var2 = zu1Var.A0;
                if (wq1Var2 != null) {
                    wq1Var2.i1();
                }
                TextView textView = zu1Var.f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i5 = 0; i5 < 2; i5++) {
                    ema emaVar = zu1Var.S2[i5];
                    if (emaVar != null) {
                        emaVar.invalidate();
                    }
                }
                fr1 fr1Var = zu1Var.X1;
                if (fr1Var != null) {
                    fr1Var.getListView().i1();
                }
                gu guVar = zu1Var.a4;
                if (guVar != null) {
                    guVar.i1();
                }
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                nr1 nr1Var3 = zu1Var.a0;
                if (nr1Var3 != null && (editField = nr1Var3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                nu1[] nu1VarArr = zu1Var.T2;
                nu1 nu1Var = nu1VarArr[0];
                if (nu1Var != null) {
                    nu1Var.invalidate();
                }
                nu1 nu1Var2 = nu1VarArr[1];
                if (nu1Var2 != null) {
                    nu1Var2.invalidate();
                }
            } else if (i == jn7.T1) {
                ConnectionsManager.getInstance(i2).getConnectionState();
            } else if (i == jn7.g1) {
                Long l = (Long) objArr[0];
                if (zu1Var.r8 != null && (chat = zu1Var.e) != null && chat.id == l.longValue()) {
                    zu1Var.r8.online_count = ((Integer) objArr[1]).intValue();
                    qq1 qq1Var2 = zu1Var.p1;
                    if (qq1Var2 != null) {
                        qq1Var2.m();
                        zu1Var.p1.n(false);
                    }
                }
            } else if (i == jn7.F) {
                if (((Long) objArr[0]).longValue() == zu1Var.l6 && (nr1Var = zu1Var.a0) != null) {
                    nr1Var.J2(false, true);
                }
            } else if (i == jn7.k3) {
                nr1 nr1Var4 = zu1Var.a0;
                if (nr1Var4 != null) {
                    nr1Var4.K2();
                }
            } else if (i == 2) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i6 = uc7.r5;
                int i7 = intValue & 1;
                if (i7 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (zu1Var.e != null) {
                        TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(zu1Var.e.id));
                        if (M0 != null) {
                            zu1Var.e = M0;
                        }
                    } else if (zu1Var.f != null && (X1 = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.f.id))) != null) {
                        zu1Var.f = X1;
                    }
                    zu1Var.wd(true);
                }
                if (!zu1Var.k8() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (zu1Var.e != null && (qq1Var = zu1Var.p1) != null) {
                        qq1Var.m();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i7 != 0) {
                    zu1Var.r();
                    zu1Var.Gd(false);
                }
                if ((intValue & 64) != 0) {
                    z = true;
                }
                if ((intValue & 8192) != 0 && zu1Var.e != null) {
                    zu1Var.a8();
                    TLRPC.Chat M02 = zu1Var.getMessagesController().M0(Long.valueOf(zu1Var.e.id));
                    if (M02 != null) {
                        zu1Var.e = M02;
                        zu1Var.a8();
                        z = !zu1Var.k8();
                        zu1Var.Pc(false);
                        nr1 nr1Var5 = zu1Var.a0;
                        if (nr1Var5 != null) {
                            nr1Var5.M1(zu1Var.currentAccount, zu1Var.l6);
                        }
                        c34 c34Var = zu1Var.T3;
                        if (c34Var != null) {
                            c34Var.i();
                        }
                    }
                }
                TLRPC.User user = zu1Var.f;
                if (user != null && lbc.w(user) && (X12 = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.f.id))) != null) {
                    zu1Var.f = X12;
                }
                if (zu1Var.g2 != null) {
                    boolean I4 = zu1Var.I4();
                    l1c l1cVar = zu1Var.g2;
                    if (l1cVar.c != I4) {
                        l1cVar.setTabsEnabled(I4);
                        if (zu1Var.n0 != null && !zu1Var.l8()) {
                            zu1Var.n0.d();
                        }
                        zu1Var.Dd();
                    }
                }
                qq1 qq1Var3 = zu1Var.p1;
                if (qq1Var3 != null && z) {
                    qq1Var3.n(true);
                }
                if ((intValue & 130) != 0) {
                    zu1Var.zd(true);
                }
                s7 s7Var = zu1Var.j0;
                if (s7Var != null) {
                    if (xc2.T(zu1Var.e) && !xc2.p0(zu1Var.e)) {
                        long j2 = zu1Var.e.linked_monoforum_id;
                        if (j2 != 0 && xc2.z(zu1Var.currentAccount, 24, -j2)) {
                            z4 = true;
                        }
                    }
                    s7Var.Q(70, z4);
                }
            } else if (i == 1) {
                cc4.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!zu1Var.mb) {
                    if (longValue == zu1Var.l6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i8 = zu1Var.g4;
                        if (intValue2 != i8 && i8 != 3 && i8 != 8) {
                            if (i8 != 1 && intValue2 == 1 && !zu1Var.isPaused && LaunchActivity.S() == zu1Var && zu1Var.x5 == null && !arrayList.isEmpty() && ((r47) arrayList.get(0)).e1() < 0) {
                                int e1 = ((r47) arrayList.get(0)).e1();
                                if (((r47) arrayList.get(0)).k != null && ((r47) arrayList.get(0)).k.video_processing_pending) {
                                    z5 = true;
                                }
                                zu1Var.Aa(e1, z5);
                            }
                            cc4.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !zu1Var.md && zu1Var.f != null && zu1Var.a() != zu1Var.getUserConfig().e() && (Y1 = zu1Var.getMessagesController().Y1(zu1Var.f.id)) != null && Y1.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    r47 r47Var3 = (r47) arrayList.get(i4);
                                    if (r47Var3.e1() > 0 && !r47Var3.N3() && !r47Var3.q4()) {
                                        zu1Var.md = true;
                                        zu1Var.getMessagesController().f3(zu1Var.f, zu1Var.classGuid, true, null);
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            zu1Var.Ra(arrayList, true);
                        }
                    } else if (xc2.T(zu1Var.e) && !zu1Var.e.megagroup && (chatFull = zu1Var.r8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            r47 r47Var4 = (r47) arrayList.get(i9);
                            if (r47Var4.d4()) {
                                zu1Var.N6.put(r47Var4.e1(), r47Var4);
                            }
                        }
                        zu1Var.I5();
                    }
                    cc4.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i == jn7.E) {
                zu1Var.Y9(true);
            } else if (i == jn7.D) {
                zu1Var.z4();
            } else if (i == jn7.s) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == zu1Var.l6) {
                        zu1Var.finishFragment();
                    }
                } else if (hl.O1() && (wk5Var = zu1Var.parentLayout) != null && wk5Var.getFragmentStack().size() > 1) {
                    zu1Var.finishFragment();
                } else {
                    zu1Var.removeSelfFromStack(true);
                }
            } else if (i == jn7.t) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == zu1Var.a() && (booleanValue2 || zu1Var.parentLayout.getLastFragment() != zu1Var)) {
                    if (zu1Var.parentLayout.getLastFragment() == zu1Var) {
                        zu1Var.finishFragment();
                    } else {
                        zu1Var.removeSelfFromStack(true);
                    }
                }
            } else {
                int i10 = jn7.A;
                SparseArray[] sparseArrayArr = zu1Var.G6;
                if (i == i10) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = zu1Var.e;
                    if (chat2 != null && chat2.id == longValue3 && (r47Var2 = (r47) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && r47Var2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (zu1Var.I5) {
                            tl1 tl1Var = zu1Var.D4;
                            if (tl1Var != null) {
                                hl.r(tl1Var);
                                zu1Var.D4 = null;
                            }
                            r47Var2.k.replies.read_max_id = intValue3;
                        } else {
                            tl1 tl1Var2 = new tl1(zu1Var, r47Var2, intValue3);
                            zu1Var.D4 = tl1Var2;
                            hl.d3(tl1Var2, 500L);
                        }
                    }
                } else if (i == jn7.B) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = zu1Var.e;
                    if (chat3 != null && chat3.id == longValue4 && (r47Var = (r47) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = r47Var.k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer y1 = zu1Var.getMessagesController().y1(xc2.M(zu1Var.e, zu1Var.getMessagesController().N0(zu1Var.e.id), false));
                            int size3 = r47Var.k.replies.recent_repliers.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                } else if (r47.B1(r47Var.k.replies.recent_repliers.get(i11)) == r47.B1(y1)) {
                                    r47Var.k.replies.recent_repliers.remove(i11);
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            r47Var.k.replies.recent_repliers.add(0, y1);
                        }
                        TLRPC.MessageReplies messageReplies2 = r47Var.k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i12 = jn7.z;
                    int i13 = jn7.y;
                    if ((i == i13 || i == i12) && zu1Var.l6 == ((Long) objArr[0]).longValue()) {
                        if (i == i13) {
                            j = ((Integer) objArr[1]).intValue();
                        } else if (i == i12) {
                            j = ((Long) objArr[1]).longValue();
                        } else {
                            j = 0;
                        }
                        long j3 = zu1Var.s4;
                        if (j == j3 || j3 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i14 = zu1Var.A4;
                            ArrayList arrayList2 = zu1Var.M6;
                            if (intValue4 > i14) {
                                zu1Var.A4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i15 = 0; i15 < size4; i15++) {
                                    r47 r47Var5 = (r47) arrayList2.get(i15);
                                    int e12 = r47Var5.e1();
                                    if (!r47Var5.N3() && e12 > 0 && e12 <= zu1Var.A4) {
                                        if (!r47Var5.E4()) {
                                            break;
                                        }
                                        r47Var5.H5();
                                        it1 it1Var = zu1Var.D0;
                                        if (it1Var != null) {
                                            it1Var.H(r47Var5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > zu1Var.B4) {
                                zu1Var.B4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i16 = 0; i16 < size5; i16++) {
                                    r47 r47Var6 = (r47) arrayList2.get(i16);
                                    int e13 = r47Var6.e1();
                                    if (r47Var6.N3() && e13 > 0 && e13 <= zu1Var.B4) {
                                        if (!r47Var6.E4()) {
                                            break;
                                        }
                                        r47Var6.H5();
                                        it1 it1Var2 = zu1Var.D0;
                                        if (it1Var2 != null) {
                                            it1Var2.M(r47Var6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        zu1Var.p6(i, objArr);
        zu1Var.q6(i, objArr);
        zu1Var.r6(i, objArr);
        zu1Var.s6(i, objArr);
        zu1Var.t6(i, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        f41 f41Var = this.Y1;
        if (f41Var != null && this.visibleDialog == f41Var) {
            f41Var.d2.a0(false);
            this.Y1.H();
            this.Y1.d2.e0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.ya && !(dialog instanceof xw0) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat e() {
        return this.e;
    }

    public final void e5() {
        this.U.d();
        ed();
        Oc();
        y5();
        v5();
        A5();
        z5();
        D5();
        P7();
        boolean z = true;
        if (this.w.s == 1) {
            z = false;
        }
        if (this.Eb != z) {
            this.Eb = z;
            checkSystemBarColors();
        }
    }

    public final TextureView e6(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        hl.r(this.O8);
        if (this.J8 == null) {
            qr1 qr1Var = new qr1(this, getParentActivity(), (byte) 2);
            this.J8 = qr1Var;
            qr1Var.setOutlineProvider(new dl0(this, (byte) 3));
            this.J8.setClipToOutline(true);
            this.J8.setWillNotDraw(false);
            jx jxVar = new jx(getParentActivity());
            this.L8 = jxVar;
            jxVar.setBackgroundColor(0);
            if (z) {
                this.J8.addView(this.L8, tre.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.M8 = textureView;
            textureView.setOpaque(false);
            this.L8.addView(this.M8, tre.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.J8.getParent();
        if (viewGroup != null && viewGroup != this.m1) {
            viewGroup.removeView(this.J8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.m1.addView(this.J8, 1, new FrameLayout.LayoutParams(hl.b3(f8(), U7()), hl.b3(f8(), U7())));
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
        l1c l1cVar = this.g2;
        if (l1cVar != null && l1cVar.U && l1cVar.a.f) {
            return true;
        }
        return false;
    }

    public final void e9() {
        U5(false);
        boolean z = this.fragmentBeginToShow;
        wq1 wq1Var = this.A0;
        if (!z) {
            wq1Var.X1 = false;
            wq1Var.Y1 = false;
            wq1Var.setEmptyView(this.f1);
            wq1 wq1Var2 = this.A0;
            wq1Var2.X1 = true;
            wq1Var2.Y1 = true;
            return;
        }
        wq1Var.setEmptyView(this.f1);
    }

    public final void ea(boolean z) {
        int i;
        if (this.A0 != null) {
            ArrayList arrayList = this.M6;
            if (!arrayList.isEmpty() && !this.Ta.n) {
                if (z) {
                    i = 0;
                    while (i < arrayList.size() && ((r47) arrayList.get(i)).q4()) {
                        i++;
                    }
                } else {
                    i = 0;
                }
                this.C0.g1(i, 0);
                this.A0.E0();
            }
        }
    }

    public final void eb(boolean z) {
        r47 r47Var = this.b8;
        if (r47Var != null) {
            if (z) {
                boolean[] zArr = this.W6;
                zArr[1] = true;
                zArr[0] = true;
                this.Z7 = 0;
                this.c7 = 0;
            }
            this.V7 = 0;
            this.W7 = false;
            bb(r47Var);
            this.b8 = null;
        }
    }

    public final void ec(r47 r47Var, ou1 ou1Var) {
        bc(true, r47Var, null, null, true, 0, ou1Var, false, 0L, true);
    }

    public final void ed() {
        vz1 vz1Var = this.y1;
        rq1 rq1Var = this.w;
        if (vz1Var != null) {
            this.y1.setTranslationY((((-rq1Var.d()) - this.U.getInputBubbleHeight()) - u7(h1c.c)) - hl.L(13.0f));
        }
        if (this.s1 != null) {
            this.s1.setTranslationY((-rq1Var.d()) - hl.L(16.0f));
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.extendActionMode(android.view.Menu):boolean");
    }

    public final void f5() {
        TLRPC.Chat M0;
        long j = getArguments().getInt("search_from_user_id", 0);
        if (j != 0) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
            if (X1 != null) {
                Ca("");
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                vb(null, X1);
                return;
            }
            return;
        }
        long j2 = getArguments().getInt("search_from_chat_id", 0);
        if (j2 != 0 && (M0 = getMessagesController().M0(Long.valueOf(j2))) != null) {
            Ca("");
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            vb(M0, null);
        }
    }

    public final void f6() {
        if (this.m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new l7((byte) 1, getParentActivity(), this);
            O7();
            TextView textView = new TextView(getParentActivity());
            this.Pc = textView;
            int i = aob.Xe;
            yob.X(textView, i, getResourceProvider());
            this.Pc.setTextSize(1, 14.0f);
            this.Pc.setGravity(17);
            this.Pc.setPadding(hl.L(16.0f), hl.L(10.0f), hl.L(16.0f), hl.L(10.0f));
            this.Pc.setText(ob6.M0(2131745001, null));
            this.b1.addView(this.Pc, tre.o(-1, -2));
            this.b1.i(2, this.Pc);
            this.b1.h(this.Pc);
            this.b1.j(this.Pc, false, false);
            this.Z1.setClickable(true);
            this.b1.addView(this.Z1, tre.o(-1, 44));
            this.b1.i(2, this.Z1);
            this.b1.h(this.Z1);
            TextView textView2 = new TextView(getParentActivity());
            this.c2 = textView2;
            int i2 = aob.q7;
            yob.X(textView2, i2, getResourceProvider());
            TextView textView3 = this.c2;
            float L = hl.L(18.0f);
            int L2 = hl.L(4.0f);
            yob.R(textView3, aob.W(L, getThemedColor(i2) & 436207615, L2, L2, L2, L2), null, yob.g(i2, 25), getResourceProvider());
            this.c2.setTag(Integer.valueOf(i2));
            this.c2.setTextSize(1, 14.0f);
            this.c2.setTypeface(hl.o());
            this.c2.setSingleLine(true);
            this.c2.setMaxLines(1);
            this.c2.setGravity(17);
            this.Z1.addView(this.c2, tre.e(-1, -1, 51));
            this.c2.setOnClickListener(new ll1(this, (byte) 7));
            p66 p66Var = new p66(getParentActivity(), this.Ba);
            this.i2 = p66Var;
            yob.X(p66Var, i, getResourceProvider());
            this.i2.setTextSize(1, 13.3f);
            this.i2.setDisablePaddingsOffset(true);
            yob.G(this.i2, aob.Zl, getResourceProvider());
            this.i2.setGravity(17);
            this.i2.setPadding(0, hl.L(9.0f), 0, hl.L(9.0f));
            this.b1.addView(this.i2, tre.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.b1.i(8, this.i2);
            this.b1.h(this.i2);
            TextView textView4 = new TextView(getParentActivity());
            this.a2 = textView4;
            int i3 = aob.Ye;
            yob.X(textView4, i3, getResourceProvider());
            this.a2.setVisibility(8);
            this.a2.setTextSize(1, 14.0f);
            this.a2.setTypeface(hl.o());
            this.a2.setSingleLine(true);
            this.a2.setMaxLines(1);
            this.a2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            this.a2.setGravity(17);
            TextView textView5 = this.a2;
            float L3 = hl.L(18.0f);
            int L4 = hl.L(4.0f);
            yob.R(textView5, aob.W(L3, getThemedColor(i3) & 436207615, L4, L4, L4, L4), null, yob.g(i3, 25), getResourceProvider());
            this.Z1.addView(this.a2, tre.e(-1, -1, 51));
            this.a2.setOnClickListener(new ll1(this, (byte) 8));
            TextView textView6 = new TextView(getParentActivity());
            this.d2 = textView6;
            yob.X(textView6, i3, getResourceProvider());
            this.d2.setVisibility(8);
            this.d2.setTextSize(1, 14.0f);
            this.d2.setTypeface(hl.o());
            this.d2.setSingleLine(true);
            this.d2.setMaxLines(1);
            this.d2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            this.d2.setGravity(17);
            this.d2.setText(ob6.M0(2131745811, null));
            yob.R(this.d2, aob.f0(getThemedColor(i3) & 436207615, 3, -1), null, yob.g(i3, 25), getResourceProvider());
            this.b1.addView(this.d2, tre.o(-1, 48));
            this.b1.i(4, this.d2);
            this.b1.h(this.d2);
            this.d2.setOnClickListener(new ll1(this, (byte) 9));
            ImageView imageView = new ImageView(getParentActivity());
            this.j2 = imageView;
            imageView.setImageResource(2131231987);
            this.j2.setContentDescription(ob6.M0(2131752006, null));
            ImageView imageView2 = this.j2;
            int i4 = aob.i6;
            yob.R(imageView2, aob.N(getThemedColor(i4), 0, 0), null, yob.M(i4), getResourceProvider());
            yob.s(this.j2, aob.Ue, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.j2, tre.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.j2.setOnClickListener(new ll1(this, (byte) 10));
        }
    }

    public final long f7() {
        if (this.g4 == 3) {
            return this.s4;
        }
        return 0L;
    }

    public final boolean f8() {
        l1c l1cVar = this.g2;
        if (l1cVar != null) {
            return l1cVar.c;
        }
        if (xc2.c0(this.e) && I4()) {
            return true;
        }
        return false;
    }

    public final void f9() {
        long j;
        Integer valueOf = Integer.valueOf(this.n6);
        ArrayList arrayList = this.z6;
        arrayList.add(valueOf);
        if (this.g4 == 7) {
            df5 a = df5.a(this.currentAccount);
            String str = this.J3;
            int i = this.classGuid;
            int i2 = this.d4;
            int i3 = this.n6;
            this.n6 = i3 + 1;
            a.e(i, i2, i3, str);
        } else if (this.O7 != 0) {
            uc7 messagesController = getMessagesController();
            long j2 = this.l6;
            long j3 = this.d7;
            int i4 = this.O7;
            int i5 = this.classGuid;
            int i6 = this.g4;
            long j4 = this.s4;
            int i7 = this.C4;
            int i8 = this.n6;
            this.n6 = i8 + 1;
            messagesController.g3(j2, j3, false, 30, 0, i4, true, 0, i5, 4, i6, j4, i7, i8, this.x4);
        } else if (this.M7 != 0 && (!k8() || this.M7 == this.d8 || this.x4)) {
            int i9 = this.B7;
            if (i9 != 0) {
                this.d7 = i9;
                uc7 messagesController2 = getMessagesController();
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
                messagesController2.g3(j5, 0L, z, b, i10, 0, true, 0, i11, 3, i12, j6, i13, i14, this.x4);
            } else {
                uc7 messagesController3 = getMessagesController();
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
                messagesController3.g3(j7, j8, z2, b2, i15, 0, true, 0, i16, 3, i17, j9, i18, i19, this.x4);
            }
        } else if (this.A7) {
            this.n6++;
        } else {
            uc7 messagesController4 = getMessagesController();
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
            messagesController4.g3(j10, j11, z3, b3, i20, 0, true, 0, i21, 2, i22, j12, i23, i24, this.x4);
        }
        int i25 = this.g4;
        if (i25 == 0 || (i25 == 3 && f7() == getUserConfig().e())) {
            if (k8() && !this.x4) {
                return;
            }
            arrayList.add(Integer.valueOf(this.n6));
            uc7 messagesController5 = getMessagesController();
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
            messagesController5.g3(j13, j14, false, 1, 0, 0, true, 0, i26, 2, 1, j15, i27, i28, this.x4);
        }
    }

    public final boolean fa() {
        nr1 nr1Var = this.a0;
        boolean z = nr1Var.o3;
        if (z) {
            nr1Var.h2();
            this.S3 = true;
        }
        hl.g3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z;
    }

    public final void fb(int r23, java.util.ArrayList r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.fb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void fc(b77 b77Var) {
        ac(true, null, null, null, null, true, 0, null, false, 0L, b77Var, true);
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
        if ((!k8() || this.x4) && this.a3 != null) {
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
            if (objArr == null && !this.qc && !this.X2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (objArr != null && !this.qc && !this.X2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.qc && !this.X2) {
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
                    this.b3.setInterpolator(k43.h);
                    this.b3.setDuration(360L);
                    this.b3.addListener(new cp1(this, z5, z6, z7));
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
                if (k8() && !this.x4) {
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
        n8 n8Var = this.g9;
        if (n8Var != null) {
            n8Var.e = false;
            M5(true);
        }
    }

    public final void g5() {
        r47 r47Var;
        if (!this.R4 && (r47Var = this.b8) != null) {
            if (this.M6.indexOf(r47Var) >= 0) {
                this.S4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.Q4 != null) {
        } else {
            hm1 hm1Var = new hm1(this, (byte) 12);
            this.Q4 = hm1Var;
            hl.c3(hm1Var);
        }
    }

    public final void g6() {
        int i;
        if (this.g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                b6();
            }
            l1c l1cVar = new l1c(getParentActivity(), this, this.currentAccount, a(), I4(), getResourceProvider());
            this.g2 = l1cVar;
            l1cVar.S = new zo1(this, (byte) 2);
            l1cVar.setSideMenuBackgroundDrawable(this.L.c(l1cVar, dtd.o(this.Ba), false));
            l1c l1cVar2 = this.g2;
            l1cVar2.setTopMenuBackgroundDrawable(this.L.c(l1cVar2, dtd.o(this.Ba), false));
            this.g2.setCurrentTopic(c());
            this.g2.setOnNewTopicSelected(new zo1(this, (byte) 3));
            this.g2.setOnTopicSelected(new pl1(this, (byte) 3));
            this.g2.setOnDialogSelected(new pl1(this, (byte) 4));
            int indexOfChild = this.m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i = indexOfChild + 1;
            } else {
                i = 8;
            }
            this.m1.addView(this.g2, i, tre.f(-1.0f, -1, 51, 0, -hl.L(5.0f), 0, 0));
            this.g2.m();
            Dd();
            fr1 fr1Var = this.X1;
            if (fr1Var != null) {
                fr1Var.bringToFront();
            }
        }
    }

    public final int g7(int i) {
        return (int) bp1.f((((this.A0.getMeasuredHeight() - this.Ya) - this.P9) - this.w.e()) - hl.L(53.0f), i, 2.0f, -hl.L(2.0f));
    }

    public final boolean g8() {
        if (this.m0 != null && l8()) {
            return true;
        }
        return false;
    }

    public final void g9(View view, boolean[] zArr, n8 n8Var, View view2) {
        int i;
        int i2;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            i = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        } else {
            i = 0;
        }
        if (i > 0 && !zArr[0] && n8Var == this.g9 && n8Var.isShowing() && view2.isLaidOut()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = (view2.getHeight() + iArr[1]) - (view.getHeight() - i);
            int i3 = hl.m;
            int i4 = this.j9;
            if (height > 0) {
                i2 = hl.L(8.0f) + height;
            } else {
                i2 = 0;
            }
            int max = Math.max(i3, i4 - i2);
            if (max != this.j9) {
                zArr[0] = true;
                int i5 = this.i9;
                this.j9 = max;
                n8Var.update(i5, max, -1, -1);
            }
        }
    }

    public final void gb() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().j(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.M7 = 0;
        this.C7 = false;
        this.D7 = true;
        this.z6.clear();
    }

    public final void gc(boolean z, TLRPC.WebPage webPage, boolean z2) {
        bc(z, null, null, webPage, true, 0, null, z2, 0L, true);
    }

    public final void gd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.gd(int, boolean):void");
    }

    @Override
    public final rk5 getBackButtonState() {
        return rk5.a;
    }

    @Override
    public final jt3 getEdgeToEdgeSupportMode() {
        return jt3.c;
    }

    @Override
    public final vc2 getGroupCall() {
        vc2 vc2Var;
        if (this.g4 == 0 && (vc2Var = this.o8) != null && (vc2Var.b instanceof TLRPC.TL_groupCall)) {
            return vc2Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.g4 == 2) {
            ArrayList arrayList = this.M6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.L(80.0f) + V6((r47) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public vnb getResourceProvider() {
        return this.Ba;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ema emaVar;
        ema emaVar2;
        View view;
        o24 o24Var;
        o24 o24Var2;
        o24 o24Var3;
        o24 o24Var4;
        o24 o24Var5;
        o24 o24Var6;
        o24 o24Var7;
        o24 o24Var8;
        o24 o24Var9;
        o24 o24Var10;
        o24 o24Var11;
        o24 o24Var12;
        View view2;
        if (this.w7) {
            return null;
        }
        int i = 0;
        if (this.xa) {
            this.xa = false;
            return null;
        }
        u00 u00Var = new u00(this, (byte) 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ee));
        arrayList.add(new apb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Fe));
        arrayList.add(new apb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ge));
        arrayList.add(new apb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.He));
        c8();
        arrayList.add(new apb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.G8));
        arrayList.add(new apb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.F8));
        qq1 qq1Var = this.p1;
        if (qq1Var != null) {
            emaVar = qq1Var.getTitleTextView();
        } else {
            emaVar = null;
        }
        arrayList.add(new apb(emaVar, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.A8));
        qq1 qq1Var2 = this.p1;
        if (qq1Var2 != null) {
            emaVar2 = qq1Var2.getTitleTextView();
        } else {
            emaVar2 = null;
        }
        int i2 = aob.B8;
        arrayList.add(new apb(emaVar2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        qq1 qq1Var3 = this.p1;
        if (qq1Var3 != null) {
            view = qq1Var3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new apb(i2, view));
        arrayList.add(new apb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i3 = aob.D8;
        arrayList.add(new apb(aVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.x8));
        t37 t37Var = (t37) getThemedDrawable("drawableMsgIn");
        t37 t37Var2 = (t37) getThemedDrawable("drawableMsgInMedia");
        t37 t37Var3 = (t37) getThemedDrawable("drawableMsgInSelected");
        t37 t37Var4 = (t37) getThemedDrawable("drawableMsgInMediaSelected");
        t37 t37Var5 = (t37) getThemedDrawable("drawableMsgOut");
        t37 t37Var6 = (t37) getThemedDrawable("drawableMsgOutMedia");
        t37 t37Var7 = (t37) getThemedDrawable("drawableMsgOutSelected");
        t37 t37Var8 = (t37) getThemedDrawable("drawableMsgOutMediaSelected");
        if (t37Var != null) {
            Drawable[] drawableArr = t37Var.A;
            int i4 = aob.ta;
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, drawableArr, (zob) null, i4));
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, t37Var2.A, (zob) null, i4));
            Drawable[] drawableArr2 = t37Var5.A;
            int i5 = aob.tb;
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, drawableArr2, (zob) null, i5));
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, t37Var6.A, (zob) null, i5));
        }
        if (!this.Ba.p(false)) {
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{t37Var5, t37Var6}, (zob) null, aob.ub));
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{t37Var5, t37Var6}, (zob) null, aob.vb));
            arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{t37Var5, t37Var6}, (zob) null, aob.wb));
        }
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{t37Var7, t37Var8}, (zob) null, aob.Sc));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.hd));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.id));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Vd));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Zb));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Wd));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ac));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.bc));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.nc));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.pc));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.oc));
        arrayList.add(new apb(this.A0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.gf));
        this.Ba.getClass();
        qr1 qr1Var = this.g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i6 = aob.Je;
        arrayList.add(new apb(qr1Var, 0, (Class[]) null, themedPaint, (Drawable[]) null, (zob) null, i6));
        arrayList.add(new apb(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (zob) null, i6));
        arrayList.add(new apb(this.a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (zob) null, aob.Ol));
        arrayList.add(new apb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Qe));
        arrayList.add(new apb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Re));
        arrayList.add(new apb(this.a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (zob) null, aob.bg));
        arrayList.add(new apb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.eg));
        nr1 nr1Var = this.a0;
        int i7 = aob.dg;
        arrayList.add(new apb(nr1Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        arrayList.add(new apb(this.a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        arrayList.add(new apb(this.a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (zob) null, aob.fg));
        arrayList.add(new apb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (zob) null, aob.Uf));
        arrayList.add(new apb(this.a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Xf));
        nr1 nr1Var2 = this.a0;
        if (nr1Var2 != null) {
            o24Var = nr1Var2.getEmojiView();
        } else {
            o24Var = null;
        }
        arrayList.add(new apb(o24Var, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Cf));
        nr1 nr1Var3 = this.a0;
        if (nr1Var3 != null) {
            o24Var2 = nr1Var3.getEmojiView();
        } else {
            o24Var2 = null;
        }
        arrayList.add(new apb(o24Var2, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Df));
        nr1 nr1Var4 = this.a0;
        if (nr1Var4 != null) {
            o24Var3 = nr1Var4.getEmojiView();
        } else {
            o24Var3 = null;
        }
        arrayList.add(new apb(o24Var3, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Ef));
        nr1 nr1Var5 = this.a0;
        if (nr1Var5 != null) {
            o24Var4 = nr1Var5.getEmojiView();
        } else {
            o24Var4 = null;
        }
        arrayList.add(new apb(o24Var4, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Gf));
        nr1 nr1Var6 = this.a0;
        if (nr1Var6 != null) {
            o24Var5 = nr1Var6.getEmojiView();
        } else {
            o24Var5 = null;
        }
        arrayList.add(new apb(o24Var5, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Hf));
        nr1 nr1Var7 = this.a0;
        if (nr1Var7 != null) {
            o24Var6 = nr1Var7.getEmojiView();
        } else {
            o24Var6 = null;
        }
        arrayList.add(new apb(o24Var6, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Jf));
        nr1 nr1Var8 = this.a0;
        if (nr1Var8 != null) {
            o24Var7 = nr1Var8.getEmojiView();
        } else {
            o24Var7 = null;
        }
        arrayList.add(new apb(o24Var7, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Kf));
        nr1 nr1Var9 = this.a0;
        if (nr1Var9 != null) {
            o24Var8 = nr1Var9.getEmojiView();
        } else {
            o24Var8 = null;
        }
        arrayList.add(new apb(o24Var8, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Of));
        nr1 nr1Var10 = this.a0;
        if (nr1Var10 != null) {
            o24Var9 = nr1Var10.getEmojiView();
        } else {
            o24Var9 = null;
        }
        arrayList.add(new apb(o24Var9, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Ff));
        nr1 nr1Var11 = this.a0;
        if (nr1Var11 != null) {
            o24Var10 = nr1Var11.getEmojiView();
        } else {
            o24Var10 = null;
        }
        arrayList.add(new apb(o24Var10, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Bf));
        nr1 nr1Var12 = this.a0;
        if (nr1Var12 != null) {
            o24Var11 = nr1Var12.getEmojiView();
        } else {
            o24Var11 = null;
        }
        arrayList.add(new apb(o24Var11, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.Mf));
        nr1 nr1Var13 = this.a0;
        if (nr1Var13 != null) {
            o24Var12 = nr1Var13.getEmojiView();
        } else {
            o24Var12 = null;
        }
        arrayList.add(new apb(o24Var12, 0, new Class[]{o24.class}, (String[]) null, (Drawable[]) null, u00Var, aob.If));
        nr1 nr1Var14 = this.a0;
        if (nr1Var14 != null) {
            o5c trendingStickersAlert = nr1Var14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.S());
            }
            arrayList.add(new apb((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.a0.getStickersArrowDrawable()}, (zob) null, aob.Nl));
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (i8 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new apb(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.wj));
        }
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Pf));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Qf));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Rf));
        arrayList.add(new apb(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.v7));
        arrayList.add(new apb(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (zob) null, aob.u7));
        arrayList.add(new apb(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (zob) null, aob.A7));
        arrayList.add(new apb(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.y7));
        arrayList.add(new apb(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.d6));
        NumberTextView numberTextView = this.U2;
        int i9 = aob.We;
        arrayList.add(new apb(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i9));
        ImageView imageView = this.h3;
        int i10 = aob.z8;
        arrayList.add(new apb(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i10));
        arrayList.add(new apb(this.i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i10));
        arrayList.add(new apb(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Zc));
        arrayList.add(new apb(this.A0, 131072, new Class[]{bf2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (zob) null, aob.xf));
        a81 a81Var = this.S;
        int i11 = aob.cd;
        arrayList.add(new apb(a81Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i11));
        arrayList.add(new apb(this.q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i11));
        arrayList.add(new apb(this.n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i11));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.K6));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Mc));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.lg));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.mg));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Kh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Lh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Mh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Nh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ph));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Qh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Rh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Sh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Th));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Uh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Vh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Wh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Zh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ai));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.bi));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Xh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Yh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Jc));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.tk));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.vk));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.uk));
        int i12 = aob.wk;
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i12));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i12));
        pz1 pz1Var = this.Ca;
        if (pz1Var != null) {
            arrayList.add(new apb(pz1Var.g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i9));
            arrayList.add(new apb(pz1Var.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ue));
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((apb) obj).n = this.Ba;
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
        return aob.T0(str);
    }

    public TLRPC.User h() {
        return this.f;
    }

    public final void h5(boolean z) {
        if (this.F5 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i < arrayList.size()) {
                    r47 r47Var = (r47) arrayList.get(i);
                    if (r47Var != null && r47Var.e1() == this.F5.e1() && r47.B0(r47Var.k) == r47.B0(this.F5.k)) {
                        this.F5 = r47Var;
                        ou1 ou1Var = this.D5;
                        if (ou1Var != null) {
                            ou1Var.a(r47Var);
                        }
                        if (z) {
                            v47 v47Var = this.x5;
                            if (v47Var != null) {
                                r47 r47Var2 = this.F5;
                                m47 m47Var = this.B5;
                                if (m47Var == null) {
                                    m47Var = T6(r47Var2.c1());
                                }
                                v47Var.f(r47Var2, m47Var, this.l6, this.D5);
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

    public final void h6() {
        if (this.e2 == null && getParentActivity() != null) {
            f6();
            if (this.b1 != null) {
                as1 as1Var = new as1(this, getParentActivity(), this, this.Ba);
                this.e2 = as1Var;
                this.b1.addView(as1Var, tre.r(-1, 36, 83));
                this.b1.i(12, this.e2);
                this.b1.h(this.e2);
            }
        }
    }

    public final int h7(r47 r47Var) {
        return g7(V6(r47Var, !TextUtils.isEmpty(this.h8))) - qb(r47Var);
    }

    public final boolean h8() {
        boolean z;
        boolean z2;
        float f;
        FrameLayout frameLayout;
        if (!this.c && !this.d && this.f == null && this.A0 != null && xea.c()) {
            Boolean bool = this.Tb;
            if (bool == null) {
                bool = Boolean.valueOf(i86.e(360928));
                this.Tb = bool;
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
                    X4(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.U6;
                boolean z3 = zArr[0];
                ArrayList arrayList = this.M6;
                if ((!z3 || ((this.d7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.Y6 && f2 > this.P9 && (!arrayList.isEmpty() ? i2 != 0 : this.Sb)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !this.inTransitionAnimation || (frameLayout = this.f1) == null || frameLayout.getVisibility() != 0 || this.f1.getChildCount() <= 0) {
                    if (!z && this.f7 == 0) {
                        X4(this.fragmentBeginToShow);
                    }
                    if (xea.o() != 0 && !this.oa && this.fragmentBeginToShow) {
                        if (z && this.f7 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Drawable l = this.Ba.l();
                        nt1 nt1Var = this.m1;
                        if (nt1Var != null) {
                            l = nt1Var.getBackgroundImage();
                        }
                        if (l instanceof hh7) {
                            hh7 hh7Var = (hh7) l;
                            if (hh7Var.M != z2) {
                                float f3 = 1.0f;
                                if (!z2) {
                                    hh7Var.d();
                                    if (hh7Var.M) {
                                        hh7Var.h = 1.0f - ((hh7Var.h - (((int) (f / 0.125f)) * 0.125f)) / 0.125f);
                                        hh7Var.d = true;
                                    }
                                }
                                hh7Var.M = z2;
                                if (z2) {
                                    f3 = 1.5f;
                                }
                                hh7Var.L = f3;
                                hh7Var.x();
                            } else if (z2) {
                                hh7Var.x();
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

    public final void h9(long j) {
        getMediaDataController().I0(j, j, true, this.classGuid, null);
    }

    public final void hb() {
        this.nc = null;
        this.lc = 0;
        this.mc = -1;
        this.oc = null;
        this.pc = null;
        this.y1.d(false);
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
                this.v3.addListener(new zp1(this, (byte) 4));
                this.v3.start();
            }
            if (!z) {
                Q7();
                this.p3 = (short) 1000;
            }
        }
    }

    public final void hd() {
        r47 r47Var;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.x4 && !this.X4.isEmpty() && this.V4.size() == 1 && ((Integer) this.V4.get(0)).intValue() == c() + 1) {
            r47Var = (r47) this.X4.get(this.V4.get(0));
        } else {
            r47Var = null;
        }
        this.n4 = r47Var;
        if (this.x4 && r47Var != null && (message = r47Var.k) != null && (tL_forumTopic = this.r4) != null && !r47.u5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.e;
            TLRPC.Peer peer = this.n4.k.from_id;
            if (chat == null) {
                if (peer == null) {
                    return;
                }
            } else if (peer != null) {
                if (xc2.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                    if (chat.id == peer.channel_id) {
                        return;
                    }
                } else if (!xc2.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.id == peer.chat_id) {
                    return;
                }
            }
            this.n4 = null;
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        r47 r47Var = this.m4;
        if (r47Var != null && r47Var.M1() == 0 && xc2.n(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i5() {
        rr1 rr1Var;
        qr1 qr1Var;
        qr1 qr1Var2;
        nr1 nr1Var = this.a0;
        if (nr1Var != null && nr1Var.o4) {
            MediaController.z().O = false;
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !xc2.v(chat)) {
            MediaController.z().O = false;
        } else if (!a.x && (((rr1Var = this.d1) == null || rr1Var.getVisibility() != 0) && (((qr1Var = this.T) == null || qr1Var.getVisibility() != 0) && ((qr1Var2 = this.g3) == null || qr1Var2.getVisibility() != 0)))) {
            MediaController.z().O = true;
        } else {
            MediaController.z().O = false;
        }
    }

    public final void i6() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.Ba);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(hl.L(51.0f));
            this.m1.addView(this.N3, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int i7(View view) {
        cc4.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom()) + "} chatHeight=" + this.A0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.A0.getPaddingBottom());
        return (this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom();
    }

    public final boolean i8() {
        if (this.f != null && this.h == null && this.g4 == 0 && getMessagesController().r2(this.f.id)) {
            return true;
        }
        return false;
    }

    public final void i9() {
        if (this.o5) {
            this.o5 = false;
            MediaController z = MediaController.z();
            if (z.I() && !z.J() && z.h1 == this.classGuid) {
                z.H0(false);
            }
        }
    }

    public final void ia() {
        U4(5, this.e1, true);
        U4(1, this.a0, false);
        U4(4, this.g3, true);
        U4(3, this.d1, false);
        U4(2, this.T, false);
        float f = this.sd.e;
        ykf ykfVar = this.xd;
        float B = qu6.B(1.0f, f, 1.0f - ((float[]) ykfVar.b)[5], 1.0f);
        av1 av1Var = this.e1;
        if (av1Var != null) {
            av1Var.setTotalVisibilityFactor(B);
        }
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            nr1Var.setTranslationY(hl.L(54.0f) * B);
        }
        qr1 qr1Var = this.g3;
        if (qr1Var != null) {
            qr1Var.setTranslationY(hl.L(54.0f) * B);
        }
        rr1 rr1Var = this.d1;
        if (rr1Var != null) {
            rr1Var.setTranslationY(hl.L(54.0f) * B);
        }
        qr1 qr1Var2 = this.T;
        if (qr1Var2 != null) {
            qr1Var2.setTranslationY(hl.L(54.0f) * B);
        }
        z92 z92Var = this.U;
        if (z92Var != null) {
            z92Var.setInputBubbleAlpha((int) ((1.0f - B) * 255.0f));
            this.U.setInputBubbleTranslationY(hl.L(54.0f) * B);
        }
        rr1 rr1Var2 = this.d1;
        fm0 fm0Var = this.qd;
        if (rr1Var2 != null) {
            rr1Var2.setTotalVisibilityFactor((1.0f - fm0Var.e) * ((float[]) ykfVar.b)[3]);
        }
        ad2 ad2Var = this.ma;
        if (ad2Var != null) {
            float f2 = fm0Var.e;
            if (ad2Var.T != f2) {
                ad2Var.T = f2;
                this.fragmentView.invalidate();
            }
        }
        C5();
    }

    public final void ib(defpackage.wb2 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.ib(wb2):void");
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
                this.w3.addUpdateListener(new ql1(this, (byte) 3));
                this.w3.addListener(new zp1(this, (byte) 6));
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
            vnb resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w0 = resourceProvider.f(aob.w8);
            } else {
                w0 = aob.w0(null, aob.w8, true);
            }
            if (vm2.h(w0) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z = aob.I.o();
        } else {
            z = this.sc;
        }
        return !z;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        n0c n0cVar;
        ks1 ks1Var;
        j19 j19Var;
        if ((this.g4 == 5 && (this.M6.isEmpty() || this.s4 == 0)) || (((n0cVar = this.n0) != null && (n0cVar.y > 0.0f || n0cVar.c0)) || this.y9 || this.ud.f || !this.K9 || (((ks1Var = this.cb) != null && ks1Var.s) || ((j19Var = this.ua) != null && j19Var.a())))) {
            return false;
        }
        return true;
    }

    public final boolean j5(boolean z, boolean z2) {
        nr1 nr1Var = this.a0;
        if (nr1Var == null || !nr1Var.W0()) {
            return false;
        }
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
            boolean z3 = this.a0.d1;
            id idVar = alertDialog$Builder.a;
            if (z3) {
                idVar.S = ob6.M0(2131751360, null);
                idVar.U = ob6.M0(2131751361, null);
            } else {
                idVar.S = ob6.M0(2131751357, null);
                idVar.U = ob6.M0(2131751358, null);
            }
            alertDialog$Builder.j(ob6.M0(2131751359, null), new t41((byte) 2, this, z2));
            alertDialog$Builder.g(ob6.M0(2131751736, null), null);
            showDialog(idVar);
            return true;
        }
        return true;
    }

    public final ArrayList j6(r47 r47Var, boolean z) {
        ArrayList t = qd4.t(r47Var);
        int e1 = r47Var.e1();
        r47Var.A0();
        if (e1 != 0) {
            ArrayList arrayList = this.M6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                r47 r47Var2 = (r47) arrayList.get(size);
                if ((r47.B0(r47Var2.k) != this.d7 || r47.B0(r47Var.k) == this.d7) && (((this.h == null && r47Var2.e1() > e1) || (this.h != null && r47Var2.e1() < e1)) && ((r47.Q4(r47Var2.k) || r47Var2.g4()) && !r47Var2.R4() && !r47Var2.f4() && (!z || (r47Var2.k.media_unread && !r47Var2.N3()))))) {
                    t.add(r47Var2);
                }
            }
        }
        return t;
    }

    public final qu1 j7() {
        qu1 qu1Var = this.jd;
        if (qu1Var == null) {
            qu1 qu1Var2 = new qu1(this);
            this.jd = qu1Var2;
            return qu1Var2;
        }
        return qu1Var;
    }

    public final boolean j8() {
        if (getUserConfig().e() == a() && !getMessagesController().F1().b && getUserConfig().p()) {
            return true;
        }
        return false;
    }

    public final void j9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            ls6.d0(this.currentAccount).G0(false, true, null);
            ma(user.id, this.C8, false);
        }
    }

    public final void ja(boolean z, boolean z2) {
        if (this.S3) {
            hl.d3(new ny(this, (byte) 17), 200L);
            if (z2) {
                this.S3 = false;
            }
        }
        if (z && !this.mb) {
            hl.V2(getParentActivity(), this.classGuid);
        }
    }

    public final void jb() {
        hh7 j;
        xu1 xu1Var = this.Ba;
        if (xu1Var != null) {
            Drawable l = xu1Var.l();
            if (this.fragmentView != null) {
                l = this.m1.getBackgroundImage();
            }
            if (l instanceof g82) {
                l = ((g82) l).c(true);
            }
            if (l instanceof hh7) {
                ((hh7) l).v(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof t37) && (j = ((t37) themedDrawable).j()) != null) {
                j.v(false);
            }
        }
    }

    public final boolean jc() {
        nr1 nr1Var = this.a0;
        if (nr1Var != null && nr1Var.getVisibility() == 0) {
            SharedPreferences e1 = uc7.e1();
            if (!e1.getBoolean("gifhint", false)) {
                e1.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.t2 == null) {
                    if (!this.t5) {
                        nr1 nr1Var2 = this.a0;
                        if (nr1Var2 != null) {
                            nr1Var2.Z();
                            ls6.d0(nr1Var2.R).X0(true, true, false, 0);
                            my1 my1Var = nr1Var2.V0;
                            my1Var.K(false, false);
                            my1Var.P(false, false);
                            my1Var.h.x(1, false);
                            return false;
                        }
                    } else {
                        nt1 nt1Var = this.m1;
                        int indexOfChild = nt1Var.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            nr1 nr1Var3 = this.a0;
                            nr1Var3.Z();
                            ls6.d0(nr1Var3.R).X0(true, true, false, 0);
                            my1 my1Var2 = nr1Var3.V0;
                            my1Var2.K(false, false);
                            my1Var2.P(false, false);
                            my1Var2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232690);
                            int i = indexOfChild + 1;
                            nt1Var.addView(this.L2, i, tre.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            kg5 x4 = x4(310.0f, 3, i, false);
                            this.t2 = x4;
                            x4.d = 2300L;
                            x4.t(ob6.M0(2131743921, null));
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
        if (r5()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                p7a b = p7a.b(str, this.l6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b.K = X6();
                z3 = z2;
                b.L = z3;
                b.Q = j2;
                b.R = k7();
                b.T = this.y5;
                r7a.B(this.currentAccount).q0(b);
                str2 = null;
            } else {
                z3 = z2;
                str2 = str;
            }
            getSendMessagesHelper().p0(arrayList3, this.l6, false, false, true, 0, 0, null, -1, j2, k7(), this.y5);
            k5 accountInstance = getAccountInstance();
            r7a.U(i, this.l6, j, j2, k7(), accountInstance, this.D5, null, this.F5, this.m4, this.H5, this.y5, null, X6(), str2, null, arrayList, arrayList, null, arrayList2, null, null, null, z, z3);
            E4();
        }
    }

    public final void k5() {
        if (!this.Hc) {
            this.Hc = true;
            if (!this.Ic && this.g4 == 0 && !getMessagesController().F1().b && getMessagesController().F1().c() > 2) {
                if (this.K1 != null && uc7.e1().getInt("savedhint", 0) < 1) {
                    this.K1.v();
                    this.Ic = true;
                    uc7.e1().edit().putInt("savedhint", uc7.e1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", uc7.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && uc7.e1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.v();
                    this.Ic = true;
                    uc7.e1().edit().putInt("savedsearchhint", uc7.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    l5();
                }
            }
        }
    }

    public final void k6(int i, int i2, boolean z) {
        this.D0.N.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.M6;
            if (i3 >= arrayList.size()) {
                break;
            }
            r47 r47Var = (r47) arrayList.get(i3);
            int i4 = r47Var.k.date;
            if (i4 <= i || i4 >= i2) {
                this.D0.N.add(r47Var);
            }
            i3++;
        }
        wq1 wq1Var = this.A0;
        if (wq1Var != null) {
            wq1Var.setEmptyView(null);
        }
        if (this.D0.N.isEmpty()) {
            sc(true);
        }
        it1 it1Var = this.D0;
        it1Var.M = true;
        it1Var.J(true);
        i6();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.l6, 81, new no1(this, i, i2, z), new gn1(this, (byte) 18));
    }

    public final long k7() {
        r47 r47Var;
        TLRPC.Message message;
        r47 r47Var2;
        TLRPC.Message message2;
        if (!xc2.p0(this.e) || !xc2.A(this.currentAccount, this.e, 24)) {
            return 0L;
        }
        long j = this.s4;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0 && (r47Var2 = this.H5) != null && (message2 = r47Var2.k) != null) {
            return wf3.n(message2.saved_peer_id);
        }
        if (i == 0 && (r47Var = this.F5) != null && (message = r47Var.k) != null) {
            return wf3.n(message.saved_peer_id);
        }
        return j;
    }

    public final boolean k8() {
        if (this.m4 != null) {
            return true;
        }
        return false;
    }

    public final void k9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = uc7.s1(this.currentAccount).o1(user.id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ko1(this, tL_attachMenuBot, user, (byte) 1), 66);
    }

    public final void ka() {
        this.R4 = true;
        ot1 ot1Var = this.u9;
        hl.r(ot1Var.f0);
        ot1Var.z = false;
        hm1 hm1Var = new hm1(this, (byte) 29);
        int i = this.V7;
        if (i != 0) {
            tb(i, 0, false, this.U7 ? 1 : 0, true, 0, null, null, hm1Var);
            return;
        }
        int i2 = this.T7;
        if (i2 > 0) {
            tb(i2, 0, true, this.U7 ? 1 : 0, true, 0, null, null, hm1Var);
            return;
        }
        sb(!this.Nb, hm1Var);
        this.Nb = false;
        if (!this.V4.isEmpty()) {
            this.c5 = true;
            this.b5 = ((Integer) this.V4.get(0)).intValue();
        }
    }

    public final void kb() {
        boolean z;
        r47 r47Var;
        CharSequence charSequence;
        boolean z2;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j;
        rr1 rr1Var;
        nr1 nr1Var = this.a0;
        if (nr1Var != null && nr1Var.s2) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.m5 && nr1Var != null && (rr1Var = this.d1) != null && rr1Var.getVisibility() != 0) {
            r47Var = this.F5;
            charSequence = hl.m1(this.a0.getDraftMessage());
            z = this.a0.N3;
        } else {
            z = true;
            r47Var = null;
            charSequence = null;
        }
        if (this.E5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        ls6 mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && hl.W0(encryptedChat.layer) < 101) {
            z2 = false;
        } else {
            z2 = true;
        }
        ArrayList Y = mediaDataController.Y(charSequenceArr, z2, false);
        long N5 = N5(r47Var);
        TLRPC.DraftMessage T = getMediaDataController().T(this.l6, N5);
        if (T != null) {
            richMessage = T.rich_message;
        } else {
            richMessage = null;
        }
        ls6 mediaDataController2 = getMediaDataController();
        long j2 = this.l6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (r47Var != null && !r47Var.p && r47Var.j1 == null && !this.E5) {
            message = r47Var.k;
        } else {
            message = null;
        }
        ou1 ou1Var = this.D5;
        b77 b77Var = this.y5;
        if (b77Var != null) {
            suggestedPost = b77Var.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        nr1 nr1Var2 = this.a0;
        if (nr1Var2 != null) {
            j = nr1Var2.getEffectId();
        } else {
            j = 0;
        }
        mediaDataController2.T1(j2, N5, charSequence2, Y, message, ou1Var, suggestedPost2, j, !z, false, richMessage);
    }

    public final void kc() {
        TLRPC.ChatFull chatFull = this.r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                hl.d3(new ny(this, (byte) 4), 1000L);
            }
        }
    }

    public final void kd(boolean z) {
        String M0;
        if (this.g4 != 3 && !lbc.w(this.f)) {
            qq1 qq1Var = this.p1;
            if (qq1Var != null && this.s4 != 0) {
                if (this.x4) {
                    Bd();
                } else {
                    boolean z2 = this.v4;
                    r47 r47Var = this.m4;
                    if (z2) {
                        if (r47Var != null && r47Var.x2()) {
                            this.p1.setTitle(ob6.G(this.m4.M1(), "Comments", new Object[0]));
                        } else {
                            this.p1.setTitle(ob6.M0(2131751961, null));
                        }
                    } else if (r47Var != null) {
                        qq1Var.setTitle(ob6.G(r47Var.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.q4 != null) {
                if (this.m4.M1() == 0) {
                    if (this.v4) {
                        M0 = ob6.M0(2131747957, null);
                    } else {
                        M0 = ob6.M0(2131747899, null);
                    }
                } else {
                    M0 = ob6.M0(2131751340, null);
                }
                r47 r47Var2 = this.q4;
                r47Var2.k.message = M0;
                r47Var2.v = M0;
                if (z) {
                    this.D0.M(r47Var2, true, false);
                }
            }
        }
    }

    public final void l5() {
        wb2 wb2Var;
        kg5 kg5Var;
        boolean z;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        kg5 kg5Var2 = this.M1;
        if (kg5Var2 != null && !kg5Var2.W && !this.Kc && this.Hc && !this.ud.f && System.currentTimeMillis() - this.Jc > 1800 && uc7.e1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof wb2) {
                        wb2Var = (wb2) childAt;
                        x49 x49Var = wb2Var.O;
                        r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.k) == null || (tL_messageReactions = message.reactions) == null) {
                            z = false;
                        } else {
                            z = tL_messageReactions.reactions_as_tags;
                        }
                        if (z && !x49Var.s.isEmpty()) {
                            wb2Var.getLocationInWindow(iArr);
                            float f = iArr[1] + x49Var.c;
                            if (f >= hl.L(240.0f) && f <= (hl.q.y - hl.L(25.0f)) - hl.n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    wb2Var = null;
                    break;
                }
            }
            if (wb2Var != null) {
                x49 x49Var2 = wb2Var.O;
                this.Kc = true;
                wb2Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - kg5Var.getTop()) - hl.L(120.0f)) + x49Var2.c);
                this.M1.o(0.0f, (((u49) x49Var2.s.get(0)).z / 2.0f) + (-hl.L(16.0f)) + iArr[0] + x49Var2.b);
                this.M1.v();
                uc7.e1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            hl.r(new ny(this, (byte) 16));
            hl.d3(new ny(this, (byte) 16), 2000L);
        }
    }

    public final void l6(wb2 wb2Var, r47 r47Var, CharacterStyle characterStyle, final String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        int i;
        boolean z5;
        CharacterStyle characterStyle2;
        boolean z6;
        wb2 wb2Var2;
        int i2;
        TLRPC.WebPage webPage;
        int i3;
        int i4;
        r47 r47Var2 = r47Var;
        final tu0 tu0Var = new tu0(this, r47Var2, characterStyle, (byte) 26);
        fu5 J = fu5.J(this, wb2Var);
        mu9 mu9Var = new mu9(getParentActivity(), this.Ba);
        J.p = new dm1(mu9Var, (byte) 0);
        if (!str.startsWith("video?") && !m01.g(Uri.parse(str), false, null)) {
            z = true;
        } else {
            z = false;
        }
        boolean T2 = getMessagesController().T2(str);
        if (T2 && z) {
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
            i = 2131232270;
            z5 = z3;
            characterStyle2 = characterStyle;
            z6 = z2;
            wb2Var2 = wb2Var;
        } else {
            if (z2 && !z3) {
                i3 = 2131231929;
            } else {
                i3 = 2131232270;
            }
            if (z2 && !z3) {
                i4 = 2131747518;
            } else {
                i4 = 2131747544;
            }
            String M0 = ob6.M0(i4, null);
            z4 = z;
            i = 2131232270;
            str2 = "mailto:";
            ca7 ca7Var = new ca7(this, str, characterStyle, r47Var2, wb2Var, z2, z3, tu0Var, (byte) 1);
            z5 = z3;
            characterStyle2 = characterStyle;
            r47Var2 = r47Var2;
            z6 = z2;
            wb2Var2 = wb2Var;
            J.b(i3, M0, ca7Var, false);
        }
        if ((z6 && !z5) || startsWith) {
            J.b(i, ob6.M0(2131747520, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r1;
                    String str3 = str;
                    tu0 tu0Var2 = tu0Var;
                    zu1 zu1Var = this;
                    switch (b) {
                        case 0:
                            zu1Var.T8(tu0Var2, str3);
                            return;
                        default:
                            zu1Var.U8(tu0Var2, str3);
                            return;
                    }
                }
            }, false);
        } else if (!startsWith && !z5 && !z6 && z4 && !T2) {
            J.b(2131231929, ob6.M0(2131747518, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r1;
                    String str3 = str;
                    tu0 tu0Var2 = tu0Var;
                    zu1 zu1Var = this;
                    switch (b) {
                        case 0:
                            zu1Var.T8(tu0Var2, str3);
                            return;
                        default:
                            zu1Var.U8(tu0Var2, str3);
                            return;
                    }
                }
            }, false);
        }
        TLRPC.MessageMedia m1 = r47.m1(r47Var2);
        if ((m1 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m1.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            J.b(2131231838, ob6.M0(2131747517, null), new fm1(this, r47Var2, (byte) 0), false);
        }
        if (z5) {
            i2 = 2131751728;
        } else if (startsWith) {
            i2 = 2131751726;
        } else {
            i2 = 2131751727;
        }
        J.b(2131232108, ob6.M0(i2, null), new lg(this, str, r47Var2, startsWith, (byte) 5), false);
        if (T2 && !z5 && !startsWith && !str.startsWith("tg:")) {
            J.b(2131232520, ob6.M0(2131742572, null), new hl1(this, str, (byte) 2), false);
        }
        mu9Var.e(J);
        if (str.startsWith(str2)) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            mu9Var.f(wb2Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof h8c) {
            String d = m01.d(((h8c) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204).concat("…");
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            mu9Var.f(wb2Var2, characterStyle2, spannableString2, false);
        } else {
            mu9Var.f(wb2Var2, characterStyle2, null, false);
        }
        showDialog(mu9Var);
    }

    public final int l7() {
        return this.m1.getBackgroundSizeY();
    }

    public final boolean l8() {
        if (d8()) {
            return getMessagesController().F1().e();
        }
        l1c l1cVar = this.g2;
        if (l1cVar == null || !l1cVar.a.f) {
            return false;
        }
        if (!xc2.u0(this.e)) {
            TLRPC.User user = this.f;
            if (!lbc.w(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l9(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            ls6.d0(this.currentAccount).G0(false, true, null);
            ma(user.id, this.C8, false);
        }
    }

    public final void lb() {
        wb2 wb2Var = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.A0.getChildCount()) {
                break;
            }
            View childAt = this.A0.getChildAt(i);
            if ((childAt instanceof bf2) && childAt.getBottom() > 0 && childAt.getTop() < this.A0.getHeight()) {
                wb2Var = childAt;
                break;
            }
            if (childAt instanceof wb2) {
                wb2 wb2Var2 = (wb2) childAt;
                int min = Math.min(wb2Var2.getBottom(), this.A0.getHeight()) - Math.max(0, wb2Var2.getTop());
                if (min > i2) {
                    wb2Var = wb2Var2;
                    i2 = min;
                }
            }
            i++;
        }
        if (wb2Var != null) {
            zq1 zq1Var = this.C0;
            this.A0.getClass();
            zq1Var.h1(RecyclerView.S(wb2Var), wb2Var.getTop() - ((int) this.P9), false);
        }
    }

    public final void lc(r47 r47Var, CharSequence charSequence, int i) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        v21 G = d31.b0(this).G(2131623982, 9999, charSequence);
        G.j = max;
        G.w = new il1(this, i);
        G.k(true);
        this.V3 = r47Var;
        this.W3 = i;
    }

    public final void ld(int i, r47 r47Var) {
        r47 r47Var2;
        SparseArray sparseArray = this.I6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i);
        if (arrayList == null) {
            return;
        }
        if (r47Var == null) {
            r47Var2 = new r47(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            r47Var2 = null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r47 r47Var3 = (r47) this.G6[0].get(((Integer) arrayList.get(i2)).intValue());
            if (r47Var3 != null) {
                if (r47Var == null) {
                    r47Var3.C = r47Var2;
                } else {
                    r47Var3.C = r47Var;
                }
                it1 it1Var = this.D0;
                if (it1Var != null) {
                    it1Var.M(r47Var3, true, false);
                }
            }
        }
        if (r47Var == null) {
            sparseArray.remove(i);
        }
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        F6(((q7a) arrayList.get(0)).d, ((q7a) arrayList.get(0)).i);
        r7a.W(getAccountInstance(), arrayList, this.l6, this.F5, this.m4, null, this.D5, true, false, this.H5, null, z, i, 0, ((q7a) arrayList.get(0)).t, null, X6(), 0L, false, j, k7(), this.y5, null, false);
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

    public final void m5(boolean z) {
        int i;
        if (this.C0 != null && !this.I5 && !this.D0.M && !this.x7) {
            final int i2 = 0;
            int i3 = -1;
            final int i4 = -1;
            for (int i5 = 0; i5 < this.A0.getChildCount(); i5++) {
                int S = RecyclerView.S(this.A0.getChildAt(i5));
                if (S != -1) {
                    if (i4 == -1 || S < i4) {
                        i4 = S;
                    }
                    if (i3 == -1 || S > i3) {
                        i3 = S;
                    }
                    i2++;
                }
            }
            it1 it1Var = this.D0;
            if (it1Var.O) {
                int i6 = it1Var.F;
                if (i6 >= 0 && i4 >= 0 && i6 >= i4 && i6 <= i3) {
                    getMediaDataController().Q0();
                    return;
                }
                return;
            }
            final int b = it1Var.b();
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
                    df5 a = df5.a(this.currentAccount);
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
            hl.c3(new Runnable() {
                @Override
                public final void run() {
                    zu1.this.q8(b, i4, i2, i7);
                }
            });
        }
    }

    public final void m6(CharacterStyle characterStyle, boolean z, r47 r47Var, wb2 wb2Var) {
        Object[] objArr;
        int i;
        TLRPC.WebPage webPage;
        boolean z2;
        int i2;
        r47 r47Var2;
        r47 r47Var3;
        r47 r47Var4;
        TLRPC.WebPage webPage2;
        r47 r47Var5;
        wb2 wb2Var2;
        r47 messageObject;
        ArrayList arrayList;
        m47 m47Var;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z3 = true;
            boolean z4 = true;
            char c = 1;
            char c2 = 1;
            if (!a8() && (r47Var == null || (message = r47Var.k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            wb2 wb2Var3 = null;
            if (characterStyle instanceof e8c) {
                if (objArr == null || a() == 489000) {
                    e8c e8cVar = (e8c) characterStyle;
                    hl.g(e8cVar.a.subSequence(e8cVar.b, e8cVar.c).toString());
                    i6();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z && wb2Var != null) {
                    wb2Var.i3(-1);
                }
            } else if (characterStyle instanceof i8c) {
                TLRPC.User X1 = getMessagesController().X1(Utilities.A(((i8c) characterStyle).getURL()));
                if (X1 != null) {
                    uc7.s1(this.currentAccount).I3(X1, null, this, 0);
                }
                if (z && wb2Var != null) {
                    wb2Var.i3(-1);
                }
                Z9(r47Var, false, false);
            } else if (characterStyle instanceof no4) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((no4) characterStyle).b;
                if (tL_messageEntityFormattedDate == null || (messageObject = wb2Var.getMessageObject()) == null) {
                    wb2Var2 = wb2Var;
                } else {
                    if (messageObject.c1() != 0 && (m47Var = (m47) this.P6.f(messageObject.c1())) != null) {
                        arrayList = m47Var.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = qd4.t(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e = getUserConfig().e();
                    String A = ob6.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    fu5 J = fu5.J(this, wb2Var);
                    mu9 mu9Var = new mu9(getParentActivity(), this.Ba);
                    J.p = new dm1(mu9Var, (byte) 0);
                    J.b(2131232108, ob6.M0(2131746059, null), new mm1(this, mu9Var, A, (byte) 0), false);
                    wb2Var2 = wb2Var;
                    J.b(2131232082, ob6.M0(2131746060, null), new ra7(this, J, messageObject, wb2Var, A, tL_messageEntityFormattedDate, mu9Var, (byte) 5), false);
                    J.b(2131232267, ob6.M0(2131746058, null), new nm1(this, J, e, tL_messageEntityFormattedDate, arrayList2, mu9Var, (byte) 0), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    mu9Var.e(J);
                    mu9Var.f(wb2Var2, characterStyle, spannableString, false);
                    showDialog(mu9Var);
                }
                if (wb2Var2 != null) {
                    wb2Var2.i3(-1);
                }
            } else if (characterStyle instanceof f8c) {
                String url = ((f8c) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    n6(wb2Var, characterStyle, url.substring(4));
                    if (z && wb2Var != null) {
                        wb2Var.i3(-1);
                        return;
                    }
                    return;
                }
                SparseArray[] sparseArrayArr = this.G6;
                if (r47Var != null) {
                    if (url.startsWith("/")) {
                        if (c8c.h) {
                            nr1 nr1Var = this.a0;
                            TLRPC.Chat chat = this.e;
                            if (chat == null || !chat.megagroup) {
                                z4 = false;
                            }
                            nr1Var.L1(r47Var, url, z, z4);
                            if (!z && this.a0.getFieldText() == null) {
                                E7(false);
                            }
                        }
                        if (z && wb2Var != null) {
                            wb2Var.i3(-1);
                            return;
                        }
                        return;
                    } else if (url.startsWith("video") && !z) {
                        int intValue = Utilities.z(url).intValue();
                        if (r47Var.d5()) {
                            webPage2 = r47Var.k.media.webpage;
                            r47Var4 = r47Var;
                        } else {
                            r47 r47Var6 = r47Var.C;
                            if (r47Var6 != null && r47Var6.d5()) {
                                r47Var4 = r47Var.C;
                                webPage2 = r47Var4.k.media.webpage;
                            } else {
                                r47Var4 = r47Var;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            iv3.J0(this, r47Var4, this.db, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, Y7());
                            return;
                        }
                        if (!r47.K4(r47Var4.k) && (r47Var5 = r47Var4.C) != null) {
                            if (r47.B0(r47Var5.k) == this.l6) {
                                c = 0;
                            }
                            r47 r47Var7 = (r47) sparseArrayArr[c].get(r47Var4.C.e1());
                            if (r47Var7 == null) {
                                r47Var4 = r47Var4.C;
                            } else {
                                r47Var4 = r47Var7;
                            }
                        } else {
                            wb2Var3 = wb2Var;
                        }
                        r47Var4.c0 = intValue / ((float) r47Var4.L0());
                        xa(wb2Var3, r47Var4);
                        return;
                    }
                }
                if (r47Var != null && url.startsWith("audio")) {
                    int intValue2 = Utilities.z(url).intValue();
                    if (!r47Var.I3() && (r47Var3 = r47Var.C) != null) {
                        if (r47.B0(r47Var3.k) == this.l6) {
                            c2 = 0;
                        }
                        r47Var2 = (r47) sparseArrayArr[c2].get(r47Var.C.e1());
                    } else {
                        r47Var2 = r47Var;
                    }
                    if (r47Var2 != null) {
                        float f = intValue2;
                        float L0 = f / ((float) r47Var2.L0());
                        MediaController mediaController = getMediaController();
                        if (mediaController.H(r47Var2)) {
                            r47Var2.b0 = L0;
                            mediaController.k0(r47Var2, L0);
                            if (mediaController.G()) {
                                mediaController.V(r47Var2);
                            }
                        } else {
                            r47Var2.c0 = f / ((float) r47Var2.L0());
                            mediaController.V(r47Var2);
                        }
                        if (z && wb2Var != null) {
                            wb2Var.i3(-1);
                        }
                        if (!r47.Q4(r47Var2.k)) {
                            showDialog(new j20(getParentActivity(), this.Ba));
                        }
                    }
                } else if (url.startsWith("tonaddress:")) {
                    String substring = url.substring(11);
                    c C = c.C(this.currentAccount);
                    boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                    TLRPC.User[] userArr = new TLRPC.User[1];
                    y6a y6aVar = new y6a(this, wb2Var, isValidAddress, substring, userArr, characterStyle);
                    if (isValidAddress) {
                        cq1 aa = aa(wb2Var, characterStyle);
                        boolean[] zArr = {false};
                        if (aa != null) {
                            aa.b = new om1(zArr, (byte) 0);
                            aa.d();
                        }
                        C.j0(new pm1(this, zArr, aa, userArr, y6aVar, (byte) 0), substring);
                    } else {
                        y6aVar.run();
                    }
                    if (wb2Var != null) {
                        wb2Var.i3(-1);
                    }
                } else if (url.startsWith("card:")) {
                    String substring2 = url.substring(5);
                    cq1 aa2 = aa(wb2Var, characterStyle);
                    TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                    tL_payments_getBankCardData.number = substring2;
                    aa2.b = new ul1(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new in0(this, aa2, wb2Var, substring2, characterStyle, (byte) 3), null, null, 0, getMessagesController().r3, 1, true), (byte) 5);
                    aa2.d();
                    wb2Var.i3(-1);
                } else {
                    pa(characterStyle, url, z, wb2Var, r47Var);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    n6(wb2Var, characterStyle, url2.substring(4));
                } else if (z) {
                    l6(wb2Var, r47Var, characterStyle, url2);
                    if (wb2Var != null) {
                        wb2Var.i3(-1);
                    }
                } else {
                    Z9(r47Var, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        m01.u(parentActivity, url2);
                        return;
                    }
                    boolean z5 = characterStyle instanceof h8c;
                    if ((z5 && (url2 == null || !url2.startsWith("mailto:"))) || hl.D3(url2)) {
                        if (r47Var != null) {
                            i2 = r47Var.e1();
                        } else {
                            i2 = 0;
                        }
                        if (ua(url2, wb2Var, characterStyle, i2, 1)) {
                            return;
                        }
                    } else {
                        if (r47Var != null) {
                            TLRPC.MessageMedia messageMedia = r47Var.k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = r47Var.k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || m01.j(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    ea4.g.G(url2);
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(r47Var) == null) {
                                        createArticleViewer(false).L(r47Var, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (r47Var != null) {
                            i = r47Var.e1();
                        } else {
                            i = 0;
                        }
                        if (!ua(url2, wb2Var, characterStyle, i, 1)) {
                            z3 = z5;
                        } else {
                            return;
                        }
                    }
                    if (m01.A(url2)) {
                        z2 = false;
                    } else {
                        z2 = z3;
                    }
                    Pa(2, url2, characterStyle, wb2Var, z2);
                }
            }
        }
    }

    public final float m7(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.m1.getBackgroundTranslationY()) - ((1.0f - this.U9) * this.P9);
    }

    public final void m8(int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        int i4;
        ArrayList arrayList = this.M6;
        if (!arrayList.isEmpty()) {
            r47 r47Var = (r47) c00.g(1, arrayList);
            if ((((r47) arrayList.get(0)).k.date >= i && r47Var.k.date <= i) || (r47Var.k.date >= i && this.U6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    r47 r47Var2 = (r47) arrayList.get(size);
                    if (r47Var2.k.date >= i && r47Var2.e1() != 0) {
                        int e1 = r47Var2.e1();
                        if (r47.B0(r47Var2.k) == this.d7) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        J(e1, 0, i4, 0, false, true);
                        return;
                    }
                }
            } else if (!wf3.B(this.l6)) {
                int M0 = this.C0.M0();
                int K0 = this.C0.K0();
                while (true) {
                    if (K0 <= M0) {
                        it1 it1Var = this.D0;
                        int i5 = it1Var.K;
                        if (K0 >= i5 && K0 < it1Var.L && (message = ((r47) arrayList.get(K0 - i5)).k) != null) {
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
                id idVar = this.ec;
                if (idVar != null) {
                    idVar.dismiss();
                }
                fd(false);
                id idVar2 = new id(3, this.Ba, getParentActivity());
                this.ec = idVar2;
                idVar2.setOnCancelListener(this.Ja);
                this.ec.q(1000L);
                int i6 = this.n6;
                this.q9 = i6;
                this.s9 = false;
                this.z6.add(Integer.valueOf(i6));
                this.r9 = 0;
                this.t9 = false;
                uc7 messagesController = getMessagesController();
                long j = this.l6;
                long j2 = this.d7;
                int i7 = this.classGuid;
                int i8 = this.g4;
                long j3 = this.s4;
                int i9 = this.C4;
                int i10 = this.n6;
                this.n6 = i10 + 1;
                messagesController.g3(j, j2, false, 30, 0, i, true, 0, i7, 4, i8, j3, i9, i10, this.x4);
                this.m3.setAlpha(0.0f);
                this.m3.setTag(null);
                this.x3 = 0.0f;
                Tc();
                this.n3.setTag(null);
            }
        }
    }

    public final void m9(TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = uc7.s1(this.currentAccount).o1(user.id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ko1(this, tL_attachMenuBot, user, (byte) 0), 66);
    }

    public final void ma(long j, String str, boolean z) {
        na();
        f41 f41Var = this.Y1;
        if (f41Var != null) {
            f41Var.y1(j, str, z, false);
        }
    }

    public final void mb(defpackage.r47 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.mb(r47):void");
    }

    public final void mc(boolean z) {
        boolean z2;
        vz1 vz1Var = this.y1;
        if (vz1Var != null) {
            if (z && !xc2.p0(this.e)) {
                z2 = true;
            } else {
                z2 = false;
            }
            vz1Var.e(2, z2, true);
            if (!z) {
                this.T7 = 0;
            }
        }
    }

    public final void md(boolean z) {
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            nr1Var.G2(z);
        }
    }

    @Override
    public final boolean n() {
        return this.O9;
    }

    public final void n5(r47 r47Var) {
        if (r47Var.D == 4 && !this.H8) {
            boolean z = xea.a;
            if (!uc7.e1().contains("mapPreviewType")) {
                this.H8 = true;
                jj.p0(getParentActivity(), this.currentAccount, new hm1(this, (byte) 8), true, this.Ba);
            }
        }
    }

    public final void n6(wb2 wb2Var, CharacterStyle characterStyle, String str) {
        cq1 aa = aa(wb2Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().l0.get(f78.h(str, false));
        hu0 hu0Var = new hu0(this, wb2Var, str, tL_contact, characterStyle, (byte) 3);
        if (tL_contact != null) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null) {
                hu0Var.a(X1);
                return;
            } else {
                getMessagesStorage().a.c(new tu0(this, tL_contact, hu0Var, (byte) 27));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = f78.h(str, false);
        aa.b = new ul1(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new fn0(this, aa, hu0Var, (byte) 15)), (byte) 2);
        aa.d();
    }

    public final float n7() {
        l1c l1cVar = this.g2;
        if (l1cVar != null) {
            return l1cVar.getSideMenuT();
        }
        return 0.0f;
    }

    public final void n8(n8 n8Var) {
        if (Build.VERSION.SDK_INT >= 30 && n8Var != null && n8Var.isShowing()) {
            View contentView = n8Var.getContentView();
            View rootView = contentView.getRootView();
            final boolean[] zArr = new boolean[1];
            final la7 la7Var = new la7(this, rootView, zArr, n8Var, contentView, (byte) 17);
            rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zArr[0] = false;
                    view.post(la7Var);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
            rootView.addOnLayoutChangeListener(new pk1(la7Var, (byte) 1));
            rootView.requestApplyInsets();
        }
    }

    public final void n9(TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            uc7.s1(this.currentAccount).j4(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (h() != null) {
                tLObject2 = h();
            } else {
                tLObject2 = this.e;
            }
            if (!ls6.v(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = this.f;
                if (user2 != null && user2.bot && user.id == tL_attachMenuBot.bot_id) {
                    xnb.x(null, 2131753097, d31.b0(this), null);
                } else if (user2 != null && user2.bot && user.id != tL_attachMenuBot.bot_id) {
                    xnb.x(null, 2131753100, d31.b0(this), null);
                } else if (user2 != null && !user2.bot) {
                    xnb.x(null, 2131753096, d31.b0(this), null);
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !xc2.V(chat)) {
                        xnb.x(null, 2131753098, d31.b0(this), null);
                        return;
                    }
                    TLRPC.Chat chat2 = this.e;
                    if (chat2 != null && xc2.V(chat2)) {
                        xnb.x(null, 2131753099, d31.b0(this), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                ma(user.id, this.C8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                yx yxVar = new yx(getParentActivity());
                yxVar.setColor(aob.w0(null, aob.ia, false));
                yob.h(aob.L5, null, yxVar);
                yxVar.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                id idVar = alertDialog$Builder.a;
                idVar.W = yxVar;
                idVar.U = hl.S2(ob6.a0("BotRequestAttachPermission", null, 2131752977, lbc.r(user)));
                alertDialog$Builder.j(ob6.M0(2131753146, null), new pt(this, user, atomicBoolean, tL_attachMenuBot, (byte) 4));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    sg2 sg2Var = new sg2(5, getResourceProvider(), getParentActivity());
                    sg2Var.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
                    sg2Var.setBackground(aob.L0(false));
                    sg2Var.setMultiline(true);
                    sg2Var.e(hl.S2(ob6.a0(null, null, 2131747507, lbc.r(user))), "", true, false, false);
                    if (ob6.a0) {
                        L = hl.L(16.0f);
                    } else {
                        L = hl.L(8.0f);
                    }
                    if (ob6.a0) {
                        L2 = hl.L(8.0f);
                    } else {
                        L2 = hl.L(16.0f);
                    }
                    sg2Var.setPadding(L, 0, L2, 0);
                    sg2Var.setOnClickListener(new sb1(sg2Var, atomicBoolean, (byte) 7));
                    idVar.H = (byte) 6;
                    alertDialog$Builder.n(sg2Var);
                }
                alertDialog$Builder.o();
            } else {
                exc.a(getParentActivity(), new gt(this, user, tL_attachMenuBot, (byte) 9), null);
            }
        }
    }

    public final void na() {
        boolean z;
        boolean z2;
        if (getParentActivity() != null) {
            nr1 nr1Var = this.a0;
            if (nr1Var == null || TextUtils.isEmpty(nr1Var.getSlowModeTimer())) {
                nr1 nr1Var2 = this.a0;
                if (nr1Var2 != null && nr1Var2.N7.f) {
                    z = true;
                } else {
                    z = false;
                }
                S5();
                f41 f41Var = this.Y1;
                if (!z && this.g4 != 9) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                f41Var.O3 = z2;
                f41Var.d2.g0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.y5 == null) && !z && this.g4 != 9) {
                    if (chat != null && !xc2.N(chat) && this.e.slowmode_enabled) {
                        this.Y1.u1(10, true);
                    } else {
                        this.Y1.u1(-1, true);
                    }
                } else {
                    this.Y1.u1(1, true);
                }
                f41 f41Var2 = this.Y1;
                f41Var2.P2 = true;
                f41Var2.u3.setVisibility(0);
                f41Var2.N2 = (byte) 0;
                f41Var2.z1 = false;
                f41Var2.A1 = false;
                f41Var2.c2 = true;
                f41Var2.D1 = null;
                s7 s7Var = f41Var2.h3;
                if (s7Var != null) {
                    f41Var2.g3.setTranslationY(0.0f);
                    s7Var.setVisibility(8);
                }
                this.Y1.a1();
                this.Y1.V0().setText(this.a0.getFieldText());
                f41 f41Var3 = this.Y1;
                f41Var3.s1 = this.Ba;
                showDialog(f41Var3);
            }
        }
    }

    public final void nb(long j) {
        zq1 zq1Var;
        r47 messageObject;
        int i7;
        int abs;
        int i = -1;
        if (this.A0 != null && (zq1Var = this.C0) != null && zq1Var.y < 0) {
            int i2 = 0;
            if (this.W6[0] && zq1Var.K0() == 0) {
                this.F7 = -1;
                return;
            }
            int i3 = Integer.MAX_VALUE;
            for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                if (RecyclerView.S(childAt) >= 0 && (childAt instanceof wb2) && (messageObject = ((wb2) childAt).getMessageObject()) != null && messageObject.Y1() == j && (abs = Math.abs((i7 = i7(childAt)))) < i3) {
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

    public final void nc(boolean z) {
        int i;
        if (this.Z3 != null) {
            fm0 fm0Var = this.ud;
            if (fm0Var.f != z) {
                fm0Var.a(z, true);
                if (!z && this.g4 == 7) {
                    x46 x46Var = (x46) this.a4.getLayoutManager();
                    Object E = this.b4.E((x46Var.M0() + x46Var.K0()) / 2);
                    Object E2 = this.b4.E(x46Var.K0());
                    Object E3 = this.b4.E(x46Var.M0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList G = this.D0.G();
                        int K0 = this.C0.K0();
                        int M0 = this.C0.M0();
                        int i2 = ((r47) E).k.id;
                        int i3 = ((r47) E2).k.id;
                        int i4 = ((r47) E3).k.id;
                        int i5 = -1;
                        boolean z2 = false;
                        boolean z3 = false;
                        for (int i6 = 0; i6 < G.size(); i6++) {
                            if (((r47) G.get(i6)).k.id == i3) {
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
                            if (((r47) G.get(i6)).k.id == i4) {
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
                            if (((r47) G.get(i6)).k.id == i2) {
                                i5 = i6;
                            }
                        }
                        if (!z2 && !z3 && i5 != -1) {
                            this.C0.g1(this.D0.K + i5, (this.A0.getHeight() - V6((r47) G.get(i5), true)) / 2);
                        }
                    }
                }
                in inVar = this.k3;
                if (inVar != null) {
                    if (fm0Var.f) {
                        i = 2131745546;
                    } else {
                        i = 2131745545;
                    }
                    inVar.c(ob6.M0(i, null), !ob6.a0, true);
                }
                kg5 kg5Var = this.M1;
                if (kg5Var != null && kg5Var.W) {
                    kg5Var.f(true);
                }
                ys1 ys1Var = this.Q1;
                if (ys1Var != null && ys1Var.W) {
                    ys1Var.f(true);
                }
                nr1 nr1Var = this.a0;
                if (nr1Var != null) {
                    nr1Var.M0();
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
        vz1 vz1Var = this.y1;
        boolean z3 = false;
        if (vz1Var != null) {
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
            vz1Var.b(6).c = z;
            rx6 rx6Var = vz1Var.e[6];
            if (rx6Var != null) {
                ((cv1) rx6Var.b).b(z, true);
            }
            vz1 vz1Var2 = this.y1;
            if (this.nb) {
                i5 = 1;
            }
            if ((i & i5) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            vz1Var2.b(5).c = z2;
            rx6 rx6Var2 = vz1Var2.e[5];
            if (rx6Var2 != null) {
                ((cv1) rx6Var2.b).b(z2, true);
            }
        }
        this.L3 = i3;
        this.M3 = i2;
        od();
        in inVar = this.k3;
        if (inVar != null) {
            if (i3 > 0) {
                z3 = true;
            }
            inVar.setClickable(z3);
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
            e eVar = (e) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((eVar instanceof zu1) && ((zu1) eVar).Y7()) {
                return false;
            }
        }
        if (this.Z6 && !this.ub) {
            return true;
        }
        return false;
    }

    public final void o5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.o5(boolean):void");
    }

    public final void o6(defpackage.jf0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.o6(jf0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int o7() {
        return (int) (n7() * hl.L(71.0f));
    }

    public final boolean o8(org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.o8(org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public final void o9(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = uc7.s1(this.currentAccount).o1(user.id);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ql(this, user, (byte) 14));
                }
            }
        }
    }

    public final void oa() {
        rw2.e().T = null;
        if (getParentActivity() == null) {
            return;
        }
        S5();
        this.Y1.d2.g0();
        this.Y1.u1(1, false);
        f41 f41Var = this.Y1;
        f41Var.R3 = true;
        f41Var.R0(null);
        this.Y1.a1();
        f41 f41Var2 = this.Y1;
        f41Var2.s1 = this.Ba;
        if (this.visibleDialog != null) {
            f41Var2.show();
        } else {
            showDialog(f41Var2);
        }
    }

    public final void ob() {
        int i;
        int i2;
        wq1 wq1Var = this.A0;
        if (wq1Var != null && this.C0 != null) {
            for (int childCount = wq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                i2 = RecyclerView.S(childAt);
                if (i2 >= 0) {
                    if (childAt instanceof wb2) {
                        if (((wb2) childAt).getCurrentMessagesGroup() == null) {
                            i = i7(childAt);
                            break;
                        }
                    } else if (childAt instanceof dl1) {
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

    public final void oc(TLRPC.TL_game tL_game, r47 r47Var, String str, boolean z, long j) {
        String str2;
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
        String str3 = "";
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
            String M0 = ob6.M0(2131689472, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            if (X1 != null) {
                str3 = lv2.m(0, X1.first_name, X1.last_name);
            }
            idVar.U = ob6.a0(null, null, 2131752999, str3);
            alertDialog$Builder.j(ob6.M0(2131747558, null), new oo1(this, tL_game, r47Var, str, j));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            return;
        }
        String p = lbc.p(X1);
        if (!hl.O1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (X1 == null || TextUtils.isEmpty(p)) {
                        str2 = "";
                    } else {
                        str2 = p;
                    }
                    presentFragment(new jzc(str, str2, tL_game.title, tL_game.short_name, r47Var));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (X1 != null && p != null) {
            str3 = p;
        }
        jzc.Z(str, r47Var, parentActivity, str6, str3);
    }

    public final void od() {
        in inVar = this.j3;
        if (inVar != null) {
            boolean z = !ob6.a0;
            int i = this.L3;
            if (i < 0) {
                inVar.c("", z, true);
            } else if (i == 0) {
                inVar.c(ob6.M0(2131747898, null), z, true);
            } else if (this.G3) {
                inVar.c(ob6.G(i, "TaggedMessages", new Object[0]), z, true);
            } else if (this.g4 != 7 && !this.ud.f) {
                inVar.c(ob6.a0(null, null, 2131747556, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z, true);
            } else {
                inVar.c(ob6.G(i, "SearchMessagesResultCount", ob6.E(i, ' ')), z, true);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.onBackPressed(boolean):boolean");
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        K7();
        if (!getMessagesController().M3() && getMessagesController().G3 <= 0 && getMessagesController().a4 < 2 && !getUserConfig().p() && (arrayList = this.M6) != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                r47 r47Var = (r47) arrayList.get(i);
                if (r47Var != null && !r47Var.O3() && ((r47.Q4(r47Var.k) || r47Var.g4()) && !r47Var.E4() && (r47Var.k.media_unread || xc2.V(this.e)))) {
                    u2c.v(r47Var, false);
                }
            }
        }
        this.U3 = false;
        L7();
        ArrayList arrayList2 = u2c.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        l01 l01Var = this.pc;
        if (l01Var != null) {
            l01Var.a(false);
            this.pc = null;
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
        if (this.Pb) {
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.p1();
                nr1 nr1Var2 = this.a0;
                nr1Var2.U0 = false;
                my1 my1Var = nr1Var2.V0;
                if (my1Var != null) {
                    my1Var.s(false);
                }
            }
            this.Pb = false;
        }
        if (this.K1 != null) {
            hl.d3(new gn1(this, (byte) 29), 600L);
        }
        if (this.H4 && !this.I4) {
            this.I4 = true;
            v21 I = d31.b0(this).I(2131623993, ob6.M0(2131743252, null), ob6.M0(2131743254, null));
            I.j = 5000;
            I.w = new zo1(this, (byte) 0);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        wd2 wd2Var = this.va;
        if (wd2Var != null && wd2Var.d()) {
            this.va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        r47 r47Var;
        long j;
        long j2;
        long j3;
        qq1 qq1Var = this.p1;
        if (qq1Var != null) {
            ViewTreeObserver viewTreeObserver = qq1Var.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new gp1(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        M5(true);
        if (!hl.O1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C0() || !PhotoViewer.q0().V0()) && (r47Var = MediaController.z().v0) != null && r47.K4(r47Var.k)) {
                    PhotoViewer.q0().T1(null, this, this.Ba);
                    getFileLoader().c0(r47Var.F0(), false);
                    MediaController.z().m(true, true, false, true);
                    PhotoViewer q0 = PhotoViewer.q0();
                    if (r47Var.D != 0) {
                        j = this.l6;
                        j2 = this.d7;
                        j3 = c();
                    } else {
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                    }
                    if (q0.m1(r47Var, null, null, null, null, null, null, 0, this.db, null, j, j2, j3, false, null, null)) {
                        PhotoViewer.q0().k4 = this;
                    }
                    H7(false);
                    MediaController.z().w0 = null;
                }
            } else if (PhotoViewer.C0() && PhotoViewer.q0().m2) {
                PhotoViewer q02 = PhotoViewer.q0();
                if (q02.G2.c0()) {
                    if (q02.Z2) {
                        q02.G2.r0(false);
                    }
                    MediaController z = MediaController.z();
                    kfc kfcVar = q02.G2;
                    r47 r47Var2 = q02.S4;
                    if (kfcVar != null && r47Var2 != null) {
                        int i = r47Var2.K1;
                        xb4.G(i).c0(r47Var2.F0(), true);
                        z.G0 = false;
                        z.n();
                        z.F0 = kfcVar;
                        z.v0 = r47Var2;
                        int i2 = z.n0 + 1;
                        z.n0 = i2;
                        kfcVar.K = new rn6(z, i2, r47Var2, (byte) 1);
                        z.Q0 = false;
                        TextureView textureView = z.H0;
                        if (textureView != null) {
                            kfcVar.z0(textureView);
                        }
                        z.e(r47Var2);
                        z.p0();
                        z.h0 = false;
                        r47 r47Var3 = z.v0;
                        z.v0 = r47Var2;
                        if (!xea.k(true)) {
                            z.A0(z.s);
                        }
                        z.z0(z.v0);
                        jn7.f(i).k(jn7.h2, r47Var2, r47Var3);
                    }
                    q02.G2 = null;
                }
                PhotoViewer.q0().A(false, true);
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
        vr1 vr1Var = this.ta;
        float f = 0.0f;
        if (z && this.oa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            e eVar = (e) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (eVar instanceof zu1) {
                this.R4 = true;
                zu1 zu1Var = (zu1) eVar;
                zu1Var.qa = this;
                this.fragmentView.setAlpha(0.0f);
                this.m1.setSkipBackgroundDrawing(true);
                this.p1.setTranslationY(hl.L(8.0f));
                this.p1.getAvatarImageView().setAlpha(0.0f);
                this.p1.getAvatarImageView().setTranslationY(-hl.L(8.0f));
                this.pa = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                nr1 nr1Var = this.a0;
                if (nr1Var != null) {
                    nr1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.q.x, 1073741824), -2146483649);
                }
                qr1 qr1Var = this.T;
                if (qr1Var != null) {
                    qr1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.q.x, 1073741824), -2146483649);
                }
                nr1 nr1Var2 = this.a0;
                if (nr1Var2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = nr1Var2.getMeasuredHeight();
                }
                qr1 qr1Var2 = this.T;
                if (qr1Var2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = qr1Var2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                nr1 nr1Var3 = zu1Var.a0;
                if (nr1Var3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = nr1Var3.getMeasuredHeight();
                }
                qr1 qr1Var3 = this.T;
                if (qr1Var3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = qr1Var3.getMeasuredHeight();
                }
                this.la = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new lk(this, zu1Var, (byte) 6));
                Rc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.sa = animatorSet;
                animatorSet.addListener(new eq1(this, zu1Var, runnable));
                this.sa.setDuration(300L);
                this.sa.setInterpolator(k43.f);
                this.sa.playTogether(ofFloat2);
                hl.d3(vr1Var, 200L);
                return this.sa;
            }
        }
        if (this.Ga && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            e eVar2 = (e) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (eVar2 instanceof tzb) {
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                eVar2.getFragmentView().getWidth();
                if (!z) {
                    f = 1.0f;
                }
                this.Ia = f;
                ofFloat.addUpdateListener(new ce0(this, (byte) 2));
                this.Ha = true;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.invalidate();
                }
                nt1 nt1Var = this.m1;
                if (nt1Var != null) {
                    nt1Var.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.sa = animatorSet2;
                animatorSet2.addListener(new fq1(this, z, runnable));
                this.sa.setDuration(150L);
                this.sa.playTogether(ofFloat);
                if (z) {
                    hl.d3(vr1Var, 200L);
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
        id idVar = this.P;
        if (idVar != null && dialog == idVar) {
            getMessagesController().V(0, this.l6, false);
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && !wk5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z;
        wia wiaVar;
        vz vzVar = this.pb;
        if (vzVar != null) {
            vzVar.w = null;
            ula ulaVar = (ula) vzVar.d;
            if (ulaVar.d(vzVar)) {
                ulaVar.a(false);
            }
        }
        long j = this.l6;
        int[] iArr = u2c.N;
        ArrayList arrayList = new ArrayList(u2c.R.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            r47 r47Var = (r47) obj;
            if (r47.B0(r47Var.k) == j) {
                u2c.x(r47Var);
            }
        }
        getMessagesController().B4.remove(Integer.valueOf(this.classGuid));
        super.onFragmentDestroy();
        sz1 sz1Var = this.c4;
        if (sz1Var != null) {
            hl.r(sz1Var.f);
            sz1Var.I = false;
            na4 na4Var = sz1Var.h;
            na4Var.e &= na4Var.d;
            na4Var.b();
            da4 da4Var = sz1Var.G;
            if (da4Var != null) {
                da4Var.a.b(false);
                da4Var.a();
            }
        }
        int i2 = this.currentAccount;
        HashMap hashMap = ea4.a.a;
        if (hashMap.get(Integer.valueOf(i2)) == this) {
            hashMap.remove(Integer.valueOf(i2));
        }
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            nr1Var.g1();
        }
        qq1 qq1Var = this.p1;
        if (qq1Var != null && (wiaVar = qq1Var.d0) != null) {
            wiaVar.b(qq1Var.H);
        }
        fr1 fr1Var = this.X1;
        if (fr1Var != null && fr1Var.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        f41 f41Var = this.Y1;
        if (f41Var != null) {
            f41Var.H();
        }
        q qVar = this.q3;
        if (qVar != null) {
            qVar.j();
        }
        rw2 e = rw2.e();
        if (e.l == this.H9) {
            e.W = null;
            e.a0 = null;
            e.Y = null;
            e.l = null;
            e.c0 = null;
            e.j();
        }
        getNotificationCenter().j(this.ca);
        jn7.e().j(this.da);
        getNotificationCenter().j(this.ea);
        getNotificationCenter().j(this.fa);
        L7();
        gn1 gn1Var = this.d6;
        if (gn1Var != null) {
            hl.r(gn1Var);
            this.d6 = null;
        }
        jn7 notificationCenter = getNotificationCenter();
        ds1 ds1Var = this.Ka;
        notificationCenter.getClass();
        boolean z2 = f11.a;
        if (Thread.currentThread() == a.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(ds1Var)) {
                notificationCenter.o();
            }
            uc7 messagesController = getMessagesController();
            long j2 = this.l6;
            if (this.g4 == 1) {
                z = true;
            } else {
                z = false;
            }
            messagesController.Y4(j2, z, false);
            if (this.w4) {
                this.w4 = false;
                getMessagesController().l4(this.l6);
            }
            u8a u8aVar = this.Ab;
            if (u8aVar != null) {
                u8aVar.a();
                this.Ab = null;
            }
            getNotificationCenter().n(this, jn7.s);
            if (this.g4 == 0 && hl.O1()) {
                getNotificationCenter().k(jn7.h0, Long.valueOf(this.l6), Long.valueOf(c()), Boolean.TRUE);
            }
            if (this.f != null) {
                MediaController z3 = MediaController.z();
                if (z3.T1 == null) {
                    z3.T1 = new tv(z3, (byte) 9);
                }
                a.d.postDelayed(z3.T1, 5000L);
            }
            c34 c34Var = this.T3;
            if (c34Var != null) {
                c34Var.g();
            }
            if (this.f != null) {
                getMessagesController().h1.remove(Long.valueOf(this.f.id));
            }
            hl.y2(getParentActivity(), this.classGuid);
            f41 f41Var2 = this.Y1;
            if (f41Var2 != null) {
                f41Var2.f1();
                this.Y1 = null;
            }
            hl.K3(getParentActivity());
            if (xc2.T(this.e)) {
                getMessagesController().j5(this.e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().j5(getMessagesController().M0(Long.valueOf(this.r8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            ot1 ot1Var = this.u9;
            if (ot1Var != null) {
                ot1Var.e(false);
            }
            yq1 yq1Var = this.B0;
            if (yq1Var != null) {
                yq1Var.N();
            }
            wr1 wr1Var = this.Ta;
            if (wr1Var != null) {
                wr1Var.b();
            }
            this.ya = null;
            wk5 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Hd ? 1 : 0);
                wk5 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i3 = 0;
                    while (i3 < parentLayout2.getPulledDialogs().size()) {
                        if (((ed0) parentLayout2.getPulledDialogs().get(i3)).b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                }
            }
            Hd = false;
            l01 l01Var = this.pc;
            if (l01Var != null) {
                l01Var.a(false);
                this.pc = null;
            }
            gc2 gc2Var = this.Da;
            zu1 zu1Var = gc2Var.a;
            ArrayList arrayList2 = gc2Var.f;
            ArrayList arrayList3 = gc2Var.e;
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                zu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList3.get(i4)).intValue(), false);
            }
            arrayList3.clear();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                zu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i5)).intValue(), false);
            }
            arrayList2.clear();
            ks8 ks8Var = this.u8;
            if (ks8Var != null) {
                ks8Var.b(true);
                this.u8 = null;
            }
            lva lvaVar = this.ld;
            if (lvaVar != null) {
                lvaVar.setMessageCell(null);
                hl.B2(this.ld);
                this.ld = null;
                return;
            }
            return;
        }
        xi4.l("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Zb = true;
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47.K4(r47Var.k)) {
            MediaController.z().l(true, true);
        } else {
            MediaController.z().s0(this.M8, null, null, false);
        }
        lva lvaVar = this.ld;
        if (lvaVar != null) {
            lvaVar.setMessageCell(null);
            hl.B2(this.ld);
            this.ld = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        f41 f41Var;
        f41 f41Var2;
        boolean z;
        boolean z2;
        boolean z3;
        n12 n12Var;
        nr1 nr1Var = this.a0;
        boolean z4 = false;
        if (nr1Var != null && i == 2 && nr1Var.Y3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                r7a.B(nr1Var.R).n0(nr1Var.X3, nr1Var.Y3);
            }
            nr1Var.Y3 = null;
            nr1Var.X3 = null;
        }
        fr1 fr1Var = this.X1;
        if (fr1Var != null && fr1Var.getAdapter() != null) {
            r17 adapter = this.X1.getAdapter();
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
            f41 f41Var3 = this.Y1;
            if (f41Var3 != null) {
                f41Var3.d2.Y();
            }
            oe2 oe2Var = this.ya;
            if (oe2Var != null && (n12Var = oe2Var.R1) != null) {
                n12Var.d2.Y();
            }
        } else if ((i == 5 || i == 30) && (f41Var = this.Y1) != null) {
            if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                f41Var.m1();
            }
        } else if ((i == 17 || i == 18) && (f41Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = f41Var2.d2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z4 = true;
            }
            chatAttachAlertPhotoLayout.U(z4);
            this.Y1.d2.Y();
        } else if (i == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.Ba, getParentActivity());
                String M0 = ob6.M0(2131689472, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131747039, null);
                alertDialog$Builder.g(ob6.M0(2131747027, null), new uo1(this, (byte) 2));
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                alertDialog$Builder.o();
            }
        } else if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ta(0);
        } else if (i == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ta(2);
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
                    xkc.l(this.e, null, this.q8, null, getParentActivity(), this, getAccountInstance());
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
                xkc.m(user2, z2, z3, getParentActivity(), getMessagesController().Y1(this.f.id), getAccountInstance());
                return;
            }
            xkc.h(getParentActivity(), null, i);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.onResume():void");
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
            rz4 rz4Var = this.J;
            if (rz4Var != null) {
                Iterator it = rz4Var.w.iterator();
                while (it.hasNext()) {
                    hl0 hl0Var = ((jl0) it.next()).h0;
                    if (hl0Var != null) {
                        hl0Var.h = true;
                    }
                }
            }
            rz4 rz4Var2 = this.K;
            if (rz4Var2 != null) {
                Iterator it2 = rz4Var2.w.iterator();
                while (it2.hasNext()) {
                    hl0 hl0Var2 = ((jl0) it2.next()).h0;
                    if (hl0Var2 != null) {
                        hl0Var2.h = true;
                    }
                }
            }
            Paint paint = this.W8;
            if (paint != null) {
                paint.setColor(getThemedColor(aob.s8));
            }
            RadialProgressView radialProgressView = this.s0;
            if (radialProgressView != null) {
                if (U7()) {
                    i2 = aob.Ka;
                } else {
                    i2 = aob.Zc;
                }
                radialProgressView.setProgressColor(getThemedColor(i2));
            }
            rr1 rr1Var = this.d1;
            if (rr1Var != null) {
                rr1Var.setAccentColor(getThemedColor(aob.Fi));
            }
            fx0 fx0Var = this.I0;
            if (fx0Var != null && fx0Var.getBackground() != null && ((themedColor4 = getThemedColor(aob.Fi)) != this.L0 || this.Ob != aob.I.o())) {
                this.L0 = themedColor4;
                this.Ob = aob.I.o();
                Drawable background = this.I0.getBackground();
                aob.F1(background, themedColor4, false);
                aob.F1(background, rnb.b(themedColor4), true);
            }
            xb();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        Set<q7> set = this.V0;
        Set<q7> set2 = this.U0;
        try {
            RadialProgressView radialProgressView2 = this.J0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.K0));
            }
            NumberTextView numberTextView = this.U2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.We));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(aob.Ve));
            }
            p66 p66Var = this.i2;
            if (p66Var != null && this.S0) {
                p66Var.setEmojiColor(getThemedColor(aob.Xe));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(aob.y6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(aob.Fi)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(aob.H6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            xg8 xg8Var = this.yd;
            if (xg8Var != null && (i = this.T0) >= 0) {
                xg8Var.setColor(getThemedColor(i));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(aob.p7);
                for (q7 q7Var : set2) {
                    if (q7Var != null) {
                        q7Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int w0 = aob.w0(null, aob.p7, false);
                for (q7 q7Var2 : set) {
                    if (q7Var2 != null) {
                        q7Var2.a(w0, w0);
                    }
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        int[] iArr;
        mv1 mv1Var;
        super.onTransitionAnimationStart(z, z2);
        System.currentTimeMillis();
        int i = jn7.r;
        int i2 = jn7.K2;
        int i3 = jn7.G0;
        int i4 = jn7.s;
        if (z) {
            if (!this.g6) {
                this.g6 = true;
                cd();
            }
            iArr = this.ca == 0 ? new int[]{i, i4, i3, i2, jn7.C} : new int[]{i, i4, i3, i2};
            this.f6 = false;
            if (!z2) {
                this.h6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = lbc.D(this.f) ? new int[]{i, i4, i3, i2, jn7.V} : null;
            nr1 nr1Var = this.a0;
            if (nr1Var != null && (mv1Var = nr1Var.H2) != null) {
                hl.r(mv1Var);
                nr1Var.H2 = null;
            }
        }
        p5();
        this.ca = getNotificationCenter().p(iArr, this.ca, true);
    }

    @Override
    public final f82 p() {
        return this.p1;
    }

    public final void p5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.p5():void");
    }

    public final void p6(int r35, java.lang.Object... r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.p6(int, java.lang.Object[]):void");
    }

    public final s7 p7() {
        s7 s7Var = this.m0;
        if (s7Var != null && s7Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final void p8(boolean z, TLRPC.TL_error tL_error, TLObject tLObject, long j, boolean z2, boolean z3, boolean z4, TLObject tLObject2) {
        int i;
        boolean z5;
        this.rb = false;
        if (!z && (tL_error != null || !(tLObject instanceof TLRPC.Updates))) {
            if (z3) {
                this.sb = false;
            }
            if (tL_error != null) {
                jj.c0(this.currentAccount, tL_error, this, tLObject2, new Object[0]);
            }
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                getMessagesController().j4(updates.users, false);
                getMessagesController().c4(updates.chats, false);
            }
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
            if (M0 != null) {
                if (z2 && !z3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                M0.in_news = z5;
                if (z3) {
                    M0.left = true;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(M0);
                getMessagesStorage().j1(null, arrayList, true, true);
                this.e = M0;
            }
            if (z3) {
                getMessagesController().V(3, -j, false);
            }
            getNotificationCenter().k(jn7.Q, Long.valueOf(j));
            getMessagesController().h5(null);
            getNotificationCenter().k(jn7.r, new Object[0]);
            jn7 notificationCenter = getNotificationCenter();
            int i2 = uc7.r5;
            notificationCenter.k(2, 8192);
            if (!isFinishing()) {
                if (z4) {
                    i = 2131752496;
                } else if (z3) {
                    i = 2131752279;
                } else if (z2) {
                    i = 2131752280;
                } else {
                    i = 2131752498;
                }
                Yb(i);
            }
        }
        if (this.E0 != null) {
            Wb(false, true);
            Pc(false);
        }
    }

    public final void p9(java.lang.String r9, android.text.style.CharacterStyle r10, defpackage.r47 r11, defpackage.wb2 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.p9(java.lang.String, android.text.style.CharacterStyle, r47, wb2, int, int):void");
    }

    public final void pa(final CharacterStyle characterStyle, final String str, boolean z, final wb2 wb2Var, final r47 r47Var) {
        TLRPC.Message message;
        if (z) {
            int i = -1;
            if (str.startsWith("@")) {
                if (wb2Var != null) {
                    wb2Var.i3(-1);
                }
                String substring = str.substring(1);
                cq1 aa = aa(wb2Var, characterStyle);
                TLObject c2 = getMessagesController().c2(substring);
                pm1 pm1Var = new pm1(this, aa, wb2Var, substring, characterStyle);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                aa.b = new ul1(this, getConnectionsManager().sendRequest(checkusername, new in0(this, c2, pm1Var, substring, aa, (byte) 4)), (byte) 6);
                aa.d();
                return;
            } else if (characterStyle == null) {
                nx0 nx0Var = new nx0(1, (vnb) this.Ba, (Context) getParentActivity(), false);
                nx0Var.J();
                if (str.startsWith("video?")) {
                    i = Utilities.z(str).intValue();
                }
                final int i2 = i;
                if (i2 >= 0) {
                    nx0Var.P = hl.g0(i2, false, false);
                    nx0Var.Q = false;
                } else {
                    nx0Var.P = m01.d(str, true);
                    nx0Var.Q = false;
                    nx0Var.R = true;
                }
                CharSequence[] charSequenceArr = (a8() || !(r47Var == null || (message = r47Var.k) == null || !message.noforwards)) ? new CharSequence[]{ob6.M0(2131747544, null)} : new CharSequence[]{ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        zu1.this.p9(str, characterStyle, r47Var, wb2Var, i2, i3);
                    }
                };
                nx0Var.M = charSequenceArr;
                nx0Var.L = onClickListener;
                nx0Var.I0 = new o1(wb2Var, (byte) 12);
                showDialog(nx0Var);
                return;
            } else {
                if (wb2Var != null) {
                    wb2Var.i3(-1);
                }
                l6(wb2Var, r47Var, characterStyle, str);
                return;
            }
        }
        Z9(r47Var, false, false);
        String c = m01.c(str);
        if (c != null) {
            String lowerCase = c.toLowerCase();
            if (!xc2.O(lowerCase, this.e) && !lbc.t(lowerCase, this.f)) {
                if (str.startsWith("@")) {
                    getMessagesController().H3(lowerCase, this, 0, aa(wb2Var, characterStyle));
                    return;
                } else {
                    Pa(0, str, characterStyle, wb2Var, false);
                    return;
                }
            }
            qq1 qq1Var = this.p1;
            if (qq1Var != null) {
                qq1Var.e(false, false);
            } else {
                Qb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Pa(0, str, characterStyle, wb2Var, false);
        } else {
            int i3 = this.g4;
            if (i3 != 1 && i3 != 2 && i3 != 7) {
                if (str.contains("@")) {
                    presentFragment(new ue5(str, this.resourceProvider));
                    return;
                } else {
                    ta(str, false);
                    return;
                }
            }
            this.n9.O(str);
            if (this.g4 != 7) {
                finishFragment();
            }
        }
    }

    public final boolean pb() {
        nr1 nr1Var = this.a0;
        if (nr1Var != null && nr1Var.X0() && !this.a0.d1 && !MediaController.z().J()) {
            this.o5 = true;
            nr1 nr1Var2 = this.a0;
            this.p5 = nr1Var2.P;
            this.q5 = nr1Var2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void pc(boolean z) {
        ny nyVar = this.rc;
        if (z) {
            if (nyVar == null) {
                ny nyVar2 = new ny(this, (byte) 2);
                this.rc = nyVar2;
                hl.d3(nyVar2, 100L);
                return;
            }
            return;
        }
        if (nyVar != null) {
            hl.r(nyVar);
        }
        this.rc = null;
        this.qc = false;
        fd(true);
    }

    public final void pd() {
        d6();
        String str = this.J3;
        if (str != null) {
            this.s2.e.setText(ob6.a0(null, null, 2131749108, str));
            this.a4.setEmptyView(this.s2);
            return;
        }
        this.a4.setEmptyView(null);
        this.s2.setVisibility(8);
    }

    @Override
    public final boolean q(final uj3 uj3Var, final ArrayList arrayList, final CharSequence charSequence, boolean z, final boolean z2, final int i, final int i2, tzb tzbVar) {
        int i3;
        nr1 nr1Var;
        boolean z3;
        nr1 nr1Var2;
        r47 r47Var;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        v47 v47Var = this.x5;
        SparseArray[] sparseArrayArr = this.o6;
        int i8 = 0;
        int i9 = 1;
        if (((v47Var == null && (!uj3Var.P0 || this.F5 == null)) || (uj3Var.P0 && this.F5 == null)) && this.z5 == null && sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
            return false;
        }
        final ArrayList arrayList2 = new ArrayList();
        r47 r47Var2 = this.z5;
        if (r47Var2 != null) {
            m47 m47Var = this.A5;
            if (m47Var != null) {
                arrayList2.addAll(m47Var.d);
            } else {
                arrayList2.add(r47Var2);
            }
        } else {
            for (int i10 = 1; i10 >= 0; i10--) {
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < sparseArrayArr[i10].size(); i11++) {
                    arrayList3.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                }
                Collections.sort(arrayList3);
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    r47 r47Var3 = (r47) sparseArrayArr[i10].get(((Integer) arrayList3.get(i12)).intValue());
                    if (r47Var3 != null) {
                        arrayList2.add(r47Var3);
                    }
                }
            }
        }
        int i13 = 0;
        while (true) {
            int i14 = 8;
            if (i13 < arrayList.size()) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((if7) arrayList.get(i13)).a));
                if (M0 != null) {
                    int i15 = i8;
                    while (i15 < arrayList2.size()) {
                        r47 r47Var4 = (r47) arrayList2.get(i15);
                        to3 to3Var = r7a.J;
                        boolean t = xc2.t(M0);
                        boolean p = xc2.p(M0);
                        boolean u = xc2.u(M0);
                        boolean l = xc2.l(M0);
                        xc2.m(M0);
                        boolean r = xc2.r(M0);
                        boolean s = xc2.s(M0);
                        boolean v = xc2.v(M0);
                        boolean o = xc2.o(M0);
                        if (!r47Var4.s4() && !r47Var4.J2() && !r47.t3(r47Var4.k) && !(r47.n1(r47Var4.k) instanceof TLRPC.TL_messageMediaGame)) {
                            i4 = i8;
                        } else {
                            i4 = i9;
                        }
                        if (!t && i4 != 0) {
                            if (xc2.P(i14, M0)) {
                                i6 = 4;
                                z4 = i8;
                            } else {
                                i7 = i8;
                                i6 = i9;
                                z4 = i7;
                            }
                        } else {
                            if (!p) {
                                TLRPC.Message message = r47Var4.k;
                                int i16 = i8;
                                i5 = i16;
                                if (message.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    i5 = i16;
                                    i5 = i16;
                                    if (!r47.K4(message) && i4 == 0) {
                                        if (xc2.P(16, M0)) {
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
                            if (!o && r47Var4.I3()) {
                                if (xc2.P(18, M0)) {
                                    i6 = 19;
                                    z4 = i5;
                                } else {
                                    i6 = 20;
                                    z4 = i5;
                                }
                            } else if (!u && r47.K4(r47Var4.k) && i4 == 0) {
                                if (xc2.P(17, M0)) {
                                    i6 = 9;
                                    z4 = i5;
                                } else {
                                    i6 = 11;
                                    z4 = i5;
                                }
                            } else {
                                i9 = 21;
                                if (!r) {
                                    TLRPC.MessageMedia messageMedia = r47Var4.k.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        if (xc2.P(10, M0)) {
                                            i6 = 6;
                                            z4 = i5;
                                        } else {
                                            i6 = 3;
                                            z4 = i5;
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                        i7 = i5;
                                        if (!xc2.P(10, M0)) {
                                            i6 = 22;
                                            z4 = i5;
                                        }
                                        i6 = i9;
                                        z4 = i7;
                                    }
                                }
                                if (!v && r47.Q4(r47Var4.k)) {
                                    if (xc2.P(20, M0)) {
                                        i6 = 13;
                                        z4 = i5;
                                    } else {
                                        i6 = 14;
                                        z4 = i5;
                                    }
                                } else if (!s && r47.i4(r47Var4.k)) {
                                    if (xc2.P(21, M0)) {
                                        i6 = 15;
                                        z4 = i5;
                                    } else {
                                        i6 = 16;
                                        z4 = i5;
                                    }
                                } else if (!l && (r47Var4.k.media instanceof TLRPC.TL_messageMediaDocument) && i4 == 0) {
                                    if (xc2.P(19, M0)) {
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
                            jj.q0(i6, null, uj3Var);
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
                if (!uj3Var.P0 && (arrayList.size() > 1 || ((if7) arrayList.get(i17)).a == getUserConfig().e() || charSequence != null || i != 0 || !z2)) {
                    int i18 = this.currentAccount;
                    int size = arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0);
                    pcc pccVar = new pcc() {
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
                            uj3 uj3Var2 = uj3Var;
                            if (uj3Var2.k2) {
                                uj3Var2.E2 = null;
                            }
                            zu1 zu1Var = zu1.this;
                            if (zu1Var.z5 != null) {
                                zu1Var.z5 = null;
                                zu1Var.A5 = null;
                            } else {
                                for (int i21 = 1; i21 >= 0; i21--) {
                                    zu1Var.p6[i21].clear();
                                    zu1Var.q6[i21].clear();
                                    zu1Var.o6[i21].clear();
                                }
                                zu1Var.C7();
                                zu1Var.gd(0, true);
                                zu1Var.Gd(false);
                            }
                            zu1Var.x5 = null;
                            zu1Var.E7(false);
                            int i22 = 0;
                            while (true) {
                                arrayList4 = arrayList;
                                int size2 = arrayList4.size();
                                arrayList5 = arrayList2;
                                if (i22 >= size2) {
                                    break;
                                }
                                long j = ((if7) arrayList4.get(i22)).a;
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
                                    p7a b = p7a.b(charSequence2.toString(), j, null, null, null, true, null, null, null, z5, i23, i24, null, false);
                                    j = j;
                                    i20 = i23;
                                    i19 = i24;
                                    b.K = zu1Var.X6();
                                    if (l2 == null) {
                                        longValue2 = 0;
                                    } else {
                                        longValue2 = l2.longValue();
                                    }
                                    b.Q = longValue2;
                                    b.R = zu1Var.k7();
                                    b.T = zu1Var.y5;
                                    zu1Var.getSendMessagesHelper().q0(b);
                                } else {
                                    i19 = i24;
                                    i20 = i23;
                                    z5 = z6;
                                }
                                r7a sendMessagesHelper = zu1Var.getSendMessagesHelper();
                                if (l2 == null) {
                                    longValue = 0;
                                } else {
                                    longValue = l2.longValue();
                                }
                                sendMessagesHelper.p0(arrayList5, j, false, false, z5, i20, i19, null, -1, longValue, zu1Var.k7(), zu1Var.y5);
                                i22++;
                            }
                            uj3Var2.finishFragment();
                            zu1Var.i6();
                            if (zu1Var.N3 != null) {
                                if (arrayList4.size() == 1) {
                                    if (!d31.b0(zu1Var).h0(arrayList5.size(), ((if7) arrayList4.get(0)).a)) {
                                        zu1Var.N3.m(((if7) arrayList4.get(0)).a, Integer.valueOf(arrayList5.size()), 53);
                                        return;
                                    }
                                    return;
                                }
                                zu1Var.N3.k(0L, 53, Integer.valueOf(arrayList5.size()), Integer.valueOf(arrayList4.size()), null, null);
                            }
                        }
                    };
                    Pattern pattern = jj.a;
                    HashSet hashSet = new HashSet();
                    int size2 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj = arrayList.get(i19);
                        i19++;
                        hashSet.add(Long.valueOf(((if7) obj).a));
                    }
                    return !jj.Z(i18, new ArrayList(hashSet), size, pccVar);
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
                if7 if7Var = (if7) arrayList.get(i3);
                long j = if7Var.a;
                if (j == this.l6 && c() == if7Var.b && this.g4 != 2) {
                    ArrayList arrayList4 = new ArrayList(getParentLayout().getFragmentStack());
                    if (!arrayList4.isEmpty() && c00.g(1, arrayList4) == uj3Var) {
                        uj3Var.finishFragment();
                    } else {
                        int indexOf = arrayList4.indexOf(uj3Var);
                        if (indexOf > 0) {
                            while (indexOf < arrayList4.size()) {
                                if (indexOf == arrayList4.size() - 1) {
                                    ((e) arrayList4.get(indexOf)).finishFragment();
                                } else {
                                    uj3Var.removeSelfFromStack();
                                }
                                indexOf++;
                            }
                        }
                    }
                    ea(false);
                    if (uj3Var.P0 && (r47Var = this.F5) != null) {
                        ec(r47Var, this.D5);
                    } else {
                        cc(arrayList2);
                    }
                    if (hl.O1()) {
                        C7();
                        z3 = false;
                        gd(0, true);
                    } else {
                        z3 = false;
                    }
                    Gd(z3);
                    if (this.Pb && (nr1Var2 = this.a0) != null) {
                        nr1Var2.p1();
                        nr1 nr1Var3 = this.a0;
                        nr1Var3.U0 = z3;
                        my1 my1Var = nr1Var3.V0;
                        if (my1Var != null) {
                            my1Var.s(z3);
                        }
                        this.Pb = z3;
                        return true;
                    }
                    return true;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", this.i6);
                if (wf3.B(j)) {
                    bundle.putInt("enc_id", (int) (j & 4294967295L));
                } else {
                    if (wf3.D(j)) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    if (!getMessagesController().C(bundle, uj3Var, null, null)) {
                        return true;
                    }
                }
                if (getMessagesController().B2(if7Var.a)) {
                    bundle.putInt("chatMode", 8);
                    if (!getMessagesController().C2(if7Var.a)) {
                        bundle.putBoolean("isSubscriberSuggestions", true);
                    }
                }
                bundle.putBoolean("historyPreloaded", false);
                B4();
                zu1 zu1Var = new zu1(bundle);
                if (if7Var.b != 0 || tzbVar != null) {
                    ro4.a(zu1Var, if7Var);
                    uj3Var.removeSelfFromStack();
                }
                if (presentFragment(zu1Var, true)) {
                    if (uj3Var.P0 && this.F5 != null) {
                        nr1 nr1Var4 = this.a0;
                        if (nr1Var4 != null && (nr1Var = zu1Var.a0) != null) {
                            nr1Var.setFieldText(nr1Var4.getFieldText());
                        }
                        m47 m47Var2 = this.B5;
                        if (m47Var2 != null) {
                            zu1Var.B5 = m47Var2;
                        } else {
                            r47 r47Var5 = this.F5;
                            if (r47Var5 != null) {
                                zu1Var.B5 = T6(r47Var5.c1());
                            }
                        }
                        r47 r47Var6 = this.C5;
                        if (r47Var6 != null) {
                            zu1Var.C5 = r47Var6;
                        } else {
                            r47 r47Var7 = this.m4;
                            if (r47Var7 != null) {
                                zu1Var.C5 = r47Var7;
                            }
                        }
                        zu1Var.cc = new hm1(this, (byte) 22);
                        zu1Var.ec(this.F5, this.D5);
                    } else {
                        zu1Var.cc(arrayList2);
                    }
                    if (zu1Var.l6 == a() && !hl.O1()) {
                        removeSelfFromStack();
                        return true;
                    }
                    return true;
                }
                uj3Var.finishFragment();
                return true;
            }
        }
    }

    public final boolean q5(View view) {
        CharSequence slowModeTimer = this.a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            vc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void q6(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.q6(int, java.lang.Object[]):void");
    }

    public final r47 q7() {
        View view = this.v9;
        if (view instanceof wb2) {
            return ((wb2) view).getMessageObject();
        }
        if (view instanceof dl1) {
            return ((dl1) view).getMessageObject();
        }
        return null;
    }

    public final void q8(int i, int i2, int i3, int i4) {
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
                    uc7 messagesController = getMessagesController();
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
                    messagesController.g3(j2, j3, false, 50, i6, 0, z2, i7, i8, 0, i9, j4, i10, i11, this.x4);
                } else {
                    c = 0;
                    j = 0;
                    uc7 messagesController2 = getMessagesController();
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
                    messagesController2.g3(j5, j6, false, 50, 0, 0, z3, i12, i13, 0, i14, j7, i15, i16, this.x4);
                }
            } else {
                c = 0;
                j = 0;
                if (this.d7 != 0 && !zArr[1]) {
                    this.Y6 = true;
                    arrayList.add(Integer.valueOf(this.n6));
                    uc7 messagesController3 = getMessagesController();
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
                    messagesController3.g3(j8, 0L, false, 50, i17, 0, z4, i18, i19, 0, i20, j9, i21, i22, this.x4);
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
                uc7 messagesController4 = getMessagesController();
                long j10 = this.d7;
                int i24 = iArr4[1];
                int i25 = iArr3[1];
                int i26 = this.classGuid;
                int i27 = this.g4;
                long j11 = this.s4;
                int i28 = this.C4;
                int i29 = this.n6;
                this.n6 = i29 + 1;
                messagesController4.g3(j10, 0L, false, 50, i24, 0, true, i25, i26, 1, i27, j11, i28, i29, this.x4);
                this.a8 = true;
            } else if (!zArr3[c]) {
                arrayList.add(Integer.valueOf(this.n6));
                uc7 messagesController5 = getMessagesController();
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
                messagesController5.g3(j12, j13, false, 50, i30, 0, true, i31, i32, 1, i33, j14, i34, i35, this.x4);
                this.a8 = true;
            }
        }
    }

    public final void q9(long j, boolean z) {
        if (!this.V4.isEmpty()) {
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
            edit.putInt("pin_" + this.l6, ((Integer) this.V4.get(0)).intValue()).commit();
            this.V4.clear();
            this.X4.clear();
            this.Z4 = 0;
            this.d5 = 0;
            this.e5 = 0;
            gd(0, true);
        }
        if (xc2.p0(this.e) && xc2.A(this.currentAccount, this.e, 24)) {
            if (j != 0) {
                jf7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new xd7(messagesStorage, -this.e.id, j, (byte) 2));
                getMessagesController().g0(j, 0, getMessagesController().j1(-this.e.id));
                getMessagesController().g4.s(this.e.id, j);
            }
        } else {
            getMessagesController().V(1, this.l6, z);
            jf7 messagesStorage2 = getMessagesStorage();
            long j2 = this.l6;
            messagesStorage2.getClass();
            messagesStorage2.H(new le7(messagesStorage2, j2, (byte) 0));
            qyb qybVar = getMessagesController().g4;
            qybVar.getClass();
            hl.c3(new dp2((Object) qybVar, -this.l6, true, (byte) 4));
        }
        this.e6.put(j, 0);
        l1c l1cVar = this.g2;
        if (l1cVar != null) {
            l1cVar.setAllTopicsHidden(false);
        }
        if (j == this.s4) {
            K5(false, null);
            this.D0.J(false);
        }
    }

    public final void qa(long j, final r47 r47Var, int i, final long j2, final int i2, final int i3, final r47 r47Var2) {
        int i4 = i;
        final TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = uc7.l1(M0);
        tL_messages_getDiscussionMessage.msg_id = i4;
        if (f11.a) {
            cc4.b("getDiscussionMessage chat = " + M0.id + " msg_id = " + i4);
        }
        this.dd = 0;
        this.ed = false;
        this.gd = null;
        this.hd = null;
        wq1 wq1Var = this.A0;
        if (wq1Var != null) {
            wq1Var.i1();
        }
        if (this.cd != -1) {
            getConnectionsManager().cancelRequest(this.cd, false);
        }
        if (this.bd != -1) {
            getConnectionsManager().cancelRequest(this.bd, false);
        }
        if (r47Var2 != null) {
            i4 = r47Var2.e1();
        }
        this.dd = i4;
        this.ed = false;
        this.fd = System.currentTimeMillis();
        wq1 wq1Var2 = this.A0;
        if (wq1Var2 != null) {
            wq1Var2.i1();
        }
        final int i5 = this.Zc + 1;
        this.Zc = i5;
        this.bd = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                zu1 zu1Var = zu1.this;
                hl.c3(new jj1(zu1Var, new Runnable(i5, i2, j2, tLObject, i3, r47Var2, tL_messages_getDiscussionMessage, M0, r47Var) {
                    public final int b;
                    public final int c;
                    public final TLObject d;
                    public final int e;
                    public final r47 f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat n;
                    public final r47 r;

                    {
                        this.d = tLObject;
                        this.e = r7;
                        this.f = r8;
                        this.h = r9;
                        this.n = r10;
                        this.r = r11;
                    }

                    @Override
                    public final void run() {
                        int i6;
                        final zu1 zu1Var2 = zu1.this;
                        if (this.b != zu1Var2.Zc) {
                            return;
                        }
                        zu1Var2.bd = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            zu1Var2.gd = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            zu1Var2.getMessagesController().j4(zu1Var2.gd.users, false);
                            zu1Var2.getMessagesController().c4(zu1Var2.gd.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = zu1Var2.gd;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i7 = 0; i7 < zu1Var2.gd.messages.size(); i7++) {
                                TLRPC.Message message = zu1Var2.gd.messages.get(i7);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i8 = this.c;
                        final int i9 = this.e;
                        final r47 r47Var3 = this.f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat = this.n;
                        final r47 r47Var4 = this.r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = zu1Var2.getMessagesController().m1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i9 > 0) {
                                tL_messages_getReplies.offset_id = i9;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i8 == 0) {
                                    i6 = 1;
                                } else {
                                    i6 = i8;
                                }
                                tL_messages_getReplies.offset_id = i6;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i10 = zu1Var2.ad + 1;
                            zu1Var2.ad = i10;
                            zu1Var2.cd = zu1Var2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    hl.c3(new so1(zu1.this, i10, tLObject3, tL_error2, i8, r47Var3, tL_messages_getDiscussionMessage2, chat, i9, r47Var4, (byte) 0));
                                }
                            });
                            return;
                        }
                        zu1Var2.Qa(zu1Var2.gd, zu1Var2.hd, i8, r47Var3, tL_messages_getDiscussionMessage2, chat, i9, r47Var4);
                    }
                }, (byte) 13));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.bd, this.classGuid);
    }

    public final int qb(defpackage.r47 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.qb(r47):int");
    }

    public final void qc(wb2 wb2Var, int i, int i2, int i3) {
        if (!this.C2.W || this.Xb != wb2Var || this.Yb != i3) {
            r47 messageObject = wb2Var.getMessageObject();
            if (messageObject != null && (r47.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) r47.m1(messageObject);
                if (r47.V4(tL_messageMediaPoll) && !r47.T4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        this.C2.t(ob6.M0(2131746886, null));
                        this.Xb = wb2Var;
                        this.Yb = i3;
                        this.C2.w(w7(wb2Var, i2), x7(wb2Var, i3), true);
                    }
                }
            }
            if (i == -1) {
                this.C2.t(ob6.M0(2131746885, null));
                this.Xb = wb2Var;
                this.Yb = i3;
                this.C2.w(w7(wb2Var, i2), x7(wb2Var, i3), true);
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
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.f.id));
                if (X1 != null) {
                    this.f = X1;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e.id));
                if (M0 != null) {
                    this.e = M0;
                } else {
                    return;
                }
            }
            qq1 qq1Var = this.p1;
            if (qq1Var != null) {
                qq1Var.b();
            }
        }
    }

    public final boolean r5() {
        CharSequence slowModeTimer = this.a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131745038, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0("SlowModeHint", null, 2131745039, slowModeTimer));
        c00.u(null, 2131747558, alertDialog$Builder, null);
        return false;
    }

    public final void r6(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.r6(int, java.lang.Object[]):void");
    }

    public final int r7(int i) {
        SparseIntArray sparseIntArray = this.j5;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 == -1) {
            int i3 = Cd;
            Cd = i3 + 1;
            sparseIntArray.put(i, i3);
            return i3;
        }
        return i2;
    }

    public final void r8(oj ojVar, Runnable runnable) {
        if (!this.isFinished) {
            if (oj.n(jxa.u(this.currentAccount, ojVar.a).m()).b < ojVar.b) {
                pj pjVar = ojVar.a;
                if (pjVar == pj.a) {
                    new dza(getParentActivity(), getResourceProvider(), ojVar.a(), 13, ro4.i(this.currentAccount, a()), null, a()).show();
                    return;
                } else if (pjVar == pj.b) {
                    new shb(getParentActivity(), getResourceProvider(), ojVar, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void r9(TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j;
        TLRPC.User user = this.X1.getAdapter().x0;
        int i = this.currentAccount;
        TLRPC.User user2 = this.f;
        if (user2 != null) {
            j = user2.id;
        } else {
            j = this.e.id;
        }
        gzc b = gzc.b(i, j, user.id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, k7(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
            return;
        }
        String E1 = uc7.s1(this.currentAccount).E1(user.restriction_reason);
        if (!TextUtils.isEmpty(E1)) {
            uc7.s1(this.currentAccount);
            uc7.f5(E1, this);
            return;
        }
        xw0 xw0Var = new xw0(getParentActivity(), getResourceProvider());
        xw0Var.B(false);
        xw0Var.C0 = true;
        xw0Var.m0 = getParentActivity();
        xw0Var.x(this, b);
        xw0Var.show();
    }

    public final void ra(boolean z) {
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
                    r47 r47Var = (r47) sparseArrayArr[i2].valueAt(i3);
                    if (r47Var.C4()) {
                        i = 3;
                    } else if (r47Var.S3()) {
                        if (r47Var.Y3()) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        if (i == 2) {
                            break;
                        }
                    } else if (r47Var.z3()) {
                        z2 = true;
                    }
                    i3++;
                }
                if (i == 2) {
                    break;
                }
            }
            wd2 wd2Var = this.va;
            if (wd2Var != null && wd2Var.d()) {
                this.va.setHiddenByScroll(true);
            }
            Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
            j.putInt("messagesCount", this.u6);
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            j.putBoolean("canSelectTopics", true);
            uj3 uj3Var = new uj3(j);
            uj3Var.E2 = this;
            presentFragment(uj3Var);
            return;
        }
        if (a8()) {
            if (a() > 0) {
                M0 = ob6.M0(2131750494, null);
            } else if (xc2.T(this.e) && !this.e.megagroup) {
                M0 = ob6.M0(2131750496, null);
            } else {
                M0 = ob6.M0(2131750495, null);
            }
        } else {
            M0 = ob6.M0(2131750497, null);
        }
        if (z) {
            kg5 kg5Var = this.z2;
            if (kg5Var == null) {
                int indexOfChild = this.m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    kg5Var = x4(310.0f, 1, indexOfChild + 1, false);
                    this.z2 = kg5Var;
                } else {
                    return;
                }
            }
            kg5Var.t(M0);
            this.z2.x(this.actionBar.getActionMode().j(11), true);
            return;
        }
        kg5 kg5Var2 = this.A2;
        if (kg5Var2 == null) {
            int indexOfChild2 = this.m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            kg5Var2 = x4(310.0f, 3, indexOfChild2 + 1, false);
            this.A2 = kg5Var2;
        }
        kg5Var2.t(M0);
        this.A2.x(this.e1.getForwardButton(), true);
    }

    public final void rb() {
        sb(false, null);
    }

    public final void rc(boolean z) {
        double d;
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= uc7.s1(this.currentAccount).k4.r2.f() * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!yac.h(this.currentAccount).p() && !uc7.s1(this.currentAccount).M3()) {
                int i3 = this.currentAccount;
                if (z) {
                    d = uc7.s1(i3).k4.x3.i;
                } else {
                    d = uc7.s1(i3).k4.y3.i;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(((float) d) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    d31 b0 = d31.b0(this);
                    if (z) {
                        i = 2131743457;
                    } else {
                        i = 2131751313;
                    }
                    String M0 = ob6.M0(i, null);
                    if (z) {
                        i2 = 2131743456;
                    } else {
                        i2 = 2131751312;
                    }
                    v21 I = b0.I(2131624205, M0, hl.G2(hl.N2(ob6.M0(i2, null), -1, 2, new il1(this, z, (byte) 1), null), spannableString, "%d"));
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
            d5(false);
            J5(true);
            this.f7 = 0L;
            this.C7 = false;
            df5.a(this.currentAccount).b(this.d4).a();
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
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    public final void s5(Runnable runnable, oj ojVar, boolean z) {
        if (ojVar != null && z) {
            tu0 tu0Var = new tu0(this, ojVar, runnable, (byte) 29);
            jxa u = jxa.u(this.currentAccount, ojVar.a);
            if (!u.e) {
                u.n(tu0Var, true, true);
                return;
            } else {
                tu0Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void s6(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.s6(int, java.lang.Object[]):void");
    }

    public final int s7(int i) {
        SparseIntArray sparseIntArray = this.i5;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 == -1) {
            int i3 = Cd;
            Cd = i3 + 1;
            sparseIntArray.put(i, i3);
            return i3;
        }
        return i2;
    }

    public final void s8(TLRPC.Document document) {
        this.L4.put(document, 0);
        r7a.B(this.currentAccount).t0(document, null, this.l6, null, null, null, this.D5, null, true, 0, 0, false, null, X6(), 0L, k7(), this.y5);
    }

    public final void s9(final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i, r47 r47Var, int i2, int i3, r47 r47Var2) {
        boolean z;
        int i4;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i5 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            this.ed = true;
            this.A0.i1();
            Bundle bundle = new Bundle();
            final long B0 = r47.B0(((r47) arrayList.get(0)).k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("historyPreloaded", z);
            zu1 zu1Var = new zu1(bundle);
            zu1Var.Ob(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i != 0) {
                zu1Var.d8 = i;
            }
            if (r47Var != null && (messageReplies = r47Var.k.replies) != null && (messageReplies2 = zu1Var.m4.k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (r47Var != null && (tL_messageReactions = r47Var.k.reactions) != null) {
                zu1Var.m4.k.reactions = tL_messageReactions;
            }
            gp6 gp6Var = new gp6(this, new boolean[]{false}, i2, zu1Var, (byte) 12);
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
                final int classGuid = zu1Var.getClassGuid();
                jn7.f(this.currentAccount).a(new bq1(this, classGuid, gp6Var, zu1Var), jn7.C);
                final int i7 = i4;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i8;
                        int i9;
                        zu1 zu1Var2 = zu1.this;
                        uc7 messagesController = zu1Var2.getMessagesController();
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
                        messagesController.U3(messages_messages2, size2, B0, 0L, 30, i8, 0, false, classGuid, i5, 0, 0, 0, i11, true, 0, ((r47) c00.g(1, arrayList)).e1(), 1, false, 0, true, zu1Var2.x4, null);
                    }
                });
                return;
            }
            gp6Var.run();
            return;
        }
        this.dd = 0;
        this.ed = false;
        this.A0.i1();
        if (r47Var2 != null) {
            wa(r47Var2);
        } else if (getParentActivity() != null) {
            d31.b0(this).t(ob6.M0(2131752300, null), this.Ba).j();
        }
    }

    public final void sa(int i) {
        boolean z;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        r47 r47Var;
        v47 v47Var = this.x5;
        if (v47Var != null && this.cb == null) {
            TLRPC.Peer peer = null;
            if (v47Var.c != null) {
                int i2 = this.currentAccount;
                TLRPC.WebPage webPage = this.Y5;
                CharSequence fieldText = this.a0.getFieldText();
                r47 r47Var2 = this.F5;
                if (r47Var2 == this.m4) {
                    r47Var = null;
                } else {
                    r47Var = r47Var2;
                }
                v47Var.e(i2, webPage, fieldText, r47Var, this.D5, this.H5);
            }
            if (!this.x5.c()) {
                this.Pb = this.a0.o3;
                Context context = this.m1.getContext();
                ll0 ll0Var = this.Q8;
                v47 v47Var2 = this.x5;
                TLRPC.User user = this.f;
                TLRPC.Chat chat = this.e;
                int i3 = this.currentAccount;
                xu1 xu1Var = this.Ba;
                ou1 ou1Var = this.D5;
                if (ou1Var != null && ou1Var.f) {
                    z = true;
                } else {
                    z = false;
                }
                ks1 ks1Var = new ks1(this, context, this, ll0Var, v47Var2, user, chat, i3, xu1Var, i, z);
                this.cb = ks1Var;
                this.x5.x = ks1Var;
                TLRPC.ChatFull chatFull = this.r8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ea) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ea.peers.get(0).peer;
                }
                this.cb.setSendAsPeer(peer);
                p5();
                this.m1.addView(this.cb);
                if (this.Pb) {
                    nr1 nr1Var = this.a0;
                    nr1Var.U0 = true;
                    my1 my1Var = nr1Var.V0;
                    if (my1Var != null) {
                        my1Var.s(true);
                    }
                    this.a0.h2();
                    this.S3 = true;
                }
                hl.g3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        hm1 hm1Var = this.Na;
        if (hm1Var != null) {
            hl.r(hm1Var);
        }
        nr1 nr1Var = this.a0;
        if (nr1Var != null && this.m1 != null && nr1Var.getAdjustPanLayoutHelper() != null && !this.a0.getAdjustPanLayoutHelper().f) {
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

    public final void sb(boolean z, hm1 hm1Var) {
        ArrayList arrayList;
        int i;
        if (this.A0.W1) {
            return;
        }
        this.wb = 0;
        this.xb = Integer.MIN_VALUE;
        this.b5 = 0;
        this.fc = 0;
        this.c5 = false;
        this.o9.l(0);
        if (this.W6[0] && this.Z7 == 0 && this.M7 == 0) {
            this.y1.d(false);
            if (this.C0.H0() == 0) {
                this.D9 = false;
                dd();
                db();
                Gd(false);
                return;
            }
            this.D0.O();
            ku1 ku1Var = this.jb;
            ku1Var.a = null;
            int i2 = 0;
            while (true) {
                arrayList = this.M6;
                if (i2 >= arrayList.size() || !((r47) arrayList.get(i2)).q4()) {
                    break;
                }
                i2++;
                z = false;
            }
            if (z && arrayList != null && !arrayList.isEmpty() && arrayList.get(i2) != null) {
                long c1 = ((r47) arrayList.get(i2)).c1();
                while (c1 != 0 && (i = i2 + 1) < arrayList.size() && c1 == ((r47) arrayList.get(i)).c1()) {
                    i2 = i;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i2 = Math.min(i2, arrayList.size() - 1);
            }
            tr1 tr1Var = this.o9;
            ku1Var.b = i2;
            ku1Var.d = 0;
            boolean z2 = !z;
            ku1Var.c = z2;
            tr1Var.k(i2, 0, z2, true);
            this.D9 = false;
            dd();
            return;
        }
        id idVar = this.ec;
        if (idVar != null) {
            idVar.dismiss();
        }
        fd(false);
        if (hm1Var != null) {
            hm1Var.run();
        } else {
            hb();
            id idVar2 = new id(3, this.Ba, getParentActivity());
            this.ec = idVar2;
            idVar2.setOnCancelListener(this.Ja);
            this.ec.q(1000L);
        }
        this.q9 = this.n6;
        this.s9 = false;
        this.r9 = 0;
        this.t9 = false;
        ArrayList arrayList2 = this.z6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.n6));
        hl.d3(new hm1(this, (byte) 28), 0L);
    }

    public final void sc(boolean z) {
        if (this.R != null) {
            if (!hl.O1() && !this.v4 && this.f == null) {
                Boolean bool = this.Tb;
                if (bool == null) {
                    bool = Boolean.valueOf(i86.e(360928));
                    this.Tb = bool;
                }
                if (bool.booleanValue()) {
                    this.Sb = z;
                    return;
                }
            }
            int i = 0;
            if (this.g6 && xea.c()) {
                if (z == this.Sb) {
                    return;
                }
                this.Sb = z;
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
                this.R.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new zp1(this, (byte) 3)).start();
                return;
            }
            this.Sb = z;
            FrameLayout frameLayout2 = this.R;
            if (!z) {
                i = 4;
            }
            frameLayout2.setVisibility(i);
        }
    }

    public final void sd() {
        nr1 nr1Var;
        if (this.T != null) {
            this.H0.setBackground(null);
            this.H0.setOnClickListener(null);
            boolean z = true;
            if (this.g4 == 3 && f7() == 2666000) {
                this.H0.setText(ob6.M0(2131753875, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                ad();
                zeb zebVar = this.s1;
                if (zebVar != null) {
                    zebVar.e();
                }
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null && !xc2.n(chat)) {
                    TLRPC.Chat chat2 = this.e;
                    if (!xc2.p(chat2) && !xc2.u(chat2) && !xc2.s(chat2) && !xc2.v(chat2) && !xc2.l(chat2) && !xc2.o(chat2) && !xc2.t(chat2)) {
                        TLRPC.Chat chat3 = this.e;
                        if (!chat3.gigagroup && (!xc2.T(chat3) || this.e.megagroup)) {
                            TLRPC.Chat chat4 = this.e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (xc2.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231129).mutate();
                                    int i = aob.Fi;
                                    mutate.setTint(getThemedColor(i));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i);
                                    mutate.setBounds(0, 0, hl.L(14.0f), hl.L(14.0f));
                                    zm2 zm2Var = new zm2(null, mutate, hl.L(-6.0f), hl.L(-6.0f));
                                    int L = hl.L(14.0f);
                                    int L2 = hl.L(14.0f);
                                    zm2Var.e = L;
                                    zm2Var.f = L2;
                                    int L3 = hl.L(14.0f);
                                    int L4 = hl.L(14.0f);
                                    zm2Var.h = L3;
                                    zm2Var.n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ".concat(ob6.M0(2131753574, null)));
                                    spannableStringBuilder.setSpan(new ho4(i, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(zm2Var, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i2 = aob.i6;
                                    yob.R(textView, aob.g0(0, aob.w0(null, i2, false)), null, yob.M(i2), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new ll1(this, (byte) 1));
                                } else {
                                    this.H0.setText(ob6.M0(2131749305, null));
                                }
                            } else {
                                boolean B1 = hl.B1(chat4.banned_rights);
                                TextView textView2 = this.H0;
                                if (B1) {
                                    textView2.setText(ob6.M0(2131745325, null));
                                } else {
                                    textView2.setText(ob6.a0("SendMessageRestricted", null, 2131745326, ob6.v(this.e.banned_rights.until_date)));
                                }
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            ad();
                            zeb zebVar2 = this.s1;
                            if (zebVar2 != null) {
                                zebVar2.e();
                            }
                        }
                    }
                }
                U5(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(ob6.M0(2131751094, null));
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        uh9.r("AwaitingEncryption", null, 2131753750, new Object[]{c00.k(new StringBuilder("<b>"), this.f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(ob6.M0(2131751093, null));
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
                    i5();
                    R4(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.s1 != null && (nr1Var = this.a0) != null && nr1Var.L0()) {
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
                this.a0.N0(false);
                if (getParentActivity() != null) {
                    hl.t1(getParentActivity().getCurrentFocus());
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
            s6 u = aVar.u();
            if (this.inMenuMode) {
                i = 8;
            } else {
                i = 0;
            }
            u.setVisibility(i);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z) {
        boolean z2;
        boolean z3;
        wq1 wq1Var;
        r47 r47Var;
        TLRPC.Message message;
        long j;
        gd0 gd0Var;
        float f;
        float f2;
        nr1 nr1Var;
        int i;
        float f3;
        super.setInPreviewMode(z);
        int i2 = 8;
        boolean z4 = true;
        if (this.f != null && this.q0 != null) {
            TLRPC.UserFull Y1 = getMessagesController().Y1(this.f.id);
            if (Y1 != null && Y1.phone_calls_available) {
                this.ia = !this.inPreviewMode;
                this.q0.e(0);
            } else {
                this.ia = false;
                this.q0.e(8);
            }
        }
        qq1 qq1Var = this.p1;
        float f4 = 0.0f;
        if (qq1Var != null) {
            qq1Var.setOccupyStatusBar(!z);
            qq1 qq1Var2 = this.p1;
            if (!this.inPreviewMode) {
                f3 = 52.0f;
            } else {
                f3 = 0.0f;
            }
            qq1Var2.setLayoutParams(tre.d(-2, -1.0f, 51, f3, 0.0f, 52.0f, 0.0f));
        }
        nr1 nr1Var2 = this.a0;
        if (nr1Var2 != null) {
            if (!z) {
                i = 0;
            } else {
                i = 4;
            }
            nr1Var2.setVisibility(i);
        }
        zeb zebVar = this.s1;
        if (zebVar != null) {
            if (this.r5 && !z && ((nr1Var = this.a0) == null || !nr1Var.o4)) {
                i2 = 0;
            }
            zebVar.setVisibility(i2);
        }
        fr1 fr1Var = this.X1;
        if (fr1Var != null) {
            ViewPropertyAnimator animate = fr1Var.animate();
            if (!this.a0.o4 && !isInPreviewMode()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            animate.alpha(f2).setInterpolator(k43.f).start();
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            if (!z) {
                gd0Var = new gd0(false);
            } else {
                gd0Var = null;
            }
            aVar.setBackButtonDrawable(gd0Var);
            s7 s7Var = this.j0;
            if (s7Var != null) {
                if (!z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                s7Var.setAlpha(f);
            }
            r6 r6Var = this.g0;
            if (r6Var != null) {
                if (!z) {
                    f4 = 1.0f;
                }
                r6Var.i = f4;
                s7 s7Var2 = r6Var.m;
                if (s7Var2 != null) {
                    s7Var2.setAlpha(f4);
                }
            }
        }
        wq1 wq1Var2 = this.A0;
        if (wq1Var2 != null) {
            int childCount = wq1Var2.getChildCount();
            int i3 = 0;
            while (true) {
                wq1Var = this.A0;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = wq1Var.getChildAt(i3);
                boolean z5 = childAt instanceof wb2;
                if (z5) {
                    r47Var = ((wb2) childAt).getMessageObject();
                } else if (childAt instanceof dl1) {
                    r47Var = ((dl1) childAt).getMessageObject();
                } else {
                    r47Var = null;
                }
                if (r47Var != null && (message = r47Var.k) != null && message.media_unread && message.mentioned) {
                    if (!r47.Q4(message) && !r47Var.g4()) {
                        int i4 = this.D6 - 1;
                        this.D6 = i4;
                        if (i4 <= 0) {
                            this.D6 = 0;
                            this.E6 = true;
                            mc(false);
                        } else {
                            this.y1.c(2, i4, true);
                        }
                        uc7 messagesController = getMessagesController();
                        int e1 = r47Var.e1();
                        if (xc2.T(this.e)) {
                            j = this.e.id;
                        } else {
                            j = 0;
                        }
                        messagesController.v3(j, e1, this.l6);
                        r47Var.k.media_unread = false;
                    }
                    if (z5) {
                        wb2 wb2Var = (wb2) childAt;
                        wb2Var.setHighlighted(false);
                        wb2Var.r3();
                    }
                }
                i3++;
            }
            wq1Var.setItemAnimator(null);
        }
        Pc(false);
        sd();
        hr1 hr1Var = this.m2;
        if (hr1Var != null) {
            if (!z && !this.mb) {
                z3 = true;
            } else {
                z3 = false;
            }
            hr1Var.setEnabled(z3);
        }
        hr1 hr1Var2 = this.o2;
        if (hr1Var2 != null) {
            if (!z && !this.mb) {
                z2 = true;
            } else {
                z2 = false;
            }
            hr1Var2.setEnabled(z2);
        }
        ms1 ms1Var = this.M2;
        if (ms1Var != null) {
            ms1Var.setEnabled(!isInPreviewMode());
        }
        nt1 nt1Var = this.m1;
        if (nt1Var != null) {
            if (this.inBubbleMode || this.mb || this.inPreviewMode) {
                z4 = false;
            }
            nt1Var.setOccupyStatusBar(z4);
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        boolean z;
        int i2;
        int i3;
        if (i == 0) {
            ia();
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
            ia();
            E5();
            xg8 xg8Var = this.yd;
            if (xg8Var != null) {
                xg8Var.setAnimatedVisibility(this.sd.e);
            }
        } else {
            int i6 = 8;
            if (i == 3) {
                fm0 fm0Var = this.td;
                float f3 = 1.0f - fm0Var.e;
                this.b1.setAlpha(f3);
                wz1 wz1Var = this.b1;
                if (f3 > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                wz1Var.setVisibility(i3);
                float f4 = 1.0f - fm0Var.e;
                l1c l1cVar = this.g2;
                if (l1cVar != null) {
                    l1cVar.setAlpha(f4);
                    l1c l1cVar2 = this.g2;
                    if (f4 <= 0.0f) {
                        i5 = 8;
                    }
                    l1cVar2.setVisibility(i5);
                }
            } else if (i == 4) {
                zc zcVar = this.Z3;
                fm0 fm0Var2 = this.ud;
                if (zcVar != null) {
                    float f5 = fm0Var2.e;
                    zcVar.setAlpha(f5);
                    zc zcVar2 = this.Z3;
                    if (f5 > 0.0f) {
                        i6 = 0;
                    }
                    zcVar2.setVisibility(i6);
                }
                if (fm0Var2.e < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jz1 jz1Var = this.Z;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                jz1Var.setVisibility(i2);
                x5();
                if (fm0Var2.e >= 1.0f) {
                    z2 = false;
                }
                wq1 wq1Var = this.A0;
                if (z2) {
                    i4 = 0;
                }
                wq1Var.setVisibility(i4);
                E5();
                H5();
                G5();
                this.glassEngine.g();
            } else if (i == 5) {
                w5();
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.setSearchFactor(f);
                }
            } else if (i == 6) {
                B5();
            }
        }
    }

    public final void t5() {
        if (this.O3 != null) {
            return;
        }
        ls1 ls1Var = new ls1(this, getParentActivity(), this, this.Ba);
        this.O3 = ls1Var;
        this.m1.addView(ls1Var, 17, tre.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void t6(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.t6(int, java.lang.Object[]):void");
    }

    public final float t7(float f) {
        zu1 zu1Var = this.Aa;
        if (zu1Var != null) {
            this = zu1Var;
        }
        wz1 wz1Var = this.b1;
        if (wz1Var == null) {
            return 0.0f;
        }
        return wz1Var.c(f);
    }

    public final void t8(TLRPC.Document document) {
        this.L4.put(document, 0);
        r7a.B(this.currentAccount).t0(document, null, this.l6, null, null, null, this.D5, null, true, 0, 0, false, null, X6(), 0L, k7(), this.y5);
    }

    public final void t9(long j, long j2) {
        wp0.b(this.currentAccount).h(j, j2, false);
        this.Cc = null;
    }

    public final void ta(String str, boolean z) {
        boolean z2;
        kr1 kr1Var;
        s7 s7Var;
        int i;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                d6();
                kg5 kg5Var = this.K1;
                if (kg5Var != null && kg5Var.W) {
                    kg5Var.f(true);
                    z2 = true;
                } else {
                    z2 = false;
                }
                kg5 kg5Var2 = this.L1;
                if (kg5Var2 != null && kg5Var2.W) {
                    kg5Var2.f(true);
                    z2 = true;
                }
                if (z2) {
                    hl.d3(new hl1(this, str, (byte) 3), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                d5(true);
                if (!this.actionBar.o0) {
                    this.vd.a(true, true);
                    s7 s7Var2 = this.j0;
                    if (s7Var2 != null) {
                        s7Var2.setVisibility(8);
                    }
                    r6 r6Var = this.g0;
                    if (r6Var != null) {
                        r6Var.e(8);
                    }
                    yq2 yq2Var = this.f0;
                    if (yq2Var != null) {
                        yq2Var.b(false);
                    }
                    if ((this.s4 == 0 || (i = this.g4) == 3 || i == 8) && (s7Var = this.k0) != null) {
                        s7Var.setVisibility(0);
                    }
                    s7 s7Var3 = this.p0;
                    if (s7Var3 != null && this.ha) {
                        s7Var3.setVisibility(8);
                    }
                    r6 r6Var2 = this.q0;
                    if (r6Var2 != null && this.ia) {
                        r6Var2.e(8);
                    }
                    s7 s7Var4 = this.l0;
                    if (s7Var4 != null) {
                        s7Var4.setVisibility(8);
                    }
                    s7 s7Var5 = this.m0;
                    if (s7Var5 != null) {
                        s7Var5.setVisibility(8);
                    }
                    this.r0 = true;
                    nd(0, 0, -1);
                    Pc(false);
                }
                zr1 zr1Var = this.D1;
                if (zr1Var != null && zr1Var.F > 0.5f) {
                    zr1Var.g(false);
                }
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z && (!xc2.V(this.e) || !xc2.t0(this.e) || this.J3 == null)) {
                    this.G1 = (byte) 0;
                } else {
                    this.G1 = (byte) 2;
                }
                this.k5 = false;
                int i2 = this.d4;
                int i3 = this.currentAccount;
                if (i2 == 3) {
                    df5.a(i3).b(3).a();
                } else {
                    df5 a = df5.a(i3);
                    a.b.a();
                    a.c.a();
                }
                ir1 ir1Var = this.F1;
                if (ir1Var != null) {
                    ir1Var.h.clear();
                }
                s7 s7Var6 = this.k0;
                if (s7Var6 != null) {
                    this.Yc = true;
                    s7Var6.G(false);
                    this.Yc = false;
                }
                s7 s7Var7 = this.k0;
                if (s7Var7 != null) {
                    s7Var7.setSearchFieldCaption(null);
                    this.k0.P(str, false);
                    this.k0.setSearchFieldHint(ob6.M0(2131745491, null));
                }
                getMediaDataController().Z1(this.I3, this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, false, this.F3);
                gd(0, true);
                this.s2.e(true, true);
                nc(true);
                kr1 kr1Var2 = this.E1;
                if (kr1Var2 != null) {
                    kr1Var2.b(!contains);
                    pd();
                }
                if ((contains || z) && this.J3 != null && (kr1Var = this.E1) != null) {
                    int currentPosition = kr1Var.a.getCurrentPosition();
                    byte b = this.G1;
                    if (currentPosition != b) {
                        this.E1.a.e(b, b);
                    }
                }
                df5.a(this.currentAccount).c(this.J3);
                this.I1.f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof hv1) {
                    ((hv1) currentView).a.rd(this.J3);
                }
            }
        }
    }

    public final void tb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.tb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void tc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = ob6.M0(2131752638, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752639, null);
        alertDialog$Builder.j(ob6.M0(2131746048, null), new el1(this, (byte) 6));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
    }

    public final void td() {
        boolean z;
        int i;
        int i2;
        j47 j47Var;
        int i3 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.o6;
        if (i3 == 0) {
            ArrayList<r47> arrayList = new ArrayList<>();
            for (int i4 = 0; i4 < sparseArrayArr.length; i4++) {
                for (int i5 = 0; i5 < sparseArrayArr[i4].size(); i5++) {
                    r47 r47Var = (r47) sparseArrayArr[i4].valueAt(i5);
                    if (r47Var.z2()) {
                        m47 v7 = v7(r47Var);
                        if (v7 != null) {
                            j47Var = v7.d(r47Var);
                        } else {
                            j47Var = null;
                        }
                        if (j47Var != null) {
                            if (!j47Var.h) {
                            }
                        }
                    }
                    arrayList.add(r47Var);
                }
            }
            gs1 gs1Var = this.Mb;
            if (gs1Var != null) {
                gs1Var.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Mb.getSelectedReactions().isEmpty();
                z = !isEmpty;
                gs1 gs1Var2 = this.Mb;
                if (isEmpty) {
                    i2 = 2131745600;
                } else {
                    i2 = 2131745599;
                }
                gs1Var2.setHint(ob6.M0(i2, null));
                hl.d3(new ny(this, (byte) 3), 120L);
            } else {
                z = !i49.f(arrayList).isEmpty();
            }
            s7 j = this.actionBar.q(null).j(28);
            if (j != null) {
                if (z) {
                    i = 2131231902;
                } else {
                    i = 2131231904;
                }
                e29 e29Var = j.y;
                if (e29Var != null && j.E != i) {
                    j.E = i;
                    hl.L3(e29Var, i);
                }
            }
        }
        if (this.va != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                arrayList2.add((r47) sparseArray.valueAt(i6));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                arrayList2.add((r47) sparseArray2.valueAt(i7));
            }
            this.va.setSelectedMessages(arrayList2);
        }
    }

    public final void u5(boolean z) {
        long j;
        if (System.currentTimeMillis() - this.wc > 1000) {
            z = true;
        }
        hm1 hm1Var = this.xc;
        hl.r(hm1Var);
        if (z) {
            j = 0;
        } else {
            j = 150;
        }
        hl.d3(hm1Var, j);
    }

    public final void u6(java.lang.Object... r88) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.u6(java.lang.Object[]):void");
    }

    public final float u7(h1c h1cVar) {
        float f;
        l1c l1cVar = this.g2;
        if (l1cVar != null) {
            float L = hl.L(7.0f);
            float h = l1cVar.h(h1cVar);
            if (h1cVar == h1c.b) {
                f = 64.0f;
            } else {
                f = 36.0f;
            }
            return (hl.L(f) + L) * h;
        }
        return 0.0f;
    }

    public final void u8(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nza.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public final void u9(r47 r47Var, Long l, Runnable runnable) {
        jxa.v(this.currentAccount, false).k0(r47Var, l.longValue(), runnable, false);
    }

    public final boolean ua(String str, wb2 wb2Var, CharacterStyle characterStyle, int i, int i2) {
        zu1 zu1Var;
        rm1 rm1Var;
        boolean z;
        zu1 zu1Var2;
        Integer num;
        int parseInt;
        int i3;
        Integer num2;
        TLRPC.TL_forumTopic f;
        if (this.e == null || str == null || this.g4 != 0) {
            return false;
        }
        if (wb2Var != null && (characterStyle != null || i2 != 1)) {
            zu1Var = this;
            rm1Var = new rm1(zu1Var, i, i2, characterStyle, wb2Var);
        } else {
            zu1Var = this;
            rm1Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (xc2.K(zu1Var.e, false) != null) {
                try {
                    if (Dd == null) {
                        Dd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Ed = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Dd.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z = false;
                        try {
                            if (xc2.O(matcher.group(2), zu1Var.e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g = ih8.g(parse);
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
                                if (xc2.c0(zu1Var.e) && i3 != zu1Var.c()) {
                                    return false;
                                }
                                zu1Var.L7 = true;
                                if (zu1Var.g4 == 2) {
                                    zu1Var.n9.c0(parseInt);
                                    zu1Var.finishFragment();
                                    return true;
                                }
                                int U = LaunchActivity.U(parse);
                                zu1Var.Q7 = U;
                                if (U >= 0) {
                                    zu1Var.R7 = parseInt;
                                }
                                zu1Var.tb(parseInt, i, true, 0, false, 0, num, g, rm1Var);
                                return true;
                            }
                            zu1Var2 = zu1Var;
                        } catch (Exception e) {
                            e = e;
                            cc4.g(e, true);
                            return z;
                        }
                    } else {
                        zu1Var2 = zu1Var;
                        z = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Ed.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (xc2.O(matcher2.group(2), zu1Var2.e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        zu1Var2.y8 = queryParameter2;
                                        zu1Var2.a5(true);
                                        return true;
                                    }
                                    return z;
                                }
                                return z;
                            }
                            return z;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return z;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (xc2.O(lowerCase, zu1Var2.e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (zu1Var2.g4 == 2) {
                            zu1Var2.n9.c0(intValue3);
                            zu1Var2.finishFragment();
                            return true;
                        }
                        zu1Var2.tb(intValue3, i, true, 0, false, 0, null, null, rm1Var);
                        return true;
                    }
                    return z;
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                }
            } else {
                zu1 zu1Var3 = zu1Var;
                try {
                    Pattern pattern = Fd;
                    if (pattern == null) {
                        pattern = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                        Fd = pattern;
                    }
                    Matcher matcher3 = pattern.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt2 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != zu1Var3.e.id || parseInt2 == 0) {
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
                    byte[] g2 = ih8.g(parse3);
                    if (intValue6 != 0 || intValue7 != 0 || intValue8 != 0) {
                        return false;
                    }
                    if (xc2.c0(zu1Var3.e) && (f = zu1Var3.getMessagesController().g4.f(parseLong, parseInt2)) != null) {
                        TLRPC.TL_forumTopic tL_forumTopic = zu1Var3.r4;
                        if (tL_forumTopic == null || tL_forumTopic.id != f.id) {
                            return false;
                        }
                        return true;
                    }
                    zu1Var3.L7 = true;
                    if (zu1Var3.g4 == 2) {
                        zu1Var3.n9.c0(parseInt2);
                        zu1Var3.finishFragment();
                        return true;
                    }
                    zu1Var3.tb(parseInt2, i, true, 0, false, 0, num2, g2, rm1Var);
                    return true;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.z(parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.A(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.z(parse4.getQueryParameter("thread")).intValue();
            long j = zu1Var.e.id;
            if (longValue != j || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                qa(j, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            zu1 zu1Var4 = zu1Var;
            zu1Var4.L7 = true;
            if (zu1Var4.g4 == 2) {
                zu1Var4.n9.c0(intValue9);
                zu1Var4.finishFragment();
                return true;
            }
            zu1Var4.tb(intValue9, i, true, 0, false, 0, null, null, rm1Var);
            return true;
        }
    }

    public final void ub(java.lang.CharSequence r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.ub(java.lang.CharSequence, boolean):void");
    }

    public final void uc() {
        String str;
        if (this.vc != null) {
            return;
        }
        if (this.F5 != null) {
            str = getMessagesController().c1(this.F5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = ob6.M0(2131743466, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0(null, null, 2131743467, str));
        alertDialog$Builder.j(ob6.M0(2131751300, null), new el1(this, (byte) 15));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new el1(this, (byte) 16));
        idVar.setOnDismissListener(new kl1(this, (byte) 7));
        this.vc = alertDialog$Builder.o();
    }

    public final void ud() {
        vz1 vz1Var;
        r6 r6Var;
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            if (this.g4 != 1 && !this.v4 && !g8()) {
                vz1Var = null;
            } else {
                vz1Var = this.y1;
            }
            nr1Var.setSideButtonsForAttach(vz1Var);
            boolean g8 = g8();
            if (this.Jb != g8) {
                this.Jb = g8;
                s7 s7Var = this.j0;
                if ((s7Var != null && s7Var.getVisibility() == 0) || ((r6Var = this.g0) != null && r6Var.l == 0)) {
                    org.telegram.ui.ActionBar.a aVar = this.actionBar;
                    if (!aVar.o0 && !aVar.z()) {
                        if (this.a0.L0() && TextUtils.isEmpty(this.a0.getSlowModeTimer()) && !g8()) {
                            r6 r6Var2 = this.g0;
                            if (r6Var2 != null) {
                                r6Var2.e(0);
                            }
                            s7 s7Var2 = this.j0;
                            if (s7Var2 != null) {
                                s7Var2.setVisibility(8);
                            }
                            yq2 yq2Var = this.f0;
                            if (yq2Var != null) {
                                yq2Var.b(true);
                            }
                        } else {
                            r6 r6Var3 = this.g0;
                            if (r6Var3 != null) {
                                r6Var3.e(8);
                            }
                            s7 s7Var3 = this.j0;
                            if (s7Var3 != null) {
                                s7Var3.setVisibility(0);
                            }
                            yq2 yq2Var2 = this.f0;
                            if (yq2Var2 != null) {
                                yq2Var2.b(false);
                            }
                        }
                        qq1 qq1Var = this.p1;
                        if (qq1Var != null) {
                            qq1Var.l0 = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void v0(float f, int i) {
        if (i == 2 && f == 0.0f) {
            xg8 xg8Var = this.yd;
            if (xg8Var != null) {
                this.m1.removeView(xg8Var);
                this.yd = null;
            }
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.o1();
            }
        }
    }

    public final void v5() {
        int u7 = (int) (u7(h1c.c) + this.U.getInputBubbleHeight() + this.w.d() + hl.L(9.0f) + hl.L(7.0f));
        this.Z.setFadeZoneBottom(u7);
        int b = ete.b(hl.L(36.0f) + (this.m1.getMeasuredHeight() - u7), 0, this.m1.getMeasuredHeight());
        int measuredWidth = this.m1.getMeasuredWidth();
        Rect rect = Id;
        rect.set(0, 0, measuredWidth, b);
        rect.set(0, this.Xa, this.A0.getMeasuredWidth(), hl.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Ya) - u7));
    }

    public final void v6(int i, ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        zu1 zu1Var;
        int i2;
        zu1 zu1Var2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && zu1Var2.r5()) {
            int i3 = 0;
            while (true) {
                if (i3 < arrayList3.size()) {
                    q7a q7aVar = (q7a) arrayList3.get(i3);
                    if (q7aVar.m == null && q7aVar.k == null) {
                        break;
                    }
                    i3++;
                } else if (!TextUtils.isEmpty(((q7a) arrayList3.get(0)).d)) {
                    p7a b = p7a.b(((q7a) arrayList3.get(0)).d, zu1Var2.l6, zu1Var2.F5, zu1Var2.m4, null, false, ((q7a) arrayList3.get(0)).i, null, null, z, i, 0, null, false);
                    b.K = zu1Var2.X6();
                    r7a.B(zu1Var2.currentAccount).q0(b);
                }
            }
            int i4 = 0;
            while (i4 < arrayList3.size()) {
                q7a q7aVar2 = (q7a) arrayList3.get(i4);
                if (q7aVar2.m != null && q7aVar2.k == null) {
                    k5 accountInstance = zu1Var2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = q7aVar2.m;
                    HashMap hashMap = q7aVar2.n;
                    int i5 = i4;
                    r7a.R(i, zu1Var2.l6, 0L, zu1Var2.k7(), accountInstance, zu1Var2.D5, zu1Var2.F5, zu1Var2.m4, zu1Var2.X6(), hashMap, botInlineResult, null, zu1Var2, z);
                    arrayList2 = arrayList;
                    zu1Var = zu1Var2;
                    arrayList2.remove(i5);
                    i2 = i5 - 1;
                } else {
                    arrayList2 = arrayList3;
                    zu1Var = zu1Var2;
                    i2 = i4;
                }
                i4 = i2 + 1;
                zu1Var2 = zu1Var;
                arrayList3 = arrayList2;
            }
            ArrayList arrayList4 = arrayList3;
            zu1 zu1Var3 = zu1Var2;
            if (!arrayList4.isEmpty()) {
                zu1Var3.F6(((q7a) arrayList4.get(0)).d, ((q7a) arrayList4.get(0)).i);
                r7a.W(zu1Var3.getAccountInstance(), arrayList4, zu1Var3.l6, zu1Var3.F5, zu1Var3.m4, null, zu1Var3.D5, false, true, zu1Var3.H5, null, z, i, 0, ((q7a) arrayList4.get(0)).t, null, zu1Var3.X6(), 0L, false, 0L, zu1Var3.k7(), zu1Var3.y5, null, false);
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

    public final m47 v7(r47 r47Var) {
        if (r47Var.c1() != 0) {
            m47 m47Var = (m47) this.P6.f(r47Var.c1());
            if (m47Var == null || (m47Var.d.size() > 1 && m47Var.d(r47Var) != null)) {
                return m47Var;
            }
            return null;
        }
        return null;
    }

    public final void v8(int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z, do1 do1Var) {
        String str4;
        i3c i3cVar;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = getParentActivity();
            int i2 = iArr[0];
            gn1 gn1Var = new gn1(this, (byte) 19);
            String[] strArr = r3c.R1;
            if (parentActivity == null) {
                i3cVar = null;
            } else {
                i3c i3cVar2 = new i3c(parentActivity, str, str4, inputPeer, i2, richMessage, gn1Var);
                i3cVar2.O0(z);
                i3cVar2.M1 = this;
                i3cVar2.N1 = do1Var;
                if (getParentActivity() != null) {
                    showDialog(i3cVar2);
                }
                i3cVar = i3cVar2;
            }
            i3cVar.p0 = false;
            M5(false);
            SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
            int i3 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i3 > 0) {
                SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i3 - 1).apply();
                zd(true);
            }
        }
    }

    public final void v9(TLRPC.TL_error tL_error, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        jj.c0(this.currentAccount, tL_error, this, tL_messages_editMessage, new Object[0]);
    }

    public final void va(r47 r47Var) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = r47Var.k.peer_id;
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
        bundle.putInt("message_id", r47Var.L1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().C(bundle, this, null, null)) {
            presentFragment(new zu1(bundle));
        }
    }

    public final void vb(TLRPC.Chat chat, TLRPC.User user) {
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
                String M0 = ob6.M0(2131745494, null);
                SpannableString spannableString = new SpannableString(qd4.y(M0, " ", str));
                spannableString.setSpan(new ho4(aob.B8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                this.k0.setSearchFieldCaption(spannableString);
                this.X1.getAdapter().U(null, 0, null, false, true);
                this.k0.setSearchFieldHint(null);
                this.k0.o();
                ls6 mediaDataController = getMediaDataController();
                this.I3 = "";
                mediaDataController.Z1("", this.l6, this.d7, this.classGuid, 0, this.s4, false, this.D3, this.E3, true, this.F3);
            }
        }
    }

    public final void vc(View view, CharSequence charSequence, boolean z) {
        kg5 kg5Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z || ((kg5Var = this.B2) != null && kg5Var.W)) {
                this.B2.t(hl.S2(ob6.a0("SlowModeHint", null, 2131745039, charSequence)));
                if (z) {
                    this.B2.x(view, true);
                }
            }
        }
    }

    public final void vd(boolean z, boolean z2) {
        boolean z3;
        r47 r47Var;
        xoc xocVar;
        if (this.fragmentView != null && !this.I5) {
            int childCount = this.A0.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = this.A0.getChildAt(i);
                    if (childAt instanceof dl1) {
                        dl1 dl1Var = (dl1) childAt;
                        r47 messageObject = dl1Var.getMessageObject();
                        if (this.d8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.d8 && dl1Var.U()) {
                            zoc zocVar = dl1Var.J0;
                            if (!zocVar.h0 && (zocVar.e0 == 0 || (xocVar = zocVar.d0) == null || xocVar.c())) {
                                zocVar.e();
                                xoc xocVar2 = zocVar.d0;
                                xocVar2.v = 600L;
                                xocVar2.b = -1L;
                                xocVar2.c = -1L;
                                zocVar.e0 = SystemClock.elapsedRealtime();
                                zocVar.f0 = false;
                                zocVar.a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof wb2) {
                        wb2 wb2Var = (wb2) childAt;
                        r47 messageObject2 = wb2Var.getMessageObject();
                        if (this.J8 != null && ((messageObject2.g4() || r47.K4(messageObject2.k)) && !messageObject2.S4() && MediaController.z().H(messageObject2))) {
                            ImageReceiver photoImage = wb2Var.getPhotoImage();
                            this.J8.setTranslationX(wb2Var.getX() + photoImage.L0);
                            this.J8.setTranslationY((this.A0.getY() + ((wb2Var.getY() + wb2Var.getPaddingTop()) + photoImage.M0)) - this.J8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J8.getLayoutParams();
                            boolean g4 = messageObject2.g4();
                            qr1 qr1Var = this.J8;
                            if (g4) {
                                qr1Var.setTag(2131296593, null);
                                if (layoutParams.width != hl.b3(f8(), U7()) || layoutParams.height != hl.b3(f8(), U7())) {
                                    int b3 = hl.b3(f8(), U7());
                                    layoutParams.height = b3;
                                    layoutParams.width = b3;
                                    this.L8.setResizeMode(0);
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                float b32 = (hl.b3(f8(), U7()) + (hl.x << 1)) / hl.b3(f8(), U7());
                                float b33 = wb2Var.getPhotoImage().N0 / hl.b3(f8(), U7());
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
                                qr1Var.setTag(2131296593, photoImage);
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
            if (z && this.J8 != null && (r47Var = MediaController.z().v0) != null && r47Var.T == 0) {
                if (!z3) {
                    if (this.B3 && r47.K4(r47Var.k)) {
                        MediaController.z().m(true, true, false, false);
                        return;
                    }
                    this.J8.setTranslationY((-hl.b3(f8(), U7())) - 100);
                    this.fragmentView.invalidate();
                    if (r47Var.g4() || r47.K4(r47Var.k)) {
                        if (!this.B3 && MediaController.z().I0 == null) {
                            if (z2) {
                                J(r47Var.e1(), 0, 0, 0, false, true);
                                return;
                            }
                            return;
                        }
                        MediaController.z().m0(false);
                        return;
                    }
                    return;
                }
                MediaController.z().m0(true);
                if (!r47Var.g4() && !this.N8) {
                    this.A0.invalidate();
                }
            }
        }
    }

    public final void w5() {
        int i;
        if (this.p1 != null) {
            float actionModeFactor = (1.0f - this.vd.e) * (1.0f - this.actionBar.getActionModeFactor());
            float R1 = hl.R1(0.95f, 1.0f, actionModeFactor);
            this.p1.setScaleX(R1);
            this.p1.setScaleY(R1);
            this.p1.setAlpha(actionModeFactor);
            qq1 qq1Var = this.p1;
            if (actionModeFactor > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            qq1Var.setVisibility(i);
        }
    }

    public final void w6(View view) {
        x6(view, false);
    }

    public final float w7(wb2 wb2Var, float f) {
        int[] iArr = this.Vb;
        wb2Var.getLocationInWindow(iArr);
        int i = iArr[0];
        this.m1.getLocationInWindow(iArr);
        return (i - iArr[0]) + f;
    }

    public final void w8(int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, do1 do1Var) {
        String str4;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            r3c.Q0(getParentActivity(), this, inputPeer, iArr[0], this.v5.M2, str, str4, charSequence, z, do1Var, new gn1(this, (byte) 20)).p0 = false;
            M5(false);
            SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
            int i2 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i2 > 0) {
                SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i2 - 1).apply();
                zd(true);
            }
        }
    }

    public final void w9(TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j;
        jn7 f = jn7.f(this.currentAccount);
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
        f.k(jn7.v, arrayList, valueOf, bool, bool);
    }

    public final void wa(r47 r47Var) {
        if (lbc.D(this.f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = r47Var.k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f.id) {
                J(messageFwdHeader.saved_from_msg_id, r47Var.e1(), 0, 0, true, true);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = r47Var.k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", r47Var.k.fwd_from.saved_from_msg_id);
        if (getMessagesController().C(bundle, this, null, null)) {
            presentFragment(new zu1(bundle));
        }
    }

    public final void wb(View view, r47 r47Var, i49 i49Var, View view2, float f, float f2, w49 w49Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        w49 w49Var2;
        String str;
        TLRPC.Document e;
        r47 b;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        jf0 jf0Var;
        lva lvaVar;
        int[] iArr;
        int[] iArr2;
        int i;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z6;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!X7() && r47Var != null) {
            if (getMessagesController().x2()) {
                i5.b(this.currentAccount);
                return;
            }
            int i2 = 2;
            if (w49Var != null && w49Var.a) {
                M5(true);
                if (view == null) {
                    jf0Var = L6(r47Var.e1(), true);
                } else {
                    jf0Var = view;
                }
                String str2 = "";
                if (z2) {
                    if (jf0Var != null) {
                        try {
                            jf0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = r47Var.k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j = -cxa.b(r47Var).a;
                    TLRPC.ChatFull N0 = getMessagesController().N0(j);
                    if (N0 != null && !N0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
                        d31 b0 = d31.b0(this);
                        if (M0 != null) {
                            str2 = M0.title;
                        }
                        b0.Q(2131624221, 36, hl.S2(ob6.a0(null, null, 2131744689, str2))).k(true);
                        return;
                    }
                    hxa hxaVar = jxa.v(this.currentAccount, false).B;
                    if (hxaVar != null) {
                        hxaVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i3 = this.currentAccount;
                    long j2 = this.l6;
                    if (N0 != null && !N0.paid_reactions_available) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    e0b e0bVar = new e0b(parentActivity, i3, j2, this, r47Var, arrayList, z6, false, 0L, this.Ba);
                    r47Var.e1();
                    e0bVar.P1 = this;
                    e0bVar.Q1 = jf0Var;
                    e0bVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j3 = -cxa.b(r47Var).a;
                TLRPC.ChatFull N02 = getMessagesController().N0(j3);
                if (N02 != null && !N02.paid_reactions_available) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j3));
                    d31 b02 = d31.b0(this);
                    if (M02 != null) {
                        str2 = M02.title;
                    }
                    b02.Q(2131624221, 36, hl.S2(ob6.a0(null, null, 2131744689, str2))).k(true);
                    return;
                }
                hxa c0 = jxa.v(this.currentAccount, false).c0(r47Var, this, 1L, true, true, null);
                if (c0 != null && (jf0Var instanceof jf0)) {
                    if (this.ld == null) {
                        this.ld = new lva(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        lvaVar = null;
                    } else {
                        ViewParent parent = this.ld.getParent();
                        lva lvaVar2 = this.ld;
                        if (parent != layoutContainer) {
                            hl.B2(lvaVar2);
                            layoutContainer.addView(this.ld, tre.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(lvaVar2) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.ld.bringToFront();
                        }
                        lvaVar = this.ld;
                    }
                    lvaVar.setMessageCell((jf0) jf0Var);
                    c0.o = lvaVar;
                    lvaVar.J = false;
                    lvaVar.b(1.0f, null);
                    jf0Var.getLocationInWindow(new int[2]);
                    lvaVar.getLocationInWindow(new int[2]);
                    float f3 = (iArr[0] - iArr2[0]) + f;
                    float f4 = (iArr[1] - iArr2[1]) + f2;
                    if (jf0Var instanceof wb2) {
                        i = ((wb2) jf0Var).W;
                    } else {
                        i = 0;
                    }
                    lvaVar.d(f3, f4 + i, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().p() && (message = r47Var.k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new xk8((e) this, 24, true).show();
            } else {
                if (r47Var.w2() && w49Var != null) {
                    for (int i4 = 0; i4 < r47Var.k.reactions.results.size(); i4++) {
                        TLRPC.ReactionCount reactionCount = r47Var.k.reactions.results.get(i4);
                        if (w49Var.f(reactionCount.reaction)) {
                            z5 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z5 = false;
                if (!z5 && (chat = this.e) != null && !xc2.V(chat) && !xc2.w(26, this.e)) {
                    bs2.v(null, 2131745319, d31.b0(this), 2131624007, 36);
                    return;
                }
                s49.b(false);
                int size = r47Var.y0().size();
                boolean G5 = r47Var.G5(w49Var, z2);
                int e1 = r47Var.e1();
                long c1 = r47Var.c1();
                zh6 zh6Var = this.P6;
                if (zh6Var.f(c1) != null && (b = ((m47) zh6Var.f(r47Var.c1())).b(9)) != null) {
                    e1 = b.e1();
                }
                int i5 = e1;
                if (G5) {
                    jf0 L6 = L6(i5, true);
                    if (!xea.s1 && L6 != null && w49Var != null && !getUserConfig().p() && size == 1) {
                        xea.B(true);
                        long j4 = w49Var.g;
                        int i6 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                        int i7 = this.currentAccount;
                        if (i6 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i7).r.get(w49Var.f);
                            if (tL_availableReaction != null) {
                                e = tL_availableReaction.center_icon;
                            }
                        } else {
                            e = wl.e(i7, j4);
                        }
                        if (e != null) {
                            v21 q = d31.b0(this).q(e, ob6.M0(2131752183, null));
                            q.j = 5000;
                            q.j();
                        }
                    }
                    if (!z) {
                        int i8 = this.currentAccount;
                        if (i49Var != null) {
                            if (z2) {
                                i2 = 0;
                            }
                        } else {
                            i2 = 1;
                        }
                        s49.d(this, i49Var, L6, view2, f, f2, w49Var, i8, i2);
                    }
                }
                if (G5 && w49Var != null && (str = w49Var.f) != null) {
                    hl.g2(ob6.a0(null, null, 2131754720, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r47Var.y0());
                r7a sendMessagesHelper = getSendMessagesHelper();
                if (G5) {
                    w49Var2 = w49Var;
                } else {
                    w49Var2 = null;
                }
                yp1 yp1Var = new yp1(this, z4, z, i5, G5, i49Var, f, f2, w49Var, r47Var);
                this.Xc = yp1Var;
                sendMessagesHelper.r0(r47Var, arrayList2, w49Var2, z2, z3, this, yp1Var);
                if (z || z4) {
                    Yc(r47Var, true);
                    this.Xc.run();
                }
                if (!z4) {
                    hl.d3(this.Xc, 50L);
                }
            }
        }
    }

    public final void wc(b77 b77Var) {
        if (this.H5 == null) {
            return;
        }
        new a77(getParentActivity(), this.currentAccount, this.l6, b77Var, this, getResourceProvider(), 0, new gl1(this, (byte) 7)).show();
    }

    public final void wd(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.wd(boolean):void");
    }

    public final kg5 x4(float f, int i, int i2, boolean z) {
        long j;
        kg5 kg5Var = new kg5(getParentActivity(), i);
        kg5Var.p(true);
        kg5Var.h = hl.L(f);
        if (z) {
            j = -1;
        } else {
            j = 2300;
        }
        kg5Var.d = j;
        kg5Var.U = true;
        kg5Var.e = true;
        kg5Var.j(z);
        kg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
        kg5Var.v0 = hl.L(4.0f);
        kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        kg5Var.k(this.L);
        FrameLayout.LayoutParams e = tre.e(-1, 150, 55);
        nt1 nt1Var = this.m1;
        if (i2 >= 0) {
            nt1Var.addView(kg5Var, i2, e);
            return kg5Var;
        }
        nt1Var.addView(kg5Var, e);
        return kg5Var;
    }

    public final void x5() {
        boolean z;
        ir1 ir1Var;
        if (this.Aa != null) {
            return;
        }
        int i = 0;
        if (this.ud.e >= 1.0f && ((ir1Var = this.F1) == null || ir1Var.getPositionAnimated() <= 0.0f)) {
            z = false;
        } else {
            z = true;
        }
        nf9 nf9Var = this.m1.M;
        if (!z) {
            i = 4;
        }
        nf9Var.setVisibility(i);
    }

    public final void x6(View view, boolean z) {
        boolean z2;
        Nb(view);
        if (view != this.y1) {
            z2 = true;
        } else {
            z2 = false;
        }
        y6(z, z2, 0.2f);
    }

    public final float x7(wb2 wb2Var, float f) {
        int[] iArr = this.Vb;
        wb2Var.getLocationInWindow(iArr);
        int i = iArr[1];
        this.m1.getLocationInWindow(iArr);
        return (i - iArr[1]) + f;
    }

    public final void x8(int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, do1 do1Var) {
        String str3;
        if (this.v5 != null && i < arrayList.size() && getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            r3c.Q0(getParentActivity(), this, inputPeer, iArr[0], this.v5.M2, strArr[0], str3, charSequence, z, do1Var, new gn1(this, (byte) 15)).p0 = false;
            M5(false);
            SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
            int i2 = sharedPreferences.getInt("dialog_show_translate_count" + a(), 5);
            if (i2 > 0) {
                SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
                edit.putInt("dialog_show_translate_count" + a(), i2 - 1).apply();
                zd(true);
            }
        }
    }

    public final void x9() {
        if (!q5(this.a0.getSendButton())) {
            if (getMediaController().H(this.v5)) {
                getMediaController().m(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = getMessagesController().j1(this.l6);
            if (this.w5 != null) {
                for (int i = 0; i < this.w5.d.size(); i++) {
                    tL_messages_sendScheduledMessages.id.add(Integer.valueOf(((r47) this.w5.d.get(i)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.id.add(Integer.valueOf(this.v5.e1()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ql(this, tL_messages_sendScheduledMessages, (byte) 16));
        }
    }

    public final boolean xa(wb2 wb2Var, r47 r47Var) {
        wb2 wb2Var2;
        boolean z;
        long j;
        long j2;
        long j3;
        boolean l1;
        lm m;
        Bitmap m2;
        if (wb2Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2Var2 = (wb2) childAt;
                    if (wb2Var2.getMessageObject().T(r47Var)) {
                        break;
                    }
                }
            }
        }
        wb2Var2 = wb2Var;
        if (r47.K4(r47Var.k)) {
            Eb(r47Var, true);
        }
        if (r47.K4(r47Var.k) && !r47Var.D2(true) && xea.x0 && r47Var.B() && !wf3.B(r47.B0(r47Var.k)) && !r47Var.z0 && !r47Var.y0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            xb4 fileLoader = getFileLoader();
            TLRPC.Document F0 = r47Var.F0();
            fileLoader.getClass();
            xb4.K.c(new cv2(fileLoader, F0, r47Var, (byte) 27));
        }
        PhotoViewer.q0().T1(null, this, this.Ba);
        r47 r47Var2 = MediaController.z().v0;
        if (wb2Var2 != null && r47Var2 != null && r47.K4(r47Var2.k)) {
            getFileLoader().c0(r47Var2.F0(), false);
            if (r47Var2.T(r47Var) && (m = wb2Var2.getPhotoImage().m()) != null && this.M8 != null && this.J8.getTag() != null && (m2 = m.m()) != null) {
                try {
                    Bitmap bitmap = this.M8.getBitmap(m2.getWidth(), m2.getHeight());
                    new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            MediaController.z().m(true, true, false, r47Var2.T(r47Var));
        }
        if (this.g4 == 1 && (r47.K4(r47Var.k) || r47Var.D == 1)) {
            PhotoViewer.q0().k4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.M6.size();
            for (int i2 = 0; i2 < size; i2++) {
                r47 r47Var3 = (r47) this.M6.get(i2);
                if (r47.K4(r47Var3.k) || r47Var3.D == 1) {
                    arrayList.add(0, r47Var3);
                }
            }
            l1 = PhotoViewer.q0().n1(arrayList, arrayList.indexOf(r47Var), this.l6, 0L, c(), this.db);
        } else {
            PhotoViewer q0 = PhotoViewer.q0();
            if (r47Var.D != 0) {
                j = this.l6;
                j2 = this.d7;
                j3 = c();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            l1 = q0.l1(r47Var, this, j, j2, j3, this.db);
            if (!l1 && z) {
                getFileLoader().f(r47Var.F0());
            }
        }
        H7(false);
        MediaController.z().w0 = null;
        return l1;
    }

    public final void xb() {
        rx6[] rx6VarArr;
        cv1 cv1Var;
        bv1 bv1Var;
        kv1[] kv1VarArr;
        xu1 xu1Var = this.Ba;
        if (xu1Var != null) {
            xu1Var.s();
        }
        kq1 kq1Var = this.y;
        if (kq1Var != null) {
            kq1Var.d();
        }
        kq1 kq1Var2 = this.x;
        if (kq1Var2 != null) {
            kq1Var2.d();
        }
        kq1 kq1Var3 = this.E;
        if (kq1Var3 != null) {
            kq1Var3.d();
        }
        nr1 nr1Var = this.a0;
        if (nr1Var != null) {
            nr1Var.updateColors();
        }
        f41 f41Var = this.Y1;
        if (f41Var != null) {
            f41Var.I0();
        }
        wq1 wq1Var = this.A0;
        if (wq1Var != null) {
            int childCount = wq1Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0.getChildAt(i);
                if (childAt instanceof wb2) {
                    ((wb2) childAt).B0(0);
                } else if (childAt instanceof dl1) {
                    ((dl1) childAt).setInvalidateColors(true);
                }
            }
        }
        n8 n8Var = this.g9;
        if (n8Var != null && n8Var.getContentView() != null) {
            View contentView = this.g9.getContentView();
            int themedColor = getThemedColor(aob.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        he8 he8Var = this.O2;
        if (he8Var != null) {
            he8Var.d();
        }
        or1 or1Var = this.b0;
        if (or1Var != null && or1Var.getEditView() != null) {
            for (kv1 kv1Var : this.b0.getEditView().a) {
                if (kv1Var != null) {
                    kv1Var.d();
                }
            }
        }
        s7 s7Var = this.j0;
        if (s7Var != null) {
            s7Var.V();
        }
        hr1 hr1Var = this.m2;
        if (hr1Var != null) {
            hr1Var.updateColors();
        }
        qq1 qq1Var = this.p1;
        if (qq1Var != null) {
            qq1Var.updateColors();
        }
        nt1 nt1Var = this.m1;
        if (nt1Var != null) {
            nt1Var.M();
            nf9 nf9Var = this.m1.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
        wz1 wz1Var = this.b1;
        if (wz1Var != null) {
            jl0 jl0Var = wz1Var.s;
            if (jl0Var != null) {
                jl0Var.updateColors();
            }
            aob.w0(null, aob.d6, false);
            wz1Var.invalidate();
        }
        zeb zebVar = this.s1;
        if (zebVar != null) {
            zebVar.updateColors();
        }
        qq1 qq1Var2 = this.p1;
        if (qq1Var2 != null && qq1Var2.getTimeItem() != null) {
            this.p1.getTimeItem().invalidate();
        }
        z92 z92Var = this.U;
        if (z92Var != null) {
            z92Var.updateColors();
        }
        vz1 vz1Var = this.y1;
        if (vz1Var != null) {
            for (rx6 rx6Var : vz1Var.e) {
                if (rx6Var != null && (bv1Var = (cv1Var = (cv1) rx6Var.b).b) != null) {
                    bv1Var.updateColors();
                    cv1Var.invalidate();
                }
            }
        }
        rr1 rr1Var = this.d1;
        if (rr1Var != null) {
            rr1Var.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).updateColors();
        }
        this.m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void xc() {
        int i;
        if (a() == getUserConfig().e() && getUserConfig().p() && this.Mb == null) {
            gs1 gs1Var = new gs1(this, this, getParentActivity(), this.currentAccount, this.Ba);
            this.Mb = gs1Var;
            gs1Var.setPadding(hl.L(4.0f), hl.L(24.0f), hl.L(4.0f), hl.L(0.0f));
            this.Mb.setDelegate(new hs1(this));
            this.Mb.setTop(true);
            int i2 = 0;
            this.Mb.setClipChildren(false);
            this.Mb.setClipToPadding(false);
            this.Mb.setVisibility(0);
            gs1 gs1Var2 = this.Mb;
            if (gs1Var2.getSelectedReactions().isEmpty()) {
                i = 2131745600;
            } else {
                i = 2131745599;
            }
            gs1Var2.setHint(ob6.M0(i, null));
            this.m1.addView(this.Mb, tre.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Mb.m(null, null, true);
            this.Mb.setTranslationY(-hl.L(12.0f));
            this.Mb.setScaleY(0.4f);
            this.Mb.setScaleX(0.4f);
            this.Mb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(k43.h).start();
            td();
            gs1 gs1Var3 = this.Mb;
            float f = this.T9;
            zr1 zr1Var = this.D1;
            if (zr1Var != null) {
                i2 = zr1Var.getCurrentHeight();
            }
            gs1Var3.setTranslationY(f + i2);
        }
    }

    public final void xd() {
        yd(false);
    }

    @Override
    public final boolean y() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void y4(r47 r47Var, Integer num) {
        r47 r47Var2 = r47Var.C;
        if (r47Var2 != null) {
            int e1 = r47Var2.e1();
            SparseArray sparseArray = this.I6;
            ArrayList arrayList = (ArrayList) sparseArray.get(e1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(e1, arrayList);
            }
            int e12 = r47Var.e1();
            if (!arrayList.contains(Integer.valueOf(e12))) {
                arrayList.add(Integer.valueOf(e12));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void y5() {
        float f;
        qx1 qx1Var;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + hl.L(15.0f) + u7(h1c.c) + this.w.d();
        nr1 nr1Var = this.a0;
        if (nr1Var != null && (qx1Var = nr1Var.n0) != null) {
            qx1Var.setTranslationY(-inputBubbleHeight);
        }
        fr1 fr1Var = this.X1;
        if (fr1Var != null) {
            if (fr1Var.g()) {
                f = hl.L(5.0f);
            } else {
                f = -inputBubbleHeight;
            }
            fr1Var.setTranslationY(f);
        }
    }

    public final void y6(boolean z, boolean z2, float f) {
        boolean z3;
        ValueAnimator ofFloat;
        vz1 vz1Var;
        wb2 wb2Var;
        if (f > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        View view = this.Z8;
        if (view instanceof wb2) {
            wb2 wb2Var2 = (wb2) view;
            wb2Var2.setInvalidatesParent(z3);
            if (z3) {
                ib(wb2Var2);
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
            ValueAnimator valueAnimator = this.Wc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.Y8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
            if (z) {
                mu9.d(new pl1(this, (byte) 1));
            }
        } else {
            float f3 = this.X8;
            this.b9 = f3 / max;
            this.Y8 = false;
            ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new qm1(this, max, (byte) 0));
        if ((!z3 || z2) && (vz1Var = this.y1) != null) {
            Property property = View.ALPHA;
            if (z3) {
                f2 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vz1Var, property, f2));
        }
        this.f9.playTogether(arrayList);
        this.f9.setInterpolator(k43.h);
        this.f9.setDuration(320L);
        View view2 = this.Z8;
        if (view2 instanceof wb2) {
            wb2Var = (wb2) view2;
        } else {
            wb2Var = null;
        }
        this.f9.addListener(new rw(this, z3, wb2Var, (byte) 1));
        if (this.Z8 != null && this.a9 <= 0.0f) {
            Nb(null);
        }
        this.f9.start();
    }

    public final void y7(boolean z) {
        int i;
        int i2;
        if (this.g4 == 7) {
            df5 a = df5.a(this.currentAccount);
            int i3 = this.classGuid;
            int i4 = this.K3;
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int i5 = i4 + i2;
            cf5 b = a.b(this.d4);
            ArrayList arrayList = b.a;
            if (i5 >= 0 && i5 < arrayList.size()) {
                b.l = i5;
                jn7.f(a.a).k(jn7.I0, Integer.valueOf(i3), Integer.valueOf(b.m), Boolean.valueOf(b.n), Integer.valueOf(b.b()), Integer.valueOf(b.l), Integer.valueOf(((r47) arrayList.get(i5)).k.id));
                return;
            }
            return;
        }
        ls6 mediaDataController = getMediaDataController();
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
        TLRPC.UserFull userFull;
        boolean z;
        if (getParentActivity() != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                if (xc2.j(chat) && !this.e.monoforum) {
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
                String M0 = ob6.M0(2131743497, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131743498, null);
                alertDialog$Builder.j(ob6.M0(2131743499, null), new el1(this, (byte) 19));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
            } else if (!this.V4.isEmpty()) {
                uc7.s1(this.currentAccount).W3.edit().putInt("pin_" + this.l6, ((Integer) this.V4.get(0)).intValue()).commit();
                gd(0, true);
            }
        }
    }

    public final void y9(m47 m47Var, r47 r47Var, int i, int i2) {
        if (m47Var != null) {
            ArrayList arrayList = m47Var.d;
            if (!arrayList.isEmpty()) {
                r7a.B(this.currentAccount).t((r47) arrayList.get(0), this, i, i2);
                return;
            }
        }
        r7a.B(this.currentAccount).t(r47Var, this, i, i2);
    }

    public final void ya(boolean z) {
        wk5 wk5Var;
        int i;
        if (getParentActivity() != null && (wk5Var = this.parentLayout) != null && wk5Var.getLastFragment() == this && !this.V4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.id);
            } else {
                bundle.putLong("user_id", this.f.id);
            }
            bundle.putInt("chatMode", 2);
            zu1 zu1Var = new zu1(bundle);
            zu1Var.V4 = new ArrayList(this.V4);
            zu1Var.X4 = new HashMap(this.X4);
            int size = this.V4.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) this.V4.get(i2);
                r47 r47Var = (r47) this.X4.get(num);
                r47 r47Var2 = (r47) this.G6[0].get(num.intValue());
                if (r47Var == null) {
                    r47Var = r47Var2;
                } else if (r47Var2 != null) {
                    r47Var.z0 = r47Var2.z0;
                    r47Var.y0 = r47Var2.y0;
                }
                if (r47Var != null) {
                    zu1Var.X4.put(num, r47Var);
                    zu1Var.hd();
                }
            }
            zu1Var.d5 = this.d5;
            if (this.x4) {
                i = this.V4.size();
            } else {
                i = this.e5;
            }
            zu1Var.e5 = i;
            zu1Var.g5 = this.g5;
            zu1Var.s8 = this.s8;
            zu1Var.r8 = this.r8;
            zu1Var.n9 = new qs1(this, zu1Var);
            if (z) {
                presentFragmentAsPreview(zu1Var);
                p5();
                return;
            }
            presentFragment(zu1Var, false);
        }
    }

    public final void yb(TLRPC.Document document) {
        String V;
        if (document == null || (V = r47.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        p7a b = p7a.b(V, this.l6, this.F5, this.m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b.K = X6();
        r7a.B(this.currentAccount).q0(b);
        E4();
    }

    public final void yc(r47 r47Var) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().E2(r47.B0(r47Var.k))) {
            TLRPC.Message message = r47Var.k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = r47Var.B2;
                boolean z = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = r47Var.v;
                    if (r47Var.B2.size() > 1) {
                        z = true;
                    }
                } else {
                    charSequence = r47Var.z;
                }
                if (!z && charSequence != null) {
                    z = true;
                }
                if (z && xea.I <= 2 && !this.F9 && this.G9 <= this.a0.getTop() - hl.L(60.0f)) {
                    this.F9 = true;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    int i = xea.I + 1;
                    xea.I = i;
                    edit.putInt("textSelectionHintShows", i);
                    edit.apply();
                    if (this.E9 == null) {
                        ss1 ss1Var = new ss1(this, this.Ba, getParentActivity());
                        this.E9 = ss1Var;
                        this.m1.addView(ss1Var, tre.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.E9.c();
                }
            }
        }
    }

    public final void yd(boolean z) {
        Drawable mutate;
        Drawable drawable;
        q7 q7Var;
        if (this.p1 != null) {
            int i = this.g4;
            if (i == 0 || i == 8) {
                boolean p2 = getMessagesController().p2(this.l6, c(), null);
                if (z) {
                    p2 = !p2;
                }
                this.R0 = null;
                if (!xc2.e0(this.currentAccount, this.e) && !xc2.f0(this.currentAccount, this.f)) {
                    if (!lbc.B(this.f) && ((!k8() || this.x4) && p2)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231946).mutate();
                    int i2 = aob.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i2);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.p1.c(wf3.c(chat));
                    } else {
                        TLRPC.User user = this.f;
                        if (user != null && !lbc.D(user)) {
                            drawable = this.p1.c(wf3.c(this.f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.p1.j(drawable, mutate);
                if (!z && (q7Var = this.t1) != null) {
                    byte b = q7Var.m;
                    if (p2) {
                        if (b != 8) {
                            q7Var.m = (byte) 8;
                            View view = q7Var.j;
                            if (view instanceof b8) {
                                ((b8) view).getRightIcon().setVisibility(q7Var.m);
                            }
                        }
                        this.t1.d(ob6.M0(2131743504, null));
                        this.t1.b(2131232261);
                    } else {
                        if (b != 0) {
                            q7Var.m = (byte) 0;
                            View view2 = q7Var.j;
                            if (view2 instanceof b8) {
                                ((b8) view2).getRightIcon().setVisibility(q7Var.m);
                            }
                        }
                        boolean q2 = getMessagesController().q2(this.l6, c());
                        q7 q7Var2 = this.t1;
                        if (q2) {
                            q7Var2.d(ob6.M0(2131748068, null));
                            this.t1.b(2131232417);
                        } else {
                            q7Var2.d(ob6.M0(2131748068, null));
                            this.t1.b(2131232371);
                        }
                    }
                }
                oc2 oc2Var = this.x1;
                if (oc2Var != null) {
                    oc2Var.e(this.l6, c(), null);
                }
            }
        }
    }

    @Override
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void z4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.z4():void");
    }

    public final void z5() {
        float d;
        boolean z;
        if (this.A0 != null) {
            if (this.mb && this.Aa == null) {
                d = hl.n;
            } else {
                d = this.w.d() + u7(h1c.c) + hl.L(16.0f) + this.Ya + this.od;
            }
            int i = (int) this.P9;
            l1c l1cVar = this.g2;
            if (l1cVar != null) {
                l1cVar.setSideMenuBackgroundMarginTop(0.0f);
            }
            zm9 zm9Var = this.z0;
            if (!this.A0.W1 && this.wb == 0) {
                z = true;
            } else {
                z = false;
            }
            wq1 wq1Var = (wq1) zm9Var.b;
            int i2 = (int) d;
            int paddingTop = wq1Var.getPaddingTop();
            int paddingBottom = wq1Var.getPaddingBottom();
            if (paddingTop != i || paddingBottom != i2) {
                int i3 = paddingTop - i;
                if (z && i3 != 0) {
                    boolean canScrollVertically = wq1Var.canScrollVertically(1);
                    boolean canScrollVertically2 = wq1Var.canScrollVertically(-1);
                    if ((i3 >= 0 || canScrollVertically) && (i3 <= 0 || canScrollVertically2)) {
                        hl.J(wq1Var, new zd(zm9Var, i3, (byte) 26));
                    }
                }
                wq1Var.setPadding(wq1Var.getPaddingLeft(), i, wq1Var.getPaddingRight(), i2);
            }
            sz1 sz1Var = this.c4;
            if (sz1Var != null) {
                RectF rectF = sz1Var.b;
                rectF.set(u7(h1c.b), i - this.I, 0.0f, d - this.Ya);
                sz1Var.c.set(rectF.left, rectF.top, sz1Var.getMeasuredWidth() - rectF.right, sz1Var.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void z6(Runnable runnable) {
        jn7.f(this.currentAccount).d(runnable);
    }

    public final void z7() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.z7():void");
    }

    public final void z8() {
        if (this.a2.getTag() != null && ((Integer) this.a2.getTag()).intValue() == 5) {
            if (!this.Qc) {
                this.Qc = true;
                uc7 messagesController = getMessagesController();
                long j = this.l6;
                pl1 pl1Var = new pl1(this, (byte) 2);
                messagesController.getClass();
                TLRPC.TL_messages_reportNotSpam tL_messages_reportNotSpam = new TLRPC.TL_messages_reportNotSpam();
                TLRPC.InputPeer j1 = messagesController.j1(j);
                tL_messages_reportNotSpam.peer = j1;
                if (j1 instanceof TLRPC.TL_inputPeerEmpty) {
                    pl1Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    messagesController.getConnectionsManager().sendRequest(tL_messages_reportNotSpam, new p87(messagesController, j, pl1Var, (byte) 9));
                    return;
                }
            }
            return;
        }
        int i = 0;
        if (this.b2) {
            getMessagesController().b(0, 0, this.l6);
            i6();
            this.N3.j(23, this.l6, null);
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
            edit.putBoolean("dialog_bar_archived" + this.l6, false);
            edit.putBoolean("dialog_bar_block" + this.l6, false);
            edit.putBoolean("dialog_bar_report" + this.l6, false);
            edit.commit();
            zd(false);
            ip7 notificationsController = getNotificationsController();
            long j2 = this.l6;
            long c = c();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().d().edit();
            String p = ip7.p(j2, c, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + p);
            remove.remove("custom_" + p);
            notificationsController.getMessagesStorage().B1(j2, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().R.f(j2);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j2, c, true);
        } else if (this.a2.getTag() != null && ((Integer) this.a2.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = this.r8;
            if (chatFull != null && chatFull.participants != null) {
                zh6 zh6Var = new zh6();
                while (true) {
                    int size = this.r8.participants.participants.size();
                    TLRPC.ChatFull chatFull2 = this.r8;
                    if (i < size) {
                        zh6Var.k(chatFull2.participants.participants.get(i).user_id, null);
                        i++;
                    } else {
                        long j3 = chatFull2.id;
                        lt5 lt5Var = new lt5(getParentActivity(), this.currentAccount, zh6Var, this.r8.id, this, this.Ba);
                        lt5Var.f2 = new el1(this, (byte) 23);
                        lt5Var.show();
                        return;
                    }
                }
            }
        } else if (this.a2.getTag() != null) {
            Sb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f.id);
            bundle.putBoolean("addContact", true);
            cu2 cu2Var = new cu2(bundle);
            cu2Var.P = new el1(this, (byte) 24);
            presentFragment(cu2Var);
        }
    }

    public final void z9(TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p pVar) {
        try {
            zh6 zh6Var = new zh6();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new r47(this.currentAccount, tL_message, false, false));
            zh6Var.k(wf3.n(tL_webPageAttributeStory.peer), arrayList);
            getMessagesController().O1().k.c(zh6Var, new jj1(zh6Var, pVar, (byte) 16), this.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public final void za(long j) {
        int i;
        boolean z;
        mt9 mt9Var;
        if (j != f7()) {
            getConnectionsManager().cancelRequestsForGuid(this.classGuid);
            getMessagesStorage().j(this.classGuid);
            this.classGuid = ConnectionsManager.generateClassGuid();
            kb();
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
                nt9 F1 = getMessagesController().F1();
                long c = c();
                ArrayList arrayList = F1.j;
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        mt9Var = (mt9) arrayList.get(i2);
                        if (mt9Var.a == c) {
                            break;
                        }
                        i2++;
                    } else {
                        mt9Var = null;
                        break;
                    }
                }
                if (mt9Var != null && !mt9Var.i) {
                    F1.f(c, null);
                }
            }
            N6();
            wd(true);
            qq1 qq1Var = this.p1;
            if (qq1Var != null) {
                qq1Var.n(true);
                this.p1.b();
            }
            n0c n0cVar = this.n0;
            if (n0cVar != null) {
                n0cVar.setCurrentTopic(j);
                n0c n0cVar2 = this.n0;
                if (this.j0 != null) {
                    z = true;
                } else {
                    z = false;
                }
                n0cVar2.setMenuAvailable(z);
            }
            zd(true);
            Pc(true);
            F7(true);
            E7(true);
            nr1 nr1Var = this.a0;
            if (nr1Var != null) {
                nr1Var.N0(false);
                this.a0.y2(true);
            }
            H4(true, true);
            qu1 qu1Var = this.jd;
            if (qu1Var != null && this.actionBar.o0) {
                qu1Var.k(null);
            }
        }
    }

    public final void zb(TLRPC.BotInlineResult botInlineResult, boolean z, int i, long j) {
        long j2;
        String str;
        fr1 fr1Var = this.X1;
        if (fr1Var == null) {
            return;
        }
        TLRPC.User user = fr1Var.getAdapter().x0;
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
        k5 accountInstance = getAccountInstance();
        long j3 = this.l6;
        r47 r47Var = this.F5;
        r47 r47Var2 = this.m4;
        r7a.R(i, j3, j, k7(), accountInstance, this.D5, r47Var, r47Var2, X6(), hashMap, botInlineResult, null, this, z);
        this.a0.setFieldText("");
        E7(false);
        getMediaDataController().w0(j2, false);
    }

    public final void zc(boolean z, boolean z2) {
        nr1 nr1Var;
        int i;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z || this.H2 != null) && this.g4 == 0 && (nr1Var = this.a0) != null && nr1Var.getAudioVideoButtonContainer() != null && this.a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                kg5 kg5Var = this.H2;
                if (kg5Var == null) {
                    int indexOfChild = this.m1.indexOfChild(this.U);
                    if (indexOfChild != -1) {
                        kg5Var = x4(310.0f, 3, indexOfChild + 1, false);
                        this.H2 = kg5Var;
                    } else {
                        return;
                    }
                }
                if (z) {
                    kg5Var.f(true);
                    return;
                }
                if (this.a0.T2) {
                    if (z2) {
                        i = 2131749044;
                    } else {
                        i = 2131749046;
                    }
                    kg5Var.t(ob6.M0(i, null));
                } else {
                    kg5Var.t(ob6.M0(2131749045, null));
                }
                this.H2.x(this.a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void zd(boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.zd(boolean):void");
    }

    @Override
    public final void S() {
    }

    public void la(boolean z) {
    }
}
