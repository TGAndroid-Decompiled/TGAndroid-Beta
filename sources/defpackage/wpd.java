package defpackage;
public abstract class wpd {
    public boolean a(b4 b4Var, w3 w3Var, w3 w3Var2) {
        synchronized (b4Var) {
            if (b4Var.b == w3Var) {
                b4Var.b = w3Var2;
                return true;
            }
            return false;
        }
    }

    public boolean b(b4 b4Var, Object obj, Object obj2) {
        synchronized (b4Var) {
            if (b4Var.a == obj) {
                b4Var.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean c(b4 b4Var, a4 a4Var, a4 a4Var2) {
        synchronized (b4Var) {
            if (b4Var.c == a4Var) {
                b4Var.c = a4Var2;
                return true;
            }
            return false;
        }
    }

    public void d(a4 a4Var, a4 a4Var2) {
        a4Var.b = a4Var2;
    }

    public void e(a4 a4Var, Thread thread) {
        a4Var.a = thread;
    }
}
