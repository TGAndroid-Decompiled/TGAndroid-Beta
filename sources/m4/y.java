package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.t6;
public class y {
    public static final Object f12993b = new Object();
    public static final HashMap f12994c = new HashMap();
    public final f0 f12995a;

    public y(Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, oa.d dVar, Bundle bundle, Bundle bundle2, e2.d dVar2, boolean z10, boolean z11) {
        synchronized (f12993b) {
            HashMap hashMap = f12994c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f12995a = new f0(this, context, str, f1Var, n0Var, n0Var2, n0Var3, dVar, bundle, bundle2, dVar2, z10, z11);
    }

    public final void a(b2.f1 f1Var) {
        boolean z10;
        f1Var.getClass();
        t6.f(f1Var.O());
        Looper A0 = f1Var.A0();
        f0 f0Var = this.f12995a;
        boolean z11 = false;
        if (A0 == f0Var.f12755t.f12867a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        if (f1Var.A0() == Looper.myLooper()) {
            z11 = true;
        }
        t6.p(z11);
        n1 n1Var = f0Var.f12755t;
        if (f1Var == n1Var.f12867a) {
            return;
        }
        f0Var.u(n1Var, new n1(f1Var));
    }
}
