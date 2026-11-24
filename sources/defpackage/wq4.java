package defpackage;

import android.util.Log;
public abstract class wq4 {
    public static final vq4 a = vq4.a;

    public static vq4 a(dp4 dp4Var) {
        while (dp4Var != null) {
            if (dp4Var.t()) {
                dp4Var.p();
            }
            dp4Var = dp4Var.N;
        }
        return a;
    }

    public static void b(mq4 mq4Var) {
        if (hq4.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(mq4Var.a.getClass().getName()), mq4Var);
        }
    }

    public static final void c(dp4 dp4Var, String str) {
        str.getClass();
        b(new mq4(dp4Var, "Attempting to reuse fragment " + dp4Var + " with previous ID " + str));
        a(dp4Var).getClass();
    }
}
