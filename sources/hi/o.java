package hi;

import org.telegram.messenger.z10;
public final class o implements z10 {
    public final int f14788a;
    public final ia f14789b;

    public o(ia iaVar, int i7) {
        this.f14788a = i7;
        this.f14789b = iaVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f14788a) {
            case 0:
                int intValue = num.intValue();
                ia iaVar = this.f14789b;
                iaVar.setPeriod(intValue);
                z10 z10Var = iaVar.B1;
                if (z10Var != null) {
                    z10Var.a(num);
                    return;
                }
                return;
            default:
                z10 z10Var2 = this.f14789b.C1;
                if (z10Var2 != null) {
                    z10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
