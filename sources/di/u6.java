package di;

import org.telegram.messenger.x10;
public final class u6 implements x10 {
    public final int f9868a = 1;
    public final x8 f9869b;
    public final int f9870c;
    public final x10 d;
    public final boolean[] f9871e;
    public final x10 f9872f;

    public u6(x8 x8Var, int i7, x10 x10Var, boolean[] zArr, x10 x10Var2) {
        this.f9869b = x8Var;
        this.f9870c = i7;
        this.d = x10Var;
        this.f9871e = zArr;
        this.f9872f = x10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9868a) {
            case 0:
                this.f9871e[0] = true;
                if (this.f9870c > 0) {
                    this.f9869b.Q();
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
                x10 x10Var2 = this.f9872f;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9870c > 0) {
                    this.f9869b.Q();
                }
                x10 x10Var3 = this.d;
                if (x10Var3 != null) {
                    x10Var3.a(Boolean.TRUE);
                }
                this.f9871e[0] = true;
                x10 x10Var4 = this.f9872f;
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

    public u6(x8 x8Var, boolean[] zArr, int i7, x10 x10Var, x10 x10Var2) {
        this.f9869b = x8Var;
        this.f9871e = zArr;
        this.f9870c = i7;
        this.d = x10Var;
        this.f9872f = x10Var2;
    }
}
