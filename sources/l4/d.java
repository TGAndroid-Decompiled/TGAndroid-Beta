package l4;

import android.util.SparseArray;
import h3.t0;
import m3.n;
import m3.t;
import m3.w;

public final class d implements m3.m {

    public static final n f15409s = new n();

    public final m3.k f15410a;

    public final int f15411b;

    public final t0 f15412c;
    public final SparseArray d = new SparseArray();

    public boolean f15413e;

    public g5.b f15414f;
    public long h;

    public t f15415n;

    public t0[] f15416r;

    public d(m3.k kVar, int i10, t0 t0Var) {
        this.f15410a = kVar;
        this.f15411b = i10;
        this.f15412c = t0Var;
    }

    @Override
    public final void A() {
        SparseArray sparseArray = this.d;
        t0[] t0VarArr = new t0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            t0 t0Var = ((c) sparseArray.valueAt(i10)).d;
            d5.a.j(t0Var);
            t0VarArr[i10] = t0Var;
        }
        this.f15416r = t0VarArr;
    }

    @Override
    public final w C(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            d5.a.i(this.f15416r == null);
            cVar = new c(i10, i11, i11 == this.f15411b ? this.f15412c : null);
            g5.b bVar = this.f15414f;
            long j10 = this.h;
            if (bVar == null) {
                cVar.f15407e = cVar.f15406c;
            } else {
                cVar.f15408f = j10;
                w wVarU = bVar.u(i11);
                cVar.f15407e = wVarU;
                t0 t0Var = cVar.d;
                if (t0Var != null) {
                    wVarU.c(t0Var);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(g5.b bVar, long j10, long j11) {
        this.f15414f = bVar;
        this.h = j11;
        boolean z10 = this.f15413e;
        m3.k kVar = this.f15410a;
        if (!z10) {
            kVar.c(this);
            if (j10 != -9223372036854775807L) {
                kVar.g(0L, j10);
            }
            this.f15413e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.g(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (bVar == null) {
                cVar.f15407e = cVar.f15406c;
            } else {
                cVar.f15408f = j11;
                w wVarU = bVar.u(cVar.f15404a);
                cVar.f15407e = wVarU;
                t0 t0Var = cVar.d;
                if (t0Var != null) {
                    wVarU.c(t0Var);
                }
            }
            i10++;
        }
    }

    @Override
    public final void n(t tVar) {
        this.f15415n = tVar;
    }
}
