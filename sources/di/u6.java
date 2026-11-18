package di;

import org.telegram.messenger.x10;
public final class u6 implements x10 {
    public final int f9865a = 1;
    public final x8 f9866b;
    public final int f9867c;
    public final x10 d;
    public final boolean[] f9868e;
    public final x10 f9869f;

    public u6(x8 x8Var, int i7, x10 x10Var, boolean[] zArr, x10 x10Var2) {
        this.f9866b = x8Var;
        this.f9867c = i7;
        this.d = x10Var;
        this.f9868e = zArr;
        this.f9869f = x10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9865a) {
            case 0:
                this.f9868e[0] = true;
                if (this.f9867c > 0) {
                    this.f9866b.Q();
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
                x10 x10Var2 = this.f9869f;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9867c > 0) {
                    this.f9866b.Q();
                }
                x10 x10Var3 = this.d;
                if (x10Var3 != null) {
                    x10Var3.a(Boolean.TRUE);
                }
                this.f9868e[0] = true;
                x10 x10Var4 = this.f9869f;
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
        this.f9866b = x8Var;
        this.f9868e = zArr;
        this.f9867c = i7;
        this.d = x10Var;
        this.f9869f = x10Var2;
    }
}
