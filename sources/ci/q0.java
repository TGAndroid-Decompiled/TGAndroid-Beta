package ci;

import android.text.TextUtils;
import org.telegram.messenger.z10;
public final class q0 implements z10 {
    public final int f5466a;
    public final z0 f5467b;
    public final String f5468c;

    public q0(z0 z0Var, String str, int i7) {
        this.f5466a = i7;
        this.f5467b = z0Var;
        this.f5468c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f5466a) {
            case 0:
                z0 z0Var = this.f5467b;
                if (TextUtils.equals(z0Var.d, this.f5468c)) {
                    if (z0Var.f5761u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.f5761u0 = eVar;
                    if (!z0Var.f5782w0) {
                        if (z10) {
                            z0Var.f5752t0.a(eVar);
                            z0Var.invalidate();
                            return;
                        }
                        z0Var.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                z0 z0Var2 = this.f5467b;
                if (TextUtils.equals(z0Var2.f5606e, this.f5468c)) {
                    z0Var2.f5771v0 = eVar;
                    if (z0Var2.f5782w0 && z0Var2.f5793x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.f5782w0) {
                        z0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
