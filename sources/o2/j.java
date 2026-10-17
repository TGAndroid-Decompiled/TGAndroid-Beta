package o2;

import android.net.Uri;
import b2.w;
import e2.k0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import j4.d0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import v7.k7;
import v7.s6;
import v7.u6;
public final class j extends v2.l {
    public static final AtomicInteger f17596c0 = new AtomicInteger();
    public final int E;
    public final g2.h F;
    public final g2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final k0 K;
    public final c L;
    public final List M;
    public final b2.s N;
    public final q3.h O;
    public final x P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public n0 Y;
    public boolean Z;
    public long f17597a0;
    public boolean f17598b0;
    public final int v;
    public final int f17599w;
    public final Uri f17600x;
    public final boolean f17601y;

    public j(c cVar, g2.h hVar, g2.m mVar, w wVar, boolean z10, g2.h hVar2, g2.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, k0 k0Var, b2.s sVar, b bVar, q3.h hVar3, x xVar, boolean z15, boolean z16, j2.k kVar) {
        super(hVar, mVar, wVar, i10, obj, j10, j11, j12);
        long j13;
        boolean z17;
        this.Q = z10;
        this.E = i11;
        if (z12) {
            j13 = j11 - j10;
        } else {
            j13 = -9223372036854775807L;
        }
        this.f17597a0 = j13;
        this.f17599w = i12;
        this.G = mVar2;
        this.F = hVar2;
        if (mVar2 != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.V = z17;
        this.R = z11;
        this.f17600x = uri;
        this.I = z14;
        this.K = k0Var;
        this.J = z13;
        this.L = cVar;
        this.M = list;
        this.N = sVar;
        this.H = bVar;
        this.O = hVar3;
        this.P = xVar;
        this.f17598b0 = z15;
        this.f17601y = z16;
        l0 l0Var = n0.f8476b;
        this.Y = x1.e;
        this.v = f17596c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (s6.c(str).startsWith("0x")) {
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
    public final void O() {
        this.W = true;
    }

    @Override
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            c3.o b10 = bVar.f17567a.b();
            if ((b10 instanceof d0) || (b10 instanceof w3.h)) {
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
                d(this.f47911r, this.f47907b, this.Q);
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
        long j10;
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
                h.i(this.U, false);
            }
            do {
                try {
                    if (this.W) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.d.f4119f & 16384) != 0) {
                        this.S.f17567a.d(0L, 0L);
                        j10 = h.d;
                    } else {
                        throw e;
                    }
                }
            } while (this.S.f17567a.f(h, b.f17566f) == 0);
            j10 = h.d;
            this.U = (int) (j10 - mVar.e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k7.a(hVar);
            throw th2;
        }
        k7.a(hVar);
    }

    public final int f(int i10) {
        u6.p(!this.f17598b0);
        if (i10 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i10)).intValue();
    }

    public final boolean g() {
        if (this.f17597a0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final c3.l h(g2.h r34, g2.m r35) {
        throw new UnsupportedOperationException("Method not decompiled: o2.j.h(g2.h, g2.m):c3.l");
    }
}
