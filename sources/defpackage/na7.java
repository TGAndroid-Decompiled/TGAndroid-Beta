package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
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
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class na7 extends pf0 implements gk7 {
    public static volatile long o5 = 0;
    public static volatile long p5 = 0;
    public static final int q5 = 1050111;
    public static final int r5 = 31;
    public static volatile na7[] s5 = new na7[4];
    public static final Object[] t5 = new Object[4];
    public final vf6 A0;
    public final HashMap A1;
    public final am6 A2;
    public HashMap A3;
    public long A4;
    public final vf6 B0;
    public final vf6 B1;
    public final f67 B2;
    public HashMap B3;
    public final boolean B4;
    public int C0;
    public final vf6 C1;
    public long C2;
    public boolean C3;
    public final byte C4;
    public long D0;
    public final vf6 D1;
    public int D2;
    public boolean D3;
    public final byte D4;
    public final ArrayList E;
    public final SparseIntArray E0;
    public final vf6 E1;
    public byte E2;
    public ea7 E3;
    public ArrayList E4;
    public final ArrayList F;
    public final SparseIntArray F0;
    public final vf6 F1;
    public boolean F2;
    public ea7 F3;
    public final LongSparseIntArray F4;
    public final ArrayList G;
    public ArrayList G0;
    public final vf6 G1;
    public String G2;
    public int G3;
    public final LongSparseIntArray G4;
    public final ArrayList H;
    public ArrayList H0;
    public final vf6 H1;
    public final vf6 H2;
    public int H3;
    public final LongSparseIntArray H4;
    public final ArrayList I;
    public final ArrayList I0;
    public final ArrayList I1;
    public final HashMap I2;
    public int I3;
    public final vf6 I4;
    public final ArrayList J;
    public final SparseArray J0;
    public final vf6 J1;
    public String J2;
    public Set J3;
    public final HashSet J4;
    public final ArrayList K;
    public boolean K0;
    public final ArrayList K1;
    public vjb K2;
    public Set K3;
    public boolean K4;
    public final ArrayList L;
    public boolean L0;
    public final HashMap L1;
    public k7c L2;
    public long L3;
    public TLRPC.TL_exportedContactToken L4;
    public final ArrayList M;
    public final ArrayList M0;
    public boolean M1;
    public final l97 M2;
    public Set M3;
    public HashMap M4;
    public final t97[] N;
    public final vf6 N0;
    public int N1;
    public String N2;
    public long N3;
    public HashSet N4;
    public int O;
    public final LongSparseLongArray O0;
    public vf6 O1;
    public int O2;
    public Long O3;
    public vf6 O4;
    public final ConcurrentHashMap P;
    public final LongSparseIntArray P0;
    public vf6 P1;
    public final byte P2;
    public boolean P3;
    public boolean P4;
    public final ConcurrentHashMap Q;
    public final vf6 Q0;
    public c87 Q1;
    public int Q2;
    public boolean Q3;
    public boolean Q4;
    public final vf6 R;
    public final vf6 R0;
    public boolean R1;
    public int R2;
    public String R3;
    public final vf6 R4;
    public final vf6 S;
    public final vf6 S0;
    public final SparseIntArray S1;
    public int S2;
    public HashSet S3;
    public final HashSet S4;
    public final vf6 T;
    public final vf6 T0;
    public final SparseBooleanArray T1;
    public int T2;
    public int[] T3;
    public final f67 T4;
    public final LongSparseIntArray U;
    public final vf6 U0;
    public final SparseBooleanArray U1;
    public int U2;
    public long[] U3;
    public boolean U4;
    public final SparseArray V;
    public final ArrayList V0;
    public final SparseBooleanArray V1;
    public boolean V2;
    public int[][] V3;
    public TLRPC.messages_AvailableEffects V4;
    public final ConcurrentHashMap W;
    public final ArrayList W0;
    public boolean W1;
    public int W2;
    public final SharedPreferences W3;
    public final n97 W4;
    public vf6 X;
    public final ArrayList X0;
    public boolean X1;
    public final int X2;
    public final SharedPreferences X3;
    public boolean X4;
    public vf6 Y;
    public long Y0;
    public boolean Y1;
    public final int Y2;
    public final SharedPreferences Y3;
    public ArrayList Y4;
    public final vf6[] Z;
    public long Z0;
    public boolean Z1;
    public int Z2;
    public volatile boolean Z3;
    public long Z4;
    public int a;
    public final ConcurrentHashMap a0;
    public long a1;
    public boolean a2;
    public int a3;
    public int a4;
    public TL_account.contentSettings a5;
    public final ConcurrentHashMap b;
    public final LongSparseIntArray b0;
    public final vf6 b1;
    public boolean b2;
    public int b3;
    public lt2 b4;
    public boolean b5;
    public final ConcurrentHashMap c;
    public int c0;
    public final vf6 c1;
    public boolean c2;
    public int c3;
    public long c4;
    public final HashSet c5;
    public final ConcurrentHashMap d;
    public final SparseArray d0;
    public final vf6 d1;
    public long d2;
    public final int d3;
    public long d4;
    public final HashSet d5;
    public final ConcurrentHashMap e;
    public g2b e0;
    public final vf6 e1;
    public boolean e2;
    public final int e3;
    public f67 e4;
    public final f67 e5;
    public final ConcurrentHashMap f;
    public vp9 f0;
    public VoIPDebugToSend f1;
    public TLRPC.TL_messages_peerDialogs f2;
    public int f3;
    public final ConcurrentHashMap f4;
    public final LongSparseArray f5;
    public v4c g0;
    public final vf6 g1;
    public TLRPC.messages_Dialogs g2;
    public int g3;
    public final pub g4;
    public final HashMap g5;
    public final HashMap h;
    public boolean h0;
    public final HashSet h1;
    public final SparseIntArray h2;
    public int h3;
    public final o51 h4;
    public ha7 h5;
    public og1 i0;
    public final LongSparseLongArray i1;
    public ArrayList i2;
    public String i3;
    public final b1c i4;
    public boolean i5;
    public boolean j0;
    public final ConcurrentHashMap j1;
    public TLRPC.WebPage j2;
    public int j3;
    public ic j4;
    public ArrayList j5;
    public final vf6 k0;
    public final int k1;
    public int k2;
    public int k3;
    public final gr k4;
    public TLRPC.EmojiGameInfo k5;
    public final ArrayList l0;
    public final HashSet l1;
    public boolean l2;
    public boolean l3;
    public boolean l4;
    public final f67 l5;
    public final ArrayList m0;
    public final HashSet m1;
    public int m2;
    public boolean m3;
    public final SparseArray m4;
    public TL_account.TL_webBrowserSettings m5;
    public final ArrayList n;
    public final ArrayList n0;
    public final HashSet n1;
    public boolean n2;
    public boolean n3;
    public final HashSet n4;
    public final o97 n5;
    public final ArrayList o0;
    public final HashSet o1;
    public int o2;
    public String o3;
    public final HashMap o4;
    public final ArrayList p0;
    public final LongSparseLongArray p1;
    public int p2;
    public String p3;
    public final ArrayList p4;
    public final LongSparseIntArray q0;
    public final vf6 q1;
    public TLRPC.Dialog q2;
    public String q3;
    public t97 q4;
    public final vf6 r;
    public final vf6 r0;
    public final LongSparseIntArray r1;
    public boolean r2;
    public int r3;
    public final c77 r4;
    public final ArrayList s;
    public final LongSparseIntArray s0;
    public final SparseIntArray s1;
    public long s2;
    public String s3;
    public final c77 s4;
    public final vf6 t0;
    public final vf6 t1;
    public int t2;
    public String t3;
    public final c77 t4;
    public final vf6 u0;
    public final vf6 u1;
    public String u2;
    public Set u3;
    public final el6 u4;
    public final vf6 v0;
    public final vf6 v1;
    public String v2;
    public Set v3;
    public a61 v4;
    public final SparseArray w;
    public boolean w0;
    public final HashMap w1;
    public String w2;
    public TLRPC.TL_pendingSuggestion w3;
    public final f67 w4;
    public final vf6 x;
    public final LongSparseIntArray x0;
    public final vf6 x1;
    public boolean x2;
    public ArrayList x3;
    public final f67 x4;
    public final ArrayList y;
    public int y0;
    public final HashMap y1;
    public int y2;
    public HashSet y3;
    public final vf6 y4;
    public boolean z0;
    public final vf6 z1;
    public int z2;
    public String z3;
    public final vf6 z4;

    static {
        for (int i = 0; i < 4; i++) {
            t5[i] = new Object();
        }
    }

    public na7(int i) {
        super(i);
        SharedPreferences k;
        boolean z;
        int[] a;
        int i2;
        this.b = new ConcurrentHashMap(100, 1.0f, 2);
        this.c = new ConcurrentHashMap(10, 1.0f, 2);
        this.d = new ConcurrentHashMap(100, 1.0f, 3);
        this.e = new ConcurrentHashMap(100, 1.0f, 2);
        this.f = new ConcurrentHashMap(3, 1.0f, 2);
        this.h = new HashMap();
        this.n = new ArrayList();
        this.r = new vf6();
        this.s = new ArrayList();
        this.w = new SparseArray();
        this.x = new vf6();
        this.y = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new t97[2];
        this.O = Integer.MAX_VALUE;
        this.P = new ConcurrentHashMap(100, 1.0f, 2);
        this.Q = new ConcurrentHashMap(100, 1.0f, 2);
        this.R = new vf6();
        this.S = new vf6();
        this.T = new vf6();
        this.U = new LongSparseIntArray();
        this.V = new SparseArray();
        this.W = new ConcurrentHashMap(20, 1.0f, 2);
        this.X = new vf6();
        this.Y = new vf6();
        this.Z = new vf6[12];
        this.a0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.b0 = new LongSparseIntArray();
        this.d0 = new SparseArray();
        this.k0 = new vf6();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new LongSparseIntArray();
        this.r0 = new vf6();
        this.s0 = new LongSparseIntArray();
        this.t0 = new vf6();
        this.u0 = new vf6();
        this.v0 = new vf6();
        this.w0 = false;
        this.x0 = new LongSparseIntArray();
        this.y0 = -1;
        this.A0 = new vf6();
        this.B0 = new vf6();
        this.E0 = new SparseIntArray();
        this.F0 = new SparseIntArray();
        this.G0 = new ArrayList();
        this.H0 = null;
        this.I0 = new ArrayList();
        this.J0 = new SparseArray();
        this.M0 = new ArrayList();
        this.N0 = new vf6();
        this.O0 = new LongSparseLongArray();
        this.P0 = new LongSparseIntArray();
        this.Q0 = new vf6();
        this.R0 = new vf6();
        this.S0 = new vf6();
        this.T0 = new vf6();
        this.U0 = new vf6();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.b1 = new vf6();
        this.c1 = new vf6();
        this.d1 = new vf6();
        this.e1 = new vf6();
        this.g1 = new vf6();
        this.h1 = new HashSet();
        this.i1 = new LongSparseLongArray();
        this.j1 = new ConcurrentHashMap();
        this.k1 = ConnectionsManager.generateClassGuid();
        this.l1 = new HashSet();
        this.m1 = new HashSet();
        this.n1 = new HashSet();
        this.o1 = new HashSet();
        this.p1 = new LongSparseLongArray();
        this.q1 = new vf6();
        this.r1 = new LongSparseIntArray();
        this.s1 = new SparseIntArray();
        this.t1 = new vf6();
        this.u1 = new vf6();
        this.v1 = new vf6();
        this.w1 = new HashMap();
        this.x1 = new vf6();
        this.y1 = new HashMap();
        this.z1 = new vf6();
        this.A1 = new HashMap();
        this.B1 = new vf6();
        this.C1 = new vf6();
        this.D1 = new vf6();
        this.E1 = new vf6();
        this.F1 = new vf6();
        this.G1 = new vf6();
        this.H1 = new vf6();
        this.I1 = new ArrayList();
        this.J1 = new vf6();
        this.K1 = new ArrayList();
        this.L1 = new HashMap();
        this.S1 = new SparseIntArray();
        this.T1 = new SparseBooleanArray();
        this.U1 = new SparseBooleanArray();
        this.V1 = new SparseBooleanArray();
        this.Z1 = true;
        this.h2 = new SparseIntArray();
        this.i2 = new ArrayList();
        this.A2 = new am6((byte) 2);
        this.B2 = new f67(this, (byte) 12);
        this.H2 = new vf6();
        this.I2 = new HashMap();
        this.M2 = new l97(this);
        this.P2 = (byte) 100;
        this.x3 = new ArrayList();
        this.A3 = new HashMap();
        this.B3 = new HashMap();
        this.M3 = new HashSet();
        this.f4 = new ConcurrentHashMap();
        this.k4 = new gr(this.currentAccount);
        this.m4 = new SparseArray();
        HashSet hashSet = new HashSet();
        this.n4 = hashSet;
        this.o4 = new HashMap();
        this.p4 = new ArrayList();
        this.r4 = new c77(this, (byte) 0);
        this.s4 = new c77(this, (byte) 1);
        this.t4 = new c77(this, (byte) 2);
        this.u4 = new el6(this, (byte) 16);
        this.w4 = new f67(this, (byte) 17);
        this.x4 = new f67(this, (byte) 21);
        this.y4 = new vf6();
        this.z4 = new vf6();
        this.B4 = true;
        this.C4 = (byte) 2;
        this.D4 = (byte) 3;
        this.E4 = new ArrayList();
        this.F4 = new LongSparseIntArray();
        this.G4 = new LongSparseIntArray();
        this.H4 = new LongSparseIntArray();
        this.I4 = new vf6();
        this.J4 = new HashSet();
        this.R4 = new vf6();
        this.S4 = new HashSet();
        this.T4 = new f67(this, (byte) 22);
        this.W4 = new n97(this);
        this.c5 = new HashSet();
        this.d5 = new HashSet();
        this.e5 = new f67(this, (byte) 23);
        this.f5 = new LongSparseArray();
        this.g5 = new HashMap();
        this.l5 = new f67(this, (byte) 6);
        this.n5 = new o97(this);
        fl5.z();
        getMessagesStorage();
        getLocationController();
        gl.d3(new f67(this, (byte) 7));
        h();
        if (this.currentAccount == 0) {
            this.W3 = a.b.getSharedPreferences("Notifications", 0);
            k = a.b.getSharedPreferences("mainconfig", 0);
            this.X3 = k;
            this.Y3 = a.b.getSharedPreferences("emoji", 0);
        } else {
            this.W3 = oo1.k(new StringBuilder("Notifications"), this.currentAccount, a.b, 0);
            k = oo1.k(new StringBuilder("mainconfig"), this.currentAccount, a.b, 0);
            this.X3 = k;
            this.Y3 = oo1.k(new StringBuilder("emoji"), this.currentAccount, a.b, 0);
        }
        System.currentTimeMillis();
        this.C3 = k.getBoolean("remoteConfigLoaded", false);
        this.D3 = k.getBoolean("fpnvAllowed", false);
        this.z2 = k.getInt("secretWebpage2", 2);
        this.O2 = k.getInt("maxGroupCount", 200);
        this.Q2 = k.getInt("maxMegagroupCount", 10000);
        this.Y2 = k.getInt("maxRecentGifsCount", 200);
        this.W2 = k.getInt("maxRecentStickersCount", 30);
        this.X2 = k.getInt("maxFaveStickersCount", 5);
        this.R2 = k.getInt("maxEditTime", 3600);
        this.S2 = k.getInt("ratingDecay", 2419200);
        this.N2 = k.getString("linkPrefix", "t.me");
        hashSet.clear();
        String string = k.getString("unreadOnlyFilters", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(",")) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.Z2 = this.X3.getInt("callReceiveTimeout", 20000);
        this.a3 = this.X3.getInt("callRingTimeout", 90000);
        this.b3 = this.X3.getInt("callConnectTimeout", 30000);
        this.c3 = this.X3.getInt("callPacketTimeout", 10000);
        this.h3 = this.X3.getInt("updateCheckDelay", 86400);
        this.d3 = this.X3.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.e3 = this.X3.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.j3 = this.X3.getInt("maxMessageLength", 4096);
        this.k3 = this.X3.getInt("maxCaptionLength", 1024);
        this.f3 = this.X3.getInt("mapProvider", 0);
        this.g3 = this.X3.getInt("availableMapProviders", 3);
        this.i3 = this.X3.getString("pk", null);
        this.t3 = this.X3.getString("installReferer", null);
        this.T2 = this.X3.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.U2 = this.X3.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
        this.V2 = this.X3.getBoolean("canRevokePmInbox", this.V2);
        this.m3 = this.X3.getBoolean("preloadFeaturedStickers", false);
        this.s2 = this.X3.getLong("proxy_dialog", 0L);
        this.m2 = this.X3.getInt("nextPromoInfoCheckTime", 0);
        this.t2 = this.X3.getInt("promo_dialog_type", 0);
        this.u2 = this.X3.getString("promo_psa_message", null);
        this.v2 = this.X3.getString("promo_psa_type", null);
        this.w2 = this.X3.getString("proxyDialogAddress", null);
        this.o3 = this.X3.getString("gifSearchBot", "gif");
        this.p3 = this.X3.getString("imageSearchBot", "pic");
        this.l3 = this.X3.getBoolean("blockedCountry", false);
        this.s3 = this.X3.getString("suggestedLangCode", "en");
        this.n3 = this.X3.getBoolean("showFiltersTooltip", false);
        this.u3 = this.X3.getStringSet("pendingSuggestions", null);
        this.v3 = this.X3.getStringSet("dismissedSuggestions", null);
        this.a4 = this.X3.getInt("transcribeButtonPressed", 0);
        this.L3 = this.X3.getLong("telegramAntispamUserId", -1L);
        if (ConnectionsManager.native_isTestBackend(this.currentAccount) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.S3 = (HashSet) Collection.EL.stream(this.X3.getStringSet("whitelistedBots", new HashSet())).map(new xz((byte) 11)).collect(Collectors.toCollection(new lm1((byte) 1)));
        String string2 = this.X3.getString("starsGroupcallMessageLimits", null);
        if (string2 != null && string2.length() != 0) {
            try {
                a = DesugarArrays.stream(string2.split(",")).mapToInt(new mm((byte) 8)).toArray();
            } catch (Exception e) {
                fa4.g(e, true);
                a = de5.a();
            }
        } else {
            a = de5.a();
        }
        this.T3 = a;
        this.R3 = this.X3.getString("storiesPosting", "enabled");
        this.E3 = ea7.b(0, this.X3.getString("peerColors", ""));
        this.F3 = ea7.b(1, this.X3.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.X3;
        boolean z2 = w01.a;
        int i3 = sharedPreferences.getInt("transcribeAudioTrialWeeklyNumber", 0);
        this.G3 = i3;
        this.I3 = this.X3.getInt("transcribeAudioTrialCurrentNumber", i3);
        this.H3 = this.X3.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.Q3 = this.X3.getBoolean("storyQualityFull", true);
        this.P3 = this.X3.getBoolean("savedViewAsChats", false);
        this.l4 = this.X3.getBoolean("folderTags", false);
        this.J3 = this.X3.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.K3 = this.X3.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.M3 = this.X3.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.N3 = this.X3.getLong("paidReactionsAnonymousTime", 0L);
        this.U3 = DesugarArrays.stream(this.X3.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new td((byte) 1)).toArray();
        this.V3 = (int[][]) DesugarArrays.stream(this.X3.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new xz((byte) 12)).toArray(new z57((byte) 0));
        gr grVar = this.k4;
        SharedPreferences sharedPreferences2 = this.X3;
        grVar.getClass();
        String[] strArr = gr.G3;
        SharedPreferences.Editor editor = null;
        for (int i4 = 0; i4 < 4; i4++) {
            String str2 = strArr[i4];
            if (sharedPreferences2.contains(str2)) {
                editor = editor == null ? sharedPreferences2.edit() : editor;
                editor.remove(str2);
            }
        }
        if (editor != null) {
            editor.apply();
        }
        for (fr2 fr2Var : grVar.a.a.values()) {
            fr2Var.d(sharedPreferences2);
        }
        this.k4.B0.a(new f67(this, (byte) 0));
        this.k4.t1.a(new f67(this, (byte) 1));
        f67 f67Var = new f67(this, (byte) 11);
        this.k4.y3.a(f67Var);
        this.k4.z3.a(f67Var);
        this.k4.A3.a(new am6((byte) 3));
        this.k4.s0.a(new f67(this, (byte) 16));
        System.currentTimeMillis();
        this.O3 = null;
        if (System.currentTimeMillis() - this.N3 < 7200000) {
            boolean contains = this.X3.contains("paidReactionsDialogId");
            SharedPreferences sharedPreferences3 = this.X3;
            if (contains) {
                this.O3 = Long.valueOf(sharedPreferences3.getLong("paidReactionsDialogId", 0L));
            } else {
                this.O3 = Long.valueOf(sharedPreferences3.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        gl.d3(new f67(this, (byte) 8));
        w01.h = this.X3.getString("googleAuthClientId", w01.h);
        if (this.X3.contains("dcDomainName2")) {
            this.q3 = this.X3.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.q3 = z ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.X3.contains("webFileDatacenterId")) {
            this.r3 = this.X3.getInt("webFileDatacenterId", 4);
        } else {
            if (z) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            this.r3 = i2;
        }
        SparseIntArray sparseIntArray = this.E0;
        String string3 = this.X3.getString("premiumFeaturesTypesToPosition", null);
        sparseIntArray.clear();
        if (string3 != null) {
            String[] split = string3.split("_");
            for (int i5 = 0; i5 < split.length; i5++) {
                sparseIntArray.put(Integer.parseInt(split[i5]), i5);
            }
        }
        SparseIntArray sparseIntArray2 = this.F0;
        String string4 = this.X3.getString("businessFeaturesTypesToPosition", null);
        sparseIntArray2.clear();
        if (string4 != null) {
            String[] split2 = string4.split("_");
            for (int i6 = 0; i6 < split2.length; i6++) {
                sparseIntArray2.put(Integer.parseInt(split2[i6]), i6);
            }
        }
        if (this.u3 != null) {
            this.u3 = new HashSet(this.u3);
        } else {
            this.u3 = new HashSet();
        }
        if (this.v3 != null) {
            this.v3 = new HashSet(this.v3);
        } else {
            this.v3 = new HashSet();
        }
        this.z3 = this.X3.getString("autologinToken", null);
        Set<String> stringSet = this.X3.getStringSet("diceEmojies", null);
        if (stringSet == null) {
            HashSet hashSet2 = new HashSet();
            this.y3 = hashSet2;
            hashSet2.add("🎲");
            this.y3.add("🎯");
        } else {
            this.y3 = new HashSet(stringSet);
        }
        String string5 = this.X3.getString("diceSuccess", null);
        if (string5 == null) {
            this.A3.put("🎯", new x97(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string5, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    int readInt32 = serializedData.readInt32(true);
                    for (int i7 = 0; i7 < readInt32; i7++) {
                        this.A3.put(serializedData.readString(true), new x97(serializedData.readInt32(true), serializedData.readInt32(true)));
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        String string6 = this.X3.getString("emojiSounds", null);
        if (string6 != null) {
            try {
                byte[] decode2 = Base64.decode(string6, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    int readInt322 = serializedData2.readInt32(true);
                    for (int i8 = 0; i8 < readInt322; i8++) {
                        HashMap hashMap = this.B3;
                        String readString = serializedData2.readString(true);
                        long readInt64 = serializedData2.readInt64(true);
                        long readInt642 = serializedData2.readInt64(true);
                        byte[] readByteArray = serializedData2.readByteArray(true);
                        ?? obj = new Object();
                        obj.a = readInt64;
                        obj.b = readInt642;
                        obj.c = readByteArray;
                        hashMap.put(readString, obj);
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        String string7 = this.X3.getString("gifSearchEmojies", null);
        if (string7 == null) {
            this.x3.add("👍");
            this.x3.add("👎");
            this.x3.add("😍");
            this.x3.add("😂");
            this.x3.add("😮");
            this.x3.add("🙄");
            this.x3.add("😥");
            this.x3.add("😡");
            this.x3.add("🥳");
            this.x3.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string7, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    int readInt323 = serializedData3.readInt32(true);
                    for (int i9 = 0; i9 < readInt323; i9++) {
                        this.x3.add(serializedData3.readString(true));
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
            }
        }
        gl.e3(new f67(this, (byte) 17), 2000L);
        gl.e3(new f67(this, (byte) 6), 2000L);
        gl.e3(new f67(this, (byte) 18), 400L);
        ?? pf0Var = new pf0(i);
        pf0Var.a = new vf6();
        pf0Var.b = new vf6();
        pf0Var.c = new LongSparseIntArray();
        pf0Var.d = new LongSparseIntArray();
        pf0Var.e = new vf6();
        pf0Var.f = new vf6();
        pf0Var.h = new LongSparseLongArray();
        pf0Var.n = new LongSparseIntArray();
        new LongSparseIntArray();
        pf0Var.r = new LongSparseIntArray();
        pf0Var.s = new vf6();
        this.g4 = pf0Var;
        this.h4 = new o51(i);
        this.i4 = new b1c(this);
        Utilities.e.c(new f67(this, (byte) 19));
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
                long j = user.id;
                if (j == 777000 || j == 333000 || j == 4240000 || j == 4244000 || j == 4245000 || j == 4246000 || j == 410000 || j == 420000 || j == 431000 || j == 431415000 || j == 434000 || j == 4243000 || j == 439000 || j == 449000 || j == 450000 || j == 452000 || j == 454000 || j == 4254000 || j == 455000 || j == 460000 || j == 470000 || j == 479000 || j == 796000 || j == 482000 || j == 490000 || j == 496000 || j == 497000 || j == 498000 || j == 4298000) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean J2(TLRPC.UserFull userFull) {
        if (userFull != null) {
            if (!userFull.noforwards_peer_enabled && !userFull.noforwards_my_enabled) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static long N1(TLRPC.Reaction reaction) {
        int i;
        if (reaction == null) {
            return 0L;
        }
        long j = reaction.tag_long_id;
        if (j != 0) {
            return j;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            int i2 = 0;
            String substring = Utilities.a(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(0, 16);
            int length = substring.length();
            if (length != 0) {
                if (substring.charAt(0) == '+' && length > 1) {
                    i2 = 1;
                }
                long j2 = 0;
                while (i2 < length) {
                    int digit = Character.digit(substring.charAt(i2), 16);
                    if (digit != -1) {
                        if (j2 >= 0 && j2 <= 1152921504606846975L && (i != 0 || digit <= 15)) {
                            j2 = (j2 << 4) + digit;
                            i2++;
                        } else {
                            throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
                        }
                    } else {
                        throw new NumberFormatException(substring.toString());
                    }
                }
                reaction.tag_long_id = j2;
                return j2;
            }
            throw new NumberFormatException("empty string");
        } else if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
            return 0L;
        } else {
            long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            reaction.tag_long_id = j3;
            return j3;
        }
    }

    public static String O2(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new z57((byte) 1)).collect(Collectors.joining(","));
    }

    public static long Q1(TLRPC.Update update) {
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
        if (w01.a) {
            fa4.d("trying to get unknown update channel_id for " + update);
            return 0L;
        }
        return 0L;
    }

    public static int R1(TLRPC.Update update) {
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

    public static int S1(TLRPC.Update update) {
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

    public static int T1(TLRPC.Update update) {
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

    public static void W4(String str, d dVar) {
        if (dVar != null && dVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dVar.getResourceProvider(), dVar.getParentActivity());
            String M0 = k96.M0(2131751442, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            HashMap hashMap = new HashMap();
            int i = bkb.K5;
            hashMap.put("info1", Integer.valueOf(dVar.getThemedColor(i)));
            hashMap.put("info2", Integer.valueOf(dVar.getThemedColor(i)));
            alertDialog$Builder.l(2131624108, 52, dVar.getThemedColor(i), hashMap);
            hdVar.X = true;
            alertDialog$Builder.j(k96.M0(2131752029, null), null);
            hdVar.U = str;
            dVar.showDialog(hdVar);
        }
    }

    public static String X1(TLRPC.User user) {
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            return gl.A2(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            return gl.A2(user.last_name);
        }
        return "";
    }

    public static SharedPreferences b1() {
        return q1(0).Y3;
    }

    public static TLRPC.TL_wallPaperSettings b2(vjb vjbVar) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = vjbVar.i;
        tL_wallPaperSettings.motion = vjbVar.j;
        int i = vjbVar.d;
        if (i != 0) {
            tL_wallPaperSettings.background_color = i & 16777215;
            int i2 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (vjbVar.k * 100.0f);
            tL_wallPaperSettings.flags = i2 | 9;
        } else {
            float f = vjbVar.k;
            if (f > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i3 = vjbVar.e;
        if (i3 != 0) {
            tL_wallPaperSettings.second_background_color = i3 & 16777215;
            tL_wallPaperSettings.rotation = gl.q1(vjbVar.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i4 = vjbVar.f;
        if (i4 != 0) {
            tL_wallPaperSettings.third_background_color = i4 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i5 = vjbVar.g;
        if (i5 != 0) {
            tL_wallPaperSettings.fourth_background_color = i5 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static SharedPreferences c1() {
        return q1(0).X3;
    }

    public static boolean c2(String str, ArrayList arrayList) {
        String lowerCase = str.toLowerCase();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String lowerCase2 = ((TL_account.WebDomainException) arrayList.get(i)).domain.toLowerCase();
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

    public static SharedPreferences d1() {
        return q1(0).W3;
    }

    public static TLRPC.InputMedia e5(TLRPC.MessageMedia messageMedia) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaDocument.id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputMediaPhoto.id = tL_inputPhoto;
            TLRPC.Photo photo = messageMedia.photo;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            return tL_inputMediaPhoto;
        } else {
            return null;
        }
    }

    public static TLRPC.InputChannel g1(TLRPC.Chat chat) {
        if (hc2.T(chat)) {
            if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                tL_inputChannelFromMessage.channel_id = chat.id;
                tL_inputChannelFromMessage.peer = q1(y6c.t0).h1(chat.fromMessageDialogId);
                tL_inputChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputChannelFromMessage;
            }
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
            return tL_inputChannel;
        }
        return new TLRPC.TL_inputChannelEmpty();
    }

    public static void i0(ArrayList arrayList, TL_account.WebDomainException webDomainException) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            if (TL_account.WebDomainException.equalsByDomain((TL_account.WebDomainException) arrayList.get(i), webDomainException)) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
    }

    public static TLRPC.InputPeer i1(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l1((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return j1((TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static TLRPC.InputPeer j1(TLRPC.Chat chat) {
        if (hc2.T(chat)) {
            if (chat != null && chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = chat.id;
                tL_inputPeerChannelFromMessage.peer = q1(y6c.t0).h1(chat.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
        tL_inputPeerChat.chat_id = chat.id;
        return tL_inputPeerChat;
    }

    public static TLRPC.InputPeer l1(TLRPC.User user) {
        if (user != null && user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = user.id;
            tL_inputPeerUserFromMessage.peer = q1(y6c.t0).h1(user.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.TL_emojiStatusCollectible n0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public static TLRPC.InputWallPaper p1(vjb vjbVar) {
        if (vjbVar.l > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.id = vjbVar.l;
            tL_inputWallPaper.access_hash = vjbVar.m;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = vjbVar.c;
        return tL_inputWallPaperSlug;
    }

    public static boolean q0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.id == messageMedia2.document.id) {
                return true;
            }
            return false;
        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.id == messageMedia2.photo.id) {
            return true;
        } else {
            return false;
        }
    }

    public static na7 q1(int i) {
        na7 na7Var;
        na7 na7Var2 = s5[i];
        if (na7Var2 == null) {
            synchronized (t5[i]) {
                na7Var = s5[i];
                if (na7Var == null) {
                    na7[] na7VarArr = s5;
                    na7 na7Var3 = new na7(i);
                    na7VarArr[i] = na7Var3;
                    na7Var = na7Var3;
                }
            }
            return na7Var;
        }
        return na7Var2;
    }

    public static void r0(long j, TLObject tLObject, ArrayList arrayList) {
        int i = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                    if (cf3.n(message.from_id) == user.id) {
                        user.fromMessageDialogId = j;
                        user.fromMessageId = message.id;
                        return;
                    }
                    i++;
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat.access_hash == 0 && chat.fromMessageDialogId == 0 && arrayList != null) {
                while (i < arrayList.size()) {
                    TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i);
                    if (cf3.n(message2.from_id) == (-chat.id)) {
                        chat.fromMessageDialogId = j;
                        chat.fromMessageId = message2.id;
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public static SharedPreferences u1(int i) {
        return q1(i).W3;
    }

    public static ArrayList w0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                arrayList.add((TLRPC.Update) cls.cast(updates.update));
            }
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update = updates.updates.get(i);
                    if (cls.isInstance(update)) {
                        arrayList.add((TLRPC.Update) cls.cast(update));
                    }
                }
            }
        }
        return arrayList;
    }

    public static int w3(ArrayList arrayList) {
        TLRPC.Message message;
        int i;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; arrayList != null && i3 < arrayList.size(); i3++) {
            k27 k27Var = (k27) arrayList.get(i3);
            if (k27Var != null && (message = k27Var.k) != null && (i = message.date) > i2) {
                i2 = i;
            }
        }
        return i2;
    }

    public static ArrayList x0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                TLRPC.Update update = updates.update;
                updates.update = null;
                arrayList.add((TLRPC.Update) cls.cast(update));
            }
            if (updates.updates != null) {
                int i = 0;
                while (i < updates.updates.size()) {
                    if (cls.isInstance(updates.updates.get(i))) {
                        arrayList.add((TLRPC.Update) cls.cast(updates.updates.remove(i)));
                        i--;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final boolean A(Bundle bundle, d dVar, k27 k27Var, pp1 pp1Var) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String C1;
        hd hdVar;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (dVar != null) {
            long j = bundle.getLong("user_id", 0L);
            long j2 = bundle.getLong("chat_id", 0L);
            int i = bundle.getInt("message_id", 0);
            if (j != 0) {
                user = V1(Long.valueOf(j));
                chat = null;
            } else if (j2 != 0) {
                chat = K0(Long.valueOf(j2));
                user = null;
            } else {
                user = null;
                chat = null;
            }
            if (user != null || chat != null) {
                if (chat != null) {
                    C1 = C1(chat.restriction_reason);
                } else {
                    C1 = C1(user.restriction_reason);
                }
                if (C1 != null) {
                    W4(C1, dVar);
                    return false;
                } else if (i != 0 && k27Var != null && chat != null && chat.access_hash == 0) {
                    long B0 = k27.B0(k27Var.k);
                    if (!cf3.B(B0)) {
                        if (pp1Var != null) {
                            pp1Var.d();
                            hdVar = null;
                        } else {
                            hdVar = new hd(3, null, dVar.getParentActivity());
                        }
                        int i2 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
                        if (i2 < 0) {
                            chat = K0(Long.valueOf(-B0));
                        }
                        if (i2 <= 0 && hc2.T(chat)) {
                            TLRPC.Chat K0 = K0(Long.valueOf(-B0));
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = g1(K0);
                            tL_channels_getMessages.id.add(Integer.valueOf(k27Var.e1()));
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.id.add(Integer.valueOf(k27Var.e1()));
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new fn0(this, (Object) hdVar, (Object) pp1Var, (Object) dVar, (Object) bundle, (byte) 11));
                        if (hdVar != null) {
                            hdVar.setOnCancelListener(new ff(this, sendRequest, dVar, (byte) 2));
                            dVar.setVisibleDialog(hdVar);
                            hdVar.show();
                            return false;
                        }
                        pp1Var.b = new j45(this, sendRequest, dVar, (byte) 12);
                        pp1Var.d();
                        return false;
                    }
                    return true;
                } else if (i != 0 && k27Var != null && pp1Var != null) {
                    pp1Var.d();
                    pp1Var.b = p0(-j2, i, new xl3(pp1Var, dVar, bundle, (byte) 20));
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final String A0(long j, long j2) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j == j2) {
            return "";
        }
        vf6 vf6Var = (vf6) this.q1.f(j);
        if (vf6Var != null && (channelParticipant2 = (TLRPC.ChannelParticipant) vf6Var.f(j2)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return k96.M0(2131752195, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return k96.M0(2131752196, null);
            }
        }
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null && L0.participants != null) {
            int i = 0;
            while (true) {
                if (i >= L0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                if (chatParticipant.user_id == j2) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return k96.M0(2131752195, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return k96.M0(2131752196, null);
                    }
                } else {
                    i++;
                }
            }
        }
        return null;
    }

    public final CharSequence A1(long j, long j2, boolean z) {
        vf6 vf6Var;
        TLRPC.User V1;
        TLRPC.UserStatus userStatus;
        if ((z && cf3.D(j) && (V1 = V1(Long.valueOf(j))) != null && (userStatus = V1.status) != null && userStatus.expires < 0) || (vf6Var = (vf6) this.X.f(j)) == null) {
            return null;
        }
        return (CharSequence) vf6Var.f(j2);
    }

    public final void A3(org.telegram.tgnet.TLRPC.User r8, org.telegram.tgnet.TLRPC.Chat r9, org.telegram.ui.ActionBar.d r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.A3(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.d, int):void");
    }

    public final void A4(defpackage.akb r20, defpackage.zjb r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.A4(akb, zjb):void");
    }

    public final void B(long j, String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1809401834:
                if (str.equals("USER_BANNED_IN_CHANNEL")) {
                    c = 0;
                    break;
                }
                break;
            case -795226617:
                if (str.equals("CHANNEL_PRIVATE")) {
                    c = 1;
                    break;
                }
                break;
            case -471086771:
                if (str.equals("CHANNEL_PUBLIC_GROUP_NA")) {
                    c = 2;
                    break;
                }
                break;
        }
        int i = kk7.T;
        switch (c) {
            case 0:
                getNotificationCenter().k(i, Long.valueOf(j), 2);
                return;
            case 1:
                getNotificationCenter().k(i, Long.valueOf(j), 0);
                return;
            case 2:
                getNotificationCenter().k(i, Long.valueOf(j), 1);
                return;
            default:
                return;
        }
    }

    public final int B0() {
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.w;
            if (i < sparseArray.size()) {
                List list = (List) sparseArray.get(sparseArray.keyAt(i));
                if (list != null) {
                    i2 = list.size() + i2;
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    public final Integer B1(long j, long j2) {
        vf6 vf6Var = (vf6) this.Y.f(j);
        if (vf6Var == null) {
            return null;
        }
        return (Integer) vf6Var.f(j2);
    }

    public final boolean B2(long j, boolean z) {
        TLRPC.Dialog dialog = this.q2;
        if (dialog != null && dialog.id == j) {
            if (!z || this.r2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B3(int i) {
        boolean z;
        ArrayList arrayList;
        TLRPC.User f;
        if (i == 1) {
            Context context = a.b;
            int i2 = this.currentAccount;
            long e = getUserConfig().e();
            if (e == 0) {
                Object obj = g15.g;
            } else {
                synchronized (g15.g) {
                    ArrayList o = g15.o(context, e);
                    int size = o.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = o.get(i3);
                        i3++;
                        new g15(i2, context, (String) obj2).C();
                    }
                }
            }
            if (getUserConfig().d && gba.f.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = gba.f;
                unregisterdevice.token_type = gba.e;
                for (int i4 = 0; i4 < 4; i4++) {
                    y6c h = y6c.h(i4);
                    if (i4 != this.currentAccount && h.o()) {
                        unregisterdevice.other_uids.add(Long.valueOf(h.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new ce2((byte) 0));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new y47(this, (byte) 20));
        } else {
            ConnectionsManager connectionsManager = getConnectionsManager();
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            connectionsManager.cleanup(z);
        }
        getUserConfig().b();
        bue.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().a.get(kk7.H2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                gk7 gk7Var = (gk7) arrayList2.get(i5);
                if (gk7Var instanceof jk7) {
                    gk7Var = (gk7) ((jk7) gk7Var).b.get();
                }
                if (gk7Var != null) {
                    arrayList.add(gk7Var);
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                if (arrayList.get(i6) instanceof LaunchActivity) {
                    break;
                }
            }
        }
        if (y6c.t0 == this.currentAccount) {
            int i7 = 0;
            while (true) {
                if (i7 < 4) {
                    if (y6c.h(i7).o()) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                y6c.t0 = i7;
                y6c.h(0).u(false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.J();
                }
            }
        }
        getNotificationCenter().k(kk7.H2, new Object[0]);
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new cc7(messagesStorage, false, (byte) 1));
        M();
        qu2 contactsController = getContactsController();
        contactsController.getClass();
        try {
            contactsController.a = null;
            AccountManager accountManager = AccountManager.get(a.b);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i8 = 0; i8 < accountsByType.length; i8++) {
                Account account = accountsByType[i8];
                int i9 = 0;
                while (true) {
                    if (i9 < 4) {
                        if (y6c.h(i9).f() != null) {
                            if (!account.name.equals("" + f.id)) {
                            }
                        }
                        i9++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i8], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void B4() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.n4.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(num);
        }
        this.X3.edit().putString("unreadOnlyFilters", sb.toString()).apply();
    }

    public final void C(long j, boolean z) {
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        if (hc2.T(K0) && !K0.creator) {
            vf6 vf6Var = this.R0;
            if (vf6Var.h(j) < 0) {
                if (hc2.p0(K0)) {
                    z = false;
                }
                boolean z2 = z;
                vf6Var.k(Boolean.TRUE, j);
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = f1(j);
                tL_channels_getParticipant.participant = h1(getUserConfig().e());
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new j67((byte) 0, j, this, K0, z2));
            }
        }
    }

    public final TLRPC.messages_AvailableEffects C0() {
        if (!this.U4) {
            this.U4 = true;
            this.W4.c(this.currentAccount, 0, new f97(this, (byte) 0));
        }
        return this.V4;
    }

    public final String C1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i);
                Set set = this.K3;
                if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason)) {
                    if (!"all".equals(restrictionReason.platform)) {
                        if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                            a.t();
                            if (!w01.a()) {
                            }
                        }
                        if (!"android-all".equals(restrictionReason.platform)) {
                        }
                    }
                    return restrictionReason.text;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean C2(int i, long j, boolean z) {
        Boolean bool = (Boolean) this.g5.get(j + "_" + i);
        if (bool != null && bool.booleanValue() == z) {
            return true;
        }
        return false;
    }

    public final boolean C3(long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        TLRPC.InputPeer inputPeer2;
        NativeByteBuffer nativeByteBuffer;
        long y;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        if (dialog != null) {
            if (dialog.pinned == z) {
                return true;
            }
            int i = dialog.folder_id;
            ArrayList U0 = U0(i);
            dialog.pinned = z;
            if (z) {
                int i2 = 0;
                for (int i3 = 0; i3 < U0.size(); i3++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) U0.get(i3);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!dialog2.pinned) {
                            if (dialog2.id != this.s2) {
                                break;
                            }
                        } else {
                            i2 = Math.max(dialog2.pinnedNum, i2);
                        }
                    }
                }
                dialog.pinnedNum = i2 + 1;
            } else {
                dialog.pinnedNum = 0;
            }
            NativeByteBuffer nativeByteBuffer2 = null;
            Y4(null);
            if (!z && !U0.isEmpty() && b00.f(1, U0) == dialog && !this.U1.get(i)) {
                tb4.v(1, U0);
            }
            getNotificationCenter().k(kk7.r, new Object[0]);
            if (!cf3.B(j) && j2 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z;
                if (inputPeer == null) {
                    inputPeer2 = h1(j);
                } else {
                    inputPeer2 = inputPeer;
                }
                if (!(inputPeer2 instanceof TLRPC.TL_inputPeerEmpty)) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer.peer = inputPeer2;
                    tL_messages_toggleDialogPin.peer = tL_inputDialogPeer;
                    if (j2 == 0) {
                        try {
                            nativeByteBuffer = new NativeByteBuffer(inputPeer2.getObjectSize() + 16);
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            nativeByteBuffer.writeInt32(4);
                            nativeByteBuffer.writeInt64(j);
                            nativeByteBuffer.writeBool(z);
                            inputPeer2.serializeToStream(nativeByteBuffer);
                        } catch (Exception e2) {
                            e = e2;
                            nativeByteBuffer2 = nativeByteBuffer;
                            fa4.g(e, true);
                            nativeByteBuffer = nativeByteBuffer2;
                            y = getMessagesStorage().y(nativeByteBuffer);
                            getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new x47(this, y, (byte) 11));
                            ad7 messagesStorage = getMessagesStorage();
                            messagesStorage.a.c(new bb7(messagesStorage, dialog.pinnedNum, j, (byte) 3));
                            return true;
                        }
                        y = getMessagesStorage().y(nativeByteBuffer);
                    } else {
                        y = j2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new x47(this, y, (byte) 11));
                }
            }
            ad7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new bb7(messagesStorage2, dialog.pinnedNum, j, (byte) 3));
            return true;
        }
        return false;
    }

    public final void C4(java.io.File r9, defpackage.vjb r10, boolean r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.C4(java.io.File, vjb, boolean, long):void");
    }

    public final void D(int i, boolean z) {
        if (i >= 0) {
            SparseArray sparseArray = this.d0;
            q97 q97Var = (q97) sparseArray.get(i);
            if (q97Var != 0) {
                if (!q97Var.a) {
                    if (System.currentTimeMillis() - q97Var.b <= this.k4.s1.f() * 1000 && !z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (q97Var == 0) {
                q97Var = new Object();
                q97Var.a = true;
                sparseArray.put(i, q97Var);
            }
            q97Var.a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new b97(this, i, q97Var, (byte) 9));
        }
    }

    public final void D0(boolean z) {
        int size;
        int i;
        if (getUserConfig().o() && !this.w0) {
            this.w0 = true;
            TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
            if (z) {
                size = 0;
            } else {
                size = this.x0.size();
            }
            tL_contacts_getBlocked.offset = size;
            if (z) {
                i = 20;
            } else {
                i = 100;
            }
            tL_contacts_getBlocked.limit = i;
            getConnectionsManager().sendRequest(tL_contacts_getBlocked, new mi1(this, z, tL_contacts_getBlocked, (byte) 8));
        }
    }

    public final vp9 D1() {
        vp9 vp9Var = this.f0;
        if (vp9Var != null) {
            return vp9Var;
        }
        synchronized (t5[this.currentAccount]) {
            vp9 vp9Var2 = this.f0;
            if (vp9Var2 != null) {
                return vp9Var2;
            }
            vp9 vp9Var3 = new vp9(this.currentAccount);
            this.f0 = vp9Var3;
            return vp9Var3;
        }
    }

    public final boolean D2() {
        TLRPC.UserFull W1 = W1(getUserConfig().e());
        if (W1 == null) {
            return false;
        }
        return !W1.sponsored_enabled;
    }

    public final void D3(TLRPC.Chat chat, TLRPC.User user, int i, boolean z, boolean z2, boolean z3) {
        long j;
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        if (chat != null) {
            j = -chat.id;
        } else {
            j = user.id;
        }
        tL_messages_updatePinnedMessage.peer = h1(j);
        tL_messages_updatePinnedMessage.id = i;
        tL_messages_updatePinnedMessage.unpin = z;
        tL_messages_updatePinnedMessage.silent = !z3;
        tL_messages_updatePinnedMessage.pm_oneside = z2;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new h87(this, i, chat, user, z));
    }

    public final void D4(String str, TLRPC.User user) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = o1(user);
        tL_messages_startBot.peer = h1(user.id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new y47(this, (byte) 21));
    }

    public final boolean E(boolean z) {
        vf6 vf6Var;
        int i;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.O1 == null && this.P1 == null) || (!z && ((i = this.N1) == 0 || i > currentTime))) {
            return false;
        }
        this.N1 = 0;
        if (this.Q1 != null && !z) {
            Utilities.d.a(this.Q1);
        }
        vf6 vf6Var2 = null;
        this.Q1 = null;
        vf6 vf6Var3 = this.O1;
        if (vf6Var3 != null) {
            vf6Var = vf6Var3.clone();
        } else {
            vf6Var = null;
        }
        vf6 vf6Var4 = this.P1;
        if (vf6Var4 != null) {
            vf6Var2 = vf6Var4.clone();
        }
        gl.d3(new b57(this, vf6Var, vf6Var2, (byte) 0));
        return true;
    }

    public final og1 E0() {
        og1 og1Var = this.i0;
        if (og1Var != null) {
            return og1Var;
        }
        synchronized (t5[this.currentAccount]) {
            og1 og1Var2 = this.i0;
            if (og1Var2 != null) {
                return og1Var2;
            }
            og1 og1Var3 = new og1(this.currentAccount);
            this.i0 = og1Var3;
            return og1Var3;
        }
    }

    public final ha7 E1() {
        ha7 ha7Var = this.h5;
        if (ha7Var == null) {
            ha7 ha7Var2 = new ha7(this.currentAccount);
            this.h5 = ha7Var2;
            return ha7Var2;
        }
        return ha7Var;
    }

    public final boolean E3() {
        if (this.k4.a3.f && !getUserConfig().p()) {
            return true;
        }
        return false;
    }

    public final void E4(final TLObject tLObject, final ArrayList arrayList, final TLRPC.TL_messages_dialogs tL_messages_dialogs, final TLRPC.TL_messages_dialogs tL_messages_dialogs2, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final SparseArray sparseArray, final ArrayList arrayList5, final HashMap hashMap, final HashSet hashSet, final Runnable runnable) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                boolean z = tLObject2 instanceof TLRPC.TL_messages_chats;
                final ArrayList arrayList6 = arrayList3;
                final ArrayList arrayList7 = arrayList2;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs3 = tL_messages_dialogs;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                if (z) {
                    arrayList6.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                } else if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        arrayList7.add((TLRPC.User) vector.objects.get(i));
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
                    final ad7 messagesStorage = na7.this.getMessagesStorage();
                    co3 co3Var = messagesStorage.a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    co3Var.c(new Runnable() {
                        @Override
                        public final void run() {
                            ad7.this.V0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void F(int i) {
        if (i == 0) {
            return;
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new wa7(messagesStorage, i, (byte) 3));
    }

    public final int F0() {
        kr2 kr2Var;
        boolean p = getUserConfig().p();
        gr grVar = this.k4;
        if (p) {
            kr2Var = grVar.h1;
        } else {
            kr2Var = grVar.g1;
        }
        return kr2Var.f();
    }

    public final TLRPC.TL_messages_savedReactionsTags F1(long j, boolean z) {
        HashSet hashSet = this.N4;
        if (hashSet != null && hashSet.contains(Long.valueOf(j)) && !z) {
            vf6 vf6Var = this.O4;
            if (vf6Var == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(j);
        }
        HashSet hashSet2 = this.N4;
        if (hashSet2 == null) {
            hashSet2 = new HashSet();
            this.N4 = hashSet2;
        }
        hashSet2.add(Long.valueOf(j));
        getMessagesStorage().a.c(new r57(this, j, (byte) 8));
        return null;
    }

    public final boolean F2() {
        return !"disabled".equals(this.k4.K2.f);
    }

    public final boolean F3() {
        return this.k4.a3.f;
    }

    public final void F4(long j, long j2) {
        G4(2, 0, j, j2, null);
    }

    public final void G(TLRPC.Chat chat, TLRPC.User user, ba7 ba7Var) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (!chat.megagroup && !hc2.T(chat)) {
            TLRPC.ChatFull L0 = L0(chat.id);
            boolean z = false;
            if (L0 != null) {
                TLRPC.ChatParticipants chatParticipants = L0.participants;
                if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        chatParticipant = L0.participants.participants.get(i);
                        if (chatParticipant != null && chatParticipant.user_id == user.id) {
                            break;
                        }
                    }
                }
                chatParticipant = null;
                if (chatParticipant != null) {
                    z = true;
                }
                TLRPC.ChatParticipants chatParticipants2 = L0.participants;
                if (chatParticipants2 != null && chatParticipants2.admin_id == user.id) {
                    tL_chatAdminRights = zc2.d0(true);
                } else {
                    tL_chatAdminRights = null;
                }
                ba7Var.a(z, tL_chatAdminRights, null);
                return;
            }
            ba7Var.a(false, null, null);
            return;
        }
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = f1(chat.id);
        tL_channels_getParticipant.participant = l1(user);
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new n35(ba7Var, (byte) 11));
    }

    public final void G0(long j) {
        H0(j, 0, 0L, null);
    }

    public final void G1() {
        F1(0L, false);
    }

    public final boolean G2() {
        return !"disabled".equals(this.k4.J2.f);
    }

    public final void G3() {
        int i = this.a4;
        if (i < 2) {
            this.a4 = i + 1;
            SharedPreferences sharedPreferences = this.X3;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.a4).apply();
            }
        }
    }

    public final boolean G4(final int r17, int r18, final long r19, final long r21, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.G4(int, int, long, long, java.lang.String):boolean");
    }

    public final void H(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (!cf3.B(dialog.id)) {
            long j2 = dialog.id;
            vf6 vf6Var = this.U0;
            if (vf6Var.h(j2) < 0) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                if (inputPeer == null) {
                    inputPeer = h1(dialog.id);
                }
                tL_messages_getHistory.peer = inputPeer;
                tL_messages_getHistory.limit = 1;
                vf6Var.k(Boolean.TRUE, dialog.id);
                if (w01.a) {
                    ug8.q(dialog.id, new StringBuilder("checkLastDialogMessage for "));
                }
                if (j == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tL_messages_getHistory.peer.getObjectSize() + 60);
                    } catch (Exception e) {
                        nativeByteBuffer = null;
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(14);
                        nativeByteBuffer.writeInt64(dialog.id);
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
                    } catch (Exception e2) {
                        exc = e2;
                        fa4.g(exc, true);
                        j = getMessagesStorage().y(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getHistory, new w47(this, dialog, j, (byte) 12));
                    }
                    j = getMessagesStorage().y(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getHistory, new w47(this, dialog, j, (byte) 12));
            }
        }
    }

    public final void H0(final long r19, final int r21, long r22, org.telegram.tgnet.TLRPC.InputChannel r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.H0(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public final String H1(TLRPC.Reaction reaction) {
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        boolean z;
        vf6 vf6Var = this.O4;
        if (vf6Var == null || (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            TLRPC.Reaction reaction2 = tL_messages_savedReactionsTags.tags.get(i).reaction;
            Paint paint = i19.S;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    z = TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                }
                z = false;
            } else {
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
                    z = true;
                }
                z = false;
            }
            if (z) {
                return tL_messages_savedReactionsTags.tags.get(i).title;
            }
        }
        return null;
    }

    public final boolean H2(long j) {
        if (j != 0 && !cf3.B(j) && j != getUserConfig().e()) {
            String str = "dialog_bar_vis3" + j;
            SharedPreferences sharedPreferences = this.W3;
            if (sharedPreferences.getInt(str, 0) == 2 && ls6.v("dialog_bar_report", j, sharedPreferences, false) && !ls6.v("dialog_bar_replied", j, sharedPreferences, false)) {
                return true;
            }
        }
        return false;
    }

    public final void H3(int r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.H3(int, long):void");
    }

    public final void H4(int i, long j) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i;
        tL_channels_setBoostsToUnblockRestrictions.channel = f1(j);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new x47(this, j, (byte) 15));
    }

    public final void I(boolean z) {
        int i;
        ea7 ea7Var;
        int i2;
        if (getUserConfig().f() != null) {
            if (!this.P4 && ((ea7Var = this.E3) == null || ea7Var.g() || z)) {
                this.P4 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                ea7 ea7Var2 = this.E3;
                if (ea7Var2 != null) {
                    i2 = ea7Var2.b;
                } else {
                    i2 = 0;
                }
                tL_help_getPeerColors.hash = i2;
                if (ea7Var2 != null && ea7Var2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new y47(this, (byte) 22));
            }
            if (!this.Q4) {
                ea7 ea7Var3 = this.F3;
                if (ea7Var3 == null || ea7Var3.g() || z) {
                    this.Q4 = true;
                    TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                    ea7 ea7Var4 = this.F3;
                    if (ea7Var4 != null) {
                        i = ea7Var4.b;
                    } else {
                        i = 0;
                    }
                    tL_help_getPeerProfileColors.hash = i;
                    if (ea7Var4 != null && ea7Var4.g()) {
                        tL_help_getPeerProfileColors.hash = 0;
                    }
                    getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new y47(this, (byte) 23));
                }
            }
        }
    }

    public final void I0(TLRPC.Chat chat, TLRPC.User user, p8c p8cVar) {
        if (chat != null) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = f1(chat.id);
            tL_channels_getParticipant.participant = l1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new lg1(p8cVar, (byte) 1));
            return;
        }
        p8cVar.a(null);
    }

    public final TLRPC.TL_channels_sendAsPeers I1(long j) {
        return J1(j, false);
    }

    public final TL_account.RequirementToContact I2(long j) {
        if (!getUserConfig().p() && getUserConfig().e() != j) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.R4.f(j);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 == null || V1.contact_require_premium || V1.send_paid_messages_stars != 0) {
                TLRPC.UserFull W1 = W1(j);
                if (W1 != null) {
                    return l7c.p(W1);
                }
                m1(j);
                this.S4.add(Long.valueOf(j));
                f67 f67Var = this.T4;
                gl.r(f67Var);
                gl.e3(f67Var, 60L);
            }
        }
        return null;
    }

    public final boolean I3(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || cf3.n(message.peer_id) != getUserConfig().e() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long Q1 = k27.Q1(getUserConfig().e(), message);
        boolean z = false;
        for (int i = 0; i < message.reactions.results.size(); i++) {
            if (x5(Q1, h19.d(message.reactions.results.get(i).reaction), false)) {
                z = true;
            }
        }
        return z;
    }

    public final void I4(int i, long j) {
        SharedPreferences.Editor edit = this.X3.edit();
        edit.putInt("chatPendingRequests" + j, i).apply();
    }

    public final void J(boolean z) {
        String str;
        boolean z2 = false;
        if (z && this.n2) {
            this.n2 = false;
        }
        if ((z || this.m2 <= getConnectionsManager().getCurrentTime()) && !this.n2) {
            if (this.o2 != 0) {
                getConnectionsManager().cancelRequest(this.o2, true);
                this.o2 = 0;
            }
            SharedPreferences c1 = c1();
            c1.getBoolean("proxy_enabled", false);
            String string = c1.getString("proxy_ip", "");
            String string2 = c1.getString("proxy_secret", "");
            if (this.s2 != 0 && this.t2 == 0 && (str = this.w2) != null) {
                if (!str.equals(string + string2)) {
                    z2 = true;
                }
            }
            int i = this.p2 + 1;
            this.p2 = i;
            this.n2 = true;
            this.o2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new ae(this, i, string, string2, (byte) 6));
            if (z2) {
                this.s2 = 0L;
                this.w2 = null;
                this.m2 = getConnectionsManager().getCurrentTime() + 3600;
                c1().edit().putLong("proxy_dialog", this.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.m2).commit();
                gl.d3(new c87(this, (byte) 16));
            }
        }
    }

    public final p97 J0(long j) {
        p97 p97Var;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.M4 == null) {
            this.M4 = new HashMap();
        }
        boolean p = getUserConfig().p();
        if (this.M4.containsKey(Long.valueOf(j))) {
            p97Var = (p97) this.M4.get(Long.valueOf(j));
            if (p97Var == null || p97Var.a == p) {
                return p97Var;
            }
        } else {
            p97Var = null;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = m1(j);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (i != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = f1(-j);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.M4.put(Long.valueOf(j), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new hn6(this, p, j, (byte) 1));
        return p97Var;
    }

    public final TLRPC.TL_channels_sendAsPeers J1(long j, boolean z) {
        vf6 vf6Var;
        TLRPC.Chat K0;
        if (z) {
            vf6Var = this.v1;
        } else {
            vf6Var = this.u1;
        }
        vf6 vf6Var2 = vf6Var;
        ja7 ja7Var = (ja7) vf6Var2.f(j);
        if (ja7Var != null) {
            return ja7Var.a;
        }
        if (!z && ((K0 = K0(Long.valueOf(-j))) == null || !hc2.k(K0))) {
            return null;
        }
        ?? obj = new Object();
        vf6Var2.k(obj, j);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = h1(j);
        tL_channels_getSendAs.for_live_stories = z;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new js0(this, vf6Var2, j, (ja7) obj, z));
        return null;
    }

    public final void J3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        gl.d3(new lo6(this, longSparseIntArray, longSparseIntArray2, (byte) 17));
    }

    public final void J4(boolean z) {
        TL_account.contentSettings contentsettings = this.a5;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            }
            contentsettings.sensitive_enabled = z;
        }
        if (this.K3 == null) {
            this.K3 = new HashSet();
        }
        Set set = this.K3;
        if (z) {
            set.add("sensitive");
        } else {
            set.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.X3;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.K3).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z;
        getConnectionsManager().sendRequest(setcontentsettings, new ce2((byte) 2));
    }

    public final void K(long j, long j2, SparseBooleanArray sparseBooleanArray) {
        L(j, j2, sparseBooleanArray, false);
    }

    public final TLRPC.Chat K0(Long l) {
        return (TLRPC.Chat) this.b.get(l);
    }

    public final long K1(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            if (j == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull W1 = W1(j);
            if (W1 != null) {
                return W1.send_paid_messages_stars;
            }
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null && V1.send_paid_messages_stars > 0) {
                return cf3.j(I2(V1.id));
            }
        } else if (i < 0) {
            long j2 = -j;
            TLRPC.Chat K0 = K0(Long.valueOf(j2));
            if (hc2.N(K0)) {
                return 0L;
            }
            if (hc2.p0(K0) && hc2.A(this.currentAccount, K0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull L0 = L0(j2);
            if (L0 != null) {
                return L0.send_paid_messages_stars;
            }
            if (K0 != null) {
                return K0.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public final boolean K2(boolean z) {
        ArrayList<TL_account.WebDomainException> arrayList;
        int i;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings == null) {
            return false;
        }
        if (z) {
            arrayList = tL_webBrowserSettings.external_exceptions;
        } else {
            arrayList = tL_webBrowserSettings.inapp_exceptions;
        }
        int size = arrayList.size();
        if (getConnectionsManager().isTestBackend()) {
            i = 5;
        } else {
            i = 100;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public final void K3(long j, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        vf6 vf6Var = new vf6(tL_channels_channelParticipants.participants.size());
        for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
            vf6Var.k(channelParticipant, k27.B1(channelParticipant.peer));
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new go6(messagesStorage, j, vf6Var, (byte) 12));
        gl.d3(new b61((Object) this, j, (Object) vf6Var, false, (byte) 5));
    }

    public final void K4(long j, int i, ArrayList arrayList, int i2, Boolean bool, v72 v72Var, u72 u72Var) {
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = h1(-j);
        if (i != 2 && !arrayList.isEmpty()) {
            if (i == 0) {
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
        tL_messages_setChatAvailableReactions.reactions_limit = i2;
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new yq2(this, j, tL_messages_setChatAvailableReactions, u72Var, v72Var, (byte) 1));
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null) {
            if (L0 instanceof TLRPC.TL_channelFull) {
                L0.flags2 |= 8192;
            } else {
                L0.flags |= 1048576;
            }
            L0.reactions_limit = i2;
            if (bool != null) {
                L0.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().K1(L0, false);
        }
    }

    public final void L(final long j, final long j2, final SparseBooleanArray sparseBooleanArray, final boolean z) {
        String str;
        String str2;
        if (z) {
            str = "reaction_mentions";
            str2 = "reaction_mentions_topics";
        } else {
            str = "poll_votes_mentions";
            str2 = "poll_votes_mentions_topics";
        }
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = !z;
        getMessagesStorage().a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.d57.run():void");
            }
        });
    }

    public final TLRPC.ChatFull L0(long j) {
        return (TLRPC.ChatFull) this.c1.f(j);
    }

    public final ka7 L1(long j) {
        vf6 vf6Var = this.t1;
        ka7 ka7Var = (ka7) vf6Var.f(j);
        if (ka7Var != null && (ka7Var.d || Math.abs(SystemClock.elapsedRealtime() - ka7Var.c) <= 300000)) {
            return ka7Var;
        }
        if (j >= 0 ? !l7c.u(V1(Long.valueOf(j))) : !hc2.T(K0(Long.valueOf(-j)))) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        vf6Var.k(obj, j);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = h1(j);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new w47(this, j, (Object) obj, (byte) 0));
        return null;
    }

    public final boolean L2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings != null && !tL_webBrowserSettings.open_external_browser) {
            return true;
        }
        return false;
    }

    public final void L3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.run():void");
            }
        });
    }

    public final void L4(long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, d dVar) {
        if (tL_chatBannedRights == null) {
            return;
        }
        TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = h1(-j);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new hc((byte) 0), new k87(this, j, dVar, tL_messages_editChatDefaultBannedRights, z));
    }

    public final void M() {
        qu2 contactsController = getContactsController();
        contactsController.Z.clear();
        contactsController.a0.clear();
        contactsController.b0.clear();
        contactsController.f0.clear();
        contactsController.g0.clear();
        contactsController.h0.clear();
        contactsController.j0.clear();
        contactsController.i0.clear();
        contactsController.k0.clear();
        contactsController.x.clear();
        contactsController.l0.clear();
        contactsController.m0.clear();
        contactsController.c0.clear();
        contactsController.d0.clear();
        contactsController.e0.clear();
        contactsController.b = false;
        contactsController.e = false;
        contactsController.n = false;
        contactsController.h = false;
        contactsController.r = false;
        contactsController.w = "";
        contactsController.G = (byte) 0;
        contactsController.H = (byte) 0;
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
        Utilities.e.c(new wt2(contactsController, (byte) 4));
        MediaController.w().j();
        im7 notificationsController = getNotificationsController();
        notificationsController.w.clear();
        notificationsController.x.clear();
        notificationsController.R = false;
        im7.l0.c(new wl7(notificationsController, (byte) 4));
        z3a sendMessagesHelper = getSendMessagesHelper();
        sendMessagesHelper.a.clear();
        sendMessagesHelper.b.clear();
        sendMessagesHelper.c.clear();
        sendMessagesHelper.d.clear();
        sendMessagesHelper.f.b();
        sendMessagesHelper.e.clear();
        sendMessagesHelper.h.b();
        sendMessagesHelper.n.clear();
        sendMessagesHelper.r.clear();
        sendMessagesHelper.w.clear();
        sendMessagesHelper.y.clear();
        sendMessagesHelper.E.b();
        sendMessagesHelper.F.clear();
        sendMessagesHelper.G.clear();
        sendMessagesHelper.H.n();
        bu9 secretChatHelper = getSecretChatHelper();
        secretChatHelper.a.clear();
        secretChatHelper.e.clear();
        secretChatHelper.b.clear();
        secretChatHelper.c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.n = false;
        eb6 locationController = getLocationController();
        locationController.J.clear();
        locationController.K.b();
        locationController.c.b();
        locationController.H.b();
        locationController.d.b();
        eb6.s();
        Utilities.d.c(new va6(locationController, (byte) 2));
        hq6 mediaDataController = getMediaDataController();
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = mediaDataController.g0;
            if (i >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i];
            if (arrayList != null) {
                arrayList.clear();
            }
            mediaDataController.h0[i] = false;
            mediaDataController.i0[i] = false;
            i++;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mediaDataController.Y[i2] = 0;
            mediaDataController.Z[i2] = 0;
            mediaDataController.H[i2].clear();
            mediaDataController.W[i2] = false;
            mediaDataController.X[i2] = false;
        }
        mediaDataController.q1.b();
        int[] iArr = mediaDataController.r0;
        iArr[0] = 0;
        long[] jArr = mediaDataController.q0;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        mediaDataController.e0.clear();
        mediaDataController.f0.clear();
        mediaDataController.d0.b();
        mediaDataController.u0[0].b();
        mediaDataController.t0[0].clear();
        mediaDataController.u0[1].b();
        mediaDataController.t0[1].clear();
        mediaDataController.v0[0].clear();
        mediaDataController.v0[1].clear();
        mediaDataController.j0.clear();
        mediaDataController.J.b();
        mediaDataController.K.b();
        mediaDataController.O.clear();
        mediaDataController.R.clear();
        mediaDataController.S.b();
        mediaDataController.T.clear();
        boolean[] zArr = mediaDataController.x0;
        zArr[0] = false;
        boolean[] zArr2 = mediaDataController.y0;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        mediaDataController.k0 = false;
        mediaDataController.l0 = false;
        mediaDataController.C1.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.e.c(new am6((byte) 1));
        }
        mediaDataController.b0.clear();
        mediaDataController.o1 = false;
        mediaDataController.n1 = false;
        mediaDataController.j1.clear();
        mediaDataController.k1.clear();
        mediaDataController.l1.clear();
        mediaDataController.m1.clear();
        gl.d3(new un6(mediaDataController, (byte) 6));
        mediaDataController.u1.b();
        mediaDataController.v1.b();
        mediaDataController.w1.edit().clear().apply();
        mediaDataController.r1.b();
        mediaDataController.k().edit().clear().apply();
        mediaDataController.y1.clear();
        mediaDataController.A1.clear();
        mediaDataController.B1.b();
        getColorPalette().a();
        this.i4.h();
        D1().a();
        c cVar = c.R[this.currentAccount];
        if (cVar != null) {
            g15.A(cVar.M);
            cVar.J.clear();
            cVar.Q.clear();
            WalletEngine2 walletEngine2 = cVar.b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                cVar.b = null;
                cVar.d = null;
            }
            t05 t05Var = cVar.o;
            if (t05Var != null) {
                t05Var.b();
            }
            int i3 = cVar.a;
            if (cVar.C >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(cVar.C, true);
                cVar.C = -1;
            }
            if (cVar.D >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(cVar.D, true);
                cVar.D = -1;
            }
            if (cVar.E >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(cVar.E, true);
                cVar.E = -1;
            }
            cVar.p0();
            cVar.G.clear();
            p15 p15Var = cVar.t;
            if (p15Var != null) {
                p15Var.h();
                cVar.t = null;
            }
            gl.r(cVar.H);
            gl.r(cVar.I);
            synchronized (c.class) {
                if (c.R[cVar.a] == cVar) {
                    c.R[cVar.a] = null;
                }
            }
        }
        g2b g2bVar = this.e0;
        if (g2bVar != null) {
            g2bVar.p();
        }
        v4c v4cVar = this.g0;
        if (v4cVar != null) {
            v4cVar.a();
        }
        this.n3 = false;
        cj3.D4[this.currentAccount] = false;
        this.W3.edit().clear().commit();
        this.Y3.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        ls6.i(this.X3.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editor = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                Integer z = Utilities.z(key);
                int intValue = z.intValue();
                if (editor == null) {
                    editor = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(a.b);
                }
                editor.putBoolean("deleted" + intValue, true);
                if (sharedPreferences.getInt("type" + intValue, 0) == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(z);
                } else {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(z);
                }
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ChatsWidgetProvider.a(a.b, appWidgetManager, ((Integer) arrayList2.get(i4)).intValue());
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ContactsWidgetProvider.a(a.b, appWidgetManager, ((Integer) arrayList3.get(i5)).intValue());
            }
        }
        this.C1.b();
        this.D1.b();
        this.E1.b();
        this.F1.b();
        this.G1.b();
        this.w1.clear();
        this.x1.b();
        this.y1.clear();
        this.z1.b();
        this.A1.clear();
        this.B1.b();
        this.t1.b();
        this.u1.b();
        this.v1.b();
        this.R.b();
        this.P.clear();
        this.h2.clear();
        this.Q.clear();
        this.r.b();
        this.b1.b();
        this.c1.b();
        this.h.clear();
        this.m1.clear();
        this.e1.b();
        this.w.clear();
        this.x.b();
        this.G4.clear();
        this.F4.clear();
        this.I4.b();
        this.H4.clear();
        this.n.clear();
        this.s1.clear();
        this.A0.b();
        this.B0.b();
        this.C0 = 0;
        this.F.clear();
        this.E.clear();
        this.p4.clear();
        this.o4.clear();
        this.y.clear();
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
        this.q1.b();
        this.r1.clear();
        this.d.clear();
        this.e.clear();
        this.L2 = null;
        this.R4.b();
        this.S4.clear();
        this.b.clear();
        this.S.b();
        this.U.clear();
        this.W.clear();
        this.X.b();
        this.Y.b();
        this.a0.clear();
        this.k0.b();
        this.u0.b();
        this.v0.b();
        this.c0 = 0;
        t97[] t97VarArr = this.N;
        t97VarArr[1] = null;
        t97VarArr[0] = null;
        this.G0.clear();
        this.J0.clear();
        this.K0 = false;
        this.M0.clear();
        this.L0 = false;
        this.Z3 = false;
        Utilities.d.c(new c87(this, (byte) 13));
        this.n0.clear();
        this.o0.clear();
        this.p0.clear();
        this.x0.clear();
        int i6 = 0;
        while (true) {
            vf6[] vf6VarArr = this.Z;
            if (i6 >= vf6VarArr.length) {
                break;
            }
            vf6 vf6Var = vf6VarArr[i6];
            if (vf6Var != null) {
                vf6Var.b();
            }
            i6++;
        }
        this.h1.clear();
        this.i1.clear();
        this.j1.clear();
        this.H1.b();
        this.l1.clear();
        this.n1.clear();
        this.o1.clear();
        this.p1.clear();
        this.R1 = false;
        this.S1.clear();
        this.T1.clear();
        this.U1.clear();
        this.V1.clear();
        this.x2 = false;
        this.y2 = 0;
        this.m2 = 0;
        this.n2 = false;
        this.W1 = false;
        this.N1 = 0;
        this.O1 = null;
        this.P1 = null;
        this.M1 = false;
        this.w0 = false;
        this.y0 = -1;
        this.z0 = false;
        this.b2 = false;
        this.a2 = false;
        this.e2 = false;
        this.C2 = 0L;
        this.F2 = false;
        this.c2 = false;
        this.Z1 = true;
        this.G2 = null;
        this.J2 = null;
        this.K2 = null;
        this.I2.clear();
        this.R0.b();
        this.D2 = 0;
        this.E2 = (byte) 0;
        Utilities.d.c(new c87(this, (byte) 14));
        if (this.Q1 != null) {
            Utilities.d.a(this.Q1);
            this.Q1 = null;
        }
        h();
        gl.d3(new c87(this, (byte) 15));
    }

    public final int M0(long j) {
        TLRPC.ChatFull L0 = q1(this.currentAccount).L0(-j);
        if (L0 != null && (!(L0 instanceof TLRPC.TL_chatFull) ? (L0.flags2 & 8192) != 0 : (L0.flags & 1048576) != 0)) {
            return L0.reactions_limit;
        }
        return this.k4.j3.f();
    }

    public final g2b M1() {
        g2b g2bVar = this.e0;
        if (g2bVar != null) {
            return g2bVar;
        }
        synchronized (t5[this.currentAccount]) {
            g2b g2bVar2 = this.e0;
            if (g2bVar2 != null) {
                return g2bVar2;
            }
            g2b g2bVar3 = new g2b(this.currentAccount);
            this.e0 = g2bVar3;
            return g2bVar3;
        }
    }

    public final boolean M2(String str) {
        boolean c2;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings != null && str != null) {
            String J0 = gl.J0(str, false);
            if (J0 == null) {
                J0 = gl.J0("//".concat(str), false);
            }
            if (tL_webBrowserSettings.open_external_browser) {
                c2 = !c2(J0, tL_webBrowserSettings.inapp_exceptions);
            } else {
                c2 = c2(J0, tL_webBrowserSettings.external_exceptions);
            }
            if (!c2) {
                return true;
            }
        }
        return false;
    }

    public final void M3(final org.telegram.tgnet.TLRPC.messages_Messages r50, final int r51, long r52, final long r54, final int r56, final int r57, final int r58, final boolean r59, final int r60, final int r61, final int r62, final int r63, final int r64, final int r65, final boolean r66, final int r67, long r68, final int r70, final boolean r71, final int r72, final boolean r73, final boolean r74, final defpackage.qob r75) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.M3(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, qob):void");
    }

    public final void M4(int i, long j) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = h1(j);
        tL_messages_setHistoryTTL.period = i;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new y47(this, (byte) 2));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j);
        if (dialog != null) {
            dialog.ttl_period = i;
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new bb7(messagesStorage, i, j, (byte) 0));
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.ChatFull chatFull = null;
        if (i2 > 0) {
            userFull = W1(j);
            if (userFull != null) {
                userFull.ttl_period = i;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull L0 = L0(-j);
            if (L0 != null) {
                L0.ttl_period = i;
                boolean z = L0 instanceof TLRPC.TL_channelFull;
                int i3 = L0.flags;
                if (z) {
                    L0.flags = i3 | 16777216;
                } else {
                    L0.flags = i3 | 16384;
                }
            }
            chatFull = L0;
            userFull = null;
        }
        if (chatFull != null) {
            kk7 notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(kk7.S, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(kk7.D0, Long.valueOf(j), userFull);
        }
    }

    public final void N(ga7 ga7Var) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (ga7Var.b != 0 && ga7Var.c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) ga7Var.b;
            tL_messages_readDiscussion.peer = h1(ga7Var.a);
            tL_messages_readDiscussion.read_max_id = ga7Var.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new ce2((byte) 0));
            return;
        }
        boolean B = cf3.B(ga7Var.a);
        long j = ga7Var.a;
        if (!B) {
            TLRPC.InputPeer h1 = h1(j);
            if (ga7Var.c != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = h1(ga7Var.a);
                tL_messages_readSavedHistory.peer = h1(ga7Var.c);
                tL_messages_readSavedHistory.max_id = ga7Var.d;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (h1 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = f1(-ga7Var.a);
                tL_channels_readHistory.max_id = ga7Var.d;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = h1;
                tL_messages_readHistory2.max_id = ga7Var.d;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new y47(this, (byte) 1));
            return;
        }
        TLRPC.EncryptedChat Y0 = Y0(Integer.valueOf((int) (j & 4294967295L)));
        byte[] bArr = Y0.auth_key;
        if (bArr != null && bArr.length > 1 && (Y0 instanceof TLRPC.TL_encryptedChat)) {
            TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
            tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
            tL_inputEncryptedChat.chat_id = Y0.id;
            tL_inputEncryptedChat.access_hash = Y0.access_hash;
            tL_messages_readEncryptedHistory.max_date = ga7Var.e;
            getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new ce2((byte) 0));
        }
    }

    public final r97 N0(long j) {
        LongSparseArray longSparseArray = this.f5;
        r97 r97Var = (r97) longSparseArray.get(j);
        if (r97Var == null) {
            r97 r97Var2 = new r97(this.currentAccount, j);
            longSparseArray.put(j, r97Var2);
            return r97Var2;
        }
        return r97Var;
    }

    public final boolean N2() {
        if (!L2()) {
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
            if (tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void N3(int i, int i2, long j) {
        if (w01.a) {
            ug8.q(j, ir2.p("processNewChannelDifferenceParams pts = ", i, " pts_count = ", i2, " channeldId = "));
        }
        LongSparseIntArray longSparseIntArray = this.P0;
        int i3 = longSparseIntArray.get(j);
        if (i3 == 0) {
            i3 = getMessagesStorage().M(j);
            if (i3 == 0) {
                i3 = 1;
            }
            longSparseIntArray.put(j, i3);
        }
        if (i3 + i2 == i) {
            if (w01.a) {
                fa4.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j, i);
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new bb7(messagesStorage, i, j, (byte) 5));
        } else if (i3 != i) {
            LongSparseLongArray longSparseLongArray = this.O0;
            long j2 = longSparseLongArray.get(j);
            if (!((Boolean) this.Q0.g(Boolean.FALSE, j)).booleanValue() && j2 != 0 && Math.abs(System.currentTimeMillis() - j2) > 1500) {
                G0(j);
                return;
            }
            if (w01.a) {
                fa4.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i + " pts_count = " + i2);
            }
            if (j2 == 0) {
                longSparseLongArray.put(j, System.currentTimeMillis());
            }
            TLRPC.Updates updates = new TLRPC.Updates();
            updates.pts = i;
            updates.pts_count = i2;
            updates.chat_id = j;
            vf6 vf6Var = this.N0;
            ArrayList arrayList = (ArrayList) vf6Var.f(j);
            if (arrayList == null) {
                arrayList = tb4.s(vf6Var, j);
            }
            arrayList.add(updates);
        }
    }

    public final void N4(t97 t97Var, boolean z) {
        if (t97Var != null) {
            Integer valueOf = Integer.valueOf(t97Var.a);
            HashSet hashSet = this.n4;
            if (z != hashSet.contains(valueOf)) {
                int i = t97Var.a;
                if (z) {
                    hashSet.add(Integer.valueOf(i));
                } else {
                    hashSet.remove(Integer.valueOf(i));
                }
                B4();
                Y4(null);
                getNotificationCenter().k(kk7.O2, Integer.valueOf(t97Var.a));
            }
        }
    }

    public final void O(Activity activity, TLRPC.Chat chat, d dVar, sc7 sc7Var) {
        hd hdVar;
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = g1(chat);
        if (activity != null) {
            hdVar = new hd(3, null, activity);
        } else {
            hdVar = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new kn0(this, activity, hdVar, sc7Var, dVar, tL_channels_convertToGigagroup, (byte) 2));
        if (hdVar != null) {
            hdVar.setOnCancelListener(new k77(this, sendRequest, (byte) 1));
            try {
                hdVar.q(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final c86 O0(long j) {
        TLRPC.Chat K0;
        ?? obj = new Object();
        ArrayList arrayList = (ArrayList) this.x.f(j);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                long j2 = dialog.id;
                boolean z = true;
                if (j2 < 0 && (K0 = K0(Long.valueOf(-j2))) != null && (K0.forum || (K0.monoforum && hc2.A(this.currentAccount, K0, 24)))) {
                    q1(this.currentAccount).g4.h(K0.id);
                    int i2 = obj.a;
                    int[] iArr = pub.w;
                    int i3 = iArr[0];
                    obj.a = i2 + i3;
                    obj.b += iArr[1];
                    obj.c += iArr[2];
                    obj.d += iArr[4];
                    boolean z2 = obj.e;
                    if (!z2 && i3 > 0) {
                        if (iArr[3] == 0) {
                            z = false;
                        }
                        obj.e = z2 | z;
                    }
                } else {
                    int i4 = obj.a;
                    int i5 = dialog.unread_count;
                    obj.a = i4 + i5;
                    obj.b += dialog.unread_mentions_count;
                    obj.c += dialog.unread_reactions_count;
                    obj.d += dialog.unread_poll_votes_count;
                    boolean z3 = obj.e;
                    if (!z3 && i5 > 0) {
                        obj.e = z3 | (!n2(dialog.id, 0L, null));
                    }
                }
            }
        }
        return obj;
    }

    public final ic O1() {
        ic icVar = this.j4;
        if (icVar == null) {
            ic icVar2 = new ic(this.currentAccount);
            this.j4 = icVar2;
            return icVar2;
        }
        return icVar;
    }

    public final void O3(int i, int i2, int i3) {
        if (w01.a) {
            b00.p(i3, ir2.p("processNewDifferenceParams seq = -1 pts = ", i, " date = ", i2, " pts_count = "));
        }
        if (i != -1) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.G();
            if (messagesStorage.r + i3 == i) {
                if (w01.a) {
                    fa4.b("APPLY PTS");
                }
                getMessagesStorage().F1(i);
                ad7 messagesStorage2 = getMessagesStorage();
                ad7 messagesStorage3 = getMessagesStorage();
                messagesStorage3.G();
                int i4 = messagesStorage3.w;
                ad7 messagesStorage4 = getMessagesStorage();
                messagesStorage4.G();
                int i5 = messagesStorage4.r;
                ad7 messagesStorage5 = getMessagesStorage();
                messagesStorage5.G();
                int i6 = messagesStorage5.n;
                ad7 messagesStorage6 = getMessagesStorage();
                messagesStorage6.G();
                messagesStorage2.x1(i4, i5, i6, messagesStorage6.s);
                return;
            }
            ad7 messagesStorage7 = getMessagesStorage();
            messagesStorage7.G();
            if (messagesStorage7.r != i) {
                if (!this.Y1 && this.Z0 != 0 && Math.abs(System.currentTimeMillis() - this.Z0) > 1500) {
                    V0();
                    return;
                }
                if (w01.a) {
                    fa4.b("ADD UPDATE TO QUEUE pts = " + i + " pts_count = " + i3);
                }
                if (this.Z0 == 0) {
                    this.Z0 = System.currentTimeMillis();
                }
                TLRPC.Updates updates = new TLRPC.Updates();
                updates.pts = i;
                updates.pts_count = i3;
                this.W0.add(updates);
            }
        }
    }

    public final void O4(long j, long j2) {
        this.X3.edit().putLong(ls6.n(j, "forumlasttopic"), j2).apply();
    }

    public final void P(Context context, long j, d dVar, vc7 vc7Var, n92 n92Var) {
        hd hdVar;
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j;
        if (context != null) {
            hdVar = new hd(3, null, context);
        } else {
            hdVar = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new j77(this, context, hdVar, vc7Var, j, n92Var, dVar, tL_messages_migrateChat));
        if (hdVar != null) {
            hdVar.setOnCancelListener(new k77(this, sendRequest, (byte) 0));
            try {
                hdVar.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void P0(p8c p8cVar) {
        if (this.a5 != null && System.currentTimeMillis() - this.Z4 < 3600000) {
            if (p8cVar != null) {
                p8cVar.a(this.a5);
                return;
            }
            return;
        }
        ArrayList arrayList = this.Y4;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.Y4 = arrayList;
        }
        if (p8cVar != null) {
            arrayList.add(p8cVar);
        }
        if (this.X4) {
            return;
        }
        this.X4 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new y47(this, (byte) 25));
    }

    public final v4c P1() {
        v4c v4cVar = this.g0;
        if (v4cVar != null) {
            return v4cVar;
        }
        synchronized (t5[this.currentAccount]) {
            v4c v4cVar2 = this.g0;
            if (v4cVar2 != null) {
                return v4cVar2;
            }
            v4c v4cVar3 = new v4c(this.currentAccount);
            this.g0 = v4cVar3;
            return v4cVar3;
        }
    }

    public final void P2(TLRPC.TL_help_appConfig tL_help_appConfig) {
        boolean z;
        int i;
        char c;
        gr grVar;
        int i2;
        boolean z2;
        int i3;
        int i4;
        TLRPC.TL_jsonObject tL_jsonObject;
        boolean z3;
        HashMap hashMap;
        int i5;
        int i6;
        long parseLong;
        boolean z4;
        int i7;
        boolean x4;
        HashMap hashMap2;
        TLRPC.TL_jsonObject tL_jsonObject2;
        int i8;
        int i9;
        int i10;
        int intValue;
        char c2;
        int i11;
        int i12;
        ArrayList<TLRPC.TL_jsonObjectValue> arrayList;
        char c3;
        int i13;
        if (tL_help_appConfig != null) {
            TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                TLRPC.TL_jsonObject tL_jsonObject3 = (TLRPC.TL_jsonObject) jSONValue;
                SharedPreferences sharedPreferences = this.X3;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.K3 = new HashSet();
                sharedPreferences.edit().remove("ignoreRestrictionReasons").apply();
                gr grVar2 = this.k4;
                qr2 qr2Var = grVar2.a;
                HashMap hashMap3 = qr2Var.a;
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size = tL_jsonObject3.value.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject3.value.get(i14);
                    fr2 fr2Var = (fr2) hashMap3.get(tL_jsonObjectValue.key);
                    if (fr2Var != null && tL_jsonObjectValue.value != null) {
                        hashSet.add(fr2Var);
                        if (fr2Var.b(edit, tL_jsonObjectValue.value) && !arrayList2.contains(fr2Var)) {
                            arrayList2.add(fr2Var);
                        }
                    }
                }
                for (fr2 fr2Var2 : hashMap3.values()) {
                    if (!hashSet.contains(fr2Var2) && fr2Var2.c(edit)) {
                        arrayList2.add(fr2Var2);
                    }
                }
                qr2Var.c.addAll(arrayList2);
                int size2 = tL_jsonObject3.value.size();
                boolean z5 = !arrayList2.isEmpty();
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                TLRPC.TL_jsonObject tL_jsonObject4 = null;
                boolean z6 = false;
                while (i15 < size2) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObject3.value.get(i15);
                    String str = tL_jsonObjectValue2.key;
                    str.getClass();
                    switch (str.hashCode()) {
                        case -2031587591:
                            if (str.equals("telegram_antispam_user_id")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1688620344:
                            if (str.equals("dialog_filters_tooltip")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1318497457:
                            if (str.equals("ignore_restriction_reasons")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1133154193:
                            if (str.equals("lite_app_options")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1086302656:
                            if (str.equals("lite_device_class")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1032177933:
                            if (str.equals("emojies_send_dice")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -538467216:
                            if (str.equals("ton_stakedice_stake_suggested_amounts")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -381432266:
                            if (str.equals("premium_promo_order")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -297801185:
                            if (str.equals("business_promo_order")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -232883529:
                            if (str.equals("emojies_send_dice_success")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 59202071:
                            if (str.equals("stargifts_craft_attribute_permilles")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 222975416:
                            if (str.equals("gif_search_emojies")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 280936278:
                            if (str.equals("stories_posting")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 812427767:
                            if (str.equals("login_google_oauth_client_id")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 992898905:
                            if (str.equals("inapp_update_check_delay")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1181024400:
                            if (str.equals("stars_groupcall_message_limits")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1366527782:
                            if (str.equals("transcribe_audio_trial_cooldown_until")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1468149675:
                            if (str.equals("transcribe_audio_trial_weekly_number")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1520575749:
                            if (str.equals("whitelisted_bots")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1637671355:
                            if (str.equals("web_app_allowed_protocols")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1850325103:
                            if (str.equals("emojies_sounds")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1953570861:
                            if (str.equals("starref_start_param_prefixes")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    TLRPC.TL_jsonObject tL_jsonObject5 = tL_jsonObject3;
                    switch (c) {
                        case 0:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                            if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                                try {
                                    parseLong = Long.parseLong(((TLRPC.TL_jsonString) jSONValue2).value);
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                if (parseLong != this.L3) {
                                    this.L3 = parseLong;
                                    edit.putLong("telegramAntispamUserId", parseLong);
                                    z5 = true;
                                    tL_jsonObject4 = tL_jsonObject;
                                    z6 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case 1:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue3 = tL_jsonObjectValue2.value;
                            if ((jSONValue3 instanceof TLRPC.TL_jsonBool) && (z4 = ((TLRPC.TL_jsonBool) jSONValue3).value) != this.n3) {
                                this.n3 = z4;
                                edit.putBoolean("showFiltersTooltip", z4);
                                getNotificationCenter().k(kk7.Q2, new Object[0]);
                                z5 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 2:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            HashSet hashSet2 = new HashSet();
                            TLRPC.JSONValue jSONValue4 = tL_jsonObjectValue2.value;
                            if (jSONValue4 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue4;
                                int size3 = tL_jsonArray.value.size();
                                for (int i18 = 0; i18 < size3; i18++) {
                                    TLRPC.JSONValue jSONValue5 = tL_jsonArray.value.get(i18);
                                    if (jSONValue5 instanceof TLRPC.TL_jsonString) {
                                        hashSet2.add(((TLRPC.TL_jsonString) jSONValue5).value.toLowerCase());
                                    }
                                }
                            }
                            if (!this.K3.equals(hashSet2)) {
                                this.K3 = hashSet2;
                                edit.putStringSet("ignoreRestrictionReasons", hashSet2);
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 3:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue6 = tL_jsonObjectValue2.value;
                            if (jSONValue6 instanceof TLRPC.TL_jsonObject) {
                                tL_jsonObject4 = (TLRPC.TL_jsonObject) jSONValue6;
                                z5 = z2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case 4:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue7 = tL_jsonObjectValue2.value;
                            if ((jSONValue7 instanceof TLRPC.TL_jsonNumber) && (i7 = (int) ((TLRPC.TL_jsonNumber) jSONValue7).value) > 0) {
                                gba.v(i7 - 1);
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 5:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            HashSet hashSet3 = new HashSet();
                            TLRPC.JSONValue jSONValue8 = tL_jsonObjectValue2.value;
                            if (jSONValue8 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray2 = (TLRPC.TL_jsonArray) jSONValue8;
                                int size4 = tL_jsonArray2.value.size();
                                for (int i19 = 0; i19 < size4; i19++) {
                                    TLRPC.JSONValue jSONValue9 = tL_jsonArray2.value.get(i19);
                                    if (jSONValue9 instanceof TLRPC.TL_jsonString) {
                                        hashSet3.add(((TLRPC.TL_jsonString) jSONValue9).value.replace("️", ""));
                                    }
                                }
                            }
                            if (!this.y3.equals(hashSet3)) {
                                this.y3 = hashSet3;
                                edit.putStringSet("diceEmojies", hashSet3);
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 6:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue10 = tL_jsonObjectValue2.value;
                            if (jSONValue10 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray3 = (TLRPC.TL_jsonArray) jSONValue10;
                                long[] jArr = new long[tL_jsonArray3.value.size()];
                                for (int i20 = 0; i20 < tL_jsonArray3.value.size(); i20++) {
                                    if (tL_jsonArray3.value.get(i20) instanceof TLRPC.TL_jsonNumber) {
                                        jArr[i20] = (long) ((TLRPC.TL_jsonNumber) tL_jsonArray3.value.get(i20)).value;
                                    }
                                }
                                if (!Arrays.equals(jArr, this.U3)) {
                                    this.U3 = jArr;
                                    edit.putString("tonStakediceStakeSuggestedAmounts", (String) DesugarArrays.stream(jArr).mapToObj(new Object()).collect(Collectors.joining(",")));
                                    z5 = true;
                                    tL_jsonObject4 = tL_jsonObject;
                                    z6 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case 7:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue11 = tL_jsonObjectValue2.value;
                            if (jSONValue11 instanceof TLRPC.TL_jsonArray) {
                                x4 = x4("premiumFeaturesTypesToPosition", this.E0, edit, ((TLRPC.TL_jsonArray) jSONValue11).value);
                                z5 = z2 | x4;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case '\b':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue12 = tL_jsonObjectValue2.value;
                            if (jSONValue12 instanceof TLRPC.TL_jsonArray) {
                                x4 = x4("businessFeaturesTypesToPosition", this.F0, edit, ((TLRPC.TL_jsonArray) jSONValue12).value);
                                z5 = z2 | x4;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case '\t':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            try {
                                hashMap2 = new HashMap();
                                TLRPC.JSONValue jSONValue13 = tL_jsonObjectValue2.value;
                                if (jSONValue13 instanceof TLRPC.TL_jsonObject) {
                                    TLRPC.TL_jsonObject tL_jsonObject6 = (TLRPC.TL_jsonObject) jSONValue13;
                                    int size5 = tL_jsonObject6.value.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue3 = tL_jsonObject6.value.get(i21);
                                        TLRPC.JSONValue jSONValue14 = tL_jsonObjectValue3.value;
                                        if (jSONValue14 instanceof TLRPC.TL_jsonObject) {
                                            TLRPC.TL_jsonObject tL_jsonObject7 = (TLRPC.TL_jsonObject) jSONValue14;
                                            int size6 = tL_jsonObject7.value.size();
                                            int i22 = 0;
                                            int i23 = Integer.MAX_VALUE;
                                            int i24 = Integer.MAX_VALUE;
                                            while (i22 < size6) {
                                                TLRPC.TL_jsonObjectValue tL_jsonObjectValue4 = tL_jsonObject7.value.get(i22);
                                                TLRPC.TL_jsonObject tL_jsonObject8 = tL_jsonObject6;
                                                if (tL_jsonObjectValue4.value instanceof TLRPC.TL_jsonNumber) {
                                                    i10 = size5;
                                                    if ("value".equals(tL_jsonObjectValue4.key)) {
                                                        i24 = (int) ((TLRPC.TL_jsonNumber) tL_jsonObjectValue4.value).value;
                                                    } else if ("frame_start".equals(tL_jsonObjectValue4.key)) {
                                                        i23 = (int) ((TLRPC.TL_jsonNumber) tL_jsonObjectValue4.value).value;
                                                    }
                                                } else {
                                                    i10 = size5;
                                                }
                                                i22++;
                                                tL_jsonObject6 = tL_jsonObject8;
                                                size5 = i10;
                                            }
                                            tL_jsonObject2 = tL_jsonObject6;
                                            i8 = size5;
                                            if (i23 != Integer.MAX_VALUE && (i9 = i24) != Integer.MAX_VALUE) {
                                                hashMap2.put(tL_jsonObjectValue3.key.replace("️", ""), new x97(i23, i9));
                                            }
                                        } else {
                                            tL_jsonObject2 = tL_jsonObject6;
                                            i8 = size5;
                                        }
                                        i21++;
                                        tL_jsonObject6 = tL_jsonObject2;
                                        size5 = i8;
                                    }
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            if (!this.A3.equals(hashMap2)) {
                                this.A3 = hashMap2;
                                SerializedData serializedData = new SerializedData();
                                serializedData.writeInt32(this.A3.size());
                                for (Map.Entry entry : this.A3.entrySet()) {
                                    serializedData.writeString((String) entry.getKey());
                                    x97 x97Var = (x97) entry.getValue();
                                    serializedData.writeInt32(x97Var.a);
                                    serializedData.writeInt32(x97Var.b);
                                }
                                edit.putString("diceSuccess", Base64.encodeToString(serializedData.toByteArray(), 0));
                                serializedData.cleanup();
                                z5 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case '\n':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue15 = tL_jsonObjectValue2.value;
                            if (jSONValue15 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray4 = (TLRPC.TL_jsonArray) jSONValue15;
                                int[][] iArr = new int[tL_jsonArray4.value.size()];
                                for (int i25 = 0; i25 < tL_jsonArray4.value.size(); i25++) {
                                    if (tL_jsonArray4.value.get(i25) instanceof TLRPC.TL_jsonArray) {
                                        TLRPC.TL_jsonArray tL_jsonArray5 = (TLRPC.TL_jsonArray) tL_jsonArray4.value.get(i25);
                                        iArr[i25] = new int[tL_jsonArray5.value.size()];
                                        for (int i26 = 0; i26 < tL_jsonArray5.value.size(); i26++) {
                                            if (tL_jsonArray5.value.get(i26) instanceof TLRPC.TL_jsonNumber) {
                                                iArr[i25][i26] = (int) ((TLRPC.TL_jsonNumber) tL_jsonArray5.value.get(i26)).value;
                                            }
                                        }
                                    }
                                }
                                if (!Arrays.deepEquals(iArr, this.V3)) {
                                    this.V3 = iArr;
                                    edit.putString("stargiftsCraftAttributesPermilles", (String) DesugarArrays.stream(iArr).map(new xz((byte) 14)).collect(Collectors.joining(",,")));
                                    tL_jsonObject4 = tL_jsonObject;
                                    z6 = z3;
                                    i16 = i4;
                                    z5 = true;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 11:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            ArrayList arrayList3 = new ArrayList();
                            TLRPC.JSONValue jSONValue16 = tL_jsonObjectValue2.value;
                            if (jSONValue16 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray6 = (TLRPC.TL_jsonArray) jSONValue16;
                                int size7 = tL_jsonArray6.value.size();
                                for (int i27 = 0; i27 < size7; i27++) {
                                    TLRPC.JSONValue jSONValue17 = tL_jsonArray6.value.get(i27);
                                    if (jSONValue17 instanceof TLRPC.TL_jsonString) {
                                        arrayList3.add(((TLRPC.TL_jsonString) jSONValue17).value.replace("️", ""));
                                    }
                                }
                            }
                            if (!this.x3.equals(arrayList3)) {
                                this.x3 = arrayList3;
                                SerializedData serializedData2 = new SerializedData();
                                serializedData2.writeInt32(this.x3.size());
                                int size8 = this.x3.size();
                                for (int i28 = 0; i28 < size8; i28++) {
                                    serializedData2.writeString((String) this.x3.get(i28));
                                }
                                edit.putString("gifSearchEmojies", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case '\f':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue18 = tL_jsonObjectValue2.value;
                            if (jSONValue18 instanceof TLRPC.TL_jsonString) {
                                TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue18;
                                if (!TextUtils.equals(tL_jsonString.value, this.R3)) {
                                    String str2 = tL_jsonString.value;
                                    this.R3 = str2;
                                    edit.putString("storiesPosting", str2);
                                    z5 = true;
                                    z6 = true;
                                } else {
                                    z5 = z2;
                                    z6 = z3;
                                }
                                tL_jsonObject4 = tL_jsonObject;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case '\r':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue19 = tL_jsonObjectValue2.value;
                            if (jSONValue19 instanceof TLRPC.TL_jsonString) {
                                String str3 = ((TLRPC.TL_jsonString) jSONValue19).value;
                                if (!Objects.equals(w01.h, str3)) {
                                    w01.h = str3;
                                    edit.putString("googleAuthClientId", str3);
                                    z5 = true;
                                    tL_jsonObject4 = tL_jsonObject;
                                    z6 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                        case 14:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue20 = tL_jsonObjectValue2.value;
                            if (jSONValue20 instanceof TLRPC.TL_jsonNumber) {
                                double d = ((TLRPC.TL_jsonNumber) jSONValue20).value;
                                if (d != this.h3) {
                                    int i29 = (int) d;
                                    this.h3 = i29;
                                    edit.putInt("updateCheckDelay", i29);
                                }
                                z5 = z2;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                break;
                            } else {
                                if ((jSONValue20 instanceof TLRPC.TL_jsonString) && (intValue = Utilities.z(((TLRPC.TL_jsonString) jSONValue20).value).intValue()) != this.h3) {
                                    this.h3 = intValue;
                                    edit.putInt("updateCheckDelay", intValue);
                                }
                                z5 = z2;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                            }
                            z5 = true;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 15:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue21 = tL_jsonObjectValue2.value;
                            if (jSONValue21 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray7 = (TLRPC.TL_jsonArray) jSONValue21;
                                int size9 = tL_jsonArray7.value.size() * 7;
                                int[] iArr2 = new int[size9];
                                int i30 = 0;
                                while (i30 < tL_jsonArray7.value.size()) {
                                    TLRPC.JSONValue jSONValue22 = tL_jsonArray7.value.get(i30);
                                    if (jSONValue22 instanceof TLRPC.TL_jsonObject) {
                                        ArrayList<TLRPC.TL_jsonObjectValue> arrayList4 = ((TLRPC.TL_jsonObject) jSONValue22).value;
                                        int size10 = arrayList4.size();
                                        int i31 = 0;
                                        while (i31 < size10) {
                                            int i32 = i31 + 1;
                                            TLRPC.TL_jsonObjectValue tL_jsonObjectValue5 = arrayList4.get(i31);
                                            TLRPC.JSONValue jSONValue23 = tL_jsonObjectValue5.value;
                                            if (jSONValue23 instanceof TLRPC.TL_jsonNumber) {
                                                int i33 = (int) ((TLRPC.TL_jsonNumber) jSONValue23).value;
                                                String str4 = tL_jsonObjectValue5.key;
                                                str4.getClass();
                                                switch (str4.hashCode()) {
                                                    case -1544802595:
                                                        if (str4.equals("text_length_max")) {
                                                            c3 = 0;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1186480213:
                                                        if (str4.equals("pin_period")) {
                                                            c3 = 1;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 109757537:
                                                        if (str4.equals("stars")) {
                                                            c3 = 2;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 1686749675:
                                                        if (str4.equals("emoji_max")) {
                                                            c3 = 3;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    default:
                                                        c3 = 65535;
                                                        break;
                                                }
                                                switch (c3) {
                                                    case 0:
                                                        i13 = 2;
                                                        break;
                                                    case 1:
                                                        i13 = 1;
                                                        break;
                                                    case 2:
                                                        i13 = 0;
                                                        break;
                                                    case 3:
                                                        i13 = 3;
                                                        break;
                                                    default:
                                                        i13 = -1;
                                                        break;
                                                }
                                                if (i13 >= 0) {
                                                    iArr2[(i30 * 7) + i13] = i33;
                                                }
                                            } else if (jSONValue23 instanceof TLRPC.TL_jsonString) {
                                                String str5 = ((TLRPC.TL_jsonString) jSONValue23).value;
                                                String str6 = tL_jsonObjectValue5.key;
                                                str6.getClass();
                                                switch (str6.hashCode()) {
                                                    case -1354842834:
                                                        if (str6.equals("color1")) {
                                                            c2 = 0;
                                                            break;
                                                        }
                                                        c2 = 65535;
                                                        break;
                                                    case -1354842833:
                                                        if (str6.equals("color2")) {
                                                            c2 = 1;
                                                            break;
                                                        }
                                                        c2 = 65535;
                                                        break;
                                                    case -628825439:
                                                        if (str6.equals("color_bg")) {
                                                            c2 = 2;
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
                                                        i11 = 4;
                                                        break;
                                                    case 1:
                                                        i11 = 5;
                                                        break;
                                                    case 2:
                                                        i11 = 6;
                                                        break;
                                                    default:
                                                        i11 = -1;
                                                        break;
                                                }
                                                if (i11 >= 0) {
                                                    try {
                                                        i12 = i30;
                                                        arrayList = arrayList4;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i12 = i30;
                                                        arrayList = arrayList4;
                                                    }
                                                    try {
                                                        iArr2[(i12 * 7) + i11] = (int) Long.parseLong("FF" + str5, 16);
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        fa4.g(e, true);
                                                        i31 = i32;
                                                        i30 = i12;
                                                        arrayList4 = arrayList;
                                                    }
                                                    i31 = i32;
                                                    i30 = i12;
                                                    arrayList4 = arrayList;
                                                }
                                            }
                                            i12 = i30;
                                            arrayList = arrayList4;
                                            i31 = i32;
                                            i30 = i12;
                                            arrayList4 = arrayList;
                                        }
                                    }
                                    i30++;
                                }
                                int[] iArr3 = this.T3;
                                if (iArr3 != null && size9 == iArr3.length) {
                                    for (int i34 = 0; i34 < size9; i34++) {
                                        if (iArr2[i34] == iArr3[i34]) {
                                        }
                                    }
                                }
                                this.T3 = iArr2;
                                edit.putString("starsGroupcallMessageLimits", (String) DesugarArrays.stream(iArr2).mapToObj(new z57((byte) 1)).collect(Collectors.joining(",")));
                                z5 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 16:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue24 = tL_jsonObjectValue2.value;
                            if (jSONValue24 instanceof TLRPC.TL_jsonNumber) {
                                i17 = (int) ((TLRPC.TL_jsonNumber) jSONValue24).value;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 17:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue25 = tL_jsonObjectValue2.value;
                            if (jSONValue25 instanceof TLRPC.TL_jsonNumber) {
                                i16 = (int) ((TLRPC.TL_jsonNumber) jSONValue25).value;
                                z5 = z2;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 18:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            HashSet hashSet4 = new HashSet();
                            TLRPC.JSONValue jSONValue26 = tL_jsonObjectValue2.value;
                            if (jSONValue26 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList5 = ((TLRPC.TL_jsonArray) jSONValue26).value;
                                for (int i35 = 0; i35 < arrayList5.size(); i35++) {
                                    if (arrayList5.get(i35) instanceof TLRPC.TL_jsonNumber) {
                                        hashSet4.add(Long.valueOf((long) ((TLRPC.TL_jsonNumber) arrayList5.get(i35)).value));
                                    }
                                }
                            }
                            if (!hashSet4.equals(this.S3)) {
                                this.S3 = hashSet4;
                                edit.putStringSet("whitelistedBots", (Set) Collection.EL.stream(hashSet4).map(new xz((byte) 13)).collect(Collectors.toCollection(new lm1((byte) 1))));
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 19:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            HashSet hashSet5 = new HashSet();
                            TLRPC.JSONValue jSONValue27 = tL_jsonObjectValue2.value;
                            if (jSONValue27 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray8 = (TLRPC.TL_jsonArray) jSONValue27;
                                int size11 = tL_jsonArray8.value.size();
                                for (int i36 = 0; i36 < size11; i36++) {
                                    TLRPC.JSONValue jSONValue28 = tL_jsonArray8.value.get(i36);
                                    if (jSONValue28 instanceof TLRPC.TL_jsonString) {
                                        hashSet5.add(((TLRPC.TL_jsonString) jSONValue28).value.toLowerCase());
                                    }
                                }
                            }
                            if (!this.J3.equals(hashSet5)) {
                                this.J3 = hashSet5;
                                edit.putStringSet("webAppAllowedProtocols", hashSet5);
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 20:
                            try {
                                hashMap = new HashMap();
                                TLRPC.JSONValue jSONValue29 = tL_jsonObjectValue2.value;
                                if (jSONValue29 instanceof TLRPC.TL_jsonObject) {
                                    TLRPC.TL_jsonObject tL_jsonObject9 = (TLRPC.TL_jsonObject) jSONValue29;
                                    int size12 = tL_jsonObject9.value.size();
                                    i2 = size2;
                                    int i37 = 0;
                                    while (i37 < size12) {
                                        z2 = z5;
                                        try {
                                            TLRPC.TL_jsonObjectValue tL_jsonObjectValue6 = tL_jsonObject9.value.get(i37);
                                            int i38 = i37;
                                            TLRPC.JSONValue jSONValue30 = tL_jsonObjectValue6.value;
                                            TLRPC.TL_jsonObject tL_jsonObject10 = tL_jsonObject9;
                                            if (jSONValue30 instanceof TLRPC.TL_jsonObject) {
                                                TLRPC.TL_jsonObject tL_jsonObject11 = (TLRPC.TL_jsonObject) jSONValue30;
                                                int size13 = tL_jsonObject11.value.size();
                                                grVar = grVar2;
                                                i5 = size12;
                                                i3 = i15;
                                                i4 = i16;
                                                tL_jsonObject = tL_jsonObject4;
                                                z3 = z6;
                                                long j = 0;
                                                long j2 = 0;
                                                String str7 = null;
                                                int i39 = 0;
                                                while (i39 < size13) {
                                                    int i40 = size13;
                                                    try {
                                                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue7 = tL_jsonObject11.value.get(i39);
                                                        TLRPC.TL_jsonObject tL_jsonObject12 = tL_jsonObject11;
                                                        if (tL_jsonObjectValue7.value instanceof TLRPC.TL_jsonString) {
                                                            i6 = i39;
                                                            if ("id".equals(tL_jsonObjectValue7.key)) {
                                                                j2 = Utilities.A(((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value).longValue();
                                                            } else if ("access_hash".equals(tL_jsonObjectValue7.key)) {
                                                                j = Utilities.A(((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value).longValue();
                                                            } else if ("file_reference_base64".equals(tL_jsonObjectValue7.key)) {
                                                                str7 = ((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value;
                                                            }
                                                        } else {
                                                            i6 = i39;
                                                        }
                                                        i39 = i6 + 1;
                                                        size13 = i40;
                                                        tL_jsonObject11 = tL_jsonObject12;
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        fa4.g(e, true);
                                                        z5 = z2;
                                                        tL_jsonObject4 = tL_jsonObject;
                                                        z6 = z3;
                                                        i16 = i4;
                                                        i15 = i3 + 1;
                                                        tL_jsonObject3 = tL_jsonObject5;
                                                        size2 = i2;
                                                        grVar2 = grVar;
                                                    }
                                                }
                                                if (j2 != 0 && j != 0 && str7 != null) {
                                                    String replace = tL_jsonObjectValue6.key.replace("️", "");
                                                    ?? obj = new Object();
                                                    obj.a = j2;
                                                    obj.b = j;
                                                    obj.c = Base64.decode(str7, 8);
                                                    hashMap.put(replace, obj);
                                                }
                                            } else {
                                                grVar = grVar2;
                                                i5 = size12;
                                                i3 = i15;
                                                i4 = i16;
                                                tL_jsonObject = tL_jsonObject4;
                                                z3 = z6;
                                            }
                                            i37 = i38 + 1;
                                            tL_jsonObject9 = tL_jsonObject10;
                                            size12 = i5;
                                            z5 = z2;
                                            tL_jsonObject4 = tL_jsonObject;
                                            z6 = z3;
                                            i15 = i3;
                                            i16 = i4;
                                            grVar2 = grVar;
                                        } catch (Exception e6) {
                                            e = e6;
                                            grVar = grVar2;
                                            i3 = i15;
                                            i4 = i16;
                                            tL_jsonObject = tL_jsonObject4;
                                            z3 = z6;
                                            fa4.g(e, true);
                                            z5 = z2;
                                            tL_jsonObject4 = tL_jsonObject;
                                            z6 = z3;
                                            i16 = i4;
                                            i15 = i3 + 1;
                                            tL_jsonObject3 = tL_jsonObject5;
                                            size2 = i2;
                                            grVar2 = grVar;
                                        }
                                    }
                                } else {
                                    i2 = size2;
                                }
                                grVar = grVar2;
                                z2 = z5;
                                i3 = i15;
                                i4 = i16;
                                tL_jsonObject = tL_jsonObject4;
                                z3 = z6;
                            } catch (Exception e7) {
                                e = e7;
                                grVar = grVar2;
                                i2 = size2;
                                z2 = z5;
                            }
                            if (!this.B3.equals(hashMap)) {
                                this.B3 = hashMap;
                                SerializedData serializedData3 = new SerializedData();
                                serializedData3.writeInt32(this.B3.size());
                                for (Map.Entry entry2 : this.B3.entrySet()) {
                                    serializedData3.writeString((String) entry2.getKey());
                                    y97 y97Var = (y97) entry2.getValue();
                                    serializedData3.writeInt64(y97Var.a);
                                    serializedData3.writeInt64(y97Var.b);
                                    serializedData3.writeByteArray(y97Var.c);
                                }
                                edit.putString("emojiSounds", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                                z5 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z6 = z3;
                                i16 = i4;
                            }
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 21:
                            HashSet hashSet6 = new HashSet();
                            TLRPC.JSONValue jSONValue31 = tL_jsonObjectValue2.value;
                            if (jSONValue31 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray9 = (TLRPC.TL_jsonArray) jSONValue31;
                                int size14 = tL_jsonArray9.value.size();
                                int i41 = 0;
                                while (i41 < size14) {
                                    TLRPC.JSONValue jSONValue32 = tL_jsonArray9.value.get(i41);
                                    TLRPC.TL_jsonArray tL_jsonArray10 = tL_jsonArray9;
                                    if (jSONValue32 instanceof TLRPC.TL_jsonString) {
                                        hashSet6.add(((TLRPC.TL_jsonString) jSONValue32).value.toLowerCase());
                                    }
                                    i41++;
                                    tL_jsonArray9 = tL_jsonArray10;
                                }
                            }
                            if (!this.M3.equals(hashSet6)) {
                                this.M3 = hashSet6;
                                edit.putStringSet("starrefStartParamPrefixes", hashSet6);
                                grVar = grVar2;
                                i2 = size2;
                                i3 = i15;
                                z5 = true;
                                break;
                            }
                        default:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z6;
                            z5 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z6 = z3;
                            i16 = i4;
                            break;
                    }
                    i15 = i3 + 1;
                    tL_jsonObject3 = tL_jsonObject5;
                    size2 = i2;
                    grVar2 = grVar;
                }
                gr grVar3 = grVar2;
                boolean z7 = z5;
                int i42 = i16;
                TLRPC.TL_jsonObject tL_jsonObject13 = tL_jsonObject4;
                boolean z8 = z6;
                if (i42 != this.G3) {
                    this.G3 = i42;
                    edit.putInt("transcribeAudioTrialWeeklyNumber", i42);
                    if (this.I3 <= 0 && (i17 == 0 || getConnectionsManager().getCurrentTime() > i17)) {
                        this.I3 = i42;
                        edit.putInt("transcribeAudioTrialCurrentNumber", i42);
                    } else if (this.I3 > i42) {
                        this.I3 = i42;
                        edit.putInt("transcribeAudioTrialCurrentNumber", i42);
                    }
                    z = true;
                } else {
                    z = z7;
                }
                if (i17 != this.H3) {
                    this.H3 = i17;
                    edit.putInt("transcribeAudioTrialCooldownUntil", i17);
                    gl.d3(new f67(this, (byte) 8));
                    z = true;
                }
                if (z) {
                    edit.apply();
                    gl.d3(new f67(this, (byte) 24));
                }
                if (tL_jsonObject13 != null) {
                    for (int i43 = 0; i43 < tL_jsonObject13.value.size(); i43++) {
                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue8 = tL_jsonObject13.value.get(i43);
                        if ("settings_mask".equals(tL_jsonObjectValue8.key)) {
                            TLRPC.JSONValue jSONValue33 = tL_jsonObjectValue8.value;
                            if (jSONValue33 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList6 = ((TLRPC.TL_jsonArray) jSONValue33).value;
                                try {
                                    e66.a = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(0)).value;
                                    e66.b = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(1)).value;
                                    e66.c = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(2)).value;
                                } catch (Exception e8) {
                                    fa4.g(e8, true);
                                }
                            }
                        }
                        if ("battery_low".equals(tL_jsonObjectValue8.key)) {
                            TLRPC.JSONValue jSONValue34 = tL_jsonObjectValue8.value;
                            if (jSONValue34 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList7 = ((TLRPC.TL_jsonArray) jSONValue34).value;
                                try {
                                    e66.d = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(0)).value;
                                    e66.e = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(1)).value;
                                    e66.f = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(2)).value;
                                } catch (Exception e9) {
                                    fa4.g(e9, true);
                                }
                            }
                        }
                    }
                    i = 0;
                    e66.g();
                } else {
                    i = 0;
                }
                qr2 qr2Var2 = grVar3.a;
                qr2Var2.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList8 = qr2Var2.c;
                int size15 = arrayList8.size();
                for (int i44 = i; i44 < size15; i44++) {
                    linkedHashSet.addAll(((fr2) arrayList8.get(i44)).c);
                }
                arrayList8.clear();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    try {
                        ((Runnable) it.next()).run();
                    } catch (Exception e10) {
                        fa4.g(e10, true);
                    }
                }
                if (z8) {
                    gl.d3(new f67(this, (byte) 25));
                }
            }
        }
        f67 f67Var = this.w4;
        gl.r(f67Var);
        gl.e3(f67Var, 240010L);
    }

    public final boolean P3(java.util.ArrayList r97, final java.util.ArrayList r98, final java.util.ArrayList r99, boolean r100, final int r101) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.P3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void P4(long j, boolean z, boolean z2) {
        if (!z) {
            ArrayList arrayList = this.n0;
            if (z2) {
                if (arrayList.contains(Long.valueOf(j))) {
                    return;
                }
                arrayList.add(Long.valueOf(j));
            } else {
                arrayList.remove(Long.valueOf(j));
                SparseArray sparseArray = (SparseArray) this.B0.f(j);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        ((k27) sparseArray.valueAt(i)).v0 = false;
                    }
                }
            }
        }
        Utilities.d.c(new mo1(this, z, z2, j, (byte) 3));
    }

    public final int Q(String str, ArrayList arrayList, String str2, int i, boolean z, Location location, String str3, int i2, d dVar) {
        boolean z2 = false;
        if (i == 0 && !z) {
            TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i2 >= 0) {
                tL_messages_createChat.ttl_period = i2;
                tL_messages_createChat.flags |= 1;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.User V1 = V1((Long) arrayList.get(i3));
                if (V1 != null) {
                    tL_messages_createChat.users.add(o1(V1));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new k45(this, dVar, tL_messages_createChat, (byte) 17), 2);
        } else if (!z && i != 2 && i != 4 && i != 5) {
            return 0;
        } else {
            TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
            tL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tL_channels_createChannel.about = str2;
            tL_channels_createChannel.for_import = z;
            if (!z && i != 4 && i != 5) {
                tL_channels_createChannel.broadcast = true;
            } else {
                tL_channels_createChannel.megagroup = true;
            }
            if (i == 5) {
                z2 = true;
            }
            tL_channels_createChannel.forum = z2;
            if (location != null) {
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                tL_channels_createChannel.geo_point = tL_inputGeoPoint;
                tL_inputGeoPoint.lat = location.getLatitude();
                tL_channels_createChannel.geo_point._long = location.getLongitude();
                tL_channels_createChannel.address = str3;
                tL_channels_createChannel.flags |= 4;
            }
            return getConnectionsManager().sendRequest(tL_channels_createChannel, new k45(this, dVar, tL_channels_createChannel, (byte) 18), 2);
        }
    }

    public final TLRPC.Dialog Q0(long j) {
        return (TLRPC.Dialog) this.R.f(j);
    }

    public final void Q3(org.telegram.tgnet.TLRPC.Updates r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.Q3(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public final void Q4(long j, boolean z, boolean z2) {
        ArrayList arrayList;
        if (z) {
            arrayList = this.p0;
        } else {
            arrayList = this.o0;
        }
        if (z2) {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public final long R(int i, long j) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2 = null;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e) {
            e = e;
        }
        try {
            nativeByteBuffer.writeInt32(102);
            nativeByteBuffer.writeInt64(j);
            nativeByteBuffer.writeInt32(i);
        } catch (Exception e2) {
            e = e2;
            nativeByteBuffer2 = nativeByteBuffer;
            fa4.g(e, true);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().y(nativeByteBuffer);
        }
        return getMessagesStorage().y(nativeByteBuffer);
    }

    public final ArrayList R0() {
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            return arrayList;
        }
        return this.G0;
    }

    public final void R2(int r63, java.util.ArrayList r64, java.util.ArrayList r65, java.util.ArrayList r66, java.util.ArrayList r67, defpackage.vf6 r68, int r69, org.telegram.messenger.support.LongSparseIntArray r70, defpackage.vf6 r71, defpackage.vf6 r72, java.util.ArrayList r73, defpackage.vf6 r74, defpackage.vf6 r75, defpackage.r34 r76, defpackage.vf6 r77, boolean r78, java.util.ArrayList r79, java.util.ArrayList r80, defpackage.vf6 r81, defpackage.vf6 r82, defpackage.vf6 r83, java.util.ArrayList r84) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.R2(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, vf6, int, org.telegram.messenger.support.LongSparseIntArray, vf6, vf6, java.util.ArrayList, vf6, vf6, r34, vf6, boolean, java.util.ArrayList, java.util.ArrayList, vf6, vf6, vf6, java.util.ArrayList):void");
    }

    public final void R3(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.R3(int, int):void");
    }

    public final void R4(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, d dVar, q21 q21Var) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = f1(j);
        if (user != null) {
            tL_channels_editBanned.participant = l1(user);
        } else {
            tL_channels_editBanned.participant = j1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new i45(this, j, q21Var, dVar, tL_channels_editBanned, z));
    }

    public final void S(long j, long j2) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.H(new yb7(messagesStorage, 0, j, j2, (byte) 1));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = h1(j);
        tL_messages_deleteParticipantReactions.participant = h1(j2);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new np0((byte) 0));
    }

    public final w97 S0(long j) {
        vf6 vf6Var = this.z4;
        w97 w97Var = (w97) vf6Var.f(j);
        if (w97Var == null) {
            w97 w97Var2 = new w97(this, j);
            vf6Var.k(w97Var2, j);
            return w97Var2;
        }
        return w97Var;
    }

    public final int S2(final long j, final long j2, final boolean z, boolean z2, final i8c i8cVar) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = f1(j2);
        tL_communities_togglePeerLink.peer = h1(j);
        tL_communities_togglePeerLink.deleted = z;
        tL_communities_togglePeerLink.visible = !z2;
        tL_communities_togglePeerLink.hidden = z2;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new hc((byte) 0), new i8c() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat K0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                na7 na7Var = na7.this;
                long j3 = j;
                i8c i8cVar2 = i8cVar;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (K0 = na7Var.K0(Long.valueOf(-j3))) != null) {
                    na7Var.S2(j3, K0.linked_community_id, true, false, i8cVar2);
                    return;
                }
                boolean z3 = bool instanceof TLRPC.TL_boolTrue;
                long j4 = j2;
                if (z3) {
                    long j5 = 0;
                    int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    boolean z4 = z;
                    if (i > 0) {
                        TLRPC.User V1 = na7Var.V1(Long.valueOf(j3));
                        if (V1 != null) {
                            if (!z4) {
                                j5 = j4;
                            }
                            V1.linked_community_id = j5;
                            V1.flags2 = fod.b(V1.flags2, 2097152, !z4);
                        }
                    } else {
                        TLRPC.Chat K02 = na7Var.K0(Long.valueOf(-j3));
                        if (K02 != null) {
                            if (!z4) {
                                j5 = j4;
                            }
                            K02.linked_community_id = j5;
                            K02.flags2 = fod.b(K02.flags2, 1048576, !z4);
                        }
                    }
                }
                na7Var.X2(0, j4, true);
                i8cVar2.a(bool, tL_error);
            }
        });
    }

    public final void S3(TLRPC.Chat chat, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (chat != null) {
            Long valueOf = Long.valueOf(chat.id);
            ConcurrentHashMap concurrentHashMap = this.b;
            TLRPC.Chat chat2 = (TLRPC.Chat) concurrentHashMap.get(valueOf);
            if (chat2 != chat) {
                ConcurrentHashMap concurrentHashMap2 = this.e;
                if (chat2 != null && !TextUtils.isEmpty(chat2.username)) {
                    concurrentHashMap2.remove(chat2.username.toLowerCase());
                }
                if (chat2 != null && chat2.usernames != null) {
                    for (int i9 = 0; i9 < chat2.usernames.size(); i9++) {
                        TLRPC.TL_username tL_username = chat2.usernames.get(i9);
                        if (tL_username != null && !TextUtils.isEmpty(tL_username.username)) {
                            concurrentHashMap2.remove(tL_username.username.toLowerCase());
                        }
                    }
                }
                if (!TextUtils.isEmpty(chat.username)) {
                    concurrentHashMap2.put(chat.username.toLowerCase(), chat);
                }
                if (chat.usernames != null) {
                    for (int i10 = 0; i10 < chat.usernames.size(); i10++) {
                        TLRPC.TL_username tL_username2 = chat.usernames.get(i10);
                        if (tL_username2 != null && !TextUtils.isEmpty(tL_username2.username) && tL_username2.active) {
                            concurrentHashMap2.put(tL_username2.username.toLowerCase(), chat);
                        }
                    }
                }
                o5(-chat.id, chat.emoji_status);
                if (chat2 != null && chat2.access_hash == 0) {
                    long j = chat.fromMessageDialogId;
                    if (j != 0 && (i8 = chat.fromMessageId) != 0) {
                        chat2.fromMessageDialogId = j;
                        chat2.fromMessageId = i8;
                    }
                }
                if (chat.min) {
                    if (chat2 != null) {
                        if (!z) {
                            LruCache lruCache = Y1().b;
                            String str = chat2.username;
                            if (str != null && !TextUtils.equals(str, chat.username)) {
                                lruCache.remove(chat2.username);
                                String str2 = chat.username;
                                if (str2 != null) {
                                    lruCache.put(str2, new j7c(-chat.id));
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
                            int i11 = chat.participants_count;
                            if (i11 != 0) {
                                chat2.participants_count = i11;
                            }
                            f(chat2);
                            boolean z2 = chat2.forum;
                            boolean z3 = chat.forum;
                            if (z2 != z3) {
                                chat2.forum = z3;
                                int i12 = chat2.flags;
                                if (z3) {
                                    chat2.flags = i12 | 1073741824;
                                } else {
                                    chat2.flags = i12 & (-1073741825);
                                }
                                getNotificationCenter().k(kk7.t5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                            }
                        }
                    } else {
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
                        f(chat);
                    }
                } else {
                    if (!z) {
                        if (chat2 != null) {
                            if (chat.version != chat2.version) {
                                this.p1.delete(chat.id);
                            }
                            int i13 = chat2.participants_count;
                            if (i13 != 0 && chat.participants_count == 0) {
                                chat.participants_count = i13;
                                chat.flags |= 131072;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat2.banned_rights;
                            if (tL_chatBannedRights3 != null) {
                                i2 = tL_chatBannedRights3.flags;
                            } else {
                                i2 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chat.banned_rights;
                            if (tL_chatBannedRights4 != null) {
                                i3 = tL_chatBannedRights4.flags;
                            } else {
                                i3 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = chat2.default_banned_rights;
                            if (tL_chatBannedRights5 != null) {
                                i4 = tL_chatBannedRights5.flags;
                            } else {
                                i4 = 0;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = chat.default_banned_rights;
                            if (tL_chatBannedRights6 != null) {
                                i5 = tL_chatBannedRights6.flags;
                            } else {
                                i5 = 0;
                            }
                            chat2.default_banned_rights = tL_chatBannedRights6;
                            int i14 = chat2.flags;
                            if (tL_chatBannedRights6 == null) {
                                i6 = i14 & (-262145);
                                chat2.flags = i6;
                            } else {
                                i6 = i14 | 262144;
                                chat2.flags = i6;
                            }
                            chat2.banned_rights = tL_chatBannedRights4;
                            if (tL_chatBannedRights4 == null) {
                                i7 = i6 & (-32769);
                                chat2.flags = i7;
                            } else {
                                i7 = i6 | 32768;
                                chat2.flags = i7;
                            }
                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat.admin_rights;
                            chat2.admin_rights = tL_chatAdminRights2;
                            if (tL_chatAdminRights2 == null) {
                                chat2.flags = i7 & (-16385);
                            } else {
                                chat2.flags = i7 | 16384;
                            }
                            if (chat.stories_hidden_min) {
                                chat.stories_hidden = chat2.stories_hidden;
                            }
                            if (i2 != i3 || i4 != i5) {
                                gl.d3(new z47(this, chat, (byte) 3));
                            }
                        }
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
                    } else if (chat2 == null) {
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
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
                            i = chat.flags | 64;
                            chat.flags = i;
                        } else {
                            i = chat.flags & (-65);
                            chat.flags = i;
                            chat.username = null;
                        }
                        int i15 = chat2.participants_count;
                        if (i15 != 0 && chat.participants_count == 0) {
                            chat.participants_count = i15;
                            chat.flags = i | 131072;
                        }
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
                    }
                    f(chat);
                }
                if (chat2 != null && chat2.forum != chat.forum) {
                    gl.d3(new z47(this, chat, (byte) 4));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    gl.d3(new z47(this, chat, (byte) 5));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j2 = chat.id;
                    if (L0(j2) == null) {
                        getMessagesStorage().C0(j2, false, null, false, false, 0);
                        X2(0, j2, false);
                    }
                }
            }
        }
    }

    public final void S4(boolean z) {
        if (this.P3 != z) {
            SharedPreferences.Editor edit = this.X3.edit();
            this.P3 = z;
            edit.putBoolean("savedViewAsChats", z).apply();
        }
    }

    public final void T(int i, long j, boolean z) {
        U(j, 1, i, 0, z, null, 0L);
    }

    public final int T0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i = dialog.unread_count;
        TLRPC.Chat K0 = K0(Long.valueOf(-dialog.id));
        if (K0 != null && (K0.forum || K0.monoforum)) {
            this.g4.h(-dialog.id);
            return pub.w[0];
        }
        return i;
    }

    public final void T2(boolean z) {
        gl.r(this.w4);
        l97 l97Var = this.M2;
        if (z) {
            l97Var.d(this.currentAccount, 0);
        }
        l97Var.c(this.currentAccount, 0, new f97(this, (byte) 1));
    }

    public final void T3(TLRPC.ChatFull chatFull) {
        this.c1.k(chatFull, chatFull.id);
        this.i4.M(-chatFull.id);
    }

    public final void T4(int i, long j) {
        if (i == 0) {
            this.Y0 = j;
        } else if (i == 1) {
            this.Z0 = j;
        } else if (i == 2) {
            this.a1 = j;
        }
    }

    public final void U(long r32, int r34, int r35, int r36, boolean r37, org.telegram.tgnet.TLRPC.InputPeer r38, long r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.U(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public final ArrayList U0(int i) {
        ArrayList arrayList = (ArrayList) this.w.get(i);
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final long U1(int i) {
        if (i == 0) {
            return this.Y0;
        }
        if (i == 1) {
            return this.Z0;
        }
        if (i == 2) {
            return this.a1;
        }
        return 0L;
    }

    public final void U2(long j, boolean z) {
        LongSparseIntArray longSparseIntArray = this.r1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j) < 60) {
            return;
        }
        longSparseIntArray.put(j, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ua7(messagesStorage, j, (byte) 7));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = f1(j);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new x47(this, j, (byte) 2));
    }

    public final void U3(ArrayList arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                S3((TLRPC.Chat) arrayList.get(i), z);
            }
        }
    }

    public final void U4(final long j, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z, final d dVar, boolean z2, boolean z3, String str2, final Runnable runnable, final z97 z97Var) {
        if (user != null && tL_chatAdminRights != null) {
            final TLRPC.Chat K0 = K0(Long.valueOf(j));
            final boolean Y = hc2.Y(K0);
            boolean z4 = true;
            if (hc2.T(K0)) {
                final TLRPC.TL_channels_editAdmin tL_channels_editAdmin = new TLRPC.TL_channels_editAdmin();
                tL_channels_editAdmin.channel = g1(K0);
                tL_channels_editAdmin.user_id = o1(user);
                tL_channels_editAdmin.admin_rights = tL_chatAdminRights;
                if (!TextUtils.isEmpty(str)) {
                    tL_channels_editAdmin.flags |= 1;
                    tL_channels_editAdmin.rank = str;
                }
                RequestDelegate requestDelegate = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        na7 na7Var = na7.this;
                        if (tL_error == null) {
                            na7Var.Q3((TLRPC.Updates) tLObject, false);
                            gl.e3(new a87(na7Var, j, runnable, (byte) 0), 1000L);
                            return;
                        }
                        boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                        z97 z97Var2 = z97Var;
                        if (equals) {
                            TLRPC.Chat chat = K0;
                            if (!hc2.Y(chat) && hc2.y(3, chat)) {
                                gl.d3(new b87(na7Var, user, chat, z97Var2, tL_error, (byte) 0));
                                return;
                            }
                        }
                        gl.d3(new d87(na7Var, tL_error, dVar, tL_channels_editAdmin, z, Y));
                        if (z97Var2 != null) {
                            gl.d3(new e87(z97Var2, tL_error, (byte) 0));
                        }
                    }
                };
                if (!user.bot && z2) {
                    j(j, user, 0, str2, dVar, true, new lo6(this, tL_channels_editAdmin, requestDelegate, (byte) 18), z97Var, null);
                    return;
                } else {
                    getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                    return;
                }
            }
            TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
            tL_messages_editChatAdmin.chat_id = j;
            tL_messages_editChatAdmin.user_id = o1(user);
            if (!z3 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
                z4 = false;
            }
            boolean z5 = z4;
            tL_messages_editChatAdmin.is_admin = z5;
            wg3 wg3Var = new wg3(this, j, runnable, dVar, tL_messages_editChatAdmin, z97Var);
            if (!z5 && !z2 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tL_messages_editChatAdmin, wg3Var);
            } else {
                j(j, user, 0, str2, dVar, true, new lo6(this, tL_messages_editChatAdmin, wg3Var, (byte) 19), z97Var, null);
            }
        }
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, int i, boolean z, int i2) {
        W(arrayList, arrayList2, encryptedChat, j, z, i2, false, 0L, null, i);
    }

    public final void V0() {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        int i = messagesStorage.r;
        ad7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.G();
        int i2 = messagesStorage2.n;
        ad7 messagesStorage3 = getMessagesStorage();
        messagesStorage3.G();
        W0(i, i2, messagesStorage3.s, false);
    }

    public final TLRPC.User V1(Long l) {
        if (l.longValue() == 0) {
            return y6c.h(this.currentAccount).f();
        }
        return (TLRPC.User) this.d.get(l);
    }

    public final void V2(Long l, hy3 hy3Var, int i) {
        HashSet hashSet = this.n1;
        if (hy3Var == null && (hashSet.contains(l) || this.o1.contains(l))) {
            return;
        }
        hashSet.add(l);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l.getClass();
        tL_channels_getParticipants.channel = g1(K0(l));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new k45(this, l, hy3Var, (byte) 16));
    }

    public final void V3(long j, TLRPC.DraftMessage draftMessage) {
        vf6 vf6Var = this.R;
        if (vf6Var.h(j) < 0) {
            if (!hc2.o0(this.currentAccount, j) || hc2.z(this.currentAccount, 24, j)) {
                hq6 mediaDataController = getMediaDataController();
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                int i = 1;
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < cf3.i(dialog, mediaDataController.T(dialog.id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = j;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.t1.g(0, j)).intValue();
                if (j >= 0 || !hc2.T(K0(Long.valueOf(-j)))) {
                    i = 0;
                }
                tL_dialog.flags = i;
                vf6Var.k(tL_dialog, j);
                arrayList.add(tL_dialog);
                Y4(null);
            }
        }
    }

    public final void V4(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.m5 = tL_webBrowserSettings;
        int i = this.currentAccount;
        long j = tL_webBrowserSettings.hash;
        this.n5.g(i, null, tL_webBrowserSettings);
        getNotificationCenter().k(kk7.T5, new Object[0]);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2) {
        X(arrayList, arrayList2, encryptedChat, j, z, i, z2, j2, tLObject, i2, false, 0);
    }

    public final void W0(int i, int i2, int i3, boolean z) {
        b4(gba.e, gba.f);
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        if (messagesStorage.r == 0) {
            if (!this.a2) {
                this.a2 = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new y47(this, (byte) 24));
            }
        } else if (!z && this.Y1) {
        } else {
            this.Y1 = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i;
            tL_updates_getDifference.date = i2;
            tL_updates_getDifference.qts = i3;
            if (this.Z1) {
                tL_updates_getDifference.flags |= 1;
                if (a.n()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.Z1 = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (w01.a) {
                StringBuilder p = ir2.p("start getDifference with date = ", i2, " pts = ", i, " qts = ");
                p.append(i3);
                fa4.b(p.toString());
                fa4.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new fl6(this, i2, i3, (byte) 1));
        }
    }

    public final TLRPC.UserFull W1(long j) {
        return (TLRPC.UserFull) this.b1.f(j);
    }

    public final void W2(final int i, int i2, final int i3, boolean z, final w57 w57Var) {
        long j;
        TLRPC.InputPeer tL_inputPeerChat;
        final int i4;
        vf6 vf6Var;
        int m;
        SparseBooleanArray sparseBooleanArray = this.T1;
        if (!sparseBooleanArray.get(i) && !this.e2) {
            sparseBooleanArray.put(i, true);
            int i5 = kk7.r;
            getNotificationCenter().k(i5, new Object[0]);
            if (w01.a) {
                StringBuilder p = ir2.p("folderId = ", i, " load cacheOffset = ", i2, " count = ");
                p.append(i3);
                p.append(" cache = ");
                p.append(z);
                fa4.b(p.toString());
            }
            long[] jArr = null;
            if (z) {
                final ad7 messagesStorage = getMessagesStorage();
                if (i2 == 0) {
                    i4 = 0;
                } else {
                    i4 = this.S1.get(i, 0);
                }
                if (i == 0 && i2 == 0 && (m = (vf6Var = messagesStorage.getMediaDataController().u1).m()) > 0) {
                    jArr = new long[m];
                    for (int i6 = 0; i6 < m; i6++) {
                        if (((vf6) vf6Var.n(i6)).f(0L) != null) {
                            jArr[i6] = vf6Var.j(i6);
                        }
                    }
                }
                final long[] jArr2 = jArr;
                messagesStorage.a.c(new Runnable() {
                    @Override
                    public final void run() {
                        ad7.this.y0(i, i4, i3, jArr2);
                    }
                });
                return;
            }
            TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
            tL_messages_getDialogs.limit = i3;
            tL_messages_getDialogs.exclude_pinned = true;
            if (i != 0) {
                tL_messages_getDialogs.flags |= 2;
                tL_messages_getDialogs.folder_id = i;
            }
            long[] g = getUserConfig().g(i);
            long j2 = g[0];
            if (j2 != -1) {
                if (j2 == 2147483647L) {
                    this.U1.put(i, true);
                    this.V1.put(i, true);
                    sparseBooleanArray.put(i, false);
                    getNotificationCenter().k(i5, new Object[0]);
                    return;
                }
                int i7 = (int) j2;
                tL_messages_getDialogs.offset_id = i7;
                tL_messages_getDialogs.offset_date = (int) g[1];
                if (i7 == 0) {
                    tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    if (g[4] != 0) {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                        tL_inputPeerChat.channel_id = g[4];
                    } else if (g[2] != 0) {
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerUser;
                        tL_inputPeerUser.user_id = g[2];
                        tL_inputPeerChat = tL_inputPeerUser;
                    } else {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                        tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                        tL_inputPeerChat.chat_id = g[3];
                    }
                    tL_inputPeerChat.access_hash = g[5];
                }
            } else {
                ArrayList U0 = U0(i);
                int size = U0.size() - 1;
                while (true) {
                    if (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(size);
                        if (!dialog.pinned && !cf3.B(dialog.id) && dialog.top_message > 0) {
                            ArrayList arrayList = (ArrayList) this.S.f(dialog.id);
                            k27 k27Var = null;
                            if (arrayList != null) {
                                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                    k27 k27Var2 = (k27) arrayList.get(i8);
                                    if (k27Var2 != null && (k27Var == null || k27Var2.e1() > k27Var.e1())) {
                                        k27Var = (k27) arrayList.get(i8);
                                    }
                                }
                            }
                            if (k27Var != null && k27Var.e1() > 0) {
                                TLRPC.Message message = k27Var.k;
                                tL_messages_getDialogs.offset_date = message.date;
                                tL_messages_getDialogs.offset_id = message.id;
                                TLRPC.Peer peer = message.peer_id;
                                long j3 = peer.channel_id;
                                if (j3 == 0) {
                                    j3 = peer.chat_id;
                                    if (j3 == 0) {
                                        j = peer.user_id;
                                        tL_messages_getDialogs.offset_peer = h1(j);
                                    }
                                }
                                j = -j3;
                                tL_messages_getDialogs.offset_peer = h1(j);
                            }
                        }
                        size--;
                    } else {
                        tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        break;
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_getDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    if (tL_error == null) {
                        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                        na7.this.L3(messages_dialogs, null, null, i, 0, i3, 0, false, false, false);
                        w57 w57Var2 = w57Var;
                        if (w57Var2 != null && messages_dialogs.dialogs.isEmpty()) {
                            gl.d3(w57Var2);
                        }
                    }
                }
            });
        }
    }

    public final void W3(TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (encryptedChat == null) {
            return;
        }
        int i = encryptedChat.id;
        ConcurrentHashMap concurrentHashMap = this.c;
        if (z) {
            concurrentHashMap.putIfAbsent(Integer.valueOf(i), encryptedChat);
        } else {
            concurrentHashMap.put(Integer.valueOf(i), encryptedChat);
        }
    }

    public final void X(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2, boolean z3, int i3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        byte b;
        byte b2;
        byte b3;
        long j3;
        ArrayList<Integer> arrayList3;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        NativeByteBuffer nativeByteBuffer3;
        long y;
        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages;
        boolean z7;
        NativeByteBuffer nativeByteBuffer4;
        NativeByteBuffer nativeByteBuffer5;
        long y2;
        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages;
        boolean z8;
        NativeByteBuffer nativeByteBuffer6;
        NativeByteBuffer nativeByteBuffer7;
        long y3;
        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages;
        boolean z9;
        NativeByteBuffer nativeByteBuffer8;
        NativeByteBuffer nativeByteBuffer9;
        long y4;
        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages;
        long j4;
        byte b4;
        long j5;
        long j6 = j;
        if (i == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        byte b5 = 5;
        if (i == 5) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i == 9) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((arrayList != null && !arrayList.isEmpty()) || j2 != 0) {
            if (j2 == 0) {
                if (j6 != 0 && cf3.y(j6)) {
                    TLRPC.Chat K0 = K0(Long.valueOf(-j6));
                    if (hc2.T(K0)) {
                        j5 = K0.id;
                    } else {
                        j5 = 0;
                    }
                    j4 = j5;
                } else {
                    j4 = 0;
                }
                if (!z2) {
                    ArrayList<Integer> arrayList4 = new ArrayList<>();
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Integer num = (Integer) arrayList.get(i5);
                        if (num.intValue() > 0) {
                            arrayList4.add(num);
                        }
                    }
                    arrayList3 = arrayList4;
                } else {
                    arrayList3 = null;
                }
                if (z4) {
                    getMessagesStorage().M0(j6, arrayList, true, false, 1, 0);
                    j6 = j;
                    i4 = i2;
                    b = 5;
                } else if (z5) {
                    if (i == 5) {
                        ox8 f = ox8.f(this.currentAccount);
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            Integer num2 = (Integer) obj;
                            num2.getClass();
                            ArrayList arrayList5 = f.c;
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayList5.size()) {
                                    nx8 nx8Var = (nx8) arrayList5.get(i7);
                                    b4 = b5;
                                    if (nx8Var.h.contains(num2)) {
                                        nx8Var.h.remove(num2);
                                        if (nx8Var.a() <= 0) {
                                            arrayList5.remove(nx8Var);
                                        }
                                        kk7.f(f.a).k(kk7.E1, new Object[0]);
                                    } else {
                                        i7++;
                                        b5 = b4;
                                    }
                                } else {
                                    b4 = b5;
                                    break;
                                }
                            }
                            b5 = b4;
                        }
                    }
                    b = b5;
                    j6 = j;
                    i4 = i2;
                    getMessagesStorage().M0(j6, arrayList, true, false, 5, i4);
                } else {
                    b = 5;
                    if (z6) {
                        j6 = j;
                        i4 = i2;
                        getMessagesStorage().M0(j6, arrayList, true, false, 9, i4);
                    } else {
                        if (j4 == 0) {
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                k27 k27Var = (k27) this.V.get(((Integer) arrayList.get(i8)).intValue());
                                if (k27Var != null) {
                                    k27Var.Z = true;
                                }
                            }
                        } else {
                            m3(arrayList, j);
                        }
                        i4 = i2;
                        getMessagesStorage().M0(j, arrayList, true, z, 0, i4);
                        j6 = j;
                        j3 = j4;
                        getMessagesStorage().O1(j6, j3, arrayList, null);
                        kk7 notificationCenter = getNotificationCenter();
                        Long valueOf = Long.valueOf(j3);
                        Boolean valueOf2 = Boolean.valueOf(z4);
                        Boolean valueOf3 = Boolean.valueOf(z3);
                        Integer valueOf4 = Integer.valueOf(i3);
                        Object[] objArr = new Object[6];
                        objArr[0] = arrayList;
                        objArr[1] = valueOf;
                        objArr[2] = valueOf2;
                        b3 = 3;
                        objArr[3] = Boolean.FALSE;
                        b2 = 4;
                        objArr[4] = valueOf3;
                        objArr[b] = valueOf4;
                        notificationCenter.k(kk7.v, objArr);
                    }
                }
                j3 = j4;
                kk7 notificationCenter2 = getNotificationCenter();
                Long valueOf5 = Long.valueOf(j3);
                Boolean valueOf22 = Boolean.valueOf(z4);
                Boolean valueOf32 = Boolean.valueOf(z3);
                Integer valueOf42 = Integer.valueOf(i3);
                Object[] objArr2 = new Object[6];
                objArr2[0] = arrayList;
                objArr2[1] = valueOf5;
                objArr2[2] = valueOf22;
                b3 = 3;
                objArr2[3] = Boolean.FALSE;
                b2 = 4;
                objArr2[4] = valueOf32;
                objArr2[b] = valueOf42;
                notificationCenter2.k(kk7.v, objArr2);
            } else {
                i4 = i2;
                b = 5;
                b2 = 4;
                b3 = 3;
                if (tLObject instanceof TLRPC.TL_channels_deleteMessages) {
                    j3 = ((TLRPC.TL_channels_deleteMessages) tLObject).channel.channel_id;
                } else {
                    j3 = 0;
                }
                arrayList3 = null;
            }
            if (!z2) {
                if (z4) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteScheduledMessages) {
                        tL_messages_deleteScheduledMessages = (TLRPC.TL_messages_deleteScheduledMessages) tLObject;
                        y4 = j2;
                    } else {
                        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages2 = new TLRPC.TL_messages_deleteScheduledMessages();
                        tL_messages_deleteScheduledMessages2.id = arrayList3;
                        tL_messages_deleteScheduledMessages2.peer = h1(j6);
                        try {
                            nativeByteBuffer9 = new NativeByteBuffer(tL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                        } catch (Exception e) {
                            e = e;
                            z9 = true;
                            nativeByteBuffer8 = null;
                        }
                        try {
                            nativeByteBuffer9.writeInt32(24);
                            nativeByteBuffer9.writeInt64(j6);
                            tL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer9);
                        } catch (Exception e2) {
                            e = e2;
                            nativeByteBuffer8 = nativeByteBuffer9;
                            z9 = true;
                            fa4.g(e, z9);
                            nativeByteBuffer9 = nativeByteBuffer8;
                            y4 = getMessagesStorage().y(nativeByteBuffer9);
                            tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new x47(this, y4, b3));
                        }
                        y4 = getMessagesStorage().y(nativeByteBuffer9);
                        tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new x47(this, y4, b3));
                } else if (z5) {
                    if (tLObject instanceof TLRPC.TL_messages_deleteQuickReplyMessages) {
                        tL_messages_deleteQuickReplyMessages = (TLRPC.TL_messages_deleteQuickReplyMessages) tLObject;
                        y3 = j2;
                    } else {
                        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages2 = new TLRPC.TL_messages_deleteQuickReplyMessages();
                        tL_messages_deleteQuickReplyMessages2.id = arrayList3;
                        tL_messages_deleteQuickReplyMessages2.shortcut_id = i4;
                        try {
                            nativeByteBuffer7 = new NativeByteBuffer(tL_messages_deleteQuickReplyMessages2.getObjectSize() + 16);
                        } catch (Exception e3) {
                            e = e3;
                            z8 = true;
                            nativeByteBuffer6 = null;
                        }
                        try {
                            nativeByteBuffer7.writeInt32(103);
                            nativeByteBuffer7.writeInt64(j6);
                            nativeByteBuffer7.writeInt32(i4);
                            tL_messages_deleteQuickReplyMessages2.serializeToStream(nativeByteBuffer7);
                        } catch (Exception e4) {
                            e = e4;
                            nativeByteBuffer6 = nativeByteBuffer7;
                            z8 = true;
                            fa4.g(e, z8);
                            nativeByteBuffer7 = nativeByteBuffer6;
                            y3 = getMessagesStorage().y(nativeByteBuffer7);
                            tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new x47(this, y3, b2));
                        }
                        y3 = getMessagesStorage().y(nativeByteBuffer7);
                        tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new x47(this, y3, b2));
                } else if (j3 != 0) {
                    if (tLObject != null) {
                        tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                        y2 = j2;
                    } else {
                        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                        tL_channels_deleteMessages2.id = arrayList3;
                        tL_channels_deleteMessages2.channel = f1(j3);
                        try {
                            nativeByteBuffer5 = new NativeByteBuffer(tL_channels_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e5) {
                            e = e5;
                            z7 = true;
                            nativeByteBuffer4 = null;
                        }
                        try {
                            nativeByteBuffer5.writeInt32(24);
                            nativeByteBuffer5.writeInt64(j6);
                            tL_channels_deleteMessages2.serializeToStream(nativeByteBuffer5);
                        } catch (Exception e6) {
                            e = e6;
                            nativeByteBuffer4 = nativeByteBuffer5;
                            z7 = true;
                            fa4.g(e, z7);
                            nativeByteBuffer5 = nativeByteBuffer4;
                            y2 = getMessagesStorage().y(nativeByteBuffer5);
                            tL_channels_deleteMessages = tL_channels_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_channels_deleteMessages, new t57(this, j3, y2, (byte) 0));
                        }
                        y2 = getMessagesStorage().y(nativeByteBuffer5);
                        tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new t57(this, j3, y2, (byte) 0));
                } else {
                    if (arrayList2 != null && encryptedChat != null && !arrayList2.isEmpty()) {
                        nativeByteBuffer = null;
                        getSecretChatHelper().t(encryptedChat, arrayList2, null);
                    } else {
                        nativeByteBuffer = null;
                    }
                    if (tLObject instanceof TLRPC.TL_messages_deleteMessages) {
                        tL_messages_deleteMessages = (TLRPC.TL_messages_deleteMessages) tLObject;
                        y = j2;
                    } else {
                        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages2 = new TLRPC.TL_messages_deleteMessages();
                        tL_messages_deleteMessages2.id = arrayList3;
                        tL_messages_deleteMessages2.revoke = z;
                        try {
                            nativeByteBuffer3 = new NativeByteBuffer(tL_messages_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e7) {
                            e = e7;
                            nativeByteBuffer2 = nativeByteBuffer;
                        }
                        try {
                            nativeByteBuffer3.writeInt32(24);
                            nativeByteBuffer3.writeInt64(j6);
                            tL_messages_deleteMessages2.serializeToStream(nativeByteBuffer3);
                        } catch (Exception e8) {
                            e = e8;
                            nativeByteBuffer2 = nativeByteBuffer3;
                            fa4.g(e, true);
                            nativeByteBuffer3 = nativeByteBuffer2;
                            y = getMessagesStorage().y(nativeByteBuffer3);
                            tL_messages_deleteMessages = tL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteMessages, new x47(this, y, b));
                        }
                        y = getMessagesStorage().y(nativeByteBuffer3);
                        tL_messages_deleteMessages = tL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteMessages, new x47(this, y, b));
                }
            }
        }
    }

    public final TLRPC.TL_availableEffect X0(long j) {
        C0();
        if (this.V4 != null) {
            for (int i = 0; i < this.V4.effects.size(); i++) {
                if (this.V4.effects.get(i).id == j) {
                    return this.V4.effects.get(i);
                }
            }
            return null;
        }
        return null;
    }

    public final void X2(final int r11, final long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.X2(int, long, boolean):void");
    }

    public final void X3(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                W3((TLRPC.EncryptedChat) arrayList.get(i), true);
            }
        }
    }

    public final boolean X4() {
        if (this.a5 != null && System.currentTimeMillis() - this.Z4 < 3600000) {
            return this.a5.sensitive_enabled;
        }
        Set set = this.K3;
        if (set != null && !set.contains("sensitive")) {
            return false;
        }
        return true;
    }

    public final void Y(long j, long j2, ArrayList arrayList) {
        getMessagesStorage().a.c(new n57(this, arrayList, j2, j));
    }

    public final TLRPC.EncryptedChat Y0(Integer num) {
        return (TLRPC.EncryptedChat) this.c.get(num);
    }

    public final k7c Y1() {
        k7c k7cVar = this.L2;
        if (k7cVar == null) {
            k7c k7cVar2 = new k7c(this.currentAccount);
            this.L2 = k7cVar2;
            return k7cVar2;
        }
        return k7cVar;
    }

    public final void Y2(TLRPC.User user, int i, boolean z, p8c p8cVar) {
        if (user != null) {
            HashSet hashSet = this.h1;
            if (p8cVar == null) {
                if (!hashSet.contains(Long.valueOf(user.id))) {
                    if (!z && this.i1.get(user.id) > 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            hashSet.add(Long.valueOf(user.id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.id = o1(user);
            long j = user.id;
            if (this.P.get(Long.valueOf(j)) == null || this.Q.get(Long.valueOf(j)) == null) {
                d4(null, j);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new c97(this, user, j, p8cVar, i)), i);
        }
    }

    public final void Y3(long j, fc2 fc2Var) {
        this.d1.k(fc2Var, fc2Var.b.id);
        this.e1.k(fc2Var, j);
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null) {
            L0.call = fc2Var.h(fc2Var.a);
        }
        getNotificationCenter().k(kk7.v2, Long.valueOf(j), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
        X2(0, j, true);
    }

    public final void Y4(defpackage.vf6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.Y4(vf6):void");
    }

    public final void Z(long j, long j2, int i, int i2, boolean z, vm1 vm1Var) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = h1(j);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i;
        tL_messages_deleteHistory.max_date = i2;
        tL_messages_deleteHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new s87(this, j, i, i2, j2, z, vm1Var));
    }

    public final TLRPC.EncryptedChat Z0(int i, boolean z) {
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c.get(Integer.valueOf(i));
        if (encryptedChat != null) {
            if (z) {
                if (!(encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) && !(encryptedChat instanceof TLRPC.TL_encryptedChatRequested)) {
                    return encryptedChat;
                }
            } else {
                return encryptedChat;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.a.c(new m77(messagesStorage, i, arrayList, countDownLatch, (byte) 26));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (arrayList.size() == 2) {
            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
            W3(encryptedChat2, false);
            Z3((TLRPC.User) arrayList.get(1), true, false);
            return encryptedChat2;
        }
        return encryptedChat;
    }

    public final TLObject Z1(long j) {
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(valueOf)) {
            return (TLObject) concurrentHashMap.get(Long.valueOf(j));
        }
        long j2 = -j;
        Long valueOf2 = Long.valueOf(j2);
        ConcurrentHashMap concurrentHashMap2 = this.b;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            return (TLObject) concurrentHashMap2.get(Long.valueOf(j2));
        }
        return null;
    }

    public final void Z2(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, long j3, int i8, int i9, boolean z3) {
        int i10;
        if (j3 != 0) {
            i10 = i8;
        } else {
            i10 = 0;
        }
        a3(j, j2, z, i, i2, i3, z2, i4, i5, i6, 0, i7, j3, i9, i10, 0, 0, false, 0, true, true, z3, null, 0L);
    }

    public final boolean Z3(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.Z3(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public final boolean Z4() {
        return !this.k4.O2.f;
    }

    public final void a(long j, boolean z) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        if (dialog == null) {
            return;
        }
        if (z) {
            this.v0.k(dialog, j);
        } else {
            this.u0.k(dialog, j);
            this.y.remove(dialog);
            Y4(null);
        }
        getNotificationCenter().k(kk7.r, Boolean.TRUE);
    }

    public final void a0(final long j, TLRPC.InputPeer inputPeer, boolean z, final te1 te1Var) {
        final boolean z2;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && l7c.C(getMessagesController().V1(Long.valueOf(inputPeer.user_id)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        final boolean T = hc2.T(K0);
        if (T) {
            if (z2) {
                boolean z3 = K0.creator;
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = g1(K0);
                tL_messages_deleteChatUser = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                tL_channels_editBanned.channel = g1(K0);
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
            tL_messages_deleteChatUser2.chat_id = j;
            tL_messages_deleteChatUser2.user_id = n1(inputPeer);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        }
        if (z2) {
            T(0, -j, z);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    na7 na7Var = na7.this;
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    if (T && !z2) {
                        gl.e3(new r57(na7Var, j, (byte) 22), 1000L);
                    }
                    te1 te1Var2 = te1Var;
                    if (te1Var2 != null) {
                        gl.d3(te1Var2);
                    }
                }
            }
        }, 64);
    }

    public final String a1(long j) {
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null) {
                return qu2.m(0, V1.first_name, V1.last_name);
            }
            return null;
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (K0 != null) {
            return K0.title;
        }
        return null;
    }

    public final TLObject a2(String str) {
        if (str != null && str.length() != 0) {
            return (TLObject) this.e.get(str.toLowerCase());
        }
        return null;
    }

    public final void a3(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final long j3, final int i9, final int i10, final int i11, final int i12, final boolean z3, final int i13, boolean z4, final boolean z5, final boolean z6, qob qobVar, long j4) {
        int i14;
        qob qobVar2;
        TLRPC.TL_forumTopic f;
        if (w01.a) {
            StringBuilder o = ug8.o(j, "load messages in chat ", " topic_id ");
            o.append(j3);
            o.append(" count ");
            o.append(i);
            o.append(" max_id ");
            o.append(i2);
            o.append(" cache ");
            o.append(z2);
            o.append(" mindate = ");
            i14 = i4;
            o.append(i14);
            o.append(" guid ");
            o.append(i5);
            o.append(" load_type ");
            o.append(i6);
            o.append(" last_message_id ");
            o.append(i7);
            o.append(" mode ");
            o.append(i8);
            o.append(" index ");
            o.append(i9);
            o.append(" firstUnread ");
            o.append(i10);
            o.append(" unread_count ");
            o.append(i11);
            o.append(" last_date ");
            o.append(i12);
            o.append(" queryFromServer ");
            o.append(z3);
            o.append(" isTopic ");
            o.append(z6);
            fa4.b(o.toString());
        } else {
            i14 = i4;
        }
        if (w01.a && qobVar == null && i8 == 0) {
            qobVar2 = new qob("MessageLoaderLogger dialogId=" + j + " index=" + i9 + " count=" + i);
        } else {
            qobVar2 = qobVar;
        }
        int i15 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if ((i15 == 0 || z6 || i8 == 8 || i8 == 3 || i8 == 5 || i8 == 9) && i8 != 2 && (z2 || cf3.B(j))) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.a.c(new ta7(messagesStorage, qob.d(qobVar2, "MessagesStorage.getMessages: storageQueue.postRunnable"), qobVar2, j, j2, i, i2, i3, i14, i5, i6, i8, j3, i9, z5, z6));
            return;
        }
        qob qobVar3 = qobVar2;
        int i16 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.Chat K0 = i16 < 0 ? K0(Long.valueOf(-j)) : null;
        if (i8 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = h1(j);
            tL_getWelcomeMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new i8c() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TL_ephemeral.WelcomeMessages welcomeMessages = (TL_ephemeral.WelcomeMessages) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    if (welcomeMessages != null && !(welcomeMessages instanceof TL_ephemeral.TL_welcomeMessagesNotModified)) {
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        ArrayList<TL_ephemeral.EphemeralMessage> arrayList = welcomeMessages.messages;
                        int size = arrayList.size();
                        int i17 = 0;
                        while (i17 < size) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i17);
                            i17++;
                            tL_messages_messages.messages.add(t34.b(ephemeralMessage));
                        }
                        na7.this.M3(tL_messages_messages, tL_messages_messages.messages.size(), j, j2, i, i2, i3, false, i5, i10, i7, i11, i12, i6, false, i8, j3, i9, z3, i13, z5, z6, null);
                    }
                }
            }), i5);
        } else if (i8 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j3;
            tL_messages_getQuickReplyMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new d67(this, j, j2, i, i2, i3, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6)), i5);
        } else if (i15 == 0) {
            if (i8 == 2) {
                return;
            }
            if (i8 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = h1(j);
                tL_messages_getScheduledHistory.hash = j4;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new d67(this, i2, i3, j, j2, i, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6)), i5);
            } else if (!hc2.p0(K0) && z4 && ((i6 == 3 || i6 == 2) && i7 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer h1 = h1(j);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = h1;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        na7 na7Var = na7.this;
                        int i17 = i5;
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
                                    na7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                                }
                                na7Var.a3(j, j2, z, i, i2, i3, false, i4, i17, i6, dialog.top_message, 0, j3, i9, i10, dialog.unread_count, i12, z3, dialog.unread_mentions_count, false, z5, z6, null, 0L);
                                return;
                            }
                            return;
                        }
                        gl.d3(new q76(na7Var, i17, tL_messages_getPeerDialogs, tL_error, (byte) 9));
                    }
                });
            } else {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = h1(j);
                if (i6 == 4) {
                    tL_messages_getHistory.add_offset = (-i) + 5;
                } else if (i6 == 3) {
                    tL_messages_getHistory.add_offset = (-i) / 2;
                } else if (i6 == 1) {
                    tL_messages_getHistory.add_offset = (-i) - 1;
                } else if (i6 == 2 && i2 != 0) {
                    tL_messages_getHistory.add_offset = (-i) + 6;
                } else if (i16 < 0 && i2 != 0 && hc2.T(K0)) {
                    tL_messages_getHistory.add_offset = -1;
                    tL_messages_getHistory.limit++;
                }
                tL_messages_getHistory.limit = i;
                tL_messages_getHistory.offset_id = i2;
                tL_messages_getHistory.offset_date = i3;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new e67(this, j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getHistory, (byte) 2)), i5);
            }
        } else if (i8 == 3 || hc2.p0(K0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = h1(j3);
            if (hc2.p0(K0)) {
                tL_messages_getSavedHistory.parent_peer = h1(j);
            }
            if (i6 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i) + 6;
            } else if (i16 < 0 && i2 != 0 && hc2.T(K0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i;
            tL_messages_getSavedHistory.offset_id = i2;
            tL_messages_getSavedHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new e67(this, j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getSavedHistory, (byte) 0)), i5);
        } else if (z4 && z6 && i6 == 2 && i7 == 0 && (f = this.g4.f(-j, j3)) != null) {
            a3(j, j2, z, i, i2, i3, false, i4, i5, i6, f.top_message, i8, j3, i9, i10, f.unread_count, i12, z3, f.unread_mentions_count, false, z5, z6, qobVar3, 0L);
        } else if (i8 == 0) {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = h1(j);
            tL_messages_getReplies.msg_id = (int) j3;
            tL_messages_getReplies.offset_date = i3;
            if (i6 == 4) {
                tL_messages_getReplies.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getReplies.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getReplies.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getReplies.add_offset = (-i) + 10;
            } else if (i16 < 0 && i2 != 0 && hc2.T(K0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i;
            tL_messages_getReplies.offset_id = i2;
            tL_messages_getReplies.hash = j4;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new e67(this, i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tL_messages_getReplies)), i5);
        }
    }

    public final void a4(ArrayList arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (Z3((TLRPC.User) arrayList.get(i), z, false)) {
                    z2 = true;
                }
            }
            if (z2) {
                gl.d3(new c87(this, (byte) 12));
            }
        }
    }

    public final void a5(TLRPC.Chat chat, int i, boolean z, sm1 sm1Var) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new pj3(this, chat, z, i, sm1Var));
    }

    public final int b(int i, int i2, long j) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        return c(arrayList, i, i2, null, 0L);
    }

    public final void b0(long j, TLRPC.User user) {
        c0(j, user, null, false, false);
    }

    public final void b3(TLRPC.User user, TLRPC.Chat chat, boolean z) {
        long j;
        if (user == null) {
            if (chat != null) {
                j = -chat.id;
            } else {
                return;
            }
        } else {
            j = user.id;
        }
        vf6 vf6Var = this.k0;
        if (vf6Var.h(j) < 0) {
            if (w01.a) {
                fa4.b("request spam button for " + j);
            }
            int i = this.W3.getInt("dialog_bar_vis3" + j, 0);
            if (!z && (i == 1 || i == 3)) {
                if (w01.a) {
                    fa4.b("dialog bar already hidden for " + j);
                    return;
                }
                return;
            }
            vf6Var.k(Boolean.TRUE, j);
            TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
            if (user != null) {
                tL_messages_getPeerSettings.peer = h1(user.id);
            } else {
                tL_messages_getPeerSettings.peer = h1(-chat.id);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new x47(this, j, (byte) 1));
        }
    }

    public final void b4(int i, String str) {
        if (!TextUtils.isEmpty(str) && !this.c2 && getUserConfig().e() != 0) {
            if (!getUserConfig().d || !str.equals(gba.f)) {
                this.c2 = true;
                this.d2 = SystemClock.elapsedRealtime();
                if (gba.k == null) {
                    gba.k = new byte[256];
                    Utilities.b.nextBytes(gba.k);
                    gba.x();
                }
                TL_account.registerDevice registerdevice = new TL_account.registerDevice();
                registerdevice.token_type = i;
                registerdevice.token = str;
                registerdevice.no_muted = false;
                registerdevice.secret = gba.k;
                for (int i2 = 0; i2 < 4; i2++) {
                    y6c h = y6c.h(i2);
                    if (i2 != this.currentAccount && h.o()) {
                        long e = h.e();
                        registerdevice.other_uids.add(Long.valueOf(e));
                        if (w01.a) {
                            b00.p(this.currentAccount, ug8.o(e, "add other uid = ", " for account "));
                        }
                    }
                }
                getConnectionsManager().sendRequest(registerdevice, new b97(this, i, str, (byte) 0));
            }
        }
    }

    public final boolean b5() {
        String str = this.R3;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
                return false;
            } else if (str.equals("premium")) {
                return getUserConfig().p();
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        } else {
            return false;
        }
    }

    public final int c(java.util.ArrayList r24, int r25, int r26, java.util.ArrayList r27, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.c(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public final void c0(long j, TLRPC.User user, TLRPC.Chat chat, boolean z, boolean z2) {
        TLRPC.InputPeer l1;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user == null) {
            if (chat == null) {
                return;
            }
            l1 = j1(chat);
        } else {
            l1 = l1(user);
        }
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        boolean T = hc2.T(K0);
        if (T) {
            if (l7c.C(user)) {
                if (K0.creator && z) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = g1(K0);
                    tL_messages_deleteChatUser = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = g1(K0);
                    tL_messages_deleteChatUser = tL_channels_leaveChannel;
                }
            } else {
                if (hc2.Y(K0)) {
                    TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
                    tL_communities_toggleParticipantBanned.participant = l1;
                    tL_communities_toggleParticipantBanned.community = g1(K0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = g1(K0);
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
        } else if (z) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new ce2((byte) 0));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j;
            tL_messages_deleteChatUser3.user_id = o1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (l7c.C(user)) {
            T(0, -j, z2);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new j67(this, T, user, j), 64);
    }

    public final void c3(int i) {
        SparseIntArray sparseIntArray = this.h2;
        if (sparseIntArray.indexOfKey(i) < 0) {
            SharedPreferences j = getUserConfig().j();
            if (!j.getBoolean("2pinnedDialogsLoaded" + i, false)) {
                sparseIntArray.put(i, 1);
                TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
                tL_messages_getPinnedDialogs.folder_id = i;
                getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new e97(this, i, (byte) 0));
            }
        }
    }

    public final void c4(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.o4;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num != null) {
            if (num.intValue() > 1) {
                hashMap.put(Long.valueOf(j), Integer.valueOf(num.intValue() - 1));
                return;
            }
            hashMap.remove(Long.valueOf(j));
            if (!p2((TLRPC.Dialog) this.R.f(j)) && j0()) {
                Y4(null);
                getNotificationCenter().k(kk7.P2, Long.valueOf(j));
            }
        }
    }

    public final boolean c5() {
        String str = this.k4.M1.f;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
                return false;
            } else if (str.equals("premium")) {
                return getUserConfig().p();
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(int i, TLRPC.Dialog dialog) {
        int i2;
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            i2 = 0;
        } else {
            i2 = dialog.folder_id;
        }
        SparseArray sparseArray = this.w;
        ArrayList arrayList = (ArrayList) sparseArray.get(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i2, arrayList);
        }
        if (i == -1) {
            arrayList.add(dialog);
        } else if (i == -2) {
            if (!arrayList.isEmpty() && (arrayList.get(0) instanceof TLRPC.TL_dialogFolder)) {
                arrayList.add(1, dialog);
            } else {
                arrayList.add(0, dialog);
            }
        } else {
            arrayList.add(i, dialog);
        }
    }

    public final void d0(long j, int i, long j2) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.H(new yb7(messagesStorage, i, j, j2, (byte) 1));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = h1(j);
        tL_messages_deleteParticipantReaction.participant = h1(j2);
        tL_messages_deleteParticipantReaction.msg_id = i;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new hc((byte) 0), new k67(this, (byte) 2));
    }

    public final void d2(long j, TLRPC.User user, TLRPC.Chat chat) {
        if (user != null || chat != null) {
            SharedPreferences.Editor edit = this.W3.edit();
            edit.putInt("dialog_bar_vis3" + j, 3);
            edit.remove("dialog_bar_invite" + j);
            edit.commit();
            if (!cf3.B(j)) {
                TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
                if (user != null) {
                    tL_messages_hidePeerSettingsBar.peer = h1(user.id);
                } else {
                    tL_messages_hidePeerSettingsBar.peer = h1(-chat.id);
                }
                getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new ce2((byte) 0));
            }
        }
    }

    public final void d3(boolean z, a61 a61Var) {
        if (a61Var != null) {
            this.v4 = a61Var;
        }
        if (getUserConfig().o()) {
            if (!z) {
                if (getUserConfig().Q) {
                    return;
                }
            } else {
                getUserConfig().Q = false;
                getUserConfig().u(false);
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new y47(this, (byte) 18));
        }
    }

    public final void d4(ArrayList arrayList, long j) {
        if (j != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            vf6 vf6Var = this.y4;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.InputPeer h1 = h1(((TLRPC.Dialog) arrayList.get(i)).id);
                    if (!(h1 instanceof TLRPC.TL_inputPeerChannel) || h1.access_hash != 0) {
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer.peer = h1;
                        long m = cf3.m(h1);
                        Long l = (Long) vf6Var.f(m);
                        if (l == null || System.currentTimeMillis() - l.longValue() > 240000) {
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            vf6Var.k(Long.valueOf(System.currentTimeMillis()), m);
                        }
                    }
                }
            } else {
                TLRPC.InputPeer h12 = h1(j);
                if (!(h12 instanceof TLRPC.TL_inputPeerChannel) || h12.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer2.peer = h12;
                    long m2 = cf3.m(h12);
                    Long l2 = (Long) vf6Var.f(m2);
                    if (l2 == null || System.currentTimeMillis() - l2.longValue() > 240000) {
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer2);
                        vf6Var.k(Long.valueOf(System.currentTimeMillis()), m2);
                    }
                } else {
                    return;
                }
            }
            if (tL_messages_getPeerDialogs.peers.isEmpty()) {
                return;
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new y47(this, (byte) 0));
        }
    }

    public final boolean d5(TLRPC.User user) {
        if (user == null || user.id != this.k4.c3.f()) {
            String str = this.k4.M1.f;
            int hashCode = str.hashCode();
            if (hashCode != -1609594047) {
                if (hashCode != -318452137) {
                    if (hashCode == 270940796) {
                        str.equals("disabled");
                        return false;
                    }
                } else if (str.equals("premium") && user != null && user.premium) {
                    return true;
                }
            } else if (str.equals("enabled")) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        akb akbVar;
        TLRPC.InputFile inputFile;
        zjb zjbVar;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        na7 na7Var = this;
        int i3 = kk7.T1;
        HashMap hashMap = na7Var.I2;
        TLRPC.BaseTheme baseTheme = null;
        if (i == i3) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = na7Var.G2;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                na7Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new y47(na7Var, (byte) 19));
            } else {
                String str3 = na7Var.J2;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    vjb vjbVar = na7Var.K2;
                    String str4 = na7Var.J2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = vjbVar.i;
                    tL_wallPaperSettings.motion = vjbVar.j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    vjb vjbVar2 = na7Var.K2;
                    vjbVar2.r = 1.0f;
                    vjbVar2.s = new ArrayList();
                    na7Var.K2.s.add(Integer.valueOf(na7Var.getConnectionsManager().sendRequest(uploadwallpaper, new rt0((Object) na7Var, (Object) vjbVar, (Object) tL_wallPaperSettings, str4, (byte) 11))));
                } else {
                    Object obj = hashMap.get(str);
                    if (obj instanceof akb) {
                        akbVar = (akb) obj;
                        if (str.equals(akbVar.I)) {
                            akbVar.K = inputFile3;
                            akbVar.I = null;
                        } else if (str.equals(akbVar.J)) {
                            akbVar.L = inputFile3;
                            akbVar.J = null;
                        }
                        inputFile = akbVar.K;
                        inputFile2 = akbVar.L;
                        zjbVar = null;
                    } else if (obj instanceof zjb) {
                        zjb zjbVar2 = (zjb) obj;
                        if (str.equals(zjbVar2.u)) {
                            zjbVar2.w = inputFile3;
                            zjbVar2.u = null;
                        } else if (str.equals(zjbVar2.v)) {
                            zjbVar2.x = inputFile3;
                            zjbVar2.v = null;
                        }
                        akb akbVar2 = zjbVar2.b;
                        TLRPC.InputFile inputFile4 = zjbVar2.w;
                        inputFile2 = zjbVar2.x;
                        zjbVar = zjbVar2;
                        akbVar = akbVar2;
                        inputFile = inputFile4;
                    } else {
                        akbVar = null;
                        inputFile = null;
                        zjbVar = null;
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
                        if (zjbVar != null) {
                            zjbVar.x = null;
                            zjbVar.w = null;
                            tL_theme = zjbVar.r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str5 = akbVar.a;
                            int i4 = bkb.a;
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
                            tL_inputThemeSettings2.accent_color = zjbVar.c;
                            int i5 = zjbVar.d;
                            if (i5 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i5;
                            }
                            int i6 = zjbVar.e;
                            if (i6 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i6));
                                tL_inputThemeSettings2.flags |= 1;
                                int i7 = zjbVar.f;
                                if (i7 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i7));
                                    int i8 = zjbVar.g;
                                    if (i8 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i8));
                                        int i9 = zjbVar.h;
                                        if (i9 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i9));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = zjbVar.i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(zjbVar.o)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = zjbVar.o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (zjbVar.p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = zjbVar.q;
                            long j = zjbVar.j;
                            if (j != 0) {
                                wallPaperSettings2.background_color = (int) j;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j2 = zjbVar.k;
                            if (j2 != 0) {
                                wallPaperSettings2.second_background_color = (int) j2;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = gl.q1(zjbVar.n, true);
                            }
                            long j3 = zjbVar.l;
                            if (j3 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j3;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j4 = zjbVar.m;
                            if (j4 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j4;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            akbVar.L = null;
                            akbVar.K = null;
                            tL_theme = akbVar.G;
                            tL_inputThemeSettings = null;
                        }
                        akb akbVar3 = akbVar;
                        na7Var = this;
                        getConnectionsManager().sendRequest(uploadtheme, new fn0(na7Var, (Object) tL_theme, (Object) akbVar3, (Object) tL_inputThemeSettings, (Object) zjbVar, (byte) 10));
                    }
                }
                na7Var = this;
            }
        } else if (i == kk7.U1) {
            String str6 = (String) objArr[0];
            String str7 = na7Var.G2;
            if (str7 != null && str7.equals(str6)) {
                na7Var.G2 = null;
            } else {
                String str8 = na7Var.J2;
                if (str8 != null && str8.equals(str6)) {
                    na7Var.J2 = null;
                    na7Var.K2 = null;
                } else {
                    Object remove = hashMap.remove(str6);
                    boolean z = remove instanceof akb;
                    int i10 = kk7.M2;
                    if (z) {
                        akb akbVar4 = (akb) remove;
                        akbVar4.L = null;
                        akbVar4.K = null;
                        na7Var.getNotificationCenter().k(i10, akbVar4, 0);
                    } else if (remove instanceof zjb) {
                        zjb zjbVar3 = (zjb) remove;
                        zjbVar3.u = null;
                        na7Var.getNotificationCenter().k(i10, zjbVar3.b, zjbVar3);
                    }
                }
            }
        }
        if (i == kk7.V1) {
            String str9 = (String) objArr[0];
            String str10 = na7Var.J2;
            if (str10 != null && str10.equals(str9)) {
                na7Var.K2.r = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        int i11 = kk7.J;
        SparseArray sparseArray = na7Var.V;
        if (i == i11) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l = (Long) objArr[3];
                ArrayList arrayList = (ArrayList) na7Var.S.f(l.longValue());
                for (int i12 = 0; arrayList != null && i12 < arrayList.size(); i12++) {
                    k27 k27Var2 = (k27) arrayList.get(i12);
                    if (k27Var2 != null && (k27Var2.e1() == num.intValue() || k27Var2.k.local_id == num.intValue())) {
                        k27Var2.k.id = num2.intValue();
                        k27Var2.k.send_state = 0;
                    }
                    k27 k27Var3 = (k27) sparseArray.get(num.intValue());
                    if (k27Var3 != null) {
                        sparseArray.remove(num.intValue());
                        sparseArray.put(num2.intValue(), k27Var3);
                    }
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var.R.f(l.longValue());
                if (dialog != null && dialog.top_message == num.intValue()) {
                    dialog.top_message = num2.intValue();
                    na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
                }
                if (cf3.y(l.longValue())) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) na7Var.c1.f(-l.longValue());
                    TLRPC.Chat K0 = na7Var.K0(Long.valueOf(-l.longValue()));
                    if (K0 != null && !hc2.N(K0) && !k27.f3(num2.intValue()) && chatFull != null && chatFull.slowmode_seconds != 0) {
                        chatFull.slowmode_next_send_date = na7Var.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                        chatFull.flags |= 262144;
                        na7Var.getMessagesStorage().K1(chatFull, false);
                    }
                }
            }
        } else if (i == kk7.k0) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id == 0 && (k27Var = (k27) sparseArray.get(message.id)) != null) {
                k27Var.k.media = k27.n1(message);
                if (k27.n1(message).ttl_seconds != 0) {
                    if ((k27.n1(message).photo instanceof TLRPC.TL_photoEmpty) || (k27.n1(message).document instanceof TLRPC.TL_documentEmpty)) {
                        k27Var.K5();
                        na7Var.getNotificationCenter().k(kk7.e0, new Object[0]);
                    }
                }
            }
        } else if (i == kk7.h5) {
            na7Var.T2(false);
            na7Var.getContactsController().J(true);
            if ((na7Var.Q3 && !na7Var.getUserConfig().p()) || na7Var.getUserConfig().p()) {
                na7Var.getNotificationCenter().k(kk7.n3, new Object[0]);
            }
        }
    }

    public final void e(k27 k27Var, TLRPC.SuggestedPost suggestedPost) {
        k27 k27Var2 = k27Var;
        if (k27Var2 != null && k27Var2.k != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(k27Var2);
            z3a sendMessagesHelper = getSendMessagesHelper();
            long B0 = k27.B0(k27Var2.k);
            boolean z = !k27.l3(k27Var2.k);
            TLRPC.Message message = k27Var2.k;
            if (message.suggested_post == null) {
                k27Var2 = null;
            }
            sendMessagesHelper.p0(arrayList, B0, z, false, true, 0, 0, k27Var2, -1, 0L, cf3.n(message.saved_peer_id), u47.b(suggestedPost));
        }
    }

    public final void e0(long j, int i, TLRPC.InputPeer inputPeer) {
        long m = cf3.m(inputPeer);
        int[] iArr = {i};
        sb2 sb2Var = new sb2(this, m, j, inputPeer, i, iArr);
        if (iArr[0] <= 0 && m == 0) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new go6(messagesStorage, j, new kt1(iArr, sb2Var, (byte) 1), (byte) 16));
            return;
        }
        sb2Var.run();
    }

    public final fc2 e1(long j, boolean z, qz5 qz5Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null && (inputGroupCall = L0.call) != null) {
            fc2 fc2Var = (fc2) this.d1.f(inputGroupCall.id);
            if (fc2Var == null && z) {
                Long valueOf = Long.valueOf(j);
                HashSet hashSet = this.m1;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(j));
                    if (L0.call != null) {
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        getgroupcall.call = L0.call;
                        getgroupcall.limit = 20;
                        getConnectionsManager().sendRequest(getgroupcall, new w47(this, j, qz5Var, (byte) 11));
                    }
                }
            }
            if (fc2Var == null || !(fc2Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                return fc2Var;
            }
            return null;
        }
        return null;
    }

    public final void e2() {
        if (this.q2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = h1(this.q2.id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new ce2((byte) 0));
        Utilities.d.c(new f67(this, (byte) 26));
        l4();
    }

    public final void e3() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new y47(this, (byte) 26));
    }

    public final void e4(TLRPC.InputPeer inputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
            } catch (Exception e) {
                nativeByteBuffer = null;
                exc = e;
            }
            try {
                nativeByteBuffer.writeInt32(22);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                exc = e2;
                fa4.g(exc, true);
                j = getMessagesStorage().y(nativeByteBuffer);
                long j2 = j;
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new w47(this, inputPeer, j2, (byte) 10));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        }
        long j22 = j;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new w47(this, inputPeer, j22, (byte) 10));
    }

    public final void f(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            gl.d3(new z47(this, chat, (byte) 0));
        } else {
            g(chat);
        }
    }

    public final void f0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        long j;
        if (user != null) {
            j = user.id;
        } else if (chat2 != null) {
            j = chat2.id;
        } else {
            j = 0;
        }
        S(-chat.id, j);
    }

    public final TLRPC.InputChannel f1(long j) {
        return g1(K0(Long.valueOf(j)));
    }

    public final void f2(akb akbVar, zjb zjbVar, boolean z) {
        TLRPC.TL_theme tL_theme;
        String str;
        boolean z2;
        boolean z3;
        if (zjbVar != null) {
            tL_theme = zjbVar.r;
            str = zjbVar.o;
        } else {
            tL_theme = akbVar.G;
            str = akbVar.e;
        }
        if (zjbVar == null && akbVar.h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zjbVar != null) {
            z3 = zjbVar.q;
        } else {
            z3 = akbVar.n;
        }
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new ce2((byte) 0));
        if (!TextUtils.isEmpty(str)) {
            TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = str;
            installwallpaper.wallpaper = tL_inputWallPaperSlug;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            installwallpaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.blur = z2;
            tL_wallPaperSettings.motion = z3;
            getConnectionsManager().sendRequest(installwallpaper, new ce2((byte) 0));
        }
    }

    public final void f3(long j, TLRPC.Chat chat) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j2 = chat.id;
            vf6 vf6Var = this.S0;
            if (vf6Var.h(j2) < 0) {
                int i = (chat.access_hash > 0L ? 1 : (chat.access_hash == 0L ? 0 : -1));
                if (i == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.id;
                    tL_inputPeerChannel.peer = h1(chat.fromMessageDialogId);
                    tL_inputPeerChannel.msg_id = chat.fromMessageId;
                } else if (i == 0) {
                    if (j != 0) {
                        getMessagesStorage().n1(j);
                        return;
                    }
                    return;
                } else {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChannel.channel_id = chat.id;
                    tL_inputPeerChannel.access_hash = chat.access_hash;
                }
                vf6Var.k(Boolean.TRUE, chat.id);
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = tL_inputPeerChannel;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                if (j == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize() + 4);
                    } catch (Exception e) {
                        nativeByteBuffer = null;
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(0);
                        chat.serializeToStream(nativeByteBuffer);
                    } catch (Exception e2) {
                        exc = e2;
                        fa4.g(exc, true);
                        j = getMessagesStorage().y(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new w47(this, j, chat, (byte) 5));
                    }
                    j = getMessagesStorage().y(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new w47(this, j, chat, (byte) 5));
            }
        }
    }

    public final void f4(long j, HashMap hashMap, int i) {
        boolean z;
        HashMap hashMap2;
        vf6 vf6Var;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == 3) {
            z2 = true;
        }
        if (z) {
            hashMap2 = this.y1;
            vf6Var = this.z1;
        } else if (z2) {
            hashMap2 = this.A1;
            vf6Var = this.B1;
        } else {
            hashMap2 = this.w1;
            vf6Var = this.x1;
        }
        HashMap hashMap3 = hashMap2;
        vf6 vf6Var2 = vf6Var;
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
            getConnectionsManager().sendRequest(getwebpagepreview, new oz4(this, hashMap3, str, vf6Var2, j, i));
        }
    }

    public final void f5(long j, boolean z, boolean z2, boolean z3) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = f1(j);
        tL_channels_toggleForum.enabled = z;
        tL_channels_toggleForum.tabs = z2;
        tL_channels_toggleForum.sidebar = z3;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new y47(this, (byte) 16), 64);
        getNotificationCenter().k(kk7.t5, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public final void g(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z = chat.call_active;
        int i = kk7.z2;
        if (z && chat.call_not_empty && chat.migrated_to == null && !hc2.r0(chat)) {
            if (chat2 == null) {
                hashMap.put(Long.valueOf(chat.id), chat);
                getNotificationCenter().k(i, new Object[0]);
            }
        } else if (chat2 == null) {
        } else {
            hashMap.remove(Long.valueOf(chat.id));
            getNotificationCenter().k(i, new Object[0]);
        }
    }

    public final void g0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i) {
        long j;
        TLRPC.InputPeer j1;
        if (user != null) {
            j = user.id;
        } else if (chat2 != null) {
            j = chat2.id;
        } else {
            j = 0;
        }
        long j2 = j;
        if (i == 0) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new sa7(messagesStorage, -chat.id, j2, (byte) 3));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = g1(chat);
        if (user != null) {
            j1 = l1(user);
        } else {
            j1 = j1(chat2);
        }
        tL_channels_deleteParticipantHistory.participant = j1;
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new rt0(this, chat, user, chat2, (byte) 10));
    }

    public final void g2(int i) {
        this.d0.remove(i);
        getNotificationCenter().k(kk7.B5, Integer.valueOf(i));
    }

    public final void g3(TLRPC.InputPeer inputPeer, long j) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long m = cf3.m(inputPeer);
            vf6 vf6Var = this.T0;
            if (vf6Var.h(m) >= 0) {
                return;
            }
            vf6Var.k(Boolean.TRUE, m);
            if (w01.a) {
                fa4.b("load unknown dialog " + m);
            }
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = inputPeer;
            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
            if (j == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
                } catch (Exception e) {
                    exc = e;
                }
                try {
                    nativeByteBuffer.writeInt32(15);
                    inputPeer.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    exc = e2;
                    nativeByteBuffer2 = nativeByteBuffer;
                    fa4.g(exc, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j = getMessagesStorage().y(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new t57(this, j, m, (byte) 1));
                }
                j = getMessagesStorage().y(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new t57(this, j, m, (byte) 1));
        }
    }

    public final void g4(ArrayList arrayList, long j) {
        int i = 0;
        int i2 = this.U.get(j, 0);
        if (i2 != 0) {
            int size = arrayList.size();
            while (i < size) {
                if (((TLRPC.Message) arrayList.get(i)).id <= i2) {
                    arrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public final void g5(long j, boolean z) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = f1(j);
        tL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new y47(this, (byte) 11), 64);
    }

    public final void h() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        Z3(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        Z3(tL_userForeign_old22, true, false);
    }

    public final void h0(TLRPC.TL_inputPhoto tL_inputPhoto) {
        TLRPC.Photo photo;
        long e = getUserConfig().e();
        if (tL_inputPhoto == null) {
            w97 S0 = S0(e);
            ArrayList arrayList = S0.b;
            if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
                S0.e(photo.id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User V1 = V1(Long.valueOf(getUserConfig().e()));
            if (V1 == null) {
                V1 = getUserConfig().f();
            }
            if (V1 == null) {
                return;
            }
            if (V1.photo != null) {
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new sa7(messagesStorage, V1.id, V1.photo.photo_id, (byte) 4));
            }
            getNotificationCenter().k(kk7.i0, new Object[0]);
            getNotificationCenter().k(2, Integer.valueOf(q5));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new x47(this, e, (byte) 9));
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.id.add(tL_inputPhoto);
        S0(e).e(tL_inputPhoto.id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public final TLRPC.InputPeer h1(long j) {
        if (j == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j < 0) {
            long j2 = -j;
            TLRPC.Chat K0 = K0(Long.valueOf(j2));
            if (hc2.T(K0)) {
                if (K0 != null && K0.access_hash == 0) {
                    long j3 = K0.fromMessageDialogId;
                    if (j3 != 0 && j3 != j && K0.fromMessageId != 0) {
                        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                        tL_inputPeerChannelFromMessage.channel_id = j2;
                        tL_inputPeerChannelFromMessage.peer = h1(K0.fromMessageDialogId);
                        tL_inputPeerChannelFromMessage.msg_id = K0.fromMessageId;
                        return tL_inputPeerChannelFromMessage;
                    }
                }
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChannel.channel_id = j2;
                tL_inputPeerChannel.access_hash = K0.access_hash;
                return tL_inputPeerChannel;
            }
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j2;
            return tL_inputPeerChat;
        }
        TLRPC.User V1 = V1(Long.valueOf(j));
        if (V1 != null && V1.access_hash == 0) {
            long j4 = V1.fromMessageDialogId;
            if (j4 != 0 && j4 != j && V1.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = j;
                tL_inputPeerUserFromMessage.peer = h1(V1.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = V1.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = j;
        if (V1 != null) {
            tL_inputPeerUser.access_hash = V1.access_hash;
        }
        return tL_inputPeerUser;
    }

    public final void h2() {
        this.a5 = null;
        this.Z4 = 0L;
    }

    public final void h3(int i, TLRPC.User user, boolean z) {
        ad7 messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.a.c(new bs1(messagesStorage, user, z, i, (byte) 8));
        }
    }

    public final void h4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (this.F.remove(dialog) && cf3.x(dialog)) {
            Utilities.d.c(new r57(this, j, (byte) 9));
        }
        this.y.remove(dialog);
        this.H.remove(dialog);
        this.I.remove(dialog);
        this.G.remove(dialog);
        this.J.remove(dialog);
        this.M.remove(dialog);
        this.K.remove(dialog);
        this.L.remove(dialog);
        this.E.remove(dialog);
        int i = 0;
        while (true) {
            t97[] t97VarArr = this.N;
            if (i >= t97VarArr.length) {
                break;
            }
            t97 t97Var = t97VarArr[i];
            if (t97Var != null) {
                t97Var.k.remove(dialog);
                this.N[i].l.remove(dialog);
            }
            i++;
        }
        this.p4.remove(dialog);
        this.R.l(j);
        ArrayList arrayList = (ArrayList) this.w.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
        i4(dialog);
    }

    public final void h5(final long j, final long j2, boolean z, boolean z2, final boolean z3, final Runnable runnable, final Runnable runnable2) {
        TLRPC.InputUser tL_inputUserEmpty;
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = f1(j);
        tL_channels_toggleJoinRequest.enabled = z;
        tL_channels_toggleJoinRequest.apply_to_invites = z2;
        if (z3) {
            if (j2 != 0) {
                tL_inputUserEmpty = m1(j2);
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
                    final na7 na7Var = na7.this;
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    final boolean z4 = z3;
                    final long j3 = j;
                    final long j4 = j2;
                    gl.e3(new Runnable() {
                        @Override
                        public final void run() {
                            TLRPC.ChatFull L0;
                            boolean z5;
                            na7 na7Var2 = na7.this;
                            if (z4 && (L0 = na7Var2.L0(j3)) != null) {
                                int i = L0.flags2;
                                long j5 = j4;
                                if (j5 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                L0.flags2 = fod.b(i, 8388608, z5);
                                L0.guard_bot_id = j5;
                                na7Var2.getMessagesStorage().K1(L0, false);
                                kk7 notificationCenter = na7Var2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(kk7.S, L0, 0, bool, bool);
                            }
                            na7Var2.getNotificationCenter().k(2, 8192);
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

    public final void i(ArrayList arrayList, long j) {
        int i;
        vf6 vf6Var = this.B0;
        SparseArray sparseArray = (SparseArray) vf6Var.f(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            vf6Var.k(sparseArray, j);
            this.C0++;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((k27) sparseArray.valueAt(i2)).v0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i3 = Integer.MAX_VALUE;
        boolean z = false;
        for (int i4 = 0; i4 < size2; i4++) {
            k27 k27Var = (k27) arrayList.get(i4);
            if (k27Var.D == 17) {
                TLRPC.MessageMedia messageMedia = k27Var.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i = poll.close_date) != 0) {
                        if (i <= currentTime) {
                            z = true;
                        } else {
                            i3 = Math.min(i3, i - currentTime);
                        }
                    }
                    int e1 = k27Var.e1();
                    k27 k27Var2 = (k27) sparseArray.get(e1);
                    if (k27Var2 != null) {
                        k27Var2.v0 = true;
                    } else {
                        sparseArray.put(e1, k27Var);
                    }
                }
            }
        }
        if (z) {
            this.D0 = 0L;
        } else if (i3 < 5) {
            this.D0 = Math.min(this.D0, System.currentTimeMillis() - ((5 - i3) * 1000));
        }
    }

    public final void i2(int i, long j) {
        if (this.h1.contains(Long.valueOf(j))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.i1;
        int indexOfKey = longSparseLongArray.indexOfKey(j);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        Y2(V1(Long.valueOf(j)), i, true, null);
    }

    public final void i3() {
        gl.r(this.l5);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        o97 o97Var = this.n5;
        if (tL_webBrowserSettings == null) {
            o97Var.e(this.currentAccount, null, new k67(this, (byte) 0));
        }
        o97Var.d(this.currentAccount, null);
        o97Var.c(this.currentAccount, null, new f97(this, (byte) 2));
    }

    public final void i4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j = dialog.id;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        vf6 vf6Var = this.x;
        if (i > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null) {
                long j2 = V1.linked_community_id;
                if (j2 != 0 && (arrayList2 = (ArrayList) vf6Var.f(j2)) != null) {
                    arrayList2.remove(dialog);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (K0 != null) {
            long j3 = K0.linked_community_id;
            if (j3 != 0 && (arrayList = (ArrayList) vf6Var.f(j3)) != null) {
                arrayList.remove(dialog);
            }
        }
    }

    public final void i5(long j, int i, boolean z, vn2 vn2Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = h1(j);
        tL_messages_toggleNoForwards.enabled = z;
        if (i > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new ae2(this, vn2Var, (byte) 29), 64);
    }

    public final void j(final long j, final TLRPC.User user, int i, String str, final d dVar, final boolean z, final Runnable runnable, final z97 z97Var, final p8c p8cVar) {
        boolean z2;
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (z97Var != null) {
                z97Var.b(null);
            }
            if (p8cVar != null) {
                p8cVar.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat K0 = K0(Long.valueOf(j));
        final boolean T = hc2.T(K0);
        if (T && K0.megagroup) {
            z2 = true;
        } else {
            z2 = false;
        }
        final boolean z3 = z2;
        final TLRPC.InputUser o1 = o1(user);
        if (str != null && (!T || z3)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = o1;
            if (T) {
                tL_messages_startBot.peer = h1(-j);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.b.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (T) {
            if (o1 instanceof TLRPC.TL_inputUserSelf) {
                Long valueOf = Long.valueOf(j);
                ArrayList arrayList = this.n;
                if (arrayList.contains(valueOf)) {
                    if (z97Var != null) {
                        z97Var.b(null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = f1(j);
                arrayList.add(Long.valueOf(j));
                tL_messages_addChatUser = tL_channels_joinChannel;
            } else {
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = f1(j);
                tL_channels_inviteToChannel.users.add(o1);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j;
            tL_messages_addChatUser2.fwd_limit = i;
            tL_messages_addChatUser2.user_id = o1;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z4;
                final na7 na7Var = na7.this;
                final boolean z5 = T;
                final TLRPC.InputUser inputUser = o1;
                long j2 = j;
                if (z5 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    gl.d3(new r57(na7Var, j2, (byte) 12));
                }
                p8c p8cVar2 = p8cVar;
                Runnable runnable2 = runnable;
                TLRPC.User user2 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        gl.d3(new t67(p8cVar2, runnable2, (byte) 9));
                        return;
                    } else if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user2.id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        gl.d3(new m77(na7Var, p8cVar2, tL_messages_invitedUsers, j2, (byte) 0));
                        return;
                    } else {
                        gl.d3(new mn0(p8cVar2, (byte) 10));
                        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z) {
                            if (runnable2 != null) {
                                gl.d3(runnable2);
                                return;
                            }
                            return;
                        }
                        final z97 z97Var2 = z97Var;
                        final d dVar2 = dVar;
                        final TLObject tLObject2 = tL_messages_addChatUser3;
                        final boolean z6 = z3;
                        if (z97Var2 != null) {
                            gl.d3(new zo6(na7Var, z97Var2, tL_error, dVar2, tLObject2, z5, z6, (byte) 1));
                        }
                        gl.d3(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z7;
                                na7 na7Var2 = na7.this;
                                z97 z97Var3 = z97Var2;
                                boolean z8 = z5;
                                if (z97Var3 == null) {
                                    int i2 = na7Var2.currentAccount;
                                    if (z8 && !z6) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    ij.c0(i2, tL_error, dVar2, tLObject2, Boolean.valueOf(z7));
                                }
                                if (z8 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                                    na7Var2.getNotificationCenter().k(2, 8192);
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
                    gl.d3(new de2(na7Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j2, (byte) 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                    updates = tL_messages_invitedUsers2.updates;
                } else if (tLObject instanceof TLRPC.Updates) {
                    updates = (TLRPC.Updates) tLObject;
                } else {
                    fa4.d("unexpected " + tLObject + " in addUserToChat");
                    gl.d3(new mn0(p8cVar2, (byte) 11));
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i2);
                        if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                            z4 = true;
                            break;
                        }
                        i2++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                na7Var.Q3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    gl.d3(new o77(na7Var, updates, p8cVar2, tL_messages_invitedUsers2, j2, (byte) 0));
                    return;
                }
                if (z5) {
                    if (!z4 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        na7Var.z0(j2, true);
                    }
                    gl.e3(new r57(na7Var, j2, (byte) 14), 1000L);
                }
                if (z5 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    na7Var.getMessagesStorage().O1(-j2, j2, new ArrayList(), null);
                }
                if (runnable2 != null) {
                    gl.d3(runnable2);
                }
                if (p8cVar2 != null) {
                    gl.d3(new mn0(p8cVar2, (byte) 9));
                }
                if (l7c.C(user2) && !hc2.V(K0) && z4) {
                    gl.d3(new r57(na7Var, j2, (byte) 13));
                }
            }
        });
    }

    public final boolean j0() {
        int i = 0;
        while (true) {
            t97[] t97VarArr = this.N;
            if (i < t97VarArr.length) {
                if (t0(t97VarArr[i])) {
                    return true;
                }
                i++;
            } else {
                return j2();
            }
        }
    }

    public final boolean j2() {
        if (this.G0.size() <= 1 || !this.n4.contains(0)) {
            return false;
        }
        return true;
    }

    public final void j3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.j3():void");
    }

    public final void j4(t97 t97Var) {
        this.G0.remove(t97Var);
        this.J0.remove(t97Var.a);
        Integer valueOf = Integer.valueOf(t97Var.a);
        HashSet hashSet = this.n4;
        if (hashSet.remove(valueOf)) {
            B4();
        }
        if (hashSet.contains(0)) {
            Y4(null);
        }
        getNotificationCenter().k(kk7.N2, new Object[0]);
    }

    public final void j5(long j, boolean z) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = f1(j);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z;
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        if (K0 != null) {
            K0.collapsed_in_dialogs = z;
            S3(K0, true);
            Y4(null);
            getNotificationCenter().k(kk7.V5, Long.valueOf(j), Boolean.valueOf(z));
            getNotificationCenter().k(kk7.r, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new hc((byte) 0), new np0((byte) 2));
    }

    public final void k(long j, TLRPC.User user, String str, d dVar, Runnable runnable) {
        j(j, user, 0, str, dVar, false, runnable, null, null);
    }

    public final void k0(int i, long j, SparseArray sparseArray) {
        Utilities.d.c(new w57(this, i, (byte) 1));
        if (sparseArray != null) {
            gl.d3(new go6(this, j, sparseArray, (byte) 3));
        }
    }

    public final TLRPC.InputPeer k1(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.Chat K0 = K0(Long.valueOf(peer.channel_id));
            if (K0 != null && K0.access_hash == 0) {
                long j = K0.fromMessageDialogId;
                if (j != 0 && j != peer.channel_id && K0.fromMessageId != 0) {
                    TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannelFromMessage.channel_id = peer.channel_id;
                    tL_inputPeerChannelFromMessage.peer = h1(K0.fromMessageDialogId);
                    tL_inputPeerChannelFromMessage.msg_id = K0.fromMessageId;
                    return tL_inputPeerChannelFromMessage;
                }
            }
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = peer.channel_id;
            if (K0 != null) {
                tL_inputPeerChannel.access_hash = K0.access_hash;
            }
            return tL_inputPeerChannel;
        } else {
            TLRPC.User V1 = V1(Long.valueOf(peer.user_id));
            if (V1 != null && V1.access_hash == 0 && V1.fromMessageDialogId != 0 && V1.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = peer.user_id;
                tL_inputPeerUserFromMessage.peer = h1(V1.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = V1.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = peer.user_id;
            if (V1 != null) {
                tL_inputPeerUser.access_hash = V1.access_hash;
            }
            return tL_inputPeerUser;
        }
    }

    public final boolean k2(TLRPC.Chat chat) {
        TLRPC.Chat K0;
        if (chat == null) {
            return false;
        }
        TLRPC.InputChannel inputChannel = chat.migrated_to;
        if (inputChannel != null && (K0 = K0(Long.valueOf(inputChannel.channel_id))) != null) {
            return K0.noforwards;
        }
        return chat.noforwards;
    }

    public final void k3(final long r18, final int r20, int r21, final int r22, boolean r23, final long r24, int r26, final boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.k3(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public final void k4(int i) {
        long j = i | 2305843009213693952L;
        vf6 vf6Var = this.R;
        TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var.f(j);
        if (dialog == null) {
            return;
        }
        vf6Var.l(j);
        this.y.remove(dialog);
        Y4(null);
        getNotificationCenter().k(kk7.r, new Object[0]);
        getNotificationCenter().k(kk7.c0, Integer.valueOf(i));
    }

    public final void k5(Runnable runnable, long j) {
        TLRPC.Chat K0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null) {
                user = V1;
                K0 = null;
            } else {
                return;
            }
        } else {
            K0 = K0(Long.valueOf(-j));
            if (K0 == null) {
                return;
            }
        }
        this.y0--;
        this.x0.delete(j);
        if (user != null) {
            tL_contacts_unblock.id = l1(user);
        } else {
            tL_contacts_unblock.id = j1(K0);
        }
        getNotificationCenter().k(kk7.f0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new n35(runnable, (byte) 10));
    }

    public final void l(TLRPC.Chat chat, d dVar, ArrayList arrayList, int i, vs2 vs2Var, vs2 vs2Var2, pc7 pc7Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j = chat2.id;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i2);
            j(j, user, i, null, dVar, false, new t67(vs2Var, user, (byte) 13), new dx6(vs2Var2, user, (byte) 4), new e77(this, tL_messages_invitedUsers, iArr, size, chat2, pc7Var));
            Z3(user, false, false);
            chat2 = chat;
        }
    }

    public final void l0(boolean z) {
        TLRPC.UserFull W1 = W1(getUserConfig().e());
        if (W1 != null) {
            W1.sponsored_enabled = false;
            getMessagesStorage().g2(W1, false);
            if (z) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final boolean l2(long j) {
        if (j < 0) {
            return hc2.Y(K0(Long.valueOf(-j)));
        }
        return false;
    }

    public final void l3(long j, TLRPC.InputPeer inputPeer, long j2) {
        na7 na7Var;
        long j3;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                na7Var = this;
                j3 = j;
                na7Var.n2(j3, 0L, null);
            } else {
                na7Var = this;
                j3 = j;
            }
            na7Var.getNotificationCenter().k(2, 256);
            na7Var.getMessagesStorage().C1(j3, true);
            if (na7Var.j0()) {
                na7Var.Y4(null);
                na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
            }
        } else {
            na7Var = this;
            j3 = j;
        }
        if (!cf3.B(j3)) {
            TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
            tL_messages_markDialogUnread.unread = true;
            if (inputPeer == null) {
                inputPeer = na7Var.h1(j3);
            }
            if (!(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = inputPeer;
                tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
                if (j2 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
                    } catch (Exception e) {
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(9);
                        nativeByteBuffer.writeInt64(j3);
                        inputPeer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e2) {
                        exc = e2;
                        nativeByteBuffer2 = nativeByteBuffer;
                        fa4.g(exc, true);
                        nativeByteBuffer = nativeByteBuffer2;
                        j2 = na7Var.getMessagesStorage().y(nativeByteBuffer);
                        na7Var.getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new x47(na7Var, j2, (byte) 10));
                    }
                    j2 = na7Var.getMessagesStorage().y(nativeByteBuffer);
                }
                na7Var.getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new x47(na7Var, j2, (byte) 10));
            }
        }
    }

    public final void l4() {
        TLRPC.Dialog dialog = this.q2;
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (j < 0) {
            TLRPC.Chat K0 = K0(Long.valueOf(-j));
            if (hc2.r0(K0) || K0.restricted) {
                h4(this.q2);
            }
        } else {
            h4(dialog);
        }
        this.q2 = null;
        Y4(null);
        getNotificationCenter().k(kk7.r, new Object[0]);
    }

    public final void l5(long j, TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        boolean z;
        TLRPC.EmojiStatus emojiStatus2;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        if (j != 0 && j != getUserConfig().e()) {
            z = false;
        } else {
            z = true;
        }
        if ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && ug8.A(tL_starGiftUnique)) {
            emojiStatus2 = n0(tL_starGiftUnique);
        } else {
            emojiStatus2 = emojiStatus;
        }
        if (z) {
            TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
            updateemojistatus.emoji_status = emojiStatus;
            TLRPC.User f = getUserConfig().f();
            tL_channels_updateEmojiStatus = updateemojistatus;
            if (f != null) {
                f.emoji_status = emojiStatus2;
                getNotificationCenter().k(kk7.o5, f);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j2 = -j;
            tL_channels_updateEmojiStatus2.channel = f1(j2);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat K0 = K0(Long.valueOf(j2));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (K0 != null) {
                K0.flags |= 512;
                K0.emoji_status = emojiStatus2;
                S3(K0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().o5(j, emojiStatus2);
        getNotificationCenter().k(2, 524288);
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public final void m(String str, boolean z) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new k67(this, (byte) 4));
    }

    public final void m0(long j, int i, long j2) {
        getMessagesStorage().n1(j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new jc7(messagesStorage, arrayList, j2, (byte) 2));
    }

    public final TLRPC.InputUser m1(long j) {
        return o1(V1(Long.valueOf(j)));
    }

    public final boolean m2(long j, long j2) {
        return n2(j, j2, null);
    }

    public final void m3(ArrayList arrayList, long j) {
        ArrayList arrayList2 = (ArrayList) this.S.f(j);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                k27 k27Var = (k27) arrayList2.get(i);
                if (k27Var != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (k27Var.e1() == ((Integer) arrayList.get(i2)).intValue()) {
                            k27Var.Z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public final void m4(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.w3;
                int i2 = kk7.r1;
                if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                    this.w3 = null;
                    getNotificationCenter().k(i2, new Object[0]);
                } else if (!this.u3.remove(str) && this.v3.contains(str)) {
                    return;
                } else {
                    this.v3.add(str);
                    SharedPreferences.Editor edit = this.X3.edit();
                    edit.putStringSet("pendingSuggestions", this.u3);
                    edit.putStringSet("dismissedSuggestions", this.v3);
                    edit.commit();
                    getNotificationCenter().k(i2, new Object[0]);
                }
            }
            TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
            tL_help_dismissSuggestion.suggestion = str;
            if (i == 0) {
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_help_dismissSuggestion.peer = h1(j);
            }
            getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ce2((byte) 0));
        }
    }

    public final void m5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        l5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final void n(ArrayList arrayList) {
        SharedPreferences.Editor edit = q1(this.currentAccount).W3.edit();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                wm7 wm7Var = getNotificationsController().h0;
                wm7Var.getClass();
                long B1 = k27.B1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(ls6.n(B1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + B1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wm7Var.a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) != 0) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                            edit.putInt("notify2_" + B1, 2);
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        } else {
                            edit.putInt("notify2_" + B1, 3);
                            edit.putInt(ls6.n(B1, "notifyuntil_"), dialog.notify_settings.mute_until);
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

    public final TLRPC.InputUser n1(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (inputPeer.access_hash == 0) {
            TLRPC.User V1 = V1(Long.valueOf(inputPeer.user_id));
            if (V1.access_hash == 0 && V1.fromMessageDialogId != 0 && V1.fromMessageId != 0) {
                TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
                tL_inputUserFromMessage.user_id = inputPeer.user_id;
                tL_inputUserFromMessage.peer = h1(V1.fromMessageDialogId);
                tL_inputUserFromMessage.msg_id = V1.fromMessageId;
                return tL_inputUserFromMessage;
            }
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public final boolean n2(long j, long j2, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb = new StringBuilder("notify2_");
        boolean z = false;
        sb.append(im7.p(j, j2, false));
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.W3;
        int i = sharedPreferences.getInt(sb2, -1);
        if (i == -1) {
            if (chat != null) {
                if (hc2.T(chat) && !chat.megagroup) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            if (j2 != 0) {
                return n2(j, 0L, chat);
            }
            return !getNotificationsController().x(j, bool2, false, false);
        } else if (i == 2) {
            return true;
        } else {
            if (i == 3) {
                if (sharedPreferences.getInt("notifyuntil_" + im7.p(j, j2, false), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void n3(long j) {
        SharedPreferences.Editor edit = this.W3.edit();
        edit.putBoolean("dialog_bar_replied" + j, true).apply();
        gl.d3(new r57(this, j, (byte) 10));
    }

    public final void n4(h19 h19Var, String str) {
        int i;
        h19 h19Var2;
        boolean z;
        boolean z2;
        long j;
        int i2;
        long j2;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        vf6 vf6Var = this.O4;
        if (vf6Var != null) {
            long j3 = 0;
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(0L);
            if (tL_messages_savedReactionsTags == null) {
                vf6 vf6Var2 = this.O4;
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                vf6Var2.k(tL_messages_savedReactionsTags2, 0L);
                tL_messages_savedReactionsTags = tL_messages_savedReactionsTags2;
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i = 1;
                if (i8 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i8);
                    h19Var2 = h19Var;
                    if (h19Var2.f(tL_savedReactionTag.reaction)) {
                        boolean isEmpty = TextUtils.isEmpty(str);
                        String str3 = tL_savedReactionTag.title;
                        if (isEmpty) {
                            if (str3 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            tL_savedReactionTag.flags &= -2;
                            tL_savedReactionTag.title = null;
                        } else {
                            z = !TextUtils.equals(str3, str);
                            tL_savedReactionTag.flags |= 1;
                            tL_savedReactionTag.title = str;
                        }
                        z2 = true;
                    } else {
                        i8++;
                    }
                } else {
                    h19Var2 = h19Var;
                    z = false;
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                tL_savedReactionTag2.reaction = h19Var2.g();
                if (!TextUtils.isEmpty(str)) {
                    tL_savedReactionTag2.title = str;
                }
                tL_savedReactionTag2.count = 1;
                tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                z = true;
            }
            if (z) {
                TLRPC.TL_messages_updateSavedReactionTag tL_messages_updateSavedReactionTag = new TLRPC.TL_messages_updateSavedReactionTag();
                tL_messages_updateSavedReactionTag.reaction = h19Var2.g();
                if (!TextUtils.isEmpty(str)) {
                    tL_messages_updateSavedReactionTag.flags |= 1;
                    tL_messages_updateSavedReactionTag.title = str;
                }
                getConnectionsManager().sendRequest(tL_messages_updateSavedReactionTag, null);
                Collections.sort(tL_messages_savedReactionsTags.tags, new el6(this, (byte) 17));
                long j4 = 0;
                int i9 = 0;
                while (i9 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag3 = tL_messages_savedReactionsTags.tags.get(i9);
                    if (tL_savedReactionTag3.count <= 0) {
                        j = j3;
                    } else {
                        TLRPC.Reaction reaction = tL_savedReactionTag3.reaction;
                        int i10 = -1;
                        j = j3;
                        int i11 = 16;
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String substring = Utilities.a(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(i7, 16);
                            int length = substring.length();
                            if (length != 0) {
                                if (substring.charAt(i7) == '+' && length > i) {
                                    i5 = i;
                                } else {
                                    i5 = i7;
                                }
                                long j5 = j4;
                                long j6 = j;
                                while (i5 < length) {
                                    int digit = Character.digit(substring.charAt(i5), 16);
                                    if (digit != i10) {
                                        if (j6 >= j && j6 <= 1152921504606846975L && (i6 != 0 || digit <= 15)) {
                                            j6 = (j6 << 4) + digit;
                                            i5++;
                                            i = i;
                                            substring = substring;
                                            i10 = -1;
                                        } else {
                                            throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
                                        }
                                    } else {
                                        throw new NumberFormatException(substring.toString());
                                    }
                                }
                                i2 = i;
                                j2 = hq6.r(j5, j6);
                            } else {
                                throw new NumberFormatException("empty string");
                            }
                        } else {
                            long j7 = j4;
                            i2 = i;
                            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                j2 = hq6.r(j7, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            } else {
                                j2 = j7;
                            }
                        }
                        if ((tL_savedReactionTag3.flags & i2) != 0 && (str2 = tL_savedReactionTag3.title) != null) {
                            String substring2 = Utilities.a(str2).substring(0, 16);
                            int length2 = substring2.length();
                            if (length2 != 0) {
                                if (substring2.charAt(0) == '+' && length2 > i2) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                long j8 = j;
                                while (i3 < length2) {
                                    int digit2 = Character.digit(substring2.charAt(i3), i11);
                                    if (digit2 != -1) {
                                        if (j8 >= j && j8 <= 1152921504606846975L && (i4 != 0 || digit2 <= 15)) {
                                            j8 = (j8 << 4) + digit2;
                                            i3++;
                                            substring2 = substring2;
                                            i11 = 16;
                                        } else {
                                            throw new NumberFormatException("Too large for unsigned long: ".concat(substring2.toString()));
                                        }
                                    } else {
                                        throw new NumberFormatException(substring2.toString());
                                    }
                                }
                                j2 = hq6.r(j2, j8);
                            } else {
                                throw new NumberFormatException("empty string");
                            }
                        }
                        j4 = hq6.r(j2, tL_savedReactionTag3.count);
                    }
                    i9++;
                    j3 = j;
                    i7 = 0;
                    i = 1;
                }
                tL_messages_savedReactionsTags.hash = j4;
                y4(j3, tL_messages_savedReactionsTags);
                getNotificationCenter().k(kk7.i3, Long.valueOf(j3));
            }
        }
    }

    public final void n5() {
        int intValue;
        long longValue;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        ConcurrentHashMap concurrentHashMap = this.f4;
        Iterator it = concurrentHashMap.keySet().iterator();
        Long l = null;
        while (it.hasNext()) {
            if (((Integer) concurrentHashMap.get(it.next())).intValue() > currentTimeMillis) {
                if (l == null) {
                    longValue = Long.MAX_VALUE;
                } else {
                    longValue = l.longValue();
                }
                l = Long.valueOf(Math.min(longValue, intValue - currentTimeMillis));
            } else {
                it.remove();
            }
        }
        if (l != null) {
            long longValue2 = l.longValue() + 2;
            long j = currentTimeMillis;
            if (j + longValue2 != this.d4 + this.c4) {
                gl.r(this.e4);
                this.d4 = j;
                this.c4 = longValue2;
                f67 f67Var = new f67(this, (byte) 9);
                this.e4 = f67Var;
                gl.e3(f67Var, longValue2 * 1000);
                return;
            }
            return;
        }
        f67 f67Var2 = this.e4;
        if (f67Var2 != null) {
            this.d4 = -1L;
            this.c4 = -1L;
            gl.r(f67Var2);
        }
    }

    public final boolean o(ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            TL_update.TL_updateFolderPeers tL_updateFolderPeers = (TL_update.TL_updateFolderPeers) arrayList.get(i);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i2);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(cf3.n(tL_folderPeer.peer));
                if (dialog != null) {
                    int i3 = dialog.folder_id;
                    int i4 = tL_folderPeer.folder_id;
                    if (i3 != i4) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i4;
                        this.h0 = true;
                        z();
                    }
                }
            }
            getMessagesStorage().D1(((TL_update.TL_updateFolderPeers) arrayList.get(i)).folder_peers, null, 0L, 0);
            i++;
            z = true;
        }
        return z;
    }

    public final void o0(int i, boolean[] zArr) {
        ArrayList arrayList;
        if (i == 0) {
            return;
        }
        long j = i | 2305843009213693952L;
        vf6 vf6Var = this.R;
        if (((TLRPC.Dialog) vf6Var.f(j)) instanceof TLRPC.TL_dialogFolder) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.id = j;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.id = i;
        tL_folder.title = k96.M0(2131754133, null);
        tL_dialogFolder.pinned = true;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.y;
            if (i2 >= arrayList.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
            if (!dialog.pinned) {
                if (dialog.id != this.s2) {
                    break;
                }
            } else {
                i3 = Math.max(dialog.pinnedNum, i3);
            }
            i2++;
        }
        tL_dialogFolder.pinnedNum = i3 + 1;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        tL_messages_dialogs.dialogs.add(tL_dialogFolder);
        getMessagesStorage().a1(tL_messages_dialogs, 1);
        vf6Var.k(tL_dialogFolder, j);
        arrayList.add(0, tL_dialogFolder);
    }

    public final TLRPC.InputUser o1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
            tL_inputUserFromMessage.user_id = user.id;
            tL_inputUserFromMessage.peer = h1(user.fromMessageDialogId);
            tL_inputUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputUserFromMessage;
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public final boolean o2(long j, long j2) {
        return this.W3.getBoolean("sound_enabled_" + im7.p(j, j2, false), true);
    }

    public final void o3(long j, int i, long j2) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new yb7(messagesStorage, i, -j, j2, (byte) 0));
        if (j != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = f1(j);
            tL_channels_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ce2((byte) 0));
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.id.add(Integer.valueOf(i));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new y47(this, (byte) 15));
    }

    public final void o4(int i, long j, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j == 0) {
            ArrayList U0 = U0(i);
            if (U0.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = U0.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(i3);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    boolean z = dialog.pinned;
                    long j2 = dialog.id;
                    if (!z) {
                        if (j2 != this.s2) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(j2));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!cf3.B(dialog.id)) {
                            TLRPC.InputPeer h1 = h1(dialog.id);
                            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-dialog.id));
                            if (hc2.Y(K0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().f1(K0.id);
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeerCommunity);
                                objectSize = tL_inputDialogPeerCommunity.getObjectSize();
                            } else {
                                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                tL_inputDialogPeer.peer = h1;
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                                objectSize = tL_inputDialogPeer.getObjectSize();
                            }
                            i2 += objectSize;
                        }
                    }
                }
            }
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ya7(messagesStorage, arrayList2, arrayList3, (byte) 0));
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(i2 + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(16);
                nativeByteBuffer.writeInt32(i);
                nativeByteBuffer.writeInt32(tL_messages_reorderPinnedDialogs.order.size());
                int size2 = tL_messages_reorderPinnedDialogs.order.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    tL_messages_reorderPinnedDialogs.order.get(i4).serializeToStream(nativeByteBuffer);
                }
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                fa4.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j = getMessagesStorage().y(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new x47(this, j, (byte) 0));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new x47(this, j, (byte) 0));
    }

    public final void o5(long j, TLRPC.EmojiStatus emojiStatus) {
        int g = cf3.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f4;
        if (g != 0) {
            concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(g));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j));
        }
        n5();
    }

    public final void p(ArrayList arrayList, ArrayList arrayList2, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        HashSet hashSet;
        if (arrayList != null) {
            hashSet = new HashSet(arrayList);
        } else {
            hashSet = new HashSet();
        }
        this.u3 = hashSet;
        if (arrayList2 != null) {
            this.v3 = new HashSet(arrayList2);
        }
        this.w3 = tL_pendingSuggestion;
        getNotificationCenter().k(kk7.r1, new Object[0]);
        SharedPreferences.Editor edit = this.X3.edit();
        edit.putStringSet("pendingSuggestions", this.u3);
        edit.putStringSet("dismissedSuggestions", this.v3);
        edit.apply();
    }

    public final Runnable p0(long j, int i, ca7 ca7Var) {
        int i2;
        long j2;
        int i3;
        int i4;
        na7 na7Var;
        SharedPreferences sharedPreferences = q1(this.currentAccount).W3;
        if (i == 0) {
            i2 = sharedPreferences.getInt("diditem" + j, 0);
        } else {
            i2 = i;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        if (cf3.y(j)) {
            j2 = -j;
        } else {
            j2 = 0;
        }
        if (j2 != 0 && getMessagesController().K0(Long.valueOf(j2)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new u57(this, zArr, messagesStorage, j2, runnableArr, j, i2, ca7Var));
            return new v57(zArr, runnableArr, (byte) 0);
        }
        if (gl.O1()) {
            i3 = 30;
        } else {
            i3 = 20;
        }
        int i5 = i3;
        int i6 = i2;
        m97 m97Var = new m97(this, generateClassGuid, i5, i6, j, ca7Var);
        getNotificationCenter().a(m97Var, kk7.G);
        getNotificationCenter().a(m97Var, kk7.H);
        if (i6 != 0) {
            na7Var = this;
            i4 = generateClassGuid;
            na7Var.a3(j, 0L, true, i5, i6, 0, true, 0, i4, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            i4 = generateClassGuid;
            na7Var = this;
            na7Var.a3(j, 0L, true, i5, i6, 0, true, 0, i4, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new w57(na7Var, i4, (byte) 0);
    }

    public final boolean p2(TLRPC.Dialog dialog) {
        TLRPC.Chat chat;
        if (dialog != null) {
            if (!dialog.unread_mark) {
                boolean z = dialog instanceof TLRPC.TL_dialogCommunity;
                long j = dialog.id;
                if (z) {
                    c86 O0 = O0(-j);
                    if (O0.a > 0 || O0.b > 0) {
                    }
                } else {
                    if (j < 0) {
                        chat = K0(Long.valueOf(-j));
                    } else {
                        chat = null;
                    }
                    if (chat != null && (chat.forum || (chat.monoforum && hc2.A(this.currentAccount, chat, 24)))) {
                        long j2 = chat.id;
                        pub pubVar = this.g4;
                        if (pubVar.l(j2) == null) {
                            if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !chat.monoforum)) {
                            }
                        } else {
                            pubVar.h(chat.id);
                            int[] iArr = pub.w;
                            if (iArr[0] > 0 || (iArr[1] > 0 && !chat.monoforum)) {
                            }
                        }
                    } else if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !hc2.p0(chat))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p3(long j, long j2) {
        if (!cf3.B(j) && j != getUserConfig().e()) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new yb7(messagesStorage, j2, j, 0, (byte) 7));
            TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
            tL_messages_readMentions.peer = h1(j);
            if (j2 != 0) {
                tL_messages_readMentions.top_msg_id = (int) j2;
                tL_messages_readMentions.flags |= 1;
            }
            getConnectionsManager().sendRequest(tL_messages_readMentions, null);
        }
    }

    public final void p4(int i, long j, boolean z) {
        zsa zsaVar = new zsa(j, i);
        HashSet hashSet = this.c5;
        if (hashSet.contains(zsaVar)) {
            return;
        }
        hashSet.add(zsaVar);
        this.d5.add(new Pair(zsaVar, new AtomicBoolean(z)));
        f67 f67Var = this.e5;
        gl.r(f67Var);
        gl.d3(f67Var);
    }

    public final void p5(t97 t97Var) {
        t97 t97Var2;
        TLRPC.EncryptedChat Y0;
        TLRPC.Chat K0;
        ArrayList arrayList = this.y;
        if (t97Var != null) {
            ArrayList arrayList2 = t97Var.k;
            ArrayList arrayList3 = t97Var.l;
            arrayList2.clear();
            arrayList3.clear();
            this.q4 = t97Var;
            try {
                Collections.sort(arrayList, this.r4);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                boolean z = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z) {
                    long j = dialog.id;
                    if (!z || (K0 = K0(Long.valueOf(-j))) == null || K0.collapsed_in_dialogs) {
                        if (cf3.B(j) && (Y0 = Y0(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = Y0.user_id;
                        }
                        long j2 = j;
                        t97Var2 = t97Var;
                        if (t97Var2.b(getAccountInstance(), j2, dialog, false)) {
                            if (v(dialog)) {
                                arrayList3.add(dialog);
                            }
                            arrayList2.add(dialog);
                        }
                        i++;
                        t97Var = t97Var2;
                    }
                }
                t97Var2 = t97Var;
                i++;
                t97Var = t97Var2;
            }
            try {
                Collections.sort(arrayList, this.s4);
            } catch (Exception unused) {
            }
        }
    }

    public final void q(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (fod.a(tL_updateWebBrowserException.flags, 1)) {
                boolean z = tL_updateWebBrowserException.open_external_browser;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.m5;
                if (z) {
                    i0(tL_webBrowserSettings2.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    i0(tL_webBrowserSettings2.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                i0(this.m5.external_exceptions, tL_updateWebBrowserException.exception);
                i0(this.m5.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            i0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            i0(this.m5.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            i0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            i0(this.m5.external_exceptions, tL_updateWebBrowserException.exception);
        }
        V4(this.m5);
    }

    public final boolean q2(t97 t97Var) {
        if (t97Var != null && (t97Var.g & 64) == 0) {
            if (this.n4.contains(Integer.valueOf(t97Var.a))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q3(long j, int i, long j2) {
        TLRPC.EncryptedChat Y0;
        if (j2 != 0 && j != 0) {
            if ((i > 0 || i == Integer.MIN_VALUE) && cf3.B(j) && (Y0 = Y0(Integer.valueOf((int) (j & 4294967295L)))) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j2));
                getSecretChatHelper().u(Y0, arrayList, null);
                if (i > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    ad7 messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(new xb7(messagesStorage, Y0.id, arrayList, 0, currentTime, currentTime));
                }
            }
        }
    }

    public final void q4(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (user != null || chat != null || encryptedChat != null) {
            SharedPreferences.Editor edit = this.W3.edit();
            edit.putInt("dialog_bar_vis3" + j, 3);
            edit.commit();
            if (cf3.B(j)) {
                if (encryptedChat != null && encryptedChat.access_hash != 0) {
                    TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new ce2((byte) 0), 2);
                }
            } else if (z) {
                TL_account.reportPeer reportpeer = new TL_account.reportPeer();
                if (chat != null) {
                    reportpeer.peer = h1(-chat.id);
                } else if (user != null) {
                    reportpeer.peer = h1(user.id);
                }
                reportpeer.message = "";
                reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
                getConnectionsManager().sendRequest(reportpeer, new ce2((byte) 0), 2);
            } else {
                TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
                if (chat != null) {
                    tL_messages_reportSpam.peer = h1(-chat.id);
                } else if (user != null) {
                    tL_messages_reportSpam.peer = h1(user.id);
                }
                getConnectionsManager().sendRequest(tL_messages_reportSpam, new ce2((byte) 0), 2);
            }
        }
    }

    public final boolean q5(int r30, long r31, java.util.ArrayList r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.q5(int, long, java.util.ArrayList):boolean");
    }

    public final void r(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        V4(tL_webBrowserSettings);
    }

    public final int r1() {
        kr2 kr2Var;
        boolean p = getUserConfig().p();
        gr grVar = this.k4;
        if (p) {
            kr2Var = grVar.h0;
        } else {
            kr2Var = grVar.g0;
        }
        return kr2Var.f();
    }

    public final boolean r2(long j) {
        if (j < 0) {
            TLRPC.Chat K0 = K0(Long.valueOf(-j));
            if (K0 != null && K0.forum) {
                return true;
            }
            return false;
        }
        return l7c.v(V1(Long.valueOf(j)));
    }

    public final void r3(long r13, int r15, org.telegram.tgnet.TLRPC.InputChannel r16, int r17, long r18, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.r3(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public final void r4(boolean r23, final int r24, final int r25, final int r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.r4(boolean, int, int, int, int):void");
    }

    public final void r5(boolean z) {
        if (this.G0.isEmpty()) {
            return;
        }
        if (!z) {
            if (!((t97) this.G0.get(0)).d()) {
                int i = 1;
                while (true) {
                    if (i >= this.G0.size()) {
                        break;
                    } else if (((t97) this.G0.get(i)).d()) {
                        this.G0.add(0, (t97) this.G0.remove(i));
                        break;
                    } else {
                        i++;
                    }
                }
            }
            j3();
        } else {
            for (int i2 = 0; i2 < this.G0.size(); i2++) {
                ((t97) this.G0.get(i2)).p = false;
            }
        }
        getMessagesStorage().v1();
        getNotificationCenter().k(kk7.N2, new Object[0]);
        M1().x.b();
    }

    public final void s(int i, int i2, long j, String str, boolean z) {
        String str2 = j + "_" + i;
        HashMap hashMap = this.g5;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().h1(j);
        tL_messages_toggleSuggestedPostApproval.msg_id = i;
        if (i2 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i2;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j + "_" + i, Boolean.valueOf(!z));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new jt(this, j, i));
    }

    public final void s0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i2);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long n = cf3.n(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && n != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i3);
                        if (n == k27.B0(message) && dialog.top_message == message.id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.id;
                            tL_dialog.flags |= 16;
                            tL_messages_peerDialogs.dialogs.add(tL_dialog);
                            TLRPC.Peer peer = dialog.peer;
                            if (peer instanceof TLRPC.TL_peerChannel) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerUser.channel_id = dialog.peer.channel_id;
                                int size3 = tL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i >= size3) {
                                        break;
                                    }
                                    TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i);
                                    if (chat.id == tL_inputPeerUser.channel_id) {
                                        tL_inputPeerUser.access_hash = chat.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else if (peer instanceof TLRPC.TL_peerChat) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerUser.chat_id = dialog.peer.chat_id;
                            } else {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                                tL_inputPeerUser.user_id = dialog.peer.user_id;
                                int size4 = tL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i >= size4) {
                                        break;
                                    }
                                    TLRPC.User user = tL_messages_peerDialogs.users.get(i);
                                    if (user.id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            g3(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
                tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
            }
        }
    }

    public final TLRPC.Chat s1(long j) {
        TLRPC.Chat K0;
        TLRPC.Chat K02;
        TLRPC.Chat K03 = K0(Long.valueOf(j));
        if (K03 != null && (K02 = K0(Long.valueOf(K03.linked_monoforum_id))) != null) {
            return K02;
        }
        Long l = (Long) this.f.get(Long.valueOf(j));
        if (l != null && (K0 = K0(l)) != null) {
            return K0;
        }
        return null;
    }

    public final boolean s2(k27 k27Var) {
        if (k27Var != null && r2(k27.B0(k27Var.k))) {
            return true;
        }
        return false;
    }

    public final void s3(k27 k27Var) {
        if (k27Var.r1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (k27Var.k.mentioned) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new yb7(messagesStorage, k27Var.e1(), -k27Var.k.peer_id.channel_id, k27.B0(k27Var.k), (byte) 0));
        }
        arrayList.add(Integer.valueOf(k27Var.e1()));
        long B0 = k27.B0(k27Var.k);
        getMessagesStorage().P0(0, 0, B0, arrayList);
        getNotificationCenter().k(kk7.B0, Long.valueOf(B0), arrayList);
        int e1 = k27Var.e1();
        TLRPC.Message message = k27Var.k;
        if (e1 < 0) {
            q3(k27.B0(message), Integer.MIN_VALUE, k27Var.k.random_id);
        } else if (message.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = f1(k27Var.k.peer_id.channel_id);
            tL_channels_readMessageContents.id.add(Integer.valueOf(k27Var.e1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ce2((byte) 0));
        } else {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.id.add(Integer.valueOf(k27Var.e1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new y47(this, (byte) 5));
        }
    }

    public final boolean s4(long j) {
        if (j != 0) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = this.o4;
            Integer num = (Integer) hashMap.get(valueOf);
            if (num != null) {
                hashMap.put(Long.valueOf(j), Integer.valueOf(num.intValue() + 1));
                return true;
            } else if (!p2((TLRPC.Dialog) this.R.f(j))) {
                return false;
            } else {
                hashMap.put(Long.valueOf(j), 1);
                return true;
            }
        }
        return false;
    }

    public final void s5() {
        Iterator it;
        Iterator it2;
        boolean z;
        String M0;
        String M02;
        String str;
        int i;
        String M03;
        String M04;
        String M05;
        int i2;
        String M06;
        int i3;
        String a0;
        vf6 vf6Var = new vf6();
        vf6 vf6Var2 = new vf6();
        Iterator it3 = this.W.entrySet().iterator();
        while (true) {
            int i4 = 1;
            if (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Long l = (Long) entry.getKey();
                boolean B = cf3.B(l.longValue());
                Iterator it4 = ((ConcurrentHashMap) entry.getValue()).entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Integer num = (Integer) entry2.getKey();
                    ArrayList arrayList = (ArrayList) entry2.getValue();
                    vf6 vf6Var3 = new vf6();
                    vf6 vf6Var4 = new vf6();
                    vf6Var.k(vf6Var3, l.longValue());
                    vf6Var2.k(vf6Var4, l.longValue());
                    if (l.longValue() <= 0 && !B && arrayList.size() != i4) {
                        StringBuilder sb = new StringBuilder();
                        int size = arrayList.size();
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 < size) {
                                Object obj = arrayList.get(i5);
                                i5++;
                                it = it3;
                                it2 = it4;
                                TLRPC.User V1 = V1(Long.valueOf(((fa7) obj).b));
                                if (V1 != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(X1(V1));
                                    i6++;
                                }
                                i3 = i6;
                                if (i3 == 2) {
                                    break;
                                }
                                i6 = i3;
                                it3 = it;
                                it4 = it2;
                            } else {
                                it = it3;
                                it2 = it4;
                                i3 = i6;
                                break;
                            }
                        }
                        if (sb.length() != 0) {
                            if (i3 == 1) {
                                a0 = k96.a0("IsTypingGroup", null, 2131748896, sb.toString());
                            } else if (arrayList.size() > 2) {
                                try {
                                    a0 = String.format(k96.J0(arrayList.size() - 2, "AndMoreTypingGroup"), sb.toString(), Integer.valueOf(arrayList.size() - 2));
                                } catch (Exception unused) {
                                    a0 = "LOC_ERR: AndMoreTypingGroup";
                                }
                            } else {
                                a0 = k96.a0("AreTypingGroup", null, 2131754118, sb.toString());
                            }
                            str = a0;
                            i2 = 0;
                        } else {
                            i2 = 0;
                            str = null;
                        }
                    } else {
                        it = it3;
                        it2 = it4;
                        fa7 fa7Var = (fa7) arrayList.get(0);
                        TLRPC.User V12 = V1(Long.valueOf(fa7Var.b));
                        if (V12 != null) {
                            if (l.longValue() < 0 && !B) {
                                z = true;
                            } else {
                                z = false;
                            }
                            TLRPC.SendMessageAction sendMessageAction = fa7Var.c;
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                                if (z) {
                                    M06 = k96.a0("IsRecordingAudio", null, 2131748907, X1(V12));
                                } else {
                                    M06 = k96.M0(2131746158, null);
                                }
                                str = M06;
                                i = 1;
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                    if (z) {
                                        M05 = k96.a0("IsRecordingRound", null, 2131748906, X1(V12));
                                    } else {
                                        M05 = k96.M0(2131746157, null);
                                    }
                                    str = M05;
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                    if (z) {
                                        str = k96.a0("IsSendingVideo", null, 2131748898, X1(V12));
                                    } else {
                                        str = k96.M0(2131745383, null);
                                    }
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                        if (z) {
                                            M04 = k96.a0("IsSendingAudio", null, 2131748902, X1(V12));
                                        } else {
                                            M04 = k96.M0(2131745390, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                        if (z) {
                                            M04 = k96.a0("IsSendingVideo", null, 2131748898, X1(V12));
                                        } else {
                                            M04 = k96.M0(2131745383, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                        if (z) {
                                            M04 = k96.a0("IsRecordingVideo", null, 2131748905, X1(V12));
                                        } else {
                                            M04 = k96.M0(2131746154, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                        if (z) {
                                            M04 = k96.a0("IsSendingFile", null, 2131748901, X1(V12));
                                        } else {
                                            M04 = k96.M0(2131745389, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                        if (z) {
                                            M04 = k96.a0("IsSendingPhoto", null, 2131748899, X1(V12));
                                        } else {
                                            M04 = k96.M0(2131745386, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                        if (z) {
                                            M03 = k96.a0("IsSendingGame", null, 2131748900, X1(V12));
                                        } else {
                                            M03 = k96.M0(2131745388, null);
                                        }
                                        i = 3;
                                        str = M03;
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                            if (z) {
                                                M0 = k96.a0("IsSelectingLocation", null, 2131748903, X1(V12));
                                            } else {
                                                M0 = k96.M0(2131745454, null);
                                            }
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                            if (z) {
                                                M0 = k96.a0("IsSelectingContact", null, 2131748904, X1(V12));
                                            } else {
                                                M0 = k96.M0(2131745455, null);
                                            }
                                        } else {
                                            if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                                String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                                if (z) {
                                                    M02 = k96.a0("IsEnjoyngAnimations", null, 2131748908, X1(V12), str2);
                                                } else {
                                                    M02 = k96.a0("EnjoyngAnimations", null, 2131751113, str2);
                                                }
                                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                                if (z) {
                                                    M02 = k96.a0("IsChoosingSticker", null, 2131748909, X1(V12));
                                                } else {
                                                    M02 = k96.M0(2131752094, null);
                                                }
                                            } else if (z) {
                                                M0 = k96.a0("IsTypingGroup", null, 2131748896, X1(V12));
                                            } else {
                                                M0 = k96.M0(2131743679, null);
                                            }
                                            str = M02;
                                            i = 5;
                                        }
                                        str = M0;
                                        i = 0;
                                    }
                                    str = M04;
                                    i = 2;
                                }
                                i = 4;
                            }
                            i2 = i;
                        } else {
                            it3 = it;
                            it4 = it2;
                            i4 = 1;
                        }
                    }
                    if (str != null) {
                        Paint paint = bkb.F0;
                        if (paint == null) {
                            paint = new Paint();
                            paint.setTypeface(gl.o());
                            paint.setTextSize(gl.L(14.0f));
                        }
                        vf6Var3.k(vu3.m(str, paint.getFontMetricsInt(), false, null, 0), num.intValue());
                        vf6Var4.k(Integer.valueOf(i2), num.intValue());
                    }
                    it3 = it;
                    it4 = it2;
                    i4 = 1;
                }
            } else {
                this.c0 = vf6Var.m();
                gl.d3(new b57(this, vf6Var, vf6Var2, (byte) 1));
                return;
            }
        }
    }

    public final void t(long j) {
        TLRPC.Chat K0;
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null) {
                user = V1;
                K0 = null;
            } else {
                return;
            }
        } else {
            K0 = K0(Long.valueOf(-j));
            if (K0 == null) {
                return;
            }
        }
        LongSparseIntArray longSparseIntArray = this.x0;
        if (longSparseIntArray.indexOfKey(j) >= 0) {
            return;
        }
        longSparseIntArray.put(j, 1);
        if (user != null) {
            if (user.bot) {
                getMediaDataController().O1(j);
            } else {
                getMediaDataController().Q1(j);
            }
        }
        int i = this.y0;
        if (i >= 0) {
            this.y0 = i + 1;
        }
        getNotificationCenter().k(kk7.f0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.id = l1(user);
        } else {
            tL_contacts_block.id = j1(K0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new ce2((byte) 0));
    }

    public final boolean t0(t97 t97Var) {
        if (t97Var != null) {
            if ((t97Var.g & 64) == 0) {
                if (this.n4.contains(Integer.valueOf(t97Var.a))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void t1(final long j, final long j2, final int i, final boolean z, final vs2 vs2Var) {
        String str;
        String str2;
        if (z) {
            str = "reaction_mentions";
            str2 = "reaction_mentions_topics";
        } else {
            str = "poll_votes_mentions";
            str2 = "poll_votes_mentions_topics";
        }
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = !z;
        getMessagesStorage().a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.l77.run():void");
            }
        });
    }

    public final boolean t2() {
        gr grVar = this.k4;
        if (grVar.X2.f() != 0 && grVar.Y2.f() != 0) {
            return true;
        }
        return false;
    }

    public final void t3(long j, long j2) {
        long j3;
        ArrayList l;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        pub pubVar = this.g4;
        if (i == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((r2(j) || y2(j)) && (l = pubVar.l((j3 = -j))) != null) {
                for (int i2 = 0; i2 < l.size(); i2++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i2);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                pubVar.y(j3, true);
            }
        } else {
            long j4 = -j;
            TLRPC.TL_forumTopic f = pubVar.f(j4, j2);
            if (f != null && f.unread_poll_votes_count > 0) {
                f.unread_poll_votes_count = 0;
                pubVar.y(j4, true);
            }
        }
        getMessagesStorage().e2(0, j, j2, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = h1(j);
        if (i != 0 && !x2(j)) {
            tL_messages_readPollVotes.top_msg_id = (int) j2;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new ce2((byte) 0));
        kk7.f(this.currentAccount).k(2, 1048576);
    }

    public final void t4(k27 k27Var) {
        long j;
        if (k27Var == null) {
            return;
        }
        ad7 messagesStorage = getMessagesStorage();
        long B0 = k27.B0(k27Var.k);
        int P0 = k27Var.P0();
        messagesStorage.getClass();
        vf6 vf6Var = new vf6(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        vf6Var.k(arrayList, B0);
        messagesStorage.H(new mn6((Object) messagesStorage, (Object) vf6Var, false, (byte) 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = h1(k27.B0(k27Var.k));
        TLRPC.Message message = k27Var.k;
        if (message != null) {
            j = message.ephemeralReceiverBotId;
        } else {
            j = 0;
        }
        tL_deleteMessage.receiver_id = m1(j);
        tL_deleteMessage.id = k27Var.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new np0((byte) 0));
    }

    public final boolean t5(ArrayList arrayList, long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ConcurrentHashMap concurrentHashMap = this.W;
        if (i > 0) {
            if (((ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j))) != null) {
                concurrentHashMap.remove(Long.valueOf(j));
                return true;
            }
        } else if (i < 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                k27 k27Var = (k27) obj;
                if (k27Var.p3() && !arrayList2.contains(Long.valueOf(k27Var.k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(k27Var.k.from_id.user_id));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j));
            if (concurrentHashMap2 != null) {
                ArrayList arrayList3 = null;
                z = false;
                for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    int i3 = 0;
                    while (i3 < arrayList4.size()) {
                        if (arrayList2.contains(Long.valueOf(((fa7) arrayList4.get(i3)).b))) {
                            arrayList4.remove(i3);
                            i3--;
                            if (arrayList4.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(num);
                            }
                            z = true;
                        }
                        i3++;
                    }
                }
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        concurrentHashMap2.remove(arrayList3.get(i4));
                    }
                    if (concurrentHashMap2.isEmpty()) {
                        concurrentHashMap.remove(Long.valueOf(j));
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final c5a u(long j) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull L0 = L0(j);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (L0 != null && (arrayList = L0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long n = cf3.n(communityPeer2.peer);
                TLRPC.Chat K0 = K0(Long.valueOf(-n));
                TLRPC.User V1 = V1(Long.valueOf(n));
                if (K0 != null || V1 != null) {
                    arrayList2.add(new s97(K0, Q0(n), V1, communityPeer2));
                }
            }
        }
        c5a c5aVar = new c5a((byte) 8);
        ArrayList arrayList3 = (ArrayList) c5aVar.d;
        ArrayList arrayList4 = (ArrayList) c5aVar.e;
        ArrayList arrayList5 = (ArrayList) c5aVar.c;
        ArrayList arrayList6 = (ArrayList) c5aVar.b;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            s97 s97Var = (s97) obj;
            int c = no2.c(s97Var.b, s97Var.d, s97Var.c, s97Var.a);
            if (c == 1) {
                arrayList6.add(s97Var);
            } else if (c == 2) {
                arrayList5.add(s97Var);
            } else if (c == 4) {
                arrayList4.add(s97Var);
            } else if (c == 3) {
                arrayList3.add(s97Var);
            }
        }
        c77 c77Var = this.t4;
        Collections.sort(arrayList6, c77Var);
        Collections.sort(arrayList5, c77Var);
        Collections.sort(arrayList3, c77Var);
        Collections.sort(arrayList4, c77Var);
        return c5aVar;
    }

    public final ArrayList u0(ArrayList arrayList) {
        if (!E3()) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.TL_messages_stickerSet v0 = q1(this.currentAccount).v0((TLRPC.TL_messages_stickerSet) arrayList.get(i));
            if (v0 == null) {
                arrayList.remove(i);
                i--;
            } else {
                arrayList.set(i, v0);
            }
            i++;
        }
        return arrayList;
    }

    public final boolean u2(long j) {
        ArrayList arrayList = this.I0;
        if (!arrayList.isEmpty() && arrayList.contains(Long.valueOf(j))) {
            return true;
        }
        return false;
    }

    public final void u3(long j, long j2) {
        long j3;
        ArrayList l;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        pub pubVar = this.g4;
        if (i == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((r2(j) || y2(j)) && (l = pubVar.l((j3 = -j))) != null) {
                for (int i2 = 0; i2 < l.size(); i2++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i2);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                pubVar.y(j3, true);
            }
        } else {
            long j4 = -j;
            TLRPC.TL_forumTopic f = pubVar.f(j4, j2);
            if (f != null && f.unread_reactions_count > 0) {
                f.unread_reactions_count = 0;
                pubVar.y(j4, true);
            }
        }
        getMessagesStorage().f2(0, j, j2, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = h1(j);
        if (i != 0) {
            if (x2(j)) {
                tL_messages_readReactions.saved_peer_id = h1(j2);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j2;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new ce2((byte) 0));
        kk7.f(this.currentAccount).k(2, 1048576);
    }

    public final boolean u4() {
        String str = this.k4.e0.f;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
                return false;
            } else if (str.equals("premium")) {
                return getUserConfig().p();
            } else {
                return false;
            }
        } else if (str.equals("enabled")) {
            return true;
        } else {
            return false;
        }
    }

    public final void u5(long j, String str, long j2) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        K0(Long.valueOf(j));
        vf6 vf6Var = (vf6) this.q1.f(j);
        if (vf6Var != null && (channelParticipant = (TLRPC.ChannelParticipant) vf6Var.f(j2)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null && L0.participants != null) {
            for (int i = 0; i < L0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                chatParticipant.setRank(j2, str2);
                if (chatParticipant.user_id == j2) {
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
        kk7.f(this.currentAccount).k(2, 0);
        kk7.f(this.currentAccount).k(kk7.Y3, Long.valueOf(j), Long.valueOf(j2), str2);
        ad7 Y = ad7.Y(this.currentAccount);
        Y.a.c(new sb7(Y, -j, j2, str2, (byte) 0));
    }

    public final boolean v(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!cf3.B(dialog.id)) {
                boolean x = cf3.x(dialog);
                long j = dialog.id;
                if (x) {
                    TLRPC.Chat K0 = K0(Long.valueOf(-j));
                    if (!hc2.X(this.currentAccount, K0)) {
                        if (K0 != null && K0.megagroup) {
                            if (K0.gigagroup && !hc2.N(K0)) {
                                return false;
                            }
                            return true;
                        } else if (!hc2.N(K0) || !hc2.w(5, K0)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                } else if (j > 0) {
                    if (hc2.v0(this.currentAccount, V1(Long.valueOf(j)))) {
                        return false;
                    }
                    return true;
                } else {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final TLRPC.TL_messages_stickerSet v0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (E3() && tL_messages_stickerSet != null) {
            int i = 0;
            for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                try {
                    if (k27.W3(tL_messages_stickerSet.documents.get(i2))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (k27.W3(tL_messages_stickerSet2.documents.get(i))) {
                                    tL_messages_stickerSet2.documents.remove(i);
                                    tL_messages_stickerSet2.packs.remove(i);
                                    i--;
                                    if (tL_messages_stickerSet2.documents.isEmpty()) {
                                        return null;
                                    }
                                }
                                i++;
                            } catch (Exception e) {
                                e = e;
                                tL_messages_stickerSet = tL_messages_stickerSet2;
                                e.printStackTrace();
                                return tL_messages_stickerSet;
                            }
                        }
                        return tL_messages_stickerSet2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return tL_messages_stickerSet;
        }
        return tL_messages_stickerSet;
    }

    public final Long v1() {
        if (this.O3 == null && !this.b5) {
            this.b5 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.O3;
    }

    public final boolean v2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (l7c.C(user)) {
                return !hc2.r0(chat);
            }
            TLRPC.ChatFull L0 = L0(chat.id);
            if (L0 != null && (chatParticipants = L0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i);
                    if (chatParticipant != null && chatParticipant.user_id == user.id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v3(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (tL_chatAdminRights != null) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = null;
            if (chat != null && user != null) {
                if (l7c.C(user)) {
                    tL_chatAdminRights2 = chat.admin_rights;
                } else {
                    TLRPC.ChatFull L0 = L0(chat.id);
                    if (L0 != null && (chatParticipants = L0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            TLRPC.ChatParticipant chatParticipant = arrayList.get(i);
                            if (chatParticipant != null && chatParticipant.user_id == user.id) {
                                if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                                    tL_chatAdminRights2 = channelParticipant.admin_rights;
                                }
                            } else {
                                i++;
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

    public final void v4(Object obj, TLRPC.Document document) {
        if (obj != null && k27.s3(document, false)) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_messages_saveGif.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_saveGif.unsave = false;
            getConnectionsManager().sendRequest(tL_messages_saveGif, new k45(this, obj, tL_messages_saveGif, (byte) 19));
        }
    }

    public final void v5(long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na7.v5(long):void");
    }

    public final void w(long j, int i, long j2) {
        vf6 vf6Var;
        vf6 vf6Var2;
        if (i >= 0) {
            vf6[] vf6VarArr = this.Z;
            if (i < vf6VarArr.length && (vf6Var = vf6VarArr[i]) != null && (vf6Var2 = (vf6) vf6Var.f(j)) != null) {
                vf6Var2.l(j2);
                if (vf6Var2.m() == 0) {
                    vf6Var.l(j);
                }
            }
        }
    }

    public final TLRPC.Peer w1(long j) {
        if (j < 0) {
            long j2 = -j;
            if (hc2.T(K0(Long.valueOf(j2)))) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_peerChannel.channel_id = j2;
                return tL_peerChannel;
            }
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_peerChat.chat_id = j2;
            return tL_peerChat;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_peerUser.user_id = j;
        return tL_peerUser;
    }

    public final boolean w2(TLRPC.Dialog dialog, long j) {
        long j2;
        HashMap hashMap = this.o4;
        if (!hashMap.isEmpty()) {
            if (!hashMap.containsKey(Long.valueOf(dialog.id)) && !hashMap.containsKey(Long.valueOf(j))) {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    for (Long l : hashMap.keySet()) {
                        if (l.longValue() > 0) {
                            TLRPC.User V1 = V1(l);
                            if (V1 != null) {
                                j2 = V1.linked_community_id;
                            }
                            j2 = 0;
                        } else {
                            TLRPC.Chat K0 = K0(Long.valueOf(-l.longValue()));
                            if (K0 != null) {
                                j2 = K0.linked_community_id;
                            }
                            j2 = 0;
                        }
                        if (j2 != 0 && (-j2) == dialog.id) {
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

    public final void w4(long j, TLRPC.PeerSettings peerSettings) {
        boolean z;
        int i;
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.W3;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i2 = 2;
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(ls6.n(j, "dialog_botid"), peerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j, peerSettings.business_bot_manage_url);
            String str = "dialog_botflags" + j;
            boolean z2 = peerSettings.business_bot_paused;
            if (peerSettings.business_bot_can_reply) {
                i = 2;
            } else {
                i = 0;
            }
            edit.putInt(str, (z2 ? 1 : 0) + i);
        } else {
            edit.remove("dialog_botid" + j).remove("dialog_boturl" + j).remove("dialog_botflags" + j);
        }
        edit.putLong(ls6.n(j, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        int i3 = sharedPreferences.getInt("dialog_bar_vis3" + j, 0);
        int i4 = kk7.P0;
        if (i3 == 3) {
            edit.apply();
            getNotificationCenter().k(i4, Long.valueOf(j));
            return;
        }
        if (peerSettings.flags == 0) {
            z = true;
        } else {
            z = false;
        }
        if (w01.a) {
            StringBuilder o = ug8.o(j, "peer settings loaded for ", " add = ");
            o.append(peerSettings.add_contact);
            o.append(" block = ");
            o.append(peerSettings.block_contact);
            o.append(" spam = ");
            o.append(peerSettings.report_spam);
            o.append(" share = ");
            o.append(peerSettings.share_contact);
            o.append(" geo = ");
            o.append(peerSettings.report_geo);
            o.append(" hide = ");
            o.append(z);
            o.append(" distance = ");
            o.append(peerSettings.geo_distance);
            o.append(" invite = ");
            o.append(peerSettings.invite_members);
            fa4.b(o.toString());
        }
        String n = ls6.n(j, "dialog_bar_vis3");
        if (z) {
            i2 = 1;
        }
        edit.putInt(n, i2);
        edit.putBoolean("dialog_bar_share" + j, peerSettings.share_contact);
        edit.putBoolean("dialog_bar_report" + j, peerSettings.report_spam);
        edit.putBoolean("dialog_bar_add" + j, peerSettings.add_contact);
        edit.putBoolean("dialog_bar_block" + j, peerSettings.block_contact);
        edit.putBoolean("dialog_bar_exception" + j, peerSettings.need_contacts_exception);
        edit.putBoolean("dialog_bar_location" + j, peerSettings.report_geo);
        edit.putBoolean("dialog_bar_archived" + j, peerSettings.autoarchived);
        edit.putBoolean("dialog_bar_invite" + j, peerSettings.invite_members);
        edit.putString("dialog_bar_chat_with_admin_title" + j, peerSettings.request_chat_title);
        edit.putBoolean("dialog_bar_chat_with_channel" + j, peerSettings.request_chat_broadcast);
        edit.putInt("dialog_bar_chat_with_date" + j, peerSettings.request_chat_date);
        if (sharedPreferences.getInt("dialog_bar_distance" + j, -1) != -2) {
            if ((peerSettings.flags & 64) != 0) {
                edit.putInt(ls6.n(j, "dialog_bar_distance"), peerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j);
            }
        }
        if (j == getUserConfig().e()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        this.g1.k(peerSettings, j);
        getNotificationCenter().k(i4, Long.valueOf(j));
    }

    public final void w5(HashSet hashSet) {
        v5(0L);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v5(((Long) it.next()).longValue());
        }
    }

    public final void x(long j, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, iu4 iu4Var) {
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
                int i = tL_inputChatUploadedPhoto.flags;
                tL_inputChatUploadedPhoto.video_start_ts = d;
                tL_inputChatUploadedPhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_inputChatUploadedPhoto.video_emoji_markup = videoSize;
                tL_inputChatUploadedPhoto.flags |= 8;
            }
            inputChatPhoto = tL_inputChatUploadedPhoto;
        }
        if (hc2.S(this.currentAccount, j)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = f1(j);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new p77(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j, iu4Var), 64);
    }

    public final String x1(long j) {
        return y1(j, false);
    }

    public final boolean x2(long j) {
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (K0 != null && K0.monoforum) {
            return true;
        }
        return false;
    }

    public final void x3(t97 t97Var) {
        for (int i = 0; i < 2; i++) {
            if (this.N[i] == t97Var) {
                Y4(null);
                getNotificationCenter().k(kk7.r, Boolean.TRUE);
                return;
            }
        }
    }

    public final boolean x4(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList arrayList) {
        char c;
        StringBuilder sb = new StringBuilder();
        sparseIntArray.clear();
        int i = 0;
        while (true) {
            String str2 = null;
            int i2 = 1;
            if (i < arrayList.size()) {
                if (arrayList.get(i) instanceof TLRPC.TL_jsonString) {
                    str2 = ((TLRPC.TL_jsonString) arrayList.get(i)).value;
                }
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2145993328:
                            if (str2.equals("animated_userpics")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -2080028929:
                            if (str2.equals("infinite_reactions")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -2022719725:
                            if (str2.equals("stories__caption")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1975141450:
                            if (str2.equals("away_message")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1953490480:
                            if (str2.equals("business_hours")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1952597715:
                            if (str2.equals("business_intro")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1949982086:
                            if (str2.equals("business_links")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1924078036:
                            if (str2.equals("stories__quality")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1919626711:
                            if (str2.equals("stories__save_stories_to_gallery")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1884266413:
                            if (str2.equals("stories")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1833928446:
                            if (str2.equals("effects")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1777612460:
                            if (str2.equals("business_location")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1761847571:
                            if (str2.equals("peer_colors")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1755514268:
                            if (str2.equals("voice_to_text")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1529105743:
                            if (str2.equals("wallpapers")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1516580016:
                            if (str2.equals("message_privacy")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1425144150:
                            if (str2.equals("animated_emoji")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497630:
                            if (str2.equals("translations")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1146830912:
                            if (str2.equals("business")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1040323278:
                            if (str2.equals("no_ads")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1023650261:
                            if (str2.equals("more_upload")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case -969043445:
                            if (str2.equals("emoji_status")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case -730864243:
                            if (str2.equals("profile_badge")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case -448825858:
                            if (str2.equals("faster_download")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case -294265343:
                            if (str2.equals("greeting_message")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case -165039170:
                            if (str2.equals("premium_stickers")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case -96210874:
                            if (str2.equals("double_limits")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3565638:
                            if (str2.equals("todo")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 98352451:
                            if (str2.equals("gifts")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110781770:
                            if (str2.equals("folder_tags")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 234735554:
                            if (str2.equals("stories__expiration_durations")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case 388416338:
                            if (str2.equals("stories__stealth_mode")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case 480338102:
                            if (str2.equals("quick_replies")) {
                                c = ' ';
                                break;
                            }
                            c = 65535;
                            break;
                        case 622623867:
                            if (str2.equals("ai_compose")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case 629542059:
                            if (str2.equals("business_bots")) {
                                c = '\"';
                                break;
                            }
                            c = 65535;
                            break;
                        case 705083174:
                            if (str2.equals("stories__priority_order")) {
                                c = '#';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1054743185:
                            if (str2.equals("pm_noforwards")) {
                                c = '$';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1080006662:
                            if (str2.equals("stories__links_and_formatting")) {
                                c = '%';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1219849581:
                            if (str2.equals("advanced_chat_management")) {
                                c = '&';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1438966047:
                            if (str2.equals("stories__permanent_views_history")) {
                                c = '\'';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1488814760:
                            if (str2.equals("rich_formatting")) {
                                c = '(';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1537309393:
                            if (str2.equals("saved_tags")) {
                                c = ')';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1832801148:
                            if (str2.equals("app_icons")) {
                                c = '*';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2013274756:
                            if (str2.equals("last_seen")) {
                                c = '+';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            i2 = 7;
                            break;
                        case 1:
                            i2 = 4;
                            break;
                        case 2:
                            i2 = 21;
                            break;
                        case 3:
                            i2 = 33;
                            break;
                        case 4:
                            i2 = 30;
                            break;
                        case 5:
                            i2 = 36;
                            break;
                        case 6:
                            i2 = 37;
                            break;
                        case 7:
                            i2 = 25;
                            break;
                        case '\b':
                            i2 = 18;
                            break;
                        case '\t':
                            i2 = 14;
                            break;
                        case '\n':
                            i2 = 38;
                            break;
                        case 11:
                            i2 = 29;
                            break;
                        case '\f':
                            i2 = 23;
                            break;
                        case '\r':
                            i2 = 8;
                            break;
                        case 14:
                            i2 = 22;
                            break;
                        case 15:
                            i2 = 27;
                            break;
                        case 16:
                            i2 = 11;
                            break;
                        case 17:
                            i2 = 13;
                            break;
                        case 18:
                            i2 = 28;
                            break;
                        case 19:
                            i2 = 3;
                            break;
                        case 20:
                            break;
                        case 21:
                            i2 = 12;
                            break;
                        case 22:
                            i2 = 6;
                            break;
                        case 23:
                            i2 = 2;
                            break;
                        case 24:
                            i2 = 32;
                            break;
                        case 25:
                            i2 = 5;
                            break;
                        case 26:
                            i2 = 0;
                            break;
                        case 27:
                            i2 = 39;
                            break;
                        case 28:
                            i2 = 40;
                            break;
                        case 29:
                            i2 = 35;
                            break;
                        case 30:
                            i2 = 17;
                            break;
                        case 31:
                            i2 = 15;
                            break;
                        case ' ':
                            i2 = 31;
                            break;
                        case '!':
                            i2 = 42;
                            break;
                        case '\"':
                            i2 = 34;
                            break;
                        case '#':
                            i2 = 20;
                            break;
                        case '$':
                            i2 = 41;
                            break;
                        case '%':
                            i2 = 19;
                            break;
                        case '&':
                            i2 = 9;
                            break;
                        case '\'':
                            i2 = 16;
                            break;
                        case '(':
                            i2 = 43;
                            break;
                        case ')':
                            i2 = 24;
                            break;
                        case '*':
                            i2 = 10;
                            break;
                        case '+':
                            i2 = 26;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    if (i2 >= 0) {
                        sparseIntArray.put(i2, i);
                        if (sb.length() > 0) {
                            sb.append('_');
                        }
                        sb.append(i2);
                    }
                }
                i++;
            } else {
                int length = sb.length();
                SharedPreferences sharedPreferences = this.X3;
                if (length > 0) {
                    String sb2 = sb.toString();
                    boolean z = !sb2.equals(sharedPreferences.getString(str, null));
                    editor.putString(str, sb2);
                    return z;
                }
                editor.remove(str);
                if (sharedPreferences.getString(str, null) == null) {
                    return false;
                }
                return true;
            }
        }
    }

    public final boolean x5(long j, h19 h19Var, boolean z) {
        long j2;
        int i;
        if (this.O4 == null) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 == 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if (i2 != 1 || j2 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.O4.f(j2);
                if (tL_messages_savedReactionsTags == null) {
                    if (j2 != 0) {
                        vf6 vf6Var = this.O4;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        vf6Var.k(tL_messages_savedReactionsTags, j2);
                    }
                }
                int i3 = 0;
                boolean z3 = false;
                while (i3 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i3);
                    if (h19Var.f(tL_savedReactionTag.reaction)) {
                        int i4 = tL_savedReactionTag.count;
                        if (z) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        int max = Math.max(0, i + i4);
                        tL_savedReactionTag.count = max;
                        if (max <= 0) {
                            tL_messages_savedReactionsTags.tags.remove(i3);
                            i3--;
                        } else if (max == i4) {
                            z3 = true;
                        }
                        z2 = true;
                        z3 = true;
                    }
                    i3++;
                }
                if (!z3 && z) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                    tL_savedReactionTag2.reaction = h19Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void y(long j, String str, zm2 zm2Var) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (hc2.S(this.currentAccount, j)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = f1(j);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new rv3(this, zm2Var, (byte) 29), 64);
    }

    public final void y0() {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        int i = messagesStorage.w;
        ad7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.G();
        int i2 = messagesStorage2.r;
        ad7 messagesStorage3 = getMessagesStorage();
        messagesStorage3.G();
        int i3 = messagesStorage3.n;
        ad7 messagesStorage4 = getMessagesStorage();
        messagesStorage4.G();
        r4(true, i, i2, i3, messagesStorage4.s);
        im7 notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        im7.l0.c(new wl7(notificationsController, (byte) 9));
    }

    public final String y1(long j, boolean z) {
        String str;
        if (j >= 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (z) {
                return gl.C2(gl.A2(l7c.k(V1, true)));
            }
            return gl.C2(gl.A2(l7c.q(V1)));
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (K0 == null) {
            str = "";
        } else {
            str = K0.title;
        }
        return gl.C2(gl.A2(str));
    }

    public final boolean y2(long j) {
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (hc2.p0(K0) && hc2.A(this.currentAccount, K0, 24)) {
            return true;
        }
        return false;
    }

    public final void y3(d dVar, TLRPC.User user, String str, int i, c01 c01Var, boolean z, boolean z2) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (c01Var != null) {
            c01Var.b = new il1(zArr, (byte) 6);
            c01Var.d();
        }
        d77 d77Var = new d77(this, dVar, c01Var, zArr, user, str, z, z2, r9);
        hq6 mediaDataController = getMediaDataController();
        long j = user.id;
        HashMap hashMap = mediaDataController.y1;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hashMap.get(j + "_" + j);
        TL_bots.BotInfo[] botInfoArr = {botInfo};
        if (user.bot_has_main_app) {
            d77Var.run();
        } else if (botInfo == null) {
            hq6 mediaDataController2 = getMediaDataController();
            long j2 = user.id;
            mediaDataController2.I0(j2, j2, false, i, new e77(this, zArr, botInfoArr, user, i, d77Var));
        } else {
            d77Var.run();
        }
    }

    public final void y4(long j, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().a.c(new go6(this, j, tL_messages_savedReactionsTags, (byte) 7));
    }

    public final void y5(TLObject tLObject, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = this.e;
            concurrentHashMap.remove(str);
            if (z) {
                concurrentHashMap.put(str.toLowerCase(), tLObject);
            }
        }
    }

    public final void z() {
        if (!this.h0 && M1().h.isEmpty()) {
            k4(1);
        } else {
            boolean[] zArr = {false};
            o0(1, zArr);
            if (zArr[0]) {
                Y4(null);
                getNotificationCenter().k(kk7.r, new Object[0]);
            }
        }
        getNotificationCenter().k(2, 0);
    }

    public final void z0(long j, boolean z) {
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        if (K0 != null && hc2.S(this.currentAccount, j)) {
            if ((!hc2.r0(K0) || z) && !K0.creator && !hc2.p0(K0)) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.flags = 256;
                int i = getUserConfig().i();
                tL_messageService.id = i;
                tL_messageService.local_id = i;
                if ((K0 instanceof TLRPC.TL_channel) && !z) {
                    tL_messageService.date = K0.date;
                } else {
                    tL_messageService.date = getConnectionsManager().getCurrentTime();
                }
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().e();
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_messageService.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j;
                tL_messageService.dialog_id = -j;
                tL_messageService.post = true;
                TLRPC.TL_messageActionChatAddUser tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatAddUser();
                tL_messageService.action = tL_messageActionChatAddUser;
                tL_messageActionChatAddUser.users.add(Long.valueOf(getUserConfig().e()));
                getUserConfig().u(false);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(tL_messageService);
                arrayList.add(new k27(this.currentAccount, tL_messageService, true, false));
                getMessagesStorage().g1(arrayList2, true, true, false, 0, false, 0, 0L);
                gl.d3(new m57(this, j, arrayList, (byte) 4));
            }
        }
    }

    public final TLRPC.PeerSettings z1(long j) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull W1 = W1(j);
        if (W1 != null && (peerSettings = W1.settings) != null) {
            return peerSettings;
        }
        return (TLRPC.PeerSettings) this.g1.f(j);
    }

    public final boolean z2(long j) {
        if (j > 0) {
            return J2(W1(j));
        }
        return k2(K0(Long.valueOf(-j)));
    }

    public final void z3(String str, final d dVar, final int i, final c01 c01Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        if (str != null && dVar != null) {
            TLObject a2 = a2(str);
            if (a2 instanceof TLRPC.User) {
                user = (TLRPC.User) a2;
                if (!user.min) {
                    chat = null;
                }
                user = null;
                chat = null;
            } else {
                if (a2 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) a2;
                    if (!chat2.min) {
                        chat = chat2;
                        user = null;
                    }
                }
                user = null;
                chat = null;
            }
            if (user != null) {
                A3(user, null, dVar, i);
            } else if (chat != null) {
                A3(null, chat, dVar, 1);
            } else if (dVar.getParentActivity() != null) {
                final hd[] hdVarArr = {new hd(3, null, dVar.getParentActivity())};
                final boolean[] zArr = {false};
                getMessagesController().Y1().a(str, null, new p8c() {
                    @Override
                    public final void a(Object obj) {
                        Long l = (Long) obj;
                        c01 c01Var2 = c01Var;
                        hd[] hdVarArr2 = hdVarArr;
                        try {
                            if (c01Var2 != null) {
                                c01Var2.b();
                            } else {
                                hdVarArr2[0].dismiss();
                            }
                        } catch (Exception unused) {
                        }
                        hdVarArr2[0] = null;
                        d dVar2 = dVar;
                        dVar2.setVisibleDialog(null);
                        if (!zArr[0]) {
                            if (l != null) {
                                int i2 = (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1));
                                na7 na7Var = na7.this;
                                if (i2 < 0) {
                                    na7Var.A3(null, na7Var.K0(Long.valueOf(-l.longValue())), dVar2, 1);
                                } else {
                                    na7Var.A3(na7Var.V1(l), null, dVar2, i);
                                }
                            } else if (dVar2.getParentActivity() != null) {
                                try {
                                    if (dVar2 instanceof mu1) {
                                        ((mu1) dVar2).Db();
                                    }
                                    u21.b0(dVar2).t(k96.M0(2131747942, null), null).j();
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                            }
                        }
                    }
                });
                if (c01Var != null) {
                    c01Var.b = new il1(zArr, (byte) 5);
                    c01Var.d();
                    return;
                }
                gl.e3(new lo6(hdVarArr, zArr, dVar, (byte) 13), 500L);
            }
        }
    }

    public final void z4(akb akbVar, zjb zjbVar, boolean z, boolean z2) {
        TLRPC.TL_theme tL_theme;
        if (zjbVar != null) {
            tL_theme = zjbVar.r;
        } else {
            tL_theme = akbVar.G;
        }
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z2;
            getConnectionsManager().sendRequest(savetheme, new ce2((byte) 0));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z2) {
            f2(akbVar, zjbVar, z);
        }
    }

    public final void z5(boolean z, boolean z2) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z;
            tL_webBrowserSettings.display_close_button = z2;
            V4(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z;
        updatewebbrowsersettings.display_close_button = z2;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new hc((byte) 0), new k67(this, (byte) 1));
    }
}
