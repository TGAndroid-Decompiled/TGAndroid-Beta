package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.LruCache;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.hc0;
import org.telegram.ui.j80;
public final class hp extends c1 implements cs {
    public static volatile long A8;
    public static volatile long B8;
    public static final int C8 = (2 | 4) | 1050105;
    public static final int D8 = (1 | 2) | 28;
    public static volatile hp[] E8 = new hp[4];
    public static final Object[] F8 = new Object[4];
    public final LongSparseIntArray A0;
    public final SparseIntArray A1;
    public long A2;
    public boolean A3;
    public int A4;
    public int A5;
    public int A6;
    public boolean A7;
    public final a0.h B0;
    public final a0.h B1;
    public int B2;
    public String B3;
    public Set B4;
    public int B5;
    public String B6;
    public final SparseArray B7;
    public final LongSparseIntArray C0;
    public final a0.h C1;
    public String C2;
    public boolean C3;
    public Set C4;
    public float C5;
    public String C6;
    public mo C7;
    public final a0.h D0;
    public final a0.h D1;
    public String D2;
    public boolean D3;
    public int D4;
    public float D5;
    public int D6;
    public final el D7;
    public final ArrayList E;
    public final a0.h E0;
    public final HashMap E1;
    public String E2;
    public float E3;
    public int E4;
    public int E5;
    public int E6;
    public final el E7;
    public final ArrayList F;
    public final a0.h F0;
    public final a0.h F1;
    public boolean F2;
    public boolean F3;
    public int F4;
    public int F5;
    public boolean F6;
    public final el F7;
    public final ArrayList G;
    public boolean G0;
    public final HashMap G1;
    public int G2;
    public boolean G3;
    public int G4;
    public int G5;
    public boolean G6;
    public final o0.a G7;
    public final ArrayList H;
    public final LongSparseIntArray H0;
    public final a0.h H1;
    public int H2;
    public volatile boolean H3;
    public int H4;
    public int H5;
    public String H6;
    public u10 H7;
    public final ArrayList I;
    public int I0;
    public final HashMap I1;
    public final hc I2;
    public boolean I3;
    public int I4;
    public boolean I5;
    public long I6;
    public final mj I7;
    public final ArrayList J;
    public boolean J0;
    public final a0.h J1;
    public final mj J2;
    public boolean J3;
    public int J4;
    public boolean J5;
    public int J6;
    public final mj J7;
    public final ArrayList K;
    public final a0.h K0;
    public final a0.h K1;
    public long K2;
    public boolean K3;
    public int K4;
    public int K5;
    public int K6;
    public final a0.h K7;
    public final ArrayList L;
    public final a0.h L0;
    public final a0.h L1;
    public int L2;
    public String L3;
    public int L4;
    public String L5;
    public boolean L6;
    public final a0.h L7;
    public final ArrayList M;
    public int M0;
    public final a0.h M1;
    public int M2;
    public String M3;
    public int M4;
    public boolean M5;
    public long M6;
    public long M7;
    public final mo[] N;
    public long N0;
    public final a0.h N1;
    public boolean N2;
    public String N3;
    public int N4;
    public int N5;
    public long N6;
    public final int N7;
    public int O;
    public final SparseIntArray O0;
    public final a0.h O1;
    public String O2;
    public int O3;
    public int O4;
    public boolean O5;
    public String O6;
    public final int O7;
    public final ConcurrentHashMap P;
    public final SparseIntArray P0;
    public final a0.h P1;
    public final a0.h P2;
    public String P3;
    public int P4;
    public boolean P5;
    public int P6;
    public final int P7;
    public final ConcurrentHashMap Q;
    public ArrayList Q0;
    public final ArrayList Q1;
    public final HashMap Q2;
    public boolean Q3;
    public int Q4;
    public int Q5;
    public boolean Q6;
    public ArrayList Q7;
    public final a0.h R;
    public ArrayList R0;
    public final a0.h R1;
    public String R2;
    public boolean R3;
    public int R4;
    public long R5;
    public int R6;
    public final LongSparseIntArray R7;
    public final a0.h S;
    public final ArrayList S0;
    public final ArrayList S1;
    public org.telegram.ui.ActionBar.b6 S2;
    public String S3;
    public int S4;
    public long S5;
    public int S6;
    public final LongSparseIntArray S7;
    public final a0.h T;
    public final SparseArray T0;
    public final HashMap T1;
    public k10 T2;
    public Set T3;
    public int T4;
    public int T5;
    public int T6;
    public final LongSparseIntArray T7;
    public final LongSparseIntArray U;
    public boolean U0;
    public boolean U1;
    public final co U2;
    public Set U3;
    public int U4;
    public String U5;
    public String U6;
    public final a0.h U7;
    public final SparseArray V;
    public boolean V0;
    public int V1;
    public String V2;
    public TLRPC.TL_pendingSuggestion V3;
    public int V4;
    public String V5;
    public String V6;
    public final HashSet V7;
    public final ConcurrentHashMap W;
    public final ArrayList W0;
    public a0.h W1;
    public int W2;
    public Set W3;
    public int W4;
    public boolean W5;
    public HashSet W6;
    public boolean W7;
    public a0.h X;
    public final a0.h X0;
    public a0.h X1;
    public final int X2;
    public Set X3;
    public int X4;
    public boolean X5;
    public int[] X6;
    public TLRPC.TL_exportedContactToken X7;
    public a0.h Y;
    public final LongSparseLongArray Y0;
    public mj Y1;
    public int Y2;
    public Set Y3;
    public int Y4;
    public boolean Y5;
    public int Y6;
    public HashMap Y7;
    public final a0.h[] Z;
    public final LongSparseIntArray Z0;
    public boolean Z1;
    public int Z2;
    public boolean Z3;
    public int Z4;
    public long Z5;
    public long Z6;
    public HashSet Z7;
    public int f22953a;
    public final ConcurrentHashMap f22954a0;
    public final a0.h f22955a1;
    public final SparseIntArray f22956a2;
    public int f22957a3;
    public int f22958a4;
    public int f22959a5;
    public long f22960a6;
    public long f22961a7;
    public a0.h f22962a8;
    public final ConcurrentHashMap f22963b;
    public final LongSparseIntArray f22964b0;
    public final a0.h f22965b1;
    public final SparseBooleanArray f22966b2;
    public int f22967b3;
    public boolean f22968b4;
    public int f22969b5;
    public float f22970b6;
    public long[] f22971b7;
    public boolean f22972b8;
    public final ConcurrentHashMap f22973c;
    public int f22974c0;
    public final a0.h f22975c1;
    public final SparseBooleanArray c2;
    public int f22976c3;
    public ArrayList f22977c4;
    public int f22978c5;
    public float f22979c6;
    public int[][] f22980c7;
    public boolean f22981c8;
    public final ConcurrentHashMap d;
    public final SparseArray f22982d0;
    public final a0.h f22983d1;
    public final SparseBooleanArray f22984d2;
    public boolean f22985d3;
    public HashSet f22986d4;
    public int f22987d5;
    public boolean f22988d6;
    public final SharedPreferences f22989d7;
    public final a0.h f22990d8;
    public final ConcurrentHashMap f22991e;
    public int f22992e0;
    public final a0.h f22993e1;
    public boolean f22994e2;
    public int f22995e3;
    public Set f22996e4;
    public long f22997e5;
    public Set f22998e6;
    public final SharedPreferences f22999e7;
    public final HashSet f23000e8;
    public final ConcurrentHashMap f23001f;
    public int f23002f0;
    public final ArrayList f23003f1;
    public boolean f23004f2;
    public final int f23005f3;
    public Set f23006f4;
    public int f23007f5;
    public boolean f23008f6;
    public final SharedPreferences f23009f7;
    public final mj f23010f8;
    public int f23011g0;
    public final ArrayList f23012g1;
    public boolean f23013g2;
    public final int f23014g3;
    public String f23015g4;
    public int f23016g5;
    public boolean f23017g6;
    public volatile boolean g7;
    public boolean f23018g8;
    public final HashMap h;
    public int f23019h0;
    public final ArrayList f23020h1;
    public boolean f23021h2;
    public int f23022h3;
    public HashMap f23023h4;
    public int f23024h5;
    public int f23025h6;
    public boolean h7;
    public TLRPC.messages_AvailableEffects f23026h8;
    public ei.z6 f23027i0;
    public long f23028i1;
    public boolean f23029i2;
    public int i3;
    public HashMap f23030i4;
    public int f23031i5;
    public int f23032i6;
    public int f23033i7;
    public final fo f23034i8;
    public nv f23035j0;
    public long f23036j1;
    public boolean f23037j2;
    public int f23038j3;
    public boolean f23039j4;
    public int f23040j5;
    public int f23041j6;
    public boolean f23042j7;
    public boolean f23043j8;
    public e10 f23044k0;
    public long k1;
    public boolean f23045k2;
    public int f23046k3;
    public int f23047k4;
    public int f23048k5;
    public long f23049k6;
    public final ArrayList f23050k7;
    public ArrayList f23051k8;
    public boolean f23052l0;
    public final a0.h f23053l1;
    public long f23054l2;
    public final int f23055l3;
    public int f23056l4;
    public int f23057l5;
    public Long f23058l6;
    public org.telegram.ui.b7 f23059l7;
    public long f23060l8;
    public long m0;
    public final a0.h m1;
    public boolean f23061m2;
    public final int f23062m3;
    public boolean f23063m4;
    public int f23064m5;
    public int f23065m6;
    public long f23066m7;
    public TL_account.contentSettings f23067m8;
    public final ArrayList f23068n;
    public f3 f23069n0;
    public final a0.h f23070n1;
    public TLRPC.TL_messages_peerDialogs f23071n2;
    public int f23072n3;
    public int n4;
    public int f23073n5;
    public int f23074n6;
    public long f23075n7;
    public boolean f23076n8;
    public long f23077o0;
    public final a0.h f23078o1;
    public TLRPC.messages_Dialogs f23079o2;
    public int f23080o3;
    public int f23081o4;
    public int f23082o5;
    public boolean f23083o6;
    public in f23084o7;
    public final HashSet f23085o8;
    public long f23086p0;
    public VoIPDebugToSend f23087p1;
    public final SparseIntArray f23088p2;
    public int f23089p3;
    public boolean f23090p4;
    public int f23091p5;
    public boolean f23092p6;
    public final ConcurrentHashMap f23093p7;
    public final HashSet f23094p8;
    public long f23095q0;
    public final a0.h f23096q1;
    public ArrayList f23097q2;
    public int f23098q3;
    public xo f23099q4;
    public int f23100q5;
    public int f23101q6;
    public final c00 f23102q7;
    public final mj f23103q8;
    public final a0.h f23104r;
    public long f23105r0;
    public final HashSet f23106r1;
    public TLRPC.WebPage f23107r2;
    public int f23108r3;
    public xo f23109r4;
    public int r5;
    public int f23110r6;
    public final u2 f23111r7;
    public final LongSparseArray f23112r8;
    public final ArrayList f23113s;
    public long f23114s0;
    public final LongSparseLongArray f23115s1;
    public int f23116s2;
    public int f23117s3;
    public int f23118s4;
    public int f23119s5;
    public String s6;
    public final x00 f23120s7;
    public final HashMap f23121s8;
    public boolean f23122t0;
    public final HashSet f23123t1;
    public boolean f23124t2;
    public String f23125t3;
    public int f23126t4;
    public int f23127t5;
    public String f23128t6;
    public e f23129t7;
    public ap f23130t8;
    public final a0.h f23131u0;
    public final HashSet f23132u1;
    public int f23133u2;
    public int f23134u3;
    public int f23135u4;
    public int f23136u5;
    public String f23137u6;
    public boolean f23138u7;
    public boolean f23139u8;
    public final ArrayList f23140v0;
    public final HashSet f23141v1;
    public boolean f23142v2;
    public int f23143v3;
    public int f23144v4;
    public int f23145v5;
    public String f23146v6;
    public boolean f23147v7;
    public ArrayList f23148v8;
    public final SparseArray f23149w;
    public final ArrayList f23150w0;
    public final HashSet f23151w1;
    public int f23152w2;
    public int f23153w3;
    public int f23154w4;
    public int f23155w5;
    public int f23156w6;
    public boolean f23157w7;
    public TLRPC.EmojiGameInfo f23158w8;
    public final a0.h f23159x;
    public final ArrayList f23160x0;
    public final LongSparseLongArray f23161x1;
    public int f23162x2;
    public int f23163x3;
    public int f23164x4;
    public int f23165x5;
    public int f23166x6;
    public final p0 f23167x7;
    public final mj f23168x8;
    public final ArrayList f23169y;
    public final ArrayList f23170y0;
    public final a0.h f23171y1;
    public TLRPC.Dialog f23172y2;
    public int f23173y3;
    public int f23174y4;
    public int f23175y5;
    public int f23176y6;
    public boolean f23177y7;
    public TL_account.TL_webBrowserSettings f23178y8;
    public final ArrayList f23179z0;
    public final LongSparseIntArray f23180z1;
    public boolean f23181z2;
    public boolean f23182z3;
    public int f23183z4;
    public int f23184z5;
    public int f23185z6;
    public int f23186z7;
    public final ho f23187z8;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            F8[i3] = new Object();
        }
    }

    public hp(int i3) {
        super(i3);
        this.f22963b = new ConcurrentHashMap(100, 1.0f, 2);
        this.f22973c = new ConcurrentHashMap(10, 1.0f, 2);
        this.d = new ConcurrentHashMap(100, 1.0f, 3);
        this.f22991e = new ConcurrentHashMap(100, 1.0f, 2);
        this.f23001f = new ConcurrentHashMap(3, 1.0f, 2);
        this.h = new HashMap();
        this.f23068n = new ArrayList();
        this.f23104r = new a0.h();
        this.f23113s = new ArrayList();
        this.f23149w = new SparseArray();
        this.f23159x = new a0.h();
        this.f23169y = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new mo[2];
        this.O = Integer.MAX_VALUE;
        this.P = new ConcurrentHashMap(100, 1.0f, 2);
        this.Q = new ConcurrentHashMap(100, 1.0f, 2);
        this.R = new a0.h();
        this.S = new a0.h();
        this.T = new a0.h();
        this.U = new LongSparseIntArray();
        this.V = new SparseArray();
        this.W = new ConcurrentHashMap(20, 1.0f, 2);
        this.X = new a0.h();
        this.Y = new a0.h();
        this.Z = new a0.h[12];
        this.f22954a0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.f22964b0 = new LongSparseIntArray();
        this.f22982d0 = new SparseArray();
        this.f22992e0 = 2;
        this.f23002f0 = 5;
        this.m0 = 777000L;
        this.f23077o0 = 10L;
        this.f23086p0 = 7L;
        this.f23095q0 = 10L;
        this.f23105r0 = 4L;
        this.f23114s0 = 3L;
        this.f23131u0 = new a0.h();
        this.f23140v0 = new ArrayList();
        this.f23150w0 = new ArrayList();
        this.f23160x0 = new ArrayList();
        this.f23170y0 = new ArrayList();
        this.f23179z0 = new ArrayList();
        this.A0 = new LongSparseIntArray();
        this.B0 = new a0.h();
        this.C0 = new LongSparseIntArray();
        this.D0 = new a0.h();
        this.E0 = new a0.h();
        this.F0 = new a0.h();
        int i10 = 0;
        this.G0 = false;
        this.H0 = new LongSparseIntArray();
        this.I0 = -1;
        this.K0 = new a0.h();
        this.L0 = new a0.h();
        this.O0 = new SparseIntArray();
        this.P0 = new SparseIntArray();
        this.Q0 = new ArrayList();
        this.R0 = null;
        this.S0 = new ArrayList();
        this.T0 = new SparseArray();
        this.W0 = new ArrayList();
        this.X0 = new a0.h();
        this.Y0 = new LongSparseLongArray();
        this.Z0 = new LongSparseIntArray();
        this.f22955a1 = new a0.h();
        this.f22965b1 = new a0.h();
        this.f22975c1 = new a0.h();
        this.f22983d1 = new a0.h();
        this.f22993e1 = new a0.h();
        this.f23003f1 = new ArrayList();
        this.f23012g1 = new ArrayList();
        this.f23020h1 = new ArrayList();
        this.f23053l1 = new a0.h();
        this.m1 = new a0.h();
        this.f23070n1 = new a0.h();
        this.f23078o1 = new a0.h();
        this.f23096q1 = new a0.h();
        this.f23106r1 = new HashSet();
        this.f23115s1 = new LongSparseLongArray();
        this.f23123t1 = new HashSet();
        this.f23132u1 = new HashSet();
        this.f23141v1 = new HashSet();
        this.f23151w1 = new HashSet();
        this.f23161x1 = new LongSparseLongArray();
        this.f23171y1 = new a0.h();
        this.f23180z1 = new LongSparseIntArray();
        this.A1 = new SparseIntArray();
        this.B1 = new a0.h();
        this.C1 = new a0.h();
        this.D1 = new a0.h();
        this.E1 = new HashMap();
        this.F1 = new a0.h();
        this.G1 = new HashMap();
        this.H1 = new a0.h();
        this.I1 = new HashMap();
        this.J1 = new a0.h();
        this.K1 = new a0.h();
        this.L1 = new a0.h();
        this.M1 = new a0.h();
        this.N1 = new a0.h();
        this.O1 = new a0.h();
        this.P1 = new a0.h();
        this.Q1 = new ArrayList();
        this.R1 = new a0.h();
        this.S1 = new ArrayList();
        this.T1 = new HashMap();
        this.f22956a2 = new SparseIntArray();
        this.f22966b2 = new SparseBooleanArray();
        this.c2 = new SparseBooleanArray();
        this.f22984d2 = new SparseBooleanArray();
        this.f23021h2 = true;
        this.f23088p2 = new SparseIntArray();
        this.f23097q2 = new ArrayList();
        this.I2 = new hc(8);
        this.J2 = new mj(this, 7);
        this.P2 = new a0.h();
        this.Q2 = new HashMap();
        this.U2 = new co(this);
        this.X2 = 100;
        this.f22977c4 = new ArrayList();
        this.f23023h4 = new HashMap();
        this.f23030i4 = new HashMap();
        new HashMap();
        this.O5 = false;
        this.f22998e6 = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.f23050k7 = arrayList;
        this.f23093p7 = new ConcurrentHashMap();
        p0 p0Var = new p0();
        this.f23167x7 = p0Var;
        this.B7 = new SparseArray();
        this.D7 = new Comparator(this) {
            public final hp f22365b;

            {
                this.f22365b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.el.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.E7 = new Comparator(this) {
            public final hp f22365b;

            {
                this.f22365b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.el.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.F7 = new Comparator(this) {
            public final hp f22365b;

            {
                this.f22365b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.el.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.G7 = new o0.a(this, 24);
        this.I7 = new mj(this, 5);
        this.J7 = new mj(this, 12);
        this.K7 = new a0.h();
        this.L7 = new a0.h();
        this.N7 = 1;
        this.O7 = 2;
        this.P7 = 3;
        this.Q7 = new ArrayList();
        this.R7 = new LongSparseIntArray();
        this.S7 = new LongSparseIntArray();
        this.T7 = new LongSparseIntArray();
        this.U7 = new a0.h();
        this.V7 = new HashSet();
        this.f22990d8 = new a0.h();
        this.f23000e8 = new HashSet();
        this.f23010f8 = new mj(this, 13);
        this.f23034i8 = new fo(this);
        this.f23085o8 = new HashSet();
        this.f23094p8 = new HashSet();
        this.f23103q8 = new mj(this, 14);
        this.f23112r8 = new LongSparseArray();
        this.f23121s8 = new HashMap();
        this.f23168x8 = new mj(this, 1);
        this.f23187z8 = new ho(this);
        zb.D();
        getMessagesStorage();
        getLocationController();
        g0.h3(new mj(this, 2));
        k();
        if (this.currentAccount == 0) {
            this.f22989d7 = t0.f25457b.getSharedPreferences("Notifications", 0);
            this.f22999e7 = t0.f25457b.getSharedPreferences("mainconfig", 0);
            this.f23009f7 = t0.f25457b.getSharedPreferences("emoji", 0);
        } else {
            this.f22989d7 = t0.f25457b.getSharedPreferences("Notifications" + this.currentAccount, 0);
            this.f22999e7 = t0.f25457b.getSharedPreferences("mainconfig" + this.currentAccount, 0);
            this.f23009f7 = t0.f25457b.getSharedPreferences("emoji" + this.currentAccount, 0);
        }
        System.currentTimeMillis();
        this.f23039j4 = this.f22999e7.getBoolean("remoteConfigLoaded", false);
        this.H2 = this.f22999e7.getInt("secretWebpage2", 2);
        this.W2 = this.f22999e7.getInt("maxGroupCount", 200);
        this.Y2 = this.f22999e7.getInt("maxMegagroupCount", 10000);
        this.f23014g3 = this.f22999e7.getInt("maxRecentGifsCount", 200);
        this.f22995e3 = this.f22999e7.getInt("maxRecentStickersCount", 30);
        this.f23005f3 = this.f22999e7.getInt("maxFaveStickersCount", 5);
        this.Z2 = this.f22999e7.getInt("maxEditTime", 3600);
        this.f22957a3 = this.f22999e7.getInt("ratingDecay", 2419200);
        this.V2 = this.f22999e7.getString("linkPrefix", "t.me");
        this.f23022h3 = this.f22999e7.getInt("callReceiveTimeout", 20000);
        this.i3 = this.f22999e7.getInt("callRingTimeout", 90000);
        this.f23038j3 = this.f22999e7.getInt("callConnectTimeout", 30000);
        this.f23046k3 = this.f22999e7.getInt("callPacketTimeout", 10000);
        this.f23089p3 = this.f22999e7.getInt("updateCheckDelay", 86400);
        this.f23055l3 = this.f22999e7.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.f23062m3 = this.f22999e7.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.f23134u3 = this.f22999e7.getInt("maxMessageLength", 4096);
        this.f23143v3 = this.f22999e7.getInt("maxCaptionLength", 1024);
        this.f23072n3 = this.f22999e7.getInt("mapProvider", 0);
        this.f23080o3 = this.f22999e7.getInt("availableMapProviders", 3);
        this.f23125t3 = this.f22999e7.getString("pk", null);
        this.S3 = this.f22999e7.getString("installReferer", null);
        this.f22967b3 = this.f22999e7.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.f22976c3 = this.f22999e7.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
        this.f22985d3 = this.f22999e7.getBoolean("canRevokePmInbox", this.f22985d3);
        this.A3 = this.f22999e7.getBoolean("preloadFeaturedStickers", false);
        this.B3 = this.f22999e7.getString("youtubePipType", "disabled");
        this.C3 = this.f22999e7.getBoolean("keepAliveService", false);
        this.D3 = this.f22999e7.getBoolean("backgroundConnection", false);
        this.A2 = this.f22999e7.getLong("proxy_dialog", 0L);
        this.f23133u2 = this.f22999e7.getInt("nextPromoInfoCheckTime", 0);
        this.B2 = this.f22999e7.getInt("promo_dialog_type", 0);
        this.C2 = this.f22999e7.getString("promo_psa_message", null);
        this.D2 = this.f22999e7.getString("promo_psa_type", null);
        this.E2 = this.f22999e7.getString("proxyDialogAddress", null);
        this.L3 = this.f22999e7.getString("gifSearchBot", "gif");
        this.M3 = this.f22999e7.getString("imageSearchBot", "pic");
        this.f23182z3 = this.f22999e7.getBoolean("blockedCountry", false);
        this.P3 = this.f22999e7.getString("suggestedLangCode", "en");
        this.E3 = this.f22999e7.getFloat("animatedEmojisZoom", 0.625f);
        this.Q3 = this.f22999e7.getBoolean("qrLoginCamera", true);
        this.R3 = this.f22999e7.getBoolean("saveGifsWithStickers", false);
        this.F3 = this.f22999e7.getBoolean("filtersEnabled", false);
        this.G3 = this.f22999e7.getBoolean("getfileExperimentalParams", false);
        this.H3 = this.f22999e7.getBoolean("android_download_improvement_killswitch", false);
        this.I3 = this.f22999e7.getBoolean("smsjobsStickyNotificationEnabled", false);
        this.K3 = this.f22999e7.getBoolean("showFiltersTooltip", false);
        this.Z3 = this.f22999e7.getBoolean("autoarchiveAvailable", false);
        this.f22958a4 = this.f22999e7.getInt("groipCallVideoMaxParticipants", 30);
        this.f23098q3 = this.f22999e7.getInt("chatReadMarkSizeThreshold", 100);
        this.f23108r3 = this.f22999e7.getInt("chatReadMarkExpirePeriod", 604800);
        this.f23047k4 = this.f22999e7.getInt("ringtoneDurationMax", 5);
        this.f23056l4 = this.f22999e7.getInt("ringtoneSizeMax", 102400);
        this.f23117s3 = this.f22999e7.getInt("pmReadDateExpirePeriod", 604800);
        this.f22968b4 = this.f22999e7.getBoolean("suggestStickersApiOnly", false);
        this.f23153w3 = this.f22999e7.getInt("roundVideoSize", 384);
        this.f23163x3 = this.f22999e7.getInt("roundVideoBitrate", 1000);
        this.f23173y3 = this.f22999e7.getInt("roundAudioBitrate", 64);
        this.T3 = this.f22999e7.getStringSet("pendingSuggestions", null);
        this.U3 = this.f22999e7.getStringSet("dismissedSuggestions", null);
        this.D4 = this.f22999e7.getInt("channelsLimitDefault", 500);
        this.E4 = this.f22999e7.getInt("channelsLimitPremium", this.D4 * 2);
        this.F4 = this.f22999e7.getInt("savedGifsLimitDefault", 200);
        this.G4 = this.f22999e7.getInt("savedGifsLimitPremium", 400);
        this.H4 = this.f22999e7.getInt("stickersFavedLimitDefault", 5);
        this.I4 = this.f22999e7.getInt("stickersFavedLimitPremium", 200);
        this.J4 = this.f22999e7.getInt("maxPinnedDialogsCountDefault", 5);
        this.K4 = this.f22999e7.getInt("maxPinnedDialogsCountPremium", 5);
        this.J4 = this.f22999e7.getInt("maxPinnedDialogsCountDefault", 5);
        this.K4 = this.f22999e7.getInt("maxPinnedDialogsCountPremium", 5);
        this.L4 = this.f22999e7.getInt("dialogFiltersLimitDefault", 10);
        this.M4 = this.f22999e7.getInt("dialogFiltersLimitPremium", 20);
        this.N4 = this.f22999e7.getInt("dialogFiltersChatsLimitDefault", 100);
        this.O4 = this.f22999e7.getInt("dialogFiltersChatsLimitPremium", 200);
        this.P4 = this.f22999e7.getInt("dialogFiltersPinnedLimitDefault", 5);
        this.Q4 = this.f22999e7.getInt("dialogFiltersPinnedLimitPremium", 10);
        this.R4 = this.f22999e7.getInt("publicLinksLimitDefault", 10);
        this.S4 = this.f22999e7.getInt("publicLinksLimitPremium", 20);
        this.T4 = this.f22999e7.getInt("captionLengthLimitDefault", 1024);
        this.U4 = this.f22999e7.getInt("captionLengthLimitPremium", 4096);
        this.V4 = this.f22999e7.getInt("storyCaptionLengthLimit", 200);
        this.W4 = this.f22999e7.getInt("storyCaptionLengthLimitPremium", 2048);
        this.X4 = this.f22999e7.getInt("aboutLengthLimitDefault", 70);
        this.Y4 = this.f22999e7.getInt("aboutLengthLimitPremium", 140);
        this.Z4 = this.f22999e7.getInt("reactionsUserMaxDefault", 1);
        this.f22959a5 = this.f22999e7.getInt("reactionsUserMaxPremium", 3);
        this.f22969b5 = this.f22999e7.getInt("reactionsInChatMax", 3);
        this.f23101q6 = this.f22999e7.getInt("uploadMaxFileParts", 4000);
        this.f23110r6 = this.f22999e7.getInt("uploadMaxFilePartsPremium", this.f23101q6 * 2);
        this.f23128t6 = this.f22999e7.getString("premiumInvoiceSlug", null);
        this.f23137u6 = this.f22999e7.getString("verifyAgeBotUsername", null);
        this.f23146v6 = this.f22999e7.getString("verifyAgeCountry", "GB");
        this.f23156w6 = this.f22999e7.getInt("verifyAgeMin", 18);
        this.s6 = this.f22999e7.getString("premiumBotUsername", null);
        this.h7 = this.f22999e7.getBoolean("premiumLocked", false);
        this.f23042j7 = this.f22999e7.getBoolean("starsLocked", true);
        this.f23033i7 = this.f22999e7.getInt("transcribeButtonPressed", 0);
        this.f22978c5 = this.f22999e7.getInt("forumUpgradeParticipantsMin", 200);
        this.f22987d5 = this.f22999e7.getInt("topicsPinnedLimit", 3);
        this.f22997e5 = this.f22999e7.getLong("telegramAntispamUserId", -1L);
        this.f23007f5 = this.f22999e7.getInt("telegramAntispamGroupSizeMin", 100);
        this.f23016g5 = this.f22999e7.getInt("hiddenMembersGroupSizeMin", 100);
        this.f23024h5 = this.f22999e7.getInt("chatlistUpdatePeriod", 3600);
        this.f23138u7 = this.f22999e7.getBoolean("uploadMarkupVideo", true);
        this.f23147v7 = this.f22999e7.getBoolean("giftAttachMenuIcon", false);
        this.f23157w7 = this.f22999e7.getBoolean("giftTextFieldIcon", false);
        this.f23186z7 = this.f22999e7.getInt("checkResetLangpack", 0);
        this.f23002f0 = this.f22999e7.getInt("smallQueueMaxActiveOperations", 5);
        this.f22992e0 = this.f22999e7.getInt("largeQueueMaxActiveOperations", 2);
        this.f23011g0 = this.f22999e7.getInt("stories_stealth_future_period", 1500);
        this.m0 = this.f22999e7.getLong("stories_changelog_user_id", 777000L);
        this.f23077o0 = this.f22999e7.getLong("giveaway_add_peers_max", 10L);
        this.f23095q0 = this.f22999e7.getLong("giveaway_countries_max", 10L);
        this.f23105r0 = this.f22999e7.getLong("giveaway_boosts_per_premium", 4L);
        this.f23114s0 = this.f22999e7.getLong("boosts_per_sent_gift", 3L);
        this.f23086p0 = this.f22999e7.getLong("giveaway_period_max", 7L);
        this.f22999e7.getInt("stories_stealth_past_period", 300);
        this.f23019h0 = this.f22999e7.getInt("stories_stealth_cooldown_period", 3600);
        boolean z10 = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        this.f23166x6 = this.f22999e7.getInt("chatlistInvitesLimitDefault", 3);
        this.f23031i5 = this.f22999e7.getInt("storyExpiringLimitDefault", 50);
        this.f23040j5 = this.f22999e7.getInt("storyExpiringLimitPremium", 100);
        this.f23048k5 = this.f22999e7.getInt("storiesSentWeeklyLimitDefault", 7);
        this.f23082o5 = this.f22999e7.getInt("storiesSuggestedReactionsLimitDefault", 1);
        this.f23091p5 = this.f22999e7.getInt("storiesSuggestedReactionsLimitPremium", 5);
        this.f23057l5 = this.f22999e7.getInt("storiesSentWeeklyLimitPremium", 70);
        this.f23064m5 = this.f22999e7.getInt("storiesSentMonthlyLimitDefault", 30);
        this.f23073n5 = this.f22999e7.getInt("storiesSentMonthlyLimitPremium", 300);
        this.f23100q5 = this.f22999e7.getInt("channelBgIconLevelMin", 1);
        this.r5 = this.f22999e7.getInt("channelProfileIconLevelMin", 1);
        this.f23119s5 = this.f22999e7.getInt("channelEmojiStatusLevelMin", 1);
        this.f23145v5 = this.f22999e7.getInt("groupProfileBgIconLevelMin", 1);
        this.f23155w5 = this.f22999e7.getInt("groupEmojiStatusLevelMin", 1);
        this.f23165x5 = this.f22999e7.getInt("groupEmojiStickersLevelMin", 1);
        this.f23175y5 = this.f22999e7.getInt("groupWallpaperLevelMin", 1);
        this.f23184z5 = this.f22999e7.getInt("groupCustomWallpaperLevelMin", 1);
        this.A5 = this.f22999e7.getInt("groupTranscribeLevelMin", 1);
        this.B5 = this.f22999e7.getInt("quickRepliesLimit", 10);
        this.f23127t5 = this.f22999e7.getInt("channelWallpaperLevelMin", 1);
        this.f23136u5 = this.f22999e7.getInt("channelCustomWallpaperLevelMin", 1);
        this.f23176y6 = this.f22999e7.getInt("chatlistInvitesLimitPremium", z10 ? 5 : 20);
        this.f23185z6 = this.f22999e7.getInt("chatlistJoinedLimitDefault", 2);
        this.A6 = this.f22999e7.getInt("chatlistJoinedLimitPremium", z10 ? 5 : 20);
        this.D6 = this.f22999e7.getInt("stargiftsMessageLengthMax", 255);
        this.E6 = this.f22999e7.getInt("stargiftsConvertPeriodMax", z10 ? 300 : 7776000);
        this.F6 = this.f22999e7.getBoolean("videoIgnoreAltDocuments", false);
        this.G6 = this.f22999e7.getBoolean("disableBotFullscreenBlur", false);
        this.H6 = this.f22999e7.getString("tonBlockchainExplorerUrl", "https://tonviewer.com/");
        this.I6 = this.f22999e7.getLong("starsPaidMessageAmountMax", 10000L);
        this.J6 = this.f22999e7.getInt("starsPaidMessageCommissionPermille", 850);
        this.K6 = this.f22999e7.getInt("stargiftsPinnedToTopLimit", 6);
        this.L6 = this.f22999e7.getBoolean("starsPaidMessagesAvailable", true);
        this.M6 = this.f22999e7.getLong("freezeSinceDate", 0L);
        this.N6 = this.f22999e7.getLong("freezeUntilDate", 0L);
        this.P6 = this.f22999e7.getInt("conferenceCallSizeLimit", z10 ? 5 : 100);
        this.Q6 = this.f22999e7.getBoolean("callRequestsDisabled", false);
        this.R6 = this.f22999e7.getInt("todoItemsMax", z10 ? 10 : 30);
        this.S6 = this.f22999e7.getInt("todoTitleLengthMax", 32);
        this.T6 = this.f22999e7.getInt("todoItemLengthMax", 64);
        this.U6 = this.f22999e7.getString("translationsManualEnabled", "enabled");
        this.V6 = this.f22999e7.getString("translationsAutoEnabled", "enabled");
        this.W6 = (HashSet) Collection.EL.stream(this.f22999e7.getStringSet("whitelistedBots", new HashSet())).map(new fa.b(2)).collect(Collectors.toCollection(new ek(0)));
        this.Y6 = this.f22999e7.getInt("starsGroupcallMessageAmountMax", 10000);
        this.X6 = ei.u.d(this.f22999e7.getString("starsGroupcallMessageLimits", null));
        this.O6 = this.f22999e7.getString("freezeAppealUrl", "t.me/spambot");
        this.f23177y7 = this.f22999e7.getBoolean("enableGiftsInProfile", true);
        this.B6 = this.f22999e7.getString("storiesPosting", "enabled");
        this.C6 = this.f22999e7.getString("storiesEntities", "premium");
        this.f23063m4 = this.f22999e7.getBoolean("storiesExportNopublicLink", false);
        this.n4 = this.f22999e7.getInt("authorization_autoconfirm_period", 604800);
        this.f23081o4 = this.f22999e7.getInt("quoteLengthMax", 1024);
        this.f23090p4 = this.f22999e7.getBoolean("giveawayGiftsPurchaseAvailable", false);
        this.f23099q4 = xo.b(0, this.f22999e7.getString("peerColors", ""));
        this.f23109r4 = xo.b(1, this.f22999e7.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.f22999e7;
        boolean z11 = r2.f25040a;
        this.f23118s4 = sharedPreferences.getInt("transcribeAudioTrialWeeklyNumber", 0);
        this.f23144v4 = this.f22999e7.getInt("transcribeAudioTrialCurrentNumber", this.f23118s4);
        this.f23126t4 = this.f22999e7.getInt("transcribeAudioTrialDurationMax", 300);
        this.f23135u4 = this.f22999e7.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.f23154w4 = this.f22999e7.getInt("recommendedChannelsLimitDefault", 10);
        this.f23164x4 = this.f22999e7.getInt("recommendedChannelsLimitPremium", 100);
        this.f23174y4 = this.f22999e7.getInt("boostsChannelLevelMax", 100);
        this.f23183z4 = this.f22999e7.getInt("channelRestrictSponsoredLevelMin", 30);
        this.A4 = this.f22999e7.getInt("channelAutotranslationLevelMin", 3);
        this.f23065m6 = this.f22999e7.getInt("savedDialogsPinnedLimitDefault", 4);
        this.f23074n6 = this.f22999e7.getInt("savedDialogsPinnedLimitPremium", 6);
        this.f23092p6 = this.f22999e7.getBoolean("storyQualityFull", true);
        this.f23083o6 = this.f22999e7.getBoolean("savedViewAsChats", false);
        this.A7 = this.f22999e7.getBoolean("folderTags", false);
        this.C5 = this.f22999e7.getFloat("uploadPremiumSpeedupUpload", 10.0f);
        this.D5 = this.f22999e7.getFloat("uploadPremiumSpeedupDownload", 10.0f);
        this.E5 = this.f22999e7.getInt("uploadPremiumSpeedupNotifyPeriod2", 3600);
        this.F5 = this.f22999e7.getInt("introTitleLengthLimit", 32);
        this.G5 = this.f22999e7.getInt("introDescriptionLengthLimit", 72);
        this.H5 = this.f22999e7.getInt("businessChatLinksLimit", 100);
        this.I5 = this.f22999e7.getBoolean("channelRevenueWithdrawalEnabled", false);
        this.J5 = this.f22999e7.getBoolean("newNoncontactPeersRequirePremiumWithoutOwnpremium", false);
        this.K5 = this.f22999e7.getInt("reactionsUniqMax", 11);
        SharedPreferences sharedPreferences2 = this.f22999e7;
        t0.u();
        this.L5 = sharedPreferences2.getString("premiumManageSubscriptionUrl", "https://play.google.com/store/account/subscriptions?sku=telegram_premium&package=org.telegram.messenger");
        this.M5 = this.f22999e7.getBoolean("androidDisableRoundCamera2", true);
        this.N5 = this.f22999e7.getInt("storiesPinnedToTopCountMax", 3);
        this.O5 = this.f22999e7.getBoolean("showAnnualPerMonth", false);
        this.P5 = this.f22999e7.getBoolean("canEditFactcheck", false);
        this.Q5 = this.f22999e7.getInt("factcheckLengthLimit", 1024);
        this.R5 = this.f22999e7.getLong("starsRevenueWithdrawalMin", 1000L);
        this.S5 = this.f22999e7.getLong("starsPaidPostAmountMax", 10000L);
        this.T5 = this.f22999e7.getInt("botPreviewMediasMax", 10);
        this.B4 = this.f22999e7.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.C4 = this.f22999e7.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.U5 = this.f22999e7.getString("tonProxyAddress", "magic.org");
        this.V5 = this.f22999e7.getString("weatherSearchUsername", "izweatherbot");
        this.W5 = this.f22999e7.getBoolean("storyWeatherPreload", true);
        this.X5 = this.f22999e7.getBoolean("starsGiftsEnabled", true);
        this.Y5 = this.f22999e7.getBoolean("stargiftsBlocked", true);
        this.Z5 = this.f22999e7.getLong("starsPaidReactionAmountMax", 10000L);
        this.f22960a6 = this.f22999e7.getLong("starsSubscriptionAmountMax", 2500L);
        this.f22970b6 = this.f22999e7.getFloat("starsUsdSellRate1000", 2000.0f);
        this.f22979c6 = this.f22999e7.getFloat("starsUsdWithdrawRate1000", 1200.0f);
        this.f22988d6 = this.f22999e7.getBoolean("sponsoredLinksInappAllow", false);
        this.f23008f6 = this.f22999e7.getBoolean("starrefProgramAllowed", false);
        this.f23017g6 = this.f22999e7.getBoolean("starrefConnectAllowed", false);
        this.f22998e6 = this.f22999e7.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.f23025h6 = this.f22999e7.getInt("starrefMinCommissionPermille", 1);
        this.f23032i6 = this.f22999e7.getInt("starrefMaxCommissionPermille", 400);
        this.f23041j6 = this.f22999e7.getInt("botVerificationDescriptionLengthLimit", 70);
        this.f23049k6 = this.f22999e7.getLong("paidReactionsAnonymousTime", 0L);
        this.Z6 = this.f22999e7.getLong("tonStakeddiceStakeAmountMin", 100000000L);
        this.f22961a7 = this.f22999e7.getLong("tonStakeddiceStakeAmountMax", 50000000000L);
        this.f22971b7 = DesugarArrays.stream(this.f22999e7.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new ik(0)).toArray();
        this.f22980c7 = (int[][]) DesugarArrays.stream(this.f22999e7.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new fa.b(3)).toArray(new qk(0));
        p0Var.b(this.f22999e7);
        System.currentTimeMillis();
        this.f23058l6 = null;
        if (System.currentTimeMillis() - this.f23049k6 < 7200000) {
            if (this.f22999e7.contains("paidReactionsDialogId")) {
                this.f23058l6 = Long.valueOf(this.f22999e7.getLong("paidReactionsDialogId", 0L));
            } else {
                this.f23058l6 = Long.valueOf(this.f22999e7.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        g0.h3(new mj(this, 3));
        r2.h = this.f22999e7.getString("googleAuthClientId", r2.h);
        if (this.f22999e7.contains("dcDomainName2")) {
            this.N3 = this.f22999e7.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.N3 = z10 ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.f22999e7.contains("webFileDatacenterId")) {
            this.O3 = this.f22999e7.getInt("webFileDatacenterId", 4);
        } else {
            this.O3 = z10 ? 2 : 4;
        }
        Set<String> stringSet = this.f22999e7.getStringSet("directPaymentsCurrency", null);
        if (stringSet != null) {
            arrayList.clear();
            arrayList.addAll(stringSet);
        }
        SparseIntArray sparseIntArray = this.O0;
        String string = this.f22999e7.getString("premiumFeaturesTypesToPosition", null);
        sparseIntArray.clear();
        if (string != null) {
            String[] split = string.split("_");
            for (int i11 = 0; i11 < split.length; i11++) {
                sparseIntArray.put(Integer.parseInt(split[i11]), i11);
            }
        }
        SparseIntArray sparseIntArray2 = this.P0;
        String string2 = this.f22999e7.getString("businessFeaturesTypesToPosition", null);
        sparseIntArray2.clear();
        if (string2 != null) {
            String[] split2 = string2.split("_");
            for (int i12 = 0; i12 < split2.length; i12++) {
                sparseIntArray2.put(Integer.parseInt(split2[i12]), i12);
            }
        }
        if (this.T3 != null) {
            this.T3 = new HashSet(this.T3);
        } else {
            this.T3 = new HashSet();
        }
        if (this.U3 != null) {
            this.U3 = new HashSet(this.U3);
        } else {
            this.U3 = new HashSet();
        }
        Set<String> stringSet2 = this.f22999e7.getStringSet("exportUri2", null);
        this.W3 = stringSet2;
        if (stringSet2 != null) {
            this.W3 = new HashSet(this.W3);
        } else {
            HashSet hashSet = new HashSet();
            this.W3 = hashSet;
            hashSet.add("content://(\\d+@)?com\\.whatsapp\\.provider\\.media/export_chat/");
            this.W3.add("content://(\\d+@)?com\\.whatsapp\\.w4b\\.provider\\.media/export_chat/");
            this.W3.add("content://jp\\.naver\\.line\\.android\\.line\\.common\\.FileProvider/export-chat/");
            this.W3.add(".*WhatsApp.*\\.txt$");
            this.W3.add(".*WhatsApp.*\\.zip$");
        }
        Set<String> stringSet3 = this.f22999e7.getStringSet("exportGroupUri", null);
        this.X3 = stringSet3;
        if (stringSet3 != null) {
            this.X3 = new HashSet(this.X3);
        } else {
            HashSet hashSet2 = new HashSet();
            this.X3 = hashSet2;
            hashSet2.add("@g.us/");
        }
        Set<String> stringSet4 = this.f22999e7.getStringSet("exportPrivateUri", null);
        this.Y3 = stringSet4;
        if (stringSet4 != null) {
            this.Y3 = new HashSet(this.Y3);
        } else {
            HashSet hashSet3 = new HashSet();
            this.Y3 = hashSet3;
            hashSet3.add("@s.whatsapp.net/");
        }
        Set<String> stringSet5 = this.f22999e7.getStringSet("autologinDomains", null);
        this.f22996e4 = stringSet5;
        if (stringSet5 != null) {
            this.f22996e4 = new HashSet(this.f22996e4);
        } else {
            this.f22996e4 = new HashSet();
        }
        Set<String> stringSet6 = this.f22999e7.getStringSet("authDomains", null);
        this.f23006f4 = stringSet6;
        if (stringSet6 != null) {
            this.f23006f4 = new HashSet(this.f23006f4);
        } else {
            this.f23006f4 = new HashSet();
        }
        this.f23015g4 = this.f22999e7.getString("autologinToken", null);
        Set<String> stringSet7 = this.f22999e7.getStringSet("diceEmojies", null);
        if (stringSet7 == null) {
            HashSet hashSet4 = new HashSet();
            this.f22986d4 = hashSet4;
            hashSet4.add("🎲");
            this.f22986d4.add("🎯");
        } else {
            this.f22986d4 = new HashSet(stringSet7);
        }
        String string3 = this.f22999e7.getString("diceSuccess", null);
        if (string3 == null) {
            this.f23023h4.put("🎯", new qo(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string3, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    boolean z12 = true;
                    int readInt32 = serializedData.readInt32(true);
                    int i13 = 0;
                    while (i13 < readInt32) {
                        this.f23023h4.put(serializedData.readString(z12), new qo(serializedData.readInt32(z12), serializedData.readInt32(z12)));
                        i13++;
                        z12 = true;
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e10) {
                a8.f(e10);
            }
        }
        String string4 = this.f22999e7.getString("emojiSounds", null);
        if (string4 != null) {
            try {
                byte[] decode2 = Base64.decode(string4, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    boolean z13 = true;
                    int readInt322 = serializedData2.readInt32(true);
                    int i14 = 0;
                    while (i14 < readInt322) {
                        this.f23030i4.put(serializedData2.readString(z13), new ro(serializedData2.readInt64(z13), serializedData2.readInt64(z13), serializedData2.readByteArray(z13)));
                        i14++;
                        z13 = true;
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e11) {
                a8.f(e11);
            }
        }
        String string5 = this.f22999e7.getString("gifSearchEmojies", null);
        if (string5 == null) {
            this.f22977c4.add("👍");
            this.f22977c4.add("👎");
            this.f22977c4.add("😍");
            this.f22977c4.add("😂");
            this.f22977c4.add("😮");
            this.f22977c4.add("🙄");
            this.f22977c4.add("😥");
            this.f22977c4.add("😡");
            this.f22977c4.add("🥳");
            this.f22977c4.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string5, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    boolean z14 = true;
                    int readInt323 = serializedData3.readInt32(true);
                    while (i10 < readInt323) {
                        this.f22977c4.add(serializedData3.readString(z14));
                        i10++;
                        z14 = true;
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e12) {
                a8.f(e12);
            }
        }
        g0.i3(new mj(this, 5), 2000L);
        g0.i3(new mj(this, 1), 2000L);
        g0.i3(new mj(this, 6), 400L);
        this.f23102q7 = new c00(i3);
        this.f23111r7 = new u2(i3);
        this.f23120s7 = new x00(this);
        Utilities.f21387e.c(new mj(this, 8));
    }

    public static boolean B2(TLRPC.User user) {
        if (user != null && user.premium && !F2(user)) {
            return true;
        }
        return false;
    }

    public static boolean F2(TLRPC.User user) {
        if (user != null) {
            if (!user.support) {
                long j10 = user.f27150id;
                if (j10 == 777000 || j10 == 333000 || j10 == 4240000 || j10 == 4244000 || j10 == 4245000 || j10 == 4246000 || j10 == 410000 || j10 == 420000 || j10 == 431000 || j10 == 431415000 || j10 == 434000 || j10 == 4243000 || j10 == 439000 || j10 == 449000 || j10 == 450000 || j10 == 452000 || j10 == 454000 || j10 == 4254000 || j10 == 455000 || j10 == 460000 || j10 == 470000 || j10 == 479000 || j10 == 796000 || j10 == 482000 || j10 == 490000 || j10 == 496000 || j10 == 497000 || j10 == 498000 || j10 == 4298000) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean K2(TLRPC.UserFull userFull) {
        if (userFull != null) {
            if (!userFull.noforwards_peer_enabled && !userFull.noforwards_my_enabled) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static long Q1(org.telegram.tgnet.TLRPC.Reaction r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.Q1(org.telegram.tgnet.TLRPC$Reaction):long");
    }

    public static void R4(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var != null && d2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), d2Var.getResourceProvider());
            String M0 = bd.M0(2131751455, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            HashMap hashMap = new HashMap();
            int i3 = org.telegram.ui.ActionBar.k6.L5;
            hashMap.put("info1", Integer.valueOf(d2Var.getThemedColor(i3)));
            hashMap.put("info2", Integer.valueOf(d2Var.getThemedColor(i3)));
            alertDialog$Builder.m(2131624107, 52, d2Var.getThemedColor(i3), hashMap);
            s1Var.X = true;
            alertDialog$Builder.k(bd.M0(2131752041, null), null);
            s1Var.U = str;
            d2Var.showDialog(s1Var);
        }
    }

    public static long V1(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateNewChannelMessage) {
            return ((TL_update.TL_updateNewChannelMessage) update).message.peer_id.channel_id;
        }
        if (update instanceof TL_update.TL_updateEditChannelMessage) {
            return ((TL_update.TL_updateEditChannelMessage) update).message.peer_id.channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelOutbox) {
            return ((TL_update.TL_updateReadChannelOutbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelMessageViews) {
            return ((TL_update.TL_updateChannelMessageViews) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelMessageForwards) {
            return ((TL_update.TL_updateChannelMessageForwards) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelTooLong) {
            return ((TL_update.TL_updateChannelTooLong) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelReadMessagesContents) {
            return ((TL_update.TL_updateChannelReadMessagesContents) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelAvailableMessages) {
            return ((TL_update.TL_updateChannelAvailableMessages) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannel) {
            return ((TL_update.TL_updateChannel) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelWebPage) {
            return ((TL_update.TL_updateChannelWebPage) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateDeleteChannelMessages) {
            return ((TL_update.TL_updateDeleteChannelMessages) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelInbox) {
            return ((TL_update.TL_updateReadChannelInbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updatePinnedForumTopic) {
            return ((TL_update.TL_updatePinnedForumTopic) update).peer.channel_id;
        }
        if (update instanceof TL_update.TL_updatePinnedForumTopics) {
            return ((TL_update.TL_updatePinnedForumTopics) update).peer.channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelDiscussionInbox) {
            return ((TL_update.TL_updateReadChannelDiscussionInbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelDiscussionOutbox) {
            return ((TL_update.TL_updateReadChannelDiscussionOutbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelUserTyping) {
            return ((TL_update.TL_updateChannelUserTyping) update).channel_id;
        }
        if (update instanceof TL_update.TL_updatePinnedChannelMessages) {
            return ((TL_update.TL_updatePinnedChannelMessages) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelViewForumAsMessages) {
            return ((TL_update.TL_updateChannelViewForumAsMessages) update).channel_id;
        }
        if (r2.f25040a) {
            a8.d("trying to get unknown update channel_id for " + update);
            return 0L;
        }
        return 0L;
    }

    public static int W1(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateDeleteMessages) {
            return ((TL_update.TL_updateDeleteMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updateNewChannelMessage) {
            return ((TL_update.TL_updateNewChannelMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateReadHistoryOutbox) {
            return ((TL_update.TL_updateReadHistoryOutbox) update).pts;
        }
        if (update instanceof TL_update.TL_updateNewMessage) {
            return ((TL_update.TL_updateNewMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateEditMessage) {
            return ((TL_update.TL_updateEditMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateWebPage) {
            return ((TL_update.TL_updateWebPage) update).pts;
        }
        if (update instanceof TL_update.TL_updateReadHistoryInbox) {
            return ((TL_update.TL_updateReadHistoryInbox) update).pts;
        }
        if (update instanceof TL_update.TL_updateChannelWebPage) {
            return ((TL_update.TL_updateChannelWebPage) update).pts;
        }
        if (update instanceof TL_update.TL_updateDeleteChannelMessages) {
            return ((TL_update.TL_updateDeleteChannelMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updateEditChannelMessage) {
            return ((TL_update.TL_updateEditChannelMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateReadMessagesContents) {
            return ((TL_update.TL_updateReadMessagesContents) update).pts;
        }
        if (update instanceof TL_update.TL_updateChannelTooLong) {
            return ((TL_update.TL_updateChannelTooLong) update).pts;
        }
        if (update instanceof TL_update.TL_updateFolderPeers) {
            return ((TL_update.TL_updateFolderPeers) update).pts;
        }
        if (update instanceof TL_update.TL_updatePinnedChannelMessages) {
            return ((TL_update.TL_updatePinnedChannelMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updatePinnedMessages) {
            return ((TL_update.TL_updatePinnedMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updateMessageWidgetData) {
            return ((TL_update.TL_updateMessageWidgetData) update).pts;
        }
        return 0;
    }

    public static int X1(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateDeleteMessages) {
            return ((TL_update.TL_updateDeleteMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateNewChannelMessage) {
            return ((TL_update.TL_updateNewChannelMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateReadHistoryOutbox) {
            return ((TL_update.TL_updateReadHistoryOutbox) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateNewMessage) {
            return ((TL_update.TL_updateNewMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateEditMessage) {
            return ((TL_update.TL_updateEditMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateWebPage) {
            return ((TL_update.TL_updateWebPage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateReadHistoryInbox) {
            return ((TL_update.TL_updateReadHistoryInbox) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateChannelWebPage) {
            return ((TL_update.TL_updateChannelWebPage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateDeleteChannelMessages) {
            return ((TL_update.TL_updateDeleteChannelMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateEditChannelMessage) {
            return ((TL_update.TL_updateEditChannelMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateReadMessagesContents) {
            return ((TL_update.TL_updateReadMessagesContents) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateFolderPeers) {
            return ((TL_update.TL_updateFolderPeers) update).pts_count;
        }
        if (update instanceof TL_update.TL_updatePinnedChannelMessages) {
            return ((TL_update.TL_updatePinnedChannelMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updatePinnedMessages) {
            return ((TL_update.TL_updatePinnedMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateMessageWidgetData) {
            return ((TL_update.TL_updateMessageWidgetData) update).pts_count;
        }
        return 0;
    }

    public static int Y1(TLRPC.Update update) {
        if (!(update instanceof TL_update.TL_updateNewMessage) && !(update instanceof TL_update.TL_updateReadMessagesContents) && !(update instanceof TL_update.TL_updateReadHistoryInbox) && !(update instanceof TL_update.TL_updateReadHistoryOutbox) && !(update instanceof TL_update.TL_updateDeleteMessages) && !(update instanceof TL_update.TL_updateWebPage) && !(update instanceof TL_update.TL_updateEditMessage) && !(update instanceof TL_update.TL_updateFolderPeers) && !(update instanceof TL_update.TL_updatePinnedMessages) && !(update instanceof TL_update.TL_updateMessageWidgetData)) {
            if (update instanceof TL_update.TL_updateNewEncryptedMessage) {
                return 1;
            }
            if (!(update instanceof TL_update.TL_updateNewChannelMessage) && !(update instanceof TL_update.TL_updateDeleteChannelMessages) && !(update instanceof TL_update.TL_updateEditChannelMessage) && !(update instanceof TL_update.TL_updateChannelWebPage) && !(update instanceof TL_update.TL_updatePinnedChannelMessages)) {
                return 3;
            }
            return 2;
        }
        return 0;
    }

    public static TLRPC.InputMedia Z4(TLRPC.MessageMedia messageMedia) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaDocument.f27062id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.f27013id = document.f27007id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputMediaPhoto.f27064id = tL_inputPhoto;
            TLRPC.Photo photo = messageMedia.photo;
            tL_inputPhoto.f27020id = photo.f27025id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            return tL_inputMediaPhoto;
        } else {
            return null;
        }
    }

    public static String a(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new qk(1)).collect(Collectors.joining(","));
    }

    public static String c2(TLRPC.User user) {
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            return g0.D2(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            return g0.D2(user.last_name);
        }
        return "";
    }

    public static SharedPreferences d1() {
        return s1(0).f23009f7;
    }

    public static SharedPreferences e1() {
        return s1(0).f22999e7;
    }

    public static SharedPreferences f1() {
        return s1(0).f22989d7;
    }

    public static TLRPC.TL_wallPaperSettings g2(org.telegram.ui.ActionBar.b6 b6Var) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = b6Var.f27428i;
        tL_wallPaperSettings.motion = b6Var.f27429j;
        int i3 = b6Var.d;
        if (i3 != 0) {
            tL_wallPaperSettings.background_color = i3 & 16777215;
            int i10 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (b6Var.f27430k * 100.0f);
            tL_wallPaperSettings.flags = i10 | 9;
        } else {
            float f10 = b6Var.f27430k;
            if (f10 > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f10 * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i11 = b6Var.f27425e;
        if (i11 != 0) {
            tL_wallPaperSettings.second_background_color = i11 & 16777215;
            tL_wallPaperSettings.rotation = g0.s1(b6Var.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i12 = b6Var.f27426f;
        if (i12 != 0) {
            tL_wallPaperSettings.third_background_color = i12 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i13 = b6Var.f27427g;
        if (i13 != 0) {
            tL_wallPaperSettings.fourth_background_color = i13 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static boolean h2(String str, ArrayList arrayList) {
        String lowerCase = str.toLowerCase();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String lowerCase2 = ((TL_account.WebDomainException) arrayList.get(i3)).domain.toLowerCase();
            if (!TextUtils.equals(lowerCase2, lowerCase)) {
                if (lowerCase.endsWith("." + lowerCase2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static TLRPC.InputChannel i1(TLRPC.Chat chat) {
        if (t3.T(chat)) {
            if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                tL_inputChannelFromMessage.channel_id = chat.f27001id;
                tL_inputChannelFromMessage.peer = s1(h10.f22829t0).j1(chat.fromMessageDialogId);
                tL_inputChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputChannelFromMessage;
            }
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.f27001id;
            tL_inputChannel.access_hash = chat.access_hash;
            return tL_inputChannel;
        }
        return new TLRPC.TL_inputChannelEmpty();
    }

    public static TLRPC.InputPeer k1(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return n1((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return l1((TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static TLRPC.InputPeer l1(TLRPC.Chat chat) {
        if (t3.T(chat)) {
            if (chat != null && chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = chat.f27001id;
                tL_inputPeerChannelFromMessage.peer = s1(h10.f22829t0).j1(chat.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.f27001id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
        tL_inputPeerChat.chat_id = chat.f27001id;
        return tL_inputPeerChat;
    }

    public static void m0(ArrayList arrayList, TL_account.WebDomainException webDomainException) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            if (TL_account.WebDomainException.equalsByDomain((TL_account.WebDomainException) arrayList.get(i3), webDomainException)) {
                arrayList.remove(i3);
                i3--;
                size--;
            }
            i3++;
        }
    }

    public static TLRPC.InputPeer n1(TLRPC.User user) {
        if (user != null && user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = user.f27150id;
            tL_inputPeerUserFromMessage.peer = s1(h10.f22829t0).j1(user.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.f27150id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.TL_emojiStatusCollectible q0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.f27230id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.f27007id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.f27007id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public static TLRPC.InputWallPaper r1(org.telegram.ui.ActionBar.b6 b6Var) {
        if (b6Var.f27431l > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.f27073id = b6Var.f27431l;
            tL_inputWallPaper.access_hash = b6Var.f27432m;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = b6Var.f27424c;
        return tL_inputWallPaperSlug;
    }

    public static hp s1(int i3) {
        hp hpVar;
        hp hpVar2 = E8[i3];
        if (hpVar2 == null) {
            synchronized (F8[i3]) {
                try {
                    hpVar = E8[i3];
                    if (hpVar == null) {
                        hp[] hpVarArr = E8;
                        hp hpVar3 = new hp(i3);
                        hpVarArr[i3] = hpVar3;
                        hpVar = hpVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hpVar;
        }
        return hpVar2;
    }

    public static boolean t0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.f27007id == messageMedia2.document.f27007id) {
                return true;
            }
            return false;
        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.f27025id == messageMedia2.photo.f27025id) {
            return true;
        } else {
            return false;
        }
    }

    public static void u0(long j10, TLObject tLObject, ArrayList arrayList) {
        int i3 = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i3 < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                    if (m5.o(message.from_id) == user.f27150id) {
                        user.fromMessageDialogId = j10;
                        user.fromMessageId = message.f27022id;
                        return;
                    }
                    i3++;
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat.access_hash == 0 && chat.fromMessageDialogId == 0 && arrayList != null) {
                while (i3 < arrayList.size()) {
                    TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i3);
                    if (m5.o(message2.from_id) == (-chat.f27001id)) {
                        chat.fromMessageDialogId = j10;
                        chat.fromMessageId = message2.f27022id;
                        return;
                    }
                    i3++;
                }
            }
        }
    }

    public static int v3(ArrayList arrayList) {
        TLRPC.Message message;
        int i3;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; arrayList != null && i11 < arrayList.size(); i11++) {
            zi ziVar = (zi) arrayList.get(i11);
            if (ziVar != null && (message = ziVar.f26868k) != null && (i3 = message.date) > i10) {
                i10 = i3;
            }
        }
        return i10;
    }

    public static SharedPreferences x1(int i3) {
        return s1(i3).f22989d7;
    }

    public static ArrayList y0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                arrayList.add((TLRPC.Update) cls.cast(updates.update));
            }
            if (updates.updates != null) {
                for (int i3 = 0; i3 < updates.updates.size(); i3++) {
                    TLRPC.Update update = updates.updates.get(i3);
                    if (cls.isInstance(update)) {
                        arrayList.add((TLRPC.Update) cls.cast(update));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList z0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                TLRPC.Update update = updates.update;
                updates.update = null;
                arrayList.add((TLRPC.Update) cls.cast(update));
            }
            if (updates.updates != null) {
                int i3 = 0;
                while (i3 < updates.updates.size()) {
                    if (cls.isInstance(updates.updates.get(i3))) {
                        arrayList.add((TLRPC.Update) cls.cast(updates.updates.remove(i3)));
                        i3--;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public final void A() {
        org.telegram.ui.ActionBar.b6 b6Var = this.S2;
        if (b6Var != null) {
            if (b6Var.f27438s != null) {
                for (int i3 = 0; i3 < this.S2.f27438s.size(); i3++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) this.S2.f27438s.get(i3)).intValue(), true);
                }
            }
            w7.G(this.currentAccount).b(this.R2, false);
            long j10 = this.S2.f27433n;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 != 0) {
                if (i10 >= 0) {
                    TLRPC.UserFull b22 = b2(j10);
                    if (b22 != null) {
                        b22.wallpaper = this.S2.f27439t;
                        hs.f(this.currentAccount).k(hs.E0, Long.valueOf(this.S2.f27433n), b22);
                    }
                } else {
                    TLRPC.ChatFull N0 = N0(-j10);
                    if (N0 != null) {
                        N0.wallpaper = this.S2.f27439t;
                        hs f10 = hs.f(this.currentAccount);
                        Boolean bool = Boolean.FALSE;
                        f10.k(hs.T, N0, 0, bool, bool);
                    }
                }
            }
            this.S2 = null;
            this.R2 = null;
        }
    }

    public final void A0() {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i3 = messagesStorage.f24947w;
        qr messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i10 = messagesStorage2.f24945r;
        qr messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        int i11 = messagesStorage3.f24944n;
        qr messagesStorage4 = getMessagesStorage();
        messagesStorage4.H();
        q4(true, i3, i10, i11, messagesStorage4.f24946s);
        us notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        us.f25748l0.c(new is(notificationsController, 9));
    }

    public final String A1(long j10) {
        return B1(j10, false);
    }

    public final boolean A2(long j10) {
        if (j10 > 0) {
            return K2(b2(j10));
        }
        return o2(M0(Long.valueOf(-j10)));
    }

    public final void A3(int i3) {
        boolean z10;
        ArrayList arrayList;
        TLRPC.User f10;
        if (i3 == 1) {
            Context context = t0.f25457b;
            int i10 = this.currentAccount;
            long e10 = getUserConfig().e();
            if (e10 == 0) {
                Object obj = org.telegram.ui.Wallet.o0.f42982f;
            } else {
                synchronized (org.telegram.ui.Wallet.o0.f42982f) {
                    try {
                        ArrayList n4 = org.telegram.ui.Wallet.o0.n(context, e10);
                        int size = n4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = n4.get(i11);
                            i11++;
                            new org.telegram.ui.Wallet.o0(i10, context, (String) obj2).B();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (getUserConfig().d && az.f21629g.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = az.f21629g;
                unregisterdevice.token_type = az.f21626f;
                for (int i12 = 0; i12 < 4; i12++) {
                    h10 i13 = h10.i(i12);
                    if (i12 != this.currentAccount && i13.p()) {
                        unregisterdevice.other_uids.add(Long.valueOf(i13.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new ei.u5(13));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new ij(this, 20));
        } else {
            ConnectionsManager connectionsManager = getConnectionsManager();
            if (i3 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            connectionsManager.cleanup(z10);
        }
        getUserConfig().b();
        b6.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().f23353a.get(hs.I2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                cs csVar = (cs) arrayList2.get(i14);
                if (csVar instanceof fs) {
                    csVar = (cs) ((fs) csVar).f22551b.get();
                }
                if (csVar != null) {
                    arrayList.add(csVar);
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                if (arrayList.get(i15) instanceof LaunchActivity) {
                    break;
                }
            }
        }
        if (h10.f22829t0 == this.currentAccount) {
            int i16 = 0;
            while (true) {
                if (i16 < 4) {
                    if (h10.i(i16).p()) {
                        break;
                    }
                    i16++;
                } else {
                    i16 = -1;
                    break;
                }
            }
            if (i16 != -1) {
                h10.f22829t0 = i16;
                h10.i(0).v(false);
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity != null) {
                    launchActivity.I();
                }
            }
        }
        getNotificationCenter().k(hs.I2, new Object[0]);
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new vq(messagesStorage, false, 1));
        Q();
        g5 contactsController = getContactsController();
        contactsController.getClass();
        try {
            contactsController.f22643a = null;
            AccountManager accountManager = AccountManager.get(t0.f25457b);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i17 = 0; i17 < accountsByType.length; i17++) {
                Account account = accountsByType[i17];
                int i18 = 0;
                while (true) {
                    if (i18 < 4) {
                        if (h10.i(i18).f() != null) {
                            if (account.name.equals("" + f10.f27150id)) {
                                break;
                            }
                        }
                        i18++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i17], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void A4(String str, TLRPC.User user) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = q1(user);
        tL_messages_startBot.peer = j1(user.f27150id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.f21385b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new ij(this, 21));
    }

    public final void B(long j10, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, org.telegram.ui.fz fzVar) {
        TLRPC.InputChatPhoto inputChatPhoto;
        TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto;
        if (tL_inputChatPhoto != null) {
            inputChatPhoto = tL_inputChatPhoto;
        } else if (inputFile == null && inputFile2 == null && videoSize == null) {
            inputChatPhoto = new TLRPC.TL_inputChatPhotoEmpty();
        } else {
            TLRPC.TL_inputChatUploadedPhoto tL_inputChatUploadedPhoto = new TLRPC.TL_inputChatUploadedPhoto();
            if (inputFile != null) {
                tL_inputChatUploadedPhoto.file = inputFile;
                tL_inputChatUploadedPhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_inputChatUploadedPhoto.video = inputFile2;
                int i3 = tL_inputChatUploadedPhoto.flags;
                tL_inputChatUploadedPhoto.video_start_ts = d;
                tL_inputChatUploadedPhoto.flags = i3 | 6;
            }
            if (videoSize != null) {
                tL_inputChatUploadedPhoto.video_emoji_markup = videoSize;
                tL_inputChatUploadedPhoto.flags |= 8;
            }
            inputChatPhoto = tL_inputChatUploadedPhoto;
        }
        if (t3.S(this.currentAccount, j10)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = h1(j10);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j10;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new cm(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j10, fzVar), 64);
    }

    public final void B0(long j10, boolean z10) {
        TLRPC.Chat M0 = M0(Long.valueOf(j10));
        if (M0 != null && t3.S(this.currentAccount, j10)) {
            if ((!t3.r0(M0) || z10) && !M0.creator && !t3.p0(M0)) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.flags = 256;
                int j11 = getUserConfig().j();
                tL_messageService.f27022id = j11;
                tL_messageService.local_id = j11;
                if ((M0 instanceof TLRPC.TL_channel) && !z10) {
                    tL_messageService.date = M0.date;
                } else {
                    tL_messageService.date = getConnectionsManager().getCurrentTime();
                }
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().e();
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_messageService.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j10;
                tL_messageService.dialog_id = -j10;
                tL_messageService.post = true;
                TLRPC.TL_messageActionChatAddUser tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatAddUser();
                tL_messageService.action = tL_messageActionChatAddUser;
                tL_messageActionChatAddUser.users.add(Long.valueOf(getUserConfig().e()));
                getUserConfig().v(false);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(tL_messageService);
                arrayList.add(new zi(this.currentAccount, tL_messageService, true, false));
                getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                g0.h3(new wj(this, j10, arrayList, 3));
            }
        }
    }

    public final String B1(long j10, boolean z10) {
        String str;
        if (j10 >= 0) {
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (z10) {
                return g0.F2(g0.D2(l10.j(a22, true)));
            }
            return g0.F2(g0.D2(l10.p(a22)));
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j10));
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        return g0.F2(g0.D2(str));
    }

    public final boolean B3(long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        TLRPC.InputPeer inputPeer2;
        NativeByteBuffer nativeByteBuffer;
        long z11;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j10);
        if (dialog != null && dialog.pinned != z10) {
            int i3 = dialog.folder_id;
            ArrayList W0 = W0(i3);
            dialog.pinned = z10;
            if (z10) {
                int i10 = 0;
                for (int i11 = 0; i11 < W0.size(); i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i11);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!dialog2.pinned) {
                            if (dialog2.f27005id != this.A2) {
                                break;
                            }
                        } else {
                            i10 = Math.max(dialog2.pinnedNum, i10);
                        }
                    }
                }
                dialog.pinnedNum = i10 + 1;
            } else {
                dialog.pinnedNum = 0;
            }
            NativeByteBuffer nativeByteBuffer2 = null;
            T4(null);
            if (!z10 && !W0.isEmpty() && k2.p1.h(1, W0) == dialog && !this.c2.get(i3)) {
                a1.g.y(1, W0);
            }
            getNotificationCenter().k(hs.f23298s, new Object[0]);
            if (!m5.C(j10) && j11 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z10;
                if (inputPeer == null) {
                    inputPeer2 = j1(j10);
                } else {
                    inputPeer2 = inputPeer;
                }
                if (!(inputPeer2 instanceof TLRPC.TL_inputPeerEmpty)) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer.peer = inputPeer2;
                    tL_messages_toggleDialogPin.peer = tL_inputDialogPeer;
                    if (j11 == 0) {
                        try {
                            nativeByteBuffer = new NativeByteBuffer(inputPeer2.getObjectSize() + 16);
                            try {
                                nativeByteBuffer.writeInt32(4);
                                nativeByteBuffer.writeInt64(j10);
                                nativeByteBuffer.writeBool(z10);
                                inputPeer2.serializeToStream(nativeByteBuffer);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer2 = nativeByteBuffer;
                                a8.g(e, true);
                                nativeByteBuffer = nativeByteBuffer2;
                                z11 = getMessagesStorage().z(nativeByteBuffer);
                                getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new gj(this, z11, 11));
                                qr messagesStorage = getMessagesStorage();
                                messagesStorage.f24934a.c(new rp(messagesStorage, dialog.pinnedNum, j10, 3));
                                return true;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        z11 = getMessagesStorage().z(nativeByteBuffer);
                    } else {
                        z11 = j11;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new gj(this, z11, 11));
                }
            }
            qr messagesStorage2 = getMessagesStorage();
            messagesStorage2.f24934a.c(new rp(messagesStorage2, dialog.pinnedNum, j10, 3));
            return true;
        } else if (dialog != null) {
            return true;
        }
        return false;
    }

    public final void B4(final TLObject tLObject, final ArrayList arrayList, final TLRPC.TL_messages_dialogs tL_messages_dialogs, final TLRPC.TL_messages_dialogs tL_messages_dialogs2, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final SparseArray sparseArray, final ArrayList arrayList5, final HashMap hashMap, final HashSet hashSet, final Runnable runnable) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_chats;
                final ArrayList arrayList6 = arrayList3;
                final ArrayList arrayList7 = arrayList2;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs3 = tL_messages_dialogs;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                if (z10) {
                    arrayList6.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                } else if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    int size = vector.objects.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList7.add((TLRPC.User) vector.objects.get(i3));
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_peerDialogs) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject2;
                    tL_messages_dialogs3.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs3.messages.addAll(tL_messages_peerDialogs.messages);
                    tL_messages_dialogs4.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs4.messages.addAll(tL_messages_peerDialogs.messages);
                    arrayList7.addAll(tL_messages_peerDialogs.users);
                    arrayList6.addAll(tL_messages_peerDialogs.chats);
                }
                ArrayList arrayList8 = arrayList;
                arrayList8.remove(tLObject);
                if (arrayList8.isEmpty()) {
                    final qr messagesStorage = hp.this.getMessagesStorage();
                    p5 p5Var = messagesStorage.f24934a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    p5Var.c(new Runnable() {
                        @Override
                        public final void run() {
                            qr.this.Y0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void C(long j10, String str, ji.g gVar) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (t3.S(this.currentAccount, j10)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = h1(j10);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j10;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new s4(7, this, gVar), 64);
    }

    public final String C0(long j10, long j11) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j10 == j11) {
            return "";
        }
        a0.h hVar = (a0.h) this.f23171y1.f(j10);
        if (hVar != null && (channelParticipant2 = (TLRPC.ChannelParticipant) hVar.f(j11)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return bd.M0(2131752207, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return bd.M0(2131752208, null);
            }
        }
        TLRPC.ChatFull N0 = N0(j10);
        if (N0 != null && N0.participants != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= N0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i3);
                if (chatParticipant.user_id == j11) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return bd.M0(2131752207, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return bd.M0(2131752208, null);
                    }
                } else {
                    i3++;
                }
            }
        }
        return null;
    }

    public final TLRPC.PeerSettings C1(long j10) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull b22 = b2(j10);
        if (b22 != null && (peerSettings = b22.settings) != null) {
            return peerSettings;
        }
        return (TLRPC.PeerSettings) this.f23096q1.f(j10);
    }

    public final boolean C2(long j10, boolean z10) {
        TLRPC.Dialog dialog = this.f23172y2;
        if (dialog != null && dialog.f27005id == j10) {
            if (!z10 || this.f23181z2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C3(TLRPC.Chat chat, TLRPC.User user, int i3, boolean z10, boolean z11, boolean z12) {
        long j10;
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        if (chat != null) {
            j10 = -chat.f27001id;
        } else {
            j10 = user.f27150id;
        }
        tL_messages_updatePinnedMessage.peer = j1(j10);
        tL_messages_updatePinnedMessage.f27127id = i3;
        tL_messages_updatePinnedMessage.unpin = z10;
        tL_messages_updatePinnedMessage.silent = !z12;
        tL_messages_updatePinnedMessage.pm_oneside = z11;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new sm(this, i3, chat, user, z10));
    }

    public final boolean C4(int r17, int r18, long r19, long r21, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.C4(int, int, long, long, java.lang.String):boolean");
    }

    public final void D() {
        if (!this.f23052l0 && P1().h.isEmpty()) {
            i4(1);
        } else {
            boolean[] zArr = {false};
            r0(1, zArr);
            if (zArr[0]) {
                T4(null);
                getNotificationCenter().k(hs.f23298s, new Object[0]);
            }
        }
        getNotificationCenter().k(hs.f23292r, 0);
    }

    public final int D0() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f23149w;
            if (i3 < sparseArray.size()) {
                List list = (List) sparseArray.get(sparseArray.keyAt(i3));
                if (list != null) {
                    i10 = list.size() + i10;
                }
                i3++;
            } else {
                return i10;
            }
        }
    }

    public final CharSequence D1(long j10, long j11, boolean z10) {
        a0.h hVar;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if ((z10 && m5.E(j10) && (a22 = a2(Long.valueOf(j10))) != null && (userStatus = a22.status) != null && userStatus.expires < 0) || (hVar = (a0.h) this.X.f(j10)) == null) {
            return null;
        }
        return (CharSequence) hVar.f(j11);
    }

    public final boolean D2(int i3, long j10, boolean z10) {
        Boolean bool = (Boolean) this.f23121s8.get(j10 + "_" + i3);
        if (bool != null && bool.booleanValue() == z10) {
            return true;
        }
        return false;
    }

    public final boolean D3() {
        if (this.h7 && !getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final void D4(int i3, long j10) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i3;
        tL_channels_setBoostsToUnblockRestrictions.channel = h1(j10);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new gj(this, j10, 15));
    }

    public final boolean E(Bundle bundle, final org.telegram.ui.ActionBar.d2 d2Var, zi ziVar, org.telegram.ui.di diVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String F1;
        org.telegram.ui.ActionBar.s1 s1Var;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (d2Var != null) {
            long j10 = bundle.getLong("user_id", 0L);
            long j11 = bundle.getLong("chat_id", 0L);
            int i3 = bundle.getInt("message_id", 0);
            if (j10 != 0) {
                user = a2(Long.valueOf(j10));
                chat = null;
            } else if (j11 != 0) {
                chat = M0(Long.valueOf(j11));
                user = null;
            } else {
                user = null;
                chat = null;
            }
            if (user != null || chat != null) {
                if (chat != null) {
                    F1 = F1(chat.restriction_reason);
                } else {
                    F1 = F1(user.restriction_reason);
                }
                if (F1 != null) {
                    R4(F1, d2Var);
                    return false;
                } else if (i3 != 0 && ziVar != null && chat != null && chat.access_hash == 0) {
                    long B0 = zi.B0(ziVar.f26868k);
                    if (!m5.C(B0)) {
                        if (diVar != null) {
                            diVar.d();
                            s1Var = null;
                        } else {
                            s1Var = new org.telegram.ui.ActionBar.s1(3, d2Var.getParentActivity(), null);
                        }
                        int i10 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
                        if (i10 < 0) {
                            chat = M0(Long.valueOf(-B0));
                        }
                        if (i10 <= 0 && t3.T(chat)) {
                            TLRPC.Chat M0 = M0(Long.valueOf(-B0));
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = i1(M0);
                            tL_channels_getMessages.f27039id.add(Integer.valueOf(ziVar.f1()));
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.f27097id.add(Integer.valueOf(ziVar.f1()));
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        final int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new tn(this, s1Var, diVar, d2Var, bundle, 1));
                        if (s1Var != null) {
                            s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                @Override
                                public final void onCancel(DialogInterface dialogInterface) {
                                    hp.this.getConnectionsManager().cancelRequest(sendRequest, true);
                                    d2Var.setVisibleDialog(null);
                                }
                            });
                            d2Var.setVisibleDialog(s1Var);
                            s1Var.show();
                            return false;
                        }
                        diVar.f54708b = new k7(this, sendRequest, d2Var, 15);
                        diVar.d();
                        return false;
                    }
                    return true;
                } else if (i3 != 0 && ziVar != null && diVar != null) {
                    diVar.d();
                    diVar.f54708b = s0(-j11, i3, new k4.j(diVar, d2Var, bundle));
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final TLRPC.messages_AvailableEffects E0() {
        if (!this.f23018g8) {
            this.f23018g8 = true;
            this.f23034i8.c(this.currentAccount, 0, new vn(this, 0));
        }
        return this.f23026h8;
    }

    public final Integer E1(long j10, long j11) {
        a0.h hVar = (a0.h) this.Y.f(j10);
        if (hVar == null) {
            return null;
        }
        return (Integer) hVar.f(j11);
    }

    public final boolean E2() {
        TLRPC.UserFull b22 = b2(getUserConfig().e());
        if (b22 == null) {
            return false;
        }
        return !b22.sponsored_enabled;
    }

    public final void E3() {
        int i3 = this.f23033i7;
        if (i3 < 2) {
            this.f23033i7 = i3 + 1;
            SharedPreferences sharedPreferences = this.f22999e7;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.f23033i7).apply();
            }
        }
    }

    public final void E4(int i3, long j10) {
        SharedPreferences.Editor edit = this.f22999e7.edit();
        edit.putInt("chatPendingRequests" + j10, i3).apply();
    }

    public final void F(long j10, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1809401834:
                if (str.equals("USER_BANNED_IN_CHANNEL")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795226617:
                if (str.equals("CHANNEL_PRIVATE")) {
                    c2 = 1;
                    break;
                }
                break;
            case -471086771:
                if (str.equals("CHANNEL_PUBLIC_GROUP_NA")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        int i3 = hs.U;
        switch (c2) {
            case 0:
                getNotificationCenter().k(i3, Long.valueOf(j10), 2);
                return;
            case 1:
                getNotificationCenter().k(i3, Long.valueOf(j10), 0);
                return;
            case 2:
                getNotificationCenter().k(i3, Long.valueOf(j10), 1);
                return;
            default:
                return;
        }
    }

    public final void F0(boolean z10) {
        int size;
        int i3;
        if (getUserConfig().p() && !this.G0) {
            this.G0 = true;
            TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
            if (z10) {
                size = 0;
            } else {
                size = this.H0.size();
            }
            tL_contacts_getBlocked.offset = size;
            if (z10) {
                i3 = 20;
            } else {
                i3 = 100;
            }
            tL_contacts_getBlocked.limit = i3;
            getConnectionsManager().sendRequest(tL_contacts_getBlocked, new n3(this, z10, tL_contacts_getBlocked, 3));
        }
    }

    public final String F1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i3);
                Set set = this.C4;
                if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason)) {
                    if (!"all".equals(restrictionReason.platform)) {
                        if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                            t0.u();
                            if (!r2.a()) {
                            }
                        }
                        if ("android-all".equals(restrictionReason.platform)) {
                        }
                    }
                    return restrictionReason.text;
                }
            }
            return null;
        }
        return null;
    }

    public final void F3(int i3, long j10) {
        LongSparseLongArray longSparseLongArray;
        boolean z10;
        a0.h hVar = this.X0;
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (arrayList != null) {
            LongSparseIntArray longSparseIntArray = this.Z0;
            int i10 = longSparseIntArray.get(j10);
            if (!arrayList.isEmpty() && i10 != 0) {
                Collections.sort(arrayList, new o0.a(20));
                if (i3 == 2) {
                    longSparseIntArray.put(j10, ((TLRPC.Updates) arrayList.get(0)).pts);
                }
                boolean z11 = false;
                while (true) {
                    int size = arrayList.size();
                    longSparseLongArray = this.Y0;
                    if (size <= 0) {
                        break;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) arrayList.get(0);
                    int i11 = updates.pts;
                    if (i11 <= i10) {
                        z10 = true;
                    } else if (updates.pts_count + i10 == i11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        O3(updates, true);
                        if (arrayList.size() <= 0) {
                            break;
                        }
                        arrayList.remove(0);
                        z11 = true;
                    } else if (z10) {
                        long j11 = longSparseLongArray.get(j10);
                        if (j11 != 0 && (z11 || Math.abs(System.currentTimeMillis() - j11) <= 1500)) {
                            if (r2.f25040a) {
                                a8.b("HOLE IN CHANNEL " + j10 + " UPDATES QUEUE - will wait more time");
                            }
                            if (z11) {
                                longSparseLongArray.put(j10, System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (r2.f25040a) {
                            a8.b("HOLE IN CHANNEL " + j10 + " UPDATES QUEUE - getChannelDifference ");
                        }
                        longSparseLongArray.delete(j10);
                        hVar.l(j10);
                        I0(j10);
                        return;
                    } else if (arrayList.size() <= 0) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
                hVar.l(j10);
                longSparseLongArray.delete(j10);
                if (r2.f25040a) {
                    a8.b("UPDATES CHANNEL " + j10 + " QUEUE PROCEED - OK");
                    return;
                }
                return;
            }
            hVar.l(j10);
        }
    }

    public final void F4(boolean z10) {
        TL_account.contentSettings contentsettings = this.f23067m8;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            }
            contentsettings.sensitive_enabled = z10;
        }
        if (this.C4 == null) {
            this.C4 = new HashSet();
        }
        if (z10) {
            this.C4.add("sensitive");
        } else {
            this.C4.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.f22999e7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.C4).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z10;
        getConnectionsManager().sendRequest(setcontentsettings, new ei.u5(12));
    }

    public final void G(long j10, boolean z10) {
        TLRPC.Chat M0 = M0(Long.valueOf(j10));
        if (t3.T(M0) && !M0.creator) {
            a0.h hVar = this.f22965b1;
            if (hVar.h(j10) < 0) {
                if (t3.p0(M0)) {
                    z10 = false;
                }
                boolean z11 = z10;
                hVar.k(Boolean.TRUE, j10);
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = h1(j10);
                tL_channels_getParticipant.participant = j1(getUserConfig().e());
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new vk(this, M0, z11, j10));
            }
        }
    }

    public final f3 G0() {
        f3 f3Var = this.f23069n0;
        if (f3Var != null) {
            return f3Var;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                f3 f3Var2 = this.f23069n0;
                if (f3Var2 != null) {
                    return f3Var2;
                }
                f3 f3Var3 = new f3(this.currentAccount);
                this.f23069n0 = f3Var3;
                return f3Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final nv G1() {
        nv nvVar = this.f23035j0;
        if (nvVar != null) {
            return nvVar;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                nv nvVar2 = this.f23035j0;
                if (nvVar2 != null) {
                    return nvVar2;
                }
                nv nvVar3 = new nv(this.currentAccount);
                this.f23035j0 = nvVar3;
                return nvVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean G2() {
        return !"disabled".equals(this.V6);
    }

    public final boolean G3(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || m5.o(message.peer_id) != getUserConfig().e() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long R1 = zi.R1(getUserConfig().e(), message);
        boolean z10 = false;
        for (int i3 = 0; i3 < message.reactions.results.size(); i3++) {
            if (s5(R1, dh.n0.d(message.reactions.results.get(i3).reaction), false)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void G4(final long j10, int i3, ArrayList arrayList, int i10, Boolean bool, final dh.i iVar, final dh.h hVar) {
        final TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = j1(-j10);
        if (i3 != 2 && !arrayList.isEmpty()) {
            if (i3 == 0) {
                tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
            } else {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
                tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
                tL_chatReactionsSome.reactions.addAll(arrayList);
            }
        } else {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        }
        if (bool != null) {
            tL_messages_setChatAvailableReactions.flags |= 2;
            tL_messages_setChatAvailableReactions.paid_enabled = bool.booleanValue();
        }
        tL_messages_setChatAvailableReactions.flags |= 1;
        tL_messages_setChatAvailableReactions.reactions_limit = i10;
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hp hpVar = hp.this;
                hpVar.getClass();
                if (tLObject != null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    long j11 = j10;
                    TLRPC.ChatFull N0 = hpVar.N0(j11);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= 1073741824;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        hpVar.getMessagesStorage().N1(N0, false);
                    }
                    g0.h3(new nm(hpVar, hVar, j11));
                    return;
                }
                g0.h3(new yh(21, iVar, tL_error));
            }
        });
        TLRPC.ChatFull N0 = N0(j10);
        if (N0 != null) {
            if (N0 instanceof TLRPC.TL_channelFull) {
                N0.flags2 |= 8192;
            } else {
                N0.flags |= 1048576;
            }
            N0.reactions_limit = i10;
            if (bool != null) {
                N0.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().N1(N0, false);
        }
    }

    public final void H(int i3, boolean z10) {
        if (i3 >= 0) {
            SparseArray sparseArray = this.f22982d0;
            jo joVar = (jo) sparseArray.get(i3);
            if (joVar != 0) {
                if (!joVar.f23691a) {
                    if (System.currentTimeMillis() - joVar.f23692b <= this.f23024h5 * 1000 && !z10) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (joVar == 0) {
                joVar = new Object();
                joVar.f23691a = true;
                sparseArray.put(i3, joVar);
            }
            joVar.f23691a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i3;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new rn(this, i3, joVar, 4));
        }
    }

    public final int H0() {
        if (getUserConfig().q()) {
            return this.U4;
        }
        return this.T4;
    }

    public final ap H1() {
        if (this.f23130t8 == null) {
            this.f23130t8 = new ap(this.currentAccount);
        }
        return this.f23130t8;
    }

    public final boolean H2() {
        return !"disabled".equals(this.U6);
    }

    public final void H3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        g0.h3(new dg(this, longSparseIntArray, longSparseIntArray2, 9));
    }

    public final void H4(final long j10, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z10, final org.telegram.ui.ActionBar.d2 d2Var) {
        if (tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = j1(-j10);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new c3.b(1), new n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hp hpVar = hp.this;
                if (tL_error == null) {
                    hpVar.getClass();
                    g0.i3(new dk(hpVar, j10, 19), 1000L);
                    return;
                }
                org.telegram.ui.Components.t4.e0(hpVar.currentAccount, tL_error, d2Var, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z10));
            }
        });
    }

    public final boolean I(boolean z10) {
        a0.h hVar;
        int i3;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.W1 == null && this.X1 == null) || (!z10 && ((i3 = this.V1) == 0 || i3 > currentTime))) {
            return false;
        }
        this.V1 = 0;
        if (this.Y1 != null && !z10) {
            Utilities.d.a(this.Y1);
        }
        a0.h hVar2 = null;
        this.Y1 = null;
        a0.h hVar3 = this.W1;
        if (hVar3 != null) {
            hVar = hVar3.clone();
        } else {
            hVar = null;
        }
        a0.h hVar4 = this.X1;
        if (hVar4 != null) {
            hVar2 = hVar4.clone();
        }
        g0.h3(new kj(this, hVar, hVar2, 0));
        return true;
    }

    public final void I0(long j10) {
        J0(j10, 0, 0L, null);
    }

    public final TLRPC.TL_messages_savedReactionsTags I1(long j10, boolean z10) {
        HashSet hashSet = this.Z7;
        if (hashSet != null && hashSet.contains(Long.valueOf(j10)) && !z10) {
            a0.h hVar = this.f22962a8;
            if (hVar == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) hVar.f(j10);
        }
        if (this.Z7 == null) {
            this.Z7 = new HashSet();
        }
        this.Z7.add(Long.valueOf(j10));
        getMessagesStorage().f24934a.c(new dk(this, j10, 7));
        return null;
    }

    public final boolean I2(long j10) {
        if (j10 != 0 && !m5.C(j10) && j10 != getUserConfig().e()) {
            String str = "dialog_bar_vis3" + j10;
            SharedPreferences sharedPreferences = this.f22989d7;
            if (sharedPreferences.getInt(str, 0) == 2 && k5.w("dialog_bar_report", j10, sharedPreferences, false) && !k5.w("dialog_bar_replied", j10, sharedPreferences, false)) {
                return true;
            }
        }
        return false;
    }

    public final void I3(long j10, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        a0.h hVar = new a0.h(tL_channels_channelParticipants.participants.size());
        for (int i3 = 0; i3 < tL_channels_channelParticipants.participants.size(); i3++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i3);
            hVar.k(channelParticipant, zi.C1(channelParticipant.peer));
        }
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new a4(messagesStorage, j10, hVar, 24));
        g0.h3(new jg(this, j10, hVar, false));
    }

    public final void I4(int i3, long j10) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = j1(j10);
        tL_messages_setHistoryTTL.period = i3;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new ij(this, 2));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
        if (dialog != null) {
            dialog.ttl_period = i3;
        }
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new rp(messagesStorage, i3, j10, 0));
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.ChatFull chatFull = null;
        if (i10 > 0) {
            userFull = b2(j10);
            if (userFull != null) {
                userFull.ttl_period = i3;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull N0 = N0(-j10);
            if (N0 != null) {
                N0.ttl_period = i3;
                if (N0 instanceof TLRPC.TL_channelFull) {
                    N0.flags |= 16777216;
                } else {
                    N0.flags |= 16384;
                }
            }
            chatFull = N0;
            userFull = null;
        }
        if (chatFull != null) {
            hs notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(hs.T, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(hs.E0, Long.valueOf(j10), userFull);
        }
    }

    public final void J(int i3) {
        if (i3 == 0) {
            return;
        }
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new kp(messagesStorage, i3, 5));
    }

    public final void J0(long r18, int r20, long r21, org.telegram.tgnet.TLRPC.InputChannel r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.J0(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public final void J1() {
        I1(0L, false);
    }

    public final TL_account.RequirementToContact J2(long j10) {
        if (!getUserConfig().q() && getUserConfig().e() != j10) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.f22990d8.f(j10);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (a22 == null || a22.contact_require_premium || a22.send_paid_messages_stars != 0) {
                TLRPC.UserFull b22 = b2(j10);
                if (b22 != null) {
                    return l10.o(b22);
                }
                o1(j10);
                this.f23000e8.add(Long.valueOf(j10));
                mj mjVar = this.f23010f8;
                g0.r(mjVar);
                g0.i3(mjVar, 60L);
            }
        }
        return null;
    }

    public final void J3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i3, final int i10, final int i11, final int i12, final boolean z10, final boolean z11, final boolean z12) {
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ql.run():void");
            }
        });
    }

    public final void J4(long j10, long j11) {
        this.f22999e7.edit().putLong(a1.g.p(j10, "forumlasttopic"), j11).apply();
    }

    public final void K(TLRPC.Chat chat, TLRPC.User user, uo uoVar) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (!chat.megagroup && !t3.T(chat)) {
            TLRPC.ChatFull N0 = N0(chat.f27001id);
            boolean z10 = false;
            if (N0 != null) {
                TLRPC.ChatParticipants chatParticipants = N0.participants;
                if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        chatParticipant = N0.participants.participants.get(i3);
                        if (chatParticipant != null && chatParticipant.user_id == user.f27150id) {
                            break;
                        }
                    }
                }
                chatParticipant = null;
                if (chatParticipant != null) {
                    z10 = true;
                }
                TLRPC.ChatParticipants chatParticipants2 = N0.participants;
                if (chatParticipants2 != null && chatParticipants2.admin_id == user.f27150id) {
                    tL_chatAdminRights = org.telegram.ui.ip.t0(true);
                } else {
                    tL_chatAdminRights = null;
                }
                uoVar.a(z10, tL_chatAdminRights, null);
                return;
            }
            uoVar.a(false, null, null);
            return;
        }
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = h1(chat.f27001id);
        tL_channels_getParticipant.participant = n1(user);
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new s1(uoVar, 4));
    }

    public final void K0(TLRPC.Chat chat, TLRPC.User user, u10 u10Var) {
        if (chat != null) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = h1(chat.f27001id);
            tL_channels_getParticipant.participant = n1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new c3(u10Var, 1));
            return;
        }
        u10Var.a(null);
    }

    public final java.lang.String K1(org.telegram.tgnet.TLRPC.Reaction r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.K1(org.telegram.tgnet.TLRPC$Reaction):java.lang.String");
    }

    public final void K3(final org.telegram.tgnet.TLRPC.messages_Messages r50, final int r51, long r52, final long r54, final int r56, final int r57, final int r58, final boolean r59, final int r60, final int r61, final int r62, final int r63, final int r64, final int r65, final boolean r66, final int r67, long r68, final int r70, final boolean r71, final int r72, final boolean r73, final boolean r74, final org.telegram.messenger.sz r75) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.K3(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.sz):void");
    }

    public final void K4(long j10, boolean z10, boolean z11) {
        if (!z10) {
            ArrayList arrayList = this.f23160x0;
            if (z11) {
                if (arrayList.contains(Long.valueOf(j10))) {
                    return;
                }
                arrayList.add(Long.valueOf(j10));
            } else {
                arrayList.remove(Long.valueOf(j10));
                SparseArray sparseArray = (SparseArray) this.L0.f(j10);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((zi) sparseArray.valueAt(i3)).f26902t0 = false;
                    }
                }
            }
        }
        Utilities.d.c(new ji.k(this, z10, z11, j10, 2));
    }

    public final void L(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j10) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (!m5.C(dialog.f27005id)) {
            long j11 = dialog.f27005id;
            a0.h hVar = this.f22993e1;
            if (hVar.h(j11) < 0) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                if (inputPeer == null) {
                    inputPeer = j1(dialog.f27005id);
                }
                tL_messages_getHistory.peer = inputPeer;
                tL_messages_getHistory.limit = 1;
                hVar.k(Boolean.TRUE, dialog.f27005id);
                if (r2.f25040a) {
                    k2.p1.r(dialog.f27005id, new StringBuilder("checkLastDialogMessage for "));
                }
                if (j10 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tL_messages_getHistory.peer.getObjectSize() + 60);
                    } catch (Exception e10) {
                        nativeByteBuffer = null;
                        exc = e10;
                    }
                    try {
                        nativeByteBuffer.writeInt32(14);
                        nativeByteBuffer.writeInt64(dialog.f27005id);
                        nativeByteBuffer.writeInt32(dialog.top_message);
                        nativeByteBuffer.writeInt32(dialog.read_inbox_max_id);
                        nativeByteBuffer.writeInt32(dialog.read_outbox_max_id);
                        nativeByteBuffer.writeInt32(dialog.unread_count);
                        nativeByteBuffer.writeInt32(dialog.last_message_date);
                        nativeByteBuffer.writeInt32(dialog.pts);
                        nativeByteBuffer.writeInt32(dialog.flags);
                        nativeByteBuffer.writeBool(dialog.pinned);
                        nativeByteBuffer.writeInt32(dialog.pinnedNum);
                        nativeByteBuffer.writeInt32(dialog.unread_mentions_count);
                        nativeByteBuffer.writeBool(dialog.unread_mark);
                        nativeByteBuffer.writeInt32(dialog.folder_id);
                        tL_messages_getHistory.peer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e11) {
                        exc = e11;
                        a8.g(exc, true);
                        j10 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getHistory, new fj(this, dialog, j10, 9));
                    }
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getHistory, new fj(this, dialog, j10, 9));
            }
        }
    }

    public final io L0(long j10) {
        io ioVar;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.Y7 == null) {
            this.Y7 = new HashMap();
        }
        boolean q10 = getUserConfig().q();
        if (this.Y7.containsKey(Long.valueOf(j10))) {
            ioVar = (io) this.Y7.get(Long.valueOf(j10));
            if (ioVar == null || ioVar.f23563a == q10) {
                return ioVar;
            }
        } else {
            ioVar = null;
        }
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = o1(j10);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (i3 != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = h1(-j10);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.Y7.put(Long.valueOf(j10), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new kf(this, q10, j10, 1));
        return ioVar;
    }

    public final TLRPC.TL_channels_sendAsPeers L1(long j10) {
        return M1(j10, false);
    }

    public final boolean L2(boolean z10) {
        ArrayList<TL_account.WebDomainException> arrayList;
        int i3;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        if (tL_webBrowserSettings == null) {
            return false;
        }
        if (z10) {
            arrayList = tL_webBrowserSettings.external_exceptions;
        } else {
            arrayList = tL_webBrowserSettings.inapp_exceptions;
        }
        int size = arrayList.size();
        if (getConnectionsManager().isTestBackend()) {
            i3 = 5;
        } else {
            i3 = 100;
        }
        if (size < i3) {
            return false;
        }
        return true;
    }

    public final void L3(int i3, int i10, long j10) {
        if (r2.f25040a) {
            k2.p1.r(j10, com.google.android.recaptcha.internal.a.m("processNewChannelDifferenceParams pts = ", i3, " pts_count = ", i10, " channeldId = "));
        }
        LongSparseIntArray longSparseIntArray = this.Z0;
        int i11 = longSparseIntArray.get(j10);
        if (i11 == 0) {
            i11 = getMessagesStorage().N(j10);
            if (i11 == 0) {
                i11 = 1;
            }
            longSparseIntArray.put(j10, i11);
        }
        if (i11 + i10 == i3) {
            if (r2.f25040a) {
                a8.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j10, i3);
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new rp(messagesStorage, i3, j10, 5));
        } else if (i11 != i3) {
            LongSparseLongArray longSparseLongArray = this.Y0;
            long j11 = longSparseLongArray.get(j10);
            if (!((Boolean) this.f22955a1.g(Boolean.FALSE, j10)).booleanValue() && j11 != 0 && Math.abs(System.currentTimeMillis() - j11) > 1500) {
                I0(j10);
                return;
            }
            if (r2.f25040a) {
                a8.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i3 + " pts_count = " + i10);
            }
            if (j11 == 0) {
                longSparseLongArray.put(j10, System.currentTimeMillis());
            }
            TLRPC.Updates updates = new TLRPC.Updates();
            updates.pts = i3;
            updates.pts_count = i10;
            updates.chat_id = j10;
            a0.h hVar = this.X0;
            ArrayList arrayList = (ArrayList) hVar.f(j10);
            if (arrayList == null) {
                arrayList = k5.j(hVar, j10);
            }
            arrayList.add(updates);
        }
    }

    public final void L4(long j10, boolean z10, boolean z11) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.f23179z0;
        } else {
            arrayList = this.f23170y0;
        }
        if (z11) {
            if (arrayList.contains(Long.valueOf(j10))) {
                return;
            }
            arrayList.add(Long.valueOf(j10));
            return;
        }
        arrayList.remove(Long.valueOf(j10));
    }

    public final void M(boolean z10) {
        int i3;
        xo xoVar;
        int i10;
        if (getUserConfig().f() != null) {
            if (!this.f22972b8 && ((xoVar = this.f23099q4) == null || xoVar.g() || z10)) {
                this.f22972b8 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                xo xoVar2 = this.f23099q4;
                if (xoVar2 != null) {
                    i10 = xoVar2.f26418b;
                } else {
                    i10 = 0;
                }
                tL_help_getPeerColors.hash = i10;
                if (xoVar2 != null && xoVar2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new ij(this, 22));
            }
            if (!this.f22981c8) {
                xo xoVar3 = this.f23109r4;
                if (xoVar3 == null || xoVar3.g() || z10) {
                    this.f22981c8 = true;
                    TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                    xo xoVar4 = this.f23109r4;
                    if (xoVar4 != null) {
                        i3 = xoVar4.f26418b;
                    } else {
                        i3 = 0;
                    }
                    tL_help_getPeerProfileColors.hash = i3;
                    if (xoVar4 != null && xoVar4.g()) {
                        tL_help_getPeerProfileColors.hash = 0;
                    }
                    getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new ij(this, 23));
                }
            }
        }
    }

    public final TLRPC.Chat M0(Long l10) {
        return (TLRPC.Chat) this.f22963b.get(l10);
    }

    public final TLRPC.TL_channels_sendAsPeers M1(long j10, boolean z10) {
        a0.h hVar;
        TLRPC.Chat M0;
        if (z10) {
            hVar = this.D1;
        } else {
            hVar = this.C1;
        }
        a0.h hVar2 = hVar;
        cp cpVar = (cp) hVar2.f(j10);
        if (cpVar != null) {
            return cpVar.f22051a;
        }
        if (!z10 && ((M0 = M0(Long.valueOf(-j10))) == null || !t3.k(M0))) {
            return null;
        }
        ?? obj = new Object();
        hVar2.k(obj, j10);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = j1(j10);
        tL_channels_getSendAs.for_live_stories = z10;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new y3(this, hVar2, j10, (cp) obj, z10));
        return null;
    }

    public final boolean M2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        if (tL_webBrowserSettings != null && !tL_webBrowserSettings.open_external_browser) {
            return true;
        }
        return false;
    }

    public final void M3(int i3, int i10, int i11) {
        if (r2.f25040a) {
            k2.p1.q(i11, com.google.android.recaptcha.internal.a.m("processNewDifferenceParams seq = -1 pts = ", i3, " date = ", i10, " pts_count = "));
        }
        if (i3 != -1) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.H();
            if (messagesStorage.f24945r + i11 == i3) {
                if (r2.f25040a) {
                    a8.b("APPLY PTS");
                }
                getMessagesStorage().I1(i3);
                qr messagesStorage2 = getMessagesStorage();
                qr messagesStorage3 = getMessagesStorage();
                messagesStorage3.H();
                int i12 = messagesStorage3.f24947w;
                qr messagesStorage4 = getMessagesStorage();
                messagesStorage4.H();
                int i13 = messagesStorage4.f24945r;
                qr messagesStorage5 = getMessagesStorage();
                messagesStorage5.H();
                int i14 = messagesStorage5.f24944n;
                qr messagesStorage6 = getMessagesStorage();
                messagesStorage6.H();
                messagesStorage2.A1(i12, i13, i14, messagesStorage6.f24946s);
                return;
            }
            qr messagesStorage7 = getMessagesStorage();
            messagesStorage7.H();
            if (messagesStorage7.f24945r != i3) {
                if (!this.f23013g2 && this.f23036j1 != 0 && Math.abs(System.currentTimeMillis() - this.f23036j1) > 1500) {
                    X0();
                    return;
                }
                if (r2.f25040a) {
                    a8.b("ADD UPDATE TO QUEUE pts = " + i3 + " pts_count = " + i11);
                }
                if (this.f23036j1 == 0) {
                    this.f23036j1 = System.currentTimeMillis();
                }
                TLRPC.Updates updates = new TLRPC.Updates();
                updates.pts = i3;
                updates.pts_count = i11;
                this.f23012g1.add(updates);
            }
        }
    }

    public final void M4(final long j10, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z10, final org.telegram.ui.ActionBar.d2 d2Var, final org.telegram.messenger.voip.l0 l0Var) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = h1(j10);
        if (user != null) {
            tL_channels_editBanned.participant = n1(user);
        } else {
            tL_channels_editBanned.participant = l1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hp hpVar = hp.this;
                if (tL_error == null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new dk(hpVar, j10, 17), 1000L);
                    Runnable runnable = l0Var;
                    if (runnable != null) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                g0.h3(new bn((c1) hpVar, (Object) tL_error, (Object) d2Var, (Object) tL_channels_editBanned, z10, 0));
            }
        });
    }

    public final void N(boolean z10) {
        String str;
        boolean z11 = false;
        if (z10 && this.f23142v2) {
            this.f23142v2 = false;
        }
        if ((z10 || this.f23133u2 <= getConnectionsManager().getCurrentTime()) && !this.f23142v2) {
            if (this.f23152w2 != 0) {
                getConnectionsManager().cancelRequest(this.f23152w2, true);
                this.f23152w2 = 0;
            }
            SharedPreferences e12 = e1();
            e12.getBoolean("proxy_enabled", false);
            String string = e12.getString("proxy_ip", "");
            String string2 = e12.getString("proxy_secret", "");
            if (this.A2 != 0 && this.B2 == 0 && (str = this.E2) != null) {
                if (!str.equals(string + string2)) {
                    z11 = true;
                }
            }
            int i3 = this.f23162x2 + 1;
            this.f23162x2 = i3;
            this.f23142v2 = true;
            this.f23152w2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new tg(this, i3, string, string2, 1));
            if (z11) {
                this.A2 = 0L;
                this.E2 = null;
                this.f23133u2 = getConnectionsManager().getCurrentTime() + 3600;
                e1().edit().putLong("proxy_dialog", this.A2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.f23133u2).commit();
                g0.h3(new in(this, 8));
            }
        }
    }

    public final TLRPC.ChatFull N0(long j10) {
        return (TLRPC.ChatFull) this.m1.f(j10);
    }

    public final long N1(long j10) {
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 > 0) {
            if (j10 == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull b22 = b2(j10);
            if (b22 != null) {
                return b22.send_paid_messages_stars;
            }
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (a22 != null && a22.send_paid_messages_stars > 0) {
                return m5.k(J2(a22.f27150id));
            }
        } else if (i3 < 0) {
            long j11 = -j10;
            TLRPC.Chat M0 = M0(Long.valueOf(j11));
            if (t3.N(M0)) {
                return 0L;
            }
            if (t3.p0(M0) && t3.A(this.currentAccount, M0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull N0 = N0(j11);
            if (N0 != null) {
                return N0.send_paid_messages_stars;
            }
            if (M0 != null) {
                return M0.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public final boolean N2(String str) {
        boolean h22;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        if (tL_webBrowserSettings != null && str != null) {
            String K0 = g0.K0(str, false);
            if (K0 == null) {
                K0 = g0.K0("//".concat(str), false);
            }
            if (tL_webBrowserSettings.open_external_browser) {
                h22 = !h2(K0, tL_webBrowserSettings.inapp_exceptions);
            } else {
                h22 = h2(K0, tL_webBrowserSettings.external_exceptions);
            }
            if (!h22) {
                return true;
            }
        }
        return false;
    }

    public final boolean N3(java.util.ArrayList r89, final java.util.ArrayList r90, final java.util.ArrayList r91, boolean r92, final int r93) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.N3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void N4(boolean z10) {
        if (this.f23083o6 != z10) {
            SharedPreferences.Editor edit = this.f22999e7.edit();
            this.f23083o6 = z10;
            edit.putBoolean("savedViewAsChats", z10).apply();
        }
    }

    public final void O(long j10, long j11, SparseBooleanArray sparseBooleanArray) {
        P(j10, j11, sparseBooleanArray, false);
    }

    public final int O0(long j10) {
        TLRPC.ChatFull N0 = s1(this.currentAccount).N0(-j10);
        if (N0 != null && (!(N0 instanceof TLRPC.TL_chatFull) ? (N0.flags2 & 8192) != 0 : (N0.flags & 1048576) != 0)) {
            return N0.reactions_limit;
        }
        return this.K5;
    }

    public final dp O1(long j10) {
        a0.h hVar = this.B1;
        dp dpVar = (dp) hVar.f(j10);
        if (dpVar != null && (dpVar.d || Math.abs(SystemClock.elapsedRealtime() - dpVar.f22231c) <= 300000)) {
            return dpVar;
        }
        if (j10 >= 0 ? !l10.t(a2(Long.valueOf(j10))) : !t3.T(M0(Long.valueOf(-j10)))) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        hVar.k(obj, j10);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = j1(j10);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new fj(this, j10, (Object) obj, 0));
        return null;
    }

    public final boolean O2() {
        if (!M2()) {
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
            if (tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O3(org.telegram.tgnet.TLRPC.Updates r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.O3(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public final void O4(int i3, long j10) {
        if (i3 == 0) {
            this.f23028i1 = j10;
        } else if (i3 == 1) {
            this.f23036j1 = j10;
        } else if (i3 == 2) {
            this.k1 = j10;
        }
    }

    public final void P(final long j10, final long j11, final SparseBooleanArray sparseBooleanArray, final boolean z10) {
        String str;
        String str2;
        if (z10) {
            str = "reaction_mentions";
        } else {
            str = "poll_votes_mentions";
        }
        final String str3 = str;
        if (z10) {
            str2 = "reaction_mentions_topics";
        } else {
            str2 = "poll_votes_mentions_topics";
        }
        final String str4 = str2;
        final boolean z11 = !z10;
        getMessagesStorage().f24934a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nj.run():void");
            }
        });
    }

    public final ko P0(long j10) {
        LongSparseArray longSparseArray = this.f23112r8;
        ko koVar = (ko) longSparseArray.get(j10);
        if (koVar == null) {
            ko koVar2 = new ko(this.currentAccount, j10);
            longSparseArray.put(j10, koVar2);
            return koVar2;
        }
        return koVar;
    }

    public final ei.z6 P1() {
        ei.z6 z6Var = this.f23027i0;
        if (z6Var != null) {
            return z6Var;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                ei.z6 z6Var2 = this.f23027i0;
                if (z6Var2 != null) {
                    return z6Var2;
                }
                ei.z6 z6Var3 = new ei.z6(this.currentAccount);
                this.f23027i0 = z6Var3;
                return z6Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void P2(int r65, java.util.ArrayList r66, java.util.ArrayList r67, java.util.ArrayList r68, java.util.ArrayList r69, a0.h r70, int r71, org.telegram.messenger.support.LongSparseIntArray r72, a0.h r73, a0.h r74, java.util.ArrayList r75, a0.h r76, a0.h r77, cg.u r78, a0.h r79, boolean r80, java.util.ArrayList r81, java.util.ArrayList r82, a0.h r83, a0.h r84, a0.h r85, java.util.ArrayList r86) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.P2(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, a0.h, int, org.telegram.messenger.support.LongSparseIntArray, a0.h, a0.h, java.util.ArrayList, a0.h, a0.h, cg.u, a0.h, boolean, java.util.ArrayList, java.util.ArrayList, a0.h, a0.h, a0.h, java.util.ArrayList):void");
    }

    public final void P3(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.P3(int, int):void");
    }

    public final void P4(final long j10, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z10, final org.telegram.ui.ActionBar.d2 d2Var, boolean z11, boolean z12, String str2, final Runnable runnable, final so soVar) {
        if (user != null && tL_chatAdminRights != null) {
            final TLRPC.Chat M0 = M0(Long.valueOf(j10));
            final boolean Y = t3.Y(M0);
            boolean z13 = true;
            if (t3.T(M0)) {
                final TLRPC.TL_channels_editAdmin tL_channels_editAdmin = new TLRPC.TL_channels_editAdmin();
                tL_channels_editAdmin.channel = i1(M0);
                tL_channels_editAdmin.user_id = q1(user);
                tL_channels_editAdmin.admin_rights = tL_chatAdminRights;
                if (!TextUtils.isEmpty(str)) {
                    tL_channels_editAdmin.flags |= 1;
                    tL_channels_editAdmin.rank = str;
                }
                RequestDelegate requestDelegate = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hp hpVar = hp.this;
                        if (tL_error == null) {
                            hpVar.O3((TLRPC.Updates) tLObject, false);
                            g0.i3(new nm(hpVar, j10, runnable, 2), 1000L);
                            return;
                        }
                        boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                        so soVar2 = soVar;
                        if (equals) {
                            TLRPC.Chat chat = M0;
                            if (!t3.Y(chat) && t3.y(3, chat)) {
                                g0.h3(new cn(hpVar, user, chat, soVar2, tL_error, 0));
                                return;
                            }
                        }
                        g0.h3(new dn(hpVar, tL_error, d2Var, tL_channels_editAdmin, z10, Y));
                        if (soVar2 != null) {
                            g0.h3(new qm(soVar2, tL_error, 1));
                        }
                    }
                };
                if (!user.bot && z11) {
                    m(j10, user, 0, str2, d2Var, true, new dg(this, tL_channels_editAdmin, requestDelegate, 10), soVar, null);
                    return;
                } else {
                    getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                    return;
                }
            }
            TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
            tL_messages_editChatAdmin.chat_id = j10;
            tL_messages_editChatAdmin.user_id = q1(user);
            if (!z12 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
                z13 = false;
            }
            boolean z14 = z13;
            tL_messages_editChatAdmin.is_admin = z14;
            ci.r3 r3Var = new ci.r3(this, j10, runnable, d2Var, tL_messages_editChatAdmin, soVar);
            if (!z14 && !z11 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tL_messages_editChatAdmin, r3Var);
            } else {
                m(j10, user, 0, str2, d2Var, true, new dg(this, tL_messages_editChatAdmin, r3Var, 11), soVar, null);
            }
        }
    }

    public final void Q() {
        g5 contactsController = getContactsController();
        contactsController.Z.clear();
        contactsController.f22644a0.clear();
        contactsController.f22646b0.clear();
        contactsController.f22653f0.clear();
        contactsController.f22654g0.clear();
        contactsController.f22655h0.clear();
        contactsController.f22657j0.clear();
        contactsController.f22656i0.clear();
        contactsController.f22658k0.clear();
        contactsController.f22665x.clear();
        contactsController.f22659l0.clear();
        contactsController.m0.clear();
        contactsController.f22648c0.clear();
        contactsController.f22649d0.clear();
        contactsController.f22651e0.clear();
        contactsController.f22645b = false;
        contactsController.f22650e = false;
        contactsController.f22660n = false;
        contactsController.h = false;
        contactsController.f22662r = false;
        contactsController.f22664w = "";
        contactsController.G = 0;
        contactsController.H = 0;
        contactsController.I = 0;
        Arrays.fill(contactsController.J, 0);
        contactsController.K = null;
        contactsController.L = null;
        contactsController.M = null;
        contactsController.N = null;
        contactsController.O = null;
        contactsController.P = null;
        contactsController.Q = null;
        contactsController.V = null;
        contactsController.W = null;
        contactsController.R = null;
        contactsController.S = null;
        Utilities.f21387e.c(new x4(contactsController, 5));
        MediaController.B().o();
        us notificationsController = getNotificationsController();
        notificationsController.f25773w.clear();
        notificationsController.f25774x.clear();
        notificationsController.R = false;
        us.f25748l0.c(new is(notificationsController, 4));
        yy sendMessagesHelper = getSendMessagesHelper();
        sendMessagesHelper.f26678a.clear();
        sendMessagesHelper.f26679b.clear();
        sendMessagesHelper.f26680c.clear();
        sendMessagesHelper.d.clear();
        sendMessagesHelper.f26682f.b();
        sendMessagesHelper.f26681e.clear();
        sendMessagesHelper.h.b();
        sendMessagesHelper.f26683n.clear();
        sendMessagesHelper.f26684r.clear();
        sendMessagesHelper.f26686w.clear();
        sendMessagesHelper.f26688y.clear();
        sendMessagesHelper.E.b();
        sendMessagesHelper.F.clear();
        sendMessagesHelper.G.clear();
        sendMessagesHelper.H.r();
        vv secretChatHelper = getSecretChatHelper();
        secretChatHelper.f26113a.clear();
        secretChatHelper.f26116e.clear();
        secretChatHelper.f26114b.clear();
        secretChatHelper.f26115c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f26117f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.f26118n = false;
        ld locationController = getLocationController();
        locationController.J.clear();
        locationController.K.b();
        locationController.f23976c.b();
        locationController.H.b();
        locationController.d.b();
        ld.s();
        Utilities.d.c(new cd(locationController, 2));
        li mediaDataController = getMediaDataController();
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = mediaDataController.f24025g0;
            if (i3 >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i3];
            if (arrayList != null) {
                arrayList.clear();
            }
            mediaDataController.f24027h0[i3] = false;
            mediaDataController.f24029i0[i3] = false;
            i3++;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            mediaDataController.Y[i10] = 0;
            mediaDataController.Z[i10] = 0;
            mediaDataController.H[i10].clear();
            mediaDataController.W[i10] = false;
            mediaDataController.X[i10] = false;
        }
        mediaDataController.f24044q1.b();
        int[] iArr = mediaDataController.f24046r0;
        iArr[0] = 0;
        long[] jArr = mediaDataController.f24043q0;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        mediaDataController.f24020e0.clear();
        mediaDataController.f24023f0.clear();
        mediaDataController.f24017d0.b();
        mediaDataController.f24053u0[0].b();
        mediaDataController.f24051t0[0].clear();
        mediaDataController.f24053u0[1].b();
        mediaDataController.f24051t0[1].clear();
        mediaDataController.f24055v0[0].clear();
        mediaDataController.f24055v0[1].clear();
        mediaDataController.f24031j0.clear();
        mediaDataController.J.b();
        mediaDataController.K.b();
        mediaDataController.O.clear();
        mediaDataController.R.clear();
        mediaDataController.S.b();
        mediaDataController.T.clear();
        boolean[] zArr = mediaDataController.f24061x0;
        zArr[0] = false;
        boolean[] zArr2 = mediaDataController.f24064y0;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        mediaDataController.f24033k0 = false;
        mediaDataController.f24034l0 = false;
        mediaDataController.A1.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.f21387e.c(new hc(7));
        }
        mediaDataController.f24012b0.clear();
        mediaDataController.f24040o1 = false;
        mediaDataController.f24038n1 = false;
        mediaDataController.f24032j1.clear();
        mediaDataController.k1.clear();
        mediaDataController.f24035l1.clear();
        mediaDataController.m1.clear();
        g0.h3(new xf(mediaDataController, 5));
        mediaDataController.f24050s1.b();
        mediaDataController.f24052t1.b();
        mediaDataController.f24054u1.edit().clear().apply();
        mediaDataController.f24059w1.clear();
        mediaDataController.f24065y1.clear();
        mediaDataController.f24067z1.b();
        getColorPalette().a();
        this.f23120s7.i();
        G1().a();
        org.telegram.ui.Wallet.k0 k0Var = org.telegram.ui.Wallet.k0.O[this.currentAccount];
        if (k0Var != null) {
            org.telegram.ui.Wallet.o0.z(k0Var.J);
            k0Var.G.clear();
            k0Var.N.clear();
            WalletEngine2 walletEngine2 = k0Var.f42719b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                k0Var.f42719b = null;
                k0Var.d = null;
            }
            org.telegram.ui.Wallet.c0 c0Var = k0Var.f42730o;
            if (c0Var != null) {
                c0Var.c();
            }
            int i11 = k0Var.f42718a;
            if (k0Var.A >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(k0Var.A, true);
                k0Var.A = -1;
            }
            if (k0Var.B >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(k0Var.B, true);
                k0Var.B = -1;
            }
            if (k0Var.C >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(k0Var.C, true);
                k0Var.C = -1;
            }
            k0Var.f0();
            k0Var.E.clear();
            org.telegram.ui.Wallet.x0 x0Var = k0Var.f42734s;
            if (x0Var != null) {
                x0Var.h();
                k0Var.f42734s = null;
            }
            g0.r(k0Var.F);
            synchronized (org.telegram.ui.Wallet.k0.class) {
                try {
                    if (org.telegram.ui.Wallet.k0.O[k0Var.f42718a] == k0Var) {
                        org.telegram.ui.Wallet.k0.O[k0Var.f42718a] = null;
                    }
                } finally {
                }
            }
        }
        ei.z6 z6Var = this.f23027i0;
        if (z6Var != null) {
            z6Var.q();
        }
        e10 e10Var = this.f23044k0;
        if (e10Var != null) {
            e10Var.a();
        }
        this.K3 = false;
        org.telegram.ui.uw.f50200z4[this.currentAccount] = false;
        this.f22989d7.edit().clear().commit();
        this.f23009f7.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        k5.d(this.f22999e7.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editor = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                Integer z10 = Utilities.z(key);
                int intValue = z10.intValue();
                if (editor == null) {
                    editor = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(t0.f25457b);
                }
                editor.putBoolean("deleted" + intValue, true);
                if (sharedPreferences.getInt("type" + intValue, 0) == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(z10);
                } else {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(z10);
                }
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                ChatsWidgetProvider.a(t0.f25457b, appWidgetManager, ((Integer) arrayList2.get(i12)).intValue());
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ContactsWidgetProvider.a(t0.f25457b, appWidgetManager, ((Integer) arrayList3.get(i13)).intValue());
            }
        }
        this.K1.b();
        this.L1.b();
        this.M1.b();
        this.N1.b();
        this.O1.b();
        this.E1.clear();
        this.F1.b();
        this.G1.clear();
        this.H1.b();
        this.I1.clear();
        this.J1.b();
        this.B1.b();
        this.C1.b();
        this.D1.b();
        this.R.b();
        this.P.clear();
        this.f23088p2.clear();
        this.Q.clear();
        this.f23104r.b();
        this.f23053l1.b();
        this.m1.b();
        this.h.clear();
        this.f23132u1.clear();
        this.f23078o1.b();
        this.f23149w.clear();
        this.f23159x.b();
        this.S7.clear();
        this.R7.clear();
        this.U7.b();
        this.T7.clear();
        this.f23068n.clear();
        this.A1.clear();
        this.K0.b();
        this.L0.b();
        this.M0 = 0;
        this.F.clear();
        this.E.clear();
        this.f23169y.clear();
        this.O = Integer.MAX_VALUE;
        this.G.clear();
        this.H.clear();
        this.I.clear();
        this.J.clear();
        this.M.clear();
        this.K.clear();
        this.L.clear();
        this.V.clear();
        this.T.b();
        this.f23171y1.b();
        this.f23180z1.clear();
        this.d.clear();
        this.f22991e.clear();
        this.T2 = null;
        this.f22990d8.b();
        this.f23000e8.clear();
        this.f22963b.clear();
        this.S.b();
        this.U.clear();
        this.W.clear();
        this.X.b();
        this.Y.b();
        this.f22954a0.clear();
        this.f23131u0.b();
        this.E0.b();
        this.F0.b();
        this.f22974c0 = 0;
        mo[] moVarArr = this.N;
        moVarArr[1] = null;
        moVarArr[0] = null;
        this.Q0.clear();
        this.T0.clear();
        this.U0 = false;
        this.W0.clear();
        this.V0 = false;
        this.g7 = false;
        Utilities.d.c(new in(this, 5));
        this.f23160x0.clear();
        this.f23170y0.clear();
        this.f23179z0.clear();
        this.H0.clear();
        int i14 = 0;
        while (true) {
            a0.h[] hVarArr = this.Z;
            if (i14 >= hVarArr.length) {
                break;
            }
            a0.h hVar = hVarArr[i14];
            if (hVar != null) {
                hVar.b();
            }
            i14++;
        }
        this.f23106r1.clear();
        this.f23115s1.clear();
        this.P1.b();
        this.f23123t1.clear();
        this.f23141v1.clear();
        this.f23151w1.clear();
        this.f23161x1.clear();
        this.Z1 = false;
        this.f22956a2.clear();
        this.f22966b2.clear();
        this.c2.clear();
        this.f22984d2.clear();
        this.F2 = false;
        this.G2 = 0;
        this.f23133u2 = 0;
        this.f23142v2 = false;
        this.f22994e2 = false;
        this.V1 = 0;
        this.W1 = null;
        this.X1 = null;
        this.U1 = false;
        this.G0 = false;
        this.I0 = -1;
        this.J0 = false;
        this.f23037j2 = false;
        this.f23029i2 = false;
        this.f23061m2 = false;
        this.K2 = 0L;
        this.N2 = false;
        this.f23045k2 = false;
        this.f23021h2 = true;
        this.O2 = null;
        this.R2 = null;
        this.S2 = null;
        this.Q2.clear();
        this.f22965b1.b();
        this.L2 = 0;
        this.M2 = 0;
        Utilities.d.c(new in(this, 6));
        if (this.Y1 != null) {
            Utilities.d.a(this.Y1);
            this.Y1 = null;
        }
        k();
        g0.h3(new in(this, 7));
    }

    public final ep Q0(long j10) {
        TLRPC.Chat M0;
        ?? obj = new Object();
        ArrayList arrayList = (ArrayList) this.f23159x.f(j10);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                long j11 = dialog.f27005id;
                boolean z10 = true;
                if (j11 < 0 && (M0 = M0(Long.valueOf(-j11))) != null && (M0.forum || (M0.monoforum && t3.A(this.currentAccount, M0, 24)))) {
                    s1(this.currentAccount).f23102q7.h(M0.f27001id);
                    int i10 = obj.f22382a;
                    int[] iArr = c00.f21921n;
                    int i11 = iArr[0];
                    obj.f22382a = i10 + i11;
                    obj.f22383b += iArr[1];
                    obj.f22384c += iArr[2];
                    obj.d += iArr[4];
                    boolean z11 = obj.f22385e;
                    if (!z11 && i11 > 0) {
                        if (iArr[3] == 0) {
                            z10 = false;
                        }
                        obj.f22385e = z11 | z10;
                    }
                } else {
                    int i12 = obj.f22382a;
                    int i13 = dialog.unread_count;
                    obj.f22382a = i12 + i13;
                    obj.f22383b += dialog.unread_mentions_count;
                    obj.f22384c += dialog.unread_reactions_count;
                    obj.d += dialog.unread_poll_votes_count;
                    boolean z12 = obj.f22385e;
                    if (!z12 && i13 > 0) {
                        obj.f22385e = (!r2(dialog.f27005id, 0L, null)) | z12;
                    }
                }
            }
        }
        return obj;
    }

    public final int Q2(final long j10, final long j11, final boolean z10, boolean z11, final n10 n10Var) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = h1(j11);
        tL_communities_togglePeerLink.peer = j1(j10);
        tL_communities_togglePeerLink.deleted = z10;
        tL_communities_togglePeerLink.visible = !z11;
        tL_communities_togglePeerLink.hidden = z11;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new c3.b(1), new n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat M0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hp hpVar = hp.this;
                long j12 = j10;
                n10 n10Var2 = n10Var;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (M0 = hpVar.M0(Long.valueOf(-j12))) != null) {
                    hpVar.Q2(j12, M0.linked_community_id, true, false, n10Var2);
                    return;
                }
                boolean z12 = bool instanceof TLRPC.TL_boolTrue;
                long j13 = j11;
                if (z12) {
                    long j14 = 0;
                    int i3 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    boolean z13 = z10;
                    if (i3 > 0) {
                        TLRPC.User a22 = hpVar.a2(Long.valueOf(j12));
                        if (a22 != null) {
                            if (!z13) {
                                j14 = j13;
                            }
                            a22.linked_community_id = j14;
                            a22.flags2 = x7.u.b(a22.flags2, 2097152, !z13);
                        }
                    } else {
                        TLRPC.Chat M02 = hpVar.M0(Long.valueOf(-j12));
                        if (M02 != null) {
                            if (!z13) {
                                j14 = j13;
                            }
                            M02.linked_community_id = j14;
                            M02.flags2 = x7.u.b(M02.flags2, 1048576, !z13);
                        }
                    }
                }
                hpVar.V2(0, j13, true);
                n10Var2.a(bool, tL_error);
            }
        });
    }

    public final void Q3(TLRPC.Chat chat, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        if (chat != null) {
            Long valueOf = Long.valueOf(chat.f27001id);
            ConcurrentHashMap concurrentHashMap = this.f22963b;
            TLRPC.Chat chat2 = (TLRPC.Chat) concurrentHashMap.get(valueOf);
            if (chat2 != chat) {
                ConcurrentHashMap concurrentHashMap2 = this.f22991e;
                if (chat2 != null && !TextUtils.isEmpty(chat2.username)) {
                    concurrentHashMap2.remove(chat2.username.toLowerCase());
                }
                if (chat2 != null && chat2.usernames != null) {
                    for (int i14 = 0; i14 < chat2.usernames.size(); i14++) {
                        TLRPC.TL_username tL_username = chat2.usernames.get(i14);
                        if (tL_username != null && !TextUtils.isEmpty(tL_username.username)) {
                            concurrentHashMap2.remove(tL_username.username.toLowerCase());
                        }
                    }
                }
                if (!TextUtils.isEmpty(chat.username)) {
                    concurrentHashMap2.put(chat.username.toLowerCase(), chat);
                }
                if (chat.usernames != null) {
                    for (int i15 = 0; i15 < chat.usernames.size(); i15++) {
                        TLRPC.TL_username tL_username2 = chat.usernames.get(i15);
                        if (tL_username2 != null && !TextUtils.isEmpty(tL_username2.username) && tL_username2.active) {
                            concurrentHashMap2.put(tL_username2.username.toLowerCase(), chat);
                        }
                    }
                }
                j5(-chat.f27001id, chat.emoji_status);
                if (chat2 != null && chat2.access_hash == 0) {
                    long j10 = chat.fromMessageDialogId;
                    if (j10 != 0 && (i13 = chat.fromMessageId) != 0) {
                        chat2.fromMessageDialogId = j10;
                        chat2.fromMessageId = i13;
                    }
                }
                if (chat.min) {
                    if (chat2 != null) {
                        if (!z10) {
                            LruCache lruCache = d2().f23789b;
                            String str = chat2.username;
                            if (str != null && !TextUtils.equals(str, chat.username)) {
                                lruCache.remove(chat2.username);
                                String str2 = chat.username;
                                if (str2 != null) {
                                    lruCache.put(str2, new j10(-chat.f27001id));
                                }
                            }
                            chat2.title = chat.title;
                            chat2.photo = chat.photo;
                            chat2.broadcast = chat.broadcast;
                            chat2.verified = chat.verified;
                            chat2.megagroup = chat.megagroup;
                            chat2.call_not_empty = chat.call_not_empty;
                            chat2.call_active = chat.call_active;
                            chat2.monoforum = chat.monoforum;
                            chat2.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                            if ((chat.flags2 & 262144) != 0) {
                                chat2.linked_monoforum_id = chat.linked_monoforum_id;
                                chat2.flags2 |= 262144;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                            if (tL_chatBannedRights != null) {
                                chat2.default_banned_rights = tL_chatBannedRights;
                                chat2.flags |= 262144;
                            }
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                            if (tL_chatAdminRights != null) {
                                chat2.admin_rights = tL_chatAdminRights;
                                chat2.flags |= 16384;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                            if (tL_chatBannedRights2 != null) {
                                chat2.banned_rights = tL_chatBannedRights2;
                                chat2.flags |= 32768;
                            }
                            String str3 = chat.username;
                            if (str3 != null) {
                                chat2.username = str3;
                                chat2.flags |= 64;
                            } else {
                                chat2.flags &= -65;
                                chat2.username = null;
                            }
                            int i16 = chat.participants_count;
                            if (i16 != 0) {
                                chat2.participants_count = i16;
                            }
                            i(chat2);
                            boolean z11 = chat2.forum;
                            boolean z12 = chat.forum;
                            if (z11 != z12) {
                                chat2.forum = z12;
                                if (z12) {
                                    chat2.flags |= 1073741824;
                                } else {
                                    chat2.flags &= -1073741825;
                                }
                                getNotificationCenter().k(hs.r5, Long.valueOf(chat.f27001id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                            }
                        }
                    } else {
                        concurrentHashMap.put(Long.valueOf(chat.f27001id), chat);
                        i(chat);
                    }
                } else {
                    if (!z10) {
                        if (chat2 != null) {
                            if (chat.version != chat2.version) {
                                this.f23161x1.delete(chat.f27001id);
                            }
                            int i17 = chat2.participants_count;
                            if (i17 != 0 && chat.participants_count == 0) {
                                chat.participants_count = i17;
                                chat.flags |= 131072;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat2.banned_rights;
                            if (tL_chatBannedRights3 != null) {
                                i3 = tL_chatBannedRights3.flags;
                            } else {
                                i3 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chat.banned_rights;
                            if (tL_chatBannedRights4 != null) {
                                i10 = tL_chatBannedRights4.flags;
                            } else {
                                i10 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = chat2.default_banned_rights;
                            if (tL_chatBannedRights5 != null) {
                                i11 = tL_chatBannedRights5.flags;
                            } else {
                                i11 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = chat.default_banned_rights;
                            if (tL_chatBannedRights6 != null) {
                                i12 = tL_chatBannedRights6.flags;
                            } else {
                                i12 = 0;
                            }
                            chat2.default_banned_rights = tL_chatBannedRights6;
                            if (tL_chatBannedRights6 == null) {
                                chat2.flags &= -262145;
                            } else {
                                chat2.flags = 262144 | chat2.flags;
                            }
                            chat2.banned_rights = tL_chatBannedRights4;
                            if (tL_chatBannedRights4 == null) {
                                chat2.flags &= -32769;
                            } else {
                                chat2.flags |= 32768;
                            }
                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat.admin_rights;
                            chat2.admin_rights = tL_chatAdminRights2;
                            if (tL_chatAdminRights2 == null) {
                                chat2.flags &= -16385;
                            } else {
                                chat2.flags |= 16384;
                            }
                            if (chat.stories_hidden_min) {
                                chat.stories_hidden = chat2.stories_hidden;
                            }
                            if (i3 != i10 || i11 != i12) {
                                g0.h3(new jj(this, chat, 3));
                            }
                        }
                        concurrentHashMap.put(Long.valueOf(chat.f27001id), chat);
                    } else if (chat2 == null) {
                        concurrentHashMap.put(Long.valueOf(chat.f27001id), chat);
                    } else if (chat2.min) {
                        chat.title = chat2.title;
                        chat.photo = chat2.photo;
                        chat.broadcast = chat2.broadcast;
                        chat.verified = chat2.verified;
                        chat.megagroup = chat2.megagroup;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights7 = chat2.default_banned_rights;
                        if (tL_chatBannedRights7 != null) {
                            chat.default_banned_rights = tL_chatBannedRights7;
                            chat.flags |= 262144;
                        }
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chat2.admin_rights;
                        if (tL_chatAdminRights3 != null) {
                            chat.admin_rights = tL_chatAdminRights3;
                            chat.flags |= 16384;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights8 = chat2.banned_rights;
                        if (tL_chatBannedRights8 != null) {
                            chat.banned_rights = tL_chatBannedRights8;
                            chat.flags |= 32768;
                        }
                        String str4 = chat2.username;
                        if (str4 != null) {
                            chat.username = str4;
                            chat.flags |= 64;
                        } else {
                            chat.flags &= -65;
                            chat.username = null;
                        }
                        int i18 = chat2.participants_count;
                        if (i18 != 0 && chat.participants_count == 0) {
                            chat.participants_count = i18;
                            chat.flags |= 131072;
                        }
                        concurrentHashMap.put(Long.valueOf(chat.f27001id), chat);
                    }
                    i(chat);
                }
                if (chat2 != null && chat2.forum != chat.forum) {
                    g0.h3(new jj(this, chat, 4));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    g0.h3(new jj(this, chat, 5));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j11 = chat.f27001id;
                    if (N0(j11) == null) {
                        getMessagesStorage().F0(j11, false, null, false, false, 0);
                        V2(0, j11, false);
                    }
                }
            }
        }
    }

    public final void Q4(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.f23178y8 = tL_webBrowserSettings;
        int i3 = this.currentAccount;
        long j10 = tL_webBrowserSettings.hash;
        this.f23187z8.g(i3, null, tL_webBrowserSettings);
        getNotificationCenter().k(hs.R5, new Object[0]);
    }

    public final void R(zo zoVar) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (zoVar.f26954b != 0 && zoVar.f26955c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) zoVar.f26954b;
            tL_messages_readDiscussion.peer = j1(zoVar.f26953a);
            tL_messages_readDiscussion.read_max_id = zoVar.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new ei.u5(13));
        } else if (!m5.C(zoVar.f26953a)) {
            TLRPC.InputPeer j12 = j1(zoVar.f26953a);
            if (zoVar.f26955c != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = j1(zoVar.f26953a);
                tL_messages_readSavedHistory.peer = j1(zoVar.f26955c);
                tL_messages_readSavedHistory.max_id = zoVar.d;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (j12 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = h1(-zoVar.f26953a);
                tL_channels_readHistory.max_id = zoVar.d;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = j12;
                tL_messages_readHistory2.max_id = zoVar.d;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new ij(this, 1));
        } else {
            TLRPC.EncryptedChat a12 = a1(Integer.valueOf((int) (zoVar.f26953a & 4294967295L)));
            byte[] bArr = a12.auth_key;
            if (bArr != null && bArr.length > 1 && (a12 instanceof TLRPC.TL_encryptedChat)) {
                TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = a12.f27009id;
                tL_inputEncryptedChat.access_hash = a12.access_hash;
                tL_messages_readEncryptedHistory.max_date = zoVar.f26956e;
                getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new ei.u5(13));
            }
        }
    }

    public final void R0(u10 u10Var) {
        if (this.f23067m8 != null && System.currentTimeMillis() - this.f23060l8 < 3600000) {
            if (u10Var != null) {
                u10Var.a(this.f23067m8);
                return;
            }
            return;
        }
        if (this.f23051k8 == null) {
            this.f23051k8 = new ArrayList();
        }
        if (u10Var != null) {
            this.f23051k8.add(u10Var);
        }
        if (this.f23043j8) {
            return;
        }
        this.f23043j8 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new ij(this, 25));
    }

    public final e R1() {
        if (this.f23129t7 == null) {
            this.f23129t7 = new e(this.currentAccount);
        }
        return this.f23129t7;
    }

    public final void R2(boolean z10) {
        g0.r(this.I7);
        co coVar = this.U2;
        if (z10) {
            coVar.d(this.currentAccount, 0);
        }
        coVar.c(this.currentAccount, 0, new vn(this, 1));
    }

    public final void R3(TLRPC.ChatFull chatFull) {
        this.m1.k(chatFull, chatFull.f27002id);
        this.f23120s7.M(-chatFull.f27002id);
    }

    public final void S(Activity activity, TLRPC.Chat chat, org.telegram.ui.ActionBar.d2 d2Var, ir irVar) {
        org.telegram.ui.ActionBar.s1 s1Var;
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = i1(chat);
        if (activity != null) {
            s1Var = new org.telegram.ui.ActionBar.s1(3, activity, null);
        } else {
            s1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new on(this, activity, s1Var, irVar, d2Var, tL_channels_convertToGigagroup, 0));
        if (s1Var != null) {
            s1Var.setOnCancelListener(new wl(this, sendRequest, 1));
            try {
                s1Var.r(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final TLRPC.Dialog S0(long j10) {
        return (TLRPC.Dialog) this.R.f(j10);
    }

    public final c00 S1() {
        return this.f23102q7;
    }

    public final void S2(long j10, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.f23180z1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j10) < 60) {
            return;
        }
        longSparseIntArray.put(j10, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z10) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new op(messagesStorage, j10, 7));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = h1(j10);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new gj(this, j10, 2));
    }

    public final void S3(ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Q3((TLRPC.Chat) arrayList.get(i3), z10);
            }
        }
    }

    public final boolean S4() {
        if (this.f23067m8 != null && System.currentTimeMillis() - this.f23060l8 < 3600000) {
            return this.f23067m8.sensitive_enabled;
        }
        Set set = this.C4;
        if (set != null && !set.contains("sensitive")) {
            return false;
        }
        return true;
    }

    public final void T(Context context, long j10, org.telegram.ui.ActionBar.d2 d2Var, lr lrVar, org.telegram.ui.lo loVar) {
        org.telegram.ui.ActionBar.s1 s1Var;
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j10;
        if (context != null) {
            s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        } else {
            s1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new ci.y6(this, context, s1Var, lrVar, j10, loVar, d2Var, tL_messages_migrateChat));
        if (s1Var != null) {
            s1Var.setOnCancelListener(new wl(this, sendRequest, 0));
            try {
                s1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final ArrayList T0() {
        ArrayList arrayList = this.R0;
        if (arrayList != null) {
            return arrayList;
        }
        return this.Q0;
    }

    public final x00 T1() {
        return this.f23120s7;
    }

    public final void T2(Long l10, gi.e8 e8Var, int i3) {
        HashSet hashSet = this.f23141v1;
        if (e8Var == null && (hashSet.contains(l10) || this.f23151w1.contains(l10))) {
            return;
        }
        hashSet.add(l10);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l10.getClass();
        tL_channels_getParticipants.channel = i1(M0(l10));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i3;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new uh(this, l10, e8Var, 2));
    }

    public final void T3(long j10, TLRPC.DraftMessage draftMessage) {
        a0.h hVar = this.R;
        if (hVar.h(j10) < 0) {
            if (!t3.o0(this.currentAccount, j10) || t3.z(this.currentAccount, 24, j10)) {
                li mediaDataController = getMediaDataController();
                ArrayList arrayList = this.f23169y;
                int size = arrayList.size();
                int i3 = 1;
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < m5.j(dialog, mediaDataController.R(dialog.f27005id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.f27005id = j10;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.f24047r1.g(0, j10)).intValue();
                if (j10 >= 0 || !t3.T(M0(Long.valueOf(-j10)))) {
                    i3 = 0;
                }
                tL_dialog.flags = i3;
                hVar.k(tL_dialog, j10);
                arrayList.add(tL_dialog);
                T4(null);
            }
        }
    }

    public final void T4(a0.h r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.T4(a0.h):void");
    }

    public final int U(String str, ArrayList arrayList, String str2, int i3, boolean z10, Location location, String str3, int i10, org.telegram.ui.ActionBar.d2 d2Var) {
        boolean z11 = false;
        if (i3 == 0 && !z10) {
            TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i10 >= 0) {
                tL_messages_createChat.ttl_period = i10;
                tL_messages_createChat.flags |= 1;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.User a22 = a2((Long) arrayList.get(i11));
                if (a22 != null) {
                    tL_messages_createChat.users.add(q1(a22));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new uh(this, d2Var, tL_messages_createChat, 3), 2);
        } else if (!z10 && i3 != 2 && i3 != 4 && i3 != 5) {
            return 0;
        } else {
            TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
            tL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tL_channels_createChannel.about = str2;
            tL_channels_createChannel.for_import = z10;
            if (!z10 && i3 != 4 && i3 != 5) {
                tL_channels_createChannel.broadcast = true;
            } else {
                tL_channels_createChannel.megagroup = true;
            }
            if (i3 == 5) {
                z11 = true;
            }
            tL_channels_createChannel.forum = z11;
            if (location != null) {
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                tL_channels_createChannel.geo_point = tL_inputGeoPoint;
                tL_inputGeoPoint.lat = location.getLatitude();
                tL_channels_createChannel.geo_point._long = location.getLongitude();
                tL_channels_createChannel.address = str3;
                tL_channels_createChannel.flags |= 4;
            }
            return getConnectionsManager().sendRequest(tL_channels_createChannel, new uh(this, d2Var, tL_channels_createChannel, 4), 2);
        }
    }

    public final po U0(long j10) {
        a0.h hVar = this.L7;
        po poVar = (po) hVar.f(j10);
        if (poVar == null) {
            po poVar2 = new po(this, j10);
            hVar.k(poVar2, j10);
            return poVar2;
        }
        return poVar;
    }

    public final e10 U1() {
        e10 e10Var = this.f23044k0;
        if (e10Var != null) {
            return e10Var;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                e10 e10Var2 = this.f23044k0;
                if (e10Var2 != null) {
                    return e10Var2;
                }
                e10 e10Var3 = new e10(this.currentAccount);
                this.f23044k0 = e10Var3;
                return e10Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void U2(int i3, int i10, int i11, boolean z10, kk kkVar) {
        long j10;
        int i12;
        a0.h hVar;
        int m10;
        SparseBooleanArray sparseBooleanArray = this.f22966b2;
        if (!sparseBooleanArray.get(i3) && !this.f23061m2) {
            sparseBooleanArray.put(i3, true);
            int i13 = hs.f23298s;
            getNotificationCenter().k(i13, new Object[0]);
            if (r2.f25040a) {
                StringBuilder m11 = com.google.android.recaptcha.internal.a.m("folderId = ", i3, " load cacheOffset = ", i10, " count = ");
                m11.append(i11);
                m11.append(" cache = ");
                m11.append(z10);
                a8.b(m11.toString());
            }
            long[] jArr = null;
            if (z10) {
                qr messagesStorage = getMessagesStorage();
                if (i10 == 0) {
                    i12 = 0;
                } else {
                    i12 = this.f22956a2.get(i3, 0);
                }
                if (i3 == 0 && i10 == 0 && (m10 = (hVar = messagesStorage.getMediaDataController().f24050s1).m()) > 0) {
                    jArr = new long[m10];
                    for (int i14 = 0; i14 < m10; i14++) {
                        if (((a0.h) hVar.n(i14)).f(0L) != null) {
                            jArr[i14] = hVar.j(i14);
                        }
                    }
                }
                messagesStorage.f24934a.c(new gi.t5(messagesStorage, i3, i12, i11, jArr));
                return;
            }
            TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
            tL_messages_getDialogs.limit = i11;
            tL_messages_getDialogs.exclude_pinned = true;
            if (i3 != 0) {
                tL_messages_getDialogs.flags |= 2;
                tL_messages_getDialogs.folder_id = i3;
            }
            long[] g7 = getUserConfig().g(i3);
            long j11 = g7[0];
            if (j11 != -1) {
                if (j11 == 2147483647L) {
                    this.c2.put(i3, true);
                    this.f22984d2.put(i3, true);
                    sparseBooleanArray.put(i3, false);
                    getNotificationCenter().k(i13, new Object[0]);
                    return;
                }
                int i15 = (int) j11;
                tL_messages_getDialogs.offset_id = i15;
                tL_messages_getDialogs.offset_date = (int) g7[1];
                if (i15 == 0) {
                    tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    if (g7[4] != 0) {
                        TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerChannel;
                        tL_inputPeerChannel.channel_id = g7[4];
                    } else if (g7[2] != 0) {
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerUser;
                        tL_inputPeerUser.user_id = g7[2];
                    } else {
                        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                        tL_inputPeerChat.chat_id = g7[3];
                    }
                    tL_messages_getDialogs.offset_peer.access_hash = g7[5];
                }
            } else {
                ArrayList W0 = W0(i3);
                int size = W0.size() - 1;
                while (true) {
                    if (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(size);
                        if (!dialog.pinned && !m5.C(dialog.f27005id) && dialog.top_message > 0) {
                            ArrayList arrayList = (ArrayList) this.S.f(dialog.f27005id);
                            zi ziVar = null;
                            if (arrayList != null) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    zi ziVar2 = (zi) arrayList.get(i16);
                                    if (ziVar2 != null && (ziVar == null || ziVar2.f1() > ziVar.f1())) {
                                        ziVar = (zi) arrayList.get(i16);
                                    }
                                }
                            }
                            if (ziVar != null && ziVar.f1() > 0) {
                                TLRPC.Message message = ziVar.f26868k;
                                tL_messages_getDialogs.offset_date = message.date;
                                tL_messages_getDialogs.offset_id = message.f27022id;
                                TLRPC.Peer peer = message.peer_id;
                                long j12 = peer.channel_id;
                                if (j12 == 0) {
                                    j12 = peer.chat_id;
                                    if (j12 == 0) {
                                        j10 = peer.user_id;
                                        tL_messages_getDialogs.offset_peer = j1(j10);
                                    }
                                }
                                j10 = -j12;
                                tL_messages_getDialogs.offset_peer = j1(j10);
                            }
                        }
                        size--;
                    } else {
                        tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        break;
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_getDialogs, new hf(this, i3, i11, kkVar, 1));
        }
    }

    public final void U3(TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (encryptedChat == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f22973c;
        if (z10) {
            concurrentHashMap.putIfAbsent(Integer.valueOf(encryptedChat.f27009id), encryptedChat);
        } else {
            concurrentHashMap.put(Integer.valueOf(encryptedChat.f27009id), encryptedChat);
        }
    }

    public final boolean U4() {
        return !this.f23042j7;
    }

    public final long V(int i3, long j10) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2 = null;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            nativeByteBuffer.writeInt32(102);
            nativeByteBuffer.writeInt64(j10);
            nativeByteBuffer.writeInt32(i3);
        } catch (Exception e11) {
            e = e11;
            nativeByteBuffer2 = nativeByteBuffer;
            a8.g(e, true);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().z(nativeByteBuffer);
        }
        return getMessagesStorage().z(nativeByteBuffer);
    }

    public final int V0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i3 = dialog.unread_count;
        TLRPC.Chat M0 = M0(Long.valueOf(-dialog.f27005id));
        if (M0 != null && (M0.forum || M0.monoforum)) {
            this.f23102q7.h(-dialog.f27005id);
            return c00.f21921n[0];
        }
        return i3;
    }

    public final void V2(final int r11, final long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.V2(int, long, boolean):void");
    }

    public final void V3(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                U3((TLRPC.EncryptedChat) arrayList.get(i3), true);
            }
        }
    }

    public final void V4(TLRPC.Chat chat, int i3, boolean z10, org.telegram.ui.pf pfVar) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new ci.ka(this, chat, z10, i3, pfVar));
    }

    public final void W(long j10, long j11) {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new qq(messagesStorage, 0, j10, j11, 1));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = j1(j10);
        tL_messages_deleteParticipantReactions.participant = j1(j11);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new kh.b(3));
    }

    public final ArrayList W0(int i3) {
        ArrayList arrayList = (ArrayList) this.f23149w.get(i3);
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final void W2(final TLRPC.User user, final int i3, boolean z10, final u10 u10Var) {
        if (user != null) {
            HashSet hashSet = this.f23106r1;
            if (u10Var == null) {
                if (!hashSet.contains(Long.valueOf(user.f27150id))) {
                    if (!z10 && this.f23115s1.get(user.f27150id) > 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            hashSet.add(Long.valueOf(user.f27150id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.f27143id = q1(user);
            final long j10 = user.f27150id;
            if (this.P.get(Long.valueOf(j10)) == null || this.Q.get(Long.valueOf(j10)) == null) {
                a4(null, j10);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    hp hpVar = hp.this;
                    TLRPC.User user2 = user;
                    if (tL_error == null) {
                        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                        TLRPC.UserFull userFull = tL_users_userFull.full_user;
                        hpVar.Y3(tL_users_userFull.users, false);
                        hpVar.S3(tL_users_userFull.chats, false);
                        TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                        userFull2.user = hpVar.a2(Long.valueOf(userFull2.f27151id));
                        hpVar.getMessagesStorage().j2(userFull, false);
                        hpVar.P1().p0(j10, userFull.stories);
                        d4 f10 = d4.f(hpVar.currentAccount);
                        TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                        f10.r(userFull3.f27151id, userFull3.wallpaper);
                        u10 u10Var2 = u10Var;
                        if (u10Var2 != null) {
                            u10Var2.a(userFull);
                        }
                        g0.h3(new vf(hpVar, userFull, user2, i3, 1));
                        return;
                    }
                    g0.h3(new lj(hpVar, user2, 0));
                }
            }), i3);
        }
    }

    public final void W3(long j10, r3 r3Var) {
        this.f23070n1.k(r3Var, r3Var.f25049b.f27011id);
        this.f23078o1.k(r3Var, j10);
        TLRPC.ChatFull N0 = N0(j10);
        if (N0 != null) {
            N0.call = r3Var.g(r3Var.f25048a);
        }
        getNotificationCenter().k(hs.f23328w2, Long.valueOf(j10), Long.valueOf(r3Var.f25049b.f27011id), Boolean.FALSE);
        V2(0, j10, true);
    }

    public final boolean W4() {
        String str = this.B6;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
                return false;
            } else if (str.equals("premium")) {
                return getUserConfig().q();
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        } else {
            return false;
        }
    }

    public final void X(int i3, long j10, boolean z10) {
        Y(j10, 1, i3, 0, z10, null, 0L);
    }

    public final void X0() {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i3 = messagesStorage.f24945r;
        qr messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i10 = messagesStorage2.f24944n;
        qr messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        Y0(i3, i10, messagesStorage3.f24946s, false);
    }

    public final void X2() {
        SharedPreferences.Editor editor;
        if (this.f23116s2 == 0 && !getUserConfig().T) {
            SharedPreferences sharedPreferences = s1(this.currentAccount).f22989d7;
            if (sharedPreferences.contains("EnableGroup")) {
                boolean z10 = sharedPreferences.getBoolean("EnableGroup", true);
                editor = sharedPreferences.edit();
                if (!z10) {
                    editor.putInt("EnableGroup2", Integer.MAX_VALUE);
                    editor.putInt("EnableChannel2", Integer.MAX_VALUE);
                }
                editor.remove("EnableGroup").commit();
            } else {
                editor = null;
            }
            if (sharedPreferences.contains("EnableAll")) {
                boolean z11 = sharedPreferences.getBoolean("EnableAll", true);
                if (editor == null) {
                    editor = sharedPreferences.edit();
                }
                if (!z11) {
                    editor.putInt("EnableAll2", Integer.MAX_VALUE);
                }
                editor.remove("EnableAll").commit();
            }
            if (editor != null) {
                editor.commit();
            }
            this.f23116s2 = 4;
            for (int i3 = 0; i3 < 3; i3++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i3 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i3 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                getConnectionsManager().sendRequest(getnotifysettings, new un(this, i3, 1));
            }
            getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new ij(this, 6));
        }
        if (!getUserConfig().U && !this.f23124t2) {
            this.f23124t2 = true;
            getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new ij(this, 11));
        }
    }

    public final boolean X3(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.X3(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public final boolean X4() {
        String str = this.C6;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
                return false;
            } else if (str.equals("premium")) {
                return getUserConfig().q();
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        } else {
            return false;
        }
    }

    public final void Y(long r34, int r36, int r37, int r38, boolean r39, org.telegram.tgnet.TLRPC.InputPeer r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.Y(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public final void Y0(int i3, int i10, int i11, boolean z10) {
        Z3(az.f21626f, az.f21629g);
        qr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        if (messagesStorage.f24945r == 0) {
            if (!this.f23029i2) {
                this.f23029i2 = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new ij(this, 24));
            }
        } else if (!z10 && this.f23013g2) {
        } else {
            this.f23013g2 = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i3;
            tL_updates_getDifference.date = i10;
            tL_updates_getDifference.qts = i11;
            if (this.f23021h2) {
                tL_updates_getDifference.flags |= 1;
                if (t0.o()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.f23021h2 = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (r2.f25040a) {
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m("start getDifference with date = ", i10, " pts = ", i3, " qts = ");
                m10.append(i11);
                a8.b(m10.toString());
                a8.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new zd(this, i10, i11, 1));
        }
    }

    public final void Y2(long j10, long j11, boolean z10, int i3, int i10, int i11, boolean z11, int i12, int i13, int i14, int i15, long j12, int i16, int i17, boolean z12) {
        int i18;
        if (j12 != 0) {
            i18 = i16;
        } else {
            i18 = 0;
        }
        Z2(j10, j11, z10, i3, i10, i11, z11, i12, i13, i14, 0, i15, j12, i17, i18, 0, 0, false, 0, true, true, z12, null, 0L);
    }

    public final void Y3(ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i3 = 0; i3 < size; i3++) {
                if (X3((TLRPC.User) arrayList.get(i3), z10, false)) {
                    z11 = true;
                }
            }
            if (z11) {
                g0.h3(new in(this, 4));
            }
        }
    }

    public final boolean Y4(TLRPC.User user) {
        if (user != null && user.f27150id == this.m0) {
            return true;
        }
        String str = this.C6;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                }
            } else if (str.equals("premium") && user != null && user.premium) {
                return true;
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        }
        return false;
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j10, int i3, boolean z10, int i10) {
        a0(arrayList, arrayList2, encryptedChat, j10, z10, i10, false, 0L, null, i3);
    }

    public final TLRPC.TL_availableEffect Z0(long j10) {
        E0();
        if (this.f23026h8 != null) {
            for (int i3 = 0; i3 < this.f23026h8.effects.size(); i3++) {
                if (this.f23026h8.effects.get(i3).f27032id == j10) {
                    return this.f23026h8.effects.get(i3);
                }
            }
            return null;
        }
        return null;
    }

    public final long Z1(int i3) {
        if (i3 == 0) {
            return this.f23028i1;
        }
        if (i3 == 1) {
            return this.f23036j1;
        }
        if (i3 == 2) {
            return this.k1;
        }
        return 0L;
    }

    public final void Z2(final long j10, final long j11, final boolean z10, final int i3, final int i10, final int i11, boolean z11, final int i12, final int i13, final int i14, final int i15, final int i16, final long j12, final int i17, final int i18, final int i19, final int i20, final boolean z12, final int i21, boolean z13, final boolean z14, final boolean z15, sz szVar, long j13) {
        int i22;
        sz szVar2;
        TLRPC.TL_forumTopic f10;
        if (r2.f25040a) {
            StringBuilder t10 = a1.g.t(j10, "load messages in chat ", " topic_id ");
            t10.append(j12);
            t10.append(" count ");
            t10.append(i3);
            t10.append(" max_id ");
            t10.append(i10);
            t10.append(" cache ");
            t10.append(z11);
            t10.append(" mindate = ");
            i22 = i12;
            t10.append(i22);
            t10.append(" guid ");
            t10.append(i13);
            t10.append(" load_type ");
            t10.append(i14);
            t10.append(" last_message_id ");
            t10.append(i15);
            t10.append(" mode ");
            t10.append(i16);
            t10.append(" index ");
            t10.append(i17);
            t10.append(" firstUnread ");
            t10.append(i18);
            t10.append(" unread_count ");
            t10.append(i19);
            t10.append(" last_date ");
            t10.append(i20);
            t10.append(" queryFromServer ");
            t10.append(z12);
            t10.append(" isTopic ");
            t10.append(z15);
            a8.b(t10.toString());
        } else {
            i22 = i12;
        }
        if (r2.f25040a && szVar == null && i16 == 0) {
            szVar2 = new sz("MessageLoaderLogger dialogId=" + j10 + " index=" + i17 + " count=" + i3);
        } else {
            szVar2 = szVar;
        }
        int i23 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if ((i23 == 0 || z15 || i16 == 8 || i16 == 3 || i16 == 5 || i16 == 9) && i16 != 2 && (z11 || m5.C(j10))) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.f24934a.c(new np(messagesStorage, sz.d(szVar2, "MessagesStorage.getMessages: storageQueue.postRunnable"), szVar2, j10, j11, i3, i10, i11, i22, i13, i14, i16, j12, i17, z14, z15));
            return;
        }
        int i24 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Chat M0 = i24 < 0 ? M0(Long.valueOf(-j10)) : null;
        if (i16 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = j1(j10);
            tL_getWelcomeMessages.hash = j13;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new n10() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TL_ephemeral.WelcomeMessages welcomeMessages = (TL_ephemeral.WelcomeMessages) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    hp hpVar = hp.this;
                    hpVar.getClass();
                    if (welcomeMessages != null && !(welcomeMessages instanceof TL_ephemeral.TL_welcomeMessagesNotModified)) {
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        ArrayList<TL_ephemeral.EphemeralMessage> arrayList = welcomeMessages.messages;
                        int size = arrayList.size();
                        int i25 = 0;
                        while (i25 < size) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i25);
                            i25++;
                            tL_messages_messages.messages.add(cg.v.b(ephemeralMessage));
                        }
                        hpVar.K3(tL_messages_messages, tL_messages_messages.messages.size(), j10, j11, i3, i10, i11, false, i13, i18, i15, i19, i20, i14, false, i16, j12, i17, z12, i21, z14, z15, null);
                    }
                }
            }), i13);
        } else if (i16 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j12;
            tL_messages_getQuickReplyMessages.hash = j13;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new rk(this, j10, j11, i3, i10, i11, i13, i18, i15, i19, i20, i14, i16, j12, i17, z12, i21, z14, z15)), i13);
        } else if (i23 == 0) {
            if (i16 == 2) {
                return;
            }
            if (i16 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = j1(j10);
                tL_messages_getScheduledHistory.hash = j13;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new rk(this, i10, i11, j10, j11, i3, i13, i18, i15, i19, i20, i14, i16, j12, i17, z12, i21, z14, z15)), i13);
            } else if (!t3.p0(M0) && z13 && ((i14 == 3 || i14 == 2) && i15 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer j14 = j1(j10);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = j14;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hp hpVar = hp.this;
                        int i25 = i13;
                        if (tLObject != null) {
                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                            if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                                TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(0);
                                if (dialog.top_message != 0) {
                                    TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                                    tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                                    tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                                    tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                                    tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                                    hpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                                }
                                hpVar.Z2(j10, j11, z10, i3, i10, i11, false, i12, i25, i14, dialog.top_message, 0, j12, i17, i18, dialog.unread_count, i20, z12, dialog.unread_mentions_count, false, z14, z15, null, 0L);
                                return;
                            }
                            return;
                        }
                        g0.h3(new vf(hpVar, i25, (TLObject) tL_messages_getPeerDialogs, tL_error, 12));
                    }
                });
            } else {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = j1(j10);
                if (i14 == 4) {
                    tL_messages_getHistory.add_offset = (-i3) + 5;
                } else if (i14 == 3) {
                    tL_messages_getHistory.add_offset = (-i3) / 2;
                } else if (i14 == 1) {
                    tL_messages_getHistory.add_offset = (-i3) - 1;
                } else if (i14 == 2 && i10 != 0) {
                    tL_messages_getHistory.add_offset = (-i3) + 6;
                } else if (i24 < 0 && i10 != 0 && t3.T(M0)) {
                    tL_messages_getHistory.add_offset = -1;
                    tL_messages_getHistory.limit++;
                }
                tL_messages_getHistory.limit = i3;
                tL_messages_getHistory.offset_id = i10;
                tL_messages_getHistory.offset_date = i11;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new sk(this, j10, i3, i10, i11, j11, i13, i18, i15, i19, i20, i14, i16, j12, i17, z12, i21, z14, z15, tL_messages_getHistory, 2)), i13);
            }
        } else if (i16 == 3 || t3.p0(M0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = j1(j12);
            if (t3.p0(M0)) {
                tL_messages_getSavedHistory.parent_peer = j1(j10);
            }
            if (i14 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i3) + 5;
            } else if (i14 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i3) / 2;
            } else if (i14 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i3) - 1;
            } else if (i14 == 2 && i10 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i3) + 6;
            } else if (i24 < 0 && i10 != 0 && t3.T(M0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i3;
            tL_messages_getSavedHistory.offset_id = i10;
            tL_messages_getSavedHistory.offset_date = i11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new sk(this, j10, i3, i10, i11, j11, i13, i18, i15, i19, i20, i14, i16, j12, i17, z12, i21, z14, z15, tL_messages_getSavedHistory, 0)), i13);
        } else if (z13 && z15 && i14 == 2 && i15 == 0 && (f10 = this.f23102q7.f(-j10, j12)) != null) {
            Z2(j10, j11, z10, i3, i10, i11, false, i12, i13, i14, f10.top_message, i16, j12, i17, i18, f10.unread_count, i20, z12, f10.unread_mentions_count, false, z14, z15, szVar2, 0L);
        } else if (i16 != 0) {
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = j1(j10);
            tL_messages_getReplies.msg_id = (int) j12;
            tL_messages_getReplies.offset_date = i11;
            if (i14 == 4) {
                tL_messages_getReplies.add_offset = (-i3) + 5;
            } else if (i14 == 3) {
                tL_messages_getReplies.add_offset = (-i3) / 2;
            } else if (i14 == 1) {
                tL_messages_getReplies.add_offset = (-i3) - 1;
            } else if (i14 == 2 && i10 != 0) {
                tL_messages_getReplies.add_offset = (-i3) + 10;
            } else if (i24 < 0 && i10 != 0 && t3.T(M0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i3;
            tL_messages_getReplies.offset_id = i10;
            tL_messages_getReplies.hash = j13;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new sk(this, i3, i10, i11, i18, i14, j10, j11, i13, i15, i19, i20, i16, j12, i17, z12, i21, z14, z15, tL_messages_getReplies)), i13);
        }
    }

    public final void Z3(int i3, String str) {
        if (!TextUtils.isEmpty(str) && !this.f23045k2 && getUserConfig().e() != 0) {
            if (!getUserConfig().d || !str.equals(az.f21629g)) {
                this.f23045k2 = true;
                this.f23054l2 = SystemClock.elapsedRealtime();
                if (az.f21642l == null) {
                    az.f21642l = new byte[256];
                    Utilities.f21385b.nextBytes(az.f21642l);
                    az.y();
                }
                TL_account.registerDevice registerdevice = new TL_account.registerDevice();
                registerdevice.token_type = i3;
                registerdevice.token = str;
                registerdevice.no_muted = false;
                registerdevice.secret = az.f21642l;
                for (int i10 = 0; i10 < 4; i10++) {
                    h10 i11 = h10.i(i10);
                    if (i10 != this.currentAccount && i11.p()) {
                        long e10 = i11.e();
                        registerdevice.other_uids.add(Long.valueOf(e10));
                        if (r2.f25040a) {
                            k2.p1.q(this.currentAccount, a1.g.t(e10, "add other uid = ", " for account "));
                        }
                    }
                }
                getConnectionsManager().sendRequest(registerdevice, new rn(this, i3, str, 0));
            }
        }
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j10, boolean z10, int i3, boolean z11, long j11, TLObject tLObject, int i10) {
        b0(arrayList, arrayList2, encryptedChat, j10, z10, i3, z11, j11, tLObject, i10, false, 0);
    }

    public final TLRPC.EncryptedChat a1(Integer num) {
        return (TLRPC.EncryptedChat) this.f22973c.get(num);
    }

    public final TLRPC.User a2(Long l10) {
        if (l10.longValue() == 0) {
            return h10.i(this.currentAccount).f();
        }
        return (TLRPC.User) this.d.get(l10);
    }

    public final void a3(TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        long j10;
        if (user != null || chat != null) {
            if (user != null) {
                j10 = user.f27150id;
            } else {
                j10 = -chat.f27001id;
            }
            a0.h hVar = this.f23131u0;
            if (hVar.h(j10) < 0) {
                if (r2.f25040a) {
                    a8.b("request spam button for " + j10);
                }
                int i3 = this.f22989d7.getInt("dialog_bar_vis3" + j10, 0);
                if (!z10 && (i3 == 1 || i3 == 3)) {
                    if (r2.f25040a) {
                        a8.b("dialog bar already hidden for " + j10);
                        return;
                    }
                    return;
                }
                hVar.k(Boolean.TRUE, j10);
                TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
                if (user != null) {
                    tL_messages_getPeerSettings.peer = j1(user.f27150id);
                } else {
                    tL_messages_getPeerSettings.peer = j1(-chat.f27001id);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new gj(this, j10, 1));
            }
        }
    }

    public final void a4(ArrayList arrayList, long j10) {
        if (j10 != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            a0.h hVar = this.K7;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.InputPeer j12 = j1(((TLRPC.Dialog) arrayList.get(i3)).f27005id);
                    if (!(j12 instanceof TLRPC.TL_inputPeerChannel) || j12.access_hash != 0) {
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer.peer = j12;
                        long n4 = m5.n(j12);
                        Long l10 = (Long) hVar.f(n4);
                        if (l10 == null || System.currentTimeMillis() - l10.longValue() > 240000) {
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            hVar.k(Long.valueOf(System.currentTimeMillis()), n4);
                        }
                    }
                }
            } else {
                TLRPC.InputPeer j13 = j1(j10);
                if (!(j13 instanceof TLRPC.TL_inputPeerChannel) || j13.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer2.peer = j13;
                    long n10 = m5.n(j13);
                    Long l11 = (Long) hVar.f(n10);
                    if (l11 == null || System.currentTimeMillis() - l11.longValue() > 240000) {
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer2);
                        hVar.k(Long.valueOf(System.currentTimeMillis()), n10);
                    }
                } else {
                    return;
                }
            }
            if (tL_messages_getPeerDialogs.peers.isEmpty()) {
                return;
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new ij(this, 0));
        }
    }

    public final void a5(long j10, boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = h1(j10);
        tL_channels_toggleForum.enabled = z10;
        tL_channels_toggleForum.tabs = z11;
        tL_channels_toggleForum.sidebar = z12;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new ij(this, 16), 64);
        getNotificationCenter().k(hs.r5, Long.valueOf(j10), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12));
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j10, boolean z10, int i3, boolean z11, long j11, TLObject tLObject, int i10, boolean z12, int i11) {
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        int i15;
        long j12;
        ArrayList<Integer> arrayList3;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        NativeByteBuffer nativeByteBuffer3;
        long z16;
        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages;
        boolean z17;
        NativeByteBuffer nativeByteBuffer4;
        NativeByteBuffer nativeByteBuffer5;
        long z18;
        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages;
        boolean z19;
        NativeByteBuffer nativeByteBuffer6;
        NativeByteBuffer nativeByteBuffer7;
        long z20;
        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages;
        boolean z21;
        NativeByteBuffer nativeByteBuffer8;
        NativeByteBuffer nativeByteBuffer9;
        long z22;
        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages;
        long j13;
        int i16;
        long j14;
        long j15 = j10;
        if (i3 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i17 = 5;
        if (i3 == 5) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (i3 == 9) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((arrayList != null && !arrayList.isEmpty()) || j11 != 0) {
            if (j11 == 0) {
                if (j15 != 0 && m5.z(j15)) {
                    TLRPC.Chat M0 = M0(Long.valueOf(-j15));
                    if (t3.T(M0)) {
                        j14 = M0.f27001id;
                    } else {
                        j14 = 0;
                    }
                    j13 = j14;
                } else {
                    j13 = 0;
                }
                if (!z11) {
                    ArrayList<Integer> arrayList4 = new ArrayList<>();
                    int size = arrayList.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        Integer num = (Integer) arrayList.get(i18);
                        if (num.intValue() > 0) {
                            arrayList4.add(num);
                        }
                    }
                    arrayList3 = arrayList4;
                } else {
                    arrayList3 = null;
                }
                if (z13) {
                    getMessagesStorage().P0(j15, arrayList, true, false, 1, 0);
                    j15 = j10;
                    i12 = i10;
                    i13 = 5;
                } else if (z14) {
                    if (i3 == 5) {
                        lg.u1 f10 = lg.u1.f(this.currentAccount);
                        int size2 = arrayList.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            Object obj = arrayList.get(i19);
                            i19++;
                            Integer num2 = (Integer) obj;
                            num2.getClass();
                            ArrayList arrayList5 = f10.f18486c;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList5.size()) {
                                    lg.t1 t1Var = (lg.t1) arrayList5.get(i20);
                                    i16 = i17;
                                    if (t1Var.h.contains(num2)) {
                                        t1Var.h.remove(num2);
                                        if (t1Var.a() <= 0) {
                                            arrayList5.remove(t1Var);
                                        }
                                        hs.f(f10.f18484a).k(hs.F1, new Object[0]);
                                    } else {
                                        i20++;
                                        i17 = i16;
                                    }
                                } else {
                                    i16 = i17;
                                    break;
                                }
                            }
                            i17 = i16;
                        }
                    }
                    i13 = i17;
                    j15 = j10;
                    i12 = i10;
                    getMessagesStorage().P0(j15, arrayList, true, false, 5, i12);
                } else {
                    i13 = 5;
                    if (z15) {
                        j15 = j10;
                        i12 = i10;
                        getMessagesStorage().P0(j15, arrayList, true, false, 9, i12);
                    } else {
                        if (j13 == 0) {
                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                zi ziVar = (zi) this.V.get(((Integer) arrayList.get(i21)).intValue());
                                if (ziVar != null) {
                                    ziVar.Z = true;
                                }
                            }
                        } else {
                            l3(arrayList, j10);
                        }
                        i12 = i10;
                        getMessagesStorage().P0(j10, arrayList, true, z10, 0, i12);
                        j15 = j10;
                        j12 = j13;
                        getMessagesStorage().R1(j15, j12, arrayList, null);
                        hs notificationCenter = getNotificationCenter();
                        Long valueOf = Long.valueOf(j12);
                        Boolean valueOf2 = Boolean.valueOf(z13);
                        Boolean valueOf3 = Boolean.valueOf(z12);
                        Integer valueOf4 = Integer.valueOf(i11);
                        Object[] objArr = new Object[6];
                        objArr[0] = arrayList;
                        objArr[1] = valueOf;
                        objArr[2] = valueOf2;
                        i15 = 3;
                        objArr[3] = Boolean.FALSE;
                        i14 = 4;
                        objArr[4] = valueOf3;
                        objArr[i13] = valueOf4;
                        notificationCenter.k(hs.f23325w, objArr);
                    }
                }
                j12 = j13;
                hs notificationCenter2 = getNotificationCenter();
                Long valueOf5 = Long.valueOf(j12);
                Boolean valueOf22 = Boolean.valueOf(z13);
                Boolean valueOf32 = Boolean.valueOf(z12);
                Integer valueOf42 = Integer.valueOf(i11);
                Object[] objArr2 = new Object[6];
                objArr2[0] = arrayList;
                objArr2[1] = valueOf5;
                objArr2[2] = valueOf22;
                i15 = 3;
                objArr2[3] = Boolean.FALSE;
                i14 = 4;
                objArr2[4] = valueOf32;
                objArr2[i13] = valueOf42;
                notificationCenter2.k(hs.f23325w, objArr2);
            } else {
                i12 = i10;
                i13 = 5;
                i14 = 4;
                i15 = 3;
                if (tLObject instanceof TLRPC.TL_channels_deleteMessages) {
                    j12 = ((TLRPC.TL_channels_deleteMessages) tLObject).channel.channel_id;
                } else {
                    j12 = 0;
                }
                arrayList3 = null;
            }
            if (!z11) {
                if (z13) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteScheduledMessages) {
                        tL_messages_deleteScheduledMessages = (TLRPC.TL_messages_deleteScheduledMessages) tLObject;
                        z22 = j11;
                    } else {
                        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages2 = new TLRPC.TL_messages_deleteScheduledMessages();
                        tL_messages_deleteScheduledMessages2.f27082id = arrayList3;
                        tL_messages_deleteScheduledMessages2.peer = j1(j15);
                        try {
                            nativeByteBuffer9 = new NativeByteBuffer(tL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer9.writeInt32(24);
                                nativeByteBuffer9.writeInt64(j15);
                                tL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer9);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer8 = nativeByteBuffer9;
                                z21 = true;
                                a8.g(e, z21);
                                nativeByteBuffer9 = nativeByteBuffer8;
                                z22 = getMessagesStorage().z(nativeByteBuffer9);
                                tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new gj(this, z22, i15));
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z21 = true;
                            nativeByteBuffer8 = null;
                        }
                        z22 = getMessagesStorage().z(nativeByteBuffer9);
                        tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new gj(this, z22, i15));
                } else if (z14) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteQuickReplyMessages) {
                        tL_messages_deleteQuickReplyMessages = (TLRPC.TL_messages_deleteQuickReplyMessages) tLObject;
                        z20 = j11;
                    } else {
                        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages2 = new TLRPC.TL_messages_deleteQuickReplyMessages();
                        tL_messages_deleteQuickReplyMessages2.f27081id = arrayList3;
                        tL_messages_deleteQuickReplyMessages2.shortcut_id = i12;
                        try {
                            nativeByteBuffer7 = new NativeByteBuffer(tL_messages_deleteQuickReplyMessages2.getObjectSize() + 16);
                            try {
                                nativeByteBuffer7.writeInt32(103);
                                nativeByteBuffer7.writeInt64(j15);
                                nativeByteBuffer7.writeInt32(i12);
                                tL_messages_deleteQuickReplyMessages2.serializeToStream(nativeByteBuffer7);
                            } catch (Exception e12) {
                                e = e12;
                                nativeByteBuffer6 = nativeByteBuffer7;
                                z19 = true;
                                a8.g(e, z19);
                                nativeByteBuffer7 = nativeByteBuffer6;
                                z20 = getMessagesStorage().z(nativeByteBuffer7);
                                tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new gj(this, z20, i14));
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z19 = true;
                            nativeByteBuffer6 = null;
                        }
                        z20 = getMessagesStorage().z(nativeByteBuffer7);
                        tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new gj(this, z20, i14));
                } else if (j12 != 0) {
                    if (tLObject != null) {
                        tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                        z18 = j11;
                    } else {
                        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                        tL_channels_deleteMessages2.f27034id = arrayList3;
                        tL_channels_deleteMessages2.channel = h1(j12);
                        try {
                            nativeByteBuffer5 = new NativeByteBuffer(tL_channels_deleteMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer5.writeInt32(24);
                                nativeByteBuffer5.writeInt64(j15);
                                tL_channels_deleteMessages2.serializeToStream(nativeByteBuffer5);
                            } catch (Exception e14) {
                                e = e14;
                                nativeByteBuffer4 = nativeByteBuffer5;
                                z17 = true;
                                a8.g(e, z17);
                                nativeByteBuffer5 = nativeByteBuffer4;
                                z18 = getMessagesStorage().z(nativeByteBuffer5);
                                tL_channels_deleteMessages = tL_channels_deleteMessages2;
                                getConnectionsManager().sendRequest(tL_channels_deleteMessages, new gk(0, j12, z18, this));
                            }
                        } catch (Exception e15) {
                            e = e15;
                            z17 = true;
                            nativeByteBuffer4 = null;
                        }
                        z18 = getMessagesStorage().z(nativeByteBuffer5);
                        tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new gk(0, j12, z18, this));
                } else {
                    if (arrayList2 != null && encryptedChat != null && !arrayList2.isEmpty()) {
                        nativeByteBuffer = null;
                        getSecretChatHelper().t(encryptedChat, arrayList2, null);
                    } else {
                        nativeByteBuffer = null;
                    }
                    if (tLObject instanceof TLRPC.TL_messages_deleteMessages) {
                        tL_messages_deleteMessages = (TLRPC.TL_messages_deleteMessages) tLObject;
                        z16 = j11;
                    } else {
                        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages2 = new TLRPC.TL_messages_deleteMessages();
                        tL_messages_deleteMessages2.f27080id = arrayList3;
                        tL_messages_deleteMessages2.revoke = z10;
                        try {
                            nativeByteBuffer3 = new NativeByteBuffer(tL_messages_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e16) {
                            e = e16;
                            nativeByteBuffer2 = nativeByteBuffer;
                        }
                        try {
                            nativeByteBuffer3.writeInt32(24);
                            nativeByteBuffer3.writeInt64(j15);
                            tL_messages_deleteMessages2.serializeToStream(nativeByteBuffer3);
                        } catch (Exception e17) {
                            e = e17;
                            nativeByteBuffer2 = nativeByteBuffer3;
                            a8.g(e, true);
                            nativeByteBuffer3 = nativeByteBuffer2;
                            z16 = getMessagesStorage().z(nativeByteBuffer3);
                            tL_messages_deleteMessages = tL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteMessages, new gj(this, z16, i13));
                        }
                        z16 = getMessagesStorage().z(nativeByteBuffer3);
                        tL_messages_deleteMessages = tL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteMessages, new gj(this, z16, i13));
                }
            }
        }
    }

    public final TLRPC.EncryptedChat b1(int i3, boolean z10) {
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f22973c.get(Integer.valueOf(i3));
        if (encryptedChat != null) {
            if (z10) {
                if (!(encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) && !(encryptedChat instanceof TLRPC.TL_encryptedChatRequested)) {
                    return encryptedChat;
                }
            } else {
                return encryptedChat;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        qr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.f24934a.c(new zl(messagesStorage, i3, arrayList, countDownLatch, 15));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (arrayList.size() == 2) {
            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
            U3(encryptedChat2, false);
            X3((TLRPC.User) arrayList.get(1), true, false);
            return encryptedChat2;
        }
        return encryptedChat;
    }

    public final TLRPC.UserFull b2(long j10) {
        return (TLRPC.UserFull) this.f23053l1.f(j10);
    }

    public final void b3(int i3) {
        SparseIntArray sparseIntArray = this.f23088p2;
        if (sparseIntArray.indexOfKey(i3) < 0) {
            SharedPreferences k10 = getUserConfig().k();
            if (!k10.getBoolean("2pinnedDialogsLoaded" + i3, false)) {
                sparseIntArray.put(i3, 1);
                TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
                tL_messages_getPinnedDialogs.folder_id = i3;
                getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new un(this, i3, 0));
            }
        }
    }

    public final void b4(TLRPC.InputPeer inputPeer, long j10) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (j10 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
            } catch (Exception e10) {
                nativeByteBuffer = null;
                exc = e10;
            }
            try {
                nativeByteBuffer.writeInt32(22);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e11) {
                exc = e11;
                a8.g(exc, true);
                j10 = getMessagesStorage().z(nativeByteBuffer);
                long j11 = j10;
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new fj(this, inputPeer, j11, 8));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        }
        long j112 = j10;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new fj(this, inputPeer, j112, 8));
    }

    public final void b5(long j10, boolean z10) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = h1(j10);
        tL_channels_togglePreHistoryHidden.enabled = z10;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new ij(this, 12), 64);
    }

    public final void c(long j10, boolean z10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j10);
        if (dialog == null) {
            return;
        }
        if (z10) {
            this.F0.k(dialog, j10);
        } else {
            this.E0.k(dialog, j10);
            this.f23169y.remove(dialog);
            T4(null);
        }
        getNotificationCenter().k(hs.f23298s, Boolean.TRUE);
    }

    public final void c0(long j10, long j11, ArrayList arrayList) {
        getMessagesStorage().f24934a.c(new xj(this, arrayList, j11, j10));
    }

    public final String c1(long j10) {
        if (j10 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (a22 != null) {
                return g5.m(0, a22.first_name, a22.last_name);
            }
            return null;
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j10));
        if (M0 != null) {
            return M0.title;
        }
        return null;
    }

    public final void c3(boolean z10, ai.g3 g3Var) {
        if (g3Var != null) {
            this.H7 = g3Var;
        }
        if (getUserConfig().p()) {
            if (z10 || !getUserConfig().Q) {
                if (z10) {
                    getUserConfig().Q = false;
                    getUserConfig().v(false);
                }
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new ij(this, 18));
            }
        }
    }

    public final void c4(long j10) {
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        tL_users_getUsers.f27144id.add(o1(j10));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new ij(this, 7));
    }

    public final void c5(final long j10, final long j11, boolean z10, boolean z11, final boolean z12, final Runnable runnable, final Runnable runnable2) {
        TLRPC.InputUser tL_inputUserEmpty;
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = h1(j10);
        tL_channels_toggleJoinRequest.enabled = z10;
        tL_channels_toggleJoinRequest.apply_to_invites = z11;
        if (z12) {
            if (j11 != 0) {
                tL_inputUserEmpty = o1(j11);
            } else {
                tL_inputUserEmpty = new TLRPC.TL_inputUserEmpty();
            }
            tL_channels_toggleJoinRequest.guard_bot = tL_inputUserEmpty;
        }
        getConnectionsManager().sendRequest(tL_channels_toggleJoinRequest, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Runnable runnable3 = runnable;
                if (tLObject != null) {
                    final hp hpVar = hp.this;
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    final boolean z13 = z12;
                    final long j12 = j10;
                    final long j13 = j11;
                    g0.i3(new Runnable() {
                        @Override
                        public final void run() {
                            TLRPC.ChatFull N0;
                            boolean z14;
                            hp hpVar2 = hp.this;
                            if (z13 && (N0 = hpVar2.N0(j12)) != null) {
                                int i3 = N0.flags2;
                                long j14 = j13;
                                if (j14 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                N0.flags2 = x7.u.b(i3, 8388608, z14);
                                N0.guard_bot_id = j14;
                                hpVar2.getMessagesStorage().N1(N0, false);
                                hs notificationCenter = hpVar2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(hs.T, N0, 0, bool, bool);
                            }
                            hpVar2.getNotificationCenter().k(hs.f23292r, 8192);
                        }
                    }, 100L);
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                } else if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                    Runnable runnable4 = runnable2;
                    if (runnable4 != null) {
                        runnable4.run();
                    }
                } else if (runnable3 != null) {
                    runnable3.run();
                }
            }
        }, 64);
    }

    public final int d(int i3, int i10, long j10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j10));
        return e(arrayList, i3, i10, null, 0L);
    }

    public final void d0(long j10, long j11, int i3, int i10, boolean z10, org.telegram.ui.tf tfVar) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = j1(j10);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i3;
        tL_messages_deleteHistory.max_date = i10;
        tL_messages_deleteHistory.revoke = z10;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new en(this, j10, i3, i10, j11, z10, tfVar));
    }

    public final k10 d2() {
        if (this.T2 == null) {
            this.T2 = new k10(this.currentAccount);
        }
        return this.T2;
    }

    public final void d3() {
        if (this.U0) {
            return;
        }
        this.U0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new ij(this, 26));
    }

    public final void d4(long j10, HashMap hashMap, int i3) {
        boolean z10;
        HashMap hashMap2;
        a0.h hVar;
        boolean z11 = false;
        if (i3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 == 3) {
            z11 = true;
        }
        if (z10) {
            hashMap2 = this.G1;
            hVar = this.H1;
        } else if (z11) {
            hashMap2 = this.I1;
            hVar = this.J1;
        } else {
            hashMap2 = this.E1;
            hVar = this.F1;
        }
        HashMap hashMap3 = hashMap2;
        a0.h hVar2 = hVar;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = (ArrayList) entry.getValue();
            ArrayList arrayList2 = (ArrayList) hashMap3.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap3.put(str, arrayList2);
            }
            arrayList2.addAll(arrayList);
            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
            getwebpagepreview.message = str;
            getConnectionsManager().sendRequest(getwebpagepreview, new org.telegram.messenger.voip.w(this, hashMap3, str, hVar2, j10, i3));
        }
    }

    public final void d5(long j10, int i3, boolean z10, gi.m9 m9Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = j1(j10);
        tL_messages_toggleNoForwards.enabled = z10;
        if (i3 > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i3;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new cl(this, m9Var, 1), 64);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.InputFile inputFile;
        org.telegram.ui.ActionBar.g6 g6Var;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        hp hpVar = this;
        int i11 = hs.U1;
        HashMap hashMap = hpVar.Q2;
        TLRPC.BaseTheme baseTheme = null;
        if (i3 == i11) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = hpVar.O2;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                hpVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ij(hpVar, 19));
            } else {
                String str3 = hpVar.R2;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    org.telegram.ui.ActionBar.b6 b6Var = hpVar.S2;
                    String str4 = hpVar.R2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = b6Var.f27428i;
                    tL_wallPaperSettings.motion = b6Var.f27429j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    org.telegram.ui.ActionBar.b6 b6Var2 = hpVar.S2;
                    b6Var2.f27437r = 1.0f;
                    b6Var2.f27438s = new ArrayList();
                    hpVar.S2.f27438s.add(Integer.valueOf(hpVar.getConnectionsManager().sendRequest(uploadwallpaper, new q6(hpVar, b6Var, tL_wallPaperSettings, str4, 3))));
                } else {
                    Object obj = hashMap.get(str);
                    if (obj instanceof org.telegram.ui.ActionBar.j6) {
                        j6Var = (org.telegram.ui.ActionBar.j6) obj;
                        if (str.equals(j6Var.I)) {
                            j6Var.K = inputFile3;
                            j6Var.I = null;
                        } else if (str.equals(j6Var.J)) {
                            j6Var.L = inputFile3;
                            j6Var.J = null;
                        }
                        inputFile = j6Var.K;
                        inputFile2 = j6Var.L;
                        g6Var = null;
                    } else if (obj instanceof org.telegram.ui.ActionBar.g6) {
                        org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                        if (str.equals(g6Var2.f27543u)) {
                            g6Var2.f27544w = inputFile3;
                            g6Var2.f27543u = null;
                        } else if (str.equals(g6Var2.v)) {
                            g6Var2.f27545x = inputFile3;
                            g6Var2.v = null;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var2 = g6Var2.f27526b;
                        TLRPC.InputFile inputFile4 = g6Var2.f27544w;
                        inputFile2 = g6Var2.f27545x;
                        g6Var = g6Var2;
                        j6Var = j6Var2;
                        inputFile = inputFile4;
                    } else {
                        j6Var = null;
                        inputFile = null;
                        g6Var = null;
                        inputFile2 = null;
                    }
                    hashMap.remove(str);
                    if (inputFile2 != null && inputFile != null) {
                        new File(str);
                        TL_account.uploadTheme uploadtheme = new TL_account.uploadTheme();
                        uploadtheme.mime_type = "application/x-tgtheme-android";
                        uploadtheme.file_name = "theme.attheme";
                        uploadtheme.file = inputFile2;
                        inputFile2.name = "theme.attheme";
                        uploadtheme.thumb = inputFile;
                        inputFile.name = "theme-preview.jpg";
                        uploadtheme.flags |= 1;
                        if (g6Var != null) {
                            g6Var.f27545x = null;
                            g6Var.f27544w = null;
                            tL_theme = g6Var.f27540r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str5 = j6Var.f27675a;
                            int i12 = org.telegram.ui.ActionBar.k6.f27816a;
                            if ("Blue".equals(str5)) {
                                baseTheme = new TLRPC.TL_baseThemeClassic();
                            } else if ("Day".equals(str5)) {
                                baseTheme = new TLRPC.TL_baseThemeDay();
                            } else if ("Dark Blue".equals(str5)) {
                                baseTheme = new TLRPC.TL_baseThemeTinted();
                            } else if ("Arctic Blue".equals(str5)) {
                                baseTheme = new TLRPC.TL_baseThemeArctic();
                            } else if ("Night".equals(str5)) {
                                baseTheme = new TLRPC.TL_baseThemeNight();
                            }
                            tL_inputThemeSettings2.base_theme = baseTheme;
                            tL_inputThemeSettings2.accent_color = g6Var.f27527c;
                            int i13 = g6Var.d;
                            if (i13 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i13;
                            }
                            int i14 = g6Var.f27528e;
                            if (i14 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i14));
                                tL_inputThemeSettings2.flags |= 1;
                                int i15 = g6Var.f27529f;
                                if (i15 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i15));
                                    int i16 = g6Var.f27530g;
                                    if (i16 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i16));
                                        int i17 = g6Var.h;
                                        if (i17 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i17));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = g6Var.f27531i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(g6Var.f27537o)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = g6Var.f27537o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (g6Var.f27538p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.f27074id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = g6Var.f27539q;
                            long j10 = g6Var.f27532j;
                            if (j10 != 0) {
                                wallPaperSettings2.background_color = (int) j10;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j11 = g6Var.f27533k;
                            if (j11 != 0) {
                                wallPaperSettings2.second_background_color = (int) j11;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = g0.s1(g6Var.f27536n, true);
                            }
                            long j12 = g6Var.f27534l;
                            if (j12 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j12;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j13 = g6Var.f27535m;
                            if (j13 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j13;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            j6Var.L = null;
                            j6Var.K = null;
                            tL_theme = j6Var.G;
                            tL_inputThemeSettings = null;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                        hpVar = this;
                        getConnectionsManager().sendRequest(uploadtheme, new tn(hpVar, tL_theme, j6Var3, tL_inputThemeSettings, g6Var, 0));
                    }
                }
                hpVar = this;
            }
        } else if (i3 == hs.V1) {
            String str6 = (String) objArr[0];
            String str7 = hpVar.O2;
            if (str7 != null && str7.equals(str6)) {
                hpVar.O2 = null;
            } else {
                String str8 = hpVar.R2;
                if (str8 != null && str8.equals(str6)) {
                    hpVar.R2 = null;
                    hpVar.S2 = null;
                } else {
                    Object remove = hashMap.remove(str6);
                    boolean z10 = remove instanceof org.telegram.ui.ActionBar.j6;
                    int i18 = hs.N2;
                    if (z10) {
                        org.telegram.ui.ActionBar.j6 j6Var4 = (org.telegram.ui.ActionBar.j6) remove;
                        j6Var4.L = null;
                        j6Var4.K = null;
                        hpVar.getNotificationCenter().k(i18, j6Var4, 0);
                    } else if (remove instanceof org.telegram.ui.ActionBar.g6) {
                        org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) remove;
                        g6Var3.f27543u = null;
                        hpVar.getNotificationCenter().k(i18, g6Var3.f27526b, g6Var3);
                    }
                }
            }
        }
        if (i3 == hs.W1) {
            String str9 = (String) objArr[0];
            String str10 = hpVar.R2;
            if (str10 != null && str10.equals(str9)) {
                hpVar.S2.f27437r = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        int i19 = hs.K;
        SparseArray sparseArray = hpVar.V;
        if (i3 == i19) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l10 = (Long) objArr[3];
                ArrayList arrayList = (ArrayList) hpVar.S.f(l10.longValue());
                for (int i20 = 0; arrayList != null && i20 < arrayList.size(); i20++) {
                    zi ziVar2 = (zi) arrayList.get(i20);
                    if (ziVar2 != null && (ziVar2.f1() == num.intValue() || ziVar2.f26868k.local_id == num.intValue())) {
                        ziVar2.f26868k.f27022id = num2.intValue();
                        ziVar2.f26868k.send_state = 0;
                    }
                    zi ziVar3 = (zi) sparseArray.get(num.intValue());
                    if (ziVar3 != null) {
                        sparseArray.remove(num.intValue());
                        sparseArray.put(num2.intValue(), ziVar3);
                    }
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) hpVar.R.f(l10.longValue());
                if (dialog != null && dialog.top_message == num.intValue()) {
                    dialog.top_message = num2.intValue();
                    hpVar.getNotificationCenter().k(hs.f23298s, new Object[0]);
                }
                if (m5.z(l10.longValue())) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hpVar.m1.f(-l10.longValue());
                    TLRPC.Chat M0 = hpVar.M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null && !t3.N(M0) && !zi.g3(num2.intValue()) && chatFull != null && chatFull.slowmode_seconds != 0) {
                        chatFull.slowmode_next_send_date = hpVar.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                        chatFull.flags |= 262144;
                        hpVar.getMessagesStorage().N1(chatFull, false);
                    }
                }
            }
        } else if (i3 == hs.f23259l0) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id == 0 && (ziVar = (zi) sparseArray.get(message.f27022id)) != null) {
                ziVar.f26868k.media = zi.o1(message);
                if (zi.o1(message).ttl_seconds != 0) {
                    if ((zi.o1(message).photo instanceof TLRPC.TL_photoEmpty) || (zi.o1(message).document instanceof TLRPC.TL_documentEmpty)) {
                        ziVar.M5();
                        hpVar.getNotificationCenter().k(hs.f23225f0, new Object[0]);
                    }
                }
            }
        } else if (i3 == hs.f23230f5) {
            hpVar.R2(false);
            hpVar.getContactsController().J(true);
            if ((hpVar.f23092p6 && !hpVar.getUserConfig().q()) || hpVar.getUserConfig().q()) {
                hpVar.getNotificationCenter().k(hs.f23266m3, new Object[0]);
            }
        }
    }

    public final int e(java.util.ArrayList r23, int r24, int r25, java.util.ArrayList r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.e(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public final void e0(final long j10, TLRPC.InputPeer inputPeer, boolean z10, final org.telegram.ui.pa paVar) {
        final boolean z11;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat M0 = M0(Long.valueOf(j10));
        if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && l10.B(getMessagesController().a2(Long.valueOf(inputPeer.user_id)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        final boolean T = t3.T(M0);
        if (T) {
            if (z11) {
                boolean z12 = M0.creator;
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = i1(M0);
                tL_messages_deleteChatUser = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                tL_channels_editBanned.channel = i1(M0);
                tL_channels_editBanned.participant = inputPeer;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                tL_channels_editBanned.banned_rights = tL_chatBannedRights;
                tL_chatBannedRights.view_messages = true;
                tL_chatBannedRights.send_media = true;
                tL_chatBannedRights.send_messages = true;
                tL_chatBannedRights.send_stickers = true;
                tL_chatBannedRights.send_gifs = true;
                tL_chatBannedRights.send_games = true;
                tL_chatBannedRights.send_inline = true;
                tL_chatBannedRights.embed_links = true;
                tL_chatBannedRights.pin_messages = true;
                tL_chatBannedRights.send_polls = true;
                tL_chatBannedRights.invite_users = true;
                tL_chatBannedRights.change_info = true;
                tL_chatBannedRights.edit_rank = true;
                tL_chatBannedRights.send_reactions = true;
                tL_messages_deleteChatUser = tL_channels_editBanned;
            }
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser2.chat_id = j10;
            tL_messages_deleteChatUser2.user_id = p1(inputPeer);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        }
        if (z11) {
            X(0, -j10, z10);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    hp hpVar = hp.this;
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    if (T && !z11) {
                        g0.i3(new dk(hpVar, j10, 21), 1000L);
                    }
                    Runnable runnable = paVar;
                    if (runnable != null) {
                        g0.h3(runnable);
                    }
                }
            }
        }, 64);
    }

    public final TLObject e2(long j10) {
        Long valueOf = Long.valueOf(j10);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(valueOf)) {
            return (TLObject) concurrentHashMap.get(Long.valueOf(j10));
        }
        long j11 = -j10;
        Long valueOf2 = Long.valueOf(j11);
        ConcurrentHashMap concurrentHashMap2 = this.f22963b;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            return (TLObject) concurrentHashMap2.get(Long.valueOf(j11));
        }
        return null;
    }

    public final void e3(TLRPC.Chat chat, long j10) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j11 = chat.f27001id;
            a0.h hVar = this.f22975c1;
            if (hVar.h(j11) < 0) {
                int i3 = (chat.access_hash > 0L ? 1 : (chat.access_hash == 0L ? 0 : -1));
                if (i3 == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.f27001id;
                    tL_inputPeerChannel.peer = j1(chat.fromMessageDialogId);
                    tL_inputPeerChannel.msg_id = chat.fromMessageId;
                } else if (i3 == 0) {
                    if (j10 != 0) {
                        getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChannel.channel_id = chat.f27001id;
                    tL_inputPeerChannel.access_hash = chat.access_hash;
                }
                hVar.k(Boolean.TRUE, chat.f27001id);
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = tL_inputPeerChannel;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                if (j10 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize() + 4);
                    } catch (Exception e10) {
                        nativeByteBuffer = null;
                        exc = e10;
                    }
                    try {
                        nativeByteBuffer.writeInt32(0);
                        chat.serializeToStream(nativeByteBuffer);
                    } catch (Exception e11) {
                        exc = e11;
                        a8.g(exc, true);
                        j10 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new fj(this, j10, chat, 2));
                    }
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new fj(this, j10, chat, 2));
            }
        }
    }

    public final void e4(ArrayList arrayList, long j10) {
        int i3 = 0;
        int i10 = this.U.get(j10, 0);
        if (i10 != 0) {
            int size = arrayList.size();
            while (i3 < size) {
                if (((TLRPC.Message) arrayList.get(i3)).f27022id <= i10) {
                    arrayList.remove(i3);
                    i3--;
                    size--;
                }
                i3++;
            }
        }
    }

    public final void e5(long j10, boolean z10) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = h1(j10);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z10;
        TLRPC.Chat M0 = M0(Long.valueOf(j10));
        if (M0 != null) {
            M0.collapsed_in_dialogs = z10;
            Q3(M0, true);
            T4(null);
            getNotificationCenter().k(hs.T5, Long.valueOf(j10), Boolean.valueOf(z10));
            getNotificationCenter().k(hs.f23298s, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new c3.b(1), new kh.b(2));
    }

    public final void f(int i3, TLRPC.Dialog dialog) {
        int i10;
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            i10 = 0;
        } else {
            i10 = dialog.folder_id;
        }
        SparseArray sparseArray = this.f23149w;
        ArrayList arrayList = (ArrayList) sparseArray.get(i10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i10, arrayList);
        }
        if (i3 == -1) {
            arrayList.add(dialog);
        } else if (i3 == -2) {
            if (!arrayList.isEmpty() && (arrayList.get(0) instanceof TLRPC.TL_dialogFolder)) {
                arrayList.add(1, dialog);
            } else {
                arrayList.add(0, dialog);
            }
        } else {
            arrayList.add(i3, dialog);
        }
    }

    public final void f0(long j10, TLRPC.User user) {
        g0(j10, user, null, false, false);
    }

    public final TLObject f2(String str) {
        if (str != null && str.length() != 0) {
            return (TLObject) this.f22991e.get(str.toLowerCase());
        }
        return null;
    }

    public final void f3(TLRPC.InputPeer inputPeer, long j10) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long n4 = m5.n(inputPeer);
            a0.h hVar = this.f22983d1;
            if (hVar.h(n4) >= 0) {
                return;
            }
            hVar.k(Boolean.TRUE, n4);
            if (r2.f25040a) {
                a8.b("load unknown dialog " + n4);
            }
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = inputPeer;
            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
            if (j10 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
                } catch (Exception e10) {
                    exc = e10;
                }
                try {
                    nativeByteBuffer.writeInt32(15);
                    inputPeer.serializeToStream(nativeByteBuffer);
                } catch (Exception e11) {
                    exc = e11;
                    nativeByteBuffer2 = nativeByteBuffer;
                    a8.g(exc, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new gk(1, j10, n4, this));
                }
                j10 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new gk(1, j10, n4, this));
        }
    }

    public final void f4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j10 = dialog.f27005id;
        if (this.F.remove(dialog) && m5.y(dialog)) {
            Utilities.d.c(new dk(this, j10, 8));
        }
        this.f23169y.remove(dialog);
        this.H.remove(dialog);
        this.I.remove(dialog);
        this.G.remove(dialog);
        this.J.remove(dialog);
        this.M.remove(dialog);
        this.K.remove(dialog);
        this.L.remove(dialog);
        this.E.remove(dialog);
        int i3 = 0;
        while (true) {
            mo[] moVarArr = this.N;
            if (i3 >= moVarArr.length) {
                break;
            }
            mo moVar = moVarArr[i3];
            if (moVar != null) {
                moVar.f24245k.remove(dialog);
                this.N[i3].f24246l.remove(dialog);
            }
            i3++;
        }
        this.R.l(j10);
        ArrayList arrayList = (ArrayList) this.f23149w.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
        g4(dialog);
    }

    public final void f5(Runnable runnable, long j10) {
        TLRPC.Chat M0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j10 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (a22 != null) {
                user = a22;
                M0 = null;
            } else {
                return;
            }
        } else {
            M0 = M0(Long.valueOf(-j10));
            if (M0 == null) {
                return;
            }
        }
        this.I0--;
        this.H0.delete(j10);
        if (user != null) {
            tL_contacts_unblock.f27049id = n1(user);
        } else {
            tL_contacts_unblock.f27049id = l1(M0);
        }
        getNotificationCenter().k(hs.f23231g0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new s1(runnable, 3));
    }

    public final void g(mo moVar, boolean z10) {
        if (z10) {
            int size = this.Q0.size();
            int i3 = 254;
            for (int i10 = 0; i10 < size; i10++) {
                i3 = Math.min(i3, ((mo) this.Q0.get(i10)).f24241f);
            }
            moVar.f24241f = i3 - 1;
            if (((mo) this.Q0.get(0)).e()) {
                this.Q0.add(1, moVar);
            } else {
                this.Q0.add(0, moVar);
            }
        } else {
            int size2 = this.Q0.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                i11 = Math.max(i11, ((mo) this.Q0.get(i12)).f24241f);
            }
            moVar.f24241f = i11 + 1;
            this.Q0.add(moVar);
        }
        this.T0.put(moVar.f24237a, moVar);
        if (this.Q0.size() == 1 && az.m(this.currentAccount) != 5) {
            az.f21660r1 = 5;
            t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", az.f21660r1).apply();
        }
        i3();
    }

    public final void g0(long j10, TLRPC.User user, TLRPC.Chat chat, boolean z10, boolean z11) {
        TLRPC.InputPeer l12;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user == null && chat == null) {
            return;
        }
        if (user != null) {
            l12 = n1(user);
        } else {
            l12 = l1(chat);
        }
        TLRPC.Chat M0 = M0(Long.valueOf(j10));
        boolean T = t3.T(M0);
        if (T) {
            if (l10.B(user)) {
                if (M0.creator && z10) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = i1(M0);
                    tL_messages_deleteChatUser = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = i1(M0);
                    tL_messages_deleteChatUser = tL_channels_leaveChannel;
                }
            } else {
                if (t3.Y(M0)) {
                    TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
                    tL_communities_toggleParticipantBanned.participant = l12;
                    tL_communities_toggleParticipantBanned.community = i1(M0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = i1(M0);
                    tL_channels_editBanned.participant = l12;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                    tL_channels_editBanned.banned_rights = tL_chatBannedRights;
                    tL_chatBannedRights.view_messages = true;
                    tL_chatBannedRights.send_media = true;
                    tL_chatBannedRights.send_messages = true;
                    tL_chatBannedRights.send_stickers = true;
                    tL_chatBannedRights.send_gifs = true;
                    tL_chatBannedRights.send_games = true;
                    tL_chatBannedRights.send_inline = true;
                    tL_chatBannedRights.embed_links = true;
                    tL_chatBannedRights.pin_messages = true;
                    tL_chatBannedRights.send_polls = true;
                    tL_chatBannedRights.invite_users = true;
                    tL_chatBannedRights.change_info = true;
                    tL_chatBannedRights.edit_rank = true;
                    tL_chatBannedRights.send_reactions = true;
                    tL_messages_deleteChatUser2 = tL_channels_editBanned;
                }
                tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
            }
        } else if (z10) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j10;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new ei.u5(13));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j10;
            tL_messages_deleteChatUser3.user_id = q1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (l10.B(user)) {
            X(0, -j10, z11);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new vk(this, T, user, j10), 64);
    }

    public final r3 g1(long j10, boolean z10, j80 j80Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull N0 = N0(j10);
        if (N0 != null && (inputGroupCall = N0.call) != null) {
            r3 r3Var = (r3) this.f23070n1.f(inputGroupCall.f27018id);
            if (r3Var == null && z10) {
                Long valueOf = Long.valueOf(j10);
                HashSet hashSet = this.f23132u1;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(j10));
                    if (N0.call != null) {
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        getgroupcall.call = N0.call;
                        getgroupcall.limit = 20;
                        getConnectionsManager().sendRequest(getgroupcall, new fj(this, j10, j80Var, 5));
                    }
                }
            }
            if (r3Var == null || !(r3Var.f25049b instanceof TLRPC.TL_groupCallDiscarded)) {
                return r3Var;
            }
            return null;
        }
        return null;
    }

    public final void g3(TLRPC.User user, boolean z10, int i3) {
        qr messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.f24934a.c(new gb(i3, 3, messagesStorage, user, z10));
        }
    }

    public final void g4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j10 = dialog.f27005id;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        a0.h hVar = this.f23159x;
        if (i3 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (a22 != null) {
                long j11 = a22.linked_community_id;
                if (j11 != 0 && (arrayList2 = (ArrayList) hVar.f(j11)) != null) {
                    arrayList2.remove(dialog);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j10));
        if (M0 != null) {
            long j12 = M0.linked_community_id;
            if (j12 != 0 && (arrayList = (ArrayList) hVar.f(j12)) != null) {
                arrayList.remove(dialog);
            }
        }
    }

    public final void g5(long j10, TLRPC.EmojiStatus emojiStatus, TL_stars.StarGift starGift) {
        boolean z10;
        TLRPC.EmojiStatus emojiStatus2;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        if (j10 != 0 && j10 != getUserConfig().e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && (starGift instanceof TL_stars.TL_starGiftUnique)) {
            emojiStatus2 = q0((TL_stars.TL_starGiftUnique) starGift);
        } else {
            emojiStatus2 = emojiStatus;
        }
        if (z10) {
            TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
            updateemojistatus.emoji_status = emojiStatus;
            TLRPC.User f10 = getUserConfig().f();
            tL_channels_updateEmojiStatus = updateemojistatus;
            if (f10 != null) {
                f10.emoji_status = emojiStatus2;
                getNotificationCenter().k(hs.f23268m5, f10);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j11 = -j10;
            tL_channels_updateEmojiStatus2.channel = h1(j11);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat M0 = M0(Long.valueOf(j11));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (M0 != null) {
                M0.flags |= 512;
                M0.emoji_status = emojiStatus2;
                Q3(M0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().j5(j10, emojiStatus2);
        getNotificationCenter().k(hs.f23292r, 524288);
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public final void h(zi ziVar, TLRPC.SuggestedPost suggestedPost) {
        zi ziVar2 = ziVar;
        if (ziVar2 != null && ziVar2.f26868k != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(ziVar2);
            yy sendMessagesHelper = getSendMessagesHelper();
            long B0 = zi.B0(ziVar2.f26868k);
            boolean z10 = !zi.m3(ziVar2.f26868k);
            TLRPC.Message message = ziVar2.f26868k;
            if (message.suggested_post == null) {
                ziVar2 = null;
            }
            sendMessagesHelper.q0(arrayList, B0, z10, false, true, 0, 0, ziVar2, -1, 0L, m5.o(message.saved_peer_id), ej.b(suggestedPost));
        }
    }

    public final void h0(long j10, int i3, long j11) {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new qq(messagesStorage, i3, j10, j11, 1));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = j1(j10);
        tL_messages_deleteParticipantReaction.participant = j1(j11);
        tL_messages_deleteParticipantReaction.msg_id = i3;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new c3.b(1), new wk(this, 2));
    }

    public final TLRPC.InputChannel h1(long j10) {
        return i1(M0(Long.valueOf(j10)));
    }

    public final void h3() {
        g0.r(this.f23168x8);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        ho hoVar = this.f23187z8;
        if (tL_webBrowserSettings == null) {
            hoVar.e(this.currentAccount, null, new wk(this, 0));
        }
        hoVar.d(this.currentAccount, null);
        hoVar.c(this.currentAccount, null, new vn(this, 2));
    }

    public final void h4(mo moVar) {
        this.Q0.remove(moVar);
        this.T0.remove(moVar.f24237a);
        getNotificationCenter().k(hs.O2, new Object[0]);
    }

    public final void h5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        g5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final void i(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            g0.h3(new jj(this, chat, 0));
        } else {
            j(chat);
        }
    }

    public final void i0(long j10, int i3, TLRPC.InputPeer inputPeer) {
        long n4 = m5.n(inputPeer);
        int[] iArr = {i3};
        ci.p9 p9Var = new ci.p9(this, n4, j10, inputPeer, i3, iArr);
        if (iArr[0] <= 0 && n4 == 0) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new a4(messagesStorage, j10, new um(iArr, p9Var), 29));
            return;
        }
        p9Var.run();
    }

    public final void i2(long j10, TLRPC.User user, TLRPC.Chat chat) {
        if (user != null || chat != null) {
            SharedPreferences.Editor edit = this.f22989d7.edit();
            edit.putInt("dialog_bar_vis3" + j10, 3);
            edit.remove("dialog_bar_invite" + j10);
            edit.commit();
            if (!m5.C(j10)) {
                TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
                if (user != null) {
                    tL_messages_hidePeerSettingsBar.peer = j1(user.f27150id);
                } else {
                    tL_messages_hidePeerSettingsBar.peer = j1(-chat.f27001id);
                }
                getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new ei.u5(13));
            }
        }
    }

    public final void i3() {
        boolean z10;
        if (!getUserConfig().q() && this.Q0.size() - 1 > this.L4) {
            int size = (this.Q0.size() - 1) - this.L4;
            ArrayList arrayList = new ArrayList(this.Q0);
            Collections.reverse(arrayList);
            z10 = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 < size) {
                    if (!((mo) arrayList.get(i3)).f24250p) {
                        z10 = true;
                    }
                    ((mo) arrayList.get(i3)).f24250p = true;
                } else {
                    if (((mo) arrayList.get(i3)).f24250p) {
                        z10 = true;
                    }
                    ((mo) arrayList.get(i3)).f24250p = false;
                }
            }
        } else {
            z10 = false;
        }
        if (z10) {
            getNotificationCenter().k(hs.O2, new Object[0]);
        }
    }

    public final void i4(int i3) {
        long j10 = 2305843009213693952L | i3;
        a0.h hVar = this.R;
        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
        if (dialog == null) {
            return;
        }
        hVar.l(j10);
        this.f23169y.remove(dialog);
        T4(null);
        getNotificationCenter().k(hs.f23298s, new Object[0]);
        getNotificationCenter().k(hs.f23213d0, Integer.valueOf(i3));
    }

    public final void i5() {
        int intValue;
        long longValue;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        ConcurrentHashMap concurrentHashMap = this.f23093p7;
        Iterator it = concurrentHashMap.keySet().iterator();
        Long l10 = null;
        while (it.hasNext()) {
            if (((Integer) concurrentHashMap.get(it.next())).intValue() > currentTimeMillis) {
                if (l10 == null) {
                    longValue = Long.MAX_VALUE;
                } else {
                    longValue = l10.longValue();
                }
                l10 = Long.valueOf(Math.min(longValue, intValue - currentTimeMillis));
            } else {
                it.remove();
            }
        }
        if (l10 != null) {
            long longValue2 = l10.longValue() + 2;
            long j10 = currentTimeMillis;
            if (j10 + longValue2 != this.f23075n7 + this.f23066m7) {
                g0.r(this.f23084o7);
                this.f23075n7 = j10;
                this.f23066m7 = longValue2;
                in inVar = new in(this, 3);
                this.f23084o7 = inVar;
                g0.i3(inVar, longValue2 * 1000);
                return;
            }
            return;
        }
        in inVar2 = this.f23084o7;
        if (inVar2 != null) {
            this.f23075n7 = -1L;
            this.f23066m7 = -1L;
            g0.r(inVar2);
        }
    }

    public final void j(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.f27001id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z10 = chat.call_active;
        int i3 = hs.A2;
        if (z10 && chat.call_not_empty && chat.migrated_to == null && !t3.r0(chat)) {
            if (chat2 == null) {
                hashMap.put(Long.valueOf(chat.f27001id), chat);
                getNotificationCenter().k(i3, new Object[0]);
            }
        } else if (chat2 == null) {
        } else {
            hashMap.remove(Long.valueOf(chat.f27001id));
            getNotificationCenter().k(i3, new Object[0]);
        }
    }

    public final void j0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        long j10;
        if (user != null) {
            j10 = user.f27150id;
        } else if (chat2 != null) {
            j10 = chat2.f27001id;
        } else {
            j10 = 0;
        }
        W(-chat.f27001id, j10);
    }

    public final TLRPC.InputPeer j1(long j10) {
        if (j10 == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j10 < 0) {
            long j11 = -j10;
            TLRPC.Chat M0 = M0(Long.valueOf(j11));
            if (t3.T(M0)) {
                if (M0 != null && M0.access_hash == 0) {
                    long j12 = M0.fromMessageDialogId;
                    if (j12 != 0 && j12 != j10 && M0.fromMessageId != 0) {
                        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                        tL_inputPeerChannelFromMessage.channel_id = j11;
                        tL_inputPeerChannelFromMessage.peer = j1(M0.fromMessageDialogId);
                        tL_inputPeerChannelFromMessage.msg_id = M0.fromMessageId;
                        return tL_inputPeerChannelFromMessage;
                    }
                }
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChannel.channel_id = j11;
                tL_inputPeerChannel.access_hash = M0.access_hash;
                return tL_inputPeerChannel;
            }
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j11;
            return tL_inputPeerChat;
        }
        TLRPC.User a22 = a2(Long.valueOf(j10));
        if (a22 != null && a22.access_hash == 0) {
            long j13 = a22.fromMessageDialogId;
            if (j13 != 0 && j13 != j10 && a22.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = j10;
                tL_inputPeerUserFromMessage.peer = j1(a22.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = a22.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = j10;
        if (a22 != null) {
            tL_inputPeerUser.access_hash = a22.access_hash;
        }
        return tL_inputPeerUser;
    }

    public final void j2() {
        if (this.f23172y2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = j1(this.f23172y2.f27005id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new ei.u5(13));
        Utilities.d.c(new mj(this, 19));
        j4();
    }

    public final void j3(final long r18, final int r20, int r21, final int r22, boolean r23, final long r24, int r26, final boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.j3(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public final void j4() {
        TLRPC.Dialog dialog = this.f23172y2;
        if (dialog == null) {
            return;
        }
        long j10 = dialog.f27005id;
        if (j10 < 0) {
            TLRPC.Chat M0 = M0(Long.valueOf(-j10));
            if (t3.r0(M0) || M0.restricted) {
                f4(this.f23172y2);
            }
        } else {
            f4(dialog);
        }
        this.f23172y2 = null;
        T4(null);
        getNotificationCenter().k(hs.f23298s, new Object[0]);
    }

    public final void j5(long j10, TLRPC.EmojiStatus emojiStatus) {
        int g7 = m5.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f23093p7;
        if (g7 != 0) {
            concurrentHashMap.put(Long.valueOf(j10), Integer.valueOf(g7));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j10))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j10));
        }
        i5();
    }

    public final void k() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.f27150id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        X3(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.f27150id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        X3(tL_userForeign_old22, true, false);
    }

    public final void k0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i3) {
        long j10;
        TLRPC.InputPeer l12;
        if (user != null) {
            j10 = user.f27150id;
        } else if (chat2 != null) {
            j10 = chat2.f27001id;
        } else {
            j10 = 0;
        }
        long j11 = j10;
        if (i3 == 0) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new mp(3, -chat.f27001id, j11, messagesStorage));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = i1(chat);
        if (user != null) {
            l12 = n1(user);
        } else {
            l12 = l1(chat2);
        }
        tL_channels_deleteParticipantHistory.participant = l12;
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new q6(this, chat, user, chat2, 2));
    }

    public final void k2(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        TLRPC.TL_theme tL_theme;
        String str;
        boolean z11;
        boolean z12;
        if (g6Var != null) {
            tL_theme = g6Var.f27540r;
        } else {
            tL_theme = j6Var.G;
        }
        if (g6Var != null) {
            str = g6Var.f27537o;
        } else {
            str = j6Var.f27682e;
        }
        if (g6Var == null && j6Var.h) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g6Var != null) {
            z12 = g6Var.f27539q;
        } else {
            z12 = j6Var.f27691n;
        }
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z10;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27072id = tL_theme.f27140id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new ei.u5(13));
        if (!TextUtils.isEmpty(str)) {
            TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = str;
            installwallpaper.wallpaper = tL_inputWallPaperSlug;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            installwallpaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.blur = z11;
            tL_wallPaperSettings.motion = z12;
            getConnectionsManager().sendRequest(installwallpaper, new ei.u5(13));
        }
    }

    public final void k3(long j10, TLRPC.InputPeer inputPeer, long j11) {
        long j12;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        hp hpVar;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j10);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                hpVar = this;
                j12 = j10;
                hpVar.r2(j12, 0L, null);
            } else {
                hpVar = this;
                j12 = j10;
            }
            getNotificationCenter().k(hs.f23292r, 256);
            getMessagesStorage().F1(j12, true);
            int i3 = 0;
            while (true) {
                mo[] moVarArr = hpVar.N;
                if (i3 < moVarArr.length) {
                    mo moVar = moVarArr[i3];
                    if (moVar != null && (moVar.f24242g & 64) != 0) {
                        T4(null);
                        getNotificationCenter().k(hs.f23298s, new Object[0]);
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
        } else {
            j12 = j10;
        }
        if (!m5.C(j12)) {
            TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
            tL_messages_markDialogUnread.unread = true;
            if (inputPeer == null) {
                inputPeer = j1(j12);
            }
            if (!(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = inputPeer;
                tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
                if (j11 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
                    } catch (Exception e10) {
                        exc = e10;
                    }
                    try {
                        nativeByteBuffer.writeInt32(9);
                        nativeByteBuffer.writeInt64(j12);
                        inputPeer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e11) {
                        exc = e11;
                        nativeByteBuffer2 = nativeByteBuffer;
                        a8.g(exc, true);
                        nativeByteBuffer = nativeByteBuffer2;
                        j11 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new gj(this, j11, 10));
                    }
                    j11 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new gj(this, j11, 10));
            }
        }
    }

    public final void k4(long j10, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i3 == 0) {
                TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.V3;
                int i10 = hs.f23300s1;
                if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                    this.V3 = null;
                    getNotificationCenter().k(i10, new Object[0]);
                } else if (!this.T3.remove(str) && this.U3.contains(str)) {
                    return;
                } else {
                    this.U3.add(str);
                    SharedPreferences.Editor edit = this.f22999e7.edit();
                    edit.putStringSet("pendingSuggestions", this.T3);
                    edit.putStringSet("dismissedSuggestions", this.U3);
                    edit.commit();
                    getNotificationCenter().k(i10, new Object[0]);
                }
            }
            TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
            tL_help_dismissSuggestion.suggestion = str;
            if (i3 == 0) {
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_help_dismissSuggestion.peer = j1(j10);
            }
            getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ei.u5(13));
        }
    }

    public final void k5(mo moVar) {
        TLRPC.EncryptedChat a12;
        TLRPC.Chat M0;
        ArrayList arrayList = this.f23169y;
        if (moVar != null) {
            ArrayList arrayList2 = moVar.f24245k;
            ArrayList arrayList3 = moVar.f24246l;
            arrayList2.clear();
            arrayList3.clear();
            this.C7 = moVar;
            try {
                Collections.sort(arrayList, this.D7);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                boolean z10 = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z10) {
                    long j10 = dialog.f27005id;
                    if (!z10 || (M0 = M0(Long.valueOf(-j10))) == null || M0.collapsed_in_dialogs) {
                        if (m5.C(j10) && (a12 = a1(Integer.valueOf((int) (4294967295L & j10)))) != null) {
                            j10 = a12.user_id;
                        }
                        if (moVar.c(getAccountInstance(), j10, dialog)) {
                            if (y(dialog)) {
                                arrayList3.add(dialog);
                            }
                            arrayList2.add(dialog);
                        }
                    }
                }
            }
            try {
                Collections.sort(arrayList, this.E7);
            } catch (Exception unused) {
            }
        }
    }

    public final void l(ArrayList arrayList, long j10) {
        int i3;
        a0.h hVar = this.L0;
        SparseArray sparseArray = (SparseArray) hVar.f(j10);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, j10);
            this.M0++;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zi) sparseArray.valueAt(i10)).f26902t0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i12 = 0; i12 < size2; i12++) {
            zi ziVar = (zi) arrayList.get(i12);
            if (ziVar.D == 17) {
                TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i3 = poll.close_date) != 0) {
                        if (i3 <= currentTime) {
                            z10 = true;
                        } else {
                            i11 = Math.min(i11, i3 - currentTime);
                        }
                    }
                    int f12 = ziVar.f1();
                    zi ziVar2 = (zi) sparseArray.get(f12);
                    if (ziVar2 != null) {
                        ziVar2.f26902t0 = true;
                    } else {
                        sparseArray.put(f12, ziVar);
                    }
                }
            }
        }
        if (z10) {
            this.N0 = 0L;
        } else if (i11 < 5) {
            this.N0 = Math.min(this.N0, System.currentTimeMillis() - ((5 - i11) * 1000));
        }
    }

    public final void l0(TLRPC.TL_inputPhoto tL_inputPhoto) {
        TLRPC.Photo photo;
        long e10 = getUserConfig().e();
        if (tL_inputPhoto == null) {
            po U0 = U0(e10);
            ArrayList arrayList = U0.f24786b;
            if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
                U0.e(photo.f27025id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.f27135id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User a22 = a2(Long.valueOf(getUserConfig().e()));
            if (a22 == null) {
                a22 = getUserConfig().f();
            }
            if (a22 == null) {
                return;
            }
            if (a22.photo != null) {
                qr messagesStorage = getMessagesStorage();
                messagesStorage.f24934a.c(new mp(4, a22.f27150id, a22.photo.photo_id, messagesStorage));
            }
            getNotificationCenter().k(hs.f23248j0, new Object[0]);
            getNotificationCenter().k(hs.f23292r, Integer.valueOf(C8));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new gj(this, e10, 9));
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.f27134id.add(tL_inputPhoto);
        U0(e10).e(tL_inputPhoto.f27020id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public final void l2(int i3) {
        this.f22982d0.remove(i3);
        getNotificationCenter().k(hs.f23352z5, Integer.valueOf(i3));
    }

    public final void l3(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = (ArrayList) this.S.f(j10);
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                zi ziVar = (zi) arrayList2.get(i3);
                if (ziVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (ziVar.f1() == ((Integer) arrayList.get(i10)).intValue()) {
                            ziVar.Z = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public final void l4(dh.n0 r40, java.lang.String r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.l4(dh.n0, java.lang.String):void");
    }

    public final boolean l5(int i3, long j10, ArrayList arrayList) {
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        boolean z11;
        long j11;
        zi ziVar;
        boolean z12;
        hp hpVar;
        boolean z13;
        TLRPC.TL_dialog tL_dialog;
        int i10;
        boolean z14;
        boolean z15;
        TLRPC.Chat M0;
        lg.t1 t1Var;
        boolean z16;
        zi ziVar2;
        boolean z17;
        TLRPC.ChatFull N0;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Message message;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        if (i3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 == 5) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (i3 == 9) {
            objArr2 = 1;
        } else {
            objArr2 = null;
        }
        boolean C = m5.C(j10);
        if (!z10 && objArr == null && objArr2 == null) {
            if (!k5.w("dialog_bar_replied", j10, this.f22989d7, false)) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    zi ziVar3 = (zi) arrayList.get(i11);
                    if (ziVar3 != null && !ziVar3.f26887p1 && (message = ziVar3.f26868k) != null && message.out && !(message instanceof TLRPC.TL_messageService) && message.peer_id != null && zi.B0(message) == j10) {
                        m3(j10);
                        break;
                    }
                    i11++;
                }
            }
            int i12 = 0;
            boolean z18 = false;
            z12 = false;
            long j12 = 0;
            zi ziVar4 = null;
            while (i12 < arrayList.size()) {
                zi ziVar5 = (zi) arrayList.get(i12);
                if (ziVar4 != null && ((C || ziVar5.f1() <= ziVar4.f1()) && (((!C && (ziVar5.f1() >= 0 || ziVar4.f1() >= 0)) || ziVar5.f1() >= ziVar4.f1()) && ziVar5.f26868k.date <= ziVar4.f26868k.date))) {
                    z16 = z10;
                } else {
                    z16 = z10;
                    long j13 = ziVar5.f26868k.peer_id.channel_id;
                    if (j13 != 0) {
                        j12 = j13;
                    }
                    ziVar4 = ziVar5;
                }
                TLRPC.Message message2 = ziVar5.f26868k;
                if ((message2.action instanceof TLRPC.TL_messageActionGroupCall) && (N0 = N0(message2.peer_id.channel_id)) != null && ((inputGroupCall = N0.call) == null || inputGroupCall.f27018id != ziVar5.f26868k.action.call.f27018id)) {
                    V2(0, ziVar5.f26868k.peer_id.channel_id, true);
                }
                if (!z18 && !ziVar5.O3()) {
                    z18 = true;
                }
                if (ziVar5.O3() && !ziVar5.p4() && !zi.m3(ziVar5.f26868k)) {
                    if (ziVar5.M3()) {
                        if (zi.W2(ziVar5.f26868k.media.document)) {
                            z17 = getMessagesController().R3;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            li mediaDataController = getMediaDataController();
                            TLRPC.Message message3 = ziVar5.f26868k;
                            mediaDataController.c(message3.media.document, message3.date, ziVar5.V1);
                        }
                    } else if (!ziVar5.H2() && (ziVar5.u4() || ziVar5.K2())) {
                        li mediaDataController2 = getMediaDataController();
                        TLRPC.Message message4 = ziVar5.f26868k;
                        ziVar2 = ziVar5;
                        mediaDataController2.d(0, ziVar2, message4.media.document, message4.date, false);
                        if (ziVar2.O3() && ziVar2.r4()) {
                            z12 = true;
                        }
                        i12++;
                        z10 = z16;
                    }
                }
                ziVar2 = ziVar5;
                if (ziVar2.O3()) {
                    z12 = true;
                }
                i12++;
                z10 = z16;
            }
            z11 = z10;
            ziVar = ziVar4;
            j11 = j12;
        } else {
            z11 = z10;
            j11 = 0;
            ziVar = null;
            z12 = false;
        }
        getMediaDataController().X0(arrayList, j10, i3, 0L, null, 0, null);
        final long j14 = j10;
        if (i3 == 5) {
            lg.u1 f10 = lg.u1.f(this.currentAccount);
            ArrayList arrayList2 = f10.f18486c;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                zi ziVar6 = (zi) obj;
                if (ziVar6.p4()) {
                    zi ziVar7 = ziVar;
                    if (f10.c(zi.J1(ziVar6.f26868k)) == null && zi.K1(ziVar6.f26868k) != null && f10.d(zi.K1(ziVar6.f26868k)) == null) {
                        String K1 = zi.K1(ziVar6.f26868k);
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj2 = arrayList2.get(i14);
                                i14++;
                                t1Var = (lg.t1) obj2;
                                if (TextUtils.equals(K1, t1Var.f18474b)) {
                                    break;
                                }
                            } else {
                                t1Var = null;
                                break;
                            }
                        }
                        if (t1Var == null) {
                            t1Var = new lg.t1();
                            t1Var.f18478g = true;
                            t1Var.f18474b = zi.K1(ziVar6.f26868k);
                            t1Var.f18473a = -1;
                            t1Var.f18476e = ziVar6;
                            t1Var.d = ziVar6.f1();
                            arrayList2.add(t1Var);
                        }
                        t1Var.h.add(Integer.valueOf(ziVar6.f1()));
                        g0.h3(new lg.n(f10, 6));
                    }
                    ziVar = ziVar7;
                }
            }
        }
        zi ziVar8 = ziVar;
        if (i3 == 0) {
            int size3 = arrayList.size();
            ArrayList arrayList3 = null;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                zi ziVar9 = (zi) obj3;
                if (ziVar9.f1() > 0 && (ziVar9.f26868k.action instanceof TLRPC.TL_messageActionGramTransfer)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(ziVar9);
                }
            }
            if (arrayList3 != null) {
                getNotificationCenter().k(hs.m0, Long.valueOf(j14), arrayList3);
            }
        }
        getNotificationCenter().k(1, Long.valueOf(j14), arrayList, Boolean.valueOf(z11), Integer.valueOf(i3));
        if (ziVar8 != null && !z11) {
            a0.h hVar = this.R;
            TLRPC.TL_dialog tL_dialog2 = (TLRPC.TL_dialog) hVar.f(j14);
            boolean z19 = ziVar8.f26868k.action instanceof TLRPC.TL_messageActionChatMigrateTo;
            mo[] moVarArr = this.N;
            ArrayList arrayList4 = this.f23169y;
            a0.h hVar2 = this.T;
            a0.h hVar3 = this.S;
            SparseArray sparseArray = this.V;
            if (z19) {
                if (tL_dialog2 != null) {
                    arrayList4.remove(tL_dialog2);
                    this.F.remove(tL_dialog2);
                    this.G.remove(tL_dialog2);
                    this.I.remove(tL_dialog2);
                    this.H.remove(tL_dialog2);
                    this.J.remove(tL_dialog2);
                    this.M.remove(tL_dialog2);
                    for (int i16 = 0; i16 < moVarArr.length; i16++) {
                        mo moVar = moVarArr[i16];
                        if (moVar != null) {
                            moVar.f24245k.remove(tL_dialog2);
                            moVarArr[i16].f24246l.remove(tL_dialog2);
                        }
                    }
                    this.K.remove(tL_dialog2);
                    this.L.remove(tL_dialog2);
                    this.E.remove(tL_dialog2);
                    hVar.l(tL_dialog2.f27005id);
                    this.P.remove(Long.valueOf(tL_dialog2.f27005id));
                    this.Q.remove(Long.valueOf(tL_dialog2.f27005id));
                    int i17 = tL_dialog2.folder_id;
                    SparseIntArray sparseIntArray = this.f22956a2;
                    int i18 = sparseIntArray.get(i17, 0);
                    if (i18 > 0) {
                        sparseIntArray.put(tL_dialog2.folder_id, i18 - 1);
                    }
                    hVar3.l(tL_dialog2.f27005id);
                    ArrayList arrayList5 = (ArrayList) this.f23149w.get(tL_dialog2.folder_id);
                    if (arrayList5 != null) {
                        arrayList5.remove(tL_dialog2);
                    }
                    g4(tL_dialog2);
                    zi ziVar10 = (zi) sparseArray.get(tL_dialog2.top_message);
                    if (ziVar10 != null && ziVar10.f26868k.peer_id.channel_id == 0) {
                        sparseArray.remove(tL_dialog2.top_message);
                    }
                    if (ziVar10 != null) {
                        long j15 = ziVar10.f26868k.random_id;
                        if (j15 != 0) {
                            hVar2.l(j15);
                        }
                    }
                    z15 = false;
                    tL_dialog2.top_message = 0;
                    getNotificationsController().N(tL_dialog2.f27005id);
                    getNotificationCenter().k(hs.P0, new Object[0]);
                } else {
                    z15 = false;
                }
                if (m5.z(j14)) {
                    r3 g12 = g1(-j14, z15, null);
                    if (g12 != null && (M0 = M0(Long.valueOf(ziVar8.f26868k.action.channel_id))) != null) {
                        g12.f25050c = M0.f27001id;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null && sharedInstance.getAccount() == g12.C.f21919a && sharedInstance.getChat() != null && sharedInstance.getChat().f27001id == (-g12.f25050c)) {
                            sharedInstance.migrateToChat(M0);
                            return false;
                        }
                    }
                } else {
                    return z15;
                }
            } else {
                x00 x00Var = this.f23120s7;
                if (tL_dialog2 == null) {
                    TLRPC.Chat M02 = M0(Long.valueOf(j11));
                    if ((j11 == 0 || M02 != null) && (M02 == null || (!t3.r0(M02) && !M02.min))) {
                        if (r2.f25040a) {
                            StringBuilder t10 = a1.g.t(j14, "not found dialog with id ", " dictCount = ");
                            t10.append(hVar.m());
                            t10.append(" allCount = ");
                            t10.append(arrayList4.size());
                            a8.b(t10.toString());
                        }
                        TLRPC.TL_dialog tL_dialog3 = new TLRPC.TL_dialog();
                        tL_dialog3.f27005id = j14;
                        int f12 = ziVar8.f1();
                        tL_dialog3.top_message = f12;
                        tL_dialog3.last_message_date = ziVar8.f26868k.date;
                        tL_dialog3.flags = t3.T(M02) ? 1 : 0;
                        LongSparseIntArray longSparseIntArray = this.f22964b0;
                        if (longSparseIntArray.get(j14, 0) > 0) {
                            tL_dialog3.unread_count = longSparseIntArray.get(j14);
                            longSparseIntArray.delete(j14);
                            tL_dialog = tL_dialog3;
                            i10 = f12;
                            r2(j14, 0L, null);
                            for (mo moVar2 : moVarArr) {
                                if (moVar2 != null && (moVar2.f24242g & 64) != 0) {
                                    z14 = true;
                                    break;
                                }
                            }
                        } else {
                            tL_dialog = tL_dialog3;
                            i10 = f12;
                        }
                        z14 = false;
                        hVar.k(tL_dialog, j14);
                        arrayList4.add(tL_dialog);
                        ArrayList arrayList6 = new ArrayList();
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            zi ziVar11 = (zi) arrayList.get(i19);
                            if (ziVar11 != null && (ziVar11.f1() == ziVar8.f1() || (ziVar11.A2() && ziVar8.A2() && ziVar11.e1() == ziVar8.e1()))) {
                                arrayList6.add(ziVar11);
                                if (ziVar11.f26868k.peer_id.channel_id == 0) {
                                    sparseArray.put(ziVar11.f1(), ziVar11);
                                    long j16 = ziVar11.f26868k.random_id;
                                    if (j16 != 0) {
                                        hVar2.k(ziVar11, j16);
                                    }
                                }
                            }
                        }
                        hVar3.k(arrayList6, j14);
                        x00Var.d(j14);
                        if (z14) {
                            T4(null);
                            getNotificationCenter().k(hs.f23298s, new Object[0]);
                        }
                        qr messagesStorage = getMessagesStorage();
                        final TLRPC.TL_dialog tL_dialog4 = tL_dialog;
                        final int i20 = i10;
                        kr krVar = new kr() {
                            @Override
                            public final void a(int i21) {
                                hp hpVar2 = hp.this;
                                if (i21 != -1) {
                                    if (i21 != 0) {
                                        tL_dialog4.folder_id = i21;
                                        hpVar2.T4(null);
                                        hpVar2.getNotificationCenter().k(hs.f23298s, Boolean.TRUE);
                                    }
                                } else if (i20 > 0) {
                                    long j17 = j14;
                                    if (!m5.C(j17)) {
                                        hpVar2.f3(hpVar2.j1(j17), 0L);
                                    }
                                }
                            }
                        };
                        hpVar = this;
                        j14 = j10;
                        messagesStorage.f24934a.c(new wq(messagesStorage, j10, krVar, 1));
                        z13 = true;
                    }
                } else {
                    hpVar = this;
                    if ((tL_dialog2.top_message <= 0 || ziVar8.f1() <= 0 || ziVar8.f1() <= tL_dialog2.top_message) && ((tL_dialog2.top_message >= 0 || ziVar8.f1() >= 0 || ziVar8.f1() >= tL_dialog2.top_message) && hVar3.h(j14) >= 0 && tL_dialog2.top_message >= 0 && tL_dialog2.last_message_date > ziVar8.f26868k.date)) {
                        z13 = false;
                    } else {
                        zi ziVar12 = (zi) sparseArray.get(tL_dialog2.top_message);
                        if (ziVar12 != null && ziVar12.f26868k.peer_id.channel_id == 0) {
                            sparseArray.remove(tL_dialog2.top_message);
                        }
                        if (ziVar12 != null) {
                            long j17 = ziVar12.f26868k.random_id;
                            if (j17 != 0) {
                                hVar2.l(j17);
                            }
                        }
                        tL_dialog2.top_message = ziVar8.f1();
                        tL_dialog2.last_message_date = ziVar8.f26868k.date;
                        z13 = true;
                        ArrayList arrayList7 = new ArrayList(1);
                        for (int i21 = 0; i21 < arrayList.size(); i21++) {
                            zi ziVar13 = (zi) arrayList.get(i21);
                            if (ziVar13 != null && (ziVar13.f1() == ziVar8.f1() || (ziVar13.A2() && ziVar8.A2() && ziVar13.e1() == ziVar8.e1()))) {
                                arrayList7.add(ziVar13);
                            }
                        }
                        hVar3.k(arrayList7, j14);
                        x00Var.d(j14);
                        if (ziVar8.f26868k.peer_id.channel_id == 0) {
                            sparseArray.put(ziVar8.f1(), ziVar8);
                            long j18 = ziVar8.f26868k.random_id;
                            if (j18 != 0) {
                                hVar2.k(ziVar8, j18);
                            }
                        }
                    }
                }
                if (z13) {
                    hpVar.T4(null);
                }
                if (z12) {
                    hpVar.getMediaDataController().w0(j14);
                }
                return z13;
            }
        }
        return false;
    }

    public final void m(final long j10, final TLRPC.User user, int i3, String str, final org.telegram.ui.ActionBar.d2 d2Var, final boolean z10, final Runnable runnable, final so soVar, final u10 u10Var) {
        boolean z11;
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (soVar != null) {
                soVar.a(null);
            }
            if (u10Var != null) {
                u10Var.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat M0 = M0(Long.valueOf(j10));
        final boolean T = t3.T(M0);
        if (T && M0.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        final boolean z12 = z11;
        final TLRPC.InputUser q12 = q1(user);
        if (str != null && (!T || z12)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = q12;
            if (T) {
                tL_messages_startBot.peer = j1(-j10);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j10;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.f21385b.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (T) {
            if (q12 instanceof TLRPC.TL_inputUserSelf) {
                Long valueOf = Long.valueOf(j10);
                ArrayList arrayList = this.f23068n;
                if (arrayList.contains(valueOf)) {
                    if (soVar != null) {
                        soVar.a(null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = h1(j10);
                arrayList.add(Long.valueOf(j10));
                tL_messages_addChatUser = tL_channels_joinChannel;
            } else {
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = h1(j10);
                tL_channels_inviteToChannel.users.add(q12);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j10;
            tL_messages_addChatUser2.fwd_limit = i3;
            tL_messages_addChatUser2.user_id = q12;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z13;
                final hp hpVar = hp.this;
                final boolean z14 = T;
                final TLRPC.InputUser inputUser = q12;
                long j11 = j10;
                if (z14 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    g0.h3(new dk(hpVar, j11, 11));
                }
                u10 u10Var2 = u10Var;
                Runnable runnable2 = runnable;
                TLRPC.User user2 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        g0.h3(new yh(19, u10Var2, runnable2));
                        return;
                    } else if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user2.f27150id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        g0.h3(new zl(hpVar, u10Var2, tL_messages_invitedUsers, j11, 0));
                        return;
                    } else {
                        g0.h3(new jf(u10Var2, 7));
                        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z10) {
                            if (runnable2 != null) {
                                g0.h3(runnable2);
                                return;
                            }
                            return;
                        }
                        final so soVar2 = soVar;
                        final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        final TLObject tLObject2 = tL_messages_addChatUser3;
                        final boolean z15 = z12;
                        if (soVar2 != null) {
                            g0.h3(new dh(hpVar, soVar2, tL_error, d2Var2, tLObject2, z14, z15));
                        }
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z16;
                                hp hpVar2 = hp.this;
                                so soVar3 = soVar2;
                                boolean z17 = z14;
                                if (soVar3 == null) {
                                    int i10 = hpVar2.currentAccount;
                                    if (z17 && !z15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    org.telegram.ui.Components.t4.e0(i10, tL_error, d2Var2, tLObject2, Boolean.valueOf(z16));
                                }
                                if (z17 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                                    hpVar2.getNotificationCenter().k(hs.f23292r, 8192);
                                }
                            }
                        });
                        return;
                    }
                }
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = null;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates;
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    g0.h3(new a4(hpVar, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j11, 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                    updates = tL_messages_invitedUsers2.updates;
                } else if (tLObject instanceof TLRPC.Updates) {
                    updates = (TLRPC.Updates) tLObject;
                } else {
                    a8.d("unexpected " + tLObject + " in addUserToChat");
                    g0.h3(new jf(u10Var2, 8));
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i10);
                        if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                            z13 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z13 = false;
                        break;
                    }
                }
                hpVar.O3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    g0.h3(new bm(hpVar, updates, u10Var2, tL_messages_invitedUsers2, j11, 0));
                    return;
                }
                if (z14) {
                    if (!z13 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        hpVar.B0(j11, true);
                    }
                    g0.i3(new dk(hpVar, j11, 13), 1000L);
                }
                if (z14 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    hpVar.getMessagesStorage().R1(-j11, j11, new ArrayList(), null);
                }
                if (runnable2 != null) {
                    g0.h3(runnable2);
                }
                if (u10Var2 != null) {
                    g0.h3(new jf(u10Var2, 6));
                }
                if (l10.B(user2) && !t3.V(M0) && z13) {
                    g0.h3(new dk(hpVar, j11, 12));
                }
            }
        });
    }

    public final TLRPC.InputPeer m1(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.Chat M0 = M0(Long.valueOf(peer.channel_id));
            if (M0 != null && M0.access_hash == 0) {
                long j10 = M0.fromMessageDialogId;
                if (j10 != 0 && j10 != peer.channel_id && M0.fromMessageId != 0) {
                    TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannelFromMessage.channel_id = peer.channel_id;
                    tL_inputPeerChannelFromMessage.peer = j1(M0.fromMessageDialogId);
                    tL_inputPeerChannelFromMessage.msg_id = M0.fromMessageId;
                    return tL_inputPeerChannelFromMessage;
                }
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = peer.channel_id;
            if (M0 != null) {
                tL_inputPeerChannel.access_hash = M0.access_hash;
            }
            return tL_inputPeerChannel;
        } else {
            TLRPC.User a22 = a2(Long.valueOf(peer.user_id));
            if (a22 != null && a22.access_hash == 0 && a22.fromMessageDialogId != 0 && a22.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = peer.user_id;
                tL_inputPeerUserFromMessage.peer = j1(a22.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = a22.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = peer.user_id;
            if (a22 != null) {
                tL_inputPeerUser.access_hash = a22.access_hash;
            }
            return tL_inputPeerUser;
        }
    }

    public final void m2() {
        this.f23067m8 = null;
        this.f23060l8 = 0L;
    }

    public final void m3(long j10) {
        SharedPreferences.Editor edit = this.f22989d7.edit();
        edit.putBoolean("dialog_bar_replied" + j10, true).apply();
        g0.h3(new dk(this, j10, 9));
    }

    public final void m4(int i3, long j10, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i3;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j10 == 0) {
            ArrayList W0 = W0(i3);
            if (W0.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = W0.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i11);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!dialog.pinned) {
                        if (dialog.f27005id != this.A2) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(dialog.f27005id));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!m5.C(dialog.f27005id)) {
                            TLRPC.InputPeer j12 = j1(dialog.f27005id);
                            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.f27005id));
                            if (t3.Y(M0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().h1(M0.f27001id);
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeerCommunity);
                                objectSize = tL_inputDialogPeerCommunity.getObjectSize();
                            } else {
                                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                tL_inputDialogPeer.peer = j12;
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                                objectSize = tL_inputDialogPeer.getObjectSize();
                            }
                            i10 += objectSize;
                        }
                    }
                }
            }
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new pp(messagesStorage, arrayList2, arrayList3, 0));
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(i10 + 12);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                nativeByteBuffer.writeInt32(16);
                nativeByteBuffer.writeInt32(i3);
                nativeByteBuffer.writeInt32(tL_messages_reorderPinnedDialogs.order.size());
                int size2 = tL_messages_reorderPinnedDialogs.order.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    tL_messages_reorderPinnedDialogs.order.get(i12).serializeToStream(nativeByteBuffer);
                }
            } catch (Exception e11) {
                e = e11;
                nativeByteBuffer2 = nativeByteBuffer;
                a8.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j10 = getMessagesStorage().z(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new gj(this, j10, 0));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new gj(this, j10, 0));
    }

    public final void m5(boolean z10) {
        if (this.Q0.isEmpty()) {
            return;
        }
        if (!z10) {
            if (!((mo) this.Q0.get(0)).e()) {
                int i3 = 1;
                while (true) {
                    if (i3 >= this.Q0.size()) {
                        break;
                    } else if (((mo) this.Q0.get(i3)).e()) {
                        this.Q0.add(0, (mo) this.Q0.remove(i3));
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i3();
        } else {
            for (int i10 = 0; i10 < this.Q0.size(); i10++) {
                ((mo) this.Q0.get(i10)).f24250p = false;
            }
        }
        getMessagesStorage().y1();
        getNotificationCenter().k(hs.O2, new Object[0]);
        P1().f11294x.b();
    }

    public final void n(long j10, TLRPC.User user, String str, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        m(j10, user, 0, str, d2Var, false, runnable, null, null);
    }

    public final void n0(int i3, long j10, SparseArray sparseArray) {
        Utilities.d.c(new kk(this, i3, 1));
        if (sparseArray != null) {
            g0.h3(new a4(this, j10, sparseArray, 15));
        }
    }

    public final void n2(int i3, long j10) {
        if (this.f23106r1.contains(Long.valueOf(j10))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.f23115s1;
        int indexOfKey = longSparseLongArray.indexOfKey(j10);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        W2(a2(Long.valueOf(j10)), i3, true, null);
    }

    public final void n3(long j10, int i3, long j11) {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new qq(messagesStorage, i3, -j10, j11, 0));
        if (j10 != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = h1(j10);
            tL_channels_readMessageContents.f27040id.add(Integer.valueOf(i3));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ei.u5(13));
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.f27106id.add(Integer.valueOf(i3));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new ij(this, 14));
    }

    public final void n4(int i3, long j10, boolean z10) {
        ci.x8 x8Var = new ci.x8(j10, i3);
        HashSet hashSet = this.f23085o8;
        if (hashSet.contains(x8Var)) {
            return;
        }
        hashSet.add(x8Var);
        this.f23094p8.add(new Pair(x8Var, new AtomicBoolean(z10)));
        mj mjVar = this.f23103q8;
        g0.r(mjVar);
        g0.h3(mjVar);
    }

    public final void n5() {
        Iterator it;
        Iterator it2;
        boolean z10;
        String M0;
        String M02;
        String str;
        int i3;
        String M03;
        String M04;
        String M05;
        int i10;
        String M06;
        int i11;
        String a02;
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        Iterator it3 = this.W.entrySet().iterator();
        while (true) {
            int i12 = 1;
            if (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Long l10 = (Long) entry.getKey();
                boolean C = m5.C(l10.longValue());
                Iterator it4 = ((ConcurrentHashMap) entry.getValue()).entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Integer num = (Integer) entry2.getKey();
                    ArrayList arrayList = (ArrayList) entry2.getValue();
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    hVar.k(hVar3, l10.longValue());
                    hVar2.k(hVar4, l10.longValue());
                    if (l10.longValue() > 0 || C || arrayList.size() == i12) {
                        it = it3;
                        it2 = it4;
                        yo yoVar = (yo) arrayList.get(0);
                        TLRPC.User a22 = a2(Long.valueOf(yoVar.f26611b));
                        if (a22 == null) {
                            it3 = it;
                            it4 = it2;
                            i12 = 1;
                        } else {
                            if (l10.longValue() < 0 && !C) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            TLRPC.SendMessageAction sendMessageAction = yoVar.f26612c;
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                                if (z10) {
                                    M06 = bd.a0("IsRecordingAudio", null, 2131749107, c2(a22));
                                } else {
                                    M06 = bd.M0(2131746359, null);
                                }
                                str = M06;
                                i3 = 1;
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                    if (z10) {
                                        M05 = bd.a0("IsRecordingRound", null, 2131749106, c2(a22));
                                    } else {
                                        M05 = bd.M0(2131746358, null);
                                    }
                                    str = M05;
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                    if (z10) {
                                        str = bd.a0("IsSendingVideo", null, 2131749098, c2(a22));
                                    } else {
                                        str = bd.M0(2131745585, null);
                                    }
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                        if (z10) {
                                            M04 = bd.a0("IsSendingAudio", null, 2131749102, c2(a22));
                                        } else {
                                            M04 = bd.M0(2131745592, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                        if (z10) {
                                            M04 = bd.a0("IsSendingVideo", null, 2131749098, c2(a22));
                                        } else {
                                            M04 = bd.M0(2131745585, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                        if (z10) {
                                            M04 = bd.a0("IsRecordingVideo", null, 2131749105, c2(a22));
                                        } else {
                                            M04 = bd.M0(2131746355, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                        if (z10) {
                                            M04 = bd.a0("IsSendingFile", null, 2131749101, c2(a22));
                                        } else {
                                            M04 = bd.M0(2131745591, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                        if (z10) {
                                            M04 = bd.a0("IsSendingPhoto", null, 2131749099, c2(a22));
                                        } else {
                                            M04 = bd.M0(2131745588, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                        if (z10) {
                                            M03 = bd.a0("IsSendingGame", null, 2131749100, c2(a22));
                                        } else {
                                            M03 = bd.M0(2131745590, null);
                                        }
                                        i3 = 3;
                                        str = M03;
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                            if (z10) {
                                                M0 = bd.a0("IsSelectingLocation", null, 2131749103, c2(a22));
                                            } else {
                                                M0 = bd.M0(2131745656, null);
                                            }
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                            if (z10) {
                                                M0 = bd.a0("IsSelectingContact", null, 2131749104, c2(a22));
                                            } else {
                                                M0 = bd.M0(2131745657, null);
                                            }
                                        } else {
                                            if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                                String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                                if (z10) {
                                                    M02 = bd.a0("IsEnjoyngAnimations", null, 2131749108, c2(a22), str2);
                                                } else {
                                                    M02 = bd.a0("EnjoyngAnimations", null, 2131751126, str2);
                                                }
                                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                                if (z10) {
                                                    M02 = bd.a0("IsChoosingSticker", null, 2131749109, c2(a22));
                                                } else {
                                                    M02 = bd.M0(2131752106, null);
                                                }
                                            } else if (z10) {
                                                M0 = bd.a0("IsTypingGroup", null, 2131749096, c2(a22));
                                            } else {
                                                M0 = bd.M0(2131743928, null);
                                            }
                                            str = M02;
                                            i3 = 5;
                                        }
                                        str = M0;
                                        i3 = 0;
                                    }
                                    str = M04;
                                    i3 = 2;
                                }
                                i3 = 4;
                            }
                            i10 = i3;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int size = arrayList.size();
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            if (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                it = it3;
                                it2 = it4;
                                TLRPC.User a23 = a2(Long.valueOf(((yo) obj).f26611b));
                                if (a23 != null) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(c2(a23));
                                    i14++;
                                }
                                i11 = i14;
                                if (i11 == 2) {
                                    break;
                                }
                                i14 = i11;
                                it3 = it;
                                it4 = it2;
                            } else {
                                it = it3;
                                it2 = it4;
                                i11 = i14;
                                break;
                            }
                        }
                        if (sb2.length() != 0) {
                            if (i11 == 1) {
                                a02 = bd.a0("IsTypingGroup", null, 2131749096, sb2.toString());
                            } else if (arrayList.size() > 2) {
                                try {
                                    a02 = String.format(bd.K0(arrayList.size() - 2, "AndMoreTypingGroup"), sb2.toString(), Integer.valueOf(arrayList.size() - 2));
                                } catch (Exception unused) {
                                    a02 = "LOC_ERR: AndMoreTypingGroup";
                                }
                            } else {
                                a02 = bd.a0("AreTypingGroup", null, 2131754121, sb2.toString());
                            }
                            str = a02;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            str = null;
                        }
                    }
                    if (str != null) {
                        Paint paint = org.telegram.ui.ActionBar.k6.G0;
                        if (paint == null) {
                            paint = new Paint();
                            paint.setTypeface(g0.o());
                            paint.setTextSize(g0.L(14.0f));
                        }
                        hVar3.k(i6.m(str, paint.getFontMetricsInt(), false, null, 0), num.intValue());
                        hVar4.k(Integer.valueOf(i10), num.intValue());
                    }
                    it3 = it;
                    it4 = it2;
                    i12 = 1;
                }
            } else {
                this.f22974c0 = hVar.m();
                g0.h3(new kj(this, hVar, hVar2, 1));
                return;
            }
        }
    }

    public final void o(TLRPC.Chat chat, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, int i3, q0.a aVar, q0.a aVar2, hc0 hc0Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j10 = chat2.f27001id;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            m(j10, user, i3, null, d2Var, false, new yh(24, aVar, user), new o(4, aVar2, user), new ak(this, tL_messages_invitedUsers, iArr, size, chat2, hc0Var));
            X3(user, false, false);
            chat2 = chat;
        }
    }

    public final void o0(boolean z10) {
        TLRPC.UserFull b22 = b2(getUserConfig().e());
        if (b22 != null) {
            b22.sponsored_enabled = false;
            getMessagesStorage().j2(b22, false);
            if (z10) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final TLRPC.InputUser o1(long j10) {
        return q1(a2(Long.valueOf(j10)));
    }

    public final boolean o2(TLRPC.Chat chat) {
        TLRPC.Chat M0;
        if (chat == null) {
            return false;
        }
        TLRPC.InputChannel inputChannel = chat.migrated_to;
        if (inputChannel != null && (M0 = M0(Long.valueOf(inputChannel.channel_id))) != null) {
            return M0.noforwards;
        }
        return chat.noforwards;
    }

    public final void o3(long j10, long j11) {
        if (!m5.C(j10) && j10 != getUserConfig().e()) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new qq(messagesStorage, j11, j10, 0, 7));
            TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
            tL_messages_readMentions.peer = j1(j10);
            if (j11 != 0) {
                tL_messages_readMentions.top_msg_id = (int) j11;
                tL_messages_readMentions.flags |= 1;
            }
            getConnectionsManager().sendRequest(tL_messages_readMentions, null);
        }
    }

    public final void o4(long j10, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (user != null || chat != null || encryptedChat != null) {
            SharedPreferences.Editor edit = this.f22989d7.edit();
            edit.putInt("dialog_bar_vis3" + j10, 3);
            edit.commit();
            if (m5.C(j10)) {
                if (encryptedChat != null && encryptedChat.access_hash != 0) {
                    TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.f27009id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new ei.u5(13), 2);
                }
            } else if (z10) {
                TL_account.reportPeer reportpeer = new TL_account.reportPeer();
                if (chat != null) {
                    reportpeer.peer = j1(-chat.f27001id);
                } else if (user != null) {
                    reportpeer.peer = j1(user.f27150id);
                }
                reportpeer.message = "";
                reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
                getConnectionsManager().sendRequest(reportpeer, new ei.u5(13), 2);
            } else {
                TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
                if (chat != null) {
                    tL_messages_reportSpam.peer = j1(-chat.f27001id);
                } else if (user != null) {
                    tL_messages_reportSpam.peer = j1(user.f27150id);
                }
                getConnectionsManager().sendRequest(tL_messages_reportSpam, new ei.u5(13), 2);
            }
        }
    }

    public final boolean o5(ArrayList arrayList, long j10) {
        boolean z10;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        ConcurrentHashMap concurrentHashMap = this.W;
        if (i3 > 0) {
            if (((ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j10))) != null) {
                concurrentHashMap.remove(Long.valueOf(j10));
                return true;
            }
        } else if (i3 < 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                zi ziVar = (zi) obj;
                if (ziVar.q3() && !arrayList2.contains(Long.valueOf(ziVar.f26868k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(ziVar.f26868k.from_id.user_id));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j10));
            if (concurrentHashMap2 != null) {
                ArrayList arrayList3 = null;
                z10 = false;
                for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    int i11 = 0;
                    while (i11 < arrayList4.size()) {
                        if (arrayList2.contains(Long.valueOf(((yo) arrayList4.get(i11)).f26611b))) {
                            arrayList4.remove(i11);
                            i11--;
                            if (arrayList4.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(num);
                            }
                            z10 = true;
                        }
                        i11++;
                    }
                }
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        concurrentHashMap2.remove(arrayList3.get(i12));
                    }
                    if (concurrentHashMap2.isEmpty()) {
                        concurrentHashMap.remove(Long.valueOf(j10));
                    }
                }
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void p(String str, boolean z10) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z10;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new wk(this, 4));
    }

    public final void p0(long j10, int i3, long j11) {
        getMessagesStorage().q1(j10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i3));
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new dr(messagesStorage, arrayList, j11, 1));
    }

    public final TLRPC.InputUser p1(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (inputPeer.access_hash == 0) {
            TLRPC.User a22 = a2(Long.valueOf(inputPeer.user_id));
            if (a22.access_hash == 0 && a22.fromMessageDialogId != 0 && a22.fromMessageId != 0) {
                TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
                tL_inputUserFromMessage.user_id = inputPeer.user_id;
                tL_inputUserFromMessage.peer = j1(a22.fromMessageDialogId);
                tL_inputUserFromMessage.msg_id = a22.fromMessageId;
                return tL_inputUserFromMessage;
            }
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public final boolean p2(long j10) {
        if (j10 < 0) {
            return t3.Y(M0(Long.valueOf(-j10)));
        }
        return false;
    }

    public final void p3(long j10, int i3, long j11) {
        TLRPC.EncryptedChat a12;
        if (j11 != 0 && j10 != 0) {
            if ((i3 > 0 || i3 == Integer.MIN_VALUE) && m5.C(j10) && (a12 = a1(Integer.valueOf((int) (j10 & 4294967295L)))) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j11));
                getSecretChatHelper().u(a12, arrayList, null);
                if (i3 > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    qr messagesStorage = getMessagesStorage();
                    messagesStorage.f24934a.c(new nq(messagesStorage, a12.f27009id, arrayList, 0, currentTime, currentTime));
                }
            }
        }
    }

    public final void p4() {
        this.G3 = false;
        this.I5 = false;
        this.J3 = false;
        this.I3 = false;
        this.O5 = false;
        this.P5 = false;
        this.f23042j7 = true;
        this.Q5 = 1024;
        this.F6 = false;
        this.M6 = 0L;
        this.N6 = 0L;
        this.O6 = "t.me/spambot";
        this.f23137u6 = null;
        this.f23146v6 = "GB";
        this.C4 = new HashSet();
        k5.d(k5.d(this.f22999e7.edit().remove("starsLocked").remove("getfileExperimentalParams").remove("smsjobsStickyNotificationEnabled").remove("channelRevenueWithdrawalEnabled"), "showAnnualPerMonth", "canEditFactcheck", "factcheckLengthLimit", "videoIgnoreAltDocuments"), "freezeSinceDate", "freezeUntilDate", "freezeAppealUrl", "verifyAgeBotUsername").remove("verifyAgeCountry").remove("ignoreRestrictionReasons").apply();
    }

    public final void p5(long j10, String str, long j11) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        M0(Long.valueOf(j10));
        a0.h hVar = (a0.h) this.f23171y1.f(j10);
        if (hVar != null && (channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j11)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull N0 = N0(j10);
        if (N0 != null && N0.participants != null) {
            for (int i3 = 0; i3 < N0.participants.participants.size(); i3++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i3);
                chatParticipant.setRank(j11, str2);
                if (chatParticipant.user_id == j11) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        if (channelParticipant2 != null) {
                            channelParticipant2.rank = str2;
                        }
                    } else {
                        chatParticipant.rank = str2;
                    }
                }
            }
        }
        hs.f(this.currentAccount).k(hs.f23292r, 0);
        hs.f(this.currentAccount).k(hs.W3, Long.valueOf(j10), Long.valueOf(j11), str2);
        qr a02 = qr.a0(this.currentAccount);
        a02.f24934a.c(new gq(a02, -j10, j11, str2, 0));
    }

    public final void q(org.telegram.tgnet.TLRPC.TL_jsonObject r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.q(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    public final TLRPC.InputUser q1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.f27150id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
            tL_inputUserFromMessage.user_id = user.f27150id;
            tL_inputUserFromMessage.peer = j1(user.fromMessageDialogId);
            tL_inputUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputUserFromMessage;
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.f27150id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public final boolean q2(long j10, long j11) {
        return r2(j10, j11, null);
    }

    public final void q3(long r13, int r15, org.telegram.tgnet.TLRPC.InputChannel r16, int r17, long r18, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.q3(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public final void q4(boolean r23, final int r24, final int r25, final int r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.q4(boolean, int, int, int, int):void");
    }

    public final void q5(long r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.q5(long):void");
    }

    public final void r(ArrayList arrayList) {
        SharedPreferences.Editor edit = s1(this.currentAccount).f22989d7.edit();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                ws wsVar = getNotificationsController().f25767h0;
                wsVar.getClass();
                long C1 = zi.C1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(a1.g.p(C1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + C1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wsVar.f26253a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) != 0) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                            edit.putInt("notify2_" + C1, 2);
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        } else {
                            edit.putInt("notify2_" + C1, 3);
                            edit.putInt(a1.g.p(C1, "notifyuntil_"), dialog.notify_settings.mute_until);
                        }
                    } else {
                        edit.putInt("notify2_" + C1, 0);
                    }
                } else {
                    edit.remove("notify2_" + C1);
                }
            }
        }
        edit.apply();
    }

    public final void r0(int i3, boolean[] zArr) {
        ArrayList arrayList;
        if (i3 == 0) {
            return;
        }
        long j10 = 2305843009213693952L | i3;
        a0.h hVar = this.R;
        if (((TLRPC.Dialog) hVar.f(j10)) instanceof TLRPC.TL_dialogFolder) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.f27005id = j10;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.f27052id = i3;
        tL_folder.title = bd.M0(2131754136, null);
        tL_dialogFolder.pinned = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f23169y;
            if (i10 >= arrayList.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (!dialog.pinned) {
                if (dialog.f27005id != this.A2) {
                    break;
                }
            } else {
                i11 = Math.max(dialog.pinnedNum, i11);
            }
            i10++;
        }
        tL_dialogFolder.pinnedNum = i11 + 1;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        tL_messages_dialogs.dialogs.add(tL_dialogFolder);
        getMessagesStorage().d1(tL_messages_dialogs, 1);
        hVar.k(tL_dialogFolder, j10);
        arrayList.add(0, tL_dialogFolder);
    }

    public final boolean r2(long j10, long j11, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb2 = new StringBuilder("notify2_");
        boolean z10 = false;
        sb2.append(us.v(j10, j11, false));
        String sb3 = sb2.toString();
        SharedPreferences sharedPreferences = this.f22989d7;
        int i3 = sharedPreferences.getInt(sb3, -1);
        if (i3 == -1) {
            if (chat != null) {
                if (t3.T(chat) && !chat.megagroup) {
                    z10 = true;
                }
                bool = Boolean.valueOf(z10);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            if (j11 != 0) {
                return r2(j10, 0L, chat);
            }
            return !getNotificationsController().D(j10, bool2, false, false);
        } else if (i3 == 2) {
            return true;
        } else {
            if (i3 == 3) {
                if (sharedPreferences.getInt("notifyuntil_" + us.v(j10, j11, false), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void r3(zi ziVar) {
        if (ziVar.f26887p1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (ziVar.f26868k.mentioned) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new qq(messagesStorage, ziVar.f1(), -ziVar.f26868k.peer_id.channel_id, zi.B0(ziVar.f26868k), 0));
        }
        arrayList.add(Integer.valueOf(ziVar.f1()));
        long B0 = zi.B0(ziVar.f26868k);
        getMessagesStorage().S0(0, 0, B0, arrayList);
        getNotificationCenter().k(hs.C0, Long.valueOf(B0), arrayList);
        if (ziVar.f1() < 0) {
            p3(zi.B0(ziVar.f26868k), Integer.MIN_VALUE, ziVar.f26868k.random_id);
        } else if (ziVar.f26868k.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = h1(ziVar.f26868k.peer_id.channel_id);
            tL_channels_readMessageContents.f27040id.add(Integer.valueOf(ziVar.f1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ei.u5(13));
        } else {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.f27106id.add(Integer.valueOf(ziVar.f1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new ij(this, 5));
        }
    }

    public final void r4(zi ziVar) {
        long j10;
        if (ziVar == null) {
            return;
        }
        qr messagesStorage = getMessagesStorage();
        long B0 = zi.B0(ziVar.f26868k);
        int P0 = ziVar.P0();
        messagesStorage.getClass();
        a0.h hVar = new a0.h(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        hVar.k(arrayList, B0);
        messagesStorage.I(new qf((Object) messagesStorage, (Object) hVar, false, 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = j1(zi.B0(ziVar.f26868k));
        TLRPC.Message message = ziVar.f26868k;
        if (message != null) {
            j10 = message.ephemeralReceiverBotId;
        } else {
            j10 = 0;
        }
        tL_deleteMessage.receiver_id = o1(j10);
        tL_deleteMessage.f27217id = ziVar.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new kh.b(3));
    }

    public final void r5(HashSet hashSet) {
        q5(0L);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            q5(((Long) it.next()).longValue());
        }
    }

    public final boolean s(ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i3 = 0;
        boolean z10 = false;
        while (i3 < size) {
            TL_update.TL_updateFolderPeers tL_updateFolderPeers = (TL_update.TL_updateFolderPeers) arrayList.get(i3);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(m5.o(tL_folderPeer.peer));
                if (dialog != null) {
                    int i11 = dialog.folder_id;
                    int i12 = tL_folderPeer.folder_id;
                    if (i11 != i12) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i12;
                        this.f23052l0 = true;
                        D();
                    }
                }
            }
            getMessagesStorage().G1(((TL_update.TL_updateFolderPeers) arrayList.get(i3)).folder_peers, null, 0L, 0);
            i3++;
            z10 = true;
        }
        return z10;
    }

    public final Runnable s0(long j10, int i3, vo voVar) {
        int i10;
        long j11;
        int i11;
        hp hpVar;
        SharedPreferences sharedPreferences = s1(this.currentAccount).f22989d7;
        if (i3 == 0) {
            i10 = sharedPreferences.getInt("diditem" + j10, 0);
        } else {
            i10 = i3;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        if (m5.z(j10)) {
            j11 = -j10;
        } else {
            j11 = 0;
        }
        if (j11 != 0 && getMessagesController().M0(Long.valueOf(j11)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new hk(this, zArr, messagesStorage, j11, runnableArr, j10, i10, voVar));
            return new jk(zArr, runnableArr, 0);
        }
        if (g0.Q1()) {
            i11 = 30;
        } else {
            i11 = 20;
        }
        int i12 = i11;
        int i13 = i10;
        eo eoVar = new eo(this, generateClassGuid, i12, i13, j10, voVar);
        getNotificationCenter().b(eoVar, hs.H);
        getNotificationCenter().b(eoVar, hs.I);
        if (i13 != 0) {
            hpVar = this;
            hpVar.Z2(j10, 0L, true, i12, i13, 0, true, 0, generateClassGuid, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            hpVar = this;
            hpVar.Z2(j10, 0L, true, i12, i13, 0, true, 0, generateClassGuid, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new kk(hpVar, generateClassGuid, 0);
    }

    public final boolean s2(long j10, long j11) {
        return this.f22989d7.getBoolean("sound_enabled_" + us.v(j10, j11, false), true);
    }

    public final void s3(long j10, long j11) {
        long j12;
        ArrayList l10;
        int i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        c00 c00Var = this.f23102q7;
        if (i3 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j10);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((t2(j10) || z2(j10)) && (l10 = c00Var.l((j12 = -j10))) != null) {
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                c00Var.y(j12, true);
            }
        } else {
            long j13 = -j10;
            TLRPC.TL_forumTopic f10 = c00Var.f(j13, j11);
            if (f10 != null && f10.unread_poll_votes_count > 0) {
                f10.unread_poll_votes_count = 0;
                c00Var.y(j13, true);
            }
        }
        getMessagesStorage().h2(0, j10, j11, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = j1(j10);
        if (i3 != 0 && !y2(j10)) {
            tL_messages_readPollVotes.top_msg_id = (int) j11;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new ei.u5(13));
        hs.f(this.currentAccount).k(hs.f23292r, 1048576);
    }

    public final boolean s4() {
        String str = ((n0) this.f23167x7.f24646a0.f13798b).f24297c;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
                return false;
            } else if (str.equals("premium")) {
                return getUserConfig().q();
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean s5(long j10, dh.n0 n0Var, boolean z10) {
        long j11;
        int i3;
        if (this.f22962a8 == null) {
            return false;
        }
        boolean z11 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                j11 = 0;
            } else {
                j11 = j10;
            }
            if (i10 != 1 || j11 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.f22962a8.f(j11);
                if (tL_messages_savedReactionsTags == null) {
                    if (j11 != 0) {
                        a0.h hVar = this.f22962a8;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        hVar.k(tL_messages_savedReactionsTags, j11);
                    }
                }
                int i11 = 0;
                boolean z12 = false;
                while (i11 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i11);
                    if (n0Var.f(tL_savedReactionTag.reaction)) {
                        int i12 = tL_savedReactionTag.count;
                        if (z10) {
                            i3 = 1;
                        } else {
                            i3 = -1;
                        }
                        int max = Math.max(0, i3 + i12);
                        tL_savedReactionTag.count = max;
                        if (max <= 0) {
                            tL_messages_savedReactionsTags.tags.remove(i11);
                            i11--;
                        } else if (max == i12) {
                            z12 = true;
                        }
                        z11 = true;
                        z12 = true;
                    }
                    i11++;
                }
                if (!z12 && z10) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                    tL_savedReactionTag2.reaction = n0Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void t(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (x7.u.a(tL_updateWebBrowserException.flags, 1)) {
                if (tL_updateWebBrowserException.open_external_browser) {
                    m0(this.f23178y8.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    m0(this.f23178y8.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                m0(this.f23178y8.external_exceptions, tL_updateWebBrowserException.exception);
                m0(this.f23178y8.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            m0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            m0(this.f23178y8.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            m0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            m0(this.f23178y8.external_exceptions, tL_updateWebBrowserException.exception);
        }
        Q4(this.f23178y8);
    }

    public final SharedPreferences t1() {
        return this.f22999e7;
    }

    public final boolean t2(long j10) {
        if (j10 < 0) {
            TLRPC.Chat M0 = M0(Long.valueOf(-j10));
            if (M0 != null && M0.forum) {
                return true;
            }
            return false;
        }
        return l10.u(a2(Long.valueOf(j10)));
    }

    public final void t3(long j10, long j11) {
        long j12;
        ArrayList l10;
        int i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        c00 c00Var = this.f23102q7;
        if (i3 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j10);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((t2(j10) || z2(j10)) && (l10 = c00Var.l((j12 = -j10))) != null) {
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                c00Var.y(j12, true);
            }
        } else {
            long j13 = -j10;
            TLRPC.TL_forumTopic f10 = c00Var.f(j13, j11);
            if (f10 != null && f10.unread_reactions_count > 0) {
                f10.unread_reactions_count = 0;
                c00Var.y(j13, true);
            }
        }
        getMessagesStorage().i2(0, j10, j11, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = j1(j10);
        if (i3 != 0) {
            if (y2(j10)) {
                tL_messages_readReactions.saved_peer_id = j1(j11);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j11;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new ei.u5(13));
        hs.f(this.currentAccount).k(hs.f23292r, 1048576);
    }

    public final void t4(Object obj, TLRPC.Document document) {
        if (obj != null && zi.t3(document, false)) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_messages_saveGif.f27110id = tL_inputDocument;
            tL_inputDocument.f27013id = document.f27007id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_saveGif.unsave = false;
            getConnectionsManager().sendRequest(tL_messages_saveGif, new uh(this, obj, tL_messages_saveGif, 5));
        }
    }

    public final void t5(TLObject tLObject, String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = this.f22991e;
            concurrentHashMap.remove(str);
            if (z10) {
                concurrentHashMap.put(str.toLowerCase(), tLObject);
            }
        }
    }

    public final void u(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        Q4(tL_webBrowserSettings);
    }

    public final int u1() {
        gi.w5 w5Var;
        boolean q10 = getUserConfig().q();
        p0 p0Var = this.f23167x7;
        if (q10) {
            w5Var = p0Var.f24650c0;
        } else {
            w5Var = p0Var.f24648b0;
        }
        return ((j0) w5Var.f13798b).f23620c;
    }

    public final boolean u2(zi ziVar) {
        if (ziVar != null && t2(zi.B0(ziVar.f26868k))) {
            return true;
        }
        return false;
    }

    public final boolean u3(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (tL_chatAdminRights != null) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = null;
            if (chat != null && user != null) {
                if (l10.B(user)) {
                    tL_chatAdminRights2 = chat.admin_rights;
                } else {
                    TLRPC.ChatFull N0 = N0(chat.f27001id);
                    if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                break;
                            }
                            TLRPC.ChatParticipant chatParticipant = arrayList.get(i3);
                            if (chatParticipant != null && chatParticipant.user_id == user.f27150id) {
                                if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                                    tL_chatAdminRights2 = channelParticipant.admin_rights;
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
            if ((!tL_chatAdminRights.change_info || (tL_chatAdminRights2 != null && tL_chatAdminRights2.change_info)) && ((!tL_chatAdminRights.post_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.post_messages)) && ((!tL_chatAdminRights.edit_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.edit_messages)) && ((!tL_chatAdminRights.delete_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.delete_messages)) && ((!tL_chatAdminRights.ban_users || (tL_chatAdminRights2 != null && tL_chatAdminRights2.ban_users)) && ((!tL_chatAdminRights.invite_users || (tL_chatAdminRights2 != null && tL_chatAdminRights2.invite_users)) && ((!tL_chatAdminRights.pin_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.pin_messages)) && ((!tL_chatAdminRights.add_admins || (tL_chatAdminRights2 != null && tL_chatAdminRights2.add_admins)) && ((!tL_chatAdminRights.anonymous || (tL_chatAdminRights2 != null && tL_chatAdminRights2.anonymous)) && ((!tL_chatAdminRights.manage_call || (tL_chatAdminRights2 != null && tL_chatAdminRights2.manage_call)) && ((!tL_chatAdminRights.other || (tL_chatAdminRights2 != null && tL_chatAdminRights2.other)) && (!tL_chatAdminRights.manage_linked_peers || (tL_chatAdminRights2 != null && tL_chatAdminRights2.manage_linked_peers))))))))))))) {
                if (tL_chatAdminRights.manage_topics) {
                    if (tL_chatAdminRights2 != null && tL_chatAdminRights2.manage_topics) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void u4(long j10, TLRPC.PeerSettings peerSettings) {
        boolean z10;
        int i3;
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.f22989d7;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i10 = 2;
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(a1.g.p(j10, "dialog_botid"), peerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j10, peerSettings.business_bot_manage_url);
            String str = "dialog_botflags" + j10;
            boolean z11 = peerSettings.business_bot_paused;
            if (peerSettings.business_bot_can_reply) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            edit.putInt(str, (z11 ? 1 : 0) + i3);
        } else {
            edit.remove("dialog_botid" + j10).remove("dialog_boturl" + j10).remove("dialog_botflags" + j10);
        }
        edit.putLong(a1.g.p(j10, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        int i11 = sharedPreferences.getInt("dialog_bar_vis3" + j10, 0);
        int i12 = hs.Q0;
        if (i11 == 3) {
            edit.apply();
            getNotificationCenter().k(i12, Long.valueOf(j10));
            return;
        }
        if (peerSettings.flags == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (r2.f25040a) {
            StringBuilder t10 = a1.g.t(j10, "peer settings loaded for ", " add = ");
            t10.append(peerSettings.add_contact);
            t10.append(" block = ");
            t10.append(peerSettings.block_contact);
            t10.append(" spam = ");
            t10.append(peerSettings.report_spam);
            t10.append(" share = ");
            t10.append(peerSettings.share_contact);
            t10.append(" geo = ");
            t10.append(peerSettings.report_geo);
            t10.append(" hide = ");
            t10.append(z10);
            t10.append(" distance = ");
            t10.append(peerSettings.geo_distance);
            t10.append(" invite = ");
            t10.append(peerSettings.invite_members);
            a8.b(t10.toString());
        }
        String p10 = a1.g.p(j10, "dialog_bar_vis3");
        if (z10) {
            i10 = 1;
        }
        edit.putInt(p10, i10);
        edit.putBoolean("dialog_bar_share" + j10, peerSettings.share_contact);
        edit.putBoolean("dialog_bar_report" + j10, peerSettings.report_spam);
        edit.putBoolean("dialog_bar_add" + j10, peerSettings.add_contact);
        edit.putBoolean("dialog_bar_block" + j10, peerSettings.block_contact);
        edit.putBoolean("dialog_bar_exception" + j10, peerSettings.need_contacts_exception);
        edit.putBoolean("dialog_bar_location" + j10, peerSettings.report_geo);
        edit.putBoolean("dialog_bar_archived" + j10, peerSettings.autoarchived);
        edit.putBoolean("dialog_bar_invite" + j10, peerSettings.invite_members);
        edit.putString("dialog_bar_chat_with_admin_title" + j10, peerSettings.request_chat_title);
        edit.putBoolean("dialog_bar_chat_with_channel" + j10, peerSettings.request_chat_broadcast);
        edit.putInt("dialog_bar_chat_with_date" + j10, peerSettings.request_chat_date);
        if (sharedPreferences.getInt("dialog_bar_distance" + j10, -1) != -2) {
            if ((peerSettings.flags & 64) != 0) {
                edit.putInt(a1.g.p(j10, "dialog_bar_distance"), peerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j10);
            }
        }
        if (j10 == getUserConfig().e()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        this.f23096q1.k(peerSettings, j10);
        getNotificationCenter().k(i12, Long.valueOf(j10));
    }

    public final void u5(boolean z10, boolean z11) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23178y8;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z10;
            tL_webBrowserSettings.display_close_button = z11;
            Q4(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z10;
        updatewebbrowsersettings.display_close_button = z11;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new c3.b(1), new wk(this, 1));
    }

    public final void v(int i3, int i10, long j10, String str, boolean z10) {
        String str2 = j10 + "_" + i3;
        HashMap hashMap = this.f23121s8;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z10;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().j1(j10);
        tL_messages_toggleSuggestedPostApproval.msg_id = i3;
        if (i10 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i10;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z10 && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j10 + "_" + i3, Boolean.valueOf(!z10));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new yl(this, j10, i3, 0));
    }

    public final void v0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i10);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long o10 = m5.o(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && o10 != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i11);
                        if (o10 == zi.B0(message) && dialog.top_message == message.f27022id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.f27052id;
                            tL_dialog.flags |= 16;
                            tL_messages_peerDialogs.dialogs.add(tL_dialog);
                            TLRPC.Peer peer = dialog.peer;
                            if (peer instanceof TLRPC.TL_peerChannel) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerUser.channel_id = dialog.peer.channel_id;
                                int size3 = tL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i3 >= size3) {
                                        break;
                                    }
                                    TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i3);
                                    if (chat.f27001id == tL_inputPeerUser.channel_id) {
                                        tL_inputPeerUser.access_hash = chat.access_hash;
                                        break;
                                    }
                                    i3++;
                                }
                            } else if (peer instanceof TLRPC.TL_peerChat) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerUser.chat_id = dialog.peer.chat_id;
                            } else {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                                tL_inputPeerUser.user_id = dialog.peer.user_id;
                                int size4 = tL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i3 >= size4) {
                                        break;
                                    }
                                    TLRPC.User user = tL_messages_peerDialogs.users.get(i3);
                                    if (user.f27150id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            f3(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
                tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
            }
        }
    }

    public final TLRPC.Chat v1(long j10) {
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        TLRPC.Chat M03 = M0(Long.valueOf(j10));
        if (M03 != null && (M02 = M0(Long.valueOf(M03.linked_monoforum_id))) != null) {
            return M02;
        }
        Long l10 = (Long) this.f23001f.get(Long.valueOf(j10));
        if (l10 != null && (M0 = M0(l10)) != null) {
            return M0;
        }
        return null;
    }

    public final boolean v2() {
        if (this.M6 != 0 && this.N6 != 0) {
            return true;
        }
        return false;
    }

    public final boolean v4(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList arrayList) {
        char c2;
        StringBuilder sb2 = new StringBuilder();
        sparseIntArray.clear();
        int i3 = 0;
        while (true) {
            String str2 = null;
            int i10 = 1;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) instanceof TLRPC.TL_jsonString) {
                    str2 = ((TLRPC.TL_jsonString) arrayList.get(i3)).value;
                }
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2145993328:
                            if (str2.equals("animated_userpics")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2080028929:
                            if (str2.equals("infinite_reactions")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2022719725:
                            if (str2.equals("stories__caption")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1975141450:
                            if (str2.equals("away_message")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1953490480:
                            if (str2.equals("business_hours")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1952597715:
                            if (str2.equals("business_intro")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1949982086:
                            if (str2.equals("business_links")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1924078036:
                            if (str2.equals("stories__quality")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1919626711:
                            if (str2.equals("stories__save_stories_to_gallery")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1884266413:
                            if (str2.equals("stories")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1833928446:
                            if (str2.equals("effects")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1777612460:
                            if (str2.equals("business_location")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1761847571:
                            if (str2.equals("peer_colors")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1755514268:
                            if (str2.equals("voice_to_text")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1529105743:
                            if (str2.equals("wallpapers")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1516580016:
                            if (str2.equals("message_privacy")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1425144150:
                            if (str2.equals("animated_emoji")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1225497630:
                            if (str2.equals("translations")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1146830912:
                            if (str2.equals("business")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1040323278:
                            if (str2.equals("no_ads")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1023650261:
                            if (str2.equals("more_upload")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -969043445:
                            if (str2.equals("emoji_status")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -730864243:
                            if (str2.equals("profile_badge")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -448825858:
                            if (str2.equals("faster_download")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -294265343:
                            if (str2.equals("greeting_message")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -165039170:
                            if (str2.equals("premium_stickers")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -96210874:
                            if (str2.equals("double_limits")) {
                                c2 = 26;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3565638:
                            if (str2.equals("todo")) {
                                c2 = 27;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 98352451:
                            if (str2.equals("gifts")) {
                                c2 = 28;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 110781770:
                            if (str2.equals("folder_tags")) {
                                c2 = 29;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 234735554:
                            if (str2.equals("stories__expiration_durations")) {
                                c2 = 30;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 388416338:
                            if (str2.equals("stories__stealth_mode")) {
                                c2 = 31;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 480338102:
                            if (str2.equals("quick_replies")) {
                                c2 = ' ';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 622623867:
                            if (str2.equals("ai_compose")) {
                                c2 = '!';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 629542059:
                            if (str2.equals("business_bots")) {
                                c2 = '\"';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 705083174:
                            if (str2.equals("stories__priority_order")) {
                                c2 = '#';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1054743185:
                            if (str2.equals("pm_noforwards")) {
                                c2 = '$';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1080006662:
                            if (str2.equals("stories__links_and_formatting")) {
                                c2 = '%';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1219849581:
                            if (str2.equals("advanced_chat_management")) {
                                c2 = '&';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1438966047:
                            if (str2.equals("stories__permanent_views_history")) {
                                c2 = '\'';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1488814760:
                            if (str2.equals("rich_formatting")) {
                                c2 = '(';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1537309393:
                            if (str2.equals("saved_tags")) {
                                c2 = ')';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1832801148:
                            if (str2.equals("app_icons")) {
                                c2 = '*';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2013274756:
                            if (str2.equals("last_seen")) {
                                c2 = '+';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            i10 = 7;
                            break;
                        case 1:
                            i10 = 4;
                            break;
                        case 2:
                            i10 = 21;
                            break;
                        case 3:
                            i10 = 33;
                            break;
                        case 4:
                            i10 = 30;
                            break;
                        case 5:
                            i10 = 36;
                            break;
                        case 6:
                            i10 = 37;
                            break;
                        case 7:
                            i10 = 25;
                            break;
                        case '\b':
                            i10 = 18;
                            break;
                        case '\t':
                            i10 = 14;
                            break;
                        case '\n':
                            i10 = 38;
                            break;
                        case 11:
                            i10 = 29;
                            break;
                        case '\f':
                            i10 = 23;
                            break;
                        case '\r':
                            i10 = 8;
                            break;
                        case 14:
                            i10 = 22;
                            break;
                        case 15:
                            i10 = 27;
                            break;
                        case 16:
                            i10 = 11;
                            break;
                        case 17:
                            i10 = 13;
                            break;
                        case 18:
                            i10 = 28;
                            break;
                        case 19:
                            i10 = 3;
                            break;
                        case 20:
                            break;
                        case 21:
                            i10 = 12;
                            break;
                        case 22:
                            i10 = 6;
                            break;
                        case 23:
                            i10 = 2;
                            break;
                        case 24:
                            i10 = 32;
                            break;
                        case 25:
                            i10 = 5;
                            break;
                        case 26:
                            i10 = 0;
                            break;
                        case 27:
                            i10 = 39;
                            break;
                        case 28:
                            i10 = 40;
                            break;
                        case 29:
                            i10 = 35;
                            break;
                        case 30:
                            i10 = 17;
                            break;
                        case 31:
                            i10 = 15;
                            break;
                        case ' ':
                            i10 = 31;
                            break;
                        case '!':
                            i10 = 42;
                            break;
                        case '\"':
                            i10 = 34;
                            break;
                        case '#':
                            i10 = 20;
                            break;
                        case '$':
                            i10 = 41;
                            break;
                        case '%':
                            i10 = 19;
                            break;
                        case '&':
                            i10 = 9;
                            break;
                        case '\'':
                            i10 = 16;
                            break;
                        case '(':
                            i10 = 43;
                            break;
                        case ')':
                            i10 = 24;
                            break;
                        case '*':
                            i10 = 10;
                            break;
                        case '+':
                            i10 = 26;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                    if (i10 >= 0) {
                        sparseIntArray.put(i10, i3);
                        if (sb2.length() > 0) {
                            sb2.append('_');
                        }
                        sb2.append(i10);
                        i3++;
                    }
                }
                i3++;
            } else {
                int length = sb2.length();
                SharedPreferences sharedPreferences = this.f22999e7;
                if (length > 0) {
                    String sb3 = sb2.toString();
                    boolean z10 = !sb3.equals(sharedPreferences.getString(str, null));
                    editor.putString(str, sb3);
                    return z10;
                }
                editor.remove(str);
                if (sharedPreferences.getString(str, null) == null) {
                    return false;
                }
                return true;
            }
        }
    }

    public final void w(long j10) {
        TLRPC.Chat M0;
        TLRPC.User user = null;
        if (j10 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j10));
            if (a22 != null) {
                user = a22;
                M0 = null;
            } else {
                return;
            }
        } else {
            M0 = M0(Long.valueOf(-j10));
            if (M0 == null) {
                return;
            }
        }
        LongSparseIntArray longSparseIntArray = this.H0;
        if (longSparseIntArray.indexOfKey(j10) >= 0) {
            return;
        }
        longSparseIntArray.put(j10, 1);
        if (user != null) {
            if (user.bot) {
                getMediaDataController().L1(j10);
            } else {
                getMediaDataController().N1(j10);
            }
        }
        int i3 = this.I0;
        if (i3 >= 0) {
            this.I0 = i3 + 1;
        }
        getNotificationCenter().k(hs.f23231g0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.f27044id = n1(user);
        } else {
            tL_contacts_block.f27044id = l1(M0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new ei.u5(13));
    }

    public final ArrayList w0(ArrayList arrayList) {
        if (!D3()) {
            return arrayList;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLRPC.TL_messages_stickerSet x02 = s1(this.currentAccount).x0((TLRPC.TL_messages_stickerSet) arrayList.get(i3));
            if (x02 == null) {
                arrayList.remove(i3);
                i3--;
            } else {
                arrayList.set(i3, x02);
            }
            i3++;
        }
        return arrayList;
    }

    public final void w1(final long j10, final long j11, final int i3, final boolean z10, final q0.a aVar) {
        String str;
        String str2;
        if (z10) {
            str = "reaction_mentions";
        } else {
            str = "poll_votes_mentions";
        }
        final String str3 = str;
        if (z10) {
            str2 = "reaction_mentions_topics";
        } else {
            str2 = "poll_votes_mentions_topics";
        }
        final String str4 = str2;
        final boolean z11 = !z10;
        getMessagesStorage().f24934a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xl.run():void");
            }
        });
    }

    public final boolean w2(long j10) {
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty() && arrayList.contains(Long.valueOf(j10))) {
            return true;
        }
        return false;
    }

    public final void w3(mo moVar) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (this.N[i3] == moVar) {
                T4(null);
                getNotificationCenter().k(hs.f23298s, Boolean.TRUE);
                return;
            }
        }
    }

    public final void w4(long j10, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().f24934a.c(new a4(this, j10, tL_messages_savedReactionsTags, 19));
    }

    public final ui.f x(long j10) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull N0 = N0(j10);
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        if (N0 != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long o10 = m5.o(communityPeer2.peer);
                TLRPC.Chat M0 = M0(Long.valueOf(-o10));
                TLRPC.User a22 = a2(Long.valueOf(o10));
                if (M0 != null || a22 != null) {
                    arrayList2.add(new lo(M0, S0(o10), a22, communityPeer2));
                }
            }
        }
        ui.f fVar = new ui.f(8);
        ArrayList arrayList3 = (ArrayList) fVar.d;
        ArrayList arrayList4 = (ArrayList) fVar.f56392e;
        ArrayList arrayList5 = (ArrayList) fVar.f56391c;
        ArrayList arrayList6 = (ArrayList) fVar.f56390b;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            i3++;
            lo loVar = (lo) obj;
            int c2 = ji.j0.c(loVar.f24092b, loVar.d, loVar.f24093c, loVar.f24091a);
            if (c2 == 1) {
                arrayList6.add(loVar);
            } else if (c2 == 2) {
                arrayList5.add(loVar);
            } else if (c2 == 4) {
                arrayList4.add(loVar);
            } else if (c2 == 3) {
                arrayList3.add(loVar);
            }
        }
        el elVar = this.F7;
        Collections.sort(arrayList6, elVar);
        Collections.sort(arrayList5, elVar);
        Collections.sort(arrayList3, elVar);
        Collections.sort(arrayList4, elVar);
        return fVar;
    }

    public final TLRPC.TL_messages_stickerSet x0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        Exception e10;
        if (D3() && tL_messages_stickerSet != null) {
            int i3 = 0;
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                try {
                    if (zi.Y3(tL_messages_stickerSet.documents.get(i10))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i3 < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (zi.Y3(tL_messages_stickerSet2.documents.get(i3))) {
                                    tL_messages_stickerSet2.documents.remove(i3);
                                    tL_messages_stickerSet2.packs.remove(i3);
                                    i3--;
                                    if (tL_messages_stickerSet2.documents.isEmpty()) {
                                        return null;
                                    }
                                }
                                i3++;
                            } catch (Exception e11) {
                                e10 = e11;
                                e10.printStackTrace();
                                return tL_messages_stickerSet2;
                            }
                        }
                        return tL_messages_stickerSet2;
                    }
                } catch (Exception e12) {
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    e10 = e12;
                }
            }
            return tL_messages_stickerSet;
        }
        return tL_messages_stickerSet;
    }

    public final boolean x2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (l10.B(user)) {
                return !t3.r0(chat);
            }
            TLRPC.ChatFull N0 = N0(chat.f27001id);
            if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i3);
                    if (chatParticipant != null && chatParticipant.user_id == user.f27150id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void x3(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str, int i3, sf.b bVar, boolean z10, boolean z11) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (bVar != null) {
            bVar.f54708b = new bk(1, zArr);
            bVar.d();
        }
        ml mlVar = new ml(this, d2Var, bVar, zArr, user, str, z10, z11, r9);
        li mediaDataController = getMediaDataController();
        long j10 = user.f27150id;
        HashMap hashMap = mediaDataController.f24059w1;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hashMap.get(j10 + "_" + j10);
        TL_bots.BotInfo[] botInfoArr = {botInfo};
        if (user.bot_has_main_app) {
            mlVar.run();
        } else if (botInfo == null) {
            li mediaDataController2 = getMediaDataController();
            long j11 = user.f27150id;
            mediaDataController2.G0(j11, j11, false, i3, new ak(this, zArr, botInfoArr, user, i3, mlVar));
        } else {
            mlVar.run();
        }
    }

    public final void x4(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        TLRPC.TL_theme tL_theme;
        if (g6Var != null) {
            tL_theme = g6Var.f27540r;
        } else {
            tL_theme = j6Var.G;
        }
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27072id = tL_theme.f27140id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z11;
            getConnectionsManager().sendRequest(savetheme, new ei.u5(13));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z11) {
            k2(j6Var, g6Var, z10);
        }
    }

    public final boolean y(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!m5.C(dialog.f27005id)) {
                if (m5.y(dialog)) {
                    TLRPC.Chat M0 = M0(Long.valueOf(-dialog.f27005id));
                    if (!t3.X(this.currentAccount, M0)) {
                        if (M0 != null && M0.megagroup) {
                            if (M0.gigagroup && !t3.N(M0)) {
                                return false;
                            }
                            return true;
                        } else if (!t3.N(M0) || !t3.w(5, M0)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                long j10 = dialog.f27005id;
                if (j10 > 0) {
                    if (t3.u0(this.currentAccount, a2(Long.valueOf(j10)))) {
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

    public final Long y1() {
        if (this.f23058l6 == null && !this.f23076n8) {
            this.f23076n8 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.f23058l6;
    }

    public final boolean y2(long j10) {
        TLRPC.Chat M0 = M0(Long.valueOf(-j10));
        if (M0 != null && M0.monoforum) {
            return true;
        }
        return false;
    }

    public final void y3(java.lang.String r11, org.telegram.ui.ActionBar.d2 r12, int r13, sf.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.y3(java.lang.String, org.telegram.ui.ActionBar.d2, int, sf.b):void");
    }

    public final void y4(org.telegram.ui.ActionBar.j6 r20, org.telegram.ui.ActionBar.g6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.y4(org.telegram.ui.ActionBar.j6, org.telegram.ui.ActionBar.g6):void");
    }

    public final void z(long j10, int i3, long j11) {
        a0.h hVar;
        a0.h hVar2;
        if (i3 >= 0) {
            a0.h[] hVarArr = this.Z;
            if (i3 < hVarArr.length && (hVar = hVarArr[i3]) != null && (hVar2 = (a0.h) hVar.f(j10)) != null) {
                hVar2.l(j11);
                if (hVar2.m() == 0) {
                    hVar.l(j10);
                }
            }
        }
    }

    public final TLRPC.Peer z1(long j10) {
        if (j10 < 0) {
            long j11 = -j10;
            if (t3.T(M0(Long.valueOf(j11)))) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_peerChannel.channel_id = j11;
                return tL_peerChannel;
            }
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_peerChat.chat_id = j11;
            return tL_peerChat;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_peerUser.user_id = j10;
        return tL_peerUser;
    }

    public final boolean z2(long j10) {
        TLRPC.Chat M0 = M0(Long.valueOf(-j10));
        if (t3.p0(M0) && t3.A(this.currentAccount, M0, 24)) {
            return true;
        }
        return false;
    }

    public final void z3(org.telegram.tgnet.TLRPC.User r9, org.telegram.tgnet.TLRPC.Chat r10, org.telegram.ui.ActionBar.d2 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.z3(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.d2, int):void");
    }

    public final void z4(java.io.File r9, org.telegram.ui.ActionBar.b6 r10, boolean r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hp.z4(java.io.File, org.telegram.ui.ActionBar.b6, boolean, long):void");
    }
}
