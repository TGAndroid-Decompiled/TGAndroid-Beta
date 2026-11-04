package bi;

import android.text.TextUtils;
import org.telegram.messenger.u10;
public final class r0 implements u10 {
    public final int f3835a;
    public final a1 f3836b;
    public final String f3837c;

    public r0(a1 a1Var, String str, int i3) {
        this.f3835a = i3;
        this.f3836b = a1Var;
        this.f3837c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f3835a) {
            case 0:
                a1 a1Var = this.f3836b;
                if (TextUtils.equals(a1Var.d, this.f3837c)) {
                    if (a1Var.f3590u0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a1Var.f3590u0 = eVar;
                    if (!a1Var.f3611w0) {
                        if (z10) {
                            a1Var.f3580t0.a(eVar);
                            a1Var.invalidate();
                            return;
                        }
                        a1Var.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.f3836b;
                if (TextUtils.equals(a1Var2.f3435e, this.f3837c)) {
                    a1Var2.f3600v0 = eVar;
                    if (a1Var2.f3611w0 && a1Var2.f3622x0 && a1Var2.B0) {
                        a1Var2.B0 = false;
                        a1Var2.A0 = System.currentTimeMillis() + 60000;
                        a1Var2.B2 = -1;
                    }
                    if (a1Var2.f3611w0) {
                        a1Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
