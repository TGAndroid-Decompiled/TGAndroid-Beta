package di;

import org.telegram.messenger.w10;
public final class u6 implements w10 {
    public final int f9860a = 1;
    public final y8 f9861b;
    public final int f9862c;
    public final w10 d;
    public final boolean[] f9863e;
    public final w10 f9864f;

    public u6(y8 y8Var, int i7, w10 w10Var, boolean[] zArr, w10 w10Var2) {
        this.f9861b = y8Var;
        this.f9862c = i7;
        this.d = w10Var;
        this.f9863e = zArr;
        this.f9864f = w10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9860a) {
            case 0:
                this.f9863e[0] = true;
                if (this.f9862c > 0) {
                    this.f9861b.Q();
                }
                w10 w10Var = this.d;
                if (w10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    w10Var.a(str);
                }
                w10 w10Var2 = this.f9864f;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9862c > 0) {
                    this.f9861b.Q();
                }
                w10 w10Var3 = this.d;
                if (w10Var3 != null) {
                    w10Var3.a(Boolean.TRUE);
                }
                this.f9863e[0] = true;
                w10 w10Var4 = this.f9864f;
                if (w10Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    w10Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public u6(y8 y8Var, boolean[] zArr, int i7, w10 w10Var, w10 w10Var2) {
        this.f9861b = y8Var;
        this.f9863e = zArr;
        this.f9862c = i7;
        this.d = w10Var;
        this.f9864f = w10Var2;
    }
}
