package m4;

import a8.yb;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
public class y {
    public static final Object f18298b = new Object();
    public static final HashMap f18299c = new HashMap();
    public final f0 f18300a;

    public y(Context context, String str, b2.g1 g1Var, f9.i0 i0Var, f9.i0 i0Var2, f9.i0 i0Var3, qb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (f18298b) {
            HashMap hashMap = f18299c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f18300a = new f0(this, context, str, g1Var, i0Var, i0Var2, i0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.g1 g1Var) {
        boolean z10;
        g1Var.getClass();
        yb.g(g1Var.P());
        Looper A0 = g1Var.A0();
        f0 f0Var = this.f18300a;
        boolean z11 = false;
        if (A0 == f0Var.f18056t.f18168a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        if (g1Var.A0() == Looper.myLooper()) {
            z11 = true;
        }
        yb.p(z11);
        n1 n1Var = f0Var.f18056t;
        if (g1Var == n1Var.f18168a) {
            return;
        }
        f0Var.u(n1Var, new n1(g1Var));
    }
}
