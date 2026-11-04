package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class h10 extends c1 {
    public static int f22829t0;
    public static volatile h10[] f22830u0 = new h10[4];
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
    public final Object f22831a;
    public TLRPC.TL_help_termsOfService f22832a0;
    public volatile boolean f22833b;
    public long f22834b0;
    public TLRPC.User f22835c;
    public String f22836c0;
    public boolean d;
    public String f22837d0;
    public int f22838e;
    public String f22839e0;
    public int f22840f;
    public String f22841f0;
    public long f22842g0;
    public int h;
    public long f22843h0;
    public long f22844i0;
    public long f22845j0;
    public volatile byte[] f22846k0;
    public volatile byte[] f22847l0;
    public volatile long m0;
    public long f22848n;
    public LongSparseArray f22849n0;
    public LongSparseArray f22850o0;
    public LongSparseArray f22851p0;
    public int f22852q0;
    public int f22853r;
    public boolean f22854r0;
    public int f22855s;
    public long f22856s0;
    public boolean f22857w;
    public boolean f22858x;
    public TL_account.tmpPassword f22859y;

    public h10(int i3) {
        super(i3);
        this.f22831a = new Object();
        this.f22838e = -210000;
        this.f22840f = -1;
        this.f22858x = true;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.V = true;
        this.W = true;
        this.f22852q0 = 0;
        this.f22854r0 = false;
    }

    public static int c() {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).f21919a).p()) {
                i3++;
            }
        }
        return i3;
    }

    public static h10 i(int i3) {
        h10 h10Var;
        h10 h10Var2 = f22830u0[i3];
        if (h10Var2 == null) {
            synchronized (h10.class) {
                try {
                    h10Var = f22830u0[i3];
                    if (h10Var == null) {
                        h10[] h10VarArr = f22830u0;
                        h10 h10Var3 = new h10(i3);
                        h10VarArr[i3] = h10Var3;
                        h10Var = h10Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return h10Var;
        }
        return h10Var2;
    }

    public static int l() {
        int i3;
        for (int i10 = -1; i10 < 4; i10++) {
            if (i10 < 0) {
                i3 = f22829t0;
            } else {
                i3 = i10;
            }
            if (i(i3).p() && !ConnectionsManager.getInstance(i3).isTestBackend()) {
                return i3;
            }
        }
        return f22829t0;
    }

    public static boolean o() {
        for (int i3 = 0; i3 < 4; i3++) {
            if (i(c.a(i3).f21919a).p() && i(c.a(i3).f21919a).getUserConfig().q()) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(int i3) {
        if (i3 >= 0 && i3 < 4 && i(i3).p()) {
            return true;
        }
        return false;
    }

    public final void A(int i3, LongSparseArray longSparseArray) {
        if (i3 == 1) {
            this.f22849n0 = longSparseArray;
            Context context = t0.f25457b;
            b6.l(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0), this.f22849n0);
        } else if (i3 == 2) {
            this.f22851p0 = longSparseArray;
            Context context2 = t0.f25457b;
            b6.l(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0), this.f22851p0);
        } else if (i3 == 4) {
            this.f22850o0 = longSparseArray;
            Context context3 = t0.f25457b;
            b6.l(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0), this.f22850o0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            g0.h3(new Runnable(this) {
                public final h10 f22434b;

                {
                    this.f22434b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            h10 h10Var = this.f22434b;
                            h10Var.getMessagesController().m5(user2.premium);
                            hs.f(h10Var.currentAccount).k(308, new Object[0]);
                            hs.e().k(310, new Object[0]);
                            h10Var.getMediaDataController().R0(false);
                            h10Var.getMediaDataController().S0(false, null);
                            ei.z6 P1 = h10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            return;
                        default:
                            h10 h10Var2 = this.f22434b;
                            h10Var2.getMessagesController().m5(user2.premium);
                            hs.f(h10Var2.currentAccount).k(308, new Object[0]);
                            h10Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            g0.h3(new Runnable(this) {
                public final h10 f22434b;

                {
                    this.f22434b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            h10 h10Var = this.f22434b;
                            h10Var.getMessagesController().m5(user2.premium);
                            hs.f(h10Var.currentAccount).k(308, new Object[0]);
                            hs.e().k(310, new Object[0]);
                            h10Var.getMediaDataController().R0(false);
                            h10Var.getMediaDataController().S0(false, null);
                            ei.z6 P1 = h10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            return;
                        default:
                            h10 h10Var2 = this.f22434b;
                            h10Var2.getMessagesController().m5(user2.premium);
                            hs.f(h10Var2.currentAccount).k(308, new Object[0]);
                            h10Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        }
    }

    public final void b() {
        k().edit().clear().apply();
        this.R = 0;
        this.S = 0;
        this.f22835c = null;
        this.f22848n = 0L;
        this.d = false;
        this.h = 0;
        this.f22838e = -210000;
        this.f22840f = -1;
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
        this.f22857w = false;
        this.I = true;
        this.V = true;
        this.X = false;
        this.W = true;
        this.f22858x = true;
        this.J = true;
        this.f22832a0 = null;
        this.Q = false;
        this.Y = false;
        this.Z = (int) (System.currentTimeMillis() / 1000);
        this.f22853r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.f22855s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i3 = 0;
        while (true) {
            if (i3 < 4) {
                if (i(c.a(i3).f21919a).p()) {
                    break;
                }
                i3++;
            } else {
                az.f21681z = false;
                az.f21675x = false;
                az.f21658r = 0;
                az.f21664t = 0L;
                az.f21667u = 0L;
                az.v = 0;
                az.f21661s = "";
                az.f21672w = new byte[0];
                az.f21678y = 3600;
                az.B = 0;
                az.D = true;
                az.f21630g0 = true;
                az.C = false;
                az.A = false;
                az.J = 0;
                az.K = 0;
                az.L = 0L;
                az.M = 0;
                az.N = 0L;
                az.O = 0;
                az.P = false;
                az.Q = false;
                az.f21620c1 = 3;
                az.f21622d1 = 3;
                az.f21625e1 = 3;
                az.f21624e0 = 2;
                az.S = 0;
                az.y();
                break;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.f22831a) {
            try {
                TLRPC.User user = this.f22835c;
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
        synchronized (this.f22831a) {
            try {
                TLRPC.User user = this.f22835c;
                if (user != null) {
                    j10 = user.f27150id;
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
        synchronized (this.f22831a) {
            user = this.f22835c;
        }
        return user;
    }

    public final long[] g(int i3) {
        Integer valueOf;
        int i10;
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
        if (i3 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i3);
        }
        sb2.append(valueOf);
        String sb3 = sb2.toString();
        int i11 = -1;
        if (this.J) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        int i12 = k10.getInt(sb3, i10);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i3 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i3);
        }
        sb4.append(valueOf2);
        String sb5 = sb4.toString();
        if (this.J) {
            i11 = 0;
        }
        int i13 = k10.getInt(sb5, i11);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i3 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i3);
        }
        sb6.append(valueOf3);
        String sb7 = sb6.toString();
        if (this.J) {
            j10 = 0;
        } else {
            j10 = -1;
        }
        long b12 = g0.b1(k10, sb7, j10);
        StringBuilder sb8 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i3 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i3);
        }
        sb8.append(valueOf4);
        String sb9 = sb8.toString();
        if (this.J) {
            j11 = 0;
        } else {
            j11 = -1;
        }
        long b13 = g0.b1(k10, sb9, j11);
        StringBuilder sb10 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i3 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i3);
        }
        sb10.append(valueOf5);
        String sb11 = sb10.toString();
        if (this.J) {
            j12 = 0;
        } else {
            j12 = -1;
        }
        long b14 = g0.b1(k10, sb11, j12);
        StringBuilder sb12 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i3 != 0) {
            obj = Integer.valueOf(i3);
        }
        sb12.append(obj);
        String sb13 = sb12.toString();
        if (this.J) {
            j13 = 0;
        } else {
            j13 = -1;
        }
        return new long[]{i12, i13, b12, b13, b14, k10.getLong(sb13, j13)};
    }

    public final int h() {
        return this.f22852q0;
    }

    public final int j() {
        int i3;
        synchronized (this.f22831a) {
            i3 = this.f22838e;
            this.f22838e = i3 - 1;
        }
        return i3;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return t0.f25457b.getSharedPreferences("userconfing", 0);
        }
        Context context = t0.f25457b;
        return context.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public final LongSparseArray m(int i3) {
        if (i3 == 1) {
            if (this.f22849n0 == null) {
                Context context = t0.f25457b;
                this.f22849n0 = b6.j(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f22849n0;
        } else if (i3 == 2) {
            if (this.f22851p0 == null) {
                Context context2 = t0.f25457b;
                this.f22851p0 = b6.j(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f22851p0;
        } else if (i3 == 4) {
            if (this.f22850o0 == null) {
                Context context3 = t0.f25457b;
                this.f22850o0 = b6.j(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f22850o0;
        } else {
            return null;
        }
    }

    public final int n(int i3) {
        Object valueOf;
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i3 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i3);
        }
        sb2.append(valueOf);
        return k10.getInt(sb2.toString(), 0);
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f22831a) {
            if (this.f22835c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean q() {
        TLRPC.User user = this.f22835c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.h10.s():void");
    }

    public final void t() {
        if (!this.f22854r0 && System.currentTimeMillis() - this.f22856s0 >= 60000) {
            this.f22854r0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new s1(this, 8));
        }
    }

    public final void u() {
        this.m0 = 0L;
        if (this.f22846k0 != null) {
            Arrays.fill(this.f22846k0, (byte) 0);
            this.f22846k0 = null;
        }
        if (this.f22847l0 != null) {
            Arrays.fill(this.f22847l0, (byte) 0);
            this.f22847l0 = null;
        }
    }

    public final void v(boolean z10) {
        hs.f(this.currentAccount).d(new g10(0, this, z10));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.f22831a) {
            TLRPC.User user2 = this.f22835c;
            this.f22835c = user;
            this.f22848n = user.f27150id;
            a(user2, user);
        }
    }

    public final void x(int i3, int i10, int i11, long j10, long j11, long j12, long j13) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i3 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i3);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i10);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i3 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i3);
        }
        sb3.append(valueOf2);
        edit.putInt(sb3.toString(), i11);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i3 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i3);
        }
        sb4.append(valueOf3);
        edit.putLong(sb4.toString(), j10);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i3 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i3);
        }
        sb5.append(valueOf4);
        edit.putLong(sb5.toString(), j11);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i3 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i3);
        }
        sb6.append(valueOf5);
        edit.putLong(sb6.toString(), j12);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i3 != 0) {
            obj = Integer.valueOf(i3);
        }
        sb7.append(obj);
        edit.putLong(sb7.toString(), j13);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public final void y(int i3, boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("2pinnedDialogsLoaded" + i3, z10).commit();
    }

    public final void z(int i3, int i10) {
        Object valueOf;
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i3 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i3);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i10).commit();
    }
}
