package defpackage;
public abstract class cse {
    public static final void a(nhc nhcVar, po poVar, a36 a36Var) {
        AutoCloseable autoCloseable;
        poVar.getClass();
        a36Var.getClass();
        ohc ohcVar = nhcVar.a;
        synchronized (ohcVar.a) {
            autoCloseable = (AutoCloseable) ohcVar.b.get("androidx.lifecycle.savedstate.vm.tag");
        }
        pt9 pt9Var = (pt9) autoCloseable;
        if (pt9Var != null && !pt9Var.c) {
            pt9Var.a(poVar, a36Var);
            z26 z26Var = ((k36) a36Var).b;
            if (z26Var != z26.b && z26Var.compareTo(z26.d) < 0) {
                a36Var.a(new bc3(a36Var, poVar, (byte) 1));
            } else {
                poVar.g();
            }
        }
    }
}
