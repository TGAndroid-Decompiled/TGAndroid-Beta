package hi;

import org.telegram.messenger.y10;
public final class q implements y10 {
    public final int f15287a;
    public final ia f15288b;

    public q(ia iaVar, int i7) {
        this.f15287a = i7;
        this.f15288b = iaVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f15287a) {
            case 0:
                int intValue = num.intValue();
                ia iaVar = this.f15288b;
                iaVar.setPeriod(intValue);
                y10 y10Var = iaVar.B1;
                if (y10Var != null) {
                    y10Var.a(num);
                    return;
                }
                return;
            default:
                y10 y10Var2 = this.f15288b.C1;
                if (y10Var2 != null) {
                    y10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
