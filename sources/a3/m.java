package a3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import e2.n1;
import e2.p1;
import e2.q1;
import java.util.HashMap;
import java.util.Map;
public final class m extends p1 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public m(n nVar) {
        d(nVar);
        this.J = nVar.f103w0;
        this.K = nVar.f104x0;
        this.L = nVar.f105y0;
        this.M = nVar.f106z0;
        this.N = nVar.A0;
        this.O = nVar.B0;
        this.P = nVar.C0;
        SparseArray sparseArray = nVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            sparseArray2.put(sparseArray.keyAt(i7), new HashMap((Map) sparseArray.valueAt(i7)));
        }
        this.Q = sparseArray2;
        this.R = nVar.E0.clone();
    }

    @Override
    public final void a(n1 n1Var) {
        this.H.put(n1Var.f10406a, n1Var);
    }

    @Override
    public final q1 b() {
        return new n(this);
    }

    @Override
    public final p1 c() {
        super.c();
        return this;
    }

    public m() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}
