package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m10 extends c1 {
    public static int f24934t0;
    public static volatile m10[] f24935u0 = new m10[4];
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
    public final Object f24936a;
    public TLRPC.TL_help_termsOfService f24937a0;
    public volatile boolean f24938b;
    public long f24939b0;
    public TLRPC.User f24940c;
    public String f24941c0;
    public boolean d;
    public String f24942d0;
    public int f24943e;
    public String f24944e0;
    public int f24945f;
    public String f24946f0;
    public long f24947g0;
    public int h;
    public long f24948h0;
    public long f24949i0;
    public long f24950j0;
    public volatile byte[] f24951k0;
    public volatile byte[] f24952l0;
    public volatile long m0;
    public long f24953n;
    public LongSparseArray f24954n0;
    public LongSparseArray f24955o0;
    public LongSparseArray f24956p0;
    public int f24957q0;
    public int f24958r;
    public boolean f24959r0;
    public int f24960s;
    public long f24961s0;
    public boolean f24962w;
    public boolean f24963x;
    public TL_account.tmpPassword f24964y;

    public m10(int i7) {
        super(i7);
        this.f24936a = new Object();
        this.f24943e = -210000;
        this.f24945f = -1;
        this.f24963x = true;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.V = true;
        this.W = true;
        this.f24957q0 = 0;
        this.f24959r0 = false;
    }

    public static int c() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).f22778a).p()) {
                i7++;
            }
        }
        return i7;
    }

    public static m10 i(int i7) {
        m10 m10Var;
        m10 m10Var2 = f24935u0[i7];
        if (m10Var2 == null) {
            synchronized (m10.class) {
                try {
                    m10Var = f24935u0[i7];
                    if (m10Var == null) {
                        m10[] m10VarArr = f24935u0;
                        m10 m10Var3 = new m10(i7);
                        m10VarArr[i7] = m10Var3;
                        m10Var = m10Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m10Var;
        }
        return m10Var2;
    }

    public static int l() {
        int i7;
        for (int i10 = -1; i10 < 4; i10++) {
            if (i10 < 0) {
                i7 = f24934t0;
            } else {
                i7 = i10;
            }
            if (i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                return i7;
            }
        }
        return f24934t0;
    }

    public static boolean o() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (i(c.a(i7).f22778a).p() && i(c.a(i7).f22778a).getUserConfig().q()) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(int i7) {
        if (i7 >= 0 && i7 < 4 && i(i7).p()) {
            return true;
        }
        return false;
    }

    public final void A(int i7, LongSparseArray longSparseArray) {
        if (i7 == 1) {
            this.f24954n0 = longSparseArray;
            Context context = t0.f26600b;
            b6.n(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0), this.f24954n0);
        } else if (i7 == 2) {
            this.f24956p0 = longSparseArray;
            Context context2 = t0.f26600b;
            b6.n(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0), this.f24956p0);
        } else if (i7 == 4) {
            this.f24955o0 = longSparseArray;
            Context context3 = t0.f26600b;
            b6.n(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0), this.f24955o0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            g0.h3(new Runnable(this) {
                public final m10 f24625b;

                {
                    this.f24625b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            m10 m10Var = this.f24625b;
                            m10Var.getMessagesController().n5(user2.premium);
                            ns.f(m10Var.currentAccount).k(308, new Object[0]);
                            ns.e().k(310, new Object[0]);
                            m10Var.getMediaDataController().R0(false);
                            m10Var.getMediaDataController().S0(false, null);
                            fi.s6 P1 = m10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            return;
                        default:
                            m10 m10Var2 = this.f24625b;
                            m10Var2.getMessagesController().n5(user2.premium);
                            ns.f(m10Var2.currentAccount).k(308, new Object[0]);
                            m10Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            g0.h3(new Runnable(this) {
                public final m10 f24625b;

                {
                    this.f24625b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            m10 m10Var = this.f24625b;
                            m10Var.getMessagesController().n5(user2.premium);
                            ns.f(m10Var.currentAccount).k(308, new Object[0]);
                            ns.e().k(310, new Object[0]);
                            m10Var.getMediaDataController().R0(false);
                            m10Var.getMediaDataController().S0(false, null);
                            fi.s6 P1 = m10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            return;
                        default:
                            m10 m10Var2 = this.f24625b;
                            m10Var2.getMessagesController().n5(user2.premium);
                            ns.f(m10Var2.currentAccount).k(308, new Object[0]);
                            m10Var2.getMediaDataController().R0(true);
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
        this.f24940c = null;
        this.f24953n = 0L;
        this.d = false;
        this.h = 0;
        this.f24943e = -210000;
        this.f24945f = -1;
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
        this.f24962w = false;
        this.I = true;
        this.V = true;
        this.X = false;
        this.W = true;
        this.f24963x = true;
        this.J = true;
        this.f24937a0 = null;
        this.Q = false;
        this.Y = false;
        this.Z = (int) (System.currentTimeMillis() / 1000);
        this.f24958r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.f24960s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i7 = 0;
        while (true) {
            if (i7 < 4) {
                if (i(c.a(i7).f22778a).p()) {
                    break;
                }
                i7++;
            } else {
                gz.f23998z = false;
                gz.f23992x = false;
                gz.f23975r = 0;
                gz.f23981t = 0L;
                gz.f23984u = 0L;
                gz.v = 0;
                gz.f23978s = "";
                gz.f23989w = new byte[0];
                gz.f23995y = 3600;
                gz.B = 0;
                gz.D = true;
                gz.f23947g0 = true;
                gz.C = false;
                gz.A = false;
                gz.J = 0;
                gz.K = 0;
                gz.L = 0L;
                gz.M = 0;
                gz.N = 0L;
                gz.O = 0;
                gz.P = false;
                gz.Q = false;
                gz.f23937c1 = 3;
                gz.f23939d1 = 3;
                gz.f23942e1 = 3;
                gz.f23941e0 = 2;
                gz.S = 0;
                gz.y();
                break;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.f24936a) {
            try {
                TLRPC.User user = this.f24940c;
                if (user == null || (str = user.phone) == null) {
                    str = "";
                }
            } finally {
            }
        }
        return str;
    }

    public final long e() {
        long j3;
        synchronized (this.f24936a) {
            try {
                TLRPC.User user = this.f24940c;
                if (user != null) {
                    j3 = user.f28200id;
                } else {
                    j3 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j3;
    }

    public final TLRPC.User f() {
        TLRPC.User user;
        synchronized (this.f24936a) {
            user = this.f24940c;
        }
        return user;
    }

    public final long[] g(int i7) {
        Integer valueOf;
        int i10;
        Integer valueOf2;
        Integer valueOf3;
        long j3;
        Integer valueOf4;
        long j10;
        Integer valueOf5;
        long j11;
        long j12;
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i7 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i7);
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
        if (i7 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i7);
        }
        sb4.append(valueOf2);
        String sb5 = sb4.toString();
        if (this.J) {
            i11 = 0;
        }
        int i13 = k10.getInt(sb5, i11);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i7 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i7);
        }
        sb6.append(valueOf3);
        String sb7 = sb6.toString();
        if (this.J) {
            j3 = 0;
        } else {
            j3 = -1;
        }
        long b12 = g0.b1(k10, sb7, j3);
        StringBuilder sb8 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i7 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i7);
        }
        sb8.append(valueOf4);
        String sb9 = sb8.toString();
        if (this.J) {
            j10 = 0;
        } else {
            j10 = -1;
        }
        long b13 = g0.b1(k10, sb9, j10);
        StringBuilder sb10 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i7 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i7);
        }
        sb10.append(valueOf5);
        String sb11 = sb10.toString();
        if (this.J) {
            j11 = 0;
        } else {
            j11 = -1;
        }
        long b14 = g0.b1(k10, sb11, j11);
        StringBuilder sb12 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i7 != 0) {
            obj = Integer.valueOf(i7);
        }
        sb12.append(obj);
        String sb13 = sb12.toString();
        if (this.J) {
            j12 = 0;
        } else {
            j12 = -1;
        }
        return new long[]{i12, i13, b12, b13, b14, k10.getLong(sb13, j12)};
    }

    public final int h() {
        return this.f24957q0;
    }

    public final int j() {
        int i7;
        synchronized (this.f24936a) {
            i7 = this.f24943e;
            this.f24943e = i7 - 1;
        }
        return i7;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return t0.f26600b.getSharedPreferences("userconfing", 0);
        }
        Context context = t0.f26600b;
        return context.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public final LongSparseArray m(int i7) {
        if (i7 == 1) {
            if (this.f24954n0 == null) {
                Context context = t0.f26600b;
                this.f24954n0 = b6.l(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24954n0;
        } else if (i7 == 2) {
            if (this.f24956p0 == null) {
                Context context2 = t0.f26600b;
                this.f24956p0 = b6.l(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24956p0;
        } else if (i7 == 4) {
            if (this.f24955o0 == null) {
                Context context3 = t0.f26600b;
                this.f24955o0 = b6.l(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24955o0;
        } else {
            return null;
        }
    }

    public final int n(int i7) {
        Object valueOf;
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i7 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        return k10.getInt(sb2.toString(), 0);
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f24936a) {
            if (this.f24940c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean q() {
        TLRPC.User user = this.f24940c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.m10.s():void");
    }

    public final void t() {
        if (!this.f24959r0 && System.currentTimeMillis() - this.f24961s0 >= 60000) {
            this.f24959r0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new s1(this, 8));
        }
    }

    public final void u() {
        this.m0 = 0L;
        if (this.f24951k0 != null) {
            Arrays.fill(this.f24951k0, (byte) 0);
            this.f24951k0 = null;
        }
        if (this.f24952l0 != null) {
            Arrays.fill(this.f24952l0, (byte) 0);
            this.f24952l0 = null;
        }
    }

    public final void v(boolean z10) {
        ns.f(this.currentAccount).d(new l10(0, this, z10));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.f24936a) {
            TLRPC.User user2 = this.f24940c;
            this.f24940c = user;
            this.f24953n = user.f28200id;
            a(user2, user);
        }
    }

    public final void x(int i7, int i10, int i11, long j3, long j10, long j11, long j12) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i7 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i10);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i7 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i7);
        }
        sb3.append(valueOf2);
        edit.putInt(sb3.toString(), i11);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i7 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i7);
        }
        sb4.append(valueOf3);
        edit.putLong(sb4.toString(), j3);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i7 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i7);
        }
        sb5.append(valueOf4);
        edit.putLong(sb5.toString(), j10);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i7 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i7);
        }
        sb6.append(valueOf5);
        edit.putLong(sb6.toString(), j11);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i7 != 0) {
            obj = Integer.valueOf(i7);
        }
        sb7.append(obj);
        edit.putLong(sb7.toString(), j12);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public final void y(int i7, boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("2pinnedDialogsLoaded" + i7, z10).commit();
    }

    public final void z(int i7, int i10) {
        Object valueOf;
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i7 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i10).commit();
    }
}
