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
import org.telegram.ui.mc0;
import org.telegram.ui.p80;
public final class np extends c1 implements gs {
    public static volatile long G8;
    public static volatile long H8;
    public static final int I8 = (2 | 4) | 1050105;
    public static final int J8 = (1 | 2) | 28;
    public static volatile np[] K8 = new np[4];
    public static final Object[] L8 = new Object[4];
    public final LongSparseIntArray A0;
    public final a0.h A1;
    public TLRPC.Dialog A2;
    public int A3;
    public int A4;
    public int A5;
    public int A6;
    public final p0 A7;
    public boolean A8;
    public final a0.h B0;
    public final LongSparseIntArray B1;
    public boolean B2;
    public boolean B3;
    public int B4;
    public int B5;
    public int B6;
    public boolean B7;
    public ArrayList B8;
    public final LongSparseIntArray C0;
    public final SparseIntArray C1;
    public long C2;
    public boolean C3;
    public int C4;
    public int C5;
    public int C6;
    public int C7;
    public TLRPC.EmojiGameInfo C8;
    public final a0.h D0;
    public final a0.h D1;
    public int D2;
    public String D3;
    public int D4;
    public int D5;
    public int D6;
    public boolean D7;
    public final sj D8;
    public final ArrayList E;
    public final a0.h E0;
    public final a0.h E1;
    public String E2;
    public boolean E3;
    public Set E4;
    public int E5;
    public String E6;
    public final SparseArray E7;
    public TL_account.TL_webBrowserSettings E8;
    public final ArrayList F;
    public final a0.h F0;
    public final a0.h F1;
    public String F2;
    public boolean F3;
    public Set F4;
    public float F5;
    public String F6;
    public final HashSet F7;
    public final no F8;
    public final ArrayList G;
    public boolean G0;
    public final HashMap G1;
    public String G2;
    public float G3;
    public int G4;
    public float G5;
    public int G6;
    public final HashMap G7;
    public final ArrayList H;
    public final LongSparseIntArray H0;
    public final a0.h H1;
    public boolean H2;
    public boolean H3;
    public int H4;
    public int H5;
    public int H6;
    public final ArrayList H7;
    public final ArrayList I;
    public int I0;
    public final HashMap I1;
    public int I2;
    public boolean I3;
    public int I4;
    public int I5;
    public boolean I6;
    public so I7;
    public final ArrayList J;
    public boolean J0;
    public final a0.h J1;
    public int J2;
    public volatile boolean J3;
    public int J4;
    public int J5;
    public boolean J6;
    public final jl J7;
    public final ArrayList K;
    public final a0.h K0;
    public final HashMap K1;
    public final j2 K2;
    public boolean K3;
    public int K4;
    public int K5;
    public String K6;
    public final jl K7;
    public final ArrayList L;
    public final a0.h L0;
    public final a0.h L1;
    public final sj L2;
    public boolean L3;
    public int L4;
    public boolean L5;
    public long L6;
    public final jl L7;
    public final ArrayList M;
    public int M0;
    public final a0.h M1;
    public long M2;
    public boolean M3;
    public int M4;
    public boolean M5;
    public int M6;
    public final el M7;
    public final so[] N;
    public long N0;
    public final a0.h N1;
    public int N2;
    public String N3;
    public int N4;
    public int N5;
    public int N6;
    public y10 N7;
    public int O;
    public final SparseIntArray O0;
    public final a0.h O1;
    public int O2;
    public String O3;
    public int O4;
    public String O5;
    public boolean O6;
    public final sj O7;
    public final ConcurrentHashMap P;
    public final SparseIntArray P0;
    public final a0.h P1;
    public boolean P2;
    public String P3;
    public int P4;
    public boolean P5;
    public long P6;
    public final sj P7;
    public final ConcurrentHashMap Q;
    public ArrayList Q0;
    public final a0.h Q1;
    public String Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public long Q6;
    public final a0.h Q7;
    public final a0.h R;
    public ArrayList R0;
    public final a0.h R1;
    public final a0.h R2;
    public String R3;
    public int R4;
    public boolean R5;
    public String R6;
    public final a0.h R7;
    public final a0.h S;
    public final ArrayList S0;
    public final ArrayList S1;
    public final HashMap S2;
    public boolean S3;
    public int S4;
    public boolean S5;
    public int S6;
    public long S7;
    public final a0.h T;
    public final SparseArray T0;
    public final a0.h T1;
    public String T2;
    public boolean T3;
    public int T4;
    public int T5;
    public boolean T6;
    public final int T7;
    public final LongSparseIntArray U;
    public boolean U0;
    public final ArrayList U1;
    public org.telegram.ui.ActionBar.d6 U2;
    public String U3;
    public int U4;
    public long U5;
    public int U6;
    public final int U7;
    public final SparseArray V;
    public boolean V0;
    public final HashMap V1;
    public n10 V2;
    public Set V3;
    public int V4;
    public long V5;
    public int V6;
    public final int V7;
    public final ConcurrentHashMap W;
    public final ArrayList W0;
    public boolean W1;
    public final ko W2;
    public Set W3;
    public int W4;
    public int W5;
    public int W6;
    public ArrayList W7;
    public a0.h X;
    public final a0.h X0;
    public int X1;
    public String X2;
    public TLRPC.TL_pendingSuggestion X3;
    public int X4;
    public String X5;
    public String X6;
    public final LongSparseIntArray X7;
    public a0.h Y;
    public final LongSparseLongArray Y0;
    public a0.h Y1;
    public int Y2;
    public Set Y3;
    public int Y4;
    public String Y5;
    public String Y6;
    public final LongSparseIntArray Y7;
    public final a0.h[] Z;
    public final LongSparseIntArray Z0;
    public a0.h Z1;
    public final int Z2;
    public Set Z3;
    public int Z4;
    public boolean Z5;
    public HashSet Z6;
    public final LongSparseIntArray Z7;
    public int f25756a;
    public final ConcurrentHashMap f25757a0;
    public final a0.h f25758a1;
    public sj f25759a2;
    public int f25760a3;
    public Set f25761a4;
    public int f25762a5;
    public boolean f25763a6;
    public int[] f25764a7;
    public final a0.h f25765a8;
    public final ConcurrentHashMap f25766b;
    public final LongSparseIntArray f25767b0;
    public final a0.h f25768b1;
    public boolean f25769b2;
    public int f25770b3;
    public boolean f25771b4;
    public int f25772b5;
    public boolean f25773b6;
    public int f25774b7;
    public final HashSet f25775b8;
    public final ConcurrentHashMap f25776c;
    public int f25777c0;
    public final a0.h f25778c1;
    public final SparseIntArray f25779c2;
    public int f25780c3;
    public int f25781c4;
    public int f25782c5;
    public long f25783c6;
    public long f25784c7;
    public boolean f25785c8;
    public final ConcurrentHashMap d;
    public final SparseArray f25786d0;
    public final a0.h f25787d1;
    public final SparseBooleanArray d2;
    public int f25788d3;
    public boolean f25789d4;
    public int f25790d5;
    public long f25791d6;
    public long f25792d7;
    public TLRPC.TL_exportedContactToken f25793d8;
    public final ConcurrentHashMap f25794e;
    public int f25795e0;
    public final a0.h f25796e1;
    public final SparseBooleanArray f25797e2;
    public int f25798e3;
    public ArrayList f25799e4;
    public int f25800e5;
    public float f25801e6;
    public long[] f25802e7;
    public HashMap f25803e8;
    public final ConcurrentHashMap f25804f;
    public int f25805f0;
    public final ArrayList f25806f1;
    public final SparseBooleanArray f25807f2;
    public boolean f25808f3;
    public HashSet f25809f4;
    public int f25810f5;
    public float f25811f6;
    public int[][] f25812f7;
    public HashSet f25813f8;
    public int f25814g0;
    public final ArrayList f25815g1;
    public boolean f25816g2;
    public int f25817g3;
    public Set f25818g4;
    public int f25819g5;
    public boolean f25820g6;
    public final SharedPreferences f25821g7;
    public a0.h f25822g8;
    public final HashMap h;
    public int f25823h0;
    public final ArrayList f25824h1;
    public boolean f25825h2;
    public final int f25826h3;
    public Set f25827h4;
    public long f25828h5;
    public Set f25829h6;
    public final SharedPreferences h7;
    public boolean f25830h8;
    public fi.p6 f25831i0;
    public long f25832i1;
    public boolean f25833i2;
    public final int f25834i3;
    public String f25835i4;
    public int f25836i5;
    public boolean f25837i6;
    public final SharedPreferences i7;
    public boolean f25838i8;
    public qv f25839j0;
    public long f25840j1;
    public boolean f25841j2;
    public int j3;
    public HashMap f25842j4;
    public int f25843j5;
    public boolean f25844j6;
    public volatile boolean f25845j7;
    public final a0.h f25846j8;
    public h10 f25847k0;
    public long f25848k1;
    public boolean f25849k2;
    public int f25850k3;
    public HashMap f25851k4;
    public int f25852k5;
    public int f25853k6;
    public boolean f25854k7;
    public final HashSet f25855k8;
    public boolean f25856l0;
    public final a0.h l1;
    public boolean f25857l2;
    public int f25858l3;
    public boolean f25859l4;
    public int f25860l5;
    public int f25861l6;
    public int f25862l7;
    public final sj f25863l8;
    public long m0;
    public final a0.h f25864m1;
    public boolean f25865m2;
    public int f25866m3;
    public boolean f25867m4;
    public int f25868m5;
    public int f25869m6;
    public boolean f25870m7;
    public boolean f25871m8;
    public final ArrayList f25872n;
    public h3 f25873n0;
    public final a0.h n1;
    public long f25874n2;
    public final int f25875n3;
    public int f25876n4;
    public int f25877n5;
    public long f25878n6;
    public final ArrayList f25879n7;
    public TLRPC.messages_AvailableEffects f25880n8;
    public long f25881o0;
    public final a0.h f25882o1;
    public boolean f25883o2;
    public final int f25884o3;
    public int o4;
    public int f25885o5;
    public Long f25886o6;
    public org.telegram.ui.z6 f25887o7;
    public final mo f25888o8;
    public long f25889p0;
    public VoIPDebugToSend f25890p1;
    public TLRPC.TL_messages_peerDialogs f25891p2;
    public int f25892p3;
    public boolean f25893p4;
    public int f25894p5;
    public int f25895p6;
    public long f25896p7;
    public boolean f25897p8;
    public long f25898q0;
    public final a0.h f25899q1;
    public TLRPC.messages_Dialogs f25900q2;
    public int f25901q3;
    public int f25902q4;
    public int f25903q5;
    public int f25904q6;
    public long f25905q7;
    public ArrayList f25906q8;
    public final a0.h f25907r;
    public long f25908r0;
    public final HashSet f25909r1;
    public final SparseIntArray f25910r2;
    public int f25911r3;
    public int f25912r4;
    public int f25913r5;
    public boolean f25914r6;
    public sj f25915r7;
    public long f25916r8;
    public final ArrayList f25917s;
    public long f25918s0;
    public final LongSparseLongArray f25919s1;
    public ArrayList f25920s2;
    public int f25921s3;
    public boolean f25922s4;
    public int s5;
    public boolean f25923s6;
    public final ConcurrentHashMap f25924s7;
    public TL_account.contentSettings f25925s8;
    public boolean f25926t0;
    public final ConcurrentHashMap f25927t1;
    public TLRPC.WebPage f25928t2;
    public int f25929t3;
    public dp f25930t4;
    public int f25931t5;
    public int t6;
    public final f00 f25932t7;
    public boolean f25933t8;
    public final a0.h f25934u0;
    public final int f25935u1;
    public int f25936u2;
    public int f25937u3;
    public dp f25938u4;
    public int f25939u5;
    public int f25940u6;
    public final v2 f25941u7;
    public final HashSet f25942u8;
    public final ArrayList f25943v0;
    public final HashSet f25944v1;
    public boolean f25945v2;
    public String f25946v3;
    public int f25947v4;
    public int f25948v5;
    public String f25949v6;
    public final a10 f25950v7;
    public final HashSet f25951v8;
    public final SparseArray f25952w;
    public final ArrayList f25953w0;
    public final HashSet f25954w1;
    public int f25955w2;
    public int f25956w3;
    public int f25957w4;
    public int f25958w5;
    public String f25959w6;
    public e f25960w7;
    public final sj f25961w8;
    public final a0.h f25962x;
    public final ArrayList f25963x0;
    public final HashSet f25964x1;
    public boolean f25965x2;
    public int f25966x3;
    public int f25967x4;
    public int f25968x5;
    public String f25969x6;
    public boolean f25970x7;
    public final LongSparseArray f25971x8;
    public final ArrayList f25972y;
    public final ArrayList f25973y0;
    public final HashSet f25974y1;
    public int f25975y2;
    public int f25976y3;
    public int f25977y4;
    public int f25978y5;
    public String f25979y6;
    public boolean f25980y7;
    public final HashMap f25981y8;
    public final ArrayList f25982z0;
    public final LongSparseLongArray f25983z1;
    public int f25984z2;
    public int f25985z3;
    public int f25986z4;
    public int f25987z5;
    public int f25988z6;
    public boolean f25989z7;
    public gp f25990z8;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            L8[i7] = new Object();
        }
    }

    public np(int i7) {
        super(i7);
        this.f25766b = new ConcurrentHashMap(100, 1.0f, 2);
        this.f25776c = new ConcurrentHashMap(10, 1.0f, 2);
        this.d = new ConcurrentHashMap(100, 1.0f, 3);
        this.f25794e = new ConcurrentHashMap(100, 1.0f, 2);
        this.f25804f = new ConcurrentHashMap(3, 1.0f, 2);
        this.h = new HashMap();
        this.f25872n = new ArrayList();
        this.f25907r = new a0.h();
        this.f25917s = new ArrayList();
        this.f25952w = new SparseArray();
        this.f25962x = new a0.h();
        this.f25972y = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new so[2];
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
        this.f25757a0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.f25767b0 = new LongSparseIntArray();
        this.f25786d0 = new SparseArray();
        this.f25795e0 = 2;
        this.f25805f0 = 5;
        this.m0 = 777000L;
        this.f25881o0 = 10L;
        this.f25889p0 = 7L;
        this.f25898q0 = 10L;
        this.f25908r0 = 4L;
        this.f25918s0 = 3L;
        this.f25934u0 = new a0.h();
        this.f25943v0 = new ArrayList();
        this.f25953w0 = new ArrayList();
        this.f25963x0 = new ArrayList();
        this.f25973y0 = new ArrayList();
        this.f25982z0 = new ArrayList();
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
        this.f25758a1 = new a0.h();
        this.f25768b1 = new a0.h();
        this.f25778c1 = new a0.h();
        this.f25787d1 = new a0.h();
        this.f25796e1 = new a0.h();
        this.f25806f1 = new ArrayList();
        this.f25815g1 = new ArrayList();
        this.f25824h1 = new ArrayList();
        this.l1 = new a0.h();
        this.f25864m1 = new a0.h();
        this.n1 = new a0.h();
        this.f25882o1 = new a0.h();
        this.f25899q1 = new a0.h();
        this.f25909r1 = new HashSet();
        this.f25919s1 = new LongSparseLongArray();
        this.f25927t1 = new ConcurrentHashMap();
        this.f25935u1 = ConnectionsManager.generateClassGuid();
        this.f25944v1 = new HashSet();
        this.f25954w1 = new HashSet();
        this.f25964x1 = new HashSet();
        this.f25974y1 = new HashSet();
        this.f25983z1 = new LongSparseLongArray();
        this.A1 = new a0.h();
        this.B1 = new LongSparseIntArray();
        this.C1 = new SparseIntArray();
        this.D1 = new a0.h();
        this.E1 = new a0.h();
        this.F1 = new a0.h();
        this.G1 = new HashMap();
        this.H1 = new a0.h();
        this.I1 = new HashMap();
        this.J1 = new a0.h();
        this.K1 = new HashMap();
        this.L1 = new a0.h();
        this.M1 = new a0.h();
        this.N1 = new a0.h();
        this.O1 = new a0.h();
        this.P1 = new a0.h();
        this.Q1 = new a0.h();
        this.R1 = new a0.h();
        this.S1 = new ArrayList();
        this.T1 = new a0.h();
        this.U1 = new ArrayList();
        this.V1 = new HashMap();
        this.f25779c2 = new SparseIntArray();
        this.d2 = new SparseBooleanArray();
        this.f25797e2 = new SparseBooleanArray();
        this.f25807f2 = new SparseBooleanArray();
        this.f25841j2 = true;
        this.f25910r2 = new SparseIntArray();
        this.f25920s2 = new ArrayList();
        this.K2 = new j2(12);
        this.L2 = new sj(this, 7);
        this.R2 = new a0.h();
        this.S2 = new HashMap();
        this.W2 = new ko(this);
        this.Z2 = 100;
        this.f25799e4 = new ArrayList();
        this.f25842j4 = new HashMap();
        this.f25851k4 = new HashMap();
        new HashMap();
        this.R5 = false;
        this.f25829h6 = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.f25879n7 = arrayList;
        this.f25924s7 = new ConcurrentHashMap();
        p0 p0Var = new p0();
        this.A7 = p0Var;
        this.E7 = new SparseArray();
        this.F7 = new HashSet();
        this.G7 = new HashMap();
        this.H7 = new ArrayList();
        this.J7 = new Comparator(this) {
            public final np f24847b;

            {
                this.f24847b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jl.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.K7 = new Comparator(this) {
            public final np f24847b;

            {
                this.f24847b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jl.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.L7 = new Comparator(this) {
            public final np f24847b;

            {
                this.f24847b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jl.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.M7 = new el(this, 1);
        this.O7 = new sj(this, 5);
        this.P7 = new sj(this, 12);
        this.Q7 = new a0.h();
        this.R7 = new a0.h();
        this.T7 = 1;
        this.U7 = 2;
        this.V7 = 3;
        this.W7 = new ArrayList();
        this.X7 = new LongSparseIntArray();
        this.Y7 = new LongSparseIntArray();
        this.Z7 = new LongSparseIntArray();
        this.f25765a8 = new a0.h();
        this.f25775b8 = new HashSet();
        this.f25846j8 = new a0.h();
        this.f25855k8 = new HashSet();
        this.f25863l8 = new sj(this, 13);
        this.f25888o8 = new mo(this);
        this.f25942u8 = new HashSet();
        this.f25951v8 = new HashSet();
        this.f25961w8 = new sj(this, 14);
        this.f25971x8 = new LongSparseArray();
        this.f25981y8 = new HashMap();
        this.D8 = new sj(this, 1);
        this.F8 = new no(this);
        fc.D();
        getMessagesStorage();
        getLocationController();
        g0.g3(new sj(this, 2));
        k();
        if (this.currentAccount == 0) {
            this.f25821g7 = t0.f26895b.getSharedPreferences("Notifications", 0);
            this.h7 = t0.f26895b.getSharedPreferences("mainconfig", 0);
            this.i7 = t0.f26895b.getSharedPreferences("emoji", 0);
        } else {
            this.f25821g7 = f3.e(new StringBuilder("Notifications"), this.currentAccount, t0.f26895b, 0);
            this.h7 = f3.e(new StringBuilder("mainconfig"), this.currentAccount, t0.f26895b, 0);
            this.i7 = f3.e(new StringBuilder("emoji"), this.currentAccount, t0.f26895b, 0);
        }
        System.currentTimeMillis();
        this.f25859l4 = this.h7.getBoolean("remoteConfigLoaded", false);
        this.f25867m4 = this.h7.getBoolean("fpnvAllowed", false);
        this.J2 = this.h7.getInt("secretWebpage2", 2);
        this.Y2 = this.h7.getInt("maxGroupCount", 200);
        this.f25760a3 = this.h7.getInt("maxMegagroupCount", 10000);
        this.f25834i3 = this.h7.getInt("maxRecentGifsCount", 200);
        this.f25817g3 = this.h7.getInt("maxRecentStickersCount", 30);
        this.f25826h3 = this.h7.getInt("maxFaveStickersCount", 5);
        this.f25770b3 = this.h7.getInt("maxEditTime", 3600);
        this.f25780c3 = this.h7.getInt("ratingDecay", 2419200);
        this.X2 = this.h7.getString("linkPrefix", "t.me");
        m3();
        this.j3 = this.h7.getInt("callReceiveTimeout", 20000);
        this.f25850k3 = this.h7.getInt("callRingTimeout", 90000);
        this.f25858l3 = this.h7.getInt("callConnectTimeout", 30000);
        this.f25866m3 = this.h7.getInt("callPacketTimeout", 10000);
        this.f25911r3 = this.h7.getInt("updateCheckDelay", 86400);
        this.f25875n3 = this.h7.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.f25884o3 = this.h7.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.f25956w3 = this.h7.getInt("maxMessageLength", 4096);
        this.f25966x3 = this.h7.getInt("maxCaptionLength", 1024);
        this.f25892p3 = this.h7.getInt("mapProvider", 0);
        this.f25901q3 = this.h7.getInt("availableMapProviders", 3);
        this.f25946v3 = this.h7.getString("pk", null);
        this.U3 = this.h7.getString("installReferer", null);
        this.f25788d3 = this.h7.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.f25798e3 = this.h7.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
        this.f25808f3 = this.h7.getBoolean("canRevokePmInbox", this.f25808f3);
        this.C3 = this.h7.getBoolean("preloadFeaturedStickers", false);
        this.D3 = this.h7.getString("youtubePipType", "disabled");
        this.E3 = this.h7.getBoolean("keepAliveService", false);
        this.F3 = this.h7.getBoolean("backgroundConnection", false);
        this.C2 = this.h7.getLong("proxy_dialog", 0L);
        this.f25955w2 = this.h7.getInt("nextPromoInfoCheckTime", 0);
        this.D2 = this.h7.getInt("promo_dialog_type", 0);
        this.E2 = this.h7.getString("promo_psa_message", null);
        this.F2 = this.h7.getString("promo_psa_type", null);
        this.G2 = this.h7.getString("proxyDialogAddress", null);
        this.N3 = this.h7.getString("gifSearchBot", "gif");
        this.O3 = this.h7.getString("imageSearchBot", "pic");
        this.B3 = this.h7.getBoolean("blockedCountry", false);
        this.R3 = this.h7.getString("suggestedLangCode", "en");
        this.G3 = this.h7.getFloat("animatedEmojisZoom", 0.625f);
        this.S3 = this.h7.getBoolean("qrLoginCamera", true);
        this.T3 = this.h7.getBoolean("saveGifsWithStickers", false);
        this.H3 = this.h7.getBoolean("filtersEnabled", false);
        this.I3 = this.h7.getBoolean("getfileExperimentalParams", false);
        this.J3 = this.h7.getBoolean("android_download_improvement_killswitch", false);
        this.K3 = this.h7.getBoolean("smsjobsStickyNotificationEnabled", false);
        this.M3 = this.h7.getBoolean("showFiltersTooltip", false);
        this.f25771b4 = this.h7.getBoolean("autoarchiveAvailable", false);
        this.f25781c4 = this.h7.getInt("groipCallVideoMaxParticipants", 30);
        this.f25921s3 = this.h7.getInt("chatReadMarkSizeThreshold", 100);
        this.f25929t3 = this.h7.getInt("chatReadMarkExpirePeriod", 604800);
        this.f25876n4 = this.h7.getInt("ringtoneDurationMax", 5);
        this.o4 = this.h7.getInt("ringtoneSizeMax", 102400);
        this.f25937u3 = this.h7.getInt("pmReadDateExpirePeriod", 604800);
        this.f25789d4 = this.h7.getBoolean("suggestStickersApiOnly", false);
        this.f25976y3 = this.h7.getInt("roundVideoSize", 384);
        this.f25985z3 = this.h7.getInt("roundVideoBitrate", 1000);
        this.A3 = this.h7.getInt("roundAudioBitrate", 64);
        this.V3 = this.h7.getStringSet("pendingSuggestions", null);
        this.W3 = this.h7.getStringSet("dismissedSuggestions", null);
        this.G4 = this.h7.getInt("channelsLimitDefault", 500);
        this.H4 = this.h7.getInt("channelsLimitPremium", this.G4 * 2);
        this.I4 = this.h7.getInt("savedGifsLimitDefault", 200);
        this.J4 = this.h7.getInt("savedGifsLimitPremium", 400);
        this.K4 = this.h7.getInt("stickersFavedLimitDefault", 5);
        this.L4 = this.h7.getInt("stickersFavedLimitPremium", 200);
        this.M4 = this.h7.getInt("maxPinnedDialogsCountDefault", 5);
        this.N4 = this.h7.getInt("maxPinnedDialogsCountPremium", 5);
        this.M4 = this.h7.getInt("maxPinnedDialogsCountDefault", 5);
        this.N4 = this.h7.getInt("maxPinnedDialogsCountPremium", 5);
        this.O4 = this.h7.getInt("dialogFiltersLimitDefault", 10);
        this.P4 = this.h7.getInt("dialogFiltersLimitPremium", 20);
        this.Q4 = this.h7.getInt("dialogFiltersChatsLimitDefault", 100);
        this.R4 = this.h7.getInt("dialogFiltersChatsLimitPremium", 200);
        this.S4 = this.h7.getInt("dialogFiltersPinnedLimitDefault", 5);
        this.T4 = this.h7.getInt("dialogFiltersPinnedLimitPremium", 10);
        this.U4 = this.h7.getInt("publicLinksLimitDefault", 10);
        this.V4 = this.h7.getInt("publicLinksLimitPremium", 20);
        this.W4 = this.h7.getInt("captionLengthLimitDefault", 1024);
        this.X4 = this.h7.getInt("captionLengthLimitPremium", 4096);
        this.Y4 = this.h7.getInt("storyCaptionLengthLimit", 200);
        this.Z4 = this.h7.getInt("storyCaptionLengthLimitPremium", 2048);
        this.f25762a5 = this.h7.getInt("aboutLengthLimitDefault", 70);
        this.f25772b5 = this.h7.getInt("aboutLengthLimitPremium", 140);
        this.f25782c5 = this.h7.getInt("reactionsUserMaxDefault", 1);
        this.f25790d5 = this.h7.getInt("reactionsUserMaxPremium", 3);
        this.f25800e5 = this.h7.getInt("reactionsInChatMax", 3);
        this.t6 = this.h7.getInt("uploadMaxFileParts", 4000);
        this.f25940u6 = this.h7.getInt("uploadMaxFilePartsPremium", this.t6 * 2);
        this.f25959w6 = this.h7.getString("premiumInvoiceSlug", null);
        this.f25969x6 = this.h7.getString("verifyAgeBotUsername", null);
        this.f25979y6 = this.h7.getString("verifyAgeCountry", "GB");
        this.f25988z6 = this.h7.getInt("verifyAgeMin", 18);
        this.f25949v6 = this.h7.getString("premiumBotUsername", null);
        this.f25854k7 = this.h7.getBoolean("premiumLocked", false);
        this.f25870m7 = this.h7.getBoolean("starsLocked", true);
        this.f25862l7 = this.h7.getInt("transcribeButtonPressed", 0);
        this.f25810f5 = this.h7.getInt("forumUpgradeParticipantsMin", 200);
        this.f25819g5 = this.h7.getInt("topicsPinnedLimit", 3);
        this.f25828h5 = this.h7.getLong("telegramAntispamUserId", -1L);
        this.f25836i5 = this.h7.getInt("telegramAntispamGroupSizeMin", 100);
        this.f25843j5 = this.h7.getInt("hiddenMembersGroupSizeMin", 100);
        this.f25852k5 = this.h7.getInt("chatlistUpdatePeriod", 3600);
        this.f25970x7 = this.h7.getBoolean("uploadMarkupVideo", true);
        this.f25980y7 = this.h7.getBoolean("giftAttachMenuIcon", false);
        this.f25989z7 = this.h7.getBoolean("giftTextFieldIcon", false);
        this.C7 = this.h7.getInt("checkResetLangpack", 0);
        this.f25805f0 = this.h7.getInt("smallQueueMaxActiveOperations", 5);
        this.f25795e0 = this.h7.getInt("largeQueueMaxActiveOperations", 2);
        this.f25814g0 = this.h7.getInt("stories_stealth_future_period", 1500);
        this.m0 = this.h7.getLong("stories_changelog_user_id", 777000L);
        this.f25881o0 = this.h7.getLong("giveaway_add_peers_max", 10L);
        this.f25898q0 = this.h7.getLong("giveaway_countries_max", 10L);
        this.f25908r0 = this.h7.getLong("giveaway_boosts_per_premium", 4L);
        this.f25918s0 = this.h7.getLong("boosts_per_sent_gift", 3L);
        this.f25889p0 = this.h7.getLong("giveaway_period_max", 7L);
        this.h7.getInt("stories_stealth_past_period", 300);
        this.f25823h0 = this.h7.getInt("stories_stealth_cooldown_period", 3600);
        boolean z10 = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        this.A6 = this.h7.getInt("chatlistInvitesLimitDefault", 3);
        this.f25860l5 = this.h7.getInt("storyExpiringLimitDefault", 50);
        this.f25868m5 = this.h7.getInt("storyExpiringLimitPremium", 100);
        this.f25877n5 = this.h7.getInt("storiesSentWeeklyLimitDefault", 7);
        this.f25913r5 = this.h7.getInt("storiesSuggestedReactionsLimitDefault", 1);
        this.s5 = this.h7.getInt("storiesSuggestedReactionsLimitPremium", 5);
        this.f25885o5 = this.h7.getInt("storiesSentWeeklyLimitPremium", 70);
        this.f25894p5 = this.h7.getInt("storiesSentMonthlyLimitDefault", 30);
        this.f25903q5 = this.h7.getInt("storiesSentMonthlyLimitPremium", 300);
        this.f25931t5 = this.h7.getInt("channelBgIconLevelMin", 1);
        this.f25939u5 = this.h7.getInt("channelProfileIconLevelMin", 1);
        this.f25948v5 = this.h7.getInt("channelEmojiStatusLevelMin", 1);
        this.f25978y5 = this.h7.getInt("groupProfileBgIconLevelMin", 1);
        this.f25987z5 = this.h7.getInt("groupEmojiStatusLevelMin", 1);
        this.A5 = this.h7.getInt("groupEmojiStickersLevelMin", 1);
        this.B5 = this.h7.getInt("groupWallpaperLevelMin", 1);
        this.C5 = this.h7.getInt("groupCustomWallpaperLevelMin", 1);
        this.D5 = this.h7.getInt("groupTranscribeLevelMin", 1);
        this.E5 = this.h7.getInt("quickRepliesLimit", 10);
        this.f25958w5 = this.h7.getInt("channelWallpaperLevelMin", 1);
        this.f25968x5 = this.h7.getInt("channelCustomWallpaperLevelMin", 1);
        this.B6 = this.h7.getInt("chatlistInvitesLimitPremium", z10 ? 5 : 20);
        this.C6 = this.h7.getInt("chatlistJoinedLimitDefault", 2);
        this.D6 = this.h7.getInt("chatlistJoinedLimitPremium", z10 ? 5 : 20);
        this.G6 = this.h7.getInt("stargiftsMessageLengthMax", 255);
        this.H6 = this.h7.getInt("stargiftsConvertPeriodMax", z10 ? 300 : 7776000);
        this.I6 = this.h7.getBoolean("videoIgnoreAltDocuments", false);
        this.J6 = this.h7.getBoolean("disableBotFullscreenBlur", false);
        this.K6 = this.h7.getString("tonBlockchainExplorerUrl", "https://tonviewer.com/");
        this.L6 = this.h7.getLong("starsPaidMessageAmountMax", 10000L);
        this.M6 = this.h7.getInt("starsPaidMessageCommissionPermille", 850);
        this.N6 = this.h7.getInt("stargiftsPinnedToTopLimit", 6);
        this.O6 = this.h7.getBoolean("starsPaidMessagesAvailable", true);
        this.P6 = this.h7.getLong("freezeSinceDate", 0L);
        this.Q6 = this.h7.getLong("freezeUntilDate", 0L);
        this.S6 = this.h7.getInt("conferenceCallSizeLimit", z10 ? 5 : 100);
        this.T6 = this.h7.getBoolean("callRequestsDisabled", false);
        this.U6 = this.h7.getInt("todoItemsMax", z10 ? 10 : 30);
        this.V6 = this.h7.getInt("todoTitleLengthMax", 32);
        this.W6 = this.h7.getInt("todoItemLengthMax", 64);
        this.X6 = this.h7.getString("translationsManualEnabled", "enabled");
        this.Y6 = this.h7.getString("translationsAutoEnabled", "enabled");
        this.Z6 = (HashSet) Collection.EL.stream(this.h7.getStringSet("whitelistedBots", new HashSet())).map(new aa.l(3)).collect(Collectors.toCollection(new kk(0)));
        this.f25774b7 = this.h7.getInt("starsGroupcallMessageAmountMax", 10000);
        this.f25764a7 = fi.t.d(this.h7.getString("starsGroupcallMessageLimits", null));
        this.R6 = this.h7.getString("freezeAppealUrl", "t.me/spambot");
        this.B7 = this.h7.getBoolean("enableGiftsInProfile", true);
        this.E6 = this.h7.getString("storiesPosting", "enabled");
        this.F6 = this.h7.getString("storiesEntities", "premium");
        this.f25893p4 = this.h7.getBoolean("storiesExportNopublicLink", false);
        this.f25902q4 = this.h7.getInt("authorization_autoconfirm_period", 604800);
        this.f25912r4 = this.h7.getInt("quoteLengthMax", 1024);
        this.f25922s4 = this.h7.getBoolean("giveawayGiftsPurchaseAvailable", false);
        this.f25930t4 = dp.b(0, this.h7.getString("peerColors", ""));
        this.f25938u4 = dp.b(1, this.h7.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.h7;
        boolean z11 = s2.f26694a;
        this.f25947v4 = sharedPreferences.getInt("transcribeAudioTrialWeeklyNumber", 0);
        this.f25977y4 = this.h7.getInt("transcribeAudioTrialCurrentNumber", this.f25947v4);
        this.f25957w4 = this.h7.getInt("transcribeAudioTrialDurationMax", 300);
        this.f25967x4 = this.h7.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.f25986z4 = this.h7.getInt("recommendedChannelsLimitDefault", 10);
        this.A4 = this.h7.getInt("recommendedChannelsLimitPremium", 100);
        this.B4 = this.h7.getInt("boostsChannelLevelMax", 100);
        this.C4 = this.h7.getInt("channelRestrictSponsoredLevelMin", 30);
        this.D4 = this.h7.getInt("channelAutotranslationLevelMin", 3);
        this.f25895p6 = this.h7.getInt("savedDialogsPinnedLimitDefault", 4);
        this.f25904q6 = this.h7.getInt("savedDialogsPinnedLimitPremium", 6);
        this.f25923s6 = this.h7.getBoolean("storyQualityFull", true);
        this.f25914r6 = this.h7.getBoolean("savedViewAsChats", false);
        this.D7 = this.h7.getBoolean("folderTags", false);
        this.F5 = this.h7.getFloat("uploadPremiumSpeedupUpload", 10.0f);
        this.G5 = this.h7.getFloat("uploadPremiumSpeedupDownload", 10.0f);
        this.H5 = this.h7.getInt("uploadPremiumSpeedupNotifyPeriod2", 3600);
        this.I5 = this.h7.getInt("introTitleLengthLimit", 32);
        this.J5 = this.h7.getInt("introDescriptionLengthLimit", 72);
        this.K5 = this.h7.getInt("businessChatLinksLimit", 100);
        this.L5 = this.h7.getBoolean("channelRevenueWithdrawalEnabled", false);
        this.M5 = this.h7.getBoolean("newNoncontactPeersRequirePremiumWithoutOwnpremium", false);
        this.N5 = this.h7.getInt("reactionsUniqMax", 11);
        SharedPreferences sharedPreferences2 = this.h7;
        t0.u();
        this.O5 = sharedPreferences2.getString("premiumManageSubscriptionUrl", "https://play.google.com/store/account/subscriptions?sku=telegram_premium&package=org.telegram.messenger");
        this.P5 = this.h7.getBoolean("androidDisableRoundCamera2", true);
        this.Q5 = this.h7.getInt("storiesPinnedToTopCountMax", 3);
        this.R5 = this.h7.getBoolean("showAnnualPerMonth", false);
        this.S5 = this.h7.getBoolean("canEditFactcheck", false);
        this.T5 = this.h7.getInt("factcheckLengthLimit", 1024);
        this.U5 = this.h7.getLong("starsRevenueWithdrawalMin", 1000L);
        this.V5 = this.h7.getLong("starsPaidPostAmountMax", 10000L);
        this.W5 = this.h7.getInt("botPreviewMediasMax", 10);
        this.E4 = this.h7.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.F4 = this.h7.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.X5 = this.h7.getString("tonProxyAddress", "magic.org");
        this.Y5 = this.h7.getString("weatherSearchUsername", "izweatherbot");
        this.Z5 = this.h7.getBoolean("storyWeatherPreload", true);
        this.f25763a6 = this.h7.getBoolean("starsGiftsEnabled", true);
        this.f25773b6 = this.h7.getBoolean("stargiftsBlocked", true);
        this.f25783c6 = this.h7.getLong("starsPaidReactionAmountMax", 10000L);
        this.f25791d6 = this.h7.getLong("starsSubscriptionAmountMax", 2500L);
        this.f25801e6 = this.h7.getFloat("starsUsdSellRate1000", 2000.0f);
        this.f25811f6 = this.h7.getFloat("starsUsdWithdrawRate1000", 1200.0f);
        this.f25820g6 = this.h7.getBoolean("sponsoredLinksInappAllow", false);
        this.f25837i6 = this.h7.getBoolean("starrefProgramAllowed", false);
        this.f25844j6 = this.h7.getBoolean("starrefConnectAllowed", false);
        this.f25829h6 = this.h7.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.f25853k6 = this.h7.getInt("starrefMinCommissionPermille", 1);
        this.f25861l6 = this.h7.getInt("starrefMaxCommissionPermille", 400);
        this.f25869m6 = this.h7.getInt("botVerificationDescriptionLengthLimit", 70);
        this.f25878n6 = this.h7.getLong("paidReactionsAnonymousTime", 0L);
        this.f25784c7 = this.h7.getLong("tonStakeddiceStakeAmountMin", 100000000L);
        this.f25792d7 = this.h7.getLong("tonStakeddiceStakeAmountMax", 50000000000L);
        this.f25802e7 = DesugarArrays.stream(this.h7.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new pk(0)).toArray();
        this.f25812f7 = (int[][]) DesugarArrays.stream(this.h7.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new aa.l(4)).toArray(new vk(0));
        p0Var.c(this.h7);
        System.currentTimeMillis();
        this.f25886o6 = null;
        if (System.currentTimeMillis() - this.f25878n6 < 7200000) {
            if (this.h7.contains("paidReactionsDialogId")) {
                this.f25886o6 = Long.valueOf(this.h7.getLong("paidReactionsDialogId", 0L));
            } else {
                this.f25886o6 = Long.valueOf(this.h7.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        g0.g3(new sj(this, 3));
        s2.h = this.h7.getString("googleAuthClientId", s2.h);
        if (this.h7.contains("dcDomainName2")) {
            this.P3 = this.h7.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.P3 = z10 ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.h7.contains("webFileDatacenterId")) {
            this.Q3 = this.h7.getInt("webFileDatacenterId", 4);
        } else {
            this.Q3 = z10 ? 2 : 4;
        }
        Set<String> stringSet = this.h7.getStringSet("directPaymentsCurrency", null);
        if (stringSet != null) {
            arrayList.clear();
            arrayList.addAll(stringSet);
        }
        SparseIntArray sparseIntArray = this.O0;
        String string = this.h7.getString("premiumFeaturesTypesToPosition", null);
        sparseIntArray.clear();
        if (string != null) {
            String[] split = string.split("_");
            for (int i11 = 0; i11 < split.length; i11++) {
                sparseIntArray.put(Integer.parseInt(split[i11]), i11);
            }
        }
        SparseIntArray sparseIntArray2 = this.P0;
        String string2 = this.h7.getString("businessFeaturesTypesToPosition", null);
        sparseIntArray2.clear();
        if (string2 != null) {
            String[] split2 = string2.split("_");
            for (int i12 = 0; i12 < split2.length; i12++) {
                sparseIntArray2.put(Integer.parseInt(split2[i12]), i12);
            }
        }
        if (this.V3 != null) {
            this.V3 = new HashSet(this.V3);
        } else {
            this.V3 = new HashSet();
        }
        if (this.W3 != null) {
            this.W3 = new HashSet(this.W3);
        } else {
            this.W3 = new HashSet();
        }
        Set<String> stringSet2 = this.h7.getStringSet("exportUri2", null);
        this.Y3 = stringSet2;
        if (stringSet2 != null) {
            this.Y3 = new HashSet(this.Y3);
        } else {
            HashSet hashSet = new HashSet();
            this.Y3 = hashSet;
            hashSet.add("content://(\\d+@)?com\\.whatsapp\\.provider\\.media/export_chat/");
            this.Y3.add("content://(\\d+@)?com\\.whatsapp\\.w4b\\.provider\\.media/export_chat/");
            this.Y3.add("content://jp\\.naver\\.line\\.android\\.line\\.common\\.FileProvider/export-chat/");
            this.Y3.add(".*WhatsApp.*\\.txt$");
            this.Y3.add(".*WhatsApp.*\\.zip$");
        }
        Set<String> stringSet3 = this.h7.getStringSet("exportGroupUri", null);
        this.Z3 = stringSet3;
        if (stringSet3 != null) {
            this.Z3 = new HashSet(this.Z3);
        } else {
            HashSet hashSet2 = new HashSet();
            this.Z3 = hashSet2;
            hashSet2.add("@g.us/");
        }
        Set<String> stringSet4 = this.h7.getStringSet("exportPrivateUri", null);
        this.f25761a4 = stringSet4;
        if (stringSet4 != null) {
            this.f25761a4 = new HashSet(this.f25761a4);
        } else {
            HashSet hashSet3 = new HashSet();
            this.f25761a4 = hashSet3;
            hashSet3.add("@s.whatsapp.net/");
        }
        Set<String> stringSet5 = this.h7.getStringSet("autologinDomains", null);
        this.f25818g4 = stringSet5;
        if (stringSet5 != null) {
            this.f25818g4 = new HashSet(this.f25818g4);
        } else {
            this.f25818g4 = new HashSet();
        }
        Set<String> stringSet6 = this.h7.getStringSet("authDomains", null);
        this.f25827h4 = stringSet6;
        if (stringSet6 != null) {
            this.f25827h4 = new HashSet(this.f25827h4);
        } else {
            this.f25827h4 = new HashSet();
        }
        this.f25835i4 = this.h7.getString("autologinToken", null);
        Set<String> stringSet7 = this.h7.getStringSet("diceEmojies", null);
        if (stringSet7 == null) {
            HashSet hashSet4 = new HashSet();
            this.f25809f4 = hashSet4;
            hashSet4.add("🎲");
            this.f25809f4.add("🎯");
        } else {
            this.f25809f4 = new HashSet(stringSet7);
        }
        String string3 = this.h7.getString("diceSuccess", null);
        if (string3 == null) {
            this.f25842j4.put("🎯", new wo(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string3, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    boolean z12 = true;
                    int readInt32 = serializedData.readInt32(true);
                    int i13 = 0;
                    while (i13 < readInt32) {
                        this.f25842j4.put(serializedData.readString(z12), new wo(serializedData.readInt32(z12), serializedData.readInt32(z12)));
                        i13++;
                        z12 = true;
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e10) {
                a8.f(e10);
            }
        }
        String string4 = this.h7.getString("emojiSounds", null);
        if (string4 != null) {
            try {
                byte[] decode2 = Base64.decode(string4, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    boolean z13 = true;
                    int readInt322 = serializedData2.readInt32(true);
                    int i14 = 0;
                    while (i14 < readInt322) {
                        this.f25851k4.put(serializedData2.readString(z13), new xo(serializedData2.readInt64(z13), serializedData2.readInt64(z13), serializedData2.readByteArray(z13)));
                        i14++;
                        z13 = true;
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e11) {
                a8.f(e11);
            }
        }
        String string5 = this.h7.getString("gifSearchEmojies", null);
        if (string5 == null) {
            this.f25799e4.add("👍");
            this.f25799e4.add("👎");
            this.f25799e4.add("😍");
            this.f25799e4.add("😂");
            this.f25799e4.add("😮");
            this.f25799e4.add("🙄");
            this.f25799e4.add("😥");
            this.f25799e4.add("😡");
            this.f25799e4.add("🥳");
            this.f25799e4.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string5, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    boolean z14 = true;
                    int readInt323 = serializedData3.readInt32(true);
                    while (i10 < readInt323) {
                        this.f25799e4.add(serializedData3.readString(z14));
                        i10++;
                        z14 = true;
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e12) {
                a8.f(e12);
            }
        }
        g0.h3(new sj(this, 5), 2000L);
        g0.h3(new sj(this, 1), 2000L);
        g0.h3(new sj(this, 6), 400L);
        this.f25932t7 = new f00(i7);
        this.f25941u7 = new v2(i7);
        this.f25950v7 = new a10(this);
        Utilities.f22774e.c(new sj(this, 8));
    }

    public static ArrayList A0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                arrayList.add((TLRPC.Update) cls.cast(updates.update));
            }
            if (updates.updates != null) {
                for (int i7 = 0; i7 < updates.updates.size(); i7++) {
                    TLRPC.Update update = updates.updates.get(i7);
                    if (cls.isInstance(update)) {
                        arrayList.add((TLRPC.Update) cls.cast(update));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList B0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                TLRPC.Update update = updates.update;
                updates.update = null;
                arrayList.add((TLRPC.Update) cls.cast(update));
            }
            if (updates.updates != null) {
                int i7 = 0;
                while (i7 < updates.updates.size()) {
                    if (cls.isInstance(updates.updates.get(i7))) {
                        arrayList.add((TLRPC.Update) cls.cast(updates.updates.remove(i7)));
                        i7--;
                    }
                    i7++;
                }
            }
        }
        return arrayList;
    }

    public static int C3(ArrayList arrayList) {
        TLRPC.Message message;
        int i7;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; arrayList != null && i11 < arrayList.size(); i11++) {
            gj gjVar = (gj) arrayList.get(i11);
            if (gjVar != null && (message = gjVar.f24177k) != null && (i7 = message.date) > i10) {
                i10 = i7;
            }
        }
        return i10;
    }

    public static boolean H2(TLRPC.User user) {
        if (user != null && user.premium && !L2(user)) {
            return true;
        }
        return false;
    }

    public static boolean L2(TLRPC.User user) {
        if (user != null) {
            if (!user.support) {
                long j3 = user.f28547id;
                if (j3 == 777000 || j3 == 333000 || j3 == 4240000 || j3 == 4244000 || j3 == 4245000 || j3 == 4246000 || j3 == 410000 || j3 == 420000 || j3 == 431000 || j3 == 431415000 || j3 == 434000 || j3 == 4243000 || j3 == 439000 || j3 == 449000 || j3 == 450000 || j3 == 452000 || j3 == 454000 || j3 == 4254000 || j3 == 455000 || j3 == 460000 || j3 == 470000 || j3 == 479000 || j3 == 796000 || j3 == 482000 || j3 == 490000 || j3 == 496000 || j3 == 497000 || j3 == 498000 || j3 == 4298000) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean Q2(TLRPC.UserFull userFull) {
        if (userFull != null) {
            if (!userFull.noforwards_peer_enabled && !userFull.noforwards_my_enabled) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static long S1(org.telegram.tgnet.TLRPC.Reaction r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.S1(org.telegram.tgnet.TLRPC$Reaction):long");
    }

    public static long X1(TLRPC.Update update) {
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
        if (s2.f26694a) {
            a8.d("trying to get unknown update channel_id for " + update);
            return 0L;
        }
        return 0L;
    }

    public static int Y1(TLRPC.Update update) {
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

    public static int Z1(TLRPC.Update update) {
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

    public static String a(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new vk(1)).collect(Collectors.joining(","));
    }

    public static int a2(TLRPC.Update update) {
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

    public static void d5(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != null && g2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), g2Var.getResourceProvider());
            String N0 = hd.N0(2131751442, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            HashMap hashMap = new HashMap();
            int i7 = org.telegram.ui.ActionBar.m6.L5;
            hashMap.put("info1", Integer.valueOf(g2Var.getThemedColor(i7)));
            hashMap.put("info2", Integer.valueOf(g2Var.getThemedColor(i7)));
            alertDialog$Builder.m(2131624108, 52, g2Var.getThemedColor(i7), hashMap);
            t1Var.X = true;
            alertDialog$Builder.k(hd.N0(2131752029, null), null);
            t1Var.U = str;
            g2Var.showDialog(t1Var);
        }
    }

    public static String e2(TLRPC.User user) {
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

    public static SharedPreferences f1() {
        return u1(0).i7;
    }

    public static SharedPreferences g1() {
        return u1(0).h7;
    }

    public static SharedPreferences h1() {
        return u1(0).f25821g7;
    }

    public static TLRPC.TL_wallPaperSettings i2(org.telegram.ui.ActionBar.d6 d6Var) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = d6Var.f28855i;
        tL_wallPaperSettings.motion = d6Var.f28856j;
        int i7 = d6Var.d;
        if (i7 != 0) {
            tL_wallPaperSettings.background_color = i7 & 16777215;
            int i10 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (d6Var.f28857k * 100.0f);
            tL_wallPaperSettings.flags = i10 | 9;
        } else {
            float f10 = d6Var.f28857k;
            if (f10 > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f10 * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i11 = d6Var.f28852e;
        if (i11 != 0) {
            tL_wallPaperSettings.second_background_color = i11 & 16777215;
            tL_wallPaperSettings.rotation = g0.s1(d6Var.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i12 = d6Var.f28853f;
        if (i12 != 0) {
            tL_wallPaperSettings.third_background_color = i12 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i13 = d6Var.f28854g;
        if (i13 != 0) {
            tL_wallPaperSettings.fourth_background_color = i13 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static boolean j2(String str, ArrayList arrayList) {
        String lowerCase = str.toLowerCase();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String lowerCase2 = ((TL_account.WebDomainException) arrayList.get(i7)).domain.toLowerCase();
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

    public static TLRPC.InputChannel k1(TLRPC.Chat chat) {
        if (v3.T(chat)) {
            if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                tL_inputChannelFromMessage.channel_id = chat.f28398id;
                tL_inputChannelFromMessage.peer = u1(k10.f24932t0).l1(chat.fromMessageDialogId);
                tL_inputChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputChannelFromMessage;
            }
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.f28398id;
            tL_inputChannel.access_hash = chat.access_hash;
            return tL_inputChannel;
        }
        return new TLRPC.TL_inputChannelEmpty();
    }

    public static TLRPC.InputMedia l5(TLRPC.MessageMedia messageMedia) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaDocument.f28459id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.f28410id = document.f28404id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputMediaPhoto.f28461id = tL_inputPhoto;
            TLRPC.Photo photo = messageMedia.photo;
            tL_inputPhoto.f28417id = photo.f28422id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            return tL_inputMediaPhoto;
        } else {
            return null;
        }
    }

    public static void m0(ArrayList arrayList, TL_account.WebDomainException webDomainException) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            if (TL_account.WebDomainException.equalsByDomain((TL_account.WebDomainException) arrayList.get(i7), webDomainException)) {
                arrayList.remove(i7);
                i7--;
                size--;
            }
            i7++;
        }
    }

    public static TLRPC.InputPeer m1(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return p1((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return n1((TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static TLRPC.InputPeer n1(TLRPC.Chat chat) {
        if (v3.T(chat)) {
            if (chat != null && chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = chat.f28398id;
                tL_inputPeerChannelFromMessage.peer = u1(k10.f24932t0).l1(chat.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.f28398id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
        tL_inputPeerChat.chat_id = chat.f28398id;
        return tL_inputPeerChat;
    }

    public static TLRPC.InputPeer p1(TLRPC.User user) {
        if (user != null && user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = user.f28547id;
            tL_inputPeerUserFromMessage.peer = u1(k10.f24932t0).l1(user.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.f28547id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.TL_emojiStatusCollectible r0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.f28627id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.f28404id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.f28404id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public static TLRPC.InputWallPaper t1(org.telegram.ui.ActionBar.d6 d6Var) {
        if (d6Var.f28858l > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.f28470id = d6Var.f28858l;
            tL_inputWallPaper.access_hash = d6Var.f28859m;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = d6Var.f28851c;
        return tL_inputWallPaperSlug;
    }

    public static boolean u0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.f28404id == messageMedia2.document.f28404id) {
                return true;
            }
            return false;
        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.f28422id == messageMedia2.photo.f28422id) {
            return true;
        } else {
            return false;
        }
    }

    public static np u1(int i7) {
        np npVar;
        np npVar2 = K8[i7];
        if (npVar2 == null) {
            synchronized (L8[i7]) {
                try {
                    npVar = K8[i7];
                    if (npVar == null) {
                        np[] npVarArr = K8;
                        np npVar3 = new np(i7);
                        npVarArr[i7] = npVar3;
                        npVar = npVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return npVar;
        }
        return npVar2;
    }

    public static void v0(long j3, TLObject tLObject, ArrayList arrayList) {
        int i7 = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i7 < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
                    if (n5.o(message.from_id) == user.f28547id) {
                        user.fromMessageDialogId = j3;
                        user.fromMessageId = message.f28419id;
                        return;
                    }
                    i7++;
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat.access_hash == 0 && chat.fromMessageDialogId == 0 && arrayList != null) {
                while (i7 < arrayList.size()) {
                    TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i7);
                    if (n5.o(message2.from_id) == (-chat.f28398id)) {
                        chat.fromMessageDialogId = j3;
                        chat.fromMessageId = message2.f28419id;
                        return;
                    }
                    i7++;
                }
            }
        }
    }

    public static SharedPreferences z1(int i7) {
        return u1(i7).f25821g7;
    }

    public final void A() {
        org.telegram.ui.ActionBar.d6 d6Var = this.U2;
        if (d6Var != null) {
            if (d6Var.f28865s != null) {
                for (int i7 = 0; i7 < this.U2.f28865s.size(); i7++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) this.U2.f28865s.get(i7)).intValue(), true);
                }
            }
            w7.G(this.currentAccount).b(this.T2, false);
            long j3 = this.U2.f28860n;
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 != 0) {
                if (i10 >= 0) {
                    TLRPC.UserFull d2 = d2(j3);
                    if (d2 != null) {
                        d2.wallpaper = this.U2.f28866t;
                        ls.f(this.currentAccount).k(ls.E0, Long.valueOf(this.U2.f28860n), d2);
                    }
                } else {
                    TLRPC.ChatFull P0 = P0(-j3);
                    if (P0 != null) {
                        P0.wallpaper = this.U2.f28866t;
                        ls f10 = ls.f(this.currentAccount);
                        Boolean bool = Boolean.FALSE;
                        f10.k(ls.T, P0, 0, bool, bool);
                    }
                }
            }
            this.U2 = null;
            this.T2 = null;
        }
    }

    public final Long A1() {
        if (this.f25886o6 == null && !this.f25933t8) {
            this.f25933t8 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.f25886o6;
    }

    public final boolean A2() {
        if (this.P6 != 0 && this.Q6 != 0) {
            return true;
        }
        return false;
    }

    public final void A3(long j3, long j10) {
        long j11;
        ArrayList l10;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        f00 f00Var = this.f25932t7;
        if (i7 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j3);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((y2(j3) || F2(j3)) && (l10 = f00Var.l((j11 = -j3))) != null) {
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                f00Var.y(j11, true);
            }
        } else {
            long j12 = -j3;
            TLRPC.TL_forumTopic f10 = f00Var.f(j12, j10);
            if (f10 != null && f10.unread_reactions_count > 0) {
                f10.unread_reactions_count = 0;
                f00Var.y(j12, true);
            }
        }
        getMessagesStorage().i2(0, j3, j10, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = l1(j3);
        if (i7 != 0) {
            if (E2(j3)) {
                tL_messages_readReactions.saved_peer_id = l1(j10);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j10;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new fi.k5(13));
        ls.f(this.currentAccount).k(ls.f25335r, 1048576);
    }

    public final void A4(gj gjVar) {
        long j3;
        if (gjVar == null) {
            return;
        }
        ur messagesStorage = getMessagesStorage();
        long B0 = gj.B0(gjVar.f24177k);
        int P0 = gjVar.P0();
        messagesStorage.getClass();
        a0.h hVar = new a0.h(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        hVar.k(arrayList, B0);
        messagesStorage.I(new yf((Object) messagesStorage, (Object) hVar, false, 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = l1(gj.B0(gjVar.f24177k));
        TLRPC.Message message = gjVar.f24177k;
        if (message != null) {
            j3 = message.ephemeralReceiverBotId;
        } else {
            j3 = 0;
        }
        tL_deleteMessage.receiver_id = q1(j3);
        tL_deleteMessage.f28614id = gjVar.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
    }

    public final boolean A5(ArrayList arrayList, long j3) {
        boolean z10;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        ConcurrentHashMap concurrentHashMap = this.W;
        if (i7 > 0) {
            if (((ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j3))) != null) {
                concurrentHashMap.remove(Long.valueOf(j3));
                return true;
            }
        } else if (i7 < 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                gj gjVar = (gj) obj;
                if (gjVar.p3() && !arrayList2.contains(Long.valueOf(gjVar.f24177k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(gjVar.f24177k.from_id.user_id));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j3));
            if (concurrentHashMap2 != null) {
                ArrayList arrayList3 = null;
                z10 = false;
                for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    int i11 = 0;
                    while (i11 < arrayList4.size()) {
                        if (arrayList2.contains(Long.valueOf(((ep) arrayList4.get(i11)).f23712b))) {
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
                        concurrentHashMap.remove(Long.valueOf(j3));
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

    public final void B(long j3, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, org.telegram.ui.lz lzVar) {
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
                int i7 = tL_inputChatUploadedPhoto.flags;
                tL_inputChatUploadedPhoto.video_start_ts = d;
                tL_inputChatUploadedPhoto.flags = i7 | 6;
            }
            if (videoSize != null) {
                tL_inputChatUploadedPhoto.video_emoji_markup = videoSize;
                tL_inputChatUploadedPhoto.flags |= 8;
            }
            inputChatPhoto = tL_inputChatUploadedPhoto;
        }
        if (v3.S(this.currentAccount, j3)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = j1(j3);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j3;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new em(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j3, lzVar), 64);
    }

    public final TLRPC.Peer B1(long j3) {
        if (j3 < 0) {
            long j10 = -j3;
            if (v3.T(O0(Long.valueOf(j10)))) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_peerChannel.channel_id = j10;
                return tL_peerChannel;
            }
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_peerChat.chat_id = j10;
            return tL_peerChat;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_peerUser.user_id = j3;
        return tL_peerUser;
    }

    public final boolean B2(long j3) {
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty() && arrayList.contains(Long.valueOf(j3))) {
            return true;
        }
        return false;
    }

    public final boolean B3(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (tL_chatAdminRights != null) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = null;
            if (chat != null && user != null) {
                if (p10.C(user)) {
                    tL_chatAdminRights2 = chat.admin_rights;
                } else {
                    TLRPC.ChatFull P0 = P0(chat.f28398id);
                    if (P0 != null && (chatParticipants = P0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                break;
                            }
                            TLRPC.ChatParticipant chatParticipant = arrayList.get(i7);
                            if (chatParticipant != null && chatParticipant.user_id == user.f28547id) {
                                if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                                    tL_chatAdminRights2 = channelParticipant.admin_rights;
                                }
                            } else {
                                i7++;
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

    public final boolean B4() {
        String str = ((n0) this.A7.f26185f0.f15495b).f25675c;
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

    public final void B5(long j3, String str, long j10) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        O0(Long.valueOf(j3));
        a0.h hVar = (a0.h) this.A1.f(j3);
        if (hVar != null && (channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j10)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull P0 = P0(j3);
        if (P0 != null && P0.participants != null) {
            for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i7);
                chatParticipant.setRank(j10, str2);
                if (chatParticipant.user_id == j10) {
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
        ls.f(this.currentAccount).k(ls.f25335r, 0);
        ls.f(this.currentAccount).k(ls.Z3, Long.valueOf(j3), Long.valueOf(j10), str2);
        ur a02 = ur.a0(this.currentAccount);
        a02.f27214a.c(new mq(a02, -j3, j10, str2, 0));
    }

    public final void C(long j3, String str, li.i iVar) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (v3.S(this.currentAccount, j3)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = j1(j3);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j3;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new t4(7, this, iVar), 64);
    }

    public final void C0() {
        ur messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i7 = messagesStorage.f27227w;
        ur messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i10 = messagesStorage2.f27225r;
        ur messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        int i11 = messagesStorage3.f27224n;
        ur messagesStorage4 = getMessagesStorage();
        messagesStorage4.H();
        y4(true, i7, i10, i11, messagesStorage4.f27226s);
        ys notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ys.f28133l0.c(new ms(notificationsController, 9));
    }

    public final String C1(long j3) {
        return D1(j3, false);
    }

    public final boolean C2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (p10.C(user)) {
                return !v3.r0(chat);
            }
            TLRPC.ChatFull P0 = P0(chat.f28398id);
            if (P0 != null && (chatParticipants = P0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i7);
                    if (chatParticipant != null && chatParticipant.user_id == user.f28547id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void C4(Object obj, TLRPC.Document document) {
        if (obj != null && gj.s3(document, false)) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_messages_saveGif.f28507id = tL_inputDocument;
            tL_inputDocument.f28410id = document.f28404id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_saveGif.unsave = false;
            getConnectionsManager().sendRequest(tL_messages_saveGif, new di(this, obj, tL_messages_saveGif, 5));
        }
    }

    public final void C5(long r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.C5(long):void");
    }

    public final void D() {
        if (!this.f25856l0 && R1().h.isEmpty()) {
            q4(1);
        } else {
            boolean[] zArr = {false};
            s0(1, zArr);
            if (zArr[0]) {
                f5(null);
                getNotificationCenter().k(ls.f25342s, new Object[0]);
            }
        }
        getNotificationCenter().k(ls.f25335r, 0);
    }

    public final void D0(long j3, boolean z10) {
        TLRPC.Chat O0 = O0(Long.valueOf(j3));
        if (O0 != null && v3.S(this.currentAccount, j3)) {
            if ((!v3.r0(O0) || z10) && !O0.creator && !v3.p0(O0)) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.flags = 256;
                int j10 = getUserConfig().j();
                tL_messageService.f28419id = j10;
                tL_messageService.local_id = j10;
                if ((O0 instanceof TLRPC.TL_channel) && !z10) {
                    tL_messageService.date = O0.date;
                } else {
                    tL_messageService.date = getConnectionsManager().getCurrentTime();
                }
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().e();
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_messageService.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j3;
                tL_messageService.dialog_id = -j3;
                tL_messageService.post = true;
                TLRPC.TL_messageActionChatAddUser tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatAddUser();
                tL_messageService.action = tL_messageActionChatAddUser;
                tL_messageActionChatAddUser.users.add(Long.valueOf(getUserConfig().e()));
                getUserConfig().v(false);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(tL_messageService);
                arrayList.add(new gj(this.currentAccount, tL_messageService, true, false));
                getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                g0.g3(new dk(this, j3, arrayList, 3));
            }
        }
    }

    public final String D1(long j3, boolean z10) {
        String str;
        if (j3 >= 0) {
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (z10) {
                return g0.F2(g0.D2(p10.k(c22, true)));
            }
            return g0.F2(g0.D2(p10.q(c22)));
        }
        TLRPC.Chat O0 = O0(Long.valueOf(-j3));
        if (O0 == null) {
            str = "";
        } else {
            str = O0.title;
        }
        return g0.F2(g0.D2(str));
    }

    public final boolean D2(TLRPC.Dialog dialog, long j3) {
        long j10;
        HashMap hashMap = this.G7;
        if (!hashMap.isEmpty()) {
            if (!hashMap.containsKey(Long.valueOf(dialog.f28402id)) && !hashMap.containsKey(Long.valueOf(j3))) {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    for (Long l10 : hashMap.keySet()) {
                        if (l10.longValue() > 0) {
                            TLRPC.User c22 = c2(l10);
                            if (c22 != null) {
                                j10 = c22.linked_community_id;
                            }
                            j10 = 0;
                        } else {
                            TLRPC.Chat O0 = O0(Long.valueOf(-l10.longValue()));
                            if (O0 != null) {
                                j10 = O0.linked_community_id;
                            }
                            j10 = 0;
                        }
                        if (j10 != 0 && (-j10) == dialog.f28402id) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void D3(so soVar) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.N[i7] == soVar) {
                f5(null);
                getNotificationCenter().k(ls.f25342s, Boolean.TRUE);
                return;
            }
        }
    }

    public final void D4(long j3, TLRPC.PeerSettings peerSettings) {
        boolean z10;
        int i7;
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.f25821g7;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i10 = 2;
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(a8.p0.o(j3, "dialog_botid"), peerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j3, peerSettings.business_bot_manage_url);
            String str = "dialog_botflags" + j3;
            boolean z11 = peerSettings.business_bot_paused;
            if (peerSettings.business_bot_can_reply) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            edit.putInt(str, (z11 ? 1 : 0) + i7);
        } else {
            edit.remove("dialog_botid" + j3).remove("dialog_boturl" + j3).remove("dialog_botflags" + j3);
        }
        edit.putLong(a8.p0.o(j3, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        int i11 = sharedPreferences.getInt("dialog_bar_vis3" + j3, 0);
        int i12 = ls.Q0;
        if (i11 == 3) {
            edit.apply();
            getNotificationCenter().k(i12, Long.valueOf(j3));
            return;
        }
        if (peerSettings.flags == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (s2.f26694a) {
            StringBuilder t6 = a8.p0.t(j3, "peer settings loaded for ", " add = ");
            t6.append(peerSettings.add_contact);
            t6.append(" block = ");
            t6.append(peerSettings.block_contact);
            t6.append(" spam = ");
            t6.append(peerSettings.report_spam);
            t6.append(" share = ");
            t6.append(peerSettings.share_contact);
            t6.append(" geo = ");
            t6.append(peerSettings.report_geo);
            t6.append(" hide = ");
            t6.append(z10);
            t6.append(" distance = ");
            t6.append(peerSettings.geo_distance);
            t6.append(" invite = ");
            t6.append(peerSettings.invite_members);
            a8.b(t6.toString());
        }
        String o4 = a8.p0.o(j3, "dialog_bar_vis3");
        if (z10) {
            i10 = 1;
        }
        edit.putInt(o4, i10);
        edit.putBoolean("dialog_bar_share" + j3, peerSettings.share_contact);
        edit.putBoolean("dialog_bar_report" + j3, peerSettings.report_spam);
        edit.putBoolean("dialog_bar_add" + j3, peerSettings.add_contact);
        edit.putBoolean("dialog_bar_block" + j3, peerSettings.block_contact);
        edit.putBoolean("dialog_bar_exception" + j3, peerSettings.need_contacts_exception);
        edit.putBoolean("dialog_bar_location" + j3, peerSettings.report_geo);
        edit.putBoolean("dialog_bar_archived" + j3, peerSettings.autoarchived);
        edit.putBoolean("dialog_bar_invite" + j3, peerSettings.invite_members);
        edit.putString("dialog_bar_chat_with_admin_title" + j3, peerSettings.request_chat_title);
        edit.putBoolean("dialog_bar_chat_with_channel" + j3, peerSettings.request_chat_broadcast);
        edit.putInt("dialog_bar_chat_with_date" + j3, peerSettings.request_chat_date);
        if (sharedPreferences.getInt("dialog_bar_distance" + j3, -1) != -2) {
            if ((peerSettings.flags & 64) != 0) {
                edit.putInt(a8.p0.o(j3, "dialog_bar_distance"), peerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j3);
            }
        }
        if (j3 == getUserConfig().e()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        this.f25899q1.k(peerSettings, j3);
        getNotificationCenter().k(i12, Long.valueOf(j3));
    }

    public final void D5(HashSet hashSet) {
        C5(0L);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C5(((Long) it.next()).longValue());
        }
    }

    public final boolean E(Bundle bundle, final org.telegram.ui.ActionBar.g2 g2Var, gj gjVar, org.telegram.ui.hi hiVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String H1;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (g2Var != null) {
            long j3 = bundle.getLong("user_id", 0L);
            long j10 = bundle.getLong("chat_id", 0L);
            int i7 = bundle.getInt("message_id", 0);
            org.telegram.ui.ActionBar.t1 t1Var = null;
            if (j3 != 0) {
                user = c2(Long.valueOf(j3));
                chat = null;
            } else if (j10 != 0) {
                chat = O0(Long.valueOf(j10));
                user = null;
            } else {
                user = null;
                chat = null;
            }
            if (user != null || chat != null) {
                if (chat != null) {
                    H1 = H1(chat.restriction_reason);
                } else {
                    H1 = H1(user.restriction_reason);
                }
                if (H1 != null) {
                    d5(H1, g2Var);
                    return false;
                } else if (i7 != 0 && gjVar != null && chat != null && chat.access_hash == 0) {
                    long B0 = gj.B0(gjVar.f24177k);
                    if (!n5.C(B0)) {
                        if (hiVar != null) {
                            hiVar.d();
                        } else {
                            t1Var = new org.telegram.ui.ActionBar.t1(3, g2Var.getParentActivity(), null);
                        }
                        int i10 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
                        if (i10 < 0) {
                            chat = O0(Long.valueOf(-B0));
                        }
                        if (i10 <= 0 && v3.T(chat)) {
                            TLRPC.Chat O0 = O0(Long.valueOf(-B0));
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = k1(O0);
                            tL_channels_getMessages.f28436id.add(Integer.valueOf(gjVar.e1()));
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.f28494id.add(Integer.valueOf(gjVar.e1()));
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        final int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new zn(this, t1Var, hiVar, g2Var, bundle, 1));
                        if (t1Var != null) {
                            t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                @Override
                                public final void onCancel(DialogInterface dialogInterface) {
                                    np.this.getConnectionsManager().cancelRequest(sendRequest, true);
                                    g2Var.setVisibleDialog(null);
                                }
                            });
                            g2Var.setVisibleDialog(t1Var);
                            t1Var.show();
                            return false;
                        }
                        hiVar.f59380b = new l7(this, sendRequest, g2Var, 15);
                        hiVar.d();
                        return false;
                    }
                } else if (i7 != 0 && gjVar != null && hiVar != null) {
                    hiVar.d();
                    hiVar.f59380b = t0(-j10, i7, new h6.m(hiVar, g2Var, bundle, false, 22));
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public final String E0(long j3, long j10) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j3 == j10) {
            return "";
        }
        a0.h hVar = (a0.h) this.A1.f(j3);
        if (hVar != null && (channelParticipant2 = (TLRPC.ChannelParticipant) hVar.f(j10)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return hd.N0(2131752195, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return hd.N0(2131752196, null);
            }
        }
        TLRPC.ChatFull P0 = P0(j3);
        if (P0 != null && P0.participants != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= P0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i7);
                if (chatParticipant.user_id == j10) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return hd.N0(2131752195, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return hd.N0(2131752196, null);
                    }
                } else {
                    i7++;
                }
            }
        }
        return null;
    }

    public final TLRPC.PeerSettings E1(long j3) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull d2 = d2(j3);
        if (d2 != null && (peerSettings = d2.settings) != null) {
            return peerSettings;
        }
        return (TLRPC.PeerSettings) this.f25899q1.f(j3);
    }

    public final boolean E2(long j3) {
        TLRPC.Chat O0 = O0(Long.valueOf(-j3));
        if (O0 != null && O0.monoforum) {
            return true;
        }
        return false;
    }

    public final void E3(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str, int i7, vf.b bVar, boolean z10, boolean z11) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (bVar != null) {
            bVar.f59380b = new ik(1, zArr);
            bVar.d();
        }
        rl rlVar = new rl(this, g2Var, bVar, zArr, user, str, z10, z11, r9);
        si mediaDataController = getMediaDataController();
        long j3 = user.f28547id;
        HashMap hashMap = mediaDataController.f26831y1;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hashMap.get(j3 + "_" + j3);
        TL_bots.BotInfo[] botInfoArr = {botInfo};
        if (user.bot_has_main_app) {
            rlVar.run();
        } else if (botInfo == null) {
            si mediaDataController2 = getMediaDataController();
            long j10 = user.f28547id;
            mediaDataController2.J0(j10, j10, false, i7, new hk(this, zArr, botInfoArr, user, i7, rlVar));
        } else {
            rlVar.run();
        }
    }

    public final boolean E4(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList arrayList) {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        sparseIntArray.clear();
        int i7 = 0;
        while (true) {
            String str2 = null;
            int i10 = 1;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) instanceof TLRPC.TL_jsonString) {
                    str2 = ((TLRPC.TL_jsonString) arrayList.get(i7)).value;
                }
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2145993328:
                            if (str2.equals("animated_userpics")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2080028929:
                            if (str2.equals("infinite_reactions")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2022719725:
                            if (str2.equals("stories__caption")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1975141450:
                            if (str2.equals("away_message")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1953490480:
                            if (str2.equals("business_hours")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1952597715:
                            if (str2.equals("business_intro")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1949982086:
                            if (str2.equals("business_links")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1924078036:
                            if (str2.equals("stories__quality")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1919626711:
                            if (str2.equals("stories__save_stories_to_gallery")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1884266413:
                            if (str2.equals("stories")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1833928446:
                            if (str2.equals("effects")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1777612460:
                            if (str2.equals("business_location")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1761847571:
                            if (str2.equals("peer_colors")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1755514268:
                            if (str2.equals("voice_to_text")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1529105743:
                            if (str2.equals("wallpapers")) {
                                c10 = 14;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1516580016:
                            if (str2.equals("message_privacy")) {
                                c10 = 15;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1425144150:
                            if (str2.equals("animated_emoji")) {
                                c10 = 16;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1225497630:
                            if (str2.equals("translations")) {
                                c10 = 17;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1146830912:
                            if (str2.equals("business")) {
                                c10 = 18;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1040323278:
                            if (str2.equals("no_ads")) {
                                c10 = 19;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1023650261:
                            if (str2.equals("more_upload")) {
                                c10 = 20;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -969043445:
                            if (str2.equals("emoji_status")) {
                                c10 = 21;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -730864243:
                            if (str2.equals("profile_badge")) {
                                c10 = 22;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -448825858:
                            if (str2.equals("faster_download")) {
                                c10 = 23;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -294265343:
                            if (str2.equals("greeting_message")) {
                                c10 = 24;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -165039170:
                            if (str2.equals("premium_stickers")) {
                                c10 = 25;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -96210874:
                            if (str2.equals("double_limits")) {
                                c10 = 26;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3565638:
                            if (str2.equals("todo")) {
                                c10 = 27;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 98352451:
                            if (str2.equals("gifts")) {
                                c10 = 28;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 110781770:
                            if (str2.equals("folder_tags")) {
                                c10 = 29;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 234735554:
                            if (str2.equals("stories__expiration_durations")) {
                                c10 = 30;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 388416338:
                            if (str2.equals("stories__stealth_mode")) {
                                c10 = 31;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 480338102:
                            if (str2.equals("quick_replies")) {
                                c10 = ' ';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 622623867:
                            if (str2.equals("ai_compose")) {
                                c10 = '!';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 629542059:
                            if (str2.equals("business_bots")) {
                                c10 = '\"';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 705083174:
                            if (str2.equals("stories__priority_order")) {
                                c10 = '#';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1054743185:
                            if (str2.equals("pm_noforwards")) {
                                c10 = '$';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1080006662:
                            if (str2.equals("stories__links_and_formatting")) {
                                c10 = '%';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1219849581:
                            if (str2.equals("advanced_chat_management")) {
                                c10 = '&';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1438966047:
                            if (str2.equals("stories__permanent_views_history")) {
                                c10 = '\'';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1488814760:
                            if (str2.equals("rich_formatting")) {
                                c10 = '(';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1537309393:
                            if (str2.equals("saved_tags")) {
                                c10 = ')';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1832801148:
                            if (str2.equals("app_icons")) {
                                c10 = '*';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2013274756:
                            if (str2.equals("last_seen")) {
                                c10 = '+';
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
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
                        sparseIntArray.put(i10, i7);
                        if (sb2.length() > 0) {
                            sb2.append('_');
                        }
                        sb2.append(i10);
                        i7++;
                    }
                }
                i7++;
            } else {
                int length = sb2.length();
                SharedPreferences sharedPreferences = this.h7;
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

    public final boolean E5(long j3, ch.p0 p0Var, boolean z10) {
        long j10;
        int i7;
        if (this.f25822g8 == null) {
            return false;
        }
        boolean z11 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                j10 = 0;
            } else {
                j10 = j3;
            }
            if (i10 != 1 || j10 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.f25822g8.f(j10);
                if (tL_messages_savedReactionsTags == null) {
                    if (j10 != 0) {
                        a0.h hVar = this.f25822g8;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        hVar.k(tL_messages_savedReactionsTags, j10);
                    }
                }
                int i11 = 0;
                boolean z12 = false;
                while (i11 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i11);
                    if (p0Var.f(tL_savedReactionTag.reaction)) {
                        int i12 = tL_savedReactionTag.count;
                        if (z10) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        int max = Math.max(0, i7 + i12);
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
                    tL_savedReactionTag2.reaction = p0Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void F(long j3, String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1809401834:
                if (str.equals("USER_BANNED_IN_CHANNEL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795226617:
                if (str.equals("CHANNEL_PRIVATE")) {
                    c10 = 1;
                    break;
                }
                break;
            case -471086771:
                if (str.equals("CHANNEL_PUBLIC_GROUP_NA")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        int i7 = ls.U;
        switch (c10) {
            case 0:
                getNotificationCenter().k(i7, Long.valueOf(j3), 2);
                return;
            case 1:
                getNotificationCenter().k(i7, Long.valueOf(j3), 0);
                return;
            case 2:
                getNotificationCenter().k(i7, Long.valueOf(j3), 1);
                return;
            default:
                return;
        }
    }

    public final int F0() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f25952w;
            if (i7 < sparseArray.size()) {
                List list = (List) sparseArray.get(sparseArray.keyAt(i7));
                if (list != null) {
                    i10 = list.size() + i10;
                }
                i7++;
            } else {
                return i10;
            }
        }
    }

    public final CharSequence F1(long j3, long j10, boolean z10) {
        a0.h hVar;
        TLRPC.User c22;
        TLRPC.UserStatus userStatus;
        if ((z10 && n5.E(j3) && (c22 = c2(Long.valueOf(j3))) != null && (userStatus = c22.status) != null && userStatus.expires < 0) || (hVar = (a0.h) this.X.f(j3)) == null) {
            return null;
        }
        return (CharSequence) hVar.f(j10);
    }

    public final boolean F2(long j3) {
        TLRPC.Chat O0 = O0(Long.valueOf(-j3));
        if (v3.p0(O0) && v3.A(this.currentAccount, O0, 24)) {
            return true;
        }
        return false;
    }

    public final void F3(java.lang.String r11, org.telegram.ui.ActionBar.g2 r12, int r13, vf.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.F3(java.lang.String, org.telegram.ui.ActionBar.g2, int, vf.b):void");
    }

    public final void F4(long j3, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().f27214a.c(new d4(this, j3, tL_messages_savedReactionsTags, 18));
    }

    public final void F5(TLObject tLObject, String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = this.f25794e;
            concurrentHashMap.remove(str);
            if (z10) {
                concurrentHashMap.put(str.toLowerCase(), tLObject);
            }
        }
    }

    public final void G(long j3, boolean z10) {
        TLRPC.Chat O0 = O0(Long.valueOf(j3));
        if (v3.T(O0) && !O0.creator) {
            a0.h hVar = this.f25768b1;
            if (hVar.h(j3) < 0) {
                if (v3.p0(O0)) {
                    z10 = false;
                }
                boolean z11 = z10;
                hVar.k(Boolean.TRUE, j3);
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = j1(j3);
                tL_channels_getParticipant.participant = l1(getUserConfig().e());
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new al(this, O0, z11, j3));
            }
        }
    }

    public final TLRPC.messages_AvailableEffects G0() {
        if (!this.f25871m8) {
            this.f25871m8 = true;
            this.f25888o8.c(this.currentAccount, 0, new bo(this, 0));
        }
        return this.f25880n8;
    }

    public final Integer G1(long j3, long j10) {
        a0.h hVar = (a0.h) this.Y.f(j3);
        if (hVar == null) {
            return null;
        }
        return (Integer) hVar.f(j10);
    }

    public final boolean G2(long j3) {
        if (j3 > 0) {
            return Q2(d2(j3));
        }
        return r2(O0(Long.valueOf(-j3)));
    }

    public final void G3(org.telegram.tgnet.TLRPC.User r9, org.telegram.tgnet.TLRPC.Chat r10, org.telegram.ui.ActionBar.g2 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.G3(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.g2, int):void");
    }

    public final void G4(org.telegram.ui.ActionBar.l6 l6Var, org.telegram.ui.ActionBar.j6 j6Var, boolean z10, boolean z11) {
        TLRPC.TL_theme tL_theme;
        if (j6Var != null) {
            tL_theme = j6Var.f29077r;
        } else {
            tL_theme = l6Var.G;
        }
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f28469id = tL_theme.f28537id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z11;
            getConnectionsManager().sendRequest(savetheme, new fi.k5(13));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z11) {
            m2(l6Var, j6Var, z10);
        }
    }

    public final void G5(boolean z10, boolean z11) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z10;
            tL_webBrowserSettings.display_close_button = z11;
            c5(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z10;
        updatewebbrowsersettings.display_close_button = z11;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new d3.b(1), new bl(this, 1));
    }

    public final void H(int i7, boolean z10) {
        if (i7 >= 0) {
            SparseArray sparseArray = this.f25786d0;
            po poVar = (po) sparseArray.get(i7);
            if (poVar != 0) {
                if (!poVar.f26293a) {
                    if (System.currentTimeMillis() - poVar.f26294b <= this.f25852k5 * 1000 && !z10) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (poVar == 0) {
                poVar = new Object();
                poVar.f26293a = true;
                sparseArray.put(i7, poVar);
            }
            poVar.f26293a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i7;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new wn(this, i7, poVar, 4));
        }
    }

    public final void H0(boolean z10) {
        int size;
        int i7;
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
                i7 = 20;
            } else {
                i7 = 100;
            }
            tL_contacts_getBlocked.limit = i7;
            getConnectionsManager().sendRequest(tL_contacts_getBlocked, new p3(this, z10, tL_contacts_getBlocked, 3));
        }
    }

    public final String H1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i7);
                Set set = this.F4;
                if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason)) {
                    if (!"all".equals(restrictionReason.platform)) {
                        if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                            t0.u();
                            if (!s2.a()) {
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

    public final void H3(int i7) {
        boolean z10;
        ArrayList arrayList;
        TLRPC.User f10;
        if (i7 == 1) {
            Context context = t0.f26895b;
            int i10 = this.currentAccount;
            long e10 = getUserConfig().e();
            if (e10 == 0) {
                Object obj = org.telegram.ui.Wallet.z0.f45342g;
            } else {
                synchronized (org.telegram.ui.Wallet.z0.f45342g) {
                    try {
                        ArrayList o4 = org.telegram.ui.Wallet.z0.o(context, e10);
                        int size = o4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = o4.get(i11);
                            i11++;
                            new org.telegram.ui.Wallet.z0(i10, context, (String) obj2).C();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (getUserConfig().d && cz.f23371g.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = cz.f23371g;
                unregisterdevice.token_type = cz.f23368f;
                for (int i12 = 0; i12 < 4; i12++) {
                    k10 i13 = k10.i(i12);
                    if (i12 != this.currentAccount && i13.p()) {
                        unregisterdevice.other_uids.add(Long.valueOf(i13.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new fi.k5(13));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new nj(this, 20));
        } else {
            ConnectionsManager connectionsManager = getConnectionsManager();
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            connectionsManager.cleanup(z10);
        }
        getUserConfig().b();
        c6.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().f25396a.get(ls.I2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                gs gsVar = (gs) arrayList2.get(i14);
                if (gsVar instanceof js) {
                    gsVar = (gs) ((js) gsVar).f24874b.get();
                }
                if (gsVar != null) {
                    arrayList.add(gsVar);
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
        if (k10.f24932t0 == this.currentAccount) {
            int i16 = 0;
            while (true) {
                if (i16 < 4) {
                    if (k10.i(i16).p()) {
                        break;
                    }
                    i16++;
                } else {
                    i16 = -1;
                    break;
                }
            }
            if (i16 != -1) {
                k10.f24932t0 = i16;
                k10.i(0).v(false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.I();
                }
            }
        }
        getNotificationCenter().k(ls.I2, new Object[0]);
        ur messagesStorage = getMessagesStorage();
        messagesStorage.f27214a.c(new zq(messagesStorage, false, 1));
        Q();
        i5 contactsController = getContactsController();
        contactsController.getClass();
        try {
            contactsController.f24559a = null;
            AccountManager accountManager = AccountManager.get(t0.f26895b);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i17 = 0; i17 < accountsByType.length; i17++) {
                Account account = accountsByType[i17];
                int i18 = 0;
                while (true) {
                    if (i18 < 4) {
                        if (k10.i(i18).f() != null) {
                            if (account.name.equals("" + f10.f28547id)) {
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

    public final void H4(org.telegram.ui.ActionBar.l6 r20, org.telegram.ui.ActionBar.j6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.H4(org.telegram.ui.ActionBar.l6, org.telegram.ui.ActionBar.j6):void");
    }

    public final boolean I(boolean z10) {
        a0.h hVar;
        int i7;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.Y1 == null && this.Z1 == null) || (!z10 && ((i7 = this.X1) == 0 || i7 > currentTime))) {
            return false;
        }
        this.X1 = 0;
        if (this.f25759a2 != null && !z10) {
            Utilities.d.a(this.f25759a2);
        }
        a0.h hVar2 = null;
        this.f25759a2 = null;
        a0.h hVar3 = this.Y1;
        if (hVar3 != null) {
            hVar = hVar3.clone();
        } else {
            hVar = null;
        }
        a0.h hVar4 = this.Z1;
        if (hVar4 != null) {
            hVar2 = hVar4.clone();
        }
        g0.g3(new qj(this, hVar, hVar2, 0));
        return true;
    }

    public final h3 I0() {
        h3 h3Var = this.f25873n0;
        if (h3Var != null) {
            return h3Var;
        }
        synchronized (L8[this.currentAccount]) {
            try {
                h3 h3Var2 = this.f25873n0;
                if (h3Var2 != null) {
                    return h3Var2;
                }
                h3 h3Var3 = new h3(this.currentAccount);
                this.f25873n0 = h3Var3;
                return h3Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final qv I1() {
        qv qvVar = this.f25839j0;
        if (qvVar != null) {
            return qvVar;
        }
        synchronized (L8[this.currentAccount]) {
            try {
                qv qvVar2 = this.f25839j0;
                if (qvVar2 != null) {
                    return qvVar2;
                }
                qv qvVar3 = new qv(this.currentAccount);
                this.f25839j0 = qvVar3;
                return qvVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean I2(long j3, boolean z10) {
        TLRPC.Dialog dialog = this.A2;
        if (dialog != null && dialog.f28402id == j3) {
            if (!z10 || this.B2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean I3(long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        TLRPC.InputPeer inputPeer2;
        NativeByteBuffer nativeByteBuffer;
        long z11;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j3);
        if (dialog != null && dialog.pinned != z10) {
            int i7 = dialog.folder_id;
            ArrayList Y0 = Y0(i7);
            dialog.pinned = z10;
            if (z10) {
                int i10 = 0;
                for (int i11 = 0; i11 < Y0.size(); i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) Y0.get(i11);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!dialog2.pinned) {
                            if (dialog2.f28402id != this.C2) {
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
            f5(null);
            if (!z10 && !Y0.isEmpty() && i5.c.h(1, Y0) == dialog && !this.f25797e2.get(i7)) {
                a8.p0.z(1, Y0);
            }
            getNotificationCenter().k(ls.f25342s, new Object[0]);
            if (!n5.C(j3) && j10 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z10;
                if (inputPeer == null) {
                    inputPeer2 = l1(j3);
                } else {
                    inputPeer2 = inputPeer;
                }
                if (!(inputPeer2 instanceof TLRPC.TL_inputPeerEmpty)) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer.peer = inputPeer2;
                    tL_messages_toggleDialogPin.peer = tL_inputDialogPeer;
                    if (j10 == 0) {
                        try {
                            nativeByteBuffer = new NativeByteBuffer(inputPeer2.getObjectSize() + 16);
                            try {
                                nativeByteBuffer.writeInt32(4);
                                nativeByteBuffer.writeInt64(j3);
                                nativeByteBuffer.writeBool(z10);
                                inputPeer2.serializeToStream(nativeByteBuffer);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer2 = nativeByteBuffer;
                                a8.g(e, true);
                                nativeByteBuffer = nativeByteBuffer2;
                                z11 = getMessagesStorage().z(nativeByteBuffer);
                                getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new mj(this, z11, 11));
                                ur messagesStorage = getMessagesStorage();
                                messagesStorage.f27214a.c(new wp(messagesStorage, dialog.pinnedNum, j3, 3));
                                return true;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        z11 = getMessagesStorage().z(nativeByteBuffer);
                    } else {
                        z11 = j10;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new mj(this, z11, 11));
                }
            }
            ur messagesStorage2 = getMessagesStorage();
            messagesStorage2.f27214a.c(new wp(messagesStorage2, dialog.pinnedNum, j3, 3));
            return true;
        } else if (dialog != null) {
            return true;
        }
        return false;
    }

    public final void I4() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.F7.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(num);
        }
        this.h7.edit().putString("unreadOnlyFilters", sb2.toString()).apply();
    }

    public final void J(int i7) {
        if (i7 == 0) {
            return;
        }
        ur messagesStorage = getMessagesStorage();
        messagesStorage.f27214a.c(new sp(messagesStorage, i7, 3));
    }

    public final int J0() {
        if (getUserConfig().q()) {
            return this.X4;
        }
        return this.W4;
    }

    public final gp J1() {
        if (this.f25990z8 == null) {
            this.f25990z8 = new gp(this.currentAccount);
        }
        return this.f25990z8;
    }

    public final boolean J2(int i7, long j3, boolean z10) {
        Boolean bool = (Boolean) this.f25981y8.get(j3 + "_" + i7);
        if (bool != null && bool.booleanValue() == z10) {
            return true;
        }
        return false;
    }

    public final void J3(TLRPC.Chat chat, TLRPC.User user, int i7, boolean z10, boolean z11, boolean z12) {
        long j3;
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        if (chat != null) {
            j3 = -chat.f28398id;
        } else {
            j3 = user.f28547id;
        }
        tL_messages_updatePinnedMessage.peer = l1(j3);
        tL_messages_updatePinnedMessage.f28524id = i7;
        tL_messages_updatePinnedMessage.unpin = z10;
        tL_messages_updatePinnedMessage.silent = !z12;
        tL_messages_updatePinnedMessage.pm_oneside = z11;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new bn(this, i7, chat, user, z10));
    }

    public final void J4(java.io.File r9, org.telegram.ui.ActionBar.d6 r10, boolean r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.J4(java.io.File, org.telegram.ui.ActionBar.d6, boolean, long):void");
    }

    public final void K(TLRPC.Chat chat, TLRPC.User user, ap apVar) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (!chat.megagroup && !v3.T(chat)) {
            TLRPC.ChatFull P0 = P0(chat.f28398id);
            boolean z10 = false;
            if (P0 != null) {
                TLRPC.ChatParticipants chatParticipants = P0.participants;
                if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        chatParticipant = P0.participants.participants.get(i7);
                        if (chatParticipant != null && chatParticipant.user_id == user.f28547id) {
                            break;
                        }
                    }
                }
                chatParticipant = null;
                if (chatParticipant != null) {
                    z10 = true;
                }
                TLRPC.ChatParticipants chatParticipants2 = P0.participants;
                if (chatParticipants2 != null && chatParticipants2.admin_id == user.f28547id) {
                    tL_chatAdminRights = org.telegram.ui.np.t0(true);
                } else {
                    tL_chatAdminRights = null;
                }
                apVar.a(z10, tL_chatAdminRights, null);
                return;
            }
            apVar.a(false, null, null);
            return;
        }
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = j1(chat.f28398id);
        tL_channels_getParticipant.participant = p1(user);
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new s1(apVar, 4));
    }

    public final void K0(long j3) {
        L0(j3, 0, 0L, null);
    }

    public final TLRPC.TL_messages_savedReactionsTags K1(long j3, boolean z10) {
        HashSet hashSet = this.f25813f8;
        if (hashSet != null && hashSet.contains(Long.valueOf(j3)) && !z10) {
            a0.h hVar = this.f25822g8;
            if (hVar == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) hVar.f(j3);
        }
        if (this.f25813f8 == null) {
            this.f25813f8 = new HashSet();
        }
        this.f25813f8.add(Long.valueOf(j3));
        getMessagesStorage().f27214a.c(new jk(this, j3, 7));
        return null;
    }

    public final boolean K2() {
        TLRPC.UserFull d2 = d2(getUserConfig().e());
        if (d2 == null) {
            return false;
        }
        return !d2.sponsored_enabled;
    }

    public final boolean K3() {
        if (this.f25854k7 && !getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final void K4(String str, TLRPC.User user) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = s1(user);
        tL_messages_startBot.peer = l1(user.f28547id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.f22772b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new nj(this, 21));
    }

    public final void L(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j3) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (!n5.C(dialog.f28402id)) {
            long j10 = dialog.f28402id;
            a0.h hVar = this.f25796e1;
            if (hVar.h(j10) < 0) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                if (inputPeer == null) {
                    inputPeer = l1(dialog.f28402id);
                }
                tL_messages_getHistory.peer = inputPeer;
                tL_messages_getHistory.limit = 1;
                hVar.k(Boolean.TRUE, dialog.f28402id);
                if (s2.f26694a) {
                    i5.c.v(dialog.f28402id, new StringBuilder("checkLastDialogMessage for "));
                }
                if (j3 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tL_messages_getHistory.peer.getObjectSize() + 60);
                    } catch (Exception e10) {
                        nativeByteBuffer = null;
                        exc = e10;
                    }
                    try {
                        nativeByteBuffer.writeInt32(14);
                        nativeByteBuffer.writeInt64(dialog.f28402id);
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
                        j3 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getHistory, new ho(this, dialog, j3, 9));
                    }
                    j3 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getHistory, new ho(this, dialog, j3, 9));
            }
        }
    }

    public final void L0(long r18, int r20, long r21, org.telegram.tgnet.TLRPC.InputChannel r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.L0(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public final void L1() {
        K1(0L, false);
    }

    public final void L3() {
        int i7 = this.f25862l7;
        if (i7 < 2) {
            this.f25862l7 = i7 + 1;
            SharedPreferences sharedPreferences = this.h7;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.f25862l7).apply();
            }
        }
    }

    public final void L4(final TLObject tLObject, final ArrayList arrayList, final TLRPC.TL_messages_dialogs tL_messages_dialogs, final TLRPC.TL_messages_dialogs tL_messages_dialogs2, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final SparseArray sparseArray, final ArrayList arrayList5, final HashMap hashMap, final HashSet hashSet, final Runnable runnable) {
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
                    for (int i7 = 0; i7 < size; i7++) {
                        arrayList7.add((TLRPC.User) vector.objects.get(i7));
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
                    final ur messagesStorage = np.this.getMessagesStorage();
                    q5 q5Var = messagesStorage.f27214a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    q5Var.c(new Runnable() {
                        @Override
                        public final void run() {
                            ur.this.Y0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void M(boolean z10) {
        int i7;
        dp dpVar;
        int i10;
        if (getUserConfig().f() != null) {
            if (!this.f25830h8 && ((dpVar = this.f25930t4) == null || dpVar.g() || z10)) {
                this.f25830h8 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                dp dpVar2 = this.f25930t4;
                if (dpVar2 != null) {
                    i10 = dpVar2.f23556b;
                } else {
                    i10 = 0;
                }
                tL_help_getPeerColors.hash = i10;
                if (dpVar2 != null && dpVar2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new nj(this, 22));
            }
            if (!this.f25838i8) {
                dp dpVar3 = this.f25938u4;
                if (dpVar3 == null || dpVar3.g() || z10) {
                    this.f25838i8 = true;
                    TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                    dp dpVar4 = this.f25938u4;
                    if (dpVar4 != null) {
                        i7 = dpVar4.f23556b;
                    } else {
                        i7 = 0;
                    }
                    tL_help_getPeerProfileColors.hash = i7;
                    if (dpVar4 != null && dpVar4.g()) {
                        tL_help_getPeerProfileColors.hash = 0;
                    }
                    getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new nj(this, 23));
                }
            }
        }
    }

    public final void M0(TLRPC.Chat chat, TLRPC.User user, y10 y10Var) {
        if (chat != null) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = j1(chat.f28398id);
            tL_channels_getParticipant.participant = p1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new d3(y10Var, 1));
            return;
        }
        y10Var.a(null);
    }

    public final java.lang.String M1(org.telegram.tgnet.TLRPC.Reaction r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.M1(org.telegram.tgnet.TLRPC$Reaction):java.lang.String");
    }

    public final boolean M2() {
        return !"disabled".equals(this.Y6);
    }

    public final void M3(int i7, long j3) {
        LongSparseLongArray longSparseLongArray;
        boolean z10;
        a0.h hVar = this.X0;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            LongSparseIntArray longSparseIntArray = this.Z0;
            int i10 = longSparseIntArray.get(j3);
            if (!arrayList.isEmpty() && i10 != 0) {
                Collections.sort(arrayList, new jg.w(27));
                if (i7 == 2) {
                    longSparseIntArray.put(j3, ((TLRPC.Updates) arrayList.get(0)).pts);
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
                        V3(updates, true);
                        if (arrayList.size() <= 0) {
                            break;
                        }
                        arrayList.remove(0);
                        z11 = true;
                    } else if (z10) {
                        long j10 = longSparseLongArray.get(j3);
                        if (j10 != 0 && (z11 || Math.abs(System.currentTimeMillis() - j10) <= 1500)) {
                            if (s2.f26694a) {
                                a8.b("HOLE IN CHANNEL " + j3 + " UPDATES QUEUE - will wait more time");
                            }
                            if (z11) {
                                longSparseLongArray.put(j3, System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (s2.f26694a) {
                            a8.b("HOLE IN CHANNEL " + j3 + " UPDATES QUEUE - getChannelDifference ");
                        }
                        longSparseLongArray.delete(j3);
                        hVar.l(j3);
                        K0(j3);
                        return;
                    } else if (arrayList.size() <= 0) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
                hVar.l(j3);
                longSparseLongArray.delete(j3);
                if (s2.f26694a) {
                    a8.b("UPDATES CHANNEL " + j3 + " QUEUE PROCEED - OK");
                    return;
                }
                return;
            }
            hVar.l(j3);
        }
    }

    public final void M4(long j3, long j10) {
        N4(2, 0, j3, j10, null);
    }

    public final void N(boolean z10) {
        String str;
        boolean z11 = false;
        if (z10 && this.f25965x2) {
            this.f25965x2 = false;
        }
        if ((z10 || this.f25955w2 <= getConnectionsManager().getCurrentTime()) && !this.f25965x2) {
            if (this.f25975y2 != 0) {
                getConnectionsManager().cancelRequest(this.f25975y2, true);
                this.f25975y2 = 0;
            }
            SharedPreferences g12 = g1();
            g12.getBoolean("proxy_enabled", false);
            String string = g12.getString("proxy_ip", "");
            String string2 = g12.getString("proxy_secret", "");
            if (this.C2 != 0 && this.D2 == 0 && (str = this.G2) != null) {
                if (!str.equals(string + string2)) {
                    z11 = true;
                }
            }
            int i7 = this.f25984z2 + 1;
            this.f25984z2 = i7;
            this.f25965x2 = true;
            this.f25975y2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new eh(this, i7, string, string2, 1));
            if (z11) {
                this.C2 = 0L;
                this.G2 = null;
                this.f25955w2 = getConnectionsManager().getCurrentTime() + 3600;
                g1().edit().putLong("proxy_dialog", this.C2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.f25955w2).commit();
                g0.g3(new rn(this, 7));
            }
        }
    }

    public final oo N0(long j3) {
        oo ooVar;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.f25803e8 == null) {
            this.f25803e8 = new HashMap();
        }
        boolean q10 = getUserConfig().q();
        if (this.f25803e8.containsKey(Long.valueOf(j3))) {
            ooVar = (oo) this.f25803e8.get(Long.valueOf(j3));
            if (ooVar == null || ooVar.f26115a == q10) {
                return ooVar;
            }
        } else {
            ooVar = null;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = q1(j3);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (i7 != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = j1(-j3);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.f25803e8.put(Long.valueOf(j3), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new sf(this, q10, j3, 1));
        return ooVar;
    }

    public final TLRPC.TL_channels_sendAsPeers N1(long j3) {
        return O1(j3, false);
    }

    public final boolean N2() {
        return !"disabled".equals(this.X6);
    }

    public final boolean N3(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || n5.o(message.peer_id) != getUserConfig().e() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long Q1 = gj.Q1(getUserConfig().e(), message);
        boolean z10 = false;
        for (int i7 = 0; i7 < message.reactions.results.size(); i7++) {
            if (E5(Q1, ch.p0.d(message.reactions.results.get(i7).reaction), false)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean N4(int r17, int r18, long r19, long r21, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.N4(int, int, long, long, java.lang.String):boolean");
    }

    public final void O(long j3, long j10, SparseBooleanArray sparseBooleanArray) {
        P(j3, j10, sparseBooleanArray, false);
    }

    public final TLRPC.Chat O0(Long l10) {
        return (TLRPC.Chat) this.f25766b.get(l10);
    }

    public final TLRPC.TL_channels_sendAsPeers O1(long j3, boolean z10) {
        a0.h hVar;
        TLRPC.Chat O0;
        if (z10) {
            hVar = this.F1;
        } else {
            hVar = this.E1;
        }
        a0.h hVar2 = hVar;
        ip ipVar = (ip) hVar2.f(j3);
        if (ipVar != null) {
            return ipVar.f24734a;
        }
        if (!z10 && ((O0 = O0(Long.valueOf(-j3))) == null || !v3.k(O0))) {
            return null;
        }
        ?? obj = new Object();
        hVar2.k(obj, j3);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = l1(j3);
        tL_channels_getSendAs.for_live_stories = z10;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new b4(this, hVar2, j3, (ip) obj, z10));
        return null;
    }

    public final boolean O2(long j3) {
        if (j3 != 0 && !n5.C(j3) && j3 != getUserConfig().e()) {
            String str = "dialog_bar_vis3" + j3;
            SharedPreferences sharedPreferences = this.f25821g7;
            if (sharedPreferences.getInt(str, 0) == 2 && f3.w("dialog_bar_report", j3, sharedPreferences, false) && !f3.w("dialog_bar_replied", j3, sharedPreferences, false)) {
                return true;
            }
        }
        return false;
    }

    public final void O3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        g0.g3(new lg(this, longSparseIntArray, longSparseIntArray2, 9));
    }

    public final void O4(int i7, long j3) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i7;
        tL_channels_setBoostsToUnblockRestrictions.channel = j1(j3);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new mj(this, j3, 15));
    }

    public final void P(final long j3, final long j10, final SparseBooleanArray sparseBooleanArray, final boolean z10) {
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
        getMessagesStorage().f27214a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tj.run():void");
            }
        });
    }

    public final TLRPC.ChatFull P0(long j3) {
        return (TLRPC.ChatFull) this.f25864m1.f(j3);
    }

    public final long P1(long j3) {
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 > 0) {
            if (j3 == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull d2 = d2(j3);
            if (d2 != null) {
                return d2.send_paid_messages_stars;
            }
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (c22 != null && c22.send_paid_messages_stars > 0) {
                return n5.k(P2(c22.f28547id));
            }
        } else if (i7 < 0) {
            long j10 = -j3;
            TLRPC.Chat O0 = O0(Long.valueOf(j10));
            if (v3.N(O0)) {
                return 0L;
            }
            if (v3.p0(O0) && v3.A(this.currentAccount, O0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull P0 = P0(j10);
            if (P0 != null) {
                return P0.send_paid_messages_stars;
            }
            if (O0 != null) {
                return O0.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public final TL_account.RequirementToContact P2(long j3) {
        if (!getUserConfig().q() && getUserConfig().e() != j3) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.f25846j8.f(j3);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (c22 == null || c22.contact_require_premium || c22.send_paid_messages_stars != 0) {
                TLRPC.UserFull d2 = d2(j3);
                if (d2 != null) {
                    return p10.p(d2);
                }
                q1(j3);
                this.f25855k8.add(Long.valueOf(j3));
                sj sjVar = this.f25863l8;
                g0.r(sjVar);
                g0.h3(sjVar, 60L);
            }
        }
        return null;
    }

    public final void P3(long j3, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        a0.h hVar = new a0.h(tL_channels_channelParticipants.participants.size());
        for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
            hVar.k(channelParticipant, gj.B1(channelParticipant.peer));
        }
        ur messagesStorage = getMessagesStorage();
        messagesStorage.f27214a.c(new d4(messagesStorage, j3, hVar, 24));
        g0.g3(new qg(this, j3, hVar, false));
    }

    public final void P4(int i7, long j3) {
        SharedPreferences.Editor edit = this.h7.edit();
        edit.putInt("chatPendingRequests" + j3, i7).apply();
    }

    public final void Q() {
        i5 contactsController = getContactsController();
        contactsController.Z.clear();
        contactsController.f24560a0.clear();
        contactsController.f24562b0.clear();
        contactsController.f24569f0.clear();
        contactsController.f24570g0.clear();
        contactsController.f24571h0.clear();
        contactsController.f24573j0.clear();
        contactsController.f24572i0.clear();
        contactsController.f24574k0.clear();
        contactsController.f24581x.clear();
        contactsController.f24575l0.clear();
        contactsController.m0.clear();
        contactsController.f24564c0.clear();
        contactsController.f24565d0.clear();
        contactsController.f24567e0.clear();
        contactsController.f24561b = false;
        contactsController.f24566e = false;
        contactsController.f24576n = false;
        contactsController.h = false;
        contactsController.f24578r = false;
        contactsController.f24580w = "";
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
        Utilities.f22774e.c(new m4(contactsController, 4));
        MediaController.B().o();
        ys notificationsController = getNotificationsController();
        notificationsController.f28158w.clear();
        notificationsController.f28159x.clear();
        notificationsController.R = false;
        ys.f28133l0.c(new ms(notificationsController, 4));
        az sendMessagesHelper = getSendMessagesHelper();
        sendMessagesHelper.f22968a.clear();
        sendMessagesHelper.f22969b.clear();
        sendMessagesHelper.f22970c.clear();
        sendMessagesHelper.d.clear();
        sendMessagesHelper.f22972f.b();
        sendMessagesHelper.f22971e.clear();
        sendMessagesHelper.h.b();
        sendMessagesHelper.f22973n.clear();
        sendMessagesHelper.f22974r.clear();
        sendMessagesHelper.f22976w.clear();
        sendMessagesHelper.f22978y.clear();
        sendMessagesHelper.E.b();
        sendMessagesHelper.F.clear();
        sendMessagesHelper.G.clear();
        sendMessagesHelper.H.p();
        yv secretChatHelper = getSecretChatHelper();
        secretChatHelper.f28183a.clear();
        secretChatHelper.f28186e.clear();
        secretChatHelper.f28184b.clear();
        secretChatHelper.f28185c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f28187f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.f28188n = false;
        rd locationController = getLocationController();
        locationController.J.clear();
        locationController.K.b();
        locationController.f26556c.b();
        locationController.H.b();
        locationController.d.b();
        rd.s();
        Utilities.d.c(new id(locationController, 2));
        si mediaDataController = getMediaDataController();
        int i7 = 0;
        while (true) {
            ArrayList[] arrayListArr = mediaDataController.f26791g0;
            if (i7 >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i7];
            if (arrayList != null) {
                arrayList.clear();
            }
            mediaDataController.f26793h0[i7] = false;
            mediaDataController.f26795i0[i7] = false;
            i7++;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            mediaDataController.Y[i10] = 0;
            mediaDataController.Z[i10] = 0;
            mediaDataController.H[i10].clear();
            mediaDataController.W[i10] = false;
            mediaDataController.X[i10] = false;
        }
        mediaDataController.f26810q1.b();
        int[] iArr = mediaDataController.f26812r0;
        iArr[0] = 0;
        long[] jArr = mediaDataController.f26809q0;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        mediaDataController.f26786e0.clear();
        mediaDataController.f26789f0.clear();
        mediaDataController.f26783d0.b();
        mediaDataController.f26819u0[0].b();
        mediaDataController.f26817t0[0].clear();
        mediaDataController.f26819u0[1].b();
        mediaDataController.f26817t0[1].clear();
        mediaDataController.f26821v0[0].clear();
        mediaDataController.f26821v0[1].clear();
        mediaDataController.f26797j0.clear();
        mediaDataController.J.b();
        mediaDataController.K.b();
        mediaDataController.O.clear();
        mediaDataController.R.clear();
        mediaDataController.S.b();
        mediaDataController.T.clear();
        boolean[] zArr = mediaDataController.f26827x0;
        zArr[0] = false;
        boolean[] zArr2 = mediaDataController.f26830y0;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        mediaDataController.f26799k0 = false;
        mediaDataController.f26801l0 = false;
        mediaDataController.C1.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.f22774e.c(new j2(11));
        }
        mediaDataController.f26778b0.clear();
        mediaDataController.f26806o1 = false;
        mediaDataController.n1 = false;
        mediaDataController.f26798j1.clear();
        mediaDataController.f26800k1.clear();
        mediaDataController.l1.clear();
        mediaDataController.f26802m1.clear();
        g0.g3(new fg(mediaDataController, 6));
        mediaDataController.f26820u1.b();
        mediaDataController.f26822v1.b();
        mediaDataController.f26825w1.edit().clear().apply();
        mediaDataController.f26813r1.b();
        mediaDataController.k().edit().clear().apply();
        mediaDataController.f26831y1.clear();
        mediaDataController.A1.clear();
        mediaDataController.B1.b();
        getColorPalette().a();
        this.f25950v7.i();
        I1().a();
        org.telegram.ui.Wallet.u0 u0Var = org.telegram.ui.Wallet.u0.R[this.currentAccount];
        if (u0Var != null) {
            org.telegram.ui.Wallet.z0.A(u0Var.M);
            u0Var.J.clear();
            u0Var.Q.clear();
            WalletEngine2 walletEngine2 = u0Var.f45094b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                u0Var.f45094b = null;
                u0Var.d = null;
            }
            org.telegram.ui.Wallet.l0 l0Var = u0Var.f45105o;
            if (l0Var != null) {
                l0Var.c();
            }
            int i11 = u0Var.f45093a;
            if (u0Var.C >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(u0Var.C, true);
                u0Var.C = -1;
            }
            if (u0Var.D >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(u0Var.D, true);
                u0Var.D = -1;
            }
            if (u0Var.E >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(u0Var.E, true);
                u0Var.E = -1;
            }
            u0Var.q0();
            u0Var.G.clear();
            org.telegram.ui.Wallet.i1 i1Var = u0Var.f45110t;
            if (i1Var != null) {
                i1Var.h();
                u0Var.f45110t = null;
            }
            g0.r(u0Var.H);
            g0.r(u0Var.I);
            synchronized (org.telegram.ui.Wallet.u0.class) {
                try {
                    if (org.telegram.ui.Wallet.u0.R[u0Var.f45093a] == u0Var) {
                        org.telegram.ui.Wallet.u0.R[u0Var.f45093a] = null;
                    }
                } finally {
                }
            }
        }
        fi.p6 p6Var = this.f25831i0;
        if (p6Var != null) {
            p6Var.q();
        }
        h10 h10Var = this.f25847k0;
        if (h10Var != null) {
            h10Var.a();
        }
        this.M3 = false;
        org.telegram.ui.cx.D4[this.currentAccount] = false;
        this.f25821g7.edit().clear().commit();
        this.i7.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        f3.d(this.h7.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = t0.f26895b.getSharedPreferences("shortcut_widget", 0);
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
                    appWidgetManager = AppWidgetManager.getInstance(t0.f26895b);
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
                ChatsWidgetProvider.a(t0.f26895b, appWidgetManager, ((Integer) arrayList2.get(i12)).intValue());
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ContactsWidgetProvider.a(t0.f26895b, appWidgetManager, ((Integer) arrayList3.get(i13)).intValue());
            }
        }
        this.M1.b();
        this.N1.b();
        this.O1.b();
        this.P1.b();
        this.Q1.b();
        this.G1.clear();
        this.H1.b();
        this.I1.clear();
        this.J1.b();
        this.K1.clear();
        this.L1.b();
        this.D1.b();
        this.E1.b();
        this.F1.b();
        this.R.b();
        this.P.clear();
        this.f25910r2.clear();
        this.Q.clear();
        this.f25907r.b();
        this.l1.b();
        this.f25864m1.b();
        this.h.clear();
        this.f25954w1.clear();
        this.f25882o1.b();
        this.f25952w.clear();
        this.f25962x.b();
        this.Y7.clear();
        this.X7.clear();
        this.f25765a8.b();
        this.Z7.clear();
        this.f25872n.clear();
        this.C1.clear();
        this.K0.b();
        this.L0.b();
        this.M0 = 0;
        this.F.clear();
        this.E.clear();
        this.H7.clear();
        this.G7.clear();
        this.f25972y.clear();
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
        this.A1.b();
        this.B1.clear();
        this.d.clear();
        this.f25794e.clear();
        this.V2 = null;
        this.f25846j8.b();
        this.f25855k8.clear();
        this.f25766b.clear();
        this.S.b();
        this.U.clear();
        this.W.clear();
        this.X.b();
        this.Y.b();
        this.f25757a0.clear();
        this.f25934u0.b();
        this.E0.b();
        this.F0.b();
        this.f25777c0 = 0;
        so[] soVarArr = this.N;
        soVarArr[1] = null;
        soVarArr[0] = null;
        this.Q0.clear();
        this.T0.clear();
        this.U0 = false;
        this.W0.clear();
        this.V0 = false;
        this.f25845j7 = false;
        Utilities.d.c(new rn(this, 4));
        this.f25963x0.clear();
        this.f25973y0.clear();
        this.f25982z0.clear();
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
        this.f25909r1.clear();
        this.f25919s1.clear();
        this.f25927t1.clear();
        this.R1.b();
        this.f25944v1.clear();
        this.f25964x1.clear();
        this.f25974y1.clear();
        this.f25983z1.clear();
        this.f25769b2 = false;
        this.f25779c2.clear();
        this.d2.clear();
        this.f25797e2.clear();
        this.f25807f2.clear();
        this.H2 = false;
        this.I2 = 0;
        this.f25955w2 = 0;
        this.f25965x2 = false;
        this.f25816g2 = false;
        this.X1 = 0;
        this.Y1 = null;
        this.Z1 = null;
        this.W1 = false;
        this.G0 = false;
        this.I0 = -1;
        this.J0 = false;
        this.f25857l2 = false;
        this.f25849k2 = false;
        this.f25883o2 = false;
        this.M2 = 0L;
        this.P2 = false;
        this.f25865m2 = false;
        this.f25841j2 = true;
        this.Q2 = null;
        this.T2 = null;
        this.U2 = null;
        this.S2.clear();
        this.f25768b1.b();
        this.N2 = 0;
        this.O2 = 0;
        Utilities.d.c(new rn(this, 5));
        if (this.f25759a2 != null) {
            Utilities.d.a(this.f25759a2);
            this.f25759a2 = null;
        }
        k();
        g0.g3(new rn(this, 6));
    }

    public final int Q0(long j3) {
        TLRPC.ChatFull P0 = u1(this.currentAccount).P0(-j3);
        if (P0 != null && (!(P0 instanceof TLRPC.TL_chatFull) ? (P0.flags2 & 8192) != 0 : (P0.flags & 1048576) != 0)) {
            return P0.reactions_limit;
        }
        return this.N5;
    }

    public final jp Q1(long j3) {
        a0.h hVar = this.D1;
        jp jpVar = (jp) hVar.f(j3);
        if (jpVar != null && (jpVar.d || Math.abs(SystemClock.elapsedRealtime() - jpVar.f24862c) <= 300000)) {
            return jpVar;
        }
        if (j3 >= 0 ? !p10.u(c2(Long.valueOf(j3))) : !v3.T(O0(Long.valueOf(-j3)))) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        hVar.k(obj, j3);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = l1(j3);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new ho(this, j3, (Object) obj, 0));
        return null;
    }

    public final void Q3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i7, final int i10, final int i11, final int i12, final boolean z10, final boolean z11, final boolean z12) {
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xl.run():void");
            }
        });
    }

    public final void Q4(boolean z10) {
        TL_account.contentSettings contentsettings = this.f25925s8;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            }
            contentsettings.sensitive_enabled = z10;
        }
        if (this.F4 == null) {
            this.F4 = new HashSet();
        }
        if (z10) {
            this.F4.add("sensitive");
        } else {
            this.F4.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.h7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.F4).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z10;
        getConnectionsManager().sendRequest(setcontentsettings, new fi.k5(12));
    }

    public final void R(fp fpVar) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (fpVar.f23921b != 0 && fpVar.f23922c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) fpVar.f23921b;
            tL_messages_readDiscussion.peer = l1(fpVar.f23920a);
            tL_messages_readDiscussion.read_max_id = fpVar.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new fi.k5(13));
        } else if (!n5.C(fpVar.f23920a)) {
            TLRPC.InputPeer l1 = l1(fpVar.f23920a);
            if (fpVar.f23922c != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = l1(fpVar.f23920a);
                tL_messages_readSavedHistory.peer = l1(fpVar.f23922c);
                tL_messages_readSavedHistory.max_id = fpVar.d;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (l1 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = j1(-fpVar.f23920a);
                tL_channels_readHistory.max_id = fpVar.d;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = l1;
                tL_messages_readHistory2.max_id = fpVar.d;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new nj(this, 1));
        } else {
            TLRPC.EncryptedChat c12 = c1(Integer.valueOf((int) (fpVar.f23920a & 4294967295L)));
            byte[] bArr = c12.auth_key;
            if (bArr != null && bArr.length > 1 && (c12 instanceof TLRPC.TL_encryptedChat)) {
                TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = c12.f28406id;
                tL_inputEncryptedChat.access_hash = c12.access_hash;
                tL_messages_readEncryptedHistory.max_date = fpVar.f23923e;
                getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new fi.k5(13));
            }
        }
    }

    public final qo R0(long j3) {
        LongSparseArray longSparseArray = this.f25971x8;
        qo qoVar = (qo) longSparseArray.get(j3);
        if (qoVar == null) {
            qo qoVar2 = new qo(this.currentAccount, j3);
            longSparseArray.put(j3, qoVar2);
            return qoVar2;
        }
        return qoVar;
    }

    public final fi.p6 R1() {
        fi.p6 p6Var = this.f25831i0;
        if (p6Var != null) {
            return p6Var;
        }
        synchronized (L8[this.currentAccount]) {
            try {
                fi.p6 p6Var2 = this.f25831i0;
                if (p6Var2 != null) {
                    return p6Var2;
                }
                fi.p6 p6Var3 = new fi.p6(this.currentAccount);
                this.f25831i0 = p6Var3;
                return p6Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean R2(boolean z10) {
        ArrayList<TL_account.WebDomainException> arrayList;
        int i7;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
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
            i7 = 5;
        } else {
            i7 = 100;
        }
        if (size < i7) {
            return false;
        }
        return true;
    }

    public final void R3(final org.telegram.tgnet.TLRPC.messages_Messages r50, final int r51, long r52, final long r54, final int r56, final int r57, final int r58, final boolean r59, final int r60, final int r61, final int r62, final int r63, final int r64, final int r65, final boolean r66, final int r67, long r68, final int r70, final boolean r71, final int r72, final boolean r73, final boolean r74, final org.telegram.messenger.uz r75) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.R3(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.uz):void");
    }

    public final void R4(final long j3, int i7, ArrayList arrayList, int i10, Boolean bool, final ch.i iVar, final ch.h hVar) {
        final TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = l1(-j3);
        if (i7 != 2 && !arrayList.isEmpty()) {
            if (i7 == 0) {
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
                np npVar = np.this;
                npVar.getClass();
                if (tLObject != null) {
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    long j10 = j3;
                    TLRPC.ChatFull P0 = npVar.P0(j10);
                    if (P0 != null) {
                        if (P0 instanceof TLRPC.TL_chatFull) {
                            P0.flags |= 262144;
                        }
                        if (P0 instanceof TLRPC.TL_channelFull) {
                            P0.flags |= 1073741824;
                        }
                        P0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        npVar.getMessagesStorage().N1(P0, false);
                    }
                    g0.g3(new sm(npVar, hVar, j10));
                    return;
                }
                g0.g3(new gi(22, iVar, tL_error));
            }
        });
        TLRPC.ChatFull P0 = P0(j3);
        if (P0 != null) {
            if (P0 instanceof TLRPC.TL_channelFull) {
                P0.flags2 |= 8192;
            } else {
                P0.flags |= 1048576;
            }
            P0.reactions_limit = i10;
            if (bool != null) {
                P0.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().N1(P0, false);
        }
    }

    public final void S(Activity activity, TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var, mr mrVar) {
        org.telegram.ui.ActionBar.t1 t1Var;
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = k1(chat);
        if (activity != null) {
            t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        } else {
            t1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new tn(this, activity, t1Var, mrVar, g2Var, tL_channels_convertToGigagroup, 0));
        if (t1Var != null) {
            t1Var.setOnCancelListener(new bm(this, sendRequest, 1));
            try {
                t1Var.r(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final kp S0(long j3) {
        TLRPC.Chat O0;
        ?? obj = new Object();
        ArrayList arrayList = (ArrayList) this.f25962x.f(j3);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
                long j10 = dialog.f28402id;
                boolean z10 = true;
                if (j10 < 0 && (O0 = O0(Long.valueOf(-j10))) != null && (O0.forum || (O0.monoforum && v3.A(this.currentAccount, O0, 24)))) {
                    u1(this.currentAccount).f25932t7.h(O0.f28398id);
                    int i10 = obj.f25081a;
                    int[] iArr = f00.f23770w;
                    int i11 = iArr[0];
                    obj.f25081a = i10 + i11;
                    obj.f25082b += iArr[1];
                    obj.f25083c += iArr[2];
                    obj.d += iArr[4];
                    boolean z11 = obj.f25084e;
                    if (!z11 && i11 > 0) {
                        if (iArr[3] == 0) {
                            z10 = false;
                        }
                        obj.f25084e = z11 | z10;
                    }
                } else {
                    int i12 = obj.f25081a;
                    int i13 = dialog.unread_count;
                    obj.f25081a = i12 + i13;
                    obj.f25082b += dialog.unread_mentions_count;
                    obj.f25083c += dialog.unread_reactions_count;
                    obj.d += dialog.unread_poll_votes_count;
                    boolean z12 = obj.f25084e;
                    if (!z12 && i13 > 0) {
                        obj.f25084e = (!u2(dialog.f28402id, 0L, null)) | z12;
                    }
                }
            }
        }
        return obj;
    }

    public final boolean S2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
        if (tL_webBrowserSettings != null && !tL_webBrowserSettings.open_external_browser) {
            return true;
        }
        return false;
    }

    public final void S3(int i7, int i10, long j3) {
        if (s2.f26694a) {
            i5.c.v(j3, i5.c.n("processNewChannelDifferenceParams pts = ", i7, " pts_count = ", i10, " channeldId = "));
        }
        LongSparseIntArray longSparseIntArray = this.Z0;
        int i11 = longSparseIntArray.get(j3);
        if (i11 == 0) {
            i11 = getMessagesStorage().N(j3);
            if (i11 == 0) {
                i11 = 1;
            }
            longSparseIntArray.put(j3, i11);
        }
        if (i11 + i10 == i7) {
            if (s2.f26694a) {
                a8.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j3, i7);
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new wp(messagesStorage, i7, j3, 5));
        } else if (i11 != i7) {
            LongSparseLongArray longSparseLongArray = this.Y0;
            long j10 = longSparseLongArray.get(j3);
            if (!((Boolean) this.f25758a1.g(Boolean.FALSE, j3)).booleanValue() && j10 != 0 && Math.abs(System.currentTimeMillis() - j10) > 1500) {
                K0(j3);
                return;
            }
            if (s2.f26694a) {
                a8.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i7 + " pts_count = " + i10);
            }
            if (j10 == 0) {
                longSparseLongArray.put(j3, System.currentTimeMillis());
            }
            TLRPC.Updates updates = new TLRPC.Updates();
            updates.pts = i7;
            updates.pts_count = i10;
            updates.chat_id = j3;
            a0.h hVar = this.X0;
            ArrayList arrayList = (ArrayList) hVar.f(j3);
            if (arrayList == null) {
                arrayList = f3.h(hVar, j3);
            }
            arrayList.add(updates);
        }
    }

    public final void S4(final long j3, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z10, final org.telegram.ui.ActionBar.g2 g2Var) {
        if (tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = l1(-j3);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new d3.b(1), new r10() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                np npVar = np.this;
                if (tL_error == null) {
                    npVar.getClass();
                    g0.h3(new jk(npVar, j3, 20), 1000L);
                    return;
                }
                org.telegram.ui.Components.c5.c0(npVar.currentAccount, tL_error, g2Var, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z10));
            }
        });
    }

    public final void T(Context context, long j3, org.telegram.ui.ActionBar.g2 g2Var, pr prVar, org.telegram.ui.ci ciVar) {
        org.telegram.ui.ActionBar.t1 t1Var;
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j3;
        if (context != null) {
            t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        } else {
            t1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new di.s6(this, context, t1Var, prVar, j3, ciVar, g2Var, tL_messages_migrateChat));
        if (t1Var != null) {
            t1Var.setOnCancelListener(new bm(this, sendRequest, 0));
            try {
                t1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void T0(y10 y10Var) {
        if (this.f25925s8 != null && System.currentTimeMillis() - this.f25916r8 < 3600000) {
            if (y10Var != null) {
                y10Var.a(this.f25925s8);
                return;
            }
            return;
        }
        if (this.f25906q8 == null) {
            this.f25906q8 = new ArrayList();
        }
        if (y10Var != null) {
            this.f25906q8.add(y10Var);
        }
        if (this.f25897p8) {
            return;
        }
        this.f25897p8 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new nj(this, 25));
    }

    public final e T1() {
        if (this.f25960w7 == null) {
            this.f25960w7 = new e(this.currentAccount);
        }
        return this.f25960w7;
    }

    public final boolean T2(String str) {
        boolean j22;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
        if (tL_webBrowserSettings != null && str != null) {
            String K0 = g0.K0(str, false);
            if (K0 == null) {
                K0 = g0.K0("//".concat(str), false);
            }
            if (tL_webBrowserSettings.open_external_browser) {
                j22 = !j2(K0, tL_webBrowserSettings.inapp_exceptions);
            } else {
                j22 = j2(K0, tL_webBrowserSettings.external_exceptions);
            }
            if (!j22) {
                return true;
            }
        }
        return false;
    }

    public final void T3(int i7, int i10, int i11) {
        if (s2.f26694a) {
            i5.c.t(i11, i5.c.n("processNewDifferenceParams seq = -1 pts = ", i7, " date = ", i10, " pts_count = "));
        }
        if (i7 != -1) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.H();
            if (messagesStorage.f27225r + i11 == i7) {
                if (s2.f26694a) {
                    a8.b("APPLY PTS");
                }
                getMessagesStorage().I1(i7);
                ur messagesStorage2 = getMessagesStorage();
                ur messagesStorage3 = getMessagesStorage();
                messagesStorage3.H();
                int i12 = messagesStorage3.f27227w;
                ur messagesStorage4 = getMessagesStorage();
                messagesStorage4.H();
                int i13 = messagesStorage4.f27225r;
                ur messagesStorage5 = getMessagesStorage();
                messagesStorage5.H();
                int i14 = messagesStorage5.f27224n;
                ur messagesStorage6 = getMessagesStorage();
                messagesStorage6.H();
                messagesStorage2.A1(i12, i13, i14, messagesStorage6.f27226s);
                return;
            }
            ur messagesStorage7 = getMessagesStorage();
            messagesStorage7.H();
            if (messagesStorage7.f27225r != i7) {
                if (!this.f25833i2 && this.f25840j1 != 0 && Math.abs(System.currentTimeMillis() - this.f25840j1) > 1500) {
                    Z0();
                    return;
                }
                if (s2.f26694a) {
                    a8.b("ADD UPDATE TO QUEUE pts = " + i7 + " pts_count = " + i11);
                }
                if (this.f25840j1 == 0) {
                    this.f25840j1 = System.currentTimeMillis();
                }
                TLRPC.Updates updates = new TLRPC.Updates();
                updates.pts = i7;
                updates.pts_count = i11;
                this.f25815g1.add(updates);
            }
        }
    }

    public final void T4(int i7, long j3) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = l1(j3);
        tL_messages_setHistoryTTL.period = i7;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new nj(this, 2));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j3);
        if (dialog != null) {
            dialog.ttl_period = i7;
        }
        ur messagesStorage = getMessagesStorage();
        messagesStorage.f27214a.c(new wp(messagesStorage, i7, j3, 0));
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.ChatFull chatFull = null;
        if (i10 > 0) {
            userFull = d2(j3);
            if (userFull != null) {
                userFull.ttl_period = i7;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull P0 = P0(-j3);
            if (P0 != null) {
                P0.ttl_period = i7;
                if (P0 instanceof TLRPC.TL_channelFull) {
                    P0.flags |= 16777216;
                } else {
                    P0.flags |= 16384;
                }
            }
            chatFull = P0;
            userFull = null;
        }
        if (chatFull != null) {
            ls notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(ls.T, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(ls.E0, Long.valueOf(j3), userFull);
        }
    }

    public final int U(String str, ArrayList arrayList, String str2, int i7, boolean z10, Location location, String str3, int i10, org.telegram.ui.ActionBar.g2 g2Var) {
        boolean z11 = false;
        if (i7 == 0 && !z10) {
            TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i10 >= 0) {
                tL_messages_createChat.ttl_period = i10;
                tL_messages_createChat.flags |= 1;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.User c22 = c2((Long) arrayList.get(i11));
                if (c22 != null) {
                    tL_messages_createChat.users.add(s1(c22));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new di(this, g2Var, tL_messages_createChat, 3), 2);
        } else if (!z10 && i7 != 2 && i7 != 4 && i7 != 5) {
            return 0;
        } else {
            TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
            tL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tL_channels_createChannel.about = str2;
            tL_channels_createChannel.for_import = z10;
            if (!z10 && i7 != 4 && i7 != 5) {
                tL_channels_createChannel.broadcast = true;
            } else {
                tL_channels_createChannel.megagroup = true;
            }
            if (i7 == 5) {
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
            return getConnectionsManager().sendRequest(tL_channels_createChannel, new di(this, g2Var, tL_channels_createChannel, 4), 2);
        }
    }

    public final TLRPC.Dialog U0(long j3) {
        return (TLRPC.Dialog) this.R.f(j3);
    }

    public final f00 U1() {
        return this.f25932t7;
    }

    public final boolean U2() {
        if (!S2()) {
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
            if (tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean U3(java.util.ArrayList r89, final java.util.ArrayList r90, final java.util.ArrayList r91, boolean r92, final int r93) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.U3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void U4(so soVar, boolean z10) {
        if (soVar != null) {
            Integer valueOf = Integer.valueOf(soVar.f26850a);
            HashSet hashSet = this.F7;
            if (z10 != hashSet.contains(valueOf)) {
                if (z10) {
                    hashSet.add(Integer.valueOf(soVar.f26850a));
                } else {
                    hashSet.remove(Integer.valueOf(soVar.f26850a));
                }
                I4();
                f5(null);
                getNotificationCenter().k(ls.P2, Integer.valueOf(soVar.f26850a));
            }
        }
    }

    public final long V(int i7, long j3) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2 = null;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            nativeByteBuffer.writeInt32(102);
            nativeByteBuffer.writeInt64(j3);
            nativeByteBuffer.writeInt32(i7);
        } catch (Exception e11) {
            e = e11;
            nativeByteBuffer2 = nativeByteBuffer;
            a8.g(e, true);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().z(nativeByteBuffer);
        }
        return getMessagesStorage().z(nativeByteBuffer);
    }

    public final ArrayList V0() {
        ArrayList arrayList = this.R0;
        if (arrayList != null) {
            return arrayList;
        }
        return this.Q0;
    }

    public final a10 V1() {
        return this.f25950v7;
    }

    public final void V2(int r65, java.util.ArrayList r66, java.util.ArrayList r67, java.util.ArrayList r68, java.util.ArrayList r69, a0.h r70, int r71, org.telegram.messenger.support.LongSparseIntArray r72, a0.h r73, a0.h r74, java.util.ArrayList r75, a0.h r76, a0.h r77, bg.w r78, a0.h r79, boolean r80, java.util.ArrayList r81, java.util.ArrayList r82, a0.h r83, a0.h r84, a0.h r85, java.util.ArrayList r86) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.V2(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, a0.h, int, org.telegram.messenger.support.LongSparseIntArray, a0.h, a0.h, java.util.ArrayList, a0.h, a0.h, bg.w, a0.h, boolean, java.util.ArrayList, java.util.ArrayList, a0.h, a0.h, a0.h, java.util.ArrayList):void");
    }

    public final void V3(org.telegram.tgnet.TLRPC.Updates r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.V3(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public final void V4(long j3, long j10) {
        this.h7.edit().putLong(a8.p0.o(j3, "forumlasttopic"), j10).apply();
    }

    public final void W(long j3, long j10) {
        ur messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new vq(messagesStorage, 0, j3, j10, 1));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = l1(j3);
        tL_messages_deleteParticipantReactions.participant = l1(j10);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new jh.b(3));
    }

    public final vo W0(long j3) {
        a0.h hVar = this.R7;
        vo voVar = (vo) hVar.f(j3);
        if (voVar == null) {
            vo voVar2 = new vo(this, j3);
            hVar.k(voVar2, j3);
            return voVar2;
        }
        return voVar;
    }

    public final h10 W1() {
        h10 h10Var = this.f25847k0;
        if (h10Var != null) {
            return h10Var;
        }
        synchronized (L8[this.currentAccount]) {
            try {
                h10 h10Var2 = this.f25847k0;
                if (h10Var2 != null) {
                    return h10Var2;
                }
                h10 h10Var3 = new h10(this.currentAccount);
                this.f25847k0 = h10Var3;
                return h10Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int W2(final long j3, final long j10, final boolean z10, boolean z11, final r10 r10Var) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = j1(j10);
        tL_communities_togglePeerLink.peer = l1(j3);
        tL_communities_togglePeerLink.deleted = z10;
        tL_communities_togglePeerLink.visible = !z11;
        tL_communities_togglePeerLink.hidden = z11;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new d3.b(1), new r10() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat O0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                np npVar = np.this;
                long j11 = j3;
                r10 r10Var2 = r10Var;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (O0 = npVar.O0(Long.valueOf(-j11))) != null) {
                    npVar.W2(j11, O0.linked_community_id, true, false, r10Var2);
                    return;
                }
                boolean z12 = bool instanceof TLRPC.TL_boolTrue;
                long j12 = j10;
                if (z12) {
                    long j13 = 0;
                    int i7 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    boolean z13 = z10;
                    if (i7 > 0) {
                        TLRPC.User c22 = npVar.c2(Long.valueOf(j11));
                        if (c22 != null) {
                            if (!z13) {
                                j13 = j12;
                            }
                            c22.linked_community_id = j13;
                            c22.flags2 = c8.ed.b(c22.flags2, 2097152, !z13);
                        }
                    } else {
                        TLRPC.Chat O02 = npVar.O0(Long.valueOf(-j11));
                        if (O02 != null) {
                            if (!z13) {
                                j13 = j12;
                            }
                            O02.linked_community_id = j13;
                            O02.flags2 = c8.ed.b(O02.flags2, 1048576, !z13);
                        }
                    }
                }
                npVar.b3(0, j12, true);
                r10Var2.a(bool, tL_error);
            }
        });
    }

    public final void W3(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.W3(int, int):void");
    }

    public final void W4(long j3, boolean z10, boolean z11) {
        if (!z10) {
            ArrayList arrayList = this.f25963x0;
            if (z11) {
                if (arrayList.contains(Long.valueOf(j3))) {
                    return;
                }
                arrayList.add(Long.valueOf(j3));
            } else {
                arrayList.remove(Long.valueOf(j3));
                SparseArray sparseArray = (SparseArray) this.L0.f(j3);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((gj) sparseArray.valueAt(i7)).f24220v0 = false;
                    }
                }
            }
        }
        Utilities.d.c(new li.m(this, z10, z11, j3, 2));
    }

    public final void X(int i7, long j3, boolean z10) {
        Y(j3, 1, i7, 0, z10, null, 0L);
    }

    public final int X0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i7 = dialog.unread_count;
        TLRPC.Chat O0 = O0(Long.valueOf(-dialog.f28402id));
        if (O0 != null && (O0.forum || O0.monoforum)) {
            this.f25932t7.h(-dialog.f28402id);
            return f00.f23770w[0];
        }
        return i7;
    }

    public final void X2(boolean z10) {
        g0.r(this.O7);
        ko koVar = this.W2;
        if (z10) {
            koVar.d(this.currentAccount, 0);
        }
        koVar.c(this.currentAccount, 0, new bo(this, 1));
    }

    public final void X3(TLRPC.Chat chat, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (chat != null) {
            Long valueOf = Long.valueOf(chat.f28398id);
            ConcurrentHashMap concurrentHashMap = this.f25766b;
            TLRPC.Chat chat2 = (TLRPC.Chat) concurrentHashMap.get(valueOf);
            if (chat2 != chat) {
                ConcurrentHashMap concurrentHashMap2 = this.f25794e;
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
                v5(-chat.f28398id, chat.emoji_status);
                if (chat2 != null && chat2.access_hash == 0) {
                    long j3 = chat.fromMessageDialogId;
                    if (j3 != 0 && (i13 = chat.fromMessageId) != 0) {
                        chat2.fromMessageDialogId = j3;
                        chat2.fromMessageId = i13;
                    }
                }
                if (chat.min) {
                    if (chat2 != null) {
                        if (!z10) {
                            LruCache lruCache = f2().f25682b;
                            String str = chat2.username;
                            if (str != null && !TextUtils.equals(str, chat.username)) {
                                lruCache.remove(chat2.username);
                                String str2 = chat.username;
                                if (str2 != null) {
                                    lruCache.put(str2, new m10(-chat.f28398id));
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
                                getNotificationCenter().k(ls.f25361u5, Long.valueOf(chat.f28398id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                            }
                        }
                    } else {
                        concurrentHashMap.put(Long.valueOf(chat.f28398id), chat);
                        i(chat);
                    }
                } else {
                    if (!z10) {
                        if (chat2 != null) {
                            if (chat.version != chat2.version) {
                                this.f25983z1.delete(chat.f28398id);
                            }
                            int i17 = chat2.participants_count;
                            if (i17 != 0 && chat.participants_count == 0) {
                                chat.participants_count = i17;
                                chat.flags |= 131072;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat2.banned_rights;
                            if (tL_chatBannedRights3 != null) {
                                i7 = tL_chatBannedRights3.flags;
                            } else {
                                i7 = 0;
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
                            if (i7 != i10 || i11 != i12) {
                                g0.g3(new pj(this, chat, 3));
                            }
                        }
                        concurrentHashMap.put(Long.valueOf(chat.f28398id), chat);
                    } else if (chat2 == null) {
                        concurrentHashMap.put(Long.valueOf(chat.f28398id), chat);
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
                        concurrentHashMap.put(Long.valueOf(chat.f28398id), chat);
                    }
                    i(chat);
                }
                if (chat2 != null && chat2.forum != chat.forum) {
                    g0.g3(new pj(this, chat, 4));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    g0.g3(new pj(this, chat, 5));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j10 = chat.f28398id;
                    if (P0(j10) == null) {
                        getMessagesStorage().F0(j10, false, null, false, false, 0);
                        b3(0, j10, false);
                    }
                }
            }
        }
    }

    public final void X4(long j3, boolean z10, boolean z11) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.f25982z0;
        } else {
            arrayList = this.f25973y0;
        }
        if (z11) {
            if (arrayList.contains(Long.valueOf(j3))) {
                return;
            }
            arrayList.add(Long.valueOf(j3));
            return;
        }
        arrayList.remove(Long.valueOf(j3));
    }

    public final void Y(long r34, int r36, int r37, int r38, boolean r39, org.telegram.tgnet.TLRPC.InputPeer r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.Y(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public final ArrayList Y0(int i7) {
        ArrayList arrayList = (ArrayList) this.f25952w.get(i7);
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final void Y2(long j3, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.B1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j3) < 60) {
            return;
        }
        longSparseIntArray.put(j3, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z10) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new qp(messagesStorage, j3, 7));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = j1(j3);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new mj(this, j3, 2));
    }

    public final void Y3(TLRPC.ChatFull chatFull) {
        this.f25864m1.k(chatFull, chatFull.f28399id);
        this.f25950v7.M(-chatFull.f28399id);
    }

    public final void Y4(final long j3, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z10, final org.telegram.ui.ActionBar.g2 g2Var, final org.telegram.ui.k9 k9Var) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = j1(j3);
        if (user != null) {
            tL_channels_editBanned.participant = p1(user);
        } else {
            tL_channels_editBanned.participant = n1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                np npVar = np.this;
                if (tL_error == null) {
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new jk(npVar, j3, 18), 1000L);
                    Runnable runnable = k9Var;
                    if (runnable != null) {
                        g0.g3(runnable);
                        return;
                    }
                    return;
                }
                g0.g3(new jn((c1) npVar, (Object) tL_error, (Object) g2Var, (Object) tL_channels_editBanned, z10, 0));
            }
        });
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j3, int i7, boolean z10, int i10) {
        a0(arrayList, arrayList2, encryptedChat, j3, z10, i10, false, 0L, null, i7);
    }

    public final void Z0() {
        ur messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i7 = messagesStorage.f27225r;
        ur messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i10 = messagesStorage2.f27224n;
        ur messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        a1(i7, i10, messagesStorage3.f27226s, false);
    }

    public final void Z2(Long l10, hi.d8 d8Var, int i7) {
        HashSet hashSet = this.f25964x1;
        if (d8Var == null && (hashSet.contains(l10) || this.f25974y1.contains(l10))) {
            return;
        }
        hashSet.add(l10);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l10.getClass();
        tL_channels_getParticipants.channel = k1(O0(l10));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i7;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new di(this, l10, d8Var, 2));
    }

    public final void Z3(ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                X3((TLRPC.Chat) arrayList.get(i7), z10);
            }
        }
    }

    public final void Z4(boolean z10) {
        if (this.f25914r6 != z10) {
            SharedPreferences.Editor edit = this.h7.edit();
            this.f25914r6 = z10;
            edit.putBoolean("savedViewAsChats", z10).apply();
        }
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j3, boolean z10, int i7, boolean z11, long j10, TLObject tLObject, int i10) {
        b0(arrayList, arrayList2, encryptedChat, j3, z10, i7, z11, j10, tLObject, i10, false, 0);
    }

    public final void a1(int i7, int i10, int i11, boolean z10) {
        g4(cz.f23368f, cz.f23371g);
        ur messagesStorage = getMessagesStorage();
        messagesStorage.H();
        if (messagesStorage.f27225r == 0) {
            if (!this.f25849k2) {
                this.f25849k2 = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new nj(this, 24));
            }
        } else if (!z10 && this.f25833i2) {
        } else {
            this.f25833i2 = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i7;
            tL_updates_getDifference.date = i10;
            tL_updates_getDifference.qts = i11;
            if (this.f25841j2) {
                tL_updates_getDifference.flags |= 1;
                if (t0.o()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.f25841j2 = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (s2.f26694a) {
                StringBuilder n10 = i5.c.n("start getDifference with date = ", i10, " pts = ", i7, " qts = ");
                n10.append(i11);
                a8.b(n10.toString());
                a8.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new ee(this, i10, i11, 1));
        }
    }

    public final void a3(int i7, int i10, int i11, boolean z10, qk qkVar) {
        long j3;
        int i12;
        a0.h hVar;
        int m10;
        SparseBooleanArray sparseBooleanArray = this.d2;
        if (!sparseBooleanArray.get(i7) && !this.f25883o2) {
            sparseBooleanArray.put(i7, true);
            int i13 = ls.f25342s;
            getNotificationCenter().k(i13, new Object[0]);
            if (s2.f26694a) {
                StringBuilder n10 = i5.c.n("folderId = ", i7, " load cacheOffset = ", i10, " count = ");
                n10.append(i11);
                n10.append(" cache = ");
                n10.append(z10);
                a8.b(n10.toString());
            }
            long[] jArr = null;
            if (z10) {
                ur messagesStorage = getMessagesStorage();
                if (i10 == 0) {
                    i12 = 0;
                } else {
                    i12 = this.f25779c2.get(i7, 0);
                }
                if (i7 == 0 && i10 == 0 && (m10 = (hVar = messagesStorage.getMediaDataController().f26820u1).m()) > 0) {
                    jArr = new long[m10];
                    for (int i14 = 0; i14 < m10; i14++) {
                        if (((a0.h) hVar.n(i14)).f(0L) != null) {
                            jArr[i14] = hVar.j(i14);
                        }
                    }
                }
                messagesStorage.f27214a.c(new hi.s5(messagesStorage, i7, i12, i11, jArr));
                return;
            }
            TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
            tL_messages_getDialogs.limit = i11;
            tL_messages_getDialogs.exclude_pinned = true;
            if (i7 != 0) {
                tL_messages_getDialogs.flags |= 2;
                tL_messages_getDialogs.folder_id = i7;
            }
            long[] g10 = getUserConfig().g(i7);
            long j10 = g10[0];
            if (j10 != -1) {
                if (j10 == 2147483647L) {
                    this.f25797e2.put(i7, true);
                    this.f25807f2.put(i7, true);
                    sparseBooleanArray.put(i7, false);
                    getNotificationCenter().k(i13, new Object[0]);
                    return;
                }
                int i15 = (int) j10;
                tL_messages_getDialogs.offset_id = i15;
                tL_messages_getDialogs.offset_date = (int) g10[1];
                if (i15 == 0) {
                    tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    if (g10[4] != 0) {
                        TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerChannel;
                        tL_inputPeerChannel.channel_id = g10[4];
                    } else if (g10[2] != 0) {
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerUser;
                        tL_inputPeerUser.user_id = g10[2];
                    } else {
                        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                        tL_inputPeerChat.chat_id = g10[3];
                    }
                    tL_messages_getDialogs.offset_peer.access_hash = g10[5];
                }
            } else {
                ArrayList Y0 = Y0(i7);
                int size = Y0.size() - 1;
                while (true) {
                    if (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) Y0.get(size);
                        if (!dialog.pinned && !n5.C(dialog.f28402id) && dialog.top_message > 0) {
                            ArrayList arrayList = (ArrayList) this.S.f(dialog.f28402id);
                            gj gjVar = null;
                            if (arrayList != null) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    gj gjVar2 = (gj) arrayList.get(i16);
                                    if (gjVar2 != null && (gjVar == null || gjVar2.e1() > gjVar.e1())) {
                                        gjVar = (gj) arrayList.get(i16);
                                    }
                                }
                            }
                            if (gjVar != null && gjVar.e1() > 0) {
                                TLRPC.Message message = gjVar.f24177k;
                                tL_messages_getDialogs.offset_date = message.date;
                                tL_messages_getDialogs.offset_id = message.f28419id;
                                TLRPC.Peer peer = message.peer_id;
                                long j11 = peer.channel_id;
                                if (j11 == 0) {
                                    j11 = peer.chat_id;
                                    if (j11 == 0) {
                                        j3 = peer.user_id;
                                        tL_messages_getDialogs.offset_peer = l1(j3);
                                    }
                                }
                                j3 = -j11;
                                tL_messages_getDialogs.offset_peer = l1(j3);
                            }
                        }
                        size--;
                    } else {
                        tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        break;
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_getDialogs, new rf(this, i7, i11, qkVar, 1));
        }
    }

    public final void a4(long j3, TLRPC.DraftMessage draftMessage) {
        a0.h hVar = this.R;
        if (hVar.h(j3) < 0) {
            if (!v3.o0(this.currentAccount, j3) || v3.z(this.currentAccount, 24, j3)) {
                si mediaDataController = getMediaDataController();
                ArrayList arrayList = this.f25972y;
                int size = arrayList.size();
                int i7 = 1;
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < n5.j(dialog, mediaDataController.T(dialog.f28402id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.f28402id = j3;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.f26818t1.g(0, j3)).intValue();
                if (j3 >= 0 || !v3.T(O0(Long.valueOf(-j3)))) {
                    i7 = 0;
                }
                tL_dialog.flags = i7;
                hVar.k(tL_dialog, j3);
                arrayList.add(tL_dialog);
                f5(null);
            }
        }
    }

    public final void a5(int i7, long j3) {
        if (i7 == 0) {
            this.f25832i1 = j3;
        } else if (i7 == 1) {
            this.f25840j1 = j3;
        } else if (i7 == 2) {
            this.f25848k1 = j3;
        }
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j3, boolean z10, int i7, boolean z11, long j10, TLObject tLObject, int i10, boolean z12, int i11) {
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11;
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
        long j12;
        int i16;
        long j13;
        long j14 = j3;
        if (i7 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i17 = 5;
        if (i7 == 5) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (i7 == 9) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((arrayList != null && !arrayList.isEmpty()) || j10 != 0) {
            if (j10 == 0) {
                if (j14 != 0 && n5.z(j14)) {
                    TLRPC.Chat O0 = O0(Long.valueOf(-j14));
                    if (v3.T(O0)) {
                        j13 = O0.f28398id;
                    } else {
                        j13 = 0;
                    }
                    j12 = j13;
                } else {
                    j12 = 0;
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
                    getMessagesStorage().P0(j14, arrayList, true, false, 1, 0);
                    j14 = j3;
                    i12 = i10;
                    i13 = 5;
                } else if (z14) {
                    if (i7 == 5) {
                        kg.w1 f10 = kg.w1.f(this.currentAccount);
                        int size2 = arrayList.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            Object obj = arrayList.get(i19);
                            i19++;
                            Integer num2 = (Integer) obj;
                            num2.getClass();
                            ArrayList arrayList5 = f10.f18520c;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList5.size()) {
                                    kg.v1 v1Var = (kg.v1) arrayList5.get(i20);
                                    i16 = i17;
                                    if (v1Var.h.contains(num2)) {
                                        v1Var.h.remove(num2);
                                        if (v1Var.a() <= 0) {
                                            arrayList5.remove(v1Var);
                                        }
                                        ls.f(f10.f18518a).k(ls.F1, new Object[0]);
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
                    j14 = j3;
                    i12 = i10;
                    getMessagesStorage().P0(j14, arrayList, true, false, 5, i12);
                } else {
                    i13 = 5;
                    if (z15) {
                        j14 = j3;
                        i12 = i10;
                        getMessagesStorage().P0(j14, arrayList, true, false, 9, i12);
                    } else {
                        if (j12 == 0) {
                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                gj gjVar = (gj) this.V.get(((Integer) arrayList.get(i21)).intValue());
                                if (gjVar != null) {
                                    gjVar.Z = true;
                                }
                            }
                        } else {
                            s3(arrayList, j3);
                        }
                        i12 = i10;
                        getMessagesStorage().P0(j3, arrayList, true, z10, 0, i12);
                        j14 = j3;
                        j11 = j12;
                        getMessagesStorage().R1(j14, j11, arrayList, null);
                        ls notificationCenter = getNotificationCenter();
                        Long valueOf = Long.valueOf(j11);
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
                        notificationCenter.k(ls.f25368w, objArr);
                    }
                }
                j11 = j12;
                ls notificationCenter2 = getNotificationCenter();
                Long valueOf5 = Long.valueOf(j11);
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
                notificationCenter2.k(ls.f25368w, objArr2);
            } else {
                i12 = i10;
                i13 = 5;
                i14 = 4;
                i15 = 3;
                if (tLObject instanceof TLRPC.TL_channels_deleteMessages) {
                    j11 = ((TLRPC.TL_channels_deleteMessages) tLObject).channel.channel_id;
                } else {
                    j11 = 0;
                }
                arrayList3 = null;
            }
            if (!z11) {
                if (z13) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteScheduledMessages) {
                        tL_messages_deleteScheduledMessages = (TLRPC.TL_messages_deleteScheduledMessages) tLObject;
                        z22 = j10;
                    } else {
                        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages2 = new TLRPC.TL_messages_deleteScheduledMessages();
                        tL_messages_deleteScheduledMessages2.f28479id = arrayList3;
                        tL_messages_deleteScheduledMessages2.peer = l1(j14);
                        try {
                            nativeByteBuffer9 = new NativeByteBuffer(tL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer9.writeInt32(24);
                                nativeByteBuffer9.writeInt64(j14);
                                tL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer9);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer8 = nativeByteBuffer9;
                                z21 = true;
                                a8.g(e, z21);
                                nativeByteBuffer9 = nativeByteBuffer8;
                                z22 = getMessagesStorage().z(nativeByteBuffer9);
                                tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new mj(this, z22, i15));
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z21 = true;
                            nativeByteBuffer8 = null;
                        }
                        z22 = getMessagesStorage().z(nativeByteBuffer9);
                        tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new mj(this, z22, i15));
                } else if (z14) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteQuickReplyMessages) {
                        tL_messages_deleteQuickReplyMessages = (TLRPC.TL_messages_deleteQuickReplyMessages) tLObject;
                        z20 = j10;
                    } else {
                        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages2 = new TLRPC.TL_messages_deleteQuickReplyMessages();
                        tL_messages_deleteQuickReplyMessages2.f28478id = arrayList3;
                        tL_messages_deleteQuickReplyMessages2.shortcut_id = i12;
                        try {
                            nativeByteBuffer7 = new NativeByteBuffer(tL_messages_deleteQuickReplyMessages2.getObjectSize() + 16);
                            try {
                                nativeByteBuffer7.writeInt32(103);
                                nativeByteBuffer7.writeInt64(j14);
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
                                getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new mj(this, z20, i14));
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z19 = true;
                            nativeByteBuffer6 = null;
                        }
                        z20 = getMessagesStorage().z(nativeByteBuffer7);
                        tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new mj(this, z20, i14));
                } else if (j11 != 0) {
                    if (tLObject != null) {
                        tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                        z18 = j10;
                    } else {
                        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                        tL_channels_deleteMessages2.f28431id = arrayList3;
                        tL_channels_deleteMessages2.channel = j1(j11);
                        try {
                            nativeByteBuffer5 = new NativeByteBuffer(tL_channels_deleteMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer5.writeInt32(24);
                                nativeByteBuffer5.writeInt64(j14);
                                tL_channels_deleteMessages2.serializeToStream(nativeByteBuffer5);
                            } catch (Exception e14) {
                                e = e14;
                                nativeByteBuffer4 = nativeByteBuffer5;
                                z17 = true;
                                a8.g(e, z17);
                                nativeByteBuffer5 = nativeByteBuffer4;
                                z18 = getMessagesStorage().z(nativeByteBuffer5);
                                tL_channels_deleteMessages = tL_channels_deleteMessages2;
                                getConnectionsManager().sendRequest(tL_channels_deleteMessages, new mk(0, j11, z18, this));
                            }
                        } catch (Exception e15) {
                            e = e15;
                            z17 = true;
                            nativeByteBuffer4 = null;
                        }
                        z18 = getMessagesStorage().z(nativeByteBuffer5);
                        tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new mk(0, j11, z18, this));
                } else {
                    if (arrayList2 != null && encryptedChat != null && !arrayList2.isEmpty()) {
                        nativeByteBuffer = null;
                        getSecretChatHelper().t(encryptedChat, arrayList2, null);
                    } else {
                        nativeByteBuffer = null;
                    }
                    if (tLObject instanceof TLRPC.TL_messages_deleteMessages) {
                        tL_messages_deleteMessages = (TLRPC.TL_messages_deleteMessages) tLObject;
                        z16 = j10;
                    } else {
                        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages2 = new TLRPC.TL_messages_deleteMessages();
                        tL_messages_deleteMessages2.f28477id = arrayList3;
                        tL_messages_deleteMessages2.revoke = z10;
                        try {
                            nativeByteBuffer3 = new NativeByteBuffer(tL_messages_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e16) {
                            e = e16;
                            nativeByteBuffer2 = nativeByteBuffer;
                        }
                        try {
                            nativeByteBuffer3.writeInt32(24);
                            nativeByteBuffer3.writeInt64(j14);
                            tL_messages_deleteMessages2.serializeToStream(nativeByteBuffer3);
                        } catch (Exception e17) {
                            e = e17;
                            nativeByteBuffer2 = nativeByteBuffer3;
                            a8.g(e, true);
                            nativeByteBuffer3 = nativeByteBuffer2;
                            z16 = getMessagesStorage().z(nativeByteBuffer3);
                            tL_messages_deleteMessages = tL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteMessages, new mj(this, z16, i13));
                        }
                        z16 = getMessagesStorage().z(nativeByteBuffer3);
                        tL_messages_deleteMessages = tL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteMessages, new mj(this, z16, i13));
                }
            }
        }
    }

    public final TLRPC.TL_availableEffect b1(long j3) {
        G0();
        if (this.f25880n8 != null) {
            for (int i7 = 0; i7 < this.f25880n8.effects.size(); i7++) {
                if (this.f25880n8.effects.get(i7).f28429id == j3) {
                    return this.f25880n8.effects.get(i7);
                }
            }
            return null;
        }
        return null;
    }

    public final long b2(int i7) {
        if (i7 == 0) {
            return this.f25832i1;
        }
        if (i7 == 1) {
            return this.f25840j1;
        }
        if (i7 == 2) {
            return this.f25848k1;
        }
        return 0L;
    }

    public final void b3(final int r11, final long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.b3(int, long, boolean):void");
    }

    public final void b4(TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (encryptedChat == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f25776c;
        if (z10) {
            concurrentHashMap.putIfAbsent(Integer.valueOf(encryptedChat.f28406id), encryptedChat);
        } else {
            concurrentHashMap.put(Integer.valueOf(encryptedChat.f28406id), encryptedChat);
        }
    }

    public final void b5(final long j3, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z10, final org.telegram.ui.ActionBar.g2 g2Var, boolean z11, boolean z12, String str2, final Runnable runnable, final yo yoVar) {
        if (user != null && tL_chatAdminRights != null) {
            final TLRPC.Chat O0 = O0(Long.valueOf(j3));
            final boolean Y = v3.Y(O0);
            boolean z13 = true;
            if (v3.T(O0)) {
                final TLRPC.TL_channels_editAdmin tL_channels_editAdmin = new TLRPC.TL_channels_editAdmin();
                tL_channels_editAdmin.channel = k1(O0);
                tL_channels_editAdmin.user_id = s1(user);
                tL_channels_editAdmin.admin_rights = tL_chatAdminRights;
                if (!TextUtils.isEmpty(str)) {
                    tL_channels_editAdmin.flags |= 1;
                    tL_channels_editAdmin.rank = str;
                }
                RequestDelegate requestDelegate = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        np npVar = np.this;
                        if (tL_error == null) {
                            npVar.V3((TLRPC.Updates) tLObject, false);
                            g0.h3(new sm(npVar, j3, runnable, 2), 1000L);
                            return;
                        }
                        boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                        yo yoVar2 = yoVar;
                        if (equals) {
                            TLRPC.Chat chat = O0;
                            if (!v3.Y(chat) && v3.y(3, chat)) {
                                g0.g3(new gn(npVar, user, chat, yoVar2, tL_error, 0));
                                return;
                            }
                        }
                        g0.g3(new hn(npVar, tL_error, g2Var, tL_channels_editAdmin, z10, Y));
                        if (yoVar2 != null) {
                            g0.g3(new an(yoVar2, tL_error, 1));
                        }
                    }
                };
                if (!user.bot && z11) {
                    m(j3, user, 0, str2, g2Var, true, new lg(this, tL_channels_editAdmin, requestDelegate, 10), yoVar, null);
                    return;
                } else {
                    getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                    return;
                }
            }
            TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
            tL_messages_editChatAdmin.chat_id = j3;
            tL_messages_editChatAdmin.user_id = s1(user);
            if (!z12 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
                z13 = false;
            }
            boolean z14 = z13;
            tL_messages_editChatAdmin.is_admin = z14;
            di.k3 k3Var = new di.k3(this, j3, runnable, g2Var, tL_messages_editChatAdmin, yoVar);
            if (!z14 && !z11 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tL_messages_editChatAdmin, k3Var);
            } else {
                m(j3, user, 0, str2, g2Var, true, new lg(this, tL_messages_editChatAdmin, k3Var, 11), yoVar, null);
            }
        }
    }

    public final void c(long j3, boolean z10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j3);
        if (dialog == null) {
            return;
        }
        if (z10) {
            this.F0.k(dialog, j3);
        } else {
            this.E0.k(dialog, j3);
            this.f25972y.remove(dialog);
            f5(null);
        }
        getNotificationCenter().k(ls.f25342s, Boolean.TRUE);
    }

    public final void c0(long j3, long j10, ArrayList arrayList) {
        getMessagesStorage().f27214a.c(new ek(this, arrayList, j10, j3));
    }

    public final TLRPC.EncryptedChat c1(Integer num) {
        return (TLRPC.EncryptedChat) this.f25776c.get(num);
    }

    public final TLRPC.User c2(Long l10) {
        if (l10.longValue() == 0) {
            return k10.i(this.currentAccount).f();
        }
        return (TLRPC.User) this.d.get(l10);
    }

    public final void c3(final TLRPC.User user, final int i7, boolean z10, final y10 y10Var) {
        if (user != null) {
            HashSet hashSet = this.f25909r1;
            if (y10Var == null) {
                if (!hashSet.contains(Long.valueOf(user.f28547id))) {
                    if (!z10 && this.f25919s1.get(user.f28547id) > 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            hashSet.add(Long.valueOf(user.f28547id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.f28540id = s1(user);
            final long j3 = user.f28547id;
            if (this.P.get(Long.valueOf(j3)) == null || this.Q.get(Long.valueOf(j3)) == null) {
                i4(null, j3);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    np npVar = np.this;
                    ConcurrentHashMap concurrentHashMap = npVar.f25927t1;
                    TLRPC.User user2 = user;
                    if (tL_error == null) {
                        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                        TLRPC.UserFull userFull = tL_users_userFull.full_user;
                        int size = tL_users_userFull.users.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            TLRPC.User user3 = tL_users_userFull.users.get(i10);
                            if (user3 != null) {
                                long j10 = user3.f28547id;
                                if (j10 == user2.f28547id && user3.bot && !user3.min) {
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(j10));
                                    if (num == null || user3.bot_info_version > num.intValue()) {
                                        concurrentHashMap.put(Long.valueOf(user3.f28547id), Integer.valueOf(user3.bot_info_version));
                                    }
                                }
                            }
                            i10++;
                        }
                        npVar.f4(tL_users_userFull.users, false);
                        npVar.Z3(tL_users_userFull.chats, false);
                        TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                        userFull2.user = npVar.c2(Long.valueOf(userFull2.f28548id));
                        npVar.getMessagesStorage().j2(userFull, false);
                        npVar.R1().p0(j3, userFull.stories);
                        f4 f10 = f4.f(npVar.currentAccount);
                        TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                        f10.r(userFull3.f28548id, userFull3.wallpaper);
                        y10 y10Var2 = y10Var;
                        if (y10Var2 != null) {
                            y10Var2.a(userFull);
                        }
                        g0.g3(new eg(npVar, userFull, user2, i7, 1));
                        return;
                    }
                    g0.g3(new rj(npVar, user2, 1));
                }
            }), i7);
        }
    }

    public final void c4(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                b4((TLRPC.EncryptedChat) arrayList.get(i7), true);
            }
        }
    }

    public final void c5(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.E8 = tL_webBrowserSettings;
        int i7 = this.currentAccount;
        long j3 = tL_webBrowserSettings.hash;
        this.F8.g(i7, null, tL_webBrowserSettings);
        getNotificationCenter().k(ls.U5, new Object[0]);
    }

    public final int d(int i7, int i10, long j3) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j3));
        return e(arrayList, i7, i10, null, 0L);
    }

    public final void d0(long j3, long j10, int i7, int i10, boolean z10, org.telegram.ui.vf vfVar) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = l1(j3);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i7;
        tL_messages_deleteHistory.max_date = i10;
        tL_messages_deleteHistory.revoke = z10;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new kn(this, j3, i7, i10, j10, z10, vfVar));
    }

    public final TLRPC.EncryptedChat d1(int i7, boolean z10) {
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f25776c.get(Integer.valueOf(i7));
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
        ur messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.f27214a.c(new gm(messagesStorage, i7, arrayList, countDownLatch, 15));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (arrayList.size() == 2) {
            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
            b4(encryptedChat2, false);
            e4((TLRPC.User) arrayList.get(1), true, false);
            return encryptedChat2;
        }
        return encryptedChat;
    }

    public final TLRPC.UserFull d2(long j3) {
        return (TLRPC.UserFull) this.l1.f(j3);
    }

    public final void d3() {
        SharedPreferences.Editor editor;
        if (this.f25936u2 == 0 && !getUserConfig().T) {
            SharedPreferences sharedPreferences = u1(this.currentAccount).f25821g7;
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
            this.f25936u2 = 4;
            for (int i7 = 0; i7 < 3; i7++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i7 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i7 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                getConnectionsManager().sendRequest(getnotifysettings, new ao(this, i7, 1));
            }
            getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new nj(this, 6));
        }
        if (!getUserConfig().U && !this.f25945v2) {
            this.f25945v2 = true;
            getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new nj(this, 11));
        }
    }

    public final void d4(long j3, t3 t3Var) {
        this.n1.k(t3Var, t3Var.f26914b.f28408id);
        this.f25882o1.k(t3Var, j3);
        TLRPC.ChatFull P0 = P0(j3);
        if (P0 != null) {
            P0.call = t3Var.g(t3Var.f26913a);
        }
        getNotificationCenter().k(ls.f25371w2, Long.valueOf(j3), Long.valueOf(t3Var.f26914b.f28408id), Boolean.FALSE);
        b3(0, j3, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        org.telegram.ui.ActionBar.l6 l6Var;
        TLRPC.InputFile inputFile;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        np npVar = this;
        int i11 = ls.U1;
        HashMap hashMap = npVar.S2;
        TLRPC.BaseTheme baseTheme = null;
        if (i7 == i11) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = npVar.Q2;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                npVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new nj(npVar, 19));
            } else {
                String str3 = npVar.T2;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    org.telegram.ui.ActionBar.d6 d6Var = npVar.U2;
                    String str4 = npVar.T2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = d6Var.f28855i;
                    tL_wallPaperSettings.motion = d6Var.f28856j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    org.telegram.ui.ActionBar.d6 d6Var2 = npVar.U2;
                    d6Var2.f28864r = 1.0f;
                    d6Var2.f28865s = new ArrayList();
                    npVar.U2.f28865s.add(Integer.valueOf(npVar.getConnectionsManager().sendRequest(uploadwallpaper, new q6(npVar, d6Var, tL_wallPaperSettings, str4, 3))));
                } else {
                    Object obj = hashMap.get(str);
                    if (obj instanceof org.telegram.ui.ActionBar.l6) {
                        l6Var = (org.telegram.ui.ActionBar.l6) obj;
                        if (str.equals(l6Var.I)) {
                            l6Var.K = inputFile3;
                            l6Var.I = null;
                        } else if (str.equals(l6Var.J)) {
                            l6Var.L = inputFile3;
                            l6Var.J = null;
                        }
                        inputFile = l6Var.K;
                        inputFile2 = l6Var.L;
                        j6Var = null;
                    } else if (obj instanceof org.telegram.ui.ActionBar.j6) {
                        org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj;
                        if (str.equals(j6Var2.f29080u)) {
                            j6Var2.f29081w = inputFile3;
                            j6Var2.f29080u = null;
                        } else if (str.equals(j6Var2.v)) {
                            j6Var2.f29082x = inputFile3;
                            j6Var2.v = null;
                        }
                        org.telegram.ui.ActionBar.l6 l6Var2 = j6Var2.f29063b;
                        TLRPC.InputFile inputFile4 = j6Var2.f29081w;
                        inputFile2 = j6Var2.f29082x;
                        j6Var = j6Var2;
                        l6Var = l6Var2;
                        inputFile = inputFile4;
                    } else {
                        l6Var = null;
                        inputFile = null;
                        j6Var = null;
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
                        if (j6Var != null) {
                            j6Var.f29082x = null;
                            j6Var.f29081w = null;
                            tL_theme = j6Var.f29077r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str5 = l6Var.f29198a;
                            int i12 = org.telegram.ui.ActionBar.m6.f29282a;
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
                            tL_inputThemeSettings2.accent_color = j6Var.f29064c;
                            int i13 = j6Var.d;
                            if (i13 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i13;
                            }
                            int i14 = j6Var.f29065e;
                            if (i14 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i14));
                                tL_inputThemeSettings2.flags |= 1;
                                int i15 = j6Var.f29066f;
                                if (i15 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i15));
                                    int i16 = j6Var.f29067g;
                                    if (i16 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i16));
                                        int i17 = j6Var.h;
                                        if (i17 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i17));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = j6Var.f29068i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(j6Var.f29074o)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = j6Var.f29074o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (j6Var.f29075p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.f28471id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = j6Var.f29076q;
                            long j3 = j6Var.f29069j;
                            if (j3 != 0) {
                                wallPaperSettings2.background_color = (int) j3;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j10 = j6Var.f29070k;
                            if (j10 != 0) {
                                wallPaperSettings2.second_background_color = (int) j10;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = g0.s1(j6Var.f29073n, true);
                            }
                            long j11 = j6Var.f29071l;
                            if (j11 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j11;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j12 = j6Var.f29072m;
                            if (j12 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j12;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            l6Var.L = null;
                            l6Var.K = null;
                            tL_theme = l6Var.G;
                            tL_inputThemeSettings = null;
                        }
                        org.telegram.ui.ActionBar.l6 l6Var3 = l6Var;
                        npVar = this;
                        getConnectionsManager().sendRequest(uploadtheme, new zn(npVar, tL_theme, l6Var3, tL_inputThemeSettings, j6Var, 0));
                    }
                }
                npVar = this;
            }
        } else if (i7 == ls.V1) {
            String str6 = (String) objArr[0];
            String str7 = npVar.Q2;
            if (str7 != null && str7.equals(str6)) {
                npVar.Q2 = null;
            } else {
                String str8 = npVar.T2;
                if (str8 != null && str8.equals(str6)) {
                    npVar.T2 = null;
                    npVar.U2 = null;
                } else {
                    Object remove = hashMap.remove(str6);
                    boolean z10 = remove instanceof org.telegram.ui.ActionBar.l6;
                    int i18 = ls.N2;
                    if (z10) {
                        org.telegram.ui.ActionBar.l6 l6Var4 = (org.telegram.ui.ActionBar.l6) remove;
                        l6Var4.L = null;
                        l6Var4.K = null;
                        npVar.getNotificationCenter().k(i18, l6Var4, 0);
                    } else if (remove instanceof org.telegram.ui.ActionBar.j6) {
                        org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) remove;
                        j6Var3.f29080u = null;
                        npVar.getNotificationCenter().k(i18, j6Var3.f29063b, j6Var3);
                    }
                }
            }
        }
        if (i7 == ls.W1) {
            String str9 = (String) objArr[0];
            String str10 = npVar.T2;
            if (str10 != null && str10.equals(str9)) {
                npVar.U2.f28864r = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        int i19 = ls.K;
        SparseArray sparseArray = npVar.V;
        if (i7 == i19) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l10 = (Long) objArr[3];
                ArrayList arrayList = (ArrayList) npVar.S.f(l10.longValue());
                for (int i20 = 0; arrayList != null && i20 < arrayList.size(); i20++) {
                    gj gjVar2 = (gj) arrayList.get(i20);
                    if (gjVar2 != null && (gjVar2.e1() == num.intValue() || gjVar2.f24177k.local_id == num.intValue())) {
                        gjVar2.f24177k.f28419id = num2.intValue();
                        gjVar2.f24177k.send_state = 0;
                    }
                    gj gjVar3 = (gj) sparseArray.get(num.intValue());
                    if (gjVar3 != null) {
                        sparseArray.remove(num.intValue());
                        sparseArray.put(num2.intValue(), gjVar3);
                    }
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) npVar.R.f(l10.longValue());
                if (dialog != null && dialog.top_message == num.intValue()) {
                    dialog.top_message = num2.intValue();
                    npVar.getNotificationCenter().k(ls.f25342s, new Object[0]);
                }
                if (n5.z(l10.longValue())) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) npVar.f25864m1.f(-l10.longValue());
                    TLRPC.Chat O0 = npVar.O0(Long.valueOf(-l10.longValue()));
                    if (O0 != null && !v3.N(O0) && !gj.f3(num2.intValue()) && chatFull != null && chatFull.slowmode_seconds != 0) {
                        chatFull.slowmode_next_send_date = npVar.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                        chatFull.flags |= 262144;
                        npVar.getMessagesStorage().N1(chatFull, false);
                    }
                }
            }
        } else if (i7 == ls.f25303l0) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id == 0 && (gjVar = (gj) sparseArray.get(message.f28419id)) != null) {
                gjVar.f24177k.media = gj.n1(message);
                if (gj.n1(message).ttl_seconds != 0) {
                    if ((gj.n1(message).photo instanceof TLRPC.TL_photoEmpty) || (gj.n1(message).document instanceof TLRPC.TL_documentEmpty)) {
                        gjVar.L5();
                        npVar.getNotificationCenter().k(ls.f25268f0, new Object[0]);
                    }
                }
            }
        } else if (i7 == ls.f25291i5) {
            npVar.X2(false);
            npVar.getContactsController().J(true);
            if ((npVar.f25923s6 && !npVar.getUserConfig().q()) || npVar.getUserConfig().q()) {
                npVar.getNotificationCenter().k(ls.f25321o3, new Object[0]);
            }
        }
    }

    public final int e(java.util.ArrayList r23, int r24, int r25, java.util.ArrayList r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.e(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public final void e0(final long j3, TLRPC.InputPeer inputPeer, boolean z10, final org.telegram.ui.qa qaVar) {
        final boolean z11;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat O0 = O0(Long.valueOf(j3));
        if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && p10.C(getMessagesController().c2(Long.valueOf(inputPeer.user_id)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        final boolean T = v3.T(O0);
        if (T) {
            if (z11) {
                boolean z12 = O0.creator;
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = k1(O0);
                tL_messages_deleteChatUser = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                tL_channels_editBanned.channel = k1(O0);
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
            tL_messages_deleteChatUser2.chat_id = j3;
            tL_messages_deleteChatUser2.user_id = r1(inputPeer);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        }
        if (z11) {
            X(0, -j3, z10);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    np npVar = np.this;
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    if (T && !z11) {
                        g0.h3(new jk(npVar, j3, 22), 1000L);
                    }
                    Runnable runnable = qaVar;
                    if (runnable != null) {
                        g0.g3(runnable);
                    }
                }
            }
        }, 64);
    }

    public final String e1(long j3) {
        if (j3 > 0) {
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (c22 != null) {
                return i5.m(0, c22.first_name, c22.last_name);
            }
            return null;
        }
        TLRPC.Chat O0 = O0(Long.valueOf(-j3));
        if (O0 != null) {
            return O0.title;
        }
        return null;
    }

    public final void e3(long j3, long j10, boolean z10, int i7, int i10, int i11, boolean z11, int i12, int i13, int i14, int i15, long j11, int i16, int i17, boolean z12) {
        int i18;
        if (j11 != 0) {
            i18 = i16;
        } else {
            i18 = 0;
        }
        f3(j3, j10, z10, i7, i10, i11, z11, i12, i13, i14, 0, i15, j11, i17, i18, 0, 0, false, 0, true, true, z12, null, 0L);
    }

    public final boolean e4(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.e4(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public final boolean e5() {
        if (this.f25925s8 != null && System.currentTimeMillis() - this.f25916r8 < 3600000) {
            return this.f25925s8.sensitive_enabled;
        }
        Set set = this.F4;
        if (set != null && !set.contains("sensitive")) {
            return false;
        }
        return true;
    }

    public final void f(int i7, TLRPC.Dialog dialog) {
        int i10;
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            i10 = 0;
        } else {
            i10 = dialog.folder_id;
        }
        SparseArray sparseArray = this.f25952w;
        ArrayList arrayList = (ArrayList) sparseArray.get(i10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i10, arrayList);
        }
        if (i7 == -1) {
            arrayList.add(dialog);
        } else if (i7 == -2) {
            if (!arrayList.isEmpty() && (arrayList.get(0) instanceof TLRPC.TL_dialogFolder)) {
                arrayList.add(1, dialog);
            } else {
                arrayList.add(0, dialog);
            }
        } else {
            arrayList.add(i7, dialog);
        }
    }

    public final void f0(long j3, TLRPC.User user) {
        g0(j3, user, null, false, false);
    }

    public final n10 f2() {
        if (this.V2 == null) {
            this.V2 = new n10(this.currentAccount);
        }
        return this.V2;
    }

    public final void f3(final long j3, final long j10, final boolean z10, final int i7, final int i10, final int i11, boolean z11, final int i12, final int i13, final int i14, final int i15, final int i16, final long j11, final int i17, final int i18, final int i19, final int i20, final boolean z12, final int i21, boolean z13, final boolean z14, final boolean z15, uz uzVar, long j12) {
        int i22;
        uz uzVar2;
        TLRPC.TL_forumTopic f10;
        if (s2.f26694a) {
            StringBuilder t6 = a8.p0.t(j3, "load messages in chat ", " topic_id ");
            t6.append(j11);
            t6.append(" count ");
            t6.append(i7);
            t6.append(" max_id ");
            t6.append(i10);
            t6.append(" cache ");
            t6.append(z11);
            t6.append(" mindate = ");
            i22 = i12;
            t6.append(i22);
            t6.append(" guid ");
            t6.append(i13);
            t6.append(" load_type ");
            t6.append(i14);
            t6.append(" last_message_id ");
            t6.append(i15);
            t6.append(" mode ");
            t6.append(i16);
            t6.append(" index ");
            t6.append(i17);
            t6.append(" firstUnread ");
            t6.append(i18);
            t6.append(" unread_count ");
            t6.append(i19);
            t6.append(" last_date ");
            t6.append(i20);
            t6.append(" queryFromServer ");
            t6.append(z12);
            t6.append(" isTopic ");
            t6.append(z15);
            a8.b(t6.toString());
        } else {
            i22 = i12;
        }
        if (s2.f26694a && uzVar == null && i16 == 0) {
            uzVar2 = new uz("MessageLoaderLogger dialogId=" + j3 + " index=" + i17 + " count=" + i7);
        } else {
            uzVar2 = uzVar;
        }
        int i23 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if ((i23 == 0 || z15 || i16 == 8 || i16 == 3 || i16 == 5 || i16 == 9) && i16 != 2 && (z11 || n5.C(j3))) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.f27214a.c(new pp(messagesStorage, uz.d(uzVar2, "MessagesStorage.getMessages: storageQueue.postRunnable"), uzVar2, j3, j10, i7, i10, i11, i22, i13, i14, i16, j11, i17, z14, z15));
            return;
        }
        int i24 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.Chat O0 = i24 < 0 ? O0(Long.valueOf(-j3)) : null;
        if (i16 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = l1(j3);
            tL_getWelcomeMessages.hash = j12;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new r10() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TL_ephemeral.WelcomeMessages welcomeMessages = (TL_ephemeral.WelcomeMessages) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    np npVar = np.this;
                    npVar.getClass();
                    if (welcomeMessages != null && !(welcomeMessages instanceof TL_ephemeral.TL_welcomeMessagesNotModified)) {
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        ArrayList<TL_ephemeral.EphemeralMessage> arrayList = welcomeMessages.messages;
                        int size = arrayList.size();
                        int i25 = 0;
                        while (i25 < size) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i25);
                            i25++;
                            tL_messages_messages.messages.add(bg.x.b(ephemeralMessage));
                        }
                        npVar.R3(tL_messages_messages, tL_messages_messages.messages.size(), j3, j10, i7, i10, i11, false, i13, i18, i15, i19, i20, i14, false, i16, j11, i17, z12, i21, z14, z15, null);
                    }
                }
            }), i13);
        } else if (i16 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j11;
            tL_messages_getQuickReplyMessages.hash = j12;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new wk(this, j3, j10, i7, i10, i11, i13, i18, i15, i19, i20, i14, i16, j11, i17, z12, i21, z14, z15)), i13);
        } else if (i23 == 0) {
            if (i16 == 2) {
                return;
            }
            if (i16 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = l1(j3);
                tL_messages_getScheduledHistory.hash = j12;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new wk(this, i10, i11, j3, j10, i7, i13, i18, i15, i19, i20, i14, i16, j11, i17, z12, i21, z14, z15)), i13);
            } else if (!v3.p0(O0) && z13 && ((i14 == 3 || i14 == 2) && i15 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer l1 = l1(j3);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = l1;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        np npVar = np.this;
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
                                    npVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                                }
                                npVar.f3(j3, j10, z10, i7, i10, i11, false, i12, i25, i14, dialog.top_message, 0, j11, i17, i18, dialog.unread_count, i20, z12, dialog.unread_mentions_count, false, z14, z15, null, 0L);
                                return;
                            }
                            return;
                        }
                        g0.g3(new eg(npVar, i25, (TLObject) tL_messages_getPeerDialogs, tL_error, 11));
                    }
                });
            } else {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = l1(j3);
                if (i14 == 4) {
                    tL_messages_getHistory.add_offset = (-i7) + 5;
                } else if (i14 == 3) {
                    tL_messages_getHistory.add_offset = (-i7) / 2;
                } else if (i14 == 1) {
                    tL_messages_getHistory.add_offset = (-i7) - 1;
                } else if (i14 == 2 && i10 != 0) {
                    tL_messages_getHistory.add_offset = (-i7) + 6;
                } else if (i24 < 0 && i10 != 0 && v3.T(O0)) {
                    tL_messages_getHistory.add_offset = -1;
                    tL_messages_getHistory.limit++;
                }
                tL_messages_getHistory.limit = i7;
                tL_messages_getHistory.offset_id = i10;
                tL_messages_getHistory.offset_date = i11;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new xk(this, j3, i7, i10, i11, j10, i13, i18, i15, i19, i20, i14, i16, j11, i17, z12, i21, z14, z15, tL_messages_getHistory, 2)), i13);
            }
        } else if (i16 == 3 || v3.p0(O0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = l1(j11);
            if (v3.p0(O0)) {
                tL_messages_getSavedHistory.parent_peer = l1(j3);
            }
            if (i14 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i7) + 5;
            } else if (i14 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i7) / 2;
            } else if (i14 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i7) - 1;
            } else if (i14 == 2 && i10 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i7) + 6;
            } else if (i24 < 0 && i10 != 0 && v3.T(O0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i7;
            tL_messages_getSavedHistory.offset_id = i10;
            tL_messages_getSavedHistory.offset_date = i11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new xk(this, j3, i7, i10, i11, j10, i13, i18, i15, i19, i20, i14, i16, j11, i17, z12, i21, z14, z15, tL_messages_getSavedHistory, 0)), i13);
        } else if (z13 && z15 && i14 == 2 && i15 == 0 && (f10 = this.f25932t7.f(-j3, j11)) != null) {
            f3(j3, j10, z10, i7, i10, i11, false, i12, i13, i14, f10.top_message, i16, j11, i17, i18, f10.unread_count, i20, z12, f10.unread_mentions_count, false, z14, z15, uzVar2, 0L);
        } else if (i16 != 0) {
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = l1(j3);
            tL_messages_getReplies.msg_id = (int) j11;
            tL_messages_getReplies.offset_date = i11;
            if (i14 == 4) {
                tL_messages_getReplies.add_offset = (-i7) + 5;
            } else if (i14 == 3) {
                tL_messages_getReplies.add_offset = (-i7) / 2;
            } else if (i14 == 1) {
                tL_messages_getReplies.add_offset = (-i7) - 1;
            } else if (i14 == 2 && i10 != 0) {
                tL_messages_getReplies.add_offset = (-i7) + 10;
            } else if (i24 < 0 && i10 != 0 && v3.T(O0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i7;
            tL_messages_getReplies.offset_id = i10;
            tL_messages_getReplies.hash = j12;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new xk(this, i7, i10, i11, i18, i14, j3, j10, i13, i15, i19, i20, i16, j11, i17, z12, i21, z14, z15, tL_messages_getReplies)), i13);
        }
    }

    public final void f4(ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (e4((TLRPC.User) arrayList.get(i7), z10, false)) {
                    z11 = true;
                }
            }
            if (z11) {
                g0.g3(new rn(this, 3));
            }
        }
    }

    public final void f5(a0.h r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.f5(a0.h):void");
    }

    public final void g(so soVar, boolean z10) {
        HashSet hashSet = this.F7;
        if (z10) {
            int size = this.Q0.size();
            int i7 = 254;
            for (int i10 = 0; i10 < size; i10++) {
                i7 = Math.min(i7, ((so) this.Q0.get(i10)).f26854f);
            }
            soVar.f26854f = i7 - 1;
            if (((so) this.Q0.get(0)).d()) {
                this.Q0.add(1, soVar);
            } else {
                this.Q0.add(0, soVar);
            }
        } else {
            int size2 = this.Q0.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                i11 = Math.max(i11, ((so) this.Q0.get(i12)).f26854f);
            }
            soVar.f26854f = i11 + 1;
            this.Q0.add(soVar);
        }
        this.T0.put(soVar.f26850a, soVar);
        int i13 = soVar.f26850a;
        if (i13 != 0 && hashSet.remove(Integer.valueOf(i13))) {
            I4();
        }
        if (hashSet.contains(0)) {
            f5(null);
        }
        if (this.Q0.size() == 1 && cz.m(this.currentAccount) != 5) {
            cz.f23402r1 = 5;
            t0.f26895b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", cz.f23402r1).apply();
        }
        p3();
    }

    public final void g0(long j3, TLRPC.User user, TLRPC.Chat chat, boolean z10, boolean z11) {
        TLRPC.InputPeer n1;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user == null && chat == null) {
            return;
        }
        if (user != null) {
            n1 = p1(user);
        } else {
            n1 = n1(chat);
        }
        TLRPC.Chat O0 = O0(Long.valueOf(j3));
        boolean T = v3.T(O0);
        if (T) {
            if (p10.C(user)) {
                if (O0.creator && z10) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = k1(O0);
                    tL_messages_deleteChatUser = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = k1(O0);
                    tL_messages_deleteChatUser = tL_channels_leaveChannel;
                }
            } else {
                if (v3.Y(O0)) {
                    TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
                    tL_communities_toggleParticipantBanned.participant = n1;
                    tL_communities_toggleParticipantBanned.community = k1(O0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = k1(O0);
                    tL_channels_editBanned.participant = n1;
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
            tL_messages_deleteChat.chat_id = j3;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new fi.k5(13));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j3;
            tL_messages_deleteChatUser3.user_id = s1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (p10.C(user)) {
            X(0, -j3, z11);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new al(this, T, user, j3), 64);
    }

    public final TLObject g2(long j3) {
        Long valueOf = Long.valueOf(j3);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(valueOf)) {
            return (TLObject) concurrentHashMap.get(Long.valueOf(j3));
        }
        long j10 = -j3;
        Long valueOf2 = Long.valueOf(j10);
        ConcurrentHashMap concurrentHashMap2 = this.f25766b;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            return (TLObject) concurrentHashMap2.get(Long.valueOf(j10));
        }
        return null;
    }

    public final void g3(TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        long j3;
        if (user != null || chat != null) {
            if (user != null) {
                j3 = user.f28547id;
            } else {
                j3 = -chat.f28398id;
            }
            a0.h hVar = this.f25934u0;
            if (hVar.h(j3) < 0) {
                if (s2.f26694a) {
                    a8.b("request spam button for " + j3);
                }
                int i7 = this.f25821g7.getInt("dialog_bar_vis3" + j3, 0);
                if (!z10 && (i7 == 1 || i7 == 3)) {
                    if (s2.f26694a) {
                        a8.b("dialog bar already hidden for " + j3);
                        return;
                    }
                    return;
                }
                hVar.k(Boolean.TRUE, j3);
                TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
                if (user != null) {
                    tL_messages_getPeerSettings.peer = l1(user.f28547id);
                } else {
                    tL_messages_getPeerSettings.peer = l1(-chat.f28398id);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new mj(this, j3, 1));
            }
        }
    }

    public final void g4(int i7, String str) {
        if (!TextUtils.isEmpty(str) && !this.f25865m2 && getUserConfig().e() != 0) {
            if (!getUserConfig().d || !str.equals(cz.f23371g)) {
                this.f25865m2 = true;
                this.f25874n2 = SystemClock.elapsedRealtime();
                if (cz.f23385l == null) {
                    cz.f23385l = new byte[256];
                    Utilities.f22772b.nextBytes(cz.f23385l);
                    cz.y();
                }
                TL_account.registerDevice registerdevice = new TL_account.registerDevice();
                registerdevice.token_type = i7;
                registerdevice.token = str;
                registerdevice.no_muted = false;
                registerdevice.secret = cz.f23385l;
                for (int i10 = 0; i10 < 4; i10++) {
                    k10 i11 = k10.i(i10);
                    if (i10 != this.currentAccount && i11.p()) {
                        long e10 = i11.e();
                        registerdevice.other_uids.add(Long.valueOf(e10));
                        if (s2.f26694a) {
                            i5.c.t(this.currentAccount, a8.p0.t(e10, "add other uid = ", " for account "));
                        }
                    }
                }
                getConnectionsManager().sendRequest(registerdevice, new wn(this, i7, str, 0));
            }
        }
    }

    public final boolean g5() {
        return !this.f25870m7;
    }

    public final void h(gj gjVar, TLRPC.SuggestedPost suggestedPost) {
        gj gjVar2 = gjVar;
        if (gjVar2 != null && gjVar2.f24177k != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(gjVar2);
            az sendMessagesHelper = getSendMessagesHelper();
            long B0 = gj.B0(gjVar2.f24177k);
            boolean z10 = !gj.l3(gjVar2.f24177k);
            TLRPC.Message message = gjVar2.f24177k;
            if (message.suggested_post == null) {
                gjVar2 = null;
            }
            sendMessagesHelper.q0(arrayList, B0, z10, false, true, 0, 0, gjVar2, -1, 0L, n5.o(message.saved_peer_id), lj.b(suggestedPost));
        }
    }

    public final void h0(long j3, int i7, long j10) {
        ur messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new vq(messagesStorage, i7, j3, j10, 1));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = l1(j3);
        tL_messages_deleteParticipantReaction.participant = l1(j10);
        tL_messages_deleteParticipantReaction.msg_id = i7;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new d3.b(1), new bl(this, 2));
    }

    public final TLObject h2(String str) {
        if (str != null && str.length() != 0) {
            return (TLObject) this.f25794e.get(str.toLowerCase());
        }
        return null;
    }

    public final void h3(int i7) {
        SparseIntArray sparseIntArray = this.f25910r2;
        if (sparseIntArray.indexOfKey(i7) < 0) {
            SharedPreferences k10 = getUserConfig().k();
            if (!k10.getBoolean("2pinnedDialogsLoaded" + i7, false)) {
                sparseIntArray.put(i7, 1);
                TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
                tL_messages_getPinnedDialogs.folder_id = i7;
                getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new ao(this, i7, 0));
            }
        }
    }

    public final void h4(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.G7;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num != null) {
            if (num.intValue() > 1) {
                hashMap.put(Long.valueOf(j3), Integer.valueOf(num.intValue() - 1));
                return;
            }
            hashMap.remove(Long.valueOf(j3));
            if (!w2((TLRPC.Dialog) this.R.f(j3)) && n0()) {
                f5(null);
                getNotificationCenter().k(ls.Q2, Long.valueOf(j3));
            }
        }
    }

    public final void h5(TLRPC.Chat chat, int i7, boolean z10, org.telegram.ui.sf sfVar) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new di.da(this, chat, z10, i7, sfVar));
    }

    public final void i(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            g0.g3(new pj(this, chat, 0));
        } else {
            j(chat);
        }
    }

    public final void i0(long j3, int i7, TLRPC.InputPeer inputPeer) {
        long n10 = n5.n(inputPeer);
        int[] iArr = {i7};
        di.j9 j9Var = new di.j9(this, n10, j3, inputPeer, i7, iArr);
        if (iArr[0] <= 0 && n10 == 0) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new d4(messagesStorage, j3, new cn(iArr, j9Var), 29));
            return;
        }
        j9Var.run();
    }

    public final t3 i1(long j3, boolean z10, p80 p80Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull P0 = P0(j3);
        if (P0 != null && (inputGroupCall = P0.call) != null) {
            t3 t3Var = (t3) this.n1.f(inputGroupCall.f28415id);
            if (t3Var == null && z10) {
                Long valueOf = Long.valueOf(j3);
                HashSet hashSet = this.f25954w1;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(j3));
                    if (P0.call != null) {
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        getgroupcall.call = P0.call;
                        getgroupcall.limit = 20;
                        getConnectionsManager().sendRequest(getgroupcall, new ho(this, j3, p80Var, 5));
                    }
                }
            }
            if (t3Var == null || !(t3Var.f26914b instanceof TLRPC.TL_groupCallDiscarded)) {
                return t3Var;
            }
            return null;
        }
        return null;
    }

    public final void i3(boolean z10, bi.j5 j5Var) {
        if (j5Var != null) {
            this.N7 = j5Var;
        }
        if (getUserConfig().p()) {
            if (z10 || !getUserConfig().Q) {
                if (z10) {
                    getUserConfig().Q = false;
                    getUserConfig().v(false);
                }
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new nj(this, 18));
            }
        }
    }

    public final void i4(ArrayList arrayList, long j3) {
        if (j3 != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            a0.h hVar = this.Q7;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.InputPeer l1 = l1(((TLRPC.Dialog) arrayList.get(i7)).f28402id);
                    if (!(l1 instanceof TLRPC.TL_inputPeerChannel) || l1.access_hash != 0) {
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer.peer = l1;
                        long n10 = n5.n(l1);
                        Long l10 = (Long) hVar.f(n10);
                        if (l10 == null || System.currentTimeMillis() - l10.longValue() > 240000) {
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            hVar.k(Long.valueOf(System.currentTimeMillis()), n10);
                        }
                    }
                }
            } else {
                TLRPC.InputPeer l12 = l1(j3);
                if (!(l12 instanceof TLRPC.TL_inputPeerChannel) || l12.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer2.peer = l12;
                    long n11 = n5.n(l12);
                    Long l11 = (Long) hVar.f(n11);
                    if (l11 == null || System.currentTimeMillis() - l11.longValue() > 240000) {
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer2);
                        hVar.k(Long.valueOf(System.currentTimeMillis()), n11);
                    }
                } else {
                    return;
                }
            }
            if (tL_messages_getPeerDialogs.peers.isEmpty()) {
                return;
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new nj(this, 0));
        }
    }

    public final boolean i5() {
        String str = this.E6;
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

    public final void j(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.f28398id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z10 = chat.call_active;
        int i7 = ls.A2;
        if (z10 && chat.call_not_empty && chat.migrated_to == null && !v3.r0(chat)) {
            if (chat2 == null) {
                hashMap.put(Long.valueOf(chat.f28398id), chat);
                getNotificationCenter().k(i7, new Object[0]);
            }
        } else if (chat2 == null) {
        } else {
            hashMap.remove(Long.valueOf(chat.f28398id));
            getNotificationCenter().k(i7, new Object[0]);
        }
    }

    public final void j0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        long j3;
        if (user != null) {
            j3 = user.f28547id;
        } else if (chat2 != null) {
            j3 = chat2.f28398id;
        } else {
            j3 = 0;
        }
        W(-chat.f28398id, j3);
    }

    public final TLRPC.InputChannel j1(long j3) {
        return k1(O0(Long.valueOf(j3)));
    }

    public final void j3() {
        if (this.U0) {
            return;
        }
        this.U0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new nj(this, 26));
    }

    public final void j4(TLRPC.InputPeer inputPeer, long j3) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (j3 == 0) {
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
                j3 = getMessagesStorage().z(nativeByteBuffer);
                long j10 = j3;
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ho(this, inputPeer, j10, 8));
            }
            j3 = getMessagesStorage().z(nativeByteBuffer);
        }
        long j102 = j3;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new ho(this, inputPeer, j102, 8));
    }

    public final boolean j5() {
        String str = this.F6;
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

    public final void k() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.f28547id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        e4(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.f28547id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        e4(tL_userForeign_old22, true, false);
    }

    public final void k0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i7) {
        long j3;
        TLRPC.InputPeer n1;
        if (user != null) {
            j3 = user.f28547id;
        } else if (chat2 != null) {
            j3 = chat2.f28398id;
        } else {
            j3 = 0;
        }
        long j10 = j3;
        if (i7 == 0) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new op(3, -chat.f28398id, j10, messagesStorage));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = k1(chat);
        if (user != null) {
            n1 = p1(user);
        } else {
            n1 = n1(chat2);
        }
        tL_channels_deleteParticipantHistory.participant = n1;
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new q6(this, chat, user, chat2, 2));
    }

    public final void k2(long j3, TLRPC.User user, TLRPC.Chat chat) {
        if (user != null || chat != null) {
            SharedPreferences.Editor edit = this.f25821g7.edit();
            edit.putInt("dialog_bar_vis3" + j3, 3);
            edit.remove("dialog_bar_invite" + j3);
            edit.commit();
            if (!n5.C(j3)) {
                TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
                if (user != null) {
                    tL_messages_hidePeerSettingsBar.peer = l1(user.f28547id);
                } else {
                    tL_messages_hidePeerSettingsBar.peer = l1(-chat.f28398id);
                }
                getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new fi.k5(13));
            }
        }
    }

    public final void k3(TLRPC.Chat chat, long j3) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j10 = chat.f28398id;
            a0.h hVar = this.f25778c1;
            if (hVar.h(j10) < 0) {
                int i7 = (chat.access_hash > 0L ? 1 : (chat.access_hash == 0L ? 0 : -1));
                if (i7 == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.f28398id;
                    tL_inputPeerChannel.peer = l1(chat.fromMessageDialogId);
                    tL_inputPeerChannel.msg_id = chat.fromMessageId;
                } else if (i7 == 0) {
                    if (j3 != 0) {
                        getMessagesStorage().q1(j3);
                        return;
                    }
                    return;
                } else {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChannel.channel_id = chat.f28398id;
                    tL_inputPeerChannel.access_hash = chat.access_hash;
                }
                hVar.k(Boolean.TRUE, chat.f28398id);
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = tL_inputPeerChannel;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                if (j3 == 0) {
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
                        j3 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new ho(this, j3, chat, 2));
                    }
                    j3 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new ho(this, j3, chat, 2));
            }
        }
    }

    public final void k4(long j3) {
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        tL_users_getUsers.f28541id.add(q1(j3));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new nj(this, 7));
    }

    public final boolean k5(TLRPC.User user) {
        if (user != null && user.f28547id == this.m0) {
            return true;
        }
        String str = this.F6;
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

    public final void l(ArrayList arrayList, long j3) {
        int i7;
        a0.h hVar = this.L0;
        SparseArray sparseArray = (SparseArray) hVar.f(j3);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, j3);
            this.M0++;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((gj) sparseArray.valueAt(i10)).f24220v0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i12 = 0; i12 < size2; i12++) {
            gj gjVar = (gj) arrayList.get(i12);
            if (gjVar.D == 17) {
                TLRPC.MessageMedia messageMedia = gjVar.f24177k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i7 = poll.close_date) != 0) {
                        if (i7 <= currentTime) {
                            z10 = true;
                        } else {
                            i11 = Math.min(i11, i7 - currentTime);
                        }
                    }
                    int e12 = gjVar.e1();
                    gj gjVar2 = (gj) sparseArray.get(e12);
                    if (gjVar2 != null) {
                        gjVar2.f24220v0 = true;
                    } else {
                        sparseArray.put(e12, gjVar);
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
            vo W0 = W0(e10);
            ArrayList arrayList = W0.f27411b;
            if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
                W0.e(photo.f28422id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.f28532id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User c22 = c2(Long.valueOf(getUserConfig().e()));
            if (c22 == null) {
                c22 = getUserConfig().f();
            }
            if (c22 == null) {
                return;
            }
            if (c22.photo != null) {
                ur messagesStorage = getMessagesStorage();
                messagesStorage.f27214a.c(new op(4, c22.f28547id, c22.photo.photo_id, messagesStorage));
            }
            getNotificationCenter().k(ls.f25292j0, new Object[0]);
            getNotificationCenter().k(ls.f25335r, Integer.valueOf(I8));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new mj(this, e10, 9));
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.f28531id.add(tL_inputPhoto);
        W0(e10).e(tL_inputPhoto.f28417id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public final TLRPC.InputPeer l1(long j3) {
        if (j3 == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j3 < 0) {
            long j10 = -j3;
            TLRPC.Chat O0 = O0(Long.valueOf(j10));
            if (v3.T(O0)) {
                if (O0 != null && O0.access_hash == 0) {
                    long j11 = O0.fromMessageDialogId;
                    if (j11 != 0 && j11 != j3 && O0.fromMessageId != 0) {
                        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                        tL_inputPeerChannelFromMessage.channel_id = j10;
                        tL_inputPeerChannelFromMessage.peer = l1(O0.fromMessageDialogId);
                        tL_inputPeerChannelFromMessage.msg_id = O0.fromMessageId;
                        return tL_inputPeerChannelFromMessage;
                    }
                }
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChannel.channel_id = j10;
                tL_inputPeerChannel.access_hash = O0.access_hash;
                return tL_inputPeerChannel;
            }
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j10;
            return tL_inputPeerChat;
        }
        TLRPC.User c22 = c2(Long.valueOf(j3));
        if (c22 != null && c22.access_hash == 0) {
            long j12 = c22.fromMessageDialogId;
            if (j12 != 0 && j12 != j3 && c22.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = j3;
                tL_inputPeerUserFromMessage.peer = l1(c22.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = c22.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = j3;
        if (c22 != null) {
            tL_inputPeerUser.access_hash = c22.access_hash;
        }
        return tL_inputPeerUser;
    }

    public final void l2() {
        if (this.A2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = l1(this.A2.f28402id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new fi.k5(13));
        Utilities.d.c(new sj(this, 19));
        r4();
    }

    public final void l3(TLRPC.InputPeer inputPeer, long j3) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long n10 = n5.n(inputPeer);
            a0.h hVar = this.f25787d1;
            if (hVar.h(n10) >= 0) {
                return;
            }
            hVar.k(Boolean.TRUE, n10);
            if (s2.f26694a) {
                a8.b("load unknown dialog " + n10);
            }
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = inputPeer;
            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
            if (j3 == 0) {
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
                    j3 = getMessagesStorage().z(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new mk(1, j3, n10, this));
                }
                j3 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new mk(1, j3, n10, this));
        }
    }

    public final void l4(long j3, HashMap hashMap, int i7) {
        boolean z10;
        HashMap hashMap2;
        a0.h hVar;
        boolean z11 = false;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 == 3) {
            z11 = true;
        }
        if (z10) {
            hashMap2 = this.I1;
            hVar = this.J1;
        } else if (z11) {
            hashMap2 = this.K1;
            hVar = this.L1;
        } else {
            hashMap2 = this.G1;
            hVar = this.H1;
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
            getConnectionsManager().sendRequest(getwebpagepreview, new ii.e(this, hashMap3, str, hVar2, j3, i7));
        }
    }

    public final void m(final long j3, final TLRPC.User user, int i7, String str, final org.telegram.ui.ActionBar.g2 g2Var, final boolean z10, final Runnable runnable, final yo yoVar, final y10 y10Var) {
        boolean z11;
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (yoVar != null) {
                yoVar.e(null);
            }
            if (y10Var != null) {
                y10Var.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat O0 = O0(Long.valueOf(j3));
        final boolean T = v3.T(O0);
        if (T && O0.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        final boolean z12 = z11;
        final TLRPC.InputUser s12 = s1(user);
        if (str != null && (!T || z12)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = s12;
            if (T) {
                tL_messages_startBot.peer = l1(-j3);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j3;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.f22772b.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (T) {
            if (s12 instanceof TLRPC.TL_inputUserSelf) {
                Long valueOf = Long.valueOf(j3);
                ArrayList arrayList = this.f25872n;
                if (arrayList.contains(valueOf)) {
                    if (yoVar != null) {
                        yoVar.e(null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = j1(j3);
                arrayList.add(Long.valueOf(j3));
                tL_messages_addChatUser = tL_channels_joinChannel;
            } else {
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = j1(j3);
                tL_channels_inviteToChannel.users.add(s12);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j3;
            tL_messages_addChatUser2.fwd_limit = i7;
            tL_messages_addChatUser2.user_id = s12;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z13;
                final np npVar = np.this;
                final boolean z14 = T;
                final TLRPC.InputUser inputUser = s12;
                long j10 = j3;
                if (z14 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    g0.g3(new jk(npVar, j10, 12));
                }
                y10 y10Var2 = y10Var;
                Runnable runnable2 = runnable;
                TLRPC.User user2 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        g0.g3(new gi(20, y10Var2, runnable2));
                        return;
                    } else if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user2.f28547id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        g0.g3(new gm(npVar, y10Var2, tL_messages_invitedUsers, j10, 0));
                        return;
                    } else {
                        g0.g3(new gg(y10Var2, 7));
                        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z10) {
                            if (runnable2 != null) {
                                g0.g3(runnable2);
                                return;
                            }
                            return;
                        }
                        final yo yoVar2 = yoVar;
                        final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        final TLObject tLObject2 = tL_messages_addChatUser3;
                        final boolean z15 = z12;
                        if (yoVar2 != null) {
                            g0.g3(new lh(npVar, yoVar2, tL_error, g2Var2, tLObject2, z14, z15));
                        }
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z16;
                                np npVar2 = np.this;
                                yo yoVar3 = yoVar2;
                                boolean z17 = z14;
                                if (yoVar3 == null) {
                                    int i10 = npVar2.currentAccount;
                                    if (z17 && !z15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    org.telegram.ui.Components.c5.c0(i10, tL_error, g2Var2, tLObject2, Boolean.valueOf(z16));
                                }
                                if (z17 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                                    npVar2.getNotificationCenter().k(ls.f25335r, 8192);
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
                    g0.g3(new d4(npVar, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                    updates = tL_messages_invitedUsers2.updates;
                } else if (tLObject instanceof TLRPC.Updates) {
                    updates = (TLRPC.Updates) tLObject;
                } else {
                    a8.d("unexpected " + tLObject + " in addUserToChat");
                    g0.g3(new gg(y10Var2, 8));
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
                npVar.V3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    g0.g3(new im(npVar, updates, y10Var2, tL_messages_invitedUsers2, j10, 0));
                    return;
                }
                if (z14) {
                    if (!z13 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        npVar.D0(j10, true);
                    }
                    g0.h3(new jk(npVar, j10, 14), 1000L);
                }
                if (z14 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    npVar.getMessagesStorage().R1(-j10, j10, new ArrayList(), null);
                }
                if (runnable2 != null) {
                    g0.g3(runnable2);
                }
                if (y10Var2 != null) {
                    g0.g3(new gg(y10Var2, 6));
                }
                if (p10.C(user2) && !v3.V(O0) && z13) {
                    g0.g3(new jk(npVar, j10, 13));
                }
            }
        });
    }

    public final void m2(org.telegram.ui.ActionBar.l6 l6Var, org.telegram.ui.ActionBar.j6 j6Var, boolean z10) {
        TLRPC.TL_theme tL_theme;
        String str;
        boolean z11;
        boolean z12;
        if (j6Var != null) {
            tL_theme = j6Var.f29077r;
        } else {
            tL_theme = l6Var.G;
        }
        if (j6Var != null) {
            str = j6Var.f29074o;
        } else {
            str = l6Var.f29205e;
        }
        if (j6Var == null && l6Var.h) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j6Var != null) {
            z12 = j6Var.f29076q;
        } else {
            z12 = l6Var.f29214n;
        }
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z10;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f28469id = tL_theme.f28537id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new fi.k5(13));
        if (!TextUtils.isEmpty(str)) {
            TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = str;
            installwallpaper.wallpaper = tL_inputWallPaperSlug;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            installwallpaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.blur = z11;
            tL_wallPaperSettings.motion = z12;
            getConnectionsManager().sendRequest(installwallpaper, new fi.k5(13));
        }
    }

    public final void m3() {
        HashSet hashSet = this.F7;
        hashSet.clear();
        String string = this.h7.getString("unreadOnlyFilters", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(",")) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    public final void m4(ArrayList arrayList, long j3) {
        int i7 = 0;
        int i10 = this.U.get(j3, 0);
        if (i10 != 0) {
            int size = arrayList.size();
            while (i7 < size) {
                if (((TLRPC.Message) arrayList.get(i7)).f28419id <= i10) {
                    arrayList.remove(i7);
                    i7--;
                    size--;
                }
                i7++;
            }
        }
    }

    public final void m5(long j3, boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = j1(j3);
        tL_channels_toggleForum.enabled = z10;
        tL_channels_toggleForum.tabs = z11;
        tL_channels_toggleForum.sidebar = z12;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new nj(this, 16), 64);
        getNotificationCenter().k(ls.f25361u5, Long.valueOf(j3), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12));
    }

    public final void n(long j3, TLRPC.User user, String str, org.telegram.ui.ActionBar.g2 g2Var, Runnable runnable) {
        m(j3, user, 0, str, g2Var, false, runnable, null, null);
    }

    public final boolean n0() {
        int i7 = 0;
        while (true) {
            so[] soVarArr = this.N;
            if (i7 < soVarArr.length) {
                if (x0(soVarArr[i7])) {
                    return true;
                }
                i7++;
            } else {
                return q2();
            }
        }
    }

    public final void n2(int i7) {
        this.f25786d0.remove(i7);
        getNotificationCenter().k(ls.C5, Integer.valueOf(i7));
    }

    public final void n3(TLRPC.User user, boolean z10, int i7) {
        ur messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.f27214a.c(new mb(i7, 3, messagesStorage, user, z10));
        }
    }

    public final void n4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j3 = dialog.f28402id;
        if (this.F.remove(dialog) && n5.y(dialog)) {
            Utilities.d.c(new jk(this, j3, 9));
        }
        this.f25972y.remove(dialog);
        this.H.remove(dialog);
        this.I.remove(dialog);
        this.G.remove(dialog);
        this.J.remove(dialog);
        this.M.remove(dialog);
        this.K.remove(dialog);
        this.L.remove(dialog);
        this.E.remove(dialog);
        int i7 = 0;
        while (true) {
            so[] soVarArr = this.N;
            if (i7 >= soVarArr.length) {
                break;
            }
            so soVar = soVarArr[i7];
            if (soVar != null) {
                soVar.f26858k.remove(dialog);
                this.N[i7].f26859l.remove(dialog);
            }
            i7++;
        }
        this.H7.remove(dialog);
        this.R.l(j3);
        ArrayList arrayList = (ArrayList) this.f25952w.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
        o4(dialog);
    }

    public final void n5(long j3, boolean z10) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = j1(j3);
        tL_channels_togglePreHistoryHidden.enabled = z10;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new nj(this, 12), 64);
    }

    public final void o(TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, int i7, q0.a aVar, q0.a aVar2, mc0 mc0Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j3 = chat2.f28398id;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            m(j3, user, i7, null, g2Var, false, new gi(25, aVar, user), new o(4, aVar2, user), new hk(this, tL_messages_invitedUsers, iArr, size, chat2, mc0Var));
            e4(user, false, false);
            chat2 = chat;
        }
    }

    public final void o0(int i7, long j3, SparseArray sparseArray) {
        Utilities.d.c(new qk(this, i7, 1));
        if (sparseArray != null) {
            g0.g3(new d4(this, j3, sparseArray, 15));
        }
    }

    public final TLRPC.InputPeer o1(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.Chat O0 = O0(Long.valueOf(peer.channel_id));
            if (O0 != null && O0.access_hash == 0) {
                long j3 = O0.fromMessageDialogId;
                if (j3 != 0 && j3 != peer.channel_id && O0.fromMessageId != 0) {
                    TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannelFromMessage.channel_id = peer.channel_id;
                    tL_inputPeerChannelFromMessage.peer = l1(O0.fromMessageDialogId);
                    tL_inputPeerChannelFromMessage.msg_id = O0.fromMessageId;
                    return tL_inputPeerChannelFromMessage;
                }
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = peer.channel_id;
            if (O0 != null) {
                tL_inputPeerChannel.access_hash = O0.access_hash;
            }
            return tL_inputPeerChannel;
        } else {
            TLRPC.User c22 = c2(Long.valueOf(peer.user_id));
            if (c22 != null && c22.access_hash == 0 && c22.fromMessageDialogId != 0 && c22.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = peer.user_id;
                tL_inputPeerUserFromMessage.peer = l1(c22.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = c22.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = peer.user_id;
            if (c22 != null) {
                tL_inputPeerUser.access_hash = c22.access_hash;
            }
            return tL_inputPeerUser;
        }
    }

    public final void o2() {
        this.f25925s8 = null;
        this.f25916r8 = 0L;
    }

    public final void o3() {
        g0.r(this.D8);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
        no noVar = this.F8;
        if (tL_webBrowserSettings == null) {
            noVar.e(this.currentAccount, null, new bl(this, 0));
        }
        noVar.d(this.currentAccount, null);
        noVar.c(this.currentAccount, null, new bo(this, 2));
    }

    public final void o4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j3 = dialog.f28402id;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        a0.h hVar = this.f25962x;
        if (i7 > 0) {
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (c22 != null) {
                long j10 = c22.linked_community_id;
                if (j10 != 0 && (arrayList2 = (ArrayList) hVar.f(j10)) != null) {
                    arrayList2.remove(dialog);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat O0 = O0(Long.valueOf(-j3));
        if (O0 != null) {
            long j11 = O0.linked_community_id;
            if (j11 != 0 && (arrayList = (ArrayList) hVar.f(j11)) != null) {
                arrayList.remove(dialog);
            }
        }
    }

    public final void o5(final long j3, final long j10, boolean z10, boolean z11, final boolean z12, final Runnable runnable, final Runnable runnable2) {
        TLRPC.InputUser tL_inputUserEmpty;
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = j1(j3);
        tL_channels_toggleJoinRequest.enabled = z10;
        tL_channels_toggleJoinRequest.apply_to_invites = z11;
        if (z12) {
            if (j10 != 0) {
                tL_inputUserEmpty = q1(j10);
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
                    final np npVar = np.this;
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    final boolean z13 = z12;
                    final long j11 = j3;
                    final long j12 = j10;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            TLRPC.ChatFull P0;
                            boolean z14;
                            np npVar2 = np.this;
                            if (z13 && (P0 = npVar2.P0(j11)) != null) {
                                int i7 = P0.flags2;
                                long j13 = j12;
                                if (j13 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                P0.flags2 = c8.ed.b(i7, 8388608, z14);
                                P0.guard_bot_id = j13;
                                npVar2.getMessagesStorage().N1(P0, false);
                                ls notificationCenter = npVar2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(ls.T, P0, 0, bool, bool);
                            }
                            npVar2.getNotificationCenter().k(ls.f25335r, 8192);
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

    public final void p(String str, boolean z10) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z10;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new bl(this, 4));
    }

    public final void p0(boolean z10) {
        TLRPC.UserFull d2 = d2(getUserConfig().e());
        if (d2 != null) {
            d2.sponsored_enabled = false;
            getMessagesStorage().j2(d2, false);
            if (z10) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final void p2(int i7, long j3) {
        if (this.f25909r1.contains(Long.valueOf(j3))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.f25919s1;
        int indexOfKey = longSparseLongArray.indexOfKey(j3);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        c3(c2(Long.valueOf(j3)), i7, true, null);
    }

    public final void p3() {
        boolean z10;
        if (!getUserConfig().q() && this.Q0.size() - 1 > this.O4) {
            int size = (this.Q0.size() - 1) - this.O4;
            ArrayList arrayList = new ArrayList(this.Q0);
            Collections.reverse(arrayList);
            z10 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (i7 < size) {
                    if (!((so) arrayList.get(i7)).f26863p) {
                        z10 = true;
                    }
                    ((so) arrayList.get(i7)).f26863p = true;
                } else {
                    if (((so) arrayList.get(i7)).f26863p) {
                        z10 = true;
                    }
                    ((so) arrayList.get(i7)).f26863p = false;
                }
            }
        } else {
            z10 = false;
        }
        if (z10) {
            getNotificationCenter().k(ls.O2, new Object[0]);
        }
    }

    public final void p4(so soVar) {
        this.Q0.remove(soVar);
        this.T0.remove(soVar.f26850a);
        Integer valueOf = Integer.valueOf(soVar.f26850a);
        HashSet hashSet = this.F7;
        if (hashSet.remove(valueOf)) {
            I4();
        }
        if (hashSet.contains(0)) {
            f5(null);
        }
        getNotificationCenter().k(ls.O2, new Object[0]);
    }

    public final void p5(long j3, int i7, boolean z10, hi.k9 k9Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = l1(j3);
        tL_messages_toggleNoForwards.enabled = z10;
        if (i7 > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i7;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new gl(this, k9Var, 1), 64);
    }

    public final void q(org.telegram.tgnet.TLRPC.TL_jsonObject r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.q(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    public final void q0(long j3, int i7, long j10) {
        getMessagesStorage().q1(j3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i7));
        ur messagesStorage = getMessagesStorage();
        messagesStorage.f27214a.c(new hr(messagesStorage, arrayList, j10, 2));
    }

    public final TLRPC.InputUser q1(long j3) {
        return s1(c2(Long.valueOf(j3)));
    }

    public final boolean q2() {
        if (this.Q0.size() <= 1 || !this.F7.contains(0)) {
            return false;
        }
        return true;
    }

    public final void q3(final long r18, final int r20, int r21, final int r22, boolean r23, final long r24, int r26, final boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.q3(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public final void q4(int i7) {
        long j3 = 2305843009213693952L | i7;
        a0.h hVar = this.R;
        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j3);
        if (dialog == null) {
            return;
        }
        hVar.l(j3);
        this.f25972y.remove(dialog);
        f5(null);
        getNotificationCenter().k(ls.f25342s, new Object[0]);
        getNotificationCenter().k(ls.f25257d0, Integer.valueOf(i7));
    }

    public final void q5(long j3, boolean z10) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = j1(j3);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z10;
        TLRPC.Chat O0 = O0(Long.valueOf(j3));
        if (O0 != null) {
            O0.collapsed_in_dialogs = z10;
            X3(O0, true);
            f5(null);
            getNotificationCenter().k(ls.W5, Long.valueOf(j3), Boolean.valueOf(z10));
            getNotificationCenter().k(ls.f25342s, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new d3.b(1), new jh.b(2));
    }

    public final void r(ArrayList arrayList) {
        SharedPreferences.Editor edit = u1(this.currentAccount).f25821g7.edit();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                zs zsVar = getNotificationsController().f28152h0;
                zsVar.getClass();
                long B1 = gj.B1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(a8.p0.o(B1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + B1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(zsVar.f28338a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) != 0) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                            edit.putInt("notify2_" + B1, 2);
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        } else {
                            edit.putInt("notify2_" + B1, 3);
                            edit.putInt(a8.p0.o(B1, "notifyuntil_"), dialog.notify_settings.mute_until);
                        }
                    } else {
                        edit.putInt("notify2_" + B1, 0);
                    }
                } else {
                    edit.remove("notify2_" + B1);
                }
            }
        }
        edit.apply();
    }

    public final TLRPC.InputUser r1(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (inputPeer.access_hash == 0) {
            TLRPC.User c22 = c2(Long.valueOf(inputPeer.user_id));
            if (c22.access_hash == 0 && c22.fromMessageDialogId != 0 && c22.fromMessageId != 0) {
                TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
                tL_inputUserFromMessage.user_id = inputPeer.user_id;
                tL_inputUserFromMessage.peer = l1(c22.fromMessageDialogId);
                tL_inputUserFromMessage.msg_id = c22.fromMessageId;
                return tL_inputUserFromMessage;
            }
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public final boolean r2(TLRPC.Chat chat) {
        TLRPC.Chat O0;
        if (chat == null) {
            return false;
        }
        TLRPC.InputChannel inputChannel = chat.migrated_to;
        if (inputChannel != null && (O0 = O0(Long.valueOf(inputChannel.channel_id))) != null) {
            return O0.noforwards;
        }
        return chat.noforwards;
    }

    public final void r3(long j3, TLRPC.InputPeer inputPeer, long j10) {
        long j11;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j3);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                j11 = j3;
                u2(j11, 0L, null);
            } else {
                j11 = j3;
            }
            getNotificationCenter().k(ls.f25335r, 256);
            getMessagesStorage().F1(j11, true);
            if (n0()) {
                f5(null);
                getNotificationCenter().k(ls.f25342s, new Object[0]);
            }
        } else {
            j11 = j3;
        }
        if (!n5.C(j11)) {
            TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
            tL_messages_markDialogUnread.unread = true;
            if (inputPeer == null) {
                inputPeer = l1(j11);
            }
            if (!(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = inputPeer;
                tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
                if (j10 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
                        try {
                            nativeByteBuffer.writeInt32(9);
                            nativeByteBuffer.writeInt64(j11);
                            inputPeer.serializeToStream(nativeByteBuffer);
                        } catch (Exception e10) {
                            exc = e10;
                            nativeByteBuffer2 = nativeByteBuffer;
                            a8.g(exc, true);
                            nativeByteBuffer = nativeByteBuffer2;
                            j10 = getMessagesStorage().z(nativeByteBuffer);
                            getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new mj(this, j10, 10));
                        }
                    } catch (Exception e11) {
                        exc = e11;
                    }
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new mj(this, j10, 10));
            }
        }
    }

    public final void r4() {
        TLRPC.Dialog dialog = this.A2;
        if (dialog == null) {
            return;
        }
        long j3 = dialog.f28402id;
        if (j3 < 0) {
            TLRPC.Chat O0 = O0(Long.valueOf(-j3));
            if (v3.r0(O0) || O0.restricted) {
                n4(this.A2);
            }
        } else {
            n4(dialog);
        }
        this.A2 = null;
        f5(null);
        getNotificationCenter().k(ls.f25342s, new Object[0]);
    }

    public final void r5(Runnable runnable, long j3) {
        TLRPC.Chat O0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j3 > 0) {
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (c22 != null) {
                user = c22;
                O0 = null;
            } else {
                return;
            }
        } else {
            O0 = O0(Long.valueOf(-j3));
            if (O0 == null) {
                return;
            }
        }
        this.I0--;
        this.H0.delete(j3);
        if (user != null) {
            tL_contacts_unblock.f28446id = p1(user);
        } else {
            tL_contacts_unblock.f28446id = n1(O0);
        }
        getNotificationCenter().k(ls.f25274g0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new s1(runnable, 3));
    }

    public final boolean s(ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i7 = 0;
        boolean z10 = false;
        while (i7 < size) {
            TL_update.TL_updateFolderPeers tL_updateFolderPeers = (TL_update.TL_updateFolderPeers) arrayList.get(i7);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(n5.o(tL_folderPeer.peer));
                if (dialog != null) {
                    int i11 = dialog.folder_id;
                    int i12 = tL_folderPeer.folder_id;
                    if (i11 != i12) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i12;
                        this.f25856l0 = true;
                        D();
                    }
                }
            }
            getMessagesStorage().G1(((TL_update.TL_updateFolderPeers) arrayList.get(i7)).folder_peers, null, 0L, 0);
            i7++;
            z10 = true;
        }
        return z10;
    }

    public final void s0(int i7, boolean[] zArr) {
        ArrayList arrayList;
        if (i7 == 0) {
            return;
        }
        long j3 = 2305843009213693952L | i7;
        a0.h hVar = this.R;
        if (((TLRPC.Dialog) hVar.f(j3)) instanceof TLRPC.TL_dialogFolder) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.f28402id = j3;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.f28449id = i7;
        tL_folder.title = hd.N0(2131754133, null);
        tL_dialogFolder.pinned = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f25972y;
            if (i10 >= arrayList.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (!dialog.pinned) {
                if (dialog.f28402id != this.C2) {
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
        hVar.k(tL_dialogFolder, j3);
        arrayList.add(0, tL_dialogFolder);
    }

    public final TLRPC.InputUser s1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.f28547id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
            tL_inputUserFromMessage.user_id = user.f28547id;
            tL_inputUserFromMessage.peer = l1(user.fromMessageDialogId);
            tL_inputUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputUserFromMessage;
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.f28547id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public final boolean s2(long j3) {
        if (j3 < 0) {
            return v3.Y(O0(Long.valueOf(-j3)));
        }
        return false;
    }

    public final void s3(ArrayList arrayList, long j3) {
        ArrayList arrayList2 = (ArrayList) this.S.f(j3);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                gj gjVar = (gj) arrayList2.get(i7);
                if (gjVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (gjVar.e1() == ((Integer) arrayList.get(i10)).intValue()) {
                            gjVar.Z = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public final void s4(long j3, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 == 0) {
                TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.X3;
                int i10 = ls.f25344s1;
                if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                    this.X3 = null;
                    getNotificationCenter().k(i10, new Object[0]);
                } else if (!this.V3.remove(str) && this.W3.contains(str)) {
                    return;
                } else {
                    this.W3.add(str);
                    SharedPreferences.Editor edit = this.h7.edit();
                    edit.putStringSet("pendingSuggestions", this.V3);
                    edit.putStringSet("dismissedSuggestions", this.W3);
                    edit.commit();
                    getNotificationCenter().k(i10, new Object[0]);
                }
            }
            TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
            tL_help_dismissSuggestion.suggestion = str;
            if (i7 == 0) {
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_help_dismissSuggestion.peer = l1(j3);
            }
            getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new fi.k5(13));
        }
    }

    public final void s5(long j3, TLRPC.EmojiStatus emojiStatus, TL_stars.StarGift starGift) {
        boolean z10;
        TLRPC.EmojiStatus emojiStatus2;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        if (j3 != 0 && j3 != getUserConfig().e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && (starGift instanceof TL_stars.TL_starGiftUnique)) {
            emojiStatus2 = r0((TL_stars.TL_starGiftUnique) starGift);
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
                getNotificationCenter().k(ls.f25328p5, f10);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j10 = -j3;
            tL_channels_updateEmojiStatus2.channel = j1(j10);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat O0 = O0(Long.valueOf(j10));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (O0 != null) {
                O0.flags |= 512;
                O0.emoji_status = emojiStatus2;
                X3(O0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().v5(j3, emojiStatus2);
        getNotificationCenter().k(ls.f25335r, 524288);
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public final void t(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (c8.ed.a(tL_updateWebBrowserException.flags, 1)) {
                if (tL_updateWebBrowserException.open_external_browser) {
                    m0(this.E8.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    m0(this.E8.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                m0(this.E8.external_exceptions, tL_updateWebBrowserException.exception);
                m0(this.E8.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            m0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            m0(this.E8.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            m0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            m0(this.E8.external_exceptions, tL_updateWebBrowserException.exception);
        }
        c5(this.E8);
    }

    public final Runnable t0(long j3, int i7, bp bpVar) {
        int i10;
        long j10;
        int i11;
        np npVar;
        SharedPreferences sharedPreferences = u1(this.currentAccount).f25821g7;
        if (i7 == 0) {
            i10 = sharedPreferences.getInt("diditem" + j3, 0);
        } else {
            i10 = i7;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        if (n5.z(j3)) {
            j10 = -j3;
        } else {
            j10 = 0;
        }
        if (j10 != 0 && getMessagesController().O0(Long.valueOf(j10)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new nk(this, zArr, messagesStorage, j10, runnableArr, j3, i10, bpVar));
            return new ok(zArr, runnableArr, 0);
        }
        if (g0.Q1()) {
            i11 = 30;
        } else {
            i11 = 20;
        }
        int i12 = i11;
        int i13 = i10;
        lo loVar = new lo(this, generateClassGuid, i12, i13, j3, bpVar);
        getNotificationCenter().b(loVar, ls.H);
        getNotificationCenter().b(loVar, ls.I);
        if (i13 != 0) {
            npVar = this;
            npVar.f3(j3, 0L, true, i12, i13, 0, true, 0, generateClassGuid, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            npVar = this;
            npVar.f3(j3, 0L, true, i12, i13, 0, true, 0, generateClassGuid, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new qk(npVar, generateClassGuid, 0);
    }

    public final boolean t2(long j3, long j10) {
        return u2(j3, j10, null);
    }

    public final void t3(long j3) {
        SharedPreferences.Editor edit = this.f25821g7.edit();
        edit.putBoolean("dialog_bar_replied" + j3, true).apply();
        g0.g3(new jk(this, j3, 10));
    }

    public final void t4(ch.p0 r40, java.lang.String r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.t4(ch.p0, java.lang.String):void");
    }

    public final void t5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        s5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final void u(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.E8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        c5(tL_webBrowserSettings);
    }

    public final boolean u2(long j3, long j10, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb2 = new StringBuilder("notify2_");
        boolean z10 = false;
        sb2.append(ys.v(j3, j10, false));
        String sb3 = sb2.toString();
        SharedPreferences sharedPreferences = this.f25821g7;
        int i7 = sharedPreferences.getInt(sb3, -1);
        if (i7 == -1) {
            if (chat != null) {
                if (v3.T(chat) && !chat.megagroup) {
                    z10 = true;
                }
                bool = Boolean.valueOf(z10);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            if (j10 != 0) {
                return u2(j3, 0L, chat);
            }
            return !getNotificationsController().D(j3, bool2, false, false);
        } else if (i7 == 2) {
            return true;
        } else {
            if (i7 == 3) {
                if (sharedPreferences.getInt("notifyuntil_" + ys.v(j3, j10, false), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void u3(long j3, int i7, long j10) {
        ur messagesStorage = getMessagesStorage();
        messagesStorage.f27214a.c(new vq(messagesStorage, i7, -j3, j10, 0));
        if (j3 != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = j1(j3);
            tL_channels_readMessageContents.f28437id.add(Integer.valueOf(i7));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new fi.k5(13));
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.f28503id.add(Integer.valueOf(i7));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new nj(this, 14));
    }

    public final void u4(int i7, long j3, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i7;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j3 == 0) {
            ArrayList Y0 = Y0(i7);
            if (Y0.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = Y0.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) Y0.get(i11);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!dialog.pinned) {
                        if (dialog.f28402id != this.C2) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(dialog.f28402id));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!n5.C(dialog.f28402id)) {
                            TLRPC.InputPeer l1 = l1(dialog.f28402id);
                            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-dialog.f28402id));
                            if (v3.Y(O0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().j1(O0.f28398id);
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeerCommunity);
                                objectSize = tL_inputDialogPeerCommunity.getObjectSize();
                            } else {
                                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                tL_inputDialogPeer.peer = l1;
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                                objectSize = tL_inputDialogPeer.getObjectSize();
                            }
                            i10 += objectSize;
                        }
                    }
                }
            }
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new tp(messagesStorage, arrayList2, arrayList3, 0));
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(i10 + 12);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                nativeByteBuffer.writeInt32(16);
                nativeByteBuffer.writeInt32(i7);
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
                j3 = getMessagesStorage().z(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new mj(this, j3, 0));
            }
            j3 = getMessagesStorage().z(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new mj(this, j3, 0));
    }

    public final void u5() {
        int intValue;
        long longValue;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        ConcurrentHashMap concurrentHashMap = this.f25924s7;
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
            long j3 = currentTimeMillis;
            if (j3 + longValue2 != this.f25905q7 + this.f25896p7) {
                g0.r(this.f25915r7);
                this.f25905q7 = j3;
                this.f25896p7 = longValue2;
                sj sjVar = new sj(this, 4);
                this.f25915r7 = sjVar;
                g0.h3(sjVar, longValue2 * 1000);
                return;
            }
            return;
        }
        sj sjVar2 = this.f25915r7;
        if (sjVar2 != null) {
            this.f25905q7 = -1L;
            this.f25896p7 = -1L;
            g0.r(sjVar2);
        }
    }

    public final void v(int i7, int i10, long j3, String str, boolean z10) {
        String str2 = j3 + "_" + i7;
        HashMap hashMap = this.f25981y8;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z10;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().l1(j3);
        tL_messages_toggleSuggestedPostApproval.msg_id = i7;
        if (i10 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i10;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z10 && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j3 + "_" + i7, Boolean.valueOf(!z10));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new dm(this, j3, i7, 0));
    }

    public final SharedPreferences v1() {
        return this.h7;
    }

    public final boolean v2(long j3, long j10) {
        return this.f25821g7.getBoolean("sound_enabled_" + ys.v(j3, j10, false), true);
    }

    public final void v3(long j3, long j10) {
        if (!n5.C(j3) && j3 != getUserConfig().e()) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new vq(messagesStorage, j10, j3, 0, 7));
            TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
            tL_messages_readMentions.peer = l1(j3);
            if (j10 != 0) {
                tL_messages_readMentions.top_msg_id = (int) j10;
                tL_messages_readMentions.flags |= 1;
            }
            getConnectionsManager().sendRequest(tL_messages_readMentions, null);
        }
    }

    public final void v4(int i7, long j3, boolean z10) {
        di.r8 r8Var = new di.r8(j3, i7);
        HashSet hashSet = this.f25942u8;
        if (hashSet.contains(r8Var)) {
            return;
        }
        hashSet.add(r8Var);
        this.f25951v8.add(new Pair(r8Var, new AtomicBoolean(z10)));
        sj sjVar = this.f25961w8;
        g0.r(sjVar);
        g0.g3(sjVar);
    }

    public final void v5(long j3, TLRPC.EmojiStatus emojiStatus) {
        int g10 = n5.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f25924s7;
        if (g10 != 0) {
            concurrentHashMap.put(Long.valueOf(j3), Integer.valueOf(g10));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j3))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j3));
        }
        u5();
    }

    public final void w(long j3) {
        TLRPC.Chat O0;
        TLRPC.User user = null;
        if (j3 > 0) {
            TLRPC.User c22 = c2(Long.valueOf(j3));
            if (c22 != null) {
                user = c22;
                O0 = null;
            } else {
                return;
            }
        } else {
            O0 = O0(Long.valueOf(-j3));
            if (O0 == null) {
                return;
            }
        }
        LongSparseIntArray longSparseIntArray = this.H0;
        if (longSparseIntArray.indexOfKey(j3) >= 0) {
            return;
        }
        longSparseIntArray.put(j3, 1);
        if (user != null) {
            if (user.bot) {
                getMediaDataController().Q1(j3);
            } else {
                getMediaDataController().S1(j3);
            }
        }
        int i7 = this.I0;
        if (i7 >= 0) {
            this.I0 = i7 + 1;
        }
        getNotificationCenter().k(ls.f25274g0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.f28441id = p1(user);
        } else {
            tL_contacts_block.f28441id = n1(O0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new fi.k5(13));
    }

    public final void w0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i10);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long o4 = n5.o(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && o4 != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i11);
                        if (o4 == gj.B0(message) && dialog.top_message == message.f28419id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.f28449id;
                            tL_dialog.flags |= 16;
                            tL_messages_peerDialogs.dialogs.add(tL_dialog);
                            TLRPC.Peer peer = dialog.peer;
                            if (peer instanceof TLRPC.TL_peerChannel) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerUser.channel_id = dialog.peer.channel_id;
                                int size3 = tL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i7 >= size3) {
                                        break;
                                    }
                                    TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i7);
                                    if (chat.f28398id == tL_inputPeerUser.channel_id) {
                                        tL_inputPeerUser.access_hash = chat.access_hash;
                                        break;
                                    }
                                    i7++;
                                }
                            } else if (peer instanceof TLRPC.TL_peerChat) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerUser.chat_id = dialog.peer.chat_id;
                            } else {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                                tL_inputPeerUser.user_id = dialog.peer.user_id;
                                int size4 = tL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i7 >= size4) {
                                        break;
                                    }
                                    TLRPC.User user = tL_messages_peerDialogs.users.get(i7);
                                    if (user.f28547id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i7++;
                                }
                            }
                            l3(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
                tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
            }
        }
    }

    public final int w1() {
        hi.u5 u5Var;
        boolean q10 = getUserConfig().q();
        p0 p0Var = this.A7;
        if (q10) {
            u5Var = p0Var.f26190i0;
        } else {
            u5Var = p0Var.f26188h0;
        }
        return ((j0) u5Var.f15495b).f24776c;
    }

    public final boolean w2(TLRPC.Dialog dialog) {
        TLRPC.Chat chat;
        if (dialog != null) {
            if (!dialog.unread_mark) {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    kp S0 = S0(-dialog.f28402id);
                    if (S0.f25081a > 0 || S0.f25082b > 0) {
                    }
                } else {
                    long j3 = dialog.f28402id;
                    if (j3 < 0) {
                        chat = O0(Long.valueOf(-j3));
                    } else {
                        chat = null;
                    }
                    if (chat != null && (chat.forum || (chat.monoforum && v3.A(this.currentAccount, chat, 24)))) {
                        long j10 = chat.f28398id;
                        f00 f00Var = this.f25932t7;
                        if (f00Var.l(j10) == null) {
                            if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !chat.monoforum)) {
                            }
                        } else {
                            f00Var.h(chat.f28398id);
                            int[] iArr = f00.f23770w;
                            if (iArr[0] > 0 || (iArr[1] > 0 && !chat.monoforum)) {
                            }
                        }
                    } else if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !v3.p0(chat))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void w3(long j3, int i7, long j10) {
        TLRPC.EncryptedChat c12;
        if (j10 != 0 && j3 != 0) {
            if ((i7 > 0 || i7 == Integer.MIN_VALUE) && n5.C(j3) && (c12 = c1(Integer.valueOf((int) (j3 & 4294967295L)))) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j10));
                getSecretChatHelper().u(c12, arrayList, null);
                if (i7 > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    ur messagesStorage = getMessagesStorage();
                    messagesStorage.f27214a.c(new tq(messagesStorage, c12.f28406id, arrayList, 0, currentTime, currentTime));
                }
            }
        }
    }

    public final void w4(long j3, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (user != null || chat != null || encryptedChat != null) {
            SharedPreferences.Editor edit = this.f25821g7.edit();
            edit.putInt("dialog_bar_vis3" + j3, 3);
            edit.commit();
            if (n5.C(j3)) {
                if (encryptedChat != null && encryptedChat.access_hash != 0) {
                    TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.f28406id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new fi.k5(13), 2);
                }
            } else if (z10) {
                TL_account.reportPeer reportpeer = new TL_account.reportPeer();
                if (chat != null) {
                    reportpeer.peer = l1(-chat.f28398id);
                } else if (user != null) {
                    reportpeer.peer = l1(user.f28547id);
                }
                reportpeer.message = "";
                reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
                getConnectionsManager().sendRequest(reportpeer, new fi.k5(13), 2);
            } else {
                TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
                if (chat != null) {
                    tL_messages_reportSpam.peer = l1(-chat.f28398id);
                } else if (user != null) {
                    tL_messages_reportSpam.peer = l1(user.f28547id);
                }
                getConnectionsManager().sendRequest(tL_messages_reportSpam, new fi.k5(13), 2);
            }
        }
    }

    public final void w5(so soVar) {
        so soVar2;
        TLRPC.EncryptedChat c12;
        TLRPC.Chat O0;
        ArrayList arrayList = this.f25972y;
        if (soVar != null) {
            ArrayList arrayList2 = soVar.f26858k;
            ArrayList arrayList3 = soVar.f26859l;
            arrayList2.clear();
            arrayList3.clear();
            this.I7 = soVar;
            try {
                Collections.sort(arrayList, this.J7);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
                boolean z10 = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z10) {
                    long j3 = dialog.f28402id;
                    if (!z10 || (O0 = O0(Long.valueOf(-j3))) == null || O0.collapsed_in_dialogs) {
                        if (n5.C(j3) && (c12 = c1(Integer.valueOf((int) (4294967295L & j3)))) != null) {
                            j3 = c12.user_id;
                        }
                        long j10 = j3;
                        soVar2 = soVar;
                        if (soVar2.b(getAccountInstance(), j10, dialog, false)) {
                            if (y(dialog)) {
                                arrayList3.add(dialog);
                            }
                            arrayList2.add(dialog);
                        }
                        i7++;
                        soVar = soVar2;
                    }
                }
                soVar2 = soVar;
                i7++;
                soVar = soVar2;
            }
            try {
                Collections.sort(arrayList, this.K7);
            } catch (Exception unused) {
            }
        }
    }

    public final ab.c0 x(long j3) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull P0 = P0(j3);
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        if (P0 != null && (arrayList = P0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long o4 = n5.o(communityPeer2.peer);
                TLRPC.Chat O0 = O0(Long.valueOf(-o4));
                TLRPC.User c22 = c2(Long.valueOf(o4));
                if (O0 != null || c22 != null) {
                    arrayList2.add(new ro(O0, U0(o4), c22, communityPeer2));
                }
            }
        }
        ab.c0 c0Var = new ab.c0(8);
        ArrayList arrayList3 = (ArrayList) c0Var.d;
        ArrayList arrayList4 = (ArrayList) c0Var.f910e;
        ArrayList arrayList5 = (ArrayList) c0Var.f909c;
        ArrayList arrayList6 = (ArrayList) c0Var.f908b;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj = arrayList2.get(i7);
            i7++;
            ro roVar = (ro) obj;
            int c10 = li.l0.c(roVar.f26605b, roVar.d, roVar.f26606c, roVar.f26604a);
            if (c10 == 1) {
                arrayList6.add(roVar);
            } else if (c10 == 2) {
                arrayList5.add(roVar);
            } else if (c10 == 4) {
                arrayList4.add(roVar);
            } else if (c10 == 3) {
                arrayList3.add(roVar);
            }
        }
        jl jlVar = this.L7;
        Collections.sort(arrayList6, jlVar);
        Collections.sort(arrayList5, jlVar);
        Collections.sort(arrayList3, jlVar);
        Collections.sort(arrayList4, jlVar);
        return c0Var;
    }

    public final boolean x0(so soVar) {
        if (soVar != null) {
            if ((soVar.f26855g & 64) == 0) {
                if (this.F7.contains(Integer.valueOf(soVar.f26850a))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final TLRPC.Chat x1(long j3) {
        TLRPC.Chat O0;
        TLRPC.Chat O02;
        TLRPC.Chat O03 = O0(Long.valueOf(j3));
        if (O03 != null && (O02 = O0(Long.valueOf(O03.linked_monoforum_id))) != null) {
            return O02;
        }
        Long l10 = (Long) this.f25804f.get(Long.valueOf(j3));
        if (l10 != null && (O0 = O0(l10)) != null) {
            return O0;
        }
        return null;
    }

    public final boolean x2(so soVar) {
        if (soVar != null && (soVar.f26855g & 64) == 0) {
            if (this.F7.contains(Integer.valueOf(soVar.f26850a))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x3(long r13, int r15, org.telegram.tgnet.TLRPC.InputChannel r16, int r17, long r18, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.x3(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public final void x4() {
        this.I3 = false;
        this.L5 = false;
        this.L3 = false;
        this.K3 = false;
        this.R5 = false;
        this.S5 = false;
        this.f25870m7 = true;
        this.T5 = 1024;
        this.I6 = false;
        this.P6 = 0L;
        this.Q6 = 0L;
        this.R6 = "t.me/spambot";
        this.f25969x6 = null;
        this.f25979y6 = "GB";
        this.F4 = new HashSet();
        f3.d(f3.d(this.h7.edit().remove("starsLocked").remove("getfileExperimentalParams").remove("smsjobsStickyNotificationEnabled").remove("channelRevenueWithdrawalEnabled"), "showAnnualPerMonth", "canEditFactcheck", "factcheckLengthLimit", "videoIgnoreAltDocuments"), "freezeSinceDate", "freezeUntilDate", "freezeAppealUrl", "verifyAgeBotUsername").remove("verifyAgeCountry").remove("ignoreRestrictionReasons").apply();
    }

    public final boolean x5(int r30, long r31, java.util.ArrayList r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.x5(int, long, java.util.ArrayList):boolean");
    }

    public final boolean y(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!n5.C(dialog.f28402id)) {
                if (n5.y(dialog)) {
                    TLRPC.Chat O0 = O0(Long.valueOf(-dialog.f28402id));
                    if (!v3.X(this.currentAccount, O0)) {
                        if (O0 != null && O0.megagroup) {
                            if (O0.gigagroup && !v3.N(O0)) {
                                return false;
                            }
                            return true;
                        } else if (!v3.N(O0) || !v3.w(5, O0)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                long j3 = dialog.f28402id;
                if (j3 > 0) {
                    if (v3.v0(this.currentAccount, c2(Long.valueOf(j3)))) {
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

    public final ArrayList y0(ArrayList arrayList) {
        if (!K3()) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.TL_messages_stickerSet z02 = u1(this.currentAccount).z0((TLRPC.TL_messages_stickerSet) arrayList.get(i7));
            if (z02 == null) {
                arrayList.remove(i7);
                i7--;
            } else {
                arrayList.set(i7, z02);
            }
            i7++;
        }
        return arrayList;
    }

    public final void y1(final long j3, final long j10, final int i7, final boolean z10, final q0.a aVar) {
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
        getMessagesStorage().f27214a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cm.run():void");
            }
        });
    }

    public final boolean y2(long j3) {
        if (j3 < 0) {
            TLRPC.Chat O0 = O0(Long.valueOf(-j3));
            if (O0 != null && O0.forum) {
                return true;
            }
            return false;
        }
        return p10.v(c2(Long.valueOf(j3)));
    }

    public final void y3(gj gjVar) {
        if (gjVar.f24206r1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (gjVar.f24177k.mentioned) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.f27214a.c(new vq(messagesStorage, gjVar.e1(), -gjVar.f24177k.peer_id.channel_id, gj.B0(gjVar.f24177k), 0));
        }
        arrayList.add(Integer.valueOf(gjVar.e1()));
        long B0 = gj.B0(gjVar.f24177k);
        getMessagesStorage().S0(0, 0, B0, arrayList);
        getNotificationCenter().k(ls.C0, Long.valueOf(B0), arrayList);
        if (gjVar.e1() < 0) {
            w3(gj.B0(gjVar.f24177k), Integer.MIN_VALUE, gjVar.f24177k.random_id);
        } else if (gjVar.f24177k.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = j1(gjVar.f24177k.peer_id.channel_id);
            tL_channels_readMessageContents.f28437id.add(Integer.valueOf(gjVar.e1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new fi.k5(13));
        } else {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.f28503id.add(Integer.valueOf(gjVar.e1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new nj(this, 5));
        }
    }

    public final void y4(boolean r23, final int r24, final int r25, final int r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.np.y4(boolean, int, int, int, int):void");
    }

    public final void y5(boolean z10) {
        if (this.Q0.isEmpty()) {
            return;
        }
        if (!z10) {
            if (!((so) this.Q0.get(0)).d()) {
                int i7 = 1;
                while (true) {
                    if (i7 >= this.Q0.size()) {
                        break;
                    } else if (((so) this.Q0.get(i7)).d()) {
                        this.Q0.add(0, (so) this.Q0.remove(i7));
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            p3();
        } else {
            for (int i10 = 0; i10 < this.Q0.size(); i10++) {
                ((so) this.Q0.get(i10)).f26863p = false;
            }
        }
        getMessagesStorage().y1();
        getNotificationCenter().k(ls.O2, new Object[0]);
        R1().f12397x.b();
    }

    public final void z(long j3, int i7, long j10) {
        a0.h hVar;
        a0.h hVar2;
        if (i7 >= 0) {
            a0.h[] hVarArr = this.Z;
            if (i7 < hVarArr.length && (hVar = hVarArr[i7]) != null && (hVar2 = (a0.h) hVar.f(j3)) != null) {
                hVar2.l(j10);
                if (hVar2.m() == 0) {
                    hVar.l(j3);
                }
            }
        }
    }

    public final TLRPC.TL_messages_stickerSet z0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        Exception e10;
        if (K3() && tL_messages_stickerSet != null) {
            int i7 = 0;
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                try {
                    if (gj.X3(tL_messages_stickerSet.documents.get(i10))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i7 < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (gj.X3(tL_messages_stickerSet2.documents.get(i7))) {
                                    tL_messages_stickerSet2.documents.remove(i7);
                                    tL_messages_stickerSet2.packs.remove(i7);
                                    i7--;
                                    if (tL_messages_stickerSet2.documents.isEmpty()) {
                                        return null;
                                    }
                                }
                                i7++;
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

    public final boolean z2(gj gjVar) {
        if (gjVar != null && y2(gj.B0(gjVar.f24177k))) {
            return true;
        }
        return false;
    }

    public final void z3(long j3, long j10) {
        long j11;
        ArrayList l10;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        f00 f00Var = this.f25932t7;
        if (i7 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j3);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((y2(j3) || F2(j3)) && (l10 = f00Var.l((j11 = -j3))) != null) {
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                f00Var.y(j11, true);
            }
        } else {
            long j12 = -j3;
            TLRPC.TL_forumTopic f10 = f00Var.f(j12, j10);
            if (f10 != null && f10.unread_poll_votes_count > 0) {
                f10.unread_poll_votes_count = 0;
                f00Var.y(j12, true);
            }
        }
        getMessagesStorage().h2(0, j3, j10, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = l1(j3);
        if (i7 != 0 && !E2(j3)) {
            tL_messages_readPollVotes.top_msg_id = (int) j10;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new fi.k5(13));
        ls.f(this.currentAccount).k(ls.f25335r, 1048576);
    }

    public final boolean z4(long j3) {
        if (j3 != 0) {
            Long valueOf = Long.valueOf(j3);
            HashMap hashMap = this.G7;
            Integer num = (Integer) hashMap.get(valueOf);
            if (num != null) {
                hashMap.put(Long.valueOf(j3), Integer.valueOf(num.intValue() + 1));
                return true;
            } else if (!w2((TLRPC.Dialog) this.R.f(j3))) {
                return false;
            } else {
                hashMap.put(Long.valueOf(j3), 1);
                return true;
            }
        }
        return false;
    }

    public final void z5() {
        Iterator it;
        Iterator it2;
        boolean z10;
        String N0;
        String N02;
        String str;
        int i7;
        String N03;
        String N04;
        String N05;
        int i10;
        String N06;
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
                boolean C = n5.C(l10.longValue());
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
                        ep epVar = (ep) arrayList.get(0);
                        TLRPC.User c22 = c2(Long.valueOf(epVar.f23712b));
                        if (c22 == null) {
                            it3 = it;
                            it4 = it2;
                            i12 = 1;
                        } else {
                            if (l10.longValue() < 0 && !C) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            TLRPC.SendMessageAction sendMessageAction = epVar.f23713c;
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                                if (z10) {
                                    N06 = hd.a0("IsRecordingAudio", null, 2131748906, e2(c22));
                                } else {
                                    N06 = hd.N0(2131746155, null);
                                }
                                str = N06;
                                i7 = 1;
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                    if (z10) {
                                        N05 = hd.a0("IsRecordingRound", null, 2131748905, e2(c22));
                                    } else {
                                        N05 = hd.N0(2131746154, null);
                                    }
                                    str = N05;
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                    if (z10) {
                                        str = hd.a0("IsSendingVideo", null, 2131748897, e2(c22));
                                    } else {
                                        str = hd.N0(2131745379, null);
                                    }
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                        if (z10) {
                                            N04 = hd.a0("IsSendingAudio", null, 2131748901, e2(c22));
                                        } else {
                                            N04 = hd.N0(2131745386, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                        if (z10) {
                                            N04 = hd.a0("IsSendingVideo", null, 2131748897, e2(c22));
                                        } else {
                                            N04 = hd.N0(2131745379, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                        if (z10) {
                                            N04 = hd.a0("IsRecordingVideo", null, 2131748904, e2(c22));
                                        } else {
                                            N04 = hd.N0(2131746151, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                        if (z10) {
                                            N04 = hd.a0("IsSendingFile", null, 2131748900, e2(c22));
                                        } else {
                                            N04 = hd.N0(2131745385, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                        if (z10) {
                                            N04 = hd.a0("IsSendingPhoto", null, 2131748898, e2(c22));
                                        } else {
                                            N04 = hd.N0(2131745382, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                        if (z10) {
                                            N03 = hd.a0("IsSendingGame", null, 2131748899, e2(c22));
                                        } else {
                                            N03 = hd.N0(2131745384, null);
                                        }
                                        i7 = 3;
                                        str = N03;
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                            if (z10) {
                                                N0 = hd.a0("IsSelectingLocation", null, 2131748902, e2(c22));
                                            } else {
                                                N0 = hd.N0(2131745450, null);
                                            }
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                            if (z10) {
                                                N0 = hd.a0("IsSelectingContact", null, 2131748903, e2(c22));
                                            } else {
                                                N0 = hd.N0(2131745451, null);
                                            }
                                        } else {
                                            if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                                String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                                if (z10) {
                                                    N02 = hd.a0("IsEnjoyngAnimations", null, 2131748907, e2(c22), str2);
                                                } else {
                                                    N02 = hd.a0("EnjoyngAnimations", null, 2131751113, str2);
                                                }
                                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                                if (z10) {
                                                    N02 = hd.a0("IsChoosingSticker", null, 2131748908, e2(c22));
                                                } else {
                                                    N02 = hd.N0(2131752094, null);
                                                }
                                            } else if (z10) {
                                                N0 = hd.a0("IsTypingGroup", null, 2131748895, e2(c22));
                                            } else {
                                                N0 = hd.N0(2131743675, null);
                                            }
                                            str = N02;
                                            i7 = 5;
                                        }
                                        str = N0;
                                        i7 = 0;
                                    }
                                    str = N04;
                                    i7 = 2;
                                }
                                i7 = 4;
                            }
                            i10 = i7;
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
                                TLRPC.User c23 = c2(Long.valueOf(((ep) obj).f23712b));
                                if (c23 != null) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(e2(c23));
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
                                a02 = hd.a0("IsTypingGroup", null, 2131748895, sb2.toString());
                            } else if (arrayList.size() > 2) {
                                try {
                                    a02 = String.format(hd.K0(arrayList.size() - 2, "AndMoreTypingGroup"), sb2.toString(), Integer.valueOf(arrayList.size() - 2));
                                } catch (Exception unused) {
                                    a02 = "LOC_ERR: AndMoreTypingGroup";
                                }
                            } else {
                                a02 = hd.a0("AreTypingGroup", null, 2131754118, sb2.toString());
                            }
                            str = a02;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            str = null;
                        }
                    }
                    if (str != null) {
                        Paint paint = org.telegram.ui.ActionBar.m6.G0;
                        if (paint == null) {
                            paint = new Paint();
                            paint.setTypeface(g0.o());
                            paint.setTextSize(g0.L(14.0f));
                        }
                        hVar3.k(j6.m(str, paint.getFontMetricsInt(), false, null, 0), num.intValue());
                        hVar4.k(Integer.valueOf(i10), num.intValue());
                    }
                    it3 = it;
                    it4 = it2;
                    i12 = 1;
                }
            } else {
                this.f25777c0 = hVar.m();
                g0.g3(new qj(this, hVar, hVar2, 1));
                return;
            }
        }
    }
}
