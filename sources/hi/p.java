package hi;

import org.telegram.messenger.x10;
public final class p implements x10 {
    public final int f15206a;
    public final ja f15207b;

    public p(ja jaVar, int i7) {
        this.f15206a = i7;
        this.f15207b = jaVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f15206a) {
            case 0:
                int intValue = num.intValue();
                ja jaVar = this.f15207b;
                jaVar.setPeriod(intValue);
                x10 x10Var = jaVar.B1;
                if (x10Var != null) {
                    x10Var.a(num);
                    return;
                }
                return;
            default:
                x10 x10Var2 = this.f15207b.C1;
                if (x10Var2 != null) {
                    x10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
