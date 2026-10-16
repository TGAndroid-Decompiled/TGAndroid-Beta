package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.u6;
public class x {
    public static final Object f15409b = new Object();
    public static final HashMap f15410c = new HashMap();
    public final e0 f15411a;

    public x(Context context, String str, b2.g1 g1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (f15409b) {
            HashMap hashMap = f15410c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f15411a = new e0(this, context, str, g1Var, n0Var, n0Var2, n0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.g1 g1Var) {
        boolean z10;
        g1Var.getClass();
        u6.g(g1Var.P());
        Looper A0 = g1Var.A0();
        e0 e0Var = this.f15411a;
        boolean z11 = false;
        if (A0 == e0Var.f15170t.f15283a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (g1Var.A0() == Looper.myLooper()) {
            z11 = true;
        }
        u6.p(z11);
        m1 m1Var = e0Var.f15170t;
        if (g1Var == m1Var.f15283a) {
            return;
        }
        e0Var.u(m1Var, new m1(g1Var));
    }
}
