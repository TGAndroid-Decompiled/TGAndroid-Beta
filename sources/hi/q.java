package hi;

import org.telegram.messenger.x10;
public final class q implements x10 {
    public final int f15284a;
    public final ia f15285b;

    public q(ia iaVar, int i7) {
        this.f15284a = i7;
        this.f15285b = iaVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f15284a) {
            case 0:
                int intValue = num.intValue();
                ia iaVar = this.f15285b;
                iaVar.setPeriod(intValue);
                x10 x10Var = iaVar.B1;
                if (x10Var != null) {
                    x10Var.a(num);
                    return;
                }
                return;
            default:
                x10 x10Var2 = this.f15285b.C1;
                if (x10Var2 != null) {
                    x10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
