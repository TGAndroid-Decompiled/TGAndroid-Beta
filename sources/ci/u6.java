package ci;

import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
public final class u6 implements n10 {
    public final int f6106a = 0;
    public final boolean[] f6107b;
    public final n10 f6108c;
    public final u10 d;

    public u6(u10 u10Var, boolean[] zArr, n10 n10Var) {
        this.d = u10Var;
        this.f6107b = zArr;
        this.f6108c = n10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f6106a) {
            case 0:
                u10 u10Var = this.d;
                if (u10Var != null) {
                    u10Var.a(Boolean.TRUE);
                }
                this.f6107b[0] = true;
                n10 n10Var = this.f6108c;
                if (n10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    n10Var.a(str, l10);
                    return;
                }
                return;
            default:
                this.f6107b[0] = true;
                n10 n10Var2 = this.f6108c;
                if (n10Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    n10Var2.a(str2, l10);
                }
                u10 u10Var2 = this.d;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public u6(boolean[] zArr, n10 n10Var, u10 u10Var) {
        this.f6107b = zArr;
        this.f6108c = n10Var;
        this.d = u10Var;
    }
}
