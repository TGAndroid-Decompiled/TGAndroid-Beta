package ci;

import android.text.TextUtils;
import org.telegram.messenger.x10;
public final class q0 implements x10 {
    public final int f5748a;
    public final z0 f5749b;
    public final String f5750c;

    public q0(z0 z0Var, String str, int i7) {
        this.f5748a = i7;
        this.f5749b = z0Var;
        this.f5750c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f5748a) {
            case 0:
                z0 z0Var = this.f5749b;
                if (TextUtils.equals(z0Var.d, this.f5750c)) {
                    if (z0Var.f6044u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.f6044u0 = eVar;
                    if (!z0Var.f6065w0) {
                        if (z10) {
                            z0Var.f6035t0.a(eVar);
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
                z0 z0Var2 = this.f5749b;
                if (TextUtils.equals(z0Var2.f5889e, this.f5750c)) {
                    z0Var2.f6054v0 = eVar;
                    if (z0Var2.f6065w0 && z0Var2.f6076x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.f6065w0) {
                        z0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
