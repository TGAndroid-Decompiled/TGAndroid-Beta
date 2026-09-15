package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class t {
    public static final Object f14697b = new Object();
    public static final HashMap f14698c = new HashMap();
    public final a0 f14699a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        synchronized (f14697b) {
            HashMap hashMap = f14698c;
            if (!hashMap.containsKey("pip-media-session")) {
                hashMap.put("pip-media-session", this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
        }
        this.f14699a = new a0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, dVar, bundle, bundle2, yVar);
    }

    public final void a(b2.b1 b1Var) {
        boolean z10;
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        a0 a0Var = this.f14699a;
        boolean z11 = false;
        if (y02 == a0Var.f14466t.f14588a.y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (b1Var.y0() == Looper.myLooper()) {
            z11 = true;
        }
        e2.d.g(z11);
        k1 k1Var = a0Var.f14466t;
        if (b1Var == k1Var.f14588a) {
            return;
        }
        a0Var.u(k1Var, new k1(b1Var));
    }
}
