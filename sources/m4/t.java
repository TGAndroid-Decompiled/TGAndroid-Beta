package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class t {
    public static final Object f16087b = new Object();
    public static final HashMap f16088c = new HashMap();
    public final a0 f16089a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, ob.a aVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        synchronized (f16087b) {
            HashMap hashMap = f16088c;
            if (!hashMap.containsKey("pip-media-session")) {
                hashMap.put("pip-media-session", this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
        }
        this.f16089a = new a0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, aVar, bundle, bundle2, yVar);
    }

    public final void a(b2.b1 b1Var) {
        boolean z10;
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        a0 a0Var = this.f16089a;
        boolean z11 = false;
        if (y02 == a0Var.f15843t.f15966a.y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (b1Var.y0() == Looper.myLooper()) {
            z11 = true;
        }
        e2.d.g(z11);
        j1 j1Var = a0Var.f15843t;
        if (b1Var == j1Var.f15966a) {
            return;
        }
        a0Var.u(j1Var, new j1(b1Var));
    }
}
