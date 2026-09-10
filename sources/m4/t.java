package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class t {
    public static final Object f13516b = new Object();
    public static final HashMap f13517c = new HashMap();
    public final b0 f13518a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, of.b bVar) {
        synchronized (f13516b) {
            HashMap hashMap = f13517c;
            if (!hashMap.containsKey("pip-media-session")) {
                hashMap.put("pip-media-session", this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
        }
        this.f13518a = new b0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, dVar, bundle, bundle2, bVar);
    }

    public final void a(b2.b1 b1Var) {
        boolean z10;
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        b0 b0Var = this.f13518a;
        boolean z11 = false;
        if (y02 == b0Var.f13307t.f13444a.y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (b1Var.y0() == Looper.myLooper()) {
            z11 = true;
        }
        e2.d.g(z11);
        l1 l1Var = b0Var.f13307t;
        if (b1Var == l1Var.f13444a) {
            return;
        }
        b0Var.u(l1Var, new l1(b1Var));
    }
}
