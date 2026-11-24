package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
public final class zd3 extends c0c {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public zd3(ae3 ae3Var) {
        d(ae3Var);
        this.J = ae3Var.w0;
        this.K = ae3Var.x0;
        this.L = ae3Var.y0;
        this.M = ae3Var.z0;
        this.N = ae3Var.A0;
        this.O = ae3Var.B0;
        this.P = ae3Var.C0;
        SparseArray sparseArray = ae3Var.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = ae3Var.E0.clone();
    }

    @Override
    public final void a(a0c a0cVar) {
        this.H.put(a0cVar.a, a0cVar);
    }

    @Override
    public final d0c b() {
        return new ae3(this);
    }

    @Override
    public final c0c c() {
        super.c();
        return this;
    }

    public zd3() {
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
