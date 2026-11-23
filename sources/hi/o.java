package hi;

import org.telegram.messenger.y10;
public final class o implements y10 {
    public final int f15096a;
    public final ja f15097b;

    public o(ja jaVar, int i7) {
        this.f15096a = i7;
        this.f15097b = jaVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f15096a) {
            case 0:
                int intValue = num.intValue();
                ja jaVar = this.f15097b;
                jaVar.setPeriod(intValue);
                y10 y10Var = jaVar.B1;
                if (y10Var != null) {
                    y10Var.a(num);
                    return;
                }
                return;
            default:
                y10 y10Var2 = this.f15097b.C1;
                if (y10Var2 != null) {
                    y10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
