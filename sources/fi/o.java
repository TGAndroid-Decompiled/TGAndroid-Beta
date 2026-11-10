package fi;

import org.telegram.messenger.c20;
public final class o implements c20 {
    public final int f12507a;
    public final la f12508b;

    public o(la laVar, int i7) {
        this.f12507a = i7;
        this.f12508b = laVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f12507a) {
            case 0:
                int intValue = num.intValue();
                la laVar = this.f12508b;
                laVar.setPeriod(intValue);
                c20 c20Var = laVar.A1;
                if (c20Var != null) {
                    c20Var.a(num);
                    return;
                }
                return;
            default:
                c20 c20Var2 = this.f12508b.B1;
                if (c20Var2 != null) {
                    c20Var2.a(num);
                    return;
                }
                return;
        }
    }
}
