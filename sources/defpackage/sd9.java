package defpackage;
public final class sd9 extends b4 {
    public final boolean m(x76 x76Var) {
        v3 v3Var;
        Object obj = this.a;
        if (obj == null) {
            if (x76Var.isDone()) {
                if (b4.f.b(this, null, b4.h(x76Var))) {
                    b4.e(this);
                    return true;
                }
                return false;
            }
            y3 y3Var = new y3(this, x76Var);
            if (b4.f.b(this, null, y3Var)) {
                try {
                    x76Var.b(y3Var, oo3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        v3Var = new v3(th);
                    } catch (Throwable unused) {
                        v3Var = v3.b;
                    }
                    b4.f.b(this, y3Var, v3Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof u3) {
            x76Var.cancel(((u3) obj).a);
        }
        return false;
    }
}
