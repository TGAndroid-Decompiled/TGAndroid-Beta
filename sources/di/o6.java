package di;

import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
public final class o6 implements p10 {
    public final int f9441a = 0;
    public final boolean[] f9442b;
    public final p10 f9443c;
    public final w10 d;

    public o6(w10 w10Var, boolean[] zArr, p10 p10Var) {
        this.d = w10Var;
        this.f9442b = zArr;
        this.f9443c = p10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f9441a) {
            case 0:
                w10 w10Var = this.d;
                if (w10Var != null) {
                    w10Var.a(Boolean.TRUE);
                }
                this.f9442b[0] = true;
                p10 p10Var = this.f9443c;
                if (p10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    p10Var.a(str, l10);
                    return;
                }
                return;
            default:
                this.f9442b[0] = true;
                p10 p10Var2 = this.f9443c;
                if (p10Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    p10Var2.a(str2, l10);
                }
                w10 w10Var2 = this.d;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public o6(boolean[] zArr, p10 p10Var, w10 w10Var) {
        this.f9442b = zArr;
        this.f9443c = p10Var;
        this.d = w10Var;
    }
}
