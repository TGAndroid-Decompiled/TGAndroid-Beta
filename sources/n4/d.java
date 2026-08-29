package n4;

import android.util.SparseArray;
import j3.t0;
import o3.n;
import o3.t;
import o3.w;
public final class d implements o3.m {
    public static final n f17119s = new Object();
    public final o3.k f17120a;
    public final int f17121b;
    public final t0 f17122c;
    public final SparseArray d = new SparseArray();
    public boolean f17123e;
    public g9.l f17124f;
    public long h;
    public t f17125n;
    public t0[] f17126r;

    public d(o3.k kVar, int i10, t0 t0Var) {
        this.f17120a = kVar;
        this.f17121b = i10;
        this.f17122c = t0Var;
    }

    @Override
    public final void D1(t tVar) {
        this.f17125n = tVar;
    }

    @Override
    public final w Z1(int i10, int i11) {
        boolean z10;
        t0 t0Var;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f17126r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            f5.a.i(z10);
            if (i11 == this.f17121b) {
                t0Var = this.f17122c;
            } else {
                t0Var = null;
            }
            cVar = new c(i10, i11, t0Var);
            g9.l lVar = this.f17124f;
            long j10 = this.h;
            if (lVar == null) {
                cVar.f17117e = cVar.f17116c;
            } else {
                cVar.f17118f = j10;
                w q6 = lVar.q(i11);
                cVar.f17117e = q6;
                t0 t0Var2 = cVar.d;
                if (t0Var2 != null) {
                    q6.b(t0Var2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(g9.l lVar, long j10, long j11) {
        this.f17124f = lVar;
        this.h = j11;
        boolean z10 = this.f17123e;
        o3.k kVar = this.f17120a;
        if (!z10) {
            kVar.i(this);
            if (j10 != -9223372036854775807L) {
                kVar.f(0L, j10);
            }
            this.f17123e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.f(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (lVar == null) {
                    cVar.f17117e = cVar.f17116c;
                } else {
                    cVar.f17118f = j11;
                    w q6 = lVar.q(cVar.f17114a);
                    cVar.f17117e = q6;
                    t0 t0Var = cVar.d;
                    if (t0Var != null) {
                        q6.b(t0Var);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void e1() {
        SparseArray sparseArray = this.d;
        t0[] t0VarArr = new t0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            t0 t0Var = ((c) sparseArray.valueAt(i10)).d;
            f5.a.j(t0Var);
            t0VarArr[i10] = t0Var;
        }
        this.f17126r = t0VarArr;
    }
}
