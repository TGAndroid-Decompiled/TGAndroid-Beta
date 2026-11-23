package di;

import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
public final class o6 implements r10 {
    public final int f9480a = 0;
    public final boolean[] f9481b;
    public final r10 f9482c;
    public final y10 d;

    public o6(y10 y10Var, boolean[] zArr, r10 r10Var) {
        this.d = y10Var;
        this.f9481b = zArr;
        this.f9482c = r10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f9480a) {
            case 0:
                y10 y10Var = this.d;
                if (y10Var != null) {
                    y10Var.a(Boolean.TRUE);
                }
                this.f9481b[0] = true;
                r10 r10Var = this.f9482c;
                if (r10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    r10Var.a(str, l10);
                    return;
                }
                return;
            default:
                this.f9481b[0] = true;
                r10 r10Var2 = this.f9482c;
                if (r10Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    r10Var2.a(str2, l10);
                }
                y10 y10Var2 = this.d;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public o6(boolean[] zArr, r10 r10Var, y10 y10Var) {
        this.f9481b = zArr;
        this.f9482c = r10Var;
        this.d = y10Var;
    }
}
