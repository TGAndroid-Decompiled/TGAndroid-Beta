package gi;

import org.telegram.messenger.u10;
public final class o implements u10 {
    public final int f13318a;
    public final la f13319b;

    public o(la laVar, int i3) {
        this.f13318a = i3;
        this.f13319b = laVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f13318a) {
            case 0:
                int intValue = num.intValue();
                la laVar = this.f13319b;
                laVar.setPeriod(intValue);
                u10 u10Var = laVar.B1;
                if (u10Var != null) {
                    u10Var.a(num);
                    return;
                }
                return;
            default:
                u10 u10Var2 = this.f13319b.C1;
                if (u10Var2 != null) {
                    u10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
