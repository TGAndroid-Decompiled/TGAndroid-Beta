package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y6c extends pf0 {
    public static int t0;
    public static volatile y6c[] u0 = new y6c[4];
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final Object a;
    public TLRPC.TL_help_termsOfService a0;
    public volatile boolean b;
    public long b0;
    public TLRPC.User c;
    public String c0;
    public boolean d;
    public String d0;
    public int e;
    public String e0;
    public int f;
    public String f0;
    public long g0;
    public int h;
    public long h0;
    public long i0;
    public long j0;
    public volatile byte[] k0;
    public volatile byte[] l0;
    public volatile long m0;
    public long n;
    public LongSparseArray n0;
    public LongSparseArray o0;
    public LongSparseArray p0;
    public int q0;
    public int r;
    public boolean r0;
    public int s;
    public long s0;
    public boolean w;
    public boolean x;
    public TL_account.tmpPassword y;

    public y6c(int i) {
        super(i);
        this.a = new Object();
        this.e = -210000;
        this.f = -1;
        this.x = true;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.V = true;
        this.W = true;
        this.q0 = 0;
        this.r0 = false;
    }

    public static int c() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (h(j5.a(i2).a).o()) {
                i++;
            }
        }
        return i;
    }

    public static y6c h(int i) {
        y6c y6cVar;
        y6c y6cVar2 = u0[i];
        if (y6cVar2 == null) {
            synchronized (y6c.class) {
                y6cVar = u0[i];
                if (y6cVar == null) {
                    y6c[] y6cVarArr = u0;
                    y6c y6cVar3 = new y6c(i);
                    y6cVarArr[i] = y6cVar3;
                    y6cVar = y6cVar3;
                }
            }
            return y6cVar;
        }
        return y6cVar2;
    }

    public static int k() {
        int i;
        for (int i2 = -1; i2 < 4; i2++) {
            if (i2 < 0) {
                i = t0;
            } else {
                i = i2;
            }
            if (h(i).o() && !ConnectionsManager.getInstance(i).isTestBackend()) {
                return i;
            }
        }
        return t0;
    }

    public static boolean n() {
        for (int i = 0; i < 4; i++) {
            if (h(j5.a(i).a).o() && h(j5.a(i).a).getUserConfig().p()) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(int i) {
        if (i >= 0 && i < 4 && h(i).o()) {
            return true;
        }
        return false;
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            gl.c3(new Runnable(this) {
                public final y6c b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    TLRPC.User user3 = user2;
                    y6c y6cVar = this.b;
                    switch (b) {
                        case 0:
                            y6cVar.getMessagesController().s5(user3.premium);
                            kk7.f(y6cVar.currentAccount).k(311, new Object[0]);
                            kk7.e().k(313, new Object[0]);
                            y6cVar.getMediaDataController().T0(false);
                            y6cVar.getMediaDataController().U0(false, null);
                            g2b M1 = y6cVar.getMessagesController().M1();
                            M1.R = false;
                            M1.S = null;
                            return;
                        default:
                            y6cVar.getMessagesController().s5(user3.premium);
                            kk7.f(y6cVar.currentAccount).k(311, new Object[0]);
                            y6cVar.getMediaDataController().T0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            gl.c3(new Runnable(this) {
                public final y6c b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    TLRPC.User user3 = user2;
                    y6c y6cVar = this.b;
                    switch (b) {
                        case 0:
                            y6cVar.getMessagesController().s5(user3.premium);
                            kk7.f(y6cVar.currentAccount).k(311, new Object[0]);
                            kk7.e().k(313, new Object[0]);
                            y6cVar.getMediaDataController().T0(false);
                            y6cVar.getMediaDataController().U0(false, null);
                            g2b M1 = y6cVar.getMessagesController().M1();
                            M1.R = false;
                            M1.S = null;
                            return;
                        default:
                            y6cVar.getMessagesController().s5(user3.premium);
                            kk7.f(y6cVar.currentAccount).k(311, new Object[0]);
                            y6cVar.getMediaDataController().T0(true);
                            return;
                    }
                }
            });
        }
    }

    public final void b() {
        j().edit().clear().apply();
        this.R = 0;
        this.S = 0;
        this.c = null;
        this.n = 0L;
        this.d = false;
        this.h = 0;
        this.e = -210000;
        this.f = -1;
        this.T = false;
        this.U = false;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.w = false;
        this.I = true;
        this.V = true;
        this.X = false;
        this.W = true;
        this.x = true;
        this.J = true;
        this.a0 = null;
        this.Q = false;
        this.Y = false;
        this.Z = (int) (System.currentTimeMillis() / 1000);
        this.r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        t();
        int i = 0;
        while (true) {
            if (i < 4) {
                if (h(j5.a(i).a).o()) {
                    break;
                }
                i++;
            } else {
                gba.y = false;
                gba.w = false;
                gba.q = 0;
                gba.s = 0L;
                gba.t = 0L;
                gba.u = 0;
                gba.r = "";
                gba.v = new byte[0];
                gba.x = 3600;
                gba.A = 0;
                gba.C = true;
                gba.d0 = true;
                gba.B = false;
                gba.z = false;
                gba.I = 0;
                gba.J = 0;
                gba.K = 0L;
                gba.L = 0;
                gba.M = 0L;
                gba.N = 0;
                gba.O = false;
                gba.P = false;
                gba.Y0 = 3;
                gba.Z0 = 3;
                gba.a1 = 3;
                gba.b0 = 2;
                gba.R = 0;
                gba.x();
                break;
            }
        }
        u(true);
    }

    public final String d() {
        String str;
        synchronized (this.a) {
            TLRPC.User user = this.c;
            str = (user == null || (str = user.phone) == null) ? "" : "";
        }
        return str;
    }

    public final long e() {
        long j;
        synchronized (this.a) {
            TLRPC.User user = this.c;
            if (user != null) {
                j = user.id;
            } else {
                j = 0;
            }
        }
        return j;
    }

    public final TLRPC.User f() {
        TLRPC.User user;
        synchronized (this.a) {
            user = this.c;
        }
        return user;
    }

    public final long[] g(int i) {
        Integer valueOf;
        int i2;
        Integer valueOf2;
        Integer valueOf3;
        long j;
        Integer valueOf4;
        long j2;
        Integer valueOf5;
        long j3;
        long j4;
        SharedPreferences j5 = j();
        StringBuilder sb = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        String sb2 = sb.toString();
        int i3 = -1;
        if (this.J) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        int i4 = j5.getInt(sb2, i2);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i);
        }
        sb3.append(valueOf2);
        String sb4 = sb3.toString();
        if (this.J) {
            i3 = 0;
        }
        int i5 = j5.getInt(sb4, i3);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i);
        }
        sb5.append(valueOf3);
        String sb6 = sb5.toString();
        if (this.J) {
            j = 0;
        } else {
            j = -1;
        }
        long a1 = gl.a1(j5, sb6, j);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i);
        }
        sb7.append(valueOf4);
        String sb8 = sb7.toString();
        if (this.J) {
            j2 = 0;
        } else {
            j2 = -1;
        }
        long a12 = gl.a1(j5, sb8, j2);
        StringBuilder sb9 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i);
        }
        sb9.append(valueOf5);
        String sb10 = sb9.toString();
        if (this.J) {
            j3 = 0;
        } else {
            j3 = -1;
        }
        long a13 = gl.a1(j5, sb10, j3);
        StringBuilder sb11 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i != 0) {
            obj = Integer.valueOf(i);
        }
        sb11.append(obj);
        String sb12 = sb11.toString();
        if (this.J) {
            j4 = 0;
        } else {
            j4 = -1;
        }
        return new long[]{i4, i5, a1, a12, a13, j5.getLong(sb12, j4)};
    }

    public final int i() {
        int i;
        synchronized (this.a) {
            i = this.e;
            this.e = i - 1;
        }
        return i;
    }

    public final SharedPreferences j() {
        if (this.currentAccount == 0) {
            return a.b.getSharedPreferences("userconfing", 0);
        }
        return oo1.k(new StringBuilder("userconfig"), this.currentAccount, a.b, 0);
    }

    public final LongSparseArray l(int i) {
        if (i == 1) {
            LongSparseArray longSparseArray = this.n0;
            if (longSparseArray == null) {
                Context context = a.b;
                LongSparseArray c = mte.c(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
                this.n0 = c;
                return c;
            }
            return longSparseArray;
        } else if (i == 2) {
            LongSparseArray longSparseArray2 = this.p0;
            if (longSparseArray2 == null) {
                Context context2 = a.b;
                LongSparseArray c2 = mte.c(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
                this.p0 = c2;
                return c2;
            }
            return longSparseArray2;
        } else if (i == 4) {
            LongSparseArray longSparseArray3 = this.o0;
            if (longSparseArray3 == null) {
                Context context3 = a.b;
                LongSparseArray c3 = mte.c(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
                this.o0 = c3;
                return c3;
            }
            return longSparseArray3;
        } else {
            return null;
        }
    }

    public final int m(int i) {
        Object valueOf;
        SharedPreferences j = j();
        StringBuilder sb = new StringBuilder("2totalDialogsLoadCount");
        if (i == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        return j.getInt(sb.toString(), 0);
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            if (this.c != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean p() {
        TLRPC.User user = this.c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void r() {
        boolean z;
        byte[] decode;
        byte[] decode2;
        byte[] decode3;
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            SharedPreferences j = j();
            if (this.currentAccount == 0) {
                t0 = j.getInt("selectedAccount", 0);
            }
            this.d = j.getBoolean("registeredForPush", false);
            this.e = j.getInt("lastSendMessageId", -210000);
            this.h = j.getInt("contactsSavedCount", 0);
            this.f = j.getInt("lastBroadcastId", -1);
            this.r = j.getInt("lastContactsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 82800);
            this.s = j.getInt("lastHintsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 90000);
            this.w = j.getBoolean("draftsLoaded", false);
            this.x = j.getBoolean("unreadDialogsLoaded", false);
            this.I = j.getBoolean("contactsReimported", false);
            this.E = j.getInt("ratingLoadTime", 0);
            this.F = j.getInt("botRatingLoadTime", 0);
            this.G = j.getInt("botGuestRatingLoadTime", 0);
            this.H = j.getInt("webappRatingLoadTime", 0);
            this.Z = j.getInt("loginTime", this.currentAccount);
            this.V = j.getBoolean("syncContacts", true);
            this.X = j.getBoolean("showCallsTab", false);
            this.W = j.getBoolean("suggestContacts", true);
            this.Y = j.getBoolean("hasSecureData", false);
            this.T = j.getBoolean("notificationsSettingsLoaded4", false);
            this.U = j.getBoolean("notificationsSignUpSettingsLoaded", false);
            this.b0 = j.getLong("autoDownloadConfigLoadTime", 0L);
            if (!j.contains("2dialogsLoadOffsetId") && !j.getBoolean("hasValidDialogLoadIds", false)) {
                z = false;
            } else {
                z = true;
            }
            this.J = z;
            this.R = j.getInt("sharingMyLocationUntil", 0);
            this.S = j.getInt("lastMyLocationShareTime", 0);
            this.Q = j.getBoolean("filtersLoaded", false);
            this.c0 = j.getString("premiumGiftsStickerPack", null);
            this.g0 = j.getLong("lastUpdatedPremiumGiftsStickerPack", 0L);
            this.e0 = j.getString("genericAnimationsStickerPack", null);
            this.i0 = j.getLong("lastUpdatedGenericAnimations", 0L);
            try {
                String string = j.getString("terms", null);
                if (string != null && (decode3 = Base64.decode(string, 0)) != null) {
                    SerializedData serializedData = new SerializedData(decode3);
                    this.a0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            int i = j.getInt("6migrateOffsetId", 0);
            this.K = i;
            if (i != -1) {
                this.L = j.getInt("6migrateOffsetDate", 0);
                this.M = gl.a1(j, "6migrateOffsetUserId", 0L);
                this.N = gl.a1(j, "6migrateOffsetChatId", 0L);
                this.O = gl.a1(j, "6migrateOffsetChannelId", 0L);
                this.P = j.getLong("6migrateOffsetAccess", 0L);
            }
            String string2 = j.getString("tmpPassword", null);
            if (string2 != null && (decode2 = Base64.decode(string2, 0)) != null) {
                SerializedData serializedData2 = new SerializedData(decode2);
                this.y = TL_account.tmpPassword.TLdeserialize(serializedData2, serializedData2.readInt32(false), false);
                serializedData2.cleanup();
            }
            String string3 = j.getString("user", null);
            if (string3 != null && (decode = Base64.decode(string3, 0)) != null) {
                SerializedData serializedData3 = new SerializedData(decode);
                this.c = TLRPC.User.TLdeserialize(serializedData3, serializedData3.readInt32(false), false);
                serializedData3.cleanup();
            }
            TLRPC.User user = this.c;
            if (user != null) {
                a(null, user);
                this.n = this.c.id;
            }
            this.b = true;
        }
    }

    public final void s() {
        if (!this.r0 && System.currentTimeMillis() - this.s0 >= 60000) {
            this.r0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new wx9(this, (byte) 19));
        }
    }

    public final void t() {
        this.m0 = 0L;
        if (this.k0 != null) {
            Arrays.fill(this.k0, (byte) 0);
            this.k0 = null;
        }
        if (this.l0 != null) {
            Arrays.fill(this.l0, (byte) 0);
            this.l0 = null;
        }
    }

    public final void u(boolean z) {
        kk7.f(this.currentAccount).d(new x6c((byte) 0, this, z));
    }

    public final void v(TLRPC.User user) {
        synchronized (this.a) {
            TLRPC.User user2 = this.c;
            this.c = user;
            this.n = user.id;
            a(user2, user);
        }
    }

    public final void w(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        SharedPreferences.Editor edit = j().edit();
        StringBuilder sb = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        edit.putInt(sb.toString(), i2);
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i);
        }
        sb2.append(valueOf2);
        edit.putInt(sb2.toString(), i3);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i);
        }
        sb3.append(valueOf3);
        edit.putLong(sb3.toString(), j);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i);
        }
        sb4.append(valueOf4);
        edit.putLong(sb4.toString(), j2);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i);
        }
        sb5.append(valueOf5);
        edit.putLong(sb5.toString(), j3);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i != 0) {
            obj = Integer.valueOf(i);
        }
        sb6.append(obj);
        edit.putLong(sb6.toString(), j4);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public final void x(int i, boolean z) {
        SharedPreferences.Editor edit = j().edit();
        edit.putBoolean("2pinnedDialogsLoaded" + i, z).commit();
    }

    public final void y(int i, int i2) {
        Object valueOf;
        SharedPreferences.Editor edit = j().edit();
        StringBuilder sb = new StringBuilder("2totalDialogsLoadCount");
        if (i == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        edit.putInt(sb.toString(), i2).commit();
    }

    public final void z(int i, LongSparseArray longSparseArray) {
        if (i == 1) {
            this.n0 = longSparseArray;
            mte.e(oo1.k(new StringBuilder("users_save_gallery_exceptions_"), this.currentAccount, a.b, 0), this.n0);
        } else if (i == 2) {
            this.p0 = longSparseArray;
            mte.e(oo1.k(new StringBuilder("groups_save_gallery_exceptions_"), this.currentAccount, a.b, 0), this.p0);
        } else if (i == 4) {
            this.o0 = longSparseArray;
            mte.e(oo1.k(new StringBuilder("channels_save_gallery_exceptions_"), this.currentAccount, a.b, 0), this.o0);
        }
    }
}
