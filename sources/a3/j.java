package a3;

import e2.m1;
public final class j extends q implements Comparable {
    public final int f98e;
    public final int f99f;

    public j(int i7, m1 m1Var, int i10, n nVar, int i11) {
        super(i7, m1Var, i10);
        int i12;
        this.f98e = jg.g.c(i11, nVar.B0) ? 1 : 0;
        e2.u uVar = this.d;
        int i13 = uVar.f10626z;
        int i14 = -1;
        if (i13 != -1 && (i12 = uVar.A) != -1) {
            i14 = i13 * i12;
        }
        this.f99f = i14;
    }

    @Override
    public final int a() {
        return this.f98e;
    }

    @Override
    public final boolean b(q qVar) {
        j jVar = (j) qVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f99f, ((j) obj).f99f);
    }
}
