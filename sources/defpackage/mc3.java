package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
public final class mc3 extends ayb {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public mc3(nc3 nc3Var) {
        d(nc3Var);
        this.J = nc3Var.w0;
        this.K = nc3Var.x0;
        this.L = nc3Var.y0;
        this.M = nc3Var.z0;
        this.N = nc3Var.A0;
        this.O = nc3Var.B0;
        this.P = nc3Var.C0;
        SparseArray sparseArray = nc3Var.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = nc3Var.E0.clone();
    }

    @Override
    public final void a(yxb yxbVar) {
        this.H.put(yxbVar.a, yxbVar);
    }

    @Override
    public final byb b() {
        return new nc3(this);
    }

    @Override
    public final ayb c() {
        super.c();
        return this;
    }

    public mc3() {
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
