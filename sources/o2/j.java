package o2;

import android.net.Uri;
import e2.b0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import j4.d0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import v7.k7;
import v7.r6;
public final class j extends v2.k {
    public static final AtomicInteger f16986c0 = new AtomicInteger();
    public final int E;
    public final g2.h F;
    public final g2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final b0 K;
    public final c L;
    public final List M;
    public final b2.o N;
    public final q3.i O;
    public final v P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public i0 Y;
    public boolean Z;
    public long f16987a0;
    public boolean f16988b0;
    public final int v;
    public final int f16989w;
    public final Uri f16990x;
    public final boolean f16991y;

    public j(c cVar, g2.h hVar, g2.m mVar, b2.s sVar, boolean z10, g2.h hVar2, g2.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j3, long j10, long j11, int i11, boolean z12, int i12, boolean z13, boolean z14, b0 b0Var, b2.o oVar, b bVar, q3.i iVar, v vVar, boolean z15, boolean z16, j2.k kVar) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j11);
        long j12;
        boolean z17;
        this.Q = z10;
        this.E = i11;
        if (z12) {
            j12 = j10 - j3;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f16987a0 = j12;
        this.f16989w = i12;
        this.G = mVar2;
        this.F = hVar2;
        if (mVar2 != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.V = z17;
        this.R = z11;
        this.f16990x = uri;
        this.I = z14;
        this.K = b0Var;
        this.J = z13;
        this.L = cVar;
        this.M = list;
        this.N = oVar;
        this.H = bVar;
        this.O = iVar;
        this.P = vVar;
        this.f16988b0 = z15;
        this.f16991y = z16;
        g0 g0Var = i0.f8752b;
        this.Y = a1.f8715e;
        this.v = f16986c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (r6.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    @Override
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            c3.o c10 = bVar.f16955a.c();
            if ((c10 instanceof d0) || (c10 instanceof w3.j)) {
                this.S = this.H;
                this.V = false;
            }
        }
        g2.m mVar = this.G;
        g2.h hVar = this.F;
        if (this.V) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.R);
            this.U = 0;
            this.V = false;
        }
        if (!this.W) {
            if (!this.J) {
                d(this.f49100r, this.f49095b, this.Q);
            }
            this.X = !this.W;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(g2.h hVar, g2.m mVar, boolean z10) {
        g2.m b10;
        boolean z11;
        long j3;
        boolean z12;
        if (z10) {
            if (this.U != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 = z12;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.U);
            z11 = false;
        }
        try {
            c3.l h = h(hVar, b10);
            if (z11) {
                h.g(this.U, false);
            }
            do {
                try {
                    if (this.W) {
                        break;
                    }
                } catch (EOFException e7) {
                    if ((this.d.f3632f & 16384) != 0) {
                        this.S.f16955a.h(0L, 0L);
                        j3 = h.d;
                    } else {
                        throw e7;
                    }
                }
            } while (this.S.f16955a.m(h, b.f16954f) == 0);
            j3 = h.d;
            this.U = (int) (j3 - mVar.f10270e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k7.a(hVar);
            throw th2;
        }
        k7.a(hVar);
    }

    public final int f(int i10) {
        e2.d.g(!this.f16988b0);
        if (i10 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i10)).intValue();
    }

    public final boolean g() {
        if (this.f16987a0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final c3.l h(g2.h r35, g2.m r36) {
        throw new UnsupportedOperationException("Method not decompiled: o2.j.h(g2.h, g2.m):c3.l");
    }

    @Override
    public final void v() {
        this.W = true;
    }
}
