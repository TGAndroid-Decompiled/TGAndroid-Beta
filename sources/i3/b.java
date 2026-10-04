package i3;

import b2.g;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class b implements o {
    public final v f11896a = new v(4);
    public final v f11897b = new v(9);
    public final v f11898c = new v(11);
    public final v d = new v();
    public final c f11899e;
    public q f11900f;
    public int f11901g;
    public boolean h;
    public long f11902i;
    public int f11903j;
    public int f11904k;
    public int f11905l;
    public long f11906m;
    public boolean f11907n;
    public a f11908o;
    public e f11909p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f11910b = -9223372036854775807L;
        gVar.f11911c = new long[0];
        gVar.d = new long[0];
        this.f11899e = gVar;
        this.f11901g = 1;
    }

    public final v a(p pVar) {
        int i10 = this.f11905l;
        v vVar = this.d;
        byte[] bArr = vVar.f8590a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f11905l);
        pVar.readFully(vVar.f8590a, 0, this.f11905l);
        return vVar;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f11896a;
        l lVar = (l) pVar;
        lVar.f(vVar.f8590a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.f(vVar.f8590a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.f(vVar.f8590a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f4093f = 0;
                lVar.s(j3, false);
                lVar.f(vVar.f8590a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f11900f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f11901g = 1;
            this.h = false;
        } else {
            this.f11901g = 3;
        }
        this.f11903j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8758b;
        return a1.f8721e;
    }

    @Override
    public final int m(c3.p r29, c3.s r30) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
