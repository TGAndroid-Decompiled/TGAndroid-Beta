package di;

import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
public final class o6 implements q10 {
    public final int f9451a = 0;
    public final boolean[] f9452b;
    public final q10 f9453c;
    public final x10 d;

    public o6(x10 x10Var, boolean[] zArr, q10 q10Var) {
        this.d = x10Var;
        this.f9452b = zArr;
        this.f9453c = q10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f9451a) {
            case 0:
                x10 x10Var = this.d;
                if (x10Var != null) {
                    x10Var.a(Boolean.TRUE);
                }
                this.f9452b[0] = true;
                q10 q10Var = this.f9453c;
                if (q10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    q10Var.a(str, l10);
                    return;
                }
                return;
            default:
                this.f9452b[0] = true;
                q10 q10Var2 = this.f9453c;
                if (q10Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    q10Var2.a(str2, l10);
                }
                x10 x10Var2 = this.d;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public o6(boolean[] zArr, q10 q10Var, x10 x10Var) {
        this.f9452b = zArr;
        this.f9453c = q10Var;
        this.d = x10Var;
    }
}
