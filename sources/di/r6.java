package di;

import org.telegram.messenger.z10;
public final class r6 implements z10 {
    public final int f9327a = 1;
    public final u8 f9328b;
    public final int f9329c;
    public final z10 d;
    public final boolean[] f9330e;
    public final z10 f9331f;

    public r6(u8 u8Var, int i7, z10 z10Var, boolean[] zArr, z10 z10Var2) {
        this.f9328b = u8Var;
        this.f9329c = i7;
        this.d = z10Var;
        this.f9330e = zArr;
        this.f9331f = z10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9327a) {
            case 0:
                this.f9330e[0] = true;
                if (this.f9329c > 0) {
                    this.f9328b.R();
                }
                z10 z10Var = this.d;
                if (z10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    z10Var.a(str);
                }
                z10 z10Var2 = this.f9331f;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9329c > 0) {
                    this.f9328b.R();
                }
                z10 z10Var3 = this.d;
                if (z10Var3 != null) {
                    z10Var3.a(Boolean.TRUE);
                }
                this.f9330e[0] = true;
                z10 z10Var4 = this.f9331f;
                if (z10Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    z10Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public r6(u8 u8Var, boolean[] zArr, int i7, z10 z10Var, z10 z10Var2) {
        this.f9328b = u8Var;
        this.f9330e = zArr;
        this.f9329c = i7;
        this.d = z10Var;
        this.f9331f = z10Var2;
    }
}
