package h3;

import b2.t0;
import c3.a0;
import c3.l;
import c3.l0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c3.w;
import e2.x;
import e9.n0;
import e9.x1;
import java.util.List;
import q3.h;
public final class b implements q {
    public s e;
    public l0 f11682f;
    public t0 h;
    public w f11684i;
    public int f11685j;
    public int f11686k;
    public a f11687l;
    public int f11688m;
    public long f11689n;
    public final byte[] f11679a = new byte[42];
    public final x f11680b = new x(new byte[32768], 0);
    public final boolean f11681c = false;
    public final u d = new Object();
    public int f11683g = 0;

    @Override
    public final boolean a(r rVar) {
        t0 b10 = new a0(0).b(rVar, h.f44790b, 0);
        if (b10 != null) {
            int length = b10.f4014a.length;
        }
        x xVar = new x(4);
        ((l) rVar).j(xVar.f8298a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(s sVar) {
        this.e = sVar;
        this.f11682f = sVar.j0(0, 1);
        sVar.C();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f11683g = 0;
        } else {
            a aVar = this.f11687l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f11689n = j12;
        this.f11688m = 0;
        this.f11680b.K(0);
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r32, c3.u r33) {
        throw new UnsupportedOperationException("Method not decompiled: h3.b.f(c3.r, c3.u):int");
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
