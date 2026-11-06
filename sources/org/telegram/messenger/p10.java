package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p10 extends c1 {
    public static int f24459s0;
    public static volatile p10[] f24460t0 = new p10[4];
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
    public final Object f24461a;
    public long f24462a0;
    public volatile boolean f24463b;
    public String f24464b0;
    public TLRPC.User f24465c;
    public String f24466c0;
    public boolean d;
    public String f24467d0;
    public int f24468e;
    public String f24469e0;
    public int f24470f;
    public long f24471f0;
    public long f24472g0;
    public int h;
    public long f24473h0;
    public long f24474i0;
    public volatile byte[] f24475j0;
    public volatile byte[] f24476k0;
    public volatile long f24477l0;
    public LongSparseArray m0;
    public long f24478n;
    public LongSparseArray f24479n0;
    public LongSparseArray f24480o0;
    public int f24481p0;
    public boolean f24482q0;
    public int f24483r;
    public long f24484r0;
    public int f24485s;
    public boolean f24486w;
    public boolean f24487x;
    public TL_account.tmpPassword f24488y;

    public p10(int i7) {
        super(i7);
        this.f24461a = new Object();
        this.f24468e = -210000;
        this.f24470f = -1;
        this.f24487x = true;
        this.J = -1;
        this.K = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.U = true;
        this.V = true;
        this.f24481p0 = 0;
        this.f24482q0 = false;
    }

    public static int c() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).f21723a).p()) {
                i7++;
            }
        }
        return i7;
    }

    public static p10 i(int i7) {
        p10 p10Var;
        p10 p10Var2 = f24460t0[i7];
        if (p10Var2 == null) {
            synchronized (p10.class) {
                try {
                    p10Var = f24460t0[i7];
                    if (p10Var == null) {
                        p10[] p10VarArr = f24460t0;
                        p10 p10Var3 = new p10(i7);
                        p10VarArr[i7] = p10Var3;
                        p10Var = p10Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return p10Var;
        }
        return p10Var2;
    }

    public static int l() {
        int i7;
        for (int i10 = -1; i10 < 4; i10++) {
            if (i10 < 0) {
                i7 = f24459s0;
            } else {
                i7 = i10;
            }
            if (i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                return i7;
            }
        }
        return f24459s0;
    }

    public static boolean o() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (i(c.a(i7).f21723a).p() && i(c.a(i7).f21723a).getUserConfig().q()) {
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
            this.m0 = longSparseArray;
            Context context = t0.f25555b;
            b6.l(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0), this.m0);
        } else if (i7 == 2) {
            this.f24480o0 = longSparseArray;
            Context context2 = t0.f25555b;
            b6.l(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0), this.f24480o0);
        } else if (i7 == 4) {
            this.f24479n0 = longSparseArray;
            Context context3 = t0.f25555b;
            b6.l(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0), this.f24479n0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            g0.h3(new Runnable(this) {
                public final p10 f24111b;

                {
                    this.f24111b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            p10 p10Var = this.f24111b;
                            p10Var.getMessagesController().m5(user2.premium);
                            qs.f(p10Var.currentAccount).k(308, new Object[0]);
                            qs.e().k(310, new Object[0]);
                            p10Var.getMediaDataController().R0(false);
                            p10Var.getMediaDataController().S0(false, null);
                            di.y6 P1 = p10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            return;
                        default:
                            p10 p10Var2 = this.f24111b;
                            p10Var2.getMessagesController().m5(user2.premium);
                            qs.f(p10Var2.currentAccount).k(308, new Object[0]);
                            p10Var2.getMediaDataController().R0(true);
                            return;
                    }
                }
            });
        } else if (user == null) {
            g0.h3(new Runnable(this) {
                public final p10 f24111b;

                {
                    this.f24111b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            p10 p10Var = this.f24111b;
                            p10Var.getMessagesController().m5(user2.premium);
                            qs.f(p10Var.currentAccount).k(308, new Object[0]);
                            qs.e().k(310, new Object[0]);
                            p10Var.getMediaDataController().R0(false);
                            p10Var.getMediaDataController().S0(false, null);
                            di.y6 P1 = p10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            return;
                        default:
                            p10 p10Var2 = this.f24111b;
                            p10Var2.getMessagesController().m5(user2.premium);
                            qs.f(p10Var2.currentAccount).k(308, new Object[0]);
                            p10Var2.getMediaDataController().R0(true);
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
        this.f24465c = null;
        this.f24478n = 0L;
        this.d = false;
        this.h = 0;
        this.f24468e = -210000;
        this.f24470f = -1;
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
        this.f24486w = false;
        this.H = true;
        this.U = true;
        this.W = false;
        this.V = true;
        this.f24487x = true;
        this.I = true;
        this.Z = null;
        this.P = false;
        this.X = false;
        this.Y = (int) (System.currentTimeMillis() / 1000);
        this.f24483r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.f24485s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i7 = 0;
        while (true) {
            if (i7 < 4) {
                if (i(c.a(i7).f21723a).p()) {
                    break;
                }
                i7++;
            } else {
                iz.f23426z = false;
                iz.f23420x = false;
                iz.f23403r = 0;
                iz.f23409t = 0L;
                iz.f23412u = 0L;
                iz.v = 0;
                iz.f23406s = "";
                iz.f23417w = new byte[0];
                iz.f23423y = 3600;
                iz.B = 0;
                iz.D = true;
                iz.f23375g0 = true;
                iz.C = false;
                iz.A = false;
                iz.J = 0;
                iz.K = 0;
                iz.L = 0L;
                iz.M = 0;
                iz.N = 0L;
                iz.O = 0;
                iz.P = false;
                iz.Q = false;
                iz.f23365c1 = 3;
                iz.f23367d1 = 3;
                iz.f23370e1 = 3;
                iz.f23369e0 = 2;
                iz.S = 0;
                iz.y();
                break;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.f24461a) {
            try {
                TLRPC.User user = this.f24465c;
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
        synchronized (this.f24461a) {
            try {
                TLRPC.User user = this.f24465c;
                if (user != null) {
                    j3 = user.f27101id;
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
        synchronized (this.f24461a) {
            user = this.f24465c;
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
        if (this.I) {
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
        if (this.I) {
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
        if (this.I) {
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
        if (this.I) {
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
        if (this.I) {
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
        if (this.I) {
            j12 = 0;
        } else {
            j12 = -1;
        }
        return new long[]{i12, i13, b12, b13, b14, k10.getLong(sb13, j12)};
    }

    public final int h() {
        return this.f24481p0;
    }

    public final int j() {
        int i7;
        synchronized (this.f24461a) {
            i7 = this.f24468e;
            this.f24468e = i7 - 1;
        }
        return i7;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return t0.f25555b.getSharedPreferences("userconfing", 0);
        }
        Context context = t0.f25555b;
        return context.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public final LongSparseArray m(int i7) {
        if (i7 == 1) {
            if (this.m0 == null) {
                Context context = t0.f25555b;
                this.m0 = b6.j(context.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.m0;
        } else if (i7 == 2) {
            if (this.f24480o0 == null) {
                Context context2 = t0.f25555b;
                this.f24480o0 = b6.j(context2.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24480o0;
        } else if (i7 == 4) {
            if (this.f24479n0 == null) {
                Context context3 = t0.f25555b;
                this.f24479n0 = b6.j(context3.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.f24479n0;
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
        boolean z9;
        synchronized (this.f24461a) {
            if (this.f24465c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final boolean q() {
        TLRPC.User user = this.f24465c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.p10.s():void");
    }

    public final void t() {
        if (!this.f24482q0 && System.currentTimeMillis() - this.f24484r0 >= 60000) {
            this.f24482q0 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new s1(this, 8));
        }
    }

    public final void u() {
        this.f24477l0 = 0L;
        if (this.f24475j0 != null) {
            Arrays.fill(this.f24475j0, (byte) 0);
            this.f24475j0 = null;
        }
        if (this.f24476k0 != null) {
            Arrays.fill(this.f24476k0, (byte) 0);
            this.f24476k0 = null;
        }
    }

    public final void v(boolean z9) {
        qs.f(this.currentAccount).d(new o10(0, this, z9));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.f24461a) {
            TLRPC.User user2 = this.f24465c;
            this.f24465c = user;
            this.f24478n = user.f27101id;
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

    public final void y(int i7, boolean z9) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("2pinnedDialogsLoaded" + i7, z9).commit();
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
