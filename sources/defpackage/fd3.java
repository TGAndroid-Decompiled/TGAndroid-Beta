package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
public final class fd3 extends b2c {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public fd3(gd3 gd3Var) {
        d(gd3Var);
        this.J = gd3Var.w0;
        this.K = gd3Var.x0;
        this.L = gd3Var.y0;
        this.M = gd3Var.z0;
        this.N = gd3Var.A0;
        this.O = gd3Var.B0;
        this.P = gd3Var.C0;
        SparseArray sparseArray = gd3Var.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = gd3Var.E0.clone();
    }

    @Override
    public final void a(z1c z1cVar) {
        this.H.put(z1cVar.a, z1cVar);
    }

    @Override
    public final c2c b() {
        return new gd3(this);
    }

    @Override
    public final b2c c() {
        super.c();
        return this;
    }

    public fd3() {
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
