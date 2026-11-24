package defpackage;
public abstract class hnd {
    public boolean a(a4 a4Var, v3 v3Var, v3 v3Var2) {
        synchronized (a4Var) {
            if (a4Var.b == v3Var) {
                a4Var.b = v3Var2;
                return true;
            }
            return false;
        }
    }

    public boolean b(a4 a4Var, Object obj, Object obj2) {
        synchronized (a4Var) {
            if (a4Var.a == obj) {
                a4Var.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean c(a4 a4Var, z3 z3Var, z3 z3Var2) {
        synchronized (a4Var) {
            if (a4Var.c == z3Var) {
                a4Var.c = z3Var2;
                return true;
            }
            return false;
        }
    }

    public void d(z3 z3Var, z3 z3Var2) {
        z3Var.b = z3Var2;
    }

    public void e(z3 z3Var, Thread thread) {
        z3Var.a = thread;
    }
}
