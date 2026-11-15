package di;

import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
public final class l6 implements s10 {
    public final int f8979a = 0;
    public final boolean[] f8980b;
    public final s10 f8981c;
    public final z10 d;

    public l6(z10 z10Var, boolean[] zArr, s10 s10Var) {
        this.d = z10Var;
        this.f8980b = zArr;
        this.f8981c = s10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f8979a) {
            case 0:
                z10 z10Var = this.d;
                if (z10Var != null) {
                    z10Var.a(Boolean.TRUE);
                }
                this.f8980b[0] = true;
                s10 s10Var = this.f8981c;
                if (s10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    s10Var.a(str, l10);
                    return;
                }
                return;
            default:
                this.f8980b[0] = true;
                s10 s10Var2 = this.f8981c;
                if (s10Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    s10Var2.a(str2, l10);
                }
                z10 z10Var2 = this.d;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, s10 s10Var, z10 z10Var) {
        this.f8980b = zArr;
        this.f8981c = s10Var;
        this.d = z10Var;
    }
}
