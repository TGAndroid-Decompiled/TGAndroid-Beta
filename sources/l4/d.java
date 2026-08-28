package l4;

import android.util.SparseArray;
import h3.t0;
import m3.n;
import m3.t;
import m3.w;
public final class d implements m3.m {
    public static final n f16652s = new Object();
    public final m3.k f16653a;
    public final int f16654b;
    public final t0 f16655c;
    public final SparseArray d = new SparseArray();
    public boolean f16656e;
    public g5.b f16657f;
    public long h;
    public t f16658n;
    public t0[] f16659r;

    public d(m3.k kVar, int i9, t0 t0Var) {
        this.f16653a = kVar;
        this.f16654b = i9;
        this.f16655c = t0Var;
    }

    @Override
    public final void B() {
        SparseArray sparseArray = this.d;
        t0[] t0VarArr = new t0[sparseArray.size()];
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            t0 t0Var = ((c) sparseArray.valueAt(i9)).d;
            d5.a.j(t0Var);
            t0VarArr[i9] = t0Var;
        }
        this.f16659r = t0VarArr;
    }

    @Override
    public final w I(int i9, int i10) {
        boolean z10;
        t0 t0Var;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i9);
        if (cVar == null) {
            if (this.f16659r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5.a.i(z10);
            if (i10 == this.f16654b) {
                t0Var = this.f16655c;
            } else {
                t0Var = null;
            }
            cVar = new c(i9, i10, t0Var);
            g5.b bVar = this.f16657f;
            long j10 = this.h;
            if (bVar == null) {
                cVar.f16650e = cVar.f16649c;
            } else {
                cVar.f16651f = j10;
                w u10 = bVar.u(i10);
                cVar.f16650e = u10;
                t0 t0Var2 = cVar.d;
                if (t0Var2 != null) {
                    u10.c(t0Var2);
                }
            }
            sparseArray.put(i9, cVar);
        }
        return cVar;
    }

    public final void a(g5.b bVar, long j10, long j11) {
        this.f16657f = bVar;
        this.h = j11;
        boolean z10 = this.f16656e;
        m3.k kVar = this.f16653a;
        if (!z10) {
            kVar.c(this);
            if (j10 != -9223372036854775807L) {
                kVar.g(0L, j10);
            }
            this.f16656e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.g(0L, j10);
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i9 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i9);
                if (bVar == null) {
                    cVar.f16650e = cVar.f16649c;
                } else {
                    cVar.f16651f = j11;
                    w u10 = bVar.u(cVar.f16647a);
                    cVar.f16650e = u10;
                    t0 t0Var = cVar.d;
                    if (t0Var != null) {
                        u10.c(t0Var);
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void y(t tVar) {
        this.f16658n = tVar;
    }
}
