package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k10 extends c1 {
    public static int f24968t0;
    public static volatile k10[] f24969u0 = new k10[4];
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
    public final Object f24970a;
    public TLRPC.TL_help_termsOfService f24971a0;
    public volatile boolean f24972b;
    public long f24973b0;
    public TLRPC.User f24974c;
    public String f24975c0;
    public boolean d;
    public String f24976d0;
    public int f24977e;
    public String f24978e0;
    public int f24979f;
    public String f24980f0;
    public long f24981g0;
    public int h;
    public long f24982h0;
    public long f24983i0;
    public long f24984j0;
    public volatile byte[] f24985k0;
    public volatile byte[] f24986l0;
    public volatile long m0;
    public long f24987n;
    public LongSparseArray f24988n0;
    public LongSparseArray f24989o0;
    public LongSparseArray f24990p0;
    public int f24991q0;
    public int f24992r;
    public boolean f24993r0;
    public int f24994s;
    public long f24995s0;
    public boolean f24996w;
    public boolean f24997x;
    public TL_account.tmpPassword f24998y;

    public k10(int i7) {
        super(i7);
        this.f24970a = new Object();
        this.f24977e = -210000;
        this.f24979f = -1;
        this.f24997x = true;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.V = true;
        this.W = true;
        this.f24991q0 = 0;
        this.f24993r0 = false;
    }

    public static int c() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).f23202a).p()) {
                i7++;
            }
        }
        return i7;
    }

    public static k10 i(int i7) {
        k10 k10Var;
        k10 k10Var2 = f24969u0[i7];
        if (k10Var2 == null) {
            synchronized (k10.class) {
                try {
                    k10Var = f24969u0[i7];
                    if (k10Var == null) {
                        k10[] k10VarArr = f24969u0;
                        k10 k10Var3 = new k10(i7);
                        k10VarArr[i7] = k10Var3;
                        k10Var = k10Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k10Var;
        }
        return k10Var2;
    }

    public static int l() {
        int i7;
        for (int i10 = -1; i10 < 4; i10++) {
            if (i10 < 0) {
                i7 = f24968t0;
            } else {
                i7 = i10;
            }
            if (i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                return i7;
            }
        }
        return f24968t0;
    }

    public static boolean o() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (i(c.a(i7).f23202a).p() && i(c.a(i7).f23202a).getUserConfig().q()) {
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
            this.f24988n0 = longSparseArray;
            c6.n(f3.e(new StringBuilder("users_save_gallery_exceptions_"), this.currentAccount, t0.f26931b, 0), this.f24988n0);
        } else if (i7 == 2) {
            this.f24990p0 = longSparseArray;
            c6.n(f3.e(new StringBuilder("groups_save_gallery_exceptions_"), this.currentAccount, t0.f26931b, 0), this.f24990p0);
        } else if (i7 == 4) {
            this.f24989o0 = longSparseArray;
            c6.n(f3.e(new StringBuilder("channels_save_gallery_exceptions_"), this.currentAccount, t0.f26931b, 0), this.f24989o0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            g0.g3(new Runnable(this) {
                public final k10 f24572b;

                {
                    this.f24572b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k10 k10Var = this.f24572b;
                            k10Var.getMessagesController().y5(user2.premium);
                            ls.f(k10Var.currentAccount).k(311, new Object[0]);
                            ls.e().k(313, new Object[0]);
                            k10Var.getMediaDataController().U0(false);
                            k10Var.getMediaDataController().V0(false, null);
                            fi.p6 R1 = k10Var.getMessagesController().R1();
                            R1.R = false;
                            R1.S = null;
                            return;
                        default:
                            k10 k10Var2 = this.f24572b;
                            k10Var2.getMessagesController().y5(user2.premium);
                            ls.f(k10Var2.currentAccount).k(311, new Object[0]);
                            k10Var2.getMediaDataController().U0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            g0.g3(new Runnable(this) {
                public final k10 f24572b;

                {
                    this.f24572b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k10 k10Var = this.f24572b;
                            k10Var.getMessagesController().y5(user2.premium);
                            ls.f(k10Var.currentAccount).k(311, new Object[0]);
                            ls.e().k(313, new Object[0]);
                            k10Var.getMediaDataController().U0(false);
                            k10Var.getMediaDataController().V0(false, null);
                            fi.p6 R1 = k10Var.getMessagesController().R1();
                            R1.R = false;
                            R1.S = null;
                            return;
                        default:
                            k10 k10Var2 = this.f24572b;
                            k10Var2.getMessagesController().y5(user2.premium);
                            ls.f(k10Var2.currentAccount).k(311, new Object[0]);
                            k10Var2.getMediaDataController().U0(true);
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
        this.f24974c = null;
        this.f24987n = 0L;
        this.d = false;
        this.h = 0;
        this.f24977e = -210000;
        this.f24979f = -1;
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
        this.f24996w = false;
        this.I = true;
        this.V = true;
        this.X = false;
        this.W = true;
        this.f24997x = true;
        this.J = true;
        this.f24971a0 = null;
        this.Q = false;
        this.Y = false;
        this.Z = (int) (System.currentTimeMillis() / 1000);
        this.f24992r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.f24994s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i7 = 0;
        while (true) {
            if (i7 < 4) {
                if (i(c.a(i7).f23202a).p()) {
                    break;
                }
                i7++;
            } else {
                cz.f23459z = false;
                cz.f23453x = false;
                cz.f23436r = 0;
                cz.f23442t = 0L;
                cz.f23445u = 0L;
                cz.v = 0;
                cz.f23439s = "";
                cz.f23450w = new byte[0];
                cz.f23456y = 3600;
                cz.B = 0;
                cz.D = true;
                cz.f23408g0 = true;
                cz.C = false;
                cz.A = false;
                cz.J = 0;
                cz.K = 0;
                cz.L = 0L;
                cz.M = 0;
                cz.N = 0L;
                cz.O = 0;
                cz.P = false;
                cz.Q = false;
                cz.f23398c1 = 3;
                cz.f23400d1 = 3;
                cz.f23403e1 = 3;
                cz.f23402e0 = 2;
                cz.S = 0;
                cz.y();
                break;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.f24970a) {
            try {
                TLRPC.User user = this.f24974c;
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
        synchronized (this.f24970a) {
            try {
                TLRPC.User user = this.f24974c;
                if (user != null) {
                    j3 = user.f28583id;
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
        synchronized (this.f24970a) {
            user = this.f24974c;
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
        return this.f24991q0;
    }

    public final int j() {
        int i7;
        synchronized (this.f24970a) {
            i7 = this.f24977e;
            this.f24977e = i7 - 1;
        }
        return i7;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return t0.f26931b.getSharedPreferences("userconfing", 0);
        }
        return f3.e(new StringBuilder("userconfig"), this.currentAccount, t0.f26931b, 0);
    }

    public final LongSparseArray m(int i7) {
        if (i7 == 1) {
            if (this.f24988n0 == null) {
                Context context = t0.f26931b;
                this.f24988n0 = c6.l(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24988n0;
        } else if (i7 == 2) {
            if (this.f24990p0 == null) {
                Context context2 = t0.f26931b;
                this.f24990p0 = c6.l(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24990p0;
        } else if (i7 == 4) {
            if (this.f24989o0 == null) {
                Context context3 = t0.f26931b;
                this.f24989o0 = c6.l(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24989o0;
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
        synchronized (this.f24970a) {
            if (this.f24974c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean q() {
        TLRPC.User user = this.f24974c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k10.s():void");
    }

    public final void t() {
        if (!this.f24993r0 && System.currentTimeMillis() - this.f24995s0 >= 60000) {
            this.f24993r0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new s1(this, 8));
        }
    }

    public final void u() {
        this.m0 = 0L;
        if (this.f24985k0 != null) {
            Arrays.fill(this.f24985k0, (byte) 0);
            this.f24985k0 = null;
        }
        if (this.f24986l0 != null) {
            Arrays.fill(this.f24986l0, (byte) 0);
            this.f24986l0 = null;
        }
    }

    public final void v(boolean z10) {
        ls.f(this.currentAccount).d(new j10(0, this, z10));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.f24970a) {
            TLRPC.User user2 = this.f24974c;
            this.f24974c = user;
            this.f24987n = user.f28583id;
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
