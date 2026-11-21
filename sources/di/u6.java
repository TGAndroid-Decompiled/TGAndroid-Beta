package di;

import org.telegram.messenger.x10;
public final class u6 implements x10 {
    public final int f9896a = 1;
    public final y8 f9897b;
    public final int f9898c;
    public final x10 d;
    public final boolean[] f9899e;
    public final x10 f9900f;

    public u6(y8 y8Var, int i7, x10 x10Var, boolean[] zArr, x10 x10Var2) {
        this.f9897b = y8Var;
        this.f9898c = i7;
        this.d = x10Var;
        this.f9899e = zArr;
        this.f9900f = x10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9896a) {
            case 0:
                this.f9899e[0] = true;
                if (this.f9898c > 0) {
                    this.f9897b.Q();
                }
                x10 x10Var = this.d;
                if (x10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    x10Var.a(str);
                }
                x10 x10Var2 = this.f9900f;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9898c > 0) {
                    this.f9897b.Q();
                }
                x10 x10Var3 = this.d;
                if (x10Var3 != null) {
                    x10Var3.a(Boolean.TRUE);
                }
                this.f9899e[0] = true;
                x10 x10Var4 = this.f9900f;
                if (x10Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    x10Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public u6(y8 y8Var, boolean[] zArr, int i7, x10 x10Var, x10 x10Var2) {
        this.f9897b = y8Var;
        this.f9899e = zArr;
        this.f9898c = i7;
        this.d = x10Var;
        this.f9900f = x10Var2;
    }
}
