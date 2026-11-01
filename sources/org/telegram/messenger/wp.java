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
import org.telegram.ui.bv0;
import org.telegram.ui.p90;
import org.telegram.ui.pd0;
public final class wp extends f1 implements vs {
    public static volatile long B8;
    public static volatile long C8;
    public static final int D8 = (2 | 4) | 1050105;
    public static final int E8 = (1 | 2) | 28;
    public static volatile wp[] F8 = new wp[4];
    public static final Object[] G8 = new Object[4];
    public final a0.h A0;
    public final a0.h A1;
    public int A2;
    public String A3;
    public int A4;
    public int A5;
    public int A6;
    public int A7;
    public final wo A8;
    public final LongSparseIntArray B0;
    public final a0.h B1;
    public String B2;
    public boolean B3;
    public int B4;
    public int B5;
    public int B6;
    public boolean B7;
    public final a0.h C0;
    public final a0.h C1;
    public String C2;
    public boolean C3;
    public Set C4;
    public int C5;
    public String C6;
    public final SparseArray C7;
    public final ArrayList D;
    public final a0.h D0;
    public final HashMap D1;
    public String D2;
    public float D3;
    public Set D4;
    public float D5;
    public String D6;
    public bp D7;
    public final ArrayList E;
    public final a0.h E0;
    public final a0.h E1;
    public boolean E2;
    public boolean E3;
    public int E4;
    public float E5;
    public int E6;
    public final pl E7;
    public final ArrayList F;
    public boolean F0;
    public final HashMap F1;
    public int F2;
    public boolean F3;
    public int F4;
    public int F5;
    public int F6;
    public final pl F7;
    public final ArrayList G;
    public final LongSparseIntArray G0;
    public final a0.h G1;
    public int G2;
    public volatile boolean G3;
    public int G4;
    public int G5;
    public boolean G6;
    public final pl G7;
    public final ArrayList H;
    public int H0;
    public final HashMap H1;
    public final ag.f3 H2;
    public boolean H3;
    public int H4;
    public int H5;
    public boolean H6;
    public final ck H7;
    public final ArrayList I;
    public boolean I0;
    public final a0.h I1;
    public final ak I2;
    public boolean I3;
    public int I4;
    public int I5;
    public String I6;
    public r20 I7;
    public final ArrayList J;
    public final a0.h J0;
    public final a0.h J1;
    public long J2;
    public boolean J3;
    public int J4;
    public boolean J5;
    public long J6;
    public final ak J7;
    public final ArrayList K;
    public final a0.h K0;
    public final a0.h K1;
    public int K2;
    public String K3;
    public int K4;
    public boolean K5;
    public int K6;
    public final ak K7;
    public final ArrayList L;
    public int L0;
    public final a0.h L1;
    public int L2;
    public String L3;
    public int L4;
    public int L5;
    public int L6;
    public final a0.h L7;
    public final bp[] M;
    public long M0;
    public final a0.h M1;
    public boolean M2;
    public String M3;
    public int M4;
    public String M5;
    public boolean M6;
    public final a0.h M7;
    public int N;
    public final SparseIntArray N0;
    public final a0.h N1;
    public String N2;
    public String N3;
    public int N4;
    public boolean N5;
    public long N6;
    public long N7;
    public final ConcurrentHashMap O;
    public final SparseIntArray O0;
    public final a0.h O1;
    public final a0.h O2;
    public String O3;
    public int O4;
    public int O5;
    public long O6;
    public final int O7;
    public final ConcurrentHashMap P;
    public ArrayList P0;
    public final ArrayList P1;
    public final HashMap P2;
    public int P3;
    public int P4;
    public boolean P5;
    public String P6;
    public final int P7;
    public final a0.h Q;
    public ArrayList Q0;
    public final a0.h Q1;
    public String Q2;
    public String Q3;
    public int Q4;
    public boolean Q5;
    public int Q6;
    public final int Q7;
    public final a0.h R;
    public final ArrayList R0;
    public final ArrayList R1;
    public org.telegram.ui.ActionBar.m6 R2;
    public boolean R3;
    public int R4;
    public int R5;
    public boolean R6;
    public ArrayList R7;
    public final a0.h S;
    public final SparseArray S0;
    public final HashMap S1;
    public h20 S2;
    public boolean S3;
    public int S4;
    public long S5;
    public int S6;
    public final LongSparseIntArray S7;
    public final LongSparseIntArray T;
    public boolean T0;
    public boolean T1;
    public final to T2;
    public String T3;
    public int T4;
    public long T5;
    public int T6;
    public final LongSparseIntArray T7;
    public final SparseArray U;
    public boolean U0;
    public int U1;
    public String U2;
    public Set U3;
    public int U4;
    public int U5;
    public int U6;
    public final LongSparseIntArray U7;
    public final ConcurrentHashMap V;
    public final ArrayList V0;
    public a0.h V1;
    public int V2;
    public Set V3;
    public int V4;
    public String V5;
    public String V6;
    public final a0.h V7;
    public a0.h W;
    public final a0.h W0;
    public a0.h W1;
    public final int W2;
    public TLRPC.TL_pendingSuggestion W3;
    public int W4;
    public String W5;
    public String W6;
    public final HashSet W7;
    public a0.h X;
    public final LongSparseLongArray X0;
    public ak X1;
    public int X2;
    public Set X3;
    public int X4;
    public boolean X5;
    public HashSet X6;
    public boolean X7;
    public final a0.h[] Y;
    public final LongSparseIntArray Y0;
    public boolean Y1;
    public int Y2;
    public Set Y3;
    public int Y4;
    public boolean Y5;
    public int[] Y6;
    public TLRPC.TL_exportedContactToken Y7;
    public final ConcurrentHashMap Z;
    public final a0.h Z0;
    public final SparseIntArray Z1;
    public int Z2;
    public Set Z3;
    public int Z4;
    public boolean Z5;
    public int Z6;
    public HashMap Z7;
    public int f19076a;
    public final LongSparseIntArray f19077a0;
    public final a0.h f19078a1;
    public final SparseBooleanArray a2;
    public int f19079a3;
    public boolean f19080a4;
    public int f19081a5;
    public long f19082a6;
    public long f19083a7;
    public HashSet f19084a8;
    public final ConcurrentHashMap f19085b;
    public int f19086b0;
    public final a0.h f19087b1;
    public final SparseBooleanArray f19088b2;
    public int f19089b3;
    public int f19090b4;
    public int f19091b5;
    public long f19092b6;
    public long f19093b7;
    public a0.h f19094b8;
    public final ConcurrentHashMap f19095c;
    public final SparseArray f19096c0;
    public final a0.h f19097c1;
    public final SparseBooleanArray f19098c2;
    public boolean f19099c3;
    public boolean f19100c4;
    public int f19101c5;
    public float f19102c6;
    public long[] f19103c7;
    public boolean f19104c8;
    public final ConcurrentHashMap d;
    public int f19105d0;
    public final a0.h f19106d1;
    public boolean f19107d2;
    public int f19108d3;
    public ArrayList f19109d4;
    public int f19110d5;
    public float f19111d6;
    public int[][] f19112d7;
    public boolean f19113d8;
    public final ConcurrentHashMap e;
    public int f19114e0;
    public final ArrayList f19115e1;
    public boolean f19116e2;
    public final int f19117e3;
    public HashSet f19118e4;
    public int f19119e5;
    public boolean f19120e6;
    public final SharedPreferences e7;
    public final a0.h f19121e8;
    public final ConcurrentHashMap f19122f;
    public int f19123f0;
    public final ArrayList f19124f1;
    public boolean f19125f2;
    public final int f19126f3;
    public Set f19127f4;
    public long f19128f5;
    public Set f19129f6;
    public final SharedPreferences f7;
    public final HashSet f19130f8;
    public int f19131g0;
    public final ArrayList f19132g1;
    public boolean f19133g2;
    public int f19134g3;
    public Set f19135g4;
    public int f19136g5;
    public boolean f19137g6;
    public final SharedPreferences f19138g7;
    public final ak f19139g8;
    public final HashMap h;
    public th.e5 f19140h0;
    public long f19141h1;
    public boolean f19142h2;
    public int f19143h3;
    public String f19144h4;
    public int f19145h5;
    public boolean f19146h6;
    public volatile boolean f19147h7;
    public boolean f19148h8;
    public hw f19149i0;
    public long f19150i1;
    public boolean f19151i2;
    public int f19152i3;
    public HashMap f19153i4;
    public int f19154i5;
    public int f19155i6;
    public boolean f19156i7;
    public TLRPC.messages_AvailableEffects f19157i8;
    public b20 f19158j0;
    public long f19159j1;
    public boolean f19160j2;
    public int f19161j3;
    public HashMap f19162j4;
    public int f19163j5;
    public int f19164j6;
    public int f19165j7;
    public final vo f19166j8;
    public boolean f19167k0;
    public final a0.h f19168k1;
    public long f19169k2;
    public final int f19170k3;
    public boolean f19171k4;
    public int f19172k5;
    public int f19173k6;
    public boolean f19174k7;
    public boolean f19175k8;
    public long f19176l0;
    public final a0.h l1;
    public boolean f19177l2;
    public final int f19178l3;
    public int l4;
    public int f19179l5;
    public long f19180l6;
    public final ArrayList f19181l7;
    public ArrayList f19182l8;
    public i3 m0;
    public final a0.h f19183m1;
    public TLRPC.TL_messages_peerDialogs f19184m2;
    public int f19185m3;
    public int f19186m4;
    public int f19187m5;
    public Long f19188m6;
    public org.telegram.ui.a7 f19189m7;
    public long f19190m8;
    public final ArrayList f19191n;
    public long f19192n0;
    public final a0.h f19193n1;
    public TLRPC.messages_Dialogs f19194n2;
    public int f19195n3;
    public boolean f19196n4;
    public int f19197n5;
    public int f19198n6;
    public long f19199n7;
    public TL_account.contentSettings f19200n8;
    public long f19201o0;
    public VoIPDebugToSend f19202o1;
    public final SparseIntArray f19203o2;
    public int f19204o3;
    public int f19205o4;
    public int f19206o5;
    public int f19207o6;
    public long f19208o7;
    public boolean f19209o8;
    public long f19210p0;
    public final a0.h f19211p1;
    public ArrayList f19212p2;
    public int f19213p3;
    public int f19214p4;
    public int p5;
    public boolean f19215p6;
    public fo f19216p7;
    public final HashSet f19217p8;
    public long f19218q0;
    public final HashSet f19219q1;
    public TLRPC.WebPage f19220q2;
    public int f19221q3;
    public boolean f19222q4;
    public int f19223q5;
    public boolean q6;
    public final ConcurrentHashMap f19224q7;
    public final HashSet f19225q8;
    public final a0.h f19226r;
    public long f19227r0;
    public final LongSparseLongArray f19228r1;
    public int f19229r2;
    public int f19230r3;
    public mp f19231r4;
    public int f19232r5;
    public int f19233r6;
    public final y00 f19234r7;
    public final ak f19235r8;
    public final ArrayList f19236s;
    public boolean f19237s0;
    public final HashSet f19238s1;
    public boolean f19239s2;
    public String f19240s3;
    public mp f19241s4;
    public int f19242s5;
    public int f19243s6;
    public final y2 f19244s7;
    public final LongSparseArray f19245s8;
    public final a0.h f19246t0;
    public final HashSet f19247t1;
    public int f19248t2;
    public int f19249t3;
    public int f19250t4;
    public int f19251t5;
    public String f19252t6;
    public final u10 f19253t7;
    public final HashMap f19254t8;
    public final ArrayList f19255u0;
    public final HashSet f19256u1;
    public boolean f19257u2;
    public int f19258u3;
    public int f19259u4;
    public int f19260u5;
    public String f19261u6;
    public e f19262u7;
    public pp f19263u8;
    public final ArrayList f19264v0;
    public final HashSet f19265v1;
    public int f19266v2;
    public int f19267v3;
    public int f19268v4;
    public int f19269v5;
    public String f19270v6;
    public boolean f19271v7;
    public boolean f19272v8;
    public final SparseArray f19273w;
    public final ArrayList f19274w0;
    public final LongSparseLongArray f19275w1;
    public int f19276w2;
    public int f19277w3;
    public int f19278w4;
    public int f19279w5;
    public String f19280w6;
    public boolean f19281w7;
    public ArrayList f19282w8;
    public final a0.h f19283x;
    public final ArrayList f19284x0;
    public final a0.h f19285x1;
    public TLRPC.Dialog f19286x2;
    public int f19287x3;
    public int f19288x4;
    public int f19289x5;
    public int f19290x6;
    public boolean f19291x7;
    public TLRPC.EmojiGameInfo f19292x8;
    public final ArrayList f19293y;
    public final ArrayList f19294y0;
    public final LongSparseIntArray f19295y1;
    public boolean f19296y2;
    public boolean y3;
    public int f19297y4;
    public int f19298y5;
    public int f19299y6;
    public final s0 f19300y7;
    public final ak f19301y8;
    public final LongSparseIntArray f19302z0;
    public final SparseIntArray f19303z1;
    public long f19304z2;
    public boolean f19305z3;
    public int f19306z4;
    public int f19307z5;
    public int f19308z6;
    public boolean f19309z7;
    public TL_account.TL_webBrowserSettings f19310z8;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            G8[i10] = new Object();
        }
    }

    public wp(int i10) {
        super(i10);
        this.f19085b = new ConcurrentHashMap(100, 1.0f, 2);
        this.f19095c = new ConcurrentHashMap(10, 1.0f, 2);
        this.d = new ConcurrentHashMap(100, 1.0f, 3);
        this.e = new ConcurrentHashMap(100, 1.0f, 2);
        this.f19122f = new ConcurrentHashMap(3, 1.0f, 2);
        this.h = new HashMap();
        this.f19191n = new ArrayList();
        this.f19226r = new a0.h();
        this.f19236s = new ArrayList();
        this.f19273w = new SparseArray();
        this.f19283x = new a0.h();
        this.f19293y = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new bp[2];
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
        this.f19077a0 = new LongSparseIntArray();
        this.f19096c0 = new SparseArray();
        this.f19105d0 = 2;
        this.f19114e0 = 5;
        this.f19176l0 = 777000L;
        this.f19192n0 = 10L;
        this.f19201o0 = 7L;
        this.f19210p0 = 10L;
        this.f19218q0 = 4L;
        this.f19227r0 = 3L;
        this.f19246t0 = new a0.h();
        this.f19255u0 = new ArrayList();
        this.f19264v0 = new ArrayList();
        this.f19274w0 = new ArrayList();
        this.f19284x0 = new ArrayList();
        this.f19294y0 = new ArrayList();
        this.f19302z0 = new LongSparseIntArray();
        this.A0 = new a0.h();
        this.B0 = new LongSparseIntArray();
        this.C0 = new a0.h();
        this.D0 = new a0.h();
        this.E0 = new a0.h();
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
        this.f19078a1 = new a0.h();
        this.f19087b1 = new a0.h();
        this.f19097c1 = new a0.h();
        this.f19106d1 = new a0.h();
        this.f19115e1 = new ArrayList();
        this.f19124f1 = new ArrayList();
        this.f19132g1 = new ArrayList();
        this.f19168k1 = new a0.h();
        this.l1 = new a0.h();
        this.f19183m1 = new a0.h();
        this.f19193n1 = new a0.h();
        this.f19211p1 = new a0.h();
        this.f19219q1 = new HashSet();
        this.f19228r1 = new LongSparseLongArray();
        this.f19238s1 = new HashSet();
        this.f19247t1 = new HashSet();
        this.f19256u1 = new HashSet();
        this.f19265v1 = new HashSet();
        this.f19275w1 = new LongSparseLongArray();
        this.f19285x1 = new a0.h();
        this.f19295y1 = new LongSparseIntArray();
        this.f19303z1 = new SparseIntArray();
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
        this.a2 = new SparseBooleanArray();
        this.f19088b2 = new SparseBooleanArray();
        this.f19098c2 = new SparseBooleanArray();
        this.f19133g2 = true;
        this.f19203o2 = new SparseIntArray();
        this.f19212p2 = new ArrayList();
        this.H2 = new ag.f3(25);
        this.I2 = new ak(this, 6);
        this.O2 = new a0.h();
        this.P2 = new HashMap();
        this.T2 = new to(this);
        this.W2 = 100;
        this.f19109d4 = new ArrayList();
        this.f19153i4 = new HashMap();
        this.f19162j4 = new HashMap();
        new HashMap();
        this.P5 = false;
        this.f19129f6 = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.f19181l7 = arrayList;
        this.f19224q7 = new ConcurrentHashMap();
        s0 s0Var = new s0();
        this.f19300y7 = s0Var;
        this.C7 = new SparseArray();
        this.E7 = new Comparator(this) {
            public final wp f17614b;

            {
                this.f17614b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pl.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.F7 = new Comparator(this) {
            public final wp f17614b;

            {
                this.f17614b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pl.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.G7 = new Comparator(this) {
            public final wp f17614b;

            {
                this.f17614b = this;
            }

            @Override
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pl.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        this.H7 = new ck(this, 4);
        this.J7 = new ak(this, 4);
        this.K7 = new ak(this, 8);
        this.L7 = new a0.h();
        this.M7 = new a0.h();
        this.O7 = 1;
        this.P7 = 2;
        this.Q7 = 3;
        this.R7 = new ArrayList();
        this.S7 = new LongSparseIntArray();
        this.T7 = new LongSparseIntArray();
        this.U7 = new LongSparseIntArray();
        this.V7 = new a0.h();
        this.W7 = new HashSet();
        this.f19121e8 = new a0.h();
        this.f19130f8 = new HashSet();
        this.f19139g8 = new ak(this, 12);
        this.f19166j8 = new vo(this);
        this.f19217p8 = new HashSet();
        this.f19225q8 = new HashSet();
        this.f19235r8 = new ak(this, 13);
        this.f19245s8 = new LongSparseArray();
        this.f19254t8 = new HashMap();
        this.f19301y8 = new ak(this, 0);
        this.A8 = new wo(this);
        ic.D();
        getMessagesStorage();
        getLocationController();
        i0.g3(new ak(this, 2));
        k();
        if (this.currentAccount == 0) {
            this.e7 = w0.f18945b.getSharedPreferences("Notifications", 0);
            this.f7 = w0.f18945b.getSharedPreferences("mainconfig", 0);
            this.f19138g7 = w0.f18945b.getSharedPreferences("emoji", 0);
        } else {
            this.e7 = w0.f18945b.getSharedPreferences("Notifications" + this.currentAccount, 0);
            this.f7 = w0.f18945b.getSharedPreferences("mainconfig" + this.currentAccount, 0);
            this.f19138g7 = w0.f18945b.getSharedPreferences("emoji" + this.currentAccount, 0);
        }
        System.currentTimeMillis();
        this.f19171k4 = this.f7.getBoolean("remoteConfigLoaded", false);
        this.G2 = this.f7.getInt("secretWebpage2", 2);
        this.V2 = this.f7.getInt("maxGroupCount", 200);
        this.X2 = this.f7.getInt("maxMegagroupCount", 10000);
        this.f19126f3 = this.f7.getInt("maxRecentGifsCount", 200);
        this.f19108d3 = this.f7.getInt("maxRecentStickersCount", 30);
        this.f19117e3 = this.f7.getInt("maxFaveStickersCount", 5);
        this.Y2 = this.f7.getInt("maxEditTime", 3600);
        this.Z2 = this.f7.getInt("ratingDecay", 2419200);
        this.U2 = this.f7.getString("linkPrefix", "t.me");
        this.f19134g3 = this.f7.getInt("callReceiveTimeout", 20000);
        this.f19143h3 = this.f7.getInt("callRingTimeout", 90000);
        this.f19152i3 = this.f7.getInt("callConnectTimeout", 30000);
        this.f19161j3 = this.f7.getInt("callPacketTimeout", 10000);
        this.f19204o3 = this.f7.getInt("updateCheckDelay", 86400);
        this.f19170k3 = this.f7.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.f19178l3 = this.f7.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.f19249t3 = this.f7.getInt("maxMessageLength", 4096);
        this.f19258u3 = this.f7.getInt("maxCaptionLength", 1024);
        this.f19185m3 = this.f7.getInt("mapProvider", 0);
        this.f19195n3 = this.f7.getInt("availableMapProviders", 3);
        this.f19240s3 = this.f7.getString("pk", null);
        this.T3 = this.f7.getString("installReferer", null);
        this.f19079a3 = this.f7.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.f19089b3 = this.f7.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
        this.f19099c3 = this.f7.getBoolean("canRevokePmInbox", this.f19099c3);
        this.f19305z3 = this.f7.getBoolean("preloadFeaturedStickers", false);
        this.A3 = this.f7.getString("youtubePipType", "disabled");
        this.B3 = this.f7.getBoolean("keepAliveService", false);
        this.C3 = this.f7.getBoolean("backgroundConnection", false);
        this.f19304z2 = this.f7.getLong("proxy_dialog", 0L);
        this.f19248t2 = this.f7.getInt("nextPromoInfoCheckTime", 0);
        this.A2 = this.f7.getInt("promo_dialog_type", 0);
        this.B2 = this.f7.getString("promo_psa_message", null);
        this.C2 = this.f7.getString("promo_psa_type", null);
        this.D2 = this.f7.getString("proxyDialogAddress", null);
        this.K3 = this.f7.getString("venueSearchBot", "foursquare");
        this.L3 = this.f7.getString("storyVenueSearchBot", "foursquare");
        this.M3 = this.f7.getString("gifSearchBot", "gif");
        this.N3 = this.f7.getString("imageSearchBot", "pic");
        this.y3 = this.f7.getBoolean("blockedCountry", false);
        this.Q3 = this.f7.getString("suggestedLangCode", "en");
        this.D3 = this.f7.getFloat("animatedEmojisZoom", 0.625f);
        this.R3 = this.f7.getBoolean("qrLoginCamera", true);
        this.S3 = this.f7.getBoolean("saveGifsWithStickers", false);
        this.E3 = this.f7.getBoolean("filtersEnabled", false);
        this.F3 = this.f7.getBoolean("getfileExperimentalParams", false);
        this.G3 = this.f7.getBoolean("android_download_improvement_killswitch", false);
        this.H3 = this.f7.getBoolean("smsjobsStickyNotificationEnabled", false);
        this.J3 = this.f7.getBoolean("showFiltersTooltip", false);
        this.f19080a4 = this.f7.getBoolean("autoarchiveAvailable", false);
        this.f19090b4 = this.f7.getInt("groipCallVideoMaxParticipants", 30);
        this.f19213p3 = this.f7.getInt("chatReadMarkSizeThreshold", 100);
        this.f19221q3 = this.f7.getInt("chatReadMarkExpirePeriod", 604800);
        this.l4 = this.f7.getInt("ringtoneDurationMax", 5);
        this.f19186m4 = this.f7.getInt("ringtoneSizeMax", 102400);
        this.f19230r3 = this.f7.getInt("pmReadDateExpirePeriod", 604800);
        this.f19100c4 = this.f7.getBoolean("suggestStickersApiOnly", false);
        this.f19267v3 = this.f7.getInt("roundVideoSize", 384);
        this.f19277w3 = this.f7.getInt("roundVideoBitrate", 1000);
        this.f19287x3 = this.f7.getInt("roundAudioBitrate", 64);
        this.U3 = this.f7.getStringSet("pendingSuggestions", null);
        this.V3 = this.f7.getStringSet("dismissedSuggestions", null);
        this.E4 = this.f7.getInt("channelsLimitDefault", 500);
        this.F4 = this.f7.getInt("channelsLimitPremium", this.E4 * 2);
        this.G4 = this.f7.getInt("savedGifsLimitDefault", 200);
        this.H4 = this.f7.getInt("savedGifsLimitPremium", 400);
        this.I4 = this.f7.getInt("stickersFavedLimitDefault", 5);
        this.J4 = this.f7.getInt("stickersFavedLimitPremium", 200);
        this.K4 = this.f7.getInt("maxPinnedDialogsCountDefault", 5);
        this.L4 = this.f7.getInt("maxPinnedDialogsCountPremium", 5);
        this.K4 = this.f7.getInt("maxPinnedDialogsCountDefault", 5);
        this.L4 = this.f7.getInt("maxPinnedDialogsCountPremium", 5);
        this.M4 = this.f7.getInt("dialogFiltersLimitDefault", 10);
        this.N4 = this.f7.getInt("dialogFiltersLimitPremium", 20);
        this.O4 = this.f7.getInt("dialogFiltersChatsLimitDefault", 100);
        this.P4 = this.f7.getInt("dialogFiltersChatsLimitPremium", 200);
        this.Q4 = this.f7.getInt("dialogFiltersPinnedLimitDefault", 5);
        this.R4 = this.f7.getInt("dialogFiltersPinnedLimitPremium", 10);
        this.S4 = this.f7.getInt("publicLinksLimitDefault", 10);
        this.T4 = this.f7.getInt("publicLinksLimitPremium", 20);
        this.U4 = this.f7.getInt("captionLengthLimitDefault", 1024);
        this.V4 = this.f7.getInt("captionLengthLimitPremium", 4096);
        this.W4 = this.f7.getInt("storyCaptionLengthLimit", 200);
        this.X4 = this.f7.getInt("storyCaptionLengthLimitPremium", 2048);
        this.Y4 = this.f7.getInt("aboutLengthLimitDefault", 70);
        this.Z4 = this.f7.getInt("aboutLengthLimitPremium", 140);
        this.f19081a5 = this.f7.getInt("reactionsUserMaxDefault", 1);
        this.f19091b5 = this.f7.getInt("reactionsUserMaxPremium", 3);
        this.f19101c5 = this.f7.getInt("reactionsInChatMax", 3);
        this.f19233r6 = this.f7.getInt("uploadMaxFileParts", 4000);
        this.f19243s6 = this.f7.getInt("uploadMaxFilePartsPremium", this.f19233r6 * 2);
        this.f19261u6 = this.f7.getString("premiumInvoiceSlug", null);
        this.f19270v6 = this.f7.getString("verifyAgeBotUsername", null);
        this.f19280w6 = this.f7.getString("verifyAgeCountry", "GB");
        this.f19290x6 = this.f7.getInt("verifyAgeMin", 18);
        this.f19252t6 = this.f7.getString("premiumBotUsername", null);
        this.f19156i7 = this.f7.getBoolean("premiumLocked", false);
        this.f19174k7 = this.f7.getBoolean("starsLocked", true);
        this.f19165j7 = this.f7.getInt("transcribeButtonPressed", 0);
        this.f19110d5 = this.f7.getInt("forumUpgradeParticipantsMin", 200);
        this.f19119e5 = this.f7.getInt("topicsPinnedLimit", 3);
        this.f19128f5 = this.f7.getLong("telegramAntispamUserId", -1L);
        this.f19136g5 = this.f7.getInt("telegramAntispamGroupSizeMin", 100);
        this.f19145h5 = this.f7.getInt("hiddenMembersGroupSizeMin", 100);
        this.f19154i5 = this.f7.getInt("chatlistUpdatePeriod", 3600);
        this.f19271v7 = this.f7.getBoolean("uploadMarkupVideo", true);
        this.f19281w7 = this.f7.getBoolean("giftAttachMenuIcon", false);
        this.f19291x7 = this.f7.getBoolean("giftTextFieldIcon", false);
        this.A7 = this.f7.getInt("checkResetLangpack", 0);
        this.f19114e0 = this.f7.getInt("smallQueueMaxActiveOperations", 5);
        this.f19105d0 = this.f7.getInt("largeQueueMaxActiveOperations", 2);
        this.f19123f0 = this.f7.getInt("stories_stealth_future_period", 1500);
        this.f19176l0 = this.f7.getLong("stories_changelog_user_id", 777000L);
        this.f19192n0 = this.f7.getLong("giveaway_add_peers_max", 10L);
        this.f19210p0 = this.f7.getLong("giveaway_countries_max", 10L);
        this.f19218q0 = this.f7.getLong("giveaway_boosts_per_premium", 4L);
        this.f19227r0 = this.f7.getLong("boosts_per_sent_gift", 3L);
        this.f19201o0 = this.f7.getLong("giveaway_period_max", 7L);
        this.f7.getInt("stories_stealth_past_period", 300);
        this.f19131g0 = this.f7.getInt("stories_stealth_cooldown_period", 3600);
        boolean z10 = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        this.f19299y6 = this.f7.getInt("chatlistInvitesLimitDefault", 3);
        this.f19163j5 = this.f7.getInt("storyExpiringLimitDefault", 50);
        this.f19172k5 = this.f7.getInt("storyExpiringLimitPremium", 100);
        this.f19179l5 = this.f7.getInt("storiesSentWeeklyLimitDefault", 7);
        this.p5 = this.f7.getInt("storiesSuggestedReactionsLimitDefault", 1);
        this.f19223q5 = this.f7.getInt("storiesSuggestedReactionsLimitPremium", 5);
        this.f19187m5 = this.f7.getInt("storiesSentWeeklyLimitPremium", 70);
        this.f19197n5 = this.f7.getInt("storiesSentMonthlyLimitDefault", 30);
        this.f19206o5 = this.f7.getInt("storiesSentMonthlyLimitPremium", 300);
        this.f19232r5 = this.f7.getInt("channelBgIconLevelMin", 1);
        this.f19242s5 = this.f7.getInt("channelProfileIconLevelMin", 1);
        this.f19251t5 = this.f7.getInt("channelEmojiStatusLevelMin", 1);
        this.f19279w5 = this.f7.getInt("groupProfileBgIconLevelMin", 1);
        this.f19289x5 = this.f7.getInt("groupEmojiStatusLevelMin", 1);
        this.f19298y5 = this.f7.getInt("groupEmojiStickersLevelMin", 1);
        this.f19307z5 = this.f7.getInt("groupWallpaperLevelMin", 1);
        this.A5 = this.f7.getInt("groupCustomWallpaperLevelMin", 1);
        this.B5 = this.f7.getInt("groupTranscribeLevelMin", 1);
        this.C5 = this.f7.getInt("quickRepliesLimit", 10);
        this.f19260u5 = this.f7.getInt("channelWallpaperLevelMin", 1);
        this.f19269v5 = this.f7.getInt("channelCustomWallpaperLevelMin", 1);
        this.f19308z6 = this.f7.getInt("chatlistInvitesLimitPremium", z10 ? 5 : 20);
        this.A6 = this.f7.getInt("chatlistJoinedLimitDefault", 2);
        this.B6 = this.f7.getInt("chatlistJoinedLimitPremium", z10 ? 5 : 20);
        this.E6 = this.f7.getInt("stargiftsMessageLengthMax", 255);
        this.F6 = this.f7.getInt("stargiftsConvertPeriodMax", z10 ? 300 : 7776000);
        this.G6 = this.f7.getBoolean("videoIgnoreAltDocuments", false);
        this.H6 = this.f7.getBoolean("disableBotFullscreenBlur", false);
        this.I6 = this.f7.getString("tonBlockchainExplorerUrl", "https://tonviewer.com/");
        this.J6 = this.f7.getLong("starsPaidMessageAmountMax", 10000L);
        this.K6 = this.f7.getInt("starsPaidMessageCommissionPermille", 850);
        this.L6 = this.f7.getInt("stargiftsPinnedToTopLimit", 6);
        this.M6 = this.f7.getBoolean("starsPaidMessagesAvailable", true);
        this.N6 = this.f7.getLong("freezeSinceDate", 0L);
        this.O6 = this.f7.getLong("freezeUntilDate", 0L);
        this.Q6 = this.f7.getInt("conferenceCallSizeLimit", z10 ? 5 : 100);
        this.R6 = this.f7.getBoolean("callRequestsDisabled", false);
        this.S6 = this.f7.getInt("todoItemsMax", z10 ? 10 : 30);
        this.T6 = this.f7.getInt("todoTitleLengthMax", 32);
        this.U6 = this.f7.getInt("todoItemLengthMax", 64);
        this.V6 = this.f7.getString("translationsManualEnabled", "enabled");
        this.W6 = this.f7.getString("translationsAutoEnabled", "enabled");
        this.X6 = (HashSet) Collection.EL.stream(this.f7.getStringSet("whitelistedBots", new HashSet())).map(new k2.f(1)).collect(Collectors.toCollection(new rk(0)));
        this.Z6 = this.f7.getInt("starsGroupcallMessageAmountMax", 10000);
        this.Y6 = th.o.d(this.f7.getString("starsGroupcallMessageLimits", null));
        this.P6 = this.f7.getString("freezeAppealUrl", "t.me/spambot");
        this.f19309z7 = this.f7.getBoolean("enableGiftsInProfile", true);
        this.C6 = this.f7.getString("storiesPosting", "enabled");
        this.D6 = this.f7.getString("storiesEntities", "premium");
        this.f19196n4 = this.f7.getBoolean("storiesExportNopublicLink", false);
        this.f19205o4 = this.f7.getInt("authorization_autoconfirm_period", 604800);
        this.f19214p4 = this.f7.getInt("quoteLengthMax", 1024);
        this.f19222q4 = this.f7.getBoolean("giveawayGiftsPurchaseAvailable", false);
        this.f19231r4 = mp.b(0, this.f7.getString("peerColors", ""));
        this.f19241s4 = mp.b(1, this.f7.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.f7;
        boolean z11 = v2.f18578a;
        this.f19250t4 = sharedPreferences.getInt("transcribeAudioTrialWeeklyNumber", 0);
        this.f19278w4 = this.f7.getInt("transcribeAudioTrialCurrentNumber", this.f19250t4);
        this.f19259u4 = this.f7.getInt("transcribeAudioTrialDurationMax", 300);
        this.f19268v4 = this.f7.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.f19288x4 = this.f7.getInt("recommendedChannelsLimitDefault", 10);
        this.f19297y4 = this.f7.getInt("recommendedChannelsLimitPremium", 100);
        this.f19306z4 = this.f7.getInt("boostsChannelLevelMax", 100);
        this.A4 = this.f7.getInt("channelRestrictSponsoredLevelMin", 30);
        this.B4 = this.f7.getInt("channelAutotranslationLevelMin", 3);
        this.f19198n6 = this.f7.getInt("savedDialogsPinnedLimitDefault", 4);
        this.f19207o6 = this.f7.getInt("savedDialogsPinnedLimitPremium", 6);
        this.q6 = this.f7.getBoolean("storyQualityFull", true);
        this.f19215p6 = this.f7.getBoolean("savedViewAsChats", false);
        this.B7 = this.f7.getBoolean("folderTags", false);
        this.D5 = this.f7.getFloat("uploadPremiumSpeedupUpload", 10.0f);
        this.E5 = this.f7.getFloat("uploadPremiumSpeedupDownload", 10.0f);
        this.F5 = this.f7.getInt("uploadPremiumSpeedupNotifyPeriod2", 3600);
        this.G5 = this.f7.getInt("introTitleLengthLimit", 32);
        this.H5 = this.f7.getInt("introDescriptionLengthLimit", 72);
        this.I5 = this.f7.getInt("businessChatLinksLimit", 100);
        this.J5 = this.f7.getBoolean("channelRevenueWithdrawalEnabled", false);
        this.K5 = this.f7.getBoolean("newNoncontactPeersRequirePremiumWithoutOwnpremium", false);
        this.L5 = this.f7.getInt("reactionsUniqMax", 11);
        SharedPreferences sharedPreferences2 = this.f7;
        w0.u();
        this.M5 = sharedPreferences2.getString("premiumManageSubscriptionUrl", "https://play.google.com/store/account/subscriptions?sku=telegram_premium&package=org.telegram.messenger");
        this.N5 = this.f7.getBoolean("androidDisableRoundCamera2", true);
        this.O5 = this.f7.getInt("storiesPinnedToTopCountMax", 3);
        this.P5 = this.f7.getBoolean("showAnnualPerMonth", false);
        this.Q5 = this.f7.getBoolean("canEditFactcheck", false);
        this.R5 = this.f7.getInt("factcheckLengthLimit", 1024);
        this.S5 = this.f7.getLong("starsRevenueWithdrawalMin", 1000L);
        this.T5 = this.f7.getLong("starsPaidPostAmountMax", 10000L);
        this.U5 = this.f7.getInt("botPreviewMediasMax", 10);
        this.C4 = this.f7.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.D4 = this.f7.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.V5 = this.f7.getString("tonProxyAddress", "magic.org");
        this.W5 = this.f7.getString("weatherSearchUsername", "izweatherbot");
        this.X5 = this.f7.getBoolean("storyWeatherPreload", true);
        this.Y5 = this.f7.getBoolean("starsGiftsEnabled", true);
        this.Z5 = this.f7.getBoolean("stargiftsBlocked", true);
        this.f19082a6 = this.f7.getLong("starsPaidReactionAmountMax", 10000L);
        this.f19092b6 = this.f7.getLong("starsSubscriptionAmountMax", 2500L);
        this.f19102c6 = this.f7.getFloat("starsUsdSellRate1000", 2000.0f);
        this.f19111d6 = this.f7.getFloat("starsUsdWithdrawRate1000", 1200.0f);
        this.f19120e6 = this.f7.getBoolean("sponsoredLinksInappAllow", false);
        this.f19137g6 = this.f7.getBoolean("starrefProgramAllowed", false);
        this.f19146h6 = this.f7.getBoolean("starrefConnectAllowed", false);
        this.f19129f6 = this.f7.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.f19155i6 = this.f7.getInt("starrefMinCommissionPermille", 1);
        this.f19164j6 = this.f7.getInt("starrefMaxCommissionPermille", 400);
        this.f19173k6 = this.f7.getInt("botVerificationDescriptionLengthLimit", 70);
        this.f19180l6 = this.f7.getLong("paidReactionsAnonymousTime", 0L);
        this.f19083a7 = this.f7.getLong("tonStakeddiceStakeAmountMin", 100000000L);
        this.f19093b7 = this.f7.getLong("tonStakeddiceStakeAmountMax", 50000000000L);
        this.f19103c7 = DesugarArrays.stream(this.f7.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new vk(0)).toArray();
        this.f19112d7 = (int[][]) DesugarArrays.stream(this.f7.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new k2.f(2)).toArray(new dl(0));
        s0Var.b(this.f7);
        System.currentTimeMillis();
        this.f19188m6 = null;
        if (System.currentTimeMillis() - this.f19180l6 < 7200000) {
            if (this.f7.contains("paidReactionsDialogId")) {
                this.f19188m6 = Long.valueOf(this.f7.getLong("paidReactionsDialogId", 0L));
            } else {
                this.f19188m6 = Long.valueOf(this.f7.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        i0.g3(new ak(this, 3));
        v2.h = this.f7.getString("googleAuthClientId", v2.h);
        if (this.f7.contains("dcDomainName2")) {
            this.O3 = this.f7.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.O3 = z10 ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.f7.contains("webFileDatacenterId")) {
            this.P3 = this.f7.getInt("webFileDatacenterId", 4);
        } else {
            this.P3 = z10 ? 2 : 4;
        }
        Set<String> stringSet = this.f7.getStringSet("directPaymentsCurrency", null);
        if (stringSet != null) {
            arrayList.clear();
            arrayList.addAll(stringSet);
        }
        SparseIntArray sparseIntArray = this.N0;
        String string = this.f7.getString("premiumFeaturesTypesToPosition", null);
        sparseIntArray.clear();
        if (string != null) {
            String[] split = string.split("_");
            for (int i11 = 0; i11 < split.length; i11++) {
                sparseIntArray.put(Integer.parseInt(split[i11]), i11);
            }
        }
        SparseIntArray sparseIntArray2 = this.O0;
        String string2 = this.f7.getString("businessFeaturesTypesToPosition", null);
        sparseIntArray2.clear();
        if (string2 != null) {
            String[] split2 = string2.split("_");
            for (int i12 = 0; i12 < split2.length; i12++) {
                sparseIntArray2.put(Integer.parseInt(split2[i12]), i12);
            }
        }
        if (this.U3 != null) {
            this.U3 = new HashSet(this.U3);
        } else {
            this.U3 = new HashSet();
        }
        if (this.V3 != null) {
            this.V3 = new HashSet(this.V3);
        } else {
            this.V3 = new HashSet();
        }
        Set<String> stringSet2 = this.f7.getStringSet("exportUri2", null);
        this.X3 = stringSet2;
        if (stringSet2 != null) {
            this.X3 = new HashSet(this.X3);
        } else {
            HashSet hashSet = new HashSet();
            this.X3 = hashSet;
            hashSet.add("content://(\\d+@)?com\\.whatsapp\\.provider\\.media/export_chat/");
            this.X3.add("content://(\\d+@)?com\\.whatsapp\\.w4b\\.provider\\.media/export_chat/");
            this.X3.add("content://jp\\.naver\\.line\\.android\\.line\\.common\\.FileProvider/export-chat/");
            this.X3.add(".*WhatsApp.*\\.txt$");
            this.X3.add(".*WhatsApp.*\\.zip$");
        }
        Set<String> stringSet3 = this.f7.getStringSet("exportGroupUri", null);
        this.Y3 = stringSet3;
        if (stringSet3 != null) {
            this.Y3 = new HashSet(this.Y3);
        } else {
            HashSet hashSet2 = new HashSet();
            this.Y3 = hashSet2;
            hashSet2.add("@g.us/");
        }
        Set<String> stringSet4 = this.f7.getStringSet("exportPrivateUri", null);
        this.Z3 = stringSet4;
        if (stringSet4 != null) {
            this.Z3 = new HashSet(this.Z3);
        } else {
            HashSet hashSet3 = new HashSet();
            this.Z3 = hashSet3;
            hashSet3.add("@s.whatsapp.net/");
        }
        Set<String> stringSet5 = this.f7.getStringSet("autologinDomains", null);
        this.f19127f4 = stringSet5;
        if (stringSet5 != null) {
            this.f19127f4 = new HashSet(this.f19127f4);
        } else {
            this.f19127f4 = new HashSet();
        }
        Set<String> stringSet6 = this.f7.getStringSet("authDomains", null);
        this.f19135g4 = stringSet6;
        if (stringSet6 != null) {
            this.f19135g4 = new HashSet(this.f19135g4);
        } else {
            this.f19135g4 = new HashSet();
        }
        this.f19144h4 = this.f7.getString("autologinToken", null);
        Set<String> stringSet7 = this.f7.getStringSet("diceEmojies", null);
        if (stringSet7 == null) {
            HashSet hashSet4 = new HashSet();
            this.f19118e4 = hashSet4;
            hashSet4.add("🎲");
            this.f19118e4.add("🎯");
        } else {
            this.f19118e4 = new HashSet(stringSet7);
        }
        String string3 = this.f7.getString("diceSuccess", null);
        if (string3 == null) {
            this.f19153i4.put("🎯", new fp(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string3, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    boolean z12 = true;
                    int readInt32 = serializedData.readInt32(true);
                    int i13 = 0;
                    while (i13 < readInt32) {
                        this.f19153i4.put(serializedData.readString(z12), new fp(serializedData.readInt32(z12), serializedData.readInt32(z12)));
                        i13++;
                        z12 = true;
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                f8.f(e);
            }
        }
        String string4 = this.f7.getString("emojiSounds", null);
        if (string4 != null) {
            try {
                byte[] decode2 = Base64.decode(string4, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    boolean z13 = true;
                    int readInt322 = serializedData2.readInt32(true);
                    int i14 = 0;
                    while (i14 < readInt322) {
                        this.f19162j4.put(serializedData2.readString(z13), new gp(serializedData2.readInt64(z13), serializedData2.readInt64(z13), serializedData2.readByteArray(z13)));
                        i14++;
                        z13 = true;
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e7) {
                f8.f(e7);
            }
        }
        String string5 = this.f7.getString("gifSearchEmojies", null);
        if (string5 == null) {
            this.f19109d4.add("👍");
            this.f19109d4.add("👎");
            this.f19109d4.add("😍");
            this.f19109d4.add("😂");
            this.f19109d4.add("😮");
            this.f19109d4.add("🙄");
            this.f19109d4.add("😥");
            this.f19109d4.add("😡");
            this.f19109d4.add("🥳");
            this.f19109d4.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string5, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    int readInt323 = serializedData3.readInt32(true);
                    for (int i15 = 0; i15 < readInt323; i15++) {
                        this.f19109d4.add(serializedData3.readString(true));
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e10) {
                f8.f(e10);
            }
        }
        i0.h3(new ak(this, 4), 2000L);
        i0.h3(new ak(this, 0), 2000L);
        i0.h3(new ak(this, 5), 400L);
        this.f19234r7 = new y00(i10);
        this.f19244s7 = new y2(i10);
        this.f19253t7 = new u10(this);
        Utilities.e.c(new ak(this, 7));
    }

    public static boolean A2(TLRPC.User user) {
        if (user != null && user.premium && !E2(user)) {
            return true;
        }
        return false;
    }

    public static boolean E2(TLRPC.User user) {
        if (user != null) {
            if (!user.support) {
                long j10 = user.f19943id;
                if (j10 == 777000 || j10 == 333000 || j10 == 4240000 || j10 == 4244000 || j10 == 4245000 || j10 == 4246000 || j10 == 410000 || j10 == 420000 || j10 == 431000 || j10 == 431415000 || j10 == 434000 || j10 == 4243000 || j10 == 439000 || j10 == 449000 || j10 == 450000 || j10 == 452000 || j10 == 454000 || j10 == 4254000 || j10 == 455000 || j10 == 460000 || j10 == 470000 || j10 == 479000 || j10 == 796000 || j10 == 482000 || j10 == 490000 || j10 == 496000 || j10 == 497000 || j10 == 498000 || j10 == 4298000) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean I2(TLRPC.UserFull userFull) {
        if (userFull != null) {
            if (!userFull.noforwards_peer_enabled && !userFull.noforwards_my_enabled) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void O4(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var != null && k2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), k2Var.getResourceProvider());
            String L0 = dd.L0(2131751455, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            HashMap hashMap = new HashMap();
            int i10 = org.telegram.ui.ActionBar.t6.L5;
            hashMap.put("info1", Integer.valueOf(k2Var.getThemedColor(i10)));
            hashMap.put("info2", Integer.valueOf(k2Var.getThemedColor(i10)));
            alertDialog$Builder.m(2131624105, 52, k2Var.getThemedColor(i10), hashMap);
            x1Var.W = true;
            alertDialog$Builder.k(dd.L0(2131752041, null), null);
            x1Var.T = str;
            k2Var.showDialog(x1Var);
        }
    }

    public static long P1(org.telegram.tgnet.TLRPC.Reaction r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.P1(org.telegram.tgnet.TLRPC$Reaction):long");
    }

    public static long U1(TLRPC.Update update) {
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
        if (v2.f18578a) {
            f8.d("trying to get unknown update channel_id for " + update);
            return 0L;
        }
        return 0L;
    }

    public static int V1(TLRPC.Update update) {
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

    public static int W1(TLRPC.Update update) {
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

    public static TLRPC.InputMedia W4(TLRPC.MessageMedia messageMedia) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaDocument.f19855id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.f19806id = document.f19800id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputMediaPhoto.f19857id = tL_inputPhoto;
            TLRPC.Photo photo = messageMedia.photo;
            tL_inputPhoto.f19813id = photo.f19818id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            return tL_inputMediaPhoto;
        } else {
            return null;
        }
    }

    public static int X1(TLRPC.Update update) {
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

    public static String a(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new dl(1)).collect(Collectors.joining(","));
    }

    public static String b2(TLRPC.User user) {
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            return i0.D2(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            return i0.D2(user.last_name);
        }
        return "";
    }

    public static SharedPreferences c1() {
        return r1(0).f19138g7;
    }

    public static SharedPreferences d1() {
        return r1(0).f7;
    }

    public static SharedPreferences e1() {
        return r1(0).e7;
    }

    public static TLRPC.TL_wallPaperSettings f2(org.telegram.ui.ActionBar.m6 m6Var) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = m6Var.f20594i;
        tL_wallPaperSettings.motion = m6Var.f20595j;
        int i10 = m6Var.d;
        if (i10 != 0) {
            tL_wallPaperSettings.background_color = i10 & 16777215;
            int i11 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (m6Var.f20596k * 100.0f);
            tL_wallPaperSettings.flags = i11 | 9;
        } else {
            float f7 = m6Var.f20596k;
            if (f7 > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f7 * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i12 = m6Var.e;
        if (i12 != 0) {
            tL_wallPaperSettings.second_background_color = i12 & 16777215;
            tL_wallPaperSettings.rotation = i0.s1(m6Var.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i13 = m6Var.f20592f;
        if (i13 != 0) {
            tL_wallPaperSettings.third_background_color = i13 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i14 = m6Var.f20593g;
        if (i14 != 0) {
            tL_wallPaperSettings.fourth_background_color = i14 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static boolean g2(String str, ArrayList arrayList) {
        String lowerCase = str.toLowerCase();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String lowerCase2 = ((TL_account.WebDomainException) arrayList.get(i10)).domain.toLowerCase();
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

    public static TLRPC.InputChannel h1(TLRPC.Chat chat) {
        if (w3.T(chat)) {
            if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                tL_inputChannelFromMessage.channel_id = chat.f19794id;
                tL_inputChannelFromMessage.peer = r1(e20.f15506s0).i1(chat.fromMessageDialogId);
                tL_inputChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputChannelFromMessage;
            }
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.f19794id;
            tL_inputChannel.access_hash = chat.access_hash;
            return tL_inputChannel;
        }
        return new TLRPC.TL_inputChannelEmpty();
    }

    public static TLRPC.InputPeer j1(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return m1((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return k1((TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static TLRPC.InputPeer k1(TLRPC.Chat chat) {
        if (w3.T(chat)) {
            if (chat != null && chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = chat.f19794id;
                tL_inputPeerChannelFromMessage.peer = r1(e20.f15506s0).i1(chat.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.f19794id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
        tL_inputPeerChat.chat_id = chat.f19794id;
        return tL_inputPeerChat;
    }

    public static void m0(ArrayList arrayList, TL_account.WebDomainException webDomainException) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            if (TL_account.WebDomainException.equalsByDomain((TL_account.WebDomainException) arrayList.get(i10), webDomainException)) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
    }

    public static TLRPC.InputPeer m1(TLRPC.User user) {
        if (user != null && user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = user.f19943id;
            tL_inputPeerUserFromMessage.peer = r1(e20.f15506s0).i1(user.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.f19943id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.TL_emojiStatusCollectible q0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.f20022id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.f19800id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.f19800id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public static TLRPC.InputWallPaper q1(org.telegram.ui.ActionBar.m6 m6Var) {
        if (m6Var.f20597l > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.f19866id = m6Var.f20597l;
            tL_inputWallPaper.access_hash = m6Var.f20598m;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = m6Var.f20591c;
        return tL_inputWallPaperSlug;
    }

    public static wp r1(int i10) {
        wp wpVar;
        wp wpVar2 = F8[i10];
        if (wpVar2 == null) {
            synchronized (G8[i10]) {
                try {
                    wpVar = F8[i10];
                    if (wpVar == null) {
                        wp[] wpVarArr = F8;
                        wp wpVar3 = new wp(i10);
                        wpVarArr[i10] = wpVar3;
                        wpVar = wpVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return wpVar;
        }
        return wpVar2;
    }

    public static int s3(ArrayList arrayList) {
        TLRPC.Message message;
        int i10;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; arrayList != null && i12 < arrayList.size(); i12++) {
            kj kjVar = (kj) arrayList.get(i12);
            if (kjVar != null && (message = kjVar.f16690k) != null && (i10 = message.date) > i11) {
                i11 = i10;
            }
        }
        return i11;
    }

    public static boolean t0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.f19800id == messageMedia2.document.f19800id) {
                return true;
            }
            return false;
        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.f19818id == messageMedia2.photo.f19818id) {
            return true;
        } else {
            return false;
        }
    }

    public static void u0(long j10, TLObject tLObject, ArrayList arrayList) {
        int i10 = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i10 < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    if (o5.o(message.from_id) == user.f19943id) {
                        user.fromMessageDialogId = j10;
                        user.fromMessageId = message.f19815id;
                        return;
                    }
                    i10++;
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat.access_hash == 0 && chat.fromMessageDialogId == 0 && arrayList != null) {
                while (i10 < arrayList.size()) {
                    TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i10);
                    if (o5.o(message2.from_id) == (-chat.f19794id)) {
                        chat.fromMessageDialogId = j10;
                        chat.fromMessageId = message2.f19815id;
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    public static SharedPreferences w1(int i10) {
        return r1(i10).e7;
    }

    public static ArrayList y0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                arrayList.add((TLRPC.Update) cls.cast(updates.update));
            }
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update = updates.updates.get(i10);
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
                int i10 = 0;
                while (i10 < updates.updates.size()) {
                    if (cls.isInstance(updates.updates.get(i10))) {
                        arrayList.add((TLRPC.Update) cls.cast(updates.updates.remove(i10)));
                        i10--;
                    }
                    i10++;
                }
            }
        }
        return arrayList;
    }

    public final void A() {
        org.telegram.ui.ActionBar.m6 m6Var = this.R2;
        if (m6Var != null) {
            if (m6Var.f20604s != null) {
                for (int i10 = 0; i10 < this.R2.f20604s.size(); i10++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) this.R2.f20604s.get(i10)).intValue(), true);
                }
            }
            b8.G(this.currentAccount).b(this.Q2, false);
            long j10 = this.R2.f20599n;
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 != 0) {
                if (i11 >= 0) {
                    TLRPC.UserFull a2 = a2(j10);
                    if (a2 != null) {
                        a2.wallpaper = this.R2.f20605t;
                        at.f(this.currentAccount).k(at.E0, Long.valueOf(this.R2.f20599n), a2);
                    }
                } else {
                    TLRPC.ChatFull M0 = M0(-j10);
                    if (M0 != null) {
                        M0.wallpaper = this.R2.f20605t;
                        at f7 = at.f(this.currentAccount);
                        Boolean bool = Boolean.FALSE;
                        f7.k(at.T, M0, 0, bool, bool);
                    }
                }
            }
            this.R2 = null;
            this.Q2 = null;
        }
    }

    public final void A0() {
        is messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i10 = messagesStorage.f16342w;
        is messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i11 = messagesStorage2.f16340r;
        is messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        int i12 = messagesStorage3.f16339n;
        is messagesStorage4 = getMessagesStorage();
        messagesStorage4.H();
        n4(true, i10, i11, i12, messagesStorage4.f16341s);
        pt notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        pt.f17637k0.c(new bt(notificationsController, 10));
    }

    public final String A1(long j10, boolean z10) {
        String str;
        if (j10 >= 0) {
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (z10) {
                return i0.F2(i0.D2(i20.j(Z1, true)));
            }
            return i0.F2(i0.D2(i20.p(Z1)));
        }
        TLRPC.Chat L0 = L0(Long.valueOf(-j10));
        if (L0 == null) {
            str = "";
        } else {
            str = L0.title;
        }
        return i0.F2(i0.D2(str));
    }

    public final boolean A3() {
        if (this.f19156i7 && !getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final void A4(int i10, long j10) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i10;
        tL_channels_setBoostsToUnblockRestrictions.channel = g1(j10);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new tj(this, j10, 15));
    }

    public final void B(long j10, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, org.telegram.ui.yy yyVar) {
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
                int i10 = tL_inputChatUploadedPhoto.flags;
                tL_inputChatUploadedPhoto.video_start_ts = d;
                tL_inputChatUploadedPhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_inputChatUploadedPhoto.video_emoji_markup = videoSize;
                tL_inputChatUploadedPhoto.flags |= 8;
            }
            inputChatPhoto = tL_inputChatUploadedPhoto;
        }
        if (w3.S(this.currentAccount, j10)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = g1(j10);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j10;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new om(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j10, yyVar), 64);
    }

    public final void B0(long j10, boolean z10) {
        TLRPC.Chat L0 = L0(Long.valueOf(j10));
        if (L0 != null && w3.S(this.currentAccount, j10)) {
            if ((!w3.r0(L0) || z10) && !L0.creator && !w3.p0(L0)) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.flags = 256;
                int j11 = getUserConfig().j();
                tL_messageService.f19815id = j11;
                tL_messageService.local_id = j11;
                if ((L0 instanceof TLRPC.TL_channel) && !z10) {
                    tL_messageService.date = L0.date;
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
                arrayList.add(new kj(this.currentAccount, tL_messageService, true, false));
                getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                i0.g3(new pk(this, j10, arrayList, 3));
            }
        }
    }

    public final TLRPC.PeerSettings B1(long j10) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull a2 = a2(j10);
        if (a2 != null && (peerSettings = a2.settings) != null) {
            return peerSettings;
        }
        return (TLRPC.PeerSettings) this.f19211p1.f(j10);
    }

    public final boolean B2(long j10, boolean z10) {
        TLRPC.Dialog dialog = this.f19286x2;
        if (dialog != null && dialog.f19798id == j10) {
            if (!z10 || this.f19296y2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B3() {
        int i10 = this.f19165j7;
        if (i10 < 2) {
            this.f19165j7 = i10 + 1;
            SharedPreferences sharedPreferences = this.f7;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.f19165j7).apply();
            }
        }
    }

    public final void B4(int i10, long j10) {
        SharedPreferences.Editor edit = this.f7.edit();
        edit.putInt("chatPendingRequests" + j10, i10).apply();
    }

    public final void C(long j10, String str, yh.g gVar) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (w3.S(this.currentAccount, j10)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = g1(j10);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j10;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new v4(7, this, gVar), 64);
    }

    public final String C0(long j10, long j11) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j10 == j11) {
            return "";
        }
        a0.h hVar = (a0.h) this.f19285x1.f(j10);
        if (hVar != null && (channelParticipant2 = (TLRPC.ChannelParticipant) hVar.f(j11)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return dd.L0(2131752207, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return dd.L0(2131752208, null);
            }
        }
        TLRPC.ChatFull M0 = M0(j10);
        if (M0 != null && M0.participants != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= M0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i10);
                if (chatParticipant.user_id == j11) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return dd.L0(2131752207, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return dd.L0(2131752208, null);
                    }
                } else {
                    i10++;
                }
            }
        }
        return null;
    }

    public final CharSequence C1(long j10, long j11, boolean z10) {
        a0.h hVar;
        TLRPC.User Z1;
        TLRPC.UserStatus userStatus;
        if ((z10 && o5.E(j10) && (Z1 = Z1(Long.valueOf(j10))) != null && (userStatus = Z1.status) != null && userStatus.expires < 0) || (hVar = (a0.h) this.W.f(j10)) == null) {
            return null;
        }
        return (CharSequence) hVar.f(j11);
    }

    public final boolean C2(int i10, long j10, boolean z10) {
        Boolean bool = (Boolean) this.f19254t8.get(j10 + "_" + i10);
        if (bool != null && bool.booleanValue() == z10) {
            return true;
        }
        return false;
    }

    public final void C3(int i10, long j10) {
        LongSparseLongArray longSparseLongArray;
        boolean z10;
        a0.h hVar = this.W0;
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (arrayList != null) {
            LongSparseIntArray longSparseIntArray = this.Y0;
            int i11 = longSparseIntArray.get(j10);
            if (!arrayList.isEmpty() && i11 != 0) {
                Collections.sort(arrayList, new ck(0));
                if (i10 == 2) {
                    longSparseIntArray.put(j10, ((TLRPC.Updates) arrayList.get(0)).pts);
                }
                boolean z11 = false;
                while (true) {
                    int size = arrayList.size();
                    longSparseLongArray = this.X0;
                    if (size <= 0) {
                        break;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) arrayList.get(0);
                    int i12 = updates.pts;
                    if (i12 <= i11) {
                        z10 = true;
                    } else if (updates.pts_count + i11 == i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        L3(updates, true);
                        if (arrayList.size() <= 0) {
                            break;
                        }
                        arrayList.remove(0);
                        z11 = true;
                    } else if (z10) {
                        long j11 = longSparseLongArray.get(j10);
                        if (j11 != 0 && (z11 || Math.abs(System.currentTimeMillis() - j11) <= 1500)) {
                            if (v2.f18578a) {
                                f8.b("HOLE IN CHANNEL " + j10 + " UPDATES QUEUE - will wait more time");
                            }
                            if (z11) {
                                longSparseLongArray.put(j10, System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (v2.f18578a) {
                            f8.b("HOLE IN CHANNEL " + j10 + " UPDATES QUEUE - getChannelDifference ");
                        }
                        longSparseLongArray.delete(j10);
                        hVar.l(j10);
                        H0(j10);
                        return;
                    } else if (arrayList.size() <= 0) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
                hVar.l(j10);
                longSparseLongArray.delete(j10);
                if (v2.f18578a) {
                    f8.b("UPDATES CHANNEL " + j10 + " QUEUE PROCEED - OK");
                    return;
                }
                return;
            }
            hVar.l(j10);
        }
    }

    public final void C4(boolean z10) {
        TL_account.contentSettings contentsettings = this.f19200n8;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            }
            contentsettings.sensitive_enabled = z10;
        }
        if (this.D4 == null) {
            this.D4 = new HashSet();
        }
        if (z10) {
            this.D4.add("sensitive");
        } else {
            this.D4.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.f7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.D4).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z10;
        getConnectionsManager().sendRequest(setcontentsettings, new ag.c3(7));
    }

    public final void D() {
        if (!this.f19167k0 && O1().h.isEmpty()) {
            f4(1);
        } else {
            boolean[] zArr = {false};
            r0(1, zArr);
            if (zArr[0]) {
                Q4(null);
                getNotificationCenter().k(at.f14779s, new Object[0]);
            }
        }
        getNotificationCenter().k(at.f14772r, 0);
    }

    public final int D0() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f19273w;
            if (i10 < sparseArray.size()) {
                List list = (List) sparseArray.get(sparseArray.keyAt(i10));
                if (list != null) {
                    i11 = list.size() + i11;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final Integer D1(long j10, long j11) {
        a0.h hVar = (a0.h) this.X.f(j10);
        if (hVar == null) {
            return null;
        }
        return (Integer) hVar.f(j11);
    }

    public final boolean D2() {
        TLRPC.UserFull a2 = a2(getUserConfig().e());
        if (a2 == null) {
            return false;
        }
        return !a2.sponsored_enabled;
    }

    public final boolean D3(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || o5.o(message.peer_id) != getUserConfig().e() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long R1 = kj.R1(getUserConfig().e(), message);
        boolean z10 = false;
        for (int i10 = 0; i10 < message.reactions.results.size(); i10++) {
            if (p5(R1, sg.o0.d(message.reactions.results.get(i10).reaction), false)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void D4(final long j10, int i10, ArrayList arrayList, int i11, Boolean bool, final sg.i iVar, final sg.h hVar) {
        final TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = i1(-j10);
        if (i10 != 2 && !arrayList.isEmpty()) {
            if (i10 == 0) {
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
        tL_messages_setChatAvailableReactions.reactions_limit = i11;
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                wp wpVar = wp.this;
                wpVar.getClass();
                if (tLObject != null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    long j11 = j10;
                    TLRPC.ChatFull M0 = wpVar.M0(j11);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= 1073741824;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        wpVar.getMessagesStorage().N1(M0, false);
                    }
                    i0.g3(new cn(wpVar, hVar, j11));
                    return;
                }
                i0.g3(new pi(20, iVar, tL_error));
            }
        });
        TLRPC.ChatFull M0 = M0(j10);
        if (M0 != null) {
            if (M0 instanceof TLRPC.TL_channelFull) {
                M0.flags2 |= 8192;
            } else {
                M0.flags |= 1048576;
            }
            M0.reactions_limit = i11;
            if (bool != null) {
                M0.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().N1(M0, false);
        }
    }

    public final boolean E(Bundle bundle, final org.telegram.ui.ActionBar.k2 k2Var, kj kjVar, org.telegram.ui.bj bjVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String E1;
        org.telegram.ui.ActionBar.x1 x1Var;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (k2Var != null) {
            long j10 = bundle.getLong("user_id", 0L);
            long j11 = bundle.getLong("chat_id", 0L);
            int i10 = bundle.getInt("message_id", 0);
            if (j10 != 0) {
                user = Z1(Long.valueOf(j10));
                chat = null;
            } else if (j11 != 0) {
                chat = L0(Long.valueOf(j11));
                user = null;
            } else {
                user = null;
                chat = null;
            }
            if (user != null || chat != null) {
                if (chat != null) {
                    E1 = E1(chat.restriction_reason);
                } else {
                    E1 = E1(user.restriction_reason);
                }
                if (E1 != null) {
                    O4(E1, k2Var);
                    return false;
                } else if (i10 != 0 && kjVar != null && chat != null && chat.access_hash == 0) {
                    long B0 = kj.B0(kjVar.f16690k);
                    if (!o5.C(B0)) {
                        if (bjVar != null) {
                            bjVar.d();
                            x1Var = null;
                        } else {
                            x1Var = new org.telegram.ui.ActionBar.x1(3, k2Var.getParentActivity(), null);
                        }
                        int i11 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
                        if (i11 < 0) {
                            chat = L0(Long.valueOf(-B0));
                        }
                        if (i11 <= 0 && w3.T(chat)) {
                            TLRPC.Chat L0 = L0(Long.valueOf(-B0));
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = h1(L0);
                            tL_channels_getMessages.f19832id.add(Integer.valueOf(kjVar.f1()));
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.f19890id.add(Integer.valueOf(kjVar.f1()));
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        final int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new lo(this, x1Var, bjVar, k2Var, bundle, 1));
                        if (x1Var != null) {
                            x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                @Override
                                public final void onCancel(DialogInterface dialogInterface) {
                                    wp.this.getConnectionsManager().cancelRequest(sendRequest, true);
                                    k2Var.setVisibleDialog(null);
                                }
                            });
                            k2Var.setVisibleDialog(x1Var);
                            x1Var.show();
                            return false;
                        }
                        bjVar.f7486b = new o7(this, sendRequest, k2Var, 15);
                        bjVar.d();
                        return false;
                    }
                    return true;
                } else if (i10 != 0 && kjVar != null && bjVar != null) {
                    bjVar.d();
                    bjVar.f7486b = s0(-j11, i10, new li.k(bjVar, k2Var, bundle, 16));
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
        if (!this.f19148h8) {
            this.f19148h8 = true;
            this.f19166j8.c(this.currentAccount, 0, new no(this, 0));
        }
        return this.f19157i8;
    }

    public final String E1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i10);
                Set set = this.D4;
                if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason)) {
                    if (!"all".equals(restrictionReason.platform)) {
                        if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                            w0.u();
                            if (!v2.a()) {
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

    public final void E3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        i0.g3(new lg(this, longSparseIntArray, longSparseIntArray2, 8));
    }

    public final void E4(final long j10, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z10, final org.telegram.ui.ActionBar.k2 k2Var) {
        if (tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = i1(-j10);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new a3.b(1), new k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                wp wpVar = wp.this;
                if (tL_error == null) {
                    wpVar.getClass();
                    i0.h3(new xk(wpVar, j10, 18), 1000L);
                    return;
                }
                org.telegram.ui.Components.s4.e0(wpVar.currentAccount, tL_error, k2Var, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z10));
            }
        });
    }

    public final void F(long j10, String str) {
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
        int i10 = at.U;
        switch (c10) {
            case 0:
                getNotificationCenter().k(i10, Long.valueOf(j10), 2);
                return;
            case 1:
                getNotificationCenter().k(i10, Long.valueOf(j10), 0);
                return;
            case 2:
                getNotificationCenter().k(i10, Long.valueOf(j10), 1);
                return;
            default:
                return;
        }
    }

    public final void F0(boolean z10) {
        int size;
        int i10;
        if (getUserConfig().p() && !this.F0) {
            this.F0 = true;
            TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
            if (z10) {
                size = 0;
            } else {
                size = this.G0.size();
            }
            tL_contacts_getBlocked.offset = size;
            if (z10) {
                i10 = 20;
            } else {
                i10 = 100;
            }
            tL_contacts_getBlocked.limit = i10;
            getConnectionsManager().sendRequest(tL_contacts_getBlocked, new q3(this, z10, tL_contacts_getBlocked, 3));
        }
    }

    public final hw F1() {
        hw hwVar = this.f19149i0;
        if (hwVar != null) {
            return hwVar;
        }
        synchronized (G8[this.currentAccount]) {
            try {
                hw hwVar2 = this.f19149i0;
                if (hwVar2 != null) {
                    return hwVar2;
                }
                hw hwVar3 = new hw(this.currentAccount);
                this.f19149i0 = hwVar3;
                return hwVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean F2() {
        return !"disabled".equals(this.W6);
    }

    public final void F3(long j10, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        a0.h hVar = new a0.h(tL_channels_channelParticipants.participants.size());
        for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
            hVar.k(channelParticipant, kj.C1(channelParticipant.peer));
        }
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new d4(messagesStorage, j10, hVar, 24));
        i0.g3(new rg(this, j10, hVar, false));
    }

    public final void F4(int i10, long j10) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = i1(j10);
        tL_messages_setHistoryTTL.period = i10;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new uj(this, 2));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j10);
        if (dialog != null) {
            dialog.ttl_period = i10;
        }
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new hq(messagesStorage, i10, j10, 0));
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.ChatFull chatFull = null;
        if (i11 > 0) {
            userFull = a2(j10);
            if (userFull != null) {
                userFull.ttl_period = i10;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull M0 = M0(-j10);
            if (M0 != null) {
                M0.ttl_period = i10;
                if (M0 instanceof TLRPC.TL_channelFull) {
                    M0.flags |= 16777216;
                } else {
                    M0.flags |= 16384;
                }
            }
            chatFull = M0;
            userFull = null;
        }
        if (chatFull != null) {
            at notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(at.T, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(at.E0, Long.valueOf(j10), userFull);
        }
    }

    public final void G(long j10, boolean z10) {
        TLRPC.Chat L0 = L0(Long.valueOf(j10));
        if (w3.T(L0) && !L0.creator) {
            a0.h hVar = this.f19078a1;
            if (hVar.h(j10) < 0) {
                if (w3.p0(L0)) {
                    z10 = false;
                }
                boolean z11 = z10;
                hVar.k(Boolean.TRUE, j10);
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = g1(j10);
                tL_channels_getParticipant.participant = i1(getUserConfig().e());
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new il(this, L0, z11, j10));
            }
        }
    }

    public final i3 G0() {
        i3 i3Var = this.m0;
        if (i3Var != null) {
            return i3Var;
        }
        synchronized (G8[this.currentAccount]) {
            try {
                i3 i3Var2 = this.m0;
                if (i3Var2 != null) {
                    return i3Var2;
                }
                i3 i3Var3 = new i3(this.currentAccount);
                this.m0 = i3Var3;
                return i3Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final pp G1() {
        if (this.f19263u8 == null) {
            this.f19263u8 = new pp(this.currentAccount);
        }
        return this.f19263u8;
    }

    public final boolean G2() {
        return !"disabled".equals(this.V6);
    }

    public final void G3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i10, final int i11, final int i12, final int i13, final boolean z10, final boolean z11, final boolean z12) {
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.em.run():void");
            }
        });
    }

    public final void G4(long j10, long j11) {
        this.f7.edit().putLong(a1.g.l(j10, "forumlasttopic"), j11).apply();
    }

    public final void H(int i10, boolean z10) {
        if (i10 >= 0) {
            SparseArray sparseArray = this.f19096c0;
            yo yoVar = (yo) sparseArray.get(i10);
            if (yoVar != 0) {
                if (!yoVar.f19606a) {
                    if (System.currentTimeMillis() - yoVar.f19607b <= this.f19154i5 * 1000 && !z10) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (yoVar == 0) {
                yoVar = new Object();
                yoVar.f19606a = true;
                sparseArray.put(i10, yoVar);
            }
            yoVar.f19606a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i10;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new go(this, i10, yoVar, 4));
        }
    }

    public final void H0(long j10) {
        I0(j10, 0, 0L, null);
    }

    public final TLRPC.TL_messages_savedReactionsTags H1(long j10, boolean z10) {
        HashSet hashSet = this.f19084a8;
        if (hashSet != null && hashSet.contains(Long.valueOf(j10)) && !z10) {
            a0.h hVar = this.f19094b8;
            if (hVar == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) hVar.f(j10);
        }
        if (this.f19084a8 == null) {
            this.f19084a8 = new HashSet();
        }
        this.f19084a8.add(Long.valueOf(j10));
        getMessagesStorage().f16331a.c(new xk(this, j10, 7));
        return null;
    }

    public final TL_account.RequirementToContact H2(long j10) {
        if (!getUserConfig().q() && getUserConfig().e() != j10) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.f19121e8.f(j10);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (Z1 == null || Z1.contact_require_premium || Z1.send_paid_messages_stars != 0) {
                TLRPC.UserFull a2 = a2(j10);
                if (a2 != null) {
                    return i20.o(a2);
                }
                n1(j10);
                this.f19130f8.add(Long.valueOf(j10));
                ak akVar = this.f19139g8;
                i0.r(akVar);
                i0.h3(akVar, 60L);
            }
        }
        return null;
    }

    public final void H3(final org.telegram.tgnet.TLRPC.messages_Messages r51, final int r52, long r53, final long r55, final int r57, final int r58, final int r59, final boolean r60, final int r61, final int r62, final int r63, final int r64, final int r65, final int r66, final boolean r67, final int r68, long r69, final int r71, final boolean r72, final int r73, final boolean r74, final boolean r75, final org.telegram.messenger.m00 r76) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.H3(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.m00):void");
    }

    public final void H4(long j10, boolean z10, boolean z11) {
        if (!z10) {
            ArrayList arrayList = this.f19274w0;
            if (z11) {
                if (arrayList.contains(Long.valueOf(j10))) {
                    return;
                }
                arrayList.add(Long.valueOf(j10));
            } else {
                arrayList.remove(Long.valueOf(j10));
                SparseArray sparseArray = (SparseArray) this.K0.f(j10);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((kj) sparseArray.valueAt(i10)).f16725t0 = false;
                    }
                }
            }
        }
        Utilities.d.c(new jo(this, z10, z11, j10, 0));
    }

    public final boolean I(boolean z10) {
        a0.h hVar;
        int i10;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.V1 == null && this.W1 == null) || (!z10 && ((i10 = this.U1) == 0 || i10 > currentTime))) {
            return false;
        }
        this.U1 = 0;
        if (this.X1 != null && !z10) {
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
        i0.g3(new yj(this, hVar, hVar2, 0));
        return true;
    }

    public final void I0(long r18, int r20, long r21, org.telegram.tgnet.TLRPC.InputChannel r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.I0(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public final void I1() {
        H1(0L, false);
    }

    public final void I3(int i10, int i11, long j10) {
        if (v2.f18578a) {
            i0.a.q(j10, i0.a.m("processNewChannelDifferenceParams pts = ", i10, " pts_count = ", i11, " channeldId = "));
        }
        LongSparseIntArray longSparseIntArray = this.Y0;
        int i12 = longSparseIntArray.get(j10);
        if (i12 == 0) {
            i12 = getMessagesStorage().N(j10);
            if (i12 == 0) {
                i12 = 1;
            }
            longSparseIntArray.put(j10, i12);
        }
        if (i12 + i11 == i10) {
            if (v2.f18578a) {
                f8.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j10, i10);
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new hq(messagesStorage, i10, j10, 5));
        } else if (i12 != i10) {
            LongSparseLongArray longSparseLongArray = this.X0;
            long j11 = longSparseLongArray.get(j10);
            if (!((Boolean) this.Z0.g(Boolean.FALSE, j10)).booleanValue() && j11 != 0 && Math.abs(System.currentTimeMillis() - j11) > 1500) {
                H0(j10);
                return;
            }
            if (v2.f18578a) {
                f8.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i10 + " pts_count = " + i11);
            }
            if (j11 == 0) {
                longSparseLongArray.put(j10, System.currentTimeMillis());
            }
            TLRPC.Updates updates = new TLRPC.Updates();
            updates.pts = i10;
            updates.pts_count = i11;
            updates.chat_id = j10;
            a0.h hVar = this.W0;
            ArrayList arrayList = (ArrayList) hVar.f(j10);
            if (arrayList == null) {
                arrayList = m5.i(hVar, j10);
            }
            arrayList.add(updates);
        }
    }

    public final void I4(long j10, boolean z10, boolean z11) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.f19294y0;
        } else {
            arrayList = this.f19284x0;
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

    public final void J(int i10) {
        if (i10 == 0) {
            return;
        }
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new zp(messagesStorage, i10, 4));
    }

    public final void J0(TLRPC.Chat chat, TLRPC.User user, r20 r20Var) {
        if (chat != null) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = g1(chat.f19794id);
            tL_channels_getParticipant.participant = m1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new f3(r20Var, 1));
            return;
        }
        r20Var.a(null);
    }

    public final java.lang.String J1(org.telegram.tgnet.TLRPC.Reaction r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.J1(org.telegram.tgnet.TLRPC$Reaction):java.lang.String");
    }

    public final boolean J2(boolean z10) {
        ArrayList<TL_account.WebDomainException> arrayList;
        int i10;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
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
            i10 = 5;
        } else {
            i10 = 100;
        }
        if (size < i10) {
            return false;
        }
        return true;
    }

    public final void J3(int i10, int i11, int i12) {
        if (v2.f18578a) {
            i0.a.p(i12, i0.a.m("processNewDifferenceParams seq = -1 pts = ", i10, " date = ", i11, " pts_count = "));
        }
        if (i10 != -1) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.H();
            if (messagesStorage.f16340r + i12 == i10) {
                if (v2.f18578a) {
                    f8.b("APPLY PTS");
                }
                getMessagesStorage().I1(i10);
                is messagesStorage2 = getMessagesStorage();
                is messagesStorage3 = getMessagesStorage();
                messagesStorage3.H();
                int i13 = messagesStorage3.f16342w;
                is messagesStorage4 = getMessagesStorage();
                messagesStorage4.H();
                int i14 = messagesStorage4.f16340r;
                is messagesStorage5 = getMessagesStorage();
                messagesStorage5.H();
                int i15 = messagesStorage5.f16339n;
                is messagesStorage6 = getMessagesStorage();
                messagesStorage6.H();
                messagesStorage2.A1(i13, i14, i15, messagesStorage6.f16341s);
                return;
            }
            is messagesStorage7 = getMessagesStorage();
            messagesStorage7.H();
            if (messagesStorage7.f16340r != i10) {
                if (!this.f19125f2 && this.f19150i1 != 0 && Math.abs(System.currentTimeMillis() - this.f19150i1) > 1500) {
                    W0();
                    return;
                }
                if (v2.f18578a) {
                    f8.b("ADD UPDATE TO QUEUE pts = " + i10 + " pts_count = " + i12);
                }
                if (this.f19150i1 == 0) {
                    this.f19150i1 = System.currentTimeMillis();
                }
                TLRPC.Updates updates = new TLRPC.Updates();
                updates.pts = i10;
                updates.pts_count = i12;
                this.f19124f1.add(updates);
            }
        }
    }

    public final void J4(final long j10, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z10, final org.telegram.ui.ActionBar.k2 k2Var, final org.telegram.ui.h0 h0Var) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = g1(j10);
        if (user != null) {
            tL_channels_editBanned.participant = m1(user);
        } else {
            tL_channels_editBanned.participant = k1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                wp wpVar = wp.this;
                if (tL_error == null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new xk(wpVar, j10, 16), 1000L);
                    Runnable runnable = h0Var;
                    if (runnable != null) {
                        i0.g3(runnable);
                        return;
                    }
                    return;
                }
                i0.g3(new sn(wpVar, tL_error, k2Var, tL_channels_editBanned, z10, 0));
            }
        });
    }

    public final void K(boolean z10, TLRPC.Chat chat, TLRPC.User user, jp jpVar) {
        TLRPC.ChatFull M0;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatParticipant chatParticipant2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        ArrayList<TLRPC.ChatParticipant> arrayList2;
        boolean z11 = false;
        if (chat != null) {
            if (!chat.megagroup && !w3.T(chat)) {
                TLRPC.ChatFull M02 = M0(chat.f19794id);
                if (M02 != null) {
                    TLRPC.ChatParticipants chatParticipants = M02.participants;
                    if (chatParticipants != null && (arrayList2 = chatParticipants.participants) != null) {
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            chatParticipant2 = M02.participants.participants.get(i10);
                            if (chatParticipant2 != null && chatParticipant2.user_id == user.f19943id) {
                                break;
                            }
                        }
                    }
                    chatParticipant2 = null;
                    if (chatParticipant2 != null) {
                        z11 = true;
                    }
                    TLRPC.ChatParticipants chatParticipants2 = M02.participants;
                    if (chatParticipants2 != null && chatParticipants2.admin_id == user.f19943id) {
                        tL_chatAdminRights2 = org.telegram.ui.iq.t0(true);
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    jpVar.a(z11, tL_chatAdminRights2, null);
                    return;
                }
                jpVar.a(false, null, null);
                return;
            }
            if (z10 && (M0 = M0(chat.f19794id)) != null) {
                TLRPC.ChatParticipants chatParticipants3 = M0.participants;
                if (chatParticipants3 != null && (arrayList = chatParticipants3.participants) != null) {
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        chatParticipant = M0.participants.participants.get(i11);
                        if (chatParticipant != null && chatParticipant.user_id == user.f19943id) {
                            break;
                        }
                    }
                }
                chatParticipant = null;
                if (chatParticipant != null) {
                    TLRPC.ChatParticipants chatParticipants4 = M0.participants;
                    if (chatParticipants4 != null && chatParticipants4.admin_id == user.f19943id) {
                        tL_chatAdminRights = org.telegram.ui.iq.t0(true);
                    } else {
                        tL_chatAdminRights = null;
                    }
                    jpVar.a(true, tL_chatAdminRights, null);
                    return;
                }
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = g1(chat.f19794id);
            tL_channels_getParticipant.participant = m1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new v1(jpVar, 4));
            return;
        }
        jpVar.a(false, null, null);
    }

    public final xo K0(long j10) {
        xo xoVar;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.Z7 == null) {
            this.Z7 = new HashMap();
        }
        boolean q6 = getUserConfig().q();
        if (this.Z7.containsKey(Long.valueOf(j10))) {
            xoVar = (xo) this.Z7.get(Long.valueOf(j10));
            if (xoVar == null || xoVar.f19459a == q6) {
                return xoVar;
            }
        } else {
            xoVar = null;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = n1(j10);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (i10 != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = g1(-j10);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.Z7.put(Long.valueOf(j10), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new rf(this, q6, j10, 1));
        return xoVar;
    }

    public final TLRPC.TL_channels_sendAsPeers K1(long j10) {
        return L1(j10, false);
    }

    public final boolean K2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
        if (tL_webBrowserSettings != null && !tL_webBrowserSettings.open_external_browser) {
            return true;
        }
        return false;
    }

    public final boolean K3(java.util.ArrayList r100, final java.util.ArrayList r101, final java.util.ArrayList r102, boolean r103, final int r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.K3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void K4(boolean z10) {
        if (this.f19215p6 != z10) {
            SharedPreferences.Editor edit = this.f7.edit();
            this.f19215p6 = z10;
            edit.putBoolean("savedViewAsChats", z10).apply();
        }
    }

    public final void L(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j10) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (!o5.C(dialog.f19798id)) {
            long j11 = dialog.f19798id;
            a0.h hVar = this.f19106d1;
            if (hVar.h(j11) < 0) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                if (inputPeer == null) {
                    inputPeer = i1(dialog.f19798id);
                }
                tL_messages_getHistory.peer = inputPeer;
                tL_messages_getHistory.limit = 1;
                hVar.k(Boolean.TRUE, dialog.f19798id);
                if (v2.f18578a) {
                    i0.a.q(dialog.f19798id, new StringBuilder("checkLastDialogMessage for "));
                }
                if (j10 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tL_messages_getHistory.peer.getObjectSize() + 60);
                    } catch (Exception e) {
                        nativeByteBuffer = null;
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(14);
                        nativeByteBuffer.writeInt64(dialog.f19798id);
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
                    } catch (Exception e7) {
                        exc = e7;
                        f8.g(exc, true);
                        j10 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getHistory, new rj(this, dialog, j10, 9));
                    }
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getHistory, new rj(this, dialog, j10, 9));
            }
        }
    }

    public final TLRPC.Chat L0(Long l4) {
        return (TLRPC.Chat) this.f19085b.get(l4);
    }

    public final TLRPC.TL_channels_sendAsPeers L1(long j10, boolean z10) {
        a0.h hVar;
        TLRPC.Chat L0;
        if (z10) {
            hVar = this.C1;
        } else {
            hVar = this.B1;
        }
        a0.h hVar2 = hVar;
        rp rpVar = (rp) hVar2.f(j10);
        if (rpVar != null) {
            return rpVar.f17956a;
        }
        if (!z10 && ((L0 = L0(Long.valueOf(-j10))) == null || !w3.k(L0))) {
            return null;
        }
        ?? obj = new Object();
        hVar2.k(obj, j10);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = i1(j10);
        tL_channels_getSendAs.for_live_stories = z10;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new b4(this, hVar2, j10, (rp) obj, z10));
        return null;
    }

    public final boolean L2(String str) {
        boolean g22;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
        if (tL_webBrowserSettings != null && str != null) {
            String K0 = i0.K0(str, false);
            if (K0 == null) {
                K0 = i0.K0("//".concat(str), false);
            }
            if (tL_webBrowserSettings.open_external_browser) {
                g22 = !g2(K0, tL_webBrowserSettings.inapp_exceptions);
            } else {
                g22 = g2(K0, tL_webBrowserSettings.external_exceptions);
            }
            if (!g22) {
                return true;
            }
        }
        return false;
    }

    public final void L3(org.telegram.tgnet.TLRPC.Updates r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.L3(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public final void L4(int i10, long j10) {
        if (i10 == 0) {
            this.f19141h1 = j10;
        } else if (i10 == 1) {
            this.f19150i1 = j10;
        } else if (i10 == 2) {
            this.f19159j1 = j10;
        }
    }

    public final void M(boolean z10) {
        int i10;
        mp mpVar;
        int i11;
        if (getUserConfig().f() != null) {
            if (!this.f19104c8 && ((mpVar = this.f19231r4) == null || mpVar.g() || z10)) {
                this.f19104c8 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                mp mpVar2 = this.f19231r4;
                if (mpVar2 != null) {
                    i11 = mpVar2.f17165b;
                } else {
                    i11 = 0;
                }
                tL_help_getPeerColors.hash = i11;
                if (mpVar2 != null && mpVar2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new uj(this, 22));
            }
            if (!this.f19113d8) {
                mp mpVar3 = this.f19241s4;
                if (mpVar3 == null || mpVar3.g() || z10) {
                    this.f19113d8 = true;
                    TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                    mp mpVar4 = this.f19241s4;
                    if (mpVar4 != null) {
                        i10 = mpVar4.f17165b;
                    } else {
                        i10 = 0;
                    }
                    tL_help_getPeerProfileColors.hash = i10;
                    if (mpVar4 != null && mpVar4.g()) {
                        tL_help_getPeerProfileColors.hash = 0;
                    }
                    getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new uj(this, 23));
                }
            }
        }
    }

    public final TLRPC.ChatFull M0(long j10) {
        return (TLRPC.ChatFull) this.l1.f(j10);
    }

    public final long M1(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            if (j10 == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull a2 = a2(j10);
            if (a2 != null) {
                return a2.send_paid_messages_stars;
            }
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (Z1 != null && Z1.send_paid_messages_stars > 0) {
                return o5.k(H2(Z1.f19943id));
            }
        } else if (i10 < 0) {
            long j11 = -j10;
            TLRPC.Chat L0 = L0(Long.valueOf(j11));
            if (w3.N(L0)) {
                return 0L;
            }
            if (w3.p0(L0) && w3.A(this.currentAccount, L0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull M0 = M0(j11);
            if (M0 != null) {
                return M0.send_paid_messages_stars;
            }
            if (L0 != null) {
                return L0.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public final boolean M2() {
        if (!K2()) {
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
            if (tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void M3(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.M3(int, int):void");
    }

    public final void M4(final long j10, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z10, final org.telegram.ui.ActionBar.k2 k2Var, boolean z11, boolean z12, String str2, final Runnable runnable, final hp hpVar) {
        if (user != null && tL_chatAdminRights != null) {
            final TLRPC.Chat L0 = L0(Long.valueOf(j10));
            final boolean Y = w3.Y(L0);
            boolean z13 = true;
            if (w3.T(L0)) {
                final TLRPC.TL_channels_editAdmin tL_channels_editAdmin = new TLRPC.TL_channels_editAdmin();
                tL_channels_editAdmin.channel = h1(L0);
                tL_channels_editAdmin.user_id = p1(user);
                tL_channels_editAdmin.admin_rights = tL_chatAdminRights;
                if (!TextUtils.isEmpty(str)) {
                    tL_channels_editAdmin.flags |= 1;
                    tL_channels_editAdmin.rank = str;
                }
                RequestDelegate requestDelegate = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        wp wpVar = wp.this;
                        if (tL_error == null) {
                            wpVar.L3((TLRPC.Updates) tLObject, false);
                            i0.h3(new cn(wpVar, j10, runnable, 0), 1000L);
                            return;
                        }
                        boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                        hp hpVar2 = hpVar;
                        if (equals) {
                            TLRPC.Chat chat = L0;
                            if (!w3.Y(chat) && w3.y(3, chat)) {
                                i0.g3(new dn(wpVar, user, chat, hpVar2, tL_error, 0));
                                return;
                            }
                        }
                        i0.g3(new en(wpVar, tL_error, k2Var, tL_channels_editAdmin, z10, Y));
                        if (hpVar2 != null) {
                            i0.g3(new fn(hpVar2, tL_error, 0));
                        }
                    }
                };
                if (!user.bot && z11) {
                    m(j10, user, 0, str2, k2Var, true, new lg(this, tL_channels_editAdmin, requestDelegate, 10), hpVar, null);
                    return;
                } else {
                    getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                    return;
                }
            }
            TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
            tL_messages_editChatAdmin.chat_id = j10;
            tL_messages_editChatAdmin.user_id = p1(user);
            if (!z12 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
                z13 = false;
            }
            boolean z14 = z13;
            tL_messages_editChatAdmin.is_admin = z14;
            wm wmVar = new wm(this, j10, runnable, k2Var, tL_messages_editChatAdmin, hpVar);
            if (!z14 && !z11 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tL_messages_editChatAdmin, wmVar);
            } else {
                m(j10, user, 0, str2, k2Var, true, new lg(this, tL_messages_editChatAdmin, wmVar, 11), hpVar, null);
            }
        }
    }

    public final void N(boolean z10) {
        String str;
        boolean z11 = false;
        if (z10 && this.f19257u2) {
            this.f19257u2 = false;
        }
        if ((z10 || this.f19248t2 <= getConnectionsManager().getCurrentTime()) && !this.f19257u2) {
            if (this.f19266v2 != 0) {
                getConnectionsManager().cancelRequest(this.f19266v2, true);
                this.f19266v2 = 0;
            }
            SharedPreferences d12 = d1();
            d12.getBoolean("proxy_enabled", false);
            String string = d12.getString("proxy_ip", "");
            String string2 = d12.getString("proxy_secret", "");
            if (this.f19304z2 != 0 && this.A2 == 0 && (str = this.D2) != null) {
                if (!str.equals(string + string2)) {
                    z11 = true;
                }
            }
            int i10 = this.f19276w2 + 1;
            this.f19276w2 = i10;
            this.f19257u2 = true;
            this.f19266v2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new bh(this, i10, string, string2, 1));
            if (z11) {
                this.f19304z2 = 0L;
                this.D2 = null;
                this.f19248t2 = getConnectionsManager().getCurrentTime() + 3600;
                d1().edit().putLong("proxy_dialog", this.f19304z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.f19248t2).commit();
                i0.g3(new fo(this, 8));
            }
        }
    }

    public final int N0(long j10) {
        TLRPC.ChatFull M0 = r1(this.currentAccount).M0(-j10);
        if (M0 != null && (!(M0 instanceof TLRPC.TL_chatFull) ? (M0.flags2 & 8192) != 0 : (M0.flags & 1048576) != 0)) {
            return M0.reactions_limit;
        }
        return this.L5;
    }

    public final sp N1(long j10) {
        a0.h hVar = this.A1;
        sp spVar = (sp) hVar.f(j10);
        if (spVar != null && (spVar.d || Math.abs(SystemClock.elapsedRealtime() - spVar.f18127c) <= 300000)) {
            return spVar;
        }
        if (j10 >= 0 ? !i20.t(Z1(Long.valueOf(j10))) : !w3.T(L0(Long.valueOf(-j10)))) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        hVar.k(obj, j10);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = i1(j10);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new rj(this, j10, (Object) obj, 0));
        return null;
    }

    public final void N2(int r64, java.util.ArrayList r65, java.util.ArrayList r66, java.util.ArrayList r67, java.util.ArrayList r68, a0.h r69, int r70, org.telegram.messenger.support.LongSparseIntArray r71, a0.h r72, a0.h r73, java.util.ArrayList r74, a0.h r75, a0.h r76, rf.r r77, a0.h r78, boolean r79, java.util.ArrayList r80, java.util.ArrayList r81, a0.h r82, a0.h r83, a0.h r84, java.util.ArrayList r85) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.N2(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, a0.h, int, org.telegram.messenger.support.LongSparseIntArray, a0.h, a0.h, java.util.ArrayList, a0.h, a0.h, rf.r, a0.h, boolean, java.util.ArrayList, java.util.ArrayList, a0.h, a0.h, a0.h, java.util.ArrayList):void");
    }

    public final void N3(TLRPC.Chat chat, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (chat != null) {
            Long valueOf = Long.valueOf(chat.f19794id);
            ConcurrentHashMap concurrentHashMap = this.f19085b;
            TLRPC.Chat chat2 = (TLRPC.Chat) concurrentHashMap.get(valueOf);
            if (chat2 != chat) {
                ConcurrentHashMap concurrentHashMap2 = this.e;
                if (chat2 != null && !TextUtils.isEmpty(chat2.username)) {
                    concurrentHashMap2.remove(chat2.username.toLowerCase());
                }
                if (chat2 != null && chat2.usernames != null) {
                    for (int i15 = 0; i15 < chat2.usernames.size(); i15++) {
                        TLRPC.TL_username tL_username = chat2.usernames.get(i15);
                        if (tL_username != null && !TextUtils.isEmpty(tL_username.username)) {
                            concurrentHashMap2.remove(tL_username.username.toLowerCase());
                        }
                    }
                }
                if (!TextUtils.isEmpty(chat.username)) {
                    concurrentHashMap2.put(chat.username.toLowerCase(), chat);
                }
                if (chat.usernames != null) {
                    for (int i16 = 0; i16 < chat.usernames.size(); i16++) {
                        TLRPC.TL_username tL_username2 = chat.usernames.get(i16);
                        if (tL_username2 != null && !TextUtils.isEmpty(tL_username2.username) && tL_username2.active) {
                            concurrentHashMap2.put(tL_username2.username.toLowerCase(), chat);
                        }
                    }
                }
                g5(-chat.f19794id, chat.emoji_status);
                if (chat2 != null && chat2.access_hash == 0) {
                    long j10 = chat.fromMessageDialogId;
                    if (j10 != 0 && (i14 = chat.fromMessageId) != 0) {
                        chat2.fromMessageDialogId = j10;
                        chat2.fromMessageId = i14;
                    }
                }
                if (chat.min) {
                    if (chat2 != null) {
                        if (!z10) {
                            LruCache lruCache = c2().f16003b;
                            String str = chat2.username;
                            if (str != null && !TextUtils.equals(str, chat.username)) {
                                lruCache.remove(chat2.username);
                                String str2 = chat.username;
                                if (str2 != null) {
                                    lruCache.put(str2, new g20(-chat.f19794id));
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
                            int i17 = chat.participants_count;
                            if (i17 != 0) {
                                chat2.participants_count = i17;
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
                                getNotificationCenter().k(at.f14778r5, Long.valueOf(chat.f19794id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                            }
                        }
                    } else {
                        concurrentHashMap.put(Long.valueOf(chat.f19794id), chat);
                        i(chat);
                    }
                } else {
                    if (!z10) {
                        if (chat2 != null) {
                            if (chat.version != chat2.version) {
                                this.f19275w1.delete(chat.f19794id);
                            }
                            int i18 = chat2.participants_count;
                            if (i18 != 0 && chat.participants_count == 0) {
                                chat.participants_count = i18;
                                chat.flags |= 131072;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat2.banned_rights;
                            if (tL_chatBannedRights3 != null) {
                                i10 = tL_chatBannedRights3.flags;
                            } else {
                                i10 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chat.banned_rights;
                            if (tL_chatBannedRights4 != null) {
                                i11 = tL_chatBannedRights4.flags;
                            } else {
                                i11 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = chat2.default_banned_rights;
                            if (tL_chatBannedRights5 != null) {
                                i12 = tL_chatBannedRights5.flags;
                            } else {
                                i12 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = chat.default_banned_rights;
                            if (tL_chatBannedRights6 != null) {
                                i13 = tL_chatBannedRights6.flags;
                            } else {
                                i13 = 0;
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
                            if (i10 != i11 || i12 != i13) {
                                i0.g3(new vj(this, chat, 3));
                            }
                        }
                        concurrentHashMap.put(Long.valueOf(chat.f19794id), chat);
                    } else if (chat2 == null) {
                        concurrentHashMap.put(Long.valueOf(chat.f19794id), chat);
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
                        int i19 = chat2.participants_count;
                        if (i19 != 0 && chat.participants_count == 0) {
                            chat.participants_count = i19;
                            chat.flags |= 131072;
                        }
                        concurrentHashMap.put(Long.valueOf(chat.f19794id), chat);
                    }
                    i(chat);
                }
                if (chat2 != null && chat2.forum != chat.forum) {
                    i0.g3(new vj(this, chat, 4));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    i0.g3(new vj(this, chat, 5));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j11 = chat.f19794id;
                    if (M0(j11) == null) {
                        getMessagesStorage().F0(j11, false, null, false, false, 0);
                        T2(0, j11, false);
                    }
                }
            }
        }
    }

    public final void N4(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.f19310z8 = tL_webBrowserSettings;
        int i10 = this.currentAccount;
        long j10 = tL_webBrowserSettings.hash;
        this.A8.g(i10, null, tL_webBrowserSettings);
        getNotificationCenter().k(at.R5, new Object[0]);
    }

    public final void O(long j10, long j11, SparseBooleanArray sparseBooleanArray) {
        P(j10, j11, sparseBooleanArray, false);
    }

    public final zo O0(long j10) {
        LongSparseArray longSparseArray = this.f19245s8;
        zo zoVar = (zo) longSparseArray.get(j10);
        if (zoVar == null) {
            zo zoVar2 = new zo(this.currentAccount, j10);
            longSparseArray.put(j10, zoVar2);
            return zoVar2;
        }
        return zoVar;
    }

    public final th.e5 O1() {
        th.e5 e5Var = this.f19140h0;
        if (e5Var != null) {
            return e5Var;
        }
        synchronized (G8[this.currentAccount]) {
            try {
                th.e5 e5Var2 = this.f19140h0;
                if (e5Var2 != null) {
                    return e5Var2;
                }
                th.e5 e5Var3 = new th.e5(this.currentAccount);
                this.f19140h0 = e5Var3;
                return e5Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int O2(final long j10, final long j11, final boolean z10, boolean z11, final k20 k20Var) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = g1(j11);
        tL_communities_togglePeerLink.peer = i1(j10);
        tL_communities_togglePeerLink.deleted = z10;
        tL_communities_togglePeerLink.visible = !z11;
        tL_communities_togglePeerLink.hidden = z11;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new a3.b(1), new k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat L0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                wp wpVar = wp.this;
                long j12 = j10;
                k20 k20Var2 = k20Var;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (L0 = wpVar.L0(Long.valueOf(-j12))) != null) {
                    wpVar.O2(j12, L0.linked_community_id, true, false, k20Var2);
                    return;
                }
                boolean z12 = bool instanceof TLRPC.TL_boolTrue;
                long j13 = j11;
                if (z12) {
                    long j14 = 0;
                    int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    boolean z13 = z10;
                    if (i10 > 0) {
                        TLRPC.User Z1 = wpVar.Z1(Long.valueOf(j12));
                        if (Z1 != null) {
                            if (!z13) {
                                j14 = j13;
                            }
                            Z1.linked_community_id = j14;
                            Z1.flags2 = v7.u7.b(Z1.flags2, 2097152, !z13);
                        }
                    } else {
                        TLRPC.Chat L02 = wpVar.L0(Long.valueOf(-j12));
                        if (L02 != null) {
                            if (!z13) {
                                j14 = j13;
                            }
                            L02.linked_community_id = j14;
                            L02.flags2 = v7.u7.b(L02.flags2, 1048576, !z13);
                        }
                    }
                }
                wpVar.T2(0, j13, true);
                k20Var2.a(bool, tL_error);
            }
        });
    }

    public final void O3(TLRPC.ChatFull chatFull) {
        this.l1.k(chatFull, chatFull.f19795id);
        this.f19253t7.M(-chatFull.f19795id);
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
        getMessagesStorage().f16331a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ek.run():void");
            }
        });
    }

    public final tp P0(long j10) {
        TLRPC.Chat L0;
        ?? obj = new Object();
        ArrayList arrayList = (ArrayList) this.f19283x.f(j10);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
                long j11 = dialog.f19798id;
                boolean z10 = true;
                if (j11 < 0 && (L0 = L0(Long.valueOf(-j11))) != null && (L0.forum || (L0.monoforum && w3.A(this.currentAccount, L0, 24)))) {
                    r1(this.currentAccount).f19234r7.h(L0.f19794id);
                    int i11 = obj.f18292a;
                    int[] iArr = y00.f19510n;
                    int i12 = iArr[0];
                    obj.f18292a = i11 + i12;
                    obj.f18293b += iArr[1];
                    obj.f18294c += iArr[2];
                    obj.d += iArr[4];
                    boolean z11 = obj.e;
                    if (!z11 && i12 > 0) {
                        if (iArr[3] == 0) {
                            z10 = false;
                        }
                        obj.e = z11 | z10;
                    }
                } else {
                    int i13 = obj.f18292a;
                    int i14 = dialog.unread_count;
                    obj.f18292a = i13 + i14;
                    obj.f18293b += dialog.unread_mentions_count;
                    obj.f18294c += dialog.unread_reactions_count;
                    obj.d += dialog.unread_poll_votes_count;
                    boolean z12 = obj.e;
                    if (!z12 && i14 > 0) {
                        obj.e = (!q2(dialog.f19798id, 0L, null)) | z12;
                    }
                }
            }
        }
        return obj;
    }

    public final void P2(boolean z10) {
        i0.r(this.J7);
        to toVar = this.T2;
        if (z10) {
            toVar.d(this.currentAccount, 0);
        }
        toVar.c(this.currentAccount, 0, new no(this, 1));
    }

    public final void P3(ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                N3((TLRPC.Chat) arrayList.get(i10), z10);
            }
        }
    }

    public final boolean P4() {
        if (this.f19200n8 != null && System.currentTimeMillis() - this.f19190m8 < 3600000) {
            return this.f19200n8.sensitive_enabled;
        }
        Set set = this.D4;
        if (set != null && !set.contains("sensitive")) {
            return false;
        }
        return true;
    }

    public final void Q() {
        i5 contactsController = getContactsController();
        contactsController.Y.clear();
        contactsController.Z.clear();
        contactsController.f16212a0.clear();
        contactsController.f16218e0.clear();
        contactsController.f16220f0.clear();
        contactsController.f16221g0.clear();
        contactsController.f16223i0.clear();
        contactsController.f16222h0.clear();
        contactsController.f16224j0.clear();
        contactsController.f16231x.clear();
        contactsController.f16225k0.clear();
        contactsController.f16226l0.clear();
        contactsController.f16214b0.clear();
        contactsController.f16216c0.clear();
        contactsController.f16217d0.clear();
        contactsController.f16213b = false;
        contactsController.e = false;
        contactsController.f16227n = false;
        contactsController.h = false;
        contactsController.f16228r = false;
        contactsController.f16230w = "";
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
        Utilities.e.c(new a5(contactsController, 5));
        MediaController.B().o();
        pt notificationsController = getNotificationsController();
        notificationsController.f17660w.clear();
        notificationsController.f17661x.clear();
        notificationsController.Q = false;
        pt.f17637k0.c(new bt(notificationsController, 5));
        rz sendMessagesHelper = getSendMessagesHelper();
        sendMessagesHelper.f18004a.clear();
        sendMessagesHelper.f18005b.clear();
        sendMessagesHelper.f18006c.clear();
        sendMessagesHelper.d.clear();
        sendMessagesHelper.f18007f.b();
        sendMessagesHelper.e.clear();
        sendMessagesHelper.h.b();
        sendMessagesHelper.f18008n.clear();
        sendMessagesHelper.f18009r.clear();
        sendMessagesHelper.f18011w.clear();
        sendMessagesHelper.f18013y.clear();
        sendMessagesHelper.D.b();
        sendMessagesHelper.E.clear();
        sendMessagesHelper.F.clear();
        sendMessagesHelper.G.D();
        pw secretChatHelper = getSecretChatHelper();
        secretChatHelper.f17680a.clear();
        secretChatHelper.e.clear();
        secretChatHelper.f17681b.clear();
        secretChatHelper.f17682c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f17683f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.f17684n = false;
        od locationController = getLocationController();
        locationController.I.clear();
        locationController.J.b();
        locationController.f17421c.b();
        locationController.G.b();
        locationController.d.b();
        od.s();
        Utilities.d.c(new fd(locationController, 2));
        vi mediaDataController = getMediaDataController();
        int i10 = 0;
        while (true) {
            ArrayList[] arrayListArr = mediaDataController.f18647f0;
            if (i10 >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i10];
            if (arrayList != null) {
                arrayList.clear();
            }
            mediaDataController.f18649g0[i10] = false;
            mediaDataController.f18651h0[i10] = false;
            i10++;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            mediaDataController.X[i11] = 0;
            mediaDataController.Y[i11] = 0;
            mediaDataController.G[i11].clear();
            mediaDataController.V[i11] = false;
            mediaDataController.W[i11] = false;
        }
        mediaDataController.f18667p1.b();
        int[] iArr = mediaDataController.f18668q0;
        iArr[0] = 0;
        long[] jArr = mediaDataController.f18666p0;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        mediaDataController.f18642d0.clear();
        mediaDataController.f18644e0.clear();
        mediaDataController.f18640c0.b();
        mediaDataController.f18676t0[0].b();
        mediaDataController.f18674s0[0].clear();
        mediaDataController.f18676t0[1].b();
        mediaDataController.f18674s0[1].clear();
        mediaDataController.f18678u0[0].clear();
        mediaDataController.f18678u0[1].clear();
        mediaDataController.f18653i0.clear();
        mediaDataController.I.b();
        mediaDataController.J.b();
        mediaDataController.N.clear();
        mediaDataController.Q.clear();
        mediaDataController.R.b();
        mediaDataController.S.clear();
        boolean[] zArr = mediaDataController.f18683w0;
        zArr[0] = false;
        boolean[] zArr2 = mediaDataController.f18686x0;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        mediaDataController.f18655j0 = false;
        mediaDataController.f18657k0 = false;
        mediaDataController.f18692z1.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.e.c(new ag.f3(24));
        }
        mediaDataController.f18634a0.clear();
        mediaDataController.f18663n1 = false;
        mediaDataController.f18660m1 = false;
        mediaDataController.f18654i1.clear();
        mediaDataController.f18656j1.clear();
        mediaDataController.f18658k1.clear();
        mediaDataController.l1.clear();
        i0.g3(new fg(mediaDataController, 5));
        mediaDataController.f18672r1.b();
        mediaDataController.f18675s1.b();
        mediaDataController.f18677t1.edit().clear().apply();
        mediaDataController.f18681v1.clear();
        mediaDataController.f18687x1.clear();
        mediaDataController.f18690y1.b();
        getColorPalette().a();
        this.f19253t7.i();
        F1().a();
        org.telegram.ui.Wallet.k0 k0Var = org.telegram.ui.Wallet.k0.O[this.currentAccount];
        if (k0Var != null) {
            org.telegram.ui.Wallet.p0.z(k0Var.J);
            k0Var.G.clear();
            k0Var.N.clear();
            WalletEngine2 walletEngine2 = k0Var.f34782b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                k0Var.f34782b = null;
                k0Var.d = null;
            }
            org.telegram.ui.Wallet.c0 c0Var = k0Var.f34792o;
            if (c0Var != null) {
                c0Var.c();
            }
            int i12 = k0Var.f34781a;
            if (k0Var.A >= 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(k0Var.A, true);
                k0Var.A = -1;
            }
            if (k0Var.B >= 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(k0Var.B, true);
                k0Var.B = -1;
            }
            if (k0Var.C >= 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(k0Var.C, true);
                k0Var.C = -1;
            }
            k0Var.f0();
            k0Var.E.clear();
            org.telegram.ui.Wallet.z0 z0Var = k0Var.f34796s;
            if (z0Var != null) {
                z0Var.h();
                k0Var.f34796s = null;
            }
            i0.r(k0Var.F);
            synchronized (org.telegram.ui.Wallet.k0.class) {
                try {
                    if (org.telegram.ui.Wallet.k0.O[k0Var.f34781a] == k0Var) {
                        org.telegram.ui.Wallet.k0.O[k0Var.f34781a] = null;
                    }
                } finally {
                }
            }
        }
        th.e5 e5Var = this.f19140h0;
        if (e5Var != null) {
            e5Var.q();
        }
        b20 b20Var = this.f19158j0;
        if (b20Var != null) {
            b20Var.a();
        }
        this.J3 = false;
        org.telegram.ui.zx.f44113y4[this.currentAccount] = false;
        this.e7.edit().clear().commit();
        this.f19138g7.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        m5.d(this.f7.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("shortcut_widget", 0);
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
                    appWidgetManager = AppWidgetManager.getInstance(w0.f18945b);
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
            for (int i13 = 0; i13 < size; i13++) {
                ChatsWidgetProvider.a(w0.f18945b, appWidgetManager, ((Integer) arrayList2.get(i13)).intValue());
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ContactsWidgetProvider.a(w0.f18945b, appWidgetManager, ((Integer) arrayList3.get(i14)).intValue());
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
        this.f19203o2.clear();
        this.P.clear();
        this.f19226r.b();
        this.f19168k1.b();
        this.l1.b();
        this.h.clear();
        this.f19247t1.clear();
        this.f19193n1.b();
        this.f19273w.clear();
        this.f19283x.b();
        this.T7.clear();
        this.S7.clear();
        this.V7.b();
        this.U7.clear();
        this.f19191n.clear();
        this.f19303z1.clear();
        this.J0.b();
        this.K0.b();
        this.L0 = 0;
        this.E.clear();
        this.D.clear();
        this.f19293y.clear();
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
        this.f19285x1.b();
        this.f19295y1.clear();
        this.d.clear();
        this.e.clear();
        this.S2 = null;
        this.f19121e8.b();
        this.f19130f8.clear();
        this.f19085b.clear();
        this.R.b();
        this.T.clear();
        this.V.clear();
        this.W.b();
        this.X.b();
        this.Z.clear();
        this.f19246t0.b();
        this.D0.b();
        this.E0.b();
        this.f19086b0 = 0;
        bp[] bpVarArr = this.M;
        bpVarArr[1] = null;
        bpVarArr[0] = null;
        this.P0.clear();
        this.S0.clear();
        this.T0 = false;
        this.V0.clear();
        this.U0 = false;
        this.f19147h7 = false;
        Utilities.d.c(new fo(this, 5));
        this.f19274w0.clear();
        this.f19284x0.clear();
        this.f19294y0.clear();
        this.G0.clear();
        int i15 = 0;
        while (true) {
            a0.h[] hVarArr = this.Y;
            if (i15 >= hVarArr.length) {
                break;
            }
            a0.h hVar = hVarArr[i15];
            if (hVar != null) {
                hVar.b();
            }
            i15++;
        }
        this.f19219q1.clear();
        this.f19228r1.clear();
        this.O1.b();
        this.f19238s1.clear();
        this.f19256u1.clear();
        this.f19265v1.clear();
        this.f19275w1.clear();
        this.Y1 = false;
        this.Z1.clear();
        this.a2.clear();
        this.f19088b2.clear();
        this.f19098c2.clear();
        this.E2 = false;
        this.F2 = 0;
        this.f19248t2 = 0;
        this.f19257u2 = false;
        this.f19107d2 = false;
        this.U1 = 0;
        this.V1 = null;
        this.W1 = null;
        this.T1 = false;
        this.F0 = false;
        this.H0 = -1;
        this.I0 = false;
        this.f19151i2 = false;
        this.f19142h2 = false;
        this.f19177l2 = false;
        this.J2 = 0L;
        this.M2 = false;
        this.f19160j2 = false;
        this.f19133g2 = true;
        this.N2 = null;
        this.Q2 = null;
        this.R2 = null;
        this.P2.clear();
        this.f19078a1.b();
        this.K2 = 0;
        this.L2 = 0;
        Utilities.d.c(new fo(this, 6));
        if (this.X1 != null) {
            Utilities.d.a(this.X1);
            this.X1 = null;
        }
        k();
        i0.g3(new fo(this, 7));
    }

    public final void Q0(r20 r20Var) {
        if (this.f19200n8 != null && System.currentTimeMillis() - this.f19190m8 < 3600000) {
            if (r20Var != null) {
                r20Var.a(this.f19200n8);
                return;
            }
            return;
        }
        if (this.f19182l8 == null) {
            this.f19182l8 = new ArrayList();
        }
        if (r20Var != null) {
            this.f19182l8.add(r20Var);
        }
        if (this.f19175k8) {
            return;
        }
        this.f19175k8 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new uj(this, 26));
    }

    public final e Q1() {
        if (this.f19262u7 == null) {
            this.f19262u7 = new e(this.currentAccount);
        }
        return this.f19262u7;
    }

    public final void Q2(long j10, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.f19295y1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j10) < 60) {
            return;
        }
        longSparseIntArray.put(j10, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z10) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new dq(messagesStorage, j10, 7));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = g1(j10);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new tj(this, j10, 2));
    }

    public final void Q3(long j10, TLRPC.DraftMessage draftMessage) {
        a0.h hVar = this.Q;
        if (hVar.h(j10) < 0) {
            if (!w3.o0(this.currentAccount, j10) || w3.z(this.currentAccount, 24, j10)) {
                vi mediaDataController = getMediaDataController();
                ArrayList arrayList = this.f19293y;
                int size = arrayList.size();
                int i10 = 1;
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < o5.j(dialog, mediaDataController.R(dialog.f19798id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.f19798id = j10;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.f18669q1.g(0, j10)).intValue();
                if (j10 >= 0 || !w3.T(L0(Long.valueOf(-j10)))) {
                    i10 = 0;
                }
                tL_dialog.flags = i10;
                hVar.k(tL_dialog, j10);
                arrayList.add(tL_dialog);
                Q4(null);
            }
        }
    }

    public final void Q4(a0.h r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.Q4(a0.h):void");
    }

    public final void R(op opVar) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (opVar.f17494b != 0 && opVar.f17495c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) opVar.f17494b;
            tL_messages_readDiscussion.peer = i1(opVar.f17493a);
            tL_messages_readDiscussion.read_max_id = opVar.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new ag.c3(8));
        } else if (!o5.C(opVar.f17493a)) {
            TLRPC.InputPeer i12 = i1(opVar.f17493a);
            if (opVar.f17495c != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = i1(opVar.f17493a);
                tL_messages_readSavedHistory.peer = i1(opVar.f17495c);
                tL_messages_readSavedHistory.max_id = opVar.d;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (i12 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = g1(-opVar.f17493a);
                tL_channels_readHistory.max_id = opVar.d;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = i12;
                tL_messages_readHistory2.max_id = opVar.d;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new uj(this, 1));
        } else {
            TLRPC.EncryptedChat Z0 = Z0(Integer.valueOf((int) (opVar.f17493a & 4294967295L)));
            byte[] bArr = Z0.auth_key;
            if (bArr != null && bArr.length > 1 && (Z0 instanceof TLRPC.TL_encryptedChat)) {
                TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = Z0.f19802id;
                tL_inputEncryptedChat.access_hash = Z0.access_hash;
                tL_messages_readEncryptedHistory.max_date = opVar.e;
                getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new ag.c3(8));
            }
        }
    }

    public final TLRPC.Dialog R0(long j10) {
        return (TLRPC.Dialog) this.Q.f(j10);
    }

    public final y00 R1() {
        return this.f19234r7;
    }

    public final void R2(Long l4, org.telegram.ui.ActionBar.u3 u3Var, int i10) {
        HashSet hashSet = this.f19256u1;
        if (u3Var == null && (hashSet.contains(l4) || this.f19265v1.contains(l4))) {
            return;
        }
        hashSet.add(l4);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l4.getClass();
        tL_channels_getParticipants.channel = h1(L0(l4));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i10;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new di(this, l4, u3Var, 2));
    }

    public final void R3(TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (encryptedChat == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f19095c;
        if (z10) {
            concurrentHashMap.putIfAbsent(Integer.valueOf(encryptedChat.f19802id), encryptedChat);
        } else {
            concurrentHashMap.put(Integer.valueOf(encryptedChat.f19802id), encryptedChat);
        }
    }

    public final boolean R4() {
        return !this.f19174k7;
    }

    public final void S(Activity activity, TLRPC.Chat chat, org.telegram.ui.ActionBar.k2 k2Var, as asVar) {
        org.telegram.ui.ActionBar.x1 x1Var;
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = h1(chat);
        if (activity != null) {
            x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        } else {
            x1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new eo(this, activity, x1Var, asVar, k2Var, tL_channels_convertToGigagroup, 0));
        if (x1Var != null) {
            x1Var.setOnCancelListener(new km(this, sendRequest, 1));
            try {
                x1Var.r(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final ArrayList S0() {
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            return arrayList;
        }
        return this.P0;
    }

    public final u10 S1() {
        return this.f19253t7;
    }

    public final void S2(int i10, int i11, int i12, boolean z10, cl clVar) {
        long j10;
        int i13;
        a0.h hVar;
        int m10;
        SparseBooleanArray sparseBooleanArray = this.a2;
        if (!sparseBooleanArray.get(i10) && !this.f19177l2) {
            sparseBooleanArray.put(i10, true);
            int i14 = at.f14779s;
            getNotificationCenter().k(i14, new Object[0]);
            if (v2.f18578a) {
                StringBuilder m11 = i0.a.m("folderId = ", i10, " load cacheOffset = ", i11, " count = ");
                m11.append(i12);
                m11.append(" cache = ");
                m11.append(z10);
                f8.b(m11.toString());
            }
            long[] jArr = null;
            if (z10) {
                is messagesStorage = getMessagesStorage();
                if (i11 == 0) {
                    i13 = 0;
                } else {
                    i13 = this.Z1.get(i10, 0);
                }
                if (i10 == 0 && i11 == 0 && (m10 = (hVar = messagesStorage.getMediaDataController().f18672r1).m()) > 0) {
                    jArr = new long[m10];
                    for (int i15 = 0; i15 < m10; i15++) {
                        if (((a0.h) hVar.n(i15)).f(0L) != null) {
                            jArr[i15] = hVar.j(i15);
                        }
                    }
                }
                messagesStorage.f16331a.c(new vr(messagesStorage, i10, i13, i12, jArr));
                return;
            }
            TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
            tL_messages_getDialogs.limit = i12;
            tL_messages_getDialogs.exclude_pinned = true;
            if (i10 != 0) {
                tL_messages_getDialogs.flags |= 2;
                tL_messages_getDialogs.folder_id = i10;
            }
            long[] g10 = getUserConfig().g(i10);
            long j11 = g10[0];
            if (j11 != -1) {
                if (j11 == 2147483647L) {
                    this.f19088b2.put(i10, true);
                    this.f19098c2.put(i10, true);
                    sparseBooleanArray.put(i10, false);
                    getNotificationCenter().k(i14, new Object[0]);
                    return;
                }
                int i16 = (int) j11;
                tL_messages_getDialogs.offset_id = i16;
                tL_messages_getDialogs.offset_date = (int) g10[1];
                if (i16 == 0) {
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
                ArrayList V0 = V0(i10);
                int size = V0.size() - 1;
                while (true) {
                    if (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(size);
                        if (!dialog.pinned && !o5.C(dialog.f19798id) && dialog.top_message > 0) {
                            ArrayList arrayList = (ArrayList) this.R.f(dialog.f19798id);
                            kj kjVar = null;
                            if (arrayList != null) {
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    kj kjVar2 = (kj) arrayList.get(i17);
                                    if (kjVar2 != null && (kjVar == null || kjVar2.f1() > kjVar.f1())) {
                                        kjVar = (kj) arrayList.get(i17);
                                    }
                                }
                            }
                            if (kjVar != null && kjVar.f1() > 0) {
                                TLRPC.Message message = kjVar.f16690k;
                                tL_messages_getDialogs.offset_date = message.date;
                                tL_messages_getDialogs.offset_id = message.f19815id;
                                TLRPC.Peer peer = message.peer_id;
                                long j12 = peer.channel_id;
                                if (j12 == 0) {
                                    j12 = peer.chat_id;
                                    if (j12 == 0) {
                                        j10 = peer.user_id;
                                        tL_messages_getDialogs.offset_peer = i1(j10);
                                    }
                                }
                                j10 = -j12;
                                tL_messages_getDialogs.offset_peer = i1(j10);
                            }
                        }
                        size--;
                    } else {
                        tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        break;
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_getDialogs, new pf(this, i10, i12, clVar, 1));
        }
    }

    public final void S3(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                R3((TLRPC.EncryptedChat) arrayList.get(i10), true);
            }
        }
    }

    public final void S4(TLRPC.Chat chat, int i10, boolean z10, org.telegram.ui.hg hgVar) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new ig.o0(this, chat, z10, i10, hgVar));
    }

    public final void T(Context context, long j10, org.telegram.ui.ActionBar.k2 k2Var, ds dsVar, org.telegram.ui.ch chVar) {
        org.telegram.ui.ActionBar.x1 x1Var;
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j10;
        if (context != null) {
            x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        } else {
            x1Var = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new jm(this, context, x1Var, dsVar, j10, chVar, k2Var, tL_messages_migrateChat));
        if (x1Var != null) {
            x1Var.setOnCancelListener(new km(this, sendRequest, 0));
            try {
                x1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final ep T0(long j10) {
        a0.h hVar = this.M7;
        ep epVar = (ep) hVar.f(j10);
        if (epVar == null) {
            ep epVar2 = new ep(this, j10);
            hVar.k(epVar2, j10);
            return epVar2;
        }
        return epVar;
    }

    public final b20 T1() {
        b20 b20Var = this.f19158j0;
        if (b20Var != null) {
            return b20Var;
        }
        synchronized (G8[this.currentAccount]) {
            try {
                b20 b20Var2 = this.f19158j0;
                if (b20Var2 != null) {
                    return b20Var2;
                }
                b20 b20Var3 = new b20(this.currentAccount);
                this.f19158j0 = b20Var3;
                return b20Var3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void T2(final int r11, final long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.T2(int, long, boolean):void");
    }

    public final void T3(long j10, u3 u3Var) {
        this.f19183m1.k(u3Var, u3Var.f18361b.f19804id);
        this.f19193n1.k(u3Var, j10);
        TLRPC.ChatFull M0 = M0(j10);
        if (M0 != null) {
            M0.call = u3Var.g(u3Var.f18360a);
        }
        getNotificationCenter().k(at.f14809w2, Long.valueOf(j10), Long.valueOf(u3Var.f18361b.f19804id), Boolean.FALSE);
        T2(0, j10, true);
    }

    public final boolean T4() {
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

    public final int U(String str, ArrayList arrayList, String str2, int i10, boolean z10, Location location, String str3, int i11, org.telegram.ui.ActionBar.k2 k2Var) {
        boolean z11 = false;
        if (i10 == 0 && !z10) {
            TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i11 >= 0) {
                tL_messages_createChat.ttl_period = i11;
                tL_messages_createChat.flags |= 1;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.User Z1 = Z1((Long) arrayList.get(i12));
                if (Z1 != null) {
                    tL_messages_createChat.users.add(p1(Z1));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new di(this, k2Var, tL_messages_createChat, 3), 2);
        } else if (!z10 && i10 != 2 && i10 != 4 && i10 != 5) {
            return 0;
        } else {
            TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
            tL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tL_channels_createChannel.about = str2;
            tL_channels_createChannel.for_import = z10;
            if (!z10 && i10 != 4 && i10 != 5) {
                tL_channels_createChannel.broadcast = true;
            } else {
                tL_channels_createChannel.megagroup = true;
            }
            if (i10 == 5) {
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
            return getConnectionsManager().sendRequest(tL_channels_createChannel, new di(this, k2Var, tL_channels_createChannel, 4), 2);
        }
    }

    public final int U0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i10 = dialog.unread_count;
        TLRPC.Chat L0 = L0(Long.valueOf(-dialog.f19798id));
        if (L0 != null && (L0.forum || L0.monoforum)) {
            this.f19234r7.h(-dialog.f19798id);
            return y00.f19510n[0];
        }
        return i10;
    }

    public final void U2(final TLRPC.User user, final int i10, boolean z10, final r20 r20Var) {
        if (user != null) {
            HashSet hashSet = this.f19219q1;
            if (r20Var == null) {
                if (!hashSet.contains(Long.valueOf(user.f19943id))) {
                    if (!z10 && this.f19228r1.get(user.f19943id) > 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            hashSet.add(Long.valueOf(user.f19943id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.f19936id = p1(user);
            final long j10 = user.f19943id;
            if (this.O.get(Long.valueOf(j10)) == null || this.P.get(Long.valueOf(j10)) == null) {
                X3(null, j10);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    wp wpVar = wp.this;
                    TLRPC.User user2 = user;
                    if (tL_error == null) {
                        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                        TLRPC.UserFull userFull = tL_users_userFull.full_user;
                        wpVar.V3(tL_users_userFull.users, false);
                        wpVar.P3(tL_users_userFull.chats, false);
                        TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                        userFull2.user = wpVar.Z1(Long.valueOf(userFull2.f19944id));
                        wpVar.getMessagesStorage().j2(userFull, false);
                        wpVar.O1().p0(j10, userFull.stories);
                        g4 f7 = g4.f(wpVar.currentAccount);
                        TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                        f7.r(userFull3.f19944id, userFull3.wallpaper);
                        r20 r20Var2 = r20Var;
                        if (r20Var2 != null) {
                            r20Var2.a(userFull);
                        }
                        i0.g3(new dg(wpVar, userFull, user2, i10, 1));
                        return;
                    }
                    i0.g3(new zj(wpVar, user2, 0));
                }
            }), i10);
        }
    }

    public final boolean U3(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.U3(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public final boolean U4() {
        String str = this.D6;
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

    public final long V(int i10, long j10) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2 = null;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e) {
            e = e;
        }
        try {
            nativeByteBuffer.writeInt32(102);
            nativeByteBuffer.writeInt64(j10);
            nativeByteBuffer.writeInt32(i10);
        } catch (Exception e7) {
            e = e7;
            nativeByteBuffer2 = nativeByteBuffer;
            f8.g(e, true);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().z(nativeByteBuffer);
        }
        return getMessagesStorage().z(nativeByteBuffer);
    }

    public final ArrayList V0(int i10) {
        ArrayList arrayList = (ArrayList) this.f19273w.get(i10);
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final void V2() {
        SharedPreferences.Editor editor;
        if (this.f19229r2 == 0 && !getUserConfig().S) {
            SharedPreferences sharedPreferences = r1(this.currentAccount).e7;
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
            this.f19229r2 = 4;
            for (int i10 = 0; i10 < 3; i10++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i10 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i10 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                getConnectionsManager().sendRequest(getnotifysettings, new mo(this, i10, 1));
            }
            getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new uj(this, 6));
        }
        if (!getUserConfig().T && !this.f19239s2) {
            this.f19239s2 = true;
            getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new uj(this, 11));
        }
    }

    public final void V3(ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (U3((TLRPC.User) arrayList.get(i10), z10, false)) {
                    z11 = true;
                }
            }
            if (z11) {
                i0.g3(new fo(this, 3));
            }
        }
    }

    public final boolean V4(TLRPC.User user) {
        if (user != null && user.f19943id == this.f19176l0) {
            return true;
        }
        String str = this.D6;
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

    public final void W(long j10, long j11) {
        is messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new jr(messagesStorage, 0, j10, j11, 1));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = i1(j10);
        tL_messages_deleteParticipantReactions.participant = i1(j11);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new z1(2));
    }

    public final void W0() {
        is messagesStorage = getMessagesStorage();
        messagesStorage.H();
        int i10 = messagesStorage.f16340r;
        is messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        int i11 = messagesStorage2.f16339n;
        is messagesStorage3 = getMessagesStorage();
        messagesStorage3.H();
        X0(i10, i11, messagesStorage3.f16341s, false);
    }

    public final void W2(long j10, long j11, boolean z10, int i10, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16, long j12, int i17, int i18, boolean z12) {
        int i19;
        if (j12 != 0) {
            i19 = i17;
        } else {
            i19 = 0;
        }
        X2(j10, j11, z10, i10, i11, i12, z11, i13, i14, i15, 0, i16, j12, i18, i19, 0, 0, false, 0, true, true, z12, null, 0L);
    }

    public final void W3(int i10, String str) {
        if (!TextUtils.isEmpty(str) && !this.f19160j2 && getUserConfig().e() != 0) {
            if (!getUserConfig().d || !str.equals(uz.f18516g)) {
                this.f19160j2 = true;
                this.f19169k2 = SystemClock.elapsedRealtime();
                if (uz.f18530l == null) {
                    uz.f18530l = new byte[256];
                    Utilities.f14520b.nextBytes(uz.f18530l);
                    uz.y();
                }
                TL_account.registerDevice registerdevice = new TL_account.registerDevice();
                registerdevice.token_type = i10;
                registerdevice.token = str;
                registerdevice.no_muted = false;
                registerdevice.secret = uz.f18530l;
                for (int i11 = 0; i11 < 4; i11++) {
                    e20 i12 = e20.i(i11);
                    if (i11 != this.currentAccount && i12.p()) {
                        long e = i12.e();
                        registerdevice.other_uids.add(Long.valueOf(e));
                        if (v2.f18578a) {
                            i0.a.p(this.currentAccount, a1.g.s(e, "add other uid = ", " for account "));
                        }
                    }
                }
                getConnectionsManager().sendRequest(registerdevice, new go(this, i10, str, 0));
            }
        }
    }

    public final void X(int i10, long j10, boolean z10) {
        Y(j10, 1, i10, 0, z10, null, 0L);
    }

    public final void X0(int i10, int i11, int i12, boolean z10) {
        W3(uz.f18513f, uz.f18516g);
        is messagesStorage = getMessagesStorage();
        messagesStorage.H();
        if (messagesStorage.f16340r == 0) {
            if (!this.f19142h2) {
                this.f19142h2 = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new uj(this, 24));
            }
        } else if (!z10 && this.f19125f2) {
        } else {
            this.f19125f2 = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i10;
            tL_updates_getDifference.date = i11;
            tL_updates_getDifference.qts = i12;
            if (this.f19133g2) {
                tL_updates_getDifference.flags |= 1;
                if (w0.o()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.f19133g2 = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (v2.f18578a) {
                StringBuilder m10 = i0.a.m("start getDifference with date = ", i11, " pts = ", i10, " qts = ");
                m10.append(i12);
                f8.b(m10.toString());
                f8.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new ee(this, i11, i12, 1));
        }
    }

    public final void X2(final long j10, final long j11, final boolean z10, final int i10, final int i11, final int i12, boolean z11, final int i13, final int i14, final int i15, final int i16, final int i17, final long j12, final int i18, final int i19, final int i20, final int i21, final boolean z12, final int i22, boolean z13, final boolean z14, final boolean z15, m00 m00Var, long j13) {
        int i23;
        m00 m00Var2;
        TLRPC.TL_forumTopic f7;
        if (v2.f18578a) {
            StringBuilder s10 = a1.g.s(j10, "load messages in chat ", " topic_id ");
            s10.append(j12);
            s10.append(" count ");
            s10.append(i10);
            s10.append(" max_id ");
            s10.append(i11);
            s10.append(" cache ");
            s10.append(z11);
            s10.append(" mindate = ");
            i23 = i13;
            s10.append(i23);
            s10.append(" guid ");
            s10.append(i14);
            s10.append(" load_type ");
            s10.append(i15);
            s10.append(" last_message_id ");
            s10.append(i16);
            s10.append(" mode ");
            s10.append(i17);
            s10.append(" index ");
            s10.append(i18);
            s10.append(" firstUnread ");
            s10.append(i19);
            s10.append(" unread_count ");
            s10.append(i20);
            s10.append(" last_date ");
            s10.append(i21);
            s10.append(" queryFromServer ");
            s10.append(z12);
            s10.append(" isTopic ");
            s10.append(z15);
            f8.b(s10.toString());
        } else {
            i23 = i13;
        }
        if (v2.f18578a && m00Var == null && i17 == 0) {
            m00Var2 = new m00("MessageLoaderLogger dialogId=" + j10 + " index=" + i18 + " count=" + i10);
        } else {
            m00Var2 = m00Var;
        }
        int i24 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if ((i24 == 0 || z15 || i17 == 8 || i17 == 3 || i17 == 5 || i17 == 9) && i17 != 2 && (z11 || o5.C(j10))) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.f16331a.c(new cq(messagesStorage, m00.d(m00Var2, "MessagesStorage.getMessages: storageQueue.postRunnable"), m00Var2, j10, j11, i10, i11, i12, i23, i14, i15, i17, j12, i18, z14, z15));
            return;
        }
        int i25 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Chat L0 = i25 < 0 ? L0(Long.valueOf(-j10)) : null;
        if (i17 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = i1(j10);
            tL_getWelcomeMessages.hash = j13;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new k20() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TL_ephemeral.WelcomeMessages welcomeMessages = (TL_ephemeral.WelcomeMessages) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    wp wpVar = wp.this;
                    wpVar.getClass();
                    if (welcomeMessages != null && !(welcomeMessages instanceof TL_ephemeral.TL_welcomeMessagesNotModified)) {
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        ArrayList<TL_ephemeral.EphemeralMessage> arrayList = welcomeMessages.messages;
                        int size = arrayList.size();
                        int i26 = 0;
                        while (i26 < size) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i26);
                            i26++;
                            tL_messages_messages.messages.add(rf.s.b(ephemeralMessage));
                        }
                        wpVar.H3(tL_messages_messages, tL_messages_messages.messages.size(), j10, j11, i10, i11, i12, false, i14, i19, i16, i20, i21, i15, false, i17, j12, i18, z12, i22, z14, z15, null);
                    }
                }
            }), i14);
        } else if (i17 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j12;
            tL_messages_getQuickReplyMessages.hash = j13;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new fl(this, j10, j11, i10, i11, i12, i14, i19, i16, i20, i21, i15, i17, j12, i18, z12, i22, z14, z15)), i14);
        } else if (i24 == 0) {
            if (i17 == 2) {
                return;
            }
            if (i17 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = i1(j10);
                tL_messages_getScheduledHistory.hash = j13;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new fl(this, i11, i12, j10, j11, i10, i14, i19, i16, i20, i21, i15, i17, j12, i18, z12, i22, z14, z15)), i14);
            } else if (!w3.p0(L0) && z13 && ((i15 == 3 || i15 == 2) && i16 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer i110 = i1(j10);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = i110;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        wp wpVar = wp.this;
                        int i26 = i14;
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
                                    wpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                                }
                                wpVar.X2(j10, j11, z10, i10, i11, i12, false, i13, i26, i15, dialog.top_message, 0, j12, i18, i19, dialog.unread_count, i21, z12, dialog.unread_mentions_count, false, z14, z15, null, 0L);
                                return;
                            }
                            return;
                        }
                        i0.g3(new dg(wpVar, i26, (TLObject) tL_messages_getPeerDialogs, tL_error, 9));
                    }
                });
            } else {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = i1(j10);
                if (i15 == 4) {
                    tL_messages_getHistory.add_offset = (-i10) + 5;
                } else if (i15 == 3) {
                    tL_messages_getHistory.add_offset = (-i10) / 2;
                } else if (i15 == 1) {
                    tL_messages_getHistory.add_offset = (-i10) - 1;
                } else if (i15 == 2 && i11 != 0) {
                    tL_messages_getHistory.add_offset = (-i10) + 6;
                } else if (i25 < 0 && i11 != 0 && w3.T(L0)) {
                    tL_messages_getHistory.add_offset = -1;
                    tL_messages_getHistory.limit++;
                }
                tL_messages_getHistory.limit = i10;
                tL_messages_getHistory.offset_id = i11;
                tL_messages_getHistory.offset_date = i12;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new gl(this, j10, i10, i11, i12, j11, i14, i19, i16, i20, i21, i15, i17, j12, i18, z12, i22, z14, z15, tL_messages_getHistory, 2)), i14);
            }
        } else if (i17 == 3 || w3.p0(L0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = i1(j12);
            if (w3.p0(L0)) {
                tL_messages_getSavedHistory.parent_peer = i1(j10);
            }
            if (i15 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i10) + 5;
            } else if (i15 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i10) / 2;
            } else if (i15 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i10) - 1;
            } else if (i15 == 2 && i11 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i10) + 6;
            } else if (i25 < 0 && i11 != 0 && w3.T(L0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i10;
            tL_messages_getSavedHistory.offset_id = i11;
            tL_messages_getSavedHistory.offset_date = i12;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new gl(this, j10, i10, i11, i12, j11, i14, i19, i16, i20, i21, i15, i17, j12, i18, z12, i22, z14, z15, tL_messages_getSavedHistory, 0)), i14);
        } else if (z13 && z15 && i15 == 2 && i16 == 0 && (f7 = this.f19234r7.f(-j10, j12)) != null) {
            X2(j10, j11, z10, i10, i11, i12, false, i13, i14, i15, f7.top_message, i17, j12, i18, i19, f7.unread_count, i21, z12, f7.unread_mentions_count, false, z14, z15, m00Var2, 0L);
        } else if (i17 != 0) {
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = i1(j10);
            tL_messages_getReplies.msg_id = (int) j12;
            tL_messages_getReplies.offset_date = i12;
            if (i15 == 4) {
                tL_messages_getReplies.add_offset = (-i10) + 5;
            } else if (i15 == 3) {
                tL_messages_getReplies.add_offset = (-i10) / 2;
            } else if (i15 == 1) {
                tL_messages_getReplies.add_offset = (-i10) - 1;
            } else if (i15 == 2 && i11 != 0) {
                tL_messages_getReplies.add_offset = (-i10) + 10;
            } else if (i25 < 0 && i11 != 0 && w3.T(L0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i10;
            tL_messages_getReplies.offset_id = i11;
            tL_messages_getReplies.hash = j13;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new gl(this, i10, i11, i12, i19, i15, j10, j11, i14, i16, i20, i21, i17, j12, i18, z12, i22, z14, z15, tL_messages_getReplies)), i14);
        }
    }

    public final void X3(ArrayList arrayList, long j10) {
        if (j10 != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            a0.h hVar = this.L7;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.InputPeer i12 = i1(((TLRPC.Dialog) arrayList.get(i10)).f19798id);
                    if (!(i12 instanceof TLRPC.TL_inputPeerChannel) || i12.access_hash != 0) {
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer.peer = i12;
                        long n10 = o5.n(i12);
                        Long l4 = (Long) hVar.f(n10);
                        if (l4 == null || System.currentTimeMillis() - l4.longValue() > 240000) {
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            hVar.k(Long.valueOf(System.currentTimeMillis()), n10);
                        }
                    }
                }
            } else {
                TLRPC.InputPeer i13 = i1(j10);
                if (!(i13 instanceof TLRPC.TL_inputPeerChannel) || i13.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer2.peer = i13;
                    long n11 = o5.n(i13);
                    Long l10 = (Long) hVar.f(n11);
                    if (l10 == null || System.currentTimeMillis() - l10.longValue() > 240000) {
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
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new uj(this, 0));
        }
    }

    public final void X4(long j10, boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = g1(j10);
        tL_channels_toggleForum.enabled = z10;
        tL_channels_toggleForum.tabs = z11;
        tL_channels_toggleForum.sidebar = z12;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new uj(this, 16), 64);
        getNotificationCenter().k(at.f14778r5, Long.valueOf(j10), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12));
    }

    public final void Y(long r34, int r36, int r37, int r38, boolean r39, org.telegram.tgnet.TLRPC.InputPeer r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.Y(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public final TLRPC.TL_availableEffect Y0(long j10) {
        E0();
        if (this.f19157i8 != null) {
            for (int i10 = 0; i10 < this.f19157i8.effects.size(); i10++) {
                if (this.f19157i8.effects.get(i10).f19825id == j10) {
                    return this.f19157i8.effects.get(i10);
                }
            }
            return null;
        }
        return null;
    }

    public final long Y1(int i10) {
        if (i10 == 0) {
            return this.f19141h1;
        }
        if (i10 == 1) {
            return this.f19150i1;
        }
        if (i10 == 2) {
            return this.f19159j1;
        }
        return 0L;
    }

    public final void Y2(TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        long j10;
        if (user != null || chat != null) {
            if (user != null) {
                j10 = user.f19943id;
            } else {
                j10 = -chat.f19794id;
            }
            a0.h hVar = this.f19246t0;
            if (hVar.h(j10) < 0) {
                if (v2.f18578a) {
                    f8.b("request spam button for " + j10);
                }
                int i10 = this.e7.getInt("dialog_bar_vis3" + j10, 0);
                if (!z10 && (i10 == 1 || i10 == 3)) {
                    if (v2.f18578a) {
                        f8.b("dialog bar already hidden for " + j10);
                        return;
                    }
                    return;
                }
                hVar.k(Boolean.TRUE, j10);
                TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
                if (user != null) {
                    tL_messages_getPeerSettings.peer = i1(user.f19943id);
                } else {
                    tL_messages_getPeerSettings.peer = i1(-chat.f19794id);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new tj(this, j10, 1));
            }
        }
    }

    public final void Y3(TLRPC.InputPeer inputPeer, long j10) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (j10 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
            } catch (Exception e) {
                nativeByteBuffer = null;
                exc = e;
            }
            try {
                nativeByteBuffer.writeInt32(22);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e7) {
                exc = e7;
                f8.g(exc, true);
                j10 = getMessagesStorage().z(nativeByteBuffer);
                long j11 = j10;
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new rj(this, inputPeer, j11, 8));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        }
        long j112 = j10;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new rj(this, inputPeer, j112, 8));
    }

    public final void Y4(long j10, boolean z10) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = g1(j10);
        tL_channels_togglePreHistoryHidden.enabled = z10;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new uj(this, 13), 64);
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j10, int i10, boolean z10, int i11) {
        a0(arrayList, arrayList2, encryptedChat, j10, z10, i11, false, 0L, null, i10);
    }

    public final TLRPC.EncryptedChat Z0(Integer num) {
        return (TLRPC.EncryptedChat) this.f19095c.get(num);
    }

    public final TLRPC.User Z1(Long l4) {
        if (l4.longValue() == 0) {
            return e20.i(this.currentAccount).f();
        }
        return (TLRPC.User) this.d.get(l4);
    }

    public final void Z2(int i10) {
        SparseIntArray sparseIntArray = this.f19203o2;
        if (sparseIntArray.indexOfKey(i10) < 0) {
            SharedPreferences k10 = getUserConfig().k();
            if (!k10.getBoolean("2pinnedDialogsLoaded" + i10, false)) {
                sparseIntArray.put(i10, 1);
                TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
                tL_messages_getPinnedDialogs.folder_id = i10;
                getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new mo(this, i10, 0));
            }
        }
    }

    public final void Z3(long j10) {
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        tL_users_getUsers.f19937id.add(n1(j10));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new uj(this, 7));
    }

    public final void Z4(final long j10, final long j11, boolean z10, boolean z11, final boolean z12, final Runnable runnable, final Runnable runnable2) {
        TLRPC.InputUser tL_inputUserEmpty;
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = g1(j10);
        tL_channels_toggleJoinRequest.enabled = z10;
        tL_channels_toggleJoinRequest.apply_to_invites = z11;
        if (z12) {
            if (j11 != 0) {
                tL_inputUserEmpty = n1(j11);
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
                    final wp wpVar = wp.this;
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    final boolean z13 = z12;
                    final long j12 = j10;
                    final long j13 = j11;
                    i0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            TLRPC.ChatFull M0;
                            boolean z14;
                            wp wpVar2 = wp.this;
                            if (z13 && (M0 = wpVar2.M0(j12)) != null) {
                                int i10 = M0.flags2;
                                long j14 = j13;
                                if (j14 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                M0.flags2 = v7.u7.b(i10, 8388608, z14);
                                M0.guard_bot_id = j14;
                                wpVar2.getMessagesStorage().N1(M0, false);
                                at notificationCenter = wpVar2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(at.T, M0, 0, bool, bool);
                            }
                            wpVar2.getNotificationCenter().k(at.f14772r, 8192);
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

    public final void a0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j10, boolean z10, int i10, boolean z11, long j11, TLObject tLObject, int i11) {
        b0(arrayList, arrayList2, encryptedChat, j10, z10, i10, z11, j11, tLObject, i11, false, 0);
    }

    public final TLRPC.EncryptedChat a1(int i10, boolean z10) {
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f19095c.get(Integer.valueOf(i10));
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
        is messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.f16331a.c(new xm(messagesStorage, i10, arrayList, countDownLatch, 16));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (arrayList.size() == 2) {
            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
            R3(encryptedChat2, false);
            U3((TLRPC.User) arrayList.get(1), true, false);
            return encryptedChat2;
        }
        return encryptedChat;
    }

    public final TLRPC.UserFull a2(long j10) {
        return (TLRPC.UserFull) this.f19168k1.f(j10);
    }

    public final void a3(boolean z10, jg.o2 o2Var) {
        if (o2Var != null) {
            this.I7 = o2Var;
        }
        if (getUserConfig().p()) {
            if (z10 || !getUserConfig().P) {
                if (z10) {
                    getUserConfig().P = false;
                    getUserConfig().v(false);
                }
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new uj(this, 18));
            }
        }
    }

    public final void a4(long j10, HashMap hashMap, int i10) {
        boolean z10;
        HashMap hashMap2;
        a0.h hVar;
        boolean z11 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 3) {
            z11 = true;
        }
        if (z10) {
            hashMap2 = this.F1;
            hVar = this.G1;
        } else if (z11) {
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
            getConnectionsManager().sendRequest(getwebpagepreview, new org.telegram.messenger.voip.a0(this, hashMap3, str, hVar2, j10, i10));
        }
    }

    public final void a5(long j10, int i10, boolean z10, bv0 bv0Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = i1(j10);
        tL_messages_toggleNoForwards.enabled = z10;
        if (i10 > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i10;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new nl(this, bv0Var, 1), 64);
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j10, boolean z10, int i10, boolean z11, long j11, TLObject tLObject, int i11, boolean z12, int i12) {
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        int i15;
        int i16;
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
        int i17;
        long j14;
        long j15 = j10;
        if (i10 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i18 = 5;
        if (i10 == 5) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (i10 == 9) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((arrayList != null && !arrayList.isEmpty()) || j11 != 0) {
            if (j11 == 0) {
                if (j15 != 0 && o5.z(j15)) {
                    TLRPC.Chat L0 = L0(Long.valueOf(-j15));
                    if (w3.T(L0)) {
                        j14 = L0.f19794id;
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
                    for (int i19 = 0; i19 < size; i19++) {
                        Integer num = (Integer) arrayList.get(i19);
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
                    i13 = i11;
                    i14 = 5;
                } else if (z14) {
                    if (i10 == 5) {
                        ag.i3 f7 = ag.i3.f(this.currentAccount);
                        int size2 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            Object obj = arrayList.get(i20);
                            i20++;
                            Integer num2 = (Integer) obj;
                            num2.getClass();
                            ArrayList arrayList5 = f7.f568c;
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList5.size()) {
                                    ag.h3 h3Var = (ag.h3) arrayList5.get(i21);
                                    i17 = i18;
                                    if (h3Var.h.contains(num2)) {
                                        h3Var.h.remove(num2);
                                        if (h3Var.a() <= 0) {
                                            arrayList5.remove(h3Var);
                                        }
                                        at.f(f7.f566a).k(at.F1, new Object[0]);
                                    } else {
                                        i21++;
                                        i18 = i17;
                                    }
                                } else {
                                    i17 = i18;
                                    break;
                                }
                            }
                            i18 = i17;
                        }
                    }
                    i14 = i18;
                    j15 = j10;
                    i13 = i11;
                    getMessagesStorage().P0(j15, arrayList, true, false, 5, i13);
                } else {
                    i14 = 5;
                    if (z15) {
                        j15 = j10;
                        i13 = i11;
                        getMessagesStorage().P0(j15, arrayList, true, false, 9, i13);
                    } else {
                        if (j13 == 0) {
                            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                kj kjVar = (kj) this.U.get(((Integer) arrayList.get(i22)).intValue());
                                if (kjVar != null) {
                                    kjVar.Z = true;
                                }
                            }
                        } else {
                            j3(arrayList, j10);
                        }
                        i13 = i11;
                        getMessagesStorage().P0(j10, arrayList, true, z10, 0, i13);
                        j15 = j10;
                        j12 = j13;
                        getMessagesStorage().R1(j15, j12, arrayList, null);
                        at notificationCenter = getNotificationCenter();
                        Long valueOf = Long.valueOf(j12);
                        Boolean valueOf2 = Boolean.valueOf(z13);
                        Boolean valueOf3 = Boolean.valueOf(z12);
                        Integer valueOf4 = Integer.valueOf(i12);
                        Object[] objArr = new Object[6];
                        objArr[0] = arrayList;
                        objArr[1] = valueOf;
                        objArr[2] = valueOf2;
                        i16 = 3;
                        objArr[3] = Boolean.FALSE;
                        i15 = 4;
                        objArr[4] = valueOf3;
                        objArr[i14] = valueOf4;
                        notificationCenter.k(at.f14806w, objArr);
                    }
                }
                j12 = j13;
                at notificationCenter2 = getNotificationCenter();
                Long valueOf5 = Long.valueOf(j12);
                Boolean valueOf22 = Boolean.valueOf(z13);
                Boolean valueOf32 = Boolean.valueOf(z12);
                Integer valueOf42 = Integer.valueOf(i12);
                Object[] objArr2 = new Object[6];
                objArr2[0] = arrayList;
                objArr2[1] = valueOf5;
                objArr2[2] = valueOf22;
                i16 = 3;
                objArr2[3] = Boolean.FALSE;
                i15 = 4;
                objArr2[4] = valueOf32;
                objArr2[i14] = valueOf42;
                notificationCenter2.k(at.f14806w, objArr2);
            } else {
                i13 = i11;
                i14 = 5;
                i15 = 4;
                i16 = 3;
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
                        tL_messages_deleteScheduledMessages2.f19875id = arrayList3;
                        tL_messages_deleteScheduledMessages2.peer = i1(j15);
                        try {
                            nativeByteBuffer9 = new NativeByteBuffer(tL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer9.writeInt32(24);
                                nativeByteBuffer9.writeInt64(j15);
                                tL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer9);
                            } catch (Exception e) {
                                e = e;
                                nativeByteBuffer8 = nativeByteBuffer9;
                                z21 = true;
                                f8.g(e, z21);
                                nativeByteBuffer9 = nativeByteBuffer8;
                                z22 = getMessagesStorage().z(nativeByteBuffer9);
                                tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new tj(this, z22, i16));
                            }
                        } catch (Exception e7) {
                            e = e7;
                            z21 = true;
                            nativeByteBuffer8 = null;
                        }
                        z22 = getMessagesStorage().z(nativeByteBuffer9);
                        tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new tj(this, z22, i16));
                } else if (z14) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteQuickReplyMessages) {
                        tL_messages_deleteQuickReplyMessages = (TLRPC.TL_messages_deleteQuickReplyMessages) tLObject;
                        z20 = j11;
                    } else {
                        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages2 = new TLRPC.TL_messages_deleteQuickReplyMessages();
                        tL_messages_deleteQuickReplyMessages2.f19874id = arrayList3;
                        tL_messages_deleteQuickReplyMessages2.shortcut_id = i13;
                        try {
                            nativeByteBuffer7 = new NativeByteBuffer(tL_messages_deleteQuickReplyMessages2.getObjectSize() + 16);
                            try {
                                nativeByteBuffer7.writeInt32(103);
                                nativeByteBuffer7.writeInt64(j15);
                                nativeByteBuffer7.writeInt32(i13);
                                tL_messages_deleteQuickReplyMessages2.serializeToStream(nativeByteBuffer7);
                            } catch (Exception e10) {
                                e = e10;
                                nativeByteBuffer6 = nativeByteBuffer7;
                                z19 = true;
                                f8.g(e, z19);
                                nativeByteBuffer7 = nativeByteBuffer6;
                                z20 = getMessagesStorage().z(nativeByteBuffer7);
                                tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                                getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new tj(this, z20, i15));
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z19 = true;
                            nativeByteBuffer6 = null;
                        }
                        z20 = getMessagesStorage().z(nativeByteBuffer7);
                        tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new tj(this, z20, i15));
                } else if (j12 != 0) {
                    if (tLObject != null) {
                        tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                        z18 = j11;
                    } else {
                        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                        tL_channels_deleteMessages2.f19827id = arrayList3;
                        tL_channels_deleteMessages2.channel = g1(j12);
                        try {
                            nativeByteBuffer5 = new NativeByteBuffer(tL_channels_deleteMessages2.getObjectSize() + 12);
                            try {
                                nativeByteBuffer5.writeInt32(24);
                                nativeByteBuffer5.writeInt64(j15);
                                tL_channels_deleteMessages2.serializeToStream(nativeByteBuffer5);
                            } catch (Exception e12) {
                                e = e12;
                                nativeByteBuffer4 = nativeByteBuffer5;
                                z17 = true;
                                f8.g(e, z17);
                                nativeByteBuffer5 = nativeByteBuffer4;
                                z18 = getMessagesStorage().z(nativeByteBuffer5);
                                tL_channels_deleteMessages = tL_channels_deleteMessages2;
                                getConnectionsManager().sendRequest(tL_channels_deleteMessages, new zk(0, j12, z18, this));
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z17 = true;
                            nativeByteBuffer4 = null;
                        }
                        z18 = getMessagesStorage().z(nativeByteBuffer5);
                        tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new zk(0, j12, z18, this));
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
                        tL_messages_deleteMessages2.f19873id = arrayList3;
                        tL_messages_deleteMessages2.revoke = z10;
                        try {
                            nativeByteBuffer3 = new NativeByteBuffer(tL_messages_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e14) {
                            e = e14;
                            nativeByteBuffer2 = nativeByteBuffer;
                        }
                        try {
                            nativeByteBuffer3.writeInt32(24);
                            nativeByteBuffer3.writeInt64(j15);
                            tL_messages_deleteMessages2.serializeToStream(nativeByteBuffer3);
                        } catch (Exception e15) {
                            e = e15;
                            nativeByteBuffer2 = nativeByteBuffer3;
                            f8.g(e, true);
                            nativeByteBuffer3 = nativeByteBuffer2;
                            z16 = getMessagesStorage().z(nativeByteBuffer3);
                            tL_messages_deleteMessages = tL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteMessages, new tj(this, z16, i14));
                        }
                        z16 = getMessagesStorage().z(nativeByteBuffer3);
                        tL_messages_deleteMessages = tL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteMessages, new tj(this, z16, i14));
                }
            }
        }
    }

    public final String b1(long j10) {
        if (j10 > 0) {
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (Z1 != null) {
                return i5.m(0, Z1.first_name, Z1.last_name);
            }
            return null;
        }
        TLRPC.Chat L0 = L0(Long.valueOf(-j10));
        if (L0 != null) {
            return L0.title;
        }
        return null;
    }

    public final void b3() {
        if (this.T0) {
            return;
        }
        this.T0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new uj(this, 25));
    }

    public final void b4(ArrayList arrayList, long j10) {
        int i10 = 0;
        int i11 = this.T.get(j10, 0);
        if (i11 != 0) {
            int size = arrayList.size();
            while (i10 < size) {
                if (((TLRPC.Message) arrayList.get(i10)).f19815id <= i11) {
                    arrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public final void b5(long j10, boolean z10) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = g1(j10);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z10;
        TLRPC.Chat L0 = L0(Long.valueOf(j10));
        if (L0 != null) {
            L0.collapsed_in_dialogs = z10;
            N3(L0, true);
            Q4(null);
            getNotificationCenter().k(at.T5, Long.valueOf(j10), Boolean.valueOf(z10));
            getNotificationCenter().k(at.f14779s, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new a3.b(1), new z1(1));
    }

    public final void c(long j10, boolean z10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j10);
        if (dialog == null) {
            return;
        }
        if (z10) {
            this.E0.k(dialog, j10);
        } else {
            this.D0.k(dialog, j10);
            this.f19293y.remove(dialog);
            Q4(null);
        }
        getNotificationCenter().k(at.f14779s, Boolean.TRUE);
    }

    public final void c0(long j10, long j11, ArrayList arrayList) {
        getMessagesStorage().f16331a.c(new qk(this, arrayList, j11, j10));
    }

    public final h20 c2() {
        if (this.S2 == null) {
            this.S2 = new h20(this.currentAccount);
        }
        return this.S2;
    }

    public final void c3(TLRPC.Chat chat, long j10) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j11 = chat.f19794id;
            a0.h hVar = this.f19087b1;
            if (hVar.h(j11) < 0) {
                int i10 = (chat.access_hash > 0L ? 1 : (chat.access_hash == 0L ? 0 : -1));
                if (i10 == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.f19794id;
                    tL_inputPeerChannel.peer = i1(chat.fromMessageDialogId);
                    tL_inputPeerChannel.msg_id = chat.fromMessageId;
                } else if (i10 == 0) {
                    if (j10 != 0) {
                        getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChannel.channel_id = chat.f19794id;
                    tL_inputPeerChannel.access_hash = chat.access_hash;
                }
                hVar.k(Boolean.TRUE, chat.f19794id);
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = tL_inputPeerChannel;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                if (j10 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize() + 4);
                    } catch (Exception e) {
                        nativeByteBuffer = null;
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(0);
                        chat.serializeToStream(nativeByteBuffer);
                    } catch (Exception e7) {
                        exc = e7;
                        f8.g(exc, true);
                        j10 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new rj(this, j10, chat, 2));
                    }
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new rj(this, j10, chat, 2));
            }
        }
    }

    public final void c4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j10 = dialog.f19798id;
        if (this.E.remove(dialog) && o5.y(dialog)) {
            Utilities.d.c(new xk(this, j10, 9));
        }
        this.f19293y.remove(dialog);
        this.G.remove(dialog);
        this.H.remove(dialog);
        this.F.remove(dialog);
        this.I.remove(dialog);
        this.L.remove(dialog);
        this.J.remove(dialog);
        this.K.remove(dialog);
        this.D.remove(dialog);
        int i10 = 0;
        while (true) {
            bp[] bpVarArr = this.M;
            if (i10 >= bpVarArr.length) {
                break;
            }
            bp bpVar = bpVarArr[i10];
            if (bpVar != null) {
                bpVar.f15007k.remove(dialog);
                this.M[i10].f15008l.remove(dialog);
            }
            i10++;
        }
        this.Q.l(j10);
        ArrayList arrayList = (ArrayList) this.f19273w.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
        d4(dialog);
    }

    public final void c5(Runnable runnable, long j10) {
        TLRPC.Chat L0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j10 > 0) {
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (Z1 != null) {
                user = Z1;
                L0 = null;
            } else {
                return;
            }
        } else {
            L0 = L0(Long.valueOf(-j10));
            if (L0 == null) {
                return;
            }
        }
        this.H0--;
        this.G0.delete(j10);
        if (user != null) {
            tL_contacts_unblock.f19842id = m1(user);
        } else {
            tL_contacts_unblock.f19842id = k1(L0);
        }
        getNotificationCenter().k(at.f14710g0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new v1(runnable, 3));
    }

    public final int d(int i10, int i11, long j10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j10));
        return e(arrayList, i10, i11, null, 0L);
    }

    public final void d0(long j10, long j11, int i10, int i11, boolean z10, org.telegram.ui.ng ngVar) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = i1(j10);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i10;
        tL_messages_deleteHistory.max_date = i11;
        tL_messages_deleteHistory.revoke = z10;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new un(this, j10, i10, i11, j11, z10, ngVar));
    }

    public final TLObject d2(long j10) {
        Long valueOf = Long.valueOf(j10);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(valueOf)) {
            return (TLObject) concurrentHashMap.get(Long.valueOf(j10));
        }
        long j11 = -j10;
        Long valueOf2 = Long.valueOf(j11);
        ConcurrentHashMap concurrentHashMap2 = this.f19085b;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            return (TLObject) concurrentHashMap2.get(Long.valueOf(j11));
        }
        return null;
    }

    public final void d3(TLRPC.InputPeer inputPeer, long j10) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long n10 = o5.n(inputPeer);
            a0.h hVar = this.f19097c1;
            if (hVar.h(n10) >= 0) {
                return;
            }
            hVar.k(Boolean.TRUE, n10);
            if (v2.f18578a) {
                f8.b("load unknown dialog " + n10);
            }
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = inputPeer;
            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
            if (j10 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
                } catch (Exception e) {
                    exc = e;
                }
                try {
                    nativeByteBuffer.writeInt32(15);
                    inputPeer.serializeToStream(nativeByteBuffer);
                } catch (Exception e7) {
                    exc = e7;
                    nativeByteBuffer2 = nativeByteBuffer;
                    f8.g(exc, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new zk(1, j10, n10, this));
                }
                j10 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new zk(1, j10, n10, this));
        }
    }

    public final void d4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j10 = dialog.f19798id;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        a0.h hVar = this.f19283x;
        if (i10 > 0) {
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (Z1 != null) {
                long j11 = Z1.linked_community_id;
                if (j11 != 0 && (arrayList2 = (ArrayList) hVar.f(j11)) != null) {
                    arrayList2.remove(dialog);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat L0 = L0(Long.valueOf(-j10));
        if (L0 != null) {
            long j12 = L0.linked_community_id;
            if (j12 != 0 && (arrayList = (ArrayList) hVar.f(j12)) != null) {
                arrayList.remove(dialog);
            }
        }
    }

    public final void d5(long j10, TLRPC.EmojiStatus emojiStatus, TL_stars.StarGift starGift) {
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
            TLRPC.User f7 = getUserConfig().f();
            tL_channels_updateEmojiStatus = updateemojistatus;
            if (f7 != null) {
                f7.emoji_status = emojiStatus2;
                getNotificationCenter().k(at.f14748m5, f7);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j11 = -j10;
            tL_channels_updateEmojiStatus2.channel = g1(j11);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat L0 = L0(Long.valueOf(j11));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (L0 != null) {
                L0.flags |= 512;
                L0.emoji_status = emojiStatus2;
                N3(L0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().g5(j10, emojiStatus2);
        getNotificationCenter().k(at.f14772r, 524288);
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        kj kjVar;
        org.telegram.ui.ActionBar.s6 s6Var;
        TLRPC.InputFile inputFile;
        org.telegram.ui.ActionBar.r6 r6Var;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        wp wpVar = this;
        int i12 = at.U1;
        HashMap hashMap = wpVar.P2;
        TLRPC.BaseTheme baseTheme = null;
        if (i10 == i12) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = wpVar.N2;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                wpVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new uj(wpVar, 19));
            } else {
                String str3 = wpVar.Q2;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    org.telegram.ui.ActionBar.m6 m6Var = wpVar.R2;
                    String str4 = wpVar.Q2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = m6Var.f20594i;
                    tL_wallPaperSettings.motion = m6Var.f20595j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    org.telegram.ui.ActionBar.m6 m6Var2 = wpVar.R2;
                    m6Var2.f20603r = 1.0f;
                    m6Var2.f20604s = new ArrayList();
                    wpVar.R2.f20604s.add(Integer.valueOf(wpVar.getConnectionsManager().sendRequest(uploadwallpaper, new r6(wpVar, m6Var, tL_wallPaperSettings, str4, 3))));
                } else {
                    Object obj = hashMap.get(str);
                    if (obj instanceof org.telegram.ui.ActionBar.s6) {
                        s6Var = (org.telegram.ui.ActionBar.s6) obj;
                        if (str.equals(s6Var.H)) {
                            s6Var.J = inputFile3;
                            s6Var.H = null;
                        } else if (str.equals(s6Var.I)) {
                            s6Var.K = inputFile3;
                            s6Var.I = null;
                        }
                        inputFile = s6Var.J;
                        inputFile2 = s6Var.K;
                        r6Var = null;
                    } else if (obj instanceof org.telegram.ui.ActionBar.r6) {
                        org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) obj;
                        if (str.equals(r6Var2.f20748u)) {
                            r6Var2.f20749w = inputFile3;
                            r6Var2.f20748u = null;
                        } else if (str.equals(r6Var2.v)) {
                            r6Var2.f20750x = inputFile3;
                            r6Var2.v = null;
                        }
                        org.telegram.ui.ActionBar.s6 s6Var2 = r6Var2.f20732b;
                        TLRPC.InputFile inputFile4 = r6Var2.f20749w;
                        inputFile2 = r6Var2.f20750x;
                        r6Var = r6Var2;
                        s6Var = s6Var2;
                        inputFile = inputFile4;
                    } else {
                        s6Var = null;
                        inputFile = null;
                        r6Var = null;
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
                        if (r6Var != null) {
                            r6Var.f20750x = null;
                            r6Var.f20749w = null;
                            tL_theme = r6Var.f20745r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str5 = s6Var.f20802a;
                            int i13 = org.telegram.ui.ActionBar.t6.f20866a;
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
                            tL_inputThemeSettings2.accent_color = r6Var.f20733c;
                            int i14 = r6Var.d;
                            if (i14 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i14;
                            }
                            int i15 = r6Var.e;
                            if (i15 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i15));
                                tL_inputThemeSettings2.flags |= 1;
                                int i16 = r6Var.f20734f;
                                if (i16 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i16));
                                    int i17 = r6Var.f20735g;
                                    if (i17 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i17));
                                        int i18 = r6Var.h;
                                        if (i18 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i18));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = r6Var.f20736i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(r6Var.f20742o)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = r6Var.f20742o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (r6Var.f20743p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.f19867id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = r6Var.f20744q;
                            long j10 = r6Var.f20737j;
                            if (j10 != 0) {
                                wallPaperSettings2.background_color = (int) j10;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j11 = r6Var.f20738k;
                            if (j11 != 0) {
                                wallPaperSettings2.second_background_color = (int) j11;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = i0.s1(r6Var.f20741n, true);
                            }
                            long j12 = r6Var.f20739l;
                            if (j12 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j12;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j13 = r6Var.f20740m;
                            if (j13 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j13;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            s6Var.K = null;
                            s6Var.J = null;
                            tL_theme = s6Var.F;
                            tL_inputThemeSettings = null;
                        }
                        org.telegram.ui.ActionBar.s6 s6Var3 = s6Var;
                        wpVar = this;
                        getConnectionsManager().sendRequest(uploadtheme, new lo(wpVar, tL_theme, s6Var3, tL_inputThemeSettings, r6Var, 0));
                    }
                }
                wpVar = this;
            }
        } else if (i10 == at.V1) {
            String str6 = (String) objArr[0];
            String str7 = wpVar.N2;
            if (str7 != null && str7.equals(str6)) {
                wpVar.N2 = null;
            } else {
                String str8 = wpVar.Q2;
                if (str8 != null && str8.equals(str6)) {
                    wpVar.Q2 = null;
                    wpVar.R2 = null;
                } else {
                    Object remove = hashMap.remove(str6);
                    boolean z10 = remove instanceof org.telegram.ui.ActionBar.s6;
                    int i19 = at.N2;
                    if (z10) {
                        org.telegram.ui.ActionBar.s6 s6Var4 = (org.telegram.ui.ActionBar.s6) remove;
                        s6Var4.K = null;
                        s6Var4.J = null;
                        wpVar.getNotificationCenter().k(i19, s6Var4, 0);
                    } else if (remove instanceof org.telegram.ui.ActionBar.r6) {
                        org.telegram.ui.ActionBar.r6 r6Var3 = (org.telegram.ui.ActionBar.r6) remove;
                        r6Var3.f20748u = null;
                        wpVar.getNotificationCenter().k(i19, r6Var3.f20732b, r6Var3);
                    }
                }
            }
        }
        if (i10 == at.W1) {
            String str9 = (String) objArr[0];
            String str10 = wpVar.Q2;
            if (str10 != null && str10.equals(str9)) {
                wpVar.R2.f20603r = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        int i20 = at.K;
        SparseArray sparseArray = wpVar.U;
        if (i10 == i20) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l4 = (Long) objArr[3];
                ArrayList arrayList = (ArrayList) wpVar.R.f(l4.longValue());
                for (int i21 = 0; arrayList != null && i21 < arrayList.size(); i21++) {
                    kj kjVar2 = (kj) arrayList.get(i21);
                    if (kjVar2 != null && (kjVar2.f1() == num.intValue() || kjVar2.f16690k.local_id == num.intValue())) {
                        kjVar2.f16690k.f19815id = num2.intValue();
                        kjVar2.f16690k.send_state = 0;
                    }
                    kj kjVar3 = (kj) sparseArray.get(num.intValue());
                    if (kjVar3 != null) {
                        sparseArray.remove(num.intValue());
                        sparseArray.put(num2.intValue(), kjVar3);
                    }
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) wpVar.Q.f(l4.longValue());
                if (dialog != null && dialog.top_message == num.intValue()) {
                    dialog.top_message = num2.intValue();
                    wpVar.getNotificationCenter().k(at.f14779s, new Object[0]);
                }
                if (o5.z(l4.longValue())) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) wpVar.l1.f(-l4.longValue());
                    TLRPC.Chat L0 = wpVar.L0(Long.valueOf(-l4.longValue()));
                    if (L0 != null && !w3.N(L0) && !kj.f3(num2.intValue()) && chatFull != null && chatFull.slowmode_seconds != 0) {
                        chatFull.slowmode_next_send_date = wpVar.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                        chatFull.flags |= 262144;
                        wpVar.getMessagesStorage().N1(chatFull, false);
                    }
                }
            }
        } else if (i10 == at.f14740l0) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id == 0 && (kjVar = (kj) sparseArray.get(message.f19815id)) != null) {
                kjVar.f16690k.media = kj.o1(message);
                if (kj.o1(message).ttl_seconds != 0) {
                    if ((kj.o1(message).photo instanceof TLRPC.TL_photoEmpty) || (kj.o1(message).document instanceof TLRPC.TL_documentEmpty)) {
                        kjVar.K5();
                        wpVar.getNotificationCenter().k(at.f14704f0, new Object[0]);
                    }
                }
            }
        } else if (i10 == at.f14709f5) {
            wpVar.P2(false);
            wpVar.getContactsController().J(true);
            if ((wpVar.q6 && !wpVar.getUserConfig().q()) || wpVar.getUserConfig().q()) {
                wpVar.getNotificationCenter().k(at.f14746m3, new Object[0]);
            }
        }
    }

    public final int e(java.util.ArrayList r23, int r24, int r25, java.util.ArrayList r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.e(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public final void e0(final long j10, TLRPC.InputPeer inputPeer, boolean z10, final org.telegram.ui.ua uaVar) {
        final boolean z11;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat L0 = L0(Long.valueOf(j10));
        if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && i20.B(getMessagesController().Z1(Long.valueOf(inputPeer.user_id)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        final boolean T = w3.T(L0);
        if (T) {
            if (z11) {
                boolean z12 = L0.creator;
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = h1(L0);
                tL_messages_deleteChatUser = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                tL_channels_editBanned.channel = h1(L0);
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
            tL_messages_deleteChatUser2.user_id = o1(inputPeer);
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
                    wp wpVar = wp.this;
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    if (T && !z11) {
                        i0.h3(new xk(wpVar, j10, 21), 1000L);
                    }
                    Runnable runnable = uaVar;
                    if (runnable != null) {
                        i0.g3(runnable);
                    }
                }
            }
        }, 64);
    }

    public final TLObject e2(String str) {
        if (str != null && str.length() != 0) {
            return (TLObject) this.e.get(str.toLowerCase());
        }
        return null;
    }

    public final void e3(TLRPC.User user, boolean z10, int i10) {
        is messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.f16331a.c(new ob(i10, 3, messagesStorage, user, z10));
        }
    }

    public final void e4(bp bpVar) {
        this.P0.remove(bpVar);
        this.S0.remove(bpVar.f15000a);
        getNotificationCenter().k(at.O2, new Object[0]);
    }

    public final void e5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        d5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final void f(int i10, TLRPC.Dialog dialog) {
        int i11;
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            i11 = 0;
        } else {
            i11 = dialog.folder_id;
        }
        SparseArray sparseArray = this.f19273w;
        ArrayList arrayList = (ArrayList) sparseArray.get(i11);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i11, arrayList);
        }
        if (i10 == -1) {
            arrayList.add(dialog);
        } else if (i10 == -2) {
            if (!arrayList.isEmpty() && (arrayList.get(0) instanceof TLRPC.TL_dialogFolder)) {
                arrayList.add(1, dialog);
            } else {
                arrayList.add(0, dialog);
            }
        } else {
            arrayList.add(i10, dialog);
        }
    }

    public final void f0(long j10, TLRPC.User user) {
        g0(j10, user, null, false, false);
    }

    public final u3 f1(long j10, boolean z10, p90 p90Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull M0 = M0(j10);
        if (M0 != null && (inputGroupCall = M0.call) != null) {
            u3 u3Var = (u3) this.f19183m1.f(inputGroupCall.f19811id);
            if (u3Var == null && z10) {
                Long valueOf = Long.valueOf(j10);
                HashSet hashSet = this.f19247t1;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(j10));
                    if (M0.call != null) {
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        getgroupcall.call = M0.call;
                        getgroupcall.limit = 20;
                        getConnectionsManager().sendRequest(getgroupcall, new rj(this, j10, p90Var, 5));
                    }
                }
            }
            if (u3Var == null || !(u3Var.f18361b instanceof TLRPC.TL_groupCallDiscarded)) {
                return u3Var;
            }
            return null;
        }
        return null;
    }

    public final void f3() {
        i0.r(this.f19301y8);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
        wo woVar = this.A8;
        if (tL_webBrowserSettings == null) {
            woVar.e(this.currentAccount, null, new jl(this, 0));
        }
        woVar.d(this.currentAccount, null);
        woVar.c(this.currentAccount, null, new no(this, 2));
    }

    public final void f4(int i10) {
        long j10 = 2305843009213693952L | i10;
        a0.h hVar = this.Q;
        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
        if (dialog == null) {
            return;
        }
        hVar.l(j10);
        this.f19293y.remove(dialog);
        Q4(null);
        getNotificationCenter().k(at.f14779s, new Object[0]);
        getNotificationCenter().k(at.f14692d0, Integer.valueOf(i10));
    }

    public final void f5() {
        int intValue;
        long longValue;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        ConcurrentHashMap concurrentHashMap = this.f19224q7;
        Iterator it = concurrentHashMap.keySet().iterator();
        Long l4 = null;
        while (it.hasNext()) {
            if (((Integer) concurrentHashMap.get(it.next())).intValue() > currentTimeMillis) {
                if (l4 == null) {
                    longValue = Long.MAX_VALUE;
                } else {
                    longValue = l4.longValue();
                }
                l4 = Long.valueOf(Math.min(longValue, intValue - currentTimeMillis));
            } else {
                it.remove();
            }
        }
        if (l4 != null) {
            long longValue2 = l4.longValue() + 2;
            long j10 = currentTimeMillis;
            if (j10 + longValue2 != this.f19208o7 + this.f19199n7) {
                i0.r(this.f19216p7);
                this.f19208o7 = j10;
                this.f19199n7 = longValue2;
                fo foVar = new fo(this, 2);
                this.f19216p7 = foVar;
                i0.h3(foVar, longValue2 * 1000);
                return;
            }
            return;
        }
        fo foVar2 = this.f19216p7;
        if (foVar2 != null) {
            this.f19208o7 = -1L;
            this.f19199n7 = -1L;
            i0.r(foVar2);
        }
    }

    public final void g(bp bpVar, boolean z10) {
        if (z10) {
            int size = this.P0.size();
            int i10 = 254;
            for (int i11 = 0; i11 < size; i11++) {
                i10 = Math.min(i10, ((bp) this.P0.get(i11)).f15003f);
            }
            bpVar.f15003f = i10 - 1;
            if (((bp) this.P0.get(0)).e()) {
                this.P0.add(1, bpVar);
            } else {
                this.P0.add(0, bpVar);
            }
        } else {
            int size2 = this.P0.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size2; i13++) {
                i12 = Math.max(i12, ((bp) this.P0.get(i13)).f15003f);
            }
            bpVar.f15003f = i12 + 1;
            this.P0.add(bpVar);
        }
        this.S0.put(bpVar.f15000a, bpVar);
        if (this.P0.size() == 1 && uz.m(this.currentAccount) != 5) {
            uz.f18548r1 = 5;
            w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", uz.f18548r1).apply();
        }
        g3();
    }

    public final void g0(long j10, TLRPC.User user, TLRPC.Chat chat, boolean z10, boolean z11) {
        TLRPC.InputPeer k12;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user == null && chat == null) {
            return;
        }
        if (user != null) {
            k12 = m1(user);
        } else {
            k12 = k1(chat);
        }
        TLRPC.Chat L0 = L0(Long.valueOf(j10));
        boolean T = w3.T(L0);
        if (T) {
            if (i20.B(user)) {
                if (L0.creator && z10) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = h1(L0);
                    tL_messages_deleteChatUser = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = h1(L0);
                    tL_messages_deleteChatUser = tL_channels_leaveChannel;
                }
            } else {
                if (w3.Y(L0)) {
                    TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
                    tL_communities_toggleParticipantBanned.participant = k12;
                    tL_communities_toggleParticipantBanned.community = h1(L0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = h1(L0);
                    tL_channels_editBanned.participant = k12;
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
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new ag.c3(8));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j10;
            tL_messages_deleteChatUser3.user_id = p1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (i20.B(user)) {
            X(0, -j10, z11);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new il(this, T, user, j10), 64);
    }

    public final TLRPC.InputChannel g1(long j10) {
        return h1(L0(Long.valueOf(j10)));
    }

    public final void g3() {
        boolean z10;
        if (!getUserConfig().q() && this.P0.size() - 1 > this.M4) {
            int size = (this.P0.size() - 1) - this.M4;
            ArrayList arrayList = new ArrayList(this.P0);
            Collections.reverse(arrayList);
            z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 < size) {
                    if (!((bp) arrayList.get(i10)).f15012p) {
                        z10 = true;
                    }
                    ((bp) arrayList.get(i10)).f15012p = true;
                } else {
                    if (((bp) arrayList.get(i10)).f15012p) {
                        z10 = true;
                    }
                    ((bp) arrayList.get(i10)).f15012p = false;
                }
            }
        } else {
            z10 = false;
        }
        if (z10) {
            getNotificationCenter().k(at.O2, new Object[0]);
        }
    }

    public final void g4() {
        TLRPC.Dialog dialog = this.f19286x2;
        if (dialog == null) {
            return;
        }
        long j10 = dialog.f19798id;
        if (j10 < 0) {
            TLRPC.Chat L0 = L0(Long.valueOf(-j10));
            if (w3.r0(L0) || L0.restricted) {
                c4(this.f19286x2);
            }
        } else {
            c4(dialog);
        }
        this.f19286x2 = null;
        Q4(null);
        getNotificationCenter().k(at.f14779s, new Object[0]);
    }

    public final void g5(long j10, TLRPC.EmojiStatus emojiStatus) {
        int g10 = o5.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f19224q7;
        if (g10 != 0) {
            concurrentHashMap.put(Long.valueOf(j10), Integer.valueOf(g10));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j10))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j10));
        }
        f5();
    }

    public final void h(kj kjVar, TLRPC.SuggestedPost suggestedPost) {
        kj kjVar2 = kjVar;
        if (kjVar2 != null && kjVar2.f16690k != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(kjVar2);
            rz sendMessagesHelper = getSendMessagesHelper();
            long B0 = kj.B0(kjVar2.f16690k);
            boolean z10 = !kj.l3(kjVar2.f16690k);
            TLRPC.Message message = kjVar2.f16690k;
            if (message.suggested_post == null) {
                kjVar2 = null;
            }
            sendMessagesHelper.q0(arrayList, B0, z10, false, true, 0, 0, kjVar2, -1, 0L, o5.o(message.saved_peer_id), pj.b(suggestedPost));
        }
    }

    public final void h0(long j10, int i10, long j11) {
        is messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.I(new jr(messagesStorage, i10, j10, j11, 1));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = i1(j10);
        tL_messages_deleteParticipantReaction.participant = i1(j11);
        tL_messages_deleteParticipantReaction.msg_id = i10;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new a3.b(1), new jl(this, 2));
    }

    public final void h2(long j10, TLRPC.User user, TLRPC.Chat chat) {
        if (user != null || chat != null) {
            SharedPreferences.Editor edit = this.e7.edit();
            edit.putInt("dialog_bar_vis3" + j10, 3);
            edit.remove("dialog_bar_invite" + j10);
            edit.commit();
            if (!o5.C(j10)) {
                TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
                if (user != null) {
                    tL_messages_hidePeerSettingsBar.peer = i1(user.f19943id);
                } else {
                    tL_messages_hidePeerSettingsBar.peer = i1(-chat.f19794id);
                }
                getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new ag.c3(8));
            }
        }
    }

    public final void h3(final long r18, final int r20, int r21, final int r22, boolean r23, final long r24, int r26, final boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.h3(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public final void h4(long j10, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 == 0) {
                TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.W3;
                int i11 = at.f14781s1;
                if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                    this.W3 = null;
                    getNotificationCenter().k(i11, new Object[0]);
                } else if (!this.U3.remove(str) && this.V3.contains(str)) {
                    return;
                } else {
                    this.V3.add(str);
                    SharedPreferences.Editor edit = this.f7.edit();
                    edit.putStringSet("pendingSuggestions", this.U3);
                    edit.putStringSet("dismissedSuggestions", this.V3);
                    edit.commit();
                    getNotificationCenter().k(i11, new Object[0]);
                }
            }
            TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
            tL_help_dismissSuggestion.suggestion = str;
            if (i10 == 0) {
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_help_dismissSuggestion.peer = i1(j10);
            }
            getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ag.c3(8));
        }
    }

    public final void h5(bp bpVar) {
        TLRPC.EncryptedChat Z0;
        TLRPC.Chat L0;
        ArrayList arrayList = this.f19293y;
        if (bpVar != null) {
            ArrayList arrayList2 = bpVar.f15007k;
            ArrayList arrayList3 = bpVar.f15008l;
            arrayList2.clear();
            arrayList3.clear();
            this.D7 = bpVar;
            try {
                Collections.sort(arrayList, this.E7);
            } catch (Exception e) {
                f8.g(e, true);
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
                boolean z10 = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z10) {
                    long j10 = dialog.f19798id;
                    if (!z10 || (L0 = L0(Long.valueOf(-j10))) == null || L0.collapsed_in_dialogs) {
                        if (o5.C(j10) && (Z0 = Z0(Integer.valueOf((int) (4294967295L & j10)))) != null) {
                            j10 = Z0.user_id;
                        }
                        if (bpVar.c(getAccountInstance(), j10, dialog)) {
                            if (y(dialog)) {
                                arrayList3.add(dialog);
                            }
                            arrayList2.add(dialog);
                        }
                    }
                }
            }
            try {
                Collections.sort(arrayList, this.F7);
            } catch (Exception unused) {
            }
        }
    }

    public final void i(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            i0.g3(new vj(this, chat, 0));
        } else {
            j(chat);
        }
    }

    public final void i0(long j10, int i10, TLRPC.InputPeer inputPeer) {
        long n10 = o5.n(inputPeer);
        int[] iArr = {i10};
        nn nnVar = new nn(this, n10, j10, inputPeer, i10, iArr);
        if (iArr[0] <= 0 && n10 == 0) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new d4(messagesStorage, j10, new on(iArr, nnVar), 28));
            return;
        }
        nnVar.run();
    }

    public final TLRPC.InputPeer i1(long j10) {
        if (j10 == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j10 < 0) {
            long j11 = -j10;
            TLRPC.Chat L0 = L0(Long.valueOf(j11));
            if (w3.T(L0)) {
                if (L0 != null && L0.access_hash == 0) {
                    long j12 = L0.fromMessageDialogId;
                    if (j12 != 0 && j12 != j10 && L0.fromMessageId != 0) {
                        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                        tL_inputPeerChannelFromMessage.channel_id = j11;
                        tL_inputPeerChannelFromMessage.peer = i1(L0.fromMessageDialogId);
                        tL_inputPeerChannelFromMessage.msg_id = L0.fromMessageId;
                        return tL_inputPeerChannelFromMessage;
                    }
                }
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChannel.channel_id = j11;
                tL_inputPeerChannel.access_hash = L0.access_hash;
                return tL_inputPeerChannel;
            }
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j11;
            return tL_inputPeerChat;
        }
        TLRPC.User Z1 = Z1(Long.valueOf(j10));
        if (Z1 != null && Z1.access_hash == 0) {
            long j13 = Z1.fromMessageDialogId;
            if (j13 != 0 && j13 != j10 && Z1.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = j10;
                tL_inputPeerUserFromMessage.peer = i1(Z1.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = Z1.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = j10;
        if (Z1 != null) {
            tL_inputPeerUser.access_hash = Z1.access_hash;
        }
        return tL_inputPeerUser;
    }

    public final void i2() {
        if (this.f19286x2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = i1(this.f19286x2.f19798id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new ag.c3(8));
        Utilities.d.c(new ak(this, 18));
        g4();
    }

    public final void i3(long j10, TLRPC.InputPeer inputPeer, long j11) {
        long j12;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        wp wpVar;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j10);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                wpVar = this;
                j12 = j10;
                wpVar.q2(j12, 0L, null);
            } else {
                wpVar = this;
                j12 = j10;
            }
            getNotificationCenter().k(at.f14772r, 256);
            getMessagesStorage().F1(j12, true);
            int i10 = 0;
            while (true) {
                bp[] bpVarArr = wpVar.M;
                if (i10 < bpVarArr.length) {
                    bp bpVar = bpVarArr[i10];
                    if (bpVar != null && (bpVar.f15004g & 64) != 0) {
                        Q4(null);
                        getNotificationCenter().k(at.f14779s, new Object[0]);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        } else {
            j12 = j10;
        }
        if (!o5.C(j12)) {
            TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
            tL_messages_markDialogUnread.unread = true;
            if (inputPeer == null) {
                inputPeer = i1(j12);
            }
            if (!(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = inputPeer;
                tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
                if (j11 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
                    } catch (Exception e) {
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(9);
                        nativeByteBuffer.writeInt64(j12);
                        inputPeer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e7) {
                        exc = e7;
                        nativeByteBuffer2 = nativeByteBuffer;
                        f8.g(exc, true);
                        nativeByteBuffer = nativeByteBuffer2;
                        j11 = getMessagesStorage().z(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new tj(this, j11, 10));
                    }
                    j11 = getMessagesStorage().z(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new tj(this, j11, 10));
            }
        }
    }

    public final void i4(java.lang.String r40, sg.o0 r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.i4(java.lang.String, sg.o0):void");
    }

    public final boolean i5(int r30, long r31, java.util.ArrayList r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.i5(int, long, java.util.ArrayList):boolean");
    }

    public final void j(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.f19794id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z10 = chat.call_active;
        int i10 = at.A2;
        if (z10 && chat.call_not_empty && chat.migrated_to == null && !w3.r0(chat)) {
            if (chat2 == null) {
                hashMap.put(Long.valueOf(chat.f19794id), chat);
                getNotificationCenter().k(i10, new Object[0]);
            }
        } else if (chat2 == null) {
        } else {
            hashMap.remove(Long.valueOf(chat.f19794id));
            getNotificationCenter().k(i10, new Object[0]);
        }
    }

    public final void j0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        long j10;
        if (user != null) {
            j10 = user.f19943id;
        } else if (chat2 != null) {
            j10 = chat2.f19794id;
        } else {
            j10 = 0;
        }
        W(-chat.f19794id, j10);
    }

    public final void j2(org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var, boolean z10) {
        TLRPC.TL_theme tL_theme;
        String str;
        boolean z11;
        boolean z12;
        if (r6Var != null) {
            tL_theme = r6Var.f20745r;
        } else {
            tL_theme = s6Var.F;
        }
        if (r6Var != null) {
            str = r6Var.f20742o;
        } else {
            str = s6Var.e;
        }
        if (r6Var == null && s6Var.h) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (r6Var != null) {
            z12 = r6Var.f20744q;
        } else {
            z12 = s6Var.f20816n;
        }
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z10;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19865id = tL_theme.f19933id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new ag.c3(8));
        if (!TextUtils.isEmpty(str)) {
            TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = str;
            installwallpaper.wallpaper = tL_inputWallPaperSlug;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            installwallpaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.blur = z11;
            tL_wallPaperSettings.motion = z12;
            getConnectionsManager().sendRequest(installwallpaper, new ag.c3(8));
        }
    }

    public final void j3(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = (ArrayList) this.R.f(j10);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                kj kjVar = (kj) arrayList2.get(i10);
                if (kjVar != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (kjVar.f1() == ((Integer) arrayList.get(i11)).intValue()) {
                            kjVar.Z = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
    }

    public final void j4(int i10, long j10, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i10;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j10 == 0) {
            ArrayList V0 = V0(i10);
            if (V0.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = V0.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!dialog.pinned) {
                        if (dialog.f19798id != this.f19304z2) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(dialog.f19798id));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!o5.C(dialog.f19798id)) {
                            TLRPC.InputPeer i13 = i1(dialog.f19798id);
                            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-dialog.f19798id));
                            if (w3.Y(L0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().g1(L0.f19794id);
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeerCommunity);
                                objectSize = tL_inputDialogPeerCommunity.getObjectSize();
                            } else {
                                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                tL_inputDialogPeer.peer = i13;
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                                objectSize = tL_inputDialogPeer.getObjectSize();
                            }
                            i11 += objectSize;
                        }
                    }
                }
            }
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new fq(messagesStorage, arrayList2, arrayList3, 0));
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(i11 + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(16);
                nativeByteBuffer.writeInt32(i10);
                nativeByteBuffer.writeInt32(tL_messages_reorderPinnedDialogs.order.size());
                int size2 = tL_messages_reorderPinnedDialogs.order.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    tL_messages_reorderPinnedDialogs.order.get(i14).serializeToStream(nativeByteBuffer);
                }
            } catch (Exception e7) {
                e = e7;
                nativeByteBuffer2 = nativeByteBuffer;
                f8.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j10 = getMessagesStorage().z(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new tj(this, j10, 0));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new tj(this, j10, 0));
    }

    public final void j5(boolean z10) {
        if (this.P0.isEmpty()) {
            return;
        }
        if (!z10) {
            if (!((bp) this.P0.get(0)).e()) {
                int i10 = 1;
                while (true) {
                    if (i10 >= this.P0.size()) {
                        break;
                    } else if (((bp) this.P0.get(i10)).e()) {
                        this.P0.add(0, (bp) this.P0.remove(i10));
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            g3();
        } else {
            for (int i11 = 0; i11 < this.P0.size(); i11++) {
                ((bp) this.P0.get(i11)).f15012p = false;
            }
        }
        getMessagesStorage().y1();
        getNotificationCenter().k(at.O2, new Object[0]);
        O1().f48937x.b();
    }

    public final void k() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.f19943id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        U3(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.f19943id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        U3(tL_userForeign_old22, true, false);
    }

    public final void k0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i10) {
        long j10;
        TLRPC.InputPeer k12;
        if (user != null) {
            j10 = user.f19943id;
        } else if (chat2 != null) {
            j10 = chat2.f19794id;
        } else {
            j10 = 0;
        }
        long j11 = j10;
        if (i10 == 0) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new bq(3, -chat.f19794id, j11, messagesStorage));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = h1(chat);
        if (user != null) {
            k12 = m1(user);
        } else {
            k12 = k1(chat2);
        }
        tL_channels_deleteParticipantHistory.participant = k12;
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new r6(this, chat, user, chat2, 2));
    }

    public final void k2(int i10) {
        this.f19096c0.remove(i10);
        getNotificationCenter().k(at.f14832z5, Integer.valueOf(i10));
    }

    public final void k3(long j10, int i10, long j11) {
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new jr(messagesStorage, i10, -j10, j11, 0));
        if (j10 != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = g1(j10);
            tL_channels_readMessageContents.f19833id.add(Integer.valueOf(i10));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ag.c3(8));
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.f19899id.add(Integer.valueOf(i10));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new uj(this, 12));
    }

    public final void k4(int i10, long j10, boolean z10) {
        rh.x5 x5Var = new rh.x5(j10, i10);
        HashSet hashSet = this.f19217p8;
        if (hashSet.contains(x5Var)) {
            return;
        }
        hashSet.add(x5Var);
        this.f19225q8.add(new Pair(x5Var, new AtomicBoolean(z10)));
        ak akVar = this.f19235r8;
        i0.r(akVar);
        i0.g3(akVar);
    }

    public final void k5() {
        Iterator it;
        Iterator it2;
        boolean z10;
        String L0;
        String L02;
        String str;
        int i10;
        String L03;
        String L04;
        String L05;
        int i11;
        String L06;
        int i12;
        String a02;
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        Iterator it3 = this.V.entrySet().iterator();
        while (true) {
            int i13 = 1;
            if (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Long l4 = (Long) entry.getKey();
                boolean C = o5.C(l4.longValue());
                Iterator it4 = ((ConcurrentHashMap) entry.getValue()).entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Integer num = (Integer) entry2.getKey();
                    ArrayList arrayList = (ArrayList) entry2.getValue();
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    hVar.k(hVar3, l4.longValue());
                    hVar2.k(hVar4, l4.longValue());
                    if (l4.longValue() > 0 || C || arrayList.size() == i13) {
                        it = it3;
                        it2 = it4;
                        np npVar = (np) arrayList.get(0);
                        TLRPC.User Z1 = Z1(Long.valueOf(npVar.f17327b));
                        if (Z1 == null) {
                            it3 = it;
                            it4 = it2;
                            i13 = 1;
                        } else {
                            if (l4.longValue() < 0 && !C) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            TLRPC.SendMessageAction sendMessageAction = npVar.f17328c;
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                                if (z10) {
                                    L06 = dd.a0("IsRecordingAudio", null, 2131749109, b2(Z1));
                                } else {
                                    L06 = dd.L0(2131746366, null);
                                }
                                str = L06;
                                i10 = 1;
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                    if (z10) {
                                        L05 = dd.a0("IsRecordingRound", null, 2131749108, b2(Z1));
                                    } else {
                                        L05 = dd.L0(2131746365, null);
                                    }
                                    str = L05;
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                    if (z10) {
                                        str = dd.a0("IsSendingVideo", null, 2131749100, b2(Z1));
                                    } else {
                                        str = dd.L0(2131745592, null);
                                    }
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                        if (z10) {
                                            L04 = dd.a0("IsSendingAudio", null, 2131749104, b2(Z1));
                                        } else {
                                            L04 = dd.L0(2131745599, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                        if (z10) {
                                            L04 = dd.a0("IsSendingVideo", null, 2131749100, b2(Z1));
                                        } else {
                                            L04 = dd.L0(2131745592, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                        if (z10) {
                                            L04 = dd.a0("IsRecordingVideo", null, 2131749107, b2(Z1));
                                        } else {
                                            L04 = dd.L0(2131746362, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                        if (z10) {
                                            L04 = dd.a0("IsSendingFile", null, 2131749103, b2(Z1));
                                        } else {
                                            L04 = dd.L0(2131745598, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                        if (z10) {
                                            L04 = dd.a0("IsSendingPhoto", null, 2131749101, b2(Z1));
                                        } else {
                                            L04 = dd.L0(2131745595, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                        if (z10) {
                                            L03 = dd.a0("IsSendingGame", null, 2131749102, b2(Z1));
                                        } else {
                                            L03 = dd.L0(2131745597, null);
                                        }
                                        i10 = 3;
                                        str = L03;
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                            if (z10) {
                                                L0 = dd.a0("IsSelectingLocation", null, 2131749105, b2(Z1));
                                            } else {
                                                L0 = dd.L0(2131745663, null);
                                            }
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                            if (z10) {
                                                L0 = dd.a0("IsSelectingContact", null, 2131749106, b2(Z1));
                                            } else {
                                                L0 = dd.L0(2131745664, null);
                                            }
                                        } else {
                                            if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                                String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                                if (z10) {
                                                    L02 = dd.a0("IsEnjoyngAnimations", null, 2131749110, b2(Z1), str2);
                                                } else {
                                                    L02 = dd.a0("EnjoyngAnimations", null, 2131751126, str2);
                                                }
                                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                                if (z10) {
                                                    L02 = dd.a0("IsChoosingSticker", null, 2131749111, b2(Z1));
                                                } else {
                                                    L02 = dd.L0(2131752106, null);
                                                }
                                            } else if (z10) {
                                                L0 = dd.a0("IsTypingGroup", null, 2131749098, b2(Z1));
                                            } else {
                                                L0 = dd.L0(2131743943, null);
                                            }
                                            str = L02;
                                            i10 = 5;
                                        }
                                        str = L0;
                                        i10 = 0;
                                    }
                                    str = L04;
                                    i10 = 2;
                                }
                                i10 = 4;
                            }
                            i11 = i10;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int size = arrayList.size();
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                it = it3;
                                it2 = it4;
                                TLRPC.User Z12 = Z1(Long.valueOf(((np) obj).f17327b));
                                if (Z12 != null) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(b2(Z12));
                                    i15++;
                                }
                                i12 = i15;
                                if (i12 == 2) {
                                    break;
                                }
                                i15 = i12;
                                it3 = it;
                                it4 = it2;
                            } else {
                                it = it3;
                                it2 = it4;
                                i12 = i15;
                                break;
                            }
                        }
                        if (sb2.length() != 0) {
                            if (i12 == 1) {
                                a02 = dd.a0("IsTypingGroup", null, 2131749098, sb2.toString());
                            } else if (arrayList.size() > 2) {
                                try {
                                    a02 = String.format(dd.J0(arrayList.size() - 2, "AndMoreTypingGroup"), sb2.toString(), Integer.valueOf(arrayList.size() - 2));
                                } catch (Exception unused) {
                                    a02 = "LOC_ERR: AndMoreTypingGroup";
                                }
                            } else {
                                a02 = dd.a0("AreTypingGroup", null, 2131754121, sb2.toString());
                            }
                            str = a02;
                            i11 = 0;
                        } else {
                            i11 = 0;
                            str = null;
                        }
                    }
                    if (str != null) {
                        Paint paint = org.telegram.ui.ActionBar.t6.G0;
                        if (paint == null) {
                            paint = new Paint();
                            paint.setTypeface(i0.o());
                            paint.setTextSize(i0.L(14.0f));
                        }
                        hVar3.k(k6.m(str, paint.getFontMetricsInt(), false, null, 0), num.intValue());
                        hVar4.k(Integer.valueOf(i11), num.intValue());
                    }
                    it3 = it;
                    it4 = it2;
                    i13 = 1;
                }
            } else {
                this.f19086b0 = hVar.m();
                i0.g3(new yj(this, hVar, hVar2, 1));
                return;
            }
        }
    }

    public final void l(ArrayList arrayList, long j10) {
        int i10;
        a0.h hVar = this.K0;
        SparseArray sparseArray = (SparseArray) hVar.f(j10);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, j10);
            this.L0++;
        }
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((kj) sparseArray.valueAt(i11)).f16725t0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i12 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i13 = 0; i13 < size2; i13++) {
            kj kjVar = (kj) arrayList.get(i13);
            if (kjVar.D == 17) {
                TLRPC.MessageMedia messageMedia = kjVar.f16690k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i10 = poll.close_date) != 0) {
                        if (i10 <= currentTime) {
                            z10 = true;
                        } else {
                            i12 = Math.min(i12, i10 - currentTime);
                        }
                    }
                    int f12 = kjVar.f1();
                    kj kjVar2 = (kj) sparseArray.get(f12);
                    if (kjVar2 != null) {
                        kjVar2.f16725t0 = true;
                    } else {
                        sparseArray.put(f12, kjVar);
                    }
                }
            }
        }
        if (z10) {
            this.M0 = 0L;
        } else if (i12 < 5) {
            this.M0 = Math.min(this.M0, System.currentTimeMillis() - ((5 - i12) * 1000));
        }
    }

    public final void l0(TLRPC.TL_inputPhoto tL_inputPhoto) {
        TLRPC.Photo photo;
        long e = getUserConfig().e();
        if (tL_inputPhoto == null) {
            ep T0 = T0(e);
            ArrayList arrayList = T0.f15623b;
            if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
                T0.d(photo.f19818id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.f19928id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User Z1 = Z1(Long.valueOf(getUserConfig().e()));
            if (Z1 == null) {
                Z1 = getUserConfig().f();
            }
            if (Z1 == null) {
                return;
            }
            if (Z1.photo != null) {
                is messagesStorage = getMessagesStorage();
                messagesStorage.f16331a.c(new bq(4, Z1.f19943id, Z1.photo.photo_id, messagesStorage));
            }
            getNotificationCenter().k(at.f14728j0, new Object[0]);
            getNotificationCenter().k(at.f14772r, Integer.valueOf(D8));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new tj(this, e, 9));
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.f19927id.add(tL_inputPhoto);
        T0(e).d(tL_inputPhoto.f19813id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public final TLRPC.InputPeer l1(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.Chat L0 = L0(Long.valueOf(peer.channel_id));
            if (L0 != null && L0.access_hash == 0) {
                long j10 = L0.fromMessageDialogId;
                if (j10 != 0 && j10 != peer.channel_id && L0.fromMessageId != 0) {
                    TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannelFromMessage.channel_id = peer.channel_id;
                    tL_inputPeerChannelFromMessage.peer = i1(L0.fromMessageDialogId);
                    tL_inputPeerChannelFromMessage.msg_id = L0.fromMessageId;
                    return tL_inputPeerChannelFromMessage;
                }
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = peer.channel_id;
            if (L0 != null) {
                tL_inputPeerChannel.access_hash = L0.access_hash;
            }
            return tL_inputPeerChannel;
        } else {
            TLRPC.User Z1 = Z1(Long.valueOf(peer.user_id));
            if (Z1 != null && Z1.access_hash == 0 && Z1.fromMessageDialogId != 0 && Z1.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = peer.user_id;
                tL_inputPeerUserFromMessage.peer = i1(Z1.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = Z1.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = peer.user_id;
            if (Z1 != null) {
                tL_inputPeerUser.access_hash = Z1.access_hash;
            }
            return tL_inputPeerUser;
        }
    }

    public final void l2() {
        this.f19200n8 = null;
        this.f19190m8 = 0L;
    }

    public final void l3(long j10, long j11) {
        if (!o5.C(j10) && j10 != getUserConfig().e()) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new jr(messagesStorage, j11, j10, 0, 7));
            TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
            tL_messages_readMentions.peer = i1(j10);
            if (j11 != 0) {
                tL_messages_readMentions.top_msg_id = (int) j11;
                tL_messages_readMentions.flags |= 1;
            }
            getConnectionsManager().sendRequest(tL_messages_readMentions, null);
        }
    }

    public final void l4(long j10, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (user != null || chat != null || encryptedChat != null) {
            SharedPreferences.Editor edit = this.e7.edit();
            edit.putInt("dialog_bar_vis3" + j10, 3);
            edit.commit();
            if (o5.C(j10)) {
                if (encryptedChat != null && encryptedChat.access_hash != 0) {
                    TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.f19802id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new ag.c3(8), 2);
                }
            } else if (z10) {
                TL_account.reportPeer reportpeer = new TL_account.reportPeer();
                if (chat != null) {
                    reportpeer.peer = i1(-chat.f19794id);
                } else if (user != null) {
                    reportpeer.peer = i1(user.f19943id);
                }
                reportpeer.message = "";
                reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
                getConnectionsManager().sendRequest(reportpeer, new ag.c3(8), 2);
            } else {
                TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
                if (chat != null) {
                    tL_messages_reportSpam.peer = i1(-chat.f19794id);
                } else if (user != null) {
                    tL_messages_reportSpam.peer = i1(user.f19943id);
                }
                getConnectionsManager().sendRequest(tL_messages_reportSpam, new ag.c3(8), 2);
            }
        }
    }

    public final boolean l5(ArrayList arrayList, long j10) {
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        ConcurrentHashMap concurrentHashMap = this.V;
        if (i10 > 0) {
            if (((ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j10))) != null) {
                concurrentHashMap.remove(Long.valueOf(j10));
                return true;
            }
        } else if (i10 < 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                kj kjVar = (kj) obj;
                if (kjVar.p3() && !arrayList2.contains(Long.valueOf(kjVar.f16690k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(kjVar.f16690k.from_id.user_id));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j10));
            if (concurrentHashMap2 != null) {
                ArrayList arrayList3 = null;
                z10 = false;
                for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        if (arrayList2.contains(Long.valueOf(((np) arrayList4.get(i12)).f17327b))) {
                            arrayList4.remove(i12);
                            i12--;
                            if (arrayList4.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(num);
                            }
                            z10 = true;
                        }
                        i12++;
                    }
                }
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        concurrentHashMap2.remove(arrayList3.get(i13));
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

    public final void m(final long j10, final TLRPC.User user, int i10, String str, final org.telegram.ui.ActionBar.k2 k2Var, final boolean z10, final Runnable runnable, final hp hpVar, final r20 r20Var) {
        boolean z11;
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (hpVar != null) {
                hpVar.a(null);
            }
            if (r20Var != null) {
                r20Var.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat L0 = L0(Long.valueOf(j10));
        final boolean T = w3.T(L0);
        if (T && L0.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        final boolean z12 = z11;
        final TLRPC.InputUser p12 = p1(user);
        if (str != null && (!T || z12)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = p12;
            if (T) {
                tL_messages_startBot.peer = i1(-j10);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j10;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.f14520b.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (T) {
            if (p12 instanceof TLRPC.TL_inputUserSelf) {
                Long valueOf = Long.valueOf(j10);
                ArrayList arrayList = this.f19191n;
                if (arrayList.contains(valueOf)) {
                    if (hpVar != null) {
                        hpVar.a(null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = g1(j10);
                arrayList.add(Long.valueOf(j10));
                tL_messages_addChatUser = tL_channels_joinChannel;
            } else {
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = g1(j10);
                tL_channels_inviteToChannel.users.add(p12);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j10;
            tL_messages_addChatUser2.fwd_limit = i10;
            tL_messages_addChatUser2.user_id = p12;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z13;
                final wp wpVar = wp.this;
                final boolean z14 = T;
                final TLRPC.InputUser inputUser = p12;
                long j11 = j10;
                if (z14 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    i0.g3(new xk(wpVar, j11, 11));
                }
                r20 r20Var2 = r20Var;
                Runnable runnable2 = runnable;
                TLRPC.User user2 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        i0.g3(new pi(19, r20Var2, runnable2));
                        return;
                    } else if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user2.f19943id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        i0.g3(new xm(wpVar, r20Var2, tL_messages_invitedUsers, j11, 0));
                        return;
                    } else {
                        i0.g3(new qf(r20Var2, 7));
                        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z10) {
                            if (runnable2 != null) {
                                i0.g3(runnable2);
                                return;
                            }
                            return;
                        }
                        final hp hpVar2 = hpVar;
                        final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        final TLObject tLObject2 = tL_messages_addChatUser3;
                        final boolean z15 = z12;
                        if (hpVar2 != null) {
                            i0.g3(new lh(wpVar, hpVar2, tL_error, k2Var2, tLObject2, z14, z15));
                        }
                        i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z16;
                                wp wpVar2 = wp.this;
                                hp hpVar3 = hpVar2;
                                boolean z17 = z14;
                                if (hpVar3 == null) {
                                    int i11 = wpVar2.currentAccount;
                                    if (z17 && !z15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    org.telegram.ui.Components.s4.e0(i11, tL_error, k2Var2, tLObject2, Boolean.valueOf(z16));
                                }
                                if (z17 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                                    wpVar2.getNotificationCenter().k(at.f14772r, 8192);
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
                    i0.g3(new d4(wpVar, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j11, 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                    updates = tL_messages_invitedUsers2.updates;
                } else if (tLObject instanceof TLRPC.Updates) {
                    updates = (TLRPC.Updates) tLObject;
                } else {
                    f8.d("unexpected " + tLObject + " in addUserToChat");
                    i0.g3(new qf(r20Var2, 8));
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i11);
                        if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                            z13 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z13 = false;
                        break;
                    }
                }
                wpVar.L3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    i0.g3(new zm(wpVar, updates, r20Var2, tL_messages_invitedUsers2, j11, 0));
                    return;
                }
                if (z14) {
                    if (!z13 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        wpVar.B0(j11, true);
                    }
                    i0.h3(new xk(wpVar, j11, 13), 1000L);
                }
                if (z14 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    wpVar.getMessagesStorage().R1(-j11, j11, new ArrayList(), null);
                }
                if (runnable2 != null) {
                    i0.g3(runnable2);
                }
                if (r20Var2 != null) {
                    i0.g3(new qf(r20Var2, 6));
                }
                if (i20.B(user2) && !w3.V(L0) && z13) {
                    i0.g3(new xk(wpVar, j11, 12));
                }
            }
        });
    }

    public final void m2(int i10, long j10) {
        if (this.f19219q1.contains(Long.valueOf(j10))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.f19228r1;
        int indexOfKey = longSparseLongArray.indexOfKey(j10);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        U2(Z1(Long.valueOf(j10)), i10, true, null);
    }

    public final void m3(long j10, int i10, long j11) {
        TLRPC.EncryptedChat Z0;
        if (j11 != 0 && j10 != 0) {
            if ((i10 > 0 || i10 == Integer.MIN_VALUE) && o5.C(j10) && (Z0 = Z0(Integer.valueOf((int) (j10 & 4294967295L)))) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j11));
                getSecretChatHelper().u(Z0, arrayList, null);
                if (i10 > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    is messagesStorage = getMessagesStorage();
                    messagesStorage.f16331a.c(new fr(messagesStorage, Z0.f19802id, arrayList, 0, currentTime, currentTime));
                }
            }
        }
    }

    public final void m4() {
        this.F3 = false;
        this.J5 = false;
        this.I3 = false;
        this.H3 = false;
        this.P5 = false;
        this.Q5 = false;
        this.f19174k7 = true;
        this.R5 = 1024;
        this.G6 = false;
        this.N6 = 0L;
        this.O6 = 0L;
        this.P6 = "t.me/spambot";
        this.f19270v6 = null;
        this.f19280w6 = "GB";
        this.D4 = new HashSet();
        m5.d(m5.d(this.f7.edit().remove("starsLocked").remove("getfileExperimentalParams").remove("smsjobsStickyNotificationEnabled").remove("channelRevenueWithdrawalEnabled"), "showAnnualPerMonth", "canEditFactcheck", "factcheckLengthLimit", "videoIgnoreAltDocuments"), "freezeSinceDate", "freezeUntilDate", "freezeAppealUrl", "verifyAgeBotUsername").remove("verifyAgeCountry").remove("ignoreRestrictionReasons").apply();
    }

    public final void m5(long j10, String str, long j11) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        L0(Long.valueOf(j10));
        a0.h hVar = (a0.h) this.f19285x1.f(j10);
        if (hVar != null && (channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j11)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull M0 = M0(j10);
        if (M0 != null && M0.participants != null) {
            for (int i10 = 0; i10 < M0.participants.participants.size(); i10++) {
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i10);
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
        at.f(this.currentAccount).k(at.f14772r, 0);
        at.f(this.currentAccount).k(at.W3, Long.valueOf(j10), Long.valueOf(j11), str2);
        is a02 = is.a0(this.currentAccount);
        a02.f16331a.c(new xq(a02, -j10, j11, str2, 0));
    }

    public final void n(long j10, TLRPC.User user, String str, org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        m(j10, user, 0, str, k2Var, false, runnable, null, null);
    }

    public final void n0(int i10, long j10, SparseArray sparseArray) {
        Utilities.d.c(new cl(this, i10, 1));
        if (sparseArray != null) {
            i0.g3(new d4(this, j10, sparseArray, 15));
        }
    }

    public final TLRPC.InputUser n1(long j10) {
        return p1(Z1(Long.valueOf(j10)));
    }

    public final boolean n2(TLRPC.Chat chat) {
        TLRPC.Chat L0;
        if (chat == null) {
            return false;
        }
        TLRPC.InputChannel inputChannel = chat.migrated_to;
        if (inputChannel != null && (L0 = L0(Long.valueOf(inputChannel.channel_id))) != null) {
            return L0.noforwards;
        }
        return chat.noforwards;
    }

    public final void n3(long r13, int r15, org.telegram.tgnet.TLRPC.InputChannel r16, int r17, long r18, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.n3(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public final void n4(boolean r23, final int r24, final int r25, final int r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.n4(boolean, int, int, int, int):void");
    }

    public final void n5(long r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.n5(long):void");
    }

    public final void o(TLRPC.Chat chat, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, int i10, q0.a aVar, q0.a aVar2, pd0 pd0Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j10 = chat2.f19794id;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            m(j10, user, i10, null, k2Var, false, new pi(23, aVar, user), new p(4, aVar2, user), new uk(this, tL_messages_invitedUsers, iArr, size, chat2, pd0Var));
            U3(user, false, false);
            chat2 = chat;
        }
    }

    public final void o0(boolean z10) {
        TLRPC.UserFull a2 = a2(getUserConfig().e());
        if (a2 != null) {
            a2.sponsored_enabled = false;
            getMessagesStorage().j2(a2, false);
            if (z10) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final TLRPC.InputUser o1(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (inputPeer.access_hash == 0) {
            TLRPC.User Z1 = Z1(Long.valueOf(inputPeer.user_id));
            if (Z1.access_hash == 0 && Z1.fromMessageDialogId != 0 && Z1.fromMessageId != 0) {
                TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
                tL_inputUserFromMessage.user_id = inputPeer.user_id;
                tL_inputUserFromMessage.peer = i1(Z1.fromMessageDialogId);
                tL_inputUserFromMessage.msg_id = Z1.fromMessageId;
                return tL_inputUserFromMessage;
            }
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public final boolean o2(long j10) {
        if (j10 < 0) {
            return w3.Y(L0(Long.valueOf(-j10)));
        }
        return false;
    }

    public final void o3(kj kjVar) {
        if (kjVar.f16710p1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (kjVar.f16690k.mentioned) {
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new jr(messagesStorage, kjVar.f1(), -kjVar.f16690k.peer_id.channel_id, kj.B0(kjVar.f16690k), 0));
        }
        arrayList.add(Integer.valueOf(kjVar.f1()));
        long B0 = kj.B0(kjVar.f16690k);
        getMessagesStorage().S0(0, 0, B0, arrayList);
        getNotificationCenter().k(at.C0, Long.valueOf(B0), arrayList);
        if (kjVar.f1() < 0) {
            m3(kj.B0(kjVar.f16690k), Integer.MIN_VALUE, kjVar.f16690k.random_id);
        } else if (kjVar.f16690k.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = g1(kjVar.f16690k.peer_id.channel_id);
            tL_channels_readMessageContents.f19833id.add(Integer.valueOf(kjVar.f1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ag.c3(8));
        } else {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.f19899id.add(Integer.valueOf(kjVar.f1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new uj(this, 5));
        }
    }

    public final void o4(kj kjVar) {
        long j10;
        if (kjVar == null) {
            return;
        }
        is messagesStorage = getMessagesStorage();
        long B0 = kj.B0(kjVar.f16690k);
        int P0 = kjVar.P0();
        messagesStorage.getClass();
        a0.h hVar = new a0.h(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        hVar.k(arrayList, B0);
        messagesStorage.I(new xf((Object) messagesStorage, (Object) hVar, false, 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = i1(kj.B0(kjVar.f16690k));
        TLRPC.Message message = kjVar.f16690k;
        if (message != null) {
            j10 = message.ephemeralReceiverBotId;
        } else {
            j10 = 0;
        }
        tL_deleteMessage.receiver_id = n1(j10);
        tL_deleteMessage.f20009id = kjVar.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new z1(2));
    }

    public final void o5(HashSet hashSet) {
        n5(0L);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            n5(((Long) it.next()).longValue());
        }
    }

    public final void p(String str, boolean z10) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z10;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new jl(this, 4));
    }

    public final void p0(long j10, int i10, long j11) {
        getMessagesStorage().q1(j10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i10));
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new ur(messagesStorage, arrayList, j11, 1));
    }

    public final TLRPC.InputUser p1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.f19943id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
            tL_inputUserFromMessage.user_id = user.f19943id;
            tL_inputUserFromMessage.peer = i1(user.fromMessageDialogId);
            tL_inputUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputUserFromMessage;
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.f19943id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public final boolean p2(long j10, long j11) {
        return q2(j10, j11, null);
    }

    public final void p3(long j10, long j11) {
        long j12;
        ArrayList l4;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        y00 y00Var = this.f19234r7;
        if (i10 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j10);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((s2(j10) || y2(j10)) && (l4 = y00Var.l((j12 = -j10))) != null) {
                for (int i11 = 0; i11 < l4.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i11);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                y00Var.y(j12, true);
            }
        } else {
            long j13 = -j10;
            TLRPC.TL_forumTopic f7 = y00Var.f(j13, j11);
            if (f7 != null && f7.unread_poll_votes_count > 0) {
                f7.unread_poll_votes_count = 0;
                y00Var.y(j13, true);
            }
        }
        getMessagesStorage().h2(0, j10, j11, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = i1(j10);
        if (i10 != 0 && !x2(j10)) {
            tL_messages_readPollVotes.top_msg_id = (int) j11;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new ag.c3(8));
        at.f(this.currentAccount).k(at.f14772r, 1048576);
    }

    public final boolean p4() {
        String str = ((q0) this.f19300y7.f18018a0.f13481b).f17725c;
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

    public final boolean p5(long j10, sg.o0 o0Var, boolean z10) {
        long j11;
        int i10;
        if (this.f19094b8 == null) {
            return false;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                j11 = 0;
            } else {
                j11 = j10;
            }
            if (i11 != 1 || j11 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.f19094b8.f(j11);
                if (tL_messages_savedReactionsTags == null) {
                    if (j11 != 0) {
                        a0.h hVar = this.f19094b8;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        hVar.k(tL_messages_savedReactionsTags, j11);
                    }
                }
                int i12 = 0;
                boolean z12 = false;
                while (i12 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i12);
                    if (o0Var.f(tL_savedReactionTag.reaction)) {
                        int i13 = tL_savedReactionTag.count;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int max = Math.max(0, i10 + i13);
                        tL_savedReactionTag.count = max;
                        if (max <= 0) {
                            tL_messages_savedReactionsTags.tags.remove(i12);
                            i12--;
                        } else if (max == i13) {
                            z12 = true;
                        }
                        z11 = true;
                        z12 = true;
                    }
                    i12++;
                }
                if (!z12 && z10) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                    tL_savedReactionTag2.reaction = o0Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void q(org.telegram.tgnet.TLRPC.TL_jsonObject r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.q(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    public final boolean q2(long j10, long j11, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb2 = new StringBuilder("notify2_");
        boolean z10 = false;
        sb2.append(pt.v(j10, j11, false));
        String sb3 = sb2.toString();
        SharedPreferences sharedPreferences = this.e7;
        int i10 = sharedPreferences.getInt(sb3, -1);
        if (i10 == -1) {
            if (chat != null) {
                if (w3.T(chat) && !chat.megagroup) {
                    z10 = true;
                }
                bool = Boolean.valueOf(z10);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            if (j11 != 0) {
                return q2(j10, 0L, chat);
            }
            return !getNotificationsController().D(j10, bool2, false, false);
        } else if (i10 == 2) {
            return true;
        } else {
            if (i10 == 3) {
                if (sharedPreferences.getInt("notifyuntil_" + pt.v(j10, j11, false), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void q3(long j10, long j11) {
        long j12;
        ArrayList l4;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        y00 y00Var = this.f19234r7;
        if (i10 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j10);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((s2(j10) || y2(j10)) && (l4 = y00Var.l((j12 = -j10))) != null) {
                for (int i11 = 0; i11 < l4.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i11);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                y00Var.y(j12, true);
            }
        } else {
            long j13 = -j10;
            TLRPC.TL_forumTopic f7 = y00Var.f(j13, j11);
            if (f7 != null && f7.unread_reactions_count > 0) {
                f7.unread_reactions_count = 0;
                y00Var.y(j13, true);
            }
        }
        getMessagesStorage().i2(0, j10, j11, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = i1(j10);
        if (i10 != 0) {
            if (x2(j10)) {
                tL_messages_readReactions.saved_peer_id = i1(j11);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j11;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new ag.c3(8));
        at.f(this.currentAccount).k(at.f14772r, 1048576);
    }

    public final void q4(Object obj, TLRPC.Document document) {
        if (obj != null && kj.s3(document, false)) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_messages_saveGif.f19903id = tL_inputDocument;
            tL_inputDocument.f19806id = document.f19800id;
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

    public final void q5(TLObject tLObject, String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = this.e;
            concurrentHashMap.remove(str);
            if (z10) {
                concurrentHashMap.put(str.toLowerCase(), tLObject);
            }
        }
    }

    public final void r(ArrayList arrayList) {
        SharedPreferences.Editor edit = r1(this.currentAccount).e7.edit();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                qt qtVar = getNotificationsController().f17654g0;
                qtVar.getClass();
                long C1 = kj.C1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(a1.g.l(C1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + C1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(qtVar.f17814a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) != 0) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                            edit.putInt("notify2_" + C1, 2);
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        } else {
                            edit.putInt("notify2_" + C1, 3);
                            edit.putInt(a1.g.l(C1, "notifyuntil_"), dialog.notify_settings.mute_until);
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

    public final void r0(int i10, boolean[] zArr) {
        ArrayList arrayList;
        if (i10 == 0) {
            return;
        }
        long j10 = 2305843009213693952L | i10;
        a0.h hVar = this.Q;
        if (((TLRPC.Dialog) hVar.f(j10)) instanceof TLRPC.TL_dialogFolder) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.f19798id = j10;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.f19845id = i10;
        tL_folder.title = dd.L0(2131754136, null);
        tL_dialogFolder.pinned = true;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f19293y;
            if (i11 >= arrayList.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!dialog.pinned) {
                if (dialog.f19798id != this.f19304z2) {
                    break;
                }
            } else {
                i12 = Math.max(dialog.pinnedNum, i12);
            }
            i11++;
        }
        tL_dialogFolder.pinnedNum = i12 + 1;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        tL_messages_dialogs.dialogs.add(tL_dialogFolder);
        getMessagesStorage().d1(tL_messages_dialogs, 1);
        hVar.k(tL_dialogFolder, j10);
        arrayList.add(0, tL_dialogFolder);
    }

    public final boolean r2(long j10, long j11) {
        return this.e7.getBoolean("sound_enabled_" + pt.v(j10, j11, false), true);
    }

    public final boolean r3(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (tL_chatAdminRights != null) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = null;
            if (chat != null && user != null) {
                if (i20.B(user)) {
                    tL_chatAdminRights2 = chat.admin_rights;
                } else {
                    TLRPC.ChatFull M0 = M0(chat.f19794id);
                    if (M0 != null && (chatParticipants = M0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            TLRPC.ChatParticipant chatParticipant = arrayList.get(i10);
                            if (chatParticipant != null && chatParticipant.user_id == user.f19943id) {
                                if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                                    tL_chatAdminRights2 = channelParticipant.admin_rights;
                                }
                            } else {
                                i10++;
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

    public final void r4(long j10, TLRPC.PeerSettings peerSettings) {
        boolean z10;
        int i10;
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.e7;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i11 = 2;
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(a1.g.l(j10, "dialog_botid"), peerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j10, peerSettings.business_bot_manage_url);
            String str = "dialog_botflags" + j10;
            boolean z11 = peerSettings.business_bot_paused;
            if (peerSettings.business_bot_can_reply) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            edit.putInt(str, (z11 ? 1 : 0) + i10);
        } else {
            edit.remove("dialog_botid" + j10).remove("dialog_boturl" + j10).remove("dialog_botflags" + j10);
        }
        edit.putLong(a1.g.l(j10, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        int i12 = sharedPreferences.getInt("dialog_bar_vis3" + j10, 0);
        int i13 = at.Q0;
        if (i12 == 3) {
            edit.apply();
            getNotificationCenter().k(i13, Long.valueOf(j10));
            return;
        }
        if (peerSettings.flags == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (v2.f18578a) {
            StringBuilder s10 = a1.g.s(j10, "peer settings loaded for ", " add = ");
            s10.append(peerSettings.add_contact);
            s10.append(" block = ");
            s10.append(peerSettings.block_contact);
            s10.append(" spam = ");
            s10.append(peerSettings.report_spam);
            s10.append(" share = ");
            s10.append(peerSettings.share_contact);
            s10.append(" geo = ");
            s10.append(peerSettings.report_geo);
            s10.append(" hide = ");
            s10.append(z10);
            s10.append(" distance = ");
            s10.append(peerSettings.geo_distance);
            s10.append(" invite = ");
            s10.append(peerSettings.invite_members);
            f8.b(s10.toString());
        }
        String l4 = a1.g.l(j10, "dialog_bar_vis3");
        if (z10) {
            i11 = 1;
        }
        edit.putInt(l4, i11);
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
                edit.putInt(a1.g.l(j10, "dialog_bar_distance"), peerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j10);
            }
        }
        if (j10 == getUserConfig().e()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        this.f19211p1.k(peerSettings, j10);
        getNotificationCenter().k(i13, Long.valueOf(j10));
    }

    public final void r5(boolean z10, boolean z11) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z10;
            tL_webBrowserSettings.display_close_button = z11;
            N4(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z10;
        updatewebbrowsersettings.display_close_button = z11;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new a3.b(1), new jl(this, 1));
    }

    public final boolean s(ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            TL_update.TL_updateFolderPeers tL_updateFolderPeers = (TL_update.TL_updateFolderPeers) arrayList.get(i10);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i11);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(o5.o(tL_folderPeer.peer));
                if (dialog != null) {
                    int i12 = dialog.folder_id;
                    int i13 = tL_folderPeer.folder_id;
                    if (i12 != i13) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i13;
                        this.f19167k0 = true;
                        D();
                    }
                }
            }
            getMessagesStorage().G1(((TL_update.TL_updateFolderPeers) arrayList.get(i10)).folder_peers, null, 0L, 0);
            i10++;
            z10 = true;
        }
        return z10;
    }

    public final Runnable s0(long j10, int i10, kp kpVar) {
        int i11;
        long j11;
        int i12;
        wp wpVar;
        SharedPreferences sharedPreferences = r1(this.currentAccount).e7;
        if (i10 == 0) {
            i11 = sharedPreferences.getInt("diditem" + j10, 0);
        } else {
            i11 = i10;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        if (o5.z(j10)) {
            j11 = -j10;
        } else {
            j11 = 0;
        }
        if (j11 != 0 && getMessagesController().L0(Long.valueOf(j11)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            is messagesStorage = getMessagesStorage();
            messagesStorage.f16331a.c(new al(this, zArr, messagesStorage, j11, runnableArr, j10, i11, kpVar));
            return new bl(zArr, runnableArr, 0);
        }
        if (i0.Q1()) {
            i12 = 30;
        } else {
            i12 = 20;
        }
        int i13 = i12;
        int i14 = i11;
        uo uoVar = new uo(this, generateClassGuid, i13, i14, j10, kpVar);
        getNotificationCenter().b(uoVar, at.H);
        getNotificationCenter().b(uoVar, at.I);
        if (i14 != 0) {
            wpVar = this;
            wpVar.X2(j10, 0L, true, i13, i14, 0, true, 0, generateClassGuid, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            wpVar = this;
            wpVar.X2(j10, 0L, true, i13, i14, 0, true, 0, generateClassGuid, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new cl(wpVar, generateClassGuid, 0);
    }

    public final SharedPreferences s1() {
        return this.f7;
    }

    public final boolean s2(long j10) {
        if (j10 < 0) {
            TLRPC.Chat L0 = L0(Long.valueOf(-j10));
            if (L0 != null && L0.forum) {
                return true;
            }
            return false;
        }
        return i20.u(Z1(Long.valueOf(j10)));
    }

    public final boolean s4(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList arrayList) {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        sparseIntArray.clear();
        int i10 = 0;
        while (true) {
            String str2 = null;
            int i11 = 1;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof TLRPC.TL_jsonString) {
                    str2 = ((TLRPC.TL_jsonString) arrayList.get(i10)).value;
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
                            i11 = 7;
                            break;
                        case 1:
                            i11 = 4;
                            break;
                        case 2:
                            i11 = 21;
                            break;
                        case 3:
                            i11 = 33;
                            break;
                        case 4:
                            i11 = 30;
                            break;
                        case 5:
                            i11 = 36;
                            break;
                        case 6:
                            i11 = 37;
                            break;
                        case 7:
                            i11 = 25;
                            break;
                        case '\b':
                            i11 = 18;
                            break;
                        case '\t':
                            i11 = 14;
                            break;
                        case '\n':
                            i11 = 38;
                            break;
                        case 11:
                            i11 = 29;
                            break;
                        case '\f':
                            i11 = 23;
                            break;
                        case '\r':
                            i11 = 8;
                            break;
                        case 14:
                            i11 = 22;
                            break;
                        case 15:
                            i11 = 27;
                            break;
                        case 16:
                            i11 = 11;
                            break;
                        case 17:
                            i11 = 13;
                            break;
                        case 18:
                            i11 = 28;
                            break;
                        case 19:
                            i11 = 3;
                            break;
                        case 20:
                            break;
                        case 21:
                            i11 = 12;
                            break;
                        case 22:
                            i11 = 6;
                            break;
                        case 23:
                            i11 = 2;
                            break;
                        case 24:
                            i11 = 32;
                            break;
                        case 25:
                            i11 = 5;
                            break;
                        case 26:
                            i11 = 0;
                            break;
                        case 27:
                            i11 = 39;
                            break;
                        case 28:
                            i11 = 40;
                            break;
                        case 29:
                            i11 = 35;
                            break;
                        case 30:
                            i11 = 17;
                            break;
                        case 31:
                            i11 = 15;
                            break;
                        case ' ':
                            i11 = 31;
                            break;
                        case '!':
                            i11 = 42;
                            break;
                        case '\"':
                            i11 = 34;
                            break;
                        case '#':
                            i11 = 20;
                            break;
                        case '$':
                            i11 = 41;
                            break;
                        case '%':
                            i11 = 19;
                            break;
                        case '&':
                            i11 = 9;
                            break;
                        case '\'':
                            i11 = 16;
                            break;
                        case '(':
                            i11 = 43;
                            break;
                        case ')':
                            i11 = 24;
                            break;
                        case '*':
                            i11 = 10;
                            break;
                        case '+':
                            i11 = 26;
                            break;
                        default:
                            i11 = -1;
                            break;
                    }
                    if (i11 >= 0) {
                        sparseIntArray.put(i11, i10);
                        if (sb2.length() > 0) {
                            sb2.append('_');
                        }
                        sb2.append(i11);
                        i10++;
                    }
                }
                i10++;
            } else {
                int length = sb2.length();
                SharedPreferences sharedPreferences = this.f7;
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

    public final void t(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (v7.u7.a(tL_updateWebBrowserException.flags, 1)) {
                if (tL_updateWebBrowserException.open_external_browser) {
                    m0(this.f19310z8.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    m0(this.f19310z8.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                m0(this.f19310z8.external_exceptions, tL_updateWebBrowserException.exception);
                m0(this.f19310z8.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            m0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            m0(this.f19310z8.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            m0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            m0(this.f19310z8.external_exceptions, tL_updateWebBrowserException.exception);
        }
        N4(this.f19310z8);
    }

    public final int t1() {
        k2.m0 m0Var;
        boolean q6 = getUserConfig().q();
        s0 s0Var = this.f19300y7;
        if (q6) {
            m0Var = s0Var.f18022c0;
        } else {
            m0Var = s0Var.f18020b0;
        }
        return ((l0) m0Var.f10701a).f16855c;
    }

    public final boolean t2(kj kjVar) {
        if (kjVar != null && s2(kj.B0(kjVar.f16690k))) {
            return true;
        }
        return false;
    }

    public final void t3(bp bpVar) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.M[i10] == bpVar) {
                Q4(null);
                getNotificationCenter().k(at.f14779s, Boolean.TRUE);
                return;
            }
        }
    }

    public final void t4(long j10, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().f16331a.c(new d4(this, j10, tL_messages_savedReactionsTags, 18));
    }

    public final void u(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f19310z8;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        N4(tL_webBrowserSettings);
    }

    public final TLRPC.Chat u1(long j10) {
        TLRPC.Chat L0;
        TLRPC.Chat L02;
        TLRPC.Chat L03 = L0(Long.valueOf(j10));
        if (L03 != null && (L02 = L0(Long.valueOf(L03.linked_monoforum_id))) != null) {
            return L02;
        }
        Long l4 = (Long) this.f19122f.get(Long.valueOf(j10));
        if (l4 != null && (L0 = L0(l4)) != null) {
            return L0;
        }
        return null;
    }

    public final boolean u2() {
        if (this.N6 != 0 && this.O6 != 0) {
            return true;
        }
        return false;
    }

    public final void u3(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, String str, int i10, gf.e eVar, boolean z10, boolean z11) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (eVar != null) {
            eVar.f7486b = new wk(1, zArr);
            eVar.d();
        }
        bm bmVar = new bm(this, k2Var, eVar, zArr, user, str, z10, z11, r9);
        vi mediaDataController = getMediaDataController();
        long j10 = user.f19943id;
        HashMap hashMap = mediaDataController.f18681v1;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hashMap.get(j10 + "_" + j10);
        TL_bots.BotInfo[] botInfoArr = {botInfo};
        if (user.bot_has_main_app) {
            bmVar.run();
        } else if (botInfo == null) {
            vi mediaDataController2 = getMediaDataController();
            long j11 = user.f19943id;
            mediaDataController2.G0(j11, j11, false, i10, new uk(this, zArr, botInfoArr, user, i10, bmVar));
        } else {
            bmVar.run();
        }
    }

    public final void u4(org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var, boolean z10, boolean z11) {
        TLRPC.TL_theme tL_theme;
        if (r6Var != null) {
            tL_theme = r6Var.f20745r;
        } else {
            tL_theme = s6Var.F;
        }
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19865id = tL_theme.f19933id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z11;
            getConnectionsManager().sendRequest(savetheme, new ag.c3(8));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z11) {
            j2(s6Var, r6Var, z10);
        }
    }

    public final void v(int i10, int i11, long j10, String str, boolean z10) {
        String str2 = j10 + "_" + i10;
        HashMap hashMap = this.f19254t8;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z10;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().i1(j10);
        tL_messages_toggleSuggestedPostApproval.msg_id = i10;
        if (i11 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i11;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z10 && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j10 + "_" + i10, Boolean.valueOf(!z10));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new nm(this, j10, i10, 0));
    }

    public final void v0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i11);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long o10 = o5.o(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && o10 != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i12);
                        if (o10 == kj.B0(message) && dialog.top_message == message.f19815id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.f19845id;
                            tL_dialog.flags |= 16;
                            tL_messages_peerDialogs.dialogs.add(tL_dialog);
                            TLRPC.Peer peer = dialog.peer;
                            if (peer instanceof TLRPC.TL_peerChannel) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerUser.channel_id = dialog.peer.channel_id;
                                int size3 = tL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i10 >= size3) {
                                        break;
                                    }
                                    TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i10);
                                    if (chat.f19794id == tL_inputPeerUser.channel_id) {
                                        tL_inputPeerUser.access_hash = chat.access_hash;
                                        break;
                                    }
                                    i10++;
                                }
                            } else if (peer instanceof TLRPC.TL_peerChat) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerUser.chat_id = dialog.peer.chat_id;
                            } else {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                                tL_inputPeerUser.user_id = dialog.peer.user_id;
                                int size4 = tL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i10 >= size4) {
                                        break;
                                    }
                                    TLRPC.User user = tL_messages_peerDialogs.users.get(i10);
                                    if (user.f19943id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            d3(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
                tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
            }
        }
    }

    public final void v1(final long j10, final long j11, final int i10, final boolean z10, final q0.a aVar) {
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
        getMessagesStorage().f16331a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mm.run():void");
            }
        });
    }

    public final boolean v2(long j10) {
        ArrayList arrayList = this.R0;
        if (!arrayList.isEmpty() && arrayList.contains(Long.valueOf(j10))) {
            return true;
        }
        return false;
    }

    public final void v3(java.lang.String r11, org.telegram.ui.ActionBar.k2 r12, int r13, gf.e r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.v3(java.lang.String, org.telegram.ui.ActionBar.k2, int, gf.e):void");
    }

    public final void v4(org.telegram.ui.ActionBar.s6 r20, org.telegram.ui.ActionBar.r6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.v4(org.telegram.ui.ActionBar.s6, org.telegram.ui.ActionBar.r6):void");
    }

    public final void w(long j10) {
        TLRPC.Chat L0;
        TLRPC.User user = null;
        if (j10 > 0) {
            TLRPC.User Z1 = Z1(Long.valueOf(j10));
            if (Z1 != null) {
                user = Z1;
                L0 = null;
            } else {
                return;
            }
        } else {
            L0 = L0(Long.valueOf(-j10));
            if (L0 == null) {
                return;
            }
        }
        LongSparseIntArray longSparseIntArray = this.G0;
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
        int i10 = this.H0;
        if (i10 >= 0) {
            this.H0 = i10 + 1;
        }
        getNotificationCenter().k(at.f14710g0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.f19837id = m1(user);
        } else {
            tL_contacts_block.f19837id = k1(L0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new ag.c3(8));
    }

    public final ArrayList w0(ArrayList arrayList) {
        if (!A3()) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.TL_messages_stickerSet x02 = r1(this.currentAccount).x0((TLRPC.TL_messages_stickerSet) arrayList.get(i10));
            if (x02 == null) {
                arrayList.remove(i10);
                i10--;
            } else {
                arrayList.set(i10, x02);
            }
            i10++;
        }
        return arrayList;
    }

    public final boolean w2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (i20.B(user)) {
                return !w3.r0(chat);
            }
            TLRPC.ChatFull M0 = M0(chat.f19794id);
            if (M0 != null && (chatParticipants = M0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i10);
                    if (chatParticipant != null && chatParticipant.user_id == user.f19943id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void w3(org.telegram.tgnet.TLRPC.User r9, org.telegram.tgnet.TLRPC.Chat r10, org.telegram.ui.ActionBar.k2 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.w3(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.k2, int):void");
    }

    public final void w4(java.io.File r9, org.telegram.ui.ActionBar.m6 r10, boolean r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.w4(java.io.File, org.telegram.ui.ActionBar.m6, boolean, long):void");
    }

    public final ji.f x(long j10) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull M0 = M0(j10);
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        if (M0 != null && (arrayList = M0.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long o10 = o5.o(communityPeer2.peer);
                TLRPC.Chat L0 = L0(Long.valueOf(-o10));
                TLRPC.User Z1 = Z1(Long.valueOf(o10));
                if (L0 != null || Z1 != null) {
                    arrayList2.add(new ap(L0, R0(o10), Z1, communityPeer2));
                }
            }
        }
        ji.f fVar = new ji.f(8);
        ArrayList arrayList3 = (ArrayList) fVar.d;
        ArrayList arrayList4 = (ArrayList) fVar.e;
        ArrayList arrayList5 = (ArrayList) fVar.f10443c;
        ArrayList arrayList6 = (ArrayList) fVar.f10442b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            ap apVar = (ap) obj;
            int c10 = yh.e0.c(apVar.f14665b, apVar.d, apVar.f14666c, apVar.f14664a);
            if (c10 == 1) {
                arrayList6.add(apVar);
            } else if (c10 == 2) {
                arrayList5.add(apVar);
            } else if (c10 == 4) {
                arrayList4.add(apVar);
            } else if (c10 == 3) {
                arrayList3.add(apVar);
            }
        }
        pl plVar = this.G7;
        Collections.sort(arrayList6, plVar);
        Collections.sort(arrayList5, plVar);
        Collections.sort(arrayList3, plVar);
        Collections.sort(arrayList4, plVar);
        return fVar;
    }

    public final TLRPC.TL_messages_stickerSet x0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        Exception e;
        if (A3() && tL_messages_stickerSet != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                try {
                    if (kj.X3(tL_messages_stickerSet.documents.get(i11))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i10 < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (kj.X3(tL_messages_stickerSet2.documents.get(i10))) {
                                    tL_messages_stickerSet2.documents.remove(i10);
                                    tL_messages_stickerSet2.packs.remove(i10);
                                    i10--;
                                    if (tL_messages_stickerSet2.documents.isEmpty()) {
                                        return null;
                                    }
                                }
                                i10++;
                            } catch (Exception e7) {
                                e = e7;
                                e.printStackTrace();
                                return tL_messages_stickerSet2;
                            }
                        }
                        return tL_messages_stickerSet2;
                    }
                } catch (Exception e10) {
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    e = e10;
                }
            }
            return tL_messages_stickerSet;
        }
        return tL_messages_stickerSet;
    }

    public final Long x1() {
        if (this.f19188m6 == null && !this.f19209o8) {
            this.f19209o8 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.f19188m6;
    }

    public final boolean x2(long j10) {
        TLRPC.Chat L0 = L0(Long.valueOf(-j10));
        if (L0 != null && L0.monoforum) {
            return true;
        }
        return false;
    }

    public final void x3(int i10) {
        boolean z10;
        ArrayList arrayList;
        TLRPC.User f7;
        if (i10 == 1) {
            Context context = w0.f18945b;
            int i11 = this.currentAccount;
            long e = getUserConfig().e();
            if (e == 0) {
                Object obj = org.telegram.ui.Wallet.p0.f35003f;
            } else {
                synchronized (org.telegram.ui.Wallet.p0.f35003f) {
                    try {
                        ArrayList n10 = org.telegram.ui.Wallet.p0.n(context, e);
                        int size = n10.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = n10.get(i12);
                            i12++;
                            new org.telegram.ui.Wallet.p0(i11, context, (String) obj2).B();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (getUserConfig().d && uz.f18516g.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = uz.f18516g;
                unregisterdevice.token_type = uz.f18513f;
                for (int i13 = 0; i13 < 4; i13++) {
                    e20 i14 = e20.i(i13);
                    if (i13 != this.currentAccount && i14.p()) {
                        unregisterdevice.other_uids.add(Long.valueOf(i14.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new ag.c3(8));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new uj(this, 20));
        } else {
            ConnectionsManager connectionsManager = getConnectionsManager();
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            connectionsManager.cleanup(z10);
        }
        getUserConfig().b();
        ks.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().f14833a.get(at.I2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                vs vsVar = (vs) arrayList2.get(i15);
                if (vsVar instanceof ys) {
                    vsVar = (vs) ((ys) vsVar).f19622b.get();
                }
                if (vsVar != null) {
                    arrayList.add(vsVar);
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                if (arrayList.get(i16) instanceof LaunchActivity) {
                    break;
                }
            }
        }
        if (e20.f15506s0 == this.currentAccount) {
            int i17 = 0;
            while (true) {
                if (i17 < 4) {
                    if (e20.i(i17).p()) {
                        break;
                    }
                    i17++;
                } else {
                    i17 = -1;
                    break;
                }
            }
            if (i17 != -1) {
                e20.f15506s0 = i17;
                e20.i(0).v(false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null) {
                    launchActivity.I();
                }
            }
        }
        getNotificationCenter().k(at.I2, new Object[0]);
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new lr(messagesStorage, false, 1));
        Q();
        i5 contactsController = getContactsController();
        contactsController.getClass();
        try {
            contactsController.f16211a = null;
            AccountManager accountManager = AccountManager.get(w0.f18945b);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i18 = 0; i18 < accountsByType.length; i18++) {
                Account account = accountsByType[i18];
                int i19 = 0;
                while (true) {
                    if (i19 < 4) {
                        if (e20.i(i19).f() != null) {
                            if (account.name.equals("" + f7.f19943id)) {
                                break;
                            }
                        }
                        i19++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i18], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public final void x4(String str, TLRPC.User user) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = p1(user);
        tL_messages_startBot.peer = i1(user.f19943id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.f14520b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new uj(this, 21));
    }

    public final boolean y(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!o5.C(dialog.f19798id)) {
                if (o5.y(dialog)) {
                    TLRPC.Chat L0 = L0(Long.valueOf(-dialog.f19798id));
                    if (!w3.X(this.currentAccount, L0)) {
                        if (L0 != null && L0.megagroup) {
                            if (L0.gigagroup && !w3.N(L0)) {
                                return false;
                            }
                            return true;
                        } else if (!w3.N(L0) || !w3.w(5, L0)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                long j10 = dialog.f19798id;
                if (j10 > 0) {
                    if (w3.u0(this.currentAccount, Z1(Long.valueOf(j10)))) {
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

    public final TLRPC.Peer y1(long j10) {
        if (j10 < 0) {
            long j11 = -j10;
            if (w3.T(L0(Long.valueOf(j11)))) {
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

    public final boolean y2(long j10) {
        TLRPC.Chat L0 = L0(Long.valueOf(-j10));
        if (w3.p0(L0) && w3.A(this.currentAccount, L0, 24)) {
            return true;
        }
        return false;
    }

    public final boolean y3(long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        TLRPC.InputPeer inputPeer2;
        NativeByteBuffer nativeByteBuffer;
        long z11;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.Q.f(j10);
        if (dialog != null && dialog.pinned != z10) {
            int i10 = dialog.folder_id;
            ArrayList V0 = V0(i10);
            dialog.pinned = z10;
            if (z10) {
                int i11 = 0;
                for (int i12 = 0; i12 < V0.size(); i12++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) V0.get(i12);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!dialog2.pinned) {
                            if (dialog2.f19798id != this.f19304z2) {
                                break;
                            }
                        } else {
                            i11 = Math.max(dialog2.pinnedNum, i11);
                        }
                    }
                }
                dialog.pinnedNum = i11 + 1;
            } else {
                dialog.pinnedNum = 0;
            }
            NativeByteBuffer nativeByteBuffer2 = null;
            Q4(null);
            if (!z10 && !V0.isEmpty() && i0.a.g(1, V0) == dialog && !this.f19088b2.get(i10)) {
                a1.g.x(1, V0);
            }
            getNotificationCenter().k(at.f14779s, new Object[0]);
            if (!o5.C(j10) && j11 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z10;
                if (inputPeer == null) {
                    inputPeer2 = i1(j10);
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
                            } catch (Exception e) {
                                e = e;
                                nativeByteBuffer2 = nativeByteBuffer;
                                f8.g(e, true);
                                nativeByteBuffer = nativeByteBuffer2;
                                z11 = getMessagesStorage().z(nativeByteBuffer);
                                getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new tj(this, z11, 11));
                                is messagesStorage = getMessagesStorage();
                                messagesStorage.f16331a.c(new hq(messagesStorage, dialog.pinnedNum, j10, 3));
                                return true;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                        z11 = getMessagesStorage().z(nativeByteBuffer);
                    } else {
                        z11 = j11;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new tj(this, z11, 11));
                }
            }
            is messagesStorage2 = getMessagesStorage();
            messagesStorage2.f16331a.c(new hq(messagesStorage2, dialog.pinnedNum, j10, 3));
            return true;
        } else if (dialog != null) {
            return true;
        }
        return false;
    }

    public final void y4(final TLObject tLObject, final ArrayList arrayList, final TLRPC.TL_messages_dialogs tL_messages_dialogs, final TLRPC.TL_messages_dialogs tL_messages_dialogs2, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final SparseArray sparseArray, final ArrayList arrayList5, final HashMap hashMap, final HashSet hashSet, final Runnable runnable) {
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
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList7.add((TLRPC.User) vector.objects.get(i10));
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
                    final is messagesStorage = wp.this.getMessagesStorage();
                    r5 r5Var = messagesStorage.f16331a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    r5Var.c(new Runnable() {
                        @Override
                        public final void run() {
                            is.this.Y0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void z(long j10, int i10, long j11) {
        a0.h hVar;
        a0.h hVar2;
        if (i10 >= 0) {
            a0.h[] hVarArr = this.Y;
            if (i10 < hVarArr.length && (hVar = hVarArr[i10]) != null && (hVar2 = (a0.h) hVar.f(j10)) != null) {
                hVar2.l(j11);
                if (hVar2.m() == 0) {
                    hVar.l(j10);
                }
            }
        }
    }

    public final String z1(long j10) {
        return A1(j10, false);
    }

    public final boolean z2(long j10) {
        if (j10 > 0) {
            return I2(a2(j10));
        }
        return n2(L0(Long.valueOf(-j10)));
    }

    public final void z3(TLRPC.Chat chat, TLRPC.User user, int i10, boolean z10, boolean z11, boolean z12) {
        long j10;
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        if (chat != null) {
            j10 = -chat.f19794id;
        } else {
            j10 = user.f19943id;
        }
        tL_messages_updatePinnedMessage.peer = i1(j10);
        tL_messages_updatePinnedMessage.f19920id = i10;
        tL_messages_updatePinnedMessage.unpin = z10;
        tL_messages_updatePinnedMessage.silent = !z12;
        tL_messages_updatePinnedMessage.pm_oneside = z11;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new mn(this, i10, chat, user, z10));
    }

    public final boolean z4(int r17, int r18, long r19, long r21, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.z4(int, int, long, long, java.lang.String):boolean");
    }
}
