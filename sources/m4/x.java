package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.u6;
public class x {
    public static final Object f16769b = new Object();
    public static final HashMap f16770c = new HashMap();
    public final f0 f16771a;

    public x(Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (f16769b) {
            HashMap hashMap = f16770c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f16771a = new f0(this, context, str, f1Var, n0Var, n0Var2, n0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.f1 f1Var) {
        boolean z10;
        f1Var.getClass();
        u6.g(f1Var.P());
        Looper A0 = f1Var.A0();
        f0 f0Var = this.f16771a;
        boolean z11 = false;
        if (A0 == f0Var.f16535t.f16642a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (f1Var.A0() == Looper.myLooper()) {
            z11 = true;
        }
        u6.p(z11);
        m1 m1Var = f0Var.f16535t;
        if (f1Var == m1Var.f16642a) {
            return;
        }
        f0Var.u(m1Var, new m1(f1Var));
    }
}
