package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
public final class t7 implements v10 {
    public final int f4749a = 0;
    public final boolean[] f4750b;
    public final v10 f4751c;
    public final c20 d;

    public t7(c20 c20Var, boolean[] zArr, v10 v10Var) {
        this.d = c20Var;
        this.f4750b = zArr;
        this.f4751c = v10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f4749a) {
            case 0:
                c20 c20Var = this.d;
                if (c20Var != null) {
                    c20Var.a(Boolean.TRUE);
                }
                this.f4750b[0] = true;
                v10 v10Var = this.f4751c;
                if (v10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    v10Var.a(str, l10);
                    return;
                }
                return;
            default:
                this.f4750b[0] = true;
                v10 v10Var2 = this.f4751c;
                if (v10Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    v10Var2.a(str2, l10);
                }
                c20 c20Var2 = this.d;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public t7(boolean[] zArr, v10 v10Var, c20 c20Var) {
        this.f4750b = zArr;
        this.f4751c = v10Var;
        this.d = c20Var;
    }
}
