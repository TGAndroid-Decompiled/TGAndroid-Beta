package defpackage;
public final class ec9 extends a4 {
    public final boolean m(t76 t76Var) {
        u3 u3Var;
        Object obj = this.a;
        if (obj == null) {
            if (t76Var.isDone()) {
                if (a4.f.b(this, null, a4.h(t76Var))) {
                    a4.e(this);
                    return true;
                }
                return false;
            }
            x3 x3Var = new x3(this, t76Var);
            if (a4.f.b(this, null, x3Var)) {
                try {
                    t76Var.b(x3Var, hp3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        u3Var = new u3(th);
                    } catch (Throwable unused) {
                        u3Var = u3.b;
                    }
                    a4.f.b(this, x3Var, u3Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof t3) {
            t76Var.cancel(((t3) obj).a);
        }
        return false;
    }
}
