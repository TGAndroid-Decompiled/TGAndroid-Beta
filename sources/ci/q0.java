package ci;

import android.text.TextUtils;
import org.telegram.messenger.x10;
public final class q0 implements x10 {
    public final int f5777a;
    public final z0 f5778b;
    public final String f5779c;

    public q0(z0 z0Var, String str, int i7) {
        this.f5777a = i7;
        this.f5778b = z0Var;
        this.f5779c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f5777a) {
            case 0:
                z0 z0Var = this.f5778b;
                if (TextUtils.equals(z0Var.d, this.f5779c)) {
                    if (z0Var.f6073u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.f6073u0 = eVar;
                    if (!z0Var.f6094w0) {
                        if (z10) {
                            z0Var.f6064t0.a(eVar);
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
                z0 z0Var2 = this.f5778b;
                if (TextUtils.equals(z0Var2.f5918e, this.f5779c)) {
                    z0Var2.f6083v0 = eVar;
                    if (z0Var2.f6094w0 && z0Var2.f6105x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.f6094w0) {
                        z0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
