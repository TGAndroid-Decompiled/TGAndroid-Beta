package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public final class sg5 extends dm6 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final a83 G;
    public final g83 H;
    public final p41 I;
    public final boolean J;
    public final boolean K;
    public final vqb L;
    public final bc3 M;
    public final List N;
    public final as3 O;
    public final sl5 P;
    public final yw7 Q;
    public final boolean R;
    public final boolean S;
    public p41 T;
    public sh5 U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public y79 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public sg5(bc3 bc3Var, a83 a83Var, g83 g83Var, go4 go4Var, boolean z, a83 a83Var2, g83 g83Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, vqb vqbVar, as3 as3Var, p41 p41Var, sl5 sl5Var, yw7 yw7Var, boolean z6, boolean z7, we8 we8Var, String str) {
        super(a83Var, g83Var, go4Var, i, obj, j, j2, j3, str);
        this.R = z;
        this.F = i2;
        this.b0 = z3 ? j2 - j : -9223372036854775807L;
        this.x = i3;
        this.H = g83Var2;
        this.G = a83Var2;
        this.W = g83Var2 != null;
        this.S = z2;
        this.y = uri;
        this.J = z5;
        this.L = vqbVar;
        this.K = z4;
        this.M = bc3Var;
        this.N = list;
        this.O = as3Var;
        this.I = p41Var;
        this.P = sl5Var;
        this.Q = yw7Var;
        this.c0 = z6;
        this.E = z7;
        ko5 ko5Var = mo5.b;
        this.Z = y79.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i;
        if (vod.c(str).startsWith("0x")) {
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
        p41 p41Var;
        this.U.getClass();
        if (this.T == null && (p41Var = this.I) != null) {
            s84 a = ((s84) p41Var.b).a();
            if ((a instanceof j4c) || (a instanceof er4)) {
                this.T = this.I;
                this.W = false;
            }
        }
        g83 g83Var = this.H;
        a83 a83Var = this.G;
        if (this.W) {
            a83Var.getClass();
            g83Var.getClass();
            d(a83Var, g83Var, this.S);
            this.V = 0;
            this.W = false;
        }
        if (!this.X) {
            if (!this.K) {
                d(this.r, this.b, this.R);
            }
            this.Y = !this.X;
        }
    }

    public final void d(a83 a83Var, g83 g83Var, boolean z) {
        g83 b;
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
            b = g83Var;
        } else {
            b = g83Var.b(i);
            z2 = false;
        }
        try {
            vb3 i2 = i(a83Var, b);
            if (z2) {
                i2.m(this.V, false);
            }
            do {
                try {
                    if (this.X) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & 16384) != 0) {
                        ((s84) this.T.b).d(0L, 0L);
                    } else {
                        long j = g83Var.f;
                        if (j != -1 && i2.d >= g83Var.e + j) {
                            throw bx7.a(null, e);
                        }
                        throw e;
                    }
                }
            } while (((s84) this.T.b).b(i2, p41.f) == 0);
            this.V = (int) (i2.d - g83Var.e);
        } catch (Exception unused) {
        } catch (Throwable th) {
            wde.a(a83Var);
            throw th;
        }
        wde.a(a83Var);
    }

    @Override
    public final void e() {
        this.X = true;
    }

    public final int g(int i) {
        jte.p(!this.c0);
        y79 y79Var = this.Z;
        if (i >= y79Var.d) {
            return 0;
        }
        return ((Integer) y79Var.get(i)).intValue();
    }

    public final boolean h() {
        if (this.b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final defpackage.vb3 i(defpackage.a83 r33, defpackage.g83 r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg5.i(a83, g83):vb3");
    }
}
