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
import org.telegram.ui.m80;
import org.telegram.ui.mc0;
public final class qp extends c1 implements ls {
    public static volatile long A8;
    public static volatile long B8;
    public static final int C8 = (2 | 4) | 1050105;
    public static final int D8 = (1 | 2) | 28;
    public static volatile qp[] E8 = new qp[4];
    public static final Object[] F8 = new Object[4];
    public final a0.h A0;
    public final a0.h A1;
    public int A2;
    public String A3;
    public int A4;
    public int A5;
    public int A6;
    public boolean A7;
    public final LongSparseIntArray B0;
    public final a0.h B1;
    public String B2;
    public boolean B3;
    public Set B4;
    public int B5;
    public String B6;
    public final SparseArray B7;
    public final a0.h C0;
    public final a0.h C1;
    public String C2;
    public boolean C3;
    public Set C4;
    public float C5;
    public String C6;
    public vo C7;
    public final ArrayList D;
    public final a0.h D0;
    public final HashMap D1;
    public String D2;
    public float D3;
    public int D4;
    public float D5;
    public int D6;
    public final ol D7;
    public final ArrayList E;
    public final a0.h E0;
    public final a0.h E1;
    public boolean E2;
    public boolean E3;
    public int E4;
    public int E5;
    public int E6;
    public final ol E7;
    public final ArrayList F;
    public boolean F0;
    public final HashMap F1;
    public int F2;
    public boolean F3;
    public int F4;
    public int F5;
    public boolean F6;
    public final ol F7;
    public final ArrayList G;
    public final LongSparseIntArray G0;
    public final a0.h G1;
    public int G2;
    public volatile boolean G3;
    public int G4;
    public int G5;
    public boolean G6;
    public final jl G7;
    public final ArrayList H;
    public int H0;
    public final HashMap H1;
    public final rc H2;
    public boolean H3;
    public int H4;
    public int H5;
    public String H6;
    public c20 H7;
    public final ArrayList I;
    public boolean I0;
    public final a0.h I1;
    public final vj I2;
    public boolean I3;
    public int I4;
    public boolean I5;
    public long I6;
    public final vj I7;
    public final ArrayList J;
    public final a0.h J0;
    public final a0.h J1;
    public long J2;
    public boolean J3;
    public int J4;
    public boolean J5;
    public int J6;
    public final vj J7;
    public final ArrayList K;
    public final a0.h K0;
    public final a0.h K1;
    public int K2;
    public String K3;
    public int K4;
    public int K5;
    public int K6;
    public final a0.h K7;
    public final ArrayList L;
    public int L0;
    public final a0.h L1;
    public int L2;
    public String L3;
    public int L4;
    public String L5;
    public boolean L6;
    public final a0.h L7;
    public final vo[] M;
    public long M0;
    public final a0.h M1;
    public boolean M2;
    public String M3;
    public int M4;
    public boolean M5;
    public long M6;
    public long M7;
    public int N;
    public final SparseIntArray N0;
    public final a0.h N1;
    public String N2;
    public int N3;
    public int N4;
    public int N5;
    public long N6;
    public final int N7;
    public final ConcurrentHashMap O;
    public final SparseIntArray O0;
    public final a0.h O1;
    public final a0.h O2;
    public String O3;
    public int O4;
    public boolean O5;
    public String O6;
    public final int O7;
    public final ConcurrentHashMap P;
    public ArrayList P0;
    public final ArrayList P1;
    public final HashMap P2;
    public boolean P3;
    public int P4;
    public boolean P5;
    public int P6;
    public final int P7;
    public final a0.h Q;
    public ArrayList Q0;
    public final a0.h Q1;
    public String Q2;
    public boolean Q3;
    public int Q4;
    public int Q5;
    public boolean Q6;
    public ArrayList Q7;
    public final a0.h R;
    public final ArrayList R0;
    public final ArrayList R1;
    public org.telegram.ui.ActionBar.c6 R2;
    public String R3;
    public int R4;
    public long R5;
    public int R6;
    public final LongSparseIntArray R7;
    public final a0.h S;
    public final SparseArray S0;
    public final HashMap S1;
    public s10 S2;
    public Set S3;
    public int S4;
    public long S5;
    public int S6;
    public final LongSparseIntArray S7;
    public final LongSparseIntArray T;
    public boolean T0;
    public boolean T1;
    public final no T2;
    public Set T3;
    public int T4;
    public int T5;
    public int T6;
    public final LongSparseIntArray T7;
    public final SparseArray U;
    public boolean U0;
    public int U1;
    public String U2;
    public TLRPC.TL_pendingSuggestion U3;
    public int U4;
    public String U5;
    public String U6;
    public final a0.h U7;
    public final ConcurrentHashMap V;
    public final ArrayList V0;
    public a0.h V1;
    public int V2;
    public Set V3;
    public int V4;
    public String V5;
    public String V6;
    public final HashSet V7;
    public a0.h W;
    public final a0.h W0;
    public a0.h W1;
    public final int W2;
    public Set W3;
    public int W4;
    public boolean W5;
    public HashSet W6;
    public boolean W7;
    public a0.h X;
    public final LongSparseLongArray X0;
    public sn X1;
    public int X2;
    public Set X3;
    public int X4;
    public boolean X5;
    public int[] X6;
    public TLRPC.TL_exportedContactToken X7;
    public final a0.h[] Y;
    public final LongSparseIntArray Y0;
    public boolean Y1;
    public int Y2;
    public boolean Y3;
    public int Y4;
    public boolean Y5;
    public int Y6;
    public HashMap Y7;
    public final ConcurrentHashMap Z;
    public final a0.h Z0;
    public final SparseIntArray Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public long Z5;
    public long Z6;
    public HashSet Z7;
    public int f24728a;
    public final LongSparseIntArray f24729a0;
    public final a0.h f24730a1;
    public final SparseBooleanArray f24731a2;
    public int f24732a3;
    public boolean f24733a4;
    public int f24734a5;
    public long f24735a6;
    public long f24736a7;
    public a0.h f24737a8;
    public final ConcurrentHashMap f24738b;
    public int f24739b0;
    public final a0.h f24740b1;
    public final SparseBooleanArray f24741b2;
    public int f24742b3;
    public ArrayList f24743b4;
    public int f24744b5;
    public float f24745b6;
    public long[] f24746b7;
    public boolean f24747b8;
    public final ConcurrentHashMap f24748c;
    public final SparseArray f24749c0;
    public final a0.h f24750c1;
    public final SparseBooleanArray f24751c2;
    public boolean f24752c3;
    public HashSet f24753c4;
    public int f24754c5;
    public float f24755c6;
    public int[][] f24756c7;
    public boolean f24757c8;
    public final ConcurrentHashMap d;
    public int f24758d0;
    public final a0.h f24759d1;
    public boolean d2;
    public int f24760d3;
    public Set f24761d4;
    public int f24762d5;
    public boolean f24763d6;
    public final SharedPreferences f24764d7;
    public final a0.h f24765d8;
    public final ConcurrentHashMap f24766e;
    public int f24767e0;
    public final ArrayList f24768e1;
    public boolean f24769e2;
    public final int f24770e3;
    public Set f24771e4;
    public long f24772e5;
    public Set f24773e6;
    public final SharedPreferences f24774e7;
    public final HashSet f24775e8;
    public final ConcurrentHashMap f24776f;
    public int f24777f0;
    public final ArrayList f24778f1;
    public boolean f24779f2;
    public final int f24780f3;
    public String f24781f4;
    public int f24782f5;
    public boolean f24783f6;
    public final SharedPreferences f24784f7;
    public final vj f24785f8;
    public int f24786g0;
    public final ArrayList f24787g1;
    public boolean f24788g2;
    public int f24789g3;
    public HashMap f24790g4;
    public int f24791g5;
    public boolean f24792g6;
    public volatile boolean f24793g7;
    public boolean f24794g8;
    public final HashMap h;
    public di.y6 f24795h0;
    public long f24796h1;
    public boolean f24797h2;
    public int f24798h3;
    public HashMap f24799h4;
    public int f24800h5;
    public int f24801h6;
    public boolean h7;
    public TLRPC.messages_AvailableEffects f24802h8;
    public vv f24803i0;
    public long f24804i1;
    public boolean f24805i2;
    public int f24806i3;
    public boolean f24807i4;
    public int f24808i5;
    public int f24809i6;
    public int i7;
    public final po f24810i8;
    public m10 f24811j0;
    public long f24812j1;
    public boolean f24813j2;
    public int j3;
    public boolean f24814j4;
    public int f24815j5;
    public int f24816j6;
    public boolean f24817j7;
    public boolean f24818j8;
    public boolean f24819k0;
    public final a0.h f24820k1;
    public long f24821k2;
    public final int f24822k3;
    public int f24823k4;
    public int f24824k5;
    public long f24825k6;
    public final ArrayList f24826k7;
    public ArrayList f24827k8;
    public long f24828l0;
    public final a0.h l1;
    public boolean f24829l2;
    public final int f24830l3;
    public int f24831l4;
    public int f24832l5;
    public Long f24833l6;
    public org.telegram.ui.a7 f24834l7;
    public long f24835l8;
    public f3 m0;
    public final a0.h f24836m1;
    public TLRPC.TL_messages_peerDialogs f24837m2;
    public int f24838m3;
    public boolean f24839m4;
    public int f24840m5;
    public int f24841m6;
    public long f24842m7;
    public TL_account.contentSettings f24843m8;
    public final ArrayList f24844n;
    public long f24845n0;
    public final a0.h n1;
    public TLRPC.messages_Dialogs f24846n2;
    public int f24847n3;
    public int f24848n4;
    public int f24849n5;
    public int f24850n6;
    public long f24851n7;
    public boolean f24852n8;
    public long f24853o0;
    public VoIPDebugToSend f24854o1;
    public final SparseIntArray f24855o2;
    public int f24856o3;
    public int o4;
    public int f24857o5;
    public boolean f24858o6;
    public vj f24859o7;
    public final HashSet f24860o8;
    public long f24861p0;
    public final a0.h f24862p1;
    public ArrayList f24863p2;
    public int f24864p3;
    public boolean f24865p4;
    public int f24866p5;
    public boolean f24867p6;
    public final ConcurrentHashMap f24868p7;
    public final HashSet f24869p8;
    public long f24870q0;
    public final HashSet f24871q1;
    public TLRPC.WebPage f24872q2;
    public int f24873q3;
    public gp f24874q4;
    public int f24875q5;
    public int f24876q6;
    public final k00 f24877q7;
    public final vj f24878q8;
    public final a0.h f24879r;
    public long f24880r0;
    public final LongSparseLongArray f24881r1;
    public int f24882r2;
    public int f24883r3;
    public gp f24884r4;
    public int f24885r5;
    public int f24886r6;
    public final u2 f24887r7;
    public final LongSparseArray f24888r8;
    public final ArrayList f24889s;
    public boolean f24890s0;
    public final HashSet f24891s1;
    public boolean f24892s2;
    public String f24893s3;
    public int f24894s4;
    public int s5;
    public String f24895s6;
    public final f10 f24896s7;
    public final HashMap f24897s8;
    public final a0.h f24898t0;
    public final HashSet f24899t1;
    public int f24900t2;
    public int f24901t3;
    public int f24902t4;
    public int f24903t5;
    public String t6;
    public e f24904t7;
    public jp f24905t8;
    public final ArrayList f24906u0;
    public final HashSet f24907u1;
    public boolean f24908u2;
    public int f24909u3;
    public int f24910u4;
    public int f24911u5;
    public String f24912u6;
    public boolean f24913u7;
    public boolean f24914u8;
    public final ArrayList f24915v0;
    public final HashSet f24916v1;
    public int f24917v2;
    public int f24918v3;
    public int f24919v4;
    public int f24920v5;
    public String f24921v6;
    public boolean f24922v7;
    public ArrayList f24923v8;
    public final SparseArray f24924w;
    public final ArrayList f24925w0;
    public final LongSparseLongArray f24926w1;
    public int f24927w2;
    public int f24928w3;
    public int f24929w4;
    public int f24930w5;
    public int f24931w6;
    public boolean f24932w7;
    public TLRPC.EmojiGameInfo f24933w8;
    public final a0.h f24934x;
    public final ArrayList f24935x0;
    public final a0.h f24936x1;
    public TLRPC.Dialog f24937x2;
    public int f24938x3;
    public int f24939x4;
    public int f24940x5;
    public int f24941x6;
    public final p0 f24942x7;
    public final vj f24943x8;
    public final ArrayList f24944y;
    public final ArrayList f24945y0;
    public final LongSparseIntArray f24946y1;
    public boolean f24947y2;
    public boolean f24948y3;
    public int f24949y4;
    public int f24950y5;
    public int f24951y6;
    public boolean f24952y7;
    public TL_account.TL_webBrowserSettings f24953y8;
    public final LongSparseIntArray f24954z0;
    public final SparseIntArray f24955z1;
    public long f24956z2;
    public boolean f24957z3;
    public int f24958z4;
    public int f24959z5;
    public int f24960z6;
    public int f24961z7;
    public final qo f24962z8;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            F8[i7] = new Object();
        }
    }

    public qp(int i7) {
        super(i7);
        this.f24738b = new ConcurrentHashMap(100, 1.0f, 2);
        this.f24748c = new ConcurrentHashMap(10, 1.0f, 2);
        this.d = new ConcurrentHashMap(100, 1.0f, 3);
        this.f24766e = new ConcurrentHashMap(100, 1.0f, 2);
        this.f24776f = new ConcurrentHashMap(3, 1.0f, 2);
        this.h = new HashMap();
        this.f24844n = new ArrayList();
        this.f24879r = new a0.h();
        this.f24889s = new ArrayList();
        this.f24924w = new SparseArray();
        this.f24934x = new a0.h();
        this.f24944y = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new vo[2];
        this.N = Integer.MAX_VALUE;
        this.O = new ConcurrentHashMap(100, 1.0f, 2);
        this.P = new ConcurrentHashMap(100, 1.0f, 2);
        this.Q = new a0.h();
        this.R = new a0.h();
        this.S = new a0.h();
        this.T = new LongSparseIntArray();
        this.U = new SparseArray();
        this.V = new ConcurrentHashMap(20, 1.0f, 2);
        this.W = new a0.h();
        this.X = new a0.h();
        this.Y = new a0.h[12];
        this.Z = new ConcurrentHashMap(20, 1.0f, 2);
        this.f24729a0 = new LongSparseIntArray();
        this.f24749c0 = new SparseArray();
        this.f24758d0 = 2;
        this.f24767e0 = 5;
        this.f24828l0 = 777000L;
        this.f24845n0 = 10L;
        this.f24853o0 = 7L;
        this.f24861p0 = 10L;
        this.f24870q0 = 4L;
        this.f24880r0 = 3L;
        this.f24898t0 = new a0.h();
        this.f24906u0 = new ArrayList();
        this.f24915v0 = new ArrayList();
        this.f24925w0 = new ArrayList();
        this.f24935x0 = new ArrayList();
        this.f24945y0 = new ArrayList();
        this.f24954z0 = new LongSparseIntArray();
        this.A0 = new a0.h();
        this.B0 = new LongSparseIntArray();
        this.C0 = new a0.h();
        this.D0 = new a0.h();
        this.E0 = new a0.h();
        int i10 = 0;
        this.F0 = false;
        this.G0 = new LongSparseIntArray();
        this.H0 = -1;
        this.J0 = new a0.h();
        this.K0 = new a0.h();
        this.N0 = new SparseIntArray();
        this.O0 = new SparseIntArray();
        this.P0 = new ArrayList();
        this.Q0 = null;
        this.R0 = new ArrayList();
        this.S0 = new SparseArray();
        this.V0 = new ArrayList();
        this.W0 = new a0.h();
        this.X0 = new LongSparseLongArray();
        this.Y0 = new LongSparseIntArray();
        this.Z0 = new a0.h();
        this.f24730a1 = new a0.h();
        this.f24740b1 = new a0.h();
        this.f24750c1 = new a0.h();
        this.f24759d1 = new a0.h();
        this.f24768e1 = new ArrayList();
        this.f24778f1 = new ArrayList();
        this.f24787g1 = new ArrayList();
        this.f24820k1 = new a0.h();
        this.l1 = new a0.h();
        this.f24836m1 = new a0.h();
        this.n1 = new a0.h();
        this.f24862p1 = new a0.h();
        this.f24871q1 = new HashSet();
        this.f24881r1 = new LongSparseLongArray();
        this.f24891s1 = new HashSet();
        this.f24899t1 = new HashSet();
        this.f24907u1 = new HashSet();
        this.f24916v1 = new HashSet();
        this.f24926w1 = new LongSparseLongArray();
        this.f24936x1 = new a0.h();
        this.f24946y1 = new LongSparseIntArray();
        this.f24955z1 = new SparseIntArray();
        this.A1 = new a0.h();
        this.B1 = new a0.h();
        this.C1 = new a0.h();
        this.D1 = new HashMap();
        this.E1 = new a0.h();
        this.F1 = new HashMap();
        this.G1 = new a0.h();
        this.H1 = new HashMap();
        this.I1 = new a0.h();
        this.J1 = new a0.h();
        this.K1 = new a0.h();
        this.L1 = new a0.h();
        this.M1 = new a0.h();
        this.N1 = new a0.h();
        this.O1 = new a0.h();
        this.P1 = new ArrayList();
        this.Q1 = new a0.h();
        this.R1 = new ArrayList();
        this.S1 = new HashMap();
        this.Z1 = new SparseIntArray();
        this.f24731a2 = new SparseBooleanArray();
        this.f24741b2 = new SparseBooleanArray();
        this.f24751c2 = new SparseBooleanArray();
        this.f24788g2 = true;
        this.f24855o2 = new SparseIntArray();
        this.f24863p2 = new ArrayList();
        this.H2 = new rc(6);
        this.I2 = new vj(this, 8);
        this.O2 = new a0.h();
        this.P2 = new HashMap();
        this.T2 = new no(this);
        this.W2 = 100;
        this.f24743b4 = new ArrayList();
        this.f24790g4 = new HashMap();
        this.f24799h4 = new HashMap();
        new HashMap();
        this.O5 = false;
        this.f24773e6 = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.f24826k7 = arrayList;
        this.f24868p7 = new ConcurrentHashMap();
        p0 p0Var = new p0();
        this.f24942x7 = p0Var;
        this.B7 = new SparseArray();
        this.D7 = new Comparator(this) {
            public final qp f24351b;

            {
                this.f24351b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ol.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.E7 = new Comparator(this) {
            public final qp f24351b;

            {
                this.f24351b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ol.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.F7 = new Comparator(this) {
            public final qp f24351b;

            {
                this.f24351b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ol.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.G7 = new jl(this, 3);
        this.I7 = new vj(this, 6);
        this.J7 = new vj(this, 13);
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
        this.f24765d8 = new a0.h();
        this.f24775e8 = new HashSet();
        this.f24785f8 = new vj(this, 14);
        this.f24810i8 = new po(this);
        this.f24860o8 = new HashSet();
        this.f24869p8 = new HashSet();
        this.f24878q8 = new vj(this, 15);
        this.f24888r8 = new LongSparseArray();
        this.f24897s8 = new HashMap();
        this.f24943x8 = new vj(this, 1);
        this.f24962z8 = new qo(this);
        gc.D();
        getMessagesStorage();
        getLocationController();
        g0.h3(new vj(this, 2));
        k();
        if (this.currentAccount == 0) {
            this.f24764d7 = t0.f25566b.getSharedPreferences("Notifications", 0);
            this.f24774e7 = t0.f25566b.getSharedPreferences("mainconfig", 0);
            this.f24784f7 = t0.f25566b.getSharedPreferences("emoji", 0);
        } else {
            this.f24764d7 = t0.f25566b.getSharedPreferences("Notifications" + this.currentAccount, 0);
            this.f24774e7 = t0.f25566b.getSharedPreferences("mainconfig" + this.currentAccount, 0);
            this.f24784f7 = t0.f25566b.getSharedPreferences("emoji" + this.currentAccount, 0);
        }
        System.currentTimeMillis();
        this.f24807i4 = this.f24774e7.getBoolean("remoteConfigLoaded", false);
        this.f24814j4 = this.f24774e7.getBoolean("fpnvAllowed", false);
        this.G2 = this.f24774e7.getInt("secretWebpage2", 2);
        this.V2 = this.f24774e7.getInt("maxGroupCount", 200);
        this.X2 = this.f24774e7.getInt("maxMegagroupCount", 10000);
        this.f24780f3 = this.f24774e7.getInt("maxRecentGifsCount", 200);
        this.f24760d3 = this.f24774e7.getInt("maxRecentStickersCount", 30);
        this.f24770e3 = this.f24774e7.getInt("maxFaveStickersCount", 5);
        this.Y2 = this.f24774e7.getInt("maxEditTime", 3600);
        this.Z2 = this.f24774e7.getInt("ratingDecay", 2419200);
        this.U2 = this.f24774e7.getString("linkPrefix", "t.me");
        this.f24789g3 = this.f24774e7.getInt("callReceiveTimeout", 20000);
        this.f24798h3 = this.f24774e7.getInt("callRingTimeout", 90000);
        this.f24806i3 = this.f24774e7.getInt("callConnectTimeout", 30000);
        this.j3 = this.f24774e7.getInt("callPacketTimeout", 10000);
        this.f24856o3 = this.f24774e7.getInt("updateCheckDelay", 86400);
        this.f24822k3 = this.f24774e7.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.f24830l3 = this.f24774e7.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.f24901t3 = this.f24774e7.getInt("maxMessageLength", 4096);
        this.f24909u3 = this.f24774e7.getInt("maxCaptionLength", 1024);
        this.f24838m3 = this.f24774e7.getInt("mapProvider", 0);
        this.f24847n3 = this.f24774e7.getInt("availableMapProviders", 3);
        this.f24893s3 = this.f24774e7.getString("pk", null);
        this.R3 = this.f24774e7.getString("installReferer", null);
        this.f24732a3 = this.f24774e7.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.f24742b3 = this.f24774e7.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
        this.f24752c3 = this.f24774e7.getBoolean("canRevokePmInbox", this.f24752c3);
        this.f24957z3 = this.f24774e7.getBoolean("preloadFeaturedStickers", false);
        this.A3 = this.f24774e7.getString("youtubePipType", "disabled");
        this.B3 = this.f24774e7.getBoolean("keepAliveService", false);
        this.C3 = this.f24774e7.getBoolean("backgroundConnection", false);
        this.f24956z2 = this.f24774e7.getLong("proxy_dialog", 0L);
        this.f24900t2 = this.f24774e7.getInt("nextPromoInfoCheckTime", 0);
        this.A2 = this.f24774e7.getInt("promo_dialog_type", 0);
        this.B2 = this.f24774e7.getString("promo_psa_message", null);
        this.C2 = this.f24774e7.getString("promo_psa_type", null);
        this.D2 = this.f24774e7.getString("proxyDialogAddress", null);
        this.K3 = this.f24774e7.getString("gifSearchBot", "gif");
        this.L3 = this.f24774e7.getString("imageSearchBot", "pic");
        this.f24948y3 = this.f24774e7.getBoolean("blockedCountry", false);
        this.O3 = this.f24774e7.getString("suggestedLangCode", "en");
        this.D3 = this.f24774e7.getFloat("animatedEmojisZoom", 0.625f);
        this.P3 = this.f24774e7.getBoolean("qrLoginCamera", true);
        this.Q3 = this.f24774e7.getBoolean("saveGifsWithStickers", false);
        this.E3 = this.f24774e7.getBoolean("filtersEnabled", false);
        this.F3 = this.f24774e7.getBoolean("getfileExperimentalParams", false);
        this.G3 = this.f24774e7.getBoolean("android_download_improvement_killswitch", false);
        this.H3 = this.f24774e7.getBoolean("smsjobsStickyNotificationEnabled", false);
        this.J3 = this.f24774e7.getBoolean("showFiltersTooltip", false);
        this.Y3 = this.f24774e7.getBoolean("autoarchiveAvailable", false);
        this.Z3 = this.f24774e7.getInt("groipCallVideoMaxParticipants", 30);
        this.f24864p3 = this.f24774e7.getInt("chatReadMarkSizeThreshold", 100);
        this.f24873q3 = this.f24774e7.getInt("chatReadMarkExpirePeriod", 604800);
        this.f24823k4 = this.f24774e7.getInt("ringtoneDurationMax", 5);
        this.f24831l4 = this.f24774e7.getInt("ringtoneSizeMax", 102400);
        this.f24883r3 = this.f24774e7.getInt("pmReadDateExpirePeriod", 604800);
        this.f24733a4 = this.f24774e7.getBoolean("suggestStickersApiOnly", false);
        this.f24918v3 = this.f24774e7.getInt("roundVideoSize", 384);
        this.f24928w3 = this.f24774e7.getInt("roundVideoBitrate", 1000);
        this.f24938x3 = this.f24774e7.getInt("roundAudioBitrate", 64);
        this.S3 = this.f24774e7.getStringSet("pendingSuggestions", null);
        this.T3 = this.f24774e7.getStringSet("dismissedSuggestions", null);
        this.D4 = this.f24774e7.getInt("channelsLimitDefault", 500);
        this.E4 = this.f24774e7.getInt("channelsLimitPremium", this.D4 * 2);
        this.F4 = this.f24774e7.getInt("savedGifsLimitDefault", 200);
        this.G4 = this.f24774e7.getInt("savedGifsLimitPremium", 400);
        this.H4 = this.f24774e7.getInt("stickersFavedLimitDefault", 5);
        this.I4 = this.f24774e7.getInt("stickersFavedLimitPremium", 200);
        this.J4 = this.f24774e7.getInt("maxPinnedDialogsCountDefault", 5);
        this.K4 = this.f24774e7.getInt("maxPinnedDialogsCountPremium", 5);
        this.J4 = this.f24774e7.getInt("maxPinnedDialogsCountDefault", 5);
        this.K4 = this.f24774e7.getInt("maxPinnedDialogsCountPremium", 5);
        this.L4 = this.f24774e7.getInt("dialogFiltersLimitDefault", 10);
        this.M4 = this.f24774e7.getInt("dialogFiltersLimitPremium", 20);
        this.N4 = this.f24774e7.getInt("dialogFiltersChatsLimitDefault", 100);
        this.O4 = this.f24774e7.getInt("dialogFiltersChatsLimitPremium", 200);
        this.P4 = this.f24774e7.getInt("dialogFiltersPinnedLimitDefault", 5);
        this.Q4 = this.f24774e7.getInt("dialogFiltersPinnedLimitPremium", 10);
        this.R4 = this.f24774e7.getInt("publicLinksLimitDefault", 10);
        this.S4 = this.f24774e7.getInt("publicLinksLimitPremium", 20);
        this.T4 = this.f24774e7.getInt("captionLengthLimitDefault", 1024);
        this.U4 = this.f24774e7.getInt("captionLengthLimitPremium", 4096);
        this.V4 = this.f24774e7.getInt("storyCaptionLengthLimit", 200);
        this.W4 = this.f24774e7.getInt("storyCaptionLengthLimitPremium", 2048);
        this.X4 = this.f24774e7.getInt("aboutLengthLimitDefault", 70);
        this.Y4 = this.f24774e7.getInt("aboutLengthLimitPremium", 140);
        this.Z4 = this.f24774e7.getInt("reactionsUserMaxDefault", 1);
        this.f24734a5 = this.f24774e7.getInt("reactionsUserMaxPremium", 3);
        this.f24744b5 = this.f24774e7.getInt("reactionsInChatMax", 3);
        this.f24876q6 = this.f24774e7.getInt("uploadMaxFileParts", 4000);
        this.f24886r6 = this.f24774e7.getInt("uploadMaxFilePartsPremium", this.f24876q6 * 2);
        this.t6 = this.f24774e7.getString("premiumInvoiceSlug", null);
        this.f24912u6 = this.f24774e7.getString("verifyAgeBotUsername", null);
        this.f24921v6 = this.f24774e7.getString("verifyAgeCountry", "GB");
        this.f24931w6 = this.f24774e7.getInt("verifyAgeMin", 18);
        this.f24895s6 = this.f24774e7.getString("premiumBotUsername", null);
        this.h7 = this.f24774e7.getBoolean("premiumLocked", false);
        this.f24817j7 = this.f24774e7.getBoolean("starsLocked", true);
        this.i7 = this.f24774e7.getInt("transcribeButtonPressed", 0);
        this.f24754c5 = this.f24774e7.getInt("forumUpgradeParticipantsMin", 200);
        this.f24762d5 = this.f24774e7.getInt("topicsPinnedLimit", 3);
        this.f24772e5 = this.f24774e7.getLong("telegramAntispamUserId", -1L);
        this.f24782f5 = this.f24774e7.getInt("telegramAntispamGroupSizeMin", 100);
        this.f24791g5 = this.f24774e7.getInt("hiddenMembersGroupSizeMin", 100);
        this.f24800h5 = this.f24774e7.getInt("chatlistUpdatePeriod", 3600);
        this.f24913u7 = this.f24774e7.getBoolean("uploadMarkupVideo", true);
        this.f24922v7 = this.f24774e7.getBoolean("giftAttachMenuIcon", false);
        this.f24932w7 = this.f24774e7.getBoolean("giftTextFieldIcon", false);
        this.f24961z7 = this.f24774e7.getInt("checkResetLangpack", 0);
        this.f24767e0 = this.f24774e7.getInt("smallQueueMaxActiveOperations", 5);
        this.f24758d0 = this.f24774e7.getInt("largeQueueMaxActiveOperations", 2);
        this.f24777f0 = this.f24774e7.getInt("stories_stealth_future_period", 1500);
        this.f24828l0 = this.f24774e7.getLong("stories_changelog_user_id", 777000L);
        this.f24845n0 = this.f24774e7.getLong("giveaway_add_peers_max", 10L);
        this.f24861p0 = this.f24774e7.getLong("giveaway_countries_max", 10L);
        this.f24870q0 = this.f24774e7.getLong("giveaway_boosts_per_premium", 4L);
        this.f24880r0 = this.f24774e7.getLong("boosts_per_sent_gift", 3L);
        this.f24853o0 = this.f24774e7.getLong("giveaway_period_max", 7L);
        this.f24774e7.getInt("stories_stealth_past_period", 300);
        this.f24786g0 = this.f24774e7.getInt("stories_stealth_cooldown_period", 3600);
        boolean z9 = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        this.f24941x6 = this.f24774e7.getInt("chatlistInvitesLimitDefault", 3);
        this.f24808i5 = this.f24774e7.getInt("storyExpiringLimitDefault", 50);
        this.f24815j5 = this.f24774e7.getInt("storyExpiringLimitPremium", 100);
        this.f24824k5 = this.f24774e7.getInt("storiesSentWeeklyLimitDefault", 7);
        this.f24857o5 = this.f24774e7.getInt("storiesSuggestedReactionsLimitDefault", 1);
        this.f24866p5 = this.f24774e7.getInt("storiesSuggestedReactionsLimitPremium", 5);
        this.f24832l5 = this.f24774e7.getInt("storiesSentWeeklyLimitPremium", 70);
        this.f24840m5 = this.f24774e7.getInt("storiesSentMonthlyLimitDefault", 30);
        this.f24849n5 = this.f24774e7.getInt("storiesSentMonthlyLimitPremium", 300);
        this.f24875q5 = this.f24774e7.getInt("channelBgIconLevelMin", 1);
        this.f24885r5 = this.f24774e7.getInt("channelProfileIconLevelMin", 1);
        this.s5 = this.f24774e7.getInt("channelEmojiStatusLevelMin", 1);
        this.f24920v5 = this.f24774e7.getInt("groupProfileBgIconLevelMin", 1);
        this.f24930w5 = this.f24774e7.getInt("groupEmojiStatusLevelMin", 1);
        this.f24940x5 = this.f24774e7.getInt("groupEmojiStickersLevelMin", 1);
        this.f24950y5 = this.f24774e7.getInt("groupWallpaperLevelMin", 1);
        this.f24959z5 = this.f24774e7.getInt("groupCustomWallpaperLevelMin", 1);
        this.A5 = this.f24774e7.getInt("groupTranscribeLevelMin", 1);
        this.B5 = this.f24774e7.getInt("quickRepliesLimit", 10);
        this.f24903t5 = this.f24774e7.getInt("channelWallpaperLevelMin", 1);
        this.f24911u5 = this.f24774e7.getInt("channelCustomWallpaperLevelMin", 1);
        this.f24951y6 = this.f24774e7.getInt("chatlistInvitesLimitPremium", z9 ? 5 : 20);
        this.f24960z6 = this.f24774e7.getInt("chatlistJoinedLimitDefault", 2);
        this.A6 = this.f24774e7.getInt("chatlistJoinedLimitPremium", z9 ? 5 : 20);
        this.D6 = this.f24774e7.getInt("stargiftsMessageLengthMax", 255);
        this.E6 = this.f24774e7.getInt("stargiftsConvertPeriodMax", z9 ? 300 : 7776000);
        this.F6 = this.f24774e7.getBoolean("videoIgnoreAltDocuments", false);
        this.G6 = this.f24774e7.getBoolean("disableBotFullscreenBlur", false);
        this.H6 = this.f24774e7.getString("tonBlockchainExplorerUrl", "https://tonviewer.com/");
        this.I6 = this.f24774e7.getLong("starsPaidMessageAmountMax", 10000L);
        this.J6 = this.f24774e7.getInt("starsPaidMessageCommissionPermille", 850);
        this.K6 = this.f24774e7.getInt("stargiftsPinnedToTopLimit", 6);
        this.L6 = this.f24774e7.getBoolean("starsPaidMessagesAvailable", true);
        this.M6 = this.f24774e7.getLong("freezeSinceDate", 0L);
        this.N6 = this.f24774e7.getLong("freezeUntilDate", 0L);
        this.P6 = this.f24774e7.getInt("conferenceCallSizeLimit", z9 ? 5 : 100);
        this.Q6 = this.f24774e7.getBoolean("callRequestsDisabled", false);
        this.R6 = this.f24774e7.getInt("todoItemsMax", z9 ? 10 : 30);
        this.S6 = this.f24774e7.getInt("todoTitleLengthMax", 32);
        this.T6 = this.f24774e7.getInt("todoItemLengthMax", 64);
        this.U6 = this.f24774e7.getString("translationsManualEnabled", "enabled");
        this.V6 = this.f24774e7.getString("translationsAutoEnabled", "enabled");
        this.W6 = (HashSet) Collection.EL.stream(this.f24774e7.getStringSet("whitelistedBots", new HashSet())).map(new aa.l(3)).collect(Collectors.toCollection(new nk(0)));
        this.Y6 = this.f24774e7.getInt("starsGroupcallMessageAmountMax", 10000);
        this.X6 = di.t.d(this.f24774e7.getString("starsGroupcallMessageLimits", null));
        this.O6 = this.f24774e7.getString("freezeAppealUrl", "t.me/spambot");
        this.f24952y7 = this.f24774e7.getBoolean("enableGiftsInProfile", true);
        this.B6 = this.f24774e7.getString("storiesPosting", "enabled");
        this.C6 = this.f24774e7.getString("storiesEntities", "premium");
        this.f24839m4 = this.f24774e7.getBoolean("storiesExportNopublicLink", false);
        this.f24848n4 = this.f24774e7.getInt("authorization_autoconfirm_period", 604800);
        this.o4 = this.f24774e7.getInt("quoteLengthMax", 1024);
        this.f24865p4 = this.f24774e7.getBoolean("giveawayGiftsPurchaseAvailable", false);
        this.f24874q4 = gp.b(0, this.f24774e7.getString("peerColors", ""));
        this.f24884r4 = gp.b(1, this.f24774e7.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.f24774e7;
        boolean z10 = r2.f25212a;
        this.f24894s4 = sharedPreferences.getInt("transcribeAudioTrialWeeklyNumber", 0);
        this.f24919v4 = this.f24774e7.getInt("transcribeAudioTrialCurrentNumber", this.f24894s4);
        this.f24902t4 = this.f24774e7.getInt("transcribeAudioTrialDurationMax", 300);
        this.f24910u4 = this.f24774e7.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.f24929w4 = this.f24774e7.getInt("recommendedChannelsLimitDefault", 10);
        this.f24939x4 = this.f24774e7.getInt("recommendedChannelsLimitPremium", 100);
        this.f24949y4 = this.f24774e7.getInt("boostsChannelLevelMax", 100);
        this.f24958z4 = this.f24774e7.getInt("channelRestrictSponsoredLevelMin", 30);
        this.A4 = this.f24774e7.getInt("channelAutotranslationLevelMin", 3);
        this.f24841m6 = this.f24774e7.getInt("savedDialogsPinnedLimitDefault", 4);
        this.f24850n6 = this.f24774e7.getInt("savedDialogsPinnedLimitPremium", 6);
        this.f24867p6 = this.f24774e7.getBoolean("storyQualityFull", true);
        this.f24858o6 = this.f24774e7.getBoolean("savedViewAsChats", false);
        this.A7 = this.f24774e7.getBoolean("folderTags", false);
        this.C5 = this.f24774e7.getFloat("uploadPremiumSpeedupUpload", 10.0f);
        this.D5 = this.f24774e7.getFloat("uploadPremiumSpeedupDownload", 10.0f);
        this.E5 = this.f24774e7.getInt("uploadPremiumSpeedupNotifyPeriod2", 3600);
        this.F5 = this.f24774e7.getInt("introTitleLengthLimit", 32);
        this.G5 = this.f24774e7.getInt("introDescriptionLengthLimit", 72);
        this.H5 = this.f24774e7.getInt("businessChatLinksLimit", 100);
        this.I5 = this.f24774e7.getBoolean("channelRevenueWithdrawalEnabled", false);
        this.J5 = this.f24774e7.getBoolean("newNoncontactPeersRequirePremiumWithoutOwnpremium", false);
        this.K5 = this.f24774e7.getInt("reactionsUniqMax", 11);
        SharedPreferences sharedPreferences2 = this.f24774e7;
        t0.u();
        this.L5 = sharedPreferences2.getString("premiumManageSubscriptionUrl", "https://play.google.com/store/account/subscriptions?sku=telegram_premium&package=org.telegram.messenger");
        this.M5 = this.f24774e7.getBoolean("androidDisableRoundCamera2", true);
        this.N5 = this.f24774e7.getInt("storiesPinnedToTopCountMax", 3);
        this.O5 = this.f24774e7.getBoolean("showAnnualPerMonth", false);
        this.P5 = this.f24774e7.getBoolean("canEditFactcheck", false);
        this.Q5 = this.f24774e7.getInt("factcheckLengthLimit", 1024);
        this.R5 = this.f24774e7.getLong("starsRevenueWithdrawalMin", 1000L);
        this.S5 = this.f24774e7.getLong("starsPaidPostAmountMax", 10000L);
        this.T5 = this.f24774e7.getInt("botPreviewMediasMax", 10);
        this.B4 = this.f24774e7.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.C4 = this.f24774e7.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.U5 = this.f24774e7.getString("tonProxyAddress", "magic.org");
        this.V5 = this.f24774e7.getString("weatherSearchUsername", "izweatherbot");
        this.W5 = this.f24774e7.getBoolean("storyWeatherPreload", true);
        this.X5 = this.f24774e7.getBoolean("starsGiftsEnabled", true);
        this.Y5 = this.f24774e7.getBoolean("stargiftsBlocked", true);
        this.Z5 = this.f24774e7.getLong("starsPaidReactionAmountMax", 10000L);
        this.f24735a6 = this.f24774e7.getLong("starsSubscriptionAmountMax", 2500L);
        this.f24745b6 = this.f24774e7.getFloat("starsUsdSellRate1000", 2000.0f);
        this.f24755c6 = this.f24774e7.getFloat("starsUsdWithdrawRate1000", 1200.0f);
        this.f24763d6 = this.f24774e7.getBoolean("sponsoredLinksInappAllow", false);
        this.f24783f6 = this.f24774e7.getBoolean("starrefProgramAllowed", false);
        this.f24792g6 = this.f24774e7.getBoolean("starrefConnectAllowed", false);
        this.f24773e6 = this.f24774e7.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.f24801h6 = this.f24774e7.getInt("starrefMinCommissionPermille", 1);
        this.f24809i6 = this.f24774e7.getInt("starrefMaxCommissionPermille", 400);
        this.f24816j6 = this.f24774e7.getInt("botVerificationDescriptionLengthLimit", 70);
        this.f24825k6 = this.f24774e7.getLong("paidReactionsAnonymousTime", 0L);
        this.Z6 = this.f24774e7.getLong("tonStakeddiceStakeAmountMin", 100000000L);
        this.f24736a7 = this.f24774e7.getLong("tonStakeddiceStakeAmountMax", 50000000000L);
        this.f24746b7 = DesugarArrays.stream(this.f24774e7.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new sk(0)).toArray();
        this.f24756c7 = (int[][]) DesugarArrays.stream(this.f24774e7.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new aa.l(4)).toArray(new zk(0));
        p0Var.b(this.f24774e7);
        System.currentTimeMillis();
        this.f24833l6 = null;
        if (System.currentTimeMillis() - this.f24825k6 < 7200000) {
            if (this.f24774e7.contains("paidReactionsDialogId")) {
                this.f24833l6 = Long.valueOf(this.f24774e7.getLong("paidReactionsDialogId", 0L));
            } else {
                this.f24833l6 = Long.valueOf(this.f24774e7.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        g0.h3(new vj(this, 3));
        r2.h = this.f24774e7.getString("googleAuthClientId", r2.h);
        if (this.f24774e7.contains("dcDomainName2")) {
            this.M3 = this.f24774e7.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.M3 = z9 ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.f24774e7.contains("webFileDatacenterId")) {
            this.N3 = this.f24774e7.getInt("webFileDatacenterId", 4);
        } else {
            this.N3 = z9 ? 2 : 4;
        }
        Set<String> stringSet = this.f24774e7.getStringSet("directPaymentsCurrency", null);
        if (stringSet != null) {
            arrayList.clear();
            arrayList.addAll(stringSet);
        }
        SparseIntArray sparseIntArray = this.N0;
        String string = this.f24774e7.getString("premiumFeaturesTypesToPosition", null);
        sparseIntArray.clear();
        if (string != null) {
            String[] split = string.split("_");
            for (int i11 = 0; i11 < split.length; i11++) {
                sparseIntArray.put(Integer.parseInt(split[i11]), i11);
            }
        }
        SparseIntArray sparseIntArray2 = this.O0;
        String string2 = this.f24774e7.getString("businessFeaturesTypesToPosition", null);
        sparseIntArray2.clear();
        if (string2 != null) {
            String[] split2 = string2.split("_");
            for (int i12 = 0; i12 < split2.length; i12++) {
                sparseIntArray2.put(Integer.parseInt(split2[i12]), i12);
            }
        }
        if (this.S3 != null) {
            this.S3 = new HashSet(this.S3);
        } else {
            this.S3 = new HashSet();
        }
        if (this.T3 != null) {
            this.T3 = new HashSet(this.T3);
        } else {
            this.T3 = new HashSet();
        }
        Set<String> stringSet2 = this.f24774e7.getStringSet("exportUri2", null);
        this.V3 = stringSet2;
        if (stringSet2 != null) {
            this.V3 = new HashSet(this.V3);
        } else {
            HashSet hashSet = new HashSet();
            this.V3 = hashSet;
            hashSet.add("content://(\\d+@)?com\\.whatsapp\\.provider\\.media/export_chat/");
            this.V3.add("content://(\\d+@)?com\\.whatsapp\\.w4b\\.provider\\.media/export_chat/");
            this.V3.add("content://jp\\.naver\\.line\\.android\\.line\\.common\\.FileProvider/export-chat/");
            this.V3.add(".*WhatsApp.*\\.txt$");
            this.V3.add(".*WhatsApp.*\\.zip$");
        }
        Set<String> stringSet3 = this.f24774e7.getStringSet("exportGroupUri", null);
        this.W3 = stringSet3;
        if (stringSet3 != null) {
            this.W3 = new HashSet(this.W3);
        } else {
            HashSet hashSet2 = new HashSet();
            this.W3 = hashSet2;
            hashSet2.add("@g.us/");
        }
        Set<String> stringSet4 = this.f24774e7.getStringSet("exportPrivateUri", null);
        this.X3 = stringSet4;
        if (stringSet4 != null) {
            this.X3 = new HashSet(this.X3);
        } else {
            HashSet hashSet3 = new HashSet();
            this.X3 = hashSet3;
            hashSet3.add("@s.whatsapp.net/");
        }
        Set<String> stringSet5 = this.f24774e7.getStringSet("autologinDomains", null);
        this.f24761d4 = stringSet5;
        if (stringSet5 != null) {
            this.f24761d4 = new HashSet(this.f24761d4);
        } else {
            this.f24761d4 = new HashSet();
        }
        Set<String> stringSet6 = this.f24774e7.getStringSet("authDomains", null);
        this.f24771e4 = stringSet6;
        if (stringSet6 != null) {
            this.f24771e4 = new HashSet(this.f24771e4);
        } else {
            this.f24771e4 = new HashSet();
        }
        this.f24781f4 = this.f24774e7.getString("autologinToken", null);
        Set<String> stringSet7 = this.f24774e7.getStringSet("diceEmojies", null);
        if (stringSet7 == null) {
            HashSet hashSet4 = new HashSet();
            this.f24753c4 = hashSet4;
            hashSet4.add("🎲");
            this.f24753c4.add("🎯");
        } else {
            this.f24753c4 = new HashSet(stringSet7);
        }
        String string3 = this.f24774e7.getString("diceSuccess", null);
        if (string3 == null) {
            this.f24790g4.put("🎯", new zo(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string3, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    boolean z11 = true;
                    int readInt32 = serializedData.readInt32(true);
                    int i13 = 0;
                    while (i13 < readInt32) {
                        this.f24790g4.put(serializedData.readString(z11), new zo(serializedData.readInt32(z11), serializedData.readInt32(z11)));
                        i13++;
                        z11 = true;
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e10) {
                a8.f(e10);
            }
        }
        String string4 = this.f24774e7.getString("emojiSounds", null);
        if (string4 != null) {
            try {
                byte[] decode2 = Base64.decode(string4, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    boolean z12 = true;
                    int readInt322 = serializedData2.readInt32(true);
                    int i14 = 0;
                    while (i14 < readInt322) {
                        this.f24799h4.put(serializedData2.readString(z12), new ap(serializedData2.readInt64(z12), serializedData2.readInt64(z12), serializedData2.readByteArray(z12)));
                        i14++;
                        z12 = true;
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e11) {
                a8.f(e11);
            }
        }
        String string5 = this.f24774e7.getString("gifSearchEmojies", null);
        if (string5 == null) {
            this.f24743b4.add("👍");
            this.f24743b4.add("👎");
            this.f24743b4.add("😍");
            this.f24743b4.add("😂");
            this.f24743b4.add("😮");
            this.f24743b4.add("🙄");
            this.f24743b4.add("😥");
            this.f24743b4.add("😡");
            this.f24743b4.add("🥳");
            this.f24743b4.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string5, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    boolean z13 = true;
                    int readInt323 = serializedData3.readInt32(true);
                    while (i10 < readInt323) {
                        this.f24743b4.add(serializedData3.readString(z13));
                        i10++;
                        z13 = true;
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e12) {
                a8.f(e12);
            }
        }
        g0.i3(new vj(this, 6), 2000L);
        g0.i3(new vj(this, 1), 2000L);
        g0.i3(new vj(this, 7), 400L);
        this.f24877q7 = new k00(i7);
        this.f24887r7 = new u2(i7);
        this.f24896s7 = new f10(this);
        Utilities.f21336e.c(new vj(this, 9));
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
                long j3 = user.f27105id;
                if (j3 == 777000 || j3 == 333000 || j3 == 4240000 || j3 == 4244000 || j3 == 4245000 || j3 == 4246000 || j3 == 410000 || j3 == 420000 || j3 == 431000 || j3 == 431415000 || j3 == 434000 || j3 == 4243000 || j3 == 439000 || j3 == 449000 || j3 == 450000 || j3 == 452000 || j3 == 454000 || j3 == 4254000 || j3 == 455000 || j3 == 460000 || j3 == 470000 || j3 == 479000 || j3 == 796000 || j3 == 482000 || j3 == 490000 || j3 == 496000 || j3 == 497000 || j3 == 498000 || j3 == 4298000) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.Q1(org.telegram.tgnet.TLRPC$Reaction):long");
    }

    public static void R4(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f2Var.getResourceProvider());
            String M0 = id.M0(2131751455, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            HashMap hashMap = new HashMap();
            int i7 = org.telegram.ui.ActionBar.k6.L5;
            hashMap.put("info1", Integer.valueOf(f2Var.getThemedColor(i7)));
            hashMap.put("info2", Integer.valueOf(f2Var.getThemedColor(i7)));
            alertDialog$Builder.m(2131624107, 52, f2Var.getThemedColor(i7), hashMap);
            u1Var.W = true;
            alertDialog$Builder.k(id.M0(2131752041, null), null);
            u1Var.T = str;
            f2Var.showDialog(u1Var);
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
        if (r2.f25212a) {
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
            tL_inputMediaDocument.f27017id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.f26968id = document.f26962id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputMediaPhoto.f27019id = tL_inputPhoto;
            TLRPC.Photo photo = messageMedia.photo;
            tL_inputPhoto.f26975id = photo.f26980id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            return tL_inputMediaPhoto;
        } else {
            return null;
        }
    }

    public static String a(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new zk(1)).collect(Collectors.joining(","));
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
        return s1(0).f24784f7;
    }

    public static SharedPreferences e1() {
        return s1(0).f24774e7;
    }

    public static SharedPreferences f1() {
        return s1(0).f24764d7;
    }

    public static TLRPC.TL_wallPaperSettings g2(org.telegram.ui.ActionBar.c6 c6Var) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = c6Var.f27408i;
        tL_wallPaperSettings.motion = c6Var.f27409j;
        int i7 = c6Var.d;
        if (i7 != 0) {
            tL_wallPaperSettings.background_color = i7 & 16777215;
            int i10 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (c6Var.f27410k * 100.0f);
            tL_wallPaperSettings.flags = i10 | 9;
        } else {
            float f10 = c6Var.f27410k;
            if (f10 > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f10 * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i11 = c6Var.f27405e;
        if (i11 != 0) {
            tL_wallPaperSettings.second_background_color = i11 & 16777215;
            tL_wallPaperSettings.rotation = g0.s1(c6Var.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i12 = c6Var.f27406f;
        if (i12 != 0) {
            tL_wallPaperSettings.third_background_color = i12 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i13 = c6Var.f27407g;
        if (i13 != 0) {
            tL_wallPaperSettings.fourth_background_color = i13 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static boolean h2(String str, ArrayList arrayList) {
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

    public static TLRPC.InputChannel i1(TLRPC.Chat chat) {
        if (t3.T(chat)) {
            if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                tL_inputChannelFromMessage.channel_id = chat.f26956id;
                tL_inputChannelFromMessage.peer = s1(p10.f24470s0).j1(chat.fromMessageDialogId);
                tL_inputChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputChannelFromMessage;
            }
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.f26956id;
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
                tL_inputPeerChannelFromMessage.channel_id = chat.f26956id;
                tL_inputPeerChannelFromMessage.peer = s1(p10.f24470s0).j1(chat.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.f26956id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
        tL_inputPeerChat.chat_id = chat.f26956id;
        return tL_inputPeerChat;
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

    public static TLRPC.InputPeer n1(TLRPC.User user) {
        if (user != null && user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = user.f27105id;
            tL_inputPeerUserFromMessage.peer = s1(p10.f24470s0).j1(user.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.f27105id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.TL_emojiStatusCollectible q0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.f27185id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.f26962id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.f26962id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public static TLRPC.InputWallPaper r1(org.telegram.ui.ActionBar.c6 c6Var) {
        if (c6Var.f27411l > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.f27028id = c6Var.f27411l;
            tL_inputWallPaper.access_hash = c6Var.f27412m;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = c6Var.f27404c;
        return tL_inputWallPaperSlug;
    }

    public static qp s1(int i7) {
        qp qpVar;
        qp qpVar2 = E8[i7];
        if (qpVar2 == null) {
            synchronized (F8[i7]) {
                try {
                    qpVar = E8[i7];
                    if (qpVar == null) {
                        qp[] qpVarArr = E8;
                        qp qpVar3 = new qp(i7);
                        qpVarArr[i7] = qpVar3;
                        qpVar = qpVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return qpVar;
        }
        return qpVar2;
    }

    public static boolean t0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.f26962id == messageMedia2.document.f26962id) {
                return true;
            }
            return false;
        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.f26980id == messageMedia2.photo.f26980id) {
            return true;
        } else {
            return false;
        }
    }

    public static void u0(long j3, TLObject tLObject, ArrayList arrayList) {
        int i7 = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i7 < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
                    if (m5.o(message.from_id) == user.f27105id) {
                        user.fromMessageDialogId = j3;
                        user.fromMessageId = message.f26977id;
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
                    if (m5.o(message2.from_id) == (-chat.f26956id)) {
                        chat.fromMessageDialogId = j3;
                        chat.fromMessageId = message2.f26977id;
                        return;
                    }
                    i7++;
                }
            }
        }
    }

    public static int v3(ArrayList arrayList) {
        TLRPC.Message message;
        int i7;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; arrayList != null && i11 < arrayList.size(); i11++) {
            ij ijVar = (ij) arrayList.get(i11);
            if (ijVar != null && (message = ijVar.f23262k) != null && (i7 = message.date) > i10) {
                i10 = i7;
            }
        }
        return i10;
    }

    public static SharedPreferences x1(int i7) {
        return s1(i7).f24764d7;
    }

    public static ArrayList y0(TLRPC.Updates updates, Class cls) {
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

    public static ArrayList z0(TLRPC.Updates updates, Class cls) {
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

    public final void A() {
        org.telegram.ui.ActionBar.c6 c6Var = this.R2;
        if (c6Var != null) {
            if (c6Var.f27418s != null) {
                for (int i7 = 0; i7 < this.R2.f27418s.size(); i7++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) this.R2.f27418s.get(i7)).intValue(), true);
                }
            }
            w7.G(this.currentAccount).b(this.Q2, false);
            long j3 = this.R2.f27413n;
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 != 0) {
                if (i10 >= 0) {
                    TLRPC.UserFull b22 = b2(j3);
                    if (b22 != null) {
                        b22.wallpaper = this.R2.f27419t;
                        qs.f(this.currentAccount).k(qs.E0, Long.valueOf(this.R2.f27413n), b22);
                    }
                } else {
                    TLRPC.ChatFull N0 = N0(-j3);
                    if (N0 != null) {
                        N0.wallpaper = this.R2.f27419t;
                        qs f10 = qs.f(this.currentAccount);
                        Boolean bool = Boolean.FALSE;
                        f10.k(qs.T, N0, 0, bool, bool);
                    }
                }
            }
            this.R2 = null;
            this.Q2 = null;
        }
    }

    public final void A0() {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i7 = messagesStorage.f26731w;
        yr messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i10 = messagesStorage2.f26729r;
        yr messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        int i11 = messagesStorage3.f26728n;
        yr messagesStorage4 = getMessagesStorage();
        messagesStorage4.H();
        q4(true, i7, i10, i11, messagesStorage4.f26730s);
        dt notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        dt.f22076k0.c(new rs(notificationsController, 9));
    }

    public final String A1(long j3) {
        return B1(j3, false);
    }

    public final boolean A2(long j3) {
        if (j3 > 0) {
            return K2(b2(j3));
        }
        return o2(M0(Long.valueOf(-j3)));
    }

    public final void A3(int i7) {
        boolean z9;
        ArrayList arrayList;
        TLRPC.User f10;
        if (i7 == 1) {
            Context context = t0.f25566b;
            int i10 = this.currentAccount;
            long e10 = getUserConfig().e();
            if (e10 == 0) {
                Object obj = org.telegram.ui.Wallet.q0.f43047f;
            } else {
                synchronized (org.telegram.ui.Wallet.q0.f43047f) {
                    try {
                        ArrayList n10 = org.telegram.ui.Wallet.q0.n(context, e10);
                        int size = n10.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = n10.get(i11);
                            i11++;
                            new org.telegram.ui.Wallet.q0(i10, context, (String) obj2).B();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (getUserConfig().d && iz.f23402g.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = iz.f23402g;
                unregisterdevice.token_type = iz.f23399f;
                for (int i12 = 0; i12 < 4; i12++) {
                    p10 i13 = p10.i(i12);
                    if (i12 != this.currentAccount && i13.p()) {
                        unregisterdevice.other_uids.add(Long.valueOf(i13.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new di.u5(13));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new rj(this, 20));
        } else {
            ConnectionsManager connectionsManager = getConnectionsManager();
            if (i7 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            connectionsManager.cleanup(z9);
        }
        getUserConfig().b();
        b6.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().f25124a.get(qs.I2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ls lsVar = (ls) arrayList2.get(i14);
                if (lsVar instanceof os) {
                    lsVar = (ls) ((os) lsVar).f24383b.get();
                }
                if (lsVar != null) {
                    arrayList.add(lsVar);
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
        if (p10.f24470s0 == this.currentAccount) {
            int i16 = 0;
            while (true) {
                if (i16 < 4) {
                    if (p10.i(i16).p()) {
                        break;
                    }
                    i16++;
                } else {
                    i16 = -1;
                    break;
                }
            }
            if (i16 != -1) {
                p10.f24470s0 = i16;
                p10.i(0).v(false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null) {
                    launchActivity.I();
                }
            }
        }
        getNotificationCenter().k(qs.I2, new Object[0]);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new dr(messagesStorage, false, 1));
        Q();
        g5 contactsController = getContactsController();
        contactsController.getClass();
        try {
            contactsController.f22600a = null;
            AccountManager accountManager = AccountManager.get(t0.f25566b);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i17 = 0; i17 < accountsByType.length; i17++) {
                Account account = accountsByType[i17];
                int i18 = 0;
                while (true) {
                    if (i18 < 4) {
                        if (p10.i(i18).f() != null) {
                            if (account.name.equals("" + f10.f27105id)) {
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
        tL_messages_startBot.peer = j1(user.f27105id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.f21334b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new rj(this, 21));
    }

    public final void B(long j3, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, org.telegram.ui.hz hzVar) {
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
        if (t3.S(this.currentAccount, j3)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = h1(j3);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j3;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new mm(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j3, hzVar), 64);
    }

    public final void B0(long j3, boolean z9) {
        TLRPC.Chat M0 = M0(Long.valueOf(j3));
        if (M0 != null && t3.S(this.currentAccount, j3)) {
            if ((!t3.r0(M0) || z9) && !M0.creator && !t3.p0(M0)) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.flags = 256;
                int j10 = getUserConfig().j();
                tL_messageService.f26977id = j10;
                tL_messageService.local_id = j10;
                if ((M0 instanceof TLRPC.TL_channel) && !z9) {
                    tL_messageService.date = M0.date;
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
                arrayList.add(new ij(this.currentAccount, tL_messageService, true, false));
                getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                g0.h3(new fk(this, j3, arrayList, 3));
            }
        }
    }

    public final String B1(long j3, boolean z9) {
        String str;
        if (j3 >= 0) {
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (z9) {
                return g0.F2(g0.D2(t10.j(a22, true)));
            }
            return g0.F2(g0.D2(t10.p(a22)));
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j3));
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        return g0.F2(g0.D2(str));
    }

    public final boolean B3(long j3, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        TLRPC.InputPeer inputPeer2;
        NativeByteBuffer nativeByteBuffer;
        long z10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j3);
        if (dialog != null && dialog.pinned != z9) {
            int i7 = dialog.folder_id;
            ArrayList W0 = W0(i7);
            dialog.pinned = z9;
            if (z9) {
                int i10 = 0;
                for (int i11 = 0; i11 < W0.size(); i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i11);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!dialog2.pinned) {
                            if (dialog2.f26960id != this.f24956z2) {
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
            if (!z9 && !W0.isEmpty() && jg.g.i(1, W0) == dialog && !this.f24741b2.get(i7)) {
                a8.p0.z(1, W0);
            }
            getNotificationCenter().k(qs.f25070s, new Object[0]);
            if (!m5.C(j3) && j10 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z9;
                if (inputPeer == null) {
                    inputPeer2 = j1(j3);
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
                                nativeByteBuffer.writeBool(z9);
                                inputPeer2.serializeToStream(nativeByteBuffer);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer2 = nativeByteBuffer;
                                a8.g(e, true);
                                nativeByteBuffer = nativeByteBuffer2;
                                z10 = getMessagesStorage().z(nativeByteBuffer);
                                getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new pj(this, z10, 11));
                                yr messagesStorage = getMessagesStorage();
                                messagesStorage.f26719a.c(new aq(messagesStorage, dialog.pinnedNum, j3, 3));
                                return true;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        z10 = getMessagesStorage().z(nativeByteBuffer);
                    } else {
                        z10 = j10;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new pj(this, z10, 11));
                }
            }
            yr messagesStorage2 = getMessagesStorage();
            messagesStorage2.f26719a.c(new aq(messagesStorage2, dialog.pinnedNum, j3, 3));
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
                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_chats;
                final ArrayList arrayList6 = arrayList3;
                final ArrayList arrayList7 = arrayList2;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs3 = tL_messages_dialogs;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                if (z9) {
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
                    final yr messagesStorage = qp.this.getMessagesStorage();
                    p5 p5Var = messagesStorage.f26719a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    p5Var.c(new Runnable() {
                        @Override
                        public final void run() {
                            yr.this.Y0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void C(long j3, String str, ii.i iVar) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (t3.S(this.currentAccount, j3)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = h1(j3);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j3;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new r4(7, this, iVar), 64);
    }

    public final String C0(long j3, long j10) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j3 == j10) {
            return "";
        }
        a0.h hVar = (a0.h) this.f24936x1.f(j3);
        if (hVar != null && (channelParticipant2 = (TLRPC.ChannelParticipant) hVar.f(j10)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return id.M0(2131752207, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return id.M0(2131752208, null);
            }
        }
        TLRPC.ChatFull N0 = N0(j3);
        if (N0 != null && N0.participants != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= N0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j10) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return id.M0(2131752207, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return id.M0(2131752208, null);
                    }
                } else {
                    i7++;
                }
            }
        }
        return null;
    }

    public final TLRPC.PeerSettings C1(long j3) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull b22 = b2(j3);
        if (b22 != null && (peerSettings = b22.settings) != null) {
            return peerSettings;
        }
        return (TLRPC.PeerSettings) this.f24862p1.f(j3);
    }

    public final boolean C2(long j3, boolean z9) {
        TLRPC.Dialog dialog = this.f24937x2;
        if (dialog != null && dialog.f26960id == j3) {
            if (!z9 || this.f24947y2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C3(TLRPC.Chat chat, TLRPC.User user, int i7, boolean z9, boolean z10, boolean z11) {
        long j3;
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        if (chat != null) {
            j3 = -chat.f26956id;
        } else {
            j3 = user.f27105id;
        }
        tL_messages_updatePinnedMessage.peer = j1(j3);
        tL_messages_updatePinnedMessage.f27082id = i7;
        tL_messages_updatePinnedMessage.unpin = z9;
        tL_messages_updatePinnedMessage.silent = !z11;
        tL_messages_updatePinnedMessage.pm_oneside = z10;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new cn(this, i7, chat, user, z9));
    }

    public final boolean C4(int r17, int r18, long r19, long r21, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.C4(int, int, long, long, java.lang.String):boolean");
    }

    public final void D() {
        if (!this.f24819k0 && P1().h.isEmpty()) {
            i4(1);
        } else {
            boolean[] zArr = {false};
            r0(1, zArr);
            if (zArr[0]) {
                T4(null);
                getNotificationCenter().k(qs.f25070s, new Object[0]);
            }
        }
        getNotificationCenter().k(qs.f25063r, 0);
    }

    public final int D0() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f24924w;
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

    public final CharSequence D1(long j3, long j10, boolean z9) {
        a0.h hVar;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if ((z9 && m5.E(j3) && (a22 = a2(Long.valueOf(j3))) != null && (userStatus = a22.status) != null && userStatus.expires < 0) || (hVar = (a0.h) this.W.f(j3)) == null) {
            return null;
        }
        return (CharSequence) hVar.f(j10);
    }

    public final boolean D2(int i7, long j3, boolean z9) {
        Boolean bool = (Boolean) this.f24897s8.get(j3 + "_" + i7);
        if (bool != null && bool.booleanValue() == z9) {
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

    public final void D4(int i7, long j3) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i7;
        tL_channels_setBoostsToUnblockRestrictions.channel = h1(j3);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new pj(this, j3, 15));
    }

    public final boolean E(Bundle bundle, final org.telegram.ui.ActionBar.f2 f2Var, ij ijVar, org.telegram.ui.hi hiVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String F1;
        org.telegram.ui.ActionBar.u1 u1Var;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (f2Var != null) {
            long j3 = bundle.getLong("user_id", 0L);
            long j10 = bundle.getLong("chat_id", 0L);
            int i7 = bundle.getInt("message_id", 0);
            if (j3 != 0) {
                user = a2(Long.valueOf(j3));
                chat = null;
            } else if (j10 != 0) {
                chat = M0(Long.valueOf(j10));
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
                    R4(F1, f2Var);
                    return false;
                } else if (i7 != 0 && ijVar != null && chat != null && chat.access_hash == 0) {
                    long B0 = ij.B0(ijVar.f23262k);
                    if (!m5.C(B0)) {
                        if (hiVar != null) {
                            hiVar.d();
                            u1Var = null;
                        } else {
                            u1Var = new org.telegram.ui.ActionBar.u1(3, f2Var.getParentActivity(), null);
                        }
                        int i10 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
                        if (i10 < 0) {
                            chat = M0(Long.valueOf(-B0));
                        }
                        if (i10 <= 0 && t3.T(chat)) {
                            TLRPC.Chat M0 = M0(Long.valueOf(-B0));
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = i1(M0);
                            tL_channels_getMessages.f26994id.add(Integer.valueOf(ijVar.f1()));
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.f27052id.add(Integer.valueOf(ijVar.f1()));
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        final int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new eo(this, u1Var, hiVar, f2Var, bundle, 1));
                        if (u1Var != null) {
                            u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                @Override
                                public final void onCancel(DialogInterface dialogInterface) {
                                    qp.this.getConnectionsManager().cancelRequest(sendRequest, true);
                                    f2Var.setVisibleDialog(null);
                                }
                            });
                            f2Var.setVisibleDialog(u1Var);
                            u1Var.show();
                            return false;
                        }
                        hiVar.f57323b = new l7(this, sendRequest, f2Var, 15);
                        hiVar.d();
                        return false;
                    }
                    return true;
                } else if (i7 != 0 && ijVar != null && hiVar != null) {
                    hiVar.d();
                    hiVar.f57323b = s0(-j10, i7, new h6.m(hiVar, f2Var, bundle, 21));
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
        if (!this.f24794g8) {
            this.f24794g8 = true;
            this.f24810i8.c(this.currentAccount, 0, new go(this, 0));
        }
        return this.f24802h8;
    }

    public final Integer E1(long j3, long j10) {
        a0.h hVar = (a0.h) this.X.f(j3);
        if (hVar == null) {
            return null;
        }
        return (Integer) hVar.f(j10);
    }

    public final boolean E2() {
        TLRPC.UserFull b22 = b2(getUserConfig().e());
        if (b22 == null) {
            return false;
        }
        return !b22.sponsored_enabled;
    }

    public final void E3() {
        int i7 = this.i7;
        if (i7 < 2) {
            this.i7 = i7 + 1;
            SharedPreferences sharedPreferences = this.f24774e7;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.i7).apply();
            }
        }
    }

    public final void E4(int i7, long j3) {
        SharedPreferences.Editor edit = this.f24774e7.edit();
        edit.putInt("chatPendingRequests" + j3, i7).apply();
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
        int i7 = qs.U;
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

    public final void F0(boolean z9) {
        int size;
        int i7;
        if (getUserConfig().p() && !this.F0) {
            this.F0 = true;
            TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
            if (z9) {
                size = 0;
            } else {
                size = this.G0.size();
            }
            tL_contacts_getBlocked.offset = size;
            if (z9) {
                i7 = 20;
            } else {
                i7 = 100;
            }
            tL_contacts_getBlocked.limit = i7;
            getConnectionsManager().sendRequest(tL_contacts_getBlocked, new n3(this, z9, tL_contacts_getBlocked, 3));
        }
    }

    public final String F1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i7);
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

    public final void F3(int i7, long j3) {
        LongSparseLongArray longSparseLongArray;
        boolean z9;
        a0.h hVar = this.W0;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            LongSparseIntArray longSparseIntArray = this.Y0;
            int i10 = longSparseIntArray.get(j3);
            if (!arrayList.isEmpty() && i10 != 0) {
                Collections.sort(arrayList, new jg.x(29));
                if (i7 == 2) {
                    longSparseIntArray.put(j3, ((TLRPC.Updates) arrayList.get(0)).pts);
                }
                boolean z10 = false;
                while (true) {
                    int size = arrayList.size();
                    longSparseLongArray = this.X0;
                    if (size <= 0) {
                        break;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) arrayList.get(0);
                    int i11 = updates.pts;
                    if (i11 <= i10) {
                        z9 = true;
                    } else if (updates.pts_count + i10 == i11) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (!z9) {
                        O3(updates, true);
                        if (arrayList.size() <= 0) {
                            break;
                        }
                        arrayList.remove(0);
                        z10 = true;
                    } else if (z9) {
                        long j10 = longSparseLongArray.get(j3);
                        if (j10 != 0 && (z10 || Math.abs(System.currentTimeMillis() - j10) <= 1500)) {
                            if (r2.f25212a) {
                                a8.b("HOLE IN CHANNEL " + j3 + " UPDATES QUEUE - will wait more time");
                            }
                            if (z10) {
                                longSparseLongArray.put(j3, System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (r2.f25212a) {
                            a8.b("HOLE IN CHANNEL " + j3 + " UPDATES QUEUE - getChannelDifference ");
                        }
                        longSparseLongArray.delete(j3);
                        hVar.l(j3);
                        I0(j3);
                        return;
                    } else if (arrayList.size() <= 0) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
                hVar.l(j3);
                longSparseLongArray.delete(j3);
                if (r2.f25212a) {
                    a8.b("UPDATES CHANNEL " + j3 + " QUEUE PROCEED - OK");
                    return;
                }
                return;
            }
            hVar.l(j3);
        }
    }

    public final void F4(boolean z9) {
        TL_account.contentSettings contentsettings = this.f24843m8;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            }
            contentsettings.sensitive_enabled = z9;
        }
        if (this.C4 == null) {
            this.C4 = new HashSet();
        }
        if (z9) {
            this.C4.add("sensitive");
        } else {
            this.C4.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.f24774e7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.C4).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z9;
        getConnectionsManager().sendRequest(setcontentsettings, new di.u5(12));
    }

    public final void G(long j3, boolean z9) {
        TLRPC.Chat M0 = M0(Long.valueOf(j3));
        if (t3.T(M0) && !M0.creator) {
            a0.h hVar = this.f24730a1;
            if (hVar.h(j3) < 0) {
                if (t3.p0(M0)) {
                    z9 = false;
                }
                boolean z10 = z9;
                hVar.k(Boolean.TRUE, j3);
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = h1(j3);
                tL_channels_getParticipant.participant = j1(getUserConfig().e());
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new el(this, M0, z10, j3));
            }
        }
    }

    public final f3 G0() {
        f3 f3Var = this.m0;
        if (f3Var != null) {
            return f3Var;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                f3 f3Var2 = this.m0;
                if (f3Var2 != null) {
                    return f3Var2;
                }
                f3 f3Var3 = new f3(this.currentAccount);
                this.m0 = f3Var3;
                return f3Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final vv G1() {
        vv vvVar = this.f24803i0;
        if (vvVar != null) {
            return vvVar;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                vv vvVar2 = this.f24803i0;
                if (vvVar2 != null) {
                    return vvVar2;
                }
                vv vvVar3 = new vv(this.currentAccount);
                this.f24803i0 = vvVar3;
                return vvVar3;
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
        long R1 = ij.R1(getUserConfig().e(), message);
        boolean z9 = false;
        for (int i7 = 0; i7 < message.reactions.results.size(); i7++) {
            if (s5(R1, ch.o0.d(message.reactions.results.get(i7).reaction), false)) {
                z9 = true;
            }
        }
        return z9;
    }

    public final void G4(final long j3, int i7, ArrayList arrayList, int i10, Boolean bool, final ch.i iVar, final ch.h hVar) {
        final TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = j1(-j3);
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
                qp qpVar = qp.this;
                qpVar.getClass();
                if (tLObject != null) {
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    long j10 = j3;
                    TLRPC.ChatFull N0 = qpVar.N0(j10);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= 1073741824;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        qpVar.getMessagesStorage().N1(N0, false);
                    }
                    g0.h3(new xm(qpVar, hVar, j10));
                    return;
                }
                g0.h3(new hi(21, iVar, tL_error));
            }
        });
        TLRPC.ChatFull N0 = N0(j3);
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

    public final void H(int i7, boolean z9) {
        if (i7 >= 0) {
            SparseArray sparseArray = this.f24749c0;
            so soVar = (so) sparseArray.get(i7);
            if (soVar != 0) {
                if (!soVar.f25505a) {
                    if (System.currentTimeMillis() - soVar.f25506b <= this.f24800h5 * 1000 && !z9) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (soVar == 0) {
                soVar = new Object();
                soVar.f25505a = true;
                sparseArray.put(i7, soVar);
            }
            soVar.f25505a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i7;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new bo(this, i7, soVar, 4));
        }
    }

    public final int H0() {
        if (getUserConfig().q()) {
            return this.U4;
        }
        return this.T4;
    }

    public final jp H1() {
        if (this.f24905t8 == null) {
            this.f24905t8 = new jp(this.currentAccount);
        }
        return this.f24905t8;
    }

    public final boolean H2() {
        return !"disabled".equals(this.U6);
    }

    public final void H3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        g0.h3(new lg(this, longSparseIntArray, longSparseIntArray2, 9));
    }

    public final void H4(final long j3, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z9, final org.telegram.ui.ActionBar.f2 f2Var) {
        if (tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = j1(-j3);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new d3.b(1), new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                qp qpVar = qp.this;
                if (tL_error == null) {
                    qpVar.getClass();
                    g0.i3(new mk(qpVar, j3, 19), 1000L);
                    return;
                }
                org.telegram.ui.Components.v4.c0(qpVar.currentAccount, tL_error, f2Var, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z9));
            }
        });
    }

    public final boolean I(boolean z9) {
        a0.h hVar;
        int i7;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.V1 == null && this.W1 == null) || (!z9 && ((i7 = this.U1) == 0 || i7 > currentTime))) {
            return false;
        }
        this.U1 = 0;
        if (this.X1 != null && !z9) {
            Utilities.d.a(this.X1);
        }
        a0.h hVar2 = null;
        this.X1 = null;
        a0.h hVar3 = this.V1;
        if (hVar3 != null) {
            hVar = hVar3.clone();
        } else {
            hVar = null;
        }
        a0.h hVar4 = this.W1;
        if (hVar4 != null) {
            hVar2 = hVar4.clone();
        }
        g0.h3(new tj(this, hVar, hVar2, 0));
        return true;
    }

    public final void I0(long j3) {
        J0(j3, 0, 0L, null);
    }

    public final TLRPC.TL_messages_savedReactionsTags I1(long j3, boolean z9) {
        HashSet hashSet = this.Z7;
        if (hashSet != null && hashSet.contains(Long.valueOf(j3)) && !z9) {
            a0.h hVar = this.f24737a8;
            if (hVar == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) hVar.f(j3);
        }
        if (this.Z7 == null) {
            this.Z7 = new HashSet();
        }
        this.Z7.add(Long.valueOf(j3));
        getMessagesStorage().f26719a.c(new mk(this, j3, 7));
        return null;
    }

    public final boolean I2(long j3) {
        if (j3 != 0 && !m5.C(j3) && j3 != getUserConfig().e()) {
            String str = "dialog_bar_vis3" + j3;
            SharedPreferences sharedPreferences = this.f24764d7;
            if (sharedPreferences.getInt(str, 0) == 2 && k5.w("dialog_bar_report", j3, sharedPreferences, false) && !k5.w("dialog_bar_replied", j3, sharedPreferences, false)) {
                return true;
            }
        }
        return false;
    }

    public final void I3(long j3, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        a0.h hVar = new a0.h(tL_channels_channelParticipants.participants.size());
        for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
            hVar.k(channelParticipant, ij.C1(channelParticipant.peer));
        }
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new a4(messagesStorage, j3, hVar, 24));
        g0.h3(new rg(this, j3, hVar, false));
    }

    public final void I4(int i7, long j3) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = j1(j3);
        tL_messages_setHistoryTTL.period = i7;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new rj(this, 2));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j3);
        if (dialog != null) {
            dialog.ttl_period = i7;
        }
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new aq(messagesStorage, i7, j3, 0));
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.ChatFull chatFull = null;
        if (i10 > 0) {
            userFull = b2(j3);
            if (userFull != null) {
                userFull.ttl_period = i7;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull N0 = N0(-j3);
            if (N0 != null) {
                N0.ttl_period = i7;
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
            qs notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(qs.T, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(qs.E0, Long.valueOf(j3), userFull);
        }
    }

    public final void J(int i7) {
        if (i7 == 0) {
            return;
        }
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new tp(messagesStorage, i7, 5));
    }

    public final void J0(long r18, int r20, long r21, org.telegram.tgnet.TLRPC.InputChannel r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.J0(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public final void J1() {
        I1(0L, false);
    }

    public final TL_account.RequirementToContact J2(long j3) {
        if (!getUserConfig().q() && getUserConfig().e() != j3) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.f24765d8.f(j3);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (a22 == null || a22.contact_require_premium || a22.send_paid_messages_stars != 0) {
                TLRPC.UserFull b22 = b2(j3);
                if (b22 != null) {
                    return t10.o(b22);
                }
                o1(j3);
                this.f24775e8.add(Long.valueOf(j3));
                vj vjVar = this.f24785f8;
                g0.r(vjVar);
                g0.i3(vjVar, 60L);
            }
        }
        return null;
    }

    public final void J3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i7, final int i10, final int i11, final int i12, final boolean z9, final boolean z10, final boolean z11) {
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.am.run():void");
            }
        });
    }

    public final void J4(long j3, long j10) {
        this.f24774e7.edit().putLong(a8.p0.o(j3, "forumlasttopic"), j10).apply();
    }

    public final void K(TLRPC.Chat chat, TLRPC.User user, dp dpVar) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (!chat.megagroup && !t3.T(chat)) {
            TLRPC.ChatFull N0 = N0(chat.f26956id);
            boolean z9 = false;
            if (N0 != null) {
                TLRPC.ChatParticipants chatParticipants = N0.participants;
                if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        chatParticipant = N0.participants.participants.get(i7);
                        if (chatParticipant != null && chatParticipant.user_id == user.f27105id) {
                            break;
                        }
                    }
                }
                chatParticipant = null;
                if (chatParticipant != null) {
                    z9 = true;
                }
                TLRPC.ChatParticipants chatParticipants2 = N0.participants;
                if (chatParticipants2 != null && chatParticipants2.admin_id == user.f27105id) {
                    tL_chatAdminRights = org.telegram.ui.kp.t0(true);
                } else {
                    tL_chatAdminRights = null;
                }
                dpVar.a(z9, tL_chatAdminRights, null);
                return;
            }
            dpVar.a(false, null, null);
            return;
        }
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = h1(chat.f26956id);
        tL_channels_getParticipant.participant = n1(user);
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new s1(dpVar, 4));
    }

    public final void K0(TLRPC.Chat chat, TLRPC.User user, c20 c20Var) {
        if (chat != null) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = h1(chat.f26956id);
            tL_channels_getParticipant.participant = n1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new c3(c20Var, 1));
            return;
        }
        c20Var.a(null);
    }

    public final java.lang.String K1(org.telegram.tgnet.TLRPC.Reaction r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.K1(org.telegram.tgnet.TLRPC$Reaction):java.lang.String");
    }

    public final void K3(final org.telegram.tgnet.TLRPC.messages_Messages r50, final int r51, long r52, final long r54, final int r56, final int r57, final int r58, final boolean r59, final int r60, final int r61, final int r62, final int r63, final int r64, final int r65, final boolean r66, final int r67, long r68, final int r70, final boolean r71, final int r72, final boolean r73, final boolean r74, final org.telegram.messenger.a00 r75) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.K3(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.a00):void");
    }

    public final void K4(long j3, boolean z9, boolean z10) {
        if (!z9) {
            ArrayList arrayList = this.f24925w0;
            if (z10) {
                if (arrayList.contains(Long.valueOf(j3))) {
                    return;
                }
                arrayList.add(Long.valueOf(j3));
            } else {
                arrayList.remove(Long.valueOf(j3));
                SparseArray sparseArray = (SparseArray) this.K0.f(j3);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((ij) sparseArray.valueAt(i7)).f23296t0 = false;
                    }
                }
            }
        }
        Utilities.d.c(new ii.m(this, z9, z10, j3, 2));
    }

    public final void L(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j3) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (!m5.C(dialog.f26960id)) {
            long j10 = dialog.f26960id;
            a0.h hVar = this.f24759d1;
            if (hVar.h(j10) < 0) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                if (inputPeer == null) {
                    inputPeer = j1(dialog.f26960id);
                }
                tL_messages_getHistory.peer = inputPeer;
                tL_messages_getHistory.limit = 1;
                hVar.k(Boolean.TRUE, dialog.f26960id);
                if (r2.f25212a) {
                    jg.g.u(dialog.f26960id, new StringBuilder("checkLastDialogMessage for "));
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
                        nativeByteBuffer.writeInt64(dialog.f26960id);
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
                        getConnectionsManager().sendRequest(tL_messages_getHistory, new oj(this, dialog, j3, 9));
                    }
                    j3 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getHistory, new oj(this, dialog, j3, 9));
            }
        }
    }

    public final ro L0(long j3) {
        ro roVar;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.Y7 == null) {
            this.Y7 = new HashMap();
        }
        boolean q10 = getUserConfig().q();
        if (this.Y7.containsKey(Long.valueOf(j3))) {
            roVar = (ro) this.Y7.get(Long.valueOf(j3));
            if (roVar == null || roVar.f25312a == q10) {
                return roVar;
            }
        } else {
            roVar = null;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = o1(j3);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (i7 != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = h1(-j3);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.Y7.put(Long.valueOf(j3), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new sf(this, q10, j3, 1));
        return roVar;
    }

    public final TLRPC.TL_channels_sendAsPeers L1(long j3) {
        return M1(j3, false);
    }

    public final boolean L2(boolean z9) {
        ArrayList<TL_account.WebDomainException> arrayList;
        int i7;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
        if (tL_webBrowserSettings == null) {
            return false;
        }
        if (z9) {
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

    public final void L3(int i7, int i10, long j3) {
        if (r2.f25212a) {
            jg.g.u(j3, jg.g.o("processNewChannelDifferenceParams pts = ", i7, " pts_count = ", i10, " channeldId = "));
        }
        LongSparseIntArray longSparseIntArray = this.Y0;
        int i11 = longSparseIntArray.get(j3);
        if (i11 == 0) {
            i11 = getMessagesStorage().N(j3);
            if (i11 == 0) {
                i11 = 1;
            }
            longSparseIntArray.put(j3, i11);
        }
        if (i11 + i10 == i7) {
            if (r2.f25212a) {
                a8.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j3, i7);
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new aq(messagesStorage, i7, j3, 5));
        } else if (i11 != i7) {
            LongSparseLongArray longSparseLongArray = this.X0;
            long j10 = longSparseLongArray.get(j3);
            if (!((Boolean) this.Z0.g(Boolean.FALSE, j3)).booleanValue() && j10 != 0 && Math.abs(System.currentTimeMillis() - j10) > 1500) {
                I0(j3);
                return;
            }
            if (r2.f25212a) {
                a8.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i7 + " pts_count = " + i10);
            }
            if (j10 == 0) {
                longSparseLongArray.put(j3, System.currentTimeMillis());
            }
            TLRPC.Updates updates = new TLRPC.Updates();
            updates.pts = i7;
            updates.pts_count = i10;
            updates.chat_id = j3;
            a0.h hVar = this.W0;
            ArrayList arrayList = (ArrayList) hVar.f(j3);
            if (arrayList == null) {
                arrayList = k5.j(hVar, j3);
            }
            arrayList.add(updates);
        }
    }

    public final void L4(long j3, boolean z9, boolean z10) {
        ArrayList arrayList;
        if (z9) {
            arrayList = this.f24945y0;
        } else {
            arrayList = this.f24935x0;
        }
        if (z10) {
            if (arrayList.contains(Long.valueOf(j3))) {
                return;
            }
            arrayList.add(Long.valueOf(j3));
            return;
        }
        arrayList.remove(Long.valueOf(j3));
    }

    public final void M(boolean z9) {
        int i7;
        gp gpVar;
        int i10;
        if (getUserConfig().f() != null) {
            if (!this.f24747b8 && ((gpVar = this.f24874q4) == null || gpVar.g() || z9)) {
                this.f24747b8 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                gp gpVar2 = this.f24874q4;
                if (gpVar2 != null) {
                    i10 = gpVar2.f22705b;
                } else {
                    i10 = 0;
                }
                tL_help_getPeerColors.hash = i10;
                if (gpVar2 != null && gpVar2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new rj(this, 22));
            }
            if (!this.f24757c8) {
                gp gpVar3 = this.f24884r4;
                if (gpVar3 == null || gpVar3.g() || z9) {
                    this.f24757c8 = true;
                    TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                    gp gpVar4 = this.f24884r4;
                    if (gpVar4 != null) {
                        i7 = gpVar4.f22705b;
                    } else {
                        i7 = 0;
                    }
                    tL_help_getPeerProfileColors.hash = i7;
                    if (gpVar4 != null && gpVar4.g()) {
                        tL_help_getPeerProfileColors.hash = 0;
                    }
                    getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new rj(this, 23));
                }
            }
        }
    }

    public final TLRPC.Chat M0(Long l10) {
        return (TLRPC.Chat) this.f24738b.get(l10);
    }

    public final TLRPC.TL_channels_sendAsPeers M1(long j3, boolean z9) {
        a0.h hVar;
        TLRPC.Chat M0;
        if (z9) {
            hVar = this.C1;
        } else {
            hVar = this.B1;
        }
        a0.h hVar2 = hVar;
        lp lpVar = (lp) hVar2.f(j3);
        if (lpVar != null) {
            return lpVar.f23924a;
        }
        if (!z9 && ((M0 = M0(Long.valueOf(-j3))) == null || !t3.k(M0))) {
            return null;
        }
        ?? obj = new Object();
        hVar2.k(obj, j3);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = j1(j3);
        tL_channels_getSendAs.for_live_stories = z9;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new y3(this, hVar2, j3, (lp) obj, z9));
        return null;
    }

    public final boolean M2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
        if (tL_webBrowserSettings != null && !tL_webBrowserSettings.open_external_browser) {
            return true;
        }
        return false;
    }

    public final void M3(int i7, int i10, int i11) {
        if (r2.f25212a) {
            jg.g.s(i11, jg.g.o("processNewDifferenceParams seq = -1 pts = ", i7, " date = ", i10, " pts_count = "));
        }
        if (i7 != -1) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.H();
            if (messagesStorage.f26729r + i11 == i7) {
                if (r2.f25212a) {
                    a8.b("APPLY PTS");
                }
                getMessagesStorage().I1(i7);
                yr messagesStorage2 = getMessagesStorage();
                yr messagesStorage3 = getMessagesStorage();
                messagesStorage3.H();
                int i12 = messagesStorage3.f26731w;
                yr messagesStorage4 = getMessagesStorage();
                messagesStorage4.H();
                int i13 = messagesStorage4.f26729r;
                yr messagesStorage5 = getMessagesStorage();
                messagesStorage5.H();
                int i14 = messagesStorage5.f26728n;
                yr messagesStorage6 = getMessagesStorage();
                messagesStorage6.H();
                messagesStorage2.A1(i12, i13, i14, messagesStorage6.f26730s);
                return;
            }
            yr messagesStorage7 = getMessagesStorage();
            messagesStorage7.H();
            if (messagesStorage7.f26729r != i7) {
                if (!this.f24779f2 && this.f24804i1 != 0 && Math.abs(System.currentTimeMillis() - this.f24804i1) > 1500) {
                    X0();
                    return;
                }
                if (r2.f25212a) {
                    a8.b("ADD UPDATE TO QUEUE pts = " + i7 + " pts_count = " + i11);
                }
                if (this.f24804i1 == 0) {
                    this.f24804i1 = System.currentTimeMillis();
                }
                TLRPC.Updates updates = new TLRPC.Updates();
                updates.pts = i7;
                updates.pts_count = i11;
                this.f24778f1.add(updates);
            }
        }
    }

    public final void M4(final long j3, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z9, final org.telegram.ui.ActionBar.f2 f2Var, final org.telegram.ui.ActionBar.p pVar) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = h1(j3);
        if (user != null) {
            tL_channels_editBanned.participant = n1(user);
        } else {
            tL_channels_editBanned.participant = l1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                qp qpVar = qp.this;
                if (tL_error == null) {
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new mk(qpVar, j3, 17), 1000L);
                    Runnable runnable = pVar;
                    if (runnable != null) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                g0.h3(new ln((c1) qpVar, (Object) tL_error, (Object) f2Var, (Object) tL_channels_editBanned, z9, 0));
            }
        });
    }

    public final void N(boolean z9) {
        String str;
        boolean z10 = false;
        if (z9 && this.f24908u2) {
            this.f24908u2 = false;
        }
        if ((z9 || this.f24900t2 <= getConnectionsManager().getCurrentTime()) && !this.f24908u2) {
            if (this.f24917v2 != 0) {
                getConnectionsManager().cancelRequest(this.f24917v2, true);
                this.f24917v2 = 0;
            }
            SharedPreferences e12 = e1();
            e12.getBoolean("proxy_enabled", false);
            String string = e12.getString("proxy_ip", "");
            String string2 = e12.getString("proxy_secret", "");
            if (this.f24956z2 != 0 && this.A2 == 0 && (str = this.D2) != null) {
                if (!str.equals(string + string2)) {
                    z10 = true;
                }
            }
            int i7 = this.f24927w2 + 1;
            this.f24927w2 = i7;
            this.f24908u2 = true;
            this.f24917v2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new bh(this, i7, string, string2, 1));
            if (z10) {
                this.f24956z2 = 0L;
                this.D2 = null;
                this.f24900t2 = getConnectionsManager().getCurrentTime() + 3600;
                e1().edit().putLong("proxy_dialog", this.f24956z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.f24900t2).commit();
                g0.h3(new sn(this, 8));
            }
        }
    }

    public final TLRPC.ChatFull N0(long j3) {
        return (TLRPC.ChatFull) this.l1.f(j3);
    }

    public final long N1(long j3) {
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 > 0) {
            if (j3 == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull b22 = b2(j3);
            if (b22 != null) {
                return b22.send_paid_messages_stars;
            }
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (a22 != null && a22.send_paid_messages_stars > 0) {
                return m5.k(J2(a22.f27105id));
            }
        } else if (i7 < 0) {
            long j10 = -j3;
            TLRPC.Chat M0 = M0(Long.valueOf(j10));
            if (t3.N(M0)) {
                return 0L;
            }
            if (t3.p0(M0) && t3.A(this.currentAccount, M0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull N0 = N0(j10);
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
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.N3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void N4(boolean z9) {
        if (this.f24858o6 != z9) {
            SharedPreferences.Editor edit = this.f24774e7.edit();
            this.f24858o6 = z9;
            edit.putBoolean("savedViewAsChats", z9).apply();
        }
    }

    public final void O(long j3, long j10, SparseBooleanArray sparseBooleanArray) {
        P(j3, j10, sparseBooleanArray, false);
    }

    public final int O0(long j3) {
        TLRPC.ChatFull N0 = s1(this.currentAccount).N0(-j3);
        if (N0 != null && (!(N0 instanceof TLRPC.TL_chatFull) ? (N0.flags2 & 8192) != 0 : (N0.flags & 1048576) != 0)) {
            return N0.reactions_limit;
        }
        return this.K5;
    }

    public final mp O1(long j3) {
        a0.h hVar = this.A1;
        mp mpVar = (mp) hVar.f(j3);
        if (mpVar != null && (mpVar.d || Math.abs(SystemClock.elapsedRealtime() - mpVar.f24072c) <= 300000)) {
            return mpVar;
        }
        if (j3 >= 0 ? !t10.t(a2(Long.valueOf(j3))) : !t3.T(M0(Long.valueOf(-j3)))) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        hVar.k(obj, j3);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = j1(j3);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new oj(this, j3, (Object) obj, 0));
        return null;
    }

    public final boolean O2() {
        if (!M2()) {
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
            if (tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O3(org.telegram.tgnet.TLRPC.Updates r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.O3(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public final void O4(int i7, long j3) {
        if (i7 == 0) {
            this.f24796h1 = j3;
        } else if (i7 == 1) {
            this.f24804i1 = j3;
        } else if (i7 == 2) {
            this.f24812j1 = j3;
        }
    }

    public final void P(final long j3, final long j10, final SparseBooleanArray sparseBooleanArray, final boolean z9) {
        String str;
        String str2;
        if (z9) {
            str = "reaction_mentions";
        } else {
            str = "poll_votes_mentions";
        }
        final String str3 = str;
        if (z9) {
            str2 = "reaction_mentions_topics";
        } else {
            str2 = "poll_votes_mentions_topics";
        }
        final String str4 = str2;
        final boolean z10 = !z9;
        getMessagesStorage().f26719a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wj.run():void");
            }
        });
    }

    public final to P0(long j3) {
        LongSparseArray longSparseArray = this.f24888r8;
        to toVar = (to) longSparseArray.get(j3);
        if (toVar == null) {
            to toVar2 = new to(this.currentAccount, j3);
            longSparseArray.put(j3, toVar2);
            return toVar2;
        }
        return toVar;
    }

    public final di.y6 P1() {
        di.y6 y6Var = this.f24795h0;
        if (y6Var != null) {
            return y6Var;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                di.y6 y6Var2 = this.f24795h0;
                if (y6Var2 != null) {
                    return y6Var2;
                }
                di.y6 y6Var3 = new di.y6(this.currentAccount);
                this.f24795h0 = y6Var3;
                return y6Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void P2(int r67, java.util.ArrayList r68, java.util.ArrayList r69, java.util.ArrayList r70, java.util.ArrayList r71, a0.h r72, int r73, org.telegram.messenger.support.LongSparseIntArray r74, a0.h r75, a0.h r76, java.util.ArrayList r77, a0.h r78, a0.h r79, bg.v r80, a0.h r81, boolean r82, java.util.ArrayList r83, java.util.ArrayList r84, a0.h r85, a0.h r86, a0.h r87, java.util.ArrayList r88) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.P2(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, a0.h, int, org.telegram.messenger.support.LongSparseIntArray, a0.h, a0.h, java.util.ArrayList, a0.h, a0.h, bg.v, a0.h, boolean, java.util.ArrayList, java.util.ArrayList, a0.h, a0.h, a0.h, java.util.ArrayList):void");
    }

    public final void P3(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.P3(int, int):void");
    }

    public final void P4(final long j3, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z9, final org.telegram.ui.ActionBar.f2 f2Var, boolean z10, boolean z11, String str2, final Runnable runnable, final bp bpVar) {
        if (user != null && tL_chatAdminRights != null) {
            final TLRPC.Chat M0 = M0(Long.valueOf(j3));
            final boolean Y = t3.Y(M0);
            boolean z12 = true;
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
                        qp qpVar = qp.this;
                        if (tL_error == null) {
                            qpVar.O3((TLRPC.Updates) tLObject, false);
                            g0.i3(new xm(qpVar, j3, runnable, 2), 1000L);
                            return;
                        }
                        boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                        bp bpVar2 = bpVar;
                        if (equals) {
                            TLRPC.Chat chat = M0;
                            if (!t3.Y(chat) && t3.y(3, chat)) {
                                g0.h3(new mn(qpVar, user, chat, bpVar2, tL_error, 0));
                                return;
                            }
                        }
                        g0.h3(new nn(qpVar, tL_error, f2Var, tL_channels_editAdmin, z9, Y));
                        if (bpVar2 != null) {
                            g0.h3(new an(bpVar2, tL_error, 1));
                        }
                    }
                };
                if (!user.bot && z10) {
                    m(j3, user, 0, str2, f2Var, true, new lg(this, tL_channels_editAdmin, requestDelegate, 10), bpVar, null);
                    return;
                } else {
                    getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                    return;
                }
            }
            TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
            tL_messages_editChatAdmin.chat_id = j3;
            tL_messages_editChatAdmin.user_id = q1(user);
            if (!z11 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
                z12 = false;
            }
            boolean z13 = z12;
            tL_messages_editChatAdmin.is_admin = z13;
            bi.g4 g4Var = new bi.g4(this, j3, runnable, f2Var, tL_messages_editChatAdmin, bpVar);
            if (!z13 && !z10 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tL_messages_editChatAdmin, g4Var);
            } else {
                m(j3, user, 0, str2, f2Var, true, new lg(this, tL_messages_editChatAdmin, g4Var, 11), bpVar, null);
            }
        }
    }

    public final void Q() {
        g5 contactsController = getContactsController();
        contactsController.Y.clear();
        contactsController.Z.clear();
        contactsController.f22601a0.clear();
        contactsController.f22608e0.clear();
        contactsController.f22610f0.clear();
        contactsController.f22611g0.clear();
        contactsController.f22613i0.clear();
        contactsController.f22612h0.clear();
        contactsController.f22614j0.clear();
        contactsController.f22621x.clear();
        contactsController.f22615k0.clear();
        contactsController.f22616l0.clear();
        contactsController.f22603b0.clear();
        contactsController.f22605c0.clear();
        contactsController.f22606d0.clear();
        contactsController.f22602b = false;
        contactsController.f22607e = false;
        contactsController.f22617n = false;
        contactsController.h = false;
        contactsController.f22618r = false;
        contactsController.f22620w = "";
        contactsController.F = 0;
        contactsController.G = 0;
        contactsController.H = 0;
        Arrays.fill(contactsController.I, 0);
        contactsController.J = null;
        contactsController.K = null;
        contactsController.L = null;
        contactsController.M = null;
        contactsController.N = null;
        contactsController.O = null;
        contactsController.P = null;
        contactsController.U = null;
        contactsController.V = null;
        contactsController.Q = null;
        contactsController.R = null;
        Utilities.f21336e.c(new k4(contactsController, 4));
        MediaController.B().o();
        dt notificationsController = getNotificationsController();
        notificationsController.f22100w.clear();
        notificationsController.f22101x.clear();
        notificationsController.Q = false;
        dt.f22076k0.c(new rs(notificationsController, 4));
        gz sendMessagesHelper = getSendMessagesHelper();
        sendMessagesHelper.f22764a.clear();
        sendMessagesHelper.f22765b.clear();
        sendMessagesHelper.f22766c.clear();
        sendMessagesHelper.d.clear();
        sendMessagesHelper.f22768f.b();
        sendMessagesHelper.f22767e.clear();
        sendMessagesHelper.h.b();
        sendMessagesHelper.f22769n.clear();
        sendMessagesHelper.f22770r.clear();
        sendMessagesHelper.f22772w.clear();
        sendMessagesHelper.f22774y.clear();
        sendMessagesHelper.D.b();
        sendMessagesHelper.E.clear();
        sendMessagesHelper.F.clear();
        sendMessagesHelper.G.p();
        dw secretChatHelper = getSecretChatHelper();
        secretChatHelper.f22123a.clear();
        secretChatHelper.f22126e.clear();
        secretChatHelper.f22124b.clear();
        secretChatHelper.f22125c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f22127f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.f22128n = false;
        sd locationController = getLocationController();
        locationController.I.clear();
        locationController.J.b();
        locationController.f25457c.b();
        locationController.G.b();
        locationController.d.b();
        sd.s();
        Utilities.d.c(new jd(locationController, 2));
        ui mediaDataController = getMediaDataController();
        int i7 = 0;
        while (true) {
            ArrayList[] arrayListArr = mediaDataController.f25814f0;
            if (i7 >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i7];
            if (arrayList != null) {
                arrayList.clear();
            }
            mediaDataController.f25816g0[i7] = false;
            mediaDataController.f25818h0[i7] = false;
            i7++;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            mediaDataController.X[i10] = 0;
            mediaDataController.Y[i10] = 0;
            mediaDataController.G[i10].clear();
            mediaDataController.V[i10] = false;
            mediaDataController.W[i10] = false;
        }
        mediaDataController.f25833p1.b();
        int[] iArr = mediaDataController.f25834q0;
        iArr[0] = 0;
        long[] jArr = mediaDataController.f25832p0;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        mediaDataController.f25808d0.clear();
        mediaDataController.f25811e0.clear();
        mediaDataController.f25806c0.b();
        mediaDataController.f25842t0[0].b();
        mediaDataController.f25840s0[0].clear();
        mediaDataController.f25842t0[1].b();
        mediaDataController.f25840s0[1].clear();
        mediaDataController.f25844u0[0].clear();
        mediaDataController.f25844u0[1].clear();
        mediaDataController.f25820i0.clear();
        mediaDataController.I.b();
        mediaDataController.J.b();
        mediaDataController.N.clear();
        mediaDataController.Q.clear();
        mediaDataController.R.b();
        mediaDataController.S.clear();
        boolean[] zArr = mediaDataController.f25849w0;
        zArr[0] = false;
        boolean[] zArr2 = mediaDataController.f25852x0;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        mediaDataController.f25822j0 = false;
        mediaDataController.f25824k0 = false;
        mediaDataController.f25858z1.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.f21336e.c(new rc(5));
        }
        mediaDataController.f25800a0.clear();
        mediaDataController.n1 = false;
        mediaDataController.f25827m1 = false;
        mediaDataController.f25821i1.clear();
        mediaDataController.f25823j1.clear();
        mediaDataController.f25825k1.clear();
        mediaDataController.l1.clear();
        g0.h3(new fg(mediaDataController, 5));
        mediaDataController.f25838r1.b();
        mediaDataController.f25841s1.b();
        mediaDataController.f25843t1.edit().clear().apply();
        mediaDataController.f25847v1.clear();
        mediaDataController.f25853x1.clear();
        mediaDataController.f25856y1.b();
        getColorPalette().a();
        this.f24896s7.i();
        G1().a();
        org.telegram.ui.Wallet.m0 m0Var = org.telegram.ui.Wallet.m0.O[this.currentAccount];
        if (m0Var != null) {
            org.telegram.ui.Wallet.q0.z(m0Var.J);
            m0Var.G.clear();
            m0Var.N.clear();
            WalletEngine2 walletEngine2 = m0Var.f42763b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                m0Var.f42763b = null;
                m0Var.d = null;
            }
            org.telegram.ui.Wallet.e0 e0Var = m0Var.f42774o;
            if (e0Var != null) {
                e0Var.c();
            }
            int i11 = m0Var.f42762a;
            if (m0Var.A >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(m0Var.A, true);
                m0Var.A = -1;
            }
            if (m0Var.B >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(m0Var.B, true);
                m0Var.B = -1;
            }
            if (m0Var.C >= 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(m0Var.C, true);
                m0Var.C = -1;
            }
            m0Var.f0();
            m0Var.E.clear();
            org.telegram.ui.Wallet.z0 z0Var = m0Var.f42778s;
            if (z0Var != null) {
                z0Var.h();
                m0Var.f42778s = null;
            }
            g0.r(m0Var.F);
            synchronized (org.telegram.ui.Wallet.m0.class) {
                try {
                    if (org.telegram.ui.Wallet.m0.O[m0Var.f42762a] == m0Var) {
                        org.telegram.ui.Wallet.m0.O[m0Var.f42762a] = null;
                    }
                } finally {
                }
            }
        }
        di.y6 y6Var = this.f24795h0;
        if (y6Var != null) {
            y6Var.q();
        }
        m10 m10Var = this.f24811j0;
        if (m10Var != null) {
            m10Var.a();
        }
        this.J3 = false;
        org.telegram.ui.ww.f51531y4[this.currentAccount] = false;
        this.f24764d7.edit().clear().commit();
        this.f24784f7.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        k5.d(this.f24774e7.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editor = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                Integer z9 = Utilities.z(key);
                int intValue = z9.intValue();
                if (editor == null) {
                    editor = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(t0.f25566b);
                }
                editor.putBoolean("deleted" + intValue, true);
                if (sharedPreferences.getInt("type" + intValue, 0) == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(z9);
                } else {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(z9);
                }
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                ChatsWidgetProvider.a(t0.f25566b, appWidgetManager, ((Integer) arrayList2.get(i12)).intValue());
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ContactsWidgetProvider.a(t0.f25566b, appWidgetManager, ((Integer) arrayList3.get(i13)).intValue());
            }
        }
        this.J1.b();
        this.K1.b();
        this.L1.b();
        this.M1.b();
        this.N1.b();
        this.D1.clear();
        this.E1.b();
        this.F1.clear();
        this.G1.b();
        this.H1.clear();
        this.I1.b();
        this.A1.b();
        this.B1.b();
        this.C1.b();
        this.Q.b();
        this.O.clear();
        this.f24855o2.clear();
        this.P.clear();
        this.f24879r.b();
        this.f24820k1.b();
        this.l1.b();
        this.h.clear();
        this.f24899t1.clear();
        this.n1.b();
        this.f24924w.clear();
        this.f24934x.b();
        this.S7.clear();
        this.R7.clear();
        this.U7.b();
        this.T7.clear();
        this.f24844n.clear();
        this.f24955z1.clear();
        this.J0.b();
        this.K0.b();
        this.L0 = 0;
        this.E.clear();
        this.D.clear();
        this.f24944y.clear();
        this.N = Integer.MAX_VALUE;
        this.F.clear();
        this.G.clear();
        this.H.clear();
        this.I.clear();
        this.L.clear();
        this.J.clear();
        this.K.clear();
        this.U.clear();
        this.S.b();
        this.f24936x1.b();
        this.f24946y1.clear();
        this.d.clear();
        this.f24766e.clear();
        this.S2 = null;
        this.f24765d8.b();
        this.f24775e8.clear();
        this.f24738b.clear();
        this.R.b();
        this.T.clear();
        this.V.clear();
        this.W.b();
        this.X.b();
        this.Z.clear();
        this.f24898t0.b();
        this.D0.b();
        this.E0.b();
        this.f24739b0 = 0;
        vo[] voVarArr = this.M;
        voVarArr[1] = null;
        voVarArr[0] = null;
        this.P0.clear();
        this.S0.clear();
        this.T0 = false;
        this.V0.clear();
        this.U0 = false;
        this.f24793g7 = false;
        Utilities.d.c(new sn(this, 5));
        this.f24925w0.clear();
        this.f24935x0.clear();
        this.f24945y0.clear();
        this.G0.clear();
        int i14 = 0;
        while (true) {
            a0.h[] hVarArr = this.Y;
            if (i14 >= hVarArr.length) {
                break;
            }
            a0.h hVar = hVarArr[i14];
            if (hVar != null) {
                hVar.b();
            }
            i14++;
        }
        this.f24871q1.clear();
        this.f24881r1.clear();
        this.O1.b();
        this.f24891s1.clear();
        this.f24907u1.clear();
        this.f24916v1.clear();
        this.f24926w1.clear();
        this.Y1 = false;
        this.Z1.clear();
        this.f24731a2.clear();
        this.f24741b2.clear();
        this.f24751c2.clear();
        this.E2 = false;
        this.F2 = 0;
        this.f24900t2 = 0;
        this.f24908u2 = false;
        this.d2 = false;
        this.U1 = 0;
        this.V1 = null;
        this.W1 = null;
        this.T1 = false;
        this.F0 = false;
        this.H0 = -1;
        this.I0 = false;
        this.f24805i2 = false;
        this.f24797h2 = false;
        this.f24829l2 = false;
        this.J2 = 0L;
        this.M2 = false;
        this.f24813j2 = false;
        this.f24788g2 = true;
        this.N2 = null;
        this.Q2 = null;
        this.R2 = null;
        this.P2.clear();
        this.f24730a1.b();
        this.K2 = 0;
        this.L2 = 0;
        Utilities.d.c(new sn(this, 6));
        if (this.X1 != null) {
            Utilities.d.a(this.X1);
            this.X1 = null;
        }
        k();
        g0.h3(new sn(this, 7));
    }

    public final np Q0(long j3) {
        TLRPC.Chat M0;
        ?? obj = new Object();
        ArrayList arrayList = (ArrayList) this.f24934x.f(j3);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
                long j10 = dialog.f26960id;
                boolean z9 = true;
                if (j10 < 0 && (M0 = M0(Long.valueOf(-j10))) != null && (M0.forum || (M0.monoforum && t3.A(this.currentAccount, M0, 24)))) {
                    s1(this.currentAccount).f24877q7.h(M0.f26956id);
                    int i10 = obj.f24214a;
                    int[] iArr = k00.f23639n;
                    int i11 = iArr[0];
                    obj.f24214a = i10 + i11;
                    obj.f24215b += iArr[1];
                    obj.f24216c += iArr[2];
                    obj.d += iArr[4];
                    boolean z10 = obj.f24217e;
                    if (!z10 && i11 > 0) {
                        if (iArr[3] == 0) {
                            z9 = false;
                        }
                        obj.f24217e = z10 | z9;
                    }
                } else {
                    int i12 = obj.f24214a;
                    int i13 = dialog.unread_count;
                    obj.f24214a = i12 + i13;
                    obj.f24215b += dialog.unread_mentions_count;
                    obj.f24216c += dialog.unread_reactions_count;
                    obj.d += dialog.unread_poll_votes_count;
                    boolean z11 = obj.f24217e;
                    if (!z11 && i13 > 0) {
                        obj.f24217e = (!r2(dialog.f26960id, 0L, null)) | z11;
                    }
                }
            }
        }
        return obj;
    }

    public final int Q2(final long j3, final long j10, final boolean z9, boolean z10, final v10 v10Var) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = h1(j10);
        tL_communities_togglePeerLink.peer = j1(j3);
        tL_communities_togglePeerLink.deleted = z9;
        tL_communities_togglePeerLink.visible = !z10;
        tL_communities_togglePeerLink.hidden = z10;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new d3.b(1), new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat M0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                qp qpVar = qp.this;
                long j11 = j3;
                v10 v10Var2 = v10Var;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (M0 = qpVar.M0(Long.valueOf(-j11))) != null) {
                    qpVar.Q2(j11, M0.linked_community_id, true, false, v10Var2);
                    return;
                }
                boolean z11 = bool instanceof TLRPC.TL_boolTrue;
                long j12 = j10;
                if (z11) {
                    long j13 = 0;
                    int i7 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    boolean z12 = z9;
                    if (i7 > 0) {
                        TLRPC.User a22 = qpVar.a2(Long.valueOf(j11));
                        if (a22 != null) {
                            if (!z12) {
                                j13 = j12;
                            }
                            a22.linked_community_id = j13;
                            a22.flags2 = c8.zc.b(a22.flags2, 2097152, !z12);
                        }
                    } else {
                        TLRPC.Chat M02 = qpVar.M0(Long.valueOf(-j11));
                        if (M02 != null) {
                            if (!z12) {
                                j13 = j12;
                            }
                            M02.linked_community_id = j13;
                            M02.flags2 = c8.zc.b(M02.flags2, 1048576, !z12);
                        }
                    }
                }
                qpVar.V2(0, j12, true);
                v10Var2.a(bool, tL_error);
            }
        });
    }

    public final void Q3(TLRPC.Chat chat, boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (chat != null) {
            Long valueOf = Long.valueOf(chat.f26956id);
            ConcurrentHashMap concurrentHashMap = this.f24738b;
            TLRPC.Chat chat2 = (TLRPC.Chat) concurrentHashMap.get(valueOf);
            if (chat2 != chat) {
                ConcurrentHashMap concurrentHashMap2 = this.f24766e;
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
                j5(-chat.f26956id, chat.emoji_status);
                if (chat2 != null && chat2.access_hash == 0) {
                    long j3 = chat.fromMessageDialogId;
                    if (j3 != 0 && (i13 = chat.fromMessageId) != 0) {
                        chat2.fromMessageDialogId = j3;
                        chat2.fromMessageId = i13;
                    }
                }
                if (chat.min) {
                    if (chat2 != null) {
                        if (!z9) {
                            LruCache lruCache = d2().f25405b;
                            String str = chat2.username;
                            if (str != null && !TextUtils.equals(str, chat.username)) {
                                lruCache.remove(chat2.username);
                                String str2 = chat.username;
                                if (str2 != null) {
                                    lruCache.put(str2, new r10(-chat.f26956id));
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
                            boolean z10 = chat2.forum;
                            boolean z11 = chat.forum;
                            if (z10 != z11) {
                                chat2.forum = z11;
                                if (z11) {
                                    chat2.flags |= 1073741824;
                                } else {
                                    chat2.flags &= -1073741825;
                                }
                                getNotificationCenter().k(qs.f25069r5, Long.valueOf(chat.f26956id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                            }
                        }
                    } else {
                        concurrentHashMap.put(Long.valueOf(chat.f26956id), chat);
                        i(chat);
                    }
                } else {
                    if (!z9) {
                        if (chat2 != null) {
                            if (chat.version != chat2.version) {
                                this.f24926w1.delete(chat.f26956id);
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
                                g0.h3(new sj(this, chat, 3));
                            }
                        }
                        concurrentHashMap.put(Long.valueOf(chat.f26956id), chat);
                    } else if (chat2 == null) {
                        concurrentHashMap.put(Long.valueOf(chat.f26956id), chat);
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
                        concurrentHashMap.put(Long.valueOf(chat.f26956id), chat);
                    }
                    i(chat);
                }
                if (chat2 != null && chat2.forum != chat.forum) {
                    g0.h3(new sj(this, chat, 4));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    g0.h3(new sj(this, chat, 5));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j10 = chat.f26956id;
                    if (N0(j10) == null) {
                        getMessagesStorage().F0(j10, false, null, false, false, 0);
                        V2(0, j10, false);
                    }
                }
            }
        }
    }

    public final void Q4(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.f24953y8 = tL_webBrowserSettings;
        int i7 = this.currentAccount;
        long j3 = tL_webBrowserSettings.hash;
        this.f24962z8.g(i7, null, tL_webBrowserSettings);
        getNotificationCenter().k(qs.R5, new Object[0]);
    }

    public final void R(ip ipVar) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (ipVar.f23349b != 0 && ipVar.f23350c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) ipVar.f23349b;
            tL_messages_readDiscussion.peer = j1(ipVar.f23348a);
            tL_messages_readDiscussion.read_max_id = ipVar.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new di.u5(13));
        } else if (!m5.C(ipVar.f23348a)) {
            TLRPC.InputPeer j12 = j1(ipVar.f23348a);
            if (ipVar.f23350c != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = j1(ipVar.f23348a);
                tL_messages_readSavedHistory.peer = j1(ipVar.f23350c);
                tL_messages_readSavedHistory.max_id = ipVar.d;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (j12 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = h1(-ipVar.f23348a);
                tL_channels_readHistory.max_id = ipVar.d;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = j12;
                tL_messages_readHistory2.max_id = ipVar.d;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new rj(this, 1));
        } else {
            TLRPC.EncryptedChat a12 = a1(Integer.valueOf((int) (ipVar.f23348a & 4294967295L)));
            byte[] bArr = a12.auth_key;
            if (bArr != null && bArr.length > 1 && (a12 instanceof TLRPC.TL_encryptedChat)) {
                TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = a12.f26964id;
                tL_inputEncryptedChat.access_hash = a12.access_hash;
                tL_messages_readEncryptedHistory.max_date = ipVar.f23351e;
                getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new di.u5(13));
            }
        }
    }

    public final void R0(c20 c20Var) {
        if (this.f24843m8 != null && System.currentTimeMillis() - this.f24835l8 < 3600000) {
            if (c20Var != null) {
                c20Var.a(this.f24843m8);
                return;
            }
            return;
        }
        if (this.f24827k8 == null) {
            this.f24827k8 = new ArrayList();
        }
        if (c20Var != null) {
            this.f24827k8.add(c20Var);
        }
        if (this.f24818j8) {
            return;
        }
        this.f24818j8 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new rj(this, 25));
    }

    public final e R1() {
        if (this.f24904t7 == null) {
            this.f24904t7 = new e(this.currentAccount);
        }
        return this.f24904t7;
    }

    public final void R2(boolean z9) {
        g0.r(this.I7);
        no noVar = this.T2;
        if (z9) {
            noVar.d(this.currentAccount, 0);
        }
        noVar.c(this.currentAccount, 0, new go(this, 1));
    }

    public final void R3(TLRPC.ChatFull chatFull) {
        this.l1.k(chatFull, chatFull.f26957id);
        this.f24896s7.M(-chatFull.f26957id);
    }

    public final void S(Activity activity, TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var, qr qrVar) {
        org.telegram.ui.ActionBar.u1 u1Var;
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = i1(chat);
        if (activity != null) {
            u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        } else {
            u1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new yn(this, activity, u1Var, qrVar, f2Var, tL_channels_convertToGigagroup, 0));
        if (u1Var != null) {
            u1Var.setOnCancelListener(new gm(this, sendRequest, 1));
            try {
                u1Var.r(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final TLRPC.Dialog S0(long j3) {
        return (TLRPC.Dialog) this.Q.f(j3);
    }

    public final k00 S1() {
        return this.f24877q7;
    }

    public final void S2(long j3, boolean z9) {
        LongSparseIntArray longSparseIntArray = this.f24946y1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j3) < 60) {
            return;
        }
        longSparseIntArray.put(j3, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z9) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new xp(messagesStorage, j3, 7));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = h1(j3);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new pj(this, j3, 2));
    }

    public final void S3(ArrayList arrayList, boolean z9) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Q3((TLRPC.Chat) arrayList.get(i7), z9);
            }
        }
    }

    public final boolean S4() {
        if (this.f24843m8 != null && System.currentTimeMillis() - this.f24835l8 < 3600000) {
            return this.f24843m8.sensitive_enabled;
        }
        Set set = this.C4;
        if (set != null && !set.contains("sensitive")) {
            return false;
        }
        return true;
    }

    public final void T(Context context, long j3, org.telegram.ui.ActionBar.f2 f2Var, tr trVar, org.telegram.ui.qf qfVar) {
        org.telegram.ui.ActionBar.u1 u1Var;
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j3;
        if (context != null) {
            u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        } else {
            u1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new bi.x7(this, context, u1Var, trVar, j3, qfVar, f2Var, tL_messages_migrateChat));
        if (u1Var != null) {
            u1Var.setOnCancelListener(new gm(this, sendRequest, 0));
            try {
                u1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final ArrayList T0() {
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            return arrayList;
        }
        return this.P0;
    }

    public final f10 T1() {
        return this.f24896s7;
    }

    public final void T2(Long l10, fi.f8 f8Var, int i7) {
        HashSet hashSet = this.f24907u1;
        if (f8Var == null && (hashSet.contains(l10) || this.f24916v1.contains(l10))) {
            return;
        }
        hashSet.add(l10);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l10.getClass();
        tL_channels_getParticipants.channel = i1(M0(l10));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i7;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new di(this, l10, f8Var, 2));
    }

    public final void T3(long j3, TLRPC.DraftMessage draftMessage) {
        a0.h hVar = this.Q;
        if (hVar.h(j3) < 0) {
            if (!t3.o0(this.currentAccount, j3) || t3.z(this.currentAccount, 24, j3)) {
                ui mediaDataController = getMediaDataController();
                ArrayList arrayList = this.f24944y;
                int size = arrayList.size();
                int i7 = 1;
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < m5.j(dialog, mediaDataController.R(dialog.f26960id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.f26960id = j3;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.f25835q1.g(0, j3)).intValue();
                if (j3 >= 0 || !t3.T(M0(Long.valueOf(-j3)))) {
                    i7 = 0;
                }
                tL_dialog.flags = i7;
                hVar.k(tL_dialog, j3);
                arrayList.add(tL_dialog);
                T4(null);
            }
        }
    }

    public final void T4(a0.h r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.T4(a0.h):void");
    }

    public final int U(String str, ArrayList arrayList, String str2, int i7, boolean z9, Location location, String str3, int i10, org.telegram.ui.ActionBar.f2 f2Var) {
        boolean z10 = false;
        if (i7 == 0 && !z9) {
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
            return getConnectionsManager().sendRequest(tL_messages_createChat, new di(this, f2Var, tL_messages_createChat, 3), 2);
        } else if (!z9 && i7 != 2 && i7 != 4 && i7 != 5) {
            return 0;
        } else {
            TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
            tL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tL_channels_createChannel.about = str2;
            tL_channels_createChannel.for_import = z9;
            if (!z9 && i7 != 4 && i7 != 5) {
                tL_channels_createChannel.broadcast = true;
            } else {
                tL_channels_createChannel.megagroup = true;
            }
            if (i7 == 5) {
                z10 = true;
            }
            tL_channels_createChannel.forum = z10;
            if (location != null) {
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                tL_channels_createChannel.geo_point = tL_inputGeoPoint;
                tL_inputGeoPoint.lat = location.getLatitude();
                tL_channels_createChannel.geo_point._long = location.getLongitude();
                tL_channels_createChannel.address = str3;
                tL_channels_createChannel.flags |= 4;
            }
            return getConnectionsManager().sendRequest(tL_channels_createChannel, new di(this, f2Var, tL_channels_createChannel, 4), 2);
        }
    }

    public final yo U0(long j3) {
        a0.h hVar = this.L7;
        yo yoVar = (yo) hVar.f(j3);
        if (yoVar == null) {
            yo yoVar2 = new yo(this, j3);
            hVar.k(yoVar2, j3);
            return yoVar2;
        }
        return yoVar;
    }

    public final m10 U1() {
        m10 m10Var = this.f24811j0;
        if (m10Var != null) {
            return m10Var;
        }
        synchronized (F8[this.currentAccount]) {
            try {
                m10 m10Var2 = this.f24811j0;
                if (m10Var2 != null) {
                    return m10Var2;
                }
                m10 m10Var3 = new m10(this.currentAccount);
                this.f24811j0 = m10Var3;
                return m10Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void U2(int i7, int i10, int i11, boolean z9, tk tkVar) {
        long j3;
        int i12;
        a0.h hVar;
        int m10;
        SparseBooleanArray sparseBooleanArray = this.f24731a2;
        if (!sparseBooleanArray.get(i7) && !this.f24829l2) {
            sparseBooleanArray.put(i7, true);
            int i13 = qs.f25070s;
            getNotificationCenter().k(i13, new Object[0]);
            if (r2.f25212a) {
                StringBuilder o4 = jg.g.o("folderId = ", i7, " load cacheOffset = ", i10, " count = ");
                o4.append(i11);
                o4.append(" cache = ");
                o4.append(z9);
                a8.b(o4.toString());
            }
            long[] jArr = null;
            if (z9) {
                yr messagesStorage = getMessagesStorage();
                if (i10 == 0) {
                    i12 = 0;
                } else {
                    i12 = this.Z1.get(i7, 0);
                }
                if (i7 == 0 && i10 == 0 && (m10 = (hVar = messagesStorage.getMediaDataController().f25838r1).m()) > 0) {
                    jArr = new long[m10];
                    for (int i14 = 0; i14 < m10; i14++) {
                        if (((a0.h) hVar.n(i14)).f(0L) != null) {
                            jArr[i14] = hVar.j(i14);
                        }
                    }
                }
                messagesStorage.f26719a.c(new fi.v5(messagesStorage, i7, i12, i11, jArr));
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
                    this.f24741b2.put(i7, true);
                    this.f24751c2.put(i7, true);
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
                ArrayList W0 = W0(i7);
                int size = W0.size() - 1;
                while (true) {
                    if (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(size);
                        if (!dialog.pinned && !m5.C(dialog.f26960id) && dialog.top_message > 0) {
                            ArrayList arrayList = (ArrayList) this.R.f(dialog.f26960id);
                            ij ijVar = null;
                            if (arrayList != null) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    ij ijVar2 = (ij) arrayList.get(i16);
                                    if (ijVar2 != null && (ijVar == null || ijVar2.f1() > ijVar.f1())) {
                                        ijVar = (ij) arrayList.get(i16);
                                    }
                                }
                            }
                            if (ijVar != null && ijVar.f1() > 0) {
                                TLRPC.Message message = ijVar.f23262k;
                                tL_messages_getDialogs.offset_date = message.date;
                                tL_messages_getDialogs.offset_id = message.f26977id;
                                TLRPC.Peer peer = message.peer_id;
                                long j11 = peer.channel_id;
                                if (j11 == 0) {
                                    j11 = peer.chat_id;
                                    if (j11 == 0) {
                                        j3 = peer.user_id;
                                        tL_messages_getDialogs.offset_peer = j1(j3);
                                    }
                                }
                                j3 = -j11;
                                tL_messages_getDialogs.offset_peer = j1(j3);
                            }
                        }
                        size--;
                    } else {
                        tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        break;
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_getDialogs, new qf(this, i7, i11, tkVar, 1));
        }
    }

    public final void U3(TLRPC.EncryptedChat encryptedChat, boolean z9) {
        if (encryptedChat == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f24748c;
        if (z9) {
            concurrentHashMap.putIfAbsent(Integer.valueOf(encryptedChat.f26964id), encryptedChat);
        } else {
            concurrentHashMap.put(Integer.valueOf(encryptedChat.f26964id), encryptedChat);
        }
    }

    public final boolean U4() {
        return !this.f24817j7;
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

    public final int V0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i7 = dialog.unread_count;
        TLRPC.Chat M0 = M0(Long.valueOf(-dialog.f26960id));
        if (M0 != null && (M0.forum || M0.monoforum)) {
            this.f24877q7.h(-dialog.f26960id);
            return k00.f23639n[0];
        }
        return i7;
    }

    public final void V2(final int r11, final long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.V2(int, long, boolean):void");
    }

    public final void V3(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                U3((TLRPC.EncryptedChat) arrayList.get(i7), true);
            }
        }
    }

    public final void V4(TLRPC.Chat chat, int i7, boolean z9, org.telegram.ui.tf tfVar) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new bi.nb(this, chat, z9, i7, tfVar));
    }

    public final void W(long j3, long j10) {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new yq(messagesStorage, 0, j3, j10, 1));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = j1(j3);
        tL_messages_deleteParticipantReactions.participant = j1(j10);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new jh.b(3));
    }

    public final ArrayList W0(int i7) {
        ArrayList arrayList = (ArrayList) this.f24924w.get(i7);
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final void W2(final TLRPC.User user, final int i7, boolean z9, final c20 c20Var) {
        if (user != null) {
            HashSet hashSet = this.f24871q1;
            if (c20Var == null) {
                if (!hashSet.contains(Long.valueOf(user.f27105id))) {
                    if (!z9 && this.f24881r1.get(user.f27105id) > 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            hashSet.add(Long.valueOf(user.f27105id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.f27098id = q1(user);
            final long j3 = user.f27105id;
            if (this.O.get(Long.valueOf(j3)) == null || this.P.get(Long.valueOf(j3)) == null) {
                a4(null, j3);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    qp qpVar = qp.this;
                    TLRPC.User user2 = user;
                    if (tL_error == null) {
                        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                        TLRPC.UserFull userFull = tL_users_userFull.full_user;
                        qpVar.Y3(tL_users_userFull.users, false);
                        qpVar.S3(tL_users_userFull.chats, false);
                        TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                        userFull2.user = qpVar.a2(Long.valueOf(userFull2.f27106id));
                        qpVar.getMessagesStorage().j2(userFull, false);
                        qpVar.P1().p0(j3, userFull.stories);
                        d4 f10 = d4.f(qpVar.currentAccount);
                        TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                        f10.r(userFull3.f27106id, userFull3.wallpaper);
                        c20 c20Var2 = c20Var;
                        if (c20Var2 != null) {
                            c20Var2.a(userFull);
                        }
                        g0.h3(new dg(qpVar, userFull, user2, i7, 1));
                        return;
                    }
                    g0.h3(new uj(qpVar, user2, 0));
                }
            }), i7);
        }
    }

    public final void W3(long j3, r3 r3Var) {
        this.f24836m1.k(r3Var, r3Var.f25222b.f26966id);
        this.n1.k(r3Var, j3);
        TLRPC.ChatFull N0 = N0(j3);
        if (N0 != null) {
            N0.call = r3Var.g(r3Var.f25221a);
        }
        getNotificationCenter().k(qs.f25099w2, Long.valueOf(j3), Long.valueOf(r3Var.f25222b.f26966id), Boolean.FALSE);
        V2(0, j3, true);
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

    public final void X(int i7, long j3, boolean z9) {
        Y(j3, 1, i7, 0, z9, null, 0L);
    }

    public final void X0() {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i7 = messagesStorage.f26729r;
        yr messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i10 = messagesStorage2.f26728n;
        yr messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        Y0(i7, i10, messagesStorage3.f26730s, false);
    }

    public final void X2() {
        SharedPreferences.Editor editor;
        if (this.f24882r2 == 0 && !getUserConfig().S) {
            SharedPreferences sharedPreferences = s1(this.currentAccount).f24764d7;
            if (sharedPreferences.contains("EnableGroup")) {
                boolean z9 = sharedPreferences.getBoolean("EnableGroup", true);
                editor = sharedPreferences.edit();
                if (!z9) {
                    editor.putInt("EnableGroup2", Integer.MAX_VALUE);
                    editor.putInt("EnableChannel2", Integer.MAX_VALUE);
                }
                editor.remove("EnableGroup").commit();
            } else {
                editor = null;
            }
            if (sharedPreferences.contains("EnableAll")) {
                boolean z10 = sharedPreferences.getBoolean("EnableAll", true);
                if (editor == null) {
                    editor = sharedPreferences.edit();
                }
                if (!z10) {
                    editor.putInt("EnableAll2", Integer.MAX_VALUE);
                }
                editor.remove("EnableAll").commit();
            }
            if (editor != null) {
                editor.commit();
            }
            this.f24882r2 = 4;
            for (int i7 = 0; i7 < 3; i7++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i7 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i7 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                getConnectionsManager().sendRequest(getnotifysettings, new fo(this, i7, 1));
            }
            getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new rj(this, 6));
        }
        if (!getUserConfig().T && !this.f24892s2) {
            this.f24892s2 = true;
            getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new rj(this, 11));
        }
    }

    public final boolean X3(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.X3(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.Y(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public final void Y0(int i7, int i10, int i11, boolean z9) {
        Z3(iz.f23399f, iz.f23402g);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        if (messagesStorage.f26729r == 0) {
            if (!this.f24797h2) {
                this.f24797h2 = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new rj(this, 24));
            }
        } else if (!z9 && this.f24779f2) {
        } else {
            this.f24779f2 = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i7;
            tL_updates_getDifference.date = i10;
            tL_updates_getDifference.qts = i11;
            if (this.f24788g2) {
                tL_updates_getDifference.flags |= 1;
                if (t0.o()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.f24788g2 = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (r2.f25212a) {
                StringBuilder o4 = jg.g.o("start getDifference with date = ", i10, " pts = ", i7, " qts = ");
                o4.append(i11);
                a8.b(o4.toString());
                a8.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new fe(this, i10, i11, 1));
        }
    }

    public final void Y2(long j3, long j10, boolean z9, int i7, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, long j11, int i16, int i17, boolean z11) {
        int i18;
        if (j11 != 0) {
            i18 = i16;
        } else {
            i18 = 0;
        }
        Z2(j3, j10, z9, i7, i10, i11, z10, i12, i13, i14, 0, i15, j11, i17, i18, 0, 0, false, 0, true, true, z11, null, 0L);
    }

    public final void Y3(ArrayList arrayList, boolean z9) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (X3((TLRPC.User) arrayList.get(i7), z9, false)) {
                    z10 = true;
                }
            }
            if (z10) {
                g0.h3(new sn(this, 4));
            }
        }
    }

    public final boolean Y4(TLRPC.User user) {
        if (user != null && user.f27105id == this.f24828l0) {
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

    public final void Z(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j3, int i7, boolean z9, int i10) {
        a0(arrayList, arrayList2, encryptedChat, j3, z9, i10, false, 0L, null, i7);
    }

    public final TLRPC.TL_availableEffect Z0(long j3) {
        E0();
        if (this.f24802h8 != null) {
            for (int i7 = 0; i7 < this.f24802h8.effects.size(); i7++) {
                if (this.f24802h8.effects.get(i7).f26987id == j3) {
                    return this.f24802h8.effects.get(i7);
                }
            }
            return null;
        }
        return null;
    }

    public final long Z1(int i7) {
        if (i7 == 0) {
            return this.f24796h1;
        }
        if (i7 == 1) {
            return this.f24804i1;
        }
        if (i7 == 2) {
            return this.f24812j1;
        }
        return 0L;
    }

    public final void Z2(final long j3, final long j10, final boolean z9, final int i7, final int i10, final int i11, boolean z10, final int i12, final int i13, final int i14, final int i15, final int i16, final long j11, final int i17, final int i18, final int i19, final int i20, final boolean z11, final int i21, boolean z12, final boolean z13, final boolean z14, a00 a00Var, long j12) {
        int i22;
        a00 a00Var2;
        TLRPC.TL_forumTopic f10;
        if (r2.f25212a) {
            StringBuilder t6 = a8.p0.t(j3, "load messages in chat ", " topic_id ");
            t6.append(j11);
            t6.append(" count ");
            t6.append(i7);
            t6.append(" max_id ");
            t6.append(i10);
            t6.append(" cache ");
            t6.append(z10);
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
            t6.append(z11);
            t6.append(" isTopic ");
            t6.append(z14);
            a8.b(t6.toString());
        } else {
            i22 = i12;
        }
        if (r2.f25212a && a00Var == null && i16 == 0) {
            a00Var2 = new a00("MessageLoaderLogger dialogId=" + j3 + " index=" + i17 + " count=" + i7);
        } else {
            a00Var2 = a00Var;
        }
        int i23 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if ((i23 == 0 || z14 || i16 == 8 || i16 == 3 || i16 == 5 || i16 == 9) && i16 != 2 && (z10 || m5.C(j3))) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.f26719a.c(new wp(messagesStorage, a00.d(a00Var2, "MessagesStorage.getMessages: storageQueue.postRunnable"), a00Var2, j3, j10, i7, i10, i11, i22, i13, i14, i16, j11, i17, z13, z14));
            return;
        }
        int i24 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.Chat M0 = i24 < 0 ? M0(Long.valueOf(-j3)) : null;
        if (i16 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = j1(j3);
            tL_getWelcomeMessages.hash = j12;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new v10() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TL_ephemeral.WelcomeMessages welcomeMessages = (TL_ephemeral.WelcomeMessages) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    qp qpVar = qp.this;
                    qpVar.getClass();
                    if (welcomeMessages != null && !(welcomeMessages instanceof TL_ephemeral.TL_welcomeMessagesNotModified)) {
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        ArrayList<TL_ephemeral.EphemeralMessage> arrayList = welcomeMessages.messages;
                        int size = arrayList.size();
                        int i25 = 0;
                        while (i25 < size) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i25);
                            i25++;
                            tL_messages_messages.messages.add(bg.w.b(ephemeralMessage));
                        }
                        qpVar.K3(tL_messages_messages, tL_messages_messages.messages.size(), j3, j10, i7, i10, i11, false, i13, i18, i15, i19, i20, i14, false, i16, j11, i17, z11, i21, z13, z14, null);
                    }
                }
            }), i13);
        } else if (i16 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j11;
            tL_messages_getQuickReplyMessages.hash = j12;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new al(this, j3, j10, i7, i10, i11, i13, i18, i15, i19, i20, i14, i16, j11, i17, z11, i21, z13, z14)), i13);
        } else if (i23 == 0) {
            if (i16 == 2) {
                return;
            }
            if (i16 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = j1(j3);
                tL_messages_getScheduledHistory.hash = j12;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new al(this, i10, i11, j3, j10, i7, i13, i18, i15, i19, i20, i14, i16, j11, i17, z11, i21, z13, z14)), i13);
            } else if (!t3.p0(M0) && z12 && ((i14 == 3 || i14 == 2) && i15 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer j13 = j1(j3);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = j13;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        qp qpVar = qp.this;
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
                                    qpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                                }
                                qpVar.Z2(j3, j10, z9, i7, i10, i11, false, i12, i25, i14, dialog.top_message, 0, j11, i17, i18, dialog.unread_count, i20, z11, dialog.unread_mentions_count, false, z13, z14, null, 0L);
                                return;
                            }
                            return;
                        }
                        g0.h3(new dg(qpVar, i25, (TLObject) tL_messages_getPeerDialogs, tL_error, 12));
                    }
                });
            } else {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = j1(j3);
                if (i14 == 4) {
                    tL_messages_getHistory.add_offset = (-i7) + 5;
                } else if (i14 == 3) {
                    tL_messages_getHistory.add_offset = (-i7) / 2;
                } else if (i14 == 1) {
                    tL_messages_getHistory.add_offset = (-i7) - 1;
                } else if (i14 == 2 && i10 != 0) {
                    tL_messages_getHistory.add_offset = (-i7) + 6;
                } else if (i24 < 0 && i10 != 0 && t3.T(M0)) {
                    tL_messages_getHistory.add_offset = -1;
                    tL_messages_getHistory.limit++;
                }
                tL_messages_getHistory.limit = i7;
                tL_messages_getHistory.offset_id = i10;
                tL_messages_getHistory.offset_date = i11;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new bl(this, j3, i7, i10, i11, j10, i13, i18, i15, i19, i20, i14, i16, j11, i17, z11, i21, z13, z14, tL_messages_getHistory, 2)), i13);
            }
        } else if (i16 == 3 || t3.p0(M0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = j1(j11);
            if (t3.p0(M0)) {
                tL_messages_getSavedHistory.parent_peer = j1(j3);
            }
            if (i14 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i7) + 5;
            } else if (i14 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i7) / 2;
            } else if (i14 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i7) - 1;
            } else if (i14 == 2 && i10 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i7) + 6;
            } else if (i24 < 0 && i10 != 0 && t3.T(M0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i7;
            tL_messages_getSavedHistory.offset_id = i10;
            tL_messages_getSavedHistory.offset_date = i11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new bl(this, j3, i7, i10, i11, j10, i13, i18, i15, i19, i20, i14, i16, j11, i17, z11, i21, z13, z14, tL_messages_getSavedHistory, 0)), i13);
        } else if (z12 && z14 && i14 == 2 && i15 == 0 && (f10 = this.f24877q7.f(-j3, j11)) != null) {
            Z2(j3, j10, z9, i7, i10, i11, false, i12, i13, i14, f10.top_message, i16, j11, i17, i18, f10.unread_count, i20, z11, f10.unread_mentions_count, false, z13, z14, a00Var2, 0L);
        } else if (i16 != 0) {
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = j1(j3);
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
            } else if (i24 < 0 && i10 != 0 && t3.T(M0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i7;
            tL_messages_getReplies.offset_id = i10;
            tL_messages_getReplies.hash = j12;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new bl(this, i7, i10, i11, i18, i14, j3, j10, i13, i15, i19, i20, i16, j11, i17, z11, i21, z13, z14, tL_messages_getReplies)), i13);
        }
    }

    public final void Z3(int i7, String str) {
        if (!TextUtils.isEmpty(str) && !this.f24813j2 && getUserConfig().e() != 0) {
            if (!getUserConfig().d || !str.equals(iz.f23402g)) {
                this.f24813j2 = true;
                this.f24821k2 = SystemClock.elapsedRealtime();
                if (iz.f23416l == null) {
                    iz.f23416l = new byte[256];
                    Utilities.f21334b.nextBytes(iz.f23416l);
                    iz.y();
                }
                TL_account.registerDevice registerdevice = new TL_account.registerDevice();
                registerdevice.token_type = i7;
                registerdevice.token = str;
                registerdevice.no_muted = false;
                registerdevice.secret = iz.f23416l;
                for (int i10 = 0; i10 < 4; i10++) {
                    p10 i11 = p10.i(i10);
                    if (i10 != this.currentAccount && i11.p()) {
                        long e10 = i11.e();
                        registerdevice.other_uids.add(Long.valueOf(e10));
                        if (r2.f25212a) {
                            jg.g.s(this.currentAccount, a8.p0.t(e10, "add other uid = ", " for account "));
                        }
                    }
                }
                getConnectionsManager().sendRequest(registerdevice, new bo(this, i7, str, 0));
            }
        }
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j3, boolean z9, int i7, boolean z10, long j10, TLObject tLObject, int i10) {
        b0(arrayList, arrayList2, encryptedChat, j3, z9, i7, z10, j10, tLObject, i10, false, 0);
    }

    public final TLRPC.EncryptedChat a1(Integer num) {
        return (TLRPC.EncryptedChat) this.f24748c.get(num);
    }

    public final TLRPC.User a2(Long l10) {
        if (l10.longValue() == 0) {
            return p10.i(this.currentAccount).f();
        }
        return (TLRPC.User) this.d.get(l10);
    }

    public final void a3(TLRPC.User user, TLRPC.Chat chat, boolean z9) {
        long j3;
        if (user != null || chat != null) {
            if (user != null) {
                j3 = user.f27105id;
            } else {
                j3 = -chat.f26956id;
            }
            a0.h hVar = this.f24898t0;
            if (hVar.h(j3) < 0) {
                if (r2.f25212a) {
                    a8.b("request spam button for " + j3);
                }
                int i7 = this.f24764d7.getInt("dialog_bar_vis3" + j3, 0);
                if (!z9 && (i7 == 1 || i7 == 3)) {
                    if (r2.f25212a) {
                        a8.b("dialog bar already hidden for " + j3);
                        return;
                    }
                    return;
                }
                hVar.k(Boolean.TRUE, j3);
                TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
                if (user != null) {
                    tL_messages_getPeerSettings.peer = j1(user.f27105id);
                } else {
                    tL_messages_getPeerSettings.peer = j1(-chat.f26956id);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new pj(this, j3, 1));
            }
        }
    }

    public final void a4(ArrayList arrayList, long j3) {
        if (j3 != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            a0.h hVar = this.K7;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.InputPeer j12 = j1(((TLRPC.Dialog) arrayList.get(i7)).f26960id);
                    if (!(j12 instanceof TLRPC.TL_inputPeerChannel) || j12.access_hash != 0) {
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer.peer = j12;
                        long n10 = m5.n(j12);
                        Long l10 = (Long) hVar.f(n10);
                        if (l10 == null || System.currentTimeMillis() - l10.longValue() > 240000) {
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            hVar.k(Long.valueOf(System.currentTimeMillis()), n10);
                        }
                    }
                }
            } else {
                TLRPC.InputPeer j13 = j1(j3);
                if (!(j13 instanceof TLRPC.TL_inputPeerChannel) || j13.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer2.peer = j13;
                    long n11 = m5.n(j13);
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
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new rj(this, 0));
        }
    }

    public final void a5(long j3, boolean z9, boolean z10, boolean z11) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = h1(j3);
        tL_channels_toggleForum.enabled = z9;
        tL_channels_toggleForum.tabs = z10;
        tL_channels_toggleForum.sidebar = z11;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new rj(this, 16), 64);
        getNotificationCenter().k(qs.f25069r5, Long.valueOf(j3), Boolean.valueOf(z9), Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j3, boolean z9, int i7, boolean z10, long j10, TLObject tLObject, int i10, boolean z11, int i11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11;
        ArrayList<Integer> arrayList3;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        NativeByteBuffer nativeByteBuffer3;
        long z15;
        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages;
        boolean z16;
        NativeByteBuffer nativeByteBuffer4;
        NativeByteBuffer nativeByteBuffer5;
        long z17;
        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages;
        boolean z18;
        NativeByteBuffer nativeByteBuffer6;
        NativeByteBuffer nativeByteBuffer7;
        long z19;
        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages;
        boolean z20;
        NativeByteBuffer nativeByteBuffer8;
        NativeByteBuffer nativeByteBuffer9;
        long z21;
        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages;
        long j12;
        int i16;
        long j13;
        long j14 = j3;
        if (i7 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = 5;
        if (i7 == 5) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i7 == 9) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((arrayList != null && !arrayList.isEmpty()) || j10 != 0) {
            if (j10 == 0) {
                if (j14 != 0 && m5.z(j14)) {
                    TLRPC.Chat M0 = M0(Long.valueOf(-j14));
                    if (t3.T(M0)) {
                        j13 = M0.f26956id;
                    } else {
                        j13 = 0;
                    }
                    j12 = j13;
                } else {
                    j12 = 0;
                }
                if (!z10) {
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
                if (z12) {
                    getMessagesStorage().P0(j14, arrayList, true, false, 1, 0);
                    j14 = j3;
                    i12 = i10;
                    i13 = 5;
                } else if (z13) {
                    if (i7 == 5) {
                        kg.t1 f10 = kg.t1.f(this.currentAccount);
                        int size2 = arrayList.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            Object obj = arrayList.get(i19);
                            i19++;
                            Integer num2 = (Integer) obj;
                            num2.getClass();
                            ArrayList arrayList5 = f10.f17549c;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList5.size()) {
                                    kg.s1 s1Var = (kg.s1) arrayList5.get(i20);
                                    i16 = i17;
                                    if (s1Var.h.contains(num2)) {
                                        s1Var.h.remove(num2);
                                        if (s1Var.a() <= 0) {
                                            arrayList5.remove(s1Var);
                                        }
                                        qs.f(f10.f17547a).k(qs.F1, new Object[0]);
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
                    if (z14) {
                        j14 = j3;
                        i12 = i10;
                        getMessagesStorage().P0(j14, arrayList, true, false, 9, i12);
                    } else {
                        if (j12 == 0) {
                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                ij ijVar = (ij) this.U.get(((Integer) arrayList.get(i21)).intValue());
                                if (ijVar != null) {
                                    ijVar.Z = true;
                                }
                            }
                        } else {
                            l3(arrayList, j3);
                        }
                        i12 = i10;
                        getMessagesStorage().P0(j3, arrayList, true, z9, 0, i12);
                        j14 = j3;
                        j11 = j12;
                        getMessagesStorage().R1(j14, j11, arrayList, null);
                        qs notificationCenter = getNotificationCenter();
                        Long valueOf = Long.valueOf(j11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Boolean valueOf3 = Boolean.valueOf(z11);
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
                        notificationCenter.k(qs.f25096w, objArr);
                    }
                }
                j11 = j12;
                qs notificationCenter2 = getNotificationCenter();
                Long valueOf5 = Long.valueOf(j11);
                Boolean valueOf22 = Boolean.valueOf(z12);
                Boolean valueOf32 = Boolean.valueOf(z11);
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
                notificationCenter2.k(qs.f25096w, objArr2);
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
            if (!z10) {
                if (z12) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteScheduledMessages) {
                        tL_messages_deleteScheduledMessages = (TLRPC.TL_messages_deleteScheduledMessages) tLObject;
                        z21 = j10;
                    } else {
                        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages2 = new TLRPC.TL_messages_deleteScheduledMessages();
                        tL_messages_deleteScheduledMessages2.f27037id = arrayList3;
                        tL_messages_deleteScheduledMessages2.peer = j1(j14);
                        try {
                            nativeByteBuffer9 = new NativeByteBuffer(tL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer9.writeInt32(24);
                                nativeByteBuffer9.writeInt64(j14);
                                tL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer9);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer8 = nativeByteBuffer9;
                                z20 = true;
                                a8.g(e, z20);
                                nativeByteBuffer9 = nativeByteBuffer8;
                                z21 = getMessagesStorage().z(nativeByteBuffer9);
                                tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new pj(this, z21, i15));
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z20 = true;
                            nativeByteBuffer8 = null;
                        }
                        z21 = getMessagesStorage().z(nativeByteBuffer9);
                        tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new pj(this, z21, i15));
                } else if (z13) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteQuickReplyMessages) {
                        tL_messages_deleteQuickReplyMessages = (TLRPC.TL_messages_deleteQuickReplyMessages) tLObject;
                        z19 = j10;
                    } else {
                        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages2 = new TLRPC.TL_messages_deleteQuickReplyMessages();
                        tL_messages_deleteQuickReplyMessages2.f27036id = arrayList3;
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
                                z18 = true;
                                a8.g(e, z18);
                                nativeByteBuffer7 = nativeByteBuffer6;
                                z19 = getMessagesStorage().z(nativeByteBuffer7);
                                tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new pj(this, z19, i14));
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z18 = true;
                            nativeByteBuffer6 = null;
                        }
                        z19 = getMessagesStorage().z(nativeByteBuffer7);
                        tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new pj(this, z19, i14));
                } else if (j11 != 0) {
                    if (tLObject != null) {
                        tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                        z17 = j10;
                    } else {
                        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                        tL_channels_deleteMessages2.f26989id = arrayList3;
                        tL_channels_deleteMessages2.channel = h1(j11);
                        try {
                            nativeByteBuffer5 = new NativeByteBuffer(tL_channels_deleteMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer5.writeInt32(24);
                                nativeByteBuffer5.writeInt64(j14);
                                tL_channels_deleteMessages2.serializeToStream(nativeByteBuffer5);
                            } catch (Exception e14) {
                                e = e14;
                                nativeByteBuffer4 = nativeByteBuffer5;
                                z16 = true;
                                a8.g(e, z16);
                                nativeByteBuffer5 = nativeByteBuffer4;
                                z17 = getMessagesStorage().z(nativeByteBuffer5);
                                tL_channels_deleteMessages = tL_channels_deleteMessages2;
                                getConnectionsManager().sendRequest(tL_channels_deleteMessages, new pk(0, j11, z17, this));
                            }
                        } catch (Exception e15) {
                            e = e15;
                            z16 = true;
                            nativeByteBuffer4 = null;
                        }
                        z17 = getMessagesStorage().z(nativeByteBuffer5);
                        tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new pk(0, j11, z17, this));
                } else {
                    if (arrayList2 != null && encryptedChat != null && !arrayList2.isEmpty()) {
                        nativeByteBuffer = null;
                        getSecretChatHelper().t(encryptedChat, arrayList2, null);
                    } else {
                        nativeByteBuffer = null;
                    }
                    if (tLObject instanceof TLRPC.TL_messages_deleteMessages) {
                        tL_messages_deleteMessages = (TLRPC.TL_messages_deleteMessages) tLObject;
                        z15 = j10;
                    } else {
                        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages2 = new TLRPC.TL_messages_deleteMessages();
                        tL_messages_deleteMessages2.f27035id = arrayList3;
                        tL_messages_deleteMessages2.revoke = z9;
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
                            z15 = getMessagesStorage().z(nativeByteBuffer3);
                            tL_messages_deleteMessages = tL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteMessages, new pj(this, z15, i13));
                        }
                        z15 = getMessagesStorage().z(nativeByteBuffer3);
                        tL_messages_deleteMessages = tL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteMessages, new pj(this, z15, i13));
                }
            }
        }
    }

    public final TLRPC.EncryptedChat b1(int i7, boolean z9) {
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f24748c.get(Integer.valueOf(i7));
        if (encryptedChat != null) {
            if (z9) {
                if (!(encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) && !(encryptedChat instanceof TLRPC.TL_encryptedChatRequested)) {
                    return encryptedChat;
                }
            } else {
                return encryptedChat;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        yr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.f26719a.c(new jm(messagesStorage, i7, arrayList, countDownLatch, 15));
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

    public final TLRPC.UserFull b2(long j3) {
        return (TLRPC.UserFull) this.f24820k1.f(j3);
    }

    public final void b3(int i7) {
        SparseIntArray sparseIntArray = this.f24855o2;
        if (sparseIntArray.indexOfKey(i7) < 0) {
            SharedPreferences k10 = getUserConfig().k();
            if (!k10.getBoolean("2pinnedDialogsLoaded" + i7, false)) {
                sparseIntArray.put(i7, 1);
                TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
                tL_messages_getPinnedDialogs.folder_id = i7;
                getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new fo(this, i7, 0));
            }
        }
    }

    public final void b4(TLRPC.InputPeer inputPeer, long j3) {
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
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new oj(this, inputPeer, j10, 8));
            }
            j3 = getMessagesStorage().z(nativeByteBuffer);
        }
        long j102 = j3;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new oj(this, inputPeer, j102, 8));
    }

    public final void b5(long j3, boolean z9) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = h1(j3);
        tL_channels_togglePreHistoryHidden.enabled = z9;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new rj(this, 12), 64);
    }

    public final void c(long j3, boolean z9) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j3);
        if (dialog == null) {
            return;
        }
        if (z9) {
            this.E0.k(dialog, j3);
        } else {
            this.D0.k(dialog, j3);
            this.f24944y.remove(dialog);
            T4(null);
        }
        getNotificationCenter().k(qs.f25070s, Boolean.TRUE);
    }

    public final void c0(long j3, long j10, ArrayList arrayList) {
        getMessagesStorage().f26719a.c(new gk(this, arrayList, j10, j3));
    }

    public final String c1(long j3) {
        if (j3 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (a22 != null) {
                return g5.m(0, a22.first_name, a22.last_name);
            }
            return null;
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j3));
        if (M0 != null) {
            return M0.title;
        }
        return null;
    }

    public final void c3(boolean z9, hi.d4 d4Var) {
        if (d4Var != null) {
            this.H7 = d4Var;
        }
        if (getUserConfig().p()) {
            if (z9 || !getUserConfig().P) {
                if (z9) {
                    getUserConfig().P = false;
                    getUserConfig().v(false);
                }
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new rj(this, 18));
            }
        }
    }

    public final void c4(long j3) {
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        tL_users_getUsers.f27099id.add(o1(j3));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new rj(this, 7));
    }

    public final void c5(final long j3, final long j10, boolean z9, boolean z10, final boolean z11, final Runnable runnable, final Runnable runnable2) {
        TLRPC.InputUser tL_inputUserEmpty;
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = h1(j3);
        tL_channels_toggleJoinRequest.enabled = z9;
        tL_channels_toggleJoinRequest.apply_to_invites = z10;
        if (z11) {
            if (j10 != 0) {
                tL_inputUserEmpty = o1(j10);
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
                    final qp qpVar = qp.this;
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    final boolean z12 = z11;
                    final long j11 = j3;
                    final long j12 = j10;
                    g0.i3(new Runnable() {
                        @Override
                        public final void run() {
                            TLRPC.ChatFull N0;
                            boolean z13;
                            qp qpVar2 = qp.this;
                            if (z12 && (N0 = qpVar2.N0(j11)) != null) {
                                int i7 = N0.flags2;
                                long j13 = j12;
                                if (j13 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                N0.flags2 = c8.zc.b(i7, 8388608, z13);
                                N0.guard_bot_id = j13;
                                qpVar2.getMessagesStorage().N1(N0, false);
                                qs notificationCenter = qpVar2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(qs.T, N0, 0, bool, bool);
                            }
                            qpVar2.getNotificationCenter().k(qs.f25063r, 8192);
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

    public final int d(int i7, int i10, long j3) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j3));
        return e(arrayList, i7, i10, null, 0L);
    }

    public final void d0(long j3, long j10, int i7, int i10, boolean z9, org.telegram.ui.xf xfVar) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = j1(j3);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i7;
        tL_messages_deleteHistory.max_date = i10;
        tL_messages_deleteHistory.revoke = z9;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new on(this, j3, i7, i10, j10, z9, xfVar));
    }

    public final s10 d2() {
        if (this.S2 == null) {
            this.S2 = new s10(this.currentAccount);
        }
        return this.S2;
    }

    public final void d3() {
        if (this.T0) {
            return;
        }
        this.T0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new rj(this, 26));
    }

    public final void d4(long j3, HashMap hashMap, int i7) {
        boolean z9;
        HashMap hashMap2;
        a0.h hVar;
        boolean z10 = false;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 3) {
            z10 = true;
        }
        if (z9) {
            hashMap2 = this.F1;
            hVar = this.G1;
        } else if (z10) {
            hashMap2 = this.H1;
            hVar = this.I1;
        } else {
            hashMap2 = this.D1;
            hVar = this.E1;
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
            getConnectionsManager().sendRequest(getwebpagepreview, new org.telegram.messenger.voip.x(this, hashMap3, str, hVar2, j3, i7));
        }
    }

    public final void d5(long j3, int i7, boolean z9, fi.m9 m9Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = j1(j3);
        tL_messages_toggleNoForwards.enabled = z9;
        if (i7 > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i7;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new ml(this, m9Var, 1), 64);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.InputFile inputFile;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        qp qpVar = this;
        int i11 = qs.U1;
        HashMap hashMap = qpVar.P2;
        TLRPC.BaseTheme baseTheme = null;
        if (i7 == i11) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = qpVar.N2;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                qpVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new rj(qpVar, 19));
            } else {
                String str3 = qpVar.Q2;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    org.telegram.ui.ActionBar.c6 c6Var = qpVar.R2;
                    String str4 = qpVar.Q2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = c6Var.f27408i;
                    tL_wallPaperSettings.motion = c6Var.f27409j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    org.telegram.ui.ActionBar.c6 c6Var2 = qpVar.R2;
                    c6Var2.f27417r = 1.0f;
                    c6Var2.f27418s = new ArrayList();
                    qpVar.R2.f27418s.add(Integer.valueOf(qpVar.getConnectionsManager().sendRequest(uploadwallpaper, new q6(qpVar, c6Var, tL_wallPaperSettings, str4, 3))));
                } else {
                    Object obj = hashMap.get(str);
                    if (obj instanceof org.telegram.ui.ActionBar.j6) {
                        j6Var = (org.telegram.ui.ActionBar.j6) obj;
                        if (str.equals(j6Var.H)) {
                            j6Var.J = inputFile3;
                            j6Var.H = null;
                        } else if (str.equals(j6Var.I)) {
                            j6Var.K = inputFile3;
                            j6Var.I = null;
                        }
                        inputFile = j6Var.J;
                        inputFile2 = j6Var.K;
                        h6Var = null;
                    } else if (obj instanceof org.telegram.ui.ActionBar.h6) {
                        org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                        if (str.equals(h6Var2.f27537u)) {
                            h6Var2.f27538w = inputFile3;
                            h6Var2.f27537u = null;
                        } else if (str.equals(h6Var2.v)) {
                            h6Var2.f27539x = inputFile3;
                            h6Var2.v = null;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var2 = h6Var2.f27520b;
                        TLRPC.InputFile inputFile4 = h6Var2.f27538w;
                        inputFile2 = h6Var2.f27539x;
                        h6Var = h6Var2;
                        j6Var = j6Var2;
                        inputFile = inputFile4;
                    } else {
                        j6Var = null;
                        inputFile = null;
                        h6Var = null;
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
                        if (h6Var != null) {
                            h6Var.f27539x = null;
                            h6Var.f27538w = null;
                            tL_theme = h6Var.f27534r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str5 = j6Var.f27629a;
                            int i12 = org.telegram.ui.ActionBar.k6.f27788a;
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
                            tL_inputThemeSettings2.accent_color = h6Var.f27521c;
                            int i13 = h6Var.d;
                            if (i13 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i13;
                            }
                            int i14 = h6Var.f27522e;
                            if (i14 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i14));
                                tL_inputThemeSettings2.flags |= 1;
                                int i15 = h6Var.f27523f;
                                if (i15 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i15));
                                    int i16 = h6Var.f27524g;
                                    if (i16 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i16));
                                        int i17 = h6Var.h;
                                        if (i17 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i17));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = h6Var.f27525i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(h6Var.f27531o)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = h6Var.f27531o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (h6Var.f27532p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.f27029id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = h6Var.f27533q;
                            long j3 = h6Var.f27526j;
                            if (j3 != 0) {
                                wallPaperSettings2.background_color = (int) j3;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j10 = h6Var.f27527k;
                            if (j10 != 0) {
                                wallPaperSettings2.second_background_color = (int) j10;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = g0.s1(h6Var.f27530n, true);
                            }
                            long j11 = h6Var.f27528l;
                            if (j11 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j11;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j12 = h6Var.f27529m;
                            if (j12 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j12;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            j6Var.K = null;
                            j6Var.J = null;
                            tL_theme = j6Var.F;
                            tL_inputThemeSettings = null;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                        qpVar = this;
                        getConnectionsManager().sendRequest(uploadtheme, new eo(qpVar, tL_theme, j6Var3, tL_inputThemeSettings, h6Var, 0));
                    }
                }
                qpVar = this;
            }
        } else if (i7 == qs.V1) {
            String str6 = (String) objArr[0];
            String str7 = qpVar.N2;
            if (str7 != null && str7.equals(str6)) {
                qpVar.N2 = null;
            } else {
                String str8 = qpVar.Q2;
                if (str8 != null && str8.equals(str6)) {
                    qpVar.Q2 = null;
                    qpVar.R2 = null;
                } else {
                    Object remove = hashMap.remove(str6);
                    boolean z9 = remove instanceof org.telegram.ui.ActionBar.j6;
                    int i18 = qs.N2;
                    if (z9) {
                        org.telegram.ui.ActionBar.j6 j6Var4 = (org.telegram.ui.ActionBar.j6) remove;
                        j6Var4.K = null;
                        j6Var4.J = null;
                        qpVar.getNotificationCenter().k(i18, j6Var4, 0);
                    } else if (remove instanceof org.telegram.ui.ActionBar.h6) {
                        org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) remove;
                        h6Var3.f27537u = null;
                        qpVar.getNotificationCenter().k(i18, h6Var3.f27520b, h6Var3);
                    }
                }
            }
        }
        if (i7 == qs.W1) {
            String str9 = (String) objArr[0];
            String str10 = qpVar.Q2;
            if (str10 != null && str10.equals(str9)) {
                qpVar.R2.f27417r = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        int i19 = qs.K;
        SparseArray sparseArray = qpVar.U;
        if (i7 == i19) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l10 = (Long) objArr[3];
                ArrayList arrayList = (ArrayList) qpVar.R.f(l10.longValue());
                for (int i20 = 0; arrayList != null && i20 < arrayList.size(); i20++) {
                    ij ijVar2 = (ij) arrayList.get(i20);
                    if (ijVar2 != null && (ijVar2.f1() == num.intValue() || ijVar2.f23262k.local_id == num.intValue())) {
                        ijVar2.f23262k.f26977id = num2.intValue();
                        ijVar2.f23262k.send_state = 0;
                    }
                    ij ijVar3 = (ij) sparseArray.get(num.intValue());
                    if (ijVar3 != null) {
                        sparseArray.remove(num.intValue());
                        sparseArray.put(num2.intValue(), ijVar3);
                    }
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) qpVar.Q.f(l10.longValue());
                if (dialog != null && dialog.top_message == num.intValue()) {
                    dialog.top_message = num2.intValue();
                    qpVar.getNotificationCenter().k(qs.f25070s, new Object[0]);
                }
                if (m5.z(l10.longValue())) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) qpVar.l1.f(-l10.longValue());
                    TLRPC.Chat M0 = qpVar.M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null && !t3.N(M0) && !ij.g3(num2.intValue()) && chatFull != null && chatFull.slowmode_seconds != 0) {
                        chatFull.slowmode_next_send_date = qpVar.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                        chatFull.flags |= 262144;
                        qpVar.getMessagesStorage().N1(chatFull, false);
                    }
                }
            }
        } else if (i7 == qs.f25031l0) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id == 0 && (ijVar = (ij) sparseArray.get(message.f26977id)) != null) {
                ijVar.f23262k.media = ij.o1(message);
                if (ij.o1(message).ttl_seconds != 0) {
                    if ((ij.o1(message).photo instanceof TLRPC.TL_photoEmpty) || (ij.o1(message).document instanceof TLRPC.TL_documentEmpty)) {
                        ijVar.M5();
                        qpVar.getNotificationCenter().k(qs.f24996f0, new Object[0]);
                    }
                }
            }
        } else if (i7 == qs.f25001f5) {
            qpVar.R2(false);
            qpVar.getContactsController().J(true);
            if ((qpVar.f24867p6 && !qpVar.getUserConfig().q()) || qpVar.getUserConfig().q()) {
                qpVar.getNotificationCenter().k(qs.f25038m3, new Object[0]);
            }
        }
    }

    public final int e(java.util.ArrayList r23, int r24, int r25, java.util.ArrayList r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.e(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public final void e0(final long j3, TLRPC.InputPeer inputPeer, boolean z9, final org.telegram.ui.qa qaVar) {
        final boolean z10;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat M0 = M0(Long.valueOf(j3));
        if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && t10.B(getMessagesController().a2(Long.valueOf(inputPeer.user_id)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean T = t3.T(M0);
        if (T) {
            if (z10) {
                boolean z11 = M0.creator;
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
            tL_messages_deleteChatUser2.chat_id = j3;
            tL_messages_deleteChatUser2.user_id = p1(inputPeer);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        }
        if (z10) {
            X(0, -j3, z9);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    qp qpVar = qp.this;
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    if (T && !z10) {
                        g0.i3(new mk(qpVar, j3, 21), 1000L);
                    }
                    Runnable runnable = qaVar;
                    if (runnable != null) {
                        g0.h3(runnable);
                    }
                }
            }
        }, 64);
    }

    public final TLObject e2(long j3) {
        Long valueOf = Long.valueOf(j3);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(valueOf)) {
            return (TLObject) concurrentHashMap.get(Long.valueOf(j3));
        }
        long j10 = -j3;
        Long valueOf2 = Long.valueOf(j10);
        ConcurrentHashMap concurrentHashMap2 = this.f24738b;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            return (TLObject) concurrentHashMap2.get(Long.valueOf(j10));
        }
        return null;
    }

    public final void e3(TLRPC.Chat chat, long j3) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j10 = chat.f26956id;
            a0.h hVar = this.f24740b1;
            if (hVar.h(j10) < 0) {
                int i7 = (chat.access_hash > 0L ? 1 : (chat.access_hash == 0L ? 0 : -1));
                if (i7 == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.f26956id;
                    tL_inputPeerChannel.peer = j1(chat.fromMessageDialogId);
                    tL_inputPeerChannel.msg_id = chat.fromMessageId;
                } else if (i7 == 0) {
                    if (j3 != 0) {
                        getMessagesStorage().q1(j3);
                        return;
                    }
                    return;
                } else {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChannel.channel_id = chat.f26956id;
                    tL_inputPeerChannel.access_hash = chat.access_hash;
                }
                hVar.k(Boolean.TRUE, chat.f26956id);
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
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new oj(this, j3, chat, 2));
                    }
                    j3 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new oj(this, j3, chat, 2));
            }
        }
    }

    public final void e4(ArrayList arrayList, long j3) {
        int i7 = 0;
        int i10 = this.T.get(j3, 0);
        if (i10 != 0) {
            int size = arrayList.size();
            while (i7 < size) {
                if (((TLRPC.Message) arrayList.get(i7)).f26977id <= i10) {
                    arrayList.remove(i7);
                    i7--;
                    size--;
                }
                i7++;
            }
        }
    }

    public final void e5(long j3, boolean z9) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = h1(j3);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z9;
        TLRPC.Chat M0 = M0(Long.valueOf(j3));
        if (M0 != null) {
            M0.collapsed_in_dialogs = z9;
            Q3(M0, true);
            T4(null);
            getNotificationCenter().k(qs.T5, Long.valueOf(j3), Boolean.valueOf(z9));
            getNotificationCenter().k(qs.f25070s, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new d3.b(1), new jh.b(2));
    }

    public final void f(int i7, TLRPC.Dialog dialog) {
        int i10;
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            i10 = 0;
        } else {
            i10 = dialog.folder_id;
        }
        SparseArray sparseArray = this.f24924w;
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

    public final TLObject f2(String str) {
        if (str != null && str.length() != 0) {
            return (TLObject) this.f24766e.get(str.toLowerCase());
        }
        return null;
    }

    public final void f3(TLRPC.InputPeer inputPeer, long j3) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long n10 = m5.n(inputPeer);
            a0.h hVar = this.f24750c1;
            if (hVar.h(n10) >= 0) {
                return;
            }
            hVar.k(Boolean.TRUE, n10);
            if (r2.f25212a) {
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
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new pk(1, j3, n10, this));
                }
                j3 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new pk(1, j3, n10, this));
        }
    }

    public final void f4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j3 = dialog.f26960id;
        if (this.E.remove(dialog) && m5.y(dialog)) {
            Utilities.d.c(new mk(this, j3, 8));
        }
        this.f24944y.remove(dialog);
        this.G.remove(dialog);
        this.H.remove(dialog);
        this.F.remove(dialog);
        this.I.remove(dialog);
        this.L.remove(dialog);
        this.J.remove(dialog);
        this.K.remove(dialog);
        this.D.remove(dialog);
        int i7 = 0;
        while (true) {
            vo[] voVarArr = this.M;
            if (i7 >= voVarArr.length) {
                break;
            }
            vo voVar = voVarArr[i7];
            if (voVar != null) {
                voVar.f26078k.remove(dialog);
                this.M[i7].f26079l.remove(dialog);
            }
            i7++;
        }
        this.Q.l(j3);
        ArrayList arrayList = (ArrayList) this.f24924w.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
        g4(dialog);
    }

    public final void f5(Runnable runnable, long j3) {
        TLRPC.Chat M0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j3 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (a22 != null) {
                user = a22;
                M0 = null;
            } else {
                return;
            }
        } else {
            M0 = M0(Long.valueOf(-j3));
            if (M0 == null) {
                return;
            }
        }
        this.H0--;
        this.G0.delete(j3);
        if (user != null) {
            tL_contacts_unblock.f27004id = n1(user);
        } else {
            tL_contacts_unblock.f27004id = l1(M0);
        }
        getNotificationCenter().k(qs.f25002g0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new s1(runnable, 3));
    }

    public final void g(vo voVar, boolean z9) {
        if (z9) {
            int size = this.P0.size();
            int i7 = 254;
            for (int i10 = 0; i10 < size; i10++) {
                i7 = Math.min(i7, ((vo) this.P0.get(i10)).f26074f);
            }
            voVar.f26074f = i7 - 1;
            if (((vo) this.P0.get(0)).e()) {
                this.P0.add(1, voVar);
            } else {
                this.P0.add(0, voVar);
            }
        } else {
            int size2 = this.P0.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                i11 = Math.max(i11, ((vo) this.P0.get(i12)).f26074f);
            }
            voVar.f26074f = i11 + 1;
            this.P0.add(voVar);
        }
        this.S0.put(voVar.f26070a, voVar);
        if (this.P0.size() == 1 && iz.m(this.currentAccount) != 5) {
            iz.f23433r1 = 5;
            t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", iz.f23433r1).apply();
        }
        i3();
    }

    public final void g0(long j3, TLRPC.User user, TLRPC.Chat chat, boolean z9, boolean z10) {
        TLRPC.InputPeer l1;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user == null && chat == null) {
            return;
        }
        if (user != null) {
            l1 = n1(user);
        } else {
            l1 = l1(chat);
        }
        TLRPC.Chat M0 = M0(Long.valueOf(j3));
        boolean T = t3.T(M0);
        if (T) {
            if (t10.B(user)) {
                if (M0.creator && z9) {
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
                    tL_communities_toggleParticipantBanned.participant = l1;
                    tL_communities_toggleParticipantBanned.community = i1(M0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = i1(M0);
                    tL_channels_editBanned.participant = l1;
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
        } else if (z9) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j3;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new di.u5(13));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j3;
            tL_messages_deleteChatUser3.user_id = q1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (t10.B(user)) {
            X(0, -j3, z10);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new el(this, T, user, j3), 64);
    }

    public final r3 g1(long j3, boolean z9, m80 m80Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull N0 = N0(j3);
        if (N0 != null && (inputGroupCall = N0.call) != null) {
            r3 r3Var = (r3) this.f24836m1.f(inputGroupCall.f26973id);
            if (r3Var == null && z9) {
                Long valueOf = Long.valueOf(j3);
                HashSet hashSet = this.f24899t1;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(j3));
                    if (N0.call != null) {
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        getgroupcall.call = N0.call;
                        getgroupcall.limit = 20;
                        getConnectionsManager().sendRequest(getgroupcall, new oj(this, j3, m80Var, 5));
                    }
                }
            }
            if (r3Var == null || !(r3Var.f25222b instanceof TLRPC.TL_groupCallDiscarded)) {
                return r3Var;
            }
            return null;
        }
        return null;
    }

    public final void g3(TLRPC.User user, boolean z9, int i7) {
        yr messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.f26719a.c(new nb(i7, 3, messagesStorage, user, z9));
        }
    }

    public final void g4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j3 = dialog.f26960id;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        a0.h hVar = this.f24934x;
        if (i7 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (a22 != null) {
                long j10 = a22.linked_community_id;
                if (j10 != 0 && (arrayList2 = (ArrayList) hVar.f(j10)) != null) {
                    arrayList2.remove(dialog);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j3));
        if (M0 != null) {
            long j11 = M0.linked_community_id;
            if (j11 != 0 && (arrayList = (ArrayList) hVar.f(j11)) != null) {
                arrayList.remove(dialog);
            }
        }
    }

    public final void g5(long j3, TLRPC.EmojiStatus emojiStatus, TL_stars.StarGift starGift) {
        boolean z9;
        TLRPC.EmojiStatus emojiStatus2;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        if (j3 != 0 && j3 != getUserConfig().e()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && (starGift instanceof TL_stars.TL_starGiftUnique)) {
            emojiStatus2 = q0((TL_stars.TL_starGiftUnique) starGift);
        } else {
            emojiStatus2 = emojiStatus;
        }
        if (z9) {
            TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
            updateemojistatus.emoji_status = emojiStatus;
            TLRPC.User f10 = getUserConfig().f();
            tL_channels_updateEmojiStatus = updateemojistatus;
            if (f10 != null) {
                f10.emoji_status = emojiStatus2;
                getNotificationCenter().k(qs.f25040m5, f10);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j10 = -j3;
            tL_channels_updateEmojiStatus2.channel = h1(j10);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat M0 = M0(Long.valueOf(j10));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (M0 != null) {
                M0.flags |= 512;
                M0.emoji_status = emojiStatus2;
                Q3(M0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().j5(j3, emojiStatus2);
        getNotificationCenter().k(qs.f25063r, 524288);
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public final void h(ij ijVar, TLRPC.SuggestedPost suggestedPost) {
        ij ijVar2 = ijVar;
        if (ijVar2 != null && ijVar2.f23262k != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(ijVar2);
            gz sendMessagesHelper = getSendMessagesHelper();
            long B0 = ij.B0(ijVar2.f23262k);
            boolean z9 = !ij.m3(ijVar2.f23262k);
            TLRPC.Message message = ijVar2.f23262k;
            if (message.suggested_post == null) {
                ijVar2 = null;
            }
            sendMessagesHelper.q0(arrayList, B0, z9, false, true, 0, 0, ijVar2, -1, 0L, m5.o(message.saved_peer_id), nj.b(suggestedPost));
        }
    }

    public final void h0(long j3, int i7, long j10) {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new yq(messagesStorage, i7, j3, j10, 1));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = j1(j3);
        tL_messages_deleteParticipantReaction.participant = j1(j10);
        tL_messages_deleteParticipantReaction.msg_id = i7;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new d3.b(1), new fl(this, 2));
    }

    public final TLRPC.InputChannel h1(long j3) {
        return i1(M0(Long.valueOf(j3)));
    }

    public final void h3() {
        g0.r(this.f24943x8);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
        qo qoVar = this.f24962z8;
        if (tL_webBrowserSettings == null) {
            qoVar.e(this.currentAccount, null, new fl(this, 0));
        }
        qoVar.d(this.currentAccount, null);
        qoVar.c(this.currentAccount, null, new go(this, 2));
    }

    public final void h4(vo voVar) {
        this.P0.remove(voVar);
        this.S0.remove(voVar.f26070a);
        getNotificationCenter().k(qs.O2, new Object[0]);
    }

    public final void h5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        g5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final void i(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            g0.h3(new sj(this, chat, 0));
        } else {
            j(chat);
        }
    }

    public final void i0(long j3, int i7, TLRPC.InputPeer inputPeer) {
        long n10 = m5.n(inputPeer);
        int[] iArr = {i7};
        bi.ra raVar = new bi.ra(this, n10, j3, inputPeer, i7, iArr);
        if (iArr[0] <= 0 && n10 == 0) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new a4(messagesStorage, j3, new en(iArr, raVar), 29));
            return;
        }
        raVar.run();
    }

    public final void i2(long j3, TLRPC.User user, TLRPC.Chat chat) {
        if (user != null || chat != null) {
            SharedPreferences.Editor edit = this.f24764d7.edit();
            edit.putInt("dialog_bar_vis3" + j3, 3);
            edit.remove("dialog_bar_invite" + j3);
            edit.commit();
            if (!m5.C(j3)) {
                TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
                if (user != null) {
                    tL_messages_hidePeerSettingsBar.peer = j1(user.f27105id);
                } else {
                    tL_messages_hidePeerSettingsBar.peer = j1(-chat.f26956id);
                }
                getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new di.u5(13));
            }
        }
    }

    public final void i3() {
        boolean z9;
        if (!getUserConfig().q() && this.P0.size() - 1 > this.L4) {
            int size = (this.P0.size() - 1) - this.L4;
            ArrayList arrayList = new ArrayList(this.P0);
            Collections.reverse(arrayList);
            z9 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (i7 < size) {
                    if (!((vo) arrayList.get(i7)).f26083p) {
                        z9 = true;
                    }
                    ((vo) arrayList.get(i7)).f26083p = true;
                } else {
                    if (((vo) arrayList.get(i7)).f26083p) {
                        z9 = true;
                    }
                    ((vo) arrayList.get(i7)).f26083p = false;
                }
            }
        } else {
            z9 = false;
        }
        if (z9) {
            getNotificationCenter().k(qs.O2, new Object[0]);
        }
    }

    public final void i4(int i7) {
        long j3 = 2305843009213693952L | i7;
        a0.h hVar = this.Q;
        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j3);
        if (dialog == null) {
            return;
        }
        hVar.l(j3);
        this.f24944y.remove(dialog);
        T4(null);
        getNotificationCenter().k(qs.f25070s, new Object[0]);
        getNotificationCenter().k(qs.f24985d0, Integer.valueOf(i7));
    }

    public final void i5() {
        int intValue;
        long longValue;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        ConcurrentHashMap concurrentHashMap = this.f24868p7;
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
            if (j3 + longValue2 != this.f24851n7 + this.f24842m7) {
                g0.r(this.f24859o7);
                this.f24851n7 = j3;
                this.f24842m7 = longValue2;
                vj vjVar = new vj(this, 5);
                this.f24859o7 = vjVar;
                g0.i3(vjVar, longValue2 * 1000);
                return;
            }
            return;
        }
        vj vjVar2 = this.f24859o7;
        if (vjVar2 != null) {
            this.f24851n7 = -1L;
            this.f24842m7 = -1L;
            g0.r(vjVar2);
        }
    }

    public final void j(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.f26956id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z9 = chat.call_active;
        int i7 = qs.A2;
        if (z9 && chat.call_not_empty && chat.migrated_to == null && !t3.r0(chat)) {
            if (chat2 == null) {
                hashMap.put(Long.valueOf(chat.f26956id), chat);
                getNotificationCenter().k(i7, new Object[0]);
            }
        } else if (chat2 == null) {
        } else {
            hashMap.remove(Long.valueOf(chat.f26956id));
            getNotificationCenter().k(i7, new Object[0]);
        }
    }

    public final void j0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        long j3;
        if (user != null) {
            j3 = user.f27105id;
        } else if (chat2 != null) {
            j3 = chat2.f26956id;
        } else {
            j3 = 0;
        }
        W(-chat.f26956id, j3);
    }

    public final TLRPC.InputPeer j1(long j3) {
        if (j3 == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j3 < 0) {
            long j10 = -j3;
            TLRPC.Chat M0 = M0(Long.valueOf(j10));
            if (t3.T(M0)) {
                if (M0 != null && M0.access_hash == 0) {
                    long j11 = M0.fromMessageDialogId;
                    if (j11 != 0 && j11 != j3 && M0.fromMessageId != 0) {
                        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                        tL_inputPeerChannelFromMessage.channel_id = j10;
                        tL_inputPeerChannelFromMessage.peer = j1(M0.fromMessageDialogId);
                        tL_inputPeerChannelFromMessage.msg_id = M0.fromMessageId;
                        return tL_inputPeerChannelFromMessage;
                    }
                }
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChannel.channel_id = j10;
                tL_inputPeerChannel.access_hash = M0.access_hash;
                return tL_inputPeerChannel;
            }
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j10;
            return tL_inputPeerChat;
        }
        TLRPC.User a22 = a2(Long.valueOf(j3));
        if (a22 != null && a22.access_hash == 0) {
            long j12 = a22.fromMessageDialogId;
            if (j12 != 0 && j12 != j3 && a22.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = j3;
                tL_inputPeerUserFromMessage.peer = j1(a22.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = a22.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = j3;
        if (a22 != null) {
            tL_inputPeerUser.access_hash = a22.access_hash;
        }
        return tL_inputPeerUser;
    }

    public final void j2() {
        if (this.f24937x2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = j1(this.f24937x2.f26960id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new di.u5(13));
        Utilities.d.c(new vj(this, 20));
        j4();
    }

    public final void j3(final long r18, final int r20, int r21, final int r22, boolean r23, final long r24, int r26, final boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.j3(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public final void j4() {
        TLRPC.Dialog dialog = this.f24937x2;
        if (dialog == null) {
            return;
        }
        long j3 = dialog.f26960id;
        if (j3 < 0) {
            TLRPC.Chat M0 = M0(Long.valueOf(-j3));
            if (t3.r0(M0) || M0.restricted) {
                f4(this.f24937x2);
            }
        } else {
            f4(dialog);
        }
        this.f24937x2 = null;
        T4(null);
        getNotificationCenter().k(qs.f25070s, new Object[0]);
    }

    public final void j5(long j3, TLRPC.EmojiStatus emojiStatus) {
        int g10 = m5.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f24868p7;
        if (g10 != 0) {
            concurrentHashMap.put(Long.valueOf(j3), Integer.valueOf(g10));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j3))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j3));
        }
        i5();
    }

    public final void k() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.f27105id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        X3(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.f27105id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        X3(tL_userForeign_old22, true, false);
    }

    public final void k0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i7) {
        long j3;
        TLRPC.InputPeer l1;
        if (user != null) {
            j3 = user.f27105id;
        } else if (chat2 != null) {
            j3 = chat2.f26956id;
        } else {
            j3 = 0;
        }
        long j10 = j3;
        if (i7 == 0) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new vp(3, -chat.f26956id, j10, messagesStorage));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = i1(chat);
        if (user != null) {
            l1 = n1(user);
        } else {
            l1 = l1(chat2);
        }
        tL_channels_deleteParticipantHistory.participant = l1;
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new q6(this, chat, user, chat2, 2));
    }

    public final void k2(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        TLRPC.TL_theme tL_theme;
        String str;
        boolean z10;
        boolean z11;
        if (h6Var != null) {
            tL_theme = h6Var.f27534r;
        } else {
            tL_theme = j6Var.F;
        }
        if (h6Var != null) {
            str = h6Var.f27531o;
        } else {
            str = j6Var.f27636e;
        }
        if (h6Var == null && j6Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (h6Var != null) {
            z11 = h6Var.f27533q;
        } else {
            z11 = j6Var.f27644n;
        }
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z9;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27027id = tL_theme.f27095id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new di.u5(13));
        if (!TextUtils.isEmpty(str)) {
            TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = str;
            installwallpaper.wallpaper = tL_inputWallPaperSlug;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            installwallpaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.blur = z10;
            tL_wallPaperSettings.motion = z11;
            getConnectionsManager().sendRequest(installwallpaper, new di.u5(13));
        }
    }

    public final void k3(long j3, TLRPC.InputPeer inputPeer, long j10) {
        long j11;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        qp qpVar;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j3);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                qpVar = this;
                j11 = j3;
                qpVar.r2(j11, 0L, null);
            } else {
                qpVar = this;
                j11 = j3;
            }
            getNotificationCenter().k(qs.f25063r, 256);
            getMessagesStorage().F1(j11, true);
            int i7 = 0;
            while (true) {
                vo[] voVarArr = qpVar.M;
                if (i7 < voVarArr.length) {
                    vo voVar = voVarArr[i7];
                    if (voVar != null && (voVar.f26075g & 64) != 0) {
                        T4(null);
                        getNotificationCenter().k(qs.f25070s, new Object[0]);
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
        } else {
            j11 = j3;
        }
        if (!m5.C(j11)) {
            TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
            tL_messages_markDialogUnread.unread = true;
            if (inputPeer == null) {
                inputPeer = j1(j11);
            }
            if (!(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = inputPeer;
                tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
                if (j10 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
                    } catch (Exception e10) {
                        exc = e10;
                    }
                    try {
                        nativeByteBuffer.writeInt32(9);
                        nativeByteBuffer.writeInt64(j11);
                        inputPeer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e11) {
                        exc = e11;
                        nativeByteBuffer2 = nativeByteBuffer;
                        a8.g(exc, true);
                        nativeByteBuffer = nativeByteBuffer2;
                        j10 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new pj(this, j10, 10));
                    }
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new pj(this, j10, 10));
            }
        }
    }

    public final void k4(long j3, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 == 0) {
                TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.U3;
                int i10 = qs.f25072s1;
                if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                    this.U3 = null;
                    getNotificationCenter().k(i10, new Object[0]);
                } else if (!this.S3.remove(str) && this.T3.contains(str)) {
                    return;
                } else {
                    this.T3.add(str);
                    SharedPreferences.Editor edit = this.f24774e7.edit();
                    edit.putStringSet("pendingSuggestions", this.S3);
                    edit.putStringSet("dismissedSuggestions", this.T3);
                    edit.commit();
                    getNotificationCenter().k(i10, new Object[0]);
                }
            }
            TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
            tL_help_dismissSuggestion.suggestion = str;
            if (i7 == 0) {
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_help_dismissSuggestion.peer = j1(j3);
            }
            getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new di.u5(13));
        }
    }

    public final void k5(vo voVar) {
        TLRPC.EncryptedChat a12;
        TLRPC.Chat M0;
        ArrayList arrayList = this.f24944y;
        if (voVar != null) {
            ArrayList arrayList2 = voVar.f26078k;
            ArrayList arrayList3 = voVar.f26079l;
            arrayList2.clear();
            arrayList3.clear();
            this.C7 = voVar;
            try {
                Collections.sort(arrayList, this.D7);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
                boolean z9 = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z9) {
                    long j3 = dialog.f26960id;
                    if (!z9 || (M0 = M0(Long.valueOf(-j3))) == null || M0.collapsed_in_dialogs) {
                        if (m5.C(j3) && (a12 = a1(Integer.valueOf((int) (4294967295L & j3)))) != null) {
                            j3 = a12.user_id;
                        }
                        if (voVar.c(getAccountInstance(), j3, dialog)) {
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

    public final void l(ArrayList arrayList, long j3) {
        int i7;
        a0.h hVar = this.K0;
        SparseArray sparseArray = (SparseArray) hVar.f(j3);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, j3);
            this.L0++;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ij) sparseArray.valueAt(i10)).f23296t0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i11 = Integer.MAX_VALUE;
        boolean z9 = false;
        for (int i12 = 0; i12 < size2; i12++) {
            ij ijVar = (ij) arrayList.get(i12);
            if (ijVar.D == 17) {
                TLRPC.MessageMedia messageMedia = ijVar.f23262k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i7 = poll.close_date) != 0) {
                        if (i7 <= currentTime) {
                            z9 = true;
                        } else {
                            i11 = Math.min(i11, i7 - currentTime);
                        }
                    }
                    int f12 = ijVar.f1();
                    ij ijVar2 = (ij) sparseArray.get(f12);
                    if (ijVar2 != null) {
                        ijVar2.f23296t0 = true;
                    } else {
                        sparseArray.put(f12, ijVar);
                    }
                }
            }
        }
        if (z9) {
            this.M0 = 0L;
        } else if (i11 < 5) {
            this.M0 = Math.min(this.M0, System.currentTimeMillis() - ((5 - i11) * 1000));
        }
    }

    public final void l0(TLRPC.TL_inputPhoto tL_inputPhoto) {
        TLRPC.Photo photo;
        long e10 = getUserConfig().e();
        if (tL_inputPhoto == null) {
            yo U0 = U0(e10);
            ArrayList arrayList = U0.f26704b;
            if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
                U0.e(photo.f26980id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.f27090id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User a22 = a2(Long.valueOf(getUserConfig().e()));
            if (a22 == null) {
                a22 = getUserConfig().f();
            }
            if (a22 == null) {
                return;
            }
            if (a22.photo != null) {
                yr messagesStorage = getMessagesStorage();
                messagesStorage.f26719a.c(new vp(4, a22.f27105id, a22.photo.photo_id, messagesStorage));
            }
            getNotificationCenter().k(qs.f25020j0, new Object[0]);
            getNotificationCenter().k(qs.f25063r, Integer.valueOf(C8));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new pj(this, e10, 9));
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.f27089id.add(tL_inputPhoto);
        U0(e10).e(tL_inputPhoto.f26975id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public final void l2(int i7) {
        this.f24749c0.remove(i7);
        getNotificationCenter().k(qs.f25123z5, Integer.valueOf(i7));
    }

    public final void l3(ArrayList arrayList, long j3) {
        ArrayList arrayList2 = (ArrayList) this.R.f(j3);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ij ijVar = (ij) arrayList2.get(i7);
                if (ijVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (ijVar.f1() == ((Integer) arrayList.get(i10)).intValue()) {
                            ijVar.Z = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public final void l4(ch.o0 r40, java.lang.String r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.l4(ch.o0, java.lang.String):void");
    }

    public final boolean l5(int i7, long j3, ArrayList arrayList) {
        boolean z9;
        Object[] objArr;
        Object[] objArr2;
        boolean z10;
        long j10;
        ij ijVar;
        boolean z11;
        qp qpVar;
        boolean z12;
        TLRPC.TL_dialog tL_dialog;
        int i10;
        boolean z13;
        boolean z14;
        TLRPC.Chat M0;
        kg.s1 s1Var;
        boolean z15;
        ij ijVar2;
        boolean z16;
        TLRPC.ChatFull N0;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Message message;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 5) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (i7 == 9) {
            objArr2 = 1;
        } else {
            objArr2 = null;
        }
        boolean C = m5.C(j3);
        if (!z9 && objArr == null && objArr2 == null) {
            if (!k5.w("dialog_bar_replied", j3, this.f24764d7, false)) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    ij ijVar3 = (ij) arrayList.get(i11);
                    if (ijVar3 != null && !ijVar3.f23281p1 && (message = ijVar3.f23262k) != null && message.out && !(message instanceof TLRPC.TL_messageService) && message.peer_id != null && ij.B0(message) == j3) {
                        m3(j3);
                        break;
                    }
                    i11++;
                }
            }
            int i12 = 0;
            boolean z17 = false;
            z11 = false;
            long j11 = 0;
            ij ijVar4 = null;
            while (i12 < arrayList.size()) {
                ij ijVar5 = (ij) arrayList.get(i12);
                if (ijVar4 != null && ((C || ijVar5.f1() <= ijVar4.f1()) && (((!C && (ijVar5.f1() >= 0 || ijVar4.f1() >= 0)) || ijVar5.f1() >= ijVar4.f1()) && ijVar5.f23262k.date <= ijVar4.f23262k.date))) {
                    z15 = z9;
                } else {
                    z15 = z9;
                    long j12 = ijVar5.f23262k.peer_id.channel_id;
                    if (j12 != 0) {
                        j11 = j12;
                    }
                    ijVar4 = ijVar5;
                }
                TLRPC.Message message2 = ijVar5.f23262k;
                if ((message2.action instanceof TLRPC.TL_messageActionGroupCall) && (N0 = N0(message2.peer_id.channel_id)) != null && ((inputGroupCall = N0.call) == null || inputGroupCall.f26973id != ijVar5.f23262k.action.call.f26973id)) {
                    V2(0, ijVar5.f23262k.peer_id.channel_id, true);
                }
                if (!z17 && !ijVar5.O3()) {
                    z17 = true;
                }
                if (ijVar5.O3() && !ijVar5.p4() && !ij.m3(ijVar5.f23262k)) {
                    if (ijVar5.M3()) {
                        if (ij.W2(ijVar5.f23262k.media.document)) {
                            z16 = getMessagesController().Q3;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            ui mediaDataController = getMediaDataController();
                            TLRPC.Message message3 = ijVar5.f23262k;
                            mediaDataController.c(message3.media.document, message3.date, ijVar5.V1);
                        }
                    } else if (!ijVar5.H2() && (ijVar5.u4() || ijVar5.K2())) {
                        ui mediaDataController2 = getMediaDataController();
                        TLRPC.Message message4 = ijVar5.f23262k;
                        ijVar2 = ijVar5;
                        mediaDataController2.d(0, ijVar2, message4.media.document, message4.date, false);
                        if (ijVar2.O3() && ijVar2.r4()) {
                            z11 = true;
                        }
                        i12++;
                        z9 = z15;
                    }
                }
                ijVar2 = ijVar5;
                if (ijVar2.O3()) {
                    z11 = true;
                }
                i12++;
                z9 = z15;
            }
            z10 = z9;
            ijVar = ijVar4;
            j10 = j11;
        } else {
            z10 = z9;
            j10 = 0;
            ijVar = null;
            z11 = false;
        }
        getMediaDataController().X0(arrayList, j3, i7, 0L, null, 0, null);
        final long j13 = j3;
        if (i7 == 5) {
            kg.t1 f10 = kg.t1.f(this.currentAccount);
            ArrayList arrayList2 = f10.f17549c;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                ij ijVar6 = (ij) obj;
                if (ijVar6.p4()) {
                    ij ijVar7 = ijVar;
                    if (f10.c(ij.J1(ijVar6.f23262k)) == null && ij.K1(ijVar6.f23262k) != null && f10.d(ij.K1(ijVar6.f23262k)) == null) {
                        String K1 = ij.K1(ijVar6.f23262k);
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj2 = arrayList2.get(i14);
                                i14++;
                                s1Var = (kg.s1) obj2;
                                if (TextUtils.equals(K1, s1Var.f17533b)) {
                                    break;
                                }
                            } else {
                                s1Var = null;
                                break;
                            }
                        }
                        if (s1Var == null) {
                            s1Var = new kg.s1();
                            s1Var.f17537g = true;
                            s1Var.f17533b = ij.K1(ijVar6.f23262k);
                            s1Var.f17532a = -1;
                            s1Var.f17535e = ijVar6;
                            s1Var.d = ijVar6.f1();
                            arrayList2.add(s1Var);
                        }
                        s1Var.h.add(Integer.valueOf(ijVar6.f1()));
                        g0.h3(new fi.h9(f10, 29));
                    }
                    ijVar = ijVar7;
                }
            }
        }
        ij ijVar8 = ijVar;
        if (i7 == 0) {
            int size3 = arrayList.size();
            ArrayList arrayList3 = null;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                ij ijVar9 = (ij) obj3;
                if (ijVar9.f1() > 0 && (ijVar9.f23262k.action instanceof TLRPC.TL_messageActionGramTransfer)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(ijVar9);
                }
            }
            if (arrayList3 != null) {
                getNotificationCenter().k(qs.m0, Long.valueOf(j13), arrayList3);
            }
        }
        getNotificationCenter().k(1, Long.valueOf(j13), arrayList, Boolean.valueOf(z10), Integer.valueOf(i7));
        if (ijVar8 != null && !z10) {
            a0.h hVar = this.Q;
            TLRPC.TL_dialog tL_dialog2 = (TLRPC.TL_dialog) hVar.f(j13);
            boolean z18 = ijVar8.f23262k.action instanceof TLRPC.TL_messageActionChatMigrateTo;
            vo[] voVarArr = this.M;
            ArrayList arrayList4 = this.f24944y;
            a0.h hVar2 = this.S;
            a0.h hVar3 = this.R;
            SparseArray sparseArray = this.U;
            if (z18) {
                if (tL_dialog2 != null) {
                    arrayList4.remove(tL_dialog2);
                    this.E.remove(tL_dialog2);
                    this.F.remove(tL_dialog2);
                    this.H.remove(tL_dialog2);
                    this.G.remove(tL_dialog2);
                    this.I.remove(tL_dialog2);
                    this.L.remove(tL_dialog2);
                    for (int i16 = 0; i16 < voVarArr.length; i16++) {
                        vo voVar = voVarArr[i16];
                        if (voVar != null) {
                            voVar.f26078k.remove(tL_dialog2);
                            voVarArr[i16].f26079l.remove(tL_dialog2);
                        }
                    }
                    this.J.remove(tL_dialog2);
                    this.K.remove(tL_dialog2);
                    this.D.remove(tL_dialog2);
                    hVar.l(tL_dialog2.f26960id);
                    this.O.remove(Long.valueOf(tL_dialog2.f26960id));
                    this.P.remove(Long.valueOf(tL_dialog2.f26960id));
                    int i17 = tL_dialog2.folder_id;
                    SparseIntArray sparseIntArray = this.Z1;
                    int i18 = sparseIntArray.get(i17, 0);
                    if (i18 > 0) {
                        sparseIntArray.put(tL_dialog2.folder_id, i18 - 1);
                    }
                    hVar3.l(tL_dialog2.f26960id);
                    ArrayList arrayList5 = (ArrayList) this.f24924w.get(tL_dialog2.folder_id);
                    if (arrayList5 != null) {
                        arrayList5.remove(tL_dialog2);
                    }
                    g4(tL_dialog2);
                    ij ijVar10 = (ij) sparseArray.get(tL_dialog2.top_message);
                    if (ijVar10 != null && ijVar10.f23262k.peer_id.channel_id == 0) {
                        sparseArray.remove(tL_dialog2.top_message);
                    }
                    if (ijVar10 != null) {
                        long j14 = ijVar10.f23262k.random_id;
                        if (j14 != 0) {
                            hVar2.l(j14);
                        }
                    }
                    z14 = false;
                    tL_dialog2.top_message = 0;
                    getNotificationsController().N(tL_dialog2.f26960id);
                    getNotificationCenter().k(qs.P0, new Object[0]);
                } else {
                    z14 = false;
                }
                if (m5.z(j13)) {
                    r3 g12 = g1(-j13, z14, null);
                    if (g12 != null && (M0 = M0(Long.valueOf(ijVar8.f23262k.action.channel_id))) != null) {
                        g12.f25223c = M0.f26956id;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null && sharedInstance.getAccount() == g12.C.f21765a && sharedInstance.getChat() != null && sharedInstance.getChat().f26956id == (-g12.f25223c)) {
                            sharedInstance.migrateToChat(M0);
                            return false;
                        }
                    }
                } else {
                    return z14;
                }
            } else {
                f10 f10Var = this.f24896s7;
                if (tL_dialog2 == null) {
                    TLRPC.Chat M02 = M0(Long.valueOf(j10));
                    if ((j10 == 0 || M02 != null) && (M02 == null || (!t3.r0(M02) && !M02.min))) {
                        if (r2.f25212a) {
                            StringBuilder t6 = a8.p0.t(j13, "not found dialog with id ", " dictCount = ");
                            t6.append(hVar.m());
                            t6.append(" allCount = ");
                            t6.append(arrayList4.size());
                            a8.b(t6.toString());
                        }
                        TLRPC.TL_dialog tL_dialog3 = new TLRPC.TL_dialog();
                        tL_dialog3.f26960id = j13;
                        int f12 = ijVar8.f1();
                        tL_dialog3.top_message = f12;
                        tL_dialog3.last_message_date = ijVar8.f23262k.date;
                        tL_dialog3.flags = t3.T(M02) ? 1 : 0;
                        LongSparseIntArray longSparseIntArray = this.f24729a0;
                        if (longSparseIntArray.get(j13, 0) > 0) {
                            tL_dialog3.unread_count = longSparseIntArray.get(j13);
                            longSparseIntArray.delete(j13);
                            tL_dialog = tL_dialog3;
                            i10 = f12;
                            r2(j13, 0L, null);
                            for (vo voVar2 : voVarArr) {
                                if (voVar2 != null && (voVar2.f26075g & 64) != 0) {
                                    z13 = true;
                                    break;
                                }
                            }
                        } else {
                            tL_dialog = tL_dialog3;
                            i10 = f12;
                        }
                        z13 = false;
                        hVar.k(tL_dialog, j13);
                        arrayList4.add(tL_dialog);
                        ArrayList arrayList6 = new ArrayList();
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            ij ijVar11 = (ij) arrayList.get(i19);
                            if (ijVar11 != null && (ijVar11.f1() == ijVar8.f1() || (ijVar11.A2() && ijVar8.A2() && ijVar11.e1() == ijVar8.e1()))) {
                                arrayList6.add(ijVar11);
                                if (ijVar11.f23262k.peer_id.channel_id == 0) {
                                    sparseArray.put(ijVar11.f1(), ijVar11);
                                    long j15 = ijVar11.f23262k.random_id;
                                    if (j15 != 0) {
                                        hVar2.k(ijVar11, j15);
                                    }
                                }
                            }
                        }
                        hVar3.k(arrayList6, j13);
                        f10Var.d(j13);
                        if (z13) {
                            T4(null);
                            getNotificationCenter().k(qs.f25070s, new Object[0]);
                        }
                        yr messagesStorage = getMessagesStorage();
                        final TLRPC.TL_dialog tL_dialog4 = tL_dialog;
                        final int i20 = i10;
                        sr srVar = new sr() {
                            @Override
                            public final void a(int i21) {
                                qp qpVar2 = qp.this;
                                if (i21 != -1) {
                                    if (i21 != 0) {
                                        tL_dialog4.folder_id = i21;
                                        qpVar2.T4(null);
                                        qpVar2.getNotificationCenter().k(qs.f25070s, Boolean.TRUE);
                                    }
                                } else if (i20 > 0) {
                                    long j16 = j13;
                                    if (!m5.C(j16)) {
                                        qpVar2.f3(qpVar2.j1(j16), 0L);
                                    }
                                }
                            }
                        };
                        qpVar = this;
                        j13 = j3;
                        messagesStorage.f26719a.c(new er(messagesStorage, j3, srVar, 1));
                        z12 = true;
                    }
                } else {
                    qpVar = this;
                    if ((tL_dialog2.top_message <= 0 || ijVar8.f1() <= 0 || ijVar8.f1() <= tL_dialog2.top_message) && ((tL_dialog2.top_message >= 0 || ijVar8.f1() >= 0 || ijVar8.f1() >= tL_dialog2.top_message) && hVar3.h(j13) >= 0 && tL_dialog2.top_message >= 0 && tL_dialog2.last_message_date > ijVar8.f23262k.date)) {
                        z12 = false;
                    } else {
                        ij ijVar12 = (ij) sparseArray.get(tL_dialog2.top_message);
                        if (ijVar12 != null && ijVar12.f23262k.peer_id.channel_id == 0) {
                            sparseArray.remove(tL_dialog2.top_message);
                        }
                        if (ijVar12 != null) {
                            long j16 = ijVar12.f23262k.random_id;
                            if (j16 != 0) {
                                hVar2.l(j16);
                            }
                        }
                        tL_dialog2.top_message = ijVar8.f1();
                        tL_dialog2.last_message_date = ijVar8.f23262k.date;
                        z12 = true;
                        ArrayList arrayList7 = new ArrayList(1);
                        for (int i21 = 0; i21 < arrayList.size(); i21++) {
                            ij ijVar13 = (ij) arrayList.get(i21);
                            if (ijVar13 != null && (ijVar13.f1() == ijVar8.f1() || (ijVar13.A2() && ijVar8.A2() && ijVar13.e1() == ijVar8.e1()))) {
                                arrayList7.add(ijVar13);
                            }
                        }
                        hVar3.k(arrayList7, j13);
                        f10Var.d(j13);
                        if (ijVar8.f23262k.peer_id.channel_id == 0) {
                            sparseArray.put(ijVar8.f1(), ijVar8);
                            long j17 = ijVar8.f23262k.random_id;
                            if (j17 != 0) {
                                hVar2.k(ijVar8, j17);
                            }
                        }
                    }
                }
                if (z12) {
                    qpVar.T4(null);
                }
                if (z11) {
                    qpVar.getMediaDataController().w0(j13);
                }
                return z12;
            }
        }
        return false;
    }

    public final void m(final long j3, final TLRPC.User user, int i7, String str, final org.telegram.ui.ActionBar.f2 f2Var, final boolean z9, final Runnable runnable, final bp bpVar, final c20 c20Var) {
        boolean z10;
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (bpVar != null) {
                bpVar.a(null);
            }
            if (c20Var != null) {
                c20Var.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat M0 = M0(Long.valueOf(j3));
        final boolean T = t3.T(M0);
        if (T && M0.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        final TLRPC.InputUser q12 = q1(user);
        if (str != null && (!T || z11)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = q12;
            if (T) {
                tL_messages_startBot.peer = j1(-j3);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j3;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.f21334b.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (T) {
            if (q12 instanceof TLRPC.TL_inputUserSelf) {
                Long valueOf = Long.valueOf(j3);
                ArrayList arrayList = this.f24844n;
                if (arrayList.contains(valueOf)) {
                    if (bpVar != null) {
                        bpVar.a(null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = h1(j3);
                arrayList.add(Long.valueOf(j3));
                tL_messages_addChatUser = tL_channels_joinChannel;
            } else {
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = h1(j3);
                tL_channels_inviteToChannel.users.add(q12);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j3;
            tL_messages_addChatUser2.fwd_limit = i7;
            tL_messages_addChatUser2.user_id = q12;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z12;
                final qp qpVar = qp.this;
                final boolean z13 = T;
                final TLRPC.InputUser inputUser = q12;
                long j10 = j3;
                if (z13 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    g0.h3(new mk(qpVar, j10, 11));
                }
                c20 c20Var2 = c20Var;
                Runnable runnable2 = runnable;
                TLRPC.User user2 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        g0.h3(new hi(19, c20Var2, runnable2));
                        return;
                    } else if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user2.f27105id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        g0.h3(new jm(qpVar, c20Var2, tL_messages_invitedUsers, j10, 0));
                        return;
                    } else {
                        g0.h3(new rf(c20Var2, 7));
                        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z9) {
                            if (runnable2 != null) {
                                g0.h3(runnable2);
                                return;
                            }
                            return;
                        }
                        final bp bpVar2 = bpVar;
                        final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        final TLObject tLObject2 = tL_messages_addChatUser3;
                        final boolean z14 = z11;
                        if (bpVar2 != null) {
                            g0.h3(new mh(qpVar, bpVar2, tL_error, f2Var2, tLObject2, z13, z14));
                        }
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z15;
                                qp qpVar2 = qp.this;
                                bp bpVar3 = bpVar2;
                                boolean z16 = z13;
                                if (bpVar3 == null) {
                                    int i10 = qpVar2.currentAccount;
                                    if (z16 && !z14) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    org.telegram.ui.Components.v4.c0(i10, tL_error, f2Var2, tLObject2, Boolean.valueOf(z15));
                                }
                                if (z16 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                                    qpVar2.getNotificationCenter().k(qs.f25063r, 8192);
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
                    g0.h3(new a4(qpVar, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                    updates = tL_messages_invitedUsers2.updates;
                } else if (tLObject instanceof TLRPC.Updates) {
                    updates = (TLRPC.Updates) tLObject;
                } else {
                    a8.d("unexpected " + tLObject + " in addUserToChat");
                    g0.h3(new rf(c20Var2, 8));
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i10);
                        if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                qpVar.O3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    g0.h3(new lm(qpVar, updates, c20Var2, tL_messages_invitedUsers2, j10, 0));
                    return;
                }
                if (z13) {
                    if (!z12 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        qpVar.B0(j10, true);
                    }
                    g0.i3(new mk(qpVar, j10, 13), 1000L);
                }
                if (z13 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    qpVar.getMessagesStorage().R1(-j10, j10, new ArrayList(), null);
                }
                if (runnable2 != null) {
                    g0.h3(runnable2);
                }
                if (c20Var2 != null) {
                    g0.h3(new rf(c20Var2, 6));
                }
                if (t10.B(user2) && !t3.V(M0) && z12) {
                    g0.h3(new mk(qpVar, j10, 12));
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
                long j3 = M0.fromMessageDialogId;
                if (j3 != 0 && j3 != peer.channel_id && M0.fromMessageId != 0) {
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
        this.f24843m8 = null;
        this.f24835l8 = 0L;
    }

    public final void m3(long j3) {
        SharedPreferences.Editor edit = this.f24764d7.edit();
        edit.putBoolean("dialog_bar_replied" + j3, true).apply();
        g0.h3(new mk(this, j3, 9));
    }

    public final void m4(int i7, long j3, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i7;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j3 == 0) {
            ArrayList W0 = W0(i7);
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
                        if (dialog.f26960id != this.f24956z2) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(dialog.f26960id));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!m5.C(dialog.f26960id)) {
                            TLRPC.InputPeer j12 = j1(dialog.f26960id);
                            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.f26960id));
                            if (t3.Y(M0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().h1(M0.f26956id);
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
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new yp(messagesStorage, arrayList2, arrayList3, 0));
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
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new pj(this, j3, 0));
            }
            j3 = getMessagesStorage().z(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new pj(this, j3, 0));
    }

    public final void m5(boolean z9) {
        if (this.P0.isEmpty()) {
            return;
        }
        if (!z9) {
            if (!((vo) this.P0.get(0)).e()) {
                int i7 = 1;
                while (true) {
                    if (i7 >= this.P0.size()) {
                        break;
                    } else if (((vo) this.P0.get(i7)).e()) {
                        this.P0.add(0, (vo) this.P0.remove(i7));
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            i3();
        } else {
            for (int i10 = 0; i10 < this.P0.size(); i10++) {
                ((vo) this.P0.get(i10)).f26083p = false;
            }
        }
        getMessagesStorage().y1();
        getNotificationCenter().k(qs.O2, new Object[0]);
        P1().f9983x.b();
    }

    public final void n(long j3, TLRPC.User user, String str, org.telegram.ui.ActionBar.f2 f2Var, Runnable runnable) {
        m(j3, user, 0, str, f2Var, false, runnable, null, null);
    }

    public final void n0(int i7, long j3, SparseArray sparseArray) {
        Utilities.d.c(new tk(this, i7, 1));
        if (sparseArray != null) {
            g0.h3(new a4(this, j3, sparseArray, 15));
        }
    }

    public final void n2(int i7, long j3) {
        if (this.f24871q1.contains(Long.valueOf(j3))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.f24881r1;
        int indexOfKey = longSparseLongArray.indexOfKey(j3);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        W2(a2(Long.valueOf(j3)), i7, true, null);
    }

    public final void n3(long j3, int i7, long j10) {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new yq(messagesStorage, i7, -j3, j10, 0));
        if (j3 != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = h1(j3);
            tL_channels_readMessageContents.f26995id.add(Integer.valueOf(i7));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new di.u5(13));
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.f27061id.add(Integer.valueOf(i7));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new rj(this, 14));
    }

    public final void n4(int i7, long j3, boolean z9) {
        bi.x9 x9Var = new bi.x9(j3, i7);
        HashSet hashSet = this.f24860o8;
        if (hashSet.contains(x9Var)) {
            return;
        }
        hashSet.add(x9Var);
        this.f24869p8.add(new Pair(x9Var, new AtomicBoolean(z9)));
        vj vjVar = this.f24878q8;
        g0.r(vjVar);
        g0.h3(vjVar);
    }

    public final void n5() {
        Iterator it;
        Iterator it2;
        boolean z9;
        String M0;
        String M02;
        String str;
        int i7;
        String M03;
        String M04;
        String M05;
        int i10;
        String M06;
        int i11;
        String a02;
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        Iterator it3 = this.V.entrySet().iterator();
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
                        hp hpVar = (hp) arrayList.get(0);
                        TLRPC.User a22 = a2(Long.valueOf(hpVar.f22949b));
                        if (a22 == null) {
                            it3 = it;
                            it4 = it2;
                            i12 = 1;
                        } else {
                            if (l10.longValue() < 0 && !C) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            TLRPC.SendMessageAction sendMessageAction = hpVar.f22950c;
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                                if (z9) {
                                    M06 = id.a0("IsRecordingAudio", null, 2131749100, c2(a22));
                                } else {
                                    M06 = id.M0(2131746352, null);
                                }
                                str = M06;
                                i7 = 1;
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                    if (z9) {
                                        M05 = id.a0("IsRecordingRound", null, 2131749099, c2(a22));
                                    } else {
                                        M05 = id.M0(2131746351, null);
                                    }
                                    str = M05;
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                    if (z9) {
                                        str = id.a0("IsSendingVideo", null, 2131749091, c2(a22));
                                    } else {
                                        str = id.M0(2131745578, null);
                                    }
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                        if (z9) {
                                            M04 = id.a0("IsSendingAudio", null, 2131749095, c2(a22));
                                        } else {
                                            M04 = id.M0(2131745585, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                        if (z9) {
                                            M04 = id.a0("IsSendingVideo", null, 2131749091, c2(a22));
                                        } else {
                                            M04 = id.M0(2131745578, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                        if (z9) {
                                            M04 = id.a0("IsRecordingVideo", null, 2131749098, c2(a22));
                                        } else {
                                            M04 = id.M0(2131746348, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                        if (z9) {
                                            M04 = id.a0("IsSendingFile", null, 2131749094, c2(a22));
                                        } else {
                                            M04 = id.M0(2131745584, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                        if (z9) {
                                            M04 = id.a0("IsSendingPhoto", null, 2131749092, c2(a22));
                                        } else {
                                            M04 = id.M0(2131745581, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                        if (z9) {
                                            M03 = id.a0("IsSendingGame", null, 2131749093, c2(a22));
                                        } else {
                                            M03 = id.M0(2131745583, null);
                                        }
                                        i7 = 3;
                                        str = M03;
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                            if (z9) {
                                                M0 = id.a0("IsSelectingLocation", null, 2131749096, c2(a22));
                                            } else {
                                                M0 = id.M0(2131745649, null);
                                            }
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                            if (z9) {
                                                M0 = id.a0("IsSelectingContact", null, 2131749097, c2(a22));
                                            } else {
                                                M0 = id.M0(2131745650, null);
                                            }
                                        } else {
                                            if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                                String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                                if (z9) {
                                                    M02 = id.a0("IsEnjoyngAnimations", null, 2131749101, c2(a22), str2);
                                                } else {
                                                    M02 = id.a0("EnjoyngAnimations", null, 2131751126, str2);
                                                }
                                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                                if (z9) {
                                                    M02 = id.a0("IsChoosingSticker", null, 2131749102, c2(a22));
                                                } else {
                                                    M02 = id.M0(2131752106, null);
                                                }
                                            } else if (z9) {
                                                M0 = id.a0("IsTypingGroup", null, 2131749089, c2(a22));
                                            } else {
                                                M0 = id.M0(2131743921, null);
                                            }
                                            str = M02;
                                            i7 = 5;
                                        }
                                        str = M0;
                                        i7 = 0;
                                    }
                                    str = M04;
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
                                TLRPC.User a23 = a2(Long.valueOf(((hp) obj).f22949b));
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
                                a02 = id.a0("IsTypingGroup", null, 2131749089, sb2.toString());
                            } else if (arrayList.size() > 2) {
                                try {
                                    a02 = String.format(id.K0(arrayList.size() - 2, "AndMoreTypingGroup"), sb2.toString(), Integer.valueOf(arrayList.size() - 2));
                                } catch (Exception unused) {
                                    a02 = "LOC_ERR: AndMoreTypingGroup";
                                }
                            } else {
                                a02 = id.a0("AreTypingGroup", null, 2131754121, sb2.toString());
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
                this.f24739b0 = hVar.m();
                g0.h3(new tj(this, hVar, hVar2, 1));
                return;
            }
        }
    }

    public final void o(TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, int i7, q0.a aVar, q0.a aVar2, mc0 mc0Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j3 = chat2.f26956id;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            m(j3, user, i7, null, f2Var, false, new hi(24, aVar, user), new o(4, aVar2, user), new jk(this, tL_messages_invitedUsers, iArr, size, chat2, mc0Var));
            X3(user, false, false);
            chat2 = chat;
        }
    }

    public final void o0(boolean z9) {
        TLRPC.UserFull b22 = b2(getUserConfig().e());
        if (b22 != null) {
            b22.sponsored_enabled = false;
            getMessagesStorage().j2(b22, false);
            if (z9) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final TLRPC.InputUser o1(long j3) {
        return q1(a2(Long.valueOf(j3)));
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

    public final void o3(long j3, long j10) {
        if (!m5.C(j3) && j3 != getUserConfig().e()) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new yq(messagesStorage, j10, j3, 0, 7));
            TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
            tL_messages_readMentions.peer = j1(j3);
            if (j10 != 0) {
                tL_messages_readMentions.top_msg_id = (int) j10;
                tL_messages_readMentions.flags |= 1;
            }
            getConnectionsManager().sendRequest(tL_messages_readMentions, null);
        }
    }

    public final void o4(long j3, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z9) {
        if (user != null || chat != null || encryptedChat != null) {
            SharedPreferences.Editor edit = this.f24764d7.edit();
            edit.putInt("dialog_bar_vis3" + j3, 3);
            edit.commit();
            if (m5.C(j3)) {
                if (encryptedChat != null && encryptedChat.access_hash != 0) {
                    TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.f26964id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new di.u5(13), 2);
                }
            } else if (z9) {
                TL_account.reportPeer reportpeer = new TL_account.reportPeer();
                if (chat != null) {
                    reportpeer.peer = j1(-chat.f26956id);
                } else if (user != null) {
                    reportpeer.peer = j1(user.f27105id);
                }
                reportpeer.message = "";
                reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
                getConnectionsManager().sendRequest(reportpeer, new di.u5(13), 2);
            } else {
                TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
                if (chat != null) {
                    tL_messages_reportSpam.peer = j1(-chat.f26956id);
                } else if (user != null) {
                    tL_messages_reportSpam.peer = j1(user.f27105id);
                }
                getConnectionsManager().sendRequest(tL_messages_reportSpam, new di.u5(13), 2);
            }
        }
    }

    public final boolean o5(ArrayList arrayList, long j3) {
        boolean z9;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        ConcurrentHashMap concurrentHashMap = this.V;
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
                ij ijVar = (ij) obj;
                if (ijVar.q3() && !arrayList2.contains(Long.valueOf(ijVar.f23262k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(ijVar.f23262k.from_id.user_id));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j3));
            if (concurrentHashMap2 != null) {
                ArrayList arrayList3 = null;
                z9 = false;
                for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    int i11 = 0;
                    while (i11 < arrayList4.size()) {
                        if (arrayList2.contains(Long.valueOf(((hp) arrayList4.get(i11)).f22949b))) {
                            arrayList4.remove(i11);
                            i11--;
                            if (arrayList4.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(num);
                            }
                            z9 = true;
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
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final void p(String str, boolean z9) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z9;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new fl(this, 4));
    }

    public final void p0(long j3, int i7, long j10) {
        getMessagesStorage().q1(j3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i7));
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new lr(messagesStorage, arrayList, j10, 1));
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

    public final boolean p2(long j3) {
        if (j3 < 0) {
            return t3.Y(M0(Long.valueOf(-j3)));
        }
        return false;
    }

    public final void p3(long j3, int i7, long j10) {
        TLRPC.EncryptedChat a12;
        if (j10 != 0 && j3 != 0) {
            if ((i7 > 0 || i7 == Integer.MIN_VALUE) && m5.C(j3) && (a12 = a1(Integer.valueOf((int) (j3 & 4294967295L)))) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j10));
                getSecretChatHelper().u(a12, arrayList, null);
                if (i7 > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    yr messagesStorage = getMessagesStorage();
                    messagesStorage.f26719a.c(new wq(messagesStorage, a12.f26964id, arrayList, 0, currentTime, currentTime));
                }
            }
        }
    }

    public final void p4() {
        this.F3 = false;
        this.I5 = false;
        this.I3 = false;
        this.H3 = false;
        this.O5 = false;
        this.P5 = false;
        this.f24817j7 = true;
        this.Q5 = 1024;
        this.F6 = false;
        this.M6 = 0L;
        this.N6 = 0L;
        this.O6 = "t.me/spambot";
        this.f24912u6 = null;
        this.f24921v6 = "GB";
        this.C4 = new HashSet();
        k5.d(k5.d(this.f24774e7.edit().remove("starsLocked").remove("getfileExperimentalParams").remove("smsjobsStickyNotificationEnabled").remove("channelRevenueWithdrawalEnabled"), "showAnnualPerMonth", "canEditFactcheck", "factcheckLengthLimit", "videoIgnoreAltDocuments"), "freezeSinceDate", "freezeUntilDate", "freezeAppealUrl", "verifyAgeBotUsername").remove("verifyAgeCountry").remove("ignoreRestrictionReasons").apply();
    }

    public final void p5(long j3, String str, long j10) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        M0(Long.valueOf(j3));
        a0.h hVar = (a0.h) this.f24936x1.f(j3);
        if (hVar != null && (channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j10)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull N0 = N0(j3);
        if (N0 != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
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
        qs.f(this.currentAccount).k(qs.f25063r, 0);
        qs.f(this.currentAccount).k(qs.W3, Long.valueOf(j3), Long.valueOf(j10), str2);
        yr a02 = yr.a0(this.currentAccount);
        a02.f26719a.c(new qq(a02, -j3, j10, str2, 0));
    }

    public final void q(org.telegram.tgnet.TLRPC.TL_jsonObject r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.q(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    public final TLRPC.InputUser q1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.f27105id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
            tL_inputUserFromMessage.user_id = user.f27105id;
            tL_inputUserFromMessage.peer = j1(user.fromMessageDialogId);
            tL_inputUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputUserFromMessage;
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.f27105id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public final boolean q2(long j3, long j10) {
        return r2(j3, j10, null);
    }

    public final void q3(long r13, int r15, org.telegram.tgnet.TLRPC.InputChannel r16, int r17, long r18, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.q3(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public final void q4(boolean r23, final int r24, final int r25, final int r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.q4(boolean, int, int, int, int):void");
    }

    public final void q5(long r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.q5(long):void");
    }

    public final void r(ArrayList arrayList) {
        SharedPreferences.Editor edit = s1(this.currentAccount).f24764d7.edit();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                et etVar = getNotificationsController().f22094g0;
                etVar.getClass();
                long C1 = ij.C1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(a8.p0.o(C1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + C1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(etVar.f22275a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) != 0) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                            edit.putInt("notify2_" + C1, 2);
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        } else {
                            edit.putInt("notify2_" + C1, 3);
                            edit.putInt(a8.p0.o(C1, "notifyuntil_"), dialog.notify_settings.mute_until);
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

    public final void r0(int i7, boolean[] zArr) {
        ArrayList arrayList;
        if (i7 == 0) {
            return;
        }
        long j3 = 2305843009213693952L | i7;
        a0.h hVar = this.Q;
        if (((TLRPC.Dialog) hVar.f(j3)) instanceof TLRPC.TL_dialogFolder) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.f26960id = j3;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.f27007id = i7;
        tL_folder.title = id.M0(2131754136, null);
        tL_dialogFolder.pinned = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f24944y;
            if (i10 >= arrayList.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (!dialog.pinned) {
                if (dialog.f26960id != this.f24956z2) {
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

    public final boolean r2(long j3, long j10, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb2 = new StringBuilder("notify2_");
        boolean z9 = false;
        sb2.append(dt.v(j3, j10, false));
        String sb3 = sb2.toString();
        SharedPreferences sharedPreferences = this.f24764d7;
        int i7 = sharedPreferences.getInt(sb3, -1);
        if (i7 == -1) {
            if (chat != null) {
                if (t3.T(chat) && !chat.megagroup) {
                    z9 = true;
                }
                bool = Boolean.valueOf(z9);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            if (j10 != 0) {
                return r2(j3, 0L, chat);
            }
            return !getNotificationsController().D(j3, bool2, false, false);
        } else if (i7 == 2) {
            return true;
        } else {
            if (i7 == 3) {
                if (sharedPreferences.getInt("notifyuntil_" + dt.v(j3, j10, false), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void r3(ij ijVar) {
        if (ijVar.f23281p1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (ijVar.f23262k.mentioned) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new yq(messagesStorage, ijVar.f1(), -ijVar.f23262k.peer_id.channel_id, ij.B0(ijVar.f23262k), 0));
        }
        arrayList.add(Integer.valueOf(ijVar.f1()));
        long B0 = ij.B0(ijVar.f23262k);
        getMessagesStorage().S0(0, 0, B0, arrayList);
        getNotificationCenter().k(qs.C0, Long.valueOf(B0), arrayList);
        if (ijVar.f1() < 0) {
            p3(ij.B0(ijVar.f23262k), Integer.MIN_VALUE, ijVar.f23262k.random_id);
        } else if (ijVar.f23262k.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = h1(ijVar.f23262k.peer_id.channel_id);
            tL_channels_readMessageContents.f26995id.add(Integer.valueOf(ijVar.f1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new di.u5(13));
        } else {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.f27061id.add(Integer.valueOf(ijVar.f1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new rj(this, 5));
        }
    }

    public final void r4(ij ijVar) {
        long j3;
        if (ijVar == null) {
            return;
        }
        yr messagesStorage = getMessagesStorage();
        long B0 = ij.B0(ijVar.f23262k);
        int P0 = ijVar.P0();
        messagesStorage.getClass();
        a0.h hVar = new a0.h(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        hVar.k(arrayList, B0);
        messagesStorage.I(new yf((Object) messagesStorage, (Object) hVar, false, 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = j1(ij.B0(ijVar.f23262k));
        TLRPC.Message message = ijVar.f23262k;
        if (message != null) {
            j3 = message.ephemeralReceiverBotId;
        } else {
            j3 = 0;
        }
        tL_deleteMessage.receiver_id = o1(j3);
        tL_deleteMessage.f27172id = ijVar.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
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
        int i7 = 0;
        boolean z9 = false;
        while (i7 < size) {
            TL_update.TL_updateFolderPeers tL_updateFolderPeers = (TL_update.TL_updateFolderPeers) arrayList.get(i7);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(m5.o(tL_folderPeer.peer));
                if (dialog != null) {
                    int i11 = dialog.folder_id;
                    int i12 = tL_folderPeer.folder_id;
                    if (i11 != i12) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i12;
                        this.f24819k0 = true;
                        D();
                    }
                }
            }
            getMessagesStorage().G1(((TL_update.TL_updateFolderPeers) arrayList.get(i7)).folder_peers, null, 0L, 0);
            i7++;
            z9 = true;
        }
        return z9;
    }

    public final Runnable s0(long j3, int i7, ep epVar) {
        int i10;
        long j10;
        int i11;
        qp qpVar;
        SharedPreferences sharedPreferences = s1(this.currentAccount).f24764d7;
        if (i7 == 0) {
            i10 = sharedPreferences.getInt("diditem" + j3, 0);
        } else {
            i10 = i7;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        if (m5.z(j3)) {
            j10 = -j3;
        } else {
            j10 = 0;
        }
        if (j10 != 0 && getMessagesController().M0(Long.valueOf(j10)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new qk(this, zArr, messagesStorage, j10, runnableArr, j3, i10, epVar));
            return new rk(zArr, runnableArr, 0);
        }
        if (g0.Q1()) {
            i11 = 30;
        } else {
            i11 = 20;
        }
        int i12 = i11;
        int i13 = i10;
        oo ooVar = new oo(this, generateClassGuid, i12, i13, j3, epVar);
        getNotificationCenter().b(ooVar, qs.H);
        getNotificationCenter().b(ooVar, qs.I);
        if (i13 != 0) {
            qpVar = this;
            qpVar.Z2(j3, 0L, true, i12, i13, 0, true, 0, generateClassGuid, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            qpVar = this;
            qpVar.Z2(j3, 0L, true, i12, i13, 0, true, 0, generateClassGuid, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new tk(qpVar, generateClassGuid, 0);
    }

    public final boolean s2(long j3, long j10) {
        return this.f24764d7.getBoolean("sound_enabled_" + dt.v(j3, j10, false), true);
    }

    public final void s3(long j3, long j10) {
        long j11;
        ArrayList l10;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        k00 k00Var = this.f24877q7;
        if (i7 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j3);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((t2(j3) || z2(j3)) && (l10 = k00Var.l((j11 = -j3))) != null) {
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                k00Var.y(j11, true);
            }
        } else {
            long j12 = -j3;
            TLRPC.TL_forumTopic f10 = k00Var.f(j12, j10);
            if (f10 != null && f10.unread_poll_votes_count > 0) {
                f10.unread_poll_votes_count = 0;
                k00Var.y(j12, true);
            }
        }
        getMessagesStorage().h2(0, j3, j10, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = j1(j3);
        if (i7 != 0 && !y2(j3)) {
            tL_messages_readPollVotes.top_msg_id = (int) j10;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new di.u5(13));
        qs.f(this.currentAccount).k(qs.f25063r, 1048576);
    }

    public final boolean s4() {
        String str = ((n0) this.f24942x7.f24430a0.f13555b).f24118c;
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

    public final boolean s5(long j3, ch.o0 o0Var, boolean z9) {
        long j10;
        int i7;
        if (this.f24737a8 == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                j10 = 0;
            } else {
                j10 = j3;
            }
            if (i10 != 1 || j10 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.f24737a8.f(j10);
                if (tL_messages_savedReactionsTags == null) {
                    if (j10 != 0) {
                        a0.h hVar = this.f24737a8;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        hVar.k(tL_messages_savedReactionsTags, j10);
                    }
                }
                int i11 = 0;
                boolean z11 = false;
                while (i11 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i11);
                    if (o0Var.f(tL_savedReactionTag.reaction)) {
                        int i12 = tL_savedReactionTag.count;
                        if (z9) {
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
                            z11 = true;
                        }
                        z10 = true;
                        z11 = true;
                    }
                    i11++;
                }
                if (!z11 && z9) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                    tL_savedReactionTag2.reaction = o0Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void t(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (c8.zc.a(tL_updateWebBrowserException.flags, 1)) {
                if (tL_updateWebBrowserException.open_external_browser) {
                    m0(this.f24953y8.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    m0(this.f24953y8.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                m0(this.f24953y8.external_exceptions, tL_updateWebBrowserException.exception);
                m0(this.f24953y8.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            m0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            m0(this.f24953y8.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            m0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            m0(this.f24953y8.external_exceptions, tL_updateWebBrowserException.exception);
        }
        Q4(this.f24953y8);
    }

    public final SharedPreferences t1() {
        return this.f24774e7;
    }

    public final boolean t2(long j3) {
        if (j3 < 0) {
            TLRPC.Chat M0 = M0(Long.valueOf(-j3));
            if (M0 != null && M0.forum) {
                return true;
            }
            return false;
        }
        return t10.u(a2(Long.valueOf(j3)));
    }

    public final void t3(long j3, long j10) {
        long j11;
        ArrayList l10;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        k00 k00Var = this.f24877q7;
        if (i7 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j3);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((t2(j3) || z2(j3)) && (l10 = k00Var.l((j11 = -j3))) != null) {
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                k00Var.y(j11, true);
            }
        } else {
            long j12 = -j3;
            TLRPC.TL_forumTopic f10 = k00Var.f(j12, j10);
            if (f10 != null && f10.unread_reactions_count > 0) {
                f10.unread_reactions_count = 0;
                k00Var.y(j12, true);
            }
        }
        getMessagesStorage().i2(0, j3, j10, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = j1(j3);
        if (i7 != 0) {
            if (y2(j3)) {
                tL_messages_readReactions.saved_peer_id = j1(j10);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j10;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new di.u5(13));
        qs.f(this.currentAccount).k(qs.f25063r, 1048576);
    }

    public final void t4(Object obj, TLRPC.Document document) {
        if (obj != null && ij.t3(document, false)) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_messages_saveGif.f27065id = tL_inputDocument;
            tL_inputDocument.f26968id = document.f26962id;
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

    public final void t5(TLObject tLObject, String str, boolean z9) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = this.f24766e;
            concurrentHashMap.remove(str);
            if (z9) {
                concurrentHashMap.put(str.toLowerCase(), tLObject);
            }
        }
    }

    public final void u(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        Q4(tL_webBrowserSettings);
    }

    public final int u1() {
        g6.d0 d0Var;
        boolean q10 = getUserConfig().q();
        p0 p0Var = this.f24942x7;
        if (q10) {
            d0Var = p0Var.f24434c0;
        } else {
            d0Var = p0Var.f24432b0;
        }
        return ((j0) d0Var.f13555b).f23460c;
    }

    public final boolean u2(ij ijVar) {
        if (ijVar != null && t2(ij.B0(ijVar.f23262k))) {
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
                if (t10.B(user)) {
                    tL_chatAdminRights2 = chat.admin_rights;
                } else {
                    TLRPC.ChatFull N0 = N0(chat.f26956id);
                    if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                break;
                            }
                            TLRPC.ChatParticipant chatParticipant = arrayList.get(i7);
                            if (chatParticipant != null && chatParticipant.user_id == user.f27105id) {
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

    public final void u4(long j3, TLRPC.PeerSettings peerSettings) {
        boolean z9;
        int i7;
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.f24764d7;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i10 = 2;
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(a8.p0.o(j3, "dialog_botid"), peerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j3, peerSettings.business_bot_manage_url);
            String str = "dialog_botflags" + j3;
            boolean z10 = peerSettings.business_bot_paused;
            if (peerSettings.business_bot_can_reply) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            edit.putInt(str, (z10 ? 1 : 0) + i7);
        } else {
            edit.remove("dialog_botid" + j3).remove("dialog_boturl" + j3).remove("dialog_botflags" + j3);
        }
        edit.putLong(a8.p0.o(j3, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        int i11 = sharedPreferences.getInt("dialog_bar_vis3" + j3, 0);
        int i12 = qs.Q0;
        if (i11 == 3) {
            edit.apply();
            getNotificationCenter().k(i12, Long.valueOf(j3));
            return;
        }
        if (peerSettings.flags == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (r2.f25212a) {
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
            t6.append(z9);
            t6.append(" distance = ");
            t6.append(peerSettings.geo_distance);
            t6.append(" invite = ");
            t6.append(peerSettings.invite_members);
            a8.b(t6.toString());
        }
        String o4 = a8.p0.o(j3, "dialog_bar_vis3");
        if (z9) {
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
        this.f24862p1.k(peerSettings, j3);
        getNotificationCenter().k(i12, Long.valueOf(j3));
    }

    public final void u5(boolean z9, boolean z10) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24953y8;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z9;
            tL_webBrowserSettings.display_close_button = z10;
            Q4(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z9;
        updatewebbrowsersettings.display_close_button = z10;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new d3.b(1), new fl(this, 1));
    }

    public final void v(int i7, int i10, long j3, String str, boolean z9) {
        String str2 = j3 + "_" + i7;
        HashMap hashMap = this.f24897s8;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z9;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().j1(j3);
        tL_messages_toggleSuggestedPostApproval.msg_id = i7;
        if (i10 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i10;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z9 && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j3 + "_" + i7, Boolean.valueOf(!z9));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new im(this, j3, i7, 0));
    }

    public final void v0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i10);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long o4 = m5.o(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && o4 != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i11);
                        if (o4 == ij.B0(message) && dialog.top_message == message.f26977id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.f27007id;
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
                                    if (chat.f26956id == tL_inputPeerUser.channel_id) {
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
                                    if (user.f27105id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i7++;
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

    public final TLRPC.Chat v1(long j3) {
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        TLRPC.Chat M03 = M0(Long.valueOf(j3));
        if (M03 != null && (M02 = M0(Long.valueOf(M03.linked_monoforum_id))) != null) {
            return M02;
        }
        Long l10 = (Long) this.f24776f.get(Long.valueOf(j3));
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
                SharedPreferences sharedPreferences = this.f24774e7;
                if (length > 0) {
                    String sb3 = sb2.toString();
                    boolean z9 = !sb3.equals(sharedPreferences.getString(str, null));
                    editor.putString(str, sb3);
                    return z9;
                }
                editor.remove(str);
                if (sharedPreferences.getString(str, null) == null) {
                    return false;
                }
                return true;
            }
        }
    }

    public final void w(long j3) {
        TLRPC.Chat M0;
        TLRPC.User user = null;
        if (j3 > 0) {
            TLRPC.User a22 = a2(Long.valueOf(j3));
            if (a22 != null) {
                user = a22;
                M0 = null;
            } else {
                return;
            }
        } else {
            M0 = M0(Long.valueOf(-j3));
            if (M0 == null) {
                return;
            }
        }
        LongSparseIntArray longSparseIntArray = this.G0;
        if (longSparseIntArray.indexOfKey(j3) >= 0) {
            return;
        }
        longSparseIntArray.put(j3, 1);
        if (user != null) {
            if (user.bot) {
                getMediaDataController().L1(j3);
            } else {
                getMediaDataController().N1(j3);
            }
        }
        int i7 = this.H0;
        if (i7 >= 0) {
            this.H0 = i7 + 1;
        }
        getNotificationCenter().k(qs.f25002g0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.f26999id = n1(user);
        } else {
            tL_contacts_block.f26999id = l1(M0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new di.u5(13));
    }

    public final ArrayList w0(ArrayList arrayList) {
        if (!D3()) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.TL_messages_stickerSet x02 = s1(this.currentAccount).x0((TLRPC.TL_messages_stickerSet) arrayList.get(i7));
            if (x02 == null) {
                arrayList.remove(i7);
                i7--;
            } else {
                arrayList.set(i7, x02);
            }
            i7++;
        }
        return arrayList;
    }

    public final void w1(final long j3, final long j10, final int i7, final boolean z9, final q0.a aVar) {
        String str;
        String str2;
        if (z9) {
            str = "reaction_mentions";
        } else {
            str = "poll_votes_mentions";
        }
        final String str3 = str;
        if (z9) {
            str2 = "reaction_mentions_topics";
        } else {
            str2 = "poll_votes_mentions_topics";
        }
        final String str4 = str2;
        final boolean z10 = !z9;
        getMessagesStorage().f26719a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hm.run():void");
            }
        });
    }

    public final boolean w2(long j3) {
        ArrayList arrayList = this.R0;
        if (!arrayList.isEmpty() && arrayList.contains(Long.valueOf(j3))) {
            return true;
        }
        return false;
    }

    public final void w3(vo voVar) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.M[i7] == voVar) {
                T4(null);
                getNotificationCenter().k(qs.f25070s, Boolean.TRUE);
                return;
            }
        }
    }

    public final void w4(long j3, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().f26719a.c(new a4(this, j3, tL_messages_savedReactionsTags, 19));
    }

    public final ui.e x(long j3) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull N0 = N0(j3);
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        if (N0 != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long o4 = m5.o(communityPeer2.peer);
                TLRPC.Chat M0 = M0(Long.valueOf(-o4));
                TLRPC.User a22 = a2(Long.valueOf(o4));
                if (M0 != null || a22 != null) {
                    arrayList2.add(new uo(M0, S0(o4), a22, communityPeer2));
                }
            }
        }
        ui.e eVar = new ui.e(7);
        ArrayList arrayList3 = (ArrayList) eVar.d;
        ArrayList arrayList4 = (ArrayList) eVar.f56932e;
        ArrayList arrayList5 = (ArrayList) eVar.f56931c;
        ArrayList arrayList6 = (ArrayList) eVar.f56930b;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj = arrayList2.get(i7);
            i7++;
            uo uoVar = (uo) obj;
            int c10 = ii.m0.c(uoVar.f25881b, uoVar.d, uoVar.f25882c, uoVar.f25880a);
            if (c10 == 1) {
                arrayList6.add(uoVar);
            } else if (c10 == 2) {
                arrayList5.add(uoVar);
            } else if (c10 == 4) {
                arrayList4.add(uoVar);
            } else if (c10 == 3) {
                arrayList3.add(uoVar);
            }
        }
        ol olVar = this.F7;
        Collections.sort(arrayList6, olVar);
        Collections.sort(arrayList5, olVar);
        Collections.sort(arrayList3, olVar);
        Collections.sort(arrayList4, olVar);
        return eVar;
    }

    public final TLRPC.TL_messages_stickerSet x0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        Exception e10;
        if (D3() && tL_messages_stickerSet != null) {
            int i7 = 0;
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                try {
                    if (ij.Y3(tL_messages_stickerSet.documents.get(i10))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i7 < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (ij.Y3(tL_messages_stickerSet2.documents.get(i7))) {
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

    public final boolean x2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (t10.B(user)) {
                return !t3.r0(chat);
            }
            TLRPC.ChatFull N0 = N0(chat.f26956id);
            if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i7);
                    if (chatParticipant != null && chatParticipant.user_id == user.f27105id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void x3(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str, int i7, vf.b bVar, boolean z9, boolean z10) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (bVar != null) {
            bVar.f57323b = new kk(1, zArr);
            bVar.d();
        }
        wl wlVar = new wl(this, f2Var, bVar, zArr, user, str, z9, z10, r9);
        ui mediaDataController = getMediaDataController();
        long j3 = user.f27105id;
        HashMap hashMap = mediaDataController.f25847v1;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hashMap.get(j3 + "_" + j3);
        TL_bots.BotInfo[] botInfoArr = {botInfo};
        if (user.bot_has_main_app) {
            wlVar.run();
        } else if (botInfo == null) {
            ui mediaDataController2 = getMediaDataController();
            long j10 = user.f27105id;
            mediaDataController2.G0(j10, j10, false, i7, new jk(this, zArr, botInfoArr, user, i7, wlVar));
        } else {
            wlVar.run();
        }
    }

    public final void x4(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        TLRPC.TL_theme tL_theme;
        if (h6Var != null) {
            tL_theme = h6Var.f27534r;
        } else {
            tL_theme = j6Var.F;
        }
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27027id = tL_theme.f27095id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z10;
            getConnectionsManager().sendRequest(savetheme, new di.u5(13));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z10) {
            k2(j6Var, h6Var, z9);
        }
    }

    public final boolean y(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!m5.C(dialog.f26960id)) {
                if (m5.y(dialog)) {
                    TLRPC.Chat M0 = M0(Long.valueOf(-dialog.f26960id));
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
                long j3 = dialog.f26960id;
                if (j3 > 0) {
                    if (t3.u0(this.currentAccount, a2(Long.valueOf(j3)))) {
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
        if (this.f24833l6 == null && !this.f24852n8) {
            this.f24852n8 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.f24833l6;
    }

    public final boolean y2(long j3) {
        TLRPC.Chat M0 = M0(Long.valueOf(-j3));
        if (M0 != null && M0.monoforum) {
            return true;
        }
        return false;
    }

    public final void y3(java.lang.String r11, org.telegram.ui.ActionBar.f2 r12, int r13, vf.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.y3(java.lang.String, org.telegram.ui.ActionBar.f2, int, vf.b):void");
    }

    public final void y4(org.telegram.ui.ActionBar.j6 r20, org.telegram.ui.ActionBar.h6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.y4(org.telegram.ui.ActionBar.j6, org.telegram.ui.ActionBar.h6):void");
    }

    public final void z(long j3, int i7, long j10) {
        a0.h hVar;
        a0.h hVar2;
        if (i7 >= 0) {
            a0.h[] hVarArr = this.Y;
            if (i7 < hVarArr.length && (hVar = hVarArr[i7]) != null && (hVar2 = (a0.h) hVar.f(j3)) != null) {
                hVar2.l(j10);
                if (hVar2.m() == 0) {
                    hVar.l(j3);
                }
            }
        }
    }

    public final TLRPC.Peer z1(long j3) {
        if (j3 < 0) {
            long j10 = -j3;
            if (t3.T(M0(Long.valueOf(j10)))) {
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

    public final boolean z2(long j3) {
        TLRPC.Chat M0 = M0(Long.valueOf(-j3));
        if (t3.p0(M0) && t3.A(this.currentAccount, M0, 24)) {
            return true;
        }
        return false;
    }

    public final void z3(org.telegram.tgnet.TLRPC.User r9, org.telegram.tgnet.TLRPC.Chat r10, org.telegram.ui.ActionBar.f2 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.z3(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.f2, int):void");
    }

    public final void z4(java.io.File r9, org.telegram.ui.ActionBar.c6 r10, boolean r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qp.z4(java.io.File, org.telegram.ui.ActionBar.c6, boolean, long):void");
    }
}
