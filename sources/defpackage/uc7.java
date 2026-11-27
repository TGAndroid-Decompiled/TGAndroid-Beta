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
import j$.util.DesugarCollections;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class uc7 extends rf0 implements fn7 {
    public static volatile long p5 = 0;
    public static volatile long q5 = 0;
    public static final int r5 = 1050111;
    public static final int s5 = 31;
    public static volatile uc7[] t5 = new uc7[4];
    public static final Object[] u5 = new Object[4];
    public final zh6 A0;
    public final HashMap A1;
    public final pg6 A2;
    public HashMap A3;
    public long A4;
    public final zh6 B0;
    public final zh6 B1;
    public final l87 B2;
    public HashMap B3;
    public final Set B4;
    public int C0;
    public final zh6 C1;
    public long C2;
    public boolean C3;
    public final boolean C4;
    public long D0;
    public final zh6 D1;
    public int D2;
    public boolean D3;
    public final byte D4;
    public final ArrayList E;
    public final SparseIntArray E0;
    public final zh6 E1;
    public byte E2;
    public lc7 E3;
    public final byte E4;
    public final ArrayList F;
    public final SparseIntArray F0;
    public final zh6 F1;
    public boolean F2;
    public lc7 F3;
    public ArrayList F4;
    public final ArrayList G;
    public ArrayList G0;
    public final zh6 G1;
    public String G2;
    public int G3;
    public final LongSparseIntArray G4;
    public final ArrayList H;
    public ArrayList H0;
    public final zh6 H1;
    public final zh6 H2;
    public int H3;
    public final LongSparseIntArray H4;
    public final ArrayList I;
    public final ArrayList I0;
    public final ArrayList I1;
    public final HashMap I2;
    public int I3;
    public final LongSparseIntArray I4;
    public final ArrayList J;
    public final SparseArray J0;
    public final zh6 J1;
    public String J2;
    public Set J3;
    public final zh6 J4;
    public final ArrayList K;
    public boolean K0;
    public final ArrayList K1;
    public unb K2;
    public Set K3;
    public final HashSet K4;
    public final ArrayList L;
    public boolean L0;
    public final HashMap L1;
    public kbc L2;
    public long L3;
    public boolean L4;
    public final ArrayList M;
    public final ArrayList M0;
    public boolean M1;
    public final sb7 M2;
    public Set M3;
    public TLRPC.TL_exportedContactToken M4;
    public final ac7[] N;
    public final zh6 N0;
    public int N1;
    public String N2;
    public long N3;
    public HashMap N4;
    public int O;
    public final LongSparseLongArray O0;
    public zh6 O1;
    public int O2;
    public Long O3;
    public HashSet O4;
    public final ConcurrentHashMap P;
    public final LongSparseIntArray P0;
    public zh6 P1;
    public final byte P2;
    public boolean P3;
    public zh6 P4;
    public final ConcurrentHashMap Q;
    public final zh6 Q0;
    public pa7 Q1;
    public int Q2;
    public boolean Q3;
    public boolean Q4;
    public final zh6 R;
    public final zh6 R0;
    public boolean R1;
    public int R2;
    public String R3;
    public boolean R4;
    public final zh6 S;
    public final zh6 S0;
    public final SparseIntArray S1;
    public int S2;
    public HashSet S3;
    public final zh6 S4;
    public final zh6 T;
    public final zh6 T0;
    public final SparseBooleanArray T1;
    public int T2;
    public int[] T3;
    public final HashSet T4;
    public final LongSparseIntArray U;
    public final zh6 U0;
    public final SparseBooleanArray U1;
    public int U2;
    public long[] U3;
    public final l87 U4;
    public final SparseArray V;
    public final ArrayList V0;
    public final SparseBooleanArray V1;
    public boolean V2;
    public int[][] V3;
    public boolean V4;
    public final ConcurrentHashMap W;
    public final ArrayList W0;
    public boolean W1;
    public int W2;
    public final SharedPreferences W3;
    public TLRPC.messages_AvailableEffects W4;
    public zh6 X;
    public final ArrayList X0;
    public boolean X1;
    public final int X2;
    public final SharedPreferences X3;
    public final ub7 X4;
    public zh6 Y;
    public long Y0;
    public boolean Y1;
    public final int Y2;
    public final SharedPreferences Y3;
    public boolean Y4;
    public final zh6[] Z;
    public long Z0;
    public boolean Z1;
    public int Z2;
    public volatile boolean Z3;
    public ArrayList Z4;
    public int a;
    public final ConcurrentHashMap a0;
    public long a1;
    public boolean a2;
    public int a3;
    public int a4;
    public long a5;
    public final ConcurrentHashMap b;
    public final LongSparseIntArray b0;
    public final zh6 b1;
    public boolean b2;
    public int b3;
    public fu2 b4;
    public TL_account.contentSettings b5;
    public final ConcurrentHashMap c;
    public int c0;
    public final zh6 c1;
    public boolean c2;
    public int c3;
    public long c4;
    public boolean c5;
    public final ConcurrentHashMap d;
    public final SparseArray d0;
    public final zh6 d1;
    public long d2;
    public final int d3;
    public long d4;
    public final HashSet d5;
    public final ConcurrentHashMap e;
    public c6b e0;
    public final zh6 e1;
    public boolean e2;
    public final int e3;
    public l87 e4;
    public final HashSet e5;
    public final ConcurrentHashMap f;
    public nt9 f0;
    public VoIPDebugToSend f1;
    public TLRPC.TL_messages_peerDialogs f2;
    public int f3;
    public final ConcurrentHashMap f4;
    public final l87 f5;
    public u8c g0;
    public final zh6 g1;
    public TLRPC.messages_Dialogs g2;
    public int g3;
    public final qyb g4;
    public final LongSparseArray g5;
    public final HashMap h;
    public boolean h0;
    public final HashSet h1;
    public final SparseIntArray h2;
    public int h3;
    public final w51 h4;
    public final HashMap h5;
    public xg1 i0;
    public final LongSparseLongArray i1;
    public ArrayList i2;
    public String i3;
    public final a5c i4;
    public oc7 i5;
    public boolean j0;
    public final ConcurrentHashMap j1;
    public TLRPC.WebPage j2;
    public int j3;
    public jc j4;
    public boolean j5;
    public final zh6 k0;
    public final int k1;
    public int k2;
    public int k3;
    public final hr k4;
    public ArrayList k5;
    public final ArrayList l0;
    public final HashSet l1;
    public boolean l2;
    public boolean l3;
    public boolean l4;
    public TLRPC.EmojiGameInfo l5;
    public final ArrayList m0;
    public final HashSet m1;
    public int m2;
    public boolean m3;
    public final SparseArray m4;
    public final l87 m5;
    public final ArrayList n;
    public final ArrayList n0;
    public final HashSet n1;
    public boolean n2;
    public boolean n3;
    public final HashSet n4;
    public TL_account.TL_webBrowserSettings n5;
    public final ArrayList o0;
    public final HashSet o1;
    public int o2;
    public String o3;
    public final HashMap o4;
    public final vb7 o5;
    public final ArrayList p0;
    public final LongSparseLongArray p1;
    public int p2;
    public String p3;
    public final ArrayList p4;
    public final LongSparseIntArray q0;
    public final zh6 q1;
    public TLRPC.Dialog q2;
    public String q3;
    public ac7 q4;
    public final zh6 r;
    public final zh6 r0;
    public final LongSparseIntArray r1;
    public boolean r2;
    public int r3;
    public final j97 r4;
    public final ArrayList s;
    public final LongSparseIntArray s0;
    public final SparseIntArray s1;
    public long s2;
    public String s3;
    public final j97 s4;
    public final zh6 t0;
    public final zh6 t1;
    public int t2;
    public String t3;
    public final j97 t4;
    public final zh6 u0;
    public final zh6 u1;
    public String u2;
    public Set u3;
    public final vk6 u4;
    public final zh6 v0;
    public final zh6 v1;
    public String v2;
    public Set v3;
    public i61 v4;
    public final SparseArray w;
    public boolean w0;
    public final HashMap w1;
    public String w2;
    public TLRPC.TL_pendingSuggestion w3;
    public final l87 w4;
    public final zh6 x;
    public final LongSparseIntArray x0;
    public final zh6 x1;
    public boolean x2;
    public ArrayList x3;
    public final l87 x4;
    public final ArrayList y;
    public int y0;
    public final HashMap y1;
    public int y2;
    public HashSet y3;
    public final zh6 y4;
    public boolean z0;
    public final zh6 z1;
    public int z2;
    public String z3;
    public final zh6 z4;

    static {
        for (int i = 0; i < 4; i++) {
            u5[i] = new Object();
        }
    }

    public uc7(int i) {
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
        this.r = new zh6();
        this.s = new ArrayList();
        this.w = new SparseArray();
        this.x = new zh6();
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
        this.N = new ac7[2];
        this.O = Integer.MAX_VALUE;
        this.P = new ConcurrentHashMap(100, 1.0f, 2);
        this.Q = new ConcurrentHashMap(100, 1.0f, 2);
        this.R = new zh6();
        this.S = new zh6();
        this.T = new zh6();
        this.U = new LongSparseIntArray();
        this.V = new SparseArray();
        this.W = new ConcurrentHashMap(20, 1.0f, 2);
        this.X = new zh6();
        this.Y = new zh6();
        this.Z = new zh6[12];
        this.a0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.b0 = new LongSparseIntArray();
        this.d0 = new SparseArray();
        this.k0 = new zh6();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new LongSparseIntArray();
        this.r0 = new zh6();
        this.s0 = new LongSparseIntArray();
        this.t0 = new zh6();
        this.u0 = new zh6();
        this.v0 = new zh6();
        this.w0 = false;
        this.x0 = new LongSparseIntArray();
        this.y0 = -1;
        this.A0 = new zh6();
        this.B0 = new zh6();
        this.E0 = new SparseIntArray();
        this.F0 = new SparseIntArray();
        this.G0 = new ArrayList();
        this.H0 = null;
        this.I0 = new ArrayList();
        this.J0 = new SparseArray();
        this.M0 = new ArrayList();
        this.N0 = new zh6();
        this.O0 = new LongSparseLongArray();
        this.P0 = new LongSparseIntArray();
        this.Q0 = new zh6();
        this.R0 = new zh6();
        this.S0 = new zh6();
        this.T0 = new zh6();
        this.U0 = new zh6();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.b1 = new zh6();
        this.c1 = new zh6();
        this.d1 = new zh6();
        this.e1 = new zh6();
        this.g1 = new zh6();
        this.h1 = new HashSet();
        this.i1 = new LongSparseLongArray();
        this.j1 = new ConcurrentHashMap();
        this.k1 = ConnectionsManager.generateClassGuid();
        this.l1 = new HashSet();
        this.m1 = new HashSet();
        this.n1 = new HashSet();
        this.o1 = new HashSet();
        this.p1 = new LongSparseLongArray();
        this.q1 = new zh6();
        this.r1 = new LongSparseIntArray();
        this.s1 = new SparseIntArray();
        this.t1 = new zh6();
        this.u1 = new zh6();
        this.v1 = new zh6();
        this.w1 = new HashMap();
        this.x1 = new zh6();
        this.y1 = new HashMap();
        this.z1 = new zh6();
        this.A1 = new HashMap();
        this.B1 = new zh6();
        this.C1 = new zh6();
        this.D1 = new zh6();
        this.E1 = new zh6();
        this.F1 = new zh6();
        this.G1 = new zh6();
        this.H1 = new zh6();
        this.I1 = new ArrayList();
        this.J1 = new zh6();
        this.K1 = new ArrayList();
        this.L1 = new HashMap();
        this.S1 = new SparseIntArray();
        this.T1 = new SparseBooleanArray();
        this.U1 = new SparseBooleanArray();
        this.V1 = new SparseBooleanArray();
        this.Z1 = true;
        this.h2 = new SparseIntArray();
        this.i2 = new ArrayList();
        this.A2 = new pg6((byte) 4);
        this.B2 = new l87(this, (byte) 12);
        this.H2 = new zh6();
        this.I2 = new HashMap();
        this.M2 = new sb7(this);
        this.P2 = (byte) 100;
        this.x3 = new ArrayList();
        this.A3 = new HashMap();
        this.B3 = new HashMap();
        this.M3 = new HashSet();
        this.f4 = new ConcurrentHashMap();
        this.k4 = new hr(this.currentAccount);
        this.m4 = new SparseArray();
        HashSet hashSet = new HashSet();
        this.n4 = hashSet;
        this.o4 = new HashMap();
        this.p4 = new ArrayList();
        this.r4 = new j97(this, (byte) 0);
        this.s4 = new j97(this, (byte) 1);
        this.t4 = new j97(this, (byte) 2);
        this.u4 = new vk6(this, (byte) 17);
        this.w4 = new l87(this, (byte) 14);
        this.x4 = new l87(this, (byte) 22);
        this.y4 = new zh6();
        this.z4 = new zh6();
        this.B4 = DesugarCollections.synchronizedSet(new HashSet());
        this.C4 = true;
        this.D4 = (byte) 2;
        this.E4 = (byte) 3;
        this.F4 = new ArrayList();
        this.G4 = new LongSparseIntArray();
        this.H4 = new LongSparseIntArray();
        this.I4 = new LongSparseIntArray();
        this.J4 = new zh6();
        this.K4 = new HashSet();
        this.S4 = new zh6();
        this.T4 = new HashSet();
        this.U4 = new l87(this, (byte) 24);
        this.X4 = new ub7(this);
        this.d5 = new HashSet();
        this.e5 = new HashSet();
        this.f5 = new l87(this, (byte) 25);
        this.g5 = new LongSparseArray();
        this.h5 = new HashMap();
        this.m5 = new l87(this, (byte) 6);
        this.o5 = new vb7(this);
        in5.z();
        getMessagesStorage();
        getLocationController();
        hl.c3(new l87(this, (byte) 7));
        h();
        if (this.currentAccount == 0) {
            this.W3 = a.b.getSharedPreferences("Notifications", 0);
            k = a.b.getSharedPreferences("mainconfig", 0);
            this.X3 = k;
            this.Y3 = a.b.getSharedPreferences("emoji", 0);
        } else {
            this.W3 = bp1.k(new StringBuilder("Notifications"), this.currentAccount, a.b, 0);
            k = bp1.k(new StringBuilder("mainconfig"), this.currentAccount, a.b, 0);
            this.X3 = k;
            this.Y3 = bp1.k(new StringBuilder("emoji"), this.currentAccount, a.b, 0);
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
        this.S3 = (HashSet) Collection.EL.stream(this.X3.getStringSet("whitelistedBots", new HashSet())).map(new yz((byte) 11)).collect(Collectors.toCollection(new zl1((byte) 1)));
        String string2 = this.X3.getString("starsGroupcallMessageLimits", null);
        if (string2 != null && string2.length() != 0) {
            try {
                a = DesugarArrays.stream(string2.split(",")).mapToInt(new nm((byte) 8)).toArray();
            } catch (Exception e) {
                cc4.g(e, true);
                a = eg5.a();
            }
        } else {
            a = eg5.a();
        }
        this.T3 = a;
        this.R3 = this.X3.getString("storiesPosting", "enabled");
        this.E3 = lc7.b(0, this.X3.getString("peerColors", ""));
        this.F3 = lc7.b(1, this.X3.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.X3;
        boolean z2 = f11.a;
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
        this.U3 = DesugarArrays.stream(this.X3.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new fh((byte) 1)).toArray();
        this.V3 = (int[][]) DesugarArrays.stream(this.X3.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new yz((byte) 12)).toArray(new g87((byte) 0));
        hr hrVar = this.k4;
        SharedPreferences sharedPreferences2 = this.X3;
        hrVar.getClass();
        String[] strArr = hr.O3;
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
        for (yr2 yr2Var : hrVar.a.a.values()) {
            yr2Var.d(sharedPreferences2);
        }
        this.k4.J0.a(new l87(this, (byte) 0));
        this.k4.B1.a(new l87(this, (byte) 1));
        l87 l87Var = new l87(this, (byte) 11);
        this.k4.G3.a(l87Var);
        this.k4.H3.a(l87Var);
        this.k4.I3.a(new pg6((byte) 5));
        this.k4.A0.a(new l87(this, (byte) 13));
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
        hl.c3(new l87(this, (byte) 8));
        f11.h = this.X3.getString("googleAuthClientId", f11.h);
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
            this.A3.put("🎯", new ec7(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string5, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    int readInt32 = serializedData.readInt32(true);
                    for (int i7 = 0; i7 < readInt32; i7++) {
                        this.A3.put(serializedData.readString(true), new ec7(serializedData.readInt32(true), serializedData.readInt32(true)));
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
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
                cc4.g(e3, true);
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
                cc4.g(e4, true);
            }
        }
        hl.d3(new l87(this, (byte) 14), 2000L);
        hl.d3(new l87(this, (byte) 6), 2000L);
        hl.d3(new l87(this, (byte) 17), 400L);
        ?? rf0Var = new rf0(i);
        rf0Var.a = new zh6();
        rf0Var.b = new zh6();
        rf0Var.c = new LongSparseIntArray();
        rf0Var.d = new LongSparseIntArray();
        rf0Var.e = new zh6();
        rf0Var.f = new zh6();
        rf0Var.h = new LongSparseLongArray();
        rf0Var.n = new LongSparseIntArray();
        new LongSparseIntArray();
        rf0Var.r = new LongSparseIntArray();
        rf0Var.s = new zh6();
        this.g4 = rf0Var;
        this.h4 = new w51(i);
        this.i4 = new a5c(this);
        Utilities.e.c(new l87(this, (byte) 19));
    }

    public static int D3(ArrayList arrayList) {
        TLRPC.Message message;
        int i;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; arrayList != null && i3 < arrayList.size(); i3++) {
            r47 r47Var = (r47) arrayList.get(i3);
            if (r47Var != null && (message = r47Var.k) != null && (i = message.date) > i2) {
                i2 = i;
            }
        }
        return i2;
    }

    public static boolean F2(TLRPC.User user) {
        if (user != null && user.premium && !K2(user)) {
            return true;
        }
        return false;
    }

    public static boolean K2(TLRPC.User user) {
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

    public static long P1(TLRPC.Reaction reaction) {
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

    public static boolean Q2(TLRPC.UserFull userFull) {
        if (userFull != null) {
            if (!userFull.noforwards_peer_enabled && !userFull.noforwards_my_enabled) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static long S1(TLRPC.Update update) {
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
        if (f11.a) {
            cc4.d("trying to get unknown update channel_id for " + update);
            return 0L;
        }
        return 0L;
    }

    public static int T1(TLRPC.Update update) {
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

    public static int U1(TLRPC.Update update) {
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

    public static int V1(TLRPC.Update update) {
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

    public static String V2(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new g87((byte) 1)).collect(Collectors.joining(","));
    }

    public static String Z1(TLRPC.User user) {
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            return hl.A2(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            return hl.A2(user.last_name);
        }
        return "";
    }

    public static SharedPreferences d1() {
        return s1(0).Y3;
    }

    public static TLRPC.TL_wallPaperSettings d2(unb unbVar) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = unbVar.i;
        tL_wallPaperSettings.motion = unbVar.j;
        int i = unbVar.d;
        if (i != 0) {
            tL_wallPaperSettings.background_color = i & 16777215;
            int i2 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (unbVar.k * 100.0f);
            tL_wallPaperSettings.flags = i2 | 9;
        } else {
            float f = unbVar.k;
            if (f > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i3 = unbVar.e;
        if (i3 != 0) {
            tL_wallPaperSettings.second_background_color = i3 & 16777215;
            tL_wallPaperSettings.rotation = hl.q1(unbVar.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i4 = unbVar.f;
        if (i4 != 0) {
            tL_wallPaperSettings.third_background_color = i4 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i5 = unbVar.g;
        if (i5 != 0) {
            tL_wallPaperSettings.fourth_background_color = i5 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static SharedPreferences e1() {
        return s1(0).X3;
    }

    public static boolean e2(String str, ArrayList arrayList) {
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

    public static SharedPreferences f1() {
        return s1(0).W3;
    }

    public static void f5(String str, e eVar) {
        if (eVar != null && eVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, eVar.getResourceProvider(), eVar.getParentActivity());
            String M0 = ob6.M0(2131751419, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            HashMap hashMap = new HashMap();
            int i = aob.L5;
            hashMap.put("info1", Integer.valueOf(eVar.getThemedColor(i)));
            hashMap.put("info2", Integer.valueOf(eVar.getThemedColor(i)));
            alertDialog$Builder.l(2131624108, 52, eVar.getThemedColor(i), hashMap);
            idVar.X = true;
            alertDialog$Builder.j(ob6.M0(2131752006, null), null);
            idVar.U = str;
            eVar.showDialog(idVar);
        }
    }

    public static TLRPC.InputChannel i1(TLRPC.Chat chat) {
        if (xc2.T(chat)) {
            if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                tL_inputChannelFromMessage.channel_id = chat.id;
                tL_inputChannelFromMessage.peer = s1(yac.t0).j1(chat.fromMessageDialogId);
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

    public static void k0(ArrayList arrayList, TL_account.WebDomainException webDomainException) {
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
        if (xc2.T(chat)) {
            if (chat != null && chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = chat.id;
                tL_inputPeerChannelFromMessage.peer = s1(yac.t0).j1(chat.fromMessageDialogId);
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

    public static TLRPC.InputPeer n1(TLRPC.User user) {
        if (user != null && user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = user.id;
            tL_inputPeerUserFromMessage.peer = s1(yac.t0).j1(user.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.InputMedia n5(TLRPC.MessageMedia messageMedia) {
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

    public static TLRPC.TL_emojiStatusCollectible p0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
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

    public static TLRPC.InputWallPaper r1(unb unbVar) {
        if (unbVar.l > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.id = unbVar.l;
            tL_inputWallPaper.access_hash = unbVar.m;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = unbVar.c;
        return tL_inputWallPaperSlug;
    }

    public static boolean s0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
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

    public static uc7 s1(int i) {
        uc7 uc7Var;
        uc7 uc7Var2 = t5[i];
        if (uc7Var2 == null) {
            synchronized (u5[i]) {
                uc7Var = t5[i];
                if (uc7Var == null) {
                    uc7[] uc7VarArr = t5;
                    uc7 uc7Var3 = new uc7(i);
                    uc7VarArr[i] = uc7Var3;
                    uc7Var = uc7Var3;
                }
            }
            return uc7Var;
        }
        return uc7Var2;
    }

    public static void t0(long j, TLObject tLObject, ArrayList arrayList) {
        int i = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                    if (wf3.n(message.from_id) == user.id) {
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
                    if (wf3.n(message2.from_id) == (-chat.id)) {
                        chat.fromMessageDialogId = j;
                        chat.fromMessageId = message2.id;
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public static SharedPreferences w1(int i) {
        return s1(i).W3;
    }

    public static ArrayList y0(TLRPC.Updates updates, Class cls) {
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

    public static ArrayList z0(TLRPC.Updates updates, Class cls) {
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

    public final void A(long j, String str, sn2 sn2Var) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (xc2.S(this.currentAccount, j)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = h1(j);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new mw3(this, sn2Var, (byte) 29), 64);
    }

    public final void A0() {
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        int i = messagesStorage.w;
        jf7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.G();
        int i2 = messagesStorage2.r;
        jf7 messagesStorage3 = getMessagesStorage();
        messagesStorage3.G();
        int i3 = messagesStorage3.n;
        jf7 messagesStorage4 = getMessagesStorage();
        messagesStorage4.G();
        A4(true, i, i2, i3, messagesStorage4.s);
        ip7 notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ip7.l0.c(new vo7(notificationsController, (byte) 7));
    }

    public final String A1(long j, boolean z) {
        String str;
        if (j >= 0) {
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (z) {
                return hl.C2(hl.A2(lbc.k(X1, true)));
            }
            return hl.C2(hl.A2(lbc.r(X1)));
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j));
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        return hl.C2(hl.A2(str));
    }

    public final boolean A2(TLRPC.Dialog dialog, long j) {
        long j2;
        HashMap hashMap = this.o4;
        if (!hashMap.isEmpty()) {
            if (!hashMap.containsKey(Long.valueOf(dialog.id)) && !hashMap.containsKey(Long.valueOf(j))) {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    for (Long l : hashMap.keySet()) {
                        if (l.longValue() > 0) {
                            TLRPC.User X1 = X1(l);
                            if (X1 != null) {
                                j2 = X1.linked_community_id;
                            }
                            j2 = 0;
                        } else {
                            TLRPC.Chat M0 = M0(Long.valueOf(-l.longValue()));
                            if (M0 != null) {
                                j2 = M0.linked_community_id;
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

    public final void A3(long j, long j2) {
        long j3;
        ArrayList l;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        qyb qybVar = this.g4;
        if (i == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((v2(j) || C2(j)) && (l = qybVar.l((j3 = -j))) != null) {
                for (int i2 = 0; i2 < l.size(); i2++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i2);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                qybVar.y(j3, true);
            }
        } else {
            long j4 = -j;
            TLRPC.TL_forumTopic f = qybVar.f(j4, j2);
            if (f != null && f.unread_poll_votes_count > 0) {
                f.unread_poll_votes_count = 0;
                qybVar.y(j4, true);
            }
        }
        getMessagesStorage().e2(0, j, j2, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = j1(j);
        if (i != 0 && !B2(j)) {
            tL_messages_readPollVotes.top_msg_id = (int) j2;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new xe2((byte) 0));
        jn7.f(this.currentAccount).k(2, 1048576);
    }

    public final void A4(boolean r23, final int r24, final int r25, final int r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.A4(boolean, int, int, int, int):void");
    }

    public final void A5(boolean z) {
        if (this.G0.isEmpty()) {
            return;
        }
        if (!z) {
            if (!((ac7) this.G0.get(0)).d()) {
                int i = 1;
                while (true) {
                    if (i >= this.G0.size()) {
                        break;
                    } else if (((ac7) this.G0.get(i)).d()) {
                        this.G0.add(0, (ac7) this.G0.remove(i));
                        break;
                    } else {
                        i++;
                    }
                }
            }
            q3();
        } else {
            for (int i2 = 0; i2 < this.G0.size(); i2++) {
                ((ac7) this.G0.get(i2)).p = false;
            }
        }
        getMessagesStorage().v1();
        getNotificationCenter().k(jn7.O2, new Object[0]);
        O1().x.b();
    }

    public final void B() {
        if (!this.h0 && O1().h.isEmpty()) {
            t4(1);
        } else {
            boolean[] zArr = {false};
            q0(1, zArr);
            if (zArr[0]) {
                h5(null);
                getNotificationCenter().k(jn7.r, new Object[0]);
            }
        }
        getNotificationCenter().k(2, 0);
    }

    public final void B0(long j, boolean z) {
        TLRPC.Chat M0 = M0(Long.valueOf(j));
        if (M0 != null && xc2.S(this.currentAccount, j)) {
            if ((!xc2.r0(M0) || z) && !M0.creator && !xc2.p0(M0)) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.flags = 256;
                int i = getUserConfig().i();
                tL_messageService.id = i;
                tL_messageService.local_id = i;
                if ((M0 instanceof TLRPC.TL_channel) && !z) {
                    tL_messageService.date = M0.date;
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
                arrayList.add(new r47(this.currentAccount, tL_messageService, true, false));
                getMessagesStorage().g1(arrayList2, true, true, false, 0, false, 0, 0L);
                hl.c3(new p77(this, j, arrayList, (byte) 3));
            }
        }
    }

    public final TLRPC.PeerSettings B1(long j) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull Y1 = Y1(j);
        if (Y1 != null && (peerSettings = Y1.settings) != null) {
            return peerSettings;
        }
        return (TLRPC.PeerSettings) this.g1.f(j);
    }

    public final boolean B2(long j) {
        TLRPC.Chat M0 = M0(Long.valueOf(-j));
        if (M0 != null && M0.monoforum) {
            return true;
        }
        return false;
    }

    public final void B3(long j, long j2) {
        long j3;
        ArrayList l;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        qyb qybVar = this.g4;
        if (i == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((v2(j) || C2(j)) && (l = qybVar.l((j3 = -j))) != null) {
                for (int i2 = 0; i2 < l.size(); i2++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i2);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                qybVar.y(j3, true);
            }
        } else {
            long j4 = -j;
            TLRPC.TL_forumTopic f = qybVar.f(j4, j2);
            if (f != null && f.unread_reactions_count > 0) {
                f.unread_reactions_count = 0;
                qybVar.y(j4, true);
            }
        }
        getMessagesStorage().f2(0, j, j2, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = j1(j);
        if (i != 0) {
            if (B2(j)) {
                tL_messages_readReactions.saved_peer_id = j1(j2);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j2;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new xe2((byte) 0));
        jn7.f(this.currentAccount).k(2, 1048576);
    }

    public final boolean B4(long j) {
        if (j != 0 && hl.O1()) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = this.o4;
            Integer num = (Integer) hashMap.get(valueOf);
            if (num != null) {
                hashMap.put(Long.valueOf(j), Integer.valueOf(num.intValue() + 1));
                return true;
            } else if (s2((TLRPC.Dialog) this.R.f(j))) {
                hashMap.put(Long.valueOf(j), 1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void B5() {
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
        zh6 zh6Var = new zh6();
        zh6 zh6Var2 = new zh6();
        Iterator it3 = this.W.entrySet().iterator();
        while (true) {
            int i4 = 1;
            if (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Long l = (Long) entry.getKey();
                boolean B = wf3.B(l.longValue());
                Iterator it4 = ((ConcurrentHashMap) entry.getValue()).entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Integer num = (Integer) entry2.getKey();
                    ArrayList arrayList = (ArrayList) entry2.getValue();
                    zh6 zh6Var3 = new zh6();
                    zh6 zh6Var4 = new zh6();
                    zh6Var.k(l.longValue(), zh6Var3);
                    zh6Var2.k(l.longValue(), zh6Var4);
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
                                TLRPC.User X1 = X1(Long.valueOf(((mc7) obj).b));
                                if (X1 != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(Z1(X1));
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
                                a0 = ob6.a0("IsTypingGroup", null, 2131748842, sb.toString());
                            } else if (arrayList.size() > 2) {
                                try {
                                    a0 = String.format(ob6.J0(arrayList.size() - 2, "AndMoreTypingGroup"), sb.toString(), Integer.valueOf(arrayList.size() - 2));
                                } catch (Exception unused) {
                                    a0 = "LOC_ERR: AndMoreTypingGroup";
                                }
                            } else {
                                a0 = ob6.a0("AreTypingGroup", null, 2131754114, sb.toString());
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
                        mc7 mc7Var = (mc7) arrayList.get(0);
                        TLRPC.User X12 = X1(Long.valueOf(mc7Var.b));
                        if (X12 != null) {
                            if (l.longValue() < 0 && !B) {
                                z = true;
                            } else {
                                z = false;
                            }
                            TLRPC.SendMessageAction sendMessageAction = mc7Var.c;
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                                if (z) {
                                    M06 = ob6.a0("IsRecordingAudio", null, 2131748853, Z1(X12));
                                } else {
                                    M06 = ob6.M0(2131746078, null);
                                }
                                str = M06;
                                i = 1;
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                    if (z) {
                                        M05 = ob6.a0("IsRecordingRound", null, 2131748852, Z1(X12));
                                    } else {
                                        M05 = ob6.M0(2131746077, null);
                                    }
                                    str = M05;
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                    if (z) {
                                        str = ob6.a0("IsSendingVideo", null, 2131748844, Z1(X12));
                                    } else {
                                        str = ob6.M0(2131745303, null);
                                    }
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                        if (z) {
                                            M04 = ob6.a0("IsSendingAudio", null, 2131748848, Z1(X12));
                                        } else {
                                            M04 = ob6.M0(2131745310, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                        if (z) {
                                            M04 = ob6.a0("IsSendingVideo", null, 2131748844, Z1(X12));
                                        } else {
                                            M04 = ob6.M0(2131745303, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                        if (z) {
                                            M04 = ob6.a0("IsRecordingVideo", null, 2131748851, Z1(X12));
                                        } else {
                                            M04 = ob6.M0(2131746074, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                        if (z) {
                                            M04 = ob6.a0("IsSendingFile", null, 2131748847, Z1(X12));
                                        } else {
                                            M04 = ob6.M0(2131745309, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                        if (z) {
                                            M04 = ob6.a0("IsSendingPhoto", null, 2131748845, Z1(X12));
                                        } else {
                                            M04 = ob6.M0(2131745306, null);
                                        }
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                        if (z) {
                                            M03 = ob6.a0("IsSendingGame", null, 2131748846, Z1(X12));
                                        } else {
                                            M03 = ob6.M0(2131745308, null);
                                        }
                                        i = 3;
                                        str = M03;
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                            if (z) {
                                                M0 = ob6.a0("IsSelectingLocation", null, 2131748849, Z1(X12));
                                            } else {
                                                M0 = ob6.M0(2131745374, null);
                                            }
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                            if (z) {
                                                M0 = ob6.a0("IsSelectingContact", null, 2131748850, Z1(X12));
                                            } else {
                                                M0 = ob6.M0(2131745375, null);
                                            }
                                        } else {
                                            if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                                String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                                if (z) {
                                                    M02 = ob6.a0("IsEnjoyngAnimations", null, 2131748854, Z1(X12), str2);
                                                } else {
                                                    M02 = ob6.a0("EnjoyngAnimations", null, 2131751090, str2);
                                                }
                                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                                if (z) {
                                                    M02 = ob6.a0("IsChoosingSticker", null, 2131748855, Z1(X12));
                                                } else {
                                                    M02 = ob6.M0(2131752071, null);
                                                }
                                            } else if (z) {
                                                M0 = ob6.a0("IsTypingGroup", null, 2131748842, Z1(X12));
                                            } else {
                                                M0 = ob6.M0(2131743573, null);
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
                        Paint paint = aob.F0;
                        if (paint == null) {
                            paint = new Paint();
                            paint.setTypeface(hl.o());
                            paint.setTextSize(hl.L(14.0f));
                        }
                        zh6Var3.k(num.intValue(), pv3.m(str, paint.getFontMetricsInt(), false, null, 0));
                        zh6Var4.k(num.intValue(), Integer.valueOf(i2));
                    }
                    it3 = it;
                    it4 = it2;
                    i4 = 1;
                }
            } else {
                this.c0 = zh6Var.m();
                hl.c3(new d77(this, zh6Var, zh6Var2, (byte) 1));
                return;
            }
        }
    }

    public final boolean C(Bundle bundle, e eVar, r47 r47Var, dq1 dq1Var) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String E1;
        id idVar;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (eVar != null) {
            long j = bundle.getLong("user_id", 0L);
            long j2 = bundle.getLong("chat_id", 0L);
            int i = bundle.getInt("message_id", 0);
            if (j != 0) {
                user = X1(Long.valueOf(j));
                chat = null;
            } else if (j2 != 0) {
                chat = M0(Long.valueOf(j2));
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
                    f5(E1, eVar);
                    return false;
                } else if (i != 0 && r47Var != null && chat != null && chat.access_hash == 0) {
                    long B0 = r47.B0(r47Var.k);
                    if (!wf3.B(B0)) {
                        if (dq1Var != null) {
                            dq1Var.d();
                            idVar = null;
                        } else {
                            idVar = new id(3, null, eVar.getParentActivity());
                        }
                        int i2 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
                        if (i2 < 0) {
                            chat = M0(Long.valueOf(-B0));
                        }
                        if (i2 <= 0 && xc2.T(chat)) {
                            TLRPC.Chat M0 = M0(Long.valueOf(-B0));
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = i1(M0);
                            tL_channels_getMessages.id.add(Integer.valueOf(r47Var.e1()));
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.id.add(Integer.valueOf(r47Var.e1()));
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new in0(this, (Object) idVar, (Object) dq1Var, (Object) eVar, (Object) bundle, (byte) 11));
                        if (idVar != null) {
                            idVar.setOnCancelListener(new ef(this, sendRequest, eVar, (byte) 2));
                            eVar.setVisibleDialog(idVar);
                            idVar.show();
                            return false;
                        }
                        dq1Var.b = new l65(this, sendRequest, eVar, (byte) 12);
                        dq1Var.d();
                        return false;
                    }
                    return true;
                } else if (i != 0 && r47Var != null && dq1Var != null) {
                    dq1Var.d();
                    dq1Var.b = r0(-j2, i, new pm3(dq1Var, eVar, bundle, (byte) 20));
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final String C0(long j, long j2) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j == j2) {
            return "";
        }
        zh6 zh6Var = (zh6) this.q1.f(j);
        if (zh6Var != null && (channelParticipant2 = (TLRPC.ChannelParticipant) zh6Var.f(j2)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return ob6.M0(2131752172, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return ob6.M0(2131752173, null);
            }
        }
        TLRPC.ChatFull N0 = N0(j);
        if (N0 != null && N0.participants != null) {
            int i = 0;
            while (true) {
                if (i >= N0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i);
                if (chatParticipant.user_id == j2) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return ob6.M0(2131752172, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return ob6.M0(2131752173, null);
                    }
                } else {
                    i++;
                }
            }
        }
        return null;
    }

    public final CharSequence C1(long j, long j2, boolean z) {
        zh6 zh6Var;
        TLRPC.User X1;
        TLRPC.UserStatus userStatus;
        if ((z && wf3.D(j) && (X1 = X1(Long.valueOf(j))) != null && (userStatus = X1.status) != null && userStatus.expires < 0) || (zh6Var = (zh6) this.X.f(j)) == null) {
            return null;
        }
        return (CharSequence) zh6Var.f(j2);
    }

    public final boolean C2(long j) {
        TLRPC.Chat M0 = M0(Long.valueOf(-j));
        if (xc2.p0(M0) && xc2.A(this.currentAccount, M0, 24)) {
            return true;
        }
        return false;
    }

    public final boolean C3(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (tL_chatAdminRights != null) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = null;
            if (chat != null && user != null) {
                if (lbc.D(user)) {
                    tL_chatAdminRights2 = chat.admin_rights;
                } else {
                    TLRPC.ChatFull N0 = N0(chat.id);
                    if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null) {
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

    public final void C4(r47 r47Var) {
        long j;
        if (r47Var == null) {
            return;
        }
        jf7 messagesStorage = getMessagesStorage();
        long B0 = r47.B0(r47Var.k);
        int P0 = r47Var.P0();
        messagesStorage.getClass();
        zh6 zh6Var = new zh6(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        zh6Var.k(B0, arrayList);
        messagesStorage.H(new ds6((Object) messagesStorage, (Object) zh6Var, false, (byte) 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = j1(r47.B0(r47Var.k));
        TLRPC.Message message = r47Var.k;
        if (message != null) {
            j = message.ephemeralReceiverBotId;
        } else {
            j = 0;
        }
        tL_deleteMessage.receiver_id = o1(j);
        tL_deleteMessage.id = r47Var.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new pp0((byte) 0));
    }

    public final boolean C5(ArrayList arrayList, long j) {
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
                r47 r47Var = (r47) obj;
                if (r47Var.p3() && !arrayList2.contains(Long.valueOf(r47Var.k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(r47Var.k.from_id.user_id));
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
                        if (arrayList2.contains(Long.valueOf(((mc7) arrayList4.get(i3)).b))) {
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

    public final void D(long j, String str) {
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
        int i = jn7.U;
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

    public final int D0() {
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

    public final Integer D1(long j, long j2) {
        zh6 zh6Var = (zh6) this.Y.f(j);
        if (zh6Var == null) {
            return null;
        }
        return (Integer) zh6Var.f(j2);
    }

    public final boolean D2(long j) {
        TLRPC.Chat chat;
        if (j < 0) {
            chat = M0(Long.valueOf(-j));
        } else {
            chat = null;
        }
        if (xc2.V(chat) && chat.in_news) {
            return true;
        }
        return false;
    }

    public final boolean D4() {
        String str = this.k4.l0.f;
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

    public final void D5(long j, long j2, String str) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        M0(Long.valueOf(j));
        zh6 zh6Var = (zh6) this.q1.f(j);
        if (zh6Var != null && (channelParticipant = (TLRPC.ChannelParticipant) zh6Var.f(j2)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull N0 = N0(j);
        if (N0 != null && N0.participants != null) {
            for (int i = 0; i < N0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i);
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
        jn7.f(this.currentAccount).k(2, 0);
        jn7.f(this.currentAccount).k(jn7.Z3, Long.valueOf(j), Long.valueOf(j2), str2);
        jf7 Y = jf7.Y(this.currentAccount);
        Y.a.c(new wd7(Y, -j, j2, str2, (byte) 0));
    }

    public final void E(long j, boolean z) {
        TLRPC.Chat M0 = M0(Long.valueOf(j));
        if (xc2.T(M0) && !M0.creator) {
            zh6 zh6Var = this.R0;
            if (zh6Var.h(j) < 0) {
                if (xc2.p0(M0)) {
                    z = false;
                }
                boolean z2 = z;
                zh6Var.k(j, Boolean.TRUE);
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = h1(j);
                tL_channels_getParticipant.participant = j1(getUserConfig().e());
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new e87((byte) 0, j, this, M0, z2));
            }
        }
    }

    public final TLRPC.messages_AvailableEffects E0() {
        if (!this.V4) {
            this.V4 = true;
            this.X4.c(this.currentAccount, 0, new mb7(this, (byte) 0));
        }
        return this.W4;
    }

    public final String E1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i);
                Set set = this.K3;
                if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason)) {
                    if (!"all".equals(restrictionReason.platform)) {
                        if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                            a.t();
                            if (!f11.a()) {
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

    public final boolean E2(long j) {
        if (j > 0) {
            return Q2(Y1(j));
        }
        return m2(M0(Long.valueOf(-j)));
    }

    public final boolean E3() {
        String str = this.k4.n0.f;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1609594047) {
                if (hashCode != -318452137) {
                    if (hashCode == 270940796) {
                        str.equals("disabled");
                        return false;
                    }
                } else if (str.equals("premium")) {
                    return getUserConfig().p();
                }
            } else if (str.equals("enabled")) {
                return true;
            }
        }
        return false;
    }

    public final void E4(Object obj, TLRPC.Document document) {
        if (obj != null && r47.s3(document, false)) {
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
            getConnectionsManager().sendRequest(tL_messages_saveGif, new m65(this, obj, tL_messages_saveGif, (byte) 18));
        }
    }

    public final void E5(long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.E5(long):void");
    }

    public final void F(int i, boolean z) {
        if (i >= 0) {
            SparseArray sparseArray = this.d0;
            xb7 xb7Var = (xb7) sparseArray.get(i);
            if (xb7Var != 0) {
                if (!xb7Var.a) {
                    if (System.currentTimeMillis() - xb7Var.b <= this.k4.A1.f() * 1000 && !z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (xb7Var == 0) {
                xb7Var = new Object();
                xb7Var.a = true;
                sparseArray.put(i, xb7Var);
            }
            xb7Var.a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new hb7(this, i, xb7Var, (byte) 10));
        }
    }

    public final void F0(boolean z) {
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
            getConnectionsManager().sendRequest(tL_contacts_getBlocked, new vi1(this, z, tL_contacts_getBlocked, (byte) 8));
        }
    }

    public final nt9 F1() {
        nt9 nt9Var = this.f0;
        if (nt9Var != null) {
            return nt9Var;
        }
        synchronized (u5[this.currentAccount]) {
            nt9 nt9Var2 = this.f0;
            if (nt9Var2 != null) {
                return nt9Var2;
            }
            nt9 nt9Var3 = new nt9(this.currentAccount);
            this.f0 = nt9Var3;
            return nt9Var3;
        }
    }

    public final void F3(ac7 ac7Var) {
        for (int i = 0; i < 2; i++) {
            if (this.N[i] == ac7Var) {
                h5(null);
                getNotificationCenter().k(jn7.r, Boolean.TRUE);
                return;
            }
        }
    }

    public final void F4(long j, TLRPC.PeerSettings peerSettings) {
        Object[] objArr;
        boolean z;
        int i;
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.W3;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i2 = 2;
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(qu6.n(j, "dialog_botid"), peerSettings.business_bot_id);
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
        edit.putLong(qu6.n(j, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        if (peerSettings.spam && j > 0 && !r2(j)) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean d4 = d4(edit, j, peerSettings.spam);
        int i3 = jn7.Q0;
        int i4 = jn7.r;
        if (objArr == null) {
            if (sharedPreferences.getInt("dialog_bar_vis3" + j, 0) == 3) {
                edit.apply();
                if (d4) {
                    getNotificationCenter().k(i4, new Object[0]);
                }
                getNotificationCenter().k(i3, Long.valueOf(j));
                return;
            }
        }
        if (peerSettings.flags == 0) {
            z = true;
        } else {
            z = false;
        }
        if (f11.a) {
            StringBuilder o = ik8.o(j, "peer settings loaded for ", " add = ");
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
            cc4.b(o.toString());
        }
        String n = qu6.n(j, "dialog_bar_vis3");
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
                edit.putInt(qu6.n(j, "dialog_bar_distance"), peerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j);
            }
        }
        if (j == getUserConfig().e()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        this.g1.k(j, peerSettings);
        if (d4) {
            getNotificationCenter().k(i4, new Object[0]);
        }
        getNotificationCenter().k(i3, Long.valueOf(j));
    }

    public final void F5(HashSet hashSet) {
        E5(0L);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            E5(((Long) it.next()).longValue());
        }
    }

    public final boolean G(boolean z) {
        zh6 zh6Var;
        int i;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.O1 == null && this.P1 == null) || (!z && ((i = this.N1) == 0 || i > currentTime))) {
            return false;
        }
        this.N1 = 0;
        if (this.Q1 != null && !z) {
            Utilities.d.a(this.Q1);
        }
        zh6 zh6Var2 = null;
        this.Q1 = null;
        zh6 zh6Var3 = this.O1;
        if (zh6Var3 != null) {
            zh6Var = zh6Var3.clone();
        } else {
            zh6Var = null;
        }
        zh6 zh6Var4 = this.P1;
        if (zh6Var4 != null) {
            zh6Var2 = zh6Var4.clone();
        }
        hl.c3(new d77(this, zh6Var, zh6Var2, (byte) 0));
        return true;
    }

    public final xg1 G0() {
        xg1 xg1Var = this.i0;
        if (xg1Var != null) {
            return xg1Var;
        }
        synchronized (u5[this.currentAccount]) {
            xg1 xg1Var2 = this.i0;
            if (xg1Var2 != null) {
                return xg1Var2;
            }
            xg1 xg1Var3 = new xg1(this.currentAccount);
            this.i0 = xg1Var3;
            return xg1Var3;
        }
    }

    public final oc7 G1() {
        oc7 oc7Var = this.i5;
        if (oc7Var == null) {
            oc7 oc7Var2 = new oc7(this.currentAccount);
            this.i5 = oc7Var2;
            return oc7Var2;
        }
        return oc7Var;
    }

    public final boolean G2(long j, boolean z) {
        TLRPC.Dialog dialog = this.q2;
        if (dialog != null && dialog.id == j) {
            if (!z || this.r2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void G3(e eVar, TLRPC.User user, String str, int i, l01 l01Var, boolean z, boolean z2) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (l01Var != null) {
            l01Var.b = new om1(zArr, (byte) 6);
            l01Var.d();
        }
        b97 b97Var = new b97(this, eVar, l01Var, zArr, user, str, z, z2, r9);
        ls6 mediaDataController = getMediaDataController();
        long j = user.id;
        HashMap hashMap = mediaDataController.y1;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hashMap.get(j + "_" + j);
        TL_bots.BotInfo[] botInfoArr = {botInfo};
        if (user.bot_has_main_app) {
            b97Var.run();
        } else if (botInfo == null) {
            ls6 mediaDataController2 = getMediaDataController();
            long j2 = user.id;
            mediaDataController2.I0(j2, j2, false, i, new c97(this, zArr, botInfoArr, user, i, b97Var));
        } else {
            b97Var.run();
        }
    }

    public final boolean G4(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList arrayList) {
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

    public final boolean G5(long j, w49 w49Var, boolean z) {
        long j2;
        int i;
        if (this.P4 == null) {
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
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.P4.f(j2);
                if (tL_messages_savedReactionsTags == null) {
                    if (j2 != 0) {
                        zh6 zh6Var = this.P4;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        zh6Var.k(j2, tL_messages_savedReactionsTags);
                    }
                }
                int i3 = 0;
                boolean z3 = false;
                while (i3 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i3);
                    if (w49Var.f(tL_savedReactionTag.reaction)) {
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
                    tL_savedReactionTag2.reaction = w49Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void H(int i) {
        if (i == 0) {
            return;
        }
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new ad7(messagesStorage, i, (byte) 0));
    }

    public final int H0() {
        ds2 ds2Var;
        boolean p = getUserConfig().p();
        hr hrVar = this.k4;
        if (p) {
            ds2Var = hrVar.p1;
        } else {
            ds2Var = hrVar.o1;
        }
        return ds2Var.f();
    }

    public final TLRPC.TL_messages_savedReactionsTags H1(long j, boolean z) {
        HashSet hashSet = this.O4;
        if (hashSet != null && hashSet.contains(Long.valueOf(j)) && !z) {
            zh6 zh6Var = this.P4;
            if (zh6Var == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) zh6Var.f(j);
        }
        HashSet hashSet2 = this.O4;
        if (hashSet2 == null) {
            hashSet2 = new HashSet();
            this.O4 = hashSet2;
        }
        hashSet2.add(Long.valueOf(j));
        getMessagesStorage().a.c(new t77(this, j, (byte) 9));
        return null;
    }

    public final boolean H2(int i, long j, boolean z) {
        Boolean bool = (Boolean) this.h5.get(j + "_" + i);
        if (bool != null && bool.booleanValue() == z) {
            return true;
        }
        return false;
    }

    public final void H3(String str, final e eVar, final int i, final l01 l01Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        if (str != null && eVar != null) {
            TLObject c2 = c2(str);
            if (c2 instanceof TLRPC.User) {
                user = (TLRPC.User) c2;
                if (!user.min) {
                    chat = null;
                }
                user = null;
                chat = null;
            } else {
                if (c2 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) c2;
                    if (!chat2.min) {
                        chat = chat2;
                        user = null;
                    }
                }
                user = null;
                chat = null;
            }
            if (user != null) {
                I3(user, null, eVar, i);
            } else if (chat != null) {
                I3(null, chat, eVar, 1);
            } else if (eVar.getParentActivity() != null) {
                final id[] idVarArr = {new id(3, null, eVar.getParentActivity())};
                final boolean[] zArr = {false};
                getMessagesController().a2().a(str, null, new pcc() {
                    @Override
                    public final void a(Object obj) {
                        Long l = (Long) obj;
                        l01 l01Var2 = l01Var;
                        id[] idVarArr2 = idVarArr;
                        try {
                            if (l01Var2 != null) {
                                l01Var2.b();
                            } else {
                                idVarArr2[0].dismiss();
                            }
                        } catch (Exception unused) {
                        }
                        idVarArr2[0] = null;
                        e eVar2 = eVar;
                        eVar2.setVisibleDialog(null);
                        if (!zArr[0]) {
                            if (l != null) {
                                int i2 = (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1));
                                uc7 uc7Var = uc7.this;
                                if (i2 < 0) {
                                    uc7Var.I3(null, uc7Var.M0(Long.valueOf(-l.longValue())), eVar2, 1);
                                } else {
                                    uc7Var.I3(uc7Var.X1(l), null, eVar2, i);
                                }
                            } else if (eVar2.getParentActivity() != null) {
                                try {
                                    if (eVar2 instanceof zu1) {
                                        ((zu1) eVar2).Qb();
                                    }
                                    d31.b0(eVar2).t(ob6.M0(2131747865, null), null).j();
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                            }
                        }
                    }
                });
                if (l01Var != null) {
                    l01Var.b = new om1(zArr, (byte) 5);
                    l01Var.d();
                    return;
                }
                hl.d3(new yg6(idVarArr, zArr, eVar, (byte) 20), 500L);
            }
        }
    }

    public final void H4(long j, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().a.c(new cq6(this, j, tL_messages_savedReactionsTags, (byte) 7));
    }

    public final void H5(TLObject tLObject, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = this.e;
            concurrentHashMap.remove(str);
            if (z) {
                concurrentHashMap.put(str.toLowerCase(), tLObject);
            }
        }
    }

    public final void I(TLRPC.Chat chat, TLRPC.User user, ic7 ic7Var) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (!chat.megagroup && !xc2.T(chat)) {
            TLRPC.ChatFull N0 = N0(chat.id);
            boolean z = false;
            if (N0 != null) {
                TLRPC.ChatParticipants chatParticipants = N0.participants;
                if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        chatParticipant = N0.participants.participants.get(i);
                        if (chatParticipant != null && chatParticipant.user_id == user.id) {
                            break;
                        }
                    }
                }
                chatParticipant = null;
                if (chatParticipant != null) {
                    z = true;
                }
                TLRPC.ChatParticipants chatParticipants2 = N0.participants;
                if (chatParticipants2 != null && chatParticipants2.admin_id == user.id) {
                    tL_chatAdminRights = pd2.d0(true);
                } else {
                    tL_chatAdminRights = null;
                }
                ic7Var.a(z, tL_chatAdminRights, null);
                return;
            }
            ic7Var.a(false, null, null);
            return;
        }
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = h1(chat.id);
        tL_channels_getParticipant.participant = n1(user);
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new w15(ic7Var, (byte) 12));
    }

    public final void I0(long j) {
        J0(j, 0, 0L, null);
    }

    public final void I1() {
        H1(0L, false);
    }

    public final boolean I2(java.util.ArrayList r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.I2(java.util.ArrayList):boolean");
    }

    public final void I3(org.telegram.tgnet.TLRPC.User r8, org.telegram.tgnet.TLRPC.Chat r9, org.telegram.ui.ActionBar.e r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.I3(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.e, int):void");
    }

    public final void I4(znb znbVar, ynb ynbVar, boolean z, boolean z2) {
        TLRPC.TL_theme tL_theme;
        if (ynbVar != null) {
            tL_theme = ynbVar.r;
        } else {
            tL_theme = znbVar.G;
        }
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z2;
            getConnectionsManager().sendRequest(savetheme, new xe2((byte) 0));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z2) {
            h2(znbVar, ynbVar, z);
        }
    }

    public final void I5(boolean z, boolean z2) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z;
            tL_webBrowserSettings.display_close_button = z2;
            e5(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z;
        updatewebbrowsersettings.display_close_button = z2;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new ic((byte) 0), new f87(this, (byte) 1));
    }

    public final void J(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (!wf3.B(dialog.id)) {
            long j2 = dialog.id;
            zh6 zh6Var = this.U0;
            if (zh6Var.h(j2) < 0) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                if (inputPeer == null) {
                    inputPeer = j1(dialog.id);
                }
                tL_messages_getHistory.peer = inputPeer;
                tL_messages_getHistory.limit = 1;
                zh6Var.k(dialog.id, Boolean.TRUE);
                if (f11.a) {
                    ik8.q(dialog.id, new StringBuilder("checkLastDialogMessage for "));
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
                        cc4.g(exc, true);
                        j = getMessagesStorage().y(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getHistory, new p87(this, dialog, j, (byte) 12));
                    }
                    j = getMessagesStorage().y(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getHistory, new p87(this, dialog, j, (byte) 12));
            }
        }
    }

    public final void J0(final long r19, final int r21, long r22, org.telegram.tgnet.TLRPC.InputChannel r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.J0(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public final String J1(TLRPC.Reaction reaction) {
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        boolean z;
        zh6 zh6Var = this.P4;
        if (zh6Var == null || (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) zh6Var.f(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            TLRPC.Reaction reaction2 = tL_messages_savedReactionsTags.tags.get(i).reaction;
            Paint paint = x49.S;
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

    public final boolean J2() {
        TLRPC.UserFull Y1 = Y1(getUserConfig().e());
        if (Y1 == null) {
            return false;
        }
        return !Y1.sponsored_enabled;
    }

    public final void J3(int i) {
        boolean z;
        ArrayList arrayList;
        TLRPC.User f;
        if (i == 1) {
            Context context = a.b;
            int i2 = this.currentAccount;
            long e = getUserConfig().e();
            if (e == 0) {
                Object obj = k35.g;
            } else {
                synchronized (k35.g) {
                    ArrayList o = k35.o(context, e);
                    int size = o.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = o.get(i3);
                        i3++;
                        new k35(i2, context, (String) obj2).C();
                    }
                }
            }
            if (getUserConfig().d && xea.f.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = xea.f;
                unregisterdevice.token_type = xea.e;
                for (int i4 = 0; i4 < 4; i4++) {
                    yac h = yac.h(i4);
                    if (i4 != this.currentAccount && h.o()) {
                        unregisterdevice.other_uids.add(Long.valueOf(h.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new xe2((byte) 0));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new h77(this, (byte) 18));
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
        ea4.a(ea4.j.i(this.currentAccount, 0, 0, false));
        vye.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().a.get(jn7.I2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                fn7 fn7Var = (fn7) arrayList2.get(i5);
                if (fn7Var instanceof in7) {
                    fn7Var = (fn7) ((in7) fn7Var).b.get();
                }
                if (fn7Var != null) {
                    arrayList.add(fn7Var);
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
        if (yac.t0 == this.currentAccount) {
            int i7 = 0;
            while (true) {
                if (i7 < 4) {
                    if (yac.h(i7).o()) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                yac.t0 = i7;
                yac.h(0).u(false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.J();
                }
            }
        }
        getNotificationCenter().k(jn7.I2, new Object[0]);
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new je7(messagesStorage, false, (byte) 1));
        O();
        lv2 contactsController = getContactsController();
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
                        if (yac.h(i9).f() != null) {
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

    public final void J4(defpackage.znb r20, defpackage.ynb r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.J4(znb, ynb):void");
    }

    public final void K(boolean z) {
        int i;
        lc7 lc7Var;
        int i2;
        if (getUserConfig().f() != null) {
            if (!this.Q4 && ((lc7Var = this.E3) == null || lc7Var.g() || z)) {
                this.Q4 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                lc7 lc7Var2 = this.E3;
                if (lc7Var2 != null) {
                    i2 = lc7Var2.b;
                } else {
                    i2 = 0;
                }
                tL_help_getPeerColors.hash = i2;
                if (lc7Var2 != null && lc7Var2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new h77(this, (byte) 20));
            }
            if (!this.R4) {
                lc7 lc7Var3 = this.F3;
                if (lc7Var3 == null || lc7Var3.g() || z) {
                    this.R4 = true;
                    TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                    lc7 lc7Var4 = this.F3;
                    if (lc7Var4 != null) {
                        i = lc7Var4.b;
                    } else {
                        i = 0;
                    }
                    tL_help_getPeerProfileColors.hash = i;
                    if (lc7Var4 != null && lc7Var4.g()) {
                        tL_help_getPeerProfileColors.hash = 0;
                    }
                    getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new h77(this, (byte) 21));
                }
            }
        }
    }

    public final void K0(TLRPC.Chat chat, TLRPC.User user, pcc pccVar) {
        if (chat != null) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = h1(chat.id);
            tL_channels_getParticipant.participant = n1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new ug1(pccVar, (byte) 1));
            return;
        }
        pccVar.a(null);
    }

    public final TLRPC.TL_channels_sendAsPeers K1(long j) {
        return L1(j, false);
    }

    public final boolean K3(long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        TLRPC.InputPeer inputPeer2;
        NativeByteBuffer nativeByteBuffer;
        long y;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        if (dialog != null) {
            if (dialog.pinned == z) {
                return true;
            }
            int i = dialog.folder_id;
            ArrayList W0 = W0(i);
            dialog.pinned = z;
            if (z) {
                int i2 = 0;
                for (int i3 = 0; i3 < W0.size(); i3++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i3);
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
            h5(null);
            if (!z && !W0.isEmpty() && c00.g(1, W0) == dialog && !this.U1.get(i)) {
                qd4.v(1, W0);
            }
            getNotificationCenter().k(jn7.r, new Object[0]);
            if (!wf3.B(j) && j2 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z;
                if (inputPeer == null) {
                    inputPeer2 = j1(j);
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
                            cc4.g(e, true);
                            nativeByteBuffer = nativeByteBuffer2;
                            y = getMessagesStorage().y(nativeByteBuffer);
                            getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new e77(this, y, (byte) 9));
                            jf7 messagesStorage = getMessagesStorage();
                            messagesStorage.a.c(new gd7(messagesStorage, dialog.pinnedNum, j, (byte) 3));
                            return true;
                        }
                        y = getMessagesStorage().y(nativeByteBuffer);
                    } else {
                        y = j2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new e77(this, y, (byte) 9));
                }
            }
            jf7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new gd7(messagesStorage2, dialog.pinnedNum, j, (byte) 3));
            return true;
        }
        return false;
    }

    public final void K4() {
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

    public final void L(boolean z) {
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
            SharedPreferences e1 = e1();
            e1.getBoolean("proxy_enabled", false);
            String string = e1.getString("proxy_ip", "");
            String string2 = e1.getString("proxy_secret", "");
            if (this.s2 != 0 && this.t2 == 0 && (str = this.w2) != null) {
                if (!str.equals(string + string2)) {
                    z2 = true;
                }
            }
            int i = this.p2 + 1;
            this.p2 = i;
            this.n2 = true;
            this.o2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new lh(this, i, string, string2, (byte) 6));
            if (z2) {
                this.s2 = 0L;
                this.w2 = null;
                this.m2 = getConnectionsManager().getCurrentTime() + 3600;
                e1().edit().putLong("proxy_dialog", this.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.m2).commit();
                hl.c3(new pa7(this, (byte) 16));
            }
        }
    }

    public final wb7 L0(long j) {
        wb7 wb7Var;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.N4 == null) {
            this.N4 = new HashMap();
        }
        boolean p = getUserConfig().p();
        if (this.N4.containsKey(Long.valueOf(j))) {
            wb7Var = (wb7) this.N4.get(Long.valueOf(j));
            if (wb7Var == null || wb7Var.a == p) {
                return wb7Var;
            }
        } else {
            wb7Var = null;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = o1(j);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (i != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = h1(-j);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.N4.put(Long.valueOf(j), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new bs6(this, p, j, (byte) 1));
        return wb7Var;
    }

    public final TLRPC.TL_channels_sendAsPeers L1(long j, boolean z) {
        zh6 zh6Var;
        TLRPC.Chat M0;
        if (z) {
            zh6Var = this.v1;
        } else {
            zh6Var = this.u1;
        }
        zh6 zh6Var2 = zh6Var;
        qc7 qc7Var = (qc7) zh6Var2.f(j);
        if (qc7Var != null) {
            return qc7Var.a;
        }
        if (!z && ((M0 = M0(Long.valueOf(-j))) == null || !xc2.k(M0))) {
            return null;
        }
        ?? obj = new Object();
        zh6Var2.k(j, obj);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = j1(j);
        tL_channels_getSendAs.for_live_stories = z;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new rs0(this, zh6Var2, j, (qc7) obj, z));
        return null;
    }

    public final boolean L2(long j) {
        String str = "dialog_bar_vis3" + j;
        SharedPreferences sharedPreferences = this.W3;
        if (sharedPreferences.getInt(str, 0) != 2 || (!qu6.v("dialog_bar_report", j, sharedPreferences, false) && !qu6.v("dialog_bar_block", j, sharedPreferences, false))) {
            return false;
        }
        return true;
    }

    public final void L3(TLRPC.Chat chat, TLRPC.User user, int i, boolean z, boolean z2, boolean z3) {
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
        tL_messages_updatePinnedMessage.peer = j1(j);
        tL_messages_updatePinnedMessage.id = i;
        tL_messages_updatePinnedMessage.unpin = z;
        tL_messages_updatePinnedMessage.silent = !z3;
        tL_messages_updatePinnedMessage.pm_oneside = z2;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new qa7(this, i, chat, user, z));
    }

    public final void L4(java.io.File r9, defpackage.unb r10, boolean r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.L4(java.io.File, unb, boolean, long):void");
    }

    public final void M(long j, long j2, SparseBooleanArray sparseBooleanArray) {
        N(j, j2, sparseBooleanArray, false);
    }

    public final TLRPC.Chat M0(Long l) {
        return (TLRPC.Chat) this.b.get(l);
    }

    public final long M1(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            if (j == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull Y1 = Y1(j);
            if (Y1 != null) {
                return Y1.send_paid_messages_stars;
            }
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (X1 != null && X1.send_paid_messages_stars > 0) {
                return wf3.j(P2(X1.id));
            }
        } else if (i < 0) {
            long j2 = -j;
            TLRPC.Chat M0 = M0(Long.valueOf(j2));
            if (xc2.N(M0)) {
                return 0L;
            }
            if (xc2.p0(M0) && xc2.A(this.currentAccount, M0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull N0 = N0(j2);
            if (N0 != null) {
                return N0.send_paid_messages_stars;
            }
            if (M0 != null) {
                return M0.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public final boolean M2() {
        return !"disabled".equals(this.k4.S2.f);
    }

    public final boolean M3() {
        if (this.k4.i3.f && !getUserConfig().p()) {
            return true;
        }
        return false;
    }

    public final void M4(String str, TLRPC.User user) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = q1(user);
        tL_messages_startBot.peer = j1(user.id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new h77(this, (byte) 19));
    }

    public final void N(final long j, final long j2, final SparseBooleanArray sparseBooleanArray, final boolean z) {
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.run():void");
            }
        });
    }

    public final TLRPC.ChatFull N0(long j) {
        return (TLRPC.ChatFull) this.c1.f(j);
    }

    public final rc7 N1(long j) {
        zh6 zh6Var = this.t1;
        rc7 rc7Var = (rc7) zh6Var.f(j);
        if (rc7Var != null && (rc7Var.d || Math.abs(SystemClock.elapsedRealtime() - rc7Var.c) <= 300000)) {
            return rc7Var;
        }
        if (j >= 0 ? !lbc.v(X1(Long.valueOf(j))) : !xc2.T(M0(Long.valueOf(-j)))) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        zh6Var.k(j, obj);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = j1(j);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new p87(this, j, (Object) obj, (byte) 0));
        return null;
    }

    public final boolean N2() {
        return !"disabled".equals(this.k4.R2.f);
    }

    public final boolean N3() {
        return this.k4.i3.f;
    }

    public final void N4(final TLObject tLObject, final ArrayList arrayList, final TLRPC.TL_messages_dialogs tL_messages_dialogs, final TLRPC.TL_messages_dialogs tL_messages_dialogs2, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final SparseArray sparseArray, final ArrayList arrayList5, final HashMap hashMap, final HashSet hashSet, final Runnable runnable) {
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
                    final jf7 messagesStorage = uc7.this.getMessagesStorage();
                    to3 to3Var = messagesStorage.a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    to3Var.c(new Runnable() {
                        @Override
                        public final void run() {
                            jf7.this.V0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void O() {
        lv2 contactsController = getContactsController();
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
        Utilities.e.c(new pu2(contactsController, (byte) 4));
        MediaController.z().k();
        ip7 notificationsController = getNotificationsController();
        notificationsController.w.clear();
        notificationsController.x.clear();
        notificationsController.R = false;
        ip7.l0.c(new vo7(notificationsController, (byte) 2));
        r7a sendMessagesHelper = getSendMessagesHelper();
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
        wx9 secretChatHelper = getSecretChatHelper();
        secretChatHelper.a.clear();
        secretChatHelper.e.clear();
        secretChatHelper.b.clear();
        secretChatHelper.c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.n = false;
        id6 locationController = getLocationController();
        locationController.J.clear();
        locationController.K.b();
        locationController.c.b();
        locationController.H.b();
        locationController.d.b();
        id6.s();
        Utilities.d.c(new zc6(locationController, (byte) 2));
        ls6 mediaDataController = getMediaDataController();
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
            Utilities.e.c(new pg6((byte) 3));
        }
        mediaDataController.b0.clear();
        mediaDataController.o1 = false;
        mediaDataController.n1 = false;
        mediaDataController.j1.clear();
        mediaDataController.k1.clear();
        mediaDataController.l1.clear();
        mediaDataController.m1.clear();
        hl.c3(new ip6(mediaDataController, (byte) 5));
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
        F1().a();
        c cVar = c.T[this.currentAccount];
        if (cVar != null) {
            k35.A(cVar.M);
            cVar.J.clear();
            cVar.Q.clear();
            WalletEngine2 walletEngine2 = cVar.b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                cVar.b = null;
                cVar.d = null;
            }
            x25 x25Var = cVar.o;
            if (x25Var != null) {
                x25Var.b();
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
            cVar.r0();
            cVar.G.clear();
            t35 t35Var = cVar.t;
            if (t35Var != null) {
                t35Var.h();
                cVar.t = null;
            }
            hl.r(cVar.H);
            hl.r(cVar.I);
            synchronized (c.class) {
                if (c.T[cVar.a] == cVar) {
                    c.T[cVar.a] = null;
                }
            }
        }
        c6b c6bVar = this.e0;
        if (c6bVar != null) {
            c6bVar.p();
        }
        u8c u8cVar = this.g0;
        if (u8cVar != null) {
            u8cVar.a();
        }
        this.n3 = false;
        uj3.F4[this.currentAccount] = false;
        this.W3.edit().clear().commit();
        this.Y3.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        qu6.i(this.X3.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
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
        this.H4.clear();
        this.G4.clear();
        this.J4.b();
        this.I4.clear();
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
        this.S4.b();
        this.T4.clear();
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
        ac7[] ac7VarArr = this.N;
        ac7VarArr[1] = null;
        ac7VarArr[0] = null;
        this.G0.clear();
        this.J0.clear();
        this.K0 = false;
        this.M0.clear();
        this.L0 = false;
        this.Z3 = false;
        Utilities.d.c(new pa7(this, (byte) 13));
        this.n0.clear();
        this.o0.clear();
        this.p0.clear();
        this.x0.clear();
        int i6 = 0;
        while (true) {
            zh6[] zh6VarArr = this.Z;
            if (i6 >= zh6VarArr.length) {
                break;
            }
            zh6 zh6Var = zh6VarArr[i6];
            if (zh6Var != null) {
                zh6Var.b();
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
        Utilities.d.c(new pa7(this, (byte) 14));
        if (this.Q1 != null) {
            Utilities.d.a(this.Q1);
            this.Q1 = null;
        }
        h();
        hl.c3(new pa7(this, (byte) 15));
    }

    public final int O0(long j) {
        TLRPC.ChatFull N0 = s1(this.currentAccount).N0(-j);
        if (N0 != null && (!(N0 instanceof TLRPC.TL_chatFull) ? (N0.flags2 & 8192) != 0 : (N0.flags & 1048576) != 0)) {
            return N0.reactions_limit;
        }
        return this.k4.r3.f();
    }

    public final c6b O1() {
        c6b c6bVar = this.e0;
        if (c6bVar != null) {
            return c6bVar;
        }
        synchronized (u5[this.currentAccount]) {
            c6b c6bVar2 = this.e0;
            if (c6bVar2 != null) {
                return c6bVar2;
            }
            c6b c6bVar3 = new c6b(this.currentAccount);
            this.e0 = c6bVar3;
            return c6bVar3;
        }
    }

    public final boolean O2(long j) {
        if (j != 0 && !wf3.B(j) && j != getUserConfig().e()) {
            String str = "dialog_bar_vis3" + j;
            SharedPreferences sharedPreferences = this.W3;
            if (sharedPreferences.getInt(str, 0) == 2 && qu6.v("dialog_bar_report", j, sharedPreferences, false) && !qu6.v("dialog_bar_replied", j, sharedPreferences, false)) {
                return true;
            }
        }
        return false;
    }

    public final void O3() {
        int i = this.a4;
        if (i < 2) {
            this.a4 = i + 1;
            SharedPreferences sharedPreferences = this.X3;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.a4).apply();
            }
        }
    }

    public final void O4(long j, long j2) {
        P4(2, 0, j, j2, null);
    }

    public final void P(nc7 nc7Var) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (nc7Var.b != 0 && nc7Var.c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) nc7Var.b;
            tL_messages_readDiscussion.peer = j1(nc7Var.a);
            tL_messages_readDiscussion.read_max_id = nc7Var.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new xe2((byte) 0));
            return;
        }
        boolean B = wf3.B(nc7Var.a);
        long j = nc7Var.a;
        if (!B) {
            TLRPC.InputPeer j1 = j1(j);
            if (nc7Var.c != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = j1(nc7Var.a);
                tL_messages_readSavedHistory.peer = j1(nc7Var.c);
                tL_messages_readSavedHistory.max_id = nc7Var.d;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (j1 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = h1(-nc7Var.a);
                tL_channels_readHistory.max_id = nc7Var.d;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = j1;
                tL_messages_readHistory2.max_id = nc7Var.d;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new h77(this, (byte) 25));
            return;
        }
        TLRPC.EncryptedChat a1 = a1(Integer.valueOf((int) (j & 4294967295L)));
        byte[] bArr = a1.auth_key;
        if (bArr != null && bArr.length > 1 && (a1 instanceof TLRPC.TL_encryptedChat)) {
            TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
            tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
            tL_inputEncryptedChat.chat_id = a1.id;
            tL_inputEncryptedChat.access_hash = a1.access_hash;
            tL_messages_readEncryptedHistory.max_date = nc7Var.e;
            getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new xe2((byte) 0));
        }
    }

    public final yb7 P0(long j) {
        LongSparseArray longSparseArray = this.g5;
        yb7 yb7Var = (yb7) longSparseArray.get(j);
        if (yb7Var == null) {
            yb7 yb7Var2 = new yb7(this.currentAccount, j);
            longSparseArray.put(j, yb7Var2);
            return yb7Var2;
        }
        return yb7Var;
    }

    public final TL_account.RequirementToContact P2(long j) {
        if (!getUserConfig().p() && getUserConfig().e() != j) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.S4.f(j);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (X1 == null || X1.contact_require_premium || X1.send_paid_messages_stars != 0) {
                TLRPC.UserFull Y1 = Y1(j);
                if (Y1 != null) {
                    return lbc.q(Y1);
                }
                o1(j);
                this.T4.add(Long.valueOf(j));
                l87 l87Var = this.U4;
                hl.r(l87Var);
                hl.d3(l87Var, 60L);
            }
        }
        return null;
    }

    public final void P3(int r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.P3(int, long):void");
    }

    public final boolean P4(final int r17, int r18, final long r19, final long r21, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.P4(int, int, long, long, java.lang.String):boolean");
    }

    public final void Q(Activity activity, TLRPC.Chat chat, e eVar, bf7 bf7Var) {
        id idVar;
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = i1(chat);
        if (activity != null) {
            idVar = new id(3, null, activity);
        } else {
            idVar = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new mn0(this, activity, idVar, bf7Var, eVar, tL_channels_convertToGigagroup, (byte) 2));
        if (idVar != null) {
            idVar.setOnCancelListener(new q97(this, sendRequest, (byte) 1));
            try {
                idVar.q(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final ga6 Q0(long j) {
        TLRPC.Chat M0;
        ?? obj = new Object();
        ArrayList arrayList = (ArrayList) this.x.f(j);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                long j2 = dialog.id;
                boolean z = true;
                if (j2 < 0 && (M0 = M0(Long.valueOf(-j2))) != null && (M0.forum || (M0.monoforum && xc2.A(this.currentAccount, M0, 24)))) {
                    s1(this.currentAccount).g4.h(M0.id);
                    int i2 = obj.a;
                    int[] iArr = qyb.w;
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
                        obj.e = z3 | (!p2(dialog.id, 0L, null));
                    }
                }
            }
        }
        return obj;
    }

    public final jc Q1() {
        jc jcVar = this.j4;
        if (jcVar == null) {
            jc jcVar2 = new jc(this.currentAccount);
            this.j4 = jcVar2;
            return jcVar2;
        }
        return jcVar;
    }

    public final boolean Q3(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || wf3.n(message.peer_id) != getUserConfig().e() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long Q1 = r47.Q1(getUserConfig().e(), message);
        boolean z = false;
        for (int i = 0; i < message.reactions.results.size(); i++) {
            if (G5(Q1, w49.d(message.reactions.results.get(i).reaction), false)) {
                z = true;
            }
        }
        return z;
    }

    public final void Q4(int i, long j) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i;
        tL_channels_setBoostsToUnblockRestrictions.channel = h1(j);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new e77(this, j, (byte) 14));
    }

    public final void R(Context context, long j, e eVar, ef7 ef7Var, ea2 ea2Var) {
        id idVar;
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j;
        if (context != null) {
            idVar = new id(3, null, context);
        } else {
            idVar = null;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new p97(this, context, idVar, ef7Var, j, ea2Var, eVar, tL_messages_migrateChat));
        if (idVar != null) {
            idVar.setOnCancelListener(new q97(this, sendRequest, (byte) 0));
            try {
                idVar.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void R0(pcc pccVar) {
        if (this.b5 != null && System.currentTimeMillis() - this.a5 < 3600000) {
            if (pccVar != null) {
                pccVar.a(this.b5);
                return;
            }
            return;
        }
        ArrayList arrayList = this.Z4;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.Z4 = arrayList;
        }
        if (pccVar != null) {
            arrayList.add(pccVar);
        }
        if (this.Y4) {
            return;
        }
        this.Y4 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new h77(this, (byte) 23));
    }

    public final u8c R1() {
        u8c u8cVar = this.g0;
        if (u8cVar != null) {
            return u8cVar;
        }
        synchronized (u5[this.currentAccount]) {
            u8c u8cVar2 = this.g0;
            if (u8cVar2 != null) {
                return u8cVar2;
            }
            u8c u8cVar3 = new u8c(this.currentAccount);
            this.g0 = u8cVar3;
            return u8cVar3;
        }
    }

    public final boolean R2(boolean z) {
        ArrayList<TL_account.WebDomainException> arrayList;
        int i;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
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

    public final void R3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        hl.c3(new yg6(this, longSparseIntArray, longSparseIntArray2, (byte) 21));
    }

    public final void R4(int i, long j) {
        SharedPreferences.Editor edit = this.X3.edit();
        edit.putInt("chatPendingRequests" + j, i).apply();
    }

    public final int S(String str, ArrayList arrayList, String str2, int i, boolean z, Location location, String str3, int i2, e eVar) {
        boolean z2 = false;
        if (i == 0 && !z) {
            TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i2 >= 0) {
                tL_messages_createChat.ttl_period = i2;
                tL_messages_createChat.flags |= 1;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.User X1 = X1((Long) arrayList.get(i3));
                if (X1 != null) {
                    tL_messages_createChat.users.add(q1(X1));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new m65(this, eVar, tL_messages_createChat, (byte) 16), 2);
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
            return getConnectionsManager().sendRequest(tL_channels_createChannel, new m65(this, eVar, tL_channels_createChannel, (byte) 17), 2);
        }
    }

    public final TLRPC.Dialog S0(long j) {
        return (TLRPC.Dialog) this.R.f(j);
    }

    public final boolean S2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
        if (tL_webBrowserSettings != null && !tL_webBrowserSettings.open_external_browser) {
            return true;
        }
        return false;
    }

    public final void S3(long j, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        zh6 zh6Var = new zh6(tL_channels_channelParticipants.participants.size());
        for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
            zh6Var.k(r47.B1(channelParticipant.peer), channelParticipant);
        }
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new cq6(messagesStorage, j, zh6Var, (byte) 11));
        hl.c3(new j61((Object) this, j, (Object) zh6Var, false, (byte) 6));
    }

    public final void S4(boolean z) {
        TL_account.contentSettings contentsettings = this.b5;
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
        getConnectionsManager().sendRequest(setcontentsettings, new xe2((byte) 2));
    }

    public final long T(int i, long j) {
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
            cc4.g(e, true);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().y(nativeByteBuffer);
        }
        return getMessagesStorage().y(nativeByteBuffer);
    }

    public final ArrayList T0() {
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            return arrayList;
        }
        return this.G0;
    }

    public final boolean T2(String str) {
        boolean e2;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
        if (tL_webBrowserSettings != null && str != null) {
            String J0 = hl.J0(str, false);
            if (J0 == null) {
                J0 = hl.J0("//".concat(str), false);
            }
            if (tL_webBrowserSettings.open_external_browser) {
                e2 = !e2(J0, tL_webBrowserSettings.inapp_exceptions);
            } else {
                e2 = e2(J0, tL_webBrowserSettings.external_exceptions);
            }
            if (!e2) {
                return true;
            }
        }
        return false;
    }

    public final void T3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e97.run():void");
            }
        });
    }

    public final void T4(long j, int i, ArrayList arrayList, int i2, Boolean bool, m82 m82Var, l82 l82Var) {
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = j1(-j);
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
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new rr2(this, j, tL_messages_setChatAvailableReactions, l82Var, m82Var, (byte) 1));
        TLRPC.ChatFull N0 = N0(j);
        if (N0 != null) {
            if (N0 instanceof TLRPC.TL_channelFull) {
                N0.flags2 |= 8192;
            } else {
                N0.flags |= 1048576;
            }
            N0.reactions_limit = i2;
            if (bool != null) {
                N0.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().K1(N0, false);
        }
    }

    public final void U(long j, long j2) {
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.H(new ae7(messagesStorage, 0, j, j2, (byte) 5));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = j1(j);
        tL_messages_deleteParticipantReactions.participant = j1(j2);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new pp0((byte) 0));
    }

    public final dc7 U0(long j) {
        zh6 zh6Var = this.z4;
        dc7 dc7Var = (dc7) zh6Var.f(j);
        if (dc7Var == null) {
            dc7 dc7Var2 = new dc7(this, j);
            zh6Var.k(j, dc7Var2);
            return dc7Var2;
        }
        return dc7Var;
    }

    public final boolean U2() {
        if (!S2()) {
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
            if (tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void U3(final org.telegram.tgnet.TLRPC.messages_Messages r50, final int r51, long r52, final long r54, final int r56, final int r57, final int r58, final boolean r59, final int r60, final int r61, final int r62, final int r63, final int r64, final int r65, final boolean r66, final int r67, long r68, final int r70, final boolean r71, final int r72, final boolean r73, final boolean r74, final defpackage.qsb r75) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.U3(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, qsb):void");
    }

    public final void U4(long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, e eVar) {
        if (tL_chatBannedRights == null) {
            return;
        }
        TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = j1(-j);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new ic((byte) 0), new ua7(this, j, eVar, tL_messages_editChatDefaultBannedRights, z));
    }

    public final void V(int i, long j, boolean z) {
        W(j, 1, i, 0, z, null, 0L);
    }

    public final int V0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i = dialog.unread_count;
        TLRPC.Chat M0 = M0(Long.valueOf(-dialog.id));
        if (M0 != null && (M0.forum || M0.monoforum)) {
            this.g4.h(-dialog.id);
            return qyb.w[0];
        }
        return i;
    }

    public final void V3(int i, int i2, long j) {
        if (f11.a) {
            ik8.q(j, bs2.p("processNewChannelDifferenceParams pts = ", i, " pts_count = ", i2, " channeldId = "));
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
            if (f11.a) {
                cc4.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j, i);
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new gd7(messagesStorage, i, j, (byte) 5));
        } else if (i3 != i) {
            LongSparseLongArray longSparseLongArray = this.O0;
            long j2 = longSparseLongArray.get(j);
            if (!((Boolean) this.Q0.g(j, Boolean.FALSE)).booleanValue() && j2 != 0 && Math.abs(System.currentTimeMillis() - j2) > 1500) {
                I0(j);
                return;
            }
            if (f11.a) {
                cc4.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i + " pts_count = " + i2);
            }
            if (j2 == 0) {
                longSparseLongArray.put(j, System.currentTimeMillis());
            }
            TLRPC.Updates updates = new TLRPC.Updates();
            updates.pts = i;
            updates.pts_count = i2;
            updates.chat_id = j;
            zh6 zh6Var = this.N0;
            ArrayList arrayList = (ArrayList) zh6Var.f(j);
            if (arrayList == null) {
                arrayList = qd4.s(zh6Var, j);
            }
            arrayList.add(updates);
        }
    }

    public final void V4(int i, long j) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = j1(j);
        tL_messages_setHistoryTTL.period = i;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new h77(this, (byte) 4));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j);
        if (dialog != null) {
            dialog.ttl_period = i;
        }
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new gd7(messagesStorage, i, j, (byte) 1));
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.ChatFull chatFull = null;
        if (i2 > 0) {
            userFull = Y1(j);
            if (userFull != null) {
                userFull.ttl_period = i;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull N0 = N0(-j);
            if (N0 != null) {
                N0.ttl_period = i;
                boolean z = N0 instanceof TLRPC.TL_channelFull;
                int i3 = N0.flags;
                if (z) {
                    N0.flags = i3 | 16777216;
                } else {
                    N0.flags = i3 | 16384;
                }
            }
            chatFull = N0;
            userFull = null;
        }
        if (chatFull != null) {
            jn7 notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(jn7.T, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(jn7.E0, Long.valueOf(j), userFull);
        }
    }

    public final void W(long r32, int r34, int r35, int r36, boolean r37, org.telegram.tgnet.TLRPC.InputPeer r38, long r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.W(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public final ArrayList W0(int i) {
        ArrayList arrayList = (ArrayList) this.w.get(i);
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final long W1(int i) {
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

    public final void W2(TLRPC.TL_help_appConfig tL_help_appConfig) {
        boolean z;
        int i;
        char c;
        TLRPC.TL_jsonObject tL_jsonObject;
        hr hrVar;
        int i2;
        boolean z2;
        int i3;
        int i4;
        TLRPC.TL_jsonObject tL_jsonObject2;
        boolean z3;
        long parseLong;
        boolean z4;
        int i5;
        boolean G4;
        HashMap hashMap;
        TLRPC.TL_jsonObject tL_jsonObject3;
        int i6;
        int i7;
        int i8;
        int intValue;
        char c2;
        int i9;
        int i10;
        ArrayList<TLRPC.TL_jsonObjectValue> arrayList;
        char c3;
        int i11;
        HashMap hashMap2;
        int i12;
        int i13;
        if (tL_help_appConfig != null) {
            TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                TLRPC.TL_jsonObject tL_jsonObject4 = (TLRPC.TL_jsonObject) jSONValue;
                SharedPreferences sharedPreferences = this.X3;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.K3 = new HashSet();
                sharedPreferences.edit().remove("ignoreRestrictionReasons").apply();
                hr hrVar2 = this.k4;
                js2 js2Var = hrVar2.a;
                HashMap hashMap3 = js2Var.a;
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size = tL_jsonObject4.value.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject4.value.get(i14);
                    yr2 yr2Var = (yr2) hashMap3.get(tL_jsonObjectValue.key);
                    if (yr2Var != null && tL_jsonObjectValue.value != null) {
                        hashSet.add(yr2Var);
                        if (yr2Var.b(edit, tL_jsonObjectValue.value) && !arrayList2.contains(yr2Var)) {
                            arrayList2.add(yr2Var);
                        }
                    }
                }
                for (yr2 yr2Var2 : hashMap3.values()) {
                    if (!hashSet.contains(yr2Var2) && yr2Var2.c(edit)) {
                        arrayList2.add(yr2Var2);
                    }
                }
                js2Var.c.addAll(arrayList2);
                int size2 = tL_jsonObject4.value.size();
                boolean z5 = !arrayList2.isEmpty();
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                TLRPC.TL_jsonObject tL_jsonObject5 = null;
                boolean z6 = false;
                while (i15 < size2) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObject4.value.get(i15);
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
                    switch (c) {
                        case 0:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                            if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                                try {
                                    parseLong = Long.parseLong(((TLRPC.TL_jsonString) jSONValue2).value);
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                if (parseLong != this.L3) {
                                    this.L3 = parseLong;
                                    edit.putLong("telegramAntispamUserId", parseLong);
                                    z5 = true;
                                    tL_jsonObject5 = tL_jsonObject2;
                                    z6 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case 1:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue3 = tL_jsonObjectValue2.value;
                            if ((jSONValue3 instanceof TLRPC.TL_jsonBool) && (z4 = ((TLRPC.TL_jsonBool) jSONValue3).value) != this.n3) {
                                this.n3 = z4;
                                edit.putBoolean("showFiltersTooltip", z4);
                                getNotificationCenter().k(jn7.R2, new Object[0]);
                                z5 = true;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 2:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 3:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue6 = tL_jsonObjectValue2.value;
                            if (jSONValue6 instanceof TLRPC.TL_jsonObject) {
                                tL_jsonObject5 = (TLRPC.TL_jsonObject) jSONValue6;
                                z5 = z2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case 4:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue7 = tL_jsonObjectValue2.value;
                            if ((jSONValue7 instanceof TLRPC.TL_jsonNumber) && (i5 = (int) ((TLRPC.TL_jsonNumber) jSONValue7).value) > 0) {
                                xea.v(i5 - 1);
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 5:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 6:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                    tL_jsonObject5 = tL_jsonObject2;
                                    z6 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case 7:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue11 = tL_jsonObjectValue2.value;
                            if (jSONValue11 instanceof TLRPC.TL_jsonArray) {
                                G4 = G4("premiumFeaturesTypesToPosition", this.E0, edit, ((TLRPC.TL_jsonArray) jSONValue11).value);
                                z5 = z2 | G4;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case '\b':
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue12 = tL_jsonObjectValue2.value;
                            if (jSONValue12 instanceof TLRPC.TL_jsonArray) {
                                G4 = G4("businessFeaturesTypesToPosition", this.F0, edit, ((TLRPC.TL_jsonArray) jSONValue12).value);
                                z5 = z2 | G4;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case '\t':
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            try {
                                hashMap = new HashMap();
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
                                                    i8 = size5;
                                                    if ("value".equals(tL_jsonObjectValue4.key)) {
                                                        i24 = (int) ((TLRPC.TL_jsonNumber) tL_jsonObjectValue4.value).value;
                                                    } else if ("frame_start".equals(tL_jsonObjectValue4.key)) {
                                                        i23 = (int) ((TLRPC.TL_jsonNumber) tL_jsonObjectValue4.value).value;
                                                    }
                                                } else {
                                                    i8 = size5;
                                                }
                                                i22++;
                                                tL_jsonObject6 = tL_jsonObject8;
                                                size5 = i8;
                                            }
                                            tL_jsonObject3 = tL_jsonObject6;
                                            i6 = size5;
                                            if (i23 != Integer.MAX_VALUE && (i7 = i24) != Integer.MAX_VALUE) {
                                                hashMap.put(tL_jsonObjectValue3.key.replace("️", ""), new ec7(i23, i7));
                                            }
                                        } else {
                                            tL_jsonObject3 = tL_jsonObject6;
                                            i6 = size5;
                                        }
                                        i21++;
                                        tL_jsonObject6 = tL_jsonObject3;
                                        size5 = i6;
                                    }
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            if (!this.A3.equals(hashMap)) {
                                this.A3 = hashMap;
                                SerializedData serializedData = new SerializedData();
                                serializedData.writeInt32(this.A3.size());
                                for (Map.Entry entry : this.A3.entrySet()) {
                                    serializedData.writeString((String) entry.getKey());
                                    ec7 ec7Var = (ec7) entry.getValue();
                                    serializedData.writeInt32(ec7Var.a);
                                    serializedData.writeInt32(ec7Var.b);
                                }
                                edit.putString("diceSuccess", Base64.encodeToString(serializedData.toByteArray(), 0));
                                serializedData.cleanup();
                                z5 = true;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case '\n':
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                    edit.putString("stargiftsCraftAttributesPermilles", (String) DesugarArrays.stream(iArr).map(new yz((byte) 14)).collect(Collectors.joining(",,")));
                                    tL_jsonObject5 = tL_jsonObject2;
                                    z6 = z3;
                                    i16 = i4;
                                    z5 = true;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 11:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case '\f':
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                tL_jsonObject5 = tL_jsonObject2;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case '\r':
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue19 = tL_jsonObjectValue2.value;
                            if (jSONValue19 instanceof TLRPC.TL_jsonString) {
                                String str3 = ((TLRPC.TL_jsonString) jSONValue19).value;
                                if (!Objects.equals(f11.h, str3)) {
                                    f11.h = str3;
                                    edit.putString("googleAuthClientId", str3);
                                    z5 = true;
                                    tL_jsonObject5 = tL_jsonObject2;
                                    z6 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                        case 14:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            } else {
                                if ((jSONValue20 instanceof TLRPC.TL_jsonString) && (intValue = Utilities.z(((TLRPC.TL_jsonString) jSONValue20).value).intValue()) != this.h3) {
                                    this.h3 = intValue;
                                    edit.putInt("updateCheckDelay", intValue);
                                }
                                z5 = z2;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                            }
                            z5 = true;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 15:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                                        i11 = 2;
                                                        break;
                                                    case 1:
                                                        i11 = 1;
                                                        break;
                                                    case 2:
                                                        i11 = 0;
                                                        break;
                                                    case 3:
                                                        i11 = 3;
                                                        break;
                                                    default:
                                                        i11 = -1;
                                                        break;
                                                }
                                                if (i11 >= 0) {
                                                    iArr2[(i30 * 7) + i11] = i33;
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
                                                        i9 = 4;
                                                        break;
                                                    case 1:
                                                        i9 = 5;
                                                        break;
                                                    case 2:
                                                        i9 = 6;
                                                        break;
                                                    default:
                                                        i9 = -1;
                                                        break;
                                                }
                                                if (i9 >= 0) {
                                                    try {
                                                        i10 = i30;
                                                        arrayList = arrayList4;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i10 = i30;
                                                        arrayList = arrayList4;
                                                    }
                                                    try {
                                                        iArr2[(i10 * 7) + i9] = (int) Long.parseLong("FF" + str5, 16);
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        cc4.g(e, true);
                                                        i31 = i32;
                                                        i30 = i10;
                                                        arrayList4 = arrayList;
                                                    }
                                                    i31 = i32;
                                                    i30 = i10;
                                                    arrayList4 = arrayList;
                                                }
                                            }
                                            i10 = i30;
                                            arrayList = arrayList4;
                                            i31 = i32;
                                            i30 = i10;
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
                                edit.putString("starsGroupcallMessageLimits", (String) DesugarArrays.stream(iArr2).mapToObj(new g87((byte) 1)).collect(Collectors.joining(",")));
                                z5 = true;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 16:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue24 = tL_jsonObjectValue2.value;
                            if (jSONValue24 instanceof TLRPC.TL_jsonNumber) {
                                i17 = (int) ((TLRPC.TL_jsonNumber) jSONValue24).value;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 17:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            TLRPC.JSONValue jSONValue25 = tL_jsonObjectValue2.value;
                            if (jSONValue25 instanceof TLRPC.TL_jsonNumber) {
                                i16 = (int) ((TLRPC.TL_jsonNumber) jSONValue25).value;
                                z5 = z2;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 18:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                edit.putStringSet("whitelistedBots", (Set) Collection.EL.stream(hashSet4).map(new yz((byte) 13)).collect(Collectors.toCollection(new zl1((byte) 1))));
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 19:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
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
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                                z5 = true;
                                break;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        case 20:
                            tL_jsonObject = tL_jsonObject4;
                            try {
                                hashMap2 = new HashMap();
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
                                            TLRPC.TL_jsonObject tL_jsonObject10 = tL_jsonObject9;
                                            TLRPC.JSONValue jSONValue30 = tL_jsonObjectValue6.value;
                                            int i38 = i37;
                                            if (jSONValue30 instanceof TLRPC.TL_jsonObject) {
                                                TLRPC.TL_jsonObject tL_jsonObject11 = (TLRPC.TL_jsonObject) jSONValue30;
                                                int size13 = tL_jsonObject11.value.size();
                                                hrVar = hrVar2;
                                                i12 = size12;
                                                i3 = i15;
                                                i4 = i16;
                                                tL_jsonObject2 = tL_jsonObject5;
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
                                                            i13 = i39;
                                                            if ("id".equals(tL_jsonObjectValue7.key)) {
                                                                j2 = Utilities.A(((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value).longValue();
                                                            } else if ("access_hash".equals(tL_jsonObjectValue7.key)) {
                                                                j = Utilities.A(((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value).longValue();
                                                            } else if ("file_reference_base64".equals(tL_jsonObjectValue7.key)) {
                                                                str7 = ((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value;
                                                            }
                                                        } else {
                                                            i13 = i39;
                                                        }
                                                        i39 = i13 + 1;
                                                        size13 = i40;
                                                        tL_jsonObject11 = tL_jsonObject12;
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        cc4.g(e, true);
                                                        z5 = z2;
                                                        tL_jsonObject5 = tL_jsonObject2;
                                                        z6 = z3;
                                                        i16 = i4;
                                                        i15 = i3 + 1;
                                                        tL_jsonObject4 = tL_jsonObject;
                                                        size2 = i2;
                                                        hrVar2 = hrVar;
                                                    }
                                                }
                                                if (j2 != 0 && j != 0 && str7 != null) {
                                                    String replace = tL_jsonObjectValue6.key.replace("️", "");
                                                    ?? obj = new Object();
                                                    obj.a = j2;
                                                    obj.b = j;
                                                    obj.c = Base64.decode(str7, 8);
                                                    hashMap2.put(replace, obj);
                                                }
                                            } else {
                                                hrVar = hrVar2;
                                                i12 = size12;
                                                i3 = i15;
                                                i4 = i16;
                                                tL_jsonObject2 = tL_jsonObject5;
                                                z3 = z6;
                                            }
                                            i37 = i38 + 1;
                                            tL_jsonObject9 = tL_jsonObject10;
                                            size12 = i12;
                                            z5 = z2;
                                            tL_jsonObject5 = tL_jsonObject2;
                                            z6 = z3;
                                            i15 = i3;
                                            i16 = i4;
                                            hrVar2 = hrVar;
                                        } catch (Exception e6) {
                                            e = e6;
                                            hrVar = hrVar2;
                                            i3 = i15;
                                            i4 = i16;
                                            tL_jsonObject2 = tL_jsonObject5;
                                            z3 = z6;
                                            cc4.g(e, true);
                                            z5 = z2;
                                            tL_jsonObject5 = tL_jsonObject2;
                                            z6 = z3;
                                            i16 = i4;
                                            i15 = i3 + 1;
                                            tL_jsonObject4 = tL_jsonObject;
                                            size2 = i2;
                                            hrVar2 = hrVar;
                                        }
                                    }
                                } else {
                                    i2 = size2;
                                }
                                hrVar = hrVar2;
                                z2 = z5;
                                i3 = i15;
                                i4 = i16;
                                tL_jsonObject2 = tL_jsonObject5;
                                z3 = z6;
                            } catch (Exception e7) {
                                e = e7;
                                hrVar = hrVar2;
                                i2 = size2;
                                z2 = z5;
                            }
                            if (!this.B3.equals(hashMap2)) {
                                this.B3 = hashMap2;
                                SerializedData serializedData3 = new SerializedData();
                                serializedData3.writeInt32(this.B3.size());
                                for (Map.Entry entry2 : this.B3.entrySet()) {
                                    serializedData3.writeString((String) entry2.getKey());
                                    fc7 fc7Var = (fc7) entry2.getValue();
                                    serializedData3.writeInt64(fc7Var.a);
                                    serializedData3.writeInt64(fc7Var.b);
                                    serializedData3.writeByteArray(fc7Var.c);
                                }
                                edit.putString("emojiSounds", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                                z5 = true;
                                tL_jsonObject5 = tL_jsonObject2;
                                z6 = z3;
                                i16 = i4;
                            }
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
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
                                    TLRPC.TL_jsonObject tL_jsonObject13 = tL_jsonObject4;
                                    TLRPC.JSONValue jSONValue32 = tL_jsonArray9.value.get(i41);
                                    TLRPC.TL_jsonArray tL_jsonArray10 = tL_jsonArray9;
                                    if (jSONValue32 instanceof TLRPC.TL_jsonString) {
                                        hashSet6.add(((TLRPC.TL_jsonString) jSONValue32).value.toLowerCase());
                                    }
                                    i41++;
                                    tL_jsonArray9 = tL_jsonArray10;
                                    tL_jsonObject4 = tL_jsonObject13;
                                }
                            }
                            tL_jsonObject = tL_jsonObject4;
                            if (!this.M3.equals(hashSet6)) {
                                this.M3 = hashSet6;
                                edit.putStringSet("starrefStartParamPrefixes", hashSet6);
                                hrVar = hrVar2;
                                i2 = size2;
                                i3 = i15;
                                z5 = true;
                                break;
                            }
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                        default:
                            tL_jsonObject = tL_jsonObject4;
                            hrVar = hrVar2;
                            i2 = size2;
                            z2 = z5;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject2 = tL_jsonObject5;
                            z3 = z6;
                            z5 = z2;
                            tL_jsonObject5 = tL_jsonObject2;
                            z6 = z3;
                            i16 = i4;
                            break;
                    }
                    i15 = i3 + 1;
                    tL_jsonObject4 = tL_jsonObject;
                    size2 = i2;
                    hrVar2 = hrVar;
                }
                hr hrVar3 = hrVar2;
                boolean z7 = z5;
                int i42 = i16;
                TLRPC.TL_jsonObject tL_jsonObject14 = tL_jsonObject5;
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
                    hl.c3(new l87(this, (byte) 8));
                    z = true;
                }
                if (z) {
                    edit.apply();
                    hl.c3(new l87(this, (byte) 21));
                }
                if (tL_jsonObject14 != null) {
                    for (int i43 = 0; i43 < tL_jsonObject14.value.size(); i43++) {
                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue8 = tL_jsonObject14.value.get(i43);
                        if ("settings_mask".equals(tL_jsonObjectValue8.key)) {
                            TLRPC.JSONValue jSONValue33 = tL_jsonObjectValue8.value;
                            if (jSONValue33 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList6 = ((TLRPC.TL_jsonArray) jSONValue33).value;
                                try {
                                    i86.a = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(0)).value;
                                    i86.b = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(1)).value;
                                    i86.c = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(2)).value;
                                } catch (Exception e8) {
                                    cc4.g(e8, true);
                                }
                            }
                        }
                        if ("battery_low".equals(tL_jsonObjectValue8.key)) {
                            TLRPC.JSONValue jSONValue34 = tL_jsonObjectValue8.value;
                            if (jSONValue34 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList7 = ((TLRPC.TL_jsonArray) jSONValue34).value;
                                try {
                                    i86.d = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(0)).value;
                                    i86.e = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(1)).value;
                                    i86.f = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(2)).value;
                                } catch (Exception e9) {
                                    cc4.g(e9, true);
                                }
                            }
                        }
                    }
                    i = 0;
                    i86.g();
                } else {
                    i = 0;
                }
                js2 js2Var2 = hrVar3.a;
                js2Var2.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList8 = js2Var2.c;
                int size15 = arrayList8.size();
                for (int i44 = i; i44 < size15; i44++) {
                    linkedHashSet.addAll(((yr2) arrayList8.get(i44)).c);
                }
                arrayList8.clear();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    try {
                        ((Runnable) it.next()).run();
                    } catch (Exception e10) {
                        cc4.g(e10, true);
                    }
                }
                if (z8) {
                    hl.c3(new l87(this, (byte) 23));
                }
            }
        }
        l87 l87Var = this.w4;
        hl.r(l87Var);
        hl.d3(l87Var, 240010L);
    }

    public final void W3(int i, int i2, int i3) {
        if (f11.a) {
            c00.q(i3, bs2.p("processNewDifferenceParams seq = -1 pts = ", i, " date = ", i2, " pts_count = "));
        }
        if (i != -1) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.G();
            if (messagesStorage.r + i3 == i) {
                if (f11.a) {
                    cc4.b("APPLY PTS");
                }
                getMessagesStorage().F1(i);
                jf7 messagesStorage2 = getMessagesStorage();
                jf7 messagesStorage3 = getMessagesStorage();
                messagesStorage3.G();
                int i4 = messagesStorage3.w;
                jf7 messagesStorage4 = getMessagesStorage();
                messagesStorage4.G();
                int i5 = messagesStorage4.r;
                jf7 messagesStorage5 = getMessagesStorage();
                messagesStorage5.G();
                int i6 = messagesStorage5.n;
                jf7 messagesStorage6 = getMessagesStorage();
                messagesStorage6.G();
                messagesStorage2.x1(i4, i5, i6, messagesStorage6.s);
                return;
            }
            jf7 messagesStorage7 = getMessagesStorage();
            messagesStorage7.G();
            if (messagesStorage7.r != i) {
                if (!this.Y1 && this.Z0 != 0 && Math.abs(System.currentTimeMillis() - this.Z0) > 1500) {
                    X0();
                    return;
                }
                if (f11.a) {
                    cc4.b("ADD UPDATE TO QUEUE pts = " + i + " pts_count = " + i3);
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

    public final void W4(ac7 ac7Var, boolean z) {
        if (ac7Var != null) {
            Integer valueOf = Integer.valueOf(ac7Var.a);
            HashSet hashSet = this.n4;
            if (z != hashSet.contains(valueOf)) {
                int i = ac7Var.a;
                if (z) {
                    hashSet.add(Integer.valueOf(i));
                } else {
                    hashSet.remove(Integer.valueOf(i));
                }
                K4();
                h5(null);
                getNotificationCenter().k(jn7.P2, Integer.valueOf(ac7Var.a));
            }
        }
    }

    public final void X(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, int i, boolean z, int i2) {
        Y(arrayList, arrayList2, encryptedChat, j, z, i2, false, 0L, null, i);
    }

    public final void X0() {
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        int i = messagesStorage.r;
        jf7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.G();
        int i2 = messagesStorage2.n;
        jf7 messagesStorage3 = getMessagesStorage();
        messagesStorage3.G();
        Y0(i, i2, messagesStorage3.s, false);
    }

    public final TLRPC.User X1(Long l) {
        if (l.longValue() == 0) {
            return yac.h(this.currentAccount).f();
        }
        return (TLRPC.User) this.d.get(l);
    }

    public final boolean X3(java.util.ArrayList r98, final java.util.ArrayList r99, final java.util.ArrayList r100, boolean r101, final int r102) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.X3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void X4(long j, long j2) {
        this.X3.edit().putLong(qu6.n(j, "forumlasttopic"), j2).apply();
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2) {
        Z(arrayList, arrayList2, encryptedChat, j, z, i, z2, j2, tLObject, i2, false, 0);
    }

    public final void Y0(int i, int i2, int i3, boolean z) {
        k4(xea.e, xea.f);
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        if (messagesStorage.r == 0) {
            if (!this.a2) {
                this.a2 = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new h77(this, (byte) 22));
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
            if (f11.a) {
                StringBuilder p = bs2.p("start getDifference with date = ", i2, " pts = ", i, " qts = ");
                p.append(i3);
                cc4.b(p.toString());
                cc4.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new ln6(this, i2, i3, (byte) 1));
        }
    }

    public final TLRPC.UserFull Y1(long j) {
        return (TLRPC.UserFull) this.b1.f(j);
    }

    public final void Y2(int r64, java.util.ArrayList r65, java.util.ArrayList r66, java.util.ArrayList r67, java.util.ArrayList r68, defpackage.zh6 r69, int r70, org.telegram.messenger.support.LongSparseIntArray r71, defpackage.zh6 r72, defpackage.zh6 r73, java.util.ArrayList r74, defpackage.zh6 r75, defpackage.zh6 r76, defpackage.n44 r77, defpackage.zh6 r78, boolean r79, java.util.ArrayList r80, java.util.ArrayList r81, defpackage.zh6 r82, defpackage.zh6 r83, defpackage.zh6 r84, java.util.ArrayList r85) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.Y2(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, zh6, int, org.telegram.messenger.support.LongSparseIntArray, zh6, zh6, java.util.ArrayList, zh6, zh6, n44, zh6, boolean, java.util.ArrayList, java.util.ArrayList, zh6, zh6, zh6, java.util.ArrayList):void");
    }

    public final void Y3(org.telegram.tgnet.TLRPC.Updates r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.Y3(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public final void Y4(long j, boolean z, boolean z2) {
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
                        ((r47) sparseArray.valueAt(i)).v0 = false;
                    }
                }
            }
        }
        Utilities.d.c(new cm1(this, z, z2, j, (byte) 3));
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2, boolean z3, int i3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        byte b;
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
        boolean z10;
        long y4;
        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages;
        byte b2;
        long j4;
        char c;
        char c2;
        long j5;
        long j6 = j;
        if (i == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        char c3 = 5;
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
                if (j6 != 0 && wf3.y(j6)) {
                    TLRPC.Chat M0 = M0(Long.valueOf(-j6));
                    if (xc2.T(M0)) {
                        j5 = M0.id;
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
                    c = 5;
                } else if (z5) {
                    if (i == 5) {
                        b19 f = b19.f(this.currentAccount);
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
                                    a19 a19Var = (a19) arrayList5.get(i7);
                                    c2 = c3;
                                    if (a19Var.h.contains(num2)) {
                                        a19Var.h.remove(num2);
                                        if (a19Var.a() <= 0) {
                                            arrayList5.remove(a19Var);
                                        }
                                        jn7.f(f.a).k(jn7.F1, new Object[0]);
                                    } else {
                                        i7++;
                                        c3 = c2;
                                    }
                                } else {
                                    c2 = c3;
                                    break;
                                }
                            }
                            c3 = c2;
                        }
                    }
                    c = c3;
                    j6 = j;
                    i4 = i2;
                    getMessagesStorage().M0(j6, arrayList, true, false, 5, i4);
                } else {
                    c = 5;
                    if (z6) {
                        j6 = j;
                        i4 = i2;
                        getMessagesStorage().M0(j6, arrayList, true, false, 9, i4);
                    } else {
                        if (j4 == 0) {
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                r47 r47Var = (r47) this.V.get(((Integer) arrayList.get(i8)).intValue());
                                if (r47Var != null) {
                                    r47Var.Z = true;
                                }
                            }
                        } else {
                            t3(arrayList, j);
                        }
                        i4 = i2;
                        getMessagesStorage().M0(j, arrayList, true, z, 0, i4);
                        j6 = j;
                        j3 = j4;
                        getMessagesStorage().O1(j6, j3, arrayList, null);
                        jn7 notificationCenter = getNotificationCenter();
                        Long valueOf = Long.valueOf(j3);
                        Boolean valueOf2 = Boolean.valueOf(z4);
                        Boolean valueOf3 = Boolean.valueOf(z3);
                        Integer valueOf4 = Integer.valueOf(i3);
                        Object[] objArr = new Object[6];
                        objArr[0] = arrayList;
                        objArr[1] = valueOf;
                        objArr[2] = valueOf2;
                        b = 3;
                        objArr[3] = Boolean.FALSE;
                        objArr[4] = valueOf3;
                        objArr[c] = valueOf4;
                        notificationCenter.k(jn7.v, objArr);
                    }
                }
                j3 = j4;
                jn7 notificationCenter2 = getNotificationCenter();
                Long valueOf5 = Long.valueOf(j3);
                Boolean valueOf22 = Boolean.valueOf(z4);
                Boolean valueOf32 = Boolean.valueOf(z3);
                Integer valueOf42 = Integer.valueOf(i3);
                Object[] objArr2 = new Object[6];
                objArr2[0] = arrayList;
                objArr2[1] = valueOf5;
                objArr2[2] = valueOf22;
                b = 3;
                objArr2[3] = Boolean.FALSE;
                objArr2[4] = valueOf32;
                objArr2[c] = valueOf42;
                notificationCenter2.k(jn7.v, objArr2);
            } else {
                i4 = i2;
                b = 3;
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
                        b2 = 1;
                    } else {
                        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages2 = new TLRPC.TL_messages_deleteScheduledMessages();
                        tL_messages_deleteScheduledMessages2.id = arrayList3;
                        tL_messages_deleteScheduledMessages2.peer = j1(j6);
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
                            z10 = true;
                        } catch (Exception e2) {
                            e = e2;
                            nativeByteBuffer8 = nativeByteBuffer9;
                            z9 = true;
                            cc4.g(e, z9);
                            nativeByteBuffer9 = nativeByteBuffer8;
                            z10 = z9;
                            y4 = getMessagesStorage().y(nativeByteBuffer9);
                            tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                            b2 = z10;
                            getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new e77(this, y4, b2));
                        }
                        y4 = getMessagesStorage().y(nativeByteBuffer9);
                        tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                        b2 = z10;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new e77(this, y4, b2));
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
                            cc4.g(e, z8);
                            nativeByteBuffer7 = nativeByteBuffer6;
                            y3 = getMessagesStorage().y(nativeByteBuffer7);
                            tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new e77(this, y3, (byte) 2));
                        }
                        y3 = getMessagesStorage().y(nativeByteBuffer7);
                        tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new e77(this, y3, (byte) 2));
                } else if (j3 != 0) {
                    if (tLObject != null) {
                        tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                        y2 = j2;
                    } else {
                        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                        tL_channels_deleteMessages2.id = arrayList3;
                        tL_channels_deleteMessages2.channel = h1(j3);
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
                            cc4.g(e, z7);
                            nativeByteBuffer5 = nativeByteBuffer4;
                            y2 = getMessagesStorage().y(nativeByteBuffer5);
                            tL_channels_deleteMessages = tL_channels_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_channels_deleteMessages, new v77(this, j3, y2, (byte) 0));
                        }
                        y2 = getMessagesStorage().y(nativeByteBuffer5);
                        tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new v77(this, j3, y2, (byte) 0));
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
                            cc4.g(e, true);
                            nativeByteBuffer3 = nativeByteBuffer2;
                            y = getMessagesStorage().y(nativeByteBuffer3);
                            tL_messages_deleteMessages = tL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tL_messages_deleteMessages, new e77(this, y, b));
                        }
                        y = getMessagesStorage().y(nativeByteBuffer3);
                        tL_messages_deleteMessages = tL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_deleteMessages, new e77(this, y, b));
                }
            }
        }
    }

    public final TLRPC.TL_availableEffect Z0(long j) {
        E0();
        if (this.W4 != null) {
            for (int i = 0; i < this.W4.effects.size(); i++) {
                if (this.W4.effects.get(i).id == j) {
                    return this.W4.effects.get(i);
                }
            }
            return null;
        }
        return null;
    }

    public final int Z2(final long j, final long j2, final boolean z, boolean z2, final icc iccVar) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = h1(j2);
        tL_communities_togglePeerLink.peer = j1(j);
        tL_communities_togglePeerLink.deleted = z;
        tL_communities_togglePeerLink.visible = !z2;
        tL_communities_togglePeerLink.hidden = z2;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new ic((byte) 0), new icc() {
            @Override
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat M0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                uc7 uc7Var = uc7.this;
                long j3 = j;
                icc iccVar2 = iccVar;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (M0 = uc7Var.M0(Long.valueOf(-j3))) != null) {
                    uc7Var.Z2(j3, M0.linked_community_id, true, false, iccVar2);
                    return;
                }
                boolean z3 = bool instanceof TLRPC.TL_boolTrue;
                long j4 = j2;
                if (z3) {
                    long j5 = 0;
                    int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    boolean z4 = z;
                    if (i > 0) {
                        TLRPC.User X1 = uc7Var.X1(Long.valueOf(j3));
                        if (X1 != null) {
                            if (!z4) {
                                j5 = j4;
                            }
                            X1.linked_community_id = j5;
                            X1.flags2 = vsd.b(X1.flags2, 2097152, !z4);
                        }
                    } else {
                        TLRPC.Chat M02 = uc7Var.M0(Long.valueOf(-j3));
                        if (M02 != null) {
                            if (!z4) {
                                j5 = j4;
                            }
                            M02.linked_community_id = j5;
                            M02.flags2 = vsd.b(M02.flags2, 1048576, !z4);
                        }
                    }
                }
                uc7Var.e3(0, j4, true);
                iccVar2.a(bool, tL_error);
            }
        });
    }

    public final void Z3(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.Z3(int, int):void");
    }

    public final void Z4(long j, boolean z, boolean z2) {
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

    public final void a(long j, boolean z) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        if (dialog == null) {
            return;
        }
        if (z) {
            this.v0.k(j, dialog);
        } else {
            this.u0.k(j, dialog);
            this.y.remove(dialog);
            h5(null);
        }
        getNotificationCenter().k(jn7.r, Boolean.TRUE);
    }

    public final void a0(long j, long j2, ArrayList arrayList) {
        getMessagesStorage().a.c(new q77(this, arrayList, j2, j));
    }

    public final TLRPC.EncryptedChat a1(Integer num) {
        return (TLRPC.EncryptedChat) this.c.get(num);
    }

    public final kbc a2() {
        kbc kbcVar = this.L2;
        if (kbcVar == null) {
            kbc kbcVar2 = new kbc(this.currentAccount);
            this.L2 = kbcVar2;
            return kbcVar2;
        }
        return kbcVar;
    }

    public final void a3(boolean z) {
        hl.r(this.w4);
        sb7 sb7Var = this.M2;
        if (z) {
            sb7Var.d(this.currentAccount, 0);
        }
        sb7Var.c(this.currentAccount, 0, new mb7(this, (byte) 1));
    }

    public final void a4(TLRPC.Chat chat, boolean z) {
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
                x5(-chat.id, chat.emoji_status);
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
                            LruCache lruCache = a2().b;
                            String str = chat2.username;
                            if (str != null && !TextUtils.equals(str, chat.username)) {
                                lruCache.remove(chat2.username);
                                String str2 = chat.username;
                                if (str2 != null) {
                                    lruCache.put(str2, new jbc(-chat.id));
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
                                getNotificationCenter().k(jn7.u5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
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
                                hl.c3(new d97(this, chat, (byte) 2));
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
                    hl.c3(new d97(this, chat, (byte) 3));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    hl.c3(new d97(this, chat, (byte) 4));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j2 = chat.id;
                    if (N0(j2) == null) {
                        getMessagesStorage().C0(j2, false, null, false, false, 0);
                        e3(0, j2, false);
                    }
                }
            }
        }
    }

    public final void a5(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, e eVar, z21 z21Var) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = h1(j);
        if (user != null) {
            tL_channels_editBanned.participant = n1(user);
        } else {
            tL_channels_editBanned.participant = l1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new k65(this, j, z21Var, eVar, tL_channels_editBanned, z));
    }

    public final int b(int i, int i2, long j) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        return c(arrayList, i, i2, null, 0L);
    }

    public final void b0(long j, long j2, int i, int i2, boolean z, gn1 gn1Var) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = j1(j);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i;
        tL_messages_deleteHistory.max_date = i2;
        tL_messages_deleteHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new bb7(this, j, i, i2, j2, z, gn1Var));
    }

    public final TLRPC.EncryptedChat b1(int i, boolean z) {
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
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.a.c(new ba7(messagesStorage, i, arrayList, countDownLatch, (byte) 26));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (arrayList.size() == 2) {
            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
            f4(encryptedChat2, false);
            i4((TLRPC.User) arrayList.get(1), true, false);
            return encryptedChat2;
        }
        return encryptedChat;
    }

    public final TLObject b2(long j) {
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

    public final void b3(long j, boolean z) {
        LongSparseIntArray longSparseIntArray = this.r1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j) < 60) {
            return;
        }
        longSparseIntArray.put(j, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new le7(messagesStorage, j, (byte) 6));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = h1(j);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new e77(this, j, (byte) 0));
    }

    public final void b4(TLRPC.ChatFull chatFull) {
        this.c1.k(chatFull.id, chatFull);
        this.i4.M(-chatFull.id);
    }

    public final void b5(boolean z) {
        if (this.P3 != z) {
            SharedPreferences.Editor edit = this.X3.edit();
            this.P3 = z;
            edit.putBoolean("savedViewAsChats", z).apply();
        }
    }

    public final int c(java.util.ArrayList r23, int r24, int r25, java.util.ArrayList r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.c(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public final void c0(final long j, TLRPC.InputPeer inputPeer, boolean z, final ef1 ef1Var) {
        final boolean z2;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat M0 = M0(Long.valueOf(j));
        if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && lbc.D(getMessagesController().X1(Long.valueOf(inputPeer.user_id)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        final boolean T = xc2.T(M0);
        if (T) {
            if (z2) {
                boolean z3 = M0.creator;
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
            tL_messages_deleteChatUser2.chat_id = j;
            tL_messages_deleteChatUser2.user_id = p1(inputPeer);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        }
        if (z2) {
            V(0, -j, z);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    uc7 uc7Var = uc7.this;
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    if (T && !z2) {
                        hl.d3(new t77(uc7Var, j, (byte) 22), 1000L);
                    }
                    ef1 ef1Var2 = ef1Var;
                    if (ef1Var2 != null) {
                        hl.c3(ef1Var2);
                    }
                }
            }
        }, 64);
    }

    public final String c1(long j) {
        if (j > 0) {
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (X1 != null) {
                return lv2.m(0, X1.first_name, X1.last_name);
            }
            return null;
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j));
        if (M0 != null) {
            return M0.title;
        }
        return null;
    }

    public final TLObject c2(String str) {
        if (str != null && str.length() != 0) {
            return (TLObject) this.e.get(str.toLowerCase());
        }
        return null;
    }

    public final void c3(Long l, cz3 cz3Var, int i) {
        HashSet hashSet = this.n1;
        if (cz3Var == null && (hashSet.contains(l) || this.o1.contains(l))) {
            return;
        }
        hashSet.add(l);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l.getClass();
        tL_channels_getParticipants.channel = i1(M0(l));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new m65(this, l, cz3Var, (byte) 19));
    }

    public final void c4(ArrayList arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a4((TLRPC.Chat) arrayList.get(i), z);
            }
        }
    }

    public final void c5(int i, long j) {
        if (i == 0) {
            this.Y0 = j;
        } else if (i == 1) {
            this.Z0 = j;
        } else if (i == 2) {
            this.a1 = j;
        }
    }

    public final void d(int i, TLRPC.Dialog dialog) {
        int i2;
        if (D2(dialog.id)) {
            return;
        }
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

    public final void d0(long j, TLRPC.User user) {
        e0(j, user, null, false, false);
    }

    public final void d3(final int i, int i2, final int i3, boolean z, final y77 y77Var) {
        long j;
        TLRPC.InputPeer tL_inputPeerChat;
        final int i4;
        zh6 zh6Var;
        int m;
        SparseBooleanArray sparseBooleanArray = this.T1;
        if (!sparseBooleanArray.get(i) && !this.e2) {
            sparseBooleanArray.put(i, true);
            int i5 = jn7.r;
            getNotificationCenter().k(i5, new Object[0]);
            if (f11.a) {
                StringBuilder p = bs2.p("folderId = ", i, " load cacheOffset = ", i2, " count = ");
                p.append(i3);
                p.append(" cache = ");
                p.append(z);
                cc4.b(p.toString());
            }
            long[] jArr = null;
            if (z) {
                final jf7 messagesStorage = getMessagesStorage();
                if (i2 == 0) {
                    i4 = 0;
                } else {
                    i4 = this.S1.get(i, 0);
                }
                if (i == 0 && i2 == 0 && (m = (zh6Var = messagesStorage.getMediaDataController().u1).m()) > 0) {
                    jArr = new long[m];
                    for (int i6 = 0; i6 < m; i6++) {
                        if (((zh6) zh6Var.n(i6)).f(0L) != null) {
                            jArr[i6] = zh6Var.j(i6);
                        }
                    }
                }
                final long[] jArr2 = jArr;
                messagesStorage.a.c(new Runnable() {
                    @Override
                    public final void run() {
                        jf7.this.y0(i, i4, i3, jArr2);
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
                ArrayList W0 = W0(i);
                int size = W0.size() - 1;
                while (true) {
                    if (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(size);
                        if (!dialog.pinned && !wf3.B(dialog.id) && dialog.top_message > 0) {
                            ArrayList arrayList = (ArrayList) this.S.f(dialog.id);
                            r47 r47Var = null;
                            if (arrayList != null) {
                                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                    r47 r47Var2 = (r47) arrayList.get(i8);
                                    if (r47Var2 != null && (r47Var == null || r47Var2.e1() > r47Var.e1())) {
                                        r47Var = (r47) arrayList.get(i8);
                                    }
                                }
                            }
                            if (r47Var != null && r47Var.e1() > 0) {
                                TLRPC.Message message = r47Var.k;
                                tL_messages_getDialogs.offset_date = message.date;
                                tL_messages_getDialogs.offset_id = message.id;
                                TLRPC.Peer peer = message.peer_id;
                                long j3 = peer.channel_id;
                                if (j3 == 0) {
                                    j3 = peer.chat_id;
                                    if (j3 == 0) {
                                        j = peer.user_id;
                                        tL_messages_getDialogs.offset_peer = j1(j);
                                    }
                                }
                                j = -j3;
                                tL_messages_getDialogs.offset_peer = j1(j);
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
                        uc7.this.T3(messages_dialogs, null, null, i, 0, i3, 0, false, false, false);
                        y77 y77Var2 = y77Var;
                        if (y77Var2 != null && messages_dialogs.dialogs.isEmpty()) {
                            hl.c3(y77Var2);
                        }
                    }
                }
            });
        }
    }

    public final boolean d4(SharedPreferences.Editor editor, long j, boolean z) {
        if (j > 0 && r2(j) != z) {
            if (z) {
                editor.putBoolean("dialog_bar_spam" + j, true);
            } else {
                editor.remove("dialog_bar_spam" + j);
            }
            return true;
        }
        return false;
    }

    public final void d5(final long j, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z, final e eVar, boolean z2, boolean z3, String str2, final Runnable runnable, final gc7 gc7Var) {
        if (user != null && tL_chatAdminRights != null) {
            final TLRPC.Chat M0 = M0(Long.valueOf(j));
            final boolean Y = xc2.Y(M0);
            boolean z4 = true;
            if (xc2.T(M0)) {
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
                        uc7 uc7Var = uc7.this;
                        if (tL_error == null) {
                            uc7Var.Y3((TLRPC.Updates) tLObject, false);
                            hl.d3(new ka7(uc7Var, j, runnable, (byte) 0), 1000L);
                            return;
                        }
                        boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                        gc7 gc7Var2 = gc7Var;
                        if (equals) {
                            TLRPC.Chat chat = M0;
                            if (!xc2.Y(chat) && xc2.y(3, chat)) {
                                hl.c3(new la7(uc7Var, user, chat, gc7Var2, tL_error, (byte) 0));
                                return;
                            }
                        }
                        hl.c3(new ma7(uc7Var, tL_error, eVar, tL_channels_editAdmin, z, Y));
                        if (gc7Var2 != null) {
                            hl.c3(new na7(gc7Var2, tL_error, (byte) 0));
                        }
                    }
                };
                if (!user.bot && z2) {
                    k(j, user, str2, eVar, true, new yg6(this, tL_channels_editAdmin, requestDelegate, (byte) 23), gc7Var);
                    return;
                } else {
                    getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                    return;
                }
            }
            TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
            tL_messages_editChatAdmin.chat_id = j;
            tL_messages_editChatAdmin.user_id = q1(user);
            if (!z3 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
                z4 = false;
            }
            boolean z5 = z4;
            tL_messages_editChatAdmin.is_admin = z5;
            qh3 qh3Var = new qh3(this, j, runnable, eVar, tL_messages_editChatAdmin, gc7Var);
            if (!z5 && !z2 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tL_messages_editChatAdmin, qh3Var);
            } else {
                k(j, user, str2, eVar, true, new yg6(this, tL_messages_editChatAdmin, qh3Var, (byte) 24), gc7Var);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        znb znbVar;
        TLRPC.InputFile inputFile;
        ynb ynbVar;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        uc7 uc7Var = this;
        int i3 = jn7.U1;
        HashMap hashMap = uc7Var.I2;
        TLRPC.BaseTheme baseTheme = null;
        if (i == i3) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = uc7Var.G2;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                uc7Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new h77(uc7Var, (byte) 2));
            } else {
                String str3 = uc7Var.J2;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    unb unbVar = uc7Var.K2;
                    String str4 = uc7Var.J2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = unbVar.i;
                    tL_wallPaperSettings.motion = unbVar.j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    unb unbVar2 = uc7Var.K2;
                    unbVar2.r = 1.0f;
                    unbVar2.s = new ArrayList();
                    uc7Var.K2.s.add(Integer.valueOf(uc7Var.getConnectionsManager().sendRequest(uploadwallpaper, new au0((Object) uc7Var, (Object) unbVar, (Object) tL_wallPaperSettings, str4, (byte) 10))));
                } else {
                    Object obj = hashMap.get(str);
                    if (obj instanceof znb) {
                        znbVar = (znb) obj;
                        if (str.equals(znbVar.I)) {
                            znbVar.K = inputFile3;
                            znbVar.I = null;
                        } else if (str.equals(znbVar.J)) {
                            znbVar.L = inputFile3;
                            znbVar.J = null;
                        }
                        inputFile = znbVar.K;
                        inputFile2 = znbVar.L;
                        ynbVar = null;
                    } else if (obj instanceof ynb) {
                        ynb ynbVar2 = (ynb) obj;
                        if (str.equals(ynbVar2.u)) {
                            ynbVar2.w = inputFile3;
                            ynbVar2.u = null;
                        } else if (str.equals(ynbVar2.v)) {
                            ynbVar2.x = inputFile3;
                            ynbVar2.v = null;
                        }
                        znb znbVar2 = ynbVar2.b;
                        TLRPC.InputFile inputFile4 = ynbVar2.w;
                        inputFile2 = ynbVar2.x;
                        ynbVar = ynbVar2;
                        znbVar = znbVar2;
                        inputFile = inputFile4;
                    } else {
                        znbVar = null;
                        inputFile = null;
                        ynbVar = null;
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
                        if (ynbVar != null) {
                            ynbVar.x = null;
                            ynbVar.w = null;
                            tL_theme = ynbVar.r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str5 = znbVar.a;
                            int i4 = aob.a;
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
                            tL_inputThemeSettings2.accent_color = ynbVar.c;
                            int i5 = ynbVar.d;
                            if (i5 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i5;
                            }
                            int i6 = ynbVar.e;
                            if (i6 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i6));
                                tL_inputThemeSettings2.flags |= 1;
                                int i7 = ynbVar.f;
                                if (i7 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i7));
                                    int i8 = ynbVar.g;
                                    if (i8 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i8));
                                        int i9 = ynbVar.h;
                                        if (i9 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i9));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = ynbVar.i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(ynbVar.o)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = ynbVar.o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (ynbVar.p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = ynbVar.q;
                            long j = ynbVar.j;
                            if (j != 0) {
                                wallPaperSettings2.background_color = (int) j;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j2 = ynbVar.k;
                            if (j2 != 0) {
                                wallPaperSettings2.second_background_color = (int) j2;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = hl.q1(ynbVar.n, true);
                            }
                            long j3 = ynbVar.l;
                            if (j3 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j3;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j4 = ynbVar.m;
                            if (j4 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j4;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            znbVar.L = null;
                            znbVar.K = null;
                            tL_theme = znbVar.G;
                            tL_inputThemeSettings = null;
                        }
                        znb znbVar3 = znbVar;
                        uc7Var = this;
                        getConnectionsManager().sendRequest(uploadtheme, new in0(uc7Var, (Object) tL_theme, (Object) znbVar3, (Object) tL_inputThemeSettings, (Object) ynbVar, (byte) 10));
                    }
                }
                uc7Var = this;
            }
        } else if (i == jn7.V1) {
            String str6 = (String) objArr[0];
            String str7 = uc7Var.G2;
            if (str7 != null && str7.equals(str6)) {
                uc7Var.G2 = null;
            } else {
                String str8 = uc7Var.J2;
                if (str8 != null && str8.equals(str6)) {
                    uc7Var.J2 = null;
                    uc7Var.K2 = null;
                } else {
                    Object remove = hashMap.remove(str6);
                    boolean z = remove instanceof znb;
                    int i10 = jn7.N2;
                    if (z) {
                        znb znbVar4 = (znb) remove;
                        znbVar4.L = null;
                        znbVar4.K = null;
                        uc7Var.getNotificationCenter().k(i10, znbVar4, 0);
                    } else if (remove instanceof ynb) {
                        ynb ynbVar3 = (ynb) remove;
                        ynbVar3.u = null;
                        uc7Var.getNotificationCenter().k(i10, ynbVar3.b, ynbVar3);
                    }
                }
            }
        }
        if (i == jn7.W1) {
            String str9 = (String) objArr[0];
            String str10 = uc7Var.J2;
            if (str10 != null && str10.equals(str9)) {
                uc7Var.K2.r = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        int i11 = jn7.J;
        SparseArray sparseArray = uc7Var.V;
        if (i == i11) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l = (Long) objArr[3];
                ArrayList arrayList = (ArrayList) uc7Var.S.f(l.longValue());
                for (int i12 = 0; arrayList != null && i12 < arrayList.size(); i12++) {
                    r47 r47Var2 = (r47) arrayList.get(i12);
                    if (r47Var2 != null && (r47Var2.e1() == num.intValue() || r47Var2.k.local_id == num.intValue())) {
                        r47Var2.k.id = num2.intValue();
                        r47Var2.k.send_state = 0;
                    }
                    r47 r47Var3 = (r47) sparseArray.get(num.intValue());
                    if (r47Var3 != null) {
                        sparseArray.remove(num.intValue());
                        sparseArray.put(num2.intValue(), r47Var3);
                    }
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7Var.R.f(l.longValue());
                if (dialog != null && dialog.top_message == num.intValue()) {
                    dialog.top_message = num2.intValue();
                    uc7Var.getNotificationCenter().k(jn7.r, new Object[0]);
                }
                if (wf3.y(l.longValue())) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) uc7Var.c1.f(-l.longValue());
                    TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(-l.longValue()));
                    if (M0 != null && !xc2.N(M0) && !r47.f3(num2.intValue()) && chatFull != null && chatFull.slowmode_seconds != 0) {
                        chatFull.slowmode_next_send_date = uc7Var.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                        chatFull.flags |= 262144;
                        uc7Var.getMessagesStorage().K1(chatFull, false);
                    }
                }
            }
        } else if (i == jn7.l0) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id == 0 && (r47Var = (r47) sparseArray.get(message.id)) != null) {
                r47Var.k.media = r47.n1(message);
                if (r47.n1(message).ttl_seconds != 0) {
                    if ((r47.n1(message).photo instanceof TLRPC.TL_photoEmpty) || (r47.n1(message).document instanceof TLRPC.TL_documentEmpty)) {
                        r47Var.K5();
                        uc7Var.getNotificationCenter().k(jn7.f0, new Object[0]);
                    }
                }
            }
        } else if (i == jn7.i5) {
            uc7Var.a3(false);
            uc7Var.getContactsController().J(true);
            if ((uc7Var.Q3 && !uc7Var.getUserConfig().p()) || uc7Var.getUserConfig().p()) {
                uc7Var.getNotificationCenter().k(jn7.o3, new Object[0]);
            }
        }
    }

    public final void e(r47 r47Var, TLRPC.SuggestedPost suggestedPost) {
        r47 r47Var2 = r47Var;
        if (r47Var2 != null && r47Var2.k != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(r47Var2);
            r7a sendMessagesHelper = getSendMessagesHelper();
            long B0 = r47.B0(r47Var2.k);
            boolean z = !r47.l3(r47Var2.k);
            TLRPC.Message message = r47Var2.k;
            if (message.suggested_post == null) {
                r47Var2 = null;
            }
            sendMessagesHelper.p0(arrayList, B0, z, false, true, 0, 0, r47Var2, -1, 0L, wf3.n(message.saved_peer_id), b77.b(suggestedPost));
        }
    }

    public final void e0(long j, TLRPC.User user, TLRPC.Chat chat, boolean z, boolean z2) {
        TLRPC.InputPeer n1;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user == null) {
            if (chat == null) {
                return;
            }
            n1 = l1(chat);
        } else {
            n1 = n1(user);
        }
        TLRPC.Chat M0 = M0(Long.valueOf(j));
        boolean T = xc2.T(M0);
        if (T) {
            if (lbc.D(user)) {
                if (M0.creator && z) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = i1(M0);
                    tL_messages_deleteChatUser = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = i1(M0);
                    tL_messages_deleteChatUser = tL_channels_leaveChannel;
                }
            } else {
                if (xc2.Y(M0)) {
                    TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
                    tL_communities_toggleParticipantBanned.participant = n1;
                    tL_communities_toggleParticipantBanned.community = i1(M0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = i1(M0);
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
        } else if (z) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new xe2((byte) 0));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j;
            tL_messages_deleteChatUser3.user_id = q1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (lbc.D(user)) {
            V(0, -j, z2);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new e87(this, T, user, j), 64);
    }

    public final void e3(final int r11, final long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.e3(int, long, boolean):void");
    }

    public final void e4(long j, TLRPC.DraftMessage draftMessage) {
        zh6 zh6Var = this.R;
        if (zh6Var.h(j) < 0) {
            if (!xc2.o0(this.currentAccount, j) || xc2.z(this.currentAccount, 24, j)) {
                ls6 mediaDataController = getMediaDataController();
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                int i = 1;
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < wf3.i(dialog, mediaDataController.T(dialog.id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = j;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.t1.g(j, 0)).intValue();
                if (j >= 0 || !xc2.T(M0(Long.valueOf(-j)))) {
                    i = 0;
                }
                tL_dialog.flags = i;
                zh6Var.k(j, tL_dialog);
                arrayList.add(tL_dialog);
                h5(null);
            }
        }
    }

    public final void e5(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.n5 = tL_webBrowserSettings;
        int i = this.currentAccount;
        long j = tL_webBrowserSettings.hash;
        this.o5.g(i, null, tL_webBrowserSettings);
        getNotificationCenter().k(jn7.U5, new Object[0]);
    }

    public final void f(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            hl.c3(new d97(this, chat, (byte) 5));
        } else {
            g(chat);
        }
    }

    public final void f0(long j, int i, long j2) {
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.H(new ae7(messagesStorage, i, j, j2, (byte) 5));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = j1(j);
        tL_messages_deleteParticipantReaction.participant = j1(j2);
        tL_messages_deleteParticipantReaction.msg_id = i;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new ic((byte) 0), new f87(this, (byte) 6));
    }

    public final void f2(long j, TLRPC.User user, TLRPC.Chat chat) {
        if (user != null || chat != null) {
            SharedPreferences.Editor edit = this.W3.edit();
            edit.putInt("dialog_bar_vis3" + j, 3);
            edit.remove("dialog_bar_invite" + j);
            edit.commit();
            if (!wf3.B(j)) {
                TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
                if (user != null) {
                    tL_messages_hidePeerSettingsBar.peer = j1(user.id);
                } else {
                    tL_messages_hidePeerSettingsBar.peer = j1(-chat.id);
                }
                getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new xe2((byte) 0));
            }
        }
    }

    public final void f3(TLRPC.User user, int i, boolean z, pcc pccVar) {
        if (user != null) {
            HashSet hashSet = this.h1;
            if (pccVar == null) {
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
            tL_users_getFullUser.id = q1(user);
            long j = user.id;
            if (this.P.get(Long.valueOf(j)) == null || this.Q.get(Long.valueOf(j)) == null) {
                m4(null, j);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new kb7(this, user, j, pccVar, i)), i);
        }
    }

    public final void f4(TLRPC.EncryptedChat encryptedChat, boolean z) {
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

    public final void g(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z = chat.call_active;
        int i = jn7.A2;
        if (z && chat.call_not_empty && chat.migrated_to == null && !xc2.r0(chat)) {
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

    public final void g0(long j, int i, TLRPC.InputPeer inputPeer) {
        long m = wf3.m(inputPeer);
        int[] iArr = {i};
        ic2 ic2Var = new ic2(this, m, j, inputPeer, i, iArr);
        if (iArr[0] <= 0 && m == 0) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new cq6(messagesStorage, j, new wt1(iArr, ic2Var, (byte) 1), (byte) 16));
            return;
        }
        ic2Var.run();
    }

    public final vc2 g1(long j, boolean z, t16 t16Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull N0 = N0(j);
        if (N0 != null && (inputGroupCall = N0.call) != null) {
            vc2 vc2Var = (vc2) this.d1.f(inputGroupCall.id);
            if (vc2Var == null && z) {
                Long valueOf = Long.valueOf(j);
                HashSet hashSet = this.m1;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(j));
                    if (N0.call != null) {
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        getgroupcall.call = N0.call;
                        getgroupcall.limit = 20;
                        getConnectionsManager().sendRequest(getgroupcall, new p87(this, j, t16Var, (byte) 11));
                    }
                }
            }
            if (vc2Var == null || !(vc2Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                return vc2Var;
            }
            return null;
        }
        return null;
    }

    public final void g2() {
        if (this.q2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = j1(this.q2.id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new xe2((byte) 0));
        Utilities.d.c(new l87(this, (byte) 26));
        u4();
    }

    public final void g3(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, long j3, int i8, int i9, boolean z3) {
        int i10;
        if (j3 != 0) {
            i10 = i8;
        } else {
            i10 = 0;
        }
        h3(j, j2, z, i, i2, i3, z2, i4, i5, i6, 0, i7, j3, i9, i10, 0, 0, false, 0, true, true, z3, null, 0L);
    }

    public final void g4(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f4((TLRPC.EncryptedChat) arrayList.get(i), true);
            }
        }
    }

    public final boolean g5() {
        if (this.b5 != null && System.currentTimeMillis() - this.a5 < 3600000) {
            return this.b5.sensitive_enabled;
        }
        Set set = this.K3;
        if (set != null && !set.contains("sensitive")) {
            return false;
        }
        return true;
    }

    public final void h() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        i4(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        i4(tL_userForeign_old22, true, false);
    }

    public final void h0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        long j;
        if (user != null) {
            j = user.id;
        } else if (chat2 != null) {
            j = chat2.id;
        } else {
            j = 0;
        }
        U(-chat.id, j);
    }

    public final TLRPC.InputChannel h1(long j) {
        return i1(M0(Long.valueOf(j)));
    }

    public final void h2(znb znbVar, ynb ynbVar, boolean z) {
        TLRPC.TL_theme tL_theme;
        String str;
        boolean z2;
        boolean z3;
        if (ynbVar != null) {
            tL_theme = ynbVar.r;
            str = ynbVar.o;
        } else {
            tL_theme = znbVar.G;
            str = znbVar.e;
        }
        if (ynbVar == null && znbVar.h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ynbVar != null) {
            z3 = ynbVar.q;
        } else {
            z3 = znbVar.n;
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
        getConnectionsManager().sendRequest(installtheme, new xe2((byte) 0));
        if (!TextUtils.isEmpty(str)) {
            TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = str;
            installwallpaper.wallpaper = tL_inputWallPaperSlug;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            installwallpaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.blur = z2;
            tL_wallPaperSettings.motion = z3;
            getConnectionsManager().sendRequest(installwallpaper, new xe2((byte) 0));
        }
    }

    public final void h3(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final long j3, final int i9, final int i10, final int i11, final int i12, final boolean z3, final int i13, boolean z4, final boolean z5, final boolean z6, qsb qsbVar, long j4) {
        int i14;
        qsb qsbVar2;
        TLRPC.TL_forumTopic f;
        if (f11.a) {
            StringBuilder o = ik8.o(j, "load messages in chat ", " topic_id ");
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
            cc4.b(o.toString());
        } else {
            i14 = i4;
        }
        if (f11.a && qsbVar == null && i8 == 0) {
            qsbVar2 = new qsb("MessageLoaderLogger dialogId=" + j + " index=" + i9 + " count=" + i);
        } else {
            qsbVar2 = qsbVar;
        }
        int i15 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if ((i15 == 0 || z6 || i8 == 8 || i8 == 3 || i8 == 5 || i8 == 9) && i8 != 2 && (z2 || wf3.B(j))) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.a.c(new ee7(messagesStorage, qsb.d(qsbVar2, "MessagesStorage.getMessages: storageQueue.postRunnable"), qsbVar2, j, j2, i, i2, i3, i14, i5, i6, i8, j3, i9, z5, z6));
            return;
        }
        qsb qsbVar3 = qsbVar2;
        int i16 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.Chat M0 = i16 < 0 ? M0(Long.valueOf(-j)) : null;
        if (i8 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = j1(j);
            tL_getWelcomeMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new icc() {
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
                            tL_messages_messages.messages.add(o44.b(ephemeralMessage));
                        }
                        uc7.this.U3(tL_messages_messages, tL_messages_messages.messages.size(), j, j2, i, i2, i3, false, i5, i10, i7, i11, i12, i6, false, i8, j3, i9, z3, i13, z5, z6, null);
                    }
                }
            }), i5);
        } else if (i8 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j3;
            tL_messages_getQuickReplyMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new h97(this, j, j2, i, i2, i3, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6)), i5);
        } else if (i15 == 0) {
            if (i8 == 2) {
                return;
            }
            if (i8 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = j1(j);
                tL_messages_getScheduledHistory.hash = j4;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new h97(this, i2, i3, j, j2, i, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6)), i5);
                return;
            }
            boolean z7 = this.B4.contains(Integer.valueOf(i5)) && this.R.f(j) == null;
            if (!xc2.p0(M0) && z4 && !z7 && ((i6 == 3 || i6 == 2) && i7 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer j1 = j1(j);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = j1;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        uc7 uc7Var = uc7.this;
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
                                    uc7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                                }
                                uc7Var.h3(j, j2, z, i, i2, i3, false, i4, i17, i6, dialog.top_message, 0, j3, i9, i10, dialog.unread_count, i12, z3, dialog.unread_mentions_count, false, z5, z6, null, 0L);
                                return;
                            }
                            return;
                        }
                        hl.c3(new y36(uc7Var, i17, tL_messages_getPeerDialogs, tL_error, (byte) 8));
                    }
                });
                return;
            }
            TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
            tL_messages_getHistory.peer = j1(j);
            if (i6 == 4) {
                tL_messages_getHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getHistory.add_offset = (-i) + 6;
            } else if (i16 < 0 && i2 != 0 && xc2.T(M0)) {
                tL_messages_getHistory.add_offset = -1;
                tL_messages_getHistory.limit++;
            }
            tL_messages_getHistory.limit = i;
            tL_messages_getHistory.offset_id = i2;
            tL_messages_getHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new i97(this, j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getHistory, (byte) 2)), i5);
        } else if (i8 == 3 || xc2.p0(M0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = j1(j3);
            if (xc2.p0(M0)) {
                tL_messages_getSavedHistory.parent_peer = j1(j);
            }
            if (i6 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i) + 6;
            } else if (i16 < 0 && i2 != 0 && xc2.T(M0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i;
            tL_messages_getSavedHistory.offset_id = i2;
            tL_messages_getSavedHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new i97(this, j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getSavedHistory, (byte) 0)), i5);
        } else if (z4 && z6 && i6 == 2 && i7 == 0 && (f = this.g4.f(-j, j3)) != null) {
            h3(j, j2, z, i, i2, i3, false, i4, i5, i6, f.top_message, i8, j3, i9, i10, f.unread_count, i12, z3, f.unread_mentions_count, false, z5, z6, qsbVar3, 0L);
        } else if (i8 == 0) {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = j1(j);
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
            } else if (i16 < 0 && i2 != 0 && xc2.T(M0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i;
            tL_messages_getReplies.offset_id = i2;
            tL_messages_getReplies.hash = j4;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new i97(this, i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tL_messages_getReplies)), i5);
        }
    }

    public final void h4(long j, vc2 vc2Var) {
        this.d1.k(vc2Var.b.id, vc2Var);
        this.e1.k(j, vc2Var);
        TLRPC.ChatFull N0 = N0(j);
        if (N0 != null) {
            N0.call = vc2Var.h(vc2Var.a);
        }
        getNotificationCenter().k(jn7.w2, Long.valueOf(j), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
        e3(0, j, true);
    }

    public final void h5(defpackage.zh6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.h5(zh6):void");
    }

    public final void i(ArrayList arrayList, long j) {
        int i;
        zh6 zh6Var = this.B0;
        SparseArray sparseArray = (SparseArray) zh6Var.f(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            zh6Var.k(j, sparseArray);
            this.C0++;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((r47) sparseArray.valueAt(i2)).v0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i3 = Integer.MAX_VALUE;
        boolean z = false;
        for (int i4 = 0; i4 < size2; i4++) {
            r47 r47Var = (r47) arrayList.get(i4);
            if (r47Var.D == 17) {
                TLRPC.MessageMedia messageMedia = r47Var.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i = poll.close_date) != 0) {
                        if (i <= currentTime) {
                            z = true;
                        } else {
                            i3 = Math.min(i3, i - currentTime);
                        }
                    }
                    int e1 = r47Var.e1();
                    r47 r47Var2 = (r47) sparseArray.get(e1);
                    if (r47Var2 != null) {
                        r47Var2.v0 = true;
                    } else {
                        sparseArray.put(e1, r47Var);
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

    public final void i0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i) {
        long j;
        TLRPC.InputPeer l1;
        if (user != null) {
            j = user.id;
        } else if (chat2 != null) {
            j = chat2.id;
        } else {
            j = 0;
        }
        long j2 = j;
        if (i == 0) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new xd7(messagesStorage, -chat.id, j2, (byte) 3));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = i1(chat);
        if (user != null) {
            l1 = n1(user);
        } else {
            l1 = l1(chat2);
        }
        tL_channels_deleteParticipantHistory.participant = l1;
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new au0(this, chat, user, chat2, (byte) 11));
    }

    public final void i2(int i) {
        this.d0.remove(i);
        getNotificationCenter().k(jn7.C5, Integer.valueOf(i));
    }

    public final void i3(TLRPC.User user, TLRPC.Chat chat, boolean z) {
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
        zh6 zh6Var = this.k0;
        if (zh6Var.h(j) < 0) {
            if (f11.a) {
                cc4.b("request spam button for " + j);
            }
            int i = this.W3.getInt("dialog_bar_vis3" + j, 0);
            if (!z && (i == 1 || i == 3)) {
                if (f11.a) {
                    cc4.b("dialog bar already hidden for " + j);
                    return;
                }
                return;
            }
            zh6Var.k(j, Boolean.TRUE);
            TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
            if (user != null) {
                tL_messages_getPeerSettings.peer = j1(user.id);
            } else {
                tL_messages_getPeerSettings.peer = j1(-chat.id);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new e77(this, j, (byte) 17));
        }
    }

    public final boolean i4(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.i4(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public final boolean i5() {
        return !this.k4.W2.f;
    }

    public final void j(final long j, final TLRPC.User user, int i, String str, final e eVar, final boolean z, final Runnable runnable, final gc7 gc7Var, final pcc pccVar, boolean z2) {
        boolean z3;
        final boolean z4;
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (gc7Var != null) {
                gc7Var.b(null);
            }
            if (pccVar != null) {
                pccVar.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat M0 = M0(Long.valueOf(j));
        final boolean T = xc2.T(M0);
        if (T && M0.megagroup) {
            z3 = true;
        } else {
            z3 = false;
        }
        final boolean z5 = z3;
        final TLRPC.InputUser q1 = q1(user);
        if (str != null && (!T || z5)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = q1;
            if (T) {
                tL_messages_startBot.peer = j1(-j);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.b.nextLong();
            z4 = z2;
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (T) {
            if (q1 instanceof TLRPC.TL_inputUserSelf) {
                Long valueOf = Long.valueOf(j);
                ArrayList arrayList = this.n;
                if (arrayList.contains(valueOf)) {
                    if (gc7Var != null) {
                        gc7Var.b(null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = h1(j);
                z4 = z2;
                tL_channels_joinChannel.for_news = z4;
                arrayList.add(Long.valueOf(j));
                tL_messages_addChatUser = tL_channels_joinChannel;
            } else {
                z4 = z2;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = h1(j);
                tL_channels_inviteToChannel.users.add(q1);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            z4 = z2;
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j;
            tL_messages_addChatUser2.fwd_limit = i;
            tL_messages_addChatUser2.user_id = q1;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z6;
                TLRPC.User user2;
                uc7 uc7Var;
                e eVar2;
                uc7 uc7Var2 = uc7.this;
                boolean z7 = T;
                TLRPC.InputUser inputUser = q1;
                long j2 = j;
                if (z7 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    hl.c3(new t77(uc7Var2, j2, (byte) 10));
                }
                pcc pccVar2 = pccVar;
                Runnable runnable2 = runnable;
                TLRPC.User user3 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        hl.c3(new t87(pccVar2, runnable2, (byte) 6));
                        return;
                    } else if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user3.id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        hl.c3(new ba7(uc7Var2, pccVar2, tL_messages_invitedUsers, j2, (byte) 0));
                        return;
                    } else {
                        hl.c3(new jn0(pccVar2, (byte) 10));
                        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z) {
                            if (runnable2 != null) {
                                hl.c3(runnable2);
                                return;
                            }
                            return;
                        }
                        gc7 gc7Var2 = gc7Var;
                        e eVar3 = eVar;
                        TLObject tLObject2 = tL_messages_addChatUser3;
                        boolean z8 = z5;
                        if (gc7Var2 != null) {
                            fr6 fr6Var = new fr6(uc7Var2, gc7Var2, tL_error, eVar3, tLObject2, z7, z8);
                            uc7Var = uc7Var2;
                            eVar2 = eVar3;
                            hl.c3(fr6Var);
                        } else {
                            uc7Var = uc7Var2;
                            eVar2 = eVar3;
                        }
                        hl.c3(new ca7(uc7Var, gc7Var2, tL_error, eVar2, tLObject2, z7, z8, inputUser, (byte) 0));
                        return;
                    }
                }
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = null;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates;
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    hl.c3(new ue2(uc7Var2, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j2, (byte) 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                    updates = tL_messages_invitedUsers2.updates;
                } else if (tLObject instanceof TLRPC.Updates) {
                    updates = (TLRPC.Updates) tLObject;
                } else {
                    cc4.d("unexpected " + tLObject + " in addUserToChat");
                    hl.c3(new jn0(pccVar2, (byte) 11));
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i2);
                        if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                            z6 = true;
                            break;
                        }
                        i2++;
                    } else {
                        z6 = false;
                        break;
                    }
                }
                uc7Var2.Y3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    hl.c3(new da7(uc7Var2, updates, pccVar2, tL_messages_invitedUsers2, j2, (byte) 0));
                    return;
                }
                TLRPC.Updates updates2 = updates;
                if (z7) {
                    if (!z4 && !z6 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        uc7Var2.B0(j2, true);
                    }
                    hl.d3(new t77(uc7Var2, j2, (byte) 13), 1000L);
                }
                if (z7 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    hl.c3(new t77(uc7Var2, j2, (byte) 11));
                    user2 = user3;
                    uc7Var2.getMessagesStorage().O1(-j2, j2, new ArrayList(), null);
                } else {
                    user2 = user3;
                }
                if (runnable2 != null) {
                    hl.c3(new yg6(uc7Var2, updates2, runnable2, (byte) 25));
                }
                if (pccVar2 != null) {
                    hl.c3(new jn0(pccVar2, (byte) 9));
                }
                if (lbc.D(user2) && !xc2.V(M0) && z6) {
                    hl.c3(new t77(uc7Var2, j2, (byte) 12));
                }
            }
        });
    }

    public final void j0(TLRPC.TL_inputPhoto tL_inputPhoto) {
        TLRPC.Photo photo;
        long e = getUserConfig().e();
        if (tL_inputPhoto == null) {
            dc7 U0 = U0(e);
            ArrayList arrayList = U0.b;
            if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
                U0.e(photo.id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User X1 = X1(Long.valueOf(getUserConfig().e()));
            if (X1 == null) {
                X1 = getUserConfig().f();
            }
            if (X1 == null) {
                return;
            }
            if (X1.photo != null) {
                jf7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new xd7(messagesStorage, X1.id, X1.photo.photo_id, (byte) 0));
            }
            getNotificationCenter().k(jn7.j0, new Object[0]);
            getNotificationCenter().k(2, Integer.valueOf(r5));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new e77(this, e, (byte) 6));
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.id.add(tL_inputPhoto);
        U0(e).e(tL_inputPhoto.id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public final TLRPC.InputPeer j1(long j) {
        if (j == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j < 0) {
            long j2 = -j;
            TLRPC.Chat M0 = M0(Long.valueOf(j2));
            if (xc2.T(M0)) {
                if (M0 != null && M0.access_hash == 0) {
                    long j3 = M0.fromMessageDialogId;
                    if (j3 != 0 && j3 != j && M0.fromMessageId != 0) {
                        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                        tL_inputPeerChannelFromMessage.channel_id = j2;
                        tL_inputPeerChannelFromMessage.peer = j1(M0.fromMessageDialogId);
                        tL_inputPeerChannelFromMessage.msg_id = M0.fromMessageId;
                        return tL_inputPeerChannelFromMessage;
                    }
                }
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChannel.channel_id = j2;
                tL_inputPeerChannel.access_hash = M0.access_hash;
                return tL_inputPeerChannel;
            }
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j2;
            return tL_inputPeerChat;
        }
        TLRPC.User X1 = X1(Long.valueOf(j));
        if (X1 != null && X1.access_hash == 0) {
            long j4 = X1.fromMessageDialogId;
            if (j4 != 0 && j4 != j && X1.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = j;
                tL_inputPeerUserFromMessage.peer = j1(X1.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = X1.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = j;
        if (X1 != null) {
            tL_inputPeerUser.access_hash = X1.access_hash;
        }
        return tL_inputPeerUser;
    }

    public final void j2() {
        this.b5 = null;
        this.a5 = 0L;
    }

    public final void j3(int i) {
        SparseIntArray sparseIntArray = this.h2;
        if (sparseIntArray.indexOfKey(i) < 0) {
            SharedPreferences j = getUserConfig().j();
            if (!j.getBoolean("2pinnedDialogsLoaded" + i, false)) {
                sparseIntArray.put(i, 1);
                TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
                tL_messages_getPinnedDialogs.folder_id = i;
                getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new b87(this, i, (byte) 0));
            }
        }
    }

    public final void j4(ArrayList arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (i4((TLRPC.User) arrayList.get(i), z, false)) {
                    z2 = true;
                }
            }
            if (z2) {
                hl.c3(new pa7(this, (byte) 12));
            }
        }
    }

    public final void j5(TLRPC.Chat chat, int i, boolean z, tm1 tm1Var) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new hk3(this, chat, z, i, tm1Var));
    }

    public final void k(long j, TLRPC.User user, String str, e eVar, boolean z, Runnable runnable, gc7 gc7Var) {
        j(j, user, 0, str, eVar, z, runnable, gc7Var, null, false);
    }

    public final void k2(int i, long j) {
        if (this.h1.contains(Long.valueOf(j))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.i1;
        int indexOfKey = longSparseLongArray.indexOfKey(j);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        f3(X1(Long.valueOf(j)), i, true, null);
    }

    public final void k3(boolean z, i61 i61Var) {
        if (i61Var != null) {
            this.v4 = i61Var;
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
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new h77(this, (byte) 17));
        }
    }

    public final void k4(int i, String str) {
        if (!TextUtils.isEmpty(str) && !this.c2 && getUserConfig().e() != 0) {
            if (!getUserConfig().d || !str.equals(xea.f)) {
                this.c2 = true;
                this.d2 = SystemClock.elapsedRealtime();
                if (xea.k == null) {
                    xea.k = new byte[256];
                    Utilities.b.nextBytes(xea.k);
                    xea.x();
                }
                TL_account.registerDevice registerdevice = new TL_account.registerDevice();
                registerdevice.token_type = i;
                registerdevice.token = str;
                registerdevice.no_muted = false;
                registerdevice.secret = xea.k;
                for (int i2 = 0; i2 < 4; i2++) {
                    yac h = yac.h(i2);
                    if (i2 != this.currentAccount && h.o()) {
                        long e = h.e();
                        registerdevice.other_uids.add(Long.valueOf(e));
                        if (f11.a) {
                            c00.q(this.currentAccount, ik8.o(e, "add other uid = ", " for account "));
                        }
                    }
                }
                getConnectionsManager().sendRequest(registerdevice, new hb7(this, i, str, (byte) 0));
            }
        }
    }

    public final boolean k5() {
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

    public final void l(TLRPC.Chat chat, e eVar, ArrayList arrayList, int i, pt2 pt2Var, pt2 pt2Var2, sa8 sa8Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j = chat2.id;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i2);
            j(j, user, i, null, eVar, false, new t87(pt2Var, user, (byte) 10), new rm6(pt2Var2, user, (byte) 9), new c97(this, tL_messages_invitedUsers, iArr, size, chat2, sa8Var), false);
            i4(user, false, false);
            chat2 = chat;
        }
    }

    public final boolean l0() {
        int i = 0;
        while (true) {
            ac7[] ac7VarArr = this.N;
            if (i < ac7VarArr.length) {
                if (v0(ac7VarArr[i])) {
                    return true;
                }
                i++;
            } else {
                return l2();
            }
        }
    }

    public final boolean l2() {
        if (this.G0.size() <= 1 || !this.n4.contains(0)) {
            return false;
        }
        return true;
    }

    public final void l3() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new h77(this, (byte) 26));
    }

    public final void l4(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.o4;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num != null) {
            if (num.intValue() > 1) {
                hashMap.put(Long.valueOf(j), Integer.valueOf(num.intValue() - 1));
                return;
            }
            hashMap.remove(Long.valueOf(j));
            if (!s2((TLRPC.Dialog) this.R.f(j)) && l0()) {
                h5(null);
                getNotificationCenter().k(jn7.Q2, Long.valueOf(j));
            }
        }
    }

    public final boolean l5() {
        String str = this.k4.U1.f;
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

    public final void m(String str, boolean z) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new f87(this, (byte) 3));
    }

    public final void m0(int i, long j, SparseArray sparseArray) {
        Utilities.d.c(new y77(this, i, (byte) 1));
        if (sparseArray != null) {
            hl.c3(new cq6(this, j, sparseArray, (byte) 3));
        }
    }

    public final TLRPC.InputPeer m1(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.Chat M0 = M0(Long.valueOf(peer.channel_id));
            if (M0 != null && M0.access_hash == 0) {
                long j = M0.fromMessageDialogId;
                if (j != 0 && j != peer.channel_id && M0.fromMessageId != 0) {
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
            TLRPC.User X1 = X1(Long.valueOf(peer.user_id));
            if (X1 != null && X1.access_hash == 0 && X1.fromMessageDialogId != 0 && X1.fromMessageId != 0) {
                TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                tL_inputPeerUserFromMessage.user_id = peer.user_id;
                tL_inputPeerUserFromMessage.peer = j1(X1.fromMessageDialogId);
                tL_inputPeerUserFromMessage.msg_id = X1.fromMessageId;
                return tL_inputPeerUserFromMessage;
            }
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = peer.user_id;
            if (X1 != null) {
                tL_inputPeerUser.access_hash = X1.access_hash;
            }
            return tL_inputPeerUser;
        }
    }

    public final boolean m2(TLRPC.Chat chat) {
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

    public final void m3(long j, TLRPC.Chat chat) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j2 = chat.id;
            zh6 zh6Var = this.S0;
            if (zh6Var.h(j2) < 0) {
                int i = (chat.access_hash > 0L ? 1 : (chat.access_hash == 0L ? 0 : -1));
                if (i == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.id;
                    tL_inputPeerChannel.peer = j1(chat.fromMessageDialogId);
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
                zh6Var.k(chat.id, Boolean.TRUE);
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
                        cc4.g(exc, true);
                        j = getMessagesStorage().y(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new p87(this, j, chat, (byte) 13));
                    }
                    j = getMessagesStorage().y(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new p87(this, j, chat, (byte) 13));
            }
        }
    }

    public final void m4(ArrayList arrayList, long j) {
        if (j != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            zh6 zh6Var = this.y4;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.InputPeer j1 = j1(((TLRPC.Dialog) arrayList.get(i)).id);
                    if (!(j1 instanceof TLRPC.TL_inputPeerChannel) || j1.access_hash != 0) {
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer.peer = j1;
                        long m = wf3.m(j1);
                        Long l = (Long) zh6Var.f(m);
                        if (l == null || System.currentTimeMillis() - l.longValue() > 240000) {
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            zh6Var.k(m, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                }
            } else {
                TLRPC.InputPeer j12 = j1(j);
                if (!(j12 instanceof TLRPC.TL_inputPeerChannel) || j12.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer2.peer = j12;
                    long m2 = wf3.m(j12);
                    Long l2 = (Long) zh6Var.f(m2);
                    if (l2 == null || System.currentTimeMillis() - l2.longValue() > 240000) {
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer2);
                        zh6Var.k(m2, Long.valueOf(System.currentTimeMillis()));
                    }
                } else {
                    return;
                }
            }
            if (tL_messages_getPeerDialogs.peers.isEmpty()) {
                return;
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new h77(this, (byte) 24));
        }
    }

    public final boolean m5(TLRPC.User user) {
        if (user == null || user.id != this.k4.k3.f()) {
            String str = this.k4.U1.f;
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

    public final void n(ArrayList arrayList) {
        SharedPreferences.Editor edit = s1(this.currentAccount).W3.edit();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                wp7 wp7Var = getNotificationsController().h0;
                wp7Var.getClass();
                long B1 = r47.B1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(qu6.n(B1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + B1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wp7Var.a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) != 0) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                            edit.putInt("notify2_" + B1, 2);
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        } else {
                            edit.putInt("notify2_" + B1, 3);
                            edit.putInt(qu6.n(B1, "notifyuntil_"), dialog.notify_settings.mute_until);
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

    public final void n0(boolean z) {
        TLRPC.UserFull Y1 = Y1(getUserConfig().e());
        if (Y1 != null) {
            Y1.sponsored_enabled = false;
            getMessagesStorage().g2(Y1, false);
            if (z) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final boolean n2(long j) {
        if (j < 0) {
            return xc2.Y(M0(Long.valueOf(-j)));
        }
        return false;
    }

    public final void n3(TLRPC.InputPeer inputPeer, long j) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long m = wf3.m(inputPeer);
            zh6 zh6Var = this.T0;
            if (zh6Var.h(m) >= 0) {
                return;
            }
            zh6Var.k(m, Boolean.TRUE);
            if (f11.a) {
                cc4.b("load unknown dialog " + m);
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
                    cc4.g(exc, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j = getMessagesStorage().y(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new v77(this, j, m, (byte) 1));
                }
                j = getMessagesStorage().y(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new v77(this, j, m, (byte) 1));
        }
    }

    public final void n4(TLRPC.InputPeer inputPeer, long j) {
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
                cc4.g(exc, true);
                j = getMessagesStorage().y(nativeByteBuffer);
                long j2 = j;
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new p87(this, inputPeer, j2, (byte) 10));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        }
        long j22 = j;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new p87(this, inputPeer, j22, (byte) 10));
    }

    public final void o(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            SharedPreferences.Editor editor = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < size; i++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                if (dialog instanceof TLRPC.TL_dialog) {
                    TLRPC.Peer peer = dialog.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        long j = peer.user_id;
                        if (r2(j) != dialog.spam) {
                            if (editor == null) {
                                editor = this.W3.edit();
                            }
                            d4(editor, j, dialog.spam);
                            if (dialog.spam) {
                                editor.remove("dialog_bar_vis3" + j);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(j));
                        }
                    }
                }
            }
            if (editor != null) {
                editor.apply();
            }
            if (arrayList2 != null) {
                hl.c3(new k77(this, arrayList2, (byte) 4));
            }
        }
    }

    public final void o0(long j, int i, long j2) {
        getMessagesStorage().n1(j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new se7(messagesStorage, arrayList, j2, (byte) 1));
    }

    public final TLRPC.InputUser o1(long j) {
        return q1(X1(Long.valueOf(j)));
    }

    public final boolean o2(long j, long j2) {
        return p2(j, j2, null);
    }

    public final void o3(int i, TLRPC.User user, boolean z) {
        jf7 messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.a.c(new ps1(messagesStorage, user, z, i, (byte) 8));
        }
    }

    public final void o4(long j, HashMap hashMap, int i) {
        boolean z;
        HashMap hashMap2;
        zh6 zh6Var;
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
            zh6Var = this.z1;
        } else if (z2) {
            hashMap2 = this.A1;
            zh6Var = this.B1;
        } else {
            hashMap2 = this.w1;
            zh6Var = this.x1;
        }
        HashMap hashMap3 = hashMap2;
        zh6 zh6Var2 = zh6Var;
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
            getConnectionsManager().sendRequest(getwebpagepreview, new s15(this, hashMap3, str, zh6Var2, j, i));
        }
    }

    public final void o5(long j, boolean z, boolean z2, boolean z3) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = h1(j);
        tL_channels_toggleForum.enabled = z;
        tL_channels_toggleForum.tabs = z2;
        tL_channels_toggleForum.sidebar = z3;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new h77(this, (byte) 15), 64);
        getNotificationCenter().k(jn7.u5, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public final boolean p(ArrayList arrayList) {
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
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(wf3.n(tL_folderPeer.peer));
                if (dialog != null) {
                    int i3 = dialog.folder_id;
                    int i4 = tL_folderPeer.folder_id;
                    if (i3 != i4) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i4;
                        this.h0 = true;
                        B();
                    }
                }
            }
            getMessagesStorage().D1(((TL_update.TL_updateFolderPeers) arrayList.get(i)).folder_peers, null, 0L, 0);
            i++;
            z = true;
        }
        return z;
    }

    public final TLRPC.InputUser p1(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (inputPeer.access_hash == 0) {
            TLRPC.User X1 = X1(Long.valueOf(inputPeer.user_id));
            if (X1.access_hash == 0 && X1.fromMessageDialogId != 0 && X1.fromMessageId != 0) {
                TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
                tL_inputUserFromMessage.user_id = inputPeer.user_id;
                tL_inputUserFromMessage.peer = j1(X1.fromMessageDialogId);
                tL_inputUserFromMessage.msg_id = X1.fromMessageId;
                return tL_inputUserFromMessage;
            }
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public final boolean p2(long j, long j2, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb = new StringBuilder("notify2_");
        boolean z = false;
        sb.append(ip7.p(j, j2, false));
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.W3;
        int i = sharedPreferences.getInt(sb2, -1);
        if (i == -1) {
            if (chat != null) {
                if (xc2.T(chat) && !chat.megagroup) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            if (j2 != 0) {
                return p2(j, 0L, chat);
            }
            return !getNotificationsController().x(j, bool2, false, false);
        } else if (i == 2) {
            return true;
        } else {
            if (i == 3) {
                if (sharedPreferences.getInt("notifyuntil_" + ip7.p(j, j2, false), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void p3() {
        hl.r(this.m5);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
        vb7 vb7Var = this.o5;
        if (tL_webBrowserSettings == null) {
            vb7Var.e(this.currentAccount, null, new f87(this, (byte) 0));
        }
        vb7Var.d(this.currentAccount, null);
        vb7Var.c(this.currentAccount, null, new mb7(this, (byte) 2));
    }

    public final void p4(ArrayList arrayList, long j) {
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

    public final void p5(long j, boolean z) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = h1(j);
        tL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new h77(this, (byte) 10), 64);
    }

    public final void q(ArrayList arrayList, ArrayList arrayList2, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
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
        getNotificationCenter().k(jn7.s1, new Object[0]);
        SharedPreferences.Editor edit = this.X3.edit();
        edit.putStringSet("pendingSuggestions", this.u3);
        edit.putStringSet("dismissedSuggestions", this.v3);
        edit.apply();
    }

    public final void q0(int i, boolean[] zArr) {
        ArrayList arrayList;
        if (i == 0) {
            return;
        }
        long j = i | 2305843009213693952L;
        zh6 zh6Var = this.R;
        if (((TLRPC.Dialog) zh6Var.f(j)) instanceof TLRPC.TL_dialogFolder) {
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
        tL_folder.title = ob6.M0(2131754129, null);
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
        zh6Var.k(j, tL_dialogFolder);
        arrayList.add(0, tL_dialogFolder);
    }

    public final TLRPC.InputUser q1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash == 0 && user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
            TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
            tL_inputUserFromMessage.user_id = user.id;
            tL_inputUserFromMessage.peer = j1(user.fromMessageDialogId);
            tL_inputUserFromMessage.msg_id = user.fromMessageId;
            return tL_inputUserFromMessage;
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public final boolean q2(long j, long j2) {
        return this.W3.getBoolean("sound_enabled_" + ip7.p(j, j2, false), true);
    }

    public final void q3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.q3():void");
    }

    public final void q4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (this.F.remove(dialog) && wf3.x(dialog)) {
            Utilities.d.c(new t77(this, j, (byte) 7));
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
            ac7[] ac7VarArr = this.N;
            if (i >= ac7VarArr.length) {
                break;
            }
            ac7 ac7Var = ac7VarArr[i];
            if (ac7Var != null) {
                ac7Var.k.remove(dialog);
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
        r4(dialog);
    }

    public final void q5(final long j, final long j2, boolean z, boolean z2, final boolean z3, final Runnable runnable, final Runnable runnable2) {
        TLRPC.InputUser tL_inputUserEmpty;
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = h1(j);
        tL_channels_toggleJoinRequest.enabled = z;
        tL_channels_toggleJoinRequest.apply_to_invites = z2;
        if (z3) {
            if (j2 != 0) {
                tL_inputUserEmpty = o1(j2);
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
                    final uc7 uc7Var = uc7.this;
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    final boolean z4 = z3;
                    final long j3 = j;
                    final long j4 = j2;
                    hl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            TLRPC.ChatFull N0;
                            boolean z5;
                            uc7 uc7Var2 = uc7.this;
                            if (z4 && (N0 = uc7Var2.N0(j3)) != null) {
                                int i = N0.flags2;
                                long j5 = j4;
                                if (j5 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                N0.flags2 = vsd.b(i, 8388608, z5);
                                N0.guard_bot_id = j5;
                                uc7Var2.getMessagesStorage().K1(N0, false);
                                jn7 notificationCenter = uc7Var2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(jn7.T, N0, 0, bool, bool);
                            }
                            uc7Var2.getNotificationCenter().k(2, 8192);
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

    public final void r(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (vsd.a(tL_updateWebBrowserException.flags, 1)) {
                boolean z = tL_updateWebBrowserException.open_external_browser;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.n5;
                if (z) {
                    k0(tL_webBrowserSettings2.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    k0(tL_webBrowserSettings2.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                k0(this.n5.external_exceptions, tL_updateWebBrowserException.exception);
                k0(this.n5.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            k0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            k0(this.n5.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            k0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            k0(this.n5.external_exceptions, tL_updateWebBrowserException.exception);
        }
        e5(this.n5);
    }

    public final Runnable r0(long j, int i, jc7 jc7Var) {
        int i2;
        long j2;
        int i3;
        int i4;
        uc7 uc7Var;
        SharedPreferences sharedPreferences = s1(this.currentAccount).W3;
        if (i == 0) {
            i2 = sharedPreferences.getInt("diditem" + j, 0);
        } else {
            i2 = i;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        if (wf3.y(j)) {
            j2 = -j;
        } else {
            j2 = 0;
        }
        if (j2 != 0 && getMessagesController().M0(Long.valueOf(j2)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new w77(this, zArr, messagesStorage, j2, runnableArr, j, i2, jc7Var));
            return new x77(zArr, runnableArr, (byte) 0);
        }
        if (hl.O1()) {
            i3 = 30;
        } else {
            i3 = 20;
        }
        int i5 = i3;
        int i6 = i2;
        tb7 tb7Var = new tb7(this, generateClassGuid, i5, i6, j, jc7Var);
        getNotificationCenter().a(tb7Var, jn7.G);
        getNotificationCenter().a(tb7Var, jn7.H);
        if (i6 != 0) {
            uc7Var = this;
            i4 = generateClassGuid;
            uc7Var.h3(j, 0L, true, i5, i6, 0, true, 0, i4, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            i4 = generateClassGuid;
            uc7Var = this;
            uc7Var.h3(j, 0L, true, i5, i6, 0, true, 0, i4, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new y77(uc7Var, i4, (byte) 0);
    }

    public final boolean r2(long j) {
        if (j <= 0 || !qu6.v("dialog_bar_spam", j, this.W3, false)) {
            return false;
        }
        return true;
    }

    public final void r3(final long r18, final int r20, int r21, final int r22, boolean r23, final long r24, int r26, final boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.r3(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public final void r4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j = dialog.id;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        zh6 zh6Var = this.x;
        if (i > 0) {
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (X1 != null) {
                long j2 = X1.linked_community_id;
                if (j2 != 0 && (arrayList2 = (ArrayList) zh6Var.f(j2)) != null) {
                    arrayList2.remove(dialog);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat M0 = M0(Long.valueOf(-j));
        if (M0 != null) {
            long j3 = M0.linked_community_id;
            if (j3 != 0 && (arrayList = (ArrayList) zh6Var.f(j3)) != null) {
                arrayList.remove(dialog);
            }
        }
    }

    public final void r5(long j, int i, boolean z, oo2 oo2Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = j1(j);
        tL_messages_toggleNoForwards.enabled = z;
        if (i > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new qe2(this, oo2Var, (byte) 29), 64);
    }

    public final void s(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.n5;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        e5(tL_webBrowserSettings);
    }

    public final boolean s2(TLRPC.Dialog dialog) {
        TLRPC.Chat chat;
        if (dialog != null) {
            if (!dialog.unread_mark) {
                boolean z = dialog instanceof TLRPC.TL_dialogCommunity;
                long j = dialog.id;
                if (z) {
                    ga6 Q0 = Q0(-j);
                    if (Q0.a > 0 || Q0.b > 0) {
                    }
                } else {
                    if (j < 0) {
                        chat = M0(Long.valueOf(-j));
                    } else {
                        chat = null;
                    }
                    if (chat != null && (chat.forum || (chat.monoforum && xc2.A(this.currentAccount, chat, 24)))) {
                        long j2 = chat.id;
                        qyb qybVar = this.g4;
                        if (qybVar.l(j2) == null) {
                            if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !chat.monoforum)) {
                            }
                        } else {
                            qybVar.h(chat.id);
                            int[] iArr = qyb.w;
                            if (iArr[0] > 0 || (iArr[1] > 0 && !chat.monoforum)) {
                            }
                        }
                    } else if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !xc2.p0(chat))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void s3(long j, TLRPC.InputPeer inputPeer, long j2) {
        uc7 uc7Var;
        long j3;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                uc7Var = this;
                j3 = j;
                uc7Var.p2(j3, 0L, null);
            } else {
                uc7Var = this;
                j3 = j;
            }
            uc7Var.getNotificationCenter().k(2, 256);
            uc7Var.getMessagesStorage().C1(j3, true);
            if (uc7Var.l0()) {
                uc7Var.h5(null);
                uc7Var.getNotificationCenter().k(jn7.r, new Object[0]);
            }
        } else {
            uc7Var = this;
            j3 = j;
        }
        if (!wf3.B(j3)) {
            TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
            tL_messages_markDialogUnread.unread = true;
            if (inputPeer == null) {
                inputPeer = uc7Var.j1(j3);
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
                        cc4.g(exc, true);
                        nativeByteBuffer = nativeByteBuffer2;
                        j2 = uc7Var.getMessagesStorage().y(nativeByteBuffer);
                        uc7Var.getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new e77(uc7Var, j2, (byte) 8));
                    }
                    j2 = uc7Var.getMessagesStorage().y(nativeByteBuffer);
                }
                uc7Var.getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new e77(uc7Var, j2, (byte) 8));
            }
        }
    }

    public final void s4(ac7 ac7Var) {
        this.G0.remove(ac7Var);
        this.J0.remove(ac7Var.a);
        Integer valueOf = Integer.valueOf(ac7Var.a);
        HashSet hashSet = this.n4;
        if (hashSet.remove(valueOf)) {
            K4();
        }
        if (hashSet.contains(0)) {
            h5(null);
        }
        getNotificationCenter().k(jn7.O2, new Object[0]);
    }

    public final void s5(long j, boolean z) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = h1(j);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z;
        TLRPC.Chat M0 = M0(Long.valueOf(j));
        if (M0 != null) {
            M0.collapsed_in_dialogs = z;
            a4(M0, true);
            h5(null);
            getNotificationCenter().k(jn7.W5, Long.valueOf(j), Boolean.valueOf(z));
            getNotificationCenter().k(jn7.r, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new ic((byte) 0), new pp0((byte) 2));
    }

    public final void t(int i, int i2, long j, String str, boolean z) {
        String str2 = j + "_" + i;
        HashMap hashMap = this.h5;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().j1(j);
        tL_messages_toggleSuggestedPostApproval.msg_id = i;
        if (i2 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i2;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j + "_" + i, Boolean.valueOf(!z));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new nt(this, j, i));
    }

    public final int t1() {
        ds2 ds2Var;
        boolean p = getUserConfig().p();
        hr hrVar = this.k4;
        if (p) {
            ds2Var = hrVar.p0;
        } else {
            ds2Var = hrVar.o0;
        }
        return ds2Var.f();
    }

    public final boolean t2(long j, boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = this.p0;
        } else {
            arrayList = this.o0;
        }
        return arrayList.contains(Long.valueOf(j));
    }

    public final void t3(ArrayList arrayList, long j) {
        ArrayList arrayList2 = (ArrayList) this.S.f(j);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                r47 r47Var = (r47) arrayList2.get(i);
                if (r47Var != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (r47Var.e1() == ((Integer) arrayList.get(i2)).intValue()) {
                            r47Var.Z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public final void t4(int i) {
        long j = i | 2305843009213693952L;
        zh6 zh6Var = this.R;
        TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var.f(j);
        if (dialog == null) {
            return;
        }
        zh6Var.l(j);
        this.y.remove(dialog);
        h5(null);
        getNotificationCenter().k(jn7.r, new Object[0]);
        getNotificationCenter().k(jn7.d0, Integer.valueOf(i));
    }

    public final void t5(Runnable runnable, long j) {
        TLRPC.Chat M0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (X1 != null) {
                user = X1;
                M0 = null;
            } else {
                return;
            }
        } else {
            M0 = M0(Long.valueOf(-j));
            if (M0 == null) {
                return;
            }
        }
        this.y0--;
        this.x0.delete(j);
        if (user != null) {
            tL_contacts_unblock.id = n1(user);
        } else {
            tL_contacts_unblock.id = l1(M0);
        }
        getNotificationCenter().k(jn7.g0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new w15(runnable, (byte) 11));
    }

    public final void u(long j) {
        TLRPC.Chat M0;
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User X1 = X1(Long.valueOf(j));
            if (X1 != null) {
                user = X1;
                M0 = null;
            } else {
                return;
            }
        } else {
            M0 = M0(Long.valueOf(-j));
            if (M0 == null) {
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
        getNotificationCenter().k(jn7.g0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.id = n1(user);
        } else {
            tL_contacts_block.id = l1(M0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new xe2((byte) 0));
    }

    public final void u0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i2);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long n = wf3.n(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && n != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i3);
                        if (n == r47.B0(message) && dialog.top_message == message.id) {
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
                            n3(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
                tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
            }
        }
    }

    public final TLRPC.Chat u1(long j) {
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        TLRPC.Chat M03 = M0(Long.valueOf(j));
        if (M03 != null && (M02 = M0(Long.valueOf(M03.linked_monoforum_id))) != null) {
            return M02;
        }
        Long l = (Long) this.f.get(Long.valueOf(j));
        if (l != null && (M0 = M0(l)) != null) {
            return M0;
        }
        return null;
    }

    public final boolean u2(ac7 ac7Var) {
        if (ac7Var != null && (ac7Var.g & 64) == 0) {
            if (this.n4.contains(Integer.valueOf(ac7Var.a))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u3(long j) {
        SharedPreferences.Editor edit = this.W3.edit();
        edit.putBoolean("dialog_bar_replied" + j, true).apply();
        hl.c3(new t77(this, j, (byte) 8));
    }

    public final void u4() {
        TLRPC.Dialog dialog = this.q2;
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (j < 0) {
            TLRPC.Chat M0 = M0(Long.valueOf(-j));
            if (xc2.r0(M0) || M0.restricted) {
                q4(this.q2);
            }
        } else {
            q4(dialog);
        }
        this.q2 = null;
        h5(null);
        getNotificationCenter().k(jn7.r, new Object[0]);
    }

    public final void u5(long j, TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        boolean z;
        TLRPC.EmojiStatus emojiStatus2;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        if (j != 0 && j != getUserConfig().e()) {
            z = false;
        } else {
            z = true;
        }
        if ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && ik8.A(tL_starGiftUnique)) {
            emojiStatus2 = p0(tL_starGiftUnique);
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
                getNotificationCenter().k(jn7.p5, f);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j2 = -j;
            tL_channels_updateEmojiStatus2.channel = h1(j2);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat M0 = M0(Long.valueOf(j2));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (M0 != null) {
                M0.flags |= 512;
                M0.emoji_status = emojiStatus2;
                a4(M0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().x5(j, emojiStatus2);
        getNotificationCenter().k(2, 524288);
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public final lyc v(long j) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull N0 = N0(j);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (N0 != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long n = wf3.n(communityPeer2.peer);
                TLRPC.Chat M0 = M0(Long.valueOf(-n));
                TLRPC.User X1 = X1(Long.valueOf(n));
                if (M0 != null || X1 != null) {
                    arrayList2.add(new zb7(M0, S0(n), X1, communityPeer2));
                }
            }
        }
        lyc lycVar = new lyc((byte) 8);
        ArrayList arrayList3 = (ArrayList) lycVar.d;
        ArrayList arrayList4 = (ArrayList) lycVar.e;
        ArrayList arrayList5 = (ArrayList) lycVar.c;
        ArrayList arrayList6 = (ArrayList) lycVar.b;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            zb7 zb7Var = (zb7) obj;
            int c = gp2.c(zb7Var.b, zb7Var.d, zb7Var.c, zb7Var.a);
            if (c == 1) {
                arrayList6.add(zb7Var);
            } else if (c == 2) {
                arrayList5.add(zb7Var);
            } else if (c == 4) {
                arrayList4.add(zb7Var);
            } else if (c == 3) {
                arrayList3.add(zb7Var);
            }
        }
        j97 j97Var = this.t4;
        Collections.sort(arrayList6, j97Var);
        Collections.sort(arrayList5, j97Var);
        Collections.sort(arrayList3, j97Var);
        Collections.sort(arrayList4, j97Var);
        return lycVar;
    }

    public final boolean v0(ac7 ac7Var) {
        if (ac7Var != null) {
            if ((ac7Var.g & 64) == 0) {
                if (this.n4.contains(Integer.valueOf(ac7Var.a))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void v1(final long j, final long j2, final int i, final boolean z, final pt2 pt2Var) {
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.u97.run():void");
            }
        });
    }

    public final boolean v2(long j) {
        if (j < 0) {
            TLRPC.Chat M0 = M0(Long.valueOf(-j));
            if (M0 != null && M0.forum) {
                return true;
            }
            return false;
        }
        return lbc.w(X1(Long.valueOf(j)));
    }

    public final void v3(long j, int i, long j2) {
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new ae7(messagesStorage, i, -j, j2, (byte) 0));
        if (j != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = h1(j);
            tL_channels_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new xe2((byte) 0));
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.id.add(Integer.valueOf(i));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new h77(this, (byte) 14));
    }

    public final void v4(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.w3;
                int i2 = jn7.s1;
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
                tL_help_dismissSuggestion.peer = j1(j);
            }
            getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new xe2((byte) 0));
        }
    }

    public final void v5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        u5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final boolean w() {
        if (getUserConfig().X && !E3()) {
            return true;
        }
        return false;
    }

    public final ArrayList w0(ArrayList arrayList) {
        if (!M3()) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.TL_messages_stickerSet x0 = s1(this.currentAccount).x0((TLRPC.TL_messages_stickerSet) arrayList.get(i));
            if (x0 == null) {
                arrayList.remove(i);
                i--;
            } else {
                arrayList.set(i, x0);
            }
            i++;
        }
        return arrayList;
    }

    public final boolean w2(r47 r47Var) {
        if (r47Var != null && v2(r47.B0(r47Var.k))) {
            return true;
        }
        return false;
    }

    public final void w3(long j, long j2) {
        if (!wf3.B(j) && j != getUserConfig().e()) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ae7(messagesStorage, j2, j, 0, (byte) 3));
            TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
            tL_messages_readMentions.peer = j1(j);
            if (j2 != 0) {
                tL_messages_readMentions.top_msg_id = (int) j2;
                tL_messages_readMentions.flags |= 1;
            }
            getConnectionsManager().sendRequest(tL_messages_readMentions, null);
        }
    }

    public final void w4(w49 w49Var, String str) {
        int i;
        w49 w49Var2;
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
        zh6 zh6Var = this.P4;
        if (zh6Var != null) {
            long j3 = 0;
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) zh6Var.f(0L);
            if (tL_messages_savedReactionsTags == null) {
                zh6 zh6Var2 = this.P4;
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                zh6Var2.k(0L, tL_messages_savedReactionsTags2);
                tL_messages_savedReactionsTags = tL_messages_savedReactionsTags2;
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i = 1;
                if (i8 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i8);
                    w49Var2 = w49Var;
                    if (w49Var2.f(tL_savedReactionTag.reaction)) {
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
                    w49Var2 = w49Var;
                    z = false;
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                tL_savedReactionTag2.reaction = w49Var2.g();
                if (!TextUtils.isEmpty(str)) {
                    tL_savedReactionTag2.title = str;
                }
                tL_savedReactionTag2.count = 1;
                tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                z = true;
            }
            if (z) {
                TLRPC.TL_messages_updateSavedReactionTag tL_messages_updateSavedReactionTag = new TLRPC.TL_messages_updateSavedReactionTag();
                tL_messages_updateSavedReactionTag.reaction = w49Var2.g();
                if (!TextUtils.isEmpty(str)) {
                    tL_messages_updateSavedReactionTag.flags |= 1;
                    tL_messages_updateSavedReactionTag.title = str;
                }
                getConnectionsManager().sendRequest(tL_messages_updateSavedReactionTag, null);
                Collections.sort(tL_messages_savedReactionsTags.tags, new vk6(this, (byte) 18));
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
                                j2 = ls6.r(j5, j6);
                            } else {
                                throw new NumberFormatException("empty string");
                            }
                        } else {
                            long j7 = j4;
                            i2 = i;
                            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                j2 = ls6.r(j7, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
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
                                j2 = ls6.r(j2, j8);
                            } else {
                                throw new NumberFormatException("empty string");
                            }
                        }
                        j4 = ls6.r(j2, tL_savedReactionTag3.count);
                    }
                    i9++;
                    j3 = j;
                    i7 = 0;
                    i = 1;
                }
                tL_messages_savedReactionsTags.hash = j4;
                H4(j3, tL_messages_savedReactionsTags);
                getNotificationCenter().k(jn7.j3, Long.valueOf(j3));
            }
        }
    }

    public final void w5() {
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
                hl.r(this.e4);
                this.d4 = j;
                this.c4 = longValue2;
                l87 l87Var = new l87(this, (byte) 9);
                this.e4 = l87Var;
                hl.d3(l87Var, longValue2 * 1000);
                return;
            }
            return;
        }
        l87 l87Var2 = this.e4;
        if (l87Var2 != null) {
            this.d4 = -1L;
            this.c4 = -1L;
            hl.r(l87Var2);
        }
    }

    public final boolean x(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!wf3.B(dialog.id)) {
                boolean x = wf3.x(dialog);
                long j = dialog.id;
                if (x) {
                    TLRPC.Chat M0 = M0(Long.valueOf(-j));
                    if (!xc2.X(this.currentAccount, M0)) {
                        if (M0 != null && M0.megagroup) {
                            if (M0.gigagroup && !xc2.N(M0)) {
                                return false;
                            }
                            return true;
                        } else if (!xc2.N(M0) || !xc2.w(5, M0)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                } else if (j > 0) {
                    if (xc2.v0(this.currentAccount, X1(Long.valueOf(j)))) {
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

    public final TLRPC.TL_messages_stickerSet x0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (M3() && tL_messages_stickerSet != null) {
            int i = 0;
            for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                try {
                    if (r47.W3(tL_messages_stickerSet.documents.get(i2))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (r47.W3(tL_messages_stickerSet2.documents.get(i))) {
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

    public final Long x1() {
        if (this.O3 == null && !this.c5) {
            this.c5 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.O3;
    }

    public final boolean x2() {
        hr hrVar = this.k4;
        if (hrVar.f3.f() != 0 && hrVar.g3.f() != 0) {
            return true;
        }
        return false;
    }

    public final void x3(long j, int i, long j2) {
        TLRPC.EncryptedChat a1;
        if (j2 != 0 && j != 0) {
            if ((i > 0 || i == Integer.MIN_VALUE) && wf3.B(j) && (a1 = a1(Integer.valueOf((int) (j & 4294967295L)))) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j2));
                getSecretChatHelper().u(a1, arrayList, null);
                if (i > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    jf7 messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(new ve7(messagesStorage, a1.id, arrayList, 0, currentTime, currentTime));
                }
            }
        }
    }

    public final void x4(int i, long j, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j == 0) {
            ArrayList W0 = W0(i);
            if (W0.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = W0.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i3);
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
                        if (!wf3.B(dialog.id)) {
                            TLRPC.InputPeer j1 = j1(dialog.id);
                            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.id));
                            if (xc2.Y(M0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().h1(M0.id);
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeerCommunity);
                                objectSize = tL_inputDialogPeerCommunity.getObjectSize();
                            } else {
                                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                tL_inputDialogPeer.peer = j1;
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                                objectSize = tL_inputDialogPeer.getObjectSize();
                            }
                            i2 += objectSize;
                        }
                    }
                }
            }
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ud7(messagesStorage, arrayList2, arrayList3, (byte) 1));
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
                cc4.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j = getMessagesStorage().y(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new e77(this, j, (byte) 7));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new e77(this, j, (byte) 7));
    }

    public final void x5(long j, TLRPC.EmojiStatus emojiStatus) {
        int g = wf3.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f4;
        if (g != 0) {
            concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(g));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j));
        }
        w5();
    }

    public final void y(long j, int i, long j2) {
        zh6 zh6Var;
        zh6 zh6Var2;
        if (i >= 0) {
            zh6[] zh6VarArr = this.Z;
            if (i < zh6VarArr.length && (zh6Var = zh6VarArr[i]) != null && (zh6Var2 = (zh6) zh6Var.f(j)) != null) {
                zh6Var2.l(j2);
                if (zh6Var2.m() == 0) {
                    zh6Var.l(j);
                }
            }
        }
    }

    public final TLRPC.Peer y1(long j) {
        if (j < 0) {
            long j2 = -j;
            if (xc2.T(M0(Long.valueOf(j2)))) {
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

    public final boolean y2(long j) {
        ArrayList arrayList = this.I0;
        if (!arrayList.isEmpty() && arrayList.contains(Long.valueOf(j))) {
            return true;
        }
        return false;
    }

    public final void y3(long r13, int r15, org.telegram.tgnet.TLRPC.InputChannel r16, int r17, long r18, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.y3(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public final void y4(int i, long j, boolean z) {
        cxa cxaVar = new cxa(j, i);
        HashSet hashSet = this.d5;
        if (hashSet.contains(cxaVar)) {
            return;
        }
        hashSet.add(cxaVar);
        this.e5.add(new Pair(cxaVar, new AtomicBoolean(z)));
        l87 l87Var = this.f5;
        hl.r(l87Var);
        hl.c3(l87Var);
    }

    public final void y5(ac7 ac7Var) {
        ac7 ac7Var2;
        TLRPC.EncryptedChat a1;
        TLRPC.Chat M0;
        ArrayList arrayList = this.y;
        if (ac7Var != null) {
            ArrayList arrayList2 = ac7Var.k;
            ArrayList arrayList3 = ac7Var.l;
            arrayList2.clear();
            arrayList3.clear();
            this.q4 = ac7Var;
            try {
                Collections.sort(arrayList, this.r4);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                boolean z = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z) {
                    long j = dialog.id;
                    if (!z || (M0 = M0(Long.valueOf(-j))) == null || M0.collapsed_in_dialogs) {
                        if (wf3.B(j) && (a1 = a1(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = a1.user_id;
                        }
                        long j2 = j;
                        ac7Var2 = ac7Var;
                        if (ac7Var2.b(getAccountInstance(), j2, dialog, false)) {
                            if (x(dialog)) {
                                arrayList3.add(dialog);
                            }
                            arrayList2.add(dialog);
                        }
                        i++;
                        ac7Var = ac7Var2;
                    }
                }
                ac7Var2 = ac7Var;
                i++;
                ac7Var = ac7Var2;
            }
            try {
                Collections.sort(arrayList, this.s4);
            } catch (Exception unused) {
            }
        }
    }

    public final void z(long j, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, rj4 rj4Var) {
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
        if (xc2.S(this.currentAccount, j)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = h1(j);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new v97(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j, rj4Var), 64);
    }

    public final String z1(long j) {
        return A1(j, false);
    }

    public final boolean z2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (lbc.D(user)) {
                return !xc2.r0(chat);
            }
            TLRPC.ChatFull N0 = N0(chat.id);
            if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null) {
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

    public final void z3(r47 r47Var) {
        if (r47Var.r1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (r47Var.k.mentioned) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ae7(messagesStorage, r47Var.e1(), -r47Var.k.peer_id.channel_id, r47.B0(r47Var.k), (byte) 0));
        }
        arrayList.add(Integer.valueOf(r47Var.e1()));
        long B0 = r47.B0(r47Var.k);
        getMessagesStorage().P0(0, 0, B0, arrayList);
        getNotificationCenter().k(jn7.C0, Long.valueOf(B0), arrayList);
        int e1 = r47Var.e1();
        TLRPC.Message message = r47Var.k;
        if (e1 < 0) {
            x3(r47.B0(message), Integer.MIN_VALUE, r47Var.k.random_id);
        } else if (message.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = h1(r47Var.k.peer_id.channel_id);
            tL_channels_readMessageContents.id.add(Integer.valueOf(r47Var.e1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new xe2((byte) 0));
        } else {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.id.add(Integer.valueOf(r47Var.e1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new h77(this, (byte) 1));
        }
    }

    public final void z4(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (user != null || chat != null || encryptedChat != null) {
            SharedPreferences.Editor edit = this.W3.edit();
            edit.putInt("dialog_bar_vis3" + j, 3);
            edit.commit();
            if (wf3.B(j)) {
                if (encryptedChat != null && encryptedChat.access_hash != 0) {
                    TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new xe2((byte) 0), 2);
                }
            } else if (z) {
                TL_account.reportPeer reportpeer = new TL_account.reportPeer();
                if (chat != null) {
                    reportpeer.peer = j1(-chat.id);
                } else if (user != null) {
                    reportpeer.peer = j1(user.id);
                }
                reportpeer.message = "";
                reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
                getConnectionsManager().sendRequest(reportpeer, new xe2((byte) 0), 2);
            } else {
                TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
                if (chat != null) {
                    tL_messages_reportSpam.peer = j1(-chat.id);
                } else if (user != null) {
                    tL_messages_reportSpam.peer = j1(user.id);
                }
                getConnectionsManager().sendRequest(tL_messages_reportSpam, new xe2((byte) 0), 2);
            }
        }
    }

    public final boolean z5(int r30, long r31, java.util.ArrayList r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc7.z5(int, long, java.util.ArrayList):boolean");
    }
}
