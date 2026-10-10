package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class t {
    public static final Object f16231b = new Object();
    public static final HashMap f16232c = new HashMap();
    public final b0 f16233a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, pf.b bVar) {
        synchronized (f16231b) {
            HashMap hashMap = f16232c;
            if (!hashMap.containsKey("pip-media-session")) {
                hashMap.put("pip-media-session", this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
        }
        this.f16233a = new b0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, dVar, bundle, bundle2, bVar);
    }

    public final void a(b2.b1 b1Var) {
        boolean z10;
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        b0 b0Var = this.f16233a;
        boolean z11 = false;
        if (y02 == b0Var.f16001t.f16083a.y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (b1Var.y0() == Looper.myLooper()) {
            z11 = true;
        }
        e2.d.g(z11);
        f1 f1Var = b0Var.f16001t;
        if (b1Var == f1Var.f16083a) {
            return;
        }
        b0Var.u(f1Var, new f1(b1Var));
    }
}
