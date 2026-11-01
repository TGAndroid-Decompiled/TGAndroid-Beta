package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e20 extends f1 {
    public static int f15506s0;
    public static volatile e20[] f15507t0 = new e20[4];
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
    public final Object f15508a;
    public long f15509a0;
    public volatile boolean f15510b;
    public String f15511b0;
    public TLRPC.User f15512c;
    public String f15513c0;
    public boolean d;
    public String f15514d0;
    public int e;
    public String f15515e0;
    public int f15516f;
    public long f15517f0;
    public long f15518g0;
    public int h;
    public long f15519h0;
    public long f15520i0;
    public volatile byte[] f15521j0;
    public volatile byte[] f15522k0;
    public volatile long f15523l0;
    public LongSparseArray m0;
    public long f15524n;
    public LongSparseArray f15525n0;
    public LongSparseArray f15526o0;
    public int f15527p0;
    public boolean f15528q0;
    public int f15529r;
    public long f15530r0;
    public int f15531s;
    public boolean f15532w;
    public boolean f15533x;
    public TL_account.tmpPassword f15534y;

    public e20(int i10) {
        super(i10);
        this.f15508a = new Object();
        this.e = -210000;
        this.f15516f = -1;
        this.f15533x = true;
        this.J = -1;
        this.K = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.U = true;
        this.V = true;
        this.f15527p0 = 0;
        this.f15528q0 = false;
    }

    public static int c() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (i(c.a(i11).f15043a).p()) {
                i10++;
            }
        }
        return i10;
    }

    public static e20 i(int i10) {
        e20 e20Var;
        e20 e20Var2 = f15507t0[i10];
        if (e20Var2 == null) {
            synchronized (e20.class) {
                try {
                    e20Var = f15507t0[i10];
                    if (e20Var == null) {
                        e20[] e20VarArr = f15507t0;
                        e20 e20Var3 = new e20(i10);
                        e20VarArr[i10] = e20Var3;
                        e20Var = e20Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return e20Var;
        }
        return e20Var2;
    }

    public static int l() {
        int i10;
        for (int i11 = -1; i11 < 4; i11++) {
            if (i11 < 0) {
                i10 = f15506s0;
            } else {
                i10 = i11;
            }
            if (i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                return i10;
            }
        }
        return f15506s0;
    }

    public static boolean o() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).f15043a).p() && i(c.a(i10).f15043a).getUserConfig().q()) {
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
            Context context = w0.f18945b;
            ks.m(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0), this.m0);
        } else if (i10 == 2) {
            this.f15526o0 = longSparseArray;
            Context context2 = w0.f18945b;
            ks.m(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0), this.f15526o0);
        } else if (i10 == 4) {
            this.f15525n0 = longSparseArray;
            Context context3 = w0.f18945b;
            ks.m(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0), this.f15525n0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            i0.g3(new Runnable(this) {
                public final e20 f15056b;

                {
                    this.f15056b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e20 e20Var = this.f15056b;
                            e20Var.getMessagesController().j5(user2.premium);
                            at.f(e20Var.currentAccount).k(308, new Object[0]);
                            at.e().k(310, new Object[0]);
                            e20Var.getMediaDataController().R0(false);
                            e20Var.getMediaDataController().S0(false, null);
                            th.e5 O1 = e20Var.getMessagesController().O1();
                            O1.R = false;
                            O1.S = null;
                            return;
                        default:
                            e20 e20Var2 = this.f15056b;
                            e20Var2.getMessagesController().j5(user2.premium);
                            at.f(e20Var2.currentAccount).k(308, new Object[0]);
                            e20Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            i0.g3(new Runnable(this) {
                public final e20 f15056b;

                {
                    this.f15056b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e20 e20Var = this.f15056b;
                            e20Var.getMessagesController().j5(user2.premium);
                            at.f(e20Var.currentAccount).k(308, new Object[0]);
                            at.e().k(310, new Object[0]);
                            e20Var.getMediaDataController().R0(false);
                            e20Var.getMediaDataController().S0(false, null);
                            th.e5 O1 = e20Var.getMessagesController().O1();
                            O1.R = false;
                            O1.S = null;
                            return;
                        default:
                            e20 e20Var2 = this.f15056b;
                            e20Var2.getMessagesController().j5(user2.premium);
                            at.f(e20Var2.currentAccount).k(308, new Object[0]);
                            e20Var2.getMediaDataController().R0(true);
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
        this.f15512c = null;
        this.f15524n = 0L;
        this.d = false;
        this.h = 0;
        this.e = -210000;
        this.f15516f = -1;
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
        this.f15532w = false;
        this.H = true;
        this.U = true;
        this.W = false;
        this.V = true;
        this.f15533x = true;
        this.I = true;
        this.Z = null;
        this.P = false;
        this.X = false;
        this.Y = (int) (System.currentTimeMillis() / 1000);
        this.f15529r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.f15531s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                if (i(c.a(i10).f15043a).p()) {
                    break;
                }
                i10++;
            } else {
                uz.f18569z = false;
                uz.f18563x = false;
                uz.f18546r = 0;
                uz.f18552t = 0L;
                uz.f18555u = 0L;
                uz.v = 0;
                uz.f18549s = "";
                uz.f18560w = new byte[0];
                uz.f18566y = 3600;
                uz.B = 0;
                uz.D = true;
                uz.f18517g0 = true;
                uz.C = false;
                uz.A = false;
                uz.J = 0;
                uz.K = 0;
                uz.L = 0L;
                uz.M = 0;
                uz.N = 0L;
                uz.O = 0;
                uz.P = false;
                uz.Q = false;
                uz.f18508c1 = 3;
                uz.f18510d1 = 3;
                uz.f18512e1 = 3;
                uz.f18511e0 = 2;
                uz.S = 0;
                uz.y();
                break;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.f15508a) {
            try {
                TLRPC.User user = this.f15512c;
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
        synchronized (this.f15508a) {
            try {
                TLRPC.User user = this.f15512c;
                if (user != null) {
                    j10 = user.f19943id;
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
        synchronized (this.f15508a) {
            user = this.f15512c;
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
        return this.f15527p0;
    }

    public final int j() {
        int i10;
        synchronized (this.f15508a) {
            i10 = this.e;
            this.e = i10 - 1;
        }
        return i10;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return w0.f18945b.getSharedPreferences("userconfing", 0);
        }
        Context context = w0.f18945b;
        return context.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public final LongSparseArray m(int i10) {
        if (i10 == 1) {
            if (this.m0 == null) {
                Context context = w0.f18945b;
                this.m0 = ks.j(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.m0;
        } else if (i10 == 2) {
            if (this.f15526o0 == null) {
                Context context2 = w0.f18945b;
                this.f15526o0 = ks.j(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f15526o0;
        } else if (i10 == 4) {
            if (this.f15525n0 == null) {
                Context context3 = w0.f18945b;
                this.f15525n0 = ks.j(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f15525n0;
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
        synchronized (this.f15508a) {
            if (this.f15512c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean q() {
        TLRPC.User user = this.f15512c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e20.s():void");
    }

    public final void t() {
        if (!this.f15528q0 && System.currentTimeMillis() - this.f15530r0 >= 60000) {
            this.f15528q0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new v1(this, 8));
        }
    }

    public final void u() {
        this.f15523l0 = 0L;
        if (this.f15521j0 != null) {
            Arrays.fill(this.f15521j0, (byte) 0);
            this.f15521j0 = null;
        }
        if (this.f15522k0 != null) {
            Arrays.fill(this.f15522k0, (byte) 0);
            this.f15522k0 = null;
        }
    }

    public final void v(boolean z10) {
        at.f(this.currentAccount).d(new d20(0, this, z10));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.f15508a) {
            TLRPC.User user2 = this.f15512c;
            this.f15512c = user;
            this.f15524n = user.f19943id;
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
