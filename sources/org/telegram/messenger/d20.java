package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d20 extends f1 {
    public static int f15147s0;
    public static volatile d20[] f15148t0 = new d20[4];
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public long L;
    public long M;
    public long N;
    public long O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public TLRPC.TL_help_termsOfService Z;
    public final Object f15149a;
    public long f15150a0;
    public volatile boolean f15151b;
    public String f15152b0;
    public TLRPC.User f15153c;
    public String f15154c0;
    public boolean d;
    public String f15155d0;
    public int e;
    public String f15156e0;
    public int f15157f;
    public long f15158f0;
    public long f15159g0;
    public int h;
    public long f15160h0;
    public long f15161i0;
    public volatile byte[] f15162j0;
    public volatile byte[] f15163k0;
    public volatile long f15164l0;
    public LongSparseArray m0;
    public long f15165n;
    public LongSparseArray f15166n0;
    public LongSparseArray f15167o0;
    public int f15168p0;
    public boolean f15169q0;
    public int f15170r;
    public long f15171r0;
    public int f15172s;
    public boolean f15173w;
    public boolean f15174x;
    public TL_account.tmpPassword f15175y;

    public d20(int i10) {
        super(i10);
        this.f15149a = new Object();
        this.e = -210000;
        this.f15157f = -1;
        this.f15174x = true;
        this.J = -1;
        this.K = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.U = true;
        this.V = true;
        this.f15168p0 = 0;
        this.f15169q0 = false;
    }

    public static int c() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (i(c.a(i11).f14863a).p()) {
                i10++;
            }
        }
        return i10;
    }

    public static d20 i(int i10) {
        d20 d20Var;
        d20 d20Var2 = f15148t0[i10];
        if (d20Var2 == null) {
            synchronized (d20.class) {
                try {
                    d20Var = f15148t0[i10];
                    if (d20Var == null) {
                        d20[] d20VarArr = f15148t0;
                        d20 d20Var3 = new d20(i10);
                        d20VarArr[i10] = d20Var3;
                        d20Var = d20Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return d20Var;
        }
        return d20Var2;
    }

    public static int l() {
        int i10;
        for (int i11 = -1; i11 < 4; i11++) {
            if (i11 < 0) {
                i10 = f15147s0;
            } else {
                i10 = i11;
            }
            if (i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                return i10;
            }
        }
        return f15147s0;
    }

    public static boolean o() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).f14863a).p() && i(c.a(i10).f14863a).getUserConfig().q()) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(int i10) {
        if (i10 >= 0 && i10 < 4 && i(i10).p()) {
            return true;
        }
        return false;
    }

    public final void A(int i10, LongSparseArray longSparseArray) {
        if (i10 == 1) {
            this.m0 = longSparseArray;
            Context context = w0.f19025b;
            js.m(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0), this.m0);
        } else if (i10 == 2) {
            this.f15167o0 = longSparseArray;
            Context context2 = w0.f19025b;
            js.m(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0), this.f15167o0);
        } else if (i10 == 4) {
            this.f15166n0 = longSparseArray;
            Context context3 = w0.f19025b;
            js.m(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0), this.f15166n0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            i0.g3(new Runnable(this) {
                public final d20 f14709b;

                {
                    this.f14709b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            d20 d20Var = this.f14709b;
                            d20Var.getMessagesController().j5(user2.premium);
                            zs.f(d20Var.currentAccount).k(308, new Object[0]);
                            zs.e().k(310, new Object[0]);
                            d20Var.getMediaDataController().R0(false);
                            d20Var.getMediaDataController().S0(false, null);
                            th.e5 O1 = d20Var.getMessagesController().O1();
                            O1.R = false;
                            O1.S = null;
                            return;
                        default:
                            d20 d20Var2 = this.f14709b;
                            d20Var2.getMessagesController().j5(user2.premium);
                            zs.f(d20Var2.currentAccount).k(308, new Object[0]);
                            d20Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            i0.g3(new Runnable(this) {
                public final d20 f14709b;

                {
                    this.f14709b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            d20 d20Var = this.f14709b;
                            d20Var.getMessagesController().j5(user2.premium);
                            zs.f(d20Var.currentAccount).k(308, new Object[0]);
                            zs.e().k(310, new Object[0]);
                            d20Var.getMediaDataController().R0(false);
                            d20Var.getMediaDataController().S0(false, null);
                            th.e5 O1 = d20Var.getMessagesController().O1();
                            O1.R = false;
                            O1.S = null;
                            return;
                        default:
                            d20 d20Var2 = this.f14709b;
                            d20Var2.getMessagesController().j5(user2.premium);
                            zs.f(d20Var2.currentAccount).k(308, new Object[0]);
                            d20Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        }
    }

    public final void b() {
        k().edit().clear().apply();
        this.Q = 0;
        this.R = 0;
        this.f15153c = null;
        this.f15165n = 0L;
        this.d = false;
        this.h = 0;
        this.e = -210000;
        this.f15157f = -1;
        this.S = false;
        this.T = false;
        this.J = -1;
        this.K = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.f15173w = false;
        this.H = true;
        this.U = true;
        this.W = false;
        this.V = true;
        this.f15174x = true;
        this.I = true;
        this.Z = null;
        this.P = false;
        this.X = false;
        this.Y = (int) (System.currentTimeMillis() / 1000);
        this.f15170r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.f15172s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                if (i(c.a(i10).f14863a).p()) {
                    break;
                }
                i10++;
            } else {
                tz.f18200z = false;
                tz.f18194x = false;
                tz.f18177r = 0;
                tz.f18183t = 0L;
                tz.f18186u = 0L;
                tz.v = 0;
                tz.f18180s = "";
                tz.f18191w = new byte[0];
                tz.f18197y = 3600;
                tz.B = 0;
                tz.D = true;
                tz.f18148g0 = true;
                tz.C = false;
                tz.A = false;
                tz.J = 0;
                tz.K = 0;
                tz.L = 0L;
                tz.M = 0;
                tz.N = 0L;
                tz.O = 0;
                tz.P = false;
                tz.Q = false;
                tz.f18139c1 = 3;
                tz.f18141d1 = 3;
                tz.f18143e1 = 3;
                tz.f18142e0 = 2;
                tz.S = 0;
                tz.y();
                break;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.f15149a) {
            try {
                TLRPC.User user = this.f15153c;
                if (user == null || (str = user.phone) == null) {
                    str = "";
                }
            } finally {
            }
        }
        return str;
    }

    public final long e() {
        long j10;
        synchronized (this.f15149a) {
            try {
                TLRPC.User user = this.f15153c;
                if (user != null) {
                    j10 = user.f19942id;
                } else {
                    j10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public final TLRPC.User f() {
        TLRPC.User user;
        synchronized (this.f15149a) {
            user = this.f15153c;
        }
        return user;
    }

    public final long[] g(int i10) {
        Integer valueOf;
        int i11;
        Integer valueOf2;
        Integer valueOf3;
        long j10;
        Integer valueOf4;
        long j11;
        Integer valueOf5;
        long j12;
        long j13;
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        String sb3 = sb2.toString();
        int i12 = -1;
        if (this.I) {
            i11 = 0;
        } else {
            i11 = -1;
        }
        int i13 = k10.getInt(sb3, i11);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i10 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i10);
        }
        sb4.append(valueOf2);
        String sb5 = sb4.toString();
        if (this.I) {
            i12 = 0;
        }
        int i14 = k10.getInt(sb5, i12);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i10 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i10);
        }
        sb6.append(valueOf3);
        String sb7 = sb6.toString();
        if (this.I) {
            j10 = 0;
        } else {
            j10 = -1;
        }
        long b12 = i0.b1(k10, sb7, j10);
        StringBuilder sb8 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i10 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i10);
        }
        sb8.append(valueOf4);
        String sb9 = sb8.toString();
        if (this.I) {
            j11 = 0;
        } else {
            j11 = -1;
        }
        long b13 = i0.b1(k10, sb9, j11);
        StringBuilder sb10 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i10 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i10);
        }
        sb10.append(valueOf5);
        String sb11 = sb10.toString();
        if (this.I) {
            j12 = 0;
        } else {
            j12 = -1;
        }
        long b14 = i0.b1(k10, sb11, j12);
        StringBuilder sb12 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i10 != 0) {
            obj = Integer.valueOf(i10);
        }
        sb12.append(obj);
        String sb13 = sb12.toString();
        if (this.I) {
            j13 = 0;
        } else {
            j13 = -1;
        }
        return new long[]{i13, i14, b12, b13, b14, k10.getLong(sb13, j13)};
    }

    public final int h() {
        return this.f15168p0;
    }

    public final int j() {
        int i10;
        synchronized (this.f15149a) {
            i10 = this.e;
            this.e = i10 - 1;
        }
        return i10;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return w0.f19025b.getSharedPreferences("userconfing", 0);
        }
        Context context = w0.f19025b;
        return context.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public final LongSparseArray m(int i10) {
        if (i10 == 1) {
            if (this.m0 == null) {
                Context context = w0.f19025b;
                this.m0 = js.j(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.m0;
        } else if (i10 == 2) {
            if (this.f15167o0 == null) {
                Context context2 = w0.f19025b;
                this.f15167o0 = js.j(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f15167o0;
        } else if (i10 == 4) {
            if (this.f15166n0 == null) {
                Context context3 = w0.f19025b;
                this.f15166n0 = js.j(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f15166n0;
        } else {
            return null;
        }
    }

    public final int n(int i10) {
        Object valueOf;
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        return k10.getInt(sb2.toString(), 0);
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f15149a) {
            if (this.f15153c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean q() {
        TLRPC.User user = this.f15153c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d20.s():void");
    }

    public final void t() {
        if (!this.f15169q0 && System.currentTimeMillis() - this.f15171r0 >= 60000) {
            this.f15169q0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new v1(this, 8));
        }
    }

    public final void u() {
        this.f15164l0 = 0L;
        if (this.f15162j0 != null) {
            Arrays.fill(this.f15162j0, (byte) 0);
            this.f15162j0 = null;
        }
        if (this.f15163k0 != null) {
            Arrays.fill(this.f15163k0, (byte) 0);
            this.f15163k0 = null;
        }
    }

    public final void v(boolean z10) {
        zs.f(this.currentAccount).d(new c20(0, this, z10));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.f15149a) {
            TLRPC.User user2 = this.f15153c;
            this.f15153c = user;
            this.f15165n = user.f19942id;
            a(user2, user);
        }
    }

    public final void x(int i10, int i11, int i12, long j10, long j11, long j12, long j13) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i11);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i10 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i10);
        }
        sb3.append(valueOf2);
        edit.putInt(sb3.toString(), i12);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i10 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i10);
        }
        sb4.append(valueOf3);
        edit.putLong(sb4.toString(), j10);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i10 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i10);
        }
        sb5.append(valueOf4);
        edit.putLong(sb5.toString(), j11);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i10 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i10);
        }
        sb6.append(valueOf5);
        edit.putLong(sb6.toString(), j12);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i10 != 0) {
            obj = Integer.valueOf(i10);
        }
        sb7.append(obj);
        edit.putLong(sb7.toString(), j13);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public final void y(int i10, boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("2pinnedDialogsLoaded" + i10, z10).commit();
    }

    public final void z(int i10, int i11) {
        Object valueOf;
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i11).commit();
    }
}
