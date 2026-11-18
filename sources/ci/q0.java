package ci;

import android.text.TextUtils;
import org.telegram.messenger.x10;
public final class q0 implements x10 {
    public final int f5751a;
    public final z0 f5752b;
    public final String f5753c;

    public q0(z0 z0Var, String str, int i7) {
        this.f5751a = i7;
        this.f5752b = z0Var;
        this.f5753c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f5751a) {
            case 0:
                z0 z0Var = this.f5752b;
                if (TextUtils.equals(z0Var.d, this.f5753c)) {
                    if (z0Var.f6047u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.f6047u0 = eVar;
                    if (!z0Var.f6068w0) {
                        if (z10) {
                            z0Var.f6038t0.a(eVar);
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
                z0 z0Var2 = this.f5752b;
                if (TextUtils.equals(z0Var2.f5892e, this.f5753c)) {
                    z0Var2.f6057v0 = eVar;
                    if (z0Var2.f6068w0 && z0Var2.f6079x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.f6068w0) {
                        z0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
