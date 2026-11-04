package ci;

import org.telegram.messenger.u10;
public final class a7 implements u10 {
    public final int f4828a = 1;
    public final e9 f4829b;
    public final int f4830c;
    public final u10 d;
    public final boolean[] f4831e;
    public final u10 f4832f;

    public a7(e9 e9Var, int i3, u10 u10Var, boolean[] zArr, u10 u10Var2) {
        this.f4829b = e9Var;
        this.f4830c = i3;
        this.d = u10Var;
        this.f4831e = zArr;
        this.f4832f = u10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f4828a) {
            case 0:
                this.f4831e[0] = true;
                if (this.f4830c > 0) {
                    this.f4829b.R();
                }
                u10 u10Var = this.d;
                if (u10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    u10Var.a(str);
                }
                u10 u10Var2 = this.f4832f;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f4830c > 0) {
                    this.f4829b.R();
                }
                u10 u10Var3 = this.d;
                if (u10Var3 != null) {
                    u10Var3.a(Boolean.TRUE);
                }
                this.f4831e[0] = true;
                u10 u10Var4 = this.f4832f;
                if (u10Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    u10Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public a7(e9 e9Var, boolean[] zArr, int i3, u10 u10Var, u10 u10Var2) {
        this.f4829b = e9Var;
        this.f4831e = zArr;
        this.f4830c = i3;
        this.d = u10Var;
        this.f4832f = u10Var2;
    }
}
