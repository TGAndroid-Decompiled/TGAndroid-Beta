package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public final class te5 extends ak6 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final o63 G;
    public final u63 H;
    public final h31 I;
    public final boolean J;
    public final boolean K;
    public final uob L;
    public final pa3 M;
    public final List N;
    public final qq3 O;
    public final tj5 P;
    public final xu7 Q;
    public final boolean R;
    public final boolean S;
    public h31 T;
    public tf5 U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public w59 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public te5(pa3 pa3Var, o63 o63Var, u63 u63Var, fm4 fm4Var, boolean z, o63 o63Var2, u63 u63Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, uob uobVar, qq3 qq3Var, h31 h31Var, tj5 tj5Var, xu7 xu7Var, boolean z6, boolean z7, uc8 uc8Var, String str) {
        super(o63Var, u63Var, fm4Var, i, obj, j, j2, j3, str);
        this.R = z;
        this.F = i2;
        this.b0 = z3 ? j2 - j : -9223372036854775807L;
        this.x = i3;
        this.H = u63Var2;
        this.G = o63Var2;
        this.W = u63Var2 != null;
        this.S = z2;
        this.y = uri;
        this.J = z5;
        this.L = uobVar;
        this.K = z4;
        this.M = pa3Var;
        this.N = list;
        this.O = qq3Var;
        this.I = h31Var;
        this.P = tj5Var;
        this.Q = xu7Var;
        this.c0 = z6;
        this.E = z7;
        km5 km5Var = mm5.b;
        this.Z = w59.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i;
        if (smd.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    @Override
    public final void a() {
        h31 h31Var;
        this.U.getClass();
        if (this.T == null && (h31Var = this.I) != null) {
            j74 a = ((j74) h31Var.b).a();
            if ((a instanceof j2c) || (a instanceof dp4)) {
                this.T = this.I;
                this.W = false;
            }
        }
        u63 u63Var = this.H;
        o63 o63Var = this.G;
        if (this.W) {
            o63Var.getClass();
            u63Var.getClass();
            e(o63Var, u63Var, this.S);
            this.V = 0;
            this.W = false;
        }
        if (!this.X) {
            if (!this.K) {
                e(this.r, this.b, this.R);
            }
            this.Y = !this.X;
        }
    }

    @Override
    public final void d() {
        this.X = true;
    }

    public final void e(o63 o63Var, u63 u63Var, boolean z) {
        u63 b;
        boolean z2;
        boolean z3;
        int i = this.V;
        if (z) {
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
            b = u63Var;
        } else {
            b = u63Var.b(i);
            z2 = false;
        }
        try {
            ja3 i2 = i(o63Var, b);
            if (z2) {
                i2.l(this.V, false);
            }
            do {
                try {
                    if (this.X) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & 16384) != 0) {
                        ((j74) this.T.b).d(0L, 0L);
                    } else {
                        long j = u63Var.f;
                        if (j != -1 && i2.d >= u63Var.e + j) {
                            throw av7.a(null, e);
                        }
                        throw e;
                    }
                }
            } while (((j74) this.T.b).b(i2, h31.f) == 0);
            this.V = (int) (i2.d - u63Var.e);
        } catch (Exception unused) {
        } catch (Throwable th) {
            vbe.a(o63Var);
            throw th;
        }
        vbe.a(o63Var);
    }

    public final int g(int i) {
        gre.p(!this.c0);
        w59 w59Var = this.Z;
        if (i >= w59Var.d) {
            return 0;
        }
        return ((Integer) w59Var.get(i)).intValue();
    }

    public final boolean h() {
        if (this.b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final defpackage.ja3 i(defpackage.o63 r33, defpackage.u63 r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te5.i(o63, u63):ja3");
    }
}
