package ci;

import android.text.TextUtils;
import org.telegram.messenger.y10;
public final class q0 implements y10 {
    public final int f5780a;
    public final z0 f5781b;
    public final String f5782c;

    public q0(z0 z0Var, String str, int i7) {
        this.f5780a = i7;
        this.f5781b = z0Var;
        this.f5782c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f5780a) {
            case 0:
                z0 z0Var = this.f5781b;
                if (TextUtils.equals(z0Var.d, this.f5782c)) {
                    if (z0Var.f6076u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.f6076u0 = eVar;
                    if (!z0Var.f6097w0) {
                        if (z10) {
                            z0Var.f6067t0.a(eVar);
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
                z0 z0Var2 = this.f5781b;
                if (TextUtils.equals(z0Var2.f5921e, this.f5782c)) {
                    z0Var2.f6086v0 = eVar;
                    if (z0Var2.f6097w0 && z0Var2.f6108x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.f6097w0) {
                        z0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
