package b5;

import d5.f0;
import h3.i2;
import h3.t2;
public final class a0 {
    public final int f1425a;
    public final i2[] f1426b;
    public final t[] f1427c;
    public final t2 d;
    public final Object f1428e;

    public a0(i2[] i2VarArr, t[] tVarArr, t2 t2Var, v vVar) {
        this.f1426b = i2VarArr;
        this.f1427c = (t[]) tVarArr.clone();
        this.d = t2Var;
        this.f1428e = vVar;
        this.f1425a = i2VarArr.length;
    }

    public final boolean a(a0 a0Var, int i9) {
        if (a0Var == null || !f0.a(this.f1426b[i9], a0Var.f1426b[i9]) || !f0.a(this.f1427c[i9], a0Var.f1427c[i9])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i9) {
        if (this.f1426b[i9] != null) {
            return true;
        }
        return false;
    }
}
