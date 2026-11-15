package di;

import org.telegram.messenger.z10;
public final class r6 implements z10 {
    public final int f9337a = 1;
    public final v8 f9338b;
    public final int f9339c;
    public final z10 d;
    public final boolean[] f9340e;
    public final z10 f9341f;

    public r6(v8 v8Var, int i7, z10 z10Var, boolean[] zArr, z10 z10Var2) {
        this.f9338b = v8Var;
        this.f9339c = i7;
        this.d = z10Var;
        this.f9340e = zArr;
        this.f9341f = z10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9337a) {
            case 0:
                this.f9340e[0] = true;
                if (this.f9339c > 0) {
                    this.f9338b.R();
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
                z10 z10Var2 = this.f9341f;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9339c > 0) {
                    this.f9338b.R();
                }
                z10 z10Var3 = this.d;
                if (z10Var3 != null) {
                    z10Var3.a(Boolean.TRUE);
                }
                this.f9340e[0] = true;
                z10 z10Var4 = this.f9341f;
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

    public r6(v8 v8Var, boolean[] zArr, int i7, z10 z10Var, z10 z10Var2) {
        this.f9338b = v8Var;
        this.f9340e = zArr;
        this.f9339c = i7;
        this.d = z10Var;
        this.f9341f = z10Var2;
    }
}
