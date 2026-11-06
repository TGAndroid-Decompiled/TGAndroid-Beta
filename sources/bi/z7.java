package bi;

import org.telegram.messenger.c20;
public final class z7 implements c20 {
    public final int f5163a = 1;
    public final ea f5164b;
    public final int f5165c;
    public final c20 d;
    public final boolean[] f5166e;
    public final c20 f5167f;

    public z7(ea eaVar, int i7, c20 c20Var, boolean[] zArr, c20 c20Var2) {
        this.f5164b = eaVar;
        this.f5165c = i7;
        this.d = c20Var;
        this.f5166e = zArr;
        this.f5167f = c20Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f5163a) {
            case 0:
                this.f5166e[0] = true;
                if (this.f5165c > 0) {
                    this.f5164b.R();
                }
                c20 c20Var = this.d;
                if (c20Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    c20Var.a(str);
                }
                c20 c20Var2 = this.f5167f;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f5165c > 0) {
                    this.f5164b.R();
                }
                c20 c20Var3 = this.d;
                if (c20Var3 != null) {
                    c20Var3.a(Boolean.TRUE);
                }
                this.f5166e[0] = true;
                c20 c20Var4 = this.f5167f;
                if (c20Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    c20Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public z7(ea eaVar, boolean[] zArr, int i7, c20 c20Var, c20 c20Var2) {
        this.f5164b = eaVar;
        this.f5166e = zArr;
        this.f5165c = i7;
        this.d = c20Var;
        this.f5167f = c20Var2;
    }
}
