package ci;

import android.text.TextUtils;
import org.telegram.messenger.y10;
public final class q0 implements y10 {
    public final int f5743a;
    public final z0 f5744b;
    public final String f5745c;

    public q0(z0 z0Var, String str, int i7) {
        this.f5743a = i7;
        this.f5744b = z0Var;
        this.f5745c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f5743a) {
            case 0:
                z0 z0Var = this.f5744b;
                if (TextUtils.equals(z0Var.d, this.f5745c)) {
                    if (z0Var.f6039u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.f6039u0 = eVar;
                    if (!z0Var.f6060w0) {
                        if (z10) {
                            z0Var.f6030t0.a(eVar);
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
                z0 z0Var2 = this.f5744b;
                if (TextUtils.equals(z0Var2.f5884e, this.f5745c)) {
                    z0Var2.f6049v0 = eVar;
                    if (z0Var2.f6060w0 && z0Var2.f6071x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.f6060w0) {
                        z0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
