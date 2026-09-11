package e3;

import a3.k;
import c3.o;
import c3.p;
import c3.q;
import com.google.firebase.messaging.m;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class b implements o {
    public final v f8799a;
    public final k f8800b;
    public final boolean f8801c;
    public final rb.a d;
    public int f8802e;
    public q f8803f;
    public c f8804g;
    public long h;
    public e[] f8805i;
    public long f8806j;
    public e f8807k;
    public int f8808l;
    public long f8809m;
    public long f8810n;
    public int f8811o;
    public boolean f8812p;

    public b(int i10, rb.a aVar) {
        this.d = aVar;
        this.f8801c = (i10 & 1) == 0;
        this.f8799a = new v(12);
        this.f8800b = new Object();
        this.f8803f = new qb.b(5);
        this.f8805i = new e[0];
        this.f8809m = -1L;
        this.f8810n = -1L;
        this.f8808l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f8799a;
        pVar.b(0, 12, vVar.f8789a);
        vVar.J(0);
        if (vVar.l() == 1179011410) {
            vVar.K(4);
            if (vVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f8802e = 0;
        if (this.f8801c) {
            qVar = new m(qVar, this.d);
        }
        this.f8803f = qVar;
        this.f8806j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8806j = -1L;
        this.f8807k = null;
        for (e eVar : this.f8805i) {
            if (eVar.f8829k == 0) {
                eVar.f8827i = 0;
            } else {
                eVar.f8827i = eVar.f8832n[d0.e(eVar.f8831m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8805i.length == 0) {
                this.f8802e = 0;
                return;
            } else {
                this.f8802e = 3;
                return;
            }
        }
        this.f8802e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
    }

    @Override
    public final int m(c3.p r24, c3.s r25) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
